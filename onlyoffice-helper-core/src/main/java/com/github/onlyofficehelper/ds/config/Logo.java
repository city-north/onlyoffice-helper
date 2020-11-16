package com.github.onlyofficehelper.ds.config;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;

/**
 * <p>
 * Changes the image file at the top left corner of the Editor header. The recommended image height is 20 pixels
 * </p>
 *
 * @author EricChen 2020/03/05 23:29
 */
@OnlyOfficeConfig(prefix = Logo.PREFIX)
public class Logo {
    public static final String PREFIX = "onlyoffice.documentserver.customization.logo";

    public static final String IMAGE = PREFIX + ".image";
    public static final String IMAGE_EMBEDDED = PREFIX + ".imageEmbedded";
    public static final String URL = PREFIX + ".url";


    /**
     * path to the image file used to show in common work mode (i.e. in view and edit modes for all editors). The image must have the following size: 172x40,
     */
    private String image;

    /**
     * path to the image file used to show in the embedded mode (see the config section to find out how to define the embedded document type). The image must have the following size: 248x40,
     */
    private String imageEmbedded;

    /**
     * the absolute URL which will be used when someone clicks the logo image (can be used to go to your web site, etc.). Leave as an empty string or null to make the logo not clickable,
     */
    private String url;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageEmbedded() {
        return imageEmbedded;
    }

    public void setImageEmbedded(String imageEmbedded) {
        this.imageEmbedded = imageEmbedded;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
