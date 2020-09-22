package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The embedded section is for the embedded document type only (see the config section to find out how to define the embedded document type).
 * It allows to change the settings which define the behavior of the buttons in the embedded mode.
 * </p>
 *
 * @author EricChen 2020/03/05 23:14
 */
public class Embedded {

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

    public Embedded setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }

    public String getFullscreenUrl() {
        return fullscreenUrl;
    }

    public Embedded setFullscreenUrl(String fullscreenUrl) {
        this.fullscreenUrl = fullscreenUrl;
        return this;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public Embedded setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
        return this;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public Embedded setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }

    public String getToolbarDocked() {
        return toolbarDocked;
    }

    public Embedded setToolbarDocked(String toolbarDocked) {
        this.toolbarDocked = toolbarDocked;
        return this;
    }
}
