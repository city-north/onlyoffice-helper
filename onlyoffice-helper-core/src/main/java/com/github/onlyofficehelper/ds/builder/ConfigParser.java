package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.ds.config.Configuration;

/**
 * <p>
 * Parses a {@link Configuration}
 * </p>
 *
 * @author EricChen 2020/03/09 00:10
 */
public interface ConfigParser {

    /**
     * Parses the Config File
     *
     * @return {@link Configuration}
     */
    Configuration parse();
}
