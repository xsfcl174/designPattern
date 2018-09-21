package com.fancl.build;

import com.fancl.build.simple.*;

public class TestMe {
    public static void main(String[] args) {
        //simple test
        Hero hero = new Hero.Builder(Profession.MAGE, "laofan").withArmor(Armor.CLOTHES).withHairColor(HairColor.BLACK).withHairType(HairType.BALD).withWeapon(Weapon.AXE).build();
        System.out.println(hero);
        //controller test
        ActorBuilder builder = new AngelBuilder();
        ActorController controller = new ActorController();
        final Actor build = controller.build(builder);
        System.out.println(build.getName());
        System.out.println(build.getType());
    }
}
