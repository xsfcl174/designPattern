package com.fancl.command;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Wizard {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public void castSpell(Command command, Target target) {
        Objects.nonNull(command);
        Objects.nonNull(target);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pollLast();
            command.undo();
            redoStack.offerLast(command);
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pollLast();
            command.redo();
            undoStack.offerLast(command);
        }
    }
}
