package com.fancl.proxy;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @Description: 图片查看，代理模式,虚拟代理模式
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class ImageViewer {
    private static final String IMAGE_PATTERN = "(?i).+?\\.(jpg|gif|bmp)";
    private List<ImageProxy> imageProxyList = new ArrayList<ImageProxy>();

    public void findImage(String dir) {
        if (dir == null || "".equals(dir.trim())) return;
        imageProxyList.clear();
        File file = new File(dir);
        if (dir.matches(IMAGE_PATTERN))
            addImage(file, imageProxyList);
        if (file.isDirectory()) {
            searchImage(file, imageProxyList);
        }
    }

    /**
     * 预览图片，使用缩略图
     */
    public void previewImages() {
        for (ImageProxy imageProxy : imageProxyList) {
            System.out.println(imageProxy.getThumb());
        }
    }

    /**
     * 在需要的时候才展示单张图片
     * @param imageProxy
     */
    public void showImage(ImageProxy imageProxy) {
        System.out.println("展示图片：" + imageProxy.loadFile());
    }

    private void searchImage(File dir, List<ImageProxy> images) {
        final File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().matches(IMAGE_PATTERN);
            }
        });
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchImage(file, images);
                } else
                    addImage(file, images);
            }
        }
    }

    private void addImage(File image, List<ImageProxy> images) {
        images.add(new ImageProxy(image.getPath(), "img"));
    }
}
