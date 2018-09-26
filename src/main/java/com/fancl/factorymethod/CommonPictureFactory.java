package com.fancl.factorymethod;

import java.io.InputStream;

/**
 * 正对不同的创建方式，构建不同的工厂对象
 */
public class CommonPictureFactory implements IPictureFactory {
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