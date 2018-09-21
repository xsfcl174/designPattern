package com.fancl.adapter.impl;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public abstract class AbstractDefaultAdapter implements DefaultTarget {
    @Override
    public void doFirst() {
        System.out.println("do nothing");
    }

    @Override
    public void doSecond() {
        System.out.println("do nothing");

    }

    @Override
    public void doThird() {
        System.out.println("do nothing");

    }
}
