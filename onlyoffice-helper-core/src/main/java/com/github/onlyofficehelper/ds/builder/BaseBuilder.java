package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.constant.BasicConstant;
import com.github.onlyofficehelper.ds.config.Configuration;


/**
 * <p>
 * description
 * </p>
 *
 * @author EricChen
 */
public abstract class BaseBuilder implements ConfigurationBuilder, BasicConstant {


    protected Configuration configuration = new Configuration();


    public ConfigurationBuilder buildConvertURL(String url) {
        return this;
    }

    /**
     * 配置 documentService 相关url
     */
    public ConfigurationBuilder buildDocServiceUrl(String url) {
        configuration.setDocServiceApi(url + URL_API);
        configuration.setTempStorageUrl(url + URL_TEMOSTORAGE);
        configuration.setConverterUrl(url + URL_CONVERT);
        configuration.setPreloaderUrl(url + URL_PRELOADER);
        return this;
    }


    @Override
    public Configuration build() {
        return null;
    }
}
