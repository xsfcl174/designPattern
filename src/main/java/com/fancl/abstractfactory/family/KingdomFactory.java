package com.fancl.abstractfactory.family;

public interface KingdomFactory {
    Army createArmy(String name);

    Castle createCastle(String name);

    King createKing(String name);
}
