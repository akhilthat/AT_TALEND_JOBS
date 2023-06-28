
package at_talend_jobs.ttaallcl2_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
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

@SuppressWarnings("unused")

/**
 * Job: TTAALLCL2 Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class TTAALLCL2 implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TTAALLCL2.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(TTAALLCL2.class);

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

	private Object[] multiThreadLockWrite = new Object[0];

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

			if (jda_host_name != null) {

				this.setProperty("jda_host_name", jda_host_name.toString());

			}

			if (jda_mm_lib != null) {

				this.setProperty("jda_mm_lib", jda_mm_lib.toString());

			}

			if (jda_user_name != null) {

				this.setProperty("jda_user_name", jda_user_name.toString());

			}

			if (jda_password != null) {

				this.setProperty("jda_password", jda_password.toString());

			}

			if (SF_account != null) {

				this.setProperty("SF_account", SF_account.toString());

			}

			if (SF_prod_database != null) {

				this.setProperty("SF_prod_database", SF_prod_database.toString());

			}

			if (SF_password != null) {

				this.setProperty("SF_password", SF_password.toString());

			}

			if (SF_fin_schema != null) {

				this.setProperty("SF_fin_schema", SF_fin_schema.toString());

			}

			if (SF_user_id != null) {

				this.setProperty("SF_user_id", SF_user_id.toString());

			}

			if (SF_warehouse != null) {

				this.setProperty("SF_warehouse", SF_warehouse.toString());

			}

			if (sql_server_database != null) {

				this.setProperty("sql_server_database", sql_server_database.toString());

			}

			if (sql_server_host != null) {

				this.setProperty("sql_server_host", sql_server_host.toString());

			}

			if (sql_server_password != null) {

				this.setProperty("sql_server_password", sql_server_password.toString());

			}

			if (sql_server_port != null) {

				this.setProperty("sql_server_port", sql_server_port.toString());

			}

			if (sql_server_schema != null) {

				this.setProperty("sql_server_schema", sql_server_schema.toString());

			}

			if (sql_server_user_id != null) {

				this.setProperty("sql_server_user_id", sql_server_user_id.toString());

			}

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

		public String jda_host_name;

		public String getJda_host_name() {
			return this.jda_host_name;
		}

		public String jda_mm_lib;

		public String getJda_mm_lib() {
			return this.jda_mm_lib;
		}

		public String jda_user_name;

		public String getJda_user_name() {
			return this.jda_user_name;
		}

		public java.lang.String jda_password;

		public java.lang.String getJda_password() {
			return this.jda_password;
		}

		public String SF_account;

		public String getSF_account() {
			return this.SF_account;
		}

		public String SF_prod_database;

		public String getSF_prod_database() {
			return this.SF_prod_database;
		}

		public java.lang.String SF_password;

		public java.lang.String getSF_password() {
			return this.SF_password;
		}

		public String SF_fin_schema;

		public String getSF_fin_schema() {
			return this.SF_fin_schema;
		}

		public String SF_user_id;

		public String getSF_user_id() {
			return this.SF_user_id;
		}

		public String SF_warehouse;

		public String getSF_warehouse() {
			return this.SF_warehouse;
		}

		public String sql_server_database;

		public String getSql_server_database() {
			return this.sql_server_database;
		}

		public String sql_server_host;

		public String getSql_server_host() {
			return this.sql_server_host;
		}

		public java.lang.String sql_server_password;

		public java.lang.String getSql_server_password() {
			return this.sql_server_password;
		}

		public String sql_server_port;

		public String getSql_server_port() {
			return this.sql_server_port;
		}

		public String sql_server_schema;

		public String getSql_server_schema() {
			return this.sql_server_schema;
		}

		public String sql_server_user_id;

		public String getSql_server_user_id() {
			return this.sql_server_user_id;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "TTAALLCL2";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";

	private String cLabel = null;

	private final java.util.Map<String, Object> globalMap = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Object>());

	private final java.util.Map<String, Long> start_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Long>());
	private final java.util.Map<String, Long> end_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Long>());
	private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections
			.synchronizedMap(new java.util.HashMap<String, Boolean>());
	public final java.util.List<String[]> globalBuffer = java.util.Collections
			.synchronizedList(new java.util.ArrayList<String[]>());

	private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName,
			"_nEGQgAVwEeqgh6rCafRRhA", "0.1");
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
					TTAALLCL2.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TTAALLCL2.this, new Object[] { e, currentComponent, globalMap });
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

	public void tParallelize_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_21_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_21_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_15_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_21_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_16_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tParallelize_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_10_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_21_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_10_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPostjob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tParallelize_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tParallelize_1");
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
				 * [tParallelize_1 begin ] start
				 */

				ok_Hash.put("tParallelize_1", false);
				start_Hash.put("tParallelize_1", System.currentTimeMillis());

				currentComponent = "tParallelize_1";

				int tos_count_tParallelize_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tParallelize_1", "tParallelize_1", "tParallelize");
					talendJobLogProcess(globalMap);
				}

// call parallelized subjobs
				java.util.Map<String, Thread> mt_tParallelize_1 = new java.util.HashMap<String, Thread>();

