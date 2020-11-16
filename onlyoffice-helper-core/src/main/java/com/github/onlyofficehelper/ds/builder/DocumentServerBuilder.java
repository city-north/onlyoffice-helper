package com.github.onlyofficehelper.ds.builder;


import com.github.onlyofficehelper.json.AbstractOnlyOfficeConvertor;

/**
 * <p>
 * A build of {@link DocumentServer}
 * </p>
 *
 * @author EricChen
 */
public class DocumentServerBuilder {
    private ConfigurationReader configurationReader;
    private DocumentServer documentServer;
    private AbstractOnlyOfficeConvertor configConvertor;

    public DocumentServerBuilder(ConfigurationReader configurationReader, AbstractOnlyOfficeConvertor configConvertor) {
        this.configurationReader = configurationReader;
        documentServer = new DocumentServer();
        documentServer.setConfiguration(configurationReader.read());
        this.configConvertor = configConvertor;
    }

    public DocumentServerBuilder Logo(LogoBuilder logoBuilder) {
        //TOD
        return this;
    }

    public DocumentServer build() {
        return documentServer;
    }

    public String convert() {
        return configConvertor.convert(build());
    }


}
