package com.github.onlyofficehelper;

import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.util.OnlyOfficeHelperContextHolder;

/**
 * <p>
 * DocumentServerHelper 核心入口
 * </p>
 *
 * @author EricChen
 */
public class DocumentServerHelper {

    private static Configuration defaultConfiguration;


    /**
     * 是否允许当前用户编辑
     *
     * @param canEdit 是否允许当前用户编辑
     * @return DocumentServerHelper
     */
    public DocumentServerHelper canEdit(boolean canEdit) {
        OnlyOfficeHelperContextHolder.getPermissions().setEdit(canEdit);
        return this;
    }

    /**
     * 是否允许当前用户评论
     *
     * @param canComment 是否允许当前用户编辑
     * @return DocumentServerHelper
     */
    public DocumentServerHelper canComment(boolean canComment) {
        OnlyOfficeHelperContextHolder.getPermissions().setComment(canComment);
        return null;
    }

}
