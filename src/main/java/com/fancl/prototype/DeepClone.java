package com.fancl.prototype;

/**
 * 作者 fanchengliang
 * 日期 2017/10/30
 * 项目 design-pattern
 */
public class DeepClone implements Cloneable {
    private ChildObject object;

    private int index;

    private String str;

    public DeepClone(ChildObject object, int index, String str) {
        this.object = object;
        this.index = index;
        this.str = str;
    }

    public static void main(String[] args) {
        DeepClone origin = new DeepClone(new ChildObject(2), 3, "test");
        DeepClone clone = origin.clone();
        //在深克隆中，无论原型对象的成员变量是值类型还是引用类型，
        // 都将复制一份给克隆对象，
        // 深克隆将原型对象的所有引用对象也复制一份给克隆对象。
        //具体实现可以是手动方式，也可以通过序列化方式
        System.out.println("is object equals:" + (origin == clone));
        System.out.println("is int equals:" + (origin.getIndex() == clone.getIndex()));
        System.out.println("is string equals:" + (origin.getStr() == clone.getStr()));
        System.out.println("is subObject equals:" + (origin.getObject() == clone.getObject()));
    }

    public ChildObject getObject() {
        return object;
    }

    public int getIndex() {
        return index;
    }

    public String getStr() {
        return str;
    }

    @Override
    public DeepClone clone() {
        try {
            DeepClone clone = (DeepClone) super.clone();
            clone.object = this.object.clone();
            clone.str = new String(this.str);
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class ChildObject implements Cloneable {
        private int childIndex;

        public ChildObject(int childIndex) {
            this.childIndex = childIndex;
        }

        public int getChildIndex() {
            return childIndex;
        }

        @Override
        public ChildObject clone() {
            try {
                return (ChildObject) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
