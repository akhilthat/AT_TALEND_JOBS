
package at_talend_jobs.copy_of_tsa_load_aws_0_1;

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
 * Job: Copy_of_tSA_load_AWS Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class Copy_of_tSA_load_AWS implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "Copy_of_tSA_load_AWS.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(Copy_of_tSA_load_AWS.class);

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

			if (From != null) {

				this.setProperty("From", From.toString());

			}

			if (To != null) {

				this.setProperty("To", To.toString());

			}

			if (Cc != null) {

				this.setProperty("Cc", Cc.toString());

			}

			if (sa_database != null) {

				this.setProperty("sa_database", sa_database.toString());

			}

			if (sa_host != null) {

				this.setProperty("sa_host", sa_host.toString());

			}

			if (sa_password != null) {

				this.setProperty("sa_password", sa_password.toString());

			}

			if (sa_port != null) {

				this.setProperty("sa_port", sa_port.toString());

			}

			if (sa_schema != null) {

				this.setProperty("sa_schema", sa_schema.toString());

			}

			if (sa_user_id != null) {

				this.setProperty("sa_user_id", sa_user_id.toString());

			}

			if (SF_account != null) {

				this.setProperty("SF_account", SF_account.toString());

			}

			if (SF_fin_schema != null) {

				this.setProperty("SF_fin_schema", SF_fin_schema.toString());

			}

			if (SF_password != null) {

				this.setProperty("SF_password", SF_password.toString());

			}

			if (SF_prod_database != null) {

				this.setProperty("SF_prod_database", SF_prod_database.toString());

			}

			if (SF_user_id != null) {

				this.setProperty("SF_user_id", SF_user_id.toString());

			}

			if (SF_warehouse != null) {

				this.setProperty("SF_warehouse", SF_warehouse.toString());

			}

			if (vsdata_database != null) {

				this.setProperty("vsdata_database", vsdata_database.toString());

			}

			if (vsdata_host != null) {

				this.setProperty("vsdata_host", vsdata_host.toString());

			}

			if (vsdata_password != null) {

				this.setProperty("vsdata_password", vsdata_password.toString());

			}

			if (vsdata_port != null) {

				this.setProperty("vsdata_port", vsdata_port.toString());

			}

			if (vsdata_schema != null) {

				this.setProperty("vsdata_schema", vsdata_schema.toString());

			}

			if (vsdata_user_id != null) {

				this.setProperty("vsdata_user_id", vsdata_user_id.toString());

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

		public String From;

		public String getFrom() {
			return this.From;
		}

		public String To;

		public String getTo() {
			return this.To;
		}

		public String Cc;

		public String getCc() {
			return this.Cc;
		}

		public String sa_database;

		public String getSa_database() {
			return this.sa_database;
		}

		public String sa_host;

		public String getSa_host() {
			return this.sa_host;
		}

		public java.lang.String sa_password;

		public java.lang.String getSa_password() {
			return this.sa_password;
		}

		public String sa_port;

		public String getSa_port() {
			return this.sa_port;
		}

		public String sa_schema;

		public String getSa_schema() {
			return this.sa_schema;
		}

		public String sa_user_id;

		public String getSa_user_id() {
			return this.sa_user_id;
		}

		public String SF_account;

		public String getSF_account() {
			return this.SF_account;
		}

		public String SF_fin_schema;

		public String getSF_fin_schema() {
			return this.SF_fin_schema;
		}

		public java.lang.String SF_password;

		public java.lang.String getSF_password() {
			return this.SF_password;
		}

		public String SF_prod_database;

		public String getSF_prod_database() {
			return this.SF_prod_database;
		}

		public String SF_user_id;

		public String getSF_user_id() {
			return this.SF_user_id;
		}

		public String SF_warehouse;

		public String getSF_warehouse() {
			return this.SF_warehouse;
		}

		public String vsdata_database;

		public String getVsdata_database() {
			return this.vsdata_database;
		}

		public String vsdata_host;

		public String getVsdata_host() {
			return this.vsdata_host;
		}

		public java.lang.String vsdata_password;

		public java.lang.String getVsdata_password() {
			return this.vsdata_password;
		}

		public String vsdata_port;

		public String getVsdata_port() {
			return this.vsdata_port;
		}

		public String vsdata_schema;

		public String getVsdata_schema() {
			return this.vsdata_schema;
		}

		public String vsdata_user_id;

		public String getVsdata_user_id() {
			return this.vsdata_user_id;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "Copy_of_tSA_load_AWS";
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
			"_AwrjMAxWEe6WaNrWmUUUzw", "0.1");
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

	LogCatcherUtils tLogCatcher_1 = new LogCatcherUtils();

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
					Copy_of_tSA_load_AWS.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(Copy_of_tSA_load_AWS.this, new Object[] { e, currentComponent, globalMap });
							break;
						}
					}

					if (!(e instanceof TDieException)) {
						if (enableLogStash) {
							talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
							talendJobLogProcess(globalMap);
						}
						tLogCatcher_1.addMessage("Java Exception", currentComponent, 6,
								e.getClass().getName() + ":" + e.getMessage(), 1);
						tLogCatcher_1Process(globalMap);
					}
				} catch (TalendException e) {
					// do nothing

				} catch (Exception e) {
					this.e.printStackTrace();
				}
			}
		}
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

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDie_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogCatcher_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBClose_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		((java.util.Map) threadLocal.get()).put("status", "failure");

		tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "ERROR", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

		try {

			if (this.execStat) {
				runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
			}

			((java.util.Map) threadLocal.get()).put("errorCode", null);
			tDie_1Process(globalMap);
			if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
				((java.util.Map) threadLocal.get()).put("status", "end");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tDie_1_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent,
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

	public void tDBClose_2_onSubJobError(Exception exception, String errorComponent,
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
						"\nDelete from SALES_REPORTING_DETAIL where TRANSACTION_DATE >= dateadd(week, -2, CURRENT_DATE());\n  \n");

				props_tDBRow_1.setValue("dieOnError", true);

				props_tDBRow_1.setValue("usePreparedStatement", false);

				props_tDBRow_1.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_1_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"Record\",\"fields\":[]}", s);

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

				props_tDBRow_1.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_1.table.setValue("tableName", "");

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

						a("\"name\":\"Record\",\"fields\":[]}", s);

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
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBInput_1Process(globalMap);

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

	public static class row13Struct implements routines.system.IPersistableRow<row13Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];

		public java.util.Date TRANSACTION_DATE;

		public java.util.Date getTRANSACTION_DATE() {
			return this.TRANSACTION_DATE;
		}

		public Boolean TRANSACTION_DATEIsNullable() {
			return false;
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
			return false;
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

		public String CATEGORY;

		public String getCATEGORY() {
			return this.CATEGORY;
		}

		public Boolean CATEGORYIsNullable() {
			return false;
		}

		public Boolean CATEGORYIsKey() {
			return false;
		}

		public Integer CATEGORYLength() {
			return null;
		}

		public Integer CATEGORYPrecision() {
			return null;
		}

		public String CATEGORYDefault() {

			return null;

		}

		public String CATEGORYComment() {

			return "";

		}

		public String CATEGORYPattern() {

			return "";

		}

		public String CATEGORYOriginalDbColumnName() {

			return "CATEGORY";

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

		public BigDecimal SKU_ID;

		public BigDecimal getSKU_ID() {
			return this.SKU_ID;
		}

		public Boolean SKU_IDIsNullable() {
			return true;
		}

		public Boolean SKU_IDIsKey() {
			return false;
		}

		public Integer SKU_IDLength() {
			return null;
		}

		public Integer SKU_IDPrecision() {
			return null;
		}

		public String SKU_IDDefault() {

			return "";

		}

		public String SKU_IDComment() {

			return "";

		}

		public String SKU_IDPattern() {

			return "";

		}

		public String SKU_IDOriginalDbColumnName() {

			return "SKU_ID";

		}

		public BigDecimal GROSS_AMOUNT;

		public BigDecimal getGROSS_AMOUNT() {
			return this.GROSS_AMOUNT;
		}

		public Boolean GROSS_AMOUNTIsNullable() {
			return true;
		}

		public Boolean GROSS_AMOUNTIsKey() {
			return false;
		}

		public Integer GROSS_AMOUNTLength() {
			return null;
		}

		public Integer GROSS_AMOUNTPrecision() {
			return null;
		}

		public String GROSS_AMOUNTDefault() {

			return "";

		}

		public String GROSS_AMOUNTComment() {

			return "";

		}

		public String GROSS_AMOUNTPattern() {

			return "";

		}

		public String GROSS_AMOUNTOriginalDbColumnName() {

			return "GROSS_AMOUNT";

		}

		public BigDecimal DISCOUNT_AMOUNT;

		public BigDecimal getDISCOUNT_AMOUNT() {
			return this.DISCOUNT_AMOUNT;
		}

		public Boolean DISCOUNT_AMOUNTIsNullable() {
			return true;
		}

		public Boolean DISCOUNT_AMOUNTIsKey() {
			return false;
		}

		public Integer DISCOUNT_AMOUNTLength() {
			return null;
		}

		public Integer DISCOUNT_AMOUNTPrecision() {
			return null;
		}

		public String DISCOUNT_AMOUNTDefault() {

			return "";

		}

		public String DISCOUNT_AMOUNTComment() {

			return "";

		}

		public String DISCOUNT_AMOUNTPattern() {

			return "";

		}

		public String DISCOUNT_AMOUNTOriginalDbColumnName() {

			return "DISCOUNT_AMOUNT";

		}

		public BigDecimal NET_AMOUNT;

		public BigDecimal getNET_AMOUNT() {
			return this.NET_AMOUNT;
		}

		public Boolean NET_AMOUNTIsNullable() {
			return true;
		}

		public Boolean NET_AMOUNTIsKey() {
			return false;
		}

		public Integer NET_AMOUNTLength() {
			return null;
		}

		public Integer NET_AMOUNTPrecision() {
			return null;
		}

		public String NET_AMOUNTDefault() {

			return "";

		}

		public String NET_AMOUNTComment() {

			return "";

		}

		public String NET_AMOUNTPattern() {

			return "";

		}

		public String NET_AMOUNTOriginalDbColumnName() {

			return "NET_AMOUNT";

		}

		public BigDecimal UNITS;

		public BigDecimal getUNITS() {
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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.CATEGORY = readString(dis);

					this.REGISTER_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_ID = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.GROSS_AMOUNT = (BigDecimal) dis.readObject();

					this.DISCOUNT_AMOUNT = (BigDecimal) dis.readObject();

					this.NET_AMOUNT = (BigDecimal) dis.readObject();

					this.UNITS = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.CATEGORY = readString(dis);

					this.REGISTER_NO = (BigDecimal) dis.readObject();

					this.TRANSACTION_ID = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.GROSS_AMOUNT = (BigDecimal) dis.readObject();

					this.DISCOUNT_AMOUNT = (BigDecimal) dis.readObject();

					this.NET_AMOUNT = (BigDecimal) dis.readObject();

					this.UNITS = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.TRANSACTION_DATE, dos);

				// BigDecimal

				dos.writeObject(this.STORE_NO);

				// String

				writeString(this.CATEGORY, dos);

				// BigDecimal

				dos.writeObject(this.REGISTER_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_ID);

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.GROSS_AMOUNT);

				// BigDecimal

				dos.writeObject(this.DISCOUNT_AMOUNT);

				// BigDecimal

				dos.writeObject(this.NET_AMOUNT);

				// BigDecimal

				dos.writeObject(this.UNITS);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.TRANSACTION_DATE, dos);

				// BigDecimal

				dos.writeObject(this.STORE_NO);

				// String

				writeString(this.CATEGORY, dos);

				// BigDecimal

				dos.writeObject(this.REGISTER_NO);

				// BigDecimal

				dos.writeObject(this.TRANSACTION_ID);

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.GROSS_AMOUNT);

				// BigDecimal

				dos.writeObject(this.DISCOUNT_AMOUNT);

				// BigDecimal

				dos.writeObject(this.NET_AMOUNT);

				// BigDecimal

				dos.writeObject(this.UNITS);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("TRANSACTION_DATE=" + String.valueOf(TRANSACTION_DATE));
			sb.append(",STORE_NO=" + String.valueOf(STORE_NO));
			sb.append(",CATEGORY=" + CATEGORY);
			sb.append(",REGISTER_NO=" + String.valueOf(REGISTER_NO));
			sb.append(",TRANSACTION_ID=" + String.valueOf(TRANSACTION_ID));
			sb.append(",SKU_ID=" + String.valueOf(SKU_ID));
			sb.append(",GROSS_AMOUNT=" + String.valueOf(GROSS_AMOUNT));
			sb.append(",DISCOUNT_AMOUNT=" + String.valueOf(DISCOUNT_AMOUNT));
			sb.append(",NET_AMOUNT=" + String.valueOf(NET_AMOUNT));
			sb.append(",UNITS=" + String.valueOf(UNITS));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

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

			if (CATEGORY == null) {
				sb.append("<null>");
			} else {
				sb.append(CATEGORY);
			}

			sb.append("|");

			if (REGISTER_NO == null) {
				sb.append("<null>");
			} else {
				sb.append(REGISTER_NO);
			}

			sb.append("|");

			if (TRANSACTION_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(TRANSACTION_ID);
			}

			sb.append("|");

			if (SKU_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(SKU_ID);
			}

			sb.append("|");

			if (GROSS_AMOUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(GROSS_AMOUNT);
			}

			sb.append("|");

			if (DISCOUNT_AMOUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(DISCOUNT_AMOUNT);
			}

			sb.append("|");

			if (NET_AMOUNT == null) {
				sb.append("<null>");
			} else {
				sb.append(NET_AMOUNT);
			}

			sb.append("|");

			if (UNITS == null) {
				sb.append("<null>");
			} else {
				sb.append(UNITS);
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

				row13Struct row13 = new row13Struct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row13");

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

				props_tDBOutput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_1.table.setValue("tableName", "SALES_REPORTING_DETAIL");

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

						a("\"name\":\"tDBOutput_1\",\"fields\":[{", s);

						a("\"name\":\"TRANSACTION_DATE\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_DATE\",\"talend.field.dbColumnName\":\"TRANSACTION_DATE\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"TRANSACTION_DATE\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"STORE_NO\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"STORE_NO\",\"talend.field.dbColumnName\":\"STORE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"STORE_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CATEGORY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CATEGORY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CATEGORY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CATEGORY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"REGISTER_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REGISTER_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REGISTER_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REGISTER_NO\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TRANSACTION_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRANSACTION_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRANSACTION_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SKU_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SKU_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SKU_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SKU_ID\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"GROSS_AMOUNT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"GROSS_AMOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"GROSS_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"GROSS_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DISCOUNT_AMOUNT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISCOUNT_AMOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DISCOUNT_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISCOUNT_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"NET_AMOUNT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NET_AMOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NET_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NET_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"UNITS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UNITS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"UNITS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UNITS\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",
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
							log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_2");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"RetCatData\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"  DECLARE @StartDate SMALLDATETIME,  		@EndDate SMALLDATETIME  SELECT  @StartDate = dateadd(week, -3,  cast(convert(varchar, getdate(), 23) as smalldatetime))  SELECT  @EndDate = dateadd(Day, -1,  cast(convert(varchar, getdate(), 23) as smalldatetime));    	 SELECT         'transaction_date' =  h.transaction_date,       'store_no' = CASE WHEN line_action not in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no else h.store_no end,         'category' = CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END,  	 'register_no' = h.register_no,   	 'transaction_id'=  h.transaction_id,  	 'sku_id' = J.INUMBR,  	 'gross_amount' = SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end),       'discount_amount' = SUM(case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end),       'net_amount' = SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end - case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end),       'units' = SUM(case when line_action in('1','201','90','142')  then d.units when line_action ='2' then -d.units end)        FROM	aw_vs_01.dbo.transaction_header h   	  INNER JOIN aw_vs_01.dbo.transaction_line l ON h.transaction_id = l.transaction_id  	  INNER JOIN aw_vs_01.dbo.merchandise_detail d on l.transaction_id = d.transaction_id and l.line_id=d.line_id  	  INNER JOIN aw_vs_01.dbo.store_sa sa ON h.store_no = sa.store_no  	  INNER JOIN aw_vs_01.dbo.district_sa di ON sa.district_code = di.district_code  	  LEFT OUTER JOIN vsdata.dbo.INVMST J ON d.style_reference_id=J.INUMBR  			WHERE h.transaction_date between @StartDate and @EndDate  			AND l.line_object_type = '1' AND l.line_action in('1','2','201','90','142','99')  -- Including Returns  			AND h.transaction_void_flag = 0 AND h.sa_rejection_flag = 0 AND l.line_void_flag = 0  			AND l.line_action <> CASE WHEN l.line_action = '142' AND l.line_object in ('183','184','185','186','187','188') then 142 else l.line_object end   			AND d.style_reference_id NOT IN(1673961, 1675735, 1688357, 1675776, 1687870)  			group by h.transaction_date, CASE WHEN line_action not in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no else h.store_no end,  			CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END, h.register_no, h.transaction_id, J.INUMBR        union all            SELECT    	  'transaction_date' = h.transaction_date,  	  'store_no' = CASE WHEN line_action not in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no else h.store_no end,   	  'category' = CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END,        'register_no' = h.register_no,   	  'transaction_id'= h.av_transaction_id,  	  'sku_id' = J.INUMBR,        'gross_amount' =  SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end), -- Including Returns        'discount_amount' = SUM(case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end), -- Including Returns        'net_amount' = SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end - case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end), -- Including Returns        'Units' = SUM(case when line_action in('1','201','90','142') then d.units when line_action ='2' then -d.units end)        FROM	aw_vs_01.dbo.av_transaction_header h   	  INNER JOIN aw_vs_01.dbo.av_transaction_line l ON h.av_transaction_id = l.av_transaction_id  			INNER JOIN aw_vs_01.dbo.av_merchandise_detail d on l.av_transaction_id = d.av_transaction_id and l.line_id=d.line_id  			INNER JOIN aw_vs_01.dbo.store_sa sa ON h.store_no = sa.store_no  			INNER JOIN aw_vs_01.dbo.district_sa di ON sa.district_code = di.district_code  			LEFT OUTER JOIN vsdata.dbo.INVMST J ON d.style_reference_id=J.INUMBR  			WHERE h.transaction_date between @StartDate and @EndDate  			AND l.line_object_type = '1' AND l.line_action in('1','2','201','90','142','99')  -- Including Returns  			AND h.transaction_void_flag = 0 AND h.sa_rejection_flag = 0 AND l.line_void_flag = 0  			AND d.style_reference_id NOT IN(1673961, 1675735, 1688357, 1675776, 1687870)  			AND l.line_action <> CASE WHEN l.line_action = '142' AND l.line_object in ('183','184','185','186','187','188') then 142 else l.line_object end   			group by h.transaction_date, CASE WHEN line_action not in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no else h.store_no end,  			CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END, h.register_no, h.av_transaction_id, J.INUMBR  \"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("TRANSACTION_DATE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("STORE_NO") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CATEGORY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("REGISTER_NO")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TRANSACTION_ID") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("SKU_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("GROSS_AMOUNT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("DISCOUNT_AMOUNT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("NET_AMOUNT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("UNITS") + "}]");
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
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_2");

				if (conn_tDBInput_1 != null) {
					if (conn_tDBInput_1.getMetaData() != null) {

						log.debug("tDBInput_1 - Uses an existing connection with username '"
								+ conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_1.getMetaData().getURL() + ".");

					}
				}

				String dbschema_tDBInput_1 = (String) globalMap.get("dbschema_tDBConnection_2");

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "\nDECLARE @StartDate SMALLDATETIME,\n		@EndDate SMALLDATETIME\nSELECT  @StartDate = dateadd(week, -3,  cast(convert(var"
						+ "char, getdate(), 23) as smalldatetime))\nSELECT  @EndDate = dateadd(Day, -1,  cast(convert(varchar, getdate(), 23) as sm"
						+ "alldatetime));\n\n	 SELECT  \n     'transaction_date' =  h.transaction_date,\n     'store_no' = CASE WHEN line_action no"
						+ "t in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.origina"
						+ "ting_store_no else h.store_no end,  \n     'category' = CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END,\n	 'regist"
						+ "er_no' = h.register_no, \n	 'transaction_id'=  h.transaction_id,\n	 'sku_id' = J.INUMBR,\n	 'gross_amount' = SUM(case wh"
						+ "en line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end),\n     'discount_amount' = SUM(case whe"
						+ "n line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end),\n     'net_amount' = SUM(case when "
						+ "line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end - case when line_action in (2,99) then -l.p"
						+ "os_discount_amount else l.pos_discount_amount end),\n     'units' = SUM(case when line_action in('1','201','90','142')  "
						+ "then d.units when line_action ='2' then -d.units end)\n      FROM	aw_vs_01.dbo.transaction_header h \n	  INNER JOIN aw_v"
						+ "s_01.dbo.transaction_line l ON h.transaction_id = l.transaction_id\n	  INNER JOIN aw_vs_01.dbo.merchandise_detail d on l"
						+ ".transaction_id = d.transaction_id and l.line_id=d.line_id\n	  INNER JOIN aw_vs_01.dbo.store_sa sa ON h.store_no = sa.st"
						+ "ore_no\n	  INNER JOIN aw_vs_01.dbo.district_sa di ON sa.district_code = di.district_code\n	  LEFT OUTER JOIN vsdata.dbo."
						+ "INVMST J ON d.style_reference_id=J.INUMBR\n			WHERE h.transaction_date between @StartDate and @EndDate\n			AND l.line_ob"
						+ "ject_type = '1' AND l.line_action in('1','2','201','90','142','99')  -- Including Returns\n			AND h.transaction_void_fla"
						+ "g = 0 AND h.sa_rejection_flag = 0 AND l.line_void_flag = 0\n			AND l.line_action <> CASE WHEN l.line_action = '142' AND "
						+ "l.line_object in ('183','184','185','186','187','188') then 142 else l.line_object end \n			AND d.style_reference_id NOT"
						+ " IN(1673961, 1675735, 1688357, 1675776, 1687870)\n			group by h.transaction_date, CASE WHEN line_action not in ('90','14"
						+ "2') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no "
						+ "else h.store_no end,\n			CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END, h.register_no, h.transaction_id, J.INUMBR"
						+ "\n  \n  union all \n\n       SELECT  \n	  'transaction_date' = h.transaction_date,\n	  'store_no' = CASE WHEN line_actio"
						+ "n not in ('90','142') then h.store_no when line_action in ('90','142') and d.originating_store_no is not null then d.ori"
						+ "ginating_store_no else h.store_no end, \n	  'category' = CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END,\n      'r"
						+ "egister_no' = h.register_no, \n	  'transaction_id'= h.av_transaction_id,\n	  'sku_id' = J.INUMBR,\n      'gross_amount' "
						+ "=  SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_line_amount end), -- Including Returns\n  "
						+ "    'discount_amount' = SUM(case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end),"
						+ " -- Including Returns\n      'net_amount' = SUM(case when line_action in (2,99) then -l.gross_line_amount else l.gross_l"
						+ "ine_amount end - case when line_action in (2,99) then -l.pos_discount_amount else l.pos_discount_amount end), -- Includi"
						+ "ng Returns\n      'Units' = SUM(case when line_action in('1','201','90','142') then d.units when line_action ='2' then -"
						+ "d.units end)\n      FROM	aw_vs_01.dbo.av_transaction_header h \n	  INNER JOIN aw_vs_01.dbo.av_transaction_line l ON h.av"
						+ "_transaction_id = l.av_transaction_id\n			INNER JOIN aw_vs_01.dbo.av_merchandise_detail d on l.av_transaction_id = d.av_"
						+ "transaction_id and l.line_id=d.line_id\n			INNER JOIN aw_vs_01.dbo.store_sa sa ON h.store_no = sa.store_no\n			INNER JOI"
						+ "N aw_vs_01.dbo.district_sa di ON sa.district_code = di.district_code\n			LEFT OUTER JOIN vsdata.dbo.INVMST J ON d.style_"
						+ "reference_id=J.INUMBR\n			WHERE h.transaction_date between @StartDate and @EndDate\n			AND l.line_object_type = '1' AND "
						+ "l.line_action in('1','2','201','90','142','99')  -- Including Returns\n			AND h.transaction_void_flag = 0 AND h.sa_rejec"
						+ "tion_flag = 0 AND l.line_void_flag = 0\n			AND d.style_reference_id NOT IN(1673961, 1675735, 1688357, 1675776, 1687870)"
						+ "\n			AND l.line_action <> CASE WHEN l.line_action = '142' AND l.line_object in ('183','184','185','186','187','188') then"
						+ " 142 else l.line_object end \n			group by h.transaction_date, CASE WHEN line_action not in ('90','142') then h.store_no "
						+ "when line_action in ('90','142') and d.originating_store_no is not null then d.originating_store_no else h.store_no end,"
						+ "\n			CASE WHEN J.IATRB2 = 'VS' THEN 'VS' ELSE 'NONVS' END, h.register_no, h.av_transaction_id, J.INUMBR\n";

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
							row13.TRANSACTION_DATE = null;
						} else {

							row13.TRANSACTION_DATE = mssqlGTU_tDBInput_1.getDate(rsmd_tDBInput_1, rs_tDBInput_1, 1);

						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row13.STORE_NO = null;
						} else {

							row13.STORE_NO = rs_tDBInput_1.getBigDecimal(2);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row13.CATEGORY = null;
						} else {

							tmpContent_tDBInput_1 = rs_tDBInput_1.getString(3);
							if (tmpContent_tDBInput_1 != null) {
								if (talendToDBList_tDBInput_1.contains(
										rsmd_tDBInput_1.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
									row13.CATEGORY = FormatterUtils.formatUnwithE(tmpContent_tDBInput_1);
								} else {
									row13.CATEGORY = tmpContent_tDBInput_1;
								}
							} else {
								row13.CATEGORY = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row13.REGISTER_NO = null;
						} else {

							row13.REGISTER_NO = rs_tDBInput_1.getBigDecimal(4);
							if (rs_tDBInput_1.wasNull()) {
								row13.REGISTER_NO = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row13.TRANSACTION_ID = null;
						} else {

							row13.TRANSACTION_ID = rs_tDBInput_1.getBigDecimal(5);
							if (rs_tDBInput_1.wasNull()) {
								row13.TRANSACTION_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row13.SKU_ID = null;
						} else {

							row13.SKU_ID = rs_tDBInput_1.getBigDecimal(6);
							if (rs_tDBInput_1.wasNull()) {
								row13.SKU_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row13.GROSS_AMOUNT = null;
						} else {

							row13.GROSS_AMOUNT = rs_tDBInput_1.getBigDecimal(7);
							if (rs_tDBInput_1.wasNull()) {
								row13.GROSS_AMOUNT = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row13.DISCOUNT_AMOUNT = null;
						} else {

							row13.DISCOUNT_AMOUNT = rs_tDBInput_1.getBigDecimal(8);
							if (rs_tDBInput_1.wasNull()) {
								row13.DISCOUNT_AMOUNT = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row13.NET_AMOUNT = null;
						} else {

							row13.NET_AMOUNT = rs_tDBInput_1.getBigDecimal(9);
							if (rs_tDBInput_1.wasNull()) {
								row13.NET_AMOUNT = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row13.UNITS = null;
						} else {

							row13.UNITS = rs_tDBInput_1.getBigDecimal(10);
							if (rs_tDBInput_1.wasNull()) {
								row13.UNITS = null;
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
						 * [tDBOutput_1 main ] start
						 */

						currentComponent = "tDBOutput_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row13", "tDBInput_1", "tDBInput_1", "tMSSqlInput", "tDBOutput_1", "tDBOutput_1",
								"tSnowflakeOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row13 - " + (row13 == null ? "" : row13.toLogString()));
						}

						if (incomingEnforcer_tDBOutput_1 != null) {
							incomingEnforcer_tDBOutput_1.createNewRecord();
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("TRANSACTION_DATE") != null) {
							incomingEnforcer_tDBOutput_1.put("TRANSACTION_DATE", row13.TRANSACTION_DATE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("STORE_NO") != null) {
							incomingEnforcer_tDBOutput_1.put("STORE_NO", row13.STORE_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CATEGORY") != null) {
							incomingEnforcer_tDBOutput_1.put("CATEGORY", row13.CATEGORY);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGISTER_NO") != null) {
							incomingEnforcer_tDBOutput_1.put("REGISTER_NO", row13.REGISTER_NO);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRANSACTION_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("TRANSACTION_ID", row13.TRANSACTION_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SKU_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("SKU_ID", row13.SKU_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("GROSS_AMOUNT") != null) {
							incomingEnforcer_tDBOutput_1.put("GROSS_AMOUNT", row13.GROSS_AMOUNT);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("DISCOUNT_AMOUNT") != null) {
							incomingEnforcer_tDBOutput_1.put("DISCOUNT_AMOUNT", row13.DISCOUNT_AMOUNT);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NET_AMOUNT") != null) {
							incomingEnforcer_tDBOutput_1.put("NET_AMOUNT", row13.NET_AMOUNT);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UNITS") != null) {
							incomingEnforcer_tDBOutput_1.put("UNITS", row13.UNITS);
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row13", 2, 0,
						"tDBInput_1", "tDBInput_1", "tMSSqlInput", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tDBOutput_1", true);
				end_Hash.put("tDBOutput_1", System.currentTimeMillis());

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
				 * [tDBInput_1 finally ] start
				 */

				currentComponent = "tDBInput_1";

				/**
				 * [tDBInput_1 finally ] stop
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

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}

	public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDie_1");
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
				 * [tDie_1 begin ] start
				 */

				ok_Hash.put("tDie_1", false);
				start_Hash.put("tDie_1", System.currentTimeMillis());

				currentComponent = "tDie_1";

				int tos_count_tDie_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDie_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDie_1 = new StringBuilder();
							log4jParamters_tDie_1.append("Parameters:");
							log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"the end is near\"");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("CODE" + " = " + "4");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
							log4jParamters_tDie_1.append(" | ");
							log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
							log4jParamters_tDie_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDie_1 - " + (log4jParamters_tDie_1));
						}
					}
					new BytesLimit65535_tDie_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDie_1 begin ] stop
				 */

				/**
				 * [tDie_1 main ] start
				 */

				currentComponent = "tDie_1";

				try {
					tLogCatcher_1.addMessage("tDie", "tDie_1", 5, "the end is near", 4);
					tLogCatcher_1Process(globalMap);

					globalMap.put("tDie_1_DIE_PRIORITY", 5);
					System.err.println("the end is near");

					log.error("tDie_1 - The die message: " + "the end is near");

					globalMap.put("tDie_1_DIE_MESSAGE", "the end is near");
					globalMap.put("tDie_1_DIE_MESSAGES", "the end is near");

				} catch (Exception | Error e_tDie_1) {
					globalMap.put("tDie_1_ERROR_MESSAGE", e_tDie_1.getMessage());
					logIgnoredError(
							String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1),
							e_tDie_1);
				}

				currentComponent = "tDie_1";
				status = "failure";
				errorCode = new Integer(4);
				((java.util.Map) threadLocal.get()).put("errorCode", new Integer(4));
				((java.util.Map) threadLocal.get()).put("status", "failure");
				globalMap.put("tDie_1_DIE_CODE", errorCode);

				if (true) {
					TDieException e_tDie_1 = new TDieException();

					if (enableLogStash) {
						talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "the end is near", e_tDie_1);
						talendJobLogProcess(globalMap);
					}

					throw e_tDie_1;
				}

				tos_count_tDie_1++;

				/**
				 * [tDie_1 main ] stop
				 */

				/**
				 * [tDie_1 process_data_begin ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_begin ] stop
				 */

				/**
				 * [tDie_1 process_data_end ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 process_data_end ] stop
				 */

				/**
				 * [tDie_1 end ] start
				 */

				currentComponent = "tDie_1";

				if (log.isDebugEnabled())
					log.debug("tDie_1 - " + ("Done."));

				ok_Hash.put("tDie_1", true);
				end_Hash.put("tDie_1", System.currentTimeMillis());

				/**
				 * [tDie_1 end ] stop
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
				 * [tDie_1 finally ] start
				 */

				currentComponent = "tDie_1";

				/**
				 * [tDie_1 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}

	public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];

		public java.util.Date moment;

		public java.util.Date getMoment() {
			return this.moment;
		}

		public Boolean momentIsNullable() {
			return true;
		}

		public Boolean momentIsKey() {
			return false;
		}

		public Integer momentLength() {
			return 0;
		}

		public Integer momentPrecision() {
			return 0;
		}

		public String momentDefault() {

			return "";

		}

		public String momentComment() {

			return null;

		}

		public String momentPattern() {

			return "yyyy-MM-dd HH:mm:ss";

		}

		public String momentOriginalDbColumnName() {

			return "moment";

		}

		public String pid;

		public String getPid() {
			return this.pid;
		}

		public Boolean pidIsNullable() {
			return true;
		}

		public Boolean pidIsKey() {
			return false;
		}

		public Integer pidLength() {
			return 20;
		}

		public Integer pidPrecision() {
			return 0;
		}

		public String pidDefault() {

			return "";

		}

		public String pidComment() {

			return null;

		}

		public String pidPattern() {

			return null;

		}

		public String pidOriginalDbColumnName() {

			return "pid";

		}

		public String root_pid;

		public String getRoot_pid() {
			return this.root_pid;
		}

		public Boolean root_pidIsNullable() {
			return true;
		}

		public Boolean root_pidIsKey() {
			return false;
		}

		public Integer root_pidLength() {
			return 20;
		}

		public Integer root_pidPrecision() {
			return 0;
		}

		public String root_pidDefault() {

			return "";

		}

		public String root_pidComment() {

			return null;

		}

		public String root_pidPattern() {

			return null;

		}

		public String root_pidOriginalDbColumnName() {

			return "root_pid";

		}

		public String father_pid;

		public String getFather_pid() {
			return this.father_pid;
		}

		public Boolean father_pidIsNullable() {
			return true;
		}

		public Boolean father_pidIsKey() {
			return false;
		}

		public Integer father_pidLength() {
			return 20;
		}

		public Integer father_pidPrecision() {
			return 0;
		}

		public String father_pidDefault() {

			return "";

		}

		public String father_pidComment() {

			return null;

		}

		public String father_pidPattern() {

			return null;

		}

		public String father_pidOriginalDbColumnName() {

			return "father_pid";

		}

		public String project;

		public String getProject() {
			return this.project;
		}

		public Boolean projectIsNullable() {
			return true;
		}

		public Boolean projectIsKey() {
			return false;
		}

		public Integer projectLength() {
			return 50;
		}

		public Integer projectPrecision() {
			return 0;
		}

		public String projectDefault() {

			return "";

		}

		public String projectComment() {

			return null;

		}

		public String projectPattern() {

			return null;

		}

		public String projectOriginalDbColumnName() {

			return "project";

		}

		public String job;

		public String getJob() {
			return this.job;
		}

		public Boolean jobIsNullable() {
			return true;
		}

		public Boolean jobIsKey() {
			return false;
		}

		public Integer jobLength() {
			return 255;
		}

		public Integer jobPrecision() {
			return 0;
		}

		public String jobDefault() {

			return "";

		}

		public String jobComment() {

			return null;

		}

		public String jobPattern() {

			return null;

		}

		public String jobOriginalDbColumnName() {

			return "job";

		}

		public String context;

		public String getContext() {
			return this.context;
		}

		public Boolean contextIsNullable() {
			return true;
		}

		public Boolean contextIsKey() {
			return false;
		}

		public Integer contextLength() {
			return 50;
		}

		public Integer contextPrecision() {
			return 0;
		}

		public String contextDefault() {

			return "";

		}

		public String contextComment() {

			return null;

		}

		public String contextPattern() {

			return null;

		}

		public String contextOriginalDbColumnName() {

			return "context";

		}

		public Integer priority;

		public Integer getPriority() {
			return this.priority;
		}

		public Boolean priorityIsNullable() {
			return true;
		}

		public Boolean priorityIsKey() {
			return false;
		}

		public Integer priorityLength() {
			return 3;
		}

		public Integer priorityPrecision() {
			return 0;
		}

		public String priorityDefault() {

			return "";

		}

		public String priorityComment() {

			return null;

		}

		public String priorityPattern() {

			return null;

		}

		public String priorityOriginalDbColumnName() {

			return "priority";

		}

		public String type;

		public String getType() {
			return this.type;
		}

		public Boolean typeIsNullable() {
			return true;
		}

		public Boolean typeIsKey() {
			return false;
		}

		public Integer typeLength() {
			return 255;
		}

		public Integer typePrecision() {
			return 0;
		}

		public String typeDefault() {

			return "";

		}

		public String typeComment() {

			return null;

		}

		public String typePattern() {

			return null;

		}

		public String typeOriginalDbColumnName() {

			return "type";

		}

		public String origin;

		public String getOrigin() {
			return this.origin;
		}

		public Boolean originIsNullable() {
			return true;
		}

		public Boolean originIsKey() {
			return false;
		}

		public Integer originLength() {
			return 255;
		}

		public Integer originPrecision() {
			return 0;
		}

		public String originDefault() {

			return "";

		}

		public String originComment() {

			return null;

		}

		public String originPattern() {

			return null;

		}

		public String originOriginalDbColumnName() {

			return "origin";

		}

		public String message;

		public String getMessage() {
			return this.message;
		}

		public Boolean messageIsNullable() {
			return true;
		}

		public Boolean messageIsKey() {
			return false;
		}

		public Integer messageLength() {
			return 255;
		}

		public Integer messagePrecision() {
			return 0;
		}

		public String messageDefault() {

			return "";

		}

		public String messageComment() {

			return null;

		}

		public String messagePattern() {

			return null;

		}

		public String messageOriginalDbColumnName() {

			return "message";

		}

		public Integer code;

		public Integer getCode() {
			return this.code;
		}

		public Boolean codeIsNullable() {
			return true;
		}

		public Boolean codeIsKey() {
			return false;
		}

		public Integer codeLength() {
			return 3;
		}

		public Integer codePrecision() {
			return 0;
		}

		public String codeDefault() {

			return "";

		}

		public String codeComment() {

			return null;

		}

		public String codePattern() {

			return null;

		}

		public String codeOriginalDbColumnName() {

			return "code";

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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.root_pid = readString(dis);

					this.father_pid = readString(dis);

					this.project = readString(dis);

					this.job = readString(dis);

					this.context = readString(dis);

					this.priority = readInteger(dis);

					this.type = readString(dis);

					this.origin = readString(dis);

					this.message = readString(dis);

					this.code = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.root_pid = readString(dis);

					this.father_pid = readString(dis);

					this.project = readString(dis);

					this.job = readString(dis);

					this.context = readString(dis);

					this.priority = readInteger(dis);

					this.type = readString(dis);

					this.origin = readString(dis);

					this.message = readString(dis);

					this.code = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.root_pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.context, dos);

				// Integer

				writeInteger(this.priority, dos);

				// String

				writeString(this.type, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.message, dos);

				// Integer

				writeInteger(this.code, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.root_pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.context, dos);

				// Integer

				writeInteger(this.priority, dos);

				// String

				writeString(this.type, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.message, dos);

				// Integer

				writeInteger(this.code, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("moment=" + String.valueOf(moment));
			sb.append(",pid=" + pid);
			sb.append(",root_pid=" + root_pid);
			sb.append(",father_pid=" + father_pid);
			sb.append(",project=" + project);
			sb.append(",job=" + job);
			sb.append(",context=" + context);
			sb.append(",priority=" + String.valueOf(priority));
			sb.append(",type=" + type);
			sb.append(",origin=" + origin);
			sb.append(",message=" + message);
			sb.append(",code=" + String.valueOf(code));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (moment == null) {
				sb.append("<null>");
			} else {
				sb.append(moment);
			}

			sb.append("|");

			if (pid == null) {
				sb.append("<null>");
			} else {
				sb.append(pid);
			}

			sb.append("|");

			if (root_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(root_pid);
			}

			sb.append("|");

			if (father_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(father_pid);
			}

			sb.append("|");

			if (project == null) {
				sb.append("<null>");
			} else {
				sb.append(project);
			}

			sb.append("|");

			if (job == null) {
				sb.append("<null>");
			} else {
				sb.append(job);
			}

			sb.append("|");

			if (context == null) {
				sb.append("<null>");
			} else {
				sb.append(context);
			}

			sb.append("|");

			if (priority == null) {
				sb.append("<null>");
			} else {
				sb.append(priority);
			}

			sb.append("|");

			if (type == null) {
				sb.append("<null>");
			} else {
				sb.append(type);
			}

			sb.append("|");

			if (origin == null) {
				sb.append("<null>");
			} else {
				sb.append(origin);
			}

			sb.append("|");

			if (message == null) {
				sb.append("<null>");
			} else {
				sb.append(message);
			}

			sb.append("|");

			if (code == null) {
				sb.append("<null>");
			} else {
				sb.append(code);
			}

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

	public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[0];

		public java.util.Date moment;

		public java.util.Date getMoment() {
			return this.moment;
		}

		public Boolean momentIsNullable() {
			return true;
		}

		public Boolean momentIsKey() {
			return false;
		}

		public Integer momentLength() {
			return 0;
		}

		public Integer momentPrecision() {
			return 0;
		}

		public String momentDefault() {

			return "";

		}

		public String momentComment() {

			return null;

		}

		public String momentPattern() {

			return "yyyy-MM-dd HH:mm:ss";

		}

		public String momentOriginalDbColumnName() {

			return "moment";

		}

		public String pid;

		public String getPid() {
			return this.pid;
		}

		public Boolean pidIsNullable() {
			return true;
		}

		public Boolean pidIsKey() {
			return false;
		}

		public Integer pidLength() {
			return 20;
		}

		public Integer pidPrecision() {
			return 0;
		}

		public String pidDefault() {

			return "";

		}

		public String pidComment() {

			return null;

		}

		public String pidPattern() {

			return null;

		}

		public String pidOriginalDbColumnName() {

			return "pid";

		}

		public String root_pid;

		public String getRoot_pid() {
			return this.root_pid;
		}

		public Boolean root_pidIsNullable() {
			return true;
		}

		public Boolean root_pidIsKey() {
			return false;
		}

		public Integer root_pidLength() {
			return 20;
		}

		public Integer root_pidPrecision() {
			return 0;
		}

		public String root_pidDefault() {

			return "";

		}

		public String root_pidComment() {

			return null;

		}

		public String root_pidPattern() {

			return null;

		}

		public String root_pidOriginalDbColumnName() {

			return "root_pid";

		}

		public String father_pid;

		public String getFather_pid() {
			return this.father_pid;
		}

		public Boolean father_pidIsNullable() {
			return true;
		}

		public Boolean father_pidIsKey() {
			return false;
		}

		public Integer father_pidLength() {
			return 20;
		}

		public Integer father_pidPrecision() {
			return 0;
		}

		public String father_pidDefault() {

			return "";

		}

		public String father_pidComment() {

			return null;

		}

		public String father_pidPattern() {

			return null;

		}

		public String father_pidOriginalDbColumnName() {

			return "father_pid";

		}

		public String project;

		public String getProject() {
			return this.project;
		}

		public Boolean projectIsNullable() {
			return true;
		}

		public Boolean projectIsKey() {
			return false;
		}

		public Integer projectLength() {
			return 50;
		}

		public Integer projectPrecision() {
			return 0;
		}

		public String projectDefault() {

			return "";

		}

		public String projectComment() {

			return null;

		}

		public String projectPattern() {

			return null;

		}

		public String projectOriginalDbColumnName() {

			return "project";

		}

		public String job;

		public String getJob() {
			return this.job;
		}

		public Boolean jobIsNullable() {
			return true;
		}

		public Boolean jobIsKey() {
			return false;
		}

		public Integer jobLength() {
			return 255;
		}

		public Integer jobPrecision() {
			return 0;
		}

		public String jobDefault() {

			return "";

		}

		public String jobComment() {

			return null;

		}

		public String jobPattern() {

			return null;

		}

		public String jobOriginalDbColumnName() {

			return "job";

		}

		public String context;

		public String getContext() {
			return this.context;
		}

		public Boolean contextIsNullable() {
			return true;
		}

		public Boolean contextIsKey() {
			return false;
		}

		public Integer contextLength() {
			return 50;
		}

		public Integer contextPrecision() {
			return 0;
		}

		public String contextDefault() {

			return "";

		}

		public String contextComment() {

			return null;

		}

		public String contextPattern() {

			return null;

		}

		public String contextOriginalDbColumnName() {

			return "context";

		}

		public Integer priority;

		public Integer getPriority() {
			return this.priority;
		}

		public Boolean priorityIsNullable() {
			return true;
		}

		public Boolean priorityIsKey() {
			return false;
		}

		public Integer priorityLength() {
			return 3;
		}

		public Integer priorityPrecision() {
			return 0;
		}

		public String priorityDefault() {

			return "";

		}

		public String priorityComment() {

			return null;

		}

		public String priorityPattern() {

			return null;

		}

		public String priorityOriginalDbColumnName() {

			return "priority";

		}

		public String type;

		public String getType() {
			return this.type;
		}

		public Boolean typeIsNullable() {
			return true;
		}

		public Boolean typeIsKey() {
			return false;
		}

		public Integer typeLength() {
			return 255;
		}

		public Integer typePrecision() {
			return 0;
		}

		public String typeDefault() {

			return "";

		}

		public String typeComment() {

			return null;

		}

		public String typePattern() {

			return null;

		}

		public String typeOriginalDbColumnName() {

			return "type";

		}

		public String origin;

		public String getOrigin() {
			return this.origin;
		}

		public Boolean originIsNullable() {
			return true;
		}

		public Boolean originIsKey() {
			return false;
		}

		public Integer originLength() {
			return 255;
		}

		public Integer originPrecision() {
			return 0;
		}

		public String originDefault() {

			return "";

		}

		public String originComment() {

			return null;

		}

		public String originPattern() {

			return null;

		}

		public String originOriginalDbColumnName() {

			return "origin";

		}

		public String message;

		public String getMessage() {
			return this.message;
		}

		public Boolean messageIsNullable() {
			return true;
		}

		public Boolean messageIsKey() {
			return false;
		}

		public Integer messageLength() {
			return 255;
		}

		public Integer messagePrecision() {
			return 0;
		}

		public String messageDefault() {

			return "";

		}

		public String messageComment() {

			return null;

		}

		public String messagePattern() {

			return null;

		}

		public String messageOriginalDbColumnName() {

			return "message";

		}

		public Integer code;

		public Integer getCode() {
			return this.code;
		}

		public Boolean codeIsNullable() {
			return true;
		}

		public Boolean codeIsKey() {
			return false;
		}

		public Integer codeLength() {
			return 3;
		}

		public Integer codePrecision() {
			return 0;
		}

		public String codeDefault() {

			return "";

		}

		public String codeComment() {

			return null;

		}

		public String codePattern() {

			return null;

		}

		public String codeOriginalDbColumnName() {

			return "code";

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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS.length == 0) {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_Copy_of_tSA_load_AWS, 0, length, utf8Charset);
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

		private Integer readInteger(ObjectInputStream dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException {
			Integer intReturn;
			int length = 0;
			length = dis.readByte();
			if (length == -1) {
				intReturn = null;
			} else {
				intReturn = dis.readInt();
			}
			return intReturn;
		}

		private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException {
			if (intNum == null) {
				dos.writeByte(-1);
			} else {
				dos.writeByte(0);
				dos.writeInt(intNum);
			}
		}

		private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException {
			if (intNum == null) {
				marshaller.writeByte(-1);
			} else {
				marshaller.writeByte(0);
				marshaller.writeInt(intNum);
			}
		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.root_pid = readString(dis);

					this.father_pid = readString(dis);

					this.project = readString(dis);

					this.job = readString(dis);

					this.context = readString(dis);

					this.priority = readInteger(dis);

					this.type = readString(dis);

					this.origin = readString(dis);

					this.message = readString(dis);

					this.code = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_Copy_of_tSA_load_AWS) {

				try {

					int length = 0;

					this.moment = readDate(dis);

					this.pid = readString(dis);

					this.root_pid = readString(dis);

					this.father_pid = readString(dis);

					this.project = readString(dis);

					this.job = readString(dis);

					this.context = readString(dis);

					this.priority = readInteger(dis);

					this.type = readString(dis);

					this.origin = readString(dis);

					this.message = readString(dis);

					this.code = readInteger(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.root_pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.context, dos);

				// Integer

				writeInteger(this.priority, dos);

				// String

				writeString(this.type, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.message, dos);

				// Integer

				writeInteger(this.code, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// java.util.Date

				writeDate(this.moment, dos);

				// String

				writeString(this.pid, dos);

				// String

				writeString(this.root_pid, dos);

				// String

				writeString(this.father_pid, dos);

				// String

				writeString(this.project, dos);

				// String

				writeString(this.job, dos);

				// String

				writeString(this.context, dos);

				// Integer

				writeInteger(this.priority, dos);

				// String

				writeString(this.type, dos);

				// String

				writeString(this.origin, dos);

				// String

				writeString(this.message, dos);

				// Integer

				writeInteger(this.code, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("moment=" + String.valueOf(moment));
			sb.append(",pid=" + pid);
			sb.append(",root_pid=" + root_pid);
			sb.append(",father_pid=" + father_pid);
			sb.append(",project=" + project);
			sb.append(",job=" + job);
			sb.append(",context=" + context);
			sb.append(",priority=" + String.valueOf(priority));
			sb.append(",type=" + type);
			sb.append(",origin=" + origin);
			sb.append(",message=" + message);
			sb.append(",code=" + String.valueOf(code));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (moment == null) {
				sb.append("<null>");
			} else {
				sb.append(moment);
			}

			sb.append("|");

			if (pid == null) {
				sb.append("<null>");
			} else {
				sb.append(pid);
			}

			sb.append("|");

			if (root_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(root_pid);
			}

			sb.append("|");

			if (father_pid == null) {
				sb.append("<null>");
			} else {
				sb.append(father_pid);
			}

			sb.append("|");

			if (project == null) {
				sb.append("<null>");
			} else {
				sb.append(project);
			}

			sb.append("|");

			if (job == null) {
				sb.append("<null>");
			} else {
				sb.append(job);
			}

			sb.append("|");

			if (context == null) {
				sb.append("<null>");
			} else {
				sb.append(context);
			}

			sb.append("|");

			if (priority == null) {
				sb.append("<null>");
			} else {
				sb.append(priority);
			}

			sb.append("|");

			if (type == null) {
				sb.append("<null>");
			} else {
				sb.append(type);
			}

			sb.append("|");

			if (origin == null) {
				sb.append("<null>");
			} else {
				sb.append(origin);
			}

			sb.append("|");

			if (message == null) {
				sb.append("<null>");
			} else {
				sb.append(message);
			}

			sb.append("|");

			if (code == null) {
				sb.append("<null>");
			} else {
				sb.append(code);
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

	public void tLogCatcher_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tLogCatcher_1");
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
				row4Struct row5 = row4;

				/**
				 * [tSendMail_1 begin ] start
				 */

				ok_Hash.put("tSendMail_1", false);
				start_Hash.put("tSendMail_1", System.currentTimeMillis());

				currentComponent = "tSendMail_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row5");

				int tos_count_tSendMail_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tSendMail_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSendMail_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSendMail_1 = new StringBuilder();
							log4jParamters_tSendMail_1.append("Parameters:");
							log4jParamters_tSendMail_1.append("TO" + " = " + "context.To");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("FROM" + " = " + "context.From");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("NEED_PERSONAL_NAME" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("CC" + " = " + "\"\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("BCC" + " = " + "\"\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("MESSAGE" + " = "
									+ "jobName + \" job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. \"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("CHECK_ATTACHMENT" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("ATTACHMENTS" + " = " + "[]");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("HEADERS" + " = " + "[]");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SMTP_PORT" + " = " + "25");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SSL" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("STARTTLS" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("IMPORTANCE" + " = " + "Normal");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("AUTH_MODE" + " = " + "NO_AUTH");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("TEXT_SUBTYPE" + " = " + "plain");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("SET_LOCALHOST" + " = " + "false");
							log4jParamters_tSendMail_1.append(" | ");
							log4jParamters_tSendMail_1.append("CONFIGS" + " = " + "[]");
							log4jParamters_tSendMail_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSendMail_1 - " + (log4jParamters_tSendMail_1));
						}
					}
					new BytesLimit65535_tSendMail_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSendMail_1", "tSendMail_1", "tSendMail");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSendMail_1 begin ] stop
				 */

				/**
				 * [tLogRow_1 begin ] start
				 */

				ok_Hash.put("tLogRow_1", false);
				start_Hash.put("tLogRow_1", System.currentTimeMillis());

				currentComponent = "tLogRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row4");

				int tos_count_tLogRow_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLogRow_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLogRow_1 = new StringBuilder();
							log4jParamters_tLogRow_1.append("Parameters:");
							log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_HEADER" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_UNIQUE_NAME" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_COLNAMES" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("USE_FIXED_LENGTH" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLogRow_1 - " + (log4jParamters_tLogRow_1));
						}
					}
					new BytesLimit65535_tLogRow_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLogRow_1", "tLogRow_1", "tLogRow");
					talendJobLogProcess(globalMap);
				}

				///////////////////////

				final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
				java.io.PrintStream consoleOut_tLogRow_1 = null;

				StringBuilder strBuffer_tLogRow_1 = null;
				int nb_line_tLogRow_1 = 0;
///////////////////////    			

				/**
				 * [tLogRow_1 begin ] stop
				 */

				/**
				 * [tLogCatcher_1 begin ] start
				 */

				ok_Hash.put("tLogCatcher_1", false);
				start_Hash.put("tLogCatcher_1", System.currentTimeMillis());

				currentComponent = "tLogCatcher_1";

				int tos_count_tLogCatcher_1 = 0;

				if (log.isDebugEnabled())
					log.debug("tLogCatcher_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tLogCatcher_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tLogCatcher_1 = new StringBuilder();
							log4jParamters_tLogCatcher_1.append("Parameters:");
							log4jParamters_tLogCatcher_1.append("CATCH_JAVA_EXCEPTION" + " = " + "true");
							log4jParamters_tLogCatcher_1.append(" | ");
							log4jParamters_tLogCatcher_1.append("CATCH_TDIE" + " = " + "true");
							log4jParamters_tLogCatcher_1.append(" | ");
							log4jParamters_tLogCatcher_1.append("CATCH_TWARN" + " = " + "true");
							log4jParamters_tLogCatcher_1.append(" | ");
							log4jParamters_tLogCatcher_1.append("CATCH_TACTIONFAILURE" + " = " + "true");
							log4jParamters_tLogCatcher_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tLogCatcher_1 - " + (log4jParamters_tLogCatcher_1));
						}
					}
					new BytesLimit65535_tLogCatcher_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tLogCatcher_1", "tLogCatcher_1", "tLogCatcher");
					talendJobLogProcess(globalMap);
				}

				try {
					for (LogCatcherUtils.LogCatcherMessage lcm : tLogCatcher_1.getMessages()) {
						row4.type = lcm.getType();
						row4.origin = (lcm.getOrigin() == null || lcm.getOrigin().length() < 1 ? null
								: lcm.getOrigin());
						row4.priority = lcm.getPriority();
						row4.message = lcm.getMessage();
						row4.code = lcm.getCode();

						row4.moment = java.util.Calendar.getInstance().getTime();

						row4.pid = pid;
						row4.root_pid = rootPid;
						row4.father_pid = fatherPid;

						row4.project = projectName;
						row4.job = jobName;
						row4.context = contextStr;

						/**
						 * [tLogCatcher_1 begin ] stop
						 */

						/**
						 * [tLogCatcher_1 main ] start
						 */

						currentComponent = "tLogCatcher_1";

						tos_count_tLogCatcher_1++;

						/**
						 * [tLogCatcher_1 main ] stop
						 */

						/**
						 * [tLogCatcher_1 process_data_begin ] start
						 */

						currentComponent = "tLogCatcher_1";

						/**
						 * [tLogCatcher_1 process_data_begin ] stop
						 */

						/**
						 * [tLogRow_1 main ] start
						 */

						currentComponent = "tLogRow_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row4", "tLogCatcher_1", "tLogCatcher_1", "tLogCatcher", "tLogRow_1", "tLogRow_1",
								"tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row4 - " + (row4 == null ? "" : row4.toLogString()));
						}

