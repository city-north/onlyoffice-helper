package com.github.onlyofficehelper.ds.builder;

/**
 * <p>
 * 可刷新读取器抽象
 * </p>
 *
 * @author EricChen
 */
public interface RefreshableReader {

    /**
     * 刷新配置文件
     */
    void refresh();
}
