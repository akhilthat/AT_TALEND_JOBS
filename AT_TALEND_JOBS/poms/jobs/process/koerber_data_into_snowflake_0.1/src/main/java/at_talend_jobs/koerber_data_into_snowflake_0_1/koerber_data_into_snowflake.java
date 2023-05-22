
package at_talend_jobs.koerber_data_into_snowflake_0_1;

import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.SQLike;
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
 




	//the import part of tLibraryLoad_1
	//import java.util.List;

	//the import part of tJava_1
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: koerber_data_into_snowflake Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class koerber_data_into_snowflake implements TalendJob {
	static {System.setProperty("TalendJob.log", "koerber_data_into_snowflake.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(koerber_data_into_snowflake.class);
	

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
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
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
	private final String jobName = "koerber_data_into_snowflake";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_WvDJYOtkEe2HwtcbA5NKJQ", "0.1");
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
				koerber_data_into_snowflake.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(koerber_data_into_snowflake.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
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

			public void tLibraryLoad_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLibraryLoad_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFTPConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFTPConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFTPGet_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFTPGet_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileUnarchive_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileList_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputExcel_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileList_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLibraryLoad_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFTPConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFTPGet_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileList_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void tLibraryLoad_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tLibraryLoad_1");
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
	 * [tLibraryLoad_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLibraryLoad_1", false);
		start_Hash.put("tLibraryLoad_1", System.currentTimeMillis());
		
	
	currentComponent="tLibraryLoad_1";
	
	
		int tos_count_tLibraryLoad_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tLibraryLoad_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tLibraryLoad_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tLibraryLoad_1 = new StringBuilder();
                    log4jParamters_tLibraryLoad_1.append("Parameters:");
                            log4jParamters_tLibraryLoad_1.append("LIBRARY" + " = " + "mvn:org.talend.libraries/ant-1.10.1/6.0.0-SNAPSHOT/jar");
                        log4jParamters_tLibraryLoad_1.append(" | ");
                            log4jParamters_tLibraryLoad_1.append("HOTLIBS" + " = " + "[]");
                        log4jParamters_tLibraryLoad_1.append(" | ");
                            log4jParamters_tLibraryLoad_1.append("IMPORT" + " = " + "//import java.util.List;");
                        log4jParamters_tLibraryLoad_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tLibraryLoad_1 - "  + (log4jParamters_tLibraryLoad_1) );
                    } 
                } 
            new BytesLimit65535_tLibraryLoad_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tLibraryLoad_1", "tLibraryLoad_1", "tLibraryLoad");
				talendJobLogProcess(globalMap);
			}
			




 



/**
 * [tLibraryLoad_1 begin ] stop
 */
	
	/**
	 * [tLibraryLoad_1 main ] start
	 */

	

	
	
	currentComponent="tLibraryLoad_1";
	
	

 


	tos_count_tLibraryLoad_1++;

/**
 * [tLibraryLoad_1 main ] stop
 */
	
	/**
	 * [tLibraryLoad_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLibraryLoad_1";
	
	

 



/**
 * [tLibraryLoad_1 process_data_begin ] stop
 */
	
	/**
	 * [tLibraryLoad_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLibraryLoad_1";
	
	

 



/**
 * [tLibraryLoad_1 process_data_end ] stop
 */
	
	/**
	 * [tLibraryLoad_1 end ] start
	 */

	

	
	
	currentComponent="tLibraryLoad_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tLibraryLoad_1 - "  + ("Done.") );

ok_Hash.put("tLibraryLoad_1", true);
end_Hash.put("tLibraryLoad_1", System.currentTimeMillis());




/**
 * [tLibraryLoad_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLibraryLoad_1:OnSubjobOk1", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tJava_1Process(globalMap); 
						
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tLibraryLoad_1:OnSubjobOk2", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
								} 
							
							tFileList_3Process(globalMap); 
						



	
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
	 * [tLibraryLoad_1 finally ] start
	 */

	

	
	
	currentComponent="tLibraryLoad_1";
	
	

 



/**
 * [tLibraryLoad_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tJava_1");
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
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";
	
	
		int tos_count_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJava_1", "tJava_1", "tJava");
				talendJobLogProcess(globalMap);
			}
			


String foo = "bar";
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJava_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
								} 
							
							tFTPConnection_1Process(globalMap); 
						



	
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
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	

public void tFTPConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFTPConnection_1");
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
	 * [tFTPConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFTPConnection_1", false);
		start_Hash.put("tFTPConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tFTPConnection_1";
	
	
		int tos_count_tFTPConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFTPConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFTPConnection_1 = new StringBuilder();
                    log4jParamters_tFTPConnection_1.append("Parameters:");
                            log4jParamters_tFTPConnection_1.append("HOST" + " = " + "\"ftp.envistacorp.com\"");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("PORT" + " = " + "22");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("USER" + " = " + "\"VitaminShoppe\"");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:cxX0tTuy4w41+bJduSfsch4QhnHspOsvV+DrEItsaTOGa/nE4wbhR44i").substring(0, 4) + "...");     
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("SFTP" + " = " + "true");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("AUTH_METHOD" + " = " + "PASSWORD");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("USE_ENCODING" + " = " + "false");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("USE_PROXY" + " = " + "false");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("CONNECTION_TIMEOUT" + " = " + "0");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("USE_STRICT_REPLY_PARSING" + " = " + "true");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("CONFIG_CLIENT" + " = " + "true");
                        log4jParamters_tFTPConnection_1.append(" | ");
                            log4jParamters_tFTPConnection_1.append("CLIENT_PARAMETERS" + " = " + "[{VALUE="+("\"ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,curve25519-sha256,curve25519-sha256@libssh.org,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256\"")+", PARAMETER="+("\"kex\"")+"}, {VALUE="+("\"ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256\"")+", PARAMETER="+("\"server_host_key\"")+"}, {VALUE="+("\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"")+", PARAMETER="+("\"cipher.s2c\"")+"}, {VALUE="+("\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"")+", PARAMETER="+("\"cipher.c2s\"")+"}, {VALUE="+("\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"")+", PARAMETER="+("\"mac.s2c\"")+"}, {VALUE="+("\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"")+", PARAMETER="+("\"mac.c2s\"")+"}]");
                        log4jParamters_tFTPConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + (log4jParamters_tFTPConnection_1) );
                    } 
                } 
            new BytesLimit65535_tFTPConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFTPConnection_1", "tFTPConnection_1", "tFTPConnection");
				talendJobLogProcess(globalMap);
			}
			

 
int connectionTimeout_tFTPConnection_1 = Integer.valueOf(0);
	class MyUserInfo implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {
 
      		String decryptedPassphrase_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:u3kFBLtTTrPcmw6rDAMupTZi00Gdv2ydT9i7MgRbHm93mQ==");

		String passphrase_tFTPConnection_1 = decryptedPassphrase_tFTPConnection_1;

		public String getPassphrase() { return passphrase_tFTPConnection_1; }

		public boolean promptPassword(String arg0) { return true; } 

		public boolean promptPassphrase(String arg0) { return true; } 

		public boolean promptYesNo(String arg0) { return true; } 

		public void showMessage(String arg0) { } 

		public String[] promptKeyboardInteractive(String destination, String name, String instruction, String[] prompt,
		boolean[] echo) {
			return new String[] {getPassword()};
		}

		public String getPassword() {
			
				

				 
	final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:1fFNd1rvF8NIN0DrciFVKKzLnRmX29j5eCP5t/j5eYoM+AeMpqsdvr3x");

				return decryptedPassword_tFTPConnection_1;
			
		}
	};
	final com.jcraft.jsch.UserInfo defaultUserInfo_tFTPConnection_1 = new MyUserInfo();
	
	
	
	

boolean retry_tFTPConnection_1 = false;
int retry_count_tFTPConnection_1 = 0;
int retry_max_tFTPConnection_1 = 5;

com.jcraft.jsch.Session session_tFTPConnection_1 = null;
com.jcraft.jsch.Channel channel_tFTPConnection_1 = null;

class JschLogger_tFTPConnection_1 implements com.jcraft.jsch.Logger {
    public boolean isEnabled(int level){
        return true;
    }
    public void log(int level, String message){
    	
        	log.debug(message);
    }
}

do {
    retry_tFTPConnection_1 = false;

    		com.jcraft.jsch.JSch.setConfig("kex", "ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,curve25519-sha256,curve25519-sha256@libssh.org,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256");
    		com.jcraft.jsch.JSch.setConfig("server_host_key", "ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256");
    		com.jcraft.jsch.JSch.setConfig("cipher.s2c", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com");
    		com.jcraft.jsch.JSch.setConfig("cipher.c2s", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com");
    		com.jcraft.jsch.JSch.setConfig("mac.s2c", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512");
    		com.jcraft.jsch.JSch.setConfig("mac.c2s", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512");
    com.jcraft.jsch.JSch.setLogger(new JschLogger_tFTPConnection_1());
    com.jcraft.jsch.JSch jsch_tFTPConnection_1 = new com.jcraft.jsch.JSch(); 


    session_tFTPConnection_1 = jsch_tFTPConnection_1.getSession("VitaminShoppe", "ftp.envistacorp.com", 22);
    session_tFTPConnection_1.setConfig("PreferredAuthentications", "publickey,password,keyboard-interactive,gssapi-with-mic");

            log.info("tFTPConnection_1 - SFTP authentication using a password.");
 
	final String decryptedPassword_tFTPConnection_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:FrtY13SDUoX2tuBUoijeogqH9A7PeMMSPMqt6G8HLumK0D/v5tjouy72");

        session_tFTPConnection_1.setPassword(decryptedPassword_tFTPConnection_1); 

    session_tFTPConnection_1.setUserInfo(defaultUserInfo_tFTPConnection_1); 
        if(("true").equals(System.getProperty("http.proxySet"))) {

//check if the host is in the excludes for proxy
    boolean isHostIgnored_tFTPConnection_1 = false;
    String nonProxyHostsString_tFTPConnection_1 = System.getProperty("http.nonProxyHosts");
    String[] nonProxyHosts_tFTPConnection_1 = (nonProxyHostsString_tFTPConnection_1 == null) ? new String[0] : nonProxyHostsString_tFTPConnection_1.split("\\|");
    for (String nonProxyHost : nonProxyHosts_tFTPConnection_1) {
        if (("ftp.envistacorp.com").matches(nonProxyHost.trim())) {
            isHostIgnored_tFTPConnection_1 = true;
            break;
        }
    }
            if (!isHostIgnored_tFTPConnection_1) {
                com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(System.getProperty("http.proxyHost"),Integer.parseInt(System.getProperty("http.proxyPort")));
                if(!"".equals(System.getProperty("http.proxyUser"))){
                    proxy_tFTPConnection_1.setUserPasswd(System.getProperty("http.proxyUser"),System.getProperty("http.proxyPassword"));
                }
                session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
            }
        } else if ("local".equals(System.getProperty("http.proxySet"))) {
            String uriString = "ftp.envistacorp.com" + ":" + 22;
            java.net.Proxy proxyToUse = org.talend.proxy.TalendProxySelector.getInstance().getProxyForUriString(uriString);

            if (!proxyToUse.equals(java.net.Proxy.NO_PROXY)) {
                java.net.InetSocketAddress proxyAddress = (java.net.InetSocketAddress) proxyToUse.address();
                String proxyHost = proxyAddress.getAddress().getHostAddress();
                int proxyPort = proxyAddress.getPort();

                com.jcraft.jsch.ProxyHTTP proxy_tFTPConnection_1 = new com.jcraft.jsch.ProxyHTTP(proxyHost, proxyPort);

                org.talend.proxy.ProxyCreds proxyCreds = org.talend.proxy.TalendProxyAuthenticator.getInstance().getCredsForProxyURI(proxyHost + ":" + proxyPort);
                if (proxyCreds != null) {
                    proxy_tFTPConnection_1.setUserPasswd(proxyCreds.getUser(), proxyCreds.getPass());
                }

                session_tFTPConnection_1.setProxy(proxy_tFTPConnection_1);
            }
        }

        log.info("tFTPConnection_1 - Attempt to connect to  '" + "ftp.envistacorp.com" + "' with username '" + "VitaminShoppe" + "'.");

    channel_tFTPConnection_1 = null;
    try {
        if (connectionTimeout_tFTPConnection_1 > 0) {
            session_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
        } else {
            session_tFTPConnection_1.connect();
        }
        channel_tFTPConnection_1 = session_tFTPConnection_1.openChannel("sftp");
        if (connectionTimeout_tFTPConnection_1 > 0) {
            channel_tFTPConnection_1.connect(connectionTimeout_tFTPConnection_1);
        } else {
            channel_tFTPConnection_1.connect();
        }
            log.info("tFTPConnection_1 - Connect to '" + "ftp.envistacorp.com" + "' has succeeded.");
    } catch (com.jcraft.jsch.JSchException e_tFTPConnection_1) {
        try {
            if(channel_tFTPConnection_1!=null) {
                channel_tFTPConnection_1.disconnect();
            }

            if(session_tFTPConnection_1!=null) {
                session_tFTPConnection_1.disconnect();
            }
        } catch(java.lang.Exception ce_tFTPConnection_1) {
                log.warn("tFTPConnection_1 - close sftp connection failed : " + ce_tFTPConnection_1.getClass() + " : " + ce_tFTPConnection_1.getMessage());
        }

        String message_tFTPConnection_1 = new TalendException(null, null, null).getExceptionCauseMessage(e_tFTPConnection_1);
        if(message_tFTPConnection_1.contains("Signature length not correct") || message_tFTPConnection_1.contains("connection is closed by foreign host")) {
            retry_tFTPConnection_1 = true;
            retry_count_tFTPConnection_1++;
            log.info("tFTPConnection_1 - connect: Signature length not correct or connection is closed by foreign host, so retry, retry time : " + retry_count_tFTPConnection_1);
        } else {
            throw e_tFTPConnection_1;
        }
    }
} while(retry_tFTPConnection_1 && (retry_count_tFTPConnection_1 < retry_max_tFTPConnection_1));

com.jcraft.jsch.ChannelSftp c_tFTPConnection_1 = (com.jcraft.jsch.ChannelSftp)channel_tFTPConnection_1;
	
	
	
	globalMap.put("conn_tFTPConnection_1", c_tFTPConnection_1);

 



/**
 * [tFTPConnection_1 begin ] stop
 */
	
	/**
	 * [tFTPConnection_1 main ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";
	
	

 


	tos_count_tFTPConnection_1++;

/**
 * [tFTPConnection_1 main ] stop
 */
	
	/**
	 * [tFTPConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";
	
	

 



/**
 * [tFTPConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tFTPConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";
	
	

 



/**
 * [tFTPConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tFTPConnection_1 end ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFTPConnection_1 - "  + ("Done.") );

ok_Hash.put("tFTPConnection_1", true);
end_Hash.put("tFTPConnection_1", System.currentTimeMillis());




/**
 * [tFTPConnection_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFTPConnection_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tFTPGet_1Process(globalMap); 
						



	
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
	 * [tFTPConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tFTPConnection_1";
	
	

 



/**
 * [tFTPConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFTPConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tFTPGet_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFTPGet_1");
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
	 * [tFTPGet_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFTPGet_1", false);
		start_Hash.put("tFTPGet_1", System.currentTimeMillis());
		
	
	currentComponent="tFTPGet_1";
	
	
		int tos_count_tFTPGet_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFTPGet_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFTPGet_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFTPGet_1 = new StringBuilder();
                    log4jParamters_tFTPGet_1.append("Parameters:");
                            log4jParamters_tFTPGet_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("CONNECTION" + " = " + "tFTPConnection_1");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("LOCALDIR" + " = " + "\"//wva-sql-etl/sftp/ftp_files/  - /sftp\"");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("REMOTEDIR" + " = " + "\"/Vitamin Shoppe/EDW Files/\"");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("SFTPOVERWRITE" + " = " + "overwrite");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("PERL5_REGEX" + " = " + "false");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("FILES" + " = " + "[{FILEMASK="+("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".xlsx\"")+"}, {FILEMASK="+("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".zip\"")+"}]");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFTPGet_1.append(" | ");
                            log4jParamters_tFTPGet_1.append("PRINT_MESSAGE" + " = " + "false");
                        log4jParamters_tFTPGet_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFTPGet_1 - "  + (log4jParamters_tFTPGet_1) );
                    } 
                } 
            new BytesLimit65535_tFTPGet_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFTPGet_1", "tFTPGet_1", "tFTPGet");
				talendJobLogProcess(globalMap);
			}
			

 
int nb_file_tFTPGet_1 = 0;  
	final java.util.List<String> msg_tFTPGet_1 = new java.util.ArrayList<String>();

	

			class MyProgressMonitor_tFTPGet_1 implements com.jcraft.jsch.SftpProgressMonitor {

				private long percent = -1;

				public void init(int op, String src, String dest, long max) {}

				public boolean count(long count) {return true;}

				public void end() {}
			} 

			class SFTPGetter_tFTPGet_1 {

				private com.jcraft.jsch.ChannelSftp cnlSFTP = null;

				private com.jcraft.jsch.SftpProgressMonitor monitor = null;

				private int count = 0;

				public void getAllFiles(String remoteDirectory, String localDirectory) throws com.jcraft.jsch.SftpException {
      
					chdir(remoteDirectory);
					java.util.Vector sftpFiles = cnlSFTP.ls(".");

					for (Object sftpFile : sftpFiles) {
						com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
						com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

						if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
						continue;
						}

						if (attrs.isDir()) {
							java.io.File localFile = new java.io.File(localDirectory + "/" + lsEntry.getFilename());
							if (!localFile.exists()) {
								localFile.mkdir();
							}
							getAllFiles(remoteDirectory + "/" + lsEntry.getFilename(), localDirectory + "/" + lsEntry.getFilename());
							chdir(remoteDirectory);
						} else if (!attrs.isLink()) {
							downloadFile(localDirectory, lsEntry.getFilename());
						}
					}
				}

				public void getFiles(String remoteDirectory, String localDirectory, String maskStr) throws com.jcraft.jsch.SftpException {
      
					chdir(remoteDirectory);
					java.util.Vector sftpFiles = cnlSFTP.ls(".");

					for (Object sftpFile : sftpFiles) {
						com.jcraft.jsch.ChannelSftp.LsEntry lsEntry = (com.jcraft.jsch.ChannelSftp.LsEntry) sftpFile;
						com.jcraft.jsch.SftpATTRS attrs = lsEntry.getAttrs();

						if ((".").equals(lsEntry.getFilename()) || ("..").equals(lsEntry.getFilename())) {
							continue;
						}

						if (!attrs.isDir() && !attrs.isLink()) {

							if (lsEntry.getFilename().matches(maskStr)) {
            					downloadFile(localDirectory, lsEntry.getFilename());
          					}
        				}
      				}
				}

				public void chdir(String path) throws com.jcraft.jsch.SftpException{
					if (!".".equals(path)) {
						cnlSFTP.cd(path);
					}
				}

				public String pwd() throws com.jcraft.jsch.SftpException{
					return cnlSFTP.pwd();
				}

				private void downloadFile(String localFileName, String remoteFileName) throws com.jcraft.jsch.SftpException {

					try {
        				cnlSFTP.get(remoteFileName, localFileName, monitor,          
            				com.jcraft.jsch.ChannelSftp.OVERWRITE
					);
						
							log.debug("tFTPGet_1 - Downloaded file " + (count +1) +  " : '" + remoteFileName + "' successfully.");
						
        				msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded successfully.");
        				
				    	globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer OK.");
			      	} catch (com.jcraft.jsch.SftpException e){
globalMap.put("tFTPGet_1_ERROR_MESSAGE",e.getMessage());

        				if (e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_FAILURE || e.id == com.jcraft.jsch.ChannelSftp.SSH_FX_BAD_MESSAGE) {
							msg_tFTPGet_1.add("file [" + remoteFileName + "] downloaded unsuccessfully.");
							globalMap.put("tFTPGet_1_CURRENT_STATUS", "File transfer fail.");
						}
				        throw e;
					}
					count++;
				}
			}

				com.jcraft.jsch.ChannelSftp c_tFTPGet_1 = (com.jcraft.jsch.ChannelSftp)globalMap.get("conn_tFTPConnection_1");
				
					if(c_tFTPGet_1!=null && c_tFTPGet_1.getSession()!=null) {
						log.info("tFTPGet_1 - Use an existing connection.Connection username: " + c_tFTPGet_1.getSession().getUserName() + ", Connection hostname: " + c_tFTPGet_1.getSession().getHost() + ", Connection port: " + c_tFTPGet_1.getSession().getPort() + "."); 
					}
				
				if(c_tFTPGet_1.getHome()!=null && !c_tFTPGet_1.getHome().equals(c_tFTPGet_1.pwd())){
			  		c_tFTPGet_1.cd(c_tFTPGet_1.getHome());
			  	}
			com.jcraft.jsch.SftpProgressMonitor monitor_tFTPGet_1 = new MyProgressMonitor_tFTPGet_1();
			SFTPGetter_tFTPGet_1 getter_tFTPGet_1 = new SFTPGetter_tFTPGet_1();
			getter_tFTPGet_1.cnlSFTP = c_tFTPGet_1;
			getter_tFTPGet_1.monitor = monitor_tFTPGet_1;
			String remotedir_tFTPGet_1 = "/Vitamin Shoppe/EDW Files/";
			if (!".".equals(remotedir_tFTPGet_1)) {
				c_tFTPGet_1.cd(remotedir_tFTPGet_1);
			}
java.util.List<String> maskList_tFTPGet_1 = new java.util.ArrayList<String>();

  maskList_tFTPGet_1.add("Vitamin Shoppe EDW All Modes Shipment Detail "+TalendDate.formatDate("MM-dd-yyyy",TalendDate.getCurrentDate())+".xlsx");
  maskList_tFTPGet_1.add("Vitamin Shoppe EDW All Modes Shipment Detail "+TalendDate.formatDate("MM-dd-yyyy",TalendDate.getCurrentDate())+".zip");
String localdir_tFTPGet_1  = "//wva-sql-etl/sftp/ftp_files/  - /sftp";  
//create folder if local direcotry (assigned by property) not exists
java.io.File dirHandle_tFTPGet_1 = new java.io.File(localdir_tFTPGet_1);

if (!dirHandle_tFTPGet_1.exists()) {
  dirHandle_tFTPGet_1.mkdirs();
}
String root_tFTPGet_1 = getter_tFTPGet_1.pwd();
if ("/".equals(root_tFTPGet_1)) {
	root_tFTPGet_1 = ".";
}

	log.info("tFTPGet_1 - Downloading files from the server.");
for (String maskStr_tFTPGet_1 : maskList_tFTPGet_1) { 

 



/**
 * [tFTPGet_1 begin ] stop
 */
	
	/**
	 * [tFTPGet_1 main ] start
	 */

	

	
	
	currentComponent="tFTPGet_1";
	
	

	try {
		globalMap.put("tFTPGet_1_CURRENT_STATUS", "No file transfered.");
		String dir_tFTPGet_1 = root_tFTPGet_1;
		
			String mask_tFTPGet_1 = maskStr_tFTPGet_1.replaceAll("\\\\", "/") ;
		
		int i_tFTPGet_1 = mask_tFTPGet_1.lastIndexOf('/'); 

		if (i_tFTPGet_1 != -1){
			dir_tFTPGet_1 = mask_tFTPGet_1.substring(0, i_tFTPGet_1); 
			mask_tFTPGet_1 = mask_tFTPGet_1.substring(i_tFTPGet_1+1);  
		}
  
		
			mask_tFTPGet_1 = org.apache.oro.text.GlobCompiler.globToPerl5(mask_tFTPGet_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
		
  
		if (dir_tFTPGet_1!=null && !"".equals(dir_tFTPGet_1)){
			if ((".*").equals(mask_tFTPGet_1)) {
				getter_tFTPGet_1.getAllFiles(dir_tFTPGet_1, localdir_tFTPGet_1);
			} else {
				getter_tFTPGet_1.getFiles(dir_tFTPGet_1, localdir_tFTPGet_1 ,mask_tFTPGet_1);
			}
		}
		getter_tFTPGet_1.chdir(root_tFTPGet_1);
	} catch(java.lang.Exception e) {
globalMap.put("tFTPGet_1_ERROR_MESSAGE",e.getMessage());
		
    		throw(e);
  		
	}

 


	tos_count_tFTPGet_1++;

/**
 * [tFTPGet_1 main ] stop
 */
	
	/**
	 * [tFTPGet_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFTPGet_1";
	
	

 



/**
 * [tFTPGet_1 process_data_begin ] stop
 */
	
	/**
	 * [tFTPGet_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFTPGet_1";
	
	

 



/**
 * [tFTPGet_1 process_data_end ] stop
 */
	
	/**
	 * [tFTPGet_1 end ] start
	 */

	

	
	
	currentComponent="tFTPGet_1";
	
	
}
nb_file_tFTPGet_1 = getter_tFTPGet_1.count;

	msg_tFTPGet_1.add(getter_tFTPGet_1.count + " files have been downloaded.");
	StringBuffer sb_tFTPGet_1 = new StringBuffer();

	for (String item_tFTPGet_1 : msg_tFTPGet_1) {
		sb_tFTPGet_1.append(item_tFTPGet_1).append("\n");
	}
	globalMap.put("tFTPGet_1_TRANSFER_MESSAGES", sb_tFTPGet_1.toString());

	    
	globalMap.put("tFTPGet_1_NB_FILE",nb_file_tFTPGet_1);
	log.info("tFTPGet_1 - Downloaded files count: " + nb_file_tFTPGet_1  + ".");


 
                if(log.isDebugEnabled())
            log.debug("tFTPGet_1 - "  + ("Done.") );

ok_Hash.put("tFTPGet_1", true);
end_Hash.put("tFTPGet_1", System.currentTimeMillis());




/**
 * [tFTPGet_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFTPGet_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tFileList_1Process(globalMap); 
						



	
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
	 * [tFTPGet_1 finally ] start
	 */

	

	
	
	currentComponent="tFTPGet_1";
	
	

 



/**
 * [tFTPGet_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFTPGet_1_SUBPROCESS_STATE", 1);
	}
	

public void tFileList_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileList_1");
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
	 * [tFileList_1 begin ] start
	 */

				
			int NB_ITERATE_tFileUnarchive_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tFileList_1", false);
		start_Hash.put("tFileList_1", System.currentTimeMillis());
		
	
	currentComponent="tFileList_1";
	
	
		int tos_count_tFileList_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileList_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileList_1 = new StringBuilder();
                    log4jParamters_tFileList_1.append("Parameters:");
                            log4jParamters_tFileList_1.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/  - /sftp\"");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("LIST_MODE" + " = " + "FILES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("INCLUDSUBDIR" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("CASE_SENSITIVE" + " = " + "YES");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ERROR" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("GLOBEXPRESSIONS" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FILES" + " = " + "[{FILEMASK="+("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".zip\"")+"}]");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_NOTHING" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILENAME" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_FILESIZE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_BY_MODIFIEDDATE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_ASC" + " = " + "true");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("ORDER_ACTION_DESC" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("IFEXCLUDE" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                            log4jParamters_tFileList_1.append("FORMAT_FILEPATH_TO_SLASH" + " = " + "false");
                        log4jParamters_tFileList_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + (log4jParamters_tFileList_1) );
                    } 
                } 
            new BytesLimit65535_tFileList_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileList_1", "tFileList_1", "tFileList");
				talendJobLogProcess(globalMap);
			}
			
	
 
  
				final StringBuffer log4jSb_tFileList_1 = new StringBuffer();
			   
    
  String directory_tFileList_1 = "//wva-sql-etl/sftp/ftp_files/  - /sftp";
  final java.util.List<String> maskList_tFileList_1 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_1 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_1.add("Vitamin Shoppe EDW All Modes Shipment Detail "+TalendDate.formatDate("MM-dd-yyyy",TalendDate.getCurrentDate())+".zip");  
  for (final String filemask_tFileList_1 : maskList_tFileList_1) {
	String filemask_compile_tFileList_1 = filemask_tFileList_1;
	
		filemask_compile_tFileList_1 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_1.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_1 = java.util.regex.Pattern.compile(filemask_compile_tFileList_1);
	patternList_tFileList_1.add(fileNamePattern_tFileList_1);
  }
  int NB_FILEtFileList_1 = 0;

  final boolean case_sensitive_tFileList_1 = true;
	
	
		log.info("tFileList_1 - Starting to search for matching entries.");
	
	
    final java.util.List<java.io.File> list_tFileList_1 = new java.util.ArrayList<java.io.File>();
    final java.util.Set<String> filePath_tFileList_1 = new java.util.HashSet<String>();
	java.io.File file_tFileList_1 = new java.io.File(directory_tFileList_1);
     
		file_tFileList_1.listFiles(new java.io.FilenameFilter() {
			public boolean accept(java.io.File dir, String name) {
				java.io.File file = new java.io.File(dir, name);
                if (!file.isDirectory()) {
                	
    	String fileName_tFileList_1 = file.getName();
		for (final java.util.regex.Pattern fileNamePattern_tFileList_1 : patternList_tFileList_1) {
          	if (fileNamePattern_tFileList_1.matcher(fileName_tFileList_1).matches()){
					if(!filePath_tFileList_1.contains(file.getAbsolutePath())) {
			          list_tFileList_1.add(file);
			          filePath_tFileList_1.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_1);
    
		log.info("tFileList_1 - Start to list files.");
	
    for (int i_tFileList_1 = 0; i_tFileList_1 < list_tFileList_1.size(); i_tFileList_1++){
      java.io.File files_tFileList_1 = list_tFileList_1.get(i_tFileList_1);
      String fileName_tFileList_1 = files_tFileList_1.getName();
      
      String currentFileName_tFileList_1 = files_tFileList_1.getName(); 
      String currentFilePath_tFileList_1 = files_tFileList_1.getAbsolutePath();
      String currentFileDirectory_tFileList_1 = files_tFileList_1.getParent();
      String currentFileExtension_tFileList_1 = null;
      
      if (files_tFileList_1.getName().contains(".") && files_tFileList_1.isFile()){
        currentFileExtension_tFileList_1 = files_tFileList_1.getName().substring(files_tFileList_1.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_1 = "";
      }
      
      NB_FILEtFileList_1 ++;
      globalMap.put("tFileList_1_CURRENT_FILE", currentFileName_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEPATH", currentFilePath_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEDIRECTORY", currentFileDirectory_tFileList_1);
      globalMap.put("tFileList_1_CURRENT_FILEEXTENSION", currentFileExtension_tFileList_1);
      globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
      
		log.info("tFileList_1 - Current file or directory path : " + currentFilePath_tFileList_1);
	  
 



/**
 * [tFileList_1 begin ] stop
 */
	
	/**
	 * [tFileList_1 main ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	

 


	tos_count_tFileList_1++;

/**
 * [tFileList_1 main ] stop
 */
	
	/**
	 * [tFileList_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	

 



/**
 * [tFileList_1 process_data_begin ] stop
 */
	NB_ITERATE_tFileUnarchive_1++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate1", 1, "exec" + NB_ITERATE_tFileUnarchive_1);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tFileUnarchive_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileUnarchive_1", false);
		start_Hash.put("tFileUnarchive_1", System.currentTimeMillis());
		
	
	currentComponent="tFileUnarchive_1";
	
	
		int tos_count_tFileUnarchive_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileUnarchive_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileUnarchive_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileUnarchive_1 = new StringBuilder();
                    log4jParamters_tFileUnarchive_1.append("Parameters:");
                            log4jParamters_tFileUnarchive_1.append("ZIPFILE" + " = " + "((String)globalMap.get(\"tFileList_1_CURRENT_FILEPATH\"))");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/koerber_data/\"");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("ROOTNAME" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("INTEGRITY" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("EXTRACTPATH" + " = " + "true");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("CHECKPASSWORD" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("PRINTOUT" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                            log4jParamters_tFileUnarchive_1.append("USE_ENCODING" + " = " + "false");
                        log4jParamters_tFileUnarchive_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileUnarchive_1 - "  + (log4jParamters_tFileUnarchive_1) );
                    } 
                } 
            new BytesLimit65535_tFileUnarchive_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileUnarchive_1", "tFileUnarchive_1", "tFileUnarchive");
				talendJobLogProcess(globalMap);
			}
			


				final StringBuffer log4jSb_tFileUnarchive_1 = new StringBuffer();
			
        com.talend.compress.zip.Util util_tFileUnarchive_1 = new com.talend.compress.zip.Util(true);

        String zipFileURL_tFileUnarchive_1 = ((String)globalMap.get("tFileList_1_CURRENT_FILEPATH"));
        String tmpFileURL_tFileUnarchive_1 = zipFileURL_tFileUnarchive_1.toLowerCase();
        String outputPath_tFileUnarchive_1 = "//wva-sql-etl/sftp/ftp_files/koerber_data/";


    if (tmpFileURL_tFileUnarchive_1.endsWith(".tar.gz") || tmpFileURL_tFileUnarchive_1.endsWith(".tgz")){
        org.apache.tools.tar.TarInputStream zip_tFileUnarchive_1 = null;
        java.io.InputStream inputStream_tFileUnarchive_1 = null;
        try {
            inputStream_tFileUnarchive_1 = new java.io.FileInputStream(zipFileURL_tFileUnarchive_1);
            inputStream_tFileUnarchive_1 = new java.util.zip.GZIPInputStream(inputStream_tFileUnarchive_1);
            zip_tFileUnarchive_1 = new org.apache.tools.tar.TarInputStream(inputStream_tFileUnarchive_1);

            org.apache.tools.tar.TarEntry entry_tFileUnarchive_1 = null;
            java.io.InputStream is_tFileUnarchive_1 = null;
            while ((entry_tFileUnarchive_1 = zip_tFileUnarchive_1.getNextEntry()) != null) {
                boolean isDirectory_tFileUnarchive_1 = entry_tFileUnarchive_1.isDirectory();
                if (!isDirectory_tFileUnarchive_1) {
                    is_tFileUnarchive_1 = zip_tFileUnarchive_1;
                }
                String filename_tFileUnarchive_1 =  entry_tFileUnarchive_1.getName();
                util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1, isDirectory_tFileUnarchive_1, is_tFileUnarchive_1);

                java.io.File f = new java.io.File(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1);
                f.setLastModified(entry_tFileUnarchive_1.getModTime().getTime());
            }
        }catch(Exception e){
globalMap.put("tFileUnarchive_1_ERROR_MESSAGE",e.getMessage());
           System.err.println(e.getMessage());
        }finally {
            if(zip_tFileUnarchive_1 != null) {
                zip_tFileUnarchive_1.close();
            } else if(inputStream_tFileUnarchive_1 != null) {
                inputStream_tFileUnarchive_1.close();
            }
        }
    } else if (tmpFileURL_tFileUnarchive_1.endsWith(".tar")){
        org.apache.tools.tar.TarInputStream zip_tFileUnarchive_1 = null;
        java.io.InputStream inputStream_tFileUnarchive_1 = null;
        try {
            inputStream_tFileUnarchive_1 = new java.io.FileInputStream(zipFileURL_tFileUnarchive_1);
            zip_tFileUnarchive_1 = new org.apache.tools.tar.TarInputStream(inputStream_tFileUnarchive_1);

            org.apache.tools.tar.TarEntry entry_tFileUnarchive_1 = null;
            java.io.InputStream is_tFileUnarchive_1 = null;
            while ((entry_tFileUnarchive_1 = zip_tFileUnarchive_1.getNextEntry()) != null) {
                boolean isDirectory_tFileUnarchive_1 = entry_tFileUnarchive_1.isDirectory();
                if (!isDirectory_tFileUnarchive_1) {
                    is_tFileUnarchive_1 = zip_tFileUnarchive_1;
                }
                String filename_tFileUnarchive_1 =  entry_tFileUnarchive_1.getName();
                util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1, isDirectory_tFileUnarchive_1, is_tFileUnarchive_1);

                       java.io.File f = new java.io.File(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1);
                       f.setLastModified(entry_tFileUnarchive_1.getModTime().getTime());

            }
        }catch(Exception e){
globalMap.put("tFileUnarchive_1_ERROR_MESSAGE",e.getMessage());
           System.err.println(e.getMessage());
        } finally {
            if(zip_tFileUnarchive_1!=null) {
                zip_tFileUnarchive_1.close();
            } else if(inputStream_tFileUnarchive_1 != null) {
                inputStream_tFileUnarchive_1.close();
            }
        }
    }else if (tmpFileURL_tFileUnarchive_1.endsWith(".gz")){
        java.util.zip.GZIPInputStream zip_tFileUnarchive_1 = null;
        java.io.InputStream inputStream_tFileUnarchive_1 = null;
        try {
            inputStream_tFileUnarchive_1 = new java.io.FileInputStream(new java.io.File(zipFileURL_tFileUnarchive_1));
            zip_tFileUnarchive_1 = new java.util.zip.GZIPInputStream(inputStream_tFileUnarchive_1);

            java.io.InputStream is_tFileUnarchive_1 = zip_tFileUnarchive_1;
            String fullName_tFileUnarchive_1 = new java.io.File(zipFileURL_tFileUnarchive_1).getName();
            String filename_tFileUnarchive_1 =  fullName_tFileUnarchive_1.substring(0, fullName_tFileUnarchive_1.length()-3);
            util_tFileUnarchive_1.output(outputPath_tFileUnarchive_1, filename_tFileUnarchive_1,is_tFileUnarchive_1);
        }catch(Exception e){
globalMap.put("tFileUnarchive_1_ERROR_MESSAGE",e.getMessage());
           System.err.println(e.getMessage());
        } finally {
            if(zip_tFileUnarchive_1 != null) {
                zip_tFileUnarchive_1.close();
            } else if(inputStream_tFileUnarchive_1 != null) {
                inputStream_tFileUnarchive_1.close();
            }
        }
    }else {
        //the others all use the ZIP to decompression
        com.talend.compress.zip.Unzip unzip_tFileUnarchive_1 = new com.talend.compress.zip.Unzip(zipFileURL_tFileUnarchive_1, outputPath_tFileUnarchive_1);
        unzip_tFileUnarchive_1.setNeedPassword(false);

 
	final String decryptedPassword_tFileUnarchive_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:wLCTyQ770EHobqwOBwkaXcOifDBvlLeggn5Q/Q==");

        unzip_tFileUnarchive_1.setPassword(decryptedPassword_tFileUnarchive_1);
        unzip_tFileUnarchive_1.setCheckArchive(false);
        unzip_tFileUnarchive_1.setVerbose(false);
        unzip_tFileUnarchive_1.setExtractPath(true);
        unzip_tFileUnarchive_1.setUtil(util_tFileUnarchive_1);
        unzip_tFileUnarchive_1.setUseZip4jDecryption(true);
		

        try{
        unzip_tFileUnarchive_1.doUnzip();
        }catch(Exception e){
globalMap.put("tFileUnarchive_1_ERROR_MESSAGE",e.getMessage());
           System.err.println(e.getMessage());
        }
    }


    for (com.talend.compress.zip.UnzippedFile uftFileUnarchive_1 : util_tFileUnarchive_1.unzippedFiles) {
        globalMap.put("tFileUnarchive_1_CURRENT_FILE", uftFileUnarchive_1.fileName);
        globalMap.put("tFileUnarchive_1_CURRENT_FILEPATH", uftFileUnarchive_1.filePath);

 



/**
 * [tFileUnarchive_1 begin ] stop
 */
	
	/**
	 * [tFileUnarchive_1 main ] start
	 */

	

	
	
	currentComponent="tFileUnarchive_1";
	
	

 


	tos_count_tFileUnarchive_1++;

/**
 * [tFileUnarchive_1 main ] stop
 */
	
	/**
	 * [tFileUnarchive_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileUnarchive_1";
	
	

 



/**
 * [tFileUnarchive_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileUnarchive_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileUnarchive_1";
	
	

 



/**
 * [tFileUnarchive_1 process_data_end ] stop
 */
	
	/**
	 * [tFileUnarchive_1 end ] start
	 */

	

	
	
	currentComponent="tFileUnarchive_1";
	
	
	}

 
                if(log.isDebugEnabled())
            log.debug("tFileUnarchive_1 - "  + ("Done.") );

ok_Hash.put("tFileUnarchive_1", true);
end_Hash.put("tFileUnarchive_1", System.currentTimeMillis());




/**
 * [tFileUnarchive_1 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate1", 2, "exec" + NB_ITERATE_tFileUnarchive_1);
						}				
					




	
	/**
	 * [tFileList_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	

 



/**
 * [tFileList_1 process_data_end ] stop
 */
	
	/**
	 * [tFileList_1 end ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	

  
    }
  globalMap.put("tFileList_1_NB_FILE", NB_FILEtFileList_1);
  
    log.info("tFileList_1 - File or directory count : " + NB_FILEtFileList_1);

  
 

 
                if(log.isDebugEnabled())
            log.debug("tFileList_1 - "  + ("Done.") );

ok_Hash.put("tFileList_1", true);
end_Hash.put("tFileList_1", System.currentTimeMillis());




/**
 * [tFileList_1 end ] stop
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
	 * [tFileList_1 finally ] start
	 */

	

	
	
	currentComponent="tFileList_1";
	
	

 



/**
 * [tFileList_1 finally ] stop
 */

	
	/**
	 * [tFileUnarchive_1 finally ] start
	 */

	

	
	
	currentComponent="tFileUnarchive_1";
	
	

 



/**
 * [tFileUnarchive_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_1_SUBPROCESS_STATE", 1);
	}
	


public static class koerberStruct implements routines.system.IPersistableRow<koerberStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[0];

	
			    public String SCAC_CODE;

				public String getSCAC_CODE () {
					return this.SCAC_CODE;
				}

				public Boolean SCAC_CODEIsNullable(){
				    return true;
				}
				public Boolean SCAC_CODEIsKey(){
				    return false;
				}
				public Integer SCAC_CODELength(){
				    return null;
				}
				public Integer SCAC_CODEPrecision(){
				    return null;
				}
				public String SCAC_CODEDefault(){
				
					return null;
				
				}
				public String SCAC_CODEComment(){
				
				    return "";
				
				}
				public String SCAC_CODEPattern(){
				
					return "";
				
				}
				public String SCAC_CODEOriginalDbColumnName(){
				
					return "SCAC_CODE";
				
				}

				
			    public String TVSI_VENDOR_ID;

				public String getTVSI_VENDOR_ID () {
					return this.TVSI_VENDOR_ID;
				}

				public Boolean TVSI_VENDOR_IDIsNullable(){
				    return true;
				}
				public Boolean TVSI_VENDOR_IDIsKey(){
				    return false;
				}
				public Integer TVSI_VENDOR_IDLength(){
				    return null;
				}
				public Integer TVSI_VENDOR_IDPrecision(){
				    return null;
				}
				public String TVSI_VENDOR_IDDefault(){
				
					return null;
				
				}
				public String TVSI_VENDOR_IDComment(){
				
				    return "";
				
				}
				public String TVSI_VENDOR_IDPattern(){
				
					return "";
				
				}
				public String TVSI_VENDOR_IDOriginalDbColumnName(){
				
					return "TVSI_VENDOR_ID";
				
				}

				
			    public String CARRIER_NAME;

				public String getCARRIER_NAME () {
					return this.CARRIER_NAME;
				}

				public Boolean CARRIER_NAMEIsNullable(){
				    return true;
				}
				public Boolean CARRIER_NAMEIsKey(){
				    return false;
				}
				public Integer CARRIER_NAMELength(){
				    return null;
				}
				public Integer CARRIER_NAMEPrecision(){
				    return null;
				}
				public String CARRIER_NAMEDefault(){
				
					return null;
				
				}
				public String CARRIER_NAMEComment(){
				
				    return "";
				
				}
				public String CARRIER_NAMEPattern(){
				
					return "";
				
				}
				public String CARRIER_NAMEOriginalDbColumnName(){
				
					return "CARRIER_NAME";
				
				}

				
			    public String ACCOUNT_NO;

				public String getACCOUNT_NO () {
					return this.ACCOUNT_NO;
				}

				public Boolean ACCOUNT_NOIsNullable(){
				    return true;
				}
				public Boolean ACCOUNT_NOIsKey(){
				    return false;
				}
				public Integer ACCOUNT_NOLength(){
				    return null;
				}
				public Integer ACCOUNT_NOPrecision(){
				    return null;
				}
				public String ACCOUNT_NODefault(){
				
					return null;
				
				}
				public String ACCOUNT_NOComment(){
				
				    return "";
				
				}
				public String ACCOUNT_NOPattern(){
				
					return "";
				
				}
				public String ACCOUNT_NOOriginalDbColumnName(){
				
					return "ACCOUNT_NO";
				
				}

				
			    public String INVOICE_NO;

				public String getINVOICE_NO () {
					return this.INVOICE_NO;
				}

				public Boolean INVOICE_NOIsNullable(){
				    return true;
				}
				public Boolean INVOICE_NOIsKey(){
				    return false;
				}
				public Integer INVOICE_NOLength(){
				    return null;
				}
				public Integer INVOICE_NOPrecision(){
				    return null;
				}
				public String INVOICE_NODefault(){
				
					return null;
				
				}
				public String INVOICE_NOComment(){
				
				    return "";
				
				}
				public String INVOICE_NOPattern(){
				
					return "";
				
				}
				public String INVOICE_NOOriginalDbColumnName(){
				
					return "INVOICE_NO";
				
				}

				
			    public String TRACKING_NO;

				public String getTRACKING_NO () {
					return this.TRACKING_NO;
				}

				public Boolean TRACKING_NOIsNullable(){
				    return true;
				}
				public Boolean TRACKING_NOIsKey(){
				    return false;
				}
				public Integer TRACKING_NOLength(){
				    return null;
				}
				public Integer TRACKING_NOPrecision(){
				    return null;
				}
				public String TRACKING_NODefault(){
				
					return null;
				
				}
				public String TRACKING_NOComment(){
				
				    return "";
				
				}
				public String TRACKING_NOPattern(){
				
					return "";
				
				}
				public String TRACKING_NOOriginalDbColumnName(){
				
					return "TRACKING_NO";
				
				}

				
			    public String BOL_NO;

				public String getBOL_NO () {
					return this.BOL_NO;
				}

				public Boolean BOL_NOIsNullable(){
				    return true;
				}
				public Boolean BOL_NOIsKey(){
				    return false;
				}
				public Integer BOL_NOLength(){
				    return null;
				}
				public Integer BOL_NOPrecision(){
				    return null;
				}
				public String BOL_NODefault(){
				
					return null;
				
				}
				public String BOL_NOComment(){
				
				    return "";
				
				}
				public String BOL_NOPattern(){
				
					return "";
				
				}
				public String BOL_NOOriginalDbColumnName(){
				
					return "BOL_NO";
				
				}

				
			    public String BILL_OPTION;

				public String getBILL_OPTION () {
					return this.BILL_OPTION;
				}

				public Boolean BILL_OPTIONIsNullable(){
				    return true;
				}
				public Boolean BILL_OPTIONIsKey(){
				    return false;
				}
				public Integer BILL_OPTIONLength(){
				    return null;
				}
				public Integer BILL_OPTIONPrecision(){
				    return null;
				}
				public String BILL_OPTIONDefault(){
				
					return null;
				
				}
				public String BILL_OPTIONComment(){
				
				    return "";
				
				}
				public String BILL_OPTIONPattern(){
				
					return "";
				
				}
				public String BILL_OPTIONOriginalDbColumnName(){
				
					return "BILL_OPTION";
				
				}

				
			    public java.util.Date INVOICE_DATE;

				public java.util.Date getINVOICE_DATE () {
					return this.INVOICE_DATE;
				}

				public Boolean INVOICE_DATEIsNullable(){
				    return true;
				}
				public Boolean INVOICE_DATEIsKey(){
				    return false;
				}
				public Integer INVOICE_DATELength(){
				    return null;
				}
				public Integer INVOICE_DATEPrecision(){
				    return null;
				}
				public String INVOICE_DATEDefault(){
				
					return null;
				
				}
				public String INVOICE_DATEComment(){
				
				    return "";
				
				}
				public String INVOICE_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String INVOICE_DATEOriginalDbColumnName(){
				
					return "INVOICE_DATE";
				
				}

				
			    public java.util.Date SHIP_DATE;

				public java.util.Date getSHIP_DATE () {
					return this.SHIP_DATE;
				}

				public Boolean SHIP_DATEIsNullable(){
				    return true;
				}
				public Boolean SHIP_DATEIsKey(){
				    return false;
				}
				public Integer SHIP_DATELength(){
				    return null;
				}
				public Integer SHIP_DATEPrecision(){
				    return null;
				}
				public String SHIP_DATEDefault(){
				
					return null;
				
				}
				public String SHIP_DATEComment(){
				
				    return "";
				
				}
				public String SHIP_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String SHIP_DATEOriginalDbColumnName(){
				
					return "SHIP_DATE";
				
				}

				
			    public java.util.Date DELIVERY_DATE;

				public java.util.Date getDELIVERY_DATE () {
					return this.DELIVERY_DATE;
				}

				public Boolean DELIVERY_DATEIsNullable(){
				    return true;
				}
				public Boolean DELIVERY_DATEIsKey(){
				    return false;
				}
				public Integer DELIVERY_DATELength(){
				    return null;
				}
				public Integer DELIVERY_DATEPrecision(){
				    return null;
				}
				public String DELIVERY_DATEDefault(){
				
					return null;
				
				}
				public String DELIVERY_DATEComment(){
				
				    return "";
				
				}
				public String DELIVERY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String DELIVERY_DATEOriginalDbColumnName(){
				
					return "DELIVERY_DATE";
				
				}

				
			    public String MODE_INVOICED;

				public String getMODE_INVOICED () {
					return this.MODE_INVOICED;
				}

				public Boolean MODE_INVOICEDIsNullable(){
				    return true;
				}
				public Boolean MODE_INVOICEDIsKey(){
				    return false;
				}
				public Integer MODE_INVOICEDLength(){
				    return null;
				}
				public Integer MODE_INVOICEDPrecision(){
				    return null;
				}
				public String MODE_INVOICEDDefault(){
				
					return null;
				
				}
				public String MODE_INVOICEDComment(){
				
				    return "";
				
				}
				public String MODE_INVOICEDPattern(){
				
					return "";
				
				}
				public String MODE_INVOICEDOriginalDbColumnName(){
				
					return "MODE_INVOICED";
				
				}

				
			    public String SERVICE_LEVEL_INVOICED;

				public String getSERVICE_LEVEL_INVOICED () {
					return this.SERVICE_LEVEL_INVOICED;
				}

				public Boolean SERVICE_LEVEL_INVOICEDIsNullable(){
				    return true;
				}
				public Boolean SERVICE_LEVEL_INVOICEDIsKey(){
				    return false;
				}
				public Integer SERVICE_LEVEL_INVOICEDLength(){
				    return null;
				}
				public Integer SERVICE_LEVEL_INVOICEDPrecision(){
				    return null;
				}
				public String SERVICE_LEVEL_INVOICEDDefault(){
				
					return null;
				
				}
				public String SERVICE_LEVEL_INVOICEDComment(){
				
				    return "";
				
				}
				public String SERVICE_LEVEL_INVOICEDPattern(){
				
					return "";
				
				}
				public String SERVICE_LEVEL_INVOICEDOriginalDbColumnName(){
				
					return "SERVICE_LEVEL_INVOICED";
				
				}

				
			    public String INVOICE_METHOD;

				public String getINVOICE_METHOD () {
					return this.INVOICE_METHOD;
				}

				public Boolean INVOICE_METHODIsNullable(){
				    return true;
				}
				public Boolean INVOICE_METHODIsKey(){
				    return false;
				}
				public Integer INVOICE_METHODLength(){
				    return null;
				}
				public Integer INVOICE_METHODPrecision(){
				    return null;
				}
				public String INVOICE_METHODDefault(){
				
					return null;
				
				}
				public String INVOICE_METHODComment(){
				
				    return "";
				
				}
				public String INVOICE_METHODPattern(){
				
					return "";
				
				}
				public String INVOICE_METHODOriginalDbColumnName(){
				
					return "INVOICE_METHOD";
				
				}

				
			    public String GL_CODE;

				public String getGL_CODE () {
					return this.GL_CODE;
				}

				public Boolean GL_CODEIsNullable(){
				    return true;
				}
				public Boolean GL_CODEIsKey(){
				    return false;
				}
				public Integer GL_CODELength(){
				    return null;
				}
				public Integer GL_CODEPrecision(){
				    return null;
				}
				public String GL_CODEDefault(){
				
					return null;
				
				}
				public String GL_CODEComment(){
				
				    return "";
				
				}
				public String GL_CODEPattern(){
				
					return "";
				
				}
				public String GL_CODEOriginalDbColumnName(){
				
					return "GL_CODE";
				
				}

				
			    public String PO_NO;

				public String getPO_NO () {
					return this.PO_NO;
				}

				public Boolean PO_NOIsNullable(){
				    return true;
				}
				public Boolean PO_NOIsKey(){
				    return false;
				}
				public Integer PO_NOLength(){
				    return null;
				}
				public Integer PO_NOPrecision(){
				    return null;
				}
				public String PO_NODefault(){
				
					return null;
				
				}
				public String PO_NOComment(){
				
				    return "";
				
				}
				public String PO_NOPattern(){
				
					return "";
				
				}
				public String PO_NOOriginalDbColumnName(){
				
					return "PO_NO";
				
				}

				
			    public String REFERENCE1;

				public String getREFERENCE1 () {
					return this.REFERENCE1;
				}

				public Boolean REFERENCE1IsNullable(){
				    return true;
				}
				public Boolean REFERENCE1IsKey(){
				    return false;
				}
				public Integer REFERENCE1Length(){
				    return null;
				}
				public Integer REFERENCE1Precision(){
				    return null;
				}
				public String REFERENCE1Default(){
				
					return null;
				
				}
				public String REFERENCE1Comment(){
				
				    return "";
				
				}
				public String REFERENCE1Pattern(){
				
					return "";
				
				}
				public String REFERENCE1OriginalDbColumnName(){
				
					return "REFERENCE1";
				
				}

				
			    public String REFERENCE2;

				public String getREFERENCE2 () {
					return this.REFERENCE2;
				}

				public Boolean REFERENCE2IsNullable(){
				    return true;
				}
				public Boolean REFERENCE2IsKey(){
				    return false;
				}
				public Integer REFERENCE2Length(){
				    return null;
				}
				public Integer REFERENCE2Precision(){
				    return null;
				}
				public String REFERENCE2Default(){
				
					return null;
				
				}
				public String REFERENCE2Comment(){
				
				    return "";
				
				}
				public String REFERENCE2Pattern(){
				
					return "";
				
				}
				public String REFERENCE2OriginalDbColumnName(){
				
					return "REFERENCE2";
				
				}

				
			    public String REFERENCE3;

				public String getREFERENCE3 () {
					return this.REFERENCE3;
				}

				public Boolean REFERENCE3IsNullable(){
				    return true;
				}
				public Boolean REFERENCE3IsKey(){
				    return false;
				}
				public Integer REFERENCE3Length(){
				    return null;
				}
				public Integer REFERENCE3Precision(){
				    return null;
				}
				public String REFERENCE3Default(){
				
					return null;
				
				}
				public String REFERENCE3Comment(){
				
				    return "";
				
				}
				public String REFERENCE3Pattern(){
				
					return "";
				
				}
				public String REFERENCE3OriginalDbColumnName(){
				
					return "REFERENCE3";
				
				}

				
			    public String REFERENCE4;

				public String getREFERENCE4 () {
					return this.REFERENCE4;
				}

				public Boolean REFERENCE4IsNullable(){
				    return true;
				}
				public Boolean REFERENCE4IsKey(){
				    return false;
				}
				public Integer REFERENCE4Length(){
				    return null;
				}
				public Integer REFERENCE4Precision(){
				    return null;
				}
				public String REFERENCE4Default(){
				
					return null;
				
				}
				public String REFERENCE4Comment(){
				
				    return "";
				
				}
				public String REFERENCE4Pattern(){
				
					return "";
				
				}
				public String REFERENCE4OriginalDbColumnName(){
				
					return "REFERENCE4";
				
				}

				
			    public String ZONE_INVOICED;

				public String getZONE_INVOICED () {
					return this.ZONE_INVOICED;
				}

				public Boolean ZONE_INVOICEDIsNullable(){
				    return true;
				}
				public Boolean ZONE_INVOICEDIsKey(){
				    return false;
				}
				public Integer ZONE_INVOICEDLength(){
				    return null;
				}
				public Integer ZONE_INVOICEDPrecision(){
				    return null;
				}
				public String ZONE_INVOICEDDefault(){
				
					return null;
				
				}
				public String ZONE_INVOICEDComment(){
				
				    return "";
				
				}
				public String ZONE_INVOICEDPattern(){
				
					return "";
				
				}
				public String ZONE_INVOICEDOriginalDbColumnName(){
				
					return "ZONE_INVOICED";
				
				}

				
			    public String SHIPPER_NAME;

				public String getSHIPPER_NAME () {
					return this.SHIPPER_NAME;
				}

				public Boolean SHIPPER_NAMEIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_NAMEIsKey(){
				    return false;
				}
				public Integer SHIPPER_NAMELength(){
				    return null;
				}
				public Integer SHIPPER_NAMEPrecision(){
				    return null;
				}
				public String SHIPPER_NAMEDefault(){
				
					return null;
				
				}
				public String SHIPPER_NAMEComment(){
				
				    return "";
				
				}
				public String SHIPPER_NAMEPattern(){
				
					return "";
				
				}
				public String SHIPPER_NAMEOriginalDbColumnName(){
				
					return "SHIPPER_NAME";
				
				}

				
			    public String SHIPPER_COMPANY;

				public String getSHIPPER_COMPANY () {
					return this.SHIPPER_COMPANY;
				}

				public Boolean SHIPPER_COMPANYIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_COMPANYIsKey(){
				    return false;
				}
				public Integer SHIPPER_COMPANYLength(){
				    return null;
				}
				public Integer SHIPPER_COMPANYPrecision(){
				    return null;
				}
				public String SHIPPER_COMPANYDefault(){
				
					return null;
				
				}
				public String SHIPPER_COMPANYComment(){
				
				    return "";
				
				}
				public String SHIPPER_COMPANYPattern(){
				
					return "";
				
				}
				public String SHIPPER_COMPANYOriginalDbColumnName(){
				
					return "SHIPPER_COMPANY";
				
				}

				
			    public String SHIPPER_ADDRESS1;

				public String getSHIPPER_ADDRESS1 () {
					return this.SHIPPER_ADDRESS1;
				}

				public Boolean SHIPPER_ADDRESS1IsNullable(){
				    return true;
				}
				public Boolean SHIPPER_ADDRESS1IsKey(){
				    return false;
				}
				public Integer SHIPPER_ADDRESS1Length(){
				    return null;
				}
				public Integer SHIPPER_ADDRESS1Precision(){
				    return null;
				}
				public String SHIPPER_ADDRESS1Default(){
				
					return null;
				
				}
				public String SHIPPER_ADDRESS1Comment(){
				
				    return "";
				
				}
				public String SHIPPER_ADDRESS1Pattern(){
				
					return "";
				
				}
				public String SHIPPER_ADDRESS1OriginalDbColumnName(){
				
					return "SHIPPER_ADDRESS1";
				
				}

				
			    public String SHIPPER_CITY;

				public String getSHIPPER_CITY () {
					return this.SHIPPER_CITY;
				}

				public Boolean SHIPPER_CITYIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_CITYIsKey(){
				    return false;
				}
				public Integer SHIPPER_CITYLength(){
				    return null;
				}
				public Integer SHIPPER_CITYPrecision(){
				    return null;
				}
				public String SHIPPER_CITYDefault(){
				
					return null;
				
				}
				public String SHIPPER_CITYComment(){
				
				    return "";
				
				}
				public String SHIPPER_CITYPattern(){
				
					return "";
				
				}
				public String SHIPPER_CITYOriginalDbColumnName(){
				
					return "SHIPPER_CITY";
				
				}

				
			    public String SHIPPER_STATE;

				public String getSHIPPER_STATE () {
					return this.SHIPPER_STATE;
				}

				public Boolean SHIPPER_STATEIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_STATEIsKey(){
				    return false;
				}
				public Integer SHIPPER_STATELength(){
				    return null;
				}
				public Integer SHIPPER_STATEPrecision(){
				    return null;
				}
				public String SHIPPER_STATEDefault(){
				
					return null;
				
				}
				public String SHIPPER_STATEComment(){
				
				    return "";
				
				}
				public String SHIPPER_STATEPattern(){
				
					return "";
				
				}
				public String SHIPPER_STATEOriginalDbColumnName(){
				
					return "SHIPPER_STATE";
				
				}

				
			    public String SHIPPER_POSTAL_CODE;

				public String getSHIPPER_POSTAL_CODE () {
					return this.SHIPPER_POSTAL_CODE;
				}

				public Boolean SHIPPER_POSTAL_CODEIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_POSTAL_CODEIsKey(){
				    return false;
				}
				public Integer SHIPPER_POSTAL_CODELength(){
				    return null;
				}
				public Integer SHIPPER_POSTAL_CODEPrecision(){
				    return null;
				}
				public String SHIPPER_POSTAL_CODEDefault(){
				
					return null;
				
				}
				public String SHIPPER_POSTAL_CODEComment(){
				
				    return "";
				
				}
				public String SHIPPER_POSTAL_CODEPattern(){
				
					return "";
				
				}
				public String SHIPPER_POSTAL_CODEOriginalDbColumnName(){
				
					return "SHIPPER_POSTAL_CODE";
				
				}

				
			    public String SHIPPER_COUNTRY;

				public String getSHIPPER_COUNTRY () {
					return this.SHIPPER_COUNTRY;
				}

				public Boolean SHIPPER_COUNTRYIsNullable(){
				    return true;
				}
				public Boolean SHIPPER_COUNTRYIsKey(){
				    return false;
				}
				public Integer SHIPPER_COUNTRYLength(){
				    return null;
				}
				public Integer SHIPPER_COUNTRYPrecision(){
				    return null;
				}
				public String SHIPPER_COUNTRYDefault(){
				
					return null;
				
				}
				public String SHIPPER_COUNTRYComment(){
				
				    return "";
				
				}
				public String SHIPPER_COUNTRYPattern(){
				
					return "";
				
				}
				public String SHIPPER_COUNTRYOriginalDbColumnName(){
				
					return "SHIPPER_COUNTRY";
				
				}

				
			    public String RECEIVER_NAME;

				public String getRECEIVER_NAME () {
					return this.RECEIVER_NAME;
				}

				public Boolean RECEIVER_NAMEIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_NAMEIsKey(){
				    return false;
				}
				public Integer RECEIVER_NAMELength(){
				    return null;
				}
				public Integer RECEIVER_NAMEPrecision(){
				    return null;
				}
				public String RECEIVER_NAMEDefault(){
				
					return null;
				
				}
				public String RECEIVER_NAMEComment(){
				
				    return "";
				
				}
				public String RECEIVER_NAMEPattern(){
				
					return "";
				
				}
				public String RECEIVER_NAMEOriginalDbColumnName(){
				
					return "RECEIVER_NAME";
				
				}

				
			    public String RECEIVER_COMPANY;

				public String getRECEIVER_COMPANY () {
					return this.RECEIVER_COMPANY;
				}

				public Boolean RECEIVER_COMPANYIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_COMPANYIsKey(){
				    return false;
				}
				public Integer RECEIVER_COMPANYLength(){
				    return null;
				}
				public Integer RECEIVER_COMPANYPrecision(){
				    return null;
				}
				public String RECEIVER_COMPANYDefault(){
				
					return null;
				
				}
				public String RECEIVER_COMPANYComment(){
				
				    return "";
				
				}
				public String RECEIVER_COMPANYPattern(){
				
					return "";
				
				}
				public String RECEIVER_COMPANYOriginalDbColumnName(){
				
					return "RECEIVER_COMPANY";
				
				}

				
			    public String RECEIVER_ADDRESS1;

				public String getRECEIVER_ADDRESS1 () {
					return this.RECEIVER_ADDRESS1;
				}

				public Boolean RECEIVER_ADDRESS1IsNullable(){
				    return true;
				}
				public Boolean RECEIVER_ADDRESS1IsKey(){
				    return false;
				}
				public Integer RECEIVER_ADDRESS1Length(){
				    return null;
				}
				public Integer RECEIVER_ADDRESS1Precision(){
				    return null;
				}
				public String RECEIVER_ADDRESS1Default(){
				
					return null;
				
				}
				public String RECEIVER_ADDRESS1Comment(){
				
				    return "";
				
				}
				public String RECEIVER_ADDRESS1Pattern(){
				
					return "";
				
				}
				public String RECEIVER_ADDRESS1OriginalDbColumnName(){
				
					return "RECEIVER_ADDRESS1";
				
				}

				
			    public String RECEIVER_CITY;

				public String getRECEIVER_CITY () {
					return this.RECEIVER_CITY;
				}

				public Boolean RECEIVER_CITYIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_CITYIsKey(){
				    return false;
				}
				public Integer RECEIVER_CITYLength(){
				    return null;
				}
				public Integer RECEIVER_CITYPrecision(){
				    return null;
				}
				public String RECEIVER_CITYDefault(){
				
					return null;
				
				}
				public String RECEIVER_CITYComment(){
				
				    return "";
				
				}
				public String RECEIVER_CITYPattern(){
				
					return "";
				
				}
				public String RECEIVER_CITYOriginalDbColumnName(){
				
					return "RECEIVER_CITY";
				
				}

				
			    public String RECEIVER_STATE;

				public String getRECEIVER_STATE () {
					return this.RECEIVER_STATE;
				}

				public Boolean RECEIVER_STATEIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_STATEIsKey(){
				    return false;
				}
				public Integer RECEIVER_STATELength(){
				    return null;
				}
				public Integer RECEIVER_STATEPrecision(){
				    return null;
				}
				public String RECEIVER_STATEDefault(){
				
					return null;
				
				}
				public String RECEIVER_STATEComment(){
				
				    return "";
				
				}
				public String RECEIVER_STATEPattern(){
				
					return "";
				
				}
				public String RECEIVER_STATEOriginalDbColumnName(){
				
					return "RECEIVER_STATE";
				
				}

				
			    public String RECEIVER_POSTAL_CODE;

				public String getRECEIVER_POSTAL_CODE () {
					return this.RECEIVER_POSTAL_CODE;
				}

				public Boolean RECEIVER_POSTAL_CODEIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_POSTAL_CODEIsKey(){
				    return false;
				}
				public Integer RECEIVER_POSTAL_CODELength(){
				    return null;
				}
				public Integer RECEIVER_POSTAL_CODEPrecision(){
				    return null;
				}
				public String RECEIVER_POSTAL_CODEDefault(){
				
					return null;
				
				}
				public String RECEIVER_POSTAL_CODEComment(){
				
				    return "";
				
				}
				public String RECEIVER_POSTAL_CODEPattern(){
				
					return "";
				
				}
				public String RECEIVER_POSTAL_CODEOriginalDbColumnName(){
				
					return "RECEIVER_POSTAL_CODE";
				
				}

				
			    public String RECEIVER_COUNTRY;

				public String getRECEIVER_COUNTRY () {
					return this.RECEIVER_COUNTRY;
				}

				public Boolean RECEIVER_COUNTRYIsNullable(){
				    return true;
				}
				public Boolean RECEIVER_COUNTRYIsKey(){
				    return false;
				}
				public Integer RECEIVER_COUNTRYLength(){
				    return null;
				}
				public Integer RECEIVER_COUNTRYPrecision(){
				    return null;
				}
				public String RECEIVER_COUNTRYDefault(){
				
					return null;
				
				}
				public String RECEIVER_COUNTRYComment(){
				
				    return "";
				
				}
				public String RECEIVER_COUNTRYPattern(){
				
					return "";
				
				}
				public String RECEIVER_COUNTRYOriginalDbColumnName(){
				
					return "RECEIVER_COUNTRY";
				
				}

				
			    public Float ACTUAL_WEIGHT_INVOICED;

				public Float getACTUAL_WEIGHT_INVOICED () {
					return this.ACTUAL_WEIGHT_INVOICED;
				}

				public Boolean ACTUAL_WEIGHT_INVOICEDIsNullable(){
				    return true;
				}
				public Boolean ACTUAL_WEIGHT_INVOICEDIsKey(){
				    return false;
				}
				public Integer ACTUAL_WEIGHT_INVOICEDLength(){
				    return null;
				}
				public Integer ACTUAL_WEIGHT_INVOICEDPrecision(){
				    return null;
				}
				public String ACTUAL_WEIGHT_INVOICEDDefault(){
				
					return "";
				
				}
				public String ACTUAL_WEIGHT_INVOICEDComment(){
				
				    return "";
				
				}
				public String ACTUAL_WEIGHT_INVOICEDPattern(){
				
					return "";
				
				}
				public String ACTUAL_WEIGHT_INVOICEDOriginalDbColumnName(){
				
					return "ACTUAL_WEIGHT_INVOICED";
				
				}

				
			    public Float BILL_WEIGHT_INVOICED;

				public Float getBILL_WEIGHT_INVOICED () {
					return this.BILL_WEIGHT_INVOICED;
				}

				public Boolean BILL_WEIGHT_INVOICEDIsNullable(){
				    return true;
				}
				public Boolean BILL_WEIGHT_INVOICEDIsKey(){
				    return false;
				}
				public Integer BILL_WEIGHT_INVOICEDLength(){
				    return null;
				}
				public Integer BILL_WEIGHT_INVOICEDPrecision(){
				    return null;
				}
				public String BILL_WEIGHT_INVOICEDDefault(){
				
					return "";
				
				}
				public String BILL_WEIGHT_INVOICEDComment(){
				
				    return "";
				
				}
				public String BILL_WEIGHT_INVOICEDPattern(){
				
					return "";
				
				}
				public String BILL_WEIGHT_INVOICEDOriginalDbColumnName(){
				
					return "BILL_WEIGHT_INVOICED";
				
				}

				
			    public Float TOTAL_CHARGES;

				public Float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}

				public Boolean TOTAL_CHARGESIsNullable(){
				    return true;
				}
				public Boolean TOTAL_CHARGESIsKey(){
				    return false;
				}
				public Integer TOTAL_CHARGESLength(){
				    return null;
				}
				public Integer TOTAL_CHARGESPrecision(){
				    return null;
				}
				public String TOTAL_CHARGESDefault(){
				
					return "";
				
				}
				public String TOTAL_CHARGESComment(){
				
				    return "";
				
				}
				public String TOTAL_CHARGESPattern(){
				
					return "";
				
				}
				public String TOTAL_CHARGESOriginalDbColumnName(){
				
					return "TOTAL_CHARGES";
				
				}

				
			    public Float LINE_HAUL;

				public Float getLINE_HAUL () {
					return this.LINE_HAUL;
				}

				public Boolean LINE_HAULIsNullable(){
				    return true;
				}
				public Boolean LINE_HAULIsKey(){
				    return false;
				}
				public Integer LINE_HAULLength(){
				    return null;
				}
				public Integer LINE_HAULPrecision(){
				    return null;
				}
				public String LINE_HAULDefault(){
				
					return "";
				
				}
				public String LINE_HAULComment(){
				
				    return "";
				
				}
				public String LINE_HAULPattern(){
				
					return "";
				
				}
				public String LINE_HAULOriginalDbColumnName(){
				
					return "LINE_HAUL";
				
				}

				
			    public Float FUEL_SURCHARGE;

				public Float getFUEL_SURCHARGE () {
					return this.FUEL_SURCHARGE;
				}

				public Boolean FUEL_SURCHARGEIsNullable(){
				    return true;
				}
				public Boolean FUEL_SURCHARGEIsKey(){
				    return false;
				}
				public Integer FUEL_SURCHARGELength(){
				    return null;
				}
				public Integer FUEL_SURCHARGEPrecision(){
				    return null;
				}
				public String FUEL_SURCHARGEDefault(){
				
					return "";
				
				}
				public String FUEL_SURCHARGEComment(){
				
				    return "";
				
				}
				public String FUEL_SURCHARGEPattern(){
				
					return "";
				
				}
				public String FUEL_SURCHARGEOriginalDbColumnName(){
				
					return "FUEL_SURCHARGE";
				
				}

				
			    public Float FUEL_DISCOUNT_AMOUNT;

				public Float getFUEL_DISCOUNT_AMOUNT () {
					return this.FUEL_DISCOUNT_AMOUNT;
				}

				public Boolean FUEL_DISCOUNT_AMOUNTIsNullable(){
				    return true;
				}
				public Boolean FUEL_DISCOUNT_AMOUNTIsKey(){
				    return false;
				}
				public Integer FUEL_DISCOUNT_AMOUNTLength(){
				    return null;
				}
				public Integer FUEL_DISCOUNT_AMOUNTPrecision(){
				    return null;
				}
				public String FUEL_DISCOUNT_AMOUNTDefault(){
				
					return "";
				
				}
				public String FUEL_DISCOUNT_AMOUNTComment(){
				
				    return "";
				
				}
				public String FUEL_DISCOUNT_AMOUNTPattern(){
				
					return "";
				
				}
				public String FUEL_DISCOUNT_AMOUNTOriginalDbColumnName(){
				
					return "FUEL_DISCOUNT_AMOUNT";
				
				}

				
			    public Float DISCOUNT;

				public Float getDISCOUNT () {
					return this.DISCOUNT;
				}

				public Boolean DISCOUNTIsNullable(){
				    return true;
				}
				public Boolean DISCOUNTIsKey(){
				    return false;
				}
				public Integer DISCOUNTLength(){
				    return null;
				}
				public Integer DISCOUNTPrecision(){
				    return null;
				}
				public String DISCOUNTDefault(){
				
					return "";
				
				}
				public String DISCOUNTComment(){
				
				    return "";
				
				}
				public String DISCOUNTPattern(){
				
					return "";
				
				}
				public String DISCOUNTOriginalDbColumnName(){
				
					return "DISCOUNT";
				
				}

				
			    public Float ACCESSORIALS;

				public Float getACCESSORIALS () {
					return this.ACCESSORIALS;
				}

				public Boolean ACCESSORIALSIsNullable(){
				    return true;
				}
				public Boolean ACCESSORIALSIsKey(){
				    return false;
				}
				public Integer ACCESSORIALSLength(){
				    return null;
				}
				public Integer ACCESSORIALSPrecision(){
				    return null;
				}
				public String ACCESSORIALSDefault(){
				
					return "";
				
				}
				public String ACCESSORIALSComment(){
				
				    return "";
				
				}
				public String ACCESSORIALSPattern(){
				
					return "";
				
				}
				public String ACCESSORIALSOriginalDbColumnName(){
				
					return "ACCESSORIALS";
				
				}

				
			    public Float ADJUSTMENTS;

				public Float getADJUSTMENTS () {
					return this.ADJUSTMENTS;
				}

				public Boolean ADJUSTMENTSIsNullable(){
				    return true;
				}
				public Boolean ADJUSTMENTSIsKey(){
				    return false;
				}
				public Integer ADJUSTMENTSLength(){
				    return null;
				}
				public Integer ADJUSTMENTSPrecision(){
				    return null;
				}
				public String ADJUSTMENTSDefault(){
				
					return "";
				
				}
				public String ADJUSTMENTSComment(){
				
				    return "";
				
				}
				public String ADJUSTMENTSPattern(){
				
					return "";
				
				}
				public String ADJUSTMENTSOriginalDbColumnName(){
				
					return "ADJUSTMENTS";
				
				}

				
			    public Float TOTAL_DUE_AMOUNT;

				public Float getTOTAL_DUE_AMOUNT () {
					return this.TOTAL_DUE_AMOUNT;
				}

				public Boolean TOTAL_DUE_AMOUNTIsNullable(){
				    return true;
				}
				public Boolean TOTAL_DUE_AMOUNTIsKey(){
				    return false;
				}
				public Integer TOTAL_DUE_AMOUNTLength(){
				    return null;
				}
				public Integer TOTAL_DUE_AMOUNTPrecision(){
				    return null;
				}
				public String TOTAL_DUE_AMOUNTDefault(){
				
					return "";
				
				}
				public String TOTAL_DUE_AMOUNTComment(){
				
				    return "";
				
				}
				public String TOTAL_DUE_AMOUNTPattern(){
				
					return "";
				
				}
				public String TOTAL_DUE_AMOUNTOriginalDbColumnName(){
				
					return "TOTAL_DUE_AMOUNT";
				
				}

				
			    public String INVOICE_STATUS;

				public String getINVOICE_STATUS () {
					return this.INVOICE_STATUS;
				}

				public Boolean INVOICE_STATUSIsNullable(){
				    return true;
				}
				public Boolean INVOICE_STATUSIsKey(){
				    return false;
				}
				public Integer INVOICE_STATUSLength(){
				    return null;
				}
				public Integer INVOICE_STATUSPrecision(){
				    return null;
				}
				public String INVOICE_STATUSDefault(){
				
					return null;
				
				}
				public String INVOICE_STATUSComment(){
				
				    return "";
				
				}
				public String INVOICE_STATUSPattern(){
				
					return "";
				
				}
				public String INVOICE_STATUSOriginalDbColumnName(){
				
					return "INVOICE_STATUS";
				
				}

				
			    public String ADJUSTMENT_REASON;

				public String getADJUSTMENT_REASON () {
					return this.ADJUSTMENT_REASON;
				}

				public Boolean ADJUSTMENT_REASONIsNullable(){
				    return true;
				}
				public Boolean ADJUSTMENT_REASONIsKey(){
				    return false;
				}
				public Integer ADJUSTMENT_REASONLength(){
				    return null;
				}
				public Integer ADJUSTMENT_REASONPrecision(){
				    return null;
				}
				public String ADJUSTMENT_REASONDefault(){
				
					return null;
				
				}
				public String ADJUSTMENT_REASONComment(){
				
				    return "";
				
				}
				public String ADJUSTMENT_REASONPattern(){
				
					return "";
				
				}
				public String ADJUSTMENT_REASONOriginalDbColumnName(){
				
					return "ADJUSTMENT_REASON";
				
				}

				
			    public String INTERNAL_KEY1;

				public String getINTERNAL_KEY1 () {
					return this.INTERNAL_KEY1;
				}

				public Boolean INTERNAL_KEY1IsNullable(){
				    return true;
				}
				public Boolean INTERNAL_KEY1IsKey(){
				    return false;
				}
				public Integer INTERNAL_KEY1Length(){
				    return null;
				}
				public Integer INTERNAL_KEY1Precision(){
				    return null;
				}
				public String INTERNAL_KEY1Default(){
				
					return null;
				
				}
				public String INTERNAL_KEY1Comment(){
				
				    return "";
				
				}
				public String INTERNAL_KEY1Pattern(){
				
					return "";
				
				}
				public String INTERNAL_KEY1OriginalDbColumnName(){
				
					return "INTERNAL_KEY1";
				
				}

				
			    public String NSP_INVOICE_DETAILS_ID;

				public String getNSP_INVOICE_DETAILS_ID () {
					return this.NSP_INVOICE_DETAILS_ID;
				}

				public Boolean NSP_INVOICE_DETAILS_IDIsNullable(){
				    return true;
				}
				public Boolean NSP_INVOICE_DETAILS_IDIsKey(){
				    return false;
				}
				public Integer NSP_INVOICE_DETAILS_IDLength(){
				    return null;
				}
				public Integer NSP_INVOICE_DETAILS_IDPrecision(){
				    return null;
				}
				public String NSP_INVOICE_DETAILS_IDDefault(){
				
					return null;
				
				}
				public String NSP_INVOICE_DETAILS_IDComment(){
				
				    return "";
				
				}
				public String NSP_INVOICE_DETAILS_IDPattern(){
				
					return "";
				
				}
				public String NSP_INVOICE_DETAILS_IDOriginalDbColumnName(){
				
					return "NSP_INVOICE_DETAILS_ID";
				
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
				
					return null;
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake) {

        	try {

        		int length = 0;
		
					this.SCAC_CODE = readString(dis);
					
					this.TVSI_VENDOR_ID = readString(dis);
					
					this.CARRIER_NAME = readString(dis);
					
					this.ACCOUNT_NO = readString(dis);
					
					this.INVOICE_NO = readString(dis);
					
					this.TRACKING_NO = readString(dis);
					
					this.BOL_NO = readString(dis);
					
					this.BILL_OPTION = readString(dis);
					
					this.INVOICE_DATE = readDate(dis);
					
					this.SHIP_DATE = readDate(dis);
					
					this.DELIVERY_DATE = readDate(dis);
					
					this.MODE_INVOICED = readString(dis);
					
					this.SERVICE_LEVEL_INVOICED = readString(dis);
					
					this.INVOICE_METHOD = readString(dis);
					
					this.GL_CODE = readString(dis);
					
					this.PO_NO = readString(dis);
					
					this.REFERENCE1 = readString(dis);
					
					this.REFERENCE2 = readString(dis);
					
					this.REFERENCE3 = readString(dis);
					
					this.REFERENCE4 = readString(dis);
					
					this.ZONE_INVOICED = readString(dis);
					
					this.SHIPPER_NAME = readString(dis);
					
					this.SHIPPER_COMPANY = readString(dis);
					
					this.SHIPPER_ADDRESS1 = readString(dis);
					
					this.SHIPPER_CITY = readString(dis);
					
					this.SHIPPER_STATE = readString(dis);
					
					this.SHIPPER_POSTAL_CODE = readString(dis);
					
					this.SHIPPER_COUNTRY = readString(dis);
					
					this.RECEIVER_NAME = readString(dis);
					
					this.RECEIVER_COMPANY = readString(dis);
					
					this.RECEIVER_ADDRESS1 = readString(dis);
					
					this.RECEIVER_CITY = readString(dis);
					
					this.RECEIVER_STATE = readString(dis);
					
					this.RECEIVER_POSTAL_CODE = readString(dis);
					
					this.RECEIVER_COUNTRY = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACTUAL_WEIGHT_INVOICED = null;
           				} else {
           			    	this.ACTUAL_WEIGHT_INVOICED = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BILL_WEIGHT_INVOICED = null;
           				} else {
           			    	this.BILL_WEIGHT_INVOICED = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TOTAL_CHARGES = null;
           				} else {
           			    	this.TOTAL_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.LINE_HAUL = null;
           				} else {
           			    	this.LINE_HAUL = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.FUEL_SURCHARGE = null;
           				} else {
           			    	this.FUEL_SURCHARGE = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.FUEL_DISCOUNT_AMOUNT = null;
           				} else {
           			    	this.FUEL_DISCOUNT_AMOUNT = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DISCOUNT = null;
           				} else {
           			    	this.DISCOUNT = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESSORIALS = null;
           				} else {
           			    	this.ACCESSORIALS = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ADJUSTMENTS = null;
           				} else {
           			    	this.ADJUSTMENTS = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TOTAL_DUE_AMOUNT = null;
           				} else {
           			    	this.TOTAL_DUE_AMOUNT = dis.readFloat();
           				}
					
					this.INVOICE_STATUS = readString(dis);
					
					this.ADJUSTMENT_REASON = readString(dis);
					
					this.INTERNAL_KEY1 = readString(dis);
					
					this.NSP_INVOICE_DETAILS_ID = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake) {

        	try {

        		int length = 0;
		
					this.SCAC_CODE = readString(dis);
					
					this.TVSI_VENDOR_ID = readString(dis);
					
					this.CARRIER_NAME = readString(dis);
					
					this.ACCOUNT_NO = readString(dis);
					
					this.INVOICE_NO = readString(dis);
					
					this.TRACKING_NO = readString(dis);
					
					this.BOL_NO = readString(dis);
					
					this.BILL_OPTION = readString(dis);
					
					this.INVOICE_DATE = readDate(dis);
					
					this.SHIP_DATE = readDate(dis);
					
					this.DELIVERY_DATE = readDate(dis);
					
					this.MODE_INVOICED = readString(dis);
					
					this.SERVICE_LEVEL_INVOICED = readString(dis);
					
					this.INVOICE_METHOD = readString(dis);
					
					this.GL_CODE = readString(dis);
					
					this.PO_NO = readString(dis);
					
					this.REFERENCE1 = readString(dis);
					
					this.REFERENCE2 = readString(dis);
					
					this.REFERENCE3 = readString(dis);
					
					this.REFERENCE4 = readString(dis);
					
					this.ZONE_INVOICED = readString(dis);
					
					this.SHIPPER_NAME = readString(dis);
					
					this.SHIPPER_COMPANY = readString(dis);
					
					this.SHIPPER_ADDRESS1 = readString(dis);
					
					this.SHIPPER_CITY = readString(dis);
					
					this.SHIPPER_STATE = readString(dis);
					
					this.SHIPPER_POSTAL_CODE = readString(dis);
					
					this.SHIPPER_COUNTRY = readString(dis);
					
					this.RECEIVER_NAME = readString(dis);
					
					this.RECEIVER_COMPANY = readString(dis);
					
					this.RECEIVER_ADDRESS1 = readString(dis);
					
					this.RECEIVER_CITY = readString(dis);
					
					this.RECEIVER_STATE = readString(dis);
					
					this.RECEIVER_POSTAL_CODE = readString(dis);
					
					this.RECEIVER_COUNTRY = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACTUAL_WEIGHT_INVOICED = null;
           				} else {
           			    	this.ACTUAL_WEIGHT_INVOICED = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.BILL_WEIGHT_INVOICED = null;
           				} else {
           			    	this.BILL_WEIGHT_INVOICED = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TOTAL_CHARGES = null;
           				} else {
           			    	this.TOTAL_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.LINE_HAUL = null;
           				} else {
           			    	this.LINE_HAUL = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.FUEL_SURCHARGE = null;
           				} else {
           			    	this.FUEL_SURCHARGE = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.FUEL_DISCOUNT_AMOUNT = null;
           				} else {
           			    	this.FUEL_DISCOUNT_AMOUNT = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DISCOUNT = null;
           				} else {
           			    	this.DISCOUNT = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ACCESSORIALS = null;
           				} else {
           			    	this.ACCESSORIALS = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ADJUSTMENTS = null;
           				} else {
           			    	this.ADJUSTMENTS = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TOTAL_DUE_AMOUNT = null;
           				} else {
           			    	this.TOTAL_DUE_AMOUNT = dis.readFloat();
           				}
					
					this.INVOICE_STATUS = readString(dis);
					
					this.ADJUSTMENT_REASON = readString(dis);
					
					this.INTERNAL_KEY1 = readString(dis);
					
					this.NSP_INVOICE_DETAILS_ID = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.SCAC_CODE,dos);
					
					// String
				
						writeString(this.TVSI_VENDOR_ID,dos);
					
					// String
				
						writeString(this.CARRIER_NAME,dos);
					
					// String
				
						writeString(this.ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.INVOICE_NO,dos);
					
					// String
				
						writeString(this.TRACKING_NO,dos);
					
					// String
				
						writeString(this.BOL_NO,dos);
					
					// String
				
						writeString(this.BILL_OPTION,dos);
					
					// java.util.Date
				
						writeDate(this.INVOICE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.DELIVERY_DATE,dos);
					
					// String
				
						writeString(this.MODE_INVOICED,dos);
					
					// String
				
						writeString(this.SERVICE_LEVEL_INVOICED,dos);
					
					// String
				
						writeString(this.INVOICE_METHOD,dos);
					
					// String
				
						writeString(this.GL_CODE,dos);
					
					// String
				
						writeString(this.PO_NO,dos);
					
					// String
				
						writeString(this.REFERENCE1,dos);
					
					// String
				
						writeString(this.REFERENCE2,dos);
					
					// String
				
						writeString(this.REFERENCE3,dos);
					
					// String
				
						writeString(this.REFERENCE4,dos);
					
					// String
				
						writeString(this.ZONE_INVOICED,dos);
					
					// String
				
						writeString(this.SHIPPER_NAME,dos);
					
					// String
				
						writeString(this.SHIPPER_COMPANY,dos);
					
					// String
				
						writeString(this.SHIPPER_ADDRESS1,dos);
					
					// String
				
						writeString(this.SHIPPER_CITY,dos);
					
					// String
				
						writeString(this.SHIPPER_STATE,dos);
					
					// String
				
						writeString(this.SHIPPER_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.SHIPPER_COUNTRY,dos);
					
					// String
				
						writeString(this.RECEIVER_NAME,dos);
					
					// String
				
						writeString(this.RECEIVER_COMPANY,dos);
					
					// String
				
						writeString(this.RECEIVER_ADDRESS1,dos);
					
					// String
				
						writeString(this.RECEIVER_CITY,dos);
					
					// String
				
						writeString(this.RECEIVER_STATE,dos);
					
					// String
				
						writeString(this.RECEIVER_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.RECEIVER_COUNTRY,dos);
					
					// Float
				
						if(this.ACTUAL_WEIGHT_INVOICED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ACTUAL_WEIGHT_INVOICED);
		            	}
					
					// Float
				
						if(this.BILL_WEIGHT_INVOICED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.BILL_WEIGHT_INVOICED);
		            	}
					
					// Float
				
						if(this.TOTAL_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TOTAL_CHARGES);
		            	}
					
					// Float
				
						if(this.LINE_HAUL == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.LINE_HAUL);
		            	}
					
					// Float
				
						if(this.FUEL_SURCHARGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.FUEL_SURCHARGE);
		            	}
					
					// Float
				
						if(this.FUEL_DISCOUNT_AMOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.FUEL_DISCOUNT_AMOUNT);
		            	}
					
					// Float
				
						if(this.DISCOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.DISCOUNT);
		            	}
					
					// Float
				
						if(this.ACCESSORIALS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ACCESSORIALS);
		            	}
					
					// Float
				
						if(this.ADJUSTMENTS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ADJUSTMENTS);
		            	}
					
					// Float
				
						if(this.TOTAL_DUE_AMOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TOTAL_DUE_AMOUNT);
		            	}
					
					// String
				
						writeString(this.INVOICE_STATUS,dos);
					
					// String
				
						writeString(this.ADJUSTMENT_REASON,dos);
					
					// String
				
						writeString(this.INTERNAL_KEY1,dos);
					
					// String
				
						writeString(this.NSP_INVOICE_DETAILS_ID,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.SCAC_CODE,dos);
					
					// String
				
						writeString(this.TVSI_VENDOR_ID,dos);
					
					// String
				
						writeString(this.CARRIER_NAME,dos);
					
					// String
				
						writeString(this.ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.INVOICE_NO,dos);
					
					// String
				
						writeString(this.TRACKING_NO,dos);
					
					// String
				
						writeString(this.BOL_NO,dos);
					
					// String
				
						writeString(this.BILL_OPTION,dos);
					
					// java.util.Date
				
						writeDate(this.INVOICE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.DELIVERY_DATE,dos);
					
					// String
				
						writeString(this.MODE_INVOICED,dos);
					
					// String
				
						writeString(this.SERVICE_LEVEL_INVOICED,dos);
					
					// String
				
						writeString(this.INVOICE_METHOD,dos);
					
					// String
				
						writeString(this.GL_CODE,dos);
					
					// String
				
						writeString(this.PO_NO,dos);
					
					// String
				
						writeString(this.REFERENCE1,dos);
					
					// String
				
						writeString(this.REFERENCE2,dos);
					
					// String
				
						writeString(this.REFERENCE3,dos);
					
					// String
				
						writeString(this.REFERENCE4,dos);
					
					// String
				
						writeString(this.ZONE_INVOICED,dos);
					
					// String
				
						writeString(this.SHIPPER_NAME,dos);
					
					// String
				
						writeString(this.SHIPPER_COMPANY,dos);
					
					// String
				
						writeString(this.SHIPPER_ADDRESS1,dos);
					
					// String
				
						writeString(this.SHIPPER_CITY,dos);
					
					// String
				
						writeString(this.SHIPPER_STATE,dos);
					
					// String
				
						writeString(this.SHIPPER_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.SHIPPER_COUNTRY,dos);
					
					// String
				
						writeString(this.RECEIVER_NAME,dos);
					
					// String
				
						writeString(this.RECEIVER_COMPANY,dos);
					
					// String
				
						writeString(this.RECEIVER_ADDRESS1,dos);
					
					// String
				
						writeString(this.RECEIVER_CITY,dos);
					
					// String
				
						writeString(this.RECEIVER_STATE,dos);
					
					// String
				
						writeString(this.RECEIVER_POSTAL_CODE,dos);
					
					// String
				
						writeString(this.RECEIVER_COUNTRY,dos);
					
					// Float
				
						if(this.ACTUAL_WEIGHT_INVOICED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ACTUAL_WEIGHT_INVOICED);
		            	}
					
					// Float
				
						if(this.BILL_WEIGHT_INVOICED == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.BILL_WEIGHT_INVOICED);
		            	}
					
					// Float
				
						if(this.TOTAL_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TOTAL_CHARGES);
		            	}
					
					// Float
				
						if(this.LINE_HAUL == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.LINE_HAUL);
		            	}
					
					// Float
				
						if(this.FUEL_SURCHARGE == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.FUEL_SURCHARGE);
		            	}
					
					// Float
				
						if(this.FUEL_DISCOUNT_AMOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.FUEL_DISCOUNT_AMOUNT);
		            	}
					
					// Float
				
						if(this.DISCOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.DISCOUNT);
		            	}
					
					// Float
				
						if(this.ACCESSORIALS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ACCESSORIALS);
		            	}
					
					// Float
				
						if(this.ADJUSTMENTS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.ADJUSTMENTS);
		            	}
					
					// Float
				
						if(this.TOTAL_DUE_AMOUNT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TOTAL_DUE_AMOUNT);
		            	}
					
					// String
				
						writeString(this.INVOICE_STATUS,dos);
					
					// String
				
						writeString(this.ADJUSTMENT_REASON,dos);
					
					// String
				
						writeString(this.INTERNAL_KEY1,dos);
					
					// String
				
						writeString(this.NSP_INVOICE_DETAILS_ID,dos);
					
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
		sb.append("SCAC_CODE="+SCAC_CODE);
		sb.append(",TVSI_VENDOR_ID="+TVSI_VENDOR_ID);
		sb.append(",CARRIER_NAME="+CARRIER_NAME);
		sb.append(",ACCOUNT_NO="+ACCOUNT_NO);
		sb.append(",INVOICE_NO="+INVOICE_NO);
		sb.append(",TRACKING_NO="+TRACKING_NO);
		sb.append(",BOL_NO="+BOL_NO);
		sb.append(",BILL_OPTION="+BILL_OPTION);
		sb.append(",INVOICE_DATE="+String.valueOf(INVOICE_DATE));
		sb.append(",SHIP_DATE="+String.valueOf(SHIP_DATE));
		sb.append(",DELIVERY_DATE="+String.valueOf(DELIVERY_DATE));
		sb.append(",MODE_INVOICED="+MODE_INVOICED);
		sb.append(",SERVICE_LEVEL_INVOICED="+SERVICE_LEVEL_INVOICED);
		sb.append(",INVOICE_METHOD="+INVOICE_METHOD);
		sb.append(",GL_CODE="+GL_CODE);
		sb.append(",PO_NO="+PO_NO);
		sb.append(",REFERENCE1="+REFERENCE1);
		sb.append(",REFERENCE2="+REFERENCE2);
		sb.append(",REFERENCE3="+REFERENCE3);
		sb.append(",REFERENCE4="+REFERENCE4);
		sb.append(",ZONE_INVOICED="+ZONE_INVOICED);
		sb.append(",SHIPPER_NAME="+SHIPPER_NAME);
		sb.append(",SHIPPER_COMPANY="+SHIPPER_COMPANY);
		sb.append(",SHIPPER_ADDRESS1="+SHIPPER_ADDRESS1);
		sb.append(",SHIPPER_CITY="+SHIPPER_CITY);
		sb.append(",SHIPPER_STATE="+SHIPPER_STATE);
		sb.append(",SHIPPER_POSTAL_CODE="+SHIPPER_POSTAL_CODE);
		sb.append(",SHIPPER_COUNTRY="+SHIPPER_COUNTRY);
		sb.append(",RECEIVER_NAME="+RECEIVER_NAME);
		sb.append(",RECEIVER_COMPANY="+RECEIVER_COMPANY);
		sb.append(",RECEIVER_ADDRESS1="+RECEIVER_ADDRESS1);
		sb.append(",RECEIVER_CITY="+RECEIVER_CITY);
		sb.append(",RECEIVER_STATE="+RECEIVER_STATE);
		sb.append(",RECEIVER_POSTAL_CODE="+RECEIVER_POSTAL_CODE);
		sb.append(",RECEIVER_COUNTRY="+RECEIVER_COUNTRY);
		sb.append(",ACTUAL_WEIGHT_INVOICED="+String.valueOf(ACTUAL_WEIGHT_INVOICED));
		sb.append(",BILL_WEIGHT_INVOICED="+String.valueOf(BILL_WEIGHT_INVOICED));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",LINE_HAUL="+String.valueOf(LINE_HAUL));
		sb.append(",FUEL_SURCHARGE="+String.valueOf(FUEL_SURCHARGE));
		sb.append(",FUEL_DISCOUNT_AMOUNT="+String.valueOf(FUEL_DISCOUNT_AMOUNT));
		sb.append(",DISCOUNT="+String.valueOf(DISCOUNT));
		sb.append(",ACCESSORIALS="+String.valueOf(ACCESSORIALS));
		sb.append(",ADJUSTMENTS="+String.valueOf(ADJUSTMENTS));
		sb.append(",TOTAL_DUE_AMOUNT="+String.valueOf(TOTAL_DUE_AMOUNT));
		sb.append(",INVOICE_STATUS="+INVOICE_STATUS);
		sb.append(",ADJUSTMENT_REASON="+ADJUSTMENT_REASON);
		sb.append(",INTERNAL_KEY1="+INTERNAL_KEY1);
		sb.append(",NSP_INVOICE_DETAILS_ID="+NSP_INVOICE_DETAILS_ID);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SCAC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCAC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(TVSI_VENDOR_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVSI_VENDOR_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CARRIER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CARRIER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(ACCOUNT_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCOUNT_NO);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(TRACKING_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRACKING_NO);
            			}
            		
        			sb.append("|");
        		
        				if(BOL_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOL_NO);
            			}
            		
        			sb.append("|");
        		
        				if(BILL_OPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BILL_OPTION);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(DELIVERY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DELIVERY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(MODE_INVOICED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODE_INVOICED);
            			}
            		
        			sb.append("|");
        		
        				if(SERVICE_LEVEL_INVOICED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERVICE_LEVEL_INVOICED);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(GL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(PO_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO_NO);
            			}
            		
        			sb.append("|");
        		
        				if(REFERENCE1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REFERENCE1);
            			}
            		
        			sb.append("|");
        		
        				if(REFERENCE2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REFERENCE2);
            			}
            		
        			sb.append("|");
        		
        				if(REFERENCE3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REFERENCE3);
            			}
            		
        			sb.append("|");
        		
        				if(REFERENCE4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REFERENCE4);
            			}
            		
        			sb.append("|");
        		
        				if(ZONE_INVOICED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ZONE_INVOICED);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_COMPANY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_COMPANY);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_ADDRESS1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_ADDRESS1);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_CITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_CITY);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_POSTAL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_POSTAL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPER_COUNTRY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPER_COUNTRY);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_COMPANY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_COMPANY);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_ADDRESS1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_ADDRESS1);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_CITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_CITY);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_STATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_STATE);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_POSTAL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_POSTAL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVER_COUNTRY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVER_COUNTRY);
            			}
            		
        			sb.append("|");
        		
        				if(ACTUAL_WEIGHT_INVOICED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACTUAL_WEIGHT_INVOICED);
            			}
            		
        			sb.append("|");
        		
        				if(BILL_WEIGHT_INVOICED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BILL_WEIGHT_INVOICED);
            			}
            		
        			sb.append("|");
        		
        				if(TOTAL_CHARGES == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOTAL_CHARGES);
            			}
            		
        			sb.append("|");
        		
        				if(LINE_HAUL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LINE_HAUL);
            			}
            		
        			sb.append("|");
        		
        				if(FUEL_SURCHARGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FUEL_SURCHARGE);
            			}
            		
        			sb.append("|");
        		
        				if(FUEL_DISCOUNT_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FUEL_DISCOUNT_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(DISCOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISCOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(ACCESSORIALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACCESSORIALS);
            			}
            		
        			sb.append("|");
        		
        				if(ADJUSTMENTS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADJUSTMENTS);
            			}
            		
        			sb.append("|");
        		
        				if(TOTAL_DUE_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOTAL_DUE_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_STATUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_STATUS);
            			}
            		
        			sb.append("|");
        		
        				if(ADJUSTMENT_REASON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADJUSTMENT_REASON);
            			}
            		
        			sb.append("|");
        		
        				if(INTERNAL_KEY1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERNAL_KEY1);
            			}
            		
        			sb.append("|");
        		
        				if(NSP_INVOICE_DETAILS_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NSP_INVOICE_DETAILS_ID);
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
    public int compareTo(koerberStruct other) {

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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[0];

	
			    public String Scac_Code;

				public String getScac_Code () {
					return this.Scac_Code;
				}

				public Boolean Scac_CodeIsNullable(){
				    return true;
				}
				public Boolean Scac_CodeIsKey(){
				    return false;
				}
				public Integer Scac_CodeLength(){
				    return 255;
				}
				public Integer Scac_CodePrecision(){
				    return 0;
				}
				public String Scac_CodeDefault(){
				
					return null;
				
				}
				public String Scac_CodeComment(){
				
				    return null;
				
				}
				public String Scac_CodePattern(){
				
					return "";
				
				}
				public String Scac_CodeOriginalDbColumnName(){
				
					return "Scac Code";
				
				}

				
			    public String TVSI_Vendor_ID;

				public String getTVSI_Vendor_ID () {
					return this.TVSI_Vendor_ID;
				}

				public Boolean TVSI_Vendor_IDIsNullable(){
				    return true;
				}
				public Boolean TVSI_Vendor_IDIsKey(){
				    return false;
				}
				public Integer TVSI_Vendor_IDLength(){
				    return 255;
				}
				public Integer TVSI_Vendor_IDPrecision(){
				    return 0;
				}
				public String TVSI_Vendor_IDDefault(){
				
					return null;
				
				}
				public String TVSI_Vendor_IDComment(){
				
				    return null;
				
				}
				public String TVSI_Vendor_IDPattern(){
				
					return "";
				
				}
				public String TVSI_Vendor_IDOriginalDbColumnName(){
				
					return "TVSI Vendor ID";
				
				}

				
			    public String Carrier_Name;

				public String getCarrier_Name () {
					return this.Carrier_Name;
				}

				public Boolean Carrier_NameIsNullable(){
				    return true;
				}
				public Boolean Carrier_NameIsKey(){
				    return false;
				}
				public Integer Carrier_NameLength(){
				    return 255;
				}
				public Integer Carrier_NamePrecision(){
				    return 0;
				}
				public String Carrier_NameDefault(){
				
					return null;
				
				}
				public String Carrier_NameComment(){
				
				    return null;
				
				}
				public String Carrier_NamePattern(){
				
					return "";
				
				}
				public String Carrier_NameOriginalDbColumnName(){
				
					return "Carrier Name";
				
				}

				
			    public String Account__;

				public String getAccount__ () {
					return this.Account__;
				}

				public Boolean Account__IsNullable(){
				    return true;
				}
				public Boolean Account__IsKey(){
				    return false;
				}
				public Integer Account__Length(){
				    return 255;
				}
				public Integer Account__Precision(){
				    return 0;
				}
				public String Account__Default(){
				
					return null;
				
				}
				public String Account__Comment(){
				
				    return null;
				
				}
				public String Account__Pattern(){
				
					return "";
				
				}
				public String Account__OriginalDbColumnName(){
				
					return "Account #";
				
				}

				
			    public String Invoice__;

				public String getInvoice__ () {
					return this.Invoice__;
				}

				public Boolean Invoice__IsNullable(){
				    return true;
				}
				public Boolean Invoice__IsKey(){
				    return false;
				}
				public Integer Invoice__Length(){
				    return 255;
				}
				public Integer Invoice__Precision(){
				    return 0;
				}
				public String Invoice__Default(){
				
					return null;
				
				}
				public String Invoice__Comment(){
				
				    return null;
				
				}
				public String Invoice__Pattern(){
				
					return "";
				
				}
				public String Invoice__OriginalDbColumnName(){
				
					return "Invoice #";
				
				}

				
			    public String PRO_____Tracking__;

				public String getPRO_____Tracking__ () {
					return this.PRO_____Tracking__;
				}

				public Boolean PRO_____Tracking__IsNullable(){
				    return true;
				}
				public Boolean PRO_____Tracking__IsKey(){
				    return false;
				}
				public Integer PRO_____Tracking__Length(){
				    return 255;
				}
				public Integer PRO_____Tracking__Precision(){
				    return 0;
				}
				public String PRO_____Tracking__Default(){
				
					return null;
				
				}
				public String PRO_____Tracking__Comment(){
				
				    return null;
				
				}
				public String PRO_____Tracking__Pattern(){
				
					return "";
				
				}
				public String PRO_____Tracking__OriginalDbColumnName(){
				
					return "PRO # / Tracking #";
				
				}

				
			    public String BOL__;

				public String getBOL__ () {
					return this.BOL__;
				}

				public Boolean BOL__IsNullable(){
				    return true;
				}
				public Boolean BOL__IsKey(){
				    return false;
				}
				public Integer BOL__Length(){
				    return 255;
				}
				public Integer BOL__Precision(){
				    return 0;
				}
				public String BOL__Default(){
				
					return null;
				
				}
				public String BOL__Comment(){
				
				    return null;
				
				}
				public String BOL__Pattern(){
				
					return "";
				
				}
				public String BOL__OriginalDbColumnName(){
				
					return "BOL #";
				
				}

				
			    public String Bill_Option;

				public String getBill_Option () {
					return this.Bill_Option;
				}

				public Boolean Bill_OptionIsNullable(){
				    return true;
				}
				public Boolean Bill_OptionIsKey(){
				    return false;
				}
				public Integer Bill_OptionLength(){
				    return 255;
				}
				public Integer Bill_OptionPrecision(){
				    return 0;
				}
				public String Bill_OptionDefault(){
				
					return null;
				
				}
				public String Bill_OptionComment(){
				
				    return null;
				
				}
				public String Bill_OptionPattern(){
				
					return "";
				
				}
				public String Bill_OptionOriginalDbColumnName(){
				
					return "Bill Option";
				
				}

				
			    public java.util.Date Invoice_Date;

				public java.util.Date getInvoice_Date () {
					return this.Invoice_Date;
				}

				public Boolean Invoice_DateIsNullable(){
				    return true;
				}
				public Boolean Invoice_DateIsKey(){
				    return false;
				}
				public Integer Invoice_DateLength(){
				    return 23;
				}
				public Integer Invoice_DatePrecision(){
				    return 3;
				}
				public String Invoice_DateDefault(){
				
					return null;
				
				}
				public String Invoice_DateComment(){
				
				    return null;
				
				}
				public String Invoice_DatePattern(){
				
					return "MM/dd/yyyy";
				
				}
				public String Invoice_DateOriginalDbColumnName(){
				
					return "Invoice Date";
				
				}

				
			    public java.util.Date Ship_Date;

				public java.util.Date getShip_Date () {
					return this.Ship_Date;
				}

				public Boolean Ship_DateIsNullable(){
				    return true;
				}
				public Boolean Ship_DateIsKey(){
				    return false;
				}
				public Integer Ship_DateLength(){
				    return 23;
				}
				public Integer Ship_DatePrecision(){
				    return 3;
				}
				public String Ship_DateDefault(){
				
					return null;
				
				}
				public String Ship_DateComment(){
				
				    return null;
				
				}
				public String Ship_DatePattern(){
				
					return "MM/dd/yyyy";
				
				}
				public String Ship_DateOriginalDbColumnName(){
				
					return "Ship Date";
				
				}

				
			    public java.util.Date Delivery_Date;

				public java.util.Date getDelivery_Date () {
					return this.Delivery_Date;
				}

				public Boolean Delivery_DateIsNullable(){
				    return true;
				}
				public Boolean Delivery_DateIsKey(){
				    return false;
				}
				public Integer Delivery_DateLength(){
				    return 23;
				}
				public Integer Delivery_DatePrecision(){
				    return 3;
				}
				public String Delivery_DateDefault(){
				
					return null;
				
				}
				public String Delivery_DateComment(){
				
				    return null;
				
				}
				public String Delivery_DatePattern(){
				
					return "MM/dd/yyyy";
				
				}
				public String Delivery_DateOriginalDbColumnName(){
				
					return "Delivery Date";
				
				}

				
			    public String Mode__Invoiced_;

				public String getMode__Invoiced_ () {
					return this.Mode__Invoiced_;
				}

				public Boolean Mode__Invoiced_IsNullable(){
				    return true;
				}
				public Boolean Mode__Invoiced_IsKey(){
				    return false;
				}
				public Integer Mode__Invoiced_Length(){
				    return 255;
				}
				public Integer Mode__Invoiced_Precision(){
				    return 0;
				}
				public String Mode__Invoiced_Default(){
				
					return null;
				
				}
				public String Mode__Invoiced_Comment(){
				
				    return null;
				
				}
				public String Mode__Invoiced_Pattern(){
				
					return "";
				
				}
				public String Mode__Invoiced_OriginalDbColumnName(){
				
					return "Mode (Invoiced)";
				
				}

				
			    public String Service_Level__Invoiced_;

				public String getService_Level__Invoiced_ () {
					return this.Service_Level__Invoiced_;
				}

				public Boolean Service_Level__Invoiced_IsNullable(){
				    return true;
				}
				public Boolean Service_Level__Invoiced_IsKey(){
				    return false;
				}
				public Integer Service_Level__Invoiced_Length(){
				    return 255;
				}
				public Integer Service_Level__Invoiced_Precision(){
				    return 0;
				}
				public String Service_Level__Invoiced_Default(){
				
					return null;
				
				}
				public String Service_Level__Invoiced_Comment(){
				
				    return null;
				
				}
				public String Service_Level__Invoiced_Pattern(){
				
					return "";
				
				}
				public String Service_Level__Invoiced_OriginalDbColumnName(){
				
					return "Service Level (Invoiced)";
				
				}

				
			    public String Invoice_Method;

				public String getInvoice_Method () {
					return this.Invoice_Method;
				}

				public Boolean Invoice_MethodIsNullable(){
				    return true;
				}
				public Boolean Invoice_MethodIsKey(){
				    return false;
				}
				public Integer Invoice_MethodLength(){
				    return 255;
				}
				public Integer Invoice_MethodPrecision(){
				    return 0;
				}
				public String Invoice_MethodDefault(){
				
					return null;
				
				}
				public String Invoice_MethodComment(){
				
				    return null;
				
				}
				public String Invoice_MethodPattern(){
				
					return "";
				
				}
				public String Invoice_MethodOriginalDbColumnName(){
				
					return "Invoice Method";
				
				}

				
			    public String GL_Code;

				public String getGL_Code () {
					return this.GL_Code;
				}

				public Boolean GL_CodeIsNullable(){
				    return true;
				}
				public Boolean GL_CodeIsKey(){
				    return false;
				}
				public Integer GL_CodeLength(){
				    return 255;
				}
				public Integer GL_CodePrecision(){
				    return 0;
				}
				public String GL_CodeDefault(){
				
					return null;
				
				}
				public String GL_CodeComment(){
				
				    return null;
				
				}
				public String GL_CodePattern(){
				
					return "";
				
				}
				public String GL_CodeOriginalDbColumnName(){
				
					return "GL Code";
				
				}

				
			    public String PO__;

				public String getPO__ () {
					return this.PO__;
				}

				public Boolean PO__IsNullable(){
				    return true;
				}
				public Boolean PO__IsKey(){
				    return false;
				}
				public Integer PO__Length(){
				    return 255;
				}
				public Integer PO__Precision(){
				    return 0;
				}
				public String PO__Default(){
				
					return null;
				
				}
				public String PO__Comment(){
				
				    return null;
				
				}
				public String PO__Pattern(){
				
					return "";
				
				}
				public String PO__OriginalDbColumnName(){
				
					return "PO #";
				
				}

				
			    public String Reference1;

				public String getReference1 () {
					return this.Reference1;
				}

				public Boolean Reference1IsNullable(){
				    return true;
				}
				public Boolean Reference1IsKey(){
				    return false;
				}
				public Integer Reference1Length(){
				    return 255;
				}
				public Integer Reference1Precision(){
				    return 0;
				}
				public String Reference1Default(){
				
					return null;
				
				}
				public String Reference1Comment(){
				
				    return null;
				
				}
				public String Reference1Pattern(){
				
					return "";
				
				}
				public String Reference1OriginalDbColumnName(){
				
					return "Reference1";
				
				}

				
			    public String Reference2;

				public String getReference2 () {
					return this.Reference2;
				}

				public Boolean Reference2IsNullable(){
				    return true;
				}
				public Boolean Reference2IsKey(){
				    return false;
				}
				public Integer Reference2Length(){
				    return 255;
				}
				public Integer Reference2Precision(){
				    return 0;
				}
				public String Reference2Default(){
				
					return null;
				
				}
				public String Reference2Comment(){
				
				    return null;
				
				}
				public String Reference2Pattern(){
				
					return "";
				
				}
				public String Reference2OriginalDbColumnName(){
				
					return "Reference2";
				
				}

				
			    public String Reference3;

				public String getReference3 () {
					return this.Reference3;
				}

				public Boolean Reference3IsNullable(){
				    return true;
				}
				public Boolean Reference3IsKey(){
				    return false;
				}
				public Integer Reference3Length(){
				    return 255;
				}
				public Integer Reference3Precision(){
				    return 0;
				}
				public String Reference3Default(){
				
					return null;
				
				}
				public String Reference3Comment(){
				
				    return null;
				
				}
				public String Reference3Pattern(){
				
					return "";
				
				}
				public String Reference3OriginalDbColumnName(){
				
					return "Reference3";
				
				}

				
			    public String Reference4;

				public String getReference4 () {
					return this.Reference4;
				}

				public Boolean Reference4IsNullable(){
				    return true;
				}
				public Boolean Reference4IsKey(){
				    return false;
				}
				public Integer Reference4Length(){
				    return 255;
				}
				public Integer Reference4Precision(){
				    return 0;
				}
				public String Reference4Default(){
				
					return null;
				
				}
				public String Reference4Comment(){
				
				    return null;
				
				}
				public String Reference4Pattern(){
				
					return "";
				
				}
				public String Reference4OriginalDbColumnName(){
				
					return "Reference4";
				
				}

				
			    public String Zone__Invoiced_;

				public String getZone__Invoiced_ () {
					return this.Zone__Invoiced_;
				}

				public Boolean Zone__Invoiced_IsNullable(){
				    return true;
				}
				public Boolean Zone__Invoiced_IsKey(){
				    return false;
				}
				public Integer Zone__Invoiced_Length(){
				    return 255;
				}
				public Integer Zone__Invoiced_Precision(){
				    return 0;
				}
				public String Zone__Invoiced_Default(){
				
					return null;
				
				}
				public String Zone__Invoiced_Comment(){
				
				    return null;
				
				}
				public String Zone__Invoiced_Pattern(){
				
					return "";
				
				}
				public String Zone__Invoiced_OriginalDbColumnName(){
				
					return "Zone (Invoiced)";
				
				}

				
			    public String Shipper_Name;

				public String getShipper_Name () {
					return this.Shipper_Name;
				}

				public Boolean Shipper_NameIsNullable(){
				    return true;
				}
				public Boolean Shipper_NameIsKey(){
				    return false;
				}
				public Integer Shipper_NameLength(){
				    return 255;
				}
				public Integer Shipper_NamePrecision(){
				    return 0;
				}
				public String Shipper_NameDefault(){
				
					return null;
				
				}
				public String Shipper_NameComment(){
				
				    return null;
				
				}
				public String Shipper_NamePattern(){
				
					return "";
				
				}
				public String Shipper_NameOriginalDbColumnName(){
				
					return "Shipper Name";
				
				}

				
			    public String Shipper_Company;

				public String getShipper_Company () {
					return this.Shipper_Company;
				}

				public Boolean Shipper_CompanyIsNullable(){
				    return true;
				}
				public Boolean Shipper_CompanyIsKey(){
				    return false;
				}
				public Integer Shipper_CompanyLength(){
				    return 255;
				}
				public Integer Shipper_CompanyPrecision(){
				    return 0;
				}
				public String Shipper_CompanyDefault(){
				
					return null;
				
				}
				public String Shipper_CompanyComment(){
				
				    return null;
				
				}
				public String Shipper_CompanyPattern(){
				
					return "";
				
				}
				public String Shipper_CompanyOriginalDbColumnName(){
				
					return "Shipper Company";
				
				}

				
			    public String Shipper_Address_1;

				public String getShipper_Address_1 () {
					return this.Shipper_Address_1;
				}

				public Boolean Shipper_Address_1IsNullable(){
				    return true;
				}
				public Boolean Shipper_Address_1IsKey(){
				    return false;
				}
				public Integer Shipper_Address_1Length(){
				    return 255;
				}
				public Integer Shipper_Address_1Precision(){
				    return 0;
				}
				public String Shipper_Address_1Default(){
				
					return null;
				
				}
				public String Shipper_Address_1Comment(){
				
				    return null;
				
				}
				public String Shipper_Address_1Pattern(){
				
					return "";
				
				}
				public String Shipper_Address_1OriginalDbColumnName(){
				
					return "Shipper Address 1";
				
				}

				
			    public String Shipper_City;

				public String getShipper_City () {
					return this.Shipper_City;
				}

				public Boolean Shipper_CityIsNullable(){
				    return true;
				}
				public Boolean Shipper_CityIsKey(){
				    return false;
				}
				public Integer Shipper_CityLength(){
				    return 255;
				}
				public Integer Shipper_CityPrecision(){
				    return 0;
				}
				public String Shipper_CityDefault(){
				
					return null;
				
				}
				public String Shipper_CityComment(){
				
				    return null;
				
				}
				public String Shipper_CityPattern(){
				
					return "";
				
				}
				public String Shipper_CityOriginalDbColumnName(){
				
					return "Shipper City";
				
				}

				
			    public String Shipper_State;

				public String getShipper_State () {
					return this.Shipper_State;
				}

				public Boolean Shipper_StateIsNullable(){
				    return true;
				}
				public Boolean Shipper_StateIsKey(){
				    return false;
				}
				public Integer Shipper_StateLength(){
				    return 255;
				}
				public Integer Shipper_StatePrecision(){
				    return 0;
				}
				public String Shipper_StateDefault(){
				
					return null;
				
				}
				public String Shipper_StateComment(){
				
				    return null;
				
				}
				public String Shipper_StatePattern(){
				
					return "";
				
				}
				public String Shipper_StateOriginalDbColumnName(){
				
					return "Shipper State";
				
				}

				
			    public String Shipper_Postal_Code;

				public String getShipper_Postal_Code () {
					return this.Shipper_Postal_Code;
				}

				public Boolean Shipper_Postal_CodeIsNullable(){
				    return true;
				}
				public Boolean Shipper_Postal_CodeIsKey(){
				    return false;
				}
				public Integer Shipper_Postal_CodeLength(){
				    return 255;
				}
				public Integer Shipper_Postal_CodePrecision(){
				    return 0;
				}
				public String Shipper_Postal_CodeDefault(){
				
					return null;
				
				}
				public String Shipper_Postal_CodeComment(){
				
				    return null;
				
				}
				public String Shipper_Postal_CodePattern(){
				
					return "";
				
				}
				public String Shipper_Postal_CodeOriginalDbColumnName(){
				
					return "Shipper Postal Code";
				
				}

				
			    public String Shipper_Country;

				public String getShipper_Country () {
					return this.Shipper_Country;
				}

				public Boolean Shipper_CountryIsNullable(){
				    return true;
				}
				public Boolean Shipper_CountryIsKey(){
				    return false;
				}
				public Integer Shipper_CountryLength(){
				    return 255;
				}
				public Integer Shipper_CountryPrecision(){
				    return 0;
				}
				public String Shipper_CountryDefault(){
				
					return null;
				
				}
				public String Shipper_CountryComment(){
				
				    return null;
				
				}
				public String Shipper_CountryPattern(){
				
					return "";
				
				}
				public String Shipper_CountryOriginalDbColumnName(){
				
					return "Shipper Country";
				
				}

				
			    public String Receiver_Name;

				public String getReceiver_Name () {
					return this.Receiver_Name;
				}

				public Boolean Receiver_NameIsNullable(){
				    return true;
				}
				public Boolean Receiver_NameIsKey(){
				    return false;
				}
				public Integer Receiver_NameLength(){
				    return 255;
				}
				public Integer Receiver_NamePrecision(){
				    return 0;
				}
				public String Receiver_NameDefault(){
				
					return null;
				
				}
				public String Receiver_NameComment(){
				
				    return null;
				
				}
				public String Receiver_NamePattern(){
				
					return "";
				
				}
				public String Receiver_NameOriginalDbColumnName(){
				
					return "Receiver Name";
				
				}

				
			    public String Receiver_Company;

				public String getReceiver_Company () {
					return this.Receiver_Company;
				}

				public Boolean Receiver_CompanyIsNullable(){
				    return true;
				}
				public Boolean Receiver_CompanyIsKey(){
				    return false;
				}
				public Integer Receiver_CompanyLength(){
				    return 255;
				}
				public Integer Receiver_CompanyPrecision(){
				    return 0;
				}
				public String Receiver_CompanyDefault(){
				
					return null;
				
				}
				public String Receiver_CompanyComment(){
				
				    return null;
				
				}
				public String Receiver_CompanyPattern(){
				
					return "";
				
				}
				public String Receiver_CompanyOriginalDbColumnName(){
				
					return "Receiver Company";
				
				}

				
			    public String Receiver_Address_1;

				public String getReceiver_Address_1 () {
					return this.Receiver_Address_1;
				}

				public Boolean Receiver_Address_1IsNullable(){
				    return true;
				}
				public Boolean Receiver_Address_1IsKey(){
				    return false;
				}
				public Integer Receiver_Address_1Length(){
				    return 255;
				}
				public Integer Receiver_Address_1Precision(){
				    return 0;
				}
				public String Receiver_Address_1Default(){
				
					return null;
				
				}
				public String Receiver_Address_1Comment(){
				
				    return null;
				
				}
				public String Receiver_Address_1Pattern(){
				
					return "";
				
				}
				public String Receiver_Address_1OriginalDbColumnName(){
				
					return "Receiver Address 1";
				
				}

				
			    public String Receiver_City;

				public String getReceiver_City () {
					return this.Receiver_City;
				}

				public Boolean Receiver_CityIsNullable(){
				    return true;
				}
				public Boolean Receiver_CityIsKey(){
				    return false;
				}
				public Integer Receiver_CityLength(){
				    return 255;
				}
				public Integer Receiver_CityPrecision(){
				    return 0;
				}
				public String Receiver_CityDefault(){
				
					return null;
				
				}
				public String Receiver_CityComment(){
				
				    return null;
				
				}
				public String Receiver_CityPattern(){
				
					return "";
				
				}
				public String Receiver_CityOriginalDbColumnName(){
				
					return "Receiver City";
				
				}

				
			    public String Receiver_State;

				public String getReceiver_State () {
					return this.Receiver_State;
				}

				public Boolean Receiver_StateIsNullable(){
				    return true;
				}
				public Boolean Receiver_StateIsKey(){
				    return false;
				}
				public Integer Receiver_StateLength(){
				    return 255;
				}
				public Integer Receiver_StatePrecision(){
				    return 0;
				}
				public String Receiver_StateDefault(){
				
					return null;
				
				}
				public String Receiver_StateComment(){
				
				    return null;
				
				}
				public String Receiver_StatePattern(){
				
					return "";
				
				}
				public String Receiver_StateOriginalDbColumnName(){
				
					return "Receiver State";
				
				}

				
			    public String Receiver_Postal_Code;

				public String getReceiver_Postal_Code () {
					return this.Receiver_Postal_Code;
				}

				public Boolean Receiver_Postal_CodeIsNullable(){
				    return true;
				}
				public Boolean Receiver_Postal_CodeIsKey(){
				    return false;
				}
				public Integer Receiver_Postal_CodeLength(){
				    return 255;
				}
				public Integer Receiver_Postal_CodePrecision(){
				    return 0;
				}
				public String Receiver_Postal_CodeDefault(){
				
					return null;
				
				}
				public String Receiver_Postal_CodeComment(){
				
				    return null;
				
				}
				public String Receiver_Postal_CodePattern(){
				
					return "";
				
				}
				public String Receiver_Postal_CodeOriginalDbColumnName(){
				
					return "Receiver Postal Code";
				
				}

				
			    public String Receiver_Country;

				public String getReceiver_Country () {
					return this.Receiver_Country;
				}

				public Boolean Receiver_CountryIsNullable(){
				    return true;
				}
				public Boolean Receiver_CountryIsKey(){
				    return false;
				}
				public Integer Receiver_CountryLength(){
				    return 255;
				}
				public Integer Receiver_CountryPrecision(){
				    return 0;
				}
				public String Receiver_CountryDefault(){
				
					return null;
				
				}
				public String Receiver_CountryComment(){
				
				    return null;
				
				}
				public String Receiver_CountryPattern(){
				
					return "";
				
				}
				public String Receiver_CountryOriginalDbColumnName(){
				
					return "Receiver Country";
				
				}

				
			    public Float Actual_Weight__Invoiced_;

				public Float getActual_Weight__Invoiced_ () {
					return this.Actual_Weight__Invoiced_;
				}

				public Boolean Actual_Weight__Invoiced_IsNullable(){
				    return true;
				}
				public Boolean Actual_Weight__Invoiced_IsKey(){
				    return false;
				}
				public Integer Actual_Weight__Invoiced_Length(){
				    return 53;
				}
				public Integer Actual_Weight__Invoiced_Precision(){
				    return 0;
				}
				public String Actual_Weight__Invoiced_Default(){
				
					return null;
				
				}
				public String Actual_Weight__Invoiced_Comment(){
				
				    return null;
				
				}
				public String Actual_Weight__Invoiced_Pattern(){
				
					return "";
				
				}
				public String Actual_Weight__Invoiced_OriginalDbColumnName(){
				
					return "Actual Weight (Invoiced)";
				
				}

				
			    public Float Bill_Weight__Invoiced_;

				public Float getBill_Weight__Invoiced_ () {
					return this.Bill_Weight__Invoiced_;
				}

				public Boolean Bill_Weight__Invoiced_IsNullable(){
				    return true;
				}
				public Boolean Bill_Weight__Invoiced_IsKey(){
				    return false;
				}
				public Integer Bill_Weight__Invoiced_Length(){
				    return 53;
				}
				public Integer Bill_Weight__Invoiced_Precision(){
				    return 0;
				}
				public String Bill_Weight__Invoiced_Default(){
				
					return null;
				
				}
				public String Bill_Weight__Invoiced_Comment(){
				
				    return null;
				
				}
				public String Bill_Weight__Invoiced_Pattern(){
				
					return "";
				
				}
				public String Bill_Weight__Invoiced_OriginalDbColumnName(){
				
					return "Bill Weight (Invoiced)";
				
				}

				
			    public Float Total_Charges;

				public Float getTotal_Charges () {
					return this.Total_Charges;
				}

				public Boolean Total_ChargesIsNullable(){
				    return true;
				}
				public Boolean Total_ChargesIsKey(){
				    return false;
				}
				public Integer Total_ChargesLength(){
				    return 53;
				}
				public Integer Total_ChargesPrecision(){
				    return 0;
				}
				public String Total_ChargesDefault(){
				
					return null;
				
				}
				public String Total_ChargesComment(){
				
				    return null;
				
				}
				public String Total_ChargesPattern(){
				
					return "";
				
				}
				public String Total_ChargesOriginalDbColumnName(){
				
					return "Total Charges";
				
				}

				
			    public Float Line_Haul;

				public Float getLine_Haul () {
					return this.Line_Haul;
				}

				public Boolean Line_HaulIsNullable(){
				    return true;
				}
				public Boolean Line_HaulIsKey(){
				    return false;
				}
				public Integer Line_HaulLength(){
				    return 53;
				}
				public Integer Line_HaulPrecision(){
				    return 0;
				}
				public String Line_HaulDefault(){
				
					return null;
				
				}
				public String Line_HaulComment(){
				
				    return null;
				
				}
				public String Line_HaulPattern(){
				
					return "";
				
				}
				public String Line_HaulOriginalDbColumnName(){
				
					return "Line Haul";
				
				}

				
			    public Float Fuel_Surcharge;

				public Float getFuel_Surcharge () {
					return this.Fuel_Surcharge;
				}

				public Boolean Fuel_SurchargeIsNullable(){
				    return true;
				}
				public Boolean Fuel_SurchargeIsKey(){
				    return false;
				}
				public Integer Fuel_SurchargeLength(){
				    return 53;
				}
				public Integer Fuel_SurchargePrecision(){
				    return 0;
				}
				public String Fuel_SurchargeDefault(){
				
					return null;
				
				}
				public String Fuel_SurchargeComment(){
				
				    return null;
				
				}
				public String Fuel_SurchargePattern(){
				
					return "";
				
				}
				public String Fuel_SurchargeOriginalDbColumnName(){
				
					return "Fuel Surcharge";
				
				}

				
			    public Float Fuel_Discount_Amount;

				public Float getFuel_Discount_Amount () {
					return this.Fuel_Discount_Amount;
				}

				public Boolean Fuel_Discount_AmountIsNullable(){
				    return true;
				}
				public Boolean Fuel_Discount_AmountIsKey(){
				    return false;
				}
				public Integer Fuel_Discount_AmountLength(){
				    return 53;
				}
				public Integer Fuel_Discount_AmountPrecision(){
				    return 0;
				}
				public String Fuel_Discount_AmountDefault(){
				
					return null;
				
				}
				public String Fuel_Discount_AmountComment(){
				
				    return null;
				
				}
				public String Fuel_Discount_AmountPattern(){
				
					return "";
				
				}
				public String Fuel_Discount_AmountOriginalDbColumnName(){
				
					return "Fuel Discount Amount";
				
				}

				
			    public Float Discount;

				public Float getDiscount () {
					return this.Discount;
				}

				public Boolean DiscountIsNullable(){
				    return true;
				}
				public Boolean DiscountIsKey(){
				    return false;
				}
				public Integer DiscountLength(){
				    return 53;
				}
				public Integer DiscountPrecision(){
				    return 0;
				}
				public String DiscountDefault(){
				
					return null;
				
				}
				public String DiscountComment(){
				
				    return null;
				
				}
				public String DiscountPattern(){
				
					return "";
				
				}
				public String DiscountOriginalDbColumnName(){
				
					return "Discount";
				
				}

				
			    public Float Accessorials;

				public Float getAccessorials () {
					return this.Accessorials;
				}

				public Boolean AccessorialsIsNullable(){
				    return true;
				}
				public Boolean AccessorialsIsKey(){
				    return false;
				}
				public Integer AccessorialsLength(){
				    return 53;
				}
				public Integer AccessorialsPrecision(){
				    return 0;
				}
				public String AccessorialsDefault(){
				
					return null;
				
				}
				public String AccessorialsComment(){
				
				    return null;
				
				}
				public String AccessorialsPattern(){
				
					return "";
				
				}
				public String AccessorialsOriginalDbColumnName(){
				
					return "Accessorials";
				
				}

				
			    public Float Adjustments;

				public Float getAdjustments () {
					return this.Adjustments;
				}

				public Boolean AdjustmentsIsNullable(){
				    return true;
				}
				public Boolean AdjustmentsIsKey(){
				    return false;
				}
				public Integer AdjustmentsLength(){
				    return 53;
				}
				public Integer AdjustmentsPrecision(){
				    return 0;
				}
				public String AdjustmentsDefault(){
				
					return null;
				
				}
				public String AdjustmentsComment(){
				
				    return null;
				
				}
				public String AdjustmentsPattern(){
				
					return "";
				
				}
				public String AdjustmentsOriginalDbColumnName(){
				
					return "Adjustments";
				
				}

				
			    public Float Total_Due_Amount;

				public Float getTotal_Due_Amount () {
					return this.Total_Due_Amount;
				}

				public Boolean Total_Due_AmountIsNullable(){
				    return true;
				}
				public Boolean Total_Due_AmountIsKey(){
				    return false;
				}
				public Integer Total_Due_AmountLength(){
				    return 53;
				}
				public Integer Total_Due_AmountPrecision(){
				    return 0;
				}
				public String Total_Due_AmountDefault(){
				
					return null;
				
				}
				public String Total_Due_AmountComment(){
				
				    return null;
				
				}
				public String Total_Due_AmountPattern(){
				
					return "";
				
				}
				public String Total_Due_AmountOriginalDbColumnName(){
				
					return "Total Due Amount";
				
				}

				
			    public String Invoice_Status;

				public String getInvoice_Status () {
					return this.Invoice_Status;
				}

				public Boolean Invoice_StatusIsNullable(){
				    return true;
				}
				public Boolean Invoice_StatusIsKey(){
				    return false;
				}
				public Integer Invoice_StatusLength(){
				    return 255;
				}
				public Integer Invoice_StatusPrecision(){
				    return 0;
				}
				public String Invoice_StatusDefault(){
				
					return null;
				
				}
				public String Invoice_StatusComment(){
				
				    return null;
				
				}
				public String Invoice_StatusPattern(){
				
					return "";
				
				}
				public String Invoice_StatusOriginalDbColumnName(){
				
					return "Invoice Status";
				
				}

				
			    public String Adjustment_Reason;

				public String getAdjustment_Reason () {
					return this.Adjustment_Reason;
				}

				public Boolean Adjustment_ReasonIsNullable(){
				    return true;
				}
				public Boolean Adjustment_ReasonIsKey(){
				    return false;
				}
				public Integer Adjustment_ReasonLength(){
				    return 255;
				}
				public Integer Adjustment_ReasonPrecision(){
				    return 0;
				}
				public String Adjustment_ReasonDefault(){
				
					return null;
				
				}
				public String Adjustment_ReasonComment(){
				
				    return null;
				
				}
				public String Adjustment_ReasonPattern(){
				
					return "";
				
				}
				public String Adjustment_ReasonOriginalDbColumnName(){
				
					return "Adjustment Reason";
				
				}

				
			    public String Internal_Key_1;

				public String getInternal_Key_1 () {
					return this.Internal_Key_1;
				}

				public Boolean Internal_Key_1IsNullable(){
				    return true;
				}
				public Boolean Internal_Key_1IsKey(){
				    return false;
				}
				public Integer Internal_Key_1Length(){
				    return 53;
				}
				public Integer Internal_Key_1Precision(){
				    return 0;
				}
				public String Internal_Key_1Default(){
				
					return null;
				
				}
				public String Internal_Key_1Comment(){
				
				    return null;
				
				}
				public String Internal_Key_1Pattern(){
				
					return "";
				
				}
				public String Internal_Key_1OriginalDbColumnName(){
				
					return "Internal Key 1";
				
				}

				
			    public String Nsp_Invoice_Details_Id;

				public String getNsp_Invoice_Details_Id () {
					return this.Nsp_Invoice_Details_Id;
				}

				public Boolean Nsp_Invoice_Details_IdIsNullable(){
				    return true;
				}
				public Boolean Nsp_Invoice_Details_IdIsKey(){
				    return false;
				}
				public Integer Nsp_Invoice_Details_IdLength(){
				    return 255;
				}
				public Integer Nsp_Invoice_Details_IdPrecision(){
				    return 0;
				}
				public String Nsp_Invoice_Details_IdDefault(){
				
					return null;
				
				}
				public String Nsp_Invoice_Details_IdComment(){
				
				    return null;
				
				}
				public String Nsp_Invoice_Details_IdPattern(){
				
					return "";
				
				}
				public String Nsp_Invoice_Details_IdOriginalDbColumnName(){
				
					return "Nsp Invoice Details Id";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_koerber_data_into_snowflake, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake) {

        	try {

        		int length = 0;
		
					this.Scac_Code = readString(dis);
					
					this.TVSI_Vendor_ID = readString(dis);
					
					this.Carrier_Name = readString(dis);
					
					this.Account__ = readString(dis);
					
					this.Invoice__ = readString(dis);
					
					this.PRO_____Tracking__ = readString(dis);
					
					this.BOL__ = readString(dis);
					
					this.Bill_Option = readString(dis);
					
					this.Invoice_Date = readDate(dis);
					
					this.Ship_Date = readDate(dis);
					
					this.Delivery_Date = readDate(dis);
					
					this.Mode__Invoiced_ = readString(dis);
					
					this.Service_Level__Invoiced_ = readString(dis);
					
					this.Invoice_Method = readString(dis);
					
					this.GL_Code = readString(dis);
					
					this.PO__ = readString(dis);
					
					this.Reference1 = readString(dis);
					
					this.Reference2 = readString(dis);
					
					this.Reference3 = readString(dis);
					
					this.Reference4 = readString(dis);
					
					this.Zone__Invoiced_ = readString(dis);
					
					this.Shipper_Name = readString(dis);
					
					this.Shipper_Company = readString(dis);
					
					this.Shipper_Address_1 = readString(dis);
					
					this.Shipper_City = readString(dis);
					
					this.Shipper_State = readString(dis);
					
					this.Shipper_Postal_Code = readString(dis);
					
					this.Shipper_Country = readString(dis);
					
					this.Receiver_Name = readString(dis);
					
					this.Receiver_Company = readString(dis);
					
					this.Receiver_Address_1 = readString(dis);
					
					this.Receiver_City = readString(dis);
					
					this.Receiver_State = readString(dis);
					
					this.Receiver_Postal_Code = readString(dis);
					
					this.Receiver_Country = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Actual_Weight__Invoiced_ = null;
           				} else {
           			    	this.Actual_Weight__Invoiced_ = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Bill_Weight__Invoiced_ = null;
           				} else {
           			    	this.Bill_Weight__Invoiced_ = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Total_Charges = null;
           				} else {
           			    	this.Total_Charges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Line_Haul = null;
           				} else {
           			    	this.Line_Haul = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Fuel_Surcharge = null;
           				} else {
           			    	this.Fuel_Surcharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Fuel_Discount_Amount = null;
           				} else {
           			    	this.Fuel_Discount_Amount = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Discount = null;
           				} else {
           			    	this.Discount = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Accessorials = null;
           				} else {
           			    	this.Accessorials = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Adjustments = null;
           				} else {
           			    	this.Adjustments = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Total_Due_Amount = null;
           				} else {
           			    	this.Total_Due_Amount = dis.readFloat();
           				}
					
					this.Invoice_Status = readString(dis);
					
					this.Adjustment_Reason = readString(dis);
					
					this.Internal_Key_1 = readString(dis);
					
					this.Nsp_Invoice_Details_Id = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_koerber_data_into_snowflake) {

        	try {

        		int length = 0;
		
					this.Scac_Code = readString(dis);
					
					this.TVSI_Vendor_ID = readString(dis);
					
					this.Carrier_Name = readString(dis);
					
					this.Account__ = readString(dis);
					
					this.Invoice__ = readString(dis);
					
					this.PRO_____Tracking__ = readString(dis);
					
					this.BOL__ = readString(dis);
					
					this.Bill_Option = readString(dis);
					
					this.Invoice_Date = readDate(dis);
					
					this.Ship_Date = readDate(dis);
					
					this.Delivery_Date = readDate(dis);
					
					this.Mode__Invoiced_ = readString(dis);
					
					this.Service_Level__Invoiced_ = readString(dis);
					
					this.Invoice_Method = readString(dis);
					
					this.GL_Code = readString(dis);
					
					this.PO__ = readString(dis);
					
					this.Reference1 = readString(dis);
					
					this.Reference2 = readString(dis);
					
					this.Reference3 = readString(dis);
					
					this.Reference4 = readString(dis);
					
					this.Zone__Invoiced_ = readString(dis);
					
					this.Shipper_Name = readString(dis);
					
					this.Shipper_Company = readString(dis);
					
					this.Shipper_Address_1 = readString(dis);
					
					this.Shipper_City = readString(dis);
					
					this.Shipper_State = readString(dis);
					
					this.Shipper_Postal_Code = readString(dis);
					
					this.Shipper_Country = readString(dis);
					
					this.Receiver_Name = readString(dis);
					
					this.Receiver_Company = readString(dis);
					
					this.Receiver_Address_1 = readString(dis);
					
					this.Receiver_City = readString(dis);
					
					this.Receiver_State = readString(dis);
					
					this.Receiver_Postal_Code = readString(dis);
					
					this.Receiver_Country = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Actual_Weight__Invoiced_ = null;
           				} else {
           			    	this.Actual_Weight__Invoiced_ = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Bill_Weight__Invoiced_ = null;
           				} else {
           			    	this.Bill_Weight__Invoiced_ = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Total_Charges = null;
           				} else {
           			    	this.Total_Charges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Line_Haul = null;
           				} else {
           			    	this.Line_Haul = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Fuel_Surcharge = null;
           				} else {
           			    	this.Fuel_Surcharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Fuel_Discount_Amount = null;
           				} else {
           			    	this.Fuel_Discount_Amount = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Discount = null;
           				} else {
           			    	this.Discount = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Accessorials = null;
           				} else {
           			    	this.Accessorials = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Adjustments = null;
           				} else {
           			    	this.Adjustments = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Total_Due_Amount = null;
           				} else {
           			    	this.Total_Due_Amount = dis.readFloat();
           				}
					
					this.Invoice_Status = readString(dis);
					
					this.Adjustment_Reason = readString(dis);
					
					this.Internal_Key_1 = readString(dis);
					
					this.Nsp_Invoice_Details_Id = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.Scac_Code,dos);
					
					// String
				
						writeString(this.TVSI_Vendor_ID,dos);
					
					// String
				
						writeString(this.Carrier_Name,dos);
					
					// String
				
						writeString(this.Account__,dos);
					
					// String
				
						writeString(this.Invoice__,dos);
					
					// String
				
						writeString(this.PRO_____Tracking__,dos);
					
					// String
				
						writeString(this.BOL__,dos);
					
					// String
				
						writeString(this.Bill_Option,dos);
					
					// java.util.Date
				
						writeDate(this.Invoice_Date,dos);
					
					// java.util.Date
				
						writeDate(this.Ship_Date,dos);
					
					// java.util.Date
				
						writeDate(this.Delivery_Date,dos);
					
					// String
				
						writeString(this.Mode__Invoiced_,dos);
					
					// String
				
						writeString(this.Service_Level__Invoiced_,dos);
					
					// String
				
						writeString(this.Invoice_Method,dos);
					
					// String
				
						writeString(this.GL_Code,dos);
					
					// String
				
						writeString(this.PO__,dos);
					
					// String
				
						writeString(this.Reference1,dos);
					
					// String
				
						writeString(this.Reference2,dos);
					
					// String
				
						writeString(this.Reference3,dos);
					
					// String
				
						writeString(this.Reference4,dos);
					
					// String
				
						writeString(this.Zone__Invoiced_,dos);
					
					// String
				
						writeString(this.Shipper_Name,dos);
					
					// String
				
						writeString(this.Shipper_Company,dos);
					
					// String
				
						writeString(this.Shipper_Address_1,dos);
					
					// String
				
						writeString(this.Shipper_City,dos);
					
					// String
				
						writeString(this.Shipper_State,dos);
					
					// String
				
						writeString(this.Shipper_Postal_Code,dos);
					
					// String
				
						writeString(this.Shipper_Country,dos);
					
					// String
				
						writeString(this.Receiver_Name,dos);
					
					// String
				
						writeString(this.Receiver_Company,dos);
					
					// String
				
						writeString(this.Receiver_Address_1,dos);
					
					// String
				
						writeString(this.Receiver_City,dos);
					
					// String
				
						writeString(this.Receiver_State,dos);
					
					// String
				
						writeString(this.Receiver_Postal_Code,dos);
					
					// String
				
						writeString(this.Receiver_Country,dos);
					
					// Float
				
						if(this.Actual_Weight__Invoiced_ == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Actual_Weight__Invoiced_);
		            	}
					
					// Float
				
						if(this.Bill_Weight__Invoiced_ == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Bill_Weight__Invoiced_);
		            	}
					
					// Float
				
						if(this.Total_Charges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Total_Charges);
		            	}
					
					// Float
				
						if(this.Line_Haul == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Line_Haul);
		            	}
					
					// Float
				
						if(this.Fuel_Surcharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Fuel_Surcharge);
		            	}
					
					// Float
				
						if(this.Fuel_Discount_Amount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Fuel_Discount_Amount);
		            	}
					
					// Float
				
						if(this.Discount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Discount);
		            	}
					
					// Float
				
						if(this.Accessorials == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Accessorials);
		            	}
					
					// Float
				
						if(this.Adjustments == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Adjustments);
		            	}
					
					// Float
				
						if(this.Total_Due_Amount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Total_Due_Amount);
		            	}
					
					// String
				
						writeString(this.Invoice_Status,dos);
					
					// String
				
						writeString(this.Adjustment_Reason,dos);
					
					// String
				
						writeString(this.Internal_Key_1,dos);
					
					// String
				
						writeString(this.Nsp_Invoice_Details_Id,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.Scac_Code,dos);
					
					// String
				
						writeString(this.TVSI_Vendor_ID,dos);
					
					// String
				
						writeString(this.Carrier_Name,dos);
					
					// String
				
						writeString(this.Account__,dos);
					
					// String
				
						writeString(this.Invoice__,dos);
					
					// String
				
						writeString(this.PRO_____Tracking__,dos);
					
					// String
				
						writeString(this.BOL__,dos);
					
					// String
				
						writeString(this.Bill_Option,dos);
					
					// java.util.Date
				
						writeDate(this.Invoice_Date,dos);
					
					// java.util.Date
				
						writeDate(this.Ship_Date,dos);
					
					// java.util.Date
				
						writeDate(this.Delivery_Date,dos);
					
					// String
				
						writeString(this.Mode__Invoiced_,dos);
					
					// String
				
						writeString(this.Service_Level__Invoiced_,dos);
					
					// String
				
						writeString(this.Invoice_Method,dos);
					
					// String
				
						writeString(this.GL_Code,dos);
					
					// String
				
						writeString(this.PO__,dos);
					
					// String
				
						writeString(this.Reference1,dos);
					
					// String
				
						writeString(this.Reference2,dos);
					
					// String
				
						writeString(this.Reference3,dos);
					
					// String
				
						writeString(this.Reference4,dos);
					
					// String
				
						writeString(this.Zone__Invoiced_,dos);
					
					// String
				
						writeString(this.Shipper_Name,dos);
					
					// String
				
						writeString(this.Shipper_Company,dos);
					
					// String
				
						writeString(this.Shipper_Address_1,dos);
					
					// String
				
						writeString(this.Shipper_City,dos);
					
					// String
				
						writeString(this.Shipper_State,dos);
					
					// String
				
						writeString(this.Shipper_Postal_Code,dos);
					
					// String
				
						writeString(this.Shipper_Country,dos);
					
					// String
				
						writeString(this.Receiver_Name,dos);
					
					// String
				
						writeString(this.Receiver_Company,dos);
					
					// String
				
						writeString(this.Receiver_Address_1,dos);
					
					// String
				
						writeString(this.Receiver_City,dos);
					
					// String
				
						writeString(this.Receiver_State,dos);
					
					// String
				
						writeString(this.Receiver_Postal_Code,dos);
					
					// String
				
						writeString(this.Receiver_Country,dos);
					
					// Float
				
						if(this.Actual_Weight__Invoiced_ == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Actual_Weight__Invoiced_);
		            	}
					
					// Float
				
						if(this.Bill_Weight__Invoiced_ == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Bill_Weight__Invoiced_);
		            	}
					
					// Float
				
						if(this.Total_Charges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Total_Charges);
		            	}
					
					// Float
				
						if(this.Line_Haul == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Line_Haul);
		            	}
					
					// Float
				
						if(this.Fuel_Surcharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Fuel_Surcharge);
		            	}
					
					// Float
				
						if(this.Fuel_Discount_Amount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Fuel_Discount_Amount);
		            	}
					
					// Float
				
						if(this.Discount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Discount);
		            	}
					
					// Float
				
						if(this.Accessorials == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Accessorials);
		            	}
					
					// Float
				
						if(this.Adjustments == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Adjustments);
		            	}
					
					// Float
				
						if(this.Total_Due_Amount == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Total_Due_Amount);
		            	}
					
					// String
				
						writeString(this.Invoice_Status,dos);
					
					// String
				
						writeString(this.Adjustment_Reason,dos);
					
					// String
				
						writeString(this.Internal_Key_1,dos);
					
					// String
				
						writeString(this.Nsp_Invoice_Details_Id,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("Scac_Code="+Scac_Code);
		sb.append(",TVSI_Vendor_ID="+TVSI_Vendor_ID);
		sb.append(",Carrier_Name="+Carrier_Name);
		sb.append(",Account__="+Account__);
		sb.append(",Invoice__="+Invoice__);
		sb.append(",PRO_____Tracking__="+PRO_____Tracking__);
		sb.append(",BOL__="+BOL__);
		sb.append(",Bill_Option="+Bill_Option);
		sb.append(",Invoice_Date="+String.valueOf(Invoice_Date));
		sb.append(",Ship_Date="+String.valueOf(Ship_Date));
		sb.append(",Delivery_Date="+String.valueOf(Delivery_Date));
		sb.append(",Mode__Invoiced_="+Mode__Invoiced_);
		sb.append(",Service_Level__Invoiced_="+Service_Level__Invoiced_);
		sb.append(",Invoice_Method="+Invoice_Method);
		sb.append(",GL_Code="+GL_Code);
		sb.append(",PO__="+PO__);
		sb.append(",Reference1="+Reference1);
		sb.append(",Reference2="+Reference2);
		sb.append(",Reference3="+Reference3);
		sb.append(",Reference4="+Reference4);
		sb.append(",Zone__Invoiced_="+Zone__Invoiced_);
		sb.append(",Shipper_Name="+Shipper_Name);
		sb.append(",Shipper_Company="+Shipper_Company);
		sb.append(",Shipper_Address_1="+Shipper_Address_1);
		sb.append(",Shipper_City="+Shipper_City);
		sb.append(",Shipper_State="+Shipper_State);
		sb.append(",Shipper_Postal_Code="+Shipper_Postal_Code);
		sb.append(",Shipper_Country="+Shipper_Country);
		sb.append(",Receiver_Name="+Receiver_Name);
		sb.append(",Receiver_Company="+Receiver_Company);
		sb.append(",Receiver_Address_1="+Receiver_Address_1);
		sb.append(",Receiver_City="+Receiver_City);
		sb.append(",Receiver_State="+Receiver_State);
		sb.append(",Receiver_Postal_Code="+Receiver_Postal_Code);
		sb.append(",Receiver_Country="+Receiver_Country);
		sb.append(",Actual_Weight__Invoiced_="+String.valueOf(Actual_Weight__Invoiced_));
		sb.append(",Bill_Weight__Invoiced_="+String.valueOf(Bill_Weight__Invoiced_));
		sb.append(",Total_Charges="+String.valueOf(Total_Charges));
		sb.append(",Line_Haul="+String.valueOf(Line_Haul));
		sb.append(",Fuel_Surcharge="+String.valueOf(Fuel_Surcharge));
		sb.append(",Fuel_Discount_Amount="+String.valueOf(Fuel_Discount_Amount));
		sb.append(",Discount="+String.valueOf(Discount));
		sb.append(",Accessorials="+String.valueOf(Accessorials));
		sb.append(",Adjustments="+String.valueOf(Adjustments));
		sb.append(",Total_Due_Amount="+String.valueOf(Total_Due_Amount));
		sb.append(",Invoice_Status="+Invoice_Status);
		sb.append(",Adjustment_Reason="+Adjustment_Reason);
		sb.append(",Internal_Key_1="+Internal_Key_1);
		sb.append(",Nsp_Invoice_Details_Id="+Nsp_Invoice_Details_Id);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(Scac_Code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Scac_Code);
            			}
            		
        			sb.append("|");
        		
        				if(TVSI_Vendor_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TVSI_Vendor_ID);
            			}
            		
        			sb.append("|");
        		
        				if(Carrier_Name == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Carrier_Name);
            			}
            		
        			sb.append("|");
        		
        				if(Account__ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Account__);
            			}
            		
        			sb.append("|");
        		
        				if(Invoice__ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Invoice__);
            			}
            		
        			sb.append("|");
        		
        				if(PRO_____Tracking__ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRO_____Tracking__);
            			}
            		
        			sb.append("|");
        		
        				if(BOL__ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOL__);
            			}
            		
        			sb.append("|");
        		
        				if(Bill_Option == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Bill_Option);
            			}
            		
        			sb.append("|");
        		
        				if(Invoice_Date == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Invoice_Date);
            			}
            		
        			sb.append("|");
        		
        				if(Ship_Date == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Ship_Date);
            			}
            		
        			sb.append("|");
        		
        				if(Delivery_Date == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Delivery_Date);
            			}
            		
        			sb.append("|");
        		
        				if(Mode__Invoiced_ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Mode__Invoiced_);
            			}
            		
        			sb.append("|");
        		
        				if(Service_Level__Invoiced_ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Service_Level__Invoiced_);
            			}
            		
        			sb.append("|");
        		
        				if(Invoice_Method == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Invoice_Method);
            			}
            		
        			sb.append("|");
        		
        				if(GL_Code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GL_Code);
            			}
            		
        			sb.append("|");
        		
        				if(PO__ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO__);
            			}
            		
        			sb.append("|");
        		
        				if(Reference1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Reference1);
            			}
            		
        			sb.append("|");
        		
        				if(Reference2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Reference2);
            			}
            		
        			sb.append("|");
        		
        				if(Reference3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Reference3);
            			}
            		
        			sb.append("|");
        		
        				if(Reference4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Reference4);
            			}
            		
        			sb.append("|");
        		
        				if(Zone__Invoiced_ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Zone__Invoiced_);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_Name == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_Name);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_Company == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_Company);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_Address_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_Address_1);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_City == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_City);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_State == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_State);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_Postal_Code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_Postal_Code);
            			}
            		
        			sb.append("|");
        		
        				if(Shipper_Country == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Shipper_Country);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_Name == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_Name);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_Company == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_Company);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_Address_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_Address_1);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_City == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_City);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_State == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_State);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_Postal_Code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_Postal_Code);
            			}
            		
        			sb.append("|");
        		
        				if(Receiver_Country == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Receiver_Country);
            			}
            		
        			sb.append("|");
        		
        				if(Actual_Weight__Invoiced_ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Actual_Weight__Invoiced_);
            			}
            		
        			sb.append("|");
        		
        				if(Bill_Weight__Invoiced_ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Bill_Weight__Invoiced_);
            			}
            		
        			sb.append("|");
        		
        				if(Total_Charges == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Total_Charges);
            			}
            		
        			sb.append("|");
        		
        				if(Line_Haul == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Line_Haul);
            			}
            		
        			sb.append("|");
        		
        				if(Fuel_Surcharge == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Fuel_Surcharge);
            			}
            		
        			sb.append("|");
        		
        				if(Fuel_Discount_Amount == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Fuel_Discount_Amount);
            			}
            		
        			sb.append("|");
        		
        				if(Discount == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Discount);
            			}
            		
        			sb.append("|");
        		
        				if(Accessorials == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Accessorials);
            			}
            		
        			sb.append("|");
        		
        				if(Adjustments == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Adjustments);
            			}
            		
        			sb.append("|");
        		
        				if(Total_Due_Amount == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Total_Due_Amount);
            			}
            		
        			sb.append("|");
        		
        				if(Invoice_Status == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Invoice_Status);
            			}
            		
        			sb.append("|");
        		
        				if(Adjustment_Reason == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Adjustment_Reason);
            			}
            		
        			sb.append("|");
        		
        				if(Internal_Key_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Internal_Key_1);
            			}
            		
        			sb.append("|");
        		
        				if(Nsp_Invoice_Details_Id == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Nsp_Invoice_Details_Id);
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
public void tFileList_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileList_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileList_3");
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
koerberStruct koerber = new koerberStruct();



	
	/**
	 * [tFileList_3 begin ] start
	 */

				
			int NB_ITERATE_tFileInputExcel_1 = 0; //for statistics
						
			int NB_ITERATE_tFileDelete_1 = 0; //for statistics
			

	
		
		ok_Hash.put("tFileList_3", false);
		start_Hash.put("tFileList_3", System.currentTimeMillis());
		
	
	currentComponent="tFileList_3";
	
	
		int tos_count_tFileList_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileList_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileList_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileList_3 = new StringBuilder();
                    log4jParamters_tFileList_3.append("Parameters:");
                            log4jParamters_tFileList_3.append("DIRECTORY" + " = " + "\"//wva-sql-etl/sftp/ftp_files/  - /sftp\"");
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
                            log4jParamters_tFileList_3.append("FILES" + " = " + "[{FILEMASK="+("\"Vitamin Shoppe EDW All Modes Shipment Detail \"+TalendDate.formatDate(\"MM-dd-yyyy\",TalendDate.getCurrentDate())+\".xlsx\"")+"}]");
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
                if(log.isDebugEnabled())
            log.debug("tFileList_3 - "  + (log4jParamters_tFileList_3) );
                    } 
                } 
            new BytesLimit65535_tFileList_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileList_3", "tFileList_2", "tFileList");
				talendJobLogProcess(globalMap);
			}
			
	
 
  
				final StringBuffer log4jSb_tFileList_3 = new StringBuffer();
			   
    
  String directory_tFileList_3 = "//wva-sql-etl/sftp/ftp_files/  - /sftp";
  final java.util.List<String> maskList_tFileList_3 = new java.util.ArrayList<String>();
  final java.util.List<java.util.regex.Pattern> patternList_tFileList_3 = new java.util.ArrayList<java.util.regex.Pattern>(); 
    maskList_tFileList_3.add("Vitamin Shoppe EDW All Modes Shipment Detail "+TalendDate.formatDate("MM-dd-yyyy",TalendDate.getCurrentDate())+".xlsx");  
  for (final String filemask_tFileList_3 : maskList_tFileList_3) {
	String filemask_compile_tFileList_3 = filemask_tFileList_3;
	
		filemask_compile_tFileList_3 = org.apache.oro.text.GlobCompiler.globToPerl5(filemask_tFileList_3.toCharArray(), org.apache.oro.text.GlobCompiler.DEFAULT_MASK);
	
		java.util.regex.Pattern fileNamePattern_tFileList_3 = java.util.regex.Pattern.compile(filemask_compile_tFileList_3);
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
          	if (fileNamePattern_tFileList_3.matcher(fileName_tFileList_3).matches()){
					if(!filePath_tFileList_3.contains(file.getAbsolutePath())) {
			          list_tFileList_3.add(file);
			          filePath_tFileList_3.add(file.getAbsolutePath());
			        }
			}
		}
                }
              return true;
            }
          }
      ); 
      java.util.Collections.sort(list_tFileList_3);
    
		log.info("tFileList_3 - Start to list files.");
	
    for (int i_tFileList_3 = 0; i_tFileList_3 < list_tFileList_3.size(); i_tFileList_3++){
      java.io.File files_tFileList_3 = list_tFileList_3.get(i_tFileList_3);
      String fileName_tFileList_3 = files_tFileList_3.getName();
      
      String currentFileName_tFileList_3 = files_tFileList_3.getName(); 
      String currentFilePath_tFileList_3 = files_tFileList_3.getAbsolutePath();
      String currentFileDirectory_tFileList_3 = files_tFileList_3.getParent();
      String currentFileExtension_tFileList_3 = null;
      
      if (files_tFileList_3.getName().contains(".") && files_tFileList_3.isFile()){
        currentFileExtension_tFileList_3 = files_tFileList_3.getName().substring(files_tFileList_3.getName().lastIndexOf(".") + 1);
      } else{
        currentFileExtension_tFileList_3 = "";
      }
      
      NB_FILEtFileList_3 ++;
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

	

	
	
	currentComponent="tFileList_3";
	
	

 


	tos_count_tFileList_3++;

/**
 * [tFileList_3 main ] stop
 */
	
	/**
	 * [tFileList_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileList_3";
	
	

 



/**
 * [tFileList_3 process_data_begin ] stop
 */
	NB_ITERATE_tFileInputExcel_1++;
	
	
					if(execStat){				
	       				runStat.updateStatOnConnection("row2", 3, 0);
					}           			
				
					if(execStat){				
	       				runStat.updateStatOnConnection("koerber", 3, 0);
					}           			
				
				if(execStat){
					runStat.updateStatOnConnection("iterate3", 1, "exec" + NB_ITERATE_tFileInputExcel_1);
					//Thread.sleep(1000);
				}				
			



	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"koerber");
			
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
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);
 		                    
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
 		                    
 		                    props_tDBOutput_1.connection.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBOutput_1.connection.setValue("account",
 		                    "vitaminshoppe");
 		                    
 		                    props_tDBOutput_1.connection.setValue("regionID",
 		                    "us-east-1");
 		                    
 		                    props_tDBOutput_1.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_1.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBOutput_1.connection.setValue("warehouse",
 		                    "VSI_WH_XS");
 		                    
 		                    props_tDBOutput_1.connection.setValue("db",
 		                    "PROD_DATA");
 		                    
 		                    props_tDBOutput_1.connection.setValue("schemaName",
 		                    "SUPPLY_CHAIN");
 		                    
 		                    props_tDBOutput_1.connection.setValue("role",
 		                    "");
 		                    
 		                    props_tDBOutput_1.connection.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("userId",
 		                    "vaishali_patil");
 		                    
 		                        props_tDBOutput_1.connection.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:VbsRqhQo7pn4iT7pRq3QqO0JH8/7i0soEMhc1bBLFPqgdr2bkY86"));
 		                        
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_1.table.setValue("tableName",
 		                    "KOERBER_BILLING_DETAIL");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("account",
 		                    "vitaminshoppe");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("regionID",
 		                    "us-east-1");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("warehouse",
 		                    "VSI_WH_XS");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("db",
 		                    "PROD_DATA");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("schemaName",
 		                    "SUPPLY_CHAIN");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("role",
 		                    "");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBOutput_1.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.table.connection.userPassword.setValue("userId",
 		                    "vaishali_patil");
 		                    
 		                        props_tDBOutput_1.table.connection.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:lIUoGV3gOFKDV+3KKUpONl98PHDaZG8X26scBW+VY60lyzYituFE"));
 		                        
 		                    props_tDBOutput_1.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_1_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"KOERBER_BILLING_DETAIL\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SCAC_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SCAC_CODE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TVSI_VENDOR_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TVSI_VENDOR_ID\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CARRIER_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CARRIER_NAME\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCOUNT_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ACCOUNT_NO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INVOICE_NO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRACKING_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TRACKING_NO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BOL_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BOL_NO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BILL_OPTION\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"BILL_OPTION\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"INVOICE_DATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"SHIP_DATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DELIVERY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"talend.field.dbType\":93,\"talend.field.dbColumnName\":\"DELIVERY_DATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODE_INVOICED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MODE_INVOICED\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SERVICE_LEVEL_INVOICED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SERVICE_LEVEL_INVOICED\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_METHOD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INVOICE_METHOD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"GL_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"GL_CODE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PO_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PO_NO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REFERENCE1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REFERENCE2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE3\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REFERENCE3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE4\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REFERENCE4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ZONE_INVOICED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ZONE_INVOICED\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_NAME\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_COMPANY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_COMPANY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_ADDRESS1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_ADDRESS1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_CITY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_CITY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_STATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_STATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_POSTAL_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_POSTAL_CODE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPER_COUNTRY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"SHIPPER_COUNTRY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_NAME\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_COMPANY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_COMPANY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_ADDRESS1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_ADDRESS1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_CITY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_CITY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_STATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_STATE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_POSTAL_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_POSTAL_CODE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVER_COUNTRY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RECEIVER_COUNTRY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACTUAL_WEIGHT_INVOICED\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ACTUAL_WEIGHT_INVOICED\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BILL_WEIGHT_INVOICED\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"BILL_WEIGHT_INVOICED\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TOTAL_CHARGES\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TOTAL_CHARGES\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LINE_HAUL\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"LINE_HAUL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FUEL_SURCHARGE\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"FUEL_SURCHARGE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FUEL_DISCOUNT_AMOUNT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"FUEL_DISCOUNT_AMOUNT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISCOUNT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"DISCOUNT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACCESSORIALS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ACCESSORIALS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ADJUSTMENTS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"ADJUSTMENTS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TOTAL_DUE_AMOUNT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"TOTAL_DUE_AMOUNT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_STATUS\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INVOICE_STATUS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ADJUSTMENT_REASON\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ADJUSTMENT_REASON\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INTERNAL_KEY1\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"INTERNAL_KEY1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NSP_INVOICE_DETAILS_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":255,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"NSP_INVOICE_DETAILS_ID\",\"talend.field.default\":\"\"},{",s);
     		                    						
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
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
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
		int count_row2_tMap_1 = 0;
		
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
				int count_koerber_tMap_1 = 0;
				
