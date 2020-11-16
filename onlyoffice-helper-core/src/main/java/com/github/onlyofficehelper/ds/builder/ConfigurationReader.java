package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.ds.config.Configuration;

/**
 * <p>
 * 配置文件构建器 ,构建一个 {@link Configuration}
 * </p>
 *
 * @author EricChen
 * @see Configuration
 */
public interface ConfigurationReader extends RefreshableReader {

    /**
     * 使用默认配置文件路径
     *
     * @return 读取到的配置文件
     */
    Configuration read();

    /**
     * 读取指定配置文件
     *
     * @param configLocation 配置文件
     * @return 读取到的配置文件
     */
    Configuration read(String configLocation);
}
