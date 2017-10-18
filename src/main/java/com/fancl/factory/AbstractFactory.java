package com.fancl.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 * <p>
 * Abstract Factory Pattern
 */
public class AbstractFactory {

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("请输入你的操作系统：");
        try {
            IControllerFactory factory;
            String type = bufferedReader.readLine();
            if ("windows".equalsIgnoreCase(type)) {
                factory = new WindowsControllerFactory();
            } else if ("android".equalsIgnoreCase(type)) {
                factory = new AndroidControllerFactory();
            } else
                factory = new DefaultControllerFactory() {
                };

            factory.createInterfaceController().control("interface controller test");
            factory.createOperationController().control("operation controller test");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
            }

        }
    }

    interface IOperationController {
        void control(String operation);
    }

    interface IInterfaceController {
        void control(String command);
    }

    /**
     * 抽象工厂用于生产一组产品，但是当产品线发生新增或删除，整体的调整可能会产生致命性的影响，
     * 所以使用此类模式必须确保整体不变，对系统的扩展性有不小的影响
     */
    interface IControllerFactory {
        IOperationController createOperationController();

        IInterfaceController createInterfaceController();
    }

    /**
     * 所有的工厂最好都继承自这个默认工厂，当上层工厂接口发生变化时，可以由这个默认工厂首先承受改变
     */
    static abstract class DefaultControllerFactory implements IControllerFactory {
        @Override
        public IOperationController createOperationController() {
            return new IOperationController() {
                @Override
                public void control(String operation) {
                    System.out.println("default:" + operation);
                }
            };
        }

        @Override
        public IInterfaceController createInterfaceController() {
            return new IInterfaceController() {
                @Override
                public void control(String command) {
                    System.out.println("default:" + command);
                }
            };
        }
    }

    /**
     * 这里重写默认方法，适配windows
     */
    static class WindowsControllerFactory extends DefaultControllerFactory {
        @Override
        public IInterfaceController createInterfaceController() {
            return new WindowsInterfaceController();
        }

        @Override
        public IOperationController createOperationController() {
            return new WindowsOperationController();
        }
    }

    static class WindowsOperationController implements IOperationController {

        @Override
        public void control(String operation) {
            System.out.println("windows:" + operation);
        }
    }

    static class WindowsInterfaceController implements IInterfaceController {

        @Override
        public void control(String command) {
            System.out.println("windows:" + command);
        }
    }

    /**
     * 这里重写默认方法，适配Android
     */
    static class AndroidControllerFactory extends DefaultControllerFactory {
        @Override
        public IInterfaceController createInterfaceController() {
            return new AndroidInterfaceController();
        }

        @Override
        public IOperationController createOperationController() {
            return new AndroidOperationController();
        }
    }

    static class AndroidOperationController implements IOperationController {

        @Override
        public void control(String operation) {
            System.out.println("android:" + operation);
        }
    }

    static class AndroidInterfaceController implements IInterfaceController {

        @Override
        public void control(String command) {
            System.out.println("android:" + command);
        }
    }
}
