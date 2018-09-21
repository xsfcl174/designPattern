package com.fancl.abstractfactory.family;

public interface Army {
    String getName();

    String attack(Army army);

    String attack(Castle castle);

}
