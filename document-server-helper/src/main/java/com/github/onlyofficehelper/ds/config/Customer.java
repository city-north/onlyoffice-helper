package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * Contains the information which will be displayed int the editor About section and visible to all the editor users.
 * </p>
 *
 * @author EricChen 2020/03/05 23:25
 */
public class Customer {

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

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Customer setInfo(String info) {
        this.info = info;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public Customer setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Customer setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getWww() {
        return www;
    }

    public Customer setWww(String www) {
        this.www = www;
        return this;
    }
}
