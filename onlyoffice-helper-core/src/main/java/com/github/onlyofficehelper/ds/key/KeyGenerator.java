package com.github.onlyofficehelper.ds.key;

import com.github.onlyofficehelper.ds.config.Document;

/**
 * <p>
 * 生成 {@link Document#key}, 用于标识一个唯一的文档 ,OnlyOffice会根据 key 从缓存中取出文档
 * </p>
 * 当文档被编辑或者保存时,应该生成一个新的key, 应该小于20字符 ,不同用户使用相同key打开,则认为是协调合作,
 * <p>
 * 在分布式系统中,如果要使用默认的基于内存key,则负载均衡策略推荐选择hash
 * </p>
 *
 * @author EricChen 2020/09/24 12:13
 * @see Document#setKey(String)
 * @see InMemoryKeyGenerator 基于内存的key生成器
 */
public interface KeyGenerator {
    /**
     * 生成一个 新的 Document Key
     *
     * @return Document Key
     */
    String generateKey();

}
