package com.fancl.adapter;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * 缺省适配器
 */
public class DefaultAdapter extends AbstractDefaultAdapter {
    private Adaptee adaptee;

    public DefaultAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSecond() {
        adaptee.outPut();
    }

}
