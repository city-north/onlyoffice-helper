package com.github.onlyofficehelper.ds.key.generator;

/**
 * <p>
 * description
 * </p>
 *
 * @author EricChen 2020/09/24 18:03
 */
public abstract class BasicGenerator implements KeyGenerator {

    private static int MAX_KEY_LENGTH = 20;

    @Override
    public String generateKey() {
        final String s = doGenerateKey();
        if (s.length() > MAX_KEY_LENGTH) {
            return s.substring(0, MAX_KEY_LENGTH);
        }
        return s;
    }

    /**
     * 生成key
     *
     * @return documentKey
     */
    public abstract String doGenerateKey();
}
