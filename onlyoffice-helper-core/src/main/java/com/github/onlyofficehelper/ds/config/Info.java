package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * The document info section allows to change additional parameters for the document (document owner, folder where the document is stored, uploading date, sharing settings).
 * </p>
 *
 * @author EricChen 2020/03/05 22:47
 * @see <a href='https://api.onlyoffice.com/editors/config/document/info'>official API</a>
 */
@OnlyOfficeConfig(prefix = Info.PREFIX)
public class Info {
    public static final String PREFIX = "onlyoffice.documentserver.document.info";
    public static final String AUTHOR = PREFIX + ".author";
    public static final String CREATED = PREFIX + ".created";
    public static final String FOLDER = PREFIX + ".folder";
    public static final String OWNER = PREFIX + ".owner";
    public static final String UPLOADED = PREFIX + ".uploaded";

    /**
     * Defines the name of the document author/creator. Deprecated since version 5.4, please use owner instead.
     * eg:"John Smith"
     */
    private String author;

    /**
     * Defines the document creation date. Deprecated since version 5.4, please use uploaded instead.
     * eg: "2010-07-07 3:46 PM"
     */
    private String created;

    /**
     * Defines the folder where the document is stored (can be empty in case the document is stored in the root folder).
     * eg:"Example Files"
     */
    private String folder;

    /**
     * Defines the name of the document owner/creator.
     * eg: "John Smith"
     */
    private String owner;

    /**
     * Defines the document uploading date.
     * eg:"2010-07-07 3:46 PM"
     */
    private String uploaded;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }
}
