package com.fancl.acyclicvisitor;

public class ConfigureForUnix implements TelecomVisitor{
    @Override
    public void visit(Telecom telecom) {
        System.out.println(telecom.getClass()+" visited" + this.getClass());
    }
}
