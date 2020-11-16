package com.github.onlyofficehelper.ds.builder;


import com.github.onlyofficehelper.ds.config.*;
import com.github.onlyofficehelper.exception.ParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * <p>
 * Properties Config Builder
 * </p>
 *
 * @author EricChen
 */
public class PropertiesConfigurationReader extends AbstractConfigurationReader {
    public static final String DEFAULT_CONFIG_FILE_NAME = "onlyoffice.properties";
    private String configFile;

    public static final String DOCUMENT_SERVER_PREFIX = "onlyoffice.documentserver";
    /**
     * DocumentServer 所在ip或者域名
     */
    public static final String DOCUMENT_SERVER_URL = DOCUMENT_SERVER_PREFIX + ".url";
    private Properties properties;

    public PropertiesConfigurationReader(String configFileName) {
        configFile = configFileName;
        refresh();
    }

    public PropertiesConfigurationReader() {
        this(DEFAULT_CONFIG_FILE_NAME);
    }


    @Override
    public Configuration read() {
        if (properties == null) {
            refresh();
        }
        return read(DEFAULT_CONFIG_FILE_NAME);
    }

    @Override
    public Configuration read(String location) {
        Objects.requireNonNull(location);
        readDocServiceUrl(properties.getProperty(DOCUMENT_SERVER_URL));
        readDocument(properties);
        readEditor(properties);
        return buildConfiguration();
    }


    protected void readEditor(Properties properties) {
        putConfig(Editor.ACTIONLINK, properties.getProperty(Editor.ACTIONLINK));
        putConfig(Editor.CALLBACKURL, properties.getProperty(Editor.CALLBACKURL));
        putConfig(Editor.CREATEURL, properties.getProperty(Editor.CREATEURL));
        putConfig(Editor.LANG, properties.getProperty(Editor.LANG));
        putConfig(Editor.MODE, properties.getProperty(Editor.MODE));
        readCustomization(properties);
        readEmbedded(properties);
        readPlugins(properties);
        readRecent(properties);
    }

    protected void readRecent(Properties properties) {
        putConfig(Recent.NAME, properties.getProperty(Recent.NAME));
        putConfig(Recent.FIRSTNAME, properties.getProperty(Recent.FIRSTNAME));
        putConfig(Recent.LASTNAME, properties.getProperty(Recent.LASTNAME));
        putConfig(Recent.ID, properties.getProperty(Recent.ID));
    }

    protected void readPlugins(Properties properties) {
        putConfig(Plugins.AUTOSTART, properties.getProperty(Plugins.AUTOSTART));
        putConfig(Plugins.PLUGINS_DATA, properties.getProperty(Plugins.PLUGINS_DATA));
        putConfig(Plugins.URL, properties.getProperty(Plugins.URL));
    }

    protected void readEmbedded(Properties properties) {
        putConfig(Embedded.EMBED_URL, properties.getProperty(Embedded.EMBED_URL));
        putConfig(Embedded.FULL_SCREEN_URL, properties.getProperty(Embedded.FULL_SCREEN_URL));
        putConfig(Embedded.SAVE_URL, properties.getProperty(Embedded.SAVE_URL));
        putConfig(Embedded.SHARE_URL, properties.getProperty(Embedded.SHARE_URL));
        putConfig(Embedded.TOOLBAR_DOCKED, properties.getProperty(Embedded.TOOLBAR_DOCKED));
    }

