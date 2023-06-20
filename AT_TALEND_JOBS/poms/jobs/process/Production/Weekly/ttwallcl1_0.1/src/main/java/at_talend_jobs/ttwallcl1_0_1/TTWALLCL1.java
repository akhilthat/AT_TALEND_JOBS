
package at_talend_jobs.ttwallcl1_0_1;

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
 * Job: TTWALLCL1 Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class TTWALLCL1 implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "TTWALLCL1.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(TTWALLCL1.class);

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
	private final String jobName = "TTWALLCL1";
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
			"_Tpe3oAWAEeqgh6rCafRRhA", "0.1");
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
					TTWALLCL1.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(TTWALLCL1.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_12_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_12_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_11_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_10_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_10_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_7_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_7_onSubJobError(exception, errorComponent, globalMap);
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

	public void tFileInputDelimited_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_8_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_9_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_9_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBInput_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_8_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_6_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_6_onSubJobError(exception, errorComponent, globalMap);
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

	public void tFileInputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
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

	public void tDBRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tFileDelete_3_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_12_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_5_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_10_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_7_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_8_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_9_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_5_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_5_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_6_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBRow_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileDelete_3_onSubJobError(Exception exception, String errorComponent,
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
				globalMap.remove("tDBRow_1_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_10_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_2_SUBPROCESS_STATE");
				globalMap.remove("tDBRow_5_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if (globalMap instanceof java.util.HashMap) {
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				} else {
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;

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
				String name_tDBRow_5 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
				Thread thread_tDBRow_5 = new Thread(new ThreadGroup(name_tDBRow_5), name_tDBRow_5) {
					public void run() {
						java.util.Map threadRunResultMap = new java.util.HashMap();
						threadRunResultMap.put("errorCode", null);
						threadRunResultMap.put("status", "");
						threadLocal.set(threadRunResultMap);

						try {

							mdcInfo.forEach(org.slf4j.MDC::put);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_5' starts.");

							tDBRow_5Process(concurrentMap_tParallelize_1);

							log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_5' is done.");

						} catch (TalendException e) {

							log.error("tParallelize_1 - " + e.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_5_SUBPROCESS_STATE", -1);
							e.printStackTrace();
						} catch (java.lang.Error error) {

							log.error("tParallelize_1 - " + error.getMessage());

							concurrentMap_tParallelize_1.put("tDBRow_5_SUBPROCESS_STATE", -1);
							error.printStackTrace();
						} finally {
							runningThreadCount.add(-1);
						}
					}
				};
				thread_tDBRow_5.start();
				mt_tParallelize_1.put("tDBRow_5", thread_tDBRow_5);
				while ((((globalMap.get("tDBRow_1_SUBPROCESS_STATE") == null) ? true
						: ((Integer) globalMap.get("tDBRow_1_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_10_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_10_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_2_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_2_SUBPROCESS_STATE") == 0))
						|| ((globalMap.get("tDBRow_5_SUBPROCESS_STATE") == null) ? true
								: ((Integer) globalMap.get("tDBRow_5_SUBPROCESS_STATE") == 0))
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
						"DELETE from DC_REORDER_POINT_R4DCINP\nWHERE LOAD_DATE = CURRENT_DATE()");

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBInput_12Process(globalMap);

				/**
				 * [tDBRow_1 end ] stop
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

	public static class row20Struct implements routines.system.IPersistableRow<row20Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public float R4SKU;

		public float getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return false;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return 9;
		}

		public Integer R4SKUPrecision() {
			return 0;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public float R4LOCID;

		public float getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return false;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return 5;
		}

		public Integer R4LOCIDPrecision() {
			return 0;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public float R4MAX;

		public float getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return false;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return 9;
		}

		public Integer R4MAXPrecision() {
			return 0;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public float R4MAXORD;

		public float getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return false;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return 9;
		}

		public Integer R4MAXORDPrecision() {
			return 0;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public float R4VENDLT;

		public float getR4VENDLT() {
			return this.R4VENDLT;
		}

		public Boolean R4VENDLTIsNullable() {
			return false;
		}

		public Boolean R4VENDLTIsKey() {
			return false;
		}

		public Integer R4VENDLTLength() {
			return 9;
		}

		public Integer R4VENDLTPrecision() {
			return 0;
		}

		public String R4VENDLTDefault() {

			return "";

		}

		public String R4VENDLTComment() {

			return "";

		}

		public String R4VENDLTPattern() {

			return "";

		}

		public String R4VENDLTOriginalDbColumnName() {

			return "R4VENDLT";

		}

		public float R4VENDRP;

		public float getR4VENDRP() {
			return this.R4VENDRP;
		}

		public Boolean R4VENDRPIsNullable() {
			return false;
		}

		public Boolean R4VENDRPIsKey() {
			return false;
		}

		public Integer R4VENDRPLength() {
			return 9;
		}

		public Integer R4VENDRPPrecision() {
			return 0;
		}

		public String R4VENDRPDefault() {

			return "";

		}

		public String R4VENDRPComment() {

			return "";

		}

		public String R4VENDRPPattern() {

			return "";

		}

		public String R4VENDRPOriginalDbColumnName() {

			return "R4VENDRP";

		}

		public float R4RETFC;

		public float getR4RETFC() {
			return this.R4RETFC;
		}

		public Boolean R4RETFCIsNullable() {
			return false;
		}

		public Boolean R4RETFCIsKey() {
			return false;
		}

		public Integer R4RETFCLength() {
			return 11;
		}

		public Integer R4RETFCPrecision() {
			return 2;
		}

		public String R4RETFCDefault() {

			return "";

		}

		public String R4RETFCComment() {

			return "";

		}

		public String R4RETFCPattern() {

			return "";

		}

		public String R4RETFCOriginalDbColumnName() {

			return "R4RETFC";

		}

		public float R4DIRFC;

		public float getR4DIRFC() {
			return this.R4DIRFC;
		}

		public Boolean R4DIRFCIsNullable() {
			return false;
		}

		public Boolean R4DIRFCIsKey() {
			return false;
		}

		public Integer R4DIRFCLength() {
			return 11;
		}

		public Integer R4DIRFCPrecision() {
			return 2;
		}

		public String R4DIRFCDefault() {

			return "";

		}

		public String R4DIRFCComment() {

			return "";

		}

		public String R4DIRFCPattern() {

			return "";

		}

		public String R4DIRFCOriginalDbColumnName() {

			return "R4DIRFC";

		}

		public float R4RETOR;

		public float getR4RETOR() {
			return this.R4RETOR;
		}

		public Boolean R4RETORIsNullable() {
			return false;
		}

		public Boolean R4RETORIsKey() {
			return false;
		}

		public Integer R4RETORLength() {
			return 11;
		}

		public Integer R4RETORPrecision() {
			return 2;
		}

		public String R4RETORDefault() {

			return "";

		}

		public String R4RETORComment() {

			return "";

		}

		public String R4RETORPattern() {

			return "";

		}

		public String R4RETOROriginalDbColumnName() {

			return "R4RETOR";

		}

		public float R4MINOR;

		public float getR4MINOR() {
			return this.R4MINOR;
		}

		public Boolean R4MINORIsNullable() {
			return false;
		}

		public Boolean R4MINORIsKey() {
			return false;
		}

		public Integer R4MINORLength() {
			return 9;
		}

		public Integer R4MINORPrecision() {
			return 0;
		}

		public String R4MINORDefault() {

			return "";

		}

		public String R4MINORComment() {

			return "";

		}

		public String R4MINORPattern() {

			return "";

		}

		public String R4MINOROriginalDbColumnName() {

			return "R4MINOR";

		}

		public String R4OADTE;

		public String getR4OADTE() {
			return this.R4OADTE;
		}

		public Boolean R4OADTEIsNullable() {
			return false;
		}

		public Boolean R4OADTEIsKey() {
			return false;
		}

		public Integer R4OADTELength() {
			return 11;
		}

		public Integer R4OADTEPrecision() {
			return 0;
		}

		public String R4OADTEDefault() {

			return null;

		}

		public String R4OADTEComment() {

			return "";

		}

		public String R4OADTEPattern() {

			return "";

		}

		public String R4OADTEOriginalDbColumnName() {

			return "R4OADTE";

		}

		public String R4RADTE;

		public String getR4RADTE() {
			return this.R4RADTE;
		}

		public Boolean R4RADTEIsNullable() {
			return false;
		}

		public Boolean R4RADTEIsKey() {
			return false;
		}

		public Integer R4RADTELength() {
			return 11;
		}

		public Integer R4RADTEPrecision() {
			return 0;
		}

		public String R4RADTEDefault() {

			return "";

		}

		public String R4RADTEComment() {

			return "";

		}

		public String R4RADTEPattern() {

			return "";

		}

		public String R4RADTEOriginalDbColumnName() {

			return "R4RADTE";

		}

		public float R4FILLR;

		public float getR4FILLR() {
			return this.R4FILLR;
		}

		public Boolean R4FILLRIsNullable() {
			return false;
		}

		public Boolean R4FILLRIsKey() {
			return false;
		}

		public Integer R4FILLRLength() {
			return 11;
		}

		public Integer R4FILLRPrecision() {
			return 2;
		}

		public String R4FILLRDefault() {

			return "";

		}

		public String R4FILLRComment() {

			return "";

		}

		public String R4FILLRPattern() {

			return "";

		}

		public String R4FILLROriginalDbColumnName() {

			return "R4FILLR";

		}

		public float R4DMRSV;

		public float getR4DMRSV() {
			return this.R4DMRSV;
		}

		public Boolean R4DMRSVIsNullable() {
			return false;
		}

		public Boolean R4DMRSVIsKey() {
			return false;
		}

		public Integer R4DMRSVLength() {
			return 9;
		}

		public Integer R4DMRSVPrecision() {
			return 0;
		}

		public String R4DMRSVDefault() {

			return "";

		}

		public String R4DMRSVComment() {

			return "";

		}

		public String R4DMRSVPattern() {

			return "";

		}

		public String R4DMRSVOriginalDbColumnName() {

			return "R4DMRSV";

		}

		public float R4SYSROP;

		public float getR4SYSROP() {
			return this.R4SYSROP;
		}

		public Boolean R4SYSROPIsNullable() {
			return false;
		}

		public Boolean R4SYSROPIsKey() {
			return false;
		}

		public Integer R4SYSROPLength() {
			return 9;
		}

		public Integer R4SYSROPPrecision() {
			return 0;
		}

		public String R4SYSROPDefault() {

			return "";

		}

		public String R4SYSROPComment() {

			return "";

		}

		public String R4SYSROPPattern() {

			return "";

		}

		public String R4SYSROPOriginalDbColumnName() {

			return "R4SYSROP";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.R4SKU = dis.readFloat();

					this.R4LOCID = dis.readFloat();

					this.R4MAX = dis.readFloat();

					this.R4MAXORD = dis.readFloat();

					this.R4VENDLT = dis.readFloat();

					this.R4VENDRP = dis.readFloat();

					this.R4RETFC = dis.readFloat();

					this.R4DIRFC = dis.readFloat();

					this.R4RETOR = dis.readFloat();

					this.R4MINOR = dis.readFloat();

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					this.R4FILLR = dis.readFloat();

					this.R4DMRSV = dis.readFloat();

					this.R4SYSROP = dis.readFloat();

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.R4SKU = dis.readFloat();

					this.R4LOCID = dis.readFloat();

					this.R4MAX = dis.readFloat();

					this.R4MAXORD = dis.readFloat();

					this.R4VENDLT = dis.readFloat();

					this.R4VENDRP = dis.readFloat();

					this.R4RETFC = dis.readFloat();

					this.R4DIRFC = dis.readFloat();

					this.R4RETOR = dis.readFloat();

					this.R4MINOR = dis.readFloat();

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					this.R4FILLR = dis.readFloat();

					this.R4DMRSV = dis.readFloat();

					this.R4SYSROP = dis.readFloat();

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// float

				dos.writeFloat(this.R4SKU);

				// float

				dos.writeFloat(this.R4LOCID);

				// float

				dos.writeFloat(this.R4MAX);

				// float

				dos.writeFloat(this.R4MAXORD);

				// float

				dos.writeFloat(this.R4VENDLT);

				// float

				dos.writeFloat(this.R4VENDRP);

				// float

				dos.writeFloat(this.R4RETFC);

				// float

				dos.writeFloat(this.R4DIRFC);

				// float

				dos.writeFloat(this.R4RETOR);

				// float

				dos.writeFloat(this.R4MINOR);

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// float

				dos.writeFloat(this.R4FILLR);

				// float

				dos.writeFloat(this.R4DMRSV);

				// float

				dos.writeFloat(this.R4SYSROP);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// float

				dos.writeFloat(this.R4SKU);

				// float

				dos.writeFloat(this.R4LOCID);

				// float

				dos.writeFloat(this.R4MAX);

				// float

				dos.writeFloat(this.R4MAXORD);

				// float

				dos.writeFloat(this.R4VENDLT);

				// float

				dos.writeFloat(this.R4VENDRP);

				// float

				dos.writeFloat(this.R4RETFC);

				// float

				dos.writeFloat(this.R4DIRFC);

				// float

				dos.writeFloat(this.R4RETOR);

				// float

				dos.writeFloat(this.R4MINOR);

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// float

				dos.writeFloat(this.R4FILLR);

				// float

				dos.writeFloat(this.R4DMRSV);

				// float

				dos.writeFloat(this.R4SYSROP);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4VENDLT=" + String.valueOf(R4VENDLT));
			sb.append(",R4VENDRP=" + String.valueOf(R4VENDRP));
			sb.append(",R4RETFC=" + String.valueOf(R4RETFC));
			sb.append(",R4DIRFC=" + String.valueOf(R4DIRFC));
			sb.append(",R4RETOR=" + String.valueOf(R4RETOR));
			sb.append(",R4MINOR=" + String.valueOf(R4MINOR));
			sb.append(",R4OADTE=" + R4OADTE);
			sb.append(",R4RADTE=" + R4RADTE);
			sb.append(",R4FILLR=" + String.valueOf(R4FILLR));
			sb.append(",R4DMRSV=" + String.valueOf(R4DMRSV));
			sb.append(",R4SYSROP=" + String.valueOf(R4SYSROP));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			sb.append(R4SKU);

			sb.append("|");

			sb.append(R4LOCID);

			sb.append("|");

			sb.append(R4MAX);

			sb.append("|");

			sb.append(R4MAXORD);

			sb.append("|");

			sb.append(R4VENDLT);

			sb.append("|");

			sb.append(R4VENDRP);

			sb.append("|");

			sb.append(R4RETFC);

			sb.append("|");

			sb.append(R4DIRFC);

			sb.append("|");

			sb.append(R4RETOR);

			sb.append("|");

			sb.append(R4MINOR);

			sb.append("|");

			if (R4OADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4OADTE);
			}

			sb.append("|");

			if (R4RADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RADTE);
			}

			sb.append("|");

			sb.append(R4FILLR);

			sb.append("|");

			sb.append(R4DMRSV);

			sb.append("|");

			sb.append(R4SYSROP);

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row20Struct other) {

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

	public void tDBInput_12Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_12_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_12");
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

				row20Struct row20 = new row20Struct();

				/**
				 * [tFileOutputDelimited_10 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_10", false);
				start_Hash.put("tFileOutputDelimited_10", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_10";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row20");

				int tos_count_tFileOutputDelimited_10 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_10 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_10 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_10 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_10.append("Parameters:");
							log4jParamters_tFileOutputDelimited_10.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/R4DCINP.csv\"");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							log4jParamters_tFileOutputDelimited_10.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_10.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_10 - " + (log4jParamters_tFileOutputDelimited_10));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_10().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_10", "tFileOutputDelimited_10", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_10 = "";
				fileName_tFileOutputDelimited_10 = (new java.io.File("/data/talend/data_repository/R4DCINP.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_10 = null;
				String extension_tFileOutputDelimited_10 = null;
				String directory_tFileOutputDelimited_10 = null;
				if ((fileName_tFileOutputDelimited_10.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_10.lastIndexOf(".") < fileName_tFileOutputDelimited_10
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10;
						extension_tFileOutputDelimited_10 = "";
					} else {
						fullName_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10.substring(0,
								fileName_tFileOutputDelimited_10.lastIndexOf("."));
						extension_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10
								.substring(fileName_tFileOutputDelimited_10.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10.substring(0,
							fileName_tFileOutputDelimited_10.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_10.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10.substring(0,
								fileName_tFileOutputDelimited_10.lastIndexOf("."));
						extension_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10
								.substring(fileName_tFileOutputDelimited_10.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_10 = fileName_tFileOutputDelimited_10;
						extension_tFileOutputDelimited_10 = "";
					}
					directory_tFileOutputDelimited_10 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_10 = true;
				java.io.File filetFileOutputDelimited_10 = new java.io.File(fileName_tFileOutputDelimited_10);
				globalMap.put("tFileOutputDelimited_10_FILE_NAME", fileName_tFileOutputDelimited_10);
				int nb_line_tFileOutputDelimited_10 = 0;
				int splitedFileNo_tFileOutputDelimited_10 = 0;
				int currentRow_tFileOutputDelimited_10 = 0;

				final String OUT_DELIM_tFileOutputDelimited_10 = /**
																	 * Start field
																	 * tFileOutputDelimited_10:FIELDSEPARATOR
																	 */
						","/** End field tFileOutputDelimited_10:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_10 = /**
																		 * Start field
																		 * tFileOutputDelimited_10:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_10:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_10 != null
						&& directory_tFileOutputDelimited_10.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_10 = new java.io.File(directory_tFileOutputDelimited_10);
					if (!dir_tFileOutputDelimited_10.exists()) {
						log.info("tFileOutputDelimited_10 - Creating directory '"
								+ dir_tFileOutputDelimited_10.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_10.mkdirs();
						log.info("tFileOutputDelimited_10 - The directory '"
								+ dir_tFileOutputDelimited_10.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_10 = new java.io.File(fileName_tFileOutputDelimited_10);
				String zipName_tFileOutputDelimited_10 = fullName_tFileOutputDelimited_10 + ".zip";
				java.io.File file_tFileOutputDelimited_10 = new java.io.File(zipName_tFileOutputDelimited_10);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_10 = null;
				java.io.Writer outtFileOutputDelimited_10 = null;

				if (file_tFileOutputDelimited_10.exists()) {
					file_tFileOutputDelimited_10.delete();
				}
				zipOut_tFileOutputDelimited_10 = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(
						new java.io.FileOutputStream(zipName_tFileOutputDelimited_10)));
				zipOut_tFileOutputDelimited_10
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_10.getName()));
				outtFileOutputDelimited_10 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_10, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_10", outtFileOutputDelimited_10);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_10.length() == 0) {
						outtFileOutputDelimited_10.write("R4SKU");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4LOCID");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4MAX");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4MAXORD");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4VENDLT");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4VENDRP");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4RETFC");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4DIRFC");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4RETOR");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4MINOR");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4OADTE");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4RADTE");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4FILLR");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4DMRSV");
						outtFileOutputDelimited_10.write(OUT_DELIM_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.write("R4SYSROP");
						outtFileOutputDelimited_10.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_10);
						outtFileOutputDelimited_10.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_10", nb_line_tFileOutputDelimited_10);

				/**
				 * [tFileOutputDelimited_10 begin ] stop
				 */

				/**
				 * [tDBInput_12 begin ] start
				 */

				ok_Hash.put("tDBInput_12", false);
				start_Hash.put("tDBInput_12", System.currentTimeMillis());

				currentComponent = "tDBInput_12";

				int tos_count_tDBInput_12 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_12 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_12 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_12 = new StringBuilder();
							log4jParamters_tDBInput_12.append("Parameters:");
							log4jParamters_tDBInput_12.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("QUERY" + " = " + "\"select * from MM4R5LIB.R4DCINP\"");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4SKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4LOCID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAX")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAXORD") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4VENDLT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4VENDRP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4RETFC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4DIRFC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4RETOR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4MINOR") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4OADTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4RADTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4FILLR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4DMRSV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4SYSROP") + "}]");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_12.append(" | ");
							log4jParamters_tDBInput_12.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_12.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_12 - " + (log4jParamters_tDBInput_12));
						}
					}
					new BytesLimit65535_tDBInput_12().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_12", "tDBInput_12", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_12 = 0;
				java.sql.Connection conn_tDBInput_12 = null;
				String driverClass_tDBInput_12 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_12 = java.lang.Class.forName(driverClass_tDBInput_12);
				String dbUser_tDBInput_12 = context.jda_user_name;

				final String decryptedPassword_tDBInput_12 = context.jda_password;

				String dbPwd_tDBInput_12 = decryptedPassword_tDBInput_12;

				String url_tDBInput_12 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_12 - Driver ClassName: " + driverClass_tDBInput_12 + ".");

				log.debug("tDBInput_12 - Connection attempt to '" + url_tDBInput_12 + "' with the username '"
						+ dbUser_tDBInput_12 + "'.");

				conn_tDBInput_12 = java.sql.DriverManager.getConnection(url_tDBInput_12, dbUser_tDBInput_12,
						dbPwd_tDBInput_12);
				log.debug("tDBInput_12 - Connection to '" + url_tDBInput_12 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_12 = conn_tDBInput_12.createStatement();

				String dbquery_tDBInput_12 = "select * from MM4R5LIB.R4DCINP";

				log.debug("tDBInput_12 - Executing the query: '" + dbquery_tDBInput_12 + "'.");

				globalMap.put("tDBInput_12_QUERY", dbquery_tDBInput_12);
				java.sql.ResultSet rs_tDBInput_12 = null;

				try {
					rs_tDBInput_12 = stmt_tDBInput_12.executeQuery(dbquery_tDBInput_12);
					java.sql.ResultSetMetaData rsmd_tDBInput_12 = rs_tDBInput_12.getMetaData();
					int colQtyInRs_tDBInput_12 = rsmd_tDBInput_12.getColumnCount();

					String tmpContent_tDBInput_12 = null;

					log.debug("tDBInput_12 - Retrieving records from the database.");

					while (rs_tDBInput_12.next()) {
						nb_line_tDBInput_12++;

						if (colQtyInRs_tDBInput_12 < 1) {
							row20.R4SKU = 0;
						} else {

							row20.R4SKU = rs_tDBInput_12.getFloat(1);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 2) {
							row20.R4LOCID = 0;
						} else {

							row20.R4LOCID = rs_tDBInput_12.getFloat(2);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 3) {
							row20.R4MAX = 0;
						} else {

							row20.R4MAX = rs_tDBInput_12.getFloat(3);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 4) {
							row20.R4MAXORD = 0;
						} else {

							row20.R4MAXORD = rs_tDBInput_12.getFloat(4);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 5) {
							row20.R4VENDLT = 0;
						} else {

							row20.R4VENDLT = rs_tDBInput_12.getFloat(5);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 6) {
							row20.R4VENDRP = 0;
						} else {

							row20.R4VENDRP = rs_tDBInput_12.getFloat(6);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 7) {
							row20.R4RETFC = 0;
						} else {

							row20.R4RETFC = rs_tDBInput_12.getFloat(7);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 8) {
							row20.R4DIRFC = 0;
						} else {

							row20.R4DIRFC = rs_tDBInput_12.getFloat(8);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 9) {
							row20.R4RETOR = 0;
						} else {

							row20.R4RETOR = rs_tDBInput_12.getFloat(9);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 10) {
							row20.R4MINOR = 0;
						} else {

							row20.R4MINOR = rs_tDBInput_12.getFloat(10);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 11) {
							row20.R4OADTE = null;
						} else {

							row20.R4OADTE = routines.system.JDBCUtil.getString(rs_tDBInput_12, 11, false);
						}
						if (colQtyInRs_tDBInput_12 < 12) {
							row20.R4RADTE = null;
						} else {

							row20.R4RADTE = routines.system.JDBCUtil.getString(rs_tDBInput_12, 12, false);
						}
						if (colQtyInRs_tDBInput_12 < 13) {
							row20.R4FILLR = 0;
						} else {

							row20.R4FILLR = rs_tDBInput_12.getFloat(13);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 14) {
							row20.R4DMRSV = 0;
						} else {

							row20.R4DMRSV = rs_tDBInput_12.getFloat(14);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_12 < 15) {
							row20.R4SYSROP = 0;
						} else {

							row20.R4SYSROP = rs_tDBInput_12.getFloat(15);
							if (rs_tDBInput_12.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}

						log.debug("tDBInput_12 - Retrieving the record " + nb_line_tDBInput_12 + ".");

						/**
						 * [tDBInput_12 begin ] stop
						 */

						/**
						 * [tDBInput_12 main ] start
						 */

						currentComponent = "tDBInput_12";

						tos_count_tDBInput_12++;

						/**
						 * [tDBInput_12 main ] stop
						 */

						/**
						 * [tDBInput_12 process_data_begin ] start
						 */

						currentComponent = "tDBInput_12";

						/**
						 * [tDBInput_12 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_10 main ] start
						 */

						currentComponent = "tFileOutputDelimited_10";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row20", "tDBInput_12", "tDBInput_12", "tAS400Input", "tFileOutputDelimited_10",
								"tFileOutputDelimited_10", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row20 - " + (row20 == null ? "" : row20.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_10 = new StringBuilder();
						sb_tFileOutputDelimited_10.append(row20.R4SKU);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4LOCID);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4MAX);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4MAXORD);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4VENDLT);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4VENDRP);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4RETFC);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4DIRFC);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4RETOR);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4MINOR);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						if (row20.R4OADTE != null) {
							sb_tFileOutputDelimited_10.append(row20.R4OADTE);
						}
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						if (row20.R4RADTE != null) {
							sb_tFileOutputDelimited_10.append(row20.R4RADTE);
						}
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4FILLR);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4DMRSV);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_tFileOutputDelimited_10);
						sb_tFileOutputDelimited_10.append(row20.R4SYSROP);
						sb_tFileOutputDelimited_10.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_10);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_10++;
							resourceMap.put("nb_line_tFileOutputDelimited_10", nb_line_tFileOutputDelimited_10);

							outtFileOutputDelimited_10.write(sb_tFileOutputDelimited_10.toString());
							log.debug("tFileOutputDelimited_10 - Writing the record " + nb_line_tFileOutputDelimited_10
									+ ".");

						}

						tos_count_tFileOutputDelimited_10++;

						/**
						 * [tFileOutputDelimited_10 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_10 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_10";

						/**
						 * [tFileOutputDelimited_10 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_10 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_10";

						/**
						 * [tFileOutputDelimited_10 process_data_end ] stop
						 */

						/**
						 * [tDBInput_12 process_data_end ] start
						 */

						currentComponent = "tDBInput_12";

						/**
						 * [tDBInput_12 process_data_end ] stop
						 */

						/**
						 * [tDBInput_12 end ] start
						 */

						currentComponent = "tDBInput_12";

					}
				} finally {
					if (rs_tDBInput_12 != null) {
						rs_tDBInput_12.close();
					}
					if (stmt_tDBInput_12 != null) {
						stmt_tDBInput_12.close();
					}
					if (conn_tDBInput_12 != null && !conn_tDBInput_12.isClosed()) {

						log.debug("tDBInput_12 - Closing the connection to the database.");

						conn_tDBInput_12.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_12 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_12_NB_LINE", nb_line_tDBInput_12);
				log.debug("tDBInput_12 - Retrieved records count: " + nb_line_tDBInput_12 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_12 - " + ("Done."));

				ok_Hash.put("tDBInput_12", true);
				end_Hash.put("tDBInput_12", System.currentTimeMillis());

				/**
				 * [tDBInput_12 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_10 end ] start
				 */

				currentComponent = "tFileOutputDelimited_10";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_10 != null) {
						outtFileOutputDelimited_10.flush();
						outtFileOutputDelimited_10.close();
					}

					globalMap.put("tFileOutputDelimited_10_NB_LINE", nb_line_tFileOutputDelimited_10);
					globalMap.put("tFileOutputDelimited_10_FILE_NAME", fileName_tFileOutputDelimited_10);

				}

				resourceMap.put("finish_tFileOutputDelimited_10", true);

				log.debug("tFileOutputDelimited_10 - Written records count: " + nb_line_tFileOutputDelimited_10 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row20", 2, 0,
						"tDBInput_12", "tDBInput_12", "tAS400Input", "tFileOutputDelimited_10",
						"tFileOutputDelimited_10", "tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_10 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_10", true);
				end_Hash.put("tFileOutputDelimited_10", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_10 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_12:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk6", 0, "ok");
			}

			tFileInputDelimited_5Process(globalMap);

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
				 * [tDBInput_12 finally ] start
				 */

				currentComponent = "tDBInput_12";

				/**
				 * [tDBInput_12 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_10 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_10";

				if (resourceMap.get("finish_tFileOutputDelimited_10") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_10 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_10");
						if (outtFileOutputDelimited_10 != null) {
							outtFileOutputDelimited_10.flush();
							outtFileOutputDelimited_10.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_10 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_12_SUBPROCESS_STATE", 1);
	}

	public static class R4DCINPStruct implements routines.system.IPersistableRow<R4DCINPStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public Double R4SKU;

		public Double getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return true;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return null;
		}

		public Integer R4SKUPrecision() {
			return null;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public Double R4LOCID;

		public Double getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return true;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return null;
		}

		public Integer R4LOCIDPrecision() {
			return null;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public Double R4MAX;

		public Double getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return true;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return null;
		}

		public Integer R4MAXPrecision() {
			return null;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public Double R4MAXORD;

		public Double getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return true;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return null;
		}

		public Integer R4MAXORDPrecision() {
			return null;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public Double R4VENDLT;

		public Double getR4VENDLT() {
			return this.R4VENDLT;
		}

		public Boolean R4VENDLTIsNullable() {
			return true;
		}

		public Boolean R4VENDLTIsKey() {
			return false;
		}

		public Integer R4VENDLTLength() {
			return null;
		}

		public Integer R4VENDLTPrecision() {
			return null;
		}

		public String R4VENDLTDefault() {

			return "";

		}

		public String R4VENDLTComment() {

			return "";

		}

		public String R4VENDLTPattern() {

			return "";

		}

		public String R4VENDLTOriginalDbColumnName() {

			return "R4VENDLT";

		}

		public Double R4VENDRP;

		public Double getR4VENDRP() {
			return this.R4VENDRP;
		}

		public Boolean R4VENDRPIsNullable() {
			return true;
		}

		public Boolean R4VENDRPIsKey() {
			return false;
		}

		public Integer R4VENDRPLength() {
			return null;
		}

		public Integer R4VENDRPPrecision() {
			return null;
		}

		public String R4VENDRPDefault() {

			return "";

		}

		public String R4VENDRPComment() {

			return "";

		}

		public String R4VENDRPPattern() {

			return "";

		}

		public String R4VENDRPOriginalDbColumnName() {

			return "R4VENDRP";

		}

		public Double R4RETFC;

		public Double getR4RETFC() {
			return this.R4RETFC;
		}

		public Boolean R4RETFCIsNullable() {
			return true;
		}

		public Boolean R4RETFCIsKey() {
			return false;
		}

		public Integer R4RETFCLength() {
			return null;
		}

		public Integer R4RETFCPrecision() {
			return null;
		}

		public String R4RETFCDefault() {

			return "";

		}

		public String R4RETFCComment() {

			return "";

		}

		public String R4RETFCPattern() {

			return "";

		}

		public String R4RETFCOriginalDbColumnName() {

			return "R4RETFC";

		}

		public Double R4DIRFC;

		public Double getR4DIRFC() {
			return this.R4DIRFC;
		}

		public Boolean R4DIRFCIsNullable() {
			return true;
		}

		public Boolean R4DIRFCIsKey() {
			return false;
		}

		public Integer R4DIRFCLength() {
			return null;
		}

		public Integer R4DIRFCPrecision() {
			return null;
		}

		public String R4DIRFCDefault() {

			return "";

		}

		public String R4DIRFCComment() {

			return "";

		}

		public String R4DIRFCPattern() {

			return "";

		}

		public String R4DIRFCOriginalDbColumnName() {

			return "R4DIRFC";

		}

		public Double R4RETOR;

		public Double getR4RETOR() {
			return this.R4RETOR;
		}

		public Boolean R4RETORIsNullable() {
			return true;
		}

		public Boolean R4RETORIsKey() {
			return false;
		}

		public Integer R4RETORLength() {
			return null;
		}

		public Integer R4RETORPrecision() {
			return null;
		}

		public String R4RETORDefault() {

			return "";

		}

		public String R4RETORComment() {

			return "";

		}

		public String R4RETORPattern() {

			return "";

		}

		public String R4RETOROriginalDbColumnName() {

			return "R4RETOR";

		}

		public Double R4MINOR;

		public Double getR4MINOR() {
			return this.R4MINOR;
		}

		public Boolean R4MINORIsNullable() {
			return true;
		}

		public Boolean R4MINORIsKey() {
			return false;
		}

		public Integer R4MINORLength() {
			return null;
		}

		public Integer R4MINORPrecision() {
			return null;
		}

		public String R4MINORDefault() {

			return "";

		}

		public String R4MINORComment() {

			return "";

		}

		public String R4MINORPattern() {

			return "";

		}

		public String R4MINOROriginalDbColumnName() {

			return "R4MINOR";

		}

		public String R4OADTE;

		public String getR4OADTE() {
			return this.R4OADTE;
		}

		public Boolean R4OADTEIsNullable() {
			return true;
		}

		public Boolean R4OADTEIsKey() {
			return false;
		}

		public Integer R4OADTELength() {
			return null;
		}

		public Integer R4OADTEPrecision() {
			return null;
		}

		public String R4OADTEDefault() {

			return "";

		}

		public String R4OADTEComment() {

			return "";

		}

		public String R4OADTEPattern() {

			return "";

		}

		public String R4OADTEOriginalDbColumnName() {

			return "R4OADTE";

		}

		public String R4RADTE;

		public String getR4RADTE() {
			return this.R4RADTE;
		}

		public Boolean R4RADTEIsNullable() {
			return true;
		}

		public Boolean R4RADTEIsKey() {
			return false;
		}

		public Integer R4RADTELength() {
			return null;
		}

		public Integer R4RADTEPrecision() {
			return null;
		}

		public String R4RADTEDefault() {

			return "";

		}

		public String R4RADTEComment() {

			return "";

		}

		public String R4RADTEPattern() {

			return "";

		}

		public String R4RADTEOriginalDbColumnName() {

			return "R4RADTE";

		}

		public Double R4FILLR;

		public Double getR4FILLR() {
			return this.R4FILLR;
		}

		public Boolean R4FILLRIsNullable() {
			return true;
		}

		public Boolean R4FILLRIsKey() {
			return false;
		}

		public Integer R4FILLRLength() {
			return null;
		}

		public Integer R4FILLRPrecision() {
			return null;
		}

		public String R4FILLRDefault() {

			return "";

		}

		public String R4FILLRComment() {

			return "";

		}

		public String R4FILLRPattern() {

			return "";

		}

		public String R4FILLROriginalDbColumnName() {

			return "R4FILLR";

		}

		public Double R4DMRSV;

		public Double getR4DMRSV() {
			return this.R4DMRSV;
		}

		public Boolean R4DMRSVIsNullable() {
			return true;
		}

		public Boolean R4DMRSVIsKey() {
			return false;
		}

		public Integer R4DMRSVLength() {
			return null;
		}

		public Integer R4DMRSVPrecision() {
			return null;
		}

		public String R4DMRSVDefault() {

			return "";

		}

		public String R4DMRSVComment() {

			return "";

		}

		public String R4DMRSVPattern() {

			return "";

		}

		public String R4DMRSVOriginalDbColumnName() {

			return "R4DMRSV";

		}

		public Double R4SYSROP;

		public Double getR4SYSROP() {
			return this.R4SYSROP;
		}

		public Boolean R4SYSROPIsNullable() {
			return true;
		}

		public Boolean R4SYSROPIsKey() {
			return false;
		}

		public Integer R4SYSROPLength() {
			return null;
		}

		public Integer R4SYSROPPrecision() {
			return null;
		}

		public String R4SYSROPDefault() {

			return "";

		}

		public String R4SYSROPComment() {

			return "";

		}

		public String R4SYSROPPattern() {

			return "";

		}

		public String R4SYSROPOriginalDbColumnName() {

			return "R4SYSROP";

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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDLT = null;
					} else {
						this.R4VENDLT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDRP = null;
					} else {
						this.R4VENDRP = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETFC = null;
					} else {
						this.R4RETFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DIRFC = null;
					} else {
						this.R4DIRFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETOR = null;
					} else {
						this.R4RETOR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MINOR = null;
					} else {
						this.R4MINOR = dis.readDouble();
					}

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.R4FILLR = null;
					} else {
						this.R4FILLR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DMRSV = null;
					} else {
						this.R4DMRSV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4SYSROP = null;
					} else {
						this.R4SYSROP = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDLT = null;
					} else {
						this.R4VENDLT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDRP = null;
					} else {
						this.R4VENDRP = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETFC = null;
					} else {
						this.R4RETFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DIRFC = null;
					} else {
						this.R4DIRFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETOR = null;
					} else {
						this.R4RETOR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MINOR = null;
					} else {
						this.R4MINOR = dis.readDouble();
					}

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.R4FILLR = null;
					} else {
						this.R4FILLR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DMRSV = null;
					} else {
						this.R4DMRSV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4SYSROP = null;
					} else {
						this.R4SYSROP = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4VENDLT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDLT);
				}

				// Double

				if (this.R4VENDRP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDRP);
				}

				// Double

				if (this.R4RETFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETFC);
				}

				// Double

				if (this.R4DIRFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DIRFC);
				}

				// Double

				if (this.R4RETOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETOR);
				}

				// Double

				if (this.R4MINOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MINOR);
				}

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// Double

				if (this.R4FILLR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4FILLR);
				}

				// Double

				if (this.R4DMRSV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DMRSV);
				}

				// Double

				if (this.R4SYSROP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SYSROP);
				}

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4VENDLT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDLT);
				}

				// Double

				if (this.R4VENDRP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDRP);
				}

				// Double

				if (this.R4RETFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETFC);
				}

				// Double

				if (this.R4DIRFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DIRFC);
				}

				// Double

				if (this.R4RETOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETOR);
				}

				// Double

				if (this.R4MINOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MINOR);
				}

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// Double

				if (this.R4FILLR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4FILLR);
				}

				// Double

				if (this.R4DMRSV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DMRSV);
				}

				// Double

				if (this.R4SYSROP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SYSROP);
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
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4VENDLT=" + String.valueOf(R4VENDLT));
			sb.append(",R4VENDRP=" + String.valueOf(R4VENDRP));
			sb.append(",R4RETFC=" + String.valueOf(R4RETFC));
			sb.append(",R4DIRFC=" + String.valueOf(R4DIRFC));
			sb.append(",R4RETOR=" + String.valueOf(R4RETOR));
			sb.append(",R4MINOR=" + String.valueOf(R4MINOR));
			sb.append(",R4OADTE=" + R4OADTE);
			sb.append(",R4RADTE=" + R4RADTE);
			sb.append(",R4FILLR=" + String.valueOf(R4FILLR));
			sb.append(",R4DMRSV=" + String.valueOf(R4DMRSV));
			sb.append(",R4SYSROP=" + String.valueOf(R4SYSROP));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (R4SKU == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SKU);
			}

			sb.append("|");

			if (R4LOCID == null) {
				sb.append("<null>");
			} else {
				sb.append(R4LOCID);
			}

			sb.append("|");

			if (R4MAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAX);
			}

			sb.append("|");

			if (R4MAXORD == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAXORD);
			}

			sb.append("|");

			if (R4VENDLT == null) {
				sb.append("<null>");
			} else {
				sb.append(R4VENDLT);
			}

			sb.append("|");

			if (R4VENDRP == null) {
				sb.append("<null>");
			} else {
				sb.append(R4VENDRP);
			}

			sb.append("|");

			if (R4RETFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RETFC);
			}

			sb.append("|");

			if (R4DIRFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4DIRFC);
			}

			sb.append("|");

			if (R4RETOR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RETOR);
			}

			sb.append("|");

			if (R4MINOR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MINOR);
			}

			sb.append("|");

			if (R4OADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4OADTE);
			}

			sb.append("|");

			if (R4RADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RADTE);
			}

			sb.append("|");

			if (R4FILLR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4FILLR);
			}

			sb.append("|");

			if (R4DMRSV == null) {
				sb.append("<null>");
			} else {
				sb.append(R4DMRSV);
			}

			sb.append("|");

			if (R4SYSROP == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SYSROP);
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
		public int compareTo(R4DCINPStruct other) {

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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public Double R4SKU;

		public Double getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return true;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return null;
		}

		public Integer R4SKUPrecision() {
			return null;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public Double R4LOCID;

		public Double getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return true;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return null;
		}

		public Integer R4LOCIDPrecision() {
			return null;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public Double R4MAX;

		public Double getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return true;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return null;
		}

		public Integer R4MAXPrecision() {
			return null;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public Double R4MAXORD;

		public Double getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return true;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return null;
		}

		public Integer R4MAXORDPrecision() {
			return null;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public Double R4VENDLT;

		public Double getR4VENDLT() {
			return this.R4VENDLT;
		}

		public Boolean R4VENDLTIsNullable() {
			return true;
		}

		public Boolean R4VENDLTIsKey() {
			return false;
		}

		public Integer R4VENDLTLength() {
			return null;
		}

		public Integer R4VENDLTPrecision() {
			return null;
		}

		public String R4VENDLTDefault() {

			return "";

		}

		public String R4VENDLTComment() {

			return "";

		}

		public String R4VENDLTPattern() {

			return "";

		}

		public String R4VENDLTOriginalDbColumnName() {

			return "R4VENDLT";

		}

		public Double R4VENDRP;

		public Double getR4VENDRP() {
			return this.R4VENDRP;
		}

		public Boolean R4VENDRPIsNullable() {
			return true;
		}

		public Boolean R4VENDRPIsKey() {
			return false;
		}

		public Integer R4VENDRPLength() {
			return null;
		}

		public Integer R4VENDRPPrecision() {
			return null;
		}

		public String R4VENDRPDefault() {

			return "";

		}

		public String R4VENDRPComment() {

			return "";

		}

		public String R4VENDRPPattern() {

			return "";

		}

		public String R4VENDRPOriginalDbColumnName() {

			return "R4VENDRP";

		}

		public Double R4RETFC;

		public Double getR4RETFC() {
			return this.R4RETFC;
		}

		public Boolean R4RETFCIsNullable() {
			return true;
		}

		public Boolean R4RETFCIsKey() {
			return false;
		}

		public Integer R4RETFCLength() {
			return null;
		}

		public Integer R4RETFCPrecision() {
			return null;
		}

		public String R4RETFCDefault() {

			return "";

		}

		public String R4RETFCComment() {

			return "";

		}

		public String R4RETFCPattern() {

			return "";

		}

		public String R4RETFCOriginalDbColumnName() {

			return "R4RETFC";

		}

		public Double R4DIRFC;

		public Double getR4DIRFC() {
			return this.R4DIRFC;
		}

		public Boolean R4DIRFCIsNullable() {
			return true;
		}

		public Boolean R4DIRFCIsKey() {
			return false;
		}

		public Integer R4DIRFCLength() {
			return null;
		}

		public Integer R4DIRFCPrecision() {
			return null;
		}

		public String R4DIRFCDefault() {

			return "";

		}

		public String R4DIRFCComment() {

			return "";

		}

		public String R4DIRFCPattern() {

			return "";

		}

		public String R4DIRFCOriginalDbColumnName() {

			return "R4DIRFC";

		}

		public Double R4RETOR;

		public Double getR4RETOR() {
			return this.R4RETOR;
		}

		public Boolean R4RETORIsNullable() {
			return true;
		}

		public Boolean R4RETORIsKey() {
			return false;
		}

		public Integer R4RETORLength() {
			return null;
		}

		public Integer R4RETORPrecision() {
			return null;
		}

		public String R4RETORDefault() {

			return "";

		}

		public String R4RETORComment() {

			return "";

		}

		public String R4RETORPattern() {

			return "";

		}

		public String R4RETOROriginalDbColumnName() {

			return "R4RETOR";

		}

		public Double R4MINOR;

		public Double getR4MINOR() {
			return this.R4MINOR;
		}

		public Boolean R4MINORIsNullable() {
			return true;
		}

		public Boolean R4MINORIsKey() {
			return false;
		}

		public Integer R4MINORLength() {
			return null;
		}

		public Integer R4MINORPrecision() {
			return null;
		}

		public String R4MINORDefault() {

			return "";

		}

		public String R4MINORComment() {

			return "";

		}

		public String R4MINORPattern() {

			return "";

		}

		public String R4MINOROriginalDbColumnName() {

			return "R4MINOR";

		}

		public String R4OADTE;

		public String getR4OADTE() {
			return this.R4OADTE;
		}

		public Boolean R4OADTEIsNullable() {
			return true;
		}

		public Boolean R4OADTEIsKey() {
			return false;
		}

		public Integer R4OADTELength() {
			return null;
		}

		public Integer R4OADTEPrecision() {
			return null;
		}

		public String R4OADTEDefault() {

			return null;

		}

		public String R4OADTEComment() {

			return "";

		}

		public String R4OADTEPattern() {

			return "";

		}

		public String R4OADTEOriginalDbColumnName() {

			return "R4OADTE";

		}

		public String R4RADTE;

		public String getR4RADTE() {
			return this.R4RADTE;
		}

		public Boolean R4RADTEIsNullable() {
			return true;
		}

		public Boolean R4RADTEIsKey() {
			return false;
		}

		public Integer R4RADTELength() {
			return null;
		}

		public Integer R4RADTEPrecision() {
			return null;
		}

		public String R4RADTEDefault() {

			return null;

		}

		public String R4RADTEComment() {

			return "";

		}

		public String R4RADTEPattern() {

			return "";

		}

		public String R4RADTEOriginalDbColumnName() {

			return "R4RADTE";

		}

		public Double R4FILLR;

		public Double getR4FILLR() {
			return this.R4FILLR;
		}

		public Boolean R4FILLRIsNullable() {
			return true;
		}

		public Boolean R4FILLRIsKey() {
			return false;
		}

		public Integer R4FILLRLength() {
			return null;
		}

		public Integer R4FILLRPrecision() {
			return null;
		}

		public String R4FILLRDefault() {

			return "";

		}

		public String R4FILLRComment() {

			return "";

		}

		public String R4FILLRPattern() {

			return "";

		}

		public String R4FILLROriginalDbColumnName() {

			return "R4FILLR";

		}

		public Double R4DMRSV;

		public Double getR4DMRSV() {
			return this.R4DMRSV;
		}

		public Boolean R4DMRSVIsNullable() {
			return true;
		}

		public Boolean R4DMRSVIsKey() {
			return false;
		}

		public Integer R4DMRSVLength() {
			return null;
		}

		public Integer R4DMRSVPrecision() {
			return null;
		}

		public String R4DMRSVDefault() {

			return "";

		}

		public String R4DMRSVComment() {

			return "";

		}

		public String R4DMRSVPattern() {

			return "";

		}

		public String R4DMRSVOriginalDbColumnName() {

			return "R4DMRSV";

		}

		public Double R4SYSROP;

		public Double getR4SYSROP() {
			return this.R4SYSROP;
		}

		public Boolean R4SYSROPIsNullable() {
			return true;
		}

		public Boolean R4SYSROPIsKey() {
			return false;
		}

		public Integer R4SYSROPLength() {
			return null;
		}

		public Integer R4SYSROPPrecision() {
			return null;
		}

		public String R4SYSROPDefault() {

			return "";

		}

		public String R4SYSROPComment() {

			return "";

		}

		public String R4SYSROPPattern() {

			return "";

		}

		public String R4SYSROPOriginalDbColumnName() {

			return "R4SYSROP";

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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDLT = null;
					} else {
						this.R4VENDLT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDRP = null;
					} else {
						this.R4VENDRP = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETFC = null;
					} else {
						this.R4RETFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DIRFC = null;
					} else {
						this.R4DIRFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETOR = null;
					} else {
						this.R4RETOR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MINOR = null;
					} else {
						this.R4MINOR = dis.readDouble();
					}

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.R4FILLR = null;
					} else {
						this.R4FILLR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DMRSV = null;
					} else {
						this.R4DMRSV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4SYSROP = null;
					} else {
						this.R4SYSROP = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDLT = null;
					} else {
						this.R4VENDLT = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4VENDRP = null;
					} else {
						this.R4VENDRP = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETFC = null;
					} else {
						this.R4RETFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DIRFC = null;
					} else {
						this.R4DIRFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4RETOR = null;
					} else {
						this.R4RETOR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MINOR = null;
					} else {
						this.R4MINOR = dis.readDouble();
					}

					this.R4OADTE = readString(dis);

					this.R4RADTE = readString(dis);

					length = dis.readByte();
					if (length == -1) {
						this.R4FILLR = null;
					} else {
						this.R4FILLR = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4DMRSV = null;
					} else {
						this.R4DMRSV = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4SYSROP = null;
					} else {
						this.R4SYSROP = dis.readDouble();
					}

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4VENDLT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDLT);
				}

				// Double

				if (this.R4VENDRP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDRP);
				}

				// Double

				if (this.R4RETFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETFC);
				}

				// Double

				if (this.R4DIRFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DIRFC);
				}

				// Double

				if (this.R4RETOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETOR);
				}

				// Double

				if (this.R4MINOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MINOR);
				}

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// Double

				if (this.R4FILLR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4FILLR);
				}

				// Double

				if (this.R4DMRSV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DMRSV);
				}

				// Double

				if (this.R4SYSROP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SYSROP);
				}

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4VENDLT == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDLT);
				}

				// Double

				if (this.R4VENDRP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4VENDRP);
				}

				// Double

				if (this.R4RETFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETFC);
				}

				// Double

				if (this.R4DIRFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DIRFC);
				}

				// Double

				if (this.R4RETOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4RETOR);
				}

				// Double

				if (this.R4MINOR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MINOR);
				}

				// String

				writeString(this.R4OADTE, dos);

				// String

				writeString(this.R4RADTE, dos);

				// Double

				if (this.R4FILLR == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4FILLR);
				}

				// Double

				if (this.R4DMRSV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4DMRSV);
				}

				// Double

				if (this.R4SYSROP == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SYSROP);
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
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4VENDLT=" + String.valueOf(R4VENDLT));
			sb.append(",R4VENDRP=" + String.valueOf(R4VENDRP));
			sb.append(",R4RETFC=" + String.valueOf(R4RETFC));
			sb.append(",R4DIRFC=" + String.valueOf(R4DIRFC));
			sb.append(",R4RETOR=" + String.valueOf(R4RETOR));
			sb.append(",R4MINOR=" + String.valueOf(R4MINOR));
			sb.append(",R4OADTE=" + R4OADTE);
			sb.append(",R4RADTE=" + R4RADTE);
			sb.append(",R4FILLR=" + String.valueOf(R4FILLR));
			sb.append(",R4DMRSV=" + String.valueOf(R4DMRSV));
			sb.append(",R4SYSROP=" + String.valueOf(R4SYSROP));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (R4SKU == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SKU);
			}

			sb.append("|");

			if (R4LOCID == null) {
				sb.append("<null>");
			} else {
				sb.append(R4LOCID);
			}

			sb.append("|");

			if (R4MAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAX);
			}

			sb.append("|");

			if (R4MAXORD == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAXORD);
			}

			sb.append("|");

			if (R4VENDLT == null) {
				sb.append("<null>");
			} else {
				sb.append(R4VENDLT);
			}

			sb.append("|");

			if (R4VENDRP == null) {
				sb.append("<null>");
			} else {
				sb.append(R4VENDRP);
			}

			sb.append("|");

			if (R4RETFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RETFC);
			}

			sb.append("|");

			if (R4DIRFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4DIRFC);
			}

			sb.append("|");

			if (R4RETOR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RETOR);
			}

			sb.append("|");

			if (R4MINOR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MINOR);
			}

			sb.append("|");

			if (R4OADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4OADTE);
			}

			sb.append("|");

			if (R4RADTE == null) {
				sb.append("<null>");
			} else {
				sb.append(R4RADTE);
			}

			sb.append("|");

			if (R4FILLR == null) {
				sb.append("<null>");
			} else {
				sb.append(R4FILLR);
			}

			sb.append("|");

			if (R4DMRSV == null) {
				sb.append("<null>");
			} else {
				sb.append(R4DMRSV);
			}

			sb.append("|");

			if (R4SYSROP == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SYSROP);
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

	public void tFileInputDelimited_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_5");
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
				R4DCINPStruct R4DCINP = new R4DCINPStruct();

				/**
				 * [tDBOutput_11 begin ] start
				 */

				ok_Hash.put("tDBOutput_11", false);
				start_Hash.put("tDBOutput_11", System.currentTimeMillis());

				currentComponent = "tDBOutput_11";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "R4DCINP");

				int tos_count_tDBOutput_11 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_11", "tDBOutput_11", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_11 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_11 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_11 = (String) (restRequest_tDBOutput_11 != null
						? restRequest_tDBOutput_11.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_11 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_11 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_11 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_11 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_11
						.createRuntimeProperties();
				props_tDBOutput_11.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_11.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_11.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_11.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_11.setValue("useSchemaDatePattern", false);

				props_tDBOutput_11.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_11_1_fisrt {

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

				SchemaSettingTool_tDBOutput_11_1_fisrt sst_tDBOutput_11_1_fisrt = new SchemaSettingTool_tDBOutput_11_1_fisrt();

				props_tDBOutput_11.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_11_1_fisrt.getSchemaValue()));

				props_tDBOutput_11.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_11.connection.setValue("useCustomRegion", false);

				props_tDBOutput_11.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_11.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_11.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_11.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_11.table.setValue("tableName", "DC_REORDER_POINT_R4DCINP");

				props_tDBOutput_11.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_11.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_11.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_11.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_11.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_11.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_11_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"DC_REORDER_POINT_R4DCINP\",\"fields\":[{", s);

						a("\"name\":\"R4SKU\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4SKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4LOCID\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4LOCID\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4MAX\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4MAX\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4MAXORD\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4MAXORD\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4VENDLT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4VENDLT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4VENDRP\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4VENDRP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4RETFC\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4RETFC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4DIRFC\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4DIRFC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4RETOR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4RETOR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4MINOR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4MINOR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4OADTE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":11,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"R4OADTE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4RADTE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":11,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"R4RADTE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4FILLR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4FILLR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4DMRSV\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4DMRSV\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"R4SYSROP\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"R4SYSROP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_11_2_fisrt sst_tDBOutput_11_2_fisrt = new SchemaSettingTool_tDBOutput_11_2_fisrt();

				props_tDBOutput_11.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_11_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_11.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_11 = props_tDBOutput_11.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_11 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_11 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_11 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_11.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_11);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_11.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_11 = props_tDBOutput_11.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_11 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_11 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_11 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_11.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_11);
					}
				}
				globalMap.put("tDBOutput_11_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_11);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_11 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_11_MAPPINGS_URL", mappings_url_tDBOutput_11);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_11 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_11";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_11 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_11 = null;
				topology_tDBOutput_11 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_11 = def_tDBOutput_11.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_11,
						topology_tDBOutput_11);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_11 = def_tDBOutput_11
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_11 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_11.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_11 = componentRuntime_tDBOutput_11
						.initialize(container_tDBOutput_11, props_tDBOutput_11);

				if (initVr_tDBOutput_11.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_11.getMessage());
				}

				if (componentRuntime_tDBOutput_11 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_11 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_11;
					compDriverInitialization_tDBOutput_11.runAtDriver(container_tDBOutput_11);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_11 = null;
				if (componentRuntime_tDBOutput_11 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_11 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_11;
					if (doesNodeBelongToRequest_tDBOutput_11) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_11 = sourceOrSink_tDBOutput_11
								.validate(container_tDBOutput_11);
						if (vr_tDBOutput_11.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_11.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_11 = null;
				if (sourceOrSink_tDBOutput_11 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_11 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_11;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_11 = sink_tDBOutput_11
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_11) {
						writeOperation_tDBOutput_11.initialize(container_tDBOutput_11);
					}
					writer_tDBOutput_11 = writeOperation_tDBOutput_11.createWriter(container_tDBOutput_11);
					if (doesNodeBelongToRequest_tDBOutput_11) {
						writer_tDBOutput_11.open("tDBOutput_11");
					}

					resourceMap.put("writer_tDBOutput_11", writer_tDBOutput_11);
				} // end of "sourceOrSink_tDBOutput_11 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_11 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_11
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_11 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_11 = props_tDBOutput_11.getSchema(c_tDBOutput_11, false);
				incomingEnforcer_tDBOutput_11 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_11);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_11 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_11 = null;

				/**
				 * [tDBOutput_11 begin ] stop
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
					java.util.Date var1;
				}
				Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_R4DCINP_tMap_1 = 0;

				R4DCINPStruct R4DCINP_tmp = new R4DCINPStruct();
// ###############################

				/**
				 * [tMap_1 begin ] stop
				 */

				/**
				 * [tFileInputDelimited_5 begin ] start
				 */

				ok_Hash.put("tFileInputDelimited_5", false);
				start_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());

				currentComponent = "tFileInputDelimited_5";

				int tos_count_tFileInputDelimited_5 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_5 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileInputDelimited_5 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileInputDelimited_5 = new StringBuilder();
							log4jParamters_tFileInputDelimited_5.append("Parameters:");
							log4jParamters_tFileInputDelimited_5
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/R4DCINP.zip\"");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("HEADER" + " = " + "1");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("LIMIT" + " = " + "");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("REMOVE_EMPTY_ROW" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("UNCOMPRESS" + " = " + "true");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4SKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4LOCID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAX")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAXORD") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4VENDLT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4VENDRP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4RETFC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4DIRFC")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4RETOR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4MINOR") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4OADTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4RADTE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4FILLR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4DMRSV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("R4SYSROP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LOAD_DATE") + "}]");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("CHECK_FIELDS_NUM" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("CHECK_DATE" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("SPLITRECORD" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							log4jParamters_tFileInputDelimited_5.append("ENABLE_DECODE" + " = " + "false");
							log4jParamters_tFileInputDelimited_5.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileInputDelimited_5 - " + (log4jParamters_tFileInputDelimited_5));
						}
					}
					new BytesLimit65535_tFileInputDelimited_5().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileInputDelimited_5", "tFileInputDelimited_5", "tFileInputDelimited");
					talendJobLogProcess(globalMap);
				}

				final routines.system.RowState rowstate_tFileInputDelimited_5 = new routines.system.RowState();

				int nb_line_tFileInputDelimited_5 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_5 = null;
				int limit_tFileInputDelimited_5 = -1;
				try {

					Object filename_tFileInputDelimited_5 = "/data/talend/data_repository/R4DCINP.zip";
					java.util.zip.ZipInputStream zis_tFileInputDelimited_5 = null;
					try {
						if (filename_tFileInputDelimited_5 instanceof java.io.InputStream) {
							zis_tFileInputDelimited_5 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(
											(java.io.InputStream) filename_tFileInputDelimited_5));
						} else {
							zis_tFileInputDelimited_5 = new java.util.zip.ZipInputStream(
									new java.io.BufferedInputStream(new java.io.FileInputStream(
											String.valueOf(filename_tFileInputDelimited_5))));
						}
					} catch (java.lang.Exception e) {
						globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE", e.getMessage());

						throw e;

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_5 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_5 = zis_tFileInputDelimited_5.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE", e.getMessage());

							throw e;

						}
						if (entry_tFileInputDelimited_5 == null) {
							break;
						}
						if (entry_tFileInputDelimited_5.isDirectory()) { // directory
							continue;
						}
						try {
							fid_tFileInputDelimited_5 = new org.talend.fileprocess.FileInputDelimited(
									zis_tFileInputDelimited_5, "ISO-8859-15", ",", "\n", false, 1, 0,

									limit_tFileInputDelimited_5, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_5 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_5 != null && fid_tFileInputDelimited_5.nextRecord()) {
							rowstate_tFileInputDelimited_5.reset();

							row1 = null;

							boolean whetherReject_tFileInputDelimited_5 = false;
							row1 = new row1Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_5 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_5 = 0;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4SKU = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4SKU", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4SKU = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 1;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4LOCID = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4LOCID", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4LOCID = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 2;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4MAX = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MAX", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4MAX = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 3;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4MAXORD = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MAXORD", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4MAXORD = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 4;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4VENDLT = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4VENDLT", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4VENDLT = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 5;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4VENDRP = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4VENDRP", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4VENDRP = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 6;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4RETFC = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4RETFC", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4RETFC = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 7;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4DIRFC = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4DIRFC", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4DIRFC = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 8;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4RETOR = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4RETOR", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4RETOR = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 9;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4MINOR = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MINOR", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4MINOR = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 10;

								row1.R4OADTE = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);

								columnIndexWithD_tFileInputDelimited_5 = 11;

								row1.R4RADTE = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);

								columnIndexWithD_tFileInputDelimited_5 = 12;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4FILLR = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4FILLR", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4FILLR = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 13;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4DMRSV = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4DMRSV", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4DMRSV = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 14;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.R4SYSROP = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4SYSROP", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.R4SYSROP = null;

								}

								columnIndexWithD_tFileInputDelimited_5 = 15;

								temp = fid_tFileInputDelimited_5.get(columnIndexWithD_tFileInputDelimited_5);
								if (temp.length() > 0) {

									try {

										row1.LOAD_DATE = ParserUtils.parseTo_Date(temp, "yyyy-MM-dd");

									} catch (java.lang.Exception ex_tFileInputDelimited_5) {
										globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",
												ex_tFileInputDelimited_5.getMessage());
										rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LOAD_DATE", "row1", temp, ex_tFileInputDelimited_5),
												ex_tFileInputDelimited_5));
									}

								} else {

									row1.LOAD_DATE = null;

								}

								if (rowstate_tFileInputDelimited_5.getException() != null) {
									throw rowstate_tFileInputDelimited_5.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_5 = true;

								throw (e);

							}

							log.debug("tFileInputDelimited_5 - Retrieving the record "
									+ fid_tFileInputDelimited_5.getRowNumber() + ".");

							/**
							 * [tFileInputDelimited_5 begin ] stop
							 */

							/**
							 * [tFileInputDelimited_5 main ] start
							 */

							currentComponent = "tFileInputDelimited_5";

							tos_count_tFileInputDelimited_5++;

							/**
							 * [tFileInputDelimited_5 main ] stop
							 */

							/**
							 * [tFileInputDelimited_5 process_data_begin ] start
							 */

							currentComponent = "tFileInputDelimited_5";

							/**
							 * [tFileInputDelimited_5 process_data_begin ] stop
							 */
