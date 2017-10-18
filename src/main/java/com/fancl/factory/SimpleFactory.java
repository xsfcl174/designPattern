package com.fancl.factory;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者 fanchengliang
 * 日期 2017/10/17
 * 项目 design-pattern
 *
 * Simple Factory Pattern
 */
public class SimpleFactory {
    public static void main(String[] args) {
        String str = "hello world";
        int index = 998;
        Date date = new Date();
        //输出文本
        IDisplay display = DisplayFactory.createDisplay("String");
        print(display, str);
        //输出数字
        display = DisplayFactory.createDisplay("int");
        print(display, index);
        //输出日期
        display = DisplayFactory.createDisplay("Date");
        print(display, date);
        //不支持的类型
        display = DisplayFactory.createDisplay("double");
        print(display, date);
    }

    private static void print(IDisplay<Object> display, Object value) {
        System.out.println(display + ":" + display.display(value));
    }


    interface IDisplay<T> {
        String display(T value);
    }

    static class DisplayFactory {
        static IDisplay<?> createDisplay(String type) {
            if ("String".equalsIgnoreCase(type)) {
                return new StringDisplay();
            } else if ("int".equalsIgnoreCase(type)) {
                return new NumberDisplay();
            } else if ("Date".equalsIgnoreCase(type)) {
                return new DateDisplay();
            } else
                throw new NotSupportDisplayException(type);
        }
    }

    static class NotSupportDisplayException extends RuntimeException {

        public NotSupportDisplayException(String typeName) {
            super(String.format("不支持类型为【%s】的display", typeName));
        }
    }

    private static final class StringDisplay implements IDisplay<String> {

        public String display(String value) {
            return value == null ? "" : value;
        }

        @Override
        public String toString() {
            return "StringDisplay";
        }
    }

    private static final class DateDisplay implements IDisplay<Date> {

        public String display(Date value) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return value == null ? "" : format.format(value);
        }

        @Override
        public String toString() {
            return "DateDisplay";
        }
    }

    private static final class NumberDisplay implements IDisplay<Number> {

        public String display(Number value) {
            NumberFormat nFormat = NumberFormat.getNumberInstance();
            nFormat.setMinimumIntegerDigits(3);//设置整数部分至少为3位
            nFormat.setMaximumFractionDigits(5);//设置小数点后面尾数为5

            return value == null ? "" : nFormat.format(value);
        }

        @Override
        public String toString() {
            return "NumberDisplay";
        }
    }
}