    protected void readCustomization(Properties properties) {
        putConfig(Customization.AUTO_SAVE, properties.getProperty(Customization.AUTO_SAVE));
        putConfig(Customization.CHAT, properties.getProperty(Customization.CHAT));
        putConfig(Customization.COMMENT_AUTHOR_ONLY, properties.getProperty(Customization.COMMENT_AUTHOR_ONLY));
        putConfig(Customization.COMMENTS, properties.getProperty(Customization.COMMENTS));
        putConfig(Customization.COMPACT_HEADER, properties.getProperty(Customization.COMPACT_HEADER));
        putConfig(Customization.COMPACT_TOOLBAR, properties.getProperty(Customization.COMPACT_TOOLBAR));
        putConfig(Customization.FEEDBACK, properties.getProperty(Customization.FEEDBACK));
        putConfig(Customization.FORCE_SAVE, properties.getProperty(Customization.FORCE_SAVE));
        putConfig(Customization.HELP, properties.getProperty(Customization.HELP));
        putConfig(Customization.HIDE_RIGHT_MENU, properties.getProperty(Customization.HIDE_RIGHT_MENU));
        putConfig(Customization.SHOW_REVIEW_CHANGES, properties.getProperty(Customization.SHOW_REVIEW_CHANGES));
        putConfig(Customization.TOOL_BAR_NO_TABS, properties.getProperty(Customization.TOOL_BAR_NO_TABS));
        putConfig(Customization.ZOOM, properties.getProperty(Customization.ZOOM));
        readCustomer(properties);
        readLogo(properties);
        readGoback(properties);
    }

    private void readGoback(Properties properties) {
        putConfig(Goback.BLANK, properties.getProperty(Goback.BLANK));
        putConfig(Goback.TEXT, properties.getProperty(Goback.TEXT));
        putConfig(Goback.URL, properties.getProperty(Goback.URL));
    }

    private void readLogo(Properties properties) {
        putConfig(Logo.IMAGE, properties.getProperty(Logo.IMAGE));
        putConfig(Logo.IMAGE_EMBEDDED, properties.getProperty(Logo.IMAGE_EMBEDDED));
        putConfig(Logo.URL, properties.getProperty(Logo.URL));
    }

    private void readCustomer(Properties properties) {
        putConfig(Customer.ADDRESS, properties.getProperty(Customer.ADDRESS));
        putConfig(Customer.INFO, properties.getProperty(Customer.INFO));
        putConfig(Customer.LOGO, properties.getProperty(Customer.LOGO));
        putConfig(Customer.MAIL, properties.getProperty(Customer.MAIL));
        putConfig(Customer.NAME, properties.getProperty(Customer.NAME));
        putConfig(Customer.WWW, properties.getProperty(Customer.WWW));
    }

    protected void readDocument(Properties properties) {
        putConfig(Document.FILE_TYPE, properties.getProperty(Document.FILE_TYPE));
        putConfig(Document.KEY, properties.getProperty(Document.KEY));
        putConfig(Document.TITLE, properties.getProperty(Document.TITLE));
        putConfig(Document.URL, properties.getProperty(Document.URL));
        readInfo(properties);
        readPermissions(properties);
    }

    protected void readInfo(Properties properties) {
        putConfig(Info.AUTHOR, properties.getProperty(Info.AUTHOR));
        putConfig(Info.CREATED, properties.getProperty(Info.CREATED));
        putConfig(Info.FOLDER, properties.getProperty(Info.FOLDER));
        putConfig(Info.OWNER, properties.getProperty(Info.OWNER));
    }

    protected void readPermissions(Properties properties) {
        putConfig(Permissions.COMMENT, properties.getProperty(Permissions.COMMENT));
        putConfig(Permissions.DOWNLOAD, properties.getProperty(Permissions.DOWNLOAD));
        putConfig(Permissions.EDIT, properties.getProperty(Permissions.EDIT));
        putConfig(Permissions.PRINT, properties.getProperty(Permissions.PRINT));
        putConfig(Permissions.FILL_FORMS, properties.getProperty(Permissions.FILL_FORMS));
        putConfig(Permissions.REVIEW, properties.getProperty(Permissions.REVIEW));
    }


    @Override
    public void refresh() {
        try {
            properties = new Properties();
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(configFile);
            properties.load(stream);
        } catch (IOException ex) {
            throw new ParserException("can not load default properties file onlyoffice.properties ");
        }
    }
}


