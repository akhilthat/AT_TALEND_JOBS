
package at_talend_jobs.drop_ship_revenue_0_1;

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
 * Job: DROP_SHIP_REVENUE Purpose: <br>
 * Description: <br>
 * 
 * @author
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class DROP_SHIP_REVENUE implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "DROP_SHIP_REVENUE.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(DROP_SHIP_REVENUE.class);

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

			if (Transaction_date != null) {

				this.setProperty("Transaction_date", Transaction_date.toString());

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

		public String Transaction_date;

		public String getTransaction_date() {
			return this.Transaction_date;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "DROP_SHIP_REVENUE";
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
			"_UNxWgArAEe6WaNrWmUUUzw", "0.1");
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
					DROP_SHIP_REVENUE.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(DROP_SHIP_REVENUE.this, new Object[] { e, currentComponent, globalMap });
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

	public void tDBInput_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tJavaRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBInput_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap)
			throws TalendException {

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

	public void tDBClose_2_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tDBClose_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tPrejob_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
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

	public void tDBInput_2_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

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

	public void tDBClose_2_onSubJobError(Exception exception, String errorComponent,
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

	public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];

		public String Transaction_date;

		public String getTransaction_date() {
			return this.Transaction_date;
		}

		public Boolean Transaction_dateIsNullable() {
			return true;
		}

		public Boolean Transaction_dateIsKey() {
			return false;
		}

		public Integer Transaction_dateLength() {
			return null;
		}

		public Integer Transaction_datePrecision() {
			return null;
		}

		public String Transaction_dateDefault() {

			return null;

		}

		public String Transaction_dateComment() {

			return "";

		}

		public String Transaction_datePattern() {

			return "";

		}

		public String Transaction_dateOriginalDbColumnName() {

			return "Transaction_date";

		}

		private String readString(ObjectInputStream dis) throws IOException {
			String strReturn = null;
			int length = 0;
			length = dis.readInt();
			if (length == -1) {
				strReturn = null;
			} else {
				if (length > commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE.length == 0) {
						commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[2 * length];
					}
				}
				dis.readFully(commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE, 0, length, utf8Charset);
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
				if (length > commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE.length) {
					if (length < 1024 && commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE.length == 0) {
						commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[1024];
					} else {
						commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[2 * length];
					}
				}
				unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE, 0, length);
				strReturn = new String(commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE, 0, length, utf8Charset);
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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.Transaction_date = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.Transaction_date = readString(dis);

				} catch (IOException e) {
					throw new RuntimeException(e);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// String

				writeString(this.Transaction_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// String

				writeString(this.Transaction_date, dos);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("Transaction_date=" + Transaction_date);
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (Transaction_date == null) {
				sb.append("<null>");
			} else {
				sb.append(Transaction_date);
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

				row2Struct row2 = new row2Struct();

				/**
				 * [tJavaRow_1 begin ] start
				 */

				ok_Hash.put("tJavaRow_1", false);
				start_Hash.put("tJavaRow_1", System.currentTimeMillis());

				currentComponent = "tJavaRow_1";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "row2");

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
				 * [tDBInput_2 begin ] start
				 */

				ok_Hash.put("tDBInput_2", false);
				start_Hash.put("tDBInput_2", System.currentTimeMillis());

				currentComponent = "tDBInput_2";

				cLabel = "DROP_SHIP_REVENUE";

				int tos_count_tDBInput_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_2", "DROP_SHIP_REVENUE", "tSnowflakeInput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBInput_2 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBInput_2 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBInput_2 = (String) (restRequest_tDBInput_2 != null
						? restRequest_tDBInput_2.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBInput_2 = new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBInput_2 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBInput_2 = null;

				org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_2 = (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_2
						.createRuntimeProperties();
				props_tDBInput_2.setValue("manualQuery", true);

				props_tDBInput_2.setValue("query", "select max(transaction_date) from DROP_SHIP_REVENUE");

				props_tDBInput_2.connection.setValue("useCustomRegion", false);

				props_tDBInput_2.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_2.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_3");

				props_tDBInput_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBInput_2.table.setValue("tableName", "");

				props_tDBInput_2.table.connection.setValue("useCustomRegion", false);

				props_tDBInput_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_2.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_3");

				props_tDBInput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBInput_2_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"MAIN\",\"fields\":[{", s);

						a("\"name\":\"Transaction_date\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"Transaction_date\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"Transaction_date\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"MAIN\",\"di.table.label\":\"MAIN\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBInput_2_1_fisrt sst_tDBInput_2_1_fisrt = new SchemaSettingTool_tDBInput_2_1_fisrt();

				props_tDBInput_2.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBInput_2_1_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_2.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_2 = props_tDBInput_2.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_2.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_2);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_2.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_2 = props_tDBInput_2.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_2 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_2 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_2.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_2);
					}
				}
				globalMap.put("tDBInput_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_2);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBInput_2 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBInput_2_MAPPINGS_URL", mappings_url_tDBInput_2);

				org.talend.components.api.container.RuntimeContainer container_tDBInput_2 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBInput_2";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBInput_2 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBInput_2 = null;
				topology_tDBInput_2 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_2 = def_tDBInput_2.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_2,
						topology_tDBInput_2);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_2 = def_tDBInput_2
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_2 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBInput_2.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBInput_2 = componentRuntime_tDBInput_2
						.initialize(container_tDBInput_2, props_tDBInput_2);

				if (initVr_tDBInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBInput_2.getMessage());
				}

				if (componentRuntime_tDBInput_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBInput_2;
					compDriverInitialization_tDBInput_2.runAtDriver(container_tDBInput_2);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_2 = null;
				if (componentRuntime_tDBInput_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBInput_2 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBInput_2;
					if (doesNodeBelongToRequest_tDBInput_2) {
						org.talend.daikon.properties.ValidationResult vr_tDBInput_2 = sourceOrSink_tDBInput_2
								.validate(container_tDBInput_2);
						if (vr_tDBInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBInput_2.getMessage());
						}
					}
				}

				if (sourceOrSink_tDBInput_2 instanceof org.talend.components.api.component.runtime.Source) {
					org.talend.components.api.component.runtime.Source source_tDBInput_2 = (org.talend.components.api.component.runtime.Source) sourceOrSink_tDBInput_2;
					reader_tDBInput_2 = source_tDBInput_2.createReader(container_tDBInput_2);
					reader_tDBInput_2 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(
							reader_tDBInput_2, container_tDBInput_2);

					boolean multi_output_is_allowed_tDBInput_2 = false;
					org.talend.components.api.component.Connector c_tDBInput_2 = null;
					for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_2
							.getAvailableConnectors(null, true)) {
						if (currentConnector.getName().equals("MAIN")) {
							c_tDBInput_2 = currentConnector;
						}

						if (currentConnector.getName().equals("REJECT")) {// it's better to move the code to javajet
							multi_output_is_allowed_tDBInput_2 = true;
						}
					}
					org.apache.avro.Schema schema_tDBInput_2 = props_tDBInput_2.getSchema(c_tDBInput_2, true);

					org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_2 = org.talend.codegen.enforcer.EnforcerCreator
							.createOutgoingEnforcer(schema_tDBInput_2, false);

					// Create a reusable factory that converts the output of the reader to an
					// IndexedRecord.
					org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_2 = null;

					// Iterate through the incoming data.
					boolean available_tDBInput_2 = reader_tDBInput_2.start();

					resourceMap.put("reader_tDBInput_2", reader_tDBInput_2);

					for (; available_tDBInput_2; available_tDBInput_2 = reader_tDBInput_2.advance()) {
						nb_line_tDBInput_2++;

						if (multi_output_is_allowed_tDBInput_2) {

							row2 = null;

						}

						try {
							Object data_tDBInput_2 = reader_tDBInput_2.getCurrent();

							if (multi_output_is_allowed_tDBInput_2) {
								row2 = new row2Struct();
							}

							// Construct the factory once when the first data arrives.
							if (factory_tDBInput_2 == null) {
								factory_tDBInput_2 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>) new org.talend.daikon.avro.AvroRegistry()
										.createIndexedRecordConverter(data_tDBInput_2.getClass());
							}

							// Enforce the outgoing schema on the input.
							outgoingEnforcer_tDBInput_2.setWrapped(factory_tDBInput_2.convertToAvro(data_tDBInput_2));
							Object columnValue_0_tDBInput_2 = outgoingEnforcer_tDBInput_2.get(0);
							row2.Transaction_date = (String) (columnValue_0_tDBInput_2);
						} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_2) {
							java.util.Map<String, Object> info_tDBInput_2 = e_tDBInput_2.getRejectInfo();

							// TODO use a method instead of getting method by the special key
							// "error/errorMessage"
							Object errorMessage_tDBInput_2 = null;
							if (info_tDBInput_2.containsKey("error")) {
								errorMessage_tDBInput_2 = info_tDBInput_2.get("error");
							} else if (info_tDBInput_2.containsKey("errorMessage")) {
								errorMessage_tDBInput_2 = info_tDBInput_2.get("errorMessage");
							} else {
								errorMessage_tDBInput_2 = "Rejected but error message missing";
							}
							errorMessage_tDBInput_2 = "Row " + nb_line_tDBInput_2 + ": " + errorMessage_tDBInput_2;
							System.err.println(errorMessage_tDBInput_2);

							// If the record is reject, the main line record should put NULL
							row2 = null;

						} // end of catch

						java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_2 = new java.util.ArrayList<Object>();
						java.util.Iterator outgoingMainRecordsIt_tDBInput_2 = null;

						/**
						 * [tDBInput_2 begin ] stop
						 */

						/**
						 * [tDBInput_2 main ] start
						 */

						currentComponent = "tDBInput_2";

						cLabel = "DROP_SHIP_REVENUE";

						tos_count_tDBInput_2++;

						/**
						 * [tDBInput_2 main ] stop
						 */

						/**
						 * [tDBInput_2 process_data_begin ] start
						 */

						currentComponent = "tDBInput_2";

						cLabel = "DROP_SHIP_REVENUE";

						/**
						 * [tDBInput_2 process_data_begin ] stop
						 */

						/**
						 * [tJavaRow_1 main ] start
						 */

						currentComponent = "tJavaRow_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row2", "tDBInput_2", "DROP_SHIP_REVENUE", "tSnowflakeInput", "tJavaRow_1",
								"tJavaRow_1", "tJavaRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
						}

						// Code generated according to input schema and output schema
						context.Transaction_date = row2.Transaction_date;

						System.out.println("Date for incremental pull: " + context.Transaction_date);

