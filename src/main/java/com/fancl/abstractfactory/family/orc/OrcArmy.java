package com.fancl.abstractfactory.family.orc;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;

import java.util.Objects;

public class OrcArmy implements Army {
    private String name;

    public OrcArmy(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String attack(Army army) {
        return name + " attacked " + army;
    }

    @Override
    public String attack(Castle castle) {
        return name + " attacked " + castle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcArmy orcArmy = (OrcArmy) o;
        return Objects.equals(name, orcArmy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "OrcArmy{" +
                "name='" + name + '\'' +
                '}';
    }
}
