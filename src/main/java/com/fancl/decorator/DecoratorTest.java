package com.fancl.decorator;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class DecoratorTest {

    public static void main(String[] args) {
        //实现多重嵌套的加密
        IEncrypt encrypt = new ModelEncryptDecorator(new DeepEncryptDecorator(new CommonEncrypt()));
        encrypt.encrypt("hello world");
    }
}
