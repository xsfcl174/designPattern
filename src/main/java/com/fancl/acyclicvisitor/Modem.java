package com.fancl.acyclicvisitor;

public abstract class Modem {
   public abstract void accept(ModemVisitor visitor);
}
