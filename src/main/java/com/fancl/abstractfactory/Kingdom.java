package com.fancl.abstractfactory;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;
import com.fancl.abstractfactory.family.King;
import com.fancl.abstractfactory.family.KingdomFactory;
import com.fancl.abstractfactory.family.elf.ElfKingdomFactory;
import com.fancl.abstractfactory.family.orc.OrcKingdomFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Kingdom {
    private List<Castle> castles = new ArrayList<>();
    private List<Army> armies = new ArrayList<>();
    private King king;
    private String kingdomName;
    private KingdomFactory factory;

    public Kingdom(String kingdomName, KingdomFactory factory) {
        this.kingdomName = kingdomName;
        this.factory = factory;
    }

    public Stream<Army> getArmies() {
        return armies.stream();
    }

    public Stream<Castle> getCastle() {
        return castles.stream();
    }

    public Army newArmy() {
        Army army = factory.createArmy(kingdomName + "'s army:" + UUID.randomUUID().toString());
        armies.add(army);
        return army;
    }

    public Castle newCastle() {
        Castle castle = factory.createCastle(kingdomName + "'s cstle:" + UUID.randomUUID().toString());
        castles.add(castle);
        return castle;
    }

    public King getKing() {
        if (this.king == null) {
            king = factory.createKing(kingdomName + "'s king");
        }
        return king;
    }

    public String getKingdomName() {
        return kingdomName;
    }

    public static enum KingdomType {
        ELF, ORC
    }


    public static KingdomFactory createKingdomFactory(KingdomType kingdomType) {
        switch (kingdomType) {

            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
        }
        throw new IllegalArgumentException("kingdomType not supported");
    }

}
