package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The plugins section allows to connect the special add-ons to your Document Server installation which will help you add additional features to document editors.
 * </p>
 *
 * @author EricChen 2020/03/05 23:15
 */
public class Plugins {

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

    public Plugins setAutostart(String[] autostart) {
        this.autostart = autostart;
        return this;
    }

    public String[] getPluginsData() {
        return pluginsData;
    }

    public Plugins setPluginsData(String[] pluginsData) {
        this.pluginsData = pluginsData;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Plugins setUrl(String url) {
        this.url = url;
        return this;
    }
}
