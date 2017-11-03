package com.fancl.facade;

/**
 * @version 1.0.0
 * @Description: 外观模式, 为子系统中的一组接口提供一个统一的入口。
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class FileCipherFacade {
    private FileCipher cipher = new FileCipher();
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();

    /**
     * @param content
     * @param path
     * @return void
     * @author fanchengliang
     * @date 2017/11/3
     * @version 1.0.0
     * @description:
     */
    public void saveFile(String path, byte[] content) {
        content = cipher.encrypt(content);
        writer.write(path, content);
    }

    public byte[] loadFile(String path) {
        byte[] content = reader.readFile(path);
        return cipher.decrypt(content);
    }

}