///////////////////////		

						strBuffer_tLogRow_1 = new StringBuilder();

						if (row4.moment != null) { //

							strBuffer_tLogRow_1.append(FormatterUtils.format_Date(row4.moment, "yyyy-MM-dd HH:mm:ss"));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.root_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.root_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.father_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.father_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.project != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.project));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.job != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.job));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.context != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.context));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.priority != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.priority));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.type != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.type));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.origin != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.origin));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.message != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.message));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row4.code != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row4.code));

						} //

						if (globalMap.get("tLogRow_CONSOLE") != null) {
							consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
						} else {
							consoleOut_tLogRow_1 = new java.io.PrintStream(
									new java.io.BufferedOutputStream(System.out));
							globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
						}
						log.info("tLogRow_1 - Content of row " + (nb_line_tLogRow_1 + 1) + ": "
								+ strBuffer_tLogRow_1.toString());
						consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
						consoleOut_tLogRow_1.flush();
						nb_line_tLogRow_1++;
//////

//////                    

///////////////////////    			

						row5 = row4;

						tos_count_tLogRow_1++;

						/**
						 * [tLogRow_1 main ] stop
						 */

						/**
						 * [tLogRow_1 process_data_begin ] start
						 */

						currentComponent = "tLogRow_1";

						/**
						 * [tLogRow_1 process_data_begin ] stop
						 */

						/**
						 * [tSendMail_1 main ] start
						 */

						currentComponent = "tSendMail_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row5", "tLogRow_1", "tLogRow_1", "tLogRow", "tSendMail_1", "tSendMail_1", "tSendMail"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row5 - " + (row5 == null ? "" : row5.toLogString()));
						}

						String smtpHost_tSendMail_1 = "Mail13.vsi-nj.vitshoppe.com";
						String smtpPort_tSendMail_1 = "25";
						String from_tSendMail_1 = (context.From);
						String to_tSendMail_1 = (context.To).replace(";", ",");
						String cc_tSendMail_1 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
						String bcc_tSendMail_1 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
						String subject_tSendMail_1 = (jobName + " job Failed !!!!");

						java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String, String>>();
						java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
						java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();

						String message_tSendMail_1 = ((jobName
								+ " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ") == null
								|| "".equals(jobName
										+ " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. "))
												? "\"\""
												: (jobName
														+ " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ");
						java.util.Properties props_tSendMail_1 = System.getProperties();
						props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
						props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);

						props_tSendMail_1.put("mail.mime.encodefilename", "true");
						try {

							log.info("tSendMail_1 - Connection attempt to '" + smtpHost_tSendMail_1 + "'.");

							props_tSendMail_1.put("mail.smtp.auth", "false");
							javax.mail.Session session_tSendMail_1 = javax.mail.Session.getInstance(props_tSendMail_1,
									null);

							log.info("tSendMail_1 - Connection to '" + smtpHost_tSendMail_1 + "' has succeeded.");

							javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(
									session_tSendMail_1);
							msg_tSendMail_1.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_1, null));
							msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.TO,
									javax.mail.internet.InternetAddress.parse(to_tSendMail_1, false));
							if (cc_tSendMail_1 != null)
								msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.CC,
										javax.mail.internet.InternetAddress.parse(cc_tSendMail_1, false));
							if (bcc_tSendMail_1 != null)
								msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.BCC,
										javax.mail.internet.InternetAddress.parse(bcc_tSendMail_1, false));
							msg_tSendMail_1.setSubject(subject_tSendMail_1);

							for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1.size(); i_tSendMail_1++) {
								java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1
										.get(i_tSendMail_1);
								msg_tSendMail_1.setHeader(header_tSendMail_1.get("KEY"),
										header_tSendMail_1.get("VALUE"));
							}
							msg_tSendMail_1.setSentDate(new Date());
							msg_tSendMail_1.setHeader("X-Priority", "3"); // High->1 Normal->3 Low->5
							javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
							javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
							mbpText_tSendMail_1.setText(message_tSendMail_1, "ISO-8859-15", "plain");
							mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);

							javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

							for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1
									.size(); i_tSendMail_1++) {
								String filename_tSendMail_1 = attachments_tSendMail_1.get(i_tSendMail_1);
								javax.activation.FileDataSource fds_tSendMail_1 = null;
								java.io.File file_tSendMail_1 = new java.io.File(filename_tSendMail_1);

								if (!file_tSendMail_1.exists()) {
									continue;
								}

								if (file_tSendMail_1.isDirectory()) {
									java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1.listFiles();
									for (java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1) {
										if (subFile_tSendMail_1.isFile()) {
											fds_tSendMail_1 = new javax.activation.FileDataSource(
													subFile_tSendMail_1.getAbsolutePath());
											mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
											mbpFile_tSendMail_1
													.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
											mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility
													.encodeText(fds_tSendMail_1.getName()));
											if (contentTransferEncoding_tSendMail_1.get(i_tSendMail_1)
													.equalsIgnoreCase("base64")) {
												mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
											}
											mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
										}
									}
								} else {
									mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
									fds_tSendMail_1 = new javax.activation.FileDataSource(filename_tSendMail_1);
									mbpFile_tSendMail_1
											.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
									mbpFile_tSendMail_1.setFileName(
											javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
									if (contentTransferEncoding_tSendMail_1.get(i_tSendMail_1)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
									}
									mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
								}
							}
							// -- set the content --
							msg_tSendMail_1.setContent(mp_tSendMail_1);
							// add handlers for main MIME types
							javax.activation.MailcapCommandMap mc_tSendMail_1 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
									.getDefaultCommandMap();
							mc_tSendMail_1
									.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
							mc_tSendMail_1
									.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
							mc_tSendMail_1
									.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
							mc_tSendMail_1.addMailcap(
									"multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
							mc_tSendMail_1.addMailcap(
									"message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
							javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_1);
							// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
							com.sun.mail.handlers.text_plain text_plain_h_tSendMail_1 = null;
							// -- Send the message --
							javax.mail.Transport.send(msg_tSendMail_1);
						} catch (java.lang.Exception e) {
							globalMap.put("tSendMail_1_ERROR_MESSAGE", e.getMessage());

							throw (e);

						} finally {
							props_tSendMail_1.remove("mail.smtp.host");
							props_tSendMail_1.remove("mail.smtp.port");

							props_tSendMail_1.remove("mail.mime.encodefilename");

							props_tSendMail_1.remove("mail.smtp.auth");
						}

						tos_count_tSendMail_1++;

						/**
						 * [tSendMail_1 main ] stop
						 */

						/**
						 * [tSendMail_1 process_data_begin ] start
						 */

						currentComponent = "tSendMail_1";

						/**
						 * [tSendMail_1 process_data_begin ] stop
						 */

						/**
						 * [tSendMail_1 process_data_end ] start
						 */

						currentComponent = "tSendMail_1";

						/**
						 * [tSendMail_1 process_data_end ] stop
						 */

						/**
						 * [tLogRow_1 process_data_end ] start
						 */

						currentComponent = "tLogRow_1";

						/**
						 * [tLogRow_1 process_data_end ] stop
						 */

						/**
						 * [tLogCatcher_1 process_data_end ] start
						 */

						currentComponent = "tLogCatcher_1";

						/**
						 * [tLogCatcher_1 process_data_end ] stop
						 */

						/**
						 * [tLogCatcher_1 end ] start
						 */

						currentComponent = "tLogCatcher_1";

					}
				} catch (Exception e_tLogCatcher_1) {
					globalMap.put("tLogCatcher_1_ERROR_MESSAGE", e_tLogCatcher_1.getMessage());
					logIgnoredError(String.format(
							"tLogCatcher_1 - tLogCatcher failed to process log message(s) due to internal error: %s",
							e_tLogCatcher_1), e_tLogCatcher_1);
				}

				if (log.isDebugEnabled())
					log.debug("tLogCatcher_1 - " + ("Done."));

				ok_Hash.put("tLogCatcher_1", true);
				end_Hash.put("tLogCatcher_1", System.currentTimeMillis());

				/**
				 * [tLogCatcher_1 end ] stop
				 */

				/**
				 * [tLogRow_1 end ] start
				 */

				currentComponent = "tLogRow_1";

