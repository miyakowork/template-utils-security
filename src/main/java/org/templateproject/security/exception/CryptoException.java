package org.templateproject.security.exception;

/**
 * 加密异常
 *
 * @author Looly
 */
public class CryptoException extends RuntimeException {

    public CryptoException(Throwable e) {
        super(e);
    }

    public CryptoException(String message) {
        super(message);
    }

    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
