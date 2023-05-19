
package at_talend_jobs.koerber_data_into_snowflake_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;

//the import part of tLibraryLoad_1
//import java.util.List;

//the import part of tJava_1
//import java.util.List;

@SuppressWarnings("unused")

/**
 * Job: koerber_data_into_snowflake Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class koerber_data_into_snowflake implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "koerber_data_into_snowflake.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(koerber_data_into_snowflake.class);

	protected static void logIgnoredError(String message, Throwable cause) {
		log.error(message, cause);

	}

	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}

	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	private final static String utf8Charset = "UTF-8";

	// contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String, String> propertyTypes = new java.util.HashMap<>();

		public PropertiesWithType(java.util.Properties properties) {
			super(properties);
		}

		public PropertiesWithType() {
			super();
		}

		public void setContextType(String key, String type) {
			propertyTypes.put(key, type);
		}

		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}

	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();

	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties) {
			super(properties);
		}

		public ContextProperties() {
			super();
		}

		public void synchronizeContext() {

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "koerber_data_into_snowflake";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";

	private String cLabel = null;

	private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();

	private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
	private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
	public final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

	private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName,
			"_WvDJYOtkEe2HwtcbA5NKJQ", "0.1");
	private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

	private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(),
					new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	public void setDataSourceReferences(List serviceReferences) throws Exception {

		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();

		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils
				.getServices(serviceReferences, javax.sql.DataSource.class).entrySet()) {
			dataSources.put(entry.getKey(), entry.getValue());
			talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
	private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

	public String getExceptionStackTrace() {
		if ("failure".equals(this.getStatus())) {
			errorMessagePS.flush();
			return baos.toString();
		}
		return null;
	}

	private Exception exception;

	public Exception getException() {
		if ("failure".equals(this.getStatus())) {
			return this.exception;
		}
		return null;
	}

	private class TalendException extends Exception {

		private static final long serialVersionUID = 1L;

		private java.util.Map<String, Object> globalMap = null;
		private Exception e = null;

		private String currentComponent = null;
		private String cLabel = null;

		private String virtualComponentName = null;

		public void setVirtualComponentName(String virtualComponentName) {
			this.virtualComponentName = virtualComponentName;
		}

		private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
			this.currentComponent = errorComponent;
			this.globalMap = globalMap;
			this.e = e;
		}

		private TalendException(Exception e, String errorComponent, String errorComponentLabel,
				final java.util.Map<String, Object> globalMap) {
			this(e, errorComponent, globalMap);
			this.cLabel = errorComponentLabel;
		}

		public Exception getException() {
			return this.e;
		}

		public String getCurrentComponent() {
			return this.currentComponent;
		}

		public String getExceptionCauseMessage(Exception e) {
			Throwable cause = e;
			String message = null;
			int i = 10;
			while (null != cause && 0 < i--) {
				message = cause.getMessage();
				if (null == message) {
					cause = cause.getCause();
				} else {
					break;
				}
			}
			if (null == message) {
				message = e.getClass().getName();
			}
			return message;
		}

		@Override
		public void printStackTrace() {
			if (!(e instanceof TalendException || e instanceof TDieException)) {
				if (virtualComponentName != null && currentComponent.indexOf(virtualComponentName + "_") == 0) {
					globalMap.put(virtualComponentName + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				}
				globalMap.put(currentComponent + "_ERROR_MESSAGE", getExceptionCauseMessage(e));
				System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
			}
			if (!(e instanceof TDieException)) {
				if (e instanceof TalendException) {
					e.printStackTrace();
				} else {
					e.printStackTrace();
					e.printStackTrace(errorMessagePS);
					koerber_data_into_snowflake.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(koerber_data_into_snowflake.this, new Object[] { e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
						if (enableLogStash) {
							talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
							talendJobLogProcess(globalMap);
						}
					}
				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
	}

	public void tLibraryLoad_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tLibraryLoad_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tJava_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFTPGet_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFTPGet_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileUnarchive_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileList_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLibraryLoad_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tJava_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFTPGet_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tLibraryLoad_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tLibraryLoad_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tLibraryLoad_1 begin ] start
				 */

				ok_Hash.put("tLibraryLoad_1", false);
				start_Hash.put("tLibraryLoad_1", System.currentTimeMillis());

				currentComponent = "tLibraryLoad_1";

				int tos_count_tLibraryLoad_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tLibraryLoad_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLibraryLoad_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLibraryLoad_1 = new StringBuilder();
							log4jParamters_tLibraryLoad_1.append("Parameters:");
							log4jParamters_tLibraryLoad_1.append(
									"LIBRARY" + " = " + "mvn:org.talend.libraries/ant-1.10.1/6.0.0-SNAPSHOT/jar");
							log4jParamters_tLibraryLoad_1.append(" | ");
							log4jParamters_tLibraryLoad_1.append("HOTLIBS" + " = " + "[]");
							log4jParamters_tLibraryLoad_1.append(" | ");
							log4jParamters_tLibraryLoad_1.append("IMPORT" + " = " + "//import java.util.List;");
							log4jParamters_tLibraryLoad_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLibraryLoad_1 - " + (log4jParamters_tLibraryLoad_1));
						}
					}
					new BytesLimit65535_tLibraryLoad_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLibraryLoad_1", "tLibraryLoad_1", "tLibraryLoad");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tLibraryLoad_1 begin ] stop
				 */

				/**
				 * [tLibraryLoad_1 main ] start
				 */

				currentComponent = "tLibraryLoad_1";

				tos_count_tLibraryLoad_1++;

				/**
				 * [tLibraryLoad_1 main ] stop
				 */

				/**
				 * [tLibraryLoad_1 process_data_begin ] start
				 */

				currentComponent = "tLibraryLoad_1";

				/**
				 * [tLibraryLoad_1 process_data_begin ] stop
				 */

				/**
				 * [tLibraryLoad_1 process_data_end ] start
				 */

				currentComponent = "tLibraryLoad_1";

				/**
				 * [tLibraryLoad_1 process_data_end ] stop
				 */

				/**
				 * [tLibraryLoad_1 end ] start
				 */

				currentComponent = "tLibraryLoad_1";

				if (log.isDebugEnabled())
					log.debug("tLibraryLoad_1 - " + ("Done."));

				ok_Hash.put("tLibraryLoad_1", true);
				end_Hash.put("tLibraryLoad_1", System.currentTimeMillis());

				/**
				 * [tLibraryLoad_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLibraryLoad_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
			}

			tJava_1Process(globalMap);

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tLibraryLoad_1 finally ] start
				 */

				currentComponent = "tLibraryLoad_1";

				/**
				 * [tLibraryLoad_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", 1);
	}

	public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tJava_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tJava_1 begin ] start
				 */

				ok_Hash.put("tJava_1", false);
				start_Hash.put("tJava_1", System.currentTimeMillis());

				currentComponent = "tJava_1";

				int tos_count_tJava_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tJava_1", "tJava_1", "tJava");
					talendJobLogProcess(globalMap);
				}

				String foo = "bar";

				/**
				 * [tJava_1 begin ] stop
				 */

				/**
				 * [tJava_1 main ] start
				 */

				currentComponent = "tJava_1";

				tos_count_tJava_1++;

				/**
				 * [tJava_1 main ] stop
				 */

				/**
				 * [tJava_1 process_data_begin ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_begin ] stop
				 */

				/**
				 * [tJava_1 process_data_end ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 process_data_end ] stop
				 */

				/**
				 * [tJava_1 end ] start
				 */

				currentComponent = "tJava_1";

				ok_Hash.put("tJava_1", true);
				end_Hash.put("tJava_1", System.currentTimeMillis());

				/**
				 * [tJava_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJava_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
			}

			tFTPConnection_1Process(globalMap);

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tJava_1 finally ] start
				 */

				currentComponent = "tJava_1";

				/**
				 * [tJava_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFTPConnection_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tFTPConnection_1 begin ] start
				 */

				ok_Hash.put("tFTPConnection_1", false);
				start_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				currentComponent = "tFTPConnection_1";

				int tos_count_tFTPConnection_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPConnection_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
							log4jParamters_tFTPConnection_1.append("Parameters:");
							log4jParamters_tFTPConnection_1.append("HOST" + " = " + "\"ftp.envistacorp.com\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USER" + " = " + "\"VitaminShoppe\"");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:frX052AzC1EvdLgLqF5yzB5DXYNu+dtKfXKI29fMo4VBejOnWqThBPCi")
									.substring(0, 4) + "...");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("SFTP" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("AUTH_METHOD" + " = " + "PASSWORD");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_ENCODING" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_PROXY" + " = " + "false");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("CONNECTION_TIMEOUT" + " = " + "0");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("USE_STRICT_REPLY_PARSING" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("CONFIG_CLIENT" + " = " + "true");
							log4jParamters_tFTPConnection_1.append(" | ");
							log4jParamters_tFTPConnection_1.append("CLIENT_PARAMETERS" + " = " + "[{VALUE="
									+ ("\"ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,curve25519-sha256,curve25519-sha256@libssh.org,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256\"")
									+ ", PARAMETER=" + ("\"kex\"") + "}, {VALUE="
									+ ("\"ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256\"")
									+ ", PARAMETER=" + ("\"server_host_key\"") + "}, {VALUE="
									+ ("\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"")
									+ ", PARAMETER=" + ("\"cipher.s2c\"") + "}, {VALUE="
									+ ("\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"")
									+ ", PARAMETER=" + ("\"cipher.c2s\"") + "}, {VALUE="
									+ ("\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"")
									+ ", PARAMETER=" + ("\"mac.s2c\"") + "}, {VALUE="
									+ ("\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"")
									+ ", PARAMETER=" + ("\"mac.c2s\"") + "}]");
							log4jParamters_tFTPConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPConnection_1 - " + (log4jParamters_tFTPConnection_1));
						}
					}
					new BytesLimit65535_tFTPConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPConnection_1", "tFTPConnection_1", "tFTPConnection");
					talendJobLogProcess(globalMap);
				}

				int connectionTimeout_tFTPConnection_1 = Integer.valueOf(0);
				class MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {

					String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword(
							"enc:routine.encryption.key.v1:wvVJozFMixIJH0pHgoSwZMuZBk1NgCWlupsYbL5LKZBbew==");

					String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

					public String getPassphrase() {
						return passphrase_tFTPConnection_1;
					}

					public boolean promptPassword(String arg0) {
						return true;
					}

					public boolean promptPassphrase(String arg0) {
						return true;
					}

					public boolean promptYesNo(String arg0) {
						return true;
					}

					public void showMessage(String arg0) {
					}

					public String[] promptKeyboardInteractive(String destination, String name, String instruction,
							String[] prompt, boolean[] echo) {
						return new String[] { getPassword() };
					}

					public String getPassword() {

						final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil
								.decryptPassword(
										"enc:routine.encryption.key.v1:8TaYOJ+0AJZY6g8aA9eQvsgAPWpqXCEw0QcrxgZNZi897DnDRfzpz+qI");

						return decryptedPassword_tFTPConnection_1;

					}
				}
				;
				final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_1 = new MyUserInfo();

				boolean retry_tFTPConnection_1 = false;
				int retry_count_tFTPConnection_1 = 0;
				int retry_max_tFTPConnection_1 = 5;

				com.jcraft.jsch.Session session_tFTPConnection_1 = null;
				com.jcraft.jsch.Channel channel_tFTPConnection_1 = null;

				class JschLogger_tFTPConnection_1 implements com.jcraft.jsch.Logger {
					public boolean isEnabled(int level) {
						return true;
					}

					public void log(int level, String message) {

						log.debug(message);
					}
				}

				do {
					retry_tFTPConnection_1 = false;

					com.jcraft.jsch.JSch.setConfig("kex",
							"ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,curve25519-sha256,curve25519-sha256@libssh.org,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
					com.jcraft.jsch.JSch.setConfig("server_host_key",
							"ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
					com.jcraft.jsch.JSch.setConfig("cipher.s2c",
							"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com");
					com.jcraft.jsch.JSch.setConfig("cipher.c2s",
							"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com");
					com.jcraft.jsch.JSch.setConfig("mac.s2c",
							"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512");
					com.jcraft.jsch.JSch.setConfig("mac.c2s",
							"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512");
					com.jcraft.jsch.JSch.setLogger(new JschLogger_tFTPConnection_1());
					com.jcraft.jsch.JSch jsch_tFTPConnection_1 = new com.jcraft.jsch.JSch();

					session_tFTPConnection_1 = jsch_tFTPConnection_1.getSession("VitaminShoppe", "ftp.envistacorp.com",
							22);
					session_tFTPConnection_1.setConfig("PreferredAuthentications",
							"publickey,password,keyboard-interactive,gssapi-with-mic");

					log.info("tFTPConnection_1 - SFTP authentication using a password.");

					final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil
							.decryptPassword(
									"enc:routine.encryption.key.v1:E4kpNTUI/RBjvcx0ZpFnqufp65SoATzgrUomu20lbLV3oaqtjREXgxLE");

					session_tFTPConnection_1.setPassword(decryptedPassword_tFTPConnection_1);

					session_tFTPConnection_1.setUserInfo(defaultUserInfo_tFTPConnection_1);
					if (("true").equals(System.getProperty("http.proxySet"))) {

//check if the host is in the excludes for proxy
						boolean isHostIgnored_tFTPConnection_1 = false;
						String nonProxyHostsString_tFTPConnection_1 = System.getProperty("http.nonProxyHosts");
						String[] nonProxyHosts_tFTPConnection_1 = (nonProxyHostsString_tFTPConnection_1 == null)
								? new String[0]
								: nonProxyHostsString_tFTPConnection_1.split("\\|");
						for (String nonProxyHost : nonProxyHosts_tFTPConnection_1) {
							if (("ftp.envistacorp.com").matches(nonProxyHost.trim())) {
								isHostIgnored_tFTPConnection_1 = true;
								break;
							}
						}
						if (!isHostIgnored_tFTPConnection_1) {
							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(
									System.getProperty("http.proxyHost"),
									Integer.parseInt(System.getProperty("http.proxyPort")));
							if (!"".equals(System.getProperty("http.proxyUser"))) {
								proxy_tFTPConnection_1.setUserPasswd(System.getProperty("http.proxyUser"),
										System.getProperty("http.proxyPassword"));
							}
							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					} else if ("local".equals(System.getProperty("http.proxySet"))) {
						String uriString = "ftp.envistacorp.com" + ":" + 22;
						java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance()
								.getProxyForUriString(uriString);

						if (!proxyToUse.equals(java.net.Proxy.NO_PROXY)) {
							java.net.InetSocketAddress proxyAddress = (java.net.InetSocketAddress) proxyToUse.address();
							String proxyHost = proxyAddress.getAddress().getHostAddress();
							int proxyPort = proxyAddress.getPort();

							com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(proxyHost,
									proxyPort);

							org.talend.proxy.ProxyCreds proxyCreds = org.talend.proxy.TalendProxyAuthenticator
									.getInstance().getCredsForProxyURI(proxyHost + ":" + proxyPort);
							if (proxyCreds != null) {
								proxy_tFTPConnection_1.setUserPasswd(proxyCreds.getUser(), proxyCreds.getPass());
							}

							session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
						}
					}

					log.info("tFTPConnection_1 - Attempt to connect to  '" + "ftp.envistacorp.com" + "' with username '"
							+ "VitaminShoppe" + "'.");

					channel_tFTPConnection_1 = null;
					try {
						if (connectionTimeout_tFTPConnection_1 > 0) {
							session_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							session_tFTPConnection_1.connect();
						}
						channel_tFTPConnection_1 = session_tFTPConnection_1.openChannel("sftp");
						if (connectionTimeout_tFTPConnection_1 > 0) {
							channel_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
						} else {
							channel_tFTPConnection_1.connect();
						}
						log.info("tFTPConnection_1 - Connect to '" + "ftp.envistacorp.com" + "' has succeeded.");
					} catch (com.jcraft.jsch.JSchException e_tFTPConnection_1) {
						try {
							if (channel_tFTPConnection_1 != null) {
								channel_tFTPConnection_1.disconnect();
							}

							if (session_tFTPConnection_1 != null) {
								session_tFTPConnection_1.disconnect();
							}
						} catch (java.lang.Exception ce_tFTPConnection_1) {
							log.warn("tFTPConnection_1 - close sftp connection failed : "
									+ ce_tFTPConnection_1.getClass() + " : " + ce_tFTPConnection_1.getMessage());
						}

						String message_tFTPConnection_1 = new TalendException(null, null, null)
								.getExceptionCauseMessage(e_tFTPConnection_1);
						if (message_tFTPConnection_1.contains("Signature length not correct")
								|| message_tFTPConnection_1.contains("connection is closed by foreign host")) {
							retry_tFTPConnection_1 = true;
							retry_count_tFTPConnection_1++;
							log.info(
									"tFTPConnection_1 - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : "
											+ retry_count_tFTPConnection_1);
						} else {
							throw e_tFTPConnection_1;
						}
					}
				} while (retry_tFTPConnection_1 && (retry_count_tFTPConnection_1 < retry_max_tFTPConnection_1));

				com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp) channel_tFTPConnection_1;

				globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

				/**
				 * [tFTPConnection_1 begin ] stop
				 */

				/**
				 * [tFTPConnection_1 main ] start
				 */

				currentComponent = "tFTPConnection_1";

				tos_count_tFTPConnection_1++;

				/**
				 * [tFTPConnection_1 main ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_begin ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tFTPConnection_1 process_data_end ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 process_data_end ] stop
				 */

				/**
				 * [tFTPConnection_1 end ] start
				 */

				currentComponent = "tFTPConnection_1";

				if (log.isDebugEnabled())
					log.debug("tFTPConnection_1 - " + ("Done."));

				ok_Hash.put("tFTPConnection_1", true);
				end_Hash.put("tFTPConnection_1", System.currentTimeMillis());

				/**
				 * [tFTPConnection_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFTPConnection_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
			}

			tFTPGet_1Process(globalMap);

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tFTPConnection_1 finally ] start
				 */

				currentComponent = "tFTPConnection_1";

				/**
				 * [tFTPConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 1);
	}

	public void tFTPGet_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFTPGet_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tFTPGet_1 begin ] start
				 */

				ok_Hash.put("tFTPGet_1", false);
				start_Hash.put("tFTPGet_1", System.currentTimeMillis());

				currentComponent = "tFTPGet_1";

				int tos_count_tFTPGet_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFTPGet_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFTPGet_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFTPGet_1 = new StringBuilder();
							log4jParamters_tFTPGet_1.append("Parameters:");
							log4jParamters_tFTPGet_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("CONNECTION" + " = " + "tFTPConnection_1");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1
									.append("LOCALDIR" + " = " + "\"//wva-sql-etl/sftp/ftp_files/koerber_data/\"");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("REMOTEDIR" + " = " + "\"/Vitamin Shoppe/EDW Files/\"");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("SFTPOVERWRITE" + " = " + "overwrite");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("PERL5_REGEX" + " = " + "false");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("FILES" + " = " + "[{FILEMASK="
									+ ("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".xlsx\"")
									+ "}, {FILEMASK="
									+ ("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".zip\"")
									+ "}]");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFTPGet_1.append(" | ");
							log4jParamters_tFTPGet_1.append("PRINT_MESSAGE" + " = " + "false");
							log4jParamters_tFTPGet_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFTPGet_1 - " + (log4jParamters_tFTPGet_1));
						}
					}
					new BytesLimit65535_tFTPGet_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFTPGet_1", "tFTPGet_1", "tFTPGet");
					talendJobLogProcess(globalMap);
				}

				int nb_file_tFTPGet_1 = 0;
				final java.util.List<String> msg_tFTPGet_1 = new java.util.ArrayList<String>();

				class MyProgressMonitor_tFTPGet_1 implements com.jcraft.jsch.SftpProgressMonitor {

					private long percent = -1;

					public void init(int op, String src, String dest, long max) {
					}

					public boolean count(long count) {
						return true;
					}

					public void end() {
					}
				}

				class SFTPGetter_tFTPGet_1 {

					private com.jcraft.jsch.ChannelSftp cnlSFTP = null;

					private com.jcraft.jsch.SftpProgressMonitor monitor = null;

					private int count = 0;

					public void getAllFiles(String remoteDirectory, String localDirectory)
							throws com.jcraft.jsch.SftpException {

						chdir(remoteDirectory);
						java.util.Vector sftpFiles = cnlSFTP.ls(".");

						for (Object sftpFile : sftpFiles) {
							com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
							com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

							if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
								continue;
							}

							if (attrs.isDir()) {
								java.io.File localFile = new java.io.File(localDirectory + "/" + lsEntry.getFilename());
								if (!localFile.exists()) {
									localFile.mkdir();
								}
								getAllFiles(remoteDirectory + "/" + lsEntry.getFilename(),
										localDirectory + "/" + lsEntry.getFilename());
								chdir(remoteDirectory);
							} else if (!attrs.isLink()) {
								downloadFile(localDirectory, lsEntry.getFilename());
							}
						}
					}

					public void getFiles(String remoteDirectory, String localDirectory, String maskStr)
							throws com.jcraft.jsch.SftpException {

						chdir(remoteDirectory);
						java.util.Vector sftpFiles = cnlSFTP.ls(".");

						for (Object sftpFile : sftpFiles) {
							com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
							com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

							if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
								continue;
							}

							if (!attrs.isDir() && !attrs.isLink()) {

								if (lsEntry.getFilename().matches(maskStr)) {
									downloadFile(localDirectory, lsEntry.getFilename());
								}
							}
						}
					}

					public void chdir(String path) throws com.jcraft.jsch.SftpException {
						if (!".".equals(path)) {
							cnlSFTP.cd(path);
						}
					}

					public String pwd() throws com.jcraft.jsch.SftpException {
						return cnlSFTP.pwd();
					}

					private void downloadFile(String localFileName, String remoteFileName)
							throws com.jcraft.jsch.SftpException {

						try {
							cnlSFTP.get(remoteFileName, localFileName, monitor, com.jcraft.jsch.ChannelSftp.OVERWRITE);

							log.debug("tFTPGet_1 - Downloaded file " + (count + 1) + " : '" + remoteFileName
									+ "' successfully.");

							msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded successfully.");

							globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer OK.");
						} catch (com.jcraft.jsch.SftpException e) {
							globalMap.put("tFTPGet_1_ERROR_MESSAGE", e.getMessage());

							if (e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_FAILURE
									|| e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_BAD_MESSAGE) {
								msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded unsuccessfully.");
								globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer fail.");
							}
							throw e;
						}
						count++;
					}
				}

				com.jcraft.jsch.ChannelSftp c_tFTPGet_1 = (com.jcraft.jsch.ChannelSftp) globalMap
						.get("conn_tFTPConnection_1");

				if (c_tFTPGet_1 != null && c_tFTPGet_1.getSession() != null) {
					log.info("tFTPGet_1 - Use an existing connection.Connection username: "
							+ c_tFTPGet_1.getSession().getUserName() + ", Connection hostname: "
							+ c_tFTPGet_1.getSession().getHost() + ", Connection port: "
							+ c_tFTPGet_1.getSession().getPort() + ".");
				}

				if (c_tFTPGet_1.getHome() != null && !c_tFTPGet_1.getHome().equals(c_tFTPGet_1.pwd())) {
					c_tFTPGet_1.cd(c_tFTPGet_1.getHome());
				}
				com.jcraft.jsch.SftpProgressMonitor monitor_tFTPGet_1 = new MyProgressMonitor_tFTPGet_1();
				SFTPGetter_tFTPGet_1 getter_tFTPGet_1 = new SFTPGetter_tFTPGet_1();
				getter_tFTPGet_1.cnlSFTP = c_tFTPGet_1;
				getter_tFTPGet_1.monitor = monitor_tFTPGet_1;
				String remotedir_tFTPGet_1 = "/Vitamin Shoppe/EDW Files/";
				if (!".".equals(remotedir_tFTPGet_1)) {
					c_tFTPGet_1.cd(remotedir_tFTPGet_1);
				}
				java.util.List<String> maskList_tFTPGet_1 = new java.util.ArrayList<String>();

				maskList_tFTPGet_1.add("Vitamin Shoppe EDW All Modes Shipment Detail "
						+ TalendDate.formatDate("MM-dd-yyyy", TalendDate.getCurrentDate()) + ".xlsx");
				maskList_tFTPGet_1.add("Vitamin Shoppe EDW All Modes Shipment Detail "
						+ TalendDate.formatDate("MM-dd-yyyy", TalendDate.getCurrentDate()) + ".zip");
				String localdir_tFTPGet_1 = "//wva-sql-etl/sftp/ftp_files/koerber_data/";
