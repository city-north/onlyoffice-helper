package com.github.onlyofficehelper.annotation;

import java.lang.annotation.*;
import java.util.Map;

/**
 * <p>
 * 标注在OnlyOffice 配置类 JavaBean上,用于写入属性
 * </p>
 *
 * @author EricChen
 * @see com.github.onlyofficehelper.ds.utils.OnlyOfficeConfigUtil#fillConfiguration(Object, Map)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface OnlyOfficeConfig {

    /**
     * 配置的前缀
     */
    String prefix();
}
