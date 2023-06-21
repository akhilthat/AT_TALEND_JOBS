
package at_talend_jobs.profile_sku_store_cross_reference_rplprf_0_1;

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
 * Job: PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF Purpose: TTSALLCL1_Backup<br>
 * Description: TTSALLCL1_Backup <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF implements TalendJob {
	static {System.setProperty("TalendJob.log", "PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.class);
	

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
			
			if(jda_host_name != null){
				
					this.setProperty("jda_host_name", jda_host_name.toString());
				
			}
			
			if(jda_mm_lib != null){
				
					this.setProperty("jda_mm_lib", jda_mm_lib.toString());
				
			}
			
			if(jda_user_name != null){
				
					this.setProperty("jda_user_name", jda_user_name.toString());
				
			}
			
			if(jda_password != null){
				
					this.setProperty("jda_password", jda_password.toString());
				
			}
			
			if(SF_account != null){
				
					this.setProperty("SF_account", SF_account.toString());
				
			}
			
			if(SF_prod_database != null){
				
					this.setProperty("SF_prod_database", SF_prod_database.toString());
				
			}
			
			if(SF_password != null){
				
					this.setProperty("SF_password", SF_password.toString());
				
			}
			
			if(SF_fin_schema != null){
				
					this.setProperty("SF_fin_schema", SF_fin_schema.toString());
				
			}
			
			if(SF_user_id != null){
				
					this.setProperty("SF_user_id", SF_user_id.toString());
				
			}
			
			if(SF_warehouse != null){
				
					this.setProperty("SF_warehouse", SF_warehouse.toString());
				
			}
			
			if(sql_server_database != null){
				
					this.setProperty("sql_server_database", sql_server_database.toString());
				
			}
			
			if(sql_server_host != null){
				
					this.setProperty("sql_server_host", sql_server_host.toString());
				
			}
			
			if(sql_server_password != null){
				
					this.setProperty("sql_server_password", sql_server_password.toString());
				
			}
			
			if(sql_server_port != null){
				
					this.setProperty("sql_server_port", sql_server_port.toString());
				
			}
			
			if(sql_server_schema != null){
				
					this.setProperty("sql_server_schema", sql_server_schema.toString());
				
			}
			
			if(sql_server_user_id != null){
				
					this.setProperty("sql_server_user_id", sql_server_user_id.toString());
				
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

public String jda_host_name;
public String getJda_host_name(){
	return this.jda_host_name;
}
public String jda_mm_lib;
public String getJda_mm_lib(){
	return this.jda_mm_lib;
}
public String jda_user_name;
public String getJda_user_name(){
	return this.jda_user_name;
}
public java.lang.String jda_password;
public java.lang.String getJda_password(){
	return this.jda_password;
}
public String SF_account;
public String getSF_account(){
	return this.SF_account;
}
public String SF_prod_database;
public String getSF_prod_database(){
	return this.SF_prod_database;
}
public java.lang.String SF_password;
public java.lang.String getSF_password(){
	return this.SF_password;
}
public String SF_fin_schema;
public String getSF_fin_schema(){
	return this.SF_fin_schema;
}
public String SF_user_id;
public String getSF_user_id(){
	return this.SF_user_id;
}
public String SF_warehouse;
public String getSF_warehouse(){
	return this.SF_warehouse;
}
public String sql_server_database;
public String getSql_server_database(){
	return this.sql_server_database;
}
public String sql_server_host;
public String getSql_server_host(){
	return this.sql_server_host;
}
public java.lang.String sql_server_password;
public java.lang.String getSql_server_password(){
	return this.sql_server_password;
}
public String sql_server_port;
public String getSql_server_port(){
	return this.sql_server_port;
}
public String sql_server_schema;
public String getSql_server_schema(){
	return this.sql_server_schema;
}
public String sql_server_user_id;
public String getSql_server_user_id(){
	return this.sql_server_user_id;
}
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_FMdngDYfEeqYaujOWQCPPw", "0.1");
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
				PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.this, new Object[] { e , currentComponent, globalMap});
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

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_9_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_9_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_10_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_10_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_11_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_11_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_8_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_9_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_10_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_11_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	


public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_1");
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
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";
	
	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
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
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";
	
	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	
	
		int tos_count_tDBConnection_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "tDBConnection_1", "tSnowflakeConnection");
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
 		                    "vsi_wh_xs");
 		                    
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:0SNuyB+HQHT0t4CaEh36A7gGT3hwW8eIJigs3XP02MjiQbKM"));
 		                        
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
	
	


 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	


 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	


 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
// end of generic

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());




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
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPostjob_1");
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
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";
	
	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
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
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";
	
	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	 * [tDBClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBClose_1", false);
		start_Hash.put("tDBClose_1", System.currentTimeMillis());
		
	
	currentComponent="tDBClose_1";
	
	
		int tos_count_tDBClose_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_1", "tDBClose_1", "tSnowflakeClose");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBClose_1 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBClose_1 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBClose_1 = (String)(restRequest_tDBClose_1 != null ? restRequest_tDBClose_1.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBClose_1 =
        new org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBClose_1 = null;
org.talend.components.api.component.runtime.Reader reader_tDBClose_1 = null;


org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties props_tDBClose_1 =
        (org.talend.components.snowflake.tsnowflakeclose.TSnowflakeCloseProperties) def_tDBClose_1.createRuntimeProperties();
 		                    props_tDBClose_1.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBClose_1.referencedComponent.setValue("componentInstanceId",
 		                    "tDBClose_1");
 		                    
 		                    props_tDBClose_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBClose_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBClose_1 = props_tDBClose_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBClose_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBClose_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBClose_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBClose_1.referencedComponent.setReference(referencedComponentProperties_tDBClose_1);
        }
    }
globalMap.put("tDBClose_1_COMPONENT_RUNTIME_PROPERTIES", props_tDBClose_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBClose_1= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBClose_1, topology_tDBClose_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBClose_1 = def_tDBClose_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBClose_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBClose_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBClose_1 = componentRuntime_tDBClose_1.initialize(container_tDBClose_1, props_tDBClose_1);

if (initVr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBClose_1.getMessage());
}

