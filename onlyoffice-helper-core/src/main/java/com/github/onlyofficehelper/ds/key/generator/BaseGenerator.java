package com.github.onlyofficehelper.ds.key.generator;

import com.github.onlyofficehelper.ds.key.registry.KeyRegistrySupport;

/**
 * <p>
 * 基础
 * </p>
 *
 * @author EricChen 2020/09/24 18:03
 */
public abstract class BaseGenerator extends KeyRegistrySupport<String> {

    private static final int MAX_KEY_LENGTH = 20;

    @Override
    public String generateKey() {
        final String s = doGenerateKey();
        if (s.length() > MAX_KEY_LENGTH) {
            return s.substring(0, MAX_KEY_LENGTH);
        }
        return s;
    }

    /**
     * 生成key
     *
     * @return documentKey
     */
    public abstract String doGenerateKey();
}
