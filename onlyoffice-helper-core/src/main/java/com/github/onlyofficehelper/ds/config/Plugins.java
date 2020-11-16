package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * The plugins section allows to connect the special add-ons to your Document Server installation which will help you add additional features to document editors.
 * </p>
 *
 * @author EricChen 2020/03/05 23:15
 */
@OnlyOfficeConfig(prefix = Plugins.PREFIX)
public class Plugins {

    public static final String PREFIX = "onlyoffice.documentserver.editor.plugins";

    public static final String AUTOSTART = PREFIX + ".autostart";
    public static final String PLUGINS_DATA = PREFIX + ".pluginsData";
    public static final String URL = PREFIX + ".url";


    /**
     * Defines the array of the identifiers (as entered in config.json) for the plugins,
     * which will automatically start when the editor opens, and the order the plugins will run one-by-one.
     */
    private String[] autostart;

    /**
     * Defines the array of absolute URLs to the plugin configuration files (config.json).
     */
    private String[] pluginsData;

    /**
     * Defines the absolute URL to the directory where the plugins are stored. Deprecated since version 4.3, please use the absolute URLs in pluginsData field.
     */
    private String url;


    public String[] getAutostart() {
        return autostart;
    }

    public void setAutostart(String[] autostart) {
        this.autostart = autostart;
    }

    public String[] getPluginsData() {
        return pluginsData;
    }

    public void setPluginsData(String[] pluginsData) {
        this.pluginsData = pluginsData;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
