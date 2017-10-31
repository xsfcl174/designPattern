package com.fancl.bridge;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class TextDataExport extends AbstractDbDataExport {

    @Override
    public void export(String path) {
        System.out.println("数据保存格式:" + this);
        System.out.println("数据获取方式:" + source);
        System.out.println("保存路径:" + path);
    }

    @Override
    public String toString() {
        return "TEXT";
    }

    public static void main(String[] args) {
        TextDataExport textDataExport = new TextDataExport();
        textDataExport.setSource(new MysqlDataSource());
        textDataExport.export("root");
    }
}
