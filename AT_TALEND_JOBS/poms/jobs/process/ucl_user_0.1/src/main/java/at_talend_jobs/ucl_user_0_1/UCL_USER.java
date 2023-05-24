
package at_talend_jobs.ucl_user_0_1;

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
 * Job: UCL_USER Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class UCL_USER implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "UCL_USER.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(UCL_USER.class);

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

			if (database != null) {

				this.setProperty("database", database.toString());

			}

			if (host != null) {

				this.setProperty("host", host.toString());

			}

			if (login != null) {

				this.setProperty("login", login.toString());

			}

			if (password != null) {

				this.setProperty("password", password.toString());

			}

			if (port != null) {

				this.setProperty("port", port.toString());

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

		public String database;

		public String getDatabase() {
			return this.database;
		}

		public String host;

		public String getHost() {
			return this.host;
		}

		public String login;

		public String getLogin() {
			return this.login;
		}

		public java.lang.String password;

		public java.lang.String getPassword() {
			return this.password;
		}

		public String port;

		public String getPort() {
			return this.port;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "UCL_USER";
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
			"_W0chwPpBEe2DP7GCd0UsEw", "0.1");
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
					UCL_USER.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(UCL_USER.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBOutput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBInput_1_onSubJobError(Exception exception, String errorComponent,
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

	public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_UCL_USER = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_UCL_USER = new byte[0];

		public BigDecimal UCL_USER_ID;

		public BigDecimal getUCL_USER_ID() {
			return this.UCL_USER_ID;
		}

		public Boolean UCL_USER_IDIsNullable() {
			return false;
		}

		public Boolean UCL_USER_IDIsKey() {
			return false;
		}

		public Integer UCL_USER_IDLength() {
			return 18;
		}

		public Integer UCL_USER_IDPrecision() {
			return 0;
		}

		public String UCL_USER_IDDefault() {

			return "";

		}

		public String UCL_USER_IDComment() {

			return "";

		}

		public String UCL_USER_IDPattern() {

			return "";

		}

		public String UCL_USER_IDOriginalDbColumnName() {

			return "UCL_USER_ID";

		}

		public BigDecimal COMPANY_ID;

		public BigDecimal getCOMPANY_ID() {
			return this.COMPANY_ID;
		}

		public Boolean COMPANY_IDIsNullable() {
			return false;
		}

		public Boolean COMPANY_IDIsKey() {
			return false;
		}

		public Integer COMPANY_IDLength() {
			return 9;
		}

		public Integer COMPANY_IDPrecision() {
			return 0;
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

		public String USER_NAME;

		public String getUSER_NAME() {
			return this.USER_NAME;
		}

		public Boolean USER_NAMEIsNullable() {
			return false;
		}

		public Boolean USER_NAMEIsKey() {
			return false;
		}

		public Integer USER_NAMELength() {
			return 50;
		}

		public Integer USER_NAMEPrecision() {
			return 0;
		}

		public String USER_NAMEDefault() {

			return null;

		}

		public String USER_NAMEComment() {

			return "";

		}

		public String USER_NAMEPattern() {

			return "";

		}

		public String USER_NAMEOriginalDbColumnName() {

			return "USER_NAME";

		}

		public String USER_PASSWORD;

		public String getUSER_PASSWORD() {
			return this.USER_PASSWORD;
		}

		public Boolean USER_PASSWORDIsNullable() {
			return false;
		}

		public Boolean USER_PASSWORDIsKey() {
			return false;
		}

		public Integer USER_PASSWORDLength() {
			return 255;
		}

		public Integer USER_PASSWORDPrecision() {
			return 0;
		}

		public String USER_PASSWORDDefault() {

			return null;

		}

		public String USER_PASSWORDComment() {

			return "";

		}

		public String USER_PASSWORDPattern() {

			return "";

		}

		public String USER_PASSWORDOriginalDbColumnName() {

			return "USER_PASSWORD";

		}

		public BigDecimal IS_ACTIVE;

		public BigDecimal getIS_ACTIVE() {
			return this.IS_ACTIVE;
		}

		public Boolean IS_ACTIVEIsNullable() {
			return false;
		}

		public Boolean IS_ACTIVEIsKey() {
			return false;
		}

		public Integer IS_ACTIVELength() {
			return 4;
		}

		public Integer IS_ACTIVEPrecision() {
			return 0;
		}

		public String IS_ACTIVEDefault() {

			return "";

		}

		public String IS_ACTIVEComment() {

			return "";

		}

		public String IS_ACTIVEPattern() {

			return "";

		}

		public String IS_ACTIVEOriginalDbColumnName() {

			return "IS_ACTIVE";

		}

		public BigDecimal CREATED_SOURCE_TYPE_ID;

		public BigDecimal getCREATED_SOURCE_TYPE_ID() {
			return this.CREATED_SOURCE_TYPE_ID;
		}

		public Boolean CREATED_SOURCE_TYPE_IDIsNullable() {
			return false;
		}

		public Boolean CREATED_SOURCE_TYPE_IDIsKey() {
			return false;
		}

		public Integer CREATED_SOURCE_TYPE_IDLength() {
			return 4;
		}

		public Integer CREATED_SOURCE_TYPE_IDPrecision() {
			return 0;
		}

		public String CREATED_SOURCE_TYPE_IDDefault() {

			return "";

		}

		public String CREATED_SOURCE_TYPE_IDComment() {

			return "";

		}

		public String CREATED_SOURCE_TYPE_IDPattern() {

			return "";

		}

		public String CREATED_SOURCE_TYPE_IDOriginalDbColumnName() {

			return "CREATED_SOURCE_TYPE_ID";

		}

		public String CREATED_SOURCE;

		public String getCREATED_SOURCE() {
			return this.CREATED_SOURCE;
		}

		public Boolean CREATED_SOURCEIsNullable() {
			return false;
		}

		public Boolean CREATED_SOURCEIsKey() {
			return false;
		}

		public Integer CREATED_SOURCELength() {
			return 50;
		}

		public Integer CREATED_SOURCEPrecision() {
			return 0;
		}

		public String CREATED_SOURCEDefault() {

			return null;

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

		public java.util.Date CREATED_DTTM;

		public java.util.Date getCREATED_DTTM() {
			return this.CREATED_DTTM;
		}

		public Boolean CREATED_DTTMIsNullable() {
			return false;
		}

		public Boolean CREATED_DTTMIsKey() {
			return false;
		}

		public Integer CREATED_DTTMLength() {
			return 0;
		}

		public Integer CREATED_DTTMPrecision() {
			return 6;
		}

		public String CREATED_DTTMDefault() {

			return null;

		}

		public String CREATED_DTTMComment() {

			return "";

		}

		public String CREATED_DTTMPattern() {

			return "yyyy-MM-dd HH:mm:ss";

		}

		public String CREATED_DTTMOriginalDbColumnName() {

			return "CREATED_DTTM";

		}

		public BigDecimal LAST_UPDATED_SOURCE_TYPE_ID;

		public BigDecimal getLAST_UPDATED_SOURCE_TYPE_ID() {
			return this.LAST_UPDATED_SOURCE_TYPE_ID;
		}

		public Boolean LAST_UPDATED_SOURCE_TYPE_IDIsNullable() {
			return false;
		}

		public Boolean LAST_UPDATED_SOURCE_TYPE_IDIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_SOURCE_TYPE_IDLength() {
			return 4;
		}

		public Integer LAST_UPDATED_SOURCE_TYPE_IDPrecision() {
			return 0;
		}

		public String LAST_UPDATED_SOURCE_TYPE_IDDefault() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPE_IDComment() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPE_IDPattern() {

			return "";

		}

		public String LAST_UPDATED_SOURCE_TYPE_IDOriginalDbColumnName() {

			return "LAST_UPDATED_SOURCE_TYPE_ID";

		}

		public String LAST_UPDATED_SOURCE;

		public String getLAST_UPDATED_SOURCE() {
			return this.LAST_UPDATED_SOURCE;
		}

		public Boolean LAST_UPDATED_SOURCEIsNullable() {
			return false;
		}

		public Boolean LAST_UPDATED_SOURCEIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_SOURCELength() {
			return 50;
		}

		public Integer LAST_UPDATED_SOURCEPrecision() {
			return 0;
		}

		public String LAST_UPDATED_SOURCEDefault() {

			return null;

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
			return false;
		}

		public Boolean LAST_UPDATED_DTTMIsKey() {
			return false;
		}

		public Integer LAST_UPDATED_DTTMLength() {
			return 0;
		}

		public Integer LAST_UPDATED_DTTMPrecision() {
			return 6;
		}

		public String LAST_UPDATED_DTTMDefault() {

			return null;

		}

		public String LAST_UPDATED_DTTMComment() {

			return "";

		}

		public String LAST_UPDATED_DTTMPattern() {

			return "yyyy-MM-dd HH:mm:ss";

		}

		public String LAST_UPDATED_DTTMOriginalDbColumnName() {

			return "LAST_UPDATED_DTTM";

		}

		public BigDecimal USER_TYPE_ID;

		public BigDecimal getUSER_TYPE_ID() {
			return this.USER_TYPE_ID;
		}

		public Boolean USER_TYPE_IDIsNullable() {
			return false;
		}

		public Boolean USER_TYPE_IDIsKey() {
			return false;
		}

		public Integer USER_TYPE_IDLength() {
			return 4;
		}

		public Integer USER_TYPE_IDPrecision() {
			return 0;
		}

		public String USER_TYPE_IDDefault() {

			return "";

		}

		public String USER_TYPE_IDComment() {

			return "";

		}

		public String USER_TYPE_IDPattern() {

			return "";

		}

		public String USER_TYPE_IDOriginalDbColumnName() {

			return "USER_TYPE_ID";

		}

		public BigDecimal LOCALE_ID;

		public BigDecimal getLOCALE_ID() {
			return this.LOCALE_ID;
		}

		public Boolean LOCALE_IDIsNullable() {
			return false;
		}

		public Boolean LOCALE_IDIsKey() {
			return false;
		}

		public Integer LOCALE_IDLength() {
			return 4;
		}

		public Integer LOCALE_IDPrecision() {
			return 0;
		}

		public String LOCALE_IDDefault() {

			return "";

		}

		public String LOCALE_IDComment() {

			return "";

		}

		public String LOCALE_IDPattern() {

			return "";

		}

		public String LOCALE_IDOriginalDbColumnName() {

			return "LOCALE_ID";

		}

		public BigDecimal LOCATION_ID;

		public BigDecimal getLOCATION_ID() {
			return this.LOCATION_ID;
		}

		public Boolean LOCATION_IDIsNullable() {
			return false;
		}

		public Boolean LOCATION_IDIsKey() {
			return false;
		}

		public Integer LOCATION_IDLength() {
			return 18;
		}

		public Integer LOCATION_IDPrecision() {
			return 0;
		}

		public String LOCATION_IDDefault() {

			return "";

		}

		public String LOCATION_IDComment() {

			return "";

		}

		public String LOCATION_IDPattern() {

			return "";

		}

		public String LOCATION_IDOriginalDbColumnName() {

			return "LOCATION_ID";

		}

		public String USER_FIRST_NAME;

		public String getUSER_FIRST_NAME() {
			return this.USER_FIRST_NAME;
		}

		public Boolean USER_FIRST_NAMEIsNullable() {
			return true;
		}

		public Boolean USER_FIRST_NAMEIsKey() {
			return false;
		}

		public Integer USER_FIRST_NAMELength() {
			return 50;
		}

		public Integer USER_FIRST_NAMEPrecision() {
			return 0;
		}

		public String USER_FIRST_NAMEDefault() {

			return null;

		}

		public String USER_FIRST_NAMEComment() {

			return "";

		}

		public String USER_FIRST_NAMEPattern() {

			return "";

		}

		public String USER_FIRST_NAMEOriginalDbColumnName() {

			return "USER_FIRST_NAME";

		}

		public String USER_MIDDLE_NAME;

		public String getUSER_MIDDLE_NAME() {
			return this.USER_MIDDLE_NAME;
		}

		public Boolean USER_MIDDLE_NAMEIsNullable() {
			return true;
		}

		public Boolean USER_MIDDLE_NAMEIsKey() {
			return false;
		}

		public Integer USER_MIDDLE_NAMELength() {
			return 50;
		}

		public Integer USER_MIDDLE_NAMEPrecision() {
			return 0;
		}

		public String USER_MIDDLE_NAMEDefault() {

			return null;

		}

		public String USER_MIDDLE_NAMEComment() {

			return "";

		}

		public String USER_MIDDLE_NAMEPattern() {

			return "";

		}

		public String USER_MIDDLE_NAMEOriginalDbColumnName() {

			return "USER_MIDDLE_NAME";

		}

		public String USER_LAST_NAME;

		public String getUSER_LAST_NAME() {
			return this.USER_LAST_NAME;
		}

		public Boolean USER_LAST_NAMEIsNullable() {
			return true;
		}

		public Boolean USER_LAST_NAMEIsKey() {
			return false;
		}

		public Integer USER_LAST_NAMELength() {
			return 50;
		}

		public Integer USER_LAST_NAMEPrecision() {
			return 0;
		}

		public String USER_LAST_NAMEDefault() {

			return null;

		}

		public String USER_LAST_NAMEComment() {

			return "";

		}

		public String USER_LAST_NAMEPattern() {

			return "";

		}

		public String USER_LAST_NAMEOriginalDbColumnName() {

			return "USER_LAST_NAME";

		}

		public String USER_PREFIX;

		public String getUSER_PREFIX() {
			return this.USER_PREFIX;
		}

		public Boolean USER_PREFIXIsNullable() {
			return true;
		}

		public Boolean USER_PREFIXIsKey() {
			return false;
		}

		public Integer USER_PREFIXLength() {
			return 16;
		}

		public Integer USER_PREFIXPrecision() {
			return 0;
		}

		public String USER_PREFIXDefault() {

			return null;

		}

		public String USER_PREFIXComment() {

			return "";

		}

		public String USER_PREFIXPattern() {

			return "";

		}

		public String USER_PREFIXOriginalDbColumnName() {

			return "USER_PREFIX";

		}

		public String USER_TITLE;

		public String getUSER_TITLE() {
			return this.USER_TITLE;
		}

		public Boolean USER_TITLEIsNullable() {
			return true;
		}

		public Boolean USER_TITLEIsKey() {
			return false;
		}

		public Integer USER_TITLELength() {
			return 50;
		}

		public Integer USER_TITLEPrecision() {
			return 0;
		}

		public String USER_TITLEDefault() {

			return null;

		}

		public String USER_TITLEComment() {

			return "";

		}

		public String USER_TITLEPattern() {

			return "";

		}

		public String USER_TITLEOriginalDbColumnName() {

			return "USER_TITLE";

		}

		public String TELEPHONE_NUMBER;

		public String getTELEPHONE_NUMBER() {
			return this.TELEPHONE_NUMBER;
		}

		public Boolean TELEPHONE_NUMBERIsNullable() {
			return true;
		}

		public Boolean TELEPHONE_NUMBERIsKey() {
			return false;
		}

		public Integer TELEPHONE_NUMBERLength() {
			return 32;
		}

		public Integer TELEPHONE_NUMBERPrecision() {
			return 0;
		}

		public String TELEPHONE_NUMBERDefault() {

			return null;

		}

		public String TELEPHONE_NUMBERComment() {

			return "";

		}

		public String TELEPHONE_NUMBERPattern() {

			return "";

		}

		public String TELEPHONE_NUMBEROriginalDbColumnName() {

			return "TELEPHONE_NUMBER";

		}

		public String FAX_NUMBER;

		public String getFAX_NUMBER() {
			return this.FAX_NUMBER;
		}

		public Boolean FAX_NUMBERIsNullable() {
			return true;
		}

		public Boolean FAX_NUMBERIsKey() {
			return false;
		}

		public Integer FAX_NUMBERLength() {
			return 32;
		}

		public Integer FAX_NUMBERPrecision() {
			return 0;
		}

		public String FAX_NUMBERDefault() {

			return null;

		}

		public String FAX_NUMBERComment() {

			return "";

		}

		public String FAX_NUMBERPattern() {

			return "";

		}

		public String FAX_NUMBEROriginalDbColumnName() {

			return "FAX_NUMBER";

		}

		public String ADDRESS_1;

		public String getADDRESS_1() {
			return this.ADDRESS_1;
		}

		public Boolean ADDRESS_1IsNullable() {
			return true;
		}

		public Boolean ADDRESS_1IsKey() {
			return false;
		}

		public Integer ADDRESS_1Length() {
			return 75;
		}

		public Integer ADDRESS_1Precision() {
			return 0;
		}

		public String ADDRESS_1Default() {

			return null;

		}

		public String ADDRESS_1Comment() {

			return "";

		}

		public String ADDRESS_1Pattern() {

			return "";

		}

		public String ADDRESS_1OriginalDbColumnName() {

			return "ADDRESS_1";

		}

		public String ADDRESS_2;

		public String getADDRESS_2() {
			return this.ADDRESS_2;
		}

		public Boolean ADDRESS_2IsNullable() {
			return true;
		}

		public Boolean ADDRESS_2IsKey() {
			return false;
		}

		public Integer ADDRESS_2Length() {
			return 75;
		}

		public Integer ADDRESS_2Precision() {
			return 0;
		}

		public String ADDRESS_2Default() {

			return null;

		}

		public String ADDRESS_2Comment() {

			return "";

		}

		public String ADDRESS_2Pattern() {

			return "";

		}

		public String ADDRESS_2OriginalDbColumnName() {

			return "ADDRESS_2";

		}

		public String CITY;

		public String getCITY() {
			return this.CITY;
		}

		public Boolean CITYIsNullable() {
			return true;
		}

		public Boolean CITYIsKey() {
			return false;
		}

		public Integer CITYLength() {
			return 50;
		}

		public Integer CITYPrecision() {
			return 0;
		}

		public String CITYDefault() {

			return null;

		}

		public String CITYComment() {

			return "";

		}

		public String CITYPattern() {

			return "";

		}

		public String CITYOriginalDbColumnName() {

			return "CITY";

		}

		public String STATE_PROV_CODE;

		public String getSTATE_PROV_CODE() {
			return this.STATE_PROV_CODE;
		}

		public Boolean STATE_PROV_CODEIsNullable() {
			return true;
		}

		public Boolean STATE_PROV_CODEIsKey() {
			return false;
		}

		public Integer STATE_PROV_CODELength() {
			return 4;
		}

		public Integer STATE_PROV_CODEPrecision() {
			return 0;
		}

		public String STATE_PROV_CODEDefault() {

			return null;

		}

		public String STATE_PROV_CODEComment() {

			return "";

		}

		public String STATE_PROV_CODEPattern() {

			return "";

		}

		public String STATE_PROV_CODEOriginalDbColumnName() {

			return "STATE_PROV_CODE";

		}

		public String POSTAL_CODE;

		public String getPOSTAL_CODE() {
			return this.POSTAL_CODE;
		}

		public Boolean POSTAL_CODEIsNullable() {
			return true;
		}

		public Boolean POSTAL_CODEIsKey() {
			return false;
		}

		public Integer POSTAL_CODELength() {
			return 10;
		}

		public Integer POSTAL_CODEPrecision() {
			return 0;
		}

		public String POSTAL_CODEDefault() {

			return null;

		}

		public String POSTAL_CODEComment() {

			return "";

		}

		public String POSTAL_CODEPattern() {

			return "";

		}

		public String POSTAL_CODEOriginalDbColumnName() {

			return "POSTAL_CODE";

		}

		public String COUNTRY_CODE;

		public String getCOUNTRY_CODE() {
			return this.COUNTRY_CODE;
		}

		public Boolean COUNTRY_CODEIsNullable() {
			return true;
		}

		public Boolean COUNTRY_CODEIsKey() {
			return false;
		}

		public Integer COUNTRY_CODELength() {
			return 4;
		}

		public Integer COUNTRY_CODEPrecision() {
			return 0;
		}

		public String COUNTRY_CODEDefault() {

			return null;

		}

		public String COUNTRY_CODEComment() {

			return "";

		}

		public String COUNTRY_CODEPattern() {

			return "";

		}

		public String COUNTRY_CODEOriginalDbColumnName() {

			return "COUNTRY_CODE";

		}

		public String USER_EMAIL_1;

		public String getUSER_EMAIL_1() {
			return this.USER_EMAIL_1;
		}

		public Boolean USER_EMAIL_1IsNullable() {
			return true;
		}

		public Boolean USER_EMAIL_1IsKey() {
			return false;
		}

		public Integer USER_EMAIL_1Length() {
			return 75;
		}

		public Integer USER_EMAIL_1Precision() {
			return 0;
		}

		public String USER_EMAIL_1Default() {

			return null;

		}

		public String USER_EMAIL_1Comment() {

			return "";

		}

		public String USER_EMAIL_1Pattern() {

			return "";

		}

		public String USER_EMAIL_1OriginalDbColumnName() {

			return "USER_EMAIL_1";

		}

		public String USER_EMAIL_2;

		public String getUSER_EMAIL_2() {
			return this.USER_EMAIL_2;
		}

		public Boolean USER_EMAIL_2IsNullable() {
			return true;
		}

		public Boolean USER_EMAIL_2IsKey() {
			return false;
		}

		public Integer USER_EMAIL_2Length() {
			return 75;
		}

		public Integer USER_EMAIL_2Precision() {
			return 0;
		}

		public String USER_EMAIL_2Default() {

			return null;

		}

		public String USER_EMAIL_2Comment() {

			return "";

		}

		public String USER_EMAIL_2Pattern() {

			return "";

		}

		public String USER_EMAIL_2OriginalDbColumnName() {

			return "USER_EMAIL_2";

		}

		public BigDecimal COMM_METHOD_ID_DURING_BH_1;

		public BigDecimal getCOMM_METHOD_ID_DURING_BH_1() {
			return this.COMM_METHOD_ID_DURING_BH_1;
		}

		public Boolean COMM_METHOD_ID_DURING_BH_1IsNullable() {
			return true;
		}

		public Boolean COMM_METHOD_ID_DURING_BH_1IsKey() {
			return false;
		}

		public Integer COMM_METHOD_ID_DURING_BH_1Length() {
			return 4;
		}

		public Integer COMM_METHOD_ID_DURING_BH_1Precision() {
			return 0;
		}

		public String COMM_METHOD_ID_DURING_BH_1Default() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_1Comment() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_1Pattern() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_1OriginalDbColumnName() {

			return "COMM_METHOD_ID_DURING_BH_1";

		}

		public BigDecimal COMM_METHOD_ID_DURING_BH_2;

		public BigDecimal getCOMM_METHOD_ID_DURING_BH_2() {
			return this.COMM_METHOD_ID_DURING_BH_2;
		}

		public Boolean COMM_METHOD_ID_DURING_BH_2IsNullable() {
			return true;
		}

		public Boolean COMM_METHOD_ID_DURING_BH_2IsKey() {
			return false;
		}

		public Integer COMM_METHOD_ID_DURING_BH_2Length() {
			return 4;
		}

		public Integer COMM_METHOD_ID_DURING_BH_2Precision() {
			return 0;
		}

		public String COMM_METHOD_ID_DURING_BH_2Default() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_2Comment() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_2Pattern() {

			return "";

		}

		public String COMM_METHOD_ID_DURING_BH_2OriginalDbColumnName() {

			return "COMM_METHOD_ID_DURING_BH_2";

		}

		public BigDecimal COMM_METHOD_ID_AFTER_BH_1;

		public BigDecimal getCOMM_METHOD_ID_AFTER_BH_1() {
			return this.COMM_METHOD_ID_AFTER_BH_1;
		}

		public Boolean COMM_METHOD_ID_AFTER_BH_1IsNullable() {
			return true;
		}

		public Boolean COMM_METHOD_ID_AFTER_BH_1IsKey() {
			return false;
		}

		public Integer COMM_METHOD_ID_AFTER_BH_1Length() {
			return 4;
		}

		public Integer COMM_METHOD_ID_AFTER_BH_1Precision() {
			return 0;
		}

		public String COMM_METHOD_ID_AFTER_BH_1Default() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_1Comment() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_1Pattern() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_1OriginalDbColumnName() {

			return "COMM_METHOD_ID_AFTER_BH_1";

		}

		public BigDecimal COMM_METHOD_ID_AFTER_BH_2;

		public BigDecimal getCOMM_METHOD_ID_AFTER_BH_2() {
			return this.COMM_METHOD_ID_AFTER_BH_2;
		}

		public Boolean COMM_METHOD_ID_AFTER_BH_2IsNullable() {
			return true;
		}

		public Boolean COMM_METHOD_ID_AFTER_BH_2IsKey() {
			return false;
		}

		public Integer COMM_METHOD_ID_AFTER_BH_2Length() {
			return 4;
		}

		public Integer COMM_METHOD_ID_AFTER_BH_2Precision() {
			return 0;
		}

		public String COMM_METHOD_ID_AFTER_BH_2Default() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_2Comment() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_2Pattern() {

			return "";

		}

		public String COMM_METHOD_ID_AFTER_BH_2OriginalDbColumnName() {

			return "COMM_METHOD_ID_AFTER_BH_2";

		}

		public String COMMON_NAME;

		public String getCOMMON_NAME() {
			return this.COMMON_NAME;
		}

		public Boolean COMMON_NAMEIsNullable() {
			return false;
		}

		public Boolean COMMON_NAMEIsKey() {
			return false;
		}

		public Integer COMMON_NAMELength() {
			return 100;
		}

		public Integer COMMON_NAMEPrecision() {
			return 0;
		}

		public String COMMON_NAMEDefault() {

			return null;

		}

		public String COMMON_NAMEComment() {

			return "";

		}

		public String COMMON_NAMEPattern() {

			return "";

		}

		public String COMMON_NAMEOriginalDbColumnName() {

			return "COMMON_NAME";

		}

		public java.util.Date LAST_PASSWORD_CHANGE_DTTM;

		public java.util.Date getLAST_PASSWORD_CHANGE_DTTM() {
			return this.LAST_PASSWORD_CHANGE_DTTM;
		}

		public Boolean LAST_PASSWORD_CHANGE_DTTMIsNullable() {
			return true;
		}

		public Boolean LAST_PASSWORD_CHANGE_DTTMIsKey() {
			return false;
		}

		public Integer LAST_PASSWORD_CHANGE_DTTMLength() {
			return 0;
		}

		public Integer LAST_PASSWORD_CHANGE_DTTMPrecision() {
			return 0;
		}

		public String LAST_PASSWORD_CHANGE_DTTMDefault() {

			return null;

		}

		public String LAST_PASSWORD_CHANGE_DTTMComment() {

			return "";

		}

		public String LAST_PASSWORD_CHANGE_DTTMPattern() {

			return "yyyy-MM-dd";

		}

		public String LAST_PASSWORD_CHANGE_DTTMOriginalDbColumnName() {

			return "LAST_PASSWORD_CHANGE_DTTM";

		}

		public BigDecimal LOGGED_IN;

		public BigDecimal getLOGGED_IN() {
			return this.LOGGED_IN;
		}

		public Boolean LOGGED_INIsNullable() {
			return true;
		}

		public Boolean LOGGED_INIsKey() {
			return false;
		}

		public Integer LOGGED_INLength() {
			return 9;
		}

		public Integer LOGGED_INPrecision() {
			return 0;
		}

		public String LOGGED_INDefault() {

			return "";

		}

		public String LOGGED_INComment() {

			return "";

		}

		public String LOGGED_INPattern() {

			return "";

		}

		public String LOGGED_INOriginalDbColumnName() {

			return "LOGGED_IN";

		}

		public java.util.Date LAST_LOGIN_DTTM;

		public java.util.Date getLAST_LOGIN_DTTM() {
			return this.LAST_LOGIN_DTTM;
		}

		public Boolean LAST_LOGIN_DTTMIsNullable() {
			return true;
		}

		public Boolean LAST_LOGIN_DTTMIsKey() {
			return false;
		}

		public Integer LAST_LOGIN_DTTMLength() {
			return 0;
		}

		public Integer LAST_LOGIN_DTTMPrecision() {
			return 0;
		}

		public String LAST_LOGIN_DTTMDefault() {

			return null;

		}

		public String LAST_LOGIN_DTTMComment() {

			return "";

		}

		public String LAST_LOGIN_DTTMPattern() {

			return "yyyy-MM-dd";

		}

		public String LAST_LOGIN_DTTMOriginalDbColumnName() {

			return "LAST_LOGIN_DTTM";

		}

		public BigDecimal DEFAULT_BUSINESS_UNIT_ID;

		public BigDecimal getDEFAULT_BUSINESS_UNIT_ID() {
			return this.DEFAULT_BUSINESS_UNIT_ID;
		}

		public Boolean DEFAULT_BUSINESS_UNIT_IDIsNullable() {
			return false;
		}

		public Boolean DEFAULT_BUSINESS_UNIT_IDIsKey() {
			return false;
		}

		public Integer DEFAULT_BUSINESS_UNIT_IDLength() {
			return 9;
		}

		public Integer DEFAULT_BUSINESS_UNIT_IDPrecision() {
			return 0;
		}

		public String DEFAULT_BUSINESS_UNIT_IDDefault() {

			return "";

		}

		public String DEFAULT_BUSINESS_UNIT_IDComment() {

			return "";

		}

		public String DEFAULT_BUSINESS_UNIT_IDPattern() {

			return "";

		}

		public String DEFAULT_BUSINESS_UNIT_IDOriginalDbColumnName() {

			return "DEFAULT_BUSINESS_UNIT_ID";

		}

		public BigDecimal DEFAULT_WHSE_REGION_ID;

		public BigDecimal getDEFAULT_WHSE_REGION_ID() {
			return this.DEFAULT_WHSE_REGION_ID;
		}

		public Boolean DEFAULT_WHSE_REGION_IDIsNullable() {
			return false;
		}

		public Boolean DEFAULT_WHSE_REGION_IDIsKey() {
			return false;
		}

		public Integer DEFAULT_WHSE_REGION_IDLength() {
			return 9;
		}

		public Integer DEFAULT_WHSE_REGION_IDPrecision() {
			return 0;
		}

		public String DEFAULT_WHSE_REGION_IDDefault() {

			return "";

		}

		public String DEFAULT_WHSE_REGION_IDComment() {

			return "";

		}

		public String DEFAULT_WHSE_REGION_IDPattern() {

			return "";

		}

		public String DEFAULT_WHSE_REGION_IDOriginalDbColumnName() {

			return "DEFAULT_WHSE_REGION_ID";

		}

		public BigDecimal CHANNEL_ID;

		public BigDecimal getCHANNEL_ID() {
			return this.CHANNEL_ID;
		}

		public Boolean CHANNEL_IDIsNullable() {
			return true;
		}

		public Boolean CHANNEL_IDIsKey() {
			return false;
		}

		public Integer CHANNEL_IDLength() {
			return 18;
		}

		public Integer CHANNEL_IDPrecision() {
			return 0;
		}

		public String CHANNEL_IDDefault() {

			return "";

		}

		public String CHANNEL_IDComment() {

			return "";

		}

		public String CHANNEL_IDPattern() {

			return "";

		}

		public String CHANNEL_IDOriginalDbColumnName() {

			return "CHANNEL_ID";

		}

		public BigDecimal HIBERNATE_VERSION;

		public BigDecimal getHIBERNATE_VERSION() {
			return this.HIBERNATE_VERSION;
		}

		public Boolean HIBERNATE_VERSIONIsNullable() {
			return true;
		}

		public Boolean HIBERNATE_VERSIONIsKey() {
			return false;
		}

		public Integer HIBERNATE_VERSIONLength() {
			return 10;
		}

		public Integer HIBERNATE_VERSIONPrecision() {
			return 0;
		}

		public String HIBERNATE_VERSIONDefault() {

			return "";

		}

		public String HIBERNATE_VERSIONComment() {

			return "";

		}

		public String HIBERNATE_VERSIONPattern() {

			return "";

		}

		public String HIBERNATE_VERSIONOriginalDbColumnName() {

			return "HIBERNATE_VERSION";

		}

		public BigDecimal NUMBER_OF_INVALID_LOGINS;

		public BigDecimal getNUMBER_OF_INVALID_LOGINS() {
			return this.NUMBER_OF_INVALID_LOGINS;
		}

		public Boolean NUMBER_OF_INVALID_LOGINSIsNullable() {
			return true;
		}

		public Boolean NUMBER_OF_INVALID_LOGINSIsKey() {
			return false;
		}

		public Integer NUMBER_OF_INVALID_LOGINSLength() {
			return 4;
		}

		public Integer NUMBER_OF_INVALID_LOGINSPrecision() {
			return 0;
		}

		public String NUMBER_OF_INVALID_LOGINSDefault() {

			return "";

		}

		public String NUMBER_OF_INVALID_LOGINSComment() {

			return "";

		}

		public String NUMBER_OF_INVALID_LOGINSPattern() {

			return "";

		}

		public String NUMBER_OF_INVALID_LOGINSOriginalDbColumnName() {

			return "NUMBER_OF_INVALID_LOGINS";

		}

		public String TAX_ID_NBR;

		public String getTAX_ID_NBR() {
			return this.TAX_ID_NBR;
		}

		public Boolean TAX_ID_NBRIsNullable() {
			return true;
		}

		public Boolean TAX_ID_NBRIsKey() {
			return false;
		}

		public Integer TAX_ID_NBRLength() {
			return 15;
		}

		public Integer TAX_ID_NBRPrecision() {
			return 0;
		}

		public String TAX_ID_NBRDefault() {

			return null;

		}

		public String TAX_ID_NBRComment() {

			return "";

		}

		public String TAX_ID_NBRPattern() {

			return "";

		}

		public String TAX_ID_NBROriginalDbColumnName() {

			return "TAX_ID_NBR";

		}

		public java.util.Date EMP_START_DATE;

		public java.util.Date getEMP_START_DATE() {
			return this.EMP_START_DATE;
		}

		public Boolean EMP_START_DATEIsNullable() {
			return true;
		}

		public Boolean EMP_START_DATEIsKey() {
			return false;
		}

		public Integer EMP_START_DATELength() {
			return 0;
		}

		public Integer EMP_START_DATEPrecision() {
			return 0;
		}

		public String EMP_START_DATEDefault() {

			return null;

		}

		public String EMP_START_DATEComment() {

			return "";

		}

		public String EMP_START_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String EMP_START_DATEOriginalDbColumnName() {

			return "EMP_START_DATE";

		}

		public java.util.Date BIRTH_DATE;

		public java.util.Date getBIRTH_DATE() {
			return this.BIRTH_DATE;
		}

		public Boolean BIRTH_DATEIsNullable() {
			return true;
		}

		public Boolean BIRTH_DATEIsKey() {
			return false;
		}

		public Integer BIRTH_DATELength() {
			return 0;
		}

		public Integer BIRTH_DATEPrecision() {
			return 0;
		}

		public String BIRTH_DATEDefault() {

			return null;

		}

		public String BIRTH_DATEComment() {

			return "";

		}

		public String BIRTH_DATEPattern() {

			return "yyyy-MM-dd";

		}

		public String BIRTH_DATEOriginalDbColumnName() {

			return "BIRTH_DATE";

		}

		public String GENDER_ID;

		public String getGENDER_ID() {
			return this.GENDER_ID;
		}

		public Boolean GENDER_IDIsNullable() {
			return true;
		}

		public Boolean GENDER_IDIsKey() {
			return false;
		}

		public Integer GENDER_IDLength() {
			return 1;
		}

		public Integer GENDER_IDPrecision() {
			return 0;
		}

		public String GENDER_IDDefault() {

			return null;

		}

		public String GENDER_IDComment() {

			return "";

		}

		public String GENDER_IDPattern() {

			return "";

		}

		public String GENDER_IDOriginalDbColumnName() {

			return "GENDER_ID";

		}

		public java.util.Date PASSWORD_RESET_DATE_TIME;

		public java.util.Date getPASSWORD_RESET_DATE_TIME() {
			return this.PASSWORD_RESET_DATE_TIME;
		}

		public Boolean PASSWORD_RESET_DATE_TIMEIsNullable() {
			return true;
		}

		public Boolean PASSWORD_RESET_DATE_TIMEIsKey() {
			return false;
		}

		public Integer PASSWORD_RESET_DATE_TIMELength() {
			return 0;
		}

		public Integer PASSWORD_RESET_DATE_TIMEPrecision() {
			return 6;
		}

		public String PASSWORD_RESET_DATE_TIMEDefault() {

			return null;

		}

		public String PASSWORD_RESET_DATE_TIMEComment() {

			return "";

		}

		public String PASSWORD_RESET_DATE_TIMEPattern() {

			return "yyyy-MM-dd HH:mm:ss";

		}

		public String PASSWORD_RESET_DATE_TIMEOriginalDbColumnName() {

			return "PASSWORD_RESET_DATE_TIME";

		}

		public String PASSWORD_TOKEN;

		public String getPASSWORD_TOKEN() {
			return this.PASSWORD_TOKEN;
		}

		public Boolean PASSWORD_TOKENIsNullable() {
			return true;
		}

		public Boolean PASSWORD_TOKENIsKey() {
			return false;
		}

		public Integer PASSWORD_TOKENLength() {
			return 255;
		}

		public Integer PASSWORD_TOKENPrecision() {
			return 0;
		}

		public String PASSWORD_TOKENDefault() {

			return null;

		}

		public String PASSWORD_TOKENComment() {

			return "";

		}

		public String PASSWORD_TOKENPattern() {

			return "";

		}

		public String PASSWORD_TOKENOriginalDbColumnName() {

			return "PASSWORD_TOKEN";

		}

		public BigDecimal ISPASSWORDMANAGEDINTERNALLY;

		public BigDecimal getISPASSWORDMANAGEDINTERNALLY() {
			return this.ISPASSWORDMANAGEDINTERNALLY;
		}

		public Boolean ISPASSWORDMANAGEDINTERNALLYIsNullable() {
			return false;
		}

		public Boolean ISPASSWORDMANAGEDINTERNALLYIsKey() {
			return false;
		}

		public Integer ISPASSWORDMANAGEDINTERNALLYLength() {
			return 1;
		}

		public Integer ISPASSWORDMANAGEDINTERNALLYPrecision() {
			return 0;
		}

		public String ISPASSWORDMANAGEDINTERNALLYDefault() {

			return "";

		}

		public String ISPASSWORDMANAGEDINTERNALLYComment() {

			return "";

		}

		public String ISPASSWORDMANAGEDINTERNALLYPattern() {

			return "";

		}

		public String ISPASSWORDMANAGEDINTERNALLYOriginalDbColumnName() {

			return "ISPASSWORDMANAGEDINTERNALLY";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_UCL_USER.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_UCL_USER.length == 0) {
						commonByteArray_AT_TALEND_JOBS_UCL_USER = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_UCL_USER = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_UCL_USER, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_UCL_USER, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_UCL_USER.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_UCL_USER.length == 0) {
						commonByteArray_AT_TALEND_JOBS_UCL_USER = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_UCL_USER = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_UCL_USER, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_UCL_USER, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_UCL_USER) {

				try {

					int length = 0;

					this.UCL_USER_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.USER_NAME = readString(dis);

					this.USER_PASSWORD = readString(dis);

					this.IS_ACTIVE = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE_TYPE_ID = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE = readString(dis);

					this.CREATED_DTTM = readDate(dis);

					this.LAST_UPDATED_SOURCE_TYPE_ID = (BigDecimal) dis.readObject();

					this.LAST_UPDATED_SOURCE = readString(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

					this.USER_TYPE_ID = (BigDecimal) dis.readObject();

					this.LOCALE_ID = (BigDecimal) dis.readObject();

					this.LOCATION_ID = (BigDecimal) dis.readObject();

					this.USER_FIRST_NAME = readString(dis);

					this.USER_MIDDLE_NAME = readString(dis);

					this.USER_LAST_NAME = readString(dis);

					this.USER_PREFIX = readString(dis);

					this.USER_TITLE = readString(dis);

					this.TELEPHONE_NUMBER = readString(dis);

					this.FAX_NUMBER = readString(dis);

					this.ADDRESS_1 = readString(dis);

					this.ADDRESS_2 = readString(dis);

					this.CITY = readString(dis);

					this.STATE_PROV_CODE = readString(dis);

					this.POSTAL_CODE = readString(dis);

					this.COUNTRY_CODE = readString(dis);

					this.USER_EMAIL_1 = readString(dis);

					this.USER_EMAIL_2 = readString(dis);

					this.COMM_METHOD_ID_DURING_BH_1 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_DURING_BH_2 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_AFTER_BH_1 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_AFTER_BH_2 = (BigDecimal) dis.readObject();

					this.COMMON_NAME = readString(dis);

					this.LAST_PASSWORD_CHANGE_DTTM = readDate(dis);

					this.LOGGED_IN = (BigDecimal) dis.readObject();

					this.LAST_LOGIN_DTTM = readDate(dis);

					this.DEFAULT_BUSINESS_UNIT_ID = (BigDecimal) dis.readObject();

					this.DEFAULT_WHSE_REGION_ID = (BigDecimal) dis.readObject();

					this.CHANNEL_ID = (BigDecimal) dis.readObject();

					this.HIBERNATE_VERSION = (BigDecimal) dis.readObject();

					this.NUMBER_OF_INVALID_LOGINS = (BigDecimal) dis.readObject();

					this.TAX_ID_NBR = readString(dis);

					this.EMP_START_DATE = readDate(dis);

					this.BIRTH_DATE = readDate(dis);

					this.GENDER_ID = readString(dis);

					this.PASSWORD_RESET_DATE_TIME = readDate(dis);

					this.PASSWORD_TOKEN = readString(dis);

					this.ISPASSWORDMANAGEDINTERNALLY = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_UCL_USER) {

				try {

					int length = 0;

					this.UCL_USER_ID = (BigDecimal) dis.readObject();

					this.COMPANY_ID = (BigDecimal) dis.readObject();

					this.USER_NAME = readString(dis);

					this.USER_PASSWORD = readString(dis);

					this.IS_ACTIVE = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE_TYPE_ID = (BigDecimal) dis.readObject();

					this.CREATED_SOURCE = readString(dis);

					this.CREATED_DTTM = readDate(dis);

					this.LAST_UPDATED_SOURCE_TYPE_ID = (BigDecimal) dis.readObject();

					this.LAST_UPDATED_SOURCE = readString(dis);

					this.LAST_UPDATED_DTTM = readDate(dis);

					this.USER_TYPE_ID = (BigDecimal) dis.readObject();

					this.LOCALE_ID = (BigDecimal) dis.readObject();

					this.LOCATION_ID = (BigDecimal) dis.readObject();

					this.USER_FIRST_NAME = readString(dis);

					this.USER_MIDDLE_NAME = readString(dis);

					this.USER_LAST_NAME = readString(dis);

					this.USER_PREFIX = readString(dis);

					this.USER_TITLE = readString(dis);

					this.TELEPHONE_NUMBER = readString(dis);

					this.FAX_NUMBER = readString(dis);

					this.ADDRESS_1 = readString(dis);

					this.ADDRESS_2 = readString(dis);

					this.CITY = readString(dis);

					this.STATE_PROV_CODE = readString(dis);

					this.POSTAL_CODE = readString(dis);

					this.COUNTRY_CODE = readString(dis);

					this.USER_EMAIL_1 = readString(dis);

					this.USER_EMAIL_2 = readString(dis);

					this.COMM_METHOD_ID_DURING_BH_1 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_DURING_BH_2 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_AFTER_BH_1 = (BigDecimal) dis.readObject();

					this.COMM_METHOD_ID_AFTER_BH_2 = (BigDecimal) dis.readObject();

					this.COMMON_NAME = readString(dis);

					this.LAST_PASSWORD_CHANGE_DTTM = readDate(dis);

					this.LOGGED_IN = (BigDecimal) dis.readObject();

					this.LAST_LOGIN_DTTM = readDate(dis);

					this.DEFAULT_BUSINESS_UNIT_ID = (BigDecimal) dis.readObject();

					this.DEFAULT_WHSE_REGION_ID = (BigDecimal) dis.readObject();

					this.CHANNEL_ID = (BigDecimal) dis.readObject();

					this.HIBERNATE_VERSION = (BigDecimal) dis.readObject();

					this.NUMBER_OF_INVALID_LOGINS = (BigDecimal) dis.readObject();

					this.TAX_ID_NBR = readString(dis);

					this.EMP_START_DATE = readDate(dis);

					this.BIRTH_DATE = readDate(dis);

					this.GENDER_ID = readString(dis);

					this.PASSWORD_RESET_DATE_TIME = readDate(dis);

					this.PASSWORD_TOKEN = readString(dis);

					this.ISPASSWORDMANAGEDINTERNALLY = (BigDecimal) dis.readObject();

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

				dos.writeObject(this.UCL_USER_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// String

				writeString(this.USER_NAME, dos);

				// String

				writeString(this.USER_PASSWORD, dos);

				// BigDecimal

				dos.writeObject(this.IS_ACTIVE);

				// BigDecimal

				dos.writeObject(this.CREATED_SOURCE_TYPE_ID);

				// String

				writeString(this.CREATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.LAST_UPDATED_SOURCE_TYPE_ID);

				// String

				writeString(this.LAST_UPDATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.USER_TYPE_ID);

				// BigDecimal

				dos.writeObject(this.LOCALE_ID);

				// BigDecimal

				dos.writeObject(this.LOCATION_ID);

				// String

				writeString(this.USER_FIRST_NAME, dos);

				// String

				writeString(this.USER_MIDDLE_NAME, dos);

				// String

				writeString(this.USER_LAST_NAME, dos);

				// String

				writeString(this.USER_PREFIX, dos);

				// String

				writeString(this.USER_TITLE, dos);

				// String

				writeString(this.TELEPHONE_NUMBER, dos);

				// String

				writeString(this.FAX_NUMBER, dos);

				// String

				writeString(this.ADDRESS_1, dos);

				// String

				writeString(this.ADDRESS_2, dos);

				// String

				writeString(this.CITY, dos);

				// String

				writeString(this.STATE_PROV_CODE, dos);

				// String

				writeString(this.POSTAL_CODE, dos);

				// String

				writeString(this.COUNTRY_CODE, dos);

				// String

				writeString(this.USER_EMAIL_1, dos);

				// String

				writeString(this.USER_EMAIL_2, dos);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_DURING_BH_1);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_DURING_BH_2);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_AFTER_BH_1);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_AFTER_BH_2);

				// String

				writeString(this.COMMON_NAME, dos);

				// java.util.Date

				writeDate(this.LAST_PASSWORD_CHANGE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.LOGGED_IN);

				// java.util.Date

				writeDate(this.LAST_LOGIN_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.DEFAULT_BUSINESS_UNIT_ID);

				// BigDecimal

				dos.writeObject(this.DEFAULT_WHSE_REGION_ID);

				// BigDecimal

				dos.writeObject(this.CHANNEL_ID);

				// BigDecimal

				dos.writeObject(this.HIBERNATE_VERSION);

				// BigDecimal

				dos.writeObject(this.NUMBER_OF_INVALID_LOGINS);

				// String

				writeString(this.TAX_ID_NBR, dos);

				// java.util.Date

				writeDate(this.EMP_START_DATE, dos);

				// java.util.Date

				writeDate(this.BIRTH_DATE, dos);

				// String

				writeString(this.GENDER_ID, dos);

				// java.util.Date

				writeDate(this.PASSWORD_RESET_DATE_TIME, dos);

				// String

				writeString(this.PASSWORD_TOKEN, dos);

				// BigDecimal

				dos.writeObject(this.ISPASSWORDMANAGEDINTERNALLY);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// BigDecimal

				dos.writeObject(this.UCL_USER_ID);

				// BigDecimal

				dos.writeObject(this.COMPANY_ID);

				// String

				writeString(this.USER_NAME, dos);

				// String

				writeString(this.USER_PASSWORD, dos);

				// BigDecimal

				dos.writeObject(this.IS_ACTIVE);

				// BigDecimal

				dos.writeObject(this.CREATED_SOURCE_TYPE_ID);

				// String

				writeString(this.CREATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.CREATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.LAST_UPDATED_SOURCE_TYPE_ID);

				// String

				writeString(this.LAST_UPDATED_SOURCE, dos);

				// java.util.Date

				writeDate(this.LAST_UPDATED_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.USER_TYPE_ID);

				// BigDecimal

				dos.writeObject(this.LOCALE_ID);

				// BigDecimal

				dos.writeObject(this.LOCATION_ID);

				// String

				writeString(this.USER_FIRST_NAME, dos);

				// String

				writeString(this.USER_MIDDLE_NAME, dos);

				// String

				writeString(this.USER_LAST_NAME, dos);

				// String

				writeString(this.USER_PREFIX, dos);

				// String

				writeString(this.USER_TITLE, dos);

				// String

				writeString(this.TELEPHONE_NUMBER, dos);

				// String

				writeString(this.FAX_NUMBER, dos);

				// String

				writeString(this.ADDRESS_1, dos);

				// String

				writeString(this.ADDRESS_2, dos);

				// String

				writeString(this.CITY, dos);

				// String

				writeString(this.STATE_PROV_CODE, dos);

				// String

				writeString(this.POSTAL_CODE, dos);

				// String

				writeString(this.COUNTRY_CODE, dos);

				// String

				writeString(this.USER_EMAIL_1, dos);

				// String

				writeString(this.USER_EMAIL_2, dos);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_DURING_BH_1);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_DURING_BH_2);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_AFTER_BH_1);

				// BigDecimal

				dos.writeObject(this.COMM_METHOD_ID_AFTER_BH_2);

				// String

				writeString(this.COMMON_NAME, dos);

				// java.util.Date

				writeDate(this.LAST_PASSWORD_CHANGE_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.LOGGED_IN);

				// java.util.Date

				writeDate(this.LAST_LOGIN_DTTM, dos);

				// BigDecimal

				dos.writeObject(this.DEFAULT_BUSINESS_UNIT_ID);

				// BigDecimal

				dos.writeObject(this.DEFAULT_WHSE_REGION_ID);

				// BigDecimal

				dos.writeObject(this.CHANNEL_ID);

				// BigDecimal

				dos.writeObject(this.HIBERNATE_VERSION);

				// BigDecimal

				dos.writeObject(this.NUMBER_OF_INVALID_LOGINS);

				// String

				writeString(this.TAX_ID_NBR, dos);

				// java.util.Date

				writeDate(this.EMP_START_DATE, dos);

				// java.util.Date

				writeDate(this.BIRTH_DATE, dos);

				// String

				writeString(this.GENDER_ID, dos);

				// java.util.Date

				writeDate(this.PASSWORD_RESET_DATE_TIME, dos);

				// String

				writeString(this.PASSWORD_TOKEN, dos);

				// BigDecimal

				dos.writeObject(this.ISPASSWORDMANAGEDINTERNALLY);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("UCL_USER_ID=" + String.valueOf(UCL_USER_ID));
			sb.append(",COMPANY_ID=" + String.valueOf(COMPANY_ID));
			sb.append(",USER_NAME=" + USER_NAME);
			sb.append(",USER_PASSWORD=" + USER_PASSWORD);
			sb.append(",IS_ACTIVE=" + String.valueOf(IS_ACTIVE));
			sb.append(",CREATED_SOURCE_TYPE_ID=" + String.valueOf(CREATED_SOURCE_TYPE_ID));
			sb.append(",CREATED_SOURCE=" + CREATED_SOURCE);
			sb.append(",CREATED_DTTM=" + String.valueOf(CREATED_DTTM));
			sb.append(",LAST_UPDATED_SOURCE_TYPE_ID=" + String.valueOf(LAST_UPDATED_SOURCE_TYPE_ID));
			sb.append(",LAST_UPDATED_SOURCE=" + LAST_UPDATED_SOURCE);
			sb.append(",LAST_UPDATED_DTTM=" + String.valueOf(LAST_UPDATED_DTTM));
			sb.append(",USER_TYPE_ID=" + String.valueOf(USER_TYPE_ID));
			sb.append(",LOCALE_ID=" + String.valueOf(LOCALE_ID));
			sb.append(",LOCATION_ID=" + String.valueOf(LOCATION_ID));
			sb.append(",USER_FIRST_NAME=" + USER_FIRST_NAME);
			sb.append(",USER_MIDDLE_NAME=" + USER_MIDDLE_NAME);
			sb.append(",USER_LAST_NAME=" + USER_LAST_NAME);
			sb.append(",USER_PREFIX=" + USER_PREFIX);
			sb.append(",USER_TITLE=" + USER_TITLE);
			sb.append(",TELEPHONE_NUMBER=" + TELEPHONE_NUMBER);
			sb.append(",FAX_NUMBER=" + FAX_NUMBER);
			sb.append(",ADDRESS_1=" + ADDRESS_1);
			sb.append(",ADDRESS_2=" + ADDRESS_2);
			sb.append(",CITY=" + CITY);
			sb.append(",STATE_PROV_CODE=" + STATE_PROV_CODE);
			sb.append(",POSTAL_CODE=" + POSTAL_CODE);
			sb.append(",COUNTRY_CODE=" + COUNTRY_CODE);
			sb.append(",USER_EMAIL_1=" + USER_EMAIL_1);
			sb.append(",USER_EMAIL_2=" + USER_EMAIL_2);
			sb.append(",COMM_METHOD_ID_DURING_BH_1=" + String.valueOf(COMM_METHOD_ID_DURING_BH_1));
			sb.append(",COMM_METHOD_ID_DURING_BH_2=" + String.valueOf(COMM_METHOD_ID_DURING_BH_2));
			sb.append(",COMM_METHOD_ID_AFTER_BH_1=" + String.valueOf(COMM_METHOD_ID_AFTER_BH_1));
			sb.append(",COMM_METHOD_ID_AFTER_BH_2=" + String.valueOf(COMM_METHOD_ID_AFTER_BH_2));
			sb.append(",COMMON_NAME=" + COMMON_NAME);
			sb.append(",LAST_PASSWORD_CHANGE_DTTM=" + String.valueOf(LAST_PASSWORD_CHANGE_DTTM));
			sb.append(",LOGGED_IN=" + String.valueOf(LOGGED_IN));
			sb.append(",LAST_LOGIN_DTTM=" + String.valueOf(LAST_LOGIN_DTTM));
			sb.append(",DEFAULT_BUSINESS_UNIT_ID=" + String.valueOf(DEFAULT_BUSINESS_UNIT_ID));
			sb.append(",DEFAULT_WHSE_REGION_ID=" + String.valueOf(DEFAULT_WHSE_REGION_ID));
			sb.append(",CHANNEL_ID=" + String.valueOf(CHANNEL_ID));
			sb.append(",HIBERNATE_VERSION=" + String.valueOf(HIBERNATE_VERSION));
			sb.append(",NUMBER_OF_INVALID_LOGINS=" + String.valueOf(NUMBER_OF_INVALID_LOGINS));
			sb.append(",TAX_ID_NBR=" + TAX_ID_NBR);
			sb.append(",EMP_START_DATE=" + String.valueOf(EMP_START_DATE));
			sb.append(",BIRTH_DATE=" + String.valueOf(BIRTH_DATE));
			sb.append(",GENDER_ID=" + GENDER_ID);
			sb.append(",PASSWORD_RESET_DATE_TIME=" + String.valueOf(PASSWORD_RESET_DATE_TIME));
			sb.append(",PASSWORD_TOKEN=" + PASSWORD_TOKEN);
			sb.append(",ISPASSWORDMANAGEDINTERNALLY=" + String.valueOf(ISPASSWORDMANAGEDINTERNALLY));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (UCL_USER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(UCL_USER_ID);
			}

			sb.append("|");

			if (COMPANY_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(COMPANY_ID);
			}

			sb.append("|");

			if (USER_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_NAME);
			}

			sb.append("|");

			if (USER_PASSWORD == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_PASSWORD);
			}

			sb.append("|");

			if (IS_ACTIVE == null) {
				sb.append("<null>");
			} else {
				sb.append(IS_ACTIVE);
			}

			sb.append("|");

			if (CREATED_SOURCE_TYPE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_SOURCE_TYPE_ID);
			}

			sb.append("|");

			if (CREATED_SOURCE == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_SOURCE);
			}

			sb.append("|");

			if (CREATED_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(CREATED_DTTM);
			}

			sb.append("|");

			if (LAST_UPDATED_SOURCE_TYPE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_UPDATED_SOURCE_TYPE_ID);
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

			if (USER_TYPE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_TYPE_ID);
			}

			sb.append("|");

			if (LOCALE_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(LOCALE_ID);
			}

			sb.append("|");

			if (LOCATION_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(LOCATION_ID);
			}

			sb.append("|");

			if (USER_FIRST_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_FIRST_NAME);
			}

			sb.append("|");

			if (USER_MIDDLE_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_MIDDLE_NAME);
			}

			sb.append("|");

			if (USER_LAST_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_LAST_NAME);
			}

			sb.append("|");

			if (USER_PREFIX == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_PREFIX);
			}

			sb.append("|");

			if (USER_TITLE == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_TITLE);
			}

			sb.append("|");

			if (TELEPHONE_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(TELEPHONE_NUMBER);
			}

			sb.append("|");

			if (FAX_NUMBER == null) {
				sb.append("<null>");
			} else {
				sb.append(FAX_NUMBER);
			}

			sb.append("|");

			if (ADDRESS_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(ADDRESS_1);
			}

			sb.append("|");

			if (ADDRESS_2 == null) {
				sb.append("<null>");
			} else {
				sb.append(ADDRESS_2);
			}

			sb.append("|");

			if (CITY == null) {
				sb.append("<null>");
			} else {
				sb.append(CITY);
			}

			sb.append("|");

			if (STATE_PROV_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(STATE_PROV_CODE);
			}

			sb.append("|");

			if (POSTAL_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(POSTAL_CODE);
			}

			sb.append("|");

			if (COUNTRY_CODE == null) {
				sb.append("<null>");
			} else {
				sb.append(COUNTRY_CODE);
			}

			sb.append("|");

			if (USER_EMAIL_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_EMAIL_1);
			}

			sb.append("|");

			if (USER_EMAIL_2 == null) {
				sb.append("<null>");
			} else {
				sb.append(USER_EMAIL_2);
			}

			sb.append("|");

			if (COMM_METHOD_ID_DURING_BH_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(COMM_METHOD_ID_DURING_BH_1);
			}

			sb.append("|");

			if (COMM_METHOD_ID_DURING_BH_2 == null) {
				sb.append("<null>");
			} else {
				sb.append(COMM_METHOD_ID_DURING_BH_2);
			}

			sb.append("|");

			if (COMM_METHOD_ID_AFTER_BH_1 == null) {
				sb.append("<null>");
			} else {
				sb.append(COMM_METHOD_ID_AFTER_BH_1);
			}

			sb.append("|");

			if (COMM_METHOD_ID_AFTER_BH_2 == null) {
				sb.append("<null>");
			} else {
				sb.append(COMM_METHOD_ID_AFTER_BH_2);
			}

			sb.append("|");

			if (COMMON_NAME == null) {
				sb.append("<null>");
			} else {
				sb.append(COMMON_NAME);
			}

			sb.append("|");

			if (LAST_PASSWORD_CHANGE_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_PASSWORD_CHANGE_DTTM);
			}

			sb.append("|");

			if (LOGGED_IN == null) {
				sb.append("<null>");
			} else {
				sb.append(LOGGED_IN);
			}

			sb.append("|");

			if (LAST_LOGIN_DTTM == null) {
				sb.append("<null>");
			} else {
				sb.append(LAST_LOGIN_DTTM);
			}

			sb.append("|");

			if (DEFAULT_BUSINESS_UNIT_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(DEFAULT_BUSINESS_UNIT_ID);
			}

			sb.append("|");

			if (DEFAULT_WHSE_REGION_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(DEFAULT_WHSE_REGION_ID);
			}

			sb.append("|");

			if (CHANNEL_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(CHANNEL_ID);
			}

			sb.append("|");

			if (HIBERNATE_VERSION == null) {
				sb.append("<null>");
			} else {
				sb.append(HIBERNATE_VERSION);
			}

			sb.append("|");

			if (NUMBER_OF_INVALID_LOGINS == null) {
				sb.append("<null>");
			} else {
				sb.append(NUMBER_OF_INVALID_LOGINS);
			}

			sb.append("|");

			if (TAX_ID_NBR == null) {
				sb.append("<null>");
			} else {
				sb.append(TAX_ID_NBR);
			}

			sb.append("|");

			if (EMP_START_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(EMP_START_DATE);
			}

			sb.append("|");

			if (BIRTH_DATE == null) {
				sb.append("<null>");
			} else {
				sb.append(BIRTH_DATE);
			}

			sb.append("|");

			if (GENDER_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(GENDER_ID);
			}

			sb.append("|");

			if (PASSWORD_RESET_DATE_TIME == null) {
				sb.append("<null>");
			} else {
				sb.append(PASSWORD_RESET_DATE_TIME);
			}

			sb.append("|");

			if (PASSWORD_TOKEN == null) {
				sb.append("<null>");
			} else {
				sb.append(PASSWORD_TOKEN);
			}

			sb.append("|");

			if (ISPASSWORDMANAGEDINTERNALLY == null) {
				sb.append("<null>");
			} else {
				sb.append(ISPASSWORDMANAGEDINTERNALLY);
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

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row1");

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
						org.talend.components.common.tableaction.TableAction.TableActionEnum.CLEAR);

				props_tDBOutput_1.setValue("outputAction",
						org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);

				props_tDBOutput_1.setValue("convertColumnsAndTableToUppercase", true);

				props_tDBOutput_1.setValue("convertEmptyStringsToNull", false);

				props_tDBOutput_1.setValue("useSchemaDatePattern", false);

				props_tDBOutput_1.setValue("dieOnError", true);

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

				props_tDBOutput_1.connection.setValue("useCustomRegion", false);

				props_tDBOutput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_1.table.setValue("tableName", "UCL_USER");

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

						a("\"name\":\"tDBOutput_1\",\"fields\":[{", s);

						a("\"name\":\"UCL_USER_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"UCL_USER_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"18\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UCL_USER_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMPANY_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMPANY_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"9\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMPANY_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_NAME\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_NAME\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_NAME\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_PASSWORD\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_PASSWORD\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"255\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_PASSWORD\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"IS_ACTIVE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_ACTIVE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_ACTIVE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_SOURCE_TYPE_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_SOURCE_TYPE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_SOURCE_TYPE_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_SOURCE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"CREATED_SOURCE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_SOURCE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CREATED_DTTM\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"CREATED_DTTM\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd HH:mm:ss\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_DTTM\",\"talend.field.precision\":\"6\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_SOURCE_TYPE_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LAST_UPDATED_SOURCE_TYPE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_UPDATED_SOURCE_TYPE_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_SOURCE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"LAST_UPDATED_SOURCE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_UPDATED_SOURCE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_UPDATED_DTTM\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"LAST_UPDATED_DTTM\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd HH:mm:ss\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_UPDATED_DTTM\",\"talend.field.precision\":\"6\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_TYPE_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"USER_TYPE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_TYPE_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOCALE_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOCALE_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCALE_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOCATION_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOCATION_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"18\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCATION_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_FIRST_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_FIRST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_FIRST_NAME\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_MIDDLE_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_MIDDLE_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_MIDDLE_NAME\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_LAST_NAME\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_LAST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_LAST_NAME\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_PREFIX\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_PREFIX\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"16\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_PREFIX\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_TITLE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_TITLE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_TITLE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TELEPHONE_NUMBER\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"TELEPHONE_NUMBER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"32\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TELEPHONE_NUMBER\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"FAX_NUMBER\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"FAX_NUMBER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"32\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FAX_NUMBER\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ADDRESS_1\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"ADDRESS_1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"75\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADDRESS_1\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ADDRESS_2\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"ADDRESS_2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"75\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADDRESS_2\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CITY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"CITY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"50\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CITY\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"STATE_PROV_CODE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"STATE_PROV_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"STATE_PROV_CODE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"POSTAL_CODE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"POSTAL_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSTAL_CODE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COUNTRY_CODE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"COUNTRY_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COUNTRY_CODE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_EMAIL_1\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_EMAIL_1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"75\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_EMAIL_1\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"USER_EMAIL_2\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"USER_EMAIL_2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"75\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"USER_EMAIL_2\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMM_METHOD_ID_DURING_BH_1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMM_METHOD_ID_DURING_BH_1\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMM_METHOD_ID_DURING_BH_1\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMM_METHOD_ID_DURING_BH_2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMM_METHOD_ID_DURING_BH_2\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMM_METHOD_ID_DURING_BH_2\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMM_METHOD_ID_AFTER_BH_1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMM_METHOD_ID_AFTER_BH_1\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMM_METHOD_ID_AFTER_BH_1\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMM_METHOD_ID_AFTER_BH_2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMM_METHOD_ID_AFTER_BH_2\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMM_METHOD_ID_AFTER_BH_2\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COMMON_NAME\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"COMMON_NAME\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"100\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMMON_NAME\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_PASSWORD_CHANGE_DTTM\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"DATE\",\"talend.field.dbColumnName\":\"LAST_PASSWORD_CHANGE_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_PASSWORD_CHANGE_DTTM\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LOGGED_IN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOGGED_IN\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"9\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOGGED_IN\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"LAST_LOGIN_DTTM\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"DATE\",\"talend.field.dbColumnName\":\"LAST_LOGIN_DTTM\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_LOGIN_DTTM\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DEFAULT_BUSINESS_UNIT_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEFAULT_BUSINESS_UNIT_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"9\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEFAULT_BUSINESS_UNIT_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"DEFAULT_WHSE_REGION_ID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEFAULT_WHSE_REGION_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"9\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEFAULT_WHSE_REGION_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"CHANNEL_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHANNEL_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"18\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHANNEL_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"HIBERNATE_VERSION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HIBERNATE_VERSION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"10\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HIBERNATE_VERSION\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"NUMBER_OF_INVALID_LOGINS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NUMBER_OF_INVALID_LOGINS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"4\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NUMBER_OF_INVALID_LOGINS\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"TAX_ID_NBR\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"TAX_ID_NBR\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"15\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_ID_NBR\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"EMP_START_DATE\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"DATE\",\"talend.field.dbColumnName\":\"EMP_START_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EMP_START_DATE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BIRTH_DATE\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"DATE\",\"talend.field.dbColumnName\":\"BIRTH_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BIRTH_DATE\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"GENDER_ID\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"GENDER_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"1\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"GENDER_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"PASSWORD_RESET_DATE_TIME\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"PASSWORD_RESET_DATE_TIME\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd HH:mm:ss\",\"talend.field.length\":\"0\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PASSWORD_RESET_DATE_TIME\",\"talend.field.precision\":\"6\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"PASSWORD_TOKEN\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"VARCHAR2\",\"talend.field.dbColumnName\":\"PASSWORD_TOKEN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"255\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PASSWORD_TOKEN\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ISPASSWORDMANAGEDINTERNALLY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"NUMBER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ISPASSWORDMANAGEDINTERNALLY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"1\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ISPASSWORDMANAGEDINTERNALLY\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",
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
							log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"UCL_USER\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("QUERY" + " = "
									+ "\"SELECT     UCL_USER_ID,     COMPANY_ID,     \\\"USER_NAME\\\",     USER_PASSWORD,     IS_ACTIVE,     CREATED_SOURCE_TYPE_ID,     CREATED_SOURCE,     CREATED_DTTM,     LAST_UPDATED_SOURCE_TYPE_ID,     LAST_UPDATED_SOURCE,     LAST_UPDATED_DTTM,     USER_TYPE_ID,     LOCALE_ID,     LOCATION_ID,     USER_FIRST_NAME,     USER_MIDDLE_NAME,     USER_LAST_NAME,     USER_PREFIX,     USER_TITLE,     TELEPHONE_NUMBER,     FAX_NUMBER,     ADDRESS_1,     ADDRESS_2,     CITY,     STATE_PROV_CODE,     POSTAL_CODE,     COUNTRY_CODE,     USER_EMAIL_1,     USER_EMAIL_2,     COMM_METHOD_ID_DURING_BH_1,     COMM_METHOD_ID_DURING_BH_2,     COMM_METHOD_ID_AFTER_BH_1,     COMM_METHOD_ID_AFTER_BH_2,     COMMON_NAME,     LAST_PASSWORD_CHANGE_DTTM,     LOGGED_IN,     LAST_LOGIN_DTTM,     DEFAULT_BUSINESS_UNIT_ID,     DEFAULT_WHSE_REGION_ID,     CHANNEL_ID,     HIBERNATE_VERSION,     NUMBER_OF_INVALID_LOGINS,     TAX_ID_NBR,     EMP_START_DATE,     BIRTH_DATE,     GENDER_ID,     PASSWORD_RESET_DATE_TIME,     PASSWORD_TOKEN,     ISPASSWORDMANAGEDINTERNALLY  FROM VSIWM.UCL_USER\"");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("UCL_USER_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMPANY_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("USER_NAME") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("USER_PASSWORD")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("IS_ACTIVE") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CREATED_SOURCE_TYPE_ID") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("CREATED_SOURCE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("CREATED_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_SOURCE_TYPE_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_SOURCE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_UPDATED_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("USER_TYPE_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LOCALE_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LOCATION_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("USER_FIRST_NAME") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("USER_MIDDLE_NAME") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("USER_LAST_NAME") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("USER_PREFIX") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("USER_TITLE")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("TELEPHONE_NUMBER") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("FAX_NUMBER") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ADDRESS_1") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("ADDRESS_2") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("CITY")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("STATE_PROV_CODE") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("POSTAL_CODE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COUNTRY_CODE") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("USER_EMAIL_1") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("USER_EMAIL_2") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMM_METHOD_ID_DURING_BH_1") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMM_METHOD_ID_DURING_BH_2") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMM_METHOD_ID_AFTER_BH_1") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMM_METHOD_ID_AFTER_BH_2") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("COMMON_NAME") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LAST_PASSWORD_CHANGE_DTTM") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("LOGGED_IN") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("LAST_LOGIN_DTTM") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("DEFAULT_BUSINESS_UNIT_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("DEFAULT_WHSE_REGION_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("CHANNEL_ID") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("HIBERNATE_VERSION") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("NUMBER_OF_INVALID_LOGINS") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN="
									+ ("TAX_ID_NBR") + "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("EMP_START_DATE")
									+ "}, {TRIM=" + ("false") + ", SCHEMA_COLUMN=" + ("BIRTH_DATE") + "}, {TRIM="
									+ ("false") + ", SCHEMA_COLUMN=" + ("GENDER_ID") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("PASSWORD_RESET_DATE_TIME") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("PASSWORD_TOKEN") + "}, {TRIM=" + ("false")
									+ ", SCHEMA_COLUMN=" + ("ISPASSWORDMANAGEDINTERNALLY") + "}]");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("NO_NULL_VALUES" + " = " + "false");
							log4jParamters_tDBInput_1.append(" | ");
							log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
							log4jParamters_tDBInput_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBInput_1 - " + (log4jParamters_tDBInput_1));
						}
					}
					new BytesLimit65535_tDBInput_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tOracleInput");
					talendJobLogProcess(globalMap);
				}

				int nb_line_tDBInput_1 = 0;
				java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				if (conn_tDBInput_1 != null) {
					if (conn_tDBInput_1.getMetaData() != null) {

						log.debug("tDBInput_1 - Uses an existing connection with username '"
								+ conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: "
								+ conn_tDBInput_1.getMetaData().getURL() + ".");

					}
				}

				boolean isTimeZoneNull_tDBInput_1 = false;
				boolean isConnectionWrapped_tDBInput_1 = !(conn_tDBInput_1 instanceof oracle.jdbc.OracleConnection)
						&& conn_tDBInput_1.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_1 = null;
				if (isConnectionWrapped_tDBInput_1) {
					unwrappedOraConn_tDBInput_1 = conn_tDBInput_1.unwrap(oracle.jdbc.OracleConnection.class);
					if (unwrappedOraConn_tDBInput_1 != null) {
						isTimeZoneNull_tDBInput_1 = (unwrappedOraConn_tDBInput_1.getSessionTimeZone() == null);
					}
				} else {
					isTimeZoneNull_tDBInput_1 = (((oracle.jdbc.OracleConnection) conn_tDBInput_1)
							.getSessionTimeZone() == null);
				}

				if (isTimeZoneNull_tDBInput_1) {
					java.sql.Statement stmtGetTZ_tDBInput_1 = conn_tDBInput_1.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_1 = stmtGetTZ_tDBInput_1
							.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_1 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_1.next()) {
						sessionTimezone_tDBInput_1 = rsGetTZ_tDBInput_1.getString(1);
					}
					if (isConnectionWrapped_tDBInput_1 && unwrappedOraConn_tDBInput_1 != null) {
						unwrappedOraConn_tDBInput_1.setSessionTimeZone(sessionTimezone_tDBInput_1);
					} else {
						((oracle.jdbc.OracleConnection) conn_tDBInput_1).setSessionTimeZone(sessionTimezone_tDBInput_1);
					}
				}

				java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

				String dbquery_tDBInput_1 = "SELECT \n  UCL_USER_ID, \n  COMPANY_ID, \n  \"USER_NAME\", \n  USER_PASSWORD, \n  IS_ACTIVE, \n  CREATED_SOURCE_TYPE_ID"
						+ ", \n  CREATED_SOURCE, \n  CREATED_DTTM, \n  LAST_UPDATED_SOURCE_TYPE_ID, \n  LAST_UPDATED_SOURCE, \n  LAST_UPDATED_DTTM,"
						+ " \n  USER_TYPE_ID, \n  LOCALE_ID, \n  LOCATION_ID, \n  USER_FIRST_NAME, \n  USER_MIDDLE_NAME, \n  USER_LAST_NAME, \n  US"
						+ "ER_PREFIX, \n  USER_TITLE, \n  TELEPHONE_NUMBER, \n  FAX_NUMBER, \n  ADDRESS_1, \n  ADDRESS_2, \n  CITY, \n  STATE_PROV_"
						+ "CODE, \n  POSTAL_CODE, \n  COUNTRY_CODE, \n  USER_EMAIL_1, \n  USER_EMAIL_2, \n  COMM_METHOD_ID_DURING_BH_1, \n  COMM_ME"
						+ "THOD_ID_DURING_BH_2, \n  COMM_METHOD_ID_AFTER_BH_1, \n  COMM_METHOD_ID_AFTER_BH_2, \n  COMMON_NAME, \n  LAST_PASSWORD_CH"
						+ "ANGE_DTTM, \n  LOGGED_IN, \n  LAST_LOGIN_DTTM, \n  DEFAULT_BUSINESS_UNIT_ID, \n  DEFAULT_WHSE_REGION_ID, \n  CHANNEL_ID,"
						+ " \n  HIBERNATE_VERSION, \n  NUMBER_OF_INVALID_LOGINS, \n  TAX_ID_NBR, \n  EMP_START_DATE, \n  BIRTH_DATE, \n  GENDER_ID,"
						+ " \n  PASSWORD_RESET_DATE_TIME, \n  PASSWORD_TOKEN, \n  ISPASSWORDMANAGEDINTERNALLY\nFROM VSIWM.UCL_USER";

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
							row1.UCL_USER_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(1) != null) {
								row1.UCL_USER_ID = rs_tDBInput_1.getBigDecimal(1);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 2) {
							row1.COMPANY_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(2) != null) {
								row1.COMPANY_ID = rs_tDBInput_1.getBigDecimal(2);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 3) {
							row1.USER_NAME = null;
						} else {

							row1.USER_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
						}
						if (colQtyInRs_tDBInput_1 < 4) {
							row1.USER_PASSWORD = null;
						} else {

							row1.USER_PASSWORD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
						}
						if (colQtyInRs_tDBInput_1 < 5) {
							row1.IS_ACTIVE = null;
						} else {

							if (rs_tDBInput_1.getObject(5) != null) {
								row1.IS_ACTIVE = rs_tDBInput_1.getBigDecimal(5);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 6) {
							row1.CREATED_SOURCE_TYPE_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(6) != null) {
								row1.CREATED_SOURCE_TYPE_ID = rs_tDBInput_1.getBigDecimal(6);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 7) {
							row1.CREATED_SOURCE = null;
						} else {

							row1.CREATED_SOURCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
						}
						if (colQtyInRs_tDBInput_1 < 8) {
							row1.CREATED_DTTM = null;
						} else {

							row1.CREATED_DTTM = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 8);
						}
						if (colQtyInRs_tDBInput_1 < 9) {
							row1.LAST_UPDATED_SOURCE_TYPE_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(9) != null) {
								row1.LAST_UPDATED_SOURCE_TYPE_ID = rs_tDBInput_1.getBigDecimal(9);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 10) {
							row1.LAST_UPDATED_SOURCE = null;
						} else {

							row1.LAST_UPDATED_SOURCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
						}
						if (colQtyInRs_tDBInput_1 < 11) {
							row1.LAST_UPDATED_DTTM = null;
						} else {

							row1.LAST_UPDATED_DTTM = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 11);
						}
						if (colQtyInRs_tDBInput_1 < 12) {
							row1.USER_TYPE_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(12) != null) {
								row1.USER_TYPE_ID = rs_tDBInput_1.getBigDecimal(12);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 13) {
							row1.LOCALE_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(13) != null) {
								row1.LOCALE_ID = rs_tDBInput_1.getBigDecimal(13);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 14) {
							row1.LOCATION_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(14) != null) {
								row1.LOCATION_ID = rs_tDBInput_1.getBigDecimal(14);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 15) {
							row1.USER_FIRST_NAME = null;
						} else {

							row1.USER_FIRST_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
						}
						if (colQtyInRs_tDBInput_1 < 16) {
							row1.USER_MIDDLE_NAME = null;
						} else {

							row1.USER_MIDDLE_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
						}
						if (colQtyInRs_tDBInput_1 < 17) {
							row1.USER_LAST_NAME = null;
						} else {

							row1.USER_LAST_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
						}
						if (colQtyInRs_tDBInput_1 < 18) {
							row1.USER_PREFIX = null;
						} else {

							row1.USER_PREFIX = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
						}
						if (colQtyInRs_tDBInput_1 < 19) {
							row1.USER_TITLE = null;
						} else {

							row1.USER_TITLE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 19, false);
						}
						if (colQtyInRs_tDBInput_1 < 20) {
							row1.TELEPHONE_NUMBER = null;
						} else {

							row1.TELEPHONE_NUMBER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 20, false);
						}
						if (colQtyInRs_tDBInput_1 < 21) {
							row1.FAX_NUMBER = null;
						} else {

							row1.FAX_NUMBER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 21, false);
						}
						if (colQtyInRs_tDBInput_1 < 22) {
							row1.ADDRESS_1 = null;
						} else {

							row1.ADDRESS_1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
						}
						if (colQtyInRs_tDBInput_1 < 23) {
							row1.ADDRESS_2 = null;
						} else {

							row1.ADDRESS_2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
						}
						if (colQtyInRs_tDBInput_1 < 24) {
							row1.CITY = null;
						} else {

							row1.CITY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 24, false);
						}
						if (colQtyInRs_tDBInput_1 < 25) {
							row1.STATE_PROV_CODE = null;
						} else {

							row1.STATE_PROV_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 25, false);
						}
						if (colQtyInRs_tDBInput_1 < 26) {
							row1.POSTAL_CODE = null;
						} else {

							row1.POSTAL_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 26, false);
						}
						if (colQtyInRs_tDBInput_1 < 27) {
							row1.COUNTRY_CODE = null;
						} else {

							row1.COUNTRY_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
						}
						if (colQtyInRs_tDBInput_1 < 28) {
							row1.USER_EMAIL_1 = null;
						} else {

							row1.USER_EMAIL_1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
						}
						if (colQtyInRs_tDBInput_1 < 29) {
							row1.USER_EMAIL_2 = null;
						} else {

							row1.USER_EMAIL_2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
						}
						if (colQtyInRs_tDBInput_1 < 30) {
							row1.COMM_METHOD_ID_DURING_BH_1 = null;
						} else {

							if (rs_tDBInput_1.getObject(30) != null) {
								row1.COMM_METHOD_ID_DURING_BH_1 = rs_tDBInput_1.getBigDecimal(30);
							} else {

								row1.COMM_METHOD_ID_DURING_BH_1 = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 31) {
							row1.COMM_METHOD_ID_DURING_BH_2 = null;
						} else {

							if (rs_tDBInput_1.getObject(31) != null) {
								row1.COMM_METHOD_ID_DURING_BH_2 = rs_tDBInput_1.getBigDecimal(31);
							} else {

								row1.COMM_METHOD_ID_DURING_BH_2 = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 32) {
							row1.COMM_METHOD_ID_AFTER_BH_1 = null;
						} else {

							if (rs_tDBInput_1.getObject(32) != null) {
								row1.COMM_METHOD_ID_AFTER_BH_1 = rs_tDBInput_1.getBigDecimal(32);
							} else {

								row1.COMM_METHOD_ID_AFTER_BH_1 = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 33) {
							row1.COMM_METHOD_ID_AFTER_BH_2 = null;
						} else {

							if (rs_tDBInput_1.getObject(33) != null) {
								row1.COMM_METHOD_ID_AFTER_BH_2 = rs_tDBInput_1.getBigDecimal(33);
							} else {

								row1.COMM_METHOD_ID_AFTER_BH_2 = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 34) {
							row1.COMMON_NAME = null;
						} else {

							row1.COMMON_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 34, false);
						}
						if (colQtyInRs_tDBInput_1 < 35) {
							row1.LAST_PASSWORD_CHANGE_DTTM = null;
						} else {

							row1.LAST_PASSWORD_CHANGE_DTTM = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 35);
						}
						if (colQtyInRs_tDBInput_1 < 36) {
							row1.LOGGED_IN = null;
						} else {

							if (rs_tDBInput_1.getObject(36) != null) {
								row1.LOGGED_IN = rs_tDBInput_1.getBigDecimal(36);
							} else {

								row1.LOGGED_IN = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 37) {
							row1.LAST_LOGIN_DTTM = null;
						} else {

							row1.LAST_LOGIN_DTTM = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 37);
						}
						if (colQtyInRs_tDBInput_1 < 38) {
							row1.DEFAULT_BUSINESS_UNIT_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(38) != null) {
								row1.DEFAULT_BUSINESS_UNIT_ID = rs_tDBInput_1.getBigDecimal(38);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 39) {
							row1.DEFAULT_WHSE_REGION_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(39) != null) {
								row1.DEFAULT_WHSE_REGION_ID = rs_tDBInput_1.getBigDecimal(39);
							} else {

								throw new RuntimeException("Null value in non-Nullable column");
							}
						}
						if (colQtyInRs_tDBInput_1 < 40) {
							row1.CHANNEL_ID = null;
						} else {

							if (rs_tDBInput_1.getObject(40) != null) {
								row1.CHANNEL_ID = rs_tDBInput_1.getBigDecimal(40);
							} else {

								row1.CHANNEL_ID = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 41) {
							row1.HIBERNATE_VERSION = null;
						} else {

							if (rs_tDBInput_1.getObject(41) != null) {
								row1.HIBERNATE_VERSION = rs_tDBInput_1.getBigDecimal(41);
							} else {

								row1.HIBERNATE_VERSION = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 42) {
							row1.NUMBER_OF_INVALID_LOGINS = null;
						} else {

							if (rs_tDBInput_1.getObject(42) != null) {
								row1.NUMBER_OF_INVALID_LOGINS = rs_tDBInput_1.getBigDecimal(42);
							} else {

								row1.NUMBER_OF_INVALID_LOGINS = null;
							}
						}
						if (colQtyInRs_tDBInput_1 < 43) {
							row1.TAX_ID_NBR = null;
						} else {

							row1.TAX_ID_NBR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 43, false);
						}
						if (colQtyInRs_tDBInput_1 < 44) {
							row1.EMP_START_DATE = null;
						} else {

							row1.EMP_START_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 44);
						}
						if (colQtyInRs_tDBInput_1 < 45) {
							row1.BIRTH_DATE = null;
						} else {

							row1.BIRTH_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 45);
						}
						if (colQtyInRs_tDBInput_1 < 46) {
							row1.GENDER_ID = null;
						} else {

							row1.GENDER_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 46, false);
						}
						if (colQtyInRs_tDBInput_1 < 47) {
							row1.PASSWORD_RESET_DATE_TIME = null;
						} else {

							row1.PASSWORD_RESET_DATE_TIME = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 47);
						}
						if (colQtyInRs_tDBInput_1 < 48) {
							row1.PASSWORD_TOKEN = null;
						} else {

							row1.PASSWORD_TOKEN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 48, false);
						}
						if (colQtyInRs_tDBInput_1 < 49) {
							row1.ISPASSWORDMANAGEDINTERNALLY = null;
						} else {

							if (rs_tDBInput_1.getObject(49) != null) {
								row1.ISPASSWORDMANAGEDINTERNALLY = rs_tDBInput_1.getBigDecimal(49);
							} else {

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
						 * [tDBOutput_1 main ] start
						 */

						currentComponent = "tDBOutput_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row1", "tDBInput_1", "tDBInput_1", "tOracleInput", "tDBOutput_1", "tDBOutput_1",
								"tSnowflakeOutput"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row1 - " + (row1 == null ? "" : row1.toLogString()));
						}

						if (incomingEnforcer_tDBOutput_1 != null) {
							incomingEnforcer_tDBOutput_1.createNewRecord();
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UCL_USER_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("UCL_USER_ID", row1.UCL_USER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COMPANY_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("COMPANY_ID", row1.COMPANY_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_NAME") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_NAME", row1.USER_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_PASSWORD") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_PASSWORD", row1.USER_PASSWORD);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_ACTIVE") != null) {
							incomingEnforcer_tDBOutput_1.put("IS_ACTIVE", row1.IS_ACTIVE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("CREATED_SOURCE_TYPE_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("CREATED_SOURCE_TYPE_ID", row1.CREATED_SOURCE_TYPE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATED_SOURCE") != null) {
							incomingEnforcer_tDBOutput_1.put("CREATED_SOURCE", row1.CREATED_SOURCE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_1.put("CREATED_DTTM", row1.CREATED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("LAST_UPDATED_SOURCE_TYPE_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("LAST_UPDATED_SOURCE_TYPE_ID",
									row1.LAST_UPDATED_SOURCE_TYPE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("LAST_UPDATED_SOURCE") != null) {
							incomingEnforcer_tDBOutput_1.put("LAST_UPDATED_SOURCE", row1.LAST_UPDATED_SOURCE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("LAST_UPDATED_DTTM") != null) {
							incomingEnforcer_tDBOutput_1.put("LAST_UPDATED_DTTM", row1.LAST_UPDATED_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_TYPE_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_TYPE_ID", row1.USER_TYPE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOCALE_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("LOCALE_ID", row1.LOCALE_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOCATION_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("LOCATION_ID", row1.LOCATION_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("USER_FIRST_NAME") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_FIRST_NAME", row1.USER_FIRST_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("USER_MIDDLE_NAME") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_MIDDLE_NAME", row1.USER_MIDDLE_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_LAST_NAME") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_LAST_NAME", row1.USER_LAST_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_PREFIX") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_PREFIX", row1.USER_PREFIX);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_TITLE") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_TITLE", row1.USER_TITLE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("TELEPHONE_NUMBER") != null) {
							incomingEnforcer_tDBOutput_1.put("TELEPHONE_NUMBER", row1.TELEPHONE_NUMBER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FAX_NUMBER") != null) {
							incomingEnforcer_tDBOutput_1.put("FAX_NUMBER", row1.FAX_NUMBER);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ADDRESS_1") != null) {
							incomingEnforcer_tDBOutput_1.put("ADDRESS_1", row1.ADDRESS_1);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ADDRESS_2") != null) {
							incomingEnforcer_tDBOutput_1.put("ADDRESS_2", row1.ADDRESS_2);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CITY") != null) {
							incomingEnforcer_tDBOutput_1.put("CITY", row1.CITY);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("STATE_PROV_CODE") != null) {
							incomingEnforcer_tDBOutput_1.put("STATE_PROV_CODE", row1.STATE_PROV_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("POSTAL_CODE") != null) {
							incomingEnforcer_tDBOutput_1.put("POSTAL_CODE", row1.POSTAL_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COUNTRY_CODE") != null) {
							incomingEnforcer_tDBOutput_1.put("COUNTRY_CODE", row1.COUNTRY_CODE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_EMAIL_1") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_EMAIL_1", row1.USER_EMAIL_1);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("USER_EMAIL_2") != null) {
							incomingEnforcer_tDBOutput_1.put("USER_EMAIL_2", row1.USER_EMAIL_2);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("COMM_METHOD_ID_DURING_BH_1") != null) {
							incomingEnforcer_tDBOutput_1.put("COMM_METHOD_ID_DURING_BH_1",
									row1.COMM_METHOD_ID_DURING_BH_1);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("COMM_METHOD_ID_DURING_BH_2") != null) {
							incomingEnforcer_tDBOutput_1.put("COMM_METHOD_ID_DURING_BH_2",
									row1.COMM_METHOD_ID_DURING_BH_2);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("COMM_METHOD_ID_AFTER_BH_1") != null) {
							incomingEnforcer_tDBOutput_1.put("COMM_METHOD_ID_AFTER_BH_1",
									row1.COMM_METHOD_ID_AFTER_BH_1);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("COMM_METHOD_ID_AFTER_BH_2") != null) {
							incomingEnforcer_tDBOutput_1.put("COMM_METHOD_ID_AFTER_BH_2",
									row1.COMM_METHOD_ID_AFTER_BH_2);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COMMON_NAME") != null) {
							incomingEnforcer_tDBOutput_1.put("COMMON_NAME", row1.COMMON_NAME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("LAST_PASSWORD_CHANGE_DTTM") != null) {
							incomingEnforcer_tDBOutput_1.put("LAST_PASSWORD_CHANGE_DTTM",
									row1.LAST_PASSWORD_CHANGE_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOGGED_IN") != null) {
							incomingEnforcer_tDBOutput_1.put("LOGGED_IN", row1.LOGGED_IN);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("LAST_LOGIN_DTTM") != null) {
							incomingEnforcer_tDBOutput_1.put("LAST_LOGIN_DTTM", row1.LAST_LOGIN_DTTM);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("DEFAULT_BUSINESS_UNIT_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("DEFAULT_BUSINESS_UNIT_ID", row1.DEFAULT_BUSINESS_UNIT_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("DEFAULT_WHSE_REGION_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("DEFAULT_WHSE_REGION_ID", row1.DEFAULT_WHSE_REGION_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHANNEL_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("CHANNEL_ID", row1.CHANNEL_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("HIBERNATE_VERSION") != null) {
							incomingEnforcer_tDBOutput_1.put("HIBERNATE_VERSION", row1.HIBERNATE_VERSION);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("NUMBER_OF_INVALID_LOGINS") != null) {
							incomingEnforcer_tDBOutput_1.put("NUMBER_OF_INVALID_LOGINS", row1.NUMBER_OF_INVALID_LOGINS);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_ID_NBR") != null) {
							incomingEnforcer_tDBOutput_1.put("TAX_ID_NBR", row1.TAX_ID_NBR);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EMP_START_DATE") != null) {
							incomingEnforcer_tDBOutput_1.put("EMP_START_DATE", row1.EMP_START_DATE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BIRTH_DATE") != null) {
							incomingEnforcer_tDBOutput_1.put("BIRTH_DATE", row1.BIRTH_DATE);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("GENDER_ID") != null) {
							incomingEnforcer_tDBOutput_1.put("GENDER_ID", row1.GENDER_ID);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("PASSWORD_RESET_DATE_TIME") != null) {
							incomingEnforcer_tDBOutput_1.put("PASSWORD_RESET_DATE_TIME", row1.PASSWORD_RESET_DATE_TIME);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null
								&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PASSWORD_TOKEN") != null) {
							incomingEnforcer_tDBOutput_1.put("PASSWORD_TOKEN", row1.PASSWORD_TOKEN);
						}
						// skip the put action if the input column doesn't appear in component runtime
						// schema
						if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
								.getField("ISPASSWORDMANAGEDINTERNALLY") != null) {
							incomingEnforcer_tDBOutput_1.put("ISPASSWORDMANAGEDINTERNALLY",
									row1.ISPASSWORDMANAGEDINTERNALLY);
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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tDBInput_1", "tDBInput_1", "tOracleInput", "tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput",
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

				if (log.isDebugEnabled())
					log.debug("tDBClose_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBClose_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBClose_1 = new StringBuilder();
							log4jParamters_tDBClose_1.append("Parameters:");
							log4jParamters_tDBClose_1.append("CONNECTION" + " = " + "tDBConnection_1");
							log4jParamters_tDBClose_1.append(" | ");
							log4jParamters_tDBClose_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
							log4jParamters_tDBClose_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_1 - " + (log4jParamters_tDBClose_1));
						}
					}
					new BytesLimit65535_tDBClose_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tOracleClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_1 begin ] stop
				 */

				/**
				 * [tDBClose_1 main ] start
				 */

				currentComponent = "tDBClose_1";

				java.sql.Connection conn_tDBClose_1 = (java.sql.Connection) globalMap.get("conn_tDBConnection_1");

				if (conn_tDBClose_1 != null && !conn_tDBClose_1.isClosed()) {

					log.debug("tDBClose_1 - Closing the connection 'tDBConnection_1' to the database.");

					conn_tDBClose_1.close();

					if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_tDBConnection_1"))
							&& routines.system.BundleUtils.inOSGi()) {
						Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").getMethod("checkedShutdown")
								.invoke(null, (Object[]) null);
					}

					log.debug("tDBClose_1 - Connection 'tDBConnection_1' to the database closed.");

				}

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

				if (log.isDebugEnabled())
					log.debug("tDBClose_1 - " + ("Done."));

				ok_Hash.put("tDBClose_1", true);
				end_Hash.put("tDBClose_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
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

				if (log.isDebugEnabled())
					log.debug("tDBConnection_1 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tDBConnection_1 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
							log4jParamters_tDBConnection_1.append("Parameters:");
							log4jParamters_tDBConnection_1.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("DB_VERSION" + " = " + "ORACLE_12");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USE_TNS_FILE" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("HOST" + " = " + "context.host");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PORT" + " = " + "context.port");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "context.database");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SCHEMA_DB" + " = " + "\"\"");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USER" + " = " + "context.login");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:iCxnIOXjDToFmp0r+ezos4AmSYUmnwqUHwyGD9wGFtxWWXQ8BLs=")
									.substring(0, 4) + "...");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_1.append(" | ");
							log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
							log4jParamters_tDBConnection_1.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_1 - " + (log4jParamters_tDBConnection_1));
						}
					}
					new BytesLimit65535_tDBConnection_1().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_1", "tDBConnection_1", "tOracleConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_1 = "jdbc:oracle:thin:@" + context.host + ":" + context.port + ":"
						+ context.database;
				globalMap.put("connectionType_" + "tDBConnection_1", "ORACLE_SID");
				String dbUser_tDBConnection_1 = context.login;

				final String decryptedPassword_tDBConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:cJ0Vu+Hvxx9zFCgQU/zNiARFXODiUr26OQrk4+Y9NhMshMLUKYI=");
				String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;

				java.sql.Connection conn_tDBConnection_1 = null;

				String driverClass_tDBConnection_1 = "oracle.jdbc.OracleDriver";
				java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
				globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);

				log.debug("tDBConnection_1 - Driver ClassName: " + driverClass_tDBConnection_1 + ".");

				log.debug("tDBConnection_1 - Connection attempt to '" + url_tDBConnection_1 + "' with the username '"
						+ dbUser_tDBConnection_1 + "'.");

				conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1, dbUser_tDBConnection_1,
						dbPwd_tDBConnection_1);
				log.debug("tDBConnection_1 - Connection to '" + url_tDBConnection_1 + "' has succeeded.");

				globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
				if (null != conn_tDBConnection_1) {

					log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
					conn_tDBConnection_1.setAutoCommit(false);
				}
				globalMap.put("host_" + "tDBConnection_1", context.host);
				globalMap.put("port_" + "tDBConnection_1", context.port);
				globalMap.put("dbname_" + "tDBConnection_1", context.database);

				globalMap.put("dbschema_" + "tDBConnection_1", "");
				globalMap.put("username_" + "tDBConnection_1", context.login);
				globalMap.put("password_" + "tDBConnection_1", dbPwd_tDBConnection_1);

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

				if (log.isDebugEnabled())
					log.debug("tDBConnection_1 - " + ("Done."));

				ok_Hash.put("tDBConnection_1", true);
				end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
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

				props_tDBConnection_2.setValue("warehouse", "VSI_WH_XS");

				props_tDBConnection_2.setValue("db", "PROD_DATA");

				props_tDBConnection_2.setValue("schemaName", "INVENTORY");

				props_tDBConnection_2.setValue("role", "");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "AKHIL_THATI");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:HzDKwPxi1vG0NN9lr8M7PdzFan9OrnCqyiNub0g4qFaHI6OO0CGA"));

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
		final UCL_USER UCL_USERClass = new UCL_USER();

		int exitCode = UCL_USERClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'UCL_USER' - Done.");
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
		log.info("TalendJob: 'UCL_USER' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_W0chwPpBEe2DP7GCd0UsEw");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-05-24T15:33:42.190947100Z");

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
			java.io.InputStream inContext = UCL_USER.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/ucl_user_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = UCL_USER.class.getClassLoader()
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
					context.setContextType("database", "id_String");
					if (context.getStringValue("database") == null) {
						context.database = null;
					} else {
						context.database = (String) context.getProperty("database");
					}
					context.setContextType("host", "id_String");
					if (context.getStringValue("host") == null) {
						context.host = null;
					} else {
						context.host = (String) context.getProperty("host");
					}
					context.setContextType("login", "id_String");
					if (context.getStringValue("login") == null) {
						context.login = null;
					} else {
						context.login = (String) context.getProperty("login");
					}
					context.setContextType("password", "id_Password");
					if (context.getStringValue("password") == null) {
						context.password = null;
					} else {
						String pwd_password_value = context.getProperty("password");
						context.password = null;
						if (pwd_password_value != null) {
							if (context_param.containsKey("password")) {// no need to decrypt if it come from program
																		// argument or parent job runtime
								context.password = pwd_password_value;
							} else if (!pwd_password_value.isEmpty()) {
								try {
									context.password = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_password_value);
									context.put("password", context.password);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("port", "id_String");
					if (context.getStringValue("port") == null) {
						context.port = null;
					} else {
						context.port = (String) context.getProperty("port");
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
			if (parentContextMap.containsKey("database")) {
				context.database = (String) parentContextMap.get("database");
			}
			if (parentContextMap.containsKey("host")) {
				context.host = (String) parentContextMap.get("host");
			}
			if (parentContextMap.containsKey("login")) {
				context.login = (String) parentContextMap.get("login");
			}
			if (parentContextMap.containsKey("password")) {
				context.password = (java.lang.String) parentContextMap.get("password");
			}
			if (parentContextMap.containsKey("port")) {
				context.port = (String) parentContextMap.get("port");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("password");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, ContextProperties.class, parametersToEncrypt));

		org.slf4j.MDC.put("_context", contextStr);
		log.info("TalendJob: 'UCL_USER' - Started.");
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
			tDBInput_1Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBInput_1) {
			globalMap.put("tDBInput_1_SUBPROCESS_STATE", -1);

			e_tDBInput_1.printStackTrace();

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
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : UCL_USER");
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
		log.info("TalendJob: 'UCL_USER' - Finished - status: " + status + " returnCode: " + returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {
		closeSqlDbConnections();

	}

	private void closeSqlDbConnections() {
		try {
			Object obj_conn;
			obj_conn = globalMap.remove("conn_tDBConnection_1");
			if (null != obj_conn) {
				((java.sql.Connection) obj_conn).close();
			}
		} catch (java.lang.Exception e) {
		}
	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
		connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));

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
 * 254326 characters generated by Talend Cloud Data Management Platform on the
 * May 24, 2023 at 11:33:42 AM EDT
 ************************************************************************************************/