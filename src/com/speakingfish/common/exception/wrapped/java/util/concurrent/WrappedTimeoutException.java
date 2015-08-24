package com.speakingfish.common.exception.wrapped.java.util.concurrent;

import java.util.concurrent.TimeoutException;

import com.speakingfish.common.exception.WrappedException;

public class WrappedTimeoutException extends WrappedException {

    private static final long serialVersionUID = 1967829529948358102L;

    public WrappedTimeoutException(TimeoutException cause) {
        super(cause);
    }

}