koerberStruct koerber_tmp = new koerberStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputExcel_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputExcel_1", false);
		start_Hash.put("tFileInputExcel_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputExcel_1";
	
	
		int tos_count_tFileInputExcel_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputExcel_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputExcel_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputExcel_1 = new StringBuilder();
                    log4jParamters_tFileInputExcel_1.append("Parameters:");
                            log4jParamters_tFileInputExcel_1.append("VERSION_2007" + " = " + "true");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("FILENAME" + " = " + "((String)globalMap.get(\"tFileList_3_CURRENT_FILEPATH\"))");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("PASSWORD" + " = " + String.valueOf("enc:routine.encryption.key.v1:LhKvOQmpNQ/MvmVZ4ozMZLuhJ15Ib2j/NdLCPg==").substring(0, 4) + "...");     
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("ALL_SHEETS" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("SHEETLIST" + " = " + "[{USE_REGEX="+("false")+", SHEETNAME="+("\"sheet1\"")+"}]");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("AFFECT_EACH_SHEET" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("FIRST_COLUMN" + " = " + "1");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("LAST_COLUMN" + " = " + "");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("Scac_Code")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TVSI_Vendor_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Carrier_Name")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Account__")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Invoice__")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRO_____Tracking__")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BOL__")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Bill_Option")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Invoice_Date")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Ship_Date")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Delivery_Date")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Mode__Invoiced_")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Service_Level__Invoiced_")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Invoice_Method")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("GL_Code")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PO__")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Reference1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Reference2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Reference3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Reference4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Zone__Invoiced_")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_Name")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_Company")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_Address_1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_City")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_State")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_Postal_Code")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Shipper_Country")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_Name")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_Company")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_Address_1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_City")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_State")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_Postal_Code")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Receiver_Country")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Actual_Weight__Invoiced_")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Bill_Weight__Invoiced_")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Total_Charges")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Line_Haul")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Fuel_Surcharge")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Fuel_Discount_Amount")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Discount")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Accessorials")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Adjustments")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Total_Due_Amount")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Invoice_Status")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Adjustment_Reason")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Internal_Key_1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Nsp_Invoice_Details_Id")+"}]");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("CONVERTDATETOSTRING" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("STOPREAD_ON_EMPTYROW" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("GENERATION_MODE" + " = " + "USER_MODE");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                            log4jParamters_tFileInputExcel_1.append("CONFIGURE_INFLATION_RATIO" + " = " + "false");
                        log4jParamters_tFileInputExcel_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputExcel_1 - "  + (log4jParamters_tFileInputExcel_1) );
                    } 
                } 
            new BytesLimit65535_tFileInputExcel_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputExcel_1", "tFileInputExcel_1", "tFileInputExcel");
				talendJobLogProcess(globalMap);
			}
			

 
	final String decryptedPassword_tFileInputExcel_1 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:VSpDj9f0h23pSyhIiRYtLcBqnQJSNbC/PDNfdQ==");
        String password_tFileInputExcel_1 = decryptedPassword_tFileInputExcel_1;
        if (password_tFileInputExcel_1.isEmpty()){
            password_tFileInputExcel_1 = null;
        }
			class RegexUtil_tFileInputExcel_1 {

		    	public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, String oneSheetName, boolean useRegex) {

			        java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();

			        if(useRegex){//this part process the regex issue

				        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(oneSheetName);
				        for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
				            String sheetName = sheet.getSheetName();
				            java.util.regex.Matcher matcher = pattern.matcher(sheetName);
				            if (matcher.matches()) {
				            	if(sheet != null){
				                	list.add((org.apache.poi.xssf.usermodel.XSSFSheet) sheet);
				                }
				            }
				        }

			        }else{
			        	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheet(oneSheetName);
		            	if(sheet != null){
		                	list.add(sheet);
		                }

			        }

			        return list;
			    }

			    public java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> getSheets(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook, int index, boolean useRegex) {
			    	java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> list =  new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
			    	org.apache.poi.xssf.usermodel.XSSFSheet sheet = (org.apache.poi.xssf.usermodel.XSSFSheet) workbook.getSheetAt(index);
	            	if(sheet != null){
	                	list.add(sheet);
	                }
			    	return list;
			    }

			}
		RegexUtil_tFileInputExcel_1 regexUtil_tFileInputExcel_1 = new RegexUtil_tFileInputExcel_1();

		Object source_tFileInputExcel_1 = ((String)globalMap.get("tFileList_3_CURRENT_FILEPATH"));
		org.apache.poi.xssf.usermodel.XSSFWorkbook workbook_tFileInputExcel_1 = null;
		
		if(source_tFileInputExcel_1 instanceof String){
			workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create(new java.io.File((String)source_tFileInputExcel_1), password_tFileInputExcel_1, true);
		} else if(source_tFileInputExcel_1 instanceof java.io.InputStream) {
     		workbook_tFileInputExcel_1 = (org.apache.poi.xssf.usermodel.XSSFWorkbook) org.apache.poi.ss.usermodel.WorkbookFactory.create((java.io.InputStream)source_tFileInputExcel_1, password_tFileInputExcel_1);
		} else{
			workbook_tFileInputExcel_1 = null;
			throw new java.lang.Exception("The data source should be specified as Inputstream or File Path!");
		}
		try {

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
        sheetList_tFileInputExcel_1.addAll(regexUtil_tFileInputExcel_1.getSheets(workbook_tFileInputExcel_1, "sheet1", false));
    	if(sheetList_tFileInputExcel_1.size() <= 0){
            throw new RuntimeException("Special sheets not exist!");
        }

		java.util.List<org.apache.poi.xssf.usermodel.XSSFSheet> sheetList_FilterNull_tFileInputExcel_1 = new java.util.ArrayList<org.apache.poi.xssf.usermodel.XSSFSheet>();
		for (org.apache.poi.xssf.usermodel.XSSFSheet sheet_FilterNull_tFileInputExcel_1 : sheetList_tFileInputExcel_1) {
			if(sheet_FilterNull_tFileInputExcel_1!=null && sheetList_FilterNull_tFileInputExcel_1.iterator()!=null && sheet_FilterNull_tFileInputExcel_1.iterator().hasNext()){
				sheetList_FilterNull_tFileInputExcel_1.add(sheet_FilterNull_tFileInputExcel_1);
			}
		}
		sheetList_tFileInputExcel_1 = sheetList_FilterNull_tFileInputExcel_1;
	if(sheetList_tFileInputExcel_1.size()>0){
		int nb_line_tFileInputExcel_1 = 0;

        int begin_line_tFileInputExcel_1 = 1;

        int footer_input_tFileInputExcel_1 = 0;

        int end_line_tFileInputExcel_1=0;
        for(org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1:sheetList_tFileInputExcel_1){
			end_line_tFileInputExcel_1+=(sheet_tFileInputExcel_1.getLastRowNum()+1);
        }
        end_line_tFileInputExcel_1 -= footer_input_tFileInputExcel_1;
        int limit_tFileInputExcel_1 = -1;
        int start_column_tFileInputExcel_1 = 1-1;
        int end_column_tFileInputExcel_1 = -1;

        org.apache.poi.xssf.usermodel.XSSFRow row_tFileInputExcel_1 = null;
        org.apache.poi.xssf.usermodel.XSSFSheet sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1.get(0);
        int rowCount_tFileInputExcel_1 = 0;
        int sheetIndex_tFileInputExcel_1 = 0;
        int currentRows_tFileInputExcel_1 = (sheetList_tFileInputExcel_1.get(0).getLastRowNum()+1);

		//for the number format
        java.text.DecimalFormat df_tFileInputExcel_1 = new java.text.DecimalFormat("#.####################################");
        char decimalChar_tFileInputExcel_1 = df_tFileInputExcel_1.getDecimalFormatSymbols().getDecimalSeparator();
						log.debug("tFileInputExcel_1 - Retrieving records from the datasource.");
			
        for(int i_tFileInputExcel_1 = begin_line_tFileInputExcel_1; i_tFileInputExcel_1 < end_line_tFileInputExcel_1; i_tFileInputExcel_1++){

        	int emptyColumnCount_tFileInputExcel_1 = 0;

        	if (limit_tFileInputExcel_1 != -1 && nb_line_tFileInputExcel_1 >= limit_tFileInputExcel_1) {
        		break;
        	}

            while (i_tFileInputExcel_1 >= rowCount_tFileInputExcel_1 + currentRows_tFileInputExcel_1) {
                rowCount_tFileInputExcel_1 += currentRows_tFileInputExcel_1;
                sheet_tFileInputExcel_1 = sheetList_tFileInputExcel_1.get(++sheetIndex_tFileInputExcel_1);
                currentRows_tFileInputExcel_1 = (sheet_tFileInputExcel_1.getLastRowNum()+1);
            }
            globalMap.put("tFileInputExcel_1_CURRENT_SHEET",sheet_tFileInputExcel_1.getSheetName());
            if (rowCount_tFileInputExcel_1 <= i_tFileInputExcel_1) {
                row_tFileInputExcel_1 = sheet_tFileInputExcel_1.getRow(i_tFileInputExcel_1 - rowCount_tFileInputExcel_1);
            }
		    row2 = null;
					int tempRowLength_tFileInputExcel_1 = 49;
				
				int columnIndex_tFileInputExcel_1 = 0;
			
			String[] temp_row_tFileInputExcel_1 = new String[tempRowLength_tFileInputExcel_1];
			int excel_end_column_tFileInputExcel_1;
			if(row_tFileInputExcel_1==null){
				excel_end_column_tFileInputExcel_1=0;
			}else{
				excel_end_column_tFileInputExcel_1=row_tFileInputExcel_1.getLastCellNum();
			}
			int actual_end_column_tFileInputExcel_1;
			if(end_column_tFileInputExcel_1 == -1){
				actual_end_column_tFileInputExcel_1 = excel_end_column_tFileInputExcel_1;
			}
			else{
				actual_end_column_tFileInputExcel_1 = end_column_tFileInputExcel_1 >	excel_end_column_tFileInputExcel_1 ? excel_end_column_tFileInputExcel_1 : end_column_tFileInputExcel_1;
			}
			org.apache.poi.ss.formula.eval.NumberEval ne_tFileInputExcel_1 = null;
			for(int i=0;i<tempRowLength_tFileInputExcel_1;i++){
				if(i + start_column_tFileInputExcel_1 < actual_end_column_tFileInputExcel_1){
					org.apache.poi.ss.usermodel.Cell cell_tFileInputExcel_1 = row_tFileInputExcel_1.getCell(i + start_column_tFileInputExcel_1);
					if(cell_tFileInputExcel_1!=null){
					switch (cell_tFileInputExcel_1.getCellType()) {
                        case STRING:
                            temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1.getRichStringCellValue().getString();
                            break;
                        case NUMERIC:
                            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_1)) {
									temp_row_tFileInputExcel_1[i] =cell_tFileInputExcel_1.getDateCellValue().toString();
                            } else {
                                temp_row_tFileInputExcel_1[i] = df_tFileInputExcel_1.format(cell_tFileInputExcel_1.getNumericCellValue());
                            }
                            break;
                        case BOOLEAN:
                            temp_row_tFileInputExcel_1[i] =String.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
                            break;
                        case FORMULA:
        					switch (cell_tFileInputExcel_1.getCachedFormulaResultType()) {
                                case STRING:
                                    temp_row_tFileInputExcel_1[i] = cell_tFileInputExcel_1.getRichStringCellValue().getString();
                                    break;
                                case NUMERIC:
                                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell_tFileInputExcel_1)) {
											temp_row_tFileInputExcel_1[i] =cell_tFileInputExcel_1.getDateCellValue().toString();
                                    } else {
	                                    ne_tFileInputExcel_1 = new org.apache.poi.ss.formula.eval.NumberEval(cell_tFileInputExcel_1.getNumericCellValue());
										temp_row_tFileInputExcel_1[i] = ne_tFileInputExcel_1.getStringValue();
                                    }
                                    break;
                                case BOOLEAN:
                                    temp_row_tFileInputExcel_1[i] =String.valueOf(cell_tFileInputExcel_1.getBooleanCellValue());
                                    break;
                                default:
                            		temp_row_tFileInputExcel_1[i] = "";
                            }
                            break;
                        default:
                            temp_row_tFileInputExcel_1[i] = "";
                        }
                	}
                	else{
                		temp_row_tFileInputExcel_1[i]="";
                	}

				}else{
					temp_row_tFileInputExcel_1[i]="";
				}
			}
			boolean whetherReject_tFileInputExcel_1 = false;
			row2 = new row2Struct();
			int curColNum_tFileInputExcel_1 = -1;
			String curColName_tFileInputExcel_1 = "";
			try{
							columnIndex_tFileInputExcel_1 = 0;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Scac_Code";

				row2.Scac_Code = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Scac_Code = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 1;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "TVSI_Vendor_ID";

				row2.TVSI_Vendor_ID = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.TVSI_Vendor_ID = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 2;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Carrier_Name";

				row2.Carrier_Name = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Carrier_Name = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 3;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Account__";

				row2.Account__ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Account__ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 4;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Invoice__";

				row2.Invoice__ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Invoice__ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 5;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "PRO_____Tracking__";

				row2.PRO_____Tracking__ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.PRO_____Tracking__ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 6;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "BOL__";

				row2.BOL__ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.BOL__ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 7;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Bill_Option";

				row2.Bill_Option = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Bill_Option = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 8;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Invoice_Date";

				if(8<actual_end_column_tFileInputExcel_1){
					try{
						if(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC && org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1))){
							row2.Invoice_Date = row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getDateCellValue();
						}
						else{
                            java.util.Date tempDate_tFileInputExcel_1 = ParserUtils.parseTo_Date(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], "MM/dd/yyyy");
                            if(tempDate_tFileInputExcel_1.after((new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS")).parse("9999/12/31 23:59:59.999"))||tempDate_tFileInputExcel_1.before((new SimpleDateFormat("yyyy/MM/dd")).parse("1900/01/01"))){
                                throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
                            }else{
                                row2.Invoice_Date = tempDate_tFileInputExcel_1;
                            }
						}
					}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_1_ERROR_MESSAGE",e.getMessage());
						
						throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
					}
				}

			}else{
				row2.Invoice_Date = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 9;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Ship_Date";

				if(9<actual_end_column_tFileInputExcel_1){
					try{
						if(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC && org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1))){
							row2.Ship_Date = row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getDateCellValue();
						}
						else{
                            java.util.Date tempDate_tFileInputExcel_1 = ParserUtils.parseTo_Date(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], "MM/dd/yyyy");
                            if(tempDate_tFileInputExcel_1.after((new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS")).parse("9999/12/31 23:59:59.999"))||tempDate_tFileInputExcel_1.before((new SimpleDateFormat("yyyy/MM/dd")).parse("1900/01/01"))){
                                throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
                            }else{
                                row2.Ship_Date = tempDate_tFileInputExcel_1;
                            }
						}
					}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_1_ERROR_MESSAGE",e.getMessage());
						
						throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
					}
				}

			}else{
				row2.Ship_Date = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 10;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Delivery_Date";

				if(10<actual_end_column_tFileInputExcel_1){
					try{
						if(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getCellType() == org.apache.poi.ss.usermodel.CellType.NUMERIC && org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1))){
							row2.Delivery_Date = row_tFileInputExcel_1.getCell(columnIndex_tFileInputExcel_1+ start_column_tFileInputExcel_1).getDateCellValue();
						}
						else{
                            java.util.Date tempDate_tFileInputExcel_1 = ParserUtils.parseTo_Date(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], "MM/dd/yyyy");
                            if(tempDate_tFileInputExcel_1.after((new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS")).parse("9999/12/31 23:59:59.999"))||tempDate_tFileInputExcel_1.before((new SimpleDateFormat("yyyy/MM/dd")).parse("1900/01/01"))){
                                throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
                            }else{
                                row2.Delivery_Date = tempDate_tFileInputExcel_1;
                            }
						}
					}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_1_ERROR_MESSAGE",e.getMessage());
						
						throw new RuntimeException("The cell format is not Date in ( Row. "+(nb_line_tFileInputExcel_1+1)+ " and ColumnNum. " + curColNum_tFileInputExcel_1 + " )");
					}
				}

			}else{
				row2.Delivery_Date = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 11;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Mode__Invoiced_";

				row2.Mode__Invoiced_ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Mode__Invoiced_ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 12;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Service_Level__Invoiced_";

				row2.Service_Level__Invoiced_ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Service_Level__Invoiced_ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 13;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Invoice_Method";

				row2.Invoice_Method = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Invoice_Method = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 14;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "GL_Code";

				row2.GL_Code = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.GL_Code = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 15;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "PO__";

				row2.PO__ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.PO__ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 16;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Reference1";

				row2.Reference1 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Reference1 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 17;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Reference2";

				row2.Reference2 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Reference2 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 18;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Reference3";

				row2.Reference3 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Reference3 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 19;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Reference4";

				row2.Reference4 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Reference4 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 20;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Zone__Invoiced_";

				row2.Zone__Invoiced_ = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Zone__Invoiced_ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 21;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_Name";

				row2.Shipper_Name = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_Name = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 22;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_Company";

				row2.Shipper_Company = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_Company = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 23;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_Address_1";

				row2.Shipper_Address_1 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_Address_1 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 24;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_City";

				row2.Shipper_City = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_City = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 25;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_State";

				row2.Shipper_State = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_State = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 26;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_Postal_Code";

				row2.Shipper_Postal_Code = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_Postal_Code = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 27;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Shipper_Country";

				row2.Shipper_Country = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Shipper_Country = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 28;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_Name";

				row2.Receiver_Name = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_Name = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 29;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_Company";

				row2.Receiver_Company = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_Company = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 30;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_Address_1";

				row2.Receiver_Address_1 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_Address_1 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 31;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_City";

				row2.Receiver_City = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_City = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 32;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_State";

				row2.Receiver_State = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_State = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 33;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_Postal_Code";

				row2.Receiver_Postal_Code = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_Postal_Code = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 34;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Receiver_Country";

				row2.Receiver_Country = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Receiver_Country = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 35;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Actual_Weight__Invoiced_";

				row2.Actual_Weight__Invoiced_ = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Actual_Weight__Invoiced_ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 36;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Bill_Weight__Invoiced_";

				row2.Bill_Weight__Invoiced_ = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Bill_Weight__Invoiced_ = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 37;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Total_Charges";

				row2.Total_Charges = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Total_Charges = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 38;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Line_Haul";

				row2.Line_Haul = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Line_Haul = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 39;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Fuel_Surcharge";

				row2.Fuel_Surcharge = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Fuel_Surcharge = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 40;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Fuel_Discount_Amount";

				row2.Fuel_Discount_Amount = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Fuel_Discount_Amount = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 41;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Discount";

				row2.Discount = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Discount = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 42;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Accessorials";

				row2.Accessorials = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Accessorials = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 43;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Adjustments";

				row2.Adjustments = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Adjustments = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 44;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Total_Due_Amount";

				row2.Total_Due_Amount = ParserUtils.parseTo_Float(ParserUtils.parseTo_Number(temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1], null, '.'==decimalChar_tFileInputExcel_1 ? null : decimalChar_tFileInputExcel_1));
			}else{
				row2.Total_Due_Amount = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 45;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Invoice_Status";

				row2.Invoice_Status = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Invoice_Status = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 46;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Adjustment_Reason";

				row2.Adjustment_Reason = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Adjustment_Reason = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 47;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Internal_Key_1";

				row2.Internal_Key_1 = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Internal_Key_1 = null;
				emptyColumnCount_tFileInputExcel_1++;
			}
							columnIndex_tFileInputExcel_1 = 48;
						
			if( temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1].length() > 0) {
				curColNum_tFileInputExcel_1=columnIndex_tFileInputExcel_1 + start_column_tFileInputExcel_1 + 1;
				curColName_tFileInputExcel_1 = "Nsp_Invoice_Details_Id";

				row2.Nsp_Invoice_Details_Id = temp_row_tFileInputExcel_1[columnIndex_tFileInputExcel_1];
			}else{
				row2.Nsp_Invoice_Details_Id = null;
				emptyColumnCount_tFileInputExcel_1++;
			}

				nb_line_tFileInputExcel_1++;
				
				log.debug("tFileInputExcel_1 - Retrieving the record " + (nb_line_tFileInputExcel_1) + ".");
			
			}catch(java.lang.Exception e){
globalMap.put("tFileInputExcel_1_ERROR_MESSAGE",e.getMessage());
			whetherReject_tFileInputExcel_1 = true;
						log.error("tFileInputExcel_1 - " + e.getMessage());
					
					 System.err.println(e.getMessage());
					 row2 = null;
			}


		



 



