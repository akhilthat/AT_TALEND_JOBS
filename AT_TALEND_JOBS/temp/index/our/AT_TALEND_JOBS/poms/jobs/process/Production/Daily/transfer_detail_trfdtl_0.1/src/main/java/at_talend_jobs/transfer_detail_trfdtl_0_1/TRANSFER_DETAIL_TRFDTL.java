
package at_talend_jobs.transfer_detail_trfdtl_0_1;

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
 * Job: TRANSFER_DETAIL_TRFDTL Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class TRANSFER_DETAIL_TRFDTL implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TRANSFER_DETAIL_TRFDTL.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(TRANSFER_DETAIL_TRFDTL.class);

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
	private final String jobName = "TRANSFER_DETAIL_TRFDTL";
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
			"_JoEzMDZLEeqYYKudWeBa8Q", "0.1");
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
					TRANSFER_DETAIL_TRFDTL.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TRANSFER_DETAIL_TRFDTL.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBRow_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_4_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_8_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_6_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_4_onSubJobError(Exception exception, String errorComponent,
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

	public void tDBRow_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_8_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_8");
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
				 * [tDBRow_8 begin ] start
				 */

				ok_Hash.put("tDBRow_8", false);
				start_Hash.put("tDBRow_8", System.currentTimeMillis());

				currentComponent = "tDBRow_8";

				int tos_count_tDBRow_8 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_8", "tDBRow_8", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_8 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_8 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_8 = (String) (restRequest_tDBRow_8 != null
						? restRequest_tDBRow_8.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_8 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_8 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_8 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_8 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_8
						.createRuntimeProperties();
				props_tDBRow_8.setValue("query",
						"DELETE from TRANSFER_DETAIL_TRFDTL\nWHERE LOAD_DATE = CURRENT_DATE()  - 1");

				props_tDBRow_8.setValue("dieOnError", true);

				props_tDBRow_8.setValue("usePreparedStatement", false);

				props_tDBRow_8.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_8_1_fisrt {

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

				SchemaSettingTool_tDBRow_8_1_fisrt sst_tDBRow_8_1_fisrt = new SchemaSettingTool_tDBRow_8_1_fisrt();

				props_tDBRow_8.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_8_2_fisrt {

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

				SchemaSettingTool_tDBRow_8_2_fisrt sst_tDBRow_8_2_fisrt = new SchemaSettingTool_tDBRow_8_2_fisrt();

				props_tDBRow_8.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_2_fisrt.getSchemaValue()));

				props_tDBRow_8.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_8.connection.setValue("useCustomRegion", false);

				props_tDBRow_8.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_8.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_8.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_8.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_8.table.setValue("tableName", "");

				props_tDBRow_8.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_8.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_8.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_8.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_8.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_8.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_8_3_fisrt {

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

				SchemaSettingTool_tDBRow_8_3_fisrt sst_tDBRow_8_3_fisrt = new SchemaSettingTool_tDBRow_8_3_fisrt();

				props_tDBRow_8.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_8.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_8 = props_tDBRow_8.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_8 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_8 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_8 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_8.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_8);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_8.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_8 = props_tDBRow_8.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_8 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_8 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_8 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_8.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_8);
					}
				}
				globalMap.put("tDBRow_8_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_8);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_8 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_8_MAPPINGS_URL", mappings_url_tDBRow_8);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_8 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_8";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_8 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_8 = null;
				topology_tDBRow_8 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_8 = def_tDBRow_8.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_8,
						topology_tDBRow_8);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_8 = def_tDBRow_8
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_8 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_8.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_8 = componentRuntime_tDBRow_8
						.initialize(container_tDBRow_8, props_tDBRow_8);

				if (initVr_tDBRow_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_8.getMessage());
				}

				if (componentRuntime_tDBRow_8 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_8 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_8;
					compDriverInitialization_tDBRow_8.runAtDriver(container_tDBRow_8);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_8 = null;
				if (componentRuntime_tDBRow_8 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_8 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_8;
					if (doesNodeBelongToRequest_tDBRow_8) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_8 = sourceOrSink_tDBRow_8
								.validate(container_tDBRow_8);
						if (vr_tDBRow_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_8.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_8 begin ] stop
				 */

				/**
				 * [tDBRow_8 main ] start
				 */

				currentComponent = "tDBRow_8";

				tos_count_tDBRow_8++;

				/**
				 * [tDBRow_8 main ] stop
				 */

				/**
				 * [tDBRow_8 process_data_begin ] start
				 */

				currentComponent = "tDBRow_8";

				/**
				 * [tDBRow_8 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_8 process_data_end ] start
				 */

				currentComponent = "tDBRow_8";

				/**
				 * [tDBRow_8 process_data_end ] stop
				 */

				/**
				 * [tDBRow_8 end ] start
				 */

				currentComponent = "tDBRow_8";

// end of generic

				resourceMap.put("finish_tDBRow_8", Boolean.TRUE);

				ok_Hash.put("tDBRow_8", true);
				end_Hash.put("tDBRow_8", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tDBInput_6Process(globalMap);

				/**
				 * [tDBRow_8 end ] stop
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
				 * [tDBRow_8 finally ] start
				 */

				currentComponent = "tDBRow_8";

// finally of generic

				if (resourceMap.get("finish_tDBRow_8") == null) {
				}

				/**
				 * [tDBRow_8 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_8_SUBPROCESS_STATE", 1);
	}

	public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];

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

		public float ASNUM;

		public float getASNUM() {
			return this.ASNUM;
		}

		public Boolean ASNUMIsNullable() {
			return false;
		}

		public Boolean ASNUMIsKey() {
			return false;
		}

		public Integer ASNUMLength() {
			return 6;
		}

		public Integer ASNUMPrecision() {
			return 0;
		}

		public String ASNUMDefault() {

			return "";

		}

		public String ASNUMComment() {

			return "";

		}

		public String ASNUMPattern() {

			return "";

		}

		public String ASNUMOriginalDbColumnName() {

			return "ASNUM";

		}

		public float IDEPT;

		public float getIDEPT() {
			return this.IDEPT;
		}

		public Boolean IDEPTIsNullable() {
			return false;
		}

		public Boolean IDEPTIsKey() {
			return false;
		}

		public Integer IDEPTLength() {
			return 3;
		}

		public Integer IDEPTPrecision() {
			return 0;
		}

		public String IDEPTDefault() {

			return "";

		}

		public String IDEPTComment() {

			return "";

		}

		public String IDEPTPattern() {

			return "";

		}

		public String IDEPTOriginalDbColumnName() {

			return "IDEPT";

		}

		public float ISDEPT;

		public float getISDEPT() {
			return this.ISDEPT;
		}

		public Boolean ISDEPTIsNullable() {
			return false;
		}

		public Boolean ISDEPTIsKey() {
			return false;
		}

		public Integer ISDEPTLength() {
			return 3;
		}

		public Integer ISDEPTPrecision() {
			return 0;
		}

		public String ISDEPTDefault() {

			return "";

		}

		public String ISDEPTComment() {

			return "";

		}

		public String ISDEPTPattern() {

			return "";

		}

		public String ISDEPTOriginalDbColumnName() {

			return "ISDEPT";

		}

		public float ICLAS;

		public float getICLAS() {
			return this.ICLAS;
		}

		public Boolean ICLASIsNullable() {
			return false;
		}

		public Boolean ICLASIsKey() {
			return false;
		}

		public Integer ICLASLength() {
			return 3;
		}

		public Integer ICLASPrecision() {
			return 0;
		}

		public String ICLASDefault() {

			return "";

		}

		public String ICLASComment() {

			return "";

		}

		public String ICLASPattern() {

			return "";

		}

		public String ICLASOriginalDbColumnName() {

			return "ICLAS";

		}

		public float ISCLAS;

		public float getISCLAS() {
			return this.ISCLAS;
		}

		public Boolean ISCLASIsNullable() {
			return false;
		}

		public Boolean ISCLASIsKey() {
			return false;
		}

		public Integer ISCLASLength() {
			return 3;
		}

		public Integer ISCLASPrecision() {
			return 0;
		}

		public String ISCLASDefault() {

			return "";

		}

		public String ISCLASComment() {

			return "";

		}

		public String ISCLASPattern() {

			return "";

		}

		public String ISCLASOriginalDbColumnName() {

			return "ISCLAS";

		}

		public BigDecimal TRFREQ;

		public BigDecimal getTRFREQ() {
			return this.TRFREQ;
		}

		public Boolean TRFREQIsNullable() {
			return false;
		}

		public Boolean TRFREQIsKey() {
			return false;
		}

		public Integer TRFREQLength() {
			return 9;
		}

		public Integer TRFREQPrecision() {
			return 2;
		}

		public String TRFREQDefault() {

			return "";

		}

		public String TRFREQComment() {

			return "";

		}

		public String TRFREQPattern() {

			return "";

		}

		public String TRFREQOriginalDbColumnName() {

			return "TRFREQ";

		}

		public BigDecimal TRFSHP;

		public BigDecimal getTRFSHP() {
			return this.TRFSHP;
		}

		public Boolean TRFSHPIsNullable() {
			return false;
		}

		public Boolean TRFSHPIsKey() {
			return false;
		}

		public Integer TRFSHPLength() {
			return 9;
		}

		public Integer TRFSHPPrecision() {
			return 2;
		}

		public String TRFSHPDefault() {

			return "";

		}

		public String TRFSHPComment() {

			return "";

		}

		public String TRFSHPPattern() {

			return "";

		}

		public String TRFSHPOriginalDbColumnName() {

			return "TRFSHP";

		}

		public BigDecimal TRFREC;

		public BigDecimal getTRFREC() {
			return this.TRFREC;
		}

		public Boolean TRFRECIsNullable() {
			return false;
		}

		public Boolean TRFRECIsKey() {
			return false;
		}

		public Integer TRFRECLength() {
			return 9;
		}

		public Integer TRFRECPrecision() {
			return 2;
		}

		public String TRFRECDefault() {

			return "";

		}

		public String TRFRECComment() {

			return "";

		}

		public String TRFRECPattern() {

			return "";

		}

		public String TRFRECOriginalDbColumnName() {

			return "TRFREC";

		}

		public BigDecimal TRFALC;

		public BigDecimal getTRFALC() {
			return this.TRFALC;
		}

		public Boolean TRFALCIsNullable() {
			return false;
		}

		public Boolean TRFALCIsKey() {
			return false;
		}

		public Integer TRFALCLength() {
			return 9;
		}

		public Integer TRFALCPrecision() {
			return 2;
		}

		public String TRFALCDefault() {

			return "";

		}

		public String TRFALCComment() {

			return "";

		}

		public String TRFALCPattern() {

			return "";

		}

		public String TRFALCOriginalDbColumnName() {

			return "TRFALC";

		}

		public BigDecimal TRFSUB;

		public BigDecimal getTRFSUB() {
			return this.TRFSUB;
		}

		public Boolean TRFSUBIsNullable() {
			return false;
		}

		public Boolean TRFSUBIsKey() {
			return false;
		}

		public Integer TRFSUBLength() {
			return 9;
		}

		public Integer TRFSUBPrecision() {
			return 0;
		}

		public String TRFSUBDefault() {

			return "";

		}

		public String TRFSUBComment() {

			return "";

		}

		public String TRFSUBPattern() {

			return "";

		}

		public String TRFSUBOriginalDbColumnName() {

			return "TRFSUB";

		}

		public String TRFSCD;

		public String getTRFSCD() {
			return this.TRFSCD;
		}

		public Boolean TRFSCDIsNullable() {
			return false;
		}

		public Boolean TRFSCDIsKey() {
			return false;
		}

		public Integer TRFSCDLength() {
			return 1;
		}

		public Integer TRFSCDPrecision() {
			return 0;
		}

		public String TRFSCDDefault() {

			return "";

		}

		public String TRFSCDComment() {

			return "";

		}

		public String TRFSCDPattern() {

			return "";

		}

		public String TRFSCDOriginalDbColumnName() {

			return "TRFSCD";

		}

		public String TRFRLC;

		public String getTRFRLC() {
			return this.TRFRLC;
		}

		public Boolean TRFRLCIsNullable() {
			return false;
		}

		public Boolean TRFRLCIsKey() {
			return false;
		}

		public Integer TRFRLCLength() {
			return 8;
		}

		public Integer TRFRLCPrecision() {
			return 0;
		}

		public String TRFRLCDefault() {

			return "";

		}

		public String TRFRLCComment() {

			return "";

		}

		public String TRFRLCPattern() {

			return "";

		}

		public String TRFRLCOriginalDbColumnName() {

			return "TRFRLC";

		}

		public BigDecimal TRFCST;

		public BigDecimal getTRFCST() {
			return this.TRFCST;
		}

		public Boolean TRFCSTIsNullable() {
			return false;
		}

		public Boolean TRFCSTIsKey() {
			return false;
		}

		public Integer TRFCSTLength() {
			return 9;
		}

		public Integer TRFCSTPrecision() {
			return 3;
		}

		public String TRFCSTDefault() {

			return "";

		}

		public String TRFCSTComment() {

			return "";

		}

		public String TRFCSTPattern() {

			return "";

		}

		public String TRFCSTOriginalDbColumnName() {

			return "TRFCST";

		}

		public BigDecimal TRFRIN;

		public BigDecimal getTRFRIN() {
			return this.TRFRIN;
		}

		public Boolean TRFRINIsNullable() {
			return false;
		}

		public Boolean TRFRINIsKey() {
			return false;
		}

		public Integer TRFRINLength() {
			return 9;
		}

		public Integer TRFRINPrecision() {
			return 2;
		}

		public String TRFRINDefault() {

			return "";

		}

		public String TRFRINComment() {

			return "";

		}

		public String TRFRINPattern() {

			return "";

		}

		public String TRFRINOriginalDbColumnName() {

			return "TRFRIN";

		}

		public BigDecimal TRFROU;

		public BigDecimal getTRFROU() {
			return this.TRFROU;
		}

		public Boolean TRFROUIsNullable() {
			return false;
		}

		public Boolean TRFROUIsKey() {
			return false;
		}

		public Integer TRFROULength() {
			return 9;
		}

		public Integer TRFROUPrecision() {
			return 2;
		}

		public String TRFROUDefault() {

			return "";

		}

		public String TRFROUComment() {

			return "";

		}

		public String TRFROUPattern() {

			return "";

		}

		public String TRFROUOriginalDbColumnName() {

			return "TRFROU";

		}

		public BigDecimal ICUBE;

		public BigDecimal getICUBE() {
			return this.ICUBE;
		}

		public Boolean ICUBEIsNullable() {
			return false;
		}

		public Boolean ICUBEIsKey() {
			return false;
		}

		public Integer ICUBELength() {
			return 9;
		}

		public Integer ICUBEPrecision() {
			return 3;
		}

		public String ICUBEDefault() {

			return "";

		}

		public String ICUBEComment() {

			return "";

		}

		public String ICUBEPattern() {

			return "";

		}

		public String ICUBEOriginalDbColumnName() {

			return "ICUBE";

		}

		public String IVNDPN;

		public String getIVNDPN() {
			return this.IVNDPN;
		}

		public Boolean IVNDPNIsNullable() {
			return false;
		}

		public Boolean IVNDPNIsKey() {
			return false;
		}

		public Integer IVNDPNLength() {
			return 15;
		}

		public Integer IVNDPNPrecision() {
			return 0;
		}

		public String IVNDPNDefault() {

			return null;

		}

		public String IVNDPNComment() {

			return "";

		}

		public String IVNDPNPattern() {

			return "";

		}

		public String IVNDPNOriginalDbColumnName() {

			return "IVNDPN";

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

		public BigDecimal TDCYCL;

		public BigDecimal getTDCYCL() {
			return this.TDCYCL;
		}

		public Boolean TDCYCLIsNullable() {
			return false;
		}

		public Boolean TDCYCLIsKey() {
			return false;
		}

		public Integer TDCYCLLength() {
			return 5;
		}

		public Integer TDCYCLPrecision() {
			return 0;
		}

		public String TDCYCLDefault() {

			return "";

		}

		public String TDCYCLComment() {

			return "";

		}

		public String TDCYCLPattern() {

			return "";

		}

		public String TDCYCLOriginalDbColumnName() {

			return "TDCYCL";

		}

		public float TDSCWV;

		public float getTDSCWV() {
			return this.TDSCWV;
		}

		public Boolean TDSCWVIsNullable() {
			return false;
		}

		public Boolean TDSCWVIsKey() {
			return false;
		}

		public Integer TDSCWVLength() {
			return 2;
		}

		public Integer TDSCWVPrecision() {
			return 0;
		}

		public String TDSCWVDefault() {

			return "";

		}

		public String TDSCWVComment() {

			return "";

		}

		public String TDSCWVPattern() {

			return "";

		}

		public String TDSCWVOriginalDbColumnName() {

			return "TDSCWV";

		}

		public float TDSCSQ;

		public float getTDSCSQ() {
			return this.TDSCSQ;
		}

		public Boolean TDSCSQIsNullable() {
			return false;
		}

		public Boolean TDSCSQIsKey() {
			return false;
		}

		public Integer TDSCSQLength() {
			return 3;
		}

		public Integer TDSCSQPrecision() {
			return 0;
		}

		public String TDSCSQDefault() {

			return "";

		}

		public String TDSCSQComment() {

			return "";

		}

		public String TDSCSQPattern() {

			return "";

		}

		public String TDSCSQOriginalDbColumnName() {

			return "TDSCSQ";

		}

		public String TDSCNM;

		public String getTDSCNM() {
			return this.TDSCNM;
		}

		public Boolean TDSCNMIsNullable() {
			return false;
		}

		public Boolean TDSCNMIsKey() {
			return false;
		}

		public Integer TDSCNMLength() {
			return 8;
		}

		public Integer TDSCNMPrecision() {
			return 0;
		}

		public String TDSCNMDefault() {

			return null;

		}

		public String TDSCNMComment() {

			return "";

		}

		public String TDSCNMPattern() {

			return "";

		}

		public String TDSCNMOriginalDbColumnName() {

			return "TDSCNM";

		}

		public float TRSVND;

		public float getTRSVND() {
			return this.TRSVND;
		}

		public Boolean TRSVNDIsNullable() {
			return false;
		}

		public Boolean TRSVNDIsKey() {
			return false;
		}

		public Integer TRSVNDLength() {
			return 6;
		}

		public Integer TRSVNDPrecision() {
			return 0;
		}

		public String TRSVNDDefault() {

			return "";

		}

		public String TRSVNDComment() {

			return "";

		}

		public String TRSVNDPattern() {

			return "";

		}

		public String TRSVNDOriginalDbColumnName() {

			return "TRSVND";

		}

		public String TRSTYL;

		public String getTRSTYL() {
			return this.TRSTYL;
		}

		public Boolean TRSTYLIsNullable() {
			return false;
		}

		public Boolean TRSTYLIsKey() {
			return false;
		}

		public Integer TRSTYLLength() {
			return 15;
		}

		public Integer TRSTYLPrecision() {
			return 0;
		}

		public String TRSTYLDefault() {

			return null;

		}

		public String TRSTYLComment() {

			return "";

		}

		public String TRSTYLPattern() {

			return "";

		}

		public String TRSTYLOriginalDbColumnName() {

			return "TRSTYL";

		}

		public float TRSCOL;

		public float getTRSCOL() {
			return this.TRSCOL;
		}

		public Boolean TRSCOLIsNullable() {
			return false;
		}

		public Boolean TRSCOLIsKey() {
			return false;
		}

		public Integer TRSCOLLength() {
			return 4;
		}

		public Integer TRSCOLPrecision() {
			return 0;
		}

		public String TRSCOLDefault() {

			return "";

		}

		public String TRSCOLComment() {

			return "";

		}

		public String TRSCOLPattern() {

			return "";

		}

		public String TRSCOLOriginalDbColumnName() {

			return "TRSCOL";

		}

		public String TRSSIZ;

		public String getTRSSIZ() {
			return this.TRSSIZ;
		}

		public Boolean TRSSIZIsNullable() {
			return false;
		}

		public Boolean TRSSIZIsKey() {
			return false;
		}

		public Integer TRSSIZLength() {
			return 4;
		}

		public Integer TRSSIZPrecision() {
			return 0;
		}

		public String TRSSIZDefault() {

			return null;

		}

		public String TRSSIZComment() {

			return "";

		}

		public String TRSSIZPattern() {

			return "";

		}

		public String TRSSIZOriginalDbColumnName() {

			return "TRSSIZ";

		}

		public String TRSDIM;

		public String getTRSDIM() {
			return this.TRSDIM;
		}

		public Boolean TRSDIMIsNullable() {
			return false;
		}

		public Boolean TRSDIMIsKey() {
			return false;
		}

		public Integer TRSDIMLength() {
			return 4;
		}

		public Integer TRSDIMPrecision() {
			return 0;
		}

		public String TRSDIMDefault() {

			return null;

		}

		public String TRSDIMComment() {

			return "";

		}

		public String TRSDIMPattern() {

			return "";

		}

		public String TRSDIMOriginalDbColumnName() {

			return "TRSDIM";

		}

		public String TRFDSP;

		public String getTRFDSP() {
			return this.TRFDSP;
		}

		public Boolean TRFDSPIsNullable() {
			return false;
		}

		public Boolean TRFDSPIsKey() {
			return false;
		}

		public Integer TRFDSPLength() {
			return 1;
		}

		public Integer TRFDSPPrecision() {
			return 0;
		}

		public String TRFDSPDefault() {

			return null;

		}

		public String TRFDSPComment() {

			return "";

		}

		public String TRFDSPPattern() {

			return "";

		}

		public String TRFDSPOriginalDbColumnName() {

			return "TRFDSP";

		}

		public BigDecimal TDSCQT;

		public BigDecimal getTDSCQT() {
			return this.TDSCQT;
		}

		public Boolean TDSCQTIsNullable() {
			return false;
		}

		public Boolean TDSCQTIsKey() {
			return false;
		}

		public Integer TDSCQTLength() {
			return 9;
		}

		public Integer TDSCQTPrecision() {
			return 2;
		}

		public String TDSCQTDefault() {

			return "";

		}

		public String TDSCQTComment() {

			return "";

		}

		public String TDSCQTPattern() {

			return "";

		}

		public String TDSCQTOriginalDbColumnName() {

			return "TDSCQT";

		}

		public BigDecimal TDRCQT;

		public BigDecimal getTDRCQT() {
			return this.TDRCQT;
		}

		public Boolean TDRCQTIsNullable() {
			return false;
		}

		public Boolean TDRCQTIsKey() {
			return false;
		}

		public Integer TDRCQTLength() {
			return 9;
		}

		public Integer TDRCQTPrecision() {
			return 2;
		}

		public String TDRCQTDefault() {

			return "";

		}

		public String TDRCQTComment() {

			return "";

		}

		public String TDRCQTPattern() {

			return "";

		}

		public String TDRCQTOriginalDbColumnName() {

			return "TDRCQT";

		}

		public BigDecimal TDWGHT;

		public BigDecimal getTDWGHT() {
			return this.TDWGHT;
		}

		public Boolean TDWGHTIsNullable() {
			return false;
		}

		public Boolean TDWGHTIsKey() {
			return false;
		}

		public Integer TDWGHTLength() {
			return 7;
		}

		public Integer TDWGHTPrecision() {
			return 3;
		}

		public String TDWGHTDefault() {

			return "";

		}

		public String TDWGHTComment() {

			return "";

		}

		public String TDWGHTPattern() {

			return "";

		}

		public String TDWGHTOriginalDbColumnName() {

			return "TDWGHT";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					this.ASNUM = dis.readFloat();

					this.IDEPT = dis.readFloat();

					this.ISDEPT = dis.readFloat();

					this.ICLAS = dis.readFloat();

					this.ISCLAS = dis.readFloat();

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					this.TDSCWV = dis.readFloat();

					this.TDSCSQ = dis.readFloat();

					this.TDSCNM = readString(dis);

					this.TRSVND = dis.readFloat();

					this.TRSTYL = readString(dis);

					this.TRSCOL = dis.readFloat();

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					this.ASNUM = dis.readFloat();

					this.IDEPT = dis.readFloat();

					this.ISDEPT = dis.readFloat();

					this.ICLAS = dis.readFloat();

					this.ISCLAS = dis.readFloat();

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					this.TDSCWV = dis.readFloat();

					this.TDSCSQ = dis.readFloat();

					this.TDSCNM = readString(dis);

					this.TRSVND = dis.readFloat();

					this.TRSTYL = readString(dis);

					this.TRSCOL = dis.readFloat();

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

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

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// float

				dos.writeFloat(this.ASNUM);

				// float

				dos.writeFloat(this.IDEPT);

				// float

				dos.writeFloat(this.ISDEPT);

				// float

				dos.writeFloat(this.ICLAS);

				// float

				dos.writeFloat(this.ISCLAS);

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// float

				dos.writeFloat(this.TDSCWV);

				// float

				dos.writeFloat(this.TDSCSQ);

				// String

				writeString(this.TDSCNM, dos);

				// float

				dos.writeFloat(this.TRSVND);

				// String

				writeString(this.TRSTYL, dos);

				// float

				dos.writeFloat(this.TRSCOL);

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// float

				dos.writeFloat(this.ASNUM);

				// float

				dos.writeFloat(this.IDEPT);

				// float

				dos.writeFloat(this.ISDEPT);

				// float

				dos.writeFloat(this.ICLAS);

				// float

				dos.writeFloat(this.ISCLAS);

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// float

				dos.writeFloat(this.TDSCWV);

				// float

				dos.writeFloat(this.TDSCSQ);

				// String

				writeString(this.TDSCNM, dos);

				// float

				dos.writeFloat(this.TRSVND);

				// String

				writeString(this.TRSTYL, dos);

				// float

				dos.writeFloat(this.TRSCOL);

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRFBCH=" + TRFBCH);
			sb.append(",TRFFLC=" + String.valueOf(TRFFLC));
			sb.append(",TRFTLC=" + String.valueOf(TRFTLC));
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ASNUM=" + String.valueOf(ASNUM));
			sb.append(",IDEPT=" + String.valueOf(IDEPT));
			sb.append(",ISDEPT=" + String.valueOf(ISDEPT));
			sb.append(",ICLAS=" + String.valueOf(ICLAS));
			sb.append(",ISCLAS=" + String.valueOf(ISCLAS));
			sb.append(",TRFREQ=" + String.valueOf(TRFREQ));
			sb.append(",TRFSHP=" + String.valueOf(TRFSHP));
			sb.append(",TRFREC=" + String.valueOf(TRFREC));
			sb.append(",TRFALC=" + String.valueOf(TRFALC));
			sb.append(",TRFSUB=" + String.valueOf(TRFSUB));
			sb.append(",TRFSCD=" + TRFSCD);
			sb.append(",TRFRLC=" + TRFRLC);
			sb.append(",TRFCST=" + String.valueOf(TRFCST));
			sb.append(",TRFRIN=" + String.valueOf(TRFRIN));
			sb.append(",TRFROU=" + String.valueOf(TRFROU));
			sb.append(",ICUBE=" + String.valueOf(ICUBE));
			sb.append(",IVNDPN=" + IVNDPN);
			sb.append(",TRFSTS=" + TRFSTS);
			sb.append(",TRFTYP=" + TRFTYP);
			sb.append(",TRFPTY=" + TRFPTY);
			sb.append(",TDCYCL=" + String.valueOf(TDCYCL));
			sb.append(",TDSCWV=" + String.valueOf(TDSCWV));
			sb.append(",TDSCSQ=" + String.valueOf(TDSCSQ));
			sb.append(",TDSCNM=" + TDSCNM);
			sb.append(",TRSVND=" + String.valueOf(TRSVND));
			sb.append(",TRSTYL=" + TRSTYL);
			sb.append(",TRSCOL=" + String.valueOf(TRSCOL));
			sb.append(",TRSSIZ=" + TRSSIZ);
			sb.append(",TRSDIM=" + TRSDIM);
			sb.append(",TRFDSP=" + TRFDSP);
			sb.append(",TDSCQT=" + String.valueOf(TDSCQT));
			sb.append(",TDRCQT=" + String.valueOf(TDRCQT));
			sb.append(",TDWGHT=" + String.valueOf(TDWGHT));
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

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			sb.append(ASNUM);

			sb.append("|");

			sb.append(IDEPT);

			sb.append("|");

			sb.append(ISDEPT);

			sb.append("|");

			sb.append(ICLAS);

			sb.append("|");

			sb.append(ISCLAS);

			sb.append("|");

			if (TRFREQ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREQ);
			}

			sb.append("|");

			if (TRFSHP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSHP);
			}

			sb.append("|");

			if (TRFREC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREC);
			}

			sb.append("|");

			if (TRFALC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFALC);
			}

			sb.append("|");

			if (TRFSUB == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSUB);
			}

			sb.append("|");

			if (TRFSCD == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSCD);
			}

			sb.append("|");

			if (TRFRLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRLC);
			}

			sb.append("|");

			if (TRFCST == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFCST);
			}

			sb.append("|");

			if (TRFRIN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRIN);
			}

			sb.append("|");

			if (TRFROU == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFROU);
			}

			sb.append("|");

			if (ICUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(ICUBE);
			}

			sb.append("|");

			if (IVNDPN == null) {
				sb.append("<null>");
			} else {
				sb.append(IVNDPN);
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

			if (TDCYCL == null) {
				sb.append("<null>");
			} else {
				sb.append(TDCYCL);
			}

			sb.append("|");

			sb.append(TDSCWV);

			sb.append("|");

			sb.append(TDSCSQ);

			sb.append("|");

			if (TDSCNM == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCNM);
			}

			sb.append("|");

			sb.append(TRSVND);

			sb.append("|");

			if (TRSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSTYL);
			}

			sb.append("|");

			sb.append(TRSCOL);

			sb.append("|");

			if (TRSSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSSIZ);
			}

			sb.append("|");

			if (TRSDIM == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSDIM);
			}

			sb.append("|");

			if (TRFDSP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFDSP);
			}

			sb.append("|");

			if (TDSCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCQT);
			}

			sb.append("|");

			if (TDRCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDRCQT);
			}

			sb.append("|");

			if (TDWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDWGHT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row11Struct other) {

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

	public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_6");
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

				row11Struct row11 = new row11Struct();

				/**
				 * [tFileOutputDelimited_6 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_6", false);
				start_Hash.put("tFileOutputDelimited_6", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_6";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row11");

				int tos_count_tFileOutputDelimited_6 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_6 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_6 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_6 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_6.append("Parameters:");
							log4jParamters_tFileOutputDelimited_6.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/TRFDTL.csv\"");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							log4jParamters_tFileOutputDelimited_6.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_6.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_6 - " + (log4jParamters_tFileOutputDelimited_6));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_6().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_6", "tFileOutputDelimited_6", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_6 = "";
				fileName_tFileOutputDelimited_6 = (new java.io.File("/data/talend/data_repository/TRFDTL.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_6 = null;
				String extension_tFileOutputDelimited_6 = null;
				String directory_tFileOutputDelimited_6 = null;
				if ((fileName_tFileOutputDelimited_6.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_6.lastIndexOf(".") < fileName_tFileOutputDelimited_6
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6;
						extension_tFileOutputDelimited_6 = "";
					} else {
						fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0,
								fileName_tFileOutputDelimited_6.lastIndexOf("."));
						extension_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6
								.substring(fileName_tFileOutputDelimited_6.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0,
							fileName_tFileOutputDelimited_6.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_6.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0,
								fileName_tFileOutputDelimited_6.lastIndexOf("."));
						extension_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6
								.substring(fileName_tFileOutputDelimited_6.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6;
						extension_tFileOutputDelimited_6 = "";
					}
					directory_tFileOutputDelimited_6 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_6 = true;
				java.io.File filetFileOutputDelimited_6 = new java.io.File(fileName_tFileOutputDelimited_6);
				globalMap.put("tFileOutputDelimited_6_FILE_NAME", fileName_tFileOutputDelimited_6);
				int nb_line_tFileOutputDelimited_6 = 0;
				int splitedFileNo_tFileOutputDelimited_6 = 0;
				int currentRow_tFileOutputDelimited_6 = 0;

				final String OUT_DELIM_tFileOutputDelimited_6 = /** Start field tFileOutputDelimited_6:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_6:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_6 = /**
																		 * Start field
																		 * tFileOutputDelimited_6:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_6:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_6 != null && directory_tFileOutputDelimited_6.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_6 = new java.io.File(directory_tFileOutputDelimited_6);
					if (!dir_tFileOutputDelimited_6.exists()) {
						log.info("tFileOutputDelimited_6 - Creating directory '"
								+ dir_tFileOutputDelimited_6.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_6.mkdirs();
						log.info("tFileOutputDelimited_6 - The directory '"
								+ dir_tFileOutputDelimited_6.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_6 = new java.io.File(fileName_tFileOutputDelimited_6);
				String zipName_tFileOutputDelimited_6 = fullName_tFileOutputDelimited_6 + ".zip";
				java.io.File file_tFileOutputDelimited_6 = new java.io.File(zipName_tFileOutputDelimited_6);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_6 = null;
				java.io.Writer outtFileOutputDelimited_6 = null;

				if (file_tFileOutputDelimited_6.exists()) {
					file_tFileOutputDelimited_6.delete();
				}
				zipOut_tFileOutputDelimited_6 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_6)));
				zipOut_tFileOutputDelimited_6
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_6.getName()));
				outtFileOutputDelimited_6 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_6, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_6", outtFileOutputDelimited_6);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_6.length() == 0) {
						outtFileOutputDelimited_6.write("TRFBCH");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFFLC");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFTLC");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("INUMBR");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("ASNUM");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("IDEPT");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("ISDEPT");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("ICLAS");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("ISCLAS");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFREQ");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFSHP");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFREC");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFALC");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFSUB");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFSCD");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFRLC");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFCST");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFRIN");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFROU");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("ICUBE");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("IVNDPN");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFSTS");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFTYP");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFPTY");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDCYCL");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDSCWV");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDSCSQ");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDSCNM");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRSVND");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRSTYL");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRSCOL");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRSSIZ");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRSDIM");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TRFDSP");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDSCQT");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDRCQT");
						outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.write("TDWGHT");
						outtFileOutputDelimited_6.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_6);
						outtFileOutputDelimited_6.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_6", nb_line_tFileOutputDelimited_6);

				/**
				 * [tFileOutputDelimited_6 begin ] stop
				 */

				/**
				 * [tDBInput_6 begin ] start
				 */

				ok_Hash.put("tDBInput_6", false);
				start_Hash.put("tDBInput_6", System.currentTimeMillis());

				currentComponent = "tDBInput_6";

				int tos_count_tDBInput_6 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_6 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_6 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_6 = new StringBuilder();
							log4jParamters_tDBInput_6.append("Parameters:");
							log4jParamters_tDBInput_6.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("QUERY" + " = "
									+ "\"  select * from TRFDTL where TRFBCH in   (  select TRFBCH from MM4R5LIB.TRFHDR  where TRFIDT between (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP - 6 MONTHS, 'YYMMDD')) and (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP, 'YYMMDD'))  )    \"");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBCH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFFLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTLC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ASNUM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IDEPT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ISDEPT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ICLAS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ISCLAS") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFREQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFSHP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFREC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFALC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFSUB") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFSCD") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFRLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFCST") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFROU") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ICUBE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IVNDPN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSTS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTYP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TDCYCL") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TDSCWV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TDSCSQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TDSCNM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRSVND") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRSTYL") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRSCOL") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRSSIZ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRSDIM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFDSP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TDSCQT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TDRCQT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TDWGHT") + "}]");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_6.append(" | ");
							log4jParamters_tDBInput_6.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_6.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_6 - " + (log4jParamters_tDBInput_6));
						}
					}
					new BytesLimit65535_tDBInput_6().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_6", "tDBInput_6", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_6 = 0;
				java.sql.Connection conn_tDBInput_6 = null;
				String driverClass_tDBInput_6 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_6 = java.lang.Class.forName(driverClass_tDBInput_6);
				String dbUser_tDBInput_6 = context.jda_user_name;

				final String decryptedPassword_tDBInput_6 = context.jda_password;

				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;

				String url_tDBInput_6 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_6 - Driver ClassName: " + driverClass_tDBInput_6 + ".");

				log.debug("tDBInput_6 - Connection attempt to '" + url_tDBInput_6 + "' with the username '"
						+ dbUser_tDBInput_6 + "'.");

				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6, dbUser_tDBInput_6,
						dbPwd_tDBInput_6);
				log.debug("tDBInput_6 - Connection to '" + url_tDBInput_6 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

				String dbquery_tDBInput_6 = "\nselect * from TRFDTL where TRFBCH in \n(\nselect TRFBCH from MM4R5LIB.TRFHDR\nwhere TRFIDT between (VALUES  VARCHAR_F"
						+ "ORMAT(CURRENT TIMESTAMP - 6 MONTHS, 'YYMMDD')) and (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP, 'YYMMDD'))\n)\n\n";

				log.debug("tDBInput_6 - Executing the query: '" + dbquery_tDBInput_6 + "'.");

				globalMap.put("tDBInput_6_QUERY", dbquery_tDBInput_6);
				java.sql.ResultSet rs_tDBInput_6 = null;

				try {
					rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
					java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
					int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

					String tmpContent_tDBInput_6 = null;

					log.debug("tDBInput_6 - Retrieving records from the database.");

					while (rs_tDBInput_6.next()) {
						nb_line_tDBInput_6++;

						if (colQtyInRs_tDBInput_6 < 1) {
							row11.TRFBCH = null;
						} else {

							row11.TRFBCH = routines.system.JDBCUtil.getString(rs_tDBInput_6, 1, false);
						}
						if (colQtyInRs_tDBInput_6 < 2) {
							row11.TRFFLC = null;
						} else {

							row11.TRFFLC = rs_tDBInput_6.getBigDecimal(2);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 3) {
							row11.TRFTLC = null;
						} else {

							row11.TRFTLC = rs_tDBInput_6.getBigDecimal(3);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 4) {
							row11.INUMBR = null;
						} else {

							row11.INUMBR = rs_tDBInput_6.getBigDecimal(4);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 5) {
							row11.ASNUM = 0;
						} else {

							row11.ASNUM = rs_tDBInput_6.getFloat(5);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 6) {
							row11.IDEPT = 0;
						} else {

							row11.IDEPT = rs_tDBInput_6.getFloat(6);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 7) {
							row11.ISDEPT = 0;
						} else {

							row11.ISDEPT = rs_tDBInput_6.getFloat(7);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 8) {
							row11.ICLAS = 0;
						} else {

							row11.ICLAS = rs_tDBInput_6.getFloat(8);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 9) {
							row11.ISCLAS = 0;
						} else {

							row11.ISCLAS = rs_tDBInput_6.getFloat(9);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 10) {
							row11.TRFREQ = null;
						} else {

							row11.TRFREQ = rs_tDBInput_6.getBigDecimal(10);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 11) {
							row11.TRFSHP = null;
						} else {

							row11.TRFSHP = rs_tDBInput_6.getBigDecimal(11);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 12) {
							row11.TRFREC = null;
						} else {

							row11.TRFREC = rs_tDBInput_6.getBigDecimal(12);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 13) {
							row11.TRFALC = null;
						} else {

							row11.TRFALC = rs_tDBInput_6.getBigDecimal(13);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 14) {
							row11.TRFSUB = null;
						} else {

							row11.TRFSUB = rs_tDBInput_6.getBigDecimal(14);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 15) {
							row11.TRFSCD = null;
						} else {

							row11.TRFSCD = routines.system.JDBCUtil.getString(rs_tDBInput_6, 15, false);
						}
						if (colQtyInRs_tDBInput_6 < 16) {
							row11.TRFRLC = null;
						} else {

							row11.TRFRLC = routines.system.JDBCUtil.getString(rs_tDBInput_6, 16, false);
						}
						if (colQtyInRs_tDBInput_6 < 17) {
							row11.TRFCST = null;
						} else {

							row11.TRFCST = rs_tDBInput_6.getBigDecimal(17);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 18) {
							row11.TRFRIN = null;
						} else {

							row11.TRFRIN = rs_tDBInput_6.getBigDecimal(18);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 19) {
							row11.TRFROU = null;
						} else {

							row11.TRFROU = rs_tDBInput_6.getBigDecimal(19);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 20) {
							row11.ICUBE = null;
						} else {

							row11.ICUBE = rs_tDBInput_6.getBigDecimal(20);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 21) {
							row11.IVNDPN = null;
						} else {

							row11.IVNDPN = routines.system.JDBCUtil.getString(rs_tDBInput_6, 21, false);
						}
						if (colQtyInRs_tDBInput_6 < 22) {
							row11.TRFSTS = null;
						} else {

							row11.TRFSTS = routines.system.JDBCUtil.getString(rs_tDBInput_6, 22, false);
						}
						if (colQtyInRs_tDBInput_6 < 23) {
							row11.TRFTYP = null;
						} else {

							row11.TRFTYP = routines.system.JDBCUtil.getString(rs_tDBInput_6, 23, false);
						}
						if (colQtyInRs_tDBInput_6 < 24) {
							row11.TRFPTY = null;
						} else {

							row11.TRFPTY = routines.system.JDBCUtil.getString(rs_tDBInput_6, 24, false);
						}
						if (colQtyInRs_tDBInput_6 < 25) {
							row11.TDCYCL = null;
						} else {

							row11.TDCYCL = rs_tDBInput_6.getBigDecimal(25);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 26) {
							row11.TDSCWV = 0;
						} else {

							row11.TDSCWV = rs_tDBInput_6.getFloat(26);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 27) {
							row11.TDSCSQ = 0;
						} else {

							row11.TDSCSQ = rs_tDBInput_6.getFloat(27);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 28) {
							row11.TDSCNM = null;
						} else {

							row11.TDSCNM = routines.system.JDBCUtil.getString(rs_tDBInput_6, 28, false);
						}
						if (colQtyInRs_tDBInput_6 < 29) {
							row11.TRSVND = 0;
						} else {

							row11.TRSVND = rs_tDBInput_6.getFloat(29);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 30) {
							row11.TRSTYL = null;
						} else {

							row11.TRSTYL = routines.system.JDBCUtil.getString(rs_tDBInput_6, 30, false);
						}
						if (colQtyInRs_tDBInput_6 < 31) {
							row11.TRSCOL = 0;
						} else {

							row11.TRSCOL = rs_tDBInput_6.getFloat(31);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 32) {
							row11.TRSSIZ = null;
						} else {

							row11.TRSSIZ = routines.system.JDBCUtil.getString(rs_tDBInput_6, 32, false);
						}
						if (colQtyInRs_tDBInput_6 < 33) {
							row11.TRSDIM = null;
						} else {

							row11.TRSDIM = routines.system.JDBCUtil.getString(rs_tDBInput_6, 33, false);
						}
						if (colQtyInRs_tDBInput_6 < 34) {
							row11.TRFDSP = null;
						} else {

							row11.TRFDSP = routines.system.JDBCUtil.getString(rs_tDBInput_6, 34, false);
						}
						if (colQtyInRs_tDBInput_6 < 35) {
							row11.TDSCQT = null;
						} else {

							row11.TDSCQT = rs_tDBInput_6.getBigDecimal(35);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 36) {
							row11.TDRCQT = null;
						} else {

							row11.TDRCQT = rs_tDBInput_6.getBigDecimal(36);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_6 < 37) {
							row11.TDWGHT = null;
						} else {

							row11.TDWGHT = rs_tDBInput_6.getBigDecimal(37);
							if (rs_tDBInput_6.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}

						log.debug("tDBInput_6 - Retrieving the record " + nb_line_tDBInput_6 + ".");

						/**
						 * [tDBInput_6 begin ] stop
						 */

						/**
						 * [tDBInput_6 main ] start
						 */

						currentComponent = "tDBInput_6";

						tos_count_tDBInput_6++;

						/**
						 * [tDBInput_6 main ] stop
						 */

						/**
						 * [tDBInput_6 process_data_begin ] start
						 */

						currentComponent = "tDBInput_6";

						/**
						 * [tDBInput_6 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_6 main ] start
						 */

						currentComponent = "tFileOutputDelimited_6";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row11", "tDBInput_6", "tDBInput_6", "tAS400Input", "tFileOutputDelimited_6",
								"tFileOutputDelimited_6", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row11 - " + (row11 == null ? "" : row11.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_6 = new StringBuilder();
						if (row11.TRFBCH != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFBCH);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFFLC != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFFLC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFTLC != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFTLC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.INUMBR != null) {
							sb_tFileOutputDelimited_6
									.append(row11.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.ASNUM);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.IDEPT);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.ISDEPT);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.ICLAS);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.ISCLAS);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFREQ != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFREQ.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFSHP != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFSHP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFREC != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFREC.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFALC != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFALC.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFSUB != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFSUB.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFSCD != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFSCD);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFRLC != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFRLC);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFCST != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFCST.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFRIN != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFRIN.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFROU != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TRFROU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.ICUBE != null) {
							sb_tFileOutputDelimited_6
									.append(row11.ICUBE.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.IVNDPN != null) {
							sb_tFileOutputDelimited_6.append(row11.IVNDPN);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFSTS != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFSTS);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFTYP != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFTYP);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFPTY != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFPTY);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TDCYCL != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TDCYCL.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.TDSCWV);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.TDSCSQ);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TDSCNM != null) {
							sb_tFileOutputDelimited_6.append(row11.TDSCNM);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.TRSVND);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRSTYL != null) {
							sb_tFileOutputDelimited_6.append(row11.TRSTYL);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						sb_tFileOutputDelimited_6.append(row11.TRSCOL);
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRSSIZ != null) {
							sb_tFileOutputDelimited_6.append(row11.TRSSIZ);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRSDIM != null) {
							sb_tFileOutputDelimited_6.append(row11.TRSDIM);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TRFDSP != null) {
							sb_tFileOutputDelimited_6.append(row11.TRFDSP);
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TDSCQT != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TDSCQT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TDRCQT != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TDRCQT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
						if (row11.TDWGHT != null) {
							sb_tFileOutputDelimited_6
									.append(row11.TDWGHT.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_6.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_6);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_6++;
							resourceMap.put("nb_line_tFileOutputDelimited_6", nb_line_tFileOutputDelimited_6);

							outtFileOutputDelimited_6.write(sb_tFileOutputDelimited_6.toString());
							log.debug("tFileOutputDelimited_6 - Writing the record " + nb_line_tFileOutputDelimited_6
									+ ".");

						}

						tos_count_tFileOutputDelimited_6++;

						/**
						 * [tFileOutputDelimited_6 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_6 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_6";

						/**
						 * [tFileOutputDelimited_6 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_6 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_6";

						/**
						 * [tFileOutputDelimited_6 process_data_end ] stop
						 */

						/**
						 * [tDBInput_6 process_data_end ] start
						 */

						currentComponent = "tDBInput_6";

						/**
						 * [tDBInput_6 process_data_end ] stop
						 */

						/**
						 * [tDBInput_6 end ] start
						 */

						currentComponent = "tDBInput_6";

					}
				} finally {
					if (rs_tDBInput_6 != null) {
						rs_tDBInput_6.close();
					}
					if (stmt_tDBInput_6 != null) {
						stmt_tDBInput_6.close();
					}
					if (conn_tDBInput_6 != null && !conn_tDBInput_6.isClosed()) {

						log.debug("tDBInput_6 - Closing the connection to the database.");

						conn_tDBInput_6.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_6 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_6_NB_LINE", nb_line_tDBInput_6);
				log.debug("tDBInput_6 - Retrieved records count: " + nb_line_tDBInput_6 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_6 - " + ("Done."));

				ok_Hash.put("tDBInput_6", true);
				end_Hash.put("tDBInput_6", System.currentTimeMillis());

				/**
				 * [tDBInput_6 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_6 end ] start
				 */

				currentComponent = "tFileOutputDelimited_6";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_6 != null) {
						outtFileOutputDelimited_6.flush();
						outtFileOutputDelimited_6.close();
					}

					globalMap.put("tFileOutputDelimited_6_NB_LINE", nb_line_tFileOutputDelimited_6);
					globalMap.put("tFileOutputDelimited_6_FILE_NAME", fileName_tFileOutputDelimited_6);

				}

				resourceMap.put("finish_tFileOutputDelimited_6", true);

				log.debug("tFileOutputDelimited_6 - Written records count: " + nb_line_tFileOutputDelimited_6 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row11", 2, 0,
						"tDBInput_6", "tDBInput_6", "tAS400Input", "tFileOutputDelimited_6", "tFileOutputDelimited_6",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_6 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_6", true);
				end_Hash.put("tFileOutputDelimited_6", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_6 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_6:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk19", 0, "ok");
			}

			tFileInputDelimited_4Process(globalMap);

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
				 * [tDBInput_6 finally ] start
				 */

				currentComponent = "tDBInput_6";

				/**
				 * [tDBInput_6 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_6 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_6";

				if (resourceMap.get("finish_tFileOutputDelimited_6") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_6 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_6");
						if (outtFileOutputDelimited_6 != null) {
							outtFileOutputDelimited_6.flush();
							outtFileOutputDelimited_6.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_6 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}

	public static class TRFDTLStruct implements routines.system.IPersistableRow<TRFDTLStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];

		public String TRFBCH;

		public String getTRFBCH() {
			return this.TRFBCH;
		}

		public Boolean TRFBCHIsNullable() {
			return true;
		}

		public Boolean TRFBCHIsKey() {
			return false;
		}

		public Integer TRFBCHLength() {
			return null;
		}

		public Integer TRFBCHPrecision() {
			return null;
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

		public BigDecimal TRFFLC;

		public BigDecimal getTRFFLC() {
			return this.TRFFLC;
		}

		public Boolean TRFFLCIsNullable() {
			return true;
		}

		public Boolean TRFFLCIsKey() {
			return false;
		}

		public Integer TRFFLCLength() {
			return null;
		}

		public Integer TRFFLCPrecision() {
			return null;
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
			return true;
		}

		public Boolean TRFTLCIsKey() {
			return false;
		}

		public Integer TRFTLCLength() {
			return null;
		}

		public Integer TRFTLCPrecision() {
			return null;
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

		public Double ASNUM;

		public Double getASNUM() {
			return this.ASNUM;
		}

		public Boolean ASNUMIsNullable() {
			return true;
		}

		public Boolean ASNUMIsKey() {
			return false;
		}

		public Integer ASNUMLength() {
			return null;
		}

		public Integer ASNUMPrecision() {
			return null;
		}

		public String ASNUMDefault() {

			return "";

		}

		public String ASNUMComment() {

			return "";

		}

		public String ASNUMPattern() {

			return "";

		}

		public String ASNUMOriginalDbColumnName() {

			return "ASNUM";

		}

		public Double IDEPT;

		public Double getIDEPT() {
			return this.IDEPT;
		}

		public Boolean IDEPTIsNullable() {
			return true;
		}

		public Boolean IDEPTIsKey() {
			return false;
		}

		public Integer IDEPTLength() {
			return null;
		}

		public Integer IDEPTPrecision() {
			return null;
		}

		public String IDEPTDefault() {

			return "";

		}

		public String IDEPTComment() {

			return "";

		}

		public String IDEPTPattern() {

			return "";

		}

		public String IDEPTOriginalDbColumnName() {

			return "IDEPT";

		}

		public Double ISDEPT;

		public Double getISDEPT() {
			return this.ISDEPT;
		}

		public Boolean ISDEPTIsNullable() {
			return true;
		}

		public Boolean ISDEPTIsKey() {
			return false;
		}

		public Integer ISDEPTLength() {
			return null;
		}

		public Integer ISDEPTPrecision() {
			return null;
		}

		public String ISDEPTDefault() {

			return "";

		}

		public String ISDEPTComment() {

			return "";

		}

		public String ISDEPTPattern() {

			return "";

		}

		public String ISDEPTOriginalDbColumnName() {

			return "ISDEPT";

		}

		public Double ICLAS;

		public Double getICLAS() {
			return this.ICLAS;
		}

		public Boolean ICLASIsNullable() {
			return true;
		}

		public Boolean ICLASIsKey() {
			return false;
		}

		public Integer ICLASLength() {
			return null;
		}

		public Integer ICLASPrecision() {
			return null;
		}

		public String ICLASDefault() {

			return "";

		}

		public String ICLASComment() {

			return "";

		}

		public String ICLASPattern() {

			return "";

		}

		public String ICLASOriginalDbColumnName() {

			return "ICLAS";

		}

		public Double ISCLAS;

		public Double getISCLAS() {
			return this.ISCLAS;
		}

		public Boolean ISCLASIsNullable() {
			return true;
		}

		public Boolean ISCLASIsKey() {
			return false;
		}

		public Integer ISCLASLength() {
			return null;
		}

		public Integer ISCLASPrecision() {
			return null;
		}

		public String ISCLASDefault() {

			return "";

		}

		public String ISCLASComment() {

			return "";

		}

		public String ISCLASPattern() {

			return "";

		}

		public String ISCLASOriginalDbColumnName() {

			return "ISCLAS";

		}

		public BigDecimal TRFREQ;

		public BigDecimal getTRFREQ() {
			return this.TRFREQ;
		}

		public Boolean TRFREQIsNullable() {
			return true;
		}

		public Boolean TRFREQIsKey() {
			return false;
		}

		public Integer TRFREQLength() {
			return null;
		}

		public Integer TRFREQPrecision() {
			return null;
		}

		public String TRFREQDefault() {

			return "";

		}

		public String TRFREQComment() {

			return "";

		}

		public String TRFREQPattern() {

			return "";

		}

		public String TRFREQOriginalDbColumnName() {

			return "TRFREQ";

		}

		public BigDecimal TRFSHP;

		public BigDecimal getTRFSHP() {
			return this.TRFSHP;
		}

		public Boolean TRFSHPIsNullable() {
			return true;
		}

		public Boolean TRFSHPIsKey() {
			return false;
		}

		public Integer TRFSHPLength() {
			return null;
		}

		public Integer TRFSHPPrecision() {
			return null;
		}

		public String TRFSHPDefault() {

			return "";

		}

		public String TRFSHPComment() {

			return "";

		}

		public String TRFSHPPattern() {

			return "";

		}

		public String TRFSHPOriginalDbColumnName() {

			return "TRFSHP";

		}

		public BigDecimal TRFREC;

		public BigDecimal getTRFREC() {
			return this.TRFREC;
		}

		public Boolean TRFRECIsNullable() {
			return true;
		}

		public Boolean TRFRECIsKey() {
			return false;
		}

		public Integer TRFRECLength() {
			return null;
		}

		public Integer TRFRECPrecision() {
			return null;
		}

		public String TRFRECDefault() {

			return "";

		}

		public String TRFRECComment() {

			return "";

		}

		public String TRFRECPattern() {

			return "";

		}

		public String TRFRECOriginalDbColumnName() {

			return "TRFREC";

		}

		public BigDecimal TRFALC;

		public BigDecimal getTRFALC() {
			return this.TRFALC;
		}

		public Boolean TRFALCIsNullable() {
			return true;
		}

		public Boolean TRFALCIsKey() {
			return false;
		}

		public Integer TRFALCLength() {
			return null;
		}

		public Integer TRFALCPrecision() {
			return null;
		}

		public String TRFALCDefault() {

			return "";

		}

		public String TRFALCComment() {

			return "";

		}

		public String TRFALCPattern() {

			return "";

		}

		public String TRFALCOriginalDbColumnName() {

			return "TRFALC";

		}

		public BigDecimal TRFSUB;

		public BigDecimal getTRFSUB() {
			return this.TRFSUB;
		}

		public Boolean TRFSUBIsNullable() {
			return true;
		}

		public Boolean TRFSUBIsKey() {
			return false;
		}

		public Integer TRFSUBLength() {
			return null;
		}

		public Integer TRFSUBPrecision() {
			return null;
		}

		public String TRFSUBDefault() {

			return "";

		}

		public String TRFSUBComment() {

			return "";

		}

		public String TRFSUBPattern() {

			return "";

		}

		public String TRFSUBOriginalDbColumnName() {

			return "TRFSUB";

		}

		public String TRFSCD;

		public String getTRFSCD() {
			return this.TRFSCD;
		}

		public Boolean TRFSCDIsNullable() {
			return true;
		}

		public Boolean TRFSCDIsKey() {
			return false;
		}

		public Integer TRFSCDLength() {
			return null;
		}

		public Integer TRFSCDPrecision() {
			return null;
		}

		public String TRFSCDDefault() {

			return "";

		}

		public String TRFSCDComment() {

			return "";

		}

		public String TRFSCDPattern() {

			return "";

		}

		public String TRFSCDOriginalDbColumnName() {

			return "TRFSCD";

		}

		public String TRFRLC;

		public String getTRFRLC() {
			return this.TRFRLC;
		}

		public Boolean TRFRLCIsNullable() {
			return true;
		}

		public Boolean TRFRLCIsKey() {
			return false;
		}

		public Integer TRFRLCLength() {
			return null;
		}

		public Integer TRFRLCPrecision() {
			return null;
		}

		public String TRFRLCDefault() {

			return "";

		}

		public String TRFRLCComment() {

			return "";

		}

		public String TRFRLCPattern() {

			return "";

		}

		public String TRFRLCOriginalDbColumnName() {

			return "TRFRLC";

		}

		public BigDecimal TRFCST;

		public BigDecimal getTRFCST() {
			return this.TRFCST;
		}

		public Boolean TRFCSTIsNullable() {
			return true;
		}

		public Boolean TRFCSTIsKey() {
			return false;
		}

		public Integer TRFCSTLength() {
			return null;
		}

		public Integer TRFCSTPrecision() {
			return null;
		}

		public String TRFCSTDefault() {

			return "";

		}

		public String TRFCSTComment() {

			return "";

		}

		public String TRFCSTPattern() {

			return "";

		}

		public String TRFCSTOriginalDbColumnName() {

			return "TRFCST";

		}

		public BigDecimal TRFRIN;

		public BigDecimal getTRFRIN() {
			return this.TRFRIN;
		}

		public Boolean TRFRINIsNullable() {
			return true;
		}

		public Boolean TRFRINIsKey() {
			return false;
		}

		public Integer TRFRINLength() {
			return null;
		}

		public Integer TRFRINPrecision() {
			return null;
		}

		public String TRFRINDefault() {

			return "";

		}

		public String TRFRINComment() {

			return "";

		}

		public String TRFRINPattern() {

			return "";

		}

		public String TRFRINOriginalDbColumnName() {

			return "TRFRIN";

		}

		public BigDecimal TRFROU;

		public BigDecimal getTRFROU() {
			return this.TRFROU;
		}

		public Boolean TRFROUIsNullable() {
			return true;
		}

		public Boolean TRFROUIsKey() {
			return false;
		}

		public Integer TRFROULength() {
			return null;
		}

		public Integer TRFROUPrecision() {
			return null;
		}

		public String TRFROUDefault() {

			return "";

		}

		public String TRFROUComment() {

			return "";

		}

		public String TRFROUPattern() {

			return "";

		}

		public String TRFROUOriginalDbColumnName() {

			return "TRFROU";

		}

		public BigDecimal ICUBE;

		public BigDecimal getICUBE() {
			return this.ICUBE;
		}

		public Boolean ICUBEIsNullable() {
			return true;
		}

		public Boolean ICUBEIsKey() {
			return false;
		}

		public Integer ICUBELength() {
			return null;
		}

		public Integer ICUBEPrecision() {
			return null;
		}

		public String ICUBEDefault() {

			return "";

		}

		public String ICUBEComment() {

			return "";

		}

		public String ICUBEPattern() {

			return "";

		}

		public String ICUBEOriginalDbColumnName() {

			return "ICUBE";

		}

		public String IVNDPN;

		public String getIVNDPN() {
			return this.IVNDPN;
		}

		public Boolean IVNDPNIsNullable() {
			return true;
		}

		public Boolean IVNDPNIsKey() {
			return false;
		}

		public Integer IVNDPNLength() {
			return null;
		}

		public Integer IVNDPNPrecision() {
			return null;
		}

		public String IVNDPNDefault() {

			return "";

		}

		public String IVNDPNComment() {

			return "";

		}

		public String IVNDPNPattern() {

			return "";

		}

		public String IVNDPNOriginalDbColumnName() {

			return "IVNDPN";

		}

		public String TRFSTS;

		public String getTRFSTS() {
			return this.TRFSTS;
		}

		public Boolean TRFSTSIsNullable() {
			return true;
		}

		public Boolean TRFSTSIsKey() {
			return false;
		}

		public Integer TRFSTSLength() {
			return null;
		}

		public Integer TRFSTSPrecision() {
			return null;
		}

		public String TRFSTSDefault() {

			return "";

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
			return true;
		}

		public Boolean TRFTYPIsKey() {
			return false;
		}

		public Integer TRFTYPLength() {
			return null;
		}

		public Integer TRFTYPPrecision() {
			return null;
		}

		public String TRFTYPDefault() {

			return "";

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
			return true;
		}

		public Boolean TRFPTYIsKey() {
			return false;
		}

		public Integer TRFPTYLength() {
			return null;
		}

		public Integer TRFPTYPrecision() {
			return null;
		}

		public String TRFPTYDefault() {

			return "";

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

		public BigDecimal TDCYCL;

		public BigDecimal getTDCYCL() {
			return this.TDCYCL;
		}

		public Boolean TDCYCLIsNullable() {
			return true;
		}

		public Boolean TDCYCLIsKey() {
			return false;
		}

		public Integer TDCYCLLength() {
			return null;
		}

		public Integer TDCYCLPrecision() {
			return null;
		}

		public String TDCYCLDefault() {

			return "";

		}

		public String TDCYCLComment() {

			return "";

		}

		public String TDCYCLPattern() {

			return "";

		}

		public String TDCYCLOriginalDbColumnName() {

			return "TDCYCL";

		}

		public Double TDSCWV;

		public Double getTDSCWV() {
			return this.TDSCWV;
		}

		public Boolean TDSCWVIsNullable() {
			return true;
		}

		public Boolean TDSCWVIsKey() {
			return false;
		}

		public Integer TDSCWVLength() {
			return null;
		}

		public Integer TDSCWVPrecision() {
			return null;
		}

		public String TDSCWVDefault() {

			return "";

		}

		public String TDSCWVComment() {

			return "";

		}

		public String TDSCWVPattern() {

			return "";

		}

		public String TDSCWVOriginalDbColumnName() {

			return "TDSCWV";

		}

		public Double TDSCSQ;

		public Double getTDSCSQ() {
			return this.TDSCSQ;
		}

		public Boolean TDSCSQIsNullable() {
			return true;
		}

		public Boolean TDSCSQIsKey() {
			return false;
		}

		public Integer TDSCSQLength() {
			return null;
		}

		public Integer TDSCSQPrecision() {
			return null;
		}

		public String TDSCSQDefault() {

			return "";

		}

		public String TDSCSQComment() {

			return "";

		}

		public String TDSCSQPattern() {

			return "";

		}

		public String TDSCSQOriginalDbColumnName() {

			return "TDSCSQ";

		}

		public String TDSCNM;

		public String getTDSCNM() {
			return this.TDSCNM;
		}

		public Boolean TDSCNMIsNullable() {
			return true;
		}

		public Boolean TDSCNMIsKey() {
			return false;
		}

		public Integer TDSCNMLength() {
			return null;
		}

		public Integer TDSCNMPrecision() {
			return null;
		}

		public String TDSCNMDefault() {

			return "";

		}

		public String TDSCNMComment() {

			return "";

		}

		public String TDSCNMPattern() {

			return "";

		}

		public String TDSCNMOriginalDbColumnName() {

			return "TDSCNM";

		}

		public Double TRSVND;

		public Double getTRSVND() {
			return this.TRSVND;
		}

		public Boolean TRSVNDIsNullable() {
			return true;
		}

		public Boolean TRSVNDIsKey() {
			return false;
		}

		public Integer TRSVNDLength() {
			return null;
		}

		public Integer TRSVNDPrecision() {
			return null;
		}

		public String TRSVNDDefault() {

			return "";

		}

		public String TRSVNDComment() {

			return "";

		}

		public String TRSVNDPattern() {

			return "";

		}

		public String TRSVNDOriginalDbColumnName() {

			return "TRSVND";

		}

		public String TRSTYL;

		public String getTRSTYL() {
			return this.TRSTYL;
		}

		public Boolean TRSTYLIsNullable() {
			return true;
		}

		public Boolean TRSTYLIsKey() {
			return false;
		}

		public Integer TRSTYLLength() {
			return null;
		}

		public Integer TRSTYLPrecision() {
			return null;
		}

		public String TRSTYLDefault() {

			return "";

		}

		public String TRSTYLComment() {

			return "";

		}

		public String TRSTYLPattern() {

			return "";

		}

		public String TRSTYLOriginalDbColumnName() {

			return "TRSTYL";

		}

		public Double TRSCOL;

		public Double getTRSCOL() {
			return this.TRSCOL;
		}

		public Boolean TRSCOLIsNullable() {
			return true;
		}

		public Boolean TRSCOLIsKey() {
			return false;
		}

		public Integer TRSCOLLength() {
			return null;
		}

		public Integer TRSCOLPrecision() {
			return null;
		}

		public String TRSCOLDefault() {

			return "";

		}

		public String TRSCOLComment() {

			return "";

		}

		public String TRSCOLPattern() {

			return "";

		}

		public String TRSCOLOriginalDbColumnName() {

			return "TRSCOL";

		}

		public String TRSSIZ;

		public String getTRSSIZ() {
			return this.TRSSIZ;
		}

		public Boolean TRSSIZIsNullable() {
			return true;
		}

		public Boolean TRSSIZIsKey() {
			return false;
		}

		public Integer TRSSIZLength() {
			return null;
		}

		public Integer TRSSIZPrecision() {
			return null;
		}

		public String TRSSIZDefault() {

			return "";

		}

		public String TRSSIZComment() {

			return "";

		}

		public String TRSSIZPattern() {

			return "";

		}

		public String TRSSIZOriginalDbColumnName() {

			return "TRSSIZ";

		}

		public String TRSDIM;

		public String getTRSDIM() {
			return this.TRSDIM;
		}

		public Boolean TRSDIMIsNullable() {
			return true;
		}

		public Boolean TRSDIMIsKey() {
			return false;
		}

		public Integer TRSDIMLength() {
			return null;
		}

		public Integer TRSDIMPrecision() {
			return null;
		}

		public String TRSDIMDefault() {

			return "";

		}

		public String TRSDIMComment() {

			return "";

		}

		public String TRSDIMPattern() {

			return "";

		}

		public String TRSDIMOriginalDbColumnName() {

			return "TRSDIM";

		}

		public String TRFDSP;

		public String getTRFDSP() {
			return this.TRFDSP;
		}

		public Boolean TRFDSPIsNullable() {
			return true;
		}

		public Boolean TRFDSPIsKey() {
			return false;
		}

		public Integer TRFDSPLength() {
			return null;
		}

		public Integer TRFDSPPrecision() {
			return null;
		}

		public String TRFDSPDefault() {

			return "";

		}

		public String TRFDSPComment() {

			return "";

		}

		public String TRFDSPPattern() {

			return "";

		}

		public String TRFDSPOriginalDbColumnName() {

			return "TRFDSP";

		}

		public BigDecimal TDSCQT;

		public BigDecimal getTDSCQT() {
			return this.TDSCQT;
		}

		public Boolean TDSCQTIsNullable() {
			return true;
		}

		public Boolean TDSCQTIsKey() {
			return false;
		}

		public Integer TDSCQTLength() {
			return null;
		}

		public Integer TDSCQTPrecision() {
			return null;
		}

		public String TDSCQTDefault() {

			return "";

		}

		public String TDSCQTComment() {

			return "";

		}

		public String TDSCQTPattern() {

			return "";

		}

		public String TDSCQTOriginalDbColumnName() {

			return "TDSCQT";

		}

		public BigDecimal TDRCQT;

		public BigDecimal getTDRCQT() {
			return this.TDRCQT;
		}

		public Boolean TDRCQTIsNullable() {
			return true;
		}

		public Boolean TDRCQTIsKey() {
			return false;
		}

		public Integer TDRCQTLength() {
			return null;
		}

		public Integer TDRCQTPrecision() {
			return null;
		}

		public String TDRCQTDefault() {

			return "";

		}

		public String TDRCQTComment() {

			return "";

		}

		public String TDRCQTPattern() {

			return "";

		}

		public String TDRCQTOriginalDbColumnName() {

			return "TDRCQT";

		}

		public BigDecimal TDWGHT;

		public BigDecimal getTDWGHT() {
			return this.TDWGHT;
		}

		public Boolean TDWGHTIsNullable() {
			return true;
		}

		public Boolean TDWGHTIsKey() {
			return false;
		}

		public Integer TDWGHTLength() {
			return null;
		}

		public Integer TDWGHTPrecision() {
			return null;
		}

		public String TDWGHTDefault() {

			return "";

		}

		public String TDWGHTComment() {

			return "";

		}

		public String TDWGHTPattern() {

			return "";

		}

		public String TDWGHTOriginalDbColumnName() {

			return "TDWGHT";

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

			return "";

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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ASNUM = null;
					} else {
						this.ASNUM = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.IDEPT = null;
					} else {
						this.IDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISDEPT = null;
					} else {
						this.ISDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ICLAS = null;
					} else {
						this.ICLAS = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISCLAS = null;
					} else {
						this.ISCLAS = dis.readDouble();
					}

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.TDSCWV = null;
					} else {
						this.TDSCWV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.TDSCSQ = null;
					} else {
						this.TDSCSQ = dis.readDouble();
					}

					this.TDSCNM = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSVND = null;
					} else {
						this.TRSVND = dis.readDouble();
					}

					this.TRSTYL = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSCOL = null;
					} else {
						this.TRSCOL = dis.readDouble();
					}

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ASNUM = null;
					} else {
						this.ASNUM = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.IDEPT = null;
					} else {
						this.IDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISDEPT = null;
					} else {
						this.ISDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ICLAS = null;
					} else {
						this.ICLAS = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISCLAS = null;
					} else {
						this.ISCLAS = dis.readDouble();
					}

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.TDSCWV = null;
					} else {
						this.TDSCWV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.TDSCSQ = null;
					} else {
						this.TDSCSQ = dis.readDouble();
					}

					this.TDSCNM = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSVND = null;
					} else {
						this.TRSVND = dis.readDouble();
					}

					this.TRSTYL = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSCOL = null;
					} else {
						this.TRSCOL = dis.readDouble();
					}

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

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

				// String

				writeString(this.TRFBCH, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// Double

				if (this.ASNUM == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ASNUM);
				}

				// Double

				if (this.IDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.IDEPT);
				}

				// Double

				if (this.ISDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISDEPT);
				}

				// Double

				if (this.ICLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ICLAS);
				}

				// Double

				if (this.ISCLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISCLAS);
				}

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// Double

				if (this.TDSCWV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCWV);
				}

				// Double

				if (this.TDSCSQ == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCSQ);
				}

				// String

				writeString(this.TDSCNM, dos);

				// Double

				if (this.TRSVND == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSVND);
				}

				// String

				writeString(this.TRSTYL, dos);

				// Double

				if (this.TRSCOL == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSCOL);
				}

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// Double

				if (this.ASNUM == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ASNUM);
				}

				// Double

				if (this.IDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.IDEPT);
				}

				// Double

				if (this.ISDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISDEPT);
				}

				// Double

				if (this.ICLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ICLAS);
				}

				// Double

				if (this.ISCLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISCLAS);
				}

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// Double

				if (this.TDSCWV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCWV);
				}

				// Double

				if (this.TDSCSQ == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCSQ);
				}

				// String

				writeString(this.TDSCNM, dos);

				// Double

				if (this.TRSVND == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSVND);
				}

				// String

				writeString(this.TRSTYL, dos);

				// Double

				if (this.TRSCOL == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSCOL);
				}

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

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
			sb.append("TRFBCH=" + TRFBCH);
			sb.append(",TRFFLC=" + String.valueOf(TRFFLC));
			sb.append(",TRFTLC=" + String.valueOf(TRFTLC));
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ASNUM=" + String.valueOf(ASNUM));
			sb.append(",IDEPT=" + String.valueOf(IDEPT));
			sb.append(",ISDEPT=" + String.valueOf(ISDEPT));
			sb.append(",ICLAS=" + String.valueOf(ICLAS));
			sb.append(",ISCLAS=" + String.valueOf(ISCLAS));
			sb.append(",TRFREQ=" + String.valueOf(TRFREQ));
			sb.append(",TRFSHP=" + String.valueOf(TRFSHP));
			sb.append(",TRFREC=" + String.valueOf(TRFREC));
			sb.append(",TRFALC=" + String.valueOf(TRFALC));
			sb.append(",TRFSUB=" + String.valueOf(TRFSUB));
			sb.append(",TRFSCD=" + TRFSCD);
			sb.append(",TRFRLC=" + TRFRLC);
			sb.append(",TRFCST=" + String.valueOf(TRFCST));
			sb.append(",TRFRIN=" + String.valueOf(TRFRIN));
			sb.append(",TRFROU=" + String.valueOf(TRFROU));
			sb.append(",ICUBE=" + String.valueOf(ICUBE));
			sb.append(",IVNDPN=" + IVNDPN);
			sb.append(",TRFSTS=" + TRFSTS);
			sb.append(",TRFTYP=" + TRFTYP);
			sb.append(",TRFPTY=" + TRFPTY);
			sb.append(",TDCYCL=" + String.valueOf(TDCYCL));
			sb.append(",TDSCWV=" + String.valueOf(TDSCWV));
			sb.append(",TDSCSQ=" + String.valueOf(TDSCSQ));
			sb.append(",TDSCNM=" + TDSCNM);
			sb.append(",TRSVND=" + String.valueOf(TRSVND));
			sb.append(",TRSTYL=" + TRSTYL);
			sb.append(",TRSCOL=" + String.valueOf(TRSCOL));
			sb.append(",TRSSIZ=" + TRSSIZ);
			sb.append(",TRSDIM=" + TRSDIM);
			sb.append(",TRFDSP=" + TRFDSP);
			sb.append(",TDSCQT=" + String.valueOf(TDSCQT));
			sb.append(",TDRCQT=" + String.valueOf(TDRCQT));
			sb.append(",TDWGHT=" + String.valueOf(TDWGHT));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
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

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (ASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(ASNUM);
			}

			sb.append("|");

			if (IDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(IDEPT);
			}

			sb.append("|");

			if (ISDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(ISDEPT);
			}

			sb.append("|");

			if (ICLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(ICLAS);
			}

			sb.append("|");

			if (ISCLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(ISCLAS);
			}

			sb.append("|");

			if (TRFREQ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREQ);
			}

			sb.append("|");

			if (TRFSHP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSHP);
			}

			sb.append("|");

			if (TRFREC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREC);
			}

			sb.append("|");

			if (TRFALC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFALC);
			}

			sb.append("|");

			if (TRFSUB == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSUB);
			}

			sb.append("|");

			if (TRFSCD == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSCD);
			}

			sb.append("|");

			if (TRFRLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRLC);
			}

			sb.append("|");

			if (TRFCST == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFCST);
			}

			sb.append("|");

			if (TRFRIN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRIN);
			}

			sb.append("|");

			if (TRFROU == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFROU);
			}

			sb.append("|");

			if (ICUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(ICUBE);
			}

			sb.append("|");

			if (IVNDPN == null) {
				sb.append("<null>");
			} else {
				sb.append(IVNDPN);
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

			if (TDCYCL == null) {
				sb.append("<null>");
			} else {
				sb.append(TDCYCL);
			}

			sb.append("|");

			if (TDSCWV == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCWV);
			}

			sb.append("|");

			if (TDSCSQ == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCSQ);
			}

			sb.append("|");

			if (TDSCNM == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCNM);
			}

			sb.append("|");

			if (TRSVND == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSVND);
			}

			sb.append("|");

			if (TRSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSTYL);
			}

			sb.append("|");

			if (TRSCOL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSCOL);
			}

			sb.append("|");

			if (TRSSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSSIZ);
			}

			sb.append("|");

			if (TRSDIM == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSDIM);
			}

			sb.append("|");

			if (TRFDSP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFDSP);
			}

			sb.append("|");

			if (TDSCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCQT);
			}

			sb.append("|");

			if (TDRCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDRCQT);
			}

			sb.append("|");

			if (TDWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDWGHT);
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
		public int compareTo(TRFDTLStruct other) {

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

	public static class row13Struct implements routines.system.IPersistableRow<row13Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[0];

		public String TRFBCH;

		public String getTRFBCH() {
			return this.TRFBCH;
		}

		public Boolean TRFBCHIsNullable() {
			return true;
		}

		public Boolean TRFBCHIsKey() {
			return false;
		}

		public Integer TRFBCHLength() {
			return null;
		}

		public Integer TRFBCHPrecision() {
			return null;
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

		public BigDecimal TRFFLC;

		public BigDecimal getTRFFLC() {
			return this.TRFFLC;
		}

		public Boolean TRFFLCIsNullable() {
			return true;
		}

		public Boolean TRFFLCIsKey() {
			return false;
		}

		public Integer TRFFLCLength() {
			return null;
		}

		public Integer TRFFLCPrecision() {
			return null;
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
			return true;
		}

		public Boolean TRFTLCIsKey() {
			return false;
		}

		public Integer TRFTLCLength() {
			return null;
		}

		public Integer TRFTLCPrecision() {
			return null;
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

		public Double ASNUM;

		public Double getASNUM() {
			return this.ASNUM;
		}

		public Boolean ASNUMIsNullable() {
			return true;
		}

		public Boolean ASNUMIsKey() {
			return false;
		}

		public Integer ASNUMLength() {
			return null;
		}

		public Integer ASNUMPrecision() {
			return null;
		}

		public String ASNUMDefault() {

			return "";

		}

		public String ASNUMComment() {

			return "";

		}

		public String ASNUMPattern() {

			return "";

		}

		public String ASNUMOriginalDbColumnName() {

			return "ASNUM";

		}

		public Double IDEPT;

		public Double getIDEPT() {
			return this.IDEPT;
		}

		public Boolean IDEPTIsNullable() {
			return true;
		}

		public Boolean IDEPTIsKey() {
			return false;
		}

		public Integer IDEPTLength() {
			return null;
		}

		public Integer IDEPTPrecision() {
			return null;
		}

		public String IDEPTDefault() {

			return "";

		}

		public String IDEPTComment() {

			return "";

		}

		public String IDEPTPattern() {

			return "";

		}

		public String IDEPTOriginalDbColumnName() {

			return "IDEPT";

		}

		public Double ISDEPT;

		public Double getISDEPT() {
			return this.ISDEPT;
		}

		public Boolean ISDEPTIsNullable() {
			return true;
		}

		public Boolean ISDEPTIsKey() {
			return false;
		}

		public Integer ISDEPTLength() {
			return null;
		}

		public Integer ISDEPTPrecision() {
			return null;
		}

		public String ISDEPTDefault() {

			return "";

		}

		public String ISDEPTComment() {

			return "";

		}

		public String ISDEPTPattern() {

			return "";

		}

		public String ISDEPTOriginalDbColumnName() {

			return "ISDEPT";

		}

		public Double ICLAS;

		public Double getICLAS() {
			return this.ICLAS;
		}

		public Boolean ICLASIsNullable() {
			return true;
		}

		public Boolean ICLASIsKey() {
			return false;
		}

		public Integer ICLASLength() {
			return null;
		}

		public Integer ICLASPrecision() {
			return null;
		}

		public String ICLASDefault() {

			return "";

		}

		public String ICLASComment() {

			return "";

		}

		public String ICLASPattern() {

			return "";

		}

		public String ICLASOriginalDbColumnName() {

			return "ICLAS";

		}

		public Double ISCLAS;

		public Double getISCLAS() {
			return this.ISCLAS;
		}

		public Boolean ISCLASIsNullable() {
			return true;
		}

		public Boolean ISCLASIsKey() {
			return false;
		}

		public Integer ISCLASLength() {
			return null;
		}

		public Integer ISCLASPrecision() {
			return null;
		}

		public String ISCLASDefault() {

			return "";

		}

		public String ISCLASComment() {

			return "";

		}

		public String ISCLASPattern() {

			return "";

		}

		public String ISCLASOriginalDbColumnName() {

			return "ISCLAS";

		}

		public BigDecimal TRFREQ;

		public BigDecimal getTRFREQ() {
			return this.TRFREQ;
		}

		public Boolean TRFREQIsNullable() {
			return true;
		}

		public Boolean TRFREQIsKey() {
			return false;
		}

		public Integer TRFREQLength() {
			return null;
		}

		public Integer TRFREQPrecision() {
			return null;
		}

		public String TRFREQDefault() {

			return "";

		}

		public String TRFREQComment() {

			return "";

		}

		public String TRFREQPattern() {

			return "";

		}

		public String TRFREQOriginalDbColumnName() {

			return "TRFREQ";

		}

		public BigDecimal TRFSHP;

		public BigDecimal getTRFSHP() {
			return this.TRFSHP;
		}

		public Boolean TRFSHPIsNullable() {
			return true;
		}

		public Boolean TRFSHPIsKey() {
			return false;
		}

		public Integer TRFSHPLength() {
			return null;
		}

		public Integer TRFSHPPrecision() {
			return null;
		}

		public String TRFSHPDefault() {

			return "";

		}

		public String TRFSHPComment() {

			return "";

		}

		public String TRFSHPPattern() {

			return "";

		}

		public String TRFSHPOriginalDbColumnName() {

			return "TRFSHP";

		}

		public BigDecimal TRFREC;

		public BigDecimal getTRFREC() {
			return this.TRFREC;
		}

		public Boolean TRFRECIsNullable() {
			return true;
		}

		public Boolean TRFRECIsKey() {
			return false;
		}

		public Integer TRFRECLength() {
			return null;
		}

		public Integer TRFRECPrecision() {
			return null;
		}

		public String TRFRECDefault() {

			return "";

		}

		public String TRFRECComment() {

			return "";

		}

		public String TRFRECPattern() {

			return "";

		}

		public String TRFRECOriginalDbColumnName() {

			return "TRFREC";

		}

		public BigDecimal TRFALC;

		public BigDecimal getTRFALC() {
			return this.TRFALC;
		}

		public Boolean TRFALCIsNullable() {
			return true;
		}

		public Boolean TRFALCIsKey() {
			return false;
		}

		public Integer TRFALCLength() {
			return null;
		}

		public Integer TRFALCPrecision() {
			return null;
		}

		public String TRFALCDefault() {

			return "";

		}

		public String TRFALCComment() {

			return "";

		}

		public String TRFALCPattern() {

			return "";

		}

		public String TRFALCOriginalDbColumnName() {

			return "TRFALC";

		}

		public BigDecimal TRFSUB;

		public BigDecimal getTRFSUB() {
			return this.TRFSUB;
		}

		public Boolean TRFSUBIsNullable() {
			return true;
		}

		public Boolean TRFSUBIsKey() {
			return false;
		}

		public Integer TRFSUBLength() {
			return null;
		}

		public Integer TRFSUBPrecision() {
			return null;
		}

		public String TRFSUBDefault() {

			return "";

		}

		public String TRFSUBComment() {

			return "";

		}

		public String TRFSUBPattern() {

			return "";

		}

		public String TRFSUBOriginalDbColumnName() {

			return "TRFSUB";

		}

		public String TRFSCD;

		public String getTRFSCD() {
			return this.TRFSCD;
		}

		public Boolean TRFSCDIsNullable() {
			return true;
		}

		public Boolean TRFSCDIsKey() {
			return false;
		}

		public Integer TRFSCDLength() {
			return null;
		}

		public Integer TRFSCDPrecision() {
			return null;
		}

		public String TRFSCDDefault() {

			return "";

		}

		public String TRFSCDComment() {

			return "";

		}

		public String TRFSCDPattern() {

			return "";

		}

		public String TRFSCDOriginalDbColumnName() {

			return "TRFSCD";

		}

		public String TRFRLC;

		public String getTRFRLC() {
			return this.TRFRLC;
		}

		public Boolean TRFRLCIsNullable() {
			return true;
		}

		public Boolean TRFRLCIsKey() {
			return false;
		}

		public Integer TRFRLCLength() {
			return null;
		}

		public Integer TRFRLCPrecision() {
			return null;
		}

		public String TRFRLCDefault() {

			return "";

		}

		public String TRFRLCComment() {

			return "";

		}

		public String TRFRLCPattern() {

			return "";

		}

		public String TRFRLCOriginalDbColumnName() {

			return "TRFRLC";

		}

		public BigDecimal TRFCST;

		public BigDecimal getTRFCST() {
			return this.TRFCST;
		}

		public Boolean TRFCSTIsNullable() {
			return true;
		}

		public Boolean TRFCSTIsKey() {
			return false;
		}

		public Integer TRFCSTLength() {
			return null;
		}

		public Integer TRFCSTPrecision() {
			return null;
		}

		public String TRFCSTDefault() {

			return "";

		}

		public String TRFCSTComment() {

			return "";

		}

		public String TRFCSTPattern() {

			return "";

		}

		public String TRFCSTOriginalDbColumnName() {

			return "TRFCST";

		}

		public BigDecimal TRFRIN;

		public BigDecimal getTRFRIN() {
			return this.TRFRIN;
		}

		public Boolean TRFRINIsNullable() {
			return true;
		}

		public Boolean TRFRINIsKey() {
			return false;
		}

		public Integer TRFRINLength() {
			return null;
		}

		public Integer TRFRINPrecision() {
			return null;
		}

		public String TRFRINDefault() {

			return "";

		}

		public String TRFRINComment() {

			return "";

		}

		public String TRFRINPattern() {

			return "";

		}

		public String TRFRINOriginalDbColumnName() {

			return "TRFRIN";

		}

		public BigDecimal TRFROU;

		public BigDecimal getTRFROU() {
			return this.TRFROU;
		}

		public Boolean TRFROUIsNullable() {
			return true;
		}

		public Boolean TRFROUIsKey() {
			return false;
		}

		public Integer TRFROULength() {
			return null;
		}

		public Integer TRFROUPrecision() {
			return null;
		}

		public String TRFROUDefault() {

			return "";

		}

		public String TRFROUComment() {

			return "";

		}

		public String TRFROUPattern() {

			return "";

		}

		public String TRFROUOriginalDbColumnName() {

			return "TRFROU";

		}

		public BigDecimal ICUBE;

		public BigDecimal getICUBE() {
			return this.ICUBE;
		}

		public Boolean ICUBEIsNullable() {
			return true;
		}

		public Boolean ICUBEIsKey() {
			return false;
		}

		public Integer ICUBELength() {
			return null;
		}

		public Integer ICUBEPrecision() {
			return null;
		}

		public String ICUBEDefault() {

			return "";

		}

		public String ICUBEComment() {

			return "";

		}

		public String ICUBEPattern() {

			return "";

		}

		public String ICUBEOriginalDbColumnName() {

			return "ICUBE";

		}

		public String IVNDPN;

		public String getIVNDPN() {
			return this.IVNDPN;
		}

		public Boolean IVNDPNIsNullable() {
			return true;
		}

		public Boolean IVNDPNIsKey() {
			return false;
		}

		public Integer IVNDPNLength() {
			return null;
		}

		public Integer IVNDPNPrecision() {
			return null;
		}

		public String IVNDPNDefault() {

			return "";

		}

		public String IVNDPNComment() {

			return "";

		}

		public String IVNDPNPattern() {

			return "";

		}

		public String IVNDPNOriginalDbColumnName() {

			return "IVNDPN";

		}

		public String TRFSTS;

		public String getTRFSTS() {
			return this.TRFSTS;
		}

		public Boolean TRFSTSIsNullable() {
			return true;
		}

		public Boolean TRFSTSIsKey() {
			return false;
		}

		public Integer TRFSTSLength() {
			return null;
		}

		public Integer TRFSTSPrecision() {
			return null;
		}

		public String TRFSTSDefault() {

			return "";

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
			return true;
		}

		public Boolean TRFTYPIsKey() {
			return false;
		}

		public Integer TRFTYPLength() {
			return null;
		}

		public Integer TRFTYPPrecision() {
			return null;
		}

		public String TRFTYPDefault() {

			return "";

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
			return true;
		}

		public Boolean TRFPTYIsKey() {
			return false;
		}

		public Integer TRFPTYLength() {
			return null;
		}

		public Integer TRFPTYPrecision() {
			return null;
		}

		public String TRFPTYDefault() {

			return "";

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

		public BigDecimal TDCYCL;

		public BigDecimal getTDCYCL() {
			return this.TDCYCL;
		}

		public Boolean TDCYCLIsNullable() {
			return true;
		}

		public Boolean TDCYCLIsKey() {
			return false;
		}

		public Integer TDCYCLLength() {
			return null;
		}

		public Integer TDCYCLPrecision() {
			return null;
		}

		public String TDCYCLDefault() {

			return "";

		}

		public String TDCYCLComment() {

			return "";

		}

		public String TDCYCLPattern() {

			return "";

		}

		public String TDCYCLOriginalDbColumnName() {

			return "TDCYCL";

		}

		public Double TDSCWV;

		public Double getTDSCWV() {
			return this.TDSCWV;
		}

		public Boolean TDSCWVIsNullable() {
			return true;
		}

		public Boolean TDSCWVIsKey() {
			return false;
		}

		public Integer TDSCWVLength() {
			return null;
		}

		public Integer TDSCWVPrecision() {
			return null;
		}

		public String TDSCWVDefault() {

			return "";

		}

		public String TDSCWVComment() {

			return "";

		}

		public String TDSCWVPattern() {

			return "";

		}

		public String TDSCWVOriginalDbColumnName() {

			return "TDSCWV";

		}

		public Double TDSCSQ;

		public Double getTDSCSQ() {
			return this.TDSCSQ;
		}

		public Boolean TDSCSQIsNullable() {
			return true;
		}

		public Boolean TDSCSQIsKey() {
			return false;
		}

		public Integer TDSCSQLength() {
			return null;
		}

		public Integer TDSCSQPrecision() {
			return null;
		}

		public String TDSCSQDefault() {

			return "";

		}

		public String TDSCSQComment() {

			return "";

		}

		public String TDSCSQPattern() {

			return "";

		}

		public String TDSCSQOriginalDbColumnName() {

			return "TDSCSQ";

		}

		public String TDSCNM;

		public String getTDSCNM() {
			return this.TDSCNM;
		}

		public Boolean TDSCNMIsNullable() {
			return true;
		}

		public Boolean TDSCNMIsKey() {
			return false;
		}

		public Integer TDSCNMLength() {
			return null;
		}

		public Integer TDSCNMPrecision() {
			return null;
		}

		public String TDSCNMDefault() {

			return "";

		}

		public String TDSCNMComment() {

			return "";

		}

		public String TDSCNMPattern() {

			return "";

		}

		public String TDSCNMOriginalDbColumnName() {

			return "TDSCNM";

		}

		public Double TRSVND;

		public Double getTRSVND() {
			return this.TRSVND;
		}

		public Boolean TRSVNDIsNullable() {
			return true;
		}

		public Boolean TRSVNDIsKey() {
			return false;
		}

		public Integer TRSVNDLength() {
			return null;
		}

		public Integer TRSVNDPrecision() {
			return null;
		}

		public String TRSVNDDefault() {

			return "";

		}

		public String TRSVNDComment() {

			return "";

		}

		public String TRSVNDPattern() {

			return "";

		}

		public String TRSVNDOriginalDbColumnName() {

			return "TRSVND";

		}

		public String TRSTYL;

		public String getTRSTYL() {
			return this.TRSTYL;
		}

		public Boolean TRSTYLIsNullable() {
			return true;
		}

		public Boolean TRSTYLIsKey() {
			return false;
		}

		public Integer TRSTYLLength() {
			return null;
		}

		public Integer TRSTYLPrecision() {
			return null;
		}

		public String TRSTYLDefault() {

			return null;

		}

		public String TRSTYLComment() {

			return "";

		}

		public String TRSTYLPattern() {

			return "";

		}

		public String TRSTYLOriginalDbColumnName() {

			return "TRSTYL";

		}

		public Double TRSCOL;

		public Double getTRSCOL() {
			return this.TRSCOL;
		}

		public Boolean TRSCOLIsNullable() {
			return true;
		}

		public Boolean TRSCOLIsKey() {
			return false;
		}

		public Integer TRSCOLLength() {
			return null;
		}

		public Integer TRSCOLPrecision() {
			return null;
		}

		public String TRSCOLDefault() {

			return "";

		}

		public String TRSCOLComment() {

			return "";

		}

		public String TRSCOLPattern() {

			return "";

		}

		public String TRSCOLOriginalDbColumnName() {

			return "TRSCOL";

		}

		public String TRSSIZ;

		public String getTRSSIZ() {
			return this.TRSSIZ;
		}

		public Boolean TRSSIZIsNullable() {
			return true;
		}

		public Boolean TRSSIZIsKey() {
			return false;
		}

		public Integer TRSSIZLength() {
			return null;
		}

		public Integer TRSSIZPrecision() {
			return null;
		}

		public String TRSSIZDefault() {

			return null;

		}

		public String TRSSIZComment() {

			return "";

		}

		public String TRSSIZPattern() {

			return "";

		}

		public String TRSSIZOriginalDbColumnName() {

			return "TRSSIZ";

		}

		public String TRSDIM;

		public String getTRSDIM() {
			return this.TRSDIM;
		}

		public Boolean TRSDIMIsNullable() {
			return true;
		}

		public Boolean TRSDIMIsKey() {
			return false;
		}

		public Integer TRSDIMLength() {
			return null;
		}

		public Integer TRSDIMPrecision() {
			return null;
		}

		public String TRSDIMDefault() {

			return null;

		}

		public String TRSDIMComment() {

			return "";

		}

		public String TRSDIMPattern() {

			return "";

		}

		public String TRSDIMOriginalDbColumnName() {

			return "TRSDIM";

		}

		public String TRFDSP;

		public String getTRFDSP() {
			return this.TRFDSP;
		}

		public Boolean TRFDSPIsNullable() {
			return true;
		}

		public Boolean TRFDSPIsKey() {
			return false;
		}

		public Integer TRFDSPLength() {
			return null;
		}

		public Integer TRFDSPPrecision() {
			return null;
		}

		public String TRFDSPDefault() {

			return null;

		}

		public String TRFDSPComment() {

			return "";

		}

		public String TRFDSPPattern() {

			return "";

		}

		public String TRFDSPOriginalDbColumnName() {

			return "TRFDSP";

		}

		public BigDecimal TDSCQT;

		public BigDecimal getTDSCQT() {
			return this.TDSCQT;
		}

		public Boolean TDSCQTIsNullable() {
			return true;
		}

		public Boolean TDSCQTIsKey() {
			return false;
		}

		public Integer TDSCQTLength() {
			return null;
		}

		public Integer TDSCQTPrecision() {
			return null;
		}

		public String TDSCQTDefault() {

			return "";

		}

		public String TDSCQTComment() {

			return "";

		}

		public String TDSCQTPattern() {

			return "";

		}

		public String TDSCQTOriginalDbColumnName() {

			return "TDSCQT";

		}

		public BigDecimal TDRCQT;

		public BigDecimal getTDRCQT() {
			return this.TDRCQT;
		}

		public Boolean TDRCQTIsNullable() {
			return true;
		}

		public Boolean TDRCQTIsKey() {
			return false;
		}

		public Integer TDRCQTLength() {
			return null;
		}

		public Integer TDRCQTPrecision() {
			return null;
		}

		public String TDRCQTDefault() {

			return "";

		}

		public String TDRCQTComment() {

			return "";

		}

		public String TDRCQTPattern() {

			return "";

		}

		public String TDRCQTOriginalDbColumnName() {

			return "TDRCQT";

		}

		public BigDecimal TDWGHT;

		public BigDecimal getTDWGHT() {
			return this.TDWGHT;
		}

		public Boolean TDWGHTIsNullable() {
			return true;
		}

		public Boolean TDWGHTIsKey() {
			return false;
		}

		public Integer TDWGHTLength() {
			return null;
		}

		public Integer TDWGHTPrecision() {
			return null;
		}

		public String TDWGHTDefault() {

			return "";

		}

		public String TDWGHTComment() {

			return "";

		}

		public String TDWGHTPattern() {

			return "";

		}

		public String TDWGHTOriginalDbColumnName() {

			return "TDWGHT";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ASNUM = null;
					} else {
						this.ASNUM = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.IDEPT = null;
					} else {
						this.IDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISDEPT = null;
					} else {
						this.ISDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ICLAS = null;
					} else {
						this.ICLAS = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISCLAS = null;
					} else {
						this.ISCLAS = dis.readDouble();
					}

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.TDSCWV = null;
					} else {
						this.TDSCWV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.TDSCSQ = null;
					} else {
						this.TDSCSQ = dis.readDouble();
					}

					this.TDSCNM = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSVND = null;
					} else {
						this.TRSVND = dis.readDouble();
					}

					this.TRSTYL = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSCOL = null;
					} else {
						this.TRSCOL = dis.readDouble();
					}

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TRANSFER_DETAIL_TRFDTL) {

				try {

					int length = 0;

					this.TRFBCH = readString(dis);

					this.TRFFLC = (BigDecimal) dis.readObject();

					this.TRFTLC = (BigDecimal) dis.readObject();

					this.INUMBR = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.ASNUM = null;
					} else {
						this.ASNUM = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.IDEPT = null;
					} else {
						this.IDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISDEPT = null;
					} else {
						this.ISDEPT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ICLAS = null;
					} else {
						this.ICLAS = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.ISCLAS = null;
					} else {
						this.ISCLAS = dis.readDouble();
					}

					this.TRFREQ = (BigDecimal) dis.readObject();

					this.TRFSHP = (BigDecimal) dis.readObject();

					this.TRFREC = (BigDecimal) dis.readObject();

					this.TRFALC = (BigDecimal) dis.readObject();

					this.TRFSUB = (BigDecimal) dis.readObject();

					this.TRFSCD = readString(dis);

					this.TRFRLC = readString(dis);

					this.TRFCST = (BigDecimal) dis.readObject();

					this.TRFRIN = (BigDecimal) dis.readObject();

					this.TRFROU = (BigDecimal) dis.readObject();

					this.ICUBE = (BigDecimal) dis.readObject();

					this.IVNDPN = readString(dis);

					this.TRFSTS = readString(dis);

					this.TRFTYP = readString(dis);

					this.TRFPTY = readString(dis);

					this.TDCYCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.TDSCWV = null;
					} else {
						this.TDSCWV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.TDSCSQ = null;
					} else {
						this.TDSCSQ = dis.readDouble();
					}

					this.TDSCNM = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSVND = null;
					} else {
						this.TRSVND = dis.readDouble();
					}

					this.TRSTYL = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.TRSCOL = null;
					} else {
						this.TRSCOL = dis.readDouble();
					}

					this.TRSSIZ = readString(dis);

					this.TRSDIM = readString(dis);

					this.TRFDSP = readString(dis);

					this.TDSCQT = (BigDecimal) dis.readObject();

					this.TDRCQT = (BigDecimal) dis.readObject();

					this.TDWGHT = (BigDecimal) dis.readObject();

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

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// Double

				if (this.ASNUM == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ASNUM);
				}

				// Double

				if (this.IDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.IDEPT);
				}

				// Double

				if (this.ISDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISDEPT);
				}

				// Double

				if (this.ICLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ICLAS);
				}

				// Double

				if (this.ISCLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISCLAS);
				}

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// Double

				if (this.TDSCWV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCWV);
				}

				// Double

				if (this.TDSCSQ == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCSQ);
				}

				// String

				writeString(this.TDSCNM, dos);

				// Double

				if (this.TRSVND == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSVND);
				}

				// String

				writeString(this.TRSTYL, dos);

				// Double

				if (this.TRSCOL == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSCOL);
				}

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.TRFBCH, dos);

				// BigDecimal

				dos.writeObject(this.TRFFLC);

				// BigDecimal

				dos.writeObject(this.TRFTLC);

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// Double

				if (this.ASNUM == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ASNUM);
				}

				// Double

				if (this.IDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.IDEPT);
				}

				// Double

				if (this.ISDEPT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISDEPT);
				}

				// Double

				if (this.ICLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ICLAS);
				}

				// Double

				if (this.ISCLAS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.ISCLAS);
				}

				// BigDecimal

				dos.writeObject(this.TRFREQ);

				// BigDecimal

				dos.writeObject(this.TRFSHP);

				// BigDecimal

				dos.writeObject(this.TRFREC);

				// BigDecimal

				dos.writeObject(this.TRFALC);

				// BigDecimal

				dos.writeObject(this.TRFSUB);

				// String

				writeString(this.TRFSCD, dos);

				// String

				writeString(this.TRFRLC, dos);

				// BigDecimal

				dos.writeObject(this.TRFCST);

				// BigDecimal

				dos.writeObject(this.TRFRIN);

				// BigDecimal

				dos.writeObject(this.TRFROU);

				// BigDecimal

				dos.writeObject(this.ICUBE);

				// String

				writeString(this.IVNDPN, dos);

				// String

				writeString(this.TRFSTS, dos);

				// String

				writeString(this.TRFTYP, dos);

				// String

				writeString(this.TRFPTY, dos);

				// BigDecimal

				dos.writeObject(this.TDCYCL);

				// Double

				if (this.TDSCWV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCWV);
				}

				// Double

				if (this.TDSCSQ == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TDSCSQ);
				}

				// String

				writeString(this.TDSCNM, dos);

				// Double

				if (this.TRSVND == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSVND);
				}

				// String

				writeString(this.TRSTYL, dos);

				// Double

				if (this.TRSCOL == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.TRSCOL);
				}

				// String

				writeString(this.TRSSIZ, dos);

				// String

				writeString(this.TRSDIM, dos);

				// String

				writeString(this.TRFDSP, dos);

				// BigDecimal

				dos.writeObject(this.TDSCQT);

				// BigDecimal

				dos.writeObject(this.TDRCQT);

				// BigDecimal

				dos.writeObject(this.TDWGHT);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRFBCH=" + TRFBCH);
			sb.append(",TRFFLC=" + String.valueOf(TRFFLC));
			sb.append(",TRFTLC=" + String.valueOf(TRFTLC));
			sb.append(",INUMBR=" + String.valueOf(INUMBR));
			sb.append(",ASNUM=" + String.valueOf(ASNUM));
			sb.append(",IDEPT=" + String.valueOf(IDEPT));
			sb.append(",ISDEPT=" + String.valueOf(ISDEPT));
			sb.append(",ICLAS=" + String.valueOf(ICLAS));
			sb.append(",ISCLAS=" + String.valueOf(ISCLAS));
			sb.append(",TRFREQ=" + String.valueOf(TRFREQ));
			sb.append(",TRFSHP=" + String.valueOf(TRFSHP));
			sb.append(",TRFREC=" + String.valueOf(TRFREC));
			sb.append(",TRFALC=" + String.valueOf(TRFALC));
			sb.append(",TRFSUB=" + String.valueOf(TRFSUB));
			sb.append(",TRFSCD=" + TRFSCD);
			sb.append(",TRFRLC=" + TRFRLC);
			sb.append(",TRFCST=" + String.valueOf(TRFCST));
			sb.append(",TRFRIN=" + String.valueOf(TRFRIN));
			sb.append(",TRFROU=" + String.valueOf(TRFROU));
			sb.append(",ICUBE=" + String.valueOf(ICUBE));
			sb.append(",IVNDPN=" + IVNDPN);
			sb.append(",TRFSTS=" + TRFSTS);
			sb.append(",TRFTYP=" + TRFTYP);
			sb.append(",TRFPTY=" + TRFPTY);
			sb.append(",TDCYCL=" + String.valueOf(TDCYCL));
			sb.append(",TDSCWV=" + String.valueOf(TDSCWV));
			sb.append(",TDSCSQ=" + String.valueOf(TDSCSQ));
			sb.append(",TDSCNM=" + TDSCNM);
			sb.append(",TRSVND=" + String.valueOf(TRSVND));
			sb.append(",TRSTYL=" + TRSTYL);
			sb.append(",TRSCOL=" + String.valueOf(TRSCOL));
			sb.append(",TRSSIZ=" + TRSSIZ);
			sb.append(",TRSDIM=" + TRSDIM);
			sb.append(",TRFDSP=" + TRFDSP);
			sb.append(",TDSCQT=" + String.valueOf(TDSCQT));
			sb.append(",TDRCQT=" + String.valueOf(TDRCQT));
			sb.append(",TDWGHT=" + String.valueOf(TDWGHT));
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

			if (INUMBR == null) {
				sb.append("<null>");
			} else {
				sb.append(INUMBR);
			}

			sb.append("|");

			if (ASNUM == null) {
				sb.append("<null>");
			} else {
				sb.append(ASNUM);
			}

			sb.append("|");

			if (IDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(IDEPT);
			}

			sb.append("|");

			if (ISDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(ISDEPT);
			}

			sb.append("|");

			if (ICLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(ICLAS);
			}

			sb.append("|");

			if (ISCLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(ISCLAS);
			}

			sb.append("|");

			if (TRFREQ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREQ);
			}

			sb.append("|");

			if (TRFSHP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSHP);
			}

			sb.append("|");

			if (TRFREC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFREC);
			}

			sb.append("|");

			if (TRFALC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFALC);
			}

			sb.append("|");

			if (TRFSUB == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSUB);
			}

			sb.append("|");

			if (TRFSCD == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFSCD);
			}

			sb.append("|");

			if (TRFRLC == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRLC);
			}

			sb.append("|");

			if (TRFCST == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFCST);
			}

			sb.append("|");

			if (TRFRIN == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFRIN);
			}

			sb.append("|");

			if (TRFROU == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFROU);
			}

			sb.append("|");

			if (ICUBE == null) {
				sb.append("<null>");
			} else {
				sb.append(ICUBE);
			}

			sb.append("|");

			if (IVNDPN == null) {
				sb.append("<null>");
			} else {
				sb.append(IVNDPN);
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

			if (TDCYCL == null) {
				sb.append("<null>");
			} else {
				sb.append(TDCYCL);
			}

			sb.append("|");

			if (TDSCWV == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCWV);
			}

			sb.append("|");

			if (TDSCSQ == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCSQ);
			}

			sb.append("|");

			if (TDSCNM == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCNM);
			}

			sb.append("|");

			if (TRSVND == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSVND);
			}

			sb.append("|");

			if (TRSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSTYL);
			}

			sb.append("|");

			if (TRSCOL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSCOL);
			}

			sb.append("|");

			if (TRSSIZ == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSSIZ);
			}

			sb.append("|");

			if (TRSDIM == null) {
				sb.append("<null>");
			} else {
				sb.append(TRSDIM);
			}

			sb.append("|");

			if (TRFDSP == null) {
				sb.append("<null>");
			} else {
				sb.append(TRFDSP);
			}

			sb.append("|");

			if (TDSCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDSCQT);
			}

			sb.append("|");

			if (TDRCQT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDRCQT);
			}

			sb.append("|");

			if (TDWGHT == null) {
				sb.append("<null>");
			} else {
				sb.append(TDWGHT);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row13Struct other) {

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

	public void tFileInputDelimited_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_4");
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

				row13Struct row13 = new row13Struct();
				TRFDTLStruct TRFDTL = new TRFDTLStruct();

				/**
				 * [tDBOutput_5 begin ] start
				 */

				ok_Hash.put("tDBOutput_5", false);
				start_Hash.put("tDBOutput_5", System.currentTimeMillis());

				currentComponent = "tDBOutput_5";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "TRFDTL");

				int tos_count_tDBOutput_5 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_5", "tDBOutput_5", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_5 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_5 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_5 = (String) (restRequest_tDBOutput_5 != null
						? restRequest_tDBOutput_5.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_5 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_5 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_5 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_5 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_5
						.createRuntimeProperties();
				props_tDBOutput_5.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_5.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_5.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_5.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_5.setValue("useSchemaDatePattern", false);

				props_tDBOutput_5.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_5_1_fisrt {

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

				SchemaSettingTool_tDBOutput_5_1_fisrt sst_tDBOutput_5_1_fisrt = new SchemaSettingTool_tDBOutput_5_1_fisrt();

				props_tDBOutput_5.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_5_1_fisrt.getSchemaValue()));

				props_tDBOutput_5.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_5.connection.setValue("useCustomRegion", false);

				props_tDBOutput_5.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_5.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_5.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_5.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_5.table.setValue("tableName", "TRANSFER_DETAIL_TRFDTL");

				props_tDBOutput_5.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_5.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_5.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_5.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_5.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_5.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_5_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"TRANSFER_DETAIL_TRFDTL\",\"fields\":[{", s);

						a("\"name\":\"TRFBCH\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFBCH\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFFLC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TRFFLC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFTLC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TRFTLC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ASNUM\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ASNUM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IDEPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IDEPT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ISDEPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISDEPT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ICLAS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ICLAS\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ISCLAS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISCLAS\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFREQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFREQ\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFSHP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFSHP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFREC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFREC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFALC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFALC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFSUB\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TRFSUB\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFSCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFSCD\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFRLC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFRLC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFCST\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFCST\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFRIN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFRIN\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFROU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TRFROU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"ICUBE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"ICUBE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"IVNDPN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVNDPN\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFSTS\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFSTS\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFTYP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFTYP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFPTY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFPTY\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDCYCL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"TDCYCL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDSCWV\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TDSCWV\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDSCSQ\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TDSCSQ\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDSCNM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TDSCNM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRSVND\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TRSVND\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRSTYL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRSTYL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRSCOL\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TRSCOL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRSSIZ\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRSSIZ\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRSDIM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRSDIM\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TRFDSP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRFDSP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDSCQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TDSCQT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDRCQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TDRCQT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"TDWGHT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"TDWGHT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_5_2_fisrt sst_tDBOutput_5_2_fisrt = new SchemaSettingTool_tDBOutput_5_2_fisrt();

				props_tDBOutput_5.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_5_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_5.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_5 = props_tDBOutput_5.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_5 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_5 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_5 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_5.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_5);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_5.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_5 = props_tDBOutput_5.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_5 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_5 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_5 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_5.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_5);
					}
				}
				globalMap.put("tDBOutput_5_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_5);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_5 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_5_MAPPINGS_URL", mappings_url_tDBOutput_5);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_5 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_5";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_5 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_5 = null;
				topology_tDBOutput_5 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_5 = def_tDBOutput_5.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_5,
						topology_tDBOutput_5);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_5 = def_tDBOutput_5
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_5 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_5.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_5 = componentRuntime_tDBOutput_5
						.initialize(container_tDBOutput_5, props_tDBOutput_5);

				if (initVr_tDBOutput_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_5.getMessage());
				}

				if (componentRuntime_tDBOutput_5 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_5 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_5;
					compDriverInitialization_tDBOutput_5.runAtDriver(container_tDBOutput_5);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_5 = null;
				if (componentRuntime_tDBOutput_5 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_5 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_5;
					if (doesNodeBelongToRequest_tDBOutput_5) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_5 = sourceOrSink_tDBOutput_5
								.validate(container_tDBOutput_5);
						if (vr_tDBOutput_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_5.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_5 = null;
				if (sourceOrSink_tDBOutput_5 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_5 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_5;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_5 = sink_tDBOutput_5
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_5) {
						writeOperation_tDBOutput_5.initialize(container_tDBOutput_5);
					}
					writer_tDBOutput_5 = writeOperation_tDBOutput_5.createWriter(container_tDBOutput_5);
					if (doesNodeBelongToRequest_tDBOutput_5) {
						writer_tDBOutput_5.open("tDBOutput_5");
					}

					resourceMap.put("writer_tDBOutput_5", writer_tDBOutput_5);
				} // end of "sourceOrSink_tDBOutput_5 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_5 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_5
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_5 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_5 = props_tDBOutput_5.getSchema(c_tDBOutput_5, false);
				incomingEnforcer_tDBOutput_5 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_5);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_5 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_5 = null;

				/**
				 * [tDBOutput_5 begin ] stop
				 */

				/**
				 * [tMap_5 begin ] start
				 */

				ok_Hash.put("tMap_5", false);
				start_Hash.put("tMap_5", System.currentTimeMillis());

				currentComponent = "tMap_5";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row13");

				int tos_count_tMap_5 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_5 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_5 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_5 = new StringBuilder();
							log4jParamters_tMap_5.append("Parameters:");
							log4jParamters_tMap_5.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_5.append(" | ");
							log4jParamters_tMap_5.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_5.append(" | ");
							log4jParamters_tMap_5.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_5.append(" | ");
							log4jParamters_tMap_5.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_5.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_5 - " + (log4jParamters_tMap_5));
						}
					}
					new BytesLimit65535_tMap_5().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_5", "tMap_5", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row13_tMap_5 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_5__Struct {
					java.util.Date var1;
				}
				Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_TRFDTL_tMap_5 = 0;

				TRFDTLStruct TRFDTL_tmp = new TRFDTLStruct();