if(componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBClose_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBClose_1;
	compDriverInitialization_tDBClose_1.runAtDriver(container_tDBClose_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBClose_1 = null;
if(componentRuntime_tDBClose_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBClose_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBClose_1;
	if (doesNodeBelongToRequest_tDBClose_1) {
        org.talend.daikon.properties.ValidationResult vr_tDBClose_1 = sourceOrSink_tDBClose_1.validate(container_tDBClose_1);
        if (vr_tDBClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBClose_1";
	
	


 


	tos_count_tDBClose_1++;

/**
 * [tDBClose_1 main ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	


 



/**
 * [tDBClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	


 



/**
 * [tDBClose_1 process_data_end ] stop
 */
	
	/**
	 * [tDBClose_1 end ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	
// end of generic

 

ok_Hash.put("tDBClose_1", true);
end_Hash.put("tDBClose_1", System.currentTimeMillis());




/**
 * [tDBClose_1 end ] stop
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
	 * [tDBClose_1 finally ] start
	 */

	

	
	
	currentComponent="tDBClose_1";
	
	
// finally of generic

 



/**
 * [tDBClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_8_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_8");
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
	 * [tDBRow_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_8", false);
		start_Hash.put("tDBRow_8", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_8";
	
	
		int tos_count_tDBRow_8 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_8", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_8 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_8 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_8 = (String)(restRequest_tDBRow_8 != null ? restRequest_tDBRow_8.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_8 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_8 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_8 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_8 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_8.createRuntimeProperties();
 		                    props_tDBRow_8.setValue("query",
 		                    "DELETE from    PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF\nWHERE DATELOADED = CURRENT_DATE()  - 1");
 		                    
 		                    props_tDBRow_8.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_8.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_8.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_8_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_8_1_fisrt sst_tDBRow_8_1_fisrt = new SchemaSettingTool_tDBRow_8_1_fisrt();
 		                    
 		                    props_tDBRow_8.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_8_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_8_2_fisrt sst_tDBRow_8_2_fisrt = new SchemaSettingTool_tDBRow_8_2_fisrt();
 		                    
 		                    props_tDBRow_8.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_8.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_8.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_8.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_8.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_8.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_8.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_8.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_8.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_8.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_8.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_8.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_8.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_8.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_8_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_8_3_fisrt sst_tDBRow_8_3_fisrt = new SchemaSettingTool_tDBRow_8_3_fisrt();
 		                    
 		                    props_tDBRow_8.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_8_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_8.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_8 = props_tDBRow_8.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_8 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_8 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_8 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_8.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_8);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_8.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_8 = props_tDBRow_8.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_8 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_8 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_8 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_8.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_8);
        }
    }
globalMap.put("tDBRow_8_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_8);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_8= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_8, topology_tDBRow_8);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_8 = def_tDBRow_8.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_8 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_8.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_8 = componentRuntime_tDBRow_8.initialize(container_tDBRow_8, props_tDBRow_8);

if (initVr_tDBRow_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_8.getMessage());
}

if(componentRuntime_tDBRow_8 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_8 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_8;
	compDriverInitialization_tDBRow_8.runAtDriver(container_tDBRow_8);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_8 = null;
if(componentRuntime_tDBRow_8 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_8 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_8;
	if (doesNodeBelongToRequest_tDBRow_8) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_8 = sourceOrSink_tDBRow_8.validate(container_tDBRow_8);
        if (vr_tDBRow_8.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_8";
	
	


 


	tos_count_tDBRow_8++;

/**
 * [tDBRow_8 main ] stop
 */
	
	/**
	 * [tDBRow_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_8";
	
	


 



/**
 * [tDBRow_8 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_8";
	
	


 



/**
 * [tDBRow_8 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_8 end ] start
	 */

	

	
	
	currentComponent="tDBRow_8";
	
	
// end of generic


resourceMap.put("finish_tDBRow_8", Boolean.TRUE);

 

ok_Hash.put("tDBRow_8", true);
end_Hash.put("tDBRow_8", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tDBRow_9Process(globalMap);



/**
 * [tDBRow_8 end ] stop
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
	 * [tDBRow_8 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_8";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_8")==null){
}
 



/**
 * [tDBRow_8 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
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
	 * [tDBRow_9 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_9", false);
		start_Hash.put("tDBRow_9", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_9";
	
	
		int tos_count_tDBRow_9 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_9", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_9 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_9 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_9 = (String)(restRequest_tDBRow_9 != null ? restRequest_tDBRow_9.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_9 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_9 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_9 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_9 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_9.createRuntimeProperties();
 		                    props_tDBRow_9.setValue("query",
 		                    "\ncreate or replace TABLE RPLPRF (\n	INUMBR NUMBER(9,0),\n	ISTORE NUMBER(5,0),\n	RFSTCN NUMBER(1,0),\n	RFSTDT NUMBER(4,"
+"0),\n	RFOPCN NUMBER(1,0),\n	RFOPDT NUMBER(4,0),\n	RFPROF VARCHAR(5),\n	RFRPCD VARCHAR(1),\n	RFANUM NUMBER(6,0),\n	RFSNUM"
+" NUMBER(2,0),\n	RFDSCD VARCHAR(1),\n	RFREPL NUMBER(9,0),\n	RFDIST VARCHAR(1),\n	RFMSTK NUMBER(7,0),\n	RFDSPY NUMBER(7,0)"
+",\n	RFMCOD VARCHAR(4),\n	RFWHSE NUMBER(5,0),\n	RFFDCN NUMBER(1,0),\n	RFFDDT NUMBER(4,0),\n	RFSSTR NUMBER(5,0),\n	RFSSKU "
+"NUMBER(9,0),\n	RFVWKS NUMBER(1,0),\n	RFBSLS NUMBER(7,0),\n	RFTRND NUMBER(5,3),\n	RFATRN NUMBER(5,3),\n	RFFCUN NUMBER(7,0"
+"),\n	RFLPWS NUMBER(4,1),\n	RFLNWS NUMBER(4,1),\n	RFLEAD NUMBER(3,0),\n	RFMAXS NUMBER(7,0),\n	RFMINS NUMBER(7,0),\n	RFMRA"
+"T NUMBER(3,1),\n	RFPRAT NUMBER(3,1),\n	RFPPCT NUMBER(3,1),\n	RFMAX NUMBER(7,0),\n	RFMIN NUMBER(7,0),\n	RFASWP NUMBER(7,2"
+"),\n	RFASWN NUMBER(7,0),\n	RFASWH NUMBER(7,2),\n	RFASWF NUMBER(7,2),\n	RFRVPR NUMBER(3,0),\n	RFSAM NUMBER(7,0),\n	RFRAT1"
+" NUMBER(3,2),\n	RFRNK1 VARCHAR(1),\n	RFRAT2 NUMBER(3,2),\n	RFRNK2 VARCHAR(1),\n	RFRAT3 NUMBER(3,2),\n	RFRNK3 VARCHAR(1),"
+"\n	RFRAT4 NUMBER(3,2),\n	RFRNK4 VARCHAR(1),\n	RFMXSS NUMBER(7,0),\n	RFSSDY NUMBER(7,0),\n	RFSSUN NUMBER(7,0),\n	RFRATT N"
+"UMBER(9,2),\n	RFSTRT NUMBER(7,0),\n	RFSDCN NUMBER(1,0),\n	RFSDDT NUMBER(4,0),\n	RFSCUN NUMBER(7,0),\n	RFDEPT FLOAT,\n	RF"
+"SDPT FLOAT,\n	RFCLAS FLOAT,\n	RFSCLS FLOAT,\n	RFWFC1 NUMBER(3,2),\n	RFWFC2 NUMBER(3,2),\n	RFPSWH NUMBER(7,2),\n	RFSLFC N"
+"UMBER(3,2),\n	RFENCN NUMBER(1,0),\n	RFENDT NUMBER(4,0),\n	LOAD_DATE DATE\n);\n\n");
 		                    
 		                    props_tDBRow_9.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_9.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_9.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_9_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_9_1_fisrt sst_tDBRow_9_1_fisrt = new SchemaSettingTool_tDBRow_9_1_fisrt();
 		                    
 		                    props_tDBRow_9.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_9_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_9_2_fisrt sst_tDBRow_9_2_fisrt = new SchemaSettingTool_tDBRow_9_2_fisrt();
 		                    
 		                    props_tDBRow_9.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_9.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_9.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_9.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_9.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_9.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_9.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_9.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_9.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_9.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_9.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_9.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_9.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_9.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_9_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_9_3_fisrt sst_tDBRow_9_3_fisrt = new SchemaSettingTool_tDBRow_9_3_fisrt();
 		                    
 		                    props_tDBRow_9.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_9_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_9.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_9 = props_tDBRow_9.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_9 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_9 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_9 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_9.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_9);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_9.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_9 = props_tDBRow_9.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_9 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_9 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_9 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_9.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_9);
        }
    }
globalMap.put("tDBRow_9_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_9);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_9= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_9, topology_tDBRow_9);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_9 = def_tDBRow_9.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_9 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_9.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_9 = componentRuntime_tDBRow_9.initialize(container_tDBRow_9, props_tDBRow_9);

if (initVr_tDBRow_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_9.getMessage());
}

if(componentRuntime_tDBRow_9 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_9 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_9;
	compDriverInitialization_tDBRow_9.runAtDriver(container_tDBRow_9);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_9 = null;
if(componentRuntime_tDBRow_9 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_9 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_9;
	if (doesNodeBelongToRequest_tDBRow_9) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_9 = sourceOrSink_tDBRow_9.validate(container_tDBRow_9);
        if (vr_tDBRow_9.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_9";
	
	


 


	tos_count_tDBRow_9++;

/**
 * [tDBRow_9 main ] stop
 */
	
	/**
	 * [tDBRow_9 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_9";
	
	


 



/**
 * [tDBRow_9 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_9 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_9";
	
	


 



/**
 * [tDBRow_9 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_9 end ] start
	 */

	

	
	
	currentComponent="tDBRow_9";
	
	
// end of generic


resourceMap.put("finish_tDBRow_9", Boolean.TRUE);

 

ok_Hash.put("tDBRow_9", true);
end_Hash.put("tDBRow_9", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tDBInput_6Process(globalMap);



/**
 * [tDBRow_9 end ] stop
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
	 * [tDBRow_9 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_9";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_9")==null){
}
 



/**
 * [tDBRow_9 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_9_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableRow<row4Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];

	
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

				
			    public BigDecimal ISTORE;

				public BigDecimal getISTORE () {
					return this.ISTORE;
				}

				public Boolean ISTOREIsNullable(){
				    return false;
				}
				public Boolean ISTOREIsKey(){
				    return false;
				}
				public Integer ISTORELength(){
				    return 5;
				}
				public Integer ISTOREPrecision(){
				    return 0;
				}
				public String ISTOREDefault(){
				
					return "";
				
				}
				public String ISTOREComment(){
				
				    return "";
				
				}
				public String ISTOREPattern(){
				
					return "";
				
				}
				public String ISTOREOriginalDbColumnName(){
				
					return "ISTORE";
				
				}

				
			    public BigDecimal RFSTCN;

				public BigDecimal getRFSTCN () {
					return this.RFSTCN;
				}

				public Boolean RFSTCNIsNullable(){
				    return false;
				}
				public Boolean RFSTCNIsKey(){
				    return false;
				}
				public Integer RFSTCNLength(){
				    return 1;
				}
				public Integer RFSTCNPrecision(){
				    return 0;
				}
				public String RFSTCNDefault(){
				
					return "";
				
				}
				public String RFSTCNComment(){
				
				    return "";
				
				}
				public String RFSTCNPattern(){
				
					return "";
				
				}
				public String RFSTCNOriginalDbColumnName(){
				
					return "RFSTCN";
				
				}

				
			    public BigDecimal RFSTDT;

				public BigDecimal getRFSTDT () {
					return this.RFSTDT;
				}

				public Boolean RFSTDTIsNullable(){
				    return false;
				}
				public Boolean RFSTDTIsKey(){
				    return false;
				}
				public Integer RFSTDTLength(){
				    return 4;
				}
				public Integer RFSTDTPrecision(){
				    return 0;
				}
				public String RFSTDTDefault(){
				
					return "";
				
				}
				public String RFSTDTComment(){
				
				    return "";
				
				}
				public String RFSTDTPattern(){
				
					return "";
				
				}
				public String RFSTDTOriginalDbColumnName(){
				
					return "RFSTDT";
				
				}

				
			    public BigDecimal RFOPCN;

				public BigDecimal getRFOPCN () {
					return this.RFOPCN;
				}

				public Boolean RFOPCNIsNullable(){
				    return false;
				}
				public Boolean RFOPCNIsKey(){
				    return false;
				}
				public Integer RFOPCNLength(){
				    return 1;
				}
				public Integer RFOPCNPrecision(){
				    return 0;
				}
				public String RFOPCNDefault(){
				
					return "";
				
				}
				public String RFOPCNComment(){
				
				    return "";
				
				}
				public String RFOPCNPattern(){
				
					return "";
				
				}
				public String RFOPCNOriginalDbColumnName(){
				
					return "RFOPCN";
				
				}

				
			    public BigDecimal RFOPDT;

				public BigDecimal getRFOPDT () {
					return this.RFOPDT;
				}

				public Boolean RFOPDTIsNullable(){
				    return false;
				}
				public Boolean RFOPDTIsKey(){
				    return false;
				}
				public Integer RFOPDTLength(){
				    return 4;
				}
				public Integer RFOPDTPrecision(){
				    return 0;
				}
				public String RFOPDTDefault(){
				
					return "";
				
				}
				public String RFOPDTComment(){
				
				    return "";
				
				}
				public String RFOPDTPattern(){
				
					return "";
				
				}
				public String RFOPDTOriginalDbColumnName(){
				
					return "RFOPDT";
				
				}

				
			    public String RFPROF;

				public String getRFPROF () {
					return this.RFPROF;
				}

				public Boolean RFPROFIsNullable(){
				    return false;
				}
				public Boolean RFPROFIsKey(){
				    return false;
				}
				public Integer RFPROFLength(){
				    return 5;
				}
				public Integer RFPROFPrecision(){
				    return 0;
				}
				public String RFPROFDefault(){
				
					return null;
				
				}
				public String RFPROFComment(){
				
				    return "";
				
				}
				public String RFPROFPattern(){
				
					return "";
				
				}
				public String RFPROFOriginalDbColumnName(){
				
					return "RFPROF";
				
				}

				
			    public String RFRPCD;

				public String getRFRPCD () {
					return this.RFRPCD;
				}

				public Boolean RFRPCDIsNullable(){
				    return false;
				}
				public Boolean RFRPCDIsKey(){
				    return false;
				}
				public Integer RFRPCDLength(){
				    return 1;
				}
				public Integer RFRPCDPrecision(){
				    return 0;
				}
				public String RFRPCDDefault(){
				
					return null;
				
				}
				public String RFRPCDComment(){
				
				    return "";
				
				}
				public String RFRPCDPattern(){
				
					return "";
				
				}
				public String RFRPCDOriginalDbColumnName(){
				
					return "RFRPCD";
				
				}

				
			    public BigDecimal RFANUM;

				public BigDecimal getRFANUM () {
					return this.RFANUM;
				}

				public Boolean RFANUMIsNullable(){
				    return false;
				}
				public Boolean RFANUMIsKey(){
				    return false;
				}
				public Integer RFANUMLength(){
				    return 6;
				}
				public Integer RFANUMPrecision(){
				    return 0;
				}
				public String RFANUMDefault(){
				
					return "";
				
				}
				public String RFANUMComment(){
				
				    return "";
				
				}
				public String RFANUMPattern(){
				
					return "";
				
				}
				public String RFANUMOriginalDbColumnName(){
				
					return "RFANUM";
				
				}

				
			    public BigDecimal RFSNUM;

				public BigDecimal getRFSNUM () {
					return this.RFSNUM;
				}

				public Boolean RFSNUMIsNullable(){
				    return false;
				}
				public Boolean RFSNUMIsKey(){
				    return false;
				}
				public Integer RFSNUMLength(){
				    return 2;
				}
				public Integer RFSNUMPrecision(){
				    return 0;
				}
				public String RFSNUMDefault(){
				
					return "";
				
				}
				public String RFSNUMComment(){
				
				    return "";
				
				}
				public String RFSNUMPattern(){
				
					return "";
				
				}
				public String RFSNUMOriginalDbColumnName(){
				
					return "RFSNUM";
				
				}

				
			    public String RFDSCD;

				public String getRFDSCD () {
					return this.RFDSCD;
				}

				public Boolean RFDSCDIsNullable(){
				    return false;
				}
				public Boolean RFDSCDIsKey(){
				    return false;
				}
				public Integer RFDSCDLength(){
				    return 1;
				}
				public Integer RFDSCDPrecision(){
				    return 0;
				}
				public String RFDSCDDefault(){
				
					return null;
				
				}
				public String RFDSCDComment(){
				
				    return "";
				
				}
				public String RFDSCDPattern(){
				
					return "";
				
				}
				public String RFDSCDOriginalDbColumnName(){
				
					return "RFDSCD";
				
				}

				
			    public BigDecimal RFREPL;

				public BigDecimal getRFREPL () {
					return this.RFREPL;
				}

				public Boolean RFREPLIsNullable(){
				    return false;
				}
				public Boolean RFREPLIsKey(){
				    return false;
				}
				public Integer RFREPLLength(){
				    return 9;
				}
				public Integer RFREPLPrecision(){
				    return 0;
				}
				public String RFREPLDefault(){
				
					return "";
				
				}
				public String RFREPLComment(){
				
				    return "";
				
				}
				public String RFREPLPattern(){
				
					return "";
				
				}
				public String RFREPLOriginalDbColumnName(){
				
					return "RFREPL";
				
				}

				
			    public String RFDIST;

				public String getRFDIST () {
					return this.RFDIST;
				}

				public Boolean RFDISTIsNullable(){
				    return false;
				}
				public Boolean RFDISTIsKey(){
				    return false;
				}
				public Integer RFDISTLength(){
				    return 1;
				}
				public Integer RFDISTPrecision(){
				    return 0;
				}
				public String RFDISTDefault(){
				
					return "";
				
				}
				public String RFDISTComment(){
				
				    return "";
				
				}
				public String RFDISTPattern(){
				
					return "";
				
				}
				public String RFDISTOriginalDbColumnName(){
				
					return "RFDIST";
				
				}

				
			    public BigDecimal RFMSTK;

				public BigDecimal getRFMSTK () {
					return this.RFMSTK;
				}

				public Boolean RFMSTKIsNullable(){
				    return false;
				}
				public Boolean RFMSTKIsKey(){
				    return false;
				}
				public Integer RFMSTKLength(){
				    return 7;
				}
				public Integer RFMSTKPrecision(){
				    return 0;
				}
				public String RFMSTKDefault(){
				
					return "";
				
				}
				public String RFMSTKComment(){
				
				    return "";
				
				}
				public String RFMSTKPattern(){
				
					return "";
				
				}
				public String RFMSTKOriginalDbColumnName(){
				
					return "RFMSTK";
				
				}

				
			    public BigDecimal RFDSPY;

				public BigDecimal getRFDSPY () {
					return this.RFDSPY;
				}

				public Boolean RFDSPYIsNullable(){
				    return false;
				}
				public Boolean RFDSPYIsKey(){
				    return false;
				}
				public Integer RFDSPYLength(){
				    return 7;
				}
				public Integer RFDSPYPrecision(){
				    return 0;
				}
				public String RFDSPYDefault(){
				
					return "";
				
				}
				public String RFDSPYComment(){
				
				    return "";
				
				}
				public String RFDSPYPattern(){
				
					return "";
				
				}
				public String RFDSPYOriginalDbColumnName(){
				
					return "RFDSPY";
				
				}

				
			    public String RFMCOD;

				public String getRFMCOD () {
					return this.RFMCOD;
				}

				public Boolean RFMCODIsNullable(){
				    return false;
				}
				public Boolean RFMCODIsKey(){
				    return false;
				}
				public Integer RFMCODLength(){
				    return 4;
				}
				public Integer RFMCODPrecision(){
				    return 0;
				}
				public String RFMCODDefault(){
				
					return "";
				
				}
				public String RFMCODComment(){
				
				    return "";
				
				}
				public String RFMCODPattern(){
				
					return "";
				
				}
				public String RFMCODOriginalDbColumnName(){
				
					return "RFMCOD";
				
				}

				
			    public BigDecimal RFWHSE;

				public BigDecimal getRFWHSE () {
					return this.RFWHSE;
				}

				public Boolean RFWHSEIsNullable(){
				    return false;
				}
				public Boolean RFWHSEIsKey(){
				    return false;
				}
				public Integer RFWHSELength(){
				    return 5;
				}
				public Integer RFWHSEPrecision(){
				    return 0;
				}
				public String RFWHSEDefault(){
				
					return "";
				
				}
				public String RFWHSEComment(){
				
				    return "";
				
				}
				public String RFWHSEPattern(){
				
					return "";
				
				}
				public String RFWHSEOriginalDbColumnName(){
				
					return "RFWHSE";
				
				}

				
			    public BigDecimal RFFDCN;

				public BigDecimal getRFFDCN () {
					return this.RFFDCN;
				}

				public Boolean RFFDCNIsNullable(){
				    return false;
				}
				public Boolean RFFDCNIsKey(){
				    return false;
				}
				public Integer RFFDCNLength(){
				    return 1;
				}
				public Integer RFFDCNPrecision(){
				    return 0;
				}
				public String RFFDCNDefault(){
				
					return "";
				
				}
				public String RFFDCNComment(){
				
				    return "";
				
				}
				public String RFFDCNPattern(){
				
					return "";
				
				}
				public String RFFDCNOriginalDbColumnName(){
				
					return "RFFDCN";
				
				}

				
			    public BigDecimal RFFDDT;

				public BigDecimal getRFFDDT () {
					return this.RFFDDT;
				}

				public Boolean RFFDDTIsNullable(){
				    return false;
				}
				public Boolean RFFDDTIsKey(){
				    return false;
				}
				public Integer RFFDDTLength(){
				    return 4;
				}
				public Integer RFFDDTPrecision(){
				    return 0;
				}
				public String RFFDDTDefault(){
				
					return "";
				
				}
				public String RFFDDTComment(){
				
				    return "";
				
				}
				public String RFFDDTPattern(){
				
					return "";
				
				}
				public String RFFDDTOriginalDbColumnName(){
				
					return "RFFDDT";
				
				}

				
			    public BigDecimal RFSSTR;

				public BigDecimal getRFSSTR () {
					return this.RFSSTR;
				}

				public Boolean RFSSTRIsNullable(){
				    return false;
				}
				public Boolean RFSSTRIsKey(){
				    return false;
				}
				public Integer RFSSTRLength(){
				    return 5;
				}
				public Integer RFSSTRPrecision(){
				    return 0;
				}
				public String RFSSTRDefault(){
				
					return "";
				
				}
				public String RFSSTRComment(){
				
				    return "";
				
				}
				public String RFSSTRPattern(){
				
					return "";
				
				}
				public String RFSSTROriginalDbColumnName(){
				
					return "RFSSTR";
				
				}

				
			    public BigDecimal RFSSKU;

				public BigDecimal getRFSSKU () {
					return this.RFSSKU;
				}

				public Boolean RFSSKUIsNullable(){
				    return false;
				}
				public Boolean RFSSKUIsKey(){
				    return false;
				}
				public Integer RFSSKULength(){
				    return 9;
				}
				public Integer RFSSKUPrecision(){
				    return 0;
				}
				public String RFSSKUDefault(){
				
					return "";
				
				}
				public String RFSSKUComment(){
				
				    return "";
				
				}
				public String RFSSKUPattern(){
				
					return "";
				
				}
				public String RFSSKUOriginalDbColumnName(){
				
					return "RFSSKU";
				
				}

				
			    public BigDecimal RFVWKS;

				public BigDecimal getRFVWKS () {
					return this.RFVWKS;
				}

				public Boolean RFVWKSIsNullable(){
				    return false;
				}
				public Boolean RFVWKSIsKey(){
				    return false;
				}
				public Integer RFVWKSLength(){
				    return 1;
				}
				public Integer RFVWKSPrecision(){
				    return 0;
				}
				public String RFVWKSDefault(){
				
					return "";
				
				}
				public String RFVWKSComment(){
				
				    return "";
				
				}
				public String RFVWKSPattern(){
				
					return "";
				
				}
				public String RFVWKSOriginalDbColumnName(){
				
					return "RFVWKS";
				
				}

				
			    public BigDecimal RFBSLS;

				public BigDecimal getRFBSLS () {
					return this.RFBSLS;
				}

				public Boolean RFBSLSIsNullable(){
				    return false;
				}
				public Boolean RFBSLSIsKey(){
				    return false;
				}
				public Integer RFBSLSLength(){
				    return 7;
				}
				public Integer RFBSLSPrecision(){
				    return 0;
				}
				public String RFBSLSDefault(){
				
					return "";
				
				}
				public String RFBSLSComment(){
				
				    return "";
				
				}
				public String RFBSLSPattern(){
				
					return "";
				
				}
				public String RFBSLSOriginalDbColumnName(){
				
					return "RFBSLS";
				
				}

				
			    public BigDecimal RFTRND;

				public BigDecimal getRFTRND () {
					return this.RFTRND;
				}

				public Boolean RFTRNDIsNullable(){
				    return false;
				}
				public Boolean RFTRNDIsKey(){
				    return false;
				}
				public Integer RFTRNDLength(){
				    return 5;
				}
				public Integer RFTRNDPrecision(){
				    return 3;
				}
				public String RFTRNDDefault(){
				
					return "";
				
				}
				public String RFTRNDComment(){
				
				    return "";
				
				}
				public String RFTRNDPattern(){
				
					return "";
				
				}
				public String RFTRNDOriginalDbColumnName(){
				
					return "RFTRND";
				
				}

				
			    public BigDecimal RFATRN;

				public BigDecimal getRFATRN () {
					return this.RFATRN;
				}

				public Boolean RFATRNIsNullable(){
				    return false;
				}
				public Boolean RFATRNIsKey(){
				    return false;
				}
				public Integer RFATRNLength(){
				    return 5;
				}
				public Integer RFATRNPrecision(){
				    return 3;
				}
				public String RFATRNDefault(){
				
					return "";
				
				}
				public String RFATRNComment(){
				
				    return "";
				
				}
				public String RFATRNPattern(){
				
					return "";
				
				}
				public String RFATRNOriginalDbColumnName(){
				
					return "RFATRN";
				
				}

				
			    public BigDecimal RFFCUN;

				public BigDecimal getRFFCUN () {
					return this.RFFCUN;
				}

				public Boolean RFFCUNIsNullable(){
				    return false;
				}
				public Boolean RFFCUNIsKey(){
				    return false;
				}
				public Integer RFFCUNLength(){
				    return 7;
				}
				public Integer RFFCUNPrecision(){
				    return 0;
				}
				public String RFFCUNDefault(){
				
					return "";
				
				}
				public String RFFCUNComment(){
				
				    return "";
				
				}
				public String RFFCUNPattern(){
				
					return "";
				
				}
				public String RFFCUNOriginalDbColumnName(){
				
					return "RFFCUN";
				
				}

				
			    public BigDecimal RFLPWS;

				public BigDecimal getRFLPWS () {
					return this.RFLPWS;
				}

				public Boolean RFLPWSIsNullable(){
				    return false;
				}
				public Boolean RFLPWSIsKey(){
				    return false;
				}
				public Integer RFLPWSLength(){
				    return 4;
				}
				public Integer RFLPWSPrecision(){
				    return 1;
				}
				public String RFLPWSDefault(){
				
					return "";
				
				}
				public String RFLPWSComment(){
				
				    return "";
				
				}
				public String RFLPWSPattern(){
				
					return "";
				
				}
				public String RFLPWSOriginalDbColumnName(){
				
					return "RFLPWS";
				
				}

				
			    public BigDecimal RFLNWS;

				public BigDecimal getRFLNWS () {
					return this.RFLNWS;
				}

				public Boolean RFLNWSIsNullable(){
				    return false;
				}
				public Boolean RFLNWSIsKey(){
				    return false;
				}
				public Integer RFLNWSLength(){
				    return 4;
				}
				public Integer RFLNWSPrecision(){
				    return 1;
				}
				public String RFLNWSDefault(){
				
					return "";
				
				}
				public String RFLNWSComment(){
				
				    return "";
				
				}
				public String RFLNWSPattern(){
				
					return "";
				
				}
				public String RFLNWSOriginalDbColumnName(){
				
					return "RFLNWS";
				
				}

				
			    public BigDecimal RFLEAD;

				public BigDecimal getRFLEAD () {
					return this.RFLEAD;
				}

				public Boolean RFLEADIsNullable(){
				    return false;
				}
				public Boolean RFLEADIsKey(){
				    return false;
				}
				public Integer RFLEADLength(){
				    return 3;
				}
				public Integer RFLEADPrecision(){
				    return 0;
				}
				public String RFLEADDefault(){
				
					return "";
				
				}
				public String RFLEADComment(){
				
				    return "";
				
				}
				public String RFLEADPattern(){
				
					return "";
				
				}
				public String RFLEADOriginalDbColumnName(){
				
					return "RFLEAD";
				
				}

				
			    public BigDecimal RFMAXS;

				public BigDecimal getRFMAXS () {
					return this.RFMAXS;
				}

				public Boolean RFMAXSIsNullable(){
				    return false;
				}
				public Boolean RFMAXSIsKey(){
				    return false;
				}
				public Integer RFMAXSLength(){
				    return 7;
				}
				public Integer RFMAXSPrecision(){
				    return 0;
				}
				public String RFMAXSDefault(){
				
					return "";
				
				}
				public String RFMAXSComment(){
				
				    return "";
				
				}
				public String RFMAXSPattern(){
				
					return "";
				
				}
				public String RFMAXSOriginalDbColumnName(){
				
					return "RFMAXS";
				
				}

				
			    public BigDecimal RFMINS;

				public BigDecimal getRFMINS () {
					return this.RFMINS;
				}

				public Boolean RFMINSIsNullable(){
				    return false;
				}
				public Boolean RFMINSIsKey(){
				    return false;
				}
				public Integer RFMINSLength(){
				    return 7;
				}
				public Integer RFMINSPrecision(){
				    return 0;
				}
				public String RFMINSDefault(){
				
					return "";
				
				}
				public String RFMINSComment(){
				
				    return "";
				
				}
				public String RFMINSPattern(){
				
					return "";
				
				}
				public String RFMINSOriginalDbColumnName(){
				
					return "RFMINS";
				
				}

				
			    public BigDecimal RFMRAT;

				public BigDecimal getRFMRAT () {
					return this.RFMRAT;
				}

				public Boolean RFMRATIsNullable(){
				    return false;
				}
				public Boolean RFMRATIsKey(){
				    return false;
				}
				public Integer RFMRATLength(){
				    return 3;
				}
				public Integer RFMRATPrecision(){
				    return 1;
				}
				public String RFMRATDefault(){
				
					return "";
				
				}
				public String RFMRATComment(){
				
				    return "";
				
				}
				public String RFMRATPattern(){
				
					return "";
				
				}
				public String RFMRATOriginalDbColumnName(){
				
					return "RFMRAT";
				
				}

				
			    public BigDecimal RFPRAT;

				public BigDecimal getRFPRAT () {
					return this.RFPRAT;
				}

				public Boolean RFPRATIsNullable(){
				    return false;
				}
				public Boolean RFPRATIsKey(){
				    return false;
				}
				public Integer RFPRATLength(){
				    return 3;
				}
				public Integer RFPRATPrecision(){
				    return 1;
				}
				public String RFPRATDefault(){
				
					return "";
				
				}
				public String RFPRATComment(){
				
				    return "";
				
				}
				public String RFPRATPattern(){
				
					return "";
				
				}
				public String RFPRATOriginalDbColumnName(){
				
					return "RFPRAT";
				
				}

				
			    public BigDecimal RFPPCT;

				public BigDecimal getRFPPCT () {
					return this.RFPPCT;
				}

				public Boolean RFPPCTIsNullable(){
				    return false;
				}
				public Boolean RFPPCTIsKey(){
				    return false;
				}
				public Integer RFPPCTLength(){
				    return 3;
				}
				public Integer RFPPCTPrecision(){
				    return 1;
				}
				public String RFPPCTDefault(){
				
					return "";
				
				}
				public String RFPPCTComment(){
				
				    return "";
				
				}
				public String RFPPCTPattern(){
				
					return "";
				
				}
				public String RFPPCTOriginalDbColumnName(){
				
					return "RFPPCT";
				
				}

				
			    public BigDecimal RFMAX;

				public BigDecimal getRFMAX () {
					return this.RFMAX;
				}

				public Boolean RFMAXIsNullable(){
				    return false;
				}
				public Boolean RFMAXIsKey(){
				    return false;
				}
				public Integer RFMAXLength(){
				    return 7;
				}
				public Integer RFMAXPrecision(){
				    return 0;
				}
				public String RFMAXDefault(){
				
					return "";
				
				}
				public String RFMAXComment(){
				
				    return "";
				
				}
				public String RFMAXPattern(){
				
					return "";
				
				}
				public String RFMAXOriginalDbColumnName(){
				
					return "RFMAX";
				
				}

				
			    public BigDecimal RFMIN;

				public BigDecimal getRFMIN () {
					return this.RFMIN;
				}

				public Boolean RFMINIsNullable(){
				    return false;
				}
				public Boolean RFMINIsKey(){
				    return false;
				}
				public Integer RFMINLength(){
				    return 7;
				}
				public Integer RFMINPrecision(){
				    return 0;
				}
				public String RFMINDefault(){
				
					return "";
				
				}
				public String RFMINComment(){
				
				    return "";
				
				}
				public String RFMINPattern(){
				
					return "";
				
				}
				public String RFMINOriginalDbColumnName(){
				
					return "RFMIN";
				
				}

				
			    public BigDecimal RFASWP;

				public BigDecimal getRFASWP () {
					return this.RFASWP;
				}

				public Boolean RFASWPIsNullable(){
				    return false;
				}
				public Boolean RFASWPIsKey(){
				    return false;
				}
				public Integer RFASWPLength(){
				    return 7;
				}
				public Integer RFASWPPrecision(){
				    return 2;
				}
				public String RFASWPDefault(){
				
					return "";
				
				}
				public String RFASWPComment(){
				
				    return "";
				
				}
				public String RFASWPPattern(){
				
					return "";
				
				}
				public String RFASWPOriginalDbColumnName(){
				
					return "RFASWP";
				
				}

				
			    public BigDecimal RFASWN;

				public BigDecimal getRFASWN () {
					return this.RFASWN;
				}

				public Boolean RFASWNIsNullable(){
				    return false;
				}
				public Boolean RFASWNIsKey(){
				    return false;
				}
				public Integer RFASWNLength(){
				    return 7;
				}
				public Integer RFASWNPrecision(){
				    return 0;
				}
				public String RFASWNDefault(){
				
					return "";
				
				}
				public String RFASWNComment(){
				
				    return "";
				
				}
				public String RFASWNPattern(){
				
					return "";
				
				}
				public String RFASWNOriginalDbColumnName(){
				
					return "RFASWN";
				
				}

				
			    public BigDecimal RFASWH;

				public BigDecimal getRFASWH () {
					return this.RFASWH;
				}

				public Boolean RFASWHIsNullable(){
				    return false;
				}
				public Boolean RFASWHIsKey(){
				    return false;
				}
				public Integer RFASWHLength(){
				    return 7;
				}
				public Integer RFASWHPrecision(){
				    return 2;
				}
				public String RFASWHDefault(){
				
					return "";
				
				}
				public String RFASWHComment(){
				
				    return "";
				
				}
				public String RFASWHPattern(){
				
					return "";
				
				}
				public String RFASWHOriginalDbColumnName(){
				
					return "RFASWH";
				
				}

				
			    public BigDecimal RFASWF;

				public BigDecimal getRFASWF () {
					return this.RFASWF;
				}

				public Boolean RFASWFIsNullable(){
				    return false;
				}
				public Boolean RFASWFIsKey(){
				    return false;
				}
				public Integer RFASWFLength(){
				    return 7;
				}
				public Integer RFASWFPrecision(){
				    return 2;
				}
				public String RFASWFDefault(){
				
					return "";
				
				}
				public String RFASWFComment(){
				
				    return "";
				
				}
				public String RFASWFPattern(){
				
					return "";
				
				}
				public String RFASWFOriginalDbColumnName(){
				
					return "RFASWF";
				
				}

				
			    public BigDecimal RFRVPR;

				public BigDecimal getRFRVPR () {
					return this.RFRVPR;
				}

				public Boolean RFRVPRIsNullable(){
				    return false;
				}
				public Boolean RFRVPRIsKey(){
				    return false;
				}
				public Integer RFRVPRLength(){
				    return 3;
				}
				public Integer RFRVPRPrecision(){
				    return 0;
				}
				public String RFRVPRDefault(){
				
					return "";
				
				}
				public String RFRVPRComment(){
				
				    return "";
				
				}
				public String RFRVPRPattern(){
				
					return "";
				
				}
				public String RFRVPROriginalDbColumnName(){
				
					return "RFRVPR";
				
				}

				
			    public BigDecimal RFSAM;

				public BigDecimal getRFSAM () {
					return this.RFSAM;
				}

				public Boolean RFSAMIsNullable(){
				    return false;
				}
				public Boolean RFSAMIsKey(){
				    return false;
				}
				public Integer RFSAMLength(){
				    return 7;
				}
				public Integer RFSAMPrecision(){
				    return 0;
				}
				public String RFSAMDefault(){
				
					return "";
				
				}
				public String RFSAMComment(){
				
				    return "";
				
				}
				public String RFSAMPattern(){
				
					return "";
				
				}
				public String RFSAMOriginalDbColumnName(){
				
					return "RFSAM";
				
				}

				
			    public BigDecimal RFRAT1;

				public BigDecimal getRFRAT1 () {
					return this.RFRAT1;
				}

				public Boolean RFRAT1IsNullable(){
				    return false;
				}
				public Boolean RFRAT1IsKey(){
				    return false;
				}
				public Integer RFRAT1Length(){
				    return 3;
				}
				public Integer RFRAT1Precision(){
				    return 2;
				}
				public String RFRAT1Default(){
				
					return "";
				
				}
				public String RFRAT1Comment(){
				
				    return "";
				
				}
				public String RFRAT1Pattern(){
				
					return "";
				
				}
				public String RFRAT1OriginalDbColumnName(){
				
					return "RFRAT1";
				
				}

				
			    public String RFRNK1;

				public String getRFRNK1 () {
					return this.RFRNK1;
				}

				public Boolean RFRNK1IsNullable(){
				    return false;
				}
				public Boolean RFRNK1IsKey(){
				    return false;
				}
				public Integer RFRNK1Length(){
				    return 1;
				}
				public Integer RFRNK1Precision(){
				    return 0;
				}
				public String RFRNK1Default(){
				
					return "";
				
				}
				public String RFRNK1Comment(){
				
				    return "";
				
				}
				public String RFRNK1Pattern(){
				
					return "";
				
				}
				public String RFRNK1OriginalDbColumnName(){
				
					return "RFRNK1";
				
				}

				
			    public BigDecimal RFRAT2;

				public BigDecimal getRFRAT2 () {
					return this.RFRAT2;
				}

				public Boolean RFRAT2IsNullable(){
				    return false;
				}
				public Boolean RFRAT2IsKey(){
				    return false;
				}
				public Integer RFRAT2Length(){
				    return 3;
				}
				public Integer RFRAT2Precision(){
				    return 2;
				}
				public String RFRAT2Default(){
				
					return "";
				
				}
				public String RFRAT2Comment(){
				
				    return "";
				
				}
				public String RFRAT2Pattern(){
				
					return "";
				
				}
				public String RFRAT2OriginalDbColumnName(){
				
					return "RFRAT2";
				
				}

				
			    public String RFRNK2;

				public String getRFRNK2 () {
					return this.RFRNK2;
				}

				public Boolean RFRNK2IsNullable(){
				    return false;
				}
				public Boolean RFRNK2IsKey(){
				    return false;
				}
				public Integer RFRNK2Length(){
				    return 1;
				}
				public Integer RFRNK2Precision(){
				    return 0;
				}
				public String RFRNK2Default(){
				
					return "";
				
				}
				public String RFRNK2Comment(){
				
				    return "";
				
				}
				public String RFRNK2Pattern(){
				
					return "";
				
				}
				public String RFRNK2OriginalDbColumnName(){
				
					return "RFRNK2";
				
				}

				
			    public BigDecimal RFRAT3;

				public BigDecimal getRFRAT3 () {
					return this.RFRAT3;
				}

				public Boolean RFRAT3IsNullable(){
				    return false;
				}
				public Boolean RFRAT3IsKey(){
				    return false;
				}
				public Integer RFRAT3Length(){
				    return 3;
				}
				public Integer RFRAT3Precision(){
				    return 2;
				}
				public String RFRAT3Default(){
				
					return "";
				
				}
				public String RFRAT3Comment(){
				
				    return "";
				
				}
				public String RFRAT3Pattern(){
				
					return "";
				
				}
				public String RFRAT3OriginalDbColumnName(){
				
					return "RFRAT3";
				
				}

				
			    public String RFRNK3;

				public String getRFRNK3 () {
					return this.RFRNK3;
				}

				public Boolean RFRNK3IsNullable(){
				    return false;
				}
				public Boolean RFRNK3IsKey(){
				    return false;
				}
				public Integer RFRNK3Length(){
				    return 1;
				}
				public Integer RFRNK3Precision(){
				    return 0;
				}
				public String RFRNK3Default(){
				
					return "";
				
				}
				public String RFRNK3Comment(){
				
				    return "";
				
				}
				public String RFRNK3Pattern(){
				
					return "";
				
				}
				public String RFRNK3OriginalDbColumnName(){
				
					return "RFRNK3";
				
				}

				
			    public BigDecimal RFRAT4;

				public BigDecimal getRFRAT4 () {
					return this.RFRAT4;
				}

				public Boolean RFRAT4IsNullable(){
				    return false;
				}
				public Boolean RFRAT4IsKey(){
				    return false;
				}
				public Integer RFRAT4Length(){
				    return 3;
				}
				public Integer RFRAT4Precision(){
				    return 2;
				}
				public String RFRAT4Default(){
				
					return "";
				
				}
				public String RFRAT4Comment(){
				
				    return "";
				
				}
				public String RFRAT4Pattern(){
				
					return "";
				
				}
				public String RFRAT4OriginalDbColumnName(){
				
					return "RFRAT4";
				
				}

				
			    public String RFRNK4;

				public String getRFRNK4 () {
					return this.RFRNK4;
				}

				public Boolean RFRNK4IsNullable(){
				    return false;
				}
				public Boolean RFRNK4IsKey(){
				    return false;
				}
				public Integer RFRNK4Length(){
				    return 1;
				}
				public Integer RFRNK4Precision(){
				    return 0;
				}
				public String RFRNK4Default(){
				
					return "";
				
				}
				public String RFRNK4Comment(){
				
				    return "";
				
				}
				public String RFRNK4Pattern(){
				
					return "";
				
				}
				public String RFRNK4OriginalDbColumnName(){
				
					return "RFRNK4";
				
				}

				
			    public BigDecimal RFMXSS;

				public BigDecimal getRFMXSS () {
					return this.RFMXSS;
				}

				public Boolean RFMXSSIsNullable(){
				    return false;
				}
				public Boolean RFMXSSIsKey(){
				    return false;
				}
				public Integer RFMXSSLength(){
				    return 7;
				}
				public Integer RFMXSSPrecision(){
				    return 0;
				}
				public String RFMXSSDefault(){
				
					return "";
				
				}
				public String RFMXSSComment(){
				
				    return "";
				
				}
				public String RFMXSSPattern(){
				
					return "";
				
				}
				public String RFMXSSOriginalDbColumnName(){
				
					return "RFMXSS";
				
				}

				
			    public BigDecimal RFSSDY;

				public BigDecimal getRFSSDY () {
					return this.RFSSDY;
				}

				public Boolean RFSSDYIsNullable(){
				    return false;
				}
				public Boolean RFSSDYIsKey(){
				    return false;
				}
				public Integer RFSSDYLength(){
				    return 7;
				}
				public Integer RFSSDYPrecision(){
				    return 0;
				}
				public String RFSSDYDefault(){
				
					return "";
				
				}
				public String RFSSDYComment(){
				
				    return "";
				
				}
				public String RFSSDYPattern(){
				
					return "";
				
				}
				public String RFSSDYOriginalDbColumnName(){
				
					return "RFSSDY";
				
				}

				
			    public BigDecimal RFSSUN;

				public BigDecimal getRFSSUN () {
					return this.RFSSUN;
				}

				public Boolean RFSSUNIsNullable(){
				    return false;
				}
				public Boolean RFSSUNIsKey(){
				    return false;
				}
				public Integer RFSSUNLength(){
				    return 7;
				}
				public Integer RFSSUNPrecision(){
				    return 0;
				}
				public String RFSSUNDefault(){
				
					return "";
				
				}
				public String RFSSUNComment(){
				
				    return "";
				
				}
				public String RFSSUNPattern(){
				
					return "";
				
				}
				public String RFSSUNOriginalDbColumnName(){
				
					return "RFSSUN";
				
				}

				
			    public BigDecimal RFRATT;

				public BigDecimal getRFRATT () {
					return this.RFRATT;
				}

				public Boolean RFRATTIsNullable(){
				    return false;
				}
				public Boolean RFRATTIsKey(){
				    return false;
				}
				public Integer RFRATTLength(){
				    return 9;
				}
				public Integer RFRATTPrecision(){
				    return 2;
				}
				public String RFRATTDefault(){
				
					return "";
				
				}
				public String RFRATTComment(){
				
				    return "";
				
				}
				public String RFRATTPattern(){
				
					return "";
				
				}
				public String RFRATTOriginalDbColumnName(){
				
					return "RFRATT";
				
				}

				
			    public BigDecimal RFSTRT;

				public BigDecimal getRFSTRT () {
					return this.RFSTRT;
				}

				public Boolean RFSTRTIsNullable(){
				    return false;
				}
				public Boolean RFSTRTIsKey(){
				    return false;
				}
				public Integer RFSTRTLength(){
				    return 7;
				}
				public Integer RFSTRTPrecision(){
				    return 0;
				}
				public String RFSTRTDefault(){
				
					return "";
				
				}
				public String RFSTRTComment(){
				
				    return "";
				
				}
				public String RFSTRTPattern(){
				
					return "";
				
				}
				public String RFSTRTOriginalDbColumnName(){
				
					return "RFSTRT";
				
				}

				
			    public BigDecimal RFSDCN;

				public BigDecimal getRFSDCN () {
					return this.RFSDCN;
				}

				public Boolean RFSDCNIsNullable(){
				    return false;
				}
				public Boolean RFSDCNIsKey(){
				    return false;
				}
				public Integer RFSDCNLength(){
				    return 1;
				}
				public Integer RFSDCNPrecision(){
				    return 0;
				}
				public String RFSDCNDefault(){
				
					return "";
				
				}
				public String RFSDCNComment(){
				
				    return "";
				
				}
				public String RFSDCNPattern(){
				
					return "";
				
				}
				public String RFSDCNOriginalDbColumnName(){
				
					return "RFSDCN";
				
				}

				
			    public BigDecimal RFSDDT;

				public BigDecimal getRFSDDT () {
					return this.RFSDDT;
				}

				public Boolean RFSDDTIsNullable(){
				    return false;
				}
				public Boolean RFSDDTIsKey(){
				    return false;
				}
				public Integer RFSDDTLength(){
				    return 4;
				}
				public Integer RFSDDTPrecision(){
				    return 0;
				}
				public String RFSDDTDefault(){
				
					return "";
				
				}
				public String RFSDDTComment(){
				
				    return "";
				
				}
				public String RFSDDTPattern(){
				
					return "";
				
				}
				public String RFSDDTOriginalDbColumnName(){
				
					return "RFSDDT";
				
				}

				
			    public BigDecimal RFSCUN;

				public BigDecimal getRFSCUN () {
					return this.RFSCUN;
				}

				public Boolean RFSCUNIsNullable(){
				    return false;
				}
				public Boolean RFSCUNIsKey(){
				    return false;
				}
				public Integer RFSCUNLength(){
				    return 7;
				}
				public Integer RFSCUNPrecision(){
				    return 0;
				}
				public String RFSCUNDefault(){
				
					return "";
				
				}
				public String RFSCUNComment(){
				
				    return "";
				
				}
				public String RFSCUNPattern(){
				
					return "";
				
				}
				public String RFSCUNOriginalDbColumnName(){
				
					return "RFSCUN";
				
				}

				
			    public float RFDEPT;

				public float getRFDEPT () {
					return this.RFDEPT;
				}

				public Boolean RFDEPTIsNullable(){
				    return false;
				}
				public Boolean RFDEPTIsKey(){
				    return false;
				}
				public Integer RFDEPTLength(){
				    return 3;
				}
				public Integer RFDEPTPrecision(){
				    return 0;
				}
				public String RFDEPTDefault(){
				
					return "";
				
				}
				public String RFDEPTComment(){
				
				    return "";
				
				}
				public String RFDEPTPattern(){
				
					return "";
				
				}
				public String RFDEPTOriginalDbColumnName(){
				
					return "RFDEPT";
				
				}

				
			    public float RFSDPT;

				public float getRFSDPT () {
					return this.RFSDPT;
				}

				public Boolean RFSDPTIsNullable(){
				    return false;
				}
				public Boolean RFSDPTIsKey(){
				    return false;
				}
				public Integer RFSDPTLength(){
				    return 3;
				}
				public Integer RFSDPTPrecision(){
				    return 0;
				}
				public String RFSDPTDefault(){
				
					return "";
				
				}
				public String RFSDPTComment(){
				
				    return "";
				
				}
				public String RFSDPTPattern(){
				
					return "";
				
				}
				public String RFSDPTOriginalDbColumnName(){
				
					return "RFSDPT";
				
				}

				
			    public float RFCLAS;

				public float getRFCLAS () {
					return this.RFCLAS;
				}

				public Boolean RFCLASIsNullable(){
				    return false;
				}
				public Boolean RFCLASIsKey(){
				    return false;
				}
				public Integer RFCLASLength(){
				    return 3;
				}
				public Integer RFCLASPrecision(){
				    return 0;
				}
				public String RFCLASDefault(){
				
					return "";
				
				}
				public String RFCLASComment(){
				
				    return "";
				
				}
				public String RFCLASPattern(){
				
					return "";
				
				}
				public String RFCLASOriginalDbColumnName(){
				
					return "RFCLAS";
				
				}

				
			    public float RFSCLS;

				public float getRFSCLS () {
					return this.RFSCLS;
				}

				public Boolean RFSCLSIsNullable(){
				    return false;
				}
				public Boolean RFSCLSIsKey(){
				    return false;
				}
				public Integer RFSCLSLength(){
				    return 3;
				}
				public Integer RFSCLSPrecision(){
				    return 0;
				}
				public String RFSCLSDefault(){
				
					return "";
				
				}
				public String RFSCLSComment(){
				
				    return "";
				
				}
				public String RFSCLSPattern(){
				
					return "";
				
				}
				public String RFSCLSOriginalDbColumnName(){
				
					return "RFSCLS";
				
				}

				
			    public BigDecimal RFWFC1;

				public BigDecimal getRFWFC1 () {
					return this.RFWFC1;
				}

				public Boolean RFWFC1IsNullable(){
				    return false;
				}
				public Boolean RFWFC1IsKey(){
				    return false;
				}
				public Integer RFWFC1Length(){
				    return 3;
				}
				public Integer RFWFC1Precision(){
				    return 2;
				}
				public String RFWFC1Default(){
				
					return "";
				
				}
				public String RFWFC1Comment(){
				
				    return "";
				
				}
				public String RFWFC1Pattern(){
				
					return "";
				
				}
				public String RFWFC1OriginalDbColumnName(){
				
					return "RFWFC1";
				
				}

				
			    public BigDecimal RFWFC2;

				public BigDecimal getRFWFC2 () {
					return this.RFWFC2;
				}

				public Boolean RFWFC2IsNullable(){
				    return false;
				}
				public Boolean RFWFC2IsKey(){
				    return false;
				}
				public Integer RFWFC2Length(){
				    return 3;
				}
				public Integer RFWFC2Precision(){
				    return 2;
				}
				public String RFWFC2Default(){
				
					return "";
				
				}
				public String RFWFC2Comment(){
				
				    return "";
				
				}
				public String RFWFC2Pattern(){
				
					return "";
				
				}
				public String RFWFC2OriginalDbColumnName(){
				
					return "RFWFC2";
				
				}

				
			    public BigDecimal RFPSWH;

				public BigDecimal getRFPSWH () {
					return this.RFPSWH;
				}

				public Boolean RFPSWHIsNullable(){
				    return false;
				}
				public Boolean RFPSWHIsKey(){
				    return false;
				}
				public Integer RFPSWHLength(){
				    return 7;
				}
				public Integer RFPSWHPrecision(){
				    return 2;
				}
				public String RFPSWHDefault(){
				
					return "";
				
				}
				public String RFPSWHComment(){
				
				    return "";
				
				}
				public String RFPSWHPattern(){
				
					return "";
				
				}
				public String RFPSWHOriginalDbColumnName(){
				
					return "RFPSWH";
				
				}

				
			    public BigDecimal RFSLFC;

				public BigDecimal getRFSLFC () {
					return this.RFSLFC;
				}

				public Boolean RFSLFCIsNullable(){
				    return false;
				}
				public Boolean RFSLFCIsKey(){
				    return false;
				}
				public Integer RFSLFCLength(){
				    return 3;
				}
				public Integer RFSLFCPrecision(){
				    return 2;
				}
				public String RFSLFCDefault(){
				
					return "";
				
				}
				public String RFSLFCComment(){
				
				    return "";
				
				}
				public String RFSLFCPattern(){
				
					return "";
				
				}
				public String RFSLFCOriginalDbColumnName(){
				
					return "RFSLFC";
				
				}

				
			    public BigDecimal RFENCN;

				public BigDecimal getRFENCN () {
					return this.RFENCN;
				}

				public Boolean RFENCNIsNullable(){
				    return false;
				}
				public Boolean RFENCNIsKey(){
				    return false;
				}
				public Integer RFENCNLength(){
				    return 1;
				}
				public Integer RFENCNPrecision(){
				    return 0;
				}
				public String RFENCNDefault(){
				
					return "";
				
				}
				public String RFENCNComment(){
				
				    return "";
				
				}
				public String RFENCNPattern(){
				
					return "";
				
				}
				public String RFENCNOriginalDbColumnName(){
				
					return "RFENCN";
				
				}

				
			    public BigDecimal RFENDT;

				public BigDecimal getRFENDT () {
					return this.RFENDT;
				}

				public Boolean RFENDTIsNullable(){
				    return false;
				}
				public Boolean RFENDTIsKey(){
				    return false;
				}
				public Integer RFENDTLength(){
				    return 4;
				}
				public Integer RFENDTPrecision(){
				    return 0;
				}
				public String RFENDTDefault(){
				
					return "";
				
				}
				public String RFENDTComment(){
				
				    return "";
				
				}
				public String RFENDTPattern(){
				
					return "";
				
				}
				public String RFENDTOriginalDbColumnName(){
				
					return "RFENDT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			        this.RFDEPT = dis.readFloat();
					
			        this.RFSDPT = dis.readFloat();
					
			        this.RFCLAS = dis.readFloat();
					
			        this.RFSCLS = dis.readFloat();
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			        this.RFDEPT = dis.readFloat();
					
			        this.RFSDPT = dis.readFloat();
					
			        this.RFCLAS = dis.readFloat();
					
			        this.RFSCLS = dis.readFloat();
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// float
				
		            	dos.writeFloat(this.RFDEPT);
					
					// float
				
		            	dos.writeFloat(this.RFSDPT);
					
					// float
				
		            	dos.writeFloat(this.RFCLAS);
					
					// float
				
		            	dos.writeFloat(this.RFSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// float
				
		            	dos.writeFloat(this.RFDEPT);
					
					// float
				
		            	dos.writeFloat(this.RFSDPT);
					
					// float
				
		            	dos.writeFloat(this.RFCLAS);
					
					// float
				
		            	dos.writeFloat(this.RFSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",ISTORE="+String.valueOf(ISTORE));
		sb.append(",RFSTCN="+String.valueOf(RFSTCN));
		sb.append(",RFSTDT="+String.valueOf(RFSTDT));
		sb.append(",RFOPCN="+String.valueOf(RFOPCN));
		sb.append(",RFOPDT="+String.valueOf(RFOPDT));
		sb.append(",RFPROF="+RFPROF);
		sb.append(",RFRPCD="+RFRPCD);
		sb.append(",RFANUM="+String.valueOf(RFANUM));
		sb.append(",RFSNUM="+String.valueOf(RFSNUM));
		sb.append(",RFDSCD="+RFDSCD);
		sb.append(",RFREPL="+String.valueOf(RFREPL));
		sb.append(",RFDIST="+RFDIST);
		sb.append(",RFMSTK="+String.valueOf(RFMSTK));
		sb.append(",RFDSPY="+String.valueOf(RFDSPY));
		sb.append(",RFMCOD="+RFMCOD);
		sb.append(",RFWHSE="+String.valueOf(RFWHSE));
		sb.append(",RFFDCN="+String.valueOf(RFFDCN));
		sb.append(",RFFDDT="+String.valueOf(RFFDDT));
		sb.append(",RFSSTR="+String.valueOf(RFSSTR));
		sb.append(",RFSSKU="+String.valueOf(RFSSKU));
		sb.append(",RFVWKS="+String.valueOf(RFVWKS));
		sb.append(",RFBSLS="+String.valueOf(RFBSLS));
		sb.append(",RFTRND="+String.valueOf(RFTRND));
		sb.append(",RFATRN="+String.valueOf(RFATRN));
		sb.append(",RFFCUN="+String.valueOf(RFFCUN));
		sb.append(",RFLPWS="+String.valueOf(RFLPWS));
		sb.append(",RFLNWS="+String.valueOf(RFLNWS));
		sb.append(",RFLEAD="+String.valueOf(RFLEAD));
		sb.append(",RFMAXS="+String.valueOf(RFMAXS));
		sb.append(",RFMINS="+String.valueOf(RFMINS));
		sb.append(",RFMRAT="+String.valueOf(RFMRAT));
		sb.append(",RFPRAT="+String.valueOf(RFPRAT));
		sb.append(",RFPPCT="+String.valueOf(RFPPCT));
		sb.append(",RFMAX="+String.valueOf(RFMAX));
		sb.append(",RFMIN="+String.valueOf(RFMIN));
		sb.append(",RFASWP="+String.valueOf(RFASWP));
		sb.append(",RFASWN="+String.valueOf(RFASWN));
		sb.append(",RFASWH="+String.valueOf(RFASWH));
		sb.append(",RFASWF="+String.valueOf(RFASWF));
		sb.append(",RFRVPR="+String.valueOf(RFRVPR));
		sb.append(",RFSAM="+String.valueOf(RFSAM));
		sb.append(",RFRAT1="+String.valueOf(RFRAT1));
		sb.append(",RFRNK1="+RFRNK1);
		sb.append(",RFRAT2="+String.valueOf(RFRAT2));
		sb.append(",RFRNK2="+RFRNK2);
		sb.append(",RFRAT3="+String.valueOf(RFRAT3));
		sb.append(",RFRNK3="+RFRNK3);
		sb.append(",RFRAT4="+String.valueOf(RFRAT4));
		sb.append(",RFRNK4="+RFRNK4);
		sb.append(",RFMXSS="+String.valueOf(RFMXSS));
		sb.append(",RFSSDY="+String.valueOf(RFSSDY));
		sb.append(",RFSSUN="+String.valueOf(RFSSUN));
		sb.append(",RFRATT="+String.valueOf(RFRATT));
		sb.append(",RFSTRT="+String.valueOf(RFSTRT));
		sb.append(",RFSDCN="+String.valueOf(RFSDCN));
		sb.append(",RFSDDT="+String.valueOf(RFSDDT));
		sb.append(",RFSCUN="+String.valueOf(RFSCUN));
		sb.append(",RFDEPT="+String.valueOf(RFDEPT));
		sb.append(",RFSDPT="+String.valueOf(RFSDPT));
		sb.append(",RFCLAS="+String.valueOf(RFCLAS));
		sb.append(",RFSCLS="+String.valueOf(RFSCLS));
		sb.append(",RFWFC1="+String.valueOf(RFWFC1));
		sb.append(",RFWFC2="+String.valueOf(RFWFC2));
		sb.append(",RFPSWH="+String.valueOf(RFPSWH));
		sb.append(",RFSLFC="+String.valueOf(RFSLFC));
		sb.append(",RFENCN="+String.valueOf(RFENCN));
		sb.append(",RFENDT="+String.valueOf(RFENDT));
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
        		
        				if(ISTORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTORE);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPROF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPROF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRPCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFANUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFANUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFSNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSNUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFREPL);
            			}
            		
        			sb.append("|");
        		
        				if(RFDIST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDIST);
            			}
            		
        			sb.append("|");
        		
        				if(RFMSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMSTK);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSPY);
            			}
            		
        			sb.append("|");
        		
        				if(RFMCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMCOD);
            			}
            		
        			sb.append("|");
        		
        				if(RFWHSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWHSE);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSTR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSKU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSKU);
            			}
            		
        			sb.append("|");
        		
        				if(RFVWKS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFVWKS);
            			}
            		
        			sb.append("|");
        		
        				if(RFBSLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFBSLS);
            			}
            		
        			sb.append("|");
        		
        				if(RFTRND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFTRND);
            			}
            		
        			sb.append("|");
        		
        				if(RFATRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFATRN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFCUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFLPWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLPWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLNWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLNWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAXS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAXS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMINS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMINS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPPCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPPCT);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAX);
            			}
            		
        			sb.append("|");
        		
        				if(RFMIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMIN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWP);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRVPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRVPR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSAM);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT4);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK4);
            			}
            		
        			sb.append("|");
        		
        				if(RFMXSS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMXSS);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSDY);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFRATT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRATT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTRT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSCUN);
            			}
            		
        			sb.append("|");
        		
        				sb.append(RFDEPT);
        			
        			sb.append("|");
        		
        				sb.append(RFSDPT);
        			
        			sb.append("|");
        		
        				sb.append(RFCLAS);
        			
        			sb.append("|");
        		
        				sb.append(RFSCLS);
        			
        			sb.append("|");
        		
        				if(RFWFC1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC1);
            			}
            		
        			sb.append("|");
        		
        				if(RFWFC2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC2);
            			}
            		
        			sb.append("|");
        		
        				if(RFPSWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPSWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFSLFC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSLFC);
            			}
            		
        			sb.append("|");
        		
        				if(RFENCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFENDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENDT);
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
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_6");
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



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tFileOutputDelimited_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_6", false);
		start_Hash.put("tFileOutputDelimited_6", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_6";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row4");
			
		int tos_count_tFileOutputDelimited_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_6 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_6.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_6.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("FILENAME" + " = " + "\"/data/talend/data_repository/RPLPRF.csv\"");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("COMPRESS" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                            log4jParamters_tFileOutputDelimited_6.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_6 - "  + (log4jParamters_tFileOutputDelimited_6) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_6", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_6 = "";
    fileName_tFileOutputDelimited_6 = (new java.io.File("/data/talend/data_repository/RPLPRF.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_6 = null;
    String extension_tFileOutputDelimited_6 = null;
    String directory_tFileOutputDelimited_6 = null;
    if((fileName_tFileOutputDelimited_6.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_6.lastIndexOf(".") < fileName_tFileOutputDelimited_6.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6;
            extension_tFileOutputDelimited_6 = "";
        } else {
            fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0, fileName_tFileOutputDelimited_6.lastIndexOf("."));
            extension_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(fileName_tFileOutputDelimited_6.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0, fileName_tFileOutputDelimited_6.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_6.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(0, fileName_tFileOutputDelimited_6.lastIndexOf("."));
            extension_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6.substring(fileName_tFileOutputDelimited_6.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_6 = fileName_tFileOutputDelimited_6;
            extension_tFileOutputDelimited_6 = "";
        }
        directory_tFileOutputDelimited_6 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_6 = true;
    java.io.File filetFileOutputDelimited_6 = new java.io.File(fileName_tFileOutputDelimited_6);
    globalMap.put("tFileOutputDelimited_6_FILE_NAME",fileName_tFileOutputDelimited_6);
            int nb_line_tFileOutputDelimited_6 = 0;
            int splitedFileNo_tFileOutputDelimited_6 = 0;
            int currentRow_tFileOutputDelimited_6 = 0;

            final String OUT_DELIM_tFileOutputDelimited_6 = /** Start field tFileOutputDelimited_6:FIELDSEPARATOR */","/** End field tFileOutputDelimited_6:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_6 = /** Start field tFileOutputDelimited_6:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_6:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_6 != null && directory_tFileOutputDelimited_6.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_6 = new java.io.File(directory_tFileOutputDelimited_6);
                        if(!dir_tFileOutputDelimited_6.exists()) {
                                log.info("tFileOutputDelimited_6 - Creating directory '" + dir_tFileOutputDelimited_6.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_6.mkdirs();
                                log.info("tFileOutputDelimited_6 - The directory '"+ dir_tFileOutputDelimited_6.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        filetFileOutputDelimited_6 = new java.io.File(fileName_tFileOutputDelimited_6);
                        String zipName_tFileOutputDelimited_6 = fullName_tFileOutputDelimited_6 + ".zip";
                        java.io.File file_tFileOutputDelimited_6 = new java.io.File(zipName_tFileOutputDelimited_6);
                        //routines.system.Row
                        java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_6= null;
                        java.io.Writer outtFileOutputDelimited_6 = null;

                        if(file_tFileOutputDelimited_6.exists()) {
                            file_tFileOutputDelimited_6.delete();
                        }
                        zipOut_tFileOutputDelimited_6= new java.util.zip.ZipOutputStream(
                                new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_6)));
                        zipOut_tFileOutputDelimited_6.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_6.getName()));
                        outtFileOutputDelimited_6 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_6,"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_6", outtFileOutputDelimited_6);
                        synchronized (multiThreadLockWrite) {
                                    if(file_tFileOutputDelimited_6.length()==0){
                                        outtFileOutputDelimited_6.write("INUMBR");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("ISTORE");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSTCN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSTDT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFOPCN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFOPDT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFPROF");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRPCD");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFANUM");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSNUM");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFDSCD");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFREPL");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFDIST");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMSTK");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFDSPY");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMCOD");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFWHSE");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFFDCN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFFDDT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSSTR");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSSKU");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFVWKS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFBSLS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFTRND");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFATRN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFFCUN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFLPWS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFLNWS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFLEAD");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMAXS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMINS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMRAT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFPRAT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFPPCT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMAX");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMIN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFASWP");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFASWN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFASWH");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFASWF");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRVPR");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSAM");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRAT1");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRNK1");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRAT2");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRNK2");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRAT3");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRNK3");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRAT4");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRNK4");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFMXSS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSSDY");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSSUN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFRATT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSTRT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSDCN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSDDT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSCUN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFDEPT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSDPT");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFCLAS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSCLS");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFWFC1");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFWFC2");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFPSWH");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFSLFC");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFENCN");
                                            outtFileOutputDelimited_6.write(OUT_DELIM_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.write("RFENDT");
                                        outtFileOutputDelimited_6.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_6);
                                        outtFileOutputDelimited_6.flush();
                                    }
                        }


resourceMap.put("nb_line_tFileOutputDelimited_6", nb_line_tFileOutputDelimited_6);

 



/**
 * [tFileOutputDelimited_6 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";
	
	
		int tos_count_tDBInput_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_6 = new StringBuilder();
                    log4jParamters_tDBInput_6.append("Parameters:");
                            log4jParamters_tDBInput_6.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("DB_VERSION" + " = " + "jt400-9.8.jar");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("HOST" + " = " + "context.jda_host_name");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("DBNAME" + " = " + "context.jda_mm_lib");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("USER" + " = " + "context.jda_user_name");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password)).substring(0, 4) + "...");     
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("QUERY" + " = " + "\"  select * from MM4R5LIB.RPLPRF    \"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFOPCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFOPDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPROF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFANUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDSCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFREPL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDIST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDSPY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWHSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFDCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFDDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSKU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFVWKS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFBSLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFTRND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFATRN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFCUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLPWS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLNWS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMAXS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMINS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPPCT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRVPR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMXSS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRATT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSCUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSCLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWFC1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWFC2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPSWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSLFC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFENCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFENDT")+"}]");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_6.append(" | ");
                            log4jParamters_tDBInput_6.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
                        log4jParamters_tDBInput_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + (log4jParamters_tDBInput_6) );
                    } 
                } 
            new BytesLimit65535_tDBInput_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_6", "tDBInput_1", "tAS400Input");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				String driverClass_tDBInput_6 = "com.ibm.as400.access.AS400JDBCDriver";
			    java.lang.Class jdbcclazz_tDBInput_6 = java.lang.Class.forName(driverClass_tDBInput_6);
				String dbUser_tDBInput_6 = context.jda_user_name;
				
				
	final String decryptedPassword_tDBInput_6 = context.jda_password; 
				
				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;
				  
				String url_tDBInput_6 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";" + "prompt=false";
				
	    		log.debug("tDBInput_6 - Driver ClassName: "+driverClass_tDBInput_6+".");
			
	    		log.debug("tDBInput_6 - Connection attempt to '" + url_tDBInput_6 + "' with the username '" + dbUser_tDBInput_6 + "'.");
			
				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
	    		log.debug("tDBInput_6 - Connection to '" + url_tDBInput_6 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "\nselect * from MM4R5LIB.RPLPRF\n\n";
		    
	    		log.debug("tDBInput_6 - Executing the query: '" + dbquery_tDBInput_6 + "'.");
			

            	globalMap.put("tDBInput_6_QUERY",dbquery_tDBInput_6);
		    java.sql.ResultSet rs_tDBInput_6 = null;

		    try {
		    	rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
		    	int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

		    String tmpContent_tDBInput_6 = null;
		    
		    
		    	log.debug("tDBInput_6 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_6.next()) {
		        nb_line_tDBInput_6++;
		        
							if(colQtyInRs_tDBInput_6 < 1) {
								row4.INUMBR = null;
							} else {
		                          
            row4.INUMBR = rs_tDBInput_6.getBigDecimal(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row4.ISTORE = null;
							} else {
		                          
            row4.ISTORE = rs_tDBInput_6.getBigDecimal(2);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row4.RFSTCN = null;
							} else {
		                          
            row4.RFSTCN = rs_tDBInput_6.getBigDecimal(3);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row4.RFSTDT = null;
							} else {
		                          
            row4.RFSTDT = rs_tDBInput_6.getBigDecimal(4);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row4.RFOPCN = null;
							} else {
		                          
            row4.RFOPCN = rs_tDBInput_6.getBigDecimal(5);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row4.RFOPDT = null;
							} else {
		                          
            row4.RFOPDT = rs_tDBInput_6.getBigDecimal(6);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row4.RFPROF = null;
							} else {
	                         		
        	row4.RFPROF = routines.system.JDBCUtil.getString(rs_tDBInput_6, 7, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row4.RFRPCD = null;
							} else {
	                         		
        	row4.RFRPCD = routines.system.JDBCUtil.getString(rs_tDBInput_6, 8, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row4.RFANUM = null;
							} else {
		                          
            row4.RFANUM = rs_tDBInput_6.getBigDecimal(9);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row4.RFSNUM = null;
							} else {
		                          
            row4.RFSNUM = rs_tDBInput_6.getBigDecimal(10);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row4.RFDSCD = null;
							} else {
	                         		
        	row4.RFDSCD = routines.system.JDBCUtil.getString(rs_tDBInput_6, 11, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 12) {
								row4.RFREPL = null;
							} else {
		                          
            row4.RFREPL = rs_tDBInput_6.getBigDecimal(12);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 13) {
								row4.RFDIST = null;
							} else {
	                         		
        	row4.RFDIST = routines.system.JDBCUtil.getString(rs_tDBInput_6, 13, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 14) {
								row4.RFMSTK = null;
							} else {
		                          
            row4.RFMSTK = rs_tDBInput_6.getBigDecimal(14);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 15) {
								row4.RFDSPY = null;
							} else {
		                          
            row4.RFDSPY = rs_tDBInput_6.getBigDecimal(15);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 16) {
								row4.RFMCOD = null;
							} else {
	                         		
        	row4.RFMCOD = routines.system.JDBCUtil.getString(rs_tDBInput_6, 16, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 17) {
								row4.RFWHSE = null;
							} else {
		                          
            row4.RFWHSE = rs_tDBInput_6.getBigDecimal(17);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 18) {
								row4.RFFDCN = null;
							} else {
		                          
            row4.RFFDCN = rs_tDBInput_6.getBigDecimal(18);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 19) {
								row4.RFFDDT = null;
							} else {
		                          
            row4.RFFDDT = rs_tDBInput_6.getBigDecimal(19);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 20) {
								row4.RFSSTR = null;
							} else {
		                          
            row4.RFSSTR = rs_tDBInput_6.getBigDecimal(20);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 21) {
								row4.RFSSKU = null;
							} else {
		                          
            row4.RFSSKU = rs_tDBInput_6.getBigDecimal(21);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 22) {
								row4.RFVWKS = null;
							} else {
		                          
            row4.RFVWKS = rs_tDBInput_6.getBigDecimal(22);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 23) {
								row4.RFBSLS = null;
							} else {
		                          
            row4.RFBSLS = rs_tDBInput_6.getBigDecimal(23);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 24) {
								row4.RFTRND = null;
							} else {
		                          
            row4.RFTRND = rs_tDBInput_6.getBigDecimal(24);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 25) {
								row4.RFATRN = null;
							} else {
		                          
            row4.RFATRN = rs_tDBInput_6.getBigDecimal(25);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 26) {
								row4.RFFCUN = null;
							} else {
		                          
            row4.RFFCUN = rs_tDBInput_6.getBigDecimal(26);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 27) {
								row4.RFLPWS = null;
							} else {
		                          
            row4.RFLPWS = rs_tDBInput_6.getBigDecimal(27);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 28) {
								row4.RFLNWS = null;
							} else {
		                          
            row4.RFLNWS = rs_tDBInput_6.getBigDecimal(28);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 29) {
								row4.RFLEAD = null;
							} else {
		                          
            row4.RFLEAD = rs_tDBInput_6.getBigDecimal(29);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 30) {
								row4.RFMAXS = null;
							} else {
		                          
            row4.RFMAXS = rs_tDBInput_6.getBigDecimal(30);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 31) {
								row4.RFMINS = null;
							} else {
		                          
            row4.RFMINS = rs_tDBInput_6.getBigDecimal(31);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 32) {
								row4.RFMRAT = null;
							} else {
		                          
            row4.RFMRAT = rs_tDBInput_6.getBigDecimal(32);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 33) {
								row4.RFPRAT = null;
							} else {
		                          
            row4.RFPRAT = rs_tDBInput_6.getBigDecimal(33);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 34) {
								row4.RFPPCT = null;
							} else {
		                          
            row4.RFPPCT = rs_tDBInput_6.getBigDecimal(34);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 35) {
								row4.RFMAX = null;
							} else {
		                          
            row4.RFMAX = rs_tDBInput_6.getBigDecimal(35);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 36) {
								row4.RFMIN = null;
							} else {
		                          
            row4.RFMIN = rs_tDBInput_6.getBigDecimal(36);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 37) {
								row4.RFASWP = null;
							} else {
		                          
            row4.RFASWP = rs_tDBInput_6.getBigDecimal(37);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 38) {
								row4.RFASWN = null;
							} else {
		                          
            row4.RFASWN = rs_tDBInput_6.getBigDecimal(38);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 39) {
								row4.RFASWH = null;
							} else {
		                          
            row4.RFASWH = rs_tDBInput_6.getBigDecimal(39);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 40) {
								row4.RFASWF = null;
							} else {
		                          
            row4.RFASWF = rs_tDBInput_6.getBigDecimal(40);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 41) {
								row4.RFRVPR = null;
							} else {
		                          
            row4.RFRVPR = rs_tDBInput_6.getBigDecimal(41);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 42) {
								row4.RFSAM = null;
							} else {
		                          
            row4.RFSAM = rs_tDBInput_6.getBigDecimal(42);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 43) {
								row4.RFRAT1 = null;
							} else {
		                          
            row4.RFRAT1 = rs_tDBInput_6.getBigDecimal(43);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 44) {
								row4.RFRNK1 = null;
							} else {
	                         		
        	row4.RFRNK1 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 44, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 45) {
								row4.RFRAT2 = null;
							} else {
		                          
            row4.RFRAT2 = rs_tDBInput_6.getBigDecimal(45);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 46) {
								row4.RFRNK2 = null;
							} else {
	                         		
        	row4.RFRNK2 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 46, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 47) {
								row4.RFRAT3 = null;
							} else {
		                          
            row4.RFRAT3 = rs_tDBInput_6.getBigDecimal(47);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 48) {
								row4.RFRNK3 = null;
							} else {
	                         		
        	row4.RFRNK3 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 48, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 49) {
								row4.RFRAT4 = null;
							} else {
		                          
            row4.RFRAT4 = rs_tDBInput_6.getBigDecimal(49);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 50) {
								row4.RFRNK4 = null;
							} else {
	                         		
        	row4.RFRNK4 = routines.system.JDBCUtil.getString(rs_tDBInput_6, 50, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 51) {
								row4.RFMXSS = null;
							} else {
		                          
            row4.RFMXSS = rs_tDBInput_6.getBigDecimal(51);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 52) {
								row4.RFSSDY = null;
							} else {
		                          
            row4.RFSSDY = rs_tDBInput_6.getBigDecimal(52);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 53) {
								row4.RFSSUN = null;
							} else {
		                          
            row4.RFSSUN = rs_tDBInput_6.getBigDecimal(53);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 54) {
								row4.RFRATT = null;
							} else {
		                          
            row4.RFRATT = rs_tDBInput_6.getBigDecimal(54);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 55) {
								row4.RFSTRT = null;
							} else {
		                          
            row4.RFSTRT = rs_tDBInput_6.getBigDecimal(55);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 56) {
								row4.RFSDCN = null;
							} else {
		                          
            row4.RFSDCN = rs_tDBInput_6.getBigDecimal(56);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 57) {
								row4.RFSDDT = null;
							} else {
		                          
            row4.RFSDDT = rs_tDBInput_6.getBigDecimal(57);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 58) {
								row4.RFSCUN = null;
							} else {
		                          
            row4.RFSCUN = rs_tDBInput_6.getBigDecimal(58);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 59) {
								row4.RFDEPT = 0;
							} else {
		                          
            row4.RFDEPT = rs_tDBInput_6.getFloat(59);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 60) {
								row4.RFSDPT = 0;
							} else {
		                          
            row4.RFSDPT = rs_tDBInput_6.getFloat(60);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 61) {
								row4.RFCLAS = 0;
							} else {
		                          
            row4.RFCLAS = rs_tDBInput_6.getFloat(61);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 62) {
								row4.RFSCLS = 0;
							} else {
		                          
            row4.RFSCLS = rs_tDBInput_6.getFloat(62);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 63) {
								row4.RFWFC1 = null;
							} else {
		                          
            row4.RFWFC1 = rs_tDBInput_6.getBigDecimal(63);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 64) {
								row4.RFWFC2 = null;
							} else {
		                          
            row4.RFWFC2 = rs_tDBInput_6.getBigDecimal(64);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 65) {
								row4.RFPSWH = null;
							} else {
		                          
            row4.RFPSWH = rs_tDBInput_6.getBigDecimal(65);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 66) {
								row4.RFSLFC = null;
							} else {
		                          
            row4.RFSLFC = rs_tDBInput_6.getBigDecimal(66);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 67) {
								row4.RFENCN = null;
							} else {
		                          
            row4.RFENCN = rs_tDBInput_6.getBigDecimal(67);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 68) {
								row4.RFENDT = null;
							} else {
		                          
            row4.RFENDT = rs_tDBInput_6.getBigDecimal(68);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					
						log.debug("tDBInput_6 - Retrieving the record " + nb_line_tDBInput_6 + ".");
					



 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	

 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_6 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_6";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row4","tDBInput_6","tDBInput_1","tAS400Input","tFileOutputDelimited_6","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row4 - " + (row4==null? "": row4.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_6 = new StringBuilder();
                            if(row4.INUMBR != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.ISTORE != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.ISTORE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSTCN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSTCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSTDT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSTDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFOPCN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFOPCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFOPDT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFOPDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFPROF != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFPROF
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRPCD != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRPCD
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFANUM != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFANUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSNUM != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSNUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFDSCD != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFDSCD
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFREPL != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFREPL.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFDIST != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFDIST
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMSTK != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMSTK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFDSPY != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFDSPY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMCOD != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMCOD
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFWHSE != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFWHSE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFFDCN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFFDCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFFDDT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFFDDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSSTR != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSSTR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSSKU != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSSKU.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFVWKS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFVWKS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFBSLS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFBSLS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFTRND != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFTRND.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFATRN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFATRN.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFFCUN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFFCUN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFLPWS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFLPWS.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFLNWS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFLNWS.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFLEAD != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFLEAD.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMAXS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMAXS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMINS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMINS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMRAT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMRAT.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFPRAT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFPRAT.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFPPCT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFPPCT.setScale(1, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMAX != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMAX.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMIN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMIN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFASWP != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFASWP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFASWN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFASWN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFASWH != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFASWH.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFASWF != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFASWF.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRVPR != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRVPR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSAM != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSAM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRAT1 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRAT1.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRNK1 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRNK1
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRAT2 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRAT2.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRNK2 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRNK2
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRAT3 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRAT3.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRNK3 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRNK3
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRAT4 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRAT4.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRNK4 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRNK4
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFMXSS != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFMXSS.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSSDY != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSSDY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSSUN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSSUN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFRATT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFRATT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSTRT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSTRT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSDCN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSDCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSDDT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSDDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSCUN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSCUN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                        sb_tFileOutputDelimited_6.append(
                            row4.RFDEPT
                        );
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSDPT
                        );
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                        sb_tFileOutputDelimited_6.append(
                            row4.RFCLAS
                        );
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSCLS
                        );
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFWFC1 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFWFC1.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFWFC2 != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFWFC2.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFPSWH != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFPSWH.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFSLFC != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFSLFC.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFENCN != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFENCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_6.append(OUT_DELIM_tFileOutputDelimited_6);
                            if(row4.RFENDT != null) {
                        sb_tFileOutputDelimited_6.append(
                            row4.RFENDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                    sb_tFileOutputDelimited_6.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_6);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_6++;
                    resourceMap.put("nb_line_tFileOutputDelimited_6", nb_line_tFileOutputDelimited_6);

                        outtFileOutputDelimited_6.write(sb_tFileOutputDelimited_6.toString());
                        log.debug("tFileOutputDelimited_6 - Writing the record " + nb_line_tFileOutputDelimited_6 + ".");

                    }



 


	tos_count_tFileOutputDelimited_6++;

/**
 * [tFileOutputDelimited_6 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_6";
	
	

 



/**
 * [tFileOutputDelimited_6 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_6";
	
	

 



/**
 * [tFileOutputDelimited_6 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	

	}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
		if(conn_tDBInput_6 != null && !conn_tDBInput_6.isClosed()) {
			
	    		log.debug("tDBInput_6 - Closing the connection to the database.");
			
			conn_tDBInput_6.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_6 - Connection to the database closed.");
			
		}
}
globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
	    		log.debug("tDBInput_6 - Retrieved records count: "+nb_line_tDBInput_6 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_6 - "  + ("Done.") );

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_6 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_6";
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_6!=null) {
						outtFileOutputDelimited_6.flush();
						outtFileOutputDelimited_6.close();
					}
				
				globalMap.put("tFileOutputDelimited_6_NB_LINE",nb_line_tFileOutputDelimited_6);
				globalMap.put("tFileOutputDelimited_6_FILE_NAME",fileName_tFileOutputDelimited_6);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_6", true);
	
				log.debug("tFileOutputDelimited_6 - Written records count: " + nb_line_tFileOutputDelimited_6 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row4",2,0,
			 			"tDBInput_6","tDBInput_1","tAS400Input","tFileOutputDelimited_6","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_6 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_6", true);
end_Hash.put("tFileOutputDelimited_6", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_6 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_6:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk8", 0, "ok");
								} 
							
							tFileInputDelimited_6Process(globalMap); 
						



	
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";
	
	

 



/**
 * [tDBInput_6 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_6 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_6";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_6") == null){ 
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_6 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_6");
						if(outtFileOutputDelimited_6!=null) {
							outtFileOutputDelimited_6.flush();
							outtFileOutputDelimited_6.close();
						}
					
				
				}
			
			
		}
	

 



/**
 * [tFileOutputDelimited_6 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class RPLPRFStruct implements routines.system.IPersistableRow<RPLPRFStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];

	
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

				
			    public BigDecimal ISTORE;

				public BigDecimal getISTORE () {
					return this.ISTORE;
				}

				public Boolean ISTOREIsNullable(){
				    return true;
				}
				public Boolean ISTOREIsKey(){
				    return false;
				}
				public Integer ISTORELength(){
				    return null;
				}
				public Integer ISTOREPrecision(){
				    return null;
				}
				public String ISTOREDefault(){
				
					return "";
				
				}
				public String ISTOREComment(){
				
				    return "";
				
				}
				public String ISTOREPattern(){
				
					return "";
				
				}
				public String ISTOREOriginalDbColumnName(){
				
					return "ISTORE";
				
				}

				
			    public BigDecimal RFSTCN;

				public BigDecimal getRFSTCN () {
					return this.RFSTCN;
				}

				public Boolean RFSTCNIsNullable(){
				    return true;
				}
				public Boolean RFSTCNIsKey(){
				    return false;
				}
				public Integer RFSTCNLength(){
				    return null;
				}
				public Integer RFSTCNPrecision(){
				    return null;
				}
				public String RFSTCNDefault(){
				
					return "";
				
				}
				public String RFSTCNComment(){
				
				    return "";
				
				}
				public String RFSTCNPattern(){
				
					return "";
				
				}
				public String RFSTCNOriginalDbColumnName(){
				
					return "RFSTCN";
				
				}

				
			    public BigDecimal RFSTDT;

				public BigDecimal getRFSTDT () {
					return this.RFSTDT;
				}

				public Boolean RFSTDTIsNullable(){
				    return true;
				}
				public Boolean RFSTDTIsKey(){
				    return false;
				}
				public Integer RFSTDTLength(){
				    return null;
				}
				public Integer RFSTDTPrecision(){
				    return null;
				}
				public String RFSTDTDefault(){
				
					return "";
				
				}
				public String RFSTDTComment(){
				
				    return "";
				
				}
				public String RFSTDTPattern(){
				
					return "";
				
				}
				public String RFSTDTOriginalDbColumnName(){
				
					return "RFSTDT";
				
				}

				
			    public BigDecimal RFOPCN;

				public BigDecimal getRFOPCN () {
					return this.RFOPCN;
				}

				public Boolean RFOPCNIsNullable(){
				    return true;
				}
				public Boolean RFOPCNIsKey(){
				    return false;
				}
				public Integer RFOPCNLength(){
				    return null;
				}
				public Integer RFOPCNPrecision(){
				    return null;
				}
				public String RFOPCNDefault(){
				
					return "";
				
				}
				public String RFOPCNComment(){
				
				    return "";
				
				}
				public String RFOPCNPattern(){
				
					return "";
				
				}
				public String RFOPCNOriginalDbColumnName(){
				
					return "RFOPCN";
				
				}

				
			    public BigDecimal RFOPDT;

				public BigDecimal getRFOPDT () {
					return this.RFOPDT;
				}

				public Boolean RFOPDTIsNullable(){
				    return true;
				}
				public Boolean RFOPDTIsKey(){
				    return false;
				}
				public Integer RFOPDTLength(){
				    return null;
				}
				public Integer RFOPDTPrecision(){
				    return null;
				}
				public String RFOPDTDefault(){
				
					return "";
				
				}
				public String RFOPDTComment(){
				
				    return "";
				
				}
				public String RFOPDTPattern(){
				
					return "";
				
				}
				public String RFOPDTOriginalDbColumnName(){
				
					return "RFOPDT";
				
				}

				
			    public String RFPROF;

				public String getRFPROF () {
					return this.RFPROF;
				}

				public Boolean RFPROFIsNullable(){
				    return true;
				}
				public Boolean RFPROFIsKey(){
				    return false;
				}
				public Integer RFPROFLength(){
				    return null;
				}
				public Integer RFPROFPrecision(){
				    return null;
				}
				public String RFPROFDefault(){
				
					return null;
				
				}
				public String RFPROFComment(){
				
				    return "";
				
				}
				public String RFPROFPattern(){
				
					return "";
				
				}
				public String RFPROFOriginalDbColumnName(){
				
					return "RFPROF";
				
				}

				
			    public String RFRPCD;

				public String getRFRPCD () {
					return this.RFRPCD;
				}

				public Boolean RFRPCDIsNullable(){
				    return true;
				}
				public Boolean RFRPCDIsKey(){
				    return false;
				}
				public Integer RFRPCDLength(){
				    return null;
				}
				public Integer RFRPCDPrecision(){
				    return null;
				}
				public String RFRPCDDefault(){
				
					return null;
				
				}
				public String RFRPCDComment(){
				
				    return "";
				
				}
				public String RFRPCDPattern(){
				
					return "";
				
				}
				public String RFRPCDOriginalDbColumnName(){
				
					return "RFRPCD";
				
				}

				
			    public BigDecimal RFANUM;

				public BigDecimal getRFANUM () {
					return this.RFANUM;
				}

				public Boolean RFANUMIsNullable(){
				    return true;
				}
				public Boolean RFANUMIsKey(){
				    return false;
				}
				public Integer RFANUMLength(){
				    return null;
				}
				public Integer RFANUMPrecision(){
				    return null;
				}
				public String RFANUMDefault(){
				
					return "";
				
				}
				public String RFANUMComment(){
				
				    return "";
				
				}
				public String RFANUMPattern(){
				
					return "";
				
				}
				public String RFANUMOriginalDbColumnName(){
				
					return "RFANUM";
				
				}

				
			    public BigDecimal RFSNUM;

				public BigDecimal getRFSNUM () {
					return this.RFSNUM;
				}

				public Boolean RFSNUMIsNullable(){
				    return true;
				}
				public Boolean RFSNUMIsKey(){
				    return false;
				}
				public Integer RFSNUMLength(){
				    return null;
				}
				public Integer RFSNUMPrecision(){
				    return null;
				}
				public String RFSNUMDefault(){
				
					return "";
				
				}
				public String RFSNUMComment(){
				
				    return "";
				
				}
				public String RFSNUMPattern(){
				
					return "";
				
				}
				public String RFSNUMOriginalDbColumnName(){
				
					return "RFSNUM";
				
				}

				
			    public String RFDSCD;

				public String getRFDSCD () {
					return this.RFDSCD;
				}

				public Boolean RFDSCDIsNullable(){
				    return true;
				}
				public Boolean RFDSCDIsKey(){
				    return false;
				}
				public Integer RFDSCDLength(){
				    return null;
				}
				public Integer RFDSCDPrecision(){
				    return null;
				}
				public String RFDSCDDefault(){
				
					return "";
				
				}
				public String RFDSCDComment(){
				
				    return "";
				
				}
				public String RFDSCDPattern(){
				
					return "";
				
				}
				public String RFDSCDOriginalDbColumnName(){
				
					return "RFDSCD";
				
				}

				
			    public BigDecimal RFREPL;

				public BigDecimal getRFREPL () {
					return this.RFREPL;
				}

				public Boolean RFREPLIsNullable(){
				    return true;
				}
				public Boolean RFREPLIsKey(){
				    return false;
				}
				public Integer RFREPLLength(){
				    return null;
				}
				public Integer RFREPLPrecision(){
				    return null;
				}
				public String RFREPLDefault(){
				
					return "";
				
				}
				public String RFREPLComment(){
				
				    return "";
				
				}
				public String RFREPLPattern(){
				
					return "";
				
				}
				public String RFREPLOriginalDbColumnName(){
				
					return "RFREPL";
				
				}

				
			    public String RFDIST;

				public String getRFDIST () {
					return this.RFDIST;
				}

				public Boolean RFDISTIsNullable(){
				    return true;
				}
				public Boolean RFDISTIsKey(){
				    return false;
				}
				public Integer RFDISTLength(){
				    return null;
				}
				public Integer RFDISTPrecision(){
				    return null;
				}
				public String RFDISTDefault(){
				
					return "";
				
				}
				public String RFDISTComment(){
				
				    return "";
				
				}
				public String RFDISTPattern(){
				
					return "";
				
				}
				public String RFDISTOriginalDbColumnName(){
				
					return "RFDIST";
				
				}

				
			    public BigDecimal RFMSTK;

				public BigDecimal getRFMSTK () {
					return this.RFMSTK;
				}

				public Boolean RFMSTKIsNullable(){
				    return true;
				}
				public Boolean RFMSTKIsKey(){
				    return false;
				}
				public Integer RFMSTKLength(){
				    return null;
				}
				public Integer RFMSTKPrecision(){
				    return null;
				}
				public String RFMSTKDefault(){
				
					return "";
				
				}
				public String RFMSTKComment(){
				
				    return "";
				
				}
				public String RFMSTKPattern(){
				
					return "";
				
				}
				public String RFMSTKOriginalDbColumnName(){
				
					return "RFMSTK";
				
				}

				
			    public BigDecimal RFDSPY;

				public BigDecimal getRFDSPY () {
					return this.RFDSPY;
				}

				public Boolean RFDSPYIsNullable(){
				    return true;
				}
				public Boolean RFDSPYIsKey(){
				    return false;
				}
				public Integer RFDSPYLength(){
				    return null;
				}
				public Integer RFDSPYPrecision(){
				    return null;
				}
				public String RFDSPYDefault(){
				
					return "";
				
				}
				public String RFDSPYComment(){
				
				    return "";
				
				}
				public String RFDSPYPattern(){
				
					return "";
				
				}
				public String RFDSPYOriginalDbColumnName(){
				
					return "RFDSPY";
				
				}

				
			    public String RFMCOD;

				public String getRFMCOD () {
					return this.RFMCOD;
				}

				public Boolean RFMCODIsNullable(){
				    return true;
				}
				public Boolean RFMCODIsKey(){
				    return false;
				}
				public Integer RFMCODLength(){
				    return null;
				}
				public Integer RFMCODPrecision(){
				    return null;
				}
				public String RFMCODDefault(){
				
					return "";
				
				}
				public String RFMCODComment(){
				
				    return "";
				
				}
				public String RFMCODPattern(){
				
					return "";
				
				}
				public String RFMCODOriginalDbColumnName(){
				
					return "RFMCOD";
				
				}

				
			    public BigDecimal RFWHSE;

				public BigDecimal getRFWHSE () {
					return this.RFWHSE;
				}

				public Boolean RFWHSEIsNullable(){
				    return true;
				}
				public Boolean RFWHSEIsKey(){
				    return false;
				}
				public Integer RFWHSELength(){
				    return null;
				}
				public Integer RFWHSEPrecision(){
				    return null;
				}
				public String RFWHSEDefault(){
				
					return "";
				
				}
				public String RFWHSEComment(){
				
				    return "";
				
				}
				public String RFWHSEPattern(){
				
					return "";
				
				}
				public String RFWHSEOriginalDbColumnName(){
				
					return "RFWHSE";
				
				}

				
			    public BigDecimal RFFDCN;

				public BigDecimal getRFFDCN () {
					return this.RFFDCN;
				}

				public Boolean RFFDCNIsNullable(){
				    return true;
				}
				public Boolean RFFDCNIsKey(){
				    return false;
				}
				public Integer RFFDCNLength(){
				    return null;
				}
				public Integer RFFDCNPrecision(){
				    return null;
				}
				public String RFFDCNDefault(){
				
					return "";
				
				}
				public String RFFDCNComment(){
				
				    return "";
				
				}
				public String RFFDCNPattern(){
				
					return "";
				
				}
				public String RFFDCNOriginalDbColumnName(){
				
					return "RFFDCN";
				
				}

				
			    public BigDecimal RFFDDT;

				public BigDecimal getRFFDDT () {
					return this.RFFDDT;
				}

				public Boolean RFFDDTIsNullable(){
				    return true;
				}
				public Boolean RFFDDTIsKey(){
				    return false;
				}
				public Integer RFFDDTLength(){
				    return null;
				}
				public Integer RFFDDTPrecision(){
				    return null;
				}
				public String RFFDDTDefault(){
				
					return "";
				
				}
				public String RFFDDTComment(){
				
				    return "";
				
				}
				public String RFFDDTPattern(){
				
					return "";
				
				}
				public String RFFDDTOriginalDbColumnName(){
				
					return "RFFDDT";
				
				}

				
			    public BigDecimal RFSSTR;

				public BigDecimal getRFSSTR () {
					return this.RFSSTR;
				}

				public Boolean RFSSTRIsNullable(){
				    return true;
				}
				public Boolean RFSSTRIsKey(){
				    return false;
				}
				public Integer RFSSTRLength(){
				    return null;
				}
				public Integer RFSSTRPrecision(){
				    return null;
				}
				public String RFSSTRDefault(){
				
					return "";
				
				}
				public String RFSSTRComment(){
				
				    return "";
				
				}
				public String RFSSTRPattern(){
				
					return "";
				
				}
				public String RFSSTROriginalDbColumnName(){
				
					return "RFSSTR";
				
				}

				
			    public BigDecimal RFSSKU;

				public BigDecimal getRFSSKU () {
					return this.RFSSKU;
				}

				public Boolean RFSSKUIsNullable(){
				    return true;
				}
				public Boolean RFSSKUIsKey(){
				    return false;
				}
				public Integer RFSSKULength(){
				    return null;
				}
				public Integer RFSSKUPrecision(){
				    return null;
				}
				public String RFSSKUDefault(){
				
					return "";
				
				}
				public String RFSSKUComment(){
				
				    return "";
				
				}
				public String RFSSKUPattern(){
				
					return "";
				
				}
				public String RFSSKUOriginalDbColumnName(){
				
					return "RFSSKU";
				
				}

				
			    public BigDecimal RFVWKS;

				public BigDecimal getRFVWKS () {
					return this.RFVWKS;
				}

				public Boolean RFVWKSIsNullable(){
				    return true;
				}
				public Boolean RFVWKSIsKey(){
				    return false;
				}
				public Integer RFVWKSLength(){
				    return null;
				}
				public Integer RFVWKSPrecision(){
				    return null;
				}
				public String RFVWKSDefault(){
				
					return "";
				
				}
				public String RFVWKSComment(){
				
				    return "";
				
				}
				public String RFVWKSPattern(){
				
					return "";
				
				}
				public String RFVWKSOriginalDbColumnName(){
				
					return "RFVWKS";
				
				}

				
			    public BigDecimal RFBSLS;

				public BigDecimal getRFBSLS () {
					return this.RFBSLS;
				}

				public Boolean RFBSLSIsNullable(){
				    return true;
				}
				public Boolean RFBSLSIsKey(){
				    return false;
				}
				public Integer RFBSLSLength(){
				    return null;
				}
				public Integer RFBSLSPrecision(){
				    return null;
				}
				public String RFBSLSDefault(){
				
					return "";
				
				}
				public String RFBSLSComment(){
				
				    return "";
				
				}
				public String RFBSLSPattern(){
				
					return "";
				
				}
				public String RFBSLSOriginalDbColumnName(){
				
					return "RFBSLS";
				
				}

				
			    public BigDecimal RFTRND;

				public BigDecimal getRFTRND () {
					return this.RFTRND;
				}

				public Boolean RFTRNDIsNullable(){
				    return true;
				}
				public Boolean RFTRNDIsKey(){
				    return false;
				}
				public Integer RFTRNDLength(){
				    return null;
				}
				public Integer RFTRNDPrecision(){
				    return null;
				}
				public String RFTRNDDefault(){
				
					return "";
				
				}
				public String RFTRNDComment(){
				
				    return "";
				
				}
				public String RFTRNDPattern(){
				
					return "";
				
				}
				public String RFTRNDOriginalDbColumnName(){
				
					return "RFTRND";
				
				}

				
			    public BigDecimal RFATRN;

				public BigDecimal getRFATRN () {
					return this.RFATRN;
				}

				public Boolean RFATRNIsNullable(){
				    return true;
				}
				public Boolean RFATRNIsKey(){
				    return false;
				}
				public Integer RFATRNLength(){
				    return null;
				}
				public Integer RFATRNPrecision(){
				    return null;
				}
				public String RFATRNDefault(){
				
					return "";
				
				}
				public String RFATRNComment(){
				
				    return "";
				
				}
				public String RFATRNPattern(){
				
					return "";
				
				}
				public String RFATRNOriginalDbColumnName(){
				
					return "RFATRN";
				
				}

				
			    public BigDecimal RFFCUN;

				public BigDecimal getRFFCUN () {
					return this.RFFCUN;
				}

				public Boolean RFFCUNIsNullable(){
				    return true;
				}
				public Boolean RFFCUNIsKey(){
				    return false;
				}
				public Integer RFFCUNLength(){
				    return null;
				}
				public Integer RFFCUNPrecision(){
				    return null;
				}
				public String RFFCUNDefault(){
				
					return "";
				
				}
				public String RFFCUNComment(){
				
				    return "";
				
				}
				public String RFFCUNPattern(){
				
					return "";
				
				}
				public String RFFCUNOriginalDbColumnName(){
				
					return "RFFCUN";
				
				}

				
			    public BigDecimal RFLPWS;

				public BigDecimal getRFLPWS () {
					return this.RFLPWS;
				}

				public Boolean RFLPWSIsNullable(){
				    return true;
				}
				public Boolean RFLPWSIsKey(){
				    return false;
				}
				public Integer RFLPWSLength(){
				    return null;
				}
				public Integer RFLPWSPrecision(){
				    return null;
				}
				public String RFLPWSDefault(){
				
					return "";
				
				}
				public String RFLPWSComment(){
				
				    return "";
				
				}
				public String RFLPWSPattern(){
				
					return "";
				
				}
				public String RFLPWSOriginalDbColumnName(){
				
					return "RFLPWS";
				
				}

				
			    public BigDecimal RFLNWS;

				public BigDecimal getRFLNWS () {
					return this.RFLNWS;
				}

				public Boolean RFLNWSIsNullable(){
				    return true;
				}
				public Boolean RFLNWSIsKey(){
				    return false;
				}
				public Integer RFLNWSLength(){
				    return null;
				}
				public Integer RFLNWSPrecision(){
				    return null;
				}
				public String RFLNWSDefault(){
				
					return "";
				
				}
				public String RFLNWSComment(){
				
				    return "";
				
				}
				public String RFLNWSPattern(){
				
					return "";
				
				}
				public String RFLNWSOriginalDbColumnName(){
				
					return "RFLNWS";
				
				}

				
			    public BigDecimal RFLEAD;

				public BigDecimal getRFLEAD () {
					return this.RFLEAD;
				}

				public Boolean RFLEADIsNullable(){
				    return true;
				}
				public Boolean RFLEADIsKey(){
				    return false;
				}
				public Integer RFLEADLength(){
				    return null;
				}
				public Integer RFLEADPrecision(){
				    return null;
				}
				public String RFLEADDefault(){
				
					return "";
				
				}
				public String RFLEADComment(){
				
				    return "";
				
				}
				public String RFLEADPattern(){
				
					return "";
				
				}
				public String RFLEADOriginalDbColumnName(){
				
					return "RFLEAD";
				
				}

				
			    public BigDecimal RFMAXS;

				public BigDecimal getRFMAXS () {
					return this.RFMAXS;
				}

				public Boolean RFMAXSIsNullable(){
				    return true;
				}
				public Boolean RFMAXSIsKey(){
				    return false;
				}
				public Integer RFMAXSLength(){
				    return null;
				}
				public Integer RFMAXSPrecision(){
				    return null;
				}
				public String RFMAXSDefault(){
				
					return "";
				
				}
				public String RFMAXSComment(){
				
				    return "";
				
				}
				public String RFMAXSPattern(){
				
					return "";
				
				}
				public String RFMAXSOriginalDbColumnName(){
				
					return "RFMAXS";
				
				}

				
			    public BigDecimal RFMINS;

				public BigDecimal getRFMINS () {
					return this.RFMINS;
				}

				public Boolean RFMINSIsNullable(){
				    return true;
				}
				public Boolean RFMINSIsKey(){
				    return false;
				}
				public Integer RFMINSLength(){
				    return null;
				}
				public Integer RFMINSPrecision(){
				    return null;
				}
				public String RFMINSDefault(){
				
					return "";
				
				}
				public String RFMINSComment(){
				
				    return "";
				
				}
				public String RFMINSPattern(){
				
					return "";
				
				}
				public String RFMINSOriginalDbColumnName(){
				
					return "RFMINS";
				
				}

				
			    public BigDecimal RFMRAT;

				public BigDecimal getRFMRAT () {
					return this.RFMRAT;
				}

				public Boolean RFMRATIsNullable(){
				    return true;
				}
				public Boolean RFMRATIsKey(){
				    return false;
				}
				public Integer RFMRATLength(){
				    return null;
				}
				public Integer RFMRATPrecision(){
				    return null;
				}
				public String RFMRATDefault(){
				
					return "";
				
				}
				public String RFMRATComment(){
				
				    return "";
				
				}
				public String RFMRATPattern(){
				
					return "";
				
				}
				public String RFMRATOriginalDbColumnName(){
				
					return "RFMRAT";
				
				}

				
			    public BigDecimal RFPRAT;

				public BigDecimal getRFPRAT () {
					return this.RFPRAT;
				}

				public Boolean RFPRATIsNullable(){
				    return true;
				}
				public Boolean RFPRATIsKey(){
				    return false;
				}
				public Integer RFPRATLength(){
				    return null;
				}
				public Integer RFPRATPrecision(){
				    return null;
				}
				public String RFPRATDefault(){
				
					return "";
				
				}
				public String RFPRATComment(){
				
				    return "";
				
				}
				public String RFPRATPattern(){
				
					return "";
				
				}
				public String RFPRATOriginalDbColumnName(){
				
					return "RFPRAT";
				
				}

				
			    public BigDecimal RFPPCT;

				public BigDecimal getRFPPCT () {
					return this.RFPPCT;
				}

				public Boolean RFPPCTIsNullable(){
				    return true;
				}
				public Boolean RFPPCTIsKey(){
				    return false;
				}
				public Integer RFPPCTLength(){
				    return null;
				}
				public Integer RFPPCTPrecision(){
				    return null;
				}
				public String RFPPCTDefault(){
				
					return "";
				
				}
				public String RFPPCTComment(){
				
				    return "";
				
				}
				public String RFPPCTPattern(){
				
					return "";
				
				}
				public String RFPPCTOriginalDbColumnName(){
				
					return "RFPPCT";
				
				}

				
			    public BigDecimal RFMAX;

				public BigDecimal getRFMAX () {
					return this.RFMAX;
				}

				public Boolean RFMAXIsNullable(){
				    return true;
				}
				public Boolean RFMAXIsKey(){
				    return false;
				}
				public Integer RFMAXLength(){
				    return null;
				}
				public Integer RFMAXPrecision(){
				    return null;
				}
				public String RFMAXDefault(){
				
					return "";
				
				}
				public String RFMAXComment(){
				
				    return "";
				
				}
				public String RFMAXPattern(){
				
					return "";
				
				}
				public String RFMAXOriginalDbColumnName(){
				
					return "RFMAX";
				
				}

				
			    public BigDecimal RFMIN;

				public BigDecimal getRFMIN () {
					return this.RFMIN;
				}

				public Boolean RFMINIsNullable(){
				    return true;
				}
				public Boolean RFMINIsKey(){
				    return false;
				}
				public Integer RFMINLength(){
				    return null;
				}
				public Integer RFMINPrecision(){
				    return null;
				}
				public String RFMINDefault(){
				
					return "";
				
				}
				public String RFMINComment(){
				
				    return "";
				
				}
				public String RFMINPattern(){
				
					return "";
				
				}
				public String RFMINOriginalDbColumnName(){
				
					return "RFMIN";
				
				}

				
			    public BigDecimal RFASWP;

				public BigDecimal getRFASWP () {
					return this.RFASWP;
				}

				public Boolean RFASWPIsNullable(){
				    return true;
				}
				public Boolean RFASWPIsKey(){
				    return false;
				}
				public Integer RFASWPLength(){
				    return null;
				}
				public Integer RFASWPPrecision(){
				    return null;
				}
				public String RFASWPDefault(){
				
					return "";
				
				}
				public String RFASWPComment(){
				
				    return "";
				
				}
				public String RFASWPPattern(){
				
					return "";
				
				}
				public String RFASWPOriginalDbColumnName(){
				
					return "RFASWP";
				
				}

				
			    public BigDecimal RFASWN;

				public BigDecimal getRFASWN () {
					return this.RFASWN;
				}

				public Boolean RFASWNIsNullable(){
				    return true;
				}
				public Boolean RFASWNIsKey(){
				    return false;
				}
				public Integer RFASWNLength(){
				    return null;
				}
				public Integer RFASWNPrecision(){
				    return null;
				}
				public String RFASWNDefault(){
				
					return "";
				
				}
				public String RFASWNComment(){
				
				    return "";
				
				}
				public String RFASWNPattern(){
				
					return "";
				
				}
				public String RFASWNOriginalDbColumnName(){
				
					return "RFASWN";
				
				}

				
			    public BigDecimal RFASWH;

				public BigDecimal getRFASWH () {
					return this.RFASWH;
				}

				public Boolean RFASWHIsNullable(){
				    return true;
				}
				public Boolean RFASWHIsKey(){
				    return false;
				}
				public Integer RFASWHLength(){
				    return null;
				}
				public Integer RFASWHPrecision(){
				    return null;
				}
				public String RFASWHDefault(){
				
					return "";
				
				}
				public String RFASWHComment(){
				
				    return "";
				
				}
				public String RFASWHPattern(){
				
					return "";
				
				}
				public String RFASWHOriginalDbColumnName(){
				
					return "RFASWH";
				
				}

				
			    public BigDecimal RFASWF;

				public BigDecimal getRFASWF () {
					return this.RFASWF;
				}

				public Boolean RFASWFIsNullable(){
				    return true;
				}
				public Boolean RFASWFIsKey(){
				    return false;
				}
				public Integer RFASWFLength(){
				    return null;
				}
				public Integer RFASWFPrecision(){
				    return null;
				}
				public String RFASWFDefault(){
				
					return "";
				
				}
				public String RFASWFComment(){
				
				    return "";
				
				}
				public String RFASWFPattern(){
				
					return "";
				
				}
				public String RFASWFOriginalDbColumnName(){
				
					return "RFASWF";
				
				}

				
			    public BigDecimal RFRVPR;

				public BigDecimal getRFRVPR () {
					return this.RFRVPR;
				}

				public Boolean RFRVPRIsNullable(){
				    return true;
				}
				public Boolean RFRVPRIsKey(){
				    return false;
				}
				public Integer RFRVPRLength(){
				    return null;
				}
				public Integer RFRVPRPrecision(){
				    return null;
				}
				public String RFRVPRDefault(){
				
					return "";
				
				}
				public String RFRVPRComment(){
				
				    return "";
				
				}
				public String RFRVPRPattern(){
				
					return "";
				
				}
				public String RFRVPROriginalDbColumnName(){
				
					return "RFRVPR";
				
				}

				
			    public BigDecimal RFSAM;

				public BigDecimal getRFSAM () {
					return this.RFSAM;
				}

				public Boolean RFSAMIsNullable(){
				    return true;
				}
				public Boolean RFSAMIsKey(){
				    return false;
				}
				public Integer RFSAMLength(){
				    return null;
				}
				public Integer RFSAMPrecision(){
				    return null;
				}
				public String RFSAMDefault(){
				
					return "";
				
				}
				public String RFSAMComment(){
				
				    return "";
				
				}
				public String RFSAMPattern(){
				
					return "";
				
				}
				public String RFSAMOriginalDbColumnName(){
				
					return "RFSAM";
				
				}

				
			    public BigDecimal RFRAT1;

				public BigDecimal getRFRAT1 () {
					return this.RFRAT1;
				}

				public Boolean RFRAT1IsNullable(){
				    return true;
				}
				public Boolean RFRAT1IsKey(){
				    return false;
				}
				public Integer RFRAT1Length(){
				    return null;
				}
				public Integer RFRAT1Precision(){
				    return null;
				}
				public String RFRAT1Default(){
				
					return "";
				
				}
				public String RFRAT1Comment(){
				
				    return "";
				
				}
				public String RFRAT1Pattern(){
				
					return "";
				
				}
				public String RFRAT1OriginalDbColumnName(){
				
					return "RFRAT1";
				
				}

				
			    public String RFRNK1;

				public String getRFRNK1 () {
					return this.RFRNK1;
				}

				public Boolean RFRNK1IsNullable(){
				    return true;
				}
				public Boolean RFRNK1IsKey(){
				    return false;
				}
				public Integer RFRNK1Length(){
				    return null;
				}
				public Integer RFRNK1Precision(){
				    return null;
				}
				public String RFRNK1Default(){
				
					return "";
				
				}
				public String RFRNK1Comment(){
				
				    return "";
				
				}
				public String RFRNK1Pattern(){
				
					return "";
				
				}
				public String RFRNK1OriginalDbColumnName(){
				
					return "RFRNK1";
				
				}

				
			    public BigDecimal RFRAT2;

				public BigDecimal getRFRAT2 () {
					return this.RFRAT2;
				}

				public Boolean RFRAT2IsNullable(){
				    return true;
				}
				public Boolean RFRAT2IsKey(){
				    return false;
				}
				public Integer RFRAT2Length(){
				    return null;
				}
				public Integer RFRAT2Precision(){
				    return null;
				}
				public String RFRAT2Default(){
				
					return "";
				
				}
				public String RFRAT2Comment(){
				
				    return "";
				
				}
				public String RFRAT2Pattern(){
				
					return "";
				
				}
				public String RFRAT2OriginalDbColumnName(){
				
					return "RFRAT2";
				
				}

				
			    public String RFRNK2;

				public String getRFRNK2 () {
					return this.RFRNK2;
				}

				public Boolean RFRNK2IsNullable(){
				    return true;
				}
				public Boolean RFRNK2IsKey(){
				    return false;
				}
				public Integer RFRNK2Length(){
				    return null;
				}
				public Integer RFRNK2Precision(){
				    return null;
				}
				public String RFRNK2Default(){
				
					return "";
				
				}
				public String RFRNK2Comment(){
				
				    return "";
				
				}
				public String RFRNK2Pattern(){
				
					return "";
				
				}
				public String RFRNK2OriginalDbColumnName(){
				
					return "RFRNK2";
				
				}

				
			    public BigDecimal RFRAT3;

				public BigDecimal getRFRAT3 () {
					return this.RFRAT3;
				}

				public Boolean RFRAT3IsNullable(){
				    return true;
				}
				public Boolean RFRAT3IsKey(){
				    return false;
				}
				public Integer RFRAT3Length(){
				    return null;
				}
				public Integer RFRAT3Precision(){
				    return null;
				}
				public String RFRAT3Default(){
				
					return "";
				
				}
				public String RFRAT3Comment(){
				
				    return "";
				
				}
				public String RFRAT3Pattern(){
				
					return "";
				
				}
				public String RFRAT3OriginalDbColumnName(){
				
					return "RFRAT3";
				
				}

				
			    public String RFRNK3;

				public String getRFRNK3 () {
					return this.RFRNK3;
				}

				public Boolean RFRNK3IsNullable(){
				    return true;
				}
				public Boolean RFRNK3IsKey(){
				    return false;
				}
				public Integer RFRNK3Length(){
				    return null;
				}
				public Integer RFRNK3Precision(){
				    return null;
				}
				public String RFRNK3Default(){
				
					return "";
				
				}
				public String RFRNK3Comment(){
				
				    return "";
				
				}
				public String RFRNK3Pattern(){
				
					return "";
				
				}
				public String RFRNK3OriginalDbColumnName(){
				
					return "RFRNK3";
				
				}

				
			    public BigDecimal RFRAT4;

				public BigDecimal getRFRAT4 () {
					return this.RFRAT4;
				}

				public Boolean RFRAT4IsNullable(){
				    return true;
				}
				public Boolean RFRAT4IsKey(){
				    return false;
				}
				public Integer RFRAT4Length(){
				    return null;
				}
				public Integer RFRAT4Precision(){
				    return null;
				}
				public String RFRAT4Default(){
				
					return "";
				
				}
				public String RFRAT4Comment(){
				
				    return "";
				
				}
				public String RFRAT4Pattern(){
				
					return "";
				
				}
				public String RFRAT4OriginalDbColumnName(){
				
					return "RFRAT4";
				
				}

				
			    public String RFRNK4;

				public String getRFRNK4 () {
					return this.RFRNK4;
				}

				public Boolean RFRNK4IsNullable(){
				    return true;
				}
				public Boolean RFRNK4IsKey(){
				    return false;
				}
				public Integer RFRNK4Length(){
				    return null;
				}
				public Integer RFRNK4Precision(){
				    return null;
				}
				public String RFRNK4Default(){
				
					return "";
				
				}
				public String RFRNK4Comment(){
				
				    return "";
				
				}
				public String RFRNK4Pattern(){
				
					return "";
				
				}
				public String RFRNK4OriginalDbColumnName(){
				
					return "RFRNK4";
				
				}

				
			    public BigDecimal RFMXSS;

				public BigDecimal getRFMXSS () {
					return this.RFMXSS;
				}

				public Boolean RFMXSSIsNullable(){
				    return true;
				}
				public Boolean RFMXSSIsKey(){
				    return false;
				}
				public Integer RFMXSSLength(){
				    return null;
				}
				public Integer RFMXSSPrecision(){
				    return null;
				}
				public String RFMXSSDefault(){
				
					return "";
				
				}
				public String RFMXSSComment(){
				
				    return "";
				
				}
				public String RFMXSSPattern(){
				
					return "";
				
				}
				public String RFMXSSOriginalDbColumnName(){
				
					return "RFMXSS";
				
				}

				
			    public BigDecimal RFSSDY;

				public BigDecimal getRFSSDY () {
					return this.RFSSDY;
				}

				public Boolean RFSSDYIsNullable(){
				    return true;
				}
				public Boolean RFSSDYIsKey(){
				    return false;
				}
				public Integer RFSSDYLength(){
				    return null;
				}
				public Integer RFSSDYPrecision(){
				    return null;
				}
				public String RFSSDYDefault(){
				
					return "";
				
				}
				public String RFSSDYComment(){
				
				    return "";
				
				}
				public String RFSSDYPattern(){
				
					return "";
				
				}
				public String RFSSDYOriginalDbColumnName(){
				
					return "RFSSDY";
				
				}

				
			    public BigDecimal RFSSUN;

				public BigDecimal getRFSSUN () {
					return this.RFSSUN;
				}

				public Boolean RFSSUNIsNullable(){
				    return true;
				}
				public Boolean RFSSUNIsKey(){
				    return false;
				}
				public Integer RFSSUNLength(){
				    return null;
				}
				public Integer RFSSUNPrecision(){
				    return null;
				}
				public String RFSSUNDefault(){
				
					return "";
				
				}
				public String RFSSUNComment(){
				
				    return "";
				
				}
				public String RFSSUNPattern(){
				
					return "";
				
				}
				public String RFSSUNOriginalDbColumnName(){
				
					return "RFSSUN";
				
				}

				
			    public BigDecimal RFRATT;

				public BigDecimal getRFRATT () {
					return this.RFRATT;
				}

				public Boolean RFRATTIsNullable(){
				    return true;
				}
				public Boolean RFRATTIsKey(){
				    return false;
				}
				public Integer RFRATTLength(){
				    return null;
				}
				public Integer RFRATTPrecision(){
				    return null;
				}
				public String RFRATTDefault(){
				
					return "";
				
				}
				public String RFRATTComment(){
				
				    return "";
				
				}
				public String RFRATTPattern(){
				
					return "";
				
				}
				public String RFRATTOriginalDbColumnName(){
				
					return "RFRATT";
				
				}

				
			    public BigDecimal RFSTRT;

				public BigDecimal getRFSTRT () {
					return this.RFSTRT;
				}

				public Boolean RFSTRTIsNullable(){
				    return true;
				}
				public Boolean RFSTRTIsKey(){
				    return false;
				}
				public Integer RFSTRTLength(){
				    return null;
				}
				public Integer RFSTRTPrecision(){
				    return null;
				}
				public String RFSTRTDefault(){
				
					return "";
				
				}
				public String RFSTRTComment(){
				
				    return "";
				
				}
				public String RFSTRTPattern(){
				
					return "";
				
				}
				public String RFSTRTOriginalDbColumnName(){
				
					return "RFSTRT";
				
				}

				
			    public BigDecimal RFSDCN;

				public BigDecimal getRFSDCN () {
					return this.RFSDCN;
				}

				public Boolean RFSDCNIsNullable(){
				    return true;
				}
				public Boolean RFSDCNIsKey(){
				    return false;
				}
				public Integer RFSDCNLength(){
				    return null;
				}
				public Integer RFSDCNPrecision(){
				    return null;
				}
				public String RFSDCNDefault(){
				
					return "";
				
				}
				public String RFSDCNComment(){
				
				    return "";
				
				}
				public String RFSDCNPattern(){
				
					return "";
				
				}
				public String RFSDCNOriginalDbColumnName(){
				
					return "RFSDCN";
				
				}

				
			    public BigDecimal RFSDDT;

				public BigDecimal getRFSDDT () {
					return this.RFSDDT;
				}

				public Boolean RFSDDTIsNullable(){
				    return true;
				}
				public Boolean RFSDDTIsKey(){
				    return false;
				}
				public Integer RFSDDTLength(){
				    return null;
				}
				public Integer RFSDDTPrecision(){
				    return null;
				}
				public String RFSDDTDefault(){
				
					return "";
				
				}
				public String RFSDDTComment(){
				
				    return "";
				
				}
				public String RFSDDTPattern(){
				
					return "";
				
				}
				public String RFSDDTOriginalDbColumnName(){
				
					return "RFSDDT";
				
				}

				
			    public BigDecimal RFSCUN;

				public BigDecimal getRFSCUN () {
					return this.RFSCUN;
				}

				public Boolean RFSCUNIsNullable(){
				    return true;
				}
				public Boolean RFSCUNIsKey(){
				    return false;
				}
				public Integer RFSCUNLength(){
				    return null;
				}
				public Integer RFSCUNPrecision(){
				    return null;
				}
				public String RFSCUNDefault(){
				
					return "";
				
				}
				public String RFSCUNComment(){
				
				    return "";
				
				}
				public String RFSCUNPattern(){
				
					return "";
				
				}
				public String RFSCUNOriginalDbColumnName(){
				
					return "RFSCUN";
				
				}

				
			    public Double RFDEPT;

				public Double getRFDEPT () {
					return this.RFDEPT;
				}

				public Boolean RFDEPTIsNullable(){
				    return true;
				}
				public Boolean RFDEPTIsKey(){
				    return false;
				}
				public Integer RFDEPTLength(){
				    return null;
				}
				public Integer RFDEPTPrecision(){
				    return null;
				}
				public String RFDEPTDefault(){
				
					return "";
				
				}
				public String RFDEPTComment(){
				
				    return "";
				
				}
				public String RFDEPTPattern(){
				
					return "";
				
				}
				public String RFDEPTOriginalDbColumnName(){
				
					return "RFDEPT";
				
				}

				
			    public Double RFSDPT;

				public Double getRFSDPT () {
					return this.RFSDPT;
				}

				public Boolean RFSDPTIsNullable(){
				    return true;
				}
				public Boolean RFSDPTIsKey(){
				    return false;
				}
				public Integer RFSDPTLength(){
				    return null;
				}
				public Integer RFSDPTPrecision(){
				    return null;
				}
				public String RFSDPTDefault(){
				
					return "";
				
				}
				public String RFSDPTComment(){
				
				    return "";
				
				}
				public String RFSDPTPattern(){
				
					return "";
				
				}
				public String RFSDPTOriginalDbColumnName(){
				
					return "RFSDPT";
				
				}

				
			    public Double RFCLAS;

				public Double getRFCLAS () {
					return this.RFCLAS;
				}

				public Boolean RFCLASIsNullable(){
				    return true;
				}
				public Boolean RFCLASIsKey(){
				    return false;
				}
				public Integer RFCLASLength(){
				    return null;
				}
				public Integer RFCLASPrecision(){
				    return null;
				}
				public String RFCLASDefault(){
				
					return "";
				
				}
				public String RFCLASComment(){
				
				    return "";
				
				}
				public String RFCLASPattern(){
				
					return "";
				
				}
				public String RFCLASOriginalDbColumnName(){
				
					return "RFCLAS";
				
				}

				
			    public Double RFSCLS;

				public Double getRFSCLS () {
					return this.RFSCLS;
				}

				public Boolean RFSCLSIsNullable(){
				    return true;
				}
				public Boolean RFSCLSIsKey(){
				    return false;
				}
				public Integer RFSCLSLength(){
				    return null;
				}
				public Integer RFSCLSPrecision(){
				    return null;
				}
				public String RFSCLSDefault(){
				
					return "";
				
				}
				public String RFSCLSComment(){
				
				    return "";
				
				}
				public String RFSCLSPattern(){
				
					return "";
				
				}
				public String RFSCLSOriginalDbColumnName(){
				
					return "RFSCLS";
				
				}

				
			    public BigDecimal RFWFC1;

				public BigDecimal getRFWFC1 () {
					return this.RFWFC1;
				}

				public Boolean RFWFC1IsNullable(){
				    return true;
				}
				public Boolean RFWFC1IsKey(){
				    return false;
				}
				public Integer RFWFC1Length(){
				    return null;
				}
				public Integer RFWFC1Precision(){
				    return null;
				}
				public String RFWFC1Default(){
				
					return "";
				
				}
				public String RFWFC1Comment(){
				
				    return "";
				
				}
				public String RFWFC1Pattern(){
				
					return "";
				
				}
				public String RFWFC1OriginalDbColumnName(){
				
					return "RFWFC1";
				
				}

				
			    public BigDecimal RFWFC2;

				public BigDecimal getRFWFC2 () {
					return this.RFWFC2;
				}

				public Boolean RFWFC2IsNullable(){
				    return true;
				}
				public Boolean RFWFC2IsKey(){
				    return false;
				}
				public Integer RFWFC2Length(){
				    return null;
				}
				public Integer RFWFC2Precision(){
				    return null;
				}
				public String RFWFC2Default(){
				
					return "";
				
				}
				public String RFWFC2Comment(){
				
				    return "";
				
				}
				public String RFWFC2Pattern(){
				
					return "";
				
				}
				public String RFWFC2OriginalDbColumnName(){
				
					return "RFWFC2";
				
				}

				
			    public BigDecimal RFPSWH;

				public BigDecimal getRFPSWH () {
					return this.RFPSWH;
				}

				public Boolean RFPSWHIsNullable(){
				    return true;
				}
				public Boolean RFPSWHIsKey(){
				    return false;
				}
				public Integer RFPSWHLength(){
				    return null;
				}
				public Integer RFPSWHPrecision(){
				    return null;
				}
				public String RFPSWHDefault(){
				
					return "";
				
				}
				public String RFPSWHComment(){
				
				    return "";
				
				}
				public String RFPSWHPattern(){
				
					return "";
				
				}
				public String RFPSWHOriginalDbColumnName(){
				
					return "RFPSWH";
				
				}

				
			    public BigDecimal RFSLFC;

				public BigDecimal getRFSLFC () {
					return this.RFSLFC;
				}

				public Boolean RFSLFCIsNullable(){
				    return true;
				}
				public Boolean RFSLFCIsKey(){
				    return false;
				}
				public Integer RFSLFCLength(){
				    return null;
				}
				public Integer RFSLFCPrecision(){
				    return null;
				}
				public String RFSLFCDefault(){
				
					return "";
				
				}
				public String RFSLFCComment(){
				
				    return "";
				
				}
				public String RFSLFCPattern(){
				
					return "";
				
				}
				public String RFSLFCOriginalDbColumnName(){
				
					return "RFSLFC";
				
				}

				
			    public BigDecimal RFENCN;

				public BigDecimal getRFENCN () {
					return this.RFENCN;
				}

				public Boolean RFENCNIsNullable(){
				    return true;
				}
				public Boolean RFENCNIsKey(){
				    return false;
				}
				public Integer RFENCNLength(){
				    return null;
				}
				public Integer RFENCNPrecision(){
				    return null;
				}
				public String RFENCNDefault(){
				
					return "";
				
				}
				public String RFENCNComment(){
				
				    return "";
				
				}
				public String RFENCNPattern(){
				
					return "";
				
				}
				public String RFENCNOriginalDbColumnName(){
				
					return "RFENCN";
				
				}

				
			    public BigDecimal RFENDT;

				public BigDecimal getRFENDT () {
					return this.RFENDT;
				}

				public Boolean RFENDTIsNullable(){
				    return true;
				}
				public Boolean RFENDTIsKey(){
				    return false;
				}
				public Integer RFENDTLength(){
				    return null;
				}
				public Integer RFENDTPrecision(){
				    return null;
				}
				public String RFENDTDefault(){
				
					return "";
				
				}
				public String RFENDTComment(){
				
				    return "";
				
				}
				public String RFENDTPattern(){
				
					return "";
				
				}
				public String RFENDTOriginalDbColumnName(){
				
					return "RFENDT";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFDEPT = null;
           				} else {
           			    	this.RFDEPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSDPT = null;
           				} else {
           			    	this.RFSDPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFCLAS = null;
           				} else {
           			    	this.RFCLAS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSCLS = null;
           				} else {
           			    	this.RFSCLS = dis.readDouble();
           				}
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFDEPT = null;
           				} else {
           			    	this.RFDEPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSDPT = null;
           				} else {
           			    	this.RFSDPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFCLAS = null;
           				} else {
           			    	this.RFCLAS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSCLS = null;
           				} else {
           			    	this.RFSCLS = dis.readDouble();
           				}
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// Double
				
						if(this.RFDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFDEPT);
		            	}
					
					// Double
				
						if(this.RFSDPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSDPT);
		            	}
					
					// Double
				
						if(this.RFCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFCLAS);
		            	}
					
					// Double
				
						if(this.RFSCLS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSCLS);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// Double
				
						if(this.RFDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFDEPT);
		            	}
					
					// Double
				
						if(this.RFSDPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSDPT);
		            	}
					
					// Double
				
						if(this.RFCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFCLAS);
		            	}
					
					// Double
				
						if(this.RFSCLS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSCLS);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
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
		sb.append(",ISTORE="+String.valueOf(ISTORE));
		sb.append(",RFSTCN="+String.valueOf(RFSTCN));
		sb.append(",RFSTDT="+String.valueOf(RFSTDT));
		sb.append(",RFOPCN="+String.valueOf(RFOPCN));
		sb.append(",RFOPDT="+String.valueOf(RFOPDT));
		sb.append(",RFPROF="+RFPROF);
		sb.append(",RFRPCD="+RFRPCD);
		sb.append(",RFANUM="+String.valueOf(RFANUM));
		sb.append(",RFSNUM="+String.valueOf(RFSNUM));
		sb.append(",RFDSCD="+RFDSCD);
		sb.append(",RFREPL="+String.valueOf(RFREPL));
		sb.append(",RFDIST="+RFDIST);
		sb.append(",RFMSTK="+String.valueOf(RFMSTK));
		sb.append(",RFDSPY="+String.valueOf(RFDSPY));
		sb.append(",RFMCOD="+RFMCOD);
		sb.append(",RFWHSE="+String.valueOf(RFWHSE));
		sb.append(",RFFDCN="+String.valueOf(RFFDCN));
		sb.append(",RFFDDT="+String.valueOf(RFFDDT));
		sb.append(",RFSSTR="+String.valueOf(RFSSTR));
		sb.append(",RFSSKU="+String.valueOf(RFSSKU));
		sb.append(",RFVWKS="+String.valueOf(RFVWKS));
		sb.append(",RFBSLS="+String.valueOf(RFBSLS));
		sb.append(",RFTRND="+String.valueOf(RFTRND));
		sb.append(",RFATRN="+String.valueOf(RFATRN));
		sb.append(",RFFCUN="+String.valueOf(RFFCUN));
		sb.append(",RFLPWS="+String.valueOf(RFLPWS));
		sb.append(",RFLNWS="+String.valueOf(RFLNWS));
		sb.append(",RFLEAD="+String.valueOf(RFLEAD));
		sb.append(",RFMAXS="+String.valueOf(RFMAXS));
		sb.append(",RFMINS="+String.valueOf(RFMINS));
		sb.append(",RFMRAT="+String.valueOf(RFMRAT));
		sb.append(",RFPRAT="+String.valueOf(RFPRAT));
		sb.append(",RFPPCT="+String.valueOf(RFPPCT));
		sb.append(",RFMAX="+String.valueOf(RFMAX));
		sb.append(",RFMIN="+String.valueOf(RFMIN));
		sb.append(",RFASWP="+String.valueOf(RFASWP));
		sb.append(",RFASWN="+String.valueOf(RFASWN));
		sb.append(",RFASWH="+String.valueOf(RFASWH));
		sb.append(",RFASWF="+String.valueOf(RFASWF));
		sb.append(",RFRVPR="+String.valueOf(RFRVPR));
		sb.append(",RFSAM="+String.valueOf(RFSAM));
		sb.append(",RFRAT1="+String.valueOf(RFRAT1));
		sb.append(",RFRNK1="+RFRNK1);
		sb.append(",RFRAT2="+String.valueOf(RFRAT2));
		sb.append(",RFRNK2="+RFRNK2);
		sb.append(",RFRAT3="+String.valueOf(RFRAT3));
		sb.append(",RFRNK3="+RFRNK3);
		sb.append(",RFRAT4="+String.valueOf(RFRAT4));
		sb.append(",RFRNK4="+RFRNK4);
		sb.append(",RFMXSS="+String.valueOf(RFMXSS));
		sb.append(",RFSSDY="+String.valueOf(RFSSDY));
		sb.append(",RFSSUN="+String.valueOf(RFSSUN));
		sb.append(",RFRATT="+String.valueOf(RFRATT));
		sb.append(",RFSTRT="+String.valueOf(RFSTRT));
		sb.append(",RFSDCN="+String.valueOf(RFSDCN));
		sb.append(",RFSDDT="+String.valueOf(RFSDDT));
		sb.append(",RFSCUN="+String.valueOf(RFSCUN));
		sb.append(",RFDEPT="+String.valueOf(RFDEPT));
		sb.append(",RFSDPT="+String.valueOf(RFSDPT));
		sb.append(",RFCLAS="+String.valueOf(RFCLAS));
		sb.append(",RFSCLS="+String.valueOf(RFSCLS));
		sb.append(",RFWFC1="+String.valueOf(RFWFC1));
		sb.append(",RFWFC2="+String.valueOf(RFWFC2));
		sb.append(",RFPSWH="+String.valueOf(RFPSWH));
		sb.append(",RFSLFC="+String.valueOf(RFSLFC));
		sb.append(",RFENCN="+String.valueOf(RFENCN));
		sb.append(",RFENDT="+String.valueOf(RFENDT));
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
        		
        				if(ISTORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTORE);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPROF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPROF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRPCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFANUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFANUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFSNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSNUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFREPL);
            			}
            		
        			sb.append("|");
        		
        				if(RFDIST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDIST);
            			}
            		
        			sb.append("|");
        		
        				if(RFMSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMSTK);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSPY);
            			}
            		
        			sb.append("|");
        		
        				if(RFMCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMCOD);
            			}
            		
        			sb.append("|");
        		
        				if(RFWHSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWHSE);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSTR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSKU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSKU);
            			}
            		
        			sb.append("|");
        		
        				if(RFVWKS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFVWKS);
            			}
            		
        			sb.append("|");
        		
        				if(RFBSLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFBSLS);
            			}
            		
        			sb.append("|");
        		
        				if(RFTRND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFTRND);
            			}
            		
        			sb.append("|");
        		
        				if(RFATRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFATRN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFCUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFLPWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLPWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLNWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLNWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAXS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAXS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMINS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMINS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPPCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPPCT);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAX);
            			}
            		
        			sb.append("|");
        		
        				if(RFMIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMIN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWP);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRVPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRVPR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSAM);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT4);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK4);
            			}
            		
        			sb.append("|");
        		
        				if(RFMXSS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMXSS);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSDY);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFRATT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRATT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTRT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSCUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(RFCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(RFSCLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSCLS);
            			}
            		
        			sb.append("|");
        		
        				if(RFWFC1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC1);
            			}
            		
        			sb.append("|");
        		
        				if(RFWFC2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC2);
            			}
            		
        			sb.append("|");
        		
        				if(RFPSWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPSWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFSLFC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSLFC);
            			}
            		
        			sb.append("|");
        		
        				if(RFENCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFENDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENDT);
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
    public int compareTo(RPLPRFStruct other) {

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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[0];

	
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

				
			    public BigDecimal ISTORE;

				public BigDecimal getISTORE () {
					return this.ISTORE;
				}

				public Boolean ISTOREIsNullable(){
				    return true;
				}
				public Boolean ISTOREIsKey(){
				    return false;
				}
				public Integer ISTORELength(){
				    return null;
				}
				public Integer ISTOREPrecision(){
				    return null;
				}
				public String ISTOREDefault(){
				
					return "";
				
				}
				public String ISTOREComment(){
				
				    return "";
				
				}
				public String ISTOREPattern(){
				
					return "";
				
				}
				public String ISTOREOriginalDbColumnName(){
				
					return "ISTORE";
				
				}

				
			    public BigDecimal RFSTCN;

				public BigDecimal getRFSTCN () {
					return this.RFSTCN;
				}

				public Boolean RFSTCNIsNullable(){
				    return true;
				}
				public Boolean RFSTCNIsKey(){
				    return false;
				}
				public Integer RFSTCNLength(){
				    return null;
				}
				public Integer RFSTCNPrecision(){
				    return null;
				}
				public String RFSTCNDefault(){
				
					return "";
				
				}
				public String RFSTCNComment(){
				
				    return "";
				
				}
				public String RFSTCNPattern(){
				
					return "";
				
				}
				public String RFSTCNOriginalDbColumnName(){
				
					return "RFSTCN";
				
				}

				
			    public BigDecimal RFSTDT;

				public BigDecimal getRFSTDT () {
					return this.RFSTDT;
				}

				public Boolean RFSTDTIsNullable(){
				    return true;
				}
				public Boolean RFSTDTIsKey(){
				    return false;
				}
				public Integer RFSTDTLength(){
				    return null;
				}
				public Integer RFSTDTPrecision(){
				    return null;
				}
				public String RFSTDTDefault(){
				
					return "";
				
				}
				public String RFSTDTComment(){
				
				    return "";
				
				}
				public String RFSTDTPattern(){
				
					return "";
				
				}
				public String RFSTDTOriginalDbColumnName(){
				
					return "RFSTDT";
				
				}

				
			    public BigDecimal RFOPCN;

				public BigDecimal getRFOPCN () {
					return this.RFOPCN;
				}

				public Boolean RFOPCNIsNullable(){
				    return true;
				}
				public Boolean RFOPCNIsKey(){
				    return false;
				}
				public Integer RFOPCNLength(){
				    return null;
				}
				public Integer RFOPCNPrecision(){
				    return null;
				}
				public String RFOPCNDefault(){
				
					return "";
				
				}
				public String RFOPCNComment(){
				
				    return "";
				
				}
				public String RFOPCNPattern(){
				
					return "";
				
				}
				public String RFOPCNOriginalDbColumnName(){
				
					return "RFOPCN";
				
				}

				
			    public BigDecimal RFOPDT;

				public BigDecimal getRFOPDT () {
					return this.RFOPDT;
				}

				public Boolean RFOPDTIsNullable(){
				    return true;
				}
				public Boolean RFOPDTIsKey(){
				    return false;
				}
				public Integer RFOPDTLength(){
				    return null;
				}
				public Integer RFOPDTPrecision(){
				    return null;
				}
				public String RFOPDTDefault(){
				
					return "";
				
				}
				public String RFOPDTComment(){
				
				    return "";
				
				}
				public String RFOPDTPattern(){
				
					return "";
				
				}
				public String RFOPDTOriginalDbColumnName(){
				
					return "RFOPDT";
				
				}

				
			    public String RFPROF;

				public String getRFPROF () {
					return this.RFPROF;
				}

				public Boolean RFPROFIsNullable(){
				    return true;
				}
				public Boolean RFPROFIsKey(){
				    return false;
				}
				public Integer RFPROFLength(){
				    return null;
				}
				public Integer RFPROFPrecision(){
				    return null;
				}
				public String RFPROFDefault(){
				
					return null;
				
				}
				public String RFPROFComment(){
				
				    return "";
				
				}
				public String RFPROFPattern(){
				
					return "";
				
				}
				public String RFPROFOriginalDbColumnName(){
				
					return "RFPROF";
				
				}

				
			    public String RFRPCD;

				public String getRFRPCD () {
					return this.RFRPCD;
				}

				public Boolean RFRPCDIsNullable(){
				    return true;
				}
				public Boolean RFRPCDIsKey(){
				    return false;
				}
				public Integer RFRPCDLength(){
				    return null;
				}
				public Integer RFRPCDPrecision(){
				    return null;
				}
				public String RFRPCDDefault(){
				
					return null;
				
				}
				public String RFRPCDComment(){
				
				    return "";
				
				}
				public String RFRPCDPattern(){
				
					return "";
				
				}
				public String RFRPCDOriginalDbColumnName(){
				
					return "RFRPCD";
				
				}

				
			    public BigDecimal RFANUM;

				public BigDecimal getRFANUM () {
					return this.RFANUM;
				}

				public Boolean RFANUMIsNullable(){
				    return true;
				}
				public Boolean RFANUMIsKey(){
				    return false;
				}
				public Integer RFANUMLength(){
				    return null;
				}
				public Integer RFANUMPrecision(){
				    return null;
				}
				public String RFANUMDefault(){
				
					return "";
				
				}
				public String RFANUMComment(){
				
				    return "";
				
				}
				public String RFANUMPattern(){
				
					return "";
				
				}
				public String RFANUMOriginalDbColumnName(){
				
					return "RFANUM";
				
				}

				
			    public BigDecimal RFSNUM;

				public BigDecimal getRFSNUM () {
					return this.RFSNUM;
				}

				public Boolean RFSNUMIsNullable(){
				    return true;
				}
				public Boolean RFSNUMIsKey(){
				    return false;
				}
				public Integer RFSNUMLength(){
				    return null;
				}
				public Integer RFSNUMPrecision(){
				    return null;
				}
				public String RFSNUMDefault(){
				
					return "";
				
				}
				public String RFSNUMComment(){
				
				    return "";
				
				}
				public String RFSNUMPattern(){
				
					return "";
				
				}
				public String RFSNUMOriginalDbColumnName(){
				
					return "RFSNUM";
				
				}

				
			    public String RFDSCD;

				public String getRFDSCD () {
					return this.RFDSCD;
				}

				public Boolean RFDSCDIsNullable(){
				    return true;
				}
				public Boolean RFDSCDIsKey(){
				    return false;
				}
				public Integer RFDSCDLength(){
				    return null;
				}
				public Integer RFDSCDPrecision(){
				    return null;
				}
				public String RFDSCDDefault(){
				
					return null;
				
				}
				public String RFDSCDComment(){
				
				    return "";
				
				}
				public String RFDSCDPattern(){
				
					return "";
				
				}
				public String RFDSCDOriginalDbColumnName(){
				
					return "RFDSCD";
				
				}

				
			    public BigDecimal RFREPL;

				public BigDecimal getRFREPL () {
					return this.RFREPL;
				}

				public Boolean RFREPLIsNullable(){
				    return true;
				}
				public Boolean RFREPLIsKey(){
				    return false;
				}
				public Integer RFREPLLength(){
				    return null;
				}
				public Integer RFREPLPrecision(){
				    return null;
				}
				public String RFREPLDefault(){
				
					return "";
				
				}
				public String RFREPLComment(){
				
				    return "";
				
				}
				public String RFREPLPattern(){
				
					return "";
				
				}
				public String RFREPLOriginalDbColumnName(){
				
					return "RFREPL";
				
				}

				
			    public String RFDIST;

				public String getRFDIST () {
					return this.RFDIST;
				}

				public Boolean RFDISTIsNullable(){
				    return true;
				}
				public Boolean RFDISTIsKey(){
				    return false;
				}
				public Integer RFDISTLength(){
				    return null;
				}
				public Integer RFDISTPrecision(){
				    return null;
				}
				public String RFDISTDefault(){
				
					return "";
				
				}
				public String RFDISTComment(){
				
				    return "";
				
				}
				public String RFDISTPattern(){
				
					return "";
				
				}
				public String RFDISTOriginalDbColumnName(){
				
					return "RFDIST";
				
				}

				
			    public BigDecimal RFMSTK;

				public BigDecimal getRFMSTK () {
					return this.RFMSTK;
				}

				public Boolean RFMSTKIsNullable(){
				    return true;
				}
				public Boolean RFMSTKIsKey(){
				    return false;
				}
				public Integer RFMSTKLength(){
				    return null;
				}
				public Integer RFMSTKPrecision(){
				    return null;
				}
				public String RFMSTKDefault(){
				
					return "";
				
				}
				public String RFMSTKComment(){
				
				    return "";
				
				}
				public String RFMSTKPattern(){
				
					return "";
				
				}
				public String RFMSTKOriginalDbColumnName(){
				
					return "RFMSTK";
				
				}

				
			    public BigDecimal RFDSPY;

				public BigDecimal getRFDSPY () {
					return this.RFDSPY;
				}

				public Boolean RFDSPYIsNullable(){
				    return true;
				}
				public Boolean RFDSPYIsKey(){
				    return false;
				}
				public Integer RFDSPYLength(){
				    return null;
				}
				public Integer RFDSPYPrecision(){
				    return null;
				}
				public String RFDSPYDefault(){
				
					return "";
				
				}
				public String RFDSPYComment(){
				
				    return "";
				
				}
				public String RFDSPYPattern(){
				
					return "";
				
				}
				public String RFDSPYOriginalDbColumnName(){
				
					return "RFDSPY";
				
				}

				
			    public String RFMCOD;

				public String getRFMCOD () {
					return this.RFMCOD;
				}

				public Boolean RFMCODIsNullable(){
				    return true;
				}
				public Boolean RFMCODIsKey(){
				    return false;
				}
				public Integer RFMCODLength(){
				    return null;
				}
				public Integer RFMCODPrecision(){
				    return null;
				}
				public String RFMCODDefault(){
				
					return "";
				
				}
				public String RFMCODComment(){
				
				    return "";
				
				}
				public String RFMCODPattern(){
				
					return "";
				
				}
				public String RFMCODOriginalDbColumnName(){
				
					return "RFMCOD";
				
				}

				
			    public BigDecimal RFWHSE;

				public BigDecimal getRFWHSE () {
					return this.RFWHSE;
				}

				public Boolean RFWHSEIsNullable(){
				    return true;
				}
				public Boolean RFWHSEIsKey(){
				    return false;
				}
				public Integer RFWHSELength(){
				    return null;
				}
				public Integer RFWHSEPrecision(){
				    return null;
				}
				public String RFWHSEDefault(){
				
					return "";
				
				}
				public String RFWHSEComment(){
				
				    return "";
				
				}
				public String RFWHSEPattern(){
				
					return "";
				
				}
				public String RFWHSEOriginalDbColumnName(){
				
					return "RFWHSE";
				
				}

				
			    public BigDecimal RFFDCN;

				public BigDecimal getRFFDCN () {
					return this.RFFDCN;
				}

				public Boolean RFFDCNIsNullable(){
				    return true;
				}
				public Boolean RFFDCNIsKey(){
				    return false;
				}
				public Integer RFFDCNLength(){
				    return null;
				}
				public Integer RFFDCNPrecision(){
				    return null;
				}
				public String RFFDCNDefault(){
				
					return "";
				
				}
				public String RFFDCNComment(){
				
				    return "";
				
				}
				public String RFFDCNPattern(){
				
					return "";
				
				}
				public String RFFDCNOriginalDbColumnName(){
				
					return "RFFDCN";
				
				}

				
			    public BigDecimal RFFDDT;

				public BigDecimal getRFFDDT () {
					return this.RFFDDT;
				}

				public Boolean RFFDDTIsNullable(){
				    return true;
				}
				public Boolean RFFDDTIsKey(){
				    return false;
				}
				public Integer RFFDDTLength(){
				    return null;
				}
				public Integer RFFDDTPrecision(){
				    return null;
				}
				public String RFFDDTDefault(){
				
					return "";
				
				}
				public String RFFDDTComment(){
				
				    return "";
				
				}
				public String RFFDDTPattern(){
				
					return "";
				
				}
				public String RFFDDTOriginalDbColumnName(){
				
					return "RFFDDT";
				
				}

				
			    public BigDecimal RFSSTR;

				public BigDecimal getRFSSTR () {
					return this.RFSSTR;
				}

				public Boolean RFSSTRIsNullable(){
				    return true;
				}
				public Boolean RFSSTRIsKey(){
				    return false;
				}
				public Integer RFSSTRLength(){
				    return null;
				}
				public Integer RFSSTRPrecision(){
				    return null;
				}
				public String RFSSTRDefault(){
				
					return "";
				
				}
				public String RFSSTRComment(){
				
				    return "";
				
				}
				public String RFSSTRPattern(){
				
					return "";
				
				}
				public String RFSSTROriginalDbColumnName(){
				
					return "RFSSTR";
				
				}

				
			    public BigDecimal RFSSKU;

				public BigDecimal getRFSSKU () {
					return this.RFSSKU;
				}

				public Boolean RFSSKUIsNullable(){
				    return true;
				}
				public Boolean RFSSKUIsKey(){
				    return false;
				}
				public Integer RFSSKULength(){
				    return null;
				}
				public Integer RFSSKUPrecision(){
				    return null;
				}
				public String RFSSKUDefault(){
				
					return "";
				
				}
				public String RFSSKUComment(){
				
				    return "";
				
				}
				public String RFSSKUPattern(){
				
					return "";
				
				}
				public String RFSSKUOriginalDbColumnName(){
				
					return "RFSSKU";
				
				}

				
			    public BigDecimal RFVWKS;

				public BigDecimal getRFVWKS () {
					return this.RFVWKS;
				}

				public Boolean RFVWKSIsNullable(){
				    return true;
				}
				public Boolean RFVWKSIsKey(){
				    return false;
				}
				public Integer RFVWKSLength(){
				    return null;
				}
				public Integer RFVWKSPrecision(){
				    return null;
				}
				public String RFVWKSDefault(){
				
					return "";
				
				}
				public String RFVWKSComment(){
				
				    return "";
				
				}
				public String RFVWKSPattern(){
				
					return "";
				
				}
				public String RFVWKSOriginalDbColumnName(){
				
					return "RFVWKS";
				
				}

				
			    public BigDecimal RFBSLS;

				public BigDecimal getRFBSLS () {
					return this.RFBSLS;
				}

				public Boolean RFBSLSIsNullable(){
				    return true;
				}
				public Boolean RFBSLSIsKey(){
				    return false;
				}
				public Integer RFBSLSLength(){
				    return null;
				}
				public Integer RFBSLSPrecision(){
				    return null;
				}
				public String RFBSLSDefault(){
				
					return "";
				
				}
				public String RFBSLSComment(){
				
				    return "";
				
				}
				public String RFBSLSPattern(){
				
					return "";
				
				}
				public String RFBSLSOriginalDbColumnName(){
				
					return "RFBSLS";
				
				}

				
			    public BigDecimal RFTRND;

				public BigDecimal getRFTRND () {
					return this.RFTRND;
				}

				public Boolean RFTRNDIsNullable(){
				    return true;
				}
				public Boolean RFTRNDIsKey(){
				    return false;
				}
				public Integer RFTRNDLength(){
				    return null;
				}
				public Integer RFTRNDPrecision(){
				    return null;
				}
				public String RFTRNDDefault(){
				
					return "";
				
				}
				public String RFTRNDComment(){
				
				    return "";
				
				}
				public String RFTRNDPattern(){
				
					return "";
				
				}
				public String RFTRNDOriginalDbColumnName(){
				
					return "RFTRND";
				
				}

				
			    public BigDecimal RFATRN;

				public BigDecimal getRFATRN () {
					return this.RFATRN;
				}

				public Boolean RFATRNIsNullable(){
				    return true;
				}
				public Boolean RFATRNIsKey(){
				    return false;
				}
				public Integer RFATRNLength(){
				    return null;
				}
				public Integer RFATRNPrecision(){
				    return null;
				}
				public String RFATRNDefault(){
				
					return "";
				
				}
				public String RFATRNComment(){
				
				    return "";
				
				}
				public String RFATRNPattern(){
				
					return "";
				
				}
				public String RFATRNOriginalDbColumnName(){
				
					return "RFATRN";
				
				}

				
			    public BigDecimal RFFCUN;

				public BigDecimal getRFFCUN () {
					return this.RFFCUN;
				}

				public Boolean RFFCUNIsNullable(){
				    return true;
				}
				public Boolean RFFCUNIsKey(){
				    return false;
				}
				public Integer RFFCUNLength(){
				    return null;
				}
				public Integer RFFCUNPrecision(){
				    return null;
				}
				public String RFFCUNDefault(){
				
					return "";
				
				}
				public String RFFCUNComment(){
				
				    return "";
				
				}
				public String RFFCUNPattern(){
				
					return "";
				
				}
				public String RFFCUNOriginalDbColumnName(){
				
					return "RFFCUN";
				
				}

				
			    public BigDecimal RFLPWS;

				public BigDecimal getRFLPWS () {
					return this.RFLPWS;
				}

				public Boolean RFLPWSIsNullable(){
				    return true;
				}
				public Boolean RFLPWSIsKey(){
				    return false;
				}
				public Integer RFLPWSLength(){
				    return null;
				}
				public Integer RFLPWSPrecision(){
				    return null;
				}
				public String RFLPWSDefault(){
				
					return "";
				
				}
				public String RFLPWSComment(){
				
				    return "";
				
				}
				public String RFLPWSPattern(){
				
					return "";
				
				}
				public String RFLPWSOriginalDbColumnName(){
				
					return "RFLPWS";
				
				}

				
			    public BigDecimal RFLNWS;

				public BigDecimal getRFLNWS () {
					return this.RFLNWS;
				}

				public Boolean RFLNWSIsNullable(){
				    return true;
				}
				public Boolean RFLNWSIsKey(){
				    return false;
				}
				public Integer RFLNWSLength(){
				    return null;
				}
				public Integer RFLNWSPrecision(){
				    return null;
				}
				public String RFLNWSDefault(){
				
					return "";
				
				}
				public String RFLNWSComment(){
				
				    return "";
				
				}
				public String RFLNWSPattern(){
				
					return "";
				
				}
				public String RFLNWSOriginalDbColumnName(){
				
					return "RFLNWS";
				
				}

				
			    public BigDecimal RFLEAD;

				public BigDecimal getRFLEAD () {
					return this.RFLEAD;
				}

				public Boolean RFLEADIsNullable(){
				    return true;
				}
				public Boolean RFLEADIsKey(){
				    return false;
				}
				public Integer RFLEADLength(){
				    return null;
				}
				public Integer RFLEADPrecision(){
				    return null;
				}
				public String RFLEADDefault(){
				
					return "";
				
				}
				public String RFLEADComment(){
				
				    return "";
				
				}
				public String RFLEADPattern(){
				
					return "";
				
				}
				public String RFLEADOriginalDbColumnName(){
				
					return "RFLEAD";
				
				}

				
			    public BigDecimal RFMAXS;

				public BigDecimal getRFMAXS () {
					return this.RFMAXS;
				}

				public Boolean RFMAXSIsNullable(){
				    return true;
				}
				public Boolean RFMAXSIsKey(){
				    return false;
				}
				public Integer RFMAXSLength(){
				    return null;
				}
				public Integer RFMAXSPrecision(){
				    return null;
				}
				public String RFMAXSDefault(){
				
					return "";
				
				}
				public String RFMAXSComment(){
				
				    return "";
				
				}
				public String RFMAXSPattern(){
				
					return "";
				
				}
				public String RFMAXSOriginalDbColumnName(){
				
					return "RFMAXS";
				
				}

				
			    public BigDecimal RFMINS;

				public BigDecimal getRFMINS () {
					return this.RFMINS;
				}

				public Boolean RFMINSIsNullable(){
				    return true;
				}
				public Boolean RFMINSIsKey(){
				    return false;
				}
				public Integer RFMINSLength(){
				    return null;
				}
				public Integer RFMINSPrecision(){
				    return null;
				}
				public String RFMINSDefault(){
				
					return "";
				
				}
				public String RFMINSComment(){
				
				    return "";
				
				}
				public String RFMINSPattern(){
				
					return "";
				
				}
				public String RFMINSOriginalDbColumnName(){
				
					return "RFMINS";
				
				}

				
			    public BigDecimal RFMRAT;

				public BigDecimal getRFMRAT () {
					return this.RFMRAT;
				}

				public Boolean RFMRATIsNullable(){
				    return true;
				}
				public Boolean RFMRATIsKey(){
				    return false;
				}
				public Integer RFMRATLength(){
				    return null;
				}
				public Integer RFMRATPrecision(){
				    return null;
				}
				public String RFMRATDefault(){
				
					return "";
				
				}
				public String RFMRATComment(){
				
				    return "";
				
				}
				public String RFMRATPattern(){
				
					return "";
				
				}
				public String RFMRATOriginalDbColumnName(){
				
					return "RFMRAT";
				
				}

				
			    public BigDecimal RFPRAT;

				public BigDecimal getRFPRAT () {
					return this.RFPRAT;
				}

				public Boolean RFPRATIsNullable(){
				    return true;
				}
				public Boolean RFPRATIsKey(){
				    return false;
				}
				public Integer RFPRATLength(){
				    return null;
				}
				public Integer RFPRATPrecision(){
				    return null;
				}
				public String RFPRATDefault(){
				
					return "";
				
				}
				public String RFPRATComment(){
				
				    return "";
				
				}
				public String RFPRATPattern(){
				
					return "";
				
				}
				public String RFPRATOriginalDbColumnName(){
				
					return "RFPRAT";
				
				}

				
			    public BigDecimal RFPPCT;

				public BigDecimal getRFPPCT () {
					return this.RFPPCT;
				}

				public Boolean RFPPCTIsNullable(){
				    return true;
				}
				public Boolean RFPPCTIsKey(){
				    return false;
				}
				public Integer RFPPCTLength(){
				    return null;
				}
				public Integer RFPPCTPrecision(){
				    return null;
				}
				public String RFPPCTDefault(){
				
					return "";
				
				}
				public String RFPPCTComment(){
				
				    return "";
				
				}
				public String RFPPCTPattern(){
				
					return "";
				
				}
				public String RFPPCTOriginalDbColumnName(){
				
					return "RFPPCT";
				
				}

				
			    public BigDecimal RFMAX;

				public BigDecimal getRFMAX () {
					return this.RFMAX;
				}

				public Boolean RFMAXIsNullable(){
				    return true;
				}
				public Boolean RFMAXIsKey(){
				    return false;
				}
				public Integer RFMAXLength(){
				    return null;
				}
				public Integer RFMAXPrecision(){
				    return null;
				}
				public String RFMAXDefault(){
				
					return "";
				
				}
				public String RFMAXComment(){
				
				    return "";
				
				}
				public String RFMAXPattern(){
				
					return "";
				
				}
				public String RFMAXOriginalDbColumnName(){
				
					return "RFMAX";
				
				}

				
			    public BigDecimal RFMIN;

				public BigDecimal getRFMIN () {
					return this.RFMIN;
				}

				public Boolean RFMINIsNullable(){
				    return true;
				}
				public Boolean RFMINIsKey(){
				    return false;
				}
				public Integer RFMINLength(){
				    return null;
				}
				public Integer RFMINPrecision(){
				    return null;
				}
				public String RFMINDefault(){
				
					return "";
				
				}
				public String RFMINComment(){
				
				    return "";
				
				}
				public String RFMINPattern(){
				
					return "";
				
				}
				public String RFMINOriginalDbColumnName(){
				
					return "RFMIN";
				
				}

				
			    public BigDecimal RFASWP;

				public BigDecimal getRFASWP () {
					return this.RFASWP;
				}

				public Boolean RFASWPIsNullable(){
				    return true;
				}
				public Boolean RFASWPIsKey(){
				    return false;
				}
				public Integer RFASWPLength(){
				    return null;
				}
				public Integer RFASWPPrecision(){
				    return null;
				}
				public String RFASWPDefault(){
				
					return "";
				
				}
				public String RFASWPComment(){
				
				    return "";
				
				}
				public String RFASWPPattern(){
				
					return "";
				
				}
				public String RFASWPOriginalDbColumnName(){
				
					return "RFASWP";
				
				}

				
			    public BigDecimal RFASWN;

				public BigDecimal getRFASWN () {
					return this.RFASWN;
				}

				public Boolean RFASWNIsNullable(){
				    return true;
				}
				public Boolean RFASWNIsKey(){
				    return false;
				}
				public Integer RFASWNLength(){
				    return null;
				}
				public Integer RFASWNPrecision(){
				    return null;
				}
				public String RFASWNDefault(){
				
					return "";
				
				}
				public String RFASWNComment(){
				
				    return "";
				
				}
				public String RFASWNPattern(){
				
					return "";
				
				}
				public String RFASWNOriginalDbColumnName(){
				
					return "RFASWN";
				
				}

				
			    public BigDecimal RFASWH;

				public BigDecimal getRFASWH () {
					return this.RFASWH;
				}

				public Boolean RFASWHIsNullable(){
				    return true;
				}
				public Boolean RFASWHIsKey(){
				    return false;
				}
				public Integer RFASWHLength(){
				    return null;
				}
				public Integer RFASWHPrecision(){
				    return null;
				}
				public String RFASWHDefault(){
				
					return "";
				
				}
				public String RFASWHComment(){
				
				    return "";
				
				}
				public String RFASWHPattern(){
				
					return "";
				
				}
				public String RFASWHOriginalDbColumnName(){
				
					return "RFASWH";
				
				}

				
			    public BigDecimal RFASWF;

				public BigDecimal getRFASWF () {
					return this.RFASWF;
				}

				public Boolean RFASWFIsNullable(){
				    return true;
				}
				public Boolean RFASWFIsKey(){
				    return false;
				}
				public Integer RFASWFLength(){
				    return null;
				}
				public Integer RFASWFPrecision(){
				    return null;
				}
				public String RFASWFDefault(){
				
					return "";
				
				}
				public String RFASWFComment(){
				
				    return "";
				
				}
				public String RFASWFPattern(){
				
					return "";
				
				}
				public String RFASWFOriginalDbColumnName(){
				
					return "RFASWF";
				
				}

				
			    public BigDecimal RFRVPR;

				public BigDecimal getRFRVPR () {
					return this.RFRVPR;
				}

				public Boolean RFRVPRIsNullable(){
				    return true;
				}
				public Boolean RFRVPRIsKey(){
				    return false;
				}
				public Integer RFRVPRLength(){
				    return null;
				}
				public Integer RFRVPRPrecision(){
				    return null;
				}
				public String RFRVPRDefault(){
				
					return "";
				
				}
				public String RFRVPRComment(){
				
				    return "";
				
				}
				public String RFRVPRPattern(){
				
					return "";
				
				}
				public String RFRVPROriginalDbColumnName(){
				
					return "RFRVPR";
				
				}

				
			    public BigDecimal RFSAM;

				public BigDecimal getRFSAM () {
					return this.RFSAM;
				}

				public Boolean RFSAMIsNullable(){
				    return true;
				}
				public Boolean RFSAMIsKey(){
				    return false;
				}
				public Integer RFSAMLength(){
				    return null;
				}
				public Integer RFSAMPrecision(){
				    return null;
				}
				public String RFSAMDefault(){
				
					return "";
				
				}
				public String RFSAMComment(){
				
				    return "";
				
				}
				public String RFSAMPattern(){
				
					return "";
				
				}
				public String RFSAMOriginalDbColumnName(){
				
					return "RFSAM";
				
				}

				
			    public BigDecimal RFRAT1;

				public BigDecimal getRFRAT1 () {
					return this.RFRAT1;
				}

				public Boolean RFRAT1IsNullable(){
				    return true;
				}
				public Boolean RFRAT1IsKey(){
				    return false;
				}
				public Integer RFRAT1Length(){
				    return null;
				}
				public Integer RFRAT1Precision(){
				    return null;
				}
				public String RFRAT1Default(){
				
					return "";
				
				}
				public String RFRAT1Comment(){
				
				    return "";
				
				}
				public String RFRAT1Pattern(){
				
					return "";
				
				}
				public String RFRAT1OriginalDbColumnName(){
				
					return "RFRAT1";
				
				}

				
			    public String RFRNK1;

				public String getRFRNK1 () {
					return this.RFRNK1;
				}

				public Boolean RFRNK1IsNullable(){
				    return true;
				}
				public Boolean RFRNK1IsKey(){
				    return false;
				}
				public Integer RFRNK1Length(){
				    return null;
				}
				public Integer RFRNK1Precision(){
				    return null;
				}
				public String RFRNK1Default(){
				
					return "";
				
				}
				public String RFRNK1Comment(){
				
				    return "";
				
				}
				public String RFRNK1Pattern(){
				
					return "";
				
				}
				public String RFRNK1OriginalDbColumnName(){
				
					return "RFRNK1";
				
				}

				
			    public BigDecimal RFRAT2;

				public BigDecimal getRFRAT2 () {
					return this.RFRAT2;
				}

				public Boolean RFRAT2IsNullable(){
				    return true;
				}
				public Boolean RFRAT2IsKey(){
				    return false;
				}
				public Integer RFRAT2Length(){
				    return null;
				}
				public Integer RFRAT2Precision(){
				    return null;
				}
				public String RFRAT2Default(){
				
					return "";
				
				}
				public String RFRAT2Comment(){
				
				    return "";
				
				}
				public String RFRAT2Pattern(){
				
					return "";
				
				}
				public String RFRAT2OriginalDbColumnName(){
				
					return "RFRAT2";
				
				}

				
			    public String RFRNK2;

				public String getRFRNK2 () {
					return this.RFRNK2;
				}

				public Boolean RFRNK2IsNullable(){
				    return true;
				}
				public Boolean RFRNK2IsKey(){
				    return false;
				}
				public Integer RFRNK2Length(){
				    return null;
				}
				public Integer RFRNK2Precision(){
				    return null;
				}
				public String RFRNK2Default(){
				
					return "";
				
				}
				public String RFRNK2Comment(){
				
				    return "";
				
				}
				public String RFRNK2Pattern(){
				
					return "";
				
				}
				public String RFRNK2OriginalDbColumnName(){
				
					return "RFRNK2";
				
				}

				
			    public BigDecimal RFRAT3;

				public BigDecimal getRFRAT3 () {
					return this.RFRAT3;
				}

				public Boolean RFRAT3IsNullable(){
				    return true;
				}
				public Boolean RFRAT3IsKey(){
				    return false;
				}
				public Integer RFRAT3Length(){
				    return null;
				}
				public Integer RFRAT3Precision(){
				    return null;
				}
				public String RFRAT3Default(){
				
					return "";
				
				}
				public String RFRAT3Comment(){
				
				    return "";
				
				}
				public String RFRAT3Pattern(){
				
					return "";
				
				}
				public String RFRAT3OriginalDbColumnName(){
				
					return "RFRAT3";
				
				}

				
			    public String RFRNK3;

				public String getRFRNK3 () {
					return this.RFRNK3;
				}

				public Boolean RFRNK3IsNullable(){
				    return true;
				}
				public Boolean RFRNK3IsKey(){
				    return false;
				}
				public Integer RFRNK3Length(){
				    return null;
				}
				public Integer RFRNK3Precision(){
				    return null;
				}
				public String RFRNK3Default(){
				
					return "";
				
				}
				public String RFRNK3Comment(){
				
				    return "";
				
				}
				public String RFRNK3Pattern(){
				
					return "";
				
				}
				public String RFRNK3OriginalDbColumnName(){
				
					return "RFRNK3";
				
				}

				
			    public BigDecimal RFRAT4;

				public BigDecimal getRFRAT4 () {
					return this.RFRAT4;
				}

				public Boolean RFRAT4IsNullable(){
				    return true;
				}
				public Boolean RFRAT4IsKey(){
				    return false;
				}
				public Integer RFRAT4Length(){
				    return null;
				}
				public Integer RFRAT4Precision(){
				    return null;
				}
				public String RFRAT4Default(){
				
					return "";
				
				}
				public String RFRAT4Comment(){
				
				    return "";
				
				}
				public String RFRAT4Pattern(){
				
					return "";
				
				}
				public String RFRAT4OriginalDbColumnName(){
				
					return "RFRAT4";
				
				}

				
			    public String RFRNK4;

				public String getRFRNK4 () {
					return this.RFRNK4;
				}

				public Boolean RFRNK4IsNullable(){
				    return true;
				}
				public Boolean RFRNK4IsKey(){
				    return false;
				}
				public Integer RFRNK4Length(){
				    return null;
				}
				public Integer RFRNK4Precision(){
				    return null;
				}
				public String RFRNK4Default(){
				
					return "";
				
				}
				public String RFRNK4Comment(){
				
				    return "";
				
				}
				public String RFRNK4Pattern(){
				
					return "";
				
				}
				public String RFRNK4OriginalDbColumnName(){
				
					return "RFRNK4";
				
				}

				
			    public BigDecimal RFMXSS;

				public BigDecimal getRFMXSS () {
					return this.RFMXSS;
				}

				public Boolean RFMXSSIsNullable(){
				    return true;
				}
				public Boolean RFMXSSIsKey(){
				    return false;
				}
				public Integer RFMXSSLength(){
				    return null;
				}
				public Integer RFMXSSPrecision(){
				    return null;
				}
				public String RFMXSSDefault(){
				
					return "";
				
				}
				public String RFMXSSComment(){
				
				    return "";
				
				}
				public String RFMXSSPattern(){
				
					return "";
				
				}
				public String RFMXSSOriginalDbColumnName(){
				
					return "RFMXSS";
				
				}

				
			    public BigDecimal RFSSDY;

				public BigDecimal getRFSSDY () {
					return this.RFSSDY;
				}

				public Boolean RFSSDYIsNullable(){
				    return true;
				}
				public Boolean RFSSDYIsKey(){
				    return false;
				}
				public Integer RFSSDYLength(){
				    return null;
				}
				public Integer RFSSDYPrecision(){
				    return null;
				}
				public String RFSSDYDefault(){
				
					return "";
				
				}
				public String RFSSDYComment(){
				
				    return "";
				
				}
				public String RFSSDYPattern(){
				
					return "";
				
				}
				public String RFSSDYOriginalDbColumnName(){
				
					return "RFSSDY";
				
				}

				
			    public BigDecimal RFSSUN;

				public BigDecimal getRFSSUN () {
					return this.RFSSUN;
				}

				public Boolean RFSSUNIsNullable(){
				    return true;
				}
				public Boolean RFSSUNIsKey(){
				    return false;
				}
				public Integer RFSSUNLength(){
				    return null;
				}
				public Integer RFSSUNPrecision(){
				    return null;
				}
				public String RFSSUNDefault(){
				
					return "";
				
				}
				public String RFSSUNComment(){
				
				    return "";
				
				}
				public String RFSSUNPattern(){
				
					return "";
				
				}
				public String RFSSUNOriginalDbColumnName(){
				
					return "RFSSUN";
				
				}

				
			    public BigDecimal RFRATT;

				public BigDecimal getRFRATT () {
					return this.RFRATT;
				}

				public Boolean RFRATTIsNullable(){
				    return true;
				}
				public Boolean RFRATTIsKey(){
				    return false;
				}
				public Integer RFRATTLength(){
				    return null;
				}
				public Integer RFRATTPrecision(){
				    return null;
				}
				public String RFRATTDefault(){
				
					return "";
				
				}
				public String RFRATTComment(){
				
				    return "";
				
				}
				public String RFRATTPattern(){
				
					return "";
				
				}
				public String RFRATTOriginalDbColumnName(){
				
					return "RFRATT";
				
				}

				
			    public BigDecimal RFSTRT;

				public BigDecimal getRFSTRT () {
					return this.RFSTRT;
				}

				public Boolean RFSTRTIsNullable(){
				    return true;
				}
				public Boolean RFSTRTIsKey(){
				    return false;
				}
				public Integer RFSTRTLength(){
				    return null;
				}
				public Integer RFSTRTPrecision(){
				    return null;
				}
				public String RFSTRTDefault(){
				
					return "";
				
				}
				public String RFSTRTComment(){
				
				    return "";
				
				}
				public String RFSTRTPattern(){
				
					return "";
				
				}
				public String RFSTRTOriginalDbColumnName(){
				
					return "RFSTRT";
				
				}

				
			    public BigDecimal RFSDCN;

				public BigDecimal getRFSDCN () {
					return this.RFSDCN;
				}

				public Boolean RFSDCNIsNullable(){
				    return true;
				}
				public Boolean RFSDCNIsKey(){
				    return false;
				}
				public Integer RFSDCNLength(){
				    return null;
				}
				public Integer RFSDCNPrecision(){
				    return null;
				}
				public String RFSDCNDefault(){
				
					return "";
				
				}
				public String RFSDCNComment(){
				
				    return "";
				
				}
				public String RFSDCNPattern(){
				
					return "";
				
				}
				public String RFSDCNOriginalDbColumnName(){
				
					return "RFSDCN";
				
				}

				
			    public BigDecimal RFSDDT;

				public BigDecimal getRFSDDT () {
					return this.RFSDDT;
				}

				public Boolean RFSDDTIsNullable(){
				    return true;
				}
				public Boolean RFSDDTIsKey(){
				    return false;
				}
				public Integer RFSDDTLength(){
				    return null;
				}
				public Integer RFSDDTPrecision(){
				    return null;
				}
				public String RFSDDTDefault(){
				
					return "";
				
				}
				public String RFSDDTComment(){
				
				    return "";
				
				}
				public String RFSDDTPattern(){
				
					return "";
				
				}
				public String RFSDDTOriginalDbColumnName(){
				
					return "RFSDDT";
				
				}

				
			    public BigDecimal RFSCUN;

				public BigDecimal getRFSCUN () {
					return this.RFSCUN;
				}

				public Boolean RFSCUNIsNullable(){
				    return true;
				}
				public Boolean RFSCUNIsKey(){
				    return false;
				}
				public Integer RFSCUNLength(){
				    return null;
				}
				public Integer RFSCUNPrecision(){
				    return null;
				}
				public String RFSCUNDefault(){
				
					return "";
				
				}
				public String RFSCUNComment(){
				
				    return "";
				
				}
				public String RFSCUNPattern(){
				
					return "";
				
				}
				public String RFSCUNOriginalDbColumnName(){
				
					return "RFSCUN";
				
				}

				
			    public Double RFDEPT;

				public Double getRFDEPT () {
					return this.RFDEPT;
				}

				public Boolean RFDEPTIsNullable(){
				    return true;
				}
				public Boolean RFDEPTIsKey(){
				    return false;
				}
				public Integer RFDEPTLength(){
				    return null;
				}
				public Integer RFDEPTPrecision(){
				    return null;
				}
				public String RFDEPTDefault(){
				
					return "";
				
				}
				public String RFDEPTComment(){
				
				    return "";
				
				}
				public String RFDEPTPattern(){
				
					return "";
				
				}
				public String RFDEPTOriginalDbColumnName(){
				
					return "RFDEPT";
				
				}

				
			    public Double RFSDPT;

				public Double getRFSDPT () {
					return this.RFSDPT;
				}

				public Boolean RFSDPTIsNullable(){
				    return true;
				}
				public Boolean RFSDPTIsKey(){
				    return false;
				}
				public Integer RFSDPTLength(){
				    return null;
				}
				public Integer RFSDPTPrecision(){
				    return null;
				}
				public String RFSDPTDefault(){
				
					return "";
				
				}
				public String RFSDPTComment(){
				
				    return "";
				
				}
				public String RFSDPTPattern(){
				
					return "";
				
				}
				public String RFSDPTOriginalDbColumnName(){
				
					return "RFSDPT";
				
				}

				
			    public Double RFCLAS;

				public Double getRFCLAS () {
					return this.RFCLAS;
				}

				public Boolean RFCLASIsNullable(){
				    return true;
				}
				public Boolean RFCLASIsKey(){
				    return false;
				}
				public Integer RFCLASLength(){
				    return null;
				}
				public Integer RFCLASPrecision(){
				    return null;
				}
				public String RFCLASDefault(){
				
					return "";
				
				}
				public String RFCLASComment(){
				
				    return "";
				
				}
				public String RFCLASPattern(){
				
					return "";
				
				}
				public String RFCLASOriginalDbColumnName(){
				
					return "RFCLAS";
				
				}

				
			    public Double RFSCLS;

				public Double getRFSCLS () {
					return this.RFSCLS;
				}

				public Boolean RFSCLSIsNullable(){
				    return true;
				}
				public Boolean RFSCLSIsKey(){
				    return false;
				}
				public Integer RFSCLSLength(){
				    return null;
				}
				public Integer RFSCLSPrecision(){
				    return null;
				}
				public String RFSCLSDefault(){
				
					return "";
				
				}
				public String RFSCLSComment(){
				
				    return "";
				
				}
				public String RFSCLSPattern(){
				
					return "";
				
				}
				public String RFSCLSOriginalDbColumnName(){
				
					return "RFSCLS";
				
				}

				
			    public BigDecimal RFWFC1;

				public BigDecimal getRFWFC1 () {
					return this.RFWFC1;
				}

				public Boolean RFWFC1IsNullable(){
				    return true;
				}
				public Boolean RFWFC1IsKey(){
				    return false;
				}
				public Integer RFWFC1Length(){
				    return null;
				}
				public Integer RFWFC1Precision(){
				    return null;
				}
				public String RFWFC1Default(){
				
					return "";
				
				}
				public String RFWFC1Comment(){
				
				    return "";
				
				}
				public String RFWFC1Pattern(){
				
					return "";
				
				}
				public String RFWFC1OriginalDbColumnName(){
				
					return "RFWFC1";
				
				}

				
			    public BigDecimal RFWFC2;

				public BigDecimal getRFWFC2 () {
					return this.RFWFC2;
				}

				public Boolean RFWFC2IsNullable(){
				    return true;
				}
				public Boolean RFWFC2IsKey(){
				    return false;
				}
				public Integer RFWFC2Length(){
				    return null;
				}
				public Integer RFWFC2Precision(){
				    return null;
				}
				public String RFWFC2Default(){
				
					return "";
				
				}
				public String RFWFC2Comment(){
				
				    return "";
				
				}
				public String RFWFC2Pattern(){
				
					return "";
				
				}
				public String RFWFC2OriginalDbColumnName(){
				
					return "RFWFC2";
				
				}

				
			    public BigDecimal RFPSWH;

				public BigDecimal getRFPSWH () {
					return this.RFPSWH;
				}

				public Boolean RFPSWHIsNullable(){
				    return true;
				}
				public Boolean RFPSWHIsKey(){
				    return false;
				}
				public Integer RFPSWHLength(){
				    return null;
				}
				public Integer RFPSWHPrecision(){
				    return null;
				}
				public String RFPSWHDefault(){
				
					return "";
				
				}
				public String RFPSWHComment(){
				
				    return "";
				
				}
				public String RFPSWHPattern(){
				
					return "";
				
				}
				public String RFPSWHOriginalDbColumnName(){
				
					return "RFPSWH";
				
				}

				
			    public BigDecimal RFSLFC;

				public BigDecimal getRFSLFC () {
					return this.RFSLFC;
				}

				public Boolean RFSLFCIsNullable(){
				    return true;
				}
				public Boolean RFSLFCIsKey(){
				    return false;
				}
				public Integer RFSLFCLength(){
				    return null;
				}
				public Integer RFSLFCPrecision(){
				    return null;
				}
				public String RFSLFCDefault(){
				
					return "";
				
				}
				public String RFSLFCComment(){
				
				    return "";
				
				}
				public String RFSLFCPattern(){
				
					return "";
				
				}
				public String RFSLFCOriginalDbColumnName(){
				
					return "RFSLFC";
				
				}

				
			    public BigDecimal RFENCN;

				public BigDecimal getRFENCN () {
					return this.RFENCN;
				}

				public Boolean RFENCNIsNullable(){
				    return true;
				}
				public Boolean RFENCNIsKey(){
				    return false;
				}
				public Integer RFENCNLength(){
				    return null;
				}
				public Integer RFENCNPrecision(){
				    return null;
				}
				public String RFENCNDefault(){
				
					return "";
				
				}
				public String RFENCNComment(){
				
				    return "";
				
				}
				public String RFENCNPattern(){
				
					return "";
				
				}
				public String RFENCNOriginalDbColumnName(){
				
					return "RFENCN";
				
				}

				
			    public BigDecimal RFENDT;

				public BigDecimal getRFENDT () {
					return this.RFENDT;
				}

				public Boolean RFENDTIsNullable(){
				    return true;
				}
				public Boolean RFENDTIsKey(){
				    return false;
				}
				public Integer RFENDTLength(){
				    return null;
				}
				public Integer RFENDTPrecision(){
				    return null;
				}
				public String RFENDTDefault(){
				
					return "";
				
				}
				public String RFENDTComment(){
				
				    return "";
				
				}
				public String RFENDTPattern(){
				
					return "";
				
				}
				public String RFENDTOriginalDbColumnName(){
				
					return "RFENDT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFDEPT = null;
           				} else {
           			    	this.RFDEPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSDPT = null;
           				} else {
           			    	this.RFSDPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFCLAS = null;
           				} else {
           			    	this.RFCLAS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSCLS = null;
           				} else {
           			    	this.RFSCLS = dis.readDouble();
           				}
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.RFSTCN = (BigDecimal) dis.readObject();
					
						this.RFSTDT = (BigDecimal) dis.readObject();
					
						this.RFOPCN = (BigDecimal) dis.readObject();
					
						this.RFOPDT = (BigDecimal) dis.readObject();
					
					this.RFPROF = readString(dis);
					
					this.RFRPCD = readString(dis);
					
						this.RFANUM = (BigDecimal) dis.readObject();
					
						this.RFSNUM = (BigDecimal) dis.readObject();
					
					this.RFDSCD = readString(dis);
					
						this.RFREPL = (BigDecimal) dis.readObject();
					
					this.RFDIST = readString(dis);
					
						this.RFMSTK = (BigDecimal) dis.readObject();
					
						this.RFDSPY = (BigDecimal) dis.readObject();
					
					this.RFMCOD = readString(dis);
					
						this.RFWHSE = (BigDecimal) dis.readObject();
					
						this.RFFDCN = (BigDecimal) dis.readObject();
					
						this.RFFDDT = (BigDecimal) dis.readObject();
					
						this.RFSSTR = (BigDecimal) dis.readObject();
					
						this.RFSSKU = (BigDecimal) dis.readObject();
					
						this.RFVWKS = (BigDecimal) dis.readObject();
					
						this.RFBSLS = (BigDecimal) dis.readObject();
					
						this.RFTRND = (BigDecimal) dis.readObject();
					
						this.RFATRN = (BigDecimal) dis.readObject();
					
						this.RFFCUN = (BigDecimal) dis.readObject();
					
						this.RFLPWS = (BigDecimal) dis.readObject();
					
						this.RFLNWS = (BigDecimal) dis.readObject();
					
						this.RFLEAD = (BigDecimal) dis.readObject();
					
						this.RFMAXS = (BigDecimal) dis.readObject();
					
						this.RFMINS = (BigDecimal) dis.readObject();
					
						this.RFMRAT = (BigDecimal) dis.readObject();
					
						this.RFPRAT = (BigDecimal) dis.readObject();
					
						this.RFPPCT = (BigDecimal) dis.readObject();
					
						this.RFMAX = (BigDecimal) dis.readObject();
					
						this.RFMIN = (BigDecimal) dis.readObject();
					
						this.RFASWP = (BigDecimal) dis.readObject();
					
						this.RFASWN = (BigDecimal) dis.readObject();
					
						this.RFASWH = (BigDecimal) dis.readObject();
					
						this.RFASWF = (BigDecimal) dis.readObject();
					
						this.RFRVPR = (BigDecimal) dis.readObject();
					
						this.RFSAM = (BigDecimal) dis.readObject();
					
						this.RFRAT1 = (BigDecimal) dis.readObject();
					
					this.RFRNK1 = readString(dis);
					
						this.RFRAT2 = (BigDecimal) dis.readObject();
					
					this.RFRNK2 = readString(dis);
					
						this.RFRAT3 = (BigDecimal) dis.readObject();
					
					this.RFRNK3 = readString(dis);
					
						this.RFRAT4 = (BigDecimal) dis.readObject();
					
					this.RFRNK4 = readString(dis);
					
						this.RFMXSS = (BigDecimal) dis.readObject();
					
						this.RFSSDY = (BigDecimal) dis.readObject();
					
						this.RFSSUN = (BigDecimal) dis.readObject();
					
						this.RFRATT = (BigDecimal) dis.readObject();
					
						this.RFSTRT = (BigDecimal) dis.readObject();
					
						this.RFSDCN = (BigDecimal) dis.readObject();
					
						this.RFSDDT = (BigDecimal) dis.readObject();
					
						this.RFSCUN = (BigDecimal) dis.readObject();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFDEPT = null;
           				} else {
           			    	this.RFDEPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSDPT = null;
           				} else {
           			    	this.RFSDPT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFCLAS = null;
           				} else {
           			    	this.RFCLAS = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.RFSCLS = null;
           				} else {
           			    	this.RFSCLS = dis.readDouble();
           				}
					
						this.RFWFC1 = (BigDecimal) dis.readObject();
					
						this.RFWFC2 = (BigDecimal) dis.readObject();
					
						this.RFPSWH = (BigDecimal) dis.readObject();
					
						this.RFSLFC = (BigDecimal) dis.readObject();
					
						this.RFENCN = (BigDecimal) dis.readObject();
					
						this.RFENDT = (BigDecimal) dis.readObject();
					
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
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// Double
				
						if(this.RFDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFDEPT);
		            	}
					
					// Double
				
						if(this.RFSDPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSDPT);
		            	}
					
					// Double
				
						if(this.RFCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFCLAS);
		            	}
					
					// Double
				
						if(this.RFSCLS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSCLS);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ISTORE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFOPDT);
					
					// String
				
						writeString(this.RFPROF,dos);
					
					// String
				
						writeString(this.RFRPCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFANUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSNUM);
					
					// String
				
						writeString(this.RFDSCD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFREPL);
					
					// String
				
						writeString(this.RFDIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMSTK);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFDSPY);
					
					// String
				
						writeString(this.RFMCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWHSE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFVWKS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFBSLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFTRND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFATRN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFFCUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLPWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLNWS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAXS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMINS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPPCT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMIN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFASWF);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRVPR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSAM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT1);
					
					// String
				
						writeString(this.RFRNK1,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT2);
					
					// String
				
						writeString(this.RFRNK2,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT3);
					
					// String
				
						writeString(this.RFRNK3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRAT4);
					
					// String
				
						writeString(this.RFRNK4,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFMXSS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSSUN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFRATT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSTRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSDDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSCUN);
					
					// Double
				
						if(this.RFDEPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFDEPT);
		            	}
					
					// Double
				
						if(this.RFSDPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSDPT);
		            	}
					
					// Double
				
						if(this.RFCLAS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFCLAS);
		            	}
					
					// Double
				
						if(this.RFSCLS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.RFSCLS);
		            	}
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFWFC2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFPSWH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFSLFC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RFENDT);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",ISTORE="+String.valueOf(ISTORE));
		sb.append(",RFSTCN="+String.valueOf(RFSTCN));
		sb.append(",RFSTDT="+String.valueOf(RFSTDT));
		sb.append(",RFOPCN="+String.valueOf(RFOPCN));
		sb.append(",RFOPDT="+String.valueOf(RFOPDT));
		sb.append(",RFPROF="+RFPROF);
		sb.append(",RFRPCD="+RFRPCD);
		sb.append(",RFANUM="+String.valueOf(RFANUM));
		sb.append(",RFSNUM="+String.valueOf(RFSNUM));
		sb.append(",RFDSCD="+RFDSCD);
		sb.append(",RFREPL="+String.valueOf(RFREPL));
		sb.append(",RFDIST="+RFDIST);
		sb.append(",RFMSTK="+String.valueOf(RFMSTK));
		sb.append(",RFDSPY="+String.valueOf(RFDSPY));
		sb.append(",RFMCOD="+RFMCOD);
		sb.append(",RFWHSE="+String.valueOf(RFWHSE));
		sb.append(",RFFDCN="+String.valueOf(RFFDCN));
		sb.append(",RFFDDT="+String.valueOf(RFFDDT));
		sb.append(",RFSSTR="+String.valueOf(RFSSTR));
		sb.append(",RFSSKU="+String.valueOf(RFSSKU));
		sb.append(",RFVWKS="+String.valueOf(RFVWKS));
		sb.append(",RFBSLS="+String.valueOf(RFBSLS));
		sb.append(",RFTRND="+String.valueOf(RFTRND));
		sb.append(",RFATRN="+String.valueOf(RFATRN));
		sb.append(",RFFCUN="+String.valueOf(RFFCUN));
		sb.append(",RFLPWS="+String.valueOf(RFLPWS));
		sb.append(",RFLNWS="+String.valueOf(RFLNWS));
		sb.append(",RFLEAD="+String.valueOf(RFLEAD));
		sb.append(",RFMAXS="+String.valueOf(RFMAXS));
		sb.append(",RFMINS="+String.valueOf(RFMINS));
		sb.append(",RFMRAT="+String.valueOf(RFMRAT));
		sb.append(",RFPRAT="+String.valueOf(RFPRAT));
		sb.append(",RFPPCT="+String.valueOf(RFPPCT));
		sb.append(",RFMAX="+String.valueOf(RFMAX));
		sb.append(",RFMIN="+String.valueOf(RFMIN));
		sb.append(",RFASWP="+String.valueOf(RFASWP));
		sb.append(",RFASWN="+String.valueOf(RFASWN));
		sb.append(",RFASWH="+String.valueOf(RFASWH));
		sb.append(",RFASWF="+String.valueOf(RFASWF));
		sb.append(",RFRVPR="+String.valueOf(RFRVPR));
		sb.append(",RFSAM="+String.valueOf(RFSAM));
		sb.append(",RFRAT1="+String.valueOf(RFRAT1));
		sb.append(",RFRNK1="+RFRNK1);
		sb.append(",RFRAT2="+String.valueOf(RFRAT2));
		sb.append(",RFRNK2="+RFRNK2);
		sb.append(",RFRAT3="+String.valueOf(RFRAT3));
		sb.append(",RFRNK3="+RFRNK3);
		sb.append(",RFRAT4="+String.valueOf(RFRAT4));
		sb.append(",RFRNK4="+RFRNK4);
		sb.append(",RFMXSS="+String.valueOf(RFMXSS));
		sb.append(",RFSSDY="+String.valueOf(RFSSDY));
		sb.append(",RFSSUN="+String.valueOf(RFSSUN));
		sb.append(",RFRATT="+String.valueOf(RFRATT));
		sb.append(",RFSTRT="+String.valueOf(RFSTRT));
		sb.append(",RFSDCN="+String.valueOf(RFSDCN));
		sb.append(",RFSDDT="+String.valueOf(RFSDDT));
		sb.append(",RFSCUN="+String.valueOf(RFSCUN));
		sb.append(",RFDEPT="+String.valueOf(RFDEPT));
		sb.append(",RFSDPT="+String.valueOf(RFSDPT));
		sb.append(",RFCLAS="+String.valueOf(RFCLAS));
		sb.append(",RFSCLS="+String.valueOf(RFSCLS));
		sb.append(",RFWFC1="+String.valueOf(RFWFC1));
		sb.append(",RFWFC2="+String.valueOf(RFWFC2));
		sb.append(",RFPSWH="+String.valueOf(RFPSWH));
		sb.append(",RFSLFC="+String.valueOf(RFSLFC));
		sb.append(",RFENCN="+String.valueOf(RFENCN));
		sb.append(",RFENDT="+String.valueOf(RFENDT));
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
        		
        				if(ISTORE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTORE);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFOPDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFOPDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPROF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPROF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRPCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFANUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFANUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFSNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSNUM);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSCD);
            			}
            		
        			sb.append("|");
        		
        				if(RFREPL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFREPL);
            			}
            		
        			sb.append("|");
        		
        				if(RFDIST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDIST);
            			}
            		
        			sb.append("|");
        		
        				if(RFMSTK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMSTK);
            			}
            		
        			sb.append("|");
        		
        				if(RFDSPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDSPY);
            			}
            		
        			sb.append("|");
        		
        				if(RFMCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMCOD);
            			}
            		
        			sb.append("|");
        		
        				if(RFWHSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWHSE);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSTR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSKU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSKU);
            			}
            		
        			sb.append("|");
        		
        				if(RFVWKS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFVWKS);
            			}
            		
        			sb.append("|");
        		
        				if(RFBSLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFBSLS);
            			}
            		
        			sb.append("|");
        		
        				if(RFTRND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFTRND);
            			}
            		
        			sb.append("|");
        		
        				if(RFATRN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFATRN);
            			}
            		
        			sb.append("|");
        		
        				if(RFFCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFFCUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFLPWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLPWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLNWS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLNWS);
            			}
            		
        			sb.append("|");
        		
        				if(RFLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAXS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAXS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMINS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMINS);
            			}
            		
        			sb.append("|");
        		
        				if(RFMRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPRAT);
            			}
            		
        			sb.append("|");
        		
        				if(RFPPCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPPCT);
            			}
            		
        			sb.append("|");
        		
        				if(RFMAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMAX);
            			}
            		
        			sb.append("|");
        		
        				if(RFMIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMIN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWP);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWN);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFASWF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFASWF);
            			}
            		
        			sb.append("|");
        		
        				if(RFRVPR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRVPR);
            			}
            		
        			sb.append("|");
        		
        				if(RFSAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSAM);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK1);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK2);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK3);
            			}
            		
        			sb.append("|");
        		
        				if(RFRAT4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRAT4);
            			}
            		
        			sb.append("|");
        		
        				if(RFRNK4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRNK4);
            			}
            		
        			sb.append("|");
        		
        				if(RFMXSS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFMXSS);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSDY);
            			}
            		
        			sb.append("|");
        		
        				if(RFSSUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSSUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFRATT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFRATT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSTRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSTRT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDDT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSCUN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSCUN);
            			}
            		
        			sb.append("|");
        		
        				if(RFDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(RFSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(RFCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(RFSCLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSCLS);
            			}
            		
        			sb.append("|");
        		
        				if(RFWFC1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC1);
            			}
            		
        			sb.append("|");
        		
        				if(RFWFC2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFWFC2);
            			}
            		
        			sb.append("|");
        		
        				if(RFPSWH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFPSWH);
            			}
            		
        			sb.append("|");
        		
        				if(RFSLFC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFSLFC);
            			}
            		
        			sb.append("|");
        		
        				if(RFENCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENCN);
            			}
            		
        			sb.append("|");
        		
        				if(RFENDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RFENDT);
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
public void tFileInputDelimited_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_6");
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
RPLPRFStruct RPLPRF = new RPLPRFStruct();





	
	/**
	 * [tDBOutput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_6", false);
		start_Hash.put("tDBOutput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_6";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"RPLPRF");
			
		int tos_count_tDBOutput_6 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_6", "tDBOutput_1", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_6 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_6 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_6 = (String)(restRequest_tDBOutput_6 != null ? restRequest_tDBOutput_6.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_6 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_6 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_6 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_6 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_6.createRuntimeProperties();
 		                    props_tDBOutput_6.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);
 		                    
 		                    props_tDBOutput_6.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_6.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_6.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_6.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_6.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_6_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_6_1_fisrt sst_tDBOutput_6_1_fisrt = new SchemaSettingTool_tDBOutput_6_1_fisrt();
 		                    
 		                    props_tDBOutput_6.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_6_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_6.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_6.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_6.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_6.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_6.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_6.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_6.table.setValue("tableName",
 		                    "RPLPRF");
 		                    
 		                    props_tDBOutput_6.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_6.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_6.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_6.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_6.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_6.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_6_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"RPLPRF\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTORE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ISTORE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSTCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSTCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSTDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSTDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFOPCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFOPCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFOPDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFOPDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFPROF\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":5,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFPROF\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRPCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFRPCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFANUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFANUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSNUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":2,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFDSCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFDSCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFREPL\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFREPL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFDIST\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFDIST\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMSTK\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMSTK\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFDSPY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFDSPY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMCOD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFMCOD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFWHSE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFWHSE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFFDCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFFDCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFFDDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFFDDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSSTR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSSTR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSSKU\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFVWKS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFVWKS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFBSLS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFBSLS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFTRND\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFTRND\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFATRN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFATRN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFFCUN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFFCUN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFLPWS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFLPWS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFLNWS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFLNWS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFLEAD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFLEAD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMAXS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMAXS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMINS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMINS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMRAT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFMRAT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFPRAT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFPRAT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFPPCT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFPPCT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMAX\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMAX\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMIN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMIN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFASWP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFASWP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFASWN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFASWN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFASWH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFASWH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFASWF\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFASWF\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRVPR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFRVPR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSAM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSAM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRAT1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFRAT1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRNK1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFRNK1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRAT2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFRAT2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRNK2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFRNK2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRAT3\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFRAT3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRNK3\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFRNK3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRAT4\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFRAT4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRNK4\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"RFRNK4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFMXSS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFMXSS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSSDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSSDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSSUN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSSUN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFRATT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFRATT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSTRT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSTRT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSDCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSDCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSDDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSDDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSCUN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFSCUN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFDEPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"RFDEPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSDPT\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"RFSDPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFCLAS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"RFCLAS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSCLS\",\"type\":[\"double\",\"null\"],\"default\":\"\",\"talend.field.dbType\":8,\"talend.field.dbColumnName\":\"RFSCLS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFWFC1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFWFC1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFWFC2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFWFC2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFPSWH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFPSWH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFSLFC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"RFSLFC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFENCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFENCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RFENDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"RFENDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_6_2_fisrt sst_tDBOutput_6_2_fisrt = new SchemaSettingTool_tDBOutput_6_2_fisrt();
 		                    
 		                    props_tDBOutput_6.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_6_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_6.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_6 = props_tDBOutput_6.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_6.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_6);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_6.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_6 = props_tDBOutput_6.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_6.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_6);
        }
    }
globalMap.put("tDBOutput_6_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_6);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_6= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_6_MAPPINGS_URL", mappings_url_tDBOutput_6);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_6 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_6";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_6 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_6 = null;
topology_tDBOutput_6 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_6 = def_tDBOutput_6.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_6, topology_tDBOutput_6);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_6 = def_tDBOutput_6.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_6 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_6.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_6 = componentRuntime_tDBOutput_6.initialize(container_tDBOutput_6, props_tDBOutput_6);

if (initVr_tDBOutput_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_6.getMessage());
}

if(componentRuntime_tDBOutput_6 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_6 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_6;
	compDriverInitialization_tDBOutput_6.runAtDriver(container_tDBOutput_6);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_6 = null;
if(componentRuntime_tDBOutput_6 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_6 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_6;
	if (doesNodeBelongToRequest_tDBOutput_6) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_6 = sourceOrSink_tDBOutput_6.validate(container_tDBOutput_6);
        if (vr_tDBOutput_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_6.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_6 = null;
    if (sourceOrSink_tDBOutput_6 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_6 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_6;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_6 = sink_tDBOutput_6.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_6) {
            writeOperation_tDBOutput_6.initialize(container_tDBOutput_6);
        }
        writer_tDBOutput_6 = writeOperation_tDBOutput_6.createWriter(container_tDBOutput_6);
        if (doesNodeBelongToRequest_tDBOutput_6) {
            writer_tDBOutput_6.open("tDBOutput_6");
        }

        resourceMap.put("writer_tDBOutput_6", writer_tDBOutput_6);
    } // end of "sourceOrSink_tDBOutput_6 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_6 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_6.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_6 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_6 = props_tDBOutput_6.getSchema(c_tDBOutput_6, false);
    incomingEnforcer_tDBOutput_6 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_6);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_6 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_6 = null;


 



/**
 * [tDBOutput_6 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tMap_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_6 = new StringBuilder();
                    log4jParamters_tMap_6.append("Parameters:");
                            log4jParamters_tMap_6.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + (log4jParamters_tMap_6) );
                    } 
                } 
            new BytesLimit65535_tMap_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_6", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row1_tMap_6 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
	java.util.Date var1;
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_RPLPRF_tMap_6 = 0;
				
RPLPRFStruct RPLPRF_tmp = new RPLPRFStruct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_6", false);
		start_Hash.put("tFileInputDelimited_6", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_6";
	
	
		int tos_count_tFileInputDelimited_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_6 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_6.append("Parameters:");
                            log4jParamters_tFileInputDelimited_6.append("FILENAME" + " = " + "\"/data/talend/data_repository/RPLPRF.zip\"");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("REMOVE_EMPTY_ROW" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("UNCOMPRESS" + " = " + "true");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFOPCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFOPDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPROF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFANUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDSCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFREPL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDIST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMSTK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDSPY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWHSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFDCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFDDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSKU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFVWKS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFBSLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFTRND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFATRN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFFCUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLPWS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLNWS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMAXS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMINS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPPCT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFASWF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRVPR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRAT4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRNK4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFMXSS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSSUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFRATT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSTRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSCUN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSCLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWFC1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFWFC2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFPSWH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFSLFC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFENCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RFENDT")+"}]");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                            log4jParamters_tFileInputDelimited_6.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_6 - "  + (log4jParamters_tFileInputDelimited_6) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_6", "tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_6 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_6 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_6 = null;
				int limit_tFileInputDelimited_6 = -1;
				try{
					
						Object filename_tFileInputDelimited_6 = "/data/talend/data_repository/RPLPRF.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_6 = null;
						try {
							if(filename_tFileInputDelimited_6 instanceof java.io.InputStream){
								zis_tFileInputDelimited_6 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_6));
							}else{
								zis_tFileInputDelimited_6 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_6))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_6 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_6 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_6 = zis_tFileInputDelimited_6.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
								
									
										log.error("tFileInputDelimited_6 - " +e.getMessage());
									
									System.err.println(e.getMessage());
									break;
								
							}
							if(entry_tFileInputDelimited_6 == null) {
								break;
							}
							if(entry_tFileInputDelimited_6.isDirectory()){ //directory
								continue;
							}
							try {
								fid_tFileInputDelimited_6 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_6, "ISO-8859-15",",","\n",false,1,0,
								
									limit_tFileInputDelimited_6
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
								
									
										log.error("tFileInputDelimited_6 - " +e.getMessage());
									
									System.err.println(e.getMessage());
								
							}
					
				    
				    	log.info("tFileInputDelimited_6 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_6!=null && fid_tFileInputDelimited_6.nextRecord()) {
						rowstate_tFileInputDelimited_6.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_6 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_6 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_6 = 0;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.INUMBR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"INUMBR", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.INUMBR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 1;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ISTORE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISTORE", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.ISTORE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 2;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSTCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSTCN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSTCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 3;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSTDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSTDT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSTDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 4;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFOPCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFOPCN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFOPCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 5;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFOPDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFOPDT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFOPDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 6;
					
							row1.RFPROF = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 7;
					
							row1.RFRPCD = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 8;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFANUM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFANUM", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFANUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 9;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSNUM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSNUM", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 10;
					
							row1.RFDSCD = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 11;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFREPL = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFREPL", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFREPL = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 12;
					
							row1.RFDIST = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 13;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMSTK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMSTK", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMSTK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 14;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFDSPY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFDSPY", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFDSPY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 15;
					
							row1.RFMCOD = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 16;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFWHSE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFWHSE", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFWHSE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 17;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFFDCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFFDCN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFFDCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 18;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFFDDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFFDDT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFFDDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 19;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSSTR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSSTR", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSSTR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 20;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSSKU = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSSKU", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSSKU = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 21;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFVWKS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFVWKS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFVWKS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 22;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFBSLS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFBSLS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFBSLS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 23;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFTRND = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFTRND", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFTRND = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 24;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFATRN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFATRN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFATRN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 25;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFFCUN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFFCUN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFFCUN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 26;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFLPWS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFLPWS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFLPWS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 27;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFLNWS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFLNWS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFLNWS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 28;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFLEAD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFLEAD", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFLEAD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 29;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMAXS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMAXS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMAXS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 30;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMINS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMINS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMINS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 31;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMRAT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMRAT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMRAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 32;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFPRAT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFPRAT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFPRAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 33;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFPPCT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFPPCT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFPPCT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 34;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMAX = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMAX", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMAX = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 35;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMIN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMIN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMIN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 36;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFASWP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFASWP", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFASWP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 37;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFASWN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFASWN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFASWN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 38;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFASWH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFASWH", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFASWH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 39;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFASWF = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFASWF", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFASWF = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 40;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRVPR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRVPR", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRVPR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 41;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSAM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSAM", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSAM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 42;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRAT1 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRAT1", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRAT1 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 43;
					
							row1.RFRNK1 = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 44;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRAT2 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRAT2", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRAT2 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 45;
					
							row1.RFRNK2 = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 46;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRAT3 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRAT3", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRAT3 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 47;
					
							row1.RFRNK3 = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 48;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRAT4 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRAT4", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRAT4 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 49;
					
							row1.RFRNK4 = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						
				
					columnIndexWithD_tFileInputDelimited_6 = 50;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFMXSS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFMXSS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFMXSS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 51;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSSDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSSDY", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSSDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 52;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSSUN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSSUN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSSUN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 53;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFRATT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFRATT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFRATT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 54;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSTRT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSTRT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSTRT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 55;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSDCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSDCN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSDCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 56;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSDDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSDDT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSDDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 57;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSCUN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSCUN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSCUN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 58;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFDEPT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFDEPT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFDEPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 59;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSDPT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSDPT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSDPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 60;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFCLAS = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFCLAS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFCLAS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 61;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSCLS = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSCLS", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSCLS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 62;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFWFC1 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFWFC1", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFWFC1 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 63;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFWFC2 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFWFC2", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFWFC2 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 64;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFPSWH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFPSWH", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFPSWH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 65;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFSLFC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFSLFC", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFSLFC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 66;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFENCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFENCN", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFENCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_6 = 67;
					
						temp = fid_tFileInputDelimited_6.get(columnIndexWithD_tFileInputDelimited_6);
						if(temp.length() > 0) {
							
								try {
								
    								row1.RFENDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
									rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"RFENDT", "row1", temp, ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
								}
    							
						} else {						
							
								
									row1.RFENDT = null;
								
							
						}
					
				
				
										
										if(rowstate_tFileInputDelimited_6.getException()!=null) {
											throw rowstate_tFileInputDelimited_6.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_6 = true;
			        					
												log.error("tFileInputDelimited_6 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
			    					}
								
			log.debug("tFileInputDelimited_6 - Retrieving the record " + fid_tFileInputDelimited_6.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_6 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";
	
	

 


	tos_count_tFileInputDelimited_6++;

/**
 * [tFileInputDelimited_6 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";
	
	

 



/**
 * [tFileInputDelimited_6 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tFileInputDelimited_6","tFileInputDelimited_1","tFileInputDelimited","tMap_6","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_6 = false;
		boolean mainRowRejected_tMap_6 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;
Var.var1 = TalendDate.addDate(TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")),-1,"DD") ;// ###############################
        // ###############################
        // # Output tables

RPLPRF = null;


// # Output table : 'RPLPRF'
count_RPLPRF_tMap_6++;

RPLPRF_tmp.INUMBR = row1.INUMBR;
RPLPRF_tmp.ISTORE = row1.ISTORE;
RPLPRF_tmp.RFSTCN = row1.RFSTCN;
RPLPRF_tmp.RFSTDT = row1.RFSTDT;
RPLPRF_tmp.RFOPCN = row1.RFOPCN;
RPLPRF_tmp.RFOPDT = row1.RFOPDT;
RPLPRF_tmp.RFPROF = row1.RFPROF;
RPLPRF_tmp.RFRPCD = row1.RFRPCD;
RPLPRF_tmp.RFANUM = row1.RFANUM;
RPLPRF_tmp.RFSNUM = row1.RFSNUM;
RPLPRF_tmp.RFDSCD = row1.RFDSCD;
RPLPRF_tmp.RFREPL = row1.RFREPL;
RPLPRF_tmp.RFDIST = row1.RFDIST;
RPLPRF_tmp.RFMSTK = row1.RFMSTK;
RPLPRF_tmp.RFDSPY = row1.RFDSPY;
RPLPRF_tmp.RFMCOD = row1.RFMCOD;
RPLPRF_tmp.RFWHSE = row1.RFWHSE;
RPLPRF_tmp.RFFDCN = row1.RFFDCN;
RPLPRF_tmp.RFFDDT = row1.RFFDDT;
RPLPRF_tmp.RFSSTR = row1.RFSSTR;
RPLPRF_tmp.RFSSKU = row1.RFSSKU;
RPLPRF_tmp.RFVWKS = row1.RFVWKS;
RPLPRF_tmp.RFBSLS = row1.RFBSLS;
RPLPRF_tmp.RFTRND = row1.RFTRND;
RPLPRF_tmp.RFATRN = row1.RFATRN;
RPLPRF_tmp.RFFCUN = row1.RFFCUN;
RPLPRF_tmp.RFLPWS = row1.RFLPWS;
RPLPRF_tmp.RFLNWS = row1.RFLNWS;
RPLPRF_tmp.RFLEAD = row1.RFLEAD;
RPLPRF_tmp.RFMAXS = row1.RFMAXS;
RPLPRF_tmp.RFMINS = row1.RFMINS;
RPLPRF_tmp.RFMRAT = row1.RFMRAT;
RPLPRF_tmp.RFPRAT = row1.RFPRAT;
RPLPRF_tmp.RFPPCT = row1.RFPPCT;
RPLPRF_tmp.RFMAX = row1.RFMAX;
RPLPRF_tmp.RFMIN = row1.RFMIN;
RPLPRF_tmp.RFASWP = row1.RFASWP;
RPLPRF_tmp.RFASWN = row1.RFASWN;
RPLPRF_tmp.RFASWH = row1.RFASWH;
RPLPRF_tmp.RFASWF = row1.RFASWF;
RPLPRF_tmp.RFRVPR = row1.RFRVPR;
RPLPRF_tmp.RFSAM = row1.RFSAM;
RPLPRF_tmp.RFRAT1 = row1.RFRAT1;
RPLPRF_tmp.RFRNK1 = row1.RFRNK1;
RPLPRF_tmp.RFRAT2 = row1.RFRAT2;
RPLPRF_tmp.RFRNK2 = row1.RFRNK2;
RPLPRF_tmp.RFRAT3 = row1.RFRAT3;
RPLPRF_tmp.RFRNK3 = row1.RFRNK3;
RPLPRF_tmp.RFRAT4 = row1.RFRAT4;
RPLPRF_tmp.RFRNK4 = row1.RFRNK4;
RPLPRF_tmp.RFMXSS = row1.RFMXSS;
RPLPRF_tmp.RFSSDY = row1.RFSSDY;
RPLPRF_tmp.RFSSUN = row1.RFSSUN;
RPLPRF_tmp.RFRATT = row1.RFRATT;
RPLPRF_tmp.RFSTRT = row1.RFSTRT;
RPLPRF_tmp.RFSDCN = row1.RFSDCN;
RPLPRF_tmp.RFSDDT = row1.RFSDDT;
RPLPRF_tmp.RFSCUN = row1.RFSCUN;
RPLPRF_tmp.RFDEPT = row1.RFDEPT;
RPLPRF_tmp.RFSDPT = row1.RFSDPT;
RPLPRF_tmp.RFCLAS = row1.RFCLAS;
RPLPRF_tmp.RFSCLS = row1.RFSCLS;
RPLPRF_tmp.RFWFC1 = row1.RFWFC1;
RPLPRF_tmp.RFWFC2 = row1.RFWFC2;
RPLPRF_tmp.RFPSWH = row1.RFPSWH;
RPLPRF_tmp.RFSLFC = row1.RFSLFC;
RPLPRF_tmp.RFENCN = row1.RFENCN;
RPLPRF_tmp.RFENDT = row1.RFENDT;
RPLPRF_tmp.LOAD_DATE = Var.var1 ;
RPLPRF = RPLPRF_tmp;
log.debug("tMap_6 - Outputting the record " + count_RPLPRF_tMap_6 + " of the output table 'RPLPRF'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";
	
	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "RPLPRF"
if(RPLPRF != null) { 



	
	/**
	 * [tDBOutput_6 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"RPLPRF","tMap_6","tMap_1","tMap","tDBOutput_6","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("RPLPRF - " + (RPLPRF==null? "": RPLPRF.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_6 != null) {
            incomingEnforcer_tDBOutput_6.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("INUMBR") != null){
                    incomingEnforcer_tDBOutput_6.put("INUMBR", RPLPRF.INUMBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("ISTORE") != null){
                    incomingEnforcer_tDBOutput_6.put("ISTORE", RPLPRF.ISTORE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSTCN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSTCN", RPLPRF.RFSTCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSTDT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSTDT", RPLPRF.RFSTDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFOPCN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFOPCN", RPLPRF.RFOPCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFOPDT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFOPDT", RPLPRF.RFOPDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFPROF") != null){
                    incomingEnforcer_tDBOutput_6.put("RFPROF", RPLPRF.RFPROF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRPCD") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRPCD", RPLPRF.RFRPCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFANUM") != null){
                    incomingEnforcer_tDBOutput_6.put("RFANUM", RPLPRF.RFANUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSNUM") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSNUM", RPLPRF.RFSNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFDSCD") != null){
                    incomingEnforcer_tDBOutput_6.put("RFDSCD", RPLPRF.RFDSCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFREPL") != null){
                    incomingEnforcer_tDBOutput_6.put("RFREPL", RPLPRF.RFREPL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFDIST") != null){
                    incomingEnforcer_tDBOutput_6.put("RFDIST", RPLPRF.RFDIST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMSTK") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMSTK", RPLPRF.RFMSTK);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFDSPY") != null){
                    incomingEnforcer_tDBOutput_6.put("RFDSPY", RPLPRF.RFDSPY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMCOD") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMCOD", RPLPRF.RFMCOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFWHSE") != null){
                    incomingEnforcer_tDBOutput_6.put("RFWHSE", RPLPRF.RFWHSE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFFDCN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFFDCN", RPLPRF.RFFDCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFFDDT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFFDDT", RPLPRF.RFFDDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSSTR") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSSTR", RPLPRF.RFSSTR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSSKU") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSSKU", RPLPRF.RFSSKU);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFVWKS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFVWKS", RPLPRF.RFVWKS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFBSLS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFBSLS", RPLPRF.RFBSLS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFTRND") != null){
                    incomingEnforcer_tDBOutput_6.put("RFTRND", RPLPRF.RFTRND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFATRN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFATRN", RPLPRF.RFATRN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFFCUN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFFCUN", RPLPRF.RFFCUN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFLPWS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFLPWS", RPLPRF.RFLPWS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFLNWS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFLNWS", RPLPRF.RFLNWS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFLEAD") != null){
                    incomingEnforcer_tDBOutput_6.put("RFLEAD", RPLPRF.RFLEAD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMAXS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMAXS", RPLPRF.RFMAXS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMINS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMINS", RPLPRF.RFMINS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMRAT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMRAT", RPLPRF.RFMRAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFPRAT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFPRAT", RPLPRF.RFPRAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFPPCT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFPPCT", RPLPRF.RFPPCT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMAX") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMAX", RPLPRF.RFMAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMIN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMIN", RPLPRF.RFMIN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFASWP") != null){
                    incomingEnforcer_tDBOutput_6.put("RFASWP", RPLPRF.RFASWP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFASWN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFASWN", RPLPRF.RFASWN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFASWH") != null){
                    incomingEnforcer_tDBOutput_6.put("RFASWH", RPLPRF.RFASWH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFASWF") != null){
                    incomingEnforcer_tDBOutput_6.put("RFASWF", RPLPRF.RFASWF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRVPR") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRVPR", RPLPRF.RFRVPR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSAM") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSAM", RPLPRF.RFSAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRAT1") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRAT1", RPLPRF.RFRAT1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRNK1") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRNK1", RPLPRF.RFRNK1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRAT2") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRAT2", RPLPRF.RFRAT2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRNK2") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRNK2", RPLPRF.RFRNK2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRAT3") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRAT3", RPLPRF.RFRAT3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRNK3") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRNK3", RPLPRF.RFRNK3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRAT4") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRAT4", RPLPRF.RFRAT4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRNK4") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRNK4", RPLPRF.RFRNK4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFMXSS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFMXSS", RPLPRF.RFMXSS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSSDY") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSSDY", RPLPRF.RFSSDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSSUN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSSUN", RPLPRF.RFSSUN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFRATT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFRATT", RPLPRF.RFRATT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSTRT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSTRT", RPLPRF.RFSTRT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSDCN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSDCN", RPLPRF.RFSDCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSDDT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSDDT", RPLPRF.RFSDDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSCUN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSCUN", RPLPRF.RFSCUN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFDEPT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFDEPT", RPLPRF.RFDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSDPT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSDPT", RPLPRF.RFSDPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFCLAS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFCLAS", RPLPRF.RFCLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSCLS") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSCLS", RPLPRF.RFSCLS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFWFC1") != null){
                    incomingEnforcer_tDBOutput_6.put("RFWFC1", RPLPRF.RFWFC1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFWFC2") != null){
                    incomingEnforcer_tDBOutput_6.put("RFWFC2", RPLPRF.RFWFC2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFPSWH") != null){
                    incomingEnforcer_tDBOutput_6.put("RFPSWH", RPLPRF.RFPSWH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFSLFC") != null){
                    incomingEnforcer_tDBOutput_6.put("RFSLFC", RPLPRF.RFSLFC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFENCN") != null){
                    incomingEnforcer_tDBOutput_6.put("RFENCN", RPLPRF.RFENCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("RFENDT") != null){
                    incomingEnforcer_tDBOutput_6.put("RFENDT", RPLPRF.RFENDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_6 != null && incomingEnforcer_tDBOutput_6.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_6.put("LOAD_DATE", RPLPRF.LOAD_DATE);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_6 = null;
        if (incomingEnforcer_tDBOutput_6 != null) {
            data_tDBOutput_6 = incomingEnforcer_tDBOutput_6.getCurrentRecord();
        }
        
        if (writer_tDBOutput_6 != null && data_tDBOutput_6 != null) {
        	writer_tDBOutput_6.write(data_tDBOutput_6);
        }
        
        nb_line_tDBOutput_6++;

 


	tos_count_tDBOutput_6++;

/**
 * [tDBOutput_6 main ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	


 



/**
 * [tDBOutput_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	


 



/**
 * [tDBOutput_6 process_data_end ] stop
 */

} // End of branch "RPLPRF"




	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";
	
	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";
	
	

 



/**
 * [tFileInputDelimited_6 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";
	
	


				
            }
            nb_line_tFileInputDelimited_6+=fid_tFileInputDelimited_6.getRowNumber();
		}
		}finally{
            if(!((Object)("/data/talend/data_repository/RPLPRF.zip") instanceof java.io.InputStream)){
            	if(fid_tFileInputDelimited_6!=null){
            		fid_tFileInputDelimited_6.close();
            	}
            }
            if(fid_tFileInputDelimited_6!=null){
            	globalMap.put("tFileInputDelimited_6_NB_LINE", nb_line_tFileInputDelimited_6);
            }
					
						log.info("tFileInputDelimited_6- Retrieved records count: "+ nb_line_tFileInputDelimited_6 + ".");
					
        }
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_6 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_6", true);
end_Hash.put("tFileInputDelimited_6", System.currentTimeMillis());




/**
 * [tFileInputDelimited_6 end ] stop
 */

	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_6 - Written records count in the table 'RPLPRF': " + count_RPLPRF_tMap_6 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tFileInputDelimited_6","tFileInputDelimited_1","tFileInputDelimited","tMap_6","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Done.") );

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
 */

	
	/**
	 * [tDBOutput_6 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_6", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_6 = null;
    if (writer_tDBOutput_6 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_6 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_6.close();
        resultMap_tDBOutput_6 = writer_tDBOutput_6.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_6), container_tDBOutput_6);
    }
if(resultMap_tDBOutput_6!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_6 : resultMap_tDBOutput_6.entrySet()) {
		switch(entry_tDBOutput_6.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_6.setComponentData("tDBOutput_6", "ERROR_MESSAGE", entry_tDBOutput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_6.setComponentData("tDBOutput_6", "NB_LINE", entry_tDBOutput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_6.setComponentData("tDBOutput_6", "NB_SUCCESS", entry_tDBOutput_6.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_6.setComponentData("tDBOutput_6", "NB_REJECT", entry_tDBOutput_6.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_6 = new StringBuilder();
            for (int i_tDBOutput_6 = 0; i_tDBOutput_6 < entry_tDBOutput_6.getKey().length(); i_tDBOutput_6++) {
                char ch_tDBOutput_6 = entry_tDBOutput_6.getKey().charAt(i_tDBOutput_6);
                if(Character.isUpperCase(ch_tDBOutput_6) && i_tDBOutput_6> 0) {
                	studio_key_tDBOutput_6.append('_');
                }
                studio_key_tDBOutput_6.append(ch_tDBOutput_6);
            }
			container_tDBOutput_6.setComponentData("tDBOutput_6", studio_key_tDBOutput_6.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_6.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"RPLPRF",2,0,
			 			"tMap_6","tMap_1","tMap","tDBOutput_6","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_6", true);
end_Hash.put("tDBOutput_6", System.currentTimeMillis());




/**
 * [tDBOutput_6 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_6:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tDBRow_10Process(globalMap); 
						



	
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
	 * [tFileInputDelimited_6 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";
	
	

 



/**
 * [tFileInputDelimited_6 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";
	
	

 



/**
 * [tMap_6 finally ] stop
 */

	
	/**
	 * [tDBOutput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_6")==null){
    if(resourceMap.get("writer_tDBOutput_6")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_6")).close();
		} catch (java.io.IOException e_tDBOutput_6) {
			String errorMessage_tDBOutput_6 = "failed to release the resource in tDBOutput_6 :" + e_tDBOutput_6.getMessage();
			System.err.println(errorMessage_tDBOutput_6);
		}
	}
}
 



/**
 * [tDBOutput_6 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_6_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_10Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_10_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_10");
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
	 * [tDBRow_10 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_10", false);
		start_Hash.put("tDBRow_10", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_10";
	
	
		int tos_count_tDBRow_10 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_10", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_10 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_10 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_10 = (String)(restRequest_tDBRow_10 != null ? restRequest_tDBRow_10.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_10 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_10 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_10 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_10 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_10.createRuntimeProperties();
 		                    props_tDBRow_10.setValue("query",
 		                    "\n\ninsert into PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF\n(\nINUMBR,ISTORE,RFSTDT,RFOPDT,RFPROF,RFRPCD,RFANUM,RFSNUM,RF"
+"DSCD,RFREPL,RFDIST,RFMSTK,RFDSPY,RFMCOD,RFWHSE,RFFDDT,RFSSTR,RFSSKU,RFVWKS,RFBSLS,RFTRND,RFATRN,RFFCUN,RFLPWS,RFLNWS,RFL"
+"EAD,\nRFMAXS,RFMINS,RFMRAT,RFPRAT,RFPPCT,RFMAX,RFMIN,RFASWP,RFASWN,RFASWH,RFASWF,RFRVPR,RFSAM,RFRAT1,RFRNK1,RFRAT2,RFRNK"
+"2,RFRAT3,RFRNK3,RFRAT4,RFRNK4,RFMXSS,RFSSDY,RFSSUN,RFRATT,RFSTRT,RFSDDT,RFSCUN,RFDEPT,RFSDPT,RFCLAS,RFSCLS,RFWFC1,RFWFC2"
+",RFPSWH,RFSLFC,RFENDT,DATELOADED\n)\nselect\nINUMBR\n,ISTORE\n,RFSTDT\n,RFOPDT\n,RFPROF\n,RFRPCD\n,RFANUM\n,RFSNUM\n,RFD"
+"SCD\n,RFREPL\n,RFDIST\n,RFMSTK\n,RFDSPY\n,RFMCOD\n,RFWHSE\n,RFFDDT\n,RFSSTR\n,RFSSKU\n,RFVWKS\n,RFBSLS\n,RFTRND\n,RFATRN"
+"\n,RFFCUN\n,RFLPWS\n,RFLNWS\n,RFLEAD\n,RFMAXS\n,RFMINS\n,RFMRAT\n,RFPRAT\n,RFPPCT\n,RFMAX\n,RFMIN\n,RFASWP\n,RFASWN\n,RF"
+"ASWH\n,RFASWF\n,RFRVPR\n,RFSAM\n,RFRAT1\n,RFRNK1\n,RFRAT2\n,RFRNK2\n,RFRAT3\n,RFRNK3\n,RFRAT4\n,RFRNK4\n,RFMXSS\n,RFSSDY"
+"\n,RFSSUN\n,RFRATT\n,RFSTRT\n,RFSDDT\n,RFSCUN\n,RFDEPT\n,RFSDPT\n,RFCLAS\n,RFSCLS\n,RFWFC1\n,RFWFC2\n,RFPSWH\n,RFSLFC\n,"
+"RFENDT\n,LOAD_DATE from RPLPRF\n\n");
 		                    
 		                    props_tDBRow_10.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_10.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_10.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_10_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_10_1_fisrt sst_tDBRow_10_1_fisrt = new SchemaSettingTool_tDBRow_10_1_fisrt();
 		                    
 		                    props_tDBRow_10.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_10_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_10_2_fisrt sst_tDBRow_10_2_fisrt = new SchemaSettingTool_tDBRow_10_2_fisrt();
 		                    
 		                    props_tDBRow_10.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_10.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_10.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_10.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_10.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_10.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_10.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_10.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_10.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_10.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_10.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_10.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_10.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_10.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_10_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_10_3_fisrt sst_tDBRow_10_3_fisrt = new SchemaSettingTool_tDBRow_10_3_fisrt();
 		                    
 		                    props_tDBRow_10.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_10_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_10.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_10 = props_tDBRow_10.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_10 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_10 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_10 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_10.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_10);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_10.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_10 = props_tDBRow_10.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_10 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_10 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_10 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_10.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_10);
        }
    }
globalMap.put("tDBRow_10_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_10);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_10= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_10, topology_tDBRow_10);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_10 = def_tDBRow_10.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_10 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_10.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_10 = componentRuntime_tDBRow_10.initialize(container_tDBRow_10, props_tDBRow_10);

if (initVr_tDBRow_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_10.getMessage());
}

if(componentRuntime_tDBRow_10 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_10 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_10;
	compDriverInitialization_tDBRow_10.runAtDriver(container_tDBRow_10);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_10 = null;
if(componentRuntime_tDBRow_10 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_10 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_10;
	if (doesNodeBelongToRequest_tDBRow_10) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_10 = sourceOrSink_tDBRow_10.validate(container_tDBRow_10);
        if (vr_tDBRow_10.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBRow_10";
	
	


 


	tos_count_tDBRow_10++;

/**
 * [tDBRow_10 main ] stop
 */
	
	/**
	 * [tDBRow_10 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_10";
	
	


 



/**
 * [tDBRow_10 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_10 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_10";
	
	


 



/**
 * [tDBRow_10 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_10 end ] start
	 */

	

	
	
	currentComponent="tDBRow_10";
	
	
// end of generic


resourceMap.put("finish_tDBRow_10", Boolean.TRUE);

 

ok_Hash.put("tDBRow_10", true);
end_Hash.put("tDBRow_10", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tDBRow_11Process(globalMap);



/**
 * [tDBRow_10 end ] stop
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
	 * [tDBRow_10 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_10";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_10")==null){
}
 



/**
 * [tDBRow_10 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_10_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_11Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_11_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_11");
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
	 * [tDBRow_11 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_11", false);
		start_Hash.put("tDBRow_11", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_11";
	
	
		int tos_count_tDBRow_11 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_11", "tDBRow_1", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_11 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_11 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_11 = (String)(restRequest_tDBRow_11 != null ? restRequest_tDBRow_11.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_11 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_11 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_11 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_11 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_11.createRuntimeProperties();
 		                    props_tDBRow_11.setValue("query",
 		                    "\nDrop table RPLPRF\n\n");
 		                    
 		                    props_tDBRow_11.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_11.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_11.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_11_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_11_1_fisrt sst_tDBRow_11_1_fisrt = new SchemaSettingTool_tDBRow_11_1_fisrt();
 		                    
 		                    props_tDBRow_11.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_11_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_11_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_11_2_fisrt sst_tDBRow_11_2_fisrt = new SchemaSettingTool_tDBRow_11_2_fisrt();
 		                    
 		                    props_tDBRow_11.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_11_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_11.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_11.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_11.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_11.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_11.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_11.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_11.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_11.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_11.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_11.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_11.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_11.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_11.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_11_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_11_3_fisrt sst_tDBRow_11_3_fisrt = new SchemaSettingTool_tDBRow_11_3_fisrt();
 		                    
 		                    props_tDBRow_11.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_11_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_11.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_11 = props_tDBRow_11.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_11 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_11 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_11 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_11.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_11);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_11.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_11 = props_tDBRow_11.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_11 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_11 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_11 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_11.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_11);
        }
    }
globalMap.put("tDBRow_11_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_11);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_11= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBRow_11_MAPPINGS_URL", mappings_url_tDBRow_11);

org.talend.components.api.container.RuntimeContainer container_tDBRow_11 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBRow_11";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBRow_11 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBRow_11 = null;
topology_tDBRow_11 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_11 = def_tDBRow_11.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_11, topology_tDBRow_11);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_11 = def_tDBRow_11.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_11 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_11.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_11 = componentRuntime_tDBRow_11.initialize(container_tDBRow_11, props_tDBRow_11);

if (initVr_tDBRow_11.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_11.getMessage());
}

if(componentRuntime_tDBRow_11 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_11 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_11;
	compDriverInitialization_tDBRow_11.runAtDriver(container_tDBRow_11);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_11 = null;
if(componentRuntime_tDBRow_11 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_11 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_11;
	if (doesNodeBelongToRequest_tDBRow_11) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_11 = sourceOrSink_tDBRow_11.validate(container_tDBRow_11);
        if (vr_tDBRow_11.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBRow_11.getMessage());
        }
	}
}

 



/**
 * [tDBRow_11 begin ] stop
 */
	
	/**
	 * [tDBRow_11 main ] start
	 */

	

	
	
	currentComponent="tDBRow_11";
	
	


 


	tos_count_tDBRow_11++;

/**
 * [tDBRow_11 main ] stop
 */
	
	/**
	 * [tDBRow_11 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_11";
	
	


 



/**
 * [tDBRow_11 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_11 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_11";
	
	


 



/**
 * [tDBRow_11 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_11 end ] start
	 */

	

	
	
	currentComponent="tDBRow_11";
	
	
// end of generic


resourceMap.put("finish_tDBRow_11", Boolean.TRUE);

 

ok_Hash.put("tDBRow_11", true);
end_Hash.put("tDBRow_11", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tFileDelete_1Process(globalMap);



/**
 * [tDBRow_11 end ] stop
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
	 * [tDBRow_11 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_11";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_11")==null){
}
 



/**
 * [tDBRow_11 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_11_SUBPROCESS_STATE", 1);
	}
	

public void tFileDelete_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileDelete_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_1");
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
                            log4jParamters_tFileDelete_1.append("PATH" + " = " + "\"/data/talend/data_repository/RPLPRF.zip\"");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_1.append(" | ");
                            log4jParamters_tFileDelete_1.append("FOLDER_FILE" + " = " + "true");
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
	java.io.File path_tFileDelete_1=new java.io.File("/data/talend/data_repository/RPLPRF.zip");
	if(path_tFileDelete_1.exists()){
		if(path_tFileDelete_1.isFile()){
	    	if(path_tFileDelete_1.delete()){
	    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File deleted.");
				log.info("tFileDelete_1 - File : "+ path_tFileDelete_1.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("The file " + path_tFileDelete_1.getAbsolutePath() + " can't be deleted.");
	    	}
		}else if(path_tFileDelete_1.isDirectory()){ 
	    	DeleteFoldertFileDelete_1 dftFileDelete_1 = new DeleteFoldertFileDelete_1();
	    	if(dftFileDelete_1.delete(path_tFileDelete_1)){
	    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "Path deleted.");
				log.info("tFileDelete_1 - Directory : "+ path_tFileDelete_1.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_1_CURRENT_STATUS", "No path deleted.");
			throw new RuntimeException("The directory " + path_tFileDelete_1.getAbsolutePath() + " can not be deleted.");
	    	}
		}
	}else{
		globalMap.put("tFileDelete_1_CURRENT_STATUS", "File or path does not exist or is invalid.");
    		throw new RuntimeException("File or path does not exist or is invalid.");
    }
    globalMap.put("tFileDelete_1_DELETE_PATH","/data/talend/data_repository/RPLPRF.zip");
 


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
		

		globalMap.put("tFileDelete_1_SUBPROCESS_STATE", 1);
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

    private SyncInt runningThreadCount =new SyncInt();

    private class SyncInt
    {
        private int count = 0;
        public synchronized void add(int i)
        {
            count +=i;
        }

        public synchronized int getCount()
        {
            return count;
        }
    }

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
        final PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRFClass = new PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF();

        int exitCode = PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRFClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF' - Done.");
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
			log.info("TalendJob: 'PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_FMdngDYfEeqYaujOWQCPPw");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-21T12:51:12.986745900Z");

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
            java.io.InputStream inContext = PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.class.getClassLoader().getResourceAsStream("at_talend_jobs/profile_sku_store_cross_reference_rplprf_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("jda_host_name", "id_String");
                        if(context.getStringValue("jda_host_name") == null) {
                            context.jda_host_name = null;
                        } else {
                            context.jda_host_name=(String) context.getProperty("jda_host_name");
                        }
                        context.setContextType("jda_mm_lib", "id_String");
                        if(context.getStringValue("jda_mm_lib") == null) {
                            context.jda_mm_lib = null;
                        } else {
                            context.jda_mm_lib=(String) context.getProperty("jda_mm_lib");
                        }
                        context.setContextType("jda_user_name", "id_String");
                        if(context.getStringValue("jda_user_name") == null) {
                            context.jda_user_name = null;
                        } else {
                            context.jda_user_name=(String) context.getProperty("jda_user_name");
                        }
                        context.setContextType("jda_password", "id_Password");
                        if(context.getStringValue("jda_password") == null) {
                            context.jda_password = null;
                        } else {
                            String pwd_jda_password_value = context.getProperty("jda_password");
                            context.jda_password = null;
                            if(pwd_jda_password_value!=null) {
                                if(context_param.containsKey("jda_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.jda_password = pwd_jda_password_value;
                                } else if (!pwd_jda_password_value.isEmpty()) {
                                    try {
                                        context.jda_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_jda_password_value);
                                        context.put("jda_password",context.jda_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("SF_account", "id_String");
                        if(context.getStringValue("SF_account") == null) {
                            context.SF_account = null;
                        } else {
                            context.SF_account=(String) context.getProperty("SF_account");
                        }
                        context.setContextType("SF_prod_database", "id_String");
                        if(context.getStringValue("SF_prod_database") == null) {
                            context.SF_prod_database = null;
                        } else {
                            context.SF_prod_database=(String) context.getProperty("SF_prod_database");
                        }
                        context.setContextType("SF_password", "id_Password");
                        if(context.getStringValue("SF_password") == null) {
                            context.SF_password = null;
                        } else {
                            String pwd_SF_password_value = context.getProperty("SF_password");
                            context.SF_password = null;
                            if(pwd_SF_password_value!=null) {
                                if(context_param.containsKey("SF_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.SF_password = pwd_SF_password_value;
                                } else if (!pwd_SF_password_value.isEmpty()) {
                                    try {
                                        context.SF_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_SF_password_value);
                                        context.put("SF_password",context.SF_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("SF_fin_schema", "id_String");
                        if(context.getStringValue("SF_fin_schema") == null) {
                            context.SF_fin_schema = null;
                        } else {
                            context.SF_fin_schema=(String) context.getProperty("SF_fin_schema");
                        }
                        context.setContextType("SF_user_id", "id_String");
                        if(context.getStringValue("SF_user_id") == null) {
                            context.SF_user_id = null;
                        } else {
                            context.SF_user_id=(String) context.getProperty("SF_user_id");
                        }
                        context.setContextType("SF_warehouse", "id_String");
                        if(context.getStringValue("SF_warehouse") == null) {
                            context.SF_warehouse = null;
                        } else {
                            context.SF_warehouse=(String) context.getProperty("SF_warehouse");
                        }
                        context.setContextType("sql_server_database", "id_String");
                        if(context.getStringValue("sql_server_database") == null) {
                            context.sql_server_database = null;
                        } else {
                            context.sql_server_database=(String) context.getProperty("sql_server_database");
                        }
                        context.setContextType("sql_server_host", "id_String");
                        if(context.getStringValue("sql_server_host") == null) {
                            context.sql_server_host = null;
                        } else {
                            context.sql_server_host=(String) context.getProperty("sql_server_host");
                        }
                        context.setContextType("sql_server_password", "id_Password");
                        if(context.getStringValue("sql_server_password") == null) {
                            context.sql_server_password = null;
                        } else {
                            String pwd_sql_server_password_value = context.getProperty("sql_server_password");
                            context.sql_server_password = null;
                            if(pwd_sql_server_password_value!=null) {
                                if(context_param.containsKey("sql_server_password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.sql_server_password = pwd_sql_server_password_value;
                                } else if (!pwd_sql_server_password_value.isEmpty()) {
                                    try {
                                        context.sql_server_password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_sql_server_password_value);
                                        context.put("sql_server_password",context.sql_server_password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("sql_server_port", "id_String");
                        if(context.getStringValue("sql_server_port") == null) {
                            context.sql_server_port = null;
                        } else {
                            context.sql_server_port=(String) context.getProperty("sql_server_port");
                        }
                        context.setContextType("sql_server_schema", "id_String");
                        if(context.getStringValue("sql_server_schema") == null) {
                            context.sql_server_schema = null;
                        } else {
                            context.sql_server_schema=(String) context.getProperty("sql_server_schema");
                        }
                        context.setContextType("sql_server_user_id", "id_String");
                        if(context.getStringValue("sql_server_user_id") == null) {
                            context.sql_server_user_id = null;
                        } else {
                            context.sql_server_user_id=(String) context.getProperty("sql_server_user_id");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("jda_host_name")) {
                context.jda_host_name = (String) parentContextMap.get("jda_host_name");
            }if (parentContextMap.containsKey("jda_mm_lib")) {
                context.jda_mm_lib = (String) parentContextMap.get("jda_mm_lib");
            }if (parentContextMap.containsKey("jda_user_name")) {
                context.jda_user_name = (String) parentContextMap.get("jda_user_name");
            }if (parentContextMap.containsKey("jda_password")) {
                context.jda_password = (java.lang.String) parentContextMap.get("jda_password");
            }if (parentContextMap.containsKey("SF_account")) {
                context.SF_account = (String) parentContextMap.get("SF_account");
            }if (parentContextMap.containsKey("SF_prod_database")) {
                context.SF_prod_database = (String) parentContextMap.get("SF_prod_database");
            }if (parentContextMap.containsKey("SF_password")) {
                context.SF_password = (java.lang.String) parentContextMap.get("SF_password");
            }if (parentContextMap.containsKey("SF_fin_schema")) {
                context.SF_fin_schema = (String) parentContextMap.get("SF_fin_schema");
            }if (parentContextMap.containsKey("SF_user_id")) {
                context.SF_user_id = (String) parentContextMap.get("SF_user_id");
            }if (parentContextMap.containsKey("SF_warehouse")) {
                context.SF_warehouse = (String) parentContextMap.get("SF_warehouse");
            }if (parentContextMap.containsKey("sql_server_database")) {
                context.sql_server_database = (String) parentContextMap.get("sql_server_database");
            }if (parentContextMap.containsKey("sql_server_host")) {
                context.sql_server_host = (String) parentContextMap.get("sql_server_host");
            }if (parentContextMap.containsKey("sql_server_password")) {
                context.sql_server_password = (java.lang.String) parentContextMap.get("sql_server_password");
            }if (parentContextMap.containsKey("sql_server_port")) {
                context.sql_server_port = (String) parentContextMap.get("sql_server_port");
            }if (parentContextMap.containsKey("sql_server_schema")) {
                context.sql_server_schema = (String) parentContextMap.get("sql_server_schema");
            }if (parentContextMap.containsKey("sql_server_user_id")) {
                context.sql_server_user_id = (String) parentContextMap.get("sql_server_user_id");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("jda_password");
			parametersToEncrypt.add("SF_password");
			parametersToEncrypt.add("sql_server_password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF' - Started.");
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
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

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
final Thread launchingThread = Thread.currentThread();
        runningThreadCount.add(1);
        new Thread(){
            public void run() {
                    mdcInfo.forEach(org.slf4j.MDC::put);

                java.util.Map threadRunResultMap = new java.util.HashMap();
                threadRunResultMap.put("errorCode", null);
                threadRunResultMap.put("status", "");
                threadLocal.set(threadRunResultMap);

                try {
((java.util.Map) threadLocal.get()).put("errorCode", null);tDBRow_8Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_tDBRow_8) {
globalMap.put("tDBRow_8_SUBPROCESS_STATE", -1);

e_tDBRow_8.printStackTrace();

}catch (java.lang.Error e_tDBRow_8) {
globalMap.put("tDBRow_8_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_tDBRow_8;

}
                finally {
                    Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
                    String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
                    if (localErrorCode != null) {
                        if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                           errorCode = localErrorCode;
                        }
                    }
                    if (!status.equals("failure")){
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



this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF");
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

        Integer localErrorCode = (Integer)(((java.util.Map)threadLocal.get()).get("errorCode"));
        String localStatus = (String)(((java.util.Map)threadLocal.get()).get("status"));
        if (localErrorCode != null) {
            if (errorCode == null || localErrorCode.compareTo(errorCode) > 0) {
                   errorCode = localErrorCode;
            }
        }
        if (localStatus != null && !status.equals("failure")){
            status = localStatus;
        }

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
        log.info("TalendJob: 'PROFILE_SKU_STORE_CROSS_REFERENCE_RPLPRF' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();




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
 *     660505 characters generated by Talend Cloud Data Management Platform 
 *     on the June 21, 2023 at 8:51:12 AM EDT
 ************************************************************************************************/