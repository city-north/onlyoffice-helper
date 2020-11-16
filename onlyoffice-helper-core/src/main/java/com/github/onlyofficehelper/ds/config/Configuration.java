package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;
import com.github.onlyofficehelper.json.Convertable;

/**
 * <p>
 * The Configuration of OnlyOffice DocumentServer
 * </p>
 *
 * @author EricChen 2020/02/25 00:08
 * @see <a href='https://api.onlyoffice.com/editors/basic'>official API of OnlyOffice Document Server</a>
 */
@OnlyOfficeConfig(prefix = Configuration.PREFIX)
public class Configuration implements Convertable {
    public static final String PREFIX = "onlyoffice.documentserver";

    public static final String DOC_SERVICE_API = PREFIX + ".docServiceApi";
    public static final String TEMP_STORAGE_URL = PREFIX + ".tempStorageUrl";
    public static final String CONVERTER_URL = PREFIX + ".converterUrl";
    public static final String PRELOADER_URL = PREFIX + ".preloaderUrl";

    /**
     * documentServer 获取 js的地址,  例如 https://documentserver/web-apps/apps/api/documents/api.js
     */
    private String docServiceApi;
    private String tempStorageUrl;
    private String converterUrl;
    private String preloaderUrl;


    /**
     * The document section allows to change all the parameters pertaining to the document (title, url, file type, etc.).
     */
    private Document document = new Document();
    /**
     * The editorConfig section allows to change the parameters pertaining to the editor interface: opening mode (viewer or editor), interface language, additional buttons, etc.).
     */
    private Editor editorConfig = new Editor();
    /**
     * Defines the document type to be opened: open a text document
     * (.doc, .docm, .docx, .dot, .dotm, .dotx, .epub, .fodt, .htm, .html, .mht, .odt, .ott, .pdf, .rtf, .txt, .djvu, .xps)
     * for viewing or editing - text, open a spreadsheet (.csv, .fods, .ods, .ots, .xls, .xlsm, .xlsx, .xlt, .xltm, .xltx)
     * for viewing or editing - spreadsheet,
     * open a presentation (.fodp, .odp, .otp, .pot, .potm, .potx, .pps, .ppsm, .ppsx, .ppt, .pptm, .pptx) for viewing or editing - presentation.
     */
    private String documentType;
    /**
     * Defines the document height (100% by default) in the browser window.
     */
    private String height;
    /**
     * Defines the encrypted signature added to the Document Server config in the form of a token.
     */
    private String token;
    /**
     * Defines the platform type used to access the document. Can be: optimized to access the document from a desktop or laptop computer - desktop,
     * optimized to access the document from a tablet or a smartphone - mobile,
     * specifically formed to be easily embedded into a web page - embedded. The default value is "desktop".
     */
    private String type;
    /**
     * Defines the document width (100% by default) in the browser window.
     */
    private String width;

    public String getDocServiceApi() {
        return docServiceApi;
    }

    public void setDocServiceApi(String docServiceApi) {
        this.docServiceApi = docServiceApi;
    }

    public String getTempStorageUrl() {
        return tempStorageUrl;
    }

    public void setTempStorageUrl(String tempStorageUrl) {
        this.tempStorageUrl = tempStorageUrl;
    }

    public String getConverterUrl() {
        return converterUrl;
    }

    public void setConverterUrl(String converterUrl) {
        this.converterUrl = converterUrl;
    }

    public String getPreloaderUrl() {
        return preloaderUrl;
    }

    public void setPreloaderUrl(String preloaderUrl) {
        this.preloaderUrl = preloaderUrl;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Editor getEditorConfig() {
        return editorConfig;
    }

    public void setEditorConfig(Editor editorConfig) {
        this.editorConfig = editorConfig;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
}