// ###############################

				/**
				 * [tMap_5 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_4 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_4", false);
				start_Hash.put("tFileInputDelimited_4", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_4";

				int tos_count_tFileInputDelimited_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_4 = new StringBuilder();
							log4jParamters_tFileInputDelimited_4.append("Parameters:");
							log4jParamters_tFileInputDelimited_4
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/TRFDTL.zip\"");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFBCH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFFLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTLC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ASNUM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IDEPT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ISDEPT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ICLAS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ISCLAS") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFREQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFSHP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFREC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFALC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFSUB") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRFSCD") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRFRLC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFCST") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFRIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFROU") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("ICUBE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("IVNDPN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRFSTS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFTYP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFPTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TDCYCL") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TDSCWV") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TDSCSQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TDSCNM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRSVND") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TRSTYL") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRSCOL") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRSSIZ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRSDIM")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRFDSP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("TDSCQT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TDRCQT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TDWGHT") + "}]");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							log4jParamters_tFileInputDelimited_4.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_4 - " + (log4jParamters_tFileInputDelimited_4));
						}
					}
					new BytesLimit65535_tFileInputDelimited_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_4", "tFileInputDelimited_4", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_4 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_4 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_4 = null;
				int limit_tFileInputDelimited_4 = -1;
				try {

					Object filename_tFileInputDelimited_4 = "/data/talend/data_repository/TRFDTL.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_4 = null;
					try {
						if (filename_tFileInputDelimited_4 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_4 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_4));
						} else {
							zis_tFileInputDelimited_4 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_4))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE", e.getMessage());

						log.error("tFileInputDelimited_4 - " + e.getMessage());

						System.err.println(e.getMessage());

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_4 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_4 = zis_tFileInputDelimited_4.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE", e.getMessage());

							log.error("tFileInputDelimited_4 - " + e.getMessage());

							System.err.println(e.getMessage());
							break;

						}
						if (entry_tFileInputDelimited_4 == null) {
							break;
						}
						if (entry_tFileInputDelimited_4.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_4 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_4, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_4, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE", e.getMessage());

							log.error("tFileInputDelimited_4 - " + e.getMessage());

							System.err.println(e.getMessage());

						}

						log.info("tFileInputDelimited_4 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_4 != null && fid_tFileInputDelimited_4.nextRecord()) {
							rowstate_tFileInputDelimited_4.reset();

							row13 = null;

							boolean whetherReject_tFileInputDelimited_4 = false;
							row13 = new row13Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_4 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_4 = 0;

								row13.TRFBCH = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 1;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFFLC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFFLC", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFFLC = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 2;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFTLC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFTLC", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFTLC = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 3;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.INUMBR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"INUMBR", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.INUMBR = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 4;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.ASNUM = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ASNUM", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.ASNUM = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 5;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.IDEPT = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"IDEPT", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.IDEPT = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 6;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.ISDEPT = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ISDEPT", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.ISDEPT = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 7;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.ICLAS = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ICLAS", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.ICLAS = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 8;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.ISCLAS = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ISCLAS", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.ISCLAS = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 9;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFREQ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFREQ", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFREQ = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 10;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFSHP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFSHP", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFSHP = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 11;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFREC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFREC", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFREC = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 12;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFALC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFALC", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFALC = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 13;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFSUB = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFSUB", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFSUB = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 14;

								row13.TRFSCD = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 15;

								row13.TRFRLC = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 16;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFCST = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFCST", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFCST = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 17;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFRIN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFRIN", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFRIN = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 18;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRFROU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRFROU", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRFROU = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 19;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.ICUBE = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ICUBE", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.ICUBE = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 20;

								row13.IVNDPN = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 21;

								row13.TRFSTS = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 22;

								row13.TRFTYP = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 23;

								row13.TRFPTY = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 24;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDCYCL = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDCYCL", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDCYCL = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 25;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDSCWV = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDSCWV", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDSCWV = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 26;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDSCSQ = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDSCSQ", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDSCSQ = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 27;

								row13.TDSCNM = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 28;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRSVND = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRSVND", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRSVND = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 29;

								row13.TRSTYL = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 30;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TRSCOL = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TRSCOL", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TRSCOL = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 31;

								row13.TRSSIZ = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 32;

								row13.TRSDIM = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 33;

								row13.TRFDSP = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);

								columnIndexWithD_tFileInputDelimited_4 = 34;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDSCQT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDSCQT", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDSCQT = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 35;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDRCQT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDRCQT", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDRCQT = null;

								}

								columnIndexWithD_tFileInputDelimited_4 = 36;

								temp = fid_tFileInputDelimited_4.get(columnIndexWithD_tFileInputDelimited_4);
								if (temp.length() > 0) {

									try {

										row13.TDWGHT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_4) {
										globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",
												ex_tFileInputDelimited_4.getMessage());
										rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TDWGHT", "row13", temp, ex_tFileInputDelimited_4),
												ex_tFileInputDelimited_4));
									}

								} else {

									row13.TDWGHT = null;

								}

								if (rowstate_tFileInputDelimited_4.getException() != null) {
									throw rowstate_tFileInputDelimited_4.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_4 = true;

								log.error("tFileInputDelimited_4 - " + e.getMessage());

								System.err.println(e.getMessage());
								row13 = null;

							}

							log.debug("tFileInputDelimited_4 - Retrieving the record "
									+ fid_tFileInputDelimited_4.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_4 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_4 main ] start
							 */

							currentComponent = "tFileInputDelimited_4";

							tos_count_tFileInputDelimited_4++;

							/**
							 * [tFileInputDelimited_4 main ] stop
							 */

							/**
							 * [tFileInputDelimited_4 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_4";

							/**
							 * [tFileInputDelimited_4 process_data_begin ] stop
							 */