// Start of branch "row1"
							if (row1 != null) {

								/**
								 * [tMap_1 main ] start
								 */

								currentComponent = "tMap_1";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row1", "tFileInputDelimited_5", "tFileInputDelimited_5",
										"tFileInputDelimited", "tMap_1", "tMap_1", "tMap"

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

									Var__tMap_1__Struct Var = Var__tMap_1;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									R4DCINP = null;

// # Output table : 'R4DCINP'
									count_R4DCINP_tMap_1++;

									R4DCINP_tmp.R4SKU = row1.R4SKU;
									R4DCINP_tmp.R4LOCID = row1.R4LOCID;
									R4DCINP_tmp.R4MAX = row1.R4MAX;
									R4DCINP_tmp.R4MAXORD = row1.R4MAXORD;
									R4DCINP_tmp.R4VENDLT = row1.R4VENDLT;
									R4DCINP_tmp.R4VENDRP = row1.R4VENDRP;
									R4DCINP_tmp.R4RETFC = row1.R4RETFC;
									R4DCINP_tmp.R4DIRFC = row1.R4DIRFC;
									R4DCINP_tmp.R4RETOR = row1.R4RETOR;
									R4DCINP_tmp.R4MINOR = row1.R4MINOR;
									R4DCINP_tmp.R4OADTE = row1.R4OADTE;
									R4DCINP_tmp.R4RADTE = row1.R4RADTE;
									R4DCINP_tmp.R4FILLR = row1.R4FILLR;
									R4DCINP_tmp.R4DMRSV = row1.R4DMRSV;
									R4DCINP_tmp.R4SYSROP = row1.R4SYSROP;
									R4DCINP_tmp.LOAD_DATE = Var.var1;
									R4DCINP = R4DCINP_tmp;
									log.debug("tMap_1 - Outputting the record " + count_R4DCINP_tMap_1
											+ " of the output table 'R4DCINP'.");

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
// Start of branch "R4DCINP"
								if (R4DCINP != null) {

									/**
									 * [tDBOutput_11 main ] start
									 */

									currentComponent = "tDBOutput_11";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "R4DCINP", "tMap_1", "tMap_1", "tMap", "tDBOutput_11", "tDBOutput_11",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("R4DCINP - " + (R4DCINP == null ? "" : R4DCINP.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_11 != null) {
										incomingEnforcer_tDBOutput_11.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4SKU") != null) {
										incomingEnforcer_tDBOutput_11.put("R4SKU", R4DCINP.R4SKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4LOCID") != null) {
										incomingEnforcer_tDBOutput_11.put("R4LOCID", R4DCINP.R4LOCID);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4MAX") != null) {
										incomingEnforcer_tDBOutput_11.put("R4MAX", R4DCINP.R4MAX);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4MAXORD") != null) {
										incomingEnforcer_tDBOutput_11.put("R4MAXORD", R4DCINP.R4MAXORD);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4VENDLT") != null) {
										incomingEnforcer_tDBOutput_11.put("R4VENDLT", R4DCINP.R4VENDLT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4VENDRP") != null) {
										incomingEnforcer_tDBOutput_11.put("R4VENDRP", R4DCINP.R4VENDRP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4RETFC") != null) {
										incomingEnforcer_tDBOutput_11.put("R4RETFC", R4DCINP.R4RETFC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4DIRFC") != null) {
										incomingEnforcer_tDBOutput_11.put("R4DIRFC", R4DCINP.R4DIRFC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4RETOR") != null) {
										incomingEnforcer_tDBOutput_11.put("R4RETOR", R4DCINP.R4RETOR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4MINOR") != null) {
										incomingEnforcer_tDBOutput_11.put("R4MINOR", R4DCINP.R4MINOR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4OADTE") != null) {
										incomingEnforcer_tDBOutput_11.put("R4OADTE", R4DCINP.R4OADTE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4RADTE") != null) {
										incomingEnforcer_tDBOutput_11.put("R4RADTE", R4DCINP.R4RADTE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4FILLR") != null) {
										incomingEnforcer_tDBOutput_11.put("R4FILLR", R4DCINP.R4FILLR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4DMRSV") != null) {
										incomingEnforcer_tDBOutput_11.put("R4DMRSV", R4DCINP.R4DMRSV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("R4SYSROP") != null) {
										incomingEnforcer_tDBOutput_11.put("R4SYSROP", R4DCINP.R4SYSROP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_11 != null && incomingEnforcer_tDBOutput_11
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_11.put("LOAD_DATE", R4DCINP.LOAD_DATE);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_11 = null;
									if (incomingEnforcer_tDBOutput_11 != null) {
										data_tDBOutput_11 = incomingEnforcer_tDBOutput_11.getCurrentRecord();
									}

									if (writer_tDBOutput_11 != null && data_tDBOutput_11 != null) {
										writer_tDBOutput_11.write(data_tDBOutput_11);
									}

									nb_line_tDBOutput_11++;

									tos_count_tDBOutput_11++;

									/**
									 * [tDBOutput_11 main ] stop
									 */

									/**
									 * [tDBOutput_11 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_11";

									/**
									 * [tDBOutput_11 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_11 process_data_end ] start
									 */

									currentComponent = "tDBOutput_11";

									/**
									 * [tDBOutput_11 process_data_end ] stop
									 */

								} // End of branch "R4DCINP"

								/**
								 * [tMap_1 process_data_end ] start
								 */

								currentComponent = "tMap_1";

								/**
								 * [tMap_1 process_data_end ] stop
								 */

							} // End of branch "row1"

							/**
							 * [tFileInputDelimited_5 process_data_end ] start
							 */

							currentComponent = "tFileInputDelimited_5";

							/**
							 * [tFileInputDelimited_5 process_data_end ] stop
							 */

							/**
							 * [tFileInputDelimited_5 end ] start
							 */

							currentComponent = "tFileInputDelimited_5";

						}
						nb_line_tFileInputDelimited_5 += fid_tFileInputDelimited_5.getRowNumber();
					}
				} finally {
					if (!((Object) ("/data/talend/data_repository/R4DCINP.zip") instanceof java.io.InputStream)) {
						if (fid_tFileInputDelimited_5 != null) {
							fid_tFileInputDelimited_5.close();
						}
					}
					if (fid_tFileInputDelimited_5 != null) {
						globalMap.put("tFileInputDelimited_5_NB_LINE", nb_line_tFileInputDelimited_5);
					}

					log.info("tFileInputDelimited_5- Retrieved records count: " + nb_line_tFileInputDelimited_5 + ".");

				}

				if (log.isDebugEnabled())
					log.debug("tFileInputDelimited_5 - " + ("Done."));

				ok_Hash.put("tFileInputDelimited_5", true);
				end_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());

				/**
				 * [tFileInputDelimited_5 end ] stop
				 */

				/**
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'R4DCINP': " + count_R4DCINP_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tFileInputDelimited_5", "tFileInputDelimited_5", "tFileInputDelimited", "tMap_1", "tMap_1",
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
				 * [tDBOutput_11 end ] start
				 */

				currentComponent = "tDBOutput_11";

// end of generic

				resourceMap.put("finish_tDBOutput_11", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_11 = null;
				if (writer_tDBOutput_11 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_11 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_11
							.close();
					resultMap_tDBOutput_11 = writer_tDBOutput_11.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_11), container_tDBOutput_11);
				}
				if (resultMap_tDBOutput_11 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_11 : resultMap_tDBOutput_11.entrySet()) {
						switch (entry_tDBOutput_11.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_11.setComponentData("tDBOutput_11", "ERROR_MESSAGE",
									entry_tDBOutput_11.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_11.setComponentData("tDBOutput_11", "NB_LINE",
									entry_tDBOutput_11.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_11.setComponentData("tDBOutput_11", "NB_SUCCESS",
									entry_tDBOutput_11.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_11.setComponentData("tDBOutput_11", "NB_REJECT",
									entry_tDBOutput_11.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_11 = new StringBuilder();
							for (int i_tDBOutput_11 = 0; i_tDBOutput_11 < entry_tDBOutput_11.getKey()
									.length(); i_tDBOutput_11++) {
								char ch_tDBOutput_11 = entry_tDBOutput_11.getKey().charAt(i_tDBOutput_11);
								if (Character.isUpperCase(ch_tDBOutput_11) && i_tDBOutput_11 > 0) {
									studio_key_tDBOutput_11.append('_');
								}
								studio_key_tDBOutput_11.append(ch_tDBOutput_11);
							}
							container_tDBOutput_11.setComponentData("tDBOutput_11",
									studio_key_tDBOutput_11.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_11.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "R4DCINP", 2, 0,
						"tMap_1", "tMap_1", "tMap", "tDBOutput_11", "tDBOutput_11", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_11", true);
				end_Hash.put("tDBOutput_11", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tFileDelete_1Process(globalMap);

				/**
				 * [tDBOutput_11 end ] stop
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
				 * [tFileInputDelimited_5 finally ] start
				 */

				currentComponent = "tFileInputDelimited_5";

				/**
				 * [tFileInputDelimited_5 finally ] stop
				 */

				/**
				 * [tMap_1 finally ] start
				 */

				currentComponent = "tMap_1";

				/**
				 * [tMap_1 finally ] stop
				 */

				/**
				 * [tDBOutput_11 finally ] start
				 */

				currentComponent = "tDBOutput_11";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_11") == null) {
					if (resourceMap.get("writer_tDBOutput_11") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap
									.get("writer_tDBOutput_11")).close();
						} catch (java.io.IOException e_tDBOutput_11) {
							String errorMessage_tDBOutput_11 = "failed to release the resource in tDBOutput_11 :"
									+ e_tDBOutput_11.getMessage();
							System.err.println(errorMessage_tDBOutput_11);
						}
					}
				}

				/**
				 * [tDBOutput_11 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 1);
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/R4DCINP.zip\"");
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
				java.io.File path_tFileDelete_1 = new java.io.File("/data/talend/data_repository/R4DCINP.zip");
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
				globalMap.put("tFileDelete_1_DELETE_PATH", "/data/talend/data_repository/R4DCINP.zip");

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
						"\nDELETE from CLAIM_TRANSACTIONS_REBCLD\nWHERE DATELOADED between CURRENT_DATE() - 7 and  CURRENT_DATE() - 1\n\n");

				props_tDBRow_10.setValue("dieOnError", true);

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tDBRow_7Process(globalMap);

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
				props_tDBRow_7.setValue("query",
						"\nCREATE OR REPLACE TABLE REBCLD(\n	RCDVEN decimal(6, 0) NULL,\n	RCDVRF decimal(6, 0) NULL,\n	RCDSVN decimal(6, 0) NULL"
								+ ",\n	RCDSTY char(15) NULL,\n	RCDSKU decimal(9, 0) NULL,\n	RCDLOC decimal(5, 0) NULL,\n	RCDTYP decimal(2, 0) NULL,\n	RCDCE"
								+ "N decimal(1, 0) NULL,\n	RCDDAT decimal(6, 0) NULL,\n	RCDQTY decimal(7, 0) NULL,\n	RCDWGT decimal(9, 4) NULL,\n	RCDCST de"
								+ "cimal(9, 3) NULL,\n	RCDAMT decimal(9, 2) NULL,\n	RCDUAA decimal(9, 2) NULL,\n	RCDUPA decimal(9, 2) NULL,\n	RCDWAA decima"
								+ "l(9, 2) NULL,\n	RCDWPA decimal(9, 2) NULL,\n	RCDRTP char(3) NULL,\n	RCDBYR char(3) NULL,\n	RCDDPT decimal(3, 0) NULL,\n	"
								+ "RCDSDP decimal(3, 0) NULL,\n	RCDCLS decimal(3, 0) NULL,\n	RCDSCL decimal(3, 0) NULL,\n	RCDRCV real NULL,\n	RCDADJ decima"
								+ "l(5, 0) NULL,\n	RCDBCK decimal(7, 0) NULL,\n	RCDCOG char(1) NULL,\n	RCDCGL char(1) NULL,\n	RCDRQT decimal(7, 0) NULL,\n	"
								+ "RCDRWT decimal(9, 4) NULL,\n	RCDOVR decimal(9, 2) NULL,\n    LOAD_DATE DATE\n);\n\n");

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
					runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBInput_1Process(globalMap);

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

	public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal RCDVEN;

		public BigDecimal getRCDVEN() {
			return this.RCDVEN;
		}

		public Boolean RCDVENIsNullable() {
			return false;
		}

		public Boolean RCDVENIsKey() {
			return false;
		}

		public Integer RCDVENLength() {
			return 6;
		}

		public Integer RCDVENPrecision() {
			return 0;
		}

		public String RCDVENDefault() {

			return "";

		}

		public String RCDVENComment() {

			return "";

		}

		public String RCDVENPattern() {

			return "";

		}

		public String RCDVENOriginalDbColumnName() {

			return "RCDVEN";

		}

		public BigDecimal RCDVRF;

		public BigDecimal getRCDVRF() {
			return this.RCDVRF;
		}

		public Boolean RCDVRFIsNullable() {
			return false;
		}

		public Boolean RCDVRFIsKey() {
			return false;
		}

		public Integer RCDVRFLength() {
			return 6;
		}

		public Integer RCDVRFPrecision() {
			return 0;
		}

		public String RCDVRFDefault() {

			return "";

		}

		public String RCDVRFComment() {

			return "";

		}

		public String RCDVRFPattern() {

			return "";

		}

		public String RCDVRFOriginalDbColumnName() {

			return "RCDVRF";

		}

		public BigDecimal RCDSVN;

		public BigDecimal getRCDSVN() {
			return this.RCDSVN;
		}

		public Boolean RCDSVNIsNullable() {
			return false;
		}

		public Boolean RCDSVNIsKey() {
			return false;
		}

		public Integer RCDSVNLength() {
			return 6;
		}

		public Integer RCDSVNPrecision() {
			return 0;
		}

		public String RCDSVNDefault() {

			return "";

		}

		public String RCDSVNComment() {

			return "";

		}

		public String RCDSVNPattern() {

			return "";

		}

		public String RCDSVNOriginalDbColumnName() {

			return "RCDSVN";

		}

		public String RCDSTY;

		public String getRCDSTY() {
			return this.RCDSTY;
		}

		public Boolean RCDSTYIsNullable() {
			return false;
		}

		public Boolean RCDSTYIsKey() {
			return false;
		}

		public Integer RCDSTYLength() {
			return 15;
		}

		public Integer RCDSTYPrecision() {
			return 0;
		}

		public String RCDSTYDefault() {

			return null;

		}

		public String RCDSTYComment() {

			return "";

		}

		public String RCDSTYPattern() {

			return "";

		}

		public String RCDSTYOriginalDbColumnName() {

			return "RCDSTY";

		}

		public BigDecimal RCDSKU;

		public BigDecimal getRCDSKU() {
			return this.RCDSKU;
		}

		public Boolean RCDSKUIsNullable() {
			return false;
		}

		public Boolean RCDSKUIsKey() {
			return false;
		}

		public Integer RCDSKULength() {
			return 9;
		}

		public Integer RCDSKUPrecision() {
			return 0;
		}

		public String RCDSKUDefault() {

			return "";

		}

		public String RCDSKUComment() {

			return "";

		}

		public String RCDSKUPattern() {

			return "";

		}

		public String RCDSKUOriginalDbColumnName() {

			return "RCDSKU";

		}

		public BigDecimal RCDLOC;

		public BigDecimal getRCDLOC() {
			return this.RCDLOC;
		}

		public Boolean RCDLOCIsNullable() {
			return false;
		}

		public Boolean RCDLOCIsKey() {
			return false;
		}

		public Integer RCDLOCLength() {
			return 5;
		}

		public Integer RCDLOCPrecision() {
			return 0;
		}

		public String RCDLOCDefault() {

			return "";

		}

		public String RCDLOCComment() {

			return "";

		}

		public String RCDLOCPattern() {

			return "";

		}

		public String RCDLOCOriginalDbColumnName() {

			return "RCDLOC";

		}

		public BigDecimal RCDTYP;

		public BigDecimal getRCDTYP() {
			return this.RCDTYP;
		}

		public Boolean RCDTYPIsNullable() {
			return false;
		}

		public Boolean RCDTYPIsKey() {
			return false;
		}

		public Integer RCDTYPLength() {
			return 2;
		}

		public Integer RCDTYPPrecision() {
			return 0;
		}

		public String RCDTYPDefault() {

			return "";

		}

		public String RCDTYPComment() {

			return "";

		}

		public String RCDTYPPattern() {

			return "";

		}

		public String RCDTYPOriginalDbColumnName() {

			return "RCDTYP";

		}

		public BigDecimal RCDCEN;

		public BigDecimal getRCDCEN() {
			return this.RCDCEN;
		}

		public Boolean RCDCENIsNullable() {
			return false;
		}

		public Boolean RCDCENIsKey() {
			return false;
		}

		public Integer RCDCENLength() {
			return 1;
		}

		public Integer RCDCENPrecision() {
			return 0;
		}

		public String RCDCENDefault() {

			return "";

		}

		public String RCDCENComment() {

			return "";

		}

		public String RCDCENPattern() {

			return "";

		}

		public String RCDCENOriginalDbColumnName() {

			return "RCDCEN";

		}

		public BigDecimal RCDDAT;

		public BigDecimal getRCDDAT() {
			return this.RCDDAT;
		}

		public Boolean RCDDATIsNullable() {
			return false;
		}

		public Boolean RCDDATIsKey() {
			return false;
		}

		public Integer RCDDATLength() {
			return 6;
		}

		public Integer RCDDATPrecision() {
			return 0;
		}

		public String RCDDATDefault() {

			return "";

		}

		public String RCDDATComment() {

			return "";

		}

		public String RCDDATPattern() {

			return "";

		}

		public String RCDDATOriginalDbColumnName() {

			return "RCDDAT";

		}

		public BigDecimal RCDQTY;

		public BigDecimal getRCDQTY() {
			return this.RCDQTY;
		}

		public Boolean RCDQTYIsNullable() {
			return false;
		}

		public Boolean RCDQTYIsKey() {
			return false;
		}

		public Integer RCDQTYLength() {
			return 7;
		}

		public Integer RCDQTYPrecision() {
			return 0;
		}

		public String RCDQTYDefault() {

			return "";

		}

		public String RCDQTYComment() {

			return "";

		}

		public String RCDQTYPattern() {

			return "";

		}

		public String RCDQTYOriginalDbColumnName() {

			return "RCDQTY";

		}

		public BigDecimal RCDWGT;

		public BigDecimal getRCDWGT() {
			return this.RCDWGT;
		}

		public Boolean RCDWGTIsNullable() {
			return false;
		}

		public Boolean RCDWGTIsKey() {
			return false;
		}

		public Integer RCDWGTLength() {
			return 9;
		}

		public Integer RCDWGTPrecision() {
			return 4;
		}

		public String RCDWGTDefault() {

			return "";

		}

		public String RCDWGTComment() {

			return "";

		}

		public String RCDWGTPattern() {

			return "";

		}

		public String RCDWGTOriginalDbColumnName() {

			return "RCDWGT";

		}

		public BigDecimal RCDCST;

		public BigDecimal getRCDCST() {
			return this.RCDCST;
		}

		public Boolean RCDCSTIsNullable() {
			return false;
		}

		public Boolean RCDCSTIsKey() {
			return false;
		}

		public Integer RCDCSTLength() {
			return 9;
		}

		public Integer RCDCSTPrecision() {
			return 3;
		}

		public String RCDCSTDefault() {

			return "";

		}

		public String RCDCSTComment() {

			return "";

		}

		public String RCDCSTPattern() {

			return "";

		}

		public String RCDCSTOriginalDbColumnName() {

			return "RCDCST";

		}

		public BigDecimal RCDAMT;

		public BigDecimal getRCDAMT() {
			return this.RCDAMT;
		}

		public Boolean RCDAMTIsNullable() {
			return false;
		}

		public Boolean RCDAMTIsKey() {
			return false;
		}

		public Integer RCDAMTLength() {
			return 9;
		}

		public Integer RCDAMTPrecision() {
			return 2;
		}

		public String RCDAMTDefault() {

			return "";

		}

		public String RCDAMTComment() {

			return "";

		}

		public String RCDAMTPattern() {

			return "";

		}

		public String RCDAMTOriginalDbColumnName() {

			return "RCDAMT";

		}

		public BigDecimal RCDUAA;

		public BigDecimal getRCDUAA() {
			return this.RCDUAA;
		}

		public Boolean RCDUAAIsNullable() {
			return false;
		}

		public Boolean RCDUAAIsKey() {
			return false;
		}

		public Integer RCDUAALength() {
			return 9;
		}

		public Integer RCDUAAPrecision() {
			return 2;
		}

		public String RCDUAADefault() {

			return "";

		}

		public String RCDUAAComment() {

			return "";

		}

		public String RCDUAAPattern() {

			return "";

		}

		public String RCDUAAOriginalDbColumnName() {

			return "RCDUAA";

		}

		public BigDecimal RCDUPA;

		public BigDecimal getRCDUPA() {
			return this.RCDUPA;
		}

		public Boolean RCDUPAIsNullable() {
			return false;
		}

		public Boolean RCDUPAIsKey() {
			return false;
		}

		public Integer RCDUPALength() {
			return 9;
		}

		public Integer RCDUPAPrecision() {
			return 2;
		}

		public String RCDUPADefault() {

			return "";

		}

		public String RCDUPAComment() {

			return "";

		}

		public String RCDUPAPattern() {

			return "";

		}

		public String RCDUPAOriginalDbColumnName() {

			return "RCDUPA";

		}

		public BigDecimal RCDWAA;

		public BigDecimal getRCDWAA() {
			return this.RCDWAA;
		}

		public Boolean RCDWAAIsNullable() {
			return false;
		}

		public Boolean RCDWAAIsKey() {
			return false;
		}

		public Integer RCDWAALength() {
			return 9;
		}

		public Integer RCDWAAPrecision() {
			return 2;
		}

		public String RCDWAADefault() {

			return "";

		}

		public String RCDWAAComment() {

			return "";

		}

		public String RCDWAAPattern() {

			return "";

		}

		public String RCDWAAOriginalDbColumnName() {

			return "RCDWAA";

		}

		public BigDecimal RCDWPA;

		public BigDecimal getRCDWPA() {
			return this.RCDWPA;
		}

		public Boolean RCDWPAIsNullable() {
			return false;
		}

		public Boolean RCDWPAIsKey() {
			return false;
		}

		public Integer RCDWPALength() {
			return 9;
		}

		public Integer RCDWPAPrecision() {
			return 2;
		}

		public String RCDWPADefault() {

			return "";

		}

		public String RCDWPAComment() {

			return "";

		}

		public String RCDWPAPattern() {

			return "";

		}

		public String RCDWPAOriginalDbColumnName() {

			return "RCDWPA";

		}

		public String RCDRTP;

		public String getRCDRTP() {
			return this.RCDRTP;
		}

		public Boolean RCDRTPIsNullable() {
			return false;
		}

		public Boolean RCDRTPIsKey() {
			return false;
		}

		public Integer RCDRTPLength() {
			return 3;
		}

		public Integer RCDRTPPrecision() {
			return 0;
		}

		public String RCDRTPDefault() {

			return "";

		}

		public String RCDRTPComment() {

			return "";

		}

		public String RCDRTPPattern() {

			return "";

		}

		public String RCDRTPOriginalDbColumnName() {

			return "RCDRTP";

		}

		public String RCDBYR;

		public String getRCDBYR() {
			return this.RCDBYR;
		}

		public Boolean RCDBYRIsNullable() {
			return false;
		}

		public Boolean RCDBYRIsKey() {
			return false;
		}

		public Integer RCDBYRLength() {
			return 3;
		}

		public Integer RCDBYRPrecision() {
			return 0;
		}

		public String RCDBYRDefault() {

			return "";

		}

		public String RCDBYRComment() {

			return "";

		}

		public String RCDBYRPattern() {

			return "";

		}

		public String RCDBYROriginalDbColumnName() {

			return "RCDBYR";

		}

		public BigDecimal RCDDPT;

		public BigDecimal getRCDDPT() {
			return this.RCDDPT;
		}

		public Boolean RCDDPTIsNullable() {
			return false;
		}

		public Boolean RCDDPTIsKey() {
			return false;
		}

		public Integer RCDDPTLength() {
			return 3;
		}

		public Integer RCDDPTPrecision() {
			return 0;
		}

		public String RCDDPTDefault() {

			return "";

		}

		public String RCDDPTComment() {

			return "";

		}

		public String RCDDPTPattern() {

			return "";

		}

		public String RCDDPTOriginalDbColumnName() {

			return "RCDDPT";

		}

		public BigDecimal RCDSDP;

		public BigDecimal getRCDSDP() {
			return this.RCDSDP;
		}

		public Boolean RCDSDPIsNullable() {
			return false;
		}

		public Boolean RCDSDPIsKey() {
			return false;
		}

		public Integer RCDSDPLength() {
			return 3;
		}

		public Integer RCDSDPPrecision() {
			return 0;
		}

		public String RCDSDPDefault() {

			return "";

		}

		public String RCDSDPComment() {

			return "";

		}

		public String RCDSDPPattern() {

			return "";

		}

		public String RCDSDPOriginalDbColumnName() {

			return "RCDSDP";

		}

		public BigDecimal RCDCLS;

		public BigDecimal getRCDCLS() {
			return this.RCDCLS;
		}

		public Boolean RCDCLSIsNullable() {
			return false;
		}

		public Boolean RCDCLSIsKey() {
			return false;
		}

		public Integer RCDCLSLength() {
			return 3;
		}

		public Integer RCDCLSPrecision() {
			return 0;
		}

		public String RCDCLSDefault() {

			return "";

		}

		public String RCDCLSComment() {

			return "";

		}

		public String RCDCLSPattern() {

			return "";

		}

		public String RCDCLSOriginalDbColumnName() {

			return "RCDCLS";

		}

		public BigDecimal RCDSCL;

		public BigDecimal getRCDSCL() {
			return this.RCDSCL;
		}

		public Boolean RCDSCLIsNullable() {
			return false;
		}

		public Boolean RCDSCLIsKey() {
			return false;
		}

		public Integer RCDSCLLength() {
			return 3;
		}

		public Integer RCDSCLPrecision() {
			return 0;
		}

		public String RCDSCLDefault() {

			return "";

		}

		public String RCDSCLComment() {

			return "";

		}

		public String RCDSCLPattern() {

			return "";

		}

		public String RCDSCLOriginalDbColumnName() {

			return "RCDSCL";

		}

		public float RCDRCV;

		public float getRCDRCV() {
			return this.RCDRCV;
		}

		public Boolean RCDRCVIsNullable() {
			return false;
		}

		public Boolean RCDRCVIsKey() {
			return false;
		}

		public Integer RCDRCVLength() {
			return 6;
		}

		public Integer RCDRCVPrecision() {
			return 0;
		}

		public String RCDRCVDefault() {

			return "";

		}

		public String RCDRCVComment() {

			return "";

		}

		public String RCDRCVPattern() {

			return "";

		}

		public String RCDRCVOriginalDbColumnName() {

			return "RCDRCV";

		}

		public BigDecimal RCDADJ;

		public BigDecimal getRCDADJ() {
			return this.RCDADJ;
		}

		public Boolean RCDADJIsNullable() {
			return false;
		}

		public Boolean RCDADJIsKey() {
			return false;
		}

		public Integer RCDADJLength() {
			return 5;
		}

		public Integer RCDADJPrecision() {
			return 0;
		}

		public String RCDADJDefault() {

			return "";

		}

		public String RCDADJComment() {

			return "";

		}

		public String RCDADJPattern() {

			return "";

		}

		public String RCDADJOriginalDbColumnName() {

			return "RCDADJ";

		}

		public BigDecimal RCDBCK;

		public BigDecimal getRCDBCK() {
			return this.RCDBCK;
		}

		public Boolean RCDBCKIsNullable() {
			return false;
		}

		public Boolean RCDBCKIsKey() {
			return false;
		}

		public Integer RCDBCKLength() {
			return 7;
		}

		public Integer RCDBCKPrecision() {
			return 0;
		}

		public String RCDBCKDefault() {

			return "";

		}

		public String RCDBCKComment() {

			return "";

		}

		public String RCDBCKPattern() {

			return "";

		}

		public String RCDBCKOriginalDbColumnName() {

			return "RCDBCK";

		}

		public String RCDCOG;

		public String getRCDCOG() {
			return this.RCDCOG;
		}

		public Boolean RCDCOGIsNullable() {
			return false;
		}

		public Boolean RCDCOGIsKey() {
			return false;
		}

		public Integer RCDCOGLength() {
			return 1;
		}

		public Integer RCDCOGPrecision() {
			return 0;
		}

		public String RCDCOGDefault() {

			return "";

		}

		public String RCDCOGComment() {

			return "";

		}

		public String RCDCOGPattern() {

			return "";

		}

		public String RCDCOGOriginalDbColumnName() {

			return "RCDCOG";

		}

		public String RCDCGL;

		public String getRCDCGL() {
			return this.RCDCGL;
		}

		public Boolean RCDCGLIsNullable() {
			return false;
		}

		public Boolean RCDCGLIsKey() {
			return false;
		}

		public Integer RCDCGLLength() {
			return 1;
		}

		public Integer RCDCGLPrecision() {
			return 0;
		}

		public String RCDCGLDefault() {

			return "";

		}

		public String RCDCGLComment() {

			return "";

		}

		public String RCDCGLPattern() {

			return "";

		}

		public String RCDCGLOriginalDbColumnName() {

			return "RCDCGL";

		}

		public BigDecimal RCDRQT;

		public BigDecimal getRCDRQT() {
			return this.RCDRQT;
		}

		public Boolean RCDRQTIsNullable() {
			return false;
		}

		public Boolean RCDRQTIsKey() {
			return false;
		}

		public Integer RCDRQTLength() {
			return 7;
		}

		public Integer RCDRQTPrecision() {
			return 0;
		}

		public String RCDRQTDefault() {

			return "";

		}

		public String RCDRQTComment() {

			return "";

		}

		public String RCDRQTPattern() {

			return "";

		}

		public String RCDRQTOriginalDbColumnName() {

			return "RCDRQT";

		}

		public BigDecimal RCDRWT;

		public BigDecimal getRCDRWT() {
			return this.RCDRWT;
		}

		public Boolean RCDRWTIsNullable() {
			return false;
		}

		public Boolean RCDRWTIsKey() {
			return false;
		}

		public Integer RCDRWTLength() {
			return 9;
		}

		public Integer RCDRWTPrecision() {
			return 4;
		}

		public String RCDRWTDefault() {

			return "";

		}

		public String RCDRWTComment() {

			return "";

		}

		public String RCDRWTPattern() {

			return "";

		}

		public String RCDRWTOriginalDbColumnName() {

			return "RCDRWT";

		}

		public BigDecimal RCDOVR;

		public BigDecimal getRCDOVR() {
			return this.RCDOVR;
		}

		public Boolean RCDOVRIsNullable() {
			return false;
		}

		public Boolean RCDOVRIsKey() {
			return false;
		}

		public Integer RCDOVRLength() {
			return 9;
		}

		public Integer RCDOVRPrecision() {
			return 2;
		}

		public String RCDOVRDefault() {

			return "";

		}

		public String RCDOVRComment() {

			return "";

		}

		public String RCDOVRPattern() {

			return "";

		}

		public String RCDOVROriginalDbColumnName() {

			return "RCDOVR";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					this.RCDRCV = dis.readFloat();

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					this.RCDRCV = dis.readFloat();

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// float

				dos.writeFloat(this.RCDRCV);

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// float

				dos.writeFloat(this.RCDRCV);

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("RCDVEN=" + String.valueOf(RCDVEN));
			sb.append(",RCDVRF=" + String.valueOf(RCDVRF));
			sb.append(",RCDSVN=" + String.valueOf(RCDSVN));
			sb.append(",RCDSTY=" + RCDSTY);
			sb.append(",RCDSKU=" + String.valueOf(RCDSKU));
			sb.append(",RCDLOC=" + String.valueOf(RCDLOC));
			sb.append(",RCDTYP=" + String.valueOf(RCDTYP));
			sb.append(",RCDCEN=" + String.valueOf(RCDCEN));
			sb.append(",RCDDAT=" + String.valueOf(RCDDAT));
			sb.append(",RCDQTY=" + String.valueOf(RCDQTY));
			sb.append(",RCDWGT=" + String.valueOf(RCDWGT));
			sb.append(",RCDCST=" + String.valueOf(RCDCST));
			sb.append(",RCDAMT=" + String.valueOf(RCDAMT));
			sb.append(",RCDUAA=" + String.valueOf(RCDUAA));
			sb.append(",RCDUPA=" + String.valueOf(RCDUPA));
			sb.append(",RCDWAA=" + String.valueOf(RCDWAA));
			sb.append(",RCDWPA=" + String.valueOf(RCDWPA));
			sb.append(",RCDRTP=" + RCDRTP);
			sb.append(",RCDBYR=" + RCDBYR);
			sb.append(",RCDDPT=" + String.valueOf(RCDDPT));
			sb.append(",RCDSDP=" + String.valueOf(RCDSDP));
			sb.append(",RCDCLS=" + String.valueOf(RCDCLS));
			sb.append(",RCDSCL=" + String.valueOf(RCDSCL));
			sb.append(",RCDRCV=" + String.valueOf(RCDRCV));
			sb.append(",RCDADJ=" + String.valueOf(RCDADJ));
			sb.append(",RCDBCK=" + String.valueOf(RCDBCK));
			sb.append(",RCDCOG=" + RCDCOG);
			sb.append(",RCDCGL=" + RCDCGL);
			sb.append(",RCDRQT=" + String.valueOf(RCDRQT));
			sb.append(",RCDRWT=" + String.valueOf(RCDRWT));
			sb.append(",RCDOVR=" + String.valueOf(RCDOVR));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (RCDVEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVEN);
			}

			sb.append("|");

			if (RCDVRF == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVRF);
			}

			sb.append("|");

			if (RCDSVN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSVN);
			}

			sb.append("|");

			if (RCDSTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSTY);
			}

			sb.append("|");

			if (RCDSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSKU);
			}

			sb.append("|");

			if (RCDLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDLOC);
			}

			sb.append("|");

			if (RCDTYP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDTYP);
			}

			sb.append("|");

			if (RCDCEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCEN);
			}

			sb.append("|");

			if (RCDDAT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDAT);
			}

			sb.append("|");

			if (RCDQTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDQTY);
			}

			sb.append("|");

			if (RCDWGT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWGT);
			}

			sb.append("|");

			if (RCDCST == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCST);
			}

			sb.append("|");

			if (RCDAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDAMT);
			}

			sb.append("|");

			if (RCDUAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUAA);
			}

			sb.append("|");

			if (RCDUPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUPA);
			}

			sb.append("|");

			if (RCDWAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWAA);
			}

			sb.append("|");

			if (RCDWPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWPA);
			}

			sb.append("|");

			if (RCDRTP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRTP);
			}

			sb.append("|");

			if (RCDBYR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBYR);
			}

			sb.append("|");

			if (RCDDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDPT);
			}

			sb.append("|");

			if (RCDSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSDP);
			}

			sb.append("|");

			if (RCDCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCLS);
			}

			sb.append("|");

			if (RCDSCL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSCL);
			}

			sb.append("|");

			sb.append(RCDRCV);

			sb.append("|");

			if (RCDADJ == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDADJ);
			}

			sb.append("|");

			if (RCDBCK == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBCK);
			}

			sb.append("|");

			if (RCDCOG == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCOG);
			}

			sb.append("|");

			if (RCDCGL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCGL);
			}

			sb.append("|");

			if (RCDRQT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRQT);
			}

			sb.append("|");

			if (RCDRWT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRWT);
			}

			sb.append("|");

			if (RCDOVR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDOVR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row6Struct other) {

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

				row6Struct row6 = new row6Struct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row6");

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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/REBCLD.csv\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_1.append(" | ");
							log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
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
				fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/REBCLD.csv"))
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
						"|"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */
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
						outtFileOutputDelimited_1.write("RCDVEN");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDVRF");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDSVN");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDSTY");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDSKU");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDLOC");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDTYP");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDCEN");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDDAT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDQTY");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDWGT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDCST");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDAMT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDUAA");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDUPA");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDWAA");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDWPA");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDRTP");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDBYR");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDDPT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDSDP");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDCLS");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDSCL");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDRCV");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDADJ");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDBCK");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDCOG");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDCGL");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDRQT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDRWT");
						outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
						outtFileOutputDelimited_1.write("RCDOVR");
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
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"select * from MM4R5LIB.REBCLD  where RCDDAT between VARCHAR_FORMAT(CURRENT TIMESTAMP  - 7 DAYS  , 'YYMMDD')  and  VARCHAR_FORMAT(CURRENT TIMESTAMP  - 1 DAYS  , 'YYMMDD')   \"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDVEN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDVRF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSVN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDSKU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDLOC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDTYP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDCEN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDDAT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDQTY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDWGT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCST") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDAMT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDUAA") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDUPA") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDWAA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDWPA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRTP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDBYR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDDPT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDSDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCLS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSCL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRCV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDADJ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDBCK") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCOG") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDCGL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRQT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDRWT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDOVR") + "}]");
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

				String dbquery_tDBInput_1 = "select * from MM4R5LIB.REBCLD\nwhere RCDDAT between VARCHAR_FORMAT(CURRENT TIMESTAMP  - 7 DAYS  , 'YYMMDD')  and  VARCH"
						+ "AR_FORMAT(CURRENT TIMESTAMP  - 1 DAYS  , 'YYMMDD') \n";

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
							row6.RCDVEN = null;
						} else {

							row6.RCDVEN = rs_tDBInput_1.getBigDecimal(1);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row6.RCDVRF = null;
						} else {

							row6.RCDVRF = rs_tDBInput_1.getBigDecimal(2);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row6.RCDSVN = null;
						} else {

							row6.RCDSVN = rs_tDBInput_1.getBigDecimal(3);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row6.RCDSTY = null;
						} else {

							row6.RCDSTY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row6.RCDSKU = null;
						} else {

							row6.RCDSKU = rs_tDBInput_1.getBigDecimal(5);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row6.RCDLOC = null;
						} else {

							row6.RCDLOC = rs_tDBInput_1.getBigDecimal(6);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row6.RCDTYP = null;
						} else {

							row6.RCDTYP = rs_tDBInput_1.getBigDecimal(7);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row6.RCDCEN = null;
						} else {

							row6.RCDCEN = rs_tDBInput_1.getBigDecimal(8);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row6.RCDDAT = null;
						} else {

							row6.RCDDAT = rs_tDBInput_1.getBigDecimal(9);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row6.RCDQTY = null;
						} else {

							row6.RCDQTY = rs_tDBInput_1.getBigDecimal(10);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row6.RCDWGT = null;
						} else {

							row6.RCDWGT = rs_tDBInput_1.getBigDecimal(11);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row6.RCDCST = null;
						} else {

							row6.RCDCST = rs_tDBInput_1.getBigDecimal(12);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 13) {
							row6.RCDAMT = null;
						} else {

							row6.RCDAMT = rs_tDBInput_1.getBigDecimal(13);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 14) {
							row6.RCDUAA = null;
						} else {

							row6.RCDUAA = rs_tDBInput_1.getBigDecimal(14);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 15) {
							row6.RCDUPA = null;
						} else {

							row6.RCDUPA = rs_tDBInput_1.getBigDecimal(15);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 16) {
							row6.RCDWAA = null;
						} else {

							row6.RCDWAA = rs_tDBInput_1.getBigDecimal(16);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 17) {
							row6.RCDWPA = null;
						} else {

							row6.RCDWPA = rs_tDBInput_1.getBigDecimal(17);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 18) {
							row6.RCDRTP = null;
						} else {

							row6.RCDRTP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
						}
						if (colQtyInRs_tDBInput_1 < 19) {
							row6.RCDBYR = null;
						} else {

							row6.RCDBYR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 19, false);
						}
						if (colQtyInRs_tDBInput_1 < 20) {
							row6.RCDDPT = null;
						} else {

							row6.RCDDPT = rs_tDBInput_1.getBigDecimal(20);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 21) {
							row6.RCDSDP = null;
						} else {

							row6.RCDSDP = rs_tDBInput_1.getBigDecimal(21);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 22) {
							row6.RCDCLS = null;
						} else {

							row6.RCDCLS = rs_tDBInput_1.getBigDecimal(22);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 23) {
							row6.RCDSCL = null;
						} else {

							row6.RCDSCL = rs_tDBInput_1.getBigDecimal(23);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 24) {
							row6.RCDRCV = 0;
						} else {

							row6.RCDRCV = rs_tDBInput_1.getFloat(24);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 25) {
							row6.RCDADJ = null;
						} else {

							row6.RCDADJ = rs_tDBInput_1.getBigDecimal(25);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 26) {
							row6.RCDBCK = null;
						} else {

							row6.RCDBCK = rs_tDBInput_1.getBigDecimal(26);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 27) {
							row6.RCDCOG = null;
						} else {

							row6.RCDCOG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
						}
						if (colQtyInRs_tDBInput_1 < 28) {
							row6.RCDCGL = null;
						} else {

							row6.RCDCGL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
						}
						if (colQtyInRs_tDBInput_1 < 29) {
							row6.RCDRQT = null;
						} else {

							row6.RCDRQT = rs_tDBInput_1.getBigDecimal(29);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 30) {
							row6.RCDRWT = null;
						} else {

							row6.RCDRWT = rs_tDBInput_1.getBigDecimal(30);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 31) {
							row6.RCDOVR = null;
						} else {

							row6.RCDOVR = rs_tDBInput_1.getBigDecimal(31);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
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

								, "row6", "tDBInput_1", "tDBInput_1", "tAS400Input", "tFileOutputDelimited_1",
								"tFileOutputDelimited_1", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row6 - " + (row6 == null ? "" : row6.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row6.RCDVEN != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDVEN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDVRF != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDVRF.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDSVN != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDSVN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDSTY != null) {
							sb_tFileOutputDelimited_1.append(row6.RCDSTY);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDSKU != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDLOC != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDLOC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDTYP != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDTYP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDCEN != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDCEN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDDAT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDDAT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDQTY != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDQTY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDWGT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDWGT.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDCST != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDCST.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDAMT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDAMT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDUAA != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDUAA.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDUPA != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDUPA.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDWAA != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDWAA.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDWPA != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDWPA.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDRTP != null) {
							sb_tFileOutputDelimited_1.append(row6.RCDRTP);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDBYR != null) {
							sb_tFileOutputDelimited_1.append(row6.RCDBYR);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDDPT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDDPT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDSDP != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDSDP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDCLS != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDCLS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDSCL != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDSCL.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						sb_tFileOutputDelimited_1.append(row6.RCDRCV);
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDADJ != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDADJ.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDBCK != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDBCK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDCOG != null) {
							sb_tFileOutputDelimited_1.append(row6.RCDCOG);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDCGL != null) {
							sb_tFileOutputDelimited_1.append(row6.RCDCGL);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDRQT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDRQT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDRWT != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDRWT.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row6.RCDOVR != null) {
							sb_tFileOutputDelimited_1
									.append(row6.RCDOVR.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row6", 2, 0,
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
				runStat.updateStatOnConnection("OnSubjobOk7", 0, "ok");
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

	public static class INVMSTStruct implements routines.system.IPersistableRow<INVMSTStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal RCDVEN;

		public BigDecimal getRCDVEN() {
			return this.RCDVEN;
		}

		public Boolean RCDVENIsNullable() {
			return true;
		}

		public Boolean RCDVENIsKey() {
			return false;
		}

		public Integer RCDVENLength() {
			return null;
		}

		public Integer RCDVENPrecision() {
			return null;
		}

		public String RCDVENDefault() {

			return "";

		}

		public String RCDVENComment() {

			return "";

		}

		public String RCDVENPattern() {

			return "";

		}

		public String RCDVENOriginalDbColumnName() {

			return "RCDVEN";

		}

		public BigDecimal RCDVRF;

		public BigDecimal getRCDVRF() {
			return this.RCDVRF;
		}

		public Boolean RCDVRFIsNullable() {
			return true;
		}

		public Boolean RCDVRFIsKey() {
			return false;
		}

		public Integer RCDVRFLength() {
			return null;
		}

		public Integer RCDVRFPrecision() {
			return null;
		}

		public String RCDVRFDefault() {

			return "";

		}

		public String RCDVRFComment() {

			return "";

		}

		public String RCDVRFPattern() {

			return "";

		}

		public String RCDVRFOriginalDbColumnName() {

			return "RCDVRF";

		}

		public BigDecimal RCDSVN;

		public BigDecimal getRCDSVN() {
			return this.RCDSVN;
		}

		public Boolean RCDSVNIsNullable() {
			return true;
		}

		public Boolean RCDSVNIsKey() {
			return false;
		}

		public Integer RCDSVNLength() {
			return null;
		}

		public Integer RCDSVNPrecision() {
			return null;
		}

		public String RCDSVNDefault() {

			return "";

		}

		public String RCDSVNComment() {

			return "";

		}

		public String RCDSVNPattern() {

			return "";

		}

		public String RCDSVNOriginalDbColumnName() {

			return "RCDSVN";

		}

		public String RCDSTY;

		public String getRCDSTY() {
			return this.RCDSTY;
		}

		public Boolean RCDSTYIsNullable() {
			return true;
		}

		public Boolean RCDSTYIsKey() {
			return false;
		}

		public Integer RCDSTYLength() {
			return null;
		}

		public Integer RCDSTYPrecision() {
			return null;
		}

		public String RCDSTYDefault() {

			return null;

		}

		public String RCDSTYComment() {

			return "";

		}

		public String RCDSTYPattern() {

			return "";

		}

		public String RCDSTYOriginalDbColumnName() {

			return "RCDSTY";

		}

		public BigDecimal RCDSKU;

		public BigDecimal getRCDSKU() {
			return this.RCDSKU;
		}

		public Boolean RCDSKUIsNullable() {
			return true;
		}

		public Boolean RCDSKUIsKey() {
			return false;
		}

		public Integer RCDSKULength() {
			return null;
		}

		public Integer RCDSKUPrecision() {
			return null;
		}

		public String RCDSKUDefault() {

			return "";

		}

		public String RCDSKUComment() {

			return "";

		}

		public String RCDSKUPattern() {

			return "";

		}

		public String RCDSKUOriginalDbColumnName() {

			return "RCDSKU";

		}

		public BigDecimal RCDLOC;

		public BigDecimal getRCDLOC() {
			return this.RCDLOC;
		}

		public Boolean RCDLOCIsNullable() {
			return true;
		}

		public Boolean RCDLOCIsKey() {
			return false;
		}

		public Integer RCDLOCLength() {
			return null;
		}

		public Integer RCDLOCPrecision() {
			return null;
		}

		public String RCDLOCDefault() {

			return "";

		}

		public String RCDLOCComment() {

			return "";

		}

		public String RCDLOCPattern() {

			return "";

		}

		public String RCDLOCOriginalDbColumnName() {

			return "RCDLOC";

		}

		public BigDecimal RCDTYP;

		public BigDecimal getRCDTYP() {
			return this.RCDTYP;
		}

		public Boolean RCDTYPIsNullable() {
			return true;
		}

		public Boolean RCDTYPIsKey() {
			return false;
		}

		public Integer RCDTYPLength() {
			return null;
		}

		public Integer RCDTYPPrecision() {
			return null;
		}

		public String RCDTYPDefault() {

			return "";

		}

		public String RCDTYPComment() {

			return "";

		}

		public String RCDTYPPattern() {

			return "";

		}

		public String RCDTYPOriginalDbColumnName() {

			return "RCDTYP";

		}

		public BigDecimal RCDCEN;

		public BigDecimal getRCDCEN() {
			return this.RCDCEN;
		}

		public Boolean RCDCENIsNullable() {
			return true;
		}

		public Boolean RCDCENIsKey() {
			return false;
		}

		public Integer RCDCENLength() {
			return null;
		}

		public Integer RCDCENPrecision() {
			return null;
		}

		public String RCDCENDefault() {

			return "";

		}

		public String RCDCENComment() {

			return "";

		}

		public String RCDCENPattern() {

			return "";

		}

		public String RCDCENOriginalDbColumnName() {

			return "RCDCEN";

		}

		public BigDecimal RCDDAT;

		public BigDecimal getRCDDAT() {
			return this.RCDDAT;
		}

		public Boolean RCDDATIsNullable() {
			return true;
		}

		public Boolean RCDDATIsKey() {
			return false;
		}

		public Integer RCDDATLength() {
			return null;
		}

		public Integer RCDDATPrecision() {
			return null;
		}

		public String RCDDATDefault() {

			return "";

		}

		public String RCDDATComment() {

			return "";

		}

		public String RCDDATPattern() {

			return "";

		}

		public String RCDDATOriginalDbColumnName() {

			return "RCDDAT";

		}

		public BigDecimal RCDQTY;

		public BigDecimal getRCDQTY() {
			return this.RCDQTY;
		}

		public Boolean RCDQTYIsNullable() {
			return true;
		}

		public Boolean RCDQTYIsKey() {
			return false;
		}

		public Integer RCDQTYLength() {
			return null;
		}

		public Integer RCDQTYPrecision() {
			return null;
		}

		public String RCDQTYDefault() {

			return "";

		}

		public String RCDQTYComment() {

			return "";

		}

		public String RCDQTYPattern() {

			return "";

		}

		public String RCDQTYOriginalDbColumnName() {

			return "RCDQTY";

		}

		public BigDecimal RCDWGT;

		public BigDecimal getRCDWGT() {
			return this.RCDWGT;
		}

		public Boolean RCDWGTIsNullable() {
			return true;
		}

		public Boolean RCDWGTIsKey() {
			return false;
		}

		public Integer RCDWGTLength() {
			return null;
		}

		public Integer RCDWGTPrecision() {
			return null;
		}

		public String RCDWGTDefault() {

			return "";

		}

		public String RCDWGTComment() {

			return "";

		}

		public String RCDWGTPattern() {

			return "";

		}

		public String RCDWGTOriginalDbColumnName() {

			return "RCDWGT";

		}

		public BigDecimal RCDCST;

		public BigDecimal getRCDCST() {
			return this.RCDCST;
		}

		public Boolean RCDCSTIsNullable() {
			return true;
		}

		public Boolean RCDCSTIsKey() {
			return false;
		}

		public Integer RCDCSTLength() {
			return null;
		}

		public Integer RCDCSTPrecision() {
			return null;
		}

		public String RCDCSTDefault() {

			return "";

		}

		public String RCDCSTComment() {

			return "";

		}

		public String RCDCSTPattern() {

			return "";

		}

		public String RCDCSTOriginalDbColumnName() {

			return "RCDCST";

		}

		public BigDecimal RCDAMT;

		public BigDecimal getRCDAMT() {
			return this.RCDAMT;
		}

		public Boolean RCDAMTIsNullable() {
			return true;
		}

		public Boolean RCDAMTIsKey() {
			return false;
		}

		public Integer RCDAMTLength() {
			return null;
		}

		public Integer RCDAMTPrecision() {
			return null;
		}

		public String RCDAMTDefault() {

			return "";

		}

		public String RCDAMTComment() {

			return "";

		}

		public String RCDAMTPattern() {

			return "";

		}

		public String RCDAMTOriginalDbColumnName() {

			return "RCDAMT";

		}

		public BigDecimal RCDUAA;

		public BigDecimal getRCDUAA() {
			return this.RCDUAA;
		}

		public Boolean RCDUAAIsNullable() {
			return true;
		}

		public Boolean RCDUAAIsKey() {
			return false;
		}

		public Integer RCDUAALength() {
			return null;
		}

		public Integer RCDUAAPrecision() {
			return null;
		}

		public String RCDUAADefault() {

			return "";

		}

		public String RCDUAAComment() {

			return "";

		}

		public String RCDUAAPattern() {

			return "";

		}

		public String RCDUAAOriginalDbColumnName() {

			return "RCDUAA";

		}

		public BigDecimal RCDUPA;

		public BigDecimal getRCDUPA() {
			return this.RCDUPA;
		}

		public Boolean RCDUPAIsNullable() {
			return true;
		}

		public Boolean RCDUPAIsKey() {
			return false;
		}

		public Integer RCDUPALength() {
			return null;
		}

		public Integer RCDUPAPrecision() {
			return null;
		}

		public String RCDUPADefault() {

			return "";

		}

		public String RCDUPAComment() {

			return "";

		}

		public String RCDUPAPattern() {

			return "";

		}

		public String RCDUPAOriginalDbColumnName() {

			return "RCDUPA";

		}

		public BigDecimal RCDWAA;

		public BigDecimal getRCDWAA() {
			return this.RCDWAA;
		}

		public Boolean RCDWAAIsNullable() {
			return true;
		}

		public Boolean RCDWAAIsKey() {
			return false;
		}

		public Integer RCDWAALength() {
			return null;
		}

		public Integer RCDWAAPrecision() {
			return null;
		}

		public String RCDWAADefault() {

			return "";

		}

		public String RCDWAAComment() {

			return "";

		}

		public String RCDWAAPattern() {

			return "";

		}

		public String RCDWAAOriginalDbColumnName() {

			return "RCDWAA";

		}

		public BigDecimal RCDWPA;

		public BigDecimal getRCDWPA() {
			return this.RCDWPA;
		}

		public Boolean RCDWPAIsNullable() {
			return true;
		}

		public Boolean RCDWPAIsKey() {
			return false;
		}

		public Integer RCDWPALength() {
			return null;
		}

		public Integer RCDWPAPrecision() {
			return null;
		}

		public String RCDWPADefault() {

			return "";

		}

		public String RCDWPAComment() {

			return "";

		}

		public String RCDWPAPattern() {

			return "";

		}

		public String RCDWPAOriginalDbColumnName() {

			return "RCDWPA";

		}

		public String RCDRTP;

		public String getRCDRTP() {
			return this.RCDRTP;
		}

		public Boolean RCDRTPIsNullable() {
			return true;
		}

		public Boolean RCDRTPIsKey() {
			return false;
		}

		public Integer RCDRTPLength() {
			return null;
		}

		public Integer RCDRTPPrecision() {
			return null;
		}

		public String RCDRTPDefault() {

			return null;

		}

		public String RCDRTPComment() {

			return "";

		}

		public String RCDRTPPattern() {

			return "";

		}

		public String RCDRTPOriginalDbColumnName() {

			return "RCDRTP";

		}

		public String RCDBYR;

		public String getRCDBYR() {
			return this.RCDBYR;
		}

		public Boolean RCDBYRIsNullable() {
			return true;
		}

		public Boolean RCDBYRIsKey() {
			return false;
		}

		public Integer RCDBYRLength() {
			return null;
		}

		public Integer RCDBYRPrecision() {
			return null;
		}

		public String RCDBYRDefault() {

			return null;

		}

		public String RCDBYRComment() {

			return "";

		}

		public String RCDBYRPattern() {

			return "";

		}

		public String RCDBYROriginalDbColumnName() {

			return "RCDBYR";

		}

		public BigDecimal RCDDPT;

		public BigDecimal getRCDDPT() {
			return this.RCDDPT;
		}

		public Boolean RCDDPTIsNullable() {
			return true;
		}

		public Boolean RCDDPTIsKey() {
			return false;
		}

		public Integer RCDDPTLength() {
			return null;
		}

		public Integer RCDDPTPrecision() {
			return null;
		}

		public String RCDDPTDefault() {

			return "";

		}

		public String RCDDPTComment() {

			return "";

		}

		public String RCDDPTPattern() {

			return "";

		}

		public String RCDDPTOriginalDbColumnName() {

			return "RCDDPT";

		}

		public BigDecimal RCDSDP;

		public BigDecimal getRCDSDP() {
			return this.RCDSDP;
		}

		public Boolean RCDSDPIsNullable() {
			return true;
		}

		public Boolean RCDSDPIsKey() {
			return false;
		}

		public Integer RCDSDPLength() {
			return null;
		}

		public Integer RCDSDPPrecision() {
			return null;
		}

		public String RCDSDPDefault() {

			return "";

		}

		public String RCDSDPComment() {

			return "";

		}

		public String RCDSDPPattern() {

			return "";

		}

		public String RCDSDPOriginalDbColumnName() {

			return "RCDSDP";

		}

		public BigDecimal RCDCLS;

		public BigDecimal getRCDCLS() {
			return this.RCDCLS;
		}

		public Boolean RCDCLSIsNullable() {
			return true;
		}

		public Boolean RCDCLSIsKey() {
			return false;
		}

		public Integer RCDCLSLength() {
			return null;
		}

		public Integer RCDCLSPrecision() {
			return null;
		}

		public String RCDCLSDefault() {

			return "";

		}

		public String RCDCLSComment() {

			return "";

		}

		public String RCDCLSPattern() {

			return "";

		}

		public String RCDCLSOriginalDbColumnName() {

			return "RCDCLS";

		}

		public BigDecimal RCDSCL;

		public BigDecimal getRCDSCL() {
			return this.RCDSCL;
		}

		public Boolean RCDSCLIsNullable() {
			return true;
		}

		public Boolean RCDSCLIsKey() {
			return false;
		}

		public Integer RCDSCLLength() {
			return null;
		}

		public Integer RCDSCLPrecision() {
			return null;
		}

		public String RCDSCLDefault() {

			return "";

		}

		public String RCDSCLComment() {

			return "";

		}

		public String RCDSCLPattern() {

			return "";

		}

		public String RCDSCLOriginalDbColumnName() {

			return "RCDSCL";

		}

		public Double RCDRCV;

		public Double getRCDRCV() {
			return this.RCDRCV;
		}

		public Boolean RCDRCVIsNullable() {
			return true;
		}

		public Boolean RCDRCVIsKey() {
			return false;
		}

		public Integer RCDRCVLength() {
			return null;
		}

		public Integer RCDRCVPrecision() {
			return null;
		}

		public String RCDRCVDefault() {

			return "";

		}

		public String RCDRCVComment() {

			return "";

		}

		public String RCDRCVPattern() {

			return "";

		}

		public String RCDRCVOriginalDbColumnName() {

			return "RCDRCV";

		}

		public BigDecimal RCDADJ;

		public BigDecimal getRCDADJ() {
			return this.RCDADJ;
		}

		public Boolean RCDADJIsNullable() {
			return true;
		}

		public Boolean RCDADJIsKey() {
			return false;
		}

		public Integer RCDADJLength() {
			return null;
		}

		public Integer RCDADJPrecision() {
			return null;
		}

		public String RCDADJDefault() {

			return "";

		}

		public String RCDADJComment() {

			return "";

		}

		public String RCDADJPattern() {

			return "";

		}

		public String RCDADJOriginalDbColumnName() {

			return "RCDADJ";

		}

		public BigDecimal RCDBCK;

		public BigDecimal getRCDBCK() {
			return this.RCDBCK;
		}

		public Boolean RCDBCKIsNullable() {
			return true;
		}

		public Boolean RCDBCKIsKey() {
			return false;
		}

		public Integer RCDBCKLength() {
			return null;
		}

		public Integer RCDBCKPrecision() {
			return null;
		}

		public String RCDBCKDefault() {

			return "";

		}

		public String RCDBCKComment() {

			return "";

		}

		public String RCDBCKPattern() {

			return "";

		}

		public String RCDBCKOriginalDbColumnName() {

			return "RCDBCK";

		}

		public String RCDCOG;

		public String getRCDCOG() {
			return this.RCDCOG;
		}

		public Boolean RCDCOGIsNullable() {
			return true;
		}

		public Boolean RCDCOGIsKey() {
			return false;
		}

		public Integer RCDCOGLength() {
			return null;
		}

		public Integer RCDCOGPrecision() {
			return null;
		}

		public String RCDCOGDefault() {

			return null;

		}

		public String RCDCOGComment() {

			return "";

		}

		public String RCDCOGPattern() {

			return "";

		}

		public String RCDCOGOriginalDbColumnName() {

			return "RCDCOG";

		}

		public String RCDCGL;

		public String getRCDCGL() {
			return this.RCDCGL;
		}

		public Boolean RCDCGLIsNullable() {
			return true;
		}

		public Boolean RCDCGLIsKey() {
			return false;
		}

		public Integer RCDCGLLength() {
			return null;
		}

		public Integer RCDCGLPrecision() {
			return null;
		}

		public String RCDCGLDefault() {

			return null;

		}

		public String RCDCGLComment() {

			return "";

		}

		public String RCDCGLPattern() {

			return "";

		}

		public String RCDCGLOriginalDbColumnName() {

			return "RCDCGL";

		}

		public BigDecimal RCDRQT;

		public BigDecimal getRCDRQT() {
			return this.RCDRQT;
		}

		public Boolean RCDRQTIsNullable() {
			return true;
		}

		public Boolean RCDRQTIsKey() {
			return false;
		}

		public Integer RCDRQTLength() {
			return null;
		}

		public Integer RCDRQTPrecision() {
			return null;
		}

		public String RCDRQTDefault() {

			return "";

		}

		public String RCDRQTComment() {

			return "";

		}

		public String RCDRQTPattern() {

			return "";

		}

		public String RCDRQTOriginalDbColumnName() {

			return "RCDRQT";

		}

		public BigDecimal RCDRWT;

		public BigDecimal getRCDRWT() {
			return this.RCDRWT;
		}

		public Boolean RCDRWTIsNullable() {
			return true;
		}

		public Boolean RCDRWTIsKey() {
			return false;
		}

		public Integer RCDRWTLength() {
			return null;
		}

		public Integer RCDRWTPrecision() {
			return null;
		}

		public String RCDRWTDefault() {

			return "";

		}

		public String RCDRWTComment() {

			return "";

		}

		public String RCDRWTPattern() {

			return "";

		}

		public String RCDRWTOriginalDbColumnName() {

			return "RCDRWT";

		}

		public BigDecimal RCDOVR;

		public BigDecimal getRCDOVR() {
			return this.RCDOVR;
		}

		public Boolean RCDOVRIsNullable() {
			return true;
		}

		public Boolean RCDOVRIsKey() {
			return false;
		}

		public Integer RCDOVRLength() {
			return null;
		}

		public Integer RCDOVRPrecision() {
			return null;
		}

		public String RCDOVRDefault() {

			return "";

		}

		public String RCDOVRComment() {

			return "";

		}

		public String RCDOVRPattern() {

			return "";

		}

		public String RCDOVROriginalDbColumnName() {

			return "RCDOVR";

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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.RCDRCV = null;
					} else {
						this.RCDRCV = dis.readDouble();
					}

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.RCDRCV = null;
					} else {
						this.RCDRCV = dis.readDouble();
					}

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// Double

				if (this.RCDRCV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.RCDRCV);
				}

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// Double

				if (this.RCDRCV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.RCDRCV);
				}

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

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
			sb.append("RCDVEN=" + String.valueOf(RCDVEN));
			sb.append(",RCDVRF=" + String.valueOf(RCDVRF));
			sb.append(",RCDSVN=" + String.valueOf(RCDSVN));
			sb.append(",RCDSTY=" + RCDSTY);
			sb.append(",RCDSKU=" + String.valueOf(RCDSKU));
			sb.append(",RCDLOC=" + String.valueOf(RCDLOC));
			sb.append(",RCDTYP=" + String.valueOf(RCDTYP));
			sb.append(",RCDCEN=" + String.valueOf(RCDCEN));
			sb.append(",RCDDAT=" + String.valueOf(RCDDAT));
			sb.append(",RCDQTY=" + String.valueOf(RCDQTY));
			sb.append(",RCDWGT=" + String.valueOf(RCDWGT));
			sb.append(",RCDCST=" + String.valueOf(RCDCST));
			sb.append(",RCDAMT=" + String.valueOf(RCDAMT));
			sb.append(",RCDUAA=" + String.valueOf(RCDUAA));
			sb.append(",RCDUPA=" + String.valueOf(RCDUPA));
			sb.append(",RCDWAA=" + String.valueOf(RCDWAA));
			sb.append(",RCDWPA=" + String.valueOf(RCDWPA));
			sb.append(",RCDRTP=" + RCDRTP);
			sb.append(",RCDBYR=" + RCDBYR);
			sb.append(",RCDDPT=" + String.valueOf(RCDDPT));
			sb.append(",RCDSDP=" + String.valueOf(RCDSDP));
			sb.append(",RCDCLS=" + String.valueOf(RCDCLS));
			sb.append(",RCDSCL=" + String.valueOf(RCDSCL));
			sb.append(",RCDRCV=" + String.valueOf(RCDRCV));
			sb.append(",RCDADJ=" + String.valueOf(RCDADJ));
			sb.append(",RCDBCK=" + String.valueOf(RCDBCK));
			sb.append(",RCDCOG=" + RCDCOG);
			sb.append(",RCDCGL=" + RCDCGL);
			sb.append(",RCDRQT=" + String.valueOf(RCDRQT));
			sb.append(",RCDRWT=" + String.valueOf(RCDRWT));
			sb.append(",RCDOVR=" + String.valueOf(RCDOVR));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (RCDVEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVEN);
			}

			sb.append("|");

			if (RCDVRF == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVRF);
			}

			sb.append("|");

			if (RCDSVN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSVN);
			}

			sb.append("|");

			if (RCDSTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSTY);
			}

			sb.append("|");

			if (RCDSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSKU);
			}

			sb.append("|");

			if (RCDLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDLOC);
			}

			sb.append("|");

			if (RCDTYP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDTYP);
			}

			sb.append("|");

			if (RCDCEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCEN);
			}

			sb.append("|");

			if (RCDDAT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDAT);
			}

			sb.append("|");

			if (RCDQTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDQTY);
			}

			sb.append("|");

			if (RCDWGT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWGT);
			}

			sb.append("|");

			if (RCDCST == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCST);
			}

			sb.append("|");

			if (RCDAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDAMT);
			}

			sb.append("|");

			if (RCDUAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUAA);
			}

			sb.append("|");

			if (RCDUPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUPA);
			}

			sb.append("|");

			if (RCDWAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWAA);
			}

			sb.append("|");

			if (RCDWPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWPA);
			}

			sb.append("|");

			if (RCDRTP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRTP);
			}

			sb.append("|");

			if (RCDBYR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBYR);
			}

			sb.append("|");

			if (RCDDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDPT);
			}

			sb.append("|");

			if (RCDSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSDP);
			}

			sb.append("|");

			if (RCDCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCLS);
			}

			sb.append("|");

			if (RCDSCL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSCL);
			}

			sb.append("|");

			if (RCDRCV == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRCV);
			}

			sb.append("|");

			if (RCDADJ == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDADJ);
			}

			sb.append("|");

			if (RCDBCK == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBCK);
			}

			sb.append("|");

			if (RCDCOG == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCOG);
			}

			sb.append("|");

			if (RCDCGL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCGL);
			}

			sb.append("|");

			if (RCDRQT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRQT);
			}

			sb.append("|");

			if (RCDRWT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRWT);
			}

			sb.append("|");

			if (RCDOVR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDOVR);
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
		public int compareTo(INVMSTStruct other) {

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

	public static class row7Struct implements routines.system.IPersistableRow<row7Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal RCDVEN;

		public BigDecimal getRCDVEN() {
			return this.RCDVEN;
		}

		public Boolean RCDVENIsNullable() {
			return true;
		}

		public Boolean RCDVENIsKey() {
			return false;
		}

		public Integer RCDVENLength() {
			return null;
		}

		public Integer RCDVENPrecision() {
			return null;
		}

		public String RCDVENDefault() {

			return "";

		}

		public String RCDVENComment() {

			return "";

		}

		public String RCDVENPattern() {

			return "";

		}

		public String RCDVENOriginalDbColumnName() {

			return "RCDVEN";

		}

		public BigDecimal RCDVRF;

		public BigDecimal getRCDVRF() {
			return this.RCDVRF;
		}

		public Boolean RCDVRFIsNullable() {
			return true;
		}

		public Boolean RCDVRFIsKey() {
			return false;
		}

		public Integer RCDVRFLength() {
			return null;
		}

		public Integer RCDVRFPrecision() {
			return null;
		}

		public String RCDVRFDefault() {

			return "";

		}

		public String RCDVRFComment() {

			return "";

		}

		public String RCDVRFPattern() {

			return "";

		}

		public String RCDVRFOriginalDbColumnName() {

			return "RCDVRF";

		}

		public BigDecimal RCDSVN;

		public BigDecimal getRCDSVN() {
			return this.RCDSVN;
		}

		public Boolean RCDSVNIsNullable() {
			return true;
		}

		public Boolean RCDSVNIsKey() {
			return false;
		}

		public Integer RCDSVNLength() {
			return null;
		}

		public Integer RCDSVNPrecision() {
			return null;
		}

		public String RCDSVNDefault() {

			return "";

		}

		public String RCDSVNComment() {

			return "";

		}

		public String RCDSVNPattern() {

			return "";

		}

		public String RCDSVNOriginalDbColumnName() {

			return "RCDSVN";

		}

		public String RCDSTY;

		public String getRCDSTY() {
			return this.RCDSTY;
		}

		public Boolean RCDSTYIsNullable() {
			return true;
		}

		public Boolean RCDSTYIsKey() {
			return false;
		}

		public Integer RCDSTYLength() {
			return null;
		}

		public Integer RCDSTYPrecision() {
			return null;
		}

		public String RCDSTYDefault() {

			return null;

		}

		public String RCDSTYComment() {

			return "";

		}

		public String RCDSTYPattern() {

			return "";

		}

		public String RCDSTYOriginalDbColumnName() {

			return "RCDSTY";

		}

		public BigDecimal RCDSKU;

		public BigDecimal getRCDSKU() {
			return this.RCDSKU;
		}

		public Boolean RCDSKUIsNullable() {
			return true;
		}

		public Boolean RCDSKUIsKey() {
			return false;
		}

		public Integer RCDSKULength() {
			return null;
		}

		public Integer RCDSKUPrecision() {
			return null;
		}

		public String RCDSKUDefault() {

			return "";

		}

		public String RCDSKUComment() {

			return "";

		}

		public String RCDSKUPattern() {

			return "";

		}

		public String RCDSKUOriginalDbColumnName() {

			return "RCDSKU";

		}

		public BigDecimal RCDLOC;

		public BigDecimal getRCDLOC() {
			return this.RCDLOC;
		}

		public Boolean RCDLOCIsNullable() {
			return true;
		}

		public Boolean RCDLOCIsKey() {
			return false;
		}

		public Integer RCDLOCLength() {
			return null;
		}

		public Integer RCDLOCPrecision() {
			return null;
		}

		public String RCDLOCDefault() {

			return "";

		}

		public String RCDLOCComment() {

			return "";

		}

		public String RCDLOCPattern() {

			return "";

		}

		public String RCDLOCOriginalDbColumnName() {

			return "RCDLOC";

		}

		public BigDecimal RCDTYP;

		public BigDecimal getRCDTYP() {
			return this.RCDTYP;
		}

		public Boolean RCDTYPIsNullable() {
			return true;
		}

		public Boolean RCDTYPIsKey() {
			return false;
		}

		public Integer RCDTYPLength() {
			return null;
		}

		public Integer RCDTYPPrecision() {
			return null;
		}

		public String RCDTYPDefault() {

			return "";

		}

		public String RCDTYPComment() {

			return "";

		}

		public String RCDTYPPattern() {

			return "";

		}

		public String RCDTYPOriginalDbColumnName() {

			return "RCDTYP";

		}

		public BigDecimal RCDCEN;

		public BigDecimal getRCDCEN() {
			return this.RCDCEN;
		}

		public Boolean RCDCENIsNullable() {
			return true;
		}

		public Boolean RCDCENIsKey() {
			return false;
		}

		public Integer RCDCENLength() {
			return null;
		}

		public Integer RCDCENPrecision() {
			return null;
		}

		public String RCDCENDefault() {

			return "";

		}

		public String RCDCENComment() {

			return "";

		}

		public String RCDCENPattern() {

			return "";

		}

		public String RCDCENOriginalDbColumnName() {

			return "RCDCEN";

		}

		public BigDecimal RCDDAT;

		public BigDecimal getRCDDAT() {
			return this.RCDDAT;
		}

		public Boolean RCDDATIsNullable() {
			return true;
		}

		public Boolean RCDDATIsKey() {
			return false;
		}

		public Integer RCDDATLength() {
			return null;
		}

		public Integer RCDDATPrecision() {
			return null;
		}

		public String RCDDATDefault() {

			return "";

		}

		public String RCDDATComment() {

			return "";

		}

		public String RCDDATPattern() {

			return "";

		}

		public String RCDDATOriginalDbColumnName() {

			return "RCDDAT";

		}

		public BigDecimal RCDQTY;

		public BigDecimal getRCDQTY() {
			return this.RCDQTY;
		}

		public Boolean RCDQTYIsNullable() {
			return true;
		}

		public Boolean RCDQTYIsKey() {
			return false;
		}

		public Integer RCDQTYLength() {
			return null;
		}

		public Integer RCDQTYPrecision() {
			return null;
		}

		public String RCDQTYDefault() {

			return "";

		}

		public String RCDQTYComment() {

			return "";

		}

		public String RCDQTYPattern() {

			return "";

		}

		public String RCDQTYOriginalDbColumnName() {

			return "RCDQTY";

		}

		public BigDecimal RCDWGT;

		public BigDecimal getRCDWGT() {
			return this.RCDWGT;
		}

		public Boolean RCDWGTIsNullable() {
			return true;
		}

		public Boolean RCDWGTIsKey() {
			return false;
		}

		public Integer RCDWGTLength() {
			return null;
		}

		public Integer RCDWGTPrecision() {
			return null;
		}

		public String RCDWGTDefault() {

			return "";

		}

		public String RCDWGTComment() {

			return "";

		}

		public String RCDWGTPattern() {

			return "";

		}

		public String RCDWGTOriginalDbColumnName() {

			return "RCDWGT";

		}

		public BigDecimal RCDCST;

		public BigDecimal getRCDCST() {
			return this.RCDCST;
		}

		public Boolean RCDCSTIsNullable() {
			return true;
		}

		public Boolean RCDCSTIsKey() {
			return false;
		}

		public Integer RCDCSTLength() {
			return null;
		}

		public Integer RCDCSTPrecision() {
			return null;
		}

		public String RCDCSTDefault() {

			return "";

		}

		public String RCDCSTComment() {

			return "";

		}

		public String RCDCSTPattern() {

			return "";

		}

		public String RCDCSTOriginalDbColumnName() {

			return "RCDCST";

		}

		public BigDecimal RCDAMT;

		public BigDecimal getRCDAMT() {
			return this.RCDAMT;
		}

		public Boolean RCDAMTIsNullable() {
			return true;
		}

		public Boolean RCDAMTIsKey() {
			return false;
		}

		public Integer RCDAMTLength() {
			return null;
		}

		public Integer RCDAMTPrecision() {
			return null;
		}

		public String RCDAMTDefault() {

			return "";

		}

		public String RCDAMTComment() {

			return "";

		}

		public String RCDAMTPattern() {

			return "";

		}

		public String RCDAMTOriginalDbColumnName() {

			return "RCDAMT";

		}

		public BigDecimal RCDUAA;

		public BigDecimal getRCDUAA() {
			return this.RCDUAA;
		}

		public Boolean RCDUAAIsNullable() {
			return true;
		}

		public Boolean RCDUAAIsKey() {
			return false;
		}

		public Integer RCDUAALength() {
			return null;
		}

		public Integer RCDUAAPrecision() {
			return null;
		}

		public String RCDUAADefault() {

			return "";

		}

		public String RCDUAAComment() {

			return "";

		}

		public String RCDUAAPattern() {

			return "";

		}

		public String RCDUAAOriginalDbColumnName() {

			return "RCDUAA";

		}

		public BigDecimal RCDUPA;

		public BigDecimal getRCDUPA() {
			return this.RCDUPA;
		}

		public Boolean RCDUPAIsNullable() {
			return true;
		}

		public Boolean RCDUPAIsKey() {
			return false;
		}

		public Integer RCDUPALength() {
			return null;
		}

		public Integer RCDUPAPrecision() {
			return null;
		}

		public String RCDUPADefault() {

			return "";

		}

		public String RCDUPAComment() {

			return "";

		}

		public String RCDUPAPattern() {

			return "";

		}

		public String RCDUPAOriginalDbColumnName() {

			return "RCDUPA";

		}

		public BigDecimal RCDWAA;

		public BigDecimal getRCDWAA() {
			return this.RCDWAA;
		}

		public Boolean RCDWAAIsNullable() {
			return true;
		}

		public Boolean RCDWAAIsKey() {
			return false;
		}

		public Integer RCDWAALength() {
			return null;
		}

		public Integer RCDWAAPrecision() {
			return null;
		}

		public String RCDWAADefault() {

			return "";

		}

		public String RCDWAAComment() {

			return "";

		}

		public String RCDWAAPattern() {

			return "";

		}

		public String RCDWAAOriginalDbColumnName() {

			return "RCDWAA";

		}

		public BigDecimal RCDWPA;

		public BigDecimal getRCDWPA() {
			return this.RCDWPA;
		}

		public Boolean RCDWPAIsNullable() {
			return true;
		}

		public Boolean RCDWPAIsKey() {
			return false;
		}

		public Integer RCDWPALength() {
			return null;
		}

		public Integer RCDWPAPrecision() {
			return null;
		}

		public String RCDWPADefault() {

			return "";

		}

		public String RCDWPAComment() {

			return "";

		}

		public String RCDWPAPattern() {

			return "";

		}

		public String RCDWPAOriginalDbColumnName() {

			return "RCDWPA";

		}

		public String RCDRTP;

		public String getRCDRTP() {
			return this.RCDRTP;
		}

		public Boolean RCDRTPIsNullable() {
			return true;
		}

		public Boolean RCDRTPIsKey() {
			return false;
		}

		public Integer RCDRTPLength() {
			return null;
		}

		public Integer RCDRTPPrecision() {
			return null;
		}

		public String RCDRTPDefault() {

			return "";

		}

		public String RCDRTPComment() {

			return "";

		}

		public String RCDRTPPattern() {

			return "";

		}

		public String RCDRTPOriginalDbColumnName() {

			return "RCDRTP";

		}

		public String RCDBYR;

		public String getRCDBYR() {
			return this.RCDBYR;
		}

		public Boolean RCDBYRIsNullable() {
			return true;
		}

		public Boolean RCDBYRIsKey() {
			return false;
		}

		public Integer RCDBYRLength() {
			return null;
		}

		public Integer RCDBYRPrecision() {
			return null;
		}

		public String RCDBYRDefault() {

			return "";

		}

		public String RCDBYRComment() {

			return "";

		}

		public String RCDBYRPattern() {

			return "";

		}

		public String RCDBYROriginalDbColumnName() {

			return "RCDBYR";

		}

		public BigDecimal RCDDPT;

		public BigDecimal getRCDDPT() {
			return this.RCDDPT;
		}

		public Boolean RCDDPTIsNullable() {
			return true;
		}

		public Boolean RCDDPTIsKey() {
			return false;
		}

		public Integer RCDDPTLength() {
			return null;
		}

		public Integer RCDDPTPrecision() {
			return null;
		}

		public String RCDDPTDefault() {

			return "";

		}

		public String RCDDPTComment() {

			return "";

		}

		public String RCDDPTPattern() {

			return "";

		}

		public String RCDDPTOriginalDbColumnName() {

			return "RCDDPT";

		}

		public BigDecimal RCDSDP;

		public BigDecimal getRCDSDP() {
			return this.RCDSDP;
		}

		public Boolean RCDSDPIsNullable() {
			return true;
		}

		public Boolean RCDSDPIsKey() {
			return false;
		}

		public Integer RCDSDPLength() {
			return null;
		}

		public Integer RCDSDPPrecision() {
			return null;
		}

		public String RCDSDPDefault() {

			return "";

		}

		public String RCDSDPComment() {

			return "";

		}

		public String RCDSDPPattern() {

			return "";

		}

		public String RCDSDPOriginalDbColumnName() {

			return "RCDSDP";

		}

		public BigDecimal RCDCLS;

		public BigDecimal getRCDCLS() {
			return this.RCDCLS;
		}

		public Boolean RCDCLSIsNullable() {
			return true;
		}

		public Boolean RCDCLSIsKey() {
			return false;
		}

		public Integer RCDCLSLength() {
			return null;
		}

		public Integer RCDCLSPrecision() {
			return null;
		}

		public String RCDCLSDefault() {

			return "";

		}

		public String RCDCLSComment() {

			return "";

		}

		public String RCDCLSPattern() {

			return "";

		}

		public String RCDCLSOriginalDbColumnName() {

			return "RCDCLS";

		}

		public BigDecimal RCDSCL;

		public BigDecimal getRCDSCL() {
			return this.RCDSCL;
		}

		public Boolean RCDSCLIsNullable() {
			return true;
		}

		public Boolean RCDSCLIsKey() {
			return false;
		}

		public Integer RCDSCLLength() {
			return null;
		}

		public Integer RCDSCLPrecision() {
			return null;
		}

		public String RCDSCLDefault() {

			return "";

		}

		public String RCDSCLComment() {

			return "";

		}

		public String RCDSCLPattern() {

			return "";

		}

		public String RCDSCLOriginalDbColumnName() {

			return "RCDSCL";

		}

		public Double RCDRCV;

		public Double getRCDRCV() {
			return this.RCDRCV;
		}

		public Boolean RCDRCVIsNullable() {
			return true;
		}

		public Boolean RCDRCVIsKey() {
			return false;
		}

		public Integer RCDRCVLength() {
			return null;
		}

		public Integer RCDRCVPrecision() {
			return null;
		}

		public String RCDRCVDefault() {

			return "";

		}

		public String RCDRCVComment() {

			return "";

		}

		public String RCDRCVPattern() {

			return "";

		}

		public String RCDRCVOriginalDbColumnName() {

			return "RCDRCV";

		}

		public BigDecimal RCDADJ;

		public BigDecimal getRCDADJ() {
			return this.RCDADJ;
		}

		public Boolean RCDADJIsNullable() {
			return true;
		}

		public Boolean RCDADJIsKey() {
			return false;
		}

		public Integer RCDADJLength() {
			return null;
		}

		public Integer RCDADJPrecision() {
			return null;
		}

		public String RCDADJDefault() {

			return "";

		}

		public String RCDADJComment() {

			return "";

		}

		public String RCDADJPattern() {

			return "";

		}

		public String RCDADJOriginalDbColumnName() {

			return "RCDADJ";

		}

		public BigDecimal RCDBCK;

		public BigDecimal getRCDBCK() {
			return this.RCDBCK;
		}

		public Boolean RCDBCKIsNullable() {
			return true;
		}

		public Boolean RCDBCKIsKey() {
			return false;
		}

		public Integer RCDBCKLength() {
			return null;
		}

		public Integer RCDBCKPrecision() {
			return null;
		}

		public String RCDBCKDefault() {

			return "";

		}

		public String RCDBCKComment() {

			return "";

		}

		public String RCDBCKPattern() {

			return "";

		}

		public String RCDBCKOriginalDbColumnName() {

			return "RCDBCK";

		}

		public String RCDCOG;

		public String getRCDCOG() {
			return this.RCDCOG;
		}

		public Boolean RCDCOGIsNullable() {
			return true;
		}

		public Boolean RCDCOGIsKey() {
			return false;
		}

		public Integer RCDCOGLength() {
			return null;
		}

		public Integer RCDCOGPrecision() {
			return null;
		}

		public String RCDCOGDefault() {

			return null;

		}

		public String RCDCOGComment() {

			return "";

		}

		public String RCDCOGPattern() {

			return "";

		}

		public String RCDCOGOriginalDbColumnName() {

			return "RCDCOG";

		}

		public String RCDCGL;

		public String getRCDCGL() {
			return this.RCDCGL;
		}

		public Boolean RCDCGLIsNullable() {
			return true;
		}

		public Boolean RCDCGLIsKey() {
			return false;
		}

		public Integer RCDCGLLength() {
			return null;
		}

		public Integer RCDCGLPrecision() {
			return null;
		}

		public String RCDCGLDefault() {

			return null;

		}

		public String RCDCGLComment() {

			return "";

		}

		public String RCDCGLPattern() {

			return "";

		}

		public String RCDCGLOriginalDbColumnName() {

			return "RCDCGL";

		}

		public BigDecimal RCDRQT;

		public BigDecimal getRCDRQT() {
			return this.RCDRQT;
		}

		public Boolean RCDRQTIsNullable() {
			return true;
		}

		public Boolean RCDRQTIsKey() {
			return false;
		}

		public Integer RCDRQTLength() {
			return null;
		}

		public Integer RCDRQTPrecision() {
			return null;
		}

		public String RCDRQTDefault() {

			return "";

		}

		public String RCDRQTComment() {

			return "";

		}

		public String RCDRQTPattern() {

			return "";

		}

		public String RCDRQTOriginalDbColumnName() {

			return "RCDRQT";

		}

		public BigDecimal RCDRWT;

		public BigDecimal getRCDRWT() {
			return this.RCDRWT;
		}

		public Boolean RCDRWTIsNullable() {
			return true;
		}

		public Boolean RCDRWTIsKey() {
			return false;
		}

		public Integer RCDRWTLength() {
			return null;
		}

		public Integer RCDRWTPrecision() {
			return null;
		}

		public String RCDRWTDefault() {

			return "";

		}

		public String RCDRWTComment() {

			return "";

		}

		public String RCDRWTPattern() {

			return "";

		}

		public String RCDRWTOriginalDbColumnName() {

			return "RCDRWT";

		}

		public BigDecimal RCDOVR;

		public BigDecimal getRCDOVR() {
			return this.RCDOVR;
		}

		public Boolean RCDOVRIsNullable() {
			return true;
		}

		public Boolean RCDOVRIsKey() {
			return false;
		}

		public Integer RCDOVRLength() {
			return null;
		}

		public Integer RCDOVRPrecision() {
			return null;
		}

		public String RCDOVRDefault() {

			return "";

		}

		public String RCDOVRComment() {

			return "";

		}

		public String RCDOVRPattern() {

			return "";

		}

		public String RCDOVROriginalDbColumnName() {

			return "RCDOVR";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.RCDRCV = null;
					} else {
						this.RCDRCV = dis.readDouble();
					}

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.RCDVEN = (BigDecimal) dis.readObject();

					this.RCDVRF = (BigDecimal) dis.readObject();

					this.RCDSVN = (BigDecimal) dis.readObject();

					this.RCDSTY = readString(dis);

					this.RCDSKU = (BigDecimal) dis.readObject();

					this.RCDLOC = (BigDecimal) dis.readObject();

					this.RCDTYP = (BigDecimal) dis.readObject();

					this.RCDCEN = (BigDecimal) dis.readObject();

					this.RCDDAT = (BigDecimal) dis.readObject();

					this.RCDQTY = (BigDecimal) dis.readObject();

					this.RCDWGT = (BigDecimal) dis.readObject();

					this.RCDCST = (BigDecimal) dis.readObject();

					this.RCDAMT = (BigDecimal) dis.readObject();

					this.RCDUAA = (BigDecimal) dis.readObject();

					this.RCDUPA = (BigDecimal) dis.readObject();

					this.RCDWAA = (BigDecimal) dis.readObject();

					this.RCDWPA = (BigDecimal) dis.readObject();

					this.RCDRTP = readString(dis);

					this.RCDBYR = readString(dis);

					this.RCDDPT = (BigDecimal) dis.readObject();

					this.RCDSDP = (BigDecimal) dis.readObject();

					this.RCDCLS = (BigDecimal) dis.readObject();

					this.RCDSCL = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.RCDRCV = null;
					} else {
						this.RCDRCV = dis.readDouble();
					}

					this.RCDADJ = (BigDecimal) dis.readObject();

					this.RCDBCK = (BigDecimal) dis.readObject();

					this.RCDCOG = readString(dis);

					this.RCDCGL = readString(dis);

					this.RCDRQT = (BigDecimal) dis.readObject();

					this.RCDRWT = (BigDecimal) dis.readObject();

					this.RCDOVR = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// Double

				if (this.RCDRCV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.RCDRCV);
				}

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.RCDVEN);

				// BigDecimal

				dos.writeObject(this.RCDVRF);

				// BigDecimal

				dos.writeObject(this.RCDSVN);

				// String

				writeString(this.RCDSTY, dos);

				// BigDecimal

				dos.writeObject(this.RCDSKU);

				// BigDecimal

				dos.writeObject(this.RCDLOC);

				// BigDecimal

				dos.writeObject(this.RCDTYP);

				// BigDecimal

				dos.writeObject(this.RCDCEN);

				// BigDecimal

				dos.writeObject(this.RCDDAT);

				// BigDecimal

				dos.writeObject(this.RCDQTY);

				// BigDecimal

				dos.writeObject(this.RCDWGT);

				// BigDecimal

				dos.writeObject(this.RCDCST);

				// BigDecimal

				dos.writeObject(this.RCDAMT);

				// BigDecimal

				dos.writeObject(this.RCDUAA);

				// BigDecimal

				dos.writeObject(this.RCDUPA);

				// BigDecimal

				dos.writeObject(this.RCDWAA);

				// BigDecimal

				dos.writeObject(this.RCDWPA);

				// String

				writeString(this.RCDRTP, dos);

				// String

				writeString(this.RCDBYR, dos);

				// BigDecimal

				dos.writeObject(this.RCDDPT);

				// BigDecimal

				dos.writeObject(this.RCDSDP);

				// BigDecimal

				dos.writeObject(this.RCDCLS);

				// BigDecimal

				dos.writeObject(this.RCDSCL);

				// Double

				if (this.RCDRCV == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.RCDRCV);
				}

				// BigDecimal

				dos.writeObject(this.RCDADJ);

				// BigDecimal

				dos.writeObject(this.RCDBCK);

				// String

				writeString(this.RCDCOG, dos);

				// String

				writeString(this.RCDCGL, dos);

				// BigDecimal

				dos.writeObject(this.RCDRQT);

				// BigDecimal

				dos.writeObject(this.RCDRWT);

				// BigDecimal

				dos.writeObject(this.RCDOVR);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("RCDVEN=" + String.valueOf(RCDVEN));
			sb.append(",RCDVRF=" + String.valueOf(RCDVRF));
			sb.append(",RCDSVN=" + String.valueOf(RCDSVN));
			sb.append(",RCDSTY=" + RCDSTY);
			sb.append(",RCDSKU=" + String.valueOf(RCDSKU));
			sb.append(",RCDLOC=" + String.valueOf(RCDLOC));
			sb.append(",RCDTYP=" + String.valueOf(RCDTYP));
			sb.append(",RCDCEN=" + String.valueOf(RCDCEN));
			sb.append(",RCDDAT=" + String.valueOf(RCDDAT));
			sb.append(",RCDQTY=" + String.valueOf(RCDQTY));
			sb.append(",RCDWGT=" + String.valueOf(RCDWGT));
			sb.append(",RCDCST=" + String.valueOf(RCDCST));
			sb.append(",RCDAMT=" + String.valueOf(RCDAMT));
			sb.append(",RCDUAA=" + String.valueOf(RCDUAA));
			sb.append(",RCDUPA=" + String.valueOf(RCDUPA));
			sb.append(",RCDWAA=" + String.valueOf(RCDWAA));
			sb.append(",RCDWPA=" + String.valueOf(RCDWPA));
			sb.append(",RCDRTP=" + RCDRTP);
			sb.append(",RCDBYR=" + RCDBYR);
			sb.append(",RCDDPT=" + String.valueOf(RCDDPT));
			sb.append(",RCDSDP=" + String.valueOf(RCDSDP));
			sb.append(",RCDCLS=" + String.valueOf(RCDCLS));
			sb.append(",RCDSCL=" + String.valueOf(RCDSCL));
			sb.append(",RCDRCV=" + String.valueOf(RCDRCV));
			sb.append(",RCDADJ=" + String.valueOf(RCDADJ));
			sb.append(",RCDBCK=" + String.valueOf(RCDBCK));
			sb.append(",RCDCOG=" + RCDCOG);
			sb.append(",RCDCGL=" + RCDCGL);
			sb.append(",RCDRQT=" + String.valueOf(RCDRQT));
			sb.append(",RCDRWT=" + String.valueOf(RCDRWT));
			sb.append(",RCDOVR=" + String.valueOf(RCDOVR));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (RCDVEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVEN);
			}

			sb.append("|");

			if (RCDVRF == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDVRF);
			}

			sb.append("|");

			if (RCDSVN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSVN);
			}

			sb.append("|");

			if (RCDSTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSTY);
			}

			sb.append("|");

			if (RCDSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSKU);
			}

			sb.append("|");

			if (RCDLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDLOC);
			}

			sb.append("|");

			if (RCDTYP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDTYP);
			}

			sb.append("|");

			if (RCDCEN == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCEN);
			}

			sb.append("|");

			if (RCDDAT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDAT);
			}

			sb.append("|");

			if (RCDQTY == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDQTY);
			}

			sb.append("|");

			if (RCDWGT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWGT);
			}

			sb.append("|");

			if (RCDCST == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCST);
			}

			sb.append("|");

			if (RCDAMT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDAMT);
			}

			sb.append("|");

			if (RCDUAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUAA);
			}

			sb.append("|");

			if (RCDUPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDUPA);
			}

			sb.append("|");

			if (RCDWAA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWAA);
			}

			sb.append("|");

			if (RCDWPA == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDWPA);
			}

			sb.append("|");

			if (RCDRTP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRTP);
			}

			sb.append("|");

			if (RCDBYR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBYR);
			}

			sb.append("|");

			if (RCDDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDDPT);
			}

			sb.append("|");

			if (RCDSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSDP);
			}

			sb.append("|");

			if (RCDCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCLS);
			}

			sb.append("|");

			if (RCDSCL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDSCL);
			}

			sb.append("|");

			if (RCDRCV == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRCV);
			}

			sb.append("|");

			if (RCDADJ == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDADJ);
			}

			sb.append("|");

			if (RCDBCK == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDBCK);
			}

			sb.append("|");

			if (RCDCOG == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCOG);
			}

			sb.append("|");

			if (RCDCGL == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDCGL);
			}

			sb.append("|");

			if (RCDRQT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRQT);
			}

			sb.append("|");

			if (RCDRWT == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDRWT);
			}

			sb.append("|");

			if (RCDOVR == null) {
				sb.append("<null>");
			} else {
				sb.append(RCDOVR);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row7Struct other) {

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

				row7Struct row7 = new row7Struct();
				INVMSTStruct INVMST = new INVMSTStruct();

				/**
				 * [tDBOutput_2 begin ] start
				 */

				ok_Hash.put("tDBOutput_2", false);
				start_Hash.put("tDBOutput_2", System.currentTimeMillis());

				currentComponent = "tDBOutput_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "INVMST");

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

				props_tDBOutput_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_2.table.setValue("tableName", "REBCLD");

				props_tDBOutput_2.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_2.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_2.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_2_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"INVMST\",\"fields\":[{", s);

						a("\"name\":\"RCDVEN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDVEN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDVEN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDVRF\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDVRF\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDVRF\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDSVN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDSVN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDSVN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDSTY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"RCDSTY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDSTY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDSKU\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDSKU\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDLOC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDLOC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDLOC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDTYP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDTYP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDTYP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDCEN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDCEN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDCEN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDDAT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDDAT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDDAT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDQTY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDQTY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDQTY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDWGT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDWGT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDWGT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDCST\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDCST\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDCST\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDAMT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDAMT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDAMT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDUAA\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDUAA\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDUAA\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDUPA\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDUPA\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDUPA\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDWAA\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDWAA\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDWAA\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDWPA\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDWPA\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDWPA\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDRTP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"RCDRTP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDRTP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDBYR\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"RCDBYR\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDBYR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDDPT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDDPT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDDPT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDSDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDSDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDSDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDCLS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDCLS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDCLS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDSCL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDSCL\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDSCL\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDRCV\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDRCV\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDRCV\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDADJ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDADJ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDADJ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDBCK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDBCK\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDBCK\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDCOG\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"RCDCOG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDCOG\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDCGL\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"RCDCGL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDCGL\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDRQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDRQT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDRQT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDRWT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDRWT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDRWT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"RCDOVR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RCDOVR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RCDOVR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"LOAD_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOAD_DATE\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"INVMST\",\"di.table.label\":\"INVMST\"}",
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
				 * [tMap_4 begin ] start
				 */

				ok_Hash.put("tMap_4", false);
				start_Hash.put("tMap_4", System.currentTimeMillis());

				currentComponent = "tMap_4";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row7");

				int tos_count_tMap_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tMap_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tMap_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tMap_4 = new StringBuilder();
							log4jParamters_tMap_4.append("Parameters:");
							log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
							log4jParamters_tMap_4.append(" | ");
							log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
							log4jParamters_tMap_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tMap_4 - " + (log4jParamters_tMap_4));
						}
					}
					new BytesLimit65535_tMap_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tMap_4", "tMap_4", "tMap");
					talendJobLogProcess(globalMap);
				}

