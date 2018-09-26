package com.fancl.delegation;

public class PrinterDelegate implements Printer {
    private Printer printer;

    public PrinterDelegate(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        System.out.println("delegated printer");
        printer.print(message);
    }
}
