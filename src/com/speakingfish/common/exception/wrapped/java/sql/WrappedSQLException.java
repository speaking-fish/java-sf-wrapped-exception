package com.speakingfish.common.exception.wrapped.java.sql;

import java.sql.SQLException;

import com.speakingfish.common.exception.WrappedException;

public class WrappedSQLException extends WrappedException {

    private static final long serialVersionUID = -882197856402214084L;

    public WrappedSQLException(SQLException cause) {
        super(cause);
    }

}
