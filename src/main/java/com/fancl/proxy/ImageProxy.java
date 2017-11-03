package com.fancl.proxy;

import java.io.File;

/**
 * @version 1.0.0
 * @Description: 使用固定的一个或者几个缩略图，对所有图片进行代理，当需要的时候才通过path加载图片
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class ImageProxy {
    private String path;
    private String thumb;

    public ImageProxy(String path, String thumb) {
        this.path = path;
        this.thumb = thumb;
    }

    public File loadFile() {
        return new File(path);
    }

    public String getPath() {
        return path;
    }

    public String getThumb() {
        return thumb;
    }
}
