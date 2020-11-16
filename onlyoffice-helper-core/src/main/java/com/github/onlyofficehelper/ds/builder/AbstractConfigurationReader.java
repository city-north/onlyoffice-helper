package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.binding.OnlyOfficeConfigRegistry;
import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.ds.utils.OnlyOfficeConfigUtil;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import static com.github.onlyofficehelper.ds.config.Configuration.DOC_SERVICE_API;


/**
 * <p>
 * 一个抽象的配置文件读取器
 * </p>
 *
 * @author EricChen
 */
public abstract class AbstractConfigurationReader implements ConfigurationReader, OnlyOfficeConfigRegistry {

    Map<String, String> configMap = new ConcurrentHashMap<>(256);

    /**
     * 配置 documentService 相关url
     */
    public void readDocServiceUrl(String url) {
        Objects.requireNonNull(url);
        putConfig(DOC_SERVICE_API, url + URL_API);
        putConfig(Configuration.TEMP_STORAGE_URL, url + URL_TEMOSTORAGE);
        putConfig(Configuration.CONVERTER_URL, url + URL_CONVERT);
        putConfig(Configuration.PRELOADER_URL, url + URL_PRELOADER);
    }


    @Override
    public OnlyOfficeConfigRegistry getRegistry() {
        return this;
    }

    @Override
    public int loadConfigs(String location) {
        return 0;
    }

    @Override
    public String getConfig(String key) {
        return configMap.get(key);
    }

    @Override
    public void putConfig(String key, String value) {
        if (value == null) {
            return;
        }
        configMap.put(key, value);
    }

    protected Configuration buildConfiguration() {
        Configuration configuration = new Configuration();
        buildConfiguration(configuration);
        return configuration;
    }

    protected void buildConfiguration(Object configuration) {
        OnlyOfficeConfigUtil.fillConfiguration(configuration, getConfigMap());
    }

    @Override
    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
