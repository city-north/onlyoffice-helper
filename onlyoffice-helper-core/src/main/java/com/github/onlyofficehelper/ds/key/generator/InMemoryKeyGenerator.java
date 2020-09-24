package com.github.onlyofficehelper.ds.key.generator;


import java.util.UUID;

/**
 * <p>
 * 基于内存的KeyGenerator
 * </p>
 *
 * @author EricChen 2020/09/24 12:27
 */
public class InMemoryKeyGenerator extends BaseGenerator {


    @Override
    public synchronized String doGenerateKey() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 20);
    }
}
