
package at_talend_jobs.inventory_balance_data_invbal_0_1;

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
 * Job: INVENTORY_BALANCE_DATA_INVBAL Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class INVENTORY_BALANCE_DATA_INVBAL implements TalendJob {
	static {System.setProperty("TalendJob.log", "INVENTORY_BALANCE_DATA_INVBAL.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(INVENTORY_BALANCE_DATA_INVBAL.class);
	

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
	private final String jobName = "INVENTORY_BALANCE_DATA_INVBAL";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_5wetIAD8EeqgyP0IRwtTMg", "0.1");
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
				INVENTORY_BALANCE_DATA_INVBAL.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(INVENTORY_BALANCE_DATA_INVBAL.this, new Object[] { e , currentComponent, globalMap});
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
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:NFu4dfSQm+nSfOxBt/7p/FJLnGjgrBTNKaH6aAvrQE2PBrSU"));
 		                        
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
 		                    "tDBConnection_1");
 		                    
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
 		                    "DELETE from INVENTORY_BALANCE_DATA_INVBAL\nWHERE DATELOADED= CURRENT_DATE()");
 		                    
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
     		                    						
     		                    						a("\"name\":\"Record\",\"fields\":[]}",s);
     		                    						
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
 		                    
 		                    props_tDBRow_1.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    
 		                    props_tDBRow_1.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
     		                    						
     		                    						a("\"name\":\"Record\",\"fields\":[]}",s);
     		                    						
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
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
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
 		                    "\nCREATE OR REPLACE TABLE INVBAL(\n	INUMBR decimal(9, 0) NULL,\n	ISTORE decimal(5, 0) NULL,\n	IBHBOY decimal(9, 2) NULL"
+",\n	IBHBOP decimal(9, 2) NULL,\n	IBHAND decimal(9, 2) NULL,\n	IBTRNS decimal(4, 1) NULL,\n	IBGMRI decimal(4, 1) NULL,\n	"
+"IBWKCR decimal(7, 2) NULL,\n	IBWK01 decimal(7, 2) NULL,\n	IBWK02 decimal(7, 2) NULL,\n	IBWK03 decimal(7, 2) NULL,\n	IBWK"
+"04 decimal(7, 2) NULL,\n	IBWK05 decimal(7, 2) NULL,\n	IBWK06 decimal(7, 2) NULL,\n	IBWK07 decimal(7, 2) NULL,\n	IBWK08 d"
+"ecimal(7, 2) NULL,\n	IBNORD decimal(5, 0) NULL,\n	IBLEAD decimal(5, 0) NULL,\n	IBRSUP decimal(9, 2) NULL,\n	IBRSUY decim"
+"al(9, 2) NULL,\n	IBRSDP decimal(11, 2) NULL,\n	IBRSDY decimal(11, 2) NULL,\n	IBVRSP decimal(11, 2) NULL,\n	IBVRSY decima"
+"l(11, 2) NULL,\n	IBRCSP decimal(11, 2) NULL,\n	IBRCSY decimal(11, 2) NULL,\n	IBASUP decimal(7, 2) NULL,\n	IBASUY decimal"
+"(9, 2) NULL,\n	IBASDP decimal(9, 2) NULL,\n	IBASDY decimal(9, 2) NULL,\n	IBVASP decimal(9, 2) NULL,\n	IBVASY decimal(9, "
+"2) NULL,\n	IBACSP decimal(9, 2) NULL,\n	IBACSY decimal(9, 2) NULL,\n	IBRETS decimal(9, 2) NULL,\n	IBRCUP decimal(9, 2) N"
+"ULL,\n	IBRCUY decimal(9, 2) NULL,\n	IBRCDP decimal(11, 2) NULL,\n	IBRCDY decimal(11, 2) NULL,\n	IBTIUP decimal(9, 2) NUL"
+"L,\n	IBTIUY decimal(9, 2) NULL,\n	IBTOUP decimal(9, 2) NULL,\n	IBTOUY decimal(9, 2) NULL,\n	IBTFDP decimal(11, 2) NULL,"
+"\n	IBTFDY decimal(11, 2) NULL,\n	IBRVUP decimal(7, 2) NULL,\n	IBRVUY decimal(7, 2) NULL,\n	IBRVDP decimal(9, 2) NULL,\n	I"
+"BRVDY decimal(9, 2) NULL,\n	IBAJUP decimal(7, 2) NULL,\n	IBAJUY decimal(7, 2) NULL,\n	IBAJDP decimal(9, 2) NULL,\n	IBAJD"
+"Y decimal(9, 2) NULL,\n	IBPHUP decimal(7, 2) NULL,\n	IBPHUY decimal(7, 2) NULL,\n	IBPHDP decimal(9, 2) NULL,\n	IBPHDY de"
+"cimal(9, 2) NULL,\n	IBCEN1 decimal(1, 0) NULL,\n	IBALD1 decimal(6, 0) NULL,\n	IBCEN2 decimal(1, 0) NULL,\n	IBALD2 decima"
+"l(6, 0) NULL,\n	IBCEN3 decimal(1, 0) NULL,\n	IBALD3 decimal(6, 0) NULL,\n	IBCEN4 decimal(1, 0) NULL,\n	IBALD4 decimal(6,"
+" 0) NULL,\n	IBCEN5 decimal(1, 0) NULL,\n	IBALD5 decimal(6, 0) NULL,\n	IBAVGC decimal(11, 4) NULL,\n	IBQLRC decimal(9, 2)"
+" NULL,\n	IBAVOH decimal(9, 2) NULL,\n	IBAVRT decimal(9, 2) NULL,\n	IBAVCS decimal(11, 3) NULL,\n	IBOSCR char(1) NULL,\n	"
+"IBOS01 char(1) NULL,\n	IBOS02 char(1) NULL,\n	IBOS03 char(1) NULL,\n	IBOS04 char(1) NULL,\n	IBOS05 char(1) NULL,\n	IBOS0"
+"6 char(1) NULL,\n	IBOS07 char(1) NULL,\n	IBOS08 char(1) NULL,\n	IBDEPT decimal(3, 0) NULL,\n	IBSDPT decimal(3, 0) NULL,"
+"\n	IBCLAS decimal(3, 0) NULL,\n	IBSCLS decimal(3, 0) NULL,\n	IBFRCN decimal(1, 0) NULL,\n	IBFRDT decimal(6, 0) NULL,\n	IB"
+"VNDR decimal(6, 0) NULL,\n	IBSTYL char(15) NULL,\n	IBPOOQ decimal(9, 2) NULL,\n	IBTOOQ decimal(9, 2) NULL,\n	IBINTQ deci"
+"mal(9, 2) NULL,\n	IBMASU decimal(9, 2) NULL,\n	IBMASD decimal(11, 2) NULL,\n	IBMASV decimal(11, 2) NULL,\n	IBMASC decima"
+"l(11, 2) NULL,\n	IBLAVC decimal(11, 4) NULL,\n	IBARQT decimal(9, 2) NULL,\n	IBNSQT decimal(9, 2) NULL,\n	IBPHND decimal("
+"9, 2) NULL,\n	IBHLDQ decimal(9, 2) NULL,\n	IBCRCD char(3) NULL, \n    DATELOADED DATE\n)\n\n");
 		                    
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
 		                    
 		                    props_tDBRow_2.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    
 		                    props_tDBRow_2.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];

	
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

				
			    public BigDecimal IBHBOY;

				public BigDecimal getIBHBOY () {
					return this.IBHBOY;
				}

				public Boolean IBHBOYIsNullable(){
				    return true;
				}
				public Boolean IBHBOYIsKey(){
				    return false;
				}
				public Integer IBHBOYLength(){
				    return null;
				}
				public Integer IBHBOYPrecision(){
				    return null;
				}
				public String IBHBOYDefault(){
				
					return "";
				
				}
				public String IBHBOYComment(){
				
				    return "";
				
				}
				public String IBHBOYPattern(){
				
					return "";
				
				}
				public String IBHBOYOriginalDbColumnName(){
				
					return "IBHBOY";
				
				}

				
			    public BigDecimal IBHBOP;

				public BigDecimal getIBHBOP () {
					return this.IBHBOP;
				}

				public Boolean IBHBOPIsNullable(){
				    return true;
				}
				public Boolean IBHBOPIsKey(){
				    return false;
				}
				public Integer IBHBOPLength(){
				    return null;
				}
				public Integer IBHBOPPrecision(){
				    return null;
				}
				public String IBHBOPDefault(){
				
					return "";
				
				}
				public String IBHBOPComment(){
				
				    return "";
				
				}
				public String IBHBOPPattern(){
				
					return "";
				
				}
				public String IBHBOPOriginalDbColumnName(){
				
					return "IBHBOP";
				
				}

				
			    public BigDecimal IBHAND;

				public BigDecimal getIBHAND () {
					return this.IBHAND;
				}

				public Boolean IBHANDIsNullable(){
				    return true;
				}
				public Boolean IBHANDIsKey(){
				    return false;
				}
				public Integer IBHANDLength(){
				    return null;
				}
				public Integer IBHANDPrecision(){
				    return null;
				}
				public String IBHANDDefault(){
				
					return "";
				
				}
				public String IBHANDComment(){
				
				    return "";
				
				}
				public String IBHANDPattern(){
				
					return "";
				
				}
				public String IBHANDOriginalDbColumnName(){
				
					return "IBHAND";
				
				}

				
			    public BigDecimal IBTRNS;

				public BigDecimal getIBTRNS () {
					return this.IBTRNS;
				}

				public Boolean IBTRNSIsNullable(){
				    return true;
				}
				public Boolean IBTRNSIsKey(){
				    return false;
				}
				public Integer IBTRNSLength(){
				    return null;
				}
				public Integer IBTRNSPrecision(){
				    return null;
				}
				public String IBTRNSDefault(){
				
					return "";
				
				}
				public String IBTRNSComment(){
				
				    return "";
				
				}
				public String IBTRNSPattern(){
				
					return "";
				
				}
				public String IBTRNSOriginalDbColumnName(){
				
					return "IBTRNS";
				
				}

				
			    public BigDecimal IBGMRI;

				public BigDecimal getIBGMRI () {
					return this.IBGMRI;
				}

				public Boolean IBGMRIIsNullable(){
				    return true;
				}
				public Boolean IBGMRIIsKey(){
				    return false;
				}
				public Integer IBGMRILength(){
				    return null;
				}
				public Integer IBGMRIPrecision(){
				    return null;
				}
				public String IBGMRIDefault(){
				
					return "";
				
				}
				public String IBGMRIComment(){
				
				    return "";
				
				}
				public String IBGMRIPattern(){
				
					return "";
				
				}
				public String IBGMRIOriginalDbColumnName(){
				
					return "IBGMRI";
				
				}

				
			    public BigDecimal IBWKCR;

				public BigDecimal getIBWKCR () {
					return this.IBWKCR;
				}

				public Boolean IBWKCRIsNullable(){
				    return true;
				}
				public Boolean IBWKCRIsKey(){
				    return false;
				}
				public Integer IBWKCRLength(){
				    return null;
				}
				public Integer IBWKCRPrecision(){
				    return null;
				}
				public String IBWKCRDefault(){
				
					return "";
				
				}
				public String IBWKCRComment(){
				
				    return "";
				
				}
				public String IBWKCRPattern(){
				
					return "";
				
				}
				public String IBWKCROriginalDbColumnName(){
				
					return "IBWKCR";
				
				}

				
			    public BigDecimal IBWK01;

				public BigDecimal getIBWK01 () {
					return this.IBWK01;
				}

				public Boolean IBWK01IsNullable(){
				    return true;
				}
				public Boolean IBWK01IsKey(){
				    return false;
				}
				public Integer IBWK01Length(){
				    return null;
				}
				public Integer IBWK01Precision(){
				    return null;
				}
				public String IBWK01Default(){
				
					return "";
				
				}
				public String IBWK01Comment(){
				
				    return "";
				
				}
				public String IBWK01Pattern(){
				
					return "";
				
				}
				public String IBWK01OriginalDbColumnName(){
				
					return "IBWK01";
				
				}

				
			    public BigDecimal IBWK02;

				public BigDecimal getIBWK02 () {
					return this.IBWK02;
				}

				public Boolean IBWK02IsNullable(){
				    return true;
				}
				public Boolean IBWK02IsKey(){
				    return false;
				}
				public Integer IBWK02Length(){
				    return null;
				}
				public Integer IBWK02Precision(){
				    return null;
				}
				public String IBWK02Default(){
				
					return "";
				
				}
				public String IBWK02Comment(){
				
				    return "";
				
				}
				public String IBWK02Pattern(){
				
					return "";
				
				}
				public String IBWK02OriginalDbColumnName(){
				
					return "IBWK02";
				
				}

				
			    public BigDecimal IBWK03;

				public BigDecimal getIBWK03 () {
					return this.IBWK03;
				}

				public Boolean IBWK03IsNullable(){
				    return true;
				}
				public Boolean IBWK03IsKey(){
				    return false;
				}
				public Integer IBWK03Length(){
				    return null;
				}
				public Integer IBWK03Precision(){
				    return null;
				}
				public String IBWK03Default(){
				
					return "";
				
				}
				public String IBWK03Comment(){
				
				    return "";
				
				}
				public String IBWK03Pattern(){
				
					return "";
				
				}
				public String IBWK03OriginalDbColumnName(){
				
					return "IBWK03";
				
				}

				
			    public BigDecimal IBWK04;

				public BigDecimal getIBWK04 () {
					return this.IBWK04;
				}

				public Boolean IBWK04IsNullable(){
				    return true;
				}
				public Boolean IBWK04IsKey(){
				    return false;
				}
				public Integer IBWK04Length(){
				    return null;
				}
				public Integer IBWK04Precision(){
				    return null;
				}
				public String IBWK04Default(){
				
					return "";
				
				}
				public String IBWK04Comment(){
				
				    return "";
				
				}
				public String IBWK04Pattern(){
				
					return "";
				
				}
				public String IBWK04OriginalDbColumnName(){
				
					return "IBWK04";
				
				}

				
			    public BigDecimal IBWK05;

				public BigDecimal getIBWK05 () {
					return this.IBWK05;
				}

				public Boolean IBWK05IsNullable(){
				    return true;
				}
				public Boolean IBWK05IsKey(){
				    return false;
				}
				public Integer IBWK05Length(){
				    return null;
				}
				public Integer IBWK05Precision(){
				    return null;
				}
				public String IBWK05Default(){
				
					return "";
				
				}
				public String IBWK05Comment(){
				
				    return "";
				
				}
				public String IBWK05Pattern(){
				
					return "";
				
				}
				public String IBWK05OriginalDbColumnName(){
				
					return "IBWK05";
				
				}

				
			    public BigDecimal IBWK06;

				public BigDecimal getIBWK06 () {
					return this.IBWK06;
				}

				public Boolean IBWK06IsNullable(){
				    return true;
				}
				public Boolean IBWK06IsKey(){
				    return false;
				}
				public Integer IBWK06Length(){
				    return null;
				}
				public Integer IBWK06Precision(){
				    return null;
				}
				public String IBWK06Default(){
				
					return "";
				
				}
				public String IBWK06Comment(){
				
				    return "";
				
				}
				public String IBWK06Pattern(){
				
					return "";
				
				}
				public String IBWK06OriginalDbColumnName(){
				
					return "IBWK06";
				
				}

				
			    public BigDecimal IBWK07;

				public BigDecimal getIBWK07 () {
					return this.IBWK07;
				}

				public Boolean IBWK07IsNullable(){
				    return true;
				}
				public Boolean IBWK07IsKey(){
				    return false;
				}
				public Integer IBWK07Length(){
				    return null;
				}
				public Integer IBWK07Precision(){
				    return null;
				}
				public String IBWK07Default(){
				
					return "";
				
				}
				public String IBWK07Comment(){
				
				    return "";
				
				}
				public String IBWK07Pattern(){
				
					return "";
				
				}
				public String IBWK07OriginalDbColumnName(){
				
					return "IBWK07";
				
				}

				
			    public BigDecimal IBWK08;

				public BigDecimal getIBWK08 () {
					return this.IBWK08;
				}

				public Boolean IBWK08IsNullable(){
				    return true;
				}
				public Boolean IBWK08IsKey(){
				    return false;
				}
				public Integer IBWK08Length(){
				    return null;
				}
				public Integer IBWK08Precision(){
				    return null;
				}
				public String IBWK08Default(){
				
					return "";
				
				}
				public String IBWK08Comment(){
				
				    return "";
				
				}
				public String IBWK08Pattern(){
				
					return "";
				
				}
				public String IBWK08OriginalDbColumnName(){
				
					return "IBWK08";
				
				}

				
			    public BigDecimal IBNORD;

				public BigDecimal getIBNORD () {
					return this.IBNORD;
				}

				public Boolean IBNORDIsNullable(){
				    return true;
				}
				public Boolean IBNORDIsKey(){
				    return false;
				}
				public Integer IBNORDLength(){
				    return null;
				}
				public Integer IBNORDPrecision(){
				    return null;
				}
				public String IBNORDDefault(){
				
					return "";
				
				}
				public String IBNORDComment(){
				
				    return "";
				
				}
				public String IBNORDPattern(){
				
					return "";
				
				}
				public String IBNORDOriginalDbColumnName(){
				
					return "IBNORD";
				
				}

				
			    public BigDecimal IBLEAD;

				public BigDecimal getIBLEAD () {
					return this.IBLEAD;
				}

				public Boolean IBLEADIsNullable(){
				    return true;
				}
				public Boolean IBLEADIsKey(){
				    return false;
				}
				public Integer IBLEADLength(){
				    return null;
				}
				public Integer IBLEADPrecision(){
				    return null;
				}
				public String IBLEADDefault(){
				
					return "";
				
				}
				public String IBLEADComment(){
				
				    return "";
				
				}
				public String IBLEADPattern(){
				
					return "";
				
				}
				public String IBLEADOriginalDbColumnName(){
				
					return "IBLEAD";
				
				}

				
			    public BigDecimal IBRSUP;

				public BigDecimal getIBRSUP () {
					return this.IBRSUP;
				}

				public Boolean IBRSUPIsNullable(){
				    return true;
				}
				public Boolean IBRSUPIsKey(){
				    return false;
				}
				public Integer IBRSUPLength(){
				    return null;
				}
				public Integer IBRSUPPrecision(){
				    return null;
				}
				public String IBRSUPDefault(){
				
					return "";
				
				}
				public String IBRSUPComment(){
				
				    return "";
				
				}
				public String IBRSUPPattern(){
				
					return "";
				
				}
				public String IBRSUPOriginalDbColumnName(){
				
					return "IBRSUP";
				
				}

				
			    public BigDecimal IBRSUY;

				public BigDecimal getIBRSUY () {
					return this.IBRSUY;
				}

				public Boolean IBRSUYIsNullable(){
				    return true;
				}
				public Boolean IBRSUYIsKey(){
				    return false;
				}
				public Integer IBRSUYLength(){
				    return null;
				}
				public Integer IBRSUYPrecision(){
				    return null;
				}
				public String IBRSUYDefault(){
				
					return "";
				
				}
				public String IBRSUYComment(){
				
				    return "";
				
				}
				public String IBRSUYPattern(){
				
					return "";
				
				}
				public String IBRSUYOriginalDbColumnName(){
				
					return "IBRSUY";
				
				}

				
			    public BigDecimal IBRSDP;

				public BigDecimal getIBRSDP () {
					return this.IBRSDP;
				}

				public Boolean IBRSDPIsNullable(){
				    return true;
				}
				public Boolean IBRSDPIsKey(){
				    return false;
				}
				public Integer IBRSDPLength(){
				    return null;
				}
				public Integer IBRSDPPrecision(){
				    return null;
				}
				public String IBRSDPDefault(){
				
					return "";
				
				}
				public String IBRSDPComment(){
				
				    return "";
				
				}
				public String IBRSDPPattern(){
				
					return "";
				
				}
				public String IBRSDPOriginalDbColumnName(){
				
					return "IBRSDP";
				
				}

				
			    public BigDecimal IBRSDY;

				public BigDecimal getIBRSDY () {
					return this.IBRSDY;
				}

				public Boolean IBRSDYIsNullable(){
				    return true;
				}
				public Boolean IBRSDYIsKey(){
				    return false;
				}
				public Integer IBRSDYLength(){
				    return null;
				}
				public Integer IBRSDYPrecision(){
				    return null;
				}
				public String IBRSDYDefault(){
				
					return "";
				
				}
				public String IBRSDYComment(){
				
				    return "";
				
				}
				public String IBRSDYPattern(){
				
					return "";
				
				}
				public String IBRSDYOriginalDbColumnName(){
				
					return "IBRSDY";
				
				}

				
			    public BigDecimal IBVRSP;

				public BigDecimal getIBVRSP () {
					return this.IBVRSP;
				}

				public Boolean IBVRSPIsNullable(){
				    return true;
				}
				public Boolean IBVRSPIsKey(){
				    return false;
				}
				public Integer IBVRSPLength(){
				    return null;
				}
				public Integer IBVRSPPrecision(){
				    return null;
				}
				public String IBVRSPDefault(){
				
					return "";
				
				}
				public String IBVRSPComment(){
				
				    return "";
				
				}
				public String IBVRSPPattern(){
				
					return "";
				
				}
				public String IBVRSPOriginalDbColumnName(){
				
					return "IBVRSP";
				
				}

				
			    public BigDecimal IBVRSY;

				public BigDecimal getIBVRSY () {
					return this.IBVRSY;
				}

				public Boolean IBVRSYIsNullable(){
				    return true;
				}
				public Boolean IBVRSYIsKey(){
				    return false;
				}
				public Integer IBVRSYLength(){
				    return null;
				}
				public Integer IBVRSYPrecision(){
				    return null;
				}
				public String IBVRSYDefault(){
				
					return "";
				
				}
				public String IBVRSYComment(){
				
				    return "";
				
				}
				public String IBVRSYPattern(){
				
					return "";
				
				}
				public String IBVRSYOriginalDbColumnName(){
				
					return "IBVRSY";
				
				}

				
			    public BigDecimal IBRCSP;

				public BigDecimal getIBRCSP () {
					return this.IBRCSP;
				}

				public Boolean IBRCSPIsNullable(){
				    return true;
				}
				public Boolean IBRCSPIsKey(){
				    return false;
				}
				public Integer IBRCSPLength(){
				    return null;
				}
				public Integer IBRCSPPrecision(){
				    return null;
				}
				public String IBRCSPDefault(){
				
					return "";
				
				}
				public String IBRCSPComment(){
				
				    return "";
				
				}
				public String IBRCSPPattern(){
				
					return "";
				
				}
				public String IBRCSPOriginalDbColumnName(){
				
					return "IBRCSP";
				
				}

				
			    public BigDecimal IBRCSY;

				public BigDecimal getIBRCSY () {
					return this.IBRCSY;
				}

				public Boolean IBRCSYIsNullable(){
				    return true;
				}
				public Boolean IBRCSYIsKey(){
				    return false;
				}
				public Integer IBRCSYLength(){
				    return null;
				}
				public Integer IBRCSYPrecision(){
				    return null;
				}
				public String IBRCSYDefault(){
				
					return "";
				
				}
				public String IBRCSYComment(){
				
				    return "";
				
				}
				public String IBRCSYPattern(){
				
					return "";
				
				}
				public String IBRCSYOriginalDbColumnName(){
				
					return "IBRCSY";
				
				}

				
			    public BigDecimal IBASUP;

				public BigDecimal getIBASUP () {
					return this.IBASUP;
				}

				public Boolean IBASUPIsNullable(){
				    return true;
				}
				public Boolean IBASUPIsKey(){
				    return false;
				}
				public Integer IBASUPLength(){
				    return null;
				}
				public Integer IBASUPPrecision(){
				    return null;
				}
				public String IBASUPDefault(){
				
					return "";
				
				}
				public String IBASUPComment(){
				
				    return "";
				
				}
				public String IBASUPPattern(){
				
					return "";
				
				}
				public String IBASUPOriginalDbColumnName(){
				
					return "IBASUP";
				
				}

				
			    public BigDecimal IBASUY;

				public BigDecimal getIBASUY () {
					return this.IBASUY;
				}

				public Boolean IBASUYIsNullable(){
				    return true;
				}
				public Boolean IBASUYIsKey(){
				    return false;
				}
				public Integer IBASUYLength(){
				    return null;
				}
				public Integer IBASUYPrecision(){
				    return null;
				}
				public String IBASUYDefault(){
				
					return "";
				
				}
				public String IBASUYComment(){
				
				    return "";
				
				}
				public String IBASUYPattern(){
				
					return "";
				
				}
				public String IBASUYOriginalDbColumnName(){
				
					return "IBASUY";
				
				}

				
			    public BigDecimal IBASDP;

				public BigDecimal getIBASDP () {
					return this.IBASDP;
				}

				public Boolean IBASDPIsNullable(){
				    return true;
				}
				public Boolean IBASDPIsKey(){
				    return false;
				}
				public Integer IBASDPLength(){
				    return null;
				}
				public Integer IBASDPPrecision(){
				    return null;
				}
				public String IBASDPDefault(){
				
					return "";
				
				}
				public String IBASDPComment(){
				
				    return "";
				
				}
				public String IBASDPPattern(){
				
					return "";
				
				}
				public String IBASDPOriginalDbColumnName(){
				
					return "IBASDP";
				
				}

				
			    public BigDecimal IBASDY;

				public BigDecimal getIBASDY () {
					return this.IBASDY;
				}

				public Boolean IBASDYIsNullable(){
				    return true;
				}
				public Boolean IBASDYIsKey(){
				    return false;
				}
				public Integer IBASDYLength(){
				    return null;
				}
				public Integer IBASDYPrecision(){
				    return null;
				}
				public String IBASDYDefault(){
				
					return "";
				
				}
				public String IBASDYComment(){
				
				    return "";
				
				}
				public String IBASDYPattern(){
				
					return "";
				
				}
				public String IBASDYOriginalDbColumnName(){
				
					return "IBASDY";
				
				}

				
			    public BigDecimal IBVASP;

				public BigDecimal getIBVASP () {
					return this.IBVASP;
				}

				public Boolean IBVASPIsNullable(){
				    return true;
				}
				public Boolean IBVASPIsKey(){
				    return false;
				}
				public Integer IBVASPLength(){
				    return null;
				}
				public Integer IBVASPPrecision(){
				    return null;
				}
				public String IBVASPDefault(){
				
					return "";
				
				}
				public String IBVASPComment(){
				
				    return "";
				
				}
				public String IBVASPPattern(){
				
					return "";
				
				}
				public String IBVASPOriginalDbColumnName(){
				
					return "IBVASP";
				
				}

				
			    public BigDecimal IBVASY;

				public BigDecimal getIBVASY () {
					return this.IBVASY;
				}

				public Boolean IBVASYIsNullable(){
				    return true;
				}
				public Boolean IBVASYIsKey(){
				    return false;
				}
				public Integer IBVASYLength(){
				    return null;
				}
				public Integer IBVASYPrecision(){
				    return null;
				}
				public String IBVASYDefault(){
				
					return "";
				
				}
				public String IBVASYComment(){
				
				    return "";
				
				}
				public String IBVASYPattern(){
				
					return "";
				
				}
				public String IBVASYOriginalDbColumnName(){
				
					return "IBVASY";
				
				}

				
			    public BigDecimal IBACSP;

				public BigDecimal getIBACSP () {
					return this.IBACSP;
				}

				public Boolean IBACSPIsNullable(){
				    return true;
				}
				public Boolean IBACSPIsKey(){
				    return false;
				}
				public Integer IBACSPLength(){
				    return null;
				}
				public Integer IBACSPPrecision(){
				    return null;
				}
				public String IBACSPDefault(){
				
					return "";
				
				}
				public String IBACSPComment(){
				
				    return "";
				
				}
				public String IBACSPPattern(){
				
					return "";
				
				}
				public String IBACSPOriginalDbColumnName(){
				
					return "IBACSP";
				
				}

				
			    public BigDecimal IBACSY;

				public BigDecimal getIBACSY () {
					return this.IBACSY;
				}

				public Boolean IBACSYIsNullable(){
				    return true;
				}
				public Boolean IBACSYIsKey(){
				    return false;
				}
				public Integer IBACSYLength(){
				    return null;
				}
				public Integer IBACSYPrecision(){
				    return null;
				}
				public String IBACSYDefault(){
				
					return "";
				
				}
				public String IBACSYComment(){
				
				    return "";
				
				}
				public String IBACSYPattern(){
				
					return "";
				
				}
				public String IBACSYOriginalDbColumnName(){
				
					return "IBACSY";
				
				}

				
			    public BigDecimal IBRETS;

				public BigDecimal getIBRETS () {
					return this.IBRETS;
				}

				public Boolean IBRETSIsNullable(){
				    return true;
				}
				public Boolean IBRETSIsKey(){
				    return false;
				}
				public Integer IBRETSLength(){
				    return null;
				}
				public Integer IBRETSPrecision(){
				    return null;
				}
				public String IBRETSDefault(){
				
					return "";
				
				}
				public String IBRETSComment(){
				
				    return "";
				
				}
				public String IBRETSPattern(){
				
					return "";
				
				}
				public String IBRETSOriginalDbColumnName(){
				
					return "IBRETS";
				
				}

				
			    public BigDecimal IBRCUP;

				public BigDecimal getIBRCUP () {
					return this.IBRCUP;
				}

				public Boolean IBRCUPIsNullable(){
				    return true;
				}
				public Boolean IBRCUPIsKey(){
				    return false;
				}
				public Integer IBRCUPLength(){
				    return null;
				}
				public Integer IBRCUPPrecision(){
				    return null;
				}
				public String IBRCUPDefault(){
				
					return "";
				
				}
				public String IBRCUPComment(){
				
				    return "";
				
				}
				public String IBRCUPPattern(){
				
					return "";
				
				}
				public String IBRCUPOriginalDbColumnName(){
				
					return "IBRCUP";
				
				}

				
			    public BigDecimal IBRCUY;

				public BigDecimal getIBRCUY () {
					return this.IBRCUY;
				}

				public Boolean IBRCUYIsNullable(){
				    return true;
				}
				public Boolean IBRCUYIsKey(){
				    return false;
				}
				public Integer IBRCUYLength(){
				    return null;
				}
				public Integer IBRCUYPrecision(){
				    return null;
				}
				public String IBRCUYDefault(){
				
					return "";
				
				}
				public String IBRCUYComment(){
				
				    return "";
				
				}
				public String IBRCUYPattern(){
				
					return "";
				
				}
				public String IBRCUYOriginalDbColumnName(){
				
					return "IBRCUY";
				
				}

				
			    public BigDecimal IBRCDP;

				public BigDecimal getIBRCDP () {
					return this.IBRCDP;
				}

				public Boolean IBRCDPIsNullable(){
				    return true;
				}
				public Boolean IBRCDPIsKey(){
				    return false;
				}
				public Integer IBRCDPLength(){
				    return null;
				}
				public Integer IBRCDPPrecision(){
				    return null;
				}
				public String IBRCDPDefault(){
				
					return "";
				
				}
				public String IBRCDPComment(){
				
				    return "";
				
				}
				public String IBRCDPPattern(){
				
					return "";
				
				}
				public String IBRCDPOriginalDbColumnName(){
				
					return "IBRCDP";
				
				}

				
			    public BigDecimal IBRCDY;

				public BigDecimal getIBRCDY () {
					return this.IBRCDY;
				}

				public Boolean IBRCDYIsNullable(){
				    return true;
				}
				public Boolean IBRCDYIsKey(){
				    return false;
				}
				public Integer IBRCDYLength(){
				    return null;
				}
				public Integer IBRCDYPrecision(){
				    return null;
				}
				public String IBRCDYDefault(){
				
					return "";
				
				}
				public String IBRCDYComment(){
				
				    return "";
				
				}
				public String IBRCDYPattern(){
				
					return "";
				
				}
				public String IBRCDYOriginalDbColumnName(){
				
					return "IBRCDY";
				
				}

				
			    public BigDecimal IBTIUP;

				public BigDecimal getIBTIUP () {
					return this.IBTIUP;
				}

				public Boolean IBTIUPIsNullable(){
				    return true;
				}
				public Boolean IBTIUPIsKey(){
				    return false;
				}
				public Integer IBTIUPLength(){
				    return null;
				}
				public Integer IBTIUPPrecision(){
				    return null;
				}
				public String IBTIUPDefault(){
				
					return "";
				
				}
				public String IBTIUPComment(){
				
				    return "";
				
				}
				public String IBTIUPPattern(){
				
					return "";
				
				}
				public String IBTIUPOriginalDbColumnName(){
				
					return "IBTIUP";
				
				}

				
			    public BigDecimal IBTIUY;

				public BigDecimal getIBTIUY () {
					return this.IBTIUY;
				}

				public Boolean IBTIUYIsNullable(){
				    return true;
				}
				public Boolean IBTIUYIsKey(){
				    return false;
				}
				public Integer IBTIUYLength(){
				    return null;
				}
				public Integer IBTIUYPrecision(){
				    return null;
				}
				public String IBTIUYDefault(){
				
					return "";
				
				}
				public String IBTIUYComment(){
				
				    return "";
				
				}
				public String IBTIUYPattern(){
				
					return "";
				
				}
				public String IBTIUYOriginalDbColumnName(){
				
					return "IBTIUY";
				
				}

				
			    public BigDecimal IBTOUP;

				public BigDecimal getIBTOUP () {
					return this.IBTOUP;
				}

				public Boolean IBTOUPIsNullable(){
				    return true;
				}
				public Boolean IBTOUPIsKey(){
				    return false;
				}
				public Integer IBTOUPLength(){
				    return null;
				}
				public Integer IBTOUPPrecision(){
				    return null;
				}
				public String IBTOUPDefault(){
				
					return "";
				
				}
				public String IBTOUPComment(){
				
				    return "";
				
				}
				public String IBTOUPPattern(){
				
					return "";
				
				}
				public String IBTOUPOriginalDbColumnName(){
				
					return "IBTOUP";
				
				}

				
			    public BigDecimal IBTOUY;

				public BigDecimal getIBTOUY () {
					return this.IBTOUY;
				}

				public Boolean IBTOUYIsNullable(){
				    return true;
				}
				public Boolean IBTOUYIsKey(){
				    return false;
				}
				public Integer IBTOUYLength(){
				    return null;
				}
				public Integer IBTOUYPrecision(){
				    return null;
				}
				public String IBTOUYDefault(){
				
					return "";
				
				}
				public String IBTOUYComment(){
				
				    return "";
				
				}
				public String IBTOUYPattern(){
				
					return "";
				
				}
				public String IBTOUYOriginalDbColumnName(){
				
					return "IBTOUY";
				
				}

				
			    public BigDecimal IBTFDP;

				public BigDecimal getIBTFDP () {
					return this.IBTFDP;
				}

				public Boolean IBTFDPIsNullable(){
				    return true;
				}
				public Boolean IBTFDPIsKey(){
				    return false;
				}
				public Integer IBTFDPLength(){
				    return null;
				}
				public Integer IBTFDPPrecision(){
				    return null;
				}
				public String IBTFDPDefault(){
				
					return "";
				
				}
				public String IBTFDPComment(){
				
				    return "";
				
				}
				public String IBTFDPPattern(){
				
					return "";
				
				}
				public String IBTFDPOriginalDbColumnName(){
				
					return "IBTFDP";
				
				}

				
			    public BigDecimal IBTFDY;

				public BigDecimal getIBTFDY () {
					return this.IBTFDY;
				}

				public Boolean IBTFDYIsNullable(){
				    return true;
				}
				public Boolean IBTFDYIsKey(){
				    return false;
				}
				public Integer IBTFDYLength(){
				    return null;
				}
				public Integer IBTFDYPrecision(){
				    return null;
				}
				public String IBTFDYDefault(){
				
					return "";
				
				}
				public String IBTFDYComment(){
				
				    return "";
				
				}
				public String IBTFDYPattern(){
				
					return "";
				
				}
				public String IBTFDYOriginalDbColumnName(){
				
					return "IBTFDY";
				
				}

				
			    public BigDecimal IBRVUP;

				public BigDecimal getIBRVUP () {
					return this.IBRVUP;
				}

				public Boolean IBRVUPIsNullable(){
				    return true;
				}
				public Boolean IBRVUPIsKey(){
				    return false;
				}
				public Integer IBRVUPLength(){
				    return null;
				}
				public Integer IBRVUPPrecision(){
				    return null;
				}
				public String IBRVUPDefault(){
				
					return "";
				
				}
				public String IBRVUPComment(){
				
				    return "";
				
				}
				public String IBRVUPPattern(){
				
					return "";
				
				}
				public String IBRVUPOriginalDbColumnName(){
				
					return "IBRVUP";
				
				}

				
			    public BigDecimal IBRVUY;

				public BigDecimal getIBRVUY () {
					return this.IBRVUY;
				}

				public Boolean IBRVUYIsNullable(){
				    return true;
				}
				public Boolean IBRVUYIsKey(){
				    return false;
				}
				public Integer IBRVUYLength(){
				    return null;
				}
				public Integer IBRVUYPrecision(){
				    return null;
				}
				public String IBRVUYDefault(){
				
					return "";
				
				}
				public String IBRVUYComment(){
				
				    return "";
				
				}
				public String IBRVUYPattern(){
				
					return "";
				
				}
				public String IBRVUYOriginalDbColumnName(){
				
					return "IBRVUY";
				
				}

				
			    public BigDecimal IBRVDP;

				public BigDecimal getIBRVDP () {
					return this.IBRVDP;
				}

				public Boolean IBRVDPIsNullable(){
				    return true;
				}
				public Boolean IBRVDPIsKey(){
				    return false;
				}
				public Integer IBRVDPLength(){
				    return null;
				}
				public Integer IBRVDPPrecision(){
				    return null;
				}
				public String IBRVDPDefault(){
				
					return "";
				
				}
				public String IBRVDPComment(){
				
				    return "";
				
				}
				public String IBRVDPPattern(){
				
					return "";
				
				}
				public String IBRVDPOriginalDbColumnName(){
				
					return "IBRVDP";
				
				}

				
			    public BigDecimal IBRVDY;

				public BigDecimal getIBRVDY () {
					return this.IBRVDY;
				}

				public Boolean IBRVDYIsNullable(){
				    return true;
				}
				public Boolean IBRVDYIsKey(){
				    return false;
				}
				public Integer IBRVDYLength(){
				    return null;
				}
				public Integer IBRVDYPrecision(){
				    return null;
				}
				public String IBRVDYDefault(){
				
					return "";
				
				}
				public String IBRVDYComment(){
				
				    return "";
				
				}
				public String IBRVDYPattern(){
				
					return "";
				
				}
				public String IBRVDYOriginalDbColumnName(){
				
					return "IBRVDY";
				
				}

				
			    public BigDecimal IBAJUP;

				public BigDecimal getIBAJUP () {
					return this.IBAJUP;
				}

				public Boolean IBAJUPIsNullable(){
				    return true;
				}
				public Boolean IBAJUPIsKey(){
				    return false;
				}
				public Integer IBAJUPLength(){
				    return null;
				}
				public Integer IBAJUPPrecision(){
				    return null;
				}
				public String IBAJUPDefault(){
				
					return "";
				
				}
				public String IBAJUPComment(){
				
				    return "";
				
				}
				public String IBAJUPPattern(){
				
					return "";
				
				}
				public String IBAJUPOriginalDbColumnName(){
				
					return "IBAJUP";
				
				}

				
			    public BigDecimal IBAJUY;

				public BigDecimal getIBAJUY () {
					return this.IBAJUY;
				}

				public Boolean IBAJUYIsNullable(){
				    return true;
				}
				public Boolean IBAJUYIsKey(){
				    return false;
				}
				public Integer IBAJUYLength(){
				    return null;
				}
				public Integer IBAJUYPrecision(){
				    return null;
				}
				public String IBAJUYDefault(){
				
					return "";
				
				}
				public String IBAJUYComment(){
				
				    return "";
				
				}
				public String IBAJUYPattern(){
				
					return "";
				
				}
				public String IBAJUYOriginalDbColumnName(){
				
					return "IBAJUY";
				
				}

				
			    public BigDecimal IBAJDP;

				public BigDecimal getIBAJDP () {
					return this.IBAJDP;
				}

				public Boolean IBAJDPIsNullable(){
				    return true;
				}
				public Boolean IBAJDPIsKey(){
				    return false;
				}
				public Integer IBAJDPLength(){
				    return null;
				}
				public Integer IBAJDPPrecision(){
				    return null;
				}
				public String IBAJDPDefault(){
				
					return "";
				
				}
				public String IBAJDPComment(){
				
				    return "";
				
				}
				public String IBAJDPPattern(){
				
					return "";
				
				}
				public String IBAJDPOriginalDbColumnName(){
				
					return "IBAJDP";
				
				}

				
			    public BigDecimal IBAJDY;

				public BigDecimal getIBAJDY () {
					return this.IBAJDY;
				}

				public Boolean IBAJDYIsNullable(){
				    return true;
				}
				public Boolean IBAJDYIsKey(){
				    return false;
				}
				public Integer IBAJDYLength(){
				    return null;
				}
				public Integer IBAJDYPrecision(){
				    return null;
				}
				public String IBAJDYDefault(){
				
					return "";
				
				}
				public String IBAJDYComment(){
				
				    return "";
				
				}
				public String IBAJDYPattern(){
				
					return "";
				
				}
				public String IBAJDYOriginalDbColumnName(){
				
					return "IBAJDY";
				
				}

				
			    public BigDecimal IBPHUP;

				public BigDecimal getIBPHUP () {
					return this.IBPHUP;
				}

				public Boolean IBPHUPIsNullable(){
				    return true;
				}
				public Boolean IBPHUPIsKey(){
				    return false;
				}
				public Integer IBPHUPLength(){
				    return null;
				}
				public Integer IBPHUPPrecision(){
				    return null;
				}
				public String IBPHUPDefault(){
				
					return "";
				
				}
				public String IBPHUPComment(){
				
				    return "";
				
				}
				public String IBPHUPPattern(){
				
					return "";
				
				}
				public String IBPHUPOriginalDbColumnName(){
				
					return "IBPHUP";
				
				}

				
			    public BigDecimal IBPHUY;

				public BigDecimal getIBPHUY () {
					return this.IBPHUY;
				}

				public Boolean IBPHUYIsNullable(){
				    return true;
				}
				public Boolean IBPHUYIsKey(){
				    return false;
				}
				public Integer IBPHUYLength(){
				    return null;
				}
				public Integer IBPHUYPrecision(){
				    return null;
				}
				public String IBPHUYDefault(){
				
					return "";
				
				}
				public String IBPHUYComment(){
				
				    return "";
				
				}
				public String IBPHUYPattern(){
				
					return "";
				
				}
				public String IBPHUYOriginalDbColumnName(){
				
					return "IBPHUY";
				
				}

				
			    public BigDecimal IBPHDP;

				public BigDecimal getIBPHDP () {
					return this.IBPHDP;
				}

				public Boolean IBPHDPIsNullable(){
				    return true;
				}
				public Boolean IBPHDPIsKey(){
				    return false;
				}
				public Integer IBPHDPLength(){
				    return null;
				}
				public Integer IBPHDPPrecision(){
				    return null;
				}
				public String IBPHDPDefault(){
				
					return "";
				
				}
				public String IBPHDPComment(){
				
				    return "";
				
				}
				public String IBPHDPPattern(){
				
					return "";
				
				}
				public String IBPHDPOriginalDbColumnName(){
				
					return "IBPHDP";
				
				}

				
			    public BigDecimal IBPHDY;

				public BigDecimal getIBPHDY () {
					return this.IBPHDY;
				}

				public Boolean IBPHDYIsNullable(){
				    return true;
				}
				public Boolean IBPHDYIsKey(){
				    return false;
				}
				public Integer IBPHDYLength(){
				    return null;
				}
				public Integer IBPHDYPrecision(){
				    return null;
				}
				public String IBPHDYDefault(){
				
					return "";
				
				}
				public String IBPHDYComment(){
				
				    return "";
				
				}
				public String IBPHDYPattern(){
				
					return "";
				
				}
				public String IBPHDYOriginalDbColumnName(){
				
					return "IBPHDY";
				
				}

				
			    public BigDecimal IBCEN1;

				public BigDecimal getIBCEN1 () {
					return this.IBCEN1;
				}

				public Boolean IBCEN1IsNullable(){
				    return true;
				}
				public Boolean IBCEN1IsKey(){
				    return false;
				}
				public Integer IBCEN1Length(){
				    return null;
				}
				public Integer IBCEN1Precision(){
				    return null;
				}
				public String IBCEN1Default(){
				
					return "";
				
				}
				public String IBCEN1Comment(){
				
				    return "";
				
				}
				public String IBCEN1Pattern(){
				
					return "";
				
				}
				public String IBCEN1OriginalDbColumnName(){
				
					return "IBCEN1";
				
				}

				
			    public BigDecimal IBALD1;

				public BigDecimal getIBALD1 () {
					return this.IBALD1;
				}

				public Boolean IBALD1IsNullable(){
				    return true;
				}
				public Boolean IBALD1IsKey(){
				    return false;
				}
				public Integer IBALD1Length(){
				    return null;
				}
				public Integer IBALD1Precision(){
				    return null;
				}
				public String IBALD1Default(){
				
					return "";
				
				}
				public String IBALD1Comment(){
				
				    return "";
				
				}
				public String IBALD1Pattern(){
				
					return "";
				
				}
				public String IBALD1OriginalDbColumnName(){
				
					return "IBALD1";
				
				}

				
			    public BigDecimal IBCEN2;

				public BigDecimal getIBCEN2 () {
					return this.IBCEN2;
				}

				public Boolean IBCEN2IsNullable(){
				    return true;
				}
				public Boolean IBCEN2IsKey(){
				    return false;
				}
				public Integer IBCEN2Length(){
				    return null;
				}
				public Integer IBCEN2Precision(){
				    return null;
				}
				public String IBCEN2Default(){
				
					return "";
				
				}
				public String IBCEN2Comment(){
				
				    return "";
				
				}
				public String IBCEN2Pattern(){
				
					return "";
				
				}
				public String IBCEN2OriginalDbColumnName(){
				
					return "IBCEN2";
				
				}

				
			    public BigDecimal IBALD2;

				public BigDecimal getIBALD2 () {
					return this.IBALD2;
				}

				public Boolean IBALD2IsNullable(){
				    return true;
				}
				public Boolean IBALD2IsKey(){
				    return false;
				}
				public Integer IBALD2Length(){
				    return null;
				}
				public Integer IBALD2Precision(){
				    return null;
				}
				public String IBALD2Default(){
				
					return "";
				
				}
				public String IBALD2Comment(){
				
				    return "";
				
				}
				public String IBALD2Pattern(){
				
					return "";
				
				}
				public String IBALD2OriginalDbColumnName(){
				
					return "IBALD2";
				
				}

				
			    public BigDecimal IBCEN3;

				public BigDecimal getIBCEN3 () {
					return this.IBCEN3;
				}

				public Boolean IBCEN3IsNullable(){
				    return true;
				}
				public Boolean IBCEN3IsKey(){
				    return false;
				}
				public Integer IBCEN3Length(){
				    return null;
				}
				public Integer IBCEN3Precision(){
				    return null;
				}
				public String IBCEN3Default(){
				
					return "";
				
				}
				public String IBCEN3Comment(){
				
				    return "";
				
				}
				public String IBCEN3Pattern(){
				
					return "";
				
				}
				public String IBCEN3OriginalDbColumnName(){
				
					return "IBCEN3";
				
				}

				
			    public BigDecimal IBALD3;

				public BigDecimal getIBALD3 () {
					return this.IBALD3;
				}

				public Boolean IBALD3IsNullable(){
				    return true;
				}
				public Boolean IBALD3IsKey(){
				    return false;
				}
				public Integer IBALD3Length(){
				    return null;
				}
				public Integer IBALD3Precision(){
				    return null;
				}
				public String IBALD3Default(){
				
					return "";
				
				}
				public String IBALD3Comment(){
				
				    return "";
				
				}
				public String IBALD3Pattern(){
				
					return "";
				
				}
				public String IBALD3OriginalDbColumnName(){
				
					return "IBALD3";
				
				}

				
			    public BigDecimal IBCEN4;

				public BigDecimal getIBCEN4 () {
					return this.IBCEN4;
				}

				public Boolean IBCEN4IsNullable(){
				    return true;
				}
				public Boolean IBCEN4IsKey(){
				    return false;
				}
				public Integer IBCEN4Length(){
				    return null;
				}
				public Integer IBCEN4Precision(){
				    return null;
				}
				public String IBCEN4Default(){
				
					return "";
				
				}
				public String IBCEN4Comment(){
				
				    return "";
				
				}
				public String IBCEN4Pattern(){
				
					return "";
				
				}
				public String IBCEN4OriginalDbColumnName(){
				
					return "IBCEN4";
				
				}

				
			    public BigDecimal IBALD4;

				public BigDecimal getIBALD4 () {
					return this.IBALD4;
				}

				public Boolean IBALD4IsNullable(){
				    return true;
				}
				public Boolean IBALD4IsKey(){
				    return false;
				}
				public Integer IBALD4Length(){
				    return null;
				}
				public Integer IBALD4Precision(){
				    return null;
				}
				public String IBALD4Default(){
				
					return "";
				
				}
				public String IBALD4Comment(){
				
				    return "";
				
				}
				public String IBALD4Pattern(){
				
					return "";
				
				}
				public String IBALD4OriginalDbColumnName(){
				
					return "IBALD4";
				
				}

				
			    public BigDecimal IBCEN5;

				public BigDecimal getIBCEN5 () {
					return this.IBCEN5;
				}

				public Boolean IBCEN5IsNullable(){
				    return true;
				}
				public Boolean IBCEN5IsKey(){
				    return false;
				}
				public Integer IBCEN5Length(){
				    return null;
				}
				public Integer IBCEN5Precision(){
				    return null;
				}
				public String IBCEN5Default(){
				
					return "";
				
				}
				public String IBCEN5Comment(){
				
				    return "";
				
				}
				public String IBCEN5Pattern(){
				
					return "";
				
				}
				public String IBCEN5OriginalDbColumnName(){
				
					return "IBCEN5";
				
				}

				
			    public BigDecimal IBALD5;

				public BigDecimal getIBALD5 () {
					return this.IBALD5;
				}

				public Boolean IBALD5IsNullable(){
				    return true;
				}
				public Boolean IBALD5IsKey(){
				    return false;
				}
				public Integer IBALD5Length(){
				    return null;
				}
				public Integer IBALD5Precision(){
				    return null;
				}
				public String IBALD5Default(){
				
					return "";
				
				}
				public String IBALD5Comment(){
				
				    return "";
				
				}
				public String IBALD5Pattern(){
				
					return "";
				
				}
				public String IBALD5OriginalDbColumnName(){
				
					return "IBALD5";
				
				}

				
			    public BigDecimal IBAVGC;

				public BigDecimal getIBAVGC () {
					return this.IBAVGC;
				}

				public Boolean IBAVGCIsNullable(){
				    return true;
				}
				public Boolean IBAVGCIsKey(){
				    return false;
				}
				public Integer IBAVGCLength(){
				    return null;
				}
				public Integer IBAVGCPrecision(){
				    return null;
				}
				public String IBAVGCDefault(){
				
					return "";
				
				}
				public String IBAVGCComment(){
				
				    return "";
				
				}
				public String IBAVGCPattern(){
				
					return "";
				
				}
				public String IBAVGCOriginalDbColumnName(){
				
					return "IBAVGC";
				
				}

				
			    public BigDecimal IBQLRC;

				public BigDecimal getIBQLRC () {
					return this.IBQLRC;
				}

				public Boolean IBQLRCIsNullable(){
				    return true;
				}
				public Boolean IBQLRCIsKey(){
				    return false;
				}
				public Integer IBQLRCLength(){
				    return null;
				}
				public Integer IBQLRCPrecision(){
				    return null;
				}
				public String IBQLRCDefault(){
				
					return "";
				
				}
				public String IBQLRCComment(){
				
				    return "";
				
				}
				public String IBQLRCPattern(){
				
					return "";
				
				}
				public String IBQLRCOriginalDbColumnName(){
				
					return "IBQLRC";
				
				}

				
			    public BigDecimal IBAVOH;

				public BigDecimal getIBAVOH () {
					return this.IBAVOH;
				}

				public Boolean IBAVOHIsNullable(){
				    return true;
				}
				public Boolean IBAVOHIsKey(){
				    return false;
				}
				public Integer IBAVOHLength(){
				    return null;
				}
				public Integer IBAVOHPrecision(){
				    return null;
				}
				public String IBAVOHDefault(){
				
					return "";
				
				}
				public String IBAVOHComment(){
				
				    return "";
				
				}
				public String IBAVOHPattern(){
				
					return "";
				
				}
				public String IBAVOHOriginalDbColumnName(){
				
					return "IBAVOH";
				
				}

				
			    public BigDecimal IBAVRT;

				public BigDecimal getIBAVRT () {
					return this.IBAVRT;
				}

				public Boolean IBAVRTIsNullable(){
				    return true;
				}
				public Boolean IBAVRTIsKey(){
				    return false;
				}
				public Integer IBAVRTLength(){
				    return null;
				}
				public Integer IBAVRTPrecision(){
				    return null;
				}
				public String IBAVRTDefault(){
				
					return "";
				
				}
				public String IBAVRTComment(){
				
				    return "";
				
				}
				public String IBAVRTPattern(){
				
					return "";
				
				}
				public String IBAVRTOriginalDbColumnName(){
				
					return "IBAVRT";
				
				}

				
			    public BigDecimal IBAVCS;

				public BigDecimal getIBAVCS () {
					return this.IBAVCS;
				}

				public Boolean IBAVCSIsNullable(){
				    return true;
				}
				public Boolean IBAVCSIsKey(){
				    return false;
				}
				public Integer IBAVCSLength(){
				    return null;
				}
				public Integer IBAVCSPrecision(){
				    return null;
				}
				public String IBAVCSDefault(){
				
					return "";
				
				}
				public String IBAVCSComment(){
				
				    return "";
				
				}
				public String IBAVCSPattern(){
				
					return "";
				
				}
				public String IBAVCSOriginalDbColumnName(){
				
					return "IBAVCS";
				
				}

				
			    public String IBOSCR;

				public String getIBOSCR () {
					return this.IBOSCR;
				}

				public Boolean IBOSCRIsNullable(){
				    return true;
				}
				public Boolean IBOSCRIsKey(){
				    return false;
				}
				public Integer IBOSCRLength(){
				    return null;
				}
				public Integer IBOSCRPrecision(){
				    return null;
				}
				public String IBOSCRDefault(){
				
					return "";
				
				}
				public String IBOSCRComment(){
				
				    return "";
				
				}
				public String IBOSCRPattern(){
				
					return "";
				
				}
				public String IBOSCROriginalDbColumnName(){
				
					return "IBOSCR";
				
				}

				
			    public String IBOS01;

				public String getIBOS01 () {
					return this.IBOS01;
				}

				public Boolean IBOS01IsNullable(){
				    return true;
				}
				public Boolean IBOS01IsKey(){
				    return false;
				}
				public Integer IBOS01Length(){
				    return null;
				}
				public Integer IBOS01Precision(){
				    return null;
				}
				public String IBOS01Default(){
				
					return "";
				
				}
				public String IBOS01Comment(){
				
				    return "";
				
				}
				public String IBOS01Pattern(){
				
					return "";
				
				}
				public String IBOS01OriginalDbColumnName(){
				
					return "IBOS01";
				
				}

				
			    public String IBOS02;

				public String getIBOS02 () {
					return this.IBOS02;
				}

				public Boolean IBOS02IsNullable(){
				    return true;
				}
				public Boolean IBOS02IsKey(){
				    return false;
				}
				public Integer IBOS02Length(){
				    return null;
				}
				public Integer IBOS02Precision(){
				    return null;
				}
				public String IBOS02Default(){
				
					return "";
				
				}
				public String IBOS02Comment(){
				
				    return "";
				
				}
				public String IBOS02Pattern(){
				
					return "";
				
				}
				public String IBOS02OriginalDbColumnName(){
				
					return "IBOS02";
				
				}

				
			    public String IBOS03;

				public String getIBOS03 () {
					return this.IBOS03;
				}

				public Boolean IBOS03IsNullable(){
				    return true;
				}
				public Boolean IBOS03IsKey(){
				    return false;
				}
				public Integer IBOS03Length(){
				    return null;
				}
				public Integer IBOS03Precision(){
				    return null;
				}
				public String IBOS03Default(){
				
					return "";
				
				}
				public String IBOS03Comment(){
				
				    return "";
				
				}
				public String IBOS03Pattern(){
				
					return "";
				
				}
				public String IBOS03OriginalDbColumnName(){
				
					return "IBOS03";
				
				}

				
			    public String IBOS04;

				public String getIBOS04 () {
					return this.IBOS04;
				}

				public Boolean IBOS04IsNullable(){
				    return true;
				}
				public Boolean IBOS04IsKey(){
				    return false;
				}
				public Integer IBOS04Length(){
				    return null;
				}
				public Integer IBOS04Precision(){
				    return null;
				}
				public String IBOS04Default(){
				
					return "";
				
				}
				public String IBOS04Comment(){
				
				    return "";
				
				}
				public String IBOS04Pattern(){
				
					return "";
				
				}
				public String IBOS04OriginalDbColumnName(){
				
					return "IBOS04";
				
				}

				
			    public String IBOS05;

				public String getIBOS05 () {
					return this.IBOS05;
				}

				public Boolean IBOS05IsNullable(){
				    return true;
				}
				public Boolean IBOS05IsKey(){
				    return false;
				}
				public Integer IBOS05Length(){
				    return null;
				}
				public Integer IBOS05Precision(){
				    return null;
				}
				public String IBOS05Default(){
				
					return "";
				
				}
				public String IBOS05Comment(){
				
				    return "";
				
				}
				public String IBOS05Pattern(){
				
					return "";
				
				}
				public String IBOS05OriginalDbColumnName(){
				
					return "IBOS05";
				
				}

				
			    public String IBOS06;

				public String getIBOS06 () {
					return this.IBOS06;
				}

				public Boolean IBOS06IsNullable(){
				    return true;
				}
				public Boolean IBOS06IsKey(){
				    return false;
				}
				public Integer IBOS06Length(){
				    return null;
				}
				public Integer IBOS06Precision(){
				    return null;
				}
				public String IBOS06Default(){
				
					return "";
				
				}
				public String IBOS06Comment(){
				
				    return "";
				
				}
				public String IBOS06Pattern(){
				
					return "";
				
				}
				public String IBOS06OriginalDbColumnName(){
				
					return "IBOS06";
				
				}

				
			    public String IBOS07;

				public String getIBOS07 () {
					return this.IBOS07;
				}

				public Boolean IBOS07IsNullable(){
				    return true;
				}
				public Boolean IBOS07IsKey(){
				    return false;
				}
				public Integer IBOS07Length(){
				    return null;
				}
				public Integer IBOS07Precision(){
				    return null;
				}
				public String IBOS07Default(){
				
					return "";
				
				}
				public String IBOS07Comment(){
				
				    return "";
				
				}
				public String IBOS07Pattern(){
				
					return "";
				
				}
				public String IBOS07OriginalDbColumnName(){
				
					return "IBOS07";
				
				}

				
			    public String IBOS08;

				public String getIBOS08 () {
					return this.IBOS08;
				}

				public Boolean IBOS08IsNullable(){
				    return true;
				}
				public Boolean IBOS08IsKey(){
				    return false;
				}
				public Integer IBOS08Length(){
				    return null;
				}
				public Integer IBOS08Precision(){
				    return null;
				}
				public String IBOS08Default(){
				
					return "";
				
				}
				public String IBOS08Comment(){
				
				    return "";
				
				}
				public String IBOS08Pattern(){
				
					return "";
				
				}
				public String IBOS08OriginalDbColumnName(){
				
					return "IBOS08";
				
				}

				
			    public BigDecimal IBDEPT;

				public BigDecimal getIBDEPT () {
					return this.IBDEPT;
				}

				public Boolean IBDEPTIsNullable(){
				    return true;
				}
				public Boolean IBDEPTIsKey(){
				    return false;
				}
				public Integer IBDEPTLength(){
				    return null;
				}
				public Integer IBDEPTPrecision(){
				    return null;
				}
				public String IBDEPTDefault(){
				
					return "";
				
				}
				public String IBDEPTComment(){
				
				    return "";
				
				}
				public String IBDEPTPattern(){
				
					return "";
				
				}
				public String IBDEPTOriginalDbColumnName(){
				
					return "IBDEPT";
				
				}

				
			    public BigDecimal IBSDPT;

				public BigDecimal getIBSDPT () {
					return this.IBSDPT;
				}

				public Boolean IBSDPTIsNullable(){
				    return true;
				}
				public Boolean IBSDPTIsKey(){
				    return false;
				}
				public Integer IBSDPTLength(){
				    return null;
				}
				public Integer IBSDPTPrecision(){
				    return null;
				}
				public String IBSDPTDefault(){
				
					return "";
				
				}
				public String IBSDPTComment(){
				
				    return "";
				
				}
				public String IBSDPTPattern(){
				
					return "";
				
				}
				public String IBSDPTOriginalDbColumnName(){
				
					return "IBSDPT";
				
				}

				
			    public BigDecimal IBCLAS;

				public BigDecimal getIBCLAS () {
					return this.IBCLAS;
				}

				public Boolean IBCLASIsNullable(){
				    return true;
				}
				public Boolean IBCLASIsKey(){
				    return false;
				}
				public Integer IBCLASLength(){
				    return null;
				}
				public Integer IBCLASPrecision(){
				    return null;
				}
				public String IBCLASDefault(){
				
					return "";
				
				}
				public String IBCLASComment(){
				
				    return "";
				
				}
				public String IBCLASPattern(){
				
					return "";
				
				}
				public String IBCLASOriginalDbColumnName(){
				
					return "IBCLAS";
				
				}

				
			    public BigDecimal IBSCLS;

				public BigDecimal getIBSCLS () {
					return this.IBSCLS;
				}

				public Boolean IBSCLSIsNullable(){
				    return true;
				}
				public Boolean IBSCLSIsKey(){
				    return false;
				}
				public Integer IBSCLSLength(){
				    return null;
				}
				public Integer IBSCLSPrecision(){
				    return null;
				}
				public String IBSCLSDefault(){
				
					return "";
				
				}
				public String IBSCLSComment(){
				
				    return "";
				
				}
				public String IBSCLSPattern(){
				
					return "";
				
				}
				public String IBSCLSOriginalDbColumnName(){
				
					return "IBSCLS";
				
				}

				
			    public BigDecimal IBFRCN;

				public BigDecimal getIBFRCN () {
					return this.IBFRCN;
				}

				public Boolean IBFRCNIsNullable(){
				    return true;
				}
				public Boolean IBFRCNIsKey(){
				    return false;
				}
				public Integer IBFRCNLength(){
				    return null;
				}
				public Integer IBFRCNPrecision(){
				    return null;
				}
				public String IBFRCNDefault(){
				
					return "";
				
				}
				public String IBFRCNComment(){
				
				    return "";
				
				}
				public String IBFRCNPattern(){
				
					return "";
				
				}
				public String IBFRCNOriginalDbColumnName(){
				
					return "IBFRCN";
				
				}

				
			    public BigDecimal IBFRDT;

				public BigDecimal getIBFRDT () {
					return this.IBFRDT;
				}

				public Boolean IBFRDTIsNullable(){
				    return true;
				}
				public Boolean IBFRDTIsKey(){
				    return false;
				}
				public Integer IBFRDTLength(){
				    return null;
				}
				public Integer IBFRDTPrecision(){
				    return null;
				}
				public String IBFRDTDefault(){
				
					return "";
				
				}
				public String IBFRDTComment(){
				
				    return "";
				
				}
				public String IBFRDTPattern(){
				
					return "";
				
				}
				public String IBFRDTOriginalDbColumnName(){
				
					return "IBFRDT";
				
				}

				
			    public BigDecimal IBVNDR;

				public BigDecimal getIBVNDR () {
					return this.IBVNDR;
				}

				public Boolean IBVNDRIsNullable(){
				    return true;
				}
				public Boolean IBVNDRIsKey(){
				    return false;
				}
				public Integer IBVNDRLength(){
				    return null;
				}
				public Integer IBVNDRPrecision(){
				    return null;
				}
				public String IBVNDRDefault(){
				
					return "";
				
				}
				public String IBVNDRComment(){
				
				    return "";
				
				}
				public String IBVNDRPattern(){
				
					return "";
				
				}
				public String IBVNDROriginalDbColumnName(){
				
					return "IBVNDR";
				
				}

				
			    public String IBSTYL;

				public String getIBSTYL () {
					return this.IBSTYL;
				}

				public Boolean IBSTYLIsNullable(){
				    return true;
				}
				public Boolean IBSTYLIsKey(){
				    return false;
				}
				public Integer IBSTYLLength(){
				    return null;
				}
				public Integer IBSTYLPrecision(){
				    return null;
				}
				public String IBSTYLDefault(){
				
					return "";
				
				}
				public String IBSTYLComment(){
				
				    return "";
				
				}
				public String IBSTYLPattern(){
				
					return "";
				
				}
				public String IBSTYLOriginalDbColumnName(){
				
					return "IBSTYL";
				
				}

				
			    public BigDecimal IBPOOQ;

				public BigDecimal getIBPOOQ () {
					return this.IBPOOQ;
				}

				public Boolean IBPOOQIsNullable(){
				    return true;
				}
				public Boolean IBPOOQIsKey(){
				    return false;
				}
				public Integer IBPOOQLength(){
				    return null;
				}
				public Integer IBPOOQPrecision(){
				    return null;
				}
				public String IBPOOQDefault(){
				
					return "";
				
				}
				public String IBPOOQComment(){
				
				    return "";
				
				}
				public String IBPOOQPattern(){
				
					return "";
				
				}
				public String IBPOOQOriginalDbColumnName(){
				
					return "IBPOOQ";
				
				}

				
			    public BigDecimal IBTOOQ;

				public BigDecimal getIBTOOQ () {
					return this.IBTOOQ;
				}

				public Boolean IBTOOQIsNullable(){
				    return true;
				}
				public Boolean IBTOOQIsKey(){
				    return false;
				}
				public Integer IBTOOQLength(){
				    return null;
				}
				public Integer IBTOOQPrecision(){
				    return null;
				}
				public String IBTOOQDefault(){
				
					return "";
				
				}
				public String IBTOOQComment(){
				
				    return "";
				
				}
				public String IBTOOQPattern(){
				
					return "";
				
				}
				public String IBTOOQOriginalDbColumnName(){
				
					return "IBTOOQ";
				
				}

				
			    public BigDecimal IBINTQ;

				public BigDecimal getIBINTQ () {
					return this.IBINTQ;
				}

				public Boolean IBINTQIsNullable(){
				    return true;
				}
				public Boolean IBINTQIsKey(){
				    return false;
				}
				public Integer IBINTQLength(){
				    return null;
				}
				public Integer IBINTQPrecision(){
				    return null;
				}
				public String IBINTQDefault(){
				
					return "";
				
				}
				public String IBINTQComment(){
				
				    return "";
				
				}
				public String IBINTQPattern(){
				
					return "";
				
				}
				public String IBINTQOriginalDbColumnName(){
				
					return "IBINTQ";
				
				}

				
			    public BigDecimal IBMASU;

				public BigDecimal getIBMASU () {
					return this.IBMASU;
				}

				public Boolean IBMASUIsNullable(){
				    return true;
				}
				public Boolean IBMASUIsKey(){
				    return false;
				}
				public Integer IBMASULength(){
				    return null;
				}
				public Integer IBMASUPrecision(){
				    return null;
				}
				public String IBMASUDefault(){
				
					return "";
				
				}
				public String IBMASUComment(){
				
				    return "";
				
				}
				public String IBMASUPattern(){
				
					return "";
				
				}
				public String IBMASUOriginalDbColumnName(){
				
					return "IBMASU";
				
				}

				
			    public BigDecimal IBMASD;

				public BigDecimal getIBMASD () {
					return this.IBMASD;
				}

				public Boolean IBMASDIsNullable(){
				    return true;
				}
				public Boolean IBMASDIsKey(){
				    return false;
				}
				public Integer IBMASDLength(){
				    return null;
				}
				public Integer IBMASDPrecision(){
				    return null;
				}
				public String IBMASDDefault(){
				
					return "";
				
				}
				public String IBMASDComment(){
				
				    return "";
				
				}
				public String IBMASDPattern(){
				
					return "";
				
				}
				public String IBMASDOriginalDbColumnName(){
				
					return "IBMASD";
				
				}

				
			    public BigDecimal IBMASV;

				public BigDecimal getIBMASV () {
					return this.IBMASV;
				}

				public Boolean IBMASVIsNullable(){
				    return true;
				}
				public Boolean IBMASVIsKey(){
				    return false;
				}
				public Integer IBMASVLength(){
				    return null;
				}
				public Integer IBMASVPrecision(){
				    return null;
				}
				public String IBMASVDefault(){
				
					return "";
				
				}
				public String IBMASVComment(){
				
				    return "";
				
				}
				public String IBMASVPattern(){
				
					return "";
				
				}
				public String IBMASVOriginalDbColumnName(){
				
					return "IBMASV";
				
				}

				
			    public BigDecimal IBMASC;

				public BigDecimal getIBMASC () {
					return this.IBMASC;
				}

				public Boolean IBMASCIsNullable(){
				    return true;
				}
				public Boolean IBMASCIsKey(){
				    return false;
				}
				public Integer IBMASCLength(){
				    return null;
				}
				public Integer IBMASCPrecision(){
				    return null;
				}
				public String IBMASCDefault(){
				
					return "";
				
				}
				public String IBMASCComment(){
				
				    return "";
				
				}
				public String IBMASCPattern(){
				
					return "";
				
				}
				public String IBMASCOriginalDbColumnName(){
				
					return "IBMASC";
				
				}

				
			    public BigDecimal IBLAVC;

				public BigDecimal getIBLAVC () {
					return this.IBLAVC;
				}

				public Boolean IBLAVCIsNullable(){
				    return true;
				}
				public Boolean IBLAVCIsKey(){
				    return false;
				}
				public Integer IBLAVCLength(){
				    return null;
				}
				public Integer IBLAVCPrecision(){
				    return null;
				}
				public String IBLAVCDefault(){
				
					return "";
				
				}
				public String IBLAVCComment(){
				
				    return "";
				
				}
				public String IBLAVCPattern(){
				
					return "";
				
				}
				public String IBLAVCOriginalDbColumnName(){
				
					return "IBLAVC";
				
				}

				
			    public BigDecimal IBARQT;

				public BigDecimal getIBARQT () {
					return this.IBARQT;
				}

				public Boolean IBARQTIsNullable(){
				    return true;
				}
				public Boolean IBARQTIsKey(){
				    return false;
				}
				public Integer IBARQTLength(){
				    return null;
				}
				public Integer IBARQTPrecision(){
				    return null;
				}
				public String IBARQTDefault(){
				
					return "";
				
				}
				public String IBARQTComment(){
				
				    return "";
				
				}
				public String IBARQTPattern(){
				
					return "";
				
				}
				public String IBARQTOriginalDbColumnName(){
				
					return "IBARQT";
				
				}

				
			    public BigDecimal IBNSQT;

				public BigDecimal getIBNSQT () {
					return this.IBNSQT;
				}

				public Boolean IBNSQTIsNullable(){
				    return true;
				}
				public Boolean IBNSQTIsKey(){
				    return false;
				}
				public Integer IBNSQTLength(){
				    return null;
				}
				public Integer IBNSQTPrecision(){
				    return null;
				}
				public String IBNSQTDefault(){
				
					return "";
				
				}
				public String IBNSQTComment(){
				
				    return "";
				
				}
				public String IBNSQTPattern(){
				
					return "";
				
				}
				public String IBNSQTOriginalDbColumnName(){
				
					return "IBNSQT";
				
				}

				
			    public BigDecimal IBPHND;

				public BigDecimal getIBPHND () {
					return this.IBPHND;
				}

				public Boolean IBPHNDIsNullable(){
				    return true;
				}
				public Boolean IBPHNDIsKey(){
				    return false;
				}
				public Integer IBPHNDLength(){
				    return null;
				}
				public Integer IBPHNDPrecision(){
				    return null;
				}
				public String IBPHNDDefault(){
				
					return "";
				
				}
				public String IBPHNDComment(){
				
				    return "";
				
				}
				public String IBPHNDPattern(){
				
					return "";
				
				}
				public String IBPHNDOriginalDbColumnName(){
				
					return "IBPHND";
				
				}

				
			    public BigDecimal IBHLDQ;

				public BigDecimal getIBHLDQ () {
					return this.IBHLDQ;
				}

				public Boolean IBHLDQIsNullable(){
				    return true;
				}
				public Boolean IBHLDQIsKey(){
				    return false;
				}
				public Integer IBHLDQLength(){
				    return null;
				}
				public Integer IBHLDQPrecision(){
				    return null;
				}
				public String IBHLDQDefault(){
				
					return "";
				
				}
				public String IBHLDQComment(){
				
				    return "";
				
				}
				public String IBHLDQPattern(){
				
					return "";
				
				}
				public String IBHLDQOriginalDbColumnName(){
				
					return "IBHLDQ";
				
				}

				
			    public String IBCRCD;

				public String getIBCRCD () {
					return this.IBCRCD;
				}

				public Boolean IBCRCDIsNullable(){
				    return true;
				}
				public Boolean IBCRCDIsKey(){
				    return false;
				}
				public Integer IBCRCDLength(){
				    return null;
				}
				public Integer IBCRCDPrecision(){
				    return null;
				}
				public String IBCRCDDefault(){
				
					return "";
				
				}
				public String IBCRCDComment(){
				
				    return "";
				
				}
				public String IBCRCDPattern(){
				
					return "";
				
				}
				public String IBCRCDOriginalDbColumnName(){
				
					return "IBCRCD";
				
				}

				
			    public java.util.Date DATELOADED;

				public java.util.Date getDATELOADED () {
					return this.DATELOADED;
				}

				public Boolean DATELOADEDIsNullable(){
				    return true;
				}
				public Boolean DATELOADEDIsKey(){
				    return false;
				}
				public Integer DATELOADEDLength(){
				    return null;
				}
				public Integer DATELOADEDPrecision(){
				    return null;
				}
				public String DATELOADEDDefault(){
				
					return "";
				
				}
				public String DATELOADEDComment(){
				
				    return "";
				
				}
				public String DATELOADEDPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATELOADEDOriginalDbColumnName(){
				
					return "DATELOADED";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
					this.DATELOADED = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
					this.DATELOADED = readDate(dis);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
					// java.util.Date
				
						writeDate(this.DATELOADED,dos);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
					// java.util.Date
				
						writeDate(this.DATELOADED,dos);
					
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
		sb.append(",IBHBOY="+String.valueOf(IBHBOY));
		sb.append(",IBHBOP="+String.valueOf(IBHBOP));
		sb.append(",IBHAND="+String.valueOf(IBHAND));
		sb.append(",IBTRNS="+String.valueOf(IBTRNS));
		sb.append(",IBGMRI="+String.valueOf(IBGMRI));
		sb.append(",IBWKCR="+String.valueOf(IBWKCR));
		sb.append(",IBWK01="+String.valueOf(IBWK01));
		sb.append(",IBWK02="+String.valueOf(IBWK02));
		sb.append(",IBWK03="+String.valueOf(IBWK03));
		sb.append(",IBWK04="+String.valueOf(IBWK04));
		sb.append(",IBWK05="+String.valueOf(IBWK05));
		sb.append(",IBWK06="+String.valueOf(IBWK06));
		sb.append(",IBWK07="+String.valueOf(IBWK07));
		sb.append(",IBWK08="+String.valueOf(IBWK08));
		sb.append(",IBNORD="+String.valueOf(IBNORD));
		sb.append(",IBLEAD="+String.valueOf(IBLEAD));
		sb.append(",IBRSUP="+String.valueOf(IBRSUP));
		sb.append(",IBRSUY="+String.valueOf(IBRSUY));
		sb.append(",IBRSDP="+String.valueOf(IBRSDP));
		sb.append(",IBRSDY="+String.valueOf(IBRSDY));
		sb.append(",IBVRSP="+String.valueOf(IBVRSP));
		sb.append(",IBVRSY="+String.valueOf(IBVRSY));
		sb.append(",IBRCSP="+String.valueOf(IBRCSP));
		sb.append(",IBRCSY="+String.valueOf(IBRCSY));
		sb.append(",IBASUP="+String.valueOf(IBASUP));
		sb.append(",IBASUY="+String.valueOf(IBASUY));
		sb.append(",IBASDP="+String.valueOf(IBASDP));
		sb.append(",IBASDY="+String.valueOf(IBASDY));
		sb.append(",IBVASP="+String.valueOf(IBVASP));
		sb.append(",IBVASY="+String.valueOf(IBVASY));
		sb.append(",IBACSP="+String.valueOf(IBACSP));
		sb.append(",IBACSY="+String.valueOf(IBACSY));
		sb.append(",IBRETS="+String.valueOf(IBRETS));
		sb.append(",IBRCUP="+String.valueOf(IBRCUP));
		sb.append(",IBRCUY="+String.valueOf(IBRCUY));
		sb.append(",IBRCDP="+String.valueOf(IBRCDP));
		sb.append(",IBRCDY="+String.valueOf(IBRCDY));
		sb.append(",IBTIUP="+String.valueOf(IBTIUP));
		sb.append(",IBTIUY="+String.valueOf(IBTIUY));
		sb.append(",IBTOUP="+String.valueOf(IBTOUP));
		sb.append(",IBTOUY="+String.valueOf(IBTOUY));
		sb.append(",IBTFDP="+String.valueOf(IBTFDP));
		sb.append(",IBTFDY="+String.valueOf(IBTFDY));
		sb.append(",IBRVUP="+String.valueOf(IBRVUP));
		sb.append(",IBRVUY="+String.valueOf(IBRVUY));
		sb.append(",IBRVDP="+String.valueOf(IBRVDP));
		sb.append(",IBRVDY="+String.valueOf(IBRVDY));
		sb.append(",IBAJUP="+String.valueOf(IBAJUP));
		sb.append(",IBAJUY="+String.valueOf(IBAJUY));
		sb.append(",IBAJDP="+String.valueOf(IBAJDP));
		sb.append(",IBAJDY="+String.valueOf(IBAJDY));
		sb.append(",IBPHUP="+String.valueOf(IBPHUP));
		sb.append(",IBPHUY="+String.valueOf(IBPHUY));
		sb.append(",IBPHDP="+String.valueOf(IBPHDP));
		sb.append(",IBPHDY="+String.valueOf(IBPHDY));
		sb.append(",IBCEN1="+String.valueOf(IBCEN1));
		sb.append(",IBALD1="+String.valueOf(IBALD1));
		sb.append(",IBCEN2="+String.valueOf(IBCEN2));
		sb.append(",IBALD2="+String.valueOf(IBALD2));
		sb.append(",IBCEN3="+String.valueOf(IBCEN3));
		sb.append(",IBALD3="+String.valueOf(IBALD3));
		sb.append(",IBCEN4="+String.valueOf(IBCEN4));
		sb.append(",IBALD4="+String.valueOf(IBALD4));
		sb.append(",IBCEN5="+String.valueOf(IBCEN5));
		sb.append(",IBALD5="+String.valueOf(IBALD5));
		sb.append(",IBAVGC="+String.valueOf(IBAVGC));
		sb.append(",IBQLRC="+String.valueOf(IBQLRC));
		sb.append(",IBAVOH="+String.valueOf(IBAVOH));
		sb.append(",IBAVRT="+String.valueOf(IBAVRT));
		sb.append(",IBAVCS="+String.valueOf(IBAVCS));
		sb.append(",IBOSCR="+IBOSCR);
		sb.append(",IBOS01="+IBOS01);
		sb.append(",IBOS02="+IBOS02);
		sb.append(",IBOS03="+IBOS03);
		sb.append(",IBOS04="+IBOS04);
		sb.append(",IBOS05="+IBOS05);
		sb.append(",IBOS06="+IBOS06);
		sb.append(",IBOS07="+IBOS07);
		sb.append(",IBOS08="+IBOS08);
		sb.append(",IBDEPT="+String.valueOf(IBDEPT));
		sb.append(",IBSDPT="+String.valueOf(IBSDPT));
		sb.append(",IBCLAS="+String.valueOf(IBCLAS));
		sb.append(",IBSCLS="+String.valueOf(IBSCLS));
		sb.append(",IBFRCN="+String.valueOf(IBFRCN));
		sb.append(",IBFRDT="+String.valueOf(IBFRDT));
		sb.append(",IBVNDR="+String.valueOf(IBVNDR));
		sb.append(",IBSTYL="+IBSTYL);
		sb.append(",IBPOOQ="+String.valueOf(IBPOOQ));
		sb.append(",IBTOOQ="+String.valueOf(IBTOOQ));
		sb.append(",IBINTQ="+String.valueOf(IBINTQ));
		sb.append(",IBMASU="+String.valueOf(IBMASU));
		sb.append(",IBMASD="+String.valueOf(IBMASD));
		sb.append(",IBMASV="+String.valueOf(IBMASV));
		sb.append(",IBMASC="+String.valueOf(IBMASC));
		sb.append(",IBLAVC="+String.valueOf(IBLAVC));
		sb.append(",IBARQT="+String.valueOf(IBARQT));
		sb.append(",IBNSQT="+String.valueOf(IBNSQT));
		sb.append(",IBPHND="+String.valueOf(IBPHND));
		sb.append(",IBHLDQ="+String.valueOf(IBHLDQ));
		sb.append(",IBCRCD="+IBCRCD);
		sb.append(",DATELOADED="+String.valueOf(DATELOADED));
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
        		
        				if(IBHBOY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOY);
            			}
            		
        			sb.append("|");
        		
        				if(IBHBOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOP);
            			}
            		
        			sb.append("|");
        		
        				if(IBHAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHAND);
            			}
            		
        			sb.append("|");
        		
        				if(IBTRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTRNS);
            			}
            		
        			sb.append("|");
        		
        				if(IBGMRI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBGMRI);
            			}
            		
        			sb.append("|");
        		
        				if(IBWKCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWKCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK01);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK02);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK03);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK04);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK05);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK06);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK07);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK08);
            			}
            		
        			sb.append("|");
        		
        				if(IBNORD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNORD);
            			}
            		
        			sb.append("|");
        		
        				if(IBLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASY);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRETS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRETS);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN1);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD1);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN2);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD2);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN3);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD3);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN4);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD4);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN5);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD5);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVGC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVGC);
            			}
            		
        			sb.append("|");
        		
        				if(IBQLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBQLRC);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVOH);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVRT);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVCS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVCS);
            			}
            		
        			sb.append("|");
        		
        				if(IBOSCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOSCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS01);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS02);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS03);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS04);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS05);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS06);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS07);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS08);
            			}
            		
        			sb.append("|");
        		
        				if(IBDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(IBSCLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSCLS);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRCN);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRDT);
            			}
            		
        			sb.append("|");
        		
        				if(IBVNDR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVNDR);
            			}
            		
        			sb.append("|");
        		
        				if(IBSTYL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSTYL);
            			}
            		
        			sb.append("|");
        		
        				if(IBPOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBINTQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBINTQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASU);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASD);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASV);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASC);
            			}
            		
        			sb.append("|");
        		
        				if(IBLAVC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLAVC);
            			}
            		
        			sb.append("|");
        		
        				if(IBARQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBARQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBNSQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNSQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHND);
            			}
            		
        			sb.append("|");
        		
        				if(IBHLDQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHLDQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBCRCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCRCD);
            			}
            		
        			sb.append("|");
        		
        				if(DATELOADED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATELOADED);
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
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVBAL.csv\"");
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
                                    outtFileOutputDelimited_1.write("ISTORE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBHBOY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBHBOP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBHAND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTRNS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBGMRI");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWKCR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK01");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK02");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK03");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK04");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK05");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK06");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK07");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBWK08");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBNORD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBLEAD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRSUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRSUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRSDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRSDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBVRSP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBVRSY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCSP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCSY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBASUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBASUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBASDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBASDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBVASP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBVASY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBACSP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBACSY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRETS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRCDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTIUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTIUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTOUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTOUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTFDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBTFDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRVUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRVUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRVDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBRVDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAJUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAJUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAJDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAJDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPHUP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPHUY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPHDP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPHDY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCEN1");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBALD1");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCEN2");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBALD2");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCEN3");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBALD3");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCEN4");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBALD4");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCEN5");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBALD5");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAVGC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBQLRC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAVOH");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAVRT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBAVCS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOSCR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS01");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS02");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS03");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS04");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS05");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS06");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS07");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBOS08");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBDEPT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBSDPT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCLAS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBSCLS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBFRCN");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBFRDT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBVNDR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBSTYL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPOOQ");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    }
                                    public void putHeaderValue_1(java.io.Writer outtFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception{
                                    outtFileOutputDelimited_1.write("IBTOOQ");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBINTQ");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBMASU");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBMASD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBMASV");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBMASC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBLAVC");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBARQT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBNSQT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBPHND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBHLDQ");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("IBCRCD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("DATELOADED");
                                }
                                public void putValue_0(final row5Struct row5,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row5.INUMBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.INUMBR.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.ISTORE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.ISTORE.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBHBOY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBHBOY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBHBOP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBHBOP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBHAND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBHAND.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTRNS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTRNS.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBGMRI != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBGMRI.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWKCR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWKCR.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK01 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK01.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK02 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK02.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK03 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK03.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK04 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK04.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK05 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK05.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK06 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK06.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK07 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK07.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBWK08 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBWK08.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBNORD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBNORD.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBLEAD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBLEAD.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRSUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRSUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRSUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRSUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRSDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRSDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRSDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRSDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBVRSP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBVRSP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBVRSY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBVRSY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCSP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCSP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCSY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCSY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBASUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBASUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBASUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBASUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBASDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBASDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBASDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBASDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBVASP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBVASP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBVASY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBVASY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBACSP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBACSP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBACSY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBACSY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRETS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRETS.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRCDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRCDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTIUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTIUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTIUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTIUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTOUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTOUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTOUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTOUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTFDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTFDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBTFDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTFDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRVUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRVUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRVUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRVUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRVDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRVDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBRVDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBRVDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAJUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAJUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAJUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAJUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAJDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAJDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAJDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAJDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPHUP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPHUP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPHUY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPHUY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPHDP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPHDP.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPHDY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPHDY.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCEN1 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCEN1.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBALD1 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBALD1.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCEN2 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCEN2.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBALD2 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBALD2.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCEN3 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCEN3.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBALD3 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBALD3.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCEN4 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCEN4.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBALD4 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBALD4.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCEN5 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCEN5.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBALD5 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBALD5.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAVGC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAVGC.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBQLRC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBQLRC.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAVOH != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAVOH.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAVRT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAVRT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBAVCS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBAVCS.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOSCR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOSCR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS01 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS01
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS02 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS02
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS03 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS03
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS04 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS04
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS05 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS05
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS06 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS06
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS07 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS07
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBOS08 != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBOS08
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBDEPT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBDEPT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBSDPT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBSDPT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCLAS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCLAS.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBSCLS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBSCLS.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBFRCN != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBFRCN.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBFRDT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBFRDT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBVNDR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBVNDR.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBSTYL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBSTYL
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPOOQ != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPOOQ.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                }
                                public void putValue_1(final row5Struct row5,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row5.IBTOOQ != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBTOOQ.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBINTQ != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBINTQ.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBMASU != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBMASU.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBMASD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBMASD.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBMASV != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBMASV.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBMASC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBMASC.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBLAVC != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBLAVC.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBARQT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBARQT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBNSQT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBNSQT.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBPHND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBPHND.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBHLDQ != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBHLDQ.toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.IBCRCD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row5.IBCRCD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row5.DATELOADED != null) {
                                sb_tFileOutputDelimited_1.append(
                                        FormatterUtils.format_Date(row5.DATELOADED, "yyyy-MM-dd")
                                );
                                }
                            }
                }
                FileOutputDelimitedUtil_tFileOutputDelimited_1 fileOutputDelimitedUtil_tFileOutputDelimited_1=new FileOutputDelimitedUtil_tFileOutputDelimited_1();
    fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/INVBAL.csv")).getAbsolutePath().replace("\\","/");
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
                            log4jParamters_tDBInput_1.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("DB_VERSION" + " = " + "jt400-9.8.jar");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("HOST" + " = " + "context.jda_host_name");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("DBNAME" + " = " + "context.jda_mm_lib");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USER" + " = " + "context.jda_user_name");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password)).substring(0, 4) + "...");     
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.INVBAL \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHBOY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHBOP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHAND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTRNS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBGMRI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWKCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBNORD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVRSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVRSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVASP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVASY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBACSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBACSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTIUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTIUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTFDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTFDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVGC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBQLRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVCS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOSCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSCLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBFRCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBFRDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVNDR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSTYL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPOOQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOOQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBINTQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBLAVC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBARQT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBNSQT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHLDQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCRCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATELOADED")+"}]");
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
				String driverClass_tDBInput_1 = "com.ibm.as400.access.AS400JDBCDriver";
			    java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = context.jda_user_name;
				
				
	final String decryptedPassword_tDBInput_1 = context.jda_password; 
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				  
				String url_tDBInput_1 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";" + "prompt=false";
				
	    		log.debug("tDBInput_1 - Driver ClassName: "+driverClass_tDBInput_1+".");
			
	    		log.debug("tDBInput_1 - Connection attempt to '" + url_tDBInput_1 + "' with the username '" + dbUser_tDBInput_1 + "'.");
			
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
	    		log.debug("tDBInput_1 - Connection to '" + url_tDBInput_1 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "select * from MM4R5LIB.INVBAL ";
		    
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
                    row5.INUMBR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row5.ISTORE = null;
							} else {
		                          
            row5.ISTORE = rs_tDBInput_1.getBigDecimal(2);
            if(rs_tDBInput_1.wasNull()){
                    row5.ISTORE = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row5.IBHBOY = null;
							} else {
		                          
            row5.IBHBOY = rs_tDBInput_1.getBigDecimal(3);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBHBOY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row5.IBHBOP = null;
							} else {
		                          
            row5.IBHBOP = rs_tDBInput_1.getBigDecimal(4);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBHBOP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row5.IBHAND = null;
							} else {
		                          
            row5.IBHAND = rs_tDBInput_1.getBigDecimal(5);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBHAND = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row5.IBTRNS = null;
							} else {
		                          
            row5.IBTRNS = rs_tDBInput_1.getBigDecimal(6);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTRNS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row5.IBGMRI = null;
							} else {
		                          
            row5.IBGMRI = rs_tDBInput_1.getBigDecimal(7);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBGMRI = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row5.IBWKCR = null;
							} else {
		                          
            row5.IBWKCR = rs_tDBInput_1.getBigDecimal(8);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWKCR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row5.IBWK01 = null;
							} else {
		                          
            row5.IBWK01 = rs_tDBInput_1.getBigDecimal(9);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row5.IBWK02 = null;
							} else {
		                          
            row5.IBWK02 = rs_tDBInput_1.getBigDecimal(10);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row5.IBWK03 = null;
							} else {
		                          
            row5.IBWK03 = rs_tDBInput_1.getBigDecimal(11);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row5.IBWK04 = null;
							} else {
		                          
            row5.IBWK04 = rs_tDBInput_1.getBigDecimal(12);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row5.IBWK05 = null;
							} else {
		                          
            row5.IBWK05 = rs_tDBInput_1.getBigDecimal(13);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row5.IBWK06 = null;
							} else {
		                          
            row5.IBWK06 = rs_tDBInput_1.getBigDecimal(14);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row5.IBWK07 = null;
							} else {
		                          
            row5.IBWK07 = rs_tDBInput_1.getBigDecimal(15);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row5.IBWK08 = null;
							} else {
		                          
            row5.IBWK08 = rs_tDBInput_1.getBigDecimal(16);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBWK08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row5.IBNORD = null;
							} else {
		                          
            row5.IBNORD = rs_tDBInput_1.getBigDecimal(17);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBNORD = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row5.IBLEAD = null;
							} else {
		                          
            row5.IBLEAD = rs_tDBInput_1.getBigDecimal(18);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBLEAD = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row5.IBRSUP = null;
							} else {
		                          
            row5.IBRSUP = rs_tDBInput_1.getBigDecimal(19);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRSUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row5.IBRSUY = null;
							} else {
		                          
            row5.IBRSUY = rs_tDBInput_1.getBigDecimal(20);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRSUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row5.IBRSDP = null;
							} else {
		                          
            row5.IBRSDP = rs_tDBInput_1.getBigDecimal(21);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRSDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row5.IBRSDY = null;
							} else {
		                          
            row5.IBRSDY = rs_tDBInput_1.getBigDecimal(22);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRSDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row5.IBVRSP = null;
							} else {
		                          
            row5.IBVRSP = rs_tDBInput_1.getBigDecimal(23);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBVRSP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row5.IBVRSY = null;
							} else {
		                          
            row5.IBVRSY = rs_tDBInput_1.getBigDecimal(24);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBVRSY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row5.IBRCSP = null;
							} else {
		                          
            row5.IBRCSP = rs_tDBInput_1.getBigDecimal(25);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCSP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row5.IBRCSY = null;
							} else {
		                          
            row5.IBRCSY = rs_tDBInput_1.getBigDecimal(26);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCSY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row5.IBASUP = null;
							} else {
		                          
            row5.IBASUP = rs_tDBInput_1.getBigDecimal(27);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBASUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row5.IBASUY = null;
							} else {
		                          
            row5.IBASUY = rs_tDBInput_1.getBigDecimal(28);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBASUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row5.IBASDP = null;
							} else {
		                          
            row5.IBASDP = rs_tDBInput_1.getBigDecimal(29);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBASDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row5.IBASDY = null;
							} else {
		                          
            row5.IBASDY = rs_tDBInput_1.getBigDecimal(30);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBASDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row5.IBVASP = null;
							} else {
		                          
            row5.IBVASP = rs_tDBInput_1.getBigDecimal(31);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBVASP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row5.IBVASY = null;
							} else {
		                          
            row5.IBVASY = rs_tDBInput_1.getBigDecimal(32);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBVASY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 33) {
								row5.IBACSP = null;
							} else {
		                          
            row5.IBACSP = rs_tDBInput_1.getBigDecimal(33);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBACSP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 34) {
								row5.IBACSY = null;
							} else {
		                          
            row5.IBACSY = rs_tDBInput_1.getBigDecimal(34);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBACSY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 35) {
								row5.IBRETS = null;
							} else {
		                          
            row5.IBRETS = rs_tDBInput_1.getBigDecimal(35);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRETS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 36) {
								row5.IBRCUP = null;
							} else {
		                          
            row5.IBRCUP = rs_tDBInput_1.getBigDecimal(36);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 37) {
								row5.IBRCUY = null;
							} else {
		                          
            row5.IBRCUY = rs_tDBInput_1.getBigDecimal(37);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 38) {
								row5.IBRCDP = null;
							} else {
		                          
            row5.IBRCDP = rs_tDBInput_1.getBigDecimal(38);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 39) {
								row5.IBRCDY = null;
							} else {
		                          
            row5.IBRCDY = rs_tDBInput_1.getBigDecimal(39);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRCDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 40) {
								row5.IBTIUP = null;
							} else {
		                          
            row5.IBTIUP = rs_tDBInput_1.getBigDecimal(40);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTIUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 41) {
								row5.IBTIUY = null;
							} else {
		                          
            row5.IBTIUY = rs_tDBInput_1.getBigDecimal(41);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTIUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 42) {
								row5.IBTOUP = null;
							} else {
		                          
            row5.IBTOUP = rs_tDBInput_1.getBigDecimal(42);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTOUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 43) {
								row5.IBTOUY = null;
							} else {
		                          
            row5.IBTOUY = rs_tDBInput_1.getBigDecimal(43);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTOUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 44) {
								row5.IBTFDP = null;
							} else {
		                          
            row5.IBTFDP = rs_tDBInput_1.getBigDecimal(44);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTFDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 45) {
								row5.IBTFDY = null;
							} else {
		                          
            row5.IBTFDY = rs_tDBInput_1.getBigDecimal(45);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTFDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 46) {
								row5.IBRVUP = null;
							} else {
		                          
            row5.IBRVUP = rs_tDBInput_1.getBigDecimal(46);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRVUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 47) {
								row5.IBRVUY = null;
							} else {
		                          
            row5.IBRVUY = rs_tDBInput_1.getBigDecimal(47);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRVUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 48) {
								row5.IBRVDP = null;
							} else {
		                          
            row5.IBRVDP = rs_tDBInput_1.getBigDecimal(48);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRVDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 49) {
								row5.IBRVDY = null;
							} else {
		                          
            row5.IBRVDY = rs_tDBInput_1.getBigDecimal(49);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBRVDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 50) {
								row5.IBAJUP = null;
							} else {
		                          
            row5.IBAJUP = rs_tDBInput_1.getBigDecimal(50);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAJUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 51) {
								row5.IBAJUY = null;
							} else {
		                          
            row5.IBAJUY = rs_tDBInput_1.getBigDecimal(51);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAJUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 52) {
								row5.IBAJDP = null;
							} else {
		                          
            row5.IBAJDP = rs_tDBInput_1.getBigDecimal(52);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAJDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 53) {
								row5.IBAJDY = null;
							} else {
		                          
            row5.IBAJDY = rs_tDBInput_1.getBigDecimal(53);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAJDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 54) {
								row5.IBPHUP = null;
							} else {
		                          
            row5.IBPHUP = rs_tDBInput_1.getBigDecimal(54);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPHUP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 55) {
								row5.IBPHUY = null;
							} else {
		                          
            row5.IBPHUY = rs_tDBInput_1.getBigDecimal(55);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPHUY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 56) {
								row5.IBPHDP = null;
							} else {
		                          
            row5.IBPHDP = rs_tDBInput_1.getBigDecimal(56);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPHDP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 57) {
								row5.IBPHDY = null;
							} else {
		                          
            row5.IBPHDY = rs_tDBInput_1.getBigDecimal(57);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPHDY = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 58) {
								row5.IBCEN1 = null;
							} else {
		                          
            row5.IBCEN1 = rs_tDBInput_1.getBigDecimal(58);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCEN1 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 59) {
								row5.IBALD1 = null;
							} else {
		                          
            row5.IBALD1 = rs_tDBInput_1.getBigDecimal(59);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBALD1 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 60) {
								row5.IBCEN2 = null;
							} else {
		                          
            row5.IBCEN2 = rs_tDBInput_1.getBigDecimal(60);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCEN2 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 61) {
								row5.IBALD2 = null;
							} else {
		                          
            row5.IBALD2 = rs_tDBInput_1.getBigDecimal(61);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBALD2 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 62) {
								row5.IBCEN3 = null;
							} else {
		                          
            row5.IBCEN3 = rs_tDBInput_1.getBigDecimal(62);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCEN3 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 63) {
								row5.IBALD3 = null;
							} else {
		                          
            row5.IBALD3 = rs_tDBInput_1.getBigDecimal(63);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBALD3 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 64) {
								row5.IBCEN4 = null;
							} else {
		                          
            row5.IBCEN4 = rs_tDBInput_1.getBigDecimal(64);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCEN4 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 65) {
								row5.IBALD4 = null;
							} else {
		                          
            row5.IBALD4 = rs_tDBInput_1.getBigDecimal(65);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBALD4 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 66) {
								row5.IBCEN5 = null;
							} else {
		                          
            row5.IBCEN5 = rs_tDBInput_1.getBigDecimal(66);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCEN5 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 67) {
								row5.IBALD5 = null;
							} else {
		                          
            row5.IBALD5 = rs_tDBInput_1.getBigDecimal(67);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBALD5 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 68) {
								row5.IBAVGC = null;
							} else {
		                          
            row5.IBAVGC = rs_tDBInput_1.getBigDecimal(68);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAVGC = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 69) {
								row5.IBQLRC = null;
							} else {
		                          
            row5.IBQLRC = rs_tDBInput_1.getBigDecimal(69);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBQLRC = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 70) {
								row5.IBAVOH = null;
							} else {
		                          
            row5.IBAVOH = rs_tDBInput_1.getBigDecimal(70);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAVOH = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 71) {
								row5.IBAVRT = null;
							} else {
		                          
            row5.IBAVRT = rs_tDBInput_1.getBigDecimal(71);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAVRT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 72) {
								row5.IBAVCS = null;
							} else {
		                          
            row5.IBAVCS = rs_tDBInput_1.getBigDecimal(72);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBAVCS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 73) {
								row5.IBOSCR = null;
							} else {
	                         		
        	row5.IBOSCR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 73, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 74) {
								row5.IBOS01 = null;
							} else {
	                         		
        	row5.IBOS01 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 74, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 75) {
								row5.IBOS02 = null;
							} else {
	                         		
        	row5.IBOS02 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 75, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 76) {
								row5.IBOS03 = null;
							} else {
	                         		
        	row5.IBOS03 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 76, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 77) {
								row5.IBOS04 = null;
							} else {
	                         		
        	row5.IBOS04 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 77, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 78) {
								row5.IBOS05 = null;
							} else {
	                         		
        	row5.IBOS05 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 78, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 79) {
								row5.IBOS06 = null;
							} else {
	                         		
        	row5.IBOS06 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 79, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 80) {
								row5.IBOS07 = null;
							} else {
	                         		
        	row5.IBOS07 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 80, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 81) {
								row5.IBOS08 = null;
							} else {
	                         		
        	row5.IBOS08 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 81, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 82) {
								row5.IBDEPT = null;
							} else {
		                          
            row5.IBDEPT = rs_tDBInput_1.getBigDecimal(82);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBDEPT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 83) {
								row5.IBSDPT = null;
							} else {
		                          
            row5.IBSDPT = rs_tDBInput_1.getBigDecimal(83);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBSDPT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 84) {
								row5.IBCLAS = null;
							} else {
		                          
            row5.IBCLAS = rs_tDBInput_1.getBigDecimal(84);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBCLAS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 85) {
								row5.IBSCLS = null;
							} else {
		                          
            row5.IBSCLS = rs_tDBInput_1.getBigDecimal(85);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBSCLS = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 86) {
								row5.IBFRCN = null;
							} else {
		                          
            row5.IBFRCN = rs_tDBInput_1.getBigDecimal(86);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBFRCN = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 87) {
								row5.IBFRDT = null;
							} else {
		                          
            row5.IBFRDT = rs_tDBInput_1.getBigDecimal(87);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBFRDT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 88) {
								row5.IBVNDR = null;
							} else {
		                          
            row5.IBVNDR = rs_tDBInput_1.getBigDecimal(88);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBVNDR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 89) {
								row5.IBSTYL = null;
							} else {
	                         		
        	row5.IBSTYL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 89, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 90) {
								row5.IBPOOQ = null;
							} else {
		                          
            row5.IBPOOQ = rs_tDBInput_1.getBigDecimal(90);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPOOQ = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 91) {
								row5.IBTOOQ = null;
							} else {
		                          
            row5.IBTOOQ = rs_tDBInput_1.getBigDecimal(91);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBTOOQ = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 92) {
								row5.IBINTQ = null;
							} else {
		                          
            row5.IBINTQ = rs_tDBInput_1.getBigDecimal(92);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBINTQ = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 93) {
								row5.IBMASU = null;
							} else {
		                          
            row5.IBMASU = rs_tDBInput_1.getBigDecimal(93);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBMASU = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 94) {
								row5.IBMASD = null;
							} else {
		                          
            row5.IBMASD = rs_tDBInput_1.getBigDecimal(94);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBMASD = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 95) {
								row5.IBMASV = null;
							} else {
		                          
            row5.IBMASV = rs_tDBInput_1.getBigDecimal(95);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBMASV = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 96) {
								row5.IBMASC = null;
							} else {
		                          
            row5.IBMASC = rs_tDBInput_1.getBigDecimal(96);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBMASC = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 97) {
								row5.IBLAVC = null;
							} else {
		                          
            row5.IBLAVC = rs_tDBInput_1.getBigDecimal(97);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBLAVC = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 98) {
								row5.IBARQT = null;
							} else {
		                          
            row5.IBARQT = rs_tDBInput_1.getBigDecimal(98);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBARQT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 99) {
								row5.IBNSQT = null;
							} else {
		                          
            row5.IBNSQT = rs_tDBInput_1.getBigDecimal(99);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBNSQT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 100) {
								row5.IBPHND = null;
							} else {
		                          
            row5.IBPHND = rs_tDBInput_1.getBigDecimal(100);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBPHND = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 101) {
								row5.IBHLDQ = null;
							} else {
		                          
            row5.IBHLDQ = rs_tDBInput_1.getBigDecimal(101);
            if(rs_tDBInput_1.wasNull()){
                    row5.IBHLDQ = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 102) {
								row5.IBCRCD = null;
							} else {
	                         		
        	row5.IBCRCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 102, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 103) {
								row5.DATELOADED = null;
							} else {
										
			row5.DATELOADED = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 103);
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
		if(conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {
			
	    		log.debug("tDBInput_1 - Closing the connection to the database.");
			
			conn_tDBInput_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_1 - Connection to the database closed.");
			
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
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
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
	


public static class INVBALStruct implements routines.system.IPersistableRow<INVBALStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];

	
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

				
			    public BigDecimal IBHBOY;

				public BigDecimal getIBHBOY () {
					return this.IBHBOY;
				}

				public Boolean IBHBOYIsNullable(){
				    return true;
				}
				public Boolean IBHBOYIsKey(){
				    return false;
				}
				public Integer IBHBOYLength(){
				    return null;
				}
				public Integer IBHBOYPrecision(){
				    return null;
				}
				public String IBHBOYDefault(){
				
					return "";
				
				}
				public String IBHBOYComment(){
				
				    return "";
				
				}
				public String IBHBOYPattern(){
				
					return "";
				
				}
				public String IBHBOYOriginalDbColumnName(){
				
					return "IBHBOY";
				
				}

				
			    public BigDecimal IBHBOP;

				public BigDecimal getIBHBOP () {
					return this.IBHBOP;
				}

				public Boolean IBHBOPIsNullable(){
				    return true;
				}
				public Boolean IBHBOPIsKey(){
				    return false;
				}
				public Integer IBHBOPLength(){
				    return null;
				}
				public Integer IBHBOPPrecision(){
				    return null;
				}
				public String IBHBOPDefault(){
				
					return "";
				
				}
				public String IBHBOPComment(){
				
				    return "";
				
				}
				public String IBHBOPPattern(){
				
					return "";
				
				}
				public String IBHBOPOriginalDbColumnName(){
				
					return "IBHBOP";
				
				}

				
			    public BigDecimal IBHAND;

				public BigDecimal getIBHAND () {
					return this.IBHAND;
				}

				public Boolean IBHANDIsNullable(){
				    return true;
				}
				public Boolean IBHANDIsKey(){
				    return false;
				}
				public Integer IBHANDLength(){
				    return null;
				}
				public Integer IBHANDPrecision(){
				    return null;
				}
				public String IBHANDDefault(){
				
					return "";
				
				}
				public String IBHANDComment(){
				
				    return "";
				
				}
				public String IBHANDPattern(){
				
					return "";
				
				}
				public String IBHANDOriginalDbColumnName(){
				
					return "IBHAND";
				
				}

				
			    public BigDecimal IBTRNS;

				public BigDecimal getIBTRNS () {
					return this.IBTRNS;
				}

				public Boolean IBTRNSIsNullable(){
				    return true;
				}
				public Boolean IBTRNSIsKey(){
				    return false;
				}
				public Integer IBTRNSLength(){
				    return null;
				}
				public Integer IBTRNSPrecision(){
				    return null;
				}
				public String IBTRNSDefault(){
				
					return "";
				
				}
				public String IBTRNSComment(){
				
				    return "";
				
				}
				public String IBTRNSPattern(){
				
					return "";
				
				}
				public String IBTRNSOriginalDbColumnName(){
				
					return "IBTRNS";
				
				}

				
			    public BigDecimal IBGMRI;

				public BigDecimal getIBGMRI () {
					return this.IBGMRI;
				}

				public Boolean IBGMRIIsNullable(){
				    return true;
				}
				public Boolean IBGMRIIsKey(){
				    return false;
				}
				public Integer IBGMRILength(){
				    return null;
				}
				public Integer IBGMRIPrecision(){
				    return null;
				}
				public String IBGMRIDefault(){
				
					return "";
				
				}
				public String IBGMRIComment(){
				
				    return "";
				
				}
				public String IBGMRIPattern(){
				
					return "";
				
				}
				public String IBGMRIOriginalDbColumnName(){
				
					return "IBGMRI";
				
				}

				
			    public BigDecimal IBWKCR;

				public BigDecimal getIBWKCR () {
					return this.IBWKCR;
				}

				public Boolean IBWKCRIsNullable(){
				    return true;
				}
				public Boolean IBWKCRIsKey(){
				    return false;
				}
				public Integer IBWKCRLength(){
				    return null;
				}
				public Integer IBWKCRPrecision(){
				    return null;
				}
				public String IBWKCRDefault(){
				
					return "";
				
				}
				public String IBWKCRComment(){
				
				    return "";
				
				}
				public String IBWKCRPattern(){
				
					return "";
				
				}
				public String IBWKCROriginalDbColumnName(){
				
					return "IBWKCR";
				
				}

				
			    public BigDecimal IBWK01;

				public BigDecimal getIBWK01 () {
					return this.IBWK01;
				}

				public Boolean IBWK01IsNullable(){
				    return true;
				}
				public Boolean IBWK01IsKey(){
				    return false;
				}
				public Integer IBWK01Length(){
				    return null;
				}
				public Integer IBWK01Precision(){
				    return null;
				}
				public String IBWK01Default(){
				
					return "";
				
				}
				public String IBWK01Comment(){
				
				    return "";
				
				}
				public String IBWK01Pattern(){
				
					return "";
				
				}
				public String IBWK01OriginalDbColumnName(){
				
					return "IBWK01";
				
				}

				
			    public BigDecimal IBWK02;

				public BigDecimal getIBWK02 () {
					return this.IBWK02;
				}

				public Boolean IBWK02IsNullable(){
				    return true;
				}
				public Boolean IBWK02IsKey(){
				    return false;
				}
				public Integer IBWK02Length(){
				    return null;
				}
				public Integer IBWK02Precision(){
				    return null;
				}
				public String IBWK02Default(){
				
					return "";
				
				}
				public String IBWK02Comment(){
				
				    return "";
				
				}
				public String IBWK02Pattern(){
				
					return "";
				
				}
				public String IBWK02OriginalDbColumnName(){
				
					return "IBWK02";
				
				}

				
			    public BigDecimal IBWK03;

				public BigDecimal getIBWK03 () {
					return this.IBWK03;
				}

				public Boolean IBWK03IsNullable(){
				    return true;
				}
				public Boolean IBWK03IsKey(){
				    return false;
				}
				public Integer IBWK03Length(){
				    return null;
				}
				public Integer IBWK03Precision(){
				    return null;
				}
				public String IBWK03Default(){
				
					return "";
				
				}
				public String IBWK03Comment(){
				
				    return "";
				
				}
				public String IBWK03Pattern(){
				
					return "";
				
				}
				public String IBWK03OriginalDbColumnName(){
				
					return "IBWK03";
				
				}

				
			    public BigDecimal IBWK04;

				public BigDecimal getIBWK04 () {
					return this.IBWK04;
				}

				public Boolean IBWK04IsNullable(){
				    return true;
				}
				public Boolean IBWK04IsKey(){
				    return false;
				}
				public Integer IBWK04Length(){
				    return null;
				}
				public Integer IBWK04Precision(){
				    return null;
				}
				public String IBWK04Default(){
				
					return "";
				
				}
				public String IBWK04Comment(){
				
				    return "";
				
				}
				public String IBWK04Pattern(){
				
					return "";
				
				}
				public String IBWK04OriginalDbColumnName(){
				
					return "IBWK04";
				
				}

				
			    public BigDecimal IBWK05;

				public BigDecimal getIBWK05 () {
					return this.IBWK05;
				}

				public Boolean IBWK05IsNullable(){
				    return true;
				}
				public Boolean IBWK05IsKey(){
				    return false;
				}
				public Integer IBWK05Length(){
				    return null;
				}
				public Integer IBWK05Precision(){
				    return null;
				}
				public String IBWK05Default(){
				
					return "";
				
				}
				public String IBWK05Comment(){
				
				    return "";
				
				}
				public String IBWK05Pattern(){
				
					return "";
				
				}
				public String IBWK05OriginalDbColumnName(){
				
					return "IBWK05";
				
				}

				
			    public BigDecimal IBWK06;

				public BigDecimal getIBWK06 () {
					return this.IBWK06;
				}

				public Boolean IBWK06IsNullable(){
				    return true;
				}
				public Boolean IBWK06IsKey(){
				    return false;
				}
				public Integer IBWK06Length(){
				    return null;
				}
				public Integer IBWK06Precision(){
				    return null;
				}
				public String IBWK06Default(){
				
					return "";
				
				}
				public String IBWK06Comment(){
				
				    return "";
				
				}
				public String IBWK06Pattern(){
				
					return "";
				
				}
				public String IBWK06OriginalDbColumnName(){
				
					return "IBWK06";
				
				}

				
			    public BigDecimal IBWK07;

				public BigDecimal getIBWK07 () {
					return this.IBWK07;
				}

				public Boolean IBWK07IsNullable(){
				    return true;
				}
				public Boolean IBWK07IsKey(){
				    return false;
				}
				public Integer IBWK07Length(){
				    return null;
				}
				public Integer IBWK07Precision(){
				    return null;
				}
				public String IBWK07Default(){
				
					return "";
				
				}
				public String IBWK07Comment(){
				
				    return "";
				
				}
				public String IBWK07Pattern(){
				
					return "";
				
				}
				public String IBWK07OriginalDbColumnName(){
				
					return "IBWK07";
				
				}

				
			    public BigDecimal IBWK08;

				public BigDecimal getIBWK08 () {
					return this.IBWK08;
				}

				public Boolean IBWK08IsNullable(){
				    return true;
				}
				public Boolean IBWK08IsKey(){
				    return false;
				}
				public Integer IBWK08Length(){
				    return null;
				}
				public Integer IBWK08Precision(){
				    return null;
				}
				public String IBWK08Default(){
				
					return "";
				
				}
				public String IBWK08Comment(){
				
				    return "";
				
				}
				public String IBWK08Pattern(){
				
					return "";
				
				}
				public String IBWK08OriginalDbColumnName(){
				
					return "IBWK08";
				
				}

				
			    public BigDecimal IBNORD;

				public BigDecimal getIBNORD () {
					return this.IBNORD;
				}

				public Boolean IBNORDIsNullable(){
				    return true;
				}
				public Boolean IBNORDIsKey(){
				    return false;
				}
				public Integer IBNORDLength(){
				    return null;
				}
				public Integer IBNORDPrecision(){
				    return null;
				}
				public String IBNORDDefault(){
				
					return "";
				
				}
				public String IBNORDComment(){
				
				    return "";
				
				}
				public String IBNORDPattern(){
				
					return "";
				
				}
				public String IBNORDOriginalDbColumnName(){
				
					return "IBNORD";
				
				}

				
			    public BigDecimal IBLEAD;

				public BigDecimal getIBLEAD () {
					return this.IBLEAD;
				}

				public Boolean IBLEADIsNullable(){
				    return true;
				}
				public Boolean IBLEADIsKey(){
				    return false;
				}
				public Integer IBLEADLength(){
				    return null;
				}
				public Integer IBLEADPrecision(){
				    return null;
				}
				public String IBLEADDefault(){
				
					return "";
				
				}
				public String IBLEADComment(){
				
				    return "";
				
				}
				public String IBLEADPattern(){
				
					return "";
				
				}
				public String IBLEADOriginalDbColumnName(){
				
					return "IBLEAD";
				
				}

				
			    public BigDecimal IBRSUP;

				public BigDecimal getIBRSUP () {
					return this.IBRSUP;
				}

				public Boolean IBRSUPIsNullable(){
				    return true;
				}
				public Boolean IBRSUPIsKey(){
				    return false;
				}
				public Integer IBRSUPLength(){
				    return null;
				}
				public Integer IBRSUPPrecision(){
				    return null;
				}
				public String IBRSUPDefault(){
				
					return "";
				
				}
				public String IBRSUPComment(){
				
				    return "";
				
				}
				public String IBRSUPPattern(){
				
					return "";
				
				}
				public String IBRSUPOriginalDbColumnName(){
				
					return "IBRSUP";
				
				}

				
			    public BigDecimal IBRSUY;

				public BigDecimal getIBRSUY () {
					return this.IBRSUY;
				}

				public Boolean IBRSUYIsNullable(){
				    return true;
				}
				public Boolean IBRSUYIsKey(){
				    return false;
				}
				public Integer IBRSUYLength(){
				    return null;
				}
				public Integer IBRSUYPrecision(){
				    return null;
				}
				public String IBRSUYDefault(){
				
					return "";
				
				}
				public String IBRSUYComment(){
				
				    return "";
				
				}
				public String IBRSUYPattern(){
				
					return "";
				
				}
				public String IBRSUYOriginalDbColumnName(){
				
					return "IBRSUY";
				
				}

				
			    public BigDecimal IBRSDP;

				public BigDecimal getIBRSDP () {
					return this.IBRSDP;
				}

				public Boolean IBRSDPIsNullable(){
				    return true;
				}
				public Boolean IBRSDPIsKey(){
				    return false;
				}
				public Integer IBRSDPLength(){
				    return null;
				}
				public Integer IBRSDPPrecision(){
				    return null;
				}
				public String IBRSDPDefault(){
				
					return "";
				
				}
				public String IBRSDPComment(){
				
				    return "";
				
				}
				public String IBRSDPPattern(){
				
					return "";
				
				}
				public String IBRSDPOriginalDbColumnName(){
				
					return "IBRSDP";
				
				}

				
			    public BigDecimal IBRSDY;

				public BigDecimal getIBRSDY () {
					return this.IBRSDY;
				}

				public Boolean IBRSDYIsNullable(){
				    return true;
				}
				public Boolean IBRSDYIsKey(){
				    return false;
				}
				public Integer IBRSDYLength(){
				    return null;
				}
				public Integer IBRSDYPrecision(){
				    return null;
				}
				public String IBRSDYDefault(){
				
					return "";
				
				}
				public String IBRSDYComment(){
				
				    return "";
				
				}
				public String IBRSDYPattern(){
				
					return "";
				
				}
				public String IBRSDYOriginalDbColumnName(){
				
					return "IBRSDY";
				
				}

				
			    public BigDecimal IBVRSP;

				public BigDecimal getIBVRSP () {
					return this.IBVRSP;
				}

				public Boolean IBVRSPIsNullable(){
				    return true;
				}
				public Boolean IBVRSPIsKey(){
				    return false;
				}
				public Integer IBVRSPLength(){
				    return null;
				}
				public Integer IBVRSPPrecision(){
				    return null;
				}
				public String IBVRSPDefault(){
				
					return "";
				
				}
				public String IBVRSPComment(){
				
				    return "";
				
				}
				public String IBVRSPPattern(){
				
					return "";
				
				}
				public String IBVRSPOriginalDbColumnName(){
				
					return "IBVRSP";
				
				}

				
			    public BigDecimal IBVRSY;

				public BigDecimal getIBVRSY () {
					return this.IBVRSY;
				}

				public Boolean IBVRSYIsNullable(){
				    return true;
				}
				public Boolean IBVRSYIsKey(){
				    return false;
				}
				public Integer IBVRSYLength(){
				    return null;
				}
				public Integer IBVRSYPrecision(){
				    return null;
				}
				public String IBVRSYDefault(){
				
					return "";
				
				}
				public String IBVRSYComment(){
				
				    return "";
				
				}
				public String IBVRSYPattern(){
				
					return "";
				
				}
				public String IBVRSYOriginalDbColumnName(){
				
					return "IBVRSY";
				
				}

				
			    public BigDecimal IBRCSP;

				public BigDecimal getIBRCSP () {
					return this.IBRCSP;
				}

				public Boolean IBRCSPIsNullable(){
				    return true;
				}
				public Boolean IBRCSPIsKey(){
				    return false;
				}
				public Integer IBRCSPLength(){
				    return null;
				}
				public Integer IBRCSPPrecision(){
				    return null;
				}
				public String IBRCSPDefault(){
				
					return "";
				
				}
				public String IBRCSPComment(){
				
				    return "";
				
				}
				public String IBRCSPPattern(){
				
					return "";
				
				}
				public String IBRCSPOriginalDbColumnName(){
				
					return "IBRCSP";
				
				}

				
			    public BigDecimal IBRCSY;

				public BigDecimal getIBRCSY () {
					return this.IBRCSY;
				}

				public Boolean IBRCSYIsNullable(){
				    return true;
				}
				public Boolean IBRCSYIsKey(){
				    return false;
				}
				public Integer IBRCSYLength(){
				    return null;
				}
				public Integer IBRCSYPrecision(){
				    return null;
				}
				public String IBRCSYDefault(){
				
					return "";
				
				}
				public String IBRCSYComment(){
				
				    return "";
				
				}
				public String IBRCSYPattern(){
				
					return "";
				
				}
				public String IBRCSYOriginalDbColumnName(){
				
					return "IBRCSY";
				
				}

				
			    public BigDecimal IBASUP;

				public BigDecimal getIBASUP () {
					return this.IBASUP;
				}

				public Boolean IBASUPIsNullable(){
				    return true;
				}
				public Boolean IBASUPIsKey(){
				    return false;
				}
				public Integer IBASUPLength(){
				    return null;
				}
				public Integer IBASUPPrecision(){
				    return null;
				}
				public String IBASUPDefault(){
				
					return "";
				
				}
				public String IBASUPComment(){
				
				    return "";
				
				}
				public String IBASUPPattern(){
				
					return "";
				
				}
				public String IBASUPOriginalDbColumnName(){
				
					return "IBASUP";
				
				}

				
			    public BigDecimal IBASUY;

				public BigDecimal getIBASUY () {
					return this.IBASUY;
				}

				public Boolean IBASUYIsNullable(){
				    return true;
				}
				public Boolean IBASUYIsKey(){
				    return false;
				}
				public Integer IBASUYLength(){
				    return null;
				}
				public Integer IBASUYPrecision(){
				    return null;
				}
				public String IBASUYDefault(){
				
					return "";
				
				}
				public String IBASUYComment(){
				
				    return "";
				
				}
				public String IBASUYPattern(){
				
					return "";
				
				}
				public String IBASUYOriginalDbColumnName(){
				
					return "IBASUY";
				
				}

				
			    public BigDecimal IBASDP;

				public BigDecimal getIBASDP () {
					return this.IBASDP;
				}

				public Boolean IBASDPIsNullable(){
				    return true;
				}
				public Boolean IBASDPIsKey(){
				    return false;
				}
				public Integer IBASDPLength(){
				    return null;
				}
				public Integer IBASDPPrecision(){
				    return null;
				}
				public String IBASDPDefault(){
				
					return "";
				
				}
				public String IBASDPComment(){
				
				    return "";
				
				}
				public String IBASDPPattern(){
				
					return "";
				
				}
				public String IBASDPOriginalDbColumnName(){
				
					return "IBASDP";
				
				}

				
			    public BigDecimal IBASDY;

				public BigDecimal getIBASDY () {
					return this.IBASDY;
				}

				public Boolean IBASDYIsNullable(){
				    return true;
				}
				public Boolean IBASDYIsKey(){
				    return false;
				}
				public Integer IBASDYLength(){
				    return null;
				}
				public Integer IBASDYPrecision(){
				    return null;
				}
				public String IBASDYDefault(){
				
					return "";
				
				}
				public String IBASDYComment(){
				
				    return "";
				
				}
				public String IBASDYPattern(){
				
					return "";
				
				}
				public String IBASDYOriginalDbColumnName(){
				
					return "IBASDY";
				
				}

				
			    public BigDecimal IBVASP;

				public BigDecimal getIBVASP () {
					return this.IBVASP;
				}

				public Boolean IBVASPIsNullable(){
				    return true;
				}
				public Boolean IBVASPIsKey(){
				    return false;
				}
				public Integer IBVASPLength(){
				    return null;
				}
				public Integer IBVASPPrecision(){
				    return null;
				}
				public String IBVASPDefault(){
				
					return "";
				
				}
				public String IBVASPComment(){
				
				    return "";
				
				}
				public String IBVASPPattern(){
				
					return "";
				
				}
				public String IBVASPOriginalDbColumnName(){
				
					return "IBVASP";
				
				}

				
			    public BigDecimal IBVASY;

				public BigDecimal getIBVASY () {
					return this.IBVASY;
				}

				public Boolean IBVASYIsNullable(){
				    return true;
				}
				public Boolean IBVASYIsKey(){
				    return false;
				}
				public Integer IBVASYLength(){
				    return null;
				}
				public Integer IBVASYPrecision(){
				    return null;
				}
				public String IBVASYDefault(){
				
					return "";
				
				}
				public String IBVASYComment(){
				
				    return "";
				
				}
				public String IBVASYPattern(){
				
					return "";
				
				}
				public String IBVASYOriginalDbColumnName(){
				
					return "IBVASY";
				
				}

				
			    public BigDecimal IBACSP;

				public BigDecimal getIBACSP () {
					return this.IBACSP;
				}

				public Boolean IBACSPIsNullable(){
				    return true;
				}
				public Boolean IBACSPIsKey(){
				    return false;
				}
				public Integer IBACSPLength(){
				    return null;
				}
				public Integer IBACSPPrecision(){
				    return null;
				}
				public String IBACSPDefault(){
				
					return "";
				
				}
				public String IBACSPComment(){
				
				    return "";
				
				}
				public String IBACSPPattern(){
				
					return "";
				
				}
				public String IBACSPOriginalDbColumnName(){
				
					return "IBACSP";
				
				}

				
			    public BigDecimal IBACSY;

				public BigDecimal getIBACSY () {
					return this.IBACSY;
				}

				public Boolean IBACSYIsNullable(){
				    return true;
				}
				public Boolean IBACSYIsKey(){
				    return false;
				}
				public Integer IBACSYLength(){
				    return null;
				}
				public Integer IBACSYPrecision(){
				    return null;
				}
				public String IBACSYDefault(){
				
					return "";
				
				}
				public String IBACSYComment(){
				
				    return "";
				
				}
				public String IBACSYPattern(){
				
					return "";
				
				}
				public String IBACSYOriginalDbColumnName(){
				
					return "IBACSY";
				
				}

				
			    public BigDecimal IBRETS;

				public BigDecimal getIBRETS () {
					return this.IBRETS;
				}

				public Boolean IBRETSIsNullable(){
				    return true;
				}
				public Boolean IBRETSIsKey(){
				    return false;
				}
				public Integer IBRETSLength(){
				    return null;
				}
				public Integer IBRETSPrecision(){
				    return null;
				}
				public String IBRETSDefault(){
				
					return "";
				
				}
				public String IBRETSComment(){
				
				    return "";
				
				}
				public String IBRETSPattern(){
				
					return "";
				
				}
				public String IBRETSOriginalDbColumnName(){
				
					return "IBRETS";
				
				}

				
			    public BigDecimal IBRCUP;

				public BigDecimal getIBRCUP () {
					return this.IBRCUP;
				}

				public Boolean IBRCUPIsNullable(){
				    return true;
				}
				public Boolean IBRCUPIsKey(){
				    return false;
				}
				public Integer IBRCUPLength(){
				    return null;
				}
				public Integer IBRCUPPrecision(){
				    return null;
				}
				public String IBRCUPDefault(){
				
					return "";
				
				}
				public String IBRCUPComment(){
				
				    return "";
				
				}
				public String IBRCUPPattern(){
				
					return "";
				
				}
				public String IBRCUPOriginalDbColumnName(){
				
					return "IBRCUP";
				
				}

				
			    public BigDecimal IBRCUY;

				public BigDecimal getIBRCUY () {
					return this.IBRCUY;
				}

				public Boolean IBRCUYIsNullable(){
				    return true;
				}
				public Boolean IBRCUYIsKey(){
				    return false;
				}
				public Integer IBRCUYLength(){
				    return null;
				}
				public Integer IBRCUYPrecision(){
				    return null;
				}
				public String IBRCUYDefault(){
				
					return "";
				
				}
				public String IBRCUYComment(){
				
				    return "";
				
				}
				public String IBRCUYPattern(){
				
					return "";
				
				}
				public String IBRCUYOriginalDbColumnName(){
				
					return "IBRCUY";
				
				}

				
			    public BigDecimal IBRCDP;

				public BigDecimal getIBRCDP () {
					return this.IBRCDP;
				}

				public Boolean IBRCDPIsNullable(){
				    return true;
				}
				public Boolean IBRCDPIsKey(){
				    return false;
				}
				public Integer IBRCDPLength(){
				    return null;
				}
				public Integer IBRCDPPrecision(){
				    return null;
				}
				public String IBRCDPDefault(){
				
					return "";
				
				}
				public String IBRCDPComment(){
				
				    return "";
				
				}
				public String IBRCDPPattern(){
				
					return "";
				
				}
				public String IBRCDPOriginalDbColumnName(){
				
					return "IBRCDP";
				
				}

				
			    public BigDecimal IBRCDY;

				public BigDecimal getIBRCDY () {
					return this.IBRCDY;
				}

				public Boolean IBRCDYIsNullable(){
				    return true;
				}
				public Boolean IBRCDYIsKey(){
				    return false;
				}
				public Integer IBRCDYLength(){
				    return null;
				}
				public Integer IBRCDYPrecision(){
				    return null;
				}
				public String IBRCDYDefault(){
				
					return "";
				
				}
				public String IBRCDYComment(){
				
				    return "";
				
				}
				public String IBRCDYPattern(){
				
					return "";
				
				}
				public String IBRCDYOriginalDbColumnName(){
				
					return "IBRCDY";
				
				}

				
			    public BigDecimal IBTIUP;

				public BigDecimal getIBTIUP () {
					return this.IBTIUP;
				}

				public Boolean IBTIUPIsNullable(){
				    return true;
				}
				public Boolean IBTIUPIsKey(){
				    return false;
				}
				public Integer IBTIUPLength(){
				    return null;
				}
				public Integer IBTIUPPrecision(){
				    return null;
				}
				public String IBTIUPDefault(){
				
					return "";
				
				}
				public String IBTIUPComment(){
				
				    return "";
				
				}
				public String IBTIUPPattern(){
				
					return "";
				
				}
				public String IBTIUPOriginalDbColumnName(){
				
					return "IBTIUP";
				
				}

				
			    public BigDecimal IBTIUY;

				public BigDecimal getIBTIUY () {
					return this.IBTIUY;
				}

				public Boolean IBTIUYIsNullable(){
				    return true;
				}
				public Boolean IBTIUYIsKey(){
				    return false;
				}
				public Integer IBTIUYLength(){
				    return null;
				}
				public Integer IBTIUYPrecision(){
				    return null;
				}
				public String IBTIUYDefault(){
				
					return "";
				
				}
				public String IBTIUYComment(){
				
				    return "";
				
				}
				public String IBTIUYPattern(){
				
					return "";
				
				}
				public String IBTIUYOriginalDbColumnName(){
				
					return "IBTIUY";
				
				}

				
			    public BigDecimal IBTOUP;

				public BigDecimal getIBTOUP () {
					return this.IBTOUP;
				}

				public Boolean IBTOUPIsNullable(){
				    return true;
				}
				public Boolean IBTOUPIsKey(){
				    return false;
				}
				public Integer IBTOUPLength(){
				    return null;
				}
				public Integer IBTOUPPrecision(){
				    return null;
				}
				public String IBTOUPDefault(){
				
					return "";
				
				}
				public String IBTOUPComment(){
				
				    return "";
				
				}
				public String IBTOUPPattern(){
				
					return "";
				
				}
				public String IBTOUPOriginalDbColumnName(){
				
					return "IBTOUP";
				
				}

				
			    public BigDecimal IBTOUY;

				public BigDecimal getIBTOUY () {
					return this.IBTOUY;
				}

				public Boolean IBTOUYIsNullable(){
				    return true;
				}
				public Boolean IBTOUYIsKey(){
				    return false;
				}
				public Integer IBTOUYLength(){
				    return null;
				}
				public Integer IBTOUYPrecision(){
				    return null;
				}
				public String IBTOUYDefault(){
				
					return "";
				
				}
				public String IBTOUYComment(){
				
				    return "";
				
				}
				public String IBTOUYPattern(){
				
					return "";
				
				}
				public String IBTOUYOriginalDbColumnName(){
				
					return "IBTOUY";
				
				}

				
			    public BigDecimal IBTFDP;

				public BigDecimal getIBTFDP () {
					return this.IBTFDP;
				}

				public Boolean IBTFDPIsNullable(){
				    return true;
				}
				public Boolean IBTFDPIsKey(){
				    return false;
				}
				public Integer IBTFDPLength(){
				    return null;
				}
				public Integer IBTFDPPrecision(){
				    return null;
				}
				public String IBTFDPDefault(){
				
					return "";
				
				}
				public String IBTFDPComment(){
				
				    return "";
				
				}
				public String IBTFDPPattern(){
				
					return "";
				
				}
				public String IBTFDPOriginalDbColumnName(){
				
					return "IBTFDP";
				
				}

				
			    public BigDecimal IBTFDY;

				public BigDecimal getIBTFDY () {
					return this.IBTFDY;
				}

				public Boolean IBTFDYIsNullable(){
				    return true;
				}
				public Boolean IBTFDYIsKey(){
				    return false;
				}
				public Integer IBTFDYLength(){
				    return null;
				}
				public Integer IBTFDYPrecision(){
				    return null;
				}
				public String IBTFDYDefault(){
				
					return "";
				
				}
				public String IBTFDYComment(){
				
				    return "";
				
				}
				public String IBTFDYPattern(){
				
					return "";
				
				}
				public String IBTFDYOriginalDbColumnName(){
				
					return "IBTFDY";
				
				}

				
			    public BigDecimal IBRVUP;

				public BigDecimal getIBRVUP () {
					return this.IBRVUP;
				}

				public Boolean IBRVUPIsNullable(){
				    return true;
				}
				public Boolean IBRVUPIsKey(){
				    return false;
				}
				public Integer IBRVUPLength(){
				    return null;
				}
				public Integer IBRVUPPrecision(){
				    return null;
				}
				public String IBRVUPDefault(){
				
					return "";
				
				}
				public String IBRVUPComment(){
				
				    return "";
				
				}
				public String IBRVUPPattern(){
				
					return "";
				
				}
				public String IBRVUPOriginalDbColumnName(){
				
					return "IBRVUP";
				
				}

				
			    public BigDecimal IBRVUY;

				public BigDecimal getIBRVUY () {
					return this.IBRVUY;
				}

				public Boolean IBRVUYIsNullable(){
				    return true;
				}
				public Boolean IBRVUYIsKey(){
				    return false;
				}
				public Integer IBRVUYLength(){
				    return null;
				}
				public Integer IBRVUYPrecision(){
				    return null;
				}
				public String IBRVUYDefault(){
				
					return "";
				
				}
				public String IBRVUYComment(){
				
				    return "";
				
				}
				public String IBRVUYPattern(){
				
					return "";
				
				}
				public String IBRVUYOriginalDbColumnName(){
				
					return "IBRVUY";
				
				}

				
			    public BigDecimal IBRVDP;

				public BigDecimal getIBRVDP () {
					return this.IBRVDP;
				}

				public Boolean IBRVDPIsNullable(){
				    return true;
				}
				public Boolean IBRVDPIsKey(){
				    return false;
				}
				public Integer IBRVDPLength(){
				    return null;
				}
				public Integer IBRVDPPrecision(){
				    return null;
				}
				public String IBRVDPDefault(){
				
					return "";
				
				}
				public String IBRVDPComment(){
				
				    return "";
				
				}
				public String IBRVDPPattern(){
				
					return "";
				
				}
				public String IBRVDPOriginalDbColumnName(){
				
					return "IBRVDP";
				
				}

				
			    public BigDecimal IBRVDY;

				public BigDecimal getIBRVDY () {
					return this.IBRVDY;
				}

				public Boolean IBRVDYIsNullable(){
				    return true;
				}
				public Boolean IBRVDYIsKey(){
				    return false;
				}
				public Integer IBRVDYLength(){
				    return null;
				}
				public Integer IBRVDYPrecision(){
				    return null;
				}
				public String IBRVDYDefault(){
				
					return "";
				
				}
				public String IBRVDYComment(){
				
				    return "";
				
				}
				public String IBRVDYPattern(){
				
					return "";
				
				}
				public String IBRVDYOriginalDbColumnName(){
				
					return "IBRVDY";
				
				}

				
			    public BigDecimal IBAJUP;

				public BigDecimal getIBAJUP () {
					return this.IBAJUP;
				}

				public Boolean IBAJUPIsNullable(){
				    return true;
				}
				public Boolean IBAJUPIsKey(){
				    return false;
				}
				public Integer IBAJUPLength(){
				    return null;
				}
				public Integer IBAJUPPrecision(){
				    return null;
				}
				public String IBAJUPDefault(){
				
					return "";
				
				}
				public String IBAJUPComment(){
				
				    return "";
				
				}
				public String IBAJUPPattern(){
				
					return "";
				
				}
				public String IBAJUPOriginalDbColumnName(){
				
					return "IBAJUP";
				
				}

				
			    public BigDecimal IBAJUY;

				public BigDecimal getIBAJUY () {
					return this.IBAJUY;
				}

				public Boolean IBAJUYIsNullable(){
				    return true;
				}
				public Boolean IBAJUYIsKey(){
				    return false;
				}
				public Integer IBAJUYLength(){
				    return null;
				}
				public Integer IBAJUYPrecision(){
				    return null;
				}
				public String IBAJUYDefault(){
				
					return "";
				
				}
				public String IBAJUYComment(){
				
				    return "";
				
				}
				public String IBAJUYPattern(){
				
					return "";
				
				}
				public String IBAJUYOriginalDbColumnName(){
				
					return "IBAJUY";
				
				}

				
			    public BigDecimal IBAJDP;

				public BigDecimal getIBAJDP () {
					return this.IBAJDP;
				}

				public Boolean IBAJDPIsNullable(){
				    return true;
				}
				public Boolean IBAJDPIsKey(){
				    return false;
				}
				public Integer IBAJDPLength(){
				    return null;
				}
				public Integer IBAJDPPrecision(){
				    return null;
				}
				public String IBAJDPDefault(){
				
					return "";
				
				}
				public String IBAJDPComment(){
				
				    return "";
				
				}
				public String IBAJDPPattern(){
				
					return "";
				
				}
				public String IBAJDPOriginalDbColumnName(){
				
					return "IBAJDP";
				
				}

				
			    public BigDecimal IBAJDY;

				public BigDecimal getIBAJDY () {
					return this.IBAJDY;
				}

				public Boolean IBAJDYIsNullable(){
				    return true;
				}
				public Boolean IBAJDYIsKey(){
				    return false;
				}
				public Integer IBAJDYLength(){
				    return null;
				}
				public Integer IBAJDYPrecision(){
				    return null;
				}
				public String IBAJDYDefault(){
				
					return "";
				
				}
				public String IBAJDYComment(){
				
				    return "";
				
				}
				public String IBAJDYPattern(){
				
					return "";
				
				}
				public String IBAJDYOriginalDbColumnName(){
				
					return "IBAJDY";
				
				}

				
			    public BigDecimal IBPHUP;

				public BigDecimal getIBPHUP () {
					return this.IBPHUP;
				}

				public Boolean IBPHUPIsNullable(){
				    return true;
				}
				public Boolean IBPHUPIsKey(){
				    return false;
				}
				public Integer IBPHUPLength(){
				    return null;
				}
				public Integer IBPHUPPrecision(){
				    return null;
				}
				public String IBPHUPDefault(){
				
					return "";
				
				}
				public String IBPHUPComment(){
				
				    return "";
				
				}
				public String IBPHUPPattern(){
				
					return "";
				
				}
				public String IBPHUPOriginalDbColumnName(){
				
					return "IBPHUP";
				
				}

				
			    public BigDecimal IBPHUY;

				public BigDecimal getIBPHUY () {
					return this.IBPHUY;
				}

				public Boolean IBPHUYIsNullable(){
				    return true;
				}
				public Boolean IBPHUYIsKey(){
				    return false;
				}
				public Integer IBPHUYLength(){
				    return null;
				}
				public Integer IBPHUYPrecision(){
				    return null;
				}
				public String IBPHUYDefault(){
				
					return "";
				
				}
				public String IBPHUYComment(){
				
				    return "";
				
				}
				public String IBPHUYPattern(){
				
					return "";
				
				}
				public String IBPHUYOriginalDbColumnName(){
				
					return "IBPHUY";
				
				}

				
			    public BigDecimal IBPHDP;

				public BigDecimal getIBPHDP () {
					return this.IBPHDP;
				}

				public Boolean IBPHDPIsNullable(){
				    return true;
				}
				public Boolean IBPHDPIsKey(){
				    return false;
				}
				public Integer IBPHDPLength(){
				    return null;
				}
				public Integer IBPHDPPrecision(){
				    return null;
				}
				public String IBPHDPDefault(){
				
					return "";
				
				}
				public String IBPHDPComment(){
				
				    return "";
				
				}
				public String IBPHDPPattern(){
				
					return "";
				
				}
				public String IBPHDPOriginalDbColumnName(){
				
					return "IBPHDP";
				
				}

				
			    public BigDecimal IBPHDY;

				public BigDecimal getIBPHDY () {
					return this.IBPHDY;
				}

				public Boolean IBPHDYIsNullable(){
				    return true;
				}
				public Boolean IBPHDYIsKey(){
				    return false;
				}
				public Integer IBPHDYLength(){
				    return null;
				}
				public Integer IBPHDYPrecision(){
				    return null;
				}
				public String IBPHDYDefault(){
				
					return "";
				
				}
				public String IBPHDYComment(){
				
				    return "";
				
				}
				public String IBPHDYPattern(){
				
					return "";
				
				}
				public String IBPHDYOriginalDbColumnName(){
				
					return "IBPHDY";
				
				}

				
			    public BigDecimal IBCEN1;

				public BigDecimal getIBCEN1 () {
					return this.IBCEN1;
				}

				public Boolean IBCEN1IsNullable(){
				    return true;
				}
				public Boolean IBCEN1IsKey(){
				    return false;
				}
				public Integer IBCEN1Length(){
				    return null;
				}
				public Integer IBCEN1Precision(){
				    return null;
				}
				public String IBCEN1Default(){
				
					return "";
				
				}
				public String IBCEN1Comment(){
				
				    return "";
				
				}
				public String IBCEN1Pattern(){
				
					return "";
				
				}
				public String IBCEN1OriginalDbColumnName(){
				
					return "IBCEN1";
				
				}

				
			    public BigDecimal IBALD1;

				public BigDecimal getIBALD1 () {
					return this.IBALD1;
				}

				public Boolean IBALD1IsNullable(){
				    return true;
				}
				public Boolean IBALD1IsKey(){
				    return false;
				}
				public Integer IBALD1Length(){
				    return null;
				}
				public Integer IBALD1Precision(){
				    return null;
				}
				public String IBALD1Default(){
				
					return "";
				
				}
				public String IBALD1Comment(){
				
				    return "";
				
				}
				public String IBALD1Pattern(){
				
					return "";
				
				}
				public String IBALD1OriginalDbColumnName(){
				
					return "IBALD1";
				
				}

				
			    public BigDecimal IBCEN2;

				public BigDecimal getIBCEN2 () {
					return this.IBCEN2;
				}

				public Boolean IBCEN2IsNullable(){
				    return true;
				}
				public Boolean IBCEN2IsKey(){
				    return false;
				}
				public Integer IBCEN2Length(){
				    return null;
				}
				public Integer IBCEN2Precision(){
				    return null;
				}
				public String IBCEN2Default(){
				
					return "";
				
				}
				public String IBCEN2Comment(){
				
				    return "";
				
				}
				public String IBCEN2Pattern(){
				
					return "";
				
				}
				public String IBCEN2OriginalDbColumnName(){
				
					return "IBCEN2";
				
				}

				
			    public BigDecimal IBALD2;

				public BigDecimal getIBALD2 () {
					return this.IBALD2;
				}

				public Boolean IBALD2IsNullable(){
				    return true;
				}
				public Boolean IBALD2IsKey(){
				    return false;
				}
				public Integer IBALD2Length(){
				    return null;
				}
				public Integer IBALD2Precision(){
				    return null;
				}
				public String IBALD2Default(){
				
					return "";
				
				}
				public String IBALD2Comment(){
				
				    return "";
				
				}
				public String IBALD2Pattern(){
				
					return "";
				
				}
				public String IBALD2OriginalDbColumnName(){
				
					return "IBALD2";
				
				}

				
			    public BigDecimal IBCEN3;

				public BigDecimal getIBCEN3 () {
					return this.IBCEN3;
				}

				public Boolean IBCEN3IsNullable(){
				    return true;
				}
				public Boolean IBCEN3IsKey(){
				    return false;
				}
				public Integer IBCEN3Length(){
				    return null;
				}
				public Integer IBCEN3Precision(){
				    return null;
				}
				public String IBCEN3Default(){
				
					return "";
				
				}
				public String IBCEN3Comment(){
				
				    return "";
				
				}
				public String IBCEN3Pattern(){
				
					return "";
				
				}
				public String IBCEN3OriginalDbColumnName(){
				
					return "IBCEN3";
				
				}

				
			    public BigDecimal IBALD3;

				public BigDecimal getIBALD3 () {
					return this.IBALD3;
				}

				public Boolean IBALD3IsNullable(){
				    return true;
				}
				public Boolean IBALD3IsKey(){
				    return false;
				}
				public Integer IBALD3Length(){
				    return null;
				}
				public Integer IBALD3Precision(){
				    return null;
				}
				public String IBALD3Default(){
				
					return "";
				
				}
				public String IBALD3Comment(){
				
				    return "";
				
				}
				public String IBALD3Pattern(){
				
					return "";
				
				}
				public String IBALD3OriginalDbColumnName(){
				
					return "IBALD3";
				
				}

				
			    public BigDecimal IBCEN4;

				public BigDecimal getIBCEN4 () {
					return this.IBCEN4;
				}

				public Boolean IBCEN4IsNullable(){
				    return true;
				}
				public Boolean IBCEN4IsKey(){
				    return false;
				}
				public Integer IBCEN4Length(){
				    return null;
				}
				public Integer IBCEN4Precision(){
				    return null;
				}
				public String IBCEN4Default(){
				
					return "";
				
				}
				public String IBCEN4Comment(){
				
				    return "";
				
				}
				public String IBCEN4Pattern(){
				
					return "";
				
				}
				public String IBCEN4OriginalDbColumnName(){
				
					return "IBCEN4";
				
				}

				
			    public BigDecimal IBALD4;

				public BigDecimal getIBALD4 () {
					return this.IBALD4;
				}

				public Boolean IBALD4IsNullable(){
				    return true;
				}
				public Boolean IBALD4IsKey(){
				    return false;
				}
				public Integer IBALD4Length(){
				    return null;
				}
				public Integer IBALD4Precision(){
				    return null;
				}
				public String IBALD4Default(){
				
					return "";
				
				}
				public String IBALD4Comment(){
				
				    return "";
				
				}
				public String IBALD4Pattern(){
				
					return "";
				
				}
				public String IBALD4OriginalDbColumnName(){
				
					return "IBALD4";
				
				}

				
			    public BigDecimal IBCEN5;

				public BigDecimal getIBCEN5 () {
					return this.IBCEN5;
				}

				public Boolean IBCEN5IsNullable(){
				    return true;
				}
				public Boolean IBCEN5IsKey(){
				    return false;
				}
				public Integer IBCEN5Length(){
				    return null;
				}
				public Integer IBCEN5Precision(){
				    return null;
				}
				public String IBCEN5Default(){
				
					return "";
				
				}
				public String IBCEN5Comment(){
				
				    return "";
				
				}
				public String IBCEN5Pattern(){
				
					return "";
				
				}
				public String IBCEN5OriginalDbColumnName(){
				
					return "IBCEN5";
				
				}

				
			    public BigDecimal IBALD5;

				public BigDecimal getIBALD5 () {
					return this.IBALD5;
				}

				public Boolean IBALD5IsNullable(){
				    return true;
				}
				public Boolean IBALD5IsKey(){
				    return false;
				}
				public Integer IBALD5Length(){
				    return null;
				}
				public Integer IBALD5Precision(){
				    return null;
				}
				public String IBALD5Default(){
				
					return "";
				
				}
				public String IBALD5Comment(){
				
				    return "";
				
				}
				public String IBALD5Pattern(){
				
					return "";
				
				}
				public String IBALD5OriginalDbColumnName(){
				
					return "IBALD5";
				
				}

				
			    public BigDecimal IBAVGC;

				public BigDecimal getIBAVGC () {
					return this.IBAVGC;
				}

				public Boolean IBAVGCIsNullable(){
				    return true;
				}
				public Boolean IBAVGCIsKey(){
				    return false;
				}
				public Integer IBAVGCLength(){
				    return null;
				}
				public Integer IBAVGCPrecision(){
				    return null;
				}
				public String IBAVGCDefault(){
				
					return "";
				
				}
				public String IBAVGCComment(){
				
				    return "";
				
				}
				public String IBAVGCPattern(){
				
					return "";
				
				}
				public String IBAVGCOriginalDbColumnName(){
				
					return "IBAVGC";
				
				}

				
			    public BigDecimal IBQLRC;

				public BigDecimal getIBQLRC () {
					return this.IBQLRC;
				}

				public Boolean IBQLRCIsNullable(){
				    return true;
				}
				public Boolean IBQLRCIsKey(){
				    return false;
				}
				public Integer IBQLRCLength(){
				    return null;
				}
				public Integer IBQLRCPrecision(){
				    return null;
				}
				public String IBQLRCDefault(){
				
					return "";
				
				}
				public String IBQLRCComment(){
				
				    return "";
				
				}
				public String IBQLRCPattern(){
				
					return "";
				
				}
				public String IBQLRCOriginalDbColumnName(){
				
					return "IBQLRC";
				
				}

				
			    public BigDecimal IBAVOH;

				public BigDecimal getIBAVOH () {
					return this.IBAVOH;
				}

				public Boolean IBAVOHIsNullable(){
				    return true;
				}
				public Boolean IBAVOHIsKey(){
				    return false;
				}
				public Integer IBAVOHLength(){
				    return null;
				}
				public Integer IBAVOHPrecision(){
				    return null;
				}
				public String IBAVOHDefault(){
				
					return "";
				
				}
				public String IBAVOHComment(){
				
				    return "";
				
				}
				public String IBAVOHPattern(){
				
					return "";
				
				}
				public String IBAVOHOriginalDbColumnName(){
				
					return "IBAVOH";
				
				}

				
			    public BigDecimal IBAVRT;

				public BigDecimal getIBAVRT () {
					return this.IBAVRT;
				}

				public Boolean IBAVRTIsNullable(){
				    return true;
				}
				public Boolean IBAVRTIsKey(){
				    return false;
				}
				public Integer IBAVRTLength(){
				    return null;
				}
				public Integer IBAVRTPrecision(){
				    return null;
				}
				public String IBAVRTDefault(){
				
					return "";
				
				}
				public String IBAVRTComment(){
				
				    return "";
				
				}
				public String IBAVRTPattern(){
				
					return "";
				
				}
				public String IBAVRTOriginalDbColumnName(){
				
					return "IBAVRT";
				
				}

				
			    public BigDecimal IBAVCS;

				public BigDecimal getIBAVCS () {
					return this.IBAVCS;
				}

				public Boolean IBAVCSIsNullable(){
				    return true;
				}
				public Boolean IBAVCSIsKey(){
				    return false;
				}
				public Integer IBAVCSLength(){
				    return null;
				}
				public Integer IBAVCSPrecision(){
				    return null;
				}
				public String IBAVCSDefault(){
				
					return "";
				
				}
				public String IBAVCSComment(){
				
				    return "";
				
				}
				public String IBAVCSPattern(){
				
					return "";
				
				}
				public String IBAVCSOriginalDbColumnName(){
				
					return "IBAVCS";
				
				}

				
			    public String IBOSCR;

				public String getIBOSCR () {
					return this.IBOSCR;
				}

				public Boolean IBOSCRIsNullable(){
				    return true;
				}
				public Boolean IBOSCRIsKey(){
				    return false;
				}
				public Integer IBOSCRLength(){
				    return null;
				}
				public Integer IBOSCRPrecision(){
				    return null;
				}
				public String IBOSCRDefault(){
				
					return "";
				
				}
				public String IBOSCRComment(){
				
				    return "";
				
				}
				public String IBOSCRPattern(){
				
					return "";
				
				}
				public String IBOSCROriginalDbColumnName(){
				
					return "IBOSCR";
				
				}

				
			    public String IBOS01;

				public String getIBOS01 () {
					return this.IBOS01;
				}

				public Boolean IBOS01IsNullable(){
				    return true;
				}
				public Boolean IBOS01IsKey(){
				    return false;
				}
				public Integer IBOS01Length(){
				    return null;
				}
				public Integer IBOS01Precision(){
				    return null;
				}
				public String IBOS01Default(){
				
					return "";
				
				}
				public String IBOS01Comment(){
				
				    return "";
				
				}
				public String IBOS01Pattern(){
				
					return "";
				
				}
				public String IBOS01OriginalDbColumnName(){
				
					return "IBOS01";
				
				}

				
			    public String IBOS02;

				public String getIBOS02 () {
					return this.IBOS02;
				}

				public Boolean IBOS02IsNullable(){
				    return true;
				}
				public Boolean IBOS02IsKey(){
				    return false;
				}
				public Integer IBOS02Length(){
				    return null;
				}
				public Integer IBOS02Precision(){
				    return null;
				}
				public String IBOS02Default(){
				
					return "";
				
				}
				public String IBOS02Comment(){
				
				    return "";
				
				}
				public String IBOS02Pattern(){
				
					return "";
				
				}
				public String IBOS02OriginalDbColumnName(){
				
					return "IBOS02";
				
				}

				
			    public String IBOS03;

				public String getIBOS03 () {
					return this.IBOS03;
				}

				public Boolean IBOS03IsNullable(){
				    return true;
				}
				public Boolean IBOS03IsKey(){
				    return false;
				}
				public Integer IBOS03Length(){
				    return null;
				}
				public Integer IBOS03Precision(){
				    return null;
				}
				public String IBOS03Default(){
				
					return "";
				
				}
				public String IBOS03Comment(){
				
				    return "";
				
				}
				public String IBOS03Pattern(){
				
					return "";
				
				}
				public String IBOS03OriginalDbColumnName(){
				
					return "IBOS03";
				
				}

				
			    public String IBOS04;

				public String getIBOS04 () {
					return this.IBOS04;
				}

				public Boolean IBOS04IsNullable(){
				    return true;
				}
				public Boolean IBOS04IsKey(){
				    return false;
				}
				public Integer IBOS04Length(){
				    return null;
				}
				public Integer IBOS04Precision(){
				    return null;
				}
				public String IBOS04Default(){
				
					return "";
				
				}
				public String IBOS04Comment(){
				
				    return "";
				
				}
				public String IBOS04Pattern(){
				
					return "";
				
				}
				public String IBOS04OriginalDbColumnName(){
				
					return "IBOS04";
				
				}

				
			    public String IBOS05;

				public String getIBOS05 () {
					return this.IBOS05;
				}

				public Boolean IBOS05IsNullable(){
				    return true;
				}
				public Boolean IBOS05IsKey(){
				    return false;
				}
				public Integer IBOS05Length(){
				    return null;
				}
				public Integer IBOS05Precision(){
				    return null;
				}
				public String IBOS05Default(){
				
					return "";
				
				}
				public String IBOS05Comment(){
				
				    return "";
				
				}
				public String IBOS05Pattern(){
				
					return "";
				
				}
				public String IBOS05OriginalDbColumnName(){
				
					return "IBOS05";
				
				}

				
			    public String IBOS06;

				public String getIBOS06 () {
					return this.IBOS06;
				}

				public Boolean IBOS06IsNullable(){
				    return true;
				}
				public Boolean IBOS06IsKey(){
				    return false;
				}
				public Integer IBOS06Length(){
				    return null;
				}
				public Integer IBOS06Precision(){
				    return null;
				}
				public String IBOS06Default(){
				
					return "";
				
				}
				public String IBOS06Comment(){
				
				    return "";
				
				}
				public String IBOS06Pattern(){
				
					return "";
				
				}
				public String IBOS06OriginalDbColumnName(){
				
					return "IBOS06";
				
				}

				
			    public String IBOS07;

				public String getIBOS07 () {
					return this.IBOS07;
				}

				public Boolean IBOS07IsNullable(){
				    return true;
				}
				public Boolean IBOS07IsKey(){
				    return false;
				}
				public Integer IBOS07Length(){
				    return null;
				}
				public Integer IBOS07Precision(){
				    return null;
				}
				public String IBOS07Default(){
				
					return "";
				
				}
				public String IBOS07Comment(){
				
				    return "";
				
				}
				public String IBOS07Pattern(){
				
					return "";
				
				}
				public String IBOS07OriginalDbColumnName(){
				
					return "IBOS07";
				
				}

				
			    public String IBOS08;

				public String getIBOS08 () {
					return this.IBOS08;
				}

				public Boolean IBOS08IsNullable(){
				    return true;
				}
				public Boolean IBOS08IsKey(){
				    return false;
				}
				public Integer IBOS08Length(){
				    return null;
				}
				public Integer IBOS08Precision(){
				    return null;
				}
				public String IBOS08Default(){
				
					return "";
				
				}
				public String IBOS08Comment(){
				
				    return "";
				
				}
				public String IBOS08Pattern(){
				
					return "";
				
				}
				public String IBOS08OriginalDbColumnName(){
				
					return "IBOS08";
				
				}

				
			    public BigDecimal IBDEPT;

				public BigDecimal getIBDEPT () {
					return this.IBDEPT;
				}

				public Boolean IBDEPTIsNullable(){
				    return true;
				}
				public Boolean IBDEPTIsKey(){
				    return false;
				}
				public Integer IBDEPTLength(){
				    return null;
				}
				public Integer IBDEPTPrecision(){
				    return null;
				}
				public String IBDEPTDefault(){
				
					return "";
				
				}
				public String IBDEPTComment(){
				
				    return "";
				
				}
				public String IBDEPTPattern(){
				
					return "";
				
				}
				public String IBDEPTOriginalDbColumnName(){
				
					return "IBDEPT";
				
				}

				
			    public BigDecimal IBSDPT;

				public BigDecimal getIBSDPT () {
					return this.IBSDPT;
				}

				public Boolean IBSDPTIsNullable(){
				    return true;
				}
				public Boolean IBSDPTIsKey(){
				    return false;
				}
				public Integer IBSDPTLength(){
				    return null;
				}
				public Integer IBSDPTPrecision(){
				    return null;
				}
				public String IBSDPTDefault(){
				
					return "";
				
				}
				public String IBSDPTComment(){
				
				    return "";
				
				}
				public String IBSDPTPattern(){
				
					return "";
				
				}
				public String IBSDPTOriginalDbColumnName(){
				
					return "IBSDPT";
				
				}

				
			    public BigDecimal IBCLAS;

				public BigDecimal getIBCLAS () {
					return this.IBCLAS;
				}

				public Boolean IBCLASIsNullable(){
				    return true;
				}
				public Boolean IBCLASIsKey(){
				    return false;
				}
				public Integer IBCLASLength(){
				    return null;
				}
				public Integer IBCLASPrecision(){
				    return null;
				}
				public String IBCLASDefault(){
				
					return "";
				
				}
				public String IBCLASComment(){
				
				    return "";
				
				}
				public String IBCLASPattern(){
				
					return "";
				
				}
				public String IBCLASOriginalDbColumnName(){
				
					return "IBCLAS";
				
				}

				
			    public BigDecimal IBSCLS;

				public BigDecimal getIBSCLS () {
					return this.IBSCLS;
				}

				public Boolean IBSCLSIsNullable(){
				    return true;
				}
				public Boolean IBSCLSIsKey(){
				    return false;
				}
				public Integer IBSCLSLength(){
				    return null;
				}
				public Integer IBSCLSPrecision(){
				    return null;
				}
				public String IBSCLSDefault(){
				
					return "";
				
				}
				public String IBSCLSComment(){
				
				    return "";
				
				}
				public String IBSCLSPattern(){
				
					return "";
				
				}
				public String IBSCLSOriginalDbColumnName(){
				
					return "IBSCLS";
				
				}

				
			    public BigDecimal IBFRCN;

				public BigDecimal getIBFRCN () {
					return this.IBFRCN;
				}

				public Boolean IBFRCNIsNullable(){
				    return true;
				}
				public Boolean IBFRCNIsKey(){
				    return false;
				}
				public Integer IBFRCNLength(){
				    return null;
				}
				public Integer IBFRCNPrecision(){
				    return null;
				}
				public String IBFRCNDefault(){
				
					return "";
				
				}
				public String IBFRCNComment(){
				
				    return "";
				
				}
				public String IBFRCNPattern(){
				
					return "";
				
				}
				public String IBFRCNOriginalDbColumnName(){
				
					return "IBFRCN";
				
				}

				
			    public BigDecimal IBFRDT;

				public BigDecimal getIBFRDT () {
					return this.IBFRDT;
				}

				public Boolean IBFRDTIsNullable(){
				    return true;
				}
				public Boolean IBFRDTIsKey(){
				    return false;
				}
				public Integer IBFRDTLength(){
				    return null;
				}
				public Integer IBFRDTPrecision(){
				    return null;
				}
				public String IBFRDTDefault(){
				
					return "";
				
				}
				public String IBFRDTComment(){
				
				    return "";
				
				}
				public String IBFRDTPattern(){
				
					return "";
				
				}
				public String IBFRDTOriginalDbColumnName(){
				
					return "IBFRDT";
				
				}

				
			    public BigDecimal IBVNDR;

				public BigDecimal getIBVNDR () {
					return this.IBVNDR;
				}

				public Boolean IBVNDRIsNullable(){
				    return true;
				}
				public Boolean IBVNDRIsKey(){
				    return false;
				}
				public Integer IBVNDRLength(){
				    return null;
				}
				public Integer IBVNDRPrecision(){
				    return null;
				}
				public String IBVNDRDefault(){
				
					return "";
				
				}
				public String IBVNDRComment(){
				
				    return "";
				
				}
				public String IBVNDRPattern(){
				
					return "";
				
				}
				public String IBVNDROriginalDbColumnName(){
				
					return "IBVNDR";
				
				}

				
			    public String IBSTYL;

				public String getIBSTYL () {
					return this.IBSTYL;
				}

				public Boolean IBSTYLIsNullable(){
				    return true;
				}
				public Boolean IBSTYLIsKey(){
				    return false;
				}
				public Integer IBSTYLLength(){
				    return null;
				}
				public Integer IBSTYLPrecision(){
				    return null;
				}
				public String IBSTYLDefault(){
				
					return "";
				
				}
				public String IBSTYLComment(){
				
				    return "";
				
				}
				public String IBSTYLPattern(){
				
					return "";
				
				}
				public String IBSTYLOriginalDbColumnName(){
				
					return "IBSTYL";
				
				}

				
			    public BigDecimal IBPOOQ;

				public BigDecimal getIBPOOQ () {
					return this.IBPOOQ;
				}

				public Boolean IBPOOQIsNullable(){
				    return true;
				}
				public Boolean IBPOOQIsKey(){
				    return false;
				}
				public Integer IBPOOQLength(){
				    return null;
				}
				public Integer IBPOOQPrecision(){
				    return null;
				}
				public String IBPOOQDefault(){
				
					return "";
				
				}
				public String IBPOOQComment(){
				
				    return "";
				
				}
				public String IBPOOQPattern(){
				
					return "";
				
				}
				public String IBPOOQOriginalDbColumnName(){
				
					return "IBPOOQ";
				
				}

				
			    public BigDecimal IBTOOQ;

				public BigDecimal getIBTOOQ () {
					return this.IBTOOQ;
				}

				public Boolean IBTOOQIsNullable(){
				    return true;
				}
				public Boolean IBTOOQIsKey(){
				    return false;
				}
				public Integer IBTOOQLength(){
				    return null;
				}
				public Integer IBTOOQPrecision(){
				    return null;
				}
				public String IBTOOQDefault(){
				
					return "";
				
				}
				public String IBTOOQComment(){
				
				    return "";
				
				}
				public String IBTOOQPattern(){
				
					return "";
				
				}
				public String IBTOOQOriginalDbColumnName(){
				
					return "IBTOOQ";
				
				}

				
			    public BigDecimal IBINTQ;

				public BigDecimal getIBINTQ () {
					return this.IBINTQ;
				}

				public Boolean IBINTQIsNullable(){
				    return true;
				}
				public Boolean IBINTQIsKey(){
				    return false;
				}
				public Integer IBINTQLength(){
				    return null;
				}
				public Integer IBINTQPrecision(){
				    return null;
				}
				public String IBINTQDefault(){
				
					return "";
				
				}
				public String IBINTQComment(){
				
				    return "";
				
				}
				public String IBINTQPattern(){
				
					return "";
				
				}
				public String IBINTQOriginalDbColumnName(){
				
					return "IBINTQ";
				
				}

				
			    public BigDecimal IBMASU;

				public BigDecimal getIBMASU () {
					return this.IBMASU;
				}

				public Boolean IBMASUIsNullable(){
				    return true;
				}
				public Boolean IBMASUIsKey(){
				    return false;
				}
				public Integer IBMASULength(){
				    return null;
				}
				public Integer IBMASUPrecision(){
				    return null;
				}
				public String IBMASUDefault(){
				
					return "";
				
				}
				public String IBMASUComment(){
				
				    return "";
				
				}
				public String IBMASUPattern(){
				
					return "";
				
				}
				public String IBMASUOriginalDbColumnName(){
				
					return "IBMASU";
				
				}

				
			    public BigDecimal IBMASD;

				public BigDecimal getIBMASD () {
					return this.IBMASD;
				}

				public Boolean IBMASDIsNullable(){
				    return true;
				}
				public Boolean IBMASDIsKey(){
				    return false;
				}
				public Integer IBMASDLength(){
				    return null;
				}
				public Integer IBMASDPrecision(){
				    return null;
				}
				public String IBMASDDefault(){
				
					return "";
				
				}
				public String IBMASDComment(){
				
				    return "";
				
				}
				public String IBMASDPattern(){
				
					return "";
				
				}
				public String IBMASDOriginalDbColumnName(){
				
					return "IBMASD";
				
				}

				
			    public BigDecimal IBMASV;

				public BigDecimal getIBMASV () {
					return this.IBMASV;
				}

				public Boolean IBMASVIsNullable(){
				    return true;
				}
				public Boolean IBMASVIsKey(){
				    return false;
				}
				public Integer IBMASVLength(){
				    return null;
				}
				public Integer IBMASVPrecision(){
				    return null;
				}
				public String IBMASVDefault(){
				
					return "";
				
				}
				public String IBMASVComment(){
				
				    return "";
				
				}
				public String IBMASVPattern(){
				
					return "";
				
				}
				public String IBMASVOriginalDbColumnName(){
				
					return "IBMASV";
				
				}

				
			    public BigDecimal IBMASC;

				public BigDecimal getIBMASC () {
					return this.IBMASC;
				}

				public Boolean IBMASCIsNullable(){
				    return true;
				}
				public Boolean IBMASCIsKey(){
				    return false;
				}
				public Integer IBMASCLength(){
				    return null;
				}
				public Integer IBMASCPrecision(){
				    return null;
				}
				public String IBMASCDefault(){
				
					return "";
				
				}
				public String IBMASCComment(){
				
				    return "";
				
				}
				public String IBMASCPattern(){
				
					return "";
				
				}
				public String IBMASCOriginalDbColumnName(){
				
					return "IBMASC";
				
				}

				
			    public BigDecimal IBLAVC;

				public BigDecimal getIBLAVC () {
					return this.IBLAVC;
				}

				public Boolean IBLAVCIsNullable(){
				    return true;
				}
				public Boolean IBLAVCIsKey(){
				    return false;
				}
				public Integer IBLAVCLength(){
				    return null;
				}
				public Integer IBLAVCPrecision(){
				    return null;
				}
				public String IBLAVCDefault(){
				
					return "";
				
				}
				public String IBLAVCComment(){
				
				    return "";
				
				}
				public String IBLAVCPattern(){
				
					return "";
				
				}
				public String IBLAVCOriginalDbColumnName(){
				
					return "IBLAVC";
				
				}

				
			    public BigDecimal IBARQT;

				public BigDecimal getIBARQT () {
					return this.IBARQT;
				}

				public Boolean IBARQTIsNullable(){
				    return true;
				}
				public Boolean IBARQTIsKey(){
				    return false;
				}
				public Integer IBARQTLength(){
				    return null;
				}
				public Integer IBARQTPrecision(){
				    return null;
				}
				public String IBARQTDefault(){
				
					return "";
				
				}
				public String IBARQTComment(){
				
				    return "";
				
				}
				public String IBARQTPattern(){
				
					return "";
				
				}
				public String IBARQTOriginalDbColumnName(){
				
					return "IBARQT";
				
				}

				
			    public BigDecimal IBNSQT;

				public BigDecimal getIBNSQT () {
					return this.IBNSQT;
				}

				public Boolean IBNSQTIsNullable(){
				    return true;
				}
				public Boolean IBNSQTIsKey(){
				    return false;
				}
				public Integer IBNSQTLength(){
				    return null;
				}
				public Integer IBNSQTPrecision(){
				    return null;
				}
				public String IBNSQTDefault(){
				
					return "";
				
				}
				public String IBNSQTComment(){
				
				    return "";
				
				}
				public String IBNSQTPattern(){
				
					return "";
				
				}
				public String IBNSQTOriginalDbColumnName(){
				
					return "IBNSQT";
				
				}

				
			    public BigDecimal IBPHND;

				public BigDecimal getIBPHND () {
					return this.IBPHND;
				}

				public Boolean IBPHNDIsNullable(){
				    return true;
				}
				public Boolean IBPHNDIsKey(){
				    return false;
				}
				public Integer IBPHNDLength(){
				    return null;
				}
				public Integer IBPHNDPrecision(){
				    return null;
				}
				public String IBPHNDDefault(){
				
					return "";
				
				}
				public String IBPHNDComment(){
				
				    return "";
				
				}
				public String IBPHNDPattern(){
				
					return "";
				
				}
				public String IBPHNDOriginalDbColumnName(){
				
					return "IBPHND";
				
				}

				
			    public BigDecimal IBHLDQ;

				public BigDecimal getIBHLDQ () {
					return this.IBHLDQ;
				}

				public Boolean IBHLDQIsNullable(){
				    return true;
				}
				public Boolean IBHLDQIsKey(){
				    return false;
				}
				public Integer IBHLDQLength(){
				    return null;
				}
				public Integer IBHLDQPrecision(){
				    return null;
				}
				public String IBHLDQDefault(){
				
					return "";
				
				}
				public String IBHLDQComment(){
				
				    return "";
				
				}
				public String IBHLDQPattern(){
				
					return "";
				
				}
				public String IBHLDQOriginalDbColumnName(){
				
					return "IBHLDQ";
				
				}

				
			    public String IBCRCD;

				public String getIBCRCD () {
					return this.IBCRCD;
				}

				public Boolean IBCRCDIsNullable(){
				    return true;
				}
				public Boolean IBCRCDIsKey(){
				    return false;
				}
				public Integer IBCRCDLength(){
				    return null;
				}
				public Integer IBCRCDPrecision(){
				    return null;
				}
				public String IBCRCDDefault(){
				
					return null;
				
				}
				public String IBCRCDComment(){
				
				    return "";
				
				}
				public String IBCRCDPattern(){
				
					return "";
				
				}
				public String IBCRCDOriginalDbColumnName(){
				
					return "IBCRCD";
				
				}

				
			    public java.util.Date DATELOADED;

				public java.util.Date getDATELOADED () {
					return this.DATELOADED;
				}

				public Boolean DATELOADEDIsNullable(){
				    return true;
				}
				public Boolean DATELOADEDIsKey(){
				    return false;
				}
				public Integer DATELOADEDLength(){
				    return null;
				}
				public Integer DATELOADEDPrecision(){
				    return null;
				}
				public String DATELOADEDDefault(){
				
					return null;
				
				}
				public String DATELOADEDComment(){
				
				    return "";
				
				}
				public String DATELOADEDPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String DATELOADEDOriginalDbColumnName(){
				
					return "DATELOADED";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
					this.DATELOADED = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
					this.DATELOADED = readDate(dis);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
					// java.util.Date
				
						writeDate(this.DATELOADED,dos);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
					// java.util.Date
				
						writeDate(this.DATELOADED,dos);
					
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
		sb.append(",IBHBOY="+String.valueOf(IBHBOY));
		sb.append(",IBHBOP="+String.valueOf(IBHBOP));
		sb.append(",IBHAND="+String.valueOf(IBHAND));
		sb.append(",IBTRNS="+String.valueOf(IBTRNS));
		sb.append(",IBGMRI="+String.valueOf(IBGMRI));
		sb.append(",IBWKCR="+String.valueOf(IBWKCR));
		sb.append(",IBWK01="+String.valueOf(IBWK01));
		sb.append(",IBWK02="+String.valueOf(IBWK02));
		sb.append(",IBWK03="+String.valueOf(IBWK03));
		sb.append(",IBWK04="+String.valueOf(IBWK04));
		sb.append(",IBWK05="+String.valueOf(IBWK05));
		sb.append(",IBWK06="+String.valueOf(IBWK06));
		sb.append(",IBWK07="+String.valueOf(IBWK07));
		sb.append(",IBWK08="+String.valueOf(IBWK08));
		sb.append(",IBNORD="+String.valueOf(IBNORD));
		sb.append(",IBLEAD="+String.valueOf(IBLEAD));
		sb.append(",IBRSUP="+String.valueOf(IBRSUP));
		sb.append(",IBRSUY="+String.valueOf(IBRSUY));
		sb.append(",IBRSDP="+String.valueOf(IBRSDP));
		sb.append(",IBRSDY="+String.valueOf(IBRSDY));
		sb.append(",IBVRSP="+String.valueOf(IBVRSP));
		sb.append(",IBVRSY="+String.valueOf(IBVRSY));
		sb.append(",IBRCSP="+String.valueOf(IBRCSP));
		sb.append(",IBRCSY="+String.valueOf(IBRCSY));
		sb.append(",IBASUP="+String.valueOf(IBASUP));
		sb.append(",IBASUY="+String.valueOf(IBASUY));
		sb.append(",IBASDP="+String.valueOf(IBASDP));
		sb.append(",IBASDY="+String.valueOf(IBASDY));
		sb.append(",IBVASP="+String.valueOf(IBVASP));
		sb.append(",IBVASY="+String.valueOf(IBVASY));
		sb.append(",IBACSP="+String.valueOf(IBACSP));
		sb.append(",IBACSY="+String.valueOf(IBACSY));
		sb.append(",IBRETS="+String.valueOf(IBRETS));
		sb.append(",IBRCUP="+String.valueOf(IBRCUP));
		sb.append(",IBRCUY="+String.valueOf(IBRCUY));
		sb.append(",IBRCDP="+String.valueOf(IBRCDP));
		sb.append(",IBRCDY="+String.valueOf(IBRCDY));
		sb.append(",IBTIUP="+String.valueOf(IBTIUP));
		sb.append(",IBTIUY="+String.valueOf(IBTIUY));
		sb.append(",IBTOUP="+String.valueOf(IBTOUP));
		sb.append(",IBTOUY="+String.valueOf(IBTOUY));
		sb.append(",IBTFDP="+String.valueOf(IBTFDP));
		sb.append(",IBTFDY="+String.valueOf(IBTFDY));
		sb.append(",IBRVUP="+String.valueOf(IBRVUP));
		sb.append(",IBRVUY="+String.valueOf(IBRVUY));
		sb.append(",IBRVDP="+String.valueOf(IBRVDP));
		sb.append(",IBRVDY="+String.valueOf(IBRVDY));
		sb.append(",IBAJUP="+String.valueOf(IBAJUP));
		sb.append(",IBAJUY="+String.valueOf(IBAJUY));
		sb.append(",IBAJDP="+String.valueOf(IBAJDP));
		sb.append(",IBAJDY="+String.valueOf(IBAJDY));
		sb.append(",IBPHUP="+String.valueOf(IBPHUP));
		sb.append(",IBPHUY="+String.valueOf(IBPHUY));
		sb.append(",IBPHDP="+String.valueOf(IBPHDP));
		sb.append(",IBPHDY="+String.valueOf(IBPHDY));
		sb.append(",IBCEN1="+String.valueOf(IBCEN1));
		sb.append(",IBALD1="+String.valueOf(IBALD1));
		sb.append(",IBCEN2="+String.valueOf(IBCEN2));
		sb.append(",IBALD2="+String.valueOf(IBALD2));
		sb.append(",IBCEN3="+String.valueOf(IBCEN3));
		sb.append(",IBALD3="+String.valueOf(IBALD3));
		sb.append(",IBCEN4="+String.valueOf(IBCEN4));
		sb.append(",IBALD4="+String.valueOf(IBALD4));
		sb.append(",IBCEN5="+String.valueOf(IBCEN5));
		sb.append(",IBALD5="+String.valueOf(IBALD5));
		sb.append(",IBAVGC="+String.valueOf(IBAVGC));
		sb.append(",IBQLRC="+String.valueOf(IBQLRC));
		sb.append(",IBAVOH="+String.valueOf(IBAVOH));
		sb.append(",IBAVRT="+String.valueOf(IBAVRT));
		sb.append(",IBAVCS="+String.valueOf(IBAVCS));
		sb.append(",IBOSCR="+IBOSCR);
		sb.append(",IBOS01="+IBOS01);
		sb.append(",IBOS02="+IBOS02);
		sb.append(",IBOS03="+IBOS03);
		sb.append(",IBOS04="+IBOS04);
		sb.append(",IBOS05="+IBOS05);
		sb.append(",IBOS06="+IBOS06);
		sb.append(",IBOS07="+IBOS07);
		sb.append(",IBOS08="+IBOS08);
		sb.append(",IBDEPT="+String.valueOf(IBDEPT));
		sb.append(",IBSDPT="+String.valueOf(IBSDPT));
		sb.append(",IBCLAS="+String.valueOf(IBCLAS));
		sb.append(",IBSCLS="+String.valueOf(IBSCLS));
		sb.append(",IBFRCN="+String.valueOf(IBFRCN));
		sb.append(",IBFRDT="+String.valueOf(IBFRDT));
		sb.append(",IBVNDR="+String.valueOf(IBVNDR));
		sb.append(",IBSTYL="+IBSTYL);
		sb.append(",IBPOOQ="+String.valueOf(IBPOOQ));
		sb.append(",IBTOOQ="+String.valueOf(IBTOOQ));
		sb.append(",IBINTQ="+String.valueOf(IBINTQ));
		sb.append(",IBMASU="+String.valueOf(IBMASU));
		sb.append(",IBMASD="+String.valueOf(IBMASD));
		sb.append(",IBMASV="+String.valueOf(IBMASV));
		sb.append(",IBMASC="+String.valueOf(IBMASC));
		sb.append(",IBLAVC="+String.valueOf(IBLAVC));
		sb.append(",IBARQT="+String.valueOf(IBARQT));
		sb.append(",IBNSQT="+String.valueOf(IBNSQT));
		sb.append(",IBPHND="+String.valueOf(IBPHND));
		sb.append(",IBHLDQ="+String.valueOf(IBHLDQ));
		sb.append(",IBCRCD="+IBCRCD);
		sb.append(",DATELOADED="+String.valueOf(DATELOADED));
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
        		
        				if(IBHBOY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOY);
            			}
            		
        			sb.append("|");
        		
        				if(IBHBOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOP);
            			}
            		
        			sb.append("|");
        		
        				if(IBHAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHAND);
            			}
            		
        			sb.append("|");
        		
        				if(IBTRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTRNS);
            			}
            		
        			sb.append("|");
        		
        				if(IBGMRI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBGMRI);
            			}
            		
        			sb.append("|");
        		
        				if(IBWKCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWKCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK01);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK02);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK03);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK04);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK05);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK06);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK07);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK08);
            			}
            		
        			sb.append("|");
        		
        				if(IBNORD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNORD);
            			}
            		
        			sb.append("|");
        		
        				if(IBLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASY);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRETS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRETS);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN1);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD1);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN2);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD2);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN3);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD3);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN4);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD4);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN5);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD5);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVGC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVGC);
            			}
            		
        			sb.append("|");
        		
        				if(IBQLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBQLRC);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVOH);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVRT);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVCS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVCS);
            			}
            		
        			sb.append("|");
        		
        				if(IBOSCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOSCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS01);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS02);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS03);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS04);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS05);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS06);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS07);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS08);
            			}
            		
        			sb.append("|");
        		
        				if(IBDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(IBSCLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSCLS);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRCN);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRDT);
            			}
            		
        			sb.append("|");
        		
        				if(IBVNDR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVNDR);
            			}
            		
        			sb.append("|");
        		
        				if(IBSTYL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSTYL);
            			}
            		
        			sb.append("|");
        		
        				if(IBPOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBINTQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBINTQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASU);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASD);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASV);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASC);
            			}
            		
        			sb.append("|");
        		
        				if(IBLAVC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLAVC);
            			}
            		
        			sb.append("|");
        		
        				if(IBARQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBARQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBNSQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNSQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHND);
            			}
            		
        			sb.append("|");
        		
        				if(IBHLDQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHLDQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBCRCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCRCD);
            			}
            		
        			sb.append("|");
        		
        				if(DATELOADED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATELOADED);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(INVBALStruct other) {

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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[0];

	
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

				
			    public BigDecimal IBHBOY;

				public BigDecimal getIBHBOY () {
					return this.IBHBOY;
				}

				public Boolean IBHBOYIsNullable(){
				    return true;
				}
				public Boolean IBHBOYIsKey(){
				    return false;
				}
				public Integer IBHBOYLength(){
				    return null;
				}
				public Integer IBHBOYPrecision(){
				    return null;
				}
				public String IBHBOYDefault(){
				
					return "";
				
				}
				public String IBHBOYComment(){
				
				    return "";
				
				}
				public String IBHBOYPattern(){
				
					return "";
				
				}
				public String IBHBOYOriginalDbColumnName(){
				
					return "IBHBOY";
				
				}

				
			    public BigDecimal IBHBOP;

				public BigDecimal getIBHBOP () {
					return this.IBHBOP;
				}

				public Boolean IBHBOPIsNullable(){
				    return true;
				}
				public Boolean IBHBOPIsKey(){
				    return false;
				}
				public Integer IBHBOPLength(){
				    return null;
				}
				public Integer IBHBOPPrecision(){
				    return null;
				}
				public String IBHBOPDefault(){
				
					return "";
				
				}
				public String IBHBOPComment(){
				
				    return "";
				
				}
				public String IBHBOPPattern(){
				
					return "";
				
				}
				public String IBHBOPOriginalDbColumnName(){
				
					return "IBHBOP";
				
				}

				
			    public BigDecimal IBHAND;

				public BigDecimal getIBHAND () {
					return this.IBHAND;
				}

				public Boolean IBHANDIsNullable(){
				    return true;
				}
				public Boolean IBHANDIsKey(){
				    return false;
				}
				public Integer IBHANDLength(){
				    return null;
				}
				public Integer IBHANDPrecision(){
				    return null;
				}
				public String IBHANDDefault(){
				
					return "";
				
				}
				public String IBHANDComment(){
				
				    return "";
				
				}
				public String IBHANDPattern(){
				
					return "";
				
				}
				public String IBHANDOriginalDbColumnName(){
				
					return "IBHAND";
				
				}

				
			    public BigDecimal IBTRNS;

				public BigDecimal getIBTRNS () {
					return this.IBTRNS;
				}

				public Boolean IBTRNSIsNullable(){
				    return true;
				}
				public Boolean IBTRNSIsKey(){
				    return false;
				}
				public Integer IBTRNSLength(){
				    return null;
				}
				public Integer IBTRNSPrecision(){
				    return null;
				}
				public String IBTRNSDefault(){
				
					return "";
				
				}
				public String IBTRNSComment(){
				
				    return "";
				
				}
				public String IBTRNSPattern(){
				
					return "";
				
				}
				public String IBTRNSOriginalDbColumnName(){
				
					return "IBTRNS";
				
				}

				
			    public BigDecimal IBGMRI;

				public BigDecimal getIBGMRI () {
					return this.IBGMRI;
				}

				public Boolean IBGMRIIsNullable(){
				    return true;
				}
				public Boolean IBGMRIIsKey(){
				    return false;
				}
				public Integer IBGMRILength(){
				    return null;
				}
				public Integer IBGMRIPrecision(){
				    return null;
				}
				public String IBGMRIDefault(){
				
					return "";
				
				}
				public String IBGMRIComment(){
				
				    return "";
				
				}
				public String IBGMRIPattern(){
				
					return "";
				
				}
				public String IBGMRIOriginalDbColumnName(){
				
					return "IBGMRI";
				
				}

				
			    public BigDecimal IBWKCR;

				public BigDecimal getIBWKCR () {
					return this.IBWKCR;
				}

				public Boolean IBWKCRIsNullable(){
				    return true;
				}
				public Boolean IBWKCRIsKey(){
				    return false;
				}
				public Integer IBWKCRLength(){
				    return null;
				}
				public Integer IBWKCRPrecision(){
				    return null;
				}
				public String IBWKCRDefault(){
				
					return "";
				
				}
				public String IBWKCRComment(){
				
				    return "";
				
				}
				public String IBWKCRPattern(){
				
					return "";
				
				}
				public String IBWKCROriginalDbColumnName(){
				
					return "IBWKCR";
				
				}

				
			    public BigDecimal IBWK01;

				public BigDecimal getIBWK01 () {
					return this.IBWK01;
				}

				public Boolean IBWK01IsNullable(){
				    return true;
				}
				public Boolean IBWK01IsKey(){
				    return false;
				}
				public Integer IBWK01Length(){
				    return null;
				}
				public Integer IBWK01Precision(){
				    return null;
				}
				public String IBWK01Default(){
				
					return "";
				
				}
				public String IBWK01Comment(){
				
				    return "";
				
				}
				public String IBWK01Pattern(){
				
					return "";
				
				}
				public String IBWK01OriginalDbColumnName(){
				
					return "IBWK01";
				
				}

				
			    public BigDecimal IBWK02;

				public BigDecimal getIBWK02 () {
					return this.IBWK02;
				}

				public Boolean IBWK02IsNullable(){
				    return true;
				}
				public Boolean IBWK02IsKey(){
				    return false;
				}
				public Integer IBWK02Length(){
				    return null;
				}
				public Integer IBWK02Precision(){
				    return null;
				}
				public String IBWK02Default(){
				
					return "";
				
				}
				public String IBWK02Comment(){
				
				    return "";
				
				}
				public String IBWK02Pattern(){
				
					return "";
				
				}
				public String IBWK02OriginalDbColumnName(){
				
					return "IBWK02";
				
				}

				
			    public BigDecimal IBWK03;

				public BigDecimal getIBWK03 () {
					return this.IBWK03;
				}

				public Boolean IBWK03IsNullable(){
				    return true;
				}
				public Boolean IBWK03IsKey(){
				    return false;
				}
				public Integer IBWK03Length(){
				    return null;
				}
				public Integer IBWK03Precision(){
				    return null;
				}
				public String IBWK03Default(){
				
					return "";
				
				}
				public String IBWK03Comment(){
				
				    return "";
				
				}
				public String IBWK03Pattern(){
				
					return "";
				
				}
				public String IBWK03OriginalDbColumnName(){
				
					return "IBWK03";
				
				}

				
			    public BigDecimal IBWK04;

				public BigDecimal getIBWK04 () {
					return this.IBWK04;
				}

				public Boolean IBWK04IsNullable(){
				    return true;
				}
				public Boolean IBWK04IsKey(){
				    return false;
				}
				public Integer IBWK04Length(){
				    return null;
				}
				public Integer IBWK04Precision(){
				    return null;
				}
				public String IBWK04Default(){
				
					return "";
				
				}
				public String IBWK04Comment(){
				
				    return "";
				
				}
				public String IBWK04Pattern(){
				
					return "";
				
				}
				public String IBWK04OriginalDbColumnName(){
				
					return "IBWK04";
				
				}

				
			    public BigDecimal IBWK05;

				public BigDecimal getIBWK05 () {
					return this.IBWK05;
				}

				public Boolean IBWK05IsNullable(){
				    return true;
				}
				public Boolean IBWK05IsKey(){
				    return false;
				}
				public Integer IBWK05Length(){
				    return null;
				}
				public Integer IBWK05Precision(){
				    return null;
				}
				public String IBWK05Default(){
				
					return "";
				
				}
				public String IBWK05Comment(){
				
				    return "";
				
				}
				public String IBWK05Pattern(){
				
					return "";
				
				}
				public String IBWK05OriginalDbColumnName(){
				
					return "IBWK05";
				
				}

				
			    public BigDecimal IBWK06;

				public BigDecimal getIBWK06 () {
					return this.IBWK06;
				}

				public Boolean IBWK06IsNullable(){
				    return true;
				}
				public Boolean IBWK06IsKey(){
				    return false;
				}
				public Integer IBWK06Length(){
				    return null;
				}
				public Integer IBWK06Precision(){
				    return null;
				}
				public String IBWK06Default(){
				
					return "";
				
				}
				public String IBWK06Comment(){
				
				    return "";
				
				}
				public String IBWK06Pattern(){
				
					return "";
				
				}
				public String IBWK06OriginalDbColumnName(){
				
					return "IBWK06";
				
				}

				
			    public BigDecimal IBWK07;

				public BigDecimal getIBWK07 () {
					return this.IBWK07;
				}

				public Boolean IBWK07IsNullable(){
				    return true;
				}
				public Boolean IBWK07IsKey(){
				    return false;
				}
				public Integer IBWK07Length(){
				    return null;
				}
				public Integer IBWK07Precision(){
				    return null;
				}
				public String IBWK07Default(){
				
					return "";
				
				}
				public String IBWK07Comment(){
				
				    return "";
				
				}
				public String IBWK07Pattern(){
				
					return "";
				
				}
				public String IBWK07OriginalDbColumnName(){
				
					return "IBWK07";
				
				}

				
			    public BigDecimal IBWK08;

				public BigDecimal getIBWK08 () {
					return this.IBWK08;
				}

				public Boolean IBWK08IsNullable(){
				    return true;
				}
				public Boolean IBWK08IsKey(){
				    return false;
				}
				public Integer IBWK08Length(){
				    return null;
				}
				public Integer IBWK08Precision(){
				    return null;
				}
				public String IBWK08Default(){
				
					return "";
				
				}
				public String IBWK08Comment(){
				
				    return "";
				
				}
				public String IBWK08Pattern(){
				
					return "";
				
				}
				public String IBWK08OriginalDbColumnName(){
				
					return "IBWK08";
				
				}

				
			    public BigDecimal IBNORD;

				public BigDecimal getIBNORD () {
					return this.IBNORD;
				}

				public Boolean IBNORDIsNullable(){
				    return true;
				}
				public Boolean IBNORDIsKey(){
				    return false;
				}
				public Integer IBNORDLength(){
				    return null;
				}
				public Integer IBNORDPrecision(){
				    return null;
				}
				public String IBNORDDefault(){
				
					return "";
				
				}
				public String IBNORDComment(){
				
				    return "";
				
				}
				public String IBNORDPattern(){
				
					return "";
				
				}
				public String IBNORDOriginalDbColumnName(){
				
					return "IBNORD";
				
				}

				
			    public BigDecimal IBLEAD;

				public BigDecimal getIBLEAD () {
					return this.IBLEAD;
				}

				public Boolean IBLEADIsNullable(){
				    return true;
				}
				public Boolean IBLEADIsKey(){
				    return false;
				}
				public Integer IBLEADLength(){
				    return null;
				}
				public Integer IBLEADPrecision(){
				    return null;
				}
				public String IBLEADDefault(){
				
					return "";
				
				}
				public String IBLEADComment(){
				
				    return "";
				
				}
				public String IBLEADPattern(){
				
					return "";
				
				}
				public String IBLEADOriginalDbColumnName(){
				
					return "IBLEAD";
				
				}

				
			    public BigDecimal IBRSUP;

				public BigDecimal getIBRSUP () {
					return this.IBRSUP;
				}

				public Boolean IBRSUPIsNullable(){
				    return true;
				}
				public Boolean IBRSUPIsKey(){
				    return false;
				}
				public Integer IBRSUPLength(){
				    return null;
				}
				public Integer IBRSUPPrecision(){
				    return null;
				}
				public String IBRSUPDefault(){
				
					return "";
				
				}
				public String IBRSUPComment(){
				
				    return "";
				
				}
				public String IBRSUPPattern(){
				
					return "";
				
				}
				public String IBRSUPOriginalDbColumnName(){
				
					return "IBRSUP";
				
				}

				
			    public BigDecimal IBRSUY;

				public BigDecimal getIBRSUY () {
					return this.IBRSUY;
				}

				public Boolean IBRSUYIsNullable(){
				    return true;
				}
				public Boolean IBRSUYIsKey(){
				    return false;
				}
				public Integer IBRSUYLength(){
				    return null;
				}
				public Integer IBRSUYPrecision(){
				    return null;
				}
				public String IBRSUYDefault(){
				
					return "";
				
				}
				public String IBRSUYComment(){
				
				    return "";
				
				}
				public String IBRSUYPattern(){
				
					return "";
				
				}
				public String IBRSUYOriginalDbColumnName(){
				
					return "IBRSUY";
				
				}

				
			    public BigDecimal IBRSDP;

				public BigDecimal getIBRSDP () {
					return this.IBRSDP;
				}

				public Boolean IBRSDPIsNullable(){
				    return true;
				}
				public Boolean IBRSDPIsKey(){
				    return false;
				}
				public Integer IBRSDPLength(){
				    return null;
				}
				public Integer IBRSDPPrecision(){
				    return null;
				}
				public String IBRSDPDefault(){
				
					return "";
				
				}
				public String IBRSDPComment(){
				
				    return "";
				
				}
				public String IBRSDPPattern(){
				
					return "";
				
				}
				public String IBRSDPOriginalDbColumnName(){
				
					return "IBRSDP";
				
				}

				
			    public BigDecimal IBRSDY;

				public BigDecimal getIBRSDY () {
					return this.IBRSDY;
				}

				public Boolean IBRSDYIsNullable(){
				    return true;
				}
				public Boolean IBRSDYIsKey(){
				    return false;
				}
				public Integer IBRSDYLength(){
				    return null;
				}
				public Integer IBRSDYPrecision(){
				    return null;
				}
				public String IBRSDYDefault(){
				
					return "";
				
				}
				public String IBRSDYComment(){
				
				    return "";
				
				}
				public String IBRSDYPattern(){
				
					return "";
				
				}
				public String IBRSDYOriginalDbColumnName(){
				
					return "IBRSDY";
				
				}

				
			    public BigDecimal IBVRSP;

				public BigDecimal getIBVRSP () {
					return this.IBVRSP;
				}

				public Boolean IBVRSPIsNullable(){
				    return true;
				}
				public Boolean IBVRSPIsKey(){
				    return false;
				}
				public Integer IBVRSPLength(){
				    return null;
				}
				public Integer IBVRSPPrecision(){
				    return null;
				}
				public String IBVRSPDefault(){
				
					return "";
				
				}
				public String IBVRSPComment(){
				
				    return "";
				
				}
				public String IBVRSPPattern(){
				
					return "";
				
				}
				public String IBVRSPOriginalDbColumnName(){
				
					return "IBVRSP";
				
				}

				
			    public BigDecimal IBVRSY;

				public BigDecimal getIBVRSY () {
					return this.IBVRSY;
				}

				public Boolean IBVRSYIsNullable(){
				    return true;
				}
				public Boolean IBVRSYIsKey(){
				    return false;
				}
				public Integer IBVRSYLength(){
				    return null;
				}
				public Integer IBVRSYPrecision(){
				    return null;
				}
				public String IBVRSYDefault(){
				
					return "";
				
				}
				public String IBVRSYComment(){
				
				    return "";
				
				}
				public String IBVRSYPattern(){
				
					return "";
				
				}
				public String IBVRSYOriginalDbColumnName(){
				
					return "IBVRSY";
				
				}

				
			    public BigDecimal IBRCSP;

				public BigDecimal getIBRCSP () {
					return this.IBRCSP;
				}

				public Boolean IBRCSPIsNullable(){
				    return true;
				}
				public Boolean IBRCSPIsKey(){
				    return false;
				}
				public Integer IBRCSPLength(){
				    return null;
				}
				public Integer IBRCSPPrecision(){
				    return null;
				}
				public String IBRCSPDefault(){
				
					return "";
				
				}
				public String IBRCSPComment(){
				
				    return "";
				
				}
				public String IBRCSPPattern(){
				
					return "";
				
				}
				public String IBRCSPOriginalDbColumnName(){
				
					return "IBRCSP";
				
				}

				
			    public BigDecimal IBRCSY;

				public BigDecimal getIBRCSY () {
					return this.IBRCSY;
				}

				public Boolean IBRCSYIsNullable(){
				    return true;
				}
				public Boolean IBRCSYIsKey(){
				    return false;
				}
				public Integer IBRCSYLength(){
				    return null;
				}
				public Integer IBRCSYPrecision(){
				    return null;
				}
				public String IBRCSYDefault(){
				
					return "";
				
				}
				public String IBRCSYComment(){
				
				    return "";
				
				}
				public String IBRCSYPattern(){
				
					return "";
				
				}
				public String IBRCSYOriginalDbColumnName(){
				
					return "IBRCSY";
				
				}

				
			    public BigDecimal IBASUP;

				public BigDecimal getIBASUP () {
					return this.IBASUP;
				}

				public Boolean IBASUPIsNullable(){
				    return true;
				}
				public Boolean IBASUPIsKey(){
				    return false;
				}
				public Integer IBASUPLength(){
				    return null;
				}
				public Integer IBASUPPrecision(){
				    return null;
				}
				public String IBASUPDefault(){
				
					return "";
				
				}
				public String IBASUPComment(){
				
				    return "";
				
				}
				public String IBASUPPattern(){
				
					return "";
				
				}
				public String IBASUPOriginalDbColumnName(){
				
					return "IBASUP";
				
				}

				
			    public BigDecimal IBASUY;

				public BigDecimal getIBASUY () {
					return this.IBASUY;
				}

				public Boolean IBASUYIsNullable(){
				    return true;
				}
				public Boolean IBASUYIsKey(){
				    return false;
				}
				public Integer IBASUYLength(){
				    return null;
				}
				public Integer IBASUYPrecision(){
				    return null;
				}
				public String IBASUYDefault(){
				
					return "";
				
				}
				public String IBASUYComment(){
				
				    return "";
				
				}
				public String IBASUYPattern(){
				
					return "";
				
				}
				public String IBASUYOriginalDbColumnName(){
				
					return "IBASUY";
				
				}

				
			    public BigDecimal IBASDP;

				public BigDecimal getIBASDP () {
					return this.IBASDP;
				}

				public Boolean IBASDPIsNullable(){
				    return true;
				}
				public Boolean IBASDPIsKey(){
				    return false;
				}
				public Integer IBASDPLength(){
				    return null;
				}
				public Integer IBASDPPrecision(){
				    return null;
				}
				public String IBASDPDefault(){
				
					return "";
				
				}
				public String IBASDPComment(){
				
				    return "";
				
				}
				public String IBASDPPattern(){
				
					return "";
				
				}
				public String IBASDPOriginalDbColumnName(){
				
					return "IBASDP";
				
				}

				
			    public BigDecimal IBASDY;

				public BigDecimal getIBASDY () {
					return this.IBASDY;
				}

				public Boolean IBASDYIsNullable(){
				    return true;
				}
				public Boolean IBASDYIsKey(){
				    return false;
				}
				public Integer IBASDYLength(){
				    return null;
				}
				public Integer IBASDYPrecision(){
				    return null;
				}
				public String IBASDYDefault(){
				
					return "";
				
				}
				public String IBASDYComment(){
				
				    return "";
				
				}
				public String IBASDYPattern(){
				
					return "";
				
				}
				public String IBASDYOriginalDbColumnName(){
				
					return "IBASDY";
				
				}

				
			    public BigDecimal IBVASP;

				public BigDecimal getIBVASP () {
					return this.IBVASP;
				}

				public Boolean IBVASPIsNullable(){
				    return true;
				}
				public Boolean IBVASPIsKey(){
				    return false;
				}
				public Integer IBVASPLength(){
				    return null;
				}
				public Integer IBVASPPrecision(){
				    return null;
				}
				public String IBVASPDefault(){
				
					return "";
				
				}
				public String IBVASPComment(){
				
				    return "";
				
				}
				public String IBVASPPattern(){
				
					return "";
				
				}
				public String IBVASPOriginalDbColumnName(){
				
					return "IBVASP";
				
				}

				
			    public BigDecimal IBVASY;

				public BigDecimal getIBVASY () {
					return this.IBVASY;
				}

				public Boolean IBVASYIsNullable(){
				    return true;
				}
				public Boolean IBVASYIsKey(){
				    return false;
				}
				public Integer IBVASYLength(){
				    return null;
				}
				public Integer IBVASYPrecision(){
				    return null;
				}
				public String IBVASYDefault(){
				
					return "";
				
				}
				public String IBVASYComment(){
				
				    return "";
				
				}
				public String IBVASYPattern(){
				
					return "";
				
				}
				public String IBVASYOriginalDbColumnName(){
				
					return "IBVASY";
				
				}

				
			    public BigDecimal IBACSP;

				public BigDecimal getIBACSP () {
					return this.IBACSP;
				}

				public Boolean IBACSPIsNullable(){
				    return true;
				}
				public Boolean IBACSPIsKey(){
				    return false;
				}
				public Integer IBACSPLength(){
				    return null;
				}
				public Integer IBACSPPrecision(){
				    return null;
				}
				public String IBACSPDefault(){
				
					return "";
				
				}
				public String IBACSPComment(){
				
				    return "";
				
				}
				public String IBACSPPattern(){
				
					return "";
				
				}
				public String IBACSPOriginalDbColumnName(){
				
					return "IBACSP";
				
				}

				
			    public BigDecimal IBACSY;

				public BigDecimal getIBACSY () {
					return this.IBACSY;
				}

				public Boolean IBACSYIsNullable(){
				    return true;
				}
				public Boolean IBACSYIsKey(){
				    return false;
				}
				public Integer IBACSYLength(){
				    return null;
				}
				public Integer IBACSYPrecision(){
				    return null;
				}
				public String IBACSYDefault(){
				
					return "";
				
				}
				public String IBACSYComment(){
				
				    return "";
				
				}
				public String IBACSYPattern(){
				
					return "";
				
				}
				public String IBACSYOriginalDbColumnName(){
				
					return "IBACSY";
				
				}

				
			    public BigDecimal IBRETS;

				public BigDecimal getIBRETS () {
					return this.IBRETS;
				}

				public Boolean IBRETSIsNullable(){
				    return true;
				}
				public Boolean IBRETSIsKey(){
				    return false;
				}
				public Integer IBRETSLength(){
				    return null;
				}
				public Integer IBRETSPrecision(){
				    return null;
				}
				public String IBRETSDefault(){
				
					return "";
				
				}
				public String IBRETSComment(){
				
				    return "";
				
				}
				public String IBRETSPattern(){
				
					return "";
				
				}
				public String IBRETSOriginalDbColumnName(){
				
					return "IBRETS";
				
				}

				
			    public BigDecimal IBRCUP;

				public BigDecimal getIBRCUP () {
					return this.IBRCUP;
				}

				public Boolean IBRCUPIsNullable(){
				    return true;
				}
				public Boolean IBRCUPIsKey(){
				    return false;
				}
				public Integer IBRCUPLength(){
				    return null;
				}
				public Integer IBRCUPPrecision(){
				    return null;
				}
				public String IBRCUPDefault(){
				
					return "";
				
				}
				public String IBRCUPComment(){
				
				    return "";
				
				}
				public String IBRCUPPattern(){
				
					return "";
				
				}
				public String IBRCUPOriginalDbColumnName(){
				
					return "IBRCUP";
				
				}

				
			    public BigDecimal IBRCUY;

				public BigDecimal getIBRCUY () {
					return this.IBRCUY;
				}

				public Boolean IBRCUYIsNullable(){
				    return true;
				}
				public Boolean IBRCUYIsKey(){
				    return false;
				}
				public Integer IBRCUYLength(){
				    return null;
				}
				public Integer IBRCUYPrecision(){
				    return null;
				}
				public String IBRCUYDefault(){
				
					return "";
				
				}
				public String IBRCUYComment(){
				
				    return "";
				
				}
				public String IBRCUYPattern(){
				
					return "";
				
				}
				public String IBRCUYOriginalDbColumnName(){
				
					return "IBRCUY";
				
				}

				
			    public BigDecimal IBRCDP;

				public BigDecimal getIBRCDP () {
					return this.IBRCDP;
				}

				public Boolean IBRCDPIsNullable(){
				    return true;
				}
				public Boolean IBRCDPIsKey(){
				    return false;
				}
				public Integer IBRCDPLength(){
				    return null;
				}
				public Integer IBRCDPPrecision(){
				    return null;
				}
				public String IBRCDPDefault(){
				
					return "";
				
				}
				public String IBRCDPComment(){
				
				    return "";
				
				}
				public String IBRCDPPattern(){
				
					return "";
				
				}
				public String IBRCDPOriginalDbColumnName(){
				
					return "IBRCDP";
				
				}

				
			    public BigDecimal IBRCDY;

				public BigDecimal getIBRCDY () {
					return this.IBRCDY;
				}

				public Boolean IBRCDYIsNullable(){
				    return true;
				}
				public Boolean IBRCDYIsKey(){
				    return false;
				}
				public Integer IBRCDYLength(){
				    return null;
				}
				public Integer IBRCDYPrecision(){
				    return null;
				}
				public String IBRCDYDefault(){
				
					return "";
				
				}
				public String IBRCDYComment(){
				
				    return "";
				
				}
				public String IBRCDYPattern(){
				
					return "";
				
				}
				public String IBRCDYOriginalDbColumnName(){
				
					return "IBRCDY";
				
				}

				
			    public BigDecimal IBTIUP;

				public BigDecimal getIBTIUP () {
					return this.IBTIUP;
				}

				public Boolean IBTIUPIsNullable(){
				    return true;
				}
				public Boolean IBTIUPIsKey(){
				    return false;
				}
				public Integer IBTIUPLength(){
				    return null;
				}
				public Integer IBTIUPPrecision(){
				    return null;
				}
				public String IBTIUPDefault(){
				
					return "";
				
				}
				public String IBTIUPComment(){
				
				    return "";
				
				}
				public String IBTIUPPattern(){
				
					return "";
				
				}
				public String IBTIUPOriginalDbColumnName(){
				
					return "IBTIUP";
				
				}

				
			    public BigDecimal IBTIUY;

				public BigDecimal getIBTIUY () {
					return this.IBTIUY;
				}

				public Boolean IBTIUYIsNullable(){
				    return true;
				}
				public Boolean IBTIUYIsKey(){
				    return false;
				}
				public Integer IBTIUYLength(){
				    return null;
				}
				public Integer IBTIUYPrecision(){
				    return null;
				}
				public String IBTIUYDefault(){
				
					return "";
				
				}
				public String IBTIUYComment(){
				
				    return "";
				
				}
				public String IBTIUYPattern(){
				
					return "";
				
				}
				public String IBTIUYOriginalDbColumnName(){
				
					return "IBTIUY";
				
				}

				
			    public BigDecimal IBTOUP;

				public BigDecimal getIBTOUP () {
					return this.IBTOUP;
				}

				public Boolean IBTOUPIsNullable(){
				    return true;
				}
				public Boolean IBTOUPIsKey(){
				    return false;
				}
				public Integer IBTOUPLength(){
				    return null;
				}
				public Integer IBTOUPPrecision(){
				    return null;
				}
				public String IBTOUPDefault(){
				
					return "";
				
				}
				public String IBTOUPComment(){
				
				    return "";
				
				}
				public String IBTOUPPattern(){
				
					return "";
				
				}
				public String IBTOUPOriginalDbColumnName(){
				
					return "IBTOUP";
				
				}

				
			    public BigDecimal IBTOUY;

				public BigDecimal getIBTOUY () {
					return this.IBTOUY;
				}

				public Boolean IBTOUYIsNullable(){
				    return true;
				}
				public Boolean IBTOUYIsKey(){
				    return false;
				}
				public Integer IBTOUYLength(){
				    return null;
				}
				public Integer IBTOUYPrecision(){
				    return null;
				}
				public String IBTOUYDefault(){
				
					return "";
				
				}
				public String IBTOUYComment(){
				
				    return "";
				
				}
				public String IBTOUYPattern(){
				
					return "";
				
				}
				public String IBTOUYOriginalDbColumnName(){
				
					return "IBTOUY";
				
				}

				
			    public BigDecimal IBTFDP;

				public BigDecimal getIBTFDP () {
					return this.IBTFDP;
				}

				public Boolean IBTFDPIsNullable(){
				    return true;
				}
				public Boolean IBTFDPIsKey(){
				    return false;
				}
				public Integer IBTFDPLength(){
				    return null;
				}
				public Integer IBTFDPPrecision(){
				    return null;
				}
				public String IBTFDPDefault(){
				
					return "";
				
				}
				public String IBTFDPComment(){
				
				    return "";
				
				}
				public String IBTFDPPattern(){
				
					return "";
				
				}
				public String IBTFDPOriginalDbColumnName(){
				
					return "IBTFDP";
				
				}

				
			    public BigDecimal IBTFDY;

				public BigDecimal getIBTFDY () {
					return this.IBTFDY;
				}

				public Boolean IBTFDYIsNullable(){
				    return true;
				}
				public Boolean IBTFDYIsKey(){
				    return false;
				}
				public Integer IBTFDYLength(){
				    return null;
				}
				public Integer IBTFDYPrecision(){
				    return null;
				}
				public String IBTFDYDefault(){
				
					return "";
				
				}
				public String IBTFDYComment(){
				
				    return "";
				
				}
				public String IBTFDYPattern(){
				
					return "";
				
				}
				public String IBTFDYOriginalDbColumnName(){
				
					return "IBTFDY";
				
				}

				
			    public BigDecimal IBRVUP;

				public BigDecimal getIBRVUP () {
					return this.IBRVUP;
				}

				public Boolean IBRVUPIsNullable(){
				    return true;
				}
				public Boolean IBRVUPIsKey(){
				    return false;
				}
				public Integer IBRVUPLength(){
				    return null;
				}
				public Integer IBRVUPPrecision(){
				    return null;
				}
				public String IBRVUPDefault(){
				
					return "";
				
				}
				public String IBRVUPComment(){
				
				    return "";
				
				}
				public String IBRVUPPattern(){
				
					return "";
				
				}
				public String IBRVUPOriginalDbColumnName(){
				
					return "IBRVUP";
				
				}

				
			    public BigDecimal IBRVUY;

				public BigDecimal getIBRVUY () {
					return this.IBRVUY;
				}

				public Boolean IBRVUYIsNullable(){
				    return true;
				}
				public Boolean IBRVUYIsKey(){
				    return false;
				}
				public Integer IBRVUYLength(){
				    return null;
				}
				public Integer IBRVUYPrecision(){
				    return null;
				}
				public String IBRVUYDefault(){
				
					return "";
				
				}
				public String IBRVUYComment(){
				
				    return "";
				
				}
				public String IBRVUYPattern(){
				
					return "";
				
				}
				public String IBRVUYOriginalDbColumnName(){
				
					return "IBRVUY";
				
				}

				
			    public BigDecimal IBRVDP;

				public BigDecimal getIBRVDP () {
					return this.IBRVDP;
				}

				public Boolean IBRVDPIsNullable(){
				    return true;
				}
				public Boolean IBRVDPIsKey(){
				    return false;
				}
				public Integer IBRVDPLength(){
				    return null;
				}
				public Integer IBRVDPPrecision(){
				    return null;
				}
				public String IBRVDPDefault(){
				
					return "";
				
				}
				public String IBRVDPComment(){
				
				    return "";
				
				}
				public String IBRVDPPattern(){
				
					return "";
				
				}
				public String IBRVDPOriginalDbColumnName(){
				
					return "IBRVDP";
				
				}

				
			    public BigDecimal IBRVDY;

				public BigDecimal getIBRVDY () {
					return this.IBRVDY;
				}

				public Boolean IBRVDYIsNullable(){
				    return true;
				}
				public Boolean IBRVDYIsKey(){
				    return false;
				}
				public Integer IBRVDYLength(){
				    return null;
				}
				public Integer IBRVDYPrecision(){
				    return null;
				}
				public String IBRVDYDefault(){
				
					return "";
				
				}
				public String IBRVDYComment(){
				
				    return "";
				
				}
				public String IBRVDYPattern(){
				
					return "";
				
				}
				public String IBRVDYOriginalDbColumnName(){
				
					return "IBRVDY";
				
				}

				
			    public BigDecimal IBAJUP;

				public BigDecimal getIBAJUP () {
					return this.IBAJUP;
				}

				public Boolean IBAJUPIsNullable(){
				    return true;
				}
				public Boolean IBAJUPIsKey(){
				    return false;
				}
				public Integer IBAJUPLength(){
				    return null;
				}
				public Integer IBAJUPPrecision(){
				    return null;
				}
				public String IBAJUPDefault(){
				
					return "";
				
				}
				public String IBAJUPComment(){
				
				    return "";
				
				}
				public String IBAJUPPattern(){
				
					return "";
				
				}
				public String IBAJUPOriginalDbColumnName(){
				
					return "IBAJUP";
				
				}

				
			    public BigDecimal IBAJUY;

				public BigDecimal getIBAJUY () {
					return this.IBAJUY;
				}

				public Boolean IBAJUYIsNullable(){
				    return true;
				}
				public Boolean IBAJUYIsKey(){
				    return false;
				}
				public Integer IBAJUYLength(){
				    return null;
				}
				public Integer IBAJUYPrecision(){
				    return null;
				}
				public String IBAJUYDefault(){
				
					return "";
				
				}
				public String IBAJUYComment(){
				
				    return "";
				
				}
				public String IBAJUYPattern(){
				
					return "";
				
				}
				public String IBAJUYOriginalDbColumnName(){
				
					return "IBAJUY";
				
				}

				
			    public BigDecimal IBAJDP;

				public BigDecimal getIBAJDP () {
					return this.IBAJDP;
				}

				public Boolean IBAJDPIsNullable(){
				    return true;
				}
				public Boolean IBAJDPIsKey(){
				    return false;
				}
				public Integer IBAJDPLength(){
				    return null;
				}
				public Integer IBAJDPPrecision(){
				    return null;
				}
				public String IBAJDPDefault(){
				
					return "";
				
				}
				public String IBAJDPComment(){
				
				    return "";
				
				}
				public String IBAJDPPattern(){
				
					return "";
				
				}
				public String IBAJDPOriginalDbColumnName(){
				
					return "IBAJDP";
				
				}

				
			    public BigDecimal IBAJDY;

				public BigDecimal getIBAJDY () {
					return this.IBAJDY;
				}

				public Boolean IBAJDYIsNullable(){
				    return true;
				}
				public Boolean IBAJDYIsKey(){
				    return false;
				}
				public Integer IBAJDYLength(){
				    return null;
				}
				public Integer IBAJDYPrecision(){
				    return null;
				}
				public String IBAJDYDefault(){
				
					return "";
				
				}
				public String IBAJDYComment(){
				
				    return "";
				
				}
				public String IBAJDYPattern(){
				
					return "";
				
				}
				public String IBAJDYOriginalDbColumnName(){
				
					return "IBAJDY";
				
				}

				
			    public BigDecimal IBPHUP;

				public BigDecimal getIBPHUP () {
					return this.IBPHUP;
				}

				public Boolean IBPHUPIsNullable(){
				    return true;
				}
				public Boolean IBPHUPIsKey(){
				    return false;
				}
				public Integer IBPHUPLength(){
				    return null;
				}
				public Integer IBPHUPPrecision(){
				    return null;
				}
				public String IBPHUPDefault(){
				
					return "";
				
				}
				public String IBPHUPComment(){
				
				    return "";
				
				}
				public String IBPHUPPattern(){
				
					return "";
				
				}
				public String IBPHUPOriginalDbColumnName(){
				
					return "IBPHUP";
				
				}

				
			    public BigDecimal IBPHUY;

				public BigDecimal getIBPHUY () {
					return this.IBPHUY;
				}

				public Boolean IBPHUYIsNullable(){
				    return true;
				}
				public Boolean IBPHUYIsKey(){
				    return false;
				}
				public Integer IBPHUYLength(){
				    return null;
				}
				public Integer IBPHUYPrecision(){
				    return null;
				}
				public String IBPHUYDefault(){
				
					return "";
				
				}
				public String IBPHUYComment(){
				
				    return "";
				
				}
				public String IBPHUYPattern(){
				
					return "";
				
				}
				public String IBPHUYOriginalDbColumnName(){
				
					return "IBPHUY";
				
				}

				
			    public BigDecimal IBPHDP;

				public BigDecimal getIBPHDP () {
					return this.IBPHDP;
				}

				public Boolean IBPHDPIsNullable(){
				    return true;
				}
				public Boolean IBPHDPIsKey(){
				    return false;
				}
				public Integer IBPHDPLength(){
				    return null;
				}
				public Integer IBPHDPPrecision(){
				    return null;
				}
				public String IBPHDPDefault(){
				
					return "";
				
				}
				public String IBPHDPComment(){
				
				    return "";
				
				}
				public String IBPHDPPattern(){
				
					return "";
				
				}
				public String IBPHDPOriginalDbColumnName(){
				
					return "IBPHDP";
				
				}

				
			    public BigDecimal IBPHDY;

				public BigDecimal getIBPHDY () {
					return this.IBPHDY;
				}

				public Boolean IBPHDYIsNullable(){
				    return true;
				}
				public Boolean IBPHDYIsKey(){
				    return false;
				}
				public Integer IBPHDYLength(){
				    return null;
				}
				public Integer IBPHDYPrecision(){
				    return null;
				}
				public String IBPHDYDefault(){
				
					return "";
				
				}
				public String IBPHDYComment(){
				
				    return "";
				
				}
				public String IBPHDYPattern(){
				
					return "";
				
				}
				public String IBPHDYOriginalDbColumnName(){
				
					return "IBPHDY";
				
				}

				
			    public BigDecimal IBCEN1;

				public BigDecimal getIBCEN1 () {
					return this.IBCEN1;
				}

				public Boolean IBCEN1IsNullable(){
				    return true;
				}
				public Boolean IBCEN1IsKey(){
				    return false;
				}
				public Integer IBCEN1Length(){
				    return null;
				}
				public Integer IBCEN1Precision(){
				    return null;
				}
				public String IBCEN1Default(){
				
					return "";
				
				}
				public String IBCEN1Comment(){
				
				    return "";
				
				}
				public String IBCEN1Pattern(){
				
					return "";
				
				}
				public String IBCEN1OriginalDbColumnName(){
				
					return "IBCEN1";
				
				}

				
			    public BigDecimal IBALD1;

				public BigDecimal getIBALD1 () {
					return this.IBALD1;
				}

				public Boolean IBALD1IsNullable(){
				    return true;
				}
				public Boolean IBALD1IsKey(){
				    return false;
				}
				public Integer IBALD1Length(){
				    return null;
				}
				public Integer IBALD1Precision(){
				    return null;
				}
				public String IBALD1Default(){
				
					return "";
				
				}
				public String IBALD1Comment(){
				
				    return "";
				
				}
				public String IBALD1Pattern(){
				
					return "";
				
				}
				public String IBALD1OriginalDbColumnName(){
				
					return "IBALD1";
				
				}

				
			    public BigDecimal IBCEN2;

				public BigDecimal getIBCEN2 () {
					return this.IBCEN2;
				}

				public Boolean IBCEN2IsNullable(){
				    return true;
				}
				public Boolean IBCEN2IsKey(){
				    return false;
				}
				public Integer IBCEN2Length(){
				    return null;
				}
				public Integer IBCEN2Precision(){
				    return null;
				}
				public String IBCEN2Default(){
				
					return "";
				
				}
				public String IBCEN2Comment(){
				
				    return "";
				
				}
				public String IBCEN2Pattern(){
				
					return "";
				
				}
				public String IBCEN2OriginalDbColumnName(){
				
					return "IBCEN2";
				
				}

				
			    public BigDecimal IBALD2;

				public BigDecimal getIBALD2 () {
					return this.IBALD2;
				}

				public Boolean IBALD2IsNullable(){
				    return true;
				}
				public Boolean IBALD2IsKey(){
				    return false;
				}
				public Integer IBALD2Length(){
				    return null;
				}
				public Integer IBALD2Precision(){
				    return null;
				}
				public String IBALD2Default(){
				
					return "";
				
				}
				public String IBALD2Comment(){
				
				    return "";
				
				}
				public String IBALD2Pattern(){
				
					return "";
				
				}
				public String IBALD2OriginalDbColumnName(){
				
					return "IBALD2";
				
				}

				
			    public BigDecimal IBCEN3;

				public BigDecimal getIBCEN3 () {
					return this.IBCEN3;
				}

				public Boolean IBCEN3IsNullable(){
				    return true;
				}
				public Boolean IBCEN3IsKey(){
				    return false;
				}
				public Integer IBCEN3Length(){
				    return null;
				}
				public Integer IBCEN3Precision(){
				    return null;
				}
				public String IBCEN3Default(){
				
					return "";
				
				}
				public String IBCEN3Comment(){
				
				    return "";
				
				}
				public String IBCEN3Pattern(){
				
					return "";
				
				}
				public String IBCEN3OriginalDbColumnName(){
				
					return "IBCEN3";
				
				}

				
			    public BigDecimal IBALD3;

				public BigDecimal getIBALD3 () {
					return this.IBALD3;
				}

				public Boolean IBALD3IsNullable(){
				    return true;
				}
				public Boolean IBALD3IsKey(){
				    return false;
				}
				public Integer IBALD3Length(){
				    return null;
				}
				public Integer IBALD3Precision(){
				    return null;
				}
				public String IBALD3Default(){
				
					return "";
				
				}
				public String IBALD3Comment(){
				
				    return "";
				
				}
				public String IBALD3Pattern(){
				
					return "";
				
				}
				public String IBALD3OriginalDbColumnName(){
				
					return "IBALD3";
				
				}

				
			    public BigDecimal IBCEN4;

				public BigDecimal getIBCEN4 () {
					return this.IBCEN4;
				}

				public Boolean IBCEN4IsNullable(){
				    return true;
				}
				public Boolean IBCEN4IsKey(){
				    return false;
				}
				public Integer IBCEN4Length(){
				    return null;
				}
				public Integer IBCEN4Precision(){
				    return null;
				}
				public String IBCEN4Default(){
				
					return "";
				
				}
				public String IBCEN4Comment(){
				
				    return "";
				
				}
				public String IBCEN4Pattern(){
				
					return "";
				
				}
				public String IBCEN4OriginalDbColumnName(){
				
					return "IBCEN4";
				
				}

				
			    public BigDecimal IBALD4;

				public BigDecimal getIBALD4 () {
					return this.IBALD4;
				}

				public Boolean IBALD4IsNullable(){
				    return true;
				}
				public Boolean IBALD4IsKey(){
				    return false;
				}
				public Integer IBALD4Length(){
				    return null;
				}
				public Integer IBALD4Precision(){
				    return null;
				}
				public String IBALD4Default(){
				
					return "";
				
				}
				public String IBALD4Comment(){
				
				    return "";
				
				}
				public String IBALD4Pattern(){
				
					return "";
				
				}
				public String IBALD4OriginalDbColumnName(){
				
					return "IBALD4";
				
				}

				
			    public BigDecimal IBCEN5;

				public BigDecimal getIBCEN5 () {
					return this.IBCEN5;
				}

				public Boolean IBCEN5IsNullable(){
				    return true;
				}
				public Boolean IBCEN5IsKey(){
				    return false;
				}
				public Integer IBCEN5Length(){
				    return null;
				}
				public Integer IBCEN5Precision(){
				    return null;
				}
				public String IBCEN5Default(){
				
					return "";
				
				}
				public String IBCEN5Comment(){
				
				    return "";
				
				}
				public String IBCEN5Pattern(){
				
					return "";
				
				}
				public String IBCEN5OriginalDbColumnName(){
				
					return "IBCEN5";
				
				}

				
			    public BigDecimal IBALD5;

				public BigDecimal getIBALD5 () {
					return this.IBALD5;
				}

				public Boolean IBALD5IsNullable(){
				    return true;
				}
				public Boolean IBALD5IsKey(){
				    return false;
				}
				public Integer IBALD5Length(){
				    return null;
				}
				public Integer IBALD5Precision(){
				    return null;
				}
				public String IBALD5Default(){
				
					return "";
				
				}
				public String IBALD5Comment(){
				
				    return "";
				
				}
				public String IBALD5Pattern(){
				
					return "";
				
				}
				public String IBALD5OriginalDbColumnName(){
				
					return "IBALD5";
				
				}

				
			    public BigDecimal IBAVGC;

				public BigDecimal getIBAVGC () {
					return this.IBAVGC;
				}

				public Boolean IBAVGCIsNullable(){
				    return true;
				}
				public Boolean IBAVGCIsKey(){
				    return false;
				}
				public Integer IBAVGCLength(){
				    return null;
				}
				public Integer IBAVGCPrecision(){
				    return null;
				}
				public String IBAVGCDefault(){
				
					return "";
				
				}
				public String IBAVGCComment(){
				
				    return "";
				
				}
				public String IBAVGCPattern(){
				
					return "";
				
				}
				public String IBAVGCOriginalDbColumnName(){
				
					return "IBAVGC";
				
				}

				
			    public BigDecimal IBQLRC;

				public BigDecimal getIBQLRC () {
					return this.IBQLRC;
				}

				public Boolean IBQLRCIsNullable(){
				    return true;
				}
				public Boolean IBQLRCIsKey(){
				    return false;
				}
				public Integer IBQLRCLength(){
				    return null;
				}
				public Integer IBQLRCPrecision(){
				    return null;
				}
				public String IBQLRCDefault(){
				
					return "";
				
				}
				public String IBQLRCComment(){
				
				    return "";
				
				}
				public String IBQLRCPattern(){
				
					return "";
				
				}
				public String IBQLRCOriginalDbColumnName(){
				
					return "IBQLRC";
				
				}

				
			    public BigDecimal IBAVOH;

				public BigDecimal getIBAVOH () {
					return this.IBAVOH;
				}

				public Boolean IBAVOHIsNullable(){
				    return true;
				}
				public Boolean IBAVOHIsKey(){
				    return false;
				}
				public Integer IBAVOHLength(){
				    return null;
				}
				public Integer IBAVOHPrecision(){
				    return null;
				}
				public String IBAVOHDefault(){
				
					return "";
				
				}
				public String IBAVOHComment(){
				
				    return "";
				
				}
				public String IBAVOHPattern(){
				
					return "";
				
				}
				public String IBAVOHOriginalDbColumnName(){
				
					return "IBAVOH";
				
				}

				
			    public BigDecimal IBAVRT;

				public BigDecimal getIBAVRT () {
					return this.IBAVRT;
				}

				public Boolean IBAVRTIsNullable(){
				    return true;
				}
				public Boolean IBAVRTIsKey(){
				    return false;
				}
				public Integer IBAVRTLength(){
				    return null;
				}
				public Integer IBAVRTPrecision(){
				    return null;
				}
				public String IBAVRTDefault(){
				
					return "";
				
				}
				public String IBAVRTComment(){
				
				    return "";
				
				}
				public String IBAVRTPattern(){
				
					return "";
				
				}
				public String IBAVRTOriginalDbColumnName(){
				
					return "IBAVRT";
				
				}

				
			    public BigDecimal IBAVCS;

				public BigDecimal getIBAVCS () {
					return this.IBAVCS;
				}

				public Boolean IBAVCSIsNullable(){
				    return true;
				}
				public Boolean IBAVCSIsKey(){
				    return false;
				}
				public Integer IBAVCSLength(){
				    return null;
				}
				public Integer IBAVCSPrecision(){
				    return null;
				}
				public String IBAVCSDefault(){
				
					return "";
				
				}
				public String IBAVCSComment(){
				
				    return "";
				
				}
				public String IBAVCSPattern(){
				
					return "";
				
				}
				public String IBAVCSOriginalDbColumnName(){
				
					return "IBAVCS";
				
				}

				
			    public String IBOSCR;

				public String getIBOSCR () {
					return this.IBOSCR;
				}

				public Boolean IBOSCRIsNullable(){
				    return true;
				}
				public Boolean IBOSCRIsKey(){
				    return false;
				}
				public Integer IBOSCRLength(){
				    return null;
				}
				public Integer IBOSCRPrecision(){
				    return null;
				}
				public String IBOSCRDefault(){
				
					return "";
				
				}
				public String IBOSCRComment(){
				
				    return "";
				
				}
				public String IBOSCRPattern(){
				
					return "";
				
				}
				public String IBOSCROriginalDbColumnName(){
				
					return "IBOSCR";
				
				}

				
			    public String IBOS01;

				public String getIBOS01 () {
					return this.IBOS01;
				}

				public Boolean IBOS01IsNullable(){
				    return true;
				}
				public Boolean IBOS01IsKey(){
				    return false;
				}
				public Integer IBOS01Length(){
				    return null;
				}
				public Integer IBOS01Precision(){
				    return null;
				}
				public String IBOS01Default(){
				
					return "";
				
				}
				public String IBOS01Comment(){
				
				    return "";
				
				}
				public String IBOS01Pattern(){
				
					return "";
				
				}
				public String IBOS01OriginalDbColumnName(){
				
					return "IBOS01";
				
				}

				
			    public String IBOS02;

				public String getIBOS02 () {
					return this.IBOS02;
				}

				public Boolean IBOS02IsNullable(){
				    return true;
				}
				public Boolean IBOS02IsKey(){
				    return false;
				}
				public Integer IBOS02Length(){
				    return null;
				}
				public Integer IBOS02Precision(){
				    return null;
				}
				public String IBOS02Default(){
				
					return "";
				
				}
				public String IBOS02Comment(){
				
				    return "";
				
				}
				public String IBOS02Pattern(){
				
					return "";
				
				}
				public String IBOS02OriginalDbColumnName(){
				
					return "IBOS02";
				
				}

				
			    public String IBOS03;

				public String getIBOS03 () {
					return this.IBOS03;
				}

				public Boolean IBOS03IsNullable(){
				    return true;
				}
				public Boolean IBOS03IsKey(){
				    return false;
				}
				public Integer IBOS03Length(){
				    return null;
				}
				public Integer IBOS03Precision(){
				    return null;
				}
				public String IBOS03Default(){
				
					return "";
				
				}
				public String IBOS03Comment(){
				
				    return "";
				
				}
				public String IBOS03Pattern(){
				
					return "";
				
				}
				public String IBOS03OriginalDbColumnName(){
				
					return "IBOS03";
				
				}

				
			    public String IBOS04;

				public String getIBOS04 () {
					return this.IBOS04;
				}

				public Boolean IBOS04IsNullable(){
				    return true;
				}
				public Boolean IBOS04IsKey(){
				    return false;
				}
				public Integer IBOS04Length(){
				    return null;
				}
				public Integer IBOS04Precision(){
				    return null;
				}
				public String IBOS04Default(){
				
					return "";
				
				}
				public String IBOS04Comment(){
				
				    return "";
				
				}
				public String IBOS04Pattern(){
				
					return "";
				
				}
				public String IBOS04OriginalDbColumnName(){
				
					return "IBOS04";
				
				}

				
			    public String IBOS05;

				public String getIBOS05 () {
					return this.IBOS05;
				}

				public Boolean IBOS05IsNullable(){
				    return true;
				}
				public Boolean IBOS05IsKey(){
				    return false;
				}
				public Integer IBOS05Length(){
				    return null;
				}
				public Integer IBOS05Precision(){
				    return null;
				}
				public String IBOS05Default(){
				
					return "";
				
				}
				public String IBOS05Comment(){
				
				    return "";
				
				}
				public String IBOS05Pattern(){
				
					return "";
				
				}
				public String IBOS05OriginalDbColumnName(){
				
					return "IBOS05";
				
				}

				
			    public String IBOS06;

				public String getIBOS06 () {
					return this.IBOS06;
				}

				public Boolean IBOS06IsNullable(){
				    return true;
				}
				public Boolean IBOS06IsKey(){
				    return false;
				}
				public Integer IBOS06Length(){
				    return null;
				}
				public Integer IBOS06Precision(){
				    return null;
				}
				public String IBOS06Default(){
				
					return "";
				
				}
				public String IBOS06Comment(){
				
				    return "";
				
				}
				public String IBOS06Pattern(){
				
					return "";
				
				}
				public String IBOS06OriginalDbColumnName(){
				
					return "IBOS06";
				
				}

				
			    public String IBOS07;

				public String getIBOS07 () {
					return this.IBOS07;
				}

				public Boolean IBOS07IsNullable(){
				    return true;
				}
				public Boolean IBOS07IsKey(){
				    return false;
				}
				public Integer IBOS07Length(){
				    return null;
				}
				public Integer IBOS07Precision(){
				    return null;
				}
				public String IBOS07Default(){
				
					return "";
				
				}
				public String IBOS07Comment(){
				
				    return "";
				
				}
				public String IBOS07Pattern(){
				
					return "";
				
				}
				public String IBOS07OriginalDbColumnName(){
				
					return "IBOS07";
				
				}

				
			    public String IBOS08;

				public String getIBOS08 () {
					return this.IBOS08;
				}

				public Boolean IBOS08IsNullable(){
				    return true;
				}
				public Boolean IBOS08IsKey(){
				    return false;
				}
				public Integer IBOS08Length(){
				    return null;
				}
				public Integer IBOS08Precision(){
				    return null;
				}
				public String IBOS08Default(){
				
					return "";
				
				}
				public String IBOS08Comment(){
				
				    return "";
				
				}
				public String IBOS08Pattern(){
				
					return "";
				
				}
				public String IBOS08OriginalDbColumnName(){
				
					return "IBOS08";
				
				}

				
			    public BigDecimal IBDEPT;

				public BigDecimal getIBDEPT () {
					return this.IBDEPT;
				}

				public Boolean IBDEPTIsNullable(){
				    return true;
				}
				public Boolean IBDEPTIsKey(){
				    return false;
				}
				public Integer IBDEPTLength(){
				    return null;
				}
				public Integer IBDEPTPrecision(){
				    return null;
				}
				public String IBDEPTDefault(){
				
					return "";
				
				}
				public String IBDEPTComment(){
				
				    return "";
				
				}
				public String IBDEPTPattern(){
				
					return "";
				
				}
				public String IBDEPTOriginalDbColumnName(){
				
					return "IBDEPT";
				
				}

				
			    public BigDecimal IBSDPT;

				public BigDecimal getIBSDPT () {
					return this.IBSDPT;
				}

				public Boolean IBSDPTIsNullable(){
				    return true;
				}
				public Boolean IBSDPTIsKey(){
				    return false;
				}
				public Integer IBSDPTLength(){
				    return null;
				}
				public Integer IBSDPTPrecision(){
				    return null;
				}
				public String IBSDPTDefault(){
				
					return "";
				
				}
				public String IBSDPTComment(){
				
				    return "";
				
				}
				public String IBSDPTPattern(){
				
					return "";
				
				}
				public String IBSDPTOriginalDbColumnName(){
				
					return "IBSDPT";
				
				}

				
			    public BigDecimal IBCLAS;

				public BigDecimal getIBCLAS () {
					return this.IBCLAS;
				}

				public Boolean IBCLASIsNullable(){
				    return true;
				}
				public Boolean IBCLASIsKey(){
				    return false;
				}
				public Integer IBCLASLength(){
				    return null;
				}
				public Integer IBCLASPrecision(){
				    return null;
				}
				public String IBCLASDefault(){
				
					return "";
				
				}
				public String IBCLASComment(){
				
				    return "";
				
				}
				public String IBCLASPattern(){
				
					return "";
				
				}
				public String IBCLASOriginalDbColumnName(){
				
					return "IBCLAS";
				
				}

				
			    public BigDecimal IBSCLS;

				public BigDecimal getIBSCLS () {
					return this.IBSCLS;
				}

				public Boolean IBSCLSIsNullable(){
				    return true;
				}
				public Boolean IBSCLSIsKey(){
				    return false;
				}
				public Integer IBSCLSLength(){
				    return null;
				}
				public Integer IBSCLSPrecision(){
				    return null;
				}
				public String IBSCLSDefault(){
				
					return "";
				
				}
				public String IBSCLSComment(){
				
				    return "";
				
				}
				public String IBSCLSPattern(){
				
					return "";
				
				}
				public String IBSCLSOriginalDbColumnName(){
				
					return "IBSCLS";
				
				}

				
			    public BigDecimal IBFRCN;

				public BigDecimal getIBFRCN () {
					return this.IBFRCN;
				}

				public Boolean IBFRCNIsNullable(){
				    return true;
				}
				public Boolean IBFRCNIsKey(){
				    return false;
				}
				public Integer IBFRCNLength(){
				    return null;
				}
				public Integer IBFRCNPrecision(){
				    return null;
				}
				public String IBFRCNDefault(){
				
					return "";
				
				}
				public String IBFRCNComment(){
				
				    return "";
				
				}
				public String IBFRCNPattern(){
				
					return "";
				
				}
				public String IBFRCNOriginalDbColumnName(){
				
					return "IBFRCN";
				
				}

				
			    public BigDecimal IBFRDT;

				public BigDecimal getIBFRDT () {
					return this.IBFRDT;
				}

				public Boolean IBFRDTIsNullable(){
				    return true;
				}
				public Boolean IBFRDTIsKey(){
				    return false;
				}
				public Integer IBFRDTLength(){
				    return null;
				}
				public Integer IBFRDTPrecision(){
				    return null;
				}
				public String IBFRDTDefault(){
				
					return "";
				
				}
				public String IBFRDTComment(){
				
				    return "";
				
				}
				public String IBFRDTPattern(){
				
					return "";
				
				}
				public String IBFRDTOriginalDbColumnName(){
				
					return "IBFRDT";
				
				}

				
			    public BigDecimal IBVNDR;

				public BigDecimal getIBVNDR () {
					return this.IBVNDR;
				}

				public Boolean IBVNDRIsNullable(){
				    return true;
				}
				public Boolean IBVNDRIsKey(){
				    return false;
				}
				public Integer IBVNDRLength(){
				    return null;
				}
				public Integer IBVNDRPrecision(){
				    return null;
				}
				public String IBVNDRDefault(){
				
					return "";
				
				}
				public String IBVNDRComment(){
				
				    return "";
				
				}
				public String IBVNDRPattern(){
				
					return "";
				
				}
				public String IBVNDROriginalDbColumnName(){
				
					return "IBVNDR";
				
				}

				
			    public String IBSTYL;

				public String getIBSTYL () {
					return this.IBSTYL;
				}

				public Boolean IBSTYLIsNullable(){
				    return true;
				}
				public Boolean IBSTYLIsKey(){
				    return false;
				}
				public Integer IBSTYLLength(){
				    return null;
				}
				public Integer IBSTYLPrecision(){
				    return null;
				}
				public String IBSTYLDefault(){
				
					return "";
				
				}
				public String IBSTYLComment(){
				
				    return "";
				
				}
				public String IBSTYLPattern(){
				
					return "";
				
				}
				public String IBSTYLOriginalDbColumnName(){
				
					return "IBSTYL";
				
				}

				
			    public BigDecimal IBPOOQ;

				public BigDecimal getIBPOOQ () {
					return this.IBPOOQ;
				}

				public Boolean IBPOOQIsNullable(){
				    return true;
				}
				public Boolean IBPOOQIsKey(){
				    return false;
				}
				public Integer IBPOOQLength(){
				    return null;
				}
				public Integer IBPOOQPrecision(){
				    return null;
				}
				public String IBPOOQDefault(){
				
					return "";
				
				}
				public String IBPOOQComment(){
				
				    return "";
				
				}
				public String IBPOOQPattern(){
				
					return "";
				
				}
				public String IBPOOQOriginalDbColumnName(){
				
					return "IBPOOQ";
				
				}

				
			    public BigDecimal IBTOOQ;

				public BigDecimal getIBTOOQ () {
					return this.IBTOOQ;
				}

				public Boolean IBTOOQIsNullable(){
				    return true;
				}
				public Boolean IBTOOQIsKey(){
				    return false;
				}
				public Integer IBTOOQLength(){
				    return null;
				}
				public Integer IBTOOQPrecision(){
				    return null;
				}
				public String IBTOOQDefault(){
				
					return "";
				
				}
				public String IBTOOQComment(){
				
				    return "";
				
				}
				public String IBTOOQPattern(){
				
					return "";
				
				}
				public String IBTOOQOriginalDbColumnName(){
				
					return "IBTOOQ";
				
				}

				
			    public BigDecimal IBINTQ;

				public BigDecimal getIBINTQ () {
					return this.IBINTQ;
				}

				public Boolean IBINTQIsNullable(){
				    return true;
				}
				public Boolean IBINTQIsKey(){
				    return false;
				}
				public Integer IBINTQLength(){
				    return null;
				}
				public Integer IBINTQPrecision(){
				    return null;
				}
				public String IBINTQDefault(){
				
					return "";
				
				}
				public String IBINTQComment(){
				
				    return "";
				
				}
				public String IBINTQPattern(){
				
					return "";
				
				}
				public String IBINTQOriginalDbColumnName(){
				
					return "IBINTQ";
				
				}

				
			    public BigDecimal IBMASU;

				public BigDecimal getIBMASU () {
					return this.IBMASU;
				}

				public Boolean IBMASUIsNullable(){
				    return true;
				}
				public Boolean IBMASUIsKey(){
				    return false;
				}
				public Integer IBMASULength(){
				    return null;
				}
				public Integer IBMASUPrecision(){
				    return null;
				}
				public String IBMASUDefault(){
				
					return "";
				
				}
				public String IBMASUComment(){
				
				    return "";
				
				}
				public String IBMASUPattern(){
				
					return "";
				
				}
				public String IBMASUOriginalDbColumnName(){
				
					return "IBMASU";
				
				}

				
			    public BigDecimal IBMASD;

				public BigDecimal getIBMASD () {
					return this.IBMASD;
				}

				public Boolean IBMASDIsNullable(){
				    return true;
				}
				public Boolean IBMASDIsKey(){
				    return false;
				}
				public Integer IBMASDLength(){
				    return null;
				}
				public Integer IBMASDPrecision(){
				    return null;
				}
				public String IBMASDDefault(){
				
					return "";
				
				}
				public String IBMASDComment(){
				
				    return "";
				
				}
				public String IBMASDPattern(){
				
					return "";
				
				}
				public String IBMASDOriginalDbColumnName(){
				
					return "IBMASD";
				
				}

				
			    public BigDecimal IBMASV;

				public BigDecimal getIBMASV () {
					return this.IBMASV;
				}

				public Boolean IBMASVIsNullable(){
				    return true;
				}
				public Boolean IBMASVIsKey(){
				    return false;
				}
				public Integer IBMASVLength(){
				    return null;
				}
				public Integer IBMASVPrecision(){
				    return null;
				}
				public String IBMASVDefault(){
				
					return "";
				
				}
				public String IBMASVComment(){
				
				    return "";
				
				}
				public String IBMASVPattern(){
				
					return "";
				
				}
				public String IBMASVOriginalDbColumnName(){
				
					return "IBMASV";
				
				}

				
			    public BigDecimal IBMASC;

				public BigDecimal getIBMASC () {
					return this.IBMASC;
				}

				public Boolean IBMASCIsNullable(){
				    return true;
				}
				public Boolean IBMASCIsKey(){
				    return false;
				}
				public Integer IBMASCLength(){
				    return null;
				}
				public Integer IBMASCPrecision(){
				    return null;
				}
				public String IBMASCDefault(){
				
					return "";
				
				}
				public String IBMASCComment(){
				
				    return "";
				
				}
				public String IBMASCPattern(){
				
					return "";
				
				}
				public String IBMASCOriginalDbColumnName(){
				
					return "IBMASC";
				
				}

				
			    public BigDecimal IBLAVC;

				public BigDecimal getIBLAVC () {
					return this.IBLAVC;
				}

				public Boolean IBLAVCIsNullable(){
				    return true;
				}
				public Boolean IBLAVCIsKey(){
				    return false;
				}
				public Integer IBLAVCLength(){
				    return null;
				}
				public Integer IBLAVCPrecision(){
				    return null;
				}
				public String IBLAVCDefault(){
				
					return "";
				
				}
				public String IBLAVCComment(){
				
				    return "";
				
				}
				public String IBLAVCPattern(){
				
					return "";
				
				}
				public String IBLAVCOriginalDbColumnName(){
				
					return "IBLAVC";
				
				}

				
			    public BigDecimal IBARQT;

				public BigDecimal getIBARQT () {
					return this.IBARQT;
				}

				public Boolean IBARQTIsNullable(){
				    return true;
				}
				public Boolean IBARQTIsKey(){
				    return false;
				}
				public Integer IBARQTLength(){
				    return null;
				}
				public Integer IBARQTPrecision(){
				    return null;
				}
				public String IBARQTDefault(){
				
					return "";
				
				}
				public String IBARQTComment(){
				
				    return "";
				
				}
				public String IBARQTPattern(){
				
					return "";
				
				}
				public String IBARQTOriginalDbColumnName(){
				
					return "IBARQT";
				
				}

				
			    public BigDecimal IBNSQT;

				public BigDecimal getIBNSQT () {
					return this.IBNSQT;
				}

				public Boolean IBNSQTIsNullable(){
				    return true;
				}
				public Boolean IBNSQTIsKey(){
				    return false;
				}
				public Integer IBNSQTLength(){
				    return null;
				}
				public Integer IBNSQTPrecision(){
				    return null;
				}
				public String IBNSQTDefault(){
				
					return "";
				
				}
				public String IBNSQTComment(){
				
				    return "";
				
				}
				public String IBNSQTPattern(){
				
					return "";
				
				}
				public String IBNSQTOriginalDbColumnName(){
				
					return "IBNSQT";
				
				}

				
			    public BigDecimal IBPHND;

				public BigDecimal getIBPHND () {
					return this.IBPHND;
				}

				public Boolean IBPHNDIsNullable(){
				    return true;
				}
				public Boolean IBPHNDIsKey(){
				    return false;
				}
				public Integer IBPHNDLength(){
				    return null;
				}
				public Integer IBPHNDPrecision(){
				    return null;
				}
				public String IBPHNDDefault(){
				
					return "";
				
				}
				public String IBPHNDComment(){
				
				    return "";
				
				}
				public String IBPHNDPattern(){
				
					return "";
				
				}
				public String IBPHNDOriginalDbColumnName(){
				
					return "IBPHND";
				
				}

				
			    public BigDecimal IBHLDQ;

				public BigDecimal getIBHLDQ () {
					return this.IBHLDQ;
				}

				public Boolean IBHLDQIsNullable(){
				    return true;
				}
				public Boolean IBHLDQIsKey(){
				    return false;
				}
				public Integer IBHLDQLength(){
				    return null;
				}
				public Integer IBHLDQPrecision(){
				    return null;
				}
				public String IBHLDQDefault(){
				
					return "";
				
				}
				public String IBHLDQComment(){
				
				    return "";
				
				}
				public String IBHLDQPattern(){
				
					return "";
				
				}
				public String IBHLDQOriginalDbColumnName(){
				
					return "IBHLDQ";
				
				}

				
			    public String IBCRCD;

				public String getIBCRCD () {
					return this.IBCRCD;
				}

				public Boolean IBCRCDIsNullable(){
				    return true;
				}
				public Boolean IBCRCDIsKey(){
				    return false;
				}
				public Integer IBCRCDLength(){
				    return null;
				}
				public Integer IBCRCDPrecision(){
				    return null;
				}
				public String IBCRCDDefault(){
				
					return null;
				
				}
				public String IBCRCDComment(){
				
				    return "";
				
				}
				public String IBCRCDPattern(){
				
					return "";
				
				}
				public String IBCRCDOriginalDbColumnName(){
				
					return "IBCRCD";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_BALANCE_DATA_INVBAL) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ISTORE = (BigDecimal) dis.readObject();
					
						this.IBHBOY = (BigDecimal) dis.readObject();
					
						this.IBHBOP = (BigDecimal) dis.readObject();
					
						this.IBHAND = (BigDecimal) dis.readObject();
					
						this.IBTRNS = (BigDecimal) dis.readObject();
					
						this.IBGMRI = (BigDecimal) dis.readObject();
					
						this.IBWKCR = (BigDecimal) dis.readObject();
					
						this.IBWK01 = (BigDecimal) dis.readObject();
					
						this.IBWK02 = (BigDecimal) dis.readObject();
					
						this.IBWK03 = (BigDecimal) dis.readObject();
					
						this.IBWK04 = (BigDecimal) dis.readObject();
					
						this.IBWK05 = (BigDecimal) dis.readObject();
					
						this.IBWK06 = (BigDecimal) dis.readObject();
					
						this.IBWK07 = (BigDecimal) dis.readObject();
					
						this.IBWK08 = (BigDecimal) dis.readObject();
					
						this.IBNORD = (BigDecimal) dis.readObject();
					
						this.IBLEAD = (BigDecimal) dis.readObject();
					
						this.IBRSUP = (BigDecimal) dis.readObject();
					
						this.IBRSUY = (BigDecimal) dis.readObject();
					
						this.IBRSDP = (BigDecimal) dis.readObject();
					
						this.IBRSDY = (BigDecimal) dis.readObject();
					
						this.IBVRSP = (BigDecimal) dis.readObject();
					
						this.IBVRSY = (BigDecimal) dis.readObject();
					
						this.IBRCSP = (BigDecimal) dis.readObject();
					
						this.IBRCSY = (BigDecimal) dis.readObject();
					
						this.IBASUP = (BigDecimal) dis.readObject();
					
						this.IBASUY = (BigDecimal) dis.readObject();
					
						this.IBASDP = (BigDecimal) dis.readObject();
					
						this.IBASDY = (BigDecimal) dis.readObject();
					
						this.IBVASP = (BigDecimal) dis.readObject();
					
						this.IBVASY = (BigDecimal) dis.readObject();
					
						this.IBACSP = (BigDecimal) dis.readObject();
					
						this.IBACSY = (BigDecimal) dis.readObject();
					
						this.IBRETS = (BigDecimal) dis.readObject();
					
						this.IBRCUP = (BigDecimal) dis.readObject();
					
						this.IBRCUY = (BigDecimal) dis.readObject();
					
						this.IBRCDP = (BigDecimal) dis.readObject();
					
						this.IBRCDY = (BigDecimal) dis.readObject();
					
						this.IBTIUP = (BigDecimal) dis.readObject();
					
						this.IBTIUY = (BigDecimal) dis.readObject();
					
						this.IBTOUP = (BigDecimal) dis.readObject();
					
						this.IBTOUY = (BigDecimal) dis.readObject();
					
						this.IBTFDP = (BigDecimal) dis.readObject();
					
						this.IBTFDY = (BigDecimal) dis.readObject();
					
						this.IBRVUP = (BigDecimal) dis.readObject();
					
						this.IBRVUY = (BigDecimal) dis.readObject();
					
						this.IBRVDP = (BigDecimal) dis.readObject();
					
						this.IBRVDY = (BigDecimal) dis.readObject();
					
						this.IBAJUP = (BigDecimal) dis.readObject();
					
						this.IBAJUY = (BigDecimal) dis.readObject();
					
						this.IBAJDP = (BigDecimal) dis.readObject();
					
						this.IBAJDY = (BigDecimal) dis.readObject();
					
						this.IBPHUP = (BigDecimal) dis.readObject();
					
						this.IBPHUY = (BigDecimal) dis.readObject();
					
						this.IBPHDP = (BigDecimal) dis.readObject();
					
						this.IBPHDY = (BigDecimal) dis.readObject();
					
						this.IBCEN1 = (BigDecimal) dis.readObject();
					
						this.IBALD1 = (BigDecimal) dis.readObject();
					
						this.IBCEN2 = (BigDecimal) dis.readObject();
					
						this.IBALD2 = (BigDecimal) dis.readObject();
					
						this.IBCEN3 = (BigDecimal) dis.readObject();
					
						this.IBALD3 = (BigDecimal) dis.readObject();
					
						this.IBCEN4 = (BigDecimal) dis.readObject();
					
						this.IBALD4 = (BigDecimal) dis.readObject();
					
						this.IBCEN5 = (BigDecimal) dis.readObject();
					
						this.IBALD5 = (BigDecimal) dis.readObject();
					
						this.IBAVGC = (BigDecimal) dis.readObject();
					
						this.IBQLRC = (BigDecimal) dis.readObject();
					
						this.IBAVOH = (BigDecimal) dis.readObject();
					
						this.IBAVRT = (BigDecimal) dis.readObject();
					
						this.IBAVCS = (BigDecimal) dis.readObject();
					
					this.IBOSCR = readString(dis);
					
					this.IBOS01 = readString(dis);
					
					this.IBOS02 = readString(dis);
					
					this.IBOS03 = readString(dis);
					
					this.IBOS04 = readString(dis);
					
					this.IBOS05 = readString(dis);
					
					this.IBOS06 = readString(dis);
					
					this.IBOS07 = readString(dis);
					
					this.IBOS08 = readString(dis);
					
						this.IBDEPT = (BigDecimal) dis.readObject();
					
						this.IBSDPT = (BigDecimal) dis.readObject();
					
						this.IBCLAS = (BigDecimal) dis.readObject();
					
						this.IBSCLS = (BigDecimal) dis.readObject();
					
						this.IBFRCN = (BigDecimal) dis.readObject();
					
						this.IBFRDT = (BigDecimal) dis.readObject();
					
						this.IBVNDR = (BigDecimal) dis.readObject();
					
					this.IBSTYL = readString(dis);
					
						this.IBPOOQ = (BigDecimal) dis.readObject();
					
						this.IBTOOQ = (BigDecimal) dis.readObject();
					
						this.IBINTQ = (BigDecimal) dis.readObject();
					
						this.IBMASU = (BigDecimal) dis.readObject();
					
						this.IBMASD = (BigDecimal) dis.readObject();
					
						this.IBMASV = (BigDecimal) dis.readObject();
					
						this.IBMASC = (BigDecimal) dis.readObject();
					
						this.IBLAVC = (BigDecimal) dis.readObject();
					
						this.IBARQT = (BigDecimal) dis.readObject();
					
						this.IBNSQT = (BigDecimal) dis.readObject();
					
						this.IBPHND = (BigDecimal) dis.readObject();
					
						this.IBHLDQ = (BigDecimal) dis.readObject();
					
					this.IBCRCD = readString(dis);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
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
				
       			    	dos.writeObject(this.IBHBOY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHBOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHAND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTRNS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBGMRI);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWKCR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBWK08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNORD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLEAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRSDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVRSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBASDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVASY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBACSY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRETS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRCDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTIUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTFDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBRVDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAJDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHUY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHDY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD1);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD2);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD3);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD4);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCEN5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBALD5);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVGC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBQLRC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBAVCS);
					
					// String
				
						writeString(this.IBOSCR,dos);
					
					// String
				
						writeString(this.IBOS01,dos);
					
					// String
				
						writeString(this.IBOS02,dos);
					
					// String
				
						writeString(this.IBOS03,dos);
					
					// String
				
						writeString(this.IBOS04,dos);
					
					// String
				
						writeString(this.IBOS05,dos);
					
					// String
				
						writeString(this.IBOS06,dos);
					
					// String
				
						writeString(this.IBOS07,dos);
					
					// String
				
						writeString(this.IBOS08,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBDEPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSDPT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBSCLS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBFRDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBVNDR);
					
					// String
				
						writeString(this.IBSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBTOOQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBINTQ);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASV);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBMASC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBLAVC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBARQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBNSQT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBPHND);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IBHLDQ);
					
					// String
				
						writeString(this.IBCRCD,dos);
					
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
		sb.append(",IBHBOY="+String.valueOf(IBHBOY));
		sb.append(",IBHBOP="+String.valueOf(IBHBOP));
		sb.append(",IBHAND="+String.valueOf(IBHAND));
		sb.append(",IBTRNS="+String.valueOf(IBTRNS));
		sb.append(",IBGMRI="+String.valueOf(IBGMRI));
		sb.append(",IBWKCR="+String.valueOf(IBWKCR));
		sb.append(",IBWK01="+String.valueOf(IBWK01));
		sb.append(",IBWK02="+String.valueOf(IBWK02));
		sb.append(",IBWK03="+String.valueOf(IBWK03));
		sb.append(",IBWK04="+String.valueOf(IBWK04));
		sb.append(",IBWK05="+String.valueOf(IBWK05));
		sb.append(",IBWK06="+String.valueOf(IBWK06));
		sb.append(",IBWK07="+String.valueOf(IBWK07));
		sb.append(",IBWK08="+String.valueOf(IBWK08));
		sb.append(",IBNORD="+String.valueOf(IBNORD));
		sb.append(",IBLEAD="+String.valueOf(IBLEAD));
		sb.append(",IBRSUP="+String.valueOf(IBRSUP));
		sb.append(",IBRSUY="+String.valueOf(IBRSUY));
		sb.append(",IBRSDP="+String.valueOf(IBRSDP));
		sb.append(",IBRSDY="+String.valueOf(IBRSDY));
		sb.append(",IBVRSP="+String.valueOf(IBVRSP));
		sb.append(",IBVRSY="+String.valueOf(IBVRSY));
		sb.append(",IBRCSP="+String.valueOf(IBRCSP));
		sb.append(",IBRCSY="+String.valueOf(IBRCSY));
		sb.append(",IBASUP="+String.valueOf(IBASUP));
		sb.append(",IBASUY="+String.valueOf(IBASUY));
		sb.append(",IBASDP="+String.valueOf(IBASDP));
		sb.append(",IBASDY="+String.valueOf(IBASDY));
		sb.append(",IBVASP="+String.valueOf(IBVASP));
		sb.append(",IBVASY="+String.valueOf(IBVASY));
		sb.append(",IBACSP="+String.valueOf(IBACSP));
		sb.append(",IBACSY="+String.valueOf(IBACSY));
		sb.append(",IBRETS="+String.valueOf(IBRETS));
		sb.append(",IBRCUP="+String.valueOf(IBRCUP));
		sb.append(",IBRCUY="+String.valueOf(IBRCUY));
		sb.append(",IBRCDP="+String.valueOf(IBRCDP));
		sb.append(",IBRCDY="+String.valueOf(IBRCDY));
		sb.append(",IBTIUP="+String.valueOf(IBTIUP));
		sb.append(",IBTIUY="+String.valueOf(IBTIUY));
		sb.append(",IBTOUP="+String.valueOf(IBTOUP));
		sb.append(",IBTOUY="+String.valueOf(IBTOUY));
		sb.append(",IBTFDP="+String.valueOf(IBTFDP));
		sb.append(",IBTFDY="+String.valueOf(IBTFDY));
		sb.append(",IBRVUP="+String.valueOf(IBRVUP));
		sb.append(",IBRVUY="+String.valueOf(IBRVUY));
		sb.append(",IBRVDP="+String.valueOf(IBRVDP));
		sb.append(",IBRVDY="+String.valueOf(IBRVDY));
		sb.append(",IBAJUP="+String.valueOf(IBAJUP));
		sb.append(",IBAJUY="+String.valueOf(IBAJUY));
		sb.append(",IBAJDP="+String.valueOf(IBAJDP));
		sb.append(",IBAJDY="+String.valueOf(IBAJDY));
		sb.append(",IBPHUP="+String.valueOf(IBPHUP));
		sb.append(",IBPHUY="+String.valueOf(IBPHUY));
		sb.append(",IBPHDP="+String.valueOf(IBPHDP));
		sb.append(",IBPHDY="+String.valueOf(IBPHDY));
		sb.append(",IBCEN1="+String.valueOf(IBCEN1));
		sb.append(",IBALD1="+String.valueOf(IBALD1));
		sb.append(",IBCEN2="+String.valueOf(IBCEN2));
		sb.append(",IBALD2="+String.valueOf(IBALD2));
		sb.append(",IBCEN3="+String.valueOf(IBCEN3));
		sb.append(",IBALD3="+String.valueOf(IBALD3));
		sb.append(",IBCEN4="+String.valueOf(IBCEN4));
		sb.append(",IBALD4="+String.valueOf(IBALD4));
		sb.append(",IBCEN5="+String.valueOf(IBCEN5));
		sb.append(",IBALD5="+String.valueOf(IBALD5));
		sb.append(",IBAVGC="+String.valueOf(IBAVGC));
		sb.append(",IBQLRC="+String.valueOf(IBQLRC));
		sb.append(",IBAVOH="+String.valueOf(IBAVOH));
		sb.append(",IBAVRT="+String.valueOf(IBAVRT));
		sb.append(",IBAVCS="+String.valueOf(IBAVCS));
		sb.append(",IBOSCR="+IBOSCR);
		sb.append(",IBOS01="+IBOS01);
		sb.append(",IBOS02="+IBOS02);
		sb.append(",IBOS03="+IBOS03);
		sb.append(",IBOS04="+IBOS04);
		sb.append(",IBOS05="+IBOS05);
		sb.append(",IBOS06="+IBOS06);
		sb.append(",IBOS07="+IBOS07);
		sb.append(",IBOS08="+IBOS08);
		sb.append(",IBDEPT="+String.valueOf(IBDEPT));
		sb.append(",IBSDPT="+String.valueOf(IBSDPT));
		sb.append(",IBCLAS="+String.valueOf(IBCLAS));
		sb.append(",IBSCLS="+String.valueOf(IBSCLS));
		sb.append(",IBFRCN="+String.valueOf(IBFRCN));
		sb.append(",IBFRDT="+String.valueOf(IBFRDT));
		sb.append(",IBVNDR="+String.valueOf(IBVNDR));
		sb.append(",IBSTYL="+IBSTYL);
		sb.append(",IBPOOQ="+String.valueOf(IBPOOQ));
		sb.append(",IBTOOQ="+String.valueOf(IBTOOQ));
		sb.append(",IBINTQ="+String.valueOf(IBINTQ));
		sb.append(",IBMASU="+String.valueOf(IBMASU));
		sb.append(",IBMASD="+String.valueOf(IBMASD));
		sb.append(",IBMASV="+String.valueOf(IBMASV));
		sb.append(",IBMASC="+String.valueOf(IBMASC));
		sb.append(",IBLAVC="+String.valueOf(IBLAVC));
		sb.append(",IBARQT="+String.valueOf(IBARQT));
		sb.append(",IBNSQT="+String.valueOf(IBNSQT));
		sb.append(",IBPHND="+String.valueOf(IBPHND));
		sb.append(",IBHLDQ="+String.valueOf(IBHLDQ));
		sb.append(",IBCRCD="+IBCRCD);
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
        		
        				if(IBHBOY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOY);
            			}
            		
        			sb.append("|");
        		
        				if(IBHBOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHBOP);
            			}
            		
        			sb.append("|");
        		
        				if(IBHAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHAND);
            			}
            		
        			sb.append("|");
        		
        				if(IBTRNS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTRNS);
            			}
            		
        			sb.append("|");
        		
        				if(IBGMRI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBGMRI);
            			}
            		
        			sb.append("|");
        		
        				if(IBWKCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWKCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK01);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK02);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK03);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK04);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK05);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK06);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK07);
            			}
            		
        			sb.append("|");
        		
        				if(IBWK08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBWK08);
            			}
            		
        			sb.append("|");
        		
        				if(IBNORD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNORD);
            			}
            		
        			sb.append("|");
        		
        				if(IBLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRSDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRSDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVRSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVRSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBASDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBASDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASP);
            			}
            		
        			sb.append("|");
        		
        				if(IBVASY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVASY);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSP);
            			}
            		
        			sb.append("|");
        		
        				if(IBACSY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBACSY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRETS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRETS);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRCDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRCDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTIUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTIUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBTFDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTFDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBRVDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBRVDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBAJDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAJDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHUY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHUY);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDP);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHDY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHDY);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN1);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD1);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN2);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD2);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN3);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD3);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN4);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD4 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD4);
            			}
            		
        			sb.append("|");
        		
        				if(IBCEN5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCEN5);
            			}
            		
        			sb.append("|");
        		
        				if(IBALD5 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBALD5);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVGC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVGC);
            			}
            		
        			sb.append("|");
        		
        				if(IBQLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBQLRC);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVOH);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVRT);
            			}
            		
        			sb.append("|");
        		
        				if(IBAVCS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBAVCS);
            			}
            		
        			sb.append("|");
        		
        				if(IBOSCR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOSCR);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS01);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS02);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS03);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS04);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS05);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS06);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS07);
            			}
            		
        			sb.append("|");
        		
        				if(IBOS08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBOS08);
            			}
            		
        			sb.append("|");
        		
        				if(IBDEPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBDEPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(IBCLAS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCLAS);
            			}
            		
        			sb.append("|");
        		
        				if(IBSCLS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSCLS);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRCN);
            			}
            		
        			sb.append("|");
        		
        				if(IBFRDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBFRDT);
            			}
            		
        			sb.append("|");
        		
        				if(IBVNDR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBVNDR);
            			}
            		
        			sb.append("|");
        		
        				if(IBSTYL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBSTYL);
            			}
            		
        			sb.append("|");
        		
        				if(IBPOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBTOOQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBTOOQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBINTQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBINTQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASU);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASD);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASV);
            			}
            		
        			sb.append("|");
        		
        				if(IBMASC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBMASC);
            			}
            		
        			sb.append("|");
        		
        				if(IBLAVC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBLAVC);
            			}
            		
        			sb.append("|");
        		
        				if(IBARQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBARQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBNSQT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBNSQT);
            			}
            		
        			sb.append("|");
        		
        				if(IBPHND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBPHND);
            			}
            		
        			sb.append("|");
        		
        				if(IBHLDQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBHLDQ);
            			}
            		
        			sb.append("|");
        		
        				if(IBCRCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IBCRCD);
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
INVBALStruct INVBAL = new INVBALStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"INVBAL");
			
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
 		                    
 		                    props_tDBOutput_1.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    "INVBAL");
 		                    
 		                    props_tDBOutput_1.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
     		                    						
     		                    						a("\"name\":\"INVBAL\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"INUMBR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTORE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ISTORE\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBHBOY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBHBOY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBHBOP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBHBOP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBHAND\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBHAND\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTRNS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTRNS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBGMRI\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":4,\"talend.field.scale\":1,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBGMRI\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWKCR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWKCR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK01\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK02\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK03\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK04\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK05\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK06\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK07\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBWK08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBWK08\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBNORD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBNORD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBLEAD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":5,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBLEAD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRSUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRSUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRSUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRSUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRSDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRSDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRSDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRSDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBVRSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBVRSP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBVRSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBVRSY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCSP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCSY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBASUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBASUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBASUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBASUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBASDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBASDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBASDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBASDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBVASP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBVASP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBVASY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBVASY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBACSP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBACSP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBACSY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBACSY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRETS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRETS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRCDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRCDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTIUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTIUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTIUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTIUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTOUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTOUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTOUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTOUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTFDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTFDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTFDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTFDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRVUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRVUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRVUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRVUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRVDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRVDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBRVDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBRVDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAJUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAJUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAJUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAJUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAJDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAJDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAJDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAJDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPHUP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPHUP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPHUY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":7,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPHUY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPHDP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPHDP\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPHDY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPHDY\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCEN1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCEN1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBALD1\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBALD1\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCEN2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCEN2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBALD2\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBALD2\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCEN3\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCEN3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBALD3\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBALD3\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCEN4\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCEN4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBALD4\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBALD4\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCEN5\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCEN5\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBALD5\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBALD5\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAVGC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":4,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAVGC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBQLRC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBQLRC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAVOH\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAVOH\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAVRT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAVRT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBAVCS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":3,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBAVCS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOSCR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOSCR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS01\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS01\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS02\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS02\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS03\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS03\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS04\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS04\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS05\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS05\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS06\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS06\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS07\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS07\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBOS08\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBOS08\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBDEPT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBDEPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBSDPT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBSDPT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCLAS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBCLAS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBSCLS\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBSCLS\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBFRCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBFRCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBFRDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBFRDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBVNDR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"IBVNDR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBSTYL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":15,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBSTYL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPOOQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPOOQ\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBTOOQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBTOOQ\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBINTQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBINTQ\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBMASU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBMASU\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBMASD\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBMASD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBMASV\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBMASV\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBMASC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBMASC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBLAVC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":11,\"talend.field.scale\":4,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBLAVC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBARQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBARQT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBNSQT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBNSQT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBPHND\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBPHND\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBHLDQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":2,\"talend.field.dbType\":3,\"talend.field.dbColumnName\":\"IBHLDQ\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IBCRCD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IBCRCD\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATELOADED\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"DATELOADED\",\"talend.field.default\":\"\"}]}",s);
     		                    						
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
				int count_INVBAL_tMap_1 = 0;
				
