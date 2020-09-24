package com.github.onlyofficehelper.ds.key;


/**
 * <p>
 * 基于内存的KeyGenerator ,注意负载均衡策略的使用
 * </p>
 *
 * @author EricChen 2020/09/24 12:27
 */
public class InMemoryKeyGenerator extends AbstractKeyGenerator<String> {

    public String generateKey(String source) {
        return null;
    }

    public String retrieveKey(String source) {
        return null;
    }

    public boolean removeKey(String source) {
        return false;
    }
}
