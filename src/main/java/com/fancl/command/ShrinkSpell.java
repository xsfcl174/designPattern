package com.fancl.command;

public class ShrinkSpell extends Command {
    private Size oldSize;
    private Target target;

    @Override
    public void execute(Target target) {
        this.target = target;
        changeSize(Size.SMALL);
    }

    private void changeSize(Size size) {
        if (target != null) {
            Size temp = target.getSize();
            target.setSize(size);
            this.oldSize = temp;
        }
    }

    @Override
    public void undo() {
        if (oldSize != null)
            changeSize(oldSize);
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Shrink Spell";
    }
}
