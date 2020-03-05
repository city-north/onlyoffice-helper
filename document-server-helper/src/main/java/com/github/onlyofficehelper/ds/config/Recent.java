package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * Defines the user currently viewing or editing the document:
 * </p>
 *
 * @author EricChen 2020/03/05 23:12
 */
public class Recent {

    /**
     * the full name of the user. Used since version 4.2,
     */
    private String name;

    /**
     * the first name of the user. Deprecated since version 4.2, please use name instead,
     */
    @Deprecated
    private String firstname;
    /**
     * the last name of the user. Deprecated since version 4.2, please use name instead
     */
    @Deprecated
    private String lastName;
    /**
     * the identification of the user
     */
    private String id;

    public String getName() {
        return name;
    }

    public Recent setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Recent setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Recent setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getId() {
        return id;
    }

    public Recent setId(String id) {
        this.id = id;
        return this;
    }
}
