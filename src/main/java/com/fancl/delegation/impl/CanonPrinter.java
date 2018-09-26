package com.fancl.delegation.impl;

import com.fancl.delegation.Printer;

public class CanonPrinter implements Printer {
    @Override
    public void print(String message) {

        System.out.println("cannon printer:" + message);
    }
}
