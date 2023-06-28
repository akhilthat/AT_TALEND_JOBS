
package at_talend_jobs.transfer_header_trfhdr_0_1;

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
 * Job: TRANSFER_HEADER_TRFHDR Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class TRANSFER_HEADER_TRFHDR implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TRANSFER_HEADER_TRFHDR.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(TRANSFER_HEADER_TRFHDR.class);

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
	private final String jobName = "TRANSFER_HEADER_TRFHDR";
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
			"_S3xAcDZMEeqYYKudWeBa8Q", "0.1");
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
					TRANSFER_HEADER_TRFHDR.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TRANSFER_HEADER_TRFHDR.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBRow_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_12_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_7_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_7_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_5_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_9_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_8_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_12_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_6_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_7_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent,
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

	public void tDBRow_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_5_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_5");
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
				 * [tDBRow_5 begin ] start
				 */

				ok_Hash.put("tDBRow_5", false);
				start_Hash.put("tDBRow_5", System.currentTimeMillis());

				currentComponent = "tDBRow_5";

				int tos_count_tDBRow_5 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_5", "tDBRow_5", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_5 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_5 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_5 = (String) (restRequest_tDBRow_5 != null
						? restRequest_tDBRow_5.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_5 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_5 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_5 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_5 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_5
						.createRuntimeProperties();
				props_tDBRow_5.setValue("query",
						"DELETE from TRANSFER_HEADER_TRFHDR\nWHERE DATELOADED = CURRENT_DATE() - 1");

				props_tDBRow_5.setValue("dieOnError", true);

				props_tDBRow_5.setValue("usePreparedStatement", false);

				props_tDBRow_5.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_5_1_fisrt {

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

				SchemaSettingTool_tDBRow_5_1_fisrt sst_tDBRow_5_1_fisrt = new SchemaSettingTool_tDBRow_5_1_fisrt();

				props_tDBRow_5.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_5_2_fisrt {

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

				SchemaSettingTool_tDBRow_5_2_fisrt sst_tDBRow_5_2_fisrt = new SchemaSettingTool_tDBRow_5_2_fisrt();

				props_tDBRow_5.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_2_fisrt.getSchemaValue()));

				props_tDBRow_5.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_5.connection.setValue("useCustomRegion", false);

				props_tDBRow_5.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_5.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_5.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_5.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_5.table.setValue("tableName", "");

				props_tDBRow_5.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_5.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_5.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_5.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_5.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_5.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_5_3_fisrt {

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

				SchemaSettingTool_tDBRow_5_3_fisrt sst_tDBRow_5_3_fisrt = new SchemaSettingTool_tDBRow_5_3_fisrt();

				props_tDBRow_5.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_5.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_5 = props_tDBRow_5.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_5 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_5 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_5 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_5.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_5);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_5.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_5 = props_tDBRow_5.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_5 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_5 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_5 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_5.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_5);
					}
				}
				globalMap.put("tDBRow_5_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_5);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_5 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_5_MAPPINGS_URL", mappings_url_tDBRow_5);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_5 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_5";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_5 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_5 = null;
				topology_tDBRow_5 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_5 = def_tDBRow_5.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_5,
						topology_tDBRow_5);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_5 = def_tDBRow_5
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_5 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_5.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_5 = componentRuntime_tDBRow_5
						.initialize(container_tDBRow_5, props_tDBRow_5);

				if (initVr_tDBRow_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_5.getMessage());
				}

				if (componentRuntime_tDBRow_5 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_5 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_5;
					compDriverInitialization_tDBRow_5.runAtDriver(container_tDBRow_5);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_5 = null;
				if (componentRuntime_tDBRow_5 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_5 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_5;
					if (doesNodeBelongToRequest_tDBRow_5) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_5 = sourceOrSink_tDBRow_5
								.validate(container_tDBRow_5);
						if (vr_tDBRow_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_5.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_5 begin ] stop
				 */

				/**
				 * [tDBRow_5 main ] start
				 */

				currentComponent = "tDBRow_5";

				tos_count_tDBRow_5++;

				/**
				 * [tDBRow_5 main ] stop
				 */

				/**
				 * [tDBRow_5 process_data_begin ] start
				 */

				currentComponent = "tDBRow_5";

				/**
				 * [tDBRow_5 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_5 process_data_end ] start
				 */

				currentComponent = "tDBRow_5";

				/**
				 * [tDBRow_5 process_data_end ] stop
				 */

				/**
				 * [tDBRow_5 end ] start
				 */

				currentComponent = "tDBRow_5";

// end of generic

				resourceMap.put("finish_tDBRow_5", Boolean.TRUE);

				ok_Hash.put("tDBRow_5", true);
				end_Hash.put("tDBRow_5", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBRow_9Process(globalMap);

				/**
				 * [tDBRow_5 end ] stop
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
				 * [tDBRow_5 finally ] start
				 */

				currentComponent = "tDBRow_5";

// finally of generic

				if (resourceMap.get("finish_tDBRow_5") == null) {
				}

				/**
				 * [tDBRow_5 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_5_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_9Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_9_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_9");
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
				 * [tDBRow_9 begin ] start
				 */

				ok_Hash.put("tDBRow_9", false);
				start_Hash.put("tDBRow_9", System.currentTimeMillis());

				currentComponent = "tDBRow_9";

				int tos_count_tDBRow_9 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_9", "tDBRow_9", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_9 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_9 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_9 = (String) (restRequest_tDBRow_9 != null
						? restRequest_tDBRow_9.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_9 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_9 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_9 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_9 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_9
						.createRuntimeProperties();
				props_tDBRow_9.setValue("query",
						"\ncreate or replace TABLE TRFHDR (\n	TRFBCH VARCHAR(8),\n	TRFSTS VARCHAR(1),\n	TRFTYP VARCHAR(1),\n	TRFPTY VARCHAR(1),"
								+ "\n	TRFFLC NUMBER(5,0),\n	TRFTLC NUMBER(5,0),\n	TRFICN FLOAT,\n	TRFIDT FLOAT,\n	TRFBCN FLOAT,\n	TRFBDT FLOAT,\n	TRFSCN FLO"
								+ "AT,\n	TRFSDT FLOAT,\n	TRFRCN FLOAT,\n	TRFRDT FLOAT,\n	TRFINS VARCHAR(30),\n	TRFDLC VARCHAR(8),\n	TRFREF VARCHAR(8),\n	TR"
								+ "FPYN VARCHAR(1),\n	TRINIT VARCHAR(1),\n	TRFPON VARCHAR,\n	TRFBON FLOAT,\n	THTUNT NUMBER(11,2),\n	THTPCK NUMBER(9,0),\n	T"
								+ "HTPLT NUMBER(11,2),\n	THTCTN NUMBER(11,2),\n	THTIPK NUMBER(11,2),\n	THTRTA NUMBER(11,2),\n	THTCST NUMBER(11,3),\n	THTCUB"
								+ " NUMBER(11,3),\n	THTUNP NUMBER(11,2),\n	THTPLP NUMBER(11,2),\n	THTCTP NUMBER(11,2),\n	THTIPP NUMBER(11,2),\n	THTRTP NUMB"
								+ "ER(11,2),\n	THTCSP NUMBER(11,3),\n	THTPCU NUMBER(11,3),\n	TRPKLN NUMBER(5,0),\n	THCYCL NUMBER(5,0),\n	THSCWV FLOAT,\n	TH"
								+ "SCSQ FLOAT,\n	THSCNM VARCHAR(8),\n	TRFXRF VARCHAR(8),\n	THCNYN VARCHAR(1)\n);\n\n");

				props_tDBRow_9.setValue("dieOnError", true);

				props_tDBRow_9.setValue("usePreparedStatement", false);

				props_tDBRow_9.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_9_1_fisrt {

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

				SchemaSettingTool_tDBRow_9_1_fisrt sst_tDBRow_9_1_fisrt = new SchemaSettingTool_tDBRow_9_1_fisrt();

				props_tDBRow_9.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_9_2_fisrt {

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

				SchemaSettingTool_tDBRow_9_2_fisrt sst_tDBRow_9_2_fisrt = new SchemaSettingTool_tDBRow_9_2_fisrt();

				props_tDBRow_9.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_2_fisrt.getSchemaValue()));

				props_tDBRow_9.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_9.connection.setValue("useCustomRegion", false);

				props_tDBRow_9.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_9.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_9.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_9.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_9.table.setValue("tableName", "");

				props_tDBRow_9.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_9.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_9.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_9.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_9.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_9.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_9_3_fisrt {

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

				SchemaSettingTool_tDBRow_9_3_fisrt sst_tDBRow_9_3_fisrt = new SchemaSettingTool_tDBRow_9_3_fisrt();

				props_tDBRow_9.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_9.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_9 = props_tDBRow_9.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_9 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_9 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_9 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_9.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_9);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_9.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_9 = props_tDBRow_9.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_9 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_9 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_9 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_9.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_9);
					}
				}
				globalMap.put("tDBRow_9_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_9);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_9 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_9_MAPPINGS_URL", mappings_url_tDBRow_9);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_9 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_9";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_9 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_9 = null;
				topology_tDBRow_9 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_9 = def_tDBRow_9.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_9,
						topology_tDBRow_9);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_9 = def_tDBRow_9
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_9 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_9.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_9 = componentRuntime_tDBRow_9
						.initialize(container_tDBRow_9, props_tDBRow_9);

				if (initVr_tDBRow_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_9.getMessage());
				}

				if (componentRuntime_tDBRow_9 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_9 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_9;
					compDriverInitialization_tDBRow_9.runAtDriver(container_tDBRow_9);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_9 = null;
				if (componentRuntime_tDBRow_9 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_9 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_9;
					if (doesNodeBelongToRequest_tDBRow_9) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_9 = sourceOrSink_tDBRow_9
								.validate(container_tDBRow_9);
						if (vr_tDBRow_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_9.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_9 begin ] stop
				 */

				/**
				 * [tDBRow_9 main ] start
				 */

				currentComponent = "tDBRow_9";

				tos_count_tDBRow_9++;

				/**
				 * [tDBRow_9 main ] stop
				 */

				/**
				 * [tDBRow_9 process_data_begin ] start
				 */

				currentComponent = "tDBRow_9";

				/**
				 * [tDBRow_9 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_9 process_data_end ] start
				 */

				currentComponent = "tDBRow_9";

				/**
				 * [tDBRow_9 process_data_end ] stop
				 */

				/**
				 * [tDBRow_9 end ] start
				 */

				currentComponent = "tDBRow_9";

// end of generic

				resourceMap.put("finish_tDBRow_9", Boolean.TRUE);

				ok_Hash.put("tDBRow_9", true);
				end_Hash.put("tDBRow_9", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBInput_8Process(globalMap);

				/**
				 * [tDBRow_9 end ] stop
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
				 * [tDBRow_9 finally ] start
				 */

				currentComponent = "tDBRow_9";

// finally of generic

				if (resourceMap.get("finish_tDBRow_9") == null) {
				}

				/**
				 * [tDBRow_9 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_9_SUBPROCESS_STATE", 1);
	}

	public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[0];

		public String TRFBCH;

		public String getTRFBCH() {
			return this.TRFBCH;
		}

		public Boolean TRFBCHIsNullable() {
			return false;
		}

		public Boolean TRFBCHIsKey() {
			return false;
		}

		public Integer TRFBCHLength() {
			return 8;
		}

		public Integer TRFBCHPrecision() {
			return 0;
		}

		public String TRFBCHDefault() {

			return null;

		}

		public String TRFBCHComment() {

			return "";

		}

		public String TRFBCHPattern() {

			return "";

		}

		public String TRFBCHOriginalDbColumnName() {

			return "TRFBCH";

		}

		public String TRFSTS;

		public String getTRFSTS() {
			return this.TRFSTS;
		}

		public Boolean TRFSTSIsNullable() {
			return false;
		}

		public Boolean TRFSTSIsKey() {
			return false;
		}

		public Integer TRFSTSLength() {
			return 1;
		}

		public Integer TRFSTSPrecision() {
			return 0;
		}

		public String TRFSTSDefault() {

			return null;

		}

		public String TRFSTSComment() {

			return "";

		}

		public String TRFSTSPattern() {

			return "";

		}

		public String TRFSTSOriginalDbColumnName() {

			return "TRFSTS";

		}

		public String TRFTYP;

		public String getTRFTYP() {
			return this.TRFTYP;
		}

		public Boolean TRFTYPIsNullable() {
			return false;
		}

		public Boolean TRFTYPIsKey() {
			return false;
		}

		public Integer TRFTYPLength() {
			return 1;
		}

		public Integer TRFTYPPrecision() {
			return 0;
		}

		public String TRFTYPDefault() {

			return null;

		}

		public String TRFTYPComment() {

			return "";

		}

		public String TRFTYPPattern() {

			return "";

		}

		public String TRFTYPOriginalDbColumnName() {

			return "TRFTYP";

		}

		public String TRFPTY;

		public String getTRFPTY() {
			return this.TRFPTY;
		}

		public Boolean TRFPTYIsNullable() {
			return false;
		}

		public Boolean TRFPTYIsKey() {
			return false;
		}

		public Integer TRFPTYLength() {
			return 1;
		}

		public Integer TRFPTYPrecision() {
			return 0;
		}

		public String TRFPTYDefault() {

			return null;

		}

		public String TRFPTYComment() {

			return "";

		}

		public String TRFPTYPattern() {

			return "";

		}

		public String TRFPTYOriginalDbColumnName() {

			return "TRFPTY";

		}

		public BigDecimal TRFFLC;

		public BigDecimal getTRFFLC() {
			return this.TRFFLC;
		}

		public Boolean TRFFLCIsNullable() {
			return false;
		}

		public Boolean TRFFLCIsKey() {
			return false;
		}

		public Integer TRFFLCLength() {
			return 5;
		}

		public Integer TRFFLCPrecision() {
			return 0;
		}

		public String TRFFLCDefault() {

			return "";

		}

		public String TRFFLCComment() {

			return "";

		}

		public String TRFFLCPattern() {

			return "";

		}

		public String TRFFLCOriginalDbColumnName() {

			return "TRFFLC";

		}

		public BigDecimal TRFTLC;

		public BigDecimal getTRFTLC() {
			return this.TRFTLC;
		}

		public Boolean TRFTLCIsNullable() {
			return false;
		}

		public Boolean TRFTLCIsKey() {
			return false;
		}

		public Integer TRFTLCLength() {
			return 5;
		}

		public Integer TRFTLCPrecision() {
			return 0;
		}

		public String TRFTLCDefault() {

			return "";

		}

		public String TRFTLCComment() {

			return "";

		}

		public String TRFTLCPattern() {

			return "";

		}

		public String TRFTLCOriginalDbColumnName() {

			return "TRFTLC";

		}

		public float TRFICN;

		public float getTRFICN() {
			return this.TRFICN;
		}

		public Boolean TRFICNIsNullable() {
			return false;
		}

		public Boolean TRFICNIsKey() {
			return false;
		}

		public Integer TRFICNLength() {
			return 1;
		}

		public Integer TRFICNPrecision() {
			return 0;
		}

		public String TRFICNDefault() {

			return "";

		}

		public String TRFICNComment() {

			return "";

		}

		public String TRFICNPattern() {

			return "";

		}

		public String TRFICNOriginalDbColumnName() {

			return "TRFICN";

		}

		public float TRFIDT;

		public float getTRFIDT() {
			return this.TRFIDT;
		}

		public Boolean TRFIDTIsNullable() {
			return false;
		}

		public Boolean TRFIDTIsKey() {
			return false;
		}

		public Integer TRFIDTLength() {
			return 6;
		}

		public Integer TRFIDTPrecision() {
			return 0;
		}

		public String TRFIDTDefault() {

			return "";

		}

		public String TRFIDTComment() {

			return "";

		}

		public String TRFIDTPattern() {

			return "";

		}

		public String TRFIDTOriginalDbColumnName() {

			return "TRFIDT";

		}

		public float TRFBCN;

		public float getTRFBCN() {
			return this.TRFBCN;
		}

		public Boolean TRFBCNIsNullable() {
			return false;
		}

		public Boolean TRFBCNIsKey() {
			return false;
		}

		public Integer TRFBCNLength() {
			return 1;
		}

		public Integer TRFBCNPrecision() {
			return 0;
		}

		public String TRFBCNDefault() {

			return "";

		}

		public String TRFBCNComment() {

			return "";

		}

		public String TRFBCNPattern() {

			return "";

		}

		public String TRFBCNOriginalDbColumnName() {

			return "TRFBCN";

		}

		public float TRFBDT;

		public float getTRFBDT() {
			return this.TRFBDT;
		}

		public Boolean TRFBDTIsNullable() {
			return false;
		}

		public Boolean TRFBDTIsKey() {
			return false;
		}

		public Integer TRFBDTLength() {
			return 6;
		}

		public Integer TRFBDTPrecision() {
			return 0;
		}

		public String TRFBDTDefault() {

			return "";

		}

		public String TRFBDTComment() {

			return "";

		}

		public String TRFBDTPattern() {

			return "";

		}

		public String TRFBDTOriginalDbColumnName() {

			return "TRFBDT";

		}

		public float TRFSCN;

		public float getTRFSCN() {
			return this.TRFSCN;
		}

		public Boolean TRFSCNIsNullable() {
			return false;
		}

		public Boolean TRFSCNIsKey() {
			return false;
		}

		public Integer TRFSCNLength() {
			return 1;
		}

		public Integer TRFSCNPrecision() {
			return 0;
		}

		public String TRFSCNDefault() {

			return "";

		}

		public String TRFSCNComment() {

			return "";

		}

		public String TRFSCNPattern() {

			return "";

		}

		public String TRFSCNOriginalDbColumnName() {

			return "TRFSCN";

		}

		public float TRFSDT;

		public float getTRFSDT() {
			return this.TRFSDT;
		}

		public Boolean TRFSDTIsNullable() {
			return false;
		}

		public Boolean TRFSDTIsKey() {
			return false;
		}

		public Integer TRFSDTLength() {
			return 6;
		}

		public Integer TRFSDTPrecision() {
			return 0;
		}

		public String TRFSDTDefault() {

			return "";

		}

		public String TRFSDTComment() {

			return "";

		}

		public String TRFSDTPattern() {

			return "";

		}

		public String TRFSDTOriginalDbColumnName() {

			return "TRFSDT";

		}

		public float TRFRCN;

		public float getTRFRCN() {
			return this.TRFRCN;
		}

		public Boolean TRFRCNIsNullable() {
			return false;
		}

		public Boolean TRFRCNIsKey() {
			return false;
		}

		public Integer TRFRCNLength() {
			return 1;
		}

		public Integer TRFRCNPrecision() {
			return 0;
		}

		public String TRFRCNDefault() {

			return "";

		}

		public String TRFRCNComment() {

			return "";

		}

		public String TRFRCNPattern() {

			return "";

		}

		public String TRFRCNOriginalDbColumnName() {

			return "TRFRCN";

		}

		public float TRFRDT;

		public float getTRFRDT() {
			return this.TRFRDT;
		}

		public Boolean TRFRDTIsNullable() {
			return false;
		}

		public Boolean TRFRDTIsKey() {
			return false;
		}

		public Integer TRFRDTLength() {
			return 6;
		}

		public Integer TRFRDTPrecision() {
			return 0;
		}

		public String TRFRDTDefault() {

			return "";

		}

		public String TRFRDTComment() {

			return "";

		}

		public String TRFRDTPattern() {

			return "";

		}

		public String TRFRDTOriginalDbColumnName() {

			return "TRFRDT";

		}

		public String TRFINS;

		public String getTRFINS() {
			return this.TRFINS;
		}

		public Boolean TRFINSIsNullable() {
			return false;
		}

		public Boolean TRFINSIsKey() {
			return false;
		}

		public Integer TRFINSLength() {
			return 30;
		}

		public Integer TRFINSPrecision() {
			return 0;
		}

		public String TRFINSDefault() {

			return "";

		}

		public String TRFINSComment() {

			return "";

		}

		public String TRFINSPattern() {

			return "";

		}

		public String TRFINSOriginalDbColumnName() {

			return "TRFINS";

		}

		public String TRFDLC;

		public String getTRFDLC() {
			return this.TRFDLC;
		}

		public Boolean TRFDLCIsNullable() {
			return false;
		}

		public Boolean TRFDLCIsKey() {
			return false;
		}

		public Integer TRFDLCLength() {
			return 8;
		}

		public Integer TRFDLCPrecision() {
			return 0;
		}

		public String TRFDLCDefault() {

			return "";

		}

		public String TRFDLCComment() {

			return "";

		}

		public String TRFDLCPattern() {

			return "";

		}

		public String TRFDLCOriginalDbColumnName() {

			return "TRFDLC";

		}

		public String TRFREF;

		public String getTRFREF() {
			return this.TRFREF;
		}

		public Boolean TRFREFIsNullable() {
			return false;
		}

		public Boolean TRFREFIsKey() {
			return false;
		}

		public Integer TRFREFLength() {
			return 8;
		}

		public Integer TRFREFPrecision() {
			return 0;
		}

		public String TRFREFDefault() {

			return "";

		}

		public String TRFREFComment() {

			return "";

		}

		public String TRFREFPattern() {

			return "";

		}

		public String TRFREFOriginalDbColumnName() {

			return "TRFREF";

		}

		public String TRFPYN;

		public String getTRFPYN() {
			return this.TRFPYN;
		}

		public Boolean TRFPYNIsNullable() {
			return false;
		}

		public Boolean TRFPYNIsKey() {
			return false;
		}

		public Integer TRFPYNLength() {
			return 1;
		}

		public Integer TRFPYNPrecision() {
			return 0;
		}

		public String TRFPYNDefault() {

			return "";

		}

		public String TRFPYNComment() {

			return "";

		}

		public String TRFPYNPattern() {

			return "";

		}

		public String TRFPYNOriginalDbColumnName() {

			return "TRFPYN";

		}

		public String TRINIT;

		public String getTRINIT() {
			return this.TRINIT;
		}

		public Boolean TRINITIsNullable() {
			return false;
		}

		public Boolean TRINITIsKey() {
			return false;
		}

		public Integer TRINITLength() {
			return 1;
		}

		public Integer TRINITPrecision() {
			return 0;
		}

		public String TRINITDefault() {

			return "";

		}

		public String TRINITComment() {

			return "";

		}

		public String TRINITPattern() {

			return "";

		}

		public String TRINITOriginalDbColumnName() {

			return "TRINIT";

		}

		public BigDecimal TRFPON;

		public BigDecimal getTRFPON() {
			return this.TRFPON;
		}

		public Boolean TRFPONIsNullable() {
			return false;
		}

		public Boolean TRFPONIsKey() {
			return false;
		}

		public Integer TRFPONLength() {
			return 6;
		}

		public Integer TRFPONPrecision() {
			return 0;
		}

		public String TRFPONDefault() {

			return "";

		}

		public String TRFPONComment() {

			return "";

		}

		public String TRFPONPattern() {

			return "";

		}

		public String TRFPONOriginalDbColumnName() {

			return "TRFPON";

		}

		public float TRFBON;

		public float getTRFBON() {
			return this.TRFBON;
		}

		public Boolean TRFBONIsNullable() {
			return false;
		}

		public Boolean TRFBONIsKey() {
			return false;
		}

		public Integer TRFBONLength() {
			return 2;
		}

		public Integer TRFBONPrecision() {
			return 0;
		}

		public String TRFBONDefault() {

			return "";

		}

		public String TRFBONComment() {

			return "";

		}

		public String TRFBONPattern() {

			return "";

		}

		public String TRFBONOriginalDbColumnName() {

			return "TRFBON";

		}

		public BigDecimal THTUNT;

		public BigDecimal getTHTUNT() {
			return this.THTUNT;
		}

		public Boolean THTUNTIsNullable() {
			return false;
		}

		public Boolean THTUNTIsKey() {
			return false;
		}

		public Integer THTUNTLength() {
			return 11;
		}

		public Integer THTUNTPrecision() {
			return 2;
		}

		public String THTUNTDefault() {

			return "";

		}

		public String THTUNTComment() {

			return "";

		}

		public String THTUNTPattern() {

			return "";

		}

		public String THTUNTOriginalDbColumnName() {

			return "THTUNT";

		}

		public BigDecimal THTPCK;

		public BigDecimal getTHTPCK() {
			return this.THTPCK;
		}

		public Boolean THTPCKIsNullable() {
			return false;
		}

		public Boolean THTPCKIsKey() {
			return false;
		}

		public Integer THTPCKLength() {
			return 9;
		}

		public Integer THTPCKPrecision() {
			return 0;
		}

		public String THTPCKDefault() {

			return "";

		}

		public String THTPCKComment() {

			return "";

		}

		public String THTPCKPattern() {

			return "";

		}

		public String THTPCKOriginalDbColumnName() {

			return "THTPCK";

		}

		public BigDecimal THTPLT;

		public BigDecimal getTHTPLT() {
			return this.THTPLT;
		}

		public Boolean THTPLTIsNullable() {
			return false;
		}

		public Boolean THTPLTIsKey() {
			return false;
		}

		public Integer THTPLTLength() {
			return 11;
		}

		public Integer THTPLTPrecision() {
			return 2;
		}

		public String THTPLTDefault() {

			return "";

		}

		public String THTPLTComment() {

			return "";

		}

		public String THTPLTPattern() {

			return "";

		}

		public String THTPLTOriginalDbColumnName() {

			return "THTPLT";

		}

		public BigDecimal THTCTN;

		public BigDecimal getTHTCTN() {
			return this.THTCTN;
		}

		public Boolean THTCTNIsNullable() {
			return false;
		}

		public Boolean THTCTNIsKey() {
			return false;
		}

		public Integer THTCTNLength() {
			return 11;
		}

		public Integer THTCTNPrecision() {
			return 2;
		}

		public String THTCTNDefault() {

			return "";

		}

		public String THTCTNComment() {

			return "";

		}

		public String THTCTNPattern() {

			return "";

		}

		public String THTCTNOriginalDbColumnName() {

			return "THTCTN";

		}

		public BigDecimal THTIPK;

		public BigDecimal getTHTIPK() {
			return this.THTIPK;
		}

		public Boolean THTIPKIsNullable() {
			return false;
		}

		public Boolean THTIPKIsKey() {
			return false;
		}

		public Integer THTIPKLength() {
			return 11;
		}

		public Integer THTIPKPrecision() {
			return 2;
		}

		public String THTIPKDefault() {

			return "";

		}

		public String THTIPKComment() {

			return "";

		}

		public String THTIPKPattern() {

			return "";

		}

		public String THTIPKOriginalDbColumnName() {

			return "THTIPK";

		}

		public BigDecimal THTRTA;

		public BigDecimal getTHTRTA() {
			return this.THTRTA;
		}

		public Boolean THTRTAIsNullable() {
			return false;
		}

		public Boolean THTRTAIsKey() {
			return false;
		}

		public Integer THTRTALength() {
			return 11;
		}

		public Integer THTRTAPrecision() {
			return 2;
		}

		public String THTRTADefault() {

			return "";

		}

		public String THTRTAComment() {

			return "";

		}

		public String THTRTAPattern() {

			return "";

		}

		public String THTRTAOriginalDbColumnName() {

			return "THTRTA";

		}

		public BigDecimal THTCST;

		public BigDecimal getTHTCST() {
			return this.THTCST;
		}

		public Boolean THTCSTIsNullable() {
			return false;
		}

		public Boolean THTCSTIsKey() {
			return false;
		}

		public Integer THTCSTLength() {
			return 11;
		}

		public Integer THTCSTPrecision() {
			return 3;
		}

		public String THTCSTDefault() {

			return "";

		}

		public String THTCSTComment() {

			return "";

		}

		public String THTCSTPattern() {

			return "";

		}

		public String THTCSTOriginalDbColumnName() {

			return "THTCST";

		}

		public BigDecimal THTCUB;

		public BigDecimal getTHTCUB() {
			return this.THTCUB;
		}

		public Boolean THTCUBIsNullable() {
			return false;
		}

		public Boolean THTCUBIsKey() {
			return false;
		}

		public Integer THTCUBLength() {
			return 11;
		}

		public Integer THTCUBPrecision() {
			return 3;
		}

		public String THTCUBDefault() {

			return "";

		}

		public String THTCUBComment() {

			return "";

		}

		public String THTCUBPattern() {

			return "";

		}

		public String THTCUBOriginalDbColumnName() {

			return "THTCUB";

		}

		public BigDecimal THTUNP;

		public BigDecimal getTHTUNP() {
			return this.THTUNP;
		}

		public Boolean THTUNPIsNullable() {
			return false;
		}

		public Boolean THTUNPIsKey() {
			return false;
		}

		public Integer THTUNPLength() {
			return 11;
		}

		public Integer THTUNPPrecision() {
			return 2;
		}

		public String THTUNPDefault() {

			return "";

		}

		public String THTUNPComment() {

			return "";

		}

		public String THTUNPPattern() {

			return "";

		}

		public String THTUNPOriginalDbColumnName() {

			return "THTUNP";

		}

		public BigDecimal THTPLP;

		public BigDecimal getTHTPLP() {
			return this.THTPLP;
		}

		public Boolean THTPLPIsNullable() {
			return false;
		}

		public Boolean THTPLPIsKey() {
			return false;
		}

		public Integer THTPLPLength() {
			return 11;
		}

		public Integer THTPLPPrecision() {
			return 2;
		}

		public String THTPLPDefault() {

			return "";

		}

		public String THTPLPComment() {

			return "";

		}

		public String THTPLPPattern() {

			return "";

		}

		public String THTPLPOriginalDbColumnName() {

			return "THTPLP";

		}

		public BigDecimal THTCTP;

		public BigDecimal getTHTCTP() {
			return this.THTCTP;
		}

		public Boolean THTCTPIsNullable() {
			return false;
		}

		public Boolean THTCTPIsKey() {
			return false;
		}

		public Integer THTCTPLength() {
			return 11;
		}

		public Integer THTCTPPrecision() {
			return 2;
		}

		public String THTCTPDefault() {

			return "";

		}

		public String THTCTPComment() {

			return "";

		}

		public String THTCTPPattern() {

			return "";

		}

		public String THTCTPOriginalDbColumnName() {

			return "THTCTP";

		}

		public BigDecimal THTIPP;

		public BigDecimal getTHTIPP() {
			return this.THTIPP;
		}

		public Boolean THTIPPIsNullable() {
			return false;
		}

		public Boolean THTIPPIsKey() {
			return false;
		}

		public Integer THTIPPLength() {
			return 11;
		}

		public Integer THTIPPPrecision() {
			return 2;
		}

		public String THTIPPDefault() {

			return "";

		}

		public String THTIPPComment() {

			return "";

		}

		public String THTIPPPattern() {

			return "";

		}

		public String THTIPPOriginalDbColumnName() {

			return "THTIPP";

		}

		public BigDecimal THTRTP;

		public BigDecimal getTHTRTP() {
			return this.THTRTP;
		}

		public Boolean THTRTPIsNullable() {
			return false;
		}

		public Boolean THTRTPIsKey() {
			return false;
		}

		public Integer THTRTPLength() {
			return 11;
		}

		public Integer THTRTPPrecision() {
			return 2;
		}

		public String THTRTPDefault() {

			return "";

		}

		public String THTRTPComment() {

			return "";

		}

		public String THTRTPPattern() {

			return "";

		}

		public String THTRTPOriginalDbColumnName() {

			return "THTRTP";

		}

		public BigDecimal THTCSP;

		public BigDecimal getTHTCSP() {
			return this.THTCSP;
		}

		public Boolean THTCSPIsNullable() {
			return false;
		}

		public Boolean THTCSPIsKey() {
			return false;
		}

		public Integer THTCSPLength() {
			return 11;
		}

		public Integer THTCSPPrecision() {
			return 3;
		}

		public String THTCSPDefault() {

			return "";

		}

		public String THTCSPComment() {

			return "";

		}

		public String THTCSPPattern() {

			return "";

		}

		public String THTCSPOriginalDbColumnName() {

			return "THTCSP";

		}

		public BigDecimal THTPCU;

		public BigDecimal getTHTPCU() {
			return this.THTPCU;
		}

		public Boolean THTPCUIsNullable() {
			return false;
		}

		public Boolean THTPCUIsKey() {
			return false;
		}

		public Integer THTPCULength() {
			return 11;
		}

		public Integer THTPCUPrecision() {
			return 3;
		}

		public String THTPCUDefault() {

			return "";

		}

		public String THTPCUComment() {

			return "";

		}

		public String THTPCUPattern() {

			return "";

		}

		public String THTPCUOriginalDbColumnName() {

			return "THTPCU";

		}

		public BigDecimal TRPKLN;

		public BigDecimal getTRPKLN() {
			return this.TRPKLN;
		}

		public Boolean TRPKLNIsNullable() {
			return false;
		}

		public Boolean TRPKLNIsKey() {
			return false;
		}

		public Integer TRPKLNLength() {
			return 5;
		}

		public Integer TRPKLNPrecision() {
			return 0;
		}

		public String TRPKLNDefault() {

			return "";

		}

		public String TRPKLNComment() {

			return "";

		}

		public String TRPKLNPattern() {

			return "";

		}

		public String TRPKLNOriginalDbColumnName() {

			return "TRPKLN";

		}

		public BigDecimal THCYCL;

		public BigDecimal getTHCYCL() {
			return this.THCYCL;
		}

		public Boolean THCYCLIsNullable() {
			return false;
		}

		public Boolean THCYCLIsKey() {
			return false;
		}

		public Integer THCYCLLength() {
			return 5;
		}

		public Integer THCYCLPrecision() {
			return 0;
		}

		public String THCYCLDefault() {

			return "";

		}

		public String THCYCLComment() {

			return "";

		}

		public String THCYCLPattern() {

			return "";

		}

		public String THCYCLOriginalDbColumnName() {

			return "THCYCL";

		}

		public float THSCWV;

		public float getTHSCWV() {
			return this.THSCWV;
		}

		public Boolean THSCWVIsNullable() {
			return false;
		}

		public Boolean THSCWVIsKey() {
			return false;
		}

		public Integer THSCWVLength() {
			return 2;
		}

		public Integer THSCWVPrecision() {
			return 0;
		}

		public String THSCWVDefault() {

			return "";

		}

		public String THSCWVComment() {

			return "";

		}

		public String THSCWVPattern() {

			return "";

		}

		public String THSCWVOriginalDbColumnName() {

			return "THSCWV";

		}

		public float THSCSQ;

		public float getTHSCSQ() {
			return this.THSCSQ;
		}

		public Boolean THSCSQIsNullable() {
			return false;
		}

		public Boolean THSCSQIsKey() {
			return false;
		}

		public Integer THSCSQLength() {
			return 3;
		}

		public Integer THSCSQPrecision() {
			return 0;
		}

		public String THSCSQDefault() {

			return "";

		}

		public String THSCSQComment() {

			return "";

		}

		public String THSCSQPattern() {

			return "";

		}

		public String THSCSQOriginalDbColumnName() {

			return "THSCSQ";

		}

		public String THSCNM;

		public String getTHSCNM() {
			return this.THSCNM;
		}

		public Boolean THSCNMIsNullable() {
			return false;
		}

		public Boolean THSCNMIsKey() {
			return false;
		}

		public Integer THSCNMLength() {
			return 8;
		}

		public Integer THSCNMPrecision() {
			return 0;
		}

		public String THSCNMDefault() {

			return "";

		}

		public String THSCNMComment() {

			return "";

		}

		public String THSCNMPattern() {

			return "";

		}

		public String THSCNMOriginalDbColumnName() {

			return "THSCNM";

		}

		public String TRFXRF;

		public String getTRFXRF() {
			return this.TRFXRF;
		}

		public Boolean TRFXRFIsNullable() {
			return false;
		}

		public Boolean TRFXRFIsKey() {
			return false;
		}

		public Integer TRFXRFLength() {
			return 8;
		}

		public Integer TRFXRFPrecision() {
			return 0;
		}

		public String TRFXRFDefault() {

			return "";

		}

		public String TRFXRFComment() {

			return "";

		}

		public String TRFXRFPattern() {

			return "";

		}

		public String TRFXRFOriginalDbColumnName() {

			return "TRFXRF";

		}

		public String THCNYN;

		public String getTHCNYN() {
			return this.THCNYN;
		}

		public Boolean THCNYNIsNullable() {
			return false;
		}

		public Boolean THCNYNIsKey() {
			return false;
		}

		public Integer THCNYNLength() {
			return 1;
		}

		public Integer THCNYNPrecision() {
			return 0;
		}

		public String THCNYNDefault() {

			return "";

		}

		public String THCNYNComment() {

			return "";

		}

		public String THCNYNPattern() {

			return "";

		}

		public String THCNYNOriginalDbColumnName() {

			return "THCNYN";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.TRFICN = dis.readFloat();

					this.TRFIDT = dis.readFloat();

					this.TRFBCN = dis.readFloat();

					this.TRFBDT = dis.readFloat();

					this.TRFSCN = dis.readFloat();

					this.TRFSDT = dis.readFloat();

					this.TRFRCN = dis.readFloat();

					this.TRFRDT = dis.readFloat();

					this.TRFINS = readString(dis);

					this.TRFDLC = readString(dis);

					this.TRFREF = readString(dis);

					this.TRFPYN = readString(dis);

					this.TRINIT = readString(dis);

					this.TRFPON = (BigDecimal) dis.readObject();

					this.TRFBON = dis.readFloat();

					this.THTUNT = (BigDecimal) dis.readObject();

					this.THTPCK = (BigDecimal) dis.readObject();

					this.THTPLT = (BigDecimal) dis.readObject();

					this.THTCTN = (BigDecimal) dis.readObject();

					this.THTIPK = (BigDecimal) dis.readObject();

					this.THTRTA = (BigDecimal) dis.readObject();

					this.THTCST = (BigDecimal) dis.readObject();

					this.THTCUB = (BigDecimal) dis.readObject();

					this.THTUNP = (BigDecimal) dis.readObject();

					this.THTPLP = (BigDecimal) dis.readObject();

					this.THTCTP = (BigDecimal) dis.readObject();

					this.THTIPP = (BigDecimal) dis.readObject();

					this.THTRTP = (BigDecimal) dis.readObject();

					this.THTCSP = (BigDecimal) dis.readObject();

					this.THTPCU = (BigDecimal) dis.readObject();

					this.TRPKLN = (BigDecimal) dis.readObject();

					this.THCYCL = (BigDecimal) dis.readObject();

					this.THSCWV = dis.readFloat();

					this.THSCSQ = dis.readFloat();

					this.THSCNM = readString(dis);

					this.TRFXRF = readString(dis);

					this.THCNYN = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.TRFICN = dis.readFloat();

					this.TRFIDT = dis.readFloat();

					this.TRFBCN = dis.readFloat();

					this.TRFBDT = dis.readFloat();

					this.TRFSCN = dis.readFloat();

					this.TRFSDT = dis.readFloat();

					this.TRFRCN = dis.readFloat();

					this.TRFRDT = dis.readFloat();

					this.TRFINS = readString(dis);

					this.TRFDLC = readString(dis);

					this.TRFREF = readString(dis);

					this.TRFPYN = readString(dis);

					this.TRINIT = readString(dis);

					this.TRFPON = (BigDecimal) dis.readObject();

					this.TRFBON = dis.readFloat();

					this.THTUNT = (BigDecimal) dis.readObject();

					this.THTPCK = (BigDecimal) dis.readObject();

					this.THTPLT = (BigDecimal) dis.readObject();

					this.THTCTN = (BigDecimal) dis.readObject();

					this.THTIPK = (BigDecimal) dis.readObject();

					this.THTRTA = (BigDecimal) dis.readObject();

					this.THTCST = (BigDecimal) dis.readObject();

					this.THTCUB = (BigDecimal) dis.readObject();

					this.THTUNP = (BigDecimal) dis.readObject();

					this.THTPLP = (BigDecimal) dis.readObject();

					this.THTCTP = (BigDecimal) dis.readObject();

					this.THTIPP = (BigDecimal) dis.readObject();

					this.THTRTP = (BigDecimal) dis.readObject();

					this.THTCSP = (BigDecimal) dis.readObject();

					this.THTPCU = (BigDecimal) dis.readObject();

					this.TRPKLN = (BigDecimal) dis.readObject();

					this.THCYCL = (BigDecimal) dis.readObject();

					this.THSCWV = dis.readFloat();

					this.THSCSQ = dis.readFloat();

					this.THSCNM = readString(dis);

					this.TRFXRF = readString(dis);

					this.THCNYN = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// float

				dos.writeFloat(this.TRFICN);

				// float

				dos.writeFloat(this.TRFIDT);

				// float

				dos.writeFloat(this.TRFBCN);

				// float

				dos.writeFloat(this.TRFBDT);

				// float

				dos.writeFloat(this.TRFSCN);

				// float

				dos.writeFloat(this.TRFSDT);

				// float

				dos.writeFloat(this.TRFRCN);

				// float

				dos.writeFloat(this.TRFRDT);

				// String

				writeString(this.TRFINS, dos);

				// String

				writeString(this.TRFDLC, dos);

				// String

				writeString(this.TRFREF, dos);

				// String

				writeString(this.TRFPYN, dos);

				// String

				writeString(this.TRINIT, dos);

				// BigDecimal

				dos.writeObject(this.TRFPON);

				// float

				dos.writeFloat(this.TRFBON);

				// BigDecimal

				dos.writeObject(this.THTUNT);

				// BigDecimal

				dos.writeObject(this.THTPCK);

				// BigDecimal

				dos.writeObject(this.THTPLT);

				// BigDecimal

				dos.writeObject(this.THTCTN);

				// BigDecimal

				dos.writeObject(this.THTIPK);

				// BigDecimal

				dos.writeObject(this.THTRTA);

				// BigDecimal

				dos.writeObject(this.THTCST);

				// BigDecimal

				dos.writeObject(this.THTCUB);

				// BigDecimal

				dos.writeObject(this.THTUNP);

				// BigDecimal

				dos.writeObject(this.THTPLP);

				// BigDecimal

				dos.writeObject(this.THTCTP);

				// BigDecimal

				dos.writeObject(this.THTIPP);

				// BigDecimal

				dos.writeObject(this.THTRTP);

				// BigDecimal

				dos.writeObject(this.THTCSP);

				// BigDecimal

				dos.writeObject(this.THTPCU);

				// BigDecimal

				dos.writeObject(this.TRPKLN);

				// BigDecimal

				dos.writeObject(this.THCYCL);

				// float

				dos.writeFloat(this.THSCWV);

				// float

				dos.writeFloat(this.THSCSQ);

				// String

				writeString(this.THSCNM, dos);

				// String

				writeString(this.TRFXRF, dos);

				// String

				writeString(this.THCNYN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// float

				dos.writeFloat(this.TRFICN);

				// float

				dos.writeFloat(this.TRFIDT);

				// float

				dos.writeFloat(this.TRFBCN);

				// float

				dos.writeFloat(this.TRFBDT);

				// float

				dos.writeFloat(this.TRFSCN);

				// float

				dos.writeFloat(this.TRFSDT);

				// float

				dos.writeFloat(this.TRFRCN);

				// float

				dos.writeFloat(this.TRFRDT);

				// String

				writeString(this.TRFINS, dos);

				// String

				writeString(this.TRFDLC, dos);

				// String

				writeString(this.TRFREF, dos);

				// String

				writeString(this.TRFPYN, dos);

				// String

				writeString(this.TRINIT, dos);

				// BigDecimal

				dos.writeObject(this.TRFPON);

				// float

				dos.writeFloat(this.TRFBON);

				// BigDecimal

				dos.writeObject(this.THTUNT);

				// BigDecimal

				dos.writeObject(this.THTPCK);

				// BigDecimal

				dos.writeObject(this.THTPLT);

				// BigDecimal

				dos.writeObject(this.THTCTN);

				// BigDecimal

				dos.writeObject(this.THTIPK);

				// BigDecimal

				dos.writeObject(this.THTRTA);

				// BigDecimal

				dos.writeObject(this.THTCST);

				// BigDecimal

				dos.writeObject(this.THTCUB);

				// BigDecimal

				dos.writeObject(this.THTUNP);

				// BigDecimal

				dos.writeObject(this.THTPLP);

				// BigDecimal

				dos.writeObject(this.THTCTP);

				// BigDecimal

				dos.writeObject(this.THTIPP);

				// BigDecimal

				dos.writeObject(this.THTRTP);

				// BigDecimal

				dos.writeObject(this.THTCSP);

				// BigDecimal

				dos.writeObject(this.THTPCU);

				// BigDecimal

				dos.writeObject(this.TRPKLN);

				// BigDecimal

				dos.writeObject(this.THCYCL);

				// float

				dos.writeFloat(this.THSCWV);

				// float

				dos.writeFloat(this.THSCSQ);

				// String

				writeString(this.THSCNM, dos);

				// String

				writeString(this.TRFXRF, dos);

				// String

				writeString(this.THCNYN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRFBCH=" + TRFBCH);
			sb.append(",TRFSTS=" + TRFSTS);
			sb.append(",TRFTYP=" + TRFTYP);
			sb.append(",TRFPTY=" + TRFPTY);
			sb.append(",TRFFLC=" + String.valueOf(TRFFLC));
			sb.append(",TRFTLC=" + String.valueOf(TRFTLC));
			sb.append(",TRFICN=" + String.valueOf(TRFICN));
			sb.append(",TRFIDT=" + String.valueOf(TRFIDT));
			sb.append(",TRFBCN=" + String.valueOf(TRFBCN));
			sb.append(",TRFBDT=" + String.valueOf(TRFBDT));
			sb.append(",TRFSCN=" + String.valueOf(TRFSCN));
			sb.append(",TRFSDT=" + String.valueOf(TRFSDT));
			sb.append(",TRFRCN=" + String.valueOf(TRFRCN));
			sb.append(",TRFRDT=" + String.valueOf(TRFRDT));
			sb.append(",TRFINS=" + TRFINS);
			sb.append(",TRFDLC=" + TRFDLC);
			sb.append(",TRFREF=" + TRFREF);
			sb.append(",TRFPYN=" + TRFPYN);
			sb.append(",TRINIT=" + TRINIT);
			sb.append(",TRFPON=" + String.valueOf(TRFPON));
			sb.append(",TRFBON=" + String.valueOf(TRFBON));
			sb.append(",THTUNT=" + String.valueOf(THTUNT));
			sb.append(",THTPCK=" + String.valueOf(THTPCK));
			sb.append(",THTPLT=" + String.valueOf(THTPLT));
			sb.append(",THTCTN=" + String.valueOf(THTCTN));
			sb.append(",THTIPK=" + String.valueOf(THTIPK));
			sb.append(",THTRTA=" + String.valueOf(THTRTA));
			sb.append(",THTCST=" + String.valueOf(THTCST));
			sb.append(",THTCUB=" + String.valueOf(THTCUB));
			sb.append(",THTUNP=" + String.valueOf(THTUNP));
			sb.append(",THTPLP=" + String.valueOf(THTPLP));
			sb.append(",THTCTP=" + String.valueOf(THTCTP));
			sb.append(",THTIPP=" + String.valueOf(THTIPP));
			sb.append(",THTRTP=" + String.valueOf(THTRTP));
			sb.append(",THTCSP=" + String.valueOf(THTCSP));
			sb.append(",THTPCU=" + String.valueOf(THTPCU));
			sb.append(",TRPKLN=" + String.valueOf(TRPKLN));
			sb.append(",THCYCL=" + String.valueOf(THCYCL));
			sb.append(",THSCWV=" + String.valueOf(THSCWV));
			sb.append(",THSCSQ=" + String.valueOf(THSCSQ));
			sb.append(",THSCNM=" + THSCNM);
			sb.append(",TRFXRF=" + TRFXRF);
			sb.append(",THCNYN=" + THCNYN);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRFBCH == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFBCH);
			}

			sb.append("|");

			if (TRFSTS == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSTS);
			}

			sb.append("|");

			if (TRFTYP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFTYP);
			}

			sb.append("|");

			if (TRFPTY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPTY);
			}

			sb.append("|");

			if (TRFFLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFFLC);
			}

			sb.append("|");

			if (TRFTLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFTLC);
			}

			sb.append("|");

			sb.append(TRFICN);

			sb.append("|");

			sb.append(TRFIDT);

			sb.append("|");

			sb.append(TRFBCN);

			sb.append("|");

			sb.append(TRFBDT);

			sb.append("|");

			sb.append(TRFSCN);

			sb.append("|");

			sb.append(TRFSDT);

			sb.append("|");

			sb.append(TRFRCN);

			sb.append("|");

			sb.append(TRFRDT);

			sb.append("|");

			if (TRFINS == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFINS);
			}

			sb.append("|");

			if (TRFDLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFDLC);
			}

			sb.append("|");

			if (TRFREF == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREF);
			}

			sb.append("|");

			if (TRFPYN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPYN);
			}

			sb.append("|");

			if (TRINIT == null) {
				sb.append("<null>");
			} else {
				sb.append(TRINIT);
			}

			sb.append("|");

			if (TRFPON == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPON);
			}

			sb.append("|");

			sb.append(TRFBON);

			sb.append("|");

			if (THTUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(THTUNT);
			}

			sb.append("|");

			if (THTPCK == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPCK);
			}

			sb.append("|");

			if (THTPLT == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPLT);
			}

			sb.append("|");

			if (THTCTN == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCTN);
			}

			sb.append("|");

			if (THTIPK == null) {
				sb.append("<null>");
			} else {
				sb.append(THTIPK);
			}

			sb.append("|");

			if (THTRTA == null) {
				sb.append("<null>");
			} else {
				sb.append(THTRTA);
			}

			sb.append("|");

			if (THTCST == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCST);
			}

			sb.append("|");

			if (THTCUB == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCUB);
			}

			sb.append("|");

			if (THTUNP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTUNP);
			}

			sb.append("|");

			if (THTPLP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPLP);
			}

			sb.append("|");

			if (THTCTP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCTP);
			}

			sb.append("|");

			if (THTIPP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTIPP);
			}

			sb.append("|");

			if (THTRTP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTRTP);
			}

			sb.append("|");

			if (THTCSP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCSP);
			}

			sb.append("|");

			if (THTPCU == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPCU);
			}

			sb.append("|");

			if (TRPKLN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRPKLN);
			}

			sb.append("|");

			if (THCYCL == null) {
				sb.append("<null>");
			} else {
				sb.append(THCYCL);
			}

			sb.append("|");

			sb.append(THSCWV);

			sb.append("|");

			sb.append(THSCSQ);

			sb.append("|");

			if (THSCNM == null) {
				sb.append("<null>");
			} else {
				sb.append(THSCNM);
			}

			sb.append("|");

			if (TRFXRF == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFXRF);
			}

			sb.append("|");

			if (THCNYN == null) {
				sb.append("<null>");
			} else {
				sb.append(THCNYN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row10Struct other) {

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

	public void tDBInput_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_8");
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

				row10Struct row10 = new row10Struct();

				/**
				 * [tFileOutputDelimited_8 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_8", false);
				start_Hash.put("tFileOutputDelimited_8", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_8";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row10");

				int tos_count_tFileOutputDelimited_8 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_8 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_8 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_8 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_8.append("Parameters:");
							log4jParamters_tFileOutputDelimited_8.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/TRFHDR.csv\"");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							log4jParamters_tFileOutputDelimited_8.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_8.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_8 - " + (log4jParamters_tFileOutputDelimited_8));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_8().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_8", "tFileOutputDelimited_8", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_8 = "";
				fileName_tFileOutputDelimited_8 = (new java.io.File("/data/talend/data_repository/TRFHDR.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_8 = null;
				String extension_tFileOutputDelimited_8 = null;
				String directory_tFileOutputDelimited_8 = null;
				if ((fileName_tFileOutputDelimited_8.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_8.lastIndexOf(".") < fileName_tFileOutputDelimited_8
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8;
						extension_tFileOutputDelimited_8 = "";
					} else {
						fullName_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8.substring(0,
								fileName_tFileOutputDelimited_8.lastIndexOf("."));
						extension_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8
								.substring(fileName_tFileOutputDelimited_8.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8.substring(0,
							fileName_tFileOutputDelimited_8.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_8.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8.substring(0,
								fileName_tFileOutputDelimited_8.lastIndexOf("."));
						extension_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8
								.substring(fileName_tFileOutputDelimited_8.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_8 = fileName_tFileOutputDelimited_8;
						extension_tFileOutputDelimited_8 = "";
					}
					directory_tFileOutputDelimited_8 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_8 = true;
				java.io.File filetFileOutputDelimited_8 = new java.io.File(fileName_tFileOutputDelimited_8);
				globalMap.put("tFileOutputDelimited_8_FILE_NAME", fileName_tFileOutputDelimited_8);
				int nb_line_tFileOutputDelimited_8 = 0;
				int splitedFileNo_tFileOutputDelimited_8 = 0;
				int currentRow_tFileOutputDelimited_8 = 0;

				final String OUT_DELIM_tFileOutputDelimited_8 = /** Start field tFileOutputDelimited_8:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_8:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_8 = /**
																		 * Start field
																		 * tFileOutputDelimited_8:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_8:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_8 != null && directory_tFileOutputDelimited_8.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_8 = new java.io.File(directory_tFileOutputDelimited_8);
					if (!dir_tFileOutputDelimited_8.exists()) {
						log.info("tFileOutputDelimited_8 - Creating directory '"
								+ dir_tFileOutputDelimited_8.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_8.mkdirs();
						log.info("tFileOutputDelimited_8 - The directory '"
								+ dir_tFileOutputDelimited_8.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_8 = new java.io.File(fileName_tFileOutputDelimited_8);
				String zipName_tFileOutputDelimited_8 = fullName_tFileOutputDelimited_8 + ".zip";
				java.io.File file_tFileOutputDelimited_8 = new java.io.File(zipName_tFileOutputDelimited_8);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_8 = null;
				java.io.Writer outtFileOutputDelimited_8 = null;

				if (file_tFileOutputDelimited_8.exists()) {
					file_tFileOutputDelimited_8.delete();
				}
				zipOut_tFileOutputDelimited_8 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_8)));
				zipOut_tFileOutputDelimited_8
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_8.getName()));
				outtFileOutputDelimited_8 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_8, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_8", outtFileOutputDelimited_8);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_8.length() == 0) {
						outtFileOutputDelimited_8.write("TRFBCH");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFSTS");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFTYP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFPTY");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFFLC");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFTLC");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFICN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFIDT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFBCN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFBDT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFSCN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFSDT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFRCN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFRDT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFINS");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFDLC");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFREF");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFPYN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRINIT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFPON");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFBON");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTUNT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTPCK");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTPLT");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTCTN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTIPK");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTRTA");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTCST");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTCUB");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTUNP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTPLP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTCTP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTIPP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTRTP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTCSP");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THTPCU");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRPKLN");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THCYCL");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THSCWV");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THSCSQ");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THSCNM");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("TRFXRF");
						outtFileOutputDelimited_8.write(OUT_DELIM_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.write("THCNYN");
						outtFileOutputDelimited_8.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_8);
						outtFileOutputDelimited_8.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_8", nb_line_tFileOutputDelimited_8);

				/**
				 * [tFileOutputDelimited_8 begin ] stop
				 */

				/**
				 * [tDBInput_8 begin ] start
				 */

				ok_Hash.put("tDBInput_8", false);
				start_Hash.put("tDBInput_8", System.currentTimeMillis());

				currentComponent = "tDBInput_8";

				int tos_count_tDBInput_8 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_8 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_8 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_8 = new StringBuilder();
							log4jParamters_tDBInput_8.append("Parameters:");
							log4jParamters_tDBInput_8.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("QUERY" + " = "
									+ "\"  select * from MM4R5LIB.TRFHDR   where TRFIDT >= (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP - 6 MONTHS, 'YYMMDD'))    \"");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBCH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSTS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTYP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFFLC") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFTLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFICN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFIDT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFBCN") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFBDT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFSCN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSDT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRCN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRDT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFINS") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFDLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFREF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPYN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRINIT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFPON") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBON") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTUNT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTPCK")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTPLT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTCTN") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTIPK") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTRTA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTCST")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTCUB") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTUNP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTPLP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTCTP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTIPP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTRTP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTCSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTPCU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRPKLN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THCYCL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THSCWV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THSCSQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THSCNM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFXRF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THCNYN") + "}]");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_8.append(" | ");
							log4jParamters_tDBInput_8.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_8.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_8 - " + (log4jParamters_tDBInput_8));
						}
					}
					new BytesLimit65535_tDBInput_8().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_8", "tDBInput_8", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_8 = 0;
				java.sql.Connection conn_tDBInput_8 = null;
				String driverClass_tDBInput_8 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_8 = java.lang.Class.forName(driverClass_tDBInput_8);
				String dbUser_tDBInput_8 = context.jda_user_name;

				final String decryptedPassword_tDBInput_8 = context.jda_password;

				String dbPwd_tDBInput_8 = decryptedPassword_tDBInput_8;

				String url_tDBInput_8 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_8 - Driver ClassName: " + driverClass_tDBInput_8 + ".");

				log.debug("tDBInput_8 - Connection attempt to '" + url_tDBInput_8 + "' with the username '"
						+ dbUser_tDBInput_8 + "'.");

				conn_tDBInput_8 = java.sql.DriverManager.getConnection(url_tDBInput_8, dbUser_tDBInput_8,
						dbPwd_tDBInput_8);
				log.debug("tDBInput_8 - Connection to '" + url_tDBInput_8 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_8 = conn_tDBInput_8.createStatement();

				String dbquery_tDBInput_8 = "\nselect * from MM4R5LIB.TRFHDR \nwhere TRFIDT >= (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP - 6 MONTHS, 'YYMMDD'))\n\n";

				log.debug("tDBInput_8 - Executing the query: '" + dbquery_tDBInput_8 + "'.");

				globalMap.put("tDBInput_8_QUERY", dbquery_tDBInput_8);
				java.sql.ResultSet rs_tDBInput_8 = null;

				try {
					rs_tDBInput_8 = stmt_tDBInput_8.executeQuery(dbquery_tDBInput_8);
					java.sql.ResultSetMetaData rsmd_tDBInput_8 = rs_tDBInput_8.getMetaData();
					int colQtyInRs_tDBInput_8 = rsmd_tDBInput_8.getColumnCount();

					String tmpContent_tDBInput_8 = null;

					log.debug("tDBInput_8 - Retrieving records from the database.");

					while (rs_tDBInput_8.next()) {
						nb_line_tDBInput_8++;

						if (colQtyInRs_tDBInput_8 < 1) {
							row10.TRFBCH = null;
						} else {

							row10.TRFBCH = routines.system.JDBCUtil.getString(rs_tDBInput_8, 1, false);
						}
						if (colQtyInRs_tDBInput_8 < 2) {
							row10.TRFSTS = null;
						} else {

							row10.TRFSTS = routines.system.JDBCUtil.getString(rs_tDBInput_8, 2, false);
						}
						if (colQtyInRs_tDBInput_8 < 3) {
							row10.TRFTYP = null;
						} else {

							row10.TRFTYP = routines.system.JDBCUtil.getString(rs_tDBInput_8, 3, false);
						}
						if (colQtyInRs_tDBInput_8 < 4) {
							row10.TRFPTY = null;
						} else {

							row10.TRFPTY = routines.system.JDBCUtil.getString(rs_tDBInput_8, 4, false);
						}
						if (colQtyInRs_tDBInput_8 < 5) {
							row10.TRFFLC = null;
						} else {

							row10.TRFFLC = rs_tDBInput_8.getBigDecimal(5);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 6) {
							row10.TRFTLC = null;
						} else {

							row10.TRFTLC = rs_tDBInput_8.getBigDecimal(6);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 7) {
							row10.TRFICN = 0;
						} else {

							row10.TRFICN = rs_tDBInput_8.getFloat(7);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 8) {
							row10.TRFIDT = 0;
						} else {

							row10.TRFIDT = rs_tDBInput_8.getFloat(8);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 9) {
							row10.TRFBCN = 0;
						} else {

							row10.TRFBCN = rs_tDBInput_8.getFloat(9);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 10) {
							row10.TRFBDT = 0;
						} else {

							row10.TRFBDT = rs_tDBInput_8.getFloat(10);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 11) {
							row10.TRFSCN = 0;
						} else {

							row10.TRFSCN = rs_tDBInput_8.getFloat(11);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 12) {
							row10.TRFSDT = 0;
						} else {

							row10.TRFSDT = rs_tDBInput_8.getFloat(12);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 13) {
							row10.TRFRCN = 0;
						} else {

							row10.TRFRCN = rs_tDBInput_8.getFloat(13);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 14) {
							row10.TRFRDT = 0;
						} else {

							row10.TRFRDT = rs_tDBInput_8.getFloat(14);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 15) {
							row10.TRFINS = null;
						} else {

							row10.TRFINS = routines.system.JDBCUtil.getString(rs_tDBInput_8, 15, false);
						}
						if (colQtyInRs_tDBInput_8 < 16) {
							row10.TRFDLC = null;
						} else {

							row10.TRFDLC = routines.system.JDBCUtil.getString(rs_tDBInput_8, 16, false);
						}
						if (colQtyInRs_tDBInput_8 < 17) {
							row10.TRFREF = null;
						} else {

							row10.TRFREF = routines.system.JDBCUtil.getString(rs_tDBInput_8, 17, false);
						}
						if (colQtyInRs_tDBInput_8 < 18) {
							row10.TRFPYN = null;
						} else {

							row10.TRFPYN = routines.system.JDBCUtil.getString(rs_tDBInput_8, 18, false);
						}
						if (colQtyInRs_tDBInput_8 < 19) {
							row10.TRINIT = null;
						} else {

							row10.TRINIT = routines.system.JDBCUtil.getString(rs_tDBInput_8, 19, false);
						}
						if (colQtyInRs_tDBInput_8 < 20) {
							row10.TRFPON = null;
						} else {

							row10.TRFPON = rs_tDBInput_8.getBigDecimal(20);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 21) {
							row10.TRFBON = 0;
						} else {

							row10.TRFBON = rs_tDBInput_8.getFloat(21);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 22) {
							row10.THTUNT = null;
						} else {

							row10.THTUNT = rs_tDBInput_8.getBigDecimal(22);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 23) {
							row10.THTPCK = null;
						} else {

							row10.THTPCK = rs_tDBInput_8.getBigDecimal(23);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 24) {
							row10.THTPLT = null;
						} else {

							row10.THTPLT = rs_tDBInput_8.getBigDecimal(24);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 25) {
							row10.THTCTN = null;
						} else {

							row10.THTCTN = rs_tDBInput_8.getBigDecimal(25);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 26) {
							row10.THTIPK = null;
						} else {

							row10.THTIPK = rs_tDBInput_8.getBigDecimal(26);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 27) {
							row10.THTRTA = null;
						} else {

							row10.THTRTA = rs_tDBInput_8.getBigDecimal(27);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 28) {
							row10.THTCST = null;
						} else {

							row10.THTCST = rs_tDBInput_8.getBigDecimal(28);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 29) {
							row10.THTCUB = null;
						} else {

							row10.THTCUB = rs_tDBInput_8.getBigDecimal(29);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 30) {
							row10.THTUNP = null;
						} else {

							row10.THTUNP = rs_tDBInput_8.getBigDecimal(30);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 31) {
							row10.THTPLP = null;
						} else {

							row10.THTPLP = rs_tDBInput_8.getBigDecimal(31);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 32) {
							row10.THTCTP = null;
						} else {

							row10.THTCTP = rs_tDBInput_8.getBigDecimal(32);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 33) {
							row10.THTIPP = null;
						} else {

							row10.THTIPP = rs_tDBInput_8.getBigDecimal(33);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 34) {
							row10.THTRTP = null;
						} else {

							row10.THTRTP = rs_tDBInput_8.getBigDecimal(34);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 35) {
							row10.THTCSP = null;
						} else {

							row10.THTCSP = rs_tDBInput_8.getBigDecimal(35);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 36) {
							row10.THTPCU = null;
						} else {

							row10.THTPCU = rs_tDBInput_8.getBigDecimal(36);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 37) {
							row10.TRPKLN = null;
						} else {

							row10.TRPKLN = rs_tDBInput_8.getBigDecimal(37);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 38) {
							row10.THCYCL = null;
						} else {

							row10.THCYCL = rs_tDBInput_8.getBigDecimal(38);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 39) {
							row10.THSCWV = 0;
						} else {

							row10.THSCWV = rs_tDBInput_8.getFloat(39);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 40) {
							row10.THSCSQ = 0;
						} else {

							row10.THSCSQ = rs_tDBInput_8.getFloat(40);
							if (rs_tDBInput_8.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_8 < 41) {
							row10.THSCNM = null;
						} else {

							row10.THSCNM = routines.system.JDBCUtil.getString(rs_tDBInput_8, 41, false);
						}
						if (colQtyInRs_tDBInput_8 < 42) {
							row10.TRFXRF = null;
						} else {

							row10.TRFXRF = routines.system.JDBCUtil.getString(rs_tDBInput_8, 42, false);
						}
						if (colQtyInRs_tDBInput_8 < 43) {
							row10.THCNYN = null;
						} else {

							row10.THCNYN = routines.system.JDBCUtil.getString(rs_tDBInput_8, 43, false);
						}

						log.debug("tDBInput_8 - Retrieving the record " + nb_line_tDBInput_8 + ".");

						/**
						 * [tDBInput_8 begin ] stop
						 */

						/**
						 * [tDBInput_8 main ] start
						 */

						currentComponent = "tDBInput_8";

						tos_count_tDBInput_8++;

						/**
						 * [tDBInput_8 main ] stop
						 */

						/**
						 * [tDBInput_8 process_data_begin ] start
						 */

						currentComponent = "tDBInput_8";

						/**
						 * [tDBInput_8 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_8 main ] start
						 */

						currentComponent = "tFileOutputDelimited_8";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row10", "tDBInput_8", "tDBInput_8", "tAS400Input", "tFileOutputDelimited_8",
								"tFileOutputDelimited_8", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row10 - " + (row10 == null ? "" : row10.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_8 = new StringBuilder();
						if (row10.TRFBCH != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFBCH);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFSTS != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFSTS);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFTYP != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFTYP);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFPTY != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFPTY);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFFLC != null) {
							sb_tFileOutputDelimited_8
									.append(row10.TRFFLC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFTLC != null) {
							sb_tFileOutputDelimited_8
									.append(row10.TRFTLC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFICN);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFIDT);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFBCN);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFBDT);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFSCN);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFSDT);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFRCN);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFRDT);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFINS != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFINS);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFDLC != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFDLC);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFREF != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFREF);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFPYN != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFPYN);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRINIT != null) {
							sb_tFileOutputDelimited_8.append(row10.TRINIT);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFPON != null) {
							sb_tFileOutputDelimited_8
									.append(row10.TRFPON.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.TRFBON);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTUNT != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTUNT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTPCK != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTPCK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTPLT != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTPLT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTCTN != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTCTN.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTIPK != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTIPK.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTRTA != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTRTA.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTCST != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTCST.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTCUB != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTCUB.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTUNP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTUNP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTPLP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTPLP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTCTP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTCTP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTIPP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTIPP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTRTP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTRTP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTCSP != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTCSP.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THTPCU != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THTPCU.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRPKLN != null) {
							sb_tFileOutputDelimited_8
									.append(row10.TRPKLN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THCYCL != null) {
							sb_tFileOutputDelimited_8
									.append(row10.THCYCL.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.THSCWV);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						sb_tFileOutputDelimited_8.append(row10.THSCSQ);
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THSCNM != null) {
							sb_tFileOutputDelimited_8.append(row10.THSCNM);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.TRFXRF != null) {
							sb_tFileOutputDelimited_8.append(row10.TRFXRF);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_tFileOutputDelimited_8);
						if (row10.THCNYN != null) {
							sb_tFileOutputDelimited_8.append(row10.THCNYN);
						}
						sb_tFileOutputDelimited_8.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_8);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_8++;
							resourceMap.put("nb_line_tFileOutputDelimited_8", nb_line_tFileOutputDelimited_8);

							outtFileOutputDelimited_8.write(sb_tFileOutputDelimited_8.toString());
							log.debug("tFileOutputDelimited_8 - Writing the record " + nb_line_tFileOutputDelimited_8
									+ ".");

						}

						tos_count_tFileOutputDelimited_8++;

						/**
						 * [tFileOutputDelimited_8 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_8 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_8";

						/**
						 * [tFileOutputDelimited_8 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_8 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_8";

						/**
						 * [tFileOutputDelimited_8 process_data_end ] stop
						 */

						/**
						 * [tDBInput_8 process_data_end ] start
						 */

						currentComponent = "tDBInput_8";

						/**
						 * [tDBInput_8 process_data_end ] stop
						 */

						/**
						 * [tDBInput_8 end ] start
						 */

						currentComponent = "tDBInput_8";

					}
				} finally {
					if (rs_tDBInput_8 != null) {
						rs_tDBInput_8.close();
					}
					if (stmt_tDBInput_8 != null) {
						stmt_tDBInput_8.close();
					}
					if (conn_tDBInput_8 != null && !conn_tDBInput_8.isClosed()) {

						log.debug("tDBInput_8 - Closing the connection to the database.");

						conn_tDBInput_8.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_8 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_8_NB_LINE", nb_line_tDBInput_8);
				log.debug("tDBInput_8 - Retrieved records count: " + nb_line_tDBInput_8 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_8 - " + ("Done."));

				ok_Hash.put("tDBInput_8", true);
				end_Hash.put("tDBInput_8", System.currentTimeMillis());

				/**
				 * [tDBInput_8 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_8 end ] start
				 */

				currentComponent = "tFileOutputDelimited_8";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_8 != null) {
						outtFileOutputDelimited_8.flush();
						outtFileOutputDelimited_8.close();
					}

					globalMap.put("tFileOutputDelimited_8_NB_LINE", nb_line_tFileOutputDelimited_8);
					globalMap.put("tFileOutputDelimited_8_FILE_NAME", fileName_tFileOutputDelimited_8);

				}

				resourceMap.put("finish_tFileOutputDelimited_8", true);

				log.debug("tFileOutputDelimited_8 - Written records count: " + nb_line_tFileOutputDelimited_8 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row10", 2, 0,
						"tDBInput_8", "tDBInput_8", "tAS400Input", "tFileOutputDelimited_8", "tFileOutputDelimited_8",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_8 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_8", true);
				end_Hash.put("tFileOutputDelimited_8", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_8 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_8:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk15", 0, "ok");
			}

			tFileInputDelimited_12Process(globalMap);

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
				 * [tDBInput_8 finally ] start
				 */

				currentComponent = "tDBInput_8";

				/**
				 * [tDBInput_8 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_8 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_8";

				if (resourceMap.get("finish_tFileOutputDelimited_8") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_8 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_8");
						if (outtFileOutputDelimited_8 != null) {
							outtFileOutputDelimited_8.flush();
							outtFileOutputDelimited_8.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_8 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_8_SUBPROCESS_STATE", 1);
	}

	public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[0];

		public String TRFBCH;

		public String getTRFBCH() {
			return this.TRFBCH;
		}

		public Boolean TRFBCHIsNullable() {
			return false;
		}

		public Boolean TRFBCHIsKey() {
			return false;
		}

		public Integer TRFBCHLength() {
			return 8;
		}

		public Integer TRFBCHPrecision() {
			return 0;
		}

		public String TRFBCHDefault() {

			return null;

		}

		public String TRFBCHComment() {

			return "";

		}

		public String TRFBCHPattern() {

			return "";

		}

		public String TRFBCHOriginalDbColumnName() {

			return "TRFBCH";

		}

		public String TRFSTS;

		public String getTRFSTS() {
			return this.TRFSTS;
		}

		public Boolean TRFSTSIsNullable() {
			return false;
		}

		public Boolean TRFSTSIsKey() {
			return false;
		}

		public Integer TRFSTSLength() {
			return 1;
		}

		public Integer TRFSTSPrecision() {
			return 0;
		}

		public String TRFSTSDefault() {

			return null;

		}

		public String TRFSTSComment() {

			return "";

		}

		public String TRFSTSPattern() {

			return "";

		}

		public String TRFSTSOriginalDbColumnName() {

			return "TRFSTS";

		}

		public String TRFTYP;

		public String getTRFTYP() {
			return this.TRFTYP;
		}

		public Boolean TRFTYPIsNullable() {
			return false;
		}

		public Boolean TRFTYPIsKey() {
			return false;
		}

		public Integer TRFTYPLength() {
			return 1;
		}

		public Integer TRFTYPPrecision() {
			return 0;
		}

		public String TRFTYPDefault() {

			return null;

		}

		public String TRFTYPComment() {

			return "";

		}

		public String TRFTYPPattern() {

			return "";

		}

		public String TRFTYPOriginalDbColumnName() {

			return "TRFTYP";

		}

		public String TRFPTY;

		public String getTRFPTY() {
			return this.TRFPTY;
		}

		public Boolean TRFPTYIsNullable() {
			return false;
		}

		public Boolean TRFPTYIsKey() {
			return false;
		}

		public Integer TRFPTYLength() {
			return 1;
		}

		public Integer TRFPTYPrecision() {
			return 0;
		}

		public String TRFPTYDefault() {

			return null;

		}

		public String TRFPTYComment() {

			return "";

		}

		public String TRFPTYPattern() {

			return "";

		}

		public String TRFPTYOriginalDbColumnName() {

			return "TRFPTY";

		}

		public BigDecimal TRFFLC;

		public BigDecimal getTRFFLC() {
			return this.TRFFLC;
		}

		public Boolean TRFFLCIsNullable() {
			return false;
		}

		public Boolean TRFFLCIsKey() {
			return false;
		}

		public Integer TRFFLCLength() {
			return 5;
		}

		public Integer TRFFLCPrecision() {
			return 0;
		}

		public String TRFFLCDefault() {

			return "";

		}

		public String TRFFLCComment() {

			return "";

		}

		public String TRFFLCPattern() {

			return "";

		}

		public String TRFFLCOriginalDbColumnName() {

			return "TRFFLC";

		}

		public BigDecimal TRFTLC;

		public BigDecimal getTRFTLC() {
			return this.TRFTLC;
		}

		public Boolean TRFTLCIsNullable() {
			return false;
		}

		public Boolean TRFTLCIsKey() {
			return false;
		}

		public Integer TRFTLCLength() {
			return 5;
		}

		public Integer TRFTLCPrecision() {
			return 0;
		}

		public String TRFTLCDefault() {

			return "";

		}

		public String TRFTLCComment() {

			return "";

		}

		public String TRFTLCPattern() {

			return "";

		}

		public String TRFTLCOriginalDbColumnName() {

			return "TRFTLC";

		}

		public float TRFICN;

		public float getTRFICN() {
			return this.TRFICN;
		}

		public Boolean TRFICNIsNullable() {
			return false;
		}

		public Boolean TRFICNIsKey() {
			return false;
		}

		public Integer TRFICNLength() {
			return 1;
		}

		public Integer TRFICNPrecision() {
			return 0;
		}

		public String TRFICNDefault() {

			return "";

		}

		public String TRFICNComment() {

			return "";

		}

		public String TRFICNPattern() {

			return "";

		}

		public String TRFICNOriginalDbColumnName() {

			return "TRFICN";

		}

		public float TRFIDT;

		public float getTRFIDT() {
			return this.TRFIDT;
		}

		public Boolean TRFIDTIsNullable() {
			return false;
		}

		public Boolean TRFIDTIsKey() {
			return false;
		}

		public Integer TRFIDTLength() {
			return 6;
		}

		public Integer TRFIDTPrecision() {
			return 0;
		}

		public String TRFIDTDefault() {

			return "";

		}

		public String TRFIDTComment() {

			return "";

		}

		public String TRFIDTPattern() {

			return "";

		}

		public String TRFIDTOriginalDbColumnName() {

			return "TRFIDT";

		}

		public float TRFBCN;

		public float getTRFBCN() {
			return this.TRFBCN;
		}

		public Boolean TRFBCNIsNullable() {
			return false;
		}

		public Boolean TRFBCNIsKey() {
			return false;
		}

		public Integer TRFBCNLength() {
			return 1;
		}

		public Integer TRFBCNPrecision() {
			return 0;
		}

		public String TRFBCNDefault() {

			return "";

		}

		public String TRFBCNComment() {

			return "";

		}

		public String TRFBCNPattern() {

			return "";

		}

		public String TRFBCNOriginalDbColumnName() {

			return "TRFBCN";

		}

		public float TRFBDT;

		public float getTRFBDT() {
			return this.TRFBDT;
		}

		public Boolean TRFBDTIsNullable() {
			return false;
		}

		public Boolean TRFBDTIsKey() {
			return false;
		}

		public Integer TRFBDTLength() {
			return 6;
		}

		public Integer TRFBDTPrecision() {
			return 0;
		}

		public String TRFBDTDefault() {

			return "";

		}

		public String TRFBDTComment() {

			return "";

		}

		public String TRFBDTPattern() {

			return "";

		}

		public String TRFBDTOriginalDbColumnName() {

			return "TRFBDT";

		}

		public float TRFSCN;

		public float getTRFSCN() {
			return this.TRFSCN;
		}

		public Boolean TRFSCNIsNullable() {
			return false;
		}

		public Boolean TRFSCNIsKey() {
			return false;
		}

		public Integer TRFSCNLength() {
			return 1;
		}

		public Integer TRFSCNPrecision() {
			return 0;
		}

		public String TRFSCNDefault() {

			return "";

		}

		public String TRFSCNComment() {

			return "";

		}

		public String TRFSCNPattern() {

			return "";

		}

		public String TRFSCNOriginalDbColumnName() {

			return "TRFSCN";

		}

		public float TRFSDT;

		public float getTRFSDT() {
			return this.TRFSDT;
		}

		public Boolean TRFSDTIsNullable() {
			return false;
		}

		public Boolean TRFSDTIsKey() {
			return false;
		}

		public Integer TRFSDTLength() {
			return 6;
		}

		public Integer TRFSDTPrecision() {
			return 0;
		}

		public String TRFSDTDefault() {

			return "";

		}

		public String TRFSDTComment() {

			return "";

		}

		public String TRFSDTPattern() {

			return "";

		}

		public String TRFSDTOriginalDbColumnName() {

			return "TRFSDT";

		}

		public float TRFRCN;

		public float getTRFRCN() {
			return this.TRFRCN;
		}

		public Boolean TRFRCNIsNullable() {
			return false;
		}

		public Boolean TRFRCNIsKey() {
			return false;
		}

		public Integer TRFRCNLength() {
			return 1;
		}

		public Integer TRFRCNPrecision() {
			return 0;
		}

		public String TRFRCNDefault() {

			return "";

		}

		public String TRFRCNComment() {

			return "";

		}

		public String TRFRCNPattern() {

			return "";

		}

		public String TRFRCNOriginalDbColumnName() {

			return "TRFRCN";

		}

		public float TRFRDT;

		public float getTRFRDT() {
			return this.TRFRDT;
		}

		public Boolean TRFRDTIsNullable() {
			return false;
		}

		public Boolean TRFRDTIsKey() {
			return false;
		}

		public Integer TRFRDTLength() {
			return 6;
		}

		public Integer TRFRDTPrecision() {
			return 0;
		}

		public String TRFRDTDefault() {

			return "";

		}

		public String TRFRDTComment() {

			return "";

		}

		public String TRFRDTPattern() {

			return "";

		}

		public String TRFRDTOriginalDbColumnName() {

			return "TRFRDT";

		}

		public String TRFINS;

		public String getTRFINS() {
			return this.TRFINS;
		}

		public Boolean TRFINSIsNullable() {
			return false;
		}

		public Boolean TRFINSIsKey() {
			return false;
		}

		public Integer TRFINSLength() {
			return 30;
		}

		public Integer TRFINSPrecision() {
			return 0;
		}

		public String TRFINSDefault() {

			return null;

		}

		public String TRFINSComment() {

			return "";

		}

		public String TRFINSPattern() {

			return "";

		}

		public String TRFINSOriginalDbColumnName() {

			return "TRFINS";

		}

		public String TRFDLC;

		public String getTRFDLC() {
			return this.TRFDLC;
		}

		public Boolean TRFDLCIsNullable() {
			return false;
		}

		public Boolean TRFDLCIsKey() {
			return false;
		}

		public Integer TRFDLCLength() {
			return 8;
		}

		public Integer TRFDLCPrecision() {
			return 0;
		}

		public String TRFDLCDefault() {

			return null;

		}

		public String TRFDLCComment() {

			return "";

		}

		public String TRFDLCPattern() {

			return "";

		}

		public String TRFDLCOriginalDbColumnName() {

			return "TRFDLC";

		}

		public String TRFREF;

		public String getTRFREF() {
			return this.TRFREF;
		}

		public Boolean TRFREFIsNullable() {
			return false;
		}

		public Boolean TRFREFIsKey() {
			return false;
		}

		public Integer TRFREFLength() {
			return 8;
		}

		public Integer TRFREFPrecision() {
			return 0;
		}

		public String TRFREFDefault() {

			return null;

		}

		public String TRFREFComment() {

			return "";

		}

		public String TRFREFPattern() {

			return "";

		}

		public String TRFREFOriginalDbColumnName() {

			return "TRFREF";

		}

		public String TRFPYN;

		public String getTRFPYN() {
			return this.TRFPYN;
		}

		public Boolean TRFPYNIsNullable() {
			return false;
		}

		public Boolean TRFPYNIsKey() {
			return false;
		}

		public Integer TRFPYNLength() {
			return 1;
		}

		public Integer TRFPYNPrecision() {
			return 0;
		}

		public String TRFPYNDefault() {

			return null;

		}

		public String TRFPYNComment() {

			return "";

		}

		public String TRFPYNPattern() {

			return "";

		}

		public String TRFPYNOriginalDbColumnName() {

			return "TRFPYN";

		}

		public String TRINIT;

		public String getTRINIT() {
			return this.TRINIT;
		}

		public Boolean TRINITIsNullable() {
			return false;
		}

		public Boolean TRINITIsKey() {
			return false;
		}

		public Integer TRINITLength() {
			return 1;
		}

		public Integer TRINITPrecision() {
			return 0;
		}

		public String TRINITDefault() {

			return null;

		}

		public String TRINITComment() {

			return "";

		}

		public String TRINITPattern() {

			return "";

		}

		public String TRINITOriginalDbColumnName() {

			return "TRINIT";

		}

		public String TRFPON;

		public String getTRFPON() {
			return this.TRFPON;
		}

		public Boolean TRFPONIsNullable() {
			return false;
		}

		public Boolean TRFPONIsKey() {
			return false;
		}

		public Integer TRFPONLength() {
			return 6;
		}

		public Integer TRFPONPrecision() {
			return 0;
		}

		public String TRFPONDefault() {

			return null;

		}

		public String TRFPONComment() {

			return "";

		}

		public String TRFPONPattern() {

			return "";

		}

		public String TRFPONOriginalDbColumnName() {

			return "TRFPON";

		}

		public float TRFBON;

		public float getTRFBON() {
			return this.TRFBON;
		}

		public Boolean TRFBONIsNullable() {
			return false;
		}

		public Boolean TRFBONIsKey() {
			return false;
		}

		public Integer TRFBONLength() {
			return 2;
		}

		public Integer TRFBONPrecision() {
			return 0;
		}

		public String TRFBONDefault() {

			return "";

		}

		public String TRFBONComment() {

			return "";

		}

		public String TRFBONPattern() {

			return "";

		}

		public String TRFBONOriginalDbColumnName() {

			return "TRFBON";

		}

		public BigDecimal THTUNT;

		public BigDecimal getTHTUNT() {
			return this.THTUNT;
		}

		public Boolean THTUNTIsNullable() {
			return false;
		}

		public Boolean THTUNTIsKey() {
			return false;
		}

		public Integer THTUNTLength() {
			return 11;
		}

		public Integer THTUNTPrecision() {
			return 2;
		}

		public String THTUNTDefault() {

			return "";

		}

		public String THTUNTComment() {

			return "";

		}

		public String THTUNTPattern() {

			return "";

		}

		public String THTUNTOriginalDbColumnName() {

			return "THTUNT";

		}

		public BigDecimal THTPCK;

		public BigDecimal getTHTPCK() {
			return this.THTPCK;
		}

		public Boolean THTPCKIsNullable() {
			return false;
		}

		public Boolean THTPCKIsKey() {
			return false;
		}

		public Integer THTPCKLength() {
			return 9;
		}

		public Integer THTPCKPrecision() {
			return 0;
		}

		public String THTPCKDefault() {

			return "";

		}

		public String THTPCKComment() {

			return "";

		}

		public String THTPCKPattern() {

			return "";

		}

		public String THTPCKOriginalDbColumnName() {

			return "THTPCK";

		}

		public BigDecimal THTPLT;

		public BigDecimal getTHTPLT() {
			return this.THTPLT;
		}

		public Boolean THTPLTIsNullable() {
			return false;
		}

		public Boolean THTPLTIsKey() {
			return false;
		}

		public Integer THTPLTLength() {
			return 11;
		}

		public Integer THTPLTPrecision() {
			return 2;
		}

		public String THTPLTDefault() {

			return "";

		}

		public String THTPLTComment() {

			return "";

		}

		public String THTPLTPattern() {

			return "";

		}

		public String THTPLTOriginalDbColumnName() {

			return "THTPLT";

		}

		public BigDecimal THTCTN;

		public BigDecimal getTHTCTN() {
			return this.THTCTN;
		}

		public Boolean THTCTNIsNullable() {
			return false;
		}

		public Boolean THTCTNIsKey() {
			return false;
		}

		public Integer THTCTNLength() {
			return 11;
		}

		public Integer THTCTNPrecision() {
			return 2;
		}

		public String THTCTNDefault() {

			return "";

		}

		public String THTCTNComment() {

			return "";

		}

		public String THTCTNPattern() {

			return "";

		}

		public String THTCTNOriginalDbColumnName() {

			return "THTCTN";

		}

		public BigDecimal THTIPK;

		public BigDecimal getTHTIPK() {
			return this.THTIPK;
		}

		public Boolean THTIPKIsNullable() {
			return false;
		}

		public Boolean THTIPKIsKey() {
			return false;
		}

		public Integer THTIPKLength() {
			return 11;
		}

		public Integer THTIPKPrecision() {
			return 2;
		}

		public String THTIPKDefault() {

			return "";

		}

		public String THTIPKComment() {

			return "";

		}

		public String THTIPKPattern() {

			return "";

		}

		public String THTIPKOriginalDbColumnName() {

			return "THTIPK";

		}

		public BigDecimal THTRTA;

		public BigDecimal getTHTRTA() {
			return this.THTRTA;
		}

		public Boolean THTRTAIsNullable() {
			return false;
		}

		public Boolean THTRTAIsKey() {
			return false;
		}

		public Integer THTRTALength() {
			return 11;
		}

		public Integer THTRTAPrecision() {
			return 2;
		}

		public String THTRTADefault() {

			return "";

		}

		public String THTRTAComment() {

			return "";

		}

		public String THTRTAPattern() {

			return "";

		}

		public String THTRTAOriginalDbColumnName() {

			return "THTRTA";

		}

		public BigDecimal THTCST;

		public BigDecimal getTHTCST() {
			return this.THTCST;
		}

		public Boolean THTCSTIsNullable() {
			return false;
		}

		public Boolean THTCSTIsKey() {
			return false;
		}

		public Integer THTCSTLength() {
			return 11;
		}

		public Integer THTCSTPrecision() {
			return 3;
		}

		public String THTCSTDefault() {

			return "";

		}

		public String THTCSTComment() {

			return "";

		}

		public String THTCSTPattern() {

			return "";

		}

		public String THTCSTOriginalDbColumnName() {

			return "THTCST";

		}

		public BigDecimal THTCUB;

		public BigDecimal getTHTCUB() {
			return this.THTCUB;
		}

		public Boolean THTCUBIsNullable() {
			return false;
		}

		public Boolean THTCUBIsKey() {
			return false;
		}

		public Integer THTCUBLength() {
			return 11;
		}

		public Integer THTCUBPrecision() {
			return 3;
		}

		public String THTCUBDefault() {

			return "";

		}

		public String THTCUBComment() {

			return "";

		}

		public String THTCUBPattern() {

			return "";

		}

		public String THTCUBOriginalDbColumnName() {

			return "THTCUB";

		}

		public BigDecimal THTUNP;

		public BigDecimal getTHTUNP() {
			return this.THTUNP;
		}

		public Boolean THTUNPIsNullable() {
			return false;
		}

		public Boolean THTUNPIsKey() {
			return false;
		}

		public Integer THTUNPLength() {
			return 11;
		}

		public Integer THTUNPPrecision() {
			return 2;
		}

		public String THTUNPDefault() {

			return "";

		}

		public String THTUNPComment() {

			return "";

		}

		public String THTUNPPattern() {

			return "";

		}

		public String THTUNPOriginalDbColumnName() {

			return "THTUNP";

		}

		public BigDecimal THTPLP;

		public BigDecimal getTHTPLP() {
			return this.THTPLP;
		}

		public Boolean THTPLPIsNullable() {
			return false;
		}

		public Boolean THTPLPIsKey() {
			return false;
		}

		public Integer THTPLPLength() {
			return 11;
		}

		public Integer THTPLPPrecision() {
			return 2;
		}

		public String THTPLPDefault() {

			return "";

		}

		public String THTPLPComment() {

			return "";

		}

		public String THTPLPPattern() {

			return "";

		}

		public String THTPLPOriginalDbColumnName() {

			return "THTPLP";

		}

		public BigDecimal THTCTP;

		public BigDecimal getTHTCTP() {
			return this.THTCTP;
		}

		public Boolean THTCTPIsNullable() {
			return false;
		}

		public Boolean THTCTPIsKey() {
			return false;
		}

		public Integer THTCTPLength() {
			return 11;
		}

		public Integer THTCTPPrecision() {
			return 2;
		}

		public String THTCTPDefault() {

			return "";

		}

		public String THTCTPComment() {

			return "";

		}

		public String THTCTPPattern() {

			return "";

		}

		public String THTCTPOriginalDbColumnName() {

			return "THTCTP";

		}

		public BigDecimal THTIPP;

		public BigDecimal getTHTIPP() {
			return this.THTIPP;
		}

		public Boolean THTIPPIsNullable() {
			return false;
		}

		public Boolean THTIPPIsKey() {
			return false;
		}

		public Integer THTIPPLength() {
			return 11;
		}

		public Integer THTIPPPrecision() {
			return 2;
		}

		public String THTIPPDefault() {

			return "";

		}

		public String THTIPPComment() {

			return "";

		}

		public String THTIPPPattern() {

			return "";

		}

		public String THTIPPOriginalDbColumnName() {

			return "THTIPP";

		}

		public BigDecimal THTRTP;

		public BigDecimal getTHTRTP() {
			return this.THTRTP;
		}

		public Boolean THTRTPIsNullable() {
			return false;
		}

		public Boolean THTRTPIsKey() {
			return false;
		}

		public Integer THTRTPLength() {
			return 11;
		}

		public Integer THTRTPPrecision() {
			return 2;
		}

		public String THTRTPDefault() {

			return "";

		}

		public String THTRTPComment() {

			return "";

		}

		public String THTRTPPattern() {

			return "";

		}

		public String THTRTPOriginalDbColumnName() {

			return "THTRTP";

		}

		public BigDecimal THTCSP;

		public BigDecimal getTHTCSP() {
			return this.THTCSP;
		}

		public Boolean THTCSPIsNullable() {
			return false;
		}

		public Boolean THTCSPIsKey() {
			return false;
		}

		public Integer THTCSPLength() {
			return 11;
		}

		public Integer THTCSPPrecision() {
			return 3;
		}

		public String THTCSPDefault() {

			return "";

		}

		public String THTCSPComment() {

			return "";

		}

		public String THTCSPPattern() {

			return "";

		}

		public String THTCSPOriginalDbColumnName() {

			return "THTCSP";

		}

		public BigDecimal THTPCU;

		public BigDecimal getTHTPCU() {
			return this.THTPCU;
		}

		public Boolean THTPCUIsNullable() {
			return false;
		}

		public Boolean THTPCUIsKey() {
			return false;
		}

		public Integer THTPCULength() {
			return 11;
		}

		public Integer THTPCUPrecision() {
			return 3;
		}

		public String THTPCUDefault() {

			return "";

		}

		public String THTPCUComment() {

			return "";

		}

		public String THTPCUPattern() {

			return "";

		}

		public String THTPCUOriginalDbColumnName() {

			return "THTPCU";

		}

		public BigDecimal TRPKLN;

		public BigDecimal getTRPKLN() {
			return this.TRPKLN;
		}

		public Boolean TRPKLNIsNullable() {
			return false;
		}

		public Boolean TRPKLNIsKey() {
			return false;
		}

		public Integer TRPKLNLength() {
			return 5;
		}

		public Integer TRPKLNPrecision() {
			return 0;
		}

		public String TRPKLNDefault() {

			return "";

		}

		public String TRPKLNComment() {

			return "";

		}

		public String TRPKLNPattern() {

			return "";

		}

		public String TRPKLNOriginalDbColumnName() {

			return "TRPKLN";

		}

		public BigDecimal THCYCL;

		public BigDecimal getTHCYCL() {
			return this.THCYCL;
		}

		public Boolean THCYCLIsNullable() {
			return false;
		}

		public Boolean THCYCLIsKey() {
			return false;
		}

		public Integer THCYCLLength() {
			return 5;
		}

		public Integer THCYCLPrecision() {
			return 0;
		}

		public String THCYCLDefault() {

			return "";

		}

		public String THCYCLComment() {

			return "";

		}

		public String THCYCLPattern() {

			return "";

		}

		public String THCYCLOriginalDbColumnName() {

			return "THCYCL";

		}

		public float THSCWV;

		public float getTHSCWV() {
			return this.THSCWV;
		}

		public Boolean THSCWVIsNullable() {
			return false;
		}

		public Boolean THSCWVIsKey() {
			return false;
		}

		public Integer THSCWVLength() {
			return 2;
		}

		public Integer THSCWVPrecision() {
			return 0;
		}

		public String THSCWVDefault() {

			return "";

		}

		public String THSCWVComment() {

			return "";

		}

		public String THSCWVPattern() {

			return "";

		}

		public String THSCWVOriginalDbColumnName() {

			return "THSCWV";

		}

		public float THSCSQ;

		public float getTHSCSQ() {
			return this.THSCSQ;
		}

		public Boolean THSCSQIsNullable() {
			return false;
		}

		public Boolean THSCSQIsKey() {
			return false;
		}

		public Integer THSCSQLength() {
			return 3;
		}

		public Integer THSCSQPrecision() {
			return 0;
		}

		public String THSCSQDefault() {

			return "";

		}

		public String THSCSQComment() {

			return "";

		}

		public String THSCSQPattern() {

			return "";

		}

		public String THSCSQOriginalDbColumnName() {

			return "THSCSQ";

		}

		public String THSCNM;

		public String getTHSCNM() {
			return this.THSCNM;
		}

		public Boolean THSCNMIsNullable() {
			return false;
		}

		public Boolean THSCNMIsKey() {
			return false;
		}

		public Integer THSCNMLength() {
			return 8;
		}

		public Integer THSCNMPrecision() {
			return 0;
		}

		public String THSCNMDefault() {

			return "";

		}

		public String THSCNMComment() {

			return "";

		}

		public String THSCNMPattern() {

			return "";

		}

		public String THSCNMOriginalDbColumnName() {

			return "THSCNM";

		}

		public String TRFXRF;

		public String getTRFXRF() {
			return this.TRFXRF;
		}

		public Boolean TRFXRFIsNullable() {
			return false;
		}

		public Boolean TRFXRFIsKey() {
			return false;
		}

		public Integer TRFXRFLength() {
			return 8;
		}

		public Integer TRFXRFPrecision() {
			return 0;
		}

		public String TRFXRFDefault() {

			return "";

		}

		public String TRFXRFComment() {

			return "";

		}

		public String TRFXRFPattern() {

			return "";

		}

		public String TRFXRFOriginalDbColumnName() {

			return "TRFXRF";

		}

		public String THCNYN;

		public String getTHCNYN() {
			return this.THCNYN;
		}

		public Boolean THCNYNIsNullable() {
			return false;
		}

		public Boolean THCNYNIsKey() {
			return false;
		}

		public Integer THCNYNLength() {
			return 1;
		}

		public Integer THCNYNPrecision() {
			return 0;
		}

		public String THCNYNDefault() {

			return "";

		}

		public String THCNYNComment() {

			return "";

		}

		public String THCNYNPattern() {

			return "";

		}

		public String THCNYNOriginalDbColumnName() {

			return "THCNYN";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.TRFICN = dis.readFloat();

					this.TRFIDT = dis.readFloat();

					this.TRFBCN = dis.readFloat();

					this.TRFBDT = dis.readFloat();

					this.TRFSCN = dis.readFloat();

					this.TRFSDT = dis.readFloat();

					this.TRFRCN = dis.readFloat();

					this.TRFRDT = dis.readFloat();

					this.TRFINS = readString(dis);

					this.TRFDLC = readString(dis);

					this.TRFREF = readString(dis);

					this.TRFPYN = readString(dis);

					this.TRINIT = readString(dis);

					this.TRFPON = readString(dis);

					this.TRFBON = dis.readFloat();

					this.THTUNT = (BigDecimal) dis.readObject();

					this.THTPCK = (BigDecimal) dis.readObject();

					this.THTPLT = (BigDecimal) dis.readObject();

					this.THTCTN = (BigDecimal) dis.readObject();

					this.THTIPK = (BigDecimal) dis.readObject();

					this.THTRTA = (BigDecimal) dis.readObject();

					this.THTCST = (BigDecimal) dis.readObject();

					this.THTCUB = (BigDecimal) dis.readObject();

					this.THTUNP = (BigDecimal) dis.readObject();

					this.THTPLP = (BigDecimal) dis.readObject();

					this.THTCTP = (BigDecimal) dis.readObject();

					this.THTIPP = (BigDecimal) dis.readObject();

					this.THTRTP = (BigDecimal) dis.readObject();

					this.THTCSP = (BigDecimal) dis.readObject();

					this.THTPCU = (BigDecimal) dis.readObject();

					this.TRPKLN = (BigDecimal) dis.readObject();

					this.THCYCL = (BigDecimal) dis.readObject();

					this.THSCWV = dis.readFloat();

					this.THSCSQ = dis.readFloat();

					this.THSCNM = readString(dis);

					this.TRFXRF = readString(dis);

					this.THCNYN = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_HEADER_TRFHDR) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.TRFICN = dis.readFloat();

					this.TRFIDT = dis.readFloat();

					this.TRFBCN = dis.readFloat();

					this.TRFBDT = dis.readFloat();

					this.TRFSCN = dis.readFloat();

					this.TRFSDT = dis.readFloat();

					this.TRFRCN = dis.readFloat();

					this.TRFRDT = dis.readFloat();

					this.TRFINS = readString(dis);

					this.TRFDLC = readString(dis);

					this.TRFREF = readString(dis);

					this.TRFPYN = readString(dis);

					this.TRINIT = readString(dis);

					this.TRFPON = readString(dis);

					this.TRFBON = dis.readFloat();

					this.THTUNT = (BigDecimal) dis.readObject();

					this.THTPCK = (BigDecimal) dis.readObject();

					this.THTPLT = (BigDecimal) dis.readObject();

					this.THTCTN = (BigDecimal) dis.readObject();

					this.THTIPK = (BigDecimal) dis.readObject();

					this.THTRTA = (BigDecimal) dis.readObject();

					this.THTCST = (BigDecimal) dis.readObject();

					this.THTCUB = (BigDecimal) dis.readObject();

					this.THTUNP = (BigDecimal) dis.readObject();

					this.THTPLP = (BigDecimal) dis.readObject();

					this.THTCTP = (BigDecimal) dis.readObject();

					this.THTIPP = (BigDecimal) dis.readObject();

					this.THTRTP = (BigDecimal) dis.readObject();

					this.THTCSP = (BigDecimal) dis.readObject();

					this.THTPCU = (BigDecimal) dis.readObject();

					this.TRPKLN = (BigDecimal) dis.readObject();

					this.THCYCL = (BigDecimal) dis.readObject();

					this.THSCWV = dis.readFloat();

					this.THSCSQ = dis.readFloat();

					this.THSCNM = readString(dis);

					this.TRFXRF = readString(dis);

					this.THCNYN = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// float

				dos.writeFloat(this.TRFICN);

				// float

				dos.writeFloat(this.TRFIDT);

				// float

				dos.writeFloat(this.TRFBCN);

				// float

				dos.writeFloat(this.TRFBDT);

				// float

				dos.writeFloat(this.TRFSCN);

				// float

				dos.writeFloat(this.TRFSDT);

				// float

				dos.writeFloat(this.TRFRCN);

				// float

				dos.writeFloat(this.TRFRDT);

				// String

				writeString(this.TRFINS, dos);

				// String

				writeString(this.TRFDLC, dos);

				// String

				writeString(this.TRFREF, dos);

				// String

				writeString(this.TRFPYN, dos);

				// String

				writeString(this.TRINIT, dos);

				// String

				writeString(this.TRFPON, dos);

				// float

				dos.writeFloat(this.TRFBON);

				// BigDecimal

				dos.writeObject(this.THTUNT);

				// BigDecimal

				dos.writeObject(this.THTPCK);

				// BigDecimal

				dos.writeObject(this.THTPLT);

				// BigDecimal

				dos.writeObject(this.THTCTN);

				// BigDecimal

				dos.writeObject(this.THTIPK);

				// BigDecimal

				dos.writeObject(this.THTRTA);

				// BigDecimal

				dos.writeObject(this.THTCST);

				// BigDecimal

				dos.writeObject(this.THTCUB);

				// BigDecimal

				dos.writeObject(this.THTUNP);

				// BigDecimal

				dos.writeObject(this.THTPLP);

				// BigDecimal

				dos.writeObject(this.THTCTP);

				// BigDecimal

				dos.writeObject(this.THTIPP);

				// BigDecimal

				dos.writeObject(this.THTRTP);

				// BigDecimal

				dos.writeObject(this.THTCSP);

				// BigDecimal

				dos.writeObject(this.THTPCU);

				// BigDecimal

				dos.writeObject(this.TRPKLN);

				// BigDecimal

				dos.writeObject(this.THCYCL);

				// float

				dos.writeFloat(this.THSCWV);

				// float

				dos.writeFloat(this.THSCSQ);

				// String

				writeString(this.THSCNM, dos);

				// String

				writeString(this.TRFXRF, dos);

				// String

				writeString(this.THCNYN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// float

				dos.writeFloat(this.TRFICN);

				// float

				dos.writeFloat(this.TRFIDT);

				// float

				dos.writeFloat(this.TRFBCN);

				// float

				dos.writeFloat(this.TRFBDT);

				// float

				dos.writeFloat(this.TRFSCN);

				// float

				dos.writeFloat(this.TRFSDT);

				// float

				dos.writeFloat(this.TRFRCN);

				// float

				dos.writeFloat(this.TRFRDT);

				// String

				writeString(this.TRFINS, dos);

				// String

				writeString(this.TRFDLC, dos);

				// String

				writeString(this.TRFREF, dos);

				// String

				writeString(this.TRFPYN, dos);

				// String

				writeString(this.TRINIT, dos);

				// String

				writeString(this.TRFPON, dos);

				// float

				dos.writeFloat(this.TRFBON);

				// BigDecimal

				dos.writeObject(this.THTUNT);

				// BigDecimal

				dos.writeObject(this.THTPCK);

				// BigDecimal

				dos.writeObject(this.THTPLT);

				// BigDecimal

				dos.writeObject(this.THTCTN);

				// BigDecimal

				dos.writeObject(this.THTIPK);

				// BigDecimal

				dos.writeObject(this.THTRTA);

				// BigDecimal

				dos.writeObject(this.THTCST);

				// BigDecimal

				dos.writeObject(this.THTCUB);

				// BigDecimal

				dos.writeObject(this.THTUNP);

				// BigDecimal

				dos.writeObject(this.THTPLP);

				// BigDecimal

				dos.writeObject(this.THTCTP);

				// BigDecimal

				dos.writeObject(this.THTIPP);

				// BigDecimal

				dos.writeObject(this.THTRTP);

				// BigDecimal

				dos.writeObject(this.THTCSP);

				// BigDecimal

				dos.writeObject(this.THTPCU);

				// BigDecimal

				dos.writeObject(this.TRPKLN);

				// BigDecimal

				dos.writeObject(this.THCYCL);

				// float

				dos.writeFloat(this.THSCWV);

				// float

				dos.writeFloat(this.THSCSQ);

				// String

				writeString(this.THSCNM, dos);

				// String

				writeString(this.TRFXRF, dos);

				// String

				writeString(this.THCNYN, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRFBCH=" + TRFBCH);
			sb.append(",TRFSTS=" + TRFSTS);
			sb.append(",TRFTYP=" + TRFTYP);
			sb.append(",TRFPTY=" + TRFPTY);
			sb.append(",TRFFLC=" + String.valueOf(TRFFLC));
			sb.append(",TRFTLC=" + String.valueOf(TRFTLC));
			sb.append(",TRFICN=" + String.valueOf(TRFICN));
			sb.append(",TRFIDT=" + String.valueOf(TRFIDT));
			sb.append(",TRFBCN=" + String.valueOf(TRFBCN));
			sb.append(",TRFBDT=" + String.valueOf(TRFBDT));
			sb.append(",TRFSCN=" + String.valueOf(TRFSCN));
			sb.append(",TRFSDT=" + String.valueOf(TRFSDT));
			sb.append(",TRFRCN=" + String.valueOf(TRFRCN));
			sb.append(",TRFRDT=" + String.valueOf(TRFRDT));
			sb.append(",TRFINS=" + TRFINS);
			sb.append(",TRFDLC=" + TRFDLC);
			sb.append(",TRFREF=" + TRFREF);
			sb.append(",TRFPYN=" + TRFPYN);
			sb.append(",TRINIT=" + TRINIT);
			sb.append(",TRFPON=" + TRFPON);
			sb.append(",TRFBON=" + String.valueOf(TRFBON));
			sb.append(",THTUNT=" + String.valueOf(THTUNT));
			sb.append(",THTPCK=" + String.valueOf(THTPCK));
			sb.append(",THTPLT=" + String.valueOf(THTPLT));
			sb.append(",THTCTN=" + String.valueOf(THTCTN));
			sb.append(",THTIPK=" + String.valueOf(THTIPK));
			sb.append(",THTRTA=" + String.valueOf(THTRTA));
			sb.append(",THTCST=" + String.valueOf(THTCST));
			sb.append(",THTCUB=" + String.valueOf(THTCUB));
			sb.append(",THTUNP=" + String.valueOf(THTUNP));
			sb.append(",THTPLP=" + String.valueOf(THTPLP));
			sb.append(",THTCTP=" + String.valueOf(THTCTP));
			sb.append(",THTIPP=" + String.valueOf(THTIPP));
			sb.append(",THTRTP=" + String.valueOf(THTRTP));
			sb.append(",THTCSP=" + String.valueOf(THTCSP));
			sb.append(",THTPCU=" + String.valueOf(THTPCU));
			sb.append(",TRPKLN=" + String.valueOf(TRPKLN));
			sb.append(",THCYCL=" + String.valueOf(THCYCL));
			sb.append(",THSCWV=" + String.valueOf(THSCWV));
			sb.append(",THSCSQ=" + String.valueOf(THSCSQ));
			sb.append(",THSCNM=" + THSCNM);
			sb.append(",TRFXRF=" + TRFXRF);
			sb.append(",THCNYN=" + THCNYN);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (TRFBCH == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFBCH);
			}

			sb.append("|");

			if (TRFSTS == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSTS);
			}

			sb.append("|");

			if (TRFTYP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFTYP);
			}

			sb.append("|");

			if (TRFPTY == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPTY);
			}

			sb.append("|");

			if (TRFFLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFFLC);
			}

			sb.append("|");

			if (TRFTLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFTLC);
			}

			sb.append("|");

			sb.append(TRFICN);

			sb.append("|");

			sb.append(TRFIDT);

			sb.append("|");

			sb.append(TRFBCN);

			sb.append("|");

			sb.append(TRFBDT);

			sb.append("|");

			sb.append(TRFSCN);

			sb.append("|");

			sb.append(TRFSDT);

			sb.append("|");

			sb.append(TRFRCN);

			sb.append("|");

			sb.append(TRFRDT);

			sb.append("|");

			if (TRFINS == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFINS);
			}

			sb.append("|");

			if (TRFDLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFDLC);
			}

			sb.append("|");

			if (TRFREF == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREF);
			}

			sb.append("|");

			if (TRFPYN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPYN);
			}

			sb.append("|");

			if (TRINIT == null) {
				sb.append("<null>");
			} else {
				sb.append(TRINIT);
			}

			sb.append("|");

			if (TRFPON == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFPON);
			}

			sb.append("|");

			sb.append(TRFBON);

			sb.append("|");

			if (THTUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(THTUNT);
			}

			sb.append("|");

			if (THTPCK == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPCK);
			}

			sb.append("|");

			if (THTPLT == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPLT);
			}

			sb.append("|");

			if (THTCTN == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCTN);
			}

			sb.append("|");

			if (THTIPK == null) {
				sb.append("<null>");
			} else {
				sb.append(THTIPK);
			}

			sb.append("|");

			if (THTRTA == null) {
				sb.append("<null>");
			} else {
				sb.append(THTRTA);
			}

			sb.append("|");

			if (THTCST == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCST);
			}

			sb.append("|");

			if (THTCUB == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCUB);
			}

			sb.append("|");

			if (THTUNP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTUNP);
			}

			sb.append("|");

			if (THTPLP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPLP);
			}

			sb.append("|");

			if (THTCTP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCTP);
			}

			sb.append("|");

			if (THTIPP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTIPP);
			}

			sb.append("|");

			if (THTRTP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTRTP);
			}

			sb.append("|");

			if (THTCSP == null) {
				sb.append("<null>");
			} else {
				sb.append(THTCSP);
			}

			sb.append("|");

			if (THTPCU == null) {
				sb.append("<null>");
			} else {
				sb.append(THTPCU);
			}

			sb.append("|");

			if (TRPKLN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRPKLN);
			}

			sb.append("|");

			if (THCYCL == null) {
				sb.append("<null>");
			} else {
				sb.append(THCYCL);
			}

			sb.append("|");

			sb.append(THSCWV);

			sb.append("|");

			sb.append(THSCSQ);

			sb.append("|");

			if (THSCNM == null) {
				sb.append("<null>");
			} else {
				sb.append(THSCNM);
			}

			sb.append("|");

			if (TRFXRF == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFXRF);
			}

			sb.append("|");

			if (THCNYN == null) {
				sb.append("<null>");
			} else {
				sb.append(THCNYN);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row2Struct other) {

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

	public void tFileInputDelimited_12Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_12_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_12");
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

				row2Struct row2 = new row2Struct();

				/**
				 * [tDBOutput_3 begin ] start
				 */

				ok_Hash.put("tDBOutput_3", false);
				start_Hash.put("tDBOutput_3", System.currentTimeMillis());

				currentComponent = "tDBOutput_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row2");

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

				props_tDBOutput_3.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_3.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_3.table.setValue("tableName", "TRFHDR");

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

						a("\"name\":\"tDBOutput_3\",\"fields\":[{", s);

						a("\"name\":\"TRFBCH\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFBCH\",\"talend.field.dbColumnName\":\"TRFBCH\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFBCH\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFSTS\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFSTS\",\"talend.field.dbColumnName\":\"TRFSTS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFSTS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFTYP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFTYP\",\"talend.field.dbColumnName\":\"TRFTYP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFTYP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFPTY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFPTY\",\"talend.field.dbColumnName\":\"TRFPTY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFPTY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFFLC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFFLC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFFLC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFFLC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFTLC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFTLC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFTLC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFTLC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFICN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFICN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFICN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFICN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFIDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFIDT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFIDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFIDT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFBCN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFBCN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFBCN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFBCN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFBDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFBDT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFBDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFBDT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFSCN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFSCN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFSCN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFSCN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFSDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFSDT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFSDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFSDT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFRCN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFRCN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFRCN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFRCN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFRDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFRDT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFRDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFRDT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFINS\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFINS\",\"talend.field.dbColumnName\":\"TRFINS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFINS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFDLC\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFDLC\",\"talend.field.dbColumnName\":\"TRFDLC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFDLC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFREF\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFREF\",\"talend.field.dbColumnName\":\"TRFREF\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFREF\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFPYN\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFPYN\",\"talend.field.dbColumnName\":\"TRFPYN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFPYN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRINIT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRINIT\",\"talend.field.dbColumnName\":\"TRINIT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRINIT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFPON\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFPON\",\"talend.field.dbColumnName\":\"TRFPON\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFPON\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFBON\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFBON\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFBON\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFBON\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTUNT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTUNT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTPCK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTPCK\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTPCK\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTPCK\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTPLT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTPLT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTPLT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTPLT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTCTN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTCTN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTCTN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTCTN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTIPK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTIPK\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTIPK\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTIPK\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTRTA\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTRTA\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTRTA\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTRTA\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTCST\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTCST\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTCST\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTCST\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTCUB\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTCUB\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTCUB\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTCUB\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTUNP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTUNP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTUNP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTUNP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTPLP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTPLP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTPLP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTPLP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTCTP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTCTP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTCTP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTCTP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTIPP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTIPP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTIPP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTIPP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTRTP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTRTP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTRTP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTRTP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTCSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTCSP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTCSP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTCSP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THTPCU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THTPCU\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THTPCU\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THTPCU\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRPKLN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRPKLN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRPKLN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRPKLN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THCYCL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THCYCL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THCYCL\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THCYCL\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THSCWV\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THSCWV\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THSCWV\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THSCWV\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THSCSQ\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THSCSQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THSCSQ\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THSCSQ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THSCNM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THSCNM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THSCNM\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THSCNM\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRFXRF\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRFXRF\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRFXRF\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRFXRF\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"THCNYN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"THCNYN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"THCNYN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"THCNYN\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_3\",\"di.table.label\":\"tDBOutput_3\"}",
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
				 * [tFileInputDelimited_12 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_12", false);
				start_Hash.put("tFileInputDelimited_12", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_12";

				int tos_count_tFileInputDelimited_12 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_12 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_12 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_12 = new StringBuilder();
							log4jParamters_tFileInputDelimited_12.append("Parameters:");
							log4jParamters_tFileInputDelimited_12
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/TRFHDR.zip\"");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBCH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSTS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTYP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFFLC") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFTLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFICN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFIDT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFBCN") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFBDT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFSCN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSDT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRCN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRDT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFINS") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFDLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFREF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPYN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRINIT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFPON") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBON") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTUNT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTPCK")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTPLT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTCTN") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTIPK") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTRTA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTCST")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTCUB") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTUNP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTPLP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("THTCTP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTIPP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THTRTP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THTCSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THTPCU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRPKLN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THCYCL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THSCWV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("THSCSQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("THSCNM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFXRF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("THCNYN") + "}]");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							log4jParamters_tFileInputDelimited_12.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_12.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_12 - " + (log4jParamters_tFileInputDelimited_12));
						}
					}
					new BytesLimit65535_tFileInputDelimited_12().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_12", "tFileInputDelimited_12", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_12 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_12 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_12 = null;
				int limit_tFileInputDelimited_12 = -1;
				try {

					Object filename_tFileInputDelimited_12 = "/data/talend/data_repository/TRFHDR.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_12 = null;
					try {
						if (filename_tFileInputDelimited_12 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_12 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_12));
						} else {
							zis_tFileInputDelimited_12 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_12))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE", e.getMessage());

						log.error("tFileInputDelimited_12 - " + e.getMessage());

						System.err.println(e.getMessage());

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_12 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_12 = zis_tFileInputDelimited_12.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE", e.getMessage());

							log.error("tFileInputDelimited_12 - " + e.getMessage());

							System.err.println(e.getMessage());
							break;

						}
						if (entry_tFileInputDelimited_12 == null) {
							break;
						}
						if (entry_tFileInputDelimited_12.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_12 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_12, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_12, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE", e.getMessage());

							log.error("tFileInputDelimited_12 - " + e.getMessage());

							System.err.println(e.getMessage());

						}

						log.info("tFileInputDelimited_12 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_12 != null && fid_tFileInputDelimited_12.nextRecord()) {
							rowstate_tFileInputDelimited_12.reset();

							row2 = null;

							boolean whetherReject_tFileInputDelimited_12 = false;
							row2 = new row2Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_12 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_12 = 0;

								row2.TRFBCH = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 1;

								row2.TRFSTS = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 2;

								row2.TRFTYP = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 3;

								row2.TRFPTY = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 4;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFFLC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFFLC", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.TRFFLC = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 5;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFTLC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFTLC", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.TRFTLC = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 6;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFICN = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFICN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFICN' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 7;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFIDT = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFIDT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFIDT' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 8;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFBCN = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFBCN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFBCN' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 9;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFBDT = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFBDT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFBDT' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 10;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFSCN = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFSCN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFSCN' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 11;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFSDT = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFSDT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFSDT' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 12;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFRCN = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFRCN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFRCN' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 13;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFRDT = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFRDT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFRDT' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 14;

								row2.TRFINS = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 15;

								row2.TRFDLC = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 16;

								row2.TRFREF = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 17;

								row2.TRFPYN = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 18;

								row2.TRINIT = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 19;

								row2.TRFPON = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 20;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRFBON = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFBON", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'TRFBON' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 21;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTUNT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTUNT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTUNT = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 22;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTPCK = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTPCK", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTPCK = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 23;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTPLT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTPLT", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTPLT = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 24;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTCTN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTCTN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTCTN = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 25;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTIPK = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTIPK", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTIPK = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 26;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTRTA = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTRTA", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTRTA = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 27;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTCST = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTCST", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTCST = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 28;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTCUB = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTCUB", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTCUB = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 29;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTUNP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTUNP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTUNP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 30;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTPLP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTPLP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTPLP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 31;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTCTP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTCTP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTCTP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 32;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTIPP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTIPP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTIPP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 33;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTRTP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTRTP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTRTP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 34;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTCSP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTCSP", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTCSP = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 35;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THTPCU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THTPCU", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THTPCU = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 36;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.TRPKLN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRPKLN", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.TRPKLN = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 37;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THCYCL = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THCYCL", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									row2.THCYCL = null;

								}

								columnIndexWithD_tFileInputDelimited_12 = 38;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THSCWV = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THSCWV", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'THSCWV' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 39;

								temp = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);
								if (temp.length() > 0) {

									try {

										row2.THSCSQ = ParserUtils.parseTo_float(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_12) {
										globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE",
												ex_tFileInputDelimited_12.getMessage());
										rowstate_tFileInputDelimited_12.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"THSCSQ", "row2", temp, ex_tFileInputDelimited_12),
												ex_tFileInputDelimited_12));
									}

								} else {

									rowstate_tFileInputDelimited_12.setException(new RuntimeException(
											"Value is empty for column : 'THSCSQ' in 'row2' connection, value is invalid or this column should be nullable or have a default value."));

								}

								columnIndexWithD_tFileInputDelimited_12 = 40;

								row2.THSCNM = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 41;

								row2.TRFXRF = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								columnIndexWithD_tFileInputDelimited_12 = 42;

								row2.THCNYN = fid_tFileInputDelimited_12.get(columnIndexWithD_tFileInputDelimited_12);

								if (rowstate_tFileInputDelimited_12.getException() != null) {
									throw rowstate_tFileInputDelimited_12.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_12_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_12 = true;

								log.error("tFileInputDelimited_12 - " + e.getMessage());

								System.err.println(e.getMessage());
								row2 = null;

							}

							log.debug("tFileInputDelimited_12 - Retrieving the record "
									+ fid_tFileInputDelimited_12.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_12 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_12 main ] start
							 */

							currentComponent = "tFileInputDelimited_12";

							tos_count_tFileInputDelimited_12++;

							/**
							 * [tFileInputDelimited_12 main ] stop
							 */

							/**
							 * [tFileInputDelimited_12 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_12";

							/**
							 * [tFileInputDelimited_12 process_data_begin ] stop
							 */
