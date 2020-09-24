package com.github.onlyofficehelper.ds.parser;

import com.github.onlyofficehelper.ds.config.Configuration;

import java.util.Properties;

/**
 * <p>
 * A properties file {@link AbstractConfigParser} which builds {@link Configuration}
 * </p>
 *
 * @author EricChen 2020/03/08 23:55
 */
public class PropertiesConfigParser extends AbstractConfigParser {

    public static final String DEFAULT_CONFIG_FILE_NAME = "onlyoffice.properties";
    private Properties properties;


    @Override
    protected Configuration doParse() {
        return null;
    }
}
