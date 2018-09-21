package com.fancl.abstractdocument.impl;

import com.fancl.abstractdocument.AbstractDocuemnt;

import java.util.Map;

public class Part extends AbstractDocuemnt implements HasType,HasModel,HasPrice {
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