// clear the temporary values in the globalMap
				globalMap.remove("tDBRow_10_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_1_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_2_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_3_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if (globalMap instanceof java.util.HashMap) {
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				} else {
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;

				runningThreadCount.add(1);
				String name_tDBRow_10 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBRow_10 = new Thread(new ThreadGroup(name_tDBRow_10), name_tDBRow_10) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_10' starts.");

							tDBRow_10Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_10' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_10_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_10_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBRow_10.start();
				mt_tParallelize_1.put("tDBRow_10", thread_tDBRow_10);
				runningThreadCount.add(1);
				String name_tDBRow_1 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBRow_1 = new Thread(new ThreadGroup(name_tDBRow_1), name_tDBRow_1) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_1' starts.");

							tDBRow_1Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_1' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_1_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_1_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBRow_1.start();
				mt_tParallelize_1.put("tDBRow_1", thread_tDBRow_1);
				runningThreadCount.add(1);
				String name_tDBRow_2 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBRow_2 = new Thread(new ThreadGroup(name_tDBRow_2), name_tDBRow_2) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_2' starts.");

							tDBRow_2Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_2' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_2_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_2_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBRow_2.start();
				mt_tParallelize_1.put("tDBRow_2", thread_tDBRow_2);
				runningThreadCount.add(1);
				String name_tDBRow_3 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBRow_3 = new Thread(new ThreadGroup(name_tDBRow_3), name_tDBRow_3) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_3' starts.");

							tDBRow_3Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_3' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_3_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_3_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBRow_3.start();
				mt_tParallelize_1.put("tDBRow_3", thread_tDBRow_3);
				while ((((globalMap.get("tDBRow_10_SUBPROCESS_STATE") == null) ? true
						: ((Integer) globalMap.get("tDBRow_10_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_1_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_1_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_2_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_2_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_3_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_3_SUBPROCESS_STATE") == 0))
						|| false)) {
					Thread.sleep(100);
				}

// call next subprocesses

				/**
				 * [tParallelize_1 begin ] stop
				 */

				/**
				 * [tParallelize_1 main ] start
				 */

				currentComponent = "tParallelize_1";

				tos_count_tParallelize_1++;

				/**
				 * [tParallelize_1 main ] stop
				 */

				/**
				 * [tParallelize_1 process_data_begin ] start
				 */

				currentComponent = "tParallelize_1";

				/**
				 * [tParallelize_1 process_data_begin ] stop
				 */

				/**
				 * [tParallelize_1 process_data_end ] start
				 */

				currentComponent = "tParallelize_1";

				/**
				 * [tParallelize_1 process_data_end ] stop
				 */

				/**
				 * [tParallelize_1 end ] start
				 */

				currentComponent = "tParallelize_1";

				ok_Hash.put("tParallelize_1", true);
				end_Hash.put("tParallelize_1", System.currentTimeMillis());

				/**
				 * [tParallelize_1 end ] stop
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
				 * [tParallelize_1 finally ] start
				 */

				currentComponent = "tParallelize_1";

				/**
				 * [tParallelize_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_10Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_10_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_10");
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
				 * [tDBRow_10 begin ] start
				 */

				ok_Hash.put("tDBRow_10", false);
				start_Hash.put("tDBRow_10", System.currentTimeMillis());

				currentComponent = "tDBRow_10";

				int tos_count_tDBRow_10 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_10", "tDBRow_10", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_10 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_10 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_10 = (String) (restRequest_tDBRow_10 != null
						? restRequest_tDBRow_10.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_10 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_10 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_10 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_10 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_10
						.createRuntimeProperties();
				props_tDBRow_10.setValue("query",
						"DELETE from ITEM_MASTER_TAG_ALONG_FILE_INZTAG\nWHERE LOAD_DATE = CURRENT_DATE()");

				props_tDBRow_10.setValue("dieOnError", false);

				props_tDBRow_10.setValue("usePreparedStatement", false);

				props_tDBRow_10.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_10_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_10_1_fisrt sst_tDBRow_10_1_fisrt = new SchemaSettingTool_tDBRow_10_1_fisrt();

				props_tDBRow_10.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_10_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_10_2_fisrt sst_tDBRow_10_2_fisrt = new SchemaSettingTool_tDBRow_10_2_fisrt();

				props_tDBRow_10.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_2_fisrt.getSchemaValue()));

				props_tDBRow_10.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_10.connection.setValue("useCustomRegion", false);

				props_tDBRow_10.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_10.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_10.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_10.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_10.table.setValue("tableName", "");

				props_tDBRow_10.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_10.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_10.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_10.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_10.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_10.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_10_3_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_10_3_fisrt sst_tDBRow_10_3_fisrt = new SchemaSettingTool_tDBRow_10_3_fisrt();

				props_tDBRow_10.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_10.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_10 = props_tDBRow_10.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_10 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_10 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_10 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_10.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_10);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_10.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_10 = props_tDBRow_10.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_10 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_10 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_10 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_10.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_10);
					}
				}
				globalMap.put("tDBRow_10_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_10);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_10 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_10_MAPPINGS_URL", mappings_url_tDBRow_10);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_10 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_10";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_10 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_10 = null;
				topology_tDBRow_10 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_10 = def_tDBRow_10.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_10,
						topology_tDBRow_10);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_10 = def_tDBRow_10
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_10 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_10.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_10 = componentRuntime_tDBRow_10
						.initialize(container_tDBRow_10, props_tDBRow_10);

				if (initVr_tDBRow_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_10.getMessage());
				}

				if (componentRuntime_tDBRow_10 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_10 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_10;
					compDriverInitialization_tDBRow_10.runAtDriver(container_tDBRow_10);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_10 = null;
				if (componentRuntime_tDBRow_10 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_10 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_10;
					if (doesNodeBelongToRequest_tDBRow_10) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_10 = sourceOrSink_tDBRow_10
								.validate(container_tDBRow_10);
						if (vr_tDBRow_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_10.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_10 begin ] stop
				 */

				/**
				 * [tDBRow_10 main ] start
				 */

				currentComponent = "tDBRow_10";

				tos_count_tDBRow_10++;

				/**
				 * [tDBRow_10 main ] stop
				 */

				/**
				 * [tDBRow_10 process_data_begin ] start
				 */

				currentComponent = "tDBRow_10";

				/**
				 * [tDBRow_10 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_10 process_data_end ] start
				 */

				currentComponent = "tDBRow_10";

				/**
				 * [tDBRow_10 process_data_end ] stop
				 */

				/**
				 * [tDBRow_10 end ] start
				 */

				currentComponent = "tDBRow_10";

// end of generic

				resourceMap.put("finish_tDBRow_10", Boolean.TRUE);

				ok_Hash.put("tDBRow_10", true);
				end_Hash.put("tDBRow_10", System.currentTimeMillis());

				/**
				 * [tDBRow_10 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_10:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk31", 0, "ok");
			}

			tDBInput_21Process(globalMap);

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
				 * [tDBRow_10 finally ] start
				 */

				currentComponent = "tDBRow_10";

// finally of generic

				if (resourceMap.get("finish_tDBRow_10") == null) {
				}

				/**
				 * [tDBRow_10 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_10_SUBPROCESS_STATE", 1);
	}

	public static class row30Struct implements routines.system.IPersistableRow<row30Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal INUMBR;

		public BigDecimal getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return false;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return 9;
		}

		public Integer INUMBRPrecision() {
			return 0;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public BigDecimal TAGAMT;

		public BigDecimal getTAGAMT() {
			return this.TAGAMT;
		}

		public Boolean TAGAMTIsNullable() {
			return false;
		}

		public Boolean TAGAMTIsKey() {
			return false;
		}

		public Integer TAGAMTLength() {
			return 6;
		}

		public Integer TAGAMTPrecision() {
			return 2;
		}

		public String TAGAMTDefault() {

			return "";

		}

		public String TAGAMTComment() {

			return "";

		}

		public String TAGAMTPattern() {

			return "";

		}

		public String TAGAMTOriginalDbColumnName() {

			return "TAGAMT";

		}

		public String TAGFRM;

		public String getTAGFRM() {
			return this.TAGFRM;
		}

		public Boolean TAGFRMIsNullable() {
			return false;
		}

		public Boolean TAGFRMIsKey() {
			return false;
		}

		public Integer TAGFRMLength() {
			return 35;
		}

		public Integer TAGFRMPrecision() {
			return 0;
		}

		public String TAGFRMDefault() {

			return null;

		}

		public String TAGFRMComment() {

			return "";

		}

		public String TAGFRMPattern() {

			return "";

		}

		public String TAGFRMOriginalDbColumnName() {

			return "TAGFRM";

		}

		public String TAGAUM;

		public String getTAGAUM() {
			return this.TAGAUM;
		}

		public Boolean TAGAUMIsNullable() {
			return false;
		}

		public Boolean TAGAUMIsKey() {
			return false;
		}

		public Integer TAGAUMLength() {
			return 8;
		}

		public Integer TAGAUMPrecision() {
			return 0;
		}

		public String TAGAUMDefault() {

			return null;

		}

		public String TAGAUMComment() {

			return "";

		}

		public String TAGAUMPattern() {

			return "";

		}

		public String TAGAUMOriginalDbColumnName() {

			return "TAGAUM";

		}

		public String TASUOM;

		public String getTASUOM() {
			return this.TASUOM;
		}

		public Boolean TASUOMIsNullable() {
			return false;
		}

		public Boolean TASUOMIsKey() {
			return false;
		}

		public Integer TASUOMLength() {
			return 15;
		}

		public Integer TASUOMPrecision() {
			return 0;
		}

		public String TASUOMDefault() {

			return null;

		}

		public String TASUOMComment() {

			return "";

		}

		public String TASUOMPattern() {

			return "";

		}

		public String TASUOMOriginalDbColumnName() {

			return "TASUOM";

		}

		public String TAGSRV;

		public String getTAGSRV() {
			return this.TAGSRV;
		}

		public Boolean TAGSRVIsNullable() {
			return false;
		}

		public Boolean TAGSRVIsKey() {
			return false;
		}

		public Integer TAGSRVLength() {
			return 35;
		}

		public Integer TAGSRVPrecision() {
			return 0;
		}

		public String TAGSRVDefault() {

			return null;

		}

		public String TAGSRVComment() {

			return "";

		}

		public String TAGSRVPattern() {

			return "";

		}

		public String TAGSRVOriginalDbColumnName() {

			return "TAGSRV";

		}

		public BigDecimal TASNUM;

		public BigDecimal getTASNUM() {
			return this.TASNUM;
		}

		public Boolean TASNUMIsNullable() {
			return false;
		}

		public Boolean TASNUMIsKey() {
			return false;
		}

		public Integer TASNUMLength() {
			return 4;
		}

		public Integer TASNUMPrecision() {
			return 0;
		}

		public String TASNUMDefault() {

			return "";

		}

		public String TASNUMComment() {

			return "";

		}

		public String TASNUMPattern() {

			return "";

		}

		public String TASNUMOriginalDbColumnName() {

			return "TASNUM";

		}

		public String TAGVIT;

		public String getTAGVIT() {
			return this.TAGVIT;
		}

		public Boolean TAGVITIsNullable() {
			return false;
		}

		public Boolean TAGVITIsKey() {
			return false;
		}

		public Integer TAGVITLength() {
			return 20;
		}

		public Integer TAGVITPrecision() {
			return 0;
		}

		public String TAGVITDefault() {

			return null;

		}

		public String TAGVITComment() {

			return "";

		}

		public String TAGVITPattern() {

			return "";

		}

		public String TAGVITOriginalDbColumnName() {

			return "TAGVIT";

		}

		public String TAGCTG;

		public String getTAGCTG() {
			return this.TAGCTG;
		}

		public Boolean TAGCTGIsNullable() {
			return false;
		}

		public Boolean TAGCTGIsKey() {
			return false;
		}

		public Integer TAGCTGLength() {
			return 15;
		}

		public Integer TAGCTGPrecision() {
			return 0;
		}

		public String TAGCTGDefault() {

			return null;

		}

		public String TAGCTGComment() {

			return "";

		}

		public String TAGCTGPattern() {

			return "";

		}

		public String TAGCTGOriginalDbColumnName() {

			return "TAGCTG";

		}

		public BigDecimal SUBSKU;

		public BigDecimal getSUBSKU() {
			return this.SUBSKU;
		}

		public Boolean SUBSKUIsNullable() {
			return false;
		}

		public Boolean SUBSKUIsKey() {
			return false;
		}

		public Integer SUBSKULength() {
			return 9;
		}

		public Integer SUBSKUPrecision() {
			return 0;
		}

		public String SUBSKUDefault() {

			return "";

		}

		public String SUBSKUComment() {

			return "";

		}

		public String SUBSKUPattern() {

			return "";

		}

		public String SUBSKUOriginalDbColumnName() {

			return "SUBSKU";

		}

		public BigDecimal CMPSKU;

		public BigDecimal getCMPSKU() {
			return this.CMPSKU;
		}

		public Boolean CMPSKUIsNullable() {
			return false;
		}

		public Boolean CMPSKUIsKey() {
			return false;
		}

		public Integer CMPSKULength() {
			return 9;
		}

		public Integer CMPSKUPrecision() {
			return 0;
		}

		public String CMPSKUDefault() {

			return "";

		}

		public String CMPSKUComment() {

			return "";

		}

		public String CMPSKUPattern() {

			return "";

		}

		public String CMPSKUOriginalDbColumnName() {

			return "CMPSKU";

		}

		public BigDecimal UPSSKU;

		public BigDecimal getUPSSKU() {
			return this.UPSSKU;
		}

		public Boolean UPSSKUIsNullable() {
			return false;
		}

		public Boolean UPSSKUIsKey() {
			return false;
		}

		public Integer UPSSKULength() {
			return 9;
		}

		public Integer UPSSKUPrecision() {
			return 0;
		}

		public String UPSSKUDefault() {

			return "";

		}

		public String UPSSKUComment() {

			return "";

		}

		public String UPSSKUPattern() {

			return "";

		}

		public String UPSSKUOriginalDbColumnName() {

			return "UPSSKU";

		}

		public BigDecimal SAVSKU;

		public BigDecimal getSAVSKU() {
			return this.SAVSKU;
		}

		public Boolean SAVSKUIsNullable() {
			return false;
		}

		public Boolean SAVSKUIsKey() {
			return false;
		}

		public Integer SAVSKULength() {
			return 9;
		}

		public Integer SAVSKUPrecision() {
			return 0;
		}

		public String SAVSKUDefault() {

			return "";

		}

		public String SAVSKUComment() {

			return "";

		}

		public String SAVSKUPattern() {

			return "";

		}

		public String SAVSKUOriginalDbColumnName() {

			return "SAVSKU";

		}

		public String IMGNM1;

		public String getIMGNM1() {
			return this.IMGNM1;
		}

		public Boolean IMGNM1IsNullable() {
			return false;
		}

		public Boolean IMGNM1IsKey() {
			return false;
		}

		public Integer IMGNM1Length() {
			return 15;
		}

		public Integer IMGNM1Precision() {
			return 0;
		}

		public String IMGNM1Default() {

			return null;

		}

		public String IMGNM1Comment() {

			return "";

		}

		public String IMGNM1Pattern() {

			return "";

		}

		public String IMGNM1OriginalDbColumnName() {

			return "IMGNM1";

		}

		public String IMGNM2;

		public String getIMGNM2() {
			return this.IMGNM2;
		}

		public Boolean IMGNM2IsNullable() {
			return false;
		}

		public Boolean IMGNM2IsKey() {
			return false;
		}

		public Integer IMGNM2Length() {
			return 15;
		}

		public Integer IMGNM2Precision() {
			return 0;
		}

		public String IMGNM2Default() {

			return null;

		}

		public String IMGNM2Comment() {

			return "";

		}

		public String IMGNM2Pattern() {

			return "";

		}

		public String IMGNM2OriginalDbColumnName() {

			return "IMGNM2";

		}

		public String IMGNM3;

		public String getIMGNM3() {
			return this.IMGNM3;
		}

		public Boolean IMGNM3IsNullable() {
			return false;
		}

		public Boolean IMGNM3IsKey() {
			return false;
		}

		public Integer IMGNM3Length() {
			return 15;
		}

		public Integer IMGNM3Precision() {
			return 0;
		}

		public String IMGNM3Default() {

			return null;

		}

		public String IMGNM3Comment() {

			return "";

		}

		public String IMGNM3Pattern() {

			return "";

		}

		public String IMGNM3OriginalDbColumnName() {

			return "IMGNM3";

		}

		public String IMGNM4;

		public String getIMGNM4() {
			return this.IMGNM4;
		}

		public Boolean IMGNM4IsNullable() {
			return false;
		}

		public Boolean IMGNM4IsKey() {
			return false;
		}

		public Integer IMGNM4Length() {
			return 15;
		}

		public Integer IMGNM4Precision() {
			return 0;
		}

		public String IMGNM4Default() {

			return null;

		}

		public String IMGNM4Comment() {

			return "";

		}

		public String IMGNM4Pattern() {

			return "";

		}

		public String IMGNM4OriginalDbColumnName() {

			return "IMGNM4";

		}

		public String IMGNM5;

		public String getIMGNM5() {
			return this.IMGNM5;
		}

		public Boolean IMGNM5IsNullable() {
			return false;
		}

		public Boolean IMGNM5IsKey() {
			return false;
		}

		public Integer IMGNM5Length() {
			return 15;
		}

		public Integer IMGNM5Precision() {
			return 0;
		}

		public String IMGNM5Default() {

			return null;

		}

		public String IMGNM5Comment() {

			return "";

		}

		public String IMGNM5Pattern() {

			return "";

		}

		public String IMGNM5OriginalDbColumnName() {

			return "IMGNM5";

		}

		public String TAGAUT;

		public String getTAGAUT() {
			return this.TAGAUT;
		}

		public Boolean TAGAUTIsNullable() {
			return false;
		}

		public Boolean TAGAUTIsKey() {
			return false;
		}

		public Integer TAGAUTLength() {
			return 50;
		}

		public Integer TAGAUTPrecision() {
			return 0;
		}

		public String TAGAUTDefault() {

			return null;

		}

		public String TAGAUTComment() {

			return "";

		}

		public String TAGAUTPattern() {

			return "";

		}

		public String TAGAUTOriginalDbColumnName() {

			return "TAGAUT";

		}

		public String TASHLF;

		public String getTASHLF() {
			return this.TASHLF;
		}

		public Boolean TASHLFIsNullable() {
			return false;
		}

		public Boolean TASHLFIsKey() {
			return false;
		}

		public Integer TASHLFLength() {
			return 1;
		}

		public Integer TASHLFPrecision() {
			return 0;
		}

		public String TASHLFDefault() {

			return null;

		}

		public String TASHLFComment() {

			return "";

		}

		public String TASHLFPattern() {

			return "";

		}

		public String TASHLFOriginalDbColumnName() {

			return "TASHLF";

		}

		public BigDecimal TADYEX;

		public BigDecimal getTADYEX() {
			return this.TADYEX;
		}

		public Boolean TADYEXIsNullable() {
			return false;
		}

		public Boolean TADYEXIsKey() {
			return false;
		}

		public Integer TADYEXLength() {
			return 3;
		}

		public Integer TADYEXPrecision() {
			return 0;
		}

		public String TADYEXDefault() {

			return "";

		}

		public String TADYEXComment() {

			return "";

		}

		public String TADYEXPattern() {

			return "";

		}

		public String TADYEXOriginalDbColumnName() {

			return "TADYEX";

		}

		public float CRTCEN;

		public float getCRTCEN() {
			return this.CRTCEN;
		}

		public Boolean CRTCENIsNullable() {
			return false;
		}

		public Boolean CRTCENIsKey() {
			return false;
		}

		public Integer CRTCENLength() {
			return 1;
		}

		public Integer CRTCENPrecision() {
			return 0;
		}

		public String CRTCENDefault() {

			return "";

		}

		public String CRTCENComment() {

			return "";

		}

		public String CRTCENPattern() {

			return "";

		}

		public String CRTCENOriginalDbColumnName() {

			return "CRTCEN";

		}

		public float CRTDAT;

		public float getCRTDAT() {
			return this.CRTDAT;
		}

		public Boolean CRTDATIsNullable() {
			return false;
		}

		public Boolean CRTDATIsKey() {
			return false;
		}

		public Integer CRTDATLength() {
			return 6;
		}

		public Integer CRTDATPrecision() {
			return 0;
		}

		public String CRTDATDefault() {

			return "";

		}

		public String CRTDATComment() {

			return "";

		}

		public String CRTDATPattern() {

			return "";

		}

		public String CRTDATOriginalDbColumnName() {

			return "CRTDAT";

		}

		public String TAGCLR;

		public String getTAGCLR() {
			return this.TAGCLR;
		}

		public Boolean TAGCLRIsNullable() {
			return false;
		}

		public Boolean TAGCLRIsKey() {
			return false;
		}

		public Integer TAGCLRLength() {
			return 30;
		}

		public Integer TAGCLRPrecision() {
			return 0;
		}

		public String TAGCLRDefault() {

			return null;

		}

		public String TAGCLRComment() {

			return "";

		}

		public String TAGCLRPattern() {

			return "";

		}

		public String TAGCLROriginalDbColumnName() {

			return "TAGCLR";

		}

		public String TAGSIZ;

		public String getTAGSIZ() {
			return this.TAGSIZ;
		}

		public Boolean TAGSIZIsNullable() {
			return false;
		}

		public Boolean TAGSIZIsKey() {
			return false;
		}

		public Integer TAGSIZLength() {
			return 20;
		}

		public Integer TAGSIZPrecision() {
			return 0;
		}

		public String TAGSIZDefault() {

			return null;

		}

		public String TAGSIZComment() {

			return "";

		}

		public String TAGSIZPattern() {

			return "";

		}

		public String TAGSIZOriginalDbColumnName() {

			return "TAGSIZ";

		}

		public String TAGFLV;

		public String getTAGFLV() {
			return this.TAGFLV;
		}

		public Boolean TAGFLVIsNullable() {
			return false;
		}

		public Boolean TAGFLVIsKey() {
			return false;
		}

		public Integer TAGFLVLength() {
			return 40;
		}

		public Integer TAGFLVPrecision() {
			return 0;
		}

		public String TAGFLVDefault() {

			return null;

		}

		public String TAGFLVComment() {

			return "";

		}

		public String TAGFLVPattern() {

			return "";

		}

		public String TAGFLVOriginalDbColumnName() {

			return "TAGFLV";

		}

		public String TAGSNT;

		public String getTAGSNT() {
			return this.TAGSNT;
		}

		public Boolean TAGSNTIsNullable() {
			return false;
		}

		public Boolean TAGSNTIsKey() {
			return false;
		}

		public Integer TAGSNTLength() {
			return 30;
		}

		public Integer TAGSNTPrecision() {
			return 0;
		}

		public String TAGSNTDefault() {

			return null;

		}

		public String TAGSNTComment() {

			return "";

		}

		public String TAGSNTPattern() {

			return "";

		}

		public String TAGSNTOriginalDbColumnName() {

			return "TAGSNT";

		}

		public BigDecimal CSWGHT;

		public BigDecimal getCSWGHT() {
			return this.CSWGHT;
		}

		public Boolean CSWGHTIsNullable() {
			return false;
		}

		public Boolean CSWGHTIsKey() {
			return false;
		}

		public Integer CSWGHTLength() {
			return 7;
		}

		public Integer CSWGHTPrecision() {
			return 3;
		}

		public String CSWGHTDefault() {

			return "";

		}

		public String CSWGHTComment() {

			return "";

		}

		public String CSWGHTPattern() {

			return "";

		}

		public String CSWGHTOriginalDbColumnName() {

			return "CSWGHT";

		}

		public BigDecimal CSLGTH;

		public BigDecimal getCSLGTH() {
			return this.CSLGTH;
		}

		public Boolean CSLGTHIsNullable() {
			return false;
		}

		public Boolean CSLGTHIsKey() {
			return false;
		}

		public Integer CSLGTHLength() {
			return 5;
		}

		public Integer CSLGTHPrecision() {
			return 1;
		}

		public String CSLGTHDefault() {

			return "";

		}

		public String CSLGTHComment() {

			return "";

		}

		public String CSLGTHPattern() {

			return "";

		}

		public String CSLGTHOriginalDbColumnName() {

			return "CSLGTH";

		}

		public BigDecimal CSWDTH;

		public BigDecimal getCSWDTH() {
			return this.CSWDTH;
		}

		public Boolean CSWDTHIsNullable() {
			return false;
		}

		public Boolean CSWDTHIsKey() {
			return false;
		}

		public Integer CSWDTHLength() {
			return 5;
		}

		public Integer CSWDTHPrecision() {
			return 1;
		}

		public String CSWDTHDefault() {

			return "";

		}

		public String CSWDTHComment() {

			return "";

		}

		public String CSWDTHPattern() {

			return "";

		}

		public String CSWDTHOriginalDbColumnName() {

			return "CSWDTH";

		}

		public BigDecimal CSHGHT;

		public BigDecimal getCSHGHT() {
			return this.CSHGHT;
		}

		public Boolean CSHGHTIsNullable() {
			return false;
		}

		public Boolean CSHGHTIsKey() {
			return false;
		}

		public Integer CSHGHTLength() {
			return 5;
		}

		public Integer CSHGHTPrecision() {
			return 1;
		}

		public String CSHGHTDefault() {

			return "";

		}

		public String CSHGHTComment() {

			return "";

		}

		public String CSHGHTPattern() {

			return "";

		}

		public String CSHGHTOriginalDbColumnName() {

			return "CSHGHT";

		}

		public BigDecimal CSCUBE;

		public BigDecimal getCSCUBE() {
			return this.CSCUBE;
		}

		public Boolean CSCUBEIsNullable() {
			return false;
		}

		public Boolean CSCUBEIsKey() {
			return false;
		}

		public Integer CSCUBELength() {
			return 9;
		}

		public Integer CSCUBEPrecision() {
			return 3;
		}

		public String CSCUBEDefault() {

			return "";

		}

		public String CSCUBEComment() {

			return "";

		}

		public String CSCUBEPattern() {

			return "";

		}

		public String CSCUBEOriginalDbColumnName() {

			return "CSCUBE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					this.CRTCEN = dis.readFloat();

					this.CRTDAT = dis.readFloat();

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					this.CRTCEN = dis.readFloat();

					this.CRTDAT = dis.readFloat();

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// float

				dos.writeFloat(this.CRTCEN);

				// float

				dos.writeFloat(this.CRTDAT);

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// float

				dos.writeFloat(this.CRTCEN);

				// float

				dos.writeFloat(this.CRTDAT);

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",TAGAMT=" + String.valueOf(TAGAMT));
			sb.append(",TAGFRM=" + TAGFRM);
			sb.append(",TAGAUM=" + TAGAUM);
			sb.append(",TASUOM=" + TASUOM);
			sb.append(",TAGSRV=" + TAGSRV);
			sb.append(",TASNUM=" + String.valueOf(TASNUM));
			sb.append(",TAGVIT=" + TAGVIT);
			sb.append(",TAGCTG=" + TAGCTG);
			sb.append(",SUBSKU=" + String.valueOf(SUBSKU));
			sb.append(",CMPSKU=" + String.valueOf(CMPSKU));
			sb.append(",UPSSKU=" + String.valueOf(UPSSKU));
			sb.append(",SAVSKU=" + String.valueOf(SAVSKU));
			sb.append(",IMGNM1=" + IMGNM1);
			sb.append(",IMGNM2=" + IMGNM2);
			sb.append(",IMGNM3=" + IMGNM3);
			sb.append(",IMGNM4=" + IMGNM4);
			sb.append(",IMGNM5=" + IMGNM5);
			sb.append(",TAGAUT=" + TAGAUT);
			sb.append(",TASHLF=" + TASHLF);
			sb.append(",TADYEX=" + String.valueOf(TADYEX));
			sb.append(",CRTCEN=" + String.valueOf(CRTCEN));
			sb.append(",CRTDAT=" + String.valueOf(CRTDAT));
			sb.append(",TAGCLR=" + TAGCLR);
			sb.append(",TAGSIZ=" + TAGSIZ);
			sb.append(",TAGFLV=" + TAGFLV);
			sb.append(",TAGSNT=" + TAGSNT);
			sb.append(",CSWGHT=" + String.valueOf(CSWGHT));
			sb.append(",CSLGTH=" + String.valueOf(CSLGTH));
			sb.append(",CSWDTH=" + String.valueOf(CSWDTH));
			sb.append(",CSHGHT=" + String.valueOf(CSHGHT));
			sb.append(",CSCUBE=" + String.valueOf(CSCUBE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (TAGAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAMT);
			}

			sb.append("|");

			if (TAGFRM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFRM);
			}

			sb.append("|");

			if (TAGAUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUM);
			}

			sb.append("|");

			if (TASUOM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASUOM);
			}

			sb.append("|");

			if (TAGSRV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSRV);
			}

			sb.append("|");

			if (TASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASNUM);
			}

			sb.append("|");

			if (TAGVIT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGVIT);
			}

			sb.append("|");

			if (TAGCTG == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCTG);
			}

			sb.append("|");

			if (SUBSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SUBSKU);
			}

			sb.append("|");

			if (CMPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(CMPSKU);
			}

			sb.append("|");

			if (UPSSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(UPSSKU);
			}

			sb.append("|");

			if (SAVSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SAVSKU);
			}

			sb.append("|");

			if (IMGNM1 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM1);
			}

			sb.append("|");

			if (IMGNM2 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM2);
			}

			sb.append("|");

			if (IMGNM3 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM3);
			}

			sb.append("|");

			if (IMGNM4 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM4);
			}

			sb.append("|");

			if (IMGNM5 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM5);
			}

			sb.append("|");

			if (TAGAUT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUT);
			}

			sb.append("|");

			if (TASHLF == null) {
				sb.append("<null>");
			} else {
				sb.append(TASHLF);
			}

			sb.append("|");

			if (TADYEX == null) {
				sb.append("<null>");
			} else {
				sb.append(TADYEX);
			}

			sb.append("|");

			sb.append(CRTCEN);

			sb.append("|");

			sb.append(CRTDAT);

			sb.append("|");

			if (TAGCLR == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCLR);
			}

			sb.append("|");

			if (TAGSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSIZ);
			}

			sb.append("|");

			if (TAGFLV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFLV);
			}

			sb.append("|");

			if (TAGSNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSNT);
			}

			sb.append("|");

			if (CSWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWGHT);
			}

			sb.append("|");

			if (CSLGTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSLGTH);
			}

			sb.append("|");

			if (CSWDTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWDTH);
			}

			sb.append("|");

			if (CSHGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSHGHT);
			}

			sb.append("|");

			if (CSCUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(CSCUBE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row30Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tDBInput_21Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_21_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_21");
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

				row30Struct row30 = new row30Struct();

				/**
				 * [tFileOutputDelimited_15 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_15", false);
				start_Hash.put("tFileOutputDelimited_15", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_15";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row30");

				int tos_count_tFileOutputDelimited_15 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_15 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_15 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_15 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_15.append("Parameters:");
							log4jParamters_tFileOutputDelimited_15.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/INZTAG.csv\"");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("FIELDSEPARATOR" + " = " + "\"|\"");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							log4jParamters_tFileOutputDelimited_15.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_15.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_15 - " + (log4jParamters_tFileOutputDelimited_15));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_15().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_15", "tFileOutputDelimited_15", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_15 = "";
				fileName_tFileOutputDelimited_15 = (new java.io.File("/data/talend/data_repository/INZTAG.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_15 = null;
				String extension_tFileOutputDelimited_15 = null;
				String directory_tFileOutputDelimited_15 = null;
				if ((fileName_tFileOutputDelimited_15.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_15.lastIndexOf(".") < fileName_tFileOutputDelimited_15
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15;
						extension_tFileOutputDelimited_15 = "";
					} else {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15.substring(0,
								fileName_tFileOutputDelimited_15.lastIndexOf("."));
						extension_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(fileName_tFileOutputDelimited_15.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15.substring(0,
							fileName_tFileOutputDelimited_15.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_15.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15.substring(0,
								fileName_tFileOutputDelimited_15.lastIndexOf("."));
						extension_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15
								.substring(fileName_tFileOutputDelimited_15.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_15 = fileName_tFileOutputDelimited_15;
						extension_tFileOutputDelimited_15 = "";
					}
					directory_tFileOutputDelimited_15 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_15 = true;
				java.io.File filetFileOutputDelimited_15 = new java.io.File(fileName_tFileOutputDelimited_15);
				globalMap.put("tFileOutputDelimited_15_FILE_NAME", fileName_tFileOutputDelimited_15);
				int nb_line_tFileOutputDelimited_15 = 0;
				int splitedFileNo_tFileOutputDelimited_15 = 0;
				int currentRow_tFileOutputDelimited_15 = 0;

				final String OUT_DELIM_tFileOutputDelimited_15 = /**
																	 * Start field
																	 * tFileOutputDelimited_15:FIELDSEPARATOR
																	 */
						"|"/** End field tFileOutputDelimited_15:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_15 = /**
																		 * Start field
																		 * tFileOutputDelimited_15:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_15:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_15 != null
						&& directory_tFileOutputDelimited_15.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_15 = new java.io.File(directory_tFileOutputDelimited_15);
					if (!dir_tFileOutputDelimited_15.exists()) {
						log.info("tFileOutputDelimited_15 - Creating directory '"
								+ dir_tFileOutputDelimited_15.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_15.mkdirs();
						log.info("tFileOutputDelimited_15 - The directory '"
								+ dir_tFileOutputDelimited_15.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_15 = new java.io.File(fileName_tFileOutputDelimited_15);
				String zipName_tFileOutputDelimited_15 = fullName_tFileOutputDelimited_15 + ".zip";
				java.io.File file_tFileOutputDelimited_15 = new java.io.File(zipName_tFileOutputDelimited_15);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_15 = null;
				java.io.Writer outtFileOutputDelimited_15 = null;

				if (file_tFileOutputDelimited_15.exists()) {
					file_tFileOutputDelimited_15.delete();
				}
				zipOut_tFileOutputDelimited_15 = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(
						new java.io.FileOutputStream(zipName_tFileOutputDelimited_15)));
				zipOut_tFileOutputDelimited_15
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_15.getName()));
				outtFileOutputDelimited_15 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_15, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_15", outtFileOutputDelimited_15);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_15.length() == 0) {
						outtFileOutputDelimited_15.write("INUMBR");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGAMT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGFRM");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGAUM");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TASUOM");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGSRV");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TASNUM");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGVIT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGCTG");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("SUBSKU");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CMPSKU");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("UPSSKU");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("SAVSKU");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("IMGNM1");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("IMGNM2");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("IMGNM3");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("IMGNM4");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("IMGNM5");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGAUT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TASHLF");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TADYEX");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CRTCEN");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CRTDAT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGCLR");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGSIZ");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGFLV");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("TAGSNT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CSWGHT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CSLGTH");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CSWDTH");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CSHGHT");
						outtFileOutputDelimited_15.write(OUT_DELIM_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.write("CSCUBE");
						outtFileOutputDelimited_15.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_15);
						outtFileOutputDelimited_15.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_15", nb_line_tFileOutputDelimited_15);

				/**
				 * [tFileOutputDelimited_15 begin ] stop
				 */

				/**
				 * [tDBInput_21 begin ] start
				 */

				ok_Hash.put("tDBInput_21", false);
				start_Hash.put("tDBInput_21", System.currentTimeMillis());

				currentComponent = "tDBInput_21";

				int tos_count_tDBInput_21 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_21 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_21 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_21 = new StringBuilder();
							log4jParamters_tDBInput_21.append("Parameters:");
							log4jParamters_tDBInput_21.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("QUERY" + " = " + "\"select * from MM4R5LIB.INZTAG\"");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TAGAMT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGFRM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGAUM") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TASUOM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TAGSRV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TASNUM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGVIT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGCTG") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("SUBSKU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CMPSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("UPSSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("SAVSKU")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("IMGNM1") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("IMGNM2") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IMGNM3") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("IMGNM4") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("IMGNM5")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGAUT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TASHLF") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TADYEX") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CRTCEN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CRTDAT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGCLR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TAGSIZ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TAGFLV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TAGSNT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CSWGHT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CSLGTH") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CSWDTH") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CSHGHT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CSCUBE") + "}]");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_21.append(" | ");
							log4jParamters_tDBInput_21.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_21.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_21 - " + (log4jParamters_tDBInput_21));
						}
					}
					new BytesLimit65535_tDBInput_21().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_21", "tDBInput_21", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_21 = 0;
				java.sql.Connection conn_tDBInput_21 = null;
				String driverClass_tDBInput_21 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_21 = java.lang.Class.forName(driverClass_tDBInput_21);
				String dbUser_tDBInput_21 = context.jda_user_name;

				final String decryptedPassword_tDBInput_21 = context.jda_password;

				String dbPwd_tDBInput_21 = decryptedPassword_tDBInput_21;

				String url_tDBInput_21 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_21 - Driver ClassName: " + driverClass_tDBInput_21 + ".");

				log.debug("tDBInput_21 - Connection attempt to '" + url_tDBInput_21 + "' with the username '"
						+ dbUser_tDBInput_21 + "'.");

				conn_tDBInput_21 = java.sql.DriverManager.getConnection(url_tDBInput_21, dbUser_tDBInput_21,
						dbPwd_tDBInput_21);
				log.debug("tDBInput_21 - Connection to '" + url_tDBInput_21 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_21 = conn_tDBInput_21.createStatement();

				String dbquery_tDBInput_21 = "select * from MM4R5LIB.INZTAG";

				log.debug("tDBInput_21 - Executing the query: '" + dbquery_tDBInput_21 + "'.");

				globalMap.put("tDBInput_21_QUERY", dbquery_tDBInput_21);
				java.sql.ResultSet rs_tDBInput_21 = null;

				try {
					rs_tDBInput_21 = stmt_tDBInput_21.executeQuery(dbquery_tDBInput_21);
					java.sql.ResultSetMetaData rsmd_tDBInput_21 = rs_tDBInput_21.getMetaData();
					int colQtyInRs_tDBInput_21 = rsmd_tDBInput_21.getColumnCount();

					String tmpContent_tDBInput_21 = null;

					log.debug("tDBInput_21 - Retrieving records from the database.");

					while (rs_tDBInput_21.next()) {
						nb_line_tDBInput_21++;

						if (colQtyInRs_tDBInput_21 < 1) {
							row30.INUMBR = null;
						} else {

							row30.INUMBR = rs_tDBInput_21.getBigDecimal(1);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 2) {
							row30.TAGAMT = null;
						} else {

							row30.TAGAMT = rs_tDBInput_21.getBigDecimal(2);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 3) {
							row30.TAGFRM = null;
						} else {

							row30.TAGFRM = routines.system.JDBCUtil.getString(rs_tDBInput_21, 3, false);
						}
						if (colQtyInRs_tDBInput_21 < 4) {
							row30.TAGAUM = null;
						} else {

							row30.TAGAUM = routines.system.JDBCUtil.getString(rs_tDBInput_21, 4, false);
						}
						if (colQtyInRs_tDBInput_21 < 5) {
							row30.TASUOM = null;
						} else {

							row30.TASUOM = routines.system.JDBCUtil.getString(rs_tDBInput_21, 5, false);
						}
						if (colQtyInRs_tDBInput_21 < 6) {
							row30.TAGSRV = null;
						} else {

							row30.TAGSRV = routines.system.JDBCUtil.getString(rs_tDBInput_21, 6, false);
						}
						if (colQtyInRs_tDBInput_21 < 7) {
							row30.TASNUM = null;
						} else {

							row30.TASNUM = rs_tDBInput_21.getBigDecimal(7);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 8) {
							row30.TAGVIT = null;
						} else {

							row30.TAGVIT = routines.system.JDBCUtil.getString(rs_tDBInput_21, 8, false);
						}
						if (colQtyInRs_tDBInput_21 < 9) {
							row30.TAGCTG = null;
						} else {

							row30.TAGCTG = routines.system.JDBCUtil.getString(rs_tDBInput_21, 9, false);
						}
						if (colQtyInRs_tDBInput_21 < 10) {
							row30.SUBSKU = null;
						} else {

							row30.SUBSKU = rs_tDBInput_21.getBigDecimal(10);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 11) {
							row30.CMPSKU = null;
						} else {

							row30.CMPSKU = rs_tDBInput_21.getBigDecimal(11);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 12) {
							row30.UPSSKU = null;
						} else {

							row30.UPSSKU = rs_tDBInput_21.getBigDecimal(12);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 13) {
							row30.SAVSKU = null;
						} else {

							row30.SAVSKU = rs_tDBInput_21.getBigDecimal(13);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 14) {
							row30.IMGNM1 = null;
						} else {

							row30.IMGNM1 = routines.system.JDBCUtil.getString(rs_tDBInput_21, 14, false);
						}
						if (colQtyInRs_tDBInput_21 < 15) {
							row30.IMGNM2 = null;
						} else {

							row30.IMGNM2 = routines.system.JDBCUtil.getString(rs_tDBInput_21, 15, false);
						}
						if (colQtyInRs_tDBInput_21 < 16) {
							row30.IMGNM3 = null;
						} else {

							row30.IMGNM3 = routines.system.JDBCUtil.getString(rs_tDBInput_21, 16, false);
						}
						if (colQtyInRs_tDBInput_21 < 17) {
							row30.IMGNM4 = null;
						} else {

							row30.IMGNM4 = routines.system.JDBCUtil.getString(rs_tDBInput_21, 17, false);
						}
						if (colQtyInRs_tDBInput_21 < 18) {
							row30.IMGNM5 = null;
						} else {

							row30.IMGNM5 = routines.system.JDBCUtil.getString(rs_tDBInput_21, 18, false);
						}
						if (colQtyInRs_tDBInput_21 < 19) {
							row30.TAGAUT = null;
						} else {

							row30.TAGAUT = routines.system.JDBCUtil.getString(rs_tDBInput_21, 19, false);
						}
						if (colQtyInRs_tDBInput_21 < 20) {
							row30.TASHLF = null;
						} else {

							row30.TASHLF = routines.system.JDBCUtil.getString(rs_tDBInput_21, 20, false);
						}
						if (colQtyInRs_tDBInput_21 < 21) {
							row30.TADYEX = null;
						} else {

							row30.TADYEX = rs_tDBInput_21.getBigDecimal(21);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 22) {
							row30.CRTCEN = 0;
						} else {

							row30.CRTCEN = rs_tDBInput_21.getFloat(22);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 23) {
							row30.CRTDAT = 0;
						} else {

							row30.CRTDAT = rs_tDBInput_21.getFloat(23);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 24) {
							row30.TAGCLR = null;
						} else {

							row30.TAGCLR = routines.system.JDBCUtil.getString(rs_tDBInput_21, 24, false);
						}
						if (colQtyInRs_tDBInput_21 < 25) {
							row30.TAGSIZ = null;
						} else {

							row30.TAGSIZ = routines.system.JDBCUtil.getString(rs_tDBInput_21, 25, false);
						}
						if (colQtyInRs_tDBInput_21 < 26) {
							row30.TAGFLV = null;
						} else {

							row30.TAGFLV = routines.system.JDBCUtil.getString(rs_tDBInput_21, 26, false);
						}
						if (colQtyInRs_tDBInput_21 < 27) {
							row30.TAGSNT = null;
						} else {

							row30.TAGSNT = routines.system.JDBCUtil.getString(rs_tDBInput_21, 27, false);
						}
						if (colQtyInRs_tDBInput_21 < 28) {
							row30.CSWGHT = null;
						} else {

							row30.CSWGHT = rs_tDBInput_21.getBigDecimal(28);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 29) {
							row30.CSLGTH = null;
						} else {

							row30.CSLGTH = rs_tDBInput_21.getBigDecimal(29);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 30) {
							row30.CSWDTH = null;
						} else {

							row30.CSWDTH = rs_tDBInput_21.getBigDecimal(30);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 31) {
							row30.CSHGHT = null;
						} else {

							row30.CSHGHT = rs_tDBInput_21.getBigDecimal(31);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_21 < 32) {
							row30.CSCUBE = null;
						} else {

							row30.CSCUBE = rs_tDBInput_21.getBigDecimal(32);
							if (rs_tDBInput_21.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}

						log.debug("tDBInput_21 - Retrieving the record " + nb_line_tDBInput_21 + ".");

						/**
						 * [tDBInput_21 begin ] stop
						 */

						/**
						 * [tDBInput_21 main ] start
						 */

						currentComponent = "tDBInput_21";

						tos_count_tDBInput_21++;

						/**
						 * [tDBInput_21 main ] stop
						 */

						/**
						 * [tDBInput_21 process_data_begin ] start
						 */

						currentComponent = "tDBInput_21";

						/**
						 * [tDBInput_21 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_15 main ] start
						 */

						currentComponent = "tFileOutputDelimited_15";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row30", "tDBInput_21", "tDBInput_21", "tAS400Input", "tFileOutputDelimited_15",
								"tFileOutputDelimited_15", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row30 - " + (row30 == null ? "" : row30.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_15 = new StringBuilder();
						if (row30.INUMBR != null) {
							sb_tFileOutputDelimited_15
									.append(row30.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGAMT != null) {
							sb_tFileOutputDelimited_15
									.append(row30.TAGAMT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGFRM != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGFRM);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGAUM != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGAUM);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TASUOM != null) {
							sb_tFileOutputDelimited_15.append(row30.TASUOM);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGSRV != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGSRV);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TASNUM != null) {
							sb_tFileOutputDelimited_15
									.append(row30.TASNUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGVIT != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGVIT);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGCTG != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGCTG);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.SUBSKU != null) {
							sb_tFileOutputDelimited_15
									.append(row30.SUBSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CMPSKU != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CMPSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.UPSSKU != null) {
							sb_tFileOutputDelimited_15
									.append(row30.UPSSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.SAVSKU != null) {
							sb_tFileOutputDelimited_15
									.append(row30.SAVSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.IMGNM1 != null) {
							sb_tFileOutputDelimited_15.append(row30.IMGNM1);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.IMGNM2 != null) {
							sb_tFileOutputDelimited_15.append(row30.IMGNM2);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.IMGNM3 != null) {
							sb_tFileOutputDelimited_15.append(row30.IMGNM3);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.IMGNM4 != null) {
							sb_tFileOutputDelimited_15.append(row30.IMGNM4);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.IMGNM5 != null) {
							sb_tFileOutputDelimited_15.append(row30.IMGNM5);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGAUT != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGAUT);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TASHLF != null) {
							sb_tFileOutputDelimited_15.append(row30.TASHLF);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TADYEX != null) {
							sb_tFileOutputDelimited_15
									.append(row30.TADYEX.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						sb_tFileOutputDelimited_15.append(row30.CRTCEN);
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						sb_tFileOutputDelimited_15.append(row30.CRTDAT);
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGCLR != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGCLR);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGSIZ != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGSIZ);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGFLV != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGFLV);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.TAGSNT != null) {
							sb_tFileOutputDelimited_15.append(row30.TAGSNT);
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CSWGHT != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CSWGHT.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CSLGTH != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CSLGTH.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CSWDTH != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CSWDTH.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CSHGHT != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CSHGHT.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_tFileOutputDelimited_15);
						if (row30.CSCUBE != null) {
							sb_tFileOutputDelimited_15
									.append(row30.CSCUBE.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_15.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_15);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_15++;
							resourceMap.put("nb_line_tFileOutputDelimited_15", nb_line_tFileOutputDelimited_15);

							outtFileOutputDelimited_15.write(sb_tFileOutputDelimited_15.toString());
							log.debug("tFileOutputDelimited_15 - Writing the record " + nb_line_tFileOutputDelimited_15
									+ ".");

						}

						tos_count_tFileOutputDelimited_15++;

						/**
						 * [tFileOutputDelimited_15 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_15 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_15";

						/**
						 * [tFileOutputDelimited_15 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_15 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_15";

						/**
						 * [tFileOutputDelimited_15 process_data_end ] stop
						 */

						/**
						 * [tDBInput_21 process_data_end ] start
						 */

						currentComponent = "tDBInput_21";

						/**
						 * [tDBInput_21 process_data_end ] stop
						 */

						/**
						 * [tDBInput_21 end ] start
						 */

						currentComponent = "tDBInput_21";

					}
				} finally {
					if (rs_tDBInput_21 != null) {
						rs_tDBInput_21.close();
					}
					if (stmt_tDBInput_21 != null) {
						stmt_tDBInput_21.close();
					}
					if (conn_tDBInput_21 != null && !conn_tDBInput_21.isClosed()) {

						log.debug("tDBInput_21 - Closing the connection to the database.");

						conn_tDBInput_21.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_21 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_21_NB_LINE", nb_line_tDBInput_21);
				log.debug("tDBInput_21 - Retrieved records count: " + nb_line_tDBInput_21 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_21 - " + ("Done."));

				ok_Hash.put("tDBInput_21", true);
				end_Hash.put("tDBInput_21", System.currentTimeMillis());

				/**
				 * [tDBInput_21 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_15 end ] start
				 */

				currentComponent = "tFileOutputDelimited_15";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_15 != null) {
						outtFileOutputDelimited_15.flush();
						outtFileOutputDelimited_15.close();
					}

					globalMap.put("tFileOutputDelimited_15_NB_LINE", nb_line_tFileOutputDelimited_15);
					globalMap.put("tFileOutputDelimited_15_FILE_NAME", fileName_tFileOutputDelimited_15);

				}

				resourceMap.put("finish_tFileOutputDelimited_15", true);

				log.debug("tFileOutputDelimited_15 - Written records count: " + nb_line_tFileOutputDelimited_15 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row30", 2, 0,
						"tDBInput_21", "tDBInput_21", "tAS400Input", "tFileOutputDelimited_15",
						"tFileOutputDelimited_15", "tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_15 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_15", true);
				end_Hash.put("tFileOutputDelimited_15", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_15 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_21:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk14", 0, "ok");
			}

			tFileInputDelimited_10Process(globalMap);

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
				 * [tDBInput_21 finally ] start
				 */

				currentComponent = "tDBInput_21";

				/**
				 * [tDBInput_21 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_15 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_15";

				if (resourceMap.get("finish_tFileOutputDelimited_15") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_15 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_15");
						if (outtFileOutputDelimited_15 != null) {
							outtFileOutputDelimited_15.flush();
							outtFileOutputDelimited_15.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_15 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_21_SUBPROCESS_STATE", 1);
	}

	public static class INZTAGStruct implements routines.system.IPersistableRow<INZTAGStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal INUMBR;

		public BigDecimal getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return true;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return null;
		}

		public Integer INUMBRPrecision() {
			return null;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public BigDecimal TAGAMT;

		public BigDecimal getTAGAMT() {
			return this.TAGAMT;
		}

		public Boolean TAGAMTIsNullable() {
			return true;
		}

		public Boolean TAGAMTIsKey() {
			return false;
		}

		public Integer TAGAMTLength() {
			return null;
		}

		public Integer TAGAMTPrecision() {
			return null;
		}

		public String TAGAMTDefault() {

			return "";

		}

		public String TAGAMTComment() {

			return "";

		}

		public String TAGAMTPattern() {

			return "";

		}

		public String TAGAMTOriginalDbColumnName() {

			return "TAGAMT";

		}

		public String TAGFRM;

		public String getTAGFRM() {
			return this.TAGFRM;
		}

		public Boolean TAGFRMIsNullable() {
			return true;
		}

		public Boolean TAGFRMIsKey() {
			return false;
		}

		public Integer TAGFRMLength() {
			return null;
		}

		public Integer TAGFRMPrecision() {
			return null;
		}

		public String TAGFRMDefault() {

			return null;

		}

		public String TAGFRMComment() {

			return "";

		}

		public String TAGFRMPattern() {

			return "";

		}

		public String TAGFRMOriginalDbColumnName() {

			return "TAGFRM";

		}

		public String TAGAUM;

		public String getTAGAUM() {
			return this.TAGAUM;
		}

		public Boolean TAGAUMIsNullable() {
			return true;
		}

		public Boolean TAGAUMIsKey() {
			return false;
		}

		public Integer TAGAUMLength() {
			return null;
		}

		public Integer TAGAUMPrecision() {
			return null;
		}

		public String TAGAUMDefault() {

			return null;

		}

		public String TAGAUMComment() {

			return "";

		}

		public String TAGAUMPattern() {

			return "";

		}

		public String TAGAUMOriginalDbColumnName() {

			return "TAGAUM";

		}

		public String TASUOM;

		public String getTASUOM() {
			return this.TASUOM;
		}

		public Boolean TASUOMIsNullable() {
			return true;
		}

		public Boolean TASUOMIsKey() {
			return false;
		}

		public Integer TASUOMLength() {
			return null;
		}

		public Integer TASUOMPrecision() {
			return null;
		}

		public String TASUOMDefault() {

			return null;

		}

		public String TASUOMComment() {

			return "";

		}

		public String TASUOMPattern() {

			return "";

		}

		public String TASUOMOriginalDbColumnName() {

			return "TASUOM";

		}

		public String TAGSRV;

		public String getTAGSRV() {
			return this.TAGSRV;
		}

		public Boolean TAGSRVIsNullable() {
			return true;
		}

		public Boolean TAGSRVIsKey() {
			return false;
		}

		public Integer TAGSRVLength() {
			return null;
		}

		public Integer TAGSRVPrecision() {
			return null;
		}

		public String TAGSRVDefault() {

			return null;

		}

		public String TAGSRVComment() {

			return "";

		}

		public String TAGSRVPattern() {

			return "";

		}

		public String TAGSRVOriginalDbColumnName() {

			return "TAGSRV";

		}

		public BigDecimal TASNUM;

		public BigDecimal getTASNUM() {
			return this.TASNUM;
		}

		public Boolean TASNUMIsNullable() {
			return true;
		}

		public Boolean TASNUMIsKey() {
			return false;
		}

		public Integer TASNUMLength() {
			return null;
		}

		public Integer TASNUMPrecision() {
			return null;
		}

		public String TASNUMDefault() {

			return "";

		}

		public String TASNUMComment() {

			return "";

		}

		public String TASNUMPattern() {

			return "";

		}

		public String TASNUMOriginalDbColumnName() {

			return "TASNUM";

		}

		public String TAGVIT;

		public String getTAGVIT() {
			return this.TAGVIT;
		}

		public Boolean TAGVITIsNullable() {
			return true;
		}

		public Boolean TAGVITIsKey() {
			return false;
		}

		public Integer TAGVITLength() {
			return null;
		}

		public Integer TAGVITPrecision() {
			return null;
		}

		public String TAGVITDefault() {

			return null;

		}

		public String TAGVITComment() {

			return "";

		}

		public String TAGVITPattern() {

			return "";

		}

		public String TAGVITOriginalDbColumnName() {

			return "TAGVIT";

		}

		public String TAGCTG;

		public String getTAGCTG() {
			return this.TAGCTG;
		}

		public Boolean TAGCTGIsNullable() {
			return true;
		}

		public Boolean TAGCTGIsKey() {
			return false;
		}

		public Integer TAGCTGLength() {
			return null;
		}

		public Integer TAGCTGPrecision() {
			return null;
		}

		public String TAGCTGDefault() {

			return null;

		}

		public String TAGCTGComment() {

			return "";

		}

		public String TAGCTGPattern() {

			return "";

		}

		public String TAGCTGOriginalDbColumnName() {

			return "TAGCTG";

		}

		public BigDecimal SUBSKU;

		public BigDecimal getSUBSKU() {
			return this.SUBSKU;
		}

		public Boolean SUBSKUIsNullable() {
			return true;
		}

		public Boolean SUBSKUIsKey() {
			return false;
		}

		public Integer SUBSKULength() {
			return null;
		}

		public Integer SUBSKUPrecision() {
			return null;
		}

		public String SUBSKUDefault() {

			return "";

		}

		public String SUBSKUComment() {

			return "";

		}

		public String SUBSKUPattern() {

			return "";

		}

		public String SUBSKUOriginalDbColumnName() {

			return "SUBSKU";

		}

		public BigDecimal CMPSKU;

		public BigDecimal getCMPSKU() {
			return this.CMPSKU;
		}

		public Boolean CMPSKUIsNullable() {
			return true;
		}

		public Boolean CMPSKUIsKey() {
			return false;
		}

		public Integer CMPSKULength() {
			return null;
		}

		public Integer CMPSKUPrecision() {
			return null;
		}

		public String CMPSKUDefault() {

			return "";

		}

		public String CMPSKUComment() {

			return "";

		}

		public String CMPSKUPattern() {

			return "";

		}

		public String CMPSKUOriginalDbColumnName() {

			return "CMPSKU";

		}

		public BigDecimal UPSSKU;

		public BigDecimal getUPSSKU() {
			return this.UPSSKU;
		}

		public Boolean UPSSKUIsNullable() {
			return true;
		}

		public Boolean UPSSKUIsKey() {
			return false;
		}

		public Integer UPSSKULength() {
			return null;
		}

		public Integer UPSSKUPrecision() {
			return null;
		}

		public String UPSSKUDefault() {

			return "";

		}

		public String UPSSKUComment() {

			return "";

		}

		public String UPSSKUPattern() {

			return "";

		}

		public String UPSSKUOriginalDbColumnName() {

			return "UPSSKU";

		}

		public BigDecimal SAVSKU;

		public BigDecimal getSAVSKU() {
			return this.SAVSKU;
		}

		public Boolean SAVSKUIsNullable() {
			return true;
		}

		public Boolean SAVSKUIsKey() {
			return false;
		}

		public Integer SAVSKULength() {
			return null;
		}

		public Integer SAVSKUPrecision() {
			return null;
		}

		public String SAVSKUDefault() {

			return "";

		}

		public String SAVSKUComment() {

			return "";

		}

		public String SAVSKUPattern() {

			return "";

		}

		public String SAVSKUOriginalDbColumnName() {

			return "SAVSKU";

		}

		public String IMGNM1;

		public String getIMGNM1() {
			return this.IMGNM1;
		}

		public Boolean IMGNM1IsNullable() {
			return true;
		}

		public Boolean IMGNM1IsKey() {
			return false;
		}

		public Integer IMGNM1Length() {
			return null;
		}

		public Integer IMGNM1Precision() {
			return null;
		}

		public String IMGNM1Default() {

			return null;

		}

		public String IMGNM1Comment() {

			return "";

		}

		public String IMGNM1Pattern() {

			return "";

		}

		public String IMGNM1OriginalDbColumnName() {

			return "IMGNM1";

		}

		public String IMGNM2;

		public String getIMGNM2() {
			return this.IMGNM2;
		}

		public Boolean IMGNM2IsNullable() {
			return true;
		}

		public Boolean IMGNM2IsKey() {
			return false;
		}

		public Integer IMGNM2Length() {
			return null;
		}

		public Integer IMGNM2Precision() {
			return null;
		}

		public String IMGNM2Default() {

			return null;

		}

		public String IMGNM2Comment() {

			return "";

		}

		public String IMGNM2Pattern() {

			return "";

		}

		public String IMGNM2OriginalDbColumnName() {

			return "IMGNM2";

		}

		public String IMGNM3;

		public String getIMGNM3() {
			return this.IMGNM3;
		}

		public Boolean IMGNM3IsNullable() {
			return true;
		}

		public Boolean IMGNM3IsKey() {
			return false;
		}

		public Integer IMGNM3Length() {
			return null;
		}

		public Integer IMGNM3Precision() {
			return null;
		}

		public String IMGNM3Default() {

			return null;

		}

		public String IMGNM3Comment() {

			return "";

		}

		public String IMGNM3Pattern() {

			return "";

		}

		public String IMGNM3OriginalDbColumnName() {

			return "IMGNM3";

		}

		public String IMGNM4;

		public String getIMGNM4() {
			return this.IMGNM4;
		}

		public Boolean IMGNM4IsNullable() {
			return true;
		}

		public Boolean IMGNM4IsKey() {
			return false;
		}

		public Integer IMGNM4Length() {
			return null;
		}

		public Integer IMGNM4Precision() {
			return null;
		}

		public String IMGNM4Default() {

			return null;

		}

		public String IMGNM4Comment() {

			return "";

		}

		public String IMGNM4Pattern() {

			return "";

		}

		public String IMGNM4OriginalDbColumnName() {

			return "IMGNM4";

		}

		public String IMGNM5;

		public String getIMGNM5() {
			return this.IMGNM5;
		}

		public Boolean IMGNM5IsNullable() {
			return true;
		}

		public Boolean IMGNM5IsKey() {
			return false;
		}

		public Integer IMGNM5Length() {
			return null;
		}

		public Integer IMGNM5Precision() {
			return null;
		}

		public String IMGNM5Default() {

			return null;

		}

		public String IMGNM5Comment() {

			return "";

		}

		public String IMGNM5Pattern() {

			return "";

		}

		public String IMGNM5OriginalDbColumnName() {

			return "IMGNM5";

		}

		public String TAGAUT;

		public String getTAGAUT() {
			return this.TAGAUT;
		}

		public Boolean TAGAUTIsNullable() {
			return true;
		}

		public Boolean TAGAUTIsKey() {
			return false;
		}

		public Integer TAGAUTLength() {
			return null;
		}

		public Integer TAGAUTPrecision() {
			return null;
		}

		public String TAGAUTDefault() {

			return null;

		}

		public String TAGAUTComment() {

			return "";

		}

		public String TAGAUTPattern() {

			return "";

		}

		public String TAGAUTOriginalDbColumnName() {

			return "TAGAUT";

		}

		public String TASHLF;

		public String getTASHLF() {
			return this.TASHLF;
		}

		public Boolean TASHLFIsNullable() {
			return true;
		}

		public Boolean TASHLFIsKey() {
			return false;
		}

		public Integer TASHLFLength() {
			return null;
		}

		public Integer TASHLFPrecision() {
			return null;
		}

		public String TASHLFDefault() {

			return null;

		}

		public String TASHLFComment() {

			return "";

		}

		public String TASHLFPattern() {

			return "";

		}

		public String TASHLFOriginalDbColumnName() {

			return "TASHLF";

		}

		public BigDecimal TADYEX;

		public BigDecimal getTADYEX() {
			return this.TADYEX;
		}

		public Boolean TADYEXIsNullable() {
			return true;
		}

		public Boolean TADYEXIsKey() {
			return false;
		}

		public Integer TADYEXLength() {
			return null;
		}

		public Integer TADYEXPrecision() {
			return null;
		}

		public String TADYEXDefault() {

			return "";

		}

		public String TADYEXComment() {

			return "";

		}

		public String TADYEXPattern() {

			return "";

		}

		public String TADYEXOriginalDbColumnName() {

			return "TADYEX";

		}

		public Double CRTCEN;

		public Double getCRTCEN() {
			return this.CRTCEN;
		}

		public Boolean CRTCENIsNullable() {
			return true;
		}

		public Boolean CRTCENIsKey() {
			return false;
		}

		public Integer CRTCENLength() {
			return null;
		}

		public Integer CRTCENPrecision() {
			return null;
		}

		public String CRTCENDefault() {

			return "";

		}

		public String CRTCENComment() {

			return "";

		}

		public String CRTCENPattern() {

			return "";

		}

		public String CRTCENOriginalDbColumnName() {

			return "CRTCEN";

		}

		public Double CRTDAT;

		public Double getCRTDAT() {
			return this.CRTDAT;
		}

		public Boolean CRTDATIsNullable() {
			return true;
		}

		public Boolean CRTDATIsKey() {
			return false;
		}

		public Integer CRTDATLength() {
			return null;
		}

		public Integer CRTDATPrecision() {
			return null;
		}

		public String CRTDATDefault() {

			return "";

		}

		public String CRTDATComment() {

			return "";

		}

		public String CRTDATPattern() {

			return "";

		}

		public String CRTDATOriginalDbColumnName() {

			return "CRTDAT";

		}

		public String TAGCLR;

		public String getTAGCLR() {
			return this.TAGCLR;
		}

		public Boolean TAGCLRIsNullable() {
			return true;
		}

		public Boolean TAGCLRIsKey() {
			return false;
		}

		public Integer TAGCLRLength() {
			return null;
		}

		public Integer TAGCLRPrecision() {
			return null;
		}

		public String TAGCLRDefault() {

			return null;

		}

		public String TAGCLRComment() {

			return "";

		}

		public String TAGCLRPattern() {

			return "";

		}

		public String TAGCLROriginalDbColumnName() {

			return "TAGCLR";

		}

		public String TAGSIZ;

		public String getTAGSIZ() {
			return this.TAGSIZ;
		}

		public Boolean TAGSIZIsNullable() {
			return true;
		}

		public Boolean TAGSIZIsKey() {
			return false;
		}

		public Integer TAGSIZLength() {
			return null;
		}

		public Integer TAGSIZPrecision() {
			return null;
		}

		public String TAGSIZDefault() {

			return null;

		}

		public String TAGSIZComment() {

			return "";

		}

		public String TAGSIZPattern() {

			return "";

		}

		public String TAGSIZOriginalDbColumnName() {

			return "TAGSIZ";

		}

		public String TAGFLV;

		public String getTAGFLV() {
			return this.TAGFLV;
		}

		public Boolean TAGFLVIsNullable() {
			return true;
		}

		public Boolean TAGFLVIsKey() {
			return false;
		}

		public Integer TAGFLVLength() {
			return null;
		}

		public Integer TAGFLVPrecision() {
			return null;
		}

		public String TAGFLVDefault() {

			return null;

		}

		public String TAGFLVComment() {

			return "";

		}

		public String TAGFLVPattern() {

			return "";

		}

		public String TAGFLVOriginalDbColumnName() {

			return "TAGFLV";

		}

		public String TAGSNT;

		public String getTAGSNT() {
			return this.TAGSNT;
		}

		public Boolean TAGSNTIsNullable() {
			return true;
		}

		public Boolean TAGSNTIsKey() {
			return false;
		}

		public Integer TAGSNTLength() {
			return null;
		}

		public Integer TAGSNTPrecision() {
			return null;
		}

		public String TAGSNTDefault() {

			return null;

		}

		public String TAGSNTComment() {

			return "";

		}

		public String TAGSNTPattern() {

			return "";

		}

		public String TAGSNTOriginalDbColumnName() {

			return "TAGSNT";

		}

		public BigDecimal CSWGHT;

		public BigDecimal getCSWGHT() {
			return this.CSWGHT;
		}

		public Boolean CSWGHTIsNullable() {
			return true;
		}

		public Boolean CSWGHTIsKey() {
			return false;
		}

		public Integer CSWGHTLength() {
			return null;
		}

		public Integer CSWGHTPrecision() {
			return null;
		}

		public String CSWGHTDefault() {

			return "";

		}

		public String CSWGHTComment() {

			return "";

		}

		public String CSWGHTPattern() {

			return "";

		}

		public String CSWGHTOriginalDbColumnName() {

			return "CSWGHT";

		}

		public BigDecimal CSLGTH;

		public BigDecimal getCSLGTH() {
			return this.CSLGTH;
		}

		public Boolean CSLGTHIsNullable() {
			return true;
		}

		public Boolean CSLGTHIsKey() {
			return false;
		}

		public Integer CSLGTHLength() {
			return null;
		}

		public Integer CSLGTHPrecision() {
			return null;
		}

		public String CSLGTHDefault() {

			return "";

		}

		public String CSLGTHComment() {

			return "";

		}

		public String CSLGTHPattern() {

			return "";

		}

		public String CSLGTHOriginalDbColumnName() {

			return "CSLGTH";

		}

		public BigDecimal CSWDTH;

		public BigDecimal getCSWDTH() {
			return this.CSWDTH;
		}

		public Boolean CSWDTHIsNullable() {
			return true;
		}

		public Boolean CSWDTHIsKey() {
			return false;
		}

		public Integer CSWDTHLength() {
			return null;
		}

		public Integer CSWDTHPrecision() {
			return null;
		}

		public String CSWDTHDefault() {

			return "";

		}

		public String CSWDTHComment() {

			return "";

		}

		public String CSWDTHPattern() {

			return "";

		}

		public String CSWDTHOriginalDbColumnName() {

			return "CSWDTH";

		}

		public BigDecimal CSHGHT;

		public BigDecimal getCSHGHT() {
			return this.CSHGHT;
		}

		public Boolean CSHGHTIsNullable() {
			return true;
		}

		public Boolean CSHGHTIsKey() {
			return false;
		}

		public Integer CSHGHTLength() {
			return null;
		}

		public Integer CSHGHTPrecision() {
			return null;
		}

		public String CSHGHTDefault() {

			return "";

		}

		public String CSHGHTComment() {

			return "";

		}

		public String CSHGHTPattern() {

			return "";

		}

		public String CSHGHTOriginalDbColumnName() {

			return "CSHGHT";

		}

		public BigDecimal CSCUBE;

		public BigDecimal getCSCUBE() {
			return this.CSCUBE;
		}

		public Boolean CSCUBEIsNullable() {
			return true;
		}

		public Boolean CSCUBEIsKey() {
			return false;
		}

		public Integer CSCUBELength() {
			return null;
		}

		public Integer CSCUBEPrecision() {
			return null;
		}

		public String CSCUBEDefault() {

			return "";

		}

		public String CSCUBEComment() {

			return "";

		}

		public String CSCUBEPattern() {

			return "";

		}

		public String CSCUBEOriginalDbColumnName() {

			return "CSCUBE";

		}

		public java.util.Date LOAD_DATE;

		public java.util.Date getLOAD_DATE() {
			return this.LOAD_DATE;
		}

		public Boolean LOAD_DATEIsNullable() {
			return true;
		}

		public Boolean LOAD_DATEIsKey() {
			return false;
		}

		public Integer LOAD_DATELength() {
			return null;
		}

		public Integer LOAD_DATEPrecision() {
			return null;
		}

		public String LOAD_DATEDefault() {

			return null;

		}

		public String LOAD_DATEComment() {

			return "";

		}

		public String LOAD_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String LOAD_DATEOriginalDbColumnName() {

			return "LOAD_DATE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.CRTCEN = null;
					} else {
						this.CRTCEN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CRTDAT = null;
					} else {
						this.CRTDAT = dis.readDouble();
					}

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.CRTCEN = null;
					} else {
						this.CRTCEN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CRTDAT = null;
					} else {
						this.CRTDAT = dis.readDouble();
					}

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// Double

				if (this.CRTCEN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTCEN);
				}

				// Double

				if (this.CRTDAT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTDAT);
				}

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// Double

				if (this.CRTCEN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTCEN);
				}

				// Double

				if (this.CRTDAT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTDAT);
				}

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",TAGAMT=" + String.valueOf(TAGAMT));
			sb.append(",TAGFRM=" + TAGFRM);
			sb.append(",TAGAUM=" + TAGAUM);
			sb.append(",TASUOM=" + TASUOM);
			sb.append(",TAGSRV=" + TAGSRV);
			sb.append(",TASNUM=" + String.valueOf(TASNUM));
			sb.append(",TAGVIT=" + TAGVIT);
			sb.append(",TAGCTG=" + TAGCTG);
			sb.append(",SUBSKU=" + String.valueOf(SUBSKU));
			sb.append(",CMPSKU=" + String.valueOf(CMPSKU));
			sb.append(",UPSSKU=" + String.valueOf(UPSSKU));
			sb.append(",SAVSKU=" + String.valueOf(SAVSKU));
			sb.append(",IMGNM1=" + IMGNM1);
			sb.append(",IMGNM2=" + IMGNM2);
			sb.append(",IMGNM3=" + IMGNM3);
			sb.append(",IMGNM4=" + IMGNM4);
			sb.append(",IMGNM5=" + IMGNM5);
			sb.append(",TAGAUT=" + TAGAUT);
			sb.append(",TASHLF=" + TASHLF);
			sb.append(",TADYEX=" + String.valueOf(TADYEX));
			sb.append(",CRTCEN=" + String.valueOf(CRTCEN));
			sb.append(",CRTDAT=" + String.valueOf(CRTDAT));
			sb.append(",TAGCLR=" + TAGCLR);
			sb.append(",TAGSIZ=" + TAGSIZ);
			sb.append(",TAGFLV=" + TAGFLV);
			sb.append(",TAGSNT=" + TAGSNT);
			sb.append(",CSWGHT=" + String.valueOf(CSWGHT));
			sb.append(",CSLGTH=" + String.valueOf(CSLGTH));
			sb.append(",CSWDTH=" + String.valueOf(CSWDTH));
			sb.append(",CSHGHT=" + String.valueOf(CSHGHT));
			sb.append(",CSCUBE=" + String.valueOf(CSCUBE));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (TAGAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAMT);
			}

			sb.append("|");

			if (TAGFRM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFRM);
			}

			sb.append("|");

			if (TAGAUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUM);
			}

			sb.append("|");

			if (TASUOM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASUOM);
			}

			sb.append("|");

			if (TAGSRV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSRV);
			}

			sb.append("|");

			if (TASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASNUM);
			}

			sb.append("|");

			if (TAGVIT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGVIT);
			}

			sb.append("|");

			if (TAGCTG == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCTG);
			}

			sb.append("|");

			if (SUBSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SUBSKU);
			}

			sb.append("|");

			if (CMPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(CMPSKU);
			}

			sb.append("|");

			if (UPSSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(UPSSKU);
			}

			sb.append("|");

			if (SAVSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SAVSKU);
			}

			sb.append("|");

			if (IMGNM1 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM1);
			}

			sb.append("|");

			if (IMGNM2 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM2);
			}

			sb.append("|");

			if (IMGNM3 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM3);
			}

			sb.append("|");

			if (IMGNM4 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM4);
			}

			sb.append("|");

			if (IMGNM5 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM5);
			}

			sb.append("|");

			if (TAGAUT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUT);
			}

			sb.append("|");

			if (TASHLF == null) {
				sb.append("<null>");
			} else {
				sb.append(TASHLF);
			}

			sb.append("|");

			if (TADYEX == null) {
				sb.append("<null>");
			} else {
				sb.append(TADYEX);
			}

			sb.append("|");

			if (CRTCEN == null) {
				sb.append("<null>");
			} else {
				sb.append(CRTCEN);
			}

			sb.append("|");

			if (CRTDAT == null) {
				sb.append("<null>");
			} else {
				sb.append(CRTDAT);
			}

			sb.append("|");

			if (TAGCLR == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCLR);
			}

			sb.append("|");

			if (TAGSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSIZ);
			}

			sb.append("|");

			if (TAGFLV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFLV);
			}

			sb.append("|");

			if (TAGSNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSNT);
			}

			sb.append("|");

			if (CSWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWGHT);
			}

			sb.append("|");

			if (CSLGTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSLGTH);
			}

			sb.append("|");

			if (CSWDTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWDTH);
			}

			sb.append("|");

			if (CSHGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSHGHT);
			}

			sb.append("|");

			if (CSCUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(CSCUBE);
			}

			sb.append("|");

			if (LOAD_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_DATE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(INZTAGStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal INUMBR;

		public BigDecimal getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return true;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return null;
		}

		public Integer INUMBRPrecision() {
			return null;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public BigDecimal TAGAMT;

		public BigDecimal getTAGAMT() {
			return this.TAGAMT;
		}

		public Boolean TAGAMTIsNullable() {
			return true;
		}

		public Boolean TAGAMTIsKey() {
			return false;
		}

		public Integer TAGAMTLength() {
			return null;
		}

		public Integer TAGAMTPrecision() {
			return null;
		}

		public String TAGAMTDefault() {

			return "";

		}

		public String TAGAMTComment() {

			return "";

		}

		public String TAGAMTPattern() {

			return "";

		}

		public String TAGAMTOriginalDbColumnName() {

			return "TAGAMT";

		}

		public String TAGFRM;

		public String getTAGFRM() {
			return this.TAGFRM;
		}

		public Boolean TAGFRMIsNullable() {
			return true;
		}

		public Boolean TAGFRMIsKey() {
			return false;
		}

		public Integer TAGFRMLength() {
			return null;
		}

		public Integer TAGFRMPrecision() {
			return null;
		}

		public String TAGFRMDefault() {

			return null;

		}

		public String TAGFRMComment() {

			return "";

		}

		public String TAGFRMPattern() {

			return "";

		}

		public String TAGFRMOriginalDbColumnName() {

			return "TAGFRM";

		}

		public String TAGAUM;

		public String getTAGAUM() {
			return this.TAGAUM;
		}

		public Boolean TAGAUMIsNullable() {
			return true;
		}

		public Boolean TAGAUMIsKey() {
			return false;
		}

		public Integer TAGAUMLength() {
			return null;
		}

		public Integer TAGAUMPrecision() {
			return null;
		}

		public String TAGAUMDefault() {

			return null;

		}

		public String TAGAUMComment() {

			return "";

		}

		public String TAGAUMPattern() {

			return "";

		}

		public String TAGAUMOriginalDbColumnName() {

			return "TAGAUM";

		}

		public String TASUOM;

		public String getTASUOM() {
			return this.TASUOM;
		}

		public Boolean TASUOMIsNullable() {
			return true;
		}

		public Boolean TASUOMIsKey() {
			return false;
		}

		public Integer TASUOMLength() {
			return null;
		}

		public Integer TASUOMPrecision() {
			return null;
		}

		public String TASUOMDefault() {

			return null;

		}

		public String TASUOMComment() {

			return "";

		}

		public String TASUOMPattern() {

			return "";

		}

		public String TASUOMOriginalDbColumnName() {

			return "TASUOM";

		}

		public String TAGSRV;

		public String getTAGSRV() {
			return this.TAGSRV;
		}

		public Boolean TAGSRVIsNullable() {
			return true;
		}

		public Boolean TAGSRVIsKey() {
			return false;
		}

		public Integer TAGSRVLength() {
			return null;
		}

		public Integer TAGSRVPrecision() {
			return null;
		}

		public String TAGSRVDefault() {

			return null;

		}

		public String TAGSRVComment() {

			return "";

		}

		public String TAGSRVPattern() {

			return "";

		}

		public String TAGSRVOriginalDbColumnName() {

			return "TAGSRV";

		}

		public BigDecimal TASNUM;

		public BigDecimal getTASNUM() {
			return this.TASNUM;
		}

		public Boolean TASNUMIsNullable() {
			return true;
		}

		public Boolean TASNUMIsKey() {
			return false;
		}

		public Integer TASNUMLength() {
			return null;
		}

		public Integer TASNUMPrecision() {
			return null;
		}

		public String TASNUMDefault() {

			return "";

		}

		public String TASNUMComment() {

			return "";

		}

		public String TASNUMPattern() {

			return "";

		}

		public String TASNUMOriginalDbColumnName() {

			return "TASNUM";

		}

		public String TAGVIT;

		public String getTAGVIT() {
			return this.TAGVIT;
		}

		public Boolean TAGVITIsNullable() {
			return true;
		}

		public Boolean TAGVITIsKey() {
			return false;
		}

		public Integer TAGVITLength() {
			return null;
		}

		public Integer TAGVITPrecision() {
			return null;
		}

		public String TAGVITDefault() {

			return null;

		}

		public String TAGVITComment() {

			return "";

		}

		public String TAGVITPattern() {

			return "";

		}

		public String TAGVITOriginalDbColumnName() {

			return "TAGVIT";

		}

		public String TAGCTG;

		public String getTAGCTG() {
			return this.TAGCTG;
		}

		public Boolean TAGCTGIsNullable() {
			return true;
		}

		public Boolean TAGCTGIsKey() {
			return false;
		}

		public Integer TAGCTGLength() {
			return null;
		}

		public Integer TAGCTGPrecision() {
			return null;
		}

		public String TAGCTGDefault() {

			return null;

		}

		public String TAGCTGComment() {

			return "";

		}

		public String TAGCTGPattern() {

			return "";

		}

		public String TAGCTGOriginalDbColumnName() {

			return "TAGCTG";

		}

		public BigDecimal SUBSKU;

		public BigDecimal getSUBSKU() {
			return this.SUBSKU;
		}

		public Boolean SUBSKUIsNullable() {
			return true;
		}

		public Boolean SUBSKUIsKey() {
			return false;
		}

		public Integer SUBSKULength() {
			return null;
		}

		public Integer SUBSKUPrecision() {
			return null;
		}

		public String SUBSKUDefault() {

			return "";

		}

		public String SUBSKUComment() {

			return "";

		}

		public String SUBSKUPattern() {

			return "";

		}

		public String SUBSKUOriginalDbColumnName() {

			return "SUBSKU";

		}

		public BigDecimal CMPSKU;

		public BigDecimal getCMPSKU() {
			return this.CMPSKU;
		}

		public Boolean CMPSKUIsNullable() {
			return true;
		}

		public Boolean CMPSKUIsKey() {
			return false;
		}

		public Integer CMPSKULength() {
			return null;
		}

		public Integer CMPSKUPrecision() {
			return null;
		}

		public String CMPSKUDefault() {

			return "";

		}

		public String CMPSKUComment() {

			return "";

		}

		public String CMPSKUPattern() {

			return "";

		}

		public String CMPSKUOriginalDbColumnName() {

			return "CMPSKU";

		}

		public BigDecimal UPSSKU;

		public BigDecimal getUPSSKU() {
			return this.UPSSKU;
		}

		public Boolean UPSSKUIsNullable() {
			return true;
		}

		public Boolean UPSSKUIsKey() {
			return false;
		}

		public Integer UPSSKULength() {
			return null;
		}

		public Integer UPSSKUPrecision() {
			return null;
		}

		public String UPSSKUDefault() {

			return "";

		}

		public String UPSSKUComment() {

			return "";

		}

		public String UPSSKUPattern() {

			return "";

		}

		public String UPSSKUOriginalDbColumnName() {

			return "UPSSKU";

		}

		public BigDecimal SAVSKU;

		public BigDecimal getSAVSKU() {
			return this.SAVSKU;
		}

		public Boolean SAVSKUIsNullable() {
			return true;
		}

		public Boolean SAVSKUIsKey() {
			return false;
		}

		public Integer SAVSKULength() {
			return null;
		}

		public Integer SAVSKUPrecision() {
			return null;
		}

		public String SAVSKUDefault() {

			return "";

		}

		public String SAVSKUComment() {

			return "";

		}

		public String SAVSKUPattern() {

			return "";

		}

		public String SAVSKUOriginalDbColumnName() {

			return "SAVSKU";

		}

		public String IMGNM1;

		public String getIMGNM1() {
			return this.IMGNM1;
		}

		public Boolean IMGNM1IsNullable() {
			return true;
		}

		public Boolean IMGNM1IsKey() {
			return false;
		}

		public Integer IMGNM1Length() {
			return null;
		}

		public Integer IMGNM1Precision() {
			return null;
		}

		public String IMGNM1Default() {

			return "";

		}

		public String IMGNM1Comment() {

			return "";

		}

		public String IMGNM1Pattern() {

			return "";

		}

		public String IMGNM1OriginalDbColumnName() {

			return "IMGNM1";

		}

		public String IMGNM2;

		public String getIMGNM2() {
			return this.IMGNM2;
		}

		public Boolean IMGNM2IsNullable() {
			return true;
		}

		public Boolean IMGNM2IsKey() {
			return false;
		}

		public Integer IMGNM2Length() {
			return null;
		}

		public Integer IMGNM2Precision() {
			return null;
		}

		public String IMGNM2Default() {

			return "";

		}

		public String IMGNM2Comment() {

			return "";

		}

		public String IMGNM2Pattern() {

			return "";

		}

		public String IMGNM2OriginalDbColumnName() {

			return "IMGNM2";

		}

		public String IMGNM3;

		public String getIMGNM3() {
			return this.IMGNM3;
		}

		public Boolean IMGNM3IsNullable() {
			return true;
		}

		public Boolean IMGNM3IsKey() {
			return false;
		}

		public Integer IMGNM3Length() {
			return null;
		}

		public Integer IMGNM3Precision() {
			return null;
		}

		public String IMGNM3Default() {

			return "";

		}

		public String IMGNM3Comment() {

			return "";

		}

		public String IMGNM3Pattern() {

			return "";

		}

		public String IMGNM3OriginalDbColumnName() {

			return "IMGNM3";

		}

		public String IMGNM4;

		public String getIMGNM4() {
			return this.IMGNM4;
		}

		public Boolean IMGNM4IsNullable() {
			return true;
		}

		public Boolean IMGNM4IsKey() {
			return false;
		}

		public Integer IMGNM4Length() {
			return null;
		}

		public Integer IMGNM4Precision() {
			return null;
		}

		public String IMGNM4Default() {

			return "";

		}

		public String IMGNM4Comment() {

			return "";

		}

		public String IMGNM4Pattern() {

			return "";

		}

		public String IMGNM4OriginalDbColumnName() {

			return "IMGNM4";

		}

		public String IMGNM5;

		public String getIMGNM5() {
			return this.IMGNM5;
		}

		public Boolean IMGNM5IsNullable() {
			return true;
		}

		public Boolean IMGNM5IsKey() {
			return false;
		}

		public Integer IMGNM5Length() {
			return null;
		}

		public Integer IMGNM5Precision() {
			return null;
		}

		public String IMGNM5Default() {

			return "";

		}

		public String IMGNM5Comment() {

			return "";

		}

		public String IMGNM5Pattern() {

			return "";

		}

		public String IMGNM5OriginalDbColumnName() {

			return "IMGNM5";

		}

		public String TAGAUT;

		public String getTAGAUT() {
			return this.TAGAUT;
		}

		public Boolean TAGAUTIsNullable() {
			return true;
		}

		public Boolean TAGAUTIsKey() {
			return false;
		}

		public Integer TAGAUTLength() {
			return null;
		}

		public Integer TAGAUTPrecision() {
			return null;
		}

		public String TAGAUTDefault() {

			return "";

		}

		public String TAGAUTComment() {

			return "";

		}

		public String TAGAUTPattern() {

			return "";

		}

		public String TAGAUTOriginalDbColumnName() {

			return "TAGAUT";

		}

		public String TASHLF;

		public String getTASHLF() {
			return this.TASHLF;
		}

		public Boolean TASHLFIsNullable() {
			return true;
		}

		public Boolean TASHLFIsKey() {
			return false;
		}

		public Integer TASHLFLength() {
			return null;
		}

		public Integer TASHLFPrecision() {
			return null;
		}

		public String TASHLFDefault() {

			return "";

		}

		public String TASHLFComment() {

			return "";

		}

		public String TASHLFPattern() {

			return "";

		}

		public String TASHLFOriginalDbColumnName() {

			return "TASHLF";

		}

		public BigDecimal TADYEX;

		public BigDecimal getTADYEX() {
			return this.TADYEX;
		}

		public Boolean TADYEXIsNullable() {
			return true;
		}

		public Boolean TADYEXIsKey() {
			return false;
		}

		public Integer TADYEXLength() {
			return null;
		}

		public Integer TADYEXPrecision() {
			return null;
		}

		public String TADYEXDefault() {

			return "";

		}

		public String TADYEXComment() {

			return "";

		}

		public String TADYEXPattern() {

			return "";

		}

		public String TADYEXOriginalDbColumnName() {

			return "TADYEX";

		}

		public Double CRTCEN;

		public Double getCRTCEN() {
			return this.CRTCEN;
		}

		public Boolean CRTCENIsNullable() {
			return true;
		}

		public Boolean CRTCENIsKey() {
			return false;
		}

		public Integer CRTCENLength() {
			return null;
		}

		public Integer CRTCENPrecision() {
			return null;
		}

		public String CRTCENDefault() {

			return "";

		}

		public String CRTCENComment() {

			return "";

		}

		public String CRTCENPattern() {

			return "";

		}

		public String CRTCENOriginalDbColumnName() {

			return "CRTCEN";

		}

		public Double CRTDAT;

		public Double getCRTDAT() {
			return this.CRTDAT;
		}

		public Boolean CRTDATIsNullable() {
			return true;
		}

		public Boolean CRTDATIsKey() {
			return false;
		}

		public Integer CRTDATLength() {
			return null;
		}

		public Integer CRTDATPrecision() {
			return null;
		}

		public String CRTDATDefault() {

			return "";

		}

		public String CRTDATComment() {

			return "";

		}

		public String CRTDATPattern() {

			return "";

		}

		public String CRTDATOriginalDbColumnName() {

			return "CRTDAT";

		}

		public String TAGCLR;

		public String getTAGCLR() {
			return this.TAGCLR;
		}

		public Boolean TAGCLRIsNullable() {
			return true;
		}

		public Boolean TAGCLRIsKey() {
			return false;
		}

		public Integer TAGCLRLength() {
			return null;
		}

		public Integer TAGCLRPrecision() {
			return null;
		}

		public String TAGCLRDefault() {

			return "";

		}

		public String TAGCLRComment() {

			return "";

		}

		public String TAGCLRPattern() {

			return "";

		}

		public String TAGCLROriginalDbColumnName() {

			return "TAGCLR";

		}

		public String TAGSIZ;

		public String getTAGSIZ() {
			return this.TAGSIZ;
		}

		public Boolean TAGSIZIsNullable() {
			return true;
		}

		public Boolean TAGSIZIsKey() {
			return false;
		}

		public Integer TAGSIZLength() {
			return null;
		}

		public Integer TAGSIZPrecision() {
			return null;
		}

		public String TAGSIZDefault() {

			return "";

		}

		public String TAGSIZComment() {

			return "";

		}

		public String TAGSIZPattern() {

			return "";

		}

		public String TAGSIZOriginalDbColumnName() {

			return "TAGSIZ";

		}

		public String TAGFLV;

		public String getTAGFLV() {
			return this.TAGFLV;
		}

		public Boolean TAGFLVIsNullable() {
			return true;
		}

		public Boolean TAGFLVIsKey() {
			return false;
		}

		public Integer TAGFLVLength() {
			return null;
		}

		public Integer TAGFLVPrecision() {
			return null;
		}

		public String TAGFLVDefault() {

			return "";

		}

		public String TAGFLVComment() {

			return "";

		}

		public String TAGFLVPattern() {

			return "";

		}

		public String TAGFLVOriginalDbColumnName() {

			return "TAGFLV";

		}

		public String TAGSNT;

		public String getTAGSNT() {
			return this.TAGSNT;
		}

		public Boolean TAGSNTIsNullable() {
			return true;
		}

		public Boolean TAGSNTIsKey() {
			return false;
		}

		public Integer TAGSNTLength() {
			return null;
		}

		public Integer TAGSNTPrecision() {
			return null;
		}

		public String TAGSNTDefault() {

			return "";

		}

		public String TAGSNTComment() {

			return "";

		}

		public String TAGSNTPattern() {

			return "";

		}

		public String TAGSNTOriginalDbColumnName() {

			return "TAGSNT";

		}

		public BigDecimal CSWGHT;

		public BigDecimal getCSWGHT() {
			return this.CSWGHT;
		}

		public Boolean CSWGHTIsNullable() {
			return true;
		}

		public Boolean CSWGHTIsKey() {
			return false;
		}

		public Integer CSWGHTLength() {
			return null;
		}

		public Integer CSWGHTPrecision() {
			return null;
		}

		public String CSWGHTDefault() {

			return "";

		}

		public String CSWGHTComment() {

			return "";

		}

		public String CSWGHTPattern() {

			return "";

		}

		public String CSWGHTOriginalDbColumnName() {

			return "CSWGHT";

		}

		public BigDecimal CSLGTH;

		public BigDecimal getCSLGTH() {
			return this.CSLGTH;
		}

		public Boolean CSLGTHIsNullable() {
			return true;
		}

		public Boolean CSLGTHIsKey() {
			return false;
		}

		public Integer CSLGTHLength() {
			return null;
		}

		public Integer CSLGTHPrecision() {
			return null;
		}

		public String CSLGTHDefault() {

			return "";

		}

		public String CSLGTHComment() {

			return "";

		}

		public String CSLGTHPattern() {

			return "";

		}

		public String CSLGTHOriginalDbColumnName() {

			return "CSLGTH";

		}

		public BigDecimal CSWDTH;

		public BigDecimal getCSWDTH() {
			return this.CSWDTH;
		}

		public Boolean CSWDTHIsNullable() {
			return true;
		}

		public Boolean CSWDTHIsKey() {
			return false;
		}

		public Integer CSWDTHLength() {
			return null;
		}

		public Integer CSWDTHPrecision() {
			return null;
		}

		public String CSWDTHDefault() {

			return "";

		}

		public String CSWDTHComment() {

			return "";

		}

		public String CSWDTHPattern() {

			return "";

		}

		public String CSWDTHOriginalDbColumnName() {

			return "CSWDTH";

		}

		public BigDecimal CSHGHT;

		public BigDecimal getCSHGHT() {
			return this.CSHGHT;
		}

		public Boolean CSHGHTIsNullable() {
			return true;
		}

		public Boolean CSHGHTIsKey() {
			return false;
		}

		public Integer CSHGHTLength() {
			return null;
		}

		public Integer CSHGHTPrecision() {
			return null;
		}

		public String CSHGHTDefault() {

			return "";

		}

		public String CSHGHTComment() {

			return "";

		}

		public String CSHGHTPattern() {

			return "";

		}

		public String CSHGHTOriginalDbColumnName() {

			return "CSHGHT";

		}

		public BigDecimal CSCUBE;

		public BigDecimal getCSCUBE() {
			return this.CSCUBE;
		}

		public Boolean CSCUBEIsNullable() {
			return true;
		}

		public Boolean CSCUBEIsKey() {
			return false;
		}

		public Integer CSCUBELength() {
			return null;
		}

		public Integer CSCUBEPrecision() {
			return null;
		}

		public String CSCUBEDefault() {

			return "";

		}

		public String CSCUBEComment() {

			return "";

		}

		public String CSCUBEPattern() {

			return "";

		}

		public String CSCUBEOriginalDbColumnName() {

			return "CSCUBE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.CRTCEN = null;
					} else {
						this.CRTCEN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CRTDAT = null;
					} else {
						this.CRTDAT = dis.readDouble();
					}

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.TAGAMT = (BigDecimal) dis.readObject();

					this.TAGFRM = readString(dis);

					this.TAGAUM = readString(dis);

					this.TASUOM = readString(dis);

					this.TAGSRV = readString(dis);

					this.TASNUM = (BigDecimal) dis.readObject();

					this.TAGVIT = readString(dis);

					this.TAGCTG = readString(dis);

					this.SUBSKU = (BigDecimal) dis.readObject();

					this.CMPSKU = (BigDecimal) dis.readObject();

					this.UPSSKU = (BigDecimal) dis.readObject();

					this.SAVSKU = (BigDecimal) dis.readObject();

					this.IMGNM1 = readString(dis);

					this.IMGNM2 = readString(dis);

					this.IMGNM3 = readString(dis);

					this.IMGNM4 = readString(dis);

					this.IMGNM5 = readString(dis);

					this.TAGAUT = readString(dis);

					this.TASHLF = readString(dis);

					this.TADYEX = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.CRTCEN = null;
					} else {
						this.CRTCEN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.CRTDAT = null;
					} else {
						this.CRTDAT = dis.readDouble();
					}

					this.TAGCLR = readString(dis);

					this.TAGSIZ = readString(dis);

					this.TAGFLV = readString(dis);

					this.TAGSNT = readString(dis);

					this.CSWGHT = (BigDecimal) dis.readObject();

					this.CSLGTH = (BigDecimal) dis.readObject();

					this.CSWDTH = (BigDecimal) dis.readObject();

					this.CSHGHT = (BigDecimal) dis.readObject();

					this.CSCUBE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// Double

				if (this.CRTCEN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTCEN);
				}

				// Double

				if (this.CRTDAT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTDAT);
				}

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.TAGAMT);

				// String

				writeString(this.TAGFRM, dos);

				// String

				writeString(this.TAGAUM, dos);

				// String

				writeString(this.TASUOM, dos);

				// String

				writeString(this.TAGSRV, dos);

				// BigDecimal

				dos.writeObject(this.TASNUM);

				// String

				writeString(this.TAGVIT, dos);

				// String

				writeString(this.TAGCTG, dos);

				// BigDecimal

				dos.writeObject(this.SUBSKU);

				// BigDecimal

				dos.writeObject(this.CMPSKU);

				// BigDecimal

				dos.writeObject(this.UPSSKU);

				// BigDecimal

				dos.writeObject(this.SAVSKU);

				// String

				writeString(this.IMGNM1, dos);

				// String

				writeString(this.IMGNM2, dos);

				// String

				writeString(this.IMGNM3, dos);

				// String

				writeString(this.IMGNM4, dos);

				// String

				writeString(this.IMGNM5, dos);

				// String

				writeString(this.TAGAUT, dos);

				// String

				writeString(this.TASHLF, dos);

				// BigDecimal

				dos.writeObject(this.TADYEX);

				// Double

				if (this.CRTCEN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTCEN);
				}

				// Double

				if (this.CRTDAT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.CRTDAT);
				}

				// String

				writeString(this.TAGCLR, dos);

				// String

				writeString(this.TAGSIZ, dos);

				// String

				writeString(this.TAGFLV, dos);

				// String

				writeString(this.TAGSNT, dos);

				// BigDecimal

				dos.writeObject(this.CSWGHT);

				// BigDecimal

				dos.writeObject(this.CSLGTH);

				// BigDecimal

				dos.writeObject(this.CSWDTH);

				// BigDecimal

				dos.writeObject(this.CSHGHT);

				// BigDecimal

				dos.writeObject(this.CSCUBE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",TAGAMT=" + String.valueOf(TAGAMT));
			sb.append(",TAGFRM=" + TAGFRM);
			sb.append(",TAGAUM=" + TAGAUM);
			sb.append(",TASUOM=" + TASUOM);
			sb.append(",TAGSRV=" + TAGSRV);
			sb.append(",TASNUM=" + String.valueOf(TASNUM));
			sb.append(",TAGVIT=" + TAGVIT);
			sb.append(",TAGCTG=" + TAGCTG);
			sb.append(",SUBSKU=" + String.valueOf(SUBSKU));
			sb.append(",CMPSKU=" + String.valueOf(CMPSKU));
			sb.append(",UPSSKU=" + String.valueOf(UPSSKU));
			sb.append(",SAVSKU=" + String.valueOf(SAVSKU));
			sb.append(",IMGNM1=" + IMGNM1);
			sb.append(",IMGNM2=" + IMGNM2);
			sb.append(",IMGNM3=" + IMGNM3);
			sb.append(",IMGNM4=" + IMGNM4);
			sb.append(",IMGNM5=" + IMGNM5);
			sb.append(",TAGAUT=" + TAGAUT);
			sb.append(",TASHLF=" + TASHLF);
			sb.append(",TADYEX=" + String.valueOf(TADYEX));
			sb.append(",CRTCEN=" + String.valueOf(CRTCEN));
			sb.append(",CRTDAT=" + String.valueOf(CRTDAT));
			sb.append(",TAGCLR=" + TAGCLR);
			sb.append(",TAGSIZ=" + TAGSIZ);
			sb.append(",TAGFLV=" + TAGFLV);
			sb.append(",TAGSNT=" + TAGSNT);
			sb.append(",CSWGHT=" + String.valueOf(CSWGHT));
			sb.append(",CSLGTH=" + String.valueOf(CSLGTH));
			sb.append(",CSWDTH=" + String.valueOf(CSWDTH));
			sb.append(",CSHGHT=" + String.valueOf(CSHGHT));
			sb.append(",CSCUBE=" + String.valueOf(CSCUBE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (TAGAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAMT);
			}

			sb.append("|");

			if (TAGFRM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFRM);
			}

			sb.append("|");

			if (TAGAUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUM);
			}

			sb.append("|");

			if (TASUOM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASUOM);
			}

			sb.append("|");

			if (TAGSRV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSRV);
			}

			sb.append("|");

			if (TASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(TASNUM);
			}

			sb.append("|");

			if (TAGVIT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGVIT);
			}

			sb.append("|");

			if (TAGCTG == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCTG);
			}

			sb.append("|");

			if (SUBSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SUBSKU);
			}

			sb.append("|");

			if (CMPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(CMPSKU);
			}

			sb.append("|");

			if (UPSSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(UPSSKU);
			}

			sb.append("|");

			if (SAVSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(SAVSKU);
			}

			sb.append("|");

			if (IMGNM1 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM1);
			}

			sb.append("|");

			if (IMGNM2 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM2);
			}

			sb.append("|");

			if (IMGNM3 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM3);
			}

			sb.append("|");

			if (IMGNM4 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM4);
			}

			sb.append("|");

			if (IMGNM5 == null) {
				sb.append("<null>");
			} else {
				sb.append(IMGNM5);
			}

			sb.append("|");

			if (TAGAUT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGAUT);
			}

			sb.append("|");

			if (TASHLF == null) {
				sb.append("<null>");
			} else {
				sb.append(TASHLF);
			}

			sb.append("|");

			if (TADYEX == null) {
				sb.append("<null>");
			} else {
				sb.append(TADYEX);
			}

			sb.append("|");

			if (CRTCEN == null) {
				sb.append("<null>");
			} else {
				sb.append(CRTCEN);
			}

			sb.append("|");

			if (CRTDAT == null) {
				sb.append("<null>");
			} else {
				sb.append(CRTDAT);
			}

			sb.append("|");

			if (TAGCLR == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGCLR);
			}

			sb.append("|");

			if (TAGSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSIZ);
			}

			sb.append("|");

			if (TAGFLV == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGFLV);
			}

			sb.append("|");

			if (TAGSNT == null) {
				sb.append("<null>");
			} else {
				sb.append(TAGSNT);
			}

			sb.append("|");

			if (CSWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWGHT);
			}

			sb.append("|");

			if (CSLGTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSLGTH);
			}

			sb.append("|");

			if (CSWDTH == null) {
				sb.append("<null>");
			} else {
				sb.append(CSWDTH);
			}

			sb.append("|");

			if (CSHGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(CSHGHT);
			}

			sb.append("|");

			if (CSCUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(CSCUBE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row12Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputDelimited_10Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_10_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_10");
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

				row12Struct row12 = new row12Struct();
				INZTAGStruct INZTAG = new INZTAGStruct();

				/**
				 * [tDBOutput_16 begin ] start
				 */

				ok_Hash.put("tDBOutput_16", false);
				start_Hash.put("tDBOutput_16", System.currentTimeMillis());

				currentComponent = "tDBOutput_16";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "INZTAG");

				int tos_count_tDBOutput_16 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_16", "tDBOutput_16", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_16 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_16 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_16 = (String) (restRequest_tDBOutput_16 != null
						? restRequest_tDBOutput_16.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_16 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_16 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_16 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_16 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_16
						.createRuntimeProperties();
				props_tDBOutput_16.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_16.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_16.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_16.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_16.setValue("useSchemaDatePattern", false);

				props_tDBOutput_16.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_16_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_16_1_fisrt sst_tDBOutput_16_1_fisrt = new SchemaSettingTool_tDBOutput_16_1_fisrt();

				props_tDBOutput_16.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_16_1_fisrt.getSchemaValue()));

				props_tDBOutput_16.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_16.connection.setValue("useCustomRegion", false);

				props_tDBOutput_16.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_16.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_16.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_16.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_16.table.setValue("tableName", "ITEM_MASTER_TAG_ALONG_FILE_INZTAG");

				props_tDBOutput_16.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_16.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_16.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_16.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_16.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_16.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_16_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"ITEM_MASTER_TAG_ALONG_FILE_INZTAG\",\"fields\":[{", s);

						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGAMT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TAGAMT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGFRM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":35,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGFRM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGAUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGAUM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TASUOM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TASUOM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGSRV\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":35,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGSRV\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TASNUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TASNUM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGVIT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGVIT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGCTG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGCTG\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"SUBSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"SUBSKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CMPSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"CMPSKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"UPSSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"UPSSKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"SAVSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"SAVSKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IMGNM1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMGNM1\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IMGNM2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMGNM2\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IMGNM3\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMGNM3\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IMGNM4\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMGNM4\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IMGNM5\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMGNM5\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGAUT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":50,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGAUT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TASHLF\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TASHLF\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TADYEX\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TADYEX\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CRTCEN\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"CRTCEN\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CRTDAT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"CRTDAT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGCLR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":30,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGCLR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGSIZ\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGSIZ\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGFLV\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":40,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGFLV\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TAGSNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":30,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TAGSNT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CSWGHT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"CSWGHT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CSLGTH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"CSLGTH\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CSWDTH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"CSWDTH\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CSHGHT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"CSHGHT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CSCUBE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"CSCUBE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_16_2_fisrt sst_tDBOutput_16_2_fisrt = new SchemaSettingTool_tDBOutput_16_2_fisrt();

				props_tDBOutput_16.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_16_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_16.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_16 = props_tDBOutput_16.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_16 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_16 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_16 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_16.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_16);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_16.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_16 = props_tDBOutput_16.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_16 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_16 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_16 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_16.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_16);
					}
				}
				globalMap.put("tDBOutput_16_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_16);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_16 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_16_MAPPINGS_URL", mappings_url_tDBOutput_16);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_16 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_16";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_16 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_16 = null;
				topology_tDBOutput_16 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_16 = def_tDBOutput_16.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_16,
						topology_tDBOutput_16);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_16 = def_tDBOutput_16
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_16 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_16.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_16 = componentRuntime_tDBOutput_16
						.initialize(container_tDBOutput_16, props_tDBOutput_16);

				if (initVr_tDBOutput_16.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_16.getMessage());
				}

				if (componentRuntime_tDBOutput_16 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_16 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_16;
					compDriverInitialization_tDBOutput_16.runAtDriver(container_tDBOutput_16);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_16 = null;
				if (componentRuntime_tDBOutput_16 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_16 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_16;
					if (doesNodeBelongToRequest_tDBOutput_16) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_16 = sourceOrSink_tDBOutput_16
								.validate(container_tDBOutput_16);
						if (vr_tDBOutput_16.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_16.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_16 = null;
				if (sourceOrSink_tDBOutput_16 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_16 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_16;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_16 = sink_tDBOutput_16
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_16) {
						writeOperation_tDBOutput_16.initialize(container_tDBOutput_16);
					}
					writer_tDBOutput_16 = writeOperation_tDBOutput_16.createWriter(container_tDBOutput_16);
					if (doesNodeBelongToRequest_tDBOutput_16) {
						writer_tDBOutput_16.open("tDBOutput_16");
					}

					resourceMap.put("writer_tDBOutput_16", writer_tDBOutput_16);
				} // end of "sourceOrSink_tDBOutput_16 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_16 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_16
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_16 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_16 = props_tDBOutput_16.getSchema(c_tDBOutput_16, false);
				incomingEnforcer_tDBOutput_16 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_16);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_16 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_16 = null;

				/**
				 * [tDBOutput_16 begin ] stop
				 */

				/**
				 * [tMap_9 begin ] start
				 */

				ok_Hash.put("tMap_9", false);
				start_Hash.put("tMap_9", System.currentTimeMillis());

				currentComponent = "tMap_9";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row12");

				int tos_count_tMap_9 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_9 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_9 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_9 = new StringBuilder();
							log4jParamters_tMap_9.append("Parameters:");
							log4jParamters_tMap_9.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_9.append(" | ");
							log4jParamters_tMap_9.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_9.append(" | ");
							log4jParamters_tMap_9.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_9.append(" | ");
							log4jParamters_tMap_9.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_9.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_9 - " + (log4jParamters_tMap_9));
						}
					}
					new BytesLimit65535_tMap_9().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_9", "tMap_9", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row12_tMap_9 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_9__Struct {
					java.util.Date var1;
				}
				Var__tMap_9__Struct Var__tMap_9 = new Var__tMap_9__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_INZTAG_tMap_9 = 0;

				INZTAGStruct INZTAG_tmp = new INZTAGStruct();
