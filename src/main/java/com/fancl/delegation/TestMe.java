package com.fancl.delegation;

import com.fancl.delegation.impl.CanonPrinter;

public class TestMe {
    public static void main(String[] args) {
        Printer cannonPrinter = new CanonPrinter();
        cannonPrinter = new PrinterDelegate(cannonPrinter);
        cannonPrinter.print("test print");
    }
}