// ###############################
// # Lookup's keys initialization
				int count_row7_tMap_4 = 0;

// ###############################        

// ###############################
// # Vars initialization
				class Var__tMap_4__Struct {
					java.util.Date var1;
				}
				Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_INVMST_tMap_4 = 0;

				INVMSTStruct INVMST_tmp = new INVMSTStruct();
// ###############################

				/**
				 * [tMap_4 begin ] stop
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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/REBCLD.zip\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileInputDelimited_2.append(" | ");
							log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"|\"");
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
									+ ", SCHEMA_COLUMN=" + ("RCDVEN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDVRF") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSVN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSTY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDSKU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDLOC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDTYP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDCEN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDDAT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDQTY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDWGT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCST") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDAMT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDUAA") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDUPA") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDWAA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDWPA") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRTP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDBYR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDDPT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDSDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCLS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDSCL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRCV") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDADJ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDBCK") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("RCDCOG") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDCGL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("RCDRQT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("RCDRWT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("RCDOVR") + "}]");
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

					Object filename_tFileInputDelimited_2 = "/data/talend/data_repository/REBCLD.zip";
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
									zis_tFileInputDelimited_2, "ISO-8859-15", "|", "\n", false, 1, 0,

									limit_tFileInputDelimited_2, -1, false);
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());

							throw e;

						}

						log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_2 != null && fid_tFileInputDelimited_2.nextRecord()) {
							rowstate_tFileInputDelimited_2.reset();

							row7 = null;

							boolean whetherReject_tFileInputDelimited_2 = false;
							row7 = new row7Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_2 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_2 = 0;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDVEN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDVEN", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDVEN = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 1;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDVRF = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDVRF", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDVRF = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 2;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDSVN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDSVN", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDSVN = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 3;

								row7.RCDSTY = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 4;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDSKU", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 5;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDLOC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDLOC", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDLOC = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 6;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDTYP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDTYP", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDTYP = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 7;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDCEN = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDCEN", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDCEN = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 8;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDDAT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDDAT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDDAT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 9;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDQTY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDQTY", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDQTY = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 10;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDWGT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDWGT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDWGT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 11;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDCST = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDCST", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDCST = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 12;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDAMT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDAMT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDAMT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 13;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDUAA = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDUAA", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDUAA = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 14;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDUPA = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDUPA", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDUPA = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 15;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDWAA = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDWAA", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDWAA = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 16;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDWPA = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDWPA", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDWPA = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 17;

								row7.RCDRTP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 18;

								row7.RCDBYR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 19;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDDPT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDDPT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDDPT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 20;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDSDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDSDP", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDSDP = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 21;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDCLS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDCLS", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDCLS = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 22;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDSCL = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDSCL", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDSCL = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 23;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDRCV = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDRCV", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDRCV = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 24;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDADJ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDADJ", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDADJ = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 25;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDBCK = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDBCK", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDBCK = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 26;

								row7.RCDCOG = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 27;

								row7.RCDCGL = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);

								columnIndexWithD_tFileInputDelimited_2 = 28;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDRQT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDRQT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDRQT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 29;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDRWT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDRWT", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDRWT = null;

								}

								columnIndexWithD_tFileInputDelimited_2 = 30;

								temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
								if (temp.length() > 0) {

									try {

										row7.RCDOVR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_2) {
										globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",
												ex_tFileInputDelimited_2.getMessage());
										rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"RCDOVR", "row7", temp, ex_tFileInputDelimited_2),
												ex_tFileInputDelimited_2));
									}

								} else {

									row7.RCDOVR = null;

								}

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
// Start of branch "row7"
							if (row7 != null) {

								/**
								 * [tMap_4 main ] start
								 */

								currentComponent = "tMap_4";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row7", "tFileInputDelimited_2", "tFileInputDelimited_2",
										"tFileInputDelimited", "tMap_4", "tMap_4", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row7 - " + (row7 == null ? "" : row7.toLogString()));
								}

								boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;

								// ###############################
								// # Input tables (lookups)

								boolean rejectedInnerJoin_tMap_4 = false;
								boolean mainRowRejected_tMap_4 = false;
								// ###############################
								{ // start of Var scope

									// ###############################
									// # Vars tables

									Var__tMap_4__Struct Var = Var__tMap_4;
									Var.var1 = TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD"));// ###############################
									// ###############################
									// # Output tables

									INVMST = null;

// # Output table : 'INVMST'
									count_INVMST_tMap_4++;

									INVMST_tmp.RCDVEN = row7.RCDVEN;
									INVMST_tmp.RCDVRF = row7.RCDVRF;
									INVMST_tmp.RCDSVN = row7.RCDSVN;
									INVMST_tmp.RCDSTY = row7.RCDSTY;
									INVMST_tmp.RCDSKU = row7.RCDSKU;
									INVMST_tmp.RCDLOC = row7.RCDLOC;
									INVMST_tmp.RCDTYP = row7.RCDTYP;
									INVMST_tmp.RCDCEN = row7.RCDCEN;
									INVMST_tmp.RCDDAT = row7.RCDDAT;
									INVMST_tmp.RCDQTY = row7.RCDQTY;
									INVMST_tmp.RCDWGT = row7.RCDWGT;
									INVMST_tmp.RCDCST = row7.RCDCST;
									INVMST_tmp.RCDAMT = row7.RCDAMT;
									INVMST_tmp.RCDUAA = row7.RCDUAA;
									INVMST_tmp.RCDUPA = row7.RCDUPA;
									INVMST_tmp.RCDWAA = row7.RCDWAA;
									INVMST_tmp.RCDWPA = row7.RCDWPA;
									INVMST_tmp.RCDRTP = row7.RCDRTP;
									INVMST_tmp.RCDBYR = row7.RCDBYR;
									INVMST_tmp.RCDDPT = row7.RCDDPT;
									INVMST_tmp.RCDSDP = row7.RCDSDP;
									INVMST_tmp.RCDCLS = row7.RCDCLS;
									INVMST_tmp.RCDSCL = row7.RCDSCL;
									INVMST_tmp.RCDRCV = row7.RCDRCV;
									INVMST_tmp.RCDADJ = row7.RCDADJ;
									INVMST_tmp.RCDBCK = row7.RCDBCK;
									INVMST_tmp.RCDCOG = row7.RCDCOG;
									INVMST_tmp.RCDCGL = row7.RCDCGL;
									INVMST_tmp.RCDRQT = row7.RCDRQT;
									INVMST_tmp.RCDRWT = row7.RCDRWT;
									INVMST_tmp.RCDOVR = row7.RCDOVR;
									INVMST_tmp.LOAD_DATE = Var.var1;
									INVMST = INVMST_tmp;
									log.debug("tMap_4 - Outputting the record " + count_INVMST_tMap_4
											+ " of the output table 'INVMST'.");

// ###############################

								} // end of Var scope

								rejectedInnerJoin_tMap_4 = false;

								tos_count_tMap_4++;

								/**
								 * [tMap_4 main ] stop
								 */

								/**
								 * [tMap_4 process_data_begin ] start
								 */

								currentComponent = "tMap_4";

								/**
								 * [tMap_4 process_data_begin ] stop
								 */
