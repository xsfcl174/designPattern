package com.fancl.acyclicvisitor;

public class TestMe {
    public static void main(String[] args) {
        ConfigureForDos configureForDos = new ConfigureForDos();
        ConfigureForUnix configureForUnix = new ConfigureForUnix();

        Modem modem1 = new Telecom();
        Modem modem2 = new Unicom();
        System.out.println("visit modem1 begin");
        modem1.accept(configureForDos);
        modem1.accept(configureForUnix);
        System.out.println("visit modem1 end");

        System.out.println("visit modem2 begin");
        modem2.accept(configureForDos);
        modem2.accept(configureForUnix);
        System.out.println("visit modem2 end");

    }
}
