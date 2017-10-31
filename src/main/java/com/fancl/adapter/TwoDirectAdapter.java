package com.fancl.adapter;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 双向适配器
 */
public class TwoDirectAdapter extends Adaptee implements Target{
    private Adaptee adaptee;
    private Target target;

    public TwoDirectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public TwoDirectAdapter(Target target) {
        this.target = target;
    }

    @Override
    public void outPut() {
        target.doAction();
    }

    @Override
    public void doAction() {
        adaptee.outPut();
    }
}