// Start of branch "INVMST"
								if (INVMST != null) {

									/**
									 * [tDBOutput_2 main ] start
									 */

									currentComponent = "tDBOutput_2";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "INVMST", "tMap_4", "tMap_4", "tMap", "tDBOutput_2", "tDBOutput_2",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("INVMST - " + (INVMST == null ? "" : INVMST.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_2 != null) {
										incomingEnforcer_tDBOutput_2.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDVEN") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDVEN", INVMST.RCDVEN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDVRF") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDVRF", INVMST.RCDVRF);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDSVN") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDSVN", INVMST.RCDSVN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDSTY") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDSTY", INVMST.RCDSTY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDSKU") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDSKU", INVMST.RCDSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDLOC") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDLOC", INVMST.RCDLOC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDTYP") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDTYP", INVMST.RCDTYP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDCEN") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDCEN", INVMST.RCDCEN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDDAT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDDAT", INVMST.RCDDAT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDQTY") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDQTY", INVMST.RCDQTY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDWGT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDWGT", INVMST.RCDWGT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDCST") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDCST", INVMST.RCDCST);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDAMT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDAMT", INVMST.RCDAMT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDUAA") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDUAA", INVMST.RCDUAA);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDUPA") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDUPA", INVMST.RCDUPA);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDWAA") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDWAA", INVMST.RCDWAA);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDWPA") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDWPA", INVMST.RCDWPA);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDRTP") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDRTP", INVMST.RCDRTP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDBYR") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDBYR", INVMST.RCDBYR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDDPT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDDPT", INVMST.RCDDPT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDSDP") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDSDP", INVMST.RCDSDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDCLS") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDCLS", INVMST.RCDCLS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDSCL") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDSCL", INVMST.RCDSCL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDRCV") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDRCV", INVMST.RCDRCV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDADJ") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDADJ", INVMST.RCDADJ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDBCK") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDBCK", INVMST.RCDBCK);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDCOG") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDCOG", INVMST.RCDCOG);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDCGL") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDCGL", INVMST.RCDCGL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDRQT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDRQT", INVMST.RCDRQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDRWT") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDRWT", INVMST.RCDRWT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("RCDOVR") != null) {
										incomingEnforcer_tDBOutput_2.put("RCDOVR", INVMST.RCDOVR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_2.put("LOAD_DATE", INVMST.LOAD_DATE);
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

								} // End of branch "INVMST"

								/**
								 * [tMap_4 process_data_end ] start
								 */

								currentComponent = "tMap_4";

								/**
								 * [tMap_4 process_data_end ] stop
								 */

							} // End of branch "row7"

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
					if (!((Object) ("/data/talend/data_repository/REBCLD.zip") instanceof java.io.InputStream)) {
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
				 * [tMap_4 end ] start
				 */

				currentComponent = "tMap_4";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'INVMST': " + count_INVMST_tMap_4 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row7", 2, 0,
						"tFileInputDelimited_2", "tFileInputDelimited_2", "tFileInputDelimited", "tMap_4", "tMap_4",
						"tMap", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tMap_4 - " + ("Done."));

				ok_Hash.put("tMap_4", true);
				end_Hash.put("tMap_4", System.currentTimeMillis());

				/**
				 * [tMap_4 end ] stop
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "INVMST", 2, 0, "tMap_4",
						"tMap_4", "tMap", "tDBOutput_2", "tDBOutput_2", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_2", true);
				end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				/**
				 * [tDBOutput_2 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_2:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk8", 0, "ok");
			}

			tDBRow_8Process(globalMap);

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
				 * [tMap_4 finally ] start
				 */

				currentComponent = "tMap_4";

				/**
				 * [tMap_4 finally ] stop
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

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
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
						"\ninsert into CLAIM_TRANSACTIONS_REBCLD\nselect \nRCDVEN\n,RCDVRF\n,RCDSVN\n,RCDSTY\n,RCDSKU\n,RCDLOC\n,RCDCEN\n,   cas"
								+ "e\n        when LENGTH(RCDDAT)= 5 then TO_DATE(CONCAT( '200', TO_VARCHAR(RCDDAT)),'yyyymmdd')\n        else TO_DATE(CONC"
								+ "AT( '20', RCDDAT), 'yyyymmdd')\n    end as RCDDAT\n\n,RCDQTY\n,RCDWGT\n,RCDCST\n,RCDAMT\n,RCDUAA\n,RCDUPA\n,RCDWAA\n,RCD"
								+ "WPA\n,RCDRTP\n,RCDBYR\n,RCDDPT\n,RCDSDP\n,RCDCLS\n,RCDSCL\n,RCDRCV\n,RCDADJ\n,RCDBCK\n,RCDCOG\n,RCDCGL\n,RCDRQT\n,RCDRWT"
								+ "\n,RCDOVR\n,LOAD_DATE\n\nfrom REBCLD\n\n");

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
					runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBRow_9Process(globalMap);

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
				props_tDBRow_9.setValue("query", "\nDrop table  REBCLD\n\n");

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
					runStat.updateStatOnConnection("OnComponentOk13", 0, "ok");
				}
				tFileDelete_4Process(globalMap);

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
									.append("PATH" + " = " + "\"/data/talend/data_repository/REBCLD.zip\"");
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
				java.io.File path_tFileDelete_4 = new java.io.File("/data/talend/data_repository/REBCLD.zip");
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
				globalMap.put("tFileDelete_4_DELETE_PATH", "/data/talend/data_repository/REBCLD.zip");

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
						"\nDELETE from R4_MIN_MAX_FILE_DATA_RECEIVED_FROM_4R_R4MINMAX\nWHERE DATELOADED = CURRENT_DATE() - 1\n\n");

				props_tDBRow_2.setValue("dieOnError", true);

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBInput_5Process(globalMap);

				/**
				 * [tDBRow_2 end ] stop
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

	public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public float R4SKU;

		public float getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return false;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return 9;
		}

		public Integer R4SKUPrecision() {
			return 0;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public float R4LOCID;

		public float getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return false;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return 5;
		}

		public Integer R4LOCIDPrecision() {
			return 0;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public float R4MIN;

		public float getR4MIN() {
			return this.R4MIN;
		}

		public Boolean R4MINIsNullable() {
			return false;
		}

		public Boolean R4MINIsKey() {
			return false;
		}

		public Integer R4MINLength() {
			return 7;
		}

		public Integer R4MINPrecision() {
			return 0;
		}

		public String R4MINDefault() {

			return "";

		}

		public String R4MINComment() {

			return "";

		}

		public String R4MINPattern() {

			return "";

		}

		public String R4MINOriginalDbColumnName() {

			return "R4MIN";

		}

		public float R4MAX;

		public float getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return false;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return 7;
		}

		public Integer R4MAXPrecision() {
			return 0;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public float R4WKFC;

		public float getR4WKFC() {
			return this.R4WKFC;
		}

		public Boolean R4WKFCIsNullable() {
			return false;
		}

		public Boolean R4WKFCIsKey() {
			return false;
		}

		public Integer R4WKFCLength() {
			return 9;
		}

		public Integer R4WKFCPrecision() {
			return 2;
		}

		public String R4WKFCDefault() {

			return "";

		}

		public String R4WKFCComment() {

			return "";

		}

		public String R4WKFCPattern() {

			return "";

		}

		public String R4WKFCOriginalDbColumnName() {

			return "R4WKFC";

		}

		public float R4MAXORD;

		public float getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return false;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return 7;
		}

		public Integer R4MAXORDPrecision() {
			return 0;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public float R4NOPMIN;

		public float getR4NOPMIN() {
			return this.R4NOPMIN;
		}

		public Boolean R4NOPMINIsNullable() {
			return false;
		}

		public Boolean R4NOPMINIsKey() {
			return false;
		}

		public Integer R4NOPMINLength() {
			return 7;
		}

		public Integer R4NOPMINPrecision() {
			return 0;
		}

		public String R4NOPMINDefault() {

			return "";

		}

		public String R4NOPMINComment() {

			return "";

		}

		public String R4NOPMINPattern() {

			return "";

		}

		public String R4NOPMINOriginalDbColumnName() {

			return "R4NOPMIN";

		}

		public float R4NOPMAX;

		public float getR4NOPMAX() {
			return this.R4NOPMAX;
		}

		public Boolean R4NOPMAXIsNullable() {
			return false;
		}

		public Boolean R4NOPMAXIsKey() {
			return false;
		}

		public Integer R4NOPMAXLength() {
			return 7;
		}

		public Integer R4NOPMAXPrecision() {
			return 0;
		}

		public String R4NOPMAXDefault() {

			return "";

		}

		public String R4NOPMAXComment() {

			return "";

		}

		public String R4NOPMAXPattern() {

			return "";

		}

		public String R4NOPMAXOriginalDbColumnName() {

			return "R4NOPMAX";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.R4SKU = dis.readFloat();

					this.R4LOCID = dis.readFloat();

					this.R4MIN = dis.readFloat();

					this.R4MAX = dis.readFloat();

					this.R4WKFC = dis.readFloat();

					this.R4MAXORD = dis.readFloat();

					this.R4NOPMIN = dis.readFloat();

					this.R4NOPMAX = dis.readFloat();

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.R4SKU = dis.readFloat();

					this.R4LOCID = dis.readFloat();

					this.R4MIN = dis.readFloat();

					this.R4MAX = dis.readFloat();

					this.R4WKFC = dis.readFloat();

					this.R4MAXORD = dis.readFloat();

					this.R4NOPMIN = dis.readFloat();

					this.R4NOPMAX = dis.readFloat();

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// float

				dos.writeFloat(this.R4SKU);

				// float

				dos.writeFloat(this.R4LOCID);

				// float

				dos.writeFloat(this.R4MIN);

				// float

				dos.writeFloat(this.R4MAX);

				// float

				dos.writeFloat(this.R4WKFC);

				// float

				dos.writeFloat(this.R4MAXORD);

				// float

				dos.writeFloat(this.R4NOPMIN);

				// float

				dos.writeFloat(this.R4NOPMAX);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// float

				dos.writeFloat(this.R4SKU);

				// float

				dos.writeFloat(this.R4LOCID);

				// float

				dos.writeFloat(this.R4MIN);

				// float

				dos.writeFloat(this.R4MAX);

				// float

				dos.writeFloat(this.R4WKFC);

				// float

				dos.writeFloat(this.R4MAXORD);

				// float

				dos.writeFloat(this.R4NOPMIN);

				// float

				dos.writeFloat(this.R4NOPMAX);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MIN=" + String.valueOf(R4MIN));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4WKFC=" + String.valueOf(R4WKFC));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4NOPMIN=" + String.valueOf(R4NOPMIN));
			sb.append(",R4NOPMAX=" + String.valueOf(R4NOPMAX));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			sb.append(R4SKU);

			sb.append("|");

			sb.append(R4LOCID);

			sb.append("|");

			sb.append(R4MIN);

			sb.append("|");

			sb.append(R4MAX);

			sb.append("|");

			sb.append(R4WKFC);

			sb.append("|");

			sb.append(R4MAXORD);

			sb.append("|");

			sb.append(R4NOPMIN);

			sb.append("|");

			sb.append(R4NOPMAX);

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row5Struct other) {

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

	public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_5");
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

				row5Struct row5 = new row5Struct();

				/**
				 * [tFileOutputDelimited_5 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_5", false);
				start_Hash.put("tFileOutputDelimited_5", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_5";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row5");

				int tos_count_tFileOutputDelimited_5 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_5 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileOutputDelimited_5 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileOutputDelimited_5 = new StringBuilder();
							log4jParamters_tFileOutputDelimited_5.append("Parameters:");
							log4jParamters_tFileOutputDelimited_5.append("USESTREAM" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/R4MINMAX.csv\"");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("ROWSEPARATOR" + " = " + "\"\\n\"");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("FIELDSEPARATOR" + " = " + "\",\"");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("APPEND" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("INCLUDEHEADER" + " = " + "true");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("COMPRESS" + " = " + "true");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("CSV_OPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("CREATE" + " = " + "true");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("SPLIT" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("FLUSHONROW" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("ROW_MODE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("DELETE_EMPTYFILE" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							log4jParamters_tFileOutputDelimited_5.append("FILE_EXIST_EXCEPTION" + " = " + "false");
							log4jParamters_tFileOutputDelimited_5.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileOutputDelimited_5 - " + (log4jParamters_tFileOutputDelimited_5));
						}
					}
					new BytesLimit65535_tFileOutputDelimited_5().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileOutputDelimited_5", "tFileOutputDelimited_5", "tFileOutputDelimited");
					talendJobLogProcess(globalMap);
				}

				String fileName_tFileOutputDelimited_5 = "";
				fileName_tFileOutputDelimited_5 = (new java.io.File("/data/talend/data_repository/R4MINMAX.csv"))
						.getAbsolutePath().replace("\\", "/");
				String fullName_tFileOutputDelimited_5 = null;
				String extension_tFileOutputDelimited_5 = null;
				String directory_tFileOutputDelimited_5 = null;
				if ((fileName_tFileOutputDelimited_5.indexOf("/") != -1)) {
					if (fileName_tFileOutputDelimited_5.lastIndexOf(".") < fileName_tFileOutputDelimited_5
							.lastIndexOf("/")) {
						fullName_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5;
						extension_tFileOutputDelimited_5 = "";
					} else {
						fullName_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5.substring(0,
								fileName_tFileOutputDelimited_5.lastIndexOf("."));
						extension_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5
								.substring(fileName_tFileOutputDelimited_5.lastIndexOf("."));
					}
					directory_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5.substring(0,
							fileName_tFileOutputDelimited_5.lastIndexOf("/"));
				} else {
					if (fileName_tFileOutputDelimited_5.lastIndexOf(".") != -1) {
						fullName_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5.substring(0,
								fileName_tFileOutputDelimited_5.lastIndexOf("."));
						extension_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5
								.substring(fileName_tFileOutputDelimited_5.lastIndexOf("."));
					} else {
						fullName_tFileOutputDelimited_5 = fileName_tFileOutputDelimited_5;
						extension_tFileOutputDelimited_5 = "";
					}
					directory_tFileOutputDelimited_5 = "";
				}
				boolean isFileGenerated_tFileOutputDelimited_5 = true;
				java.io.File filetFileOutputDelimited_5 = new java.io.File(fileName_tFileOutputDelimited_5);
				globalMap.put("tFileOutputDelimited_5_FILE_NAME", fileName_tFileOutputDelimited_5);
				int nb_line_tFileOutputDelimited_5 = 0;
				int splitedFileNo_tFileOutputDelimited_5 = 0;
				int currentRow_tFileOutputDelimited_5 = 0;

				final String OUT_DELIM_tFileOutputDelimited_5 = /** Start field tFileOutputDelimited_5:FIELDSEPARATOR */
						","/** End field tFileOutputDelimited_5:FIELDSEPARATOR */
				;

				final String OUT_DELIM_ROWSEP_tFileOutputDelimited_5 = /**
																		 * Start field
																		 * tFileOutputDelimited_5:ROWSEPARATOR
																		 */
						"\n"/** End field tFileOutputDelimited_5:ROWSEPARATOR */
				;

				// create directory only if not exists
				if (directory_tFileOutputDelimited_5 != null && directory_tFileOutputDelimited_5.trim().length() != 0) {
					java.io.File dir_tFileOutputDelimited_5 = new java.io.File(directory_tFileOutputDelimited_5);
					if (!dir_tFileOutputDelimited_5.exists()) {
						log.info("tFileOutputDelimited_5 - Creating directory '"
								+ dir_tFileOutputDelimited_5.getCanonicalPath() + "'.");
						dir_tFileOutputDelimited_5.mkdirs();
						log.info("tFileOutputDelimited_5 - The directory '"
								+ dir_tFileOutputDelimited_5.getCanonicalPath() + "' has been created successfully.");
					}
				}

				filetFileOutputDelimited_5 = new java.io.File(fileName_tFileOutputDelimited_5);
				String zipName_tFileOutputDelimited_5 = fullName_tFileOutputDelimited_5 + ".zip";
				java.io.File file_tFileOutputDelimited_5 = new java.io.File(zipName_tFileOutputDelimited_5);
				// routines.system.Row
				java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_5 = null;
				java.io.Writer outtFileOutputDelimited_5 = null;

				if (file_tFileOutputDelimited_5.exists()) {
					file_tFileOutputDelimited_5.delete();
				}
				zipOut_tFileOutputDelimited_5 = new java.util.zip.ZipOutputStream(
						new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_5)));
				zipOut_tFileOutputDelimited_5
						.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_5.getName()));
				outtFileOutputDelimited_5 = new java.io.BufferedWriter(
						new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_5, "ISO-8859-15"));
				resourceMap.put("out_tFileOutputDelimited_5", outtFileOutputDelimited_5);
				synchronized (multiThreadLockWrite) {
					if (file_tFileOutputDelimited_5.length() == 0) {
						outtFileOutputDelimited_5.write("R4SKU");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4LOCID");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4MIN");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4MAX");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4WKFC");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4MAXORD");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4NOPMIN");
						outtFileOutputDelimited_5.write(OUT_DELIM_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.write("R4NOPMAX");
						outtFileOutputDelimited_5.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_5);
						outtFileOutputDelimited_5.flush();
					}
				}

				resourceMap.put("nb_line_tFileOutputDelimited_5", nb_line_tFileOutputDelimited_5);

				/**
				 * [tFileOutputDelimited_5 begin ] stop
				 */

				/**
				 * [tDBInput_5 begin ] start
				 */

				ok_Hash.put("tDBInput_5", false);
				start_Hash.put("tDBInput_5", System.currentTimeMillis());

				currentComponent = "tDBInput_5";

				int tos_count_tDBInput_5 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBInput_5 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBInput_5 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBInput_5 = new StringBuilder();
							log4jParamters_tDBInput_5.append("Parameters:");
							log4jParamters_tDBInput_5.append("USE_EXISTING_CONNECTION" + " = " + "false");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("DB_VERSION" + " = " + "jt400-9.8.jar");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("HOST" + " = " + "context.jda_host_name");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("DBNAME" + " = " + "context.jda_mm_lib");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("USER" + " = " + "context.jda_user_name");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("PASS" + " = "
									+ String.valueOf(
											routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password))
											.substring(0, 4)
									+ "...");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("QUERY" + " = " + "\"select * from MM4R5LIB.R4MINMAX\"");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4SKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4LOCID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAX") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4WKFC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4MAXORD") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4NOPMIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4NOPMAX") + "}]");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("SET_QUERY_TIMEOUT" + " = " + "false");
							log4jParamters_tDBInput_5.append(" | ");
							log4jParamters_tDBInput_5.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
							log4jParamters_tDBInput_5.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_5 - " + (log4jParamters_tDBInput_5));
						}
					}
					new BytesLimit65535_tDBInput_5().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_5", "tDBInput_5", "tAS400Input");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_5 = 0;
				java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBInput_5 = java.lang.Class.forName(driverClass_tDBInput_5);
				String dbUser_tDBInput_5 = context.jda_user_name;

				final String decryptedPassword_tDBInput_5 = context.jda_password;

				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;

				String url_tDBInput_5 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";"
						+ "prompt=false";

				log.debug("tDBInput_5 - Driver ClassName: " + driverClass_tDBInput_5 + ".");

				log.debug("tDBInput_5 - Connection attempt to '" + url_tDBInput_5 + "' with the username '"
						+ dbUser_tDBInput_5 + "'.");

				conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5, dbUser_tDBInput_5,
						dbPwd_tDBInput_5);
				log.debug("tDBInput_5 - Connection to '" + url_tDBInput_5 + "' has succeeded.");

				java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

				String dbquery_tDBInput_5 = "select * from MM4R5LIB.R4MINMAX";

				log.debug("tDBInput_5 - Executing the query: '" + dbquery_tDBInput_5 + "'.");

				globalMap.put("tDBInput_5_QUERY", dbquery_tDBInput_5);
				java.sql.ResultSet rs_tDBInput_5 = null;

				try {
					rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
					java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
					int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

					String tmpContent_tDBInput_5 = null;

					log.debug("tDBInput_5 - Retrieving records from the database.");

					while (rs_tDBInput_5.next()) {
						nb_line_tDBInput_5++;

						if (colQtyInRs_tDBInput_5 < 1) {
							row5.R4SKU = 0;
						} else {

							row5.R4SKU = rs_tDBInput_5.getFloat(1);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 2) {
							row5.R4LOCID = 0;
						} else {

							row5.R4LOCID = rs_tDBInput_5.getFloat(2);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 3) {
							row5.R4MIN = 0;
						} else {

							row5.R4MIN = rs_tDBInput_5.getFloat(3);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 4) {
							row5.R4MAX = 0;
						} else {

							row5.R4MAX = rs_tDBInput_5.getFloat(4);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 5) {
							row5.R4WKFC = 0;
						} else {

							row5.R4WKFC = rs_tDBInput_5.getFloat(5);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 6) {
							row5.R4MAXORD = 0;
						} else {

							row5.R4MAXORD = rs_tDBInput_5.getFloat(6);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 7) {
							row5.R4NOPMIN = 0;
						} else {

							row5.R4NOPMIN = rs_tDBInput_5.getFloat(7);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_5 < 8) {
							row5.R4NOPMAX = 0;
						} else {

							row5.R4NOPMAX = rs_tDBInput_5.getFloat(8);
							if (rs_tDBInput_5.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}

						log.debug("tDBInput_5 - Retrieving the record " + nb_line_tDBInput_5 + ".");

						/**
						 * [tDBInput_5 begin ] stop
						 */

						/**
						 * [tDBInput_5 main ] start
						 */

						currentComponent = "tDBInput_5";

						tos_count_tDBInput_5++;

						/**
						 * [tDBInput_5 main ] stop
						 */

						/**
						 * [tDBInput_5 process_data_begin ] start
						 */

						currentComponent = "tDBInput_5";

						/**
						 * [tDBInput_5 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_5 main ] start
						 */

						currentComponent = "tFileOutputDelimited_5";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row5", "tDBInput_5", "tDBInput_5", "tAS400Input", "tFileOutputDelimited_5",
								"tFileOutputDelimited_5", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row5 - " + (row5 == null ? "" : row5.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_5 = new StringBuilder();
						sb_tFileOutputDelimited_5.append(row5.R4SKU);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4LOCID);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4MIN);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4MAX);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4WKFC);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4MAXORD);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4NOPMIN);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_tFileOutputDelimited_5);
						sb_tFileOutputDelimited_5.append(row5.R4NOPMAX);
						sb_tFileOutputDelimited_5.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_5);

						synchronized (multiThreadLockWrite) {
							nb_line_tFileOutputDelimited_5++;
							resourceMap.put("nb_line_tFileOutputDelimited_5", nb_line_tFileOutputDelimited_5);

							outtFileOutputDelimited_5.write(sb_tFileOutputDelimited_5.toString());
							log.debug("tFileOutputDelimited_5 - Writing the record " + nb_line_tFileOutputDelimited_5
									+ ".");

						}

						tos_count_tFileOutputDelimited_5++;

						/**
						 * [tFileOutputDelimited_5 main ] stop
						 */

						/**
						 * [tFileOutputDelimited_5 process_data_begin ] start
						 */

						currentComponent = "tFileOutputDelimited_5";

						/**
						 * [tFileOutputDelimited_5 process_data_begin ] stop
						 */

						/**
						 * [tFileOutputDelimited_5 process_data_end ] start
						 */

						currentComponent = "tFileOutputDelimited_5";

						/**
						 * [tFileOutputDelimited_5 process_data_end ] stop
						 */

						/**
						 * [tDBInput_5 process_data_end ] start
						 */

						currentComponent = "tDBInput_5";

						/**
						 * [tDBInput_5 process_data_end ] stop
						 */

						/**
						 * [tDBInput_5 end ] start
						 */

						currentComponent = "tDBInput_5";

					}
				} finally {
					if (rs_tDBInput_5 != null) {
						rs_tDBInput_5.close();
					}
					if (stmt_tDBInput_5 != null) {
						stmt_tDBInput_5.close();
					}
					if (conn_tDBInput_5 != null && !conn_tDBInput_5.isClosed()) {

						log.debug("tDBInput_5 - Closing the connection to the database.");

						conn_tDBInput_5.close();

						if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_"))
								&& routines.system.BundleUtils.inOSGi()) {
							Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread")
									.getMethod("checkedShutdown").invoke(null, (Object[]) null);
						}

						log.debug("tDBInput_5 - Connection to the database closed.");

					}
				}
				globalMap.put("tDBInput_5_NB_LINE", nb_line_tDBInput_5);
				log.debug("tDBInput_5 - Retrieved records count: " + nb_line_tDBInput_5 + " .");

				if (log.isDebugEnabled())
					log.debug("tDBInput_5 - " + ("Done."));

				ok_Hash.put("tDBInput_5", true);
				end_Hash.put("tDBInput_5", System.currentTimeMillis());

				/**
				 * [tDBInput_5 end ] stop
				 */

				/**
				 * [tFileOutputDelimited_5 end ] start
				 */

				currentComponent = "tFileOutputDelimited_5";

				synchronized (multiThreadLockWrite) {

					if (outtFileOutputDelimited_5 != null) {
						outtFileOutputDelimited_5.flush();
						outtFileOutputDelimited_5.close();
					}

					globalMap.put("tFileOutputDelimited_5_NB_LINE", nb_line_tFileOutputDelimited_5);
					globalMap.put("tFileOutputDelimited_5_FILE_NAME", fileName_tFileOutputDelimited_5);

				}

				resourceMap.put("finish_tFileOutputDelimited_5", true);

				log.debug("tFileOutputDelimited_5 - Written records count: " + nb_line_tFileOutputDelimited_5 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row5", 2, 0,
						"tDBInput_5", "tDBInput_5", "tAS400Input", "tFileOutputDelimited_5", "tFileOutputDelimited_5",
						"tFileOutputDelimited", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tFileOutputDelimited_5 - " + ("Done."));

				ok_Hash.put("tFileOutputDelimited_5", true);
				end_Hash.put("tFileOutputDelimited_5", System.currentTimeMillis());

				/**
				 * [tFileOutputDelimited_5 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_5:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
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
				 * [tDBInput_5 finally ] start
				 */

				currentComponent = "tDBInput_5";

				/**
				 * [tDBInput_5 finally ] stop
				 */

				/**
				 * [tFileOutputDelimited_5 finally ] start
				 */

				currentComponent = "tFileOutputDelimited_5";

				if (resourceMap.get("finish_tFileOutputDelimited_5") == null) {

					synchronized (multiThreadLockWrite) {

						java.io.Writer outtFileOutputDelimited_5 = (java.io.Writer) resourceMap
								.get("out_tFileOutputDelimited_5");
						if (outtFileOutputDelimited_5 != null) {
							outtFileOutputDelimited_5.flush();
							outtFileOutputDelimited_5.close();
						}

					}

				}

				/**
				 * [tFileOutputDelimited_5 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}

	public static class R4MINMAXStruct implements routines.system.IPersistableRow<R4MINMAXStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public Double R4SKU;

		public Double getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return true;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return null;
		}

		public Integer R4SKUPrecision() {
			return null;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public Double R4LOCID;

		public Double getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return true;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return null;
		}

		public Integer R4LOCIDPrecision() {
			return null;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public Double R4MIN;

		public Double getR4MIN() {
			return this.R4MIN;
		}

		public Boolean R4MINIsNullable() {
			return true;
		}

		public Boolean R4MINIsKey() {
			return false;
		}

		public Integer R4MINLength() {
			return null;
		}

		public Integer R4MINPrecision() {
			return null;
		}

		public String R4MINDefault() {

			return "";

		}

		public String R4MINComment() {

			return "";

		}

		public String R4MINPattern() {

			return "";

		}

		public String R4MINOriginalDbColumnName() {

			return "R4MIN";

		}

		public Double R4MAX;

		public Double getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return true;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return null;
		}

		public Integer R4MAXPrecision() {
			return null;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public Double R4WKFC;

		public Double getR4WKFC() {
			return this.R4WKFC;
		}

		public Boolean R4WKFCIsNullable() {
			return true;
		}

		public Boolean R4WKFCIsKey() {
			return false;
		}

		public Integer R4WKFCLength() {
			return null;
		}

		public Integer R4WKFCPrecision() {
			return null;
		}

		public String R4WKFCDefault() {

			return "";

		}

		public String R4WKFCComment() {

			return "";

		}

		public String R4WKFCPattern() {

			return "";

		}

		public String R4WKFCOriginalDbColumnName() {

			return "R4WKFC";

		}

		public Double R4MAXORD;

		public Double getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return true;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return null;
		}

		public Integer R4MAXORDPrecision() {
			return null;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public Double R4NOPMIN;

		public Double getR4NOPMIN() {
			return this.R4NOPMIN;
		}

		public Boolean R4NOPMINIsNullable() {
			return true;
		}

		public Boolean R4NOPMINIsKey() {
			return false;
		}

		public Integer R4NOPMINLength() {
			return null;
		}

		public Integer R4NOPMINPrecision() {
			return null;
		}

		public String R4NOPMINDefault() {

			return "";

		}

		public String R4NOPMINComment() {

			return "";

		}

		public String R4NOPMINPattern() {

			return "";

		}

		public String R4NOPMINOriginalDbColumnName() {

			return "R4NOPMIN";

		}

		public Double R4NOPMAX;

		public Double getR4NOPMAX() {
			return this.R4NOPMAX;
		}

		public Boolean R4NOPMAXIsNullable() {
			return true;
		}

		public Boolean R4NOPMAXIsKey() {
			return false;
		}

		public Integer R4NOPMAXLength() {
			return null;
		}

		public Integer R4NOPMAXPrecision() {
			return null;
		}

		public String R4NOPMAXDefault() {

			return "";

		}

		public String R4NOPMAXComment() {

			return "";

		}

		public String R4NOPMAXPattern() {

			return "";

		}

		public String R4NOPMAXOriginalDbColumnName() {

			return "R4NOPMAX";

		}

		public java.util.Date DATELOADED;

		public java.util.Date getDATELOADED() {
			return this.DATELOADED;
		}

		public Boolean DATELOADEDIsNullable() {
			return true;
		}

		public Boolean DATELOADEDIsKey() {
			return false;
		}

		public Integer DATELOADEDLength() {
			return null;
		}

		public Integer DATELOADEDPrecision() {
			return null;
		}

		public String DATELOADEDDefault() {

			return null;

		}

		public String DATELOADEDComment() {

			return "";

		}

		public String DATELOADEDPattern() {

			return "yyyy-MM-dd";

		}

		public String DATELOADEDOriginalDbColumnName() {

			return "DATELOADED";

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MIN = null;
					} else {
						this.R4MIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4WKFC = null;
					} else {
						this.R4WKFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMIN = null;
					} else {
						this.R4NOPMIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMAX = null;
					} else {
						this.R4NOPMAX = dis.readDouble();
					}

					this.DATELOADED = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MIN = null;
					} else {
						this.R4MIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4WKFC = null;
					} else {
						this.R4WKFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMIN = null;
					} else {
						this.R4NOPMIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMAX = null;
					} else {
						this.R4NOPMAX = dis.readDouble();
					}

					this.DATELOADED = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MIN);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4WKFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4WKFC);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4NOPMIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMIN);
				}

				// Double

				if (this.R4NOPMAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMAX);
				}

				// java.util.Date

				writeDate(this.DATELOADED, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MIN);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4WKFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4WKFC);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4NOPMIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMIN);
				}

				// Double

				if (this.R4NOPMAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMAX);
				}

				// java.util.Date

				writeDate(this.DATELOADED, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MIN=" + String.valueOf(R4MIN));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4WKFC=" + String.valueOf(R4WKFC));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4NOPMIN=" + String.valueOf(R4NOPMIN));
			sb.append(",R4NOPMAX=" + String.valueOf(R4NOPMAX));
			sb.append(",DATELOADED=" + String.valueOf(DATELOADED));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (R4SKU == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SKU);
			}

			sb.append("|");

			if (R4LOCID == null) {
				sb.append("<null>");
			} else {
				sb.append(R4LOCID);
			}

			sb.append("|");

			if (R4MIN == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MIN);
			}

			sb.append("|");

			if (R4MAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAX);
			}

			sb.append("|");

			if (R4WKFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4WKFC);
			}

			sb.append("|");

			if (R4MAXORD == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAXORD);
			}

			sb.append("|");

			if (R4NOPMIN == null) {
				sb.append("<null>");
			} else {
				sb.append(R4NOPMIN);
			}

			sb.append("|");

			if (R4NOPMAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4NOPMAX);
			}

			sb.append("|");

			if (DATELOADED == null) {
				sb.append("<null>");
			} else {
				sb.append(DATELOADED);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(R4MINMAXStruct other) {

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

	public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public Double R4SKU;

		public Double getR4SKU() {
			return this.R4SKU;
		}

		public Boolean R4SKUIsNullable() {
			return true;
		}

		public Boolean R4SKUIsKey() {
			return false;
		}

		public Integer R4SKULength() {
			return null;
		}

		public Integer R4SKUPrecision() {
			return null;
		}

		public String R4SKUDefault() {

			return "";

		}

		public String R4SKUComment() {

			return "";

		}

		public String R4SKUPattern() {

			return "";

		}

		public String R4SKUOriginalDbColumnName() {

			return "R4SKU";

		}

		public Double R4LOCID;

		public Double getR4LOCID() {
			return this.R4LOCID;
		}

		public Boolean R4LOCIDIsNullable() {
			return true;
		}

		public Boolean R4LOCIDIsKey() {
			return false;
		}

		public Integer R4LOCIDLength() {
			return null;
		}

		public Integer R4LOCIDPrecision() {
			return null;
		}

		public String R4LOCIDDefault() {

			return "";

		}

		public String R4LOCIDComment() {

			return "";

		}

		public String R4LOCIDPattern() {

			return "";

		}

		public String R4LOCIDOriginalDbColumnName() {

			return "R4LOCID";

		}

		public Double R4MIN;

		public Double getR4MIN() {
			return this.R4MIN;
		}

		public Boolean R4MINIsNullable() {
			return true;
		}

		public Boolean R4MINIsKey() {
			return false;
		}

		public Integer R4MINLength() {
			return null;
		}

		public Integer R4MINPrecision() {
			return null;
		}

		public String R4MINDefault() {

			return "";

		}

		public String R4MINComment() {

			return "";

		}

		public String R4MINPattern() {

			return "";

		}

		public String R4MINOriginalDbColumnName() {

			return "R4MIN";

		}

		public Double R4MAX;

		public Double getR4MAX() {
			return this.R4MAX;
		}

		public Boolean R4MAXIsNullable() {
			return true;
		}

		public Boolean R4MAXIsKey() {
			return false;
		}

		public Integer R4MAXLength() {
			return null;
		}

		public Integer R4MAXPrecision() {
			return null;
		}

		public String R4MAXDefault() {

			return "";

		}

		public String R4MAXComment() {

			return "";

		}

		public String R4MAXPattern() {

			return "";

		}

		public String R4MAXOriginalDbColumnName() {

			return "R4MAX";

		}

		public Double R4WKFC;

		public Double getR4WKFC() {
			return this.R4WKFC;
		}

		public Boolean R4WKFCIsNullable() {
			return true;
		}

		public Boolean R4WKFCIsKey() {
			return false;
		}

		public Integer R4WKFCLength() {
			return null;
		}

		public Integer R4WKFCPrecision() {
			return null;
		}

		public String R4WKFCDefault() {

			return "";

		}

		public String R4WKFCComment() {

			return "";

		}

		public String R4WKFCPattern() {

			return "";

		}

		public String R4WKFCOriginalDbColumnName() {

			return "R4WKFC";

		}

		public Double R4MAXORD;

		public Double getR4MAXORD() {
			return this.R4MAXORD;
		}

		public Boolean R4MAXORDIsNullable() {
			return true;
		}

		public Boolean R4MAXORDIsKey() {
			return false;
		}

		public Integer R4MAXORDLength() {
			return null;
		}

		public Integer R4MAXORDPrecision() {
			return null;
		}

		public String R4MAXORDDefault() {

			return "";

		}

		public String R4MAXORDComment() {

			return "";

		}

		public String R4MAXORDPattern() {

			return "";

		}

		public String R4MAXORDOriginalDbColumnName() {

			return "R4MAXORD";

		}

		public Double R4NOPMIN;

		public Double getR4NOPMIN() {
			return this.R4NOPMIN;
		}

		public Boolean R4NOPMINIsNullable() {
			return true;
		}

		public Boolean R4NOPMINIsKey() {
			return false;
		}

		public Integer R4NOPMINLength() {
			return null;
		}

		public Integer R4NOPMINPrecision() {
			return null;
		}

		public String R4NOPMINDefault() {

			return "";

		}

		public String R4NOPMINComment() {

			return "";

		}

		public String R4NOPMINPattern() {

			return "";

		}

		public String R4NOPMINOriginalDbColumnName() {

			return "R4NOPMIN";

		}

		public Double R4NOPMAX;

		public Double getR4NOPMAX() {
			return this.R4NOPMAX;
		}

		public Boolean R4NOPMAXIsNullable() {
			return true;
		}

		public Boolean R4NOPMAXIsKey() {
			return false;
		}

		public Integer R4NOPMAXLength() {
			return null;
		}

		public Integer R4NOPMAXPrecision() {
			return null;
		}

		public String R4NOPMAXDefault() {

			return "";

		}

		public String R4NOPMAXComment() {

			return "";

		}

		public String R4NOPMAXPattern() {

			return "";

		}

		public String R4NOPMAXOriginalDbColumnName() {

			return "R4NOPMAX";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MIN = null;
					} else {
						this.R4MIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4WKFC = null;
					} else {
						this.R4WKFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMIN = null;
					} else {
						this.R4NOPMIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMAX = null;
					} else {
						this.R4NOPMAX = dis.readDouble();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.R4SKU = null;
					} else {
						this.R4SKU = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4LOCID = null;
					} else {
						this.R4LOCID = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MIN = null;
					} else {
						this.R4MIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAX = null;
					} else {
						this.R4MAX = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4WKFC = null;
					} else {
						this.R4WKFC = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4MAXORD = null;
					} else {
						this.R4MAXORD = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMIN = null;
					} else {
						this.R4NOPMIN = dis.readDouble();
					}

					length = dis.readByte();
					if (length == -1) {
						this.R4NOPMAX = null;
					} else {
						this.R4NOPMAX = dis.readDouble();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MIN);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4WKFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4WKFC);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4NOPMIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMIN);
				}

				// Double

				if (this.R4NOPMAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMAX);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Double

				if (this.R4SKU == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4SKU);
				}

				// Double

				if (this.R4LOCID == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4LOCID);
				}

				// Double

				if (this.R4MIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MIN);
				}

				// Double

				if (this.R4MAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAX);
				}

				// Double

				if (this.R4WKFC == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4WKFC);
				}

				// Double

				if (this.R4MAXORD == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4MAXORD);
				}

				// Double

				if (this.R4NOPMIN == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMIN);
				}

				// Double

				if (this.R4NOPMAX == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.R4NOPMAX);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("R4SKU=" + String.valueOf(R4SKU));
			sb.append(",R4LOCID=" + String.valueOf(R4LOCID));
			sb.append(",R4MIN=" + String.valueOf(R4MIN));
			sb.append(",R4MAX=" + String.valueOf(R4MAX));
			sb.append(",R4WKFC=" + String.valueOf(R4WKFC));
			sb.append(",R4MAXORD=" + String.valueOf(R4MAXORD));
			sb.append(",R4NOPMIN=" + String.valueOf(R4NOPMIN));
			sb.append(",R4NOPMAX=" + String.valueOf(R4NOPMAX));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (R4SKU == null) {
				sb.append("<null>");
			} else {
				sb.append(R4SKU);
			}

			sb.append("|");

			if (R4LOCID == null) {
				sb.append("<null>");
			} else {
				sb.append(R4LOCID);
			}

			sb.append("|");

			if (R4MIN == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MIN);
			}

			sb.append("|");

			if (R4MAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAX);
			}

			sb.append("|");

			if (R4WKFC == null) {
				sb.append("<null>");
			} else {
				sb.append(R4WKFC);
			}

			sb.append("|");

			if (R4MAXORD == null) {
				sb.append("<null>");
			} else {
				sb.append(R4MAXORD);
			}

			sb.append("|");

			if (R4NOPMIN == null) {
				sb.append("<null>");
			} else {
				sb.append(R4NOPMIN);
			}

			sb.append("|");

			if (R4NOPMAX == null) {
				sb.append("<null>");
			} else {
				sb.append(R4NOPMAX);
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

				row2Struct row2 = new row2Struct();
				R4MINMAXStruct R4MINMAX = new R4MINMAXStruct();

				/**
				 * [tDBOutput_8 begin ] start
				 */

				ok_Hash.put("tDBOutput_8", false);
				start_Hash.put("tDBOutput_8", System.currentTimeMillis());

				currentComponent = "tDBOutput_8";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "R4MINMAX");

				int tos_count_tDBOutput_8 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_8", "tDBOutput_8", "tSnowflakeOutput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBOutput_8 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBOutput_8 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBOutput_8 = (String) (restRequest_tDBOutput_8 != null
						? restRequest_tDBOutput_8.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBOutput_8 = new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBOutput_8 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBOutput_8 = null;

				org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_8 = (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_8
						.createRuntimeProperties();
				props_tDBOutput_8.setValue("tableAction",
						org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);

				props_tDBOutput_8.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_8.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_8.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_8.setValue("useSchemaDatePattern", false);

				props_tDBOutput_8.setValue("dieOnError", false);

				class SchemaSettingTool_tDBOutput_8_1_fisrt {

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

				SchemaSettingTool_tDBOutput_8_1_fisrt sst_tDBOutput_8_1_fisrt = new SchemaSettingTool_tDBOutput_8_1_fisrt();

				props_tDBOutput_8.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_8_1_fisrt.getSchemaValue()));

				props_tDBOutput_8.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_8.connection.setValue("useCustomRegion", false);

				props_tDBOutput_8.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_8.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_8.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_8.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_8.table.setValue("tableName", "R4_MIN_MAX_FILE_DATA_RECEIVED_FROM_4R_R4MINMAX");

				props_tDBOutput_8.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBOutput_8.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_8.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_8.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_8.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_1");

				props_tDBOutput_8.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_8_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"R4MINMAX\",\"fields\":[{", s);

						a("\"name\":\"R4SKU\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4SKU\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4SKU\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4SKU\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4LOCID\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4LOCID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4LOCID\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4LOCID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4MIN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4MIN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4MIN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4MIN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4MAX\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4MAX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4MAX\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4MAX\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4WKFC\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4WKFC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4WKFC\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4WKFC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4MAXORD\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4MAXORD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4MAXORD\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4MAXORD\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4NOPMIN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4NOPMIN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4NOPMIN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4NOPMIN\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"R4NOPMAX\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"R4NOPMAX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"R4NOPMAX\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"R4NOPMAX\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DATELOADED\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOAD_DATE\",\"talend.field.dbColumnName\":\"DATELOADED\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"DATELOADED\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"R4MINMAX\",\"di.table.label\":\"R4MINMAX\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBOutput_8_2_fisrt sst_tDBOutput_8_2_fisrt = new SchemaSettingTool_tDBOutput_8_2_fisrt();

				props_tDBOutput_8.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_8_2_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_8.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_8 = props_tDBOutput_8.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_8 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_8 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_8 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_8.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_8);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_8.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBOutput_8 = props_tDBOutput_8.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBOutput_8 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_8 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBOutput_8 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBOutput_8.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBOutput_8);
					}
				}
				globalMap.put("tDBOutput_8_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_8);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBOutput_8 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBOutput_8_MAPPINGS_URL", mappings_url_tDBOutput_8);

				org.talend.components.api.container.RuntimeContainer container_tDBOutput_8 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBOutput_8";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBOutput_8 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBOutput_8 = null;
				topology_tDBOutput_8 = org.talend.components.api.component.ConnectorTopology.INCOMING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_8 = def_tDBOutput_8.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_8,
						topology_tDBOutput_8);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_8 = def_tDBOutput_8
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_8 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBOutput_8.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBOutput_8 = componentRuntime_tDBOutput_8
						.initialize(container_tDBOutput_8, props_tDBOutput_8);

				if (initVr_tDBOutput_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBOutput_8.getMessage());
				}

				if (componentRuntime_tDBOutput_8 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_8 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBOutput_8;
					compDriverInitialization_tDBOutput_8.runAtDriver(container_tDBOutput_8);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_8 = null;
				if (componentRuntime_tDBOutput_8 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBOutput_8 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBOutput_8;
					if (doesNodeBelongToRequest_tDBOutput_8) {
						org.talend.daikon.properties.ValidationResult vr_tDBOutput_8 = sourceOrSink_tDBOutput_8
								.validate(container_tDBOutput_8);
						if (vr_tDBOutput_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBOutput_8.getMessage());
						}
					}
				}

				org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_8 = null;
				if (sourceOrSink_tDBOutput_8 instanceof org.talend.components.api.component.runtime.Sink) {
					org.talend.components.api.component.runtime.Sink sink_tDBOutput_8 = (org.talend.components.api.component.runtime.Sink) sourceOrSink_tDBOutput_8;
					org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_8 = sink_tDBOutput_8
							.createWriteOperation();
					if (doesNodeBelongToRequest_tDBOutput_8) {
						writeOperation_tDBOutput_8.initialize(container_tDBOutput_8);
					}
					writer_tDBOutput_8 = writeOperation_tDBOutput_8.createWriter(container_tDBOutput_8);
					if (doesNodeBelongToRequest_tDBOutput_8) {
						writer_tDBOutput_8.open("tDBOutput_8");
					}

					resourceMap.put("writer_tDBOutput_8", writer_tDBOutput_8);
				} // end of "sourceOrSink_tDBOutput_8 instanceof ...Sink"
				org.talend.components.api.component.Connector c_tDBOutput_8 = null;
				for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_8
						.getAvailableConnectors(null, false)) {
					if (currentConnector.getName().equals("MAIN")) {
						c_tDBOutput_8 = currentConnector;
						break;
					}
				}
				org.apache.avro.Schema designSchema_tDBOutput_8 = props_tDBOutput_8.getSchema(c_tDBOutput_8, false);
				incomingEnforcer_tDBOutput_8 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(
						designSchema_tDBOutput_8);

				java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_8 = new java.util.ArrayList<Object>();
				java.util.Iterator outgoingMainRecordsIt_tDBOutput_8 = null;

				/**
				 * [tDBOutput_8 begin ] stop
				 */

				/**
				 * [tMap_2 begin ] start
				 */

				ok_Hash.put("tMap_2", false);
				start_Hash.put("tMap_2", System.currentTimeMillis());

				currentComponent = "tMap_2";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row2");

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
				int count_row2_tMap_2 = 0;

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
				int count_R4MINMAX_tMap_2 = 0;

				R4MINMAXStruct R4MINMAX_tmp = new R4MINMAXStruct();
