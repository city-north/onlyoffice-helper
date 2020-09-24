package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The Configuration of OnlyOffice DocumentServer
 * </p>
 *
 * @author EricChen 2020/02/25 00:08
 * @see <a href='https://api.onlyoffice.com/editors/basic'>official API of OnlyOffice Document Server</a>
 */
public class Configuration {

    /**
     * The document section allows to change all the parameters pertaining to the document (title, url, file type, etc.).
     */
    private Document document = new Document();
    /**
     * The editorConfig section allows to change the parameters pertaining to the editor interface: opening mode (viewer or editor), interface language, additional buttons, etc.).
     */
    private Editor editor = new Editor();
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

    public Document getDocument() {
        return document;
    }

    public Configuration setDocument(Document document) {
        this.document = document;
        return this;
    }

    public Editor getEditor() {
        return editor;
    }

    public Configuration setEditor(Editor editor) {
        this.editor = editor;
        return this;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Configuration setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public Configuration setHeight(String height) {
        this.height = height;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Configuration setToken(String token) {
        this.token = token;
        return this;
    }

    public String getType() {
        return type;
    }

    public Configuration setType(String type) {
        this.type = type;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public Configuration setWidth(String width) {
        this.width = width;
        return this;
    }
}