// ###############################

				/**
				 * [tMap_9 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_10 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_10", false);
				start_Hash.put("tFileInputDelimited_10", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_10";

				int tos_count_tFileInputDelimited_10 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_10 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_10 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_10 = new StringBuilder();
							log4jParamters_tFileInputDelimited_10.append("Parameters:");
							log4jParamters_tFileInputDelimited_10
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/INZTAG.zip\"");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("FIELDSEPARATOR" + " = " + "\"|\"");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TAGAMT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGFRM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGAUM") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TASUOM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TAGSRV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TASNUM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGVIT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGCTG") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("SUBSKU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CMPSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("UPSSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("SAVSKU")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("IMGNM1") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("IMGNM2") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IMGNM3") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("IMGNM4") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("IMGNM5")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGAUT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TASHLF") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TADYEX") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CRTCEN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CRTDAT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TAGCLR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TAGSIZ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TAGFLV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TAGSNT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CSWGHT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CSLGTH") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CSWDTH") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CSHGHT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CSCUBE") + "}]");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							log4jParamters_tFileInputDelimited_10.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_10.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_10 - " + (log4jParamters_tFileInputDelimited_10));
						}
					}
					new BytesLimit65535_tFileInputDelimited_10().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_10", "tFileInputDelimited_10", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_10 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_10 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_10 = null;
				int limit_tFileInputDelimited_10 = -1;
				try {

					Object filename_tFileInputDelimited_10 = "/data/talend/data_repository/INZTAG.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_10 = null;
					try {
						if (filename_tFileInputDelimited_10 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_10 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_10));
						} else {
							zis_tFileInputDelimited_10 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_10))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE", e.getMessage());

						throw e;

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_10 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_10 = zis_tFileInputDelimited_10.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE", e.getMessage());

							throw e;

						}
						if (entry_tFileInputDelimited_10 == null) {
							break;
						}
						if (entry_tFileInputDelimited_10.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_10 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_10, "ISO-8859-15", "|", "\n", false, 1, 0,

									limit_tFileInputDelimited_10, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_10 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_10 != null && fid_tFileInputDelimited_10.nextRecord()) {
							rowstate_tFileInputDelimited_10.reset();

							row12 = null;

							boolean whetherReject_tFileInputDelimited_10 = false;
							row12 = new row12Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_10 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_10 = 0;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.INUMBR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"INUMBR", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.INUMBR = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 1;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.TAGAMT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TAGAMT", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.TAGAMT = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 2;

								row12.TAGFRM = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 3;

								row12.TAGAUM = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 4;

								row12.TASUOM = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 5;

								row12.TAGSRV = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 6;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.TASNUM = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TASNUM", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.TASNUM = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 7;

								row12.TAGVIT = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 8;

								row12.TAGCTG = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 9;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.SUBSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"SUBSKU", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.SUBSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 10;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CMPSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CMPSKU", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CMPSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 11;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.UPSSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"UPSSKU", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.UPSSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 12;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.SAVSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"SAVSKU", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.SAVSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 13;

								row12.IMGNM1 = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 14;

								row12.IMGNM2 = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 15;

								row12.IMGNM3 = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 16;

								row12.IMGNM4 = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 17;

								row12.IMGNM5 = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 18;

								row12.TAGAUT = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 19;

								row12.TASHLF = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 20;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.TADYEX = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TADYEX", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.TADYEX = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 21;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CRTCEN = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CRTCEN", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CRTCEN = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 22;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CRTDAT = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CRTDAT", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CRTDAT = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 23;

								row12.TAGCLR = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 24;

								row12.TAGSIZ = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 25;

								row12.TAGFLV = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 26;

								row12.TAGSNT = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);

								columnIndexWithD_tFileInputDelimited_10 = 27;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CSWGHT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CSWGHT", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CSWGHT = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 28;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CSLGTH = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CSLGTH", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CSLGTH = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 29;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CSWDTH = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CSWDTH", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CSWDTH = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 30;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CSHGHT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CSHGHT", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CSHGHT = null;

								}

								columnIndexWithD_tFileInputDelimited_10 = 31;

								temp = fid_tFileInputDelimited_10.get(columnIndexWithD_tFileInputDelimited_10);
								if (temp.length() > 0) {

									try {

										row12.CSCUBE = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_10) {
										globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE",
												ex_tFileInputDelimited_10.getMessage());
										rowstate_tFileInputDelimited_10.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CSCUBE", "row12", temp, ex_tFileInputDelimited_10),
												ex_tFileInputDelimited_10));
									}

								} else {

									row12.CSCUBE = null;

								}

								if (rowstate_tFileInputDelimited_10.getException() != null) {
									throw rowstate_tFileInputDelimited_10.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_10_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_10 = true;

								throw (e);

							}

							log.debug("tFileInputDelimited_10 - Retrieving the record "
									+ fid_tFileInputDelimited_10.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_10 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_10 main ] start
							 */

							currentComponent = "tFileInputDelimited_10";

							tos_count_tFileInputDelimited_10++;

							/**
							 * [tFileInputDelimited_10 main ] stop
							 */

							/**
							 * [tFileInputDelimited_10 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_10";

							/**
							 * [tFileInputDelimited_10 process_data_begin ] stop
							 */
