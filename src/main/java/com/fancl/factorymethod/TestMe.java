package com.fancl.factorymethod;

/**
 * 作者 fanchengliang
 * 日期 2017/10/17
 * 项目 DesignPatternStudy
 */
public class TestMe {
    public static void main(String[] args) {
        FactoryMethod.getFactory("gif").load("/user/document/test.gif", true).show();
    }
}
