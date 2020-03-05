package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * Changes the image file at the top left corner of the Editor header. The recommended image height is 20 pixels
 * </p>
 *
 * @author EricChen 2020/03/05 23:29
 */
public class Logo {

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

    public Logo setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageEmbedded() {
        return imageEmbedded;
    }

    public Logo setImageEmbedded(String imageEmbedded) {
        this.imageEmbedded = imageEmbedded;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Logo setUrl(String url) {
        this.url = url;
        return this;
    }
}
