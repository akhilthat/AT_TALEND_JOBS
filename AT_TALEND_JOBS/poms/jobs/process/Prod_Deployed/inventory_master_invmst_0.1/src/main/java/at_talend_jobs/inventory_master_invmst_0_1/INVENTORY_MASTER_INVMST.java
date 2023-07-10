
package at_talend_jobs.inventory_master_invmst_0_1;

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
 * Job: INVENTORY_MASTER_INVMST Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class INVENTORY_MASTER_INVMST implements TalendJob {
	static {System.setProperty("TalendJob.log", "INVENTORY_MASTER_INVMST.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(INVENTORY_MASTER_INVMST.class);
	

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
	

	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
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

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(To != null){
				
					this.setProperty("To", To.toString());
				
			}
			
			if(From != null){
				
					this.setProperty("From", From.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String To;
public String getTo(){
	return this.To;
}
public String From;
public String getFrom(){
	return this.From;
}
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "INVENTORY_MASTER_INVMST";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_DGSfcNmuEeuE0KkKg4NQQA", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
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
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
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
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				INVENTORY_MASTER_INVMST.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(INVENTORY_MASTER_INVMST.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
			talendJobLogProcess(globalMap);
		}
				tLogCatcher_1.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
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

			public void tPrejob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogCatcher_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
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
			public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void tPrejob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_2");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_2", false);
		start_Hash.put("tPrejob_2", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_2";
	
	
		int tos_count_tPrejob_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_2", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_2 begin ] stop
 */
	
	/**
	 * [tPrejob_2 main ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 


	tos_count_tPrejob_2++;

/**
 * [tPrejob_2 main ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_2 end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 

ok_Hash.put("tPrejob_2", true);
end_Hash.put("tPrejob_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tPrejob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_2 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_2_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		
		int tos_count_tDBConnection_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "INVENTORY", "tSnowflakeConnection");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBConnection_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBConnection_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBConnection_1 = (String)(restRequest_tDBConnection_1 != null ? restRequest_tDBConnection_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBConnection_1 =
        new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBConnection_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBConnection_1 = null;


org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_1 =
        (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_1.createRuntimeProperties();
 		                    props_tDBConnection_1.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBConnection_1.setValue("account",
 		                    "vitaminshoppe");
 		                    
 		                    props_tDBConnection_1.setValue("regionID",
 		                    "us-east-1");
 		                    
 		                    props_tDBConnection_1.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBConnection_1.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBConnection_1.setValue("warehouse",
 		                    "VSI_WH_XS");
 		                    
 		                    props_tDBConnection_1.setValue("db",
 		                    "PROD_DATA");
 		                    
 		                    props_tDBConnection_1.setValue("schemaName",
 		                    "INVENTORY");
 		                    
 		                    props_tDBConnection_1.setValue("role",
 		                    "sysadmin");
 		                    
 		                    props_tDBConnection_1.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBConnection_1.setValue("autoCommit",
 		                    true);
 		                    
 		                    props_tDBConnection_1.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBConnection_1.userPassword.setValue("userId",
 		                    "Talend_user");
 		                    
 		                        props_tDBConnection_1.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:hlrPX224g/Jb7z4IITrwhXMEP6Ep/DK8w6znbrRMiHBm52hW"));
 		                        
 		                    props_tDBConnection_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBConnection_1 = props_tDBConnection_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBConnection_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBConnection_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBConnection_1.referencedComponent.setReference(referencedComponentProperties_tDBConnection_1);
        }
    }
globalMap.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBConnection_1= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_1, topology_tDBConnection_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_1 = def_tDBConnection_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBConnection_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBConnection_1 = componentRuntime_tDBConnection_1.initialize(container_tDBConnection_1, props_tDBConnection_1);

if (initVr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBConnection_1.getMessage());
}

if(componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBConnection_1;
	compDriverInitialization_tDBConnection_1.runAtDriver(container_tDBConnection_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_1 = null;
if(componentRuntime_tDBConnection_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBConnection_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBConnection_1;
	if (doesNodeBelongToRequest_tDBConnection_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBConnection_1 = sourceOrSink_tDBConnection_1.validate(container_tDBConnection_1);
        if (vr_tDBConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		


 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		


 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		


 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		
// end of generic

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBConnection_3Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="INVENTORY";
		
// finally of generic

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_3");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBConnection_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_3", false);
		start_Hash.put("tDBConnection_3", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_3";
	
	
		int tos_count_tDBConnection_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_3{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:RXCVfJzWVm+hvh0uzlS6HQDwXGmqJN6ekRh7PeGS/F7InQ==").substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_3.append(" | ");
                            log4jParamters_tDBConnection_3.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tDBConnection_3.append(" | ");
                            log4jParamters_tDBConnection_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBConnection_3.append(" | ");
                            log4jParamters_tDBConnection_3.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_3.append(" | ");
                            log4jParamters_tDBConnection_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Connection");
                        log4jParamters_tDBConnection_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + (log4jParamters_tDBConnection_3) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_3", "tDBConnection_1", "tAS400Connection");
				talendJobLogProcess(globalMap);
			}
			
	

	 
    	String url_tDBConnection_3 = "jdbc:as400://" + "10.3.2.140" + "/" + "MM4R5LIB" + ";" + "prompt=false";
	String dbUser_tDBConnection_3 = "sqletl";
	
	
		 
	final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:Ja6csdAdB39o8MvV77AzmWFiAccOILbQEmCUNvfasBV4GA==");
		String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;
	
	
	java.sql.Connection conn_tDBConnection_3 = null;
	
		
			String driverClass_tDBConnection_3 = "com.ibm.as400.access.AS400JDBCDriver";
			java.lang.Class jdbcclazz_tDBConnection_3 = java.lang.Class.forName(driverClass_tDBConnection_3);
			globalMap.put("driverClass_tDBConnection_3", driverClass_tDBConnection_3);
		
	    		log.debug("tDBConnection_3 - Driver ClassName: "+driverClass_tDBConnection_3+".");
			
	    		log.debug("tDBConnection_3 - Connection attempt to '" + url_tDBConnection_3 + "' with the username '" + dbUser_tDBConnection_3 + "'.");
			
			conn_tDBConnection_3 = java.sql.DriverManager.getConnection(url_tDBConnection_3,dbUser_tDBConnection_3,dbPwd_tDBConnection_3);
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

	

	
	
	currentComponent="tDBConnection_3";
	
	

 


	tos_count_tDBConnection_3++;

/**
 * [tDBConnection_3 main ] stop
 */
	
	/**
	 * [tDBConnection_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	

 



/**
 * [tDBConnection_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	

 



/**
 * [tDBConnection_3 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_3 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + ("Done.") );

ok_Hash.put("tDBConnection_3", true);
end_Hash.put("tDBConnection_3", System.currentTimeMillis());




/**
 * [tDBConnection_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_3 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_3";
	
	

 



/**
 * [tDBConnection_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_3_SUBPROCESS_STATE", 1);
	}
	


public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}

				public Boolean priorityIsNullable(){
				    return true;
				}
				public Boolean priorityIsKey(){
				    return false;
				}
				public Integer priorityLength(){
				    return 3;
				}
				public Integer priorityPrecision(){
				    return 0;
				}
				public String priorityDefault(){
				
					return "";
				
				}
				public String priorityComment(){
				
				    return null;
				
				}
				public String priorityPattern(){
				
				    return null;
				
				}
				public String priorityOriginalDbColumnName(){
				
					return "priority";
				
				}

				
			    public String type;

				public String getType () {
					return this.type;
				}

				public Boolean typeIsNullable(){
				    return true;
				}
				public Boolean typeIsKey(){
				    return false;
				}
				public Integer typeLength(){
				    return 255;
				}
				public Integer typePrecision(){
				    return 0;
				}
				public String typeDefault(){
				
					return "";
				
				}
				public String typeComment(){
				
				    return null;
				
				}
				public String typePattern(){
				
				    return null;
				
				}
				public String typeOriginalDbColumnName(){
				
					return "type";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}

				public Boolean codeIsNullable(){
				    return true;
				}
				public Boolean codeIsKey(){
				    return false;
				}
				public Integer codeLength(){
				    return 3;
				}
				public Integer codePrecision(){
				    return 0;
				}
				public String codeDefault(){
				
					return "";
				
				}
				public String codeComment(){
				
				    return null;
				
				}
				public String codePattern(){
				
				    return null;
				
				}
				public String codeOriginalDbColumnName(){
				
					return "code";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(priority == null){
        					sb.append("<null>");
        				}else{
            				sb.append(priority);
            			}
            		
        			sb.append("|");
        		
        				if(type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(type);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(code == null){
        					sb.append("<null>");
        				}else{
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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}

				public Boolean priorityIsNullable(){
				    return true;
				}
				public Boolean priorityIsKey(){
				    return false;
				}
				public Integer priorityLength(){
				    return 3;
				}
				public Integer priorityPrecision(){
				    return 0;
				}
				public String priorityDefault(){
				
					return "";
				
				}
				public String priorityComment(){
				
				    return null;
				
				}
				public String priorityPattern(){
				
				    return null;
				
				}
				public String priorityOriginalDbColumnName(){
				
					return "priority";
				
				}

				
			    public String type;

				public String getType () {
					return this.type;
				}

				public Boolean typeIsNullable(){
				    return true;
				}
				public Boolean typeIsKey(){
				    return false;
				}
				public Integer typeLength(){
				    return 255;
				}
				public Integer typePrecision(){
				    return 0;
				}
				public String typeDefault(){
				
					return "";
				
				}
				public String typeComment(){
				
				    return null;
				
				}
				public String typePattern(){
				
				    return null;
				
				}
				public String typeOriginalDbColumnName(){
				
					return "type";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}

				public Boolean codeIsNullable(){
				    return true;
				}
				public Boolean codeIsKey(){
				    return false;
				}
				public Integer codeLength(){
				    return 3;
				}
				public Integer codePrecision(){
				    return 0;
				}
				public String codeDefault(){
				
					return "";
				
				}
				public String codeComment(){
				
				    return null;
				
				}
				public String codePattern(){
				
				    return null;
				
				}
				public String codeOriginalDbColumnName(){
				
					return "code";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
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
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
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

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(priority == null){
        					sb.append("<null>");
        				}else{
            				sb.append(priority);
            			}
            		
        			sb.append("|");
        		
        				if(type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(type);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(code == null){
        					sb.append("<null>");
        				}else{
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();
row2Struct row10 = row2;





	
	/**
	 * [tSendMail_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_1", false);
		start_Hash.put("tSendMail_1", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row10");
			
		int tos_count_tSendMail_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_1{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tSendMail_1.append("MESSAGE" + " = " + "jobName + \" job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. \"");
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
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + (log4jParamters_tSendMail_1) );
                    } 
                } 
            new BytesLimit65535_tSendMail_1().limitLog4jByte();
            }
			if(enableLogStash) {
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
		
	
	currentComponent="tLogRow_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tLogRow_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogRow_1{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + (log4jParamters_tLogRow_1) );
                    } 
                } 
            new BytesLimit65535_tLogRow_1().limitLog4jByte();
            }
			if(enableLogStash) {
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
		
	
	currentComponent="tLogCatcher_1";
	
	
		int tos_count_tLogCatcher_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLogCatcher_1{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + (log4jParamters_tLogCatcher_1) );
                    } 
                } 
            new BytesLimit65535_tLogCatcher_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLogCatcher_1", "tLogCatcher_1", "tLogCatcher");
				talendJobLogProcess(globalMap);
			}
			

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : tLogCatcher_1.getMessages()) {
		row2.type = lcm.getType();
		row2.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
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

	

	
	
	currentComponent="tLogCatcher_1";
	
	

 


	tos_count_tLogCatcher_1++;

/**
 * [tLogCatcher_1 main ] stop
 */
	
	/**
	 * [tLogCatcher_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";
	
	

 



/**
 * [tLogCatcher_1 process_data_begin ] stop
 */

	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tLogCatcher_1","tLogCatcher_1","tLogCatcher","tLogRow_1","tLogRow_1","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




   				
	    		if(row2.moment != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row2.moment, "yyyy-MM-dd HH:mm:ss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.root_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.root_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.father_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.father_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.project != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.project)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.job != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.job)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.context != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.context)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.priority != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.priority)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.type != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.type)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.origin != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.origin)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.message != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.message)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row2.code != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row2.code)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    	log.info("tLogRow_1 - Content of row "+(nb_line_tLogRow_1+1)+": " + strBuffer_tLogRow_1.toString());
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

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */

	
	/**
	 * [tSendMail_1 main ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row10","tLogRow_1","tLogRow_1","tLogRow","tSendMail_1","tSendMail_1","tSendMail"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row10 - " + (row10==null? "": row10.toLogString()));
    			}
    		

 

	String smtpHost_tSendMail_1 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_1 = "25";
	String from_tSendMail_1 = (context.From);
    String to_tSendMail_1 = (context.To).replace(";",",");
    String cc_tSendMail_1 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_1 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_1 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_1 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_1 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_1 = new java.util.ArrayList<String>();

	String message_tSendMail_1 = ((jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ") == null || "".equals(jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ")) ? "\"\"" : (jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ") ;
	java.util.Properties props_tSendMail_1 = System.getProperties();     
	props_tSendMail_1.put("mail.smtp.host", smtpHost_tSendMail_1);
	props_tSendMail_1.put("mail.smtp.port", smtpPort_tSendMail_1);
	
		props_tSendMail_1.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_1 - Connection attempt to '" + smtpHost_tSendMail_1 +"'.");
		
		  
			props_tSendMail_1.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_1 = javax.mail.Session.getInstance(props_tSendMail_1, null);    
		
		
			log.info("tSendMail_1 - Connection to '" + smtpHost_tSendMail_1 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_1 = new javax.mail.internet.MimeMessage(session_tSendMail_1);
		msg_tSendMail_1.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_1, null));
		msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_1, false));
		if (cc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_1, false));
		if (bcc_tSendMail_1 != null) msg_tSendMail_1.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_1, false));
		msg_tSendMail_1.setSubject(subject_tSendMail_1);

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < headers_tSendMail_1.size(); i_tSendMail_1++) {
			java.util.Map<String, String> header_tSendMail_1 = headers_tSendMail_1.get(i_tSendMail_1);
			msg_tSendMail_1.setHeader(header_tSendMail_1.get("KEY"), header_tSendMail_1.get("VALUE"));    
		}  
		msg_tSendMail_1.setSentDate(new Date());
		msg_tSendMail_1.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_1 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_1.setText(message_tSendMail_1,"ISO-8859-15", "plain");
		mp_tSendMail_1.addBodyPart(mbpText_tSendMail_1);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_1 = null;

		for (int i_tSendMail_1 = 0; i_tSendMail_1 < attachments_tSendMail_1.size(); i_tSendMail_1++){
			String filename_tSendMail_1 = attachments_tSendMail_1.get(i_tSendMail_1);
			javax.activation.FileDataSource fds_tSendMail_1 = null;
			java.io.File file_tSendMail_1 = new java.io.File(filename_tSendMail_1);
			
				if (!file_tSendMail_1.exists()){
					continue;
				}
			
    		if (file_tSendMail_1.isDirectory()){
				java.io.File[] subFiles_tSendMail_1 = file_tSendMail_1.listFiles();
				for(java.io.File subFile_tSendMail_1 : subFiles_tSendMail_1){
					if (subFile_tSendMail_1.isFile()){
						fds_tSendMail_1 = new javax.activation.FileDataSource(subFile_tSendMail_1.getAbsolutePath());
						mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1));
						mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
						if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
					}
				}
    		}else{
				mbpFile_tSendMail_1 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_1 = new javax.activation.FileDataSource(filename_tSendMail_1);
				mbpFile_tSendMail_1.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_1)); 
				mbpFile_tSendMail_1.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_1.getName()));
				if(contentTransferEncoding_tSendMail_1.get(i_tSendMail_1).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_1.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_1.addBodyPart(mbpFile_tSendMail_1);
			}
		}
		// -- set the content --
		msg_tSendMail_1.setContent(mp_tSendMail_1);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_1 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_1.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_1.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_1.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_1.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_1.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_1);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_1 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_1);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_1_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
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

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 process_data_end ] stop
 */



	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */



	
	/**
	 * [tLogCatcher_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";
	
	

 



/**
 * [tLogCatcher_1 process_data_end ] stop
 */
	
	/**
	 * [tLogCatcher_1 end ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";
	
	
	}
} catch (Exception e_tLogCatcher_1) {
globalMap.put("tLogCatcher_1_ERROR_MESSAGE",e_tLogCatcher_1.getMessage());
	logIgnoredError(String.format("tLogCatcher_1 - tLogCatcher failed to process log message(s) due to internal error: %s", e_tLogCatcher_1), e_tLogCatcher_1);
}

 
                if(log.isDebugEnabled())
            log.debug("tLogCatcher_1 - "  + ("Done.") );

ok_Hash.put("tLogCatcher_1", true);
end_Hash.put("tLogCatcher_1", System.currentTimeMillis());




/**
 * [tLogCatcher_1 end ] stop
 */

	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	


//////
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);
                if(log.isInfoEnabled())
            log.info("tLogRow_1 - "  + ("Printed row count: ")  + (nb_line_tLogRow_1)  + (".") );

///////////////////////    			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tLogCatcher_1","tLogCatcher_1","tLogCatcher","tLogRow_1","tLogRow_1","tLogRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tLogRow_1 - "  + ("Done.") );

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
 */

	
	/**
	 * [tSendMail_1 end ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row10",2,0,
			 			"tLogRow_1","tLogRow_1","tLogRow","tSendMail_1","tSendMail_1","tSendMail","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tSendMail_1 - "  + ("Done.") );

ok_Hash.put("tSendMail_1", true);
end_Hash.put("tSendMail_1", System.currentTimeMillis());




/**
 * [tSendMail_1 end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tLogCatcher_1 finally ] start
	 */

	

	
	
	currentComponent="tLogCatcher_1";
	
	

 



/**
 * [tLogCatcher_1 finally ] stop
 */

	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";
	
	

 



/**
 * [tLogRow_1 finally ] stop
 */

	
	/**
	 * [tSendMail_1 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_1";
	
	

 



/**
 * [tSendMail_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_2", false);
		start_Hash.put("tPostjob_2", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_2";
	
	
		int tos_count_tPostjob_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_2", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_2 begin ] stop
 */
	
	/**
	 * [tPostjob_2 main ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 


	tos_count_tPostjob_2++;

/**
 * [tPostjob_2 main ] stop
 */
	
	/**
	 * [tPostjob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_2 end ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 

ok_Hash.put("tPostjob_2", true);
end_Hash.put("tPostjob_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBClose_2Process(globalMap);



/**
 * [tPostjob_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_2 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_2";
	
	

 



/**
 * [tPostjob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBClose_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_2", false);
		start_Hash.put("tDBClose_2", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_2";
	
	
		int tos_count_tDBClose_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_2", "tDBClose_1", "tSnowflakeClose");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBClose_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBClose_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBClose_2 = (String)(restRequest_tDBClose_2 != null ? restRequest_tDBClose_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBClose_2 =
        new org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBClose_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBClose_2 = null;


org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties props_tDBClose_2 =
        (org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties) def_tDBClose_2.createRuntimeProperties();
 		                    props_tDBClose_2.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBClose_2.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBClose_2.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBClose_2.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBClose_2 = props_tDBClose_2.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBClose_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBClose_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBClose_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBClose_2.referencedComponent.setReference(referencedComponentProperties_tDBClose_2);
        }
    }
globalMap.put("tDBClose_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBClose_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBClose_2= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBClose_2, topology_tDBClose_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBClose_2 = def_tDBClose_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBClose_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBClose_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBClose_2 = componentRuntime_tDBClose_2.initialize(container_tDBClose_2, props_tDBClose_2);

if (initVr_tDBClose_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBClose_2.getMessage());
}

if(componentRuntime_tDBClose_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBClose_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBClose_2;
	compDriverInitialization_tDBClose_2.runAtDriver(container_tDBClose_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBClose_2 = null;
if(componentRuntime_tDBClose_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBClose_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBClose_2;
	if (doesNodeBelongToRequest_tDBClose_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBClose_2 = sourceOrSink_tDBClose_2.validate(container_tDBClose_2);
        if (vr_tDBClose_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBClose_2";
	
	


 


	tos_count_tDBClose_2++;

/**
 * [tDBClose_2 main ] stop
 */
	
	/**
	 * [tDBClose_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	


 



/**
 * [tDBClose_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	


 



/**
 * [tDBClose_2 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_2 end ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
// end of generic

 

ok_Hash.put("tDBClose_2", true);
end_Hash.put("tDBClose_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tDBClose_3Process(globalMap);



/**
 * [tDBClose_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_2 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	
// finally of generic

 



/**
 * [tDBClose_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBClose_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_3", false);
		start_Hash.put("tDBClose_3", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_3";
	
	
		int tos_count_tDBClose_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_3 = new StringBuilder();
                    log4jParamters_tDBClose_3.append("Parameters:");
                            log4jParamters_tDBClose_3.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBClose_3.append(" | ");
                            log4jParamters_tDBClose_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Close");
                        log4jParamters_tDBClose_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + (log4jParamters_tDBClose_3) );
                    } 
                } 
            new BytesLimit65535_tDBClose_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_3", "tDBClose_1", "tAS400Close");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_3 begin ] stop
 */
	
	/**
	 * [tDBClose_3 main ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	



	java.sql.Connection conn_tDBClose_3 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
	if(conn_tDBClose_3 != null && !conn_tDBClose_3.isClosed())
	{
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Closing the connection ")  + ("conn_tDBConnection_3")  + (" to the database.") );
        conn_tDBClose_3.close();
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Connection ")  + ("conn_tDBConnection_3")  + (" to the database has closed.") );
	}

 


	tos_count_tDBClose_3++;

/**
 * [tDBClose_3 main ] stop
 */
	
	/**
	 * [tDBClose_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	

 



/**
 * [tDBClose_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	

 



/**
 * [tDBClose_3 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_3 end ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_3 - "  + ("Done.") );

ok_Hash.put("tDBClose_3", true);
end_Hash.put("tDBClose_3", System.currentTimeMillis());




/**
 * [tDBClose_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBClose_3 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_3";
	
	

 



/**
 * [tDBClose_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_3_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_1", false);
		start_Hash.put("tDBRow_1", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_1";
	
	
		int tos_count_tDBRow_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_1", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_1 = (String)(restRequest_tDBRow_1 != null ? restRequest_tDBRow_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_1 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_1 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_1 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_1.createRuntimeProperties();
 		                    props_tDBRow_1.setValue("query",
 		                    "DELETE from INVENTORY_MASTER_INVMST\nWHERE DATELOADED= CURRENT_DATE() - 1");
 		                    
 		                    props_tDBRow_1.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_1.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_1.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_1_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
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
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_1_2_fisrt sst_tDBRow_1_2_fisrt = new SchemaSettingTool_tDBRow_1_2_fisrt();
 		                    
 		                    props_tDBRow_1.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_1_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_1.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_1.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_1.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_1.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_1.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_1.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_1.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_1.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_1_3_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_1_3_fisrt sst_tDBRow_1_3_fisrt = new SchemaSettingTool_tDBRow_1_3_fisrt();
 		                    
 		                    props_tDBRow_1.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_1_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_1.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_1 = props_tDBRow_1.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_1.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_1);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_1.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_1 = props_tDBRow_1.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_1.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_1);
        }
    }
globalMap.put("tDBRow_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_1= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_1, topology_tDBRow_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_1 = def_tDBRow_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_1 = componentRuntime_tDBRow_1.initialize(container_tDBRow_1, props_tDBRow_1);

if (initVr_tDBRow_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_1.getMessage());
}

if(componentRuntime_tDBRow_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_1;
	compDriverInitialization_tDBRow_1.runAtDriver(container_tDBRow_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_1 = null;
if(componentRuntime_tDBRow_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_1;
	if (doesNodeBelongToRequest_tDBRow_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_1 = sourceOrSink_tDBRow_1.validate(container_tDBRow_1);
        if (vr_tDBRow_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_1";
	
	


 


	tos_count_tDBRow_1++;

/**
 * [tDBRow_1 main ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	


 



/**
 * [tDBRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	


 



/**
 * [tDBRow_1 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_1 end ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	
// end of generic


resourceMap.put("finish_tDBRow_1", Boolean.TRUE);

 

ok_Hash.put("tDBRow_1", true);
end_Hash.put("tDBRow_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBRow_2Process(globalMap);



/**
 * [tDBRow_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_1 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_1";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_1")==null){
}
 



/**
 * [tDBRow_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_2", false);
		start_Hash.put("tDBRow_2", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_2";
	
	
		int tos_count_tDBRow_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_2", "tDBRow_2", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_2 = (String)(restRequest_tDBRow_2 != null ? restRequest_tDBRow_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_2 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_2 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_2 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_2.createRuntimeProperties();
 		                    props_tDBRow_2.setValue("query",
 		                    "create or replace TABLE INVMST (\n	INUMBR NUMBER(9,0),\n	ICHECK FLOAT,\n	IDESCR VARCHAR(30),\n	IDSCCD VARCHAR(1),\n	ISO"
+"RT VARCHAR(10),\n	ISTYLN VARCHAR(15),\n	ASNUM FLOAT,\n	IVNDPN VARCHAR(15),\n	IMFGR FLOAT,\n	IMFGNO VARCHAR(15),\n	IDEPT "
+"FLOAT,\n	ISDEPT FLOAT,\n	ICLAS FLOAT,\n	ISCLAS FLOAT,\n	BYRNUM VARCHAR(3),\n	IASPAC NUMBER(2,0),\n	IADVYN VARCHAR(1),\n	"
+"IBUYCD VARCHAR(1),\n	ISET VARCHAR(1),\n	IWARNT VARCHAR(1),\n	IPRMPT VARCHAR(1),\n	IPRVNT VARCHAR(1),\n	ITKTTR VARCHAR(1)"
+",\n	ITKTTA VARCHAR(1),\n	ITKTN NUMBER(2,0),\n	ILBLTR VARCHAR(1),\n	ILBLTA VARCHAR(1),\n	IFINLN VARCHAR(5),\n	IPROFL VARC"
+"HAR(5),\n	IMODUL VARCHAR(5),\n	ISTYPE VARCHAR(2),\n	ISCOLR FLOAT,\n	ISSIZE VARCHAR(4),\n	IHAZCD VARCHAR(2),\n	MCHNUM VAR"
+"CHAR(3),\n	ISUBST NUMBER(9,0),\n	ICORE NUMBER(9,0),\n	IREPL NUMBER(9,0),\n	ISLUM VARCHAR(3),\n	IUMCV2 NUMBER(10,5),\n	IB"
+"YUM VARCHAR(3),\n	IMINPK NUMBER(9,2),\n	ISTDPK NUMBER(9,2),\n	IHLDOR VARCHAR(1),\n	IMOQTY NUMBER(7,0),\n	IMNSTK NUMBER(7"
+",0),\n	IMXSTK NUMBER(7,0),\n	IMDSTK NUMBER(7,0),\n	IDSPLY NUMBER(7,0),\n	IOMULT NUMBER(7,0),\n	IRPLCD VARCHAR(1),\n	IMFP"
+"RC NUMBER(9,2),\n	IWGHT NUMBER(7,3),\n	ICUBE NUMBER(9,3),\n	IDLGTH NUMBER(5,1),\n	IDWDTH NUMBER(5,1),\n	IDHGHT NUMBER(5,"
+"1),\n	IMDATE NUMBER(6,0),\n	IMCENT NUMBER(1,0),\n	IVPLTI NUMBER(3,0),\n	IVPLHI NUMBER(3,0),\n	SHPNUM FLOAT,\n	IDISTM VAR"
+"CHAR(1),\n	IHLDWO VARCHAR(1),\n	IIGNUM FLOAT,\n	ISDIM VARCHAR(4),\n	IVATCD VARCHAR(2),\n	IPLAN FLOAT,\n	IVLRK1 VARCHAR(1"
+"),\n	IVLRK2 VARCHAR(1),\n	IVLRK3 VARCHAR(1),\n	IVLRK4 VARCHAR(1),\n	IRPLCN NUMBER(1,0),\n	IRPLDT NUMBER(6,0),\n	ISEASN V"
+"ARCHAR(3),\n	IDEADC NUMBER(1,0),\n	IDEADD NUMBER(6,0),\n	INLRTL NUMBER(9,2),\n	IHANDL VARCHAR(1),\n	IATRB1 VARCHAR(2),\n"
+"	IATRB2 VARCHAR(2),\n	IATRB3 VARCHAR(2),\n	IATRB4 VARCHAR(2),\n	IATRB5 VARCHAR(2),\n	IPRCCH VARCHAR(1),\n	IPRCZN VARCHAR"
+"(1),\n	IPRCST VARCHAR(1),\n	IASNUM FLOAT,\n	ICORGP VARCHAR(5),\n	ILEAD NUMBER(3,0),\n	IHZCOD VARCHAR(4),\n	IFRACT VARCHA"
+"R(1),\n	LOAD_DATE DATE\n);");
 		                    
 		                    props_tDBRow_2.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_2.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_2.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_2_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
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
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_2_2_fisrt sst_tDBRow_2_2_fisrt = new SchemaSettingTool_tDBRow_2_2_fisrt();
 		                    
 		                    props_tDBRow_2.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_2_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_2.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_2.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_2.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_2.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_2.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_2.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_2.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_2.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_2.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_2.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_2_3_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_2_3_fisrt sst_tDBRow_2_3_fisrt = new SchemaSettingTool_tDBRow_2_3_fisrt();
 		                    
 		                    props_tDBRow_2.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_2_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_2.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_2 = props_tDBRow_2.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_2.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_2);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_2.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_2 = props_tDBRow_2.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_2.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_2);
        }
    }
globalMap.put("tDBRow_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_2= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_2, topology_tDBRow_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_2 = def_tDBRow_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_2 = componentRuntime_tDBRow_2.initialize(container_tDBRow_2, props_tDBRow_2);

if (initVr_tDBRow_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_2.getMessage());
}

if(componentRuntime_tDBRow_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_2;
	compDriverInitialization_tDBRow_2.runAtDriver(container_tDBRow_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_2 = null;
if(componentRuntime_tDBRow_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_2;
	if (doesNodeBelongToRequest_tDBRow_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_2 = sourceOrSink_tDBRow_2.validate(container_tDBRow_2);
        if (vr_tDBRow_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_2";
	
	


 


	tos_count_tDBRow_2++;

/**
 * [tDBRow_2 main ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	


 



/**
 * [tDBRow_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	


 



/**
 * [tDBRow_2 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_2 end ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	
// end of generic


resourceMap.put("finish_tDBRow_2", Boolean.TRUE);

 

ok_Hash.put("tDBRow_2", true);
end_Hash.put("tDBRow_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBInput_1Process(globalMap);



/**
 * [tDBRow_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_2 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_2";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_2")==null){
}
 



/**
 * [tDBRow_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_2_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableRow<row5Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public BigDecimal INUMBR;

				public BigDecimal getINUMBR () {
					return this.INUMBR;
				}

				public Boolean INUMBRIsNullable(){
				    return false;
				}
				public Boolean INUMBRIsKey(){
				    return false;
				}
				public Integer INUMBRLength(){
				    return 9;
				}
				public Integer INUMBRPrecision(){
				    return 0;
				}
				public String INUMBRDefault(){
				
					return "";
				
				}
				public String INUMBRComment(){
				
				    return "";
				
				}
				public String INUMBRPattern(){
				
					return "";
				
				}
				public String INUMBROriginalDbColumnName(){
				
					return "INUMBR";
				
				}

				
			    public float ICHECK;

				public float getICHECK () {
					return this.ICHECK;
				}

				public Boolean ICHECKIsNullable(){
				    return false;
				}
				public Boolean ICHECKIsKey(){
				    return false;
				}
				public Integer ICHECKLength(){
				    return 1;
				}
				public Integer ICHECKPrecision(){
				    return 0;
				}
				public String ICHECKDefault(){
				
					return "";
				
				}
				public String ICHECKComment(){
				
				    return "";
				
				}
				public String ICHECKPattern(){
				
					return "";
				
				}
				public String ICHECKOriginalDbColumnName(){
				
					return "ICHECK";
				
				}

				
			    public String IDESCR;

				public String getIDESCR () {
					return this.IDESCR;
				}

				public Boolean IDESCRIsNullable(){
				    return false;
				}
				public Boolean IDESCRIsKey(){
				    return false;
				}
				public Integer IDESCRLength(){
				    return 30;
				}
				public Integer IDESCRPrecision(){
				    return 0;
				}
				public String IDESCRDefault(){
				
					return null;
				
				}
				public String IDESCRComment(){
				
				    return "";
				
				}
				public String IDESCRPattern(){
				
					return "";
				
				}
				public String IDESCROriginalDbColumnName(){
				
					return "IDESCR";
				
				}

				
			    public String IDSCCD;

				public String getIDSCCD () {
					return this.IDSCCD;
				}

				public Boolean IDSCCDIsNullable(){
				    return false;
				}
				public Boolean IDSCCDIsKey(){
				    return false;
				}
				public Integer IDSCCDLength(){
				    return 1;
				}
				public Integer IDSCCDPrecision(){
				    return 0;
				}
				public String IDSCCDDefault(){
				
					return null;
				
				}
				public String IDSCCDComment(){
				
				    return "";
				
				}
				public String IDSCCDPattern(){
				
					return "";
				
				}
				public String IDSCCDOriginalDbColumnName(){
				
					return "IDSCCD";
				
				}

				
			    public String ISORT;

				public String getISORT () {
					return this.ISORT;
				}

				public Boolean ISORTIsNullable(){
				    return false;
				}
				public Boolean ISORTIsKey(){
				    return false;
				}
				public Integer ISORTLength(){
				    return 10;
				}
				public Integer ISORTPrecision(){
				    return 0;
				}
				public String ISORTDefault(){
				
					return null;
				
				}
				public String ISORTComment(){
				
				    return "";
				
				}
				public String ISORTPattern(){
				
					return "";
				
				}
				public String ISORTOriginalDbColumnName(){
				
					return "ISORT";
				
				}

				
			    public String ISTYLN;

				public String getISTYLN () {
					return this.ISTYLN;
				}

				public Boolean ISTYLNIsNullable(){
				    return false;
				}
				public Boolean ISTYLNIsKey(){
				    return false;
				}
				public Integer ISTYLNLength(){
				    return 15;
				}
				public Integer ISTYLNPrecision(){
				    return 0;
				}
				public String ISTYLNDefault(){
				
					return null;
				
				}
				public String ISTYLNComment(){
				
				    return "";
				
				}
				public String ISTYLNPattern(){
				
					return "";
				
				}
				public String ISTYLNOriginalDbColumnName(){
				
					return "ISTYLN";
				
				}

				
			    public float ASNUM;

				public float getASNUM () {
					return this.ASNUM;
				}

				public Boolean ASNUMIsNullable(){
				    return false;
				}
				public Boolean ASNUMIsKey(){
				    return false;
				}
				public Integer ASNUMLength(){
				    return 6;
				}
				public Integer ASNUMPrecision(){
				    return 0;
				}
				public String ASNUMDefault(){
				
					return "";
				
				}
				public String ASNUMComment(){
				
				    return "";
				
				}
				public String ASNUMPattern(){
				
					return "";
				
				}
				public String ASNUMOriginalDbColumnName(){
				
					return "ASNUM";
				
				}

				
			    public String IVNDPN;

				public String getIVNDPN () {
					return this.IVNDPN;
				}

				public Boolean IVNDPNIsNullable(){
				    return false;
				}
				public Boolean IVNDPNIsKey(){
				    return false;
				}
				public Integer IVNDPNLength(){
				    return 15;
				}
				public Integer IVNDPNPrecision(){
				    return 0;
				}
				public String IVNDPNDefault(){
				
					return null;
				
				}
				public String IVNDPNComment(){
				
				    return "";
				
				}
				public String IVNDPNPattern(){
				
					return "";
				
				}
				public String IVNDPNOriginalDbColumnName(){
				
					return "IVNDPN";
				
				}

				
			    public float IMFGR;

				public float getIMFGR () {
					return this.IMFGR;
				}

				public Boolean IMFGRIsNullable(){
				    return false;
				}
				public Boolean IMFGRIsKey(){
				    return false;
				}
				public Integer IMFGRLength(){
				    return 6;
				}
				public Integer IMFGRPrecision(){
				    return 0;
				}
				public String IMFGRDefault(){
				
					return "";
				
				}
				public String IMFGRComment(){
				
				    return "";
				
				}
				public String IMFGRPattern(){
				
					return "";
				
				}
				public String IMFGROriginalDbColumnName(){
				
					return "IMFGR";
				
				}

				
			    public String IMFGNO;

				public String getIMFGNO () {
					return this.IMFGNO;
				}

				public Boolean IMFGNOIsNullable(){
				    return false;
				}
				public Boolean IMFGNOIsKey(){
				    return false;
				}
				public Integer IMFGNOLength(){
				    return 15;
				}
				public Integer IMFGNOPrecision(){
				    return 0;
				}
				public String IMFGNODefault(){
				
					return null;
				
				}
				public String IMFGNOComment(){
				
				    return "";
				
				}
				public String IMFGNOPattern(){
				
					return "";
				
				}
				public String IMFGNOOriginalDbColumnName(){
				
					return "IMFGNO";
				
				}

				
			    public float IDEPT;

				public float getIDEPT () {
					return this.IDEPT;
				}

				public Boolean IDEPTIsNullable(){
				    return false;
				}
				public Boolean IDEPTIsKey(){
				    return false;
				}
				public Integer IDEPTLength(){
				    return 3;
				}
				public Integer IDEPTPrecision(){
				    return 0;
				}
				public String IDEPTDefault(){
				
					return "";
				
				}
				public String IDEPTComment(){
				
				    return "";
				
				}
				public String IDEPTPattern(){
				
					return "";
				
				}
				public String IDEPTOriginalDbColumnName(){
				
					return "IDEPT";
				
				}

				
			    public float ISDEPT;

				public float getISDEPT () {
					return this.ISDEPT;
				}

				public Boolean ISDEPTIsNullable(){
				    return false;
				}
				public Boolean ISDEPTIsKey(){
				    return false;
				}
				public Integer ISDEPTLength(){
				    return 3;
				}
				public Integer ISDEPTPrecision(){
				    return 0;
				}
				public String ISDEPTDefault(){
				
					return "";
				
				}
				public String ISDEPTComment(){
				
				    return "";
				
				}
				public String ISDEPTPattern(){
				
					return "";
				
				}
				public String ISDEPTOriginalDbColumnName(){
				
					return "ISDEPT";
				
				}

				
			    public float ICLAS;

				public float getICLAS () {
					return this.ICLAS;
				}

				public Boolean ICLASIsNullable(){
				    return false;
				}
				public Boolean ICLASIsKey(){
				    return false;
				}
				public Integer ICLASLength(){
				    return 3;
				}
				public Integer ICLASPrecision(){
				    return 0;
				}
				public String ICLASDefault(){
				
					return "";
				
				}
				public String ICLASComment(){
				
				    return "";
				
				}
				public String ICLASPattern(){
				
					return "";
				
				}
				public String ICLASOriginalDbColumnName(){
				
					return "ICLAS";
				
				}

				
			    public float ISCLAS;

				public float getISCLAS () {
					return this.ISCLAS;
				}

				public Boolean ISCLASIsNullable(){
				    return false;
				}
				public Boolean ISCLASIsKey(){
				    return false;
				}
				public Integer ISCLASLength(){
				    return 3;
				}
				public Integer ISCLASPrecision(){
				    return 0;
				}
				public String ISCLASDefault(){
				
					return "";
				
				}
				public String ISCLASComment(){
				
				    return "";
				
				}
				public String ISCLASPattern(){
				
					return "";
				
				}
				public String ISCLASOriginalDbColumnName(){
				
					return "ISCLAS";
				
				}

				
			    public String BYRNUM;

				public String getBYRNUM () {
					return this.BYRNUM;
				}

				public Boolean BYRNUMIsNullable(){
				    return false;
				}
				public Boolean BYRNUMIsKey(){
				    return false;
				}
				public Integer BYRNUMLength(){
				    return 3;
				}
				public Integer BYRNUMPrecision(){
				    return 0;
				}
				public String BYRNUMDefault(){
				
					return "";
				
				}
				public String BYRNUMComment(){
				
				    return "";
				
				}
				public String BYRNUMPattern(){
				
					return "";
				
				}
				public String BYRNUMOriginalDbColumnName(){
				
					return "BYRNUM";
				
				}

				
			    public BigDecimal IASPAC;

				public BigDecimal getIASPAC () {
					return this.IASPAC;
				}

				public Boolean IASPACIsNullable(){
				    return false;
				}
				public Boolean IASPACIsKey(){
				    return false;
				}
				public Integer IASPACLength(){
				    return 2;
				}
				public Integer IASPACPrecision(){
				    return 0;
				}
				public String IASPACDefault(){
				
					return "";
				
				}
				public String IASPACComment(){
				
				    return "";
				
				}
				public String IASPACPattern(){
				
					return "";
				
				}
				public String IASPACOriginalDbColumnName(){
				
					return "IASPAC";
				
				}

				
			    public String IADVYN;

				public String getIADVYN () {
					return this.IADVYN;
				}

				public Boolean IADVYNIsNullable(){
				    return false;
				}
				public Boolean IADVYNIsKey(){
				    return false;
				}
				public Integer IADVYNLength(){
				    return 1;
				}
				public Integer IADVYNPrecision(){
				    return 0;
				}
				public String IADVYNDefault(){
				
					return "";
				
				}
				public String IADVYNComment(){
				
				    return "";
				
				}
				public String IADVYNPattern(){
				
					return "";
				
				}
				public String IADVYNOriginalDbColumnName(){
				
					return "IADVYN";
				
				}

				
			    public String IBUYCD;

				public String getIBUYCD () {
					return this.IBUYCD;
				}

				public Boolean IBUYCDIsNullable(){
				    return false;
				}
				public Boolean IBUYCDIsKey(){
				    return false;
				}
				public Integer IBUYCDLength(){
				    return 1;
				}
				public Integer IBUYCDPrecision(){
				    return 0;
				}
				public String IBUYCDDefault(){
				
					return "";
				
				}
				public String IBUYCDComment(){
				
				    return "";
				
				}
				public String IBUYCDPattern(){
				
					return "";
				
				}
				public String IBUYCDOriginalDbColumnName(){
				
					return "IBUYCD";
				
				}

				
			    public String ISET;

				public String getISET () {
					return this.ISET;
				}

				public Boolean ISETIsNullable(){
				    return false;
				}
				public Boolean ISETIsKey(){
				    return false;
				}
				public Integer ISETLength(){
				    return 1;
				}
				public Integer ISETPrecision(){
				    return 0;
				}
				public String ISETDefault(){
				
					return "";
				
				}
				public String ISETComment(){
				
				    return "";
				
				}
				public String ISETPattern(){
				
					return "";
				
				}
				public String ISETOriginalDbColumnName(){
				
					return "ISET";
				
				}

				
			    public String IWARNT;

				public String getIWARNT () {
					return this.IWARNT;
				}

				public Boolean IWARNTIsNullable(){
				    return false;
				}
				public Boolean IWARNTIsKey(){
				    return false;
				}
				public Integer IWARNTLength(){
				    return 1;
				}
				public Integer IWARNTPrecision(){
				    return 0;
				}
				public String IWARNTDefault(){
				
					return "";
				
				}
				public String IWARNTComment(){
				
				    return "";
				
				}
				public String IWARNTPattern(){
				
					return "";
				
				}
				public String IWARNTOriginalDbColumnName(){
				
					return "IWARNT";
				
				}

				
			    public String IPRMPT;

				public String getIPRMPT () {
					return this.IPRMPT;
				}

				public Boolean IPRMPTIsNullable(){
				    return false;
				}
				public Boolean IPRMPTIsKey(){
				    return false;
				}
				public Integer IPRMPTLength(){
				    return 1;
				}
				public Integer IPRMPTPrecision(){
				    return 0;
				}
				public String IPRMPTDefault(){
				
					return "";
				
				}
				public String IPRMPTComment(){
				
				    return "";
				
				}
				public String IPRMPTPattern(){
				
					return "";
				
				}
				public String IPRMPTOriginalDbColumnName(){
				
					return "IPRMPT";
				
				}

				
			    public String IPRVNT;

				public String getIPRVNT () {
					return this.IPRVNT;
				}

				public Boolean IPRVNTIsNullable(){
				    return false;
				}
				public Boolean IPRVNTIsKey(){
				    return false;
				}
				public Integer IPRVNTLength(){
				    return 1;
				}
				public Integer IPRVNTPrecision(){
				    return 0;
				}
				public String IPRVNTDefault(){
				
					return "";
				
				}
				public String IPRVNTComment(){
				
				    return "";
				
				}
				public String IPRVNTPattern(){
				
					return "";
				
				}
				public String IPRVNTOriginalDbColumnName(){
				
					return "IPRVNT";
				
				}

				
			    public String ITKTTR;

				public String getITKTTR () {
					return this.ITKTTR;
				}

				public Boolean ITKTTRIsNullable(){
				    return false;
				}
				public Boolean ITKTTRIsKey(){
				    return false;
				}
				public Integer ITKTTRLength(){
				    return 1;
				}
				public Integer ITKTTRPrecision(){
				    return 0;
				}
				public String ITKTTRDefault(){
				
					return "";
				
				}
				public String ITKTTRComment(){
				
				    return "";
				
				}
				public String ITKTTRPattern(){
				
					return "";
				
				}
				public String ITKTTROriginalDbColumnName(){
				
					return "ITKTTR";
				
				}

				
			    public String ITKTTA;

				public String getITKTTA () {
					return this.ITKTTA;
				}

				public Boolean ITKTTAIsNullable(){
				    return false;
				}
				public Boolean ITKTTAIsKey(){
				    return false;
				}
				public Integer ITKTTALength(){
				    return 1;
				}
				public Integer ITKTTAPrecision(){
				    return 0;
				}
				public String ITKTTADefault(){
				
					return "";
				
				}
				public String ITKTTAComment(){
				
				    return "";
				
				}
				public String ITKTTAPattern(){
				
					return "";
				
				}
				public String ITKTTAOriginalDbColumnName(){
				
					return "ITKTTA";
				
				}

				
			    public BigDecimal ITKTN;

				public BigDecimal getITKTN () {
					return this.ITKTN;
				}

				public Boolean ITKTNIsNullable(){
				    return false;
				}
				public Boolean ITKTNIsKey(){
				    return false;
				}
				public Integer ITKTNLength(){
				    return 2;
				}
				public Integer ITKTNPrecision(){
				    return 0;
				}
				public String ITKTNDefault(){
				
					return "";
				
				}
				public String ITKTNComment(){
				
				    return "";
				
				}
				public String ITKTNPattern(){
				
					return "";
				
				}
				public String ITKTNOriginalDbColumnName(){
				
					return "ITKTN";
				
				}

				
			    public String ILBLTR;

				public String getILBLTR () {
					return this.ILBLTR;
				}

				public Boolean ILBLTRIsNullable(){
				    return false;
				}
				public Boolean ILBLTRIsKey(){
				    return false;
				}
				public Integer ILBLTRLength(){
				    return 1;
				}
				public Integer ILBLTRPrecision(){
				    return 0;
				}
				public String ILBLTRDefault(){
				
					return "";
				
				}
				public String ILBLTRComment(){
				
				    return "";
				
				}
				public String ILBLTRPattern(){
				
					return "";
				
				}
				public String ILBLTROriginalDbColumnName(){
				
					return "ILBLTR";
				
				}

				
			    public String ILBLTA;

				public String getILBLTA () {
					return this.ILBLTA;
				}

				public Boolean ILBLTAIsNullable(){
				    return false;
				}
				public Boolean ILBLTAIsKey(){
				    return false;
				}
				public Integer ILBLTALength(){
				    return 1;
				}
				public Integer ILBLTAPrecision(){
				    return 0;
				}
				public String ILBLTADefault(){
				
					return "";
				
				}
				public String ILBLTAComment(){
				
				    return "";
				
				}
				public String ILBLTAPattern(){
				
					return "";
				
				}
				public String ILBLTAOriginalDbColumnName(){
				
					return "ILBLTA";
				
				}

				
			    public String IFINLN;

				public String getIFINLN () {
					return this.IFINLN;
				}

				public Boolean IFINLNIsNullable(){
				    return false;
				}
				public Boolean IFINLNIsKey(){
				    return false;
				}
				public Integer IFINLNLength(){
				    return 5;
				}
				public Integer IFINLNPrecision(){
				    return 0;
				}
				public String IFINLNDefault(){
				
					return "";
				
				}
				public String IFINLNComment(){
				
				    return "";
				
				}
				public String IFINLNPattern(){
				
					return "";
				
				}
				public String IFINLNOriginalDbColumnName(){
				
					return "IFINLN";
				
				}

				
			    public String IPROFL;

				public String getIPROFL () {
					return this.IPROFL;
				}

				public Boolean IPROFLIsNullable(){
				    return false;
				}
				public Boolean IPROFLIsKey(){
				    return false;
				}
				public Integer IPROFLLength(){
				    return 5;
				}
				public Integer IPROFLPrecision(){
				    return 0;
				}
				public String IPROFLDefault(){
				
					return "";
				
				}
				public String IPROFLComment(){
				
				    return "";
				
				}
				public String IPROFLPattern(){
				
					return "";
				
				}
				public String IPROFLOriginalDbColumnName(){
				
					return "IPROFL";
				
				}

				
			    public String IMODUL;

				public String getIMODUL () {
					return this.IMODUL;
				}

				public Boolean IMODULIsNullable(){
				    return false;
				}
				public Boolean IMODULIsKey(){
				    return false;
				}
				public Integer IMODULLength(){
				    return 5;
				}
				public Integer IMODULPrecision(){
				    return 0;
				}
				public String IMODULDefault(){
				
					return "";
				
				}
				public String IMODULComment(){
				
				    return "";
				
				}
				public String IMODULPattern(){
				
					return "";
				
				}
				public String IMODULOriginalDbColumnName(){
				
					return "IMODUL";
				
				}

				
			    public String ISTYPE;

				public String getISTYPE () {
					return this.ISTYPE;
				}

				public Boolean ISTYPEIsNullable(){
				    return false;
				}
				public Boolean ISTYPEIsKey(){
				    return false;
				}
				public Integer ISTYPELength(){
				    return 2;
				}
				public Integer ISTYPEPrecision(){
				    return 0;
				}
				public String ISTYPEDefault(){
				
					return "";
				
				}
				public String ISTYPEComment(){
				
				    return "";
				
				}
				public String ISTYPEPattern(){
				
					return "";
				
				}
				public String ISTYPEOriginalDbColumnName(){
				
					return "ISTYPE";
				
				}

				
			    public float ISCOLR;

				public float getISCOLR () {
					return this.ISCOLR;
				}

				public Boolean ISCOLRIsNullable(){
				    return false;
				}
				public Boolean ISCOLRIsKey(){
				    return false;
				}
				public Integer ISCOLRLength(){
				    return 4;
				}
				public Integer ISCOLRPrecision(){
				    return 0;
				}
				public String ISCOLRDefault(){
				
					return "";
				
				}
				public String ISCOLRComment(){
				
				    return "";
				
				}
				public String ISCOLRPattern(){
				
					return "";
				
				}
				public String ISCOLROriginalDbColumnName(){
				
					return "ISCOLR";
				
				}

				
			    public String ISSIZE;

				public String getISSIZE () {
					return this.ISSIZE;
				}

				public Boolean ISSIZEIsNullable(){
				    return false;
				}
				public Boolean ISSIZEIsKey(){
				    return false;
				}
				public Integer ISSIZELength(){
				    return 4;
				}
				public Integer ISSIZEPrecision(){
				    return 0;
				}
				public String ISSIZEDefault(){
				
					return "";
				
				}
				public String ISSIZEComment(){
				
				    return "";
				
				}
				public String ISSIZEPattern(){
				
					return "";
				
				}
				public String ISSIZEOriginalDbColumnName(){
				
					return "ISSIZE";
				
				}

				
			    public String IHAZCD;

				public String getIHAZCD () {
					return this.IHAZCD;
				}

				public Boolean IHAZCDIsNullable(){
				    return false;
				}
				public Boolean IHAZCDIsKey(){
				    return false;
				}
				public Integer IHAZCDLength(){
				    return 2;
				}
				public Integer IHAZCDPrecision(){
				    return 0;
				}
				public String IHAZCDDefault(){
				
					return "";
				
				}
				public String IHAZCDComment(){
				
				    return "";
				
				}
				public String IHAZCDPattern(){
				
					return "";
				
				}
				public String IHAZCDOriginalDbColumnName(){
				
					return "IHAZCD";
				
				}

				
			    public String MCHNUM;

				public String getMCHNUM () {
					return this.MCHNUM;
				}

				public Boolean MCHNUMIsNullable(){
				    return false;
				}
				public Boolean MCHNUMIsKey(){
				    return false;
				}
				public Integer MCHNUMLength(){
				    return 3;
				}
				public Integer MCHNUMPrecision(){
				    return 0;
				}
				public String MCHNUMDefault(){
				
					return "";
				
				}
				public String MCHNUMComment(){
				
				    return "";
				
				}
				public String MCHNUMPattern(){
				
					return "";
				
				}
				public String MCHNUMOriginalDbColumnName(){
				
					return "MCHNUM";
				
				}

				
			    public BigDecimal ISUBST;

				public BigDecimal getISUBST () {
					return this.ISUBST;
				}

				public Boolean ISUBSTIsNullable(){
				    return false;
				}
				public Boolean ISUBSTIsKey(){
				    return false;
				}
				public Integer ISUBSTLength(){
				    return 9;
				}
				public Integer ISUBSTPrecision(){
				    return 0;
				}
				public String ISUBSTDefault(){
				
					return "";
				
				}
				public String ISUBSTComment(){
				
				    return "";
				
				}
				public String ISUBSTPattern(){
				
					return "";
				
				}
				public String ISUBSTOriginalDbColumnName(){
				
					return "ISUBST";
				
				}

				
			    public BigDecimal ICORE;

				public BigDecimal getICORE () {
					return this.ICORE;
				}

				public Boolean ICOREIsNullable(){
				    return false;
				}
				public Boolean ICOREIsKey(){
				    return false;
				}
				public Integer ICORELength(){
				    return 9;
				}
				public Integer ICOREPrecision(){
				    return 0;
				}
				public String ICOREDefault(){
				
					return "";
				
				}
				public String ICOREComment(){
				
				    return "";
				
				}
				public String ICOREPattern(){
				
					return "";
				
				}
				public String ICOREOriginalDbColumnName(){
				
					return "ICORE";
				
				}

				
			    public BigDecimal IREPL;

				public BigDecimal getIREPL () {
					return this.IREPL;
				}

				public Boolean IREPLIsNullable(){
				    return false;
				}
				public Boolean IREPLIsKey(){
				    return false;
				}
				public Integer IREPLLength(){
				    return 9;
				}
				public Integer IREPLPrecision(){
				    return 0;
				}
				public String IREPLDefault(){
				
					return "";
				
				}
				public String IREPLComment(){
				
				    return "";
				
				}
				public String IREPLPattern(){
				
					return "";
				
				}
				public String IREPLOriginalDbColumnName(){
				
					return "IREPL";
				
				}

				
			    public String ISLUM;

				public String getISLUM () {
					return this.ISLUM;
				}

				public Boolean ISLUMIsNullable(){
				    return false;
				}
				public Boolean ISLUMIsKey(){
				    return false;
				}
				public Integer ISLUMLength(){
				    return 3;
				}
				public Integer ISLUMPrecision(){
				    return 0;
				}
				public String ISLUMDefault(){
				
					return "";
				
				}
				public String ISLUMComment(){
				
				    return "";
				
				}
				public String ISLUMPattern(){
				
					return "";
				
				}
				public String ISLUMOriginalDbColumnName(){
				
					return "ISLUM";
				
				}

				
			    public BigDecimal IUMCV2;

				public BigDecimal getIUMCV2 () {
					return this.IUMCV2;
				}

				public Boolean IUMCV2IsNullable(){
				    return false;
				}
				public Boolean IUMCV2IsKey(){
				    return false;
				}
				public Integer IUMCV2Length(){
				    return 10;
				}
				public Integer IUMCV2Precision(){
				    return 5;
				}
				public String IUMCV2Default(){
				
					return "";
				
				}
				public String IUMCV2Comment(){
				
				    return "";
				
				}
				public String IUMCV2Pattern(){
				
					return "";
				
				}
				public String IUMCV2OriginalDbColumnName(){
				
					return "IUMCV2";
				
				}

				
			    public String IBYUM;

				public String getIBYUM () {
					return this.IBYUM;
				}

				public Boolean IBYUMIsNullable(){
				    return false;
				}
				public Boolean IBYUMIsKey(){
				    return false;
				}
				public Integer IBYUMLength(){
				    return 3;
				}
				public Integer IBYUMPrecision(){
				    return 0;
				}
				public String IBYUMDefault(){
				
					return "";
				
				}
				public String IBYUMComment(){
				
				    return "";
				
				}
				public String IBYUMPattern(){
				
					return "";
				
				}
				public String IBYUMOriginalDbColumnName(){
				
					return "IBYUM";
				
				}

				
			    public BigDecimal IMINPK;

				public BigDecimal getIMINPK () {
					return this.IMINPK;
				}

				public Boolean IMINPKIsNullable(){
				    return false;
				}
				public Boolean IMINPKIsKey(){
				    return false;
				}
				public Integer IMINPKLength(){
				    return 9;
				}
				public Integer IMINPKPrecision(){
				    return 2;
				}
				public String IMINPKDefault(){
				
					return "";
				
				}
				public String IMINPKComment(){
				
				    return "";
				
				}
				public String IMINPKPattern(){
				
					return "";
				
				}
				public String IMINPKOriginalDbColumnName(){
				
					return "IMINPK";
				
				}

				
			    public BigDecimal ISTDPK;

				public BigDecimal getISTDPK () {
					return this.ISTDPK;
				}

				public Boolean ISTDPKIsNullable(){
				    return false;
				}
				public Boolean ISTDPKIsKey(){
				    return false;
				}
				public Integer ISTDPKLength(){
				    return 9;
				}
				public Integer ISTDPKPrecision(){
				    return 2;
				}
				public String ISTDPKDefault(){
				
					return "";
				
				}
				public String ISTDPKComment(){
				
				    return "";
				
				}
				public String ISTDPKPattern(){
				
					return "";
				
				}
				public String ISTDPKOriginalDbColumnName(){
				
					return "ISTDPK";
				
				}

				
			    public String IHLDOR;

				public String getIHLDOR () {
					return this.IHLDOR;
				}

				public Boolean IHLDORIsNullable(){
				    return false;
				}
				public Boolean IHLDORIsKey(){
				    return false;
				}
				public Integer IHLDORLength(){
				    return 1;
				}
				public Integer IHLDORPrecision(){
				    return 0;
				}
				public String IHLDORDefault(){
				
					return "";
				
				}
				public String IHLDORComment(){
				
				    return "";
				
				}
				public String IHLDORPattern(){
				
					return "";
				
				}
				public String IHLDOROriginalDbColumnName(){
				
					return "IHLDOR";
				
				}

				
			    public BigDecimal IMOQTY;

				public BigDecimal getIMOQTY () {
					return this.IMOQTY;
				}

				public Boolean IMOQTYIsNullable(){
				    return false;
				}
				public Boolean IMOQTYIsKey(){
				    return false;
				}
				public Integer IMOQTYLength(){
				    return 7;
				}
				public Integer IMOQTYPrecision(){
				    return 0;
				}
				public String IMOQTYDefault(){
				
					return "";
				
				}
				public String IMOQTYComment(){
				
				    return "";
				
				}
				public String IMOQTYPattern(){
				
					return "";
				
				}
				public String IMOQTYOriginalDbColumnName(){
				
					return "IMOQTY";
				
				}

				
			    public BigDecimal IMNSTK;

				public BigDecimal getIMNSTK () {
					return this.IMNSTK;
				}

				public Boolean IMNSTKIsNullable(){
				    return false;
				}
				public Boolean IMNSTKIsKey(){
				    return false;
				}
				public Integer IMNSTKLength(){
				    return 7;
				}
				public Integer IMNSTKPrecision(){
				    return 0;
				}
				public String IMNSTKDefault(){
				
					return "";
				
				}
				public String IMNSTKComment(){
				
				    return "";
				
				}
				public String IMNSTKPattern(){
				
					return "";
				
				}
				public String IMNSTKOriginalDbColumnName(){
				
					return "IMNSTK";
				
				}

				
			    public BigDecimal IMXSTK;

				public BigDecimal getIMXSTK () {
					return this.IMXSTK;
				}

				public Boolean IMXSTKIsNullable(){
				    return false;
				}
				public Boolean IMXSTKIsKey(){
				    return false;
				}
				public Integer IMXSTKLength(){
				    return 7;
				}
				public Integer IMXSTKPrecision(){
				    return 0;
				}
				public String IMXSTKDefault(){
				
					return "";
				
				}
				public String IMXSTKComment(){
				
				    return "";
				
				}
				public String IMXSTKPattern(){
				
					return "";
				
				}
				public String IMXSTKOriginalDbColumnName(){
				
					return "IMXSTK";
				
				}

				
			    public BigDecimal IMDSTK;

				public BigDecimal getIMDSTK () {
					return this.IMDSTK;
				}

				public Boolean IMDSTKIsNullable(){
				    return false;
				}
				public Boolean IMDSTKIsKey(){
				    return false;
				}
				public Integer IMDSTKLength(){
				    return 7;
				}
				public Integer IMDSTKPrecision(){
				    return 0;
				}
				public String IMDSTKDefault(){
				
					return "";
				
				}
				public String IMDSTKComment(){
				
				    return "";
				
				}
				public String IMDSTKPattern(){
				
					return "";
				
				}
				public String IMDSTKOriginalDbColumnName(){
				
					return "IMDSTK";
				
				}

				
			    public BigDecimal IDSPLY;

				public BigDecimal getIDSPLY () {
					return this.IDSPLY;
				}

				public Boolean IDSPLYIsNullable(){
				    return false;
				}
				public Boolean IDSPLYIsKey(){
				    return false;
				}
				public Integer IDSPLYLength(){
				    return 7;
				}
				public Integer IDSPLYPrecision(){
				    return 0;
				}
				public String IDSPLYDefault(){
				
					return "";
				
				}
				public String IDSPLYComment(){
				
				    return "";
				
				}
				public String IDSPLYPattern(){
				
					return "";
				
				}
				public String IDSPLYOriginalDbColumnName(){
				
					return "IDSPLY";
				
				}

				
			    public BigDecimal IOMULT;

				public BigDecimal getIOMULT () {
					return this.IOMULT;
				}

				public Boolean IOMULTIsNullable(){
				    return false;
				}
				public Boolean IOMULTIsKey(){
				    return false;
				}
				public Integer IOMULTLength(){
				    return 7;
				}
				public Integer IOMULTPrecision(){
				    return 0;
				}
				public String IOMULTDefault(){
				
					return "";
				
				}
				public String IOMULTComment(){
				
				    return "";
				
				}
				public String IOMULTPattern(){
				
					return "";
				
				}
				public String IOMULTOriginalDbColumnName(){
				
					return "IOMULT";
				
				}

				
			    public String IRPLCD;

				public String getIRPLCD () {
					return this.IRPLCD;
				}

				public Boolean IRPLCDIsNullable(){
				    return false;
				}
				public Boolean IRPLCDIsKey(){
				    return false;
				}
				public Integer IRPLCDLength(){
				    return 1;
				}
				public Integer IRPLCDPrecision(){
				    return 0;
				}
				public String IRPLCDDefault(){
				
					return "";
				
				}
				public String IRPLCDComment(){
				
				    return "";
				
				}
				public String IRPLCDPattern(){
				
					return "";
				
				}
				public String IRPLCDOriginalDbColumnName(){
				
					return "IRPLCD";
				
				}

				
			    public BigDecimal IMFPRC;

				public BigDecimal getIMFPRC () {
					return this.IMFPRC;
				}

				public Boolean IMFPRCIsNullable(){
				    return false;
				}
				public Boolean IMFPRCIsKey(){
				    return false;
				}
				public Integer IMFPRCLength(){
				    return 9;
				}
				public Integer IMFPRCPrecision(){
				    return 2;
				}
				public String IMFPRCDefault(){
				
					return "";
				
				}
				public String IMFPRCComment(){
				
				    return "";
				
				}
				public String IMFPRCPattern(){
				
					return "";
				
				}
				public String IMFPRCOriginalDbColumnName(){
				
					return "IMFPRC";
				
				}

				
			    public BigDecimal IWGHT;

				public BigDecimal getIWGHT () {
					return this.IWGHT;
				}

				public Boolean IWGHTIsNullable(){
				    return false;
				}
				public Boolean IWGHTIsKey(){
				    return false;
				}
				public Integer IWGHTLength(){
				    return 7;
				}
				public Integer IWGHTPrecision(){
				    return 3;
				}
				public String IWGHTDefault(){
				
					return "";
				
				}
				public String IWGHTComment(){
				
				    return "";
				
				}
				public String IWGHTPattern(){
				
					return "";
				
				}
				public String IWGHTOriginalDbColumnName(){
				
					return "IWGHT";
				
				}

				
			    public BigDecimal ICUBE;

				public BigDecimal getICUBE () {
					return this.ICUBE;
				}

				public Boolean ICUBEIsNullable(){
				    return false;
				}
				public Boolean ICUBEIsKey(){
				    return false;
				}
				public Integer ICUBELength(){
				    return 9;
				}
				public Integer ICUBEPrecision(){
				    return 3;
				}
				public String ICUBEDefault(){
				
					return "";
				
				}
				public String ICUBEComment(){
				
				    return "";
				
				}
				public String ICUBEPattern(){
				
					return "";
				
				}
				public String ICUBEOriginalDbColumnName(){
				
					return "ICUBE";
				
				}

				
			    public BigDecimal IDLGTH;

				public BigDecimal getIDLGTH () {
					return this.IDLGTH;
				}

				public Boolean IDLGTHIsNullable(){
				    return false;
				}
				public Boolean IDLGTHIsKey(){
				    return false;
				}
				public Integer IDLGTHLength(){
				    return 5;
				}
				public Integer IDLGTHPrecision(){
				    return 1;
				}
				public String IDLGTHDefault(){
				
					return "";
				
				}
				public String IDLGTHComment(){
				
				    return "";
				
				}
				public String IDLGTHPattern(){
				
					return "";
				
				}
				public String IDLGTHOriginalDbColumnName(){
				
					return "IDLGTH";
				
				}

				
			    public BigDecimal IDWDTH;

				public BigDecimal getIDWDTH () {
					return this.IDWDTH;
				}

				public Boolean IDWDTHIsNullable(){
				    return false;
				}
				public Boolean IDWDTHIsKey(){
				    return false;
				}
				public Integer IDWDTHLength(){
				    return 5;
				}
				public Integer IDWDTHPrecision(){
				    return 1;
				}
				public String IDWDTHDefault(){
				
					return "";
				
				}
				public String IDWDTHComment(){
				
				    return "";
				
				}
				public String IDWDTHPattern(){
				
					return "";
				
				}
				public String IDWDTHOriginalDbColumnName(){
				
					return "IDWDTH";
				
				}

				
			    public BigDecimal IDHGHT;

				public BigDecimal getIDHGHT () {
					return this.IDHGHT;
				}

				public Boolean IDHGHTIsNullable(){
				    return false;
				}
				public Boolean IDHGHTIsKey(){
				    return false;
				}
				public Integer IDHGHTLength(){
				    return 5;
				}
				public Integer IDHGHTPrecision(){
				    return 1;
				}
				public String IDHGHTDefault(){
				
					return "";
				
				}
				public String IDHGHTComment(){
				
				    return "";
				
				}
				public String IDHGHTPattern(){
				
					return "";
				
				}
				public String IDHGHTOriginalDbColumnName(){
				
					return "IDHGHT";
				
				}

				
			    public BigDecimal IMDATE;

				public BigDecimal getIMDATE () {
					return this.IMDATE;
				}

				public Boolean IMDATEIsNullable(){
				    return false;
				}
				public Boolean IMDATEIsKey(){
				    return false;
				}
				public Integer IMDATELength(){
				    return 6;
				}
				public Integer IMDATEPrecision(){
				    return 0;
				}
				public String IMDATEDefault(){
				
					return "";
				
				}
				public String IMDATEComment(){
				
				    return "";
				
				}
				public String IMDATEPattern(){
				
					return "";
				
				}
				public String IMDATEOriginalDbColumnName(){
				
					return "IMDATE";
				
				}

				
			    public BigDecimal IMCENT;

				public BigDecimal getIMCENT () {
					return this.IMCENT;
				}

				public Boolean IMCENTIsNullable(){
				    return false;
				}
				public Boolean IMCENTIsKey(){
				    return false;
				}
				public Integer IMCENTLength(){
				    return 1;
				}
				public Integer IMCENTPrecision(){
				    return 0;
				}
				public String IMCENTDefault(){
				
					return "";
				
				}
				public String IMCENTComment(){
				
				    return "";
				
				}
				public String IMCENTPattern(){
				
					return "";
				
				}
				public String IMCENTOriginalDbColumnName(){
				
					return "IMCENT";
				
				}

				
			    public BigDecimal IVPLTI;

				public BigDecimal getIVPLTI () {
					return this.IVPLTI;
				}

				public Boolean IVPLTIIsNullable(){
				    return false;
				}
				public Boolean IVPLTIIsKey(){
				    return false;
				}
				public Integer IVPLTILength(){
				    return 3;
				}
				public Integer IVPLTIPrecision(){
				    return 0;
				}
				public String IVPLTIDefault(){
				
					return "";
				
				}
				public String IVPLTIComment(){
				
				    return "";
				
				}
				public String IVPLTIPattern(){
				
					return "";
				
				}
				public String IVPLTIOriginalDbColumnName(){
				
					return "IVPLTI";
				
				}

				
			    public BigDecimal IVPLHI;

				public BigDecimal getIVPLHI () {
					return this.IVPLHI;
				}

				public Boolean IVPLHIIsNullable(){
				    return false;
				}
				public Boolean IVPLHIIsKey(){
				    return false;
				}
				public Integer IVPLHILength(){
				    return 3;
				}
				public Integer IVPLHIPrecision(){
				    return 0;
				}
				public String IVPLHIDefault(){
				
					return "";
				
				}
				public String IVPLHIComment(){
				
				    return "";
				
				}
				public String IVPLHIPattern(){
				
					return "";
				
				}
				public String IVPLHIOriginalDbColumnName(){
				
					return "IVPLHI";
				
				}

				
			    public float SHPNUM;

				public float getSHPNUM () {
					return this.SHPNUM;
				}

				public Boolean SHPNUMIsNullable(){
				    return false;
				}
				public Boolean SHPNUMIsKey(){
				    return false;
				}
				public Integer SHPNUMLength(){
				    return 2;
				}
				public Integer SHPNUMPrecision(){
				    return 0;
				}
				public String SHPNUMDefault(){
				
					return "";
				
				}
				public String SHPNUMComment(){
				
				    return "";
				
				}
				public String SHPNUMPattern(){
				
					return "";
				
				}
				public String SHPNUMOriginalDbColumnName(){
				
					return "SHPNUM";
				
				}

				
			    public String IDISTM;

				public String getIDISTM () {
					return this.IDISTM;
				}

				public Boolean IDISTMIsNullable(){
				    return false;
				}
				public Boolean IDISTMIsKey(){
				    return false;
				}
				public Integer IDISTMLength(){
				    return 1;
				}
				public Integer IDISTMPrecision(){
				    return 0;
				}
				public String IDISTMDefault(){
				
					return "";
				
				}
				public String IDISTMComment(){
				
				    return "";
				
				}
				public String IDISTMPattern(){
				
					return "";
				
				}
				public String IDISTMOriginalDbColumnName(){
				
					return "IDISTM";
				
				}

				
			    public String IHLDWO;

				public String getIHLDWO () {
					return this.IHLDWO;
				}

				public Boolean IHLDWOIsNullable(){
				    return false;
				}
				public Boolean IHLDWOIsKey(){
				    return false;
				}
				public Integer IHLDWOLength(){
				    return 1;
				}
				public Integer IHLDWOPrecision(){
				    return 0;
				}
				public String IHLDWODefault(){
				
					return "";
				
				}
				public String IHLDWOComment(){
				
				    return "";
				
				}
				public String IHLDWOPattern(){
				
					return "";
				
				}
				public String IHLDWOOriginalDbColumnName(){
				
					return "IHLDWO";
				
				}

				
			    public float IIGNUM;

				public float getIIGNUM () {
					return this.IIGNUM;
				}

				public Boolean IIGNUMIsNullable(){
				    return false;
				}
				public Boolean IIGNUMIsKey(){
				    return false;
				}
				public Integer IIGNUMLength(){
				    return 3;
				}
				public Integer IIGNUMPrecision(){
				    return 0;
				}
				public String IIGNUMDefault(){
				
					return "";
				
				}
				public String IIGNUMComment(){
				
				    return "";
				
				}
				public String IIGNUMPattern(){
				
					return "";
				
				}
				public String IIGNUMOriginalDbColumnName(){
				
					return "IIGNUM";
				
				}

				
			    public String ISDIM;

				public String getISDIM () {
					return this.ISDIM;
				}

				public Boolean ISDIMIsNullable(){
				    return false;
				}
				public Boolean ISDIMIsKey(){
				    return false;
				}
				public Integer ISDIMLength(){
				    return 4;
				}
				public Integer ISDIMPrecision(){
				    return 0;
				}
				public String ISDIMDefault(){
				
					return "";
				
				}
				public String ISDIMComment(){
				
				    return "";
				
				}
				public String ISDIMPattern(){
				
					return "";
				
				}
				public String ISDIMOriginalDbColumnName(){
				
					return "ISDIM";
				
				}

				
			    public String IVATCD;

				public String getIVATCD () {
					return this.IVATCD;
				}

				public Boolean IVATCDIsNullable(){
				    return false;
				}
				public Boolean IVATCDIsKey(){
				    return false;
				}
				public Integer IVATCDLength(){
				    return 2;
				}
				public Integer IVATCDPrecision(){
				    return 0;
				}
				public String IVATCDDefault(){
				
					return "";
				
				}
				public String IVATCDComment(){
				
				    return "";
				
				}
				public String IVATCDPattern(){
				
					return "";
				
				}
				public String IVATCDOriginalDbColumnName(){
				
					return "IVATCD";
				
				}

				
			    public float IPLAN;

				public float getIPLAN () {
					return this.IPLAN;
				}

				public Boolean IPLANIsNullable(){
				    return false;
				}
				public Boolean IPLANIsKey(){
				    return false;
				}
				public Integer IPLANLength(){
				    return 5;
				}
				public Integer IPLANPrecision(){
				    return 0;
				}
				public String IPLANDefault(){
				
					return "";
				
				}
				public String IPLANComment(){
				
				    return "";
				
				}
				public String IPLANPattern(){
				
					return "";
				
				}
				public String IPLANOriginalDbColumnName(){
				
					return "IPLAN";
				
				}

				
			    public String IVLRK1;

				public String getIVLRK1 () {
					return this.IVLRK1;
				}

				public Boolean IVLRK1IsNullable(){
				    return false;
				}
				public Boolean IVLRK1IsKey(){
				    return false;
				}
				public Integer IVLRK1Length(){
				    return 1;
				}
				public Integer IVLRK1Precision(){
				    return 0;
				}
				public String IVLRK1Default(){
				
					return "";
				
				}
				public String IVLRK1Comment(){
				
				    return "";
				
				}
				public String IVLRK1Pattern(){
				
					return "";
				
				}
				public String IVLRK1OriginalDbColumnName(){
				
					return "IVLRK1";
				
				}

				
			    public String IVLRK2;

				public String getIVLRK2 () {
					return this.IVLRK2;
				}

				public Boolean IVLRK2IsNullable(){
				    return false;
				}
				public Boolean IVLRK2IsKey(){
				    return false;
				}
				public Integer IVLRK2Length(){
				    return 1;
				}
				public Integer IVLRK2Precision(){
				    return 0;
				}
				public String IVLRK2Default(){
				
					return "";
				
				}
				public String IVLRK2Comment(){
				
				    return "";
				
				}
				public String IVLRK2Pattern(){
				
					return "";
				
				}
				public String IVLRK2OriginalDbColumnName(){
				
					return "IVLRK2";
				
				}

				
			    public String IVLRK3;

				public String getIVLRK3 () {
					return this.IVLRK3;
				}

				public Boolean IVLRK3IsNullable(){
				    return false;
				}
				public Boolean IVLRK3IsKey(){
				    return false;
				}
				public Integer IVLRK3Length(){
				    return 1;
				}
				public Integer IVLRK3Precision(){
				    return 0;
				}
				public String IVLRK3Default(){
				
					return "";
				
				}
				public String IVLRK3Comment(){
				
				    return "";
				
				}
				public String IVLRK3Pattern(){
				
					return "";
				
				}
				public String IVLRK3OriginalDbColumnName(){
				
					return "IVLRK3";
				
				}

				
			    public String IVLRK4;

				public String getIVLRK4 () {
					return this.IVLRK4;
				}

				public Boolean IVLRK4IsNullable(){
				    return false;
				}
				public Boolean IVLRK4IsKey(){
				    return false;
				}
				public Integer IVLRK4Length(){
				    return 1;
				}
				public Integer IVLRK4Precision(){
				    return 0;
				}
				public String IVLRK4Default(){
				
					return "";
				
				}
				public String IVLRK4Comment(){
				
				    return "";
				
				}
				public String IVLRK4Pattern(){
				
					return "";
				
				}
				public String IVLRK4OriginalDbColumnName(){
				
					return "IVLRK4";
				
				}

				
			    public BigDecimal IRPLCN;

				public BigDecimal getIRPLCN () {
					return this.IRPLCN;
				}

				public Boolean IRPLCNIsNullable(){
				    return false;
				}
				public Boolean IRPLCNIsKey(){
				    return false;
				}
				public Integer IRPLCNLength(){
				    return 1;
				}
				public Integer IRPLCNPrecision(){
				    return 0;
				}
				public String IRPLCNDefault(){
				
					return "";
				
				}
				public String IRPLCNComment(){
				
				    return "";
				
				}
				public String IRPLCNPattern(){
				
					return "";
				
				}
				public String IRPLCNOriginalDbColumnName(){
				
					return "IRPLCN";
				
				}

				
			    public BigDecimal IRPLDT;

				public BigDecimal getIRPLDT () {
					return this.IRPLDT;
				}

				public Boolean IRPLDTIsNullable(){
				    return false;
				}
				public Boolean IRPLDTIsKey(){
				    return false;
				}
				public Integer IRPLDTLength(){
				    return 6;
				}
				public Integer IRPLDTPrecision(){
				    return 0;
				}
				public String IRPLDTDefault(){
				
					return "";
				
				}
				public String IRPLDTComment(){
				
				    return "";
				
				}
				public String IRPLDTPattern(){
				
					return "";
				
				}
				public String IRPLDTOriginalDbColumnName(){
				
					return "IRPLDT";
				
				}

				
			    public String ISEASN;

				public String getISEASN () {
					return this.ISEASN;
				}

				public Boolean ISEASNIsNullable(){
				    return false;
				}
				public Boolean ISEASNIsKey(){
				    return false;
				}
				public Integer ISEASNLength(){
				    return 3;
				}
				public Integer ISEASNPrecision(){
				    return 0;
				}
				public String ISEASNDefault(){
				
					return "";
				
				}
				public String ISEASNComment(){
				
				    return "";
				
				}
				public String ISEASNPattern(){
				
					return "";
				
				}
				public String ISEASNOriginalDbColumnName(){
				
					return "ISEASN";
				
				}

				
			    public BigDecimal IDEADC;

				public BigDecimal getIDEADC () {
					return this.IDEADC;
				}

				public Boolean IDEADCIsNullable(){
				    return false;
				}
				public Boolean IDEADCIsKey(){
				    return false;
				}
				public Integer IDEADCLength(){
				    return 1;
				}
				public Integer IDEADCPrecision(){
				    return 0;
				}
				public String IDEADCDefault(){
				
					return "";
				
				}
				public String IDEADCComment(){
				
				    return "";
				
				}
				public String IDEADCPattern(){
				
					return "";
				
				}
				public String IDEADCOriginalDbColumnName(){
				
					return "IDEADC";
				
				}

				
			    public BigDecimal IDEADD;

				public BigDecimal getIDEADD () {
					return this.IDEADD;
				}

				public Boolean IDEADDIsNullable(){
				    return false;
				}
				public Boolean IDEADDIsKey(){
				    return false;
				}
				public Integer IDEADDLength(){
				    return 6;
				}
				public Integer IDEADDPrecision(){
				    return 0;
				}
				public String IDEADDDefault(){
				
					return "";
				
				}
				public String IDEADDComment(){
				
				    return "";
				
				}
				public String IDEADDPattern(){
				
					return "";
				
				}
				public String IDEADDOriginalDbColumnName(){
				
					return "IDEADD";
				
				}

				
			    public BigDecimal INLRTL;

				public BigDecimal getINLRTL () {
					return this.INLRTL;
				}

				public Boolean INLRTLIsNullable(){
				    return false;
				}
				public Boolean INLRTLIsKey(){
				    return false;
				}
				public Integer INLRTLLength(){
				    return 9;
				}
				public Integer INLRTLPrecision(){
				    return 2;
				}
				public String INLRTLDefault(){
				
					return "";
				
				}
				public String INLRTLComment(){
				
				    return "";
				
				}
				public String INLRTLPattern(){
				
					return "";
				
				}
				public String INLRTLOriginalDbColumnName(){
				
					return "INLRTL";
				
				}

				
			    public String IHANDL;

				public String getIHANDL () {
					return this.IHANDL;
				}

				public Boolean IHANDLIsNullable(){
				    return false;
				}
				public Boolean IHANDLIsKey(){
				    return false;
				}
				public Integer IHANDLLength(){
				    return 1;
				}
				public Integer IHANDLPrecision(){
				    return 0;
				}
				public String IHANDLDefault(){
				
					return "";
				
				}
				public String IHANDLComment(){
				
				    return "";
				
				}
				public String IHANDLPattern(){
				
					return "";
				
				}
				public String IHANDLOriginalDbColumnName(){
				
					return "IHANDL";
				
				}

				
			    public String IATRB1;

				public String getIATRB1 () {
					return this.IATRB1;
				}

				public Boolean IATRB1IsNullable(){
				    return false;
				}
				public Boolean IATRB1IsKey(){
				    return false;
				}
				public Integer IATRB1Length(){
				    return 2;
				}
				public Integer IATRB1Precision(){
				    return 0;
				}
				public String IATRB1Default(){
				
					return "";
				
				}
				public String IATRB1Comment(){
				
				    return "";
				
				}
				public String IATRB1Pattern(){
				
					return "";
				
				}
				public String IATRB1OriginalDbColumnName(){
				
					return "IATRB1";
				
				}

				
			    public String IATRB2;

				public String getIATRB2 () {
					return this.IATRB2;
				}

				public Boolean IATRB2IsNullable(){
				    return false;
				}
				public Boolean IATRB2IsKey(){
				    return false;
				}
				public Integer IATRB2Length(){
				    return 2;
				}
				public Integer IATRB2Precision(){
				    return 0;
				}
				public String IATRB2Default(){
				
					return "";
				
				}
				public String IATRB2Comment(){
				
				    return "";
				
				}
				public String IATRB2Pattern(){
				
					return "";
				
				}
				public String IATRB2OriginalDbColumnName(){
				
					return "IATRB2";
				
				}

				
			    public String IATRB3;

				public String getIATRB3 () {
					return this.IATRB3;
				}

				public Boolean IATRB3IsNullable(){
				    return false;
				}
				public Boolean IATRB3IsKey(){
				    return false;
				}
				public Integer IATRB3Length(){
				    return 2;
				}
				public Integer IATRB3Precision(){
				    return 0;
				}
				public String IATRB3Default(){
				
					return "";
				
				}
				public String IATRB3Comment(){
				
				    return "";
				
				}
				public String IATRB3Pattern(){
				
					return "";
				
				}
				public String IATRB3OriginalDbColumnName(){
				
					return "IATRB3";
				
				}

				
			    public String IATRB4;

				public String getIATRB4 () {
					return this.IATRB4;
				}

				public Boolean IATRB4IsNullable(){
				    return false;
				}
				public Boolean IATRB4IsKey(){
				    return false;
				}
				public Integer IATRB4Length(){
				    return 2;
				}
				public Integer IATRB4Precision(){
				    return 0;
				}
				public String IATRB4Default(){
				
					return "";
				
				}
				public String IATRB4Comment(){
				
				    return "";
				
				}
				public String IATRB4Pattern(){
				
					return "";
				
				}
				public String IATRB4OriginalDbColumnName(){
				
					return "IATRB4";
				
				}

				
			    public String IATRB5;

				public String getIATRB5 () {
					return this.IATRB5;
				}

				public Boolean IATRB5IsNullable(){
				    return false;
				}
				public Boolean IATRB5IsKey(){
				    return false;
				}
				public Integer IATRB5Length(){
				    return 2;
				}
				public Integer IATRB5Precision(){
				    return 0;
				}
				public String IATRB5Default(){
				
					return "";
				
				}
				public String IATRB5Comment(){
				
				    return "";
				
				}
				public String IATRB5Pattern(){
				
					return "";
				
				}
				public String IATRB5OriginalDbColumnName(){
				
					return "IATRB5";
				
				}

				
			    public String IPRCCH;

				public String getIPRCCH () {
					return this.IPRCCH;
				}

				public Boolean IPRCCHIsNullable(){
				    return false;
				}
				public Boolean IPRCCHIsKey(){
				    return false;
				}
				public Integer IPRCCHLength(){
				    return 1;
				}
				public Integer IPRCCHPrecision(){
				    return 0;
				}
				public String IPRCCHDefault(){
				
					return "";
				
				}
				public String IPRCCHComment(){
				
				    return "";
				
				}
				public String IPRCCHPattern(){
				
					return "";
				
				}
				public String IPRCCHOriginalDbColumnName(){
				
					return "IPRCCH";
				
				}

				
			    public String IPRCZN;

				public String getIPRCZN () {
					return this.IPRCZN;
				}

				public Boolean IPRCZNIsNullable(){
				    return false;
				}
				public Boolean IPRCZNIsKey(){
				    return false;
				}
				public Integer IPRCZNLength(){
				    return 1;
				}
				public Integer IPRCZNPrecision(){
				    return 0;
				}
				public String IPRCZNDefault(){
				
					return "";
				
				}
				public String IPRCZNComment(){
				
				    return "";
				
				}
				public String IPRCZNPattern(){
				
					return "";
				
				}
				public String IPRCZNOriginalDbColumnName(){
				
					return "IPRCZN";
				
				}

				
			    public String IPRCST;

				public String getIPRCST () {
					return this.IPRCST;
				}

				public Boolean IPRCSTIsNullable(){
				    return false;
				}
				public Boolean IPRCSTIsKey(){
				    return false;
				}
				public Integer IPRCSTLength(){
				    return 1;
				}
				public Integer IPRCSTPrecision(){
				    return 0;
				}
				public String IPRCSTDefault(){
				
					return "";
				
				}
				public String IPRCSTComment(){
				
				    return "";
				
				}
				public String IPRCSTPattern(){
				
					return "";
				
				}
				public String IPRCSTOriginalDbColumnName(){
				
					return "IPRCST";
				
				}

				
			    public float IASNUM;

				public float getIASNUM () {
					return this.IASNUM;
				}

				public Boolean IASNUMIsNullable(){
				    return false;
				}
				public Boolean IASNUMIsKey(){
				    return false;
				}
				public Integer IASNUMLength(){
				    return 6;
				}
				public Integer IASNUMPrecision(){
				    return 0;
				}
				public String IASNUMDefault(){
				
					return "";
				
				}
				public String IASNUMComment(){
				
				    return "";
				
				}
				public String IASNUMPattern(){
				
					return "";
				
				}
				public String IASNUMOriginalDbColumnName(){
				
					return "IASNUM";
				
				}

				
			    public String ICORGP;

				public String getICORGP () {
					return this.ICORGP;
				}

				public Boolean ICORGPIsNullable(){
				    return false;
				}
				public Boolean ICORGPIsKey(){
				    return false;
				}
				public Integer ICORGPLength(){
				    return 5;
				}
				public Integer ICORGPPrecision(){
				    return 0;
				}
				public String ICORGPDefault(){
				
					return "";
				
				}
				public String ICORGPComment(){
				
				    return "";
				
				}
				public String ICORGPPattern(){
				
					return "";
				
				}
				public String ICORGPOriginalDbColumnName(){
				
					return "ICORGP";
				
				}

				
			    public BigDecimal ILEAD;

				public BigDecimal getILEAD () {
					return this.ILEAD;
				}

				public Boolean ILEADIsNullable(){
				    return false;
				}
				public Boolean ILEADIsKey(){
				    return false;
				}
				public Integer ILEADLength(){
				    return 3;
				}
				public Integer ILEADPrecision(){
				    return 0;
				}
				public String ILEADDefault(){
				
					return "";
				
				}
				public String ILEADComment(){
				
				    return "";
				
				}
				public String ILEADPattern(){
				
					return "";
				
				}
				public String ILEADOriginalDbColumnName(){
				
					return "ILEAD";
				
				}

				
			    public String IHZCOD;

				public String getIHZCOD () {
					return this.IHZCOD;
				}

				public Boolean IHZCODIsNullable(){
				    return false;
				}
				public Boolean IHZCODIsKey(){
				    return false;
				}
				public Integer IHZCODLength(){
				    return 4;
				}
				public Integer IHZCODPrecision(){
				    return 0;
				}
				public String IHZCODDefault(){
				
					return "";
				
				}
				public String IHZCODComment(){
				
				    return "";
				
				}
				public String IHZCODPattern(){
				
					return "";
				
				}
				public String IHZCODOriginalDbColumnName(){
				
					return "IHZCOD";
				
				}

				
			    public String IFRACT;

				public String getIFRACT () {
					return this.IFRACT;
				}

				public Boolean IFRACTIsNullable(){
				    return false;
				}
				public Boolean IFRACTIsKey(){
				    return false;
				}
				public Integer IFRACTLength(){
				    return 1;
				}
				public Integer IFRACTPrecision(){
				    return 0;
				}
				public String IFRACTDefault(){
				
					return "";
				
				}
				public String IFRACTComment(){
				
				    return "";
				
				}
				public String IFRACTPattern(){
				
					return "";
				
				}
				public String IFRACTOriginalDbColumnName(){
				
					return "IFRACT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			        this.ICHECK = dis.readFloat();
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			        this.ASNUM = dis.readFloat();
					
					this.IVNDPN = readString(dis);
					
			        this.IMFGR = dis.readFloat();
					
					this.IMFGNO = readString(dis);
					
			        this.IDEPT = dis.readFloat();
					
			        this.ISDEPT = dis.readFloat();
					
			        this.ICLAS = dis.readFloat();
					
			        this.ISCLAS = dis.readFloat();
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			        this.ISCOLR = dis.readFloat();
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			        this.SHPNUM = dis.readFloat();
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			        this.IIGNUM = dis.readFloat();
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			        this.IPLAN = dis.readFloat();
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			        this.IASNUM = dis.readFloat();
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			        this.ICHECK = dis.readFloat();
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			        this.ASNUM = dis.readFloat();
					
					this.IVNDPN = readString(dis);
					
			        this.IMFGR = dis.readFloat();
					
					this.IMFGNO = readString(dis);
					
			        this.IDEPT = dis.readFloat();
					
			        this.ISDEPT = dis.readFloat();
					
			        this.ICLAS = dis.readFloat();
					
			        this.ISCLAS = dis.readFloat();
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			        this.ISCOLR = dis.readFloat();
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			        this.SHPNUM = dis.readFloat();
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			        this.IIGNUM = dis.readFloat();
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			        this.IPLAN = dis.readFloat();
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			        this.IASNUM = dis.readFloat();
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// float
				
		            	dos.writeFloat(this.ICHECK);
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// float
				
		            	dos.writeFloat(this.ASNUM);
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// float
				
		            	dos.writeFloat(this.IMFGR);
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// float
				
		            	dos.writeFloat(this.IDEPT);
					
					// float
				
		            	dos.writeFloat(this.ISDEPT);
					
					// float
				
		            	dos.writeFloat(this.ICLAS);
					
					// float
				
		            	dos.writeFloat(this.ISCLAS);
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// float
				
		            	dos.writeFloat(this.ISCOLR);
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// float
				
		            	dos.writeFloat(this.SHPNUM);
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// float
				
		            	dos.writeFloat(this.IIGNUM);
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// float
				
		            	dos.writeFloat(this.IPLAN);
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// float
				
		            	dos.writeFloat(this.IASNUM);
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// float
				
		            	dos.writeFloat(this.ICHECK);
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// float
				
		            	dos.writeFloat(this.ASNUM);
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// float
				
		            	dos.writeFloat(this.IMFGR);
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// float
				
		            	dos.writeFloat(this.IDEPT);
					
					// float
				
		            	dos.writeFloat(this.ISDEPT);
					
					// float
				
		            	dos.writeFloat(this.ICLAS);
					
					// float
				
		            	dos.writeFloat(this.ISCLAS);
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// float
				
		            	dos.writeFloat(this.ISCOLR);
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// float
				
		            	dos.writeFloat(this.SHPNUM);
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// float
				
		            	dos.writeFloat(this.IIGNUM);
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// float
				
		            	dos.writeFloat(this.IPLAN);
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// float
				
		            	dos.writeFloat(this.IASNUM);
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",ICHECK="+String.valueOf(ICHECK));
		sb.append(",IDESCR="+IDESCR);
		sb.append(",IDSCCD="+IDSCCD);
		sb.append(",ISORT="+ISORT);
		sb.append(",ISTYLN="+ISTYLN);
		sb.append(",ASNUM="+String.valueOf(ASNUM));
		sb.append(",IVNDPN="+IVNDPN);
		sb.append(",IMFGR="+String.valueOf(IMFGR));
		sb.append(",IMFGNO="+IMFGNO);
		sb.append(",IDEPT="+String.valueOf(IDEPT));
		sb.append(",ISDEPT="+String.valueOf(ISDEPT));
		sb.append(",ICLAS="+String.valueOf(ICLAS));
		sb.append(",ISCLAS="+String.valueOf(ISCLAS));
		sb.append(",BYRNUM="+BYRNUM);
		sb.append(",IASPAC="+String.valueOf(IASPAC));
		sb.append(",IADVYN="+IADVYN);
		sb.append(",IBUYCD="+IBUYCD);
		sb.append(",ISET="+ISET);
		sb.append(",IWARNT="+IWARNT);
		sb.append(",IPRMPT="+IPRMPT);
		sb.append(",IPRVNT="+IPRVNT);
		sb.append(",ITKTTR="+ITKTTR);
		sb.append(",ITKTTA="+ITKTTA);
		sb.append(",ITKTN="+String.valueOf(ITKTN));
		sb.append(",ILBLTR="+ILBLTR);
		sb.append(",ILBLTA="+ILBLTA);
		sb.append(",IFINLN="+IFINLN);
		sb.append(",IPROFL="+IPROFL);
		sb.append(",IMODUL="+IMODUL);
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ISCOLR="+String.valueOf(ISCOLR));
		sb.append(",ISSIZE="+ISSIZE);
		sb.append(",IHAZCD="+IHAZCD);
		sb.append(",MCHNUM="+MCHNUM);
		sb.append(",ISUBST="+String.valueOf(ISUBST));
		sb.append(",ICORE="+String.valueOf(ICORE));
		sb.append(",IREPL="+String.valueOf(IREPL));
		sb.append(",ISLUM="+ISLUM);
		sb.append(",IUMCV2="+String.valueOf(IUMCV2));
		sb.append(",IBYUM="+IBYUM);
		sb.append(",IMINPK="+String.valueOf(IMINPK));
		sb.append(",ISTDPK="+String.valueOf(ISTDPK));
		sb.append(",IHLDOR="+IHLDOR);
		sb.append(",IMOQTY="+String.valueOf(IMOQTY));
		sb.append(",IMNSTK="+String.valueOf(IMNSTK));
		sb.append(",IMXSTK="+String.valueOf(IMXSTK));
		sb.append(",IMDSTK="+String.valueOf(IMDSTK));
		sb.append(",IDSPLY="+String.valueOf(IDSPLY));
		sb.append(",IOMULT="+String.valueOf(IOMULT));
		sb.append(",IRPLCD="+IRPLCD);
		sb.append(",IMFPRC="+String.valueOf(IMFPRC));
		sb.append(",IWGHT="+String.valueOf(IWGHT));
		sb.append(",ICUBE="+String.valueOf(ICUBE));
		sb.append(",IDLGTH="+String.valueOf(IDLGTH));
		sb.append(",IDWDTH="+String.valueOf(IDWDTH));
		sb.append(",IDHGHT="+String.valueOf(IDHGHT));
		sb.append(",IMDATE="+String.valueOf(IMDATE));
		sb.append(",IMCENT="+String.valueOf(IMCENT));
		sb.append(",IVPLTI="+String.valueOf(IVPLTI));
		sb.append(",IVPLHI="+String.valueOf(IVPLHI));
		sb.append(",SHPNUM="+String.valueOf(SHPNUM));
		sb.append(",IDISTM="+IDISTM);
		sb.append(",IHLDWO="+IHLDWO);
		sb.append(",IIGNUM="+String.valueOf(IIGNUM));
		sb.append(",ISDIM="+ISDIM);
		sb.append(",IVATCD="+IVATCD);
		sb.append(",IPLAN="+String.valueOf(IPLAN));
		sb.append(",IVLRK1="+IVLRK1);
		sb.append(",IVLRK2="+IVLRK2);
		sb.append(",IVLRK3="+IVLRK3);
		sb.append(",IVLRK4="+IVLRK4);
		sb.append(",IRPLCN="+String.valueOf(IRPLCN));
		sb.append(",IRPLDT="+String.valueOf(IRPLDT));
		sb.append(",ISEASN="+ISEASN);
		sb.append(",IDEADC="+String.valueOf(IDEADC));
		sb.append(",IDEADD="+String.valueOf(IDEADD));
		sb.append(",INLRTL="+String.valueOf(INLRTL));
		sb.append(",IHANDL="+IHANDL);
		sb.append(",IATRB1="+IATRB1);
		sb.append(",IATRB2="+IATRB2);
		sb.append(",IATRB3="+IATRB3);
		sb.append(",IATRB4="+IATRB4);
		sb.append(",IATRB5="+IATRB5);
		sb.append(",IPRCCH="+IPRCCH);
		sb.append(",IPRCZN="+IPRCZN);
		sb.append(",IPRCST="+IPRCST);
		sb.append(",IASNUM="+String.valueOf(IASNUM));
		sb.append(",ICORGP="+ICORGP);
		sb.append(",ILEAD="+String.valueOf(ILEAD));
		sb.append(",IHZCOD="+IHZCOD);
		sb.append(",IFRACT="+IFRACT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				sb.append(ICHECK);
        			
        			sb.append("|");
        		
        				if(IDESCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDESCR);
            			}
            		
        			sb.append("|");
        		
        				if(IDSCCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSCCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISORT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISORT);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYLN);
            			}
            		
        			sb.append("|");
        		
        				sb.append(ASNUM);
        			
        			sb.append("|");
        		
        				if(IVNDPN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVNDPN);
            			}
            		
        			sb.append("|");
        		
        				sb.append(IMFGR);
        			
        			sb.append("|");
        		
        				if(IMFGNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFGNO);
            			}
            		
        			sb.append("|");
        		
        				sb.append(IDEPT);
        			
        			sb.append("|");
        		
        				sb.append(ISDEPT);
        			
        			sb.append("|");
        		
        				sb.append(ICLAS);
        			
        			sb.append("|");
        		
        				sb.append(ISCLAS);
        			
        			sb.append("|");
        		
        				if(BYRNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BYRNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IASPAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IASPAC);
            			}
            		
        			sb.append("|");
        		
        				if(IADVYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IADVYN);
            			}
            		
        			sb.append("|");
        		
        				if(IBUYCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBUYCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISET);
            			}
            		
        			sb.append("|");
        		
        				if(IWARNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWARNT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRMPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRMPT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRVNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRVNT);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTR);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTA);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTN);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTR);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTA);
            			}
            		
        			sb.append("|");
        		
        				if(IFINLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFINLN);
            			}
            		
        			sb.append("|");
        		
        				if(IPROFL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPROFL);
            			}
            		
        			sb.append("|");
        		
        				if(IMODUL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMODUL);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				sb.append(ISCOLR);
        			
        			sb.append("|");
        		
        				if(ISSIZE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISSIZE);
            			}
            		
        			sb.append("|");
        		
        				if(IHAZCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHAZCD);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ISUBST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISUBST);
            			}
            		
        			sb.append("|");
        		
        				if(ICORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORE);
            			}
            		
        			sb.append("|");
        		
        				if(IREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IREPL);
            			}
            		
        			sb.append("|");
        		
        				if(ISLUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISLUM);
            			}
            		
        			sb.append("|");
        		
        				if(IUMCV2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IUMCV2);
            			}
            		
        			sb.append("|");
        		
        				if(IBYUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBYUM);
            			}
            		
        			sb.append("|");
        		
        				if(IMINPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMINPK);
            			}
            		
        			sb.append("|");
        		
        				if(ISTDPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTDPK);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDOR);
            			}
            		
        			sb.append("|");
        		
        				if(IMOQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMOQTY);
            			}
            		
        			sb.append("|");
        		
        				if(IMNSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMNSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMXSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMXSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMDSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IDSPLY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSPLY);
            			}
            		
        			sb.append("|");
        		
        				if(IOMULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IOMULT);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCD);
            			}
            		
        			sb.append("|");
        		
        				if(IMFPRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFPRC);
            			}
            		
        			sb.append("|");
        		
        				if(IWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(ICUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICUBE);
            			}
            		
        			sb.append("|");
        		
        				if(IDLGTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDLGTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDWDTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDWDTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDHGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDHGHT);
            			}
            		
        			sb.append("|");
        		
        				if(IMDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDATE);
            			}
            		
        			sb.append("|");
        		
        				if(IMCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMCENT);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLTI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLTI);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLHI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLHI);
            			}
            		
        			sb.append("|");
        		
        				sb.append(SHPNUM);
        			
        			sb.append("|");
        		
        				if(IDISTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDISTM);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDWO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDWO);
            			}
            		
        			sb.append("|");
        		
        				sb.append(IIGNUM);
        			
        			sb.append("|");
        		
        				if(ISDIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISDIM);
            			}
            		
        			sb.append("|");
        		
        				if(IVATCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVATCD);
            			}
            		
        			sb.append("|");
        		
        				sb.append(IPLAN);
        			
        			sb.append("|");
        		
        				if(IVLRK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK1);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK2);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK3);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK4);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCN);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLDT);
            			}
            		
        			sb.append("|");
        		
        				if(ISEASN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISEASN);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADC);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADD);
            			}
            		
        			sb.append("|");
        		
        				if(INLRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INLRTL);
            			}
            		
        			sb.append("|");
        		
        				if(IHANDL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHANDL);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB1);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB2);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB3);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB4);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB5);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCCH);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCZN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCZN);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCST);
            			}
            		
        			sb.append("|");
        		
        				sb.append(IASNUM);
        			
        			sb.append("|");
        		
        				if(ICORGP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORGP);
            			}
            		
        			sb.append("|");
        		
        				if(ILEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IHZCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHZCOD);
            			}
            		
        			sb.append("|");
        		
        				if(IFRACT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFRACT);
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
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row5Struct row5 = new row5Struct();




	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row5");
			
		int tos_count_tFileOutputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_1.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVMST.csv\"");
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
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
                class FileOutputDelimitedUtil_tFileOutputDelimited_1{
                                    public void putHeaderValue_0(java.io.Writer outtFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception{
                                    outtFileOutputDelimited_1.write("INUMBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ICHECK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDESCR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDSCCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISORT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISTYLN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ASNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVNDPN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMFGR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMFGNO");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDEPT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISDEPT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ICLAS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISCLAS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("BYRNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IASPAC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IADVYN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBUYCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISET");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IWARNT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPRMPT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPRVNT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITKTTR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITKTTA");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITKTN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ILBLTR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ILBLTA");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IFINLN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPROFL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMODUL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISTYPE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISCOLR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISSIZE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IHAZCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MCHNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISUBST");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ICORE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IREPL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISLUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IUMCV2");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBYUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMINPK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISTDPK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IHLDOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMOQTY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMNSTK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMXSTK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMDSTK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDSPLY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IOMULT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IRPLCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMFPRC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IWGHT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ICUBE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDLGTH");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDWDTH");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDHGHT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMDATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IMCENT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVPLTI");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVPLHI");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SHPNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDISTM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IHLDWO");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IIGNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISDIM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVATCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPLAN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVLRK1");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVLRK2");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVLRK3");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IVLRK4");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IRPLCN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IRPLDT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ISEASN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDEADC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IDEADD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("INLRTL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IHANDL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IATRB1");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IATRB2");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IATRB3");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IATRB4");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IATRB5");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPRCCH");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPRCZN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IPRCST");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IASNUM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ICORGP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ILEAD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    }
                                    public void putHeaderValue_1(java.io.Writer outtFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception{
                                    outtFileOutputDelimited_1.write("IHZCOD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IFRACT");
                                }
                                public void putValue_0(final row5Struct row5,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row5.INUMBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ICHECK
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDESCR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDESCR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDSCCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDSCCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISORT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISORT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISTYLN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISTYLN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ASNUM
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVNDPN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVNDPN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMFGR
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMFGNO != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMFGNO
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDEPT
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISDEPT
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ICLAS
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISCLAS
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.BYRNUM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.BYRNUM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IASPAC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IASPAC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IADVYN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IADVYN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBUYCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBUYCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISET != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISET
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IWARNT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IWARNT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPRMPT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPRMPT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPRVNT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPRVNT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ITKTTR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ITKTTR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ITKTTA != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ITKTTA
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ITKTN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ITKTN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ILBLTR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ILBLTR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ILBLTA != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ILBLTA
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IFINLN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IFINLN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPROFL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPROFL
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMODUL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMODUL
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISTYPE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISTYPE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISCOLR
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISSIZE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISSIZE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IHAZCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IHAZCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.MCHNUM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.MCHNUM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISUBST != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISUBST.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ICORE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ICORE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IREPL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IREPL.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISLUM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISLUM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IUMCV2 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IUMCV2.setScale(5, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBYUM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBYUM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMINPK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMINPK.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISTDPK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISTDPK.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IHLDOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IHLDOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMOQTY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMOQTY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMNSTK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMNSTK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMXSTK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMXSTK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMDSTK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMDSTK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDSPLY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDSPLY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IOMULT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IOMULT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IRPLCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IRPLCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMFPRC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMFPRC.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IWGHT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IWGHT.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ICUBE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ICUBE.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDLGTH != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDLGTH.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDWDTH != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDWDTH.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDHGHT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDHGHT.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMDATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMDATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IMCENT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IMCENT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVPLTI != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVPLTI.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVPLHI != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVPLHI.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.SHPNUM
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDISTM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDISTM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IHLDWO != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IHLDWO
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.IIGNUM
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISDIM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISDIM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVATCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVATCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPLAN
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVLRK1 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVLRK1
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVLRK2 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVLRK2
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVLRK3 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVLRK3
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IVLRK4 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IVLRK4
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IRPLCN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IRPLCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IRPLDT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IRPLDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISEASN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISEASN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDEADC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDEADC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IDEADD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IDEADD.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.INLRTL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.INLRTL.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IHANDL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IHANDL
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IATRB1 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IATRB1
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IATRB2 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IATRB2
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IATRB3 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IATRB3
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IATRB4 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IATRB4
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IATRB5 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IATRB5
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPRCCH != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPRCCH
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPRCZN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPRCZN
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IPRCST != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IPRCST
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                sb_tFileOutputDelimited_1.append(
                                        row5.IASNUM
                                );
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ICORGP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ICORGP
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ILEAD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ILEAD.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                }
                                public void putValue_1(final row5Struct row5,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row5.IHZCOD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IHZCOD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IFRACT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IFRACT
                                );
                                }
                            }
                }
                FileOutputDelimitedUtil_tFileOutputDelimited_1 fileOutputDelimitedUtil_tFileOutputDelimited_1=new FileOutputDelimitedUtil_tFileOutputDelimited_1();
    fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/INVMST.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */"|"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                                log.info("tFileOutputDelimited_1 - Creating directory '" + dir_tFileOutputDelimited_1.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_1.mkdirs();
                                log.info("tFileOutputDelimited_1 - The directory '"+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        String zipName_tFileOutputDelimited_1 = fullName_tFileOutputDelimited_1 + ".zip";
                        java.io.File file_tFileOutputDelimited_1 = new java.io.File(zipName_tFileOutputDelimited_1);
                        //routines.system.Row
                        java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_1= null;
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        if(file_tFileOutputDelimited_1.exists()) {
                            file_tFileOutputDelimited_1.delete();
                        }
                        zipOut_tFileOutputDelimited_1= new java.util.zip.ZipOutputStream(
                                new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_1)));
                        zipOut_tFileOutputDelimited_1.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_1.getName()));
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_1,"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
                                    if(file_tFileOutputDelimited_1.length()==0){
                                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putHeaderValue_0(outtFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putHeaderValue_1(outtFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
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
		
	
	currentComponent="tDBInput_1";
	
	
		int tos_count_tDBInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_1{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.INVMST\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICHECK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDESCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDSCCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISORT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYLN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ASNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVNDPN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFGR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFGNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BYRNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IASPAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IADVYN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBUYCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWARNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRMPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRVNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTTA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILBLTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILBLTA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IFINLN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPROFL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMODUL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCOLR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISSIZE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHAZCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISUBST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IREPL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISLUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IUMCV2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBYUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMINPK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTDPK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHLDOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMOQTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMNSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMXSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMDSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDSPLY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IOMULT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFPRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICUBE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDLGTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDWDTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDHGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMDATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMCENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVPLTI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVPLHI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHPNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDISTM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHLDWO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IIGNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDIM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVATCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPLAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISEASN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEADC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEADD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INLRTL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHANDL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCCH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCZN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IASNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICORGP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHZCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IFRACT")+"}]");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tAS400Input");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
				
				if(conn_tDBInput_1 != null) {
					if(conn_tDBInput_1.getMetaData() != null) {
						
							log.debug("tDBInput_1 - Uses an existing connection with username '" + conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "select * from MM4R5LIB.INVMST";
		    
	    		log.debug("tDBInput_1 - Executing the query: '" + dbquery_tDBInput_1 + "'.");
			

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    	log.debug("tDBInput_1 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row5.INUMBR = null;
							} else {
		                          
            row5.INUMBR = rs_tDBInput_1.getBigDecimal(1);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row5.ICHECK = 0;
							} else {
		                          
            row5.ICHECK = rs_tDBInput_1.getFloat(2);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row5.IDESCR = null;
							} else {
	                         		
        	row5.IDESCR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row5.IDSCCD = null;
							} else {
	                         		
        	row5.IDSCCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row5.ISORT = null;
							} else {
	                         		
        	row5.ISORT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row5.ISTYLN = null;
							} else {
	                         		
        	row5.ISTYLN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row5.ASNUM = 0;
							} else {
		                          
            row5.ASNUM = rs_tDBInput_1.getFloat(7);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row5.IVNDPN = null;
							} else {
	                         		
        	row5.IVNDPN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row5.IMFGR = 0;
							} else {
		                          
            row5.IMFGR = rs_tDBInput_1.getFloat(9);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row5.IMFGNO = null;
							} else {
	                         		
        	row5.IMFGNO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row5.IDEPT = 0;
							} else {
		                          
            row5.IDEPT = rs_tDBInput_1.getFloat(11);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row5.ISDEPT = 0;
							} else {
		                          
            row5.ISDEPT = rs_tDBInput_1.getFloat(12);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row5.ICLAS = 0;
							} else {
		                          
            row5.ICLAS = rs_tDBInput_1.getFloat(13);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row5.ISCLAS = 0;
							} else {
		                          
            row5.ISCLAS = rs_tDBInput_1.getFloat(14);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row5.BYRNUM = null;
							} else {
	                         		
        	row5.BYRNUM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row5.IASPAC = null;
							} else {
		                          
            row5.IASPAC = rs_tDBInput_1.getBigDecimal(16);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row5.IADVYN = null;
							} else {
	                         		
        	row5.IADVYN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row5.IBUYCD = null;
							} else {
	                         		
        	row5.IBUYCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row5.ISET = null;
							} else {
	                         		
        	row5.ISET = routines.system.JDBCUtil.getString(rs_tDBInput_1, 19, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row5.IWARNT = null;
							} else {
	                         		
        	row5.IWARNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 20, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row5.IPRMPT = null;
							} else {
	                         		
        	row5.IPRMPT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 21, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row5.IPRVNT = null;
							} else {
	                         		
        	row5.IPRVNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row5.ITKTTR = null;
							} else {
	                         		
        	row5.ITKTTR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row5.ITKTTA = null;
							} else {
	                         		
        	row5.ITKTTA = routines.system.JDBCUtil.getString(rs_tDBInput_1, 24, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row5.ITKTN = null;
							} else {
		                          
            row5.ITKTN = rs_tDBInput_1.getBigDecimal(25);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row5.ILBLTR = null;
							} else {
	                         		
        	row5.ILBLTR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 26, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row5.ILBLTA = null;
							} else {
	                         		
        	row5.ILBLTA = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row5.IFINLN = null;
							} else {
	                         		
        	row5.IFINLN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row5.IPROFL = null;
							} else {
	                         		
        	row5.IPROFL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row5.IMODUL = null;
							} else {
	                         		
        	row5.IMODUL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 30, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row5.ISTYPE = null;
							} else {
	                         		
        	row5.ISTYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 31, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row5.ISCOLR = 0;
							} else {
		                          
            row5.ISCOLR = rs_tDBInput_1.getFloat(32);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 33) {
								row5.ISSIZE = null;
							} else {
	                         		
        	row5.ISSIZE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 33, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 34) {
								row5.IHAZCD = null;
							} else {
	                         		
        	row5.IHAZCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 34, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 35) {
								row5.MCHNUM = null;
							} else {
	                         		
        	row5.MCHNUM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 35, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 36) {
								row5.ISUBST = null;
							} else {
		                          
            row5.ISUBST = rs_tDBInput_1.getBigDecimal(36);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 37) {
								row5.ICORE = null;
							} else {
		                          
            row5.ICORE = rs_tDBInput_1.getBigDecimal(37);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 38) {
								row5.IREPL = null;
							} else {
		                          
            row5.IREPL = rs_tDBInput_1.getBigDecimal(38);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 39) {
								row5.ISLUM = null;
							} else {
	                         		
        	row5.ISLUM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 39, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 40) {
								row5.IUMCV2 = null;
							} else {
		                          
            row5.IUMCV2 = rs_tDBInput_1.getBigDecimal(40);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 41) {
								row5.IBYUM = null;
							} else {
	                         		
        	row5.IBYUM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 41, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 42) {
								row5.IMINPK = null;
							} else {
		                          
            row5.IMINPK = rs_tDBInput_1.getBigDecimal(42);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 43) {
								row5.ISTDPK = null;
							} else {
		                          
            row5.ISTDPK = rs_tDBInput_1.getBigDecimal(43);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 44) {
								row5.IHLDOR = null;
							} else {
	                         		
        	row5.IHLDOR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 44, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 45) {
								row5.IMOQTY = null;
							} else {
		                          
            row5.IMOQTY = rs_tDBInput_1.getBigDecimal(45);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 46) {
								row5.IMNSTK = null;
							} else {
		                          
            row5.IMNSTK = rs_tDBInput_1.getBigDecimal(46);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 47) {
								row5.IMXSTK = null;
							} else {
		                          
            row5.IMXSTK = rs_tDBInput_1.getBigDecimal(47);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 48) {
								row5.IMDSTK = null;
							} else {
		                          
            row5.IMDSTK = rs_tDBInput_1.getBigDecimal(48);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 49) {
								row5.IDSPLY = null;
							} else {
		                          
            row5.IDSPLY = rs_tDBInput_1.getBigDecimal(49);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 50) {
								row5.IOMULT = null;
							} else {
		                          
            row5.IOMULT = rs_tDBInput_1.getBigDecimal(50);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 51) {
								row5.IRPLCD = null;
							} else {
	                         		
        	row5.IRPLCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 51, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 52) {
								row5.IMFPRC = null;
							} else {
		                          
            row5.IMFPRC = rs_tDBInput_1.getBigDecimal(52);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 53) {
								row5.IWGHT = null;
							} else {
		                          
            row5.IWGHT = rs_tDBInput_1.getBigDecimal(53);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 54) {
								row5.ICUBE = null;
							} else {
		                          
            row5.ICUBE = rs_tDBInput_1.getBigDecimal(54);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 55) {
								row5.IDLGTH = null;
							} else {
		                          
            row5.IDLGTH = rs_tDBInput_1.getBigDecimal(55);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 56) {
								row5.IDWDTH = null;
							} else {
		                          
            row5.IDWDTH = rs_tDBInput_1.getBigDecimal(56);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 57) {
								row5.IDHGHT = null;
							} else {
		                          
            row5.IDHGHT = rs_tDBInput_1.getBigDecimal(57);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 58) {
								row5.IMDATE = null;
							} else {
		                          
            row5.IMDATE = rs_tDBInput_1.getBigDecimal(58);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 59) {
								row5.IMCENT = null;
							} else {
		                          
            row5.IMCENT = rs_tDBInput_1.getBigDecimal(59);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 60) {
								row5.IVPLTI = null;
							} else {
		                          
            row5.IVPLTI = rs_tDBInput_1.getBigDecimal(60);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 61) {
								row5.IVPLHI = null;
							} else {
		                          
            row5.IVPLHI = rs_tDBInput_1.getBigDecimal(61);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 62) {
								row5.SHPNUM = 0;
							} else {
		                          
            row5.SHPNUM = rs_tDBInput_1.getFloat(62);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 63) {
								row5.IDISTM = null;
							} else {
	                         		
        	row5.IDISTM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 63, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 64) {
								row5.IHLDWO = null;
							} else {
	                         		
        	row5.IHLDWO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 64, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 65) {
								row5.IIGNUM = 0;
							} else {
		                          
            row5.IIGNUM = rs_tDBInput_1.getFloat(65);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 66) {
								row5.ISDIM = null;
							} else {
	                         		
        	row5.ISDIM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 66, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 67) {
								row5.IVATCD = null;
							} else {
	                         		
        	row5.IVATCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 67, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 68) {
								row5.IPLAN = 0;
							} else {
		                          
            row5.IPLAN = rs_tDBInput_1.getFloat(68);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 69) {
								row5.IVLRK1 = null;
							} else {
	                         		
        	row5.IVLRK1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 69, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 70) {
								row5.IVLRK2 = null;
							} else {
	                         		
        	row5.IVLRK2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 70, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 71) {
								row5.IVLRK3 = null;
							} else {
	                         		
        	row5.IVLRK3 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 71, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 72) {
								row5.IVLRK4 = null;
							} else {
	                         		
        	row5.IVLRK4 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 72, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 73) {
								row5.IRPLCN = null;
							} else {
		                          
            row5.IRPLCN = rs_tDBInput_1.getBigDecimal(73);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 74) {
								row5.IRPLDT = null;
							} else {
		                          
            row5.IRPLDT = rs_tDBInput_1.getBigDecimal(74);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 75) {
								row5.ISEASN = null;
							} else {
	                         		
        	row5.ISEASN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 75, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 76) {
								row5.IDEADC = null;
							} else {
		                          
            row5.IDEADC = rs_tDBInput_1.getBigDecimal(76);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 77) {
								row5.IDEADD = null;
							} else {
		                          
            row5.IDEADD = rs_tDBInput_1.getBigDecimal(77);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 78) {
								row5.INLRTL = null;
							} else {
		                          
            row5.INLRTL = rs_tDBInput_1.getBigDecimal(78);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 79) {
								row5.IHANDL = null;
							} else {
	                         		
        	row5.IHANDL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 79, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 80) {
								row5.IATRB1 = null;
							} else {
	                         		
        	row5.IATRB1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 80, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 81) {
								row5.IATRB2 = null;
							} else {
	                         		
        	row5.IATRB2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 81, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 82) {
								row5.IATRB3 = null;
							} else {
	                         		
        	row5.IATRB3 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 82, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 83) {
								row5.IATRB4 = null;
							} else {
	                         		
        	row5.IATRB4 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 83, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 84) {
								row5.IATRB5 = null;
							} else {
	                         		
        	row5.IATRB5 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 84, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 85) {
								row5.IPRCCH = null;
							} else {
	                         		
        	row5.IPRCCH = routines.system.JDBCUtil.getString(rs_tDBInput_1, 85, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 86) {
								row5.IPRCZN = null;
							} else {
	                         		
        	row5.IPRCZN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 86, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 87) {
								row5.IPRCST = null;
							} else {
	                         		
        	row5.IPRCST = routines.system.JDBCUtil.getString(rs_tDBInput_1, 87, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 88) {
								row5.IASNUM = 0;
							} else {
		                          
            row5.IASNUM = rs_tDBInput_1.getFloat(88);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 89) {
								row5.ICORGP = null;
							} else {
	                         		
        	row5.ICORGP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 89, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 90) {
								row5.ILEAD = null;
							} else {
		                          
            row5.ILEAD = rs_tDBInput_1.getBigDecimal(90);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 91) {
								row5.IHZCOD = null;
							} else {
	                         		
        	row5.IHZCOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 91, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 92) {
								row5.IFRACT = null;
							} else {
	                         		
        	row5.IFRACT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 92, false);
		                    }
					
						log.debug("tDBInput_1 - Retrieving the record " + nb_line_tDBInput_1 + ".");
					



 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row5","tDBInput_1","tDBInput_1","tAS400Input","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row5 - " + (row5==null? "": row5.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putValue_0(row5,sb_tFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putValue_1(row5,sb_tFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");




 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
	    		log.debug("tDBInput_1 - Retrieved records count: "+nb_line_tDBInput_1 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + ("Done.") );

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row5",2,0,
			 			"tDBInput_1","tDBInput_1","tAS400Input","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tFileInputDelimited_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class INVMSTStruct implements routines.system.IPersistableRow<INVMSTStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public BigDecimal INUMBR;

				public BigDecimal getINUMBR () {
					return this.INUMBR;
				}

				public Boolean INUMBRIsNullable(){
				    return true;
				}
				public Boolean INUMBRIsKey(){
				    return false;
				}
				public Integer INUMBRLength(){
				    return null;
				}
				public Integer INUMBRPrecision(){
				    return null;
				}
				public String INUMBRDefault(){
				
					return "";
				
				}
				public String INUMBRComment(){
				
				    return "";
				
				}
				public String INUMBRPattern(){
				
					return "";
				
				}
				public String INUMBROriginalDbColumnName(){
				
					return "INUMBR";
				
				}

				
			    public Double ICHECK;

				public Double getICHECK () {
					return this.ICHECK;
				}

				public Boolean ICHECKIsNullable(){
				    return true;
				}
				public Boolean ICHECKIsKey(){
				    return false;
				}
				public Integer ICHECKLength(){
				    return null;
				}
				public Integer ICHECKPrecision(){
				    return null;
				}
				public String ICHECKDefault(){
				
					return "";
				
				}
				public String ICHECKComment(){
				
				    return "";
				
				}
				public String ICHECKPattern(){
				
					return "";
				
				}
				public String ICHECKOriginalDbColumnName(){
				
					return "ICHECK";
				
				}

				
			    public String IDESCR;

				public String getIDESCR () {
					return this.IDESCR;
				}

				public Boolean IDESCRIsNullable(){
				    return true;
				}
				public Boolean IDESCRIsKey(){
				    return false;
				}
				public Integer IDESCRLength(){
				    return null;
				}
				public Integer IDESCRPrecision(){
				    return null;
				}
				public String IDESCRDefault(){
				
					return null;
				
				}
				public String IDESCRComment(){
				
				    return "";
				
				}
				public String IDESCRPattern(){
				
					return "";
				
				}
				public String IDESCROriginalDbColumnName(){
				
					return "IDESCR";
				
				}

				
			    public String IDSCCD;

				public String getIDSCCD () {
					return this.IDSCCD;
				}

				public Boolean IDSCCDIsNullable(){
				    return true;
				}
				public Boolean IDSCCDIsKey(){
				    return false;
				}
				public Integer IDSCCDLength(){
				    return null;
				}
				public Integer IDSCCDPrecision(){
				    return null;
				}
				public String IDSCCDDefault(){
				
					return null;
				
				}
				public String IDSCCDComment(){
				
				    return "";
				
				}
				public String IDSCCDPattern(){
				
					return "";
				
				}
				public String IDSCCDOriginalDbColumnName(){
				
					return "IDSCCD";
				
				}

				
			    public String ISORT;

				public String getISORT () {
					return this.ISORT;
				}

				public Boolean ISORTIsNullable(){
				    return true;
				}
				public Boolean ISORTIsKey(){
				    return false;
				}
				public Integer ISORTLength(){
				    return null;
				}
				public Integer ISORTPrecision(){
				    return null;
				}
				public String ISORTDefault(){
				
					return null;
				
				}
				public String ISORTComment(){
				
				    return "";
				
				}
				public String ISORTPattern(){
				
					return "";
				
				}
				public String ISORTOriginalDbColumnName(){
				
					return "ISORT";
				
				}

				
			    public String ISTYLN;

				public String getISTYLN () {
					return this.ISTYLN;
				}

				public Boolean ISTYLNIsNullable(){
				    return true;
				}
				public Boolean ISTYLNIsKey(){
				    return false;
				}
				public Integer ISTYLNLength(){
				    return null;
				}
				public Integer ISTYLNPrecision(){
				    return null;
				}
				public String ISTYLNDefault(){
				
					return null;
				
				}
				public String ISTYLNComment(){
				
				    return "";
				
				}
				public String ISTYLNPattern(){
				
					return "";
				
				}
				public String ISTYLNOriginalDbColumnName(){
				
					return "ISTYLN";
				
				}

				
			    public Double ASNUM;

				public Double getASNUM () {
					return this.ASNUM;
				}

				public Boolean ASNUMIsNullable(){
				    return true;
				}
				public Boolean ASNUMIsKey(){
				    return false;
				}
				public Integer ASNUMLength(){
				    return null;
				}
				public Integer ASNUMPrecision(){
				    return null;
				}
				public String ASNUMDefault(){
				
					return "";
				
				}
				public String ASNUMComment(){
				
				    return "";
				
				}
				public String ASNUMPattern(){
				
					return "";
				
				}
				public String ASNUMOriginalDbColumnName(){
				
					return "ASNUM";
				
				}

				
			    public String IVNDPN;

				public String getIVNDPN () {
					return this.IVNDPN;
				}

				public Boolean IVNDPNIsNullable(){
				    return true;
				}
				public Boolean IVNDPNIsKey(){
				    return false;
				}
				public Integer IVNDPNLength(){
				    return null;
				}
				public Integer IVNDPNPrecision(){
				    return null;
				}
				public String IVNDPNDefault(){
				
					return null;
				
				}
				public String IVNDPNComment(){
				
				    return "";
				
				}
				public String IVNDPNPattern(){
				
					return "";
				
				}
				public String IVNDPNOriginalDbColumnName(){
				
					return "IVNDPN";
				
				}

				
			    public Double IMFGR;

				public Double getIMFGR () {
					return this.IMFGR;
				}

				public Boolean IMFGRIsNullable(){
				    return true;
				}
				public Boolean IMFGRIsKey(){
				    return false;
				}
				public Integer IMFGRLength(){
				    return null;
				}
				public Integer IMFGRPrecision(){
				    return null;
				}
				public String IMFGRDefault(){
				
					return "";
				
				}
				public String IMFGRComment(){
				
				    return "";
				
				}
				public String IMFGRPattern(){
				
					return "";
				
				}
				public String IMFGROriginalDbColumnName(){
				
					return "IMFGR";
				
				}

				
			    public String IMFGNO;

				public String getIMFGNO () {
					return this.IMFGNO;
				}

				public Boolean IMFGNOIsNullable(){
				    return true;
				}
				public Boolean IMFGNOIsKey(){
				    return false;
				}
				public Integer IMFGNOLength(){
				    return null;
				}
				public Integer IMFGNOPrecision(){
				    return null;
				}
				public String IMFGNODefault(){
				
					return null;
				
				}
				public String IMFGNOComment(){
				
				    return "";
				
				}
				public String IMFGNOPattern(){
				
					return "";
				
				}
				public String IMFGNOOriginalDbColumnName(){
				
					return "IMFGNO";
				
				}

				
			    public Double IDEPT;

				public Double getIDEPT () {
					return this.IDEPT;
				}

				public Boolean IDEPTIsNullable(){
				    return true;
				}
				public Boolean IDEPTIsKey(){
				    return false;
				}
				public Integer IDEPTLength(){
				    return null;
				}
				public Integer IDEPTPrecision(){
				    return null;
				}
				public String IDEPTDefault(){
				
					return "";
				
				}
				public String IDEPTComment(){
				
				    return "";
				
				}
				public String IDEPTPattern(){
				
					return "";
				
				}
				public String IDEPTOriginalDbColumnName(){
				
					return "IDEPT";
				
				}

				
			    public Double ISDEPT;

				public Double getISDEPT () {
					return this.ISDEPT;
				}

				public Boolean ISDEPTIsNullable(){
				    return true;
				}
				public Boolean ISDEPTIsKey(){
				    return false;
				}
				public Integer ISDEPTLength(){
				    return null;
				}
				public Integer ISDEPTPrecision(){
				    return null;
				}
				public String ISDEPTDefault(){
				
					return "";
				
				}
				public String ISDEPTComment(){
				
				    return "";
				
				}
				public String ISDEPTPattern(){
				
					return "";
				
				}
				public String ISDEPTOriginalDbColumnName(){
				
					return "ISDEPT";
				
				}

				
			    public Double ICLAS;

				public Double getICLAS () {
					return this.ICLAS;
				}

				public Boolean ICLASIsNullable(){
				    return true;
				}
				public Boolean ICLASIsKey(){
				    return false;
				}
				public Integer ICLASLength(){
				    return null;
				}
				public Integer ICLASPrecision(){
				    return null;
				}
				public String ICLASDefault(){
				
					return "";
				
				}
				public String ICLASComment(){
				
				    return "";
				
				}
				public String ICLASPattern(){
				
					return "";
				
				}
				public String ICLASOriginalDbColumnName(){
				
					return "ICLAS";
				
				}

				
			    public Double ISCLAS;

				public Double getISCLAS () {
					return this.ISCLAS;
				}

				public Boolean ISCLASIsNullable(){
				    return true;
				}
				public Boolean ISCLASIsKey(){
				    return false;
				}
				public Integer ISCLASLength(){
				    return null;
				}
				public Integer ISCLASPrecision(){
				    return null;
				}
				public String ISCLASDefault(){
				
					return "";
				
				}
				public String ISCLASComment(){
				
				    return "";
				
				}
				public String ISCLASPattern(){
				
					return "";
				
				}
				public String ISCLASOriginalDbColumnName(){
				
					return "ISCLAS";
				
				}

				
			    public String BYRNUM;

				public String getBYRNUM () {
					return this.BYRNUM;
				}

				public Boolean BYRNUMIsNullable(){
				    return true;
				}
				public Boolean BYRNUMIsKey(){
				    return false;
				}
				public Integer BYRNUMLength(){
				    return null;
				}
				public Integer BYRNUMPrecision(){
				    return null;
				}
				public String BYRNUMDefault(){
				
					return "";
				
				}
				public String BYRNUMComment(){
				
				    return "";
				
				}
				public String BYRNUMPattern(){
				
					return "";
				
				}
				public String BYRNUMOriginalDbColumnName(){
				
					return "BYRNUM";
				
				}

				
			    public BigDecimal IASPAC;

				public BigDecimal getIASPAC () {
					return this.IASPAC;
				}

				public Boolean IASPACIsNullable(){
				    return true;
				}
				public Boolean IASPACIsKey(){
				    return false;
				}
				public Integer IASPACLength(){
				    return null;
				}
				public Integer IASPACPrecision(){
				    return null;
				}
				public String IASPACDefault(){
				
					return "";
				
				}
				public String IASPACComment(){
				
				    return "";
				
				}
				public String IASPACPattern(){
				
					return "";
				
				}
				public String IASPACOriginalDbColumnName(){
				
					return "IASPAC";
				
				}

				
			    public String IADVYN;

				public String getIADVYN () {
					return this.IADVYN;
				}

				public Boolean IADVYNIsNullable(){
				    return true;
				}
				public Boolean IADVYNIsKey(){
				    return false;
				}
				public Integer IADVYNLength(){
				    return null;
				}
				public Integer IADVYNPrecision(){
				    return null;
				}
				public String IADVYNDefault(){
				
					return "";
				
				}
				public String IADVYNComment(){
				
				    return "";
				
				}
				public String IADVYNPattern(){
				
					return "";
				
				}
				public String IADVYNOriginalDbColumnName(){
				
					return "IADVYN";
				
				}

				
			    public String IBUYCD;

				public String getIBUYCD () {
					return this.IBUYCD;
				}

				public Boolean IBUYCDIsNullable(){
				    return true;
				}
				public Boolean IBUYCDIsKey(){
				    return false;
				}
				public Integer IBUYCDLength(){
				    return null;
				}
				public Integer IBUYCDPrecision(){
				    return null;
				}
				public String IBUYCDDefault(){
				
					return "";
				
				}
				public String IBUYCDComment(){
				
				    return "";
				
				}
				public String IBUYCDPattern(){
				
					return "";
				
				}
				public String IBUYCDOriginalDbColumnName(){
				
					return "IBUYCD";
				
				}

				
			    public String ISET;

				public String getISET () {
					return this.ISET;
				}

				public Boolean ISETIsNullable(){
				    return true;
				}
				public Boolean ISETIsKey(){
				    return false;
				}
				public Integer ISETLength(){
				    return null;
				}
				public Integer ISETPrecision(){
				    return null;
				}
				public String ISETDefault(){
				
					return "";
				
				}
				public String ISETComment(){
				
				    return "";
				
				}
				public String ISETPattern(){
				
					return "";
				
				}
				public String ISETOriginalDbColumnName(){
				
					return "ISET";
				
				}

				
			    public String IWARNT;

				public String getIWARNT () {
					return this.IWARNT;
				}

				public Boolean IWARNTIsNullable(){
				    return true;
				}
				public Boolean IWARNTIsKey(){
				    return false;
				}
				public Integer IWARNTLength(){
				    return null;
				}
				public Integer IWARNTPrecision(){
				    return null;
				}
				public String IWARNTDefault(){
				
					return "";
				
				}
				public String IWARNTComment(){
				
				    return "";
				
				}
				public String IWARNTPattern(){
				
					return "";
				
				}
				public String IWARNTOriginalDbColumnName(){
				
					return "IWARNT";
				
				}

				
			    public String IPRMPT;

				public String getIPRMPT () {
					return this.IPRMPT;
				}

				public Boolean IPRMPTIsNullable(){
				    return true;
				}
				public Boolean IPRMPTIsKey(){
				    return false;
				}
				public Integer IPRMPTLength(){
				    return null;
				}
				public Integer IPRMPTPrecision(){
				    return null;
				}
				public String IPRMPTDefault(){
				
					return "";
				
				}
				public String IPRMPTComment(){
				
				    return "";
				
				}
				public String IPRMPTPattern(){
				
					return "";
				
				}
				public String IPRMPTOriginalDbColumnName(){
				
					return "IPRMPT";
				
				}

				
			    public String IPRVNT;

				public String getIPRVNT () {
					return this.IPRVNT;
				}

				public Boolean IPRVNTIsNullable(){
				    return true;
				}
				public Boolean IPRVNTIsKey(){
				    return false;
				}
				public Integer IPRVNTLength(){
				    return null;
				}
				public Integer IPRVNTPrecision(){
				    return null;
				}
				public String IPRVNTDefault(){
				
					return "";
				
				}
				public String IPRVNTComment(){
				
				    return "";
				
				}
				public String IPRVNTPattern(){
				
					return "";
				
				}
				public String IPRVNTOriginalDbColumnName(){
				
					return "IPRVNT";
				
				}

				
			    public String ITKTTR;

				public String getITKTTR () {
					return this.ITKTTR;
				}

				public Boolean ITKTTRIsNullable(){
				    return true;
				}
				public Boolean ITKTTRIsKey(){
				    return false;
				}
				public Integer ITKTTRLength(){
				    return null;
				}
				public Integer ITKTTRPrecision(){
				    return null;
				}
				public String ITKTTRDefault(){
				
					return "";
				
				}
				public String ITKTTRComment(){
				
				    return "";
				
				}
				public String ITKTTRPattern(){
				
					return "";
				
				}
				public String ITKTTROriginalDbColumnName(){
				
					return "ITKTTR";
				
				}

				
			    public String ITKTTA;

				public String getITKTTA () {
					return this.ITKTTA;
				}

				public Boolean ITKTTAIsNullable(){
				    return true;
				}
				public Boolean ITKTTAIsKey(){
				    return false;
				}
				public Integer ITKTTALength(){
				    return null;
				}
				public Integer ITKTTAPrecision(){
				    return null;
				}
				public String ITKTTADefault(){
				
					return "";
				
				}
				public String ITKTTAComment(){
				
				    return "";
				
				}
				public String ITKTTAPattern(){
				
					return "";
				
				}
				public String ITKTTAOriginalDbColumnName(){
				
					return "ITKTTA";
				
				}

				
			    public BigDecimal ITKTN;

				public BigDecimal getITKTN () {
					return this.ITKTN;
				}

				public Boolean ITKTNIsNullable(){
				    return true;
				}
				public Boolean ITKTNIsKey(){
				    return false;
				}
				public Integer ITKTNLength(){
				    return null;
				}
				public Integer ITKTNPrecision(){
				    return null;
				}
				public String ITKTNDefault(){
				
					return "";
				
				}
				public String ITKTNComment(){
				
				    return "";
				
				}
				public String ITKTNPattern(){
				
					return "";
				
				}
				public String ITKTNOriginalDbColumnName(){
				
					return "ITKTN";
				
				}

				
			    public String ILBLTR;

				public String getILBLTR () {
					return this.ILBLTR;
				}

				public Boolean ILBLTRIsNullable(){
				    return true;
				}
				public Boolean ILBLTRIsKey(){
				    return false;
				}
				public Integer ILBLTRLength(){
				    return null;
				}
				public Integer ILBLTRPrecision(){
				    return null;
				}
				public String ILBLTRDefault(){
				
					return "";
				
				}
				public String ILBLTRComment(){
				
				    return "";
				
				}
				public String ILBLTRPattern(){
				
					return "";
				
				}
				public String ILBLTROriginalDbColumnName(){
				
					return "ILBLTR";
				
				}

				
			    public String ILBLTA;

				public String getILBLTA () {
					return this.ILBLTA;
				}

				public Boolean ILBLTAIsNullable(){
				    return true;
				}
				public Boolean ILBLTAIsKey(){
				    return false;
				}
				public Integer ILBLTALength(){
				    return null;
				}
				public Integer ILBLTAPrecision(){
				    return null;
				}
				public String ILBLTADefault(){
				
					return "";
				
				}
				public String ILBLTAComment(){
				
				    return "";
				
				}
				public String ILBLTAPattern(){
				
					return "";
				
				}
				public String ILBLTAOriginalDbColumnName(){
				
					return "ILBLTA";
				
				}

				
			    public String IFINLN;

				public String getIFINLN () {
					return this.IFINLN;
				}

				public Boolean IFINLNIsNullable(){
				    return true;
				}
				public Boolean IFINLNIsKey(){
				    return false;
				}
				public Integer IFINLNLength(){
				    return null;
				}
				public Integer IFINLNPrecision(){
				    return null;
				}
				public String IFINLNDefault(){
				
					return "";
				
				}
				public String IFINLNComment(){
				
				    return "";
				
				}
				public String IFINLNPattern(){
				
					return "";
				
				}
				public String IFINLNOriginalDbColumnName(){
				
					return "IFINLN";
				
				}

				
			    public String IPROFL;

				public String getIPROFL () {
					return this.IPROFL;
				}

				public Boolean IPROFLIsNullable(){
				    return true;
				}
				public Boolean IPROFLIsKey(){
				    return false;
				}
				public Integer IPROFLLength(){
				    return null;
				}
				public Integer IPROFLPrecision(){
				    return null;
				}
				public String IPROFLDefault(){
				
					return "";
				
				}
				public String IPROFLComment(){
				
				    return "";
				
				}
				public String IPROFLPattern(){
				
					return "";
				
				}
				public String IPROFLOriginalDbColumnName(){
				
					return "IPROFL";
				
				}

				
			    public String IMODUL;

				public String getIMODUL () {
					return this.IMODUL;
				}

				public Boolean IMODULIsNullable(){
				    return true;
				}
				public Boolean IMODULIsKey(){
				    return false;
				}
				public Integer IMODULLength(){
				    return null;
				}
				public Integer IMODULPrecision(){
				    return null;
				}
				public String IMODULDefault(){
				
					return "";
				
				}
				public String IMODULComment(){
				
				    return "";
				
				}
				public String IMODULPattern(){
				
					return "";
				
				}
				public String IMODULOriginalDbColumnName(){
				
					return "IMODUL";
				
				}

				
			    public String ISTYPE;

				public String getISTYPE () {
					return this.ISTYPE;
				}

				public Boolean ISTYPEIsNullable(){
				    return true;
				}
				public Boolean ISTYPEIsKey(){
				    return false;
				}
				public Integer ISTYPELength(){
				    return null;
				}
				public Integer ISTYPEPrecision(){
				    return null;
				}
				public String ISTYPEDefault(){
				
					return "";
				
				}
				public String ISTYPEComment(){
				
				    return "";
				
				}
				public String ISTYPEPattern(){
				
					return "";
				
				}
				public String ISTYPEOriginalDbColumnName(){
				
					return "ISTYPE";
				
				}

				
			    public Double ISCOLR;

				public Double getISCOLR () {
					return this.ISCOLR;
				}

				public Boolean ISCOLRIsNullable(){
				    return true;
				}
				public Boolean ISCOLRIsKey(){
				    return false;
				}
				public Integer ISCOLRLength(){
				    return null;
				}
				public Integer ISCOLRPrecision(){
				    return null;
				}
				public String ISCOLRDefault(){
				
					return "";
				
				}
				public String ISCOLRComment(){
				
				    return "";
				
				}
				public String ISCOLRPattern(){
				
					return "";
				
				}
				public String ISCOLROriginalDbColumnName(){
				
					return "ISCOLR";
				
				}

				
			    public String ISSIZE;

				public String getISSIZE () {
					return this.ISSIZE;
				}

				public Boolean ISSIZEIsNullable(){
				    return true;
				}
				public Boolean ISSIZEIsKey(){
				    return false;
				}
				public Integer ISSIZELength(){
				    return null;
				}
				public Integer ISSIZEPrecision(){
				    return null;
				}
				public String ISSIZEDefault(){
				
					return "";
				
				}
				public String ISSIZEComment(){
				
				    return "";
				
				}
				public String ISSIZEPattern(){
				
					return "";
				
				}
				public String ISSIZEOriginalDbColumnName(){
				
					return "ISSIZE";
				
				}

				
			    public String IHAZCD;

				public String getIHAZCD () {
					return this.IHAZCD;
				}

				public Boolean IHAZCDIsNullable(){
				    return true;
				}
				public Boolean IHAZCDIsKey(){
				    return false;
				}
				public Integer IHAZCDLength(){
				    return null;
				}
				public Integer IHAZCDPrecision(){
				    return null;
				}
				public String IHAZCDDefault(){
				
					return "";
				
				}
				public String IHAZCDComment(){
				
				    return "";
				
				}
				public String IHAZCDPattern(){
				
					return "";
				
				}
				public String IHAZCDOriginalDbColumnName(){
				
					return "IHAZCD";
				
				}

				
			    public String MCHNUM;

				public String getMCHNUM () {
					return this.MCHNUM;
				}

				public Boolean MCHNUMIsNullable(){
				    return true;
				}
				public Boolean MCHNUMIsKey(){
				    return false;
				}
				public Integer MCHNUMLength(){
				    return null;
				}
				public Integer MCHNUMPrecision(){
				    return null;
				}
				public String MCHNUMDefault(){
				
					return "";
				
				}
				public String MCHNUMComment(){
				
				    return "";
				
				}
				public String MCHNUMPattern(){
				
					return "";
				
				}
				public String MCHNUMOriginalDbColumnName(){
				
					return "MCHNUM";
				
				}

				
			    public BigDecimal ISUBST;

				public BigDecimal getISUBST () {
					return this.ISUBST;
				}

				public Boolean ISUBSTIsNullable(){
				    return true;
				}
				public Boolean ISUBSTIsKey(){
				    return false;
				}
				public Integer ISUBSTLength(){
				    return null;
				}
				public Integer ISUBSTPrecision(){
				    return null;
				}
				public String ISUBSTDefault(){
				
					return "";
				
				}
				public String ISUBSTComment(){
				
				    return "";
				
				}
				public String ISUBSTPattern(){
				
					return "";
				
				}
				public String ISUBSTOriginalDbColumnName(){
				
					return "ISUBST";
				
				}

				
			    public BigDecimal ICORE;

				public BigDecimal getICORE () {
					return this.ICORE;
				}

				public Boolean ICOREIsNullable(){
				    return true;
				}
				public Boolean ICOREIsKey(){
				    return false;
				}
				public Integer ICORELength(){
				    return null;
				}
				public Integer ICOREPrecision(){
				    return null;
				}
				public String ICOREDefault(){
				
					return "";
				
				}
				public String ICOREComment(){
				
				    return "";
				
				}
				public String ICOREPattern(){
				
					return "";
				
				}
				public String ICOREOriginalDbColumnName(){
				
					return "ICORE";
				
				}

				
			    public BigDecimal IREPL;

				public BigDecimal getIREPL () {
					return this.IREPL;
				}

				public Boolean IREPLIsNullable(){
				    return true;
				}
				public Boolean IREPLIsKey(){
				    return false;
				}
				public Integer IREPLLength(){
				    return null;
				}
				public Integer IREPLPrecision(){
				    return null;
				}
				public String IREPLDefault(){
				
					return "";
				
				}
				public String IREPLComment(){
				
				    return "";
				
				}
				public String IREPLPattern(){
				
					return "";
				
				}
				public String IREPLOriginalDbColumnName(){
				
					return "IREPL";
				
				}

				
			    public String ISLUM;

				public String getISLUM () {
					return this.ISLUM;
				}

				public Boolean ISLUMIsNullable(){
				    return true;
				}
				public Boolean ISLUMIsKey(){
				    return false;
				}
				public Integer ISLUMLength(){
				    return null;
				}
				public Integer ISLUMPrecision(){
				    return null;
				}
				public String ISLUMDefault(){
				
					return "";
				
				}
				public String ISLUMComment(){
				
				    return "";
				
				}
				public String ISLUMPattern(){
				
					return "";
				
				}
				public String ISLUMOriginalDbColumnName(){
				
					return "ISLUM";
				
				}

				
			    public BigDecimal IUMCV2;

				public BigDecimal getIUMCV2 () {
					return this.IUMCV2;
				}

				public Boolean IUMCV2IsNullable(){
				    return true;
				}
				public Boolean IUMCV2IsKey(){
				    return false;
				}
				public Integer IUMCV2Length(){
				    return null;
				}
				public Integer IUMCV2Precision(){
				    return null;
				}
				public String IUMCV2Default(){
				
					return "";
				
				}
				public String IUMCV2Comment(){
				
				    return "";
				
				}
				public String IUMCV2Pattern(){
				
					return "";
				
				}
				public String IUMCV2OriginalDbColumnName(){
				
					return "IUMCV2";
				
				}

				
			    public String IBYUM;

				public String getIBYUM () {
					return this.IBYUM;
				}

				public Boolean IBYUMIsNullable(){
				    return true;
				}
				public Boolean IBYUMIsKey(){
				    return false;
				}
				public Integer IBYUMLength(){
				    return null;
				}
				public Integer IBYUMPrecision(){
				    return null;
				}
				public String IBYUMDefault(){
				
					return "";
				
				}
				public String IBYUMComment(){
				
				    return "";
				
				}
				public String IBYUMPattern(){
				
					return "";
				
				}
				public String IBYUMOriginalDbColumnName(){
				
					return "IBYUM";
				
				}

				
			    public BigDecimal IMINPK;

				public BigDecimal getIMINPK () {
					return this.IMINPK;
				}

				public Boolean IMINPKIsNullable(){
				    return true;
				}
				public Boolean IMINPKIsKey(){
				    return false;
				}
				public Integer IMINPKLength(){
				    return null;
				}
				public Integer IMINPKPrecision(){
				    return null;
				}
				public String IMINPKDefault(){
				
					return "";
				
				}
				public String IMINPKComment(){
				
				    return "";
				
				}
				public String IMINPKPattern(){
				
					return "";
				
				}
				public String IMINPKOriginalDbColumnName(){
				
					return "IMINPK";
				
				}

				
			    public BigDecimal ISTDPK;

				public BigDecimal getISTDPK () {
					return this.ISTDPK;
				}

				public Boolean ISTDPKIsNullable(){
				    return true;
				}
				public Boolean ISTDPKIsKey(){
				    return false;
				}
				public Integer ISTDPKLength(){
				    return null;
				}
				public Integer ISTDPKPrecision(){
				    return null;
				}
				public String ISTDPKDefault(){
				
					return "";
				
				}
				public String ISTDPKComment(){
				
				    return "";
				
				}
				public String ISTDPKPattern(){
				
					return "";
				
				}
				public String ISTDPKOriginalDbColumnName(){
				
					return "ISTDPK";
				
				}

				
			    public String IHLDOR;

				public String getIHLDOR () {
					return this.IHLDOR;
				}

				public Boolean IHLDORIsNullable(){
				    return true;
				}
				public Boolean IHLDORIsKey(){
				    return false;
				}
				public Integer IHLDORLength(){
				    return null;
				}
				public Integer IHLDORPrecision(){
				    return null;
				}
				public String IHLDORDefault(){
				
					return "";
				
				}
				public String IHLDORComment(){
				
				    return "";
				
				}
				public String IHLDORPattern(){
				
					return "";
				
				}
				public String IHLDOROriginalDbColumnName(){
				
					return "IHLDOR";
				
				}

				
			    public BigDecimal IMOQTY;

				public BigDecimal getIMOQTY () {
					return this.IMOQTY;
				}

				public Boolean IMOQTYIsNullable(){
				    return true;
				}
				public Boolean IMOQTYIsKey(){
				    return false;
				}
				public Integer IMOQTYLength(){
				    return null;
				}
				public Integer IMOQTYPrecision(){
				    return null;
				}
				public String IMOQTYDefault(){
				
					return "";
				
				}
				public String IMOQTYComment(){
				
				    return "";
				
				}
				public String IMOQTYPattern(){
				
					return "";
				
				}
				public String IMOQTYOriginalDbColumnName(){
				
					return "IMOQTY";
				
				}

				
			    public BigDecimal IMNSTK;

				public BigDecimal getIMNSTK () {
					return this.IMNSTK;
				}

				public Boolean IMNSTKIsNullable(){
				    return true;
				}
				public Boolean IMNSTKIsKey(){
				    return false;
				}
				public Integer IMNSTKLength(){
				    return null;
				}
				public Integer IMNSTKPrecision(){
				    return null;
				}
				public String IMNSTKDefault(){
				
					return "";
				
				}
				public String IMNSTKComment(){
				
				    return "";
				
				}
				public String IMNSTKPattern(){
				
					return "";
				
				}
				public String IMNSTKOriginalDbColumnName(){
				
					return "IMNSTK";
				
				}

				
			    public BigDecimal IMXSTK;

				public BigDecimal getIMXSTK () {
					return this.IMXSTK;
				}

				public Boolean IMXSTKIsNullable(){
				    return true;
				}
				public Boolean IMXSTKIsKey(){
				    return false;
				}
				public Integer IMXSTKLength(){
				    return null;
				}
				public Integer IMXSTKPrecision(){
				    return null;
				}
				public String IMXSTKDefault(){
				
					return "";
				
				}
				public String IMXSTKComment(){
				
				    return "";
				
				}
				public String IMXSTKPattern(){
				
					return "";
				
				}
				public String IMXSTKOriginalDbColumnName(){
				
					return "IMXSTK";
				
				}

				
			    public BigDecimal IMDSTK;

				public BigDecimal getIMDSTK () {
					return this.IMDSTK;
				}

				public Boolean IMDSTKIsNullable(){
				    return true;
				}
				public Boolean IMDSTKIsKey(){
				    return false;
				}
				public Integer IMDSTKLength(){
				    return null;
				}
				public Integer IMDSTKPrecision(){
				    return null;
				}
				public String IMDSTKDefault(){
				
					return "";
				
				}
				public String IMDSTKComment(){
				
				    return "";
				
				}
				public String IMDSTKPattern(){
				
					return "";
				
				}
				public String IMDSTKOriginalDbColumnName(){
				
					return "IMDSTK";
				
				}

				
			    public BigDecimal IDSPLY;

				public BigDecimal getIDSPLY () {
					return this.IDSPLY;
				}

				public Boolean IDSPLYIsNullable(){
				    return true;
				}
				public Boolean IDSPLYIsKey(){
				    return false;
				}
				public Integer IDSPLYLength(){
				    return null;
				}
				public Integer IDSPLYPrecision(){
				    return null;
				}
				public String IDSPLYDefault(){
				
					return "";
				
				}
				public String IDSPLYComment(){
				
				    return "";
				
				}
				public String IDSPLYPattern(){
				
					return "";
				
				}
				public String IDSPLYOriginalDbColumnName(){
				
					return "IDSPLY";
				
				}

				
			    public BigDecimal IOMULT;

				public BigDecimal getIOMULT () {
					return this.IOMULT;
				}

				public Boolean IOMULTIsNullable(){
				    return true;
				}
				public Boolean IOMULTIsKey(){
				    return false;
				}
				public Integer IOMULTLength(){
				    return null;
				}
				public Integer IOMULTPrecision(){
				    return null;
				}
				public String IOMULTDefault(){
				
					return "";
				
				}
				public String IOMULTComment(){
				
				    return "";
				
				}
				public String IOMULTPattern(){
				
					return "";
				
				}
				public String IOMULTOriginalDbColumnName(){
				
					return "IOMULT";
				
				}

				
			    public String IRPLCD;

				public String getIRPLCD () {
					return this.IRPLCD;
				}

				public Boolean IRPLCDIsNullable(){
				    return true;
				}
				public Boolean IRPLCDIsKey(){
				    return false;
				}
				public Integer IRPLCDLength(){
				    return null;
				}
				public Integer IRPLCDPrecision(){
				    return null;
				}
				public String IRPLCDDefault(){
				
					return "";
				
				}
				public String IRPLCDComment(){
				
				    return "";
				
				}
				public String IRPLCDPattern(){
				
					return "";
				
				}
				public String IRPLCDOriginalDbColumnName(){
				
					return "IRPLCD";
				
				}

				
			    public BigDecimal IMFPRC;

				public BigDecimal getIMFPRC () {
					return this.IMFPRC;
				}

				public Boolean IMFPRCIsNullable(){
				    return true;
				}
				public Boolean IMFPRCIsKey(){
				    return false;
				}
				public Integer IMFPRCLength(){
				    return null;
				}
				public Integer IMFPRCPrecision(){
				    return null;
				}
				public String IMFPRCDefault(){
				
					return "";
				
				}
				public String IMFPRCComment(){
				
				    return "";
				
				}
				public String IMFPRCPattern(){
				
					return "";
				
				}
				public String IMFPRCOriginalDbColumnName(){
				
					return "IMFPRC";
				
				}

				
			    public BigDecimal IWGHT;

				public BigDecimal getIWGHT () {
					return this.IWGHT;
				}

				public Boolean IWGHTIsNullable(){
				    return true;
				}
				public Boolean IWGHTIsKey(){
				    return false;
				}
				public Integer IWGHTLength(){
				    return null;
				}
				public Integer IWGHTPrecision(){
				    return null;
				}
				public String IWGHTDefault(){
				
					return "";
				
				}
				public String IWGHTComment(){
				
				    return "";
				
				}
				public String IWGHTPattern(){
				
					return "";
				
				}
				public String IWGHTOriginalDbColumnName(){
				
					return "IWGHT";
				
				}

				
			    public BigDecimal ICUBE;

				public BigDecimal getICUBE () {
					return this.ICUBE;
				}

				public Boolean ICUBEIsNullable(){
				    return true;
				}
				public Boolean ICUBEIsKey(){
				    return false;
				}
				public Integer ICUBELength(){
				    return null;
				}
				public Integer ICUBEPrecision(){
				    return null;
				}
				public String ICUBEDefault(){
				
					return "";
				
				}
				public String ICUBEComment(){
				
				    return "";
				
				}
				public String ICUBEPattern(){
				
					return "";
				
				}
				public String ICUBEOriginalDbColumnName(){
				
					return "ICUBE";
				
				}

				
			    public BigDecimal IDLGTH;

				public BigDecimal getIDLGTH () {
					return this.IDLGTH;
				}

				public Boolean IDLGTHIsNullable(){
				    return true;
				}
				public Boolean IDLGTHIsKey(){
				    return false;
				}
				public Integer IDLGTHLength(){
				    return null;
				}
				public Integer IDLGTHPrecision(){
				    return null;
				}
				public String IDLGTHDefault(){
				
					return "";
				
				}
				public String IDLGTHComment(){
				
				    return "";
				
				}
				public String IDLGTHPattern(){
				
					return "";
				
				}
				public String IDLGTHOriginalDbColumnName(){
				
					return "IDLGTH";
				
				}

				
			    public BigDecimal IDWDTH;

				public BigDecimal getIDWDTH () {
					return this.IDWDTH;
				}

				public Boolean IDWDTHIsNullable(){
				    return true;
				}
				public Boolean IDWDTHIsKey(){
				    return false;
				}
				public Integer IDWDTHLength(){
				    return null;
				}
				public Integer IDWDTHPrecision(){
				    return null;
				}
				public String IDWDTHDefault(){
				
					return "";
				
				}
				public String IDWDTHComment(){
				
				    return "";
				
				}
				public String IDWDTHPattern(){
				
					return "";
				
				}
				public String IDWDTHOriginalDbColumnName(){
				
					return "IDWDTH";
				
				}

				
			    public BigDecimal IDHGHT;

				public BigDecimal getIDHGHT () {
					return this.IDHGHT;
				}

				public Boolean IDHGHTIsNullable(){
				    return true;
				}
				public Boolean IDHGHTIsKey(){
				    return false;
				}
				public Integer IDHGHTLength(){
				    return null;
				}
				public Integer IDHGHTPrecision(){
				    return null;
				}
				public String IDHGHTDefault(){
				
					return "";
				
				}
				public String IDHGHTComment(){
				
				    return "";
				
				}
				public String IDHGHTPattern(){
				
					return "";
				
				}
				public String IDHGHTOriginalDbColumnName(){
				
					return "IDHGHT";
				
				}

				
			    public BigDecimal IMDATE;

				public BigDecimal getIMDATE () {
					return this.IMDATE;
				}

				public Boolean IMDATEIsNullable(){
				    return true;
				}
				public Boolean IMDATEIsKey(){
				    return false;
				}
				public Integer IMDATELength(){
				    return null;
				}
				public Integer IMDATEPrecision(){
				    return null;
				}
				public String IMDATEDefault(){
				
					return "";
				
				}
				public String IMDATEComment(){
				
				    return "";
				
				}
				public String IMDATEPattern(){
				
					return "";
				
				}
				public String IMDATEOriginalDbColumnName(){
				
					return "IMDATE";
				
				}

				
			    public BigDecimal IMCENT;

				public BigDecimal getIMCENT () {
					return this.IMCENT;
				}

				public Boolean IMCENTIsNullable(){
				    return true;
				}
				public Boolean IMCENTIsKey(){
				    return false;
				}
				public Integer IMCENTLength(){
				    return null;
				}
				public Integer IMCENTPrecision(){
				    return null;
				}
				public String IMCENTDefault(){
				
					return "";
				
				}
				public String IMCENTComment(){
				
				    return "";
				
				}
				public String IMCENTPattern(){
				
					return "";
				
				}
				public String IMCENTOriginalDbColumnName(){
				
					return "IMCENT";
				
				}

				
			    public BigDecimal IVPLTI;

				public BigDecimal getIVPLTI () {
					return this.IVPLTI;
				}

				public Boolean IVPLTIIsNullable(){
				    return true;
				}
				public Boolean IVPLTIIsKey(){
				    return false;
				}
				public Integer IVPLTILength(){
				    return null;
				}
				public Integer IVPLTIPrecision(){
				    return null;
				}
				public String IVPLTIDefault(){
				
					return "";
				
				}
				public String IVPLTIComment(){
				
				    return "";
				
				}
				public String IVPLTIPattern(){
				
					return "";
				
				}
				public String IVPLTIOriginalDbColumnName(){
				
					return "IVPLTI";
				
				}

				
			    public BigDecimal IVPLHI;

				public BigDecimal getIVPLHI () {
					return this.IVPLHI;
				}

				public Boolean IVPLHIIsNullable(){
				    return true;
				}
				public Boolean IVPLHIIsKey(){
				    return false;
				}
				public Integer IVPLHILength(){
				    return null;
				}
				public Integer IVPLHIPrecision(){
				    return null;
				}
				public String IVPLHIDefault(){
				
					return "";
				
				}
				public String IVPLHIComment(){
				
				    return "";
				
				}
				public String IVPLHIPattern(){
				
					return "";
				
				}
				public String IVPLHIOriginalDbColumnName(){
				
					return "IVPLHI";
				
				}

				
			    public Double SHPNUM;

				public Double getSHPNUM () {
					return this.SHPNUM;
				}

				public Boolean SHPNUMIsNullable(){
				    return true;
				}
				public Boolean SHPNUMIsKey(){
				    return false;
				}
				public Integer SHPNUMLength(){
				    return null;
				}
				public Integer SHPNUMPrecision(){
				    return null;
				}
				public String SHPNUMDefault(){
				
					return "";
				
				}
				public String SHPNUMComment(){
				
				    return "";
				
				}
				public String SHPNUMPattern(){
				
					return "";
				
				}
				public String SHPNUMOriginalDbColumnName(){
				
					return "SHPNUM";
				
				}

				
			    public String IDISTM;

				public String getIDISTM () {
					return this.IDISTM;
				}

				public Boolean IDISTMIsNullable(){
				    return true;
				}
				public Boolean IDISTMIsKey(){
				    return false;
				}
				public Integer IDISTMLength(){
				    return null;
				}
				public Integer IDISTMPrecision(){
				    return null;
				}
				public String IDISTMDefault(){
				
					return "";
				
				}
				public String IDISTMComment(){
				
				    return "";
				
				}
				public String IDISTMPattern(){
				
					return "";
				
				}
				public String IDISTMOriginalDbColumnName(){
				
					return "IDISTM";
				
				}

				
			    public String IHLDWO;

				public String getIHLDWO () {
					return this.IHLDWO;
				}

				public Boolean IHLDWOIsNullable(){
				    return true;
				}
				public Boolean IHLDWOIsKey(){
				    return false;
				}
				public Integer IHLDWOLength(){
				    return null;
				}
				public Integer IHLDWOPrecision(){
				    return null;
				}
				public String IHLDWODefault(){
				
					return "";
				
				}
				public String IHLDWOComment(){
				
				    return "";
				
				}
				public String IHLDWOPattern(){
				
					return "";
				
				}
				public String IHLDWOOriginalDbColumnName(){
				
					return "IHLDWO";
				
				}

				
			    public Double IIGNUM;

				public Double getIIGNUM () {
					return this.IIGNUM;
				}

				public Boolean IIGNUMIsNullable(){
				    return true;
				}
				public Boolean IIGNUMIsKey(){
				    return false;
				}
				public Integer IIGNUMLength(){
				    return null;
				}
				public Integer IIGNUMPrecision(){
				    return null;
				}
				public String IIGNUMDefault(){
				
					return "";
				
				}
				public String IIGNUMComment(){
				
				    return "";
				
				}
				public String IIGNUMPattern(){
				
					return "";
				
				}
				public String IIGNUMOriginalDbColumnName(){
				
					return "IIGNUM";
				
				}

				
			    public String ISDIM;

				public String getISDIM () {
					return this.ISDIM;
				}

				public Boolean ISDIMIsNullable(){
				    return true;
				}
				public Boolean ISDIMIsKey(){
				    return false;
				}
				public Integer ISDIMLength(){
				    return null;
				}
				public Integer ISDIMPrecision(){
				    return null;
				}
				public String ISDIMDefault(){
				
					return "";
				
				}
				public String ISDIMComment(){
				
				    return "";
				
				}
				public String ISDIMPattern(){
				
					return "";
				
				}
				public String ISDIMOriginalDbColumnName(){
				
					return "ISDIM";
				
				}

				
			    public String IVATCD;

				public String getIVATCD () {
					return this.IVATCD;
				}

				public Boolean IVATCDIsNullable(){
				    return true;
				}
				public Boolean IVATCDIsKey(){
				    return false;
				}
				public Integer IVATCDLength(){
				    return null;
				}
				public Integer IVATCDPrecision(){
				    return null;
				}
				public String IVATCDDefault(){
				
					return "";
				
				}
				public String IVATCDComment(){
				
				    return "";
				
				}
				public String IVATCDPattern(){
				
					return "";
				
				}
				public String IVATCDOriginalDbColumnName(){
				
					return "IVATCD";
				
				}

				
			    public Double IPLAN;

				public Double getIPLAN () {
					return this.IPLAN;
				}

				public Boolean IPLANIsNullable(){
				    return true;
				}
				public Boolean IPLANIsKey(){
				    return false;
				}
				public Integer IPLANLength(){
				    return null;
				}
				public Integer IPLANPrecision(){
				    return null;
				}
				public String IPLANDefault(){
				
					return "";
				
				}
				public String IPLANComment(){
				
				    return "";
				
				}
				public String IPLANPattern(){
				
					return "";
				
				}
				public String IPLANOriginalDbColumnName(){
				
					return "IPLAN";
				
				}

				
			    public String IVLRK1;

				public String getIVLRK1 () {
					return this.IVLRK1;
				}

				public Boolean IVLRK1IsNullable(){
				    return true;
				}
				public Boolean IVLRK1IsKey(){
				    return false;
				}
				public Integer IVLRK1Length(){
				    return null;
				}
				public Integer IVLRK1Precision(){
				    return null;
				}
				public String IVLRK1Default(){
				
					return "";
				
				}
				public String IVLRK1Comment(){
				
				    return "";
				
				}
				public String IVLRK1Pattern(){
				
					return "";
				
				}
				public String IVLRK1OriginalDbColumnName(){
				
					return "IVLRK1";
				
				}

				
			    public String IVLRK2;

				public String getIVLRK2 () {
					return this.IVLRK2;
				}

				public Boolean IVLRK2IsNullable(){
				    return true;
				}
				public Boolean IVLRK2IsKey(){
				    return false;
				}
				public Integer IVLRK2Length(){
				    return null;
				}
				public Integer IVLRK2Precision(){
				    return null;
				}
				public String IVLRK2Default(){
				
					return "";
				
				}
				public String IVLRK2Comment(){
				
				    return "";
				
				}
				public String IVLRK2Pattern(){
				
					return "";
				
				}
				public String IVLRK2OriginalDbColumnName(){
				
					return "IVLRK2";
				
				}

				
			    public String IVLRK3;

				public String getIVLRK3 () {
					return this.IVLRK3;
				}

				public Boolean IVLRK3IsNullable(){
				    return true;
				}
				public Boolean IVLRK3IsKey(){
				    return false;
				}
				public Integer IVLRK3Length(){
				    return null;
				}
				public Integer IVLRK3Precision(){
				    return null;
				}
				public String IVLRK3Default(){
				
					return "";
				
				}
				public String IVLRK3Comment(){
				
				    return "";
				
				}
				public String IVLRK3Pattern(){
				
					return "";
				
				}
				public String IVLRK3OriginalDbColumnName(){
				
					return "IVLRK3";
				
				}

				
			    public String IVLRK4;

				public String getIVLRK4 () {
					return this.IVLRK4;
				}

				public Boolean IVLRK4IsNullable(){
				    return true;
				}
				public Boolean IVLRK4IsKey(){
				    return false;
				}
				public Integer IVLRK4Length(){
				    return null;
				}
				public Integer IVLRK4Precision(){
				    return null;
				}
				public String IVLRK4Default(){
				
					return "";
				
				}
				public String IVLRK4Comment(){
				
				    return "";
				
				}
				public String IVLRK4Pattern(){
				
					return "";
				
				}
				public String IVLRK4OriginalDbColumnName(){
				
					return "IVLRK4";
				
				}

				
			    public BigDecimal IRPLCN;

				public BigDecimal getIRPLCN () {
					return this.IRPLCN;
				}

				public Boolean IRPLCNIsNullable(){
				    return true;
				}
				public Boolean IRPLCNIsKey(){
				    return false;
				}
				public Integer IRPLCNLength(){
				    return null;
				}
				public Integer IRPLCNPrecision(){
				    return null;
				}
				public String IRPLCNDefault(){
				
					return "";
				
				}
				public String IRPLCNComment(){
				
				    return "";
				
				}
				public String IRPLCNPattern(){
				
					return "";
				
				}
				public String IRPLCNOriginalDbColumnName(){
				
					return "IRPLCN";
				
				}

				
			    public BigDecimal IRPLDT;

				public BigDecimal getIRPLDT () {
					return this.IRPLDT;
				}

				public Boolean IRPLDTIsNullable(){
				    return true;
				}
				public Boolean IRPLDTIsKey(){
				    return false;
				}
				public Integer IRPLDTLength(){
				    return null;
				}
				public Integer IRPLDTPrecision(){
				    return null;
				}
				public String IRPLDTDefault(){
				
					return "";
				
				}
				public String IRPLDTComment(){
				
				    return "";
				
				}
				public String IRPLDTPattern(){
				
					return "";
				
				}
				public String IRPLDTOriginalDbColumnName(){
				
					return "IRPLDT";
				
				}

				
			    public String ISEASN;

				public String getISEASN () {
					return this.ISEASN;
				}

				public Boolean ISEASNIsNullable(){
				    return true;
				}
				public Boolean ISEASNIsKey(){
				    return false;
				}
				public Integer ISEASNLength(){
				    return null;
				}
				public Integer ISEASNPrecision(){
				    return null;
				}
				public String ISEASNDefault(){
				
					return "";
				
				}
				public String ISEASNComment(){
				
				    return "";
				
				}
				public String ISEASNPattern(){
				
					return "";
				
				}
				public String ISEASNOriginalDbColumnName(){
				
					return "ISEASN";
				
				}

				
			    public BigDecimal IDEADC;

				public BigDecimal getIDEADC () {
					return this.IDEADC;
				}

				public Boolean IDEADCIsNullable(){
				    return true;
				}
				public Boolean IDEADCIsKey(){
				    return false;
				}
				public Integer IDEADCLength(){
				    return null;
				}
				public Integer IDEADCPrecision(){
				    return null;
				}
				public String IDEADCDefault(){
				
					return "";
				
				}
				public String IDEADCComment(){
				
				    return "";
				
				}
				public String IDEADCPattern(){
				
					return "";
				
				}
				public String IDEADCOriginalDbColumnName(){
				
					return "IDEADC";
				
				}

				
			    public BigDecimal IDEADD;

				public BigDecimal getIDEADD () {
					return this.IDEADD;
				}

				public Boolean IDEADDIsNullable(){
				    return true;
				}
				public Boolean IDEADDIsKey(){
				    return false;
				}
				public Integer IDEADDLength(){
				    return null;
				}
				public Integer IDEADDPrecision(){
				    return null;
				}
				public String IDEADDDefault(){
				
					return "";
				
				}
				public String IDEADDComment(){
				
				    return "";
				
				}
				public String IDEADDPattern(){
				
					return "";
				
				}
				public String IDEADDOriginalDbColumnName(){
				
					return "IDEADD";
				
				}

				
			    public BigDecimal INLRTL;

				public BigDecimal getINLRTL () {
					return this.INLRTL;
				}

				public Boolean INLRTLIsNullable(){
				    return true;
				}
				public Boolean INLRTLIsKey(){
				    return false;
				}
				public Integer INLRTLLength(){
				    return null;
				}
				public Integer INLRTLPrecision(){
				    return null;
				}
				public String INLRTLDefault(){
				
					return "";
				
				}
				public String INLRTLComment(){
				
				    return "";
				
				}
				public String INLRTLPattern(){
				
					return "";
				
				}
				public String INLRTLOriginalDbColumnName(){
				
					return "INLRTL";
				
				}

				
			    public String IHANDL;

				public String getIHANDL () {
					return this.IHANDL;
				}

				public Boolean IHANDLIsNullable(){
				    return true;
				}
				public Boolean IHANDLIsKey(){
				    return false;
				}
				public Integer IHANDLLength(){
				    return null;
				}
				public Integer IHANDLPrecision(){
				    return null;
				}
				public String IHANDLDefault(){
				
					return "";
				
				}
				public String IHANDLComment(){
				
				    return "";
				
				}
				public String IHANDLPattern(){
				
					return "";
				
				}
				public String IHANDLOriginalDbColumnName(){
				
					return "IHANDL";
				
				}

				
			    public String IATRB1;

				public String getIATRB1 () {
					return this.IATRB1;
				}

				public Boolean IATRB1IsNullable(){
				    return true;
				}
				public Boolean IATRB1IsKey(){
				    return false;
				}
				public Integer IATRB1Length(){
				    return null;
				}
				public Integer IATRB1Precision(){
				    return null;
				}
				public String IATRB1Default(){
				
					return "";
				
				}
				public String IATRB1Comment(){
				
				    return "";
				
				}
				public String IATRB1Pattern(){
				
					return "";
				
				}
				public String IATRB1OriginalDbColumnName(){
				
					return "IATRB1";
				
				}

				
			    public String IATRB2;

				public String getIATRB2 () {
					return this.IATRB2;
				}

				public Boolean IATRB2IsNullable(){
				    return true;
				}
				public Boolean IATRB2IsKey(){
				    return false;
				}
				public Integer IATRB2Length(){
				    return null;
				}
				public Integer IATRB2Precision(){
				    return null;
				}
				public String IATRB2Default(){
				
					return "";
				
				}
				public String IATRB2Comment(){
				
				    return "";
				
				}
				public String IATRB2Pattern(){
				
					return "";
				
				}
				public String IATRB2OriginalDbColumnName(){
				
					return "IATRB2";
				
				}

				
			    public String IATRB3;

				public String getIATRB3 () {
					return this.IATRB3;
				}

				public Boolean IATRB3IsNullable(){
				    return true;
				}
				public Boolean IATRB3IsKey(){
				    return false;
				}
				public Integer IATRB3Length(){
				    return null;
				}
				public Integer IATRB3Precision(){
				    return null;
				}
				public String IATRB3Default(){
				
					return "";
				
				}
				public String IATRB3Comment(){
				
				    return "";
				
				}
				public String IATRB3Pattern(){
				
					return "";
				
				}
				public String IATRB3OriginalDbColumnName(){
				
					return "IATRB3";
				
				}

				
			    public String IATRB4;

				public String getIATRB4 () {
					return this.IATRB4;
				}

				public Boolean IATRB4IsNullable(){
				    return true;
				}
				public Boolean IATRB4IsKey(){
				    return false;
				}
				public Integer IATRB4Length(){
				    return null;
				}
				public Integer IATRB4Precision(){
				    return null;
				}
				public String IATRB4Default(){
				
					return "";
				
				}
				public String IATRB4Comment(){
				
				    return "";
				
				}
				public String IATRB4Pattern(){
				
					return "";
				
				}
				public String IATRB4OriginalDbColumnName(){
				
					return "IATRB4";
				
				}

				
			    public String IATRB5;

				public String getIATRB5 () {
					return this.IATRB5;
				}

				public Boolean IATRB5IsNullable(){
				    return true;
				}
				public Boolean IATRB5IsKey(){
				    return false;
				}
				public Integer IATRB5Length(){
				    return null;
				}
				public Integer IATRB5Precision(){
				    return null;
				}
				public String IATRB5Default(){
				
					return "";
				
				}
				public String IATRB5Comment(){
				
				    return "";
				
				}
				public String IATRB5Pattern(){
				
					return "";
				
				}
				public String IATRB5OriginalDbColumnName(){
				
					return "IATRB5";
				
				}

				
			    public String IPRCCH;

				public String getIPRCCH () {
					return this.IPRCCH;
				}

				public Boolean IPRCCHIsNullable(){
				    return true;
				}
				public Boolean IPRCCHIsKey(){
				    return false;
				}
				public Integer IPRCCHLength(){
				    return null;
				}
				public Integer IPRCCHPrecision(){
				    return null;
				}
				public String IPRCCHDefault(){
				
					return "";
				
				}
				public String IPRCCHComment(){
				
				    return "";
				
				}
				public String IPRCCHPattern(){
				
					return "";
				
				}
				public String IPRCCHOriginalDbColumnName(){
				
					return "IPRCCH";
				
				}

				
			    public String IPRCZN;

				public String getIPRCZN () {
					return this.IPRCZN;
				}

				public Boolean IPRCZNIsNullable(){
				    return true;
				}
				public Boolean IPRCZNIsKey(){
				    return false;
				}
				public Integer IPRCZNLength(){
				    return null;
				}
				public Integer IPRCZNPrecision(){
				    return null;
				}
				public String IPRCZNDefault(){
				
					return "";
				
				}
				public String IPRCZNComment(){
				
				    return "";
				
				}
				public String IPRCZNPattern(){
				
					return "";
				
				}
				public String IPRCZNOriginalDbColumnName(){
				
					return "IPRCZN";
				
				}

				
			    public String IPRCST;

				public String getIPRCST () {
					return this.IPRCST;
				}

				public Boolean IPRCSTIsNullable(){
				    return true;
				}
				public Boolean IPRCSTIsKey(){
				    return false;
				}
				public Integer IPRCSTLength(){
				    return null;
				}
				public Integer IPRCSTPrecision(){
				    return null;
				}
				public String IPRCSTDefault(){
				
					return "";
				
				}
				public String IPRCSTComment(){
				
				    return "";
				
				}
				public String IPRCSTPattern(){
				
					return "";
				
				}
				public String IPRCSTOriginalDbColumnName(){
				
					return "IPRCST";
				
				}

				
			    public Double IASNUM;

				public Double getIASNUM () {
					return this.IASNUM;
				}

				public Boolean IASNUMIsNullable(){
				    return true;
				}
				public Boolean IASNUMIsKey(){
				    return false;
				}
				public Integer IASNUMLength(){
				    return null;
				}
				public Integer IASNUMPrecision(){
				    return null;
				}
				public String IASNUMDefault(){
				
					return "";
				
				}
				public String IASNUMComment(){
				
				    return "";
				
				}
				public String IASNUMPattern(){
				
					return "";
				
				}
				public String IASNUMOriginalDbColumnName(){
				
					return "IASNUM";
				
				}

				
			    public String ICORGP;

				public String getICORGP () {
					return this.ICORGP;
				}

				public Boolean ICORGPIsNullable(){
				    return true;
				}
				public Boolean ICORGPIsKey(){
				    return false;
				}
				public Integer ICORGPLength(){
				    return null;
				}
				public Integer ICORGPPrecision(){
				    return null;
				}
				public String ICORGPDefault(){
				
					return "";
				
				}
				public String ICORGPComment(){
				
				    return "";
				
				}
				public String ICORGPPattern(){
				
					return "";
				
				}
				public String ICORGPOriginalDbColumnName(){
				
					return "ICORGP";
				
				}

				
			    public BigDecimal ILEAD;

				public BigDecimal getILEAD () {
					return this.ILEAD;
				}

				public Boolean ILEADIsNullable(){
				    return true;
				}
				public Boolean ILEADIsKey(){
				    return false;
				}
				public Integer ILEADLength(){
				    return null;
				}
				public Integer ILEADPrecision(){
				    return null;
				}
				public String ILEADDefault(){
				
					return "";
				
				}
				public String ILEADComment(){
				
				    return "";
				
				}
				public String ILEADPattern(){
				
					return "";
				
				}
				public String ILEADOriginalDbColumnName(){
				
					return "ILEAD";
				
				}

				
			    public String IHZCOD;

				public String getIHZCOD () {
					return this.IHZCOD;
				}

				public Boolean IHZCODIsNullable(){
				    return true;
				}
				public Boolean IHZCODIsKey(){
				    return false;
				}
				public Integer IHZCODLength(){
				    return null;
				}
				public Integer IHZCODPrecision(){
				    return null;
				}
				public String IHZCODDefault(){
				
					return "";
				
				}
				public String IHZCODComment(){
				
				    return "";
				
				}
				public String IHZCODPattern(){
				
					return "";
				
				}
				public String IHZCODOriginalDbColumnName(){
				
					return "IHZCOD";
				
				}

				
			    public String IFRACT;

				public String getIFRACT () {
					return this.IFRACT;
				}

				public Boolean IFRACTIsNullable(){
				    return true;
				}
				public Boolean IFRACTIsKey(){
				    return false;
				}
				public Integer IFRACTLength(){
				    return null;
				}
				public Integer IFRACTPrecision(){
				    return null;
				}
				public String IFRACTDefault(){
				
					return "";
				
				}
				public String IFRACTComment(){
				
				    return "";
				
				}
				public String IFRACTPattern(){
				
					return "";
				
				}
				public String IFRACTOriginalDbColumnName(){
				
					return "IFRACT";
				
				}

				
			    public java.util.Date LOAD_DATE;

				public java.util.Date getLOAD_DATE () {
					return this.LOAD_DATE;
				}

				public Boolean LOAD_DATEIsNullable(){
				    return true;
				}
				public Boolean LOAD_DATEIsKey(){
				    return false;
				}
				public Integer LOAD_DATELength(){
				    return null;
				}
				public Integer LOAD_DATEPrecision(){
				    return null;
				}
				public String LOAD_DATEDefault(){
				
					return "";
				
				}
				public String LOAD_DATEComment(){
				
				    return "";
				
				}
				public String LOAD_DATEPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String LOAD_DATEOriginalDbColumnName(){
				
					return "LOAD_DATE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
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
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
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

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ICHECK = null;
           				} else {
           			    	this.ICHECK = dis.readDouble();
           				}
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ASNUM = null;
           				} else {
           			    	this.ASNUM = dis.readDouble();
           				}
					
					this.IVNDPN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IMFGR = null;
           				} else {
           			    	this.IMFGR = dis.readDouble();
           				}
					
					this.IMFGNO = readString(dis);
					
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
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ISCOLR = null;
           				} else {
           			    	this.ISCOLR = dis.readDouble();
           				}
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SHPNUM = null;
           				} else {
           			    	this.SHPNUM = dis.readDouble();
           				}
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IIGNUM = null;
           				} else {
           			    	this.IIGNUM = dis.readDouble();
           				}
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IPLAN = null;
           				} else {
           			    	this.IPLAN = dis.readDouble();
           				}
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IASNUM = null;
           				} else {
           			    	this.IASNUM = dis.readDouble();
           				}
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ICHECK = null;
           				} else {
           			    	this.ICHECK = dis.readDouble();
           				}
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ASNUM = null;
           				} else {
           			    	this.ASNUM = dis.readDouble();
           				}
					
					this.IVNDPN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IMFGR = null;
           				} else {
           			    	this.IMFGR = dis.readDouble();
           				}
					
					this.IMFGNO = readString(dis);
					
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
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ISCOLR = null;
           				} else {
           			    	this.ISCOLR = dis.readDouble();
           				}
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SHPNUM = null;
           				} else {
           			    	this.SHPNUM = dis.readDouble();
           				}
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IIGNUM = null;
           				} else {
           			    	this.IIGNUM = dis.readDouble();
           				}
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IPLAN = null;
           				} else {
           			    	this.IPLAN = dis.readDouble();
           				}
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IASNUM = null;
           				} else {
           			    	this.IASNUM = dis.readDouble();
           				}
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// Double
				
						if(this.ICHECK == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICHECK);
		            	}
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// Double
				
						if(this.ASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ASNUM);
		            	}
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// Double
				
						if(this.IMFGR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IMFGR);
		            	}
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// Double
				
						if(this.IDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IDEPT);
		            	}
					
					// Double
				
						if(this.ISDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISDEPT);
		            	}
					
					// Double
				
						if(this.ICLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICLAS);
		            	}
					
					// Double
				
						if(this.ISCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCLAS);
		            	}
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// Double
				
						if(this.ISCOLR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCOLR);
		            	}
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// Double
				
						if(this.SHPNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.SHPNUM);
		            	}
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// Double
				
						if(this.IIGNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IIGNUM);
		            	}
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// Double
				
						if(this.IPLAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IPLAN);
		            	}
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// Double
				
						if(this.IASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IASNUM);
		            	}
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// Double
				
						if(this.ICHECK == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICHECK);
		            	}
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// Double
				
						if(this.ASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ASNUM);
		            	}
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// Double
				
						if(this.IMFGR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IMFGR);
		            	}
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// Double
				
						if(this.IDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IDEPT);
		            	}
					
					// Double
				
						if(this.ISDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISDEPT);
		            	}
					
					// Double
				
						if(this.ICLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICLAS);
		            	}
					
					// Double
				
						if(this.ISCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCLAS);
		            	}
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// Double
				
						if(this.ISCOLR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCOLR);
		            	}
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// Double
				
						if(this.SHPNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.SHPNUM);
		            	}
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// Double
				
						if(this.IIGNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IIGNUM);
		            	}
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// Double
				
						if(this.IPLAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IPLAN);
		            	}
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// Double
				
						if(this.IASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IASNUM);
		            	}
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",ICHECK="+String.valueOf(ICHECK));
		sb.append(",IDESCR="+IDESCR);
		sb.append(",IDSCCD="+IDSCCD);
		sb.append(",ISORT="+ISORT);
		sb.append(",ISTYLN="+ISTYLN);
		sb.append(",ASNUM="+String.valueOf(ASNUM));
		sb.append(",IVNDPN="+IVNDPN);
		sb.append(",IMFGR="+String.valueOf(IMFGR));
		sb.append(",IMFGNO="+IMFGNO);
		sb.append(",IDEPT="+String.valueOf(IDEPT));
		sb.append(",ISDEPT="+String.valueOf(ISDEPT));
		sb.append(",ICLAS="+String.valueOf(ICLAS));
		sb.append(",ISCLAS="+String.valueOf(ISCLAS));
		sb.append(",BYRNUM="+BYRNUM);
		sb.append(",IASPAC="+String.valueOf(IASPAC));
		sb.append(",IADVYN="+IADVYN);
		sb.append(",IBUYCD="+IBUYCD);
		sb.append(",ISET="+ISET);
		sb.append(",IWARNT="+IWARNT);
		sb.append(",IPRMPT="+IPRMPT);
		sb.append(",IPRVNT="+IPRVNT);
		sb.append(",ITKTTR="+ITKTTR);
		sb.append(",ITKTTA="+ITKTTA);
		sb.append(",ITKTN="+String.valueOf(ITKTN));
		sb.append(",ILBLTR="+ILBLTR);
		sb.append(",ILBLTA="+ILBLTA);
		sb.append(",IFINLN="+IFINLN);
		sb.append(",IPROFL="+IPROFL);
		sb.append(",IMODUL="+IMODUL);
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ISCOLR="+String.valueOf(ISCOLR));
		sb.append(",ISSIZE="+ISSIZE);
		sb.append(",IHAZCD="+IHAZCD);
		sb.append(",MCHNUM="+MCHNUM);
		sb.append(",ISUBST="+String.valueOf(ISUBST));
		sb.append(",ICORE="+String.valueOf(ICORE));
		sb.append(",IREPL="+String.valueOf(IREPL));
		sb.append(",ISLUM="+ISLUM);
		sb.append(",IUMCV2="+String.valueOf(IUMCV2));
		sb.append(",IBYUM="+IBYUM);
		sb.append(",IMINPK="+String.valueOf(IMINPK));
		sb.append(",ISTDPK="+String.valueOf(ISTDPK));
		sb.append(",IHLDOR="+IHLDOR);
		sb.append(",IMOQTY="+String.valueOf(IMOQTY));
		sb.append(",IMNSTK="+String.valueOf(IMNSTK));
		sb.append(",IMXSTK="+String.valueOf(IMXSTK));
		sb.append(",IMDSTK="+String.valueOf(IMDSTK));
		sb.append(",IDSPLY="+String.valueOf(IDSPLY));
		sb.append(",IOMULT="+String.valueOf(IOMULT));
		sb.append(",IRPLCD="+IRPLCD);
		sb.append(",IMFPRC="+String.valueOf(IMFPRC));
		sb.append(",IWGHT="+String.valueOf(IWGHT));
		sb.append(",ICUBE="+String.valueOf(ICUBE));
		sb.append(",IDLGTH="+String.valueOf(IDLGTH));
		sb.append(",IDWDTH="+String.valueOf(IDWDTH));
		sb.append(",IDHGHT="+String.valueOf(IDHGHT));
		sb.append(",IMDATE="+String.valueOf(IMDATE));
		sb.append(",IMCENT="+String.valueOf(IMCENT));
		sb.append(",IVPLTI="+String.valueOf(IVPLTI));
		sb.append(",IVPLHI="+String.valueOf(IVPLHI));
		sb.append(",SHPNUM="+String.valueOf(SHPNUM));
		sb.append(",IDISTM="+IDISTM);
		sb.append(",IHLDWO="+IHLDWO);
		sb.append(",IIGNUM="+String.valueOf(IIGNUM));
		sb.append(",ISDIM="+ISDIM);
		sb.append(",IVATCD="+IVATCD);
		sb.append(",IPLAN="+String.valueOf(IPLAN));
		sb.append(",IVLRK1="+IVLRK1);
		sb.append(",IVLRK2="+IVLRK2);
		sb.append(",IVLRK3="+IVLRK3);
		sb.append(",IVLRK4="+IVLRK4);
		sb.append(",IRPLCN="+String.valueOf(IRPLCN));
		sb.append(",IRPLDT="+String.valueOf(IRPLDT));
		sb.append(",ISEASN="+ISEASN);
		sb.append(",IDEADC="+String.valueOf(IDEADC));
		sb.append(",IDEADD="+String.valueOf(IDEADD));
		sb.append(",INLRTL="+String.valueOf(INLRTL));
		sb.append(",IHANDL="+IHANDL);
		sb.append(",IATRB1="+IATRB1);
		sb.append(",IATRB2="+IATRB2);
		sb.append(",IATRB3="+IATRB3);
		sb.append(",IATRB4="+IATRB4);
		sb.append(",IATRB5="+IATRB5);
		sb.append(",IPRCCH="+IPRCCH);
		sb.append(",IPRCZN="+IPRCZN);
		sb.append(",IPRCST="+IPRCST);
		sb.append(",IASNUM="+String.valueOf(IASNUM));
		sb.append(",ICORGP="+ICORGP);
		sb.append(",ILEAD="+String.valueOf(ILEAD));
		sb.append(",IHZCOD="+IHZCOD);
		sb.append(",IFRACT="+IFRACT);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				if(ICHECK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICHECK);
            			}
            		
        			sb.append("|");
        		
        				if(IDESCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDESCR);
            			}
            		
        			sb.append("|");
        		
        				if(IDSCCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSCCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISORT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISORT);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYLN);
            			}
            		
        			sb.append("|");
        		
        				if(ASNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ASNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IVNDPN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVNDPN);
            			}
            		
        			sb.append("|");
        		
        				if(IMFGR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFGR);
            			}
            		
        			sb.append("|");
        		
        				if(IMFGNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFGNO);
            			}
            		
        			sb.append("|");
        		
        				if(IDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(ISDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(ICLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICLAS);
            			}
            		
        			sb.append("|");
        		
        				if(ISCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(BYRNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BYRNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IASPAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IASPAC);
            			}
            		
        			sb.append("|");
        		
        				if(IADVYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IADVYN);
            			}
            		
        			sb.append("|");
        		
        				if(IBUYCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBUYCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISET);
            			}
            		
        			sb.append("|");
        		
        				if(IWARNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWARNT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRMPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRMPT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRVNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRVNT);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTR);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTA);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTN);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTR);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTA);
            			}
            		
        			sb.append("|");
        		
        				if(IFINLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFINLN);
            			}
            		
        			sb.append("|");
        		
        				if(IPROFL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPROFL);
            			}
            		
        			sb.append("|");
        		
        				if(IMODUL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMODUL);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ISCOLR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISCOLR);
            			}
            		
        			sb.append("|");
        		
        				if(ISSIZE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISSIZE);
            			}
            		
        			sb.append("|");
        		
        				if(IHAZCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHAZCD);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ISUBST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISUBST);
            			}
            		
        			sb.append("|");
        		
        				if(ICORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORE);
            			}
            		
        			sb.append("|");
        		
        				if(IREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IREPL);
            			}
            		
        			sb.append("|");
        		
        				if(ISLUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISLUM);
            			}
            		
        			sb.append("|");
        		
        				if(IUMCV2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IUMCV2);
            			}
            		
        			sb.append("|");
        		
        				if(IBYUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBYUM);
            			}
            		
        			sb.append("|");
        		
        				if(IMINPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMINPK);
            			}
            		
        			sb.append("|");
        		
        				if(ISTDPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTDPK);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDOR);
            			}
            		
        			sb.append("|");
        		
        				if(IMOQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMOQTY);
            			}
            		
        			sb.append("|");
        		
        				if(IMNSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMNSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMXSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMXSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMDSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IDSPLY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSPLY);
            			}
            		
        			sb.append("|");
        		
        				if(IOMULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IOMULT);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCD);
            			}
            		
        			sb.append("|");
        		
        				if(IMFPRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFPRC);
            			}
            		
        			sb.append("|");
        		
        				if(IWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(ICUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICUBE);
            			}
            		
        			sb.append("|");
        		
        				if(IDLGTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDLGTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDWDTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDWDTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDHGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDHGHT);
            			}
            		
        			sb.append("|");
        		
        				if(IMDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDATE);
            			}
            		
        			sb.append("|");
        		
        				if(IMCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMCENT);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLTI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLTI);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLHI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLHI);
            			}
            		
        			sb.append("|");
        		
        				if(SHPNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHPNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IDISTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDISTM);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDWO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDWO);
            			}
            		
        			sb.append("|");
        		
        				if(IIGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IIGNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ISDIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISDIM);
            			}
            		
        			sb.append("|");
        		
        				if(IVATCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVATCD);
            			}
            		
        			sb.append("|");
        		
        				if(IPLAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPLAN);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK1);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK2);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK3);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK4);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCN);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLDT);
            			}
            		
        			sb.append("|");
        		
        				if(ISEASN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISEASN);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADC);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADD);
            			}
            		
        			sb.append("|");
        		
        				if(INLRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INLRTL);
            			}
            		
        			sb.append("|");
        		
        				if(IHANDL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHANDL);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB1);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB2);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB3);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB4);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB5);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCCH);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCZN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCZN);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCST);
            			}
            		
        			sb.append("|");
        		
        				if(IASNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IASNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ICORGP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORGP);
            			}
            		
        			sb.append("|");
        		
        				if(ILEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IHZCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHZCOD);
            			}
            		
        			sb.append("|");
        		
        				if(IFRACT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFRACT);
            			}
            		
        			sb.append("|");
        		
        				if(LOAD_DATE == null){
        					sb.append("<null>");
        				}else{
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

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public BigDecimal INUMBR;

				public BigDecimal getINUMBR () {
					return this.INUMBR;
				}

				public Boolean INUMBRIsNullable(){
				    return true;
				}
				public Boolean INUMBRIsKey(){
				    return false;
				}
				public Integer INUMBRLength(){
				    return null;
				}
				public Integer INUMBRPrecision(){
				    return null;
				}
				public String INUMBRDefault(){
				
					return "";
				
				}
				public String INUMBRComment(){
				
				    return "";
				
				}
				public String INUMBRPattern(){
				
					return "";
				
				}
				public String INUMBROriginalDbColumnName(){
				
					return "INUMBR";
				
				}

				
			    public Double ICHECK;

				public Double getICHECK () {
					return this.ICHECK;
				}

				public Boolean ICHECKIsNullable(){
				    return true;
				}
				public Boolean ICHECKIsKey(){
				    return false;
				}
				public Integer ICHECKLength(){
				    return null;
				}
				public Integer ICHECKPrecision(){
				    return null;
				}
				public String ICHECKDefault(){
				
					return "";
				
				}
				public String ICHECKComment(){
				
				    return "";
				
				}
				public String ICHECKPattern(){
				
					return "";
				
				}
				public String ICHECKOriginalDbColumnName(){
				
					return "ICHECK";
				
				}

				
			    public String IDESCR;

				public String getIDESCR () {
					return this.IDESCR;
				}

				public Boolean IDESCRIsNullable(){
				    return true;
				}
				public Boolean IDESCRIsKey(){
				    return false;
				}
				public Integer IDESCRLength(){
				    return null;
				}
				public Integer IDESCRPrecision(){
				    return null;
				}
				public String IDESCRDefault(){
				
					return null;
				
				}
				public String IDESCRComment(){
				
				    return "";
				
				}
				public String IDESCRPattern(){
				
					return "";
				
				}
				public String IDESCROriginalDbColumnName(){
				
					return "IDESCR";
				
				}

				
			    public String IDSCCD;

				public String getIDSCCD () {
					return this.IDSCCD;
				}

				public Boolean IDSCCDIsNullable(){
				    return true;
				}
				public Boolean IDSCCDIsKey(){
				    return false;
				}
				public Integer IDSCCDLength(){
				    return null;
				}
				public Integer IDSCCDPrecision(){
				    return null;
				}
				public String IDSCCDDefault(){
				
					return null;
				
				}
				public String IDSCCDComment(){
				
				    return "";
				
				}
				public String IDSCCDPattern(){
				
					return "";
				
				}
				public String IDSCCDOriginalDbColumnName(){
				
					return "IDSCCD";
				
				}

				
			    public String ISORT;

				public String getISORT () {
					return this.ISORT;
				}

				public Boolean ISORTIsNullable(){
				    return true;
				}
				public Boolean ISORTIsKey(){
				    return false;
				}
				public Integer ISORTLength(){
				    return null;
				}
				public Integer ISORTPrecision(){
				    return null;
				}
				public String ISORTDefault(){
				
					return null;
				
				}
				public String ISORTComment(){
				
				    return "";
				
				}
				public String ISORTPattern(){
				
					return "";
				
				}
				public String ISORTOriginalDbColumnName(){
				
					return "ISORT";
				
				}

				
			    public String ISTYLN;

				public String getISTYLN () {
					return this.ISTYLN;
				}

				public Boolean ISTYLNIsNullable(){
				    return true;
				}
				public Boolean ISTYLNIsKey(){
				    return false;
				}
				public Integer ISTYLNLength(){
				    return null;
				}
				public Integer ISTYLNPrecision(){
				    return null;
				}
				public String ISTYLNDefault(){
				
					return null;
				
				}
				public String ISTYLNComment(){
				
				    return "";
				
				}
				public String ISTYLNPattern(){
				
					return "";
				
				}
				public String ISTYLNOriginalDbColumnName(){
				
					return "ISTYLN";
				
				}

				
			    public Double ASNUM;

				public Double getASNUM () {
					return this.ASNUM;
				}

				public Boolean ASNUMIsNullable(){
				    return true;
				}
				public Boolean ASNUMIsKey(){
				    return false;
				}
				public Integer ASNUMLength(){
				    return null;
				}
				public Integer ASNUMPrecision(){
				    return null;
				}
				public String ASNUMDefault(){
				
					return "";
				
				}
				public String ASNUMComment(){
				
				    return "";
				
				}
				public String ASNUMPattern(){
				
					return "";
				
				}
				public String ASNUMOriginalDbColumnName(){
				
					return "ASNUM";
				
				}

				
			    public String IVNDPN;

				public String getIVNDPN () {
					return this.IVNDPN;
				}

				public Boolean IVNDPNIsNullable(){
				    return true;
				}
				public Boolean IVNDPNIsKey(){
				    return false;
				}
				public Integer IVNDPNLength(){
				    return null;
				}
				public Integer IVNDPNPrecision(){
				    return null;
				}
				public String IVNDPNDefault(){
				
					return null;
				
				}
				public String IVNDPNComment(){
				
				    return "";
				
				}
				public String IVNDPNPattern(){
				
					return "";
				
				}
				public String IVNDPNOriginalDbColumnName(){
				
					return "IVNDPN";
				
				}

				
			    public Double IMFGR;

				public Double getIMFGR () {
					return this.IMFGR;
				}

				public Boolean IMFGRIsNullable(){
				    return true;
				}
				public Boolean IMFGRIsKey(){
				    return false;
				}
				public Integer IMFGRLength(){
				    return null;
				}
				public Integer IMFGRPrecision(){
				    return null;
				}
				public String IMFGRDefault(){
				
					return "";
				
				}
				public String IMFGRComment(){
				
				    return "";
				
				}
				public String IMFGRPattern(){
				
					return "";
				
				}
				public String IMFGROriginalDbColumnName(){
				
					return "IMFGR";
				
				}

				
			    public String IMFGNO;

				public String getIMFGNO () {
					return this.IMFGNO;
				}

				public Boolean IMFGNOIsNullable(){
				    return true;
				}
				public Boolean IMFGNOIsKey(){
				    return false;
				}
				public Integer IMFGNOLength(){
				    return null;
				}
				public Integer IMFGNOPrecision(){
				    return null;
				}
				public String IMFGNODefault(){
				
					return null;
				
				}
				public String IMFGNOComment(){
				
				    return "";
				
				}
				public String IMFGNOPattern(){
				
					return "";
				
				}
				public String IMFGNOOriginalDbColumnName(){
				
					return "IMFGNO";
				
				}

				
			    public Double IDEPT;

				public Double getIDEPT () {
					return this.IDEPT;
				}

				public Boolean IDEPTIsNullable(){
				    return true;
				}
				public Boolean IDEPTIsKey(){
				    return false;
				}
				public Integer IDEPTLength(){
				    return null;
				}
				public Integer IDEPTPrecision(){
				    return null;
				}
				public String IDEPTDefault(){
				
					return "";
				
				}
				public String IDEPTComment(){
				
				    return "";
				
				}
				public String IDEPTPattern(){
				
					return "";
				
				}
				public String IDEPTOriginalDbColumnName(){
				
					return "IDEPT";
				
				}

				
			    public Double ISDEPT;

				public Double getISDEPT () {
					return this.ISDEPT;
				}

				public Boolean ISDEPTIsNullable(){
				    return true;
				}
				public Boolean ISDEPTIsKey(){
				    return false;
				}
				public Integer ISDEPTLength(){
				    return null;
				}
				public Integer ISDEPTPrecision(){
				    return null;
				}
				public String ISDEPTDefault(){
				
					return "";
				
				}
				public String ISDEPTComment(){
				
				    return "";
				
				}
				public String ISDEPTPattern(){
				
					return "";
				
				}
				public String ISDEPTOriginalDbColumnName(){
				
					return "ISDEPT";
				
				}

				
			    public Double ICLAS;

				public Double getICLAS () {
					return this.ICLAS;
				}

				public Boolean ICLASIsNullable(){
				    return true;
				}
				public Boolean ICLASIsKey(){
				    return false;
				}
				public Integer ICLASLength(){
				    return null;
				}
				public Integer ICLASPrecision(){
				    return null;
				}
				public String ICLASDefault(){
				
					return "";
				
				}
				public String ICLASComment(){
				
				    return "";
				
				}
				public String ICLASPattern(){
				
					return "";
				
				}
				public String ICLASOriginalDbColumnName(){
				
					return "ICLAS";
				
				}

				
			    public Double ISCLAS;

				public Double getISCLAS () {
					return this.ISCLAS;
				}

				public Boolean ISCLASIsNullable(){
				    return true;
				}
				public Boolean ISCLASIsKey(){
				    return false;
				}
				public Integer ISCLASLength(){
				    return null;
				}
				public Integer ISCLASPrecision(){
				    return null;
				}
				public String ISCLASDefault(){
				
					return "";
				
				}
				public String ISCLASComment(){
				
				    return "";
				
				}
				public String ISCLASPattern(){
				
					return "";
				
				}
				public String ISCLASOriginalDbColumnName(){
				
					return "ISCLAS";
				
				}

				
			    public String BYRNUM;

				public String getBYRNUM () {
					return this.BYRNUM;
				}

				public Boolean BYRNUMIsNullable(){
				    return true;
				}
				public Boolean BYRNUMIsKey(){
				    return false;
				}
				public Integer BYRNUMLength(){
				    return null;
				}
				public Integer BYRNUMPrecision(){
				    return null;
				}
				public String BYRNUMDefault(){
				
					return "";
				
				}
				public String BYRNUMComment(){
				
				    return "";
				
				}
				public String BYRNUMPattern(){
				
					return "";
				
				}
				public String BYRNUMOriginalDbColumnName(){
				
					return "BYRNUM";
				
				}

				
			    public BigDecimal IASPAC;

				public BigDecimal getIASPAC () {
					return this.IASPAC;
				}

				public Boolean IASPACIsNullable(){
				    return true;
				}
				public Boolean IASPACIsKey(){
				    return false;
				}
				public Integer IASPACLength(){
				    return null;
				}
				public Integer IASPACPrecision(){
				    return null;
				}
				public String IASPACDefault(){
				
					return "";
				
				}
				public String IASPACComment(){
				
				    return "";
				
				}
				public String IASPACPattern(){
				
					return "";
				
				}
				public String IASPACOriginalDbColumnName(){
				
					return "IASPAC";
				
				}

				
			    public String IADVYN;

				public String getIADVYN () {
					return this.IADVYN;
				}

				public Boolean IADVYNIsNullable(){
				    return true;
				}
				public Boolean IADVYNIsKey(){
				    return false;
				}
				public Integer IADVYNLength(){
				    return null;
				}
				public Integer IADVYNPrecision(){
				    return null;
				}
				public String IADVYNDefault(){
				
					return "";
				
				}
				public String IADVYNComment(){
				
				    return "";
				
				}
				public String IADVYNPattern(){
				
					return "";
				
				}
				public String IADVYNOriginalDbColumnName(){
				
					return "IADVYN";
				
				}

				
			    public String IBUYCD;

				public String getIBUYCD () {
					return this.IBUYCD;
				}

				public Boolean IBUYCDIsNullable(){
				    return true;
				}
				public Boolean IBUYCDIsKey(){
				    return false;
				}
				public Integer IBUYCDLength(){
				    return null;
				}
				public Integer IBUYCDPrecision(){
				    return null;
				}
				public String IBUYCDDefault(){
				
					return "";
				
				}
				public String IBUYCDComment(){
				
				    return "";
				
				}
				public String IBUYCDPattern(){
				
					return "";
				
				}
				public String IBUYCDOriginalDbColumnName(){
				
					return "IBUYCD";
				
				}

				
			    public String ISET;

				public String getISET () {
					return this.ISET;
				}

				public Boolean ISETIsNullable(){
				    return true;
				}
				public Boolean ISETIsKey(){
				    return false;
				}
				public Integer ISETLength(){
				    return null;
				}
				public Integer ISETPrecision(){
				    return null;
				}
				public String ISETDefault(){
				
					return "";
				
				}
				public String ISETComment(){
				
				    return "";
				
				}
				public String ISETPattern(){
				
					return "";
				
				}
				public String ISETOriginalDbColumnName(){
				
					return "ISET";
				
				}

				
			    public String IWARNT;

				public String getIWARNT () {
					return this.IWARNT;
				}

				public Boolean IWARNTIsNullable(){
				    return true;
				}
				public Boolean IWARNTIsKey(){
				    return false;
				}
				public Integer IWARNTLength(){
				    return null;
				}
				public Integer IWARNTPrecision(){
				    return null;
				}
				public String IWARNTDefault(){
				
					return "";
				
				}
				public String IWARNTComment(){
				
				    return "";
				
				}
				public String IWARNTPattern(){
				
					return "";
				
				}
				public String IWARNTOriginalDbColumnName(){
				
					return "IWARNT";
				
				}

				
			    public String IPRMPT;

				public String getIPRMPT () {
					return this.IPRMPT;
				}

				public Boolean IPRMPTIsNullable(){
				    return true;
				}
				public Boolean IPRMPTIsKey(){
				    return false;
				}
				public Integer IPRMPTLength(){
				    return null;
				}
				public Integer IPRMPTPrecision(){
				    return null;
				}
				public String IPRMPTDefault(){
				
					return "";
				
				}
				public String IPRMPTComment(){
				
				    return "";
				
				}
				public String IPRMPTPattern(){
				
					return "";
				
				}
				public String IPRMPTOriginalDbColumnName(){
				
					return "IPRMPT";
				
				}

				
			    public String IPRVNT;

				public String getIPRVNT () {
					return this.IPRVNT;
				}

				public Boolean IPRVNTIsNullable(){
				    return true;
				}
				public Boolean IPRVNTIsKey(){
				    return false;
				}
				public Integer IPRVNTLength(){
				    return null;
				}
				public Integer IPRVNTPrecision(){
				    return null;
				}
				public String IPRVNTDefault(){
				
					return "";
				
				}
				public String IPRVNTComment(){
				
				    return "";
				
				}
				public String IPRVNTPattern(){
				
					return "";
				
				}
				public String IPRVNTOriginalDbColumnName(){
				
					return "IPRVNT";
				
				}

				
			    public String ITKTTR;

				public String getITKTTR () {
					return this.ITKTTR;
				}

				public Boolean ITKTTRIsNullable(){
				    return true;
				}
				public Boolean ITKTTRIsKey(){
				    return false;
				}
				public Integer ITKTTRLength(){
				    return null;
				}
				public Integer ITKTTRPrecision(){
				    return null;
				}
				public String ITKTTRDefault(){
				
					return "";
				
				}
				public String ITKTTRComment(){
				
				    return "";
				
				}
				public String ITKTTRPattern(){
				
					return "";
				
				}
				public String ITKTTROriginalDbColumnName(){
				
					return "ITKTTR";
				
				}

				
			    public String ITKTTA;

				public String getITKTTA () {
					return this.ITKTTA;
				}

				public Boolean ITKTTAIsNullable(){
				    return true;
				}
				public Boolean ITKTTAIsKey(){
				    return false;
				}
				public Integer ITKTTALength(){
				    return null;
				}
				public Integer ITKTTAPrecision(){
				    return null;
				}
				public String ITKTTADefault(){
				
					return "";
				
				}
				public String ITKTTAComment(){
				
				    return "";
				
				}
				public String ITKTTAPattern(){
				
					return "";
				
				}
				public String ITKTTAOriginalDbColumnName(){
				
					return "ITKTTA";
				
				}

				
			    public BigDecimal ITKTN;

				public BigDecimal getITKTN () {
					return this.ITKTN;
				}

				public Boolean ITKTNIsNullable(){
				    return true;
				}
				public Boolean ITKTNIsKey(){
				    return false;
				}
				public Integer ITKTNLength(){
				    return null;
				}
				public Integer ITKTNPrecision(){
				    return null;
				}
				public String ITKTNDefault(){
				
					return "";
				
				}
				public String ITKTNComment(){
				
				    return "";
				
				}
				public String ITKTNPattern(){
				
					return "";
				
				}
				public String ITKTNOriginalDbColumnName(){
				
					return "ITKTN";
				
				}

				
			    public String ILBLTR;

				public String getILBLTR () {
					return this.ILBLTR;
				}

				public Boolean ILBLTRIsNullable(){
				    return true;
				}
				public Boolean ILBLTRIsKey(){
				    return false;
				}
				public Integer ILBLTRLength(){
				    return null;
				}
				public Integer ILBLTRPrecision(){
				    return null;
				}
				public String ILBLTRDefault(){
				
					return "";
				
				}
				public String ILBLTRComment(){
				
				    return "";
				
				}
				public String ILBLTRPattern(){
				
					return "";
				
				}
				public String ILBLTROriginalDbColumnName(){
				
					return "ILBLTR";
				
				}

				
			    public String ILBLTA;

				public String getILBLTA () {
					return this.ILBLTA;
				}

				public Boolean ILBLTAIsNullable(){
				    return true;
				}
				public Boolean ILBLTAIsKey(){
				    return false;
				}
				public Integer ILBLTALength(){
				    return null;
				}
				public Integer ILBLTAPrecision(){
				    return null;
				}
				public String ILBLTADefault(){
				
					return "";
				
				}
				public String ILBLTAComment(){
				
				    return "";
				
				}
				public String ILBLTAPattern(){
				
					return "";
				
				}
				public String ILBLTAOriginalDbColumnName(){
				
					return "ILBLTA";
				
				}

				
			    public String IFINLN;

				public String getIFINLN () {
					return this.IFINLN;
				}

				public Boolean IFINLNIsNullable(){
				    return true;
				}
				public Boolean IFINLNIsKey(){
				    return false;
				}
				public Integer IFINLNLength(){
				    return null;
				}
				public Integer IFINLNPrecision(){
				    return null;
				}
				public String IFINLNDefault(){
				
					return "";
				
				}
				public String IFINLNComment(){
				
				    return "";
				
				}
				public String IFINLNPattern(){
				
					return "";
				
				}
				public String IFINLNOriginalDbColumnName(){
				
					return "IFINLN";
				
				}

				
			    public String IPROFL;

				public String getIPROFL () {
					return this.IPROFL;
				}

				public Boolean IPROFLIsNullable(){
				    return true;
				}
				public Boolean IPROFLIsKey(){
				    return false;
				}
				public Integer IPROFLLength(){
				    return null;
				}
				public Integer IPROFLPrecision(){
				    return null;
				}
				public String IPROFLDefault(){
				
					return "";
				
				}
				public String IPROFLComment(){
				
				    return "";
				
				}
				public String IPROFLPattern(){
				
					return "";
				
				}
				public String IPROFLOriginalDbColumnName(){
				
					return "IPROFL";
				
				}

				
			    public String IMODUL;

				public String getIMODUL () {
					return this.IMODUL;
				}

				public Boolean IMODULIsNullable(){
				    return true;
				}
				public Boolean IMODULIsKey(){
				    return false;
				}
				public Integer IMODULLength(){
				    return null;
				}
				public Integer IMODULPrecision(){
				    return null;
				}
				public String IMODULDefault(){
				
					return "";
				
				}
				public String IMODULComment(){
				
				    return "";
				
				}
				public String IMODULPattern(){
				
					return "";
				
				}
				public String IMODULOriginalDbColumnName(){
				
					return "IMODUL";
				
				}

				
			    public String ISTYPE;

				public String getISTYPE () {
					return this.ISTYPE;
				}

				public Boolean ISTYPEIsNullable(){
				    return true;
				}
				public Boolean ISTYPEIsKey(){
				    return false;
				}
				public Integer ISTYPELength(){
				    return null;
				}
				public Integer ISTYPEPrecision(){
				    return null;
				}
				public String ISTYPEDefault(){
				
					return "";
				
				}
				public String ISTYPEComment(){
				
				    return "";
				
				}
				public String ISTYPEPattern(){
				
					return "";
				
				}
				public String ISTYPEOriginalDbColumnName(){
				
					return "ISTYPE";
				
				}

				
			    public Double ISCOLR;

				public Double getISCOLR () {
					return this.ISCOLR;
				}

				public Boolean ISCOLRIsNullable(){
				    return true;
				}
				public Boolean ISCOLRIsKey(){
				    return false;
				}
				public Integer ISCOLRLength(){
				    return null;
				}
				public Integer ISCOLRPrecision(){
				    return null;
				}
				public String ISCOLRDefault(){
				
					return "";
				
				}
				public String ISCOLRComment(){
				
				    return "";
				
				}
				public String ISCOLRPattern(){
				
					return "";
				
				}
				public String ISCOLROriginalDbColumnName(){
				
					return "ISCOLR";
				
				}

				
			    public String ISSIZE;

				public String getISSIZE () {
					return this.ISSIZE;
				}

				public Boolean ISSIZEIsNullable(){
				    return true;
				}
				public Boolean ISSIZEIsKey(){
				    return false;
				}
				public Integer ISSIZELength(){
				    return null;
				}
				public Integer ISSIZEPrecision(){
				    return null;
				}
				public String ISSIZEDefault(){
				
					return "";
				
				}
				public String ISSIZEComment(){
				
				    return "";
				
				}
				public String ISSIZEPattern(){
				
					return "";
				
				}
				public String ISSIZEOriginalDbColumnName(){
				
					return "ISSIZE";
				
				}

				
			    public String IHAZCD;

				public String getIHAZCD () {
					return this.IHAZCD;
				}

				public Boolean IHAZCDIsNullable(){
				    return true;
				}
				public Boolean IHAZCDIsKey(){
				    return false;
				}
				public Integer IHAZCDLength(){
				    return null;
				}
				public Integer IHAZCDPrecision(){
				    return null;
				}
				public String IHAZCDDefault(){
				
					return "";
				
				}
				public String IHAZCDComment(){
				
				    return "";
				
				}
				public String IHAZCDPattern(){
				
					return "";
				
				}
				public String IHAZCDOriginalDbColumnName(){
				
					return "IHAZCD";
				
				}

				
			    public String MCHNUM;

				public String getMCHNUM () {
					return this.MCHNUM;
				}

				public Boolean MCHNUMIsNullable(){
				    return true;
				}
				public Boolean MCHNUMIsKey(){
				    return false;
				}
				public Integer MCHNUMLength(){
				    return null;
				}
				public Integer MCHNUMPrecision(){
				    return null;
				}
				public String MCHNUMDefault(){
				
					return "";
				
				}
				public String MCHNUMComment(){
				
				    return "";
				
				}
				public String MCHNUMPattern(){
				
					return "";
				
				}
				public String MCHNUMOriginalDbColumnName(){
				
					return "MCHNUM";
				
				}

				
			    public BigDecimal ISUBST;

				public BigDecimal getISUBST () {
					return this.ISUBST;
				}

				public Boolean ISUBSTIsNullable(){
				    return true;
				}
				public Boolean ISUBSTIsKey(){
				    return false;
				}
				public Integer ISUBSTLength(){
				    return null;
				}
				public Integer ISUBSTPrecision(){
				    return null;
				}
				public String ISUBSTDefault(){
				
					return "";
				
				}
				public String ISUBSTComment(){
				
				    return "";
				
				}
				public String ISUBSTPattern(){
				
					return "";
				
				}
				public String ISUBSTOriginalDbColumnName(){
				
					return "ISUBST";
				
				}

				
			    public BigDecimal ICORE;

				public BigDecimal getICORE () {
					return this.ICORE;
				}

				public Boolean ICOREIsNullable(){
				    return true;
				}
				public Boolean ICOREIsKey(){
				    return false;
				}
				public Integer ICORELength(){
				    return null;
				}
				public Integer ICOREPrecision(){
				    return null;
				}
				public String ICOREDefault(){
				
					return "";
				
				}
				public String ICOREComment(){
				
				    return "";
				
				}
				public String ICOREPattern(){
				
					return "";
				
				}
				public String ICOREOriginalDbColumnName(){
				
					return "ICORE";
				
				}

				
			    public BigDecimal IREPL;

				public BigDecimal getIREPL () {
					return this.IREPL;
				}

				public Boolean IREPLIsNullable(){
				    return true;
				}
				public Boolean IREPLIsKey(){
				    return false;
				}
				public Integer IREPLLength(){
				    return null;
				}
				public Integer IREPLPrecision(){
				    return null;
				}
				public String IREPLDefault(){
				
					return "";
				
				}
				public String IREPLComment(){
				
				    return "";
				
				}
				public String IREPLPattern(){
				
					return "";
				
				}
				public String IREPLOriginalDbColumnName(){
				
					return "IREPL";
				
				}

				
			    public String ISLUM;

				public String getISLUM () {
					return this.ISLUM;
				}

				public Boolean ISLUMIsNullable(){
				    return true;
				}
				public Boolean ISLUMIsKey(){
				    return false;
				}
				public Integer ISLUMLength(){
				    return null;
				}
				public Integer ISLUMPrecision(){
				    return null;
				}
				public String ISLUMDefault(){
				
					return "";
				
				}
				public String ISLUMComment(){
				
				    return "";
				
				}
				public String ISLUMPattern(){
				
					return "";
				
				}
				public String ISLUMOriginalDbColumnName(){
				
					return "ISLUM";
				
				}

				
			    public BigDecimal IUMCV2;

				public BigDecimal getIUMCV2 () {
					return this.IUMCV2;
				}

				public Boolean IUMCV2IsNullable(){
				    return true;
				}
				public Boolean IUMCV2IsKey(){
				    return false;
				}
				public Integer IUMCV2Length(){
				    return null;
				}
				public Integer IUMCV2Precision(){
				    return null;
				}
				public String IUMCV2Default(){
				
					return "";
				
				}
				public String IUMCV2Comment(){
				
				    return "";
				
				}
				public String IUMCV2Pattern(){
				
					return "";
				
				}
				public String IUMCV2OriginalDbColumnName(){
				
					return "IUMCV2";
				
				}

				
			    public String IBYUM;

				public String getIBYUM () {
					return this.IBYUM;
				}

				public Boolean IBYUMIsNullable(){
				    return true;
				}
				public Boolean IBYUMIsKey(){
				    return false;
				}
				public Integer IBYUMLength(){
				    return null;
				}
				public Integer IBYUMPrecision(){
				    return null;
				}
				public String IBYUMDefault(){
				
					return "";
				
				}
				public String IBYUMComment(){
				
				    return "";
				
				}
				public String IBYUMPattern(){
				
					return "";
				
				}
				public String IBYUMOriginalDbColumnName(){
				
					return "IBYUM";
				
				}

				
			    public BigDecimal IMINPK;

				public BigDecimal getIMINPK () {
					return this.IMINPK;
				}

				public Boolean IMINPKIsNullable(){
				    return true;
				}
				public Boolean IMINPKIsKey(){
				    return false;
				}
				public Integer IMINPKLength(){
				    return null;
				}
				public Integer IMINPKPrecision(){
				    return null;
				}
				public String IMINPKDefault(){
				
					return "";
				
				}
				public String IMINPKComment(){
				
				    return "";
				
				}
				public String IMINPKPattern(){
				
					return "";
				
				}
				public String IMINPKOriginalDbColumnName(){
				
					return "IMINPK";
				
				}

				
			    public BigDecimal ISTDPK;

				public BigDecimal getISTDPK () {
					return this.ISTDPK;
				}

				public Boolean ISTDPKIsNullable(){
				    return true;
				}
				public Boolean ISTDPKIsKey(){
				    return false;
				}
				public Integer ISTDPKLength(){
				    return null;
				}
				public Integer ISTDPKPrecision(){
				    return null;
				}
				public String ISTDPKDefault(){
				
					return "";
				
				}
				public String ISTDPKComment(){
				
				    return "";
				
				}
				public String ISTDPKPattern(){
				
					return "";
				
				}
				public String ISTDPKOriginalDbColumnName(){
				
					return "ISTDPK";
				
				}

				
			    public String IHLDOR;

				public String getIHLDOR () {
					return this.IHLDOR;
				}

				public Boolean IHLDORIsNullable(){
				    return true;
				}
				public Boolean IHLDORIsKey(){
				    return false;
				}
				public Integer IHLDORLength(){
				    return null;
				}
				public Integer IHLDORPrecision(){
				    return null;
				}
				public String IHLDORDefault(){
				
					return "";
				
				}
				public String IHLDORComment(){
				
				    return "";
				
				}
				public String IHLDORPattern(){
				
					return "";
				
				}
				public String IHLDOROriginalDbColumnName(){
				
					return "IHLDOR";
				
				}

				
			    public BigDecimal IMOQTY;

				public BigDecimal getIMOQTY () {
					return this.IMOQTY;
				}

				public Boolean IMOQTYIsNullable(){
				    return true;
				}
				public Boolean IMOQTYIsKey(){
				    return false;
				}
				public Integer IMOQTYLength(){
				    return null;
				}
				public Integer IMOQTYPrecision(){
				    return null;
				}
				public String IMOQTYDefault(){
				
					return "";
				
				}
				public String IMOQTYComment(){
				
				    return "";
				
				}
				public String IMOQTYPattern(){
				
					return "";
				
				}
				public String IMOQTYOriginalDbColumnName(){
				
					return "IMOQTY";
				
				}

				
			    public BigDecimal IMNSTK;

				public BigDecimal getIMNSTK () {
					return this.IMNSTK;
				}

				public Boolean IMNSTKIsNullable(){
				    return true;
				}
				public Boolean IMNSTKIsKey(){
				    return false;
				}
				public Integer IMNSTKLength(){
				    return null;
				}
				public Integer IMNSTKPrecision(){
				    return null;
				}
				public String IMNSTKDefault(){
				
					return "";
				
				}
				public String IMNSTKComment(){
				
				    return "";
				
				}
				public String IMNSTKPattern(){
				
					return "";
				
				}
				public String IMNSTKOriginalDbColumnName(){
				
					return "IMNSTK";
				
				}

				
			    public BigDecimal IMXSTK;

				public BigDecimal getIMXSTK () {
					return this.IMXSTK;
				}

				public Boolean IMXSTKIsNullable(){
				    return true;
				}
				public Boolean IMXSTKIsKey(){
				    return false;
				}
				public Integer IMXSTKLength(){
				    return null;
				}
				public Integer IMXSTKPrecision(){
				    return null;
				}
				public String IMXSTKDefault(){
				
					return "";
				
				}
				public String IMXSTKComment(){
				
				    return "";
				
				}
				public String IMXSTKPattern(){
				
					return "";
				
				}
				public String IMXSTKOriginalDbColumnName(){
				
					return "IMXSTK";
				
				}

				
			    public BigDecimal IMDSTK;

				public BigDecimal getIMDSTK () {
					return this.IMDSTK;
				}

				public Boolean IMDSTKIsNullable(){
				    return true;
				}
				public Boolean IMDSTKIsKey(){
				    return false;
				}
				public Integer IMDSTKLength(){
				    return null;
				}
				public Integer IMDSTKPrecision(){
				    return null;
				}
				public String IMDSTKDefault(){
				
					return "";
				
				}
				public String IMDSTKComment(){
				
				    return "";
				
				}
				public String IMDSTKPattern(){
				
					return "";
				
				}
				public String IMDSTKOriginalDbColumnName(){
				
					return "IMDSTK";
				
				}

				
			    public BigDecimal IDSPLY;

				public BigDecimal getIDSPLY () {
					return this.IDSPLY;
				}

				public Boolean IDSPLYIsNullable(){
				    return true;
				}
				public Boolean IDSPLYIsKey(){
				    return false;
				}
				public Integer IDSPLYLength(){
				    return null;
				}
				public Integer IDSPLYPrecision(){
				    return null;
				}
				public String IDSPLYDefault(){
				
					return "";
				
				}
				public String IDSPLYComment(){
				
				    return "";
				
				}
				public String IDSPLYPattern(){
				
					return "";
				
				}
				public String IDSPLYOriginalDbColumnName(){
				
					return "IDSPLY";
				
				}

				
			    public BigDecimal IOMULT;

				public BigDecimal getIOMULT () {
					return this.IOMULT;
				}

				public Boolean IOMULTIsNullable(){
				    return true;
				}
				public Boolean IOMULTIsKey(){
				    return false;
				}
				public Integer IOMULTLength(){
				    return null;
				}
				public Integer IOMULTPrecision(){
				    return null;
				}
				public String IOMULTDefault(){
				
					return "";
				
				}
				public String IOMULTComment(){
				
				    return "";
				
				}
				public String IOMULTPattern(){
				
					return "";
				
				}
				public String IOMULTOriginalDbColumnName(){
				
					return "IOMULT";
				
				}

				
			    public String IRPLCD;

				public String getIRPLCD () {
					return this.IRPLCD;
				}

				public Boolean IRPLCDIsNullable(){
				    return true;
				}
				public Boolean IRPLCDIsKey(){
				    return false;
				}
				public Integer IRPLCDLength(){
				    return null;
				}
				public Integer IRPLCDPrecision(){
				    return null;
				}
				public String IRPLCDDefault(){
				
					return "";
				
				}
				public String IRPLCDComment(){
				
				    return "";
				
				}
				public String IRPLCDPattern(){
				
					return "";
				
				}
				public String IRPLCDOriginalDbColumnName(){
				
					return "IRPLCD";
				
				}

				
			    public BigDecimal IMFPRC;

				public BigDecimal getIMFPRC () {
					return this.IMFPRC;
				}

				public Boolean IMFPRCIsNullable(){
				    return true;
				}
				public Boolean IMFPRCIsKey(){
				    return false;
				}
				public Integer IMFPRCLength(){
				    return null;
				}
				public Integer IMFPRCPrecision(){
				    return null;
				}
				public String IMFPRCDefault(){
				
					return "";
				
				}
				public String IMFPRCComment(){
				
				    return "";
				
				}
				public String IMFPRCPattern(){
				
					return "";
				
				}
				public String IMFPRCOriginalDbColumnName(){
				
					return "IMFPRC";
				
				}

				
			    public BigDecimal IWGHT;

				public BigDecimal getIWGHT () {
					return this.IWGHT;
				}

				public Boolean IWGHTIsNullable(){
				    return true;
				}
				public Boolean IWGHTIsKey(){
				    return false;
				}
				public Integer IWGHTLength(){
				    return null;
				}
				public Integer IWGHTPrecision(){
				    return null;
				}
				public String IWGHTDefault(){
				
					return "";
				
				}
				public String IWGHTComment(){
				
				    return "";
				
				}
				public String IWGHTPattern(){
				
					return "";
				
				}
				public String IWGHTOriginalDbColumnName(){
				
					return "IWGHT";
				
				}

				
			    public BigDecimal ICUBE;

				public BigDecimal getICUBE () {
					return this.ICUBE;
				}

				public Boolean ICUBEIsNullable(){
				    return true;
				}
				public Boolean ICUBEIsKey(){
				    return false;
				}
				public Integer ICUBELength(){
				    return null;
				}
				public Integer ICUBEPrecision(){
				    return null;
				}
				public String ICUBEDefault(){
				
					return "";
				
				}
				public String ICUBEComment(){
				
				    return "";
				
				}
				public String ICUBEPattern(){
				
					return "";
				
				}
				public String ICUBEOriginalDbColumnName(){
				
					return "ICUBE";
				
				}

				
			    public BigDecimal IDLGTH;

				public BigDecimal getIDLGTH () {
					return this.IDLGTH;
				}

				public Boolean IDLGTHIsNullable(){
				    return true;
				}
				public Boolean IDLGTHIsKey(){
				    return false;
				}
				public Integer IDLGTHLength(){
				    return null;
				}
				public Integer IDLGTHPrecision(){
				    return null;
				}
				public String IDLGTHDefault(){
				
					return "";
				
				}
				public String IDLGTHComment(){
				
				    return "";
				
				}
				public String IDLGTHPattern(){
				
					return "";
				
				}
				public String IDLGTHOriginalDbColumnName(){
				
					return "IDLGTH";
				
				}

				
			    public BigDecimal IDWDTH;

				public BigDecimal getIDWDTH () {
					return this.IDWDTH;
				}

				public Boolean IDWDTHIsNullable(){
				    return true;
				}
				public Boolean IDWDTHIsKey(){
				    return false;
				}
				public Integer IDWDTHLength(){
				    return null;
				}
				public Integer IDWDTHPrecision(){
				    return null;
				}
				public String IDWDTHDefault(){
				
					return "";
				
				}
				public String IDWDTHComment(){
				
				    return "";
				
				}
				public String IDWDTHPattern(){
				
					return "";
				
				}
				public String IDWDTHOriginalDbColumnName(){
				
					return "IDWDTH";
				
				}

				
			    public BigDecimal IDHGHT;

				public BigDecimal getIDHGHT () {
					return this.IDHGHT;
				}

				public Boolean IDHGHTIsNullable(){
				    return true;
				}
				public Boolean IDHGHTIsKey(){
				    return false;
				}
				public Integer IDHGHTLength(){
				    return null;
				}
				public Integer IDHGHTPrecision(){
				    return null;
				}
				public String IDHGHTDefault(){
				
					return "";
				
				}
				public String IDHGHTComment(){
				
				    return "";
				
				}
				public String IDHGHTPattern(){
				
					return "";
				
				}
				public String IDHGHTOriginalDbColumnName(){
				
					return "IDHGHT";
				
				}

				
			    public BigDecimal IMDATE;

				public BigDecimal getIMDATE () {
					return this.IMDATE;
				}

				public Boolean IMDATEIsNullable(){
				    return true;
				}
				public Boolean IMDATEIsKey(){
				    return false;
				}
				public Integer IMDATELength(){
				    return null;
				}
				public Integer IMDATEPrecision(){
				    return null;
				}
				public String IMDATEDefault(){
				
					return "";
				
				}
				public String IMDATEComment(){
				
				    return "";
				
				}
				public String IMDATEPattern(){
				
					return "";
				
				}
				public String IMDATEOriginalDbColumnName(){
				
					return "IMDATE";
				
				}

				
			    public BigDecimal IMCENT;

				public BigDecimal getIMCENT () {
					return this.IMCENT;
				}

				public Boolean IMCENTIsNullable(){
				    return true;
				}
				public Boolean IMCENTIsKey(){
				    return false;
				}
				public Integer IMCENTLength(){
				    return null;
				}
				public Integer IMCENTPrecision(){
				    return null;
				}
				public String IMCENTDefault(){
				
					return "";
				
				}
				public String IMCENTComment(){
				
				    return "";
				
				}
				public String IMCENTPattern(){
				
					return "";
				
				}
				public String IMCENTOriginalDbColumnName(){
				
					return "IMCENT";
				
				}

				
			    public BigDecimal IVPLTI;

				public BigDecimal getIVPLTI () {
					return this.IVPLTI;
				}

				public Boolean IVPLTIIsNullable(){
				    return true;
				}
				public Boolean IVPLTIIsKey(){
				    return false;
				}
				public Integer IVPLTILength(){
				    return null;
				}
				public Integer IVPLTIPrecision(){
				    return null;
				}
				public String IVPLTIDefault(){
				
					return "";
				
				}
				public String IVPLTIComment(){
				
				    return "";
				
				}
				public String IVPLTIPattern(){
				
					return "";
				
				}
				public String IVPLTIOriginalDbColumnName(){
				
					return "IVPLTI";
				
				}

				
			    public BigDecimal IVPLHI;

				public BigDecimal getIVPLHI () {
					return this.IVPLHI;
				}

				public Boolean IVPLHIIsNullable(){
				    return true;
				}
				public Boolean IVPLHIIsKey(){
				    return false;
				}
				public Integer IVPLHILength(){
				    return null;
				}
				public Integer IVPLHIPrecision(){
				    return null;
				}
				public String IVPLHIDefault(){
				
					return "";
				
				}
				public String IVPLHIComment(){
				
				    return "";
				
				}
				public String IVPLHIPattern(){
				
					return "";
				
				}
				public String IVPLHIOriginalDbColumnName(){
				
					return "IVPLHI";
				
				}

				
			    public Double SHPNUM;

				public Double getSHPNUM () {
					return this.SHPNUM;
				}

				public Boolean SHPNUMIsNullable(){
				    return true;
				}
				public Boolean SHPNUMIsKey(){
				    return false;
				}
				public Integer SHPNUMLength(){
				    return null;
				}
				public Integer SHPNUMPrecision(){
				    return null;
				}
				public String SHPNUMDefault(){
				
					return "";
				
				}
				public String SHPNUMComment(){
				
				    return "";
				
				}
				public String SHPNUMPattern(){
				
					return "";
				
				}
				public String SHPNUMOriginalDbColumnName(){
				
					return "SHPNUM";
				
				}

				
			    public String IDISTM;

				public String getIDISTM () {
					return this.IDISTM;
				}

				public Boolean IDISTMIsNullable(){
				    return true;
				}
				public Boolean IDISTMIsKey(){
				    return false;
				}
				public Integer IDISTMLength(){
				    return null;
				}
				public Integer IDISTMPrecision(){
				    return null;
				}
				public String IDISTMDefault(){
				
					return "";
				
				}
				public String IDISTMComment(){
				
				    return "";
				
				}
				public String IDISTMPattern(){
				
					return "";
				
				}
				public String IDISTMOriginalDbColumnName(){
				
					return "IDISTM";
				
				}

				
			    public String IHLDWO;

				public String getIHLDWO () {
					return this.IHLDWO;
				}

				public Boolean IHLDWOIsNullable(){
				    return true;
				}
				public Boolean IHLDWOIsKey(){
				    return false;
				}
				public Integer IHLDWOLength(){
				    return null;
				}
				public Integer IHLDWOPrecision(){
				    return null;
				}
				public String IHLDWODefault(){
				
					return "";
				
				}
				public String IHLDWOComment(){
				
				    return "";
				
				}
				public String IHLDWOPattern(){
				
					return "";
				
				}
				public String IHLDWOOriginalDbColumnName(){
				
					return "IHLDWO";
				
				}

				
			    public Double IIGNUM;

				public Double getIIGNUM () {
					return this.IIGNUM;
				}

				public Boolean IIGNUMIsNullable(){
				    return true;
				}
				public Boolean IIGNUMIsKey(){
				    return false;
				}
				public Integer IIGNUMLength(){
				    return null;
				}
				public Integer IIGNUMPrecision(){
				    return null;
				}
				public String IIGNUMDefault(){
				
					return "";
				
				}
				public String IIGNUMComment(){
				
				    return "";
				
				}
				public String IIGNUMPattern(){
				
					return "";
				
				}
				public String IIGNUMOriginalDbColumnName(){
				
					return "IIGNUM";
				
				}

				
			    public String ISDIM;

				public String getISDIM () {
					return this.ISDIM;
				}

				public Boolean ISDIMIsNullable(){
				    return true;
				}
				public Boolean ISDIMIsKey(){
				    return false;
				}
				public Integer ISDIMLength(){
				    return null;
				}
				public Integer ISDIMPrecision(){
				    return null;
				}
				public String ISDIMDefault(){
				
					return "";
				
				}
				public String ISDIMComment(){
				
				    return "";
				
				}
				public String ISDIMPattern(){
				
					return "";
				
				}
				public String ISDIMOriginalDbColumnName(){
				
					return "ISDIM";
				
				}

				
			    public String IVATCD;

				public String getIVATCD () {
					return this.IVATCD;
				}

				public Boolean IVATCDIsNullable(){
				    return true;
				}
				public Boolean IVATCDIsKey(){
				    return false;
				}
				public Integer IVATCDLength(){
				    return null;
				}
				public Integer IVATCDPrecision(){
				    return null;
				}
				public String IVATCDDefault(){
				
					return "";
				
				}
				public String IVATCDComment(){
				
				    return "";
				
				}
				public String IVATCDPattern(){
				
					return "";
				
				}
				public String IVATCDOriginalDbColumnName(){
				
					return "IVATCD";
				
				}

				
			    public Double IPLAN;

				public Double getIPLAN () {
					return this.IPLAN;
				}

				public Boolean IPLANIsNullable(){
				    return true;
				}
				public Boolean IPLANIsKey(){
				    return false;
				}
				public Integer IPLANLength(){
				    return null;
				}
				public Integer IPLANPrecision(){
				    return null;
				}
				public String IPLANDefault(){
				
					return "";
				
				}
				public String IPLANComment(){
				
				    return "";
				
				}
				public String IPLANPattern(){
				
					return "";
				
				}
				public String IPLANOriginalDbColumnName(){
				
					return "IPLAN";
				
				}

				
			    public String IVLRK1;

				public String getIVLRK1 () {
					return this.IVLRK1;
				}

				public Boolean IVLRK1IsNullable(){
				    return true;
				}
				public Boolean IVLRK1IsKey(){
				    return false;
				}
				public Integer IVLRK1Length(){
				    return null;
				}
				public Integer IVLRK1Precision(){
				    return null;
				}
				public String IVLRK1Default(){
				
					return "";
				
				}
				public String IVLRK1Comment(){
				
				    return "";
				
				}
				public String IVLRK1Pattern(){
				
					return "";
				
				}
				public String IVLRK1OriginalDbColumnName(){
				
					return "IVLRK1";
				
				}

				
			    public String IVLRK2;

				public String getIVLRK2 () {
					return this.IVLRK2;
				}

				public Boolean IVLRK2IsNullable(){
				    return true;
				}
				public Boolean IVLRK2IsKey(){
				    return false;
				}
				public Integer IVLRK2Length(){
				    return null;
				}
				public Integer IVLRK2Precision(){
				    return null;
				}
				public String IVLRK2Default(){
				
					return "";
				
				}
				public String IVLRK2Comment(){
				
				    return "";
				
				}
				public String IVLRK2Pattern(){
				
					return "";
				
				}
				public String IVLRK2OriginalDbColumnName(){
				
					return "IVLRK2";
				
				}

				
			    public String IVLRK3;

				public String getIVLRK3 () {
					return this.IVLRK3;
				}

				public Boolean IVLRK3IsNullable(){
				    return true;
				}
				public Boolean IVLRK3IsKey(){
				    return false;
				}
				public Integer IVLRK3Length(){
				    return null;
				}
				public Integer IVLRK3Precision(){
				    return null;
				}
				public String IVLRK3Default(){
				
					return "";
				
				}
				public String IVLRK3Comment(){
				
				    return "";
				
				}
				public String IVLRK3Pattern(){
				
					return "";
				
				}
				public String IVLRK3OriginalDbColumnName(){
				
					return "IVLRK3";
				
				}

				
			    public String IVLRK4;

				public String getIVLRK4 () {
					return this.IVLRK4;
				}

				public Boolean IVLRK4IsNullable(){
				    return true;
				}
				public Boolean IVLRK4IsKey(){
				    return false;
				}
				public Integer IVLRK4Length(){
				    return null;
				}
				public Integer IVLRK4Precision(){
				    return null;
				}
				public String IVLRK4Default(){
				
					return "";
				
				}
				public String IVLRK4Comment(){
				
				    return "";
				
				}
				public String IVLRK4Pattern(){
				
					return "";
				
				}
				public String IVLRK4OriginalDbColumnName(){
				
					return "IVLRK4";
				
				}

				
			    public BigDecimal IRPLCN;

				public BigDecimal getIRPLCN () {
					return this.IRPLCN;
				}

				public Boolean IRPLCNIsNullable(){
				    return true;
				}
				public Boolean IRPLCNIsKey(){
				    return false;
				}
				public Integer IRPLCNLength(){
				    return null;
				}
				public Integer IRPLCNPrecision(){
				    return null;
				}
				public String IRPLCNDefault(){
				
					return "";
				
				}
				public String IRPLCNComment(){
				
				    return "";
				
				}
				public String IRPLCNPattern(){
				
					return "";
				
				}
				public String IRPLCNOriginalDbColumnName(){
				
					return "IRPLCN";
				
				}

				
			    public BigDecimal IRPLDT;

				public BigDecimal getIRPLDT () {
					return this.IRPLDT;
				}

				public Boolean IRPLDTIsNullable(){
				    return true;
				}
				public Boolean IRPLDTIsKey(){
				    return false;
				}
				public Integer IRPLDTLength(){
				    return null;
				}
				public Integer IRPLDTPrecision(){
				    return null;
				}
				public String IRPLDTDefault(){
				
					return "";
				
				}
				public String IRPLDTComment(){
				
				    return "";
				
				}
				public String IRPLDTPattern(){
				
					return "";
				
				}
				public String IRPLDTOriginalDbColumnName(){
				
					return "IRPLDT";
				
				}

				
			    public String ISEASN;

				public String getISEASN () {
					return this.ISEASN;
				}

				public Boolean ISEASNIsNullable(){
				    return true;
				}
				public Boolean ISEASNIsKey(){
				    return false;
				}
				public Integer ISEASNLength(){
				    return null;
				}
				public Integer ISEASNPrecision(){
				    return null;
				}
				public String ISEASNDefault(){
				
					return "";
				
				}
				public String ISEASNComment(){
				
				    return "";
				
				}
				public String ISEASNPattern(){
				
					return "";
				
				}
				public String ISEASNOriginalDbColumnName(){
				
					return "ISEASN";
				
				}

				
			    public BigDecimal IDEADC;

				public BigDecimal getIDEADC () {
					return this.IDEADC;
				}

				public Boolean IDEADCIsNullable(){
				    return true;
				}
				public Boolean IDEADCIsKey(){
				    return false;
				}
				public Integer IDEADCLength(){
				    return null;
				}
				public Integer IDEADCPrecision(){
				    return null;
				}
				public String IDEADCDefault(){
				
					return "";
				
				}
				public String IDEADCComment(){
				
				    return "";
				
				}
				public String IDEADCPattern(){
				
					return "";
				
				}
				public String IDEADCOriginalDbColumnName(){
				
					return "IDEADC";
				
				}

				
			    public BigDecimal IDEADD;

				public BigDecimal getIDEADD () {
					return this.IDEADD;
				}

				public Boolean IDEADDIsNullable(){
				    return true;
				}
				public Boolean IDEADDIsKey(){
				    return false;
				}
				public Integer IDEADDLength(){
				    return null;
				}
				public Integer IDEADDPrecision(){
				    return null;
				}
				public String IDEADDDefault(){
				
					return "";
				
				}
				public String IDEADDComment(){
				
				    return "";
				
				}
				public String IDEADDPattern(){
				
					return "";
				
				}
				public String IDEADDOriginalDbColumnName(){
				
					return "IDEADD";
				
				}

				
			    public BigDecimal INLRTL;

				public BigDecimal getINLRTL () {
					return this.INLRTL;
				}

				public Boolean INLRTLIsNullable(){
				    return true;
				}
				public Boolean INLRTLIsKey(){
				    return false;
				}
				public Integer INLRTLLength(){
				    return null;
				}
				public Integer INLRTLPrecision(){
				    return null;
				}
				public String INLRTLDefault(){
				
					return "";
				
				}
				public String INLRTLComment(){
				
				    return "";
				
				}
				public String INLRTLPattern(){
				
					return "";
				
				}
				public String INLRTLOriginalDbColumnName(){
				
					return "INLRTL";
				
				}

				
			    public String IHANDL;

				public String getIHANDL () {
					return this.IHANDL;
				}

				public Boolean IHANDLIsNullable(){
				    return true;
				}
				public Boolean IHANDLIsKey(){
				    return false;
				}
				public Integer IHANDLLength(){
				    return null;
				}
				public Integer IHANDLPrecision(){
				    return null;
				}
				public String IHANDLDefault(){
				
					return "";
				
				}
				public String IHANDLComment(){
				
				    return "";
				
				}
				public String IHANDLPattern(){
				
					return "";
				
				}
				public String IHANDLOriginalDbColumnName(){
				
					return "IHANDL";
				
				}

				
			    public String IATRB1;

				public String getIATRB1 () {
					return this.IATRB1;
				}

				public Boolean IATRB1IsNullable(){
				    return true;
				}
				public Boolean IATRB1IsKey(){
				    return false;
				}
				public Integer IATRB1Length(){
				    return null;
				}
				public Integer IATRB1Precision(){
				    return null;
				}
				public String IATRB1Default(){
				
					return "";
				
				}
				public String IATRB1Comment(){
				
				    return "";
				
				}
				public String IATRB1Pattern(){
				
					return "";
				
				}
				public String IATRB1OriginalDbColumnName(){
				
					return "IATRB1";
				
				}

				
			    public String IATRB2;

				public String getIATRB2 () {
					return this.IATRB2;
				}

				public Boolean IATRB2IsNullable(){
				    return true;
				}
				public Boolean IATRB2IsKey(){
				    return false;
				}
				public Integer IATRB2Length(){
				    return null;
				}
				public Integer IATRB2Precision(){
				    return null;
				}
				public String IATRB2Default(){
				
					return "";
				
				}
				public String IATRB2Comment(){
				
				    return "";
				
				}
				public String IATRB2Pattern(){
				
					return "";
				
				}
				public String IATRB2OriginalDbColumnName(){
				
					return "IATRB2";
				
				}

				
			    public String IATRB3;

				public String getIATRB3 () {
					return this.IATRB3;
				}

				public Boolean IATRB3IsNullable(){
				    return true;
				}
				public Boolean IATRB3IsKey(){
				    return false;
				}
				public Integer IATRB3Length(){
				    return null;
				}
				public Integer IATRB3Precision(){
				    return null;
				}
				public String IATRB3Default(){
				
					return "";
				
				}
				public String IATRB3Comment(){
				
				    return "";
				
				}
				public String IATRB3Pattern(){
				
					return "";
				
				}
				public String IATRB3OriginalDbColumnName(){
				
					return "IATRB3";
				
				}

				
			    public String IATRB4;

				public String getIATRB4 () {
					return this.IATRB4;
				}

				public Boolean IATRB4IsNullable(){
				    return true;
				}
				public Boolean IATRB4IsKey(){
				    return false;
				}
				public Integer IATRB4Length(){
				    return null;
				}
				public Integer IATRB4Precision(){
				    return null;
				}
				public String IATRB4Default(){
				
					return "";
				
				}
				public String IATRB4Comment(){
				
				    return "";
				
				}
				public String IATRB4Pattern(){
				
					return "";
				
				}
				public String IATRB4OriginalDbColumnName(){
				
					return "IATRB4";
				
				}

				
			    public String IATRB5;

				public String getIATRB5 () {
					return this.IATRB5;
				}

				public Boolean IATRB5IsNullable(){
				    return true;
				}
				public Boolean IATRB5IsKey(){
				    return false;
				}
				public Integer IATRB5Length(){
				    return null;
				}
				public Integer IATRB5Precision(){
				    return null;
				}
				public String IATRB5Default(){
				
					return "";
				
				}
				public String IATRB5Comment(){
				
				    return "";
				
				}
				public String IATRB5Pattern(){
				
					return "";
				
				}
				public String IATRB5OriginalDbColumnName(){
				
					return "IATRB5";
				
				}

				
			    public String IPRCCH;

				public String getIPRCCH () {
					return this.IPRCCH;
				}

				public Boolean IPRCCHIsNullable(){
				    return true;
				}
				public Boolean IPRCCHIsKey(){
				    return false;
				}
				public Integer IPRCCHLength(){
				    return null;
				}
				public Integer IPRCCHPrecision(){
				    return null;
				}
				public String IPRCCHDefault(){
				
					return "";
				
				}
				public String IPRCCHComment(){
				
				    return "";
				
				}
				public String IPRCCHPattern(){
				
					return "";
				
				}
				public String IPRCCHOriginalDbColumnName(){
				
					return "IPRCCH";
				
				}

				
			    public String IPRCZN;

				public String getIPRCZN () {
					return this.IPRCZN;
				}

				public Boolean IPRCZNIsNullable(){
				    return true;
				}
				public Boolean IPRCZNIsKey(){
				    return false;
				}
				public Integer IPRCZNLength(){
				    return null;
				}
				public Integer IPRCZNPrecision(){
				    return null;
				}
				public String IPRCZNDefault(){
				
					return "";
				
				}
				public String IPRCZNComment(){
				
				    return "";
				
				}
				public String IPRCZNPattern(){
				
					return "";
				
				}
				public String IPRCZNOriginalDbColumnName(){
				
					return "IPRCZN";
				
				}

				
			    public String IPRCST;

				public String getIPRCST () {
					return this.IPRCST;
				}

				public Boolean IPRCSTIsNullable(){
				    return true;
				}
				public Boolean IPRCSTIsKey(){
				    return false;
				}
				public Integer IPRCSTLength(){
				    return null;
				}
				public Integer IPRCSTPrecision(){
				    return null;
				}
				public String IPRCSTDefault(){
				
					return "";
				
				}
				public String IPRCSTComment(){
				
				    return "";
				
				}
				public String IPRCSTPattern(){
				
					return "";
				
				}
				public String IPRCSTOriginalDbColumnName(){
				
					return "IPRCST";
				
				}

				
			    public Double IASNUM;

				public Double getIASNUM () {
					return this.IASNUM;
				}

				public Boolean IASNUMIsNullable(){
				    return true;
				}
				public Boolean IASNUMIsKey(){
				    return false;
				}
				public Integer IASNUMLength(){
				    return null;
				}
				public Integer IASNUMPrecision(){
				    return null;
				}
				public String IASNUMDefault(){
				
					return "";
				
				}
				public String IASNUMComment(){
				
				    return "";
				
				}
				public String IASNUMPattern(){
				
					return "";
				
				}
				public String IASNUMOriginalDbColumnName(){
				
					return "IASNUM";
				
				}

				
			    public String ICORGP;

				public String getICORGP () {
					return this.ICORGP;
				}

				public Boolean ICORGPIsNullable(){
				    return true;
				}
				public Boolean ICORGPIsKey(){
				    return false;
				}
				public Integer ICORGPLength(){
				    return null;
				}
				public Integer ICORGPPrecision(){
				    return null;
				}
				public String ICORGPDefault(){
				
					return "";
				
				}
				public String ICORGPComment(){
				
				    return "";
				
				}
				public String ICORGPPattern(){
				
					return "";
				
				}
				public String ICORGPOriginalDbColumnName(){
				
					return "ICORGP";
				
				}

				
			    public BigDecimal ILEAD;

				public BigDecimal getILEAD () {
					return this.ILEAD;
				}

				public Boolean ILEADIsNullable(){
				    return true;
				}
				public Boolean ILEADIsKey(){
				    return false;
				}
				public Integer ILEADLength(){
				    return null;
				}
				public Integer ILEADPrecision(){
				    return null;
				}
				public String ILEADDefault(){
				
					return "";
				
				}
				public String ILEADComment(){
				
				    return "";
				
				}
				public String ILEADPattern(){
				
					return "";
				
				}
				public String ILEADOriginalDbColumnName(){
				
					return "ILEAD";
				
				}

				
			    public String IHZCOD;

				public String getIHZCOD () {
					return this.IHZCOD;
				}

				public Boolean IHZCODIsNullable(){
				    return true;
				}
				public Boolean IHZCODIsKey(){
				    return false;
				}
				public Integer IHZCODLength(){
				    return null;
				}
				public Integer IHZCODPrecision(){
				    return null;
				}
				public String IHZCODDefault(){
				
					return "";
				
				}
				public String IHZCODComment(){
				
				    return "";
				
				}
				public String IHZCODPattern(){
				
					return "";
				
				}
				public String IHZCODOriginalDbColumnName(){
				
					return "IHZCOD";
				
				}

				
			    public String IFRACT;

				public String getIFRACT () {
					return this.IFRACT;
				}

				public Boolean IFRACTIsNullable(){
				    return true;
				}
				public Boolean IFRACTIsKey(){
				    return false;
				}
				public Integer IFRACTLength(){
				    return null;
				}
				public Integer IFRACTPrecision(){
				    return null;
				}
				public String IFRACTDefault(){
				
					return "";
				
				}
				public String IFRACTComment(){
				
				    return "";
				
				}
				public String IFRACTPattern(){
				
					return "";
				
				}
				public String IFRACTOriginalDbColumnName(){
				
					return "IFRACT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ICHECK = null;
           				} else {
           			    	this.ICHECK = dis.readDouble();
           				}
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ASNUM = null;
           				} else {
           			    	this.ASNUM = dis.readDouble();
           				}
					
					this.IVNDPN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IMFGR = null;
           				} else {
           			    	this.IMFGR = dis.readDouble();
           				}
					
					this.IMFGNO = readString(dis);
					
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
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ISCOLR = null;
           				} else {
           			    	this.ISCOLR = dis.readDouble();
           				}
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SHPNUM = null;
           				} else {
           			    	this.SHPNUM = dis.readDouble();
           				}
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IIGNUM = null;
           				} else {
           			    	this.IIGNUM = dis.readDouble();
           				}
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IPLAN = null;
           				} else {
           			    	this.IPLAN = dis.readDouble();
           				}
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IASNUM = null;
           				} else {
           			    	this.IASNUM = dis.readDouble();
           				}
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ICHECK = null;
           				} else {
           			    	this.ICHECK = dis.readDouble();
           				}
					
					this.IDESCR = readString(dis);
					
					this.IDSCCD = readString(dis);
					
					this.ISORT = readString(dis);
					
					this.ISTYLN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ASNUM = null;
           				} else {
           			    	this.ASNUM = dis.readDouble();
           				}
					
					this.IVNDPN = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IMFGR = null;
           				} else {
           			    	this.IMFGR = dis.readDouble();
           				}
					
					this.IMFGNO = readString(dis);
					
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
					
					this.BYRNUM = readString(dis);
					
						this.IASPAC = (BigDecimal) dis.readObject();
					
					this.IADVYN = readString(dis);
					
					this.IBUYCD = readString(dis);
					
					this.ISET = readString(dis);
					
					this.IWARNT = readString(dis);
					
					this.IPRMPT = readString(dis);
					
					this.IPRVNT = readString(dis);
					
					this.ITKTTR = readString(dis);
					
					this.ITKTTA = readString(dis);
					
						this.ITKTN = (BigDecimal) dis.readObject();
					
					this.ILBLTR = readString(dis);
					
					this.ILBLTA = readString(dis);
					
					this.IFINLN = readString(dis);
					
					this.IPROFL = readString(dis);
					
					this.IMODUL = readString(dis);
					
					this.ISTYPE = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ISCOLR = null;
           				} else {
           			    	this.ISCOLR = dis.readDouble();
           				}
					
					this.ISSIZE = readString(dis);
					
					this.IHAZCD = readString(dis);
					
					this.MCHNUM = readString(dis);
					
						this.ISUBST = (BigDecimal) dis.readObject();
					
						this.ICORE = (BigDecimal) dis.readObject();
					
						this.IREPL = (BigDecimal) dis.readObject();
					
					this.ISLUM = readString(dis);
					
						this.IUMCV2 = (BigDecimal) dis.readObject();
					
					this.IBYUM = readString(dis);
					
						this.IMINPK = (BigDecimal) dis.readObject();
					
						this.ISTDPK = (BigDecimal) dis.readObject();
					
					this.IHLDOR = readString(dis);
					
						this.IMOQTY = (BigDecimal) dis.readObject();
					
						this.IMNSTK = (BigDecimal) dis.readObject();
					
						this.IMXSTK = (BigDecimal) dis.readObject();
					
						this.IMDSTK = (BigDecimal) dis.readObject();
					
						this.IDSPLY = (BigDecimal) dis.readObject();
					
						this.IOMULT = (BigDecimal) dis.readObject();
					
					this.IRPLCD = readString(dis);
					
						this.IMFPRC = (BigDecimal) dis.readObject();
					
						this.IWGHT = (BigDecimal) dis.readObject();
					
						this.ICUBE = (BigDecimal) dis.readObject();
					
						this.IDLGTH = (BigDecimal) dis.readObject();
					
						this.IDWDTH = (BigDecimal) dis.readObject();
					
						this.IDHGHT = (BigDecimal) dis.readObject();
					
						this.IMDATE = (BigDecimal) dis.readObject();
					
						this.IMCENT = (BigDecimal) dis.readObject();
					
						this.IVPLTI = (BigDecimal) dis.readObject();
					
						this.IVPLHI = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SHPNUM = null;
           				} else {
           			    	this.SHPNUM = dis.readDouble();
           				}
					
					this.IDISTM = readString(dis);
					
					this.IHLDWO = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IIGNUM = null;
           				} else {
           			    	this.IIGNUM = dis.readDouble();
           				}
					
					this.ISDIM = readString(dis);
					
					this.IVATCD = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IPLAN = null;
           				} else {
           			    	this.IPLAN = dis.readDouble();
           				}
					
					this.IVLRK1 = readString(dis);
					
					this.IVLRK2 = readString(dis);
					
					this.IVLRK3 = readString(dis);
					
					this.IVLRK4 = readString(dis);
					
						this.IRPLCN = (BigDecimal) dis.readObject();
					
						this.IRPLDT = (BigDecimal) dis.readObject();
					
					this.ISEASN = readString(dis);
					
						this.IDEADC = (BigDecimal) dis.readObject();
					
						this.IDEADD = (BigDecimal) dis.readObject();
					
						this.INLRTL = (BigDecimal) dis.readObject();
					
					this.IHANDL = readString(dis);
					
					this.IATRB1 = readString(dis);
					
					this.IATRB2 = readString(dis);
					
					this.IATRB3 = readString(dis);
					
					this.IATRB4 = readString(dis);
					
					this.IATRB5 = readString(dis);
					
					this.IPRCCH = readString(dis);
					
					this.IPRCZN = readString(dis);
					
					this.IPRCST = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.IASNUM = null;
           				} else {
           			    	this.IASNUM = dis.readDouble();
           				}
					
					this.ICORGP = readString(dis);
					
						this.ILEAD = (BigDecimal) dis.readObject();
					
					this.IHZCOD = readString(dis);
					
					this.IFRACT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// Double
				
						if(this.ICHECK == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICHECK);
		            	}
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// Double
				
						if(this.ASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ASNUM);
		            	}
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// Double
				
						if(this.IMFGR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IMFGR);
		            	}
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// Double
				
						if(this.IDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IDEPT);
		            	}
					
					// Double
				
						if(this.ISDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISDEPT);
		            	}
					
					// Double
				
						if(this.ICLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICLAS);
		            	}
					
					// Double
				
						if(this.ISCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCLAS);
		            	}
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// Double
				
						if(this.ISCOLR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCOLR);
		            	}
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// Double
				
						if(this.SHPNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.SHPNUM);
		            	}
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// Double
				
						if(this.IIGNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IIGNUM);
		            	}
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// Double
				
						if(this.IPLAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IPLAN);
		            	}
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// Double
				
						if(this.IASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IASNUM);
		            	}
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// Double
				
						if(this.ICHECK == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICHECK);
		            	}
					
					// String
				
						writeString(this.IDESCR,dos);
					
					// String
				
						writeString(this.IDSCCD,dos);
					
					// String
				
						writeString(this.ISORT,dos);
					
					// String
				
						writeString(this.ISTYLN,dos);
					
					// Double
				
						if(this.ASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ASNUM);
		            	}
					
					// String
				
						writeString(this.IVNDPN,dos);
					
					// Double
				
						if(this.IMFGR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IMFGR);
		            	}
					
					// String
				
						writeString(this.IMFGNO,dos);
					
					// Double
				
						if(this.IDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IDEPT);
		            	}
					
					// Double
				
						if(this.ISDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISDEPT);
		            	}
					
					// Double
				
						if(this.ICLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ICLAS);
		            	}
					
					// Double
				
						if(this.ISCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCLAS);
		            	}
					
					// String
				
						writeString(this.BYRNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IASPAC);
					
					// String
				
						writeString(this.IADVYN,dos);
					
					// String
				
						writeString(this.IBUYCD,dos);
					
					// String
				
						writeString(this.ISET,dos);
					
					// String
				
						writeString(this.IWARNT,dos);
					
					// String
				
						writeString(this.IPRMPT,dos);
					
					// String
				
						writeString(this.IPRVNT,dos);
					
					// String
				
						writeString(this.ITKTTR,dos);
					
					// String
				
						writeString(this.ITKTTA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITKTN);
					
					// String
				
						writeString(this.ILBLTR,dos);
					
					// String
				
						writeString(this.ILBLTA,dos);
					
					// String
				
						writeString(this.IFINLN,dos);
					
					// String
				
						writeString(this.IPROFL,dos);
					
					// String
				
						writeString(this.IMODUL,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// Double
				
						if(this.ISCOLR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.ISCOLR);
		            	}
					
					// String
				
						writeString(this.ISSIZE,dos);
					
					// String
				
						writeString(this.IHAZCD,dos);
					
					// String
				
						writeString(this.MCHNUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISUBST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IREPL);
					
					// String
				
						writeString(this.ISLUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IUMCV2);
					
					// String
				
						writeString(this.IBYUM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMINPK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTDPK);
					
					// String
				
						writeString(this.IHLDOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMOQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMNSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMXSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDSPLY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IOMULT);
					
					// String
				
						writeString(this.IRPLCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMFPRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ICUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDLGTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDWDTH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDHGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMDATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLTI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IVPLHI);
					
					// Double
				
						if(this.SHPNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.SHPNUM);
		            	}
					
					// String
				
						writeString(this.IDISTM,dos);
					
					// String
				
						writeString(this.IHLDWO,dos);
					
					// Double
				
						if(this.IIGNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IIGNUM);
		            	}
					
					// String
				
						writeString(this.ISDIM,dos);
					
					// String
				
						writeString(this.IVATCD,dos);
					
					// Double
				
						if(this.IPLAN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IPLAN);
		            	}
					
					// String
				
						writeString(this.IVLRK1,dos);
					
					// String
				
						writeString(this.IVLRK2,dos);
					
					// String
				
						writeString(this.IVLRK3,dos);
					
					// String
				
						writeString(this.IVLRK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IRPLDT);
					
					// String
				
						writeString(this.ISEASN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IDEADD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INLRTL);
					
					// String
				
						writeString(this.IHANDL,dos);
					
					// String
				
						writeString(this.IATRB1,dos);
					
					// String
				
						writeString(this.IATRB2,dos);
					
					// String
				
						writeString(this.IATRB3,dos);
					
					// String
				
						writeString(this.IATRB4,dos);
					
					// String
				
						writeString(this.IATRB5,dos);
					
					// String
				
						writeString(this.IPRCCH,dos);
					
					// String
				
						writeString(this.IPRCZN,dos);
					
					// String
				
						writeString(this.IPRCST,dos);
					
					// Double
				
						if(this.IASNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.IASNUM);
		            	}
					
					// String
				
						writeString(this.ICORGP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ILEAD);
					
					// String
				
						writeString(this.IHZCOD,dos);
					
					// String
				
						writeString(this.IFRACT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",ICHECK="+String.valueOf(ICHECK));
		sb.append(",IDESCR="+IDESCR);
		sb.append(",IDSCCD="+IDSCCD);
		sb.append(",ISORT="+ISORT);
		sb.append(",ISTYLN="+ISTYLN);
		sb.append(",ASNUM="+String.valueOf(ASNUM));
		sb.append(",IVNDPN="+IVNDPN);
		sb.append(",IMFGR="+String.valueOf(IMFGR));
		sb.append(",IMFGNO="+IMFGNO);
		sb.append(",IDEPT="+String.valueOf(IDEPT));
		sb.append(",ISDEPT="+String.valueOf(ISDEPT));
		sb.append(",ICLAS="+String.valueOf(ICLAS));
		sb.append(",ISCLAS="+String.valueOf(ISCLAS));
		sb.append(",BYRNUM="+BYRNUM);
		sb.append(",IASPAC="+String.valueOf(IASPAC));
		sb.append(",IADVYN="+IADVYN);
		sb.append(",IBUYCD="+IBUYCD);
		sb.append(",ISET="+ISET);
		sb.append(",IWARNT="+IWARNT);
		sb.append(",IPRMPT="+IPRMPT);
		sb.append(",IPRVNT="+IPRVNT);
		sb.append(",ITKTTR="+ITKTTR);
		sb.append(",ITKTTA="+ITKTTA);
		sb.append(",ITKTN="+String.valueOf(ITKTN));
		sb.append(",ILBLTR="+ILBLTR);
		sb.append(",ILBLTA="+ILBLTA);
		sb.append(",IFINLN="+IFINLN);
		sb.append(",IPROFL="+IPROFL);
		sb.append(",IMODUL="+IMODUL);
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ISCOLR="+String.valueOf(ISCOLR));
		sb.append(",ISSIZE="+ISSIZE);
		sb.append(",IHAZCD="+IHAZCD);
		sb.append(",MCHNUM="+MCHNUM);
		sb.append(",ISUBST="+String.valueOf(ISUBST));
		sb.append(",ICORE="+String.valueOf(ICORE));
		sb.append(",IREPL="+String.valueOf(IREPL));
		sb.append(",ISLUM="+ISLUM);
		sb.append(",IUMCV2="+String.valueOf(IUMCV2));
		sb.append(",IBYUM="+IBYUM);
		sb.append(",IMINPK="+String.valueOf(IMINPK));
		sb.append(",ISTDPK="+String.valueOf(ISTDPK));
		sb.append(",IHLDOR="+IHLDOR);
		sb.append(",IMOQTY="+String.valueOf(IMOQTY));
		sb.append(",IMNSTK="+String.valueOf(IMNSTK));
		sb.append(",IMXSTK="+String.valueOf(IMXSTK));
		sb.append(",IMDSTK="+String.valueOf(IMDSTK));
		sb.append(",IDSPLY="+String.valueOf(IDSPLY));
		sb.append(",IOMULT="+String.valueOf(IOMULT));
		sb.append(",IRPLCD="+IRPLCD);
		sb.append(",IMFPRC="+String.valueOf(IMFPRC));
		sb.append(",IWGHT="+String.valueOf(IWGHT));
		sb.append(",ICUBE="+String.valueOf(ICUBE));
		sb.append(",IDLGTH="+String.valueOf(IDLGTH));
		sb.append(",IDWDTH="+String.valueOf(IDWDTH));
		sb.append(",IDHGHT="+String.valueOf(IDHGHT));
		sb.append(",IMDATE="+String.valueOf(IMDATE));
		sb.append(",IMCENT="+String.valueOf(IMCENT));
		sb.append(",IVPLTI="+String.valueOf(IVPLTI));
		sb.append(",IVPLHI="+String.valueOf(IVPLHI));
		sb.append(",SHPNUM="+String.valueOf(SHPNUM));
		sb.append(",IDISTM="+IDISTM);
		sb.append(",IHLDWO="+IHLDWO);
		sb.append(",IIGNUM="+String.valueOf(IIGNUM));
		sb.append(",ISDIM="+ISDIM);
		sb.append(",IVATCD="+IVATCD);
		sb.append(",IPLAN="+String.valueOf(IPLAN));
		sb.append(",IVLRK1="+IVLRK1);
		sb.append(",IVLRK2="+IVLRK2);
		sb.append(",IVLRK3="+IVLRK3);
		sb.append(",IVLRK4="+IVLRK4);
		sb.append(",IRPLCN="+String.valueOf(IRPLCN));
		sb.append(",IRPLDT="+String.valueOf(IRPLDT));
		sb.append(",ISEASN="+ISEASN);
		sb.append(",IDEADC="+String.valueOf(IDEADC));
		sb.append(",IDEADD="+String.valueOf(IDEADD));
		sb.append(",INLRTL="+String.valueOf(INLRTL));
		sb.append(",IHANDL="+IHANDL);
		sb.append(",IATRB1="+IATRB1);
		sb.append(",IATRB2="+IATRB2);
		sb.append(",IATRB3="+IATRB3);
		sb.append(",IATRB4="+IATRB4);
		sb.append(",IATRB5="+IATRB5);
		sb.append(",IPRCCH="+IPRCCH);
		sb.append(",IPRCZN="+IPRCZN);
		sb.append(",IPRCST="+IPRCST);
		sb.append(",IASNUM="+String.valueOf(IASNUM));
		sb.append(",ICORGP="+ICORGP);
		sb.append(",ILEAD="+String.valueOf(ILEAD));
		sb.append(",IHZCOD="+IHZCOD);
		sb.append(",IFRACT="+IFRACT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				if(ICHECK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICHECK);
            			}
            		
        			sb.append("|");
        		
        				if(IDESCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDESCR);
            			}
            		
        			sb.append("|");
        		
        				if(IDSCCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSCCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISORT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISORT);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYLN);
            			}
            		
        			sb.append("|");
        		
        				if(ASNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ASNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IVNDPN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVNDPN);
            			}
            		
        			sb.append("|");
        		
        				if(IMFGR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFGR);
            			}
            		
        			sb.append("|");
        		
        				if(IMFGNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFGNO);
            			}
            		
        			sb.append("|");
        		
        				if(IDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(ISDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(ICLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICLAS);
            			}
            		
        			sb.append("|");
        		
        				if(ISCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(BYRNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BYRNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IASPAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IASPAC);
            			}
            		
        			sb.append("|");
        		
        				if(IADVYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IADVYN);
            			}
            		
        			sb.append("|");
        		
        				if(IBUYCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBUYCD);
            			}
            		
        			sb.append("|");
        		
        				if(ISET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISET);
            			}
            		
        			sb.append("|");
        		
        				if(IWARNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWARNT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRMPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRMPT);
            			}
            		
        			sb.append("|");
        		
        				if(IPRVNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRVNT);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTR);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTTA);
            			}
            		
        			sb.append("|");
        		
        				if(ITKTN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITKTN);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTR);
            			}
            		
        			sb.append("|");
        		
        				if(ILBLTA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILBLTA);
            			}
            		
        			sb.append("|");
        		
        				if(IFINLN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFINLN);
            			}
            		
        			sb.append("|");
        		
        				if(IPROFL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPROFL);
            			}
            		
        			sb.append("|");
        		
        				if(IMODUL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMODUL);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ISCOLR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISCOLR);
            			}
            		
        			sb.append("|");
        		
        				if(ISSIZE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISSIZE);
            			}
            		
        			sb.append("|");
        		
        				if(IHAZCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHAZCD);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ISUBST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISUBST);
            			}
            		
        			sb.append("|");
        		
        				if(ICORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORE);
            			}
            		
        			sb.append("|");
        		
        				if(IREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IREPL);
            			}
            		
        			sb.append("|");
        		
        				if(ISLUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISLUM);
            			}
            		
        			sb.append("|");
        		
        				if(IUMCV2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IUMCV2);
            			}
            		
        			sb.append("|");
        		
        				if(IBYUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBYUM);
            			}
            		
        			sb.append("|");
        		
        				if(IMINPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMINPK);
            			}
            		
        			sb.append("|");
        		
        				if(ISTDPK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTDPK);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDOR);
            			}
            		
        			sb.append("|");
        		
        				if(IMOQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMOQTY);
            			}
            		
        			sb.append("|");
        		
        				if(IMNSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMNSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMXSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMXSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IMDSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDSTK);
            			}
            		
        			sb.append("|");
        		
        				if(IDSPLY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDSPLY);
            			}
            		
        			sb.append("|");
        		
        				if(IOMULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IOMULT);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCD);
            			}
            		
        			sb.append("|");
        		
        				if(IMFPRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMFPRC);
            			}
            		
        			sb.append("|");
        		
        				if(IWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(ICUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICUBE);
            			}
            		
        			sb.append("|");
        		
        				if(IDLGTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDLGTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDWDTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDWDTH);
            			}
            		
        			sb.append("|");
        		
        				if(IDHGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDHGHT);
            			}
            		
        			sb.append("|");
        		
        				if(IMDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMDATE);
            			}
            		
        			sb.append("|");
        		
        				if(IMCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMCENT);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLTI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLTI);
            			}
            		
        			sb.append("|");
        		
        				if(IVPLHI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVPLHI);
            			}
            		
        			sb.append("|");
        		
        				if(SHPNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHPNUM);
            			}
            		
        			sb.append("|");
        		
        				if(IDISTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDISTM);
            			}
            		
        			sb.append("|");
        		
        				if(IHLDWO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHLDWO);
            			}
            		
        			sb.append("|");
        		
        				if(IIGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IIGNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ISDIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISDIM);
            			}
            		
        			sb.append("|");
        		
        				if(IVATCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVATCD);
            			}
            		
        			sb.append("|");
        		
        				if(IPLAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPLAN);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK1);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK2);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK3);
            			}
            		
        			sb.append("|");
        		
        				if(IVLRK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IVLRK4);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLCN);
            			}
            		
        			sb.append("|");
        		
        				if(IRPLDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IRPLDT);
            			}
            		
        			sb.append("|");
        		
        				if(ISEASN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISEASN);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADC);
            			}
            		
        			sb.append("|");
        		
        				if(IDEADD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IDEADD);
            			}
            		
        			sb.append("|");
        		
        				if(INLRTL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INLRTL);
            			}
            		
        			sb.append("|");
        		
        				if(IHANDL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHANDL);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB1);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB2);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB3);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB4);
            			}
            		
        			sb.append("|");
        		
        				if(IATRB5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IATRB5);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCCH);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCZN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCZN);
            			}
            		
        			sb.append("|");
        		
        				if(IPRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPRCST);
            			}
            		
        			sb.append("|");
        		
        				if(IASNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IASNUM);
            			}
            		
        			sb.append("|");
        		
        				if(ICORGP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ICORGP);
            			}
            		
        			sb.append("|");
        		
        				if(ILEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ILEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IHZCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IHZCOD);
            			}
            		
        			sb.append("|");
        		
        				if(IFRACT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IFRACT);
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
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_1");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row1Struct row1 = new row1Struct();
INVMSTStruct INVMST = new INVMSTStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"INVMST");
			
		int tos_count_tDBOutput_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_1", "tDBOutput_1", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_1 = (String)(restRequest_tDBOutput_1 != null ? restRequest_tDBOutput_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_1 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_1 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_1 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_1.createRuntimeProperties();
 		                    props_tDBOutput_1.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);
 		                    
 		                    props_tDBOutput_1.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_1.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_1.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_1.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_1.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_1_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"columnName\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"rowNumber\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"category\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"character\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"byteOffset\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"line\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"sqlState\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"code\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_1_1_fisrt sst_tDBOutput_1_1_fisrt = new SchemaSettingTool_tDBOutput_1_1_fisrt();
 		                    
 		                    props_tDBOutput_1.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_1.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_1.table.setValue("tableName",
 		                    "INVMST");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_1.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_1_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"INVMST\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICHECK\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ICHECK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDESCR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":30,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IDESCR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDSCCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IDSCCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISORT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":10,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISORT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTYLN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISTYLN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ASNUM\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ASNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVNDPN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVNDPN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMFGR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IMFGR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMFGNO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMFGNO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDEPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IDEPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISDEPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISDEPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICLAS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ICLAS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISCLAS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISCLAS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BYRNUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BYRNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IASPAC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":2,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IASPAC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IADVYN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IADVYN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBUYCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBUYCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISET\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISET\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWARNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IWARNT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPRMPT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPRMPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPRVNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPRVNT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITKTTR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITKTTR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITKTTA\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITKTTA\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITKTN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":2,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ITKTN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ILBLTR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ILBLTR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ILBLTA\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ILBLTA\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IFINLN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":5,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IFINLN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPROFL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":5,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPROFL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMODUL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":5,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IMODUL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISTYPE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISCOLR\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ISCOLR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISSIZE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISSIZE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IHAZCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IHAZCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MCHNUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MCHNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISUBST\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ISUBST\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICORE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ICORE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IREPL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IREPL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISLUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISLUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IUMCV2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":10,\"talend.field.scale\":5,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IUMCV2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBYUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBYUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMINPK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IMINPK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTDPK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"ISTDPK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IHLDOR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IHLDOR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMOQTY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMOQTY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMNSTK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMNSTK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMXSTK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMXSTK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMDSTK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMDSTK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDSPLY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IDSPLY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IOMULT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IOMULT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IRPLCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IRPLCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMFPRC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IMFPRC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWGHT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IWGHT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICUBE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"ICUBE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDLGTH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IDLGTH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDWDTH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IDWDTH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDHGHT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IDHGHT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMDATE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMDATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMCENT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IMCENT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVPLTI\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IVPLTI\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVPLHI\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IVPLHI\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHPNUM\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"SHPNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDISTM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IDISTM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IHLDWO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IHLDWO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IIGNUM\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IIGNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISDIM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISDIM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVATCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVATCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPLAN\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IPLAN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVLRK1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVLRK1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVLRK2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVLRK2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVLRK3\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVLRK3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IVLRK4\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IVLRK4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IRPLCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IRPLCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IRPLDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IRPLDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISEASN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISEASN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDEADC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IDEADC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDEADD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IDEADD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INLRTL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"INLRTL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IHANDL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IHANDL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IATRB1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IATRB1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IATRB2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IATRB2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IATRB3\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IATRB3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IATRB4\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IATRB4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IATRB5\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":2,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IATRB5\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPRCCH\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPRCCH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPRCZN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPRCZN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPRCST\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPRCST\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IASNUM\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"IASNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICORGP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":5,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ICORGP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ILEAD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ILEAD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IHZCOD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IHZCOD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IFRACT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IFRACT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_1_2_fisrt sst_tDBOutput_1_2_fisrt = new SchemaSettingTool_tDBOutput_1_2_fisrt();
 		                    
 		                    props_tDBOutput_1.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_1_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_1.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_1);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_1.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_1 = props_tDBOutput_1.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_1.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_1);
        }
    }
globalMap.put("tDBOutput_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_1= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_1, topology_tDBOutput_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_1 = def_tDBOutput_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_1 = componentRuntime_tDBOutput_1.initialize(container_tDBOutput_1, props_tDBOutput_1);

if (initVr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_1.getMessage());
}

if(componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_1;
	compDriverInitialization_tDBOutput_1.runAtDriver(container_tDBOutput_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_1 = null;
if(componentRuntime_tDBOutput_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_1;
	if (doesNodeBelongToRequest_tDBOutput_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_1 = sourceOrSink_tDBOutput_1.validate(container_tDBOutput_1);
        if (vr_tDBOutput_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_1.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_1 = null;
    if (sourceOrSink_tDBOutput_1 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_1 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_1;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_1 = sink_tDBOutput_1.createWriteOperation();
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
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_1.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_1 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_1 = props_tDBOutput_1.getSchema(c_tDBOutput_1, false);
    incomingEnforcer_tDBOutput_1 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_1);

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
		
	
	currentComponent="tMap_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_1{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
                    } 
                } 
            new BytesLimit65535_tMap_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_1", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row1_tMap_1 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
	java.util.Date var1;
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_INVMST_tMap_1 = 0;
				
INVMSTStruct INVMST_tmp = new INVMSTStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";
	
	
		int tos_count_tFileInputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_1.append("Parameters:");
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVMST.zip\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
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
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICHECK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDESCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDSCCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISORT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYLN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ASNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVNDPN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFGR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFGNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BYRNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IASPAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IADVYN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBUYCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWARNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRMPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRVNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTTA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITKTN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILBLTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILBLTA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IFINLN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPROFL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMODUL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCOLR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISSIZE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHAZCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISUBST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IREPL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISLUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IUMCV2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBYUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMINPK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTDPK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHLDOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMOQTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMNSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMXSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMDSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDSPLY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IOMULT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMFPRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICUBE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDLGTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDWDTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDHGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMDATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMCENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVPLTI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVPLHI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHPNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDISTM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHLDWO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IIGNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDIM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVATCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPLAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IVLRK4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IRPLDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISEASN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEADC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEADD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INLRTL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHANDL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IATRB5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCCH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCZN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPRCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IASNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICORGP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ILEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IHZCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IFRACT")+"}]");
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
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + (log4jParamters_tFileInputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_1", "tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/INVMST.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_1 = null;
						try {
							if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
								zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_1));
							}else{
								zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_1))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_1 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_1 = zis_tFileInputDelimited_1.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
							if(entry_tFileInputDelimited_1 == null) {
								break;
							}
							if(entry_tFileInputDelimited_1.isDirectory()){ //directory
								continue;
							}
							try {
								fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_1, "ISO-8859-15","|","\n",false,1,0,
								
									limit_tFileInputDelimited_1
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.INUMBR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"INUMBR", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.INUMBR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ICHECK = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ICHECK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ICHECK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
							row1.IDESCR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
							row1.IDSCCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
							row1.ISORT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 5;
					
							row1.ISTYLN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 6;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ASNUM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ASNUM", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ASNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 7;
					
							row1.IVNDPN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 8;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMFGR = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMFGR", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMFGR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 9;
					
							row1.IMFGNO = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 10;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDEPT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDEPT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDEPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 11;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISDEPT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISDEPT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISDEPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 12;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ICLAS = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ICLAS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ICLAS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 13;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISCLAS = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISCLAS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISCLAS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 14;
					
							row1.BYRNUM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 15;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IASPAC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IASPAC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IASPAC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 16;
					
							row1.IADVYN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 17;
					
							row1.IBUYCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 18;
					
							row1.ISET = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 19;
					
							row1.IWARNT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 20;
					
							row1.IPRMPT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 21;
					
							row1.IPRVNT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 22;
					
							row1.ITKTTR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 23;
					
							row1.ITKTTA = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 24;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ITKTN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITKTN", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ITKTN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 25;
					
							row1.ILBLTR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 26;
					
							row1.ILBLTA = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 27;
					
							row1.IFINLN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 28;
					
							row1.IPROFL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 29;
					
							row1.IMODUL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 30;
					
							row1.ISTYPE = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 31;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISCOLR = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISCOLR", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISCOLR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 32;
					
							row1.ISSIZE = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 33;
					
							row1.IHAZCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 34;
					
							row1.MCHNUM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 35;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISUBST = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISUBST", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISUBST = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 36;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ICORE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ICORE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ICORE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 37;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IREPL = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IREPL", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IREPL = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 38;
					
							row1.ISLUM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 39;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IUMCV2 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IUMCV2", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IUMCV2 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 40;
					
							row1.IBYUM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 41;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMINPK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMINPK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMINPK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 42;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISTDPK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISTDPK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISTDPK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 43;
					
							row1.IHLDOR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 44;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMOQTY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMOQTY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMOQTY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 45;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMNSTK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMNSTK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMNSTK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 46;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMXSTK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMXSTK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMXSTK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 47;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMDSTK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMDSTK", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMDSTK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 48;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDSPLY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDSPLY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDSPLY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 49;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IOMULT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IOMULT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IOMULT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 50;
					
							row1.IRPLCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 51;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMFPRC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMFPRC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMFPRC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 52;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IWGHT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IWGHT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IWGHT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 53;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ICUBE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ICUBE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ICUBE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 54;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDLGTH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDLGTH", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDLGTH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 55;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDWDTH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDWDTH", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDWDTH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 56;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDHGHT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDHGHT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDHGHT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 57;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMDATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMDATE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMDATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 58;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IMCENT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IMCENT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IMCENT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 59;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IVPLTI = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IVPLTI", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IVPLTI = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 60;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IVPLHI = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IVPLHI", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IVPLHI = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 61;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.SHPNUM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"SHPNUM", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.SHPNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 62;
					
							row1.IDISTM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 63;
					
							row1.IHLDWO = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 64;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IIGNUM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IIGNUM", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IIGNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 65;
					
							row1.ISDIM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 66;
					
							row1.IVATCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 67;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IPLAN = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IPLAN", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IPLAN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 68;
					
							row1.IVLRK1 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 69;
					
							row1.IVLRK2 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 70;
					
							row1.IVLRK3 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 71;
					
							row1.IVLRK4 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 72;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IRPLCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IRPLCN", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IRPLCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 73;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IRPLDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IRPLDT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IRPLDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 74;
					
							row1.ISEASN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 75;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDEADC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDEADC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDEADC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 76;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IDEADD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IDEADD", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IDEADD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 77;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.INLRTL = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"INLRTL", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.INLRTL = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 78;
					
							row1.IHANDL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 79;
					
							row1.IATRB1 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 80;
					
							row1.IATRB2 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 81;
					
							row1.IATRB3 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 82;
					
							row1.IATRB4 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 83;
					
							row1.IATRB5 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 84;
					
							row1.IPRCCH = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 85;
					
							row1.IPRCZN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 86;
					
							row1.IPRCST = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 87;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IASNUM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IASNUM", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IASNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 88;
					
							row1.ICORGP = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 89;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ILEAD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ILEAD", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ILEAD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 90;
					
							row1.IHZCOD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 91;
					
							row1.IFRACT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
			            					throw(e);
			            				
			    					}
								
			log.debug("tFileInputDelimited_1 - Retrieving the record " + fid_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tFileInputDelimited_1","tFileInputDelimited_1","tFileInputDelimited","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
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
Var.var1 = TalendDate.addDate(TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")), -1 ,"DD") ;// ###############################
        // ###############################
        // # Output tables

INVMST = null;


// # Output table : 'INVMST'
count_INVMST_tMap_1++;

INVMST_tmp.INUMBR = row1.INUMBR;
INVMST_tmp.ICHECK = row1.ICHECK;
INVMST_tmp.IDESCR = row1.IDESCR;
INVMST_tmp.IDSCCD = row1.IDSCCD;
INVMST_tmp.ISORT = row1.ISORT;
INVMST_tmp.ISTYLN = row1.ISTYLN;
INVMST_tmp.ASNUM = row1.ASNUM;
INVMST_tmp.IVNDPN = row1.IVNDPN;
INVMST_tmp.IMFGR = row1.IMFGR;
INVMST_tmp.IMFGNO = row1.IMFGNO;
INVMST_tmp.IDEPT = row1.IDEPT;
INVMST_tmp.ISDEPT = row1.ISDEPT;
INVMST_tmp.ICLAS = row1.ICLAS;
INVMST_tmp.ISCLAS = row1.ISCLAS;
INVMST_tmp.BYRNUM = row1.BYRNUM;
INVMST_tmp.IASPAC = row1.IASPAC;
INVMST_tmp.IADVYN = row1.IADVYN;
INVMST_tmp.IBUYCD = row1.IBUYCD;
INVMST_tmp.ISET = row1.ISET;
INVMST_tmp.IWARNT = row1.IWARNT;
INVMST_tmp.IPRMPT = row1.IPRMPT;
INVMST_tmp.IPRVNT = row1.IPRVNT;
INVMST_tmp.ITKTTR = row1.ITKTTR;
INVMST_tmp.ITKTTA = row1.ITKTTA;
INVMST_tmp.ITKTN = row1.ITKTN;
INVMST_tmp.ILBLTR = row1.ILBLTR;
INVMST_tmp.ILBLTA = row1.ILBLTA;
INVMST_tmp.IFINLN = row1.IFINLN;
INVMST_tmp.IPROFL = row1.IPROFL;
INVMST_tmp.IMODUL = row1.IMODUL;
INVMST_tmp.ISTYPE = row1.ISTYPE;
INVMST_tmp.ISCOLR = row1.ISCOLR;
INVMST_tmp.ISSIZE = row1.ISSIZE;
INVMST_tmp.IHAZCD = row1.IHAZCD;
INVMST_tmp.MCHNUM = row1.MCHNUM;
INVMST_tmp.ISUBST = row1.ISUBST;
INVMST_tmp.ICORE = row1.ICORE;
INVMST_tmp.IREPL = row1.IREPL;
INVMST_tmp.ISLUM = row1.ISLUM;
INVMST_tmp.IUMCV2 = row1.IUMCV2;
INVMST_tmp.IBYUM = row1.IBYUM;
INVMST_tmp.IMINPK = row1.IMINPK;
INVMST_tmp.ISTDPK = row1.ISTDPK;
INVMST_tmp.IHLDOR = row1.IHLDOR;
INVMST_tmp.IMOQTY = row1.IMOQTY;
INVMST_tmp.IMNSTK = row1.IMNSTK;
INVMST_tmp.IMXSTK = row1.IMXSTK;
INVMST_tmp.IMDSTK = row1.IMDSTK;
INVMST_tmp.IDSPLY = row1.IDSPLY;
INVMST_tmp.IOMULT = row1.IOMULT;
INVMST_tmp.IRPLCD = row1.IRPLCD;
INVMST_tmp.IMFPRC = row1.IMFPRC;
INVMST_tmp.IWGHT = row1.IWGHT;
INVMST_tmp.ICUBE = row1.ICUBE;
INVMST_tmp.IDLGTH = row1.IDLGTH;
INVMST_tmp.IDWDTH = row1.IDWDTH;
INVMST_tmp.IDHGHT = row1.IDHGHT;
INVMST_tmp.IMDATE = row1.IMDATE;
INVMST_tmp.IMCENT = row1.IMCENT;
INVMST_tmp.IVPLTI = row1.IVPLTI;
INVMST_tmp.IVPLHI = row1.IVPLHI;
INVMST_tmp.SHPNUM = row1.SHPNUM;
INVMST_tmp.IDISTM = row1.IDISTM;
INVMST_tmp.IHLDWO = row1.IHLDWO;
INVMST_tmp.IIGNUM = row1.IIGNUM;
INVMST_tmp.ISDIM = row1.ISDIM;
INVMST_tmp.IVATCD = row1.IVATCD;
INVMST_tmp.IPLAN = row1.IPLAN;
INVMST_tmp.IVLRK1 = row1.IVLRK1;
INVMST_tmp.IVLRK2 = row1.IVLRK2;
INVMST_tmp.IVLRK3 = row1.IVLRK3;
INVMST_tmp.IVLRK4 = row1.IVLRK4;
INVMST_tmp.IRPLCN = row1.IRPLCN;
INVMST_tmp.IRPLDT = row1.IRPLDT;
INVMST_tmp.ISEASN = row1.ISEASN;
INVMST_tmp.IDEADC = row1.IDEADC;
INVMST_tmp.IDEADD = row1.IDEADD;
INVMST_tmp.INLRTL = row1.INLRTL;
INVMST_tmp.IHANDL = row1.IHANDL;
INVMST_tmp.IATRB1 = row1.IATRB1;
INVMST_tmp.IATRB2 = row1.IATRB2;
INVMST_tmp.IATRB3 = row1.IATRB3;
INVMST_tmp.IATRB4 = row1.IATRB4;
INVMST_tmp.IATRB5 = row1.IATRB5;
INVMST_tmp.IPRCCH = row1.IPRCCH;
INVMST_tmp.IPRCZN = row1.IPRCZN;
INVMST_tmp.IPRCST = row1.IPRCST;
INVMST_tmp.IASNUM = row1.IASNUM;
INVMST_tmp.ICORGP = row1.ICORGP;
INVMST_tmp.ILEAD = row1.ILEAD;
INVMST_tmp.IHZCOD = row1.IHZCOD;
INVMST_tmp.IFRACT = row1.IFRACT;
INVMST_tmp.LOAD_DATE = Var.var1 ;
INVMST = INVMST_tmp;
log.debug("tMap_1 - Outputting the record " + count_INVMST_tMap_1 + " of the output table 'INVMST'.");

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

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "INVMST"
if(INVMST != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"INVMST","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("INVMST - " + (INVMST==null? "": INVMST.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INUMBR") != null){
                    incomingEnforcer_tDBOutput_1.put("INUMBR", INVMST.INUMBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ICHECK") != null){
                    incomingEnforcer_tDBOutput_1.put("ICHECK", INVMST.ICHECK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDESCR") != null){
                    incomingEnforcer_tDBOutput_1.put("IDESCR", INVMST.IDESCR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDSCCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IDSCCD", INVMST.IDSCCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISORT") != null){
                    incomingEnforcer_tDBOutput_1.put("ISORT", INVMST.ISORT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISTYLN") != null){
                    incomingEnforcer_tDBOutput_1.put("ISTYLN", INVMST.ISTYLN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ASNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("ASNUM", INVMST.ASNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVNDPN") != null){
                    incomingEnforcer_tDBOutput_1.put("IVNDPN", INVMST.IVNDPN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMFGR") != null){
                    incomingEnforcer_tDBOutput_1.put("IMFGR", INVMST.IMFGR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMFGNO") != null){
                    incomingEnforcer_tDBOutput_1.put("IMFGNO", INVMST.IMFGNO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDEPT") != null){
                    incomingEnforcer_tDBOutput_1.put("IDEPT", INVMST.IDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISDEPT") != null){
                    incomingEnforcer_tDBOutput_1.put("ISDEPT", INVMST.ISDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ICLAS") != null){
                    incomingEnforcer_tDBOutput_1.put("ICLAS", INVMST.ICLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISCLAS") != null){
                    incomingEnforcer_tDBOutput_1.put("ISCLAS", INVMST.ISCLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BYRNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("BYRNUM", INVMST.BYRNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IASPAC") != null){
                    incomingEnforcer_tDBOutput_1.put("IASPAC", INVMST.IASPAC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IADVYN") != null){
                    incomingEnforcer_tDBOutput_1.put("IADVYN", INVMST.IADVYN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBUYCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IBUYCD", INVMST.IBUYCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISET") != null){
                    incomingEnforcer_tDBOutput_1.put("ISET", INVMST.ISET);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IWARNT") != null){
                    incomingEnforcer_tDBOutput_1.put("IWARNT", INVMST.IWARNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPRMPT") != null){
                    incomingEnforcer_tDBOutput_1.put("IPRMPT", INVMST.IPRMPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPRVNT") != null){
                    incomingEnforcer_tDBOutput_1.put("IPRVNT", INVMST.IPRVNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITKTTR") != null){
                    incomingEnforcer_tDBOutput_1.put("ITKTTR", INVMST.ITKTTR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITKTTA") != null){
                    incomingEnforcer_tDBOutput_1.put("ITKTTA", INVMST.ITKTTA);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITKTN") != null){
                    incomingEnforcer_tDBOutput_1.put("ITKTN", INVMST.ITKTN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ILBLTR") != null){
                    incomingEnforcer_tDBOutput_1.put("ILBLTR", INVMST.ILBLTR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ILBLTA") != null){
                    incomingEnforcer_tDBOutput_1.put("ILBLTA", INVMST.ILBLTA);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IFINLN") != null){
                    incomingEnforcer_tDBOutput_1.put("IFINLN", INVMST.IFINLN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPROFL") != null){
                    incomingEnforcer_tDBOutput_1.put("IPROFL", INVMST.IPROFL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMODUL") != null){
                    incomingEnforcer_tDBOutput_1.put("IMODUL", INVMST.IMODUL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISTYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("ISTYPE", INVMST.ISTYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISCOLR") != null){
                    incomingEnforcer_tDBOutput_1.put("ISCOLR", INVMST.ISCOLR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISSIZE") != null){
                    incomingEnforcer_tDBOutput_1.put("ISSIZE", INVMST.ISSIZE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IHAZCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IHAZCD", INVMST.IHAZCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MCHNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("MCHNUM", INVMST.MCHNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISUBST") != null){
                    incomingEnforcer_tDBOutput_1.put("ISUBST", INVMST.ISUBST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ICORE") != null){
                    incomingEnforcer_tDBOutput_1.put("ICORE", INVMST.ICORE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IREPL") != null){
                    incomingEnforcer_tDBOutput_1.put("IREPL", INVMST.IREPL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISLUM") != null){
                    incomingEnforcer_tDBOutput_1.put("ISLUM", INVMST.ISLUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IUMCV2") != null){
                    incomingEnforcer_tDBOutput_1.put("IUMCV2", INVMST.IUMCV2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBYUM") != null){
                    incomingEnforcer_tDBOutput_1.put("IBYUM", INVMST.IBYUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMINPK") != null){
                    incomingEnforcer_tDBOutput_1.put("IMINPK", INVMST.IMINPK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISTDPK") != null){
                    incomingEnforcer_tDBOutput_1.put("ISTDPK", INVMST.ISTDPK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IHLDOR") != null){
                    incomingEnforcer_tDBOutput_1.put("IHLDOR", INVMST.IHLDOR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMOQTY") != null){
                    incomingEnforcer_tDBOutput_1.put("IMOQTY", INVMST.IMOQTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMNSTK") != null){
                    incomingEnforcer_tDBOutput_1.put("IMNSTK", INVMST.IMNSTK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMXSTK") != null){
                    incomingEnforcer_tDBOutput_1.put("IMXSTK", INVMST.IMXSTK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMDSTK") != null){
                    incomingEnforcer_tDBOutput_1.put("IMDSTK", INVMST.IMDSTK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDSPLY") != null){
                    incomingEnforcer_tDBOutput_1.put("IDSPLY", INVMST.IDSPLY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IOMULT") != null){
                    incomingEnforcer_tDBOutput_1.put("IOMULT", INVMST.IOMULT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IRPLCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IRPLCD", INVMST.IRPLCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMFPRC") != null){
                    incomingEnforcer_tDBOutput_1.put("IMFPRC", INVMST.IMFPRC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IWGHT") != null){
                    incomingEnforcer_tDBOutput_1.put("IWGHT", INVMST.IWGHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ICUBE") != null){
                    incomingEnforcer_tDBOutput_1.put("ICUBE", INVMST.ICUBE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDLGTH") != null){
                    incomingEnforcer_tDBOutput_1.put("IDLGTH", INVMST.IDLGTH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDWDTH") != null){
                    incomingEnforcer_tDBOutput_1.put("IDWDTH", INVMST.IDWDTH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDHGHT") != null){
                    incomingEnforcer_tDBOutput_1.put("IDHGHT", INVMST.IDHGHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMDATE") != null){
                    incomingEnforcer_tDBOutput_1.put("IMDATE", INVMST.IMDATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMCENT") != null){
                    incomingEnforcer_tDBOutput_1.put("IMCENT", INVMST.IMCENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVPLTI") != null){
                    incomingEnforcer_tDBOutput_1.put("IVPLTI", INVMST.IVPLTI);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVPLHI") != null){
                    incomingEnforcer_tDBOutput_1.put("IVPLHI", INVMST.IVPLHI);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHPNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("SHPNUM", INVMST.SHPNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDISTM") != null){
                    incomingEnforcer_tDBOutput_1.put("IDISTM", INVMST.IDISTM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IHLDWO") != null){
                    incomingEnforcer_tDBOutput_1.put("IHLDWO", INVMST.IHLDWO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IIGNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("IIGNUM", INVMST.IIGNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISDIM") != null){
                    incomingEnforcer_tDBOutput_1.put("ISDIM", INVMST.ISDIM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVATCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IVATCD", INVMST.IVATCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPLAN") != null){
                    incomingEnforcer_tDBOutput_1.put("IPLAN", INVMST.IPLAN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVLRK1") != null){
                    incomingEnforcer_tDBOutput_1.put("IVLRK1", INVMST.IVLRK1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVLRK2") != null){
                    incomingEnforcer_tDBOutput_1.put("IVLRK2", INVMST.IVLRK2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVLRK3") != null){
                    incomingEnforcer_tDBOutput_1.put("IVLRK3", INVMST.IVLRK3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IVLRK4") != null){
                    incomingEnforcer_tDBOutput_1.put("IVLRK4", INVMST.IVLRK4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IRPLCN") != null){
                    incomingEnforcer_tDBOutput_1.put("IRPLCN", INVMST.IRPLCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IRPLDT") != null){
                    incomingEnforcer_tDBOutput_1.put("IRPLDT", INVMST.IRPLDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISEASN") != null){
                    incomingEnforcer_tDBOutput_1.put("ISEASN", INVMST.ISEASN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDEADC") != null){
                    incomingEnforcer_tDBOutput_1.put("IDEADC", INVMST.IDEADC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IDEADD") != null){
                    incomingEnforcer_tDBOutput_1.put("IDEADD", INVMST.IDEADD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INLRTL") != null){
                    incomingEnforcer_tDBOutput_1.put("INLRTL", INVMST.INLRTL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IHANDL") != null){
                    incomingEnforcer_tDBOutput_1.put("IHANDL", INVMST.IHANDL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IATRB1") != null){
                    incomingEnforcer_tDBOutput_1.put("IATRB1", INVMST.IATRB1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IATRB2") != null){
                    incomingEnforcer_tDBOutput_1.put("IATRB2", INVMST.IATRB2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IATRB3") != null){
                    incomingEnforcer_tDBOutput_1.put("IATRB3", INVMST.IATRB3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IATRB4") != null){
                    incomingEnforcer_tDBOutput_1.put("IATRB4", INVMST.IATRB4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IATRB5") != null){
                    incomingEnforcer_tDBOutput_1.put("IATRB5", INVMST.IATRB5);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPRCCH") != null){
                    incomingEnforcer_tDBOutput_1.put("IPRCCH", INVMST.IPRCCH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPRCZN") != null){
                    incomingEnforcer_tDBOutput_1.put("IPRCZN", INVMST.IPRCZN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IPRCST") != null){
                    incomingEnforcer_tDBOutput_1.put("IPRCST", INVMST.IPRCST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IASNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("IASNUM", INVMST.IASNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ICORGP") != null){
                    incomingEnforcer_tDBOutput_1.put("ICORGP", INVMST.ICORGP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ILEAD") != null){
                    incomingEnforcer_tDBOutput_1.put("ILEAD", INVMST.ILEAD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IHZCOD") != null){
                    incomingEnforcer_tDBOutput_1.put("IHZCOD", INVMST.IHZCOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IFRACT") != null){
                    incomingEnforcer_tDBOutput_1.put("IFRACT", INVMST.IFRACT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("LOAD_DATE", INVMST.LOAD_DATE);
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

	

	
	
	currentComponent="tDBOutput_1";
	
	


 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	


 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "INVMST"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	


				
            }
            nb_line_tFileInputDelimited_1+=fid_tFileInputDelimited_1.getRowNumber();
		}
		}finally{
            if(!((Object)("/data/talend/data_repository/INVMST.zip") instanceof java.io.InputStream)){
            	if(fid_tFileInputDelimited_1!=null){
            		fid_tFileInputDelimited_1.close();
            	}
            }
            if(fid_tFileInputDelimited_1!=null){
            	globalMap.put("tFileInputDelimited_1_NB_LINE", nb_line_tFileInputDelimited_1);
            }
					
						log.info("tFileInputDelimited_1- Retrieved records count: "+ nb_line_tFileInputDelimited_1 + ".");
					
        }
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'INVMST': " + count_INVMST_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tFileInputDelimited_1","tFileInputDelimited_1","tFileInputDelimited","tMap_1","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_1", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_1 = null;
    if (writer_tDBOutput_1 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_1 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_1.close();
        resultMap_tDBOutput_1 = writer_tDBOutput_1.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_1), container_tDBOutput_1);
    }
if(resultMap_tDBOutput_1!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_1 : resultMap_tDBOutput_1.entrySet()) {
		switch(entry_tDBOutput_1.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "ERROR_MESSAGE", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_LINE", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_SUCCESS", entry_tDBOutput_1.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_1.setComponentData("tDBOutput_1", "NB_REJECT", entry_tDBOutput_1.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_1 = new StringBuilder();
            for (int i_tDBOutput_1 = 0; i_tDBOutput_1 < entry_tDBOutput_1.getKey().length(); i_tDBOutput_1++) {
                char ch_tDBOutput_1 = entry_tDBOutput_1.getKey().charAt(i_tDBOutput_1);
                if(Character.isUpperCase(ch_tDBOutput_1) && i_tDBOutput_1> 0) {
                	studio_key_tDBOutput_1.append('_');
                }
                studio_key_tDBOutput_1.append(ch_tDBOutput_1);
            }
			container_tDBOutput_1.setComponentData("tDBOutput_1", studio_key_tDBOutput_1.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_1.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"INVMST",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tDBRow_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";
	
	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_1")==null){
    if(resourceMap.get("writer_tDBOutput_1")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_1")).close();
		} catch (java.io.IOException e_tDBOutput_1) {
			String errorMessage_tDBOutput_1 = "failed to release the resource in tDBOutput_1 :" + e_tDBOutput_1.getMessage();
			System.err.println(errorMessage_tDBOutput_1);
		}
	}
}
 



/**
 * [tDBOutput_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_3", false);
		start_Hash.put("tDBRow_3", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_3";
	
	
		int tos_count_tDBRow_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_3", "tDBRow_3", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_3 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_3 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_3 = (String)(restRequest_tDBRow_3 != null ? restRequest_tDBRow_3.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_3 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_3 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_3 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_3 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_3.createRuntimeProperties();
 		                    props_tDBRow_3.setValue("query",
 		                    "\ninsert into INVENTORY_MASTER_INVMST\nselect \nINUMBR\n,ICHECK\n,IDESCR\n,IDSCCD\n,ISORT\n,ISTYLN\n,ASNUM\n,IVNDPN\n,I"
+"MFGR\n,IMFGNO\n,IDEPT\n,ISDEPT\n,ICLAS\n,ISCLAS\n,BYRNUM\n,IASPAC\n,IADVYN\n,IBUYCD\n,ISET\n,IWARNT\n,IPRMPT\n,IPRVNT\n,"
+"ITKTTR\n,ITKTTA\n,ITKTN\n,ILBLTR\n,ILBLTA\n,IFINLN\n,IPROFL\n,IMODUL\n,ISTYPE\n,ISCOLR\n,ISSIZE\n,IHAZCD\n,MCHNUM\n,ISUB"
+"ST\n,ICORE\n,IREPL\n,ISLUM\n,IUMCV2\n,IBYUM\n,IMINPK\n,ISTDPK\n,IHLDOR\n,IMOQTY\n,IMNSTK\n,IMXSTK\n,IMDSTK\n,IDSPLY\n,IO"
+"MULT\n,IRPLCD\n,IMFPRC\n,IWGHT\n,ICUBE\n,IDLGTH\n,IDWDTH\n,IDHGHT\n ,   case\n        when LENGTH(IMDATE)= 1 then NULL\n"
+"        \n        else TO_DATE(to_varchar(IMDATE), 'yymmdd')\n    end as IMDATE\n\n,IVPLTI\n,IVPLHI\n,SHPNUM\n,IDISTM\n,"
+"IHLDWO\n,IIGNUM\n,ISDIM\n,IVATCD\n,IPLAN\n,IVLRK1\n,IVLRK2\n,IVLRK3\n,IVLRK4\n\n,    case\n        when LENGTH(IRPLDT) i"
+"n (0,1) then NULL\n        \n        else TO_DATE(to_varchar(IRPLDT), 'yymmdd')\n    end as IRPLDT\n\n,ISEASN\n\n,    ca"
+"se\n        when LENGTH(IDEADD ) in (0,1) then NULL\n        \n        else TO_DATE(to_varchar(IDEADD ), 'yymmdd')\n    "
+"end as IDEADD \n\n,INLRTL\n,IHANDL\n,IATRB1\n,IATRB2\n,IATRB3\n,IATRB4\n,IATRB5\n,IPRCCH\n,IPRCZN\n,IPRCST\n,IASNUM\n,IC"
+"ORGP\n,ILEAD\n,IHZCOD\n,IFRACT\n,LOAD_DATE\nfrom \nINVMST\n\n");
 		                    
 		                    props_tDBRow_3.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_3.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_3.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_3_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
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
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_3_2_fisrt sst_tDBRow_3_2_fisrt = new SchemaSettingTool_tDBRow_3_2_fisrt();
 		                    
 		                    props_tDBRow_3.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_3.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_3.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_3.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_3.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_3.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_3.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_3.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_3.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_3.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_3.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_3_3_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_3_3_fisrt sst_tDBRow_3_3_fisrt = new SchemaSettingTool_tDBRow_3_3_fisrt();
 		                    
 		                    props_tDBRow_3.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_3.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_3 = props_tDBRow_3.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_3.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_3);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_3.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_3 = props_tDBRow_3.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_3.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_3);
        }
    }
globalMap.put("tDBRow_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_3);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_3= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_3, topology_tDBRow_3);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_3 = def_tDBRow_3.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_3 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_3.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_3 = componentRuntime_tDBRow_3.initialize(container_tDBRow_3, props_tDBRow_3);

if (initVr_tDBRow_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_3.getMessage());
}

if(componentRuntime_tDBRow_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_3;
	compDriverInitialization_tDBRow_3.runAtDriver(container_tDBRow_3);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_3 = null;
if(componentRuntime_tDBRow_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_3 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_3;
	if (doesNodeBelongToRequest_tDBRow_3) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_3 = sourceOrSink_tDBRow_3.validate(container_tDBRow_3);
        if (vr_tDBRow_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_3";
	
	


 


	tos_count_tDBRow_3++;

/**
 * [tDBRow_3 main ] stop
 */
	
	/**
	 * [tDBRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_3";
	
	


 



/**
 * [tDBRow_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_3";
	
	


 



/**
 * [tDBRow_3 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_3 end ] start
	 */

	

	
	
	currentComponent="tDBRow_3";
	
	
// end of generic


resourceMap.put("finish_tDBRow_3", Boolean.TRUE);

 

ok_Hash.put("tDBRow_3", true);
end_Hash.put("tDBRow_3", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBRow_4Process(globalMap);



/**
 * [tDBRow_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_3 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_3";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_3")==null){
}
 



/**
 * [tDBRow_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tDBRow_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_4", false);
		start_Hash.put("tDBRow_4", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_4";
	
	
		int tos_count_tDBRow_4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_4", "tDBRow_4", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_4 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_4 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_4 = (String)(restRequest_tDBRow_4 != null ? restRequest_tDBRow_4.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_4 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_4 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_4 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_4 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_4.createRuntimeProperties();
 		                    props_tDBRow_4.setValue("query",
 		                    "\nDrop table INVMST\n\n");
 		                    
 		                    props_tDBRow_4.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_4.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_4.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_4_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
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
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_4_2_fisrt sst_tDBRow_4_2_fisrt = new SchemaSettingTool_tDBRow_4_2_fisrt();
 		                    
 		                    props_tDBRow_4.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_4.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_4.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_4.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_4.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_4.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_4.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_4.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_4.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_4.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_4.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_4.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_4_3_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_4_3_fisrt sst_tDBRow_4_3_fisrt = new SchemaSettingTool_tDBRow_4_3_fisrt();
 		                    
 		                    props_tDBRow_4.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_4.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_4 = props_tDBRow_4.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_4.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_4);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_4.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_4 = props_tDBRow_4.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_4.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_4);
        }
    }
globalMap.put("tDBRow_4_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_4);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_4= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_4, topology_tDBRow_4);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_4 = def_tDBRow_4.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_4 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_4.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_4 = componentRuntime_tDBRow_4.initialize(container_tDBRow_4, props_tDBRow_4);

if (initVr_tDBRow_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_4.getMessage());
}

if(componentRuntime_tDBRow_4 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_4 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_4;
	compDriverInitialization_tDBRow_4.runAtDriver(container_tDBRow_4);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_4 = null;
if(componentRuntime_tDBRow_4 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_4 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_4;
	if (doesNodeBelongToRequest_tDBRow_4) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_4 = sourceOrSink_tDBRow_4.validate(container_tDBRow_4);
        if (vr_tDBRow_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_4";
	
	


 


	tos_count_tDBRow_4++;

/**
 * [tDBRow_4 main ] stop
 */
	
	/**
	 * [tDBRow_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_4";
	
	


 



/**
 * [tDBRow_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_4";
	
	


 



/**
 * [tDBRow_4 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_4 end ] start
	 */

	

	
	
	currentComponent="tDBRow_4";
	
	
// end of generic


resourceMap.put("finish_tDBRow_4", Boolean.TRUE);

 

ok_Hash.put("tDBRow_4", true);
end_Hash.put("tDBRow_4", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBRow_5Process(globalMap);



/**
 * [tDBRow_4 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_4 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_4";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_4")==null){
}
 



/**
 * [tDBRow_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_4_SUBPROCESS_STATE", 1);
	}
	


public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST = new byte[0];

	
			    public Boolean X_DASH_DET;

				public Boolean getX_DASH_DET () {
					return this.X_DASH_DET;
				}

				public Boolean X_DASH_DETIsNullable(){
				    return true;
				}
				public Boolean X_DASH_DETIsKey(){
				    return false;
				}
				public Integer X_DASH_DETLength(){
				    return null;
				}
				public Integer X_DASH_DETPrecision(){
				    return null;
				}
				public String X_DASH_DETDefault(){
				
					return null;
				
				}
				public String X_DASH_DETComment(){
				
				    return "";
				
				}
				public String X_DASH_DETPattern(){
				
					return "";
				
				}
				public String X_DASH_DETOriginalDbColumnName(){
				
					return "X_DASH_DET";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_MASTER_INVMST) {

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
				
						if(this.X_DASH_DET == null) {
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
				
						if(this.X_DASH_DET == null) {
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
		sb.append("X_DASH_DET="+String.valueOf(X_DASH_DET));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(X_DASH_DET == null){
        					sb.append("<null>");
        				}else{
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row12Struct row12 = new row12Struct();




	
	/**
	 * [tJavaRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_1", false);
		start_Hash.put("tJavaRow_1", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row12");
			
		int tos_count_tJavaRow_1 = 0;
		
			if(enableLogStash) {
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
		
	
	currentComponent="tDBRow_5";
	
	
		int tos_count_tDBRow_5 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_5", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_5 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_5 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_5 = (String)(restRequest_tDBRow_5 != null ? restRequest_tDBRow_5.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_5 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_5 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_5 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_5 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_5.createRuntimeProperties();
 		                    props_tDBRow_5.setValue("query",
 		                    "\nselect CASE WHEN max(DATELOADED) = dateadd(day, -1, substr(convert_timezone('America/New_York', current_timestamp()),"
+"0,10)) THEN TRUE ELSE FALSE END\nfrom PROD_DATA.INVENTORY.INVENTORY_MASTER_INVMST;\n");
 		                    
 		                    props_tDBRow_5.setValue("dieOnError",
 		                    false);
 		                    
 		                    props_tDBRow_5.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_5.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_5_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBRow_7\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",s);
     		                    						
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
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"rejectOutput\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_5_2_fisrt sst_tDBRow_5_2_fisrt = new SchemaSettingTool_tDBRow_5_2_fisrt();
 		                    
 		                    props_tDBRow_5.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_5.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_5.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_5.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_5.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_5.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_5.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_5.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_5.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_5.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_5.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_5.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_5_3_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBRow_7\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"X_DASH_DET\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"X_DASH_DET\",\"talend.field.dbColumnName\":\"X_DASH_DET\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"X_DASH_DET\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_7\",\"di.table.label\":\"tDBRow_7\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_5_3_fisrt sst_tDBRow_5_3_fisrt = new SchemaSettingTool_tDBRow_5_3_fisrt();
 		                    
 		                    props_tDBRow_5.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_5.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_5 = props_tDBRow_5.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_5 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_5 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_5 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_5.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_5);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_5.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_5 = props_tDBRow_5.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_5 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_5 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_5 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_5.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_5);
        }
    }
globalMap.put("tDBRow_5_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_5);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_5= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_5, topology_tDBRow_5);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_5 = def_tDBRow_5.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_5 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_5.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_5 = componentRuntime_tDBRow_5.initialize(container_tDBRow_5, props_tDBRow_5);

if (initVr_tDBRow_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_5.getMessage());
}

if(componentRuntime_tDBRow_5 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_5 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_5;
	compDriverInitialization_tDBRow_5.runAtDriver(container_tDBRow_5);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_5 = null;
if(componentRuntime_tDBRow_5 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_5 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_5;
	if (doesNodeBelongToRequest_tDBRow_5) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_5 = sourceOrSink_tDBRow_5.validate(container_tDBRow_5);
        if (vr_tDBRow_5.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBRow_5.getMessage());
        }
	}
}

    if (sourceOrSink_tDBRow_5 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBRow_5 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBRow_5;
        reader_tDBRow_5 = source_tDBRow_5.createReader(container_tDBRow_5);
	    reader_tDBRow_5 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_5, container_tDBRow_5);

            boolean multi_output_is_allowed_tDBRow_5 = false;
            org.talend.components.api.component.Connector c_tDBRow_5 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_5.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBRow_5 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBRow_5 = true;
                }
            }
            org.apache.avro.Schema schema_tDBRow_5 = props_tDBRow_5.getSchema(c_tDBRow_5, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_5 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBRow_5, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
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
				

					if(multi_output_is_allowed_tDBRow_5) {
						row12 = new row12Struct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBRow_5 == null) {
            factory_tDBRow_5 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBRow_5.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBRow_5.setWrapped(factory_tDBRow_5.convertToAvro(data_tDBRow_5));
                Object columnValue_0_tDBRow_5 = outgoingEnforcer_tDBRow_5.get(0);
                        row12.X_DASH_DET = (Boolean) (columnValue_0_tDBRow_5);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_5) {
				java.util.Map<String,Object> info_tDBRow_5 = e_tDBRow_5.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBRow_5 = null;
					if(info_tDBRow_5.containsKey("error")){
						errorMessage_tDBRow_5 = info_tDBRow_5.get("error");
					}else if(info_tDBRow_5.containsKey("errorMessage")){
						errorMessage_tDBRow_5 = info_tDBRow_5.get("errorMessage");
					}else{
						errorMessage_tDBRow_5 = "Rejected but error message missing";
					}
					errorMessage_tDBRow_5 = "Row "+ nb_line_tDBRow_5 + ": "+errorMessage_tDBRow_5;
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

	

	
	
	currentComponent="tDBRow_5";
	
	


 


	tos_count_tDBRow_5++;

/**
 * [tDBRow_5 main ] stop
 */
	
	/**
	 * [tDBRow_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_5";
	
	


 



/**
 * [tDBRow_5 process_data_begin ] stop
 */
// Start of branch "row12"
if(row12 != null) { 



	
	/**
	 * [tJavaRow_1 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row12","tDBRow_5","tDBRow_1","tSnowflakeRow","tJavaRow_1","tJavaRow_1","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row12 - " + (row12==null? "": row12.toLogString()));
    			}
    		

    System.out.println("table PROD_DATA.INVENTORY.INVENTORY_MASTER_INVMST status: "+ row12.X_DASH_DET); 

    nb_line_tJavaRow_1++;   

 


	tos_count_tJavaRow_1++;

/**
 * [tJavaRow_1 main ] stop
 */
	
	/**
	 * [tJavaRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tJavaRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 process_data_end ] stop
 */

} // End of branch "row12"




	
	/**
	 * [tDBRow_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_5";
	
	


 



/**
 * [tDBRow_5 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_5 end ] start
	 */

	

	
	
	currentComponent="tDBRow_5";
	
	
// end of generic


resourceMap.put("finish_tDBRow_5", Boolean.TRUE);

    } // while  
    } // end of "if (sourceOrSink_tDBRow_5 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBRow_5 = null;
    if (reader_tDBRow_5 != null) {
        reader_tDBRow_5.close();
        resultMap_tDBRow_5 = reader_tDBRow_5.getReturnValues();
    }
if(resultMap_tDBRow_5!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBRow_5 : resultMap_tDBRow_5.entrySet()) {
		switch(entry_tDBRow_5.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBRow_5.setComponentData("tDBRow_5", "ERROR_MESSAGE", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_LINE", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_SUCCESS", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_REJECT", entry_tDBRow_5.getValue());
			break;
		default :
            StringBuilder studio_key_tDBRow_5 = new StringBuilder();
            for (int i_tDBRow_5 = 0; i_tDBRow_5 < entry_tDBRow_5.getKey().length(); i_tDBRow_5++) {
                char ch_tDBRow_5 = entry_tDBRow_5.getKey().charAt(i_tDBRow_5);
                if(Character.isUpperCase(ch_tDBRow_5) && i_tDBRow_5> 0) {
                	studio_key_tDBRow_5.append('_');
                }
                studio_key_tDBRow_5.append(ch_tDBRow_5);
            }
			container_tDBRow_5.setComponentData("tDBRow_5", studio_key_tDBRow_5.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBRow_5.getValue());
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

	

	
	
	currentComponent="tJavaRow_1";
	
	

globalMap.put("tJavaRow_1_NB_LINE",nb_line_tJavaRow_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row12",2,0,
			 			"tDBRow_5","tDBRow_1","tSnowflakeRow","tJavaRow_1","tJavaRow_1","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_1", true);
end_Hash.put("tJavaRow_1", System.currentTimeMillis());

   			if (row12.X_DASH_DET == true) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If3", 0, "true");
					}
				tFileDelete_2Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If3", 0, "false");
					}   	 
   				}
   			if (row12.X_DASH_DET == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tSendMail_2Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}
   			if (row12.X_DASH_DET == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If2", 0, "true");
					}
				tDie_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If2", 0, "false");
					}   	 
   				}



/**
 * [tJavaRow_1 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBRow_5 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_5";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_5")==null){
    if(resourceMap.get("reader_tDBRow_5")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBRow_5")).close();
		} catch (java.io.IOException e_tDBRow_5) {
			String errorMessage_tDBRow_5 = "failed to release the resource in tDBRow_5 :" + e_tDBRow_5.getMessage();
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

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_5_SUBPROCESS_STATE", 1);
	}
	

public void tFileDelete_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileDelete_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_2");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tFileDelete_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileDelete_2", false);
		start_Hash.put("tFileDelete_2", System.currentTimeMillis());
		
	
	currentComponent="tFileDelete_2";
	
	
		int tos_count_tFileDelete_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileDelete_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileDelete_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileDelete_2 = new StringBuilder();
                    log4jParamters_tFileDelete_2.append("Parameters:");
                            log4jParamters_tFileDelete_2.append("PATH" + " = " + "\"/data/talend/data_repository/INVMST.zip\"");
                        log4jParamters_tFileDelete_2.append(" | ");
                            log4jParamters_tFileDelete_2.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_2.append(" | ");
                            log4jParamters_tFileDelete_2.append("FOLDER_FILE" + " = " + "true");
                        log4jParamters_tFileDelete_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileDelete_2 - "  + (log4jParamters_tFileDelete_2) );
                    } 
                } 
            new BytesLimit65535_tFileDelete_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileDelete_2", "tFileDelete_1", "tFileDelete");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileDelete_2 begin ] stop
 */
	
	/**
	 * [tFileDelete_2 main ] start
	 */

	

	
	
	currentComponent="tFileDelete_2";
	
	

 

				final StringBuffer log4jSb_tFileDelete_2 = new StringBuffer();
			
class DeleteFoldertFileDelete_2{
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
        	if(filed[i].isDirectory()) {
            	deleteDirectory(filed[i]);
            }
            filed[i].delete();
        }
    }

}
	java.io.File path_tFileDelete_2=new java.io.File("/data/talend/data_repository/INVMST.zip");
	if(path_tFileDelete_2.exists()){
		if(path_tFileDelete_2.isFile()){
	    	if(path_tFileDelete_2.delete()){
	    		globalMap.put("tFileDelete_2_CURRENT_STATUS", "File deleted.");
				log.info("tFileDelete_2 - File : "+ path_tFileDelete_2.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_2_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("The file " + path_tFileDelete_2.getAbsolutePath() + " can't be deleted.");
	    	}
		}else if(path_tFileDelete_2.isDirectory()){ 
	    	DeleteFoldertFileDelete_2 dftFileDelete_2 = new DeleteFoldertFileDelete_2();
	    	if(dftFileDelete_2.delete(path_tFileDelete_2)){
	    		globalMap.put("tFileDelete_2_CURRENT_STATUS", "Path deleted.");
				log.info("tFileDelete_2 - Directory : "+ path_tFileDelete_2.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_2_CURRENT_STATUS", "No path deleted.");
			throw new RuntimeException("The directory " + path_tFileDelete_2.getAbsolutePath() + " can not be deleted.");
	    	}
		}
	}else{
		globalMap.put("tFileDelete_2_CURRENT_STATUS", "File or path does not exist or is invalid.");
    		throw new RuntimeException("File or path does not exist or is invalid.");
    }
    globalMap.put("tFileDelete_2_DELETE_PATH","/data/talend/data_repository/INVMST.zip");
 


	tos_count_tFileDelete_2++;

/**
 * [tFileDelete_2 main ] stop
 */
	
	/**
	 * [tFileDelete_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileDelete_2";
	
	

 



/**
 * [tFileDelete_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileDelete_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileDelete_2";
	
	

 



/**
 * [tFileDelete_2 process_data_end ] stop
 */
	
	/**
	 * [tFileDelete_2 end ] start
	 */

	

	
	
	currentComponent="tFileDelete_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFileDelete_2 - "  + ("Done.") );

ok_Hash.put("tFileDelete_2", true);
end_Hash.put("tFileDelete_2", System.currentTimeMillis());




/**
 * [tFileDelete_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileDelete_2 finally ] start
	 */

	

	
	
	currentComponent="tFileDelete_2";
	
	

 



/**
 * [tFileDelete_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tSendMail_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_2", false);
		start_Hash.put("tSendMail_2", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_2";
	
	
		int tos_count_tSendMail_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_2{
                    public void limitLog4jByte() throws Exception{
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
                            log4jParamters_tSendMail_2.append("MESSAGE" + " = " + "jobName + \"  Failed!!!, this email is triggered from INVENTORY_MASTER_INVMST Subjob because its missing data \" ");
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
                if(log.isDebugEnabled())
            log.debug("tSendMail_2 - "  + (log4jParamters_tSendMail_2) );
                    } 
                } 
            new BytesLimit65535_tSendMail_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_2", "tSendMail_2", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_2 begin ] stop
 */
	
	/**
	 * [tSendMail_2 main ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 

	String smtpHost_tSendMail_2 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_2 = "25";
	String from_tSendMail_2 = (context.From);
    String to_tSendMail_2 = (context.To).replace(";",",");
    String cc_tSendMail_2 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_2 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_2 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

	String message_tSendMail_2 = ((jobName + "  Failed!!!, this email is triggered from INVENTORY_MASTER_INVMST Subjob because its missing data " ) == null || "".equals(jobName + "  Failed!!!, this email is triggered from INVENTORY_MASTER_INVMST Subjob because its missing data " )) ? "\"\"" : (jobName + "  Failed!!!, this email is triggered from INVENTORY_MASTER_INVMST Subjob because its missing data " ) ;
	java.util.Properties props_tSendMail_2 = System.getProperties();     
	props_tSendMail_2.put("mail.smtp.host", smtpHost_tSendMail_2);
	props_tSendMail_2.put("mail.smtp.port", smtpPort_tSendMail_2);
	
		props_tSendMail_2.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_2 - Connection attempt to '" + smtpHost_tSendMail_2 +"'.");
		
		  
			props_tSendMail_2.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_2 = javax.mail.Session.getInstance(props_tSendMail_2, null);    
		
		
			log.info("tSendMail_2 - Connection to '" + smtpHost_tSendMail_2 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_2 = new javax.mail.internet.MimeMessage(session_tSendMail_2);
		msg_tSendMail_2.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_2, null));
		msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_2, false));
		if (cc_tSendMail_2 != null) msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_2, false));
		if (bcc_tSendMail_2 != null) msg_tSendMail_2.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_2, false));
		msg_tSendMail_2.setSubject(subject_tSendMail_2);

		for (int i_tSendMail_2 = 0; i_tSendMail_2 < headers_tSendMail_2.size(); i_tSendMail_2++) {
			java.util.Map<String, String> header_tSendMail_2 = headers_tSendMail_2.get(i_tSendMail_2);
			msg_tSendMail_2.setHeader(header_tSendMail_2.get("KEY"), header_tSendMail_2.get("VALUE"));    
		}  
		msg_tSendMail_2.setSentDate(new Date());
		msg_tSendMail_2.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_2 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_2.setText(message_tSendMail_2,"ISO-8859-15", "plain");
		mp_tSendMail_2.addBodyPart(mbpText_tSendMail_2);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_2 = null;

		for (int i_tSendMail_2 = 0; i_tSendMail_2 < attachments_tSendMail_2.size(); i_tSendMail_2++){
			String filename_tSendMail_2 = attachments_tSendMail_2.get(i_tSendMail_2);
			javax.activation.FileDataSource fds_tSendMail_2 = null;
			java.io.File file_tSendMail_2 = new java.io.File(filename_tSendMail_2);
			
				if (!file_tSendMail_2.exists()){
					continue;
				}
			
    		if (file_tSendMail_2.isDirectory()){
				java.io.File[] subFiles_tSendMail_2 = file_tSendMail_2.listFiles();
				for(java.io.File subFile_tSendMail_2 : subFiles_tSendMail_2){
					if (subFile_tSendMail_2.isFile()){
						fds_tSendMail_2 = new javax.activation.FileDataSource(subFile_tSendMail_2.getAbsolutePath());
						mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_2.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2));
						mbpFile_tSendMail_2.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
						if(contentTransferEncoding_tSendMail_2.get(i_tSendMail_2).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
					}
				}
    		}else{
				mbpFile_tSendMail_2 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_2 = new javax.activation.FileDataSource(filename_tSendMail_2);
				mbpFile_tSendMail_2.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_2)); 
				mbpFile_tSendMail_2.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_2.getName()));
				if(contentTransferEncoding_tSendMail_2.get(i_tSendMail_2).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_2.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_2.addBodyPart(mbpFile_tSendMail_2);
			}
		}
		// -- set the content --
		msg_tSendMail_2.setContent(mp_tSendMail_2);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_2 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_2.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_2.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_2.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_2.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_2.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_2);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_2 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_2);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_2_ERROR_MESSAGE",e.getMessage());
  		
			
				log.error("tSendMail_2 - " + e.toString());
			
  			System.err.println(e.toString());
		
	}finally{
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

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_2 end ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSendMail_2 - "  + ("Done.") );

ok_Hash.put("tSendMail_2", true);
end_Hash.put("tSendMail_2", System.currentTimeMillis());




/**
 * [tSendMail_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tSendMail_2 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_2";
	
	

 



/**
 * [tSendMail_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";
	
	
		int tos_count_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_1{
                    public void limitLog4jByte() throws Exception{
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
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + (log4jParamters_tDie_1) );
                    } 
                } 
            new BytesLimit65535_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

	try {
				tLogCatcher_1.addMessage("tDie", "tDie_1", 5, "the end is near", 4);
				tLogCatcher_1Process(globalMap);
				
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("the end is near");
	
		log.error("tDie_1 - The die message: "+"the end is near");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "the end is near");
	globalMap.put("tDie_1_DIE_MESSAGES", "the end is near");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        

    
	if(true){	
		TDieException e_tDie_1 = new TDieException();

		
			if(enableLogStash) {
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

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Done.") );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "talendJobLog");
		org.slf4j.MDC.put("_subJobPid", TalendString.getAsciiRandomString(6));
	

	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";
	
	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
			java.lang.Exception e_talendJobLog = jcm.exception;
			if(e_talendJobLog!=null) {
				try(java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
					e_talendJobLog.printStackTrace(pw_talendJobLog);
					builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
				}
			}

			if(jcm.extra_info!=null) {
				builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
			}
				
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
				.connectorId(jcm.component_id)
				.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label).build();

			auditLogger_talendJobLog.exception(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    private final org.talend.components.common.runtime.SharedConnectionsPool connectionPool = new org.talend.components.common.runtime.SharedConnectionsPool() {
    	public java.sql.Connection getDBConnection(String dbDriver, String url, String userName, String password, String dbConnectionName)
            throws ClassNotFoundException, java.sql.SQLException {
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
    private final static java.util.Map<String,String> mdcInfo = new java.util.HashMap<>();

    public static void main(String[] args){
        final INVENTORY_MASTER_INVMST INVENTORY_MASTER_INVMSTClass = new INVENTORY_MASTER_INVMST();

        int exitCode = INVENTORY_MASTER_INVMSTClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'INVENTORY_MASTER_INVMST' - Done.");
	        }

        System.exit(exitCode);
    }
	

	
	
	private void getjobInfo() {
		final String TEMPLATE_PATH = "src/main/templates/jobInfo_template.properties";
		final String BUILD_PATH = "../jobInfo.properties";
		final String path = this.getClass().getResource("").getPath();
		if(path.lastIndexOf("target") > 0) {
			final java.io.File templateFile = new java.io.File(
					path.substring(0, path.lastIndexOf("target")).concat(TEMPLATE_PATH));
			if (templateFile.exists()) {
				readJobInfo(templateFile);
				return;
			}
		}
			readJobInfo(new java.io.File(BUILD_PATH));
	}

    private void readJobInfo(java.io.File jobInfoFile){
	
        if(jobInfoFile.exists()) {
            try (java.io.InputStream is = new java.io.FileInputStream(jobInfoFile)) {
            	jobInfo.load(is);
            } catch (IOException e) {
            	 
                log.debug("Read jobInfo.properties file fail: " + e.getMessage());
                
            }
        }
		log.info(String.format("Project name: %s\tJob name: %s\tGIT Commit ID: %s\tTalend Version: %s",
				projectName,jobName,jobInfo.getProperty("gitCommitId"), "8.0.1.20230418_1502-patch"));
		
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

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
			}

	        getjobInfo();
			log.info("TalendJob: 'INVENTORY_MASTER_INVMST' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_DGSfcNmuEeuE0KkKg4NQQA");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-07-10T13:25:43.146661Z");

                java.lang.management.RuntimeMXBean mx = java.lang.management.ManagementFactory.getRuntimeMXBean();
                String[] mxNameTable = mx.getName().split("@"); //$NON-NLS-1$
                if (mxNameTable.length == 2) {
                    org.slf4j.MDC.put("_systemPid", mxNameTable[0]);
                } else {
                    org.slf4j.MDC.put("_systemPid", String.valueOf(java.lang.Thread.currentThread().getId()));
                }

		
		
			if(enableLogStash) {
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

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

            org.slf4j.MDC.put("_pid", pid);

        if (rootPid==null) {
            rootPid = pid;
        }

            org.slf4j.MDC.put("_rootPid", rootPid);

        if (fatherPid==null) {
            fatherPid = pid;
        }else{
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
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = INVENTORY_MASTER_INVMST.class.getClassLoader().getResourceAsStream("at_talend_jobs/inventory_master_invmst_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = INVENTORY_MASTER_INVMST.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
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
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("To", "id_String");
                        if(context.getStringValue("To") == null) {
                            context.To = null;
                        } else {
                            context.To=(String) context.getProperty("To");
                        }
                        context.setContextType("From", "id_String");
                        if(context.getStringValue("From") == null) {
                            context.From = null;
                        } else {
                            context.From=(String) context.getProperty("From");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("To")) {
                context.To = (String) parentContextMap.get("To");
            }if (parentContextMap.containsKey("From")) {
                context.From = (String) parentContextMap.get("From");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'INVENTORY_MASTER_INVMST' - Started.");
            mdcInfo.putAll(org.slf4j.MDC.getCopyOfContextMap());

if(execStat) {
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


this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_2) {
globalMap.put("tPrejob_2_SUBPROCESS_STATE", -1);

e_tPrejob_2.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tDBRow_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBRow_1) {
globalMap.put("tDBRow_1_SUBPROCESS_STATE", -1);

e_tDBRow_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_2) {
globalMap.put("tPostjob_2_SUBPROCESS_STATE", -1);

e_tPostjob_2.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : INVENTORY_MASTER_INVMST");
        }
		if(enableLogStash) {
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


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");
    resumeUtil.flush();


        org.slf4j.MDC.remove("_subJobName");
        org.slf4j.MDC.remove("_subJobPid");
        org.slf4j.MDC.remove("_systemPid");
        log.info("TalendJob: 'INVENTORY_MASTER_INVMST' - Finished - status: " + status + " returnCode: " + returnCode );

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




            connections.put("tDBConnection_1_connection", globalMap.get("tDBConnection_1_connection"));
            connections.put("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES", globalMap.get("tDBConnection_1_COMPONENT_RUNTIME_PROPERTIES"));


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
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
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
 *     886838 characters generated by Talend Cloud Data Management Platform 
 *     on the July 10, 2023 at 9:25:43 AM EDT
 ************************************************************************************************/