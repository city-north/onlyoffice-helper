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
public class InMemoryKeyRegistry<T> implements KeyRegistry<T> {

    private final Map<T, String> documentKeyMap = new ConcurrentHashMap<>(64);
    private KeyGenerator keyGenerator;


    public InMemoryKeyRegistry(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

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
        if (contains(source)) {
            return getKey(source);
        } else {
            return documentKeyMap.put(source, keyGenerator.generateKey());
        }
    }

    public Map<T, String> getDocumentKeyMap() {
        return documentKeyMap;
    }

    public KeyGenerator getKeyGenerator() {
        return keyGenerator;
    }

    public InMemoryKeyRegistry<T> setKeyGenerator(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
        return this;
    }
}