package com.github.onlyofficehelper.ds.builder;


import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.exception.ParserException;

import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * Properties Config Builder
 * </p>
 *
 * @author EricChen
 */
public class PropertiesConfigurationBuilder extends BaseBuilder {
    public static final String DEFAULT_CONFIG_FILE_NAME = "onlyoffice.properties";
    private String configFile;

    public static final String DOCUMENT_SERVER_PREFIX = "onlyoffice.documentserver";
    /**
     * DocumentServer 所在ip或者域名
     */
    public static final String DOCUMENT_SERVER_URL = DOCUMENT_SERVER_PREFIX + ".url";
    private Properties properties;

    public PropertiesConfigurationBuilder(String configFileName) {
        configFile = configFileName;
        refresh();
    }

    public PropertiesConfigurationBuilder() {
        this(DEFAULT_CONFIG_FILE_NAME);
    }


    @Override
    public Configuration build() {
        if (properties == null) {
            refresh();
        }
        return build(properties.getProperty(DOCUMENT_SERVER_URL));
    }


    public Configuration build(String documentServerUrl) {
        if (documentServerUrl == null) {
            throw new ParserException("config [onlyoffice.documentserver.url] can not be null");
        }
        buildDocServiceUrl(documentServerUrl);
        return configuration;
    }


    @Override
    public void refresh() {
        try {
            properties = new Properties();
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(configFile);
            properties.load(stream);
        } catch (Exception ex) {
            throw new ParserException("can not load default properties onlyoffice.properties ");
        }
    }
}


