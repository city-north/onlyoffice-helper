package com.github.onlyofficehelper.file;

import java.net.URL;

/**
 * <p>
 * OnlyOffice 文件抽象
 * </p>
 *
 * @author EricChen 2020/10/12 21:34
 */
public class OnlyOfficeFile {

    /**
     * 文件唯一key , 使用 {@link com.github.onlyofficehelper.ds.key.generator.KeyGenerator} 创建
     */
    private String fileKey;

    private String fileName;

    private URL fileUrl;


}
