package com.fancl.singleton;

/**
 * 作者 fanchengliang
 * 日期 2017/10/18
 * 项目 design-pattern
 */
public class HungarySingleton {
    private static HungarySingleton instance = new HungarySingleton();

    private HungarySingleton() {
        System.out.println("HungarySingleton初始化");
    }

    public static HungarySingleton getInstance() {
        return instance;
    }

    void print() {
        System.out.println("HungarySingleton");
    }


}
