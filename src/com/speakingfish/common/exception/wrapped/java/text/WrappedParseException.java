package com.speakingfish.common.exception.wrapped.java.text;

import java.text.ParseException;

import com.speakingfish.common.exception.WrappedException;

public class WrappedParseException extends WrappedException{

    private static final long serialVersionUID = 5066608662905553141L;

    public WrappedParseException(ParseException cause) {
        super(cause);
    }

}
