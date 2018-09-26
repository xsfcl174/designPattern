package com.fancl.strategy;

public class MeleeStrategy implements BattleStrategy {
    @Override
    public void attack() {
        System.out.println("attack by a sword");
    }
}
