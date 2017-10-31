package com.fancl.composite;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 *
 * 叶子节点
 */
public class Department implements INotice{
    private String depName;

    public Department(String depName) {
        this.depName = depName;
    }

    @Override
    public void receiveNotice(String message) {
        System.out.println(depName+"接受消息:"+message);
    }
}
