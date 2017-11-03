package com.fancl.facade;

import com.sun.crypto.provider.RSACipher;

import javax.crypto.Cipher;

/**
 * @version 1.0.0
 * @Description: 文件加密
 * @auther fanchengliang
 * @create 2017/11/3
 * @since 1.6
 */
public class FileCipher {
    public byte[] encrypt(byte[] content){
        System.out.println("模拟加密");
        return content;
    }

    public byte[] decrypt(byte[] content){
        System.out.println("模拟解密");
        return content;
    }
}
