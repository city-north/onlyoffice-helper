package com.github.onlyofficehelper;

import com.github.onlyofficehelper.ds.builder.ConfigurationReader;
import com.github.onlyofficehelper.ds.builder.DocumentServerBuilder;
import com.github.onlyofficehelper.json.DocumentServerToJsonConverter;

import java.util.Objects;

/**
 * <p>
 * OnlyOffice API 使用入口
 * </p>
 *
 * @author EricChen
 */
public class OnlyOfficeHelper {


    public static DocumentServerBuilder documentServer(ConfigurationReader configurationReader) {
        Objects.requireNonNull(configurationReader);
        return new DocumentServerBuilder(configurationReader, new DocumentServerToJsonConverter());
    }
}
