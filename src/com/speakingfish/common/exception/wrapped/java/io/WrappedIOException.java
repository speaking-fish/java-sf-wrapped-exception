package com.speakingfish.common.exception.wrapped.java.io;

import java.io.IOException;

import com.speakingfish.common.exception.WrappedException;

public class WrappedIOException extends WrappedException {

    private static final long serialVersionUID = 5238031339715821957L;

    public WrappedIOException(IOException cause) {
        super(cause);
    }
    
    

}