//create folder if local direcotry (assigned by property) not exists
				java.io.File dirHandle_tFTPGet_1 = new java.io.File(localdir_tFTPGet_1);

				if (!dirHandle_tFTPGet_1.exists()) {
					dirHandle_tFTPGet_1.mkdirs();
				}
				String root_tFTPGet_1 = getter_tFTPGet_1.pwd();
				if ("/".equals(root_tFTPGet_1)) {
					root_tFTPGet_1 = ".";
				}

				log.info("tFTPGet_1 - Downloading files from the server.");
				for (String maskStr_tFTPGet_1 : maskList_tFTPGet_1) {

					/**
					 * [tFTPGet_1 begin ] stop
					 */

					/**
					 * [tFTPGet_1 main ] start
					 */

					currentComponent = "tFTPGet_1";

					try {
						globalMap.put("tFTPGet_1_CURRENT_STATUS", "No file transfered.");
						String dir_tFTPGet_1 = root_tFTPGet_1;

						String mask_tFTPGet_1 = maskStr_tFTPGet_1.replaceAll("\\\\", "/");

						int i_tFTPGet_1 = mask_tFTPGet_1.lastIndexOf('/');

						if (i_tFTPGet_1 != -1) {
							dir_tFTPGet_1 = mask_tFTPGet_1.substring(0, i_tFTPGet_1);
							mask_tFTPGet_1 = mask_tFTPGet_1.substring(i_tFTPGet_1 + 1);
						}

						mask_tFTPGet_1 = org.apache.oro.text.GlobCompiler.globToPerl5(mask_tFTPGet_1.toCharArray(),
								org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

						if (dir_tFTPGet_1 != null && !"".equals(dir_tFTPGet_1)) {
							if ((".*").equals(mask_tFTPGet_1)) {
								getter_tFTPGet_1.getAllFiles(dir_tFTPGet_1, localdir_tFTPGet_1);
							} else {
								getter_tFTPGet_1.getFiles(dir_tFTPGet_1, localdir_tFTPGet_1, mask_tFTPGet_1);
							}
						}
						getter_tFTPGet_1.chdir(root_tFTPGet_1);
					} catch (java.lang.Exception e) {
						globalMap.put("tFTPGet_1_ERROR_MESSAGE", e.getMessage());

						throw (e);

					}

					tos_count_tFTPGet_1++;

					/**
					 * [tFTPGet_1 main ] stop
					 */

					/**
					 * [tFTPGet_1 process_data_begin ] start
					 */

					currentComponent = "tFTPGet_1";

					/**
					 * [tFTPGet_1 process_data_begin ] stop
					 */

					/**
					 * [tFTPGet_1 process_data_end ] start
					 */

					currentComponent = "tFTPGet_1";

					/**
					 * [tFTPGet_1 process_data_end ] stop
					 */

					/**
					 * [tFTPGet_1 end ] start
					 */

					currentComponent = "tFTPGet_1";

				}
				nb_file_tFTPGet_1 = getter_tFTPGet_1.count;

				msg_tFTPGet_1.add(getter_tFTPGet_1.count + " files have been downloaded.");
				StringBuffer sb_tFTPGet_1 = new StringBuffer();

				for (String item_tFTPGet_1 : msg_tFTPGet_1) {
					sb_tFTPGet_1.append(item_tFTPGet_1).append("\n");
				}
				globalMap.put("tFTPGet_1_TRANSFER_MESSAGES", sb_tFTPGet_1.toString());

				globalMap.put("tFTPGet_1_NB_FILE", nb_file_tFTPGet_1);
				log.info("tFTPGet_1 - Downloaded files count: " + nb_file_tFTPGet_1 + ".");

				if (log.isDebugEnabled())
					log.debug("tFTPGet_1 - " + ("Done."));

				ok_Hash.put("tFTPGet_1", true);
				end_Hash.put("tFTPGet_1", System.currentTimeMillis());

				/**
				 * [tFTPGet_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFTPGet_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
			}

			tFileList_1Process(globalMap);

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tFTPGet_1 finally ] start
				 */

				currentComponent = "tFTPGet_1";

				/**
				 * [tFTPGet_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 1);
	}

	public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileList_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [tFileList_1 begin ] start
				 */

				int NB_ITERATE_tFileUnarchive_1 = 0; // for statistics

				ok_Hash.put("tFileList_1", false);
				start_Hash.put("tFileList_1", System.currentTimeMillis());

				currentComponent = "tFileList_1";

				int tos_count_tFileList_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileList_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileList_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileList_1 = new StringBuilder();
							log4jParamters_tFileList_1.append("Parameters:");
							log4jParamters_tFileList_1
									.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/koerber_data/\"");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("LIST_MODE" + " = " + "FILES");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("INCLUDSUBDIR" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("CASE_SENSITIVE" + " = " + "YES");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ERROR" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("GLOBEXPRESSIONS" + " = " + "true");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("FILES" + " = " + "[{FILEMASK="
									+ ("\"Vitamin Shoppe EDW All Modes Shipment Detail 05-18-2023.zip\"") + "}]");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_BY_NOTHING" + " = " + "true");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_BY_FILENAME" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_BY_FILESIZE" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_BY_MODIFIEDDATE" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_ACTION_ASC" + " = " + "true");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("ORDER_ACTION_DESC" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("IFEXCLUDE" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							log4jParamters_tFileList_1.append("FORMAT_FILEPATH_TO_SLASH" + " = " + "false");
							log4jParamters_tFileList_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileList_1 - " + (log4jParamters_tFileList_1));
						}
					}
					new BytesLimit65535_tFileList_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileList_1", "tFileList_1", "tFileList");
					talendJobLogProcess(globalMap);
				}

				final StringBuffer log4jSb_tFileList_1 = new StringBuffer();

				String directory_tFileList_1 = "//wva-sql-etl/sftp/ftp_files/koerber_data/";
				final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_1.add("Vitamin Shoppe EDW All Modes Shipment Detail 05-18-2023.zip");
				for (final String filemask_tFileList_1 : maskList_tFileList_1) {
					String filemask_compile_tFileList_1 = filemask_tFileList_1;

					filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(
							filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_1);
					patternList_tFileList_1.add(fileNamePattern_tFileList_1);
				}
				int NB_FILEtFileList_1 = 0;

				final boolean case_sensitive_tFileList_1 = true;

				log.info("tFileList_1 - Starting to search for matching entries.");

				final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
				java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);

				file_tFileList_1.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_1 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
								if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()) {
									if (!filePath_tFileList_1.contains(file.getAbsolutePath())) {
										list_tFileList_1.add(file);
										filePath_tFileList_1.add(file.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_1);

				log.info("tFileList_1 - Start to list files.");

				for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++) {
					java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
					String fileName_tFileList_1 = files_tFileList_1.getName();

					String currentFileName_tFileList_1 = files_tFileList_1.getName();
					String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
					String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
					String currentFileExtension_tFileList_1 = null;

					if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()) {
						currentFileExtension_tFileList_1 = files_tFileList_1.getName()
								.substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_1 = "";
					}

					NB_FILEtFileList_1++;
					globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
					globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
					globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);

					log.info("tFileList_1 - Current file or directory path : " + currentFilePath_tFileList_1);

					/**
					 * [tFileList_1 begin ] stop
					 */

					/**
					 * [tFileList_1 main ] start
					 */

					currentComponent = "tFileList_1";

					tos_count_tFileList_1++;

					/**
					 * [tFileList_1 main ] stop
					 */

					/**
					 * [tFileList_1 process_data_begin ] start
					 */

					currentComponent = "tFileList_1";

					/**
					 * [tFileList_1 process_data_begin ] stop
					 */
					NB_ITERATE_tFileUnarchive_1++;

					if (execStat) {
						runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tFileUnarchive_1);
						// Thread.sleep(1000);
					}

					/**
					 * [tFileUnarchive_1 begin ] start
					 */

					ok_Hash.put("tFileUnarchive_1", false);
					start_Hash.put("tFileUnarchive_1", System.currentTimeMillis());

					currentComponent = "tFileUnarchive_1";

					int tos_count_tFileUnarchive_1 = 0;

					if (log.isDebugEnabled())
						log.debug("tFileUnarchive_1 - " + ("Start to work."));
					if (log.isDebugEnabled()) {
						class BytesLimit65535_tFileUnarchive_1 {
							public void limitLog4jByte() throws Exception {
								StringBuilder log4jParamters_tFileUnarchive_1 = new StringBuilder();
								log4jParamters_tFileUnarchive_1.append("Parameters:");
								log4jParamters_tFileUnarchive_1.append("ZIPFILE" + " = "
										+ "((String)globalMap.get(\"tFileList_1_CURRENT_FILEPATH\"))");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1
										.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/koerber_data/\"");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("ROOTNAME" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("INTEGRITY" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("EXTRACTPATH" + " = " + "true");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("CHECKPASSWORD" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("DIE_ON_ERROR" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("PRINTOUT" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								log4jParamters_tFileUnarchive_1.append("USE_ENCODING" + " = " + "false");
								log4jParamters_tFileUnarchive_1.append(" | ");
								if (log.isDebugEnabled())
									log.debug("tFileUnarchive_1 - " + (log4jParamters_tFileUnarchive_1));
							}
						}
						new BytesLimit65535_tFileUnarchive_1().limitLog4jByte();
					}
					if (enableLogStash) {
						talendJobLog.addCM("tFileUnarchive_1", "tFileUnarchive_1", "tFileUnarchive");
						talendJobLogProcess(globalMap);
					}

					final StringBuffer log4jSb_tFileUnarchive_1 = new StringBuffer();

					com.talend.compress.zip.Util util_tFileUnarchive_1 = new com.talend.compress.zip.Util(true);

					String zipFileURL_tFileUnarchive_1 = ((String) globalMap.get("tFileList_1_CURRENT_FILEPATH"));
					String tmpFileURL_tFileUnarchive_1 = zipFileURL_tFileUnarchive_1.toLowerCase();
					String outputPath_tFileUnarchive_1 = "//wva-sql-etl/sftp/ftp_files/koerber_data/";

					if (tmpFileURL_tFileUnarchive_1.endsWith(".tar.gz")
							|| tmpFileURL_tFileUnarchive_1.endsWith(".tgz")) {
						org.apache.tools.tar.TarInputStream zip_tFileUnarchive_1 = null;
						java.io.InputStream inputStream_tFileUnarchive_1 = null;
						try {
							inputStream_tFileUnarchive_1 = new java.io.FileInputStream(zipFileURL_tFileUnarchive_1);
							inputStream_tFileUnarchive_1 = new java.util.zip.GZIPInputStream(
									inputStream_tFileUnarchive_1);
							zip_tFileUnarchive_1 = new org.apache.tools.tar.TarInputStream(
									inputStream_tFileUnarchive_1);

							org.apache.tools.tar.TarEntry entry_tFileUnarchive_1 = null;
							java.io.InputStream is_tFileUnarchive_1 = null;
							while ((entry_tFileUnarchive_1 = zip_tFileUnarchive_1.getNextEntry()) != null) {
								boolean isDirectory_tFileUnarchive_1 = entry_tFileUnarchive_1.isDirectory();
								if (!isDirectory_tFileUnarchive_1) {
									is_tFileUnarchive_1 = zip_tFileUnarchive_1;
								}
								String filename_tFileUnarchive_1 = entry_tFileUnarchive_1.getName();
								util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1,
										isDirectory_tFileUnarchive_1, is_tFileUnarchive_1);

								java.io.File f = new java.io.File(outputPath_tFileUnarchive_1,
										filename_tFileUnarchive_1);
								f.setLastModified(entry_tFileUnarchive_1.getModTime().getTime());
							}
						} catch (Exception e) {
							globalMap.put("tFileUnarchive_1_ERROR_MESSAGE", e.getMessage());
							System.err.println(e.getMessage());
						} finally {
							if (zip_tFileUnarchive_1 != null) {
								zip_tFileUnarchive_1.close();
							} else if (inputStream_tFileUnarchive_1 != null) {
								inputStream_tFileUnarchive_1.close();
							}
						}
					} else if (tmpFileURL_tFileUnarchive_1.endsWith(".tar")) {
						org.apache.tools.tar.TarInputStream zip_tFileUnarchive_1 = null;
						java.io.InputStream inputStream_tFileUnarchive_1 = null;
						try {
							inputStream_tFileUnarchive_1 = new java.io.FileInputStream(zipFileURL_tFileUnarchive_1);
							zip_tFileUnarchive_1 = new org.apache.tools.tar.TarInputStream(
									inputStream_tFileUnarchive_1);

							org.apache.tools.tar.TarEntry entry_tFileUnarchive_1 = null;
							java.io.InputStream is_tFileUnarchive_1 = null;
							while ((entry_tFileUnarchive_1 = zip_tFileUnarchive_1.getNextEntry()) != null) {
								boolean isDirectory_tFileUnarchive_1 = entry_tFileUnarchive_1.isDirectory();
								if (!isDirectory_tFileUnarchive_1) {
									is_tFileUnarchive_1 = zip_tFileUnarchive_1;
								}
								String filename_tFileUnarchive_1 = entry_tFileUnarchive_1.getName();
								util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1,
										isDirectory_tFileUnarchive_1, is_tFileUnarchive_1);

								java.io.File f = new java.io.File(outputPath_tFileUnarchive_1,
										filename_tFileUnarchive_1);
								f.setLastModified(entry_tFileUnarchive_1.getModTime().getTime());

							}
						} catch (Exception e) {
							globalMap.put("tFileUnarchive_1_ERROR_MESSAGE", e.getMessage());
							System.err.println(e.getMessage());
						} finally {
							if (zip_tFileUnarchive_1 != null) {
								zip_tFileUnarchive_1.close();
							} else if (inputStream_tFileUnarchive_1 != null) {
								inputStream_tFileUnarchive_1.close();
							}
						}
					} else if (tmpFileURL_tFileUnarchive_1.endsWith(".gz")) {
						java.util.zip.GZIPInputStream zip_tFileUnarchive_1 = null;
						java.io.InputStream inputStream_tFileUnarchive_1 = null;
						try {
							inputStream_tFileUnarchive_1 = new java.io.FileInputStream(
									new java.io.File(zipFileURL_tFileUnarchive_1));
							zip_tFileUnarchive_1 = new java.util.zip.GZIPInputStream(inputStream_tFileUnarchive_1);

							java.io.InputStream is_tFileUnarchive_1 = zip_tFileUnarchive_1;
							String fullName_tFileUnarchive_1 = new java.io.File(zipFileURL_tFileUnarchive_1).getName();
							String filename_tFileUnarchive_1 = fullName_tFileUnarchive_1.substring(0,
									fullName_tFileUnarchive_1.length() - 3);
							util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1,
									is_tFileUnarchive_1);
						} catch (Exception e) {
							globalMap.put("tFileUnarchive_1_ERROR_MESSAGE", e.getMessage());
							System.err.println(e.getMessage());
						} finally {
							if (zip_tFileUnarchive_1 != null) {
								zip_tFileUnarchive_1.close();
							} else if (inputStream_tFileUnarchive_1 != null) {
								inputStream_tFileUnarchive_1.close();
							}
						}
					} else {
						// the others all use the ZIP to decompression
						com.talend.compress.zip.Unzip unzip_tFileUnarchive_1 = new com.talend.compress.zip.Unzip(
								zipFileURL_tFileUnarchive_1, outputPath_tFileUnarchive_1);
						unzip_tFileUnarchive_1.setNeedPassword(false);

						final String decryptedPassword_tFileUnarchive_1 = routines.system.PasswordEncryptUtil
								.decryptPassword(
										"enc:routine.encryption.key.v1:hHX3OuI7wJN9zjDrwAwqVzTAVQTEgY9YU4CYeg==");

						unzip_tFileUnarchive_1.setPassword(decryptedPassword_tFileUnarchive_1);
						unzip_tFileUnarchive_1.setCheckArchive(false);
						unzip_tFileUnarchive_1.setVerbose(false);
						unzip_tFileUnarchive_1.setExtractPath(true);
						unzip_tFileUnarchive_1.setUtil(util_tFileUnarchive_1);
						unzip_tFileUnarchive_1.setUseZip4jDecryption(true);

						try {
							unzip_tFileUnarchive_1.doUnzip();
						} catch (Exception e) {
							globalMap.put("tFileUnarchive_1_ERROR_MESSAGE", e.getMessage());
							System.err.println(e.getMessage());
						}
					}

					for (com.talend.compress.zip.UnzippedFile uftFileUnarchive_1 : util_tFileUnarchive_1.unzippedFiles) {
						globalMap.put("tFileUnarchive_1_CURRENT_FILE", uftFileUnarchive_1.fileName);
						globalMap.put("tFileUnarchive_1_CURRENT_FILEPATH", uftFileUnarchive_1.filePath);

						/**
						 * [tFileUnarchive_1 begin ] stop
						 */

						/**
						 * [tFileUnarchive_1 main ] start
						 */

						currentComponent = "tFileUnarchive_1";

						tos_count_tFileUnarchive_1++;

						/**
						 * [tFileUnarchive_1 main ] stop
						 */

						/**
						 * [tFileUnarchive_1 process_data_begin ] start
						 */

						currentComponent = "tFileUnarchive_1";

						/**
						 * [tFileUnarchive_1 process_data_begin ] stop
						 */

						/**
						 * [tFileUnarchive_1 process_data_end ] start
						 */

						currentComponent = "tFileUnarchive_1";

						/**
						 * [tFileUnarchive_1 process_data_end ] stop
						 */

						/**
						 * [tFileUnarchive_1 end ] start
						 */

						currentComponent = "tFileUnarchive_1";

					}

					if (log.isDebugEnabled())
						log.debug("tFileUnarchive_1 - " + ("Done."));

					ok_Hash.put("tFileUnarchive_1", true);
					end_Hash.put("tFileUnarchive_1", System.currentTimeMillis());

					/**
					 * [tFileUnarchive_1 end ] stop
					 */
					if (execStat) {
						runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tFileUnarchive_1);
					}

					/**
					 * [tFileList_1 process_data_end ] start
					 */

					currentComponent = "tFileList_1";

					/**
					 * [tFileList_1 process_data_end ] stop
					 */

					/**
					 * [tFileList_1 end ] start
					 */

					currentComponent = "tFileList_1";

				}
				globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);

				log.info("tFileList_1 - File or directory count : " + NB_FILEtFileList_1);

				if (log.isDebugEnabled())
					log.debug("tFileList_1 - " + ("Done."));

				ok_Hash.put("tFileList_1", true);
				end_Hash.put("tFileList_1", System.currentTimeMillis());

				/**
				 * [tFileList_1 end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [tFileList_1 finally ] start
				 */

				currentComponent = "tFileList_1";

				/**
				 * [tFileList_1 finally ] stop
				 */

				/**
				 * [tFileUnarchive_1 finally ] start
				 */

				currentComponent = "tFileUnarchive_1";

				/**
				 * [tFileUnarchive_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}

	public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));

		String iterateId = "";

		String currentComponent = "";
		String cLabel = null;
		java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

		try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { // start the resume
				globalResumeTicket = true;

				/**
				 * [talendJobLog begin ] start
				 */

				ok_Hash.put("talendJobLog", false);
				start_Hash.put("talendJobLog", System.currentTimeMillis());

				currentComponent = "talendJobLog";

				int tos_count_talendJobLog = 0;

				for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
					org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder
							.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
							.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid)
							.custom("father_pid", fatherPid).custom("root_pid", rootPid);
					org.talend.logging.audit.Context log_context_talendJobLog = null;

					if (jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.sourceId(jcm.sourceId)
								.sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
								.targetId(jcm.targetId).targetLabel(jcm.targetLabel)
								.targetConnectorType(jcm.targetComponentName).connectionName(jcm.current_connector)
								.rows(jcm.row_count).duration(duration).build();
						auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
						auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).duration(duration)
								.status(jcm.status).build();
						auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
						log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
								.connectorType(jcm.component_name).connectorId(jcm.component_id)
								.connectorLabel(jcm.component_label).build();
						auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {// log current component
																							// input line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
								.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
								.rows(jcm.total_row_number).duration(duration).build();
						auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {// log current component
																								// output/reject line
						long timeMS = jcm.end_time - jcm.start_time;
						String duration = String.valueOf(timeMS);

						log_context_talendJobLog = builder_talendJobLog.connectorType(jcm.component_name)
								.connectorId(jcm.component_id).connectorLabel(jcm.component_label)
								.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
								.rows(jcm.total_row_number).duration(duration).build();
						auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
					} else if (jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
						java.lang.Exception e_talendJobLog = jcm.exception;
						if (e_talendJobLog != null) {
							try (java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();
									java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
								e_talendJobLog.printStackTrace(pw_talendJobLog);
								builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,
										java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
							}
						}

						if (jcm.extra_info != null) {
							builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
						}

						log_context_talendJobLog = builder_talendJobLog
								.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
								.connectorId(jcm.component_id)
								.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label)
								.build();

						auditLogger_talendJobLog.exception(log_context_talendJobLog);
					}

				}

				/**
				 * [talendJobLog begin ] stop
				 */

				/**
				 * [talendJobLog main ] start
				 */

				currentComponent = "talendJobLog";

				tos_count_talendJobLog++;

				/**
				 * [talendJobLog main ] stop
				 */

				/**
				 * [talendJobLog process_data_begin ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_begin ] stop
				 */

				/**
				 * [talendJobLog process_data_end ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog process_data_end ] stop
				 */

				/**
				 * [talendJobLog end ] start
				 */

				currentComponent = "talendJobLog";

				ok_Hash.put("talendJobLog", true);
				end_Hash.put("talendJobLog", System.currentTimeMillis());

				/**
				 * [talendJobLog end ] stop
				 */
			} // end the resume

		} catch (java.lang.Exception e) {

			if (!(e instanceof TalendException)) {
				log.fatal(currentComponent + " " + e.getMessage(), e);
			}

			TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);

			throw te;
		} catch (java.lang.Error error) {

			runStat.stopThreadStat();

			throw error;
		} finally {

			try {

				/**
				 * [talendJobLog finally ] start
				 */

				currentComponent = "talendJobLog";

				/**
				 * [talendJobLog finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}

	public String resuming_logs_dir_path = null;
	public String resuming_checkpoint_path = null;
	public String parent_part_launcher = null;
	private String resumeEntryMethodName = null;
	private boolean globalResumeTicket = false;

	public boolean watch = false;
	// portStats is null, it means don't execute the statistics
	public Integer portStats = null;
	public int portTraces = 4334;
	public String clientHost;
	public String defaultClientHost = "localhost";
	public String contextStr = "Default";
	public boolean isDefaultContext = true;
	public String pid = "0";
	public String rootPid = null;
	public String fatherPid = null;
	public String fatherNode = null;
	public long startTime = 0;
	public boolean isChildJob = false;
	public String log4jLevel = "";

	private boolean enableLogStash;

	private boolean execStat = true;

	private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
		protected java.util.Map<String, String> initialValue() {
			java.util.Map<String, String> threadRunResultMap = new java.util.HashMap<String, String>();
			threadRunResultMap.put("errorCode", null);
			threadRunResultMap.put("status", "");
			return threadRunResultMap;
		};
	};

	protected PropertiesWithType context_param = new PropertiesWithType();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	private final static java.util.Properties jobInfo = new java.util.Properties();
	private final static java.util.Map<String, String> mdcInfo = new java.util.HashMap<>();

	public static void main(String[] args) {
		final koerber_data_into_snowflake koerber_data_into_snowflakeClass = new koerber_data_into_snowflake();

		int exitCode = koerber_data_into_snowflakeClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'koerber_data_into_snowflake' - Done.");
		}

		System.exit(exitCode);
	}

	private void getjobInfo() {
		final String TEMPLATE_PATH = "src/main/templates/jobInfo_template.properties";
		final String BUILD_PATH = "../jobInfo.properties";
		final String path = this.getClass().getResource("").getPath();
		if (path.lastIndexOf("target") > 0) {
			final java.io.File templateFile = new java.io.File(
					path.substring(0, path.lastIndexOf("target")).concat(TEMPLATE_PATH));
			if (templateFile.exists()) {
				readJobInfo(templateFile);
				return;
			}
		}
		readJobInfo(new java.io.File(BUILD_PATH));
	}

	private void readJobInfo(java.io.File jobInfoFile) {

		if (jobInfoFile.exists()) {
			try (java.io.InputStream is = new java.io.FileInputStream(jobInfoFile)) {
				jobInfo.load(is);
			} catch (IOException e) {

				log.debug("Read jobInfo.properties file fail: " + e.getMessage());

			}
		}
		log.info(String.format("Project name: %s\tJob name: %s\tGIT Commit ID: %s\tTalend Version: %s", projectName,
				jobName, jobInfo.getProperty("gitCommitId"), "8.0.1.20230418_1502-patch"));

	}

	public String[][] runJob(String[] args) {

		int exitCode = runJobInTOS(args);
		String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

		return bufferValue;
	}

	public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;

		return hastBufferOutput;
	}

	public int runJobInTOS(String[] args) {
		// reset status
		status = "";

		String lastStr = "";
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--context_param")) {
				lastStr = arg;
			} else if (lastStr.equals("")) {
				evalParam(arg);
			} else {
				evalParam(lastStr + " " + arg);
				lastStr = "";
			}
		}
		enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

		if (!"".equals(log4jLevel)) {

			if ("trace".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.TRACE);
			} else if ("debug".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.DEBUG);
			} else if ("info".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.INFO);
			} else if ("warn".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.WARN);
			} else if ("error".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.ERROR);
			} else if ("fatal".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.FATAL);
			} else if ("off".equalsIgnoreCase(log4jLevel)) {
				org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(),
						org.apache.logging.log4j.Level.OFF);
			}
			org.apache.logging.log4j.core.config.Configurator
					.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());

		}

		getjobInfo();
		log.info("TalendJob: 'koerber_data_into_snowflake' - Start.");

		java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
		for (Object jobInfoKey : jobInfoKeys) {
			org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
		}
		org.slf4j.MDC.put("_pid", pid);
		org.slf4j.MDC.put("_rootPid", rootPid);
		org.slf4j.MDC.put("_fatherPid", fatherPid);
		org.slf4j.MDC.put("_projectName", projectName);
		org.slf4j.MDC.put("_startTimestamp", java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC)
				.format(java.time.format.DateTimeFormatter.ISO_INSTANT));
		org.slf4j.MDC.put("_jobRepositoryId", "_WvDJYOtkEe2HwtcbA5NKJQ");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-05-19T13:10:43.504090Z");

		java.lang.management.RuntimeMXBean mx = java.lang.management.ManagementFactory.getRuntimeMXBean();
		String[] mxNameTable = mx.getName().split("@"); //$NON-NLS-1$
		if (mxNameTable.length == 2) {
			org.slf4j.MDC.put("_systemPid", mxNameTable[0]);
		} else {
			org.slf4j.MDC.put("_systemPid", String.valueOf(java.lang.Thread.currentThread().getId()));
		}

		if (enableLogStash) {
			java.util.Properties properties_talendJobLog = new java.util.Properties();
			properties_talendJobLog.setProperty("root.logger", "audit");
			properties_talendJobLog.setProperty("encoding", "UTF-8");
			properties_talendJobLog.setProperty("application.name", "Talend Studio");
			properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
			properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
			properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
			properties_talendJobLog.setProperty("log.appender", "file");
			properties_talendJobLog.setProperty("appender.file.path", "audit.json");
			properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
			properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
			properties_talendJobLog.setProperty("host", "false");

			System.getProperties().stringPropertyNames().stream().filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()),
							System.getProperty(key)));

			org.apache.logging.log4j.core.config.Configurator
					.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);

			auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory
					.createJobAuditLogger(properties_talendJobLog);
		}

		if (clientHost == null) {
			clientHost = defaultClientHost;
		}

		if (pid == null || "0".equals(pid)) {
			pid = TalendString.getAsciiRandomString(6);
		}

		org.slf4j.MDC.put("_pid", pid);

		if (rootPid == null) {
			rootPid = pid;
		}

		org.slf4j.MDC.put("_rootPid", rootPid);

		if (fatherPid == null) {
			fatherPid = pid;
		} else {
			isChildJob = true;
		}
		org.slf4j.MDC.put("_fatherPid", fatherPid);

		if (portStats != null) {
			// portStats = -1; //for testing
			if (portStats < 0 || portStats > 65535) {
				// issue:10869, the portStats is invalid, so this client socket can't open
				System.err.println("The statistics socket port " + portStats + " is invalid.");
				execStat = false;
			}
		} else {
			execStat = false;
		}
		boolean inOSGi = routines.system.BundleUtils.inOSGi();

		try {
			java.util.Dictionary<String, Object> jobProperties = null;
			if (inOSGi) {
				jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

				if (jobProperties != null && jobProperties.get("context") != null) {
					contextStr = (String) jobProperties.get("context");
				}
			}
			// call job/subjob with an existing context, like: --context=production. if
			// without this parameter, there will use the default context instead.
			java.io.InputStream inContext = koerber_data_into_snowflake.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/koerber_data_into_snowflake_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = koerber_data_into_snowflake.class.getClassLoader()
						.getResourceAsStream("config/contexts/" + contextStr + ".properties");
			}
			if (inContext != null) {
				try {
					// defaultProps is in order to keep the original context value
					if (context != null && context.isEmpty()) {
						defaultProps.load(inContext);
						if (inOSGi && jobProperties != null) {
							java.util.Enumeration<String> keys = jobProperties.keys();
							while (keys.hasMoreElements()) {
								String propKey = keys.nextElement();
								if (defaultProps.containsKey(propKey)) {
									defaultProps.put(propKey, (String) jobProperties.get(propKey));
								}
							}
						}
						context = new ContextProperties(defaultProps);
					}
				} finally {
					inContext.close();
				}
			} else if (!isDefaultContext) {
				// print info and job continue to run, for case: context_param is not empty.
				System.err.println("Could not find the context " + contextStr);
			}

			if (!context_param.isEmpty()) {
				context.putAll(context_param);
				// set types for params from parentJobs
				for (Object key : context_param.keySet()) {
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
			}
			class ContextProcessing {
				private void processContext_0() {
				}

				public void processAllContext() {
					processContext_0();
				}
			}

			new ContextProcessing().processAllContext();
		} catch (java.io.IOException ie) {
			System.err.println("Could not load context " + contextStr);
			ie.printStackTrace();
		}

		// get context value from parent directly
		if (parentContextMap != null && !parentContextMap.isEmpty()) {
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, ContextProperties.class, parametersToEncrypt));

		org.slf4j.MDC.put("_context", contextStr);
		log.info("TalendJob: 'koerber_data_into_snowflake' - Started.");
		mdcInfo.putAll(org.slf4j.MDC.getCopyOfContextMap());

		if (execStat) {
			try {
				runStat.openSocket(!isChildJob);
				runStat.setAllPID(rootPid, fatherPid, pid, jobName);
				runStat.startThreadStat(clientHost, portStats);
				runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
			} catch (java.io.IOException ioException) {
				ioException.printStackTrace();
			}
		}

		java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
		globalMap.put("concurrentHashMap", concurrentHashMap);

		long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long endUsedMemory = 0;
		long end = 0;

		startTime = System.currentTimeMillis();

		this.globalResumeTicket = true;// to run tPreJob

		if (enableLogStash) {
			talendJobLog.addJobStartMessage();
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		this.globalResumeTicket = false;// to run others jobs

		try {
			errorCode = null;
			tLibraryLoad_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tLibraryLoad_1) {
			globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", -1);

			e_tLibraryLoad_1.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory)
					+ " bytes memory increase when running : koerber_data_into_snowflake");
		}
		if (enableLogStash) {
			talendJobLog.addJobEndMessage(startTime, end, status);
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		if (execStat) {
			runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
			runStat.stopThreadStat();
		}
		int returnCode = 0;

		if (errorCode == null) {
			returnCode = status != null && status.equals("failure") ? 1 : 0;
		} else {
			returnCode = errorCode.intValue();
		}
		resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "",
				"" + returnCode, "", "", "");
		resumeUtil.flush();

		org.slf4j.MDC.remove("_subJobName");
		org.slf4j.MDC.remove("_subJobPid");
		org.slf4j.MDC.remove("_systemPid");
		log.info("TalendJob: 'koerber_data_into_snowflake' - Finished - status: " + status + " returnCode: "
				+ returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {
		closeFtpConnections();

	}

	private void closeFtpConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tFTPConnection_1");
			if (obj_conn != null) {
				((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("conn_tFTPConnection_1", globalMap.get("conn_tFTPConnection_1"));

		return connections;
	}

	private void evalParam(String arg) {
		if (arg.startsWith("--resuming_logs_dir_path")) {
			resuming_logs_dir_path = arg.substring(25);
		} else if (arg.startsWith("--resuming_checkpoint_path")) {
			resuming_checkpoint_path = arg.substring(27);
		} else if (arg.startsWith("--parent_part_launcher")) {
			parent_part_launcher = arg.substring(23);
		} else if (arg.startsWith("--watch")) {
			watch = true;
		} else if (arg.startsWith("--stat_port=")) {
			String portStatsStr = arg.substring(12);
			if (portStatsStr != null && !portStatsStr.equals("null")) {
				portStats = Integer.parseInt(portStatsStr);
			}
		} else if (arg.startsWith("--trace_port=")) {
			portTraces = Integer.parseInt(arg.substring(13));
		} else if (arg.startsWith("--client_host=")) {
			clientHost = arg.substring(14);
		} else if (arg.startsWith("--context=")) {
			contextStr = arg.substring(10);
			isDefaultContext = false;
		} else if (arg.startsWith("--father_pid=")) {
			fatherPid = arg.substring(13);
		} else if (arg.startsWith("--root_pid=")) {
			rootPid = arg.substring(11);
		} else if (arg.startsWith("--father_node=")) {
			fatherNode = arg.substring(14);
		} else if (arg.startsWith("--pid=")) {
			pid = arg.substring(6);
		} else if (arg.startsWith("--context_type")) {
			String keyValue = arg.substring(15);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.setContextType(keyValue.substring(0, index),
							replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1));
				}

			}

		} else if (arg.startsWith("--context_param")) {
			String keyValue = arg.substring(16);
			int index = -1;
			if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
				if (fatherPid == null) {
					context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
				} else { // the subjob won't escape the especial chars
					context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1));
				}
			}
		} else if (arg.startsWith("--log4jLevel=")) {
			log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {// for trunjob call
			final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
	}

	private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

	private final String[][] escapeChars = { { "\\\\", "\\" }, { "\\n", "\n" }, { "\\'", "\'" }, { "\\r", "\r" },
			{ "\\f", "\f" }, { "\\b", "\b" }, { "\\t", "\t" } };

	private String replaceEscapeChars(String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0], currIndex);
				if (index >= 0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0],
							strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the
			// result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getStatus() {
		return status;
	}

	ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 * 102343 characters generated by Talend Cloud Data Management Platform on the
 * May 19, 2023 at 9:10:43 AM EDT
 ************************************************************************************************/