//////
//////
				globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);
				if (log.isInfoEnabled())
					log.info("tLogRow_1 - " + ("Printed row count: ") + (nb_line_tLogRow_1) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row4", 2, 0,
						"tLogCatcher_1", "tLogCatcher_1", "tLogCatcher", "tLogRow_1", "tLogRow_1", "tLogRow",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Done."));

				ok_Hash.put("tLogRow_1", true);
				end_Hash.put("tLogRow_1", System.currentTimeMillis());

				/**
				 * [tLogRow_1 end ] stop
				 */

				/**
				 * [tSendMail_1 end ] start
				 */

				currentComponent = "tSendMail_1";

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row5", 2, 0,
						"tLogRow_1", "tLogRow_1", "tLogRow", "tSendMail_1", "tSendMail_1", "tSendMail", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tSendMail_1 - " + ("Done."));

				ok_Hash.put("tSendMail_1", true);
				end_Hash.put("tSendMail_1", System.currentTimeMillis());

				/**
				 * [tSendMail_1 end ] stop
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
				 * [tLogCatcher_1 finally ] start
				 */

				currentComponent = "tLogCatcher_1";

				/**
				 * [tLogCatcher_1 finally ] stop
				 */

				/**
				 * [tLogRow_1 finally ] start
				 */

				currentComponent = "tLogRow_1";

				/**
				 * [tLogRow_1 finally ] stop
				 */

				/**
				 * [tSendMail_1 finally ] start
				 */

				currentComponent = "tSendMail_1";

				/**
				 * [tSendMail_1 finally ] stop
				 */

			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tLogCatcher_1_SUBPROCESS_STATE", 1);
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
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBClose_2Process(globalMap);

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

	public void tDBClose_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBClose_2");
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
				 * [tDBClose_2 begin ] start
				 */

				ok_Hash.put("tDBClose_2", false);
				start_Hash.put("tDBClose_2", System.currentTimeMillis());

				currentComponent = "tDBClose_2";

				int tos_count_tDBClose_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_2 = new StringBuilder();
							log4jParamters_tDBClose_2.append("Parameters:");
							log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_2");
							log4jParamters_tDBClose_2.append(" | ");
							log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlClose");
							log4jParamters_tDBClose_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_2 - " + (log4jParamters_tDBClose_2));
						}
					}
					new BytesLimit65535_tDBClose_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tMSSqlClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_2 begin ] stop
				 */

				/**
				 * [tDBClose_2 main ] start
				 */

				currentComponent = "tDBClose_2";

				java.sql.Connection conn_tDBClose_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_2");
				if (conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed()) {
					if (log.isDebugEnabled())
						log.debug("tDBClose_2 - " + ("Closing the connection ") + ("conn_tDBConnection_2")
								+ (" to the database."));
					conn_tDBClose_2.close();
					if (log.isDebugEnabled())
						log.debug("tDBClose_2 - " + ("Connection ") + ("conn_tDBConnection_2")
								+ (" to the database has closed."));
				}

				tos_count_tDBClose_2++;

				/**
				 * [tDBClose_2 main ] stop
				 */

				/**
				 * [tDBClose_2 process_data_begin ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_2 process_data_end ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 process_data_end ] stop
				 */

				/**
				 * [tDBClose_2 end ] start
				 */

				currentComponent = "tDBClose_2";

				if (log.isDebugEnabled())
					log.debug("tDBClose_2 - " + ("Done."));

				ok_Hash.put("tDBClose_2", true);
				end_Hash.put("tDBClose_2", System.currentTimeMillis());

				/**
				 * [tDBClose_2 end ] stop
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
				 * [tDBClose_2 finally ] start
				 */

				currentComponent = "tDBClose_2";

				/**
				 * [tDBClose_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_2_SUBPROCESS_STATE", 1);
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

				props_tDBConnection_1.setValue("account", context.SF_account);

				props_tDBConnection_1.setValue("regionID", "us-east-1");

				props_tDBConnection_1.setValue("region", org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBConnection_1.setValue("useCustomRegion", false);

				props_tDBConnection_1.setValue("authenticationType",
						org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);

				props_tDBConnection_1.setValue("warehouse", context.SF_warehouse);

				props_tDBConnection_1.setValue("db", context.SF_prod_database);

				props_tDBConnection_1.setValue("schemaName", context.SF_fin_schema);

				props_tDBConnection_1.setValue("role", "SYSADMIN");

				props_tDBConnection_1.setValue("jdbcParameters", "");

				props_tDBConnection_1.setValue("autoCommit", true);

				props_tDBConnection_1.userPassword.setValue("useAuth", false);

				props_tDBConnection_1.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_1.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:gNtP48oE5/dpHmmkt3qk0hvtzM6gLEDsmQBugJ8lLgaHX6EV"));

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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

				int tos_count_tDBConnection_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_2 = new StringBuilder();
							log4jParamters_tDBConnection_2.append("Parameters:");
							log4jParamters_tDBConnection_2.append("DRIVER" + " = " + "JTDS");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("HOST" + " = " + "context.vsdata_host");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PORT" + " = " + "context.vsdata_port");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("SCHEMA_DB" + " = " + "context.vsdata_schema");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("DBNAME" + " = " + "context.vsdata_database");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USER" + " = " + "context.vsdata_user_id");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:enRC0pykRMf7fRct7NcHGt1erYysecRUS9EBYmOm2bmconWevq+z5TLj")
									.substring(0, 4) + "...");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("SHARE_IDENTITY_SETTING" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlConnection");
							log4jParamters_tDBConnection_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_2 - " + (log4jParamters_tDBConnection_2));
						}
					}
					new BytesLimit65535_tDBConnection_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "tDBConnection_2", "tMSSqlConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_2 = "jdbc:jtds:sqlserver://" + context.vsdata_host;
				String port_tDBConnection_2 = context.vsdata_port;
				String dbname_tDBConnection_2 = context.vsdata_database;
				if (!"".equals(port_tDBConnection_2)) {
					url_tDBConnection_2 += ":" + context.vsdata_port;
				}
				if (!"".equals(dbname_tDBConnection_2)) {

					url_tDBConnection_2 += "//" + context.vsdata_database;
				}

				url_tDBConnection_2 += ";appName=" + projectName + ";" + "";
				String dbUser_tDBConnection_2 = context.vsdata_user_id;

				final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:W3MtfDPWMyRGykn5Y0lL0UE+yLhMu8I39n7MctC53E9FmS+fidjSkg0A");
				String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;

				java.sql.Connection conn_tDBConnection_2 = null;

				String driverClass_tDBConnection_2 = "net.sourceforge.jtds.jdbc.Driver";
				java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
				globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);

				log.debug("tDBConnection_2 - Driver ClassName: " + driverClass_tDBConnection_2 + ".");

				log.debug("tDBConnection_2 - Connection attempt to '" + url_tDBConnection_2 + "' with the username '"
						+ dbUser_tDBConnection_2 + "'.");

				conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2, dbUser_tDBConnection_2,
						dbPwd_tDBConnection_2);
				log.debug("tDBConnection_2 - Connection to '" + url_tDBConnection_2 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
				if (null != conn_tDBConnection_2) {

					log.debug("tDBConnection_2 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_2.setAutoCommit(false);
				}

				globalMap.put("dbschema_tDBConnection_2", context.vsdata_schema);

				globalMap.put("db_tDBConnection_2", context.vsdata_database);

				globalMap.put("shareIdentitySetting_tDBConnection_2", false);

				globalMap.put("driver_tDBConnection_2", "JTDS");

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

				if (log.isDebugEnabled())
					log.debug("tDBConnection_2 - " + ("Done."));

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
		final Copy_of_tSA_load_AWS Copy_of_tSA_load_AWSClass = new Copy_of_tSA_load_AWS();

		int exitCode = Copy_of_tSA_load_AWSClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'Copy_of_tSA_load_AWS' - Done.");
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
		log.info("TalendJob: 'Copy_of_tSA_load_AWS' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_AwrjMAxWEe6WaNrWmUUUzw");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-16T15:04:54.317671600Z");

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
			java.io.InputStream inContext = Copy_of_tSA_load_AWS.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/copy_of_tsa_load_aws_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = Copy_of_tSA_load_AWS.class.getClassLoader()
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
					context.setContextType("From", "id_String");
					if (context.getStringValue("From") == null) {
						context.From = null;
					} else {
						context.From = (String) context.getProperty("From");
					}
					context.setContextType("To", "id_String");
					if (context.getStringValue("To") == null) {
						context.To = null;
					} else {
						context.To = (String) context.getProperty("To");
					}
					context.setContextType("Cc", "id_String");
					if (context.getStringValue("Cc") == null) {
						context.Cc = null;
					} else {
						context.Cc = (String) context.getProperty("Cc");
					}
					context.setContextType("sa_database", "id_String");
					if (context.getStringValue("sa_database") == null) {
						context.sa_database = null;
					} else {
						context.sa_database = (String) context.getProperty("sa_database");
					}
					context.setContextType("sa_host", "id_String");
					if (context.getStringValue("sa_host") == null) {
						context.sa_host = null;
					} else {
						context.sa_host = (String) context.getProperty("sa_host");
					}
					context.setContextType("sa_password", "id_Password");
					if (context.getStringValue("sa_password") == null) {
						context.sa_password = null;
					} else {
						String pwd_sa_password_value = context.getProperty("sa_password");
						context.sa_password = null;
						if (pwd_sa_password_value != null) {
							if (context_param.containsKey("sa_password")) {// no need to decrypt if it come from program
																			// argument or parent job runtime
								context.sa_password = pwd_sa_password_value;
							} else if (!pwd_sa_password_value.isEmpty()) {
								try {
									context.sa_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_sa_password_value);
									context.put("sa_password", context.sa_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("sa_port", "id_String");
					if (context.getStringValue("sa_port") == null) {
						context.sa_port = null;
					} else {
						context.sa_port = (String) context.getProperty("sa_port");
					}
					context.setContextType("sa_schema", "id_String");
					if (context.getStringValue("sa_schema") == null) {
						context.sa_schema = null;
					} else {
						context.sa_schema = (String) context.getProperty("sa_schema");
					}
					context.setContextType("sa_user_id", "id_String");
					if (context.getStringValue("sa_user_id") == null) {
						context.sa_user_id = null;
					} else {
						context.sa_user_id = (String) context.getProperty("sa_user_id");
					}
					context.setContextType("SF_account", "id_String");
					if (context.getStringValue("SF_account") == null) {
						context.SF_account = null;
					} else {
						context.SF_account = (String) context.getProperty("SF_account");
					}
					context.setContextType("SF_fin_schema", "id_String");
					if (context.getStringValue("SF_fin_schema") == null) {
						context.SF_fin_schema = null;
					} else {
						context.SF_fin_schema = (String) context.getProperty("SF_fin_schema");
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
					context.setContextType("SF_prod_database", "id_String");
					if (context.getStringValue("SF_prod_database") == null) {
						context.SF_prod_database = null;
					} else {
						context.SF_prod_database = (String) context.getProperty("SF_prod_database");
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
					context.setContextType("vsdata_database", "id_String");
					if (context.getStringValue("vsdata_database") == null) {
						context.vsdata_database = null;
					} else {
						context.vsdata_database = (String) context.getProperty("vsdata_database");
					}
					context.setContextType("vsdata_host", "id_String");
					if (context.getStringValue("vsdata_host") == null) {
						context.vsdata_host = null;
					} else {
						context.vsdata_host = (String) context.getProperty("vsdata_host");
					}
					context.setContextType("vsdata_password", "id_Password");
					if (context.getStringValue("vsdata_password") == null) {
						context.vsdata_password = null;
					} else {
						String pwd_vsdata_password_value = context.getProperty("vsdata_password");
						context.vsdata_password = null;
						if (pwd_vsdata_password_value != null) {
							if (context_param.containsKey("vsdata_password")) {// no need to decrypt if it come from
																				// program argument or parent job
																				// runtime
								context.vsdata_password = pwd_vsdata_password_value;
							} else if (!pwd_vsdata_password_value.isEmpty()) {
								try {
									context.vsdata_password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_vsdata_password_value);
									context.put("vsdata_password", context.vsdata_password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("vsdata_port", "id_String");
					if (context.getStringValue("vsdata_port") == null) {
						context.vsdata_port = null;
					} else {
						context.vsdata_port = (String) context.getProperty("vsdata_port");
					}
					context.setContextType("vsdata_schema", "id_String");
					if (context.getStringValue("vsdata_schema") == null) {
						context.vsdata_schema = null;
					} else {
						context.vsdata_schema = (String) context.getProperty("vsdata_schema");
					}
					context.setContextType("vsdata_user_id", "id_String");
					if (context.getStringValue("vsdata_user_id") == null) {
						context.vsdata_user_id = null;
					} else {
						context.vsdata_user_id = (String) context.getProperty("vsdata_user_id");
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
			if (parentContextMap.containsKey("From")) {
				context.From = (String) parentContextMap.get("From");
			}
			if (parentContextMap.containsKey("To")) {
				context.To = (String) parentContextMap.get("To");
			}
			if (parentContextMap.containsKey("Cc")) {
				context.Cc = (String) parentContextMap.get("Cc");
			}
			if (parentContextMap.containsKey("sa_database")) {
				context.sa_database = (String) parentContextMap.get("sa_database");
			}
			if (parentContextMap.containsKey("sa_host")) {
				context.sa_host = (String) parentContextMap.get("sa_host");
			}
			if (parentContextMap.containsKey("sa_password")) {
				context.sa_password = (java.lang.String) parentContextMap.get("sa_password");
			}
			if (parentContextMap.containsKey("sa_port")) {
				context.sa_port = (String) parentContextMap.get("sa_port");
			}
			if (parentContextMap.containsKey("sa_schema")) {
				context.sa_schema = (String) parentContextMap.get("sa_schema");
			}
			if (parentContextMap.containsKey("sa_user_id")) {
				context.sa_user_id = (String) parentContextMap.get("sa_user_id");
			}
			if (parentContextMap.containsKey("SF_account")) {
				context.SF_account = (String) parentContextMap.get("SF_account");
			}
			if (parentContextMap.containsKey("SF_fin_schema")) {
				context.SF_fin_schema = (String) parentContextMap.get("SF_fin_schema");
			}
			if (parentContextMap.containsKey("SF_password")) {
				context.SF_password = (java.lang.String) parentContextMap.get("SF_password");
			}
			if (parentContextMap.containsKey("SF_prod_database")) {
				context.SF_prod_database = (String) parentContextMap.get("SF_prod_database");
			}
			if (parentContextMap.containsKey("SF_user_id")) {
				context.SF_user_id = (String) parentContextMap.get("SF_user_id");
			}
			if (parentContextMap.containsKey("SF_warehouse")) {
				context.SF_warehouse = (String) parentContextMap.get("SF_warehouse");
			}
			if (parentContextMap.containsKey("vsdata_database")) {
				context.vsdata_database = (String) parentContextMap.get("vsdata_database");
			}
			if (parentContextMap.containsKey("vsdata_host")) {
				context.vsdata_host = (String) parentContextMap.get("vsdata_host");
			}
			if (parentContextMap.containsKey("vsdata_password")) {
				context.vsdata_password = (java.lang.String) parentContextMap.get("vsdata_password");
			}
			if (parentContextMap.containsKey("vsdata_port")) {
				context.vsdata_port = (String) parentContextMap.get("vsdata_port");
			}
			if (parentContextMap.containsKey("vsdata_schema")) {
				context.vsdata_schema = (String) parentContextMap.get("vsdata_schema");
			}
			if (parentContextMap.containsKey("vsdata_user_id")) {
				context.vsdata_user_id = (String) parentContextMap.get("vsdata_user_id");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("sa_password");
		parametersToEncrypt.add("SF_password");
		parametersToEncrypt.add("vsdata_password");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, ContextProperties.class, parametersToEncrypt));

		org.slf4j.MDC.put("_context", contextStr);
		log.info("TalendJob: 'Copy_of_tSA_load_AWS' - Started.");
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
					tDBRow_1Process(globalMap);
					if (!"failure".equals(((java.util.Map) threadLocal.get()).get("status"))) {
						((java.util.Map) threadLocal.get()).put("status", "end");
					}
				} catch (TalendException e_tDBRow_1) {
					globalMap.put("tDBRow_1_SUBPROCESS_STATE", -1);

					e_tDBRow_1.printStackTrace();

				} catch (java.lang.Error e_tDBRow_1) {
					globalMap.put("tDBRow_1_SUBPROCESS_STATE", -1);
					((java.util.Map) threadLocal.get()).put("status", "failure");
					throw e_tDBRow_1;

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
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : Copy_of_tSA_load_AWS");
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
		log.info("TalendJob: 'Copy_of_tSA_load_AWS' - Finished - status: " + status + " returnCode: " + returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {
		closeSqlDbConnections();

	}

	private void closeSqlDbConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tDBConnection_2");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));

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
 * 268615 characters generated by Talend Cloud Data Management Platform on the
 * June 16, 2023 at 11:04:54 AM EDT
 ************************************************************************************************/