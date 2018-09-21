package com.fancl.acyclicvisitor;

public class Telecom extends Modem{
    @Override
    public void accept(ModemVisitor visitor) {
        if(visitor instanceof TelecomVisitor) {
            ((TelecomVisitor) visitor).visit(this);
        }
    }
}
