package com.fancl.singleton;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton初始化");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    void print() {
        System.out.println("LazySingleton");
    }


}
