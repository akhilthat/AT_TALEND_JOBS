
package at_talend_jobs.doordash_0_1;

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
 * Job: Doordash Purpose: <br>
 * Description: <br>
 * 
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status
 */
public class Doordash implements TalendJob {
	static {
		System.setProperty("TalendJob.log", "Doordash.log");
	}

	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(Doordash.class);

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

		}

		// if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if (NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

	}

	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.

	public ContextProperties getContext() {
		return this.context;
	}

	private final String jobVersion = "0.1";
	private final String jobName = "Doordash";
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
			"_MRWzQPZsEe277NcrGd2LaQ", "0.1");
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
					Doordash.this.exception = e;
				}
			}
			if (!(e instanceof TalendException)) {
				try {
					for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
						if (m.getName().compareTo(currentComponent + "_error") == 0) {
							m.invoke(Doordash.this, new Object[] { e, currentComponent, globalMap });
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

	public void tFileList_3_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tFileList_3_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tSendMail_4_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		tSendMail_4_onSubJobError(exception, errorComponent, globalMap);
	}

	public void talendJobLog_error(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		end_Hash.put(errorComponent, System.currentTimeMillis());

		status = "failure";

		talendJobLog_onSubJobError(exception, errorComponent, globalMap);
	}

	public void tFileList_3_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tSendMail_4_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void talendJobLog_onSubJobError(Exception exception, String errorComponent,
			final java.util.Map<String, Object> globalMap) throws TalendException {

		resumeUtil.addLog("SYSTEM_LOG", "NODE:" + errorComponent, "", Thread.currentThread().getId() + "", "FATAL", "",
				exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception), "");

	}

	public void tFileList_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tFileList_3_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileList_3");
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
				 * [tFileList_3 begin ] start
				 */

				ok_Hash.put("tFileList_3", false);
				start_Hash.put("tFileList_3", System.currentTimeMillis());

				currentComponent = "tFileList_3";

				int tos_count_tFileList_3 = 0;

				if (log.isDebugEnabled())
					log.debug("tFileList_3 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tFileList_3 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tFileList_3 = new StringBuilder();
							log4jParamters_tFileList_3.append("Parameters:");
							log4jParamters_tFileList_3
									.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/Doordash/\"");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("LIST_MODE" + " = " + "FILES");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("INCLUDSUBDIR" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("CASE_SENSITIVE" + " = " + "YES");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ERROR" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("GLOBEXPRESSIONS" + " = " + "true");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("FILES" + " = " + "[{FILEMASK="
									+ ("\"items_\"+TalendDate.formatDate(\"yyyyMMdd\", TalendDate.addDate(TalendDate.getCurrentDate(), -1, \"dd\"))+\"*.csv\"")
									+ "}]");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_BY_NOTHING" + " = " + "true");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_BY_FILENAME" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_BY_FILESIZE" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_BY_MODIFIEDDATE" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_ACTION_ASC" + " = " + "true");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("ORDER_ACTION_DESC" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("IFEXCLUDE" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							log4jParamters_tFileList_3.append("FORMAT_FILEPATH_TO_SLASH" + " = " + "false");
							log4jParamters_tFileList_3.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tFileList_3 - " + (log4jParamters_tFileList_3));
						}
					}
					new BytesLimit65535_tFileList_3().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tFileList_3", "tFileList_3", "tFileList");
					talendJobLogProcess(globalMap);
				}

				final StringBuffer log4jSb_tFileList_3 = new StringBuffer();

				String directory_tFileList_3 = "//wva-sql-etl/sftp/ftp_files/Doordash/";
				final java.util.List<String> maskList_tFileList_3 = new java.util.ArrayList<String>();
				final java.util.List<java.util.regex.Pattern> patternList_tFileList_3 = new java.util.ArrayList<java.util.regex.Pattern>();
				maskList_tFileList_3.add("items_"
						+ TalendDate.formatDate("yyyyMMdd", TalendDate.addDate(TalendDate.getCurrentDate(), -1, "dd"))
						+ "*.csv");
				for (final String filemask_tFileList_3 : maskList_tFileList_3) {
					String filemask_compile_tFileList_3 = filemask_tFileList_3;

					filemask_compile_tFileList_3 = org.apache.oro.text.GlobCompiler.globToPerl5(
							filemask_tFileList_3.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);

					java.util.regex.Pattern fileNamePattern_tFileList_3 = java.util.regex.Pattern
							.compile(filemask_compile_tFileList_3);
					patternList_tFileList_3.add(fileNamePattern_tFileList_3);
				}
				int NB_FILEtFileList_3 = 0;

				final boolean case_sensitive_tFileList_3 = true;

				log.info("tFileList_3 - Starting to search for matching entries.");

				final java.util.List<java.io.File> list_tFileList_3 = new java.util.ArrayList<java.io.File>();
				final java.util.Set<String> filePath_tFileList_3 = new java.util.HashSet<String>();
				java.io.File file_tFileList_3 = new java.io.File(directory_tFileList_3);

				file_tFileList_3.listFiles(new java.io.FilenameFilter() {
					public boolean accept(java.io.File dir, String name) {
						java.io.File file = new java.io.File(dir, name);
						if (!file.isDirectory()) {

							String fileName_tFileList_3 = file.getName();
							for (final java.util.regex.Pattern fileNamePattern_tFileList_3 : patternList_tFileList_3) {
								if (fileNamePattern_tFileList_3.matcher(fileName_tFileList_3).matches()) {
									if (!filePath_tFileList_3.contains(file.getAbsolutePath())) {
										list_tFileList_3.add(file);
										filePath_tFileList_3.add(file.getAbsolutePath());
									}
								}
							}
						}
						return true;
					}
				});
				java.util.Collections.sort(list_tFileList_3);

				log.info("tFileList_3 - Start to list files.");

				for (int i_tFileList_3 = 0; i_tFileList_3 < list_tFileList_3.size(); i_tFileList_3++) {
					java.io.File files_tFileList_3 = list_tFileList_3.get(i_tFileList_3);
					String fileName_tFileList_3 = files_tFileList_3.getName();

					String currentFileName_tFileList_3 = files_tFileList_3.getName();
					String currentFilePath_tFileList_3 = files_tFileList_3.getAbsolutePath();
					String currentFileDirectory_tFileList_3 = files_tFileList_3.getParent();
					String currentFileExtension_tFileList_3 = null;

					if (files_tFileList_3.getName().contains(".") && files_tFileList_3.isFile()) {
						currentFileExtension_tFileList_3 = files_tFileList_3.getName()
								.substring(files_tFileList_3.getName().lastIndexOf(".") + 1);
					} else {
						currentFileExtension_tFileList_3 = "";
					}

					NB_FILEtFileList_3++;
					globalMap.put("tFileList_3_CURRENT_FILE", currentFileName_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEPATH", currentFilePath_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_3);
					globalMap.put("tFileList_3_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_3);
					globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);

					log.info("tFileList_3 - Current file or directory path : " + currentFilePath_tFileList_3);

					/**
					 * [tFileList_3 begin ] stop
					 */

					/**
					 * [tFileList_3 main ] start
					 */

					currentComponent = "tFileList_3";

					tos_count_tFileList_3++;

					/**
					 * [tFileList_3 main ] stop
					 */

					/**
					 * [tFileList_3 process_data_begin ] start
					 */

					currentComponent = "tFileList_3";

					/**
					 * [tFileList_3 process_data_begin ] stop
					 */

					/**
					 * [tFileList_3 process_data_end ] start
					 */

					currentComponent = "tFileList_3";

					/**
					 * [tFileList_3 process_data_end ] stop
					 */

					/**
					 * [tFileList_3 end ] start
					 */

					currentComponent = "tFileList_3";

				}
				globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);

				log.info("tFileList_3 - File or directory count : " + NB_FILEtFileList_3);

				if (log.isDebugEnabled())
					log.debug("tFileList_3 - " + ("Done."));

				ok_Hash.put("tFileList_3", true);
				end_Hash.put("tFileList_3", System.currentTimeMillis());

				if (((Integer) globalMap.get("tFileList_3_NB_FILE")) == 0) {

					if (execStat) {
						runStat.updateStatOnConnection("If4", 0, "true");
					}
					tSendMail_4Process(globalMap);
				}

				else {
					if (execStat) {
						runStat.updateStatOnConnection("If4", 0, "false");
					}
				}

				/**
				 * [tFileList_3 end ] stop
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
				 * [tFileList_3 finally ] start
				 */

				currentComponent = "tFileList_3";

				/**
				 * [tFileList_3 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tFileList_3_SUBPROCESS_STATE", 1);
	}

	public void tSendMail_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 0);

		final boolean execStat = this.execStat;

		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tSendMail_4");
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
				 * [tSendMail_4 begin ] start
				 */

				ok_Hash.put("tSendMail_4", false);
				start_Hash.put("tSendMail_4", System.currentTimeMillis());

				currentComponent = "tSendMail_4";

				int tos_count_tSendMail_4 = 0;

				if (log.isDebugEnabled())
					log.debug("tSendMail_4 - " + ("Start to work."));
				if (log.isDebugEnabled()) {
					class BytesLimit65535_tSendMail_4 {
						public void limitLog4jByte() throws Exception {
							StringBuilder log4jParamters_tSendMail_4 = new StringBuilder();
							log4jParamters_tSendMail_4.append("Parameters:");
							log4jParamters_tSendMail_4.append("TO" + " = " + "\"akhil.thati@vitaminshoppe.com\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("FROM" + " = " + "\"FROM_MAIL@vitaminshoppe.com\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("NEED_PERSONAL_NAME" + " = " + "false");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("CC" + " = " + "\"\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("BCC" + " = " + "\"\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("SUBJECT" + " = " + "\"Instacart file not found\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("MESSAGE" + " = "
									+ "\"Doordash file \"+((String)globalMap.get(\"tFileList_3_CURRENT_FILE\"))+\"  is missing from SFTP server for today.\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("CHECK_ATTACHMENT" + " = " + "true");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("ATTACHMENTS" + " = " + "[]");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("HEADERS" + " = " + "[]");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("SMTP_PORT" + " = " + "25");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("SSL" + " = " + "false");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("STARTTLS" + " = " + "false");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("IMPORTANCE" + " = " + "Normal");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("AUTH_MODE" + " = " + "NO_AUTH");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("DIE_ON_ERROR" + " = " + "true");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("TEXT_SUBTYPE" + " = " + "plain");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("ENCODING" + " = " + "\"ISO-8859-15\"");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("SET_LOCALHOST" + " = " + "false");
							log4jParamters_tSendMail_4.append(" | ");
							log4jParamters_tSendMail_4.append("CONFIGS" + " = " + "[]");
							log4jParamters_tSendMail_4.append(" | ");
							if (log.isDebugEnabled())
								log.debug("tSendMail_4 - " + (log4jParamters_tSendMail_4));
						}
					}
					new BytesLimit65535_tSendMail_4().limitLog4jByte();
				}
				if (enableLogStash) {
					talendJobLog.addCM("tSendMail_4", "tSendMail_4", "tSendMail");
					talendJobLogProcess(globalMap);
				}

				/**
				 * [tSendMail_4 begin ] stop
				 */

				/**
				 * [tSendMail_4 main ] start
				 */

				currentComponent = "tSendMail_4";

				String smtpHost_tSendMail_4 = "Mail13.vsi-nj.vitshoppe.com";
				String smtpPort_tSendMail_4 = "25";
				String from_tSendMail_4 = ("FROM_MAIL@vitaminshoppe.com");
				String to_tSendMail_4 = ("akhil.thati@vitaminshoppe.com").replace(";", ",");
				String cc_tSendMail_4 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String bcc_tSendMail_4 = (("") == null || "".equals("")) ? null : ("").replace(";", ",");
				String subject_tSendMail_4 = ("Instacart file not found");

				java.util.List<java.util.Map<String, String>> headers_tSendMail_4 = new java.util.ArrayList<java.util.Map<String, String>>();
				java.util.List<String> attachments_tSendMail_4 = new java.util.ArrayList<String>();
				java.util.List<String> contentTransferEncoding_tSendMail_4 = new java.util.ArrayList<String>();

				String message_tSendMail_4 = (("Doordash file " + ((String) globalMap.get("tFileList_3_CURRENT_FILE"))
						+ "  is missing from SFTP server for today.") == null
						|| "".equals("Doordash file " + ((String) globalMap.get("tFileList_3_CURRENT_FILE"))
								+ "  is missing from SFTP server for today.")) ? "\"\""
										: ("Doordash file " + ((String) globalMap.get("tFileList_3_CURRENT_FILE"))
												+ "  is missing from SFTP server for today.");
				java.util.Properties props_tSendMail_4 = System.getProperties();
				props_tSendMail_4.put("mail.smtp.host", smtpHost_tSendMail_4);
				props_tSendMail_4.put("mail.smtp.port", smtpPort_tSendMail_4);

				props_tSendMail_4.put("mail.mime.encodefilename", "true");
				try {

					log.info("tSendMail_4 - Connection attempt to '" + smtpHost_tSendMail_4 + "'.");

					props_tSendMail_4.put("mail.smtp.auth", "false");
					javax.mail.Session session_tSendMail_4 = javax.mail.Session.getInstance(props_tSendMail_4, null);

					log.info("tSendMail_4 - Connection to '" + smtpHost_tSendMail_4 + "' has succeeded.");

					javax.mail.Message msg_tSendMail_4 = new javax.mail.internet.MimeMessage(session_tSendMail_4);
					msg_tSendMail_4.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_4, null));
					msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.TO,
							javax.mail.internet.InternetAddress.parse(to_tSendMail_4, false));
					if (cc_tSendMail_4 != null)
						msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.CC,
								javax.mail.internet.InternetAddress.parse(cc_tSendMail_4, false));
					if (bcc_tSendMail_4 != null)
						msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.BCC,
								javax.mail.internet.InternetAddress.parse(bcc_tSendMail_4, false));
					msg_tSendMail_4.setSubject(subject_tSendMail_4);

					for (int i_tSendMail_4 = 0; i_tSendMail_4 < headers_tSendMail_4.size(); i_tSendMail_4++) {
						java.util.Map<String, String> header_tSendMail_4 = headers_tSendMail_4.get(i_tSendMail_4);
						msg_tSendMail_4.setHeader(header_tSendMail_4.get("KEY"), header_tSendMail_4.get("VALUE"));
					}
					msg_tSendMail_4.setSentDate(new Date());
					msg_tSendMail_4.setHeader("X-Priority", "3"); // High->1 Normal->3 Low->5
					javax.mail.Multipart mp_tSendMail_4 = new javax.mail.internet.MimeMultipart();
					javax.mail.internet.MimeBodyPart mbpText_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
					mbpText_tSendMail_4.setText(message_tSendMail_4, "ISO-8859-15", "plain");
					mp_tSendMail_4.addBodyPart(mbpText_tSendMail_4);

					javax.mail.internet.MimeBodyPart mbpFile_tSendMail_4 = null;

					for (int i_tSendMail_4 = 0; i_tSendMail_4 < attachments_tSendMail_4.size(); i_tSendMail_4++) {
						String filename_tSendMail_4 = attachments_tSendMail_4.get(i_tSendMail_4);
						javax.activation.FileDataSource fds_tSendMail_4 = null;
						java.io.File file_tSendMail_4 = new java.io.File(filename_tSendMail_4);

						if (file_tSendMail_4.isDirectory()) {
							java.io.File[] subFiles_tSendMail_4 = file_tSendMail_4.listFiles();
							for (java.io.File subFile_tSendMail_4 : subFiles_tSendMail_4) {
								if (subFile_tSendMail_4.isFile()) {
									fds_tSendMail_4 = new javax.activation.FileDataSource(
											subFile_tSendMail_4.getAbsolutePath());
									mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
									mbpFile_tSendMail_4
											.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4));
									mbpFile_tSendMail_4.setFileName(
											javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
									if (contentTransferEncoding_tSendMail_4.get(i_tSendMail_4)
											.equalsIgnoreCase("base64")) {
										mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
									}
									mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
								}
							}
						} else {
							mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
							fds_tSendMail_4 = new javax.activation.FileDataSource(filename_tSendMail_4);
							mbpFile_tSendMail_4.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4));
							mbpFile_tSendMail_4
									.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
							if (contentTransferEncoding_tSendMail_4.get(i_tSendMail_4).equalsIgnoreCase("base64")) {
								mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
							}
							mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
						}
					}
					// -- set the content --
					msg_tSendMail_4.setContent(mp_tSendMail_4);
					// add handlers for main MIME types
					javax.activation.MailcapCommandMap mc_tSendMail_4 = (javax.activation.MailcapCommandMap) javax.activation.CommandMap
							.getDefaultCommandMap();
					mc_tSendMail_4.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
					mc_tSendMail_4.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
					mc_tSendMail_4.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
					mc_tSendMail_4
							.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
					mc_tSendMail_4
							.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
					javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_4);
					// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
					com.sun.mail.handlers.text_plain text_plain_h_tSendMail_4 = null;
					// -- Send the message --
					javax.mail.Transport.send(msg_tSendMail_4);
				} catch (java.lang.Exception e) {
					globalMap.put("tSendMail_4_ERROR_MESSAGE", e.getMessage());

					throw (e);

				} finally {
					props_tSendMail_4.remove("mail.smtp.host");
					props_tSendMail_4.remove("mail.smtp.port");

					props_tSendMail_4.remove("mail.mime.encodefilename");

					props_tSendMail_4.remove("mail.smtp.auth");
				}

				tos_count_tSendMail_4++;

				/**
				 * [tSendMail_4 main ] stop
				 */

				/**
				 * [tSendMail_4 process_data_begin ] start
				 */

				currentComponent = "tSendMail_4";

				/**
				 * [tSendMail_4 process_data_begin ] stop
				 */

				/**
				 * [tSendMail_4 process_data_end ] start
				 */

				currentComponent = "tSendMail_4";

				/**
				 * [tSendMail_4 process_data_end ] stop
				 */

				/**
				 * [tSendMail_4 end ] start
				 */

				currentComponent = "tSendMail_4";

				if (log.isDebugEnabled())
					log.debug("tSendMail_4 - " + ("Done."));

				ok_Hash.put("tSendMail_4", true);
				end_Hash.put("tSendMail_4", System.currentTimeMillis());

				/**
				 * [tSendMail_4 end ] stop
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
				 * [tSendMail_4 finally ] start
				 */

				currentComponent = "tSendMail_4";

				/**
				 * [tSendMail_4 finally ] stop
				 */
			} catch (java.lang.Exception e) {
				// ignore
			} catch (java.lang.Error error) {
				// ignore
			}
			resourceMap = null;
		}

		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 1);
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

	private final static java.util.Properties jobInfo = new java.util.Properties();
	private final static java.util.Map<String, String> mdcInfo = new java.util.HashMap<>();

	public static void main(String[] args) {
		final Doordash DoordashClass = new Doordash();

		int exitCode = DoordashClass.runJobInTOS(args);
		if (exitCode == 0) {
			log.info("TalendJob: 'Doordash' - Done.");
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
		log.info("TalendJob: 'Doordash' - Start.");

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
		org.slf4j.MDC.put("_jobRepositoryId", "_MRWzQPZsEe277NcrGd2LaQ");
		org.slf4j.MDC.put("_compiledAtTimestamp", "2023-06-27T16:10:31.628339800Z");

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
			java.io.InputStream inContext = Doordash.class.getClassLoader()
					.getResourceAsStream("at_talend_jobs/doordash_0_1/contexts/" + contextStr + ".properties");
			if (inContext == null) {
				inContext = Doordash.class.getClassLoader()
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
		log.info("TalendJob: 'Doordash' - Started.");
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
			tFileList_3Process(globalMap);
			if (!"failure".equals(status)) {
				status = "end";
			}
		} catch (TalendException e_tFileList_3) {
			globalMap.put("tFileList_3_SUBPROCESS_STATE", -1);

			e_tFileList_3.printStackTrace();

		}

		this.globalResumeTicket = true;// to run tPostJob

		end = System.currentTimeMillis();

		if (watch) {
			System.out.println((end - startTime) + " milliseconds");
		}

		endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		if (false) {
			System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : Doordash");
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
		log.info("TalendJob: 'Doordash' - Finished - status: " + status + " returnCode: " + returnCode);

		return returnCode;

	}

	// only for OSGi env
	public void destroy() {

	}

	private java.util.Map<String, Object> getSharedConnections4REST() {
		java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();

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
 * 64467 characters generated by Talend Cloud Data Management Platform on the
 * June 27, 2023 at 12:10:31 PM EDT
 ************************************************************************************************/