/**
 * [tFileInputExcel_1 begin ] stop
 */
	
	/**
	 * [tFileInputExcel_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";
	
	

 


	tos_count_tFileInputExcel_1++;

/**
 * [tFileInputExcel_1 main ] stop
 */
	
	/**
	 * [tFileInputExcel_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";
	
	

 



/**
 * [tFileInputExcel_1 process_data_begin ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tFileInputExcel_1","tFileInputExcel_1","tFileInputExcel","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
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
Var.var1 = TalendDate.getCurrentDate() ;// ###############################
        // ###############################
        // # Output tables

koerber = null;


// # Output table : 'koerber'
count_koerber_tMap_1++;

koerber_tmp.SCAC_CODE = row2.Scac_Code;
koerber_tmp.TVSI_VENDOR_ID = row2.TVSI_Vendor_ID;
koerber_tmp.CARRIER_NAME = row2.Carrier_Name;
koerber_tmp.ACCOUNT_NO = row2.Account__ ;
koerber_tmp.INVOICE_NO = row2.Invoice__ ;
koerber_tmp.TRACKING_NO = row2.PRO_____Tracking__ ;
koerber_tmp.BOL_NO = row2.BOL__ ;
koerber_tmp.BILL_OPTION = row2.Bill_Option;
koerber_tmp.INVOICE_DATE = row2.Invoice_Date;
koerber_tmp.SHIP_DATE = row2.Ship_Date;
koerber_tmp.DELIVERY_DATE = row2.Delivery_Date;
koerber_tmp.MODE_INVOICED = row2.Mode__Invoiced_ ;
koerber_tmp.SERVICE_LEVEL_INVOICED = row2.Service_Level__Invoiced_ ;
koerber_tmp.INVOICE_METHOD = row2.Invoice_Method;
koerber_tmp.GL_CODE = row2.GL_Code;
koerber_tmp.PO_NO = row2.PO__ ;
koerber_tmp.REFERENCE1 = row2.Reference1;
koerber_tmp.REFERENCE2 = row2.Reference2;
koerber_tmp.REFERENCE3 = row2.Reference3;
koerber_tmp.REFERENCE4 = row2.Reference4;
koerber_tmp.ZONE_INVOICED = row2.Zone__Invoiced_ ;
koerber_tmp.SHIPPER_NAME = row2.Shipper_Name;
koerber_tmp.SHIPPER_COMPANY = row2.Shipper_Company;
koerber_tmp.SHIPPER_ADDRESS1 = row2.Shipper_Address_1 ;
koerber_tmp.SHIPPER_CITY = row2.Shipper_City;
koerber_tmp.SHIPPER_STATE = row2.Shipper_State;
koerber_tmp.SHIPPER_POSTAL_CODE = row2.Shipper_Postal_Code;
koerber_tmp.SHIPPER_COUNTRY = row2.Shipper_Country;
koerber_tmp.RECEIVER_NAME = row2.Receiver_Name;
koerber_tmp.RECEIVER_COMPANY = row2.Receiver_Company;
koerber_tmp.RECEIVER_ADDRESS1 = row2.Receiver_Address_1 ;
koerber_tmp.RECEIVER_CITY = row2.Receiver_City;
koerber_tmp.RECEIVER_STATE = row2.Receiver_State;
koerber_tmp.RECEIVER_POSTAL_CODE = row2.Receiver_Postal_Code;
koerber_tmp.RECEIVER_COUNTRY = row2.Receiver_Country;
koerber_tmp.ACTUAL_WEIGHT_INVOICED = row2.Actual_Weight__Invoiced_ ;
koerber_tmp.BILL_WEIGHT_INVOICED = row2.Bill_Weight__Invoiced_ ;
koerber_tmp.TOTAL_CHARGES = row2.Total_Charges;
koerber_tmp.LINE_HAUL = row2.Line_Haul;
koerber_tmp.FUEL_SURCHARGE = row2.Fuel_Surcharge;
koerber_tmp.FUEL_DISCOUNT_AMOUNT = row2.Fuel_Discount_Amount;
koerber_tmp.DISCOUNT = row2.Discount;
koerber_tmp.ACCESSORIALS = row2.Accessorials;
koerber_tmp.ADJUSTMENTS = row2.Adjustments;
koerber_tmp.TOTAL_DUE_AMOUNT = row2.Total_Due_Amount;
koerber_tmp.INVOICE_STATUS = row2.Invoice_Status;
koerber_tmp.ADJUSTMENT_REASON = row2.Adjustment_Reason;
koerber_tmp.INTERNAL_KEY1 = row2.Internal_Key_1 ;
koerber_tmp.NSP_INVOICE_DETAILS_ID = row2.Nsp_Invoice_Details_Id;
koerber_tmp.LOAD_DATE = Var.var1 ;
koerber = koerber_tmp;
log.debug("tMap_1 - Outputting the record " + count_koerber_tMap_1 + " of the output table 'koerber'.");

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
// Start of branch "koerber"
if(koerber != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"koerber","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("koerber - " + (koerber==null? "": koerber.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCAC_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SCAC_CODE", koerber.SCAC_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TVSI_VENDOR_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("TVSI_VENDOR_ID", koerber.TVSI_VENDOR_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CARRIER_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("CARRIER_NAME", koerber.CARRIER_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACCOUNT_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("ACCOUNT_NO", koerber.ACCOUNT_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_NO", koerber.INVOICE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRACKING_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("TRACKING_NO", koerber.TRACKING_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BOL_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("BOL_NO", koerber.BOL_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BILL_OPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("BILL_OPTION", koerber.BILL_OPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_DATE", koerber.INVOICE_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_DATE", koerber.SHIP_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DELIVERY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("DELIVERY_DATE", koerber.DELIVERY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MODE_INVOICED") != null){
                    incomingEnforcer_tDBOutput_1.put("MODE_INVOICED", koerber.MODE_INVOICED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SERVICE_LEVEL_INVOICED") != null){
                    incomingEnforcer_tDBOutput_1.put("SERVICE_LEVEL_INVOICED", koerber.SERVICE_LEVEL_INVOICED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_METHOD") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_METHOD", koerber.INVOICE_METHOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("GL_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("GL_CODE", koerber.GL_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PO_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("PO_NO", koerber.PO_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE1") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE1", koerber.REFERENCE1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE2") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE2", koerber.REFERENCE2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE3") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE3", koerber.REFERENCE3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE4") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE4", koerber.REFERENCE4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ZONE_INVOICED") != null){
                    incomingEnforcer_tDBOutput_1.put("ZONE_INVOICED", koerber.ZONE_INVOICED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_NAME", koerber.SHIPPER_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_COMPANY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_COMPANY", koerber.SHIPPER_COMPANY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_ADDRESS1") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_ADDRESS1", koerber.SHIPPER_ADDRESS1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_CITY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_CITY", koerber.SHIPPER_CITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_STATE") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_STATE", koerber.SHIPPER_STATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_POSTAL_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_POSTAL_CODE", koerber.SHIPPER_POSTAL_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPER_COUNTRY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPER_COUNTRY", koerber.SHIPPER_COUNTRY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_NAME", koerber.RECEIVER_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_COMPANY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_COMPANY", koerber.RECEIVER_COMPANY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_ADDRESS1") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_ADDRESS1", koerber.RECEIVER_ADDRESS1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_CITY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_CITY", koerber.RECEIVER_CITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_STATE") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_STATE", koerber.RECEIVER_STATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_POSTAL_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_POSTAL_CODE", koerber.RECEIVER_POSTAL_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVER_COUNTRY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVER_COUNTRY", koerber.RECEIVER_COUNTRY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACTUAL_WEIGHT_INVOICED") != null){
                    incomingEnforcer_tDBOutput_1.put("ACTUAL_WEIGHT_INVOICED", koerber.ACTUAL_WEIGHT_INVOICED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BILL_WEIGHT_INVOICED") != null){
                    incomingEnforcer_tDBOutput_1.put("BILL_WEIGHT_INVOICED", koerber.BILL_WEIGHT_INVOICED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TOTAL_CHARGES") != null){
                    incomingEnforcer_tDBOutput_1.put("TOTAL_CHARGES", koerber.TOTAL_CHARGES);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LINE_HAUL") != null){
                    incomingEnforcer_tDBOutput_1.put("LINE_HAUL", koerber.LINE_HAUL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FUEL_SURCHARGE") != null){
                    incomingEnforcer_tDBOutput_1.put("FUEL_SURCHARGE", koerber.FUEL_SURCHARGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FUEL_DISCOUNT_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("FUEL_DISCOUNT_AMOUNT", koerber.FUEL_DISCOUNT_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISCOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("DISCOUNT", koerber.DISCOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACCESSORIALS") != null){
                    incomingEnforcer_tDBOutput_1.put("ACCESSORIALS", koerber.ACCESSORIALS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ADJUSTMENTS") != null){
                    incomingEnforcer_tDBOutput_1.put("ADJUSTMENTS", koerber.ADJUSTMENTS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TOTAL_DUE_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("TOTAL_DUE_AMOUNT", koerber.TOTAL_DUE_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_STATUS") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_STATUS", koerber.INVOICE_STATUS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ADJUSTMENT_REASON") != null){
                    incomingEnforcer_tDBOutput_1.put("ADJUSTMENT_REASON", koerber.ADJUSTMENT_REASON);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INTERNAL_KEY1") != null){
                    incomingEnforcer_tDBOutput_1.put("INTERNAL_KEY1", koerber.INTERNAL_KEY1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NSP_INVOICE_DETAILS_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("NSP_INVOICE_DETAILS_ID", koerber.NSP_INVOICE_DETAILS_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("LOAD_DATE", koerber.LOAD_DATE);
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

} // End of branch "koerber"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row2"




	
	/**
	 * [tFileInputExcel_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";
	
	

 



/**
 * [tFileInputExcel_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputExcel_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";
	
	

			}
			
			
				log.debug("tFileInputExcel_1 - Retrieved records count: "+ nb_line_tFileInputExcel_1 + " .");
			
			
			globalMap.put("tFileInputExcel_1_NB_LINE",nb_line_tFileInputExcel_1);
			
				}
			
		} finally { 
				
  				if(!(source_tFileInputExcel_1 instanceof java.io.InputStream)){
  					workbook_tFileInputExcel_1.getPackage().revert();
  				}
				
		}	
		

 
                if(log.isDebugEnabled())
            log.debug("tFileInputExcel_1 - "  + ("Done.") );

ok_Hash.put("tFileInputExcel_1", true);
end_Hash.put("tFileInputExcel_1", System.currentTimeMillis());




/**
 * [tFileInputExcel_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'koerber': " + count_koerber_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tFileInputExcel_1","tFileInputExcel_1","tFileInputExcel","tMap_1","tMap_1","tMap","output")) {
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"koerber",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */






						if(execStat){
							runStat.updateStatOnConnection("iterate3", 2, "exec" + NB_ITERATE_tFileInputExcel_1);
						}				
					




	NB_ITERATE_tFileDelete_1++;
	
	
				if(execStat){
					runStat.updateStatOnConnection("iterate4", 1, "exec" + NB_ITERATE_tFileDelete_1);
					//Thread.sleep(1000);
				}				
			

	
	/**
	 * [tFileDelete_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileDelete_1", false);
		start_Hash.put("tFileDelete_1", System.currentTimeMillis());
		
	
	currentComponent="tFileDelete_1";
	
	
		int tos_count_tFileDelete_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileDelete_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileDelete_1 = new StringBuilder();
                    log4jParamters_tFileDelete_1.append("Parameters:");
                            log4jParamters_tFileDelete_1.append("FILENAME" + " = " + "((String)globalMap.get(\"tFileList_3_CURRENT_FILEPATH\"))");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FOLDER" + " = " + "false");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FOLDER_FILE" + " = " + "false");
                        log4jParamters_tFileDelete_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + (log4jParamters_tFileDelete_1) );
                    } 
                } 
            new BytesLimit65535_tFileDelete_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileDelete_1", "tFileDelete_1", "tFileDelete");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileDelete_1 begin ] stop
 */
	
	/**
	 * [tFileDelete_1 main ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";
	
	

 

				final StringBuffer log4jSb_tFileDelete_1 = new StringBuffer();
			
class DeleteFoldertFileDelete_1{
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
    java.io.File file_tFileDelete_1=new java.io.File(((String)globalMap.get("tFileList_3_CURRENT_FILEPATH")));
    if(file_tFileDelete_1.exists()&& file_tFileDelete_1.isFile()){
    	if(file_tFileDelete_1.delete()){
    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File deleted.");
    		log.info("tFileDelete_1 - File : "+ file_tFileDelete_1.getAbsolutePath() + " is deleted.");
		}else{
			globalMap.put("tFileDelete_1_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("File " + file_tFileDelete_1.getAbsolutePath() + " can not be deleted.");
		}
	}else{
		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File does not exist or is invalid.");
			throw new RuntimeException("File " + file_tFileDelete_1.getAbsolutePath() + " does not exist or is invalid or is not a file.");
	}
	globalMap.put("tFileDelete_1_DELETE_PATH",((String)globalMap.get("tFileList_3_CURRENT_FILEPATH")));
 


	tos_count_tFileDelete_1++;

/**
 * [tFileDelete_1 main ] stop
 */
	
	/**
	 * [tFileDelete_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";
	
	

 



/**
 * [tFileDelete_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileDelete_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";
	
	

 



/**
 * [tFileDelete_1 process_data_end ] stop
 */
	
	/**
	 * [tFileDelete_1 end ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFileDelete_1 - "  + ("Done.") );

ok_Hash.put("tFileDelete_1", true);
end_Hash.put("tFileDelete_1", System.currentTimeMillis());




/**
 * [tFileDelete_1 end ] stop
 */
						if(execStat){
							runStat.updateStatOnConnection("iterate4", 2, "exec" + NB_ITERATE_tFileDelete_1);
						}				
					




	
	/**
	 * [tFileList_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileList_3";
	
	

 



/**
 * [tFileList_3 process_data_end ] stop
 */
	
	/**
	 * [tFileList_3 end ] start
	 */

	

	
	
	currentComponent="tFileList_3";
	
	

  
    }
  globalMap.put("tFileList_3_NB_FILE", NB_FILEtFileList_3);
  
    log.info("tFileList_3 - File or directory count : " + NB_FILEtFileList_3);

  
 

 
                if(log.isDebugEnabled())
            log.debug("tFileList_3 - "  + ("Done.") );

