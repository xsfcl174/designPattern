package com.fancl.abstractdocument.impl;

import com.fancl.abstractdocument.Document;

import java.util.Optional;

public interface HasPrice extends Document {
    String PROPERTY = "Price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
