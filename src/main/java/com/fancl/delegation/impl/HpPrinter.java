package com.fancl.delegation.impl;

import com.fancl.delegation.Printer;

public class HpPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("hp printer:" + message);
    }
}
