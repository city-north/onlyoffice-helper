package com.github.onlyofficehelper.exception;

/**
 * @author EricChen 2020/03/09 00:27
 */
public class ParserException extends OnlyOfficeException {

    public ParserException() {
        super();
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }

}
