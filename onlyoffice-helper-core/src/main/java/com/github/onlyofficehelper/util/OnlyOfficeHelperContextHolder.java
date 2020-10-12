package com.github.onlyofficehelper.util;

import com.github.onlyofficehelper.core.OnlyOfficeHelperContext;
import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.ds.config.Document;
import com.github.onlyofficehelper.ds.config.Permissions;

/**
 * <p>
 * description
 * </p>
 *
 * @author EricChen
 */
public class OnlyOfficeHelperContextHolder {

    private static final ThreadLocal<OnlyOfficeHelperContext> LOCAL_CONTEXT = new ThreadLocal<>();

    private OnlyOfficeHelperContextHolder() {
        throw new AssertionError("OnlyOfficeHelperContextHolder can not be initialized");
    }

    public static void setLocalContext(OnlyOfficeHelperContext onlyOfficeHelperContext) {
        LOCAL_CONTEXT.set(onlyOfficeHelperContext);
    }


    public static OnlyOfficeHelperContext getLocalContext() {
        return LOCAL_CONTEXT.get();
    }

    public static void remove() {
        LOCAL_CONTEXT.remove();
    }

    public static Configuration getConfiguration() {
        return getLocalContext().getConfiguration();
    }

    public static void setConfiguration(Configuration configuration) {
        getLocalContext().setConfiguration(configuration);
    }

    public static Document getDocument() {
        return getConfiguration().getDocument();
    }

    public static Permissions getPermissions() {
        return getDocument().getPermissions();
    }
}
