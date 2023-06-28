
package at_talend_jobs.sql_etl_daily_truncate_reload_tables_0_1;

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
 * Job: SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.class);

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
	private final String jobName = "SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES";
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
			"_GvRmIAagEeqS3P9meBs8cg", "0.1");
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
					SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.this,
									new Object[] { e, currentComponent, globalMap });
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

	public void tDBClose_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_14_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_14_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_14_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_14_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_24_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_24_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_24_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tParallelize_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBConnection_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_14_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_24_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tParallelize_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPostjob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

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
								"enc:routine.encryption.key.v1:eQzhIxvUfTqfzRsRKDslKbeoe6501orBePUOd9CyZx+UWjGr"));

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBConnection_2Process(globalMap);

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

	public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_2");
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
				 * [tDBConnection_2 begin ] start
				 */

				ok_Hash.put("tDBConnection_2", false);
				start_Hash.put("tDBConnection_2", System.currentTimeMillis());

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

				int tos_count_tDBConnection_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "FINANCE", "tSnowflakeConnection");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBConnection_2 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBConnection_2 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBConnection_2 = (String) (restRequest_tDBConnection_2 != null
						? restRequest_tDBConnection_2.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBConnection_2 = new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBConnection_2 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBConnection_2 = null;

				org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_2 = (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_2
						.createRuntimeProperties();
				props_tDBConnection_2.setValue("loginTimeout", 15);

				props_tDBConnection_2.setValue("account", "vitaminshoppe");

				props_tDBConnection_2.setValue("regionID", "us-east-1");

				props_tDBConnection_2.setValue("useCustomRegion", false);

				props_tDBConnection_2.setValue("authenticationType",
						org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);

				props_tDBConnection_2.setValue("warehouse", "VSI_WH_XS");

				props_tDBConnection_2.setValue("db", "PROD_DATA");

				props_tDBConnection_2.setValue("schemaName", "FINANCE");

				props_tDBConnection_2.setValue("role", "sysadmin");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:yXE3Vk5Nk0fhEGYyJu2Gbv9Ecgto/+yEPwY0ZQjxSIJa7O5T"));

				props_tDBConnection_2.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_2.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBConnection_2 = props_tDBConnection_2.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBConnection_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBConnection_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBConnection_2.referencedComponent
								.setReference(referencedComponentProperties_tDBConnection_2);
					}
				}
				globalMap.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_2);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBConnection_2 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBConnection_2_MAPPINGS_URL", mappings_url_tDBConnection_2);

				org.talend.components.api.container.RuntimeContainer container_tDBConnection_2 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBConnection_2";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBConnection_2 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBConnection_2 = null;
				topology_tDBConnection_2 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBConnection_2 = def_tDBConnection_2.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_2,
						topology_tDBConnection_2);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_2 = def_tDBConnection_2
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_2 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBConnection_2.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBConnection_2 = componentRuntime_tDBConnection_2
						.initialize(container_tDBConnection_2, props_tDBConnection_2);

				if (initVr_tDBConnection_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBConnection_2.getMessage());
				}

				if (componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBConnection_2;
					compDriverInitialization_tDBConnection_2.runAtDriver(container_tDBConnection_2);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_2 = null;
				if (componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBConnection_2 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBConnection_2;
					if (doesNodeBelongToRequest_tDBConnection_2) {
						org.talend.daikon.properties.ValidationResult vr_tDBConnection_2 = sourceOrSink_tDBConnection_2
								.validate(container_tDBConnection_2);
						if (vr_tDBConnection_2
								.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBConnection_2.getMessage());
						}
					}
				}

				/**
				 * [tDBConnection_2 begin ] stop
				 */

				/**
				 * [tDBConnection_2 main ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

				tos_count_tDBConnection_2++;

				/**
				 * [tDBConnection_2 main ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

				/**
				 * [tDBConnection_2 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_end ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

				/**
				 * [tDBConnection_2 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_2 end ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

// end of generic

				ok_Hash.put("tDBConnection_2", true);
				end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBConnection_3Process(globalMap);

				/**
				 * [tDBConnection_2 end ] stop
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
				 * [tDBConnection_2 finally ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "FINANCE";

// finally of generic

				/**
				 * [tDBConnection_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
	}

	public void tDBConnection_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_3");
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
				 * [tDBConnection_3 begin ] start
				 */

				ok_Hash.put("tDBConnection_3", false);
				start_Hash.put("tDBConnection_3", System.currentTimeMillis());

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

				int tos_count_tDBConnection_3 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_3", "DASHBOARD", "tSnowflakeConnection");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBConnection_3 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBConnection_3 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBConnection_3 = (String) (restRequest_tDBConnection_3 != null
						? restRequest_tDBConnection_3.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBConnection_3 = new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBConnection_3 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBConnection_3 = null;

				org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_3 = (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_3
						.createRuntimeProperties();
				props_tDBConnection_3.setValue("loginTimeout", 15);

				props_tDBConnection_3.setValue("account", "vitaminshoppe");

				props_tDBConnection_3.setValue("regionID", "us-east-1");

				props_tDBConnection_3.setValue("useCustomRegion", false);

				props_tDBConnection_3.setValue("authenticationType",
						org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);

				props_tDBConnection_3.setValue("warehouse", "VSI_WH_XS");

				props_tDBConnection_3.setValue("db", "MSTR_DB");

				props_tDBConnection_3.setValue("schemaName", "DASHBOARD");

				props_tDBConnection_3.setValue("role", "sysadmin");

				props_tDBConnection_3.setValue("jdbcParameters", "");

				props_tDBConnection_3.setValue("autoCommit", true);

				props_tDBConnection_3.userPassword.setValue("useAuth", false);

				props_tDBConnection_3.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_3.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:TKSEECoe/lU7xdCR44QPeeADkhXFoELAcJGlRbhRQ4kVLvMv"));

				props_tDBConnection_3.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_3.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBConnection_3 = props_tDBConnection_3.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBConnection_3 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_3 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBConnection_3 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBConnection_3.referencedComponent
								.setReference(referencedComponentProperties_tDBConnection_3);
					}
				}
				globalMap.put("tDBConnection_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_3);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBConnection_3 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBConnection_3_MAPPINGS_URL", mappings_url_tDBConnection_3);

				org.talend.components.api.container.RuntimeContainer container_tDBConnection_3 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBConnection_3";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBConnection_3 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBConnection_3 = null;
				topology_tDBConnection_3 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBConnection_3 = def_tDBConnection_3.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_3,
						topology_tDBConnection_3);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_3 = def_tDBConnection_3
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_3 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBConnection_3.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBConnection_3 = componentRuntime_tDBConnection_3
						.initialize(container_tDBConnection_3, props_tDBConnection_3);

				if (initVr_tDBConnection_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBConnection_3.getMessage());
				}

				if (componentRuntime_tDBConnection_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBConnection_3;
					compDriverInitialization_tDBConnection_3.runAtDriver(container_tDBConnection_3);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_3 = null;
				if (componentRuntime_tDBConnection_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBConnection_3 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBConnection_3;
					if (doesNodeBelongToRequest_tDBConnection_3) {
						org.talend.daikon.properties.ValidationResult vr_tDBConnection_3 = sourceOrSink_tDBConnection_3
								.validate(container_tDBConnection_3);
						if (vr_tDBConnection_3
								.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBConnection_3.getMessage());
						}
					}
				}

				/**
				 * [tDBConnection_3 begin ] stop
				 */

				/**
				 * [tDBConnection_3 main ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

				tos_count_tDBConnection_3++;

				/**
				 * [tDBConnection_3 main ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

				/**
				 * [tDBConnection_3 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_end ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

				/**
				 * [tDBConnection_3 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_3 end ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

// end of generic

				ok_Hash.put("tDBConnection_3", true);
				end_Hash.put("tDBConnection_3", System.currentTimeMillis());

				/**
				 * [tDBConnection_3 end ] stop
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
				 * [tDBConnection_3 finally ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "DASHBOARD";

// finally of generic

				/**
				 * [tDBConnection_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 1);
	}

	public static class tmapStruct implements routines.system.IPersistableRow<tmapStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];

		public int store_no;

		public int getStore_no() {
			return this.store_no;
		}

		public Boolean store_noIsNullable() {
			return false;
		}

		public Boolean store_noIsKey() {
			return false;
		}

		public Integer store_noLength() {
			return 10;
		}

		public Integer store_noPrecision() {
			return 0;
		}

		public String store_noDefault() {

			return "";

		}

		public String store_noComment() {

			return "";

		}

		public String store_noPattern() {

			return "";

		}

		public String store_noOriginalDbColumnName() {

			return "store_no";

		}

		public String tax_jurisdiction;

		public String getTax_jurisdiction() {
			return this.tax_jurisdiction;
		}

		public Boolean tax_jurisdictionIsNullable() {
			return false;
		}

		public Boolean tax_jurisdictionIsKey() {
			return false;
		}

		public Integer tax_jurisdictionLength() {
			return 5;
		}

		public Integer tax_jurisdictionPrecision() {
			return 0;
		}

		public String tax_jurisdictionDefault() {

			return null;

		}

		public String tax_jurisdictionComment() {

			return "";

		}

		public String tax_jurisdictionPattern() {

			return "";

		}

		public String tax_jurisdictionOriginalDbColumnName() {

			return "tax_jurisdiction";

		}

		public short tax_strip_table_no;

		public short getTax_strip_table_no() {
			return this.tax_strip_table_no;
		}

		public Boolean tax_strip_table_noIsNullable() {
			return false;
		}

		public Boolean tax_strip_table_noIsKey() {
			return false;
		}

		public Integer tax_strip_table_noLength() {
			return 3;
		}

		public Integer tax_strip_table_noPrecision() {
			return 0;
		}

		public String tax_strip_table_noDefault() {

			return "";

		}

		public String tax_strip_table_noComment() {

			return "";

		}

		public String tax_strip_table_noPattern() {

			return "";

		}

		public String tax_strip_table_noOriginalDbColumnName() {

			return "tax_strip_table_no";

		}

		public short media_parameter_table_no;

		public short getMedia_parameter_table_no() {
			return this.media_parameter_table_no;
		}

		public Boolean media_parameter_table_noIsNullable() {
			return false;
		}

		public Boolean media_parameter_table_noIsKey() {
			return false;
		}

		public Integer media_parameter_table_noLength() {
			return 5;
		}

		public Integer media_parameter_table_noPrecision() {
			return 0;
		}

		public String media_parameter_table_noDefault() {

			return "";

		}

		public String media_parameter_table_noComment() {

			return "";

		}

		public String media_parameter_table_noPattern() {

			return "";

		}

		public String media_parameter_table_noOriginalDbColumnName() {

			return "media_parameter_table_no";

		}

		public short balancing_method;

		public short getBalancing_method() {
			return this.balancing_method;
		}

		public Boolean balancing_methodIsNullable() {
			return false;
		}

		public Boolean balancing_methodIsKey() {
			return false;
		}

		public Integer balancing_methodLength() {
			return 5;
		}

		public Integer balancing_methodPrecision() {
			return 0;
		}

		public String balancing_methodDefault() {

			return "";

		}

		public String balancing_methodComment() {

			return "";

		}

		public String balancing_methodPattern() {

			return "";

		}

		public String balancing_methodOriginalDbColumnName() {

			return "balancing_method";

		}

		public short deposit_balancing_method;

		public short getDeposit_balancing_method() {
			return this.deposit_balancing_method;
		}

		public Boolean deposit_balancing_methodIsNullable() {
			return false;
		}

		public Boolean deposit_balancing_methodIsKey() {
			return false;
		}

		public Integer deposit_balancing_methodLength() {
			return 5;
		}

		public Integer deposit_balancing_methodPrecision() {
			return 0;
		}

		public String deposit_balancing_methodDefault() {

			return "";

		}

		public String deposit_balancing_methodComment() {

			return "";

		}

		public String deposit_balancing_methodPattern() {

			return "";

		}

		public String deposit_balancing_methodOriginalDbColumnName() {

			return "deposit_balancing_method";

		}

		public Short petty_cash_line_object;

		public Short getPetty_cash_line_object() {
			return this.petty_cash_line_object;
		}

		public Boolean petty_cash_line_objectIsNullable() {
			return true;
		}

		public Boolean petty_cash_line_objectIsKey() {
			return false;
		}

		public Integer petty_cash_line_objectLength() {
			return 5;
		}

		public Integer petty_cash_line_objectPrecision() {
			return 0;
		}

		public String petty_cash_line_objectDefault() {

			return "";

		}

		public String petty_cash_line_objectComment() {

			return "";

		}

		public String petty_cash_line_objectPattern() {

			return "";

		}

		public String petty_cash_line_objectOriginalDbColumnName() {

			return "petty_cash_line_object";

		}

		public short multiple_mediacounts_added;

		public short getMultiple_mediacounts_added() {
			return this.multiple_mediacounts_added;
		}

		public Boolean multiple_mediacounts_addedIsNullable() {
			return false;
		}

		public Boolean multiple_mediacounts_addedIsKey() {
			return false;
		}

		public Integer multiple_mediacounts_addedLength() {
			return 3;
		}

		public Integer multiple_mediacounts_addedPrecision() {
			return 0;
		}

		public String multiple_mediacounts_addedDefault() {

			return "";

		}

		public String multiple_mediacounts_addedComment() {

			return "";

		}

		public String multiple_mediacounts_addedPattern() {

			return "";

		}

		public String multiple_mediacounts_addedOriginalDbColumnName() {

			return "multiple_mediacounts_added";

		}

		public short autoaccept_flag;

		public short getAutoaccept_flag() {
			return this.autoaccept_flag;
		}

		public Boolean autoaccept_flagIsNullable() {
			return false;
		}

		public Boolean autoaccept_flagIsKey() {
			return false;
		}

		public Integer autoaccept_flagLength() {
			return 3;
		}

		public Integer autoaccept_flagPrecision() {
			return 0;
		}

		public String autoaccept_flagDefault() {

			return "";

		}

		public String autoaccept_flagComment() {

			return "";

		}

		public String autoaccept_flagPattern() {

			return "";

		}

		public String autoaccept_flagOriginalDbColumnName() {

			return "autoaccept_flag";

		}

		public short tax_strip_flag;

		public short getTax_strip_flag() {
			return this.tax_strip_flag;
		}

		public Boolean tax_strip_flagIsNullable() {
			return false;
		}

		public Boolean tax_strip_flagIsKey() {
			return false;
		}

		public Integer tax_strip_flagLength() {
			return 3;
		}

		public Integer tax_strip_flagPrecision() {
			return 0;
		}

		public String tax_strip_flagDefault() {

			return "";

		}

		public String tax_strip_flagComment() {

			return "";

		}

		public String tax_strip_flagPattern() {

			return "";

		}

		public String tax_strip_flagOriginalDbColumnName() {

			return "tax_strip_flag";

		}

		public short outlet_store_flag;

		public short getOutlet_store_flag() {
			return this.outlet_store_flag;
		}

		public Boolean outlet_store_flagIsNullable() {
			return false;
		}

		public Boolean outlet_store_flagIsKey() {
			return false;
		}

		public Integer outlet_store_flagLength() {
			return 3;
		}

		public Integer outlet_store_flagPrecision() {
			return 0;
		}

		public String outlet_store_flagDefault() {

			return "";

		}

		public String outlet_store_flagComment() {

			return "";

		}

		public String outlet_store_flagPattern() {

			return "";

		}

		public String outlet_store_flagOriginalDbColumnName() {

			return "outlet_store_flag";

		}

		public String settlement_billing_name;

		public String getSettlement_billing_name() {
			return this.settlement_billing_name;
		}

		public Boolean settlement_billing_nameIsNullable() {
			return true;
		}

		public Boolean settlement_billing_nameIsKey() {
			return false;
		}

		public Integer settlement_billing_nameLength() {
			return 20;
		}

		public Integer settlement_billing_namePrecision() {
			return 0;
		}

		public String settlement_billing_nameDefault() {

			return null;

		}

		public String settlement_billing_nameComment() {

			return "";

		}

		public String settlement_billing_namePattern() {

			return "";

		}

		public String settlement_billing_nameOriginalDbColumnName() {

			return "settlement_billing_name";

		}

		public short store_deposit_destination;

		public short getStore_deposit_destination() {
			return this.store_deposit_destination;
		}

		public Boolean store_deposit_destinationIsNullable() {
			return false;
		}

		public Boolean store_deposit_destinationIsKey() {
			return false;
		}

		public Integer store_deposit_destinationLength() {
			return 5;
		}

		public Integer store_deposit_destinationPrecision() {
			return 0;
		}

		public String store_deposit_destinationDefault() {

			return "";

		}

		public String store_deposit_destinationComment() {

			return "";

		}

		public String store_deposit_destinationPattern() {

			return "";

		}

		public String store_deposit_destinationOriginalDbColumnName() {

			return "store_deposit_destination";

		}

		public short interstore_export_region;

		public short getInterstore_export_region() {
			return this.interstore_export_region;
		}

		public Boolean interstore_export_regionIsNullable() {
			return false;
		}

		public Boolean interstore_export_regionIsKey() {
			return false;
		}

		public Integer interstore_export_regionLength() {
			return 3;
		}

		public Integer interstore_export_regionPrecision() {
			return 0;
		}

		public String interstore_export_regionDefault() {

			return "";

		}

		public String interstore_export_regionComment() {

			return "";

		}

		public String interstore_export_regionPattern() {

			return "";

		}

		public String interstore_export_regionOriginalDbColumnName() {

			return "interstore_export_region";

		}

		public int gl_company;

		public int getGl_company() {
			return this.gl_company;
		}

		public Boolean gl_companyIsNullable() {
			return false;
		}

		public Boolean gl_companyIsKey() {
			return false;
		}

		public Integer gl_companyLength() {
			return 10;
		}

		public Integer gl_companyPrecision() {
			return 0;
		}

		public String gl_companyDefault() {

			return "";

		}

		public String gl_companyComment() {

			return "";

		}

		public String gl_companyPattern() {

			return "";

		}

		public String gl_companyOriginalDbColumnName() {

			return "gl_company";

		}

		public String gl_store;

		public String getGl_store() {
			return this.gl_store;
		}

		public Boolean gl_storeIsNullable() {
			return false;
		}

		public Boolean gl_storeIsKey() {
			return false;
		}

		public Integer gl_storeLength() {
			return 20;
		}

		public Integer gl_storePrecision() {
			return 0;
		}

		public String gl_storeDefault() {

			return null;

		}

		public String gl_storeComment() {

			return "";

		}

		public String gl_storePattern() {

			return "";

		}

		public String gl_storeOriginalDbColumnName() {

			return "gl_store";

		}

		public BigDecimal country_id;

		public BigDecimal getCountry_id() {
			return this.country_id;
		}

		public Boolean country_idIsNullable() {
			return true;
		}

		public Boolean country_idIsKey() {
			return false;
		}

		public Integer country_idLength() {
			return 12;
		}

		public Integer country_idPrecision() {
			return 0;
		}

		public String country_idDefault() {

			return "";

		}

		public String country_idComment() {

			return "";

		}

		public String country_idPattern() {

			return "";

		}

		public String country_idOriginalDbColumnName() {

			return "country_id";

		}

		public BigDecimal timezone_offset_hours;

		public BigDecimal getTimezone_offset_hours() {
			return this.timezone_offset_hours;
		}

		public Boolean timezone_offset_hoursIsNullable() {
			return true;
		}

		public Boolean timezone_offset_hoursIsKey() {
			return false;
		}

		public Integer timezone_offset_hoursLength() {
			return 4;
		}

		public Integer timezone_offset_hoursPrecision() {
			return 2;
		}

		public String timezone_offset_hoursDefault() {

			return "";

		}

		public String timezone_offset_hoursComment() {

			return "";

		}

		public String timezone_offset_hoursPattern() {

			return "";

		}

		public String timezone_offset_hoursOriginalDbColumnName() {

			return "timezone_offset_hours";

		}

		public String city;

		public String getCity() {
			return this.city;
		}

		public Boolean cityIsNullable() {
			return true;
		}

		public Boolean cityIsKey() {
			return false;
		}

		public Integer cityLength() {
			return 20;
		}

		public Integer cityPrecision() {
			return 0;
		}

		public String cityDefault() {

			return null;

		}

		public String cityComment() {

			return "";

		}

		public String cityPattern() {

			return "";

		}

		public String cityOriginalDbColumnName() {

			return "city";

		}

		public String state_code;

		public String getState_code() {
			return this.state_code;
		}

		public Boolean state_codeIsNullable() {
			return true;
		}

		public Boolean state_codeIsKey() {
			return false;
		}

		public Integer state_codeLength() {
			return 2;
		}

		public Integer state_codePrecision() {
			return 0;
		}

		public String state_codeDefault() {

			return null;

		}

		public String state_codeComment() {

			return "";

		}

		public String state_codePattern() {

			return "";

		}

		public String state_codeOriginalDbColumnName() {

			return "state_code";

		}

		public String zip_code;

		public String getZip_code() {
			return this.zip_code;
		}

		public Boolean zip_codeIsNullable() {
			return true;
		}

		public Boolean zip_codeIsKey() {
			return false;
		}

		public Integer zip_codeLength() {
			return 20;
		}

		public Integer zip_codePrecision() {
			return 0;
		}

		public String zip_codeDefault() {

			return null;

		}

		public String zip_codeComment() {

			return "";

		}

		public String zip_codePattern() {

			return "";

		}

		public String zip_codeOriginalDbColumnName() {

			return "zip_code";

		}

		public java.util.Date comp_date;

		public java.util.Date getComp_date() {
			return this.comp_date;
		}

		public Boolean comp_dateIsNullable() {
			return true;
		}

		public Boolean comp_dateIsKey() {
			return false;
		}

		public Integer comp_dateLength() {
			return 16;
		}

		public Integer comp_datePrecision() {
			return 0;
		}

		public String comp_dateDefault() {

			return null;

		}

		public String comp_dateComment() {

			return "";

		}

		public String comp_datePattern() {

			return "";

		}

		public String comp_dateOriginalDbColumnName() {

			return "comp_date";

		}

		public String store_export_code;

		public String getStore_export_code() {
			return this.store_export_code;
		}

		public Boolean store_export_codeIsNullable() {
			return false;
		}

		public Boolean store_export_codeIsKey() {
			return false;
		}

		public Integer store_export_codeLength() {
			return 3;
		}

		public Integer store_export_codePrecision() {
			return 0;
		}

		public String store_export_codeDefault() {

			return null;

		}

		public String store_export_codeComment() {

			return "";

		}

		public String store_export_codePattern() {

			return "";

		}

		public String store_export_codeOriginalDbColumnName() {

			return "store_export_code";

		}

		public java.util.Date open_date;

		public java.util.Date getOpen_date() {
			return this.open_date;
		}

		public Boolean open_dateIsNullable() {
			return true;
		}

		public Boolean open_dateIsKey() {
			return false;
		}

		public Integer open_dateLength() {
			return 16;
		}

		public Integer open_datePrecision() {
			return 0;
		}

		public String open_dateDefault() {

			return null;

		}

		public String open_dateComment() {

			return "";

		}

		public String open_datePattern() {

			return "";

		}

		public String open_dateOriginalDbColumnName() {

			return "open_date";

		}

		public Short log_tax_override;

		public Short getLog_tax_override() {
			return this.log_tax_override;
		}

		public Boolean log_tax_overrideIsNullable() {
			return true;
		}

		public Boolean log_tax_overrideIsKey() {
			return false;
		}

		public Integer log_tax_overrideLength() {
			return 3;
		}

		public Integer log_tax_overridePrecision() {
			return 0;
		}

		public String log_tax_overrideDefault() {

			return "";

		}

		public String log_tax_overrideComment() {

			return "";

		}

		public String log_tax_overridePattern() {

			return "";

		}

		public String log_tax_overrideOriginalDbColumnName() {

			return "log_tax_override";

		}

		public BigDecimal currency_id;

		public BigDecimal getCurrency_id() {
			return this.currency_id;
		}

		public Boolean currency_idIsNullable() {
			return true;
		}

		public Boolean currency_idIsKey() {
			return false;
		}

		public Integer currency_idLength() {
			return 12;
		}

		public Integer currency_idPrecision() {
			return 0;
		}

		public String currency_idDefault() {

			return "";

		}

		public String currency_idComment() {

			return "";

		}

		public String currency_idPattern() {

			return "";

		}

		public String currency_idOriginalDbColumnName() {

			return "currency_id";

		}

		public String email_address;

		public String getEmail_address() {
			return this.email_address;
		}

		public Boolean email_addressIsNullable() {
			return true;
		}

		public Boolean email_addressIsKey() {
			return false;
		}

		public Integer email_addressLength() {
			return 255;
		}

		public Integer email_addressPrecision() {
			return 0;
		}

		public String email_addressDefault() {

			return "";

		}

		public String email_addressComment() {

			return "";

		}

		public String email_addressPattern() {

			return "";

		}

		public String email_addressOriginalDbColumnName() {

			return "email_address";

		}

		public java.util.Date open_to_receive_date;

		public java.util.Date getOpen_to_receive_date() {
			return this.open_to_receive_date;
		}

		public Boolean open_to_receive_dateIsNullable() {
			return true;
		}

		public Boolean open_to_receive_dateIsKey() {
			return false;
		}

		public Integer open_to_receive_dateLength() {
			return 16;
		}

		public Integer open_to_receive_datePrecision() {
			return 0;
		}

		public String open_to_receive_dateDefault() {

			return "";

		}

		public String open_to_receive_dateComment() {

			return "";

		}

		public String open_to_receive_datePattern() {

			return "";

		}

		public String open_to_receive_dateOriginalDbColumnName() {

			return "open_to_receive_date";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("store_no=" + String.valueOf(store_no));
			sb.append(",tax_jurisdiction=" + tax_jurisdiction);
			sb.append(",tax_strip_table_no=" + String.valueOf(tax_strip_table_no));
			sb.append(",media_parameter_table_no=" + String.valueOf(media_parameter_table_no));
			sb.append(",balancing_method=" + String.valueOf(balancing_method));
			sb.append(",deposit_balancing_method=" + String.valueOf(deposit_balancing_method));
			sb.append(",petty_cash_line_object=" + String.valueOf(petty_cash_line_object));
			sb.append(",multiple_mediacounts_added=" + String.valueOf(multiple_mediacounts_added));
			sb.append(",autoaccept_flag=" + String.valueOf(autoaccept_flag));
			sb.append(",tax_strip_flag=" + String.valueOf(tax_strip_flag));
			sb.append(",outlet_store_flag=" + String.valueOf(outlet_store_flag));
			sb.append(",settlement_billing_name=" + settlement_billing_name);
			sb.append(",store_deposit_destination=" + String.valueOf(store_deposit_destination));
			sb.append(",interstore_export_region=" + String.valueOf(interstore_export_region));
			sb.append(",gl_company=" + String.valueOf(gl_company));
			sb.append(",gl_store=" + gl_store);
			sb.append(",country_id=" + String.valueOf(country_id));
			sb.append(",timezone_offset_hours=" + String.valueOf(timezone_offset_hours));
			sb.append(",city=" + city);
			sb.append(",state_code=" + state_code);
			sb.append(",zip_code=" + zip_code);
			sb.append(",comp_date=" + String.valueOf(comp_date));
			sb.append(",store_export_code=" + store_export_code);
			sb.append(",open_date=" + String.valueOf(open_date));
			sb.append(",log_tax_override=" + String.valueOf(log_tax_override));
			sb.append(",currency_id=" + String.valueOf(currency_id));
			sb.append(",email_address=" + email_address);
			sb.append(",open_to_receive_date=" + String.valueOf(open_to_receive_date));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			sb.append(store_no);

			sb.append("|");

			if (tax_jurisdiction == null) {
				sb.append("<null>");
			} else {
				sb.append(tax_jurisdiction);
			}

			sb.append("|");

			sb.append(tax_strip_table_no);

			sb.append("|");

			sb.append(media_parameter_table_no);

			sb.append("|");

			sb.append(balancing_method);

			sb.append("|");

			sb.append(deposit_balancing_method);

			sb.append("|");

			if (petty_cash_line_object == null) {
				sb.append("<null>");
			} else {
				sb.append(petty_cash_line_object);
			}

			sb.append("|");

			sb.append(multiple_mediacounts_added);

			sb.append("|");

			sb.append(autoaccept_flag);

			sb.append("|");

			sb.append(tax_strip_flag);

			sb.append("|");

			sb.append(outlet_store_flag);

			sb.append("|");

			if (settlement_billing_name == null) {
				sb.append("<null>");
			} else {
				sb.append(settlement_billing_name);
			}

			sb.append("|");

			sb.append(store_deposit_destination);

			sb.append("|");

			sb.append(interstore_export_region);

			sb.append("|");

			sb.append(gl_company);

			sb.append("|");

			if (gl_store == null) {
				sb.append("<null>");
			} else {
				sb.append(gl_store);
			}

			sb.append("|");

			if (country_id == null) {
				sb.append("<null>");
			} else {
				sb.append(country_id);
			}

			sb.append("|");

			if (timezone_offset_hours == null) {
				sb.append("<null>");
			} else {
				sb.append(timezone_offset_hours);
			}

			sb.append("|");

			if (city == null) {
				sb.append("<null>");
			} else {
				sb.append(city);
			}

			sb.append("|");

			if (state_code == null) {
				sb.append("<null>");
			} else {
				sb.append(state_code);
			}

			sb.append("|");

			if (zip_code == null) {
				sb.append("<null>");
			} else {
				sb.append(zip_code);
			}

			sb.append("|");

			if (comp_date == null) {
				sb.append("<null>");
			} else {
				sb.append(comp_date);
			}

			sb.append("|");

			if (store_export_code == null) {
				sb.append("<null>");
			} else {
				sb.append(store_export_code);
			}

			sb.append("|");

			if (open_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_date);
			}

			sb.append("|");

			if (log_tax_override == null) {
				sb.append("<null>");
			} else {
				sb.append(log_tax_override);
			}

			sb.append("|");

			if (currency_id == null) {
				sb.append("<null>");
			} else {
				sb.append(currency_id);
			}

			sb.append("|");

			if (email_address == null) {
				sb.append("<null>");
			} else {
				sb.append(email_address);
			}

			sb.append("|");

			if (open_to_receive_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_to_receive_date);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(tmapStruct other) {

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

	public static class tmap_mstrStruct implements routines.system.IPersistableRow<tmap_mstrStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];

		public int store_no;

		public int getStore_no() {
			return this.store_no;
		}

		public Boolean store_noIsNullable() {
			return false;
		}

		public Boolean store_noIsKey() {
			return false;
		}

		public Integer store_noLength() {
			return 10;
		}

		public Integer store_noPrecision() {
			return 0;
		}

		public String store_noDefault() {

			return "";

		}

		public String store_noComment() {

			return "";

		}

		public String store_noPattern() {

			return "";

		}

		public String store_noOriginalDbColumnName() {

			return "store_no";

		}

		public String tax_jurisdiction;

		public String getTax_jurisdiction() {
			return this.tax_jurisdiction;
		}

		public Boolean tax_jurisdictionIsNullable() {
			return false;
		}

		public Boolean tax_jurisdictionIsKey() {
			return false;
		}

		public Integer tax_jurisdictionLength() {
			return 5;
		}

		public Integer tax_jurisdictionPrecision() {
			return 0;
		}

		public String tax_jurisdictionDefault() {

			return null;

		}

		public String tax_jurisdictionComment() {

			return "";

		}

		public String tax_jurisdictionPattern() {

			return "";

		}

		public String tax_jurisdictionOriginalDbColumnName() {

			return "tax_jurisdiction";

		}

		public short tax_strip_table_no;

		public short getTax_strip_table_no() {
			return this.tax_strip_table_no;
		}

		public Boolean tax_strip_table_noIsNullable() {
			return false;
		}

		public Boolean tax_strip_table_noIsKey() {
			return false;
		}

		public Integer tax_strip_table_noLength() {
			return 3;
		}

		public Integer tax_strip_table_noPrecision() {
			return 0;
		}

		public String tax_strip_table_noDefault() {

			return "";

		}

		public String tax_strip_table_noComment() {

			return "";

		}

		public String tax_strip_table_noPattern() {

			return "";

		}

		public String tax_strip_table_noOriginalDbColumnName() {

			return "tax_strip_table_no";

		}

		public short media_parameter_table_no;

		public short getMedia_parameter_table_no() {
			return this.media_parameter_table_no;
		}

		public Boolean media_parameter_table_noIsNullable() {
			return false;
		}

		public Boolean media_parameter_table_noIsKey() {
			return false;
		}

		public Integer media_parameter_table_noLength() {
			return 5;
		}

		public Integer media_parameter_table_noPrecision() {
			return 0;
		}

		public String media_parameter_table_noDefault() {

			return "";

		}

		public String media_parameter_table_noComment() {

			return "";

		}

		public String media_parameter_table_noPattern() {

			return "";

		}

		public String media_parameter_table_noOriginalDbColumnName() {

			return "media_parameter_table_no";

		}

		public short balancing_method;

		public short getBalancing_method() {
			return this.balancing_method;
		}

		public Boolean balancing_methodIsNullable() {
			return false;
		}

		public Boolean balancing_methodIsKey() {
			return false;
		}

		public Integer balancing_methodLength() {
			return 5;
		}

		public Integer balancing_methodPrecision() {
			return 0;
		}

		public String balancing_methodDefault() {

			return "";

		}

		public String balancing_methodComment() {

			return "";

		}

		public String balancing_methodPattern() {

			return "";

		}

		public String balancing_methodOriginalDbColumnName() {

			return "balancing_method";

		}

		public short deposit_balancing_method;

		public short getDeposit_balancing_method() {
			return this.deposit_balancing_method;
		}

		public Boolean deposit_balancing_methodIsNullable() {
			return false;
		}

		public Boolean deposit_balancing_methodIsKey() {
			return false;
		}

		public Integer deposit_balancing_methodLength() {
			return 5;
		}

		public Integer deposit_balancing_methodPrecision() {
			return 0;
		}

		public String deposit_balancing_methodDefault() {

			return "";

		}

		public String deposit_balancing_methodComment() {

			return "";

		}

		public String deposit_balancing_methodPattern() {

			return "";

		}

		public String deposit_balancing_methodOriginalDbColumnName() {

			return "deposit_balancing_method";

		}

		public Short petty_cash_line_object;

		public Short getPetty_cash_line_object() {
			return this.petty_cash_line_object;
		}

		public Boolean petty_cash_line_objectIsNullable() {
			return true;
		}

		public Boolean petty_cash_line_objectIsKey() {
			return false;
		}

		public Integer petty_cash_line_objectLength() {
			return 5;
		}

		public Integer petty_cash_line_objectPrecision() {
			return 0;
		}

		public String petty_cash_line_objectDefault() {

			return "";

		}

		public String petty_cash_line_objectComment() {

			return "";

		}

		public String petty_cash_line_objectPattern() {

			return "";

		}

		public String petty_cash_line_objectOriginalDbColumnName() {

			return "petty_cash_line_object";

		}

		public short multiple_mediacounts_added;

		public short getMultiple_mediacounts_added() {
			return this.multiple_mediacounts_added;
		}

		public Boolean multiple_mediacounts_addedIsNullable() {
			return false;
		}

		public Boolean multiple_mediacounts_addedIsKey() {
			return false;
		}

		public Integer multiple_mediacounts_addedLength() {
			return 3;
		}

		public Integer multiple_mediacounts_addedPrecision() {
			return 0;
		}

		public String multiple_mediacounts_addedDefault() {

			return "";

		}

		public String multiple_mediacounts_addedComment() {

			return "";

		}

		public String multiple_mediacounts_addedPattern() {

			return "";

		}

		public String multiple_mediacounts_addedOriginalDbColumnName() {

			return "multiple_mediacounts_added";

		}

		public short autoaccept_flag;

		public short getAutoaccept_flag() {
			return this.autoaccept_flag;
		}

		public Boolean autoaccept_flagIsNullable() {
			return false;
		}

		public Boolean autoaccept_flagIsKey() {
			return false;
		}

		public Integer autoaccept_flagLength() {
			return 3;
		}

		public Integer autoaccept_flagPrecision() {
			return 0;
		}

		public String autoaccept_flagDefault() {

			return "";

		}

		public String autoaccept_flagComment() {

			return "";

		}

		public String autoaccept_flagPattern() {

			return "";

		}

		public String autoaccept_flagOriginalDbColumnName() {

			return "autoaccept_flag";

		}

		public short tax_strip_flag;

		public short getTax_strip_flag() {
			return this.tax_strip_flag;
		}

		public Boolean tax_strip_flagIsNullable() {
			return false;
		}

		public Boolean tax_strip_flagIsKey() {
			return false;
		}

		public Integer tax_strip_flagLength() {
			return 3;
		}

		public Integer tax_strip_flagPrecision() {
			return 0;
		}

		public String tax_strip_flagDefault() {

			return "";

		}

		public String tax_strip_flagComment() {

			return "";

		}

		public String tax_strip_flagPattern() {

			return "";

		}

		public String tax_strip_flagOriginalDbColumnName() {

			return "tax_strip_flag";

		}

		public short outlet_store_flag;

		public short getOutlet_store_flag() {
			return this.outlet_store_flag;
		}

		public Boolean outlet_store_flagIsNullable() {
			return false;
		}

		public Boolean outlet_store_flagIsKey() {
			return false;
		}

		public Integer outlet_store_flagLength() {
			return 3;
		}

		public Integer outlet_store_flagPrecision() {
			return 0;
		}

		public String outlet_store_flagDefault() {

			return "";

		}

		public String outlet_store_flagComment() {

			return "";

		}

		public String outlet_store_flagPattern() {

			return "";

		}

		public String outlet_store_flagOriginalDbColumnName() {

			return "outlet_store_flag";

		}

		public String settlement_billing_name;

		public String getSettlement_billing_name() {
			return this.settlement_billing_name;
		}

		public Boolean settlement_billing_nameIsNullable() {
			return true;
		}

		public Boolean settlement_billing_nameIsKey() {
			return false;
		}

		public Integer settlement_billing_nameLength() {
			return 20;
		}

		public Integer settlement_billing_namePrecision() {
			return 0;
		}

		public String settlement_billing_nameDefault() {

			return null;

		}

		public String settlement_billing_nameComment() {

			return "";

		}

		public String settlement_billing_namePattern() {

			return "";

		}

		public String settlement_billing_nameOriginalDbColumnName() {

			return "settlement_billing_name";

		}

		public short store_deposit_destination;

		public short getStore_deposit_destination() {
			return this.store_deposit_destination;
		}

		public Boolean store_deposit_destinationIsNullable() {
			return false;
		}

		public Boolean store_deposit_destinationIsKey() {
			return false;
		}

		public Integer store_deposit_destinationLength() {
			return 5;
		}

		public Integer store_deposit_destinationPrecision() {
			return 0;
		}

		public String store_deposit_destinationDefault() {

			return "";

		}

		public String store_deposit_destinationComment() {

			return "";

		}

		public String store_deposit_destinationPattern() {

			return "";

		}

		public String store_deposit_destinationOriginalDbColumnName() {

			return "store_deposit_destination";

		}

		public short interstore_export_region;

		public short getInterstore_export_region() {
			return this.interstore_export_region;
		}

		public Boolean interstore_export_regionIsNullable() {
			return false;
		}

		public Boolean interstore_export_regionIsKey() {
			return false;
		}

		public Integer interstore_export_regionLength() {
			return 3;
		}

		public Integer interstore_export_regionPrecision() {
			return 0;
		}

		public String interstore_export_regionDefault() {

			return "";

		}

		public String interstore_export_regionComment() {

			return "";

		}

		public String interstore_export_regionPattern() {

			return "";

		}

		public String interstore_export_regionOriginalDbColumnName() {

			return "interstore_export_region";

		}

		public int gl_company;

		public int getGl_company() {
			return this.gl_company;
		}

		public Boolean gl_companyIsNullable() {
			return false;
		}

		public Boolean gl_companyIsKey() {
			return false;
		}

		public Integer gl_companyLength() {
			return 10;
		}

		public Integer gl_companyPrecision() {
			return 0;
		}

		public String gl_companyDefault() {

			return "";

		}

		public String gl_companyComment() {

			return "";

		}

		public String gl_companyPattern() {

			return "";

		}

		public String gl_companyOriginalDbColumnName() {

			return "gl_company";

		}

		public String gl_store;

		public String getGl_store() {
			return this.gl_store;
		}

		public Boolean gl_storeIsNullable() {
			return false;
		}

		public Boolean gl_storeIsKey() {
			return false;
		}

		public Integer gl_storeLength() {
			return 20;
		}

		public Integer gl_storePrecision() {
			return 0;
		}

		public String gl_storeDefault() {

			return null;

		}

		public String gl_storeComment() {

			return "";

		}

		public String gl_storePattern() {

			return "";

		}

		public String gl_storeOriginalDbColumnName() {

			return "gl_store";

		}

		public BigDecimal country_id;

		public BigDecimal getCountry_id() {
			return this.country_id;
		}

		public Boolean country_idIsNullable() {
			return true;
		}

		public Boolean country_idIsKey() {
			return false;
		}

		public Integer country_idLength() {
			return 12;
		}

		public Integer country_idPrecision() {
			return 0;
		}

		public String country_idDefault() {

			return "";

		}

		public String country_idComment() {

			return "";

		}

		public String country_idPattern() {

			return "";

		}

		public String country_idOriginalDbColumnName() {

			return "country_id";

		}

		public BigDecimal timezone_offset_hours;

		public BigDecimal getTimezone_offset_hours() {
			return this.timezone_offset_hours;
		}

		public Boolean timezone_offset_hoursIsNullable() {
			return true;
		}

		public Boolean timezone_offset_hoursIsKey() {
			return false;
		}

		public Integer timezone_offset_hoursLength() {
			return 4;
		}

		public Integer timezone_offset_hoursPrecision() {
			return 2;
		}

		public String timezone_offset_hoursDefault() {

			return "";

		}

		public String timezone_offset_hoursComment() {

			return "";

		}

		public String timezone_offset_hoursPattern() {

			return "";

		}

		public String timezone_offset_hoursOriginalDbColumnName() {

			return "timezone_offset_hours";

		}

		public String city;

		public String getCity() {
			return this.city;
		}

		public Boolean cityIsNullable() {
			return true;
		}

		public Boolean cityIsKey() {
			return false;
		}

		public Integer cityLength() {
			return 20;
		}

		public Integer cityPrecision() {
			return 0;
		}

		public String cityDefault() {

			return null;

		}

		public String cityComment() {

			return "";

		}

		public String cityPattern() {

			return "";

		}

		public String cityOriginalDbColumnName() {

			return "city";

		}

		public String state_code;

		public String getState_code() {
			return this.state_code;
		}

		public Boolean state_codeIsNullable() {
			return true;
		}

		public Boolean state_codeIsKey() {
			return false;
		}

		public Integer state_codeLength() {
			return 2;
		}

		public Integer state_codePrecision() {
			return 0;
		}

		public String state_codeDefault() {

			return null;

		}

		public String state_codeComment() {

			return "";

		}

		public String state_codePattern() {

			return "";

		}

		public String state_codeOriginalDbColumnName() {

			return "state_code";

		}

		public String zip_code;

		public String getZip_code() {
			return this.zip_code;
		}

		public Boolean zip_codeIsNullable() {
			return true;
		}

		public Boolean zip_codeIsKey() {
			return false;
		}

		public Integer zip_codeLength() {
			return 20;
		}

		public Integer zip_codePrecision() {
			return 0;
		}

		public String zip_codeDefault() {

			return "";

		}

		public String zip_codeComment() {

			return "";

		}

		public String zip_codePattern() {

			return "";

		}

		public String zip_codeOriginalDbColumnName() {

			return "zip_code";

		}

		public java.util.Date comp_date;

		public java.util.Date getComp_date() {
			return this.comp_date;
		}

		public Boolean comp_dateIsNullable() {
			return true;
		}

		public Boolean comp_dateIsKey() {
			return false;
		}

		public Integer comp_dateLength() {
			return 16;
		}

		public Integer comp_datePrecision() {
			return 0;
		}

		public String comp_dateDefault() {

			return "";

		}

		public String comp_dateComment() {

			return "";

		}

		public String comp_datePattern() {

			return "";

		}

		public String comp_dateOriginalDbColumnName() {

			return "comp_date";

		}

		public String store_export_code;

		public String getStore_export_code() {
			return this.store_export_code;
		}

		public Boolean store_export_codeIsNullable() {
			return false;
		}

		public Boolean store_export_codeIsKey() {
			return false;
		}

		public Integer store_export_codeLength() {
			return 3;
		}

		public Integer store_export_codePrecision() {
			return 0;
		}

		public String store_export_codeDefault() {

			return "";

		}

		public String store_export_codeComment() {

			return "";

		}

		public String store_export_codePattern() {

			return "";

		}

		public String store_export_codeOriginalDbColumnName() {

			return "store_export_code";

		}

		public java.util.Date open_date;

		public java.util.Date getOpen_date() {
			return this.open_date;
		}

		public Boolean open_dateIsNullable() {
			return true;
		}

		public Boolean open_dateIsKey() {
			return false;
		}

		public Integer open_dateLength() {
			return 16;
		}

		public Integer open_datePrecision() {
			return 0;
		}

		public String open_dateDefault() {

			return "";

		}

		public String open_dateComment() {

			return "";

		}

		public String open_datePattern() {

			return "";

		}

		public String open_dateOriginalDbColumnName() {

			return "open_date";

		}

		public Short log_tax_override;

		public Short getLog_tax_override() {
			return this.log_tax_override;
		}

		public Boolean log_tax_overrideIsNullable() {
			return true;
		}

		public Boolean log_tax_overrideIsKey() {
			return false;
		}

		public Integer log_tax_overrideLength() {
			return 3;
		}

		public Integer log_tax_overridePrecision() {
			return 0;
		}

		public String log_tax_overrideDefault() {

			return "";

		}

		public String log_tax_overrideComment() {

			return "";

		}

		public String log_tax_overridePattern() {

			return "";

		}

		public String log_tax_overrideOriginalDbColumnName() {

			return "log_tax_override";

		}

		public BigDecimal currency_id;

		public BigDecimal getCurrency_id() {
			return this.currency_id;
		}

		public Boolean currency_idIsNullable() {
			return true;
		}

		public Boolean currency_idIsKey() {
			return false;
		}

		public Integer currency_idLength() {
			return 12;
		}

		public Integer currency_idPrecision() {
			return 0;
		}

		public String currency_idDefault() {

			return "";

		}

		public String currency_idComment() {

			return "";

		}

		public String currency_idPattern() {

			return "";

		}

		public String currency_idOriginalDbColumnName() {

			return "currency_id";

		}

		public String email_address;

		public String getEmail_address() {
			return this.email_address;
		}

		public Boolean email_addressIsNullable() {
			return true;
		}

		public Boolean email_addressIsKey() {
			return false;
		}

		public Integer email_addressLength() {
			return 255;
		}

		public Integer email_addressPrecision() {
			return 0;
		}

		public String email_addressDefault() {

			return "";

		}

		public String email_addressComment() {

			return "";

		}

		public String email_addressPattern() {

			return "";

		}

		public String email_addressOriginalDbColumnName() {

			return "email_address";

		}

		public java.util.Date open_to_receive_date;

		public java.util.Date getOpen_to_receive_date() {
			return this.open_to_receive_date;
		}

		public Boolean open_to_receive_dateIsNullable() {
			return true;
		}

		public Boolean open_to_receive_dateIsKey() {
			return false;
		}

		public Integer open_to_receive_dateLength() {
			return 16;
		}

		public Integer open_to_receive_datePrecision() {
			return 0;
		}

		public String open_to_receive_dateDefault() {

			return "";

		}

		public String open_to_receive_dateComment() {

			return "";

		}

		public String open_to_receive_datePattern() {

			return "";

		}

		public String open_to_receive_dateOriginalDbColumnName() {

			return "open_to_receive_date";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("store_no=" + String.valueOf(store_no));
			sb.append(",tax_jurisdiction=" + tax_jurisdiction);
			sb.append(",tax_strip_table_no=" + String.valueOf(tax_strip_table_no));
			sb.append(",media_parameter_table_no=" + String.valueOf(media_parameter_table_no));
			sb.append(",balancing_method=" + String.valueOf(balancing_method));
			sb.append(",deposit_balancing_method=" + String.valueOf(deposit_balancing_method));
			sb.append(",petty_cash_line_object=" + String.valueOf(petty_cash_line_object));
			sb.append(",multiple_mediacounts_added=" + String.valueOf(multiple_mediacounts_added));
			sb.append(",autoaccept_flag=" + String.valueOf(autoaccept_flag));
			sb.append(",tax_strip_flag=" + String.valueOf(tax_strip_flag));
			sb.append(",outlet_store_flag=" + String.valueOf(outlet_store_flag));
			sb.append(",settlement_billing_name=" + settlement_billing_name);
			sb.append(",store_deposit_destination=" + String.valueOf(store_deposit_destination));
			sb.append(",interstore_export_region=" + String.valueOf(interstore_export_region));
			sb.append(",gl_company=" + String.valueOf(gl_company));
			sb.append(",gl_store=" + gl_store);
			sb.append(",country_id=" + String.valueOf(country_id));
			sb.append(",timezone_offset_hours=" + String.valueOf(timezone_offset_hours));
			sb.append(",city=" + city);
			sb.append(",state_code=" + state_code);
			sb.append(",zip_code=" + zip_code);
			sb.append(",comp_date=" + String.valueOf(comp_date));
			sb.append(",store_export_code=" + store_export_code);
			sb.append(",open_date=" + String.valueOf(open_date));
			sb.append(",log_tax_override=" + String.valueOf(log_tax_override));
			sb.append(",currency_id=" + String.valueOf(currency_id));
			sb.append(",email_address=" + email_address);
			sb.append(",open_to_receive_date=" + String.valueOf(open_to_receive_date));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			sb.append(store_no);

			sb.append("|");

			if (tax_jurisdiction == null) {
				sb.append("<null>");
			} else {
				sb.append(tax_jurisdiction);
			}

			sb.append("|");

			sb.append(tax_strip_table_no);

			sb.append("|");

			sb.append(media_parameter_table_no);

			sb.append("|");

			sb.append(balancing_method);

			sb.append("|");

			sb.append(deposit_balancing_method);

			sb.append("|");

			if (petty_cash_line_object == null) {
				sb.append("<null>");
			} else {
				sb.append(petty_cash_line_object);
			}

			sb.append("|");

			sb.append(multiple_mediacounts_added);

			sb.append("|");

			sb.append(autoaccept_flag);

			sb.append("|");

			sb.append(tax_strip_flag);

			sb.append("|");

			sb.append(outlet_store_flag);

			sb.append("|");

			if (settlement_billing_name == null) {
				sb.append("<null>");
			} else {
				sb.append(settlement_billing_name);
			}

			sb.append("|");

			sb.append(store_deposit_destination);

			sb.append("|");

			sb.append(interstore_export_region);

			sb.append("|");

			sb.append(gl_company);

			sb.append("|");

			if (gl_store == null) {
				sb.append("<null>");
			} else {
				sb.append(gl_store);
			}

			sb.append("|");

			if (country_id == null) {
				sb.append("<null>");
			} else {
				sb.append(country_id);
			}

			sb.append("|");

			if (timezone_offset_hours == null) {
				sb.append("<null>");
			} else {
				sb.append(timezone_offset_hours);
			}

			sb.append("|");

			if (city == null) {
				sb.append("<null>");
			} else {
				sb.append(city);
			}

			sb.append("|");

			if (state_code == null) {
				sb.append("<null>");
			} else {
				sb.append(state_code);
			}

			sb.append("|");

			if (zip_code == null) {
				sb.append("<null>");
			} else {
				sb.append(zip_code);
			}

			sb.append("|");

			if (comp_date == null) {
				sb.append("<null>");
			} else {
				sb.append(comp_date);
			}

			sb.append("|");

			if (store_export_code == null) {
				sb.append("<null>");
			} else {
				sb.append(store_export_code);
			}

			sb.append("|");

			if (open_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_date);
			}

			sb.append("|");

			if (log_tax_override == null) {
				sb.append("<null>");
			} else {
				sb.append(log_tax_override);
			}

			sb.append("|");

			if (currency_id == null) {
				sb.append("<null>");
			} else {
				sb.append(currency_id);
			}

			sb.append("|");

			if (email_address == null) {
				sb.append("<null>");
			} else {
				sb.append(email_address);
			}

			sb.append("|");

			if (open_to_receive_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_to_receive_date);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(tmap_mstrStruct other) {

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

	public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];

		public int store_no;

		public int getStore_no() {
			return this.store_no;
		}

		public Boolean store_noIsNullable() {
			return false;
		}

		public Boolean store_noIsKey() {
			return false;
		}

		public Integer store_noLength() {
			return 10;
		}

		public Integer store_noPrecision() {
			return 0;
		}

		public String store_noDefault() {

			return "";

		}

		public String store_noComment() {

			return "";

		}

		public String store_noPattern() {

			return "";

		}

		public String store_noOriginalDbColumnName() {

			return "store_no";

		}

		public String tax_jurisdiction;

		public String getTax_jurisdiction() {
			return this.tax_jurisdiction;
		}

		public Boolean tax_jurisdictionIsNullable() {
			return false;
		}

		public Boolean tax_jurisdictionIsKey() {
			return false;
		}

		public Integer tax_jurisdictionLength() {
			return 5;
		}

		public Integer tax_jurisdictionPrecision() {
			return 0;
		}

		public String tax_jurisdictionDefault() {

			return null;

		}

		public String tax_jurisdictionComment() {

			return "";

		}

		public String tax_jurisdictionPattern() {

			return "";

		}

		public String tax_jurisdictionOriginalDbColumnName() {

			return "tax_jurisdiction";

		}

		public short tax_strip_table_no;

		public short getTax_strip_table_no() {
			return this.tax_strip_table_no;
		}

		public Boolean tax_strip_table_noIsNullable() {
			return false;
		}

		public Boolean tax_strip_table_noIsKey() {
			return false;
		}

		public Integer tax_strip_table_noLength() {
			return 3;
		}

		public Integer tax_strip_table_noPrecision() {
			return 0;
		}

		public String tax_strip_table_noDefault() {

			return "";

		}

		public String tax_strip_table_noComment() {

			return "";

		}

		public String tax_strip_table_noPattern() {

			return "";

		}

		public String tax_strip_table_noOriginalDbColumnName() {

			return "tax_strip_table_no";

		}

		public short media_parameter_table_no;

		public short getMedia_parameter_table_no() {
			return this.media_parameter_table_no;
		}

		public Boolean media_parameter_table_noIsNullable() {
			return false;
		}

		public Boolean media_parameter_table_noIsKey() {
			return false;
		}

		public Integer media_parameter_table_noLength() {
			return 5;
		}

		public Integer media_parameter_table_noPrecision() {
			return 0;
		}

		public String media_parameter_table_noDefault() {

			return "";

		}

		public String media_parameter_table_noComment() {

			return "";

		}

		public String media_parameter_table_noPattern() {

			return "";

		}

		public String media_parameter_table_noOriginalDbColumnName() {

			return "media_parameter_table_no";

		}

		public short balancing_method;

		public short getBalancing_method() {
			return this.balancing_method;
		}

		public Boolean balancing_methodIsNullable() {
			return false;
		}

		public Boolean balancing_methodIsKey() {
			return false;
		}

		public Integer balancing_methodLength() {
			return 5;
		}

		public Integer balancing_methodPrecision() {
			return 0;
		}

		public String balancing_methodDefault() {

			return "";

		}

		public String balancing_methodComment() {

			return "";

		}

		public String balancing_methodPattern() {

			return "";

		}

		public String balancing_methodOriginalDbColumnName() {

			return "balancing_method";

		}

		public short deposit_balancing_method;

		public short getDeposit_balancing_method() {
			return this.deposit_balancing_method;
		}

		public Boolean deposit_balancing_methodIsNullable() {
			return false;
		}

		public Boolean deposit_balancing_methodIsKey() {
			return false;
		}

		public Integer deposit_balancing_methodLength() {
			return 5;
		}

		public Integer deposit_balancing_methodPrecision() {
			return 0;
		}

		public String deposit_balancing_methodDefault() {

			return "";

		}

		public String deposit_balancing_methodComment() {

			return "";

		}

		public String deposit_balancing_methodPattern() {

			return "";

		}

		public String deposit_balancing_methodOriginalDbColumnName() {

			return "deposit_balancing_method";

		}

		public Short petty_cash_line_object;

		public Short getPetty_cash_line_object() {
			return this.petty_cash_line_object;
		}

		public Boolean petty_cash_line_objectIsNullable() {
			return true;
		}

		public Boolean petty_cash_line_objectIsKey() {
			return false;
		}

		public Integer petty_cash_line_objectLength() {
			return 5;
		}

		public Integer petty_cash_line_objectPrecision() {
			return 0;
		}

		public String petty_cash_line_objectDefault() {

			return "";

		}

		public String petty_cash_line_objectComment() {

			return "";

		}

		public String petty_cash_line_objectPattern() {

			return "";

		}

		public String petty_cash_line_objectOriginalDbColumnName() {

			return "petty_cash_line_object";

		}

		public short multiple_mediacounts_added;

		public short getMultiple_mediacounts_added() {
			return this.multiple_mediacounts_added;
		}

		public Boolean multiple_mediacounts_addedIsNullable() {
			return false;
		}

		public Boolean multiple_mediacounts_addedIsKey() {
			return false;
		}

		public Integer multiple_mediacounts_addedLength() {
			return 3;
		}

		public Integer multiple_mediacounts_addedPrecision() {
			return 0;
		}

		public String multiple_mediacounts_addedDefault() {

			return "";

		}

		public String multiple_mediacounts_addedComment() {

			return "";

		}

		public String multiple_mediacounts_addedPattern() {

			return "";

		}

		public String multiple_mediacounts_addedOriginalDbColumnName() {

			return "multiple_mediacounts_added";

		}

		public short autoaccept_flag;

		public short getAutoaccept_flag() {
			return this.autoaccept_flag;
		}

		public Boolean autoaccept_flagIsNullable() {
			return false;
		}

		public Boolean autoaccept_flagIsKey() {
			return false;
		}

		public Integer autoaccept_flagLength() {
			return 3;
		}

		public Integer autoaccept_flagPrecision() {
			return 0;
		}

		public String autoaccept_flagDefault() {

			return "";

		}

		public String autoaccept_flagComment() {

			return "";

		}

		public String autoaccept_flagPattern() {

			return "";

		}

		public String autoaccept_flagOriginalDbColumnName() {

			return "autoaccept_flag";

		}

		public short tax_strip_flag;

		public short getTax_strip_flag() {
			return this.tax_strip_flag;
		}

		public Boolean tax_strip_flagIsNullable() {
			return false;
		}

		public Boolean tax_strip_flagIsKey() {
			return false;
		}

		public Integer tax_strip_flagLength() {
			return 3;
		}

		public Integer tax_strip_flagPrecision() {
			return 0;
		}

		public String tax_strip_flagDefault() {

			return "";

		}

		public String tax_strip_flagComment() {

			return "";

		}

		public String tax_strip_flagPattern() {

			return "";

		}

		public String tax_strip_flagOriginalDbColumnName() {

			return "tax_strip_flag";

		}

		public short outlet_store_flag;

		public short getOutlet_store_flag() {
			return this.outlet_store_flag;
		}

		public Boolean outlet_store_flagIsNullable() {
			return false;
		}

		public Boolean outlet_store_flagIsKey() {
			return false;
		}

		public Integer outlet_store_flagLength() {
			return 3;
		}

		public Integer outlet_store_flagPrecision() {
			return 0;
		}

		public String outlet_store_flagDefault() {

			return "";

		}

		public String outlet_store_flagComment() {

			return "";

		}

		public String outlet_store_flagPattern() {

			return "";

		}

		public String outlet_store_flagOriginalDbColumnName() {

			return "outlet_store_flag";

		}

		public String settlement_billing_name;

		public String getSettlement_billing_name() {
			return this.settlement_billing_name;
		}

		public Boolean settlement_billing_nameIsNullable() {
			return true;
		}

		public Boolean settlement_billing_nameIsKey() {
			return false;
		}

		public Integer settlement_billing_nameLength() {
			return 20;
		}

		public Integer settlement_billing_namePrecision() {
			return 0;
		}

		public String settlement_billing_nameDefault() {

			return null;

		}

		public String settlement_billing_nameComment() {

			return "";

		}

		public String settlement_billing_namePattern() {

			return "";

		}

		public String settlement_billing_nameOriginalDbColumnName() {

			return "settlement_billing_name";

		}

		public short store_deposit_destination;

		public short getStore_deposit_destination() {
			return this.store_deposit_destination;
		}

		public Boolean store_deposit_destinationIsNullable() {
			return false;
		}

		public Boolean store_deposit_destinationIsKey() {
			return false;
		}

		public Integer store_deposit_destinationLength() {
			return 5;
		}

		public Integer store_deposit_destinationPrecision() {
			return 0;
		}

		public String store_deposit_destinationDefault() {

			return "";

		}

		public String store_deposit_destinationComment() {

			return "";

		}

		public String store_deposit_destinationPattern() {

			return "";

		}

		public String store_deposit_destinationOriginalDbColumnName() {

			return "store_deposit_destination";

		}

		public short interstore_export_region;

		public short getInterstore_export_region() {
			return this.interstore_export_region;
		}

		public Boolean interstore_export_regionIsNullable() {
			return false;
		}

		public Boolean interstore_export_regionIsKey() {
			return false;
		}

		public Integer interstore_export_regionLength() {
			return 3;
		}

		public Integer interstore_export_regionPrecision() {
			return 0;
		}

		public String interstore_export_regionDefault() {

			return "";

		}

		public String interstore_export_regionComment() {

			return "";

		}

		public String interstore_export_regionPattern() {

			return "";

		}

		public String interstore_export_regionOriginalDbColumnName() {

			return "interstore_export_region";

		}

		public int gl_company;

		public int getGl_company() {
			return this.gl_company;
		}

		public Boolean gl_companyIsNullable() {
			return false;
		}

		public Boolean gl_companyIsKey() {
			return false;
		}

		public Integer gl_companyLength() {
			return 10;
		}

		public Integer gl_companyPrecision() {
			return 0;
		}

		public String gl_companyDefault() {

			return "";

		}

		public String gl_companyComment() {

			return "";

		}

		public String gl_companyPattern() {

			return "";

		}

		public String gl_companyOriginalDbColumnName() {

			return "gl_company";

		}

		public String gl_store;

		public String getGl_store() {
			return this.gl_store;
		}

		public Boolean gl_storeIsNullable() {
			return false;
		}

		public Boolean gl_storeIsKey() {
			return false;
		}

		public Integer gl_storeLength() {
			return 20;
		}

		public Integer gl_storePrecision() {
			return 0;
		}

		public String gl_storeDefault() {

			return null;

		}

		public String gl_storeComment() {

			return "";

		}

		public String gl_storePattern() {

			return "";

		}

		public String gl_storeOriginalDbColumnName() {

			return "gl_store";

		}

		public BigDecimal country_id;

		public BigDecimal getCountry_id() {
			return this.country_id;
		}

		public Boolean country_idIsNullable() {
			return true;
		}

		public Boolean country_idIsKey() {
			return false;
		}

		public Integer country_idLength() {
			return 12;
		}

		public Integer country_idPrecision() {
			return 0;
		}

		public String country_idDefault() {

			return "";

		}

		public String country_idComment() {

			return "";

		}

		public String country_idPattern() {

			return "";

		}

		public String country_idOriginalDbColumnName() {

			return "country_id";

		}

		public BigDecimal timezone_offset_hours;

		public BigDecimal getTimezone_offset_hours() {
			return this.timezone_offset_hours;
		}

		public Boolean timezone_offset_hoursIsNullable() {
			return true;
		}

		public Boolean timezone_offset_hoursIsKey() {
			return false;
		}

		public Integer timezone_offset_hoursLength() {
			return 4;
		}

		public Integer timezone_offset_hoursPrecision() {
			return 2;
		}

		public String timezone_offset_hoursDefault() {

			return "";

		}

		public String timezone_offset_hoursComment() {

			return "";

		}

		public String timezone_offset_hoursPattern() {

			return "";

		}

		public String timezone_offset_hoursOriginalDbColumnName() {

			return "timezone_offset_hours";

		}

		public String city;

		public String getCity() {
			return this.city;
		}

		public Boolean cityIsNullable() {
			return true;
		}

		public Boolean cityIsKey() {
			return false;
		}

		public Integer cityLength() {
			return 20;
		}

		public Integer cityPrecision() {
			return 0;
		}

		public String cityDefault() {

			return "";

		}

		public String cityComment() {

			return "";

		}

		public String cityPattern() {

			return "";

		}

		public String cityOriginalDbColumnName() {

			return "city";

		}

		public String state_code;

		public String getState_code() {
			return this.state_code;
		}

		public Boolean state_codeIsNullable() {
			return true;
		}

		public Boolean state_codeIsKey() {
			return false;
		}

		public Integer state_codeLength() {
			return 2;
		}

		public Integer state_codePrecision() {
			return 0;
		}

		public String state_codeDefault() {

			return "";

		}

		public String state_codeComment() {

			return "";

		}

		public String state_codePattern() {

			return "";

		}

		public String state_codeOriginalDbColumnName() {

			return "state_code";

		}

		public String zip_code;

		public String getZip_code() {
			return this.zip_code;
		}

		public Boolean zip_codeIsNullable() {
			return true;
		}

		public Boolean zip_codeIsKey() {
			return false;
		}

		public Integer zip_codeLength() {
			return 20;
		}

		public Integer zip_codePrecision() {
			return 0;
		}

		public String zip_codeDefault() {

			return "";

		}

		public String zip_codeComment() {

			return "";

		}

		public String zip_codePattern() {

			return "";

		}

		public String zip_codeOriginalDbColumnName() {

			return "zip_code";

		}

		public java.util.Date comp_date;

		public java.util.Date getComp_date() {
			return this.comp_date;
		}

		public Boolean comp_dateIsNullable() {
			return true;
		}

		public Boolean comp_dateIsKey() {
			return false;
		}

		public Integer comp_dateLength() {
			return 16;
		}

		public Integer comp_datePrecision() {
			return 0;
		}

		public String comp_dateDefault() {

			return "";

		}

		public String comp_dateComment() {

			return "";

		}

		public String comp_datePattern() {

			return "";

		}

		public String comp_dateOriginalDbColumnName() {

			return "comp_date";

		}

		public String store_export_code;

		public String getStore_export_code() {
			return this.store_export_code;
		}

		public Boolean store_export_codeIsNullable() {
			return false;
		}

		public Boolean store_export_codeIsKey() {
			return false;
		}

		public Integer store_export_codeLength() {
			return 3;
		}

		public Integer store_export_codePrecision() {
			return 0;
		}

		public String store_export_codeDefault() {

			return "";

		}

		public String store_export_codeComment() {

			return "";

		}

		public String store_export_codePattern() {

			return "";

		}

		public String store_export_codeOriginalDbColumnName() {

			return "store_export_code";

		}

		public java.util.Date open_date;

		public java.util.Date getOpen_date() {
			return this.open_date;
		}

		public Boolean open_dateIsNullable() {
			return true;
		}

		public Boolean open_dateIsKey() {
			return false;
		}

		public Integer open_dateLength() {
			return 16;
		}

		public Integer open_datePrecision() {
			return 0;
		}

		public String open_dateDefault() {

			return "";

		}

		public String open_dateComment() {

			return "";

		}

		public String open_datePattern() {

			return "";

		}

		public String open_dateOriginalDbColumnName() {

			return "open_date";

		}

		public Short log_tax_override;

		public Short getLog_tax_override() {
			return this.log_tax_override;
		}

		public Boolean log_tax_overrideIsNullable() {
			return true;
		}

		public Boolean log_tax_overrideIsKey() {
			return false;
		}

		public Integer log_tax_overrideLength() {
			return 3;
		}

		public Integer log_tax_overridePrecision() {
			return 0;
		}

		public String log_tax_overrideDefault() {

			return "";

		}

		public String log_tax_overrideComment() {

			return "";

		}

		public String log_tax_overridePattern() {

			return "";

		}

		public String log_tax_overrideOriginalDbColumnName() {

			return "log_tax_override";

		}

		public BigDecimal currency_id;

		public BigDecimal getCurrency_id() {
			return this.currency_id;
		}

		public Boolean currency_idIsNullable() {
			return true;
		}

		public Boolean currency_idIsKey() {
			return false;
		}

		public Integer currency_idLength() {
			return 12;
		}

		public Integer currency_idPrecision() {
			return 0;
		}

		public String currency_idDefault() {

			return "";

		}

		public String currency_idComment() {

			return "";

		}

		public String currency_idPattern() {

			return "";

		}

		public String currency_idOriginalDbColumnName() {

			return "currency_id";

		}

		public String email_address;

		public String getEmail_address() {
			return this.email_address;
		}

		public Boolean email_addressIsNullable() {
			return true;
		}

		public Boolean email_addressIsKey() {
			return false;
		}

		public Integer email_addressLength() {
			return 255;
		}

		public Integer email_addressPrecision() {
			return 0;
		}

		public String email_addressDefault() {

			return "";

		}

		public String email_addressComment() {

			return "";

		}

		public String email_addressPattern() {

			return "";

		}

		public String email_addressOriginalDbColumnName() {

			return "email_address";

		}

		public java.util.Date open_to_receive_date;

		public java.util.Date getOpen_to_receive_date() {
			return this.open_to_receive_date;
		}

		public Boolean open_to_receive_dateIsNullable() {
			return true;
		}

		public Boolean open_to_receive_dateIsKey() {
			return false;
		}

		public Integer open_to_receive_dateLength() {
			return 16;
		}

		public Integer open_to_receive_datePrecision() {
			return 0;
		}

		public String open_to_receive_dateDefault() {

			return "";

		}

		public String open_to_receive_dateComment() {

			return "";

		}

		public String open_to_receive_datePattern() {

			return "";

		}

		public String open_to_receive_dateOriginalDbColumnName() {

			return "open_to_receive_date";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.store_no = dis.readInt();

					this.tax_jurisdiction = readString(dis);

					this.tax_strip_table_no = dis.readShort();

					this.media_parameter_table_no = dis.readShort();

					this.balancing_method = dis.readShort();

					this.deposit_balancing_method = dis.readShort();

					length = dis.readByte();
					if (length == -1) {
						this.petty_cash_line_object = null;
					} else {
						this.petty_cash_line_object = dis.readShort();
					}

					this.multiple_mediacounts_added = dis.readShort();

					this.autoaccept_flag = dis.readShort();

					this.tax_strip_flag = dis.readShort();

					this.outlet_store_flag = dis.readShort();

					this.settlement_billing_name = readString(dis);

					this.store_deposit_destination = dis.readShort();

					this.interstore_export_region = dis.readShort();

					this.gl_company = dis.readInt();

					this.gl_store = readString(dis);

					this.country_id = (BigDecimal) dis.readObject();

					this.timezone_offset_hours = (BigDecimal) dis.readObject();

					this.city = readString(dis);

					this.state_code = readString(dis);

					this.zip_code = readString(dis);

					this.comp_date = readDate(dis);

					this.store_export_code = readString(dis);

					this.open_date = readDate(dis);

					length = dis.readByte();
					if (length == -1) {
						this.log_tax_override = null;
					} else {
						this.log_tax_override = dis.readShort();
					}

					this.currency_id = (BigDecimal) dis.readObject();

					this.email_address = readString(dis);

					this.open_to_receive_date = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// int

				dos.writeInt(this.store_no);

				// String

				writeString(this.tax_jurisdiction, dos);

				// short

				dos.writeShort(this.tax_strip_table_no);

				// short

				dos.writeShort(this.media_parameter_table_no);

				// short

				dos.writeShort(this.balancing_method);

				// short

				dos.writeShort(this.deposit_balancing_method);

				// Short

				if (this.petty_cash_line_object == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.petty_cash_line_object);
				}

				// short

				dos.writeShort(this.multiple_mediacounts_added);

				// short

				dos.writeShort(this.autoaccept_flag);

				// short

				dos.writeShort(this.tax_strip_flag);

				// short

				dos.writeShort(this.outlet_store_flag);

				// String

				writeString(this.settlement_billing_name, dos);

				// short

				dos.writeShort(this.store_deposit_destination);

				// short

				dos.writeShort(this.interstore_export_region);

				// int

				dos.writeInt(this.gl_company);

				// String

				writeString(this.gl_store, dos);

				// BigDecimal

				dos.writeObject(this.country_id);

				// BigDecimal

				dos.writeObject(this.timezone_offset_hours);

				// String

				writeString(this.city, dos);

				// String

				writeString(this.state_code, dos);

				// String

				writeString(this.zip_code, dos);

				// java.util.Date

				writeDate(this.comp_date, dos);

				// String

				writeString(this.store_export_code, dos);

				// java.util.Date

				writeDate(this.open_date, dos);

				// Short

				if (this.log_tax_override == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeShort(this.log_tax_override);
				}

				// BigDecimal

				dos.writeObject(this.currency_id);

				// String

				writeString(this.email_address, dos);

				// java.util.Date

				writeDate(this.open_to_receive_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("store_no=" + String.valueOf(store_no));
			sb.append(",tax_jurisdiction=" + tax_jurisdiction);
			sb.append(",tax_strip_table_no=" + String.valueOf(tax_strip_table_no));
			sb.append(",media_parameter_table_no=" + String.valueOf(media_parameter_table_no));
			sb.append(",balancing_method=" + String.valueOf(balancing_method));
			sb.append(",deposit_balancing_method=" + String.valueOf(deposit_balancing_method));
			sb.append(",petty_cash_line_object=" + String.valueOf(petty_cash_line_object));
			sb.append(",multiple_mediacounts_added=" + String.valueOf(multiple_mediacounts_added));
			sb.append(",autoaccept_flag=" + String.valueOf(autoaccept_flag));
			sb.append(",tax_strip_flag=" + String.valueOf(tax_strip_flag));
			sb.append(",outlet_store_flag=" + String.valueOf(outlet_store_flag));
			sb.append(",settlement_billing_name=" + settlement_billing_name);
			sb.append(",store_deposit_destination=" + String.valueOf(store_deposit_destination));
			sb.append(",interstore_export_region=" + String.valueOf(interstore_export_region));
			sb.append(",gl_company=" + String.valueOf(gl_company));
			sb.append(",gl_store=" + gl_store);
			sb.append(",country_id=" + String.valueOf(country_id));
			sb.append(",timezone_offset_hours=" + String.valueOf(timezone_offset_hours));
			sb.append(",city=" + city);
			sb.append(",state_code=" + state_code);
			sb.append(",zip_code=" + zip_code);
			sb.append(",comp_date=" + String.valueOf(comp_date));
			sb.append(",store_export_code=" + store_export_code);
			sb.append(",open_date=" + String.valueOf(open_date));
			sb.append(",log_tax_override=" + String.valueOf(log_tax_override));
			sb.append(",currency_id=" + String.valueOf(currency_id));
			sb.append(",email_address=" + email_address);
			sb.append(",open_to_receive_date=" + String.valueOf(open_to_receive_date));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			sb.append(store_no);

			sb.append("|");

			if (tax_jurisdiction == null) {
				sb.append("<null>");
			} else {
				sb.append(tax_jurisdiction);
			}

			sb.append("|");

			sb.append(tax_strip_table_no);

			sb.append("|");

			sb.append(media_parameter_table_no);

			sb.append("|");

			sb.append(balancing_method);

			sb.append("|");

			sb.append(deposit_balancing_method);

			sb.append("|");

			if (petty_cash_line_object == null) {
				sb.append("<null>");
			} else {
				sb.append(petty_cash_line_object);
			}

			sb.append("|");

			sb.append(multiple_mediacounts_added);

			sb.append("|");

			sb.append(autoaccept_flag);

			sb.append("|");

			sb.append(tax_strip_flag);

			sb.append("|");

			sb.append(outlet_store_flag);

			sb.append("|");

			if (settlement_billing_name == null) {
				sb.append("<null>");
			} else {
				sb.append(settlement_billing_name);
			}

			sb.append("|");

			sb.append(store_deposit_destination);

			sb.append("|");

			sb.append(interstore_export_region);

			sb.append("|");

			sb.append(gl_company);

			sb.append("|");

			if (gl_store == null) {
				sb.append("<null>");
			} else {
				sb.append(gl_store);
			}

			sb.append("|");

			if (country_id == null) {
				sb.append("<null>");
			} else {
				sb.append(country_id);
			}

			sb.append("|");

			if (timezone_offset_hours == null) {
				sb.append("<null>");
			} else {
				sb.append(timezone_offset_hours);
			}

			sb.append("|");

			if (city == null) {
				sb.append("<null>");
			} else {
				sb.append(city);
			}

			sb.append("|");

			if (state_code == null) {
				sb.append("<null>");
			} else {
				sb.append(state_code);
			}

			sb.append("|");

			if (zip_code == null) {
				sb.append("<null>");
			} else {
				sb.append(zip_code);
			}

			sb.append("|");

			if (comp_date == null) {
				sb.append("<null>");
			} else {
				sb.append(comp_date);
			}

			sb.append("|");

			if (store_export_code == null) {
				sb.append("<null>");
			} else {
				sb.append(store_export_code);
			}

			sb.append("|");

			if (open_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_date);
			}

			sb.append("|");

			if (log_tax_override == null) {
				sb.append("<null>");
			} else {
				sb.append(log_tax_override);
			}

			sb.append("|");

			if (currency_id == null) {
				sb.append("<null>");
			} else {
				sb.append(currency_id);
			}

			sb.append("|");

			if (email_address == null) {
				sb.append("<null>");
			} else {
				sb.append(email_address);
			}

			sb.append("|");

			if (open_to_receive_date == null) {
				sb.append("<null>");
			} else {
				sb.append(open_to_receive_date);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row1Struct other) {

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

				row1Struct row1 = new row1Struct();
				tmapStruct tmap = new tmapStruct();
				tmap_mstrStruct tmap_mstr = new tmap_mstrStruct();

				/**
				 * [tDBOutput_2 begin ] start
				 */

				ok_Hash.put("tDBOutput_2", false);
				start_Hash.put("tDBOutput_2", System.currentTimeMillis());

				currentComponent = "tDBOutput_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "tmap");

				int tos_count_tDBOutput_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_2", "tDBOutput_2", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_2 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_2 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_2 = (String) (restRequest_tDBOutput_2 != null
						? restRequest_tDBOutput_2.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_2 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_2 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_2 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_2 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_2
						.createRuntimeProperties();
				props_tDBOutput_2.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);

				props_tDBOutput_2.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_2.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_2.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_2.setValue("useSchemaDatePattern", false);

				props_tDBOutput_2.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_2_1_fisrt {

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

				SchemaSettingTool_tDBOutput_2_1_fisrt sst_tDBOutput_2_1_fisrt = new SchemaSettingTool_tDBOutput_2_1_fisrt();

				props_tDBOutput_2.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_2_1_fisrt.getSchemaValue()));

				props_tDBOutput_2.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_2.connection.setValue("useCustomRegion", false);

				props_tDBOutput_2.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_2.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBOutput_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_2.table.setValue("tableName", "STORE_SALESAUDIT");

				props_tDBOutput_2.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_2.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_2.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_2");

				props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_2_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"tDBOutput_2\",\"fields\":[{", s);

						a("\"name\":\"store_no\",\"type\":\"int\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"INT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"store_no\",\"di.column.talendType\":\"id_Integer\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_jurisdiction\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"CHAR\",\"talend.field.dbColumnName\":\"tax_jurisdiction\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_jurisdiction\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_strip_table_no\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"tax_strip_table_no\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_strip_table_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"media_parameter_table_no\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"media_parameter_table_no\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"media_parameter_table_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"balancing_method\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"balancing_method\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"balancing_method\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"deposit_balancing_method\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"deposit_balancing_method\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"deposit_balancing_method\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"petty_cash_line_object\",\"type\":[{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"petty_cash_line_object\",\"di.column.talendType\":\"id_Short\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"petty_cash_line_object\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"multiple_mediacounts_added\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"multiple_mediacounts_added\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"multiple_mediacounts_added\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"autoaccept_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"autoaccept_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"autoaccept_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_strip_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"tax_strip_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_strip_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"outlet_store_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"outlet_store_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"outlet_store_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"settlement_billing_name\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"settlement_billing_name\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"settlement_billing_name\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"store_deposit_destination\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"store_deposit_destination\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_deposit_destination\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"interstore_export_region\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"interstore_export_region\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"interstore_export_region\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"gl_company\",\"type\":\"int\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"INT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"gl_company\",\"di.column.talendType\":\"id_Integer\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"gl_company\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"gl_store\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"gl_store\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"gl_store\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"country_id\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"country_id\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"12\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"country_id\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"timezone_offset_hours\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"timezone_offset_hours\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"timezone_offset_hours\",\"talend.field.precision\":\"2\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"city\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"city\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"city\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"state_code\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"state_code\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"2\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"state_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"zip_code\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"zip_code\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"zip_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"comp_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.dbColumnName\":\"comp_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"comp_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"store_export_code\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"store_export_code\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_export_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"open_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.dbColumnName\":\"open_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"open_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"log_tax_override\",\"type\":[{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"log_tax_override\",\"di.column.talendType\":\"id_Short\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"log_tax_override\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"currency_id\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"currency_id\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"12\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"currency_id\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"email_address\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"email_address\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"255\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"email_address\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"open_to_receive_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"open_to_receive_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"open_to_receive_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_2\",\"di.table.label\":\"tDBOutput_2\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_2_2_fisrt sst_tDBOutput_2_2_fisrt = new SchemaSettingTool_tDBOutput_2_2_fisrt();

				props_tDBOutput_2.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_2_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_2.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_2 = props_tDBOutput_2.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_2.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_2);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_2.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_2 = props_tDBOutput_2.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_2.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_2);
					}
				}
				globalMap.put("tDBOutput_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_2);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_2 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_2_MAPPINGS_URL", mappings_url_tDBOutput_2);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_2 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_2";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_2 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_2 = null;
				topology_tDBOutput_2 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_2 = def_tDBOutput_2.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_2,
						topology_tDBOutput_2);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_2 = def_tDBOutput_2
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_2 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_2.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_2 = componentRuntime_tDBOutput_2
						.initialize(container_tDBOutput_2, props_tDBOutput_2);

				if (initVr_tDBOutput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_2.getMessage());
				}

				if (componentRuntime_tDBOutput_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_2;
					compDriverInitialization_tDBOutput_2.runAtDriver(container_tDBOutput_2);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_2 = null;
				if (componentRuntime_tDBOutput_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_2 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_2;
					if (doesNodeBelongToRequest_tDBOutput_2) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_2 = sourceOrSink_tDBOutput_2
								.validate(container_tDBOutput_2);
						if (vr_tDBOutput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_2.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_2 = null;
				if (sourceOrSink_tDBOutput_2 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_2 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_2;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_2 = sink_tDBOutput_2
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_2) {
						writeOperation_tDBOutput_2.initialize(container_tDBOutput_2);
					}
					writer_tDBOutput_2 = writeOperation_tDBOutput_2.createWriter(container_tDBOutput_2);
					if (doesNodeBelongToRequest_tDBOutput_2) {
						writer_tDBOutput_2.open("tDBOutput_2");
					}

					resourceMap.put("writer_tDBOutput_2", writer_tDBOutput_2);
				} // end of "sourceOrSink_tDBOutput_2 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_2 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_2
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_2 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_2 = props_tDBOutput_2.getSchema(c_tDBOutput_2, false);
				incomingEnforcer_tDBOutput_2 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_2);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_2 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_2 = null;

				/**
				 * [tDBOutput_2 begin ] stop
				 */

				/**
				 * [tDBOutput_3 begin ] start
				 */

				ok_Hash.put("tDBOutput_3", false);
				start_Hash.put("tDBOutput_3", System.currentTimeMillis());

				currentComponent = "tDBOutput_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "tmap_mstr");

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
						org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);

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

				props_tDBOutput_3.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_3");

				props_tDBOutput_3.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_3.table.setValue("tableName", "STORE_SALESAUDIT");

				props_tDBOutput_3.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_3.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_3.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_3.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_3");

				props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_3_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"tmap_mstr\",\"fields\":[{", s);

						a("\"name\":\"store_no\",\"type\":\"int\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"INT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"store_no\",\"di.column.talendType\":\"id_Integer\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_jurisdiction\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"CHAR\",\"talend.field.dbColumnName\":\"tax_jurisdiction\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_jurisdiction\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_strip_table_no\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"tax_strip_table_no\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_strip_table_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"media_parameter_table_no\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"media_parameter_table_no\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"media_parameter_table_no\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"balancing_method\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"balancing_method\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"balancing_method\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"deposit_balancing_method\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"deposit_balancing_method\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"deposit_balancing_method\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"petty_cash_line_object\",\"type\":[{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"petty_cash_line_object\",\"di.column.talendType\":\"id_Short\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"petty_cash_line_object\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"multiple_mediacounts_added\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"multiple_mediacounts_added\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"multiple_mediacounts_added\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"autoaccept_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"autoaccept_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"autoaccept_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"tax_strip_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"tax_strip_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"tax_strip_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"outlet_store_flag\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"outlet_store_flag\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"outlet_store_flag\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"settlement_billing_name\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"settlement_billing_name\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"settlement_billing_name\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"store_deposit_destination\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"store_deposit_destination\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"5\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_deposit_destination\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"interstore_export_region\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"interstore_export_region\",\"di.column.talendType\":\"id_Short\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"interstore_export_region\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"gl_company\",\"type\":\"int\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"INT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"gl_company\",\"di.column.talendType\":\"id_Integer\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"gl_company\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"gl_store\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"gl_store\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"gl_store\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"country_id\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"country_id\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"12\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"country_id\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"timezone_offset_hours\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"timezone_offset_hours\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"timezone_offset_hours\",\"talend.field.precision\":\"2\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"city\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"city\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"city\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"state_code\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.dbColumnName\":\"state_code\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"2\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"state_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"zip_code\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"zip_code\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"20\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"zip_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"comp_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"comp_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"comp_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"store_export_code\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"store_export_code\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"store_export_code\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"open_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"open_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"open_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"log_tax_override\",\"type\":[{\"type\":\"int\",\"java-class\":\"java.lang.Short\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"TINYINT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"log_tax_override\",\"di.column.talendType\":\"id_Short\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"3\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"log_tax_override\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"currency_id\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMERIC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"currency_id\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"12\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"currency_id\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"email_address\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"email_address\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"255\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"email_address\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"open_to_receive_date\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"SMALLDATETIME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"open_to_receive_date\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"open_to_receive_date\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tmap_mstr\",\"di.table.label\":\"tmap_mstr\"}",
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
				 * [tMap_1 begin ] start
				 */

				ok_Hash.put("tMap_1", false);
				start_Hash.put("tMap_1", System.currentTimeMillis());

				currentComponent = "tMap_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row1");

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
				int count_row1_tMap_1 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_1__Struct {
				}
				Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_tmap_tMap_1 = 0;

				tmapStruct tmap_tmp = new tmapStruct();
				int count_tmap_mstr_tMap_1 = 0;

				tmap_mstrStruct tmap_mstr_tmp = new tmap_mstrStruct();
