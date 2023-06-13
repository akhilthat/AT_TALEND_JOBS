
package at_talend_jobs.yfs_charge_transaction_h_0_1;

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
 * Job: YFS_CHARGE_TRANSACTION_H Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class YFS_CHARGE_TRANSACTION_H implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "YFS_CHARGE_TRANSACTION_H.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager
			.getLogger(YFS_CHARGE_TRANSACTION_H.class);

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

			if (oms_reader_db != null) {

				this.setProperty("oms_reader_db", oms_reader_db.toString());

			}

			if (oms_reader_host != null) {

				this.setProperty("oms_reader_host", oms_reader_host.toString());

			}

			if (oms_reader_port != null) {

				this.setProperty("oms_reader_port", oms_reader_port.toString());

			}

			if (oms_reader_pwd != null) {

				this.setProperty("oms_reader_pwd", oms_reader_pwd.toString());

			}

			if (oms_reader_serviceid != null) {

				this.setProperty("oms_reader_serviceid", oms_reader_serviceid.toString());

			}

			if (oms_reader_user_id != null) {

				this.setProperty("oms_reader_user_id", oms_reader_user_id.toString());

			}

			if (SF_account != null) {

				this.setProperty("SF_account", SF_account.toString());

			}

			if (SF_prod_database != null) {

				this.setProperty("SF_prod_database", SF_prod_database.toString());

			}

			if (SF_oms_database != null) {

				this.setProperty("SF_oms_database", SF_oms_database.toString());

			}

			if (SF_oms_schema != null) {

				this.setProperty("SF_oms_schema", SF_oms_schema.toString());

			}

			if (SF_oms_warehouse != null) {

				this.setProperty("SF_oms_warehouse", SF_oms_warehouse.toString());

			}

			if (SF_password != null) {

				this.setProperty("SF_password", SF_password.toString());

			}

			if (SF_user_id != null) {

				this.setProperty("SF_user_id", SF_user_id.toString());

			}

			if (SF_warehouse != null) {

				this.setProperty("SF_warehouse", SF_warehouse.toString());

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

		public String oms_reader_db;

		public String getOms_reader_db() {
			return this.oms_reader_db;
		}

		public String oms_reader_host;

		public String getOms_reader_host() {
			return this.oms_reader_host;
		}

		public String oms_reader_port;

		public String getOms_reader_port() {
			return this.oms_reader_port;
		}

		public java.lang.String oms_reader_pwd;

		public java.lang.String getOms_reader_pwd() {
			return this.oms_reader_pwd;
		}

		public String oms_reader_serviceid;

		public String getOms_reader_serviceid() {
			return this.oms_reader_serviceid;
		}

		public String oms_reader_user_id;

		public String getOms_reader_user_id() {
			return this.oms_reader_user_id;
		}

		public String SF_account;

		public String getSF_account() {
			return this.SF_account;
		}

		public String SF_prod_database;

		public String getSF_prod_database() {
			return this.SF_prod_database;
		}

		public String SF_oms_database;

		public String getSF_oms_database() {
			return this.SF_oms_database;
		}

		public String SF_oms_schema;

		public String getSF_oms_schema() {
			return this.SF_oms_schema;
		}

		public String SF_oms_warehouse;

		public String getSF_oms_warehouse() {
			return this.SF_oms_warehouse;
		}

		public java.lang.String SF_password;

		public java.lang.String getSF_password() {
			return this.SF_password;
		}

		public String SF_user_id;

		public String getSF_user_id() {
			return this.SF_user_id;
		}

		public String SF_warehouse;

		public String getSF_warehouse() {
			return this.SF_warehouse;
		}
	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "YFS_CHARGE_TRANSACTION_H";
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
			"_MzQUgOv4Eeui_7U8UwU2ug", "0.1");
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
					YFS_CHARGE_TRANSACTION_H.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(YFS_CHARGE_TRANSACTION_H.this, new Object[] { e, currentComponent, globalMap });
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

	public void tLogRow_1_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
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
		final static byte[] commonByteArrayLock_AT_TALEND_JOBS_YFS_CHARGE_TRANSACTION_H = new byte[0];
		static byte[] commonByteArray_AT_TALEND_JOBS_YFS_CHARGE_TRANSACTION_H = new byte[0];

		public routines.system.Dynamic newColumn;

		public routines.system.Dynamic getNewColumn() {
			return this.newColumn;
		}

		public Boolean newColumnIsNullable() {
			return true;
		}

		public Boolean newColumnIsKey() {
			return false;
		}

		public Integer newColumnLength() {
			return null;
		}

		public Integer newColumnPrecision() {
			return null;
		}

		public String newColumnDefault() {

			return null;

		}

		public String newColumnComment() {

			return "";

		}

		public String newColumnPattern() {

			return "dd-MM-yyyy";

		}

		public String newColumnOriginalDbColumnName() {

			return "newColumn";

		}

		public void readData(ObjectInputStream dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_YFS_CHARGE_TRANSACTION_H) {

				try {

					int length = 0;

					this.newColumn = (routines.system.Dynamic) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void readData(org.jboss.marshalling.Unmarshaller dis) {

			synchronized (commonByteArrayLock_AT_TALEND_JOBS_YFS_CHARGE_TRANSACTION_H) {

				try {

					int length = 0;

					this.newColumn = (routines.system.Dynamic) dis.readObject();

				} catch (IOException e) {
					throw new RuntimeException(e);

				} catch (ClassNotFoundException eCNFE) {
					throw new RuntimeException(eCNFE);

				}

			}

		}

		public void writeData(ObjectOutputStream dos) {
			try {

				// Dynamic

				dos.writeObject(this.newColumn);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public void writeData(org.jboss.marshalling.Marshaller dos) {
			try {

				// Dynamic

				dos.writeObject(this.newColumn);

			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}

		public String toString() {

			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append("[");
			sb.append("newColumn=" + String.valueOf(newColumn));
			sb.append("]");

			return sb.toString();
		}

		public String toLogString() {
			StringBuilder sb = new StringBuilder();

			if (newColumn == null) {
				sb.append("<null>");
			} else {
				sb.append(newColumn);
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
							log4jParamters_tLogRow_1.append("BASIC_MODE" + " = " + "false");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("TABLE_PRINT" + " = " + "true");
							log4jParamters_tLogRow_1.append(" | ");
							log4jParamters_tLogRow_1.append("VERTICAL" + " = " + "false");
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

				class Util_tLogRow_1 {

					String[] des_top = { ".", ".", "-", "+" };

					String[] des_head = { "|=", "=|", "-", "+" };

					String[] des_bottom = { "'", "'", "-", "+" };

					String name = "";

					java.util.List<String[]> list = new java.util.ArrayList<String[]>();

					int[] colLengths = new int[1];

					public void addRow(String[] row) {

						for (int i = 0; i < 1; i++) {
							if (row[i] != null) {
								colLengths[i] = Math.max(colLengths[i], row[i].length());
							}
						}
						list.add(row);
					}

					public void setTableName(String name) {

						this.name = name;
					}

					public StringBuilder format() {

						StringBuilder sb = new StringBuilder();

						sb.append(print(des_top));

						int totals = 0;
						for (int i = 0; i < colLengths.length; i++) {
							totals = totals + colLengths[i];
						}

						// name
						sb.append("|");
						int k = 0;
						for (k = 0; k < (totals + 0 - name.length()) / 2; k++) {
							sb.append(' ');
						}
						sb.append(name);
						for (int i = 0; i < totals + 0 - name.length() - k; i++) {
							sb.append(' ');
						}
						sb.append("|\n");

						// head and rows
						sb.append(print(des_head));
						for (int i = 0; i < list.size(); i++) {

							String[] row = list.get(i);

							java.util.Formatter formatter = new java.util.Formatter(new StringBuilder());

							StringBuilder sbformat = new StringBuilder();
							sbformat.append("|%1$-");
							sbformat.append(colLengths[0]);
							sbformat.append("s");

							sbformat.append("|\n");

							formatter.format(sbformat.toString(), (Object[]) row);

							sb.append(formatter.toString());
							if (i == 0)
								sb.append(print(des_head)); // print the head
						}

						// end
						sb.append(print(des_bottom));
						return sb;
					}

					private StringBuilder print(String[] fillChars) {
						StringBuilder sb = new StringBuilder();
						// first column
						sb.append(fillChars[0]);

						// last column
						for (int i = 0; i < colLengths[0] - fillChars[0].length() - fillChars[1].length() + 2; i++) {
							sb.append(fillChars[2]);
						}
						sb.append(fillChars[1]);
						sb.append("\n");
						return sb;
					}

					public boolean isTableEmpty() {
						if (list.size() > 1)
							return false;
						return true;
					}
				}
				Util_tLogRow_1 util_tLogRow_1 = new Util_tLogRow_1();
				util_tLogRow_1.setTableName("tLogRow_1");
				util_tLogRow_1.addRow(new String[] { "newColumn", });
				StringBuilder strBuffer_tLogRow_1 = null;
				int nb_line_tLogRow_1 = 0;
///////////////////////    			

				/**
				 * [tLogRow_1 begin ] stop
				 */

				/**
				 * [tDBInput_2 begin ] start
				 */

				ok_Hash.put("tDBInput_2", false);
				start_Hash.put("tDBInput_2", System.currentTimeMillis());

				currentComponent = "tDBInput_2";

				int tos_count_tDBInput_2 = 0;

				if (enableLogStash) {
					talendJobLog.addCM("tDBInput_2", "tDBInput_2", "tSnowflakeInput");
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

				props_tDBInput_2.setValue("query", "SELECT * FROM PROD_DATA.INVENTORY.MARGIN_TRANSACTION limit 10");

				props_tDBInput_2.connection.setValue("useCustomRegion", false);

				props_tDBInput_2.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_2.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_2.connection.referencedComponent.setValue("componentInstanceId", "tDBConnection_2");

				props_tDBInput_2.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				props_tDBInput_2.table.setValue("tableName", "");

				props_tDBInput_2.table.connection.setValue("useCustomRegion", false);

				props_tDBInput_2.table.connection.userPassword.setValue("useAuth", false);

				props_tDBInput_2.table.connection.referencedComponent.setValue("referenceType",
						org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);

				props_tDBInput_2.table.connection.referencedComponent.setValue("componentInstanceId",
						"tDBConnection_2");

				props_tDBInput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
						"tSnowflakeConnection");

				class SchemaSettingTool_tDBInput_2_1_fisrt {

					String getSchemaValue() {

						StringBuilder s = new StringBuilder();

						a("{\"type\":\"record\",", s);

						a("\"name\":\"MAIN\",\"fields\":[],\"di.table.name\":\"MAIN\",\"di.table.label\":\"MAIN\",\"di.dynamic.column.comment\":\"\",\"di.dynamic.column.name\":\"newColumn\",\"talend.field.dbType\":\"\",\"di.column.talendType\":\"id_Dynamic\",\"talend.field.pattern\":\"dd-MM-yyyy\",\"di.column.isNullable\":\"true\",\"talend.field.scale\":\"0\",\"talend.field.dbColumnName\":\"newColumn\",\"di.column.relatedEntity\":\"\",\"di.column.relationshipType\":\"\",\"di.dynamic.column.position\":\"0\",\"include-all-fields\":\"true\"}",
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
					boolean initDyn_tDBInput_2 = false;
					routines.system.Dynamic dynamic_tDBInput_2 = new routines.system.Dynamic();
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
							if (!initDyn_tDBInput_2) {
								org.apache.avro.Schema dynSchema_tDBInput_2 = ((org.talend.codegen.enforcer.OutgoingDynamicSchemaEnforcer) outgoingEnforcer_tDBInput_2)
										.getDynamicFieldsSchema();
								for (org.apache.avro.Schema.Field dynamicField_tDBInput_2 : dynSchema_tDBInput_2
										.getFields()) {
									routines.system.DynamicMetadata dynamicMetadata_tDBInput_2 = new routines.system.DynamicMetadata();
									org.apache.avro.Schema dynamicFieldSchema_tDBInput_2 = dynamicField_tDBInput_2
											.schema();
									// set name
									if ("true".equals(dynamicField_tDBInput_2.getProp("ENABLE_SPECIAL_TABLENAME"))) {
										dynamicMetadata_tDBInput_2
												.setName(dynamicField_tDBInput_2.getProp("talend.field.dbColumnName"));
									} else {
										dynamicMetadata_tDBInput_2.setName(dynamicField_tDBInput_2.name());
									}
									// set db name
									dynamicMetadata_tDBInput_2.setDbName(dynamicField_tDBInput_2.name());
									// set nullable
									if (org.talend.daikon.avro.AvroUtils.isNullable(dynamicFieldSchema_tDBInput_2)) {
										dynamicMetadata_tDBInput_2.setNullable(true);
									}
									// set type
									String talendType_tDBInput_2 = org.talend.codegen.converter.TypeConverter
											.avroToDi(dynamicFieldSchema_tDBInput_2);
									dynamicMetadata_tDBInput_2.setType(talendType_tDBInput_2);
									// set pattern
									String pattern_tDBInput_2 = dynamicField_tDBInput_2
											.getProp(org.talend.daikon.avro.SchemaConstants.TALEND_COLUMN_PATTERN);
									if (pattern_tDBInput_2 != null && !pattern_tDBInput_2.trim().isEmpty()) {
										dynamicMetadata_tDBInput_2.setFormat(pattern_tDBInput_2);
									}
									// set logical type
									org.apache.avro.Schema unwrappedSchema_tDBInput_2 = org.talend.daikon.avro.AvroUtils
											.unwrapIfNullable(dynamicFieldSchema_tDBInput_2);
									String logicalType_tDBInput_2 = org.talend.daikon.avro.LogicalTypeUtils
											.getLogicalTypeName(unwrappedSchema_tDBInput_2);
									dynamicMetadata_tDBInput_2.setLogicalType(logicalType_tDBInput_2);
									// set length
									Object length_tDBInput_2 = dynamicField_tDBInput_2
											.getProp(org.talend.daikon.avro.SchemaConstants.TALEND_COLUMN_DB_LENGTH);
									if (length_tDBInput_2 != null) {
										dynamicMetadata_tDBInput_2
												.setLength(Integer.parseInt(String.valueOf(length_tDBInput_2)));
									}
									// set DbType
									Object dbType_tDBInput_2 = dynamicField_tDBInput_2
											.getProp(org.talend.daikon.avro.SchemaConstants.TALEND_COLUMN_DB_TYPE);
									if (dbType_tDBInput_2 != null) {
										dynamicMetadata_tDBInput_2.setDbType(String.valueOf(dbType_tDBInput_2));
									}
									// set precision
									Object precision_tDBInput_2 = dynamicField_tDBInput_2
											.getProp(org.talend.daikon.avro.SchemaConstants.TALEND_COLUMN_PRECISION);
									if (precision_tDBInput_2 != null) {
										dynamicMetadata_tDBInput_2
												.setPrecision(Integer.parseInt(String.valueOf(precision_tDBInput_2)));
									}
									// add dynamic field metadata to dynamic variable
									dynamic_tDBInput_2.metadatas.add(dynamicMetadata_tDBInput_2);
								}
								initDyn_tDBInput_2 = true;
							}
							dynamic_tDBInput_2.clearColumnValues();
							java.util.Map<String, Object> dynamicValue_tDBInput_2 = (java.util.Map<String, Object>) outgoingEnforcer_tDBInput_2
									.get(0);
							for (java.util.Map.Entry<String, Object> dynamicValueEntry_tDBInput_2 : dynamicValue_tDBInput_2
									.entrySet()) {
								dynamic_tDBInput_2.addColumnValue(dynamicValueEntry_tDBInput_2.getValue());
							}
							row2.newColumn = dynamic_tDBInput_2;
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

						tos_count_tDBInput_2++;

						/**
						 * [tDBInput_2 main ] stop
						 */

						/**
						 * [tDBInput_2 process_data_begin ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_begin ] stop
						 */

						/**
						 * [tLogRow_1 main ] start
						 */

						currentComponent = "tLogRow_1";

						if (runStat.update(execStat, enableLogStash, iterateId, 1, 1

								, "row2", "tDBInput_2", "tDBInput_2", "tSnowflakeInput", "tLogRow_1", "tLogRow_1",
								"tLogRow"

						)) {
							talendJobLogProcess(globalMap);
						}

						if (log.isTraceEnabled()) {
							log.trace("row2 - " + (row2 == null ? "" : row2.toLogString()));
						}

///////////////////////		

						String[] row_tLogRow_1 = new String[1];

						if (row2.newColumn != null) { //
							row_tLogRow_1[0] = String.valueOf(row2.newColumn);

						} //

						util_tLogRow_1.addRow(row_tLogRow_1);
						nb_line_tLogRow_1++;
						log.info("tLogRow_1 - Content of row " + nb_line_tLogRow_1 + ": "
								+ TalendString.unionString("|", row_tLogRow_1));
//////

//////                    

///////////////////////    			

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
						 * [tLogRow_1 process_data_end ] start
						 */

						currentComponent = "tLogRow_1";

						/**
						 * [tLogRow_1 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 process_data_end ] start
						 */

						currentComponent = "tDBInput_2";

						/**
						 * [tDBInput_2 process_data_end ] stop
						 */

						/**
						 * [tDBInput_2 end ] start
						 */

						currentComponent = "tDBInput_2";

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
				 * [tLogRow_1 end ] start
				 */

				currentComponent = "tLogRow_1";

//////

				java.io.PrintStream consoleOut_tLogRow_1 = null;
				if (globalMap.get("tLogRow_CONSOLE") != null) {
					consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
				} else {
					consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
					globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
				}

				consoleOut_tLogRow_1.println(util_tLogRow_1.format().toString());
				consoleOut_tLogRow_1.flush();
//////
				globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);
				if (log.isInfoEnabled())
					log.info("tLogRow_1 - " + ("Printed row count: ") + (nb_line_tLogRow_1) + ("."));

///////////////////////    			

				if (runStat.updateStatAndLog(execStat, enableLogStash, resourceMap, iterateId, "row2", 2, 0,
						"tDBInput_2", "tDBInput_2", "tSnowflakeInput", "tLogRow_1", "tLogRow_1", "tLogRow", "output")) {
					talendJobLogProcess(globalMap);
				}

				if (log.isDebugEnabled())
					log.debug("tLogRow_1 - " + ("Done."));

				ok_Hash.put("tLogRow_1", true);
				end_Hash.put("tLogRow_1", System.currentTimeMillis());

				/**
				 * [tLogRow_1 end ] stop
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
				 * [tDBInput_2 finally ] start
				 */

				currentComponent = "tDBInput_2";

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
				 * [tLogRow_1 finally ] start
				 */

				currentComponent = "tLogRow_1";

				/**
				 * [tLogRow_1 finally ] stop
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
					runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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
							log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_3");
							log4jParamters_tDBClose_2.append(" | ");
							log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
							log4jParamters_tDBClose_2.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBClose_2 - " + (log4jParamters_tDBClose_2));
						}
					}
					new BytesLimit65535_tDBClose_2().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tOracleClose");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tDBClose_2 begin ] stop
				 */

				/**
				 * [tDBClose_2 main ] start
				 */

				currentComponent = "tDBClose_2";

				java.sql.Connection conn_tDBClose_2 = (java.sql.Connection) globalMap.get("conn_tDBConnection_3");

				if (conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed()) {

					log.debug("tDBClose_2 - Closing the connection 'tDBConnection_3' to the database.");

					conn_tDBClose_2.close();

					if ("com.mysql.cj.jdbc.Driver".equals((String) globalMap.get("driverClass_tDBConnection_3"))
							&& routines.system.BundleUtils.inOSGi()) {
						Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").getMethod("checkedShutdown")
								.invoke(null, (Object[]) null);
					}

					log.debug("tDBClose_2 - Connection 'tDBConnection_3' to the database closed.");

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

				props_tDBConnection_2.setValue("warehouse", context.SF_oms_warehouse);

				props_tDBConnection_2.setValue("db", context.SF_oms_database);

				props_tDBConnection_2.setValue("schemaName", context.SF_oms_schema);

				props_tDBConnection_2.setValue("role", "sysadmin");

				props_tDBConnection_2.setValue("jdbcParameters", "");

				props_tDBConnection_2.setValue("autoCommit", true);

				props_tDBConnection_2.userPassword.setValue("useAuth", false);

				props_tDBConnection_2.userPassword.setValue("userId", "Talend_user");

				props_tDBConnection_2.userPassword.setValue("password",
						routines.system.PasswordEncryptUtil.decryptPassword(
								"enc:routine.encryption.key.v1:TVkb7y7g+lzWnlQ5BV5KLdRTYwVYnCMe/UoVdWWeRbBSKpo6"));

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
							log4jParamters_tDBConnection_3.append("CONNECTION_TYPE" + " = " + "ORACLE_SID");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("DB_VERSION" + " = " + "ORACLE_18");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USE_TNS_FILE" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("HOST" + " = " + "\"lin-vsi-omspdb3\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PORT" + " = " + "\"1881\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("DBNAME" + " = " + "\"OMSPROD\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("SCHEMA_DB" + " = " + "\"STERLING\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USER" + " = " + "\"sterling_reader01\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf(
									"enc:routine.encryption.key.v1:fvVd9LvuMLS6l2yI/bdAoCp6Av7+bX2nOUZfxXzfUFm1pE/5r04=")
									.substring(0, 4) + "...");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("PROPERTIES" + " = " + "\"\"");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("USE_SHARED_CONNECTION" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("AUTO_COMMIT" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("SUPPORT_NLS" + " = " + "false");
							log4jParamters_tDBConnection_3.append(" | ");
							log4jParamters_tDBConnection_3.append("UNIFIED_COMPONENTS" + " = " + "tOracleConnection");
							log4jParamters_tDBConnection_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tDBConnection_3 - " + (log4jParamters_tDBConnection_3));
						}
					}
					new BytesLimit65535_tDBConnection_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tDBConnection_3", "tDBConnection_3", "tOracleConnection");
					talendJobLogProcess(globalMap);
				}

				String url_tDBConnection_3 = "jdbc:oracle:thin:@" + "lin-vsi-omspdb3" + ":" + "1881" + ":" + "OMSPROD";
				globalMap.put("connectionType_" + "tDBConnection_3", "ORACLE_SID");
				String dbUser_tDBConnection_3 = "sterling_reader01";

				final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword(
						"enc:routine.encryption.key.v1:2FrinotaJTc8TVf5Xmr8pb3tlH2tloNfoaApG7dWrrtiuKOR3jk=");
				String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;

				java.sql.Connection conn_tDBConnection_3 = null;

				String driverClass_tDBConnection_3 = "oracle.jdbc.OracleDriver";
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
				globalMap.put("host_" + "tDBConnection_3", "lin-vsi-omspdb3");
				globalMap.put("port_" + "tDBConnection_3", "1881");
				globalMap.put("dbname_" + "tDBConnection_3", "OMSPROD");

				globalMap.put("dbschema_" + "tDBConnection_3", "STERLING");
				globalMap.put("username_" + "tDBConnection_3", "sterling_reader01");
				globalMap.put("password_" + "tDBConnection_3", dbPwd_tDBConnection_3);

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
		final YFS_CHARGE_TRANSACTION_H YFS_CHARGE_TRANSACTION_HClass = new YFS_CHARGE_TRANSACTION_H();

		int exitCode = YFS_CHARGE_TRANSACTION_HClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'YFS_CHARGE_TRANSACTION_H' - Done.");
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
		log.info("TalendJob: 'YFS_CHARGE_TRANSACTION_H' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_MzQUgOv4Eeui_7U8UwU2ug");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-13T17:53:19.755931200Z");

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
			java.io.InputStream inContext = YFS_CHARGE_TRANSACTION_H.class.getClassLoader().getResourceAsStream(
					"at_talend_jobs/yfs_charge_transaction_h_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = YFS_CHARGE_TRANSACTION_H.class.getClassLoader()
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
					context.setContextType("oms_reader_db", "id_String");
					if (context.getStringValue("oms_reader_db") == null) {
						context.oms_reader_db = null;
					} else {
						context.oms_reader_db = (String) context.getProperty("oms_reader_db");
					}
					context.setContextType("oms_reader_host", "id_String");
					if (context.getStringValue("oms_reader_host") == null) {
						context.oms_reader_host = null;
					} else {
						context.oms_reader_host = (String) context.getProperty("oms_reader_host");
					}
					context.setContextType("oms_reader_port", "id_String");
					if (context.getStringValue("oms_reader_port") == null) {
						context.oms_reader_port = null;
					} else {
						context.oms_reader_port = (String) context.getProperty("oms_reader_port");
					}
					context.setContextType("oms_reader_pwd", "id_Password");
					if (context.getStringValue("oms_reader_pwd") == null) {
						context.oms_reader_pwd = null;
					} else {
						String pwd_oms_reader_pwd_value = context.getProperty("oms_reader_pwd");
						context.oms_reader_pwd = null;
						if (pwd_oms_reader_pwd_value != null) {
							if (context_param.containsKey("oms_reader_pwd")) {// no need to decrypt if it come from
																				// program argument or parent job
																				// runtime
								context.oms_reader_pwd = pwd_oms_reader_pwd_value;
							} else if (!pwd_oms_reader_pwd_value.isEmpty()) {
								try {
									context.oms_reader_pwd = routines.system.PasswordEncryptUtil
											.decryptPassword(pwd_oms_reader_pwd_value);
									context.put("oms_reader_pwd", context.oms_reader_pwd);
								} catch (java.lang.RuntimeException e) {
									// do nothing
								}
							}
						}
					}
					context.setContextType("oms_reader_serviceid", "id_String");
					if (context.getStringValue("oms_reader_serviceid") == null) {
						context.oms_reader_serviceid = null;
					} else {
						context.oms_reader_serviceid = (String) context.getProperty("oms_reader_serviceid");
					}
					context.setContextType("oms_reader_user_id", "id_String");
					if (context.getStringValue("oms_reader_user_id") == null) {
						context.oms_reader_user_id = null;
					} else {
						context.oms_reader_user_id = (String) context.getProperty("oms_reader_user_id");
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
					context.setContextType("SF_oms_database", "id_String");
					if (context.getStringValue("SF_oms_database") == null) {
						context.SF_oms_database = null;
					} else {
						context.SF_oms_database = (String) context.getProperty("SF_oms_database");
					}
					context.setContextType("SF_oms_schema", "id_String");
					if (context.getStringValue("SF_oms_schema") == null) {
						context.SF_oms_schema = null;
					} else {
						context.SF_oms_schema = (String) context.getProperty("SF_oms_schema");
					}
					context.setContextType("SF_oms_warehouse", "id_String");
					if (context.getStringValue("SF_oms_warehouse") == null) {
						context.SF_oms_warehouse = null;
					} else {
						context.SF_oms_warehouse = (String) context.getProperty("SF_oms_warehouse");
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
			if (parentContextMap.containsKey("oms_reader_db")) {
				context.oms_reader_db = (String) parentContextMap.get("oms_reader_db");
			}
			if (parentContextMap.containsKey("oms_reader_host")) {
				context.oms_reader_host = (String) parentContextMap.get("oms_reader_host");
			}
			if (parentContextMap.containsKey("oms_reader_port")) {
				context.oms_reader_port = (String) parentContextMap.get("oms_reader_port");
			}
			if (parentContextMap.containsKey("oms_reader_pwd")) {
				context.oms_reader_pwd = (java.lang.String) parentContextMap.get("oms_reader_pwd");
			}
			if (parentContextMap.containsKey("oms_reader_serviceid")) {
				context.oms_reader_serviceid = (String) parentContextMap.get("oms_reader_serviceid");
			}
			if (parentContextMap.containsKey("oms_reader_user_id")) {
				context.oms_reader_user_id = (String) parentContextMap.get("oms_reader_user_id");
			}
			if (parentContextMap.containsKey("SF_account")) {
				context.SF_account = (String) parentContextMap.get("SF_account");
			}
			if (parentContextMap.containsKey("SF_prod_database")) {
				context.SF_prod_database = (String) parentContextMap.get("SF_prod_database");
			}
			if (parentContextMap.containsKey("SF_oms_database")) {
				context.SF_oms_database = (String) parentContextMap.get("SF_oms_database");
			}
			if (parentContextMap.containsKey("SF_oms_schema")) {
				context.SF_oms_schema = (String) parentContextMap.get("SF_oms_schema");
			}
			if (parentContextMap.containsKey("SF_oms_warehouse")) {
				context.SF_oms_warehouse = (String) parentContextMap.get("SF_oms_warehouse");
			}
			if (parentContextMap.containsKey("SF_password")) {
				context.SF_password = (java.lang.String) parentContextMap.get("SF_password");
			}
			if (parentContextMap.containsKey("SF_user_id")) {
				context.SF_user_id = (String) parentContextMap.get("SF_user_id");
			}
			if (parentContextMap.containsKey("SF_warehouse")) {
				context.SF_warehouse = (String) parentContextMap.get("SF_warehouse");
			}
		}

		// Resume: init the resumeUtil
		resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
		resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
		resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
		parametersToEncrypt.add("oms_reader_pwd");
		parametersToEncrypt.add("SF_password");
		// Resume: jobStart
		resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "",
				"", "", "", "", resumeUtil.convertToJsonText(context, ContextProperties.class, parametersToEncrypt));

		org.slf4j.MDC.put("_context", contextStr);
		log.info("TalendJob: 'YFS_CHARGE_TRANSACTION_H' - Started.");
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
			System.out.println((endUsedMemory - startUsedMemory)
					+ " bytes memory increase when running : YFS_CHARGE_TRANSACTION_H");
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
		log.info("TalendJob: 'YFS_CHARGE_TRANSACTION_H' - Finished - status: " + status + " returnCode: " + returnCode);

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
 * 133986 characters generated by Talend Cloud Data Management Platform on the
 * June 13, 2023 at 1:53:19 PM EDT
 ************************************************************************************************/