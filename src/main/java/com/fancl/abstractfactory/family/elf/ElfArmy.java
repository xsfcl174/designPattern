package com.fancl.abstractfactory.family.elf;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;

import java.util.Objects;

public class ElfArmy implements Army {
    private String name;

    public ElfArmy(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String attack(Army army) {
        return name + " attacked " + army.getName();
    }

    @Override
    public String attack(Castle castle) {
        return name + " attacked " + castle.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElfArmy elfArmy = (ElfArmy) o;
        return Objects.equals(name, elfArmy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ElfArmy{" +
                "name='" + name + '\'' +
                '}';
    }
}
