
package at_talend_jobs.inventory_balance_data_invcbl_0_1;

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

//the import part of tJavaRow_1
//import java.util.List;

@SuppressWarnings("unused")

/**
 * Job: INVENTORY_BALANCE_DATA_INVCBL Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class INVENTORY_BALANCE_DATA_INVCBL implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "INVENTORY_BALANCE_DATA_INVCBL.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(INVENTORY_BALANCE_DATA_INVCBL.class);

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

			if (To != null) {

				this.setProperty("To", To.toString());

			}

			if (From != null) {

				this.setProperty("From", From.toString());

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

		public String To;

		public String getTo() {
			return this.To;
		}

		public String From;

		public String getFrom() {
			return this.From;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "INVENTORY_BALANCE_DATA_INVCBL";
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
			"_gBb_INm5EeuE0KkKg4NQQA", "0.1");
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
					INVENTORY_BALANCE_DATA_INVCBL.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(INVENTORY_BALANCE_DATA_INVCBL.this,
									new Object[] { e, currentComponent, globalMap });
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

		status = "failure";

		tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileOutputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileInputDelimited_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tSendMail_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDie_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogCatcher_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPostjob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "ERROR", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

		try {

			if (this.execStat) {
				runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
			}

			errorCode = null;
			tDie_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

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
						"DELETE from  INVENTORY_BALANCE_DATA_INVCBL\nWHERE DATELOADED = CURRENT_DATE() - 1");

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
					runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
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

	public static class row14Struct implements routines.system.IPersistableRow<row14Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

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

		public BigDecimal CBHBOY;

		public BigDecimal getCBHBOY() {
			return this.CBHBOY;
		}

		public Boolean CBHBOYIsNullable() {
			return false;
		}

		public Boolean CBHBOYIsKey() {
			return false;
		}

		public Integer CBHBOYLength() {
			return 9;
		}

		public Integer CBHBOYPrecision() {
			return 2;
		}

		public String CBHBOYDefault() {

			return "";

		}

		public String CBHBOYComment() {

			return "";

		}

		public String CBHBOYPattern() {

			return "";

		}

		public String CBHBOYOriginalDbColumnName() {

			return "CBHBOY";

		}

		public BigDecimal CBHBOP;

		public BigDecimal getCBHBOP() {
			return this.CBHBOP;
		}

		public Boolean CBHBOPIsNullable() {
			return false;
		}

		public Boolean CBHBOPIsKey() {
			return false;
		}

		public Integer CBHBOPLength() {
			return 9;
		}

		public Integer CBHBOPPrecision() {
			return 2;
		}

		public String CBHBOPDefault() {

			return "";

		}

		public String CBHBOPComment() {

			return "";

		}

		public String CBHBOPPattern() {

			return "";

		}

		public String CBHBOPOriginalDbColumnName() {

			return "CBHBOP";

		}

		public BigDecimal CBHAND;

		public BigDecimal getCBHAND() {
			return this.CBHAND;
		}

		public Boolean CBHANDIsNullable() {
			return false;
		}

		public Boolean CBHANDIsKey() {
			return false;
		}

		public Integer CBHANDLength() {
			return 9;
		}

		public Integer CBHANDPrecision() {
			return 2;
		}

		public String CBHANDDefault() {

			return "";

		}

		public String CBHANDComment() {

			return "";

		}

		public String CBHANDPattern() {

			return "";

		}

		public String CBHANDOriginalDbColumnName() {

			return "CBHAND";

		}

		public BigDecimal CBTRNS;

		public BigDecimal getCBTRNS() {
			return this.CBTRNS;
		}

		public Boolean CBTRNSIsNullable() {
			return false;
		}

		public Boolean CBTRNSIsKey() {
			return false;
		}

		public Integer CBTRNSLength() {
			return 4;
		}

		public Integer CBTRNSPrecision() {
			return 1;
		}

		public String CBTRNSDefault() {

			return "";

		}

		public String CBTRNSComment() {

			return "";

		}

		public String CBTRNSPattern() {

			return "";

		}

		public String CBTRNSOriginalDbColumnName() {

			return "CBTRNS";

		}

		public BigDecimal CBGMRI;

		public BigDecimal getCBGMRI() {
			return this.CBGMRI;
		}

		public Boolean CBGMRIIsNullable() {
			return false;
		}

		public Boolean CBGMRIIsKey() {
			return false;
		}

		public Integer CBGMRILength() {
			return 4;
		}

		public Integer CBGMRIPrecision() {
			return 1;
		}

		public String CBGMRIDefault() {

			return "";

		}

		public String CBGMRIComment() {

			return "";

		}

		public String CBGMRIPattern() {

			return "";

		}

		public String CBGMRIOriginalDbColumnName() {

			return "CBGMRI";

		}

		public BigDecimal CBWKCR;

		public BigDecimal getCBWKCR() {
			return this.CBWKCR;
		}

		public Boolean CBWKCRIsNullable() {
			return false;
		}

		public Boolean CBWKCRIsKey() {
			return false;
		}

		public Integer CBWKCRLength() {
			return 9;
		}

		public Integer CBWKCRPrecision() {
			return 2;
		}

		public String CBWKCRDefault() {

			return "";

		}

		public String CBWKCRComment() {

			return "";

		}

		public String CBWKCRPattern() {

			return "";

		}

		public String CBWKCROriginalDbColumnName() {

			return "CBWKCR";

		}

		public BigDecimal CBWK01;

		public BigDecimal getCBWK01() {
			return this.CBWK01;
		}

		public Boolean CBWK01IsNullable() {
			return false;
		}

		public Boolean CBWK01IsKey() {
			return false;
		}

		public Integer CBWK01Length() {
			return 9;
		}

		public Integer CBWK01Precision() {
			return 2;
		}

		public String CBWK01Default() {

			return "";

		}

		public String CBWK01Comment() {

			return "";

		}

		public String CBWK01Pattern() {

			return "";

		}

		public String CBWK01OriginalDbColumnName() {

			return "CBWK01";

		}

		public BigDecimal CBWK02;

		public BigDecimal getCBWK02() {
			return this.CBWK02;
		}

		public Boolean CBWK02IsNullable() {
			return false;
		}

		public Boolean CBWK02IsKey() {
			return false;
		}

		public Integer CBWK02Length() {
			return 9;
		}

		public Integer CBWK02Precision() {
			return 2;
		}

		public String CBWK02Default() {

			return "";

		}

		public String CBWK02Comment() {

			return "";

		}

		public String CBWK02Pattern() {

			return "";

		}

		public String CBWK02OriginalDbColumnName() {

			return "CBWK02";

		}

		public BigDecimal CBWK03;

		public BigDecimal getCBWK03() {
			return this.CBWK03;
		}

		public Boolean CBWK03IsNullable() {
			return false;
		}

		public Boolean CBWK03IsKey() {
			return false;
		}

		public Integer CBWK03Length() {
			return 9;
		}

		public Integer CBWK03Precision() {
			return 2;
		}

		public String CBWK03Default() {

			return "";

		}

		public String CBWK03Comment() {

			return "";

		}

		public String CBWK03Pattern() {

			return "";

		}

		public String CBWK03OriginalDbColumnName() {

			return "CBWK03";

		}

		public BigDecimal CBWK04;

		public BigDecimal getCBWK04() {
			return this.CBWK04;
		}

		public Boolean CBWK04IsNullable() {
			return false;
		}

		public Boolean CBWK04IsKey() {
			return false;
		}

		public Integer CBWK04Length() {
			return 9;
		}

		public Integer CBWK04Precision() {
			return 2;
		}

		public String CBWK04Default() {

			return "";

		}

		public String CBWK04Comment() {

			return "";

		}

		public String CBWK04Pattern() {

			return "";

		}

		public String CBWK04OriginalDbColumnName() {

			return "CBWK04";

		}

		public BigDecimal CBWK05;

		public BigDecimal getCBWK05() {
			return this.CBWK05;
		}

		public Boolean CBWK05IsNullable() {
			return false;
		}

		public Boolean CBWK05IsKey() {
			return false;
		}

		public Integer CBWK05Length() {
			return 9;
		}

		public Integer CBWK05Precision() {
			return 2;
		}

		public String CBWK05Default() {

			return "";

		}

		public String CBWK05Comment() {

			return "";

		}

		public String CBWK05Pattern() {

			return "";

		}

		public String CBWK05OriginalDbColumnName() {

			return "CBWK05";

		}

		public BigDecimal CBWK06;

		public BigDecimal getCBWK06() {
			return this.CBWK06;
		}

		public Boolean CBWK06IsNullable() {
			return false;
		}

		public Boolean CBWK06IsKey() {
			return false;
		}

		public Integer CBWK06Length() {
			return 9;
		}

		public Integer CBWK06Precision() {
			return 2;
		}

		public String CBWK06Default() {

			return "";

		}

		public String CBWK06Comment() {

			return "";

		}

		public String CBWK06Pattern() {

			return "";

		}

		public String CBWK06OriginalDbColumnName() {

			return "CBWK06";

		}

		public BigDecimal CBWK07;

		public BigDecimal getCBWK07() {
			return this.CBWK07;
		}

		public Boolean CBWK07IsNullable() {
			return false;
		}

		public Boolean CBWK07IsKey() {
			return false;
		}

		public Integer CBWK07Length() {
			return 9;
		}

		public Integer CBWK07Precision() {
			return 2;
		}

		public String CBWK07Default() {

			return "";

		}

		public String CBWK07Comment() {

			return "";

		}

		public String CBWK07Pattern() {

			return "";

		}

		public String CBWK07OriginalDbColumnName() {

			return "CBWK07";

		}

		public BigDecimal CBWK08;

		public BigDecimal getCBWK08() {
			return this.CBWK08;
		}

		public Boolean CBWK08IsNullable() {
			return false;
		}

		public Boolean CBWK08IsKey() {
			return false;
		}

		public Integer CBWK08Length() {
			return 9;
		}

		public Integer CBWK08Precision() {
			return 2;
		}

		public String CBWK08Default() {

			return "";

		}

		public String CBWK08Comment() {

			return "";

		}

		public String CBWK08Pattern() {

			return "";

		}

		public String CBWK08OriginalDbColumnName() {

			return "CBWK08";

		}

		public BigDecimal CBRSUP;

		public BigDecimal getCBRSUP() {
			return this.CBRSUP;
		}

		public Boolean CBRSUPIsNullable() {
			return false;
		}

		public Boolean CBRSUPIsKey() {
			return false;
		}

		public Integer CBRSUPLength() {
			return 9;
		}

		public Integer CBRSUPPrecision() {
			return 2;
		}

		public String CBRSUPDefault() {

			return "";

		}

		public String CBRSUPComment() {

			return "";

		}

		public String CBRSUPPattern() {

			return "";

		}

		public String CBRSUPOriginalDbColumnName() {

			return "CBRSUP";

		}

		public BigDecimal CBRSUY;

		public BigDecimal getCBRSUY() {
			return this.CBRSUY;
		}

		public Boolean CBRSUYIsNullable() {
			return false;
		}

		public Boolean CBRSUYIsKey() {
			return false;
		}

		public Integer CBRSUYLength() {
			return 9;
		}

		public Integer CBRSUYPrecision() {
			return 2;
		}

		public String CBRSUYDefault() {

			return "";

		}

		public String CBRSUYComment() {

			return "";

		}

		public String CBRSUYPattern() {

			return "";

		}

		public String CBRSUYOriginalDbColumnName() {

			return "CBRSUY";

		}

		public BigDecimal CBRSDP;

		public BigDecimal getCBRSDP() {
			return this.CBRSDP;
		}

		public Boolean CBRSDPIsNullable() {
			return false;
		}

		public Boolean CBRSDPIsKey() {
			return false;
		}

		public Integer CBRSDPLength() {
			return 11;
		}

		public Integer CBRSDPPrecision() {
			return 2;
		}

		public String CBRSDPDefault() {

			return "";

		}

		public String CBRSDPComment() {

			return "";

		}

		public String CBRSDPPattern() {

			return "";

		}

		public String CBRSDPOriginalDbColumnName() {

			return "CBRSDP";

		}

		public BigDecimal CBRSDY;

		public BigDecimal getCBRSDY() {
			return this.CBRSDY;
		}

		public Boolean CBRSDYIsNullable() {
			return false;
		}

		public Boolean CBRSDYIsKey() {
			return false;
		}

		public Integer CBRSDYLength() {
			return 11;
		}

		public Integer CBRSDYPrecision() {
			return 2;
		}

		public String CBRSDYDefault() {

			return "";

		}

		public String CBRSDYComment() {

			return "";

		}

		public String CBRSDYPattern() {

			return "";

		}

		public String CBRSDYOriginalDbColumnName() {

			return "CBRSDY";

		}

		public BigDecimal CBVRSP;

		public BigDecimal getCBVRSP() {
			return this.CBVRSP;
		}

		public Boolean CBVRSPIsNullable() {
			return false;
		}

		public Boolean CBVRSPIsKey() {
			return false;
		}

		public Integer CBVRSPLength() {
			return 11;
		}

		public Integer CBVRSPPrecision() {
			return 2;
		}

		public String CBVRSPDefault() {

			return "";

		}

		public String CBVRSPComment() {

			return "";

		}

		public String CBVRSPPattern() {

			return "";

		}

		public String CBVRSPOriginalDbColumnName() {

			return "CBVRSP";

		}

		public BigDecimal CBVRSY;

		public BigDecimal getCBVRSY() {
			return this.CBVRSY;
		}

		public Boolean CBVRSYIsNullable() {
			return false;
		}

		public Boolean CBVRSYIsKey() {
			return false;
		}

		public Integer CBVRSYLength() {
			return 11;
		}

		public Integer CBVRSYPrecision() {
			return 2;
		}

		public String CBVRSYDefault() {

			return "";

		}

		public String CBVRSYComment() {

			return "";

		}

		public String CBVRSYPattern() {

			return "";

		}

		public String CBVRSYOriginalDbColumnName() {

			return "CBVRSY";

		}

		public BigDecimal CBRCSP;

		public BigDecimal getCBRCSP() {
			return this.CBRCSP;
		}

		public Boolean CBRCSPIsNullable() {
			return false;
		}

		public Boolean CBRCSPIsKey() {
			return false;
		}

		public Integer CBRCSPLength() {
			return 11;
		}

		public Integer CBRCSPPrecision() {
			return 2;
		}

		public String CBRCSPDefault() {

			return "";

		}

		public String CBRCSPComment() {

			return "";

		}

		public String CBRCSPPattern() {

			return "";

		}

		public String CBRCSPOriginalDbColumnName() {

			return "CBRCSP";

		}

		public BigDecimal CBRCSY;

		public BigDecimal getCBRCSY() {
			return this.CBRCSY;
		}

		public Boolean CBRCSYIsNullable() {
			return false;
		}

		public Boolean CBRCSYIsKey() {
			return false;
		}

		public Integer CBRCSYLength() {
			return 11;
		}

		public Integer CBRCSYPrecision() {
			return 2;
		}

		public String CBRCSYDefault() {

			return "";

		}

		public String CBRCSYComment() {

			return "";

		}

		public String CBRCSYPattern() {

			return "";

		}

		public String CBRCSYOriginalDbColumnName() {

			return "CBRCSY";

		}

		public BigDecimal CBASUP;

		public BigDecimal getCBASUP() {
			return this.CBASUP;
		}

		public Boolean CBASUPIsNullable() {
			return false;
		}

		public Boolean CBASUPIsKey() {
			return false;
		}

		public Integer CBASUPLength() {
			return 9;
		}

		public Integer CBASUPPrecision() {
			return 2;
		}

		public String CBASUPDefault() {

			return "";

		}

		public String CBASUPComment() {

			return "";

		}

		public String CBASUPPattern() {

			return "";

		}

		public String CBASUPOriginalDbColumnName() {

			return "CBASUP";

		}

		public BigDecimal CBASUY;

		public BigDecimal getCBASUY() {
			return this.CBASUY;
		}

		public Boolean CBASUYIsNullable() {
			return false;
		}

		public Boolean CBASUYIsKey() {
			return false;
		}

		public Integer CBASUYLength() {
			return 9;
		}

		public Integer CBASUYPrecision() {
			return 2;
		}

		public String CBASUYDefault() {

			return "";

		}

		public String CBASUYComment() {

			return "";

		}

		public String CBASUYPattern() {

			return "";

		}

		public String CBASUYOriginalDbColumnName() {

			return "CBASUY";

		}

		public BigDecimal CBASDP;

		public BigDecimal getCBASDP() {
			return this.CBASDP;
		}

		public Boolean CBASDPIsNullable() {
			return false;
		}

		public Boolean CBASDPIsKey() {
			return false;
		}

		public Integer CBASDPLength() {
			return 11;
		}

		public Integer CBASDPPrecision() {
			return 2;
		}

		public String CBASDPDefault() {

			return "";

		}

		public String CBASDPComment() {

			return "";

		}

		public String CBASDPPattern() {

			return "";

		}

		public String CBASDPOriginalDbColumnName() {

			return "CBASDP";

		}

		public BigDecimal CBASDY;

		public BigDecimal getCBASDY() {
			return this.CBASDY;
		}

		public Boolean CBASDYIsNullable() {
			return false;
		}

		public Boolean CBASDYIsKey() {
			return false;
		}

		public Integer CBASDYLength() {
			return 11;
		}

		public Integer CBASDYPrecision() {
			return 2;
		}

		public String CBASDYDefault() {

			return "";

		}

		public String CBASDYComment() {

			return "";

		}

		public String CBASDYPattern() {

			return "";

		}

		public String CBASDYOriginalDbColumnName() {

			return "CBASDY";

		}

		public BigDecimal CBVASP;

		public BigDecimal getCBVASP() {
			return this.CBVASP;
		}

		public Boolean CBVASPIsNullable() {
			return false;
		}

		public Boolean CBVASPIsKey() {
			return false;
		}

		public Integer CBVASPLength() {
			return 11;
		}

		public Integer CBVASPPrecision() {
			return 2;
		}

		public String CBVASPDefault() {

			return "";

		}

		public String CBVASPComment() {

			return "";

		}

		public String CBVASPPattern() {

			return "";

		}

		public String CBVASPOriginalDbColumnName() {

			return "CBVASP";

		}

		public BigDecimal CBVASY;

		public BigDecimal getCBVASY() {
			return this.CBVASY;
		}

		public Boolean CBVASYIsNullable() {
			return false;
		}

		public Boolean CBVASYIsKey() {
			return false;
		}

		public Integer CBVASYLength() {
			return 11;
		}

		public Integer CBVASYPrecision() {
			return 2;
		}

		public String CBVASYDefault() {

			return "";

		}

		public String CBVASYComment() {

			return "";

		}

		public String CBVASYPattern() {

			return "";

		}

		public String CBVASYOriginalDbColumnName() {

			return "CBVASY";

		}

		public BigDecimal CBACSP;

		public BigDecimal getCBACSP() {
			return this.CBACSP;
		}

		public Boolean CBACSPIsNullable() {
			return false;
		}

		public Boolean CBACSPIsKey() {
			return false;
		}

		public Integer CBACSPLength() {
			return 11;
		}

		public Integer CBACSPPrecision() {
			return 2;
		}

		public String CBACSPDefault() {

			return "";

		}

		public String CBACSPComment() {

			return "";

		}

		public String CBACSPPattern() {

			return "";

		}

		public String CBACSPOriginalDbColumnName() {

			return "CBACSP";

		}

		public BigDecimal CBACSY;

		public BigDecimal getCBACSY() {
			return this.CBACSY;
		}

		public Boolean CBACSYIsNullable() {
			return false;
		}

		public Boolean CBACSYIsKey() {
			return false;
		}

		public Integer CBACSYLength() {
			return 11;
		}

		public Integer CBACSYPrecision() {
			return 2;
		}

		public String CBACSYDefault() {

			return "";

		}

		public String CBACSYComment() {

			return "";

		}

		public String CBACSYPattern() {

			return "";

		}

		public String CBACSYOriginalDbColumnName() {

			return "CBACSY";

		}

		public BigDecimal CBRETS;

		public BigDecimal getCBRETS() {
			return this.CBRETS;
		}

		public Boolean CBRETSIsNullable() {
			return false;
		}

		public Boolean CBRETSIsKey() {
			return false;
		}

		public Integer CBRETSLength() {
			return 9;
		}

		public Integer CBRETSPrecision() {
			return 2;
		}

		public String CBRETSDefault() {

			return "";

		}

		public String CBRETSComment() {

			return "";

		}

		public String CBRETSPattern() {

			return "";

		}

		public String CBRETSOriginalDbColumnName() {

			return "CBRETS";

		}

		public BigDecimal CBRCUP;

		public BigDecimal getCBRCUP() {
			return this.CBRCUP;
		}

		public Boolean CBRCUPIsNullable() {
			return false;
		}

		public Boolean CBRCUPIsKey() {
			return false;
		}

		public Integer CBRCUPLength() {
			return 9;
		}

		public Integer CBRCUPPrecision() {
			return 2;
		}

		public String CBRCUPDefault() {

			return "";

		}

		public String CBRCUPComment() {

			return "";

		}

		public String CBRCUPPattern() {

			return "";

		}

		public String CBRCUPOriginalDbColumnName() {

			return "CBRCUP";

		}

		public BigDecimal CBRCUY;

		public BigDecimal getCBRCUY() {
			return this.CBRCUY;
		}

		public Boolean CBRCUYIsNullable() {
			return false;
		}

		public Boolean CBRCUYIsKey() {
			return false;
		}

		public Integer CBRCUYLength() {
			return 9;
		}

		public Integer CBRCUYPrecision() {
			return 2;
		}

		public String CBRCUYDefault() {

			return "";

		}

		public String CBRCUYComment() {

			return "";

		}

		public String CBRCUYPattern() {

			return "";

		}

		public String CBRCUYOriginalDbColumnName() {

			return "CBRCUY";

		}

		public BigDecimal CBRCDP;

		public BigDecimal getCBRCDP() {
			return this.CBRCDP;
		}

		public Boolean CBRCDPIsNullable() {
			return false;
		}

		public Boolean CBRCDPIsKey() {
			return false;
		}

		public Integer CBRCDPLength() {
			return 11;
		}

		public Integer CBRCDPPrecision() {
			return 2;
		}

		public String CBRCDPDefault() {

			return "";

		}

		public String CBRCDPComment() {

			return "";

		}

		public String CBRCDPPattern() {

			return "";

		}

		public String CBRCDPOriginalDbColumnName() {

			return "CBRCDP";

		}

		public BigDecimal CBRCDY;

		public BigDecimal getCBRCDY() {
			return this.CBRCDY;
		}

		public Boolean CBRCDYIsNullable() {
			return false;
		}

		public Boolean CBRCDYIsKey() {
			return false;
		}

		public Integer CBRCDYLength() {
			return 11;
		}

		public Integer CBRCDYPrecision() {
			return 2;
		}

		public String CBRCDYDefault() {

			return "";

		}

		public String CBRCDYComment() {

			return "";

		}

		public String CBRCDYPattern() {

			return "";

		}

		public String CBRCDYOriginalDbColumnName() {

			return "CBRCDY";

		}

		public BigDecimal CBTIUP;

		public BigDecimal getCBTIUP() {
			return this.CBTIUP;
		}

		public Boolean CBTIUPIsNullable() {
			return false;
		}

		public Boolean CBTIUPIsKey() {
			return false;
		}

		public Integer CBTIUPLength() {
			return 9;
		}

		public Integer CBTIUPPrecision() {
			return 2;
		}

		public String CBTIUPDefault() {

			return "";

		}

		public String CBTIUPComment() {

			return "";

		}

		public String CBTIUPPattern() {

			return "";

		}

		public String CBTIUPOriginalDbColumnName() {

			return "CBTIUP";

		}

		public BigDecimal CBTIUY;

		public BigDecimal getCBTIUY() {
			return this.CBTIUY;
		}

		public Boolean CBTIUYIsNullable() {
			return false;
		}

		public Boolean CBTIUYIsKey() {
			return false;
		}

		public Integer CBTIUYLength() {
			return 9;
		}

		public Integer CBTIUYPrecision() {
			return 2;
		}

		public String CBTIUYDefault() {

			return "";

		}

		public String CBTIUYComment() {

			return "";

		}

		public String CBTIUYPattern() {

			return "";

		}

		public String CBTIUYOriginalDbColumnName() {

			return "CBTIUY";

		}

		public BigDecimal CBTOUP;

		public BigDecimal getCBTOUP() {
			return this.CBTOUP;
		}

		public Boolean CBTOUPIsNullable() {
			return false;
		}

		public Boolean CBTOUPIsKey() {
			return false;
		}

		public Integer CBTOUPLength() {
			return 9;
		}

		public Integer CBTOUPPrecision() {
			return 2;
		}

		public String CBTOUPDefault() {

			return "";

		}

		public String CBTOUPComment() {

			return "";

		}

		public String CBTOUPPattern() {

			return "";

		}

		public String CBTOUPOriginalDbColumnName() {

			return "CBTOUP";

		}

		public BigDecimal CBTOUY;

		public BigDecimal getCBTOUY() {
			return this.CBTOUY;
		}

		public Boolean CBTOUYIsNullable() {
			return false;
		}

		public Boolean CBTOUYIsKey() {
			return false;
		}

		public Integer CBTOUYLength() {
			return 9;
		}

		public Integer CBTOUYPrecision() {
			return 2;
		}

		public String CBTOUYDefault() {

			return "";

		}

		public String CBTOUYComment() {

			return "";

		}

		public String CBTOUYPattern() {

			return "";

		}

		public String CBTOUYOriginalDbColumnName() {

			return "CBTOUY";

		}

		public BigDecimal CBTFDP;

		public BigDecimal getCBTFDP() {
			return this.CBTFDP;
		}

		public Boolean CBTFDPIsNullable() {
			return false;
		}

		public Boolean CBTFDPIsKey() {
			return false;
		}

		public Integer CBTFDPLength() {
			return 11;
		}

		public Integer CBTFDPPrecision() {
			return 2;
		}

		public String CBTFDPDefault() {

			return "";

		}

		public String CBTFDPComment() {

			return "";

		}

		public String CBTFDPPattern() {

			return "";

		}

		public String CBTFDPOriginalDbColumnName() {

			return "CBTFDP";

		}

		public BigDecimal CBTFDY;

		public BigDecimal getCBTFDY() {
			return this.CBTFDY;
		}

		public Boolean CBTFDYIsNullable() {
			return false;
		}

		public Boolean CBTFDYIsKey() {
			return false;
		}

		public Integer CBTFDYLength() {
			return 11;
		}

		public Integer CBTFDYPrecision() {
			return 2;
		}

		public String CBTFDYDefault() {

			return "";

		}

		public String CBTFDYComment() {

			return "";

		}

		public String CBTFDYPattern() {

			return "";

		}

		public String CBTFDYOriginalDbColumnName() {

			return "CBTFDY";

		}

		public BigDecimal CBRVUP;

		public BigDecimal getCBRVUP() {
			return this.CBRVUP;
		}

		public Boolean CBRVUPIsNullable() {
			return false;
		}

		public Boolean CBRVUPIsKey() {
			return false;
		}

		public Integer CBRVUPLength() {
			return 9;
		}

		public Integer CBRVUPPrecision() {
			return 2;
		}

		public String CBRVUPDefault() {

			return "";

		}

		public String CBRVUPComment() {

			return "";

		}

		public String CBRVUPPattern() {

			return "";

		}

		public String CBRVUPOriginalDbColumnName() {

			return "CBRVUP";

		}

		public BigDecimal CBRVUY;

		public BigDecimal getCBRVUY() {
			return this.CBRVUY;
		}

		public Boolean CBRVUYIsNullable() {
			return false;
		}

		public Boolean CBRVUYIsKey() {
			return false;
		}

		public Integer CBRVUYLength() {
			return 9;
		}

		public Integer CBRVUYPrecision() {
			return 2;
		}

		public String CBRVUYDefault() {

			return "";

		}

		public String CBRVUYComment() {

			return "";

		}

		public String CBRVUYPattern() {

			return "";

		}

		public String CBRVUYOriginalDbColumnName() {

			return "CBRVUY";

		}

		public BigDecimal CBRVDP;

		public BigDecimal getCBRVDP() {
			return this.CBRVDP;
		}

		public Boolean CBRVDPIsNullable() {
			return false;
		}

		public Boolean CBRVDPIsKey() {
			return false;
		}

		public Integer CBRVDPLength() {
			return 11;
		}

		public Integer CBRVDPPrecision() {
			return 2;
		}

		public String CBRVDPDefault() {

			return "";

		}

		public String CBRVDPComment() {

			return "";

		}

		public String CBRVDPPattern() {

			return "";

		}

		public String CBRVDPOriginalDbColumnName() {

			return "CBRVDP";

		}

		public BigDecimal CBRVDY;

		public BigDecimal getCBRVDY() {
			return this.CBRVDY;
		}

		public Boolean CBRVDYIsNullable() {
			return false;
		}

		public Boolean CBRVDYIsKey() {
			return false;
		}

		public Integer CBRVDYLength() {
			return 11;
		}

		public Integer CBRVDYPrecision() {
			return 2;
		}

		public String CBRVDYDefault() {

			return "";

		}

		public String CBRVDYComment() {

			return "";

		}

		public String CBRVDYPattern() {

			return "";

		}

		public String CBRVDYOriginalDbColumnName() {

			return "CBRVDY";

		}

		public BigDecimal CBAJUP;

		public BigDecimal getCBAJUP() {
			return this.CBAJUP;
		}

		public Boolean CBAJUPIsNullable() {
			return false;
		}

		public Boolean CBAJUPIsKey() {
			return false;
		}

		public Integer CBAJUPLength() {
			return 9;
		}

		public Integer CBAJUPPrecision() {
			return 2;
		}

		public String CBAJUPDefault() {

			return "";

		}

		public String CBAJUPComment() {

			return "";

		}

		public String CBAJUPPattern() {

			return "";

		}

		public String CBAJUPOriginalDbColumnName() {

			return "CBAJUP";

		}

		public BigDecimal CBAJUY;

		public BigDecimal getCBAJUY() {
			return this.CBAJUY;
		}

		public Boolean CBAJUYIsNullable() {
			return false;
		}

		public Boolean CBAJUYIsKey() {
			return false;
		}

		public Integer CBAJUYLength() {
			return 9;
		}

		public Integer CBAJUYPrecision() {
			return 2;
		}

		public String CBAJUYDefault() {

			return "";

		}

		public String CBAJUYComment() {

			return "";

		}

		public String CBAJUYPattern() {

			return "";

		}

		public String CBAJUYOriginalDbColumnName() {

			return "CBAJUY";

		}

		public BigDecimal CBAJDP;

		public BigDecimal getCBAJDP() {
			return this.CBAJDP;
		}

		public Boolean CBAJDPIsNullable() {
			return false;
		}

		public Boolean CBAJDPIsKey() {
			return false;
		}

		public Integer CBAJDPLength() {
			return 11;
		}

		public Integer CBAJDPPrecision() {
			return 2;
		}

		public String CBAJDPDefault() {

			return "";

		}

		public String CBAJDPComment() {

			return "";

		}

		public String CBAJDPPattern() {

			return "";

		}

		public String CBAJDPOriginalDbColumnName() {

			return "CBAJDP";

		}

		public BigDecimal CBAJDY;

		public BigDecimal getCBAJDY() {
			return this.CBAJDY;
		}

		public Boolean CBAJDYIsNullable() {
			return false;
		}

		public Boolean CBAJDYIsKey() {
			return false;
		}

		public Integer CBAJDYLength() {
			return 11;
		}

		public Integer CBAJDYPrecision() {
			return 2;
		}

		public String CBAJDYDefault() {

			return "";

		}

		public String CBAJDYComment() {

			return "";

		}

		public String CBAJDYPattern() {

			return "";

		}

		public String CBAJDYOriginalDbColumnName() {

			return "CBAJDY";

		}

		public BigDecimal CBPHUP;

		public BigDecimal getCBPHUP() {
			return this.CBPHUP;
		}

		public Boolean CBPHUPIsNullable() {
			return false;
		}

		public Boolean CBPHUPIsKey() {
			return false;
		}

		public Integer CBPHUPLength() {
			return 9;
		}

		public Integer CBPHUPPrecision() {
			return 2;
		}

		public String CBPHUPDefault() {

			return "";

		}

		public String CBPHUPComment() {

			return "";

		}

		public String CBPHUPPattern() {

			return "";

		}

		public String CBPHUPOriginalDbColumnName() {

			return "CBPHUP";

		}

		public BigDecimal CBPHUY;

		public BigDecimal getCBPHUY() {
			return this.CBPHUY;
		}

		public Boolean CBPHUYIsNullable() {
			return false;
		}

		public Boolean CBPHUYIsKey() {
			return false;
		}

		public Integer CBPHUYLength() {
			return 9;
		}

		public Integer CBPHUYPrecision() {
			return 2;
		}

		public String CBPHUYDefault() {

			return "";

		}

		public String CBPHUYComment() {

			return "";

		}

		public String CBPHUYPattern() {

			return "";

		}

		public String CBPHUYOriginalDbColumnName() {

			return "CBPHUY";

		}

		public BigDecimal CBPHDP;

		public BigDecimal getCBPHDP() {
			return this.CBPHDP;
		}

		public Boolean CBPHDPIsNullable() {
			return false;
		}

		public Boolean CBPHDPIsKey() {
			return false;
		}

		public Integer CBPHDPLength() {
			return 11;
		}

		public Integer CBPHDPPrecision() {
			return 2;
		}

		public String CBPHDPDefault() {

			return "";

		}

		public String CBPHDPComment() {

			return "";

		}

		public String CBPHDPPattern() {

			return "";

		}

		public String CBPHDPOriginalDbColumnName() {

			return "CBPHDP";

		}

		public BigDecimal CBPHDY;

		public BigDecimal getCBPHDY() {
			return this.CBPHDY;
		}

		public Boolean CBPHDYIsNullable() {
			return false;
		}

		public Boolean CBPHDYIsKey() {
			return false;
		}

		public Integer CBPHDYLength() {
			return 11;
		}

		public Integer CBPHDYPrecision() {
			return 2;
		}

		public String CBPHDYDefault() {

			return "";

		}

		public String CBPHDYComment() {

			return "";

		}

		public String CBPHDYPattern() {

			return "";

		}

		public String CBPHDYOriginalDbColumnName() {

			return "CBPHDY";

		}

		public BigDecimal CBAVGC;

		public BigDecimal getCBAVGC() {
			return this.CBAVGC;
		}

		public Boolean CBAVGCIsNullable() {
			return false;
		}

		public Boolean CBAVGCIsKey() {
			return false;
		}

		public Integer CBAVGCLength() {
			return 11;
		}

		public Integer CBAVGCPrecision() {
			return 4;
		}

		public String CBAVGCDefault() {

			return "";

		}

		public String CBAVGCComment() {

			return "";

		}

		public String CBAVGCPattern() {

			return "";

		}

		public String CBAVGCOriginalDbColumnName() {

			return "CBAVGC";

		}

		public BigDecimal CBAVOH;

		public BigDecimal getCBAVOH() {
			return this.CBAVOH;
		}

		public Boolean CBAVOHIsNullable() {
			return false;
		}

		public Boolean CBAVOHIsKey() {
			return false;
		}

		public Integer CBAVOHLength() {
			return 9;
		}

		public Integer CBAVOHPrecision() {
			return 2;
		}

		public String CBAVOHDefault() {

			return "";

		}

		public String CBAVOHComment() {

			return "";

		}

		public String CBAVOHPattern() {

			return "";

		}

		public String CBAVOHOriginalDbColumnName() {

			return "CBAVOH";

		}

		public BigDecimal CBAVRT;

		public BigDecimal getCBAVRT() {
			return this.CBAVRT;
		}

		public Boolean CBAVRTIsNullable() {
			return false;
		}

		public Boolean CBAVRTIsKey() {
			return false;
		}

		public Integer CBAVRTLength() {
			return 11;
		}

		public Integer CBAVRTPrecision() {
			return 2;
		}

		public String CBAVRTDefault() {

			return "";

		}

		public String CBAVRTComment() {

			return "";

		}

		public String CBAVRTPattern() {

			return "";

		}

		public String CBAVRTOriginalDbColumnName() {

			return "CBAVRT";

		}

		public BigDecimal CBAVCS;

		public BigDecimal getCBAVCS() {
			return this.CBAVCS;
		}

		public Boolean CBAVCSIsNullable() {
			return false;
		}

		public Boolean CBAVCSIsKey() {
			return false;
		}

		public Integer CBAVCSLength() {
			return 11;
		}

		public Integer CBAVCSPrecision() {
			return 3;
		}

		public String CBAVCSDefault() {

			return "";

		}

		public String CBAVCSComment() {

			return "";

		}

		public String CBAVCSPattern() {

			return "";

		}

		public String CBAVCSOriginalDbColumnName() {

			return "CBAVCS";

		}

		public BigDecimal CBDEPT;

		public BigDecimal getCBDEPT() {
			return this.CBDEPT;
		}

		public Boolean CBDEPTIsNullable() {
			return false;
		}

		public Boolean CBDEPTIsKey() {
			return false;
		}

		public Integer CBDEPTLength() {
			return 3;
		}

		public Integer CBDEPTPrecision() {
			return 0;
		}

		public String CBDEPTDefault() {

			return "";

		}

		public String CBDEPTComment() {

			return "";

		}

		public String CBDEPTPattern() {

			return "";

		}

		public String CBDEPTOriginalDbColumnName() {

			return "CBDEPT";

		}

		public BigDecimal CBSDPT;

		public BigDecimal getCBSDPT() {
			return this.CBSDPT;
		}

		public Boolean CBSDPTIsNullable() {
			return false;
		}

		public Boolean CBSDPTIsKey() {
			return false;
		}

		public Integer CBSDPTLength() {
			return 3;
		}

		public Integer CBSDPTPrecision() {
			return 0;
		}

		public String CBSDPTDefault() {

			return "";

		}

		public String CBSDPTComment() {

			return "";

		}

		public String CBSDPTPattern() {

			return "";

		}

		public String CBSDPTOriginalDbColumnName() {

			return "CBSDPT";

		}

		public BigDecimal CBCLAS;

		public BigDecimal getCBCLAS() {
			return this.CBCLAS;
		}

		public Boolean CBCLASIsNullable() {
			return false;
		}

		public Boolean CBCLASIsKey() {
			return false;
		}

		public Integer CBCLASLength() {
			return 3;
		}

		public Integer CBCLASPrecision() {
			return 0;
		}

		public String CBCLASDefault() {

			return "";

		}

		public String CBCLASComment() {

			return "";

		}

		public String CBCLASPattern() {

			return "";

		}

		public String CBCLASOriginalDbColumnName() {

			return "CBCLAS";

		}

		public BigDecimal CBSCLS;

		public BigDecimal getCBSCLS() {
			return this.CBSCLS;
		}

		public Boolean CBSCLSIsNullable() {
			return false;
		}

		public Boolean CBSCLSIsKey() {
			return false;
		}

		public Integer CBSCLSLength() {
			return 3;
		}

		public Integer CBSCLSPrecision() {
			return 0;
		}

		public String CBSCLSDefault() {

			return "";

		}

		public String CBSCLSComment() {

			return "";

		}

		public String CBSCLSPattern() {

			return "";

		}

		public String CBSCLSOriginalDbColumnName() {

			return "CBSCLS";

		}

		public BigDecimal CBVNDR;

		public BigDecimal getCBVNDR() {
			return this.CBVNDR;
		}

		public Boolean CBVNDRIsNullable() {
			return false;
		}

		public Boolean CBVNDRIsKey() {
			return false;
		}

		public Integer CBVNDRLength() {
			return 6;
		}

		public Integer CBVNDRPrecision() {
			return 0;
		}

		public String CBVNDRDefault() {

			return "";

		}

		public String CBVNDRComment() {

			return "";

		}

		public String CBVNDRPattern() {

			return "";

		}

		public String CBVNDROriginalDbColumnName() {

			return "CBVNDR";

		}

		public String CBSTYL;

		public String getCBSTYL() {
			return this.CBSTYL;
		}

		public Boolean CBSTYLIsNullable() {
			return false;
		}

		public Boolean CBSTYLIsKey() {
			return false;
		}

		public Integer CBSTYLLength() {
			return 15;
		}

		public Integer CBSTYLPrecision() {
			return 0;
		}

		public String CBSTYLDefault() {

			return "";

		}

		public String CBSTYLComment() {

			return "";

		}

		public String CBSTYLPattern() {

			return "";

		}

		public String CBSTYLOriginalDbColumnName() {

			return "CBSTYL";

		}

		public BigDecimal CBPOOQ;

		public BigDecimal getCBPOOQ() {
			return this.CBPOOQ;
		}

		public Boolean CBPOOQIsNullable() {
			return false;
		}

		public Boolean CBPOOQIsKey() {
			return false;
		}

		public Integer CBPOOQLength() {
			return 9;
		}

		public Integer CBPOOQPrecision() {
			return 2;
		}

		public String CBPOOQDefault() {

			return "";

		}

		public String CBPOOQComment() {

			return "";

		}

		public String CBPOOQPattern() {

			return "";

		}

		public String CBPOOQOriginalDbColumnName() {

			return "CBPOOQ";

		}

		public BigDecimal CBTOOQ;

		public BigDecimal getCBTOOQ() {
			return this.CBTOOQ;
		}

		public Boolean CBTOOQIsNullable() {
			return false;
		}

		public Boolean CBTOOQIsKey() {
			return false;
		}

		public Integer CBTOOQLength() {
			return 9;
		}

		public Integer CBTOOQPrecision() {
			return 2;
		}

		public String CBTOOQDefault() {

			return "";

		}

		public String CBTOOQComment() {

			return "";

		}

		public String CBTOOQPattern() {

			return "";

		}

		public String CBTOOQOriginalDbColumnName() {

			return "CBTOOQ";

		}

		public BigDecimal CBINTQ;

		public BigDecimal getCBINTQ() {
			return this.CBINTQ;
		}

		public Boolean CBINTQIsNullable() {
			return false;
		}

		public Boolean CBINTQIsKey() {
			return false;
		}

		public Integer CBINTQLength() {
			return 9;
		}

		public Integer CBINTQPrecision() {
			return 2;
		}

		public String CBINTQDefault() {

			return "";

		}

		public String CBINTQComment() {

			return "";

		}

		public String CBINTQPattern() {

			return "";

		}

		public String CBINTQOriginalDbColumnName() {

			return "CBINTQ";

		}

		public BigDecimal CBMASU;

		public BigDecimal getCBMASU() {
			return this.CBMASU;
		}

		public Boolean CBMASUIsNullable() {
			return false;
		}

		public Boolean CBMASUIsKey() {
			return false;
		}

		public Integer CBMASULength() {
			return 9;
		}

		public Integer CBMASUPrecision() {
			return 2;
		}

		public String CBMASUDefault() {

			return "";

		}

		public String CBMASUComment() {

			return "";

		}

		public String CBMASUPattern() {

			return "";

		}

		public String CBMASUOriginalDbColumnName() {

			return "CBMASU";

		}

		public BigDecimal CBMASD;

		public BigDecimal getCBMASD() {
			return this.CBMASD;
		}

		public Boolean CBMASDIsNullable() {
			return false;
		}

		public Boolean CBMASDIsKey() {
			return false;
		}

		public Integer CBMASDLength() {
			return 11;
		}

		public Integer CBMASDPrecision() {
			return 2;
		}

		public String CBMASDDefault() {

			return "";

		}

		public String CBMASDComment() {

			return "";

		}

		public String CBMASDPattern() {

			return "";

		}

		public String CBMASDOriginalDbColumnName() {

			return "CBMASD";

		}

		public BigDecimal CBMASV;

		public BigDecimal getCBMASV() {
			return this.CBMASV;
		}

		public Boolean CBMASVIsNullable() {
			return false;
		}

		public Boolean CBMASVIsKey() {
			return false;
		}

		public Integer CBMASVLength() {
			return 11;
		}

		public Integer CBMASVPrecision() {
			return 2;
		}

		public String CBMASVDefault() {

			return "";

		}

		public String CBMASVComment() {

			return "";

		}

		public String CBMASVPattern() {

			return "";

		}

		public String CBMASVOriginalDbColumnName() {

			return "CBMASV";

		}

		public BigDecimal CBMASC;

		public BigDecimal getCBMASC() {
			return this.CBMASC;
		}

		public Boolean CBMASCIsNullable() {
			return false;
		}

		public Boolean CBMASCIsKey() {
			return false;
		}

		public Integer CBMASCLength() {
			return 11;
		}

		public Integer CBMASCPrecision() {
			return 2;
		}

		public String CBMASCDefault() {

			return "";

		}

		public String CBMASCComment() {

			return "";

		}

		public String CBMASCPattern() {

			return "";

		}

		public String CBMASCOriginalDbColumnName() {

			return "CBMASC";

		}

		public BigDecimal CBLAVC;

		public BigDecimal getCBLAVC() {
			return this.CBLAVC;
		}

		public Boolean CBLAVCIsNullable() {
			return false;
		}

		public Boolean CBLAVCIsKey() {
			return false;
		}

		public Integer CBLAVCLength() {
			return 11;
		}

		public Integer CBLAVCPrecision() {
			return 4;
		}

		public String CBLAVCDefault() {

			return "";

		}

		public String CBLAVCComment() {

			return "";

		}

		public String CBLAVCPattern() {

			return "";

		}

		public String CBLAVCOriginalDbColumnName() {

			return "CBLAVC";

		}

		public BigDecimal CBARQT;

		public BigDecimal getCBARQT() {
			return this.CBARQT;
		}

		public Boolean CBARQTIsNullable() {
			return false;
		}

		public Boolean CBARQTIsKey() {
			return false;
		}

		public Integer CBARQTLength() {
			return 9;
		}

		public Integer CBARQTPrecision() {
			return 2;
		}

		public String CBARQTDefault() {

			return "";

		}

		public String CBARQTComment() {

			return "";

		}

		public String CBARQTPattern() {

			return "";

		}

		public String CBARQTOriginalDbColumnName() {

			return "CBARQT";

		}

		public BigDecimal CBNSQT;

		public BigDecimal getCBNSQT() {
			return this.CBNSQT;
		}

		public Boolean CBNSQTIsNullable() {
			return false;
		}

		public Boolean CBNSQTIsKey() {
			return false;
		}

		public Integer CBNSQTLength() {
			return 9;
		}

		public Integer CBNSQTPrecision() {
			return 2;
		}

		public String CBNSQTDefault() {

			return "";

		}

		public String CBNSQTComment() {

			return "";

		}

		public String CBNSQTPattern() {

			return "";

		}

		public String CBNSQTOriginalDbColumnName() {

			return "CBNSQT";

		}

		public BigDecimal CBHLDQ;

		public BigDecimal getCBHLDQ() {
			return this.CBHLDQ;
		}

		public Boolean CBHLDQIsNullable() {
			return false;
		}

		public Boolean CBHLDQIsKey() {
			return false;
		}

		public Integer CBHLDQLength() {
			return 9;
		}

		public Integer CBHLDQPrecision() {
			return 2;
		}

		public String CBHLDQDefault() {

			return "";

		}

		public String CBHLDQComment() {

			return "";

		}

		public String CBHLDQPattern() {

			return "";

		}

		public String CBHLDQOriginalDbColumnName() {

			return "CBHLDQ";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",CBHBOY=" + String.valueOf(CBHBOY));
			sb.append(",CBHBOP=" + String.valueOf(CBHBOP));
			sb.append(",CBHAND=" + String.valueOf(CBHAND));
			sb.append(",CBTRNS=" + String.valueOf(CBTRNS));
			sb.append(",CBGMRI=" + String.valueOf(CBGMRI));
			sb.append(",CBWKCR=" + String.valueOf(CBWKCR));
			sb.append(",CBWK01=" + String.valueOf(CBWK01));
			sb.append(",CBWK02=" + String.valueOf(CBWK02));
			sb.append(",CBWK03=" + String.valueOf(CBWK03));
			sb.append(",CBWK04=" + String.valueOf(CBWK04));
			sb.append(",CBWK05=" + String.valueOf(CBWK05));
			sb.append(",CBWK06=" + String.valueOf(CBWK06));
			sb.append(",CBWK07=" + String.valueOf(CBWK07));
			sb.append(",CBWK08=" + String.valueOf(CBWK08));
			sb.append(",CBRSUP=" + String.valueOf(CBRSUP));
			sb.append(",CBRSUY=" + String.valueOf(CBRSUY));
			sb.append(",CBRSDP=" + String.valueOf(CBRSDP));
			sb.append(",CBRSDY=" + String.valueOf(CBRSDY));
			sb.append(",CBVRSP=" + String.valueOf(CBVRSP));
			sb.append(",CBVRSY=" + String.valueOf(CBVRSY));
			sb.append(",CBRCSP=" + String.valueOf(CBRCSP));
			sb.append(",CBRCSY=" + String.valueOf(CBRCSY));
			sb.append(",CBASUP=" + String.valueOf(CBASUP));
			sb.append(",CBASUY=" + String.valueOf(CBASUY));
			sb.append(",CBASDP=" + String.valueOf(CBASDP));
			sb.append(",CBASDY=" + String.valueOf(CBASDY));
			sb.append(",CBVASP=" + String.valueOf(CBVASP));
			sb.append(",CBVASY=" + String.valueOf(CBVASY));
			sb.append(",CBACSP=" + String.valueOf(CBACSP));
			sb.append(",CBACSY=" + String.valueOf(CBACSY));
			sb.append(",CBRETS=" + String.valueOf(CBRETS));
			sb.append(",CBRCUP=" + String.valueOf(CBRCUP));
			sb.append(",CBRCUY=" + String.valueOf(CBRCUY));
			sb.append(",CBRCDP=" + String.valueOf(CBRCDP));
			sb.append(",CBRCDY=" + String.valueOf(CBRCDY));
			sb.append(",CBTIUP=" + String.valueOf(CBTIUP));
			sb.append(",CBTIUY=" + String.valueOf(CBTIUY));
			sb.append(",CBTOUP=" + String.valueOf(CBTOUP));
			sb.append(",CBTOUY=" + String.valueOf(CBTOUY));
			sb.append(",CBTFDP=" + String.valueOf(CBTFDP));
			sb.append(",CBTFDY=" + String.valueOf(CBTFDY));
			sb.append(",CBRVUP=" + String.valueOf(CBRVUP));
			sb.append(",CBRVUY=" + String.valueOf(CBRVUY));
			sb.append(",CBRVDP=" + String.valueOf(CBRVDP));
			sb.append(",CBRVDY=" + String.valueOf(CBRVDY));
			sb.append(",CBAJUP=" + String.valueOf(CBAJUP));
			sb.append(",CBAJUY=" + String.valueOf(CBAJUY));
			sb.append(",CBAJDP=" + String.valueOf(CBAJDP));
			sb.append(",CBAJDY=" + String.valueOf(CBAJDY));
			sb.append(",CBPHUP=" + String.valueOf(CBPHUP));
			sb.append(",CBPHUY=" + String.valueOf(CBPHUY));
			sb.append(",CBPHDP=" + String.valueOf(CBPHDP));
			sb.append(",CBPHDY=" + String.valueOf(CBPHDY));
			sb.append(",CBAVGC=" + String.valueOf(CBAVGC));
			sb.append(",CBAVOH=" + String.valueOf(CBAVOH));
			sb.append(",CBAVRT=" + String.valueOf(CBAVRT));
			sb.append(",CBAVCS=" + String.valueOf(CBAVCS));
			sb.append(",CBDEPT=" + String.valueOf(CBDEPT));
			sb.append(",CBSDPT=" + String.valueOf(CBSDPT));
			sb.append(",CBCLAS=" + String.valueOf(CBCLAS));
			sb.append(",CBSCLS=" + String.valueOf(CBSCLS));
			sb.append(",CBVNDR=" + String.valueOf(CBVNDR));
			sb.append(",CBSTYL=" + CBSTYL);
			sb.append(",CBPOOQ=" + String.valueOf(CBPOOQ));
			sb.append(",CBTOOQ=" + String.valueOf(CBTOOQ));
			sb.append(",CBINTQ=" + String.valueOf(CBINTQ));
			sb.append(",CBMASU=" + String.valueOf(CBMASU));
			sb.append(",CBMASD=" + String.valueOf(CBMASD));
			sb.append(",CBMASV=" + String.valueOf(CBMASV));
			sb.append(",CBMASC=" + String.valueOf(CBMASC));
			sb.append(",CBLAVC=" + String.valueOf(CBLAVC));
			sb.append(",CBARQT=" + String.valueOf(CBARQT));
			sb.append(",CBNSQT=" + String.valueOf(CBNSQT));
			sb.append(",CBHLDQ=" + String.valueOf(CBHLDQ));
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

			if (CBHBOY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOY);
			}

			sb.append("|");

			if (CBHBOP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOP);
			}

			sb.append("|");

			if (CBHAND == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHAND);
			}

			sb.append("|");

			if (CBTRNS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTRNS);
			}

			sb.append("|");

			if (CBGMRI == null) {
				sb.append("<null>");
			} else {
				sb.append(CBGMRI);
			}

			sb.append("|");

			if (CBWKCR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWKCR);
			}

			sb.append("|");

			if (CBWK01 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK01);
			}

			sb.append("|");

			if (CBWK02 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK02);
			}

			sb.append("|");

			if (CBWK03 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK03);
			}

			sb.append("|");

			if (CBWK04 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK04);
			}

			sb.append("|");

			if (CBWK05 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK05);
			}

			sb.append("|");

			if (CBWK06 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK06);
			}

			sb.append("|");

			if (CBWK07 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK07);
			}

			sb.append("|");

			if (CBWK08 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK08);
			}

			sb.append("|");

			if (CBRSUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUP);
			}

			sb.append("|");

			if (CBRSUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUY);
			}

			sb.append("|");

			if (CBRSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDP);
			}

			sb.append("|");

			if (CBRSDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDY);
			}

			sb.append("|");

			if (CBVRSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSP);
			}

			sb.append("|");

			if (CBVRSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSY);
			}

			sb.append("|");

			if (CBRCSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSP);
			}

			sb.append("|");

			if (CBRCSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSY);
			}

			sb.append("|");

			if (CBASUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUP);
			}

			sb.append("|");

			if (CBASUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUY);
			}

			sb.append("|");

			if (CBASDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDP);
			}

			sb.append("|");

			if (CBASDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDY);
			}

			sb.append("|");

			if (CBVASP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASP);
			}

			sb.append("|");

			if (CBVASY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASY);
			}

			sb.append("|");

			if (CBACSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSP);
			}

			sb.append("|");

			if (CBACSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSY);
			}

			sb.append("|");

			if (CBRETS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRETS);
			}

			sb.append("|");

			if (CBRCUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUP);
			}

			sb.append("|");

			if (CBRCUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUY);
			}

			sb.append("|");

			if (CBRCDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDP);
			}

			sb.append("|");

			if (CBRCDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDY);
			}

			sb.append("|");

			if (CBTIUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUP);
			}

			sb.append("|");

			if (CBTIUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUY);
			}

			sb.append("|");

			if (CBTOUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUP);
			}

			sb.append("|");

			if (CBTOUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUY);
			}

			sb.append("|");

			if (CBTFDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDP);
			}

			sb.append("|");

			if (CBTFDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDY);
			}

			sb.append("|");

			if (CBRVUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUP);
			}

			sb.append("|");

			if (CBRVUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUY);
			}

			sb.append("|");

			if (CBRVDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDP);
			}

			sb.append("|");

			if (CBRVDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDY);
			}

			sb.append("|");

			if (CBAJUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUP);
			}

			sb.append("|");

			if (CBAJUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUY);
			}

			sb.append("|");

			if (CBAJDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDP);
			}

			sb.append("|");

			if (CBAJDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDY);
			}

			sb.append("|");

			if (CBPHUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUP);
			}

			sb.append("|");

			if (CBPHUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUY);
			}

			sb.append("|");

			if (CBPHDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDP);
			}

			sb.append("|");

			if (CBPHDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDY);
			}

			sb.append("|");

			if (CBAVGC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVGC);
			}

			sb.append("|");

			if (CBAVOH == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVOH);
			}

			sb.append("|");

			if (CBAVRT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVRT);
			}

			sb.append("|");

			if (CBAVCS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVCS);
			}

			sb.append("|");

			if (CBDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBDEPT);
			}

			sb.append("|");

			if (CBSDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSDPT);
			}

			sb.append("|");

			if (CBCLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBCLAS);
			}

			sb.append("|");

			if (CBSCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSCLS);
			}

			sb.append("|");

			if (CBVNDR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVNDR);
			}

			sb.append("|");

			if (CBSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSTYL);
			}

			sb.append("|");

			if (CBPOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPOOQ);
			}

			sb.append("|");

			if (CBTOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOOQ);
			}

			sb.append("|");

			if (CBINTQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBINTQ);
			}

			sb.append("|");

			if (CBMASU == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASU);
			}

			sb.append("|");

			if (CBMASD == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASD);
			}

			sb.append("|");

			if (CBMASV == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASV);
			}

			sb.append("|");

			if (CBMASC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASC);
			}

			sb.append("|");

			if (CBLAVC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBLAVC);
			}

			sb.append("|");

			if (CBARQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBARQT);
			}

			sb.append("|");

			if (CBNSQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBNSQT);
			}

			sb.append("|");

			if (CBHLDQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHLDQ);
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

				row14Struct row14 = new row14Struct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row14");

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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVCBL.csv\"");
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
				fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/INVCBL.csv"))
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
				if (file_tFileOutputDelimited_1.length() == 0) {
					outtFileOutputDelimited_1.write("INUMBR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBHBOY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBHBOP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBHAND");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTRNS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBGMRI");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWKCR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK01");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK02");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK03");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK04");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK05");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK06");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK07");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBWK08");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRSUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRSUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRSDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRSDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBVRSP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBVRSY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCSP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCSY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBASUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBASUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBASDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBASDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBVASP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBVASY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBACSP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBACSY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRETS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRCDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTIUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTIUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTOUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTOUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTFDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTFDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRVUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRVUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRVDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBRVDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAJUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAJUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAJDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAJDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBPHUP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBPHUY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBPHDP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBPHDY");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAVGC");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAVOH");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAVRT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBAVCS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBDEPT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBSDPT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBCLAS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBSCLS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBVNDR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBSTYL");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBPOOQ");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBTOOQ");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBINTQ");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBMASU");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBMASD");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBMASV");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBMASC");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBLAVC");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBARQT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBNSQT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("CBHLDQ");
					outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.flush();
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
							log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_2");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.INVCBL\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBHBOY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBHBOP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBHAND") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBTRNS") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBGMRI") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBWKCR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK01")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK02") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBWK03") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBWK04") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBWK05") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK06")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK07") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBWK08") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRSUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRSUY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRSDP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRSDY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBVRSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBVRSY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRCSP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCSY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBASUP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBASUY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBASDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBASDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVASP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVASY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBACSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBACSY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRETS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCUP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCUY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBRCDP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRCDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBTIUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBTIUY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBTOUP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBTOUY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBTFDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBTFDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRVUP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRVUY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBRVDP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRVDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBAJUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAJUY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAJDP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBAJDY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBPHUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBPHUY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBPHDP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBPHDY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBAVGC") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBAVOH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBAVRT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAVCS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBDEPT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBSDPT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBCLAS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBSCLS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVNDR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBSTYL") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBPOOQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBTOOQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBINTQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBMASU")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBMASD") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBMASV") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBMASC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBLAVC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBARQT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBNSQT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBHLDQ") + "}]");
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
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_2");

				if (conn_tDBInput_1 != null) {
					if (conn_tDBInput_1.getMetaData() != null) {

						log.debug("tDBInput_1 - Uses an existing connection with username '"
								+ conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_1.getMetaData().getURL() + ".");

					}
				}

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "select * from MM4R5LIB.INVCBL";

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
							row14.INUMBR = null;
						} else {

							row14.INUMBR = rs_tDBInput_1.getBigDecimal(1);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row14.CBHBOY = null;
						} else {

							row14.CBHBOY = rs_tDBInput_1.getBigDecimal(2);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row14.CBHBOP = null;
						} else {

							row14.CBHBOP = rs_tDBInput_1.getBigDecimal(3);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row14.CBHAND = null;
						} else {

							row14.CBHAND = rs_tDBInput_1.getBigDecimal(4);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row14.CBTRNS = null;
						} else {

							row14.CBTRNS = rs_tDBInput_1.getBigDecimal(5);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row14.CBGMRI = null;
						} else {

							row14.CBGMRI = rs_tDBInput_1.getBigDecimal(6);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row14.CBWKCR = null;
						} else {

							row14.CBWKCR = rs_tDBInput_1.getBigDecimal(7);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row14.CBWK01 = null;
						} else {

							row14.CBWK01 = rs_tDBInput_1.getBigDecimal(8);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row14.CBWK02 = null;
						} else {

							row14.CBWK02 = rs_tDBInput_1.getBigDecimal(9);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row14.CBWK03 = null;
						} else {

							row14.CBWK03 = rs_tDBInput_1.getBigDecimal(10);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row14.CBWK04 = null;
						} else {

							row14.CBWK04 = rs_tDBInput_1.getBigDecimal(11);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row14.CBWK05 = null;
						} else {

							row14.CBWK05 = rs_tDBInput_1.getBigDecimal(12);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 13) {
							row14.CBWK06 = null;
						} else {

							row14.CBWK06 = rs_tDBInput_1.getBigDecimal(13);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 14) {
							row14.CBWK07 = null;
						} else {

							row14.CBWK07 = rs_tDBInput_1.getBigDecimal(14);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 15) {
							row14.CBWK08 = null;
						} else {

							row14.CBWK08 = rs_tDBInput_1.getBigDecimal(15);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 16) {
							row14.CBRSUP = null;
						} else {

							row14.CBRSUP = rs_tDBInput_1.getBigDecimal(16);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 17) {
							row14.CBRSUY = null;
						} else {

							row14.CBRSUY = rs_tDBInput_1.getBigDecimal(17);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 18) {
							row14.CBRSDP = null;
						} else {

							row14.CBRSDP = rs_tDBInput_1.getBigDecimal(18);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 19) {
							row14.CBRSDY = null;
						} else {

							row14.CBRSDY = rs_tDBInput_1.getBigDecimal(19);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 20) {
							row14.CBVRSP = null;
						} else {

							row14.CBVRSP = rs_tDBInput_1.getBigDecimal(20);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 21) {
							row14.CBVRSY = null;
						} else {

							row14.CBVRSY = rs_tDBInput_1.getBigDecimal(21);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 22) {
							row14.CBRCSP = null;
						} else {

							row14.CBRCSP = rs_tDBInput_1.getBigDecimal(22);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 23) {
							row14.CBRCSY = null;
						} else {

							row14.CBRCSY = rs_tDBInput_1.getBigDecimal(23);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 24) {
							row14.CBASUP = null;
						} else {

							row14.CBASUP = rs_tDBInput_1.getBigDecimal(24);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 25) {
							row14.CBASUY = null;
						} else {

							row14.CBASUY = rs_tDBInput_1.getBigDecimal(25);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 26) {
							row14.CBASDP = null;
						} else {

							row14.CBASDP = rs_tDBInput_1.getBigDecimal(26);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 27) {
							row14.CBASDY = null;
						} else {

							row14.CBASDY = rs_tDBInput_1.getBigDecimal(27);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 28) {
							row14.CBVASP = null;
						} else {

							row14.CBVASP = rs_tDBInput_1.getBigDecimal(28);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 29) {
							row14.CBVASY = null;
						} else {

							row14.CBVASY = rs_tDBInput_1.getBigDecimal(29);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 30) {
							row14.CBACSP = null;
						} else {

							row14.CBACSP = rs_tDBInput_1.getBigDecimal(30);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 31) {
							row14.CBACSY = null;
						} else {

							row14.CBACSY = rs_tDBInput_1.getBigDecimal(31);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 32) {
							row14.CBRETS = null;
						} else {

							row14.CBRETS = rs_tDBInput_1.getBigDecimal(32);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 33) {
							row14.CBRCUP = null;
						} else {

							row14.CBRCUP = rs_tDBInput_1.getBigDecimal(33);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 34) {
							row14.CBRCUY = null;
						} else {

							row14.CBRCUY = rs_tDBInput_1.getBigDecimal(34);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 35) {
							row14.CBRCDP = null;
						} else {

							row14.CBRCDP = rs_tDBInput_1.getBigDecimal(35);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 36) {
							row14.CBRCDY = null;
						} else {

							row14.CBRCDY = rs_tDBInput_1.getBigDecimal(36);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 37) {
							row14.CBTIUP = null;
						} else {

							row14.CBTIUP = rs_tDBInput_1.getBigDecimal(37);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 38) {
							row14.CBTIUY = null;
						} else {

							row14.CBTIUY = rs_tDBInput_1.getBigDecimal(38);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 39) {
							row14.CBTOUP = null;
						} else {

							row14.CBTOUP = rs_tDBInput_1.getBigDecimal(39);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 40) {
							row14.CBTOUY = null;
						} else {

							row14.CBTOUY = rs_tDBInput_1.getBigDecimal(40);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 41) {
							row14.CBTFDP = null;
						} else {

							row14.CBTFDP = rs_tDBInput_1.getBigDecimal(41);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 42) {
							row14.CBTFDY = null;
						} else {

							row14.CBTFDY = rs_tDBInput_1.getBigDecimal(42);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 43) {
							row14.CBRVUP = null;
						} else {

							row14.CBRVUP = rs_tDBInput_1.getBigDecimal(43);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 44) {
							row14.CBRVUY = null;
						} else {

							row14.CBRVUY = rs_tDBInput_1.getBigDecimal(44);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 45) {
							row14.CBRVDP = null;
						} else {

							row14.CBRVDP = rs_tDBInput_1.getBigDecimal(45);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 46) {
							row14.CBRVDY = null;
						} else {

							row14.CBRVDY = rs_tDBInput_1.getBigDecimal(46);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 47) {
							row14.CBAJUP = null;
						} else {

							row14.CBAJUP = rs_tDBInput_1.getBigDecimal(47);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 48) {
							row14.CBAJUY = null;
						} else {

							row14.CBAJUY = rs_tDBInput_1.getBigDecimal(48);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 49) {
							row14.CBAJDP = null;
						} else {

							row14.CBAJDP = rs_tDBInput_1.getBigDecimal(49);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 50) {
							row14.CBAJDY = null;
						} else {

							row14.CBAJDY = rs_tDBInput_1.getBigDecimal(50);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 51) {
							row14.CBPHUP = null;
						} else {

							row14.CBPHUP = rs_tDBInput_1.getBigDecimal(51);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 52) {
							row14.CBPHUY = null;
						} else {

							row14.CBPHUY = rs_tDBInput_1.getBigDecimal(52);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 53) {
							row14.CBPHDP = null;
						} else {

							row14.CBPHDP = rs_tDBInput_1.getBigDecimal(53);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 54) {
							row14.CBPHDY = null;
						} else {

							row14.CBPHDY = rs_tDBInput_1.getBigDecimal(54);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 55) {
							row14.CBAVGC = null;
						} else {

							row14.CBAVGC = rs_tDBInput_1.getBigDecimal(55);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 56) {
							row14.CBAVOH = null;
						} else {

							row14.CBAVOH = rs_tDBInput_1.getBigDecimal(56);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 57) {
							row14.CBAVRT = null;
						} else {

							row14.CBAVRT = rs_tDBInput_1.getBigDecimal(57);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 58) {
							row14.CBAVCS = null;
						} else {

							row14.CBAVCS = rs_tDBInput_1.getBigDecimal(58);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 59) {
							row14.CBDEPT = null;
						} else {

							row14.CBDEPT = rs_tDBInput_1.getBigDecimal(59);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 60) {
							row14.CBSDPT = null;
						} else {

							row14.CBSDPT = rs_tDBInput_1.getBigDecimal(60);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 61) {
							row14.CBCLAS = null;
						} else {

							row14.CBCLAS = rs_tDBInput_1.getBigDecimal(61);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 62) {
							row14.CBSCLS = null;
						} else {

							row14.CBSCLS = rs_tDBInput_1.getBigDecimal(62);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 63) {
							row14.CBVNDR = null;
						} else {

							row14.CBVNDR = rs_tDBInput_1.getBigDecimal(63);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 64) {
							row14.CBSTYL = null;
						} else {

							row14.CBSTYL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 64, false);
						}
						if (colQtyInRs_tDBInput_1 < 65) {
							row14.CBPOOQ = null;
						} else {

							row14.CBPOOQ = rs_tDBInput_1.getBigDecimal(65);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 66) {
							row14.CBTOOQ = null;
						} else {

							row14.CBTOOQ = rs_tDBInput_1.getBigDecimal(66);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 67) {
							row14.CBINTQ = null;
						} else {

							row14.CBINTQ = rs_tDBInput_1.getBigDecimal(67);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 68) {
							row14.CBMASU = null;
						} else {

							row14.CBMASU = rs_tDBInput_1.getBigDecimal(68);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 69) {
							row14.CBMASD = null;
						} else {

							row14.CBMASD = rs_tDBInput_1.getBigDecimal(69);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 70) {
							row14.CBMASV = null;
						} else {

							row14.CBMASV = rs_tDBInput_1.getBigDecimal(70);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 71) {
							row14.CBMASC = null;
						} else {

							row14.CBMASC = rs_tDBInput_1.getBigDecimal(71);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 72) {
							row14.CBLAVC = null;
						} else {

							row14.CBLAVC = rs_tDBInput_1.getBigDecimal(72);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 73) {
							row14.CBARQT = null;
						} else {

							row14.CBARQT = rs_tDBInput_1.getBigDecimal(73);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 74) {
							row14.CBNSQT = null;
						} else {

							row14.CBNSQT = rs_tDBInput_1.getBigDecimal(74);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 75) {
							row14.CBHLDQ = null;
						} else {

							row14.CBHLDQ = rs_tDBInput_1.getBigDecimal(75);
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

								, "row14", "tDBInput_1", "tDBInput_1", "tAS400Input", "tFileOutputDelimited_1",
								"tFileOutputDelimited_1", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row14 - " + (row14 == null ? "" : row14.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row14.INUMBR != null) {
							sb_tFileOutputDelimited_1
									.append(row14.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBHBOY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBHBOY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBHBOP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBHBOP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBHAND != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBHAND.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTRNS != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTRNS.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBGMRI != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBGMRI.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWKCR != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWKCR.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK01 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK01.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK02 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK02.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK03 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK03.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK04 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK04.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK05 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK05.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK06 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK06.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK07 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK07.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBWK08 != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBWK08.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRSUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRSUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRSUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRSUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRSDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRSDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRSDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRSDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBVRSP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBVRSP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBVRSY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBVRSY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCSP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCSP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCSY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCSY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBASUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBASUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBASUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBASUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBASDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBASDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBASDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBASDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBVASP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBVASP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBVASY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBVASY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBACSP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBACSP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBACSY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBACSY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRETS != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRETS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRCDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRCDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTIUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTIUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTIUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTIUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTOUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTOUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTOUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTOUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTFDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTFDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTFDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTFDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRVUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRVUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRVUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRVUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRVDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRVDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBRVDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBRVDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAJUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAJUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAJUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAJUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAJDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAJDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAJDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAJDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBPHUP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBPHUP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBPHUY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBPHUY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBPHDP != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBPHDP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBPHDY != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBPHDY.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAVGC != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAVGC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAVOH != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAVOH.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAVRT != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAVRT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBAVCS != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBAVCS.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBDEPT != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBDEPT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBSDPT != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBSDPT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBCLAS != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBCLAS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBSCLS != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBSCLS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBVNDR != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBVNDR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBSTYL != null) {
							sb_tFileOutputDelimited_1.append(row14.CBSTYL);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBPOOQ != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBPOOQ.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBTOOQ != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBTOOQ.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBINTQ != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBINTQ.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBMASU != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBMASU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBMASD != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBMASD.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBMASV != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBMASV.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBMASC != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBMASC.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBLAVC != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBLAVC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBARQT != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBARQT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBNSQT != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBNSQT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row14.CBHLDQ != null) {
							sb_tFileOutputDelimited_1
									.append(row14.CBHLDQ.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);

						nb_line_tFileOutputDelimited_1++;
						resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

						outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
						log.debug(
								"tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");

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

				if (outtFileOutputDelimited_1 != null) {
					outtFileOutputDelimited_1.flush();
					outtFileOutputDelimited_1.close();
				}

				globalMap.put("tFileOutputDelimited_1_NB_LINE", nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME", fileName_tFileOutputDelimited_1);

				resourceMap.put("finish_tFileOutputDelimited_1", true);

				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row14", 2, 0,
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

					java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer) resourceMap
							.get("out_tFileOutputDelimited_1");
					if (outtFileOutputDelimited_1 != null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
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

	public static class tmap_INVCBLStruct implements routines.system.IPersistableRow<tmap_INVCBLStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

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

		public BigDecimal CBHBOY;

		public BigDecimal getCBHBOY() {
			return this.CBHBOY;
		}

		public Boolean CBHBOYIsNullable() {
			return true;
		}

		public Boolean CBHBOYIsKey() {
			return false;
		}

		public Integer CBHBOYLength() {
			return null;
		}

		public Integer CBHBOYPrecision() {
			return null;
		}

		public String CBHBOYDefault() {

			return "";

		}

		public String CBHBOYComment() {

			return "";

		}

		public String CBHBOYPattern() {

			return "";

		}

		public String CBHBOYOriginalDbColumnName() {

			return "CBHBOY";

		}

		public BigDecimal CBHBOP;

		public BigDecimal getCBHBOP() {
			return this.CBHBOP;
		}

		public Boolean CBHBOPIsNullable() {
			return true;
		}

		public Boolean CBHBOPIsKey() {
			return false;
		}

		public Integer CBHBOPLength() {
			return null;
		}

		public Integer CBHBOPPrecision() {
			return null;
		}

		public String CBHBOPDefault() {

			return "";

		}

		public String CBHBOPComment() {

			return "";

		}

		public String CBHBOPPattern() {

			return "";

		}

		public String CBHBOPOriginalDbColumnName() {

			return "CBHBOP";

		}

		public BigDecimal CBHAND;

		public BigDecimal getCBHAND() {
			return this.CBHAND;
		}

		public Boolean CBHANDIsNullable() {
			return true;
		}

		public Boolean CBHANDIsKey() {
			return false;
		}

		public Integer CBHANDLength() {
			return null;
		}

		public Integer CBHANDPrecision() {
			return null;
		}

		public String CBHANDDefault() {

			return "";

		}

		public String CBHANDComment() {

			return "";

		}

		public String CBHANDPattern() {

			return "";

		}

		public String CBHANDOriginalDbColumnName() {

			return "CBHAND";

		}

		public BigDecimal CBTRNS;

		public BigDecimal getCBTRNS() {
			return this.CBTRNS;
		}

		public Boolean CBTRNSIsNullable() {
			return true;
		}

		public Boolean CBTRNSIsKey() {
			return false;
		}

		public Integer CBTRNSLength() {
			return null;
		}

		public Integer CBTRNSPrecision() {
			return null;
		}

		public String CBTRNSDefault() {

			return "";

		}

		public String CBTRNSComment() {

			return "";

		}

		public String CBTRNSPattern() {

			return "";

		}

		public String CBTRNSOriginalDbColumnName() {

			return "CBTRNS";

		}

		public BigDecimal CBGMRI;

		public BigDecimal getCBGMRI() {
			return this.CBGMRI;
		}

		public Boolean CBGMRIIsNullable() {
			return true;
		}

		public Boolean CBGMRIIsKey() {
			return false;
		}

		public Integer CBGMRILength() {
			return null;
		}

		public Integer CBGMRIPrecision() {
			return null;
		}

		public String CBGMRIDefault() {

			return "";

		}

		public String CBGMRIComment() {

			return "";

		}

		public String CBGMRIPattern() {

			return "";

		}

		public String CBGMRIOriginalDbColumnName() {

			return "CBGMRI";

		}

		public BigDecimal CBWKCR;

		public BigDecimal getCBWKCR() {
			return this.CBWKCR;
		}

		public Boolean CBWKCRIsNullable() {
			return true;
		}

		public Boolean CBWKCRIsKey() {
			return false;
		}

		public Integer CBWKCRLength() {
			return null;
		}

		public Integer CBWKCRPrecision() {
			return null;
		}

		public String CBWKCRDefault() {

			return "";

		}

		public String CBWKCRComment() {

			return "";

		}

		public String CBWKCRPattern() {

			return "";

		}

		public String CBWKCROriginalDbColumnName() {

			return "CBWKCR";

		}

		public BigDecimal CBWK01;

		public BigDecimal getCBWK01() {
			return this.CBWK01;
		}

		public Boolean CBWK01IsNullable() {
			return true;
		}

		public Boolean CBWK01IsKey() {
			return false;
		}

		public Integer CBWK01Length() {
			return null;
		}

		public Integer CBWK01Precision() {
			return null;
		}

		public String CBWK01Default() {

			return "";

		}

		public String CBWK01Comment() {

			return "";

		}

		public String CBWK01Pattern() {

			return "";

		}

		public String CBWK01OriginalDbColumnName() {

			return "CBWK01";

		}

		public BigDecimal CBWK02;

		public BigDecimal getCBWK02() {
			return this.CBWK02;
		}

		public Boolean CBWK02IsNullable() {
			return true;
		}

		public Boolean CBWK02IsKey() {
			return false;
		}

		public Integer CBWK02Length() {
			return null;
		}

		public Integer CBWK02Precision() {
			return null;
		}

		public String CBWK02Default() {

			return "";

		}

		public String CBWK02Comment() {

			return "";

		}

		public String CBWK02Pattern() {

			return "";

		}

		public String CBWK02OriginalDbColumnName() {

			return "CBWK02";

		}

		public BigDecimal CBWK03;

		public BigDecimal getCBWK03() {
			return this.CBWK03;
		}

		public Boolean CBWK03IsNullable() {
			return true;
		}

		public Boolean CBWK03IsKey() {
			return false;
		}

		public Integer CBWK03Length() {
			return null;
		}

		public Integer CBWK03Precision() {
			return null;
		}

		public String CBWK03Default() {

			return "";

		}

		public String CBWK03Comment() {

			return "";

		}

		public String CBWK03Pattern() {

			return "";

		}

		public String CBWK03OriginalDbColumnName() {

			return "CBWK03";

		}

		public BigDecimal CBWK04;

		public BigDecimal getCBWK04() {
			return this.CBWK04;
		}

		public Boolean CBWK04IsNullable() {
			return true;
		}

		public Boolean CBWK04IsKey() {
			return false;
		}

		public Integer CBWK04Length() {
			return null;
		}

		public Integer CBWK04Precision() {
			return null;
		}

		public String CBWK04Default() {

			return "";

		}

		public String CBWK04Comment() {

			return "";

		}

		public String CBWK04Pattern() {

			return "";

		}

		public String CBWK04OriginalDbColumnName() {

			return "CBWK04";

		}

		public BigDecimal CBWK05;

		public BigDecimal getCBWK05() {
			return this.CBWK05;
		}

		public Boolean CBWK05IsNullable() {
			return true;
		}

		public Boolean CBWK05IsKey() {
			return false;
		}

		public Integer CBWK05Length() {
			return null;
		}

		public Integer CBWK05Precision() {
			return null;
		}

		public String CBWK05Default() {

			return "";

		}

		public String CBWK05Comment() {

			return "";

		}

		public String CBWK05Pattern() {

			return "";

		}

		public String CBWK05OriginalDbColumnName() {

			return "CBWK05";

		}

		public BigDecimal CBWK06;

		public BigDecimal getCBWK06() {
			return this.CBWK06;
		}

		public Boolean CBWK06IsNullable() {
			return true;
		}

		public Boolean CBWK06IsKey() {
			return false;
		}

		public Integer CBWK06Length() {
			return null;
		}

		public Integer CBWK06Precision() {
			return null;
		}

		public String CBWK06Default() {

			return "";

		}

		public String CBWK06Comment() {

			return "";

		}

		public String CBWK06Pattern() {

			return "";

		}

		public String CBWK06OriginalDbColumnName() {

			return "CBWK06";

		}

		public BigDecimal CBWK07;

		public BigDecimal getCBWK07() {
			return this.CBWK07;
		}

		public Boolean CBWK07IsNullable() {
			return true;
		}

		public Boolean CBWK07IsKey() {
			return false;
		}

		public Integer CBWK07Length() {
			return null;
		}

		public Integer CBWK07Precision() {
			return null;
		}

		public String CBWK07Default() {

			return "";

		}

		public String CBWK07Comment() {

			return "";

		}

		public String CBWK07Pattern() {

			return "";

		}

		public String CBWK07OriginalDbColumnName() {

			return "CBWK07";

		}

		public BigDecimal CBWK08;

		public BigDecimal getCBWK08() {
			return this.CBWK08;
		}

		public Boolean CBWK08IsNullable() {
			return true;
		}

		public Boolean CBWK08IsKey() {
			return false;
		}

		public Integer CBWK08Length() {
			return null;
		}

		public Integer CBWK08Precision() {
			return null;
		}

		public String CBWK08Default() {

			return "";

		}

		public String CBWK08Comment() {

			return "";

		}

		public String CBWK08Pattern() {

			return "";

		}

		public String CBWK08OriginalDbColumnName() {

			return "CBWK08";

		}

		public BigDecimal CBRSUP;

		public BigDecimal getCBRSUP() {
			return this.CBRSUP;
		}

		public Boolean CBRSUPIsNullable() {
			return true;
		}

		public Boolean CBRSUPIsKey() {
			return false;
		}

		public Integer CBRSUPLength() {
			return null;
		}

		public Integer CBRSUPPrecision() {
			return null;
		}

		public String CBRSUPDefault() {

			return "";

		}

		public String CBRSUPComment() {

			return "";

		}

		public String CBRSUPPattern() {

			return "";

		}

		public String CBRSUPOriginalDbColumnName() {

			return "CBRSUP";

		}

		public BigDecimal CBRSUY;

		public BigDecimal getCBRSUY() {
			return this.CBRSUY;
		}

		public Boolean CBRSUYIsNullable() {
			return true;
		}

		public Boolean CBRSUYIsKey() {
			return false;
		}

		public Integer CBRSUYLength() {
			return null;
		}

		public Integer CBRSUYPrecision() {
			return null;
		}

		public String CBRSUYDefault() {

			return "";

		}

		public String CBRSUYComment() {

			return "";

		}

		public String CBRSUYPattern() {

			return "";

		}

		public String CBRSUYOriginalDbColumnName() {

			return "CBRSUY";

		}

		public BigDecimal CBRSDP;

		public BigDecimal getCBRSDP() {
			return this.CBRSDP;
		}

		public Boolean CBRSDPIsNullable() {
			return true;
		}

		public Boolean CBRSDPIsKey() {
			return false;
		}

		public Integer CBRSDPLength() {
			return null;
		}

		public Integer CBRSDPPrecision() {
			return null;
		}

		public String CBRSDPDefault() {

			return "";

		}

		public String CBRSDPComment() {

			return "";

		}

		public String CBRSDPPattern() {

			return "";

		}

		public String CBRSDPOriginalDbColumnName() {

			return "CBRSDP";

		}

		public BigDecimal CBRSDY;

		public BigDecimal getCBRSDY() {
			return this.CBRSDY;
		}

		public Boolean CBRSDYIsNullable() {
			return true;
		}

		public Boolean CBRSDYIsKey() {
			return false;
		}

		public Integer CBRSDYLength() {
			return null;
		}

		public Integer CBRSDYPrecision() {
			return null;
		}

		public String CBRSDYDefault() {

			return "";

		}

		public String CBRSDYComment() {

			return "";

		}

		public String CBRSDYPattern() {

			return "";

		}

		public String CBRSDYOriginalDbColumnName() {

			return "CBRSDY";

		}

		public BigDecimal CBVRSP;

		public BigDecimal getCBVRSP() {
			return this.CBVRSP;
		}

		public Boolean CBVRSPIsNullable() {
			return true;
		}

		public Boolean CBVRSPIsKey() {
			return false;
		}

		public Integer CBVRSPLength() {
			return null;
		}

		public Integer CBVRSPPrecision() {
			return null;
		}

		public String CBVRSPDefault() {

			return "";

		}

		public String CBVRSPComment() {

			return "";

		}

		public String CBVRSPPattern() {

			return "";

		}

		public String CBVRSPOriginalDbColumnName() {

			return "CBVRSP";

		}

		public BigDecimal CBVRSY;

		public BigDecimal getCBVRSY() {
			return this.CBVRSY;
		}

		public Boolean CBVRSYIsNullable() {
			return true;
		}

		public Boolean CBVRSYIsKey() {
			return false;
		}

		public Integer CBVRSYLength() {
			return null;
		}

		public Integer CBVRSYPrecision() {
			return null;
		}

		public String CBVRSYDefault() {

			return "";

		}

		public String CBVRSYComment() {

			return "";

		}

		public String CBVRSYPattern() {

			return "";

		}

		public String CBVRSYOriginalDbColumnName() {

			return "CBVRSY";

		}

		public BigDecimal CBRCSP;

		public BigDecimal getCBRCSP() {
			return this.CBRCSP;
		}

		public Boolean CBRCSPIsNullable() {
			return true;
		}

		public Boolean CBRCSPIsKey() {
			return false;
		}

		public Integer CBRCSPLength() {
			return null;
		}

		public Integer CBRCSPPrecision() {
			return null;
		}

		public String CBRCSPDefault() {

			return "";

		}

		public String CBRCSPComment() {

			return "";

		}

		public String CBRCSPPattern() {

			return "";

		}

		public String CBRCSPOriginalDbColumnName() {

			return "CBRCSP";

		}

		public BigDecimal CBRCSY;

		public BigDecimal getCBRCSY() {
			return this.CBRCSY;
		}

		public Boolean CBRCSYIsNullable() {
			return true;
		}

		public Boolean CBRCSYIsKey() {
			return false;
		}

		public Integer CBRCSYLength() {
			return null;
		}

		public Integer CBRCSYPrecision() {
			return null;
		}

		public String CBRCSYDefault() {

			return "";

		}

		public String CBRCSYComment() {

			return "";

		}

		public String CBRCSYPattern() {

			return "";

		}

		public String CBRCSYOriginalDbColumnName() {

			return "CBRCSY";

		}

		public BigDecimal CBASUP;

		public BigDecimal getCBASUP() {
			return this.CBASUP;
		}

		public Boolean CBASUPIsNullable() {
			return true;
		}

		public Boolean CBASUPIsKey() {
			return false;
		}

		public Integer CBASUPLength() {
			return null;
		}

		public Integer CBASUPPrecision() {
			return null;
		}

		public String CBASUPDefault() {

			return "";

		}

		public String CBASUPComment() {

			return "";

		}

		public String CBASUPPattern() {

			return "";

		}

		public String CBASUPOriginalDbColumnName() {

			return "CBASUP";

		}

		public BigDecimal CBASUY;

		public BigDecimal getCBASUY() {
			return this.CBASUY;
		}

		public Boolean CBASUYIsNullable() {
			return true;
		}

		public Boolean CBASUYIsKey() {
			return false;
		}

		public Integer CBASUYLength() {
			return null;
		}

		public Integer CBASUYPrecision() {
			return null;
		}

		public String CBASUYDefault() {

			return "";

		}

		public String CBASUYComment() {

			return "";

		}

		public String CBASUYPattern() {

			return "";

		}

		public String CBASUYOriginalDbColumnName() {

			return "CBASUY";

		}

		public BigDecimal CBASDP;

		public BigDecimal getCBASDP() {
			return this.CBASDP;
		}

		public Boolean CBASDPIsNullable() {
			return true;
		}

		public Boolean CBASDPIsKey() {
			return false;
		}

		public Integer CBASDPLength() {
			return null;
		}

		public Integer CBASDPPrecision() {
			return null;
		}

		public String CBASDPDefault() {

			return "";

		}

		public String CBASDPComment() {

			return "";

		}

		public String CBASDPPattern() {

			return "";

		}

		public String CBASDPOriginalDbColumnName() {

			return "CBASDP";

		}

		public BigDecimal CBASDY;

		public BigDecimal getCBASDY() {
			return this.CBASDY;
		}

		public Boolean CBASDYIsNullable() {
			return true;
		}

		public Boolean CBASDYIsKey() {
			return false;
		}

		public Integer CBASDYLength() {
			return null;
		}

		public Integer CBASDYPrecision() {
			return null;
		}

		public String CBASDYDefault() {

			return "";

		}

		public String CBASDYComment() {

			return "";

		}

		public String CBASDYPattern() {

			return "";

		}

		public String CBASDYOriginalDbColumnName() {

			return "CBASDY";

		}

		public BigDecimal CBVASP;

		public BigDecimal getCBVASP() {
			return this.CBVASP;
		}

		public Boolean CBVASPIsNullable() {
			return true;
		}

		public Boolean CBVASPIsKey() {
			return false;
		}

		public Integer CBVASPLength() {
			return null;
		}

		public Integer CBVASPPrecision() {
			return null;
		}

		public String CBVASPDefault() {

			return "";

		}

		public String CBVASPComment() {

			return "";

		}

		public String CBVASPPattern() {

			return "";

		}

		public String CBVASPOriginalDbColumnName() {

			return "CBVASP";

		}

		public BigDecimal CBVASY;

		public BigDecimal getCBVASY() {
			return this.CBVASY;
		}

		public Boolean CBVASYIsNullable() {
			return true;
		}

		public Boolean CBVASYIsKey() {
			return false;
		}

		public Integer CBVASYLength() {
			return null;
		}

		public Integer CBVASYPrecision() {
			return null;
		}

		public String CBVASYDefault() {

			return "";

		}

		public String CBVASYComment() {

			return "";

		}

		public String CBVASYPattern() {

			return "";

		}

		public String CBVASYOriginalDbColumnName() {

			return "CBVASY";

		}

		public BigDecimal CBACSP;

		public BigDecimal getCBACSP() {
			return this.CBACSP;
		}

		public Boolean CBACSPIsNullable() {
			return true;
		}

		public Boolean CBACSPIsKey() {
			return false;
		}

		public Integer CBACSPLength() {
			return null;
		}

		public Integer CBACSPPrecision() {
			return null;
		}

		public String CBACSPDefault() {

			return "";

		}

		public String CBACSPComment() {

			return "";

		}

		public String CBACSPPattern() {

			return "";

		}

		public String CBACSPOriginalDbColumnName() {

			return "CBACSP";

		}

		public BigDecimal CBACSY;

		public BigDecimal getCBACSY() {
			return this.CBACSY;
		}

		public Boolean CBACSYIsNullable() {
			return true;
		}

		public Boolean CBACSYIsKey() {
			return false;
		}

		public Integer CBACSYLength() {
			return null;
		}

		public Integer CBACSYPrecision() {
			return null;
		}

		public String CBACSYDefault() {

			return "";

		}

		public String CBACSYComment() {

			return "";

		}

		public String CBACSYPattern() {

			return "";

		}

		public String CBACSYOriginalDbColumnName() {

			return "CBACSY";

		}

		public BigDecimal CBRETS;

		public BigDecimal getCBRETS() {
			return this.CBRETS;
		}

		public Boolean CBRETSIsNullable() {
			return true;
		}

		public Boolean CBRETSIsKey() {
			return false;
		}

		public Integer CBRETSLength() {
			return null;
		}

		public Integer CBRETSPrecision() {
			return null;
		}

		public String CBRETSDefault() {

			return "";

		}

		public String CBRETSComment() {

			return "";

		}

		public String CBRETSPattern() {

			return "";

		}

		public String CBRETSOriginalDbColumnName() {

			return "CBRETS";

		}

		public BigDecimal CBRCUP;

		public BigDecimal getCBRCUP() {
			return this.CBRCUP;
		}

		public Boolean CBRCUPIsNullable() {
			return true;
		}

		public Boolean CBRCUPIsKey() {
			return false;
		}

		public Integer CBRCUPLength() {
			return null;
		}

		public Integer CBRCUPPrecision() {
			return null;
		}

		public String CBRCUPDefault() {

			return "";

		}

		public String CBRCUPComment() {

			return "";

		}

		public String CBRCUPPattern() {

			return "";

		}

		public String CBRCUPOriginalDbColumnName() {

			return "CBRCUP";

		}

		public BigDecimal CBRCUY;

		public BigDecimal getCBRCUY() {
			return this.CBRCUY;
		}

		public Boolean CBRCUYIsNullable() {
			return true;
		}

		public Boolean CBRCUYIsKey() {
			return false;
		}

		public Integer CBRCUYLength() {
			return null;
		}

		public Integer CBRCUYPrecision() {
			return null;
		}

		public String CBRCUYDefault() {

			return "";

		}

		public String CBRCUYComment() {

			return "";

		}

		public String CBRCUYPattern() {

			return "";

		}

		public String CBRCUYOriginalDbColumnName() {

			return "CBRCUY";

		}

		public BigDecimal CBRCDP;

		public BigDecimal getCBRCDP() {
			return this.CBRCDP;
		}

		public Boolean CBRCDPIsNullable() {
			return true;
		}

		public Boolean CBRCDPIsKey() {
			return false;
		}

		public Integer CBRCDPLength() {
			return null;
		}

		public Integer CBRCDPPrecision() {
			return null;
		}

		public String CBRCDPDefault() {

			return "";

		}

		public String CBRCDPComment() {

			return "";

		}

		public String CBRCDPPattern() {

			return "";

		}

		public String CBRCDPOriginalDbColumnName() {

			return "CBRCDP";

		}

		public BigDecimal CBRCDY;

		public BigDecimal getCBRCDY() {
			return this.CBRCDY;
		}

		public Boolean CBRCDYIsNullable() {
			return true;
		}

		public Boolean CBRCDYIsKey() {
			return false;
		}

		public Integer CBRCDYLength() {
			return null;
		}

		public Integer CBRCDYPrecision() {
			return null;
		}

		public String CBRCDYDefault() {

			return "";

		}

		public String CBRCDYComment() {

			return "";

		}

		public String CBRCDYPattern() {

			return "";

		}

		public String CBRCDYOriginalDbColumnName() {

			return "CBRCDY";

		}

		public BigDecimal CBTIUP;

		public BigDecimal getCBTIUP() {
			return this.CBTIUP;
		}

		public Boolean CBTIUPIsNullable() {
			return true;
		}

		public Boolean CBTIUPIsKey() {
			return false;
		}

		public Integer CBTIUPLength() {
			return null;
		}

		public Integer CBTIUPPrecision() {
			return null;
		}

		public String CBTIUPDefault() {

			return "";

		}

		public String CBTIUPComment() {

			return "";

		}

		public String CBTIUPPattern() {

			return "";

		}

		public String CBTIUPOriginalDbColumnName() {

			return "CBTIUP";

		}

		public BigDecimal CBTIUY;

		public BigDecimal getCBTIUY() {
			return this.CBTIUY;
		}

		public Boolean CBTIUYIsNullable() {
			return true;
		}

		public Boolean CBTIUYIsKey() {
			return false;
		}

		public Integer CBTIUYLength() {
			return null;
		}

		public Integer CBTIUYPrecision() {
			return null;
		}

		public String CBTIUYDefault() {

			return "";

		}

		public String CBTIUYComment() {

			return "";

		}

		public String CBTIUYPattern() {

			return "";

		}

		public String CBTIUYOriginalDbColumnName() {

			return "CBTIUY";

		}

		public BigDecimal CBTOUP;

		public BigDecimal getCBTOUP() {
			return this.CBTOUP;
		}

		public Boolean CBTOUPIsNullable() {
			return true;
		}

		public Boolean CBTOUPIsKey() {
			return false;
		}

		public Integer CBTOUPLength() {
			return null;
		}

		public Integer CBTOUPPrecision() {
			return null;
		}

		public String CBTOUPDefault() {

			return "";

		}

		public String CBTOUPComment() {

			return "";

		}

		public String CBTOUPPattern() {

			return "";

		}

		public String CBTOUPOriginalDbColumnName() {

			return "CBTOUP";

		}

		public BigDecimal CBTOUY;

		public BigDecimal getCBTOUY() {
			return this.CBTOUY;
		}

		public Boolean CBTOUYIsNullable() {
			return true;
		}

		public Boolean CBTOUYIsKey() {
			return false;
		}

		public Integer CBTOUYLength() {
			return null;
		}

		public Integer CBTOUYPrecision() {
			return null;
		}

		public String CBTOUYDefault() {

			return "";

		}

		public String CBTOUYComment() {

			return "";

		}

		public String CBTOUYPattern() {

			return "";

		}

		public String CBTOUYOriginalDbColumnName() {

			return "CBTOUY";

		}

		public BigDecimal CBTFDP;

		public BigDecimal getCBTFDP() {
			return this.CBTFDP;
		}

		public Boolean CBTFDPIsNullable() {
			return true;
		}

		public Boolean CBTFDPIsKey() {
			return false;
		}

		public Integer CBTFDPLength() {
			return null;
		}

		public Integer CBTFDPPrecision() {
			return null;
		}

		public String CBTFDPDefault() {

			return "";

		}

		public String CBTFDPComment() {

			return "";

		}

		public String CBTFDPPattern() {

			return "";

		}

		public String CBTFDPOriginalDbColumnName() {

			return "CBTFDP";

		}

		public BigDecimal CBTFDY;

		public BigDecimal getCBTFDY() {
			return this.CBTFDY;
		}

		public Boolean CBTFDYIsNullable() {
			return true;
		}

		public Boolean CBTFDYIsKey() {
			return false;
		}

		public Integer CBTFDYLength() {
			return null;
		}

		public Integer CBTFDYPrecision() {
			return null;
		}

		public String CBTFDYDefault() {

			return "";

		}

		public String CBTFDYComment() {

			return "";

		}

		public String CBTFDYPattern() {

			return "";

		}

		public String CBTFDYOriginalDbColumnName() {

			return "CBTFDY";

		}

		public BigDecimal CBRVUP;

		public BigDecimal getCBRVUP() {
			return this.CBRVUP;
		}

		public Boolean CBRVUPIsNullable() {
			return true;
		}

		public Boolean CBRVUPIsKey() {
			return false;
		}

		public Integer CBRVUPLength() {
			return null;
		}

		public Integer CBRVUPPrecision() {
			return null;
		}

		public String CBRVUPDefault() {

			return "";

		}

		public String CBRVUPComment() {

			return "";

		}

		public String CBRVUPPattern() {

			return "";

		}

		public String CBRVUPOriginalDbColumnName() {

			return "CBRVUP";

		}

		public BigDecimal CBRVUY;

		public BigDecimal getCBRVUY() {
			return this.CBRVUY;
		}

		public Boolean CBRVUYIsNullable() {
			return true;
		}

		public Boolean CBRVUYIsKey() {
			return false;
		}

		public Integer CBRVUYLength() {
			return null;
		}

		public Integer CBRVUYPrecision() {
			return null;
		}

		public String CBRVUYDefault() {

			return "";

		}

		public String CBRVUYComment() {

			return "";

		}

		public String CBRVUYPattern() {

			return "";

		}

		public String CBRVUYOriginalDbColumnName() {

			return "CBRVUY";

		}

		public BigDecimal CBRVDP;

		public BigDecimal getCBRVDP() {
			return this.CBRVDP;
		}

		public Boolean CBRVDPIsNullable() {
			return true;
		}

		public Boolean CBRVDPIsKey() {
			return false;
		}

		public Integer CBRVDPLength() {
			return null;
		}

		public Integer CBRVDPPrecision() {
			return null;
		}

		public String CBRVDPDefault() {

			return "";

		}

		public String CBRVDPComment() {

			return "";

		}

		public String CBRVDPPattern() {

			return "";

		}

		public String CBRVDPOriginalDbColumnName() {

			return "CBRVDP";

		}

		public BigDecimal CBRVDY;

		public BigDecimal getCBRVDY() {
			return this.CBRVDY;
		}

		public Boolean CBRVDYIsNullable() {
			return true;
		}

		public Boolean CBRVDYIsKey() {
			return false;
		}

		public Integer CBRVDYLength() {
			return null;
		}

		public Integer CBRVDYPrecision() {
			return null;
		}

		public String CBRVDYDefault() {

			return "";

		}

		public String CBRVDYComment() {

			return "";

		}

		public String CBRVDYPattern() {

			return "";

		}

		public String CBRVDYOriginalDbColumnName() {

			return "CBRVDY";

		}

		public BigDecimal CBAJUP;

		public BigDecimal getCBAJUP() {
			return this.CBAJUP;
		}

		public Boolean CBAJUPIsNullable() {
			return true;
		}

		public Boolean CBAJUPIsKey() {
			return false;
		}

		public Integer CBAJUPLength() {
			return null;
		}

		public Integer CBAJUPPrecision() {
			return null;
		}

		public String CBAJUPDefault() {

			return "";

		}

		public String CBAJUPComment() {

			return "";

		}

		public String CBAJUPPattern() {

			return "";

		}

		public String CBAJUPOriginalDbColumnName() {

			return "CBAJUP";

		}

		public BigDecimal CBAJUY;

		public BigDecimal getCBAJUY() {
			return this.CBAJUY;
		}

		public Boolean CBAJUYIsNullable() {
			return true;
		}

		public Boolean CBAJUYIsKey() {
			return false;
		}

		public Integer CBAJUYLength() {
			return null;
		}

		public Integer CBAJUYPrecision() {
			return null;
		}

		public String CBAJUYDefault() {

			return "";

		}

		public String CBAJUYComment() {

			return "";

		}

		public String CBAJUYPattern() {

			return "";

		}

		public String CBAJUYOriginalDbColumnName() {

			return "CBAJUY";

		}

		public BigDecimal CBAJDP;

		public BigDecimal getCBAJDP() {
			return this.CBAJDP;
		}

		public Boolean CBAJDPIsNullable() {
			return true;
		}

		public Boolean CBAJDPIsKey() {
			return false;
		}

		public Integer CBAJDPLength() {
			return null;
		}

		public Integer CBAJDPPrecision() {
			return null;
		}

		public String CBAJDPDefault() {

			return "";

		}

		public String CBAJDPComment() {

			return "";

		}

		public String CBAJDPPattern() {

			return "";

		}

		public String CBAJDPOriginalDbColumnName() {

			return "CBAJDP";

		}

		public BigDecimal CBAJDY;

		public BigDecimal getCBAJDY() {
			return this.CBAJDY;
		}

		public Boolean CBAJDYIsNullable() {
			return true;
		}

		public Boolean CBAJDYIsKey() {
			return false;
		}

		public Integer CBAJDYLength() {
			return null;
		}

		public Integer CBAJDYPrecision() {
			return null;
		}

		public String CBAJDYDefault() {

			return "";

		}

		public String CBAJDYComment() {

			return "";

		}

		public String CBAJDYPattern() {

			return "";

		}

		public String CBAJDYOriginalDbColumnName() {

			return "CBAJDY";

		}

		public BigDecimal CBPHUP;

		public BigDecimal getCBPHUP() {
			return this.CBPHUP;
		}

		public Boolean CBPHUPIsNullable() {
			return true;
		}

		public Boolean CBPHUPIsKey() {
			return false;
		}

		public Integer CBPHUPLength() {
			return null;
		}

		public Integer CBPHUPPrecision() {
			return null;
		}

		public String CBPHUPDefault() {

			return "";

		}

		public String CBPHUPComment() {

			return "";

		}

		public String CBPHUPPattern() {

			return "";

		}

		public String CBPHUPOriginalDbColumnName() {

			return "CBPHUP";

		}

		public BigDecimal CBPHUY;

		public BigDecimal getCBPHUY() {
			return this.CBPHUY;
		}

		public Boolean CBPHUYIsNullable() {
			return true;
		}

		public Boolean CBPHUYIsKey() {
			return false;
		}

		public Integer CBPHUYLength() {
			return null;
		}

		public Integer CBPHUYPrecision() {
			return null;
		}

		public String CBPHUYDefault() {

			return "";

		}

		public String CBPHUYComment() {

			return "";

		}

		public String CBPHUYPattern() {

			return "";

		}

		public String CBPHUYOriginalDbColumnName() {

			return "CBPHUY";

		}

		public BigDecimal CBPHDP;

		public BigDecimal getCBPHDP() {
			return this.CBPHDP;
		}

		public Boolean CBPHDPIsNullable() {
			return true;
		}

		public Boolean CBPHDPIsKey() {
			return false;
		}

		public Integer CBPHDPLength() {
			return null;
		}

		public Integer CBPHDPPrecision() {
			return null;
		}

		public String CBPHDPDefault() {

			return "";

		}

		public String CBPHDPComment() {

			return "";

		}

		public String CBPHDPPattern() {

			return "";

		}

		public String CBPHDPOriginalDbColumnName() {

			return "CBPHDP";

		}

		public BigDecimal CBPHDY;

		public BigDecimal getCBPHDY() {
			return this.CBPHDY;
		}

		public Boolean CBPHDYIsNullable() {
			return true;
		}

		public Boolean CBPHDYIsKey() {
			return false;
		}

		public Integer CBPHDYLength() {
			return null;
		}

		public Integer CBPHDYPrecision() {
			return null;
		}

		public String CBPHDYDefault() {

			return "";

		}

		public String CBPHDYComment() {

			return "";

		}

		public String CBPHDYPattern() {

			return "";

		}

		public String CBPHDYOriginalDbColumnName() {

			return "CBPHDY";

		}

		public BigDecimal CBAVGC;

		public BigDecimal getCBAVGC() {
			return this.CBAVGC;
		}

		public Boolean CBAVGCIsNullable() {
			return true;
		}

		public Boolean CBAVGCIsKey() {
			return false;
		}

		public Integer CBAVGCLength() {
			return null;
		}

		public Integer CBAVGCPrecision() {
			return null;
		}

		public String CBAVGCDefault() {

			return "";

		}

		public String CBAVGCComment() {

			return "";

		}

		public String CBAVGCPattern() {

			return "";

		}

		public String CBAVGCOriginalDbColumnName() {

			return "CBAVGC";

		}

		public BigDecimal CBAVOH;

		public BigDecimal getCBAVOH() {
			return this.CBAVOH;
		}

		public Boolean CBAVOHIsNullable() {
			return true;
		}

		public Boolean CBAVOHIsKey() {
			return false;
		}

		public Integer CBAVOHLength() {
			return null;
		}

		public Integer CBAVOHPrecision() {
			return null;
		}

		public String CBAVOHDefault() {

			return "";

		}

		public String CBAVOHComment() {

			return "";

		}

		public String CBAVOHPattern() {

			return "";

		}

		public String CBAVOHOriginalDbColumnName() {

			return "CBAVOH";

		}

		public BigDecimal CBAVRT;

		public BigDecimal getCBAVRT() {
			return this.CBAVRT;
		}

		public Boolean CBAVRTIsNullable() {
			return true;
		}

		public Boolean CBAVRTIsKey() {
			return false;
		}

		public Integer CBAVRTLength() {
			return null;
		}

		public Integer CBAVRTPrecision() {
			return null;
		}

		public String CBAVRTDefault() {

			return "";

		}

		public String CBAVRTComment() {

			return "";

		}

		public String CBAVRTPattern() {

			return "";

		}

		public String CBAVRTOriginalDbColumnName() {

			return "CBAVRT";

		}

		public BigDecimal CBAVCS;

		public BigDecimal getCBAVCS() {
			return this.CBAVCS;
		}

		public Boolean CBAVCSIsNullable() {
			return true;
		}

		public Boolean CBAVCSIsKey() {
			return false;
		}

		public Integer CBAVCSLength() {
			return null;
		}

		public Integer CBAVCSPrecision() {
			return null;
		}

		public String CBAVCSDefault() {

			return "";

		}

		public String CBAVCSComment() {

			return "";

		}

		public String CBAVCSPattern() {

			return "";

		}

		public String CBAVCSOriginalDbColumnName() {

			return "CBAVCS";

		}

		public BigDecimal CBDEPT;

		public BigDecimal getCBDEPT() {
			return this.CBDEPT;
		}

		public Boolean CBDEPTIsNullable() {
			return true;
		}

		public Boolean CBDEPTIsKey() {
			return false;
		}

		public Integer CBDEPTLength() {
			return null;
		}

		public Integer CBDEPTPrecision() {
			return null;
		}

		public String CBDEPTDefault() {

			return "";

		}

		public String CBDEPTComment() {

			return "";

		}

		public String CBDEPTPattern() {

			return "";

		}

		public String CBDEPTOriginalDbColumnName() {

			return "CBDEPT";

		}

		public BigDecimal CBSDPT;

		public BigDecimal getCBSDPT() {
			return this.CBSDPT;
		}

		public Boolean CBSDPTIsNullable() {
			return true;
		}

		public Boolean CBSDPTIsKey() {
			return false;
		}

		public Integer CBSDPTLength() {
			return null;
		}

		public Integer CBSDPTPrecision() {
			return null;
		}

		public String CBSDPTDefault() {

			return "";

		}

		public String CBSDPTComment() {

			return "";

		}

		public String CBSDPTPattern() {

			return "";

		}

		public String CBSDPTOriginalDbColumnName() {

			return "CBSDPT";

		}

		public BigDecimal CBCLAS;

		public BigDecimal getCBCLAS() {
			return this.CBCLAS;
		}

		public Boolean CBCLASIsNullable() {
			return true;
		}

		public Boolean CBCLASIsKey() {
			return false;
		}

		public Integer CBCLASLength() {
			return null;
		}

		public Integer CBCLASPrecision() {
			return null;
		}

		public String CBCLASDefault() {

			return "";

		}

		public String CBCLASComment() {

			return "";

		}

		public String CBCLASPattern() {

			return "";

		}

		public String CBCLASOriginalDbColumnName() {

			return "CBCLAS";

		}

		public BigDecimal CBSCLS;

		public BigDecimal getCBSCLS() {
			return this.CBSCLS;
		}

		public Boolean CBSCLSIsNullable() {
			return true;
		}

		public Boolean CBSCLSIsKey() {
			return false;
		}

		public Integer CBSCLSLength() {
			return null;
		}

		public Integer CBSCLSPrecision() {
			return null;
		}

		public String CBSCLSDefault() {

			return "";

		}

		public String CBSCLSComment() {

			return "";

		}

		public String CBSCLSPattern() {

			return "";

		}

		public String CBSCLSOriginalDbColumnName() {

			return "CBSCLS";

		}

		public BigDecimal CBVNDR;

		public BigDecimal getCBVNDR() {
			return this.CBVNDR;
		}

		public Boolean CBVNDRIsNullable() {
			return true;
		}

		public Boolean CBVNDRIsKey() {
			return false;
		}

		public Integer CBVNDRLength() {
			return null;
		}

		public Integer CBVNDRPrecision() {
			return null;
		}

		public String CBVNDRDefault() {

			return "";

		}

		public String CBVNDRComment() {

			return "";

		}

		public String CBVNDRPattern() {

			return "";

		}

		public String CBVNDROriginalDbColumnName() {

			return "CBVNDR";

		}

		public String CBSTYL;

		public String getCBSTYL() {
			return this.CBSTYL;
		}

		public Boolean CBSTYLIsNullable() {
			return true;
		}

		public Boolean CBSTYLIsKey() {
			return false;
		}

		public Integer CBSTYLLength() {
			return null;
		}

		public Integer CBSTYLPrecision() {
			return null;
		}

		public String CBSTYLDefault() {

			return null;

		}

		public String CBSTYLComment() {

			return "";

		}

		public String CBSTYLPattern() {

			return "";

		}

		public String CBSTYLOriginalDbColumnName() {

			return "CBSTYL";

		}

		public BigDecimal CBPOOQ;

		public BigDecimal getCBPOOQ() {
			return this.CBPOOQ;
		}

		public Boolean CBPOOQIsNullable() {
			return true;
		}

		public Boolean CBPOOQIsKey() {
			return false;
		}

		public Integer CBPOOQLength() {
			return null;
		}

		public Integer CBPOOQPrecision() {
			return null;
		}

		public String CBPOOQDefault() {

			return "";

		}

		public String CBPOOQComment() {

			return "";

		}

		public String CBPOOQPattern() {

			return "";

		}

		public String CBPOOQOriginalDbColumnName() {

			return "CBPOOQ";

		}

		public BigDecimal CBTOOQ;

		public BigDecimal getCBTOOQ() {
			return this.CBTOOQ;
		}

		public Boolean CBTOOQIsNullable() {
			return true;
		}

		public Boolean CBTOOQIsKey() {
			return false;
		}

		public Integer CBTOOQLength() {
			return null;
		}

		public Integer CBTOOQPrecision() {
			return null;
		}

		public String CBTOOQDefault() {

			return "";

		}

		public String CBTOOQComment() {

			return "";

		}

		public String CBTOOQPattern() {

			return "";

		}

		public String CBTOOQOriginalDbColumnName() {

			return "CBTOOQ";

		}

		public BigDecimal CBINTQ;

		public BigDecimal getCBINTQ() {
			return this.CBINTQ;
		}

		public Boolean CBINTQIsNullable() {
			return true;
		}

		public Boolean CBINTQIsKey() {
			return false;
		}

		public Integer CBINTQLength() {
			return null;
		}

		public Integer CBINTQPrecision() {
			return null;
		}

		public String CBINTQDefault() {

			return "";

		}

		public String CBINTQComment() {

			return "";

		}

		public String CBINTQPattern() {

			return "";

		}

		public String CBINTQOriginalDbColumnName() {

			return "CBINTQ";

		}

		public BigDecimal CBMASU;

		public BigDecimal getCBMASU() {
			return this.CBMASU;
		}

		public Boolean CBMASUIsNullable() {
			return true;
		}

		public Boolean CBMASUIsKey() {
			return false;
		}

		public Integer CBMASULength() {
			return null;
		}

		public Integer CBMASUPrecision() {
			return null;
		}

		public String CBMASUDefault() {

			return "";

		}

		public String CBMASUComment() {

			return "";

		}

		public String CBMASUPattern() {

			return "";

		}

		public String CBMASUOriginalDbColumnName() {

			return "CBMASU";

		}

		public BigDecimal CBMASD;

		public BigDecimal getCBMASD() {
			return this.CBMASD;
		}

		public Boolean CBMASDIsNullable() {
			return true;
		}

		public Boolean CBMASDIsKey() {
			return false;
		}

		public Integer CBMASDLength() {
			return null;
		}

		public Integer CBMASDPrecision() {
			return null;
		}

		public String CBMASDDefault() {

			return "";

		}

		public String CBMASDComment() {

			return "";

		}

		public String CBMASDPattern() {

			return "";

		}

		public String CBMASDOriginalDbColumnName() {

			return "CBMASD";

		}

		public BigDecimal CBMASV;

		public BigDecimal getCBMASV() {
			return this.CBMASV;
		}

		public Boolean CBMASVIsNullable() {
			return true;
		}

		public Boolean CBMASVIsKey() {
			return false;
		}

		public Integer CBMASVLength() {
			return null;
		}

		public Integer CBMASVPrecision() {
			return null;
		}

		public String CBMASVDefault() {

			return "";

		}

		public String CBMASVComment() {

			return "";

		}

		public String CBMASVPattern() {

			return "";

		}

		public String CBMASVOriginalDbColumnName() {

			return "CBMASV";

		}

		public BigDecimal CBMASC;

		public BigDecimal getCBMASC() {
			return this.CBMASC;
		}

		public Boolean CBMASCIsNullable() {
			return true;
		}

		public Boolean CBMASCIsKey() {
			return false;
		}

		public Integer CBMASCLength() {
			return null;
		}

		public Integer CBMASCPrecision() {
			return null;
		}

		public String CBMASCDefault() {

			return "";

		}

		public String CBMASCComment() {

			return "";

		}

		public String CBMASCPattern() {

			return "";

		}

		public String CBMASCOriginalDbColumnName() {

			return "CBMASC";

		}

		public BigDecimal CBLAVC;

		public BigDecimal getCBLAVC() {
			return this.CBLAVC;
		}

		public Boolean CBLAVCIsNullable() {
			return true;
		}

		public Boolean CBLAVCIsKey() {
			return false;
		}

		public Integer CBLAVCLength() {
			return null;
		}

		public Integer CBLAVCPrecision() {
			return null;
		}

		public String CBLAVCDefault() {

			return "";

		}

		public String CBLAVCComment() {

			return "";

		}

		public String CBLAVCPattern() {

			return "";

		}

		public String CBLAVCOriginalDbColumnName() {

			return "CBLAVC";

		}

		public BigDecimal CBARQT;

		public BigDecimal getCBARQT() {
			return this.CBARQT;
		}

		public Boolean CBARQTIsNullable() {
			return true;
		}

		public Boolean CBARQTIsKey() {
			return false;
		}

		public Integer CBARQTLength() {
			return null;
		}

		public Integer CBARQTPrecision() {
			return null;
		}

		public String CBARQTDefault() {

			return "";

		}

		public String CBARQTComment() {

			return "";

		}

		public String CBARQTPattern() {

			return "";

		}

		public String CBARQTOriginalDbColumnName() {

			return "CBARQT";

		}

		public BigDecimal CBNSQT;

		public BigDecimal getCBNSQT() {
			return this.CBNSQT;
		}

		public Boolean CBNSQTIsNullable() {
			return true;
		}

		public Boolean CBNSQTIsKey() {
			return false;
		}

		public Integer CBNSQTLength() {
			return null;
		}

		public Integer CBNSQTPrecision() {
			return null;
		}

		public String CBNSQTDefault() {

			return "";

		}

		public String CBNSQTComment() {

			return "";

		}

		public String CBNSQTPattern() {

			return "";

		}

		public String CBNSQTOriginalDbColumnName() {

			return "CBNSQT";

		}

		public BigDecimal CBHLDQ;

		public BigDecimal getCBHLDQ() {
			return this.CBHLDQ;
		}

		public Boolean CBHLDQIsNullable() {
			return true;
		}

		public Boolean CBHLDQIsKey() {
			return false;
		}

		public Integer CBHLDQLength() {
			return null;
		}

		public Integer CBHLDQPrecision() {
			return null;
		}

		public String CBHLDQDefault() {

			return "";

		}

		public String CBHLDQComment() {

			return "";

		}

		public String CBHLDQPattern() {

			return "";

		}

		public String CBHLDQOriginalDbColumnName() {

			return "CBHLDQ";

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

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

					this.DATELOADED = readDate(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

					this.DATELOADED = readDate(dis);

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

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

				// java.util.Date

				writeDate(this.DATELOADED, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

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
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",CBHBOY=" + String.valueOf(CBHBOY));
			sb.append(",CBHBOP=" + String.valueOf(CBHBOP));
			sb.append(",CBHAND=" + String.valueOf(CBHAND));
			sb.append(",CBTRNS=" + String.valueOf(CBTRNS));
			sb.append(",CBGMRI=" + String.valueOf(CBGMRI));
			sb.append(",CBWKCR=" + String.valueOf(CBWKCR));
			sb.append(",CBWK01=" + String.valueOf(CBWK01));
			sb.append(",CBWK02=" + String.valueOf(CBWK02));
			sb.append(",CBWK03=" + String.valueOf(CBWK03));
			sb.append(",CBWK04=" + String.valueOf(CBWK04));
			sb.append(",CBWK05=" + String.valueOf(CBWK05));
			sb.append(",CBWK06=" + String.valueOf(CBWK06));
			sb.append(",CBWK07=" + String.valueOf(CBWK07));
			sb.append(",CBWK08=" + String.valueOf(CBWK08));
			sb.append(",CBRSUP=" + String.valueOf(CBRSUP));
			sb.append(",CBRSUY=" + String.valueOf(CBRSUY));
			sb.append(",CBRSDP=" + String.valueOf(CBRSDP));
			sb.append(",CBRSDY=" + String.valueOf(CBRSDY));
			sb.append(",CBVRSP=" + String.valueOf(CBVRSP));
			sb.append(",CBVRSY=" + String.valueOf(CBVRSY));
			sb.append(",CBRCSP=" + String.valueOf(CBRCSP));
			sb.append(",CBRCSY=" + String.valueOf(CBRCSY));
			sb.append(",CBASUP=" + String.valueOf(CBASUP));
			sb.append(",CBASUY=" + String.valueOf(CBASUY));
			sb.append(",CBASDP=" + String.valueOf(CBASDP));
			sb.append(",CBASDY=" + String.valueOf(CBASDY));
			sb.append(",CBVASP=" + String.valueOf(CBVASP));
			sb.append(",CBVASY=" + String.valueOf(CBVASY));
			sb.append(",CBACSP=" + String.valueOf(CBACSP));
			sb.append(",CBACSY=" + String.valueOf(CBACSY));
			sb.append(",CBRETS=" + String.valueOf(CBRETS));
			sb.append(",CBRCUP=" + String.valueOf(CBRCUP));
			sb.append(",CBRCUY=" + String.valueOf(CBRCUY));
			sb.append(",CBRCDP=" + String.valueOf(CBRCDP));
			sb.append(",CBRCDY=" + String.valueOf(CBRCDY));
			sb.append(",CBTIUP=" + String.valueOf(CBTIUP));
			sb.append(",CBTIUY=" + String.valueOf(CBTIUY));
			sb.append(",CBTOUP=" + String.valueOf(CBTOUP));
			sb.append(",CBTOUY=" + String.valueOf(CBTOUY));
			sb.append(",CBTFDP=" + String.valueOf(CBTFDP));
			sb.append(",CBTFDY=" + String.valueOf(CBTFDY));
			sb.append(",CBRVUP=" + String.valueOf(CBRVUP));
			sb.append(",CBRVUY=" + String.valueOf(CBRVUY));
			sb.append(",CBRVDP=" + String.valueOf(CBRVDP));
			sb.append(",CBRVDY=" + String.valueOf(CBRVDY));
			sb.append(",CBAJUP=" + String.valueOf(CBAJUP));
			sb.append(",CBAJUY=" + String.valueOf(CBAJUY));
			sb.append(",CBAJDP=" + String.valueOf(CBAJDP));
			sb.append(",CBAJDY=" + String.valueOf(CBAJDY));
			sb.append(",CBPHUP=" + String.valueOf(CBPHUP));
			sb.append(",CBPHUY=" + String.valueOf(CBPHUY));
			sb.append(",CBPHDP=" + String.valueOf(CBPHDP));
			sb.append(",CBPHDY=" + String.valueOf(CBPHDY));
			sb.append(",CBAVGC=" + String.valueOf(CBAVGC));
			sb.append(",CBAVOH=" + String.valueOf(CBAVOH));
			sb.append(",CBAVRT=" + String.valueOf(CBAVRT));
			sb.append(",CBAVCS=" + String.valueOf(CBAVCS));
			sb.append(",CBDEPT=" + String.valueOf(CBDEPT));
			sb.append(",CBSDPT=" + String.valueOf(CBSDPT));
			sb.append(",CBCLAS=" + String.valueOf(CBCLAS));
			sb.append(",CBSCLS=" + String.valueOf(CBSCLS));
			sb.append(",CBVNDR=" + String.valueOf(CBVNDR));
			sb.append(",CBSTYL=" + CBSTYL);
			sb.append(",CBPOOQ=" + String.valueOf(CBPOOQ));
			sb.append(",CBTOOQ=" + String.valueOf(CBTOOQ));
			sb.append(",CBINTQ=" + String.valueOf(CBINTQ));
			sb.append(",CBMASU=" + String.valueOf(CBMASU));
			sb.append(",CBMASD=" + String.valueOf(CBMASD));
			sb.append(",CBMASV=" + String.valueOf(CBMASV));
			sb.append(",CBMASC=" + String.valueOf(CBMASC));
			sb.append(",CBLAVC=" + String.valueOf(CBLAVC));
			sb.append(",CBARQT=" + String.valueOf(CBARQT));
			sb.append(",CBNSQT=" + String.valueOf(CBNSQT));
			sb.append(",CBHLDQ=" + String.valueOf(CBHLDQ));
			sb.append(",DATELOADED=" + String.valueOf(DATELOADED));
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

			if (CBHBOY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOY);
			}

			sb.append("|");

			if (CBHBOP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOP);
			}

			sb.append("|");

			if (CBHAND == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHAND);
			}

			sb.append("|");

			if (CBTRNS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTRNS);
			}

			sb.append("|");

			if (CBGMRI == null) {
				sb.append("<null>");
			} else {
				sb.append(CBGMRI);
			}

			sb.append("|");

			if (CBWKCR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWKCR);
			}

			sb.append("|");

			if (CBWK01 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK01);
			}

			sb.append("|");

			if (CBWK02 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK02);
			}

			sb.append("|");

			if (CBWK03 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK03);
			}

			sb.append("|");

			if (CBWK04 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK04);
			}

			sb.append("|");

			if (CBWK05 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK05);
			}

			sb.append("|");

			if (CBWK06 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK06);
			}

			sb.append("|");

			if (CBWK07 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK07);
			}

			sb.append("|");

			if (CBWK08 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK08);
			}

			sb.append("|");

			if (CBRSUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUP);
			}

			sb.append("|");

			if (CBRSUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUY);
			}

			sb.append("|");

			if (CBRSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDP);
			}

			sb.append("|");

			if (CBRSDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDY);
			}

			sb.append("|");

			if (CBVRSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSP);
			}

			sb.append("|");

			if (CBVRSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSY);
			}

			sb.append("|");

			if (CBRCSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSP);
			}

			sb.append("|");

			if (CBRCSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSY);
			}

			sb.append("|");

			if (CBASUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUP);
			}

			sb.append("|");

			if (CBASUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUY);
			}

			sb.append("|");

			if (CBASDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDP);
			}

			sb.append("|");

			if (CBASDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDY);
			}

			sb.append("|");

			if (CBVASP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASP);
			}

			sb.append("|");

			if (CBVASY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASY);
			}

			sb.append("|");

			if (CBACSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSP);
			}

			sb.append("|");

			if (CBACSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSY);
			}

			sb.append("|");

			if (CBRETS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRETS);
			}

			sb.append("|");

			if (CBRCUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUP);
			}

			sb.append("|");

			if (CBRCUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUY);
			}

			sb.append("|");

			if (CBRCDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDP);
			}

			sb.append("|");

			if (CBRCDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDY);
			}

			sb.append("|");

			if (CBTIUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUP);
			}

			sb.append("|");

			if (CBTIUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUY);
			}

			sb.append("|");

			if (CBTOUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUP);
			}

			sb.append("|");

			if (CBTOUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUY);
			}

			sb.append("|");

			if (CBTFDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDP);
			}

			sb.append("|");

			if (CBTFDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDY);
			}

			sb.append("|");

			if (CBRVUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUP);
			}

			sb.append("|");

			if (CBRVUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUY);
			}

			sb.append("|");

			if (CBRVDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDP);
			}

			sb.append("|");

			if (CBRVDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDY);
			}

			sb.append("|");

			if (CBAJUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUP);
			}

			sb.append("|");

			if (CBAJUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUY);
			}

			sb.append("|");

			if (CBAJDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDP);
			}

			sb.append("|");

			if (CBAJDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDY);
			}

			sb.append("|");

			if (CBPHUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUP);
			}

			sb.append("|");

			if (CBPHUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUY);
			}

			sb.append("|");

			if (CBPHDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDP);
			}

			sb.append("|");

			if (CBPHDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDY);
			}

			sb.append("|");

			if (CBAVGC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVGC);
			}

			sb.append("|");

			if (CBAVOH == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVOH);
			}

			sb.append("|");

			if (CBAVRT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVRT);
			}

			sb.append("|");

			if (CBAVCS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVCS);
			}

			sb.append("|");

			if (CBDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBDEPT);
			}

			sb.append("|");

			if (CBSDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSDPT);
			}

			sb.append("|");

			if (CBCLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBCLAS);
			}

			sb.append("|");

			if (CBSCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSCLS);
			}

			sb.append("|");

			if (CBVNDR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVNDR);
			}

			sb.append("|");

			if (CBSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSTYL);
			}

			sb.append("|");

			if (CBPOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPOOQ);
			}

			sb.append("|");

			if (CBTOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOOQ);
			}

			sb.append("|");

			if (CBINTQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBINTQ);
			}

			sb.append("|");

			if (CBMASU == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASU);
			}

			sb.append("|");

			if (CBMASD == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASD);
			}

			sb.append("|");

			if (CBMASV == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASV);
			}

			sb.append("|");

			if (CBMASC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASC);
			}

			sb.append("|");

			if (CBLAVC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBLAVC);
			}

			sb.append("|");

			if (CBARQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBARQT);
			}

			sb.append("|");

			if (CBNSQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBNSQT);
			}

			sb.append("|");

			if (CBHLDQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHLDQ);
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
		public int compareTo(tmap_INVCBLStruct other) {

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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

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

		public BigDecimal CBHBOY;

		public BigDecimal getCBHBOY() {
			return this.CBHBOY;
		}

		public Boolean CBHBOYIsNullable() {
			return true;
		}

		public Boolean CBHBOYIsKey() {
			return false;
		}

		public Integer CBHBOYLength() {
			return null;
		}

		public Integer CBHBOYPrecision() {
			return null;
		}

		public String CBHBOYDefault() {

			return "";

		}

		public String CBHBOYComment() {

			return "";

		}

		public String CBHBOYPattern() {

			return "";

		}

		public String CBHBOYOriginalDbColumnName() {

			return "CBHBOY";

		}

		public BigDecimal CBHBOP;

		public BigDecimal getCBHBOP() {
			return this.CBHBOP;
		}

		public Boolean CBHBOPIsNullable() {
			return true;
		}

		public Boolean CBHBOPIsKey() {
			return false;
		}

		public Integer CBHBOPLength() {
			return null;
		}

		public Integer CBHBOPPrecision() {
			return null;
		}

		public String CBHBOPDefault() {

			return "";

		}

		public String CBHBOPComment() {

			return "";

		}

		public String CBHBOPPattern() {

			return "";

		}

		public String CBHBOPOriginalDbColumnName() {

			return "CBHBOP";

		}

		public BigDecimal CBHAND;

		public BigDecimal getCBHAND() {
			return this.CBHAND;
		}

		public Boolean CBHANDIsNullable() {
			return true;
		}

		public Boolean CBHANDIsKey() {
			return false;
		}

		public Integer CBHANDLength() {
			return null;
		}

		public Integer CBHANDPrecision() {
			return null;
		}

		public String CBHANDDefault() {

			return "";

		}

		public String CBHANDComment() {

			return "";

		}

		public String CBHANDPattern() {

			return "";

		}

		public String CBHANDOriginalDbColumnName() {

			return "CBHAND";

		}

		public BigDecimal CBTRNS;

		public BigDecimal getCBTRNS() {
			return this.CBTRNS;
		}

		public Boolean CBTRNSIsNullable() {
			return true;
		}

		public Boolean CBTRNSIsKey() {
			return false;
		}

		public Integer CBTRNSLength() {
			return null;
		}

		public Integer CBTRNSPrecision() {
			return null;
		}

		public String CBTRNSDefault() {

			return "";

		}

		public String CBTRNSComment() {

			return "";

		}

		public String CBTRNSPattern() {

			return "";

		}

		public String CBTRNSOriginalDbColumnName() {

			return "CBTRNS";

		}

		public BigDecimal CBGMRI;

		public BigDecimal getCBGMRI() {
			return this.CBGMRI;
		}

		public Boolean CBGMRIIsNullable() {
			return true;
		}

		public Boolean CBGMRIIsKey() {
			return false;
		}

		public Integer CBGMRILength() {
			return null;
		}

		public Integer CBGMRIPrecision() {
			return null;
		}

		public String CBGMRIDefault() {

			return "";

		}

		public String CBGMRIComment() {

			return "";

		}

		public String CBGMRIPattern() {

			return "";

		}

		public String CBGMRIOriginalDbColumnName() {

			return "CBGMRI";

		}

		public BigDecimal CBWKCR;

		public BigDecimal getCBWKCR() {
			return this.CBWKCR;
		}

		public Boolean CBWKCRIsNullable() {
			return true;
		}

		public Boolean CBWKCRIsKey() {
			return false;
		}

		public Integer CBWKCRLength() {
			return null;
		}

		public Integer CBWKCRPrecision() {
			return null;
		}

		public String CBWKCRDefault() {

			return "";

		}

		public String CBWKCRComment() {

			return "";

		}

		public String CBWKCRPattern() {

			return "";

		}

		public String CBWKCROriginalDbColumnName() {

			return "CBWKCR";

		}

		public BigDecimal CBWK01;

		public BigDecimal getCBWK01() {
			return this.CBWK01;
		}

		public Boolean CBWK01IsNullable() {
			return true;
		}

		public Boolean CBWK01IsKey() {
			return false;
		}

		public Integer CBWK01Length() {
			return null;
		}

		public Integer CBWK01Precision() {
			return null;
		}

		public String CBWK01Default() {

			return "";

		}

		public String CBWK01Comment() {

			return "";

		}

		public String CBWK01Pattern() {

			return "";

		}

		public String CBWK01OriginalDbColumnName() {

			return "CBWK01";

		}

		public BigDecimal CBWK02;

		public BigDecimal getCBWK02() {
			return this.CBWK02;
		}

		public Boolean CBWK02IsNullable() {
			return true;
		}

		public Boolean CBWK02IsKey() {
			return false;
		}

		public Integer CBWK02Length() {
			return null;
		}

		public Integer CBWK02Precision() {
			return null;
		}

		public String CBWK02Default() {

			return "";

		}

		public String CBWK02Comment() {

			return "";

		}

		public String CBWK02Pattern() {

			return "";

		}

		public String CBWK02OriginalDbColumnName() {

			return "CBWK02";

		}

		public BigDecimal CBWK03;

		public BigDecimal getCBWK03() {
			return this.CBWK03;
		}

		public Boolean CBWK03IsNullable() {
			return true;
		}

		public Boolean CBWK03IsKey() {
			return false;
		}

		public Integer CBWK03Length() {
			return null;
		}

		public Integer CBWK03Precision() {
			return null;
		}

		public String CBWK03Default() {

			return "";

		}

		public String CBWK03Comment() {

			return "";

		}

		public String CBWK03Pattern() {

			return "";

		}

		public String CBWK03OriginalDbColumnName() {

			return "CBWK03";

		}

		public BigDecimal CBWK04;

		public BigDecimal getCBWK04() {
			return this.CBWK04;
		}

		public Boolean CBWK04IsNullable() {
			return true;
		}

		public Boolean CBWK04IsKey() {
			return false;
		}

		public Integer CBWK04Length() {
			return null;
		}

		public Integer CBWK04Precision() {
			return null;
		}

		public String CBWK04Default() {

			return "";

		}

		public String CBWK04Comment() {

			return "";

		}

		public String CBWK04Pattern() {

			return "";

		}

		public String CBWK04OriginalDbColumnName() {

			return "CBWK04";

		}

		public BigDecimal CBWK05;

		public BigDecimal getCBWK05() {
			return this.CBWK05;
		}

		public Boolean CBWK05IsNullable() {
			return true;
		}

		public Boolean CBWK05IsKey() {
			return false;
		}

		public Integer CBWK05Length() {
			return null;
		}

		public Integer CBWK05Precision() {
			return null;
		}

		public String CBWK05Default() {

			return "";

		}

		public String CBWK05Comment() {

			return "";

		}

		public String CBWK05Pattern() {

			return "";

		}

		public String CBWK05OriginalDbColumnName() {

			return "CBWK05";

		}

		public BigDecimal CBWK06;

		public BigDecimal getCBWK06() {
			return this.CBWK06;
		}

		public Boolean CBWK06IsNullable() {
			return true;
		}

		public Boolean CBWK06IsKey() {
			return false;
		}

		public Integer CBWK06Length() {
			return null;
		}

		public Integer CBWK06Precision() {
			return null;
		}

		public String CBWK06Default() {

			return "";

		}

		public String CBWK06Comment() {

			return "";

		}

		public String CBWK06Pattern() {

			return "";

		}

		public String CBWK06OriginalDbColumnName() {

			return "CBWK06";

		}

		public BigDecimal CBWK07;

		public BigDecimal getCBWK07() {
			return this.CBWK07;
		}

		public Boolean CBWK07IsNullable() {
			return true;
		}

		public Boolean CBWK07IsKey() {
			return false;
		}

		public Integer CBWK07Length() {
			return null;
		}

		public Integer CBWK07Precision() {
			return null;
		}

		public String CBWK07Default() {

			return "";

		}

		public String CBWK07Comment() {

			return "";

		}

		public String CBWK07Pattern() {

			return "";

		}

		public String CBWK07OriginalDbColumnName() {

			return "CBWK07";

		}

		public BigDecimal CBWK08;

		public BigDecimal getCBWK08() {
			return this.CBWK08;
		}

		public Boolean CBWK08IsNullable() {
			return true;
		}

		public Boolean CBWK08IsKey() {
			return false;
		}

		public Integer CBWK08Length() {
			return null;
		}

		public Integer CBWK08Precision() {
			return null;
		}

		public String CBWK08Default() {

			return "";

		}

		public String CBWK08Comment() {

			return "";

		}

		public String CBWK08Pattern() {

			return "";

		}

		public String CBWK08OriginalDbColumnName() {

			return "CBWK08";

		}

		public BigDecimal CBRSUP;

		public BigDecimal getCBRSUP() {
			return this.CBRSUP;
		}

		public Boolean CBRSUPIsNullable() {
			return true;
		}

		public Boolean CBRSUPIsKey() {
			return false;
		}

		public Integer CBRSUPLength() {
			return null;
		}

		public Integer CBRSUPPrecision() {
			return null;
		}

		public String CBRSUPDefault() {

			return "";

		}

		public String CBRSUPComment() {

			return "";

		}

		public String CBRSUPPattern() {

			return "";

		}

		public String CBRSUPOriginalDbColumnName() {

			return "CBRSUP";

		}

		public BigDecimal CBRSUY;

		public BigDecimal getCBRSUY() {
			return this.CBRSUY;
		}

		public Boolean CBRSUYIsNullable() {
			return true;
		}

		public Boolean CBRSUYIsKey() {
			return false;
		}

		public Integer CBRSUYLength() {
			return null;
		}

		public Integer CBRSUYPrecision() {
			return null;
		}

		public String CBRSUYDefault() {

			return "";

		}

		public String CBRSUYComment() {

			return "";

		}

		public String CBRSUYPattern() {

			return "";

		}

		public String CBRSUYOriginalDbColumnName() {

			return "CBRSUY";

		}

		public BigDecimal CBRSDP;

		public BigDecimal getCBRSDP() {
			return this.CBRSDP;
		}

		public Boolean CBRSDPIsNullable() {
			return true;
		}

		public Boolean CBRSDPIsKey() {
			return false;
		}

		public Integer CBRSDPLength() {
			return null;
		}

		public Integer CBRSDPPrecision() {
			return null;
		}

		public String CBRSDPDefault() {

			return "";

		}

		public String CBRSDPComment() {

			return "";

		}

		public String CBRSDPPattern() {

			return "";

		}

		public String CBRSDPOriginalDbColumnName() {

			return "CBRSDP";

		}

		public BigDecimal CBRSDY;

		public BigDecimal getCBRSDY() {
			return this.CBRSDY;
		}

		public Boolean CBRSDYIsNullable() {
			return true;
		}

		public Boolean CBRSDYIsKey() {
			return false;
		}

		public Integer CBRSDYLength() {
			return null;
		}

		public Integer CBRSDYPrecision() {
			return null;
		}

		public String CBRSDYDefault() {

			return "";

		}

		public String CBRSDYComment() {

			return "";

		}

		public String CBRSDYPattern() {

			return "";

		}

		public String CBRSDYOriginalDbColumnName() {

			return "CBRSDY";

		}

		public BigDecimal CBVRSP;

		public BigDecimal getCBVRSP() {
			return this.CBVRSP;
		}

		public Boolean CBVRSPIsNullable() {
			return true;
		}

		public Boolean CBVRSPIsKey() {
			return false;
		}

		public Integer CBVRSPLength() {
			return null;
		}

		public Integer CBVRSPPrecision() {
			return null;
		}

		public String CBVRSPDefault() {

			return "";

		}

		public String CBVRSPComment() {

			return "";

		}

		public String CBVRSPPattern() {

			return "";

		}

		public String CBVRSPOriginalDbColumnName() {

			return "CBVRSP";

		}

		public BigDecimal CBVRSY;

		public BigDecimal getCBVRSY() {
			return this.CBVRSY;
		}

		public Boolean CBVRSYIsNullable() {
			return true;
		}

		public Boolean CBVRSYIsKey() {
			return false;
		}

		public Integer CBVRSYLength() {
			return null;
		}

		public Integer CBVRSYPrecision() {
			return null;
		}

		public String CBVRSYDefault() {

			return "";

		}

		public String CBVRSYComment() {

			return "";

		}

		public String CBVRSYPattern() {

			return "";

		}

		public String CBVRSYOriginalDbColumnName() {

			return "CBVRSY";

		}

		public BigDecimal CBRCSP;

		public BigDecimal getCBRCSP() {
			return this.CBRCSP;
		}

		public Boolean CBRCSPIsNullable() {
			return true;
		}

		public Boolean CBRCSPIsKey() {
			return false;
		}

		public Integer CBRCSPLength() {
			return null;
		}

		public Integer CBRCSPPrecision() {
			return null;
		}

		public String CBRCSPDefault() {

			return "";

		}

		public String CBRCSPComment() {

			return "";

		}

		public String CBRCSPPattern() {

			return "";

		}

		public String CBRCSPOriginalDbColumnName() {

			return "CBRCSP";

		}

		public BigDecimal CBRCSY;

		public BigDecimal getCBRCSY() {
			return this.CBRCSY;
		}

		public Boolean CBRCSYIsNullable() {
			return true;
		}

		public Boolean CBRCSYIsKey() {
			return false;
		}

		public Integer CBRCSYLength() {
			return null;
		}

		public Integer CBRCSYPrecision() {
			return null;
		}

		public String CBRCSYDefault() {

			return "";

		}

		public String CBRCSYComment() {

			return "";

		}

		public String CBRCSYPattern() {

			return "";

		}

		public String CBRCSYOriginalDbColumnName() {

			return "CBRCSY";

		}

		public BigDecimal CBASUP;

		public BigDecimal getCBASUP() {
			return this.CBASUP;
		}

		public Boolean CBASUPIsNullable() {
			return true;
		}

		public Boolean CBASUPIsKey() {
			return false;
		}

		public Integer CBASUPLength() {
			return null;
		}

		public Integer CBASUPPrecision() {
			return null;
		}

		public String CBASUPDefault() {

			return "";

		}

		public String CBASUPComment() {

			return "";

		}

		public String CBASUPPattern() {

			return "";

		}

		public String CBASUPOriginalDbColumnName() {

			return "CBASUP";

		}

		public BigDecimal CBASUY;

		public BigDecimal getCBASUY() {
			return this.CBASUY;
		}

		public Boolean CBASUYIsNullable() {
			return true;
		}

		public Boolean CBASUYIsKey() {
			return false;
		}

		public Integer CBASUYLength() {
			return null;
		}

		public Integer CBASUYPrecision() {
			return null;
		}

		public String CBASUYDefault() {

			return "";

		}

		public String CBASUYComment() {

			return "";

		}

		public String CBASUYPattern() {

			return "";

		}

		public String CBASUYOriginalDbColumnName() {

			return "CBASUY";

		}

		public BigDecimal CBASDP;

		public BigDecimal getCBASDP() {
			return this.CBASDP;
		}

		public Boolean CBASDPIsNullable() {
			return true;
		}

		public Boolean CBASDPIsKey() {
			return false;
		}

		public Integer CBASDPLength() {
			return null;
		}

		public Integer CBASDPPrecision() {
			return null;
		}

		public String CBASDPDefault() {

			return "";

		}

		public String CBASDPComment() {

			return "";

		}

		public String CBASDPPattern() {

			return "";

		}

		public String CBASDPOriginalDbColumnName() {

			return "CBASDP";

		}

		public BigDecimal CBASDY;

		public BigDecimal getCBASDY() {
			return this.CBASDY;
		}

		public Boolean CBASDYIsNullable() {
			return true;
		}

		public Boolean CBASDYIsKey() {
			return false;
		}

		public Integer CBASDYLength() {
			return null;
		}

		public Integer CBASDYPrecision() {
			return null;
		}

		public String CBASDYDefault() {

			return "";

		}

		public String CBASDYComment() {

			return "";

		}

		public String CBASDYPattern() {

			return "";

		}

		public String CBASDYOriginalDbColumnName() {

			return "CBASDY";

		}

		public BigDecimal CBVASP;

		public BigDecimal getCBVASP() {
			return this.CBVASP;
		}

		public Boolean CBVASPIsNullable() {
			return true;
		}

		public Boolean CBVASPIsKey() {
			return false;
		}

		public Integer CBVASPLength() {
			return null;
		}

		public Integer CBVASPPrecision() {
			return null;
		}

		public String CBVASPDefault() {

			return "";

		}

		public String CBVASPComment() {

			return "";

		}

		public String CBVASPPattern() {

			return "";

		}

		public String CBVASPOriginalDbColumnName() {

			return "CBVASP";

		}

		public BigDecimal CBVASY;

		public BigDecimal getCBVASY() {
			return this.CBVASY;
		}

		public Boolean CBVASYIsNullable() {
			return true;
		}

		public Boolean CBVASYIsKey() {
			return false;
		}

		public Integer CBVASYLength() {
			return null;
		}

		public Integer CBVASYPrecision() {
			return null;
		}

		public String CBVASYDefault() {

			return "";

		}

		public String CBVASYComment() {

			return "";

		}

		public String CBVASYPattern() {

			return "";

		}

		public String CBVASYOriginalDbColumnName() {

			return "CBVASY";

		}

		public BigDecimal CBACSP;

		public BigDecimal getCBACSP() {
			return this.CBACSP;
		}

		public Boolean CBACSPIsNullable() {
			return true;
		}

		public Boolean CBACSPIsKey() {
			return false;
		}

		public Integer CBACSPLength() {
			return null;
		}

		public Integer CBACSPPrecision() {
			return null;
		}

		public String CBACSPDefault() {

			return "";

		}

		public String CBACSPComment() {

			return "";

		}

		public String CBACSPPattern() {

			return "";

		}

		public String CBACSPOriginalDbColumnName() {

			return "CBACSP";

		}

		public BigDecimal CBACSY;

		public BigDecimal getCBACSY() {
			return this.CBACSY;
		}

		public Boolean CBACSYIsNullable() {
			return true;
		}

		public Boolean CBACSYIsKey() {
			return false;
		}

		public Integer CBACSYLength() {
			return null;
		}

		public Integer CBACSYPrecision() {
			return null;
		}

		public String CBACSYDefault() {

			return "";

		}

		public String CBACSYComment() {

			return "";

		}

		public String CBACSYPattern() {

			return "";

		}

		public String CBACSYOriginalDbColumnName() {

			return "CBACSY";

		}

		public BigDecimal CBRETS;

		public BigDecimal getCBRETS() {
			return this.CBRETS;
		}

		public Boolean CBRETSIsNullable() {
			return true;
		}

		public Boolean CBRETSIsKey() {
			return false;
		}

		public Integer CBRETSLength() {
			return null;
		}

		public Integer CBRETSPrecision() {
			return null;
		}

		public String CBRETSDefault() {

			return "";

		}

		public String CBRETSComment() {

			return "";

		}

		public String CBRETSPattern() {

			return "";

		}

		public String CBRETSOriginalDbColumnName() {

			return "CBRETS";

		}

		public BigDecimal CBRCUP;

		public BigDecimal getCBRCUP() {
			return this.CBRCUP;
		}

		public Boolean CBRCUPIsNullable() {
			return true;
		}

		public Boolean CBRCUPIsKey() {
			return false;
		}

		public Integer CBRCUPLength() {
			return null;
		}

		public Integer CBRCUPPrecision() {
			return null;
		}

		public String CBRCUPDefault() {

			return "";

		}

		public String CBRCUPComment() {

			return "";

		}

		public String CBRCUPPattern() {

			return "";

		}

		public String CBRCUPOriginalDbColumnName() {

			return "CBRCUP";

		}

		public BigDecimal CBRCUY;

		public BigDecimal getCBRCUY() {
			return this.CBRCUY;
		}

		public Boolean CBRCUYIsNullable() {
			return true;
		}

		public Boolean CBRCUYIsKey() {
			return false;
		}

		public Integer CBRCUYLength() {
			return null;
		}

		public Integer CBRCUYPrecision() {
			return null;
		}

		public String CBRCUYDefault() {

			return "";

		}

		public String CBRCUYComment() {

			return "";

		}

		public String CBRCUYPattern() {

			return "";

		}

		public String CBRCUYOriginalDbColumnName() {

			return "CBRCUY";

		}

		public BigDecimal CBRCDP;

		public BigDecimal getCBRCDP() {
			return this.CBRCDP;
		}

		public Boolean CBRCDPIsNullable() {
			return true;
		}

		public Boolean CBRCDPIsKey() {
			return false;
		}

		public Integer CBRCDPLength() {
			return null;
		}

		public Integer CBRCDPPrecision() {
			return null;
		}

		public String CBRCDPDefault() {

			return "";

		}

		public String CBRCDPComment() {

			return "";

		}

		public String CBRCDPPattern() {

			return "";

		}

		public String CBRCDPOriginalDbColumnName() {

			return "CBRCDP";

		}

		public BigDecimal CBRCDY;

		public BigDecimal getCBRCDY() {
			return this.CBRCDY;
		}

		public Boolean CBRCDYIsNullable() {
			return true;
		}

		public Boolean CBRCDYIsKey() {
			return false;
		}

		public Integer CBRCDYLength() {
			return null;
		}

		public Integer CBRCDYPrecision() {
			return null;
		}

		public String CBRCDYDefault() {

			return "";

		}

		public String CBRCDYComment() {

			return "";

		}

		public String CBRCDYPattern() {

			return "";

		}

		public String CBRCDYOriginalDbColumnName() {

			return "CBRCDY";

		}

		public BigDecimal CBTIUP;

		public BigDecimal getCBTIUP() {
			return this.CBTIUP;
		}

		public Boolean CBTIUPIsNullable() {
			return true;
		}

		public Boolean CBTIUPIsKey() {
			return false;
		}

		public Integer CBTIUPLength() {
			return null;
		}

		public Integer CBTIUPPrecision() {
			return null;
		}

		public String CBTIUPDefault() {

			return "";

		}

		public String CBTIUPComment() {

			return "";

		}

		public String CBTIUPPattern() {

			return "";

		}

		public String CBTIUPOriginalDbColumnName() {

			return "CBTIUP";

		}

		public BigDecimal CBTIUY;

		public BigDecimal getCBTIUY() {
			return this.CBTIUY;
		}

		public Boolean CBTIUYIsNullable() {
			return true;
		}

		public Boolean CBTIUYIsKey() {
			return false;
		}

		public Integer CBTIUYLength() {
			return null;
		}

		public Integer CBTIUYPrecision() {
			return null;
		}

		public String CBTIUYDefault() {

			return "";

		}

		public String CBTIUYComment() {

			return "";

		}

		public String CBTIUYPattern() {

			return "";

		}

		public String CBTIUYOriginalDbColumnName() {

			return "CBTIUY";

		}

		public BigDecimal CBTOUP;

		public BigDecimal getCBTOUP() {
			return this.CBTOUP;
		}

		public Boolean CBTOUPIsNullable() {
			return true;
		}

		public Boolean CBTOUPIsKey() {
			return false;
		}

		public Integer CBTOUPLength() {
			return null;
		}

		public Integer CBTOUPPrecision() {
			return null;
		}

		public String CBTOUPDefault() {

			return "";

		}

		public String CBTOUPComment() {

			return "";

		}

		public String CBTOUPPattern() {

			return "";

		}

		public String CBTOUPOriginalDbColumnName() {

			return "CBTOUP";

		}

		public BigDecimal CBTOUY;

		public BigDecimal getCBTOUY() {
			return this.CBTOUY;
		}

		public Boolean CBTOUYIsNullable() {
			return true;
		}

		public Boolean CBTOUYIsKey() {
			return false;
		}

		public Integer CBTOUYLength() {
			return null;
		}

		public Integer CBTOUYPrecision() {
			return null;
		}

		public String CBTOUYDefault() {

			return "";

		}

		public String CBTOUYComment() {

			return "";

		}

		public String CBTOUYPattern() {

			return "";

		}

		public String CBTOUYOriginalDbColumnName() {

			return "CBTOUY";

		}

		public BigDecimal CBTFDP;

		public BigDecimal getCBTFDP() {
			return this.CBTFDP;
		}

		public Boolean CBTFDPIsNullable() {
			return true;
		}

		public Boolean CBTFDPIsKey() {
			return false;
		}

		public Integer CBTFDPLength() {
			return null;
		}

		public Integer CBTFDPPrecision() {
			return null;
		}

		public String CBTFDPDefault() {

			return "";

		}

		public String CBTFDPComment() {

			return "";

		}

		public String CBTFDPPattern() {

			return "";

		}

		public String CBTFDPOriginalDbColumnName() {

			return "CBTFDP";

		}

		public BigDecimal CBTFDY;

		public BigDecimal getCBTFDY() {
			return this.CBTFDY;
		}

		public Boolean CBTFDYIsNullable() {
			return true;
		}

		public Boolean CBTFDYIsKey() {
			return false;
		}

		public Integer CBTFDYLength() {
			return null;
		}

		public Integer CBTFDYPrecision() {
			return null;
		}

		public String CBTFDYDefault() {

			return "";

		}

		public String CBTFDYComment() {

			return "";

		}

		public String CBTFDYPattern() {

			return "";

		}

		public String CBTFDYOriginalDbColumnName() {

			return "CBTFDY";

		}

		public BigDecimal CBRVUP;

		public BigDecimal getCBRVUP() {
			return this.CBRVUP;
		}

		public Boolean CBRVUPIsNullable() {
			return true;
		}

		public Boolean CBRVUPIsKey() {
			return false;
		}

		public Integer CBRVUPLength() {
			return null;
		}

		public Integer CBRVUPPrecision() {
			return null;
		}

		public String CBRVUPDefault() {

			return "";

		}

		public String CBRVUPComment() {

			return "";

		}

		public String CBRVUPPattern() {

			return "";

		}

		public String CBRVUPOriginalDbColumnName() {

			return "CBRVUP";

		}

		public BigDecimal CBRVUY;

		public BigDecimal getCBRVUY() {
			return this.CBRVUY;
		}

		public Boolean CBRVUYIsNullable() {
			return true;
		}

		public Boolean CBRVUYIsKey() {
			return false;
		}

		public Integer CBRVUYLength() {
			return null;
		}

		public Integer CBRVUYPrecision() {
			return null;
		}

		public String CBRVUYDefault() {

			return "";

		}

		public String CBRVUYComment() {

			return "";

		}

		public String CBRVUYPattern() {

			return "";

		}

		public String CBRVUYOriginalDbColumnName() {

			return "CBRVUY";

		}

		public BigDecimal CBRVDP;

		public BigDecimal getCBRVDP() {
			return this.CBRVDP;
		}

		public Boolean CBRVDPIsNullable() {
			return true;
		}

		public Boolean CBRVDPIsKey() {
			return false;
		}

		public Integer CBRVDPLength() {
			return null;
		}

		public Integer CBRVDPPrecision() {
			return null;
		}

		public String CBRVDPDefault() {

			return "";

		}

		public String CBRVDPComment() {

			return "";

		}

		public String CBRVDPPattern() {

			return "";

		}

		public String CBRVDPOriginalDbColumnName() {

			return "CBRVDP";

		}

		public BigDecimal CBRVDY;

		public BigDecimal getCBRVDY() {
			return this.CBRVDY;
		}

		public Boolean CBRVDYIsNullable() {
			return true;
		}

		public Boolean CBRVDYIsKey() {
			return false;
		}

		public Integer CBRVDYLength() {
			return null;
		}

		public Integer CBRVDYPrecision() {
			return null;
		}

		public String CBRVDYDefault() {

			return "";

		}

		public String CBRVDYComment() {

			return "";

		}

		public String CBRVDYPattern() {

			return "";

		}

		public String CBRVDYOriginalDbColumnName() {

			return "CBRVDY";

		}

		public BigDecimal CBAJUP;

		public BigDecimal getCBAJUP() {
			return this.CBAJUP;
		}

		public Boolean CBAJUPIsNullable() {
			return true;
		}

		public Boolean CBAJUPIsKey() {
			return false;
		}

		public Integer CBAJUPLength() {
			return null;
		}

		public Integer CBAJUPPrecision() {
			return null;
		}

		public String CBAJUPDefault() {

			return "";

		}

		public String CBAJUPComment() {

			return "";

		}

		public String CBAJUPPattern() {

			return "";

		}

		public String CBAJUPOriginalDbColumnName() {

			return "CBAJUP";

		}

		public BigDecimal CBAJUY;

		public BigDecimal getCBAJUY() {
			return this.CBAJUY;
		}

		public Boolean CBAJUYIsNullable() {
			return true;
		}

		public Boolean CBAJUYIsKey() {
			return false;
		}

		public Integer CBAJUYLength() {
			return null;
		}

		public Integer CBAJUYPrecision() {
			return null;
		}

		public String CBAJUYDefault() {

			return "";

		}

		public String CBAJUYComment() {

			return "";

		}

		public String CBAJUYPattern() {

			return "";

		}

		public String CBAJUYOriginalDbColumnName() {

			return "CBAJUY";

		}

		public BigDecimal CBAJDP;

		public BigDecimal getCBAJDP() {
			return this.CBAJDP;
		}

		public Boolean CBAJDPIsNullable() {
			return true;
		}

		public Boolean CBAJDPIsKey() {
			return false;
		}

		public Integer CBAJDPLength() {
			return null;
		}

		public Integer CBAJDPPrecision() {
			return null;
		}

		public String CBAJDPDefault() {

			return "";

		}

		public String CBAJDPComment() {

			return "";

		}

		public String CBAJDPPattern() {

			return "";

		}

		public String CBAJDPOriginalDbColumnName() {

			return "CBAJDP";

		}

		public BigDecimal CBAJDY;

		public BigDecimal getCBAJDY() {
			return this.CBAJDY;
		}

		public Boolean CBAJDYIsNullable() {
			return true;
		}

		public Boolean CBAJDYIsKey() {
			return false;
		}

		public Integer CBAJDYLength() {
			return null;
		}

		public Integer CBAJDYPrecision() {
			return null;
		}

		public String CBAJDYDefault() {

			return "";

		}

		public String CBAJDYComment() {

			return "";

		}

		public String CBAJDYPattern() {

			return "";

		}

		public String CBAJDYOriginalDbColumnName() {

			return "CBAJDY";

		}

		public BigDecimal CBPHUP;

		public BigDecimal getCBPHUP() {
			return this.CBPHUP;
		}

		public Boolean CBPHUPIsNullable() {
			return true;
		}

		public Boolean CBPHUPIsKey() {
			return false;
		}

		public Integer CBPHUPLength() {
			return null;
		}

		public Integer CBPHUPPrecision() {
			return null;
		}

		public String CBPHUPDefault() {

			return "";

		}

		public String CBPHUPComment() {

			return "";

		}

		public String CBPHUPPattern() {

			return "";

		}

		public String CBPHUPOriginalDbColumnName() {

			return "CBPHUP";

		}

		public BigDecimal CBPHUY;

		public BigDecimal getCBPHUY() {
			return this.CBPHUY;
		}

		public Boolean CBPHUYIsNullable() {
			return true;
		}

		public Boolean CBPHUYIsKey() {
			return false;
		}

		public Integer CBPHUYLength() {
			return null;
		}

		public Integer CBPHUYPrecision() {
			return null;
		}

		public String CBPHUYDefault() {

			return "";

		}

		public String CBPHUYComment() {

			return "";

		}

		public String CBPHUYPattern() {

			return "";

		}

		public String CBPHUYOriginalDbColumnName() {

			return "CBPHUY";

		}

		public BigDecimal CBPHDP;

		public BigDecimal getCBPHDP() {
			return this.CBPHDP;
		}

		public Boolean CBPHDPIsNullable() {
			return true;
		}

		public Boolean CBPHDPIsKey() {
			return false;
		}

		public Integer CBPHDPLength() {
			return null;
		}

		public Integer CBPHDPPrecision() {
			return null;
		}

		public String CBPHDPDefault() {

			return "";

		}

		public String CBPHDPComment() {

			return "";

		}

		public String CBPHDPPattern() {

			return "";

		}

		public String CBPHDPOriginalDbColumnName() {

			return "CBPHDP";

		}

		public BigDecimal CBPHDY;

		public BigDecimal getCBPHDY() {
			return this.CBPHDY;
		}

		public Boolean CBPHDYIsNullable() {
			return true;
		}

		public Boolean CBPHDYIsKey() {
			return false;
		}

		public Integer CBPHDYLength() {
			return null;
		}

		public Integer CBPHDYPrecision() {
			return null;
		}

		public String CBPHDYDefault() {

			return "";

		}

		public String CBPHDYComment() {

			return "";

		}

		public String CBPHDYPattern() {

			return "";

		}

		public String CBPHDYOriginalDbColumnName() {

			return "CBPHDY";

		}

		public BigDecimal CBAVGC;

		public BigDecimal getCBAVGC() {
			return this.CBAVGC;
		}

		public Boolean CBAVGCIsNullable() {
			return true;
		}

		public Boolean CBAVGCIsKey() {
			return false;
		}

		public Integer CBAVGCLength() {
			return null;
		}

		public Integer CBAVGCPrecision() {
			return null;
		}

		public String CBAVGCDefault() {

			return "";

		}

		public String CBAVGCComment() {

			return "";

		}

		public String CBAVGCPattern() {

			return "";

		}

		public String CBAVGCOriginalDbColumnName() {

			return "CBAVGC";

		}

		public BigDecimal CBAVOH;

		public BigDecimal getCBAVOH() {
			return this.CBAVOH;
		}

		public Boolean CBAVOHIsNullable() {
			return true;
		}

		public Boolean CBAVOHIsKey() {
			return false;
		}

		public Integer CBAVOHLength() {
			return null;
		}

		public Integer CBAVOHPrecision() {
			return null;
		}

		public String CBAVOHDefault() {

			return "";

		}

		public String CBAVOHComment() {

			return "";

		}

		public String CBAVOHPattern() {

			return "";

		}

		public String CBAVOHOriginalDbColumnName() {

			return "CBAVOH";

		}

		public BigDecimal CBAVRT;

		public BigDecimal getCBAVRT() {
			return this.CBAVRT;
		}

		public Boolean CBAVRTIsNullable() {
			return true;
		}

		public Boolean CBAVRTIsKey() {
			return false;
		}

		public Integer CBAVRTLength() {
			return null;
		}

		public Integer CBAVRTPrecision() {
			return null;
		}

		public String CBAVRTDefault() {

			return "";

		}

		public String CBAVRTComment() {

			return "";

		}

		public String CBAVRTPattern() {

			return "";

		}

		public String CBAVRTOriginalDbColumnName() {

			return "CBAVRT";

		}

		public BigDecimal CBAVCS;

		public BigDecimal getCBAVCS() {
			return this.CBAVCS;
		}

		public Boolean CBAVCSIsNullable() {
			return true;
		}

		public Boolean CBAVCSIsKey() {
			return false;
		}

		public Integer CBAVCSLength() {
			return null;
		}

		public Integer CBAVCSPrecision() {
			return null;
		}

		public String CBAVCSDefault() {

			return "";

		}

		public String CBAVCSComment() {

			return "";

		}

		public String CBAVCSPattern() {

			return "";

		}

		public String CBAVCSOriginalDbColumnName() {

			return "CBAVCS";

		}

		public BigDecimal CBDEPT;

		public BigDecimal getCBDEPT() {
			return this.CBDEPT;
		}

		public Boolean CBDEPTIsNullable() {
			return true;
		}

		public Boolean CBDEPTIsKey() {
			return false;
		}

		public Integer CBDEPTLength() {
			return null;
		}

		public Integer CBDEPTPrecision() {
			return null;
		}

		public String CBDEPTDefault() {

			return "";

		}

		public String CBDEPTComment() {

			return "";

		}

		public String CBDEPTPattern() {

			return "";

		}

		public String CBDEPTOriginalDbColumnName() {

			return "CBDEPT";

		}

		public BigDecimal CBSDPT;

		public BigDecimal getCBSDPT() {
			return this.CBSDPT;
		}

		public Boolean CBSDPTIsNullable() {
			return true;
		}

		public Boolean CBSDPTIsKey() {
			return false;
		}

		public Integer CBSDPTLength() {
			return null;
		}

		public Integer CBSDPTPrecision() {
			return null;
		}

		public String CBSDPTDefault() {

			return "";

		}

		public String CBSDPTComment() {

			return "";

		}

		public String CBSDPTPattern() {

			return "";

		}

		public String CBSDPTOriginalDbColumnName() {

			return "CBSDPT";

		}

		public BigDecimal CBCLAS;

		public BigDecimal getCBCLAS() {
			return this.CBCLAS;
		}

		public Boolean CBCLASIsNullable() {
			return true;
		}

		public Boolean CBCLASIsKey() {
			return false;
		}

		public Integer CBCLASLength() {
			return null;
		}

		public Integer CBCLASPrecision() {
			return null;
		}

		public String CBCLASDefault() {

			return "";

		}

		public String CBCLASComment() {

			return "";

		}

		public String CBCLASPattern() {

			return "";

		}

		public String CBCLASOriginalDbColumnName() {

			return "CBCLAS";

		}

		public BigDecimal CBSCLS;

		public BigDecimal getCBSCLS() {
			return this.CBSCLS;
		}

		public Boolean CBSCLSIsNullable() {
			return true;
		}

		public Boolean CBSCLSIsKey() {
			return false;
		}

		public Integer CBSCLSLength() {
			return null;
		}

		public Integer CBSCLSPrecision() {
			return null;
		}

		public String CBSCLSDefault() {

			return "";

		}

		public String CBSCLSComment() {

			return "";

		}

		public String CBSCLSPattern() {

			return "";

		}

		public String CBSCLSOriginalDbColumnName() {

			return "CBSCLS";

		}

		public BigDecimal CBVNDR;

		public BigDecimal getCBVNDR() {
			return this.CBVNDR;
		}

		public Boolean CBVNDRIsNullable() {
			return true;
		}

		public Boolean CBVNDRIsKey() {
			return false;
		}

		public Integer CBVNDRLength() {
			return null;
		}

		public Integer CBVNDRPrecision() {
			return null;
		}

		public String CBVNDRDefault() {

			return "";

		}

		public String CBVNDRComment() {

			return "";

		}

		public String CBVNDRPattern() {

			return "";

		}

		public String CBVNDROriginalDbColumnName() {

			return "CBVNDR";

		}

		public String CBSTYL;

		public String getCBSTYL() {
			return this.CBSTYL;
		}

		public Boolean CBSTYLIsNullable() {
			return true;
		}

		public Boolean CBSTYLIsKey() {
			return false;
		}

		public Integer CBSTYLLength() {
			return null;
		}

		public Integer CBSTYLPrecision() {
			return null;
		}

		public String CBSTYLDefault() {

			return "";

		}

		public String CBSTYLComment() {

			return "";

		}

		public String CBSTYLPattern() {

			return "";

		}

		public String CBSTYLOriginalDbColumnName() {

			return "CBSTYL";

		}

		public BigDecimal CBPOOQ;

		public BigDecimal getCBPOOQ() {
			return this.CBPOOQ;
		}

		public Boolean CBPOOQIsNullable() {
			return true;
		}

		public Boolean CBPOOQIsKey() {
			return false;
		}

		public Integer CBPOOQLength() {
			return null;
		}

		public Integer CBPOOQPrecision() {
			return null;
		}

		public String CBPOOQDefault() {

			return "";

		}

		public String CBPOOQComment() {

			return "";

		}

		public String CBPOOQPattern() {

			return "";

		}

		public String CBPOOQOriginalDbColumnName() {

			return "CBPOOQ";

		}

		public BigDecimal CBTOOQ;

		public BigDecimal getCBTOOQ() {
			return this.CBTOOQ;
		}

		public Boolean CBTOOQIsNullable() {
			return true;
		}

		public Boolean CBTOOQIsKey() {
			return false;
		}

		public Integer CBTOOQLength() {
			return null;
		}

		public Integer CBTOOQPrecision() {
			return null;
		}

		public String CBTOOQDefault() {

			return "";

		}

		public String CBTOOQComment() {

			return "";

		}

		public String CBTOOQPattern() {

			return "";

		}

		public String CBTOOQOriginalDbColumnName() {

			return "CBTOOQ";

		}

		public BigDecimal CBINTQ;

		public BigDecimal getCBINTQ() {
			return this.CBINTQ;
		}

		public Boolean CBINTQIsNullable() {
			return true;
		}

		public Boolean CBINTQIsKey() {
			return false;
		}

		public Integer CBINTQLength() {
			return null;
		}

		public Integer CBINTQPrecision() {
			return null;
		}

		public String CBINTQDefault() {

			return "";

		}

		public String CBINTQComment() {

			return "";

		}

		public String CBINTQPattern() {

			return "";

		}

		public String CBINTQOriginalDbColumnName() {

			return "CBINTQ";

		}

		public BigDecimal CBMASU;

		public BigDecimal getCBMASU() {
			return this.CBMASU;
		}

		public Boolean CBMASUIsNullable() {
			return true;
		}

		public Boolean CBMASUIsKey() {
			return false;
		}

		public Integer CBMASULength() {
			return null;
		}

		public Integer CBMASUPrecision() {
			return null;
		}

		public String CBMASUDefault() {

			return "";

		}

		public String CBMASUComment() {

			return "";

		}

		public String CBMASUPattern() {

			return "";

		}

		public String CBMASUOriginalDbColumnName() {

			return "CBMASU";

		}

		public BigDecimal CBMASD;

		public BigDecimal getCBMASD() {
			return this.CBMASD;
		}

		public Boolean CBMASDIsNullable() {
			return true;
		}

		public Boolean CBMASDIsKey() {
			return false;
		}

		public Integer CBMASDLength() {
			return null;
		}

		public Integer CBMASDPrecision() {
			return null;
		}

		public String CBMASDDefault() {

			return "";

		}

		public String CBMASDComment() {

			return "";

		}

		public String CBMASDPattern() {

			return "";

		}

		public String CBMASDOriginalDbColumnName() {

			return "CBMASD";

		}

		public BigDecimal CBMASV;

		public BigDecimal getCBMASV() {
			return this.CBMASV;
		}

		public Boolean CBMASVIsNullable() {
			return true;
		}

		public Boolean CBMASVIsKey() {
			return false;
		}

		public Integer CBMASVLength() {
			return null;
		}

		public Integer CBMASVPrecision() {
			return null;
		}

		public String CBMASVDefault() {

			return "";

		}

		public String CBMASVComment() {

			return "";

		}

		public String CBMASVPattern() {

			return "";

		}

		public String CBMASVOriginalDbColumnName() {

			return "CBMASV";

		}

		public BigDecimal CBMASC;

		public BigDecimal getCBMASC() {
			return this.CBMASC;
		}

		public Boolean CBMASCIsNullable() {
			return true;
		}

		public Boolean CBMASCIsKey() {
			return false;
		}

		public Integer CBMASCLength() {
			return null;
		}

		public Integer CBMASCPrecision() {
			return null;
		}

		public String CBMASCDefault() {

			return "";

		}

		public String CBMASCComment() {

			return "";

		}

		public String CBMASCPattern() {

			return "";

		}

		public String CBMASCOriginalDbColumnName() {

			return "CBMASC";

		}

		public BigDecimal CBLAVC;

		public BigDecimal getCBLAVC() {
			return this.CBLAVC;
		}

		public Boolean CBLAVCIsNullable() {
			return true;
		}

		public Boolean CBLAVCIsKey() {
			return false;
		}

		public Integer CBLAVCLength() {
			return null;
		}

		public Integer CBLAVCPrecision() {
			return null;
		}

		public String CBLAVCDefault() {

			return "";

		}

		public String CBLAVCComment() {

			return "";

		}

		public String CBLAVCPattern() {

			return "";

		}

		public String CBLAVCOriginalDbColumnName() {

			return "CBLAVC";

		}

		public BigDecimal CBARQT;

		public BigDecimal getCBARQT() {
			return this.CBARQT;
		}

		public Boolean CBARQTIsNullable() {
			return true;
		}

		public Boolean CBARQTIsKey() {
			return false;
		}

		public Integer CBARQTLength() {
			return null;
		}

		public Integer CBARQTPrecision() {
			return null;
		}

		public String CBARQTDefault() {

			return "";

		}

		public String CBARQTComment() {

			return "";

		}

		public String CBARQTPattern() {

			return "";

		}

		public String CBARQTOriginalDbColumnName() {

			return "CBARQT";

		}

		public BigDecimal CBNSQT;

		public BigDecimal getCBNSQT() {
			return this.CBNSQT;
		}

		public Boolean CBNSQTIsNullable() {
			return true;
		}

		public Boolean CBNSQTIsKey() {
			return false;
		}

		public Integer CBNSQTLength() {
			return null;
		}

		public Integer CBNSQTPrecision() {
			return null;
		}

		public String CBNSQTDefault() {

			return "";

		}

		public String CBNSQTComment() {

			return "";

		}

		public String CBNSQTPattern() {

			return "";

		}

		public String CBNSQTOriginalDbColumnName() {

			return "CBNSQT";

		}

		public BigDecimal CBHLDQ;

		public BigDecimal getCBHLDQ() {
			return this.CBHLDQ;
		}

		public Boolean CBHLDQIsNullable() {
			return true;
		}

		public Boolean CBHLDQIsKey() {
			return false;
		}

		public Integer CBHLDQLength() {
			return null;
		}

		public Integer CBHLDQPrecision() {
			return null;
		}

		public String CBHLDQDefault() {

			return "";

		}

		public String CBHLDQComment() {

			return "";

		}

		public String CBHLDQPattern() {

			return "";

		}

		public String CBHLDQOriginalDbColumnName() {

			return "CBHLDQ";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					this.INUMBR = (BigDecimal) dis.readObject();

					this.CBHBOY = (BigDecimal) dis.readObject();

					this.CBHBOP = (BigDecimal) dis.readObject();

					this.CBHAND = (BigDecimal) dis.readObject();

					this.CBTRNS = (BigDecimal) dis.readObject();

					this.CBGMRI = (BigDecimal) dis.readObject();

					this.CBWKCR = (BigDecimal) dis.readObject();

					this.CBWK01 = (BigDecimal) dis.readObject();

					this.CBWK02 = (BigDecimal) dis.readObject();

					this.CBWK03 = (BigDecimal) dis.readObject();

					this.CBWK04 = (BigDecimal) dis.readObject();

					this.CBWK05 = (BigDecimal) dis.readObject();

					this.CBWK06 = (BigDecimal) dis.readObject();

					this.CBWK07 = (BigDecimal) dis.readObject();

					this.CBWK08 = (BigDecimal) dis.readObject();

					this.CBRSUP = (BigDecimal) dis.readObject();

					this.CBRSUY = (BigDecimal) dis.readObject();

					this.CBRSDP = (BigDecimal) dis.readObject();

					this.CBRSDY = (BigDecimal) dis.readObject();

					this.CBVRSP = (BigDecimal) dis.readObject();

					this.CBVRSY = (BigDecimal) dis.readObject();

					this.CBRCSP = (BigDecimal) dis.readObject();

					this.CBRCSY = (BigDecimal) dis.readObject();

					this.CBASUP = (BigDecimal) dis.readObject();

					this.CBASUY = (BigDecimal) dis.readObject();

					this.CBASDP = (BigDecimal) dis.readObject();

					this.CBASDY = (BigDecimal) dis.readObject();

					this.CBVASP = (BigDecimal) dis.readObject();

					this.CBVASY = (BigDecimal) dis.readObject();

					this.CBACSP = (BigDecimal) dis.readObject();

					this.CBACSY = (BigDecimal) dis.readObject();

					this.CBRETS = (BigDecimal) dis.readObject();

					this.CBRCUP = (BigDecimal) dis.readObject();

					this.CBRCUY = (BigDecimal) dis.readObject();

					this.CBRCDP = (BigDecimal) dis.readObject();

					this.CBRCDY = (BigDecimal) dis.readObject();

					this.CBTIUP = (BigDecimal) dis.readObject();

					this.CBTIUY = (BigDecimal) dis.readObject();

					this.CBTOUP = (BigDecimal) dis.readObject();

					this.CBTOUY = (BigDecimal) dis.readObject();

					this.CBTFDP = (BigDecimal) dis.readObject();

					this.CBTFDY = (BigDecimal) dis.readObject();

					this.CBRVUP = (BigDecimal) dis.readObject();

					this.CBRVUY = (BigDecimal) dis.readObject();

					this.CBRVDP = (BigDecimal) dis.readObject();

					this.CBRVDY = (BigDecimal) dis.readObject();

					this.CBAJUP = (BigDecimal) dis.readObject();

					this.CBAJUY = (BigDecimal) dis.readObject();

					this.CBAJDP = (BigDecimal) dis.readObject();

					this.CBAJDY = (BigDecimal) dis.readObject();

					this.CBPHUP = (BigDecimal) dis.readObject();

					this.CBPHUY = (BigDecimal) dis.readObject();

					this.CBPHDP = (BigDecimal) dis.readObject();

					this.CBPHDY = (BigDecimal) dis.readObject();

					this.CBAVGC = (BigDecimal) dis.readObject();

					this.CBAVOH = (BigDecimal) dis.readObject();

					this.CBAVRT = (BigDecimal) dis.readObject();

					this.CBAVCS = (BigDecimal) dis.readObject();

					this.CBDEPT = (BigDecimal) dis.readObject();

					this.CBSDPT = (BigDecimal) dis.readObject();

					this.CBCLAS = (BigDecimal) dis.readObject();

					this.CBSCLS = (BigDecimal) dis.readObject();

					this.CBVNDR = (BigDecimal) dis.readObject();

					this.CBSTYL = readString(dis);

					this.CBPOOQ = (BigDecimal) dis.readObject();

					this.CBTOOQ = (BigDecimal) dis.readObject();

					this.CBINTQ = (BigDecimal) dis.readObject();

					this.CBMASU = (BigDecimal) dis.readObject();

					this.CBMASD = (BigDecimal) dis.readObject();

					this.CBMASV = (BigDecimal) dis.readObject();

					this.CBMASC = (BigDecimal) dis.readObject();

					this.CBLAVC = (BigDecimal) dis.readObject();

					this.CBARQT = (BigDecimal) dis.readObject();

					this.CBNSQT = (BigDecimal) dis.readObject();

					this.CBHLDQ = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.INUMBR);

				// BigDecimal

				dos.writeObject(this.CBHBOY);

				// BigDecimal

				dos.writeObject(this.CBHBOP);

				// BigDecimal

				dos.writeObject(this.CBHAND);

				// BigDecimal

				dos.writeObject(this.CBTRNS);

				// BigDecimal

				dos.writeObject(this.CBGMRI);

				// BigDecimal

				dos.writeObject(this.CBWKCR);

				// BigDecimal

				dos.writeObject(this.CBWK01);

				// BigDecimal

				dos.writeObject(this.CBWK02);

				// BigDecimal

				dos.writeObject(this.CBWK03);

				// BigDecimal

				dos.writeObject(this.CBWK04);

				// BigDecimal

				dos.writeObject(this.CBWK05);

				// BigDecimal

				dos.writeObject(this.CBWK06);

				// BigDecimal

				dos.writeObject(this.CBWK07);

				// BigDecimal

				dos.writeObject(this.CBWK08);

				// BigDecimal

				dos.writeObject(this.CBRSUP);

				// BigDecimal

				dos.writeObject(this.CBRSUY);

				// BigDecimal

				dos.writeObject(this.CBRSDP);

				// BigDecimal

				dos.writeObject(this.CBRSDY);

				// BigDecimal

				dos.writeObject(this.CBVRSP);

				// BigDecimal

				dos.writeObject(this.CBVRSY);

				// BigDecimal

				dos.writeObject(this.CBRCSP);

				// BigDecimal

				dos.writeObject(this.CBRCSY);

				// BigDecimal

				dos.writeObject(this.CBASUP);

				// BigDecimal

				dos.writeObject(this.CBASUY);

				// BigDecimal

				dos.writeObject(this.CBASDP);

				// BigDecimal

				dos.writeObject(this.CBASDY);

				// BigDecimal

				dos.writeObject(this.CBVASP);

				// BigDecimal

				dos.writeObject(this.CBVASY);

				// BigDecimal

				dos.writeObject(this.CBACSP);

				// BigDecimal

				dos.writeObject(this.CBACSY);

				// BigDecimal

				dos.writeObject(this.CBRETS);

				// BigDecimal

				dos.writeObject(this.CBRCUP);

				// BigDecimal

				dos.writeObject(this.CBRCUY);

				// BigDecimal

				dos.writeObject(this.CBRCDP);

				// BigDecimal

				dos.writeObject(this.CBRCDY);

				// BigDecimal

				dos.writeObject(this.CBTIUP);

				// BigDecimal

				dos.writeObject(this.CBTIUY);

				// BigDecimal

				dos.writeObject(this.CBTOUP);

				// BigDecimal

				dos.writeObject(this.CBTOUY);

				// BigDecimal

				dos.writeObject(this.CBTFDP);

				// BigDecimal

				dos.writeObject(this.CBTFDY);

				// BigDecimal

				dos.writeObject(this.CBRVUP);

				// BigDecimal

				dos.writeObject(this.CBRVUY);

				// BigDecimal

				dos.writeObject(this.CBRVDP);

				// BigDecimal

				dos.writeObject(this.CBRVDY);

				// BigDecimal

				dos.writeObject(this.CBAJUP);

				// BigDecimal

				dos.writeObject(this.CBAJUY);

				// BigDecimal

				dos.writeObject(this.CBAJDP);

				// BigDecimal

				dos.writeObject(this.CBAJDY);

				// BigDecimal

				dos.writeObject(this.CBPHUP);

				// BigDecimal

				dos.writeObject(this.CBPHUY);

				// BigDecimal

				dos.writeObject(this.CBPHDP);

				// BigDecimal

				dos.writeObject(this.CBPHDY);

				// BigDecimal

				dos.writeObject(this.CBAVGC);

				// BigDecimal

				dos.writeObject(this.CBAVOH);

				// BigDecimal

				dos.writeObject(this.CBAVRT);

				// BigDecimal

				dos.writeObject(this.CBAVCS);

				// BigDecimal

				dos.writeObject(this.CBDEPT);

				// BigDecimal

				dos.writeObject(this.CBSDPT);

				// BigDecimal

				dos.writeObject(this.CBCLAS);

				// BigDecimal

				dos.writeObject(this.CBSCLS);

				// BigDecimal

				dos.writeObject(this.CBVNDR);

				// String

				writeString(this.CBSTYL, dos);

				// BigDecimal

				dos.writeObject(this.CBPOOQ);

				// BigDecimal

				dos.writeObject(this.CBTOOQ);

				// BigDecimal

				dos.writeObject(this.CBINTQ);

				// BigDecimal

				dos.writeObject(this.CBMASU);

				// BigDecimal

				dos.writeObject(this.CBMASD);

				// BigDecimal

				dos.writeObject(this.CBMASV);

				// BigDecimal

				dos.writeObject(this.CBMASC);

				// BigDecimal

				dos.writeObject(this.CBLAVC);

				// BigDecimal

				dos.writeObject(this.CBARQT);

				// BigDecimal

				dos.writeObject(this.CBNSQT);

				// BigDecimal

				dos.writeObject(this.CBHLDQ);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("INUMBR=" + String.valueOf(INUMBR));
			sb.append(",CBHBOY=" + String.valueOf(CBHBOY));
			sb.append(",CBHBOP=" + String.valueOf(CBHBOP));
			sb.append(",CBHAND=" + String.valueOf(CBHAND));
			sb.append(",CBTRNS=" + String.valueOf(CBTRNS));
			sb.append(",CBGMRI=" + String.valueOf(CBGMRI));
			sb.append(",CBWKCR=" + String.valueOf(CBWKCR));
			sb.append(",CBWK01=" + String.valueOf(CBWK01));
			sb.append(",CBWK02=" + String.valueOf(CBWK02));
			sb.append(",CBWK03=" + String.valueOf(CBWK03));
			sb.append(",CBWK04=" + String.valueOf(CBWK04));
			sb.append(",CBWK05=" + String.valueOf(CBWK05));
			sb.append(",CBWK06=" + String.valueOf(CBWK06));
			sb.append(",CBWK07=" + String.valueOf(CBWK07));
			sb.append(",CBWK08=" + String.valueOf(CBWK08));
			sb.append(",CBRSUP=" + String.valueOf(CBRSUP));
			sb.append(",CBRSUY=" + String.valueOf(CBRSUY));
			sb.append(",CBRSDP=" + String.valueOf(CBRSDP));
			sb.append(",CBRSDY=" + String.valueOf(CBRSDY));
			sb.append(",CBVRSP=" + String.valueOf(CBVRSP));
			sb.append(",CBVRSY=" + String.valueOf(CBVRSY));
			sb.append(",CBRCSP=" + String.valueOf(CBRCSP));
			sb.append(",CBRCSY=" + String.valueOf(CBRCSY));
			sb.append(",CBASUP=" + String.valueOf(CBASUP));
			sb.append(",CBASUY=" + String.valueOf(CBASUY));
			sb.append(",CBASDP=" + String.valueOf(CBASDP));
			sb.append(",CBASDY=" + String.valueOf(CBASDY));
			sb.append(",CBVASP=" + String.valueOf(CBVASP));
			sb.append(",CBVASY=" + String.valueOf(CBVASY));
			sb.append(",CBACSP=" + String.valueOf(CBACSP));
			sb.append(",CBACSY=" + String.valueOf(CBACSY));
			sb.append(",CBRETS=" + String.valueOf(CBRETS));
			sb.append(",CBRCUP=" + String.valueOf(CBRCUP));
			sb.append(",CBRCUY=" + String.valueOf(CBRCUY));
			sb.append(",CBRCDP=" + String.valueOf(CBRCDP));
			sb.append(",CBRCDY=" + String.valueOf(CBRCDY));
			sb.append(",CBTIUP=" + String.valueOf(CBTIUP));
			sb.append(",CBTIUY=" + String.valueOf(CBTIUY));
			sb.append(",CBTOUP=" + String.valueOf(CBTOUP));
			sb.append(",CBTOUY=" + String.valueOf(CBTOUY));
			sb.append(",CBTFDP=" + String.valueOf(CBTFDP));
			sb.append(",CBTFDY=" + String.valueOf(CBTFDY));
			sb.append(",CBRVUP=" + String.valueOf(CBRVUP));
			sb.append(",CBRVUY=" + String.valueOf(CBRVUY));
			sb.append(",CBRVDP=" + String.valueOf(CBRVDP));
			sb.append(",CBRVDY=" + String.valueOf(CBRVDY));
			sb.append(",CBAJUP=" + String.valueOf(CBAJUP));
			sb.append(",CBAJUY=" + String.valueOf(CBAJUY));
			sb.append(",CBAJDP=" + String.valueOf(CBAJDP));
			sb.append(",CBAJDY=" + String.valueOf(CBAJDY));
			sb.append(",CBPHUP=" + String.valueOf(CBPHUP));
			sb.append(",CBPHUY=" + String.valueOf(CBPHUY));
			sb.append(",CBPHDP=" + String.valueOf(CBPHDP));
			sb.append(",CBPHDY=" + String.valueOf(CBPHDY));
			sb.append(",CBAVGC=" + String.valueOf(CBAVGC));
			sb.append(",CBAVOH=" + String.valueOf(CBAVOH));
			sb.append(",CBAVRT=" + String.valueOf(CBAVRT));
			sb.append(",CBAVCS=" + String.valueOf(CBAVCS));
			sb.append(",CBDEPT=" + String.valueOf(CBDEPT));
			sb.append(",CBSDPT=" + String.valueOf(CBSDPT));
			sb.append(",CBCLAS=" + String.valueOf(CBCLAS));
			sb.append(",CBSCLS=" + String.valueOf(CBSCLS));
			sb.append(",CBVNDR=" + String.valueOf(CBVNDR));
			sb.append(",CBSTYL=" + CBSTYL);
			sb.append(",CBPOOQ=" + String.valueOf(CBPOOQ));
			sb.append(",CBTOOQ=" + String.valueOf(CBTOOQ));
			sb.append(",CBINTQ=" + String.valueOf(CBINTQ));
			sb.append(",CBMASU=" + String.valueOf(CBMASU));
			sb.append(",CBMASD=" + String.valueOf(CBMASD));
			sb.append(",CBMASV=" + String.valueOf(CBMASV));
			sb.append(",CBMASC=" + String.valueOf(CBMASC));
			sb.append(",CBLAVC=" + String.valueOf(CBLAVC));
			sb.append(",CBARQT=" + String.valueOf(CBARQT));
			sb.append(",CBNSQT=" + String.valueOf(CBNSQT));
			sb.append(",CBHLDQ=" + String.valueOf(CBHLDQ));
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

			if (CBHBOY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOY);
			}

			sb.append("|");

			if (CBHBOP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHBOP);
			}

			sb.append("|");

			if (CBHAND == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHAND);
			}

			sb.append("|");

			if (CBTRNS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTRNS);
			}

			sb.append("|");

			if (CBGMRI == null) {
				sb.append("<null>");
			} else {
				sb.append(CBGMRI);
			}

			sb.append("|");

			if (CBWKCR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWKCR);
			}

			sb.append("|");

			if (CBWK01 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK01);
			}

			sb.append("|");

			if (CBWK02 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK02);
			}

			sb.append("|");

			if (CBWK03 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK03);
			}

			sb.append("|");

			if (CBWK04 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK04);
			}

			sb.append("|");

			if (CBWK05 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK05);
			}

			sb.append("|");

			if (CBWK06 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK06);
			}

			sb.append("|");

			if (CBWK07 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK07);
			}

			sb.append("|");

			if (CBWK08 == null) {
				sb.append("<null>");
			} else {
				sb.append(CBWK08);
			}

			sb.append("|");

			if (CBRSUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUP);
			}

			sb.append("|");

			if (CBRSUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSUY);
			}

			sb.append("|");

			if (CBRSDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDP);
			}

			sb.append("|");

			if (CBRSDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRSDY);
			}

			sb.append("|");

			if (CBVRSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSP);
			}

			sb.append("|");

			if (CBVRSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVRSY);
			}

			sb.append("|");

			if (CBRCSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSP);
			}

			sb.append("|");

			if (CBRCSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCSY);
			}

			sb.append("|");

			if (CBASUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUP);
			}

			sb.append("|");

			if (CBASUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASUY);
			}

			sb.append("|");

			if (CBASDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDP);
			}

			sb.append("|");

			if (CBASDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBASDY);
			}

			sb.append("|");

			if (CBVASP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASP);
			}

			sb.append("|");

			if (CBVASY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVASY);
			}

			sb.append("|");

			if (CBACSP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSP);
			}

			sb.append("|");

			if (CBACSY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBACSY);
			}

			sb.append("|");

			if (CBRETS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRETS);
			}

			sb.append("|");

			if (CBRCUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUP);
			}

			sb.append("|");

			if (CBRCUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCUY);
			}

			sb.append("|");

			if (CBRCDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDP);
			}

			sb.append("|");

			if (CBRCDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRCDY);
			}

			sb.append("|");

			if (CBTIUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUP);
			}

			sb.append("|");

			if (CBTIUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTIUY);
			}

			sb.append("|");

			if (CBTOUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUP);
			}

			sb.append("|");

			if (CBTOUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOUY);
			}

			sb.append("|");

			if (CBTFDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDP);
			}

			sb.append("|");

			if (CBTFDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTFDY);
			}

			sb.append("|");

			if (CBRVUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUP);
			}

			sb.append("|");

			if (CBRVUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVUY);
			}

			sb.append("|");

			if (CBRVDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDP);
			}

			sb.append("|");

			if (CBRVDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBRVDY);
			}

			sb.append("|");

			if (CBAJUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUP);
			}

			sb.append("|");

			if (CBAJUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJUY);
			}

			sb.append("|");

			if (CBAJDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDP);
			}

			sb.append("|");

			if (CBAJDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAJDY);
			}

			sb.append("|");

			if (CBPHUP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUP);
			}

			sb.append("|");

			if (CBPHUY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHUY);
			}

			sb.append("|");

			if (CBPHDP == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDP);
			}

			sb.append("|");

			if (CBPHDY == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPHDY);
			}

			sb.append("|");

			if (CBAVGC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVGC);
			}

			sb.append("|");

			if (CBAVOH == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVOH);
			}

			sb.append("|");

			if (CBAVRT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVRT);
			}

			sb.append("|");

			if (CBAVCS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBAVCS);
			}

			sb.append("|");

			if (CBDEPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBDEPT);
			}

			sb.append("|");

			if (CBSDPT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSDPT);
			}

			sb.append("|");

			if (CBCLAS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBCLAS);
			}

			sb.append("|");

			if (CBSCLS == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSCLS);
			}

			sb.append("|");

			if (CBVNDR == null) {
				sb.append("<null>");
			} else {
				sb.append(CBVNDR);
			}

			sb.append("|");

			if (CBSTYL == null) {
				sb.append("<null>");
			} else {
				sb.append(CBSTYL);
			}

			sb.append("|");

			if (CBPOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBPOOQ);
			}

			sb.append("|");

			if (CBTOOQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBTOOQ);
			}

			sb.append("|");

			if (CBINTQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBINTQ);
			}

			sb.append("|");

			if (CBMASU == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASU);
			}

			sb.append("|");

			if (CBMASD == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASD);
			}

			sb.append("|");

			if (CBMASV == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASV);
			}

			sb.append("|");

			if (CBMASC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBMASC);
			}

			sb.append("|");

			if (CBLAVC == null) {
				sb.append("<null>");
			} else {
				sb.append(CBLAVC);
			}

			sb.append("|");

			if (CBARQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBARQT);
			}

			sb.append("|");

			if (CBNSQT == null) {
				sb.append("<null>");
			} else {
				sb.append(CBNSQT);
			}

			sb.append("|");

			if (CBHLDQ == null) {
				sb.append("<null>");
			} else {
				sb.append(CBHLDQ);
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

				row9Struct row9 = new row9Struct();
				tmap_INVCBLStruct tmap_INVCBL = new tmap_INVCBLStruct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "tmap_INVCBL");

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

				props_tDBOutput_1.table.setValue("tableName", "INVENTORY_BALANCE_DATA_INVCBL");

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

						a("\"name\":\"tmap_INVCBL\",\"fields\":[{", s);

						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INUMBR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INUMBR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INUMBR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBHBOY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBHBOY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBHBOY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBHBOY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBHBOP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBHBOP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBHBOP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBHBOP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBHAND\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBHAND\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBHAND\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBHAND\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTRNS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTRNS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTRNS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTRNS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBGMRI\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBGMRI\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBGMRI\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBGMRI\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWKCR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWKCR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWKCR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWKCR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK01\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK01\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK02\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK02\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK03\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK03\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK04\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK04\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK05\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK05\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK06\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK06\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK07\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK07\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBWK08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBWK08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBWK08\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBWK08\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRSUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRSUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRSUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRSUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRSUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRSUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRSUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRSUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRSDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRSDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRSDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRSDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRSDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRSDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRSDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRSDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBVRSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBVRSP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBVRSP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBVRSP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBVRSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBVRSY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBVRSY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBVRSY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCSP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCSP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCSP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCSY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCSY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCSY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBASUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBASUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBASUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBASUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBASUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBASUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBASUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBASUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBASDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBASDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBASDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBASDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBASDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBASDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBASDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBASDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBVASP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBVASP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBVASP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBVASP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBVASY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBVASY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBVASY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBVASY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBACSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBACSP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBACSP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBACSP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBACSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBACSY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBACSY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBACSY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRETS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRETS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRETS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRETS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRCDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRCDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRCDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRCDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTIUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTIUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTIUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTIUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTIUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTIUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTIUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTIUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTOUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTOUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTOUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTOUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTOUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTOUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTOUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTOUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTFDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTFDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTFDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTFDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTFDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTFDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTFDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTFDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRVUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRVUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRVUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRVUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRVUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRVUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRVUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRVUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRVDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRVDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRVDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRVDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBRVDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBRVDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBRVDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBRVDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAJUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAJUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAJUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAJUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAJUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAJUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAJUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAJUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAJDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAJDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAJDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAJDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAJDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAJDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAJDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAJDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBPHUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBPHUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBPHUP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBPHUP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBPHUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBPHUY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBPHUY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBPHUY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBPHDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBPHDP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBPHDP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBPHDP\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBPHDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBPHDY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBPHDY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBPHDY\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAVGC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAVGC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAVGC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAVGC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAVOH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAVOH\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAVOH\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAVOH\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAVRT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAVRT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAVRT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAVRT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBAVCS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBAVCS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBAVCS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBAVCS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBDEPT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBDEPT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBDEPT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBDEPT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBSDPT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBSDPT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBSDPT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBSDPT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBCLAS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBCLAS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBCLAS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBCLAS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBSCLS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBSCLS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBSCLS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBSCLS\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBVNDR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBVNDR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBVNDR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBVNDR\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBSTYL\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBSTYL\",\"talend.field.dbColumnName\":\"CBSTYL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBSTYL\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBPOOQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBPOOQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBPOOQ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBPOOQ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBTOOQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBTOOQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBTOOQ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBTOOQ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBINTQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBINTQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBINTQ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBINTQ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBMASU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBMASU\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBMASU\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBMASU\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBMASD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBMASD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBMASD\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBMASD\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBMASV\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBMASV\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBMASV\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBMASV\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBMASC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBMASC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBMASC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBMASC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBLAVC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBLAVC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBLAVC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBLAVC\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBARQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBARQT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBARQT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBARQT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBNSQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBNSQT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBNSQT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBNSQT\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CBHLDQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CBHLDQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CBHLDQ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CBHLDQ\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DATELOADED\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOAD_DATE\",\"talend.field.dbColumnName\":\"DATELOADED\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"DATELOADED\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tmap_INVCBL\",\"di.table.label\":\"tmap_INVCBL\"}",
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

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

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
				int count_row9_tMap_1 = 0;

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
				int count_tmap_INVCBL_tMap_1 = 0;

				tmap_INVCBLStruct tmap_INVCBL_tmp = new tmap_INVCBLStruct();
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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVCBL.zip\"");
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
							log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
							log4jParamters_tFileInputDelimited_1.append(" | ");
							log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("INUMBR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBHBOY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBHBOP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBHAND") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBTRNS") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBGMRI") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBWKCR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK01")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK02") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBWK03") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBWK04") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBWK05") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK06")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBWK07") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBWK08") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRSUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRSUY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRSDP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRSDY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBVRSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBVRSY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRCSP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCSY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBASUP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBASUY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBASDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBASDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVASP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVASY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBACSP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBACSY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBRETS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCUP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRCUY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBRCDP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRCDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBTIUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBTIUY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBTOUP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBTOUY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBTFDP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBTFDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRVUP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBRVUY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBRVDP") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBRVDY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBAJUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAJUY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAJDP") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBAJDY") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBPHUP") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBPHUY") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBPHDP")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBPHDY") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBAVGC") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBAVOH") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBAVRT") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBAVCS")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBDEPT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBSDPT") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBCLAS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBSCLS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBVNDR")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBSTYL") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBPOOQ") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBTOOQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBINTQ") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBMASU")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBMASD") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBMASV") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CBMASC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CBLAVC") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBARQT")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CBNSQT") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CBHLDQ") + "}]");
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

					Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/INVCBL.zip";
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

						log.error("tFileInputDelimited_1 - " + e.getMessage());

						System.err.println(e.getMessage());

					}
					java.util.zip.ZipEntry entry_tFileInputDelimited_1 = null;

					while (true) {
						try {
							entry_tFileInputDelimited_1 = zis_tFileInputDelimited_1.getNextEntry();
						} catch (java.lang.Exception e) {
							globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());

							log.error("tFileInputDelimited_1 - " + e.getMessage());

							System.err.println(e.getMessage());
							break;

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

							log.error("tFileInputDelimited_1 - " + e.getMessage());

							System.err.println(e.getMessage());

						}

						log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");

						while (fid_tFileInputDelimited_1 != null && fid_tFileInputDelimited_1.nextRecord()) {
							rowstate_tFileInputDelimited_1.reset();

							row9 = null;

							boolean whetherReject_tFileInputDelimited_1 = false;
							row9 = new row9Struct();
							try {

								int columnIndexWithD_tFileInputDelimited_1 = 0;

								String temp = "";

								columnIndexWithD_tFileInputDelimited_1 = 0;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.INUMBR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"INUMBR", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.INUMBR = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 1;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBHBOY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBHBOY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBHBOY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 2;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBHBOP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBHBOP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBHBOP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 3;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBHAND = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBHAND", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBHAND = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 4;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTRNS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTRNS", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTRNS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 5;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBGMRI = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBGMRI", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBGMRI = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 6;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWKCR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWKCR", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWKCR = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 7;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK01 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK01", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK01 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 8;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK02 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK02", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK02 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 9;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK03 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK03", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK03 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 10;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK04 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK04", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK04 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 11;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK05 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK05", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK05 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 12;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK06 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK06", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK06 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 13;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK07 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK07", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK07 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 14;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBWK08 = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBWK08", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBWK08 = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 15;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRSUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRSUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRSUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 16;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRSUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRSUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRSUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 17;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRSDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRSDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRSDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 18;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRSDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRSDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRSDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 19;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBVRSP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBVRSP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBVRSP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 20;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBVRSY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBVRSY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBVRSY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 21;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCSP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCSP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCSP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 22;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCSY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCSY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCSY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 23;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBASUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBASUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBASUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 24;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBASUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBASUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBASUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 25;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBASDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBASDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBASDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 26;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBASDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBASDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBASDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 27;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBVASP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBVASP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBVASP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 28;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBVASY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBVASY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBVASY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 29;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBACSP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBACSP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBACSP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 30;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBACSY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBACSY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBACSY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 31;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRETS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRETS", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRETS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 32;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 33;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 34;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 35;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRCDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRCDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRCDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 36;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTIUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTIUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTIUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 37;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTIUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTIUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTIUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 38;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTOUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTOUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTOUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 39;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTOUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTOUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTOUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 40;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTFDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTFDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTFDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 41;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTFDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTFDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTFDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 42;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRVUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRVUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRVUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 43;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRVUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRVUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRVUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 44;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRVDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRVDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRVDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 45;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBRVDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBRVDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBRVDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 46;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAJUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAJUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAJUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 47;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAJUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAJUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAJUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 48;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAJDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAJDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAJDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 49;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAJDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAJDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAJDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 50;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBPHUP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBPHUP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBPHUP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 51;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBPHUY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBPHUY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBPHUY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 52;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBPHDP = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBPHDP", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBPHDP = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 53;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBPHDY = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBPHDY", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBPHDY = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 54;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAVGC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAVGC", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAVGC = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 55;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAVOH = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAVOH", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAVOH = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 56;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAVRT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAVRT", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAVRT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 57;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBAVCS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBAVCS", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBAVCS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 58;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBDEPT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBDEPT", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBDEPT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 59;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBSDPT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBSDPT", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBSDPT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 60;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBCLAS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBCLAS", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBCLAS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 61;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBSCLS = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBSCLS", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBSCLS = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 62;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBVNDR = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBVNDR", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBVNDR = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 63;

								row9.CBSTYL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);

								columnIndexWithD_tFileInputDelimited_1 = 64;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBPOOQ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBPOOQ", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBPOOQ = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 65;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBTOOQ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBTOOQ", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBTOOQ = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 66;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBINTQ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBINTQ", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBINTQ = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 67;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBMASU = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBMASU", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBMASU = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 68;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBMASD = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBMASD", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBMASD = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 69;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBMASV = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBMASV", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBMASV = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 70;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBMASC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBMASC", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBMASC = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 71;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBLAVC = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBLAVC", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBLAVC = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 72;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBARQT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBARQT", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBARQT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 73;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBNSQT = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBNSQT", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBNSQT = null;

								}

								columnIndexWithD_tFileInputDelimited_1 = 74;

								temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
								if (temp.length() > 0) {

									try {

										row9.CBHLDQ = ParserUtils.parseTo_BigDecimal(temp);

									} catch (java.lang.Exception ex_tFileInputDelimited_1) {
										globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",
												ex_tFileInputDelimited_1.getMessage());
										rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format(
												"Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"CBHLDQ", "row9", temp, ex_tFileInputDelimited_1),
												ex_tFileInputDelimited_1));
									}

								} else {

									row9.CBHLDQ = null;

								}

								if (rowstate_tFileInputDelimited_1.getException() != null) {
									throw rowstate_tFileInputDelimited_1.getException();
								}

							} catch (java.lang.Exception e) {
								globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE", e.getMessage());
								whetherReject_tFileInputDelimited_1 = true;

								log.error("tFileInputDelimited_1 - " + e.getMessage());

								System.err.println(e.getMessage());
								row9 = null;

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
// Start of branch "row9"
							if (row9 != null) {

								/**
								 * [tMap_1 main ] start
								 */

								currentComponent = "tMap_1";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row9", "tFileInputDelimited_1", "tFileInputDelimited_1",
										"tFileInputDelimited", "tMap_1", "tMap_1", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
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
									Var.var1 = TalendDate.addDate(
											TalendDate.parseDate("yyyy-MM-dd", TalendDate.getDate("CCYY-MM-DD")), -1,
											"DD");// ###############################
									// ###############################
									// # Output tables

									tmap_INVCBL = null;

