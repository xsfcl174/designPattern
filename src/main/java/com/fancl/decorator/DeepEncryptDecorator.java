package com.fancl.decorator;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class DeepEncryptDecorator extends EncryptDecorator{
    private DeepEncrypt deepEncrypt = new DeepEncrypt();
    public DeepEncryptDecorator(IEncrypt encrypt) {
        super(encrypt);
    }

    @Override
    public String encrypt(String message) {
        return deepEncrypt.encrypt(super.encrypt(message));
    }
}
