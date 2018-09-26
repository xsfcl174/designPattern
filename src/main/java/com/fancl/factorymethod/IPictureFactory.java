package com.fancl.factorymethod;

import java.io.InputStream;

/**
 * 抽象的工厂
 */
public interface IPictureFactory {
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