// Start of branch "row13"
							if (row13 != null) {

								/**
								 * [tMap_5 main ] start
								 */

								currentComponent = "tMap_5";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row13", "tFileInputDelimited_4", "tFileInputDelimited_4",
										"tFileInputDelimited", "tMap_5", "tMap_5", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row13 - " + (row13 == null ? "" : row13.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_5 = false;
								boolean mainRowRejected_tMap_5 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_5__Struct Var = Var__tMap_5;
									Var.var1 = TalendDate.addDate(
											TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD")), -1,
											"DD");// ###############################
									// ###############################
									// # Output tables

									TRFDTL = null;

// # Output table : 'TRFDTL'
									count_TRFDTL_tMap_5++;

									TRFDTL_tmp.TRFBCH = row13.TRFBCH;
									TRFDTL_tmp.TRFFLC = row13.TRFFLC;
									TRFDTL_tmp.TRFTLC = row13.TRFTLC;
									TRFDTL_tmp.INUMBR = row13.INUMBR;
									TRFDTL_tmp.ASNUM = row13.ASNUM;
									TRFDTL_tmp.IDEPT = row13.IDEPT;
									TRFDTL_tmp.ISDEPT = row13.ISDEPT;
									TRFDTL_tmp.ICLAS = row13.ICLAS;
									TRFDTL_tmp.ISCLAS = row13.ISCLAS;
									TRFDTL_tmp.TRFREQ = row13.TRFREQ;
									TRFDTL_tmp.TRFSHP = row13.TRFSHP;
									TRFDTL_tmp.TRFREC = row13.TRFREC;
									TRFDTL_tmp.TRFALC = row13.TRFALC;
									TRFDTL_tmp.TRFSUB = row13.TRFSUB;
									TRFDTL_tmp.TRFSCD = row13.TRFSCD;
									TRFDTL_tmp.TRFRLC = row13.TRFRLC;
									TRFDTL_tmp.TRFCST = row13.TRFCST;
									TRFDTL_tmp.TRFRIN = row13.TRFRIN;
									TRFDTL_tmp.TRFROU = row13.TRFROU;
									TRFDTL_tmp.ICUBE = row13.ICUBE;
									TRFDTL_tmp.IVNDPN = row13.IVNDPN;
									TRFDTL_tmp.TRFSTS = row13.TRFSTS;
									TRFDTL_tmp.TRFTYP = row13.TRFTYP;
									TRFDTL_tmp.TRFPTY = row13.TRFPTY;
									TRFDTL_tmp.TDCYCL = row13.TDCYCL;
									TRFDTL_tmp.TDSCWV = row13.TDSCWV;
									TRFDTL_tmp.TDSCSQ = row13.TDSCSQ;
									TRFDTL_tmp.TDSCNM = row13.TDSCNM;
									TRFDTL_tmp.TRSVND = row13.TRSVND;
									TRFDTL_tmp.TRSTYL = row13.TRSTYL;
									TRFDTL_tmp.TRSCOL = row13.TRSCOL;
									TRFDTL_tmp.TRSSIZ = row13.TRSSIZ;
									TRFDTL_tmp.TRSDIM = row13.TRSDIM;
									TRFDTL_tmp.TRFDSP = row13.TRFDSP;
									TRFDTL_tmp.TDSCQT = row13.TDSCQT;
									TRFDTL_tmp.TDRCQT = row13.TDRCQT;
									TRFDTL_tmp.TDWGHT = row13.TDWGHT;
									TRFDTL_tmp.LOAD_DATE = Var.var1;
									TRFDTL = TRFDTL_tmp;
									log.debug("tMap_5 - Outputting the record " + count_TRFDTL_tMap_5
											+ " of the output table 'TRFDTL'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_5 = false;

								tos_count_tMap_5++;

								/**
								 * [tMap_5 main ] stop
								 */

								/**
								 * [tMap_5 process_data_begin ] start
								 */

								currentComponent = "tMap_5";

								/**
								 * [tMap_5 process_data_begin ] stop
								 */
// Start of branch "TRFDTL"
								if (TRFDTL != null) {

									/**
									 * [tDBOutput_5 main ] start
									 */

									currentComponent = "tDBOutput_5";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "TRFDTL", "tMap_5", "tMap_5", "tMap", "tDBOutput_5", "tDBOutput_5",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("TRFDTL - " + (TRFDTL == null ? "" : TRFDTL.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_5 != null) {
										incomingEnforcer_tDBOutput_5.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFBCH") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFBCH", TRFDTL.TRFBCH);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFFLC") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFFLC", TRFDTL.TRFFLC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFTLC") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFTLC", TRFDTL.TRFTLC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("INUMBR") != null) {
										incomingEnforcer_tDBOutput_5.put("INUMBR", TRFDTL.INUMBR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("ASNUM") != null) {
										incomingEnforcer_tDBOutput_5.put("ASNUM", TRFDTL.ASNUM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("IDEPT") != null) {
										incomingEnforcer_tDBOutput_5.put("IDEPT", TRFDTL.IDEPT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("ISDEPT") != null) {
										incomingEnforcer_tDBOutput_5.put("ISDEPT", TRFDTL.ISDEPT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("ICLAS") != null) {
										incomingEnforcer_tDBOutput_5.put("ICLAS", TRFDTL.ICLAS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("ISCLAS") != null) {
										incomingEnforcer_tDBOutput_5.put("ISCLAS", TRFDTL.ISCLAS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFREQ") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFREQ", TRFDTL.TRFREQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFSHP") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFSHP", TRFDTL.TRFSHP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFREC") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFREC", TRFDTL.TRFREC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFALC") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFALC", TRFDTL.TRFALC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFSUB") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFSUB", TRFDTL.TRFSUB);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFSCD") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFSCD", TRFDTL.TRFSCD);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFRLC") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFRLC", TRFDTL.TRFRLC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFCST") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFCST", TRFDTL.TRFCST);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFRIN") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFRIN", TRFDTL.TRFRIN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFROU") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFROU", TRFDTL.TRFROU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("ICUBE") != null) {
										incomingEnforcer_tDBOutput_5.put("ICUBE", TRFDTL.ICUBE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("IVNDPN") != null) {
										incomingEnforcer_tDBOutput_5.put("IVNDPN", TRFDTL.IVNDPN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFSTS") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFSTS", TRFDTL.TRFSTS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFTYP") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFTYP", TRFDTL.TRFTYP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFPTY") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFPTY", TRFDTL.TRFPTY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDCYCL") != null) {
										incomingEnforcer_tDBOutput_5.put("TDCYCL", TRFDTL.TDCYCL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDSCWV") != null) {
										incomingEnforcer_tDBOutput_5.put("TDSCWV", TRFDTL.TDSCWV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDSCSQ") != null) {
										incomingEnforcer_tDBOutput_5.put("TDSCSQ", TRFDTL.TDSCSQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDSCNM") != null) {
										incomingEnforcer_tDBOutput_5.put("TDSCNM", TRFDTL.TDSCNM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRSVND") != null) {
										incomingEnforcer_tDBOutput_5.put("TRSVND", TRFDTL.TRSVND);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRSTYL") != null) {
										incomingEnforcer_tDBOutput_5.put("TRSTYL", TRFDTL.TRSTYL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRSCOL") != null) {
										incomingEnforcer_tDBOutput_5.put("TRSCOL", TRFDTL.TRSCOL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRSSIZ") != null) {
										incomingEnforcer_tDBOutput_5.put("TRSSIZ", TRFDTL.TRSSIZ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRSDIM") != null) {
										incomingEnforcer_tDBOutput_5.put("TRSDIM", TRFDTL.TRSDIM);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TRFDSP") != null) {
										incomingEnforcer_tDBOutput_5.put("TRFDSP", TRFDTL.TRFDSP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDSCQT") != null) {
										incomingEnforcer_tDBOutput_5.put("TDSCQT", TRFDTL.TDSCQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDRCQT") != null) {
										incomingEnforcer_tDBOutput_5.put("TDRCQT", TRFDTL.TDRCQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("TDWGHT") != null) {
										incomingEnforcer_tDBOutput_5.put("TDWGHT", TRFDTL.TDWGHT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_5 != null && incomingEnforcer_tDBOutput_5
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_5.put("LOAD_DATE", TRFDTL.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_5 = null;
									if (incomingEnforcer_tDBOutput_5 != null) {
										data_tDBOutput_5 = incomingEnforcer_tDBOutput_5.getCurrentRecord();
									}

									if (writer_tDBOutput_5 != null && data_tDBOutput_5 != null) {
										writer_tDBOutput_5.write(data_tDBOutput_5);
									}

									nb_line_tDBOutput_5++;

									tos_count_tDBOutput_5++;

									/**
									 * [tDBOutput_5 main ] stop
									 */

									/**
									 * [tDBOutput_5 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_5";

									/**
									 * [tDBOutput_5 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_5 process_data_end ] start
									 */

									currentComponent = "tDBOutput_5";

									/**
									 * [tDBOutput_5 process_data_end ] stop
									 */

								} // End of branch "TRFDTL"

								/**
								 * [tMap_5 process_data_end ] start
								 */

								currentComponent = "tMap_5";

								/**
								 * [tMap_5 process_data_end ] stop
								 */

							} // End of branch "row13"

							/**
							 * [tFileInputDelimited_4 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_4";

							/**
							 * [tFileInputDelimited_4 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_4 end ] start
							 */

							currentComponent = "tFileInputDelimited_4";

						}
						nb_line_tFileInputDelimited_4 += fid_tFileInputDelimited_4.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/TRFDTL.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_4 != null) {
							fid_tFileInputDelimited_4.close();
						}
					}
					if (fid_tFileInputDelimited_4 != null) {
						globalMap.put("tFileInputDelimited_4_NB_LINE", nb_line_tFileInputDelimited_4);
					}

					log.info("tFileInputDelimited_4- Retrieved records count: " + nb_line_tFileInputDelimited_4 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_4 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_4", true);
				end_Hash.put("tFileInputDelimited_4", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_4 end ] stop
				 */

				/**
				 * [tMap_5 end ] start
				 */

				currentComponent = "tMap_5";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_5 - Written records count in the table 'TRFDTL': " + count_TRFDTL_tMap_5 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row13", 2, 0,
						"tFileInputDelimited_4", "tFileInputDelimited_4", "tFileInputDelimited", "tMap_5", "tMap_5",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_5 - " + ("Done."));

				ok_Hash.put("tMap_5", true);
				end_Hash.put("tMap_5", System.currentTimeMillis());

				/**
				 * [tMap_5 end ] stop
				 */

				/**
				 * [tDBOutput_5 end ] start
				 */

				currentComponent = "tDBOutput_5";

// end of generic

				resourceMap.put("finish_tDBOutput_5", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_5 = null;
				if (writer_tDBOutput_5 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_5 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_5
							.close();
					resultMap_tDBOutput_5 = writer_tDBOutput_5.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_5), container_tDBOutput_5);
				}
				if (resultMap_tDBOutput_5 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_5 : resultMap_tDBOutput_5.entrySet()) {
						switch (entry_tDBOutput_5.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_5.setComponentData("tDBOutput_5", "ERROR_MESSAGE",
									entry_tDBOutput_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_5.setComponentData("tDBOutput_5", "NB_LINE",
									entry_tDBOutput_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_5.setComponentData("tDBOutput_5", "NB_SUCCESS",
									entry_tDBOutput_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_5.setComponentData("tDBOutput_5", "NB_REJECT",
									entry_tDBOutput_5.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_5 = new StringBuilder();
							for (int i_tDBOutput_5 = 0; i_tDBOutput_5 < entry_tDBOutput_5.getKey()
									.length(); i_tDBOutput_5++) {
								char ch_tDBOutput_5 = entry_tDBOutput_5.getKey().charAt(i_tDBOutput_5);
								if (Character.isUpperCase(ch_tDBOutput_5) && i_tDBOutput_5 > 0) {
									studio_key_tDBOutput_5.append('_');
								}
								studio_key_tDBOutput_5.append(ch_tDBOutput_5);
							}
							container_tDBOutput_5.setComponentData("tDBOutput_5",
									studio_key_tDBOutput_5.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_5.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "TRFDTL", 2, 0, "tMap_5",
						"tMap_5", "tMap", "tDBOutput_5", "tDBOutput_5", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_5", true);
				end_Hash.put("tDBOutput_5", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tFileDelete_1Process(globalMap);

				/**
				 * [tDBOutput_5 end ] stop
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
				 * [tFileInputDelimited_4 finally ] start
				 */

				currentComponent = "tFileInputDelimited_4";

				/**
				 * [tFileInputDelimited_4 finally ] stop
				 */

				/**
				 * [tMap_5 finally ] start
				 */

				currentComponent = "tMap_5";

				/**
				 * [tMap_5 finally ] stop
				 */

				/**
				 * [tDBOutput_5 finally ] start
				 */

				currentComponent = "tDBOutput_5";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_5") == null) {
					if (resourceMap.get("writer_tDBOutput_5") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_5"))
									.close();
						} catch (java.io.IOException e_tDBOutput_5) {
							String errorMessage_tDBOutput_5 = "failed to release the resource in tDBOutput_5 :"
									+ e_tDBOutput_5.getMessage();
							System.err.println(errorMessage_tDBOutput_5);
						}
					}
				}

				/**
				 * [tDBOutput_5 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 1);
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/TRFDTL.zip\"");
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
				java.io.File path_tFileDelete_1 = new java.io.File("/data/talend/data_repository/TRFDTL.zip");
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
				globalMap.put("tFileDelete_1_DELETE_PATH", "/data/talend/data_repository/TRFDTL.zip");

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
								"enc:routine.encryption.key.v1:oIlsu4n3nGFi5t7crKr0E2pHE9BoCAJ6gE/66R0w6Hv3lYa6"));

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
		final TRANSFER_DETAIL_TRFDTL TRANSFER_DETAIL_TRFDTLClass = new TRANSFER_DETAIL_TRFDTL();

		int exitCode = TRANSFER_DETAIL_TRFDTLClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TRANSFER_DETAIL_TRFDTL' - Done.");
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
		log.info("TalendJob: 'TRANSFER_DETAIL_TRFDTL' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_JoEzMDZLEeqYYKudWeBa8Q");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-27T17:55:27.303104300Z");

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
			java.io.InputStream inContext = TRANSFER_DETAIL_TRFDTL.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/transfer_detail_trfdtl_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TRANSFER_DETAIL_TRFDTL.class.getClassLoader()
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
		log.info("TalendJob: 'TRANSFER_DETAIL_TRFDTL' - Started.");
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
					tDBRow_8Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
						((java.util.Map) threadLocal.get()).put("status", "end");
					}
				} catch (TalendException e_tDBRow_8) {
					globalMap.put("tDBRow_8_SUBPROCESS_STATE", -1);

					e_tDBRow_8.printStackTrace();

				} catch (java.lang.Error e_tDBRow_8) {
					globalMap.put("tDBRow_8_SUBPROCESS_STATE", -1);
					((java.util.Map) threadLocal.get()).put("status", "failure");
					throw e_tDBRow_8;

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
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : TRANSFER_DETAIL_TRFDTL");
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
		log.info("TalendJob: 'TRANSFER_DETAIL_TRFDTL' - Finished - status: " + status + " returnCode: " + returnCode);

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
 * 415522 characters generated by Talend Cloud Data Management Platform on the
 * June 27, 2023 at 1:55:27 PM EDT
 ************************************************************************************************/