// ###############################

				/**
				 * [tMap_2 begin ] stop
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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/R4MINMAX.zip\"");
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
									+ ", SCHEMA_COLUMN=" + ("R4SKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4LOCID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4MAX") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("R4WKFC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("R4MAXORD") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4NOPMIN")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("R4NOPMAX") + "}]");
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

					Object filename_tFileInputDelimited_3 = "/data/talend/data_repository/R4MINMAX.zip";
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

							row2 = null;

							boolean whetherReject_tFileInputDelimited_3 = false;
							row2 = new row2Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_3 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_3 = 0;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4SKU = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4SKU", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4SKU = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 1;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4LOCID = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4LOCID", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4LOCID = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 2;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4MIN = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MIN", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4MIN = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 3;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4MAX = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MAX", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4MAX = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 4;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4WKFC = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4WKFC", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4WKFC = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 5;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4MAXORD = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4MAXORD", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4MAXORD = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 6;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4NOPMIN = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4NOPMIN", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4NOPMIN = null;

								}

								columnIndexWithD_tFileInputDelimited_3 = 7;

								temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
								if (temp.length() > 0) {

									try {

										row2.R4NOPMAX = ParserUtils.parseTo_Double(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_3) {
										globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",
												ex_tFileInputDelimited_3.getMessage());
										rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"R4NOPMAX", "row2", temp, ex_tFileInputDelimited_3),
												ex_tFileInputDelimited_3));
									}

								} else {

									row2.R4NOPMAX = null;

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
// Start of branch "row2"
							if (row2 != null) {

								/**
								 * [tMap_2 main ] start
								 */

								currentComponent = "tMap_2";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row2", "tFileInputDelimited_3", "tFileInputDelimited_3",
										"tFileInputDelimited", "tMap_2", "tMap_2", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
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
									Var.var1 = TalendDate.addDate(
											TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD")), -1,
											"DD");// ###############################
									// ###############################
									// # Output tables

									R4MINMAX = null;

