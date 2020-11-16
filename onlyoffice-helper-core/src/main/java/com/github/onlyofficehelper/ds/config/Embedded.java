package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * The embedded section is for the embedded document type only (see the config section to find out how to define the embedded document type).
 * It allows to change the settings which define the behavior of the buttons in the embedded mode.
 * </p>
 *
 * @author EricChen 2020/03/05 23:14
 */
@OnlyOfficeConfig(prefix = Embedded.PREFIX)
public class Embedded {
    public static final String PREFIX = "onlyoffice.documentserver.editor.embedded";

    public static final String EMBED_URL = PREFIX + ".embedUrl";
    public static final String FULL_SCREEN_URL = PREFIX + ".fullscreenUrl";
    public static final String SAVE_URL = PREFIX + ".saveUrl";
    public static final String SHARE_URL = PREFIX + ".shareUrl";
    public static final String TOOLBAR_DOCKED = PREFIX + ".toolbarDocked";


    /**
     * Defines the absolute URL to the document serving as a source file for the document embedded into the web page.
     */
    private String embedUrl;
    /**
     * Defines the absolute URL to the document which will open in full screen mode.
     */
    private String fullscreenUrl;
    /**
     * Defines the absolute URL that will allow the document to be saved onto the user personal computer.
     */
    private String saveUrl;
    /**
     * Defines the absolute URL that will allow other users to share this document.
     */
    private String shareUrl;
    /**
     * Defines the place for the embedded viewer toolbar, can be either top or bottom.
     */
    private String toolbarDocked;


    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public String getFullscreenUrl() {
        return fullscreenUrl;
    }

    public void setFullscreenUrl(String fullscreenUrl) {
        this.fullscreenUrl = fullscreenUrl;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getToolbarDocked() {
        return toolbarDocked;
    }

    public void setToolbarDocked(String toolbarDocked) {
        this.toolbarDocked = toolbarDocked;
    }
}