// Start of branch "row2"
							if (row2 != null) {

								/**
								 * [tDBOutput_3 main ] start
								 */

								currentComponent = "tDBOutput_3";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row2", "tFileInputDelimited_12", "tFileInputDelimited_12",
										"tFileInputDelimited", "tDBOutput_3", "tDBOutput_3", "tSnowflakeOutput"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
								}

								if (incomingEnforcer_tDBOutput_3 != null) {
									incomingEnforcer_tDBOutput_3.createNewRecord();
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFBCH") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFBCH", row2.TRFBCH);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFSTS") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFSTS", row2.TRFSTS);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFTYP") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFTYP", row2.TRFTYP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFPTY") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFPTY", row2.TRFPTY);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFFLC") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFFLC", row2.TRFFLC);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFTLC") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFTLC", row2.TRFTLC);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFICN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFICN", row2.TRFICN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFIDT") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFIDT", row2.TRFIDT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFBCN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFBCN", row2.TRFBCN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFBDT") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFBDT", row2.TRFBDT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFSCN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFSCN", row2.TRFSCN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFSDT") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFSDT", row2.TRFSDT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFRCN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFRCN", row2.TRFRCN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFRDT") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFRDT", row2.TRFRDT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFINS") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFINS", row2.TRFINS);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFDLC") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFDLC", row2.TRFDLC);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFREF") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFREF", row2.TRFREF);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFPYN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFPYN", row2.TRFPYN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRINIT") != null) {
									incomingEnforcer_tDBOutput_3.put("TRINIT", row2.TRINIT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFPON") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFPON", row2.TRFPON);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFBON") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFBON", row2.TRFBON);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTUNT") != null) {
									incomingEnforcer_tDBOutput_3.put("THTUNT", row2.THTUNT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTPCK") != null) {
									incomingEnforcer_tDBOutput_3.put("THTPCK", row2.THTPCK);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTPLT") != null) {
									incomingEnforcer_tDBOutput_3.put("THTPLT", row2.THTPLT);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTCTN") != null) {
									incomingEnforcer_tDBOutput_3.put("THTCTN", row2.THTCTN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTIPK") != null) {
									incomingEnforcer_tDBOutput_3.put("THTIPK", row2.THTIPK);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTRTA") != null) {
									incomingEnforcer_tDBOutput_3.put("THTRTA", row2.THTRTA);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTCST") != null) {
									incomingEnforcer_tDBOutput_3.put("THTCST", row2.THTCST);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTCUB") != null) {
									incomingEnforcer_tDBOutput_3.put("THTCUB", row2.THTCUB);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTUNP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTUNP", row2.THTUNP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTPLP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTPLP", row2.THTPLP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTCTP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTCTP", row2.THTCTP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTIPP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTIPP", row2.THTIPP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTRTP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTRTP", row2.THTRTP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTCSP") != null) {
									incomingEnforcer_tDBOutput_3.put("THTCSP", row2.THTCSP);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THTPCU") != null) {
									incomingEnforcer_tDBOutput_3.put("THTPCU", row2.THTPCU);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRPKLN") != null) {
									incomingEnforcer_tDBOutput_3.put("TRPKLN", row2.TRPKLN);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THCYCL") != null) {
									incomingEnforcer_tDBOutput_3.put("THCYCL", row2.THCYCL);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THSCWV") != null) {
									incomingEnforcer_tDBOutput_3.put("THSCWV", row2.THSCWV);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THSCSQ") != null) {
									incomingEnforcer_tDBOutput_3.put("THSCSQ", row2.THSCSQ);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THSCNM") != null) {
									incomingEnforcer_tDBOutput_3.put("THSCNM", row2.THSCNM);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("TRFXRF") != null) {
									incomingEnforcer_tDBOutput_3.put("TRFXRF", row2.TRFXRF);
								}
								// skip the put action if the input column doesn't appear in component runtime
								// schema
								if (incomingEnforcer_tDBOutput_3 != null
										&& incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("THCNYN") != null) {
									incomingEnforcer_tDBOutput_3.put("THCNYN", row2.THCNYN);
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

							} // End of branch "row2"

							/**
							 * [tFileInputDelimited_12 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_12";

							/**
							 * [tFileInputDelimited_12 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_12 end ] start
							 */

							currentComponent = "tFileInputDelimited_12";

						}
						nb_line_tFileInputDelimited_12 += fid_tFileInputDelimited_12.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/TRFHDR.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_12 != null) {
							fid_tFileInputDelimited_12.close();
						}
					}
					if (fid_tFileInputDelimited_12 != null) {
						globalMap.put("tFileInputDelimited_12_NB_LINE", nb_line_tFileInputDelimited_12);
					}

					log.info(
							"tFileInputDelimited_12- Retrieved records count: " + nb_line_tFileInputDelimited_12 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_12 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_12", true);
				end_Hash.put("tFileInputDelimited_12", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_12 end ] stop
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
						"tFileInputDelimited_12", "tFileInputDelimited_12", "tFileInputDelimited", "tDBOutput_3",
						"tDBOutput_3", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_3", true);
				end_Hash.put("tDBOutput_3", System.currentTimeMillis());

				/**
				 * [tDBOutput_3 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_12:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
			}

			tDBRow_6Process(globalMap);

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
				 * [tFileInputDelimited_12 finally ] start
				 */

				currentComponent = "tFileInputDelimited_12";

				/**
				 * [tFileInputDelimited_12 finally ] stop
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

		globalMap.put("tFileInputDelimited_12_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_6_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_6");
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
				 * [tDBRow_6 begin ] start
				 */

				ok_Hash.put("tDBRow_6", false);
				start_Hash.put("tDBRow_6", System.currentTimeMillis());

				currentComponent = "tDBRow_6";

				int tos_count_tDBRow_6 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_6", "tDBRow_6", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_6 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_6 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_6 = (String) (restRequest_tDBRow_6 != null
						? restRequest_tDBRow_6.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_6 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_6 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_6 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_6 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_6
						.createRuntimeProperties();
				props_tDBRow_6.setValue("query",
						"\ninsert into TRANSFER_HEADER_TRFHDR\nselect \nTRFBCH,\nTRFSTS, \nTRFTYP,\nTRFPTY, \nTRFFLC, \nTRFTLC,         	\n     "
								+ "   case\n        when LENGTH(TRFIDT)= 6 then TO_DATE(CONCAT( '20', TO_VARCHAR(TRFIDT)),'yyyymmdd') \n        else NULL\n"
								+ "    end as TRFIDT,\ncase\n        when LENGTH(TRFBDT)= 6 then TO_DATE(CONCAT( '20', TO_VARCHAR(TRFBDT)),'yyyymmdd') \n  "
								+ "      else NULL\n    end as TRFBDT,	\ncase\nwhen LENGTH(TRFSDT)= 6 then TO_DATE(CONCAT( '20', TO_VARCHAR(TRFSDT)),'yyyym"
								+ "mdd') \n        else NULL\n    end as TRFSDT,	\ncase\nwhen LENGTH(TRFRDT)= 6 then TO_DATE(CONCAT( '20', TO_VARCHAR(TRFRD"
								+ "T)),'yyyymmdd') \n        else NULL\n    end as TRFRDT,	\nTRFINS,\nTRFDLC, \nTRFREF, \nTRFPYN, \nTRINIT, \nTRFPON, \nTRF"
								+ "BON,\nTHTUNT, \nTHTPCK,\nTHTPLT, \nTHTCTN, \nTHTIPK,\nTHTRTA, \nTHTCST, \nTHTCUB,\nTHTUNP, \nTHTPLP, \nTHTCTP, \nTHTIPP,"
								+ "\nTHTRTP, \nTHTCSP, \nTHTPCU,\nTRPKLN, \nTHCYCL, \nTHSCWV, \nTHSCSQ, \nTHSCNM,\nTRFXRF, \nTHCNYN,\ncurrent_date() - 1 \n"
								+ "from TRFHDR\n\n\n");

				props_tDBRow_6.setValue("dieOnError", true);

				props_tDBRow_6.setValue("usePreparedStatement", false);

				props_tDBRow_6.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_6_1_fisrt {

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

				SchemaSettingTool_tDBRow_6_1_fisrt sst_tDBRow_6_1_fisrt = new SchemaSettingTool_tDBRow_6_1_fisrt();

				props_tDBRow_6.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_6_2_fisrt {

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

				SchemaSettingTool_tDBRow_6_2_fisrt sst_tDBRow_6_2_fisrt = new SchemaSettingTool_tDBRow_6_2_fisrt();

				props_tDBRow_6.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_2_fisrt.getSchemaValue()));

				props_tDBRow_6.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_6.connection.setValue("useCustomRegion", false);

				props_tDBRow_6.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_6.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_6.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_6.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_6.table.setValue("tableName", "");

				props_tDBRow_6.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_6.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_6.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_6.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_6.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_6.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_6_3_fisrt {

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

				SchemaSettingTool_tDBRow_6_3_fisrt sst_tDBRow_6_3_fisrt = new SchemaSettingTool_tDBRow_6_3_fisrt();

				props_tDBRow_6.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_6.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_6 = props_tDBRow_6.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_6 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_6 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_6 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_6.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_6);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_6.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_6 = props_tDBRow_6.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_6 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_6 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_6 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_6.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_6);
					}
				}
				globalMap.put("tDBRow_6_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_6);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_6 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_6_MAPPINGS_URL", mappings_url_tDBRow_6);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_6 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_6";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_6 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_6 = null;
				topology_tDBRow_6 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_6 = def_tDBRow_6.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_6,
						topology_tDBRow_6);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_6 = def_tDBRow_6
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_6 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_6.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_6 = componentRuntime_tDBRow_6
						.initialize(container_tDBRow_6, props_tDBRow_6);

				if (initVr_tDBRow_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_6.getMessage());
				}

				if (componentRuntime_tDBRow_6 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_6 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_6;
					compDriverInitialization_tDBRow_6.runAtDriver(container_tDBRow_6);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_6 = null;
				if (componentRuntime_tDBRow_6 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_6 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_6;
					if (doesNodeBelongToRequest_tDBRow_6) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_6 = sourceOrSink_tDBRow_6
								.validate(container_tDBRow_6);
						if (vr_tDBRow_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_6.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_6 begin ] stop
				 */

				/**
				 * [tDBRow_6 main ] start
				 */

				currentComponent = "tDBRow_6";

				tos_count_tDBRow_6++;

				/**
				 * [tDBRow_6 main ] stop
				 */

				/**
				 * [tDBRow_6 process_data_begin ] start
				 */

				currentComponent = "tDBRow_6";

				/**
				 * [tDBRow_6 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_6 process_data_end ] start
				 */

				currentComponent = "tDBRow_6";

				/**
				 * [tDBRow_6 process_data_end ] stop
				 */

				/**
				 * [tDBRow_6 end ] start
				 */

				currentComponent = "tDBRow_6";

// end of generic

				resourceMap.put("finish_tDBRow_6", Boolean.TRUE);

				ok_Hash.put("tDBRow_6", true);
				end_Hash.put("tDBRow_6", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBRow_7Process(globalMap);

				/**
				 * [tDBRow_6 end ] stop
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
				 * [tDBRow_6 finally ] start
				 */

				currentComponent = "tDBRow_6";

// finally of generic

				if (resourceMap.get("finish_tDBRow_6") == null) {
				}

				/**
				 * [tDBRow_6 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_6_SUBPROCESS_STATE", 1);
	}

	public void tDBRow_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_7_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_7");
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
				 * [tDBRow_7 begin ] start
				 */

				ok_Hash.put("tDBRow_7", false);
				start_Hash.put("tDBRow_7", System.currentTimeMillis());

				currentComponent = "tDBRow_7";

				int tos_count_tDBRow_7 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_7", "tDBRow_7", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_7 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_7 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_7 = (String) (restRequest_tDBRow_7 != null
						? restRequest_tDBRow_7.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_7 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_7 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_7 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_7 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_7
						.createRuntimeProperties();
				props_tDBRow_7.setValue("query", "\nDrop table TRFHDR\n\n");

				props_tDBRow_7.setValue("dieOnError", true);

				props_tDBRow_7.setValue("usePreparedStatement", false);

				props_tDBRow_7.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_7_1_fisrt {

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

				SchemaSettingTool_tDBRow_7_1_fisrt sst_tDBRow_7_1_fisrt = new SchemaSettingTool_tDBRow_7_1_fisrt();

				props_tDBRow_7.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_7_2_fisrt {

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

				SchemaSettingTool_tDBRow_7_2_fisrt sst_tDBRow_7_2_fisrt = new SchemaSettingTool_tDBRow_7_2_fisrt();

				props_tDBRow_7.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_2_fisrt.getSchemaValue()));

				props_tDBRow_7.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_7.connection.setValue("useCustomRegion", false);

				props_tDBRow_7.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_7.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_7.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_7.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_7.table.setValue("tableName", "");

				props_tDBRow_7.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_7.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_7.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_7.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_7.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_7.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_7_3_fisrt {

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

				SchemaSettingTool_tDBRow_7_3_fisrt sst_tDBRow_7_3_fisrt = new SchemaSettingTool_tDBRow_7_3_fisrt();

				props_tDBRow_7.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_7.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_7 = props_tDBRow_7.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_7 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_7 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_7 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_7.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_7);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_7.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_7 = props_tDBRow_7.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_7 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_7 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_7 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_7.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_7);
					}
				}
				globalMap.put("tDBRow_7_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_7);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_7 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_7_MAPPINGS_URL", mappings_url_tDBRow_7);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_7 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_7";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_7 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_7 = null;
				topology_tDBRow_7 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_7 = def_tDBRow_7.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_7,
						topology_tDBRow_7);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_7 = def_tDBRow_7
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_7 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_7.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_7 = componentRuntime_tDBRow_7
						.initialize(container_tDBRow_7, props_tDBRow_7);

				if (initVr_tDBRow_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_7.getMessage());
				}

				if (componentRuntime_tDBRow_7 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_7 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_7;
					compDriverInitialization_tDBRow_7.runAtDriver(container_tDBRow_7);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_7 = null;
				if (componentRuntime_tDBRow_7 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_7 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_7;
					if (doesNodeBelongToRequest_tDBRow_7) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_7 = sourceOrSink_tDBRow_7
								.validate(container_tDBRow_7);
						if (vr_tDBRow_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_7.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_7 begin ] stop
				 */

				/**
				 * [tDBRow_7 main ] start
				 */

				currentComponent = "tDBRow_7";

				tos_count_tDBRow_7++;

				/**
				 * [tDBRow_7 main ] stop
				 */

				/**
				 * [tDBRow_7 process_data_begin ] start
				 */

				currentComponent = "tDBRow_7";

				/**
				 * [tDBRow_7 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_7 process_data_end ] start
				 */

				currentComponent = "tDBRow_7";

				/**
				 * [tDBRow_7 process_data_end ] stop
				 */

				/**
				 * [tDBRow_7 end ] start
				 */

				currentComponent = "tDBRow_7";

// end of generic

				resourceMap.put("finish_tDBRow_7", Boolean.TRUE);

				ok_Hash.put("tDBRow_7", true);
				end_Hash.put("tDBRow_7", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tFileDelete_1Process(globalMap);

				/**
				 * [tDBRow_7 end ] stop
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
				 * [tDBRow_7 finally ] start
				 */

				currentComponent = "tDBRow_7";

// finally of generic

				if (resourceMap.get("finish_tDBRow_7") == null) {
				}

				/**
				 * [tDBRow_7 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_7_SUBPROCESS_STATE", 1);
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/TRFHDR.zip\"");
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
				java.io.File path_tFileDelete_1 = new java.io.File("/data/talend/data_repository/TRFHDR.zip");
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
				globalMap.put("tFileDelete_1_DELETE_PATH", "/data/talend/data_repository/TRFHDR.zip");

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

				props_tDBClose_1.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

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
								"enc:routine.encryption.key.v1:FK4s2GEaJlGdEITNwifFhwpDFl4fIR8hhSwXhQshaWDx9FIv"));

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
		final TRANSFER_HEADER_TRFHDR TRANSFER_HEADER_TRFHDRClass = new TRANSFER_HEADER_TRFHDR();

		int exitCode = TRANSFER_HEADER_TRFHDRClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TRANSFER_HEADER_TRFHDR' - Done.");
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
		log.info("TalendJob: 'TRANSFER_HEADER_TRFHDR' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_S3xAcDZMEeqYYKudWeBa8Q");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-27T18:17:30.426932100Z");

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
			java.io.InputStream inContext = TRANSFER_HEADER_TRFHDR.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/transfer_header_trfhdr_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TRANSFER_HEADER_TRFHDR.class.getClassLoader()
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
		log.info("TalendJob: 'TRANSFER_HEADER_TRFHDR' - Started.");
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
					tDBRow_5Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
						((java.util.Map) threadLocal.get()).put("status", "end");
					}
				} catch (TalendException e_tDBRow_5) {
					globalMap.put("tDBRow_5_SUBPROCESS_STATE", -1);

					e_tDBRow_5.printStackTrace();

				} catch (java.lang.Error e_tDBRow_5) {
					globalMap.put("tDBRow_5_SUBPROCESS_STATE", -1);
					((java.util.Map) threadLocal.get()).put("status", "failure");
					throw e_tDBRow_5;

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
			System.out.println(
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : TRANSFER_HEADER_TRFHDR");
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
		log.info("TalendJob: 'TRANSFER_HEADER_TRFHDR' - Finished - status: " + status + " returnCode: " + returnCode);

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
 * 433307 characters generated by Talend Cloud Data Management Platform on the
 * June 27, 2023 at 2:17:30 PM EDT
 ************************************************************************************************/