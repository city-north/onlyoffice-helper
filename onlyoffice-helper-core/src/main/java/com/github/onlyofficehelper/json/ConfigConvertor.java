package com.github.onlyofficehelper.json;

/**
 * <p>
 * 配置转换器基础抽象
 * </p>
 *
 * @author EricChen
 */
@FunctionalInterface
public interface ConfigConvertor<T, S> {


    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    T convert(S source);


}
