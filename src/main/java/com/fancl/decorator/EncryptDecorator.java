package com.fancl.decorator;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class EncryptDecorator implements IEncrypt{
    private IEncrypt encrypt;

    public EncryptDecorator(IEncrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String encrypt(String message) {
        return encrypt.encrypt(message);
    }
}
