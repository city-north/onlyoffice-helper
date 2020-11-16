package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.json.Convertable;

/**
 * <p>
 * DocumentServer 配置抽象
 * </p>
 *
 * @author EricChen
 */
public class DocumentServer implements Convertable {
    private Configuration config;

    public Configuration getConfiguration() {
        return config;
    }

    public void setConfiguration(Configuration configuration) {
        this.config = configuration;
    }
}
