package com.fancl.factorymethod;

public class Gif implements IPicture {
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