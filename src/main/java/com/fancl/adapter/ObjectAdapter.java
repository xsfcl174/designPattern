package com.fancl.adapter;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * <p>
 * 对象适配器模式
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doAction() {
        adaptee.outPut();
    }
}
