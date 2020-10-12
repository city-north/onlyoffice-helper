package com.github.onlyofficehelper.ds.key.registry;


import com.github.onlyofficehelper.ds.key.generator.KeyGenerator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * <p>
 * 基于内存的注册中心
 * </p>
 *
 * @author EricChen 2020/09/24 12:36
 */
public abstract class KeyRegistrySupport<T> implements KeyRegistry<T>, KeyGenerator {

    private final Map<T, String> documentKeyMap = new ConcurrentHashMap<>(64);

    @Override
    public String getKey(T source) {
        return documentKeyMap.get(source);
    }

    @Override
    public String remove(T source) {
        return documentKeyMap.remove(source);
    }

    @Override
    public boolean contains(T source) {
        return documentKeyMap.containsKey(source);
    }

    @Override
    public String register(T source) {
        return documentKeyMap.putIfAbsent(source, generateKey());
    }
}