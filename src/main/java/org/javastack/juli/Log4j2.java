package org.javastack.juli;

import org.apache.juli.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 implements Log {
	public final Logger logger;

	public Log4j2() {
		this(LogManager.ROOT_LOGGER_NAME);
	}

	public Log4j2(final String name) {
		logger = LogManager.getLogger(name);
	}

	@Override
	public final boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	@Override
	public final boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	@Override
	public final boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	@Override
	public final boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	@Override
	public final boolean isFatalEnabled() {
		return logger.isFatalEnabled();
	}

	@Override
	public final boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	@Override
	public final void debug(final Object message) {
		logger.debug(message);
	}

	@Override
	public final void debug(final Object message, final Throwable t) {
		logger.debug(message, t);
	}

	@Override
	public final void trace(final Object message) {
		logger.trace(message);
	}

	@Override
	public final void trace(final Object message, final Throwable t) {
		logger.trace(message, t);
	}

	@Override
	public final void info(final Object message) {
		logger.info(message);
	}

	@Override
	public final void info(final Object message, final Throwable t) {
		logger.info(message, t);
	}

	@Override
	public final void warn(final Object message) {
		logger.warn(message);
	}

	@Override
	public final void warn(final Object message, final Throwable t) {
		logger.warn(message, t);
	}

	@Override
	public final void error(final Object message) {
		logger.error(message);
	}

	@Override
	public final void error(final Object message, final Throwable t) {
		logger.error(message, t);
	}

	@Override
	public final void fatal(final Object message) {
		logger.fatal(message);
	}

	@Override
	public final void fatal(final Object message, final Throwable t) {
		logger.fatal(message, t);
	}

	public static Log getInstance(final String name) {
		return new Log4j2(name);
	}
}