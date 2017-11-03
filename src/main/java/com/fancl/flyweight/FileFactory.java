package com.fancl.flyweight;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.0
 * @Description: 享元模式 享元工厂
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class FileFactory {
    private static final String IMAGE_PATTERN = "(?i).+?\\.(jpg|gif|bmp)";
    private static Map<String, File> fileMap = new HashMap<String, File>();

    public static File create(String path) {
        if (path == null || "".equals(path.trim()))
            return null;
        File file = fileMap.get(path);
        if (file == null) {
            if (path.matches(IMAGE_PATTERN)) {
                file = createImage(path);
            } else
                file = new File(path);
            fileMap.put(path, file);
        }
        return file;
    }

    private static Image createImage(String path) {
        return new Image(path);
    }
}
