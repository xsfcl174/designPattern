package com.fancl.command;

public enum Size {
    SMALL("small"),NORMAL("normal");

    private String name;

    Size(String name) {
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
