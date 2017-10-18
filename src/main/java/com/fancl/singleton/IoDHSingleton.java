package com.fancl.singleton;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 */
public class IoDHSingleton {
    private IoDHSingleton() {
        System.out.println("IoDHSingleton初始化");
    }

    public static void main(String[] args) {
        IoDHSingleton a;
        System.out.println("未初始化");
        IoDHSingleton.getInstance().print();
    }

    public static IoDHSingleton getInstance() {
        return SingletonObject.instance;
    }

    void print() {
        System.out.println("IoDHSingleton");
    }

    private static class SingletonObject {
        public static IoDHSingleton instance = new IoDHSingleton();

        static {
            System.out.println("SingletonObject被使用");
        }
    }

}
