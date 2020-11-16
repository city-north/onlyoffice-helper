package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

import java.util.List;

/**
 * <p>
 * The editorConfig section allows to change the parameters pertaining to the editor interface: opening mode (viewer or editor), interface language, additional buttons, etc.).
 * </p>
 *
 * @author EricChen 2020/02/25 00:14
 * @see <a href='https://api.onlyoffice.com/editors/config/editor'>official API</a>
 */
@OnlyOfficeConfig(prefix = Editor.PREFIX)
public class Editor {
    public static final String PREFIX = "onlyoffice.documentserver.editor";
    public static final String ACTIONLINK = PREFIX + ".actionLink";
    public static final String CALLBACKURL = PREFIX + ".callbackUrl";
    public static final String CREATEURL = PREFIX + ".createUrl";
    public static final String LANG = PREFIX + ".lang";
    public static final String MODE = PREFIX + ".mode";


    /**
     * Specifies the data received from the document editing service using the onMakeActionLink event,
     * which contains the information about the bookmark in the document that will be scrolled to.
     */
    private String actionLink;

    /**
     * Specifies absolute URL to the document storage service (which must be implemented by the software integrators who use ONLYOFFICE Document Server on their own server).
     * eg:	"https://example.com/url-to-callback.ashx"
     */
    private String callbackUrl;

    /**
     * Defines the absolute URL of the document where it will be created and available after creation. If not specified, there will be no creation button.
     * eg:"https://example.com/url-to-create-document/"
     */
    private String createUrl;

    /**
     * Defines the editor interface language (if some other languages other than English are present).
     * Is set using the two letter (de, ru, it, etc.) language codes. The default value is "en".
     */
    private String lang;

    /**
     * Defines the editor opening mode.
     * Can be either view to open the document for viewing,
     * or edit to open the document in the editing mode allowing to apply changes to the document data.
     * The default value is "edit".
     */
    private String mode = "edit";

    /**
     * Defines the user currently viewing or editing the document:
     */
    private List<Recent> recent;

    /**
     * The customization section allows to customize the editor interface so that it looked like your other products (if there are any)
     */
    private Customization customization;

    /**
     * The embedded section is for the embedded document type only (see the config section to find out how to define the embedded document type).
     */
    private Embedded embedded;

    /**
     * The plugins section allows to connect the special add-ons to your Document Server installation which will help you add additional features to document editors.
     */
    private Plugins plugins;


    public String getActionLink() {
        return actionLink;
    }

    public void setActionLink(String actionLink) {
        this.actionLink = actionLink;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCreateUrl() {
        return createUrl;
    }

    public void setCreateUrl(String createUrl) {
        this.createUrl = createUrl;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<Recent> getRecent() {
        return recent;
    }

    public void setRecent(List<Recent> recent) {
        this.recent = recent;
    }

    public Customization getCustomization() {
        return customization;
    }

    public void setCustomization(Customization customization) {
        this.customization = customization;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public Plugins getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugins plugins) {
        this.plugins = plugins;
    }
}
