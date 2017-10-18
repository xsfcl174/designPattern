package com.fancl.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 * <p>
 * Factory Method Pattern
 */
public class FactoryMethod {
    private static Map<String, IPictureFactory> factoryMap = new HashMap<String, IPictureFactory>();

    static {
        regFactory(new GifPictureFactory());
        regFactory(new CommonPictureFactory());

    }

    public static void regFactory(IPictureFactory factory) {
        String[] supportType = factory.getSupportType();
        if (supportType != null) {
            StringBuilder errorMsg = new StringBuilder();
            for (String sType : supportType) {
                if (sType == null || sType.trim().length() == 0) continue;
                sType = sType.toLowerCase();
                if (factoryMap.containsKey(sType)) {
                    errorMsg.append(String.format("类型为 %s 的工厂已经被注册;", sType));
                } else {
                    factoryMap.put(sType, factory);
                }
            }
            if (errorMsg.length() > 0) {
                throw new RuntimeException(errorMsg.toString());
            }
        }
    }

    public static IPictureFactory getFactory(String type) {
        if (type == null)
            return null;
        return factoryMap.get(type.toLowerCase());
    }

    public static void main(String[] args) {
        FactoryMethod.getFactory("gif").load("rootpath", true).show();
    }

    /**
     * 抽象的工厂
     */
    interface IPictureFactory {
        IPicture load(String path, Object... params);

        /**
         * 通过不同的参数重载方法，使得对象可以以不同的方式被加载
         *
         * @param stream
         * @param params
         * @return
         */
        IPicture load(InputStream stream, Object... params);


        String[] getSupportType();
    }

    /**
     * 抽象的产品
     */
    interface IPicture {
        void show();
    }

    /**
     * 正对不同的创建方式，构建不同的工厂对象
     */
    static class CommonPictureFactory implements IPictureFactory {
        private String[] supportType = new String[]{"png", "jpg"};

        @Override
        public IPicture load(String path, Object... params) {
            return new Png(path);
        }

        @Override
        public IPicture load(InputStream stream, Object... params) {
            throw new RuntimeException("还未实现的方法");
        }

        @Override
        public String[] getSupportType() {
            return supportType;
        }
    }

    static class GifPictureFactory implements IPictureFactory {
        private String[] supportType = new String[]{"gif"};

        @Override
        public IPicture load(String path, Object... params) {
            boolean play = false;
            if (params != null && params[0] != null && params[0] instanceof Boolean) {
                play = (Boolean) params[0];
            }
            return new Gif(path, play);
        }

        @Override
        public IPicture load(InputStream stream, Object... params) {
            throw new RuntimeException("还未实现的方法");
        }

        @Override
        public String[] getSupportType() {
            return supportType;
        }
    }

    static class Png implements IPicture {
        private String path;

        public Png(String path) {
            this.path = path;
        }

        @Override
        public void show() {
            System.out.println("png:" + path);
        }
    }

    static class Gif implements IPicture {
        private String path;
        private boolean play;

        public Gif(String path, boolean play) {
            this.path = path;
            this.play = play;
        }

        @Override
        public void show() {
            System.out.println("Gif:" + path);
            if (play)
                internalPlay();
        }

        private void internalPlay() {
            System.out.println("start play");
        }
    }

}
