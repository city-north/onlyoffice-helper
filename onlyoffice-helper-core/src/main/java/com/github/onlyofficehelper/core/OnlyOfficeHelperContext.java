package com.github.onlyofficehelper.core;


import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.file.OnlyOfficeFile;
import com.github.onlyofficehelper.user.OnlyOfficeUser;

/**
 * <p>
 * OnlyOfficeHelper 上下文
 * </p>
 *
 * @author EricChen
 */
public interface OnlyOfficeHelperContext {

    /**
     * 配置文件
     *
     * @return 获取配置文件
     */
    Configuration getConfiguration();

    /**
     * 获取onlyOffice文件
     *
     * @return OnlyOffice文件
     */
    OnlyOfficeFile getOnlyOfficeFile();


    /**
     * 获取当前编辑用户
     *
     * @return 获取当前编辑的用户
     */
    OnlyOfficeUser getOnlyOfficeUser();


}