// Start of branch "row12"
							if (row12 != null) {

								/**
								 * [tMap_9 main ] start
								 */

								currentComponent = "tMap_9";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row12", "tFileInputDelimited_10", "tFileInputDelimited_10",
										"tFileInputDelimited", "tMap_9", "tMap_9", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row12 - " + (row12 == null ? "" : row12.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_9 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_9 = false;
								boolean mainRowRejected_tMap_9 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_9__Struct Var = Var__tMap_9;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									INZTAG = null;

// # Output table : 'INZTAG'
									count_INZTAG_tMap_9++;

									INZTAG_tmp.INUMBR = row12.INUMBR;
									INZTAG_tmp.TAGAMT = row12.TAGAMT;
									INZTAG_tmp.TAGFRM = row12.TAGFRM;
									INZTAG_tmp.TAGAUM = row12.TAGAUM;
									INZTAG_tmp.TASUOM = row12.TASUOM;
									INZTAG_tmp.TAGSRV = row12.TAGSRV;
									INZTAG_tmp.TASNUM = row12.TASNUM;
									INZTAG_tmp.TAGVIT = row12.TAGVIT;
									INZTAG_tmp.TAGCTG = row12.TAGCTG;
									INZTAG_tmp.SUBSKU = row12.SUBSKU;
									INZTAG_tmp.CMPSKU = row12.CMPSKU;
									INZTAG_tmp.UPSSKU = row12.UPSSKU;
									INZTAG_tmp.SAVSKU = row12.SAVSKU;
									INZTAG_tmp.IMGNM1 = row12.IMGNM1;
									INZTAG_tmp.IMGNM2 = row12.IMGNM2;
									INZTAG_tmp.IMGNM3 = row12.IMGNM3;
									INZTAG_tmp.IMGNM4 = row12.IMGNM4;
									INZTAG_tmp.IMGNM5 = row12.IMGNM5;
									INZTAG_tmp.TAGAUT = row12.TAGAUT;
									INZTAG_tmp.TASHLF = row12.TASHLF;
									INZTAG_tmp.TADYEX = row12.TADYEX;
									INZTAG_tmp.CRTCEN = row12.CRTCEN;
									INZTAG_tmp.CRTDAT = row12.CRTDAT;
									INZTAG_tmp.TAGCLR = row12.TAGCLR;
									INZTAG_tmp.TAGSIZ = row12.TAGSIZ;
									INZTAG_tmp.TAGFLV = row12.TAGFLV;
									INZTAG_tmp.TAGSNT = row12.TAGSNT;
									INZTAG_tmp.CSWGHT = row12.CSWGHT;
									INZTAG_tmp.CSLGTH = row12.CSLGTH;
									INZTAG_tmp.CSWDTH = row12.CSWDTH;
									INZTAG_tmp.CSHGHT = row12.CSHGHT;
									INZTAG_tmp.CSCUBE = row12.CSCUBE;
									INZTAG_tmp.LOAD_DATE = Var.var1;
									INZTAG = INZTAG_tmp;
									log.debug("tMap_9 - Outputting the record " + count_INZTAG_tMap_9
											+ " of the output table 'INZTAG'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_9 = false;

								tos_count_tMap_9++;

								/**
								 * [tMap_9 main ] stop
								 */

								/**
								 * [tMap_9 process_data_begin ] start
								 */

								currentComponent = "tMap_9";

								/**
								 * [tMap_9 process_data_begin ] stop
								 */
// Start of branch "INZTAG"
								if (INZTAG != null) {

									/**
									 * [tDBOutput_16 main ] start
									 */

									currentComponent = "tDBOutput_16";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "INZTAG", "tMap_9", "tMap_9", "tMap", "tDBOutput_16", "tDBOutput_16",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("INZTAG - " + (INZTAG == null ? "" : INZTAG.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_16 != null) {
										incomingEnforcer_tDBOutput_16.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("INUMBR") != null) {
										incomingEnforcer_tDBOutput_16.put("INUMBR", INZTAG.INUMBR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGAMT") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGAMT", INZTAG.TAGAMT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGFRM") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGFRM", INZTAG.TAGFRM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGAUM") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGAUM", INZTAG.TAGAUM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TASUOM") != null) {
										incomingEnforcer_tDBOutput_16.put("TASUOM", INZTAG.TASUOM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGSRV") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGSRV", INZTAG.TAGSRV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TASNUM") != null) {
										incomingEnforcer_tDBOutput_16.put("TASNUM", INZTAG.TASNUM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGVIT") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGVIT", INZTAG.TAGVIT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGCTG") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGCTG", INZTAG.TAGCTG);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("SUBSKU") != null) {
										incomingEnforcer_tDBOutput_16.put("SUBSKU", INZTAG.SUBSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CMPSKU") != null) {
										incomingEnforcer_tDBOutput_16.put("CMPSKU", INZTAG.CMPSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("UPSSKU") != null) {
										incomingEnforcer_tDBOutput_16.put("UPSSKU", INZTAG.UPSSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("SAVSKU") != null) {
										incomingEnforcer_tDBOutput_16.put("SAVSKU", INZTAG.SAVSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("IMGNM1") != null) {
										incomingEnforcer_tDBOutput_16.put("IMGNM1", INZTAG.IMGNM1);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("IMGNM2") != null) {
										incomingEnforcer_tDBOutput_16.put("IMGNM2", INZTAG.IMGNM2);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("IMGNM3") != null) {
										incomingEnforcer_tDBOutput_16.put("IMGNM3", INZTAG.IMGNM3);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("IMGNM4") != null) {
										incomingEnforcer_tDBOutput_16.put("IMGNM4", INZTAG.IMGNM4);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("IMGNM5") != null) {
										incomingEnforcer_tDBOutput_16.put("IMGNM5", INZTAG.IMGNM5);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGAUT") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGAUT", INZTAG.TAGAUT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TASHLF") != null) {
										incomingEnforcer_tDBOutput_16.put("TASHLF", INZTAG.TASHLF);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TADYEX") != null) {
										incomingEnforcer_tDBOutput_16.put("TADYEX", INZTAG.TADYEX);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CRTCEN") != null) {
										incomingEnforcer_tDBOutput_16.put("CRTCEN", INZTAG.CRTCEN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CRTDAT") != null) {
										incomingEnforcer_tDBOutput_16.put("CRTDAT", INZTAG.CRTDAT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGCLR") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGCLR", INZTAG.TAGCLR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGSIZ") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGSIZ", INZTAG.TAGSIZ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGFLV") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGFLV", INZTAG.TAGFLV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("TAGSNT") != null) {
										incomingEnforcer_tDBOutput_16.put("TAGSNT", INZTAG.TAGSNT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CSWGHT") != null) {
										incomingEnforcer_tDBOutput_16.put("CSWGHT", INZTAG.CSWGHT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CSLGTH") != null) {
										incomingEnforcer_tDBOutput_16.put("CSLGTH", INZTAG.CSLGTH);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CSWDTH") != null) {
										incomingEnforcer_tDBOutput_16.put("CSWDTH", INZTAG.CSWDTH);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CSHGHT") != null) {
										incomingEnforcer_tDBOutput_16.put("CSHGHT", INZTAG.CSHGHT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("CSCUBE") != null) {
										incomingEnforcer_tDBOutput_16.put("CSCUBE", INZTAG.CSCUBE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_16 != null && incomingEnforcer_tDBOutput_16
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_16.put("LOAD_DATE", INZTAG.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_16 = null;
									if (incomingEnforcer_tDBOutput_16 != null) {
										data_tDBOutput_16 = incomingEnforcer_tDBOutput_16.getCurrentRecord();
									}

									if (writer_tDBOutput_16 != null && data_tDBOutput_16 != null) {
										writer_tDBOutput_16.write(data_tDBOutput_16);
									}

									nb_line_tDBOutput_16++;

									tos_count_tDBOutput_16++;

									/**
									 * [tDBOutput_16 main ] stop
									 */

									/**
									 * [tDBOutput_16 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_16";

									/**
									 * [tDBOutput_16 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_16 process_data_end ] start
									 */

									currentComponent = "tDBOutput_16";

									/**
									 * [tDBOutput_16 process_data_end ] stop
									 */

								} // End of branch "INZTAG"

								/**
								 * [tMap_9 process_data_end ] start
								 */

								currentComponent = "tMap_9";

								/**
								 * [tMap_9 process_data_end ] stop
								 */

							} // End of branch "row12"

							/**
							 * [tFileInputDelimited_10 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_10";

							/**
							 * [tFileInputDelimited_10 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_10 end ] start
							 */

							currentComponent = "tFileInputDelimited_10";

						}
						nb_line_tFileInputDelimited_10 += fid_tFileInputDelimited_10.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/INZTAG.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_10 != null) {
							fid_tFileInputDelimited_10.close();
						}
					}
					if (fid_tFileInputDelimited_10 != null) {
						globalMap.put("tFileInputDelimited_10_NB_LINE", nb_line_tFileInputDelimited_10);
					}

					log.info(
							"tFileInputDelimited_10- Retrieved records count: " + nb_line_tFileInputDelimited_10 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_10 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_10", true);
				end_Hash.put("tFileInputDelimited_10", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_10 end ] stop
				 */

				/**
				 * [tMap_9 end ] start
				 */

				currentComponent = "tMap_9";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_9 - Written records count in the table 'INZTAG': " + count_INZTAG_tMap_9 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row12", 2, 0,
						"tFileInputDelimited_10", "tFileInputDelimited_10", "tFileInputDelimited", "tMap_9", "tMap_9",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_9 - " + ("Done."));

				ok_Hash.put("tMap_9", true);
				end_Hash.put("tMap_9", System.currentTimeMillis());

				/**
				 * [tMap_9 end ] stop
				 */

				/**
				 * [tDBOutput_16 end ] start
				 */

				currentComponent = "tDBOutput_16";

// end of generic

				resourceMap.put("finish_tDBOutput_16", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_16 = null;
				if (writer_tDBOutput_16 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_16 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_16
							.close();
					resultMap_tDBOutput_16 = writer_tDBOutput_16.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_16), container_tDBOutput_16);
				}
				if (resultMap_tDBOutput_16 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_16 : resultMap_tDBOutput_16.entrySet()) {
						switch (entry_tDBOutput_16.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_16.setComponentData("tDBOutput_16", "ERROR_MESSAGE",
									entry_tDBOutput_16.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_16.setComponentData("tDBOutput_16", "NB_LINE",
									entry_tDBOutput_16.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_16.setComponentData("tDBOutput_16", "NB_SUCCESS",
									entry_tDBOutput_16.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_16.setComponentData("tDBOutput_16", "NB_REJECT",
									entry_tDBOutput_16.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_16 = new StringBuilder();
							for (int i_tDBOutput_16 = 0; i_tDBOutput_16 < entry_tDBOutput_16.getKey()
									.length(); i_tDBOutput_16++) {
								char ch_tDBOutput_16 = entry_tDBOutput_16.getKey().charAt(i_tDBOutput_16);
								if (Character.isUpperCase(ch_tDBOutput_16) && i_tDBOutput_16 > 0) {
									studio_key_tDBOutput_16.append('_');
								}
								studio_key_tDBOutput_16.append(ch_tDBOutput_16);
							}
							container_tDBOutput_16.setComponentData("tDBOutput_16",
									studio_key_tDBOutput_16.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_16.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "INZTAG", 2, 0, "tMap_9",
						"tMap_9", "tMap", "tDBOutput_16", "tDBOutput_16", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_16", true);
				end_Hash.put("tDBOutput_16", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tFileDelete_1Process(globalMap);

				/**
				 * [tDBOutput_16 end ] stop
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
				 * [tFileInputDelimited_10 finally ] start
				 */

				currentComponent = "tFileInputDelimited_10";

				/**
				 * [tFileInputDelimited_10 finally ] stop
				 */

				/**
				 * [tMap_9 finally ] start
				 */

				currentComponent = "tMap_9";

				/**
				 * [tMap_9 finally ] stop
				 */

				/**
				 * [tDBOutput_16 finally ] start
				 */

				currentComponent = "tDBOutput_16";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_16") == null) {
					if (resourceMap.get("writer_tDBOutput_16") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap
									.get("writer_tDBOutput_16")).close();
						} catch (java.io.IOException e_tDBOutput_16) {
							String errorMessage_tDBOutput_16 = "failed to release the resource in tDBOutput_16 :"
									+ e_tDBOutput_16.getMessage();
							System.err.println(errorMessage_tDBOutput_16);
						}
					}
				}

				/**
				 * [tDBOutput_16 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_10_SUBPROCESS_STATE", 1);
	}

	public void tFileDelete_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileDelete_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_1");
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
				 * [tFileDelete_1 begin ] start
				 */

				ok_Hash.put("tFileDelete_1", false);
				start_Hash.put("tFileDelete_1", System.currentTimeMillis());

				currentComponent = "tFileDelete_1";

				int tos_count_tFileDelete_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileDelete_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileDelete_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileDelete_1 = new StringBuilder();
							log4jParamters_tFileDelete_1.append("Parameters:");
							log4jParamters_tFileDelete_1
									.append("PATH" + " = " + "\"/data/talend/data_repository/INZTAG.zip\"");
							log4jParamters_tFileDelete_1.append(" | ");
							log4jParamters_tFileDelete_1.append("FAILON" + " = " + "true");
							log4jParamters_tFileDelete_1.append(" | ");
							log4jParamters_tFileDelete_1.append("FOLDER_FILE" + " = " + "true");
							log4jParamters_tFileDelete_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileDelete_1 - " + (log4jParamters_tFileDelete_1));
						}
					}
					new BytesLimit65535_tFileDelete_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileDelete_1", "tFileDelete_1", "tFileDelete");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tFileDelete_1 begin ] stop
				 */

				/**
				 * [tFileDelete_1 main ] start
				 */

				currentComponent = "tFileDelete_1";

				final StringBuffer log4jSb_tFileDelete_1 = new StringBuffer();

				class DeleteFoldertFileDelete_1 {
					/**
					 * delete all the sub-files in 'file'
					 * 
					 * @param file
					 */
					public boolean delete(java.io.File file) {
						java.io.File[] files = file.listFiles();
						for (int i = 0; i < files.length; i++) {
							if (files[i].isFile()) {
								files[i].delete();
							} else if (files[i].isDirectory()) {
								if (!files[i].delete()) {
									delete(files[i]);
								}
							}
						}
						deleteDirectory(file);
						return file.delete();
					}

					/**
					 * delete all the sub-folders in 'file'
					 * 
					 * @param file
					 */
					private void deleteDirectory(java.io.File file) {
						java.io.File[] filed = file.listFiles();
						for (int i = 0; i < filed.length; i++) {
							if (filed[i].isDirectory()) {
								deleteDirectory(filed[i]);
							}
							filed[i].delete();
						}
					}

				}
				java.io.File path_tFileDelete_1 = new java.io.File("/data/talend/data_repository/INZTAG.zip");
				if (path_tFileDelete_1.exists()) {
					if (path_tFileDelete_1.isFile()) {
						if (path_tFileDelete_1.delete()) {
							globalMap.put("tFileDelete_1_CURRENT_STATUS", "File deleted.");
							log.info("tFileDelete_1 - File : " + path_tFileDelete_1.getAbsolutePath() + " is deleted.");
						} else {
							globalMap.put("tFileDelete_1_CURRENT_STATUS", "No file deleted.");
							throw new RuntimeException(
									"The file " + path_tFileDelete_1.getAbsolutePath() + " can't be deleted.");
						}
					} else if (path_tFileDelete_1.isDirectory()) {
						DeleteFoldertFileDelete_1 dftFileDelete_1 = new DeleteFoldertFileDelete_1();
						if (dftFileDelete_1.delete(path_tFileDelete_1)) {
							globalMap.put("tFileDelete_1_CURRENT_STATUS", "Path deleted.");
							log.info("tFileDelete_1 - Directory : " + path_tFileDelete_1.getAbsolutePath()
									+ " is deleted.");
						} else {
							globalMap.put("tFileDelete_1_CURRENT_STATUS", "No path deleted.");
							throw new RuntimeException(
									"The directory " + path_tFileDelete_1.getAbsolutePath() + " can not be deleted.");
						}
					}
				} else {
					globalMap.put("tFileDelete_1_CURRENT_STATUS", "File or path does not exist or is invalid.");
					throw new RuntimeException("File or path does not exist or is invalid.");
				}
				globalMap.put("tFileDelete_1_DELETE_PATH", "/data/talend/data_repository/INZTAG.zip");

				tos_count_tFileDelete_1++;

				/**
				 * [tFileDelete_1 main ] stop
				 */

				/**
				 * [tFileDelete_1 process_data_begin ] start
				 */

				currentComponent = "tFileDelete_1";

				/**
				 * [tFileDelete_1 process_data_begin ] stop
				 */

				/**
				 * [tFileDelete_1 process_data_end ] start
				 */

				currentComponent = "tFileDelete_1";

				/**
				 * [tFileDelete_1 process_data_end ] stop
				 */

				/**
				 * [tFileDelete_1 end ] start
				 */

				currentComponent = "tFileDelete_1";

				if (log.isDebugEnabled())
					log.debug("tFileDelete_1 - " + ("Done."));

				ok_Hash.put("tFileDelete_1", true);
				end_Hash.put("tFileDelete_1", System.currentTimeMillis());

				/**
				 * [tFileDelete_1 end ] stop
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
				 * [tFileDelete_1 finally ] start
				 */

				currentComponent = "tFileDelete_1";

				/**
				 * [tFileDelete_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileDelete_1_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_1");
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
				 * [tDBRow_1 begin ] start
				 */

				ok_Hash.put("tDBRow_1", false);
				start_Hash.put("tDBRow_1", System.currentTimeMillis());

				currentComponent = "tDBRow_1";

				int tos_count_tDBRow_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_1", "tDBRow_1", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_1 = (String) (restRequest_tDBRow_1 != null
						? restRequest_tDBRow_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_1 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_1 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_1 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_1
						.createRuntimeProperties();
				props_tDBRow_1.setValue("query",
						"\nDELETE from ITEM_ATTRIBUTES_MSTFLD\nWHERE LOAD_DATE = CURRENT_DATE()\n\n");

				props_tDBRow_1.setValue("dieOnError", true);

				props_tDBRow_1.setValue("usePreparedStatement", false);

				props_tDBRow_1.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_1_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_1_1_fisrt sst_tDBRow_1_1_fisrt = new SchemaSettingTool_tDBRow_1_1_fisrt();

				props_tDBRow_1.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_1_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_1_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_1_2_fisrt sst_tDBRow_1_2_fisrt = new SchemaSettingTool_tDBRow_1_2_fisrt();

				props_tDBRow_1.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_1_2_fisrt.getSchemaValue()));

				props_tDBRow_1.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_1.connection.setValue("useCustomRegion", false);

				props_tDBRow_1.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_1.table.setValue("tableName", "");

				props_tDBRow_1.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_1.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_1.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_1_3_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_1_3_fisrt sst_tDBRow_1_3_fisrt = new SchemaSettingTool_tDBRow_1_3_fisrt();

				props_tDBRow_1.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_1_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_1.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_1 = props_tDBRow_1.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_1.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_1);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_1.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_1 = props_tDBRow_1.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_1.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_1);
					}
				}
				globalMap.put("tDBRow_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_1 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_1_MAPPINGS_URL", mappings_url_tDBRow_1);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_1 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_1";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_1 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_1 = null;
				topology_tDBRow_1 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_1 = def_tDBRow_1.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_1,
						topology_tDBRow_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_1 = def_tDBRow_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_1 = componentRuntime_tDBRow_1
						.initialize(container_tDBRow_1, props_tDBRow_1);

				if (initVr_tDBRow_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_1.getMessage());
				}

				if (componentRuntime_tDBRow_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_1;
					compDriverInitialization_tDBRow_1.runAtDriver(container_tDBRow_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_1 = null;
				if (componentRuntime_tDBRow_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_1;
					if (doesNodeBelongToRequest_tDBRow_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_1 = sourceOrSink_tDBRow_1
								.validate(container_tDBRow_1);
						if (vr_tDBRow_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_1.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_1 begin ] stop
				 */

				/**
				 * [tDBRow_1 main ] start
				 */

				currentComponent = "tDBRow_1";

				tos_count_tDBRow_1++;

				/**
				 * [tDBRow_1 main ] stop
				 */

				/**
				 * [tDBRow_1 process_data_begin ] start
				 */

				currentComponent = "tDBRow_1";

				/**
				 * [tDBRow_1 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_1 process_data_end ] start
				 */

				currentComponent = "tDBRow_1";

				/**
				 * [tDBRow_1 process_data_end ] stop
				 */

				/**
				 * [tDBRow_1 end ] start
				 */

				currentComponent = "tDBRow_1";

// end of generic

				resourceMap.put("finish_tDBRow_1", Boolean.TRUE);

				ok_Hash.put("tDBRow_1", true);
				end_Hash.put("tDBRow_1", System.currentTimeMillis());

				/**
				 * [tDBRow_1 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
			}

			tDBInput_1Process(globalMap);

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
				 * [tDBRow_1 finally ] start
				 */

				currentComponent = "tDBRow_1";

// finally of generic

				if (resourceMap.get("finish_tDBRow_1") == null) {
				}

				/**
				 * [tDBRow_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_1_SUBPROCESS_STATE", 1);
	}

	public static class row34Struct implements routines.system.IPersistableRow<row34Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return true;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return 6;
		}

		public Integer ITANAMPrecision() {
			return 0;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return true;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return 6;
		}

		public Integer ITAVALPrecision() {
			return 0;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		public String ITADSC;

		public String getITADSC() {
			return this.ITADSC;
		}

		public Boolean ITADSCIsNullable() {
			return true;
		}

		public Boolean ITADSCIsKey() {
			return false;
		}

		public Integer ITADSCLength() {
			return 35;
		}

		public Integer ITADSCPrecision() {
			return 0;
		}

		public String ITADSCDefault() {

			return null;

		}

		public String ITADSCComment() {

			return "";

		}

		public String ITADSCPattern() {

			return "";

		}

		public String ITADSCOriginalDbColumnName() {

			return "ITADSC";

		}

		public String ITADEF;

		public String getITADEF() {
			return this.ITADEF;
		}

		public Boolean ITADEFIsNullable() {
			return true;
		}

		public Boolean ITADEFIsKey() {
			return false;
		}

		public Integer ITADEFLength() {
			return 1;
		}

		public Integer ITADEFPrecision() {
			return 0;
		}

		public String ITADEFDefault() {

			return null;

		}

		public String ITADEFComment() {

			return "";

		}

		public String ITADEFPattern() {

			return "";

		}

		public String ITADEFOriginalDbColumnName() {

			return "ITADEF";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append(",ITADSC=" + ITADSC);
			sb.append(",ITADEF=" + ITADEF);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			if (ITADSC == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADSC);
			}

			sb.append("|");

			if (ITADEF == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADEF);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row34Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_1");
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

				row34Struct row34 = new row34Struct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row34");

				int tos_count_tFileOutputDelimited_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_1.append("Parameters:");
							log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/MSTFLD.csv\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_1 - " + (log4jParamters_tFileOutputDelimited_1));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_1 = "";
				fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/MSTFLD.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_1 = null;
				String extension_tFileOutputDelimited_1 = null;
				String directory_tFileOutputDelimited_1 = null;
				if ((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
						extension_tFileOutputDelimited_1 = "";
					} else {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
								fileName_tFileOutputDelimited_1.lastIndexOf("."));
						extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
							fileName_tFileOutputDelimited_1.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0,
								fileName_tFileOutputDelimited_1.lastIndexOf("."));
						extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1
								.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
						extension_tFileOutputDelimited_1 = "";
					}
					directory_tFileOutputDelimited_1 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_1 = true;
				java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME", fileName_tFileOutputDelimited_1);
				int nb_line_tFileOutputDelimited_1 = 0;
				int splitedFileNo_tFileOutputDelimited_1 = 0;
				int currentRow_tFileOutputDelimited_1 = 0;

				final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /**
																		 * Start field
																		 * tFileOutputDelimited_1:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
					if (!dir_tFileOutputDelimited_1.exists()) {
						log.info("tFileOutputDelimited_1 - Creating directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_1.mkdirs();
						log.info("tFileOutputDelimited_1 - The directory '"
								+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
				String zipName_tFileOutputDelimited_1 = fullName_tFileOutputDelimited_1 + ".zip";
				java.io.File file_tFileOutputDelimited_1 = new java.io.File(zipName_tFileOutputDelimited_1);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_1 = null;
				java.io.Writer outtFileOutputDelimited_1 = null;

				if (file_tFileOutputDelimited_1.exists()) {
					file_tFileOutputDelimited_1.delete();
				}
				zipOut_tFileOutputDelimited_1 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_1)));
				zipOut_tFileOutputDelimited_1
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_1.getName()));
				outtFileOutputDelimited_1 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_1, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_1.length() == 0) {
						outtFileOutputDelimited_1.write("ITANAM");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("ITAVAL");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("ITADSC");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("ITADEF");
						outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

				/**
				 * [tFileOutputDelimited_1 begin ] stop
				 */

				/**
				 * [tDBInput_1 begin ] start
				 */

				ok_Hash.put("tDBInput_1", false);
				start_Hash.put("tDBInput_1", System.currentTimeMillis());

				currentComponent = "tDBInput_1";

				int tos_count_tDBInput_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_1 = new StringBuilder();
							log4jParamters_tDBInput_1.append("Parameters:");
							log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.MSTFLD\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ITANAM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ITAVAL") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITADSC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITADEF") + "}]");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_1 - " + (log4jParamters_tDBInput_1));
						}
					}
					new BytesLimit65535_tDBInput_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_1 = 0;
				java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = context.jda_user_name;

				final String decryptedPassword_tDBInput_1 = context.jda_password;

				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;

				String url_tDBInput_1 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_1 - Driver ClassName: " + driverClass_tDBInput_1 + ".");

				log.debug("tDBInput_1 - Connection attempt to '" + url_tDBInput_1 + "' with the username '"
						+ dbUser_tDBInput_1 + "'.");

				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1, dbUser_tDBInput_1,
						dbPwd_tDBInput_1);
				log.debug("tDBInput_1 - Connection to '" + url_tDBInput_1 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "select * from MM4R5LIB.MSTFLD";

				log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");

				globalMap.put("tDBInput_1_QUERY", dbquery_tDBInput_1);
				java.sql.ResultSet rs_tDBInput_1 = null;

				try {
					rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
					java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
					int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

					String tmpContent_tDBInput_1 = null;

					log.debug("tDBInput_1 - Retrieving records from the database.");

					while (rs_tDBInput_1.next()) {
						nb_line_tDBInput_1++;

						if (colQtyInRs_tDBInput_1 < 1) {
							row34.ITANAM = null;
						} else {

							row34.ITANAM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row34.ITAVAL = null;
						} else {

							row34.ITAVAL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row34.ITADSC = null;
						} else {

							row34.ITADSC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row34.ITADEF = null;
						} else {

							row34.ITADEF = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}

						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");

						/**
						 * [tDBInput_1 begin ] stop
						 */

						/**
						 * [tDBInput_1 main ] start
						 */

						currentComponent = "tDBInput_1";

						tos_count_tDBInput_1++;

						/**
						 * [tDBInput_1 main ] stop
						 */

						/**
						 * [tDBInput_1 process_data_begin ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 main ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row34", "tDBInput_1", "tDBInput_1", "tAS400Input", "tFileOutputDelimited_1",
								"tFileOutputDelimited_1", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row34 - " + (row34 == null ? "" : row34.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row34.ITANAM != null) {
							sb_tFileOutputDelimited_1.append(row34.ITANAM);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row34.ITAVAL != null) {
							sb_tFileOutputDelimited_1.append(row34.ITAVAL);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row34.ITADSC != null) {
							sb_tFileOutputDelimited_1.append(row34.ITADSC);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row34.ITADEF != null) {
							sb_tFileOutputDelimited_1.append(row34.ITADEF);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_1++;
							resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

							outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
							log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1
									+ ".");

						}

						tos_count_tFileOutputDelimited_1++;

						/**
						 * [tFileOutputDelimited_1 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						/**
						 * [tFileOutputDelimited_1 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_1 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_1";

						/**
						 * [tFileOutputDelimited_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 process_data_end ] start
						 */

						currentComponent = "tDBInput_1";

						/**
						 * [tDBInput_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 end ] start
						 */

						currentComponent = "tDBInput_1";

					}
				} finally {
					if (rs_tDBInput_1 != null) {
						rs_tDBInput_1.close();
					}
					if (stmt_tDBInput_1 != null) {
						stmt_tDBInput_1.close();
					}
					if (conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {

						log.debug("tDBInput_1 - Closing the connection to the database.");

						conn_tDBInput_1.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_1 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_1_NB_LINE", nb_line_tDBInput_1);
				log.debug("tDBInput_1 - Retrieved records count: " + nb_line_tDBInput_1 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_1 - " + ("Done."));

				ok_Hash.put("tDBInput_1", true);
				end_Hash.put("tDBInput_1", System.currentTimeMillis());

				/**
				 * [tDBInput_1 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_1 end ] start
				 */

				currentComponent = "tFileOutputDelimited_1";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_1 != null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}

					globalMap.put("tFileOutputDelimited_1_NB_LINE", nb_line_tFileOutputDelimited_1);
					globalMap.put("tFileOutputDelimited_1_FILE_NAME", fileName_tFileOutputDelimited_1);

				}

				resourceMap.put("finish_tFileOutputDelimited_1", true);

				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row34", 2, 0,
						"tDBInput_1", "tDBInput_1", "tAS400Input", "tFileOutputDelimited_1", "tFileOutputDelimited_1",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_1 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_1", true);
				end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_1 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
			}

			tFileInputDelimited_1Process(globalMap);

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
				 * [tDBInput_1 finally ] start
				 */

				currentComponent = "tDBInput_1";

				/**
				 * [tDBInput_1 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_1 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_1";

				if (resourceMap.get("finish_tFileOutputDelimited_1") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_1");
						if (outtFileOutputDelimited_1 != null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}

	public static class MSTFLDStruct implements routines.system.IPersistableRow<MSTFLDStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return true;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return null;
		}

		public Integer ITANAMPrecision() {
			return null;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return true;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return null;
		}

		public Integer ITAVALPrecision() {
			return null;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		public String ITADSC;

		public String getITADSC() {
			return this.ITADSC;
		}

		public Boolean ITADSCIsNullable() {
			return true;
		}

		public Boolean ITADSCIsKey() {
			return false;
		}

		public Integer ITADSCLength() {
			return null;
		}

		public Integer ITADSCPrecision() {
			return null;
		}

		public String ITADSCDefault() {

			return null;

		}

		public String ITADSCComment() {

			return "";

		}

		public String ITADSCPattern() {

			return "";

		}

		public String ITADSCOriginalDbColumnName() {

			return "ITADSC";

		}

		public String ITADEF;

		public String getITADEF() {
			return this.ITADEF;
		}

		public Boolean ITADEFIsNullable() {
			return true;
		}

		public Boolean ITADEFIsKey() {
			return false;
		}

		public Integer ITADEFLength() {
			return null;
		}

		public Integer ITADEFPrecision() {
			return null;
		}

		public String ITADEFDefault() {

			return null;

		}

		public String ITADEFComment() {

			return "";

		}

		public String ITADEFPattern() {

			return "";

		}

		public String ITADEFOriginalDbColumnName() {

			return "ITADEF";

		}

		public java.util.Date LOAD_DATE;

		public java.util.Date getLOAD_DATE() {
			return this.LOAD_DATE;
		}

		public Boolean LOAD_DATEIsNullable() {
			return true;
		}

		public Boolean LOAD_DATEIsKey() {
			return false;
		}

		public Integer LOAD_DATELength() {
			return null;
		}

		public Integer LOAD_DATEPrecision() {
			return null;
		}

		public String LOAD_DATEDefault() {

			return null;

		}

		public String LOAD_DATEComment() {

			return "";

		}

		public String LOAD_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String LOAD_DATEOriginalDbColumnName() {

			return "LOAD_DATE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append(",ITADSC=" + ITADSC);
			sb.append(",ITADEF=" + ITADEF);
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			if (ITADSC == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADSC);
			}

			sb.append("|");

			if (ITADEF == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADEF);
			}

			sb.append("|");

			if (LOAD_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_DATE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(MSTFLDStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row14Struct implements routines.system.IPersistableRow<row14Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return true;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return null;
		}

		public Integer ITANAMPrecision() {
			return null;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return true;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return null;
		}

		public Integer ITAVALPrecision() {
			return null;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		public String ITADSC;

		public String getITADSC() {
			return this.ITADSC;
		}

		public Boolean ITADSCIsNullable() {
			return true;
		}

		public Boolean ITADSCIsKey() {
			return false;
		}

		public Integer ITADSCLength() {
			return null;
		}

		public Integer ITADSCPrecision() {
			return null;
		}

		public String ITADSCDefault() {

			return null;

		}

		public String ITADSCComment() {

			return "";

		}

		public String ITADSCPattern() {

			return "";

		}

		public String ITADSCOriginalDbColumnName() {

			return "ITADSC";

		}

		public String ITADEF;

		public String getITADEF() {
			return this.ITADEF;
		}

		public Boolean ITADEFIsNullable() {
			return true;
		}

		public Boolean ITADEFIsKey() {
			return false;
		}

		public Integer ITADEFLength() {
			return null;
		}

		public Integer ITADEFPrecision() {
			return null;
		}

		public String ITADEFDefault() {

			return null;

		}

		public String ITADEFComment() {

			return "";

		}

		public String ITADEFPattern() {

			return "";

		}

		public String ITADEFOriginalDbColumnName() {

			return "ITADEF";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.ITADSC = readString(dis);

					this.ITADEF = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// String

				writeString(this.ITADSC, dos);

				// String

				writeString(this.ITADEF, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append(",ITADSC=" + ITADSC);
			sb.append(",ITADEF=" + ITADEF);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			if (ITADSC == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADSC);
			}

			sb.append("|");

			if (ITADEF == null) {
				sb.append("<null>");
			} else {
				sb.append(ITADEF);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row14Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_1");
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

				row14Struct row14 = new row14Struct();
				MSTFLDStruct MSTFLD = new MSTFLDStruct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "MSTFLD");

				int tos_count_tDBOutput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_1 = (String) (restRequest_tDBOutput_1 != null
						? restRequest_tDBOutput_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_1 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_1 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_1 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_1
						.createRuntimeProperties();
				props_tDBOutput_1.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_1.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_1.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_1.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_1.setValue("useSchemaDatePattern", false);

				props_tDBOutput_1.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_1_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_1_1_fisrt sst_tDBOutput_1_1_fisrt = new SchemaSettingTool_tDBOutput_1_1_fisrt();

				props_tDBOutput_1.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_1_fisrt.getSchemaValue()));

				props_tDBOutput_1.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_1.connection.setValue("useCustomRegion", false);

				props_tDBOutput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_1.table.setValue("tableName", "ITEM_ATTRIBUTES_MSTFLD");

				props_tDBOutput_1.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_1.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_1_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"ITEM_ATTRIBUTES_MSTFLD\",\"fields\":[{", s);

						a("\"name\":\"ITANAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITANAM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ITAVAL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITAVAL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ITADSC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":35,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITADSC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ITADEF\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITADEF\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_1_2_fisrt sst_tDBOutput_1_2_fisrt = new SchemaSettingTool_tDBOutput_1_2_fisrt();

				props_tDBOutput_1.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_1.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_1);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_1.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_1);
					}
				}
				globalMap.put("tDBOutput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_1 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_1_MAPPINGS_URL", mappings_url_tDBOutput_1);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_1 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_1";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_1 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_1 = null;
				topology_tDBOutput_1 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_1 = def_tDBOutput_1.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_1,
						topology_tDBOutput_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_1 = def_tDBOutput_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_1 = componentRuntime_tDBOutput_1
						.initialize(container_tDBOutput_1, props_tDBOutput_1);

				if (initVr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_1.getMessage());
				}

				if (componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_1;
					compDriverInitialization_tDBOutput_1.runAtDriver(container_tDBOutput_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_1 = null;
				if (componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_1;
					if (doesNodeBelongToRequest_tDBOutput_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_1 = sourceOrSink_tDBOutput_1
								.validate(container_tDBOutput_1);
						if (vr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_1.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_1 = null;
				if (sourceOrSink_tDBOutput_1 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_1 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_1;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_1 = sink_tDBOutput_1
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_1) {
						writeOperation_tDBOutput_1.initialize(container_tDBOutput_1);
					}
					writer_tDBOutput_1 = writeOperation_tDBOutput_1.createWriter(container_tDBOutput_1);
					if (doesNodeBelongToRequest_tDBOutput_1) {
						writer_tDBOutput_1.open("tDBOutput_1");
					}

					resourceMap.put("writer_tDBOutput_1", writer_tDBOutput_1);
				} // end of "sourceOrSink_tDBOutput_1 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_1 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_1
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_1 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_1 = props_tDBOutput_1.getSchema(c_tDBOutput_1, false);
				incomingEnforcer_tDBOutput_1 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_1);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_1 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_1 = null;

				/**
				 * [tDBOutput_1 begin ] stop
				 */

				/**
				 * [tMap_1 begin ] start
				 */

				ok_Hash.put("tMap_1", false);
				start_Hash.put("tMap_1", System.currentTimeMillis());

				currentComponent = "tMap_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row14");

				int tos_count_tMap_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_1 = new StringBuilder();
							log4jParamters_tMap_1.append("Parameters:");
							log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_1.append(" | ");
							log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_1 - " + (log4jParamters_tMap_1));
						}
					}
					new BytesLimit65535_tMap_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row14_tMap_1 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_1__Struct {
					java.util.Date var1;
				}
				Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_MSTFLD_tMap_1 = 0;

				MSTFLDStruct MSTFLD_tmp = new MSTFLDStruct();
// ###############################

				/**
				 * [tMap_1 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_1", false);
				start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_1";

				int tos_count_tFileInputDelimited_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
							log4jParamters_tFileInputDelimited_1.append("Parameters:");
							log4jParamters_tFileInputDelimited_1
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/MSTFLD.zip\"");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ITANAM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ITAVAL") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITADSC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITADEF") + "}]");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_1 - " + (log4jParamters_tFileInputDelimited_1));
						}
					}
					new BytesLimit65535_tFileInputDelimited_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_1", "tFileInputDelimited_1", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try {

					Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/MSTFLD.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_1 = null;
					try {
						if (filename_tFileInputDelimited_1 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_1));
						} else {
							zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_1))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());

						throw e;

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_1 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_1 = zis_tFileInputDelimited_1.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());

							throw e;

						}
						if (entry_tFileInputDelimited_1 == null) {
							break;
						}
						if (entry_tFileInputDelimited_1.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_1, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_1, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_1 != null && fid_tFileInputDelimited_1.nextRecord()) {
							rowstate_tFileInputDelimited_1.reset();

							row14 = null;

							boolean whetherReject_tFileInputDelimited_1 = false;
							row14 = new row14Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_1 = 0;

								columnIndexWithD_tFileInputDelimited_1 = 0;

								row14.ITANAM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 1;

								row14.ITAVAL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 2;

								row14.ITADSC = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 3;

								row14.ITADEF = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								if (rowstate_tFileInputDelimited_1.getException() != null) {
									throw rowstate_tFileInputDelimited_1.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_1 = true;

								throw (e);

							}

							log.debug("tFileInputDelimited_1 - Retrieving the record "
									+ fid_tFileInputDelimited_1.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_1 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_1 main ] start
							 */

							currentComponent = "tFileInputDelimited_1";

							tos_count_tFileInputDelimited_1++;

							/**
							 * [tFileInputDelimited_1 main ] stop
							 */

							/**
							 * [tFileInputDelimited_1 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_1";

							/**
							 * [tFileInputDelimited_1 process_data_begin ] stop
							 */
// Start of branch "row14"
							if (row14 != null) {

								/**
								 * [tMap_1 main ] start
								 */

								currentComponent = "tMap_1";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row14", "tFileInputDelimited_1", "tFileInputDelimited_1",
										"tFileInputDelimited", "tMap_1", "tMap_1", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row14 - " + (row14 == null ? "" : row14.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_1 = false;
								boolean mainRowRejected_tMap_1 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_1__Struct Var = Var__tMap_1;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									MSTFLD = null;

// # Output table : 'MSTFLD'
									count_MSTFLD_tMap_1++;

									MSTFLD_tmp.ITANAM = row14.ITANAM;
									MSTFLD_tmp.ITAVAL = row14.ITAVAL;
									MSTFLD_tmp.ITADSC = row14.ITADSC;
									MSTFLD_tmp.ITADEF = row14.ITADEF;
									MSTFLD_tmp.LOAD_DATE = Var.var1;
									MSTFLD = MSTFLD_tmp;
									log.debug("tMap_1 - Outputting the record " + count_MSTFLD_tMap_1
											+ " of the output table 'MSTFLD'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_1 = false;

								tos_count_tMap_1++;

								/**
								 * [tMap_1 main ] stop
								 */

								/**
								 * [tMap_1 process_data_begin ] start
								 */

								currentComponent = "tMap_1";

								/**
								 * [tMap_1 process_data_begin ] stop
								 */
// Start of branch "MSTFLD"
								if (MSTFLD != null) {

									/**
									 * [tDBOutput_1 main ] start
									 */

									currentComponent = "tDBOutput_1";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "MSTFLD", "tMap_1", "tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("MSTFLD - " + (MSTFLD == null ? "" : MSTFLD.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_1 != null) {
										incomingEnforcer_tDBOutput_1.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("ITANAM") != null) {
										incomingEnforcer_tDBOutput_1.put("ITANAM", MSTFLD.ITANAM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("ITAVAL") != null) {
										incomingEnforcer_tDBOutput_1.put("ITAVAL", MSTFLD.ITAVAL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("ITADSC") != null) {
										incomingEnforcer_tDBOutput_1.put("ITADSC", MSTFLD.ITADSC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("ITADEF") != null) {
										incomingEnforcer_tDBOutput_1.put("ITADEF", MSTFLD.ITADEF);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_1.put("LOAD_DATE", MSTFLD.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_1 = null;
									if (incomingEnforcer_tDBOutput_1 != null) {
										data_tDBOutput_1 = incomingEnforcer_tDBOutput_1.getCurrentRecord();
									}

									if (writer_tDBOutput_1 != null && data_tDBOutput_1 != null) {
										writer_tDBOutput_1.write(data_tDBOutput_1);
									}

									nb_line_tDBOutput_1++;

									tos_count_tDBOutput_1++;

									/**
									 * [tDBOutput_1 main ] stop
									 */

									/**
									 * [tDBOutput_1 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_1";

									/**
									 * [tDBOutput_1 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_1 process_data_end ] start
									 */

									currentComponent = "tDBOutput_1";

									/**
									 * [tDBOutput_1 process_data_end ] stop
									 */

								} // End of branch "MSTFLD"

								/**
								 * [tMap_1 process_data_end ] start
								 */

								currentComponent = "tMap_1";

								/**
								 * [tMap_1 process_data_end ] stop
								 */

							} // End of branch "row14"

							/**
							 * [tFileInputDelimited_1 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_1";

							/**
							 * [tFileInputDelimited_1 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_1 end ] start
							 */

							currentComponent = "tFileInputDelimited_1";

						}
						nb_line_tFileInputDelimited_1 += fid_tFileInputDelimited_1.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/MSTFLD.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_1 != null) {
							fid_tFileInputDelimited_1.close();
						}
					}
					if (fid_tFileInputDelimited_1 != null) {
						globalMap.put("tFileInputDelimited_1_NB_LINE", nb_line_tFileInputDelimited_1);
					}

					log.info("tFileInputDelimited_1- Retrieved records count: " + nb_line_tFileInputDelimited_1 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_1 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_1", true);
				end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_1 end ] stop
				 */

				/**
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'MSTFLD': " + count_MSTFLD_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row14", 2, 0,
						"tFileInputDelimited_1", "tFileInputDelimited_1", "tFileInputDelimited", "tMap_1", "tMap_1",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_1 - " + ("Done."));

				ok_Hash.put("tMap_1", true);
				end_Hash.put("tMap_1", System.currentTimeMillis());

				/**
				 * [tMap_1 end ] stop
				 */

				/**
				 * [tDBOutput_1 end ] start
				 */

				currentComponent = "tDBOutput_1";

// end of generic

				resourceMap.put("finish_tDBOutput_1", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_1 = null;
				if (writer_tDBOutput_1 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_1 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_1
							.close();
					resultMap_tDBOutput_1 = writer_tDBOutput_1.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_1), container_tDBOutput_1);
				}
				if (resultMap_tDBOutput_1 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_1 : resultMap_tDBOutput_1.entrySet()) {
						switch (entry_tDBOutput_1.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_1.setComponentData("tDBOutput_1", "ERROR_MESSAGE",
									entry_tDBOutput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_LINE",
									entry_tDBOutput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_SUCCESS",
									entry_tDBOutput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_REJECT",
									entry_tDBOutput_1.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_1 = new StringBuilder();
							for (int i_tDBOutput_1 = 0; i_tDBOutput_1 < entry_tDBOutput_1.getKey()
									.length(); i_tDBOutput_1++) {
								char ch_tDBOutput_1 = entry_tDBOutput_1.getKey().charAt(i_tDBOutput_1);
								if (Character.isUpperCase(ch_tDBOutput_1) && i_tDBOutput_1 > 0) {
									studio_key_tDBOutput_1.append('_');
								}
								studio_key_tDBOutput_1.append(ch_tDBOutput_1);
							}
							container_tDBOutput_1.setComponentData("tDBOutput_1",
									studio_key_tDBOutput_1.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_1.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "MSTFLD", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_1", true);
				end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tFileDelete_2Process(globalMap);

				/**
				 * [tDBOutput_1 end ] stop
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
				 * [tFileInputDelimited_1 finally ] start
				 */

				currentComponent = "tFileInputDelimited_1";

				/**
				 * [tFileInputDelimited_1 finally ] stop
				 */

				/**
				 * [tMap_1 finally ] start
				 */

				currentComponent = "tMap_1";

				/**
				 * [tMap_1 finally ] stop
				 */

				/**
				 * [tDBOutput_1 finally ] start
				 */

				currentComponent = "tDBOutput_1";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_1") == null) {
					if (resourceMap.get("writer_tDBOutput_1") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_1"))
									.close();
						} catch (java.io.IOException e_tDBOutput_1) {
							String errorMessage_tDBOutput_1 = "failed to release the resource in tDBOutput_1 :"
									+ e_tDBOutput_1.getMessage();
							System.err.println(errorMessage_tDBOutput_1);
						}
					}
				}

				/**
				 * [tDBOutput_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}

	public void tFileDelete_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileDelete_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_2");
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
				 * [tFileDelete_2 begin ] start
				 */

				ok_Hash.put("tFileDelete_2", false);
				start_Hash.put("tFileDelete_2", System.currentTimeMillis());

				currentComponent = "tFileDelete_2";

				int tos_count_tFileDelete_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileDelete_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileDelete_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileDelete_2 = new StringBuilder();
							log4jParamters_tFileDelete_2.append("Parameters:");
							log4jParamters_tFileDelete_2
									.append("PATH" + " = " + "\"/data/talend/data_repository/MSTFLD.zip\"");
							log4jParamters_tFileDelete_2.append(" | ");
							log4jParamters_tFileDelete_2.append("FAILON" + " = " + "true");
							log4jParamters_tFileDelete_2.append(" | ");
							log4jParamters_tFileDelete_2.append("FOLDER_FILE" + " = " + "true");
							log4jParamters_tFileDelete_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileDelete_2 - " + (log4jParamters_tFileDelete_2));
						}
					}
					new BytesLimit65535_tFileDelete_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileDelete_2", "tFileDelete_2", "tFileDelete");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tFileDelete_2 begin ] stop
				 */

				/**
				 * [tFileDelete_2 main ] start
				 */

				currentComponent = "tFileDelete_2";

				final StringBuffer log4jSb_tFileDelete_2 = new StringBuffer();

				class DeleteFoldertFileDelete_2 {
					/**
					 * delete all the sub-files in 'file'
					 * 
					 * @param file
					 */
					public boolean delete(java.io.File file) {
						java.io.File[] files = file.listFiles();
						for (int i = 0; i < files.length; i++) {
							if (files[i].isFile()) {
								files[i].delete();
							} else if (files[i].isDirectory()) {
								if (!files[i].delete()) {
									delete(files[i]);
								}
							}
						}
						deleteDirectory(file);
						return file.delete();
					}

					/**
					 * delete all the sub-folders in 'file'
					 * 
					 * @param file
					 */
					private void deleteDirectory(java.io.File file) {
						java.io.File[] filed = file.listFiles();
						for (int i = 0; i < filed.length; i++) {
							if (filed[i].isDirectory()) {
								deleteDirectory(filed[i]);
							}
							filed[i].delete();
						}
					}

				}
				java.io.File path_tFileDelete_2 = new java.io.File("/data/talend/data_repository/MSTFLD.zip");
				if (path_tFileDelete_2.exists()) {
					if (path_tFileDelete_2.isFile()) {
						if (path_tFileDelete_2.delete()) {
							globalMap.put("tFileDelete_2_CURRENT_STATUS", "File deleted.");
							log.info("tFileDelete_2 - File : " + path_tFileDelete_2.getAbsolutePath() + " is deleted.");
						} else {
							globalMap.put("tFileDelete_2_CURRENT_STATUS", "No file deleted.");
							throw new RuntimeException(
									"The file " + path_tFileDelete_2.getAbsolutePath() + " can't be deleted.");
						}
					} else if (path_tFileDelete_2.isDirectory()) {
						DeleteFoldertFileDelete_2 dftFileDelete_2 = new DeleteFoldertFileDelete_2();
						if (dftFileDelete_2.delete(path_tFileDelete_2)) {
							globalMap.put("tFileDelete_2_CURRENT_STATUS", "Path deleted.");
							log.info("tFileDelete_2 - Directory : " + path_tFileDelete_2.getAbsolutePath()
									+ " is deleted.");
						} else {
							globalMap.put("tFileDelete_2_CURRENT_STATUS", "No path deleted.");
							throw new RuntimeException(
									"The directory " + path_tFileDelete_2.getAbsolutePath() + " can not be deleted.");
						}
					}
				} else {
					globalMap.put("tFileDelete_2_CURRENT_STATUS", "File or path does not exist or is invalid.");
					throw new RuntimeException("File or path does not exist or is invalid.");
				}
				globalMap.put("tFileDelete_2_DELETE_PATH", "/data/talend/data_repository/MSTFLD.zip");

				tos_count_tFileDelete_2++;

				/**
				 * [tFileDelete_2 main ] stop
				 */

				/**
				 * [tFileDelete_2 process_data_begin ] start
				 */

				currentComponent = "tFileDelete_2";

				/**
				 * [tFileDelete_2 process_data_begin ] stop
				 */

				/**
				 * [tFileDelete_2 process_data_end ] start
				 */

				currentComponent = "tFileDelete_2";

				/**
				 * [tFileDelete_2 process_data_end ] stop
				 */

				/**
				 * [tFileDelete_2 end ] start
				 */

				currentComponent = "tFileDelete_2";

				if (log.isDebugEnabled())
					log.debug("tFileDelete_2 - " + ("Done."));

				ok_Hash.put("tFileDelete_2", true);
				end_Hash.put("tFileDelete_2", System.currentTimeMillis());

				/**
				 * [tFileDelete_2 end ] stop
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
				 * [tFileDelete_2 finally ] start
				 */

				currentComponent = "tFileDelete_2";

				/**
				 * [tFileDelete_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileDelete_2_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_2");
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
				 * [tDBRow_2 begin ] start
				 */

				ok_Hash.put("tDBRow_2", false);
				start_Hash.put("tDBRow_2", System.currentTimeMillis());

				currentComponent = "tDBRow_2";

				int tos_count_tDBRow_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_2", "tDBRow_2", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_2 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_2 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_2 = (String) (restRequest_tDBRow_2 != null
						? restRequest_tDBRow_2.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_2 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_2 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_2 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_2 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_2
						.createRuntimeProperties();
				props_tDBRow_2.setValue("query",
						"DELETE from ITEM_ATTRIBUTES_FILE_MSTITA\nWHERE LOAD_DATE = CURRENT_DATE()");

				props_tDBRow_2.setValue("dieOnError", false);

				props_tDBRow_2.setValue("usePreparedStatement", false);

				props_tDBRow_2.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_2_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_2_1_fisrt sst_tDBRow_2_1_fisrt = new SchemaSettingTool_tDBRow_2_1_fisrt();

				props_tDBRow_2.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_2_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_2_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_2_2_fisrt sst_tDBRow_2_2_fisrt = new SchemaSettingTool_tDBRow_2_2_fisrt();

				props_tDBRow_2.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_2_2_fisrt.getSchemaValue()));

				props_tDBRow_2.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_2.connection.setValue("useCustomRegion", false);

				props_tDBRow_2.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_2.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_2.table.setValue("tableName", "");

				props_tDBRow_2.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_2.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_2.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_2_3_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_2_3_fisrt sst_tDBRow_2_3_fisrt = new SchemaSettingTool_tDBRow_2_3_fisrt();

				props_tDBRow_2.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_2_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_2.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_2 = props_tDBRow_2.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_2.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_2);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_2.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_2 = props_tDBRow_2.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_2.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_2);
					}
				}
				globalMap.put("tDBRow_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_2);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_2 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_2_MAPPINGS_URL", mappings_url_tDBRow_2);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_2 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_2";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_2 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_2 = null;
				topology_tDBRow_2 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_2 = def_tDBRow_2.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_2,
						topology_tDBRow_2);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_2 = def_tDBRow_2
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_2 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_2.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_2 = componentRuntime_tDBRow_2
						.initialize(container_tDBRow_2, props_tDBRow_2);

				if (initVr_tDBRow_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_2.getMessage());
				}

				if (componentRuntime_tDBRow_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_2;
					compDriverInitialization_tDBRow_2.runAtDriver(container_tDBRow_2);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_2 = null;
				if (componentRuntime_tDBRow_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_2 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_2;
					if (doesNodeBelongToRequest_tDBRow_2) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_2 = sourceOrSink_tDBRow_2
								.validate(container_tDBRow_2);
						if (vr_tDBRow_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_2.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_2 begin ] stop
				 */

				/**
				 * [tDBRow_2 main ] start
				 */

				currentComponent = "tDBRow_2";

				tos_count_tDBRow_2++;

				/**
				 * [tDBRow_2 main ] stop
				 */

				/**
				 * [tDBRow_2 process_data_begin ] start
				 */

				currentComponent = "tDBRow_2";

				/**
				 * [tDBRow_2 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_2 process_data_end ] start
				 */

				currentComponent = "tDBRow_2";

				/**
				 * [tDBRow_2 process_data_end ] stop
				 */

				/**
				 * [tDBRow_2 end ] start
				 */

				currentComponent = "tDBRow_2";

// end of generic

				resourceMap.put("finish_tDBRow_2", Boolean.TRUE);

				ok_Hash.put("tDBRow_2", true);
				end_Hash.put("tDBRow_2", System.currentTimeMillis());

				/**
				 * [tDBRow_2 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_2:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk11", 0, "ok");
			}

			tDBInput_2Process(globalMap);

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
				 * [tDBRow_2 finally ] start
				 */

				currentComponent = "tDBRow_2";

// finally of generic

				if (resourceMap.get("finish_tDBRow_2") == null) {
				}

				/**
				 * [tDBRow_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_2_SUBPROCESS_STATE", 1);
	}

	public static class row36Struct implements routines.system.IPersistableRow<row36Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal IASNUM;

		public BigDecimal getIASNUM() {
			return this.IASNUM;
		}

		public Boolean IASNUMIsNullable() {
			return false;
		}

		public Boolean IASNUMIsKey() {
			return false;
		}

		public Integer IASNUMLength() {
			return 6;
		}

		public Integer IASNUMPrecision() {
			return 0;
		}

		public String IASNUMDefault() {

			return "";

		}

		public String IASNUMComment() {

			return "";

		}

		public String IASNUMPattern() {

			return "";

		}

		public String IASNUMOriginalDbColumnName() {

			return "IASNUM";

		}

		public String ISTYLN;

		public String getISTYLN() {
			return this.ISTYLN;
		}

		public Boolean ISTYLNIsNullable() {
			return false;
		}

		public Boolean ISTYLNIsKey() {
			return false;
		}

		public Integer ISTYLNLength() {
			return 15;
		}

		public Integer ISTYLNPrecision() {
			return 0;
		}

		public String ISTYLNDefault() {

			return null;

		}

		public String ISTYLNComment() {

			return "";

		}

		public String ISTYLNPattern() {

			return "";

		}

		public String ISTYLNOriginalDbColumnName() {

			return "ISTYLN";

		}

		public float INUMBR;

		public float getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return false;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return 9;
		}

		public Integer INUMBRPrecision() {
			return 0;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return false;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return 6;
		}

		public Integer ITANAMPrecision() {
			return 0;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return false;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return 6;
		}

		public Integer ITAVALPrecision() {
			return 0;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					this.INUMBR = dis.readFloat();

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					this.INUMBR = dis.readFloat();

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// float

				dos.writeFloat(this.INUMBR);

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// float

				dos.writeFloat(this.INUMBR);

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("IASNUM=" + String.valueOf(IASNUM));
			sb.append(",ISTYLN=" + ISTYLN);
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (IASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(IASNUM);
			}

			sb.append("|");

			if (ISTYLN == null) {
				sb.append("<null>");
			} else {
				sb.append(ISTYLN);
			}

			sb.append("|");

			sb.append(INUMBR);

			sb.append("|");

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row36Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_2");
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

				row36Struct row36 = new row36Struct();

				/**
				 * [tFileOutputDelimited_2 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_2", false);
				start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row36");

				int tos_count_tFileOutputDelimited_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_2 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_2.append("Parameters:");
							log4jParamters_tFileOutputDelimited_2.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/MSTITA.csv\"");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							log4jParamters_tFileOutputDelimited_2.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_2 - " + (log4jParamters_tFileOutputDelimited_2));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_2", "tFileOutputDelimited_2", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_2 = "";
				fileName_tFileOutputDelimited_2 = (new java.io.File("/data/talend/data_repository/MSTITA.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_2 = null;
				String extension_tFileOutputDelimited_2 = null;
				String directory_tFileOutputDelimited_2 = null;
				if ((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
						extension_tFileOutputDelimited_2 = "";
					} else {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0,
								fileName_tFileOutputDelimited_2.lastIndexOf("."));
						extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0,
							fileName_tFileOutputDelimited_2.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0,
								fileName_tFileOutputDelimited_2.lastIndexOf("."));
						extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2
								.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
						extension_tFileOutputDelimited_2 = "";
					}
					directory_tFileOutputDelimited_2 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_2 = true;
				java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME", fileName_tFileOutputDelimited_2);
				int nb_line_tFileOutputDelimited_2 = 0;
				int splitedFileNo_tFileOutputDelimited_2 = 0;
				int currentRow_tFileOutputDelimited_2 = 0;

				final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_2:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /**
																		 * Start field
																		 * tFileOutputDelimited_2:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
					if (!dir_tFileOutputDelimited_2.exists()) {
						log.info("tFileOutputDelimited_2 - Creating directory '"
								+ dir_tFileOutputDelimited_2.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_2.mkdirs();
						log.info("tFileOutputDelimited_2 - The directory '"
								+ dir_tFileOutputDelimited_2.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
				String zipName_tFileOutputDelimited_2 = fullName_tFileOutputDelimited_2 + ".zip";
				java.io.File file_tFileOutputDelimited_2 = new java.io.File(zipName_tFileOutputDelimited_2);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_2 = null;
				java.io.Writer outtFileOutputDelimited_2 = null;

				if (file_tFileOutputDelimited_2.exists()) {
					file_tFileOutputDelimited_2.delete();
				}
				zipOut_tFileOutputDelimited_2 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_2)));
				zipOut_tFileOutputDelimited_2
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_2.getName()));
				outtFileOutputDelimited_2 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_2, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_2.length() == 0) {
						outtFileOutputDelimited_2.write("IASNUM");
						outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.write("ISTYLN");
						outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.write("INUMBR");
						outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.write("ITANAM");
						outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.write("ITAVAL");
						outtFileOutputDelimited_2.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
						outtFileOutputDelimited_2.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

				/**
				 * [tFileOutputDelimited_2 begin ] stop
				 */

				/**
				 * [tDBInput_2 begin ] start
				 */

				ok_Hash.put("tDBInput_2", false);
				start_Hash.put("tDBInput_2", System.currentTimeMillis());

				currentComponent = "tDBInput_2";

				int tos_count_tDBInput_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_2 = new StringBuilder();
							log4jParamters_tDBInput_2.append("Parameters:");
							log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select * from MM4R5LIB.MSTITA\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IASNUM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ISTYLN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("INUMBR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITANAM") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ITAVAL") + "}]");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_2.append(" | ");
							log4jParamters_tDBInput_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_2 - " + (log4jParamters_tDBInput_2));
						}
					}
					new BytesLimit65535_tDBInput_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_2", "tDBInput_2", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_2 = 0;
				java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_2 = java.lang.Class.forName(driverClass_tDBInput_2);
				String dbUser_tDBInput_2 = context.jda_user_name;

				final String decryptedPassword_tDBInput_2 = context.jda_password;

				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;

				String url_tDBInput_2 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_2 - Driver ClassName: " + driverClass_tDBInput_2 + ".");

				log.debug("tDBInput_2 - Connection attempt to '" + url_tDBInput_2 + "' with the username '"
						+ dbUser_tDBInput_2 + "'.");

				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2, dbUser_tDBInput_2,
						dbPwd_tDBInput_2);
				log.debug("tDBInput_2 - Connection to '" + url_tDBInput_2 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

				String dbquery_tDBInput_2 = "select * from MM4R5LIB.MSTITA";

				log.debug("tDBInput_2 - Executing the query: '" + dbquery_tDBInput_2 + "'.");

				globalMap.put("tDBInput_2_QUERY", dbquery_tDBInput_2);
				java.sql.ResultSet rs_tDBInput_2 = null;

				try {
					rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
					java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
					int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

					String tmpContent_tDBInput_2 = null;

					log.debug("tDBInput_2 - Retrieving records from the database.");

					while (rs_tDBInput_2.next()) {
						nb_line_tDBInput_2++;

						if (colQtyInRs_tDBInput_2 < 1) {
							row36.IASNUM = null;
						} else {

							row36.IASNUM = rs_tDBInput_2.getBigDecimal(1);
							if (rs_tDBInput_2.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_2 < 2) {
							row36.ISTYLN = null;
						} else {

							row36.ISTYLN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
						}
						if (colQtyInRs_tDBInput_2 < 3) {
							row36.INUMBR = 0;
						} else {

							row36.INUMBR = rs_tDBInput_2.getFloat(3);
							if (rs_tDBInput_2.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_2 < 4) {
							row36.ITANAM = null;
						} else {

							row36.ITANAM = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
						}
						if (colQtyInRs_tDBInput_2 < 5) {
							row36.ITAVAL = null;
						} else {

							row36.ITAVAL = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
						}

						log.debug("tDBInput_2 - Retrieving the record " + nb_line_tDBInput_2 + ".");

						/**
						 * [tDBInput_2 begin ] stop
						 */

						/**
						 * [tDBInput_2 main ] start
						 */

						currentComponent = "tDBInput_2";

						tos_count_tDBInput_2++;

						/**
						 * [tDBInput_2 main ] stop
						 */

						/**
						 * [tDBInput_2 process_data_begin ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_2 main ] start
						 */

						currentComponent = "tFileOutputDelimited_2";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row36", "tDBInput_2", "tDBInput_2", "tAS400Input", "tFileOutputDelimited_2",
								"tFileOutputDelimited_2", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row36 - " + (row36 == null ? "" : row36.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
						if (row36.IASNUM != null) {
							sb_tFileOutputDelimited_2
									.append(row36.IASNUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row36.ISTYLN != null) {
							sb_tFileOutputDelimited_2.append(row36.ISTYLN);
						}
						sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
						sb_tFileOutputDelimited_2.append(row36.INUMBR);
						sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row36.ITANAM != null) {
							sb_tFileOutputDelimited_2.append(row36.ITANAM);
						}
						sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
						if (row36.ITAVAL != null) {
							sb_tFileOutputDelimited_2.append(row36.ITAVAL);
						}
						sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_2++;
							resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

							outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());
							log.debug("tFileOutputDelimited_2 - Writing the record " + nb_line_tFileOutputDelimited_2
									+ ".");

						}

						tos_count_tFileOutputDelimited_2++;

						/**
						 * [tFileOutputDelimited_2 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_2 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_2";

						/**
						 * [tFileOutputDelimited_2 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_2 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_2";

						/**
						 * [tFileOutputDelimited_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 process_data_end ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 end ] start
						 */

						currentComponent = "tDBInput_2";

					}
				} finally {
					if (rs_tDBInput_2 != null) {
						rs_tDBInput_2.close();
					}
					if (stmt_tDBInput_2 != null) {
						stmt_tDBInput_2.close();
					}
					if (conn_tDBInput_2 != null && !conn_tDBInput_2.isClosed()) {

						log.debug("tDBInput_2 - Closing the connection to the database.");

						conn_tDBInput_2.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_2 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_2_NB_LINE", nb_line_tDBInput_2);
				log.debug("tDBInput_2 - Retrieved records count: " + nb_line_tDBInput_2 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_2 - " + ("Done."));

				ok_Hash.put("tDBInput_2", true);
				end_Hash.put("tDBInput_2", System.currentTimeMillis());

				/**
				 * [tDBInput_2 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_2 end ] start
				 */

				currentComponent = "tFileOutputDelimited_2";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_2 != null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}

					globalMap.put("tFileOutputDelimited_2_NB_LINE", nb_line_tFileOutputDelimited_2);
					globalMap.put("tFileOutputDelimited_2_FILE_NAME", fileName_tFileOutputDelimited_2);

				}

				resourceMap.put("finish_tFileOutputDelimited_2", true);

				log.debug("tFileOutputDelimited_2 - Written records count: " + nb_line_tFileOutputDelimited_2 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row36", 2, 0,
						"tDBInput_2", "tDBInput_2", "tAS400Input", "tFileOutputDelimited_2", "tFileOutputDelimited_2",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_2 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_2", true);
				end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_2 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk12", 0, "ok");
			}

			tFileInputDelimited_2Process(globalMap);

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
				 * [tDBInput_2 finally ] start
				 */

				currentComponent = "tDBInput_2";

				/**
				 * [tDBInput_2 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_2 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_2";

				if (resourceMap.get("finish_tFileOutputDelimited_2") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_2");
						if (outtFileOutputDelimited_2 != null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_2 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}

	public static class MSTITAStruct implements routines.system.IPersistableRow<MSTITAStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal IASNUM;

		public BigDecimal getIASNUM() {
			return this.IASNUM;
		}

		public Boolean IASNUMIsNullable() {
			return true;
		}

		public Boolean IASNUMIsKey() {
			return false;
		}

		public Integer IASNUMLength() {
			return null;
		}

		public Integer IASNUMPrecision() {
			return null;
		}

		public String IASNUMDefault() {

			return "";

		}

		public String IASNUMComment() {

			return "";

		}

		public String IASNUMPattern() {

			return "";

		}

		public String IASNUMOriginalDbColumnName() {

			return "IASNUM";

		}

		public String ISTYLN;

		public String getISTYLN() {
			return this.ISTYLN;
		}

		public Boolean ISTYLNIsNullable() {
			return true;
		}

		public Boolean ISTYLNIsKey() {
			return false;
		}

		public Integer ISTYLNLength() {
			return null;
		}

		public Integer ISTYLNPrecision() {
			return null;
		}

		public String ISTYLNDefault() {

			return null;

		}

		public String ISTYLNComment() {

			return "";

		}

		public String ISTYLNPattern() {

			return "";

		}

		public String ISTYLNOriginalDbColumnName() {

			return "ISTYLN";

		}

		public Double INUMBR;

		public Double getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return true;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return null;
		}

		public Integer INUMBRPrecision() {
			return null;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return true;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return null;
		}

		public Integer ITANAMPrecision() {
			return null;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return true;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return null;
		}

		public Integer ITAVALPrecision() {
			return null;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		public java.util.Date LOAD_DATE;

		public java.util.Date getLOAD_DATE() {
			return this.LOAD_DATE;
		}

		public Boolean LOAD_DATEIsNullable() {
			return true;
		}

		public Boolean LOAD_DATEIsKey() {
			return false;
		}

		public Integer LOAD_DATELength() {
			return null;
		}

		public Integer LOAD_DATEPrecision() {
			return null;
		}

		public String LOAD_DATEDefault() {

			return null;

		}

		public String LOAD_DATEComment() {

			return "";

		}

		public String LOAD_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String LOAD_DATEOriginalDbColumnName() {

			return "LOAD_DATE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.INUMBR = null;
					} else {
						this.INUMBR = dis.readDouble();
					}

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.INUMBR = null;
					} else {
						this.INUMBR = dis.readDouble();
					}

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// Double

				if (this.INUMBR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.INUMBR);
				}

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// Double

				if (this.INUMBR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.INUMBR);
				}

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("IASNUM=" + String.valueOf(IASNUM));
			sb.append(",ISTYLN=" + ISTYLN);
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (IASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(IASNUM);
			}

			sb.append("|");

			if (ISTYLN == null) {
				sb.append("<null>");
			} else {
				sb.append(ISTYLN);
			}

			sb.append("|");

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			if (LOAD_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_DATE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(MSTITAStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row15Struct implements routines.system.IPersistableRow<row15Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal IASNUM;

		public BigDecimal getIASNUM() {
			return this.IASNUM;
		}

		public Boolean IASNUMIsNullable() {
			return true;
		}

		public Boolean IASNUMIsKey() {
			return false;
		}

		public Integer IASNUMLength() {
			return null;
		}

		public Integer IASNUMPrecision() {
			return null;
		}

		public String IASNUMDefault() {

			return "";

		}

		public String IASNUMComment() {

			return "";

		}

		public String IASNUMPattern() {

			return "";

		}

		public String IASNUMOriginalDbColumnName() {

			return "IASNUM";

		}

		public String ISTYLN;

		public String getISTYLN() {
			return this.ISTYLN;
		}

		public Boolean ISTYLNIsNullable() {
			return true;
		}

		public Boolean ISTYLNIsKey() {
			return false;
		}

		public Integer ISTYLNLength() {
			return null;
		}

		public Integer ISTYLNPrecision() {
			return null;
		}

		public String ISTYLNDefault() {

			return null;

		}

		public String ISTYLNComment() {

			return "";

		}

		public String ISTYLNPattern() {

			return "";

		}

		public String ISTYLNOriginalDbColumnName() {

			return "ISTYLN";

		}

		public Double INUMBR;

		public Double getINUMBR() {
			return this.INUMBR;
		}

		public Boolean INUMBRIsNullable() {
			return true;
		}

		public Boolean INUMBRIsKey() {
			return false;
		}

		public Integer INUMBRLength() {
			return null;
		}

		public Integer INUMBRPrecision() {
			return null;
		}

		public String INUMBRDefault() {

			return "";

		}

		public String INUMBRComment() {

			return "";

		}

		public String INUMBRPattern() {

			return "";

		}

		public String INUMBROriginalDbColumnName() {

			return "INUMBR";

		}

		public String ITANAM;

		public String getITANAM() {
			return this.ITANAM;
		}

		public Boolean ITANAMIsNullable() {
			return true;
		}

		public Boolean ITANAMIsKey() {
			return false;
		}

		public Integer ITANAMLength() {
			return null;
		}

		public Integer ITANAMPrecision() {
			return null;
		}

		public String ITANAMDefault() {

			return null;

		}

		public String ITANAMComment() {

			return "";

		}

		public String ITANAMPattern() {

			return "";

		}

		public String ITANAMOriginalDbColumnName() {

			return "ITANAM";

		}

		public String ITAVAL;

		public String getITAVAL() {
			return this.ITAVAL;
		}

		public Boolean ITAVALIsNullable() {
			return true;
		}

		public Boolean ITAVALIsKey() {
			return false;
		}

		public Integer ITAVALLength() {
			return null;
		}

		public Integer ITAVALPrecision() {
			return null;
		}

		public String ITAVALDefault() {

			return null;

		}

		public String ITAVALComment() {

			return "";

		}

		public String ITAVALPattern() {

			return "";

		}

		public String ITAVALOriginalDbColumnName() {

			return "ITAVAL";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			String strReturn = null;
			int length = 0;
			length = unmarshaller.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL2.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL2, 0, length, utf8Charset);
			}
			return strReturn;
		}

		private void writeString(String str, ObjectOutputStream dos) throws IOException {
			if (str == null) {
				dos.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				dos.writeInt(byteArray.length);
				dos.write(byteArray);
			}
		}

		private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (str == null) {
				marshaller.writeInt(-1);
			} else {
				byte[] byteArray = str.getBytes(utf8Charset);
				marshaller.writeInt(byteArray.length);
				marshaller.write(byteArray);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.INUMBR = null;
					} else {
						this.INUMBR = dis.readDouble();
					}

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.IASNUM = (BigDecimal) dis.readObject();

					this.ISTYLN = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.INUMBR = null;
					} else {
						this.INUMBR = dis.readDouble();
					}

					this.ITANAM = readString(dis);

					this.ITAVAL = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// Double

				if (this.INUMBR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.INUMBR);
				}

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.IASNUM);

				// String

				writeString(this.ISTYLN, dos);

				// Double

				if (this.INUMBR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.INUMBR);
				}

				// String

				writeString(this.ITANAM, dos);

				// String

				writeString(this.ITAVAL, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("IASNUM=" + String.valueOf(IASNUM));
			sb.append(",ISTYLN=" + ISTYLN);
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ITANAM=" + ITANAM);
			sb.append(",ITAVAL=" + ITAVAL);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (IASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(IASNUM);
			}

			sb.append("|");

			if (ISTYLN == null) {
				sb.append("<null>");
			} else {
				sb.append(ISTYLN);
			}

			sb.append("|");

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (ITANAM == null) {
				sb.append("<null>");
			} else {
				sb.append(ITANAM);
			}

			sb.append("|");

			if (ITAVAL == null) {
				sb.append("<null>");
			} else {
				sb.append(ITAVAL);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row15Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_2");
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

				row15Struct row15 = new row15Struct();
				MSTITAStruct MSTITA = new MSTITAStruct();

				/**
				 * [tDBOutput_3 begin ] start
				 */

				ok_Hash.put("tDBOutput_3", false);
				start_Hash.put("tDBOutput_3", System.currentTimeMillis());

				currentComponent = "tDBOutput_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "MSTITA");

				int tos_count_tDBOutput_3 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_3", "tDBOutput_3", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_3 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_3 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_3 = (String) (restRequest_tDBOutput_3 != null
						? restRequest_tDBOutput_3.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_3 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_3 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_3 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_3 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_3
						.createRuntimeProperties();
				props_tDBOutput_3.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_3.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_3.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_3.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_3.setValue("useSchemaDatePattern", false);

				props_tDBOutput_3.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_3_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_3_1_fisrt sst_tDBOutput_3_1_fisrt = new SchemaSettingTool_tDBOutput_3_1_fisrt();

				props_tDBOutput_3.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_3_1_fisrt.getSchemaValue()));

				props_tDBOutput_3.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_3.connection.setValue("useCustomRegion", false);

				props_tDBOutput_3.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_3.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_3.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_3.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_3.table.setValue("tableName", "ITEM_ATTRIBUTES_FILE_MSTITA");

				props_tDBOutput_3.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_3.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_3.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_3.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_3_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"ITEM_ATTRIBUTES_FILE_MSTITA\",\"fields\":[{", s);

						a("\"name\":\"IASNUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IASNUM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ISTYLN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISTYLN\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"INUMBR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ITANAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITANAM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ITAVAL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITAVAL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_3_2_fisrt sst_tDBOutput_3_2_fisrt = new SchemaSettingTool_tDBOutput_3_2_fisrt();

				props_tDBOutput_3.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_3_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_3.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_3 = props_tDBOutput_3.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_3 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_3 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_3.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_3);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_3.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_3 = props_tDBOutput_3.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_3 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_3 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_3.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_3);
					}
				}
				globalMap.put("tDBOutput_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_3);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_3 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_3_MAPPINGS_URL", mappings_url_tDBOutput_3);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_3 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_3";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_3 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_3 = null;
				topology_tDBOutput_3 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_3 = def_tDBOutput_3.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_3,
						topology_tDBOutput_3);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_3 = def_tDBOutput_3
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_3 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_3.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_3 = componentRuntime_tDBOutput_3
						.initialize(container_tDBOutput_3, props_tDBOutput_3);

				if (initVr_tDBOutput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_3.getMessage());
				}

				if (componentRuntime_tDBOutput_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_3;
					compDriverInitialization_tDBOutput_3.runAtDriver(container_tDBOutput_3);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_3 = null;
				if (componentRuntime_tDBOutput_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_3 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_3;
					if (doesNodeBelongToRequest_tDBOutput_3) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_3 = sourceOrSink_tDBOutput_3
								.validate(container_tDBOutput_3);
						if (vr_tDBOutput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_3.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_3 = null;
				if (sourceOrSink_tDBOutput_3 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_3 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_3;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_3 = sink_tDBOutput_3
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_3) {
						writeOperation_tDBOutput_3.initialize(container_tDBOutput_3);
					}
					writer_tDBOutput_3 = writeOperation_tDBOutput_3.createWriter(container_tDBOutput_3);
					if (doesNodeBelongToRequest_tDBOutput_3) {
						writer_tDBOutput_3.open("tDBOutput_3");
					}

					resourceMap.put("writer_tDBOutput_3", writer_tDBOutput_3);
				} // end of "sourceOrSink_tDBOutput_3 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_3 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_3
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_3 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_3 = props_tDBOutput_3.getSchema(c_tDBOutput_3, false);
				incomingEnforcer_tDBOutput_3 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_3);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_3 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_3 = null;

				/**
				 * [tDBOutput_3 begin ] stop
				 */

				/**
				 * [tMap_2 begin ] start
				 */

				ok_Hash.put("tMap_2", false);
				start_Hash.put("tMap_2", System.currentTimeMillis());

				currentComponent = "tMap_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row15");

				int tos_count_tMap_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_2 = new StringBuilder();
							log4jParamters_tMap_2.append("Parameters:");
							log4jParamters_tMap_2.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_2.append(" | ");
							log4jParamters_tMap_2.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_2 - " + (log4jParamters_tMap_2));
						}
					}
					new BytesLimit65535_tMap_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_2", "tMap_2", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row15_tMap_2 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_2__Struct {
					java.util.Date var1;
				}
				Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_MSTITA_tMap_2 = 0;

				MSTITAStruct MSTITA_tmp = new MSTITAStruct();
