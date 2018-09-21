package com.fancl.abstractfactory.family.orc;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;
import com.fancl.abstractfactory.family.King;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class OrcCastle implements Castle {
    private List<Army> armies = new ArrayList<>();
    private String name;

    public OrcCastle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stream<Army> getArmies() {
        return armies.stream();
    }

    @Override
    public void into(Army army) {
        armies.add(army);
    }

    @Override
    public void getOut(Army army) {
        armies.remove(army);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcCastle orcCastle = (OrcCastle) o;
        return Objects.equals(armies, orcCastle.armies) &&
                Objects.equals(name, orcCastle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armies, name);
    }

    @Override
    public String toString() {
        return "OrcCastle{" +
                "armies=" + armies +
                ", name='" + name + '\'' +
                '}';
    }
}
