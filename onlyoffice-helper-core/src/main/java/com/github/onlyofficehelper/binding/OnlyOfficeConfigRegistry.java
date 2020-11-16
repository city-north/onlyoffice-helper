package com.github.onlyofficehelper.binding;

import com.github.onlyofficehelper.constant.DocumentServerConstant;

import java.util.Map;

/**
 * <p>
 * OnlyOffice配置文件的注册中心
 * </p>
 *
 * @author EricChen
 */
public interface OnlyOfficeConfigRegistry extends DocumentServerConstant {

    /**
     * 获取配置
     *
     * @param key 配置的key
     * @return 配置的值
     */
    String getConfig(String key);

    /**
     * 设置配置
     *
     * @param key   配置唯一key
     * @param value 配置的值
     */
    void putConfig(String key, String value);


    /**
     * 获取注册中心
     *
     * @return 注册中心
     */
    OnlyOfficeConfigRegistry getRegistry();


    /**
     * 加载配置文件
     *
     * @param location 配置文件地址
     * @return 加载配置的个数
     */
    int loadConfigs(String location);


    /**
     * 获取ConfigMap
     *
     * @return configuration Map
     */
    Map<String, String> getConfigMap();
}
