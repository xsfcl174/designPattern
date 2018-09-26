package com.fancl.command;

public class InvisibilitySpell extends Command {
    private Target target;

    @Override
    public void execute(Target target) {
        this.target = target;
        this.target.setVisibility(Visibility.INVISIBLE);
    }

    @Override
    public void undo() {
        if (target != null)
            this.target.setVisibility(Visibility.VISIBLE);

    }

    @Override
    public void redo() {
        if (target != null)
            this.target.setVisibility(Visibility.INVISIBLE);

    }

    @Override
    public String toString() {
        return "Invisibility Spell";
    }
}
