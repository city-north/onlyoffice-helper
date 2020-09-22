package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The document section allows to change all the parameters pertaining to the document (title, url, file type, etc.).
 * </p>
 *
 * @author EricChen 2020/02/25 00:13
 * @see <a href='https://api.onlyoffice.com/editors/config/document'>official API</a>
 */
public class Document {

    /**
     * Defines the type of the file for the source viewed or edited document.
     * eg:	"docx"
     */
    private String fileType;

    /**
     * Defines the unique document identifier used for document recognition by the service.
     * In case the known key is sent the document will be taken from the cache.
     * Every time the document is edited and saved, the key must be generated anew.
     * The document url can be used as the key but without the special characters and the length is limited to 20 symbols.
     * eg:"Khirz6zTPdfd7"
     */
    private String key;

    /**
     * Defines the desired file name for the viewed or edited document which will also be used as file name when the document is downloaded.
     * eg:	"Example Document Title.docx"
     */
    private String title;

    /**
     * Defines the absolute URL where the source viewed or edited document is stored.
     * eg:	"https://example.com/url-to-example-document.docx"
     */
    private String url;

    /**
     * The document info section allows to change additional parameters for the document (document owner, folder where the document is stored, uploading date, sharing settings).
     */
    private Info info;

    /**
     * The document permission section allows to change the permission for the document to be edited and downloaded or not.
     */
    private Permissions permissions;

    public String getFileType() {
        return fileType;
    }

    public Document setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public String getKey() {
        return key;
    }

    public Document setKey(String key) {
        this.key = key;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Document setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Document setUrl(String url) {
        this.url = url;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }


}