// ###############################

				/**
				 * [tMap_2 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_2 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_2", false);
				start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_2";

				int tos_count_tFileInputDelimited_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
							log4jParamters_tFileInputDelimited_2.append("Parameters:");
							log4jParamters_tFileInputDelimited_2
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/MSTITA.zip\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IASNUM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ISTYLN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("INUMBR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ITANAM") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ITAVAL") + "}]");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_2 - " + (log4jParamters_tFileInputDelimited_2));
						}
					}
					new BytesLimit65535_tFileInputDelimited_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_2", "tFileInputDelimited_2", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				int limit_tFileInputDelimited_2 = -1;
				try {

					Object filename_tFileInputDelimited_2 = "/data/talend/data_repository/MSTITA.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_2 = null;
					try {
						if (filename_tFileInputDelimited_2 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_2 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_2));
						} else {
							zis_tFileInputDelimited_2 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_2))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());

						throw e;

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_2 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_2 = zis_tFileInputDelimited_2.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());

							throw e;

						}
						if (entry_tFileInputDelimited_2 == null) {
							break;
						}
						if (entry_tFileInputDelimited_2.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_2, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_2, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_2 != null && fid_tFileInputDelimited_2.nextRecord()) {
							rowstate_tFileInputDelimited_2.reset();

							row15 = null;

							boolean whetherReject_tFileInputDelimited_2 = false;
							row15 = new row15Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_2 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_2 = 0;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row15.IASNUM = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"IASNUM", "row15", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row15.IASNUM = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 1;

								row15.ISTYLN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 2;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row15.INUMBR = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"INUMBR", "row15", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row15.INUMBR = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 3;

								row15.ITANAM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 4;

								row15.ITAVAL = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								if (rowstate_tFileInputDelimited_2.getException() != null) {
									throw rowstate_tFileInputDelimited_2.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_2 = true;

								throw (e);

							}

							log.debug("tFileInputDelimited_2 - Retrieving the record "
									+ fid_tFileInputDelimited_2.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_2 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_2 main ] start
							 */

							currentComponent = "tFileInputDelimited_2";

							tos_count_tFileInputDelimited_2++;

							/**
							 * [tFileInputDelimited_2 main ] stop
							 */

							/**
							 * [tFileInputDelimited_2 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_2";

							/**
							 * [tFileInputDelimited_2 process_data_begin ] stop
							 */
