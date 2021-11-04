package com.example.demo.logging;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class ManagementLogger implements Logger {
    private final Logger logger;

    public ManagementLogger(Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public void trace(final String s) {
        logger.trace(appendPrefix(s));
    }

    @Override
    public void trace(final String s, final Object o) {
        logger.trace(appendPrefix(s), o);
    }

    @Override
    public void trace(final String s, final Object o, final Object o1) {
        logger.trace(appendPrefix(s), o, o1);
    }

    @Override
    public void trace(final String s, final Object... objects) {
        logger.trace(appendPrefix(s), objects);
    }

    @Override
    public void trace(final String s, final Throwable throwable) {
        logger.trace(appendPrefix(s), throwable);
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    @Override
    public void trace(final Marker marker, final String s) {
        logger.trace(marker, appendPrefix(s));
    }

    @Override
    public void trace(final Marker marker, final String s, final Object o) {
        logger.trace(marker, appendPrefix(s), o);
    }

    @Override
    public void trace(final Marker marker, final String s, final Object o, final Object o1) {
        logger.trace(marker, appendPrefix(s), o, o1);
    }

    @Override
    public void trace(final Marker marker, final String s, final Object... objects) {
        logger.trace(marker, appendPrefix(s), objects);
    }

    @Override
    public void trace(final Marker marker, final String s, final Throwable throwable) {
        logger.trace(marker, appendPrefix(s), throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public void debug(final String s) {
        logger.debug(appendPrefix(s));
    }

    @Override
    public void debug(final String s, final Object o) {
        logger.debug(appendPrefix(s), o);
    }

    @Override
    public void debug(final String s, final Object o, final Object o1) {
        logger.debug(appendPrefix(s), o, o1);
    }

    @Override
    public void debug(final String s, final Object... objects) {
        logger.debug(appendPrefix(s), objects);
    }

    @Override
    public void debug(final String s, final Throwable throwable) {
        logger.debug(appendPrefix(s), throwable);
    }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    @Override
    public void debug(final Marker marker, final String s) {
        logger.debug(marker, appendPrefix(s));
    }

    @Override
    public void debug(final Marker marker, final String s, final Object o) {
        logger.debug(marker, appendPrefix(s), o);
    }

    @Override
    public void debug(final Marker marker, final String s, final Object o, final Object o1) {
        logger.debug(marker, appendPrefix(s), o, o1);
    }

    @Override
    public void debug(final Marker marker, final String s, final Object... objects) {
        logger.debug(marker, appendPrefix(s), objects);
    }

    @Override
    public void debug(final Marker marker, final String s, final Throwable throwable) {
        logger.debug(marker, appendPrefix(s), throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public void info(final String s) {
        logger.info(appendPrefix(s));
    }

    @Override
    public void info(final String s, final Object o) {
        logger.info(appendPrefix(s), o);
    }

    @Override
    public void info(final String s, final Object o, final Object o1) {
        logger.info(appendPrefix(s), o, o1);
    }

    @Override
    public void info(final String s, final Object... objects) {
        logger.info(appendPrefix(s), objects);
    }

    @Override
    public void info(final String s, final Throwable throwable) {
        logger.info(appendPrefix(s), throwable);
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return isInfoEnabled(marker);
    }

    @Override
    public void info(final Marker marker, final String s) {
        logger.info(marker, appendPrefix(s));
    }

    @Override
    public void info(final Marker marker, final String s, final Object o) {
        logger.info(marker, appendPrefix(s), o);
    }

    @Override
    public void info(final Marker marker, final String s, final Object o, final Object o1) {
        logger.info(marker, appendPrefix(s), o, o1);
    }

    @Override
    public void info(final Marker marker, final String s, final Object... objects) {
        logger.info(marker, appendPrefix(s), objects);
    }

    @Override
    public void info(final Marker marker, final String s, final Throwable throwable) {
        logger.info(marker, appendPrefix(s), throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public void warn(final String s) {
        logger.warn(appendPrefix(s));
    }

    @Override
    public void warn(final String s, final Object o) {
        logger.warn(appendPrefix(s), o);
    }

    @Override
    public void warn(final String s, final Object... objects) {
        logger.warn(appendPrefix(s), objects);
    }

    @Override
    public void warn(final String s, final Object o, final Object o1) {
        logger.warn(appendPrefix(s), o, o1);
    }

    @Override
    public void warn(final String s, final Throwable throwable) {
        logger.warn(appendPrefix(s), throwable);
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    @Override
    public void warn(final Marker marker, final String s) {
        logger.warn(marker, appendPrefix(s));
    }

    @Override
    public void warn(final Marker marker, final String s, final Object o) {
        logger.warn(marker, appendPrefix(s), o);
    }

    @Override
    public void warn(final Marker marker, final String s, final Object o, final Object o1) {
        logger.warn(marker, appendPrefix(s), o, o1);
    }

    @Override
    public void warn(final Marker marker, final String s, final Object... objects) {
        logger.warn(marker, appendPrefix(s), objects);
    }

    @Override
    public void warn(final Marker marker, final String s, final Throwable throwable) {
        logger.warn(marker, appendPrefix(s), throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public void error(final String s) {
        logger.error(appendPrefix(s));
    }

    @Override
    public void error(final String s, final Object o) {
        logger.error(appendPrefix(s), o);
    }

    @Override
    public void error(final String s, final Object o, final Object o1) {
        logger.error(appendPrefix(s), o, o1);
    }

    @Override
    public void error(final String s, final Object... objects) {
        logger.error(appendPrefix(s), objects);
    }

    @Override
    public void error(final String s, final Throwable throwable) {
        logger.error(appendPrefix(s), throwable);
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    @Override
    public void error(final Marker marker, final String s) {
        logger.error(marker, appendPrefix(s));
    }

    @Override
    public void error(final Marker marker, final String s, final Object o) {
        logger.error(marker, appendPrefix(s), o);
    }

    @Override
    public void error(final Marker marker, final String s, final Object o, final Object o1) {
        logger.error(marker, appendPrefix(s), o, o1);
    }

    @Override
    public void error(final Marker marker, final String s, final Object... objects) {
        logger.error(marker, appendPrefix(s), objects);
    }

    @Override
    public void error(final Marker marker, final String s, final Throwable throwable) {
        logger.error(marker, appendPrefix(s), throwable);
    }

    protected String appendPrefix(String message) {
        long threadId = Thread.currentThread().getId();
        String txId = ManagementLoggerFactory.txIdMap.get(threadId);
        txId = Strings.nullToEmpty(txId);

        return new StringBuffer(txId)
                .append(", msg=")
                .append(message)
                .toString();
    }

}

