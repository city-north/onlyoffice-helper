package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * Contains the information which will be displayed int the editor About section and visible to all the editor users.
 * </p>
 *
 * @author EricChen 2020/03/05 23:25
 */
@OnlyOfficeConfig(prefix = Customer.PREFIX)
public class Customer {

    public static final String PREFIX = "onlyoffice.documentserver.editor.customization.customer";

    public static final String ADDRESS = PREFIX + ".address";
    public static final String INFO = PREFIX + ".info";
    public static final String LOGO = PREFIX + ".logo";
    public static final String MAIL = PREFIX + ".mail";
    public static final String NAME = PREFIX + ".name";
    public static final String WWW = PREFIX + ".www";


    /**
     * postal address of the company or person who gives access to the editors or the editor authors
     */
    private String address;
    /**
     * some additional information about the company or person you want the others to know,
     */
    private String info;
    /**
     * the path to the image logo (there are no special recommendations for this file,
     * but it would be better if it were in .png format with transparent background). The image must have the following size: 432x70
     */
    private String logo;
    /**
     * email address of the company or person who gives access to the editors or the editor authors
     */
    private String mail;
    /**
     * the name of the company or person who gives access to the editors or the editor authors
     */
    private String name;
    /**
     * home website address of the above company or person
     */
    private String www;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }
}
