package com.speakingfish.common.exception;

public class WrappedException extends RuntimeException {

    private static final long serialVersionUID = 405657658597291739L;

    public WrappedException(Throwable cause) { super(cause); }
    
}
