package com.github.onlyofficehelper.ds.utils;

import com.github.onlyofficehelper.annotation.OnlyOfficeConfig;
import com.github.onlyofficehelper.binding.OnlyOfficeConfigRegistry;
import com.github.onlyofficehelper.ds.config.Configuration;
import com.github.onlyofficehelper.exception.OnlyOfficeException;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * <p>
 * 工具类
 * </p>
 *
 * @author EricChen
 */
public class OnlyOfficeConfigUtil {


    /**
     * 递归填充 Configuration
     *
     * @param configuration            Configuration
     * @param onlyOfficeConfigRegistry 配置注册中心
     */
    public static void fillConfiguration(Configuration configuration, OnlyOfficeConfigRegistry onlyOfficeConfigRegistry) {
        if (configuration == null || onlyOfficeConfigRegistry == null) {
            return;
        }
        fillConfiguration(configuration, onlyOfficeConfigRegistry.getConfigMap());
    }


    /**
     * 递归填充 Configuration
     *
     * @param configuration Configuration
     * @param configMap     配置Map
     */
    public static void fillConfiguration(Object configuration, Map<String, String> configMap) {
        if (configMap == null || configMap.isEmpty()) {
            return;
        }
        BeanInfo beanInfo;
        try {
            beanInfo = Introspector.getBeanInfo(configuration.getClass(), Object.class);
        } catch (IntrospectionException e) {
            throw new OnlyOfficeException("can not get BeanInfo of OnlyOfficeConfig", e);
        }
        if (!configuration.getClass().isAnnotationPresent(OnlyOfficeConfig.class)) {
            return;
        }

        //属性描述
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            final Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod == null) {
                return;
            }
            String property = propertyDescriptor.getName();
            Object fieldValue = null;
            if (propertyDescriptor.getPropertyType().isAnnotationPresent(OnlyOfficeConfig.class)) {
                try {
                    fieldValue = propertyDescriptor.getPropertyType().newInstance();
                    fillConfiguration(fieldValue, configMap);
                } catch (Exception e) {
                    //ignore
                }
            } else {
                final OnlyOfficeConfig annotation = configuration.getClass().getAnnotation(OnlyOfficeConfig.class);
                final String prefix = annotation.prefix();
                fieldValue = configMap.get(prefix + "." + property);
            }
            if (fieldValue == null) {
                continue;
            }
            try {
                writeMethod.invoke(configuration, fieldValue);
            } catch (Exception e) {
                //ignore
            }
        }
    }
}