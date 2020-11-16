package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * Defines settings for the Go to Documents menu button and upper right corner button.
 * </p>
 *
 * @author EricChen 2020/03/05 23:33
 */
@OnlyOfficeConfig(prefix = Goback.PREFIX)
public class Goback {
    public static final String PREFIX = "onlyoffice.documentserver.editor.customization.goback";

    public static final String BLANK = PREFIX + ".blank";
    public static final String TEXT = PREFIX + ".text";
    public static final String URL = PREFIX + ".url";

    /**
     * open the website in the new browser tab/window (if the value is set to true)
     * or the current tab (if the value is set to false) when the Go to Documents button is clicked. The default value is true,
     */
    private boolean blank;

    /**
     * the text which will be displayed for the Go to Documents menu button and upper right corner button (i.e. instead of Go to Documents)
     */
    private String text;

    /**
     * the absolute URL to the website address which will be opened when clicking the Go to Documents menu button
     */
    private String url;

    public boolean isBlank() {
        return blank;
    }

    public void setBlank(boolean blank) {
        this.blank = blank;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