// Start of branch "row15"
							if (row15 != null) {

								/**
								 * [tMap_2 main ] start
								 */

								currentComponent = "tMap_2";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row15", "tFileInputDelimited_2", "tFileInputDelimited_2",
										"tFileInputDelimited", "tMap_2", "tMap_2", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row15 - " + (row15 == null ? "" : row15.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_2 = false;
								boolean mainRowRejected_tMap_2 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_2__Struct Var = Var__tMap_2;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									MSTITA = null;

// # Output table : 'MSTITA'
									count_MSTITA_tMap_2++;

									MSTITA_tmp.IASNUM = row15.IASNUM;
									MSTITA_tmp.ISTYLN = row15.ISTYLN;
									MSTITA_tmp.INUMBR = row15.INUMBR;
									MSTITA_tmp.ITANAM = row15.ITANAM;
									MSTITA_tmp.ITAVAL = row15.ITAVAL;
									MSTITA_tmp.LOAD_DATE = Var.var1;
									MSTITA = MSTITA_tmp;
									log.debug("tMap_2 - Outputting the record " + count_MSTITA_tMap_2
											+ " of the output table 'MSTITA'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_2 = false;

								tos_count_tMap_2++;

								/**
								 * [tMap_2 main ] stop
								 */

								/**
								 * [tMap_2 process_data_begin ] start
								 */

								currentComponent = "tMap_2";

								/**
								 * [tMap_2 process_data_begin ] stop
								 */
// Start of branch "MSTITA"
								if (MSTITA != null) {

									/**
									 * [tDBOutput_3 main ] start
									 */

									currentComponent = "tDBOutput_3";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "MSTITA", "tMap_2", "tMap_2", "tMap", "tDBOutput_3", "tDBOutput_3",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("MSTITA - " + (MSTITA == null ? "" : MSTITA.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_3 != null) {
										incomingEnforcer_tDBOutput_3.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("IASNUM") != null) {
										incomingEnforcer_tDBOutput_3.put("IASNUM", MSTITA.IASNUM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("ISTYLN") != null) {
										incomingEnforcer_tDBOutput_3.put("ISTYLN", MSTITA.ISTYLN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("INUMBR") != null) {
										incomingEnforcer_tDBOutput_3.put("INUMBR", MSTITA.INUMBR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("ITANAM") != null) {
										incomingEnforcer_tDBOutput_3.put("ITANAM", MSTITA.ITANAM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("ITAVAL") != null) {
										incomingEnforcer_tDBOutput_3.put("ITAVAL", MSTITA.ITAVAL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_3.put("LOAD_DATE", MSTITA.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_3 = null;
									if (incomingEnforcer_tDBOutput_3 != null) {
										data_tDBOutput_3 = incomingEnforcer_tDBOutput_3.getCurrentRecord();
									}

									if (writer_tDBOutput_3 != null && data_tDBOutput_3 != null) {
										writer_tDBOutput_3.write(data_tDBOutput_3);
									}

									nb_line_tDBOutput_3++;

									tos_count_tDBOutput_3++;

									/**
									 * [tDBOutput_3 main ] stop
									 */

									/**
									 * [tDBOutput_3 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_3";

									/**
									 * [tDBOutput_3 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_3 process_data_end ] start
									 */

									currentComponent = "tDBOutput_3";

									/**
									 * [tDBOutput_3 process_data_end ] stop
									 */

								} // End of branch "MSTITA"

								/**
								 * [tMap_2 process_data_end ] start
								 */

								currentComponent = "tMap_2";

								/**
								 * [tMap_2 process_data_end ] stop
								 */

							} // End of branch "row15"

							/**
							 * [tFileInputDelimited_2 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_2";

							/**
							 * [tFileInputDelimited_2 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_2 end ] start
							 */

							currentComponent = "tFileInputDelimited_2";

						}
						nb_line_tFileInputDelimited_2 += fid_tFileInputDelimited_2.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/MSTITA.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_2 != null) {
							fid_tFileInputDelimited_2.close();
						}
					}
					if (fid_tFileInputDelimited_2 != null) {
						globalMap.put("tFileInputDelimited_2_NB_LINE", nb_line_tFileInputDelimited_2);
					}

					log.info("tFileInputDelimited_2- Retrieved records count: " + nb_line_tFileInputDelimited_2 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_2 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_2", true);
				end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_2 end ] stop
				 */

				/**
				 * [tMap_2 end ] start
				 */

				currentComponent = "tMap_2";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'MSTITA': " + count_MSTITA_tMap_2 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row15", 2, 0,
						"tFileInputDelimited_2", "tFileInputDelimited_2", "tFileInputDelimited", "tMap_2", "tMap_2",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_2 - " + ("Done."));

				ok_Hash.put("tMap_2", true);
				end_Hash.put("tMap_2", System.currentTimeMillis());

				/**
				 * [tMap_2 end ] stop
				 */

				/**
				 * [tDBOutput_3 end ] start
				 */

				currentComponent = "tDBOutput_3";

// end of generic

				resourceMap.put("finish_tDBOutput_3", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_3 = null;
				if (writer_tDBOutput_3 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_3 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_3
							.close();
					resultMap_tDBOutput_3 = writer_tDBOutput_3.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_3), container_tDBOutput_3);
				}
				if (resultMap_tDBOutput_3 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_3 : resultMap_tDBOutput_3.entrySet()) {
						switch (entry_tDBOutput_3.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_3.setComponentData("tDBOutput_3", "ERROR_MESSAGE",
									entry_tDBOutput_3.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_LINE",
									entry_tDBOutput_3.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_SUCCESS",
									entry_tDBOutput_3.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_REJECT",
									entry_tDBOutput_3.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_3 = new StringBuilder();
							for (int i_tDBOutput_3 = 0; i_tDBOutput_3 < entry_tDBOutput_3.getKey()
									.length(); i_tDBOutput_3++) {
								char ch_tDBOutput_3 = entry_tDBOutput_3.getKey().charAt(i_tDBOutput_3);
								if (Character.isUpperCase(ch_tDBOutput_3) && i_tDBOutput_3 > 0) {
									studio_key_tDBOutput_3.append('_');
								}
								studio_key_tDBOutput_3.append(ch_tDBOutput_3);
							}
							container_tDBOutput_3.setComponentData("tDBOutput_3",
									studio_key_tDBOutput_3.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_3.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "MSTITA", 2, 0, "tMap_2",
						"tMap_2", "tMap", "tDBOutput_3", "tDBOutput_3", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_3", true);
				end_Hash.put("tDBOutput_3", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tFileDelete_3Process(globalMap);

				/**
				 * [tDBOutput_3 end ] stop
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
				 * [tFileInputDelimited_2 finally ] start
				 */

				currentComponent = "tFileInputDelimited_2";

				/**
				 * [tFileInputDelimited_2 finally ] stop
				 */

				/**
				 * [tMap_2 finally ] start
				 */

				currentComponent = "tMap_2";

				/**
				 * [tMap_2 finally ] stop
				 */

				/**
				 * [tDBOutput_3 finally ] start
				 */

				currentComponent = "tDBOutput_3";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_3") == null) {
					if (resourceMap.get("writer_tDBOutput_3") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_3"))
									.close();
						} catch (java.io.IOException e_tDBOutput_3) {
							String errorMessage_tDBOutput_3 = "failed to release the resource in tDBOutput_3 :"
									+ e_tDBOutput_3.getMessage();
							System.err.println(errorMessage_tDBOutput_3);
						}
					}
				}

				/**
				 * [tDBOutput_3 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}

	public void tFileDelete_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileDelete_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_3");
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
				 * [tFileDelete_3 begin ] start
				 */

				ok_Hash.put("tFileDelete_3", false);
				start_Hash.put("tFileDelete_3", System.currentTimeMillis());

				currentComponent = "tFileDelete_3";

				int tos_count_tFileDelete_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileDelete_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileDelete_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileDelete_3 = new StringBuilder();
							log4jParamters_tFileDelete_3.append("Parameters:");
							log4jParamters_tFileDelete_3
									.append("PATH" + " = " + "\"/data/talend/data_repository/MSTITA.zip\"");
							log4jParamters_tFileDelete_3.append(" | ");
							log4jParamters_tFileDelete_3.append("FAILON" + " = " + "true");
							log4jParamters_tFileDelete_3.append(" | ");
							log4jParamters_tFileDelete_3.append("FOLDER_FILE" + " = " + "true");
							log4jParamters_tFileDelete_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileDelete_3 - " + (log4jParamters_tFileDelete_3));
						}
					}
					new BytesLimit65535_tFileDelete_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileDelete_3", "tFileDelete_3", "tFileDelete");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tFileDelete_3 begin ] stop
				 */

				/**
				 * [tFileDelete_3 main ] start
				 */

				currentComponent = "tFileDelete_3";

				final StringBuffer log4jSb_tFileDelete_3 = new StringBuffer();

				class DeleteFoldertFileDelete_3 {
					/**
					 * delete all the sub-files in 'file'
					 * 
					 * @param file
					 */
					public boolean delete(java.io.File file) {
						java.io.File[] files = file.listFiles();
						for (int i = 0; i < files.length; i++) {
							if (files[i].isFile()) {
								files[i].delete();
							} else if (files[i].isDirectory()) {
								if (!files[i].delete()) {
									delete(files[i]);
								}
							}
						}
						deleteDirectory(file);
						return file.delete();
					}

					/**
					 * delete all the sub-folders in 'file'
					 * 
					 * @param file
					 */
					private void deleteDirectory(java.io.File file) {
						java.io.File[] filed = file.listFiles();
						for (int i = 0; i < filed.length; i++) {
							if (filed[i].isDirectory()) {
								deleteDirectory(filed[i]);
							}
							filed[i].delete();
						}
					}

				}
				java.io.File path_tFileDelete_3 = new java.io.File("/data/talend/data_repository/MSTITA.zip");
				if (path_tFileDelete_3.exists()) {
					if (path_tFileDelete_3.isFile()) {
						if (path_tFileDelete_3.delete()) {
							globalMap.put("tFileDelete_3_CURRENT_STATUS", "File deleted.");
							log.info("tFileDelete_3 - File : " + path_tFileDelete_3.getAbsolutePath() + " is deleted.");
						} else {
							globalMap.put("tFileDelete_3_CURRENT_STATUS", "No file deleted.");
							throw new RuntimeException(
									"The file " + path_tFileDelete_3.getAbsolutePath() + " can't be deleted.");
						}
					} else if (path_tFileDelete_3.isDirectory()) {
						DeleteFoldertFileDelete_3 dftFileDelete_3 = new DeleteFoldertFileDelete_3();
						if (dftFileDelete_3.delete(path_tFileDelete_3)) {
							globalMap.put("tFileDelete_3_CURRENT_STATUS", "Path deleted.");
							log.info("tFileDelete_3 - Directory : " + path_tFileDelete_3.getAbsolutePath()
									+ " is deleted.");
						} else {
							globalMap.put("tFileDelete_3_CURRENT_STATUS", "No path deleted.");
							throw new RuntimeException(
									"The directory " + path_tFileDelete_3.getAbsolutePath() + " can not be deleted.");
						}
					}
				} else {
					globalMap.put("tFileDelete_3_CURRENT_STATUS", "File or path does not exist or is invalid.");
					throw new RuntimeException("File or path does not exist or is invalid.");
				}
				globalMap.put("tFileDelete_3_DELETE_PATH", "/data/talend/data_repository/MSTITA.zip");

				tos_count_tFileDelete_3++;

				/**
				 * [tFileDelete_3 main ] stop
				 */

				/**
				 * [tFileDelete_3 process_data_begin ] start
				 */

				currentComponent = "tFileDelete_3";

				/**
				 * [tFileDelete_3 process_data_begin ] stop
				 */

				/**
				 * [tFileDelete_3 process_data_end ] start
				 */

				currentComponent = "tFileDelete_3";

				/**
				 * [tFileDelete_3 process_data_end ] stop
				 */

				/**
				 * [tFileDelete_3 end ] start
				 */

				currentComponent = "tFileDelete_3";

				if (log.isDebugEnabled())
					log.debug("tFileDelete_3 - " + ("Done."));

				ok_Hash.put("tFileDelete_3", true);
				end_Hash.put("tFileDelete_3", System.currentTimeMillis());

				/**
				 * [tFileDelete_3 end ] stop
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
				 * [tFileDelete_3 finally ] start
				 */

				currentComponent = "tFileDelete_3";

				/**
				 * [tFileDelete_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileDelete_3_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_3");
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
				 * [tDBRow_3 begin ] start
				 */

				ok_Hash.put("tDBRow_3", false);
				start_Hash.put("tDBRow_3", System.currentTimeMillis());

				currentComponent = "tDBRow_3";

				int tos_count_tDBRow_3 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_3", "tDBRow_3", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_3 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_3 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_3 = (String) (restRequest_tDBRow_3 != null
						? restRequest_tDBRow_3.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_3 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_3 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_3 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_3 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_3
						.createRuntimeProperties();
				props_tDBRow_3.setValue("query",
						"DELETE from INVENTORY_SET_FILE_SETDTL\nWHERE LOAD_DATE = CURRENT_DATE()");

				props_tDBRow_3.setValue("dieOnError", false);

				props_tDBRow_3.setValue("usePreparedStatement", false);

				props_tDBRow_3.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_3_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_3_1_fisrt sst_tDBRow_3_1_fisrt = new SchemaSettingTool_tDBRow_3_1_fisrt();

				props_tDBRow_3.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_3_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_3_2_fisrt sst_tDBRow_3_2_fisrt = new SchemaSettingTool_tDBRow_3_2_fisrt();

				props_tDBRow_3.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_2_fisrt.getSchemaValue()));

				props_tDBRow_3.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_3.connection.setValue("useCustomRegion", false);

				props_tDBRow_3.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_3.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_3.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_3.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_3.table.setValue("tableName", "");

				props_tDBRow_3.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_3.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_3.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_3.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_3.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_3_3_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"EmptyRecord\",\"fields\":[]}", s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBRow_3_3_fisrt sst_tDBRow_3_3_fisrt = new SchemaSettingTool_tDBRow_3_3_fisrt();

				props_tDBRow_3.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_3.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_3 = props_tDBRow_3.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_3 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_3 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_3 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_3.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_3);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_3.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_3 = props_tDBRow_3.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_3 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_3 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_3 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_3.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_3);
					}
				}
				globalMap.put("tDBRow_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_3);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_3 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_3_MAPPINGS_URL", mappings_url_tDBRow_3);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_3 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_3";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_3 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_3 = null;
				topology_tDBRow_3 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_3 = def_tDBRow_3.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_3,
						topology_tDBRow_3);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_3 = def_tDBRow_3
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_3 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_3.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_3 = componentRuntime_tDBRow_3
						.initialize(container_tDBRow_3, props_tDBRow_3);

				if (initVr_tDBRow_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_3.getMessage());
				}

				if (componentRuntime_tDBRow_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_3;
					compDriverInitialization_tDBRow_3.runAtDriver(container_tDBRow_3);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_3 = null;
				if (componentRuntime_tDBRow_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_3 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_3;
					if (doesNodeBelongToRequest_tDBRow_3) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_3 = sourceOrSink_tDBRow_3
								.validate(container_tDBRow_3);
						if (vr_tDBRow_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_3.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_3 begin ] stop
				 */

				/**
				 * [tDBRow_3 main ] start
				 */

				currentComponent = "tDBRow_3";

				tos_count_tDBRow_3++;

				/**
				 * [tDBRow_3 main ] stop
				 */

				/**
				 * [tDBRow_3 process_data_begin ] start
				 */

				currentComponent = "tDBRow_3";

				/**
				 * [tDBRow_3 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_3 process_data_end ] start
				 */

				currentComponent = "tDBRow_3";

				/**
				 * [tDBRow_3 process_data_end ] stop
				 */

				/**
				 * [tDBRow_3 end ] start
				 */

				currentComponent = "tDBRow_3";

// end of generic

				resourceMap.put("finish_tDBRow_3", Boolean.TRUE);

				ok_Hash.put("tDBRow_3", true);
				end_Hash.put("tDBRow_3", System.currentTimeMillis());

				/**
				 * [tDBRow_3 end ] stop
				 */
			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_3:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk13", 0, "ok");
			}

			tDBInput_3Process(globalMap);

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
				 * [tDBRow_3 finally ] start
				 */

				currentComponent = "tDBRow_3";

// finally of generic

				if (resourceMap.get("finish_tDBRow_3") == null) {
				}

				/**
				 * [tDBRow_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_3_SUBPROCESS_STATE", 1);
	}

	public static class row28Struct implements routines.system.IPersistableRow<row28Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal ISETNO;

		public BigDecimal getISETNO() {
			return this.ISETNO;
		}

		public Boolean ISETNOIsNullable() {
			return true;
		}

		public Boolean ISETNOIsKey() {
			return false;
		}

		public Integer ISETNOLength() {
			return 9;
		}

		public Integer ISETNOPrecision() {
			return 0;
		}

		public String ISETNODefault() {

			return "";

		}

		public String ISETNOComment() {

			return "";

		}

		public String ISETNOPattern() {

			return "";

		}

		public String ISETNOOriginalDbColumnName() {

			return "ISETNO";

		}

		public BigDecimal ICMPNO;

		public BigDecimal getICMPNO() {
			return this.ICMPNO;
		}

		public Boolean ICMPNOIsNullable() {
			return true;
		}

		public Boolean ICMPNOIsKey() {
			return false;
		}

		public Integer ICMPNOLength() {
			return 9;
		}

		public Integer ICMPNOPrecision() {
			return 0;
		}

		public String ICMPNODefault() {

			return "";

		}

		public String ICMPNOComment() {

			return "";

		}

		public String ICMPNOPattern() {

			return "";

		}

		public String ICMPNOOriginalDbColumnName() {

			return "ICMPNO";

		}

		public Float ISETQT;

		public Float getISETQT() {
			return this.ISETQT;
		}

		public Boolean ISETQTIsNullable() {
			return true;
		}

		public Boolean ISETQTIsKey() {
			return false;
		}

		public Integer ISETQTLength() {
			return 9;
		}

		public Integer ISETQTPrecision() {
			return 2;
		}

		public String ISETQTDefault() {

			return "";

		}

		public String ISETQTComment() {

			return "";

		}

		public String ISETQTPattern() {

			return "";

		}

		public String ISETQTOriginalDbColumnName() {

			return "ISETQT";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readFloat();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readFloat();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Float

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeFloat(this.ISETQT);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Float

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeFloat(this.ISETQT);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ISETNO=" + String.valueOf(ISETNO));
			sb.append(",ICMPNO=" + String.valueOf(ICMPNO));
			sb.append(",ISETQT=" + String.valueOf(ISETQT));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ISETNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETNO);
			}

			sb.append("|");

			if (ICMPNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ICMPNO);
			}

			sb.append("|");

			if (ISETQT == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETQT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row28Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_3");
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

				row28Struct row28 = new row28Struct();

				/**
				 * [tFileOutputDelimited_3 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_3", false);
				start_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row28");

				int tos_count_tFileOutputDelimited_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_3 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_3.append("Parameters:");
							log4jParamters_tFileOutputDelimited_3.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/SETDTL.csv\"");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							log4jParamters_tFileOutputDelimited_3.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_3 - " + (log4jParamters_tFileOutputDelimited_3));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_3", "tFileOutputDelimited_3", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_3 = "";
				fileName_tFileOutputDelimited_3 = (new java.io.File("/data/talend/data_repository/SETDTL.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_3 = null;
				String extension_tFileOutputDelimited_3 = null;
				String directory_tFileOutputDelimited_3 = null;
				if ((fileName_tFileOutputDelimited_3.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_3.lastIndexOf(".") < fileName_tFileOutputDelimited_3
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
						extension_tFileOutputDelimited_3 = "";
					} else {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0,
								fileName_tFileOutputDelimited_3.lastIndexOf("."));
						extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0,
							fileName_tFileOutputDelimited_3.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_3.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0,
								fileName_tFileOutputDelimited_3.lastIndexOf("."));
						extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3
								.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
						extension_tFileOutputDelimited_3 = "";
					}
					directory_tFileOutputDelimited_3 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_3 = true;
				java.io.File filetFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
				globalMap.put("tFileOutputDelimited_3_FILE_NAME", fileName_tFileOutputDelimited_3);
				int nb_line_tFileOutputDelimited_3 = 0;
				int splitedFileNo_tFileOutputDelimited_3 = 0;
				int currentRow_tFileOutputDelimited_3 = 0;

				final String OUT_DELIM_tFileOutputDelimited_3 = /** Start field tFileOutputDelimited_3:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_3:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_3 = /**
																		 * Start field
																		 * tFileOutputDelimited_3:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_3:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_3 != null && directory_tFileOutputDelimited_3.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_3 = new java.io.File(directory_tFileOutputDelimited_3);
					if (!dir_tFileOutputDelimited_3.exists()) {
						log.info("tFileOutputDelimited_3 - Creating directory '"
								+ dir_tFileOutputDelimited_3.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_3.mkdirs();
						log.info("tFileOutputDelimited_3 - The directory '"
								+ dir_tFileOutputDelimited_3.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
				String zipName_tFileOutputDelimited_3 = fullName_tFileOutputDelimited_3 + ".zip";
				java.io.File file_tFileOutputDelimited_3 = new java.io.File(zipName_tFileOutputDelimited_3);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_3 = null;
				java.io.Writer outtFileOutputDelimited_3 = null;

				if (file_tFileOutputDelimited_3.exists()) {
					file_tFileOutputDelimited_3.delete();
				}
				zipOut_tFileOutputDelimited_3 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_3)));
				zipOut_tFileOutputDelimited_3
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_3.getName()));
				outtFileOutputDelimited_3 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_3, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_3", outtFileOutputDelimited_3);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_3.length() == 0) {
						outtFileOutputDelimited_3.write("ISETNO");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("ICMPNO");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("ISETQT");
						outtFileOutputDelimited_3.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);

				/**
				 * [tFileOutputDelimited_3 begin ] stop
				 */

				/**
				 * [tDBInput_3 begin ] start
				 */

				ok_Hash.put("tDBInput_3", false);
				start_Hash.put("tDBInput_3", System.currentTimeMillis());

				currentComponent = "tDBInput_3";

				int tos_count_tDBInput_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_3 = new StringBuilder();
							log4jParamters_tDBInput_3.append("Parameters:");
							log4jParamters_tDBInput_3.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"select * from MM4R5LIB.SETDTL\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ISETNO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ICMPNO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ISETQT") + "}]");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_3 - " + (log4jParamters_tDBInput_3));
						}
					}
					new BytesLimit65535_tDBInput_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_3", "tDBInput_3", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_3 = 0;
				java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_3 = java.lang.Class.forName(driverClass_tDBInput_3);
				String dbUser_tDBInput_3 = context.jda_user_name;

				final String decryptedPassword_tDBInput_3 = context.jda_password;

				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;

				String url_tDBInput_3 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_3 - Driver ClassName: " + driverClass_tDBInput_3 + ".");

				log.debug("tDBInput_3 - Connection attempt to '" + url_tDBInput_3 + "' with the username '"
						+ dbUser_tDBInput_3 + "'.");

				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3, dbUser_tDBInput_3,
						dbPwd_tDBInput_3);
				log.debug("tDBInput_3 - Connection to '" + url_tDBInput_3 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

				String dbquery_tDBInput_3 = "select * from MM4R5LIB.SETDTL";

				log.debug("tDBInput_3 - Executing the query: '" + dbquery_tDBInput_3 + "'.");

				globalMap.put("tDBInput_3_QUERY", dbquery_tDBInput_3);
				java.sql.ResultSet rs_tDBInput_3 = null;

				try {
					rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
					java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
					int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

					String tmpContent_tDBInput_3 = null;

					log.debug("tDBInput_3 - Retrieving records from the database.");

					while (rs_tDBInput_3.next()) {
						nb_line_tDBInput_3++;

						if (colQtyInRs_tDBInput_3 < 1) {
							row28.ISETNO = null;
						} else {

							row28.ISETNO = rs_tDBInput_3.getBigDecimal(1);
							if (rs_tDBInput_3.wasNull()) {
								row28.ISETNO = null;
							}
						}
						if (colQtyInRs_tDBInput_3 < 2) {
							row28.ICMPNO = null;
						} else {

							row28.ICMPNO = rs_tDBInput_3.getBigDecimal(2);
							if (rs_tDBInput_3.wasNull()) {
								row28.ICMPNO = null;
							}
						}
						if (colQtyInRs_tDBInput_3 < 3) {
							row28.ISETQT = null;
						} else {

							row28.ISETQT = rs_tDBInput_3.getFloat(3);
							if (rs_tDBInput_3.wasNull()) {
								row28.ISETQT = null;
							}
						}

						log.debug("tDBInput_3 - Retrieving the record " + nb_line_tDBInput_3 + ".");

						/**
						 * [tDBInput_3 begin ] stop
						 */

						/**
						 * [tDBInput_3 main ] start
						 */

						currentComponent = "tDBInput_3";

						tos_count_tDBInput_3++;

						/**
						 * [tDBInput_3 main ] stop
						 */

						/**
						 * [tDBInput_3 process_data_begin ] start
						 */

						currentComponent = "tDBInput_3";

						/**
						 * [tDBInput_3 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_3 main ] start
						 */

						currentComponent = "tFileOutputDelimited_3";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row28", "tDBInput_3", "tDBInput_3", "tAS400Input", "tFileOutputDelimited_3",
								"tFileOutputDelimited_3", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row28 - " + (row28 == null ? "" : row28.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
						if (row28.ISETNO != null) {
							sb_tFileOutputDelimited_3
									.append(row28.ISETNO.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row28.ICMPNO != null) {
							sb_tFileOutputDelimited_3
									.append(row28.ICMPNO.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row28.ISETQT != null) {
							sb_tFileOutputDelimited_3.append(row28.ISETQT);
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_3++;
							resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);

							outtFileOutputDelimited_3.write(sb_tFileOutputDelimited_3.toString());
							log.debug("tFileOutputDelimited_3 - Writing the record " + nb_line_tFileOutputDelimited_3
									+ ".");

						}

						tos_count_tFileOutputDelimited_3++;

						/**
						 * [tFileOutputDelimited_3 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_3 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_3";

						/**
						 * [tFileOutputDelimited_3 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_3 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_3";

						/**
						 * [tFileOutputDelimited_3 process_data_end ] stop
						 */

						/**
						 * [tDBInput_3 process_data_end ] start
						 */

						currentComponent = "tDBInput_3";

						/**
						 * [tDBInput_3 process_data_end ] stop
						 */

						/**
						 * [tDBInput_3 end ] start
						 */

						currentComponent = "tDBInput_3";

					}
				} finally {
					if (rs_tDBInput_3 != null) {
						rs_tDBInput_3.close();
					}
					if (stmt_tDBInput_3 != null) {
						stmt_tDBInput_3.close();
					}
					if (conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {

						log.debug("tDBInput_3 - Closing the connection to the database.");

						conn_tDBInput_3.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_3 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_3_NB_LINE", nb_line_tDBInput_3);
				log.debug("tDBInput_3 - Retrieved records count: " + nb_line_tDBInput_3 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_3 - " + ("Done."));

				ok_Hash.put("tDBInput_3", true);
				end_Hash.put("tDBInput_3", System.currentTimeMillis());

				/**
				 * [tDBInput_3 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_3 end ] start
				 */

				currentComponent = "tFileOutputDelimited_3";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_3 != null) {
						outtFileOutputDelimited_3.flush();
						outtFileOutputDelimited_3.close();
					}

					globalMap.put("tFileOutputDelimited_3_NB_LINE", nb_line_tFileOutputDelimited_3);
					globalMap.put("tFileOutputDelimited_3_FILE_NAME", fileName_tFileOutputDelimited_3);

				}

				resourceMap.put("finish_tFileOutputDelimited_3", true);

				log.debug("tFileOutputDelimited_3 - Written records count: " + nb_line_tFileOutputDelimited_3 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row28", 2, 0,
						"tDBInput_3", "tDBInput_3", "tAS400Input", "tFileOutputDelimited_3", "tFileOutputDelimited_3",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_3 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_3", true);
				end_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_3 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_3:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk15", 0, "ok");
			}

			tFileInputDelimited_3Process(globalMap);

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
				 * [tDBInput_3 finally ] start
				 */

				currentComponent = "tDBInput_3";

				/**
				 * [tDBInput_3 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_3 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_3";

				if (resourceMap.get("finish_tFileOutputDelimited_3") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_3 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_3");
						if (outtFileOutputDelimited_3 != null) {
							outtFileOutputDelimited_3.flush();
							outtFileOutputDelimited_3.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_3 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}

	public static class SETDTLStruct implements routines.system.IPersistableRow<SETDTLStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal ISETNO;

		public BigDecimal getISETNO() {
			return this.ISETNO;
		}

		public Boolean ISETNOIsNullable() {
			return true;
		}

		public Boolean ISETNOIsKey() {
			return false;
		}

		public Integer ISETNOLength() {
			return null;
		}

		public Integer ISETNOPrecision() {
			return null;
		}

		public String ISETNODefault() {

			return "";

		}

		public String ISETNOComment() {

			return "";

		}

		public String ISETNOPattern() {

			return "";

		}

		public String ISETNOOriginalDbColumnName() {

			return "ISETNO";

		}

		public BigDecimal ICMPNO;

		public BigDecimal getICMPNO() {
			return this.ICMPNO;
		}

		public Boolean ICMPNOIsNullable() {
			return true;
		}

		public Boolean ICMPNOIsKey() {
			return false;
		}

		public Integer ICMPNOLength() {
			return null;
		}

		public Integer ICMPNOPrecision() {
			return null;
		}

		public String ICMPNODefault() {

			return "";

		}

		public String ICMPNOComment() {

			return "";

		}

		public String ICMPNOPattern() {

			return "";

		}

		public String ICMPNOOriginalDbColumnName() {

			return "ICMPNO";

		}

		public Double ISETQT;

		public Double getISETQT() {
			return this.ISETQT;
		}

		public Boolean ISETQTIsNullable() {
			return true;
		}

		public Boolean ISETQTIsKey() {
			return false;
		}

		public Integer ISETQTLength() {
			return null;
		}

		public Integer ISETQTPrecision() {
			return null;
		}

		public String ISETQTDefault() {

			return "";

		}

		public String ISETQTComment() {

			return "";

		}

		public String ISETQTPattern() {

			return "";

		}

		public String ISETQTOriginalDbColumnName() {

			return "ISETQT";

		}

		public java.util.Date LOAD_DATE;

		public java.util.Date getLOAD_DATE() {
			return this.LOAD_DATE;
		}

		public Boolean LOAD_DATEIsNullable() {
			return true;
		}

		public Boolean LOAD_DATEIsKey() {
			return false;
		}

		public Integer LOAD_DATELength() {
			return null;
		}

		public Integer LOAD_DATEPrecision() {
			return null;
		}

		public String LOAD_DATEDefault() {

			return null;

		}

		public String LOAD_DATEComment() {

			return "";

		}

		public String LOAD_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String LOAD_DATEOriginalDbColumnName() {

			return "LOAD_DATE";

		}

		private java.util.Date readDate(ObjectInputStream dis) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(dis.readLong());
			}
			return dateReturn;
		}

		private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException {
			java.util.Date dateReturn = null;
			int length = 0;
			length = unmarshaller.readByte();
			if (length == -1) {
				dateReturn = null;
			} else {
				dateReturn = new Date(unmarshaller.readLong());
			}
			return dateReturn;
		}

		private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException {
			if (date1 == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeLong(date1.getTime());
			}
		}

		private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (date1 == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeLong(date1.getTime());
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Double

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISETQT);
				}

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Double

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISETQT);
				}

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ISETNO=" + String.valueOf(ISETNO));
			sb.append(",ICMPNO=" + String.valueOf(ICMPNO));
			sb.append(",ISETQT=" + String.valueOf(ISETQT));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ISETNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETNO);
			}

			sb.append("|");

			if (ICMPNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ICMPNO);
			}

			sb.append("|");

			if (ISETQT == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETQT);
			}

			sb.append("|");

			if (LOAD_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_DATE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(SETDTLStruct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL2 = new byte[0];

		public BigDecimal ISETNO;

		public BigDecimal getISETNO() {
			return this.ISETNO;
		}

		public Boolean ISETNOIsNullable() {
			return true;
		}

		public Boolean ISETNOIsKey() {
			return false;
		}

		public Integer ISETNOLength() {
			return null;
		}

		public Integer ISETNOPrecision() {
			return null;
		}

		public String ISETNODefault() {

			return "";

		}

		public String ISETNOComment() {

			return "";

		}

		public String ISETNOPattern() {

			return "";

		}

		public String ISETNOOriginalDbColumnName() {

			return "ISETNO";

		}

		public BigDecimal ICMPNO;

		public BigDecimal getICMPNO() {
			return this.ICMPNO;
		}

		public Boolean ICMPNOIsNullable() {
			return true;
		}

		public Boolean ICMPNOIsKey() {
			return false;
		}

		public Integer ICMPNOLength() {
			return null;
		}

		public Integer ICMPNOPrecision() {
			return null;
		}

		public String ICMPNODefault() {

			return "";

		}

		public String ICMPNOComment() {

			return "";

		}

		public String ICMPNOPattern() {

			return "";

		}

		public String ICMPNOOriginalDbColumnName() {

			return "ICMPNO";

		}

		public Double ISETQT;

		public Double getISETQT() {
			return this.ISETQT;
		}

		public Boolean ISETQTIsNullable() {
			return true;
		}

		public Boolean ISETQTIsKey() {
			return false;
		}

		public Integer ISETQTLength() {
			return null;
		}

		public Integer ISETQTPrecision() {
			return null;
		}

		public String ISETQTDefault() {

			return "";

		}

		public String ISETQTComment() {

			return "";

		}

		public String ISETQTPattern() {

			return "";

		}

		public String ISETQTOriginalDbColumnName() {

			return "ISETQT";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readDouble();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL2) {

				try {

					int length = 0;

					this.ISETNO = (BigDecimal) dis.readObject();

					this.ICMPNO = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ISETQT = null;
					} else {
						this.ISETQT = dis.readDouble();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Double

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISETQT);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ISETNO);

				// BigDecimal

				dos.writeObject(this.ICMPNO);

				// Double

				if (this.ISETQT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISETQT);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ISETNO=" + String.valueOf(ISETNO));
			sb.append(",ICMPNO=" + String.valueOf(ICMPNO));
			sb.append(",ISETQT=" + String.valueOf(ISETQT));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ISETNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETNO);
			}

			sb.append("|");

			if (ICMPNO == null) {
				sb.append("<null>");
			} else {
				sb.append(ICMPNO);
			}

			sb.append("|");

			if (ISETQT == null) {
				sb.append("<null>");
			} else {
				sb.append(ISETQT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row9Struct other) {

			int returnValue = -1;

			return returnValue;
		}

		private int checkNullsAndCompare(Object object1, Object object2) {
			int returnValue = 0;
			if (object1 instanceof Comparable && object2 instanceof Comparable) {
				returnValue = ((Comparable) object1).compareTo(object2);
			} else if (object1 != null && object2 != null) {
				returnValue = compareStrings(object1.toString(), object2.toString());
			} else if (object1 == null && object2 != null) {
				returnValue = 1;
			} else if (object1 != null && object2 == null) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}

			return returnValue;
		}

		private int compareStrings(String string1, String string2) {
			return string1.compareTo(string2);
		}

	}

	public void tFileInputDelimited_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_3");
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

				row9Struct row9 = new row9Struct();
				SETDTLStruct SETDTL = new SETDTLStruct();

				/**
				 * [tDBOutput_4 begin ] start
				 */

				ok_Hash.put("tDBOutput_4", false);
				start_Hash.put("tDBOutput_4", System.currentTimeMillis());

				currentComponent = "tDBOutput_4";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "SETDTL");

				int tos_count_tDBOutput_4 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_4", "tDBOutput_4", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_4 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_4 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_4 = (String) (restRequest_tDBOutput_4 != null
						? restRequest_tDBOutput_4.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_4 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_4 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_4 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_4 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_4
						.createRuntimeProperties();
				props_tDBOutput_4.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_4.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_4.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_4.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_4.setValue("useSchemaDatePattern", false);

				props_tDBOutput_4.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_4_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"rejectOutput\",\"fields\":[{", s);

						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_4_1_fisrt sst_tDBOutput_4_1_fisrt = new SchemaSettingTool_tDBOutput_4_1_fisrt();

				props_tDBOutput_4.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_4_1_fisrt.getSchemaValue()));

				props_tDBOutput_4.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_4.connection.setValue("useCustomRegion", false);

				props_tDBOutput_4.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_4.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_4.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_4.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_4.table.setValue("tableName", "INVENTORY_SET_FILE_SETDTL");

				props_tDBOutput_4.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_4.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_4.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_4.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_4.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_4.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_4_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"INVENTORY_SET_FILE_SETDTL\",\"fields\":[{", s);

						a("\"name\":\"ISETNO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ISETNO\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ICMPNO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ICMPNO\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ISETQT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISETQT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_4_2_fisrt sst_tDBOutput_4_2_fisrt = new SchemaSettingTool_tDBOutput_4_2_fisrt();

				props_tDBOutput_4.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_4_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_4.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_4 = props_tDBOutput_4.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_4 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_4 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_4.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_4);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_4.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_4 = props_tDBOutput_4.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_4 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_4 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_4.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_4);
					}
				}
				globalMap.put("tDBOutput_4_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_4);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_4 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_4_MAPPINGS_URL", mappings_url_tDBOutput_4);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_4 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_4";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_4 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_4 = null;
				topology_tDBOutput_4 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_4 = def_tDBOutput_4.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_4,
						topology_tDBOutput_4);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_4 = def_tDBOutput_4
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_4 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_4.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_4 = componentRuntime_tDBOutput_4
						.initialize(container_tDBOutput_4, props_tDBOutput_4);

				if (initVr_tDBOutput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_4.getMessage());
				}

				if (componentRuntime_tDBOutput_4 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_4 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_4;
					compDriverInitialization_tDBOutput_4.runAtDriver(container_tDBOutput_4);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_4 = null;
				if (componentRuntime_tDBOutput_4 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_4 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_4;
					if (doesNodeBelongToRequest_tDBOutput_4) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_4 = sourceOrSink_tDBOutput_4
								.validate(container_tDBOutput_4);
						if (vr_tDBOutput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_4.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_4 = null;
				if (sourceOrSink_tDBOutput_4 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_4 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_4;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_4 = sink_tDBOutput_4
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_4) {
						writeOperation_tDBOutput_4.initialize(container_tDBOutput_4);
					}
					writer_tDBOutput_4 = writeOperation_tDBOutput_4.createWriter(container_tDBOutput_4);
					if (doesNodeBelongToRequest_tDBOutput_4) {
						writer_tDBOutput_4.open("tDBOutput_4");
					}

					resourceMap.put("writer_tDBOutput_4", writer_tDBOutput_4);
				} // end of "sourceOrSink_tDBOutput_4 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_4 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_4
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_4 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_4 = props_tDBOutput_4.getSchema(c_tDBOutput_4, false);
				incomingEnforcer_tDBOutput_4 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_4);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_4 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_4 = null;

				/**
				 * [tDBOutput_4 begin ] stop
				 */

				/**
				 * [tMap_3 begin ] start
				 */

				ok_Hash.put("tMap_3", false);
				start_Hash.put("tMap_3", System.currentTimeMillis());

				currentComponent = "tMap_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

				int tos_count_tMap_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_3 = new StringBuilder();
							log4jParamters_tMap_3.append("Parameters:");
							log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_3.append(" | ");
							log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_3 - " + (log4jParamters_tMap_3));
						}
					}
					new BytesLimit65535_tMap_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_3", "tMap_3", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row9_tMap_3 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_3__Struct {
					java.util.Date var1;
				}
				Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_SETDTL_tMap_3 = 0;

				SETDTLStruct SETDTL_tmp = new SETDTLStruct();
