package com.fancl.bridge;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * <p>
 * 抽象类
 */
public abstract class AbstractDbDataExport implements IDbDataExport {
    protected IDbDataSource source;
    //桥接的方法
    public void setSource(IDbDataSource source) {
        this.source = source;
    }
}
