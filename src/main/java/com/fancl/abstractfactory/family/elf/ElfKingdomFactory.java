package com.fancl.abstractfactory.family.elf;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.Castle;
import com.fancl.abstractfactory.family.King;
import com.fancl.abstractfactory.family.KingdomFactory;

import java.util.ArrayList;
import java.util.List;

public class ElfKingdomFactory implements KingdomFactory {


    @Override
    public Army createArmy(String name) {
        return new ElfArmy(name);
    }

    @Override
    public Castle createCastle(String name) {
        return new ElfCastle(name);
    }

    @Override
    public King createKing(String name) {
        return new ElfKing(name);
    }
}
