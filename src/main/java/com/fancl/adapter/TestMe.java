package com.fancl.adapter;

import com.fancl.adapter.impl.*;

public class TestMe {
    public static void main(String[] args) {
        AdapteeUse use = new AdapteeUse();
        ClassAdapter classAdapter = new ClassAdapter();
        Target target = classAdapter;
        System.out.println("ClassAdapter begin");
        use.doAction(target);
        System.out.println("ClassAdapter end");

        ObjectAdapter objectAdapter = new ObjectAdapter(classAdapter);
        target = objectAdapter;
        System.out.println("ObjectAdapter begin");
        use.doAction(target);
        System.out.println("ObjectAdapter end");

        TwoDirectAdapter twoDirectAdapter = new TwoDirectAdapter(new Adaptee());
        System.out.println("TwoDirectAdapter begin");
        use.doAction(twoDirectAdapter);
        System.out.println("TwoDirectAdapter end");

        DefaultAdapter defaultAdapter = new DefaultAdapter(classAdapter);
        System.out.println("DefaultAdapter begin");
        use.doStep(defaultAdapter);
        System.out.println("DefaultAdapter end");

    }
}
