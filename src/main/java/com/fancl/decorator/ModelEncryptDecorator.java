package com.fancl.decorator;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class ModelEncryptDecorator extends EncryptDecorator {
    private ModelEncrypt encrypt = new ModelEncrypt();

    public ModelEncryptDecorator(IEncrypt encrypt) {
        super(encrypt);
    }

    @Override
    public String encrypt(String message) {
        return encrypt.encrypt(super.encrypt(message));
    }
}
