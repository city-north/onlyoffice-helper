package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The document permission section allows to change the permission for the document to be edited and downloaded or not.
 * </p>
 *
 * @author EricChen 2020/03/05 22:51
 * @see <a href='https://api.onlyoffice.com/editors/config/document/permissions'>official API</a>
 */
public class Permissions {

    /**
     * Defines if the document can be commented or not.
     * In case the commenting permission is set to "true" the document side bar will contain the Comment menu option;
     * the document commenting will only be available for the document editor if the mode parameter is set to edit.
     * The default value coincides with the value of the edit parameter.
     * In case edit is set to "true" and comment is also set to "true", the user will be able to edit the document and comment.
     * In case edit is set to "true" and comment is set to "false",
     * the user will be able to edit only, the corresponding commenting functionality will be available for viewing only,
     * the adding and editing of comments will be unavailable. In case edit is set to "false" and comment is set to "true",
     * the document will be available for commenting only. In case edit is set to "false" and review is set to "false" and comments is set to "true"
     * the fillForms value is not considered and filling the forms is not available.
     */
    private boolean comment;

    /**
     * Defines if the document can be downloaded or only viewed or edited online.
     * In case the downloading permission is set to "false" the Download as... menu option will be absent from the File menu. The default value is true.
     */
    private boolean download;


    /**
     * Defines if the document can be edited or only viewed.
     * In case the editing permission is set to "true" the File menu will contain the Edit Document menu option;
     * please note that if the editing permission is set to "false" the document will be opened in viewer and you will not be able to switch it to the editor even if the mode parameter is set to edit. The default value is true.
     */
    private boolean edit;


    /**
     * Defines if the document can be printed or not.
     * In case the printing permission is set to "false" the Print menu option will be absent from the File menu. The default value is true.
     */
    private boolean print;

    /**
     * Defines if the forms can be filled.
     * Filling in forms will only be available for the document editor if the mode parameter is set to edit. The default value coincides with the value of the edit or the review parameter.
     * In case edit is set to "true" or review is set to "true",
     * the fillForms value is not considered and the form filling is possible.
     * In case edit is set to "false" and review is set to "false" and fillForms is also set to "true",
     * the user can only fill forms in the document.
     * In case edit is set to "false" and review is set to "false" and fillForms is set to "true" the comments value is not considered and the commenting is not available.
     * The form filling only mode is currently available for Document Editor only.
     */
    private boolean fillForms;

    /**
     * Defines if the document can be reviewed or not. In case the reviewing permission is set to "true" the document status bar will contain the Review menu option;
     * the document review will only be available for the document editor if the mode parameter is set to edit. The default value coincides with the value of the edit parameter.
     * In case edit is set to "true" and review is also set to "true", the user will be able to edit the document,
     * accept/reject the changes made and switch to the review mode him-/herself.
     * In case edit is set to "true" and review is set to "false", the user will be able to edit only.
     * In case edit is set to "false" and review is set to "true", the document will be available in review mode only.
     */
    private boolean review;

    /**
     * @return
     */
    public boolean isComment() {
        return comment;
    }

    public Permissions setComment(boolean comment) {
        this.comment = comment;
        return this;
    }

    public boolean isDownload() {
        return download;
    }

    public Permissions setDownload(boolean download) {
        this.download = download;
        return this;
    }

    public boolean isEdit() {
        return edit;
    }

    public Permissions setEdit(boolean edit) {
        this.edit = edit;
        return this;
    }

    public boolean isPrint() {
        return print;
    }

    public Permissions setPrint(boolean print) {
        this.print = print;
        return this;
    }

    public boolean isFillForms() {
        return fillForms;
    }

    public Permissions setFillForms(boolean fillForms) {
        this.fillForms = fillForms;
        return this;
    }

    public boolean isReview() {
        return review;
    }

    public Permissions setReview(boolean review) {
        this.review = review;
        return this;
    }
}
