package com.github.onlyofficehelper.ds.key.generator;

/**
 * <p>
 * 同步Key生成器包装器
 * </p>
 *
 * @author EricChen 2020/09/24 17:58
 */
public class SyncKeyGenerator implements KeyGenerator {
    private KeyGenerator keyGenerator;

    public SyncKeyGenerator(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }


    @Override
    public synchronized String generateKey() {
        return keyGenerator.generateKey();
    }
}