// ###############################

				/**
				 * [tMap_3 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_3 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_3", false);
				start_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_3";

				int tos_count_tFileInputDelimited_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_3 = new StringBuilder();
							log4jParamters_tFileInputDelimited_3.append("Parameters:");
							log4jParamters_tFileInputDelimited_3
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/SETDTL.zip\"");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ISETNO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ICMPNO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ISETQT") + "}]");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							log4jParamters_tFileInputDelimited_3.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_3 - " + (log4jParamters_tFileInputDelimited_3));
						}
					}
					new BytesLimit65535_tFileInputDelimited_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_3", "tFileInputDelimited_3", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_3 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_3 = null;
				int limit_tFileInputDelimited_3 = -1;
				try {

					Object filename_tFileInputDelimited_3 = "/data/talend/data_repository/SETDTL.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_3 = null;
					try {
						if (filename_tFileInputDelimited_3 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_3 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_3));
						} else {
							zis_tFileInputDelimited_3 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_3))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());

						throw e;

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_3 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_3 = zis_tFileInputDelimited_3.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());

							throw e;

						}
						if (entry_tFileInputDelimited_3 == null) {
							break;
						}
						if (entry_tFileInputDelimited_3.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_3 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_3, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_3, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_3 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_3 != null && fid_tFileInputDelimited_3.nextRecord()) {
							rowstate_tFileInputDelimited_3.reset();

							row9 = null;

							boolean whetherReject_tFileInputDelimited_3 = false;
							row9 = new row9Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_3 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_3 = 0;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row9.ISETNO = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ISETNO", "row9", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row9.ISETNO = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 1;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row9.ICMPNO = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ICMPNO", "row9", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row9.ICMPNO = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 2;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row9.ISETQT = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ISETQT", "row9", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row9.ISETQT = null;

								}

								if (rowstate_tFileInputDelimited_3.getException() != null) {
									throw rowstate_tFileInputDelimited_3.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_3 = true;

								throw (e);

							}

							log.debug("tFileInputDelimited_3 - Retrieving the record "
									+ fid_tFileInputDelimited_3.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_3 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_3 main ] start
							 */

							currentComponent = "tFileInputDelimited_3";

							tos_count_tFileInputDelimited_3++;

							/**
							 * [tFileInputDelimited_3 main ] stop
							 */

							/**
							 * [tFileInputDelimited_3 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_3";

							/**
							 * [tFileInputDelimited_3 process_data_begin ] stop
							 */
