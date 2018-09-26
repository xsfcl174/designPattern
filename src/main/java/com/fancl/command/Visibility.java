package com.fancl.command;

public enum Visibility {
    VISIBLE("visible"), INVISIBLE("invisible");

    private String name;

    Visibility(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
