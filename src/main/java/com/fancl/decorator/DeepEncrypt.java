package com.fancl.decorator;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class DeepEncrypt implements IEncrypt{
    @Override
    public String encrypt(String message) {
        System.out.println("深度加密");
        return message;
    }
}