ok_Hash.put("tFileList_3", true);
end_Hash.put("tFileList_3", System.currentTimeMillis());




/**
 * [tFileList_3 end ] stop
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
	 * [tFileList_3 finally ] start
	 */

	

	
	
	currentComponent="tFileList_3";
	
	

 



/**
 * [tFileList_3 finally ] stop
 */

	
	/**
	 * [tFileInputExcel_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputExcel_1";
	
	

 



/**
 * [tFileInputExcel_1 finally ] stop
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










	
	/**
	 * [tFileDelete_1 finally ] start
	 */

	

	
	
	currentComponent="tFileDelete_1";
	
	

 



/**
 * [tFileDelete_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileList_3_SUBPROCESS_STATE", 1);
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
        final koerber_data_into_snowflake koerber_data_into_snowflakeClass = new koerber_data_into_snowflake();

        int exitCode = koerber_data_into_snowflakeClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'koerber_data_into_snowflake' - Done.");
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
			log.info("TalendJob: 'koerber_data_into_snowflake' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_WvDJYOtkEe2HwtcbA5NKJQ");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-05-22T17:32:07.145637400Z");

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
            java.io.InputStream inContext = koerber_data_into_snowflake.class.getClassLoader().getResourceAsStream("at_talend_jobs/koerber_data_into_snowflake_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = koerber_data_into_snowflake.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'koerber_data_into_snowflake' - Started.");
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
errorCode = null;tLibraryLoad_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tLibraryLoad_1) {
globalMap.put("tLibraryLoad_1_SUBPROCESS_STATE", -1);

e_tLibraryLoad_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : koerber_data_into_snowflake");
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
        log.info("TalendJob: 'koerber_data_into_snowflake' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeFtpConnections();


    }






    private void closeFtpConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tFTPConnection_1");
            if (obj_conn != null) {
                ((com.jcraft.jsch.ChannelSftp) obj_conn).quit();
            }
        } catch (java.lang.Exception e) {
        }
    }








    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();


            connections.put("conn_tFTPConnection_1", globalMap.get("conn_tFTPConnection_1"));




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
 *     389029 characters generated by Talend Cloud Data Management Platform 
 *     on the May 22, 2023 at 1:32:07 PM EDT
 ************************************************************************************************/