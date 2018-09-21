package com.fancl.adapter;

import com.fancl.adapter.impl.Adaptee;
import com.fancl.adapter.impl.DefaultTarget;
import com.fancl.adapter.impl.Target;

public class AdapteeUse {
    public void doAction(Target target) {
        target.doAction();
    }

    public void doStep(DefaultTarget defaultTarget) {
        defaultTarget.doFirst();
        defaultTarget.doSecond();
        defaultTarget.doThird();
    }


}
