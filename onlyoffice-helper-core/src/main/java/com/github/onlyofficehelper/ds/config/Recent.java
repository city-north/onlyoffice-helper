package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * Defines the user currently viewing or editing the document:
 * </p>
 *
 * @author EricChen 2020/03/05 23:12
 */
@OnlyOfficeConfig(prefix = Recent.PREFIX)
public class Recent {

    public static final String PREFIX = "onlyoffice.documentserver.editor.recent";

    public static final String NAME = PREFIX + ".name";
    public static final String FIRSTNAME = PREFIX + ".firstname";
    public static final String LASTNAME = PREFIX + ".lastName";
    public static final String ID = PREFIX + ".id";

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

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
