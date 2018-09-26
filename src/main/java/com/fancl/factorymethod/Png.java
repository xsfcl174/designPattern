package com.fancl.factorymethod;

public class Png implements IPicture {
    private String path;

    public Png(String path) {
        this.path = path;
    }

    @Override
    public void show() {
        System.out.println("png:" + path);
    }
}