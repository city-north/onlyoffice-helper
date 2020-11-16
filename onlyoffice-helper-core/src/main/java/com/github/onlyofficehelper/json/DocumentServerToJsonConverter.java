package com.github.onlyofficehelper.json;

import com.google.gson.Gson;

/**
 * <p>
 * A converter that converts a {@link com.github.onlyofficehelper.ds.builder.DocumentServer} to JSON
 * </p>
 *
 * @author EricChen
 */
public class DocumentServerToJsonConverter extends AbstractOnlyOfficeConvertor {
    private Gson gson = new Gson();

    @Override
    public String convert(Convertable source) {
        return gson.toJson(source);
    }
}