//System.out.println("Query: SELECT TRANSACTION_DATE, STORE_NO, SKU_ID,Basket_spend, Items, COST,SCANS from PROD_DATA.INVENTORY.MARGIN_TRANSACTION where store_no=6103 and transaction_date > '"+context.Transaction_date+"' ");

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

						/**
						 * [tDBInput_2 process_data_end ] start
						 */

						currentComponent = "tDBInput_2";

						cLabel = "DROP_SHIP_REVENUE";

						/**
						 * [tDBInput_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 end ] start
						 */

						currentComponent = "tDBInput_2";

						cLabel = "DROP_SHIP_REVENUE";

// end of generic

						resourceMap.put("finish_tDBInput_2", Boolean.TRUE);

					} // while
				} // end of "if (sourceOrSink_tDBInput_2 instanceof ...Source)"
				java.util.Map<String, Object> resultMap_tDBInput_2 = null;
				if (reader_tDBInput_2 != null) {
					reader_tDBInput_2.close();
					resultMap_tDBInput_2 = reader_tDBInput_2.getReturnValues();
				}
				if (resultMap_tDBInput_2 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBInput_2 : resultMap_tDBInput_2.entrySet()) {
						switch (entry_tDBInput_2.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBInput_2.setComponentData("tDBInput_2", "ERROR_MESSAGE",
									entry_tDBInput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBInput_2.setComponentData("tDBInput_2", "NB_LINE", entry_tDBInput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBInput_2.setComponentData("tDBInput_2", "NB_SUCCESS",
									entry_tDBInput_2.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBInput_2.setComponentData("tDBInput_2", "NB_REJECT",
									entry_tDBInput_2.getValue());
							break;
						default:
							StringBuilder studio_key_tDBInput_2 = new StringBuilder();
							for (int i_tDBInput_2 = 0; i_tDBInput_2 < entry_tDBInput_2.getKey()
									.length(); i_tDBInput_2++) {
								char ch_tDBInput_2 = entry_tDBInput_2.getKey().charAt(i_tDBInput_2);
								if (Character.isUpperCase(ch_tDBInput_2) && i_tDBInput_2 > 0) {
									studio_key_tDBInput_2.append('_');
								}
								studio_key_tDBInput_2.append(ch_tDBInput_2);
							}
							container_tDBInput_2.setComponentData("tDBInput_2",
									studio_key_tDBInput_2.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBInput_2.getValue());
							break;
						}
					}
				}

				ok_Hash.put("tDBInput_2", true);
				end_Hash.put("tDBInput_2", System.currentTimeMillis());

				/**
				 * [tDBInput_2 end ] stop
				 */

				/**
				 * [tJavaRow_1 end ] start
				 */

				currentComponent = "tJavaRow_1";

				globalMap.put("tJavaRow_1_NB_LINE", nb_line_tJavaRow_1);
				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
						"tDBInput_2", "DROP_SHIP_REVENUE", "tSnowflakeInput", "tJavaRow_1", "tJavaRow_1", "tJavaRow",
						"output")) {
					talendJobLogProcess(globalMap);
				}

				ok_Hash.put("tJavaRow_1", true);
				end_Hash.put("tJavaRow_1", System.currentTimeMillis());

				/**
				 * [tJavaRow_1 end ] stop
				 */

			} // end the resume

			if (resumeEntryMethodName == null || globalResumeTicket) {
				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "",
						Thread.currentThread().getId() + "", "", "", "", "", "");
			}

			if (execStat) {
				runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
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
				 * [tDBInput_2 finally ] start
				 */

				currentComponent = "tDBInput_2";

				cLabel = "DROP_SHIP_REVENUE";

// finally of generic

				if (resourceMap.get("finish_tDBInput_2") == null) {
					if (resourceMap.get("reader_tDBInput_2") != null) {
						try {
							((org.talend.components.api.component.runtime.Reader) resourceMap.get("reader_tDBInput_2"))
									.close();
						} catch (java.io.IOException e_tDBInput_2) {
							String errorMessage_tDBInput_2 = "failed to release the resource in tDBInput_2 :"
									+ e_tDBInput_2.getMessage();
							System.err.println(errorMessage_tDBInput_2);
						}
					}
				}

				/**
				 * [tDBInput_2 finally ] stop
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

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}

	public static class OutStruct implements routines.system.IPersistableRow<OutStruct> {
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];

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

			return "yyyy-MM-dd HH:mm:ss";

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
			return 38;
		}

		public Integer STORE_NOPrecision() {
			return 0;
		}

		public String STORE_NODefault() {

			return null;

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
			return 38;
		}

		public Integer SKU_IDPrecision() {
			return 0;
		}

		public String SKU_IDDefault() {

			return null;

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

		public BigDecimal SALES;

		public BigDecimal getSALES() {
			return this.SALES;
		}

		public Boolean SALESIsNullable() {
			return true;
		}

		public Boolean SALESIsKey() {
			return false;
		}

		public Integer SALESLength() {
			return 38;
		}

		public Integer SALESPrecision() {
			return 4;
		}

		public String SALESDefault() {

			return null;

		}

		public String SALESComment() {

			return "";

		}

		public String SALESPattern() {

			return "";

		}

		public String SALESOriginalDbColumnName() {

			return "SALES";

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
			return 38;
		}

		public Integer UNITSPrecision() {
			return 0;
		}

		public String UNITSDefault() {

			return null;

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

		public Double COST;

		public Double getCOST() {
			return this.COST;
		}

		public Boolean COSTIsNullable() {
			return true;
		}

		public Boolean COSTIsKey() {
			return false;
		}

		public Integer COSTLength() {
			return null;
		}

		public Integer COSTPrecision() {
			return null;
		}

		public String COSTDefault() {

			return null;

		}

		public String COSTComment() {

			return "";

		}

		public String COSTPattern() {

			return "";

		}

		public String COSTOriginalDbColumnName() {

			return "COST";

		}

		public BigDecimal SCANS;

		public BigDecimal getSCANS() {
			return this.SCANS;
		}

		public Boolean SCANSIsNullable() {
			return true;
		}

		public Boolean SCANSIsKey() {
			return false;
		}

		public Integer SCANSLength() {
			return 18;
		}

		public Integer SCANSPrecision() {
			return 2;
		}

		public String SCANSDefault() {

			return null;

		}

		public String SCANSComment() {

			return "";

		}

		public String SCANSPattern() {

			return "";

		}

		public String SCANSOriginalDbColumnName() {

			return "SCANS";

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.SALES = (BigDecimal) dis.readObject();

					this.UNITS = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.COST = null;
					} else {
						this.COST = dis.readDouble();
					}

					this.SCANS = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.SALES = (BigDecimal) dis.readObject();

					this.UNITS = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.COST = null;
					} else {
						this.COST = dis.readDouble();
					}

					this.SCANS = (BigDecimal) dis.readObject();

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

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.SALES);

				// BigDecimal

				dos.writeObject(this.UNITS);

				// Double

				if (this.COST == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.COST);
				}

				// BigDecimal

				dos.writeObject(this.SCANS);

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

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.SALES);

				// BigDecimal

				dos.writeObject(this.UNITS);

				// Double

				if (this.COST == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.COST);
				}

				// BigDecimal

				dos.writeObject(this.SCANS);

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
			sb.append(",SKU_ID=" + String.valueOf(SKU_ID));
			sb.append(",SALES=" + String.valueOf(SALES));
			sb.append(",UNITS=" + String.valueOf(UNITS));
			sb.append(",COST=" + String.valueOf(COST));
			sb.append(",SCANS=" + String.valueOf(SCANS));
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

			if (SKU_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(SKU_ID);
			}

			sb.append("|");

			if (SALES == null) {
				sb.append("<null>");
			} else {
				sb.append(SALES);
			}

			sb.append("|");

			if (UNITS == null) {
				sb.append("<null>");
			} else {
				sb.append(UNITS);
			}

			sb.append("|");

			if (COST == null) {
				sb.append("<null>");
			} else {
				sb.append(COST);
			}

			sb.append("|");

			if (SCANS == null) {
				sb.append("<null>");
			} else {
				sb.append(SCANS);
			}

			sb.append("|");

			return sb.toString();
		}

		/**
		 * Compare keys
		 */
		public int compareTo(OutStruct other) {

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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_DROP_SHIP_REVENUE = new byte[0];

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

			return "yyyy-MM-dd HH:mm:ss";

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
			return 38;
		}

		public Integer STORE_NOPrecision() {
			return 0;
		}

		public String STORE_NODefault() {

			return null;

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
			return 38;
		}

		public Integer SKU_IDPrecision() {
			return 0;
		}

		public String SKU_IDDefault() {

			return null;

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

		public BigDecimal BASKET_SPEND;

		public BigDecimal getBASKET_SPEND() {
			return this.BASKET_SPEND;
		}

		public Boolean BASKET_SPENDIsNullable() {
			return true;
		}

		public Boolean BASKET_SPENDIsKey() {
			return false;
		}

		public Integer BASKET_SPENDLength() {
			return 38;
		}

		public Integer BASKET_SPENDPrecision() {
			return 4;
		}

		public String BASKET_SPENDDefault() {

			return null;

		}

		public String BASKET_SPENDComment() {

			return "";

		}

		public String BASKET_SPENDPattern() {

			return "";

		}

		public String BASKET_SPENDOriginalDbColumnName() {

			return "BASKET_SPEND";

		}

		public BigDecimal ITEMS;

		public BigDecimal getITEMS() {
			return this.ITEMS;
		}

		public Boolean ITEMSIsNullable() {
			return true;
		}

		public Boolean ITEMSIsKey() {
			return false;
		}

		public Integer ITEMSLength() {
			return 38;
		}

		public Integer ITEMSPrecision() {
			return 0;
		}

		public String ITEMSDefault() {

			return null;

		}

		public String ITEMSComment() {

			return "";

		}

		public String ITEMSPattern() {

			return "";

		}

		public String ITEMSOriginalDbColumnName() {

			return "ITEMS";

		}

		public Double COST;

		public Double getCOST() {
			return this.COST;
		}

		public Boolean COSTIsNullable() {
			return true;
		}

		public Boolean COSTIsKey() {
			return false;
		}

		public Integer COSTLength() {
			return null;
		}

		public Integer COSTPrecision() {
			return null;
		}

		public String COSTDefault() {

			return null;

		}

		public String COSTComment() {

			return "";

		}

		public String COSTPattern() {

			return "";

		}

		public String COSTOriginalDbColumnName() {

			return "COST";

		}

		public BigDecimal SCANS;

		public BigDecimal getSCANS() {
			return this.SCANS;
		}

		public Boolean SCANSIsNullable() {
			return true;
		}

		public Boolean SCANSIsKey() {
			return false;
		}

		public Integer SCANSLength() {
			return 18;
		}

		public Integer SCANSPrecision() {
			return 2;
		}

		public String SCANSDefault() {

			return null;

		}

		public String SCANSComment() {

			return "";

		}

		public String SCANSPattern() {

			return "";

		}

		public String SCANSOriginalDbColumnName() {

			return "SCANS";

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

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.BASKET_SPEND = (BigDecimal) dis.readObject();

					this.ITEMS = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.COST = null;
					} else {
						this.COST = dis.readDouble();
					}

					this.SCANS = (BigDecimal) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_DROP_SHIP_REVENUE) {

				try {

					int length = 0;

					this.TRANSACTION_DATE = readDate(dis);

					this.STORE_NO = (BigDecimal) dis.readObject();

					this.SKU_ID = (BigDecimal) dis.readObject();

					this.BASKET_SPEND = (BigDecimal) dis.readObject();

					this.ITEMS = (BigDecimal) dis.readObject();

					length = dis.readByte();
					if (length == -1) {
						this.COST = null;
					} else {
						this.COST = dis.readDouble();
					}

					this.SCANS = (BigDecimal) dis.readObject();

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

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.BASKET_SPEND);

				// BigDecimal

				dos.writeObject(this.ITEMS);

				// Double

				if (this.COST == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.COST);
				}

				// BigDecimal

				dos.writeObject(this.SCANS);

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

				// BigDecimal

				dos.writeObject(this.SKU_ID);

				// BigDecimal

				dos.writeObject(this.BASKET_SPEND);

				// BigDecimal

				dos.writeObject(this.ITEMS);

				// Double

				if (this.COST == null) {
					dos.writeByte(-1);
				} else {
					dos.writeByte(0);
					dos.writeDouble(this.COST);
				}

				// BigDecimal

				dos.writeObject(this.SCANS);

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
			sb.append(",SKU_ID=" + String.valueOf(SKU_ID));
			sb.append(",BASKET_SPEND=" + String.valueOf(BASKET_SPEND));
			sb.append(",ITEMS=" + String.valueOf(ITEMS));
			sb.append(",COST=" + String.valueOf(COST));
			sb.append(",SCANS=" + String.valueOf(SCANS));
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

			if (SKU_ID == null) {
				sb.append("<null>");
			} else {
				sb.append(SKU_ID);
			}

			sb.append("|");

			if (BASKET_SPEND == null) {
				sb.append("<null>");
			} else {
				sb.append(BASKET_SPEND);
			}

			sb.append("|");

			if (ITEMS == null) {
				sb.append("<null>");
			} else {
				sb.append(ITEMS);
			}

			sb.append("|");

			if (COST == null) {
				sb.append("<null>");
			} else {
				sb.append(COST);
			}

			sb.append("|");

			if (SCANS == null) {
				sb.append("<null>");
			} else {
				sb.append(SCANS);
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
				OutStruct Out = new OutStruct();

				/**
				 * [tDBOutput_1 begin ] start
				 */

				ok_Hash.put("tDBOutput_1", false);
				start_Hash.put("tDBOutput_1", System.currentTimeMillis());

				currentComponent = "tDBOutput_1";

				cLabel = "DROP_SHIP_REVENUE";

				runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, 0, 0, "Out");

				int tos_count_tDBOutput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBOutput_1", "DROP_SHIP_REVENUE", "tSnowflakeOutput");
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

				props_tDBOutput_1.connection.setValue("useCustomRegion", false);

				props_tDBOutput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_3");

				props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBOutput_1.table.setValue("tableName", "DROP_SHIP_REVENUE");

				props_tDBOutput_1.table.connection.setValue("useCustomRegion", false);

				props_tDBOutput_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBOutput_1.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_3");

				props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBOutput_1_2_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"MAIN\",\"fields\":[{", s);

						a("\"name\":\"TRANSACTION_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_DATE\",\"talend.field.dbColumnName\":\"TRANSACTION_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"TRANSACTION_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"STORE_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"STORE_NO\",\"talend.field.dbColumnName\":\"STORE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"STORE_NO\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SKU_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SKU_ID\",\"talend.field.dbColumnName\":\"SKU_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SKU_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SALES\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SALES\",\"talend.field.dbColumnName\":\"SALES\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SALES\",\"talend.field.precision\":\"4\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"UNITS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UNITS\",\"talend.field.dbColumnName\":\"UNITS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UNITS\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COST\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COST\",\"talend.field.dbColumnName\":\"COST\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COST\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SCANS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCANS\",\"talend.field.dbColumnName\":\"SCANS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"18\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCANS\",\"talend.field.precision\":\"2\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"MAIN\"}",
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
				int count_Out_tMap_1 = 0;

				OutStruct Out_tmp = new OutStruct();
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

				cLabel = "MARGIN_TRANSACTION";

				int tos_count_tDBInput_1 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_1", "MARGIN_TRANSACTION", "tSnowflakeInput");
					talendJobLogProcess(globalMap);
				}

				boolean doesNodeBelongToRequest_tDBInput_1 = 0 == 0;
				@SuppressWarnings("unchecked")
				java.util.Map<String, Object> restRequest_tDBInput_1 = (java.util.Map<String, Object>) globalMap
						.get("restRequest");
				String currentTRestRequestOperation_tDBInput_1 = (String) (restRequest_tDBInput_1 != null
						? restRequest_tDBInput_1.get("OPERATION")
						: null);

				org.talend.components.api.component.ComponentDefinition def_tDBInput_1 = new org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputDefinition();

				org.talend.components.api.component.runtime.Writer writer_tDBInput_1 = null;
				org.talend.components.api.component.runtime.Reader reader_tDBInput_1 = null;

				org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties props_tDBInput_1 = (org.talend.components.snowflake.tsnowflakeinput.TSnowflakeInputProperties) def_tDBInput_1
						.createRuntimeProperties();
				props_tDBInput_1.setValue("manualQuery", true);

				props_tDBInput_1.setValue("query",
						"SELECT TRANSACTION_DATE, STORE_NO, SKU_ID,Basket_spend, Items, COST,SCANS from PROD_DATA.INVENTORY.MARGIN_TRANSACTION\n"
								+ " where store_no=6103 and transaction_date > '" + context.Transaction_date + "' ");

				props_tDBInput_1.connection.setValue("useCustomRegion", false);

				props_tDBInput_1.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_1.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_1.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBInput_1.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBInput_1.table.setValue("tableName", "MARGIN_TRANSACTION");

				props_tDBInput_1.table.connection.setValue("useCustomRegion", false);

				props_tDBInput_1.table.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_1.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_1.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_2");

				props_tDBInput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBInput_1_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"MAIN\",\"fields\":[{", s);

						a("\"name\":\"TRANSACTION_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRANSACTION_DATE\",\"talend.field.dbColumnName\":\"TRANSACTION_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"TRANSACTION_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"STORE_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"STORE_NO\",\"talend.field.dbColumnName\":\"STORE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"STORE_NO\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SKU_ID\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SKU_ID\",\"talend.field.dbColumnName\":\"SKU_ID\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SKU_ID\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"BASKET_SPEND\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BASKET_SPEND\",\"talend.field.dbColumnName\":\"BASKET_SPEND\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BASKET_SPEND\",\"talend.field.precision\":\"4\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"ITEMS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEMS\",\"talend.field.dbColumnName\":\"ITEMS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"38\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEMS\",\"talend.field.precision\":\"0\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"COST\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COST\",\"talend.field.dbColumnName\":\"COST\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COST\",\"di.column.relatedEntity\":\"\"},{",
								s);

						a("\"name\":\"SCANS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCANS\",\"talend.field.dbColumnName\":\"SCANS\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"talend.field.length\":\"18\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCANS\",\"talend.field.precision\":\"2\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"MAIN\",\"di.table.label\":\"MAIN\"}",
								s);

						return s.toString();

					}

					void a(String part, StringBuilder strB) {
						strB.append(part);
					}

				}

				SchemaSettingTool_tDBInput_1_1_fisrt sst_tDBInput_1_1_fisrt = new SchemaSettingTool_tDBInput_1_1_fisrt();

				props_tDBInput_1.table.main.setValue("schema",
						new org.apache.avro.Schema.Parser().parse(sst_tDBInput_1_1_fisrt.getSchemaValue()));

				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_1.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_1);
					}
				}
				if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBInput_1.table.connection.referencedComponent.referenceType
						.getValue()) {
					final String referencedComponentInstanceId_tDBInput_1 = props_tDBInput_1.table.connection.referencedComponent.componentInstanceId
							.getStringValue();
					if (referencedComponentInstanceId_tDBInput_1 != null) {
						org.talend.daikon.properties.Properties referencedComponentProperties_tDBInput_1 = (org.talend.daikon.properties.Properties) globalMap
								.get(referencedComponentInstanceId_tDBInput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
						props_tDBInput_1.table.connection.referencedComponent
								.setReference(referencedComponentProperties_tDBInput_1);
					}
				}
				globalMap.put("tDBInput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBInput_1);
				globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
				globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
				java.net.URL mappings_url_tDBInput_1 = this.getClass().getResource("/xmlMappings");
				globalMap.put("tDBInput_1_MAPPINGS_URL", mappings_url_tDBInput_1);

				org.talend.components.api.container.RuntimeContainer container_tDBInput_1 = new org.talend.components.api.container.RuntimeContainer() {
					public Object getComponentData(String componentId, String key) {
						return globalMap.get(componentId + "_" + key);
					}

					public void setComponentData(String componentId, String key, Object data) {
						globalMap.put(componentId + "_" + key, data);
					}

					public String getCurrentComponentId() {
						return "tDBInput_1";
					}

					public Object getGlobalData(String key) {
						return globalMap.get(key);
					}
				};

				int nb_line_tDBInput_1 = 0;

				org.talend.components.api.component.ConnectorTopology topology_tDBInput_1 = null;
				topology_tDBInput_1 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

				org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBInput_1 = def_tDBInput_1.getRuntimeInfo(
						org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBInput_1,
						topology_tDBInput_1);
				java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBInput_1 = def_tDBInput_1
						.getSupportedConnectorTopologies();

				org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBInput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime) (Class
						.forName(runtime_info_tDBInput_1.getRuntimeClassName()).newInstance());
				org.talend.daikon.properties.ValidationResult initVr_tDBInput_1 = componentRuntime_tDBInput_1
						.initialize(container_tDBInput_1, props_tDBInput_1);

				if (initVr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
					throw new RuntimeException(initVr_tDBInput_1.getMessage());
				}

				if (componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
					org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBInput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization) componentRuntime_tDBInput_1;
					compDriverInitialization_tDBInput_1.runAtDriver(container_tDBInput_1);
				}

				org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBInput_1 = null;
				if (componentRuntime_tDBInput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
					sourceOrSink_tDBInput_1 = (org.talend.components.api.component.runtime.SourceOrSink) componentRuntime_tDBInput_1;
					if (doesNodeBelongToRequest_tDBInput_1) {
						org.talend.daikon.properties.ValidationResult vr_tDBInput_1 = sourceOrSink_tDBInput_1
								.validate(container_tDBInput_1);
						if (vr_tDBInput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR) {
							throw new RuntimeException(vr_tDBInput_1.getMessage());
						}
					}
				}

				if (sourceOrSink_tDBInput_1 instanceof org.talend.components.api.component.runtime.Source) {
					org.talend.components.api.component.runtime.Source source_tDBInput_1 = (org.talend.components.api.component.runtime.Source) sourceOrSink_tDBInput_1;
					reader_tDBInput_1 = source_tDBInput_1.createReader(container_tDBInput_1);
					reader_tDBInput_1 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(
							reader_tDBInput_1, container_tDBInput_1);

					boolean multi_output_is_allowed_tDBInput_1 = false;
					org.talend.components.api.component.Connector c_tDBInput_1 = null;
					for (org.talend.components.api.component.Connector currentConnector : props_tDBInput_1
							.getAvailableConnectors(null, true)) {
						if (currentConnector.getName().equals("MAIN")) {
							c_tDBInput_1 = currentConnector;
						}

						if (currentConnector.getName().equals("REJECT")) {// it's better to move the code to javajet
							multi_output_is_allowed_tDBInput_1 = true;
						}
					}
					org.apache.avro.Schema schema_tDBInput_1 = props_tDBInput_1.getSchema(c_tDBInput_1, true);

					org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBInput_1 = org.talend.codegen.enforcer.EnforcerCreator
							.createOutgoingEnforcer(schema_tDBInput_1, false);

					// Create a reusable factory that converts the output of the reader to an
					// IndexedRecord.
					org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBInput_1 = null;

					// Iterate through the incoming data.
					boolean available_tDBInput_1 = reader_tDBInput_1.start();

					resourceMap.put("reader_tDBInput_1", reader_tDBInput_1);

					for (; available_tDBInput_1; available_tDBInput_1 = reader_tDBInput_1.advance()) {
						nb_line_tDBInput_1++;

						if (multi_output_is_allowed_tDBInput_1) {

							row1 = null;

						}

						try {
							Object data_tDBInput_1 = reader_tDBInput_1.getCurrent();

							if (multi_output_is_allowed_tDBInput_1) {
								row1 = new row1Struct();
							}

							// Construct the factory once when the first data arrives.
							if (factory_tDBInput_1 == null) {
								factory_tDBInput_1 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>) new org.talend.daikon.avro.AvroRegistry()
										.createIndexedRecordConverter(data_tDBInput_1.getClass());
							}

							// Enforce the outgoing schema on the input.
							outgoingEnforcer_tDBInput_1.setWrapped(factory_tDBInput_1.convertToAvro(data_tDBInput_1));
							Object columnValue_0_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(0);
							row1.TRANSACTION_DATE = (java.util.Date) (columnValue_0_tDBInput_1);
							Object columnValue_1_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(1);
							row1.STORE_NO = (BigDecimal) (columnValue_1_tDBInput_1);
							Object columnValue_2_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(2);
							row1.SKU_ID = (BigDecimal) (columnValue_2_tDBInput_1);
							Object columnValue_3_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(3);
							row1.BASKET_SPEND = (BigDecimal) (columnValue_3_tDBInput_1);
							Object columnValue_4_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(4);
							row1.ITEMS = (BigDecimal) (columnValue_4_tDBInput_1);
							Object columnValue_5_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(5);
							row1.COST = (Double) (columnValue_5_tDBInput_1);
							Object columnValue_6_tDBInput_1 = outgoingEnforcer_tDBInput_1.get(6);
							row1.SCANS = (BigDecimal) (columnValue_6_tDBInput_1);
						} catch (org.talend.components.api.exception.DataRejectException e_tDBInput_1) {
							java.util.Map<String, Object> info_tDBInput_1 = e_tDBInput_1.getRejectInfo();

							// TODO use a method instead of getting method by the special key
							// "error/errorMessage"
							Object errorMessage_tDBInput_1 = null;
							if (info_tDBInput_1.containsKey("error")) {
								errorMessage_tDBInput_1 = info_tDBInput_1.get("error");
							} else if (info_tDBInput_1.containsKey("errorMessage")) {
								errorMessage_tDBInput_1 = info_tDBInput_1.get("errorMessage");
							} else {
								errorMessage_tDBInput_1 = "Rejected but error message missing";
							}
							errorMessage_tDBInput_1 = "Row " + nb_line_tDBInput_1 + ": " + errorMessage_tDBInput_1;
							System.err.println(errorMessage_tDBInput_1);

							// If the record is reject, the main line record should put NULL
							row1 = null;

						} // end of catch

						java.lang.Iterable<?> outgoingMainRecordsList_tDBInput_1 = new java.util.ArrayList<Object>();
						java.util.Iterator outgoingMainRecordsIt_tDBInput_1 = null;

						/**
						 * [tDBInput_1 begin ] stop
						 */

						/**
						 * [tDBInput_1 main ] start
						 */

						currentComponent = "tDBInput_1";

						cLabel = "MARGIN_TRANSACTION";

						tos_count_tDBInput_1++;

						/**
						 * [tDBInput_1 main ] stop
						 */

						/**
						 * [tDBInput_1 process_data_begin ] start
						 */

						currentComponent = "tDBInput_1";

						cLabel = "MARGIN_TRANSACTION";

						/**
						 * [tDBInput_1 process_data_begin ] stop
						 */

						/**
						 * [tMap_1 main ] start
						 */

						currentComponent = "tMap_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row1", "tDBInput_1", "MARGIN_TRANSACTION", "tSnowflakeInput", "tMap_1", "tMap_1",
								"tMap"

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

							Out = null;

// # Output table : 'Out'
							count_Out_tMap_1++;

							Out_tmp.TRANSACTION_DATE = row1.TRANSACTION_DATE;
							Out_tmp.STORE_NO = row1.STORE_NO;
							Out_tmp.SKU_ID = row1.SKU_ID;
							Out_tmp.SALES = row1.BASKET_SPEND;
							Out_tmp.UNITS = row1.ITEMS;
							Out_tmp.COST = row1.COST;
							Out_tmp.SCANS = row1.SCANS;
							Out = Out_tmp;
							log.debug("tMap_1 - Outputting the record " + count_Out_tMap_1
									+ " of the output table 'Out'.");

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
// Start of branch "Out"
						if (Out != null) {

							/**
							 * [tDBOutput_1 main ] start
							 */

							currentComponent = "tDBOutput_1";

							cLabel = "DROP_SHIP_REVENUE";

							if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

									, "Out", "tMap_1", "tMap_1", "tMap", "tDBOutput_1", "DROP_SHIP_REVENUE",
									"tSnowflakeOutput"

							)) {
								talendJobLogProcess(globalMap);
							}

							if (log.isTraceEnabled()) {
								log.trace("Out - " + (Out == null ? "" : Out.toLogString()));
							}

							if (incomingEnforcer_tDBOutput_1 != null) {
								incomingEnforcer_tDBOutput_1.createNewRecord();
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema()
									.getField("TRANSACTION_DATE") != null) {
								incomingEnforcer_tDBOutput_1.put("TRANSACTION_DATE", Out.TRANSACTION_DATE);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("STORE_NO") != null) {
								incomingEnforcer_tDBOutput_1.put("STORE_NO", Out.STORE_NO);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SKU_ID") != null) {
								incomingEnforcer_tDBOutput_1.put("SKU_ID", Out.SKU_ID);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SALES") != null) {
								incomingEnforcer_tDBOutput_1.put("SALES", Out.SALES);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UNITS") != null) {
								incomingEnforcer_tDBOutput_1.put("UNITS", Out.UNITS);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COST") != null) {
								incomingEnforcer_tDBOutput_1.put("COST", Out.COST);
							}
							// skip the put action if the input column doesn't appear in component runtime
							// schema
							if (incomingEnforcer_tDBOutput_1 != null
									&& incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCANS") != null) {
								incomingEnforcer_tDBOutput_1.put("SCANS", Out.SCANS);
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

							cLabel = "DROP_SHIP_REVENUE";

							/**
							 * [tDBOutput_1 process_data_begin ] stop
							 */

							/**
							 * [tDBOutput_1 process_data_end ] start
							 */

							currentComponent = "tDBOutput_1";

							cLabel = "DROP_SHIP_REVENUE";

							/**
							 * [tDBOutput_1 process_data_end ] stop
							 */

						} // End of branch "Out"

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

						cLabel = "MARGIN_TRANSACTION";

						/**
						 * [tDBInput_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_1 end ] start
						 */

						currentComponent = "tDBInput_1";

						cLabel = "MARGIN_TRANSACTION";

