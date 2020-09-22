package com.github.onlyofficehelper.exception;

/**
 * @author EricChen 2020/03/09 00:25
 */
public class OnlyOfficeException extends RuntimeException {

    public OnlyOfficeException() {
        super();
    }

    public OnlyOfficeException(String message) {
        super(message);
    }

    public OnlyOfficeException(String message, Throwable cause) {
        super(message, cause);
    }

    public OnlyOfficeException(Throwable cause) {
        super(cause);
    }

}
