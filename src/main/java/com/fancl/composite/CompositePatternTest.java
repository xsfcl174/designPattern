package com.fancl.composite;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 * 组合模式---树形结构处理
 */
public class CompositePatternTest {

    public static void main(String[] args) {
        Department department1 = new Department("dep1");
        Department department2 = new Department("dep2");
        Department department3 = new Department("dep3");
        Department department4 = new Department("dep4");
        Department department5 = new Department("dep5");

        Company company1 = new Company("company1");
        Company company2 = new Company("company2");
        Company company3 = new Company("company3");

        company2.add(department1);
        company2.add(department2);

        company3.add(department3);
        company3.add(department4);

        company1.add(department5);
        company1.add(company2);
        company1.add(company3);
        company1.receiveNotice("test hello message");
    }
}
