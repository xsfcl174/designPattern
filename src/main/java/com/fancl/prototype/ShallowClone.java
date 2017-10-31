package com.fancl.prototype;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class ShallowClone implements Cloneable {
    private int index;

    private String str;

    public ShallowClone(int index, String str) {
        this.index = index;
        this.str = str;
    }

    public static void main(String[] args) {
        ShallowClone origin = new ShallowClone(9, "test");
        ShallowClone clone = origin.clone();
        //浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；
        // 如果原型对象的 成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，
        // 也就是说原型对象和克隆 对象的成员变量指向相同的内存地址
        System.out.println("is object equals:"+(origin==clone));
        System.out.println("is int equals:"+(origin.getIndex()==clone.getIndex()));
        System.out.println("is string equals:"+(origin.getStr()==clone.getStr()));

    }

    public int getIndex() {
        return index;
    }

    public String getStr() {
        return str;
    }

    @Override
    public ShallowClone clone() {
        try {
            return (ShallowClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
