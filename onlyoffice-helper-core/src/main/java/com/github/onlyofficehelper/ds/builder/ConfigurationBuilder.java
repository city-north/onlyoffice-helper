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
public interface ConfigurationBuilder extends RefreshableBuilder {

    /**
     * 使用默认配置文件路径 , 构建一个 {@link Configuration}
     *
     * @return Configuration
     */
    Configuration build();
}