// # Output table : 'tmap_INVCBL'
									count_tmap_INVCBL_tMap_1++;

									tmap_INVCBL_tmp.INUMBR = row9.INUMBR;
									tmap_INVCBL_tmp.CBHBOY = row9.CBHBOY;
									tmap_INVCBL_tmp.CBHBOP = row9.CBHBOP;
									tmap_INVCBL_tmp.CBHAND = row9.CBHAND;
									tmap_INVCBL_tmp.CBTRNS = row9.CBTRNS;
									tmap_INVCBL_tmp.CBGMRI = row9.CBGMRI;
									tmap_INVCBL_tmp.CBWKCR = row9.CBWKCR;
									tmap_INVCBL_tmp.CBWK01 = row9.CBWK01;
									tmap_INVCBL_tmp.CBWK02 = row9.CBWK02;
									tmap_INVCBL_tmp.CBWK03 = row9.CBWK03;
									tmap_INVCBL_tmp.CBWK04 = row9.CBWK04;
									tmap_INVCBL_tmp.CBWK05 = row9.CBWK05;
									tmap_INVCBL_tmp.CBWK06 = row9.CBWK06;
									tmap_INVCBL_tmp.CBWK07 = row9.CBWK07;
									tmap_INVCBL_tmp.CBWK08 = row9.CBWK08;
									tmap_INVCBL_tmp.CBRSUP = row9.CBRSUP;
									tmap_INVCBL_tmp.CBRSUY = row9.CBRSUY;
									tmap_INVCBL_tmp.CBRSDP = row9.CBRSDP;
									tmap_INVCBL_tmp.CBRSDY = row9.CBRSDY;
									tmap_INVCBL_tmp.CBVRSP = row9.CBVRSP;
									tmap_INVCBL_tmp.CBVRSY = row9.CBVRSY;
									tmap_INVCBL_tmp.CBRCSP = row9.CBRCSP;
									tmap_INVCBL_tmp.CBRCSY = row9.CBRCSY;
									tmap_INVCBL_tmp.CBASUP = row9.CBASUP;
									tmap_INVCBL_tmp.CBASUY = row9.CBASUY;
									tmap_INVCBL_tmp.CBASDP = row9.CBASDP;
									tmap_INVCBL_tmp.CBASDY = row9.CBASDY;
									tmap_INVCBL_tmp.CBVASP = row9.CBVASP;
									tmap_INVCBL_tmp.CBVASY = row9.CBVASY;
									tmap_INVCBL_tmp.CBACSP = row9.CBACSP;
									tmap_INVCBL_tmp.CBACSY = row9.CBACSY;
									tmap_INVCBL_tmp.CBRETS = row9.CBRETS;
									tmap_INVCBL_tmp.CBRCUP = row9.CBRCUP;
									tmap_INVCBL_tmp.CBRCUY = row9.CBRCUY;
									tmap_INVCBL_tmp.CBRCDP = row9.CBRCDP;
									tmap_INVCBL_tmp.CBRCDY = row9.CBRCDY;
									tmap_INVCBL_tmp.CBTIUP = row9.CBTIUP;
									tmap_INVCBL_tmp.CBTIUY = row9.CBTIUY;
									tmap_INVCBL_tmp.CBTOUP = row9.CBTOUP;
									tmap_INVCBL_tmp.CBTOUY = row9.CBTOUY;
									tmap_INVCBL_tmp.CBTFDP = row9.CBTFDP;
									tmap_INVCBL_tmp.CBTFDY = row9.CBTFDY;
									tmap_INVCBL_tmp.CBRVUP = row9.CBRVUP;
									tmap_INVCBL_tmp.CBRVUY = row9.CBRVUY;
									tmap_INVCBL_tmp.CBRVDP = row9.CBRVDP;
									tmap_INVCBL_tmp.CBRVDY = row9.CBRVDY;
									tmap_INVCBL_tmp.CBAJUP = row9.CBAJUP;
									tmap_INVCBL_tmp.CBAJUY = row9.CBAJUY;
									tmap_INVCBL_tmp.CBAJDP = row9.CBAJDP;
									tmap_INVCBL_tmp.CBAJDY = row9.CBAJDY;
									tmap_INVCBL_tmp.CBPHUP = row9.CBPHUP;
									tmap_INVCBL_tmp.CBPHUY = row9.CBPHUY;
									tmap_INVCBL_tmp.CBPHDP = row9.CBPHDP;
									tmap_INVCBL_tmp.CBPHDY = row9.CBPHDY;
									tmap_INVCBL_tmp.CBAVGC = row9.CBAVGC;
									tmap_INVCBL_tmp.CBAVOH = row9.CBAVOH;
									tmap_INVCBL_tmp.CBAVRT = row9.CBAVRT;
									tmap_INVCBL_tmp.CBAVCS = row9.CBAVCS;
									tmap_INVCBL_tmp.CBDEPT = row9.CBDEPT;
									tmap_INVCBL_tmp.CBSDPT = row9.CBSDPT;
									tmap_INVCBL_tmp.CBCLAS = row9.CBCLAS;
									tmap_INVCBL_tmp.CBSCLS = row9.CBSCLS;
									tmap_INVCBL_tmp.CBVNDR = row9.CBVNDR;
									tmap_INVCBL_tmp.CBSTYL = row9.CBSTYL;
									tmap_INVCBL_tmp.CBPOOQ = row9.CBPOOQ;
									tmap_INVCBL_tmp.CBTOOQ = row9.CBTOOQ;
									tmap_INVCBL_tmp.CBINTQ = row9.CBINTQ;
									tmap_INVCBL_tmp.CBMASU = row9.CBMASU;
									tmap_INVCBL_tmp.CBMASD = row9.CBMASD;
									tmap_INVCBL_tmp.CBMASV = row9.CBMASV;
									tmap_INVCBL_tmp.CBMASC = row9.CBMASC;
									tmap_INVCBL_tmp.CBLAVC = row9.CBLAVC;
									tmap_INVCBL_tmp.CBARQT = row9.CBARQT;
									tmap_INVCBL_tmp.CBNSQT = row9.CBNSQT;
									tmap_INVCBL_tmp.CBHLDQ = row9.CBHLDQ;
									tmap_INVCBL_tmp.DATELOADED = Var.var1;
									tmap_INVCBL = tmap_INVCBL_tmp;
									log.debug("tMap_1 - Outputting the record " + count_tmap_INVCBL_tMap_1
											+ " of the output table 'tmap_INVCBL'.");

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
// Start of branch "tmap_INVCBL"
								if (tmap_INVCBL != null) {

									/**
									 * [tDBOutput_1 main ] start
									 */

									currentComponent = "tDBOutput_1";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "tmap_INVCBL", "tMap_1", "tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1",
											"tSnowflakeOutput"

									)) {
										talendJobLogProcess(globalMap);
									}

									if (log.isTraceEnabled()) {
										log.trace("tmap_INVCBL - "
												+ (tmap_INVCBL == null ? "" : tmap_INVCBL.toLogString()));
									}

									if (incomingEnforcer_tDBOutput_1 != null) {
										incomingEnforcer_tDBOutput_1.createNewRecord();
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("INUMBR") != null) {
										incomingEnforcer_tDBOutput_1.put("INUMBR", tmap_INVCBL.INUMBR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBHBOY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBHBOY", tmap_INVCBL.CBHBOY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBHBOP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBHBOP", tmap_INVCBL.CBHBOP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBHAND") != null) {
										incomingEnforcer_tDBOutput_1.put("CBHAND", tmap_INVCBL.CBHAND);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTRNS") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTRNS", tmap_INVCBL.CBTRNS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBGMRI") != null) {
										incomingEnforcer_tDBOutput_1.put("CBGMRI", tmap_INVCBL.CBGMRI);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWKCR") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWKCR", tmap_INVCBL.CBWKCR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK01") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK01", tmap_INVCBL.CBWK01);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK02") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK02", tmap_INVCBL.CBWK02);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK03") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK03", tmap_INVCBL.CBWK03);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK04") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK04", tmap_INVCBL.CBWK04);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK05") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK05", tmap_INVCBL.CBWK05);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK06") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK06", tmap_INVCBL.CBWK06);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK07") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK07", tmap_INVCBL.CBWK07);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBWK08") != null) {
										incomingEnforcer_tDBOutput_1.put("CBWK08", tmap_INVCBL.CBWK08);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRSUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRSUP", tmap_INVCBL.CBRSUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRSUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRSUY", tmap_INVCBL.CBRSUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRSDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRSDP", tmap_INVCBL.CBRSDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRSDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRSDY", tmap_INVCBL.CBRSDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBVRSP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBVRSP", tmap_INVCBL.CBVRSP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBVRSY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBVRSY", tmap_INVCBL.CBVRSY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCSP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCSP", tmap_INVCBL.CBRCSP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCSY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCSY", tmap_INVCBL.CBRCSY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBASUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBASUP", tmap_INVCBL.CBASUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBASUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBASUY", tmap_INVCBL.CBASUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBASDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBASDP", tmap_INVCBL.CBASDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBASDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBASDY", tmap_INVCBL.CBASDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBVASP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBVASP", tmap_INVCBL.CBVASP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBVASY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBVASY", tmap_INVCBL.CBVASY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBACSP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBACSP", tmap_INVCBL.CBACSP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBACSY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBACSY", tmap_INVCBL.CBACSY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRETS") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRETS", tmap_INVCBL.CBRETS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCUP", tmap_INVCBL.CBRCUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCUY", tmap_INVCBL.CBRCUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCDP", tmap_INVCBL.CBRCDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRCDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRCDY", tmap_INVCBL.CBRCDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTIUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTIUP", tmap_INVCBL.CBTIUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTIUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTIUY", tmap_INVCBL.CBTIUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTOUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTOUP", tmap_INVCBL.CBTOUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTOUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTOUY", tmap_INVCBL.CBTOUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTFDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTFDP", tmap_INVCBL.CBTFDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTFDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTFDY", tmap_INVCBL.CBTFDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRVUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRVUP", tmap_INVCBL.CBRVUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRVUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRVUY", tmap_INVCBL.CBRVUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRVDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRVDP", tmap_INVCBL.CBRVDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBRVDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBRVDY", tmap_INVCBL.CBRVDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAJUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAJUP", tmap_INVCBL.CBAJUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAJUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAJUY", tmap_INVCBL.CBAJUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAJDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAJDP", tmap_INVCBL.CBAJDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAJDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAJDY", tmap_INVCBL.CBAJDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBPHUP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBPHUP", tmap_INVCBL.CBPHUP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBPHUY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBPHUY", tmap_INVCBL.CBPHUY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBPHDP") != null) {
										incomingEnforcer_tDBOutput_1.put("CBPHDP", tmap_INVCBL.CBPHDP);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBPHDY") != null) {
										incomingEnforcer_tDBOutput_1.put("CBPHDY", tmap_INVCBL.CBPHDY);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAVGC") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAVGC", tmap_INVCBL.CBAVGC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAVOH") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAVOH", tmap_INVCBL.CBAVOH);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAVRT") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAVRT", tmap_INVCBL.CBAVRT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBAVCS") != null) {
										incomingEnforcer_tDBOutput_1.put("CBAVCS", tmap_INVCBL.CBAVCS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBDEPT") != null) {
										incomingEnforcer_tDBOutput_1.put("CBDEPT", tmap_INVCBL.CBDEPT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBSDPT") != null) {
										incomingEnforcer_tDBOutput_1.put("CBSDPT", tmap_INVCBL.CBSDPT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBCLAS") != null) {
										incomingEnforcer_tDBOutput_1.put("CBCLAS", tmap_INVCBL.CBCLAS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBSCLS") != null) {
										incomingEnforcer_tDBOutput_1.put("CBSCLS", tmap_INVCBL.CBSCLS);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBVNDR") != null) {
										incomingEnforcer_tDBOutput_1.put("CBVNDR", tmap_INVCBL.CBVNDR);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBSTYL") != null) {
										incomingEnforcer_tDBOutput_1.put("CBSTYL", tmap_INVCBL.CBSTYL);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBPOOQ") != null) {
										incomingEnforcer_tDBOutput_1.put("CBPOOQ", tmap_INVCBL.CBPOOQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBTOOQ") != null) {
										incomingEnforcer_tDBOutput_1.put("CBTOOQ", tmap_INVCBL.CBTOOQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBINTQ") != null) {
										incomingEnforcer_tDBOutput_1.put("CBINTQ", tmap_INVCBL.CBINTQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBMASU") != null) {
										incomingEnforcer_tDBOutput_1.put("CBMASU", tmap_INVCBL.CBMASU);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBMASD") != null) {
										incomingEnforcer_tDBOutput_1.put("CBMASD", tmap_INVCBL.CBMASD);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBMASV") != null) {
										incomingEnforcer_tDBOutput_1.put("CBMASV", tmap_INVCBL.CBMASV);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBMASC") != null) {
										incomingEnforcer_tDBOutput_1.put("CBMASC", tmap_INVCBL.CBMASC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBLAVC") != null) {
										incomingEnforcer_tDBOutput_1.put("CBLAVC", tmap_INVCBL.CBLAVC);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBARQT") != null) {
										incomingEnforcer_tDBOutput_1.put("CBARQT", tmap_INVCBL.CBARQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBNSQT") != null) {
										incomingEnforcer_tDBOutput_1.put("CBNSQT", tmap_INVCBL.CBNSQT);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("CBHLDQ") != null) {
										incomingEnforcer_tDBOutput_1.put("CBHLDQ", tmap_INVCBL.CBHLDQ);
									}
									// skip the put action if the input column doesn't appear in component runtime
									// schema
									if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1
											.getRuntimeSchema().getField("DATELOADED") != null) {
										incomingEnforcer_tDBOutput_1.put("DATELOADED", tmap_INVCBL.DATELOADED);
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

								} // End of branch "tmap_INVCBL"

								/**
								 * [tMap_1 process_data_end ] start
								 */

								currentComponent = "tMap_1";

								/**
								 * [tMap_1 process_data_end ] stop
								 */

							} // End of branch "row9"

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
					if (!((Object) ("/data/talend/data_repository/INVCBL.zip") instanceof java.io.InputStream)) {
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
				log.debug(
						"tMap_1 - Written records count in the table 'tmap_INVCBL': " + count_tmap_INVCBL_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "tmap_INVCBL", 2, 0,
						"tMap_1", "tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput", "output")) {
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
				runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
			}

			tDBRow_2Process(globalMap);

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

	public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

		public Boolean X_DASH_DET;

		public Boolean getX_DASH_DET() {
			return this.X_DASH_DET;
		}

		public Boolean X_DASH_DETIsNullable() {
			return true;
		}

		public Boolean X_DASH_DETIsKey() {
			return false;
		}

		public Integer X_DASH_DETLength() {
			return null;
		}

		public Integer X_DASH_DETPrecision() {
			return null;
		}

		public String X_DASH_DETDefault() {

			return null;

		}

		public String X_DASH_DETComment() {

			return "";

		}

		public String X_DASH_DETPattern() {

			return "";

		}

		public String X_DASH_DETOriginalDbColumnName() {

			return "X_DASH_DET";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.X_DASH_DET = null;
					} else {
						this.X_DASH_DET = dis.readBoolean();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

				try {

					int length = 0;

					length = dis.readByte();
					if (length == -1) {
						this.X_DASH_DET = null;
					} else {
						this.X_DASH_DET = dis.readBoolean();
					}

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Boolean

				if (this.X_DASH_DET == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeBoolean(this.X_DASH_DET);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Boolean

				if (this.X_DASH_DET == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeBoolean(this.X_DASH_DET);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("X_DASH_DET=" + String.valueOf(X_DASH_DET));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (X_DASH_DET == null) {
				sb.append("<null>");
			} else {
				sb.append(X_DASH_DET);
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

				row12Struct row12 = new row12Struct();

				/**
				 * [tJavaRow_1 begin ] start
				 */

				ok_Hash.put("tJavaRow_1", false);
				start_Hash.put("tJavaRow_1", System.currentTimeMillis());

				currentComponent = "tJavaRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row12");

				int tos_count_tJavaRow_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tJavaRow_1", "tJavaRow_1", "tJavaRow");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tJavaRow_1 = 0;

				/**
				 * [tJavaRow_1 begin ] stop
				 */

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
						"\nselect CASE WHEN max(DATELOADED) = dateadd(day, -1, substr(convert_timezone('America/New_York', current_timestamp()),"
								+ "0,10)) THEN TRUE ELSE FALSE END\nfrom PROD_DATA.INVENTORY.INVENTORY_BALANCE_DATA_INVCBL;;\n");

				props_tDBRow_2.setValue("dieOnError", false);

				props_tDBRow_2.setValue("usePreparedStatement", false);

				props_tDBRow_2.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_2_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"tDBRow_7\",\"fields\":[{", s);

						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",
								s);

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

						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",
								s);

						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",
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

				props_tDBRow_2.connection.setValue("useCustomRegion", false);

				props_tDBRow_2.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_2.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_1");

				props_tDBRow_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_2.table.setValue("tableName", "");

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

						a("\"name\":\"tDBRow_7\",\"fields\":[{", s);

						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",
								s);

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
				topology_tDBRow_2 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

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

				if (sourceOrSink_tDBRow_2 instanceof org.talend.components.api.component.runtime.Source) {
					org.talend.components.api.component.runtime.Source source_tDBRow_2 = (org.talend.components.api.component.runtime.Source) sourceOrSink_tDBRow_2;
					reader_tDBRow_2 = source_tDBRow_2.createReader(container_tDBRow_2);
					reader_tDBRow_2 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_2,
							container_tDBRow_2);

					boolean multi_output_is_allowed_tDBRow_2 = false;
					org.talend.components.api.component.Connector c_tDBRow_2 = null;
					for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_2
							.getAvailableConnectors(null, true)) {
						if (currentConnector.getName().equals("MAIN")) {
							c_tDBRow_2 = currentConnector;
						}

						if (currentConnector.getName().equals("REJECT")) {// it's better to move the code to javajet
							multi_output_is_allowed_tDBRow_2 = true;
						}
					}
					org.apache.avro.Schema schema_tDBRow_2 = props_tDBRow_2.getSchema(c_tDBRow_2, true);

					org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_2 = org.talend.codegen.enforcer.EnforcerCreator
							.createOutgoingEnforcer(schema_tDBRow_2, false);

					// Create a reusable factory that converts the output of the reader to an
					// IndexedRecord.
					org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBRow_2 = null;

					// Iterate through the incoming data.
					boolean available_tDBRow_2 = reader_tDBRow_2.start();

					resourceMap.put("reader_tDBRow_2", reader_tDBRow_2);

					for (; available_tDBRow_2; available_tDBRow_2 = reader_tDBRow_2.advance()) {
						nb_line_tDBRow_2++;

						if (multi_output_is_allowed_tDBRow_2) {

							row12 = null;

						}

						try {
							Object data_tDBRow_2 = reader_tDBRow_2.getCurrent();

							if (multi_output_is_allowed_tDBRow_2) {
								row12 = new row12Struct();
							}

							// Construct the factory once when the first data arrives.
							if (factory_tDBRow_2 == null) {
								factory_tDBRow_2 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>) new org.talend.daikon.avro.AvroRegistry()
										.createIndexedRecordConverter(data_tDBRow_2.getClass());
							}

							// Enforce the outgoing schema on the input.
							outgoingEnforcer_tDBRow_2.setWrapped(factory_tDBRow_2.convertToAvro(data_tDBRow_2));
							Object columnValue_0_tDBRow_2 = outgoingEnforcer_tDBRow_2.get(0);
							row12.X_DASH_DET = (Boolean) (columnValue_0_tDBRow_2);
						} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_2) {
							java.util.Map<String, Object> info_tDBRow_2 = e_tDBRow_2.getRejectInfo();

							// TODO use a method instead of getting method by the special key
							// "error/errorMessage"
							Object errorMessage_tDBRow_2 = null;
							if (info_tDBRow_2.containsKey("error")) {
								errorMessage_tDBRow_2 = info_tDBRow_2.get("error");
							} else if (info_tDBRow_2.containsKey("errorMessage")) {
								errorMessage_tDBRow_2 = info_tDBRow_2.get("errorMessage");
							} else {
								errorMessage_tDBRow_2 = "Rejected but error message missing";
							}
							errorMessage_tDBRow_2 = "Row " + nb_line_tDBRow_2 + ": " + errorMessage_tDBRow_2;
							System.err.println(errorMessage_tDBRow_2);

							// If the record is reject, the main line record should put NULL
							row12 = null;

						} // end of catch

						java.lang.Iterable<?> outgoingMainRecordsList_tDBRow_2 = new java.util.ArrayList<Object>();
						java.util.Iterator outgoingMainRecordsIt_tDBRow_2 = null;

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
// Start of branch "row12"
						if (row12 != null) {

							/**
							 * [tJavaRow_1 main ] start
							 */

							currentComponent = "tJavaRow_1";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "row12", "tDBRow_2", "tDBRow_2", "tSnowflakeRow", "tJavaRow_1", "tJavaRow_1",
									"tJavaRow"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("row12 - " + (row12 == null ? "" : row12.toLogString()));
							}

							System.out.println("table PROD_DATA.INVENTORY.INVENTORY_BALANCE_DATA_INVCBL status: "
									+ row12.X_DASH_DET);

							nb_line_tJavaRow_1++;

							tos_count_tJavaRow_1++;

							/**
							 * [tJavaRow_1 main ] stop
							 */

							/**
							 * [tJavaRow_1 process_data_begin ] start
							 */

							currentComponent = "tJavaRow_1";

							/**
							 * [tJavaRow_1 process_data_begin ] stop
							 */

							/**
							 * [tJavaRow_1 process_data_end ] start
							 */

							currentComponent = "tJavaRow_1";

							/**
							 * [tJavaRow_1 process_data_end ] stop
							 */

						} // End of branch "row12"

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

					} // while
				} // end of "if (sourceOrSink_tDBRow_2 instanceof ...Source)"
				java.util.Map<String, Object> resultMap_tDBRow_2 = null;
				if (reader_tDBRow_2 != null) {
					reader_tDBRow_2.close();
					resultMap_tDBRow_2 = reader_tDBRow_2.getReturnValues();
				}
				if (resultMap_tDBRow_2 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBRow_2 : resultMap_tDBRow_2.entrySet()) {
						switch (entry_tDBRow_2.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBRow_2.setComponentData("tDBRow_2", "ERROR_MESSAGE", entry_tDBRow_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBRow_2.setComponentData("tDBRow_2", "NB_LINE", entry_tDBRow_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBRow_2.setComponentData("tDBRow_2", "NB_SUCCESS", entry_tDBRow_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBRow_2.setComponentData("tDBRow_2", "NB_REJECT", entry_tDBRow_2.getValue());
							break;
						default:
							StringBuilder studio_key_tDBRow_2 = new StringBuilder();
							for (int i_tDBRow_2 = 0; i_tDBRow_2 < entry_tDBRow_2.getKey().length(); i_tDBRow_2++) {
								char ch_tDBRow_2 = entry_tDBRow_2.getKey().charAt(i_tDBRow_2);
								if (Character.isUpperCase(ch_tDBRow_2) && i_tDBRow_2 > 0) {
									studio_key_tDBRow_2.append('_');
								}
								studio_key_tDBRow_2.append(ch_tDBRow_2);
							}
							container_tDBRow_2.setComponentData("tDBRow_2",
									studio_key_tDBRow_2.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBRow_2.getValue());
							break;
						}
					}
				}

				ok_Hash.put("tDBRow_2", true);
				end_Hash.put("tDBRow_2", System.currentTimeMillis());

				/**
				 * [tDBRow_2 end ] stop
				 */

				/**
				 * [tJavaRow_1 end ] start
				 */

				currentComponent = "tJavaRow_1";

				globalMap.put("tJavaRow_1_NB_LINE", nb_line_tJavaRow_1);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row12", 2, 0,
						"tDBRow_2", "tDBRow_2", "tSnowflakeRow", "tJavaRow_1", "tJavaRow_1", "tJavaRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tJavaRow_1", true);
				end_Hash.put("tJavaRow_1", System.currentTimeMillis());

				if (row12.X_DASH_DET == true) {

					if (execStat) {
						runStat.updateStatOnConnection("If1", 0, "true");
					}
					tFileDelete_2Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If1", 0, "false");
					}
				}
				if (row12.X_DASH_DET == false) {

					if (execStat) {
						runStat.updateStatOnConnection("If2", 0, "true");
					}
					tSendMail_2Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If2", 0, "false");
					}
				}
				if (row12.X_DASH_DET == false) {

					if (execStat) {
						runStat.updateStatOnConnection("If3", 0, "true");
					}
					tDie_1Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If3", 0, "false");
					}
				}

				/**
				 * [tJavaRow_1 end ] stop
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
					if (resourceMap.get("reader_tDBRow_2") != null) {
						try {
							((org.talend.components.api.component.runtime.Reader) resourceMap.get("reader_tDBRow_2"))
									.close();
						} catch (java.io.IOException e_tDBRow_2) {
							String errorMessage_tDBRow_2 = "failed to release the resource in tDBRow_2 :"
									+ e_tDBRow_2.getMessage();
							System.err.println(errorMessage_tDBRow_2);
						}
					}
				}

				/**
				 * [tDBRow_2 finally ] stop
				 */

				/**
				 * [tJavaRow_1 finally ] start
				 */

				currentComponent = "tJavaRow_1";

				/**
				 * [tJavaRow_1 finally ] stop
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/INVCBL.zip\"");
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
				java.io.File path_tFileDelete_2 = new java.io.File("/data/talend/data_repository/INVCBL.zip");
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
				globalMap.put("tFileDelete_2_DELETE_PATH", "/data/talend/data_repository/INVCBL.zip");

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

	public void tSendMail_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tSendMail_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tSendMail_2");
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
				 * [tSendMail_2 begin ] start
				 */

				ok_Hash.put("tSendMail_2", false);
				start_Hash.put("tSendMail_2", System.currentTimeMillis());

				currentComponent = "tSendMail_2";

				int tos_count_tSendMail_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tSendMail_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSendMail_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSendMail_2 = new StringBuilder();
							log4jParamters_tSendMail_2.append("Parameters:");
							log4jParamters_tSendMail_2.append("TO" + " = " + "context.To");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("FROM" + " = " + "context.From");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("NEED_PERSONAL_NAME" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("CC" + " = " + "\"\"");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("BCC" + " = " + "\"\"");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("MESSAGE" + " = "
									+ "jobName + \"  Failed!!!, this email is triggered from INVENTORY_BALANCE_DATA_INVCBL Subjob because its missing data \" ");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("CHECK_ATTACHMENT" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("ATTACHMENTS" + " = " + "[]");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("HEADERS" + " = " + "[]");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("SMTP_PORT" + " = " + "25");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("SSL" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("STARTTLS" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("IMPORTANCE" + " = " + "Normal");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("AUTH_MODE" + " = " + "NO_AUTH");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("DIE_ON_ERROR" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("TEXT_SUBTYPE" + " = " + "plain");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("SET_LOCALHOST" + " = " + "false");
							log4jParamters_tSendMail_2.append(" | ");
							log4jParamters_tSendMail_2.append("CONFIGS" + " = " + "[]");
							log4jParamters_tSendMail_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSendMail_2 - " + (log4jParamters_tSendMail_2));
						}
					}
					new BytesLimit65535_tSendMail_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSendMail_2", "tSendMail_2", "tSendMail");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSendMail_2 begin ] stop
				 */

				/**
				 * [tSendMail_2 main ] start
				 */

				currentComponent = "tSendMail_2";

				String smtpHost_tSendMail_2 = "Mail13.vsi-nj.vitshoppe.com";
				String smtpPort_tSendMail_2 = "25";
				String from_tSendMail_2 = (context.From);
				String to_tSendMail_2 = (context.To).replace(";", ",");
				String cc_tSendMail_2 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String bcc_tSendMail_2 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String subject_tSendMail_2 = (jobName + " job Failed !!!!");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

				String message_tSendMail_2 = ((jobName
						+ "  Failed!!!, this email is triggered from INVENTORY_BALANCE_DATA_INVCBL Subjob because its missing data ") == null
						|| "".equals(jobName
								+ "  Failed!!!, this email is triggered from INVENTORY_BALANCE_DATA_INVCBL Subjob because its missing data "))
										? "\"\""
										: (jobName
												+ "  Failed!!!, this email is triggered from INVENTORY_BALANCE_DATA_INVCBL Subjob because its missing data ");
				java.util.Properties props_tSendMail_2 = System.getProperties();
				props_tSendMail_2.put("mail.smtp.host", smtpHost_tSendMail_2);
				props_tSendMail_2.put("mail.smtp.port", smtpPort_tSendMail_2);

				props_tSendMail_2.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_2 - Connection attempt to '" + smtpHost_tSendMail_2 + "'.");

					props_tSendMail_2.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_2 = javax.mail.Session.getInstance(props_tSendMail_2, null);

					log.info("tSendMail_2 - Connection to '" + smtpHost_tSendMail_2 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_2 = new javax.mail.internet.MimeMessage(session_tSendMail_2);
					msg_tSendMail_2.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_2, null));
					msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(to_tSendMail_2, false));
					if (cc_tSendMail_2 != null)
						msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(cc_tSendMail_2, false));
					if (bcc_tSendMail_2 != null)
						msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(bcc_tSendMail_2, false));
					msg_tSendMail_2.setSubject(subject_tSendMail_2);

					for (int i_tSendMail_2 = 0; i_tSendMail_2 < headers_tSendMail_2.size(); i_tSendMail_2++) {
						java.util.Map<String, String> header_tSendMail_2 = headers_tSendMail_2.get(i_tSendMail_2);
						msg_tSendMail_2.setHeader(header_tSendMail_2.get("KEY"), header_tSendMail_2.get("VALUE"));
					}
					msg_tSendMail_2.setSentDate(new Date());
					msg_tSendMail_2.setHeader("X-Priority", "3"); // High->1 Normal->3 Low->5
					javax.mail.Multipart mp_tSendMail_2 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_2.setText(message_tSendMail_2, "ISO-8859-15", "plain");
					mp_tSendMail_2.addBodyPart(mbpText_tSendMail_2);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_2 = null;

					for (int i_tSendMail_2 = 0; i_tSendMail_2 < attachments_tSendMail_2.size(); i_tSendMail_2++) {
						String filename_tSendMail_2 = attachments_tSendMail_2.get(i_tSendMail_2);
						javax.activation.FileDataSource fds_tSendMail_2 = null;
						java.io.File file_tSendMail_2 = new java.io.File(filename_tSendMail_2);

						if (!file_tSendMail_2.exists()) {
							continue;
						}

						if (file_tSendMail_2.isDirectory()) {
							java.io.File[] subFiles_tSendMail_2 = file_tSendMail_2.listFiles();
							for (java.io.File subFile_tSendMail_2 : subFiles_tSendMail_2) {
								if (subFile_tSendMail_2.isFile()) {
									fds_tSendMail_2 = new javax.activation.FileDataSource(
											subFile_tSendMail_2.getAbsolutePath());
									mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_2
											.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2));
									mbpFile_tSendMail_2.setFileName(
											javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
									if (contentTransferEncoding_tSendMail_2.get(i_tSendMail_2)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
									}
									mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
								}
							}
						} else {
							mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_2 = new javax.activation.FileDataSource(filename_tSendMail_2);
							mbpFile_tSendMail_2.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2));
							mbpFile_tSendMail_2
									.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
							if (contentTransferEncoding_tSendMail_2.get(i_tSendMail_2).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
						}
					}
					// -- set the content --
					msg_tSendMail_2.setContent(mp_tSendMail_2);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_2 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_2.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_2.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_2.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_2
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_2
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_2);
					// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
					com.sun.mail.handlers.text_plain text_plain_h_tSendMail_2 = null;
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_2);
				} catch (java.lang.Exception e) {
					globalMap.put("tSendMail_2_ERROR_MESSAGE", e.getMessage());

					log.error("tSendMail_2 - " + e.toString());

					System.err.println(e.toString());

				} finally {
					props_tSendMail_2.remove("mail.smtp.host");
					props_tSendMail_2.remove("mail.smtp.port");

					props_tSendMail_2.remove("mail.mime.encodefilename");

					props_tSendMail_2.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_2++;

				/**
				 * [tSendMail_2 main ] stop
				 */

				/**
				 * [tSendMail_2 process_data_begin ] start
				 */

				currentComponent = "tSendMail_2";

				/**
				 * [tSendMail_2 process_data_begin ] stop
				 */

				/**
				 * [tSendMail_2 process_data_end ] start
				 */

				currentComponent = "tSendMail_2";

				/**
				 * [tSendMail_2 process_data_end ] stop
				 */

				/**
				 * [tSendMail_2 end ] start
				 */

				currentComponent = "tSendMail_2";

				if (log.isDebugEnabled())
					log.debug("tSendMail_2 - " + ("Done."));

				ok_Hash.put("tSendMail_2", true);
				end_Hash.put("tSendMail_2", System.currentTimeMillis());

				/**
				 * [tSendMail_2 end ] stop
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
				 * [tSendMail_2 finally ] start
				 */

				currentComponent = "tSendMail_2";

				/**
				 * [tSendMail_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_2_SUBPROCESS_STATE", 1);
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

	public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

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

	public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVCBL) {

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

				row2Struct row2 = new row2Struct();
				row2Struct row10 = row2;

				/**
				 * [tSendMail_1 begin ] start
				 */

				ok_Hash.put("tSendMail_1", false);
				start_Hash.put("tSendMail_1", System.currentTimeMillis());

				currentComponent = "tSendMail_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row10");

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

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row2");

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
						row2.type = lcm.getType();
						row2.origin = (lcm.getOrigin() == null || lcm.getOrigin().length() < 1 ? null
								: lcm.getOrigin());
						row2.priority = lcm.getPriority();
						row2.message = lcm.getMessage();
						row2.code = lcm.getCode();

						row2.moment = java.util.Calendar.getInstance().getTime();

						row2.pid = pid;
						row2.root_pid = rootPid;
						row2.father_pid = fatherPid;

						row2.project = projectName;
						row2.job = jobName;
						row2.context = contextStr;

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

								, "row2", "tLogCatcher_1", "tLogCatcher_1", "tLogCatcher", "tLogRow_1", "tLogRow_1",
								"tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
						}

