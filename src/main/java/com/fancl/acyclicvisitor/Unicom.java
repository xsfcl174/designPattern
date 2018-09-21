package com.fancl.acyclicvisitor;

public class Unicom extends Modem{
    @Override
    public void accept(ModemVisitor visitor) {
        if(visitor instanceof UnicomVisitor)
            ((UnicomVisitor) visitor).visit(this);
    }
}
