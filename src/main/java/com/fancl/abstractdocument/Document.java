package com.fancl.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Document {
    /**
     * 存入键值
     * @param key
     * @param value
     */
    void put(String key,Object value);

    /**
     * 获取值
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * 获取子文档
     * @param key
     * @param constructor
     * @param <T>
     * @return
     */
    <T> Stream<T> children(String key, Function<Map<String,Object>,T> constructor);
}
