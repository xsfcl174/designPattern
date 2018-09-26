package com.fancl.command;

import java.util.Objects;

public abstract class Target {
    private Size size;
    private Visibility visibility;

    public Target(Size size, Visibility visibility) {
        Objects.nonNull(size);
        Objects.nonNull(visibility);
        this.size = size;
        this.visibility = visibility;
    }

    public Size getSize() {
        return size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    void setSize(Size size) {
        this.size = size;
    }

    void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}
