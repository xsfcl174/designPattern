package com.fancl.flyweight;

import java.io.File;

/**
 * @version 1.0.0
 * @Description: 享元具体类
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class Image extends File {
    public Image(String pathname) {
        super(pathname);
    }

    @Override
    public String toString() {
        return "图片：" + super.toString();
    }
}