// ###############################

				/**
				 * [tMap_1 begin ] stop
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
							log4jParamters_tDBInput_1.append("HOST" + " = " + "\"w2k12-find-prod\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PORT" + " = " + "\"1433\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("DB_SCHEMA" + " = " + "\"dbo\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("DBNAME" + " = " + "\"FIND\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("USER" + " = " + "\"talend\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:Z5lFD1PJzdl7UnmpZgfnzZHm7CxGH9AhsI+9HkOYtrpbI0bEU0E=")
									.substring(0, 4) + "...");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"RetCatData\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from store_salesaudit\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("store_no") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("tax_jurisdiction") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("tax_strip_table_no") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("media_parameter_table_no") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("balancing_method") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("deposit_balancing_method") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("petty_cash_line_object") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("multiple_mediacounts_added") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("autoaccept_flag") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("tax_strip_flag") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("outlet_store_flag") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("settlement_billing_name") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("store_deposit_destination") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("interstore_export_region") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("gl_company") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("gl_store")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("country_id") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("timezone_offset_hours") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("city") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("state_code") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("zip_code") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("comp_date")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("store_export_code") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("open_date") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("log_tax_override") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("currency_id") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("email_address") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("open_to_receive_date") + "}]");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
							log4jParamters_tDBInput_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_1 - " + (log4jParamters_tDBInput_1));
						}
					}
					new BytesLimit65535_tDBInput_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tMSSqlInput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_1 = org.talend.designer.components.util.mssql.MSSqlUtilFactory
						.getMSSqlGenerateTimestampUtil();

				java.util.List<String> talendToDBList_tDBInput_1 = new java.util.ArrayList();
				String[] talendToDBArray_tDBInput_1 = new String[] { "FLOAT", "NUMERIC", "NUMERIC IDENTITY", "DECIMAL",
						"DECIMAL IDENTITY", "REAL" };
				java.util.Collections.addAll(talendToDBList_tDBInput_1, talendToDBArray_tDBInput_1);
				int nb_line_tDBInput_1 = 0;
				java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = "talend";

				final String decryptedPassword_tDBInput_1 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:y2bnKHtzib3ssuZ7OU4/0mwWv5R0e5pd4ced5YblvULGnlMJa2I=");

				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;

				String port_tDBInput_1 = "1433";
				String dbname_tDBInput_1 = "FIND";
				String url_tDBInput_1 = "jdbc:jtds:sqlserver://" + "w2k12-find-prod";
				if (!"".equals(port_tDBInput_1)) {
					url_tDBInput_1 += ":" + "1433";
				}
				if (!"".equals(dbname_tDBInput_1)) {
					url_tDBInput_1 += "//" + "FIND";
				}
				url_tDBInput_1 += ";appName=" + projectName + ";" + "";
				String dbschema_tDBInput_1 = "dbo";

				log.debug("tDBInput_1 - Driver ClassName: " + driverClass_tDBInput_1 + ".");

				log.debug("tDBInput_1 - Connection attempt to '" + url_tDBInput_1 + "' with the username '"
						+ dbUser_tDBInput_1 + "'.");

				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1, dbUser_tDBInput_1,
						dbPwd_tDBInput_1);
				log.debug("tDBInput_1 - Connection to '" + url_tDBInput_1 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "select * from store_salesaudit";

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
							row1.store_no = 0;
						} else {

							row1.store_no = rs_tDBInput_1.getInt(1);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row1.tax_jurisdiction = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(2);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.tax_jurisdiction = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.tax_jurisdiction = tmpContent_tDBInput_1;
								}
							} else {
								row1.tax_jurisdiction = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row1.tax_strip_table_no = 0;
						} else {

							row1.tax_strip_table_no = rs_tDBInput_1.getShort(3);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row1.media_parameter_table_no = 0;
						} else {

							row1.media_parameter_table_no = rs_tDBInput_1.getShort(4);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row1.balancing_method = 0;
						} else {

							row1.balancing_method = rs_tDBInput_1.getShort(5);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row1.deposit_balancing_method = 0;
						} else {

							row1.deposit_balancing_method = rs_tDBInput_1.getShort(6);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row1.petty_cash_line_object = null;
						} else {

							row1.petty_cash_line_object = rs_tDBInput_1.getShort(7);
							if (rs_tDBInput_1.wasNull()) {
								row1.petty_cash_line_object = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row1.multiple_mediacounts_added = 0;
						} else {

							row1.multiple_mediacounts_added = rs_tDBInput_1.getShort(8);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row1.autoaccept_flag = 0;
						} else {

							row1.autoaccept_flag = rs_tDBInput_1.getShort(9);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row1.tax_strip_flag = 0;
						} else {

							row1.tax_strip_flag = rs_tDBInput_1.getShort(10);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row1.outlet_store_flag = 0;
						} else {

							row1.outlet_store_flag = rs_tDBInput_1.getShort(11);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row1.settlement_billing_name = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(12);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(12).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.settlement_billing_name = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.settlement_billing_name = tmpContent_tDBInput_1;
								}
							} else {
								row1.settlement_billing_name = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 13) {
							row1.store_deposit_destination = 0;
						} else {

							row1.store_deposit_destination = rs_tDBInput_1.getShort(13);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 14) {
							row1.interstore_export_region = 0;
						} else {

							row1.interstore_export_region = rs_tDBInput_1.getShort(14);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 15) {
							row1.gl_company = 0;
						} else {

							row1.gl_company = rs_tDBInput_1.getInt(15);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 16) {
							row1.gl_store = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(16);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(16).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.gl_store = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.gl_store = tmpContent_tDBInput_1;
								}
							} else {
								row1.gl_store = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 17) {
							row1.country_id = null;
						} else {

							row1.country_id = rs_tDBInput_1.getBigDecimal(17);
							if (rs_tDBInput_1.wasNull()) {
								row1.country_id = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 18) {
							row1.timezone_offset_hours = null;
						} else {

							row1.timezone_offset_hours = rs_tDBInput_1.getBigDecimal(18);
							if (rs_tDBInput_1.wasNull()) {
								row1.timezone_offset_hours = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 19) {
							row1.city = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(19);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(19).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.city = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.city = tmpContent_tDBInput_1;
								}
							} else {
								row1.city = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 20) {
							row1.state_code = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(20);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(20).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.state_code = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.state_code = tmpContent_tDBInput_1;
								}
							} else {
								row1.state_code = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 21) {
							row1.zip_code = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(21);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(21).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.zip_code = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.zip_code = tmpContent_tDBInput_1;
								}
							} else {
								row1.zip_code = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 22) {
							row1.comp_date = null;
						} else {

							row1.comp_date = mssqlGTU_tDBInput_1.getDate(rsmd_tDBInput_1, rs_tDBInput_1, 22);

						}
						if (colQtyInRs_tDBInput_1 < 23) {
							row1.store_export_code = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(23);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(23).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.store_export_code = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.store_export_code = tmpContent_tDBInput_1;
								}
							} else {
								row1.store_export_code = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 24) {
							row1.open_date = null;
						} else {

							row1.open_date = mssqlGTU_tDBInput_1.getDate(rsmd_tDBInput_1, rs_tDBInput_1, 24);

						}
						if (colQtyInRs_tDBInput_1 < 25) {
							row1.log_tax_override = null;
						} else {

							row1.log_tax_override = rs_tDBInput_1.getShort(25);
							if (rs_tDBInput_1.wasNull()) {
								row1.log_tax_override = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 26) {
							row1.currency_id = null;
						} else {

							row1.currency_id = rs_tDBInput_1.getBigDecimal(26);
							if (rs_tDBInput_1.wasNull()) {
								row1.currency_id = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 27) {
							row1.email_address = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(27);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(27).toUpperCase(java.util.Locale.ENGLISH))) {
									row1.email_address = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row1.email_address = tmpContent_tDBInput_1;
								}
							} else {
								row1.email_address = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 28) {
							row1.open_to_receive_date = null;
						} else {

							row1.open_to_receive_date = mssqlGTU_tDBInput_1.getDate(rsmd_tDBInput_1, rs_tDBInput_1, 28);

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
						 * [tMap_1 main ] start
						 */

						currentComponent = "tMap_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row1", "tDBInput_1", "tDBInput_1", "tMSSqlInput", "tMap_1", "tMap_1", "tMap"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row1 - " + (row1 == null ? "" : row1.toLogString()));
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

							Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
							// ###############################
							// # Output tables

							tmap = null;
							tmap_mstr = null;

