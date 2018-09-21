package com.fancl.abstractfactory.family.orc;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;
import com.fancl.abstractfactory.family.King;
import com.fancl.abstractfactory.family.KingdomFactory;
import com.fancl.abstractfactory.family.elf.ElfArmy;
import com.fancl.abstractfactory.family.elf.ElfCastle;
import com.fancl.abstractfactory.family.elf.ElfKing;

import java.util.ArrayList;
import java.util.List;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Army createArmy(String name) {
        return new OrcArmy(name);
    }

    @Override
    public Castle createCastle(String name) {
        return new OrcCastle(name);
    }

    @Override
    public King createKing(String name) {
        return new OrcKing(name);
    }
}
