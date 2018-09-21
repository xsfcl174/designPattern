package com.fancl.abstractdocument.impl;

import com.fancl.abstractdocument.Document;

import java.util.Optional;

public interface HasModel extends Document {
    String PROPERTY = "Model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