// # Output table : 'tmap'
							count_tmap_tMap_1++;

							tmap_tmp.store_no = row1.store_no;
							tmap_tmp.tax_jurisdiction = row1.tax_jurisdiction;
							tmap_tmp.tax_strip_table_no = row1.tax_strip_table_no;
							tmap_tmp.media_parameter_table_no = row1.media_parameter_table_no;
							tmap_tmp.balancing_method = row1.balancing_method;
							tmap_tmp.deposit_balancing_method = row1.deposit_balancing_method;
							tmap_tmp.petty_cash_line_object = row1.petty_cash_line_object;
							tmap_tmp.multiple_mediacounts_added = row1.multiple_mediacounts_added;
							tmap_tmp.autoaccept_flag = row1.autoaccept_flag;
							tmap_tmp.tax_strip_flag = row1.tax_strip_flag;
							tmap_tmp.outlet_store_flag = row1.outlet_store_flag;
							tmap_tmp.settlement_billing_name = row1.settlement_billing_name;
							tmap_tmp.store_deposit_destination = row1.store_deposit_destination;
							tmap_tmp.interstore_export_region = row1.interstore_export_region;
							tmap_tmp.gl_company = row1.gl_company;
							tmap_tmp.gl_store = row1.gl_store;
							tmap_tmp.country_id = row1.country_id;
							tmap_tmp.timezone_offset_hours = row1.timezone_offset_hours;
							tmap_tmp.city = row1.city;
							tmap_tmp.state_code = row1.state_code;
							tmap_tmp.zip_code = row1.zip_code;
							tmap_tmp.comp_date = row1.comp_date;
							tmap_tmp.store_export_code = row1.store_export_code;
							tmap_tmp.open_date = row1.open_date;
							tmap_tmp.log_tax_override = row1.log_tax_override;
							tmap_tmp.currency_id = row1.currency_id;
							tmap_tmp.email_address = row1.email_address;
							tmap_tmp.open_to_receive_date = row1.open_to_receive_date;
							tmap = tmap_tmp;
							log.debug("tMap_1 - Outputting the record " + count_tmap_tMap_1
									+ " of the output table 'tmap'.");