INVBALStruct INVBAL_tmp = new INVBALStruct();
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
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVBAL.zip\"");
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
                            log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTORE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHBOY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHBOP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHAND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTRNS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBGMRI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWKCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBWK08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBNORD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRSDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVRSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVRSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBASDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVASP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVASY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBACSP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBACSY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRCDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTIUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTIUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTFDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTFDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBRVDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAJDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHUY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHDP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHDY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD4")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCEN5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBALD5")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVGC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBQLRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBAVCS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOSCR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBOS08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSCLS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBFRCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBFRDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBVNDR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBSTYL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPOOQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBTOOQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBINTQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBMASC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBLAVC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBARQT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBNSQT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBPHND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBHLDQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IBCRCD")+"}]");
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
	
	
				class RowHelper_tFileInputDelimited_1{
				
					public void valueToConn_0(org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1,row1Struct row1 ) throws java.lang.Exception{
						
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
								
    								row1.ISTORE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISTORE", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ISTORE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBHBOY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBHBOY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBHBOY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBHBOP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBHBOP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBHBOP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBHAND = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBHAND", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBHAND = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 5;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTRNS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTRNS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTRNS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 6;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBGMRI = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBGMRI", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBGMRI = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 7;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWKCR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWKCR", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWKCR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 8;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK01 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK01", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK01 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 9;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK02 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK02", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK02 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 10;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK03 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK03", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK03 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 11;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK04 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK04", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK04 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 12;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK05 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK05", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK05 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 13;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK06 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK06", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK06 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 14;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK07 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK07", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK07 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 15;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBWK08 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBWK08", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBWK08 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 16;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBNORD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBNORD", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBNORD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 17;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBLEAD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBLEAD", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBLEAD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 18;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRSUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRSUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRSUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 19;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRSUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRSUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRSUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 20;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRSDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRSDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRSDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 21;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRSDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRSDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRSDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 22;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBVRSP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBVRSP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBVRSP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 23;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBVRSY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBVRSY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBVRSY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 24;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCSP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCSP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCSP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 25;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCSY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCSY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCSY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 26;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBASUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBASUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBASUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 27;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBASUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBASUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBASUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 28;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBASDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBASDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBASDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 29;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBASDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBASDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBASDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 30;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBVASP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBVASP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBVASP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 31;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBVASY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBVASY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBVASY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 32;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBACSP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBACSP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBACSP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 33;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBACSY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBACSY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBACSY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 34;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRETS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRETS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRETS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 35;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 36;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 37;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 38;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRCDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRCDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRCDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 39;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTIUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTIUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTIUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 40;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTIUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTIUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTIUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 41;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTOUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTOUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTOUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 42;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTOUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTOUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTOUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 43;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTFDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTFDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTFDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 44;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTFDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTFDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTFDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 45;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRVUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRVUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRVUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 46;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRVUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRVUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRVUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 47;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRVDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRVDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRVDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 48;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBRVDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBRVDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBRVDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 49;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAJUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAJUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAJUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 50;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAJUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAJUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAJUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 51;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAJDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAJDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAJDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 52;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAJDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAJDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAJDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 53;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPHUP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPHUP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPHUP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 54;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPHUY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPHUY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPHUY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 55;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPHDP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPHDP", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPHDP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 56;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPHDY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPHDY", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPHDY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 57;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCEN1 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCEN1", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCEN1 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 58;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBALD1 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBALD1", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBALD1 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 59;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCEN2 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCEN2", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCEN2 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 60;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBALD2 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBALD2", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBALD2 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 61;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCEN3 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCEN3", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCEN3 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 62;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBALD3 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBALD3", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBALD3 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 63;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCEN4 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCEN4", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCEN4 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 64;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBALD4 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBALD4", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBALD4 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 65;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCEN5 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCEN5", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCEN5 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 66;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBALD5 = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBALD5", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBALD5 = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 67;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAVGC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAVGC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAVGC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 68;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBQLRC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBQLRC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBQLRC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 69;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAVOH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAVOH", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAVOH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 70;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAVRT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAVRT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAVRT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 71;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBAVCS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBAVCS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBAVCS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 72;
					
							row1.IBOSCR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 73;
					
							row1.IBOS01 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 74;
					
							row1.IBOS02 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 75;
					
							row1.IBOS03 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 76;
					
							row1.IBOS04 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 77;
					
							row1.IBOS05 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 78;
					
							row1.IBOS06 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 79;
					
							row1.IBOS07 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 80;
					
							row1.IBOS08 = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 81;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBDEPT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBDEPT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBDEPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 82;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBSDPT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBSDPT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBSDPT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 83;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBCLAS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBCLAS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBCLAS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 84;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBSCLS = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBSCLS", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBSCLS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 85;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBFRCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBFRCN", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBFRCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 86;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBFRDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBFRDT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBFRDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 87;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBVNDR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBVNDR", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBVNDR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 88;
					
							row1.IBSTYL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 89;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPOOQ = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPOOQ", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPOOQ = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 90;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBTOOQ = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBTOOQ", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBTOOQ = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 91;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBINTQ = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBINTQ", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBINTQ = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 92;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBMASU = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBMASU", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBMASU = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 93;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBMASD = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBMASD", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBMASD = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 94;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBMASV = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBMASV", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBMASV = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 95;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBMASC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBMASC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBMASC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 96;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBLAVC = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBLAVC", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBLAVC = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 97;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBARQT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBARQT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBARQT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 98;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBNSQT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBNSQT", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBNSQT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 99;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBPHND = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBPHND", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBPHND = null;
								
							
						}
					
				
				
					}
					
					public void valueToConn_1(org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1,row1Struct row1 ) throws java.lang.Exception{
						
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_1 = 100;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.IBHLDQ = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"IBHLDQ", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.IBHLDQ = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 101;
					
							row1.IBCRCD = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
					}
					
					public void valueToConn(org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1,row1Struct row1 ) throws java.lang.Exception{
				
						valueToConn_0(fid_tFileInputDelimited_1,row1 );
					
						valueToConn_1(fid_tFileInputDelimited_1,row1 );
					
					}
				
				}
				RowHelper_tFileInputDelimited_1 rowHelper_tFileInputDelimited_1  = new RowHelper_tFileInputDelimited_1();
			
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/INVBAL.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_1 = null;
						try {
							if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
								zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_1));
							}else{
								zis_tFileInputDelimited_1 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_1))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_1 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_1 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_1 = zis_tFileInputDelimited_1.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
								
									
										log.error("tFileInputDelimited_1 - " +e.getMessage());
									
									System.err.println(e.getMessage());
									break;
								
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
								
									
										log.error("tFileInputDelimited_1 - " +e.getMessage());
									
									System.err.println(e.getMessage());
								
							}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
			rowHelper_tFileInputDelimited_1.valueToConn(fid_tFileInputDelimited_1, row1 );
		
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
												log.error("tFileInputDelimited_1 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row1 = null;
			                				
										
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
Var.var1 = TalendDate.addDate(TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")),-1,"DD") ;// ###############################
        // ###############################
        // # Output tables

INVBAL = null;


// # Output table : 'INVBAL'
count_INVBAL_tMap_1++;

INVBAL_tmp.INUMBR = row1.INUMBR;
INVBAL_tmp.ISTORE = row1.ISTORE;
INVBAL_tmp.IBHBOY = row1.IBHBOY;
INVBAL_tmp.IBHBOP = row1.IBHBOP;
INVBAL_tmp.IBHAND = row1.IBHAND;
INVBAL_tmp.IBTRNS = row1.IBTRNS;
INVBAL_tmp.IBGMRI = row1.IBGMRI;
INVBAL_tmp.IBWKCR = row1.IBWKCR;
INVBAL_tmp.IBWK01 = row1.IBWK01;
INVBAL_tmp.IBWK02 = row1.IBWK02;
INVBAL_tmp.IBWK03 = row1.IBWK03;
INVBAL_tmp.IBWK04 = row1.IBWK04;
INVBAL_tmp.IBWK05 = row1.IBWK05;
INVBAL_tmp.IBWK06 = row1.IBWK06;
INVBAL_tmp.IBWK07 = row1.IBWK07;
INVBAL_tmp.IBWK08 = row1.IBWK08;
INVBAL_tmp.IBNORD = row1.IBNORD;
INVBAL_tmp.IBLEAD = row1.IBLEAD;
INVBAL_tmp.IBRSUP = row1.IBRSUP;
INVBAL_tmp.IBRSUY = row1.IBRSUY;
INVBAL_tmp.IBRSDP = row1.IBRSDP;
INVBAL_tmp.IBRSDY = row1.IBRSDY;
INVBAL_tmp.IBVRSP = row1.IBVRSP;
INVBAL_tmp.IBVRSY = row1.IBVRSY;
INVBAL_tmp.IBRCSP = row1.IBRCSP;
INVBAL_tmp.IBRCSY = row1.IBRCSY;
INVBAL_tmp.IBASUP = row1.IBASUP;
INVBAL_tmp.IBASUY = row1.IBASUY;
INVBAL_tmp.IBASDP = row1.IBASDP;
INVBAL_tmp.IBASDY = row1.IBASDY;
INVBAL_tmp.IBVASP = row1.IBVASP;
INVBAL_tmp.IBVASY = row1.IBVASY;
INVBAL_tmp.IBACSP = row1.IBACSP;
INVBAL_tmp.IBACSY = row1.IBACSY;
INVBAL_tmp.IBRETS = row1.IBRETS;
INVBAL_tmp.IBRCUP = row1.IBRCUP;
INVBAL_tmp.IBRCUY = row1.IBRCUY;
INVBAL_tmp.IBRCDP = row1.IBRCDP;
INVBAL_tmp.IBRCDY = row1.IBRCDY;
INVBAL_tmp.IBTIUP = row1.IBTIUP;
INVBAL_tmp.IBTIUY = row1.IBTIUY;
INVBAL_tmp.IBTOUP = row1.IBTOUP;
INVBAL_tmp.IBTOUY = row1.IBTOUY;
INVBAL_tmp.IBTFDP = row1.IBTFDP;
INVBAL_tmp.IBTFDY = row1.IBTFDY;
INVBAL_tmp.IBRVUP = row1.IBRVUP;
INVBAL_tmp.IBRVUY = row1.IBRVUY;
INVBAL_tmp.IBRVDP = row1.IBRVDP;
INVBAL_tmp.IBRVDY = row1.IBRVDY;
INVBAL_tmp.IBAJUP = row1.IBAJUP;
INVBAL_tmp.IBAJUY = row1.IBAJUY;
INVBAL_tmp.IBAJDP = row1.IBAJDP;
INVBAL_tmp.IBAJDY = row1.IBAJDY;
INVBAL_tmp.IBPHUP = row1.IBPHUP;
INVBAL_tmp.IBPHUY = row1.IBPHUY;
INVBAL_tmp.IBPHDP = row1.IBPHDP;
INVBAL_tmp.IBPHDY = row1.IBPHDY;
INVBAL_tmp.IBCEN1 = row1.IBCEN1;
INVBAL_tmp.IBALD1 = row1.IBALD1;
INVBAL_tmp.IBCEN2 = row1.IBCEN2;
INVBAL_tmp.IBALD2 = row1.IBALD2;
INVBAL_tmp.IBCEN3 = row1.IBCEN3;
INVBAL_tmp.IBALD3 = row1.IBALD3;
INVBAL_tmp.IBCEN4 = row1.IBCEN4;
INVBAL_tmp.IBALD4 = row1.IBALD4;
INVBAL_tmp.IBCEN5 = row1.IBCEN5;
INVBAL_tmp.IBALD5 = row1.IBALD5;
INVBAL_tmp.IBAVGC = row1.IBAVGC;
INVBAL_tmp.IBQLRC = row1.IBQLRC;
INVBAL_tmp.IBAVOH = row1.IBAVOH;
INVBAL_tmp.IBAVRT = row1.IBAVRT;
INVBAL_tmp.IBAVCS = row1.IBAVCS;
INVBAL_tmp.IBOSCR = row1.IBOSCR;
INVBAL_tmp.IBOS01 = row1.IBOS01;
INVBAL_tmp.IBOS02 = row1.IBOS02;
INVBAL_tmp.IBOS03 = row1.IBOS03;
INVBAL_tmp.IBOS04 = row1.IBOS04;
INVBAL_tmp.IBOS05 = row1.IBOS05;
INVBAL_tmp.IBOS06 = row1.IBOS06;
INVBAL_tmp.IBOS07 = row1.IBOS07;
INVBAL_tmp.IBOS08 = row1.IBOS08;
INVBAL_tmp.IBDEPT = row1.IBDEPT;
INVBAL_tmp.IBSDPT = row1.IBSDPT;
INVBAL_tmp.IBCLAS = row1.IBCLAS;
INVBAL_tmp.IBSCLS = row1.IBSCLS;
INVBAL_tmp.IBFRCN = row1.IBFRCN;
INVBAL_tmp.IBFRDT = row1.IBFRDT;
INVBAL_tmp.IBVNDR = row1.IBVNDR;
INVBAL_tmp.IBSTYL = row1.IBSTYL;
INVBAL_tmp.IBPOOQ = row1.IBPOOQ;
INVBAL_tmp.IBTOOQ = row1.IBTOOQ;
INVBAL_tmp.IBINTQ = row1.IBINTQ;
INVBAL_tmp.IBMASU = row1.IBMASU;
INVBAL_tmp.IBMASD = row1.IBMASD;
INVBAL_tmp.IBMASV = row1.IBMASV;
INVBAL_tmp.IBMASC = row1.IBMASC;
INVBAL_tmp.IBLAVC = row1.IBLAVC;
INVBAL_tmp.IBARQT = row1.IBARQT;
INVBAL_tmp.IBNSQT = row1.IBNSQT;
INVBAL_tmp.IBPHND = row1.IBPHND;
INVBAL_tmp.IBHLDQ = row1.IBHLDQ;
INVBAL_tmp.IBCRCD = row1.IBCRCD;
INVBAL_tmp.DATELOADED =  Var.var1 ;
INVBAL = INVBAL_tmp;
log.debug("tMap_1 - Outputting the record " + count_INVBAL_tMap_1 + " of the output table 'INVBAL'.");

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
// Start of branch "INVBAL"
if(INVBAL != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"INVBAL","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("INVBAL - " + (INVBAL==null? "": INVBAL.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INUMBR") != null){
                    incomingEnforcer_tDBOutput_1.put("INUMBR", INVBAL.INUMBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISTORE") != null){
                    incomingEnforcer_tDBOutput_1.put("ISTORE", INVBAL.ISTORE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBHBOY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBHBOY", INVBAL.IBHBOY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBHBOP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBHBOP", INVBAL.IBHBOP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBHAND") != null){
                    incomingEnforcer_tDBOutput_1.put("IBHAND", INVBAL.IBHAND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTRNS") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTRNS", INVBAL.IBTRNS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBGMRI") != null){
                    incomingEnforcer_tDBOutput_1.put("IBGMRI", INVBAL.IBGMRI);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWKCR") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWKCR", INVBAL.IBWKCR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK01") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK01", INVBAL.IBWK01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK02") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK02", INVBAL.IBWK02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK03") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK03", INVBAL.IBWK03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK04") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK04", INVBAL.IBWK04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK05") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK05", INVBAL.IBWK05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK06") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK06", INVBAL.IBWK06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK07") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK07", INVBAL.IBWK07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBWK08") != null){
                    incomingEnforcer_tDBOutput_1.put("IBWK08", INVBAL.IBWK08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBNORD") != null){
                    incomingEnforcer_tDBOutput_1.put("IBNORD", INVBAL.IBNORD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBLEAD") != null){
                    incomingEnforcer_tDBOutput_1.put("IBLEAD", INVBAL.IBLEAD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRSUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRSUP", INVBAL.IBRSUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRSUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRSUY", INVBAL.IBRSUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRSDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRSDP", INVBAL.IBRSDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRSDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRSDY", INVBAL.IBRSDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBVRSP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBVRSP", INVBAL.IBVRSP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBVRSY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBVRSY", INVBAL.IBVRSY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCSP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCSP", INVBAL.IBRCSP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCSY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCSY", INVBAL.IBRCSY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBASUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBASUP", INVBAL.IBASUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBASUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBASUY", INVBAL.IBASUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBASDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBASDP", INVBAL.IBASDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBASDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBASDY", INVBAL.IBASDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBVASP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBVASP", INVBAL.IBVASP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBVASY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBVASY", INVBAL.IBVASY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBACSP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBACSP", INVBAL.IBACSP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBACSY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBACSY", INVBAL.IBACSY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRETS") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRETS", INVBAL.IBRETS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCUP", INVBAL.IBRCUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCUY", INVBAL.IBRCUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCDP", INVBAL.IBRCDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRCDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRCDY", INVBAL.IBRCDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTIUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTIUP", INVBAL.IBTIUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTIUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTIUY", INVBAL.IBTIUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTOUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTOUP", INVBAL.IBTOUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTOUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTOUY", INVBAL.IBTOUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTFDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTFDP", INVBAL.IBTFDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTFDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTFDY", INVBAL.IBTFDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRVUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRVUP", INVBAL.IBRVUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRVUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRVUY", INVBAL.IBRVUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRVDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRVDP", INVBAL.IBRVDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBRVDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBRVDY", INVBAL.IBRVDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAJUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAJUP", INVBAL.IBAJUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAJUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAJUY", INVBAL.IBAJUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAJDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAJDP", INVBAL.IBAJDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAJDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAJDY", INVBAL.IBAJDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPHUP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPHUP", INVBAL.IBPHUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPHUY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPHUY", INVBAL.IBPHUY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPHDP") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPHDP", INVBAL.IBPHDP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPHDY") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPHDY", INVBAL.IBPHDY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCEN1") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCEN1", INVBAL.IBCEN1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBALD1") != null){
                    incomingEnforcer_tDBOutput_1.put("IBALD1", INVBAL.IBALD1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCEN2") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCEN2", INVBAL.IBCEN2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBALD2") != null){
                    incomingEnforcer_tDBOutput_1.put("IBALD2", INVBAL.IBALD2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCEN3") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCEN3", INVBAL.IBCEN3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBALD3") != null){
                    incomingEnforcer_tDBOutput_1.put("IBALD3", INVBAL.IBALD3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCEN4") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCEN4", INVBAL.IBCEN4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBALD4") != null){
                    incomingEnforcer_tDBOutput_1.put("IBALD4", INVBAL.IBALD4);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCEN5") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCEN5", INVBAL.IBCEN5);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBALD5") != null){
                    incomingEnforcer_tDBOutput_1.put("IBALD5", INVBAL.IBALD5);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAVGC") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAVGC", INVBAL.IBAVGC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBQLRC") != null){
                    incomingEnforcer_tDBOutput_1.put("IBQLRC", INVBAL.IBQLRC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAVOH") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAVOH", INVBAL.IBAVOH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAVRT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAVRT", INVBAL.IBAVRT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBAVCS") != null){
                    incomingEnforcer_tDBOutput_1.put("IBAVCS", INVBAL.IBAVCS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOSCR") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOSCR", INVBAL.IBOSCR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS01") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS01", INVBAL.IBOS01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS02") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS02", INVBAL.IBOS02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS03") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS03", INVBAL.IBOS03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS04") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS04", INVBAL.IBOS04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS05") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS05", INVBAL.IBOS05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS06") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS06", INVBAL.IBOS06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS07") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS07", INVBAL.IBOS07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBOS08") != null){
                    incomingEnforcer_tDBOutput_1.put("IBOS08", INVBAL.IBOS08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBDEPT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBDEPT", INVBAL.IBDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBSDPT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBSDPT", INVBAL.IBSDPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCLAS") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCLAS", INVBAL.IBCLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBSCLS") != null){
                    incomingEnforcer_tDBOutput_1.put("IBSCLS", INVBAL.IBSCLS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBFRCN") != null){
                    incomingEnforcer_tDBOutput_1.put("IBFRCN", INVBAL.IBFRCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBFRDT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBFRDT", INVBAL.IBFRDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBVNDR") != null){
                    incomingEnforcer_tDBOutput_1.put("IBVNDR", INVBAL.IBVNDR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBSTYL") != null){
                    incomingEnforcer_tDBOutput_1.put("IBSTYL", INVBAL.IBSTYL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPOOQ") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPOOQ", INVBAL.IBPOOQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBTOOQ") != null){
                    incomingEnforcer_tDBOutput_1.put("IBTOOQ", INVBAL.IBTOOQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBINTQ") != null){
                    incomingEnforcer_tDBOutput_1.put("IBINTQ", INVBAL.IBINTQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBMASU") != null){
                    incomingEnforcer_tDBOutput_1.put("IBMASU", INVBAL.IBMASU);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBMASD") != null){
                    incomingEnforcer_tDBOutput_1.put("IBMASD", INVBAL.IBMASD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBMASV") != null){
                    incomingEnforcer_tDBOutput_1.put("IBMASV", INVBAL.IBMASV);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBMASC") != null){
                    incomingEnforcer_tDBOutput_1.put("IBMASC", INVBAL.IBMASC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBLAVC") != null){
                    incomingEnforcer_tDBOutput_1.put("IBLAVC", INVBAL.IBLAVC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBARQT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBARQT", INVBAL.IBARQT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBNSQT") != null){
                    incomingEnforcer_tDBOutput_1.put("IBNSQT", INVBAL.IBNSQT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBPHND") != null){
                    incomingEnforcer_tDBOutput_1.put("IBPHND", INVBAL.IBPHND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBHLDQ") != null){
                    incomingEnforcer_tDBOutput_1.put("IBHLDQ", INVBAL.IBHLDQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IBCRCD") != null){
                    incomingEnforcer_tDBOutput_1.put("IBCRCD", INVBAL.IBCRCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DATELOADED") != null){
                    incomingEnforcer_tDBOutput_1.put("DATELOADED", INVBAL.DATELOADED);
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

} // End of branch "INVBAL"




	
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
            if(!((Object)("/data/talend/data_repository/INVBAL.zip") instanceof java.io.InputStream)){
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
				log.debug("tMap_1 - Written records count in the table 'INVBAL': " + count_INVBAL_tMap_1 + ".");





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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"INVBAL",2,0,
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
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
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
 		                    "\ninsert into INVENTORY_BALANCE_DATA_INVBAL\nselect \nINUMBR\n,ISTORE\n,IBHBOY\n,IBHBOP\n,IBHAND\n,IBTRNS\n,IBGMRI\n,IB"
+"WKCR\n,IBWK01\n,IBWK02\n,IBWK03\n,IBWK04\n,IBWK05\n,IBWK06\n,IBWK07\n,IBWK08\n,IBNORD\n,IBLEAD\n,IBRSUP\n,IBRSUY\n,IBRSD"
+"P\n,IBRSDY\n,IBVRSP\n,IBVRSY\n,IBRCSP\n,IBRCSY\n,IBASUP\n,IBASUY\n,IBASDP\n,IBASDY\n,IBVASP\n,IBVASY\n,IBACSP\n,IBACSY\n"
+",IBRETS\n,IBRCUP\n,IBRCUY\n,IBRCDP\n,IBRCDY\n,IBTIUP\n,IBTIUY\n,IBTOUP\n,IBTOUY\n,IBTFDP\n,IBTFDY\n,IBRVUP\n,IBRVUY\n,IB"
+"RVDP\n,IBRVDY\n,IBAJUP\n,IBAJUY\n,IBAJDP\n,IBAJDY\n,IBPHUP\n,IBPHUY\n,IBPHDP\n,IBPHDY\n,    case\n        when  LENGTH(I"
+"BALD1)= 5 then TO_DATE(CONCAT( '200', TO_VARCHAR(IBALD1)),'yyyymmdd')\n        WHEN  LENGTH(IBALD1)= 6 then TO_DATE(CONC"
+"AT( '20',  IBALD1),'yyyymmdd')\n        else NULL\n    end as IBALD1\n,    case\n        when LENGTH(IBALD2)= 5 then TO_"
+"DATE(CONCAT( '200', TO_VARCHAR(IBALD2)),'yyyymmdd')\n        WHEN LENGTH(IBALD2)= 6 then TO_DATE(CONCAT( '20',  IBALD2),"
+"'yyyymmdd')\n        else NULL\n    end as IBALD2\n,    case\n        when LENGTH(IBALD3)= 5 and  TO_DECIMAL(right(TO_VA"
+"RCHAR(IBALD3), 2)) <> 0 then TO_DATE(CONCAT( '200', TO_VARCHAR(IBALD3)),'yyyymmdd')\n        WHEN LENGTH(IBALD3)= 6 and "
+" TO_DECIMAL(right(TO_VARCHAR(IBALD3), 2)) <> 0 then TO_DATE(CONCAT( '20', IBALD3),'yyyymmdd')\n        else NULL\n    en"
+"d as IBALD3\n,    case\n        when LENGTH(IBALD4)= 5 and  TO_DECIMAL(right(TO_VARCHAR(IBALD4), 2)) <> 0 then TO_DATE(C"
+"ONCAT( '200', TO_VARCHAR(IBALD4)),'yyyymmdd')\n        WHEN LENGTH(IBALD4)= 6 and  TO_DECIMAL(right(TO_VARCHAR(IBALD4), "
+"2)) <> 0 then TO_DATE(CONCAT( '20', IBALD4),'yyyymmdd')\n        else NULL\n    end as IBALD4\n,    case\n        when L"
+"ENGTH(IBALD5)= 5 and  TO_DECIMAL(right(TO_VARCHAR(IBALD5), 2)) <> 0 then TO_DATE(CONCAT( '200', TO_VARCHAR(IBALD5)),'yyy"
+"ymmdd')\n        WHEN LENGTH(IBALD5)= 6 and  TO_DECIMAL(right(TO_VARCHAR(IBALD5), 2)) <> 0 then TO_DATE(CONCAT( '20', IB"
+"ALD5),'yyyymmdd')\n        else NULL\n    end as IBALD5\n,IBAVGC\n,IBQLRC\n,IBAVOH\n,IBAVRT\n,IBAVCS\n,IBOSCR\n,IBOS01\n"
+",IBOS02\n,IBOS03\n,IBOS04\n,IBOS05\n,IBOS06\n,IBOS07\n,IBOS08\n,IBDEPT\n,IBSDPT\n,IBCLAS\n,IBSCLS\n,    case\n        wh"
+"en LENGTH(IBFRDT)= 5 and  TO_DECIMAL(right(TO_VARCHAR(IBFRDT), 2)) <> 0 then TO_DATE(CONCAT( '200', TO_VARCHAR(IBFRDT)),"
+"'yyyymmdd')\n        WHEN LENGTH(IBFRDT)= 6 and  TO_DECIMAL(right(TO_VARCHAR(IBFRDT), 2)) <> 0 then TO_DATE(CONCAT( '20'"
+", IBFRDT),'yyyymmdd')\n        else NULL\n    end as IBFRDT\n,IBVNDR\n,IBSTYL\n,IBPOOQ\n,IBTOOQ\n,IBINTQ\n,IBMASU\n,IBMA"
+"SD\n,IBMASV\n,IBMASC\n,IBLAVC\n,IBARQT\n,IBNSQT\n,IBPHND\n,IBHLDQ\n,IBCRCD\n,DATELOADED\nfrom INVBAL\n\n");
 		                    
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
 		                    
 		                    props_tDBRow_3.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    
 		                    props_tDBRow_3.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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
 		                    "\nDrop table INVBAL\n\n");
 		                    
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
 		                    
 		                    props_tDBRow_4.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    
 		                    props_tDBRow_4.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tFileDelete_1Process(globalMap);



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
                            log4jParamters_tFileDelete_1.append("PATH" + " = " + "\"/data/talend/data_repository/INVBAL.zip\"");
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
	java.io.File path_tFileDelete_1=new java.io.File("/data/talend/data_repository/INVBAL.zip");
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
    globalMap.put("tFileDelete_1_DELETE_PATH","/data/talend/data_repository/INVBAL.zip");
 


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
        final INVENTORY_BALANCE_DATA_INVBAL INVENTORY_BALANCE_DATA_INVBALClass = new INVENTORY_BALANCE_DATA_INVBAL();

        int exitCode = INVENTORY_BALANCE_DATA_INVBALClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVBAL' - Done.");
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
			log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVBAL' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_5wetIAD8EeqgyP0IRwtTMg");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-30T12:54:47.036328500Z");

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
            java.io.InputStream inContext = INVENTORY_BALANCE_DATA_INVBAL.class.getClassLoader().getResourceAsStream("at_talend_jobs/inventory_balance_data_invbal_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = INVENTORY_BALANCE_DATA_INVBAL.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVBAL' - Started.");
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

try {
errorCode = null;tDBRow_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBRow_1) {
globalMap.put("tDBRow_1_SUBPROCESS_STATE", -1);

e_tDBRow_1.printStackTrace();

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : INVENTORY_BALANCE_DATA_INVBAL");
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
        log.info("TalendJob: 'INVENTORY_BALANCE_DATA_INVBAL' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     866392 characters generated by Talend Cloud Data Management Platform 
 *     on the June 30, 2023 at 8:54:47 AM EDT
 ************************************************************************************************/