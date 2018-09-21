package com.fancl.abstractdocument.impl;

import com.fancl.abstractdocument.Document;

import java.util.Optional;

public interface HasType extends Document {
    String PROPERTY = "Type";

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