///////////////////////		

						strBuffer_tLogRow_1 = new StringBuilder();

						if (row2.moment != null) { //

							strBuffer_tLogRow_1.append(FormatterUtils.format_Date(row2.moment, "yyyy-MM-dd HH:mm:ss"));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.root_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.root_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.father_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.father_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.project != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.project));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.job != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.job));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.context != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.context));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.priority != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.priority));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.type != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.type));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.origin != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.origin));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.message != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.message));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row2.code != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row2.code));

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

						row10 = row2;

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

								, "row10", "tLogRow_1", "tLogRow_1", "tLogRow", "tSendMail_1", "tSendMail_1",
								"tSendMail"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row10 - " + (row10 == null ? "" : row10.toLogString()));
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row10", 2, 0,
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
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
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
							log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Close");
							log4jParamters_tDBClose_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_2 - " + (log4jParamters_tDBClose_2));
						}
					}
					new BytesLimit65535_tDBClose_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tAS400Close");
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
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
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
								"enc:routine.encryption.key.v1:egYOG+PfeC6NwuEa++/MpjkG2DpmMr3dHmbSjbZyZymc+1Fr"));

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

				int tos_count_tDBConnection_2 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_2 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_2 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_2 = new StringBuilder();
							log4jParamters_tDBConnection_2.append("Parameters:");
							log4jParamters_tDBConnection_2.append("DB_VERSION" + " = " + "jt400_V6R1.jar");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("HOST" + " = " + "\"10.3.2.140\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("DBNAME" + " = " + "\"MM4R5LIB\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USER" + " = " + "\"sqletl\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:mAyby1AhwNf7hjcTHFlwYkzSmpO3BJbt1eZ9fDnXxnvcGw==")
									.substring(0, 4) + "...");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_2.append(" | ");
							log4jParamters_tDBConnection_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Connection");
							log4jParamters_tDBConnection_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_2 - " + (log4jParamters_tDBConnection_2));
						}
					}
					new BytesLimit65535_tDBConnection_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "tDBConnection_2", "tAS400Connection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_2 = "jdbc:as400://" + "10.3.2.140" + "/" + "MM4R5LIB" + ";" + "prompt=false";
				String dbUser_tDBConnection_2 = "sqletl";

				final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:xj4eCQMn1LQz4U5Qz/iCV3D8qExqjUiulvAHy8qAUKM9MA==");
				String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;

				java.sql.Connection conn_tDBConnection_2 = null;

				String driverClass_tDBConnection_2 = "com.ibm.as400.access.AS400JDBCDriver";
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
		final INVENTORY_BALANCE_DATA_INVCBL INVENTORY_BALANCE_DATA_INVCBLClass = new INVENTORY_BALANCE_DATA_INVCBL();

		int exitCode = INVENTORY_BALANCE_DATA_INVCBLClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVCBL' - Done.");
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
		log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVCBL' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_gBb_INm5EeuE0KkKg4NQQA");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-29T15:40:45.972187200Z");

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
			java.io.InputStream inContext = INVENTORY_BALANCE_DATA_INVCBL.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/inventory_balance_data_invcbl_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = INVENTORY_BALANCE_DATA_INVCBL.class.getClassLoader()
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
					context.setContextType("To", "id_String");
					if (context.getStringValue("To") == null) {
						context.To = null;
					} else {
						context.To = (String) context.getProperty("To");
					}
					context.setContextType("From", "id_String");
					if (context.getStringValue("From") == null) {
						context.From = null;
					} else {
						context.From = (String) context.getProperty("From");
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
			if (parentContextMap.containsKey("To")) {
				context.To = (String) parentContextMap.get("To");
			}
			if (parentContextMap.containsKey("From")) {
				context.From = (String) parentContextMap.get("From");
			}
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
		log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVCBL' - Started.");
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

		try {
			errorCode = null;
			tDBRow_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBRow_1) {
			globalMap.put("tDBRow_1_SUBPROCESS_STATE", -1);

			e_tDBRow_1.printStackTrace();

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
					+ " bytes memory increase when running : INVENTORY_BALANCE_DATA_INVCBL");
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
		log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVCBL' - Finished - status: " + status + " returnCode: "
				+ returnCode);

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
 * 791412 characters generated by Talend Cloud Data Management Platform on the
 * June 29, 2023 at 11:40:45 AM EDT
 ************************************************************************************************/