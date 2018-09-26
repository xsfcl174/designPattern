package com.fancl.command;

public class TestMe {

    public static void main(String[] args) {
        Goblin goblin = new Goblin();
        Command shrink = new ShrinkSpell();
        Wizard wizard = new Wizard();
        System.out.println("goblin size:"+goblin.getSize()+" before "+shrink);
        wizard.castSpell(shrink,goblin);
        System.out.println("goblin size:"+goblin.getSize()+" after "+shrink);

        wizard.undoLastSpell();
        System.out.println("goblin size:"+goblin.getSize()+" after "+shrink+" undo");

        wizard.redoLastSpell();
        System.out.println("goblin size:"+goblin.getSize()+" after "+shrink+" redo");

        Command visibility = new InvisibilitySpell();

        System.out.println("goblin visibility:"+goblin.getVisibility()+" before "+visibility);
        wizard.castSpell(visibility,goblin);
        System.out.println("goblin visibility:"+goblin.getVisibility()+" after "+visibility);

        wizard.undoLastSpell();
        System.out.println("goblin visibility:"+goblin.getVisibility()+" after "+visibility+" undo");

        wizard.redoLastSpell();
        System.out.println("goblin visibility:"+goblin.getVisibility()+" after "+visibility+" redo");

    }

}
