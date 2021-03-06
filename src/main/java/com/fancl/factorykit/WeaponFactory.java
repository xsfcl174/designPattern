package com.fancl.factorykit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface WeaponFactory {
    Weapon createWeapon(WeaponType type);

    static WeaponFactory factory(Consumer<Builder> consumer) {
        Map<WeaponType, Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map::put);
        return type -> map.get(type).get();
    }
}
