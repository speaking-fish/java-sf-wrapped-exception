package com.speakingfish.common.exception.wrapped.java.lang;

import com.speakingfish.common.exception.WrappedException;

public class WrappedInterruptedException extends WrappedException {

    private static final long serialVersionUID = 7662248860558741245L;

    public WrappedInterruptedException(InterruptedException cause) {
        super(cause);
    }

}
