
package at_talend_jobs.customer_trans_summary_atg_0_1;

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
 * Job: CUSTOMER_TRANS_SUMMARY_ATG Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class CUSTOMER_TRANS_SUMMARY_ATG implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "CUSTOMER_TRANS_SUMMARY_ATG.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(CUSTOMER_TRANS_SUMMARY_ATG.class);

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
	private final String jobName = "CUSTOMER_TRANS_SUMMARY_ATG";
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
			"_W_u1gAajEeqS3P9meBs8cg", "0.1");
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
					CUSTOMER_TRANS_SUMMARY_ATG.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(CUSTOMER_TRANS_SUMMARY_ATG.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBRow_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_9_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBConnection_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_10_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_9_onSubJobError(Exception exception, String errorComponent,
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

	public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

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
						"\nDelete  from Customer_Trans_Summary_ATG\nwhere Transaction_Date between (current_date() - 7) and (current_date() - 1)"
								+ "\n\n");

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

				props_tDBRow_10.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_10.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_10.table.setValue("tableName", "");

				props_tDBRow_10.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_10.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_10.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_10.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_10.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tDBInput_9Process(globalMap);

				/**
				 * [tDBRow_10 end ] stop
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

	public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[0];

		public String CUSTOMERNO;

		public String getCUSTOMERNO() {
			return this.CUSTOMERNO;
		}

		public Boolean CUSTOMERNOIsNullable() {
			return true;
		}

		public Boolean CUSTOMERNOIsKey() {
			return false;
		}

		public Integer CUSTOMERNOLength() {
			return null;
		}

		public Integer CUSTOMERNOPrecision() {
			return null;
		}

		public String CUSTOMERNODefault() {

			return null;

		}

		public String CUSTOMERNOComment() {

			return "";

		}

		public String CUSTOMERNOPattern() {

			return "";

		}

		public String CUSTOMERNOOriginalDbColumnName() {

			return "CUSTOMERNO";

		}

		public String CUSTOMER_ID;

		public String getCUSTOMER_ID() {
			return this.CUSTOMER_ID;
		}

		public Boolean CUSTOMER_IDIsNullable() {
			return true;
		}

		public Boolean CUSTOMER_IDIsKey() {
			return false;
		}

		public Integer CUSTOMER_IDLength() {
			return null;
		}

		public Integer CUSTOMER_IDPrecision() {
			return null;
		}

		public String CUSTOMER_IDDefault() {

			return null;

		}

		public String CUSTOMER_IDComment() {

			return "";

		}

		public String CUSTOMER_IDPattern() {

			return "";

		}

		public String CUSTOMER_IDOriginalDbColumnName() {

			return "CUSTOMER_ID";

		}

		public String ATG_ID;

		public String getATG_ID() {
			return this.ATG_ID;
		}

		public Boolean ATG_IDIsNullable() {
			return true;
		}

		public Boolean ATG_IDIsKey() {
			return false;
		}

		public Integer ATG_IDLength() {
			return null;
		}

		public Integer ATG_IDPrecision() {
			return null;
		}

		public String ATG_IDDefault() {

			return null;

		}

		public String ATG_IDComment() {

			return "";

		}

		public String ATG_IDPattern() {

			return "";

		}

		public String ATG_IDOriginalDbColumnName() {

			return "ATG_ID";

		}

		public java.util.Date TRANSACTION_DATE;

		public java.util.Date getTRANSACTION_DATE() {
			return this.TRANSACTION_DATE;
		}

		public Boolean TRANSACTION_DATEIsNullable() {
			return true;
		}

		public Boolean TRANSACTION_DATEIsKey() {
			return false;
		}

		public Integer TRANSACTION_DATELength() {
			return null;
		}

		public Integer TRANSACTION_DATEPrecision() {
			return null;
		}

		public String TRANSACTION_DATEDefault() {

			return null;

		}

		public String TRANSACTION_DATEComment() {

			return "";

		}

		public String TRANSACTION_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String TRANSACTION_DATEOriginalDbColumnName() {

			return "TRANSACTION_DATE";

		}

		public BigDecimal STORE_NO;

		public BigDecimal getSTORE_NO() {
			return this.STORE_NO;
		}

		public Boolean STORE_NOIsNullable() {
			return true;
		}

		public Boolean STORE_NOIsKey() {
			return false;
		}

		public Integer STORE_NOLength() {
			return null;
		}

		public Integer STORE_NOPrecision() {
			return null;
		}

		public String STORE_NODefault() {

			return "";

		}

		public String STORE_NOComment() {

			return "";

		}

		public String STORE_NOPattern() {

			return "";

		}

		public String STORE_NOOriginalDbColumnName() {

			return "STORE_NO";

		}

		public BigDecimal REGISTER_NO;

		public BigDecimal getREGISTER_NO() {
			return this.REGISTER_NO;
		}

		public Boolean REGISTER_NOIsNullable() {
			return true;
		}

		public Boolean REGISTER_NOIsKey() {
			return false;
		}

		public Integer REGISTER_NOLength() {
			return null;
		}

		public Integer REGISTER_NOPrecision() {
			return null;
		}

		public String REGISTER_NODefault() {

			return "";

		}

		public String REGISTER_NOComment() {

			return "";

		}

		public String REGISTER_NOPattern() {

			return "";

		}

		public String REGISTER_NOOriginalDbColumnName() {

			return "REGISTER_NO";

		}

		public BigDecimal HE_NO;

		public BigDecimal getHE_NO() {
			return this.HE_NO;
		}

		public Boolean HE_NOIsNullable() {
			return true;
		}

		public Boolean HE_NOIsKey() {
			return false;
		}

		public Integer HE_NOLength() {
			return null;
		}

		public Integer HE_NOPrecision() {
			return null;
		}

		public String HE_NODefault() {

			return "";

		}

		public String HE_NOComment() {

			return "";

		}

		public String HE_NOPattern() {

			return "";

		}

		public String HE_NOOriginalDbColumnName() {

			return "HE_NO";

		}

		public BigDecimal TRANSACTION_NO;

		public BigDecimal getTRANSACTION_NO() {
			return this.TRANSACTION_NO;
		}

		public Boolean TRANSACTION_NOIsNullable() {
			return true;
		}

		public Boolean TRANSACTION_NOIsKey() {
			return false;
		}

		public Integer TRANSACTION_NOLength() {
			return null;
		}

		public Integer TRANSACTION_NOPrecision() {
			return null;
		}

		public String TRANSACTION_NODefault() {

			return "";

		}

		public String TRANSACTION_NOComment() {

			return "";

		}

		public String TRANSACTION_NOPattern() {

			return "";

		}

		public String TRANSACTION_NOOriginalDbColumnName() {

			return "TRANSACTION_NO";

		}

		public BigDecimal TRANSACTION_ID;

		public BigDecimal getTRANSACTION_ID() {
			return this.TRANSACTION_ID;
		}

		public Boolean TRANSACTION_IDIsNullable() {
			return true;
		}

		public Boolean TRANSACTION_IDIsKey() {
			return false;
		}

		public Integer TRANSACTION_IDLength() {
			return null;
		}

		public Integer TRANSACTION_IDPrecision() {
			return null;
		}

		public String TRANSACTION_IDDefault() {

			return "";

		}

		public String TRANSACTION_IDComment() {

			return "";

		}

		public String TRANSACTION_IDPattern() {

			return "";

		}

		public String TRANSACTION_IDOriginalDbColumnName() {

			return "TRANSACTION_ID";

		}

		public Double UNITS;

		public Double getUNITS() {
			return this.UNITS;
		}

		public Boolean UNITSIsNullable() {
			return true;
		}

		public Boolean UNITSIsKey() {
			return false;
		}

		public Integer UNITSLength() {
			return null;
		}

		public Integer UNITSPrecision() {
			return null;
		}

		public String UNITSDefault() {

			return "";

		}

		public String UNITSComment() {

			return "";

		}

		public String UNITSPattern() {

			return "";

		}

		public String UNITSOriginalDbColumnName() {

			return "UNITS";

		}

		public String EMPLOYEE_FLAG;

		public String getEMPLOYEE_FLAG() {
			return this.EMPLOYEE_FLAG;
		}

		public Boolean EMPLOYEE_FLAGIsNullable() {
			return true;
		}

		public Boolean EMPLOYEE_FLAGIsKey() {
			return false;
		}

		public Integer EMPLOYEE_FLAGLength() {
			return null;
		}

		public Integer EMPLOYEE_FLAGPrecision() {
			return null;
		}

		public String EMPLOYEE_FLAGDefault() {

			return null;

		}

		public String EMPLOYEE_FLAGComment() {

			return "";

		}

		public String EMPLOYEE_FLAGPattern() {

			return "";

		}

		public String EMPLOYEE_FLAGOriginalDbColumnName() {

			return "EMPLOYEE_FLAG";

		}

		public String BOPUS_ORDER;

		public String getBOPUS_ORDER() {
			return this.BOPUS_ORDER;
		}

		public Boolean BOPUS_ORDERIsNullable() {
			return true;
		}

		public Boolean BOPUS_ORDERIsKey() {
			return false;
		}

		public Integer BOPUS_ORDERLength() {
			return null;
		}

		public Integer BOPUS_ORDERPrecision() {
			return null;
		}

		public String BOPUS_ORDERDefault() {

			return null;

		}

		public String BOPUS_ORDERComment() {

			return "";

		}

		public String BOPUS_ORDERPattern() {

			return "";

		}

		public String BOPUS_ORDEROriginalDbColumnName() {

			return "BOPUS_ORDER";

		}

		public String CONTINUITY_ORDER;

		public String getCONTINUITY_ORDER() {
			return this.CONTINUITY_ORDER;
		}

		public Boolean CONTINUITY_ORDERIsNullable() {
			return true;
		}

		public Boolean CONTINUITY_ORDERIsKey() {
			return false;
		}

		public Integer CONTINUITY_ORDERLength() {
			return null;
		}

		public Integer CONTINUITY_ORDERPrecision() {
			return null;
		}

		public String CONTINUITY_ORDERDefault() {

			return null;

		}

		public String CONTINUITY_ORDERComment() {

			return "";

		}

		public String CONTINUITY_ORDERPattern() {

			return "";

		}

		public String CONTINUITY_ORDEROriginalDbColumnName() {

			return "CONTINUITY_ORDER";

		}

		public String OMS_ORDER;

		public String getOMS_ORDER() {
			return this.OMS_ORDER;
		}

		public Boolean OMS_ORDERIsNullable() {
			return true;
		}

		public Boolean OMS_ORDERIsKey() {
			return false;
		}

		public Integer OMS_ORDERLength() {
			return null;
		}

		public Integer OMS_ORDERPrecision() {
			return null;
		}

		public String OMS_ORDERDefault() {

			return null;

		}

		public String OMS_ORDERComment() {

			return "";

		}

		public String OMS_ORDERPattern() {

			return "";

		}

		public String OMS_ORDEROriginalDbColumnName() {

			return "OMS_ORDER";

		}

		public String VOUCHER_RD;

		public String getVOUCHER_RD() {
			return this.VOUCHER_RD;
		}

		public Boolean VOUCHER_RDIsNullable() {
			return true;
		}

		public Boolean VOUCHER_RDIsKey() {
			return false;
		}

		public Integer VOUCHER_RDLength() {
			return null;
		}

		public Integer VOUCHER_RDPrecision() {
			return null;
		}

		public String VOUCHER_RDDefault() {

			return null;

		}

		public String VOUCHER_RDComment() {

			return "";

		}

		public String VOUCHER_RDPattern() {

			return "";

		}

		public String VOUCHER_RDOriginalDbColumnName() {

			return "VOUCHER_RD";

		}

		public String SUBSCRIPTION_ORDER;

		public String getSUBSCRIPTION_ORDER() {
			return this.SUBSCRIPTION_ORDER;
		}

		public Boolean SUBSCRIPTION_ORDERIsNullable() {
			return true;
		}

		public Boolean SUBSCRIPTION_ORDERIsKey() {
			return false;
		}

		public Integer SUBSCRIPTION_ORDERLength() {
			return null;
		}

		public Integer SUBSCRIPTION_ORDERPrecision() {
			return null;
		}

		public String SUBSCRIPTION_ORDERDefault() {

			return null;

		}

		public String SUBSCRIPTION_ORDERComment() {

			return "";

		}

		public String SUBSCRIPTION_ORDERPattern() {

			return "";

		}

		public String SUBSCRIPTION_ORDEROriginalDbColumnName() {

			return "SUBSCRIPTION_ORDER";

		}

		public BigDecimal TRANSACTION_TOTAL;

		public BigDecimal getTRANSACTION_TOTAL() {
			return this.TRANSACTION_TOTAL;
		}

		public Boolean TRANSACTION_TOTALIsNullable() {
			return true;
		}

		public Boolean TRANSACTION_TOTALIsKey() {
			return false;
		}

		public Integer TRANSACTION_TOTALLength() {
			return null;
		}

		public Integer TRANSACTION_TOTALPrecision() {
			return null;
		}

		public String TRANSACTION_TOTALDefault() {

			return "";

		}

		public String TRANSACTION_TOTALComment() {

			return "";

		}

		public String TRANSACTION_TOTALPattern() {

			return "";

		}

		public String TRANSACTION_TOTALOriginalDbColumnName() {

			return "TRANSACTION_TOTAL";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG.length == 0) {
						commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG.length == 0) {
						commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG) {

				try {

					int length = 0;

					this.CUSTOMERNO = readString(dis);

					this.CUSTOMER_ID = readString(dis);

					this.ATG_ID = readString(dis);

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.REGISTER_NO = (BigDecimal) dis.readObject();

					this.HE_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_ID = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.UNITS = null;
					} else {
						this.UNITS = dis.readDouble();
					}

					this.EMPLOYEE_FLAG = readString(dis);

					this.BOPUS_ORDER = readString(dis);

					this.CONTINUITY_ORDER = readString(dis);

					this.OMS_ORDER = readString(dis);

					this.VOUCHER_RD = readString(dis);

					this.SUBSCRIPTION_ORDER = readString(dis);

					this.TRANSACTION_TOTAL = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_CUSTOMER_TRANS_SUMMARY_ATG) {

				try {

					int length = 0;

					this.CUSTOMERNO = readString(dis);

					this.CUSTOMER_ID = readString(dis);

					this.ATG_ID = readString(dis);

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.REGISTER_NO = (BigDecimal) dis.readObject();

					this.HE_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_ID = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.UNITS = null;
					} else {
						this.UNITS = dis.readDouble();
					}

					this.EMPLOYEE_FLAG = readString(dis);

					this.BOPUS_ORDER = readString(dis);

					this.CONTINUITY_ORDER = readString(dis);

					this.OMS_ORDER = readString(dis);

					this.VOUCHER_RD = readString(dis);

					this.SUBSCRIPTION_ORDER = readString(dis);

					this.TRANSACTION_TOTAL = (BigDecimal) dis.readObject();

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

				writeString(this.CUSTOMERNO, dos);

				// String

				writeString(this.CUSTOMER_ID, dos);

				// String

				writeString(this.ATG_ID, dos);

				// java.util.Date

				writeDate(this.TRANSACTION_DATE, dos);

				// BigDecimal

				dos.writeObject(this.STORE_NO);

				// BigDecimal

				dos.writeObject(this.REGISTER_NO);

				// BigDecimal

				dos.writeObject(this.HE_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_ID);

				// Double

				if (this.UNITS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.UNITS);
				}

				// String

				writeString(this.EMPLOYEE_FLAG, dos);

				// String

				writeString(this.BOPUS_ORDER, dos);

				// String

				writeString(this.CONTINUITY_ORDER, dos);

				// String

				writeString(this.OMS_ORDER, dos);

				// String

				writeString(this.VOUCHER_RD, dos);

				// String

				writeString(this.SUBSCRIPTION_ORDER, dos);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_TOTAL);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.CUSTOMERNO, dos);

				// String

				writeString(this.CUSTOMER_ID, dos);

				// String

				writeString(this.ATG_ID, dos);

				// java.util.Date

				writeDate(this.TRANSACTION_DATE, dos);

				// BigDecimal

				dos.writeObject(this.STORE_NO);

				// BigDecimal

				dos.writeObject(this.REGISTER_NO);

				// BigDecimal

				dos.writeObject(this.HE_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_ID);

				// Double

				if (this.UNITS == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.UNITS);
				}

				// String

				writeString(this.EMPLOYEE_FLAG, dos);

				// String

				writeString(this.BOPUS_ORDER, dos);

				// String

				writeString(this.CONTINUITY_ORDER, dos);

				// String

				writeString(this.OMS_ORDER, dos);

				// String

				writeString(this.VOUCHER_RD, dos);

				// String

				writeString(this.SUBSCRIPTION_ORDER, dos);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_TOTAL);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("CUSTOMERNO=" + CUSTOMERNO);
			sb.append(",CUSTOMER_ID=" + CUSTOMER_ID);
			sb.append(",ATG_ID=" + ATG_ID);
			sb.append(",TRANSACTION_DATE=" + String.valueOf(TRANSACTION_DATE));
			sb.append(",STORE_NO=" + String.valueOf(STORE_NO));
			sb.append(",REGISTER_NO=" + String.valueOf(REGISTER_NO));
			sb.append(",HE_NO=" + String.valueOf(HE_NO));
			sb.append(",TRANSACTION_NO=" + String.valueOf(TRANSACTION_NO));
			sb.append(",TRANSACTION_ID=" + String.valueOf(TRANSACTION_ID));
			sb.append(",UNITS=" + String.valueOf(UNITS));
			sb.append(",EMPLOYEE_FLAG=" + EMPLOYEE_FLAG);
			sb.append(",BOPUS_ORDER=" + BOPUS_ORDER);
			sb.append(",CONTINUITY_ORDER=" + CONTINUITY_ORDER);
			sb.append(",OMS_ORDER=" + OMS_ORDER);
			sb.append(",VOUCHER_RD=" + VOUCHER_RD);
			sb.append(",SUBSCRIPTION_ORDER=" + SUBSCRIPTION_ORDER);
			sb.append(",TRANSACTION_TOTAL=" + String.valueOf(TRANSACTION_TOTAL));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (CUSTOMERNO == null) {
				sb.append("<null>");
			} else {
				sb.append(CUSTOMERNO);
			}

			sb.append("|");

			if (CUSTOMER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CUSTOMER_ID);
			}

			sb.append("|");

			if (ATG_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(ATG_ID);
			}

			sb.append("|");

			if (TRANSACTION_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANSACTION_DATE);
			}

			sb.append("|");

			if (STORE_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(STORE_NO);
			}

			sb.append("|");

			if (REGISTER_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(REGISTER_NO);
			}

			sb.append("|");

			if (HE_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(HE_NO);
			}

			sb.append("|");

			if (TRANSACTION_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANSACTION_NO);
			}

			sb.append("|");

			if (TRANSACTION_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANSACTION_ID);
			}

			sb.append("|");

			if (UNITS == null) {
				sb.append("<null>");
			} else {
				sb.append(UNITS);
			}

			sb.append("|");

			if (EMPLOYEE_FLAG == null) {
				sb.append("<null>");
			} else {
				sb.append(EMPLOYEE_FLAG);
			}

			sb.append("|");

			if (BOPUS_ORDER == null) {
				sb.append("<null>");
			} else {
				sb.append(BOPUS_ORDER);
			}

			sb.append("|");

			if (CONTINUITY_ORDER == null) {
				sb.append("<null>");
			} else {
				sb.append(CONTINUITY_ORDER);
			}

			sb.append("|");

			if (OMS_ORDER == null) {
				sb.append("<null>");
			} else {
				sb.append(OMS_ORDER);
			}

			sb.append("|");

			if (VOUCHER_RD == null) {
				sb.append("<null>");
			} else {
				sb.append(VOUCHER_RD);
			}

			sb.append("|");

			if (SUBSCRIPTION_ORDER == null) {
				sb.append("<null>");
			} else {
				sb.append(SUBSCRIPTION_ORDER);
			}

			sb.append("|");

			if (TRANSACTION_TOTAL == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANSACTION_TOTAL);
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

	public void tDBInput_9Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_9_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_9");
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

				/**
				 * [tDBOutput_9 begin ] start
				 */

				ok_Hash.put("tDBOutput_9", false);
				start_Hash.put("tDBOutput_9", System.currentTimeMillis());

				currentComponent = "tDBOutput_9";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

				int tos_count_tDBOutput_9 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_9", "tDBOutput_9", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_9 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_9 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_9 = (String) (restRequest_tDBOutput_9 != null
						? restRequest_tDBOutput_9.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_9 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_9 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_9 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_9 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_9
						.createRuntimeProperties();
				props_tDBOutput_9.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_9.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_9.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_9.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_9.setValue("useSchemaDatePattern", false);

				props_tDBOutput_9.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_9_1_fisrt {

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

				SchemaSettingTool_tDBOutput_9_1_fisrt sst_tDBOutput_9_1_fisrt = new SchemaSettingTool_tDBOutput_9_1_fisrt();

				props_tDBOutput_9.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_9_1_fisrt.getSchemaValue()));

				props_tDBOutput_9.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_9.connection.setValue("useCustomRegion", false);

				props_tDBOutput_9.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_9.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_9.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBOutput_9.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_9.table.setValue("tableName", "CUSTOMER_TRANS_SUMMARY_ATG");

				props_tDBOutput_9.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_9.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_9.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_9.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_9.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_2");

				props_tDBOutput_9.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_9_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"tDBOutput_9\",\"fields\":[{", s);

						a("\"name\":\"CUSTOMERNO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMERNO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMERNO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMERNO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CUSTOMER_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ATG_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ATG_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ATG_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ATG_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRANSACTION_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRANSACTION_DATE\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"TRANSACTION_DATE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"STORE_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"STORE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"STORE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"STORE_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REGISTER_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REGISTER_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REGISTER_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REGISTER_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"HE_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HE_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRANSACTION_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRANSACTION_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRANSACTION_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRANSACTION_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRANSACTION_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRANSACTION_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"UNITS\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UNITS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"UNITS\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UNITS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"EMPLOYEE_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EMPLOYEE_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EMPLOYEE_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EMPLOYEE_FLAG\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BOPUS_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BOPUS_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BOPUS_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BOPUS_ORDER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CONTINUITY_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CONTINUITY_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CONTINUITY_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CONTINUITY_ORDER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"OMS_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OMS_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"OMS_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OMS_ORDER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"VOUCHER_RD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"VOUCHER_RD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"VOUCHER_RD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"VOUCHER_RD\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SUBSCRIPTION_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SUBSCRIPTION_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SUBSCRIPTION_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SUBSCRIPTION_ORDER\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRANSACTION_TOTAL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_TOTAL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRANSACTION_TOTAL\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRANSACTION_TOTAL\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_9\",\"di.table.label\":\"tDBOutput_9\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_9_2_fisrt sst_tDBOutput_9_2_fisrt = new SchemaSettingTool_tDBOutput_9_2_fisrt();

				props_tDBOutput_9.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_9_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_9.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_9 = props_tDBOutput_9.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_9 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_9 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_9 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_9.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_9);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_9.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_9 = props_tDBOutput_9.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_9 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_9 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_9 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_9.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_9);
					}
				}
				globalMap.put("tDBOutput_9_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_9);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_9 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_9_MAPPINGS_URL", mappings_url_tDBOutput_9);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_9 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_9";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_9 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_9 = null;
				topology_tDBOutput_9 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_9 = def_tDBOutput_9.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_9,
						topology_tDBOutput_9);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_9 = def_tDBOutput_9
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_9 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_9.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_9 = componentRuntime_tDBOutput_9
						.initialize(container_tDBOutput_9, props_tDBOutput_9);

				if (initVr_tDBOutput_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_9.getMessage());
				}

				if (componentRuntime_tDBOutput_9 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_9 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_9;
					compDriverInitialization_tDBOutput_9.runAtDriver(container_tDBOutput_9);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_9 = null;
				if (componentRuntime_tDBOutput_9 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_9 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_9;
					if (doesNodeBelongToRequest_tDBOutput_9) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_9 = sourceOrSink_tDBOutput_9
								.validate(container_tDBOutput_9);
						if (vr_tDBOutput_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_9.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_9 = null;
				if (sourceOrSink_tDBOutput_9 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_9 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_9;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_9 = sink_tDBOutput_9
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_9) {
						writeOperation_tDBOutput_9.initialize(container_tDBOutput_9);
					}
					writer_tDBOutput_9 = writeOperation_tDBOutput_9.createWriter(container_tDBOutput_9);
					if (doesNodeBelongToRequest_tDBOutput_9) {
						writer_tDBOutput_9.open("tDBOutput_9");
					}

					resourceMap.put("writer_tDBOutput_9", writer_tDBOutput_9);
				} // end of "sourceOrSink_tDBOutput_9 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_9 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_9
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_9 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_9 = props_tDBOutput_9.getSchema(c_tDBOutput_9, false);
				incomingEnforcer_tDBOutput_9 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_9);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_9 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_9 = null;

				/**
				 * [tDBOutput_9 begin ] stop
				 */

				/**
				 * [tDBInput_9 begin ] start
				 */

				ok_Hash.put("tDBInput_9", false);
				start_Hash.put("tDBInput_9", System.currentTimeMillis());

				currentComponent = "tDBInput_9";

				int tos_count_tDBInput_9 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_9 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_9 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_9 = new StringBuilder();
							log4jParamters_tDBInput_9.append("Parameters:");
							log4jParamters_tDBInput_9.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("HOST" + " = " + "\"wva-sql-etl\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("PORT" + " = " + "\"1433\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("DB_SCHEMA" + " = " + "\"dbo\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("DBNAME" + " = " + "\"TenTenData\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("USER" + " = " + "\"talend\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:7aT7HlC5J4viXRaaUetYORY1K3DLSib9SqSaNArUekSd96PV")
									.substring(0, 4) + "...");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("TABLE" + " = " + "\"RetCatData\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("QUERY" + " = "
									+ "\"  select * from Customer_Trans_Summary_ATG  where [Transaction Date] between CONVERT(CHAR(10), DATEADD(DAY, -7, GETDATE()), 121) and CONVERT(CHAR(10), DATEADD(DAY, -1, GETDATE()), 121)    \"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CUSTOMERNO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CUSTOMER_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("ATG_ID")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRANSACTION_DATE") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("STORE_NO") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("REGISTER_NO") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("HE_NO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRANSACTION_NO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRANSACTION_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("UNITS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("EMPLOYEE_FLAG") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("BOPUS_ORDER") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CONTINUITY_ORDER") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("OMS_ORDER") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("VOUCHER_RD") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("SUBSCRIPTION_ORDER") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TRANSACTION_TOTAL") + "}]");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_9.append(" | ");
							log4jParamters_tDBInput_9.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
							log4jParamters_tDBInput_9.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_9 - " + (log4jParamters_tDBInput_9));
						}
					}
					new BytesLimit65535_tDBInput_9().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_9", "tDBInput_9", "tMSSqlInput");
					talendJobLogProcess(globalMap);
				}

				org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_9 = org.talend.designer.components.util.mssql.MSSqlUtilFactory
						.getMSSqlGenerateTimestampUtil();

				java.util.List<String> talendToDBList_tDBInput_9 = new java.util.ArrayList();
				String[] talendToDBArray_tDBInput_9 = new String[] { "FLOAT", "NUMERIC", "NUMERIC IDENTITY", "DECIMAL",
						"DECIMAL IDENTITY", "REAL" };
				java.util.Collections.addAll(talendToDBList_tDBInput_9, talendToDBArray_tDBInput_9);
				int nb_line_tDBInput_9 = 0;
				java.sql.Connection conn_tDBInput_9 = null;
				String driverClass_tDBInput_9 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBInput_9 = java.lang.Class.forName(driverClass_tDBInput_9);
				String dbUser_tDBInput_9 = "talend";

				final String decryptedPassword_tDBInput_9 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:BuCe0eIg6dV1RVkeryvgx3fNfXv8rfDHZTgp+FI0BOgc0Ykc");

				String dbPwd_tDBInput_9 = decryptedPassword_tDBInput_9;

				String port_tDBInput_9 = "1433";
				String dbname_tDBInput_9 = "TenTenData";
				String url_tDBInput_9 = "jdbc:jtds:sqlserver://" + "wva-sql-etl";
				if (!"".equals(port_tDBInput_9)) {
					url_tDBInput_9 += ":" + "1433";
				}
				if (!"".equals(dbname_tDBInput_9)) {
					url_tDBInput_9 += "//" + "TenTenData";
				}
				url_tDBInput_9 += ";appName=" + projectName + ";" + "";
				String dbschema_tDBInput_9 = "dbo";

				log.debug("tDBInput_9 - Driver ClassName: " + driverClass_tDBInput_9 + ".");

				log.debug("tDBInput_9 - Connection attempt to '" + url_tDBInput_9 + "' with the username '"
						+ dbUser_tDBInput_9 + "'.");

				conn_tDBInput_9 = java.sql.DriverManager.getConnection(url_tDBInput_9, dbUser_tDBInput_9,
						dbPwd_tDBInput_9);
				log.debug("tDBInput_9 - Connection to '" + url_tDBInput_9 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_9 = conn_tDBInput_9.createStatement();

				String dbquery_tDBInput_9 = "\nselect * from Customer_Trans_Summary_ATG\nwhere [Transaction Date] between CONVERT(CHAR(10), DATEADD(DAY, -7, GETDATE"
						+ "()), 121) and CONVERT(CHAR(10), DATEADD(DAY, -1, GETDATE()), 121)\n\n";

				log.debug("tDBInput_9 - Executing the query: '" + dbquery_tDBInput_9 + "'.");

				globalMap.put("tDBInput_9_QUERY", dbquery_tDBInput_9);
				java.sql.ResultSet rs_tDBInput_9 = null;

				try {
					rs_tDBInput_9 = stmt_tDBInput_9.executeQuery(dbquery_tDBInput_9);
					java.sql.ResultSetMetaData rsmd_tDBInput_9 = rs_tDBInput_9.getMetaData();
					int colQtyInRs_tDBInput_9 = rsmd_tDBInput_9.getColumnCount();

					String tmpContent_tDBInput_9 = null;

					log.debug("tDBInput_9 - Retrieving records from the database.");

					while (rs_tDBInput_9.next()) {
						nb_line_tDBInput_9++;

						if (colQtyInRs_tDBInput_9 < 1) {
							row9.CUSTOMERNO = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(1);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(1).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.CUSTOMERNO = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.CUSTOMERNO = tmpContent_tDBInput_9;
								}
							} else {
								row9.CUSTOMERNO = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 2) {
							row9.CUSTOMER_ID = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(2);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.CUSTOMER_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.CUSTOMER_ID = tmpContent_tDBInput_9;
								}
							} else {
								row9.CUSTOMER_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 3) {
							row9.ATG_ID = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(3);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.ATG_ID = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.ATG_ID = tmpContent_tDBInput_9;
								}
							} else {
								row9.ATG_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 4) {
							row9.TRANSACTION_DATE = null;
						} else {

							row9.TRANSACTION_DATE = mssqlGTU_tDBInput_9.getDate(rsmd_tDBInput_9, rs_tDBInput_9, 4);

						}
						if (colQtyInRs_tDBInput_9 < 5) {
							row9.STORE_NO = null;
						} else {

							row9.STORE_NO = rs_tDBInput_9.getBigDecimal(5);
							if (rs_tDBInput_9.wasNull()) {
								row9.STORE_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 6) {
							row9.REGISTER_NO = null;
						} else {

							row9.REGISTER_NO = rs_tDBInput_9.getBigDecimal(6);
							if (rs_tDBInput_9.wasNull()) {
								row9.REGISTER_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 7) {
							row9.HE_NO = null;
						} else {

							row9.HE_NO = rs_tDBInput_9.getBigDecimal(7);
							if (rs_tDBInput_9.wasNull()) {
								row9.HE_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 8) {
							row9.TRANSACTION_NO = null;
						} else {

							row9.TRANSACTION_NO = rs_tDBInput_9.getBigDecimal(8);
							if (rs_tDBInput_9.wasNull()) {
								row9.TRANSACTION_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 9) {
							row9.TRANSACTION_ID = null;
						} else {

							row9.TRANSACTION_ID = rs_tDBInput_9.getBigDecimal(9);
							if (rs_tDBInput_9.wasNull()) {
								row9.TRANSACTION_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 10) {
							row9.UNITS = null;
						} else {

							row9.UNITS = rs_tDBInput_9.getDouble(10);
							if (rs_tDBInput_9.wasNull()) {
								row9.UNITS = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 11) {
							row9.EMPLOYEE_FLAG = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(11);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(11).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.EMPLOYEE_FLAG = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.EMPLOYEE_FLAG = tmpContent_tDBInput_9;
								}
							} else {
								row9.EMPLOYEE_FLAG = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 12) {
							row9.BOPUS_ORDER = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(12);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(12).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.BOPUS_ORDER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.BOPUS_ORDER = tmpContent_tDBInput_9;
								}
							} else {
								row9.BOPUS_ORDER = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 13) {
							row9.CONTINUITY_ORDER = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(13);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(13).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.CONTINUITY_ORDER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.CONTINUITY_ORDER = tmpContent_tDBInput_9;
								}
							} else {
								row9.CONTINUITY_ORDER = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 14) {
							row9.OMS_ORDER = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(14);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(14).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.OMS_ORDER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.OMS_ORDER = tmpContent_tDBInput_9;
								}
							} else {
								row9.OMS_ORDER = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 15) {
							row9.VOUCHER_RD = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(15);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(15).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.VOUCHER_RD = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.VOUCHER_RD = tmpContent_tDBInput_9;
								}
							} else {
								row9.VOUCHER_RD = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 16) {
							row9.SUBSCRIPTION_ORDER = null;
						} else {

							tmpContent_tDBInput_9 = rs_tDBInput_9.getString(16);
							if (tmpContent_tDBInput_9 != null) {
								if (talendToDBList_tDBInput_9.contains(
										rsmd_tDBInput_9.getColumnTypeName(16).toUpperCase(java.util.Locale.ENGLISH))) {
									row9.SUBSCRIPTION_ORDER = FormatterUtils.formatUnwithE(tmpContent_tDBInput_9);
								} else {
									row9.SUBSCRIPTION_ORDER = tmpContent_tDBInput_9;
								}
							} else {
								row9.SUBSCRIPTION_ORDER = null;
							}
						}
						if (colQtyInRs_tDBInput_9 < 17) {
							row9.TRANSACTION_TOTAL = null;
						} else {

							row9.TRANSACTION_TOTAL = rs_tDBInput_9.getBigDecimal(17);
							if (rs_tDBInput_9.wasNull()) {
								row9.TRANSACTION_TOTAL = null;
							}
						}

						log.debug("tDBInput_9 - Retrieving the record " + nb_line_tDBInput_9 + ".");

						/**
						 * [tDBInput_9 begin ] stop
						 */

						/**
						 * [tDBInput_9 main ] start
						 */

						currentComponent = "tDBInput_9";

						tos_count_tDBInput_9++;

						/**
						 * [tDBInput_9 main ] stop
						 */

						/**
						 * [tDBInput_9 process_data_begin ] start
						 */

						currentComponent = "tDBInput_9";

						/**
						 * [tDBInput_9 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_9 main ] start
						 */

						currentComponent = "tDBOutput_9";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row9", "tDBInput_9", "tDBInput_9", "tMSSqlInput", "tDBOutput_9", "tDBOutput_9",
								"tSnowflakeOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
						}

						if (incomingEnforcer_tDBOutput_9 != null) {
							incomingEnforcer_tDBOutput_9.createNewRecord();
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("CUSTOMERNO") != null) {
							incomingEnforcer_tDBOutput_9.put("CUSTOMERNO", row9.CUSTOMERNO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("CUSTOMER_ID") != null) {
							incomingEnforcer_tDBOutput_9.put("CUSTOMER_ID", row9.CUSTOMER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("ATG_ID") != null) {
							incomingEnforcer_tDBOutput_9.put("ATG_ID", row9.ATG_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null && incomingEnforcer_tDBOutput_9.getRuntimeSchema()
								.getField("TRANSACTION_DATE") != null) {
							incomingEnforcer_tDBOutput_9.put("TRANSACTION_DATE", row9.TRANSACTION_DATE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("STORE_NO") != null) {
							incomingEnforcer_tDBOutput_9.put("STORE_NO", row9.STORE_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("REGISTER_NO") != null) {
							incomingEnforcer_tDBOutput_9.put("REGISTER_NO", row9.REGISTER_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("HE_NO") != null) {
							incomingEnforcer_tDBOutput_9.put("HE_NO", row9.HE_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("TRANSACTION_NO") != null) {
							incomingEnforcer_tDBOutput_9.put("TRANSACTION_NO", row9.TRANSACTION_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("TRANSACTION_ID") != null) {
							incomingEnforcer_tDBOutput_9.put("TRANSACTION_ID", row9.TRANSACTION_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("UNITS") != null) {
							incomingEnforcer_tDBOutput_9.put("UNITS", row9.UNITS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("EMPLOYEE_FLAG") != null) {
							incomingEnforcer_tDBOutput_9.put("EMPLOYEE_FLAG", row9.EMPLOYEE_FLAG);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("BOPUS_ORDER") != null) {
							incomingEnforcer_tDBOutput_9.put("BOPUS_ORDER", row9.BOPUS_ORDER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null && incomingEnforcer_tDBOutput_9.getRuntimeSchema()
								.getField("CONTINUITY_ORDER") != null) {
							incomingEnforcer_tDBOutput_9.put("CONTINUITY_ORDER", row9.CONTINUITY_ORDER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("OMS_ORDER") != null) {
							incomingEnforcer_tDBOutput_9.put("OMS_ORDER", row9.OMS_ORDER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null
								&& incomingEnforcer_tDBOutput_9.getRuntimeSchema().getField("VOUCHER_RD") != null) {
							incomingEnforcer_tDBOutput_9.put("VOUCHER_RD", row9.VOUCHER_RD);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null && incomingEnforcer_tDBOutput_9.getRuntimeSchema()
								.getField("SUBSCRIPTION_ORDER") != null) {
							incomingEnforcer_tDBOutput_9.put("SUBSCRIPTION_ORDER", row9.SUBSCRIPTION_ORDER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_9 != null && incomingEnforcer_tDBOutput_9.getRuntimeSchema()
								.getField("TRANSACTION_TOTAL") != null) {
							incomingEnforcer_tDBOutput_9.put("TRANSACTION_TOTAL", row9.TRANSACTION_TOTAL);
						}

						org.apache.avro.generic.IndexedRecord data_tDBOutput_9 = null;
						if (incomingEnforcer_tDBOutput_9 != null) {
							data_tDBOutput_9 = incomingEnforcer_tDBOutput_9.getCurrentRecord();
						}

						if (writer_tDBOutput_9 != null && data_tDBOutput_9 != null) {
							writer_tDBOutput_9.write(data_tDBOutput_9);
						}

						nb_line_tDBOutput_9++;

						tos_count_tDBOutput_9++;

						/**
						 * [tDBOutput_9 main ] stop
						 */

						/**
						 * [tDBOutput_9 process_data_begin ] start
						 */

						currentComponent = "tDBOutput_9";

						/**
						 * [tDBOutput_9 process_data_begin ] stop
						 */

						/**
						 * [tDBOutput_9 process_data_end ] start
						 */

						currentComponent = "tDBOutput_9";

						/**
						 * [tDBOutput_9 process_data_end ] stop
						 */

						/**
						 * [tDBInput_9 process_data_end ] start
						 */

						currentComponent = "tDBInput_9";

						/**
						 * [tDBInput_9 process_data_end ] stop
						 */

						/**
						 * [tDBInput_9 end ] start
						 */

						currentComponent = "tDBInput_9";

					}
				} finally {
					if (rs_tDBInput_9 != null) {
						rs_tDBInput_9.close();
					}
					if (stmt_tDBInput_9 != null) {
						stmt_tDBInput_9.close();
					}
					if (conn_tDBInput_9 != null && !conn_tDBInput_9.isClosed()) {

						log.debug("tDBInput_9 - Closing the connection to the database.");

						conn_tDBInput_9.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_9 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_9_NB_LINE", nb_line_tDBInput_9);
				log.debug("tDBInput_9 - Retrieved records count: " + nb_line_tDBInput_9 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_9 - " + ("Done."));

				ok_Hash.put("tDBInput_9", true);
				end_Hash.put("tDBInput_9", System.currentTimeMillis());

				/**
				 * [tDBInput_9 end ] stop
				 */

				/**
				 * [tDBOutput_9 end ] start
				 */

				currentComponent = "tDBOutput_9";

// end of generic

				resourceMap.put("finish_tDBOutput_9", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_9 = null;
				if (writer_tDBOutput_9 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_9 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_9
							.close();
					resultMap_tDBOutput_9 = writer_tDBOutput_9.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_9), container_tDBOutput_9);
				}
				if (resultMap_tDBOutput_9 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_9 : resultMap_tDBOutput_9.entrySet()) {
						switch (entry_tDBOutput_9.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_9.setComponentData("tDBOutput_9", "ERROR_MESSAGE",
									entry_tDBOutput_9.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_9.setComponentData("tDBOutput_9", "NB_LINE",
									entry_tDBOutput_9.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_9.setComponentData("tDBOutput_9", "NB_SUCCESS",
									entry_tDBOutput_9.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_9.setComponentData("tDBOutput_9", "NB_REJECT",
									entry_tDBOutput_9.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_9 = new StringBuilder();
							for (int i_tDBOutput_9 = 0; i_tDBOutput_9 < entry_tDBOutput_9.getKey()
									.length(); i_tDBOutput_9++) {
								char ch_tDBOutput_9 = entry_tDBOutput_9.getKey().charAt(i_tDBOutput_9);
								if (Character.isUpperCase(ch_tDBOutput_9) && i_tDBOutput_9 > 0) {
									studio_key_tDBOutput_9.append('_');
								}
								studio_key_tDBOutput_9.append(ch_tDBOutput_9);
							}
							container_tDBOutput_9.setComponentData("tDBOutput_9",
									studio_key_tDBOutput_9.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_9.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
						"tDBInput_9", "tDBInput_9", "tMSSqlInput", "tDBOutput_9", "tDBOutput_9", "tSnowflakeOutput",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_9", true);
				end_Hash.put("tDBOutput_9", System.currentTimeMillis());

				/**
				 * [tDBOutput_9 end ] stop
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
				 * [tDBInput_9 finally ] start
				 */

				currentComponent = "tDBInput_9";

				/**
				 * [tDBInput_9 finally ] stop
				 */

				/**
				 * [tDBOutput_9 finally ] start
				 */

				currentComponent = "tDBOutput_9";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_9") == null) {
					if (resourceMap.get("writer_tDBOutput_9") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_9"))
									.close();
						} catch (java.io.IOException e_tDBOutput_9) {
							String errorMessage_tDBOutput_9 = "failed to release the resource in tDBOutput_9 :"
									+ e_tDBOutput_9.getMessage();
							System.err.println(errorMessage_tDBOutput_9);
						}
					}
				}

				/**
				 * [tDBOutput_9 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_9_SUBPROCESS_STATE", 1);
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
				tDBConnection_2Process(globalMap);

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

				int tos_count_tDBConnection_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "tDBConnection_2", "tSnowflakeConnection");
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

				props_tDBConnection_2.setValue("warehouse", "vsi_wh_xs");

				props_tDBConnection_2.setValue("db", context.SF_prod_database);

				props_tDBConnection_2.setValue("schemaName", "PROD_DATA");

				props_tDBConnection_2.setValue("role", "sysadmin");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:Z6U3yYIEC24LCHh2MJeYQYy8UvXQ0d9Go4f28D/zwf+aHZ0F"));

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

				tos_count_tDBConnection_2++;

				/**
				 * [tDBConnection_2 main ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_2";

				/**
				 * [tDBConnection_2 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_end ] start
				 */

				currentComponent = "tDBConnection_2";

				/**
				 * [tDBConnection_2 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_2 end ] start
				 */

				currentComponent = "tDBConnection_2";

// end of generic

				ok_Hash.put("tDBConnection_2", true);
				end_Hash.put("tDBConnection_2", System.currentTimeMillis());

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
		final CUSTOMER_TRANS_SUMMARY_ATG CUSTOMER_TRANS_SUMMARY_ATGClass = new CUSTOMER_TRANS_SUMMARY_ATG();

		int exitCode = CUSTOMER_TRANS_SUMMARY_ATGClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'CUSTOMER_TRANS_SUMMARY_ATG' - Done.");
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
		log.info("TalendJob: 'CUSTOMER_TRANS_SUMMARY_ATG' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_W_u1gAajEeqS3P9meBs8cg");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-16T13:15:27.730587800Z");

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
			java.io.InputStream inContext = CUSTOMER_TRANS_SUMMARY_ATG.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/customer_trans_summary_atg_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = CUSTOMER_TRANS_SUMMARY_ATG.class.getClassLoader()
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
		log.info("TalendJob: 'CUSTOMER_TRANS_SUMMARY_ATG' - Started.");
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
					tDBRow_10Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
						((java.util.Map) threadLocal.get()).put("status", "end");
					}
				} catch (TalendException e_tDBRow_10) {
					globalMap.put("tDBRow_10_SUBPROCESS_STATE", -1);

					e_tDBRow_10.printStackTrace();

				} catch (java.lang.Error e_tDBRow_10) {
					globalMap.put("tDBRow_10_SUBPROCESS_STATE", -1);
					((java.util.Map) threadLocal.get()).put("status", "failure");
					throw e_tDBRow_10;

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
					+ " bytes memory increase when running : CUSTOMER_TRANS_SUMMARY_ATG");
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
		log.info("TalendJob: 'CUSTOMER_TRANS_SUMMARY_ATG' - Finished - status: " + status + " returnCode: "
				+ returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {

	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

		connections.put("tDBConnection_2_connection", globalMap.get("tDBConnection_2_connection"));
		connections.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES",
				globalMap.get("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES"));

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
 * 189010 characters generated by Talend Cloud Data Management Platform on the
 * June 16, 2023 at 9:15:27 AM EDT
 ************************************************************************************************/