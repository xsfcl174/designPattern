package com.fancl.flyweight;

import java.io.File;

/**
 * @version 1.0.0
 * @Description: 享元模式，通过共享技术实现相同或者相似对象的重用
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class WordEditor {
    private StringBuffer text = new StringBuffer();

    public void insertText(String text) {
        this.text.append(text);
    }

    public void insertFile(String path) {
        File file = FileFactory.create(path);
        System.out.println("插入文件:" + file.getPath());
    }

    public void insertImage(String path) {
        File file = FileFactory.create(path);
        System.out.println("插入图片:" + file.getPath());
    }
}
