package com.fancl.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * <p>
 * 树容器
 */
public class Company implements INotice {
    private List<INotice> notices = new ArrayList<INotice>();
    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public boolean add(INotice iNotice) {
        return notices.add(iNotice);
    }

    public void remove(int index) {
        notices.remove(index);
    }

    @Override
    public void receiveNotice(String message) {
        System.out.println(companyName+"转发消息到下属部门");
        for (INotice notice : notices) {
            notice.receiveNotice(message);
        }

    }
}
