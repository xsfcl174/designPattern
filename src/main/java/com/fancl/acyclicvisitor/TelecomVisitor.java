package com.fancl.acyclicvisitor;

public interface TelecomVisitor extends ModemVisitor{
    void visit(Telecom telecom);
}
