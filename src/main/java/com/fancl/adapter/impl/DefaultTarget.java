package com.fancl.adapter.impl;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * 默认适配器，适用于有多个方法需要实现，但是不是每个方法都需要适配的接口
 */
public interface DefaultTarget {
    void doFirst();
    void doSecond();
    void doThird();
}
