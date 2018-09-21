package com.fancl.abstractdocument;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class AbstractDocuemnt implements Document {
    private Map<String, Object> properties;

    public AbstractDocuemnt(Map<String, Object> properties) {
        Objects.requireNonNull(properties);
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        this.properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return this.properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        Optional<List<Map<String, Object>>> any = Stream.of(get(key)).filter(el -> {
            return el != null;
        }).map(el -> {
            return (List<Map<String, Object>>) el;
        }).findAny();
        return any.isPresent() ? any.get().stream().map(constructor) : Stream.empty();
    }
}
