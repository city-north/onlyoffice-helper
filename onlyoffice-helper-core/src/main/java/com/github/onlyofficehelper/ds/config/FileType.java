package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.ds.utils.FileUtils;

/**
 * <p>
 * Defines the type of the file for the source viewed or edited document.
 * </p>
 *
 * @author EricChen 2020/03/06 00:08
 * @see FileUtils
 */
public enum FileType {
    TEXT("docx"),
    SPREAD_SHEET("xlsx"),
    PRESENTATION("pptx");
    private String value;

    FileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
