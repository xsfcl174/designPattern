package com.fancl.abstractfactory.family.orc;

import com.fancl.abstractfactory.family.Army;
import com.fancl.abstractfactory.family.King;


public class OrcKing implements King {
    
    private String kingName;

    public OrcKing(String kingName) {
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
