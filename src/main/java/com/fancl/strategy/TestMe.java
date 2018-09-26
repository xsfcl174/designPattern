package com.fancl.strategy;

public class TestMe {
    public static void main(String[] args) {
        Hero hero = new Hero(new MeleeStrategy());
        hero.attack();
        hero.changeBattleStrategy(new ProjectileStrategy());
        hero.attack();
        hero.changeBattleStrategy(new SpellStrategy());
        hero.attack();
    }
}
