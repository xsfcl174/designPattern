package com.fancl.abstractdocument.impl;

import com.fancl.abstractdocument.AbstractDocuemnt;

import java.util.Map;

public class Car extends AbstractDocuemnt implements HasPrice, HasModel, HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
