package com.github.onlyofficehelper.ds.key.generator.decorator;

import com.github.onlyofficehelper.ds.key.generator.KeyGenerator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 基于可重入锁的生成器装饰器
 * </p>
 *
 * @author EricChen 2020/09/24 17:59
 */
public class LockKeyGenerator implements KeyGenerator {
    private Lock lock = new ReentrantLock();
    private KeyGenerator keyGenerator;

    public LockKeyGenerator(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    @Override
    public String generateKey() {
        lock.lock();
        try {
            return keyGenerator.generateKey();
        } finally {
            lock.unlock();
        }
    }
}