// end of generic

						resourceMap.put("finish_tDBInput_1", Boolean.TRUE);

					} // while
				} // end of "if (sourceOrSink_tDBInput_1 instanceof ...Source)"
				java.util.Map<String, Object> resultMap_tDBInput_1 = null;
				if (reader_tDBInput_1 != null) {
					reader_tDBInput_1.close();
					resultMap_tDBInput_1 = reader_tDBInput_1.getReturnValues();
				}
				if (resultMap_tDBInput_1 != null) {
					for (java.util.Map.Entry<String, Object> entry_tDBInput_1 : resultMap_tDBInput_1.entrySet()) {
						switch (entry_tDBInput_1.getKey()) {
						case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE:
							container_tDBInput_1.setComponentData("tDBInput_1", "ERROR_MESSAGE",
									entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_LINE", entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_SUCCESS",
									entry_tDBInput_1.getValue());
							break;
						case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT:
							container_tDBInput_1.setComponentData("tDBInput_1", "NB_REJECT",
									entry_tDBInput_1.getValue());
							break;
						default:
							StringBuilder studio_key_tDBInput_1 = new StringBuilder();
							for (int i_tDBInput_1 = 0; i_tDBInput_1 < entry_tDBInput_1.getKey()
									.length(); i_tDBInput_1++) {
								char ch_tDBInput_1 = entry_tDBInput_1.getKey().charAt(i_tDBInput_1);
								if (Character.isUpperCase(ch_tDBInput_1) && i_tDBInput_1 > 0) {
									studio_key_tDBInput_1.append('_');
								}
								studio_key_tDBInput_1.append(ch_tDBInput_1);
							}
							container_tDBInput_1.setComponentData("tDBInput_1",
									studio_key_tDBInput_1.toString().toUpperCase(java.util.Locale.ENGLISH),
									entry_tDBInput_1.getValue());
							break;
						}
					}
				}

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
				log.debug("tMap_1 - Written records count in the table 'Out': " + count_Out_tMap_1 + ".");

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row1", 2, 0,
						"tDBInput_1", "MARGIN_TRANSACTION", "tSnowflakeInput", "tMap_1", "tMap_1", "tMap", "output")) {
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

				cLabel = "DROP_SHIP_REVENUE";

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

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "Out", 2, 0, "tMap_1",
						"tMap_1", "tMap", "tDBOutput_1", "DROP_SHIP_REVENUE", "tSnowflakeOutput", "output")) {
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

				cLabel = "MARGIN_TRANSACTION";

// finally of generic

				if (resourceMap.get("finish_tDBInput_1") == null) {
					if (resourceMap.get("reader_tDBInput_1") != null) {
						try {
							((org.talend.components.api.component.runtime.Reader) resourceMap.get("reader_tDBInput_1"))
									.close();
						} catch (java.io.IOException e_tDBInput_1) {
							String errorMessage_tDBInput_1 = "failed to release the resource in tDBInput_1 :"
									+ e_tDBInput_1.getMessage();
							System.err.println(errorMessage_tDBInput_1);
						}
					}
				}

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
				 * [tDBOutput_1 finally ] start
				 */

				currentComponent = "tDBOutput_1";

				cLabel = "DROP_SHIP_REVENUE";

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
				tDBClose_2Process(globalMap);

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
					runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBClose_1Process(globalMap);

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

				props_tDBClose_1.referencedComponent.setValue("componentInstanceId", "tDBConnection_3");

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

				cLabel = "PROD_DATA";

				int tos_count_tDBConnection_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_2", "PROD_DATA", "tSnowflakeConnection");
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

				props_tDBConnection_2.setValue("role", "sysadmin");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:zcKnMGIvSMPMBM/sc1bwZZsaW8gzrdE6cmjoC4Fck34Cyd6b"));

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

				cLabel = "PROD_DATA";

				tos_count_tDBConnection_2++;

				/**
				 * [tDBConnection_2 main ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "PROD_DATA";

				/**
				 * [tDBConnection_2 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_2 process_data_end ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "PROD_DATA";

				/**
				 * [tDBConnection_2 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_2 end ] start
				 */

				currentComponent = "tDBConnection_2";

				cLabel = "PROD_DATA";

// end of generic

				ok_Hash.put("tDBConnection_2", true);
				end_Hash.put("tDBConnection_2", System.currentTimeMillis());

				if (execStat) {
					runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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

				cLabel = "PROD_DATA";

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

				cLabel = "MSTR_DB ";

				int tos_count_tDBConnection_3 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_3", "MSTR_DB ", "tSnowflakeConnection");
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
								"enc:routine.encryption.key.v1:dJTakoXNR+gyC7H0XgVSULjoQ2o9mhcnBA+NiEtOTDhd2mv6"));

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

				cLabel = "MSTR_DB ";

				tos_count_tDBConnection_3++;

				/**
				 * [tDBConnection_3 main ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_begin ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "MSTR_DB ";

				/**
				 * [tDBConnection_3 process_data_begin ] stop
				 */

				/**
				 * [tDBConnection_3 process_data_end ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "MSTR_DB ";

				/**
				 * [tDBConnection_3 process_data_end ] stop
				 */

				/**
				 * [tDBConnection_3 end ] start
				 */

				currentComponent = "tDBConnection_3";

				cLabel = "MSTR_DB ";

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

				cLabel = "MSTR_DB ";

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
		final DROP_SHIP_REVENUE DROP_SHIP_REVENUEClass = new DROP_SHIP_REVENUE();

		int exitCode = DROP_SHIP_REVENUEClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'DROP_SHIP_REVENUE' - Done.");
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
		log.info("TalendJob: 'DROP_SHIP_REVENUE' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_UNxWgArAEe6WaNrWmUUUzw");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-14T15:06:09.737003800Z");

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
			java.io.InputStream inContext = DROP_SHIP_REVENUE.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/drop_ship_revenue_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = DROP_SHIP_REVENUE.class.getClassLoader()
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
					context.setContextType("Transaction_date", "id_String");
					if (context.getStringValue("Transaction_date") == null) {
						context.Transaction_date = null;
					} else {
						context.Transaction_date = (String) context.getProperty("Transaction_date");
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
			if (parentContextMap.containsKey("Transaction_date")) {
				context.Transaction_date = (String) parentContextMap.get("Transaction_date");
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
		log.info("TalendJob: 'DROP_SHIP_REVENUE' - Started.");
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
			tDBInput_2Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tDBInput_2) {
			globalMap.put("tDBInput_2_SUBPROCESS_STATE", -1);

			e_tDBInput_2.printStackTrace();

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
					(endUsedMemory - startUsedMemory) + " bytes memory increase when running : DROP_SHIP_REVENUE");
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
		log.info("TalendJob: 'DROP_SHIP_REVENUE' - Finished - status: " + status + " returnCode: " + returnCode);

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
 * 207612 characters generated by Talend Cloud Data Management Platform on the
 * June 14, 2023 at 11:06:09 AM EDT
 ************************************************************************************************/