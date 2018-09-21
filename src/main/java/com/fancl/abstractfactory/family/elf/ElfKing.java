package com.fancl.abstractfactory.family.elf;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.King;


public class ElfKing implements King {
    private String kingName;

    public ElfKing(String kingName) {
        this.kingName = kingName;
    }

    @Override
    public String command(Army army, String command) {
        return "king " + kingName + " command army " + army.getName() + " to " + command;
    }


    @Override
    public String getName() {
        return kingName;
    }


}
