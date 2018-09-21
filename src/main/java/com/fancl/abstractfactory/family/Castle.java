package com.fancl.abstractfactory.family;

import java.util.stream.Stream;

public interface Castle {
    String getName();

    Stream<Army> getArmies();

    void into(Army army);

    void getOut(Army army);

}
