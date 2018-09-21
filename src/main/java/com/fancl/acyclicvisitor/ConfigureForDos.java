package com.fancl.acyclicvisitor;

public class ConfigureForDos implements TelecomVisitor,UnicomVisitor {
    @Override
    public void visit(Telecom telecom) {
        System.out.println(telecom.getClass()+" visited" + this.getClass());
    }

    @Override
    public void visit(Unicom unicom) {
        System.out.println(unicom.getClass()+" visited" + this.getClass());

    }
}
