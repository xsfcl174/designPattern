package com.fancl.adapter.impl;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void doAction() {
        System.out.printf(this.getClass()+":");
        outPut();
    }
}
