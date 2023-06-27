
package at_talend_jobs.price_detail_by_loc_sku_prcdtl_0_1;

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
 * Job: PRICE_DETAIL_BY_LOC_SKU_PRCDTL Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class PRICE_DETAIL_BY_LOC_SKU_PRCDTL implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "PRICE_DETAIL_BY_LOC_SKU_PRCDTL.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(PRICE_DETAIL_BY_LOC_SKU_PRCDTL.class);

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
	private final String jobName = "PRICE_DETAIL_BY_LOC_SKU_PRCDTL";
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
			"_LjBkwNm6EeuE0KkKg4NQQA", "0.1");
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
					PRICE_DETAIL_BY_LOC_SKU_PRCDTL.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(PRICE_DETAIL_BY_LOC_SKU_PRCDTL.this,
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

	public void tDBRow_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBRow_5_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileDelete_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tPostjob_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPostjob_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBConnection_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBRow_2_onSubJobError(Exception exception, String errorComponent,
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

	public void tDBRow_5_onSubJobError(Exception exception, String errorComponent,
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

	public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent,
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

	public void tPostjob_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tDBClose_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tPrejob_2_onSubJobError(Exception exception, String errorComponent,
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
						"\nDELETE from PRICE_DETAIL_BY_LOC_SKU_PRCDTL\nWHERE DATELOADED = CURRENT_DATE()\n\n");

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

				props_tDBRow_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_1.table.setValue("tableName", "");

				props_tDBRow_1.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_1.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_1.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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
				tDBRow_2Process(globalMap);

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
						"\ncreate or replace TABLE PRCDTL (\n	LPSKU NUMBER(9,0),\n	LPLOC NUMBER(5,0),\n	LPCUR VARCHAR(3),\n	LPPTP VARCHAR(3),\n	"
								+ "LPCENT NUMBER(1,0),\n	LPDATE NUMBER(6,0),\n	LPRETL NUMBER(9,2),\n	LPRETU NUMBER(9,2),\n	LPRMLT NUMBER(3,0),\n	LPPOS NUMB"
								+ "ER(9,2),\n	LPPOSU NUMBER(9,2),\n	LPPMLT NUMBER(3,0),\n	LPORIG NUMBER(9,2),\n	LPORGU NUMBER(9,2),\n	LPOMLT NUMBER(3,0),\n"
								+ "	LPPPRE NUMBER(2,0),\n        LOAD_DATE DATE\n);\n\n");

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

				props_tDBRow_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_2.table.setValue("tableName", "");

				props_tDBRow_2.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_2.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_2.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBInput_1Process(globalMap);

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

	public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

				row4Struct row4 = new row4Struct();

				/**
				 * [tFileOutputDelimited_1 begin ] start
				 */

				ok_Hash.put("tFileOutputDelimited_1", false);
				start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());

				currentComponent = "tFileOutputDelimited_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row4");

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
									.append("FILENAME" + " = " + "\"/data/talend/data_repository/PRCDTL.csv\"");
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
				fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/PRCDTL.csv"))
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
					outtFileOutputDelimited_1.write("LPSKU");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPLOC");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPCUR");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPPTP");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPCENT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPDATE");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPRETL");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPRETU");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPRMLT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPPOS");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPPOSU");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPPMLT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPORIG");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPORGU");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPOMLT");
					outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
					outtFileOutputDelimited_1.write("LPPPRE");
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
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"with temp as (select istore||a.inumbr strsku                                          from invbal a join invmst b on a.inumbr = b.inumbr                   where idsccd not in ('D', 'P')                                           or (idsccd in ('D', 'P') and ibhand <> 0 )),            temp2 as (select strnum from tblstr                                                  where stcldt = 0 or stcldt > (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP -7 DAYS, 'YYMMDD')))                       select *                                                              from prcdtl                                                            where lploc <> 5501 and lploc in (select strnum from temp2)                  and lploc||lpsku in (select strsku from temp)      \"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
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
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");

				if (conn_tDBInput_1 != null) {
					if (conn_tDBInput_1.getMetaData() != null) {

						log.debug("tDBInput_1 - Uses an existing connection with username '"
								+ conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_1.getMetaData().getURL() + ".");

					}
				}

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "with temp as (select istore||a.inumbr strsku                        \n                from invbal a join invmst b on a."
						+ "inumbr = b.inumbr  \n               where idsccd not in ('D', 'P')                       \n                  or (idsccd "
						+ "in ('D', 'P') and ibhand <> 0 )),      \n    temp2 as (select strnum from tblstr                                 \n     "
						+ "          where stcldt = 0 or stcldt > (VALUES  VARCHAR_FORMAT(CURRENT TIMESTAMP -7 DAYS, 'YYMMDD')))                   "
						+ "  \nselect *                                                          \n  from prcdtl                                   "
						+ "                      \n where lploc <> 5501 and lploc in (select strnum from temp2)         \n       and lploc||lpsku i"
						+ "n (select strsku from temp)  \n\n";

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
							row4.LPSKU = null;
						} else {

							row4.LPSKU = rs_tDBInput_1.getBigDecimal(1);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row4.LPLOC = null;
						} else {

							row4.LPLOC = rs_tDBInput_1.getBigDecimal(2);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row4.LPCUR = null;
						} else {

							row4.LPCUR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row4.LPPTP = null;
						} else {

							row4.LPPTP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row4.LPCENT = null;
						} else {

							row4.LPCENT = rs_tDBInput_1.getBigDecimal(5);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row4.LPDATE = null;
						} else {

							row4.LPDATE = rs_tDBInput_1.getBigDecimal(6);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row4.LPRETL = null;
						} else {

							row4.LPRETL = rs_tDBInput_1.getBigDecimal(7);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row4.LPRETU = null;
						} else {

							row4.LPRETU = rs_tDBInput_1.getBigDecimal(8);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row4.LPRMLT = null;
						} else {

							row4.LPRMLT = rs_tDBInput_1.getBigDecimal(9);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row4.LPPOS = null;
						} else {

							row4.LPPOS = rs_tDBInput_1.getBigDecimal(10);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row4.LPPOSU = null;
						} else {

							row4.LPPOSU = rs_tDBInput_1.getBigDecimal(11);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row4.LPPMLT = null;
						} else {

							row4.LPPMLT = rs_tDBInput_1.getBigDecimal(12);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 13) {
							row4.LPORIG = null;
						} else {

							row4.LPORIG = rs_tDBInput_1.getBigDecimal(13);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 14) {
							row4.LPORGU = null;
						} else {

							row4.LPORGU = rs_tDBInput_1.getBigDecimal(14);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 15) {
							row4.LPOMLT = null;
						} else {

							row4.LPOMLT = rs_tDBInput_1.getBigDecimal(15);
							if (rs_tDBInput_1.wasNull()) {
								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 16) {
							row4.LPPPRE = null;
						} else {

							row4.LPPPRE = rs_tDBInput_1.getBigDecimal(16);
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

								, "row4", "tDBInput_1", "tDBInput_1", "tAS400Input", "tFileOutputDelimited_1",
								"tFileOutputDelimited_1", "tFileOutputDelimited"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row4 - " + (row4 == null ? "" : row4.toLogString()));
						}

						StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
						if (row4.LPSKU != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPLOC != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPLOC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPCUR != null) {
							sb_tFileOutputDelimited_1.append(row4.LPCUR);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPPTP != null) {
							sb_tFileOutputDelimited_1.append(row4.LPPTP);
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPCENT != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPCENT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPDATE != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPDATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPRETL != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPRETL.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPRETU != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPRETU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPRMLT != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPRMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPPOS != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPPOS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPPOSU != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPPOSU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPPMLT != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPPMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPORIG != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPORIG.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPORGU != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPORGU.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPOMLT != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPOMLT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
						}
						sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
						if (row4.LPPPRE != null) {
							sb_tFileOutputDelimited_1
									.append(row4.LPPPRE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString());
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row4", 2, 0,
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

	public static class PRCDTLStruct implements routines.system.IPersistableRow<PRCDTLStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

				props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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
						"tDBConnection_2");

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
				 * [tMap_1 begin ] start
				 */

				ok_Hash.put("tMap_1", false);
				start_Hash.put("tMap_1", System.currentTimeMillis());

				currentComponent = "tMap_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row3");

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
				int count_row3_tMap_1 = 0;

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
				int count_PRCDTL_tMap_1 = 0;

				PRCDTLStruct PRCDTL_tmp = new PRCDTLStruct();
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
								 * [tMap_1 main ] start
								 */

								currentComponent = "tMap_1";

								if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

										, "row3", "tFileInputDelimited_1", "tFileInputDelimited_1",
										"tFileInputDelimited", "tMap_1", "tMap_1", "tMap"

								)) {
									talendJobLogProcess(globalMap);
								}

								if (log.isTraceEnabled()) {
									log.trace("row3 - " + (row3 == null ? "" : row3.toLogString()));
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

									PRCDTL = null;

// # Output table : 'PRCDTL'
									count_PRCDTL_tMap_1++;

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
									log.debug("tMap_1 - Outputting the record " + count_PRCDTL_tMap_1
											+ " of the output table 'PRCDTL'.");

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
// Start of branch "PRCDTL"
								if (PRCDTL != null) {

									/**
									 * [tDBOutput_1 main ] start
									 */

									currentComponent = "tDBOutput_1";

									if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

											, "PRCDTL", "tMap_1", "tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1",
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
								 * [tMap_1 process_data_end ] start
								 */

								currentComponent = "tMap_1";

								/**
								 * [tMap_1 process_data_end ] stop
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
				 * [tMap_1 end ] start
				 */

				currentComponent = "tMap_1";

// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'PRCDTL': " + count_PRCDTL_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row3", 2, 0,
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "PRCDTL", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput", "output")) {
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

				props_tDBRow_3.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_3.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_3.table.setValue("tableName", "");

				props_tDBRow_3.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_3.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_3.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_3.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_3.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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
					runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
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

				props_tDBRow_4.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_4.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_4.table.setValue("tableName", "");

				props_tDBRow_4.table.connection.setValue("region",
						org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);

				props_tDBRow_4.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_4.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_4.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_4.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

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
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBRow_5Process(globalMap);

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

	public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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
						"\nselect CASE WHEN max(DATELOADED) = dateadd(day, 0, substr(convert_timezone('America/New_York', current_timestamp()),0"
								+ ",10)) THEN TRUE ELSE FALSE END\nfrom PROD_DATA.INVENTORY.PRICE_DETAIL_BY_LOC_SKU_PRCDTL;\n");

				props_tDBRow_5.setValue("dieOnError", false);

				props_tDBRow_5.setValue("usePreparedStatement", false);

				props_tDBRow_5.setValue("commitCount", 10000);

				class SchemaSettingTool_tDBRow_5_1_fisrt {

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

				SchemaSettingTool_tDBRow_5_1_fisrt sst_tDBRow_5_1_fisrt = new SchemaSettingTool_tDBRow_5_1_fisrt();

				props_tDBRow_5.schemaFlow.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_1_fisrt.getSchemaValue()));

				class SchemaSettingTool_tDBRow_5_2_fisrt {

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

				SchemaSettingTool_tDBRow_5_2_fisrt sst_tDBRow_5_2_fisrt = new SchemaSettingTool_tDBRow_5_2_fisrt();

				props_tDBRow_5.schemaReject.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_2_fisrt.getSchemaValue()));

				props_tDBRow_5.connection.setValue("useCustomRegion", false);

				props_tDBRow_5.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_5.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_5.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_5.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBRow_5.table.setValue("tableName", "");

				props_tDBRow_5.table.connection.setValue("useCustomRegion", false);

				props_tDBRow_5.table.connection.userPassword.setValue("useAuth", false);

				props_tDBRow_5.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBRow_5.table.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBRow_5.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBRow_5_3_fisrt {

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
				topology_tDBRow_5 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

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

				if (sourceOrSink_tDBRow_5 instanceof org.talend.components.api.component.runtime.Source) {
					org.talend.components.api.component.runtime.Source source_tDBRow_5 = (org.talend.components.api.component.runtime.Source) sourceOrSink_tDBRow_5;
					reader_tDBRow_5 = source_tDBRow_5.createReader(container_tDBRow_5);
					reader_tDBRow_5 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_5,
							container_tDBRow_5);

					boolean multi_output_is_allowed_tDBRow_5 = false;
					org.talend.components.api.component.Connector c_tDBRow_5 = null;
					for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_5
							.getAvailableConnectors(null, true)) {
						if (currentConnector.getName().equals("MAIN")) {
							c_tDBRow_5 = currentConnector;
						}

						if (currentConnector.getName().equals("REJECT")) {// it's better to move the code to javajet
							multi_output_is_allowed_tDBRow_5 = true;
						}
					}
					org.apache.avro.Schema schema_tDBRow_5 = props_tDBRow_5.getSchema(c_tDBRow_5, true);

					org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_5 = org.talend.codegen.enforcer.EnforcerCreator
							.createOutgoingEnforcer(schema_tDBRow_5, false);

					// Create a reusable factory that converts the output of the reader to an
					// IndexedRecord.
					org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBRow_5 = null;

					// Iterate through the incoming data.
					boolean available_tDBRow_5 = reader_tDBRow_5.start();

					resourceMap.put("reader_tDBRow_5", reader_tDBRow_5);

					for (; available_tDBRow_5; available_tDBRow_5 = reader_tDBRow_5.advance()) {
						nb_line_tDBRow_5++;

						if (multi_output_is_allowed_tDBRow_5) {

							row12 = null;

						}

						try {
							Object data_tDBRow_5 = reader_tDBRow_5.getCurrent();

							if (multi_output_is_allowed_tDBRow_5) {
								row12 = new row12Struct();
							}

							// Construct the factory once when the first data arrives.
							if (factory_tDBRow_5 == null) {
								factory_tDBRow_5 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>) new org.talend.daikon.avro.AvroRegistry()
										.createIndexedRecordConverter(data_tDBRow_5.getClass());
							}

							// Enforce the outgoing schema on the input.
							outgoingEnforcer_tDBRow_5.setWrapped(factory_tDBRow_5.convertToAvro(data_tDBRow_5));
							Object columnValue_0_tDBRow_5 = outgoingEnforcer_tDBRow_5.get(0);
							row12.X_DASH_DET = (Boolean) (columnValue_0_tDBRow_5);
						} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_5) {
							java.util.Map<String, Object> info_tDBRow_5 = e_tDBRow_5.getRejectInfo();

							// TODO use a method instead of getting method by the special key
							// "error/errorMessage"
							Object errorMessage_tDBRow_5 = null;
							if (info_tDBRow_5.containsKey("error")) {
								errorMessage_tDBRow_5 = info_tDBRow_5.get("error");
							} else if (info_tDBRow_5.containsKey("errorMessage")) {
								errorMessage_tDBRow_5 = info_tDBRow_5.get("errorMessage");
							} else {
								errorMessage_tDBRow_5 = "Rejected but error message missing";
							}
							errorMessage_tDBRow_5 = "Row " + nb_line_tDBRow_5 + ": " + errorMessage_tDBRow_5;
							System.err.println(errorMessage_tDBRow_5);

							// If the record is reject, the main line record should put NULL
							row12 = null;

						} // end of catch

						java.lang.Iterable<?> outgoingMainRecordsList_tDBRow_5 = new java.util.ArrayList<Object>();
						java.util.Iterator outgoingMainRecordsIt_tDBRow_5 = null;

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
// Start of branch "row12"
						if (row12 != null) {

							/**
							 * [tJavaRow_1 main ] start
							 */

							currentComponent = "tJavaRow_1";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "row12", "tDBRow_5", "tDBRow_5", "tSnowflakeRow", "tJavaRow_1", "tJavaRow_1",
									"tJavaRow"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("row12 - " + (row12 == null ? "" : row12.toLogString()));
							}

							System.out.println("table PROD_DATA.INVENTORY.PRICE_DETAIL_BY_LOC_SKU_PRCDTL status: "
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

					} // while
				} // end of "if (sourceOrSink_tDBRow_5 instanceof ...Source)"
				java.util.Map<String, Object> resultMap_tDBRow_5 = null;
				if (reader_tDBRow_5 != null) {
					reader_tDBRow_5.close();
					resultMap_tDBRow_5 = reader_tDBRow_5.getReturnValues();
				}
				if (resultMap_tDBRow_5 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBRow_5 : resultMap_tDBRow_5.entrySet()) {
						switch (entry_tDBRow_5.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBRow_5.setComponentData("tDBRow_5", "ERROR_MESSAGE", entry_tDBRow_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBRow_5.setComponentData("tDBRow_5", "NB_LINE", entry_tDBRow_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBRow_5.setComponentData("tDBRow_5", "NB_SUCCESS", entry_tDBRow_5.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBRow_5.setComponentData("tDBRow_5", "NB_REJECT", entry_tDBRow_5.getValue());
							break;
						default:
							StringBuilder studio_key_tDBRow_5 = new StringBuilder();
							for (int i_tDBRow_5 = 0; i_tDBRow_5 < entry_tDBRow_5.getKey().length(); i_tDBRow_5++) {
								char ch_tDBRow_5 = entry_tDBRow_5.getKey().charAt(i_tDBRow_5);
								if (Character.isUpperCase(ch_tDBRow_5) && i_tDBRow_5 > 0) {
									studio_key_tDBRow_5.append('_');
								}
								studio_key_tDBRow_5.append(ch_tDBRow_5);
							}
							container_tDBRow_5.setComponentData("tDBRow_5",
									studio_key_tDBRow_5.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBRow_5.getValue());
							break;
						}
					}
				}

				ok_Hash.put("tDBRow_5", true);
				end_Hash.put("tDBRow_5", System.currentTimeMillis());

				/**
				 * [tDBRow_5 end ] stop
				 */

				/**
				 * [tJavaRow_1 end ] start
				 */

				currentComponent = "tJavaRow_1";

				globalMap.put("tJavaRow_1_NB_LINE", nb_line_tJavaRow_1);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row12", 2, 0,
						"tDBRow_5", "tDBRow_5", "tSnowflakeRow", "tJavaRow_1", "tJavaRow_1", "tJavaRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tJavaRow_1", true);
				end_Hash.put("tJavaRow_1", System.currentTimeMillis());

				if (row12.X_DASH_DET == true) {

					if (execStat) {
						runStat.updateStatOnConnection("If3", 0, "true");
					}
					tFileDelete_1Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If3", 0, "false");
					}
				}
				if (row12.X_DASH_DET == false) {

					if (execStat) {
						runStat.updateStatOnConnection("If2", 0, "true");
					}
					tDie_1Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If2", 0, "false");
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
				 * [tDBRow_5 finally ] start
				 */

				currentComponent = "tDBRow_5";

// finally of generic

				if (resourceMap.get("finish_tDBRow_5") == null) {
					if (resourceMap.get("reader_tDBRow_5") != null) {
						try {
							((org.talend.components.api.component.runtime.Reader) resourceMap.get("reader_tDBRow_5"))
									.close();
						} catch (java.io.IOException e_tDBRow_5) {
							String errorMessage_tDBRow_5 = "failed to release the resource in tDBRow_5 :"
									+ e_tDBRow_5.getMessage();
							System.err.println(errorMessage_tDBRow_5);
						}
					}
				}

				/**
				 * [tDBRow_5 finally ] stop
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

		globalMap.put("tDBRow_5_SUBPROCESS_STATE", 1);
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
									.append("PATH" + " = " + "\"/data/talend/data_repository/PRCDTL.zip\"");
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
				java.io.File path_tFileDelete_1 = new java.io.File("/data/talend/data_repository/PRCDTL.zip");
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
				globalMap.put("tFileDelete_1_DELETE_PATH", "/data/talend/data_repository/PRCDTL.zip");

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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

	public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[0];

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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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
				if (length > commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL.length == 0) {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL, 0, length,
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_PRICE_DETAIL_BY_LOC_SKU_PRCDTL) {

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

				row9Struct row9 = new row9Struct();
				row9Struct row10 = row9;

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

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row9");

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
						row9.type = lcm.getType();
						row9.origin = (lcm.getOrigin() == null || lcm.getOrigin().length() < 1 ? null
								: lcm.getOrigin());
						row9.priority = lcm.getPriority();
						row9.message = lcm.getMessage();
						row9.code = lcm.getCode();

						row9.moment = java.util.Calendar.getInstance().getTime();

						row9.pid = pid;
						row9.root_pid = rootPid;
						row9.father_pid = fatherPid;

						row9.project = projectName;
						row9.job = jobName;
						row9.context = contextStr;

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

								, "row9", "tLogCatcher_1", "tLogCatcher_1", "tLogCatcher", "tLogRow_1", "tLogRow_1",
								"tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row9 - " + (row9 == null ? "" : row9.toLogString()));
						}

///////////////////////		

						strBuffer_tLogRow_1 = new StringBuilder();

						if (row9.moment != null) { //

							strBuffer_tLogRow_1.append(FormatterUtils.format_Date(row9.moment, "yyyy-MM-dd HH:mm:ss"));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.root_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.root_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.father_pid != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.father_pid));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.project != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.project));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.job != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.job));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.context != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.context));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.priority != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.priority));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.type != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.type));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.origin != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.origin));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.message != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.message));

						} //

						strBuffer_tLogRow_1.append("|");

						if (row9.code != null) { //

							strBuffer_tLogRow_1.append(String.valueOf(row9.code));

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

						row10 = row9;

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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row9", 2, 0,
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

	public void tPostjob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPostjob_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPostjob_2");
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
				 * [tPostjob_2 begin ] start
				 */

				ok_Hash.put("tPostjob_2", false);
				start_Hash.put("tPostjob_2", System.currentTimeMillis());

				currentComponent = "tPostjob_2";

				int tos_count_tPostjob_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPostjob_2", "tPostjob_2", "tPostjob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPostjob_2 begin ] stop
				 */

				/**
				 * [tPostjob_2 main ] start
				 */

				currentComponent = "tPostjob_2";

				tos_count_tPostjob_2++;

				/**
				 * [tPostjob_2 main ] stop
				 */

				/**
				 * [tPostjob_2 process_data_begin ] start
				 */

				currentComponent = "tPostjob_2";

				/**
				 * [tPostjob_2 process_data_begin ] stop
				 */

				/**
				 * [tPostjob_2 process_data_end ] start
				 */

				currentComponent = "tPostjob_2";

				/**
				 * [tPostjob_2 process_data_end ] stop
				 */

				/**
				 * [tPostjob_2 end ] start
				 */

				currentComponent = "tPostjob_2";

				ok_Hash.put("tPostjob_2", true);
				end_Hash.put("tPostjob_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBClose_2Process(globalMap);

				/**
				 * [tPostjob_2 end ] stop
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
				 * [tPostjob_2 finally ] start
				 */

				currentComponent = "tPostjob_2";

				/**
				 * [tPostjob_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPostjob_2_SUBPROCESS_STATE", 1);
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

				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tSnowflakeClose");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBClose_2 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBClose_2 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBClose_2 = (String) (restRequest_tDBClose_2 != null
						? restRequest_tDBClose_2.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBClose_2 = new org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBClose_2 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBClose_2 = null;

				org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties props_tDBClose_2 = (org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties) def_tDBClose_2
						.createRuntimeProperties();
				props_tDBClose_2.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBClose_2.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBClose_2.referencedComponent.setValue("referenceDefinitionName", "tSnowflakeConnection");

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBClose_2.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBClose_2 = props_tDBClose_2.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBClose_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBClose_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBClose_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBClose_2.referencedComponent.setReference(referencedComponentProperties_tDBClose_2);
					}
				}
				globalMap.put("tDBClose_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBClose_2);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBClose_2 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBClose_2_MAPPINGS_URL", mappings_url_tDBClose_2);

				org.talend.components.api.container.RuntimeContainer container_tDBClose_2 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBClose_2";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBClose_2 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBClose_2 = null;
				topology_tDBClose_2 = org.talend.components.api.component.ConnectorTopology.NONE;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBClose_2 = def_tDBClose_2.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBClose_2,
						topology_tDBClose_2);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBClose_2 = def_tDBClose_2
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBClose_2 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBClose_2.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBClose_2 = componentRuntime_tDBClose_2
						.initialize(container_tDBClose_2, props_tDBClose_2);

				if (initVr_tDBClose_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBClose_2.getMessage());
				}

				if (componentRuntime_tDBClose_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBClose_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBClose_2;
					compDriverInitialization_tDBClose_2.runAtDriver(container_tDBClose_2);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBClose_2 = null;
				if (componentRuntime_tDBClose_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBClose_2 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBClose_2;
					if (doesNodeBelongToRequest_tDBClose_2) {
						org.talend.daikon.properties.ValidationResult vr_tDBClose_2 = sourceOrSink_tDBClose_2
								.validate(container_tDBClose_2);
						if (vr_tDBClose_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBClose_2.getMessage());
						}
					}
				}

				/**
				 * [tDBClose_2 begin ] stop
				 */

				/**
				 * [tDBClose_2 main ] start
				 */

				currentComponent = "tDBClose_2";

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

// end of generic

				ok_Hash.put("tDBClose_2", true);
				end_Hash.put("tDBClose_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tDBClose_3Process(globalMap);

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

// finally of generic

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

	public void tDBClose_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tDBClose_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBClose_3");
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
				 * [tDBClose_3 begin ] start
				 */

				ok_Hash.put("tDBClose_3", false);
				start_Hash.put("tDBClose_3", System.currentTimeMillis());

				currentComponent = "tDBClose_3";

				int tos_count_tDBClose_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBClose_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_3 = new StringBuilder();
							log4jParamters_tDBClose_3.append("Parameters:");
							log4jParamters_tDBClose_3.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBClose_3.append(" | ");
							log4jParamters_tDBClose_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Close");
							log4jParamters_tDBClose_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_3 - " + (log4jParamters_tDBClose_3));
						}
					}
					new BytesLimit65535_tDBClose_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_3", "tDBClose_3", "tAS400Close");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_3 begin ] stop
				 */

				/**
				 * [tDBClose_3 main ] start
				 */

				currentComponent = "tDBClose_3";

				java.sql.Connection conn_tDBClose_3 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");
				if (conn_tDBClose_3 != null && !conn_tDBClose_3.isClosed()) {
					if (log.isDebugEnabled())
						log.debug("tDBClose_3 - " + ("Closing the connection ") + ("conn_tDBConnection_3")
								+ (" to the database."));
					conn_tDBClose_3.close();
					if (log.isDebugEnabled())
						log.debug("tDBClose_3 - " + ("Connection ") + ("conn_tDBConnection_3")
								+ (" to the database has closed."));
				}

				tos_count_tDBClose_3++;

				/**
				 * [tDBClose_3 main ] stop
				 */

				/**
				 * [tDBClose_3 process_data_begin ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 process_data_begin ] stop
				 */

				/**
				 * [tDBClose_3 process_data_end ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 process_data_end ] stop
				 */

				/**
				 * [tDBClose_3 end ] start
				 */

				currentComponent = "tDBClose_3";

				if (log.isDebugEnabled())
					log.debug("tDBClose_3 - " + ("Done."));

				ok_Hash.put("tDBClose_3", true);
				end_Hash.put("tDBClose_3", System.currentTimeMillis());

				/**
				 * [tDBClose_3 end ] stop
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
				 * [tDBClose_3 finally ] start
				 */

				currentComponent = "tDBClose_3";

				/**
				 * [tDBClose_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tDBClose_3_SUBPROCESS_STATE", 1);
	}

	public void tPrejob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tPrejob_2_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_2");
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
				 * [tPrejob_2 begin ] start
				 */

				ok_Hash.put("tPrejob_2", false);
				start_Hash.put("tPrejob_2", System.currentTimeMillis());

				currentComponent = "tPrejob_2";

				int tos_count_tPrejob_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tPrejob_2", "tPrejob_2", "tPrejob");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tPrejob_2 begin ] stop
				 */

				/**
				 * [tPrejob_2 main ] start
				 */

				currentComponent = "tPrejob_2";

				tos_count_tPrejob_2++;

				/**
				 * [tPrejob_2 main ] stop
				 */

				/**
				 * [tPrejob_2 process_data_begin ] start
				 */

				currentComponent = "tPrejob_2";

				/**
				 * [tPrejob_2 process_data_begin ] stop
				 */

				/**
				 * [tPrejob_2 process_data_end ] start
				 */

				currentComponent = "tPrejob_2";

				/**
				 * [tPrejob_2 process_data_end ] stop
				 */

				/**
				 * [tPrejob_2 end ] start
				 */

				currentComponent = "tPrejob_2";

				ok_Hash.put("tPrejob_2", true);
				end_Hash.put("tPrejob_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBConnection_2Process(globalMap);

				/**
				 * [tPrejob_2 end ] stop
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
				 * [tPrejob_2 finally ] start
				 */

				currentComponent = "tPrejob_2";

				/**
				 * [tPrejob_2 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tPrejob_2_SUBPROCESS_STATE", 1);
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

				props_tDBConnection_2.setValue("db", "PROD_DATA");

				props_tDBConnection_2.setValue("schemaName", "INVENTORY");

				props_tDBConnection_2.setValue("role", "SYSADMIN");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:9S28aa0eUAvP9ffL9vvjD3puMZ7zzRCFX1Yn02z7TFOY5ggh"));

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

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
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

				int tos_count_tDBConnection_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tDBConnection_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_3 = new StringBuilder();
							log4jParamters_tDBConnection_3.append("Parameters:");
							log4jParamters_tDBConnection_3.append("DB_VERSION" + " = " + "jt400_V6R1.jar");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("HOST" + " = " + "\"10.3.2.140\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("DBNAME" + " = " + "\"MM4R5LIB\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USER" + " = " + "\"sqletl\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:aH1yyQA59EIUkql73TqiLQaQvhMSt8EyOMFnD+yNHAfxIg==")
									.substring(0, 4) + "...");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Connection");
							log4jParamters_tDBConnection_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_3 - " + (log4jParamters_tDBConnection_3));
						}
					}
					new BytesLimit65535_tDBConnection_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_3", "tDBConnection_3", "tAS400Connection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_3 = "jdbc:as400://" + "10.3.2.140" + "/" + "MM4R5LIB" + ";" + "prompt=false";
				String dbUser_tDBConnection_3 = "sqletl";

				final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:gvXWMCmgF2jqO32lKTa8D/0ofuyrbMHwAiAaiO05gJMxow==");
				String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;

				java.sql.Connection conn_tDBConnection_3 = null;

				String driverClass_tDBConnection_3 = "com.ibm.as400.access.AS400JDBCDriver";
				java.lang.Class jdbcclazz_tDBConnection_3 = java.lang.Class.forName(driverClass_tDBConnection_3);
				globalMap.put("driverClass_tDBConnection_3", driverClass_tDBConnection_3);

				log.debug("tDBConnection_3 - Driver ClassName: " + driverClass_tDBConnection_3 + ".");

				log.debug("tDBConnection_3 - Connection attempt to '" + url_tDBConnection_3 + "' with the username '"
						+ dbUser_tDBConnection_3 + "'.");

				conn_tDBConnection_3 = java.sql.DriverManager.getConnection(url_tDBConnection_3, dbUser_tDBConnection_3,
						dbPwd_tDBConnection_3);
				log.debug("tDBConnection_3 - Connection to '" + url_tDBConnection_3 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_3", conn_tDBConnection_3);
				if (null != conn_tDBConnection_3) {

					log.debug("tDBConnection_3 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_3.setAutoCommit(false);
				}

				/**
				 * [tDBConnection_3 begin ] stop
				 */

				/**
				 * [tDBConnection_3 main ] start
				 */

				currentComponent = "tDBConnection_3";

				tos_count_tDBConnection_3++;

				/**
				 * [tDBConnection_3 main ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_3";

				/**
				 * [tDBConnection_3 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_end ] start
				 */

				currentComponent = "tDBConnection_3";

				/**
				 * [tDBConnection_3 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_3 end ] start
				 */

				currentComponent = "tDBConnection_3";

				if (log.isDebugEnabled())
					log.debug("tDBConnection_3 - " + ("Done."));

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
		final PRICE_DETAIL_BY_LOC_SKU_PRCDTL PRICE_DETAIL_BY_LOC_SKU_PRCDTLClass = new PRICE_DETAIL_BY_LOC_SKU_PRCDTL();

		int exitCode = PRICE_DETAIL_BY_LOC_SKU_PRCDTLClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'PRICE_DETAIL_BY_LOC_SKU_PRCDTL' - Done.");
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
		log.info("TalendJob: 'PRICE_DETAIL_BY_LOC_SKU_PRCDTL' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_LjBkwNm6EeuE0KkKg4NQQA");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-27T02:46:20.859127400Z");

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
			java.io.InputStream inContext = PRICE_DETAIL_BY_LOC_SKU_PRCDTL.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/price_detail_by_loc_sku_prcdtl_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = PRICE_DETAIL_BY_LOC_SKU_PRCDTL.class.getClassLoader()
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
		log.info("TalendJob: 'PRICE_DETAIL_BY_LOC_SKU_PRCDTL' - Started.");
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
			tPrejob_2Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPrejob_2) {
			globalMap.put("tPrejob_2_SUBPROCESS_STATE", -1);

			e_tPrejob_2.printStackTrace();

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
			tPostjob_2Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tPostjob_2) {
			globalMap.put("tPostjob_2_SUBPROCESS_STATE", -1);

			e_tPostjob_2.printStackTrace();

		}

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory)
					+ " bytes memory increase when running : PRICE_DETAIL_BY_LOC_SKU_PRCDTL");
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
		log.info("TalendJob: 'PRICE_DETAIL_BY_LOC_SKU_PRCDTL' - Finished - status: " + status + " returnCode: "
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
			obj_conn = globalMap.remove("conn_tDBConnection_3");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_3", globalMap.get("conn_tDBConnection_3"));

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
 * 442558 characters generated by Talend Cloud Data Management Platform on the
 * June 26, 2023 at 10:46:20 PM EDT
 ************************************************************************************************/