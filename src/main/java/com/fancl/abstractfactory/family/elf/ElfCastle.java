package com.fancl.abstractfactory.family.elf;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;
import com.fancl.abstractfactory.family.King;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ElfCastle implements Castle {
    private List<Army> armies = new ArrayList<>();
    private String name;
    public ElfCastle(String name) {
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
        ElfCastle elfCastle = (ElfCastle) o;
        return Objects.equals(armies, elfCastle.armies) &&
                Objects.equals(name, elfCastle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armies, name);
    }

    @Override
    public String toString() {
        return "ElfCastle{" +
                "armies=" + armies +
                ", name='" + name + '\'' +
                '}';
    }
}