// # Output table : 'tmap_mstr'
							count_tmap_mstr_tMap_1++;

							tmap_mstr_tmp.store_no = row1.store_no;
							tmap_mstr_tmp.tax_jurisdiction = row1.tax_jurisdiction;
							tmap_mstr_tmp.tax_strip_table_no = row1.tax_strip_table_no;
							tmap_mstr_tmp.media_parameter_table_no = row1.media_parameter_table_no;
							tmap_mstr_tmp.balancing_method = row1.balancing_method;
							tmap_mstr_tmp.deposit_balancing_method = row1.deposit_balancing_method;
							tmap_mstr_tmp.petty_cash_line_object = row1.petty_cash_line_object;
							tmap_mstr_tmp.multiple_mediacounts_added = row1.multiple_mediacounts_added;
							tmap_mstr_tmp.autoaccept_flag = row1.autoaccept_flag;
							tmap_mstr_tmp.tax_strip_flag = row1.tax_strip_flag;
							tmap_mstr_tmp.outlet_store_flag = row1.outlet_store_flag;
							tmap_mstr_tmp.settlement_billing_name = row1.settlement_billing_name;
							tmap_mstr_tmp.store_deposit_destination = row1.store_deposit_destination;
							tmap_mstr_tmp.interstore_export_region = row1.interstore_export_region;
							tmap_mstr_tmp.gl_company = row1.gl_company;
							tmap_mstr_tmp.gl_store = row1.gl_store;
							tmap_mstr_tmp.country_id = row1.country_id;
							tmap_mstr_tmp.timezone_offset_hours = row1.timezone_offset_hours;
							tmap_mstr_tmp.city = row1.city;
							tmap_mstr_tmp.state_code = row1.state_code;
							tmap_mstr_tmp.zip_code = row1.zip_code;
							tmap_mstr_tmp.comp_date = row1.comp_date;
							tmap_mstr_tmp.store_export_code = row1.store_export_code;
							tmap_mstr_tmp.open_date = row1.open_date;
							tmap_mstr_tmp.log_tax_override = row1.log_tax_override;
							tmap_mstr_tmp.currency_id = row1.currency_id;
							tmap_mstr_tmp.email_address = row1.email_address;
							tmap_mstr_tmp.open_to_receive_date = row1.open_to_receive_date;
							tmap_mstr = tmap_mstr_tmp;
							log.debug("tMap_1 - Outputting the record " + count_tmap_mstr_tMap_1
									+ " of the output table 'tmap_mstr'.");

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
// Start of branch "tmap"
						if (tmap != null) {

							/**
							 * [tDBOutput_2 main ] start
							 */

							currentComponent = "tDBOutput_2";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "tmap", "tMap_1", "tMap_1", "tMap", "tDBOutput_2", "tDBOutput_2",
									"tSnowflakeOutput"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("tmap - " + (tmap == null ? "" : tmap.toLogString()));
							}

							if (incomingEnforcer_tDBOutput_2 != null) {
								incomingEnforcer_tDBOutput_2.createNewRecord();
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("store_no") != null) {
								incomingEnforcer_tDBOutput_2.put("store_no", tmap.store_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("tax_jurisdiction") != null) {
								incomingEnforcer_tDBOutput_2.put("tax_jurisdiction", tmap.tax_jurisdiction);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("tax_strip_table_no") != null) {
								incomingEnforcer_tDBOutput_2.put("tax_strip_table_no", tmap.tax_strip_table_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("media_parameter_table_no") != null) {
								incomingEnforcer_tDBOutput_2.put("media_parameter_table_no",
										tmap.media_parameter_table_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("balancing_method") != null) {
								incomingEnforcer_tDBOutput_2.put("balancing_method", tmap.balancing_method);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("deposit_balancing_method") != null) {
								incomingEnforcer_tDBOutput_2.put("deposit_balancing_method",
										tmap.deposit_balancing_method);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("petty_cash_line_object") != null) {
								incomingEnforcer_tDBOutput_2.put("petty_cash_line_object", tmap.petty_cash_line_object);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("multiple_mediacounts_added") != null) {
								incomingEnforcer_tDBOutput_2.put("multiple_mediacounts_added",
										tmap.multiple_mediacounts_added);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("autoaccept_flag") != null) {
								incomingEnforcer_tDBOutput_2.put("autoaccept_flag", tmap.autoaccept_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("tax_strip_flag") != null) {
								incomingEnforcer_tDBOutput_2.put("tax_strip_flag", tmap.tax_strip_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("outlet_store_flag") != null) {
								incomingEnforcer_tDBOutput_2.put("outlet_store_flag", tmap.outlet_store_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("settlement_billing_name") != null) {
								incomingEnforcer_tDBOutput_2.put("settlement_billing_name",
										tmap.settlement_billing_name);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("store_deposit_destination") != null) {
								incomingEnforcer_tDBOutput_2.put("store_deposit_destination",
										tmap.store_deposit_destination);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("interstore_export_region") != null) {
								incomingEnforcer_tDBOutput_2.put("interstore_export_region",
										tmap.interstore_export_region);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("gl_company") != null) {
								incomingEnforcer_tDBOutput_2.put("gl_company", tmap.gl_company);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("gl_store") != null) {
								incomingEnforcer_tDBOutput_2.put("gl_store", tmap.gl_store);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("country_id") != null) {
								incomingEnforcer_tDBOutput_2.put("country_id", tmap.country_id);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("timezone_offset_hours") != null) {
								incomingEnforcer_tDBOutput_2.put("timezone_offset_hours", tmap.timezone_offset_hours);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("city") != null) {
								incomingEnforcer_tDBOutput_2.put("city", tmap.city);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("state_code") != null) {
								incomingEnforcer_tDBOutput_2.put("state_code", tmap.state_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("zip_code") != null) {
								incomingEnforcer_tDBOutput_2.put("zip_code", tmap.zip_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("comp_date") != null) {
								incomingEnforcer_tDBOutput_2.put("comp_date", tmap.comp_date);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("store_export_code") != null) {
								incomingEnforcer_tDBOutput_2.put("store_export_code", tmap.store_export_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null
									&& incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("open_date") != null) {
								incomingEnforcer_tDBOutput_2.put("open_date", tmap.open_date);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("log_tax_override") != null) {
								incomingEnforcer_tDBOutput_2.put("log_tax_override", tmap.log_tax_override);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("currency_id") != null) {
								incomingEnforcer_tDBOutput_2.put("currency_id", tmap.currency_id);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("email_address") != null) {
								incomingEnforcer_tDBOutput_2.put("email_address", tmap.email_address);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema()
									.getField("open_to_receive_date") != null) {
								incomingEnforcer_tDBOutput_2.put("open_to_receive_date", tmap.open_to_receive_date);
							}

							org.apache.avro.generic.IndexedRecord data_tDBOutput_2 = null;
							if (incomingEnforcer_tDBOutput_2 != null) {
								data_tDBOutput_2 = incomingEnforcer_tDBOutput_2.getCurrentRecord();
							}

							if (writer_tDBOutput_2 != null && data_tDBOutput_2 != null) {
								writer_tDBOutput_2.write(data_tDBOutput_2);
							}

							nb_line_tDBOutput_2++;

							tos_count_tDBOutput_2++;

							/**
							 * [tDBOutput_2 main ] stop
							 */

							/**
							 * [tDBOutput_2 process_data_begin ] start
							 */

							currentComponent = "tDBOutput_2";

							/**
							 * [tDBOutput_2 process_data_begin ] stop
							 */

							/**
							 * [tDBOutput_2 process_data_end ] start
							 */

							currentComponent = "tDBOutput_2";

							/**
							 * [tDBOutput_2 process_data_end ] stop
							 */

						} // End of branch "tmap"

// Start of branch "tmap_mstr"
						if (tmap_mstr != null) {

							/**
							 * [tDBOutput_3 main ] start
							 */

							currentComponent = "tDBOutput_3";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "tmap_mstr", "tMap_1", "tMap_1", "tMap", "tDBOutput_3", "tDBOutput_3",
									"tSnowflakeOutput"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("tmap_mstr - " + (tmap_mstr == null ? "" : tmap_mstr.toLogString()));
							}

							if (incomingEnforcer_tDBOutput_3 != null) {
								incomingEnforcer_tDBOutput_3.createNewRecord();
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("store_no") != null) {
								incomingEnforcer_tDBOutput_3.put("store_no", tmap_mstr.store_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("tax_jurisdiction") != null) {
								incomingEnforcer_tDBOutput_3.put("tax_jurisdiction", tmap_mstr.tax_jurisdiction);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("tax_strip_table_no") != null) {
								incomingEnforcer_tDBOutput_3.put("tax_strip_table_no", tmap_mstr.tax_strip_table_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("media_parameter_table_no") != null) {
								incomingEnforcer_tDBOutput_3.put("media_parameter_table_no",
										tmap_mstr.media_parameter_table_no);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("balancing_method") != null) {
								incomingEnforcer_tDBOutput_3.put("balancing_method", tmap_mstr.balancing_method);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("deposit_balancing_method") != null) {
								incomingEnforcer_tDBOutput_3.put("deposit_balancing_method",
										tmap_mstr.deposit_balancing_method);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("petty_cash_line_object") != null) {
								incomingEnforcer_tDBOutput_3.put("petty_cash_line_object",
										tmap_mstr.petty_cash_line_object);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("multiple_mediacounts_added") != null) {
								incomingEnforcer_tDBOutput_3.put("multiple_mediacounts_added",
										tmap_mstr.multiple_mediacounts_added);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("autoaccept_flag") != null) {
								incomingEnforcer_tDBOutput_3.put("autoaccept_flag", tmap_mstr.autoaccept_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("tax_strip_flag") != null) {
								incomingEnforcer_tDBOutput_3.put("tax_strip_flag", tmap_mstr.tax_strip_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("outlet_store_flag") != null) {
								incomingEnforcer_tDBOutput_3.put("outlet_store_flag", tmap_mstr.outlet_store_flag);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("settlement_billing_name") != null) {
								incomingEnforcer_tDBOutput_3.put("settlement_billing_name",
										tmap_mstr.settlement_billing_name);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("store_deposit_destination") != null) {
								incomingEnforcer_tDBOutput_3.put("store_deposit_destination",
										tmap_mstr.store_deposit_destination);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("interstore_export_region") != null) {
								incomingEnforcer_tDBOutput_3.put("interstore_export_region",
										tmap_mstr.interstore_export_region);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("gl_company") != null) {
								incomingEnforcer_tDBOutput_3.put("gl_company", tmap_mstr.gl_company);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("gl_store") != null) {
								incomingEnforcer_tDBOutput_3.put("gl_store", tmap_mstr.gl_store);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("country_id") != null) {
								incomingEnforcer_tDBOutput_3.put("country_id", tmap_mstr.country_id);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("timezone_offset_hours") != null) {
								incomingEnforcer_tDBOutput_3.put("timezone_offset_hours",
										tmap_mstr.timezone_offset_hours);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("city") != null) {
								incomingEnforcer_tDBOutput_3.put("city", tmap_mstr.city);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("state_code") != null) {
								incomingEnforcer_tDBOutput_3.put("state_code", tmap_mstr.state_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("zip_code") != null) {
								incomingEnforcer_tDBOutput_3.put("zip_code", tmap_mstr.zip_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("comp_date") != null) {
								incomingEnforcer_tDBOutput_3.put("comp_date", tmap_mstr.comp_date);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("store_export_code") != null) {
								incomingEnforcer_tDBOutput_3.put("store_export_code", tmap_mstr.store_export_code);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null
									&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("open_date") != null) {
								incomingEnforcer_tDBOutput_3.put("open_date", tmap_mstr.open_date);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("log_tax_override") != null) {
								incomingEnforcer_tDBOutput_3.put("log_tax_override", tmap_mstr.log_tax_override);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("currency_id") != null) {
								incomingEnforcer_tDBOutput_3.put("currency_id", tmap_mstr.currency_id);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("email_address") != null) {
								incomingEnforcer_tDBOutput_3.put("email_address", tmap_mstr.email_address);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema()
									.getField("open_to_receive_date") != null) {
								incomingEnforcer_tDBOutput_3.put("open_to_receive_date",
										tmap_mstr.open_to_receive_date);
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

						} // End of branch "tmap_mstr"

						/**
						 * [tMap_1 process_data_end ] start
						 */

						currentComponent = "tMap_1";

						/**
						 * [tMap_1 process_data_end ] stop
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
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'tmap': " + count_tmap_tMap_1 + ".");
				log.debug("tMap_1 - Written records count in the table 'tmap_mstr': " + count_tmap_mstr_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tDBInput_1", "tDBInput_1", "tMSSqlInput", "tMap_1", "tMap_1", "tMap", "output")) {
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
				 * [tDBOutput_2 end ] start
				 */

				currentComponent = "tDBOutput_2";

// end of generic

				resourceMap.put("finish_tDBOutput_2", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_2 = null;
				if (writer_tDBOutput_2 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_2 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_2
							.close();
					resultMap_tDBOutput_2 = writer_tDBOutput_2.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_2), container_tDBOutput_2);
				}
				if (resultMap_tDBOutput_2 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_2 : resultMap_tDBOutput_2.entrySet()) {
						switch (entry_tDBOutput_2.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_2.setComponentData("tDBOutput_2", "ERROR_MESSAGE",
									entry_tDBOutput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_LINE",
									entry_tDBOutput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_SUCCESS",
									entry_tDBOutput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_REJECT",
									entry_tDBOutput_2.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_2 = new StringBuilder();
							for (int i_tDBOutput_2 = 0; i_tDBOutput_2 < entry_tDBOutput_2.getKey()
									.length(); i_tDBOutput_2++) {
								char ch_tDBOutput_2 = entry_tDBOutput_2.getKey().charAt(i_tDBOutput_2);
								if (Character.isUpperCase(ch_tDBOutput_2) && i_tDBOutput_2 > 0) {
									studio_key_tDBOutput_2.append('_');
								}
								studio_key_tDBOutput_2.append(ch_tDBOutput_2);
							}
							container_tDBOutput_2.setComponentData("tDBOutput_2",
									studio_key_tDBOutput_2.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_2.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "tmap", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tDBOutput_2", "tDBOutput_2", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_2", true);
				end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				/**
				 * [tDBOutput_2 end ] stop
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "tmap_mstr", 2, 0,
						"tMap_1", "tMap_1", "tMap", "tDBOutput_3", "tDBOutput_3", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_3", true);
				end_Hash.put("tDBOutput_3", System.currentTimeMillis());

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
				 * [tDBInput_1 finally ] start
				 */

				currentComponent = "tDBInput_1";

				/**
				 * [tDBInput_1 finally ] stop
				 */

				/**
				 * [tMap_1 finally ] start
				 */

				currentComponent = "tMap_1";

				/**
				 * [tMap_1 finally ] stop
				 */

				/**
				 * [tDBOutput_2 finally ] start
				 */

				currentComponent = "tDBOutput_2";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_2") == null) {
					if (resourceMap.get("writer_tDBOutput_2") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_2"))
									.close();
						} catch (java.io.IOException e_tDBOutput_2) {
							String errorMessage_tDBOutput_2 = "failed to release the resource in tDBOutput_2 :"
									+ e_tDBOutput_2.getMessage();
							System.err.println(errorMessage_tDBOutput_2);
						}
					}
				}

				/**
				 * [tDBOutput_2 finally ] stop
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

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}

	public static class row14Struct implements routines.system.IPersistableRow<row14Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];

		public BigDecimal APPOINTMENT_ID;

		public BigDecimal getAPPOINTMENT_ID() {
			return this.APPOINTMENT_ID;
		}

		public Boolean APPOINTMENT_IDIsNullable() {
			return true;
		}

		public Boolean APPOINTMENT_IDIsKey() {
			return false;
		}

		public Integer APPOINTMENT_IDLength() {
			return null;
		}

		public Integer APPOINTMENT_IDPrecision() {
			return null;
		}

		public String APPOINTMENT_IDDefault() {

			return "";

		}

		public String APPOINTMENT_IDComment() {

			return "";

		}

		public String APPOINTMENT_IDPattern() {

			return "";

		}

		public String APPOINTMENT_IDOriginalDbColumnName() {

			return "APPOINTMENT_ID";

		}

		public BigDecimal COMPANY_ID;

		public BigDecimal getCOMPANY_ID() {
			return this.COMPANY_ID;
		}

		public Boolean COMPANY_IDIsNullable() {
			return true;
		}

		public Boolean COMPANY_IDIsKey() {
			return false;
		}

		public Integer COMPANY_IDLength() {
			return null;
		}

		public Integer COMPANY_IDPrecision() {
			return null;
		}

		public String COMPANY_IDDefault() {

			return "";

		}

		public String COMPANY_IDComment() {

			return "";

		}

		public String COMPANY_IDPattern() {

			return "";

		}

		public String COMPANY_IDOriginalDbColumnName() {

			return "COMPANY_ID";

		}

		public BigDecimal FACILITY_ID;

		public BigDecimal getFACILITY_ID() {
			return this.FACILITY_ID;
		}

		public Boolean FACILITY_IDIsNullable() {
			return true;
		}

		public Boolean FACILITY_IDIsKey() {
			return false;
		}

		public Integer FACILITY_IDLength() {
			return null;
		}

		public Integer FACILITY_IDPrecision() {
			return null;
		}

		public String FACILITY_IDDefault() {

			return "";

		}

		public String FACILITY_IDComment() {

			return "";

		}

		public String FACILITY_IDPattern() {

			return "";

		}

		public String FACILITY_IDOriginalDbColumnName() {

			return "FACILITY_ID";

		}

		public BigDecimal CURRENT_LOCATION_ID;

		public BigDecimal getCURRENT_LOCATION_ID() {
			return this.CURRENT_LOCATION_ID;
		}

		public Boolean CURRENT_LOCATION_IDIsNullable() {
			return true;
		}

		public Boolean CURRENT_LOCATION_IDIsKey() {
			return false;
		}

		public Integer CURRENT_LOCATION_IDLength() {
			return null;
		}

		public Integer CURRENT_LOCATION_IDPrecision() {
			return null;
		}

		public String CURRENT_LOCATION_IDDefault() {

			return "";

		}

		public String CURRENT_LOCATION_IDComment() {

			return "";

		}

		public String CURRENT_LOCATION_IDPattern() {

			return "";

		}

		public String CURRENT_LOCATION_IDOriginalDbColumnName() {

			return "CURRENT_LOCATION_ID";

		}

		public BigDecimal APPT_REASON_CODE;

		public BigDecimal getAPPT_REASON_CODE() {
			return this.APPT_REASON_CODE;
		}

		public Boolean APPT_REASON_CODEIsNullable() {
			return true;
		}

		public Boolean APPT_REASON_CODEIsKey() {
			return false;
		}

		public Integer APPT_REASON_CODELength() {
			return null;
		}

		public Integer APPT_REASON_CODEPrecision() {
			return null;
		}

		public String APPT_REASON_CODEDefault() {

			return "";

		}

		public String APPT_REASON_CODEComment() {

			return "";

		}

		public String APPT_REASON_CODEPattern() {

			return "";

		}

		public String APPT_REASON_CODEOriginalDbColumnName() {

			return "APPT_REASON_CODE";

		}

		public String COMMENTS;

		public String getCOMMENTS() {
			return this.COMMENTS;
		}

		public Boolean COMMENTSIsNullable() {
			return true;
		}

		public Boolean COMMENTSIsKey() {
			return false;
		}

		public Integer COMMENTSLength() {
			return null;
		}

		public Integer COMMENTSPrecision() {
			return null;
		}

		public String COMMENTSDefault() {

			return null;

		}

		public String COMMENTSComment() {

			return "";

		}

		public String COMMENTSPattern() {

			return "";

		}

		public String COMMENTSOriginalDbColumnName() {

			return "COMMENTS";

		}

		public String CARRIER_CODE;

		public String getCARRIER_CODE() {
			return this.CARRIER_CODE;
		}

		public Boolean CARRIER_CODEIsNullable() {
			return true;
		}

		public Boolean CARRIER_CODEIsKey() {
			return false;
		}

		public Integer CARRIER_CODELength() {
			return null;
		}

		public Integer CARRIER_CODEPrecision() {
			return null;
		}

		public String CARRIER_CODEDefault() {

			return null;

		}

		public String CARRIER_CODEComment() {

			return "";

		}

		public String CARRIER_CODEPattern() {

			return "";

		}

		public String CARRIER_CODEOriginalDbColumnName() {

			return "CARRIER_CODE";

		}

		public String BUSINESS_PARTNER_ID;

		public String getBUSINESS_PARTNER_ID() {
			return this.BUSINESS_PARTNER_ID;
		}

		public Boolean BUSINESS_PARTNER_IDIsNullable() {
			return true;
		}

		public Boolean BUSINESS_PARTNER_IDIsKey() {
			return false;
		}

		public Integer BUSINESS_PARTNER_IDLength() {
			return null;
		}

		public Integer BUSINESS_PARTNER_IDPrecision() {
			return null;
		}

		public String BUSINESS_PARTNER_IDDefault() {

			return null;

		}

		public String BUSINESS_PARTNER_IDComment() {

			return "";

		}

		public String BUSINESS_PARTNER_IDPattern() {

			return "";

		}

		public String BUSINESS_PARTNER_IDOriginalDbColumnName() {

			return "BUSINESS_PARTNER_ID";

		}

		public BigDecimal APPT_TYPE;

		public BigDecimal getAPPT_TYPE() {
			return this.APPT_TYPE;
		}

		public Boolean APPT_TYPEIsNullable() {
			return true;
		}

		public Boolean APPT_TYPEIsKey() {
			return false;
		}

		public Integer APPT_TYPELength() {
			return null;
		}

		public Integer APPT_TYPEPrecision() {
			return null;
		}

		public String APPT_TYPEDefault() {

			return "";

		}

		public String APPT_TYPEComment() {

			return "";

		}

		public String APPT_TYPEPattern() {

			return "";

		}

		public String APPT_TYPEOriginalDbColumnName() {

			return "APPT_TYPE";

		}

		public BigDecimal APPT_STATUS;

		public BigDecimal getAPPT_STATUS() {
			return this.APPT_STATUS;
		}

		public Boolean APPT_STATUSIsNullable() {
			return true;
		}

		public Boolean APPT_STATUSIsKey() {
			return false;
		}

		public Integer APPT_STATUSLength() {
			return null;
		}

		public Integer APPT_STATUSPrecision() {
			return null;
		}

		public String APPT_STATUSDefault() {

			return "";

		}

		public String APPT_STATUSComment() {

			return "";

		}

		public String APPT_STATUSPattern() {

			return "";

		}

		public String APPT_STATUSOriginalDbColumnName() {

			return "APPT_STATUS";

		}

		public java.util.Date CHECKIN_DTTM;

		public java.util.Date getCHECKIN_DTTM() {
			return this.CHECKIN_DTTM;
		}

		public Boolean CHECKIN_DTTMIsNullable() {
			return true;
		}

		public Boolean CHECKIN_DTTMIsKey() {
			return false;
		}

		public Integer CHECKIN_DTTMLength() {
			return null;
		}

		public Integer CHECKIN_DTTMPrecision() {
			return null;
		}

		public String CHECKIN_DTTMDefault() {

			return null;

		}

		public String CHECKIN_DTTMComment() {

			return "";

		}

		public String CHECKIN_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String CHECKIN_DTTMOriginalDbColumnName() {

			return "CHECKIN_DTTM";

		}

		public java.util.Date CHECKUOUT_DTTM;

		public java.util.Date getCHECKUOUT_DTTM() {
			return this.CHECKUOUT_DTTM;
		}

		public Boolean CHECKUOUT_DTTMIsNullable() {
			return true;
		}

		public Boolean CHECKUOUT_DTTMIsKey() {
			return false;
		}

		public Integer CHECKUOUT_DTTMLength() {
			return null;
		}

		public Integer CHECKUOUT_DTTMPrecision() {
			return null;
		}

		public String CHECKUOUT_DTTMDefault() {

			return "";

		}

		public String CHECKUOUT_DTTMComment() {

			return "";

		}

		public String CHECKUOUT_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String CHECKUOUT_DTTMOriginalDbColumnName() {

			return "CHECKUOUT_DTTM";

		}

		public java.util.Date LOAD_UNLOAD_ST_DTTM;

		public java.util.Date getLOAD_UNLOAD_ST_DTTM() {
			return this.LOAD_UNLOAD_ST_DTTM;
		}

		public Boolean LOAD_UNLOAD_ST_DTTMIsNullable() {
			return true;
		}

		public Boolean LOAD_UNLOAD_ST_DTTMIsKey() {
			return false;
		}

		public Integer LOAD_UNLOAD_ST_DTTMLength() {
			return null;
		}

		public Integer LOAD_UNLOAD_ST_DTTMPrecision() {
			return null;
		}

		public String LOAD_UNLOAD_ST_DTTMDefault() {

			return "";

		}

		public String LOAD_UNLOAD_ST_DTTMComment() {

			return "";

		}

		public String LOAD_UNLOAD_ST_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String LOAD_UNLOAD_ST_DTTMOriginalDbColumnName() {

			return "LOAD_UNLOAD_ST_DTTM";

		}

		public java.util.Date LOAD_UNLOAD_END_DTTM;

		public java.util.Date getLOAD_UNLOAD_END_DTTM() {
			return this.LOAD_UNLOAD_END_DTTM;
		}

		public Boolean LOAD_UNLOAD_END_DTTMIsNullable() {
			return true;
		}

		public Boolean LOAD_UNLOAD_END_DTTMIsKey() {
			return false;
		}

		public Integer LOAD_UNLOAD_END_DTTMLength() {
			return null;
		}

		public Integer LOAD_UNLOAD_END_DTTMPrecision() {
			return null;
		}

		public String LOAD_UNLOAD_END_DTTMDefault() {

			return "";

		}

		public String LOAD_UNLOAD_END_DTTMComment() {

			return "";

		}

		public String LOAD_UNLOAD_END_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String LOAD_UNLOAD_END_DTTMOriginalDbColumnName() {

			return "LOAD_UNLOAD_END_DTTM";

		}

		public BigDecimal APPT_PRIORITY;

		public BigDecimal getAPPT_PRIORITY() {
			return this.APPT_PRIORITY;
		}

		public Boolean APPT_PRIORITYIsNullable() {
			return true;
		}

		public Boolean APPT_PRIORITYIsKey() {
			return false;
		}

		public Integer APPT_PRIORITYLength() {
			return null;
		}

		public Integer APPT_PRIORITYPrecision() {
			return null;
		}

		public String APPT_PRIORITYDefault() {

			return "";

		}

		public String APPT_PRIORITYComment() {

			return "";

		}

		public String APPT_PRIORITYPattern() {

			return "";

		}

		public String APPT_PRIORITYOriginalDbColumnName() {

			return "APPT_PRIORITY";

		}

		public String REQUEST_COMM_TYPE;

		public String getREQUEST_COMM_TYPE() {
			return this.REQUEST_COMM_TYPE;
		}

		public Boolean REQUEST_COMM_TYPEIsNullable() {
			return true;
		}

		public Boolean REQUEST_COMM_TYPEIsKey() {
			return false;
		}

		public Integer REQUEST_COMM_TYPELength() {
			return null;
		}

		public Integer REQUEST_COMM_TYPEPrecision() {
			return null;
		}

		public String REQUEST_COMM_TYPEDefault() {

			return "";

		}

		public String REQUEST_COMM_TYPEComment() {

			return "";

		}

		public String REQUEST_COMM_TYPEPattern() {

			return "";

		}

		public String REQUEST_COMM_TYPEOriginalDbColumnName() {

			return "REQUEST_COMM_TYPE";

		}

		public BigDecimal CREATED_SOURCE_TYPE;

		public BigDecimal getCREATED_SOURCE_TYPE() {
			return this.CREATED_SOURCE_TYPE;
		}

		public Boolean CREATED_SOURCE_TYPEIsNullable() {
			return true;
		}

		public Boolean CREATED_SOURCE_TYPEIsKey() {
			return false;
		}

		public Integer CREATED_SOURCE_TYPELength() {
			return null;
		}

		public Integer CREATED_SOURCE_TYPEPrecision() {
			return null;
		}

		public String CREATED_SOURCE_TYPEDefault() {

			return "";

		}

		public String CREATED_SOURCE_TYPEComment() {

			return "";

		}

		public String CREATED_SOURCE_TYPEPattern() {

			return "";

		}

		public String CREATED_SOURCE_TYPEOriginalDbColumnName() {

			return "CREATED_SOURCE_TYPE";

		}

		public java.util.Date CREATED_SOURCE_DTTM;

		public java.util.Date getCREATED_SOURCE_DTTM() {
			return this.CREATED_SOURCE_DTTM;
		}

		public Boolean CREATED_SOURCE_DTTMIsNullable() {
			return true;
		}

		public Boolean CREATED_SOURCE_DTTMIsKey() {
			return false;
		}

		public Integer CREATED_SOURCE_DTTMLength() {
			return null;
		}

		public Integer CREATED_SOURCE_DTTMPrecision() {
			return null;
		}

		public String CREATED_SOURCE_DTTMDefault() {

			return "";

		}

		public String CREATED_SOURCE_DTTMComment() {

			return "";

		}

		public String CREATED_SOURCE_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String CREATED_SOURCE_DTTMOriginalDbColumnName() {

			return "CREATED_SOURCE_DTTM";

		}

		public String CREATED_SOURCE;

		public String getCREATED_SOURCE() {
			return this.CREATED_SOURCE;
		}

		public Boolean CREATED_SOURCEIsNullable() {
			return true;
		}

		public Boolean CREATED_SOURCEIsKey() {
			return false;
		}

		public Integer CREATED_SOURCELength() {
			return null;
		}

		public Integer CREATED_SOURCEPrecision() {
			return null;
		}

		public String CREATED_SOURCEDefault() {

			return "";

		}

		public String CREATED_SOURCEComment() {

			return "";

		}

		public String CREATED_SOURCEPattern() {

			return "";

		}

		public String CREATED_SOURCEOriginalDbColumnName() {

			return "CREATED_SOURCE";

		}

		public BigDecimal LAST_UPDATED_SOURCE_TYPE;

		public BigDecimal getLAST_UPDATED_SOURCE_TYPE() {
			return this.LAST_UPDATED_SOURCE_TYPE;
		}

		public Boolean LAST_UPDATED_SOURCE_TYPEIsNullable() {
			return true;
		}

		public Boolean LAST_UPDATED_SOURCE_TYPEIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_SOURCE_TYPELength() {
			return null;
		}

		public Integer LAST_UPDATED_SOURCE_TYPEPrecision() {
			return null;
		}

		public String LAST_UPDATED_SOURCE_TYPEDefault() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPEComment() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPEPattern() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPEOriginalDbColumnName() {

			return "LAST_UPDATED_SOURCE_TYPE";

		}

		public String LAST_UPDATED_SOURCE;

		public String getLAST_UPDATED_SOURCE() {
			return this.LAST_UPDATED_SOURCE;
		}

		public Boolean LAST_UPDATED_SOURCEIsNullable() {
			return true;
		}

		public Boolean LAST_UPDATED_SOURCEIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_SOURCELength() {
			return null;
		}

		public Integer LAST_UPDATED_SOURCEPrecision() {
			return null;
		}

		public String LAST_UPDATED_SOURCEDefault() {

			return "";

		}

		public String LAST_UPDATED_SOURCEComment() {

			return "";

		}

		public String LAST_UPDATED_SOURCEPattern() {

			return "";

		}

		public String LAST_UPDATED_SOURCEOriginalDbColumnName() {

			return "LAST_UPDATED_SOURCE";

		}

		public java.util.Date LAST_UPDATED_DTTM;

		public java.util.Date getLAST_UPDATED_DTTM() {
			return this.LAST_UPDATED_DTTM;
		}

		public Boolean LAST_UPDATED_DTTMIsNullable() {
			return true;
		}

		public Boolean LAST_UPDATED_DTTMIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_DTTMLength() {
			return null;
		}

		public Integer LAST_UPDATED_DTTMPrecision() {
			return null;
		}

		public String LAST_UPDATED_DTTMDefault() {

			return "";

		}

		public String LAST_UPDATED_DTTMComment() {

			return "";

		}

		public String LAST_UPDATED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String LAST_UPDATED_DTTMOriginalDbColumnName() {

			return "LAST_UPDATED_DTTM";

		}

		public String IS_TOP_FRIEGHT;

		public String getIS_TOP_FRIEGHT() {
			return this.IS_TOP_FRIEGHT;
		}

		public Boolean IS_TOP_FRIEGHTIsNullable() {
			return true;
		}

		public Boolean IS_TOP_FRIEGHTIsKey() {
			return false;
		}

		public Integer IS_TOP_FRIEGHTLength() {
			return null;
		}

		public Integer IS_TOP_FRIEGHTPrecision() {
			return null;
		}

		public String IS_TOP_FRIEGHTDefault() {

			return "";

		}

		public String IS_TOP_FRIEGHTComment() {

			return "";

		}

		public String IS_TOP_FRIEGHTPattern() {

			return "";

		}

		public String IS_TOP_FRIEGHTOriginalDbColumnName() {

			return "IS_TOP_FRIEGHT";

		}

		public String TC_APPOINTMENT_ID;

		public String getTC_APPOINTMENT_ID() {
			return this.TC_APPOINTMENT_ID;
		}

		public Boolean TC_APPOINTMENT_IDIsNullable() {
			return true;
		}

		public Boolean TC_APPOINTMENT_IDIsKey() {
			return false;
		}

		public Integer TC_APPOINTMENT_IDLength() {
			return null;
		}

		public Integer TC_APPOINTMENT_IDPrecision() {
			return null;
		}

		public String TC_APPOINTMENT_IDDefault() {

			return "";

		}

		public String TC_APPOINTMENT_IDComment() {

			return "";

		}

		public String TC_APPOINTMENT_IDPattern() {

			return "";

		}

		public String TC_APPOINTMENT_IDOriginalDbColumnName() {

			return "TC_APPOINTMENT_ID";

		}

		public BigDecimal DRIVER_ID;

		public BigDecimal getDRIVER_ID() {
			return this.DRIVER_ID;
		}

		public Boolean DRIVER_IDIsNullable() {
			return true;
		}

		public Boolean DRIVER_IDIsKey() {
			return false;
		}

		public Integer DRIVER_IDLength() {
			return null;
		}

		public Integer DRIVER_IDPrecision() {
			return null;
		}

		public String DRIVER_IDDefault() {

			return "";

		}

		public String DRIVER_IDComment() {

			return "";

		}

		public String DRIVER_IDPattern() {

			return "";

		}

		public String DRIVER_IDOriginalDbColumnName() {

			return "DRIVER_ID";

		}

		public BigDecimal APPOINTMENT_CREATION_TYPE;

		public BigDecimal getAPPOINTMENT_CREATION_TYPE() {
			return this.APPOINTMENT_CREATION_TYPE;
		}

		public Boolean APPOINTMENT_CREATION_TYPEIsNullable() {
			return true;
		}

		public Boolean APPOINTMENT_CREATION_TYPEIsKey() {
			return false;
		}

		public Integer APPOINTMENT_CREATION_TYPELength() {
			return null;
		}

		public Integer APPOINTMENT_CREATION_TYPEPrecision() {
			return null;
		}

		public String APPOINTMENT_CREATION_TYPEDefault() {

			return "";

		}

		public String APPOINTMENT_CREATION_TYPEComment() {

			return "";

		}

		public String APPOINTMENT_CREATION_TYPEPattern() {

			return "";

		}

		public String APPOINTMENT_CREATION_TYPEOriginalDbColumnName() {

			return "APPOINTMENT_CREATION_TYPE";

		}

		public BigDecimal YARD_ID;

		public BigDecimal getYARD_ID() {
			return this.YARD_ID;
		}

		public Boolean YARD_IDIsNullable() {
			return true;
		}

		public Boolean YARD_IDIsKey() {
			return false;
		}

		public Integer YARD_IDLength() {
			return null;
		}

		public Integer YARD_IDPrecision() {
			return null;
		}

		public String YARD_IDDefault() {

			return "";

		}

		public String YARD_IDComment() {

			return "";

		}

		public String YARD_IDPattern() {

			return "";

		}

		public String YARD_IDOriginalDbColumnName() {

			return "YARD_ID";

		}

		public String CONTROL_NO;

		public String getCONTROL_NO() {
			return this.CONTROL_NO;
		}

		public Boolean CONTROL_NOIsNullable() {
			return true;
		}

		public Boolean CONTROL_NOIsKey() {
			return false;
		}

		public Integer CONTROL_NOLength() {
			return null;
		}

		public Integer CONTROL_NOPrecision() {
			return null;
		}

		public String CONTROL_NODefault() {

			return "";

		}

		public String CONTROL_NOComment() {

			return "";

		}

		public String CONTROL_NOPattern() {

			return "";

		}

		public String CONTROL_NOOriginalDbColumnName() {

			return "CONTROL_NO";

		}

		public String DOCK_DOOR_ID;

		public String getDOCK_DOOR_ID() {
			return this.DOCK_DOOR_ID;
		}

		public Boolean DOCK_DOOR_IDIsNullable() {
			return true;
		}

		public Boolean DOCK_DOOR_IDIsKey() {
			return false;
		}

		public Integer DOCK_DOOR_IDLength() {
			return null;
		}

		public Integer DOCK_DOOR_IDPrecision() {
			return null;
		}

		public String DOCK_DOOR_IDDefault() {

			return "";

		}

		public String DOCK_DOOR_IDComment() {

			return "";

		}

		public String DOCK_DOOR_IDPattern() {

			return "";

		}

		public String DOCK_DOOR_IDOriginalDbColumnName() {

			return "DOCK_DOOR_ID";

		}

		public String DOOR_TYPE_ID;

		public String getDOOR_TYPE_ID() {
			return this.DOOR_TYPE_ID;
		}

		public Boolean DOOR_TYPE_IDIsNullable() {
			return true;
		}

		public Boolean DOOR_TYPE_IDIsKey() {
			return false;
		}

		public Integer DOOR_TYPE_IDLength() {
			return null;
		}

		public Integer DOOR_TYPE_IDPrecision() {
			return null;
		}

		public String DOOR_TYPE_IDDefault() {

			return "";

		}

		public String DOOR_TYPE_IDComment() {

			return "";

		}

		public String DOOR_TYPE_IDPattern() {

			return "";

		}

		public String DOOR_TYPE_IDOriginalDbColumnName() {

			return "DOOR_TYPE_ID";

		}

		public String REQUESTOR_NAME;

		public String getREQUESTOR_NAME() {
			return this.REQUESTOR_NAME;
		}

		public Boolean REQUESTOR_NAMEIsNullable() {
			return true;
		}

		public Boolean REQUESTOR_NAMEIsKey() {
			return false;
		}

		public Integer REQUESTOR_NAMELength() {
			return null;
		}

		public Integer REQUESTOR_NAMEPrecision() {
			return null;
		}

		public String REQUESTOR_NAMEDefault() {

			return "";

		}

		public String REQUESTOR_NAMEComment() {

			return "";

		}

		public String REQUESTOR_NAMEPattern() {

			return "";

		}

		public String REQUESTOR_NAMEOriginalDbColumnName() {

			return "REQUESTOR_NAME";

		}

		public BigDecimal REQUESTOR_TYPE_ID;

		public BigDecimal getREQUESTOR_TYPE_ID() {
			return this.REQUESTOR_TYPE_ID;
		}

		public Boolean REQUESTOR_TYPE_IDIsNullable() {
			return true;
		}

		public Boolean REQUESTOR_TYPE_IDIsKey() {
			return false;
		}

		public Integer REQUESTOR_TYPE_IDLength() {
			return null;
		}

		public Integer REQUESTOR_TYPE_IDPrecision() {
			return null;
		}

		public String REQUESTOR_TYPE_IDDefault() {

			return "";

		}

		public String REQUESTOR_TYPE_IDComment() {

			return "";

		}

		public String REQUESTOR_TYPE_IDPattern() {

			return "";

		}

		public String REQUESTOR_TYPE_IDOriginalDbColumnName() {

			return "REQUESTOR_TYPE_ID";

		}

		public BigDecimal TEMPLATE_ID;

		public BigDecimal getTEMPLATE_ID() {
			return this.TEMPLATE_ID;
		}

		public Boolean TEMPLATE_IDIsNullable() {
			return true;
		}

		public Boolean TEMPLATE_IDIsKey() {
			return false;
		}

		public Integer TEMPLATE_IDLength() {
			return null;
		}

		public Integer TEMPLATE_IDPrecision() {
			return null;
		}

		public String TEMPLATE_IDDefault() {

			return "";

		}

		public String TEMPLATE_IDComment() {

			return "";

		}

		public String TEMPLATE_IDPattern() {

			return "";

		}

		public String TEMPLATE_IDOriginalDbColumnName() {

			return "TEMPLATE_ID";

		}

		public String TEMPLATE_FLAG;

		public String getTEMPLATE_FLAG() {
			return this.TEMPLATE_FLAG;
		}

		public Boolean TEMPLATE_FLAGIsNullable() {
			return true;
		}

		public Boolean TEMPLATE_FLAGIsKey() {
			return false;
		}

		public Integer TEMPLATE_FLAGLength() {
			return null;
		}

		public Integer TEMPLATE_FLAGPrecision() {
			return null;
		}

		public String TEMPLATE_FLAGDefault() {

			return "";

		}

		public String TEMPLATE_FLAGComment() {

			return "";

		}

		public String TEMPLATE_FLAGPattern() {

			return "";

		}

		public String TEMPLATE_FLAGOriginalDbColumnName() {

			return "TEMPLATE_FLAG";

		}

		public BigDecimal TP_COMPANY_ID;

		public BigDecimal getTP_COMPANY_ID() {
			return this.TP_COMPANY_ID;
		}

		public Boolean TP_COMPANY_IDIsNullable() {
			return true;
		}

		public Boolean TP_COMPANY_IDIsKey() {
			return false;
		}

		public Integer TP_COMPANY_IDLength() {
			return null;
		}

		public Integer TP_COMPANY_IDPrecision() {
			return null;
		}

		public String TP_COMPANY_IDDefault() {

			return "";

		}

		public String TP_COMPANY_IDComment() {

			return "";

		}

		public String TP_COMPANY_IDPattern() {

			return "";

		}

		public String TP_COMPANY_IDOriginalDbColumnName() {

			return "TP_COMPANY_ID";

		}

		public String LOADING_TYPE;

		public String getLOADING_TYPE() {
			return this.LOADING_TYPE;
		}

		public Boolean LOADING_TYPEIsNullable() {
			return true;
		}

		public Boolean LOADING_TYPEIsKey() {
			return false;
		}

		public Integer LOADING_TYPELength() {
			return null;
		}

		public Integer LOADING_TYPEPrecision() {
			return null;
		}

		public String LOADING_TYPEDefault() {

			return "";

		}

		public String LOADING_TYPEComment() {

			return "";

		}

		public String LOADING_TYPEPattern() {

			return "";

		}

		public String LOADING_TYPEOriginalDbColumnName() {

			return "LOADING_TYPE";

		}

		public BigDecimal ILM_LOAD_POSITION;

		public BigDecimal getILM_LOAD_POSITION() {
			return this.ILM_LOAD_POSITION;
		}

		public Boolean ILM_LOAD_POSITIONIsNullable() {
			return true;
		}

		public Boolean ILM_LOAD_POSITIONIsKey() {
			return false;
		}

		public Integer ILM_LOAD_POSITIONLength() {
			return null;
		}

		public Integer ILM_LOAD_POSITIONPrecision() {
			return null;
		}

		public String ILM_LOAD_POSITIONDefault() {

			return "";

		}

		public String ILM_LOAD_POSITIONComment() {

			return "";

		}

		public String ILM_LOAD_POSITIONPattern() {

			return "";

		}

		public String ILM_LOAD_POSITIONOriginalDbColumnName() {

			return "ILM_LOAD_POSITION";

		}

		public String SEAL_NUMBER;

		public String getSEAL_NUMBER() {
			return this.SEAL_NUMBER;
		}

		public Boolean SEAL_NUMBERIsNullable() {
			return true;
		}

		public Boolean SEAL_NUMBERIsKey() {
			return false;
		}

		public Integer SEAL_NUMBERLength() {
			return null;
		}

		public Integer SEAL_NUMBERPrecision() {
			return null;
		}

		public String SEAL_NUMBERDefault() {

			return "";

		}

		public String SEAL_NUMBERComment() {

			return "";

		}

		public String SEAL_NUMBERPattern() {

			return "";

		}

		public String SEAL_NUMBEROriginalDbColumnName() {

			return "SEAL_NUMBER";

		}

		public BigDecimal IS_SEAL_NUMBER_VERIFIED;

		public BigDecimal getIS_SEAL_NUMBER_VERIFIED() {
			return this.IS_SEAL_NUMBER_VERIFIED;
		}

		public Boolean IS_SEAL_NUMBER_VERIFIEDIsNullable() {
			return true;
		}

		public Boolean IS_SEAL_NUMBER_VERIFIEDIsKey() {
			return false;
		}

		public Integer IS_SEAL_NUMBER_VERIFIEDLength() {
			return null;
		}

		public Integer IS_SEAL_NUMBER_VERIFIEDPrecision() {
			return null;
		}

		public String IS_SEAL_NUMBER_VERIFIEDDefault() {

			return "";

		}

		public String IS_SEAL_NUMBER_VERIFIEDComment() {

			return "";

		}

		public String IS_SEAL_NUMBER_VERIFIEDPattern() {

			return "";

		}

		public String IS_SEAL_NUMBER_VERIFIEDOriginalDbColumnName() {

			return "IS_SEAL_NUMBER_VERIFIED";

		}

		public String BEEPER_NUMBER;

		public String getBEEPER_NUMBER() {
			return this.BEEPER_NUMBER;
		}

		public Boolean BEEPER_NUMBERIsNullable() {
			return true;
		}

		public Boolean BEEPER_NUMBERIsKey() {
			return false;
		}

		public Integer BEEPER_NUMBERLength() {
			return null;
		}

		public Integer BEEPER_NUMBERPrecision() {
			return null;
		}

		public String BEEPER_NUMBERDefault() {

			return "";

		}

		public String BEEPER_NUMBERComment() {

			return "";

		}

		public String BEEPER_NUMBERPattern() {

			return "";

		}

		public String BEEPER_NUMBEROriginalDbColumnName() {

			return "BEEPER_NUMBER";

		}

		public BigDecimal CARRIER_ID;

		public BigDecimal getCARRIER_ID() {
			return this.CARRIER_ID;
		}

		public Boolean CARRIER_IDIsNullable() {
			return true;
		}

		public Boolean CARRIER_IDIsKey() {
			return false;
		}

		public Integer CARRIER_IDLength() {
			return null;
		}

		public Integer CARRIER_IDPrecision() {
			return null;
		}

		public String CARRIER_IDDefault() {

			return "";

		}

		public String CARRIER_IDComment() {

			return "";

		}

		public String CARRIER_IDPattern() {

			return "";

		}

		public String CARRIER_IDOriginalDbColumnName() {

			return "CARRIER_ID";

		}

		public BigDecimal REASON_ID;

		public BigDecimal getREASON_ID() {
			return this.REASON_ID;
		}

		public Boolean REASON_IDIsNullable() {
			return true;
		}

		public Boolean REASON_IDIsKey() {
			return false;
		}

		public Integer REASON_IDLength() {
			return null;
		}

		public Integer REASON_IDPrecision() {
			return null;
		}

		public String REASON_IDDefault() {

			return "";

		}

		public String REASON_IDComment() {

			return "";

		}

		public String REASON_IDPattern() {

			return "";

		}

		public String REASON_IDOriginalDbColumnName() {

			return "REASON_ID";

		}

		public BigDecimal APPT_REASON_ID;

		public BigDecimal getAPPT_REASON_ID() {
			return this.APPT_REASON_ID;
		}

		public Boolean APPT_REASON_IDIsNullable() {
			return true;
		}

		public Boolean APPT_REASON_IDIsKey() {
			return false;
		}

		public Integer APPT_REASON_IDLength() {
			return null;
		}

		public Integer APPT_REASON_IDPrecision() {
			return null;
		}

		public String APPT_REASON_IDDefault() {

			return "";

		}

		public String APPT_REASON_IDComment() {

			return "";

		}

		public String APPT_REASON_IDPattern() {

			return "";

		}

		public String APPT_REASON_IDOriginalDbColumnName() {

			return "APPT_REASON_ID";

		}

		public BigDecimal ORIGIN_FACILITY;

		public BigDecimal getORIGIN_FACILITY() {
			return this.ORIGIN_FACILITY;
		}

		public Boolean ORIGIN_FACILITYIsNullable() {
			return true;
		}

		public Boolean ORIGIN_FACILITYIsKey() {
			return false;
		}

		public Integer ORIGIN_FACILITYLength() {
			return null;
		}

		public Integer ORIGIN_FACILITYPrecision() {
			return null;
		}

		public String ORIGIN_FACILITYDefault() {

			return "";

		}

		public String ORIGIN_FACILITYComment() {

			return "";

		}

		public String ORIGIN_FACILITYPattern() {

			return "";

		}

		public String ORIGIN_FACILITYOriginalDbColumnName() {

			return "ORIGIN_FACILITY";

		}

		public BigDecimal EQUIPMENT_ID;

		public BigDecimal getEQUIPMENT_ID() {
			return this.EQUIPMENT_ID;
		}

		public Boolean EQUIPMENT_IDIsNullable() {
			return true;
		}

		public Boolean EQUIPMENT_IDIsKey() {
			return false;
		}

		public Integer EQUIPMENT_IDLength() {
			return null;
		}

		public Integer EQUIPMENT_IDPrecision() {
			return null;
		}

		public String EQUIPMENT_IDDefault() {

			return "";

		}

		public String EQUIPMENT_IDComment() {

			return "";

		}

		public String EQUIPMENT_IDPattern() {

			return "";

		}

		public String EQUIPMENT_IDOriginalDbColumnName() {

			return "EQUIPMENT_ID";

		}

		public BigDecimal BP_COMPANY_ID;

		public BigDecimal getBP_COMPANY_ID() {
			return this.BP_COMPANY_ID;
		}

		public Boolean BP_COMPANY_IDIsNullable() {
			return true;
		}

		public Boolean BP_COMPANY_IDIsKey() {
			return false;
		}

		public Integer BP_COMPANY_IDLength() {
			return null;
		}

		public Integer BP_COMPANY_IDPrecision() {
			return null;
		}

		public String BP_COMPANY_IDDefault() {

			return "";

		}

		public String BP_COMPANY_IDComment() {

			return "";

		}

		public String BP_COMPANY_IDPattern() {

			return "";

		}

		public String BP_COMPANY_IDOriginalDbColumnName() {

			return "BP_COMPANY_ID";

		}

		public java.util.Date REQUESTED_DTTM;

		public java.util.Date getREQUESTED_DTTM() {
			return this.REQUESTED_DTTM;
		}

		public Boolean REQUESTED_DTTMIsNullable() {
			return true;
		}

		public Boolean REQUESTED_DTTMIsKey() {
			return false;
		}

		public Integer REQUESTED_DTTMLength() {
			return null;
		}

		public Integer REQUESTED_DTTMPrecision() {
			return null;
		}

		public String REQUESTED_DTTMDefault() {

			return "";

		}

		public String REQUESTED_DTTMComment() {

			return "";

		}

		public String REQUESTED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String REQUESTED_DTTMOriginalDbColumnName() {

			return "REQUESTED_DTTM";

		}

		public java.util.Date SCHED_DEPARTURE_DTTM;

		public java.util.Date getSCHED_DEPARTURE_DTTM() {
			return this.SCHED_DEPARTURE_DTTM;
		}

		public Boolean SCHED_DEPARTURE_DTTMIsNullable() {
			return true;
		}

		public Boolean SCHED_DEPARTURE_DTTMIsKey() {
			return false;
		}

		public Integer SCHED_DEPARTURE_DTTMLength() {
			return null;
		}

		public Integer SCHED_DEPARTURE_DTTMPrecision() {
			return null;
		}

		public String SCHED_DEPARTURE_DTTMDefault() {

			return "";

		}

		public String SCHED_DEPARTURE_DTTMComment() {

			return "";

		}

		public String SCHED_DEPARTURE_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String SCHED_DEPARTURE_DTTMOriginalDbColumnName() {

			return "SCHED_DEPARTURE_DTTM";

		}

		public java.util.Date EST_DEPARTURE_DTTM;

		public java.util.Date getEST_DEPARTURE_DTTM() {
			return this.EST_DEPARTURE_DTTM;
		}

		public Boolean EST_DEPARTURE_DTTMIsNullable() {
			return true;
		}

		public Boolean EST_DEPARTURE_DTTMIsKey() {
			return false;
		}

		public Integer EST_DEPARTURE_DTTMLength() {
			return null;
		}

		public Integer EST_DEPARTURE_DTTMPrecision() {
			return null;
		}

		public String EST_DEPARTURE_DTTMDefault() {

			return "";

		}

		public String EST_DEPARTURE_DTTMComment() {

			return "";

		}

		public String EST_DEPARTURE_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String EST_DEPARTURE_DTTMOriginalDbColumnName() {

			return "EST_DEPARTURE_DTTM";

		}

		public BigDecimal DRIVER_DURATION_ON_YARD;

		public BigDecimal getDRIVER_DURATION_ON_YARD() {
			return this.DRIVER_DURATION_ON_YARD;
		}

		public Boolean DRIVER_DURATION_ON_YARDIsNullable() {
			return true;
		}

		public Boolean DRIVER_DURATION_ON_YARDIsKey() {
			return false;
		}

		public Integer DRIVER_DURATION_ON_YARDLength() {
			return null;
		}

		public Integer DRIVER_DURATION_ON_YARDPrecision() {
			return null;
		}

		public String DRIVER_DURATION_ON_YARDDefault() {

			return "";

		}

		public String DRIVER_DURATION_ON_YARDComment() {

			return "";

		}

		public String DRIVER_DURATION_ON_YARDPattern() {

			return "";

		}

		public String DRIVER_DURATION_ON_YARDOriginalDbColumnName() {

			return "DRIVER_DURATION_ON_YARD";

		}

		public BigDecimal RESERVED_APPT_ID;

		public BigDecimal getRESERVED_APPT_ID() {
			return this.RESERVED_APPT_ID;
		}

		public Boolean RESERVED_APPT_IDIsNullable() {
			return true;
		}

		public Boolean RESERVED_APPT_IDIsKey() {
			return false;
		}

		public Integer RESERVED_APPT_IDLength() {
			return null;
		}

		public Integer RESERVED_APPT_IDPrecision() {
			return null;
		}

		public String RESERVED_APPT_IDDefault() {

			return "";

		}

		public String RESERVED_APPT_IDComment() {

			return "";

		}

		public String RESERVED_APPT_IDPattern() {

			return "";

		}

		public String RESERVED_APPT_IDOriginalDbColumnName() {

			return "RESERVED_APPT_ID";

		}

		public BigDecimal CANCELLED_REASON_CODE;

		public BigDecimal getCANCELLED_REASON_CODE() {
			return this.CANCELLED_REASON_CODE;
		}

		public Boolean CANCELLED_REASON_CODEIsNullable() {
			return true;
		}

		public Boolean CANCELLED_REASON_CODEIsKey() {
			return false;
		}

		public Integer CANCELLED_REASON_CODELength() {
			return null;
		}

		public Integer CANCELLED_REASON_CODEPrecision() {
			return null;
		}

		public String CANCELLED_REASON_CODEDefault() {

			return "";

		}

		public String CANCELLED_REASON_CODEComment() {

			return "";

		}

		public String CANCELLED_REASON_CODEPattern() {

			return "";

		}

		public String CANCELLED_REASON_CODEOriginalDbColumnName() {

			return "CANCELLED_REASON_CODE";

		}

		public String CREATED_COMPANY_TYPE;

		public String getCREATED_COMPANY_TYPE() {
			return this.CREATED_COMPANY_TYPE;
		}

		public Boolean CREATED_COMPANY_TYPEIsNullable() {
			return true;
		}

		public Boolean CREATED_COMPANY_TYPEIsKey() {
			return false;
		}

		public Integer CREATED_COMPANY_TYPELength() {
			return null;
		}

		public Integer CREATED_COMPANY_TYPEPrecision() {
			return null;
		}

		public String CREATED_COMPANY_TYPEDefault() {

			return "";

		}

		public String CREATED_COMPANY_TYPEComment() {

			return "";

		}

		public String CREATED_COMPANY_TYPEPattern() {

			return "";

		}

		public String CREATED_COMPANY_TYPEOriginalDbColumnName() {

			return "CREATED_COMPANY_TYPE";

		}

		public BigDecimal TRAILER_DURATION;

		public BigDecimal getTRAILER_DURATION() {
			return this.TRAILER_DURATION;
		}

		public Boolean TRAILER_DURATIONIsNullable() {
			return true;
		}

		public Boolean TRAILER_DURATIONIsKey() {
			return false;
		}

		public Integer TRAILER_DURATIONLength() {
			return null;
		}

		public Integer TRAILER_DURATIONPrecision() {
			return null;
		}

		public String TRAILER_DURATIONDefault() {

			return "";

		}

		public String TRAILER_DURATIONComment() {

			return "";

		}

		public String TRAILER_DURATIONPattern() {

			return "";

		}

		public String TRAILER_DURATIONOriginalDbColumnName() {

			return "TRAILER_DURATION";

		}

		public String DRIVER_NAME;

		public String getDRIVER_NAME() {
			return this.DRIVER_NAME;
		}

		public Boolean DRIVER_NAMEIsNullable() {
			return true;
		}

		public Boolean DRIVER_NAMEIsKey() {
			return false;
		}

		public Integer DRIVER_NAMELength() {
			return null;
		}

		public Integer DRIVER_NAMEPrecision() {
			return null;
		}

		public String DRIVER_NAMEDefault() {

			return "";

		}

		public String DRIVER_NAMEComment() {

			return "";

		}

		public String DRIVER_NAMEPattern() {

			return "";

		}

		public String DRIVER_NAMEOriginalDbColumnName() {

			return "DRIVER_NAME";

		}

		public String DRIVER_LICENSE;

		public String getDRIVER_LICENSE() {
			return this.DRIVER_LICENSE;
		}

		public Boolean DRIVER_LICENSEIsNullable() {
			return true;
		}

		public Boolean DRIVER_LICENSEIsKey() {
			return false;
		}

		public Integer DRIVER_LICENSELength() {
			return null;
		}

		public Integer DRIVER_LICENSEPrecision() {
			return null;
		}

		public String DRIVER_LICENSEDefault() {

			return "";

		}

		public String DRIVER_LICENSEComment() {

			return "";

		}

		public String DRIVER_LICENSEPattern() {

			return "";

		}

		public String DRIVER_LICENSEOriginalDbColumnName() {

			return "DRIVER_LICENSE";

		}

		public String DRIVER_LICENSE_STATE;

		public String getDRIVER_LICENSE_STATE() {
			return this.DRIVER_LICENSE_STATE;
		}

		public Boolean DRIVER_LICENSE_STATEIsNullable() {
			return true;
		}

		public Boolean DRIVER_LICENSE_STATEIsKey() {
			return false;
		}

		public Integer DRIVER_LICENSE_STATELength() {
			return null;
		}

		public Integer DRIVER_LICENSE_STATEPrecision() {
			return null;
		}

		public String DRIVER_LICENSE_STATEDefault() {

			return "";

		}

		public String DRIVER_LICENSE_STATEComment() {

			return "";

		}

		public String DRIVER_LICENSE_STATEPattern() {

			return "";

		}

		public String DRIVER_LICENSE_STATEOriginalDbColumnName() {

			return "DRIVER_LICENSE_STATE";

		}

		public java.util.Date LATEST_DELIVERY_DTTM;

		public java.util.Date getLATEST_DELIVERY_DTTM() {
			return this.LATEST_DELIVERY_DTTM;
		}

		public Boolean LATEST_DELIVERY_DTTMIsNullable() {
			return true;
		}

		public Boolean LATEST_DELIVERY_DTTMIsKey() {
			return false;
		}

		public Integer LATEST_DELIVERY_DTTMLength() {
			return null;
		}

		public Integer LATEST_DELIVERY_DTTMPrecision() {
			return null;
		}

		public String LATEST_DELIVERY_DTTMDefault() {

			return "";

		}

		public String LATEST_DELIVERY_DTTMComment() {

			return "";

		}

		public String LATEST_DELIVERY_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String LATEST_DELIVERY_DTTMOriginalDbColumnName() {

			return "LATEST_DELIVERY_DTTM";

		}

		public BigDecimal RESERVE_TYPE;

		public BigDecimal getRESERVE_TYPE() {
			return this.RESERVE_TYPE;
		}

		public Boolean RESERVE_TYPEIsNullable() {
			return true;
		}

		public Boolean RESERVE_TYPEIsKey() {
			return false;
		}

		public Integer RESERVE_TYPELength() {
			return null;
		}

		public Integer RESERVE_TYPEPrecision() {
			return null;
		}

		public String RESERVE_TYPEDefault() {

			return "";

		}

		public String RESERVE_TYPEComment() {

			return "";

		}

		public String RESERVE_TYPEPattern() {

			return "";

		}

		public String RESERVE_TYPEOriginalDbColumnName() {

			return "RESERVE_TYPE";

		}

		public BigDecimal HAS_SOFT_CHECK_ERRORS;

		public BigDecimal getHAS_SOFT_CHECK_ERRORS() {
			return this.HAS_SOFT_CHECK_ERRORS;
		}

		public Boolean HAS_SOFT_CHECK_ERRORSIsNullable() {
			return true;
		}

		public Boolean HAS_SOFT_CHECK_ERRORSIsKey() {
			return false;
		}

		public Integer HAS_SOFT_CHECK_ERRORSLength() {
			return null;
		}

		public Integer HAS_SOFT_CHECK_ERRORSPrecision() {
			return null;
		}

		public String HAS_SOFT_CHECK_ERRORSDefault() {

			return "";

		}

		public String HAS_SOFT_CHECK_ERRORSComment() {

			return "";

		}

		public String HAS_SOFT_CHECK_ERRORSPattern() {

			return "";

		}

		public String HAS_SOFT_CHECK_ERRORSOriginalDbColumnName() {

			return "HAS_SOFT_CHECK_ERRORS";

		}

		public java.util.Date ARCHIVE_DTTM;

		public java.util.Date getARCHIVE_DTTM() {
			return this.ARCHIVE_DTTM;
		}

		public Boolean ARCHIVE_DTTMIsNullable() {
			return true;
		}

		public Boolean ARCHIVE_DTTMIsKey() {
			return false;
		}

		public Integer ARCHIVE_DTTMLength() {
			return null;
		}

		public Integer ARCHIVE_DTTMPrecision() {
			return null;
		}

		public String ARCHIVE_DTTMDefault() {

			return "";

		}

		public String ARCHIVE_DTTMComment() {

			return "";

		}

		public String ARCHIVE_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String ARCHIVE_DTTMOriginalDbColumnName() {

			return "ARCHIVE_DTTM";

		}

		public BigDecimal HAS_IMPORT_ERROR;

		public BigDecimal getHAS_IMPORT_ERROR() {
			return this.HAS_IMPORT_ERROR;
		}

		public Boolean HAS_IMPORT_ERRORIsNullable() {
			return true;
		}

		public Boolean HAS_IMPORT_ERRORIsKey() {
			return false;
		}

		public Integer HAS_IMPORT_ERRORLength() {
			return null;
		}

		public Integer HAS_IMPORT_ERRORPrecision() {
			return null;
		}

		public String HAS_IMPORT_ERRORDefault() {

			return "";

		}

		public String HAS_IMPORT_ERRORComment() {

			return "";

		}

		public String HAS_IMPORT_ERRORPattern() {

			return "";

		}

		public String HAS_IMPORT_ERROROriginalDbColumnName() {

			return "HAS_IMPORT_ERROR";

		}

		public BigDecimal HAS_ALERTS;

		public BigDecimal getHAS_ALERTS() {
			return this.HAS_ALERTS;
		}

		public Boolean HAS_ALERTSIsNullable() {
			return true;
		}

		public Boolean HAS_ALERTSIsKey() {
			return false;
		}

		public Integer HAS_ALERTSLength() {
			return null;
		}

		public Integer HAS_ALERTSPrecision() {
			return null;
		}

		public String HAS_ALERTSDefault() {

			return "";

		}

		public String HAS_ALERTSComment() {

			return "";

		}

		public String HAS_ALERTSPattern() {

			return "";

		}

		public String HAS_ALERTSOriginalDbColumnName() {

			return "HAS_ALERTS";

		}

		public java.util.Date ACTUAL_CHECKIN_DTTM;

		public java.util.Date getACTUAL_CHECKIN_DTTM() {
			return this.ACTUAL_CHECKIN_DTTM;
		}

		public Boolean ACTUAL_CHECKIN_DTTMIsNullable() {
			return true;
		}

		public Boolean ACTUAL_CHECKIN_DTTMIsKey() {
			return false;
		}

		public Integer ACTUAL_CHECKIN_DTTMLength() {
			return null;
		}

		public Integer ACTUAL_CHECKIN_DTTMPrecision() {
			return null;
		}

		public String ACTUAL_CHECKIN_DTTMDefault() {

			return "";

		}

		public String ACTUAL_CHECKIN_DTTMComment() {

			return "";

		}

		public String ACTUAL_CHECKIN_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String ACTUAL_CHECKIN_DTTMOriginalDbColumnName() {

			return "ACTUAL_CHECKIN_DTTM";

		}

		public java.util.Date SCHEDULED_DTTM;

		public java.util.Date getSCHEDULED_DTTM() {
			return this.SCHEDULED_DTTM;
		}

		public Boolean SCHEDULED_DTTMIsNullable() {
			return true;
		}

		public Boolean SCHEDULED_DTTMIsKey() {
			return false;
		}

		public Integer SCHEDULED_DTTMLength() {
			return null;
		}

		public Integer SCHEDULED_DTTMPrecision() {
			return null;
		}

		public String SCHEDULED_DTTMDefault() {

			return "";

		}

		public String SCHEDULED_DTTMComment() {

			return "";

		}

		public String SCHEDULED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String SCHEDULED_DTTMOriginalDbColumnName() {

			return "SCHEDULED_DTTM";

		}

		public java.util.Date CREATED_DTTM;

		public java.util.Date getCREATED_DTTM() {
			return this.CREATED_DTTM;
		}

		public Boolean CREATED_DTTMIsNullable() {
			return true;
		}

		public Boolean CREATED_DTTMIsKey() {
			return false;
		}

		public Integer CREATED_DTTMLength() {
			return null;
		}

		public Integer CREATED_DTTMPrecision() {
			return null;
		}

		public String CREATED_DTTMDefault() {

			return "";

		}

		public String CREATED_DTTMComment() {

			return "";

		}

		public String CREATED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String CREATED_DTTMOriginalDbColumnName() {

			return "CREATED_DTTM";

		}

		public BigDecimal BP_ID;

		public BigDecimal getBP_ID() {
			return this.BP_ID;
		}

		public Boolean BP_IDIsNullable() {
			return true;
		}

		public Boolean BP_IDIsKey() {
			return false;
		}

		public Integer BP_IDLength() {
			return null;
		}

		public Integer BP_IDPrecision() {
			return null;
		}

		public String BP_IDDefault() {

			return "";

		}

		public String BP_IDComment() {

			return "";

		}

		public String BP_IDPattern() {

			return "";

		}

		public String BP_IDOriginalDbColumnName() {

			return "BP_ID";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length) {
					if (length < 1024
							&& commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.length == 0) {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES, 0, length,
						utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.APPOINTMENT_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.FACILITY_ID = (BigDecimal) dis.readObject();

					this.CURRENT_LOCATION_ID = (BigDecimal) dis.readObject();

					this.APPT_REASON_CODE = (BigDecimal) dis.readObject();

					this.COMMENTS = readString(dis);

					this.CARRIER_CODE = readString(dis);

					this.BUSINESS_PARTNER_ID = readString(dis);

					this.APPT_TYPE = (BigDecimal) dis.readObject();

					this.APPT_STATUS = (BigDecimal) dis.readObject();

					this.CHECKIN_DTTM = readDate(dis);

					this.CHECKUOUT_DTTM = readDate(dis);

					this.LOAD_UNLOAD_ST_DTTM = readDate(dis);

					this.LOAD_UNLOAD_END_DTTM = readDate(dis);

					this.APPT_PRIORITY = (BigDecimal) dis.readObject();

					this.REQUEST_COMM_TYPE = readString(dis);

					this.CREATED_SOURCE_TYPE = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE_DTTM = readDate(dis);

					this.CREATED_SOURCE = readString(dis);

					this.LAST_UPDATED_SOURCE_TYPE = (BigDecimal) dis.readObject();

					this.LAST_UPDATED_SOURCE = readString(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

					this.IS_TOP_FRIEGHT = readString(dis);

					this.TC_APPOINTMENT_ID = readString(dis);

					this.DRIVER_ID = (BigDecimal) dis.readObject();

					this.APPOINTMENT_CREATION_TYPE = (BigDecimal) dis.readObject();

					this.YARD_ID = (BigDecimal) dis.readObject();

					this.CONTROL_NO = readString(dis);

					this.DOCK_DOOR_ID = readString(dis);

					this.DOOR_TYPE_ID = readString(dis);

					this.REQUESTOR_NAME = readString(dis);

					this.REQUESTOR_TYPE_ID = (BigDecimal) dis.readObject();

					this.TEMPLATE_ID = (BigDecimal) dis.readObject();

					this.TEMPLATE_FLAG = readString(dis);

					this.TP_COMPANY_ID = (BigDecimal) dis.readObject();

					this.LOADING_TYPE = readString(dis);

					this.ILM_LOAD_POSITION = (BigDecimal) dis.readObject();

					this.SEAL_NUMBER = readString(dis);

					this.IS_SEAL_NUMBER_VERIFIED = (BigDecimal) dis.readObject();

					this.BEEPER_NUMBER = readString(dis);

					this.CARRIER_ID = (BigDecimal) dis.readObject();

					this.REASON_ID = (BigDecimal) dis.readObject();

					this.APPT_REASON_ID = (BigDecimal) dis.readObject();

					this.ORIGIN_FACILITY = (BigDecimal) dis.readObject();

					this.EQUIPMENT_ID = (BigDecimal) dis.readObject();

					this.BP_COMPANY_ID = (BigDecimal) dis.readObject();

					this.REQUESTED_DTTM = readDate(dis);

					this.SCHED_DEPARTURE_DTTM = readDate(dis);

					this.EST_DEPARTURE_DTTM = readDate(dis);

					this.DRIVER_DURATION_ON_YARD = (BigDecimal) dis.readObject();

					this.RESERVED_APPT_ID = (BigDecimal) dis.readObject();

					this.CANCELLED_REASON_CODE = (BigDecimal) dis.readObject();

					this.CREATED_COMPANY_TYPE = readString(dis);

					this.TRAILER_DURATION = (BigDecimal) dis.readObject();

					this.DRIVER_NAME = readString(dis);

					this.DRIVER_LICENSE = readString(dis);

					this.DRIVER_LICENSE_STATE = readString(dis);

					this.LATEST_DELIVERY_DTTM = readDate(dis);

					this.RESERVE_TYPE = (BigDecimal) dis.readObject();

					this.HAS_SOFT_CHECK_ERRORS = (BigDecimal) dis.readObject();

					this.ARCHIVE_DTTM = readDate(dis);

					this.HAS_IMPORT_ERROR = (BigDecimal) dis.readObject();

					this.HAS_ALERTS = (BigDecimal) dis.readObject();

					this.ACTUAL_CHECKIN_DTTM = readDate(dis);

					this.SCHEDULED_DTTM = readDate(dis);

					this.CREATED_DTTM = readDate(dis);

					this.BP_ID = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.APPOINTMENT_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.FACILITY_ID = (BigDecimal) dis.readObject();

					this.CURRENT_LOCATION_ID = (BigDecimal) dis.readObject();

					this.APPT_REASON_CODE = (BigDecimal) dis.readObject();

					this.COMMENTS = readString(dis);

					this.CARRIER_CODE = readString(dis);

					this.BUSINESS_PARTNER_ID = readString(dis);

					this.APPT_TYPE = (BigDecimal) dis.readObject();

					this.APPT_STATUS = (BigDecimal) dis.readObject();

					this.CHECKIN_DTTM = readDate(dis);

					this.CHECKUOUT_DTTM = readDate(dis);

					this.LOAD_UNLOAD_ST_DTTM = readDate(dis);

					this.LOAD_UNLOAD_END_DTTM = readDate(dis);

					this.APPT_PRIORITY = (BigDecimal) dis.readObject();

					this.REQUEST_COMM_TYPE = readString(dis);

					this.CREATED_SOURCE_TYPE = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE_DTTM = readDate(dis);

					this.CREATED_SOURCE = readString(dis);

					this.LAST_UPDATED_SOURCE_TYPE = (BigDecimal) dis.readObject();

					this.LAST_UPDATED_SOURCE = readString(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

					this.IS_TOP_FRIEGHT = readString(dis);

					this.TC_APPOINTMENT_ID = readString(dis);

					this.DRIVER_ID = (BigDecimal) dis.readObject();

					this.APPOINTMENT_CREATION_TYPE = (BigDecimal) dis.readObject();

					this.YARD_ID = (BigDecimal) dis.readObject();

					this.CONTROL_NO = readString(dis);

					this.DOCK_DOOR_ID = readString(dis);

					this.DOOR_TYPE_ID = readString(dis);

					this.REQUESTOR_NAME = readString(dis);

					this.REQUESTOR_TYPE_ID = (BigDecimal) dis.readObject();

					this.TEMPLATE_ID = (BigDecimal) dis.readObject();

					this.TEMPLATE_FLAG = readString(dis);

					this.TP_COMPANY_ID = (BigDecimal) dis.readObject();

					this.LOADING_TYPE = readString(dis);

					this.ILM_LOAD_POSITION = (BigDecimal) dis.readObject();

					this.SEAL_NUMBER = readString(dis);

					this.IS_SEAL_NUMBER_VERIFIED = (BigDecimal) dis.readObject();

					this.BEEPER_NUMBER = readString(dis);

					this.CARRIER_ID = (BigDecimal) dis.readObject();

					this.REASON_ID = (BigDecimal) dis.readObject();

					this.APPT_REASON_ID = (BigDecimal) dis.readObject();

					this.ORIGIN_FACILITY = (BigDecimal) dis.readObject();

					this.EQUIPMENT_ID = (BigDecimal) dis.readObject();

					this.BP_COMPANY_ID = (BigDecimal) dis.readObject();

					this.REQUESTED_DTTM = readDate(dis);

					this.SCHED_DEPARTURE_DTTM = readDate(dis);

					this.EST_DEPARTURE_DTTM = readDate(dis);

					this.DRIVER_DURATION_ON_YARD = (BigDecimal) dis.readObject();

					this.RESERVED_APPT_ID = (BigDecimal) dis.readObject();

					this.CANCELLED_REASON_CODE = (BigDecimal) dis.readObject();

					this.CREATED_COMPANY_TYPE = readString(dis);

					this.TRAILER_DURATION = (BigDecimal) dis.readObject();

					this.DRIVER_NAME = readString(dis);

					this.DRIVER_LICENSE = readString(dis);

					this.DRIVER_LICENSE_STATE = readString(dis);

					this.LATEST_DELIVERY_DTTM = readDate(dis);

					this.RESERVE_TYPE = (BigDecimal) dis.readObject();

					this.HAS_SOFT_CHECK_ERRORS = (BigDecimal) dis.readObject();

					this.ARCHIVE_DTTM = readDate(dis);

					this.HAS_IMPORT_ERROR = (BigDecimal) dis.readObject();

					this.HAS_ALERTS = (BigDecimal) dis.readObject();

					this.ACTUAL_CHECKIN_DTTM = readDate(dis);

					this.SCHEDULED_DTTM = readDate(dis);

					this.CREATED_DTTM = readDate(dis);

					this.BP_ID = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.APPOINTMENT_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// BigDecimal

				dos.writeObject(this.FACILITY_ID);

				// BigDecimal

				dos.writeObject(this.CURRENT_LOCATION_ID);

				// BigDecimal

				dos.writeObject(this.APPT_REASON_CODE);

				// String

				writeString(this.COMMENTS, dos);

				// String

				writeString(this.CARRIER_CODE, dos);

				// String

				writeString(this.BUSINESS_PARTNER_ID, dos);

				// BigDecimal

				dos.writeObject(this.APPT_TYPE);

				// BigDecimal

				dos.writeObject(this.APPT_STATUS);

				// java.util.Date

				writeDate(this.CHECKIN_DTTM, dos);

				// java.util.Date

				writeDate(this.CHECKUOUT_DTTM, dos);

				// java.util.Date

				writeDate(this.LOAD_UNLOAD_ST_DTTM, dos);

				// java.util.Date

				writeDate(this.LOAD_UNLOAD_END_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.APPT_PRIORITY);

				// String

				writeString(this.REQUEST_COMM_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.CREATED_SOURCE_TYPE);

				// java.util.Date

				writeDate(this.CREATED_SOURCE_DTTM, dos);

				// String

				writeString(this.CREATED_SOURCE, dos);

				// BigDecimal

				dos.writeObject(this.LAST_UPDATED_SOURCE_TYPE);

				// String

				writeString(this.LAST_UPDATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

				// String

				writeString(this.IS_TOP_FRIEGHT, dos);

				// String

				writeString(this.TC_APPOINTMENT_ID, dos);

				// BigDecimal

				dos.writeObject(this.DRIVER_ID);

				// BigDecimal

				dos.writeObject(this.APPOINTMENT_CREATION_TYPE);

				// BigDecimal

				dos.writeObject(this.YARD_ID);

				// String

				writeString(this.CONTROL_NO, dos);

				// String

				writeString(this.DOCK_DOOR_ID, dos);

				// String

				writeString(this.DOOR_TYPE_ID, dos);

				// String

				writeString(this.REQUESTOR_NAME, dos);

				// BigDecimal

				dos.writeObject(this.REQUESTOR_TYPE_ID);

				// BigDecimal

				dos.writeObject(this.TEMPLATE_ID);

				// String

				writeString(this.TEMPLATE_FLAG, dos);

				// BigDecimal

				dos.writeObject(this.TP_COMPANY_ID);

				// String

				writeString(this.LOADING_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.ILM_LOAD_POSITION);

				// String

				writeString(this.SEAL_NUMBER, dos);

				// BigDecimal

				dos.writeObject(this.IS_SEAL_NUMBER_VERIFIED);

				// String

				writeString(this.BEEPER_NUMBER, dos);

				// BigDecimal

				dos.writeObject(this.CARRIER_ID);

				// BigDecimal

				dos.writeObject(this.REASON_ID);

				// BigDecimal

				dos.writeObject(this.APPT_REASON_ID);

				// BigDecimal

				dos.writeObject(this.ORIGIN_FACILITY);

				// BigDecimal

				dos.writeObject(this.EQUIPMENT_ID);

				// BigDecimal

				dos.writeObject(this.BP_COMPANY_ID);

				// java.util.Date

				writeDate(this.REQUESTED_DTTM, dos);

				// java.util.Date

				writeDate(this.SCHED_DEPARTURE_DTTM, dos);

				// java.util.Date

				writeDate(this.EST_DEPARTURE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.DRIVER_DURATION_ON_YARD);

				// BigDecimal

				dos.writeObject(this.RESERVED_APPT_ID);

				// BigDecimal

				dos.writeObject(this.CANCELLED_REASON_CODE);

				// String

				writeString(this.CREATED_COMPANY_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.TRAILER_DURATION);

				// String

				writeString(this.DRIVER_NAME, dos);

				// String

				writeString(this.DRIVER_LICENSE, dos);

				// String

				writeString(this.DRIVER_LICENSE_STATE, dos);

				// java.util.Date

				writeDate(this.LATEST_DELIVERY_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.RESERVE_TYPE);

				// BigDecimal

				dos.writeObject(this.HAS_SOFT_CHECK_ERRORS);

				// java.util.Date

				writeDate(this.ARCHIVE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.HAS_IMPORT_ERROR);

				// BigDecimal

				dos.writeObject(this.HAS_ALERTS);

				// java.util.Date

				writeDate(this.ACTUAL_CHECKIN_DTTM, dos);

				// java.util.Date

				writeDate(this.SCHEDULED_DTTM, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.BP_ID);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.APPOINTMENT_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// BigDecimal

				dos.writeObject(this.FACILITY_ID);

				// BigDecimal

				dos.writeObject(this.CURRENT_LOCATION_ID);

				// BigDecimal

				dos.writeObject(this.APPT_REASON_CODE);

				// String

				writeString(this.COMMENTS, dos);

				// String

				writeString(this.CARRIER_CODE, dos);

				// String

				writeString(this.BUSINESS_PARTNER_ID, dos);

				// BigDecimal

				dos.writeObject(this.APPT_TYPE);

				// BigDecimal

				dos.writeObject(this.APPT_STATUS);

				// java.util.Date

				writeDate(this.CHECKIN_DTTM, dos);

				// java.util.Date

				writeDate(this.CHECKUOUT_DTTM, dos);

				// java.util.Date

				writeDate(this.LOAD_UNLOAD_ST_DTTM, dos);

				// java.util.Date

				writeDate(this.LOAD_UNLOAD_END_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.APPT_PRIORITY);

				// String

				writeString(this.REQUEST_COMM_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.CREATED_SOURCE_TYPE);

				// java.util.Date

				writeDate(this.CREATED_SOURCE_DTTM, dos);

				// String

				writeString(this.CREATED_SOURCE, dos);

				// BigDecimal

				dos.writeObject(this.LAST_UPDATED_SOURCE_TYPE);

				// String

				writeString(this.LAST_UPDATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

				// String

				writeString(this.IS_TOP_FRIEGHT, dos);

				// String

				writeString(this.TC_APPOINTMENT_ID, dos);

				// BigDecimal

				dos.writeObject(this.DRIVER_ID);

				// BigDecimal

				dos.writeObject(this.APPOINTMENT_CREATION_TYPE);

				// BigDecimal

				dos.writeObject(this.YARD_ID);

				// String

				writeString(this.CONTROL_NO, dos);

				// String

				writeString(this.DOCK_DOOR_ID, dos);

				// String

				writeString(this.DOOR_TYPE_ID, dos);

				// String

				writeString(this.REQUESTOR_NAME, dos);

				// BigDecimal

				dos.writeObject(this.REQUESTOR_TYPE_ID);

				// BigDecimal

				dos.writeObject(this.TEMPLATE_ID);

				// String

				writeString(this.TEMPLATE_FLAG, dos);

				// BigDecimal

				dos.writeObject(this.TP_COMPANY_ID);

				// String

				writeString(this.LOADING_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.ILM_LOAD_POSITION);

				// String

				writeString(this.SEAL_NUMBER, dos);

				// BigDecimal

				dos.writeObject(this.IS_SEAL_NUMBER_VERIFIED);

				// String

				writeString(this.BEEPER_NUMBER, dos);

				// BigDecimal

				dos.writeObject(this.CARRIER_ID);

				// BigDecimal

				dos.writeObject(this.REASON_ID);

				// BigDecimal

				dos.writeObject(this.APPT_REASON_ID);

				// BigDecimal

				dos.writeObject(this.ORIGIN_FACILITY);

				// BigDecimal

				dos.writeObject(this.EQUIPMENT_ID);

				// BigDecimal

				dos.writeObject(this.BP_COMPANY_ID);

				// java.util.Date

				writeDate(this.REQUESTED_DTTM, dos);

				// java.util.Date

				writeDate(this.SCHED_DEPARTURE_DTTM, dos);

				// java.util.Date

				writeDate(this.EST_DEPARTURE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.DRIVER_DURATION_ON_YARD);

				// BigDecimal

				dos.writeObject(this.RESERVED_APPT_ID);

				// BigDecimal

				dos.writeObject(this.CANCELLED_REASON_CODE);

				// String

				writeString(this.CREATED_COMPANY_TYPE, dos);

				// BigDecimal

				dos.writeObject(this.TRAILER_DURATION);

				// String

				writeString(this.DRIVER_NAME, dos);

				// String

				writeString(this.DRIVER_LICENSE, dos);

				// String

				writeString(this.DRIVER_LICENSE_STATE, dos);

				// java.util.Date

				writeDate(this.LATEST_DELIVERY_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.RESERVE_TYPE);

				// BigDecimal

				dos.writeObject(this.HAS_SOFT_CHECK_ERRORS);

				// java.util.Date

				writeDate(this.ARCHIVE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.HAS_IMPORT_ERROR);

				// BigDecimal

				dos.writeObject(this.HAS_ALERTS);

				// java.util.Date

				writeDate(this.ACTUAL_CHECKIN_DTTM, dos);

				// java.util.Date

				writeDate(this.SCHEDULED_DTTM, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.BP_ID);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("APPOINTMENT_ID=" + String.valueOf(APPOINTMENT_ID));
			sb.append(",COMPANY_ID=" + String.valueOf(COMPANY_ID));
			sb.append(",FACILITY_ID=" + String.valueOf(FACILITY_ID));
			sb.append(",CURRENT_LOCATION_ID=" + String.valueOf(CURRENT_LOCATION_ID));
			sb.append(",APPT_REASON_CODE=" + String.valueOf(APPT_REASON_CODE));
			sb.append(",COMMENTS=" + COMMENTS);
			sb.append(",CARRIER_CODE=" + CARRIER_CODE);
			sb.append(",BUSINESS_PARTNER_ID=" + BUSINESS_PARTNER_ID);
			sb.append(",APPT_TYPE=" + String.valueOf(APPT_TYPE));
			sb.append(",APPT_STATUS=" + String.valueOf(APPT_STATUS));
			sb.append(",CHECKIN_DTTM=" + String.valueOf(CHECKIN_DTTM));
			sb.append(",CHECKUOUT_DTTM=" + String.valueOf(CHECKUOUT_DTTM));
			sb.append(",LOAD_UNLOAD_ST_DTTM=" + String.valueOf(LOAD_UNLOAD_ST_DTTM));
			sb.append(",LOAD_UNLOAD_END_DTTM=" + String.valueOf(LOAD_UNLOAD_END_DTTM));
			sb.append(",APPT_PRIORITY=" + String.valueOf(APPT_PRIORITY));
			sb.append(",REQUEST_COMM_TYPE=" + REQUEST_COMM_TYPE);
			sb.append(",CREATED_SOURCE_TYPE=" + String.valueOf(CREATED_SOURCE_TYPE));
			sb.append(",CREATED_SOURCE_DTTM=" + String.valueOf(CREATED_SOURCE_DTTM));
			sb.append(",CREATED_SOURCE=" + CREATED_SOURCE);
			sb.append(",LAST_UPDATED_SOURCE_TYPE=" + String.valueOf(LAST_UPDATED_SOURCE_TYPE));
			sb.append(",LAST_UPDATED_SOURCE=" + LAST_UPDATED_SOURCE);
			sb.append(",LAST_UPDATED_DTTM=" + String.valueOf(LAST_UPDATED_DTTM));
			sb.append(",IS_TOP_FRIEGHT=" + IS_TOP_FRIEGHT);
			sb.append(",TC_APPOINTMENT_ID=" + TC_APPOINTMENT_ID);
			sb.append(",DRIVER_ID=" + String.valueOf(DRIVER_ID));
			sb.append(",APPOINTMENT_CREATION_TYPE=" + String.valueOf(APPOINTMENT_CREATION_TYPE));
			sb.append(",YARD_ID=" + String.valueOf(YARD_ID));
			sb.append(",CONTROL_NO=" + CONTROL_NO);
			sb.append(",DOCK_DOOR_ID=" + DOCK_DOOR_ID);
			sb.append(",DOOR_TYPE_ID=" + DOOR_TYPE_ID);
			sb.append(",REQUESTOR_NAME=" + REQUESTOR_NAME);
			sb.append(",REQUESTOR_TYPE_ID=" + String.valueOf(REQUESTOR_TYPE_ID));
			sb.append(",TEMPLATE_ID=" + String.valueOf(TEMPLATE_ID));
			sb.append(",TEMPLATE_FLAG=" + TEMPLATE_FLAG);
			sb.append(",TP_COMPANY_ID=" + String.valueOf(TP_COMPANY_ID));
			sb.append(",LOADING_TYPE=" + LOADING_TYPE);
			sb.append(",ILM_LOAD_POSITION=" + String.valueOf(ILM_LOAD_POSITION));
			sb.append(",SEAL_NUMBER=" + SEAL_NUMBER);
			sb.append(",IS_SEAL_NUMBER_VERIFIED=" + String.valueOf(IS_SEAL_NUMBER_VERIFIED));
			sb.append(",BEEPER_NUMBER=" + BEEPER_NUMBER);
			sb.append(",CARRIER_ID=" + String.valueOf(CARRIER_ID));
			sb.append(",REASON_ID=" + String.valueOf(REASON_ID));
			sb.append(",APPT_REASON_ID=" + String.valueOf(APPT_REASON_ID));
			sb.append(",ORIGIN_FACILITY=" + String.valueOf(ORIGIN_FACILITY));
			sb.append(",EQUIPMENT_ID=" + String.valueOf(EQUIPMENT_ID));
			sb.append(",BP_COMPANY_ID=" + String.valueOf(BP_COMPANY_ID));
			sb.append(",REQUESTED_DTTM=" + String.valueOf(REQUESTED_DTTM));
			sb.append(",SCHED_DEPARTURE_DTTM=" + String.valueOf(SCHED_DEPARTURE_DTTM));
			sb.append(",EST_DEPARTURE_DTTM=" + String.valueOf(EST_DEPARTURE_DTTM));
			sb.append(",DRIVER_DURATION_ON_YARD=" + String.valueOf(DRIVER_DURATION_ON_YARD));
			sb.append(",RESERVED_APPT_ID=" + String.valueOf(RESERVED_APPT_ID));
			sb.append(",CANCELLED_REASON_CODE=" + String.valueOf(CANCELLED_REASON_CODE));
			sb.append(",CREATED_COMPANY_TYPE=" + CREATED_COMPANY_TYPE);
			sb.append(",TRAILER_DURATION=" + String.valueOf(TRAILER_DURATION));
			sb.append(",DRIVER_NAME=" + DRIVER_NAME);
			sb.append(",DRIVER_LICENSE=" + DRIVER_LICENSE);
			sb.append(",DRIVER_LICENSE_STATE=" + DRIVER_LICENSE_STATE);
			sb.append(",LATEST_DELIVERY_DTTM=" + String.valueOf(LATEST_DELIVERY_DTTM));
			sb.append(",RESERVE_TYPE=" + String.valueOf(RESERVE_TYPE));
			sb.append(",HAS_SOFT_CHECK_ERRORS=" + String.valueOf(HAS_SOFT_CHECK_ERRORS));
			sb.append(",ARCHIVE_DTTM=" + String.valueOf(ARCHIVE_DTTM));
			sb.append(",HAS_IMPORT_ERROR=" + String.valueOf(HAS_IMPORT_ERROR));
			sb.append(",HAS_ALERTS=" + String.valueOf(HAS_ALERTS));
			sb.append(",ACTUAL_CHECKIN_DTTM=" + String.valueOf(ACTUAL_CHECKIN_DTTM));
			sb.append(",SCHEDULED_DTTM=" + String.valueOf(SCHEDULED_DTTM));
			sb.append(",CREATED_DTTM=" + String.valueOf(CREATED_DTTM));
			sb.append(",BP_ID=" + String.valueOf(BP_ID));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (APPOINTMENT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(APPOINTMENT_ID);
			}

			sb.append("|");

			if (COMPANY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(COMPANY_ID);
			}

			sb.append("|");

			if (FACILITY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(FACILITY_ID);
			}

			sb.append("|");

			if (CURRENT_LOCATION_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CURRENT_LOCATION_ID);
			}

			sb.append("|");

			if (APPT_REASON_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_REASON_CODE);
			}

			sb.append("|");

			if (COMMENTS == null) {
				sb.append("<null>");
			} else {
				sb.append(COMMENTS);
			}

			sb.append("|");

			if (CARRIER_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(CARRIER_CODE);
			}

			sb.append("|");

			if (BUSINESS_PARTNER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(BUSINESS_PARTNER_ID);
			}

			sb.append("|");

			if (APPT_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_TYPE);
			}

			sb.append("|");

			if (APPT_STATUS == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_STATUS);
			}

			sb.append("|");

			if (CHECKIN_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CHECKIN_DTTM);
			}

			sb.append("|");

			if (CHECKUOUT_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CHECKUOUT_DTTM);
			}

			sb.append("|");

			if (LOAD_UNLOAD_ST_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_UNLOAD_ST_DTTM);
			}

			sb.append("|");

			if (LOAD_UNLOAD_END_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LOAD_UNLOAD_END_DTTM);
			}

			sb.append("|");

			if (APPT_PRIORITY == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_PRIORITY);
			}

			sb.append("|");

			if (REQUEST_COMM_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(REQUEST_COMM_TYPE);
			}

			sb.append("|");

			if (CREATED_SOURCE_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_SOURCE_TYPE);
			}

			sb.append("|");

			if (CREATED_SOURCE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_SOURCE_DTTM);
			}

			sb.append("|");

			if (CREATED_SOURCE == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_SOURCE);
			}

			sb.append("|");

			if (LAST_UPDATED_SOURCE_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_UPDATED_SOURCE_TYPE);
			}

			sb.append("|");

			if (LAST_UPDATED_SOURCE == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_UPDATED_SOURCE);
			}

			sb.append("|");

			if (LAST_UPDATED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_UPDATED_DTTM);
			}

			sb.append("|");

			if (IS_TOP_FRIEGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(IS_TOP_FRIEGHT);
			}

			sb.append("|");

			if (TC_APPOINTMENT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(TC_APPOINTMENT_ID);
			}

			sb.append("|");

			if (DRIVER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVER_ID);
			}

			sb.append("|");

			if (APPOINTMENT_CREATION_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(APPOINTMENT_CREATION_TYPE);
			}

			sb.append("|");

			if (YARD_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(YARD_ID);
			}

			sb.append("|");

			if (CONTROL_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(CONTROL_NO);
			}

			sb.append("|");

			if (DOCK_DOOR_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(DOCK_DOOR_ID);
			}

			sb.append("|");

			if (DOOR_TYPE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(DOOR_TYPE_ID);
			}

			sb.append("|");

			if (REQUESTOR_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(REQUESTOR_NAME);
			}

			sb.append("|");

			if (REQUESTOR_TYPE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(REQUESTOR_TYPE_ID);
			}

			sb.append("|");

			if (TEMPLATE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(TEMPLATE_ID);
			}

			sb.append("|");

			if (TEMPLATE_FLAG == null) {
				sb.append("<null>");
			} else {
				sb.append(TEMPLATE_FLAG);
			}

			sb.append("|");

			if (TP_COMPANY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(TP_COMPANY_ID);
			}

			sb.append("|");

			if (LOADING_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(LOADING_TYPE);
			}

			sb.append("|");

			if (ILM_LOAD_POSITION == null) {
				sb.append("<null>");
			} else {
				sb.append(ILM_LOAD_POSITION);
			}

			sb.append("|");

			if (SEAL_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(SEAL_NUMBER);
			}

			sb.append("|");

			if (IS_SEAL_NUMBER_VERIFIED == null) {
				sb.append("<null>");
			} else {
				sb.append(IS_SEAL_NUMBER_VERIFIED);
			}

			sb.append("|");

			if (BEEPER_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(BEEPER_NUMBER);
			}

			sb.append("|");

			if (CARRIER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CARRIER_ID);
			}

			sb.append("|");

			if (REASON_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(REASON_ID);
			}

			sb.append("|");

			if (APPT_REASON_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_REASON_ID);
			}

			sb.append("|");

			if (ORIGIN_FACILITY == null) {
				sb.append("<null>");
			} else {
				sb.append(ORIGIN_FACILITY);
			}

			sb.append("|");

			if (EQUIPMENT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(EQUIPMENT_ID);
			}

			sb.append("|");

			if (BP_COMPANY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(BP_COMPANY_ID);
			}

			sb.append("|");

			if (REQUESTED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(REQUESTED_DTTM);
			}

			sb.append("|");

			if (SCHED_DEPARTURE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(SCHED_DEPARTURE_DTTM);
			}

			sb.append("|");

			if (EST_DEPARTURE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(EST_DEPARTURE_DTTM);
			}

			sb.append("|");

			if (DRIVER_DURATION_ON_YARD == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVER_DURATION_ON_YARD);
			}

			sb.append("|");

			if (RESERVED_APPT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(RESERVED_APPT_ID);
			}

			sb.append("|");

			if (CANCELLED_REASON_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(CANCELLED_REASON_CODE);
			}

			sb.append("|");

			if (CREATED_COMPANY_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_COMPANY_TYPE);
			}

			sb.append("|");

			if (TRAILER_DURATION == null) {
				sb.append("<null>");
			} else {
				sb.append(TRAILER_DURATION);
			}

			sb.append("|");

			if (DRIVER_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVER_NAME);
			}

			sb.append("|");

			if (DRIVER_LICENSE == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVER_LICENSE);
			}

			sb.append("|");

			if (DRIVER_LICENSE_STATE == null) {
				sb.append("<null>");
			} else {
				sb.append(DRIVER_LICENSE_STATE);
			}

			sb.append("|");

			if (LATEST_DELIVERY_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LATEST_DELIVERY_DTTM);
			}

			sb.append("|");

			if (RESERVE_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(RESERVE_TYPE);
			}

			sb.append("|");

			if (HAS_SOFT_CHECK_ERRORS == null) {
				sb.append("<null>");
			} else {
				sb.append(HAS_SOFT_CHECK_ERRORS);
			}

			sb.append("|");

			if (ARCHIVE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(ARCHIVE_DTTM);
			}

			sb.append("|");

			if (HAS_IMPORT_ERROR == null) {
				sb.append("<null>");
			} else {
				sb.append(HAS_IMPORT_ERROR);
			}

			sb.append("|");

			if (HAS_ALERTS == null) {
				sb.append("<null>");
			} else {
				sb.append(HAS_ALERTS);
			}

			sb.append("|");

			if (ACTUAL_CHECKIN_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(ACTUAL_CHECKIN_DTTM);
			}

			sb.append("|");

			if (SCHEDULED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(SCHEDULED_DTTM);
			}

			sb.append("|");

			if (CREATED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_DTTM);
			}

			sb.append("|");

			if (BP_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(BP_ID);
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

	public void tDBInput_14Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_14_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_14");
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

				/**
				 * [tDBOutput_14 begin ] start
				 */

				ok_Hash.put("tDBOutput_14", false);
				start_Hash.put("tDBOutput_14", System.currentTimeMillis());

				currentComponent = "tDBOutput_14";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row14");

				int tos_count_tDBOutput_14 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_14", "tDBOutput_14", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_14 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_14 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_14 = (String) (restRequest_tDBOutput_14 != null
						? restRequest_tDBOutput_14.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_14 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_14 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_14 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_14 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_14
						.createRuntimeProperties();
				props_tDBOutput_14.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);

				props_tDBOutput_14.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_14.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_14.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_14.setValue("useSchemaDatePattern", false);

				props_tDBOutput_14.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_14_1_fisrt {

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

				SchemaSettingTool_tDBOutput_14_1_fisrt sst_tDBOutput_14_1_fisrt = new SchemaSettingTool_tDBOutput_14_1_fisrt();

				props_tDBOutput_14.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_14_1_fisrt.getSchemaValue()));

				props_tDBOutput_14.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_14.connection.setValue("useCustomRegion", false);

				props_tDBOutput_14.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_14.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_14.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_14.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_14.table.setValue("tableName", "ILM_APPOINTMENTS_ARCHIVE");

				props_tDBOutput_14.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_14.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_14.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_14.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_14.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_14.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_14_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"tDBOutput_14\",\"fields\":[{", s);

						a("\"name\":\"APPOINTMENT_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPOINTMENT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPOINTMENT_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPOINTMENT_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMPANY_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COMPANY_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMPANY_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMPANY_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"FACILITY_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FACILITY_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FACILITY_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FACILITY_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CURRENT_LOCATION_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CURRENT_LOCATION_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CURRENT_LOCATION_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CURRENT_LOCATION_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPT_REASON_CODE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_REASON_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_REASON_CODE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_REASON_CODE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMMENTS\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COMMENTS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMMENTS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMMENTS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CARRIER_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CARRIER_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CARRIER_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CARRIER_CODE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BUSINESS_PARTNER_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUSINESS_PARTNER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUSINESS_PARTNER_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUSINESS_PARTNER_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPT_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_TYPE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPT_STATUS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_STATUS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_STATUS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_STATUS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CHECKIN_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHECKIN_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHECKIN_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CHECKIN_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CHECKUOUT_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHECKUOUT_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHECKUOUT_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CHECKUOUT_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOAD_UNLOAD_ST_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOAD_UNLOAD_ST_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOAD_UNLOAD_ST_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"LOAD_UNLOAD_ST_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOAD_UNLOAD_END_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOAD_UNLOAD_END_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOAD_UNLOAD_END_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"LOAD_UNLOAD_END_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPT_PRIORITY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_PRIORITY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_PRIORITY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_PRIORITY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REQUEST_COMM_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQUEST_COMM_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQUEST_COMM_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REQUEST_COMM_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_SOURCE_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_SOURCE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_SOURCE_TYPE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_SOURCE_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_SOURCE_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_SOURCE_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_SOURCE_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CREATED_SOURCE_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_SOURCE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_SOURCE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_SOURCE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_SOURCE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_SOURCE_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LAST_UPDATED_SOURCE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LAST_UPDATED_SOURCE_TYPE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_UPDATED_SOURCE_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_SOURCE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LAST_UPDATED_SOURCE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LAST_UPDATED_SOURCE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_UPDATED_SOURCE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LAST_UPDATED_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LAST_UPDATED_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"LAST_UPDATED_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"IS_TOP_FRIEGHT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_TOP_FRIEGHT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_TOP_FRIEGHT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_TOP_FRIEGHT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TC_APPOINTMENT_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TC_APPOINTMENT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TC_APPOINTMENT_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TC_APPOINTMENT_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DRIVER_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRIVER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRIVER_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRIVER_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPOINTMENT_CREATION_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPOINTMENT_CREATION_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPOINTMENT_CREATION_TYPE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPOINTMENT_CREATION_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"YARD_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"YARD_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"YARD_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"YARD_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CONTROL_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CONTROL_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CONTROL_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CONTROL_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DOCK_DOOR_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DOCK_DOOR_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DOCK_DOOR_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DOCK_DOOR_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DOOR_TYPE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DOOR_TYPE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DOOR_TYPE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DOOR_TYPE_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REQUESTOR_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQUESTOR_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQUESTOR_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REQUESTOR_NAME\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REQUESTOR_TYPE_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQUESTOR_TYPE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQUESTOR_TYPE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REQUESTOR_TYPE_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TEMPLATE_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TEMPLATE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TEMPLATE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TEMPLATE_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TEMPLATE_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TEMPLATE_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TEMPLATE_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TEMPLATE_FLAG\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TP_COMPANY_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TP_COMPANY_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TP_COMPANY_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TP_COMPANY_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOADING_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOADING_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOADING_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOADING_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ILM_LOAD_POSITION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ILM_LOAD_POSITION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ILM_LOAD_POSITION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ILM_LOAD_POSITION\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SEAL_NUMBER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SEAL_NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SEAL_NUMBER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SEAL_NUMBER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"IS_SEAL_NUMBER_VERIFIED\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_SEAL_NUMBER_VERIFIED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_SEAL_NUMBER_VERIFIED\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_SEAL_NUMBER_VERIFIED\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BEEPER_NUMBER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BEEPER_NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BEEPER_NUMBER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BEEPER_NUMBER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CARRIER_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CARRIER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CARRIER_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CARRIER_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REASON_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REASON_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REASON_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REASON_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"APPT_REASON_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_REASON_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_REASON_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_REASON_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ORIGIN_FACILITY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIGIN_FACILITY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORIGIN_FACILITY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIGIN_FACILITY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"EQUIPMENT_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EQUIPMENT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EQUIPMENT_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EQUIPMENT_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BP_COMPANY_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BP_COMPANY_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BP_COMPANY_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BP_COMPANY_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REQUESTED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQUESTED_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQUESTED_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQUESTED_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SCHED_DEPARTURE_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCHED_DEPARTURE_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCHED_DEPARTURE_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"SCHED_DEPARTURE_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"EST_DEPARTURE_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EST_DEPARTURE_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EST_DEPARTURE_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EST_DEPARTURE_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DRIVER_DURATION_ON_YARD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRIVER_DURATION_ON_YARD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRIVER_DURATION_ON_YARD\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRIVER_DURATION_ON_YARD\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RESERVED_APPT_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESERVED_APPT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESERVED_APPT_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESERVED_APPT_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CANCELLED_REASON_CODE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CANCELLED_REASON_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CANCELLED_REASON_CODE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CANCELLED_REASON_CODE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_COMPANY_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_COMPANY_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_COMPANY_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_COMPANY_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRAILER_DURATION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRAILER_DURATION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRAILER_DURATION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAILER_DURATION\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DRIVER_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRIVER_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRIVER_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRIVER_NAME\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DRIVER_LICENSE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRIVER_LICENSE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRIVER_LICENSE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRIVER_LICENSE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DRIVER_LICENSE_STATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRIVER_LICENSE_STATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRIVER_LICENSE_STATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRIVER_LICENSE_STATE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LATEST_DELIVERY_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LATEST_DELIVERY_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LATEST_DELIVERY_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"LATEST_DELIVERY_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RESERVE_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESERVE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESERVE_TYPE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESERVE_TYPE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"HAS_SOFT_CHECK_ERRORS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HAS_SOFT_CHECK_ERRORS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HAS_SOFT_CHECK_ERRORS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HAS_SOFT_CHECK_ERRORS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ARCHIVE_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ARCHIVE_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ARCHIVE_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"ARCHIVE_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"HAS_IMPORT_ERROR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HAS_IMPORT_ERROR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HAS_IMPORT_ERROR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HAS_IMPORT_ERROR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"HAS_ALERTS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HAS_ALERTS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HAS_ALERTS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HAS_ALERTS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ACTUAL_CHECKIN_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ACTUAL_CHECKIN_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ACTUAL_CHECKIN_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"ACTUAL_CHECKIN_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SCHEDULED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCHEDULED_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCHEDULED_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"SCHEDULED_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_DTTM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CREATED_DTTM\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BP_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BP_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BP_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BP_ID\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_14\",\"di.table.label\":\"tDBOutput_14\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_14_2_fisrt sst_tDBOutput_14_2_fisrt = new SchemaSettingTool_tDBOutput_14_2_fisrt();

				props_tDBOutput_14.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_14_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_14.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_14 = props_tDBOutput_14.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_14 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_14 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_14 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_14.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_14);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_14.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_14 = props_tDBOutput_14.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_14 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_14 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_14 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_14.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_14);
					}
				}
				globalMap.put("tDBOutput_14_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_14);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_14 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_14_MAPPINGS_URL", mappings_url_tDBOutput_14);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_14 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_14";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_14 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_14 = null;
				topology_tDBOutput_14 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_14 = def_tDBOutput_14.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_14,
						topology_tDBOutput_14);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_14 = def_tDBOutput_14
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_14 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_14.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_14 = componentRuntime_tDBOutput_14
						.initialize(container_tDBOutput_14, props_tDBOutput_14);

				if (initVr_tDBOutput_14.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_14.getMessage());
				}

				if (componentRuntime_tDBOutput_14 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_14 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_14;
					compDriverInitialization_tDBOutput_14.runAtDriver(container_tDBOutput_14);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_14 = null;
				if (componentRuntime_tDBOutput_14 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_14 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_14;
					if (doesNodeBelongToRequest_tDBOutput_14) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_14 = sourceOrSink_tDBOutput_14
								.validate(container_tDBOutput_14);
						if (vr_tDBOutput_14.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_14.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_14 = null;
				if (sourceOrSink_tDBOutput_14 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_14 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_14;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_14 = sink_tDBOutput_14
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_14) {
						writeOperation_tDBOutput_14.initialize(container_tDBOutput_14);
					}
					writer_tDBOutput_14 = writeOperation_tDBOutput_14.createWriter(container_tDBOutput_14);
					if (doesNodeBelongToRequest_tDBOutput_14) {
						writer_tDBOutput_14.open("tDBOutput_14");
					}

					resourceMap.put("writer_tDBOutput_14", writer_tDBOutput_14);
				} // end of "sourceOrSink_tDBOutput_14 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_14 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_14
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_14 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_14 = props_tDBOutput_14.getSchema(c_tDBOutput_14, false);
				incomingEnforcer_tDBOutput_14 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_14);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_14 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_14 = null;

				/**
				 * [tDBOutput_14 begin ] stop
				 */

				/**
				 * [tDBInput_14 begin ] start
				 */

				ok_Hash.put("tDBInput_14", false);
				start_Hash.put("tDBInput_14", System.currentTimeMillis());

				currentComponent = "tDBInput_14";

				int tos_count_tDBInput_14 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_14 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_14 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_14 = new StringBuilder();
							log4jParamters_tDBInput_14.append("Parameters:");
							log4jParamters_tDBInput_14.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("HOST" + " = " + "\"wva-sql-etl\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("PORT" + " = " + "\"1433\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("DB_SCHEMA" + " = " + "\"dbo\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("DBNAME" + " = " + "\"TenTenData\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("USER" + " = " + "\"talend\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:i7zmvRmdsMcZX/F4EgDUI9B2NfO2qraqy62NOJCygVORI4/W")
									.substring(0, 4) + "...");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("TABLE" + " = " + "\"RetCatData\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14
									.append("QUERY" + " = " + "\"select  * from ARCHIVE_ILM_APPOINTMENTS\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("APPOINTMENT_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMPANY_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("FACILITY_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CURRENT_LOCATION_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("APPT_REASON_CODE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("COMMENTS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CARRIER_CODE") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("BUSINESS_PARTNER_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("APPT_TYPE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("APPT_STATUS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CHECKIN_DTTM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CHECKUOUT_DTTM") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LOAD_UNLOAD_ST_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LOAD_UNLOAD_END_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("APPT_PRIORITY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("REQUEST_COMM_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CREATED_SOURCE_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CREATED_SOURCE_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CREATED_SOURCE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_SOURCE_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_SOURCE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IS_TOP_FRIEGHT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TC_APPOINTMENT_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DRIVER_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("APPOINTMENT_CREATION_TYPE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("YARD_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CONTROL_NO")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("DOCK_DOOR_ID") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("DOOR_TYPE_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("REQUESTOR_NAME") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("REQUESTOR_TYPE_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TEMPLATE_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TEMPLATE_FLAG") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TP_COMPANY_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LOADING_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ILM_LOAD_POSITION") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("SEAL_NUMBER") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IS_SEAL_NUMBER_VERIFIED") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("BEEPER_NUMBER") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CARRIER_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("REASON_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("APPT_REASON_ID")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ORIGIN_FACILITY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("EQUIPMENT_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("BP_COMPANY_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("REQUESTED_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("SCHED_DEPARTURE_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("EST_DEPARTURE_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DRIVER_DURATION_ON_YARD") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RESERVED_APPT_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CANCELLED_REASON_CODE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CREATED_COMPANY_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRAILER_DURATION") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DRIVER_NAME") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DRIVER_LICENSE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DRIVER_LICENSE_STATE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LATEST_DELIVERY_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RESERVE_TYPE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("HAS_SOFT_CHECK_ERRORS") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ARCHIVE_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("HAS_IMPORT_ERROR") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("HAS_ALERTS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ACTUAL_CHECKIN_DTTM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("SCHEDULED_DTTM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CREATED_DTTM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("BP_ID")
									+ "}]");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_14.append(" | ");
							log4jParamters_tDBInput_14.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
							log4jParamters_tDBInput_14.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_14 - " + (log4jParamters_tDBInput_14));
						}
					}
					new BytesLimit65535_tDBInput_14().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_14", "tDBInput_14", "tMSSqlInput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_14 = org.talend.designer.components.util.mssql.MSSqlUtilFactory
						.getMSSqlGenerateTimestampUtil();

				java.util.List<String> talendToDBList_tDBInput_14 = new java.util.ArrayList();
				String[] talendToDBArray_tDBInput_14 = new String[] { "FLOAT", "NUMERIC", "NUMERIC IDENTITY", "DECIMAL",
						"DECIMAL IDENTITY", "REAL" };
				java.util.Collections.addAll(talendToDBList_tDBInput_14, talendToDBArray_tDBInput_14);
				int nb_line_tDBInput_14 = 0;
				java.sql.Connection conn_tDBInput_14 = null;
				String driverClass_tDBInput_14 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBInput_14 = java.lang.Class.forName(driverClass_tDBInput_14);
				String dbUser_tDBInput_14 = "talend";

				final String decryptedPassword_tDBInput_14 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:Ls22ltdYjGgrJ3d22KXEaN3XkAnb1Qjj7J2TOXn/Kd5KzQnV");

				String dbPwd_tDBInput_14 = decryptedPassword_tDBInput_14;

				String port_tDBInput_14 = "1433";
				String dbname_tDBInput_14 = "TenTenData";
				String url_tDBInput_14 = "jdbc:jtds:sqlserver://" + "wva-sql-etl";
				if (!"".equals(port_tDBInput_14)) {
					url_tDBInput_14 += ":" + "1433";
				}
				if (!"".equals(dbname_tDBInput_14)) {
					url_tDBInput_14 += "//" + "TenTenData";
				}
				url_tDBInput_14 += ";appName=" + projectName + ";" + "";
				String dbschema_tDBInput_14 = "dbo";

				log.debug("tDBInput_14 - Driver ClassName: " + driverClass_tDBInput_14 + ".");

				log.debug("tDBInput_14 - Connection attempt to '" + url_tDBInput_14 + "' with the username '"
						+ dbUser_tDBInput_14 + "'.");

				conn_tDBInput_14 = java.sql.DriverManager.getConnection(url_tDBInput_14, dbUser_tDBInput_14,
						dbPwd_tDBInput_14);
				log.debug("tDBInput_14 - Connection to '" + url_tDBInput_14 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_14 = conn_tDBInput_14.createStatement();

				String dbquery_tDBInput_14 = "select  * from ARCHIVE_ILM_APPOINTMENTS";

				log.debug("tDBInput_14 - Executing the query: '" + dbquery_tDBInput_14 + "'.");

				globalMap.put("tDBInput_14_QUERY", dbquery_tDBInput_14);
				java.sql.ResultSet rs_tDBInput_14 = null;

				try {
					rs_tDBInput_14 = stmt_tDBInput_14.executeQuery(dbquery_tDBInput_14);
					java.sql.ResultSetMetaData rsmd_tDBInput_14 = rs_tDBInput_14.getMetaData();
					int colQtyInRs_tDBInput_14 = rsmd_tDBInput_14.getColumnCount();

					String tmpContent_tDBInput_14 = null;

					log.debug("tDBInput_14 - Retrieving records from the database.");

					while (rs_tDBInput_14.next()) {
						nb_line_tDBInput_14++;

						if (colQtyInRs_tDBInput_14 < 1) {
							row14.APPOINTMENT_ID = null;
						} else {

							row14.APPOINTMENT_ID = rs_tDBInput_14.getBigDecimal(1);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPOINTMENT_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 2) {
							row14.COMPANY_ID = null;
						} else {

							row14.COMPANY_ID = rs_tDBInput_14.getBigDecimal(2);
							if (rs_tDBInput_14.wasNull()) {
								row14.COMPANY_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 3) {
							row14.FACILITY_ID = null;
						} else {

							row14.FACILITY_ID = rs_tDBInput_14.getBigDecimal(3);
							if (rs_tDBInput_14.wasNull()) {
								row14.FACILITY_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 4) {
							row14.CURRENT_LOCATION_ID = null;
						} else {

							row14.CURRENT_LOCATION_ID = rs_tDBInput_14.getBigDecimal(4);
							if (rs_tDBInput_14.wasNull()) {
								row14.CURRENT_LOCATION_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 5) {
							row14.APPT_REASON_CODE = null;
						} else {

							row14.APPT_REASON_CODE = rs_tDBInput_14.getBigDecimal(5);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPT_REASON_CODE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 6) {
							row14.COMMENTS = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(6);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(6).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.COMMENTS = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.COMMENTS = tmpContent_tDBInput_14;
								}
							} else {
								row14.COMMENTS = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 7) {
							row14.CARRIER_CODE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(7);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(7).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.CARRIER_CODE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.CARRIER_CODE = tmpContent_tDBInput_14;
								}
							} else {
								row14.CARRIER_CODE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 8) {
							row14.BUSINESS_PARTNER_ID = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(8);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(8).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.BUSINESS_PARTNER_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.BUSINESS_PARTNER_ID = tmpContent_tDBInput_14;
								}
							} else {
								row14.BUSINESS_PARTNER_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 9) {
							row14.APPT_TYPE = null;
						} else {

							row14.APPT_TYPE = rs_tDBInput_14.getBigDecimal(9);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPT_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 10) {
							row14.APPT_STATUS = null;
						} else {

							row14.APPT_STATUS = rs_tDBInput_14.getBigDecimal(10);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPT_STATUS = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 11) {
							row14.CHECKIN_DTTM = null;
						} else {

							row14.CHECKIN_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 11);

						}
						if (colQtyInRs_tDBInput_14 < 12) {
							row14.CHECKUOUT_DTTM = null;
						} else {

							row14.CHECKUOUT_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 12);

						}
						if (colQtyInRs_tDBInput_14 < 13) {
							row14.LOAD_UNLOAD_ST_DTTM = null;
						} else {

							row14.LOAD_UNLOAD_ST_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									13);

						}
						if (colQtyInRs_tDBInput_14 < 14) {
							row14.LOAD_UNLOAD_END_DTTM = null;
						} else {

							row14.LOAD_UNLOAD_END_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									14);

						}
						if (colQtyInRs_tDBInput_14 < 15) {
							row14.APPT_PRIORITY = null;
						} else {

							row14.APPT_PRIORITY = rs_tDBInput_14.getBigDecimal(15);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPT_PRIORITY = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 16) {
							row14.REQUEST_COMM_TYPE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(16);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(16).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.REQUEST_COMM_TYPE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.REQUEST_COMM_TYPE = tmpContent_tDBInput_14;
								}
							} else {
								row14.REQUEST_COMM_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 17) {
							row14.CREATED_SOURCE_TYPE = null;
						} else {

							row14.CREATED_SOURCE_TYPE = rs_tDBInput_14.getBigDecimal(17);
							if (rs_tDBInput_14.wasNull()) {
								row14.CREATED_SOURCE_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 18) {
							row14.CREATED_SOURCE_DTTM = null;
						} else {

							row14.CREATED_SOURCE_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									18);

						}
						if (colQtyInRs_tDBInput_14 < 19) {
							row14.CREATED_SOURCE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(19);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(19).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.CREATED_SOURCE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.CREATED_SOURCE = tmpContent_tDBInput_14;
								}
							} else {
								row14.CREATED_SOURCE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 20) {
							row14.LAST_UPDATED_SOURCE_TYPE = null;
						} else {

							row14.LAST_UPDATED_SOURCE_TYPE = rs_tDBInput_14.getBigDecimal(20);
							if (rs_tDBInput_14.wasNull()) {
								row14.LAST_UPDATED_SOURCE_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 21) {
							row14.LAST_UPDATED_SOURCE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(21);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(21).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.LAST_UPDATED_SOURCE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.LAST_UPDATED_SOURCE = tmpContent_tDBInput_14;
								}
							} else {
								row14.LAST_UPDATED_SOURCE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 22) {
							row14.LAST_UPDATED_DTTM = null;
						} else {

							row14.LAST_UPDATED_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									22);

						}
						if (colQtyInRs_tDBInput_14 < 23) {
							row14.IS_TOP_FRIEGHT = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(23);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(23).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.IS_TOP_FRIEGHT = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.IS_TOP_FRIEGHT = tmpContent_tDBInput_14;
								}
							} else {
								row14.IS_TOP_FRIEGHT = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 24) {
							row14.TC_APPOINTMENT_ID = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(24);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(24).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.TC_APPOINTMENT_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.TC_APPOINTMENT_ID = tmpContent_tDBInput_14;
								}
							} else {
								row14.TC_APPOINTMENT_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 25) {
							row14.DRIVER_ID = null;
						} else {

							row14.DRIVER_ID = rs_tDBInput_14.getBigDecimal(25);
							if (rs_tDBInput_14.wasNull()) {
								row14.DRIVER_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 26) {
							row14.APPOINTMENT_CREATION_TYPE = null;
						} else {

							row14.APPOINTMENT_CREATION_TYPE = rs_tDBInput_14.getBigDecimal(26);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPOINTMENT_CREATION_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 27) {
							row14.YARD_ID = null;
						} else {

							row14.YARD_ID = rs_tDBInput_14.getBigDecimal(27);
							if (rs_tDBInput_14.wasNull()) {
								row14.YARD_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 28) {
							row14.CONTROL_NO = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(28);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(28).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.CONTROL_NO = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.CONTROL_NO = tmpContent_tDBInput_14;
								}
							} else {
								row14.CONTROL_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 29) {
							row14.DOCK_DOOR_ID = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(29);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(29).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.DOCK_DOOR_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.DOCK_DOOR_ID = tmpContent_tDBInput_14;
								}
							} else {
								row14.DOCK_DOOR_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 30) {
							row14.DOOR_TYPE_ID = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(30);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(30).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.DOOR_TYPE_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.DOOR_TYPE_ID = tmpContent_tDBInput_14;
								}
							} else {
								row14.DOOR_TYPE_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 31) {
							row14.REQUESTOR_NAME = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(31);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(31).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.REQUESTOR_NAME = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.REQUESTOR_NAME = tmpContent_tDBInput_14;
								}
							} else {
								row14.REQUESTOR_NAME = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 32) {
							row14.REQUESTOR_TYPE_ID = null;
						} else {

							row14.REQUESTOR_TYPE_ID = rs_tDBInput_14.getBigDecimal(32);
							if (rs_tDBInput_14.wasNull()) {
								row14.REQUESTOR_TYPE_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 33) {
							row14.TEMPLATE_ID = null;
						} else {

							row14.TEMPLATE_ID = rs_tDBInput_14.getBigDecimal(33);
							if (rs_tDBInput_14.wasNull()) {
								row14.TEMPLATE_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 34) {
							row14.TEMPLATE_FLAG = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(34);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(34).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.TEMPLATE_FLAG = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.TEMPLATE_FLAG = tmpContent_tDBInput_14;
								}
							} else {
								row14.TEMPLATE_FLAG = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 35) {
							row14.TP_COMPANY_ID = null;
						} else {

							row14.TP_COMPANY_ID = rs_tDBInput_14.getBigDecimal(35);
							if (rs_tDBInput_14.wasNull()) {
								row14.TP_COMPANY_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 36) {
							row14.LOADING_TYPE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(36);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(36).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.LOADING_TYPE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.LOADING_TYPE = tmpContent_tDBInput_14;
								}
							} else {
								row14.LOADING_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 37) {
							row14.ILM_LOAD_POSITION = null;
						} else {

							row14.ILM_LOAD_POSITION = rs_tDBInput_14.getBigDecimal(37);
							if (rs_tDBInput_14.wasNull()) {
								row14.ILM_LOAD_POSITION = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 38) {
							row14.SEAL_NUMBER = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(38);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(38).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.SEAL_NUMBER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.SEAL_NUMBER = tmpContent_tDBInput_14;
								}
							} else {
								row14.SEAL_NUMBER = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 39) {
							row14.IS_SEAL_NUMBER_VERIFIED = null;
						} else {

							row14.IS_SEAL_NUMBER_VERIFIED = rs_tDBInput_14.getBigDecimal(39);
							if (rs_tDBInput_14.wasNull()) {
								row14.IS_SEAL_NUMBER_VERIFIED = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 40) {
							row14.BEEPER_NUMBER = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(40);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(40).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.BEEPER_NUMBER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.BEEPER_NUMBER = tmpContent_tDBInput_14;
								}
							} else {
								row14.BEEPER_NUMBER = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 41) {
							row14.CARRIER_ID = null;
						} else {

							row14.CARRIER_ID = rs_tDBInput_14.getBigDecimal(41);
							if (rs_tDBInput_14.wasNull()) {
								row14.CARRIER_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 42) {
							row14.REASON_ID = null;
						} else {

							row14.REASON_ID = rs_tDBInput_14.getBigDecimal(42);
							if (rs_tDBInput_14.wasNull()) {
								row14.REASON_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 43) {
							row14.APPT_REASON_ID = null;
						} else {

							row14.APPT_REASON_ID = rs_tDBInput_14.getBigDecimal(43);
							if (rs_tDBInput_14.wasNull()) {
								row14.APPT_REASON_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 44) {
							row14.ORIGIN_FACILITY = null;
						} else {

							row14.ORIGIN_FACILITY = rs_tDBInput_14.getBigDecimal(44);
							if (rs_tDBInput_14.wasNull()) {
								row14.ORIGIN_FACILITY = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 45) {
							row14.EQUIPMENT_ID = null;
						} else {

							row14.EQUIPMENT_ID = rs_tDBInput_14.getBigDecimal(45);
							if (rs_tDBInput_14.wasNull()) {
								row14.EQUIPMENT_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 46) {
							row14.BP_COMPANY_ID = null;
						} else {

							row14.BP_COMPANY_ID = rs_tDBInput_14.getBigDecimal(46);
							if (rs_tDBInput_14.wasNull()) {
								row14.BP_COMPANY_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 47) {
							row14.REQUESTED_DTTM = null;
						} else {

							row14.REQUESTED_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 47);

						}
						if (colQtyInRs_tDBInput_14 < 48) {
							row14.SCHED_DEPARTURE_DTTM = null;
						} else {

							row14.SCHED_DEPARTURE_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									48);

						}
						if (colQtyInRs_tDBInput_14 < 49) {
							row14.EST_DEPARTURE_DTTM = null;
						} else {

							row14.EST_DEPARTURE_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									49);

						}
						if (colQtyInRs_tDBInput_14 < 50) {
							row14.DRIVER_DURATION_ON_YARD = null;
						} else {

							row14.DRIVER_DURATION_ON_YARD = rs_tDBInput_14.getBigDecimal(50);
							if (rs_tDBInput_14.wasNull()) {
								row14.DRIVER_DURATION_ON_YARD = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 51) {
							row14.RESERVED_APPT_ID = null;
						} else {

							row14.RESERVED_APPT_ID = rs_tDBInput_14.getBigDecimal(51);
							if (rs_tDBInput_14.wasNull()) {
								row14.RESERVED_APPT_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 52) {
							row14.CANCELLED_REASON_CODE = null;
						} else {

							row14.CANCELLED_REASON_CODE = rs_tDBInput_14.getBigDecimal(52);
							if (rs_tDBInput_14.wasNull()) {
								row14.CANCELLED_REASON_CODE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 53) {
							row14.CREATED_COMPANY_TYPE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(53);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(53).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.CREATED_COMPANY_TYPE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.CREATED_COMPANY_TYPE = tmpContent_tDBInput_14;
								}
							} else {
								row14.CREATED_COMPANY_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 54) {
							row14.TRAILER_DURATION = null;
						} else {

							row14.TRAILER_DURATION = rs_tDBInput_14.getBigDecimal(54);
							if (rs_tDBInput_14.wasNull()) {
								row14.TRAILER_DURATION = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 55) {
							row14.DRIVER_NAME = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(55);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(55).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.DRIVER_NAME = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.DRIVER_NAME = tmpContent_tDBInput_14;
								}
							} else {
								row14.DRIVER_NAME = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 56) {
							row14.DRIVER_LICENSE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(56);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(56).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.DRIVER_LICENSE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.DRIVER_LICENSE = tmpContent_tDBInput_14;
								}
							} else {
								row14.DRIVER_LICENSE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 57) {
							row14.DRIVER_LICENSE_STATE = null;
						} else {

							tmpContent_tDBInput_14 = rs_tDBInput_14.getString(57);
							if (tmpContent_tDBInput_14 != null) {
								if (talendToDBList_tDBInput_14.contains(
										rsmd_tDBInput_14.getColumnTypeName(57).toUpperCase(java.util.Locale.ENGLISH))) {
									row14.DRIVER_LICENSE_STATE = FormatterUtils.formatUnwithE(tmpContent_tDBInput_14);
								} else {
									row14.DRIVER_LICENSE_STATE = tmpContent_tDBInput_14;
								}
							} else {
								row14.DRIVER_LICENSE_STATE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 58) {
							row14.LATEST_DELIVERY_DTTM = null;
						} else {

							row14.LATEST_DELIVERY_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									58);

						}
						if (colQtyInRs_tDBInput_14 < 59) {
							row14.RESERVE_TYPE = null;
						} else {

							row14.RESERVE_TYPE = rs_tDBInput_14.getBigDecimal(59);
							if (rs_tDBInput_14.wasNull()) {
								row14.RESERVE_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 60) {
							row14.HAS_SOFT_CHECK_ERRORS = null;
						} else {

							row14.HAS_SOFT_CHECK_ERRORS = rs_tDBInput_14.getBigDecimal(60);
							if (rs_tDBInput_14.wasNull()) {
								row14.HAS_SOFT_CHECK_ERRORS = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 61) {
							row14.ARCHIVE_DTTM = null;
						} else {

							row14.ARCHIVE_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 61);

						}
						if (colQtyInRs_tDBInput_14 < 62) {
							row14.HAS_IMPORT_ERROR = null;
						} else {

							row14.HAS_IMPORT_ERROR = rs_tDBInput_14.getBigDecimal(62);
							if (rs_tDBInput_14.wasNull()) {
								row14.HAS_IMPORT_ERROR = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 63) {
							row14.HAS_ALERTS = null;
						} else {

							row14.HAS_ALERTS = rs_tDBInput_14.getBigDecimal(63);
							if (rs_tDBInput_14.wasNull()) {
								row14.HAS_ALERTS = null;
							}
						}
						if (colQtyInRs_tDBInput_14 < 64) {
							row14.ACTUAL_CHECKIN_DTTM = null;
						} else {

							row14.ACTUAL_CHECKIN_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14,
									64);

						}
						if (colQtyInRs_tDBInput_14 < 65) {
							row14.SCHEDULED_DTTM = null;
						} else {

							row14.SCHEDULED_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 65);

						}
						if (colQtyInRs_tDBInput_14 < 66) {
							row14.CREATED_DTTM = null;
						} else {

							row14.CREATED_DTTM = mssqlGTU_tDBInput_14.getDate(rsmd_tDBInput_14, rs_tDBInput_14, 66);

						}
						if (colQtyInRs_tDBInput_14 < 67) {
							row14.BP_ID = null;
						} else {

							row14.BP_ID = rs_tDBInput_14.getBigDecimal(67);
							if (rs_tDBInput_14.wasNull()) {
								row14.BP_ID = null;
							}
						}

						log.debug("tDBInput_14 - Retrieving the record " + nb_line_tDBInput_14 + ".");

						/**
						 * [tDBInput_14 begin ] stop
						 */

						/**
						 * [tDBInput_14 main ] start
						 */

						currentComponent = "tDBInput_14";

						tos_count_tDBInput_14++;

						/**
						 * [tDBInput_14 main ] stop
						 */

						/**
						 * [tDBInput_14 process_data_begin ] start
						 */

						currentComponent = "tDBInput_14";

						/**
						 * [tDBInput_14 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_14 main ] start
						 */

						currentComponent = "tDBOutput_14";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row14", "tDBInput_14", "tDBInput_14", "tMSSqlInput", "tDBOutput_14", "tDBOutput_14",
								"tSnowflakeOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row14 - " + (row14 == null ? "" : row14.toLogString()));
						}

						if (incomingEnforcer_tDBOutput_14 != null) {
							incomingEnforcer_tDBOutput_14.createNewRecord();
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("APPOINTMENT_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("APPOINTMENT_ID", row14.APPOINTMENT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("COMPANY_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("COMPANY_ID", row14.COMPANY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("FACILITY_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("FACILITY_ID", row14.FACILITY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CURRENT_LOCATION_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("CURRENT_LOCATION_ID", row14.CURRENT_LOCATION_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("APPT_REASON_CODE") != null) {
							incomingEnforcer_tDBOutput_14.put("APPT_REASON_CODE", row14.APPT_REASON_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("COMMENTS") != null) {
							incomingEnforcer_tDBOutput_14.put("COMMENTS", row14.COMMENTS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("CARRIER_CODE") != null) {
							incomingEnforcer_tDBOutput_14.put("CARRIER_CODE", row14.CARRIER_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("BUSINESS_PARTNER_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("BUSINESS_PARTNER_ID", row14.BUSINESS_PARTNER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("APPT_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("APPT_TYPE", row14.APPT_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("APPT_STATUS") != null) {
							incomingEnforcer_tDBOutput_14.put("APPT_STATUS", row14.APPT_STATUS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("CHECKIN_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("CHECKIN_DTTM", row14.CHECKIN_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CHECKUOUT_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("CHECKUOUT_DTTM", row14.CHECKUOUT_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LOAD_UNLOAD_ST_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("LOAD_UNLOAD_ST_DTTM", row14.LOAD_UNLOAD_ST_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LOAD_UNLOAD_END_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("LOAD_UNLOAD_END_DTTM", row14.LOAD_UNLOAD_END_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("APPT_PRIORITY") != null) {
							incomingEnforcer_tDBOutput_14.put("APPT_PRIORITY", row14.APPT_PRIORITY);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("REQUEST_COMM_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("REQUEST_COMM_TYPE", row14.REQUEST_COMM_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CREATED_SOURCE_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("CREATED_SOURCE_TYPE", row14.CREATED_SOURCE_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CREATED_SOURCE_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("CREATED_SOURCE_DTTM", row14.CREATED_SOURCE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CREATED_SOURCE") != null) {
							incomingEnforcer_tDBOutput_14.put("CREATED_SOURCE", row14.CREATED_SOURCE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LAST_UPDATED_SOURCE_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("LAST_UPDATED_SOURCE_TYPE",
									row14.LAST_UPDATED_SOURCE_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LAST_UPDATED_SOURCE") != null) {
							incomingEnforcer_tDBOutput_14.put("LAST_UPDATED_SOURCE", row14.LAST_UPDATED_SOURCE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LAST_UPDATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("LAST_UPDATED_DTTM", row14.LAST_UPDATED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("IS_TOP_FRIEGHT") != null) {
							incomingEnforcer_tDBOutput_14.put("IS_TOP_FRIEGHT", row14.IS_TOP_FRIEGHT);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("TC_APPOINTMENT_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("TC_APPOINTMENT_ID", row14.TC_APPOINTMENT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("DRIVER_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("DRIVER_ID", row14.DRIVER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("APPOINTMENT_CREATION_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("APPOINTMENT_CREATION_TYPE",
									row14.APPOINTMENT_CREATION_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("YARD_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("YARD_ID", row14.YARD_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("CONTROL_NO") != null) {
							incomingEnforcer_tDBOutput_14.put("CONTROL_NO", row14.CONTROL_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("DOCK_DOOR_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("DOCK_DOOR_ID", row14.DOCK_DOOR_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("DOOR_TYPE_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("DOOR_TYPE_ID", row14.DOOR_TYPE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("REQUESTOR_NAME") != null) {
							incomingEnforcer_tDBOutput_14.put("REQUESTOR_NAME", row14.REQUESTOR_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("REQUESTOR_TYPE_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("REQUESTOR_TYPE_ID", row14.REQUESTOR_TYPE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("TEMPLATE_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("TEMPLATE_ID", row14.TEMPLATE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("TEMPLATE_FLAG") != null) {
							incomingEnforcer_tDBOutput_14.put("TEMPLATE_FLAG", row14.TEMPLATE_FLAG);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("TP_COMPANY_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("TP_COMPANY_ID", row14.TP_COMPANY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("LOADING_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("LOADING_TYPE", row14.LOADING_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("ILM_LOAD_POSITION") != null) {
							incomingEnforcer_tDBOutput_14.put("ILM_LOAD_POSITION", row14.ILM_LOAD_POSITION);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("SEAL_NUMBER") != null) {
							incomingEnforcer_tDBOutput_14.put("SEAL_NUMBER", row14.SEAL_NUMBER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("IS_SEAL_NUMBER_VERIFIED") != null) {
							incomingEnforcer_tDBOutput_14.put("IS_SEAL_NUMBER_VERIFIED", row14.IS_SEAL_NUMBER_VERIFIED);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("BEEPER_NUMBER") != null) {
							incomingEnforcer_tDBOutput_14.put("BEEPER_NUMBER", row14.BEEPER_NUMBER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("CARRIER_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("CARRIER_ID", row14.CARRIER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("REASON_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("REASON_ID", row14.REASON_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("APPT_REASON_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("APPT_REASON_ID", row14.APPT_REASON_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("ORIGIN_FACILITY") != null) {
							incomingEnforcer_tDBOutput_14.put("ORIGIN_FACILITY", row14.ORIGIN_FACILITY);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("EQUIPMENT_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("EQUIPMENT_ID", row14.EQUIPMENT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("BP_COMPANY_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("BP_COMPANY_ID", row14.BP_COMPANY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("REQUESTED_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("REQUESTED_DTTM", row14.REQUESTED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("SCHED_DEPARTURE_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("SCHED_DEPARTURE_DTTM", row14.SCHED_DEPARTURE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("EST_DEPARTURE_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("EST_DEPARTURE_DTTM", row14.EST_DEPARTURE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("DRIVER_DURATION_ON_YARD") != null) {
							incomingEnforcer_tDBOutput_14.put("DRIVER_DURATION_ON_YARD", row14.DRIVER_DURATION_ON_YARD);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("RESERVED_APPT_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("RESERVED_APPT_ID", row14.RESERVED_APPT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CANCELLED_REASON_CODE") != null) {
							incomingEnforcer_tDBOutput_14.put("CANCELLED_REASON_CODE", row14.CANCELLED_REASON_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("CREATED_COMPANY_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("CREATED_COMPANY_TYPE", row14.CREATED_COMPANY_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("TRAILER_DURATION") != null) {
							incomingEnforcer_tDBOutput_14.put("TRAILER_DURATION", row14.TRAILER_DURATION);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("DRIVER_NAME") != null) {
							incomingEnforcer_tDBOutput_14.put("DRIVER_NAME", row14.DRIVER_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("DRIVER_LICENSE") != null) {
							incomingEnforcer_tDBOutput_14.put("DRIVER_LICENSE", row14.DRIVER_LICENSE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("DRIVER_LICENSE_STATE") != null) {
							incomingEnforcer_tDBOutput_14.put("DRIVER_LICENSE_STATE", row14.DRIVER_LICENSE_STATE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("LATEST_DELIVERY_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("LATEST_DELIVERY_DTTM", row14.LATEST_DELIVERY_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("RESERVE_TYPE") != null) {
							incomingEnforcer_tDBOutput_14.put("RESERVE_TYPE", row14.RESERVE_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("HAS_SOFT_CHECK_ERRORS") != null) {
							incomingEnforcer_tDBOutput_14.put("HAS_SOFT_CHECK_ERRORS", row14.HAS_SOFT_CHECK_ERRORS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("ARCHIVE_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("ARCHIVE_DTTM", row14.ARCHIVE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("HAS_IMPORT_ERROR") != null) {
							incomingEnforcer_tDBOutput_14.put("HAS_IMPORT_ERROR", row14.HAS_IMPORT_ERROR);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("HAS_ALERTS") != null) {
							incomingEnforcer_tDBOutput_14.put("HAS_ALERTS", row14.HAS_ALERTS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("ACTUAL_CHECKIN_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("ACTUAL_CHECKIN_DTTM", row14.ACTUAL_CHECKIN_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema()
								.getField("SCHEDULED_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("SCHEDULED_DTTM", row14.SCHEDULED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("CREATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_14.put("CREATED_DTTM", row14.CREATED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_14 != null
								&& incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("BP_ID") != null) {
							incomingEnforcer_tDBOutput_14.put("BP_ID", row14.BP_ID);
						}

						org.apache.avro.generic.IndexedRecord data_tDBOutput_14 = null;
						if (incomingEnforcer_tDBOutput_14 != null) {
							data_tDBOutput_14 = incomingEnforcer_tDBOutput_14.getCurrentRecord();
						}

						if (writer_tDBOutput_14 != null && data_tDBOutput_14 != null) {
							writer_tDBOutput_14.write(data_tDBOutput_14);
						}

						nb_line_tDBOutput_14++;

						tos_count_tDBOutput_14++;

						/**
						 * [tDBOutput_14 main ] stop
						 */

						/**
						 * [tDBOutput_14 process_data_begin ] start
						 */

						currentComponent = "tDBOutput_14";

						/**
						 * [tDBOutput_14 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_14 process_data_end ] start
						 */

						currentComponent = "tDBOutput_14";

						/**
						 * [tDBOutput_14 process_data_end ] stop
						 */

						/**
						 * [tDBInput_14 process_data_end ] start
						 */

						currentComponent = "tDBInput_14";

						/**
						 * [tDBInput_14 process_data_end ] stop
						 */

						/**
						 * [tDBInput_14 end ] start
						 */

						currentComponent = "tDBInput_14";

					}
				} finally {
					if (rs_tDBInput_14 != null) {
						rs_tDBInput_14.close();
					}
					if (stmt_tDBInput_14 != null) {
						stmt_tDBInput_14.close();
					}
					if (conn_tDBInput_14 != null && !conn_tDBInput_14.isClosed()) {

						log.debug("tDBInput_14 - Closing the connection to the database.");

						conn_tDBInput_14.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_14 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_14_NB_LINE", nb_line_tDBInput_14);
				log.debug("tDBInput_14 - Retrieved records count: " + nb_line_tDBInput_14 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_14 - " + ("Done."));

				ok_Hash.put("tDBInput_14", true);
				end_Hash.put("tDBInput_14", System.currentTimeMillis());

				/**
				 * [tDBInput_14 end ] stop
				 */

				/**
				 * [tDBOutput_14 end ] start
				 */

				currentComponent = "tDBOutput_14";

// end of generic

				resourceMap.put("finish_tDBOutput_14", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_14 = null;
				if (writer_tDBOutput_14 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_14 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_14
							.close();
					resultMap_tDBOutput_14 = writer_tDBOutput_14.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_14), container_tDBOutput_14);
				}
				if (resultMap_tDBOutput_14 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_14 : resultMap_tDBOutput_14.entrySet()) {
						switch (entry_tDBOutput_14.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_14.setComponentData("tDBOutput_14", "ERROR_MESSAGE",
									entry_tDBOutput_14.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_LINE",
									entry_tDBOutput_14.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_SUCCESS",
									entry_tDBOutput_14.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_REJECT",
									entry_tDBOutput_14.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_14 = new StringBuilder();
							for (int i_tDBOutput_14 = 0; i_tDBOutput_14 < entry_tDBOutput_14.getKey()
									.length(); i_tDBOutput_14++) {
								char ch_tDBOutput_14 = entry_tDBOutput_14.getKey().charAt(i_tDBOutput_14);
								if (Character.isUpperCase(ch_tDBOutput_14) && i_tDBOutput_14 > 0) {
									studio_key_tDBOutput_14.append('_');
								}
								studio_key_tDBOutput_14.append(ch_tDBOutput_14);
							}
							container_tDBOutput_14.setComponentData("tDBOutput_14",
									studio_key_tDBOutput_14.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_14.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row14", 2, 0,
						"tDBInput_14", "tDBInput_14", "tMSSqlInput", "tDBOutput_14", "tDBOutput_14", "tSnowflakeOutput",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_14", true);
				end_Hash.put("tDBOutput_14", System.currentTimeMillis());

				/**
				 * [tDBOutput_14 end ] stop
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
				 * [tDBInput_14 finally ] start
				 */

				currentComponent = "tDBInput_14";

				/**
				 * [tDBInput_14 finally ] stop
				 */

				/**
				 * [tDBOutput_14 finally ] start
				 */

				currentComponent = "tDBOutput_14";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_14") == null) {
					if (resourceMap.get("writer_tDBOutput_14") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap
									.get("writer_tDBOutput_14")).close();
						} catch (java.io.IOException e_tDBOutput_14) {
							String errorMessage_tDBOutput_14 = "failed to release the resource in tDBOutput_14 :"
									+ e_tDBOutput_14.getMessage();
							System.err.println(errorMessage_tDBOutput_14);
						}
					}
				}

				/**
				 * [tDBOutput_14 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_14_SUBPROCESS_STATE", 1);
	}

	public static class row24Struct implements routines.system.IPersistableRow<row24Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES = new byte[0];

		public BigDecimal ID;

		public BigDecimal getID() {
			return this.ID;
		}

		public Boolean IDIsNullable() {
			return true;
		}

		public Boolean IDIsKey() {
			return false;
		}

		public Integer IDLength() {
			return null;
		}

		public Integer IDPrecision() {
			return null;
		}

		public String IDDefault() {

			return "";

		}

		public String IDComment() {

			return "";

		}

		public String IDPattern() {

			return "";

		}

		public String IDOriginalDbColumnName() {

			return "ID";

		}

		public BigDecimal APPT_OBJ_TYPE;

		public BigDecimal getAPPT_OBJ_TYPE() {
			return this.APPT_OBJ_TYPE;
		}

		public Boolean APPT_OBJ_TYPEIsNullable() {
			return true;
		}

		public Boolean APPT_OBJ_TYPEIsKey() {
			return false;
		}

		public Integer APPT_OBJ_TYPELength() {
			return null;
		}

		public Integer APPT_OBJ_TYPEPrecision() {
			return null;
		}

		public String APPT_OBJ_TYPEDefault() {

			return "";

		}

		public String APPT_OBJ_TYPEComment() {

			return "";

		}

		public String APPT_OBJ_TYPEPattern() {

			return "";

		}

		public String APPT_OBJ_TYPEOriginalDbColumnName() {

			return "APPT_OBJ_TYPE";

		}

		public BigDecimal APPT_OBJ_ID;

		public BigDecimal getAPPT_OBJ_ID() {
			return this.APPT_OBJ_ID;
		}

		public Boolean APPT_OBJ_IDIsNullable() {
			return true;
		}

		public Boolean APPT_OBJ_IDIsKey() {
			return false;
		}

		public Integer APPT_OBJ_IDLength() {
			return null;
		}

		public Integer APPT_OBJ_IDPrecision() {
			return null;
		}

		public String APPT_OBJ_IDDefault() {

			return "";

		}

		public String APPT_OBJ_IDComment() {

			return "";

		}

		public String APPT_OBJ_IDPattern() {

			return "";

		}

		public String APPT_OBJ_IDOriginalDbColumnName() {

			return "APPT_OBJ_ID";

		}

		public BigDecimal COMPANY_ID;

		public BigDecimal getCOMPANY_ID() {
			return this.COMPANY_ID;
		}

		public Boolean COMPANY_IDIsNullable() {
			return true;
		}

		public Boolean COMPANY_IDIsKey() {
			return false;
		}

		public Integer COMPANY_IDLength() {
			return null;
		}

		public Integer COMPANY_IDPrecision() {
			return null;
		}

		public String COMPANY_IDDefault() {

			return "";

		}

		public String COMPANY_IDComment() {

			return "";

		}

		public String COMPANY_IDPattern() {

			return "";

		}

		public String COMPANY_IDOriginalDbColumnName() {

			return "COMPANY_ID";

		}

		public BigDecimal APPOINTMENT_ID;

		public BigDecimal getAPPOINTMENT_ID() {
			return this.APPOINTMENT_ID;
		}

		public Boolean APPOINTMENT_IDIsNullable() {
			return true;
		}

		public Boolean APPOINTMENT_IDIsKey() {
			return false;
		}

		public Integer APPOINTMENT_IDLength() {
			return null;
		}

		public Integer APPOINTMENT_IDPrecision() {
			return null;
		}

		public String APPOINTMENT_IDDefault() {

			return "";

		}

		public String APPOINTMENT_IDComment() {

			return "";

		}

		public String APPOINTMENT_IDPattern() {

			return "";

		}

		public String APPOINTMENT_IDOriginalDbColumnName() {

			return "APPOINTMENT_ID";

		}

		public BigDecimal STOP_SEQ;

		public BigDecimal getSTOP_SEQ() {
			return this.STOP_SEQ;
		}

		public Boolean STOP_SEQIsNullable() {
			return true;
		}

		public Boolean STOP_SEQIsKey() {
			return false;
		}

		public Integer STOP_SEQLength() {
			return null;
		}

		public Integer STOP_SEQPrecision() {
			return null;
		}

		public String STOP_SEQDefault() {

			return "";

		}

		public String STOP_SEQComment() {

			return "";

		}

		public String STOP_SEQPattern() {

			return "";

		}

		public String STOP_SEQOriginalDbColumnName() {

			return "STOP_SEQ";

		}

		public java.util.Date ARCHIVE_DTTM;

		public java.util.Date getARCHIVE_DTTM() {
			return this.ARCHIVE_DTTM;
		}

		public Boolean ARCHIVE_DTTMIsNullable() {
			return true;
		}

		public Boolean ARCHIVE_DTTMIsKey() {
			return false;
		}

		public Integer ARCHIVE_DTTMLength() {
			return null;
		}

		public Integer ARCHIVE_DTTMPrecision() {
			return null;
		}

		public String ARCHIVE_DTTMDefault() {

			return null;

		}

		public String ARCHIVE_DTTMComment() {

			return "";

		}

		public String ARCHIVE_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String ARCHIVE_DTTMOriginalDbColumnName() {

			return "ARCHIVE_DTTM";

		}

		public java.util.Date CREATED_DTTM;

		public java.util.Date getCREATED_DTTM() {
			return this.CREATED_DTTM;
		}

		public Boolean CREATED_DTTMIsNullable() {
			return true;
		}

		public Boolean CREATED_DTTMIsKey() {
			return false;
		}

		public Integer CREATED_DTTMLength() {
			return null;
		}

		public Integer CREATED_DTTMPrecision() {
			return null;
		}

		public String CREATED_DTTMDefault() {

			return null;

		}

		public String CREATED_DTTMComment() {

			return "";

		}

		public String CREATED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String CREATED_DTTMOriginalDbColumnName() {

			return "CREATED_DTTM";

		}

		public java.util.Date LAST_UPDATED_DTTM;

		public java.util.Date getLAST_UPDATED_DTTM() {
			return this.LAST_UPDATED_DTTM;
		}

		public Boolean LAST_UPDATED_DTTMIsNullable() {
			return true;
		}

		public Boolean LAST_UPDATED_DTTMIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_DTTMLength() {
			return null;
		}

		public Integer LAST_UPDATED_DTTMPrecision() {
			return null;
		}

		public String LAST_UPDATED_DTTMDefault() {

			return null;

		}

		public String LAST_UPDATED_DTTMComment() {

			return "";

		}

		public String LAST_UPDATED_DTTMPattern() {

			return "yyyy-MM-dd'T'HH:mm:ss";

		}

		public String LAST_UPDATED_DTTMOriginalDbColumnName() {

			return "LAST_UPDATED_DTTM";

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.ID = (BigDecimal) dis.readObject();

					this.APPT_OBJ_TYPE = (BigDecimal) dis.readObject();

					this.APPT_OBJ_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.APPOINTMENT_ID = (BigDecimal) dis.readObject();

					this.STOP_SEQ = (BigDecimal) dis.readObject();

					this.ARCHIVE_DTTM = readDate(dis);

					this.CREATED_DTTM = readDate(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES) {

				try {

					int length = 0;

					this.ID = (BigDecimal) dis.readObject();

					this.APPT_OBJ_TYPE = (BigDecimal) dis.readObject();

					this.APPT_OBJ_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.APPOINTMENT_ID = (BigDecimal) dis.readObject();

					this.STOP_SEQ = (BigDecimal) dis.readObject();

					this.ARCHIVE_DTTM = readDate(dis);

					this.CREATED_DTTM = readDate(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

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

				dos.writeObject(this.ID);

				// BigDecimal

				dos.writeObject(this.APPT_OBJ_TYPE);

				// BigDecimal

				dos.writeObject(this.APPT_OBJ_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// BigDecimal

				dos.writeObject(this.APPOINTMENT_ID);

				// BigDecimal

				dos.writeObject(this.STOP_SEQ);

				// java.util.Date

				writeDate(this.ARCHIVE_DTTM, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.ID);

				// BigDecimal

				dos.writeObject(this.APPT_OBJ_TYPE);

				// BigDecimal

				dos.writeObject(this.APPT_OBJ_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// BigDecimal

				dos.writeObject(this.APPOINTMENT_ID);

				// BigDecimal

				dos.writeObject(this.STOP_SEQ);

				// java.util.Date

				writeDate(this.ARCHIVE_DTTM, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("ID=" + String.valueOf(ID));
			sb.append(",APPT_OBJ_TYPE=" + String.valueOf(APPT_OBJ_TYPE));
			sb.append(",APPT_OBJ_ID=" + String.valueOf(APPT_OBJ_ID));
			sb.append(",COMPANY_ID=" + String.valueOf(COMPANY_ID));
			sb.append(",APPOINTMENT_ID=" + String.valueOf(APPOINTMENT_ID));
			sb.append(",STOP_SEQ=" + String.valueOf(STOP_SEQ));
			sb.append(",ARCHIVE_DTTM=" + String.valueOf(ARCHIVE_DTTM));
			sb.append(",CREATED_DTTM=" + String.valueOf(CREATED_DTTM));
			sb.append(",LAST_UPDATED_DTTM=" + String.valueOf(LAST_UPDATED_DTTM));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (ID == null) {
				sb.append("<null>");
			} else {
				sb.append(ID);
			}

			sb.append("|");

			if (APPT_OBJ_TYPE == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_OBJ_TYPE);
			}

			sb.append("|");

			if (APPT_OBJ_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(APPT_OBJ_ID);
			}

			sb.append("|");

			if (COMPANY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(COMPANY_ID);
			}

			sb.append("|");

			if (APPOINTMENT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(APPOINTMENT_ID);
			}

			sb.append("|");

			if (STOP_SEQ == null) {
				sb.append("<null>");
			} else {
				sb.append(STOP_SEQ);
			}

			sb.append("|");

			if (ARCHIVE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(ARCHIVE_DTTM);
			}

			sb.append("|");

			if (CREATED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_DTTM);
			}

			sb.append("|");

			if (LAST_UPDATED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_UPDATED_DTTM);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row24Struct other) {

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

	public void tDBInput_24Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_24_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_24");
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

				row24Struct row24 = new row24Struct();

				/**
				 * [tDBOutput_10 begin ] start
				 */

				ok_Hash.put("tDBOutput_10", false);
				start_Hash.put("tDBOutput_10", System.currentTimeMillis());

				currentComponent = "tDBOutput_10";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row24");

				int tos_count_tDBOutput_10 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_10", "tDBOutput_10", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_10 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_10 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_10 = (String) (restRequest_tDBOutput_10 != null
						? restRequest_tDBOutput_10.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_10 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_10 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_10 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_10 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_10
						.createRuntimeProperties();
				props_tDBOutput_10.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);

				props_tDBOutput_10.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_10.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_10.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_10.setValue("useSchemaDatePattern", false);

				props_tDBOutput_10.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_10_1_fisrt {

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

				SchemaSettingTool_tDBOutput_10_1_fisrt sst_tDBOutput_10_1_fisrt = new SchemaSettingTool_tDBOutput_10_1_fisrt();

				props_tDBOutput_10.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_10_1_fisrt.getSchemaValue()));

				props_tDBOutput_10.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_10.connection.setValue("useCustomRegion", false);

				props_tDBOutput_10.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_10.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_10.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_10.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_10.table.setValue("tableName", "ILM_APPOINTMENT_OBJECTS_ARCHIVE");

				props_tDBOutput_10.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_10.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_10.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_10.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_10.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_10.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_10_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"ILM_APPOINTMENT_OBJECTS_ARCHIVE\",\"fields\":[{", s);

						a("\"name\":\"ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ID\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"APPT_OBJ_TYPE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"APPT_OBJ_TYPE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"APPT_OBJ_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"APPT_OBJ_ID\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"COMPANY_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"COMPANY_ID\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"APPOINTMENT_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"APPOINTMENT_ID\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"STOP_SEQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"STOP_SEQ\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ARCHIVE_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"ARCHIVE_DTTM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"CREATED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"CREATED_DTTM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_DTTM\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"LAST_UPDATED_DTTM\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_10_2_fisrt sst_tDBOutput_10_2_fisrt = new SchemaSettingTool_tDBOutput_10_2_fisrt();

				props_tDBOutput_10.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_10_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_10.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_10 = props_tDBOutput_10.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_10 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_10 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_10 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_10.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_10);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_10.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_10 = props_tDBOutput_10.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_10 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_10 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_10 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_10.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_10);
					}
				}
				globalMap.put("tDBOutput_10_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_10);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_10 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_10_MAPPINGS_URL", mappings_url_tDBOutput_10);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_10 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_10";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_10 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_10 = null;
				topology_tDBOutput_10 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_10 = def_tDBOutput_10.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_10,
						topology_tDBOutput_10);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_10 = def_tDBOutput_10
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_10 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_10.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_10 = componentRuntime_tDBOutput_10
						.initialize(container_tDBOutput_10, props_tDBOutput_10);

				if (initVr_tDBOutput_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_10.getMessage());
				}

				if (componentRuntime_tDBOutput_10 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_10 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_10;
					compDriverInitialization_tDBOutput_10.runAtDriver(container_tDBOutput_10);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_10 = null;
				if (componentRuntime_tDBOutput_10 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_10 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_10;
					if (doesNodeBelongToRequest_tDBOutput_10) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_10 = sourceOrSink_tDBOutput_10
								.validate(container_tDBOutput_10);
						if (vr_tDBOutput_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_10.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_10 = null;
				if (sourceOrSink_tDBOutput_10 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_10 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_10;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_10 = sink_tDBOutput_10
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_10) {
						writeOperation_tDBOutput_10.initialize(container_tDBOutput_10);
					}
					writer_tDBOutput_10 = writeOperation_tDBOutput_10.createWriter(container_tDBOutput_10);
					if (doesNodeBelongToRequest_tDBOutput_10) {
						writer_tDBOutput_10.open("tDBOutput_10");
					}

					resourceMap.put("writer_tDBOutput_10", writer_tDBOutput_10);
				} // end of "sourceOrSink_tDBOutput_10 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_10 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_10
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_10 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_10 = props_tDBOutput_10.getSchema(c_tDBOutput_10, false);
				incomingEnforcer_tDBOutput_10 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_10);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_10 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_10 = null;

				/**
				 * [tDBOutput_10 begin ] stop
				 */

				/**
				 * [tDBInput_24 begin ] start
				 */

				ok_Hash.put("tDBInput_24", false);
				start_Hash.put("tDBInput_24", System.currentTimeMillis());

				currentComponent = "tDBInput_24";

				int tos_count_tDBInput_24 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_24 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_24 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_24 = new StringBuilder();
							log4jParamters_tDBInput_24.append("Parameters:");
							log4jParamters_tDBInput_24.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("HOST" + " = " + "\"wva-sql-etl\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("PORT" + " = " + "\"1433\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("DB_SCHEMA" + " = " + "\"dbo\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("DBNAME" + " = " + "\"TenTenData\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("USER" + " = " + "\"talend\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:Hgs4BAVoVq5aoxH6RmOuP1l68O7XRyi+krxsn8jjXsPXKX/P")
									.substring(0, 4) + "...");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("TABLE" + " = " + "\"RetCatData\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24
									.append("QUERY" + " = " + "\"select  * from ARCHIVE_ILM_APPOINTMENT_OBJECTS\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("APPT_OBJ_TYPE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("APPT_OBJ_ID")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("COMPANY_ID") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("APPOINTMENT_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("STOP_SEQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ARCHIVE_DTTM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CREATED_DTTM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LAST_UPDATED_DTTM") + "}]");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_24.append(" | ");
							log4jParamters_tDBInput_24.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
							log4jParamters_tDBInput_24.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_24 - " + (log4jParamters_tDBInput_24));
						}
					}
					new BytesLimit65535_tDBInput_24().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_24", "tDBInput_24", "tMSSqlInput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_24 = org.talend.designer.components.util.mssql.MSSqlUtilFactory
						.getMSSqlGenerateTimestampUtil();

				java.util.List<String> talendToDBList_tDBInput_24 = new java.util.ArrayList();
				String[] talendToDBArray_tDBInput_24 = new String[] { "FLOAT", "NUMERIC", "NUMERIC IDENTITY", "DECIMAL",
						"DECIMAL IDENTITY", "REAL" };
				java.util.Collections.addAll(talendToDBList_tDBInput_24, talendToDBArray_tDBInput_24);
				int nb_line_tDBInput_24 = 0;
				java.sql.Connection conn_tDBInput_24 = null;
				String driverClass_tDBInput_24 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBInput_24 = java.lang.Class.forName(driverClass_tDBInput_24);
				String dbUser_tDBInput_24 = "talend";

				final String decryptedPassword_tDBInput_24 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:KQ5ly4T+0ug5kRJlaqAT35sEfu0B//y25EXnRLqNKEkC2ruq");

				String dbPwd_tDBInput_24 = decryptedPassword_tDBInput_24;

				String port_tDBInput_24 = "1433";
				String dbname_tDBInput_24 = "TenTenData";
				String url_tDBInput_24 = "jdbc:jtds:sqlserver://" + "wva-sql-etl";
				if (!"".equals(port_tDBInput_24)) {
					url_tDBInput_24 += ":" + "1433";
				}
				if (!"".equals(dbname_tDBInput_24)) {
					url_tDBInput_24 += "//" + "TenTenData";
				}
				url_tDBInput_24 += ";appName=" + projectName + ";" + "";
				String dbschema_tDBInput_24 = "dbo";

				log.debug("tDBInput_24 - Driver ClassName: " + driverClass_tDBInput_24 + ".");

				log.debug("tDBInput_24 - Connection attempt to '" + url_tDBInput_24 + "' with the username '"
						+ dbUser_tDBInput_24 + "'.");

				conn_tDBInput_24 = java.sql.DriverManager.getConnection(url_tDBInput_24, dbUser_tDBInput_24,
						dbPwd_tDBInput_24);
				log.debug("tDBInput_24 - Connection to '" + url_tDBInput_24 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_24 = conn_tDBInput_24.createStatement();

				String dbquery_tDBInput_24 = "select  * from ARCHIVE_ILM_APPOINTMENT_OBJECTS";

				log.debug("tDBInput_24 - Executing the query: '" + dbquery_tDBInput_24 + "'.");

				globalMap.put("tDBInput_24_QUERY", dbquery_tDBInput_24);
				java.sql.ResultSet rs_tDBInput_24 = null;

				try {
					rs_tDBInput_24 = stmt_tDBInput_24.executeQuery(dbquery_tDBInput_24);
					java.sql.ResultSetMetaData rsmd_tDBInput_24 = rs_tDBInput_24.getMetaData();
					int colQtyInRs_tDBInput_24 = rsmd_tDBInput_24.getColumnCount();

					String tmpContent_tDBInput_24 = null;

					log.debug("tDBInput_24 - Retrieving records from the database.");

					while (rs_tDBInput_24.next()) {
						nb_line_tDBInput_24++;

						if (colQtyInRs_tDBInput_24 < 1) {
							row24.ID = null;
						} else {

							row24.ID = rs_tDBInput_24.getBigDecimal(1);
							if (rs_tDBInput_24.wasNull()) {
								row24.ID = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 2) {
							row24.APPT_OBJ_TYPE = null;
						} else {

							row24.APPT_OBJ_TYPE = rs_tDBInput_24.getBigDecimal(2);
							if (rs_tDBInput_24.wasNull()) {
								row24.APPT_OBJ_TYPE = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 3) {
							row24.APPT_OBJ_ID = null;
						} else {

							row24.APPT_OBJ_ID = rs_tDBInput_24.getBigDecimal(3);
							if (rs_tDBInput_24.wasNull()) {
								row24.APPT_OBJ_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 4) {
							row24.COMPANY_ID = null;
						} else {

							row24.COMPANY_ID = rs_tDBInput_24.getBigDecimal(4);
							if (rs_tDBInput_24.wasNull()) {
								row24.COMPANY_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 5) {
							row24.APPOINTMENT_ID = null;
						} else {

							row24.APPOINTMENT_ID = rs_tDBInput_24.getBigDecimal(5);
							if (rs_tDBInput_24.wasNull()) {
								row24.APPOINTMENT_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 6) {
							row24.STOP_SEQ = null;
						} else {

							row24.STOP_SEQ = rs_tDBInput_24.getBigDecimal(6);
							if (rs_tDBInput_24.wasNull()) {
								row24.STOP_SEQ = null;
							}
						}
						if (colQtyInRs_tDBInput_24 < 7) {
							row24.ARCHIVE_DTTM = null;
						} else {

							row24.ARCHIVE_DTTM = mssqlGTU_tDBInput_24.getDate(rsmd_tDBInput_24, rs_tDBInput_24, 7);

						}
						if (colQtyInRs_tDBInput_24 < 8) {
							row24.CREATED_DTTM = null;
						} else {

							row24.CREATED_DTTM = mssqlGTU_tDBInput_24.getDate(rsmd_tDBInput_24, rs_tDBInput_24, 8);

						}
						if (colQtyInRs_tDBInput_24 < 9) {
							row24.LAST_UPDATED_DTTM = null;
						} else {

							row24.LAST_UPDATED_DTTM = mssqlGTU_tDBInput_24.getDate(rsmd_tDBInput_24, rs_tDBInput_24, 9);

						}

						log.debug("tDBInput_24 - Retrieving the record " + nb_line_tDBInput_24 + ".");

						/**
						 * [tDBInput_24 begin ] stop
						 */

						/**
						 * [tDBInput_24 main ] start
						 */

						currentComponent = "tDBInput_24";

						tos_count_tDBInput_24++;

						/**
						 * [tDBInput_24 main ] stop
						 */

						/**
						 * [tDBInput_24 process_data_begin ] start
						 */

						currentComponent = "tDBInput_24";

						/**
						 * [tDBInput_24 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_10 main ] start
						 */

						currentComponent = "tDBOutput_10";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row24", "tDBInput_24", "tDBInput_24", "tMSSqlInput", "tDBOutput_10", "tDBOutput_10",
								"tSnowflakeOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row24 - " + (row24 == null ? "" : row24.toLogString()));
						}

						if (incomingEnforcer_tDBOutput_10 != null) {
							incomingEnforcer_tDBOutput_10.createNewRecord();
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("ID") != null) {
							incomingEnforcer_tDBOutput_10.put("ID", row24.ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("APPT_OBJ_TYPE") != null) {
							incomingEnforcer_tDBOutput_10.put("APPT_OBJ_TYPE", row24.APPT_OBJ_TYPE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("APPT_OBJ_ID") != null) {
							incomingEnforcer_tDBOutput_10.put("APPT_OBJ_ID", row24.APPT_OBJ_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("COMPANY_ID") != null) {
							incomingEnforcer_tDBOutput_10.put("COMPANY_ID", row24.COMPANY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null && incomingEnforcer_tDBOutput_10.getRuntimeSchema()
								.getField("APPOINTMENT_ID") != null) {
							incomingEnforcer_tDBOutput_10.put("APPOINTMENT_ID", row24.APPOINTMENT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("STOP_SEQ") != null) {
							incomingEnforcer_tDBOutput_10.put("STOP_SEQ", row24.STOP_SEQ);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("ARCHIVE_DTTM") != null) {
							incomingEnforcer_tDBOutput_10.put("ARCHIVE_DTTM", row24.ARCHIVE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null
								&& incomingEnforcer_tDBOutput_10.getRuntimeSchema().getField("CREATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_10.put("CREATED_DTTM", row24.CREATED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_10 != null && incomingEnforcer_tDBOutput_10.getRuntimeSchema()
								.getField("LAST_UPDATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_10.put("LAST_UPDATED_DTTM", row24.LAST_UPDATED_DTTM);
						}

						org.apache.avro.generic.IndexedRecord data_tDBOutput_10 = null;
						if (incomingEnforcer_tDBOutput_10 != null) {
							data_tDBOutput_10 = incomingEnforcer_tDBOutput_10.getCurrentRecord();
						}

						if (writer_tDBOutput_10 != null && data_tDBOutput_10 != null) {
							writer_tDBOutput_10.write(data_tDBOutput_10);
						}

						nb_line_tDBOutput_10++;

						tos_count_tDBOutput_10++;

						/**
						 * [tDBOutput_10 main ] stop
						 */

						/**
						 * [tDBOutput_10 process_data_begin ] start
						 */

						currentComponent = "tDBOutput_10";

						/**
						 * [tDBOutput_10 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_10 process_data_end ] start
						 */

						currentComponent = "tDBOutput_10";

						/**
						 * [tDBOutput_10 process_data_end ] stop
						 */

						/**
						 * [tDBInput_24 process_data_end ] start
						 */

						currentComponent = "tDBInput_24";

						/**
						 * [tDBInput_24 process_data_end ] stop
						 */

						/**
						 * [tDBInput_24 end ] start
						 */

						currentComponent = "tDBInput_24";

					}
				} finally {
					if (rs_tDBInput_24 != null) {
						rs_tDBInput_24.close();
					}
					if (stmt_tDBInput_24 != null) {
						stmt_tDBInput_24.close();
					}
					if (conn_tDBInput_24 != null && !conn_tDBInput_24.isClosed()) {

						log.debug("tDBInput_24 - Closing the connection to the database.");

						conn_tDBInput_24.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_24 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_24_NB_LINE", nb_line_tDBInput_24);
				log.debug("tDBInput_24 - Retrieved records count: " + nb_line_tDBInput_24 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_24 - " + ("Done."));

				ok_Hash.put("tDBInput_24", true);
				end_Hash.put("tDBInput_24", System.currentTimeMillis());

				/**
				 * [tDBInput_24 end ] stop
				 */

				/**
				 * [tDBOutput_10 end ] start
				 */

				currentComponent = "tDBOutput_10";

// end of generic

				resourceMap.put("finish_tDBOutput_10", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_10 = null;
				if (writer_tDBOutput_10 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_10 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_10
							.close();
					resultMap_tDBOutput_10 = writer_tDBOutput_10.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_10), container_tDBOutput_10);
				}
				if (resultMap_tDBOutput_10 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_10 : resultMap_tDBOutput_10.entrySet()) {
						switch (entry_tDBOutput_10.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_10.setComponentData("tDBOutput_10", "ERROR_MESSAGE",
									entry_tDBOutput_10.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_10.setComponentData("tDBOutput_10", "NB_LINE",
									entry_tDBOutput_10.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_10.setComponentData("tDBOutput_10", "NB_SUCCESS",
									entry_tDBOutput_10.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_10.setComponentData("tDBOutput_10", "NB_REJECT",
									entry_tDBOutput_10.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_10 = new StringBuilder();
							for (int i_tDBOutput_10 = 0; i_tDBOutput_10 < entry_tDBOutput_10.getKey()
									.length(); i_tDBOutput_10++) {
								char ch_tDBOutput_10 = entry_tDBOutput_10.getKey().charAt(i_tDBOutput_10);
								if (Character.isUpperCase(ch_tDBOutput_10) && i_tDBOutput_10 > 0) {
									studio_key_tDBOutput_10.append('_');
								}
								studio_key_tDBOutput_10.append(ch_tDBOutput_10);
							}
							container_tDBOutput_10.setComponentData("tDBOutput_10",
									studio_key_tDBOutput_10.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_10.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row24", 2, 0,
						"tDBInput_24", "tDBInput_24", "tMSSqlInput", "tDBOutput_10", "tDBOutput_10", "tSnowflakeOutput",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_10", true);
				end_Hash.put("tDBOutput_10", System.currentTimeMillis());

				/**
				 * [tDBOutput_10 end ] stop
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
				 * [tDBInput_24 finally ] start
				 */

				currentComponent = "tDBInput_24";

				/**
				 * [tDBInput_24 finally ] stop
				 */

				/**
				 * [tDBOutput_10 finally ] start
				 */

				currentComponent = "tDBOutput_10";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_10") == null) {
					if (resourceMap.get("writer_tDBOutput_10") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap
									.get("writer_tDBOutput_10")).close();
						} catch (java.io.IOException e_tDBOutput_10) {
							String errorMessage_tDBOutput_10 = "failed to release the resource in tDBOutput_10 :"
									+ e_tDBOutput_10.getMessage();
							System.err.println(errorMessage_tDBOutput_10);
						}
					}
				}

				/**
				 * [tDBOutput_10 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_24_SUBPROCESS_STATE", 1);
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
				globalMap.remove("tDBInput_1_SUBPROCESS_STATE");
				globalMap.remove("tDBInput_24_SUBPROCESS_STATE");
				globalMap.remove("tDBInput_14_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if (globalMap instanceof java.util.HashMap) {
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				} else {
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;

				runningThreadCount.add(1);
				String name_tDBInput_1 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBInput_1 = new Thread(new ThreadGroup(name_tDBInput_1), name_tDBInput_1) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_1' starts.");

							tDBInput_1Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_1' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_1_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_1_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBInput_1.start();
				mt_tParallelize_1.put("tDBInput_1", thread_tDBInput_1);
				runningThreadCount.add(1);
				String name_tDBInput_24 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBInput_24 = new Thread(new ThreadGroup(name_tDBInput_24), name_tDBInput_24) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_24' starts.");

							tDBInput_24Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_24' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_24_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_24_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBInput_24.start();
				mt_tParallelize_1.put("tDBInput_24", thread_tDBInput_24);
				runningThreadCount.add(1);
				String name_tDBInput_14 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBInput_14 = new Thread(new ThreadGroup(name_tDBInput_14), name_tDBInput_14) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_14' starts.");

							tDBInput_14Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBInput_14' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_14_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBInput_14_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBInput_14.start();
				mt_tParallelize_1.put("tDBInput_14", thread_tDBInput_14);
				while ((((globalMap.get("tDBInput_1_SUBPROCESS_STATE") == null) ? true
						: ((Integer) globalMap.get("tDBInput_1_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBInput_24_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBInput_24_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBInput_14_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBInput_14_SUBPROCESS_STATE") == 0))
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
		final SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLESClass = new SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES();

		int exitCode = SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLESClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES' - Done.");
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
		log.info("TalendJob: 'SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_GvRmIAagEeqS3P9meBs8cg");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-27T17:51:26.716528500Z");

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
			java.io.InputStream inContext = SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/sql_etl_daily_truncate_reload_tables_0_1/contexts/"
							+ contextStr + ".properties");
			if (inContext == null) {
				inContext = SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES.class.getClassLoader()
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
		log.info("TalendJob: 'SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES' - Started.");
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
			System.out.println((endUsedMemory - startUsedMemory)
					+ " bytes memory increase when running : SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES");
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
		log.info("TalendJob: 'SQL_ETL_DAILY_TRUNCATE_RELOAD_TABLES' - Finished - status: " + status + " returnCode: "
				+ returnCode);

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
		connections.put("tDBConnection_2_connection", globalMap.get("tDBConnection_2_connection"));
		connections.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES",
				globalMap.get("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES"));
		connections.put("tDBConnection_3_connection", globalMap.get("tDBConnection_3_connection"));
		connections.put("tDBConnection_3_COMPONENT_RUNTIME_PROPERTIES",
				globalMap.get("tDBConnection_3_COMPONENT_RUNTIME_PROPERTIES"));

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
 * 664621 characters generated by Talend Cloud Data Management Platform on the
 * June 27, 2023 at 1:51:26 PM EDT
 ************************************************************************************************/