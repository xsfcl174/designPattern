package com.fancl.strategy;

public class ProjectileStrategy implements BattleStrategy {
    @Override
    public void attack() {
        System.out.println("attack by a bow");
    }
}
