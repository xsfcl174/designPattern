package com.fancl.strategy;

import java.util.Objects;

public class Hero {
    private BattleStrategy battleStrategy;

    public Hero(BattleStrategy battleStrategy) {
        Objects.nonNull(battleStrategy);
        this.battleStrategy = battleStrategy;
    }

    public void changeBattleStrategy(BattleStrategy battleStrategy) {
        this.battleStrategy = battleStrategy;
    }

    public void attack() {
        battleStrategy.attack();
    }
}
