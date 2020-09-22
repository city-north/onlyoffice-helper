package com.github.onlyofficehelper.ds.builder;

import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.exception.ParserException;

/**
 * @author EricChen 2020/03/08 23:53
 */
public abstract class AbstractConfigParser implements ConfigParser {
    private boolean parsed;

    protected Configuration configuration;

    public Configuration parse() {
        if (parsed) {
            throw new ParserException("Each ConfigParser can only be used once.");
        }
        configuration = this.doParse();
        return configuration;
    }


    protected abstract Configuration doParse();
}