// Start of branch "row9"
							if (row9 != null) {

								/**
								 * [tMap_3 main ] start
								 */

								currentComponent = "tMap_3";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row9", "tFileInputDelimited_3", "tFileInputDelimited_3",
										"tFileInputDelimited", "tMap_3", "tMap_3", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_3 = false;
								boolean mainRowRejected_tMap_3 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_3__Struct Var = Var__tMap_3;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									SETDTL = null;

// # Output table : 'SETDTL'
									count_SETDTL_tMap_3++;

									SETDTL_tmp.ISETNO = row9.ISETNO;
									SETDTL_tmp.ICMPNO = row9.ICMPNO;
									SETDTL_tmp.ISETQT = row9.ISETQT;
									SETDTL_tmp.LOAD_DATE = Var.var1;
									SETDTL = SETDTL_tmp;
									log.debug("tMap_3 - Outputting the record " + count_SETDTL_tMap_3
											+ " of the output table 'SETDTL'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_3 = false;

								tos_count_tMap_3++;

								/**
								 * [tMap_3 main ] stop
								 */

								/**
								 * [tMap_3 process_data_begin ] start
								 */

								currentComponent = "tMap_3";

								/**
								 * [tMap_3 process_data_begin ] stop
								 */
// Start of branch "SETDTL"
								if (SETDTL != null) {

									/**
									 * [tDBOutput_4 main ] start
									 */

									currentComponent = "tDBOutput_4";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "SETDTL", "tMap_3", "tMap_3", "tMap", "tDBOutput_4", "tDBOutput_4",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("SETDTL - " + (SETDTL == null ? "" : SETDTL.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_4 != null) {
										incomingEnforcer_tDBOutput_4.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4
											.getRuntimeSchema().getField("ISETNO") != null) {
										incomingEnforcer_tDBOutput_4.put("ISETNO", SETDTL.ISETNO);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4
											.getRuntimeSchema().getField("ICMPNO") != null) {
										incomingEnforcer_tDBOutput_4.put("ICMPNO", SETDTL.ICMPNO);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4
											.getRuntimeSchema().getField("ISETQT") != null) {
										incomingEnforcer_tDBOutput_4.put("ISETQT", SETDTL.ISETQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_4.put("LOAD_DATE", SETDTL.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_4 = null;
									if (incomingEnforcer_tDBOutput_4 != null) {
										data_tDBOutput_4 = incomingEnforcer_tDBOutput_4.getCurrentRecord();
									}

									if (writer_tDBOutput_4 != null && data_tDBOutput_4 != null) {
										writer_tDBOutput_4.write(data_tDBOutput_4);
									}

									nb_line_tDBOutput_4++;

									tos_count_tDBOutput_4++;

									/**
									 * [tDBOutput_4 main ] stop
									 */

									/**
									 * [tDBOutput_4 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_4";

									/**
									 * [tDBOutput_4 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_4 process_data_end ] start
									 */

									currentComponent = "tDBOutput_4";

									/**
									 * [tDBOutput_4 process_data_end ] stop
									 */

								} // End of branch "SETDTL"

								/**
								 * [tMap_3 process_data_end ] start
								 */

								currentComponent = "tMap_3";

								/**
								 * [tMap_3 process_data_end ] stop
								 */

							} // End of branch "row9"

							/**
							 * [tFileInputDelimited_3 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_3";

							/**
							 * [tFileInputDelimited_3 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_3 end ] start
							 */

							currentComponent = "tFileInputDelimited_3";

						}
						nb_line_tFileInputDelimited_3 += fid_tFileInputDelimited_3.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/SETDTL.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_3 != null) {
							fid_tFileInputDelimited_3.close();
						}
					}
					if (fid_tFileInputDelimited_3 != null) {
						globalMap.put("tFileInputDelimited_3_NB_LINE", nb_line_tFileInputDelimited_3);
					}

					log.info("tFileInputDelimited_3- Retrieved records count: " + nb_line_tFileInputDelimited_3 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_3 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_3", true);
				end_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_3 end ] stop
				 */

				/**
				 * [tMap_3 end ] start
				 */

				currentComponent = "tMap_3";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'SETDTL': " + count_SETDTL_tMap_3 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
						"tFileInputDelimited_3", "tFileInputDelimited_3", "tFileInputDelimited", "tMap_3", "tMap_3",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_3 - " + ("Done."));

				ok_Hash.put("tMap_3", true);
				end_Hash.put("tMap_3", System.currentTimeMillis());

				/**
				 * [tMap_3 end ] stop
				 */

				/**
				 * [tDBOutput_4 end ] start
				 */

				currentComponent = "tDBOutput_4";

// end of generic

				resourceMap.put("finish_tDBOutput_4", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_4 = null;
				if (writer_tDBOutput_4 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_4 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_4
							.close();
					resultMap_tDBOutput_4 = writer_tDBOutput_4.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_4), container_tDBOutput_4);
				}
				if (resultMap_tDBOutput_4 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_4 : resultMap_tDBOutput_4.entrySet()) {
						switch (entry_tDBOutput_4.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_4.setComponentData("tDBOutput_4", "ERROR_MESSAGE",
									entry_tDBOutput_4.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_LINE",
									entry_tDBOutput_4.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_SUCCESS",
									entry_tDBOutput_4.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_REJECT",
									entry_tDBOutput_4.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_4 = new StringBuilder();
							for (int i_tDBOutput_4 = 0; i_tDBOutput_4 < entry_tDBOutput_4.getKey()
									.length(); i_tDBOutput_4++) {
								char ch_tDBOutput_4 = entry_tDBOutput_4.getKey().charAt(i_tDBOutput_4);
								if (Character.isUpperCase(ch_tDBOutput_4) && i_tDBOutput_4 > 0) {
									studio_key_tDBOutput_4.append('_');
								}
								studio_key_tDBOutput_4.append(ch_tDBOutput_4);
							}
							container_tDBOutput_4.setComponentData("tDBOutput_4",
									studio_key_tDBOutput_4.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_4.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "SETDTL", 2, 0, "tMap_3",
						"tMap_3", "tMap", "tDBOutput_4", "tDBOutput_4", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_4", true);
				end_Hash.put("tDBOutput_4", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tFileDelete_4Process(globalMap);

				/**
				 * [tDBOutput_4 end ] stop
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
				 * [tFileInputDelimited_3 finally ] start
				 */

				currentComponent = "tFileInputDelimited_3";

				/**
				 * [tFileInputDelimited_3 finally ] stop
				 */

				/**
				 * [tMap_3 finally ] start
				 */

				currentComponent = "tMap_3";

				/**
				 * [tMap_3 finally ] stop
				 */

				/**
				 * [tDBOutput_4 finally ] start
				 */

				currentComponent = "tDBOutput_4";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_4") == null) {
					if (resourceMap.get("writer_tDBOutput_4") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_4"))
									.close();
						} catch (java.io.IOException e_tDBOutput_4) {
							String errorMessage_tDBOutput_4 = "failed to release the resource in tDBOutput_4 :"
									+ e_tDBOutput_4.getMessage();
							System.err.println(errorMessage_tDBOutput_4);
						}
					}
				}

				/**
				 * [tDBOutput_4 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 1);
	}

	public void tFileDelete_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileDelete_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_4");
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
				 * [tFileDelete_4 begin ] start
				 */

				ok_Hash.put("tFileDelete_4", false);
				start_Hash.put("tFileDelete_4", System.currentTimeMillis());

				currentComponent = "tFileDelete_4";

				int tos_count_tFileDelete_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileDelete_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileDelete_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileDelete_4 = new StringBuilder();
							log4jParamters_tFileDelete_4.append("Parameters:");
							log4jParamters_tFileDelete_4
									.append("PATH" + " = " + "\"/data/talend/data_repository/SETDTL.zip\"");
							log4jParamters_tFileDelete_4.append(" | ");
							log4jParamters_tFileDelete_4.append("FAILON" + " = " + "true");
							log4jParamters_tFileDelete_4.append(" | ");
							log4jParamters_tFileDelete_4.append("FOLDER_FILE" + " = " + "true");
							log4jParamters_tFileDelete_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileDelete_4 - " + (log4jParamters_tFileDelete_4));
						}
					}
					new BytesLimit65535_tFileDelete_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileDelete_4", "tFileDelete_4", "tFileDelete");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tFileDelete_4 begin ] stop
				 */

				/**
				 * [tFileDelete_4 main ] start
				 */

				currentComponent = "tFileDelete_4";

				final StringBuffer log4jSb_tFileDelete_4 = new StringBuffer();

				class DeleteFoldertFileDelete_4 {
					/**
					 * delete all the sub-files in 'file'
					 * 
					 * @param file
					 */
					public boolean delete(java.io.File file) {
						java.io.File[] files = file.listFiles();
						for (int i = 0; i < files.length; i++) {
							if (files[i].isFile()) {
								files[i].delete();
							} else if (files[i].isDirectory()) {
								if (!files[i].delete()) {
									delete(files[i]);
								}
							}
						}
						deleteDirectory(file);
						return file.delete();
					}

					/**
					 * delete all the sub-folders in 'file'
					 * 
					 * @param file
					 */
					private void deleteDirectory(java.io.File file) {
						java.io.File[] filed = file.listFiles();
						for (int i = 0; i < filed.length; i++) {
							if (filed[i].isDirectory()) {
								deleteDirectory(filed[i]);
							}
							filed[i].delete();
						}
					}

				}
				java.io.File path_tFileDelete_4 = new java.io.File("/data/talend/data_repository/SETDTL.zip");
				if (path_tFileDelete_4.exists()) {
					if (path_tFileDelete_4.isFile()) {
						if (path_tFileDelete_4.delete()) {
							globalMap.put("tFileDelete_4_CURRENT_STATUS", "File deleted.");
							log.info("tFileDelete_4 - File : " + path_tFileDelete_4.getAbsolutePath() + " is deleted.");
						} else {
							globalMap.put("tFileDelete_4_CURRENT_STATUS", "No file deleted.");
							throw new RuntimeException(
									"The file " + path_tFileDelete_4.getAbsolutePath() + " can't be deleted.");
						}
					} else if (path_tFileDelete_4.isDirectory()) {
						DeleteFoldertFileDelete_4 dftFileDelete_4 = new DeleteFoldertFileDelete_4();
						if (dftFileDelete_4.delete(path_tFileDelete_4)) {
							globalMap.put("tFileDelete_4_CURRENT_STATUS", "Path deleted.");
							log.info("tFileDelete_4 - Directory : " + path_tFileDelete_4.getAbsolutePath()
									+ " is deleted.");
						} else {
							globalMap.put("tFileDelete_4_CURRENT_STATUS", "No path deleted.");
							throw new RuntimeException(
									"The directory " + path_tFileDelete_4.getAbsolutePath() + " can not be deleted.");
						}
					}
				} else {
					globalMap.put("tFileDelete_4_CURRENT_STATUS", "File or path does not exist or is invalid.");
					throw new RuntimeException("File or path does not exist or is invalid.");
				}
				globalMap.put("tFileDelete_4_DELETE_PATH", "/data/talend/data_repository/SETDTL.zip");

				tos_count_tFileDelete_4++;

				/**
				 * [tFileDelete_4 main ] stop
				 */

				/**
				 * [tFileDelete_4 process_data_begin ] start
				 */

				currentComponent = "tFileDelete_4";

				/**
				 * [tFileDelete_4 process_data_begin ] stop
				 */

				/**
				 * [tFileDelete_4 process_data_end ] start
				 */

				currentComponent = "tFileDelete_4";

				/**
				 * [tFileDelete_4 process_data_end ] stop
				 */

				/**
				 * [tFileDelete_4 end ] start
				 */

				currentComponent = "tFileDelete_4";

				if (log.isDebugEnabled())
					log.debug("tFileDelete_4 - " + ("Done."));

				ok_Hash.put("tFileDelete_4", true);
				end_Hash.put("tFileDelete_4", System.currentTimeMillis());

				/**
				 * [tFileDelete_4 end ] stop
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
				 * [tFileDelete_4 finally ] start
				 */

				currentComponent = "tFileDelete_4";

				/**
				 * [tFileDelete_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileDelete_4_SUBPROCESS_STATE", 1);
	}

	public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPostjob_1");
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
				 * [tPostjob_1 begin ] start
				 */

				ok_Hash.put("tPostjob_1", false);
				start_Hash.put("tPostjob_1", System.currentTimeMillis());

				currentComponent = "tPostjob_1";

				int tos_count_tPostjob_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPostjob_1 begin ] stop
				 */

				/**
				 * [tPostjob_1 main ] start
				 */

				currentComponent = "tPostjob_1";

				tos_count_tPostjob_1++;

				/**
				 * [tPostjob_1 main ] stop
				 */

				/**
				 * [tPostjob_1 process_data_begin ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_begin ] stop
				 */

				/**
				 * [tPostjob_1 process_data_end ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 process_data_end ] stop
				 */

				/**
				 * [tPostjob_1 end ] start
				 */

				currentComponent = "tPostjob_1";

				ok_Hash.put("tPostjob_1", true);
				end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBClose_1Process(globalMap);

				/**
				 * [tPostjob_1 end ] stop
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
				 * [tPostjob_1 finally ] start
				 */

				currentComponent = "tPostjob_1";

				/**
				 * [tPostjob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}

	public void tDBClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBClose_1");
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
				 * [tDBClose_1 begin ] start
				 */

				ok_Hash.put("tDBClose_1", false);
				start_Hash.put("tDBClose_1", System.currentTimeMillis());

				currentComponent = "tDBClose_1";

				int tos_count_tDBClose_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tSnowflakeClose");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBClose_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBClose_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBClose_1 = (String) (restRequest_tDBClose_1 != null
						? restRequest_tDBClose_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBClose_1 = new org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBClose_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBClose_1 = null;

				org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties props_tDBClose_1 = (org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties) def_tDBClose_1
						.createRuntimeProperties();
				props_tDBClose_1.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBClose_1.referencedComponent.setValue("componentInstanceId", "tDBClose_1");

				props_tDBClose_1.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBClose_1.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBClose_1 = props_tDBClose_1.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBClose_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBClose_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBClose_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBClose_1.referencedComponent.setReference(referencedComponentProperties_tDBClose_1);
					}
				}
				globalMap.put("tDBClose_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBClose_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBClose_1 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBClose_1_MAPPINGS_URL", mappings_url_tDBClose_1);

				org.talend.components.api.container.RuntimeContainer container_tDBClose_1 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBClose_1";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBClose_1 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBClose_1 = null;
				topology_tDBClose_1 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBClose_1 = def_tDBClose_1.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBClose_1,
						topology_tDBClose_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBClose_1 = def_tDBClose_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBClose_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBClose_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBClose_1 = componentRuntime_tDBClose_1
						.initialize(container_tDBClose_1, props_tDBClose_1);

				if (initVr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBClose_1.getMessage());
				}

				if (componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBClose_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBClose_1;
					compDriverInitialization_tDBClose_1.runAtDriver(container_tDBClose_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBClose_1 = null;
				if (componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBClose_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBClose_1;
					if (doesNodeBelongToRequest_tDBClose_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBClose_1 = sourceOrSink_tDBClose_1
								.validate(container_tDBClose_1);
						if (vr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBClose_1.getMessage());
						}
					}
				}

				/**
				 * [tDBClose_1 begin ] stop
				 */

				/**
				 * [tDBClose_1 main ] start
				 */

				currentComponent = "tDBClose_1";

				tos_count_tDBClose_1++;

				/**
				 * [tDBClose_1 main ] stop
				 */

				/**
				 * [tDBClose_1 process_data_begin ] start
				 */

				currentComponent = "tDBClose_1";

				/**
				 * [tDBClose_1 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_1 process_data_end ] start
				 */

				currentComponent = "tDBClose_1";

				/**
				 * [tDBClose_1 process_data_end ] stop
				 */

				/**
				 * [tDBClose_1 end ] start
				 */

				currentComponent = "tDBClose_1";

// end of generic

				ok_Hash.put("tDBClose_1", true);
				end_Hash.put("tDBClose_1", System.currentTimeMillis());

				/**
				 * [tDBClose_1 end ] stop
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
				 * [tDBClose_1 finally ] start
				 */

				currentComponent = "tDBClose_1";

// finally of generic

				/**
				 * [tDBClose_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}

	public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_1");
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
				 * [tPrejob_1 begin ] start
				 */

				ok_Hash.put("tPrejob_1", false);
				start_Hash.put("tPrejob_1", System.currentTimeMillis());

				currentComponent = "tPrejob_1";

				int tos_count_tPrejob_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPrejob_1 begin ] stop
				 */

				/**
				 * [tPrejob_1 main ] start
				 */

				currentComponent = "tPrejob_1";

				tos_count_tPrejob_1++;

				/**
				 * [tPrejob_1 main ] stop
				 */

				/**
				 * [tPrejob_1 process_data_begin ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_begin ] stop
				 */

				/**
				 * [tPrejob_1 process_data_end ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 process_data_end ] stop
				 */

				/**
				 * [tPrejob_1 end ] start
				 */

				currentComponent = "tPrejob_1";

				ok_Hash.put("tPrejob_1", true);
				end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_1Process(globalMap);

				/**
				 * [tPrejob_1 end ] stop
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
				 * [tPrejob_1 finally ] start
				 */

				currentComponent = "tPrejob_1";

				/**
				 * [tPrejob_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_1");
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
				 * [tDBConnection_1 begin ] start
				 */

				ok_Hash.put("tDBConnection_1", false);
				start_Hash.put("tDBConnection_1", System.currentTimeMillis());

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

				int tos_count_tDBConnection_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "INVENTORY", "tSnowflakeConnection");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBConnection_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBConnection_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBConnection_1 = (String) (restRequest_tDBConnection_1 != null
						? restRequest_tDBConnection_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBConnection_1 = new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBConnection_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBConnection_1 = null;

				org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_1 = (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_1
						.createRuntimeProperties();
				props_tDBConnection_1.setValue("loginTimeout", 15);

				props_tDBConnection_1.setValue("account", "vitaminshoppe");

				props_tDBConnection_1.setValue("regionID", "us-east-1");

				props_tDBConnection_1.setValue("useCustomRegion", false);

				props_tDBConnection_1.setValue("authenticationType",
						org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);

				props_tDBConnection_1.setValue("warehouse", "VSI_WH_XS");

				props_tDBConnection_1.setValue("db", "PROD_DATA");

				props_tDBConnection_1.setValue("schemaName", "INVENTORY");

				props_tDBConnection_1.setValue("role", "sysadmin");

				props_tDBConnection_1.setValue("jdbcParameters", "");

				props_tDBConnection_1.setValue("autoCommit", true);

				props_tDBConnection_1.userPassword.setValue("useAuth", false);

				props_tDBConnection_1.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_1.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:6odU4/pJkBmR8Cud4qFl4Yb2JgSuuy7LTOiZ2LdEvRvIq+lR"));

				props_tDBConnection_1.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_1.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBConnection_1 = props_tDBConnection_1.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBConnection_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBConnection_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBConnection_1.referencedComponent
								.setReference(referencedComponentProperties_tDBConnection_1);
					}
				}
				globalMap.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBConnection_1 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBConnection_1_MAPPINGS_URL", mappings_url_tDBConnection_1);

				org.talend.components.api.container.RuntimeContainer container_tDBConnection_1 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBConnection_1";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBConnection_1 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBConnection_1 = null;
				topology_tDBConnection_1 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBConnection_1 = def_tDBConnection_1.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_1,
						topology_tDBConnection_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_1 = def_tDBConnection_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBConnection_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBConnection_1 = componentRuntime_tDBConnection_1
						.initialize(container_tDBConnection_1, props_tDBConnection_1);

				if (initVr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBConnection_1.getMessage());
				}

				if (componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBConnection_1;
					compDriverInitialization_tDBConnection_1.runAtDriver(container_tDBConnection_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_1 = null;
				if (componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBConnection_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBConnection_1;
					if (doesNodeBelongToRequest_tDBConnection_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBConnection_1 = sourceOrSink_tDBConnection_1
								.validate(container_tDBConnection_1);
						if (vr_tDBConnection_1
								.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBConnection_1.getMessage());
						}
					}
				}

				/**
				 * [tDBConnection_1 begin ] stop
				 */

				/**
				 * [tDBConnection_1 main ] start
				 */

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

				tos_count_tDBConnection_1++;

				/**
				 * [tDBConnection_1 main ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

				/**
				 * [tDBConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_end ] start
				 */

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

				/**
				 * [tDBConnection_1 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_1 end ] start
				 */

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

// end of generic

				ok_Hash.put("tDBConnection_1", true);
				end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				/**
				 * [tDBConnection_1 end ] stop
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
				 * [tDBConnection_1 finally ] start
				 */

				currentComponent = "tDBConnection_1";

				cLabel = "INVENTORY";

// finally of generic

				/**
				 * [tDBConnection_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
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

	private SyncInt runningThreadCount = new SyncInt();

	private class SyncInt {
		private int count = 0;

		public synchronized void add(int i) {
			count += i;
		}

		public synchronized int getCount() {
			return count;
		}
	}

	protected PropertiesWithType context_param = new PropertiesWithType();
	public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

	public String status = "";

	private final org.talend.components.common.runtime.SharedConnectionsPool connectionPool = new org.talend.components.common.runtime.SharedConnectionsPool() {
		public java.sql.Connection getDBConnection(String dbDriver, String url, String userName, String password,
				String dbConnectionName) throws ClassNotFoundException, java.sql.SQLException {
			return SharedDBConnection.getDBConnection(dbDriver, url, userName, password, dbConnectionName);
		}

		public java.sql.Connection getDBConnection(String dbDriver, String url, String dbConnectionName)
				throws ClassNotFoundException, java.sql.SQLException {
			return SharedDBConnection.getDBConnection(dbDriver, url, dbConnectionName);
		}
	};

	private static final String GLOBAL_CONNECTION_POOL_KEY = "GLOBAL_CONNECTION_POOL";

	{
		globalMap.put(GLOBAL_CONNECTION_POOL_KEY, connectionPool);
	}

	private final static java.util.Properties jobInfo = new java.util.Properties();
	private final static java.util.Map<String, String> mdcInfo = new java.util.HashMap<>();

	public static void main(String[] args) {
		final TTAALLCL2 TTAALLCL2Class = new TTAALLCL2();

		int exitCode = TTAALLCL2Class.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TTAALLCL2' - Done.");
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
		log.info("TalendJob: 'TTAALLCL2' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_nEGQgAVwEeqgh6rCafRRhA");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-28T14:26:32.931347700Z");

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
			java.io.InputStream inContext = TTAALLCL2.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/ttaallcl2_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TTAALLCL2.class.getClassLoader()
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
					context.setContextType("jda_host_name", "id_String");
					if (context.getStringValue("jda_host_name") == null) {
						context.jda_host_name = null;
					} else {
						context.jda_host_name = (String) context.getProperty("jda_host_name");
					}
					context.setContextType("jda_mm_lib", "id_String");
					if (context.getStringValue("jda_mm_lib") == null) {
						context.jda_mm_lib = null;
					} else {
						context.jda_mm_lib = (String) context.getProperty("jda_mm_lib");
					}
					context.setContextType("jda_user_name", "id_String");
					if (context.getStringValue("jda_user_name") == null) {
						context.jda_user_name = null;
					} else {
						context.jda_user_name = (String) context.getProperty("jda_user_name");
					}
					context.setContextType("jda_password", "id_Password");
					if (context.getStringValue("jda_password") == null) {
						context.jda_password = null;
					} else {
						String pwd_jda_password_value = context.getProperty("jda_password");
						context.jda_password = null;
						if (pwd_jda_password_value != null) {
							if (context_param.containsKey("jda_password")) {// no need to decrypt if it come from
																			// program argument or parent job runtime
								context.jda_password = pwd_jda_password_value;
							} else if (!pwd_jda_password_value.isEmpty()) {
								try {
									context.jda_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_jda_password_value);
									context.put("jda_password", context.jda_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("SF_account", "id_String");
					if (context.getStringValue("SF_account") == null) {
						context.SF_account = null;
					} else {
						context.SF_account = (String) context.getProperty("SF_account");
					}
					context.setContextType("SF_prod_database", "id_String");
					if (context.getStringValue("SF_prod_database") == null) {
						context.SF_prod_database = null;
					} else {
						context.SF_prod_database = (String) context.getProperty("SF_prod_database");
					}
					context.setContextType("SF_password", "id_Password");
					if (context.getStringValue("SF_password") == null) {
						context.SF_password = null;
					} else {
						String pwd_SF_password_value = context.getProperty("SF_password");
						context.SF_password = null;
						if (pwd_SF_password_value != null) {
							if (context_param.containsKey("SF_password")) {// no need to decrypt if it come from program
																			// argument or parent job runtime
								context.SF_password = pwd_SF_password_value;
							} else if (!pwd_SF_password_value.isEmpty()) {
								try {
									context.SF_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_SF_password_value);
									context.put("SF_password", context.SF_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("SF_fin_schema", "id_String");
					if (context.getStringValue("SF_fin_schema") == null) {
						context.SF_fin_schema = null;
					} else {
						context.SF_fin_schema = (String) context.getProperty("SF_fin_schema");
					}
					context.setContextType("SF_user_id", "id_String");
					if (context.getStringValue("SF_user_id") == null) {
						context.SF_user_id = null;
					} else {
						context.SF_user_id = (String) context.getProperty("SF_user_id");
					}
					context.setContextType("SF_warehouse", "id_String");
					if (context.getStringValue("SF_warehouse") == null) {
						context.SF_warehouse = null;
					} else {
						context.SF_warehouse = (String) context.getProperty("SF_warehouse");
					}
					context.setContextType("sql_server_database", "id_String");
					if (context.getStringValue("sql_server_database") == null) {
						context.sql_server_database = null;
					} else {
						context.sql_server_database = (String) context.getProperty("sql_server_database");
					}
					context.setContextType("sql_server_host", "id_String");
					if (context.getStringValue("sql_server_host") == null) {
						context.sql_server_host = null;
					} else {
						context.sql_server_host = (String) context.getProperty("sql_server_host");
					}
					context.setContextType("sql_server_password", "id_Password");
					if (context.getStringValue("sql_server_password") == null) {
						context.sql_server_password = null;
					} else {
						String pwd_sql_server_password_value = context.getProperty("sql_server_password");
						context.sql_server_password = null;
						if (pwd_sql_server_password_value != null) {
							if (context_param.containsKey("sql_server_password")) {// no need to decrypt if it come from
																					// program argument or parent job
																					// runtime
								context.sql_server_password = pwd_sql_server_password_value;
							} else if (!pwd_sql_server_password_value.isEmpty()) {
								try {
									context.sql_server_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_sql_server_password_value);
									context.put("sql_server_password", context.sql_server_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("sql_server_port", "id_String");
					if (context.getStringValue("sql_server_port") == null) {
						context.sql_server_port = null;
					} else {
						context.sql_server_port = (String) context.getProperty("sql_server_port");
					}
					context.setContextType("sql_server_schema", "id_String");
					if (context.getStringValue("sql_server_schema") == null) {
						context.sql_server_schema = null;
					} else {
						context.sql_server_schema = (String) context.getProperty("sql_server_schema");
					}
					context.setContextType("sql_server_user_id", "id_String");
					if (context.getStringValue("sql_server_user_id") == null) {
						context.sql_server_user_id = null;
					} else {
						context.sql_server_user_id = (String) context.getProperty("sql_server_user_id");
					}
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
			if (parentContextMap.containsKey("jda_host_name")) {
				context.jda_host_name = (String) parentContextMap.get("jda_host_name");
			}
			if (parentContextMap.containsKey("jda_mm_lib")) {
				context.jda_mm_lib = (String) parentContextMap.get("jda_mm_lib");
			}
			if (parentContextMap.containsKey("jda_user_name")) {
				context.jda_user_name = (String) parentContextMap.get("jda_user_name");
			}
			if (parentContextMap.containsKey("jda_password")) {
				context.jda_password = (java.lang.String) parentContextMap.get("jda_password");
			}
			if (parentContextMap.containsKey("SF_account")) {
				context.SF_account = (String) parentContextMap.get("SF_account");
			}
			if (parentContextMap.containsKey("SF_prod_database")) {
				context.SF_prod_database = (String) parentContextMap.get("SF_prod_database");
			}
			if (parentContextMap.containsKey("SF_password")) {
				context.SF_password = (java.lang.String) parentContextMap.get("SF_password");
			}
			if (parentContextMap.containsKey("SF_fin_schema")) {
				context.SF_fin_schema = (String) parentContextMap.get("SF_fin_schema");
			}
			if (parentContextMap.containsKey("SF_user_id")) {
				context.SF_user_id = (String) parentContextMap.get("SF_user_id");
			}
			if (parentContextMap.containsKey("SF_warehouse")) {
				context.SF_warehouse = (String) parentContextMap.get("SF_warehouse");
			}
			if (parentContextMap.containsKey("sql_server_database")) {
				context.sql_server_database = (String) parentContextMap.get("sql_server_database");
			}
			if (parentContextMap.containsKey("sql_server_host")) {
				context.sql_server_host = (String) parentContextMap.get("sql_server_host");
			}
			if (parentContextMap.containsKey("sql_server_password")) {
				context.sql_server_password = (java.lang.String) parentContextMap.get("sql_server_password");
			}
			if (parentContextMap.containsKey("sql_server_port")) {
				context.sql_server_port = (String) parentContextMap.get("sql_server_port");
			}
			if (parentContextMap.containsKey("sql_server_schema")) {
				context.sql_server_schema = (String) parentContextMap.get("sql_server_schema");
			}
			if (parentContextMap.containsKey("sql_server_user_id")) {
				context.sql_server_user_id = (String) parentContextMap.get("sql_server_user_id");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("jda_password");
		parametersToEncrypt.add("SF_password");
		parametersToEncrypt.add("sql_server_password");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, ContextProperties.class, parametersToEncrypt));

		org.slf4j.MDC.put("_context", contextStr);
		log.info("TalendJob: 'TTAALLCL2' - Started.");
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

		try {
			errorCode = null;
			tPrejob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_1) {
			globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

			e_tPrejob_1.printStackTrace();

		}

		if (enableLogStash) {
			talendJobLog.addJobStartMessage();
			try {
				talendJobLogProcess(globalMap);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		this.globalResumeTicket = false;// to run others jobs
		final Thread launchingThread = Thread.currentThread();
		runningThreadCount.add(1);
		new Thread() {
			public void run() {
				mdcInfo.forEach(org.slf4j.MDC::put);

				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

				try {
					((java.util.Map) threadLocal.get()).put("errorCode", null);
					tParallelize_1Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
						((java.util.Map) threadLocal.get()).put("status", "end");
					}
				} catch (TalendException e_tParallelize_1) {
					globalMap.put("tParallelize_1_SUBPROCESS_STATE", -1);

					e_tParallelize_1.printStackTrace();

				} catch (java.lang.Error e_tParallelize_1) {
					globalMap.put("tParallelize_1_SUBPROCESS_STATE", -1);
					((java.util.Map) threadLocal.get()).put("status", "failure");
					throw e_tParallelize_1;

				} finally {
					Integer localErrorCode = (Integer) (((java.util.Map) threadLocal.get()).get("errorCode"));
					String localStatus = (String) (((java.util.Map) threadLocal.get()).get("status"));
					if (localErrorCode != null) {
						if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
							errorCode = localErrorCode;
						}
					}
					if (!status.equals("failure")) {
						status = localStatus;
					}

					if ("true".equals(((java.util.Map) threadLocal.get()).get("JobInterrupted"))) {
						launchingThread.interrupt();
					}

					runningThreadCount.add(-1);
				}
			}
		}.start();

		boolean interrupted = false;
		while (runningThreadCount.getCount() > 0) {
			try {
				Thread.sleep(10);
			} catch (java.lang.InterruptedException e) {
				interrupted = true;
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}

		if (interrupted) {
			Thread.currentThread().interrupt();
		}

		this.globalResumeTicket = true;// to run tPostJob

		try {
			errorCode = null;
			tPostjob_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPostjob_1) {
			globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

			e_tPostjob_1.printStackTrace();

		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TTAALLCL2");
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

		Integer localErrorCode = (Integer) (((java.util.Map) threadLocal.get()).get("errorCode"));
		String localStatus = (String) (((java.util.Map) threadLocal.get()).get("status"));
		if (localErrorCode != null) {
			if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
				errorCode = localErrorCode;
			}
		}
		if (localStatus != null && !status.equals("failure")) {
			status = localStatus;
		}

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
		log.info("TalendJob: 'TTAALLCL2' - Finished - status: " + status + " returnCode: " + returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {

	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("tDBConnection_1_connection", globalMap.get("tDBConnection_1_connection"));
		connections.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES",
				globalMap.get("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES"));

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
 * 757887 characters generated by Talend Cloud Data Management Platform on the
 * June 28, 2023 at 10:26:32 AM EDT
 ************************************************************************************************/