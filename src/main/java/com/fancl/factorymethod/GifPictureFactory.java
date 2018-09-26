package com.fancl.factorymethod;

import java.io.InputStream;

public class GifPictureFactory implements IPictureFactory {
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