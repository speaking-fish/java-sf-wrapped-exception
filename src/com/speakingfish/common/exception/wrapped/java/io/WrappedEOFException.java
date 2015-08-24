package com.speakingfish.common.exception.wrapped.java.io;

import java.io.EOFException;

public class WrappedEOFException extends WrappedIOException {

    private static final long serialVersionUID = -5876586449306030363L;

    public WrappedEOFException(EOFException cause) { super(cause); }

}
