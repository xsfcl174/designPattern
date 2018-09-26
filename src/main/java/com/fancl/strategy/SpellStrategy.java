package com.fancl.strategy;

public class SpellStrategy implements BattleStrategy {
    @Override
    public void attack() {
        System.out.println("attack by magic");
    }
}