// # Output table : 'R4MINMAX'
									count_R4MINMAX_tMap_2++;

									R4MINMAX_tmp.R4SKU = row2.R4SKU;
									R4MINMAX_tmp.R4LOCID = row2.R4LOCID;
									R4MINMAX_tmp.R4MIN = row2.R4MIN;
									R4MINMAX_tmp.R4MAX = row2.R4MAX;
									R4MINMAX_tmp.R4WKFC = row2.R4WKFC;
									R4MINMAX_tmp.R4MAXORD = row2.R4MAXORD;
									R4MINMAX_tmp.R4NOPMIN = row2.R4NOPMIN;
									R4MINMAX_tmp.R4NOPMAX = row2.R4NOPMAX;
									R4MINMAX_tmp.DATELOADED = Var.var1;
									R4MINMAX = R4MINMAX_tmp;
									log.debug("tMap_2 - Outputting the record " + count_R4MINMAX_tMap_2
											+ " of the output table 'R4MINMAX'.");

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
// Start of branch "R4MINMAX"
								if (R4MINMAX != null) {

									/**
									 * [tDBOutput_8 main ] start
									 */

									currentComponent = "tDBOutput_8";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "R4MINMAX", "tMap_2", "tMap_2", "tMap", "tDBOutput_8", "tDBOutput_8",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("R4MINMAX - " + (R4MINMAX == null ? "" : R4MINMAX.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_8 != null) {
										incomingEnforcer_tDBOutput_8.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4SKU") != null) {
										incomingEnforcer_tDBOutput_8.put("R4SKU", R4MINMAX.R4SKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4LOCID") != null) {
										incomingEnforcer_tDBOutput_8.put("R4LOCID", R4MINMAX.R4LOCID);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4MIN") != null) {
										incomingEnforcer_tDBOutput_8.put("R4MIN", R4MINMAX.R4MIN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4MAX") != null) {
										incomingEnforcer_tDBOutput_8.put("R4MAX", R4MINMAX.R4MAX);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4WKFC") != null) {
										incomingEnforcer_tDBOutput_8.put("R4WKFC", R4MINMAX.R4WKFC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4MAXORD") != null) {
										incomingEnforcer_tDBOutput_8.put("R4MAXORD", R4MINMAX.R4MAXORD);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4NOPMIN") != null) {
										incomingEnforcer_tDBOutput_8.put("R4NOPMIN", R4MINMAX.R4NOPMIN);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("R4NOPMAX") != null) {
										incomingEnforcer_tDBOutput_8.put("R4NOPMAX", R4MINMAX.R4NOPMAX);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_8 != null && incomingEnforcer_tDBOutput_8
											.getRuntimeSchema().getField("DATELOADED") != null) {
										incomingEnforcer_tDBOutput_8.put("DATELOADED", R4MINMAX.DATELOADED);
									}

									org.apache.avro.generic.IndexedRecord data_tDBOutput_8 = null;
									if (incomingEnforcer_tDBOutput_8 != null) {
										data_tDBOutput_8 = incomingEnforcer_tDBOutput_8.getCurrentRecord();
									}

									if (writer_tDBOutput_8 != null && data_tDBOutput_8 != null) {
										writer_tDBOutput_8.write(data_tDBOutput_8);
									}

									nb_line_tDBOutput_8++;

									tos_count_tDBOutput_8++;

									/**
									 * [tDBOutput_8 main ] stop
									 */

									/**
									 * [tDBOutput_8 process_data_begin ] start
									 */

									currentComponent = "tDBOutput_8";

									/**
									 * [tDBOutput_8 process_data_begin ] stop
									 */

									/**
									 * [tDBOutput_8 process_data_end ] start
									 */

									currentComponent = "tDBOutput_8";

									/**
									 * [tDBOutput_8 process_data_end ] stop
									 */

								} // End of branch "R4MINMAX"

								/**
								 * [tMap_2 process_data_end ] start
								 */

								currentComponent = "tMap_2";

								/**
								 * [tMap_2 process_data_end ] stop
								 */

							} // End of branch "row2"

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
					if (!((Object) ("/data/talend/data_repository/R4MINMAX.zip") instanceof java.io.InputStream)) {
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
				 * [tMap_2 end ] start
				 */

				currentComponent = "tMap_2";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'R4MINMAX': " + count_R4MINMAX_tMap_2 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
						"tFileInputDelimited_3", "tFileInputDelimited_3", "tFileInputDelimited", "tMap_2", "tMap_2",
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
				 * [tDBOutput_8 end ] start
				 */

				currentComponent = "tDBOutput_8";

// end of generic

				resourceMap.put("finish_tDBOutput_8", Boolean.TRUE);

				java.util.Map<String, Object> resultMap_tDBOutput_8 = null;
				if (writer_tDBOutput_8 != null) {
					org.talend.components.api.component.runtime.Result resultObject_tDBOutput_8 = (org.talend.components.api.component.runtime.Result) writer_tDBOutput_8
							.close();
					resultMap_tDBOutput_8 = writer_tDBOutput_8.getWriteOperation()
							.finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(
									resultObject_tDBOutput_8), container_tDBOutput_8);
				}
				if (resultMap_tDBOutput_8 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBOutput_8 : resultMap_tDBOutput_8.entrySet()) {
						switch (entry_tDBOutput_8.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBOutput_8.setComponentData("tDBOutput_8", "ERROR_MESSAGE",
									entry_tDBOutput_8.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBOutput_8.setComponentData("tDBOutput_8", "NB_LINE",
									entry_tDBOutput_8.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBOutput_8.setComponentData("tDBOutput_8", "NB_SUCCESS",
									entry_tDBOutput_8.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBOutput_8.setComponentData("tDBOutput_8", "NB_REJECT",
									entry_tDBOutput_8.getValue());
							break;
						default:
							StringBuilder studio_key_tDBOutput_8 = new StringBuilder();
							for (int i_tDBOutput_8 = 0; i_tDBOutput_8 < entry_tDBOutput_8.getKey()
									.length(); i_tDBOutput_8++) {
								char ch_tDBOutput_8 = entry_tDBOutput_8.getKey().charAt(i_tDBOutput_8);
								if (Character.isUpperCase(ch_tDBOutput_8) && i_tDBOutput_8 > 0) {
									studio_key_tDBOutput_8.append('_');
								}
								studio_key_tDBOutput_8.append(ch_tDBOutput_8);
							}
							container_tDBOutput_8.setComponentData("tDBOutput_8",
									studio_key_tDBOutput_8.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBOutput_8.getValue());
							break;
						}
					}
				}

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "R4MINMAX", 2, 0,
						"tMap_2", "tMap_2", "tMap", "tDBOutput_8", "tDBOutput_8", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_8", true);
				end_Hash.put("tDBOutput_8", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk12", 0, "ok");
				}
				tFileDelete_2Process(globalMap);

				/**
				 * [tDBOutput_8 end ] stop
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
				 * [tMap_2 finally ] start
				 */

				currentComponent = "tMap_2";

				/**
				 * [tMap_2 finally ] stop
				 */

				/**
				 * [tDBOutput_8 finally ] start
				 */

				currentComponent = "tDBOutput_8";

// finally of generic

				if (resourceMap.get("finish_tDBOutput_8") == null) {
					if (resourceMap.get("writer_tDBOutput_8") != null) {
						try {
							((org.talend.components.api.component.runtime.Writer) resourceMap.get("writer_tDBOutput_8"))
									.close();
						} catch (java.io.IOException e_tDBOutput_8) {
							String errorMessage_tDBOutput_8 = "failed to release the resource in tDBOutput_8 :"
									+ e_tDBOutput_8.getMessage();
							System.err.println(errorMessage_tDBOutput_8);
						}
					}
				}

				/**
				 * [tDBOutput_8 finally ] stop
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/R4MINMAX.zip\"");
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
				java.io.File path_tFileDelete_2 = new java.io.File("/data/talend/data_repository/R4MINMAX.zip");
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
				globalMap.put("tFileDelete_2_DELETE_PATH", "/data/talend/data_repository/R4MINMAX.zip");

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
						"\nDELETE from PRICE_DETAIL_BY_LOC_SKU_PRCDTL\nWHERE DATELOADED = CURRENT_DATE()\n\n");

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
					runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBRow_6Process(globalMap);

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
						"\ncreate or replace TABLE PRCDTL (\n	LPSKU NUMBER(9,0),\n	LPLOC NUMBER(5,0),\n	LPCUR VARCHAR(3),\n	LPPTP VARCHAR(3),\n	"
								+ "LPCENT NUMBER(1,0),\n	LPDATE NUMBER(6,0),\n	LPRETL NUMBER(9,2),\n	LPRETU NUMBER(9,2),\n	LPRMLT NUMBER(3,0),\n	LPPOS NUMB"
								+ "ER(9,2),\n	LPPOSU NUMBER(9,2),\n	LPPMLT NUMBER(3,0),\n	LPORIG NUMBER(9,2),\n	LPORGU NUMBER(9,2),\n	LPOMLT NUMBER(3,0),\n"
								+ "	LPPPRE NUMBER(2,0),\n        LOAD_DATE DATE\n);\n\n");

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
					runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBInput_3Process(globalMap);

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

	public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal LPSKU;

		public BigDecimal getLPSKU() {
			return this.LPSKU;
		}

		public Boolean LPSKUIsNullable() {
			return false;
		}

		public Boolean LPSKUIsKey() {
			return false;
		}

		public Integer LPSKULength() {
			return 9;
		}

		public Integer LPSKUPrecision() {
			return 0;
		}

		public String LPSKUDefault() {

			return "";

		}

		public String LPSKUComment() {

			return "";

		}

		public String LPSKUPattern() {

			return "";

		}

		public String LPSKUOriginalDbColumnName() {

			return "LPSKU";

		}

		public BigDecimal LPLOC;

		public BigDecimal getLPLOC() {
			return this.LPLOC;
		}

		public Boolean LPLOCIsNullable() {
			return false;
		}

		public Boolean LPLOCIsKey() {
			return false;
		}

		public Integer LPLOCLength() {
			return 5;
		}

		public Integer LPLOCPrecision() {
			return 0;
		}

		public String LPLOCDefault() {

			return "";

		}

		public String LPLOCComment() {

			return "";

		}

		public String LPLOCPattern() {

			return "";

		}

		public String LPLOCOriginalDbColumnName() {

			return "LPLOC";

		}

		public String LPCUR;

		public String getLPCUR() {
			return this.LPCUR;
		}

		public Boolean LPCURIsNullable() {
			return false;
		}

		public Boolean LPCURIsKey() {
			return false;
		}

		public Integer LPCURLength() {
			return 3;
		}

		public Integer LPCURPrecision() {
			return 0;
		}

		public String LPCURDefault() {

			return null;

		}

		public String LPCURComment() {

			return "";

		}

		public String LPCURPattern() {

			return "";

		}

		public String LPCUROriginalDbColumnName() {

			return "LPCUR";

		}

		public String LPPTP;

		public String getLPPTP() {
			return this.LPPTP;
		}

		public Boolean LPPTPIsNullable() {
			return false;
		}

		public Boolean LPPTPIsKey() {
			return false;
		}

		public Integer LPPTPLength() {
			return 3;
		}

		public Integer LPPTPPrecision() {
			return 0;
		}

		public String LPPTPDefault() {

			return null;

		}

		public String LPPTPComment() {

			return "";

		}

		public String LPPTPPattern() {

			return "";

		}

		public String LPPTPOriginalDbColumnName() {

			return "LPPTP";

		}

		public BigDecimal LPCENT;

		public BigDecimal getLPCENT() {
			return this.LPCENT;
		}

		public Boolean LPCENTIsNullable() {
			return false;
		}

		public Boolean LPCENTIsKey() {
			return false;
		}

		public Integer LPCENTLength() {
			return 1;
		}

		public Integer LPCENTPrecision() {
			return 0;
		}

		public String LPCENTDefault() {

			return "";

		}

		public String LPCENTComment() {

			return "";

		}

		public String LPCENTPattern() {

			return "";

		}

		public String LPCENTOriginalDbColumnName() {

			return "LPCENT";

		}

		public BigDecimal LPDATE;

		public BigDecimal getLPDATE() {
			return this.LPDATE;
		}

		public Boolean LPDATEIsNullable() {
			return false;
		}

		public Boolean LPDATEIsKey() {
			return false;
		}

		public Integer LPDATELength() {
			return 6;
		}

		public Integer LPDATEPrecision() {
			return 0;
		}

		public String LPDATEDefault() {

			return "";

		}

		public String LPDATEComment() {

			return "";

		}

		public String LPDATEPattern() {

			return "";

		}

		public String LPDATEOriginalDbColumnName() {

			return "LPDATE";

		}

		public BigDecimal LPRETL;

		public BigDecimal getLPRETL() {
			return this.LPRETL;
		}

		public Boolean LPRETLIsNullable() {
			return false;
		}

		public Boolean LPRETLIsKey() {
			return false;
		}

		public Integer LPRETLLength() {
			return 9;
		}

		public Integer LPRETLPrecision() {
			return 2;
		}

		public String LPRETLDefault() {

			return "";

		}

		public String LPRETLComment() {

			return "";

		}

		public String LPRETLPattern() {

			return "";

		}

		public String LPRETLOriginalDbColumnName() {

			return "LPRETL";

		}

		public BigDecimal LPRETU;

		public BigDecimal getLPRETU() {
			return this.LPRETU;
		}

		public Boolean LPRETUIsNullable() {
			return false;
		}

		public Boolean LPRETUIsKey() {
			return false;
		}

		public Integer LPRETULength() {
			return 9;
		}

		public Integer LPRETUPrecision() {
			return 2;
		}

		public String LPRETUDefault() {

			return "";

		}

		public String LPRETUComment() {

			return "";

		}

		public String LPRETUPattern() {

			return "";

		}

		public String LPRETUOriginalDbColumnName() {

			return "LPRETU";

		}

		public BigDecimal LPRMLT;

		public BigDecimal getLPRMLT() {
			return this.LPRMLT;
		}

		public Boolean LPRMLTIsNullable() {
			return false;
		}

		public Boolean LPRMLTIsKey() {
			return false;
		}

		public Integer LPRMLTLength() {
			return 3;
		}

		public Integer LPRMLTPrecision() {
			return 0;
		}

		public String LPRMLTDefault() {

			return "";

		}

		public String LPRMLTComment() {

			return "";

		}

		public String LPRMLTPattern() {

			return "";

		}

		public String LPRMLTOriginalDbColumnName() {

			return "LPRMLT";

		}

		public BigDecimal LPPOS;

		public BigDecimal getLPPOS() {
			return this.LPPOS;
		}

		public Boolean LPPOSIsNullable() {
			return false;
		}

		public Boolean LPPOSIsKey() {
			return false;
		}

		public Integer LPPOSLength() {
			return 9;
		}

		public Integer LPPOSPrecision() {
			return 2;
		}

		public String LPPOSDefault() {

			return "";

		}

		public String LPPOSComment() {

			return "";

		}

		public String LPPOSPattern() {

			return "";

		}

		public String LPPOSOriginalDbColumnName() {

			return "LPPOS";

		}

		public BigDecimal LPPOSU;

		public BigDecimal getLPPOSU() {
			return this.LPPOSU;
		}

		public Boolean LPPOSUIsNullable() {
			return false;
		}

		public Boolean LPPOSUIsKey() {
			return false;
		}

		public Integer LPPOSULength() {
			return 9;
		}

		public Integer LPPOSUPrecision() {
			return 2;
		}

		public String LPPOSUDefault() {

			return "";

		}

		public String LPPOSUComment() {

			return "";

		}

		public String LPPOSUPattern() {

			return "";

		}

		public String LPPOSUOriginalDbColumnName() {

			return "LPPOSU";

		}

		public BigDecimal LPPMLT;

		public BigDecimal getLPPMLT() {
			return this.LPPMLT;
		}

		public Boolean LPPMLTIsNullable() {
			return false;
		}

		public Boolean LPPMLTIsKey() {
			return false;
		}

		public Integer LPPMLTLength() {
			return 3;
		}

		public Integer LPPMLTPrecision() {
			return 0;
		}

		public String LPPMLTDefault() {

			return "";

		}

		public String LPPMLTComment() {

			return "";

		}

		public String LPPMLTPattern() {

			return "";

		}

		public String LPPMLTOriginalDbColumnName() {

			return "LPPMLT";

		}

		public BigDecimal LPORIG;

		public BigDecimal getLPORIG() {
			return this.LPORIG;
		}

		public Boolean LPORIGIsNullable() {
			return false;
		}

		public Boolean LPORIGIsKey() {
			return false;
		}

		public Integer LPORIGLength() {
			return 9;
		}

		public Integer LPORIGPrecision() {
			return 2;
		}

		public String LPORIGDefault() {

			return "";

		}

		public String LPORIGComment() {

			return "";

		}

		public String LPORIGPattern() {

			return "";

		}

		public String LPORIGOriginalDbColumnName() {

			return "LPORIG";

		}

		public BigDecimal LPORGU;

		public BigDecimal getLPORGU() {
			return this.LPORGU;
		}

		public Boolean LPORGUIsNullable() {
			return false;
		}

		public Boolean LPORGUIsKey() {
			return false;
		}

		public Integer LPORGULength() {
			return 9;
		}

		public Integer LPORGUPrecision() {
			return 2;
		}

		public String LPORGUDefault() {

			return "";

		}

		public String LPORGUComment() {

			return "";

		}

		public String LPORGUPattern() {

			return "";

		}

		public String LPORGUOriginalDbColumnName() {

			return "LPORGU";

		}

		public BigDecimal LPOMLT;

		public BigDecimal getLPOMLT() {
			return this.LPOMLT;
		}

		public Boolean LPOMLTIsNullable() {
			return false;
		}

		public Boolean LPOMLTIsKey() {
			return false;
		}

		public Integer LPOMLTLength() {
			return 3;
		}

		public Integer LPOMLTPrecision() {
			return 0;
		}

		public String LPOMLTDefault() {

			return "";

		}

		public String LPOMLTComment() {

			return "";

		}

		public String LPOMLTPattern() {

			return "";

		}

		public String LPOMLTOriginalDbColumnName() {

			return "LPOMLT";

		}

		public BigDecimal LPPPRE;

		public BigDecimal getLPPPRE() {
			return this.LPPPRE;
		}

		public Boolean LPPPREIsNullable() {
			return false;
		}

		public Boolean LPPPREIsKey() {
			return false;
		}

		public Integer LPPPRELength() {
			return 2;
		}

		public Integer LPPPREPrecision() {
			return 0;
		}

		public String LPPPREDefault() {

			return "";

		}

		public String LPPPREComment() {

			return "";

		}

		public String LPPPREPattern() {

			return "";

		}

		public String LPPPREOriginalDbColumnName() {

			return "LPPPRE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("LPSKU=" + String.valueOf(LPSKU));
			sb.append(",LPLOC=" + String.valueOf(LPLOC));
			sb.append(",LPCUR=" + LPCUR);
			sb.append(",LPPTP=" + LPPTP);
			sb.append(",LPCENT=" + String.valueOf(LPCENT));
			sb.append(",LPDATE=" + String.valueOf(LPDATE));
			sb.append(",LPRETL=" + String.valueOf(LPRETL));
			sb.append(",LPRETU=" + String.valueOf(LPRETU));
			sb.append(",LPRMLT=" + String.valueOf(LPRMLT));
			sb.append(",LPPOS=" + String.valueOf(LPPOS));
			sb.append(",LPPOSU=" + String.valueOf(LPPOSU));
			sb.append(",LPPMLT=" + String.valueOf(LPPMLT));
			sb.append(",LPORIG=" + String.valueOf(LPORIG));
			sb.append(",LPORGU=" + String.valueOf(LPORGU));
			sb.append(",LPOMLT=" + String.valueOf(LPOMLT));
			sb.append(",LPPPRE=" + String.valueOf(LPPPRE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (LPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPSKU);
			}

			sb.append("|");

			if (LPLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(LPLOC);
			}

			sb.append("|");

			if (LPCUR == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCUR);
			}

			sb.append("|");

			if (LPPTP == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPTP);
			}

			sb.append("|");

			if (LPCENT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCENT);
			}

			sb.append("|");

			if (LPDATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPDATE);
			}

			sb.append("|");

			if (LPRETL == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETL);
			}

			sb.append("|");

			if (LPRETU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETU);
			}

			sb.append("|");

			if (LPRMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRMLT);
			}

			sb.append("|");

			if (LPPOS == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOS);
			}

			sb.append("|");

			if (LPPOSU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOSU);
			}

			sb.append("|");

			if (LPPMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPMLT);
			}

			sb.append("|");

			if (LPORIG == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORIG);
			}

			sb.append("|");

			if (LPORGU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORGU);
			}

			sb.append("|");

			if (LPOMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPOMLT);
			}

			sb.append("|");

			if (LPPPRE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPPRE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row4Struct other) {

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

				row4Struct row4 = new row4Struct();

				/**
				 * [tFileOutputDelimited_3 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_3", false);
				start_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row4");

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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/PRCDTL.csv\"");
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
				fileName_tFileOutputDelimited_3 = (new java.io.File("/data/talend/data_repository/PRCDTL.csv"))
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
						outtFileOutputDelimited_3.write("LPSKU");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPLOC");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPCUR");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPPTP");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPCENT");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPDATE");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPRETL");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPRETU");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPRMLT");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPPOS");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPPOSU");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPPMLT");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPORIG");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPORGU");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPOMLT");
						outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
						outtFileOutputDelimited_3.write("LPPPRE");
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
							log4jParamters_tDBInput_3.append("QUERY" + " = "
									+ "\"with temp as (select istore||a.inumbr strsku                                          from invbal a join invmst b on a.inumbr = b.inumbr                   where idsccd not in ('D', 'P')                                           or (idsccd in ('D', 'P') and ibhand <> 0 )),            temp2 as (select strnum from tblstr                                                  where stcldt = 0 or stcldt > (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP -7 DAYS, 'YYMMDD')))                       select *                                                              from prcdtl                                                            where lploc in (select strnum from temp2)                  and lploc||lpsku in (select strsku from temp)      \"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_3.append(" | ");
							log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPLOC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPCUR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPPTP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPCENT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPDATE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPRETL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPRETU") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPRMLT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPPOS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPPOSU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPPMLT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPORIG") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPORGU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPOMLT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPPPRE") + "}]");
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

				String dbquery_tDBInput_3 = "with temp as (select istore||a.inumbr strsku                        \n                from invbal a join invmst b on a."
						+ "inumbr = b.inumbr  \n               where idsccd not in ('D', 'P')                       \n                  or (idsccd "
						+ "in ('D', 'P') and ibhand <> 0 )),      \n    temp2 as (select strnum from tblstr                                 \n     "
						+ "          where stcldt = 0 or stcldt > (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP -7 DAYS, 'YYMMDD')))                   "
						+ "  \nselect *                                                          \n  from prcdtl                                   "
						+ "                      \n where lploc in (select strnum from temp2)         \n       and lploc||lpsku in (select strsku f"
						+ "rom temp)  \n\n";

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
							row4.LPSKU = null;
						} else {

							row4.LPSKU = rs_tDBInput_3.getBigDecimal(1);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 2) {
							row4.LPLOC = null;
						} else {

							row4.LPLOC = rs_tDBInput_3.getBigDecimal(2);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 3) {
							row4.LPCUR = null;
						} else {

							row4.LPCUR = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
						}
						if (colQtyInRs_tDBInput_3 < 4) {
							row4.LPPTP = null;
						} else {

							row4.LPPTP = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
						}
						if (colQtyInRs_tDBInput_3 < 5) {
							row4.LPCENT = null;
						} else {

							row4.LPCENT = rs_tDBInput_3.getBigDecimal(5);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 6) {
							row4.LPDATE = null;
						} else {

							row4.LPDATE = rs_tDBInput_3.getBigDecimal(6);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 7) {
							row4.LPRETL = null;
						} else {

							row4.LPRETL = rs_tDBInput_3.getBigDecimal(7);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 8) {
							row4.LPRETU = null;
						} else {

							row4.LPRETU = rs_tDBInput_3.getBigDecimal(8);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 9) {
							row4.LPRMLT = null;
						} else {

							row4.LPRMLT = rs_tDBInput_3.getBigDecimal(9);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 10) {
							row4.LPPOS = null;
						} else {

							row4.LPPOS = rs_tDBInput_3.getBigDecimal(10);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 11) {
							row4.LPPOSU = null;
						} else {

							row4.LPPOSU = rs_tDBInput_3.getBigDecimal(11);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 12) {
							row4.LPPMLT = null;
						} else {

							row4.LPPMLT = rs_tDBInput_3.getBigDecimal(12);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 13) {
							row4.LPORIG = null;
						} else {

							row4.LPORIG = rs_tDBInput_3.getBigDecimal(13);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 14) {
							row4.LPORGU = null;
						} else {

							row4.LPORGU = rs_tDBInput_3.getBigDecimal(14);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 15) {
							row4.LPOMLT = null;
						} else {

							row4.LPOMLT = rs_tDBInput_3.getBigDecimal(15);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_3 < 16) {
							row4.LPPPRE = null;
						} else {

							row4.LPPPRE = rs_tDBInput_3.getBigDecimal(16);
							if (rs_tDBInput_3.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
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

								, "row4", "tDBInput_3", "tDBInput_3", "tAS400Input", "tFileOutputDelimited_3",
								"tFileOutputDelimited_3", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row4 - " + (row4 == null ? "" : row4.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
						if (row4.LPSKU != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPLOC != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPLOC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPCUR != null) {
							sb_tFileOutputDelimited_3.append(row4.LPCUR);
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPPTP != null) {
							sb_tFileOutputDelimited_3.append(row4.LPPTP);
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPCENT != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPCENT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPDATE != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPDATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPRETL != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPRETL.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPRETU != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPRETU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPRMLT != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPRMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPPOS != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPPOS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPPOSU != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPPOSU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPPMLT != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPPMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPORIG != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPORIG.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPORGU != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPORGU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPOMLT != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPOMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
						if (row4.LPPPRE != null) {
							sb_tFileOutputDelimited_3
									.append(row4.LPPPRE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row4", 2, 0,
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
				runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
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

	public static class PRCDTLStruct implements routines.system.IPersistableRow<PRCDTLStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal LPSKU;

		public BigDecimal getLPSKU() {
			return this.LPSKU;
		}

		public Boolean LPSKUIsNullable() {
			return true;
		}

		public Boolean LPSKUIsKey() {
			return false;
		}

		public Integer LPSKULength() {
			return null;
		}

		public Integer LPSKUPrecision() {
			return null;
		}

		public String LPSKUDefault() {

			return "";

		}

		public String LPSKUComment() {

			return "";

		}

		public String LPSKUPattern() {

			return "";

		}

		public String LPSKUOriginalDbColumnName() {

			return "LPSKU";

		}

		public BigDecimal LPLOC;

		public BigDecimal getLPLOC() {
			return this.LPLOC;
		}

		public Boolean LPLOCIsNullable() {
			return true;
		}

		public Boolean LPLOCIsKey() {
			return false;
		}

		public Integer LPLOCLength() {
			return null;
		}

		public Integer LPLOCPrecision() {
			return null;
		}

		public String LPLOCDefault() {

			return "";

		}

		public String LPLOCComment() {

			return "";

		}

		public String LPLOCPattern() {

			return "";

		}

		public String LPLOCOriginalDbColumnName() {

			return "LPLOC";

		}

		public String LPCUR;

		public String getLPCUR() {
			return this.LPCUR;
		}

		public Boolean LPCURIsNullable() {
			return true;
		}

		public Boolean LPCURIsKey() {
			return false;
		}

		public Integer LPCURLength() {
			return null;
		}

		public Integer LPCURPrecision() {
			return null;
		}

		public String LPCURDefault() {

			return null;

		}

		public String LPCURComment() {

			return "";

		}

		public String LPCURPattern() {

			return "";

		}

		public String LPCUROriginalDbColumnName() {

			return "LPCUR";

		}

		public String LPPTP;

		public String getLPPTP() {
			return this.LPPTP;
		}

		public Boolean LPPTPIsNullable() {
			return true;
		}

		public Boolean LPPTPIsKey() {
			return false;
		}

		public Integer LPPTPLength() {
			return null;
		}

		public Integer LPPTPPrecision() {
			return null;
		}

		public String LPPTPDefault() {

			return null;

		}

		public String LPPTPComment() {

			return "";

		}

		public String LPPTPPattern() {

			return "";

		}

		public String LPPTPOriginalDbColumnName() {

			return "LPPTP";

		}

		public BigDecimal LPCENT;

		public BigDecimal getLPCENT() {
			return this.LPCENT;
		}

		public Boolean LPCENTIsNullable() {
			return true;
		}

		public Boolean LPCENTIsKey() {
			return false;
		}

		public Integer LPCENTLength() {
			return null;
		}

		public Integer LPCENTPrecision() {
			return null;
		}

		public String LPCENTDefault() {

			return "";

		}

		public String LPCENTComment() {

			return "";

		}

		public String LPCENTPattern() {

			return "";

		}

		public String LPCENTOriginalDbColumnName() {

			return "LPCENT";

		}

		public BigDecimal LPDATE;

		public BigDecimal getLPDATE() {
			return this.LPDATE;
		}

		public Boolean LPDATEIsNullable() {
			return true;
		}

		public Boolean LPDATEIsKey() {
			return false;
		}

		public Integer LPDATELength() {
			return null;
		}

		public Integer LPDATEPrecision() {
			return null;
		}

		public String LPDATEDefault() {

			return "";

		}

		public String LPDATEComment() {

			return "";

		}

		public String LPDATEPattern() {

			return "";

		}

		public String LPDATEOriginalDbColumnName() {

			return "LPDATE";

		}

		public BigDecimal LPRETL;

		public BigDecimal getLPRETL() {
			return this.LPRETL;
		}

		public Boolean LPRETLIsNullable() {
			return true;
		}

		public Boolean LPRETLIsKey() {
			return false;
		}

		public Integer LPRETLLength() {
			return null;
		}

		public Integer LPRETLPrecision() {
			return null;
		}

		public String LPRETLDefault() {

			return "";

		}

		public String LPRETLComment() {

			return "";

		}

		public String LPRETLPattern() {

			return "";

		}

		public String LPRETLOriginalDbColumnName() {

			return "LPRETL";

		}

		public BigDecimal LPRETU;

		public BigDecimal getLPRETU() {
			return this.LPRETU;
		}

		public Boolean LPRETUIsNullable() {
			return true;
		}

		public Boolean LPRETUIsKey() {
			return false;
		}

		public Integer LPRETULength() {
			return null;
		}

		public Integer LPRETUPrecision() {
			return null;
		}

		public String LPRETUDefault() {

			return "";

		}

		public String LPRETUComment() {

			return "";

		}

		public String LPRETUPattern() {

			return "";

		}

		public String LPRETUOriginalDbColumnName() {

			return "LPRETU";

		}

		public BigDecimal LPRMLT;

		public BigDecimal getLPRMLT() {
			return this.LPRMLT;
		}

		public Boolean LPRMLTIsNullable() {
			return true;
		}

		public Boolean LPRMLTIsKey() {
			return false;
		}

		public Integer LPRMLTLength() {
			return null;
		}

		public Integer LPRMLTPrecision() {
			return null;
		}

		public String LPRMLTDefault() {

			return "";

		}

		public String LPRMLTComment() {

			return "";

		}

		public String LPRMLTPattern() {

			return "";

		}

		public String LPRMLTOriginalDbColumnName() {

			return "LPRMLT";

		}

		public BigDecimal LPPOS;

		public BigDecimal getLPPOS() {
			return this.LPPOS;
		}

		public Boolean LPPOSIsNullable() {
			return true;
		}

		public Boolean LPPOSIsKey() {
			return false;
		}

		public Integer LPPOSLength() {
			return null;
		}

		public Integer LPPOSPrecision() {
			return null;
		}

		public String LPPOSDefault() {

			return "";

		}

		public String LPPOSComment() {

			return "";

		}

		public String LPPOSPattern() {

			return "";

		}

		public String LPPOSOriginalDbColumnName() {

			return "LPPOS";

		}

		public BigDecimal LPPOSU;

		public BigDecimal getLPPOSU() {
			return this.LPPOSU;
		}

		public Boolean LPPOSUIsNullable() {
			return true;
		}

		public Boolean LPPOSUIsKey() {
			return false;
		}

		public Integer LPPOSULength() {
			return null;
		}

		public Integer LPPOSUPrecision() {
			return null;
		}

		public String LPPOSUDefault() {

			return "";

		}

		public String LPPOSUComment() {

			return "";

		}

		public String LPPOSUPattern() {

			return "";

		}

		public String LPPOSUOriginalDbColumnName() {

			return "LPPOSU";

		}

		public BigDecimal LPPMLT;

		public BigDecimal getLPPMLT() {
			return this.LPPMLT;
		}

		public Boolean LPPMLTIsNullable() {
			return true;
		}

		public Boolean LPPMLTIsKey() {
			return false;
		}

		public Integer LPPMLTLength() {
			return null;
		}

		public Integer LPPMLTPrecision() {
			return null;
		}

		public String LPPMLTDefault() {

			return "";

		}

		public String LPPMLTComment() {

			return "";

		}

		public String LPPMLTPattern() {

			return "";

		}

		public String LPPMLTOriginalDbColumnName() {

			return "LPPMLT";

		}

		public BigDecimal LPORIG;

		public BigDecimal getLPORIG() {
			return this.LPORIG;
		}

		public Boolean LPORIGIsNullable() {
			return true;
		}

		public Boolean LPORIGIsKey() {
			return false;
		}

		public Integer LPORIGLength() {
			return null;
		}

		public Integer LPORIGPrecision() {
			return null;
		}

		public String LPORIGDefault() {

			return "";

		}

		public String LPORIGComment() {

			return "";

		}

		public String LPORIGPattern() {

			return "";

		}

		public String LPORIGOriginalDbColumnName() {

			return "LPORIG";

		}

		public BigDecimal LPORGU;

		public BigDecimal getLPORGU() {
			return this.LPORGU;
		}

		public Boolean LPORGUIsNullable() {
			return true;
		}

		public Boolean LPORGUIsKey() {
			return false;
		}

		public Integer LPORGULength() {
			return null;
		}

		public Integer LPORGUPrecision() {
			return null;
		}

		public String LPORGUDefault() {

			return "";

		}

		public String LPORGUComment() {

			return "";

		}

		public String LPORGUPattern() {

			return "";

		}

		public String LPORGUOriginalDbColumnName() {

			return "LPORGU";

		}

		public BigDecimal LPOMLT;

		public BigDecimal getLPOMLT() {
			return this.LPOMLT;
		}

		public Boolean LPOMLTIsNullable() {
			return true;
		}

		public Boolean LPOMLTIsKey() {
			return false;
		}

		public Integer LPOMLTLength() {
			return null;
		}

		public Integer LPOMLTPrecision() {
			return null;
		}

		public String LPOMLTDefault() {

			return "";

		}

		public String LPOMLTComment() {

			return "";

		}

		public String LPOMLTPattern() {

			return "";

		}

		public String LPOMLTOriginalDbColumnName() {

			return "LPOMLT";

		}

		public BigDecimal LPPPRE;

		public BigDecimal getLPPPRE() {
			return this.LPPPRE;
		}

		public Boolean LPPPREIsNullable() {
			return true;
		}

		public Boolean LPPPREIsKey() {
			return false;
		}

		public Integer LPPPRELength() {
			return null;
		}

		public Integer LPPPREPrecision() {
			return null;
		}

		public String LPPPREDefault() {

			return "";

		}

		public String LPPPREComment() {

			return "";

		}

		public String LPPPREPattern() {

			return "";

		}

		public String LPPPREOriginalDbColumnName() {

			return "LPPPRE";

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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

					this.LOAD_DATE = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

				// java.util.Date

				writeDate(this.LOAD_DATE, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

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
			sb.append("LPSKU=" + String.valueOf(LPSKU));
			sb.append(",LPLOC=" + String.valueOf(LPLOC));
			sb.append(",LPCUR=" + LPCUR);
			sb.append(",LPPTP=" + LPPTP);
			sb.append(",LPCENT=" + String.valueOf(LPCENT));
			sb.append(",LPDATE=" + String.valueOf(LPDATE));
			sb.append(",LPRETL=" + String.valueOf(LPRETL));
			sb.append(",LPRETU=" + String.valueOf(LPRETU));
			sb.append(",LPRMLT=" + String.valueOf(LPRMLT));
			sb.append(",LPPOS=" + String.valueOf(LPPOS));
			sb.append(",LPPOSU=" + String.valueOf(LPPOSU));
			sb.append(",LPPMLT=" + String.valueOf(LPPMLT));
			sb.append(",LPORIG=" + String.valueOf(LPORIG));
			sb.append(",LPORGU=" + String.valueOf(LPORGU));
			sb.append(",LPOMLT=" + String.valueOf(LPOMLT));
			sb.append(",LPPPRE=" + String.valueOf(LPPPRE));
			sb.append(",LOAD_DATE=" + String.valueOf(LOAD_DATE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (LPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPSKU);
			}

			sb.append("|");

			if (LPLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(LPLOC);
			}

			sb.append("|");

			if (LPCUR == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCUR);
			}

			sb.append("|");

			if (LPPTP == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPTP);
			}

			sb.append("|");

			if (LPCENT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCENT);
			}

			sb.append("|");

			if (LPDATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPDATE);
			}

			sb.append("|");

			if (LPRETL == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETL);
			}

			sb.append("|");

			if (LPRETU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETU);
			}

			sb.append("|");

			if (LPRMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRMLT);
			}

			sb.append("|");

			if (LPPOS == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOS);
			}

			sb.append("|");

			if (LPPOSU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOSU);
			}

			sb.append("|");

			if (LPPMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPMLT);
			}

			sb.append("|");

			if (LPORIG == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORIG);
			}

			sb.append("|");

			if (LPORGU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORGU);
			}

			sb.append("|");

			if (LPOMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPOMLT);
			}

			sb.append("|");

			if (LPPPRE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPPRE);
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
		public int compareTo(PRCDTLStruct other) {

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

	public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[0];

		public BigDecimal LPSKU;

		public BigDecimal getLPSKU() {
			return this.LPSKU;
		}

		public Boolean LPSKUIsNullable() {
			return true;
		}

		public Boolean LPSKUIsKey() {
			return false;
		}

		public Integer LPSKULength() {
			return null;
		}

		public Integer LPSKUPrecision() {
			return null;
		}

		public String LPSKUDefault() {

			return "";

		}

		public String LPSKUComment() {

			return "";

		}

		public String LPSKUPattern() {

			return "";

		}

		public String LPSKUOriginalDbColumnName() {

			return "LPSKU";

		}

		public BigDecimal LPLOC;

		public BigDecimal getLPLOC() {
			return this.LPLOC;
		}

		public Boolean LPLOCIsNullable() {
			return true;
		}

		public Boolean LPLOCIsKey() {
			return false;
		}

		public Integer LPLOCLength() {
			return null;
		}

		public Integer LPLOCPrecision() {
			return null;
		}

		public String LPLOCDefault() {

			return "";

		}

		public String LPLOCComment() {

			return "";

		}

		public String LPLOCPattern() {

			return "";

		}

		public String LPLOCOriginalDbColumnName() {

			return "LPLOC";

		}

		public String LPCUR;

		public String getLPCUR() {
			return this.LPCUR;
		}

		public Boolean LPCURIsNullable() {
			return true;
		}

		public Boolean LPCURIsKey() {
			return false;
		}

		public Integer LPCURLength() {
			return null;
		}

		public Integer LPCURPrecision() {
			return null;
		}

		public String LPCURDefault() {

			return null;

		}

		public String LPCURComment() {

			return "";

		}

		public String LPCURPattern() {

			return "";

		}

		public String LPCUROriginalDbColumnName() {

			return "LPCUR";

		}

		public String LPPTP;

		public String getLPPTP() {
			return this.LPPTP;
		}

		public Boolean LPPTPIsNullable() {
			return true;
		}

		public Boolean LPPTPIsKey() {
			return false;
		}

		public Integer LPPTPLength() {
			return null;
		}

		public Integer LPPTPPrecision() {
			return null;
		}

		public String LPPTPDefault() {

			return null;

		}

		public String LPPTPComment() {

			return "";

		}

		public String LPPTPPattern() {

			return "";

		}

		public String LPPTPOriginalDbColumnName() {

			return "LPPTP";

		}

		public BigDecimal LPCENT;

		public BigDecimal getLPCENT() {
			return this.LPCENT;
		}

		public Boolean LPCENTIsNullable() {
			return true;
		}

		public Boolean LPCENTIsKey() {
			return false;
		}

		public Integer LPCENTLength() {
			return null;
		}

		public Integer LPCENTPrecision() {
			return null;
		}

		public String LPCENTDefault() {

			return "";

		}

		public String LPCENTComment() {

			return "";

		}

		public String LPCENTPattern() {

			return "";

		}

		public String LPCENTOriginalDbColumnName() {

			return "LPCENT";

		}

		public BigDecimal LPDATE;

		public BigDecimal getLPDATE() {
			return this.LPDATE;
		}

		public Boolean LPDATEIsNullable() {
			return true;
		}

		public Boolean LPDATEIsKey() {
			return false;
		}

		public Integer LPDATELength() {
			return null;
		}

		public Integer LPDATEPrecision() {
			return null;
		}

		public String LPDATEDefault() {

			return "";

		}

		public String LPDATEComment() {

			return "";

		}

		public String LPDATEPattern() {

			return "";

		}

		public String LPDATEOriginalDbColumnName() {

			return "LPDATE";

		}

		public BigDecimal LPRETL;

		public BigDecimal getLPRETL() {
			return this.LPRETL;
		}

		public Boolean LPRETLIsNullable() {
			return true;
		}

		public Boolean LPRETLIsKey() {
			return false;
		}

		public Integer LPRETLLength() {
			return null;
		}

		public Integer LPRETLPrecision() {
			return null;
		}

		public String LPRETLDefault() {

			return "";

		}

		public String LPRETLComment() {

			return "";

		}

		public String LPRETLPattern() {

			return "";

		}

		public String LPRETLOriginalDbColumnName() {

			return "LPRETL";

		}

		public BigDecimal LPRETU;

		public BigDecimal getLPRETU() {
			return this.LPRETU;
		}

		public Boolean LPRETUIsNullable() {
			return true;
		}

		public Boolean LPRETUIsKey() {
			return false;
		}

		public Integer LPRETULength() {
			return null;
		}

		public Integer LPRETUPrecision() {
			return null;
		}

		public String LPRETUDefault() {

			return "";

		}

		public String LPRETUComment() {

			return "";

		}

		public String LPRETUPattern() {

			return "";

		}

		public String LPRETUOriginalDbColumnName() {

			return "LPRETU";

		}

		public BigDecimal LPRMLT;

		public BigDecimal getLPRMLT() {
			return this.LPRMLT;
		}

		public Boolean LPRMLTIsNullable() {
			return true;
		}

		public Boolean LPRMLTIsKey() {
			return false;
		}

		public Integer LPRMLTLength() {
			return null;
		}

		public Integer LPRMLTPrecision() {
			return null;
		}

		public String LPRMLTDefault() {

			return "";

		}

		public String LPRMLTComment() {

			return "";

		}

		public String LPRMLTPattern() {

			return "";

		}

		public String LPRMLTOriginalDbColumnName() {

			return "LPRMLT";

		}

		public BigDecimal LPPOS;

		public BigDecimal getLPPOS() {
			return this.LPPOS;
		}

		public Boolean LPPOSIsNullable() {
			return true;
		}

		public Boolean LPPOSIsKey() {
			return false;
		}

		public Integer LPPOSLength() {
			return null;
		}

		public Integer LPPOSPrecision() {
			return null;
		}

		public String LPPOSDefault() {

			return "";

		}

		public String LPPOSComment() {

			return "";

		}

		public String LPPOSPattern() {

			return "";

		}

		public String LPPOSOriginalDbColumnName() {

			return "LPPOS";

		}

		public BigDecimal LPPOSU;

		public BigDecimal getLPPOSU() {
			return this.LPPOSU;
		}

		public Boolean LPPOSUIsNullable() {
			return true;
		}

		public Boolean LPPOSUIsKey() {
			return false;
		}

		public Integer LPPOSULength() {
			return null;
		}

		public Integer LPPOSUPrecision() {
			return null;
		}

		public String LPPOSUDefault() {

			return "";

		}

		public String LPPOSUComment() {

			return "";

		}

		public String LPPOSUPattern() {

			return "";

		}

		public String LPPOSUOriginalDbColumnName() {

			return "LPPOSU";

		}

		public BigDecimal LPPMLT;

		public BigDecimal getLPPMLT() {
			return this.LPPMLT;
		}

		public Boolean LPPMLTIsNullable() {
			return true;
		}

		public Boolean LPPMLTIsKey() {
			return false;
		}

		public Integer LPPMLTLength() {
			return null;
		}

		public Integer LPPMLTPrecision() {
			return null;
		}

		public String LPPMLTDefault() {

			return "";

		}

		public String LPPMLTComment() {

			return "";

		}

		public String LPPMLTPattern() {

			return "";

		}

		public String LPPMLTOriginalDbColumnName() {

			return "LPPMLT";

		}

		public BigDecimal LPORIG;

		public BigDecimal getLPORIG() {
			return this.LPORIG;
		}

		public Boolean LPORIGIsNullable() {
			return true;
		}

		public Boolean LPORIGIsKey() {
			return false;
		}

		public Integer LPORIGLength() {
			return null;
		}

		public Integer LPORIGPrecision() {
			return null;
		}

		public String LPORIGDefault() {

			return "";

		}

		public String LPORIGComment() {

			return "";

		}

		public String LPORIGPattern() {

			return "";

		}

		public String LPORIGOriginalDbColumnName() {

			return "LPORIG";

		}

		public BigDecimal LPORGU;

		public BigDecimal getLPORGU() {
			return this.LPORGU;
		}

		public Boolean LPORGUIsNullable() {
			return true;
		}

		public Boolean LPORGUIsKey() {
			return false;
		}

		public Integer LPORGULength() {
			return null;
		}

		public Integer LPORGUPrecision() {
			return null;
		}

		public String LPORGUDefault() {

			return "";

		}

		public String LPORGUComment() {

			return "";

		}

		public String LPORGUPattern() {

			return "";

		}

		public String LPORGUOriginalDbColumnName() {

			return "LPORGU";

		}

		public BigDecimal LPOMLT;

		public BigDecimal getLPOMLT() {
			return this.LPOMLT;
		}

		public Boolean LPOMLTIsNullable() {
			return true;
		}

		public Boolean LPOMLTIsKey() {
			return false;
		}

		public Integer LPOMLTLength() {
			return null;
		}

		public Integer LPOMLTPrecision() {
			return null;
		}

		public String LPOMLTDefault() {

			return "";

		}

		public String LPOMLTComment() {

			return "";

		}

		public String LPOMLTPattern() {

			return "";

		}

		public String LPOMLTOriginalDbColumnName() {

			return "LPOMLT";

		}

		public BigDecimal LPPPRE;

		public BigDecimal getLPPPRE() {
			return this.LPPPRE;
		}

		public Boolean LPPPREIsNullable() {
			return true;
		}

		public Boolean LPPPREIsKey() {
			return false;
		}

		public Integer LPPPRELength() {
			return null;
		}

		public Integer LPPPREPrecision() {
			return null;
		}

		public String LPPPREDefault() {

			return "";

		}

		public String LPPPREComment() {

			return "";

		}

		public String LPPPREPattern() {

			return "";

		}

		public String LPPPREOriginalDbColumnName() {

			return "LPPPRE";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_TTWALLCL1.length == 0) {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_TTWALLCL1 = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTWALLCL1, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_TTWALLCL1) {

				try {

					int length = 0;

					this.LPSKU = (BigDecimal) dis.readObject();

					this.LPLOC = (BigDecimal) dis.readObject();

					this.LPCUR = readString(dis);

					this.LPPTP = readString(dis);

					this.LPCENT = (BigDecimal) dis.readObject();

					this.LPDATE = (BigDecimal) dis.readObject();

					this.LPRETL = (BigDecimal) dis.readObject();

					this.LPRETU = (BigDecimal) dis.readObject();

					this.LPRMLT = (BigDecimal) dis.readObject();

					this.LPPOS = (BigDecimal) dis.readObject();

					this.LPPOSU = (BigDecimal) dis.readObject();

					this.LPPMLT = (BigDecimal) dis.readObject();

					this.LPORIG = (BigDecimal) dis.readObject();

					this.LPORGU = (BigDecimal) dis.readObject();

					this.LPOMLT = (BigDecimal) dis.readObject();

					this.LPPPRE = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.LPSKU);

				// BigDecimal

				dos.writeObject(this.LPLOC);

				// String

				writeString(this.LPCUR, dos);

				// String

				writeString(this.LPPTP, dos);

				// BigDecimal

				dos.writeObject(this.LPCENT);

				// BigDecimal

				dos.writeObject(this.LPDATE);

				// BigDecimal

				dos.writeObject(this.LPRETL);

				// BigDecimal

				dos.writeObject(this.LPRETU);

				// BigDecimal

				dos.writeObject(this.LPRMLT);

				// BigDecimal

				dos.writeObject(this.LPPOS);

				// BigDecimal

				dos.writeObject(this.LPPOSU);

				// BigDecimal

				dos.writeObject(this.LPPMLT);

				// BigDecimal

				dos.writeObject(this.LPORIG);

				// BigDecimal

				dos.writeObject(this.LPORGU);

				// BigDecimal

				dos.writeObject(this.LPOMLT);

				// BigDecimal

				dos.writeObject(this.LPPPRE);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("LPSKU=" + String.valueOf(LPSKU));
			sb.append(",LPLOC=" + String.valueOf(LPLOC));
			sb.append(",LPCUR=" + LPCUR);
			sb.append(",LPPTP=" + LPPTP);
			sb.append(",LPCENT=" + String.valueOf(LPCENT));
			sb.append(",LPDATE=" + String.valueOf(LPDATE));
			sb.append(",LPRETL=" + String.valueOf(LPRETL));
			sb.append(",LPRETU=" + String.valueOf(LPRETU));
			sb.append(",LPRMLT=" + String.valueOf(LPRMLT));
			sb.append(",LPPOS=" + String.valueOf(LPPOS));
			sb.append(",LPPOSU=" + String.valueOf(LPPOSU));
			sb.append(",LPPMLT=" + String.valueOf(LPPMLT));
			sb.append(",LPORIG=" + String.valueOf(LPORIG));
			sb.append(",LPORGU=" + String.valueOf(LPORGU));
			sb.append(",LPOMLT=" + String.valueOf(LPOMLT));
			sb.append(",LPPPRE=" + String.valueOf(LPPPRE));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (LPSKU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPSKU);
			}

			sb.append("|");

			if (LPLOC == null) {
				sb.append("<null>");
			} else {
				sb.append(LPLOC);
			}

			sb.append("|");

			if (LPCUR == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCUR);
			}

			sb.append("|");

			if (LPPTP == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPTP);
			}

			sb.append("|");

			if (LPCENT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPCENT);
			}

			sb.append("|");

			if (LPDATE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPDATE);
			}

			sb.append("|");

			if (LPRETL == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETL);
			}

			sb.append("|");

			if (LPRETU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRETU);
			}

			sb.append("|");

			if (LPRMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPRMLT);
			}

			sb.append("|");

			if (LPPOS == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOS);
			}

			sb.append("|");

			if (LPPOSU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPOSU);
			}

			sb.append("|");

			if (LPPMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPMLT);
			}

			sb.append("|");

			if (LPORIG == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORIG);
			}

			sb.append("|");

			if (LPORGU == null) {
				sb.append("<null>");
			} else {
				sb.append(LPORGU);
			}

			sb.append("|");

			if (LPOMLT == null) {
				sb.append("<null>");
			} else {
				sb.append(LPOMLT);
			}

			sb.append("|");

			if (LPPPRE == null) {
				sb.append("<null>");
			} else {
				sb.append(LPPPRE);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(row3Struct other) {

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

				row3Struct row3 = new row3Struct();
				PRCDTLStruct PRCDTL = new PRCDTLStruct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "PRCDTL");

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
						org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);

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

				props_tDBOutput_1.table.setValue("tableName", "PRCDTL");

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

						a("\"name\":\"PRCDTL\",\"fields\":[{", s);

						a("\"name\":\"LPSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPSKU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPLOC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPLOC\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPCUR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"LPCUR\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPPTP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"LPPTP\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPCENT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPCENT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPDATE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPDATE\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPRETL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPRETL\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPRETU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPRETU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPRMLT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPRMLT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPPOS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPPOS\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPPOSU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPPOSU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPPMLT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPPMLT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPORIG\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPORIG\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPORGU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"LPORGU\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPOMLT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPOMLT\",\"talend.field.default\":\"\"},{",
								s);

						a("\"name\":\"LPPPRE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":2,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"LPPPRE\",\"talend.field.default\":\"\"},{",
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
				 * [tMap_3 begin ] start
				 */

				ok_Hash.put("tMap_3", false);
				start_Hash.put("tMap_3", System.currentTimeMillis());

				currentComponent = "tMap_3";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row3");

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
				int count_row3_tMap_3 = 0;

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
				int count_PRCDTL_tMap_3 = 0;

				PRCDTLStruct PRCDTL_tmp = new PRCDTLStruct();
// ###############################

				/**
				 * [tMap_3 begin ] stop
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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/PRCDTL.zip\"");
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
									+ ", SCHEMA_COLUMN=" + ("LPSKU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPLOC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPCUR") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPPTP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPCENT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPDATE") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPRETL")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPRETU") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPRMLT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPPOS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPPOSU") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPPMLT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("LPORIG") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("LPORGU") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LPOMLT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LPPPRE") + "}]");
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

					Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/PRCDTL.zip";
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

							row3 = null;

							boolean whetherReject_tFileInputDelimited_1 = false;
							row3 = new row3Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_1 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_1 = 0;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPSKU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPSKU", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPSKU = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 1;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPLOC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPLOC", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPLOC = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 2;

								row3.LPCUR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 3;

								row3.LPPTP = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 4;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPCENT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPCENT", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPCENT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 5;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPDATE = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPDATE", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPDATE = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 6;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPRETL = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPRETL", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPRETL = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 7;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPRETU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPRETU", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPRETU = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 8;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPRMLT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPRMLT", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPRMLT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 9;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPPOS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPPOS", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPPOS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 10;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPPOSU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPPOSU", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPPOSU = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 11;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPPMLT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPPMLT", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPPMLT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 12;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPORIG = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPORIG", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPORIG = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 13;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPORGU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPORGU", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPORGU = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 14;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPOMLT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPOMLT", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPOMLT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 15;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row3.LPPPRE = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LPPPRE", "row3", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row3.LPPPRE = null;

								}

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
// Start of branch "row3"
							if (row3 != null) {

								/**
								 * [tMap_3 main ] start
								 */

								currentComponent = "tMap_3";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row3", "tFileInputDelimited_1", "tFileInputDelimited_1",
										"tFileInputDelimited", "tMap_3", "tMap_3", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row3 - " + (row3 == null ? "" : row3.toLogString()));
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

									PRCDTL = null;

// # Output table : 'PRCDTL'
									count_PRCDTL_tMap_3++;

									PRCDTL_tmp.LPSKU = row3.LPSKU;
									PRCDTL_tmp.LPLOC = row3.LPLOC;
									PRCDTL_tmp.LPCUR = row3.LPCUR;
									PRCDTL_tmp.LPPTP = row3.LPPTP;
									PRCDTL_tmp.LPCENT = row3.LPCENT;
									PRCDTL_tmp.LPDATE = row3.LPDATE;
									PRCDTL_tmp.LPRETL = row3.LPRETL;
									PRCDTL_tmp.LPRETU = row3.LPRETU;
									PRCDTL_tmp.LPRMLT = row3.LPRMLT;
									PRCDTL_tmp.LPPOS = row3.LPPOS;
									PRCDTL_tmp.LPPOSU = row3.LPPOSU;
									PRCDTL_tmp.LPPMLT = row3.LPPMLT;
									PRCDTL_tmp.LPORIG = row3.LPORIG;
									PRCDTL_tmp.LPORGU = row3.LPORGU;
									PRCDTL_tmp.LPOMLT = row3.LPOMLT;
									PRCDTL_tmp.LPPPRE = row3.LPPPRE;
									PRCDTL_tmp.LOAD_DATE = Var.var1;
									PRCDTL = PRCDTL_tmp;
									log.debug("tMap_3 - Outputting the record " + count_PRCDTL_tMap_3
											+ " of the output table 'PRCDTL'.");

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
// Start of branch "PRCDTL"
								if (PRCDTL != null) {

									/**
									 * [tDBOutput_1 main ] start
									 */

									currentComponent = "tDBOutput_1";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "PRCDTL", "tMap_3", "tMap_3", "tMap", "tDBOutput_1", "tDBOutput_1",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("PRCDTL - " + (PRCDTL == null ? "" : PRCDTL.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_1 != null) {
										incomingEnforcer_tDBOutput_1.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPSKU") != null) {
										incomingEnforcer_tDBOutput_1.put("LPSKU", PRCDTL.LPSKU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPLOC") != null) {
										incomingEnforcer_tDBOutput_1.put("LPLOC", PRCDTL.LPLOC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPCUR") != null) {
										incomingEnforcer_tDBOutput_1.put("LPCUR", PRCDTL.LPCUR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPPTP") != null) {
										incomingEnforcer_tDBOutput_1.put("LPPTP", PRCDTL.LPPTP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPCENT") != null) {
										incomingEnforcer_tDBOutput_1.put("LPCENT", PRCDTL.LPCENT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPDATE") != null) {
										incomingEnforcer_tDBOutput_1.put("LPDATE", PRCDTL.LPDATE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPRETL") != null) {
										incomingEnforcer_tDBOutput_1.put("LPRETL", PRCDTL.LPRETL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPRETU") != null) {
										incomingEnforcer_tDBOutput_1.put("LPRETU", PRCDTL.LPRETU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPRMLT") != null) {
										incomingEnforcer_tDBOutput_1.put("LPRMLT", PRCDTL.LPRMLT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPPOS") != null) {
										incomingEnforcer_tDBOutput_1.put("LPPOS", PRCDTL.LPPOS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPPOSU") != null) {
										incomingEnforcer_tDBOutput_1.put("LPPOSU", PRCDTL.LPPOSU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPPMLT") != null) {
										incomingEnforcer_tDBOutput_1.put("LPPMLT", PRCDTL.LPPMLT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPORIG") != null) {
										incomingEnforcer_tDBOutput_1.put("LPORIG", PRCDTL.LPORIG);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPORGU") != null) {
										incomingEnforcer_tDBOutput_1.put("LPORGU", PRCDTL.LPORGU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPOMLT") != null) {
										incomingEnforcer_tDBOutput_1.put("LPOMLT", PRCDTL.LPOMLT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LPPPRE") != null) {
										incomingEnforcer_tDBOutput_1.put("LPPPRE", PRCDTL.LPPPRE);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("LOAD_DATE") != null) {
										incomingEnforcer_tDBOutput_1.put("LOAD_DATE", PRCDTL.LOAD_DATE);
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

								} // End of branch "PRCDTL"

								/**
								 * [tMap_3 process_data_end ] start
								 */

								currentComponent = "tMap_3";

								/**
								 * [tMap_3 process_data_end ] stop
								 */

							} // End of branch "row3"

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
					if (!((Object) ("/data/talend/data_repository/PRCDTL.zip") instanceof java.io.InputStream)) {
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
				 * [tMap_3 end ] start
				 */

				currentComponent = "tMap_3";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'PRCDTL': " + count_PRCDTL_tMap_3 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row3", 2, 0,
						"tFileInputDelimited_1", "tFileInputDelimited_1", "tFileInputDelimited", "tMap_3", "tMap_3",
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "PRCDTL", 2, 0, "tMap_3",
						"tMap_3", "tMap", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_1", true);
				end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				/**
				 * [tDBOutput_1 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
			}

			tDBRow_3Process(globalMap);

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
				 * [tMap_3 finally ] start
				 */

				currentComponent = "tMap_3";

				/**
				 * [tMap_3 finally ] stop
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
						"\ninsert into PRICE_DETAIL_BY_LOC_SKU_PRCDTL \nselect \nLPSKU,\nLPLOC,\nLPCUR,\nLPPTP,\n    case\n        when LENGTH(L"
								+ "PDATE)= 5 then TO_DATE(CONCAT( '200', TO_VARCHAR(LPDATE)),'yyyymmdd')\n        when LENGTH(LPDATE)= 6 then  TO_DATE(CONC"
								+ "AT( '20', LPDATE), 'yyyymmdd')\n        else NULL\n    end as LPDATE,\nLPRETL,\nLPRETU,\nLPRMLT,\nLPPOS,\nLPPOSU,\nLPPML"
								+ "T,\nLPORIG,\nLPORGU,\nLPOMLT,\nLPPPRE,\nLOAD_DATE\nfrom PRCDTL\n\n");

				props_tDBRow_3.setValue("dieOnError", true);

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBRow_4Process(globalMap);

				/**
				 * [tDBRow_3 end ] stop
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

	public void tDBRow_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBRow_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_4");
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
				 * [tDBRow_4 begin ] start
				 */

				ok_Hash.put("tDBRow_4", false);
				start_Hash.put("tDBRow_4", System.currentTimeMillis());

				currentComponent = "tDBRow_4";

				int tos_count_tDBRow_4 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBRow_4", "tDBRow_4", "tSnowflakeRow");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBRow_4 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBRow_4 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBRow_4 = (String) (restRequest_tDBRow_4 != null
						? restRequest_tDBRow_4.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBRow_4 = new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBRow_4 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBRow_4 = null;

				org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_4 = (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_4
						.createRuntimeProperties();
				props_tDBRow_4.setValue("query", "\nDrop table PRCDTL\n\n");

				props_tDBRow_4.setValue("dieOnError", true);

				props_tDBRow_4.setValue("usePreparedStatement", false);

				props_tDBRow_4.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_4_1_fisrt {

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

				SchemaSettingTool_tDBRow_4_1_fisrt sst_tDBRow_4_1_fisrt = new SchemaSettingTool_tDBRow_4_1_fisrt();

				props_tDBRow_4.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_4_2_fisrt {

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

				SchemaSettingTool_tDBRow_4_2_fisrt sst_tDBRow_4_2_fisrt = new SchemaSettingTool_tDBRow_4_2_fisrt();

				props_tDBRow_4.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_2_fisrt.getSchemaValue()));

				props_tDBRow_4.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_4.connection.setValue("useCustomRegion", false);

				props_tDBRow_4.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_4.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_4.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_4.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_4.table.setValue("tableName", "");

				props_tDBRow_4.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_4.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_4.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_4.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_4.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_4.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_4_3_fisrt {

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

				SchemaSettingTool_tDBRow_4_3_fisrt sst_tDBRow_4_3_fisrt = new SchemaSettingTool_tDBRow_4_3_fisrt();

				props_tDBRow_4.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_3_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_4.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_4 = props_tDBRow_4.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_4 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_4 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_4 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_4.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_4);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_4.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBRow_4 = props_tDBRow_4.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBRow_4 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_4 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBRow_4 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBRow_4.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBRow_4);
					}
				}
				globalMap.put("tDBRow_4_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_4);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBRow_4 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBRow_4_MAPPINGS_URL", mappings_url_tDBRow_4);

				org.talend.components.api.container.RuntimeContainer container_tDBRow_4 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBRow_4";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBRow_4 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBRow_4 = null;
				topology_tDBRow_4 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_4 = def_tDBRow_4.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_4,
						topology_tDBRow_4);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_4 = def_tDBRow_4
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_4 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBRow_4.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBRow_4 = componentRuntime_tDBRow_4
						.initialize(container_tDBRow_4, props_tDBRow_4);

				if (initVr_tDBRow_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBRow_4.getMessage());
				}

				if (componentRuntime_tDBRow_4 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_4 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBRow_4;
					compDriverInitialization_tDBRow_4.runAtDriver(container_tDBRow_4);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_4 = null;
				if (componentRuntime_tDBRow_4 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBRow_4 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBRow_4;
					if (doesNodeBelongToRequest_tDBRow_4) {
						org.talend.daikon.properties.ValidationResult vr_tDBRow_4 = sourceOrSink_tDBRow_4
								.validate(container_tDBRow_4);
						if (vr_tDBRow_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBRow_4.getMessage());
						}
					}
				}

				/**
				 * [tDBRow_4 begin ] stop
				 */

				/**
				 * [tDBRow_4 main ] start
				 */

				currentComponent = "tDBRow_4";

				tos_count_tDBRow_4++;

				/**
				 * [tDBRow_4 main ] stop
				 */

				/**
				 * [tDBRow_4 process_data_begin ] start
				 */

				currentComponent = "tDBRow_4";

				/**
				 * [tDBRow_4 process_data_begin ] stop
				 */

				/**
				 * [tDBRow_4 process_data_end ] start
				 */

				currentComponent = "tDBRow_4";

				/**
				 * [tDBRow_4 process_data_end ] stop
				 */

				/**
				 * [tDBRow_4 end ] start
				 */

				currentComponent = "tDBRow_4";

// end of generic

				resourceMap.put("finish_tDBRow_4", Boolean.TRUE);

				ok_Hash.put("tDBRow_4", true);
				end_Hash.put("tDBRow_4", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk14", 0, "ok");
				}
				tFileDelete_3Process(globalMap);

				/**
				 * [tDBRow_4 end ] stop
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
				 * [tDBRow_4 finally ] start
				 */

				currentComponent = "tDBRow_4";

// finally of generic

				if (resourceMap.get("finish_tDBRow_4") == null) {
				}

				/**
				 * [tDBRow_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBRow_4_SUBPROCESS_STATE", 1);
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/PRCDTL.zip\"");
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
				java.io.File path_tFileDelete_3 = new java.io.File("/data/talend/data_repository/PRCDTL.zip");
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
				globalMap.put("tFileDelete_3_DELETE_PATH", "/data/talend/data_repository/PRCDTL.zip");

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

				int tos_count_tDBConnection_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "tDBConnection_1", "tSnowflakeConnection");
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

				props_tDBConnection_1.setValue("warehouse", "vsi_wh_xs");

				props_tDBConnection_1.setValue("db", "PROD_DATA");

				props_tDBConnection_1.setValue("schemaName", "INVENTORY");

				props_tDBConnection_1.setValue("role", "sysadmin");

				props_tDBConnection_1.setValue("jdbcParameters", "");

				props_tDBConnection_1.setValue("autoCommit", true);

				props_tDBConnection_1.userPassword.setValue("useAuth", false);

				props_tDBConnection_1.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_1.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:38yV1h2vN/s9GnbRspsDAXPzuSqIkee0F/yOwNQWimIJX5Rh"));

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

				tos_count_tDBConnection_1++;

				/**
				 * [tDBConnection_1 main ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_1 process_data_end ] start
				 */

				currentComponent = "tDBConnection_1";

				/**
				 * [tDBConnection_1 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_1 end ] start
				 */

				currentComponent = "tDBConnection_1";

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
		final TTWALLCL1 TTWALLCL1Class = new TTWALLCL1();

		int exitCode = TTWALLCL1Class.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'TTWALLCL1' - Done.");
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
		log.info("TalendJob: 'TTWALLCL1' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_Tpe3oAWAEeqgh6rCafRRhA");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-20T12:56:45.305222400Z");

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
			java.io.InputStream inContext = TTWALLCL1.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/ttwallcl1_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = TTWALLCL1.class.getClassLoader()
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
		log.info("TalendJob: 'TTWALLCL1' - Started.");
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
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TTWALLCL1");
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
		log.info("TalendJob: 'TTWALLCL1' - Finished - status: " + status + " returnCode: " + returnCode);

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
 * 1062464 characters generated by Talend Cloud Data Management Platform on the
 * June 20, 2023 at 8:56:45 AM EDT
 ************************************************************************************************/