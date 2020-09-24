package com.github.onlyofficehelper.ds.key.registry;

/**
 * <p>
 * Document key的注册中心, 默认使用基于内存的注册
 * </p>
 *
 * @author EricChen 2020/09/24 12:13
 * @see KeyRegistrySupport
 */
public interface KeyRegistry<T> {


    /**
     * 根据源 , 从注册中心获取一个 DocumentKey
     *
     * @param source 源
     * @return DocumentKey
     */
    String getKey(T source);


    /**
     * 根据源 删除 Document Key
     *
     * @param source 源
     * @return DocumentKey
     */
    String remove(T source);


    /**
     * 是否包含  Document Key
     *
     * @param source 源
     * @return 是否包含
     */
    boolean contains(T source);


    /**
     * 注册 source
     *
     * @param source 源
     * @return documentKey
     */
    String register(T source);

}
