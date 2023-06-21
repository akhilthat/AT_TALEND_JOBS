
package at_talend_jobs.inventory_history_file_invhsw_0_1;

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
 * Job: INVENTORY_HISTORY_FILE_INVHSW Purpose: INVENTORY_HISTORY_FILE_INVHSW<br>
 * Description: INVENTORY_HISTORY_FILE_INVHSW Truncate and Reload <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class INVENTORY_HISTORY_FILE_INVHSW implements TalendJob {
	static {System.setProperty("TalendJob.log", "INVENTORY_HISTORY_FILE_INVHSW.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(INVENTORY_HISTORY_FILE_INVHSW.class);
	

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
	private final String jobName = "INVENTORY_HISTORY_FILE_INVHSW";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_xXP68BFbEeqNPtu3HqiE1A", "0.1");
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
				INVENTORY_HISTORY_FILE_INVHSW.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(INVENTORY_HISTORY_FILE_INVHSW.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBInput_19_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_19_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_19_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_19_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_19_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
				tDBConnection_2Process(globalMap);



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
	

public void tDBConnection_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBConnection_2");
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
	 * [tDBConnection_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_2", false);
		start_Hash.put("tDBConnection_2", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_2";
	
	
		int tos_count_tDBConnection_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_2", "tDBConnection_1", "tSnowflakeConnection");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBConnection_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBConnection_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBConnection_2 = (String)(restRequest_tDBConnection_2 != null ? restRequest_tDBConnection_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBConnection_2 =
        new org.talend.components.snowflake.tsnowflakeconnection.TSnowflakeConnectionDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBConnection_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBConnection_2 = null;


org.talend.components.snowflake.SnowflakeConnectionProperties props_tDBConnection_2 =
        (org.talend.components.snowflake.SnowflakeConnectionProperties) def_tDBConnection_2.createRuntimeProperties();
 		                    props_tDBConnection_2.setValue("loginTimeout",
 		                    15);
 		                    
 		                    props_tDBConnection_2.setValue("account",
 		                    "vitaminshoppe");
 		                    
 		                    props_tDBConnection_2.setValue("regionID",
 		                    "us-east-1");
 		                    
 		                    props_tDBConnection_2.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBConnection_2.setValue("authenticationType",
 		                        org.talend.components.snowflake.tsnowflakeconnection.AuthenticationType.BASIC);
 		                    
 		                    props_tDBConnection_2.setValue("warehouse",
 		                    "vsi_wh_xs");
 		                    
 		                    props_tDBConnection_2.setValue("db",
 		                    "PROD_DATA");
 		                    
 		                    props_tDBConnection_2.setValue("schemaName",
 		                    "INVENTORY");
 		                    
 		                    props_tDBConnection_2.setValue("role",
 		                    "sysadmin");
 		                    
 		                    props_tDBConnection_2.setValue("jdbcParameters",
 		                    "");
 		                    
 		                    props_tDBConnection_2.setValue("autoCommit",
 		                    true);
 		                    
 		                    props_tDBConnection_2.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBConnection_2.userPassword.setValue("userId",
 		                    "Talend_user");
 		                    
 		                        props_tDBConnection_2.userPassword.setValue("password",
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:jFPqJ7qvtr86q+zDhTlgNy+3as3rFwZrXBM0LHtmMrFR3LMb"));
 		                        
 		                    props_tDBConnection_2.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBConnection_2.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBConnection_2 = props_tDBConnection_2.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBConnection_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBConnection_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBConnection_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBConnection_2.referencedComponent.setReference(referencedComponentProperties_tDBConnection_2);
        }
    }
globalMap.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBConnection_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBConnection_2= this.getClass().getResource("/xmlMappings");
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
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBConnection_2, topology_tDBConnection_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBConnection_2 = def_tDBConnection_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBConnection_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBConnection_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBConnection_2 = componentRuntime_tDBConnection_2.initialize(container_tDBConnection_2, props_tDBConnection_2);

if (initVr_tDBConnection_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBConnection_2.getMessage());
}

if(componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBConnection_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBConnection_2;
	compDriverInitialization_tDBConnection_2.runAtDriver(container_tDBConnection_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBConnection_2 = null;
if(componentRuntime_tDBConnection_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBConnection_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBConnection_2;
	if (doesNodeBelongToRequest_tDBConnection_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBConnection_2 = sourceOrSink_tDBConnection_2.validate(container_tDBConnection_2);
        if (vr_tDBConnection_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
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

	

	
	
	currentComponent="tDBConnection_2";
	
	


 


	tos_count_tDBConnection_2++;

/**
 * [tDBConnection_2 main ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	


 



/**
 * [tDBConnection_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	


 



/**
 * [tDBConnection_2 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_2 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
// end of generic

 

ok_Hash.put("tDBConnection_2", true);
end_Hash.put("tDBConnection_2", System.currentTimeMillis());




/**
 * [tDBConnection_2 end ] stop
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
	 * [tDBConnection_2 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_2";
	
	
// finally of generic

 



/**
 * [tDBConnection_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_2_SUBPROCESS_STATE", 1);
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
	


public static class row19Struct implements routines.system.IPersistableRow<row19Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[0];

	
			    public BigDecimal IWCENT;

				public BigDecimal getIWCENT () {
					return this.IWCENT;
				}

				public Boolean IWCENTIsNullable(){
				    return true;
				}
				public Boolean IWCENTIsKey(){
				    return false;
				}
				public Integer IWCENTLength(){
				    return null;
				}
				public Integer IWCENTPrecision(){
				    return null;
				}
				public String IWCENTDefault(){
				
					return "";
				
				}
				public String IWCENTComment(){
				
				    return "";
				
				}
				public String IWCENTPattern(){
				
					return "";
				
				}
				public String IWCENTOriginalDbColumnName(){
				
					return "IWCENT";
				
				}

				
			    public BigDecimal IWYEAR;

				public BigDecimal getIWYEAR () {
					return this.IWYEAR;
				}

				public Boolean IWYEARIsNullable(){
				    return true;
				}
				public Boolean IWYEARIsKey(){
				    return false;
				}
				public Integer IWYEARLength(){
				    return null;
				}
				public Integer IWYEARPrecision(){
				    return null;
				}
				public String IWYEARDefault(){
				
					return "";
				
				}
				public String IWYEARComment(){
				
				    return "";
				
				}
				public String IWYEARPattern(){
				
					return "";
				
				}
				public String IWYEAROriginalDbColumnName(){
				
					return "IWYEAR";
				
				}

				
			    public BigDecimal IWVNDR;

				public BigDecimal getIWVNDR () {
					return this.IWVNDR;
				}

				public Boolean IWVNDRIsNullable(){
				    return true;
				}
				public Boolean IWVNDRIsKey(){
				    return false;
				}
				public Integer IWVNDRLength(){
				    return null;
				}
				public Integer IWVNDRPrecision(){
				    return null;
				}
				public String IWVNDRDefault(){
				
					return "";
				
				}
				public String IWVNDRComment(){
				
				    return "";
				
				}
				public String IWVNDRPattern(){
				
					return "";
				
				}
				public String IWVNDROriginalDbColumnName(){
				
					return "IWVNDR";
				
				}

				
			    public String IWSTYL;

				public String getIWSTYL () {
					return this.IWSTYL;
				}

				public Boolean IWSTYLIsNullable(){
				    return true;
				}
				public Boolean IWSTYLIsKey(){
				    return false;
				}
				public Integer IWSTYLLength(){
				    return null;
				}
				public Integer IWSTYLPrecision(){
				    return null;
				}
				public String IWSTYLDefault(){
				
					return null;
				
				}
				public String IWSTYLComment(){
				
				    return "";
				
				}
				public String IWSTYLPattern(){
				
					return "";
				
				}
				public String IWSTYLOriginalDbColumnName(){
				
					return "IWSTYL";
				
				}

				
			    public BigDecimal IWSKU;

				public BigDecimal getIWSKU () {
					return this.IWSKU;
				}

				public Boolean IWSKUIsNullable(){
				    return true;
				}
				public Boolean IWSKUIsKey(){
				    return false;
				}
				public Integer IWSKULength(){
				    return null;
				}
				public Integer IWSKUPrecision(){
				    return null;
				}
				public String IWSKUDefault(){
				
					return "";
				
				}
				public String IWSKUComment(){
				
				    return "";
				
				}
				public String IWSKUPattern(){
				
					return "";
				
				}
				public String IWSKUOriginalDbColumnName(){
				
					return "IWSKU";
				
				}

				
			    public BigDecimal IWSTR;

				public BigDecimal getIWSTR () {
					return this.IWSTR;
				}

				public Boolean IWSTRIsNullable(){
				    return true;
				}
				public Boolean IWSTRIsKey(){
				    return false;
				}
				public Integer IWSTRLength(){
				    return null;
				}
				public Integer IWSTRPrecision(){
				    return null;
				}
				public String IWSTRDefault(){
				
					return "";
				
				}
				public String IWSTRComment(){
				
				    return "";
				
				}
				public String IWSTRPattern(){
				
					return "";
				
				}
				public String IWSTROriginalDbColumnName(){
				
					return "IWSTR";
				
				}

				
			    public BigDecimal IWHTYP;

				public BigDecimal getIWHTYP () {
					return this.IWHTYP;
				}

				public Boolean IWHTYPIsNullable(){
				    return true;
				}
				public Boolean IWHTYPIsKey(){
				    return false;
				}
				public Integer IWHTYPLength(){
				    return null;
				}
				public Integer IWHTYPPrecision(){
				    return null;
				}
				public String IWHTYPDefault(){
				
					return "";
				
				}
				public String IWHTYPComment(){
				
				    return "";
				
				}
				public String IWHTYPPattern(){
				
					return "";
				
				}
				public String IWHTYPOriginalDbColumnName(){
				
					return "IWHTYP";
				
				}

				
			    public BigDecimal IWQT01;

				public BigDecimal getIWQT01 () {
					return this.IWQT01;
				}

				public Boolean IWQT01IsNullable(){
				    return true;
				}
				public Boolean IWQT01IsKey(){
				    return false;
				}
				public Integer IWQT01Length(){
				    return null;
				}
				public Integer IWQT01Precision(){
				    return null;
				}
				public String IWQT01Default(){
				
					return "";
				
				}
				public String IWQT01Comment(){
				
				    return "";
				
				}
				public String IWQT01Pattern(){
				
					return "";
				
				}
				public String IWQT01OriginalDbColumnName(){
				
					return "IWQT01";
				
				}

				
			    public BigDecimal IWQT02;

				public BigDecimal getIWQT02 () {
					return this.IWQT02;
				}

				public Boolean IWQT02IsNullable(){
				    return true;
				}
				public Boolean IWQT02IsKey(){
				    return false;
				}
				public Integer IWQT02Length(){
				    return null;
				}
				public Integer IWQT02Precision(){
				    return null;
				}
				public String IWQT02Default(){
				
					return "";
				
				}
				public String IWQT02Comment(){
				
				    return "";
				
				}
				public String IWQT02Pattern(){
				
					return "";
				
				}
				public String IWQT02OriginalDbColumnName(){
				
					return "IWQT02";
				
				}

				
			    public BigDecimal IWQT03;

				public BigDecimal getIWQT03 () {
					return this.IWQT03;
				}

				public Boolean IWQT03IsNullable(){
				    return true;
				}
				public Boolean IWQT03IsKey(){
				    return false;
				}
				public Integer IWQT03Length(){
				    return null;
				}
				public Integer IWQT03Precision(){
				    return null;
				}
				public String IWQT03Default(){
				
					return "";
				
				}
				public String IWQT03Comment(){
				
				    return "";
				
				}
				public String IWQT03Pattern(){
				
					return "";
				
				}
				public String IWQT03OriginalDbColumnName(){
				
					return "IWQT03";
				
				}

				
			    public BigDecimal IWQT04;

				public BigDecimal getIWQT04 () {
					return this.IWQT04;
				}

				public Boolean IWQT04IsNullable(){
				    return true;
				}
				public Boolean IWQT04IsKey(){
				    return false;
				}
				public Integer IWQT04Length(){
				    return null;
				}
				public Integer IWQT04Precision(){
				    return null;
				}
				public String IWQT04Default(){
				
					return "";
				
				}
				public String IWQT04Comment(){
				
				    return "";
				
				}
				public String IWQT04Pattern(){
				
					return "";
				
				}
				public String IWQT04OriginalDbColumnName(){
				
					return "IWQT04";
				
				}

				
			    public BigDecimal IWQT05;

				public BigDecimal getIWQT05 () {
					return this.IWQT05;
				}

				public Boolean IWQT05IsNullable(){
				    return true;
				}
				public Boolean IWQT05IsKey(){
				    return false;
				}
				public Integer IWQT05Length(){
				    return null;
				}
				public Integer IWQT05Precision(){
				    return null;
				}
				public String IWQT05Default(){
				
					return "";
				
				}
				public String IWQT05Comment(){
				
				    return "";
				
				}
				public String IWQT05Pattern(){
				
					return "";
				
				}
				public String IWQT05OriginalDbColumnName(){
				
					return "IWQT05";
				
				}

				
			    public BigDecimal IWQT06;

				public BigDecimal getIWQT06 () {
					return this.IWQT06;
				}

				public Boolean IWQT06IsNullable(){
				    return true;
				}
				public Boolean IWQT06IsKey(){
				    return false;
				}
				public Integer IWQT06Length(){
				    return null;
				}
				public Integer IWQT06Precision(){
				    return null;
				}
				public String IWQT06Default(){
				
					return "";
				
				}
				public String IWQT06Comment(){
				
				    return "";
				
				}
				public String IWQT06Pattern(){
				
					return "";
				
				}
				public String IWQT06OriginalDbColumnName(){
				
					return "IWQT06";
				
				}

				
			    public BigDecimal IWQT07;

				public BigDecimal getIWQT07 () {
					return this.IWQT07;
				}

				public Boolean IWQT07IsNullable(){
				    return true;
				}
				public Boolean IWQT07IsKey(){
				    return false;
				}
				public Integer IWQT07Length(){
				    return null;
				}
				public Integer IWQT07Precision(){
				    return null;
				}
				public String IWQT07Default(){
				
					return "";
				
				}
				public String IWQT07Comment(){
				
				    return "";
				
				}
				public String IWQT07Pattern(){
				
					return "";
				
				}
				public String IWQT07OriginalDbColumnName(){
				
					return "IWQT07";
				
				}

				
			    public BigDecimal IWQT08;

				public BigDecimal getIWQT08 () {
					return this.IWQT08;
				}

				public Boolean IWQT08IsNullable(){
				    return true;
				}
				public Boolean IWQT08IsKey(){
				    return false;
				}
				public Integer IWQT08Length(){
				    return null;
				}
				public Integer IWQT08Precision(){
				    return null;
				}
				public String IWQT08Default(){
				
					return "";
				
				}
				public String IWQT08Comment(){
				
				    return "";
				
				}
				public String IWQT08Pattern(){
				
					return "";
				
				}
				public String IWQT08OriginalDbColumnName(){
				
					return "IWQT08";
				
				}

				
			    public BigDecimal IWQT09;

				public BigDecimal getIWQT09 () {
					return this.IWQT09;
				}

				public Boolean IWQT09IsNullable(){
				    return true;
				}
				public Boolean IWQT09IsKey(){
				    return false;
				}
				public Integer IWQT09Length(){
				    return null;
				}
				public Integer IWQT09Precision(){
				    return null;
				}
				public String IWQT09Default(){
				
					return "";
				
				}
				public String IWQT09Comment(){
				
				    return "";
				
				}
				public String IWQT09Pattern(){
				
					return "";
				
				}
				public String IWQT09OriginalDbColumnName(){
				
					return "IWQT09";
				
				}

				
			    public BigDecimal IWQT10;

				public BigDecimal getIWQT10 () {
					return this.IWQT10;
				}

				public Boolean IWQT10IsNullable(){
				    return true;
				}
				public Boolean IWQT10IsKey(){
				    return false;
				}
				public Integer IWQT10Length(){
				    return null;
				}
				public Integer IWQT10Precision(){
				    return null;
				}
				public String IWQT10Default(){
				
					return "";
				
				}
				public String IWQT10Comment(){
				
				    return "";
				
				}
				public String IWQT10Pattern(){
				
					return "";
				
				}
				public String IWQT10OriginalDbColumnName(){
				
					return "IWQT10";
				
				}

				
			    public BigDecimal IWQT11;

				public BigDecimal getIWQT11 () {
					return this.IWQT11;
				}

				public Boolean IWQT11IsNullable(){
				    return true;
				}
				public Boolean IWQT11IsKey(){
				    return false;
				}
				public Integer IWQT11Length(){
				    return null;
				}
				public Integer IWQT11Precision(){
				    return null;
				}
				public String IWQT11Default(){
				
					return "";
				
				}
				public String IWQT11Comment(){
				
				    return "";
				
				}
				public String IWQT11Pattern(){
				
					return "";
				
				}
				public String IWQT11OriginalDbColumnName(){
				
					return "IWQT11";
				
				}

				
			    public BigDecimal IWQT12;

				public BigDecimal getIWQT12 () {
					return this.IWQT12;
				}

				public Boolean IWQT12IsNullable(){
				    return true;
				}
				public Boolean IWQT12IsKey(){
				    return false;
				}
				public Integer IWQT12Length(){
				    return null;
				}
				public Integer IWQT12Precision(){
				    return null;
				}
				public String IWQT12Default(){
				
					return "";
				
				}
				public String IWQT12Comment(){
				
				    return "";
				
				}
				public String IWQT12Pattern(){
				
					return "";
				
				}
				public String IWQT12OriginalDbColumnName(){
				
					return "IWQT12";
				
				}

				
			    public BigDecimal IWQT13;

				public BigDecimal getIWQT13 () {
					return this.IWQT13;
				}

				public Boolean IWQT13IsNullable(){
				    return true;
				}
				public Boolean IWQT13IsKey(){
				    return false;
				}
				public Integer IWQT13Length(){
				    return null;
				}
				public Integer IWQT13Precision(){
				    return null;
				}
				public String IWQT13Default(){
				
					return "";
				
				}
				public String IWQT13Comment(){
				
				    return "";
				
				}
				public String IWQT13Pattern(){
				
					return "";
				
				}
				public String IWQT13OriginalDbColumnName(){
				
					return "IWQT13";
				
				}

				
			    public BigDecimal IWQT14;

				public BigDecimal getIWQT14 () {
					return this.IWQT14;
				}

				public Boolean IWQT14IsNullable(){
				    return true;
				}
				public Boolean IWQT14IsKey(){
				    return false;
				}
				public Integer IWQT14Length(){
				    return null;
				}
				public Integer IWQT14Precision(){
				    return null;
				}
				public String IWQT14Default(){
				
					return "";
				
				}
				public String IWQT14Comment(){
				
				    return "";
				
				}
				public String IWQT14Pattern(){
				
					return "";
				
				}
				public String IWQT14OriginalDbColumnName(){
				
					return "IWQT14";
				
				}

				
			    public BigDecimal IWQT15;

				public BigDecimal getIWQT15 () {
					return this.IWQT15;
				}

				public Boolean IWQT15IsNullable(){
				    return true;
				}
				public Boolean IWQT15IsKey(){
				    return false;
				}
				public Integer IWQT15Length(){
				    return null;
				}
				public Integer IWQT15Precision(){
				    return null;
				}
				public String IWQT15Default(){
				
					return "";
				
				}
				public String IWQT15Comment(){
				
				    return "";
				
				}
				public String IWQT15Pattern(){
				
					return "";
				
				}
				public String IWQT15OriginalDbColumnName(){
				
					return "IWQT15";
				
				}

				
			    public BigDecimal IWQT16;

				public BigDecimal getIWQT16 () {
					return this.IWQT16;
				}

				public Boolean IWQT16IsNullable(){
				    return true;
				}
				public Boolean IWQT16IsKey(){
				    return false;
				}
				public Integer IWQT16Length(){
				    return null;
				}
				public Integer IWQT16Precision(){
				    return null;
				}
				public String IWQT16Default(){
				
					return "";
				
				}
				public String IWQT16Comment(){
				
				    return "";
				
				}
				public String IWQT16Pattern(){
				
					return "";
				
				}
				public String IWQT16OriginalDbColumnName(){
				
					return "IWQT16";
				
				}

				
			    public BigDecimal IWQT17;

				public BigDecimal getIWQT17 () {
					return this.IWQT17;
				}

				public Boolean IWQT17IsNullable(){
				    return true;
				}
				public Boolean IWQT17IsKey(){
				    return false;
				}
				public Integer IWQT17Length(){
				    return null;
				}
				public Integer IWQT17Precision(){
				    return null;
				}
				public String IWQT17Default(){
				
					return "";
				
				}
				public String IWQT17Comment(){
				
				    return "";
				
				}
				public String IWQT17Pattern(){
				
					return "";
				
				}
				public String IWQT17OriginalDbColumnName(){
				
					return "IWQT17";
				
				}

				
			    public BigDecimal IWQT18;

				public BigDecimal getIWQT18 () {
					return this.IWQT18;
				}

				public Boolean IWQT18IsNullable(){
				    return true;
				}
				public Boolean IWQT18IsKey(){
				    return false;
				}
				public Integer IWQT18Length(){
				    return null;
				}
				public Integer IWQT18Precision(){
				    return null;
				}
				public String IWQT18Default(){
				
					return "";
				
				}
				public String IWQT18Comment(){
				
				    return "";
				
				}
				public String IWQT18Pattern(){
				
					return "";
				
				}
				public String IWQT18OriginalDbColumnName(){
				
					return "IWQT18";
				
				}

				
			    public BigDecimal IWQT19;

				public BigDecimal getIWQT19 () {
					return this.IWQT19;
				}

				public Boolean IWQT19IsNullable(){
				    return true;
				}
				public Boolean IWQT19IsKey(){
				    return false;
				}
				public Integer IWQT19Length(){
				    return null;
				}
				public Integer IWQT19Precision(){
				    return null;
				}
				public String IWQT19Default(){
				
					return "";
				
				}
				public String IWQT19Comment(){
				
				    return "";
				
				}
				public String IWQT19Pattern(){
				
					return "";
				
				}
				public String IWQT19OriginalDbColumnName(){
				
					return "IWQT19";
				
				}

				
			    public BigDecimal IWQT20;

				public BigDecimal getIWQT20 () {
					return this.IWQT20;
				}

				public Boolean IWQT20IsNullable(){
				    return true;
				}
				public Boolean IWQT20IsKey(){
				    return false;
				}
				public Integer IWQT20Length(){
				    return null;
				}
				public Integer IWQT20Precision(){
				    return null;
				}
				public String IWQT20Default(){
				
					return "";
				
				}
				public String IWQT20Comment(){
				
				    return "";
				
				}
				public String IWQT20Pattern(){
				
					return "";
				
				}
				public String IWQT20OriginalDbColumnName(){
				
					return "IWQT20";
				
				}

				
			    public BigDecimal IWQT21;

				public BigDecimal getIWQT21 () {
					return this.IWQT21;
				}

				public Boolean IWQT21IsNullable(){
				    return true;
				}
				public Boolean IWQT21IsKey(){
				    return false;
				}
				public Integer IWQT21Length(){
				    return null;
				}
				public Integer IWQT21Precision(){
				    return null;
				}
				public String IWQT21Default(){
				
					return "";
				
				}
				public String IWQT21Comment(){
				
				    return "";
				
				}
				public String IWQT21Pattern(){
				
					return "";
				
				}
				public String IWQT21OriginalDbColumnName(){
				
					return "IWQT21";
				
				}

				
			    public BigDecimal IWQT22;

				public BigDecimal getIWQT22 () {
					return this.IWQT22;
				}

				public Boolean IWQT22IsNullable(){
				    return true;
				}
				public Boolean IWQT22IsKey(){
				    return false;
				}
				public Integer IWQT22Length(){
				    return null;
				}
				public Integer IWQT22Precision(){
				    return null;
				}
				public String IWQT22Default(){
				
					return "";
				
				}
				public String IWQT22Comment(){
				
				    return "";
				
				}
				public String IWQT22Pattern(){
				
					return "";
				
				}
				public String IWQT22OriginalDbColumnName(){
				
					return "IWQT22";
				
				}

				
			    public BigDecimal IWQT23;

				public BigDecimal getIWQT23 () {
					return this.IWQT23;
				}

				public Boolean IWQT23IsNullable(){
				    return true;
				}
				public Boolean IWQT23IsKey(){
				    return false;
				}
				public Integer IWQT23Length(){
				    return null;
				}
				public Integer IWQT23Precision(){
				    return null;
				}
				public String IWQT23Default(){
				
					return "";
				
				}
				public String IWQT23Comment(){
				
				    return "";
				
				}
				public String IWQT23Pattern(){
				
					return "";
				
				}
				public String IWQT23OriginalDbColumnName(){
				
					return "IWQT23";
				
				}

				
			    public BigDecimal IWQT24;

				public BigDecimal getIWQT24 () {
					return this.IWQT24;
				}

				public Boolean IWQT24IsNullable(){
				    return true;
				}
				public Boolean IWQT24IsKey(){
				    return false;
				}
				public Integer IWQT24Length(){
				    return null;
				}
				public Integer IWQT24Precision(){
				    return null;
				}
				public String IWQT24Default(){
				
					return "";
				
				}
				public String IWQT24Comment(){
				
				    return "";
				
				}
				public String IWQT24Pattern(){
				
					return "";
				
				}
				public String IWQT24OriginalDbColumnName(){
				
					return "IWQT24";
				
				}

				
			    public BigDecimal IWQT25;

				public BigDecimal getIWQT25 () {
					return this.IWQT25;
				}

				public Boolean IWQT25IsNullable(){
				    return true;
				}
				public Boolean IWQT25IsKey(){
				    return false;
				}
				public Integer IWQT25Length(){
				    return null;
				}
				public Integer IWQT25Precision(){
				    return null;
				}
				public String IWQT25Default(){
				
					return "";
				
				}
				public String IWQT25Comment(){
				
				    return "";
				
				}
				public String IWQT25Pattern(){
				
					return "";
				
				}
				public String IWQT25OriginalDbColumnName(){
				
					return "IWQT25";
				
				}

				
			    public BigDecimal IWQT26;

				public BigDecimal getIWQT26 () {
					return this.IWQT26;
				}

				public Boolean IWQT26IsNullable(){
				    return true;
				}
				public Boolean IWQT26IsKey(){
				    return false;
				}
				public Integer IWQT26Length(){
				    return null;
				}
				public Integer IWQT26Precision(){
				    return null;
				}
				public String IWQT26Default(){
				
					return "";
				
				}
				public String IWQT26Comment(){
				
				    return "";
				
				}
				public String IWQT26Pattern(){
				
					return "";
				
				}
				public String IWQT26OriginalDbColumnName(){
				
					return "IWQT26";
				
				}

				
			    public BigDecimal IWQT27;

				public BigDecimal getIWQT27 () {
					return this.IWQT27;
				}

				public Boolean IWQT27IsNullable(){
				    return true;
				}
				public Boolean IWQT27IsKey(){
				    return false;
				}
				public Integer IWQT27Length(){
				    return null;
				}
				public Integer IWQT27Precision(){
				    return null;
				}
				public String IWQT27Default(){
				
					return "";
				
				}
				public String IWQT27Comment(){
				
				    return "";
				
				}
				public String IWQT27Pattern(){
				
					return "";
				
				}
				public String IWQT27OriginalDbColumnName(){
				
					return "IWQT27";
				
				}

				
			    public BigDecimal IWQT28;

				public BigDecimal getIWQT28 () {
					return this.IWQT28;
				}

				public Boolean IWQT28IsNullable(){
				    return true;
				}
				public Boolean IWQT28IsKey(){
				    return false;
				}
				public Integer IWQT28Length(){
				    return null;
				}
				public Integer IWQT28Precision(){
				    return null;
				}
				public String IWQT28Default(){
				
					return "";
				
				}
				public String IWQT28Comment(){
				
				    return "";
				
				}
				public String IWQT28Pattern(){
				
					return "";
				
				}
				public String IWQT28OriginalDbColumnName(){
				
					return "IWQT28";
				
				}

				
			    public BigDecimal IWQT29;

				public BigDecimal getIWQT29 () {
					return this.IWQT29;
				}

				public Boolean IWQT29IsNullable(){
				    return true;
				}
				public Boolean IWQT29IsKey(){
				    return false;
				}
				public Integer IWQT29Length(){
				    return null;
				}
				public Integer IWQT29Precision(){
				    return null;
				}
				public String IWQT29Default(){
				
					return "";
				
				}
				public String IWQT29Comment(){
				
				    return "";
				
				}
				public String IWQT29Pattern(){
				
					return "";
				
				}
				public String IWQT29OriginalDbColumnName(){
				
					return "IWQT29";
				
				}

				
			    public BigDecimal IWQT30;

				public BigDecimal getIWQT30 () {
					return this.IWQT30;
				}

				public Boolean IWQT30IsNullable(){
				    return true;
				}
				public Boolean IWQT30IsKey(){
				    return false;
				}
				public Integer IWQT30Length(){
				    return null;
				}
				public Integer IWQT30Precision(){
				    return null;
				}
				public String IWQT30Default(){
				
					return "";
				
				}
				public String IWQT30Comment(){
				
				    return "";
				
				}
				public String IWQT30Pattern(){
				
					return "";
				
				}
				public String IWQT30OriginalDbColumnName(){
				
					return "IWQT30";
				
				}

				
			    public BigDecimal IWQT31;

				public BigDecimal getIWQT31 () {
					return this.IWQT31;
				}

				public Boolean IWQT31IsNullable(){
				    return true;
				}
				public Boolean IWQT31IsKey(){
				    return false;
				}
				public Integer IWQT31Length(){
				    return null;
				}
				public Integer IWQT31Precision(){
				    return null;
				}
				public String IWQT31Default(){
				
					return "";
				
				}
				public String IWQT31Comment(){
				
				    return "";
				
				}
				public String IWQT31Pattern(){
				
					return "";
				
				}
				public String IWQT31OriginalDbColumnName(){
				
					return "IWQT31";
				
				}

				
			    public BigDecimal IWQT32;

				public BigDecimal getIWQT32 () {
					return this.IWQT32;
				}

				public Boolean IWQT32IsNullable(){
				    return true;
				}
				public Boolean IWQT32IsKey(){
				    return false;
				}
				public Integer IWQT32Length(){
				    return null;
				}
				public Integer IWQT32Precision(){
				    return null;
				}
				public String IWQT32Default(){
				
					return "";
				
				}
				public String IWQT32Comment(){
				
				    return "";
				
				}
				public String IWQT32Pattern(){
				
					return "";
				
				}
				public String IWQT32OriginalDbColumnName(){
				
					return "IWQT32";
				
				}

				
			    public BigDecimal IWQT33;

				public BigDecimal getIWQT33 () {
					return this.IWQT33;
				}

				public Boolean IWQT33IsNullable(){
				    return true;
				}
				public Boolean IWQT33IsKey(){
				    return false;
				}
				public Integer IWQT33Length(){
				    return null;
				}
				public Integer IWQT33Precision(){
				    return null;
				}
				public String IWQT33Default(){
				
					return "";
				
				}
				public String IWQT33Comment(){
				
				    return "";
				
				}
				public String IWQT33Pattern(){
				
					return "";
				
				}
				public String IWQT33OriginalDbColumnName(){
				
					return "IWQT33";
				
				}

				
			    public BigDecimal IWQT34;

				public BigDecimal getIWQT34 () {
					return this.IWQT34;
				}

				public Boolean IWQT34IsNullable(){
				    return true;
				}
				public Boolean IWQT34IsKey(){
				    return false;
				}
				public Integer IWQT34Length(){
				    return null;
				}
				public Integer IWQT34Precision(){
				    return null;
				}
				public String IWQT34Default(){
				
					return "";
				
				}
				public String IWQT34Comment(){
				
				    return "";
				
				}
				public String IWQT34Pattern(){
				
					return "";
				
				}
				public String IWQT34OriginalDbColumnName(){
				
					return "IWQT34";
				
				}

				
			    public BigDecimal IWQT35;

				public BigDecimal getIWQT35 () {
					return this.IWQT35;
				}

				public Boolean IWQT35IsNullable(){
				    return true;
				}
				public Boolean IWQT35IsKey(){
				    return false;
				}
				public Integer IWQT35Length(){
				    return null;
				}
				public Integer IWQT35Precision(){
				    return null;
				}
				public String IWQT35Default(){
				
					return "";
				
				}
				public String IWQT35Comment(){
				
				    return "";
				
				}
				public String IWQT35Pattern(){
				
					return "";
				
				}
				public String IWQT35OriginalDbColumnName(){
				
					return "IWQT35";
				
				}

				
			    public BigDecimal IWQT36;

				public BigDecimal getIWQT36 () {
					return this.IWQT36;
				}

				public Boolean IWQT36IsNullable(){
				    return true;
				}
				public Boolean IWQT36IsKey(){
				    return false;
				}
				public Integer IWQT36Length(){
				    return null;
				}
				public Integer IWQT36Precision(){
				    return null;
				}
				public String IWQT36Default(){
				
					return "";
				
				}
				public String IWQT36Comment(){
				
				    return "";
				
				}
				public String IWQT36Pattern(){
				
					return "";
				
				}
				public String IWQT36OriginalDbColumnName(){
				
					return "IWQT36";
				
				}

				
			    public BigDecimal IWQT37;

				public BigDecimal getIWQT37 () {
					return this.IWQT37;
				}

				public Boolean IWQT37IsNullable(){
				    return true;
				}
				public Boolean IWQT37IsKey(){
				    return false;
				}
				public Integer IWQT37Length(){
				    return null;
				}
				public Integer IWQT37Precision(){
				    return null;
				}
				public String IWQT37Default(){
				
					return "";
				
				}
				public String IWQT37Comment(){
				
				    return "";
				
				}
				public String IWQT37Pattern(){
				
					return "";
				
				}
				public String IWQT37OriginalDbColumnName(){
				
					return "IWQT37";
				
				}

				
			    public BigDecimal IWQT38;

				public BigDecimal getIWQT38 () {
					return this.IWQT38;
				}

				public Boolean IWQT38IsNullable(){
				    return true;
				}
				public Boolean IWQT38IsKey(){
				    return false;
				}
				public Integer IWQT38Length(){
				    return null;
				}
				public Integer IWQT38Precision(){
				    return null;
				}
				public String IWQT38Default(){
				
					return "";
				
				}
				public String IWQT38Comment(){
				
				    return "";
				
				}
				public String IWQT38Pattern(){
				
					return "";
				
				}
				public String IWQT38OriginalDbColumnName(){
				
					return "IWQT38";
				
				}

				
			    public BigDecimal IWQT39;

				public BigDecimal getIWQT39 () {
					return this.IWQT39;
				}

				public Boolean IWQT39IsNullable(){
				    return true;
				}
				public Boolean IWQT39IsKey(){
				    return false;
				}
				public Integer IWQT39Length(){
				    return null;
				}
				public Integer IWQT39Precision(){
				    return null;
				}
				public String IWQT39Default(){
				
					return "";
				
				}
				public String IWQT39Comment(){
				
				    return "";
				
				}
				public String IWQT39Pattern(){
				
					return "";
				
				}
				public String IWQT39OriginalDbColumnName(){
				
					return "IWQT39";
				
				}

				
			    public BigDecimal IWQT40;

				public BigDecimal getIWQT40 () {
					return this.IWQT40;
				}

				public Boolean IWQT40IsNullable(){
				    return true;
				}
				public Boolean IWQT40IsKey(){
				    return false;
				}
				public Integer IWQT40Length(){
				    return null;
				}
				public Integer IWQT40Precision(){
				    return null;
				}
				public String IWQT40Default(){
				
					return "";
				
				}
				public String IWQT40Comment(){
				
				    return "";
				
				}
				public String IWQT40Pattern(){
				
					return "";
				
				}
				public String IWQT40OriginalDbColumnName(){
				
					return "IWQT40";
				
				}

				
			    public BigDecimal IWQT41;

				public BigDecimal getIWQT41 () {
					return this.IWQT41;
				}

				public Boolean IWQT41IsNullable(){
				    return true;
				}
				public Boolean IWQT41IsKey(){
				    return false;
				}
				public Integer IWQT41Length(){
				    return null;
				}
				public Integer IWQT41Precision(){
				    return null;
				}
				public String IWQT41Default(){
				
					return "";
				
				}
				public String IWQT41Comment(){
				
				    return "";
				
				}
				public String IWQT41Pattern(){
				
					return "";
				
				}
				public String IWQT41OriginalDbColumnName(){
				
					return "IWQT41";
				
				}

				
			    public BigDecimal IWQT42;

				public BigDecimal getIWQT42 () {
					return this.IWQT42;
				}

				public Boolean IWQT42IsNullable(){
				    return true;
				}
				public Boolean IWQT42IsKey(){
				    return false;
				}
				public Integer IWQT42Length(){
				    return null;
				}
				public Integer IWQT42Precision(){
				    return null;
				}
				public String IWQT42Default(){
				
					return "";
				
				}
				public String IWQT42Comment(){
				
				    return "";
				
				}
				public String IWQT42Pattern(){
				
					return "";
				
				}
				public String IWQT42OriginalDbColumnName(){
				
					return "IWQT42";
				
				}

				
			    public BigDecimal IWQT43;

				public BigDecimal getIWQT43 () {
					return this.IWQT43;
				}

				public Boolean IWQT43IsNullable(){
				    return true;
				}
				public Boolean IWQT43IsKey(){
				    return false;
				}
				public Integer IWQT43Length(){
				    return null;
				}
				public Integer IWQT43Precision(){
				    return null;
				}
				public String IWQT43Default(){
				
					return "";
				
				}
				public String IWQT43Comment(){
				
				    return "";
				
				}
				public String IWQT43Pattern(){
				
					return "";
				
				}
				public String IWQT43OriginalDbColumnName(){
				
					return "IWQT43";
				
				}

				
			    public BigDecimal IWQT44;

				public BigDecimal getIWQT44 () {
					return this.IWQT44;
				}

				public Boolean IWQT44IsNullable(){
				    return true;
				}
				public Boolean IWQT44IsKey(){
				    return false;
				}
				public Integer IWQT44Length(){
				    return null;
				}
				public Integer IWQT44Precision(){
				    return null;
				}
				public String IWQT44Default(){
				
					return "";
				
				}
				public String IWQT44Comment(){
				
				    return "";
				
				}
				public String IWQT44Pattern(){
				
					return "";
				
				}
				public String IWQT44OriginalDbColumnName(){
				
					return "IWQT44";
				
				}

				
			    public BigDecimal IWQT45;

				public BigDecimal getIWQT45 () {
					return this.IWQT45;
				}

				public Boolean IWQT45IsNullable(){
				    return true;
				}
				public Boolean IWQT45IsKey(){
				    return false;
				}
				public Integer IWQT45Length(){
				    return null;
				}
				public Integer IWQT45Precision(){
				    return null;
				}
				public String IWQT45Default(){
				
					return "";
				
				}
				public String IWQT45Comment(){
				
				    return "";
				
				}
				public String IWQT45Pattern(){
				
					return "";
				
				}
				public String IWQT45OriginalDbColumnName(){
				
					return "IWQT45";
				
				}

				
			    public BigDecimal IWQT46;

				public BigDecimal getIWQT46 () {
					return this.IWQT46;
				}

				public Boolean IWQT46IsNullable(){
				    return true;
				}
				public Boolean IWQT46IsKey(){
				    return false;
				}
				public Integer IWQT46Length(){
				    return null;
				}
				public Integer IWQT46Precision(){
				    return null;
				}
				public String IWQT46Default(){
				
					return "";
				
				}
				public String IWQT46Comment(){
				
				    return "";
				
				}
				public String IWQT46Pattern(){
				
					return "";
				
				}
				public String IWQT46OriginalDbColumnName(){
				
					return "IWQT46";
				
				}

				
			    public BigDecimal IWQT47;

				public BigDecimal getIWQT47 () {
					return this.IWQT47;
				}

				public Boolean IWQT47IsNullable(){
				    return true;
				}
				public Boolean IWQT47IsKey(){
				    return false;
				}
				public Integer IWQT47Length(){
				    return null;
				}
				public Integer IWQT47Precision(){
				    return null;
				}
				public String IWQT47Default(){
				
					return "";
				
				}
				public String IWQT47Comment(){
				
				    return "";
				
				}
				public String IWQT47Pattern(){
				
					return "";
				
				}
				public String IWQT47OriginalDbColumnName(){
				
					return "IWQT47";
				
				}

				
			    public BigDecimal IWQT48;

				public BigDecimal getIWQT48 () {
					return this.IWQT48;
				}

				public Boolean IWQT48IsNullable(){
				    return true;
				}
				public Boolean IWQT48IsKey(){
				    return false;
				}
				public Integer IWQT48Length(){
				    return null;
				}
				public Integer IWQT48Precision(){
				    return null;
				}
				public String IWQT48Default(){
				
					return "";
				
				}
				public String IWQT48Comment(){
				
				    return "";
				
				}
				public String IWQT48Pattern(){
				
					return "";
				
				}
				public String IWQT48OriginalDbColumnName(){
				
					return "IWQT48";
				
				}

				
			    public BigDecimal IWQT49;

				public BigDecimal getIWQT49 () {
					return this.IWQT49;
				}

				public Boolean IWQT49IsNullable(){
				    return true;
				}
				public Boolean IWQT49IsKey(){
				    return false;
				}
				public Integer IWQT49Length(){
				    return null;
				}
				public Integer IWQT49Precision(){
				    return null;
				}
				public String IWQT49Default(){
				
					return "";
				
				}
				public String IWQT49Comment(){
				
				    return "";
				
				}
				public String IWQT49Pattern(){
				
					return "";
				
				}
				public String IWQT49OriginalDbColumnName(){
				
					return "IWQT49";
				
				}

				
			    public BigDecimal IWQT50;

				public BigDecimal getIWQT50 () {
					return this.IWQT50;
				}

				public Boolean IWQT50IsNullable(){
				    return true;
				}
				public Boolean IWQT50IsKey(){
				    return false;
				}
				public Integer IWQT50Length(){
				    return null;
				}
				public Integer IWQT50Precision(){
				    return null;
				}
				public String IWQT50Default(){
				
					return "";
				
				}
				public String IWQT50Comment(){
				
				    return "";
				
				}
				public String IWQT50Pattern(){
				
					return "";
				
				}
				public String IWQT50OriginalDbColumnName(){
				
					return "IWQT50";
				
				}

				
			    public BigDecimal IWQT51;

				public BigDecimal getIWQT51 () {
					return this.IWQT51;
				}

				public Boolean IWQT51IsNullable(){
				    return true;
				}
				public Boolean IWQT51IsKey(){
				    return false;
				}
				public Integer IWQT51Length(){
				    return null;
				}
				public Integer IWQT51Precision(){
				    return null;
				}
				public String IWQT51Default(){
				
					return "";
				
				}
				public String IWQT51Comment(){
				
				    return "";
				
				}
				public String IWQT51Pattern(){
				
					return "";
				
				}
				public String IWQT51OriginalDbColumnName(){
				
					return "IWQT51";
				
				}

				
			    public BigDecimal IWQT52;

				public BigDecimal getIWQT52 () {
					return this.IWQT52;
				}

				public Boolean IWQT52IsNullable(){
				    return true;
				}
				public Boolean IWQT52IsKey(){
				    return false;
				}
				public Integer IWQT52Length(){
				    return null;
				}
				public Integer IWQT52Precision(){
				    return null;
				}
				public String IWQT52Default(){
				
					return "";
				
				}
				public String IWQT52Comment(){
				
				    return "";
				
				}
				public String IWQT52Pattern(){
				
					return "";
				
				}
				public String IWQT52OriginalDbColumnName(){
				
					return "IWQT52";
				
				}

				
			    public BigDecimal IWQT53;

				public BigDecimal getIWQT53 () {
					return this.IWQT53;
				}

				public Boolean IWQT53IsNullable(){
				    return true;
				}
				public Boolean IWQT53IsKey(){
				    return false;
				}
				public Integer IWQT53Length(){
				    return null;
				}
				public Integer IWQT53Precision(){
				    return null;
				}
				public String IWQT53Default(){
				
					return "";
				
				}
				public String IWQT53Comment(){
				
				    return "";
				
				}
				public String IWQT53Pattern(){
				
					return "";
				
				}
				public String IWQT53OriginalDbColumnName(){
				
					return "IWQT53";
				
				}

				
			    public BigDecimal IWRT01;

				public BigDecimal getIWRT01 () {
					return this.IWRT01;
				}

				public Boolean IWRT01IsNullable(){
				    return true;
				}
				public Boolean IWRT01IsKey(){
				    return false;
				}
				public Integer IWRT01Length(){
				    return null;
				}
				public Integer IWRT01Precision(){
				    return null;
				}
				public String IWRT01Default(){
				
					return "";
				
				}
				public String IWRT01Comment(){
				
				    return "";
				
				}
				public String IWRT01Pattern(){
				
					return "";
				
				}
				public String IWRT01OriginalDbColumnName(){
				
					return "IWRT01";
				
				}

				
			    public BigDecimal IWRT02;

				public BigDecimal getIWRT02 () {
					return this.IWRT02;
				}

				public Boolean IWRT02IsNullable(){
				    return true;
				}
				public Boolean IWRT02IsKey(){
				    return false;
				}
				public Integer IWRT02Length(){
				    return null;
				}
				public Integer IWRT02Precision(){
				    return null;
				}
				public String IWRT02Default(){
				
					return "";
				
				}
				public String IWRT02Comment(){
				
				    return "";
				
				}
				public String IWRT02Pattern(){
				
					return "";
				
				}
				public String IWRT02OriginalDbColumnName(){
				
					return "IWRT02";
				
				}

				
			    public BigDecimal IWRT03;

				public BigDecimal getIWRT03 () {
					return this.IWRT03;
				}

				public Boolean IWRT03IsNullable(){
				    return true;
				}
				public Boolean IWRT03IsKey(){
				    return false;
				}
				public Integer IWRT03Length(){
				    return null;
				}
				public Integer IWRT03Precision(){
				    return null;
				}
				public String IWRT03Default(){
				
					return "";
				
				}
				public String IWRT03Comment(){
				
				    return "";
				
				}
				public String IWRT03Pattern(){
				
					return "";
				
				}
				public String IWRT03OriginalDbColumnName(){
				
					return "IWRT03";
				
				}

				
			    public BigDecimal IWRT04;

				public BigDecimal getIWRT04 () {
					return this.IWRT04;
				}

				public Boolean IWRT04IsNullable(){
				    return true;
				}
				public Boolean IWRT04IsKey(){
				    return false;
				}
				public Integer IWRT04Length(){
				    return null;
				}
				public Integer IWRT04Precision(){
				    return null;
				}
				public String IWRT04Default(){
				
					return "";
				
				}
				public String IWRT04Comment(){
				
				    return "";
				
				}
				public String IWRT04Pattern(){
				
					return "";
				
				}
				public String IWRT04OriginalDbColumnName(){
				
					return "IWRT04";
				
				}

				
			    public BigDecimal IWRT05;

				public BigDecimal getIWRT05 () {
					return this.IWRT05;
				}

				public Boolean IWRT05IsNullable(){
				    return true;
				}
				public Boolean IWRT05IsKey(){
				    return false;
				}
				public Integer IWRT05Length(){
				    return null;
				}
				public Integer IWRT05Precision(){
				    return null;
				}
				public String IWRT05Default(){
				
					return "";
				
				}
				public String IWRT05Comment(){
				
				    return "";
				
				}
				public String IWRT05Pattern(){
				
					return "";
				
				}
				public String IWRT05OriginalDbColumnName(){
				
					return "IWRT05";
				
				}

				
			    public BigDecimal IWRT06;

				public BigDecimal getIWRT06 () {
					return this.IWRT06;
				}

				public Boolean IWRT06IsNullable(){
				    return true;
				}
				public Boolean IWRT06IsKey(){
				    return false;
				}
				public Integer IWRT06Length(){
				    return null;
				}
				public Integer IWRT06Precision(){
				    return null;
				}
				public String IWRT06Default(){
				
					return "";
				
				}
				public String IWRT06Comment(){
				
				    return "";
				
				}
				public String IWRT06Pattern(){
				
					return "";
				
				}
				public String IWRT06OriginalDbColumnName(){
				
					return "IWRT06";
				
				}

				
			    public BigDecimal IWRT07;

				public BigDecimal getIWRT07 () {
					return this.IWRT07;
				}

				public Boolean IWRT07IsNullable(){
				    return true;
				}
				public Boolean IWRT07IsKey(){
				    return false;
				}
				public Integer IWRT07Length(){
				    return null;
				}
				public Integer IWRT07Precision(){
				    return null;
				}
				public String IWRT07Default(){
				
					return "";
				
				}
				public String IWRT07Comment(){
				
				    return "";
				
				}
				public String IWRT07Pattern(){
				
					return "";
				
				}
				public String IWRT07OriginalDbColumnName(){
				
					return "IWRT07";
				
				}

				
			    public BigDecimal IWRT08;

				public BigDecimal getIWRT08 () {
					return this.IWRT08;
				}

				public Boolean IWRT08IsNullable(){
				    return true;
				}
				public Boolean IWRT08IsKey(){
				    return false;
				}
				public Integer IWRT08Length(){
				    return null;
				}
				public Integer IWRT08Precision(){
				    return null;
				}
				public String IWRT08Default(){
				
					return "";
				
				}
				public String IWRT08Comment(){
				
				    return "";
				
				}
				public String IWRT08Pattern(){
				
					return "";
				
				}
				public String IWRT08OriginalDbColumnName(){
				
					return "IWRT08";
				
				}

				
			    public BigDecimal IWRT09;

				public BigDecimal getIWRT09 () {
					return this.IWRT09;
				}

				public Boolean IWRT09IsNullable(){
				    return true;
				}
				public Boolean IWRT09IsKey(){
				    return false;
				}
				public Integer IWRT09Length(){
				    return null;
				}
				public Integer IWRT09Precision(){
				    return null;
				}
				public String IWRT09Default(){
				
					return "";
				
				}
				public String IWRT09Comment(){
				
				    return "";
				
				}
				public String IWRT09Pattern(){
				
					return "";
				
				}
				public String IWRT09OriginalDbColumnName(){
				
					return "IWRT09";
				
				}

				
			    public BigDecimal IWRT10;

				public BigDecimal getIWRT10 () {
					return this.IWRT10;
				}

				public Boolean IWRT10IsNullable(){
				    return true;
				}
				public Boolean IWRT10IsKey(){
				    return false;
				}
				public Integer IWRT10Length(){
				    return null;
				}
				public Integer IWRT10Precision(){
				    return null;
				}
				public String IWRT10Default(){
				
					return "";
				
				}
				public String IWRT10Comment(){
				
				    return "";
				
				}
				public String IWRT10Pattern(){
				
					return "";
				
				}
				public String IWRT10OriginalDbColumnName(){
				
					return "IWRT10";
				
				}

				
			    public BigDecimal IWRT11;

				public BigDecimal getIWRT11 () {
					return this.IWRT11;
				}

				public Boolean IWRT11IsNullable(){
				    return true;
				}
				public Boolean IWRT11IsKey(){
				    return false;
				}
				public Integer IWRT11Length(){
				    return null;
				}
				public Integer IWRT11Precision(){
				    return null;
				}
				public String IWRT11Default(){
				
					return "";
				
				}
				public String IWRT11Comment(){
				
				    return "";
				
				}
				public String IWRT11Pattern(){
				
					return "";
				
				}
				public String IWRT11OriginalDbColumnName(){
				
					return "IWRT11";
				
				}

				
			    public BigDecimal IWRT12;

				public BigDecimal getIWRT12 () {
					return this.IWRT12;
				}

				public Boolean IWRT12IsNullable(){
				    return true;
				}
				public Boolean IWRT12IsKey(){
				    return false;
				}
				public Integer IWRT12Length(){
				    return null;
				}
				public Integer IWRT12Precision(){
				    return null;
				}
				public String IWRT12Default(){
				
					return "";
				
				}
				public String IWRT12Comment(){
				
				    return "";
				
				}
				public String IWRT12Pattern(){
				
					return "";
				
				}
				public String IWRT12OriginalDbColumnName(){
				
					return "IWRT12";
				
				}

				
			    public BigDecimal IWRT13;

				public BigDecimal getIWRT13 () {
					return this.IWRT13;
				}

				public Boolean IWRT13IsNullable(){
				    return true;
				}
				public Boolean IWRT13IsKey(){
				    return false;
				}
				public Integer IWRT13Length(){
				    return null;
				}
				public Integer IWRT13Precision(){
				    return null;
				}
				public String IWRT13Default(){
				
					return "";
				
				}
				public String IWRT13Comment(){
				
				    return "";
				
				}
				public String IWRT13Pattern(){
				
					return "";
				
				}
				public String IWRT13OriginalDbColumnName(){
				
					return "IWRT13";
				
				}

				
			    public BigDecimal IWRT14;

				public BigDecimal getIWRT14 () {
					return this.IWRT14;
				}

				public Boolean IWRT14IsNullable(){
				    return true;
				}
				public Boolean IWRT14IsKey(){
				    return false;
				}
				public Integer IWRT14Length(){
				    return null;
				}
				public Integer IWRT14Precision(){
				    return null;
				}
				public String IWRT14Default(){
				
					return "";
				
				}
				public String IWRT14Comment(){
				
				    return "";
				
				}
				public String IWRT14Pattern(){
				
					return "";
				
				}
				public String IWRT14OriginalDbColumnName(){
				
					return "IWRT14";
				
				}

				
			    public BigDecimal IWRT15;

				public BigDecimal getIWRT15 () {
					return this.IWRT15;
				}

				public Boolean IWRT15IsNullable(){
				    return true;
				}
				public Boolean IWRT15IsKey(){
				    return false;
				}
				public Integer IWRT15Length(){
				    return null;
				}
				public Integer IWRT15Precision(){
				    return null;
				}
				public String IWRT15Default(){
				
					return "";
				
				}
				public String IWRT15Comment(){
				
				    return "";
				
				}
				public String IWRT15Pattern(){
				
					return "";
				
				}
				public String IWRT15OriginalDbColumnName(){
				
					return "IWRT15";
				
				}

				
			    public BigDecimal IWRT16;

				public BigDecimal getIWRT16 () {
					return this.IWRT16;
				}

				public Boolean IWRT16IsNullable(){
				    return true;
				}
				public Boolean IWRT16IsKey(){
				    return false;
				}
				public Integer IWRT16Length(){
				    return null;
				}
				public Integer IWRT16Precision(){
				    return null;
				}
				public String IWRT16Default(){
				
					return "";
				
				}
				public String IWRT16Comment(){
				
				    return "";
				
				}
				public String IWRT16Pattern(){
				
					return "";
				
				}
				public String IWRT16OriginalDbColumnName(){
				
					return "IWRT16";
				
				}

				
			    public BigDecimal IWRT17;

				public BigDecimal getIWRT17 () {
					return this.IWRT17;
				}

				public Boolean IWRT17IsNullable(){
				    return true;
				}
				public Boolean IWRT17IsKey(){
				    return false;
				}
				public Integer IWRT17Length(){
				    return null;
				}
				public Integer IWRT17Precision(){
				    return null;
				}
				public String IWRT17Default(){
				
					return "";
				
				}
				public String IWRT17Comment(){
				
				    return "";
				
				}
				public String IWRT17Pattern(){
				
					return "";
				
				}
				public String IWRT17OriginalDbColumnName(){
				
					return "IWRT17";
				
				}

				
			    public BigDecimal IWRT18;

				public BigDecimal getIWRT18 () {
					return this.IWRT18;
				}

				public Boolean IWRT18IsNullable(){
				    return true;
				}
				public Boolean IWRT18IsKey(){
				    return false;
				}
				public Integer IWRT18Length(){
				    return null;
				}
				public Integer IWRT18Precision(){
				    return null;
				}
				public String IWRT18Default(){
				
					return "";
				
				}
				public String IWRT18Comment(){
				
				    return "";
				
				}
				public String IWRT18Pattern(){
				
					return "";
				
				}
				public String IWRT18OriginalDbColumnName(){
				
					return "IWRT18";
				
				}

				
			    public BigDecimal IWRT19;

				public BigDecimal getIWRT19 () {
					return this.IWRT19;
				}

				public Boolean IWRT19IsNullable(){
				    return true;
				}
				public Boolean IWRT19IsKey(){
				    return false;
				}
				public Integer IWRT19Length(){
				    return null;
				}
				public Integer IWRT19Precision(){
				    return null;
				}
				public String IWRT19Default(){
				
					return "";
				
				}
				public String IWRT19Comment(){
				
				    return "";
				
				}
				public String IWRT19Pattern(){
				
					return "";
				
				}
				public String IWRT19OriginalDbColumnName(){
				
					return "IWRT19";
				
				}

				
			    public BigDecimal IWRT20;

				public BigDecimal getIWRT20 () {
					return this.IWRT20;
				}

				public Boolean IWRT20IsNullable(){
				    return true;
				}
				public Boolean IWRT20IsKey(){
				    return false;
				}
				public Integer IWRT20Length(){
				    return null;
				}
				public Integer IWRT20Precision(){
				    return null;
				}
				public String IWRT20Default(){
				
					return "";
				
				}
				public String IWRT20Comment(){
				
				    return "";
				
				}
				public String IWRT20Pattern(){
				
					return "";
				
				}
				public String IWRT20OriginalDbColumnName(){
				
					return "IWRT20";
				
				}

				
			    public BigDecimal IWRT21;

				public BigDecimal getIWRT21 () {
					return this.IWRT21;
				}

				public Boolean IWRT21IsNullable(){
				    return true;
				}
				public Boolean IWRT21IsKey(){
				    return false;
				}
				public Integer IWRT21Length(){
				    return null;
				}
				public Integer IWRT21Precision(){
				    return null;
				}
				public String IWRT21Default(){
				
					return "";
				
				}
				public String IWRT21Comment(){
				
				    return "";
				
				}
				public String IWRT21Pattern(){
				
					return "";
				
				}
				public String IWRT21OriginalDbColumnName(){
				
					return "IWRT21";
				
				}

				
			    public BigDecimal IWRT22;

				public BigDecimal getIWRT22 () {
					return this.IWRT22;
				}

				public Boolean IWRT22IsNullable(){
				    return true;
				}
				public Boolean IWRT22IsKey(){
				    return false;
				}
				public Integer IWRT22Length(){
				    return null;
				}
				public Integer IWRT22Precision(){
				    return null;
				}
				public String IWRT22Default(){
				
					return "";
				
				}
				public String IWRT22Comment(){
				
				    return "";
				
				}
				public String IWRT22Pattern(){
				
					return "";
				
				}
				public String IWRT22OriginalDbColumnName(){
				
					return "IWRT22";
				
				}

				
			    public BigDecimal IWRT23;

				public BigDecimal getIWRT23 () {
					return this.IWRT23;
				}

				public Boolean IWRT23IsNullable(){
				    return true;
				}
				public Boolean IWRT23IsKey(){
				    return false;
				}
				public Integer IWRT23Length(){
				    return null;
				}
				public Integer IWRT23Precision(){
				    return null;
				}
				public String IWRT23Default(){
				
					return "";
				
				}
				public String IWRT23Comment(){
				
				    return "";
				
				}
				public String IWRT23Pattern(){
				
					return "";
				
				}
				public String IWRT23OriginalDbColumnName(){
				
					return "IWRT23";
				
				}

				
			    public BigDecimal IWRT24;

				public BigDecimal getIWRT24 () {
					return this.IWRT24;
				}

				public Boolean IWRT24IsNullable(){
				    return true;
				}
				public Boolean IWRT24IsKey(){
				    return false;
				}
				public Integer IWRT24Length(){
				    return null;
				}
				public Integer IWRT24Precision(){
				    return null;
				}
				public String IWRT24Default(){
				
					return "";
				
				}
				public String IWRT24Comment(){
				
				    return "";
				
				}
				public String IWRT24Pattern(){
				
					return "";
				
				}
				public String IWRT24OriginalDbColumnName(){
				
					return "IWRT24";
				
				}

				
			    public BigDecimal IWRT25;

				public BigDecimal getIWRT25 () {
					return this.IWRT25;
				}

				public Boolean IWRT25IsNullable(){
				    return true;
				}
				public Boolean IWRT25IsKey(){
				    return false;
				}
				public Integer IWRT25Length(){
				    return null;
				}
				public Integer IWRT25Precision(){
				    return null;
				}
				public String IWRT25Default(){
				
					return "";
				
				}
				public String IWRT25Comment(){
				
				    return "";
				
				}
				public String IWRT25Pattern(){
				
					return "";
				
				}
				public String IWRT25OriginalDbColumnName(){
				
					return "IWRT25";
				
				}

				
			    public BigDecimal IWRT26;

				public BigDecimal getIWRT26 () {
					return this.IWRT26;
				}

				public Boolean IWRT26IsNullable(){
				    return true;
				}
				public Boolean IWRT26IsKey(){
				    return false;
				}
				public Integer IWRT26Length(){
				    return null;
				}
				public Integer IWRT26Precision(){
				    return null;
				}
				public String IWRT26Default(){
				
					return "";
				
				}
				public String IWRT26Comment(){
				
				    return "";
				
				}
				public String IWRT26Pattern(){
				
					return "";
				
				}
				public String IWRT26OriginalDbColumnName(){
				
					return "IWRT26";
				
				}

				
			    public BigDecimal IWRT27;

				public BigDecimal getIWRT27 () {
					return this.IWRT27;
				}

				public Boolean IWRT27IsNullable(){
				    return true;
				}
				public Boolean IWRT27IsKey(){
				    return false;
				}
				public Integer IWRT27Length(){
				    return null;
				}
				public Integer IWRT27Precision(){
				    return null;
				}
				public String IWRT27Default(){
				
					return "";
				
				}
				public String IWRT27Comment(){
				
				    return "";
				
				}
				public String IWRT27Pattern(){
				
					return "";
				
				}
				public String IWRT27OriginalDbColumnName(){
				
					return "IWRT27";
				
				}

				
			    public BigDecimal IWRT28;

				public BigDecimal getIWRT28 () {
					return this.IWRT28;
				}

				public Boolean IWRT28IsNullable(){
				    return true;
				}
				public Boolean IWRT28IsKey(){
				    return false;
				}
				public Integer IWRT28Length(){
				    return null;
				}
				public Integer IWRT28Precision(){
				    return null;
				}
				public String IWRT28Default(){
				
					return "";
				
				}
				public String IWRT28Comment(){
				
				    return "";
				
				}
				public String IWRT28Pattern(){
				
					return "";
				
				}
				public String IWRT28OriginalDbColumnName(){
				
					return "IWRT28";
				
				}

				
			    public BigDecimal IWRT29;

				public BigDecimal getIWRT29 () {
					return this.IWRT29;
				}

				public Boolean IWRT29IsNullable(){
				    return true;
				}
				public Boolean IWRT29IsKey(){
				    return false;
				}
				public Integer IWRT29Length(){
				    return null;
				}
				public Integer IWRT29Precision(){
				    return null;
				}
				public String IWRT29Default(){
				
					return "";
				
				}
				public String IWRT29Comment(){
				
				    return "";
				
				}
				public String IWRT29Pattern(){
				
					return "";
				
				}
				public String IWRT29OriginalDbColumnName(){
				
					return "IWRT29";
				
				}

				
			    public BigDecimal IWRT30;

				public BigDecimal getIWRT30 () {
					return this.IWRT30;
				}

				public Boolean IWRT30IsNullable(){
				    return true;
				}
				public Boolean IWRT30IsKey(){
				    return false;
				}
				public Integer IWRT30Length(){
				    return null;
				}
				public Integer IWRT30Precision(){
				    return null;
				}
				public String IWRT30Default(){
				
					return "";
				
				}
				public String IWRT30Comment(){
				
				    return "";
				
				}
				public String IWRT30Pattern(){
				
					return "";
				
				}
				public String IWRT30OriginalDbColumnName(){
				
					return "IWRT30";
				
				}

				
			    public BigDecimal IWRT31;

				public BigDecimal getIWRT31 () {
					return this.IWRT31;
				}

				public Boolean IWRT31IsNullable(){
				    return true;
				}
				public Boolean IWRT31IsKey(){
				    return false;
				}
				public Integer IWRT31Length(){
				    return null;
				}
				public Integer IWRT31Precision(){
				    return null;
				}
				public String IWRT31Default(){
				
					return "";
				
				}
				public String IWRT31Comment(){
				
				    return "";
				
				}
				public String IWRT31Pattern(){
				
					return "";
				
				}
				public String IWRT31OriginalDbColumnName(){
				
					return "IWRT31";
				
				}

				
			    public BigDecimal IWRT32;

				public BigDecimal getIWRT32 () {
					return this.IWRT32;
				}

				public Boolean IWRT32IsNullable(){
				    return true;
				}
				public Boolean IWRT32IsKey(){
				    return false;
				}
				public Integer IWRT32Length(){
				    return null;
				}
				public Integer IWRT32Precision(){
				    return null;
				}
				public String IWRT32Default(){
				
					return "";
				
				}
				public String IWRT32Comment(){
				
				    return "";
				
				}
				public String IWRT32Pattern(){
				
					return "";
				
				}
				public String IWRT32OriginalDbColumnName(){
				
					return "IWRT32";
				
				}

				
			    public BigDecimal IWRT33;

				public BigDecimal getIWRT33 () {
					return this.IWRT33;
				}

				public Boolean IWRT33IsNullable(){
				    return true;
				}
				public Boolean IWRT33IsKey(){
				    return false;
				}
				public Integer IWRT33Length(){
				    return null;
				}
				public Integer IWRT33Precision(){
				    return null;
				}
				public String IWRT33Default(){
				
					return "";
				
				}
				public String IWRT33Comment(){
				
				    return "";
				
				}
				public String IWRT33Pattern(){
				
					return "";
				
				}
				public String IWRT33OriginalDbColumnName(){
				
					return "IWRT33";
				
				}

				
			    public BigDecimal IWRT34;

				public BigDecimal getIWRT34 () {
					return this.IWRT34;
				}

				public Boolean IWRT34IsNullable(){
				    return true;
				}
				public Boolean IWRT34IsKey(){
				    return false;
				}
				public Integer IWRT34Length(){
				    return null;
				}
				public Integer IWRT34Precision(){
				    return null;
				}
				public String IWRT34Default(){
				
					return "";
				
				}
				public String IWRT34Comment(){
				
				    return "";
				
				}
				public String IWRT34Pattern(){
				
					return "";
				
				}
				public String IWRT34OriginalDbColumnName(){
				
					return "IWRT34";
				
				}

				
			    public BigDecimal IWRT35;

				public BigDecimal getIWRT35 () {
					return this.IWRT35;
				}

				public Boolean IWRT35IsNullable(){
				    return true;
				}
				public Boolean IWRT35IsKey(){
				    return false;
				}
				public Integer IWRT35Length(){
				    return null;
				}
				public Integer IWRT35Precision(){
				    return null;
				}
				public String IWRT35Default(){
				
					return "";
				
				}
				public String IWRT35Comment(){
				
				    return "";
				
				}
				public String IWRT35Pattern(){
				
					return "";
				
				}
				public String IWRT35OriginalDbColumnName(){
				
					return "IWRT35";
				
				}

				
			    public BigDecimal IWRT36;

				public BigDecimal getIWRT36 () {
					return this.IWRT36;
				}

				public Boolean IWRT36IsNullable(){
				    return true;
				}
				public Boolean IWRT36IsKey(){
				    return false;
				}
				public Integer IWRT36Length(){
				    return null;
				}
				public Integer IWRT36Precision(){
				    return null;
				}
				public String IWRT36Default(){
				
					return "";
				
				}
				public String IWRT36Comment(){
				
				    return "";
				
				}
				public String IWRT36Pattern(){
				
					return "";
				
				}
				public String IWRT36OriginalDbColumnName(){
				
					return "IWRT36";
				
				}

				
			    public BigDecimal IWRT37;

				public BigDecimal getIWRT37 () {
					return this.IWRT37;
				}

				public Boolean IWRT37IsNullable(){
				    return true;
				}
				public Boolean IWRT37IsKey(){
				    return false;
				}
				public Integer IWRT37Length(){
				    return null;
				}
				public Integer IWRT37Precision(){
				    return null;
				}
				public String IWRT37Default(){
				
					return "";
				
				}
				public String IWRT37Comment(){
				
				    return "";
				
				}
				public String IWRT37Pattern(){
				
					return "";
				
				}
				public String IWRT37OriginalDbColumnName(){
				
					return "IWRT37";
				
				}

				
			    public BigDecimal IWRT38;

				public BigDecimal getIWRT38 () {
					return this.IWRT38;
				}

				public Boolean IWRT38IsNullable(){
				    return true;
				}
				public Boolean IWRT38IsKey(){
				    return false;
				}
				public Integer IWRT38Length(){
				    return null;
				}
				public Integer IWRT38Precision(){
				    return null;
				}
				public String IWRT38Default(){
				
					return "";
				
				}
				public String IWRT38Comment(){
				
				    return "";
				
				}
				public String IWRT38Pattern(){
				
					return "";
				
				}
				public String IWRT38OriginalDbColumnName(){
				
					return "IWRT38";
				
				}

				
			    public BigDecimal IWRT39;

				public BigDecimal getIWRT39 () {
					return this.IWRT39;
				}

				public Boolean IWRT39IsNullable(){
				    return true;
				}
				public Boolean IWRT39IsKey(){
				    return false;
				}
				public Integer IWRT39Length(){
				    return null;
				}
				public Integer IWRT39Precision(){
				    return null;
				}
				public String IWRT39Default(){
				
					return "";
				
				}
				public String IWRT39Comment(){
				
				    return "";
				
				}
				public String IWRT39Pattern(){
				
					return "";
				
				}
				public String IWRT39OriginalDbColumnName(){
				
					return "IWRT39";
				
				}

				
			    public BigDecimal IWRT40;

				public BigDecimal getIWRT40 () {
					return this.IWRT40;
				}

				public Boolean IWRT40IsNullable(){
				    return true;
				}
				public Boolean IWRT40IsKey(){
				    return false;
				}
				public Integer IWRT40Length(){
				    return null;
				}
				public Integer IWRT40Precision(){
				    return null;
				}
				public String IWRT40Default(){
				
					return "";
				
				}
				public String IWRT40Comment(){
				
				    return "";
				
				}
				public String IWRT40Pattern(){
				
					return "";
				
				}
				public String IWRT40OriginalDbColumnName(){
				
					return "IWRT40";
				
				}

				
			    public BigDecimal IWRT41;

				public BigDecimal getIWRT41 () {
					return this.IWRT41;
				}

				public Boolean IWRT41IsNullable(){
				    return true;
				}
				public Boolean IWRT41IsKey(){
				    return false;
				}
				public Integer IWRT41Length(){
				    return null;
				}
				public Integer IWRT41Precision(){
				    return null;
				}
				public String IWRT41Default(){
				
					return "";
				
				}
				public String IWRT41Comment(){
				
				    return "";
				
				}
				public String IWRT41Pattern(){
				
					return "";
				
				}
				public String IWRT41OriginalDbColumnName(){
				
					return "IWRT41";
				
				}

				
			    public BigDecimal IWRT42;

				public BigDecimal getIWRT42 () {
					return this.IWRT42;
				}

				public Boolean IWRT42IsNullable(){
				    return true;
				}
				public Boolean IWRT42IsKey(){
				    return false;
				}
				public Integer IWRT42Length(){
				    return null;
				}
				public Integer IWRT42Precision(){
				    return null;
				}
				public String IWRT42Default(){
				
					return "";
				
				}
				public String IWRT42Comment(){
				
				    return "";
				
				}
				public String IWRT42Pattern(){
				
					return "";
				
				}
				public String IWRT42OriginalDbColumnName(){
				
					return "IWRT42";
				
				}

				
			    public BigDecimal IWRT43;

				public BigDecimal getIWRT43 () {
					return this.IWRT43;
				}

				public Boolean IWRT43IsNullable(){
				    return true;
				}
				public Boolean IWRT43IsKey(){
				    return false;
				}
				public Integer IWRT43Length(){
				    return null;
				}
				public Integer IWRT43Precision(){
				    return null;
				}
				public String IWRT43Default(){
				
					return "";
				
				}
				public String IWRT43Comment(){
				
				    return "";
				
				}
				public String IWRT43Pattern(){
				
					return "";
				
				}
				public String IWRT43OriginalDbColumnName(){
				
					return "IWRT43";
				
				}

				
			    public BigDecimal IWRT44;

				public BigDecimal getIWRT44 () {
					return this.IWRT44;
				}

				public Boolean IWRT44IsNullable(){
				    return true;
				}
				public Boolean IWRT44IsKey(){
				    return false;
				}
				public Integer IWRT44Length(){
				    return null;
				}
				public Integer IWRT44Precision(){
				    return null;
				}
				public String IWRT44Default(){
				
					return "";
				
				}
				public String IWRT44Comment(){
				
				    return "";
				
				}
				public String IWRT44Pattern(){
				
					return "";
				
				}
				public String IWRT44OriginalDbColumnName(){
				
					return "IWRT44";
				
				}

				
			    public BigDecimal IWRT45;

				public BigDecimal getIWRT45 () {
					return this.IWRT45;
				}

				public Boolean IWRT45IsNullable(){
				    return true;
				}
				public Boolean IWRT45IsKey(){
				    return false;
				}
				public Integer IWRT45Length(){
				    return null;
				}
				public Integer IWRT45Precision(){
				    return null;
				}
				public String IWRT45Default(){
				
					return "";
				
				}
				public String IWRT45Comment(){
				
				    return "";
				
				}
				public String IWRT45Pattern(){
				
					return "";
				
				}
				public String IWRT45OriginalDbColumnName(){
				
					return "IWRT45";
				
				}

				
			    public BigDecimal IWRT46;

				public BigDecimal getIWRT46 () {
					return this.IWRT46;
				}

				public Boolean IWRT46IsNullable(){
				    return true;
				}
				public Boolean IWRT46IsKey(){
				    return false;
				}
				public Integer IWRT46Length(){
				    return null;
				}
				public Integer IWRT46Precision(){
				    return null;
				}
				public String IWRT46Default(){
				
					return "";
				
				}
				public String IWRT46Comment(){
				
				    return "";
				
				}
				public String IWRT46Pattern(){
				
					return "";
				
				}
				public String IWRT46OriginalDbColumnName(){
				
					return "IWRT46";
				
				}

				
			    public BigDecimal IWRT47;

				public BigDecimal getIWRT47 () {
					return this.IWRT47;
				}

				public Boolean IWRT47IsNullable(){
				    return true;
				}
				public Boolean IWRT47IsKey(){
				    return false;
				}
				public Integer IWRT47Length(){
				    return null;
				}
				public Integer IWRT47Precision(){
				    return null;
				}
				public String IWRT47Default(){
				
					return "";
				
				}
				public String IWRT47Comment(){
				
				    return "";
				
				}
				public String IWRT47Pattern(){
				
					return "";
				
				}
				public String IWRT47OriginalDbColumnName(){
				
					return "IWRT47";
				
				}

				
			    public BigDecimal IWRT48;

				public BigDecimal getIWRT48 () {
					return this.IWRT48;
				}

				public Boolean IWRT48IsNullable(){
				    return true;
				}
				public Boolean IWRT48IsKey(){
				    return false;
				}
				public Integer IWRT48Length(){
				    return null;
				}
				public Integer IWRT48Precision(){
				    return null;
				}
				public String IWRT48Default(){
				
					return "";
				
				}
				public String IWRT48Comment(){
				
				    return "";
				
				}
				public String IWRT48Pattern(){
				
					return "";
				
				}
				public String IWRT48OriginalDbColumnName(){
				
					return "IWRT48";
				
				}

				
			    public BigDecimal IWRT49;

				public BigDecimal getIWRT49 () {
					return this.IWRT49;
				}

				public Boolean IWRT49IsNullable(){
				    return true;
				}
				public Boolean IWRT49IsKey(){
				    return false;
				}
				public Integer IWRT49Length(){
				    return null;
				}
				public Integer IWRT49Precision(){
				    return null;
				}
				public String IWRT49Default(){
				
					return "";
				
				}
				public String IWRT49Comment(){
				
				    return "";
				
				}
				public String IWRT49Pattern(){
				
					return "";
				
				}
				public String IWRT49OriginalDbColumnName(){
				
					return "IWRT49";
				
				}

				
			    public BigDecimal IWRT50;

				public BigDecimal getIWRT50 () {
					return this.IWRT50;
				}

				public Boolean IWRT50IsNullable(){
				    return true;
				}
				public Boolean IWRT50IsKey(){
				    return false;
				}
				public Integer IWRT50Length(){
				    return null;
				}
				public Integer IWRT50Precision(){
				    return null;
				}
				public String IWRT50Default(){
				
					return "";
				
				}
				public String IWRT50Comment(){
				
				    return "";
				
				}
				public String IWRT50Pattern(){
				
					return "";
				
				}
				public String IWRT50OriginalDbColumnName(){
				
					return "IWRT50";
				
				}

				
			    public BigDecimal IWRT51;

				public BigDecimal getIWRT51 () {
					return this.IWRT51;
				}

				public Boolean IWRT51IsNullable(){
				    return true;
				}
				public Boolean IWRT51IsKey(){
				    return false;
				}
				public Integer IWRT51Length(){
				    return null;
				}
				public Integer IWRT51Precision(){
				    return null;
				}
				public String IWRT51Default(){
				
					return "";
				
				}
				public String IWRT51Comment(){
				
				    return "";
				
				}
				public String IWRT51Pattern(){
				
					return "";
				
				}
				public String IWRT51OriginalDbColumnName(){
				
					return "IWRT51";
				
				}

				
			    public BigDecimal IWRT52;

				public BigDecimal getIWRT52 () {
					return this.IWRT52;
				}

				public Boolean IWRT52IsNullable(){
				    return true;
				}
				public Boolean IWRT52IsKey(){
				    return false;
				}
				public Integer IWRT52Length(){
				    return null;
				}
				public Integer IWRT52Precision(){
				    return null;
				}
				public String IWRT52Default(){
				
					return "";
				
				}
				public String IWRT52Comment(){
				
				    return "";
				
				}
				public String IWRT52Pattern(){
				
					return "";
				
				}
				public String IWRT52OriginalDbColumnName(){
				
					return "IWRT52";
				
				}

				
			    public BigDecimal IWRT53;

				public BigDecimal getIWRT53 () {
					return this.IWRT53;
				}

				public Boolean IWRT53IsNullable(){
				    return true;
				}
				public Boolean IWRT53IsKey(){
				    return false;
				}
				public Integer IWRT53Length(){
				    return null;
				}
				public Integer IWRT53Precision(){
				    return null;
				}
				public String IWRT53Default(){
				
					return "";
				
				}
				public String IWRT53Comment(){
				
				    return "";
				
				}
				public String IWRT53Pattern(){
				
					return "";
				
				}
				public String IWRT53OriginalDbColumnName(){
				
					return "IWRT53";
				
				}

				
			    public BigDecimal IWCS01;

				public BigDecimal getIWCS01 () {
					return this.IWCS01;
				}

				public Boolean IWCS01IsNullable(){
				    return true;
				}
				public Boolean IWCS01IsKey(){
				    return false;
				}
				public Integer IWCS01Length(){
				    return null;
				}
				public Integer IWCS01Precision(){
				    return null;
				}
				public String IWCS01Default(){
				
					return "";
				
				}
				public String IWCS01Comment(){
				
				    return "";
				
				}
				public String IWCS01Pattern(){
				
					return "";
				
				}
				public String IWCS01OriginalDbColumnName(){
				
					return "IWCS01";
				
				}

				
			    public BigDecimal IWCS02;

				public BigDecimal getIWCS02 () {
					return this.IWCS02;
				}

				public Boolean IWCS02IsNullable(){
				    return true;
				}
				public Boolean IWCS02IsKey(){
				    return false;
				}
				public Integer IWCS02Length(){
				    return null;
				}
				public Integer IWCS02Precision(){
				    return null;
				}
				public String IWCS02Default(){
				
					return "";
				
				}
				public String IWCS02Comment(){
				
				    return "";
				
				}
				public String IWCS02Pattern(){
				
					return "";
				
				}
				public String IWCS02OriginalDbColumnName(){
				
					return "IWCS02";
				
				}

				
			    public BigDecimal IWCS03;

				public BigDecimal getIWCS03 () {
					return this.IWCS03;
				}

				public Boolean IWCS03IsNullable(){
				    return true;
				}
				public Boolean IWCS03IsKey(){
				    return false;
				}
				public Integer IWCS03Length(){
				    return null;
				}
				public Integer IWCS03Precision(){
				    return null;
				}
				public String IWCS03Default(){
				
					return "";
				
				}
				public String IWCS03Comment(){
				
				    return "";
				
				}
				public String IWCS03Pattern(){
				
					return "";
				
				}
				public String IWCS03OriginalDbColumnName(){
				
					return "IWCS03";
				
				}

				
			    public BigDecimal IWCS04;

				public BigDecimal getIWCS04 () {
					return this.IWCS04;
				}

				public Boolean IWCS04IsNullable(){
				    return true;
				}
				public Boolean IWCS04IsKey(){
				    return false;
				}
				public Integer IWCS04Length(){
				    return null;
				}
				public Integer IWCS04Precision(){
				    return null;
				}
				public String IWCS04Default(){
				
					return "";
				
				}
				public String IWCS04Comment(){
				
				    return "";
				
				}
				public String IWCS04Pattern(){
				
					return "";
				
				}
				public String IWCS04OriginalDbColumnName(){
				
					return "IWCS04";
				
				}

				
			    public BigDecimal IWCS05;

				public BigDecimal getIWCS05 () {
					return this.IWCS05;
				}

				public Boolean IWCS05IsNullable(){
				    return true;
				}
				public Boolean IWCS05IsKey(){
				    return false;
				}
				public Integer IWCS05Length(){
				    return null;
				}
				public Integer IWCS05Precision(){
				    return null;
				}
				public String IWCS05Default(){
				
					return "";
				
				}
				public String IWCS05Comment(){
				
				    return "";
				
				}
				public String IWCS05Pattern(){
				
					return "";
				
				}
				public String IWCS05OriginalDbColumnName(){
				
					return "IWCS05";
				
				}

				
			    public BigDecimal IWCS06;

				public BigDecimal getIWCS06 () {
					return this.IWCS06;
				}

				public Boolean IWCS06IsNullable(){
				    return true;
				}
				public Boolean IWCS06IsKey(){
				    return false;
				}
				public Integer IWCS06Length(){
				    return null;
				}
				public Integer IWCS06Precision(){
				    return null;
				}
				public String IWCS06Default(){
				
					return "";
				
				}
				public String IWCS06Comment(){
				
				    return "";
				
				}
				public String IWCS06Pattern(){
				
					return "";
				
				}
				public String IWCS06OriginalDbColumnName(){
				
					return "IWCS06";
				
				}

				
			    public BigDecimal IWCS07;

				public BigDecimal getIWCS07 () {
					return this.IWCS07;
				}

				public Boolean IWCS07IsNullable(){
				    return true;
				}
				public Boolean IWCS07IsKey(){
				    return false;
				}
				public Integer IWCS07Length(){
				    return null;
				}
				public Integer IWCS07Precision(){
				    return null;
				}
				public String IWCS07Default(){
				
					return "";
				
				}
				public String IWCS07Comment(){
				
				    return "";
				
				}
				public String IWCS07Pattern(){
				
					return "";
				
				}
				public String IWCS07OriginalDbColumnName(){
				
					return "IWCS07";
				
				}

				
			    public BigDecimal IWCS08;

				public BigDecimal getIWCS08 () {
					return this.IWCS08;
				}

				public Boolean IWCS08IsNullable(){
				    return true;
				}
				public Boolean IWCS08IsKey(){
				    return false;
				}
				public Integer IWCS08Length(){
				    return null;
				}
				public Integer IWCS08Precision(){
				    return null;
				}
				public String IWCS08Default(){
				
					return "";
				
				}
				public String IWCS08Comment(){
				
				    return "";
				
				}
				public String IWCS08Pattern(){
				
					return "";
				
				}
				public String IWCS08OriginalDbColumnName(){
				
					return "IWCS08";
				
				}

				
			    public BigDecimal IWCS09;

				public BigDecimal getIWCS09 () {
					return this.IWCS09;
				}

				public Boolean IWCS09IsNullable(){
				    return true;
				}
				public Boolean IWCS09IsKey(){
				    return false;
				}
				public Integer IWCS09Length(){
				    return null;
				}
				public Integer IWCS09Precision(){
				    return null;
				}
				public String IWCS09Default(){
				
					return "";
				
				}
				public String IWCS09Comment(){
				
				    return "";
				
				}
				public String IWCS09Pattern(){
				
					return "";
				
				}
				public String IWCS09OriginalDbColumnName(){
				
					return "IWCS09";
				
				}

				
			    public BigDecimal IWCS10;

				public BigDecimal getIWCS10 () {
					return this.IWCS10;
				}

				public Boolean IWCS10IsNullable(){
				    return true;
				}
				public Boolean IWCS10IsKey(){
				    return false;
				}
				public Integer IWCS10Length(){
				    return null;
				}
				public Integer IWCS10Precision(){
				    return null;
				}
				public String IWCS10Default(){
				
					return "";
				
				}
				public String IWCS10Comment(){
				
				    return "";
				
				}
				public String IWCS10Pattern(){
				
					return "";
				
				}
				public String IWCS10OriginalDbColumnName(){
				
					return "IWCS10";
				
				}

				
			    public BigDecimal IWCS11;

				public BigDecimal getIWCS11 () {
					return this.IWCS11;
				}

				public Boolean IWCS11IsNullable(){
				    return true;
				}
				public Boolean IWCS11IsKey(){
				    return false;
				}
				public Integer IWCS11Length(){
				    return null;
				}
				public Integer IWCS11Precision(){
				    return null;
				}
				public String IWCS11Default(){
				
					return "";
				
				}
				public String IWCS11Comment(){
				
				    return "";
				
				}
				public String IWCS11Pattern(){
				
					return "";
				
				}
				public String IWCS11OriginalDbColumnName(){
				
					return "IWCS11";
				
				}

				
			    public BigDecimal IWCS12;

				public BigDecimal getIWCS12 () {
					return this.IWCS12;
				}

				public Boolean IWCS12IsNullable(){
				    return true;
				}
				public Boolean IWCS12IsKey(){
				    return false;
				}
				public Integer IWCS12Length(){
				    return null;
				}
				public Integer IWCS12Precision(){
				    return null;
				}
				public String IWCS12Default(){
				
					return "";
				
				}
				public String IWCS12Comment(){
				
				    return "";
				
				}
				public String IWCS12Pattern(){
				
					return "";
				
				}
				public String IWCS12OriginalDbColumnName(){
				
					return "IWCS12";
				
				}

				
			    public BigDecimal IWCS13;

				public BigDecimal getIWCS13 () {
					return this.IWCS13;
				}

				public Boolean IWCS13IsNullable(){
				    return true;
				}
				public Boolean IWCS13IsKey(){
				    return false;
				}
				public Integer IWCS13Length(){
				    return null;
				}
				public Integer IWCS13Precision(){
				    return null;
				}
				public String IWCS13Default(){
				
					return "";
				
				}
				public String IWCS13Comment(){
				
				    return "";
				
				}
				public String IWCS13Pattern(){
				
					return "";
				
				}
				public String IWCS13OriginalDbColumnName(){
				
					return "IWCS13";
				
				}

				
			    public BigDecimal IWCS14;

				public BigDecimal getIWCS14 () {
					return this.IWCS14;
				}

				public Boolean IWCS14IsNullable(){
				    return true;
				}
				public Boolean IWCS14IsKey(){
				    return false;
				}
				public Integer IWCS14Length(){
				    return null;
				}
				public Integer IWCS14Precision(){
				    return null;
				}
				public String IWCS14Default(){
				
					return "";
				
				}
				public String IWCS14Comment(){
				
				    return "";
				
				}
				public String IWCS14Pattern(){
				
					return "";
				
				}
				public String IWCS14OriginalDbColumnName(){
				
					return "IWCS14";
				
				}

				
			    public BigDecimal IWCS15;

				public BigDecimal getIWCS15 () {
					return this.IWCS15;
				}

				public Boolean IWCS15IsNullable(){
				    return true;
				}
				public Boolean IWCS15IsKey(){
				    return false;
				}
				public Integer IWCS15Length(){
				    return null;
				}
				public Integer IWCS15Precision(){
				    return null;
				}
				public String IWCS15Default(){
				
					return "";
				
				}
				public String IWCS15Comment(){
				
				    return "";
				
				}
				public String IWCS15Pattern(){
				
					return "";
				
				}
				public String IWCS15OriginalDbColumnName(){
				
					return "IWCS15";
				
				}

				
			    public BigDecimal IWCS16;

				public BigDecimal getIWCS16 () {
					return this.IWCS16;
				}

				public Boolean IWCS16IsNullable(){
				    return true;
				}
				public Boolean IWCS16IsKey(){
				    return false;
				}
				public Integer IWCS16Length(){
				    return null;
				}
				public Integer IWCS16Precision(){
				    return null;
				}
				public String IWCS16Default(){
				
					return "";
				
				}
				public String IWCS16Comment(){
				
				    return "";
				
				}
				public String IWCS16Pattern(){
				
					return "";
				
				}
				public String IWCS16OriginalDbColumnName(){
				
					return "IWCS16";
				
				}

				
			    public BigDecimal IWCS17;

				public BigDecimal getIWCS17 () {
					return this.IWCS17;
				}

				public Boolean IWCS17IsNullable(){
				    return true;
				}
				public Boolean IWCS17IsKey(){
				    return false;
				}
				public Integer IWCS17Length(){
				    return null;
				}
				public Integer IWCS17Precision(){
				    return null;
				}
				public String IWCS17Default(){
				
					return "";
				
				}
				public String IWCS17Comment(){
				
				    return "";
				
				}
				public String IWCS17Pattern(){
				
					return "";
				
				}
				public String IWCS17OriginalDbColumnName(){
				
					return "IWCS17";
				
				}

				
			    public BigDecimal IWCS18;

				public BigDecimal getIWCS18 () {
					return this.IWCS18;
				}

				public Boolean IWCS18IsNullable(){
				    return true;
				}
				public Boolean IWCS18IsKey(){
				    return false;
				}
				public Integer IWCS18Length(){
				    return null;
				}
				public Integer IWCS18Precision(){
				    return null;
				}
				public String IWCS18Default(){
				
					return "";
				
				}
				public String IWCS18Comment(){
				
				    return "";
				
				}
				public String IWCS18Pattern(){
				
					return "";
				
				}
				public String IWCS18OriginalDbColumnName(){
				
					return "IWCS18";
				
				}

				
			    public BigDecimal IWCS19;

				public BigDecimal getIWCS19 () {
					return this.IWCS19;
				}

				public Boolean IWCS19IsNullable(){
				    return true;
				}
				public Boolean IWCS19IsKey(){
				    return false;
				}
				public Integer IWCS19Length(){
				    return null;
				}
				public Integer IWCS19Precision(){
				    return null;
				}
				public String IWCS19Default(){
				
					return "";
				
				}
				public String IWCS19Comment(){
				
				    return "";
				
				}
				public String IWCS19Pattern(){
				
					return "";
				
				}
				public String IWCS19OriginalDbColumnName(){
				
					return "IWCS19";
				
				}

				
			    public BigDecimal IWCS20;

				public BigDecimal getIWCS20 () {
					return this.IWCS20;
				}

				public Boolean IWCS20IsNullable(){
				    return true;
				}
				public Boolean IWCS20IsKey(){
				    return false;
				}
				public Integer IWCS20Length(){
				    return null;
				}
				public Integer IWCS20Precision(){
				    return null;
				}
				public String IWCS20Default(){
				
					return "";
				
				}
				public String IWCS20Comment(){
				
				    return "";
				
				}
				public String IWCS20Pattern(){
				
					return "";
				
				}
				public String IWCS20OriginalDbColumnName(){
				
					return "IWCS20";
				
				}

				
			    public BigDecimal IWCS21;

				public BigDecimal getIWCS21 () {
					return this.IWCS21;
				}

				public Boolean IWCS21IsNullable(){
				    return true;
				}
				public Boolean IWCS21IsKey(){
				    return false;
				}
				public Integer IWCS21Length(){
				    return null;
				}
				public Integer IWCS21Precision(){
				    return null;
				}
				public String IWCS21Default(){
				
					return "";
				
				}
				public String IWCS21Comment(){
				
				    return "";
				
				}
				public String IWCS21Pattern(){
				
					return "";
				
				}
				public String IWCS21OriginalDbColumnName(){
				
					return "IWCS21";
				
				}

				
			    public BigDecimal IWCS22;

				public BigDecimal getIWCS22 () {
					return this.IWCS22;
				}

				public Boolean IWCS22IsNullable(){
				    return true;
				}
				public Boolean IWCS22IsKey(){
				    return false;
				}
				public Integer IWCS22Length(){
				    return null;
				}
				public Integer IWCS22Precision(){
				    return null;
				}
				public String IWCS22Default(){
				
					return "";
				
				}
				public String IWCS22Comment(){
				
				    return "";
				
				}
				public String IWCS22Pattern(){
				
					return "";
				
				}
				public String IWCS22OriginalDbColumnName(){
				
					return "IWCS22";
				
				}

				
			    public BigDecimal IWCS23;

				public BigDecimal getIWCS23 () {
					return this.IWCS23;
				}

				public Boolean IWCS23IsNullable(){
				    return true;
				}
				public Boolean IWCS23IsKey(){
				    return false;
				}
				public Integer IWCS23Length(){
				    return null;
				}
				public Integer IWCS23Precision(){
				    return null;
				}
				public String IWCS23Default(){
				
					return "";
				
				}
				public String IWCS23Comment(){
				
				    return "";
				
				}
				public String IWCS23Pattern(){
				
					return "";
				
				}
				public String IWCS23OriginalDbColumnName(){
				
					return "IWCS23";
				
				}

				
			    public BigDecimal IWCS24;

				public BigDecimal getIWCS24 () {
					return this.IWCS24;
				}

				public Boolean IWCS24IsNullable(){
				    return true;
				}
				public Boolean IWCS24IsKey(){
				    return false;
				}
				public Integer IWCS24Length(){
				    return null;
				}
				public Integer IWCS24Precision(){
				    return null;
				}
				public String IWCS24Default(){
				
					return "";
				
				}
				public String IWCS24Comment(){
				
				    return "";
				
				}
				public String IWCS24Pattern(){
				
					return "";
				
				}
				public String IWCS24OriginalDbColumnName(){
				
					return "IWCS24";
				
				}

				
			    public BigDecimal IWCS25;

				public BigDecimal getIWCS25 () {
					return this.IWCS25;
				}

				public Boolean IWCS25IsNullable(){
				    return true;
				}
				public Boolean IWCS25IsKey(){
				    return false;
				}
				public Integer IWCS25Length(){
				    return null;
				}
				public Integer IWCS25Precision(){
				    return null;
				}
				public String IWCS25Default(){
				
					return "";
				
				}
				public String IWCS25Comment(){
				
				    return "";
				
				}
				public String IWCS25Pattern(){
				
					return "";
				
				}
				public String IWCS25OriginalDbColumnName(){
				
					return "IWCS25";
				
				}

				
			    public BigDecimal IWCS26;

				public BigDecimal getIWCS26 () {
					return this.IWCS26;
				}

				public Boolean IWCS26IsNullable(){
				    return true;
				}
				public Boolean IWCS26IsKey(){
				    return false;
				}
				public Integer IWCS26Length(){
				    return null;
				}
				public Integer IWCS26Precision(){
				    return null;
				}
				public String IWCS26Default(){
				
					return "";
				
				}
				public String IWCS26Comment(){
				
				    return "";
				
				}
				public String IWCS26Pattern(){
				
					return "";
				
				}
				public String IWCS26OriginalDbColumnName(){
				
					return "IWCS26";
				
				}

				
			    public BigDecimal IWCS27;

				public BigDecimal getIWCS27 () {
					return this.IWCS27;
				}

				public Boolean IWCS27IsNullable(){
				    return true;
				}
				public Boolean IWCS27IsKey(){
				    return false;
				}
				public Integer IWCS27Length(){
				    return null;
				}
				public Integer IWCS27Precision(){
				    return null;
				}
				public String IWCS27Default(){
				
					return "";
				
				}
				public String IWCS27Comment(){
				
				    return "";
				
				}
				public String IWCS27Pattern(){
				
					return "";
				
				}
				public String IWCS27OriginalDbColumnName(){
				
					return "IWCS27";
				
				}

				
			    public BigDecimal IWCS28;

				public BigDecimal getIWCS28 () {
					return this.IWCS28;
				}

				public Boolean IWCS28IsNullable(){
				    return true;
				}
				public Boolean IWCS28IsKey(){
				    return false;
				}
				public Integer IWCS28Length(){
				    return null;
				}
				public Integer IWCS28Precision(){
				    return null;
				}
				public String IWCS28Default(){
				
					return "";
				
				}
				public String IWCS28Comment(){
				
				    return "";
				
				}
				public String IWCS28Pattern(){
				
					return "";
				
				}
				public String IWCS28OriginalDbColumnName(){
				
					return "IWCS28";
				
				}

				
			    public BigDecimal IWCS29;

				public BigDecimal getIWCS29 () {
					return this.IWCS29;
				}

				public Boolean IWCS29IsNullable(){
				    return true;
				}
				public Boolean IWCS29IsKey(){
				    return false;
				}
				public Integer IWCS29Length(){
				    return null;
				}
				public Integer IWCS29Precision(){
				    return null;
				}
				public String IWCS29Default(){
				
					return "";
				
				}
				public String IWCS29Comment(){
				
				    return "";
				
				}
				public String IWCS29Pattern(){
				
					return "";
				
				}
				public String IWCS29OriginalDbColumnName(){
				
					return "IWCS29";
				
				}

				
			    public BigDecimal IWCS30;

				public BigDecimal getIWCS30 () {
					return this.IWCS30;
				}

				public Boolean IWCS30IsNullable(){
				    return true;
				}
				public Boolean IWCS30IsKey(){
				    return false;
				}
				public Integer IWCS30Length(){
				    return null;
				}
				public Integer IWCS30Precision(){
				    return null;
				}
				public String IWCS30Default(){
				
					return "";
				
				}
				public String IWCS30Comment(){
				
				    return "";
				
				}
				public String IWCS30Pattern(){
				
					return "";
				
				}
				public String IWCS30OriginalDbColumnName(){
				
					return "IWCS30";
				
				}

				
			    public BigDecimal IWCS31;

				public BigDecimal getIWCS31 () {
					return this.IWCS31;
				}

				public Boolean IWCS31IsNullable(){
				    return true;
				}
				public Boolean IWCS31IsKey(){
				    return false;
				}
				public Integer IWCS31Length(){
				    return null;
				}
				public Integer IWCS31Precision(){
				    return null;
				}
				public String IWCS31Default(){
				
					return "";
				
				}
				public String IWCS31Comment(){
				
				    return "";
				
				}
				public String IWCS31Pattern(){
				
					return "";
				
				}
				public String IWCS31OriginalDbColumnName(){
				
					return "IWCS31";
				
				}

				
			    public BigDecimal IWCS32;

				public BigDecimal getIWCS32 () {
					return this.IWCS32;
				}

				public Boolean IWCS32IsNullable(){
				    return true;
				}
				public Boolean IWCS32IsKey(){
				    return false;
				}
				public Integer IWCS32Length(){
				    return null;
				}
				public Integer IWCS32Precision(){
				    return null;
				}
				public String IWCS32Default(){
				
					return "";
				
				}
				public String IWCS32Comment(){
				
				    return "";
				
				}
				public String IWCS32Pattern(){
				
					return "";
				
				}
				public String IWCS32OriginalDbColumnName(){
				
					return "IWCS32";
				
				}

				
			    public BigDecimal IWCS33;

				public BigDecimal getIWCS33 () {
					return this.IWCS33;
				}

				public Boolean IWCS33IsNullable(){
				    return true;
				}
				public Boolean IWCS33IsKey(){
				    return false;
				}
				public Integer IWCS33Length(){
				    return null;
				}
				public Integer IWCS33Precision(){
				    return null;
				}
				public String IWCS33Default(){
				
					return "";
				
				}
				public String IWCS33Comment(){
				
				    return "";
				
				}
				public String IWCS33Pattern(){
				
					return "";
				
				}
				public String IWCS33OriginalDbColumnName(){
				
					return "IWCS33";
				
				}

				
			    public BigDecimal IWCS34;

				public BigDecimal getIWCS34 () {
					return this.IWCS34;
				}

				public Boolean IWCS34IsNullable(){
				    return true;
				}
				public Boolean IWCS34IsKey(){
				    return false;
				}
				public Integer IWCS34Length(){
				    return null;
				}
				public Integer IWCS34Precision(){
				    return null;
				}
				public String IWCS34Default(){
				
					return "";
				
				}
				public String IWCS34Comment(){
				
				    return "";
				
				}
				public String IWCS34Pattern(){
				
					return "";
				
				}
				public String IWCS34OriginalDbColumnName(){
				
					return "IWCS34";
				
				}

				
			    public BigDecimal IWCS35;

				public BigDecimal getIWCS35 () {
					return this.IWCS35;
				}

				public Boolean IWCS35IsNullable(){
				    return true;
				}
				public Boolean IWCS35IsKey(){
				    return false;
				}
				public Integer IWCS35Length(){
				    return null;
				}
				public Integer IWCS35Precision(){
				    return null;
				}
				public String IWCS35Default(){
				
					return "";
				
				}
				public String IWCS35Comment(){
				
				    return "";
				
				}
				public String IWCS35Pattern(){
				
					return "";
				
				}
				public String IWCS35OriginalDbColumnName(){
				
					return "IWCS35";
				
				}

				
			    public BigDecimal IWCS36;

				public BigDecimal getIWCS36 () {
					return this.IWCS36;
				}

				public Boolean IWCS36IsNullable(){
				    return true;
				}
				public Boolean IWCS36IsKey(){
				    return false;
				}
				public Integer IWCS36Length(){
				    return null;
				}
				public Integer IWCS36Precision(){
				    return null;
				}
				public String IWCS36Default(){
				
					return "";
				
				}
				public String IWCS36Comment(){
				
				    return "";
				
				}
				public String IWCS36Pattern(){
				
					return "";
				
				}
				public String IWCS36OriginalDbColumnName(){
				
					return "IWCS36";
				
				}

				
			    public BigDecimal IWCS37;

				public BigDecimal getIWCS37 () {
					return this.IWCS37;
				}

				public Boolean IWCS37IsNullable(){
				    return true;
				}
				public Boolean IWCS37IsKey(){
				    return false;
				}
				public Integer IWCS37Length(){
				    return null;
				}
				public Integer IWCS37Precision(){
				    return null;
				}
				public String IWCS37Default(){
				
					return "";
				
				}
				public String IWCS37Comment(){
				
				    return "";
				
				}
				public String IWCS37Pattern(){
				
					return "";
				
				}
				public String IWCS37OriginalDbColumnName(){
				
					return "IWCS37";
				
				}

				
			    public BigDecimal IWCS38;

				public BigDecimal getIWCS38 () {
					return this.IWCS38;
				}

				public Boolean IWCS38IsNullable(){
				    return true;
				}
				public Boolean IWCS38IsKey(){
				    return false;
				}
				public Integer IWCS38Length(){
				    return null;
				}
				public Integer IWCS38Precision(){
				    return null;
				}
				public String IWCS38Default(){
				
					return "";
				
				}
				public String IWCS38Comment(){
				
				    return "";
				
				}
				public String IWCS38Pattern(){
				
					return "";
				
				}
				public String IWCS38OriginalDbColumnName(){
				
					return "IWCS38";
				
				}

				
			    public BigDecimal IWCS39;

				public BigDecimal getIWCS39 () {
					return this.IWCS39;
				}

				public Boolean IWCS39IsNullable(){
				    return true;
				}
				public Boolean IWCS39IsKey(){
				    return false;
				}
				public Integer IWCS39Length(){
				    return null;
				}
				public Integer IWCS39Precision(){
				    return null;
				}
				public String IWCS39Default(){
				
					return "";
				
				}
				public String IWCS39Comment(){
				
				    return "";
				
				}
				public String IWCS39Pattern(){
				
					return "";
				
				}
				public String IWCS39OriginalDbColumnName(){
				
					return "IWCS39";
				
				}

				
			    public BigDecimal IWCS40;

				public BigDecimal getIWCS40 () {
					return this.IWCS40;
				}

				public Boolean IWCS40IsNullable(){
				    return true;
				}
				public Boolean IWCS40IsKey(){
				    return false;
				}
				public Integer IWCS40Length(){
				    return null;
				}
				public Integer IWCS40Precision(){
				    return null;
				}
				public String IWCS40Default(){
				
					return "";
				
				}
				public String IWCS40Comment(){
				
				    return "";
				
				}
				public String IWCS40Pattern(){
				
					return "";
				
				}
				public String IWCS40OriginalDbColumnName(){
				
					return "IWCS40";
				
				}

				
			    public BigDecimal IWCS41;

				public BigDecimal getIWCS41 () {
					return this.IWCS41;
				}

				public Boolean IWCS41IsNullable(){
				    return true;
				}
				public Boolean IWCS41IsKey(){
				    return false;
				}
				public Integer IWCS41Length(){
				    return null;
				}
				public Integer IWCS41Precision(){
				    return null;
				}
				public String IWCS41Default(){
				
					return "";
				
				}
				public String IWCS41Comment(){
				
				    return "";
				
				}
				public String IWCS41Pattern(){
				
					return "";
				
				}
				public String IWCS41OriginalDbColumnName(){
				
					return "IWCS41";
				
				}

				
			    public BigDecimal IWCS42;

				public BigDecimal getIWCS42 () {
					return this.IWCS42;
				}

				public Boolean IWCS42IsNullable(){
				    return true;
				}
				public Boolean IWCS42IsKey(){
				    return false;
				}
				public Integer IWCS42Length(){
				    return null;
				}
				public Integer IWCS42Precision(){
				    return null;
				}
				public String IWCS42Default(){
				
					return "";
				
				}
				public String IWCS42Comment(){
				
				    return "";
				
				}
				public String IWCS42Pattern(){
				
					return "";
				
				}
				public String IWCS42OriginalDbColumnName(){
				
					return "IWCS42";
				
				}

				
			    public BigDecimal IWCS43;

				public BigDecimal getIWCS43 () {
					return this.IWCS43;
				}

				public Boolean IWCS43IsNullable(){
				    return true;
				}
				public Boolean IWCS43IsKey(){
				    return false;
				}
				public Integer IWCS43Length(){
				    return null;
				}
				public Integer IWCS43Precision(){
				    return null;
				}
				public String IWCS43Default(){
				
					return "";
				
				}
				public String IWCS43Comment(){
				
				    return "";
				
				}
				public String IWCS43Pattern(){
				
					return "";
				
				}
				public String IWCS43OriginalDbColumnName(){
				
					return "IWCS43";
				
				}

				
			    public BigDecimal IWCS44;

				public BigDecimal getIWCS44 () {
					return this.IWCS44;
				}

				public Boolean IWCS44IsNullable(){
				    return true;
				}
				public Boolean IWCS44IsKey(){
				    return false;
				}
				public Integer IWCS44Length(){
				    return null;
				}
				public Integer IWCS44Precision(){
				    return null;
				}
				public String IWCS44Default(){
				
					return "";
				
				}
				public String IWCS44Comment(){
				
				    return "";
				
				}
				public String IWCS44Pattern(){
				
					return "";
				
				}
				public String IWCS44OriginalDbColumnName(){
				
					return "IWCS44";
				
				}

				
			    public BigDecimal IWCS45;

				public BigDecimal getIWCS45 () {
					return this.IWCS45;
				}

				public Boolean IWCS45IsNullable(){
				    return true;
				}
				public Boolean IWCS45IsKey(){
				    return false;
				}
				public Integer IWCS45Length(){
				    return null;
				}
				public Integer IWCS45Precision(){
				    return null;
				}
				public String IWCS45Default(){
				
					return "";
				
				}
				public String IWCS45Comment(){
				
				    return "";
				
				}
				public String IWCS45Pattern(){
				
					return "";
				
				}
				public String IWCS45OriginalDbColumnName(){
				
					return "IWCS45";
				
				}

				
			    public BigDecimal IWCS46;

				public BigDecimal getIWCS46 () {
					return this.IWCS46;
				}

				public Boolean IWCS46IsNullable(){
				    return true;
				}
				public Boolean IWCS46IsKey(){
				    return false;
				}
				public Integer IWCS46Length(){
				    return null;
				}
				public Integer IWCS46Precision(){
				    return null;
				}
				public String IWCS46Default(){
				
					return "";
				
				}
				public String IWCS46Comment(){
				
				    return "";
				
				}
				public String IWCS46Pattern(){
				
					return "";
				
				}
				public String IWCS46OriginalDbColumnName(){
				
					return "IWCS46";
				
				}

				
			    public BigDecimal IWCS47;

				public BigDecimal getIWCS47 () {
					return this.IWCS47;
				}

				public Boolean IWCS47IsNullable(){
				    return true;
				}
				public Boolean IWCS47IsKey(){
				    return false;
				}
				public Integer IWCS47Length(){
				    return null;
				}
				public Integer IWCS47Precision(){
				    return null;
				}
				public String IWCS47Default(){
				
					return "";
				
				}
				public String IWCS47Comment(){
				
				    return "";
				
				}
				public String IWCS47Pattern(){
				
					return "";
				
				}
				public String IWCS47OriginalDbColumnName(){
				
					return "IWCS47";
				
				}

				
			    public BigDecimal IWCS48;

				public BigDecimal getIWCS48 () {
					return this.IWCS48;
				}

				public Boolean IWCS48IsNullable(){
				    return true;
				}
				public Boolean IWCS48IsKey(){
				    return false;
				}
				public Integer IWCS48Length(){
				    return null;
				}
				public Integer IWCS48Precision(){
				    return null;
				}
				public String IWCS48Default(){
				
					return "";
				
				}
				public String IWCS48Comment(){
				
				    return "";
				
				}
				public String IWCS48Pattern(){
				
					return "";
				
				}
				public String IWCS48OriginalDbColumnName(){
				
					return "IWCS48";
				
				}

				
			    public BigDecimal IWCS49;

				public BigDecimal getIWCS49 () {
					return this.IWCS49;
				}

				public Boolean IWCS49IsNullable(){
				    return true;
				}
				public Boolean IWCS49IsKey(){
				    return false;
				}
				public Integer IWCS49Length(){
				    return null;
				}
				public Integer IWCS49Precision(){
				    return null;
				}
				public String IWCS49Default(){
				
					return "";
				
				}
				public String IWCS49Comment(){
				
				    return "";
				
				}
				public String IWCS49Pattern(){
				
					return "";
				
				}
				public String IWCS49OriginalDbColumnName(){
				
					return "IWCS49";
				
				}

				
			    public BigDecimal IWCS50;

				public BigDecimal getIWCS50 () {
					return this.IWCS50;
				}

				public Boolean IWCS50IsNullable(){
				    return true;
				}
				public Boolean IWCS50IsKey(){
				    return false;
				}
				public Integer IWCS50Length(){
				    return null;
				}
				public Integer IWCS50Precision(){
				    return null;
				}
				public String IWCS50Default(){
				
					return "";
				
				}
				public String IWCS50Comment(){
				
				    return "";
				
				}
				public String IWCS50Pattern(){
				
					return "";
				
				}
				public String IWCS50OriginalDbColumnName(){
				
					return "IWCS50";
				
				}

				
			    public BigDecimal IWCS51;

				public BigDecimal getIWCS51 () {
					return this.IWCS51;
				}

				public Boolean IWCS51IsNullable(){
				    return true;
				}
				public Boolean IWCS51IsKey(){
				    return false;
				}
				public Integer IWCS51Length(){
				    return null;
				}
				public Integer IWCS51Precision(){
				    return null;
				}
				public String IWCS51Default(){
				
					return "";
				
				}
				public String IWCS51Comment(){
				
				    return "";
				
				}
				public String IWCS51Pattern(){
				
					return "";
				
				}
				public String IWCS51OriginalDbColumnName(){
				
					return "IWCS51";
				
				}

				
			    public BigDecimal IWCS52;

				public BigDecimal getIWCS52 () {
					return this.IWCS52;
				}

				public Boolean IWCS52IsNullable(){
				    return true;
				}
				public Boolean IWCS52IsKey(){
				    return false;
				}
				public Integer IWCS52Length(){
				    return null;
				}
				public Integer IWCS52Precision(){
				    return null;
				}
				public String IWCS52Default(){
				
					return "";
				
				}
				public String IWCS52Comment(){
				
				    return "";
				
				}
				public String IWCS52Pattern(){
				
					return "";
				
				}
				public String IWCS52OriginalDbColumnName(){
				
					return "IWCS52";
				
				}

				
			    public BigDecimal IWCS53;

				public BigDecimal getIWCS53 () {
					return this.IWCS53;
				}

				public Boolean IWCS53IsNullable(){
				    return true;
				}
				public Boolean IWCS53IsKey(){
				    return false;
				}
				public Integer IWCS53Length(){
				    return null;
				}
				public Integer IWCS53Precision(){
				    return null;
				}
				public String IWCS53Default(){
				
					return "";
				
				}
				public String IWCS53Comment(){
				
				    return "";
				
				}
				public String IWCS53Pattern(){
				
					return "";
				
				}
				public String IWCS53OriginalDbColumnName(){
				
					return "IWCS53";
				
				}

				
			    public BigDecimal IWVT01;

				public BigDecimal getIWVT01 () {
					return this.IWVT01;
				}

				public Boolean IWVT01IsNullable(){
				    return true;
				}
				public Boolean IWVT01IsKey(){
				    return false;
				}
				public Integer IWVT01Length(){
				    return null;
				}
				public Integer IWVT01Precision(){
				    return null;
				}
				public String IWVT01Default(){
				
					return "";
				
				}
				public String IWVT01Comment(){
				
				    return "";
				
				}
				public String IWVT01Pattern(){
				
					return "";
				
				}
				public String IWVT01OriginalDbColumnName(){
				
					return "IWVT01";
				
				}

				
			    public BigDecimal IWVT02;

				public BigDecimal getIWVT02 () {
					return this.IWVT02;
				}

				public Boolean IWVT02IsNullable(){
				    return true;
				}
				public Boolean IWVT02IsKey(){
				    return false;
				}
				public Integer IWVT02Length(){
				    return null;
				}
				public Integer IWVT02Precision(){
				    return null;
				}
				public String IWVT02Default(){
				
					return "";
				
				}
				public String IWVT02Comment(){
				
				    return "";
				
				}
				public String IWVT02Pattern(){
				
					return "";
				
				}
				public String IWVT02OriginalDbColumnName(){
				
					return "IWVT02";
				
				}

				
			    public BigDecimal IWVT03;

				public BigDecimal getIWVT03 () {
					return this.IWVT03;
				}

				public Boolean IWVT03IsNullable(){
				    return true;
				}
				public Boolean IWVT03IsKey(){
				    return false;
				}
				public Integer IWVT03Length(){
				    return null;
				}
				public Integer IWVT03Precision(){
				    return null;
				}
				public String IWVT03Default(){
				
					return "";
				
				}
				public String IWVT03Comment(){
				
				    return "";
				
				}
				public String IWVT03Pattern(){
				
					return "";
				
				}
				public String IWVT03OriginalDbColumnName(){
				
					return "IWVT03";
				
				}

				
			    public BigDecimal IWVT04;

				public BigDecimal getIWVT04 () {
					return this.IWVT04;
				}

				public Boolean IWVT04IsNullable(){
				    return true;
				}
				public Boolean IWVT04IsKey(){
				    return false;
				}
				public Integer IWVT04Length(){
				    return null;
				}
				public Integer IWVT04Precision(){
				    return null;
				}
				public String IWVT04Default(){
				
					return "";
				
				}
				public String IWVT04Comment(){
				
				    return "";
				
				}
				public String IWVT04Pattern(){
				
					return "";
				
				}
				public String IWVT04OriginalDbColumnName(){
				
					return "IWVT04";
				
				}

				
			    public BigDecimal IWVT05;

				public BigDecimal getIWVT05 () {
					return this.IWVT05;
				}

				public Boolean IWVT05IsNullable(){
				    return true;
				}
				public Boolean IWVT05IsKey(){
				    return false;
				}
				public Integer IWVT05Length(){
				    return null;
				}
				public Integer IWVT05Precision(){
				    return null;
				}
				public String IWVT05Default(){
				
					return "";
				
				}
				public String IWVT05Comment(){
				
				    return "";
				
				}
				public String IWVT05Pattern(){
				
					return "";
				
				}
				public String IWVT05OriginalDbColumnName(){
				
					return "IWVT05";
				
				}

				
			    public BigDecimal IWVT06;

				public BigDecimal getIWVT06 () {
					return this.IWVT06;
				}

				public Boolean IWVT06IsNullable(){
				    return true;
				}
				public Boolean IWVT06IsKey(){
				    return false;
				}
				public Integer IWVT06Length(){
				    return null;
				}
				public Integer IWVT06Precision(){
				    return null;
				}
				public String IWVT06Default(){
				
					return "";
				
				}
				public String IWVT06Comment(){
				
				    return "";
				
				}
				public String IWVT06Pattern(){
				
					return "";
				
				}
				public String IWVT06OriginalDbColumnName(){
				
					return "IWVT06";
				
				}

				
			    public BigDecimal IWVT07;

				public BigDecimal getIWVT07 () {
					return this.IWVT07;
				}

				public Boolean IWVT07IsNullable(){
				    return true;
				}
				public Boolean IWVT07IsKey(){
				    return false;
				}
				public Integer IWVT07Length(){
				    return null;
				}
				public Integer IWVT07Precision(){
				    return null;
				}
				public String IWVT07Default(){
				
					return "";
				
				}
				public String IWVT07Comment(){
				
				    return "";
				
				}
				public String IWVT07Pattern(){
				
					return "";
				
				}
				public String IWVT07OriginalDbColumnName(){
				
					return "IWVT07";
				
				}

				
			    public BigDecimal IWVT08;

				public BigDecimal getIWVT08 () {
					return this.IWVT08;
				}

				public Boolean IWVT08IsNullable(){
				    return true;
				}
				public Boolean IWVT08IsKey(){
				    return false;
				}
				public Integer IWVT08Length(){
				    return null;
				}
				public Integer IWVT08Precision(){
				    return null;
				}
				public String IWVT08Default(){
				
					return "";
				
				}
				public String IWVT08Comment(){
				
				    return "";
				
				}
				public String IWVT08Pattern(){
				
					return "";
				
				}
				public String IWVT08OriginalDbColumnName(){
				
					return "IWVT08";
				
				}

				
			    public BigDecimal IWVT09;

				public BigDecimal getIWVT09 () {
					return this.IWVT09;
				}

				public Boolean IWVT09IsNullable(){
				    return true;
				}
				public Boolean IWVT09IsKey(){
				    return false;
				}
				public Integer IWVT09Length(){
				    return null;
				}
				public Integer IWVT09Precision(){
				    return null;
				}
				public String IWVT09Default(){
				
					return "";
				
				}
				public String IWVT09Comment(){
				
				    return "";
				
				}
				public String IWVT09Pattern(){
				
					return "";
				
				}
				public String IWVT09OriginalDbColumnName(){
				
					return "IWVT09";
				
				}

				
			    public BigDecimal IWVT10;

				public BigDecimal getIWVT10 () {
					return this.IWVT10;
				}

				public Boolean IWVT10IsNullable(){
				    return true;
				}
				public Boolean IWVT10IsKey(){
				    return false;
				}
				public Integer IWVT10Length(){
				    return null;
				}
				public Integer IWVT10Precision(){
				    return null;
				}
				public String IWVT10Default(){
				
					return "";
				
				}
				public String IWVT10Comment(){
				
				    return "";
				
				}
				public String IWVT10Pattern(){
				
					return "";
				
				}
				public String IWVT10OriginalDbColumnName(){
				
					return "IWVT10";
				
				}

				
			    public BigDecimal IWVT11;

				public BigDecimal getIWVT11 () {
					return this.IWVT11;
				}

				public Boolean IWVT11IsNullable(){
				    return true;
				}
				public Boolean IWVT11IsKey(){
				    return false;
				}
				public Integer IWVT11Length(){
				    return null;
				}
				public Integer IWVT11Precision(){
				    return null;
				}
				public String IWVT11Default(){
				
					return "";
				
				}
				public String IWVT11Comment(){
				
				    return "";
				
				}
				public String IWVT11Pattern(){
				
					return "";
				
				}
				public String IWVT11OriginalDbColumnName(){
				
					return "IWVT11";
				
				}

				
			    public BigDecimal IWVT12;

				public BigDecimal getIWVT12 () {
					return this.IWVT12;
				}

				public Boolean IWVT12IsNullable(){
				    return true;
				}
				public Boolean IWVT12IsKey(){
				    return false;
				}
				public Integer IWVT12Length(){
				    return null;
				}
				public Integer IWVT12Precision(){
				    return null;
				}
				public String IWVT12Default(){
				
					return "";
				
				}
				public String IWVT12Comment(){
				
				    return "";
				
				}
				public String IWVT12Pattern(){
				
					return "";
				
				}
				public String IWVT12OriginalDbColumnName(){
				
					return "IWVT12";
				
				}

				
			    public BigDecimal IWVT13;

				public BigDecimal getIWVT13 () {
					return this.IWVT13;
				}

				public Boolean IWVT13IsNullable(){
				    return true;
				}
				public Boolean IWVT13IsKey(){
				    return false;
				}
				public Integer IWVT13Length(){
				    return null;
				}
				public Integer IWVT13Precision(){
				    return null;
				}
				public String IWVT13Default(){
				
					return "";
				
				}
				public String IWVT13Comment(){
				
				    return "";
				
				}
				public String IWVT13Pattern(){
				
					return "";
				
				}
				public String IWVT13OriginalDbColumnName(){
				
					return "IWVT13";
				
				}

				
			    public BigDecimal IWVT14;

				public BigDecimal getIWVT14 () {
					return this.IWVT14;
				}

				public Boolean IWVT14IsNullable(){
				    return true;
				}
				public Boolean IWVT14IsKey(){
				    return false;
				}
				public Integer IWVT14Length(){
				    return null;
				}
				public Integer IWVT14Precision(){
				    return null;
				}
				public String IWVT14Default(){
				
					return "";
				
				}
				public String IWVT14Comment(){
				
				    return "";
				
				}
				public String IWVT14Pattern(){
				
					return "";
				
				}
				public String IWVT14OriginalDbColumnName(){
				
					return "IWVT14";
				
				}

				
			    public BigDecimal IWVT15;

				public BigDecimal getIWVT15 () {
					return this.IWVT15;
				}

				public Boolean IWVT15IsNullable(){
				    return true;
				}
				public Boolean IWVT15IsKey(){
				    return false;
				}
				public Integer IWVT15Length(){
				    return null;
				}
				public Integer IWVT15Precision(){
				    return null;
				}
				public String IWVT15Default(){
				
					return "";
				
				}
				public String IWVT15Comment(){
				
				    return "";
				
				}
				public String IWVT15Pattern(){
				
					return "";
				
				}
				public String IWVT15OriginalDbColumnName(){
				
					return "IWVT15";
				
				}

				
			    public BigDecimal IWVT16;

				public BigDecimal getIWVT16 () {
					return this.IWVT16;
				}

				public Boolean IWVT16IsNullable(){
				    return true;
				}
				public Boolean IWVT16IsKey(){
				    return false;
				}
				public Integer IWVT16Length(){
				    return null;
				}
				public Integer IWVT16Precision(){
				    return null;
				}
				public String IWVT16Default(){
				
					return "";
				
				}
				public String IWVT16Comment(){
				
				    return "";
				
				}
				public String IWVT16Pattern(){
				
					return "";
				
				}
				public String IWVT16OriginalDbColumnName(){
				
					return "IWVT16";
				
				}

				
			    public BigDecimal IWVT17;

				public BigDecimal getIWVT17 () {
					return this.IWVT17;
				}

				public Boolean IWVT17IsNullable(){
				    return true;
				}
				public Boolean IWVT17IsKey(){
				    return false;
				}
				public Integer IWVT17Length(){
				    return null;
				}
				public Integer IWVT17Precision(){
				    return null;
				}
				public String IWVT17Default(){
				
					return "";
				
				}
				public String IWVT17Comment(){
				
				    return "";
				
				}
				public String IWVT17Pattern(){
				
					return "";
				
				}
				public String IWVT17OriginalDbColumnName(){
				
					return "IWVT17";
				
				}

				
			    public BigDecimal IWVT18;

				public BigDecimal getIWVT18 () {
					return this.IWVT18;
				}

				public Boolean IWVT18IsNullable(){
				    return true;
				}
				public Boolean IWVT18IsKey(){
				    return false;
				}
				public Integer IWVT18Length(){
				    return null;
				}
				public Integer IWVT18Precision(){
				    return null;
				}
				public String IWVT18Default(){
				
					return "";
				
				}
				public String IWVT18Comment(){
				
				    return "";
				
				}
				public String IWVT18Pattern(){
				
					return "";
				
				}
				public String IWVT18OriginalDbColumnName(){
				
					return "IWVT18";
				
				}

				
			    public BigDecimal IWVT19;

				public BigDecimal getIWVT19 () {
					return this.IWVT19;
				}

				public Boolean IWVT19IsNullable(){
				    return true;
				}
				public Boolean IWVT19IsKey(){
				    return false;
				}
				public Integer IWVT19Length(){
				    return null;
				}
				public Integer IWVT19Precision(){
				    return null;
				}
				public String IWVT19Default(){
				
					return "";
				
				}
				public String IWVT19Comment(){
				
				    return "";
				
				}
				public String IWVT19Pattern(){
				
					return "";
				
				}
				public String IWVT19OriginalDbColumnName(){
				
					return "IWVT19";
				
				}

				
			    public BigDecimal IWVT20;

				public BigDecimal getIWVT20 () {
					return this.IWVT20;
				}

				public Boolean IWVT20IsNullable(){
				    return true;
				}
				public Boolean IWVT20IsKey(){
				    return false;
				}
				public Integer IWVT20Length(){
				    return null;
				}
				public Integer IWVT20Precision(){
				    return null;
				}
				public String IWVT20Default(){
				
					return "";
				
				}
				public String IWVT20Comment(){
				
				    return "";
				
				}
				public String IWVT20Pattern(){
				
					return "";
				
				}
				public String IWVT20OriginalDbColumnName(){
				
					return "IWVT20";
				
				}

				
			    public BigDecimal IWVT21;

				public BigDecimal getIWVT21 () {
					return this.IWVT21;
				}

				public Boolean IWVT21IsNullable(){
				    return true;
				}
				public Boolean IWVT21IsKey(){
				    return false;
				}
				public Integer IWVT21Length(){
				    return null;
				}
				public Integer IWVT21Precision(){
				    return null;
				}
				public String IWVT21Default(){
				
					return "";
				
				}
				public String IWVT21Comment(){
				
				    return "";
				
				}
				public String IWVT21Pattern(){
				
					return "";
				
				}
				public String IWVT21OriginalDbColumnName(){
				
					return "IWVT21";
				
				}

				
			    public BigDecimal IWVT22;

				public BigDecimal getIWVT22 () {
					return this.IWVT22;
				}

				public Boolean IWVT22IsNullable(){
				    return true;
				}
				public Boolean IWVT22IsKey(){
				    return false;
				}
				public Integer IWVT22Length(){
				    return null;
				}
				public Integer IWVT22Precision(){
				    return null;
				}
				public String IWVT22Default(){
				
					return "";
				
				}
				public String IWVT22Comment(){
				
				    return "";
				
				}
				public String IWVT22Pattern(){
				
					return "";
				
				}
				public String IWVT22OriginalDbColumnName(){
				
					return "IWVT22";
				
				}

				
			    public BigDecimal IWVT23;

				public BigDecimal getIWVT23 () {
					return this.IWVT23;
				}

				public Boolean IWVT23IsNullable(){
				    return true;
				}
				public Boolean IWVT23IsKey(){
				    return false;
				}
				public Integer IWVT23Length(){
				    return null;
				}
				public Integer IWVT23Precision(){
				    return null;
				}
				public String IWVT23Default(){
				
					return "";
				
				}
				public String IWVT23Comment(){
				
				    return "";
				
				}
				public String IWVT23Pattern(){
				
					return "";
				
				}
				public String IWVT23OriginalDbColumnName(){
				
					return "IWVT23";
				
				}

				
			    public BigDecimal IWVT24;

				public BigDecimal getIWVT24 () {
					return this.IWVT24;
				}

				public Boolean IWVT24IsNullable(){
				    return true;
				}
				public Boolean IWVT24IsKey(){
				    return false;
				}
				public Integer IWVT24Length(){
				    return null;
				}
				public Integer IWVT24Precision(){
				    return null;
				}
				public String IWVT24Default(){
				
					return "";
				
				}
				public String IWVT24Comment(){
				
				    return "";
				
				}
				public String IWVT24Pattern(){
				
					return "";
				
				}
				public String IWVT24OriginalDbColumnName(){
				
					return "IWVT24";
				
				}

				
			    public BigDecimal IWVT25;

				public BigDecimal getIWVT25 () {
					return this.IWVT25;
				}

				public Boolean IWVT25IsNullable(){
				    return true;
				}
				public Boolean IWVT25IsKey(){
				    return false;
				}
				public Integer IWVT25Length(){
				    return null;
				}
				public Integer IWVT25Precision(){
				    return null;
				}
				public String IWVT25Default(){
				
					return "";
				
				}
				public String IWVT25Comment(){
				
				    return "";
				
				}
				public String IWVT25Pattern(){
				
					return "";
				
				}
				public String IWVT25OriginalDbColumnName(){
				
					return "IWVT25";
				
				}

				
			    public BigDecimal IWVT26;

				public BigDecimal getIWVT26 () {
					return this.IWVT26;
				}

				public Boolean IWVT26IsNullable(){
				    return true;
				}
				public Boolean IWVT26IsKey(){
				    return false;
				}
				public Integer IWVT26Length(){
				    return null;
				}
				public Integer IWVT26Precision(){
				    return null;
				}
				public String IWVT26Default(){
				
					return "";
				
				}
				public String IWVT26Comment(){
				
				    return "";
				
				}
				public String IWVT26Pattern(){
				
					return "";
				
				}
				public String IWVT26OriginalDbColumnName(){
				
					return "IWVT26";
				
				}

				
			    public BigDecimal IWVT27;

				public BigDecimal getIWVT27 () {
					return this.IWVT27;
				}

				public Boolean IWVT27IsNullable(){
				    return true;
				}
				public Boolean IWVT27IsKey(){
				    return false;
				}
				public Integer IWVT27Length(){
				    return null;
				}
				public Integer IWVT27Precision(){
				    return null;
				}
				public String IWVT27Default(){
				
					return "";
				
				}
				public String IWVT27Comment(){
				
				    return "";
				
				}
				public String IWVT27Pattern(){
				
					return "";
				
				}
				public String IWVT27OriginalDbColumnName(){
				
					return "IWVT27";
				
				}

				
			    public BigDecimal IWVT28;

				public BigDecimal getIWVT28 () {
					return this.IWVT28;
				}

				public Boolean IWVT28IsNullable(){
				    return true;
				}
				public Boolean IWVT28IsKey(){
				    return false;
				}
				public Integer IWVT28Length(){
				    return null;
				}
				public Integer IWVT28Precision(){
				    return null;
				}
				public String IWVT28Default(){
				
					return "";
				
				}
				public String IWVT28Comment(){
				
				    return "";
				
				}
				public String IWVT28Pattern(){
				
					return "";
				
				}
				public String IWVT28OriginalDbColumnName(){
				
					return "IWVT28";
				
				}

				
			    public BigDecimal IWVT29;

				public BigDecimal getIWVT29 () {
					return this.IWVT29;
				}

				public Boolean IWVT29IsNullable(){
				    return true;
				}
				public Boolean IWVT29IsKey(){
				    return false;
				}
				public Integer IWVT29Length(){
				    return null;
				}
				public Integer IWVT29Precision(){
				    return null;
				}
				public String IWVT29Default(){
				
					return "";
				
				}
				public String IWVT29Comment(){
				
				    return "";
				
				}
				public String IWVT29Pattern(){
				
					return "";
				
				}
				public String IWVT29OriginalDbColumnName(){
				
					return "IWVT29";
				
				}

				
			    public BigDecimal IWVT30;

				public BigDecimal getIWVT30 () {
					return this.IWVT30;
				}

				public Boolean IWVT30IsNullable(){
				    return true;
				}
				public Boolean IWVT30IsKey(){
				    return false;
				}
				public Integer IWVT30Length(){
				    return null;
				}
				public Integer IWVT30Precision(){
				    return null;
				}
				public String IWVT30Default(){
				
					return "";
				
				}
				public String IWVT30Comment(){
				
				    return "";
				
				}
				public String IWVT30Pattern(){
				
					return "";
				
				}
				public String IWVT30OriginalDbColumnName(){
				
					return "IWVT30";
				
				}

				
			    public BigDecimal IWVT31;

				public BigDecimal getIWVT31 () {
					return this.IWVT31;
				}

				public Boolean IWVT31IsNullable(){
				    return true;
				}
				public Boolean IWVT31IsKey(){
				    return false;
				}
				public Integer IWVT31Length(){
				    return null;
				}
				public Integer IWVT31Precision(){
				    return null;
				}
				public String IWVT31Default(){
				
					return "";
				
				}
				public String IWVT31Comment(){
				
				    return "";
				
				}
				public String IWVT31Pattern(){
				
					return "";
				
				}
				public String IWVT31OriginalDbColumnName(){
				
					return "IWVT31";
				
				}

				
			    public BigDecimal IWVT32;

				public BigDecimal getIWVT32 () {
					return this.IWVT32;
				}

				public Boolean IWVT32IsNullable(){
				    return true;
				}
				public Boolean IWVT32IsKey(){
				    return false;
				}
				public Integer IWVT32Length(){
				    return null;
				}
				public Integer IWVT32Precision(){
				    return null;
				}
				public String IWVT32Default(){
				
					return "";
				
				}
				public String IWVT32Comment(){
				
				    return "";
				
				}
				public String IWVT32Pattern(){
				
					return "";
				
				}
				public String IWVT32OriginalDbColumnName(){
				
					return "IWVT32";
				
				}

				
			    public BigDecimal IWVT33;

				public BigDecimal getIWVT33 () {
					return this.IWVT33;
				}

				public Boolean IWVT33IsNullable(){
				    return true;
				}
				public Boolean IWVT33IsKey(){
				    return false;
				}
				public Integer IWVT33Length(){
				    return null;
				}
				public Integer IWVT33Precision(){
				    return null;
				}
				public String IWVT33Default(){
				
					return "";
				
				}
				public String IWVT33Comment(){
				
				    return "";
				
				}
				public String IWVT33Pattern(){
				
					return "";
				
				}
				public String IWVT33OriginalDbColumnName(){
				
					return "IWVT33";
				
				}

				
			    public BigDecimal IWVT34;

				public BigDecimal getIWVT34 () {
					return this.IWVT34;
				}

				public Boolean IWVT34IsNullable(){
				    return true;
				}
				public Boolean IWVT34IsKey(){
				    return false;
				}
				public Integer IWVT34Length(){
				    return null;
				}
				public Integer IWVT34Precision(){
				    return null;
				}
				public String IWVT34Default(){
				
					return "";
				
				}
				public String IWVT34Comment(){
				
				    return "";
				
				}
				public String IWVT34Pattern(){
				
					return "";
				
				}
				public String IWVT34OriginalDbColumnName(){
				
					return "IWVT34";
				
				}

				
			    public BigDecimal IWVT35;

				public BigDecimal getIWVT35 () {
					return this.IWVT35;
				}

				public Boolean IWVT35IsNullable(){
				    return true;
				}
				public Boolean IWVT35IsKey(){
				    return false;
				}
				public Integer IWVT35Length(){
				    return null;
				}
				public Integer IWVT35Precision(){
				    return null;
				}
				public String IWVT35Default(){
				
					return "";
				
				}
				public String IWVT35Comment(){
				
				    return "";
				
				}
				public String IWVT35Pattern(){
				
					return "";
				
				}
				public String IWVT35OriginalDbColumnName(){
				
					return "IWVT35";
				
				}

				
			    public BigDecimal IWVT36;

				public BigDecimal getIWVT36 () {
					return this.IWVT36;
				}

				public Boolean IWVT36IsNullable(){
				    return true;
				}
				public Boolean IWVT36IsKey(){
				    return false;
				}
				public Integer IWVT36Length(){
				    return null;
				}
				public Integer IWVT36Precision(){
				    return null;
				}
				public String IWVT36Default(){
				
					return "";
				
				}
				public String IWVT36Comment(){
				
				    return "";
				
				}
				public String IWVT36Pattern(){
				
					return "";
				
				}
				public String IWVT36OriginalDbColumnName(){
				
					return "IWVT36";
				
				}

				
			    public BigDecimal IWVT37;

				public BigDecimal getIWVT37 () {
					return this.IWVT37;
				}

				public Boolean IWVT37IsNullable(){
				    return true;
				}
				public Boolean IWVT37IsKey(){
				    return false;
				}
				public Integer IWVT37Length(){
				    return null;
				}
				public Integer IWVT37Precision(){
				    return null;
				}
				public String IWVT37Default(){
				
					return "";
				
				}
				public String IWVT37Comment(){
				
				    return "";
				
				}
				public String IWVT37Pattern(){
				
					return "";
				
				}
				public String IWVT37OriginalDbColumnName(){
				
					return "IWVT37";
				
				}

				
			    public BigDecimal IWVT38;

				public BigDecimal getIWVT38 () {
					return this.IWVT38;
				}

				public Boolean IWVT38IsNullable(){
				    return true;
				}
				public Boolean IWVT38IsKey(){
				    return false;
				}
				public Integer IWVT38Length(){
				    return null;
				}
				public Integer IWVT38Precision(){
				    return null;
				}
				public String IWVT38Default(){
				
					return "";
				
				}
				public String IWVT38Comment(){
				
				    return "";
				
				}
				public String IWVT38Pattern(){
				
					return "";
				
				}
				public String IWVT38OriginalDbColumnName(){
				
					return "IWVT38";
				
				}

				
			    public BigDecimal IWVT39;

				public BigDecimal getIWVT39 () {
					return this.IWVT39;
				}

				public Boolean IWVT39IsNullable(){
				    return true;
				}
				public Boolean IWVT39IsKey(){
				    return false;
				}
				public Integer IWVT39Length(){
				    return null;
				}
				public Integer IWVT39Precision(){
				    return null;
				}
				public String IWVT39Default(){
				
					return "";
				
				}
				public String IWVT39Comment(){
				
				    return "";
				
				}
				public String IWVT39Pattern(){
				
					return "";
				
				}
				public String IWVT39OriginalDbColumnName(){
				
					return "IWVT39";
				
				}

				
			    public BigDecimal IWVT40;

				public BigDecimal getIWVT40 () {
					return this.IWVT40;
				}

				public Boolean IWVT40IsNullable(){
				    return true;
				}
				public Boolean IWVT40IsKey(){
				    return false;
				}
				public Integer IWVT40Length(){
				    return null;
				}
				public Integer IWVT40Precision(){
				    return null;
				}
				public String IWVT40Default(){
				
					return "";
				
				}
				public String IWVT40Comment(){
				
				    return "";
				
				}
				public String IWVT40Pattern(){
				
					return "";
				
				}
				public String IWVT40OriginalDbColumnName(){
				
					return "IWVT40";
				
				}

				
			    public BigDecimal IWVT41;

				public BigDecimal getIWVT41 () {
					return this.IWVT41;
				}

				public Boolean IWVT41IsNullable(){
				    return true;
				}
				public Boolean IWVT41IsKey(){
				    return false;
				}
				public Integer IWVT41Length(){
				    return null;
				}
				public Integer IWVT41Precision(){
				    return null;
				}
				public String IWVT41Default(){
				
					return "";
				
				}
				public String IWVT41Comment(){
				
				    return "";
				
				}
				public String IWVT41Pattern(){
				
					return "";
				
				}
				public String IWVT41OriginalDbColumnName(){
				
					return "IWVT41";
				
				}

				
			    public BigDecimal IWVT42;

				public BigDecimal getIWVT42 () {
					return this.IWVT42;
				}

				public Boolean IWVT42IsNullable(){
				    return true;
				}
				public Boolean IWVT42IsKey(){
				    return false;
				}
				public Integer IWVT42Length(){
				    return null;
				}
				public Integer IWVT42Precision(){
				    return null;
				}
				public String IWVT42Default(){
				
					return "";
				
				}
				public String IWVT42Comment(){
				
				    return "";
				
				}
				public String IWVT42Pattern(){
				
					return "";
				
				}
				public String IWVT42OriginalDbColumnName(){
				
					return "IWVT42";
				
				}

				
			    public BigDecimal IWVT43;

				public BigDecimal getIWVT43 () {
					return this.IWVT43;
				}

				public Boolean IWVT43IsNullable(){
				    return true;
				}
				public Boolean IWVT43IsKey(){
				    return false;
				}
				public Integer IWVT43Length(){
				    return null;
				}
				public Integer IWVT43Precision(){
				    return null;
				}
				public String IWVT43Default(){
				
					return "";
				
				}
				public String IWVT43Comment(){
				
				    return "";
				
				}
				public String IWVT43Pattern(){
				
					return "";
				
				}
				public String IWVT43OriginalDbColumnName(){
				
					return "IWVT43";
				
				}

				
			    public BigDecimal IWVT44;

				public BigDecimal getIWVT44 () {
					return this.IWVT44;
				}

				public Boolean IWVT44IsNullable(){
				    return true;
				}
				public Boolean IWVT44IsKey(){
				    return false;
				}
				public Integer IWVT44Length(){
				    return null;
				}
				public Integer IWVT44Precision(){
				    return null;
				}
				public String IWVT44Default(){
				
					return "";
				
				}
				public String IWVT44Comment(){
				
				    return "";
				
				}
				public String IWVT44Pattern(){
				
					return "";
				
				}
				public String IWVT44OriginalDbColumnName(){
				
					return "IWVT44";
				
				}

				
			    public BigDecimal IWVT45;

				public BigDecimal getIWVT45 () {
					return this.IWVT45;
				}

				public Boolean IWVT45IsNullable(){
				    return true;
				}
				public Boolean IWVT45IsKey(){
				    return false;
				}
				public Integer IWVT45Length(){
				    return null;
				}
				public Integer IWVT45Precision(){
				    return null;
				}
				public String IWVT45Default(){
				
					return "";
				
				}
				public String IWVT45Comment(){
				
				    return "";
				
				}
				public String IWVT45Pattern(){
				
					return "";
				
				}
				public String IWVT45OriginalDbColumnName(){
				
					return "IWVT45";
				
				}

				
			    public BigDecimal IWVT46;

				public BigDecimal getIWVT46 () {
					return this.IWVT46;
				}

				public Boolean IWVT46IsNullable(){
				    return true;
				}
				public Boolean IWVT46IsKey(){
				    return false;
				}
				public Integer IWVT46Length(){
				    return null;
				}
				public Integer IWVT46Precision(){
				    return null;
				}
				public String IWVT46Default(){
				
					return "";
				
				}
				public String IWVT46Comment(){
				
				    return "";
				
				}
				public String IWVT46Pattern(){
				
					return "";
				
				}
				public String IWVT46OriginalDbColumnName(){
				
					return "IWVT46";
				
				}

				
			    public BigDecimal IWVT47;

				public BigDecimal getIWVT47 () {
					return this.IWVT47;
				}

				public Boolean IWVT47IsNullable(){
				    return true;
				}
				public Boolean IWVT47IsKey(){
				    return false;
				}
				public Integer IWVT47Length(){
				    return null;
				}
				public Integer IWVT47Precision(){
				    return null;
				}
				public String IWVT47Default(){
				
					return "";
				
				}
				public String IWVT47Comment(){
				
				    return "";
				
				}
				public String IWVT47Pattern(){
				
					return "";
				
				}
				public String IWVT47OriginalDbColumnName(){
				
					return "IWVT47";
				
				}

				
			    public BigDecimal IWVT48;

				public BigDecimal getIWVT48 () {
					return this.IWVT48;
				}

				public Boolean IWVT48IsNullable(){
				    return true;
				}
				public Boolean IWVT48IsKey(){
				    return false;
				}
				public Integer IWVT48Length(){
				    return null;
				}
				public Integer IWVT48Precision(){
				    return null;
				}
				public String IWVT48Default(){
				
					return "";
				
				}
				public String IWVT48Comment(){
				
				    return "";
				
				}
				public String IWVT48Pattern(){
				
					return "";
				
				}
				public String IWVT48OriginalDbColumnName(){
				
					return "IWVT48";
				
				}

				
			    public BigDecimal IWVT49;

				public BigDecimal getIWVT49 () {
					return this.IWVT49;
				}

				public Boolean IWVT49IsNullable(){
				    return true;
				}
				public Boolean IWVT49IsKey(){
				    return false;
				}
				public Integer IWVT49Length(){
				    return null;
				}
				public Integer IWVT49Precision(){
				    return null;
				}
				public String IWVT49Default(){
				
					return "";
				
				}
				public String IWVT49Comment(){
				
				    return "";
				
				}
				public String IWVT49Pattern(){
				
					return "";
				
				}
				public String IWVT49OriginalDbColumnName(){
				
					return "IWVT49";
				
				}

				
			    public BigDecimal IWVT50;

				public BigDecimal getIWVT50 () {
					return this.IWVT50;
				}

				public Boolean IWVT50IsNullable(){
				    return true;
				}
				public Boolean IWVT50IsKey(){
				    return false;
				}
				public Integer IWVT50Length(){
				    return null;
				}
				public Integer IWVT50Precision(){
				    return null;
				}
				public String IWVT50Default(){
				
					return "";
				
				}
				public String IWVT50Comment(){
				
				    return "";
				
				}
				public String IWVT50Pattern(){
				
					return "";
				
				}
				public String IWVT50OriginalDbColumnName(){
				
					return "IWVT50";
				
				}

				
			    public BigDecimal IWVT51;

				public BigDecimal getIWVT51 () {
					return this.IWVT51;
				}

				public Boolean IWVT51IsNullable(){
				    return true;
				}
				public Boolean IWVT51IsKey(){
				    return false;
				}
				public Integer IWVT51Length(){
				    return null;
				}
				public Integer IWVT51Precision(){
				    return null;
				}
				public String IWVT51Default(){
				
					return "";
				
				}
				public String IWVT51Comment(){
				
				    return "";
				
				}
				public String IWVT51Pattern(){
				
					return "";
				
				}
				public String IWVT51OriginalDbColumnName(){
				
					return "IWVT51";
				
				}

				
			    public BigDecimal IWVT52;

				public BigDecimal getIWVT52 () {
					return this.IWVT52;
				}

				public Boolean IWVT52IsNullable(){
				    return true;
				}
				public Boolean IWVT52IsKey(){
				    return false;
				}
				public Integer IWVT52Length(){
				    return null;
				}
				public Integer IWVT52Precision(){
				    return null;
				}
				public String IWVT52Default(){
				
					return "";
				
				}
				public String IWVT52Comment(){
				
				    return "";
				
				}
				public String IWVT52Pattern(){
				
					return "";
				
				}
				public String IWVT52OriginalDbColumnName(){
				
					return "IWVT52";
				
				}

				
			    public BigDecimal IWVT53;

				public BigDecimal getIWVT53 () {
					return this.IWVT53;
				}

				public Boolean IWVT53IsNullable(){
				    return true;
				}
				public Boolean IWVT53IsKey(){
				    return false;
				}
				public Integer IWVT53Length(){
				    return null;
				}
				public Integer IWVT53Precision(){
				    return null;
				}
				public String IWVT53Default(){
				
					return "";
				
				}
				public String IWVT53Comment(){
				
				    return "";
				
				}
				public String IWVT53Pattern(){
				
					return "";
				
				}
				public String IWVT53OriginalDbColumnName(){
				
					return "IWVT53";
				
				}

				
			    public String IWOS01;

				public String getIWOS01 () {
					return this.IWOS01;
				}

				public Boolean IWOS01IsNullable(){
				    return true;
				}
				public Boolean IWOS01IsKey(){
				    return false;
				}
				public Integer IWOS01Length(){
				    return null;
				}
				public Integer IWOS01Precision(){
				    return null;
				}
				public String IWOS01Default(){
				
					return "";
				
				}
				public String IWOS01Comment(){
				
				    return "";
				
				}
				public String IWOS01Pattern(){
				
					return "";
				
				}
				public String IWOS01OriginalDbColumnName(){
				
					return "IWOS01";
				
				}

				
			    public String IWOS02;

				public String getIWOS02 () {
					return this.IWOS02;
				}

				public Boolean IWOS02IsNullable(){
				    return true;
				}
				public Boolean IWOS02IsKey(){
				    return false;
				}
				public Integer IWOS02Length(){
				    return null;
				}
				public Integer IWOS02Precision(){
				    return null;
				}
				public String IWOS02Default(){
				
					return "";
				
				}
				public String IWOS02Comment(){
				
				    return "";
				
				}
				public String IWOS02Pattern(){
				
					return "";
				
				}
				public String IWOS02OriginalDbColumnName(){
				
					return "IWOS02";
				
				}

				
			    public String IWOS03;

				public String getIWOS03 () {
					return this.IWOS03;
				}

				public Boolean IWOS03IsNullable(){
				    return true;
				}
				public Boolean IWOS03IsKey(){
				    return false;
				}
				public Integer IWOS03Length(){
				    return null;
				}
				public Integer IWOS03Precision(){
				    return null;
				}
				public String IWOS03Default(){
				
					return "";
				
				}
				public String IWOS03Comment(){
				
				    return "";
				
				}
				public String IWOS03Pattern(){
				
					return "";
				
				}
				public String IWOS03OriginalDbColumnName(){
				
					return "IWOS03";
				
				}

				
			    public String IWOS04;

				public String getIWOS04 () {
					return this.IWOS04;
				}

				public Boolean IWOS04IsNullable(){
				    return true;
				}
				public Boolean IWOS04IsKey(){
				    return false;
				}
				public Integer IWOS04Length(){
				    return null;
				}
				public Integer IWOS04Precision(){
				    return null;
				}
				public String IWOS04Default(){
				
					return "";
				
				}
				public String IWOS04Comment(){
				
				    return "";
				
				}
				public String IWOS04Pattern(){
				
					return "";
				
				}
				public String IWOS04OriginalDbColumnName(){
				
					return "IWOS04";
				
				}

				
			    public String IWOS05;

				public String getIWOS05 () {
					return this.IWOS05;
				}

				public Boolean IWOS05IsNullable(){
				    return true;
				}
				public Boolean IWOS05IsKey(){
				    return false;
				}
				public Integer IWOS05Length(){
				    return null;
				}
				public Integer IWOS05Precision(){
				    return null;
				}
				public String IWOS05Default(){
				
					return "";
				
				}
				public String IWOS05Comment(){
				
				    return "";
				
				}
				public String IWOS05Pattern(){
				
					return "";
				
				}
				public String IWOS05OriginalDbColumnName(){
				
					return "IWOS05";
				
				}

				
			    public String IWOS06;

				public String getIWOS06 () {
					return this.IWOS06;
				}

				public Boolean IWOS06IsNullable(){
				    return true;
				}
				public Boolean IWOS06IsKey(){
				    return false;
				}
				public Integer IWOS06Length(){
				    return null;
				}
				public Integer IWOS06Precision(){
				    return null;
				}
				public String IWOS06Default(){
				
					return "";
				
				}
				public String IWOS06Comment(){
				
				    return "";
				
				}
				public String IWOS06Pattern(){
				
					return "";
				
				}
				public String IWOS06OriginalDbColumnName(){
				
					return "IWOS06";
				
				}

				
			    public String IWOS07;

				public String getIWOS07 () {
					return this.IWOS07;
				}

				public Boolean IWOS07IsNullable(){
				    return true;
				}
				public Boolean IWOS07IsKey(){
				    return false;
				}
				public Integer IWOS07Length(){
				    return null;
				}
				public Integer IWOS07Precision(){
				    return null;
				}
				public String IWOS07Default(){
				
					return "";
				
				}
				public String IWOS07Comment(){
				
				    return "";
				
				}
				public String IWOS07Pattern(){
				
					return "";
				
				}
				public String IWOS07OriginalDbColumnName(){
				
					return "IWOS07";
				
				}

				
			    public String IWOS08;

				public String getIWOS08 () {
					return this.IWOS08;
				}

				public Boolean IWOS08IsNullable(){
				    return true;
				}
				public Boolean IWOS08IsKey(){
				    return false;
				}
				public Integer IWOS08Length(){
				    return null;
				}
				public Integer IWOS08Precision(){
				    return null;
				}
				public String IWOS08Default(){
				
					return "";
				
				}
				public String IWOS08Comment(){
				
				    return "";
				
				}
				public String IWOS08Pattern(){
				
					return "";
				
				}
				public String IWOS08OriginalDbColumnName(){
				
					return "IWOS08";
				
				}

				
			    public String IWOS09;

				public String getIWOS09 () {
					return this.IWOS09;
				}

				public Boolean IWOS09IsNullable(){
				    return true;
				}
				public Boolean IWOS09IsKey(){
				    return false;
				}
				public Integer IWOS09Length(){
				    return null;
				}
				public Integer IWOS09Precision(){
				    return null;
				}
				public String IWOS09Default(){
				
					return "";
				
				}
				public String IWOS09Comment(){
				
				    return "";
				
				}
				public String IWOS09Pattern(){
				
					return "";
				
				}
				public String IWOS09OriginalDbColumnName(){
				
					return "IWOS09";
				
				}

				
			    public String IWOS10;

				public String getIWOS10 () {
					return this.IWOS10;
				}

				public Boolean IWOS10IsNullable(){
				    return true;
				}
				public Boolean IWOS10IsKey(){
				    return false;
				}
				public Integer IWOS10Length(){
				    return null;
				}
				public Integer IWOS10Precision(){
				    return null;
				}
				public String IWOS10Default(){
				
					return "";
				
				}
				public String IWOS10Comment(){
				
				    return "";
				
				}
				public String IWOS10Pattern(){
				
					return "";
				
				}
				public String IWOS10OriginalDbColumnName(){
				
					return "IWOS10";
				
				}

				
			    public String IWOS11;

				public String getIWOS11 () {
					return this.IWOS11;
				}

				public Boolean IWOS11IsNullable(){
				    return true;
				}
				public Boolean IWOS11IsKey(){
				    return false;
				}
				public Integer IWOS11Length(){
				    return null;
				}
				public Integer IWOS11Precision(){
				    return null;
				}
				public String IWOS11Default(){
				
					return "";
				
				}
				public String IWOS11Comment(){
				
				    return "";
				
				}
				public String IWOS11Pattern(){
				
					return "";
				
				}
				public String IWOS11OriginalDbColumnName(){
				
					return "IWOS11";
				
				}

				
			    public String IWOS12;

				public String getIWOS12 () {
					return this.IWOS12;
				}

				public Boolean IWOS12IsNullable(){
				    return true;
				}
				public Boolean IWOS12IsKey(){
				    return false;
				}
				public Integer IWOS12Length(){
				    return null;
				}
				public Integer IWOS12Precision(){
				    return null;
				}
				public String IWOS12Default(){
				
					return "";
				
				}
				public String IWOS12Comment(){
				
				    return "";
				
				}
				public String IWOS12Pattern(){
				
					return "";
				
				}
				public String IWOS12OriginalDbColumnName(){
				
					return "IWOS12";
				
				}

				
			    public String IWOS13;

				public String getIWOS13 () {
					return this.IWOS13;
				}

				public Boolean IWOS13IsNullable(){
				    return true;
				}
				public Boolean IWOS13IsKey(){
				    return false;
				}
				public Integer IWOS13Length(){
				    return null;
				}
				public Integer IWOS13Precision(){
				    return null;
				}
				public String IWOS13Default(){
				
					return "";
				
				}
				public String IWOS13Comment(){
				
				    return "";
				
				}
				public String IWOS13Pattern(){
				
					return "";
				
				}
				public String IWOS13OriginalDbColumnName(){
				
					return "IWOS13";
				
				}

				
			    public String IWOS14;

				public String getIWOS14 () {
					return this.IWOS14;
				}

				public Boolean IWOS14IsNullable(){
				    return true;
				}
				public Boolean IWOS14IsKey(){
				    return false;
				}
				public Integer IWOS14Length(){
				    return null;
				}
				public Integer IWOS14Precision(){
				    return null;
				}
				public String IWOS14Default(){
				
					return "";
				
				}
				public String IWOS14Comment(){
				
				    return "";
				
				}
				public String IWOS14Pattern(){
				
					return "";
				
				}
				public String IWOS14OriginalDbColumnName(){
				
					return "IWOS14";
				
				}

				
			    public String IWOS15;

				public String getIWOS15 () {
					return this.IWOS15;
				}

				public Boolean IWOS15IsNullable(){
				    return true;
				}
				public Boolean IWOS15IsKey(){
				    return false;
				}
				public Integer IWOS15Length(){
				    return null;
				}
				public Integer IWOS15Precision(){
				    return null;
				}
				public String IWOS15Default(){
				
					return "";
				
				}
				public String IWOS15Comment(){
				
				    return "";
				
				}
				public String IWOS15Pattern(){
				
					return "";
				
				}
				public String IWOS15OriginalDbColumnName(){
				
					return "IWOS15";
				
				}

				
			    public String IWOS16;

				public String getIWOS16 () {
					return this.IWOS16;
				}

				public Boolean IWOS16IsNullable(){
				    return true;
				}
				public Boolean IWOS16IsKey(){
				    return false;
				}
				public Integer IWOS16Length(){
				    return null;
				}
				public Integer IWOS16Precision(){
				    return null;
				}
				public String IWOS16Default(){
				
					return "";
				
				}
				public String IWOS16Comment(){
				
				    return "";
				
				}
				public String IWOS16Pattern(){
				
					return "";
				
				}
				public String IWOS16OriginalDbColumnName(){
				
					return "IWOS16";
				
				}

				
			    public String IWOS17;

				public String getIWOS17 () {
					return this.IWOS17;
				}

				public Boolean IWOS17IsNullable(){
				    return true;
				}
				public Boolean IWOS17IsKey(){
				    return false;
				}
				public Integer IWOS17Length(){
				    return null;
				}
				public Integer IWOS17Precision(){
				    return null;
				}
				public String IWOS17Default(){
				
					return "";
				
				}
				public String IWOS17Comment(){
				
				    return "";
				
				}
				public String IWOS17Pattern(){
				
					return "";
				
				}
				public String IWOS17OriginalDbColumnName(){
				
					return "IWOS17";
				
				}

				
			    public String IWOS18;

				public String getIWOS18 () {
					return this.IWOS18;
				}

				public Boolean IWOS18IsNullable(){
				    return true;
				}
				public Boolean IWOS18IsKey(){
				    return false;
				}
				public Integer IWOS18Length(){
				    return null;
				}
				public Integer IWOS18Precision(){
				    return null;
				}
				public String IWOS18Default(){
				
					return "";
				
				}
				public String IWOS18Comment(){
				
				    return "";
				
				}
				public String IWOS18Pattern(){
				
					return "";
				
				}
				public String IWOS18OriginalDbColumnName(){
				
					return "IWOS18";
				
				}

				
			    public String IWOS19;

				public String getIWOS19 () {
					return this.IWOS19;
				}

				public Boolean IWOS19IsNullable(){
				    return true;
				}
				public Boolean IWOS19IsKey(){
				    return false;
				}
				public Integer IWOS19Length(){
				    return null;
				}
				public Integer IWOS19Precision(){
				    return null;
				}
				public String IWOS19Default(){
				
					return "";
				
				}
				public String IWOS19Comment(){
				
				    return "";
				
				}
				public String IWOS19Pattern(){
				
					return "";
				
				}
				public String IWOS19OriginalDbColumnName(){
				
					return "IWOS19";
				
				}

				
			    public String IWOS20;

				public String getIWOS20 () {
					return this.IWOS20;
				}

				public Boolean IWOS20IsNullable(){
				    return true;
				}
				public Boolean IWOS20IsKey(){
				    return false;
				}
				public Integer IWOS20Length(){
				    return null;
				}
				public Integer IWOS20Precision(){
				    return null;
				}
				public String IWOS20Default(){
				
					return "";
				
				}
				public String IWOS20Comment(){
				
				    return "";
				
				}
				public String IWOS20Pattern(){
				
					return "";
				
				}
				public String IWOS20OriginalDbColumnName(){
				
					return "IWOS20";
				
				}

				
			    public String IWOS21;

				public String getIWOS21 () {
					return this.IWOS21;
				}

				public Boolean IWOS21IsNullable(){
				    return true;
				}
				public Boolean IWOS21IsKey(){
				    return false;
				}
				public Integer IWOS21Length(){
				    return null;
				}
				public Integer IWOS21Precision(){
				    return null;
				}
				public String IWOS21Default(){
				
					return "";
				
				}
				public String IWOS21Comment(){
				
				    return "";
				
				}
				public String IWOS21Pattern(){
				
					return "";
				
				}
				public String IWOS21OriginalDbColumnName(){
				
					return "IWOS21";
				
				}

				
			    public String IWOS22;

				public String getIWOS22 () {
					return this.IWOS22;
				}

				public Boolean IWOS22IsNullable(){
				    return true;
				}
				public Boolean IWOS22IsKey(){
				    return false;
				}
				public Integer IWOS22Length(){
				    return null;
				}
				public Integer IWOS22Precision(){
				    return null;
				}
				public String IWOS22Default(){
				
					return "";
				
				}
				public String IWOS22Comment(){
				
				    return "";
				
				}
				public String IWOS22Pattern(){
				
					return "";
				
				}
				public String IWOS22OriginalDbColumnName(){
				
					return "IWOS22";
				
				}

				
			    public String IWOS23;

				public String getIWOS23 () {
					return this.IWOS23;
				}

				public Boolean IWOS23IsNullable(){
				    return true;
				}
				public Boolean IWOS23IsKey(){
				    return false;
				}
				public Integer IWOS23Length(){
				    return null;
				}
				public Integer IWOS23Precision(){
				    return null;
				}
				public String IWOS23Default(){
				
					return "";
				
				}
				public String IWOS23Comment(){
				
				    return "";
				
				}
				public String IWOS23Pattern(){
				
					return "";
				
				}
				public String IWOS23OriginalDbColumnName(){
				
					return "IWOS23";
				
				}

				
			    public String IWOS24;

				public String getIWOS24 () {
					return this.IWOS24;
				}

				public Boolean IWOS24IsNullable(){
				    return true;
				}
				public Boolean IWOS24IsKey(){
				    return false;
				}
				public Integer IWOS24Length(){
				    return null;
				}
				public Integer IWOS24Precision(){
				    return null;
				}
				public String IWOS24Default(){
				
					return "";
				
				}
				public String IWOS24Comment(){
				
				    return "";
				
				}
				public String IWOS24Pattern(){
				
					return "";
				
				}
				public String IWOS24OriginalDbColumnName(){
				
					return "IWOS24";
				
				}

				
			    public String IWOS25;

				public String getIWOS25 () {
					return this.IWOS25;
				}

				public Boolean IWOS25IsNullable(){
				    return true;
				}
				public Boolean IWOS25IsKey(){
				    return false;
				}
				public Integer IWOS25Length(){
				    return null;
				}
				public Integer IWOS25Precision(){
				    return null;
				}
				public String IWOS25Default(){
				
					return "";
				
				}
				public String IWOS25Comment(){
				
				    return "";
				
				}
				public String IWOS25Pattern(){
				
					return "";
				
				}
				public String IWOS25OriginalDbColumnName(){
				
					return "IWOS25";
				
				}

				
			    public String IWOS26;

				public String getIWOS26 () {
					return this.IWOS26;
				}

				public Boolean IWOS26IsNullable(){
				    return true;
				}
				public Boolean IWOS26IsKey(){
				    return false;
				}
				public Integer IWOS26Length(){
				    return null;
				}
				public Integer IWOS26Precision(){
				    return null;
				}
				public String IWOS26Default(){
				
					return "";
				
				}
				public String IWOS26Comment(){
				
				    return "";
				
				}
				public String IWOS26Pattern(){
				
					return "";
				
				}
				public String IWOS26OriginalDbColumnName(){
				
					return "IWOS26";
				
				}

				
			    public String IWOS27;

				public String getIWOS27 () {
					return this.IWOS27;
				}

				public Boolean IWOS27IsNullable(){
				    return true;
				}
				public Boolean IWOS27IsKey(){
				    return false;
				}
				public Integer IWOS27Length(){
				    return null;
				}
				public Integer IWOS27Precision(){
				    return null;
				}
				public String IWOS27Default(){
				
					return "";
				
				}
				public String IWOS27Comment(){
				
				    return "";
				
				}
				public String IWOS27Pattern(){
				
					return "";
				
				}
				public String IWOS27OriginalDbColumnName(){
				
					return "IWOS27";
				
				}

				
			    public String IWOS28;

				public String getIWOS28 () {
					return this.IWOS28;
				}

				public Boolean IWOS28IsNullable(){
				    return true;
				}
				public Boolean IWOS28IsKey(){
				    return false;
				}
				public Integer IWOS28Length(){
				    return null;
				}
				public Integer IWOS28Precision(){
				    return null;
				}
				public String IWOS28Default(){
				
					return "";
				
				}
				public String IWOS28Comment(){
				
				    return "";
				
				}
				public String IWOS28Pattern(){
				
					return "";
				
				}
				public String IWOS28OriginalDbColumnName(){
				
					return "IWOS28";
				
				}

				
			    public String IWOS29;

				public String getIWOS29 () {
					return this.IWOS29;
				}

				public Boolean IWOS29IsNullable(){
				    return true;
				}
				public Boolean IWOS29IsKey(){
				    return false;
				}
				public Integer IWOS29Length(){
				    return null;
				}
				public Integer IWOS29Precision(){
				    return null;
				}
				public String IWOS29Default(){
				
					return "";
				
				}
				public String IWOS29Comment(){
				
				    return "";
				
				}
				public String IWOS29Pattern(){
				
					return "";
				
				}
				public String IWOS29OriginalDbColumnName(){
				
					return "IWOS29";
				
				}

				
			    public String IWOS30;

				public String getIWOS30 () {
					return this.IWOS30;
				}

				public Boolean IWOS30IsNullable(){
				    return true;
				}
				public Boolean IWOS30IsKey(){
				    return false;
				}
				public Integer IWOS30Length(){
				    return null;
				}
				public Integer IWOS30Precision(){
				    return null;
				}
				public String IWOS30Default(){
				
					return "";
				
				}
				public String IWOS30Comment(){
				
				    return "";
				
				}
				public String IWOS30Pattern(){
				
					return "";
				
				}
				public String IWOS30OriginalDbColumnName(){
				
					return "IWOS30";
				
				}

				
			    public String IWOS31;

				public String getIWOS31 () {
					return this.IWOS31;
				}

				public Boolean IWOS31IsNullable(){
				    return true;
				}
				public Boolean IWOS31IsKey(){
				    return false;
				}
				public Integer IWOS31Length(){
				    return null;
				}
				public Integer IWOS31Precision(){
				    return null;
				}
				public String IWOS31Default(){
				
					return "";
				
				}
				public String IWOS31Comment(){
				
				    return "";
				
				}
				public String IWOS31Pattern(){
				
					return "";
				
				}
				public String IWOS31OriginalDbColumnName(){
				
					return "IWOS31";
				
				}

				
			    public String IWOS32;

				public String getIWOS32 () {
					return this.IWOS32;
				}

				public Boolean IWOS32IsNullable(){
				    return true;
				}
				public Boolean IWOS32IsKey(){
				    return false;
				}
				public Integer IWOS32Length(){
				    return null;
				}
				public Integer IWOS32Precision(){
				    return null;
				}
				public String IWOS32Default(){
				
					return "";
				
				}
				public String IWOS32Comment(){
				
				    return "";
				
				}
				public String IWOS32Pattern(){
				
					return "";
				
				}
				public String IWOS32OriginalDbColumnName(){
				
					return "IWOS32";
				
				}

				
			    public String IWOS33;

				public String getIWOS33 () {
					return this.IWOS33;
				}

				public Boolean IWOS33IsNullable(){
				    return true;
				}
				public Boolean IWOS33IsKey(){
				    return false;
				}
				public Integer IWOS33Length(){
				    return null;
				}
				public Integer IWOS33Precision(){
				    return null;
				}
				public String IWOS33Default(){
				
					return "";
				
				}
				public String IWOS33Comment(){
				
				    return "";
				
				}
				public String IWOS33Pattern(){
				
					return "";
				
				}
				public String IWOS33OriginalDbColumnName(){
				
					return "IWOS33";
				
				}

				
			    public String IWOS34;

				public String getIWOS34 () {
					return this.IWOS34;
				}

				public Boolean IWOS34IsNullable(){
				    return true;
				}
				public Boolean IWOS34IsKey(){
				    return false;
				}
				public Integer IWOS34Length(){
				    return null;
				}
				public Integer IWOS34Precision(){
				    return null;
				}
				public String IWOS34Default(){
				
					return "";
				
				}
				public String IWOS34Comment(){
				
				    return "";
				
				}
				public String IWOS34Pattern(){
				
					return "";
				
				}
				public String IWOS34OriginalDbColumnName(){
				
					return "IWOS34";
				
				}

				
			    public String IWOS35;

				public String getIWOS35 () {
					return this.IWOS35;
				}

				public Boolean IWOS35IsNullable(){
				    return true;
				}
				public Boolean IWOS35IsKey(){
				    return false;
				}
				public Integer IWOS35Length(){
				    return null;
				}
				public Integer IWOS35Precision(){
				    return null;
				}
				public String IWOS35Default(){
				
					return "";
				
				}
				public String IWOS35Comment(){
				
				    return "";
				
				}
				public String IWOS35Pattern(){
				
					return "";
				
				}
				public String IWOS35OriginalDbColumnName(){
				
					return "IWOS35";
				
				}

				
			    public String IWOS36;

				public String getIWOS36 () {
					return this.IWOS36;
				}

				public Boolean IWOS36IsNullable(){
				    return true;
				}
				public Boolean IWOS36IsKey(){
				    return false;
				}
				public Integer IWOS36Length(){
				    return null;
				}
				public Integer IWOS36Precision(){
				    return null;
				}
				public String IWOS36Default(){
				
					return "";
				
				}
				public String IWOS36Comment(){
				
				    return "";
				
				}
				public String IWOS36Pattern(){
				
					return "";
				
				}
				public String IWOS36OriginalDbColumnName(){
				
					return "IWOS36";
				
				}

				
			    public String IWOS37;

				public String getIWOS37 () {
					return this.IWOS37;
				}

				public Boolean IWOS37IsNullable(){
				    return true;
				}
				public Boolean IWOS37IsKey(){
				    return false;
				}
				public Integer IWOS37Length(){
				    return null;
				}
				public Integer IWOS37Precision(){
				    return null;
				}
				public String IWOS37Default(){
				
					return "";
				
				}
				public String IWOS37Comment(){
				
				    return "";
				
				}
				public String IWOS37Pattern(){
				
					return "";
				
				}
				public String IWOS37OriginalDbColumnName(){
				
					return "IWOS37";
				
				}

				
			    public String IWOS38;

				public String getIWOS38 () {
					return this.IWOS38;
				}

				public Boolean IWOS38IsNullable(){
				    return true;
				}
				public Boolean IWOS38IsKey(){
				    return false;
				}
				public Integer IWOS38Length(){
				    return null;
				}
				public Integer IWOS38Precision(){
				    return null;
				}
				public String IWOS38Default(){
				
					return "";
				
				}
				public String IWOS38Comment(){
				
				    return "";
				
				}
				public String IWOS38Pattern(){
				
					return "";
				
				}
				public String IWOS38OriginalDbColumnName(){
				
					return "IWOS38";
				
				}

				
			    public String IWOS39;

				public String getIWOS39 () {
					return this.IWOS39;
				}

				public Boolean IWOS39IsNullable(){
				    return true;
				}
				public Boolean IWOS39IsKey(){
				    return false;
				}
				public Integer IWOS39Length(){
				    return null;
				}
				public Integer IWOS39Precision(){
				    return null;
				}
				public String IWOS39Default(){
				
					return "";
				
				}
				public String IWOS39Comment(){
				
				    return "";
				
				}
				public String IWOS39Pattern(){
				
					return "";
				
				}
				public String IWOS39OriginalDbColumnName(){
				
					return "IWOS39";
				
				}

				
			    public String IWOS40;

				public String getIWOS40 () {
					return this.IWOS40;
				}

				public Boolean IWOS40IsNullable(){
				    return true;
				}
				public Boolean IWOS40IsKey(){
				    return false;
				}
				public Integer IWOS40Length(){
				    return null;
				}
				public Integer IWOS40Precision(){
				    return null;
				}
				public String IWOS40Default(){
				
					return "";
				
				}
				public String IWOS40Comment(){
				
				    return "";
				
				}
				public String IWOS40Pattern(){
				
					return "";
				
				}
				public String IWOS40OriginalDbColumnName(){
				
					return "IWOS40";
				
				}

				
			    public String IWOS41;

				public String getIWOS41 () {
					return this.IWOS41;
				}

				public Boolean IWOS41IsNullable(){
				    return true;
				}
				public Boolean IWOS41IsKey(){
				    return false;
				}
				public Integer IWOS41Length(){
				    return null;
				}
				public Integer IWOS41Precision(){
				    return null;
				}
				public String IWOS41Default(){
				
					return "";
				
				}
				public String IWOS41Comment(){
				
				    return "";
				
				}
				public String IWOS41Pattern(){
				
					return "";
				
				}
				public String IWOS41OriginalDbColumnName(){
				
					return "IWOS41";
				
				}

				
			    public String IWOS42;

				public String getIWOS42 () {
					return this.IWOS42;
				}

				public Boolean IWOS42IsNullable(){
				    return true;
				}
				public Boolean IWOS42IsKey(){
				    return false;
				}
				public Integer IWOS42Length(){
				    return null;
				}
				public Integer IWOS42Precision(){
				    return null;
				}
				public String IWOS42Default(){
				
					return "";
				
				}
				public String IWOS42Comment(){
				
				    return "";
				
				}
				public String IWOS42Pattern(){
				
					return "";
				
				}
				public String IWOS42OriginalDbColumnName(){
				
					return "IWOS42";
				
				}

				
			    public String IWOS43;

				public String getIWOS43 () {
					return this.IWOS43;
				}

				public Boolean IWOS43IsNullable(){
				    return true;
				}
				public Boolean IWOS43IsKey(){
				    return false;
				}
				public Integer IWOS43Length(){
				    return null;
				}
				public Integer IWOS43Precision(){
				    return null;
				}
				public String IWOS43Default(){
				
					return "";
				
				}
				public String IWOS43Comment(){
				
				    return "";
				
				}
				public String IWOS43Pattern(){
				
					return "";
				
				}
				public String IWOS43OriginalDbColumnName(){
				
					return "IWOS43";
				
				}

				
			    public String IWOS44;

				public String getIWOS44 () {
					return this.IWOS44;
				}

				public Boolean IWOS44IsNullable(){
				    return true;
				}
				public Boolean IWOS44IsKey(){
				    return false;
				}
				public Integer IWOS44Length(){
				    return null;
				}
				public Integer IWOS44Precision(){
				    return null;
				}
				public String IWOS44Default(){
				
					return "";
				
				}
				public String IWOS44Comment(){
				
				    return "";
				
				}
				public String IWOS44Pattern(){
				
					return "";
				
				}
				public String IWOS44OriginalDbColumnName(){
				
					return "IWOS44";
				
				}

				
			    public String IWOS45;

				public String getIWOS45 () {
					return this.IWOS45;
				}

				public Boolean IWOS45IsNullable(){
				    return true;
				}
				public Boolean IWOS45IsKey(){
				    return false;
				}
				public Integer IWOS45Length(){
				    return null;
				}
				public Integer IWOS45Precision(){
				    return null;
				}
				public String IWOS45Default(){
				
					return "";
				
				}
				public String IWOS45Comment(){
				
				    return "";
				
				}
				public String IWOS45Pattern(){
				
					return "";
				
				}
				public String IWOS45OriginalDbColumnName(){
				
					return "IWOS45";
				
				}

				
			    public String IWOS46;

				public String getIWOS46 () {
					return this.IWOS46;
				}

				public Boolean IWOS46IsNullable(){
				    return true;
				}
				public Boolean IWOS46IsKey(){
				    return false;
				}
				public Integer IWOS46Length(){
				    return null;
				}
				public Integer IWOS46Precision(){
				    return null;
				}
				public String IWOS46Default(){
				
					return "";
				
				}
				public String IWOS46Comment(){
				
				    return "";
				
				}
				public String IWOS46Pattern(){
				
					return "";
				
				}
				public String IWOS46OriginalDbColumnName(){
				
					return "IWOS46";
				
				}

				
			    public String IWOS47;

				public String getIWOS47 () {
					return this.IWOS47;
				}

				public Boolean IWOS47IsNullable(){
				    return true;
				}
				public Boolean IWOS47IsKey(){
				    return false;
				}
				public Integer IWOS47Length(){
				    return null;
				}
				public Integer IWOS47Precision(){
				    return null;
				}
				public String IWOS47Default(){
				
					return "";
				
				}
				public String IWOS47Comment(){
				
				    return "";
				
				}
				public String IWOS47Pattern(){
				
					return "";
				
				}
				public String IWOS47OriginalDbColumnName(){
				
					return "IWOS47";
				
				}

				
			    public String IWOS48;

				public String getIWOS48 () {
					return this.IWOS48;
				}

				public Boolean IWOS48IsNullable(){
				    return true;
				}
				public Boolean IWOS48IsKey(){
				    return false;
				}
				public Integer IWOS48Length(){
				    return null;
				}
				public Integer IWOS48Precision(){
				    return null;
				}
				public String IWOS48Default(){
				
					return "";
				
				}
				public String IWOS48Comment(){
				
				    return "";
				
				}
				public String IWOS48Pattern(){
				
					return "";
				
				}
				public String IWOS48OriginalDbColumnName(){
				
					return "IWOS48";
				
				}

				
			    public String IWOS49;

				public String getIWOS49 () {
					return this.IWOS49;
				}

				public Boolean IWOS49IsNullable(){
				    return true;
				}
				public Boolean IWOS49IsKey(){
				    return false;
				}
				public Integer IWOS49Length(){
				    return null;
				}
				public Integer IWOS49Precision(){
				    return null;
				}
				public String IWOS49Default(){
				
					return "";
				
				}
				public String IWOS49Comment(){
				
				    return "";
				
				}
				public String IWOS49Pattern(){
				
					return "";
				
				}
				public String IWOS49OriginalDbColumnName(){
				
					return "IWOS49";
				
				}

				
			    public String IWOS50;

				public String getIWOS50 () {
					return this.IWOS50;
				}

				public Boolean IWOS50IsNullable(){
				    return true;
				}
				public Boolean IWOS50IsKey(){
				    return false;
				}
				public Integer IWOS50Length(){
				    return null;
				}
				public Integer IWOS50Precision(){
				    return null;
				}
				public String IWOS50Default(){
				
					return "";
				
				}
				public String IWOS50Comment(){
				
				    return "";
				
				}
				public String IWOS50Pattern(){
				
					return "";
				
				}
				public String IWOS50OriginalDbColumnName(){
				
					return "IWOS50";
				
				}

				
			    public String IWOS51;

				public String getIWOS51 () {
					return this.IWOS51;
				}

				public Boolean IWOS51IsNullable(){
				    return true;
				}
				public Boolean IWOS51IsKey(){
				    return false;
				}
				public Integer IWOS51Length(){
				    return null;
				}
				public Integer IWOS51Precision(){
				    return null;
				}
				public String IWOS51Default(){
				
					return "";
				
				}
				public String IWOS51Comment(){
				
				    return "";
				
				}
				public String IWOS51Pattern(){
				
					return "";
				
				}
				public String IWOS51OriginalDbColumnName(){
				
					return "IWOS51";
				
				}

				
			    public String IWOS52;

				public String getIWOS52 () {
					return this.IWOS52;
				}

				public Boolean IWOS52IsNullable(){
				    return true;
				}
				public Boolean IWOS52IsKey(){
				    return false;
				}
				public Integer IWOS52Length(){
				    return null;
				}
				public Integer IWOS52Precision(){
				    return null;
				}
				public String IWOS52Default(){
				
					return "";
				
				}
				public String IWOS52Comment(){
				
				    return "";
				
				}
				public String IWOS52Pattern(){
				
					return "";
				
				}
				public String IWOS52OriginalDbColumnName(){
				
					return "IWOS52";
				
				}

				
			    public String IWOS53;

				public String getIWOS53 () {
					return this.IWOS53;
				}

				public Boolean IWOS53IsNullable(){
				    return true;
				}
				public Boolean IWOS53IsKey(){
				    return false;
				}
				public Integer IWOS53Length(){
				    return null;
				}
				public Integer IWOS53Precision(){
				    return null;
				}
				public String IWOS53Default(){
				
					return "";
				
				}
				public String IWOS53Comment(){
				
				    return "";
				
				}
				public String IWOS53Pattern(){
				
					return "";
				
				}
				public String IWOS53OriginalDbColumnName(){
				
					return "IWOS53";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW) {

        	try {

        		int length = 0;
		
						this.IWCENT = (BigDecimal) dis.readObject();
					
						this.IWYEAR = (BigDecimal) dis.readObject();
					
						this.IWVNDR = (BigDecimal) dis.readObject();
					
					this.IWSTYL = readString(dis);
					
						this.IWSKU = (BigDecimal) dis.readObject();
					
						this.IWSTR = (BigDecimal) dis.readObject();
					
						this.IWHTYP = (BigDecimal) dis.readObject();
					
						this.IWQT01 = (BigDecimal) dis.readObject();
					
						this.IWQT02 = (BigDecimal) dis.readObject();
					
						this.IWQT03 = (BigDecimal) dis.readObject();
					
						this.IWQT04 = (BigDecimal) dis.readObject();
					
						this.IWQT05 = (BigDecimal) dis.readObject();
					
						this.IWQT06 = (BigDecimal) dis.readObject();
					
						this.IWQT07 = (BigDecimal) dis.readObject();
					
						this.IWQT08 = (BigDecimal) dis.readObject();
					
						this.IWQT09 = (BigDecimal) dis.readObject();
					
						this.IWQT10 = (BigDecimal) dis.readObject();
					
						this.IWQT11 = (BigDecimal) dis.readObject();
					
						this.IWQT12 = (BigDecimal) dis.readObject();
					
						this.IWQT13 = (BigDecimal) dis.readObject();
					
						this.IWQT14 = (BigDecimal) dis.readObject();
					
						this.IWQT15 = (BigDecimal) dis.readObject();
					
						this.IWQT16 = (BigDecimal) dis.readObject();
					
						this.IWQT17 = (BigDecimal) dis.readObject();
					
						this.IWQT18 = (BigDecimal) dis.readObject();
					
						this.IWQT19 = (BigDecimal) dis.readObject();
					
						this.IWQT20 = (BigDecimal) dis.readObject();
					
						this.IWQT21 = (BigDecimal) dis.readObject();
					
						this.IWQT22 = (BigDecimal) dis.readObject();
					
						this.IWQT23 = (BigDecimal) dis.readObject();
					
						this.IWQT24 = (BigDecimal) dis.readObject();
					
						this.IWQT25 = (BigDecimal) dis.readObject();
					
						this.IWQT26 = (BigDecimal) dis.readObject();
					
						this.IWQT27 = (BigDecimal) dis.readObject();
					
						this.IWQT28 = (BigDecimal) dis.readObject();
					
						this.IWQT29 = (BigDecimal) dis.readObject();
					
						this.IWQT30 = (BigDecimal) dis.readObject();
					
						this.IWQT31 = (BigDecimal) dis.readObject();
					
						this.IWQT32 = (BigDecimal) dis.readObject();
					
						this.IWQT33 = (BigDecimal) dis.readObject();
					
						this.IWQT34 = (BigDecimal) dis.readObject();
					
						this.IWQT35 = (BigDecimal) dis.readObject();
					
						this.IWQT36 = (BigDecimal) dis.readObject();
					
						this.IWQT37 = (BigDecimal) dis.readObject();
					
						this.IWQT38 = (BigDecimal) dis.readObject();
					
						this.IWQT39 = (BigDecimal) dis.readObject();
					
						this.IWQT40 = (BigDecimal) dis.readObject();
					
						this.IWQT41 = (BigDecimal) dis.readObject();
					
						this.IWQT42 = (BigDecimal) dis.readObject();
					
						this.IWQT43 = (BigDecimal) dis.readObject();
					
						this.IWQT44 = (BigDecimal) dis.readObject();
					
						this.IWQT45 = (BigDecimal) dis.readObject();
					
						this.IWQT46 = (BigDecimal) dis.readObject();
					
						this.IWQT47 = (BigDecimal) dis.readObject();
					
						this.IWQT48 = (BigDecimal) dis.readObject();
					
						this.IWQT49 = (BigDecimal) dis.readObject();
					
						this.IWQT50 = (BigDecimal) dis.readObject();
					
						this.IWQT51 = (BigDecimal) dis.readObject();
					
						this.IWQT52 = (BigDecimal) dis.readObject();
					
						this.IWQT53 = (BigDecimal) dis.readObject();
					
						this.IWRT01 = (BigDecimal) dis.readObject();
					
						this.IWRT02 = (BigDecimal) dis.readObject();
					
						this.IWRT03 = (BigDecimal) dis.readObject();
					
						this.IWRT04 = (BigDecimal) dis.readObject();
					
						this.IWRT05 = (BigDecimal) dis.readObject();
					
						this.IWRT06 = (BigDecimal) dis.readObject();
					
						this.IWRT07 = (BigDecimal) dis.readObject();
					
						this.IWRT08 = (BigDecimal) dis.readObject();
					
						this.IWRT09 = (BigDecimal) dis.readObject();
					
						this.IWRT10 = (BigDecimal) dis.readObject();
					
						this.IWRT11 = (BigDecimal) dis.readObject();
					
						this.IWRT12 = (BigDecimal) dis.readObject();
					
						this.IWRT13 = (BigDecimal) dis.readObject();
					
						this.IWRT14 = (BigDecimal) dis.readObject();
					
						this.IWRT15 = (BigDecimal) dis.readObject();
					
						this.IWRT16 = (BigDecimal) dis.readObject();
					
						this.IWRT17 = (BigDecimal) dis.readObject();
					
						this.IWRT18 = (BigDecimal) dis.readObject();
					
						this.IWRT19 = (BigDecimal) dis.readObject();
					
						this.IWRT20 = (BigDecimal) dis.readObject();
					
						this.IWRT21 = (BigDecimal) dis.readObject();
					
						this.IWRT22 = (BigDecimal) dis.readObject();
					
						this.IWRT23 = (BigDecimal) dis.readObject();
					
						this.IWRT24 = (BigDecimal) dis.readObject();
					
						this.IWRT25 = (BigDecimal) dis.readObject();
					
						this.IWRT26 = (BigDecimal) dis.readObject();
					
						this.IWRT27 = (BigDecimal) dis.readObject();
					
						this.IWRT28 = (BigDecimal) dis.readObject();
					
						this.IWRT29 = (BigDecimal) dis.readObject();
					
						this.IWRT30 = (BigDecimal) dis.readObject();
					
						this.IWRT31 = (BigDecimal) dis.readObject();
					
						this.IWRT32 = (BigDecimal) dis.readObject();
					
						this.IWRT33 = (BigDecimal) dis.readObject();
					
						this.IWRT34 = (BigDecimal) dis.readObject();
					
						this.IWRT35 = (BigDecimal) dis.readObject();
					
						this.IWRT36 = (BigDecimal) dis.readObject();
					
						this.IWRT37 = (BigDecimal) dis.readObject();
					
						this.IWRT38 = (BigDecimal) dis.readObject();
					
						this.IWRT39 = (BigDecimal) dis.readObject();
					
						this.IWRT40 = (BigDecimal) dis.readObject();
					
						this.IWRT41 = (BigDecimal) dis.readObject();
					
						this.IWRT42 = (BigDecimal) dis.readObject();
					
						this.IWRT43 = (BigDecimal) dis.readObject();
					
						this.IWRT44 = (BigDecimal) dis.readObject();
					
						this.IWRT45 = (BigDecimal) dis.readObject();
					
						this.IWRT46 = (BigDecimal) dis.readObject();
					
						this.IWRT47 = (BigDecimal) dis.readObject();
					
						this.IWRT48 = (BigDecimal) dis.readObject();
					
						this.IWRT49 = (BigDecimal) dis.readObject();
					
						this.IWRT50 = (BigDecimal) dis.readObject();
					
						this.IWRT51 = (BigDecimal) dis.readObject();
					
						this.IWRT52 = (BigDecimal) dis.readObject();
					
						this.IWRT53 = (BigDecimal) dis.readObject();
					
						this.IWCS01 = (BigDecimal) dis.readObject();
					
						this.IWCS02 = (BigDecimal) dis.readObject();
					
						this.IWCS03 = (BigDecimal) dis.readObject();
					
						this.IWCS04 = (BigDecimal) dis.readObject();
					
						this.IWCS05 = (BigDecimal) dis.readObject();
					
						this.IWCS06 = (BigDecimal) dis.readObject();
					
						this.IWCS07 = (BigDecimal) dis.readObject();
					
						this.IWCS08 = (BigDecimal) dis.readObject();
					
						this.IWCS09 = (BigDecimal) dis.readObject();
					
						this.IWCS10 = (BigDecimal) dis.readObject();
					
						this.IWCS11 = (BigDecimal) dis.readObject();
					
						this.IWCS12 = (BigDecimal) dis.readObject();
					
						this.IWCS13 = (BigDecimal) dis.readObject();
					
						this.IWCS14 = (BigDecimal) dis.readObject();
					
						this.IWCS15 = (BigDecimal) dis.readObject();
					
						this.IWCS16 = (BigDecimal) dis.readObject();
					
						this.IWCS17 = (BigDecimal) dis.readObject();
					
						this.IWCS18 = (BigDecimal) dis.readObject();
					
						this.IWCS19 = (BigDecimal) dis.readObject();
					
						this.IWCS20 = (BigDecimal) dis.readObject();
					
						this.IWCS21 = (BigDecimal) dis.readObject();
					
						this.IWCS22 = (BigDecimal) dis.readObject();
					
						this.IWCS23 = (BigDecimal) dis.readObject();
					
						this.IWCS24 = (BigDecimal) dis.readObject();
					
						this.IWCS25 = (BigDecimal) dis.readObject();
					
						this.IWCS26 = (BigDecimal) dis.readObject();
					
						this.IWCS27 = (BigDecimal) dis.readObject();
					
						this.IWCS28 = (BigDecimal) dis.readObject();
					
						this.IWCS29 = (BigDecimal) dis.readObject();
					
						this.IWCS30 = (BigDecimal) dis.readObject();
					
						this.IWCS31 = (BigDecimal) dis.readObject();
					
						this.IWCS32 = (BigDecimal) dis.readObject();
					
						this.IWCS33 = (BigDecimal) dis.readObject();
					
						this.IWCS34 = (BigDecimal) dis.readObject();
					
						this.IWCS35 = (BigDecimal) dis.readObject();
					
						this.IWCS36 = (BigDecimal) dis.readObject();
					
						this.IWCS37 = (BigDecimal) dis.readObject();
					
						this.IWCS38 = (BigDecimal) dis.readObject();
					
						this.IWCS39 = (BigDecimal) dis.readObject();
					
						this.IWCS40 = (BigDecimal) dis.readObject();
					
						this.IWCS41 = (BigDecimal) dis.readObject();
					
						this.IWCS42 = (BigDecimal) dis.readObject();
					
						this.IWCS43 = (BigDecimal) dis.readObject();
					
						this.IWCS44 = (BigDecimal) dis.readObject();
					
						this.IWCS45 = (BigDecimal) dis.readObject();
					
						this.IWCS46 = (BigDecimal) dis.readObject();
					
						this.IWCS47 = (BigDecimal) dis.readObject();
					
						this.IWCS48 = (BigDecimal) dis.readObject();
					
						this.IWCS49 = (BigDecimal) dis.readObject();
					
						this.IWCS50 = (BigDecimal) dis.readObject();
					
						this.IWCS51 = (BigDecimal) dis.readObject();
					
						this.IWCS52 = (BigDecimal) dis.readObject();
					
						this.IWCS53 = (BigDecimal) dis.readObject();
					
						this.IWVT01 = (BigDecimal) dis.readObject();
					
						this.IWVT02 = (BigDecimal) dis.readObject();
					
						this.IWVT03 = (BigDecimal) dis.readObject();
					
						this.IWVT04 = (BigDecimal) dis.readObject();
					
						this.IWVT05 = (BigDecimal) dis.readObject();
					
						this.IWVT06 = (BigDecimal) dis.readObject();
					
						this.IWVT07 = (BigDecimal) dis.readObject();
					
						this.IWVT08 = (BigDecimal) dis.readObject();
					
						this.IWVT09 = (BigDecimal) dis.readObject();
					
						this.IWVT10 = (BigDecimal) dis.readObject();
					
						this.IWVT11 = (BigDecimal) dis.readObject();
					
						this.IWVT12 = (BigDecimal) dis.readObject();
					
						this.IWVT13 = (BigDecimal) dis.readObject();
					
						this.IWVT14 = (BigDecimal) dis.readObject();
					
						this.IWVT15 = (BigDecimal) dis.readObject();
					
						this.IWVT16 = (BigDecimal) dis.readObject();
					
						this.IWVT17 = (BigDecimal) dis.readObject();
					
						this.IWVT18 = (BigDecimal) dis.readObject();
					
						this.IWVT19 = (BigDecimal) dis.readObject();
					
						this.IWVT20 = (BigDecimal) dis.readObject();
					
						this.IWVT21 = (BigDecimal) dis.readObject();
					
						this.IWVT22 = (BigDecimal) dis.readObject();
					
						this.IWVT23 = (BigDecimal) dis.readObject();
					
						this.IWVT24 = (BigDecimal) dis.readObject();
					
						this.IWVT25 = (BigDecimal) dis.readObject();
					
						this.IWVT26 = (BigDecimal) dis.readObject();
					
						this.IWVT27 = (BigDecimal) dis.readObject();
					
						this.IWVT28 = (BigDecimal) dis.readObject();
					
						this.IWVT29 = (BigDecimal) dis.readObject();
					
						this.IWVT30 = (BigDecimal) dis.readObject();
					
						this.IWVT31 = (BigDecimal) dis.readObject();
					
						this.IWVT32 = (BigDecimal) dis.readObject();
					
						this.IWVT33 = (BigDecimal) dis.readObject();
					
						this.IWVT34 = (BigDecimal) dis.readObject();
					
						this.IWVT35 = (BigDecimal) dis.readObject();
					
						this.IWVT36 = (BigDecimal) dis.readObject();
					
						this.IWVT37 = (BigDecimal) dis.readObject();
					
						this.IWVT38 = (BigDecimal) dis.readObject();
					
						this.IWVT39 = (BigDecimal) dis.readObject();
					
						this.IWVT40 = (BigDecimal) dis.readObject();
					
						this.IWVT41 = (BigDecimal) dis.readObject();
					
						this.IWVT42 = (BigDecimal) dis.readObject();
					
						this.IWVT43 = (BigDecimal) dis.readObject();
					
						this.IWVT44 = (BigDecimal) dis.readObject();
					
						this.IWVT45 = (BigDecimal) dis.readObject();
					
						this.IWVT46 = (BigDecimal) dis.readObject();
					
						this.IWVT47 = (BigDecimal) dis.readObject();
					
						this.IWVT48 = (BigDecimal) dis.readObject();
					
						this.IWVT49 = (BigDecimal) dis.readObject();
					
						this.IWVT50 = (BigDecimal) dis.readObject();
					
						this.IWVT51 = (BigDecimal) dis.readObject();
					
						this.IWVT52 = (BigDecimal) dis.readObject();
					
						this.IWVT53 = (BigDecimal) dis.readObject();
					
					this.IWOS01 = readString(dis);
					
					this.IWOS02 = readString(dis);
					
					this.IWOS03 = readString(dis);
					
					this.IWOS04 = readString(dis);
					
					this.IWOS05 = readString(dis);
					
					this.IWOS06 = readString(dis);
					
					this.IWOS07 = readString(dis);
					
					this.IWOS08 = readString(dis);
					
					this.IWOS09 = readString(dis);
					
					this.IWOS10 = readString(dis);
					
					this.IWOS11 = readString(dis);
					
					this.IWOS12 = readString(dis);
					
					this.IWOS13 = readString(dis);
					
					this.IWOS14 = readString(dis);
					
					this.IWOS15 = readString(dis);
					
					this.IWOS16 = readString(dis);
					
					this.IWOS17 = readString(dis);
					
					this.IWOS18 = readString(dis);
					
					this.IWOS19 = readString(dis);
					
					this.IWOS20 = readString(dis);
					
					this.IWOS21 = readString(dis);
					
					this.IWOS22 = readString(dis);
					
					this.IWOS23 = readString(dis);
					
					this.IWOS24 = readString(dis);
					
					this.IWOS25 = readString(dis);
					
					this.IWOS26 = readString(dis);
					
					this.IWOS27 = readString(dis);
					
					this.IWOS28 = readString(dis);
					
					this.IWOS29 = readString(dis);
					
					this.IWOS30 = readString(dis);
					
					this.IWOS31 = readString(dis);
					
					this.IWOS32 = readString(dis);
					
					this.IWOS33 = readString(dis);
					
					this.IWOS34 = readString(dis);
					
					this.IWOS35 = readString(dis);
					
					this.IWOS36 = readString(dis);
					
					this.IWOS37 = readString(dis);
					
					this.IWOS38 = readString(dis);
					
					this.IWOS39 = readString(dis);
					
					this.IWOS40 = readString(dis);
					
					this.IWOS41 = readString(dis);
					
					this.IWOS42 = readString(dis);
					
					this.IWOS43 = readString(dis);
					
					this.IWOS44 = readString(dis);
					
					this.IWOS45 = readString(dis);
					
					this.IWOS46 = readString(dis);
					
					this.IWOS47 = readString(dis);
					
					this.IWOS48 = readString(dis);
					
					this.IWOS49 = readString(dis);
					
					this.IWOS50 = readString(dis);
					
					this.IWOS51 = readString(dis);
					
					this.IWOS52 = readString(dis);
					
					this.IWOS53 = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVENTORY_HISTORY_FILE_INVHSW) {

        	try {

        		int length = 0;
		
						this.IWCENT = (BigDecimal) dis.readObject();
					
						this.IWYEAR = (BigDecimal) dis.readObject();
					
						this.IWVNDR = (BigDecimal) dis.readObject();
					
					this.IWSTYL = readString(dis);
					
						this.IWSKU = (BigDecimal) dis.readObject();
					
						this.IWSTR = (BigDecimal) dis.readObject();
					
						this.IWHTYP = (BigDecimal) dis.readObject();
					
						this.IWQT01 = (BigDecimal) dis.readObject();
					
						this.IWQT02 = (BigDecimal) dis.readObject();
					
						this.IWQT03 = (BigDecimal) dis.readObject();
					
						this.IWQT04 = (BigDecimal) dis.readObject();
					
						this.IWQT05 = (BigDecimal) dis.readObject();
					
						this.IWQT06 = (BigDecimal) dis.readObject();
					
						this.IWQT07 = (BigDecimal) dis.readObject();
					
						this.IWQT08 = (BigDecimal) dis.readObject();
					
						this.IWQT09 = (BigDecimal) dis.readObject();
					
						this.IWQT10 = (BigDecimal) dis.readObject();
					
						this.IWQT11 = (BigDecimal) dis.readObject();
					
						this.IWQT12 = (BigDecimal) dis.readObject();
					
						this.IWQT13 = (BigDecimal) dis.readObject();
					
						this.IWQT14 = (BigDecimal) dis.readObject();
					
						this.IWQT15 = (BigDecimal) dis.readObject();
					
						this.IWQT16 = (BigDecimal) dis.readObject();
					
						this.IWQT17 = (BigDecimal) dis.readObject();
					
						this.IWQT18 = (BigDecimal) dis.readObject();
					
						this.IWQT19 = (BigDecimal) dis.readObject();
					
						this.IWQT20 = (BigDecimal) dis.readObject();
					
						this.IWQT21 = (BigDecimal) dis.readObject();
					
						this.IWQT22 = (BigDecimal) dis.readObject();
					
						this.IWQT23 = (BigDecimal) dis.readObject();
					
						this.IWQT24 = (BigDecimal) dis.readObject();
					
						this.IWQT25 = (BigDecimal) dis.readObject();
					
						this.IWQT26 = (BigDecimal) dis.readObject();
					
						this.IWQT27 = (BigDecimal) dis.readObject();
					
						this.IWQT28 = (BigDecimal) dis.readObject();
					
						this.IWQT29 = (BigDecimal) dis.readObject();
					
						this.IWQT30 = (BigDecimal) dis.readObject();
					
						this.IWQT31 = (BigDecimal) dis.readObject();
					
						this.IWQT32 = (BigDecimal) dis.readObject();
					
						this.IWQT33 = (BigDecimal) dis.readObject();
					
						this.IWQT34 = (BigDecimal) dis.readObject();
					
						this.IWQT35 = (BigDecimal) dis.readObject();
					
						this.IWQT36 = (BigDecimal) dis.readObject();
					
						this.IWQT37 = (BigDecimal) dis.readObject();
					
						this.IWQT38 = (BigDecimal) dis.readObject();
					
						this.IWQT39 = (BigDecimal) dis.readObject();
					
						this.IWQT40 = (BigDecimal) dis.readObject();
					
						this.IWQT41 = (BigDecimal) dis.readObject();
					
						this.IWQT42 = (BigDecimal) dis.readObject();
					
						this.IWQT43 = (BigDecimal) dis.readObject();
					
						this.IWQT44 = (BigDecimal) dis.readObject();
					
						this.IWQT45 = (BigDecimal) dis.readObject();
					
						this.IWQT46 = (BigDecimal) dis.readObject();
					
						this.IWQT47 = (BigDecimal) dis.readObject();
					
						this.IWQT48 = (BigDecimal) dis.readObject();
					
						this.IWQT49 = (BigDecimal) dis.readObject();
					
						this.IWQT50 = (BigDecimal) dis.readObject();
					
						this.IWQT51 = (BigDecimal) dis.readObject();
					
						this.IWQT52 = (BigDecimal) dis.readObject();
					
						this.IWQT53 = (BigDecimal) dis.readObject();
					
						this.IWRT01 = (BigDecimal) dis.readObject();
					
						this.IWRT02 = (BigDecimal) dis.readObject();
					
						this.IWRT03 = (BigDecimal) dis.readObject();
					
						this.IWRT04 = (BigDecimal) dis.readObject();
					
						this.IWRT05 = (BigDecimal) dis.readObject();
					
						this.IWRT06 = (BigDecimal) dis.readObject();
					
						this.IWRT07 = (BigDecimal) dis.readObject();
					
						this.IWRT08 = (BigDecimal) dis.readObject();
					
						this.IWRT09 = (BigDecimal) dis.readObject();
					
						this.IWRT10 = (BigDecimal) dis.readObject();
					
						this.IWRT11 = (BigDecimal) dis.readObject();
					
						this.IWRT12 = (BigDecimal) dis.readObject();
					
						this.IWRT13 = (BigDecimal) dis.readObject();
					
						this.IWRT14 = (BigDecimal) dis.readObject();
					
						this.IWRT15 = (BigDecimal) dis.readObject();
					
						this.IWRT16 = (BigDecimal) dis.readObject();
					
						this.IWRT17 = (BigDecimal) dis.readObject();
					
						this.IWRT18 = (BigDecimal) dis.readObject();
					
						this.IWRT19 = (BigDecimal) dis.readObject();
					
						this.IWRT20 = (BigDecimal) dis.readObject();
					
						this.IWRT21 = (BigDecimal) dis.readObject();
					
						this.IWRT22 = (BigDecimal) dis.readObject();
					
						this.IWRT23 = (BigDecimal) dis.readObject();
					
						this.IWRT24 = (BigDecimal) dis.readObject();
					
						this.IWRT25 = (BigDecimal) dis.readObject();
					
						this.IWRT26 = (BigDecimal) dis.readObject();
					
						this.IWRT27 = (BigDecimal) dis.readObject();
					
						this.IWRT28 = (BigDecimal) dis.readObject();
					
						this.IWRT29 = (BigDecimal) dis.readObject();
					
						this.IWRT30 = (BigDecimal) dis.readObject();
					
						this.IWRT31 = (BigDecimal) dis.readObject();
					
						this.IWRT32 = (BigDecimal) dis.readObject();
					
						this.IWRT33 = (BigDecimal) dis.readObject();
					
						this.IWRT34 = (BigDecimal) dis.readObject();
					
						this.IWRT35 = (BigDecimal) dis.readObject();
					
						this.IWRT36 = (BigDecimal) dis.readObject();
					
						this.IWRT37 = (BigDecimal) dis.readObject();
					
						this.IWRT38 = (BigDecimal) dis.readObject();
					
						this.IWRT39 = (BigDecimal) dis.readObject();
					
						this.IWRT40 = (BigDecimal) dis.readObject();
					
						this.IWRT41 = (BigDecimal) dis.readObject();
					
						this.IWRT42 = (BigDecimal) dis.readObject();
					
						this.IWRT43 = (BigDecimal) dis.readObject();
					
						this.IWRT44 = (BigDecimal) dis.readObject();
					
						this.IWRT45 = (BigDecimal) dis.readObject();
					
						this.IWRT46 = (BigDecimal) dis.readObject();
					
						this.IWRT47 = (BigDecimal) dis.readObject();
					
						this.IWRT48 = (BigDecimal) dis.readObject();
					
						this.IWRT49 = (BigDecimal) dis.readObject();
					
						this.IWRT50 = (BigDecimal) dis.readObject();
					
						this.IWRT51 = (BigDecimal) dis.readObject();
					
						this.IWRT52 = (BigDecimal) dis.readObject();
					
						this.IWRT53 = (BigDecimal) dis.readObject();
					
						this.IWCS01 = (BigDecimal) dis.readObject();
					
						this.IWCS02 = (BigDecimal) dis.readObject();
					
						this.IWCS03 = (BigDecimal) dis.readObject();
					
						this.IWCS04 = (BigDecimal) dis.readObject();
					
						this.IWCS05 = (BigDecimal) dis.readObject();
					
						this.IWCS06 = (BigDecimal) dis.readObject();
					
						this.IWCS07 = (BigDecimal) dis.readObject();
					
						this.IWCS08 = (BigDecimal) dis.readObject();
					
						this.IWCS09 = (BigDecimal) dis.readObject();
					
						this.IWCS10 = (BigDecimal) dis.readObject();
					
						this.IWCS11 = (BigDecimal) dis.readObject();
					
						this.IWCS12 = (BigDecimal) dis.readObject();
					
						this.IWCS13 = (BigDecimal) dis.readObject();
					
						this.IWCS14 = (BigDecimal) dis.readObject();
					
						this.IWCS15 = (BigDecimal) dis.readObject();
					
						this.IWCS16 = (BigDecimal) dis.readObject();
					
						this.IWCS17 = (BigDecimal) dis.readObject();
					
						this.IWCS18 = (BigDecimal) dis.readObject();
					
						this.IWCS19 = (BigDecimal) dis.readObject();
					
						this.IWCS20 = (BigDecimal) dis.readObject();
					
						this.IWCS21 = (BigDecimal) dis.readObject();
					
						this.IWCS22 = (BigDecimal) dis.readObject();
					
						this.IWCS23 = (BigDecimal) dis.readObject();
					
						this.IWCS24 = (BigDecimal) dis.readObject();
					
						this.IWCS25 = (BigDecimal) dis.readObject();
					
						this.IWCS26 = (BigDecimal) dis.readObject();
					
						this.IWCS27 = (BigDecimal) dis.readObject();
					
						this.IWCS28 = (BigDecimal) dis.readObject();
					
						this.IWCS29 = (BigDecimal) dis.readObject();
					
						this.IWCS30 = (BigDecimal) dis.readObject();
					
						this.IWCS31 = (BigDecimal) dis.readObject();
					
						this.IWCS32 = (BigDecimal) dis.readObject();
					
						this.IWCS33 = (BigDecimal) dis.readObject();
					
						this.IWCS34 = (BigDecimal) dis.readObject();
					
						this.IWCS35 = (BigDecimal) dis.readObject();
					
						this.IWCS36 = (BigDecimal) dis.readObject();
					
						this.IWCS37 = (BigDecimal) dis.readObject();
					
						this.IWCS38 = (BigDecimal) dis.readObject();
					
						this.IWCS39 = (BigDecimal) dis.readObject();
					
						this.IWCS40 = (BigDecimal) dis.readObject();
					
						this.IWCS41 = (BigDecimal) dis.readObject();
					
						this.IWCS42 = (BigDecimal) dis.readObject();
					
						this.IWCS43 = (BigDecimal) dis.readObject();
					
						this.IWCS44 = (BigDecimal) dis.readObject();
					
						this.IWCS45 = (BigDecimal) dis.readObject();
					
						this.IWCS46 = (BigDecimal) dis.readObject();
					
						this.IWCS47 = (BigDecimal) dis.readObject();
					
						this.IWCS48 = (BigDecimal) dis.readObject();
					
						this.IWCS49 = (BigDecimal) dis.readObject();
					
						this.IWCS50 = (BigDecimal) dis.readObject();
					
						this.IWCS51 = (BigDecimal) dis.readObject();
					
						this.IWCS52 = (BigDecimal) dis.readObject();
					
						this.IWCS53 = (BigDecimal) dis.readObject();
					
						this.IWVT01 = (BigDecimal) dis.readObject();
					
						this.IWVT02 = (BigDecimal) dis.readObject();
					
						this.IWVT03 = (BigDecimal) dis.readObject();
					
						this.IWVT04 = (BigDecimal) dis.readObject();
					
						this.IWVT05 = (BigDecimal) dis.readObject();
					
						this.IWVT06 = (BigDecimal) dis.readObject();
					
						this.IWVT07 = (BigDecimal) dis.readObject();
					
						this.IWVT08 = (BigDecimal) dis.readObject();
					
						this.IWVT09 = (BigDecimal) dis.readObject();
					
						this.IWVT10 = (BigDecimal) dis.readObject();
					
						this.IWVT11 = (BigDecimal) dis.readObject();
					
						this.IWVT12 = (BigDecimal) dis.readObject();
					
						this.IWVT13 = (BigDecimal) dis.readObject();
					
						this.IWVT14 = (BigDecimal) dis.readObject();
					
						this.IWVT15 = (BigDecimal) dis.readObject();
					
						this.IWVT16 = (BigDecimal) dis.readObject();
					
						this.IWVT17 = (BigDecimal) dis.readObject();
					
						this.IWVT18 = (BigDecimal) dis.readObject();
					
						this.IWVT19 = (BigDecimal) dis.readObject();
					
						this.IWVT20 = (BigDecimal) dis.readObject();
					
						this.IWVT21 = (BigDecimal) dis.readObject();
					
						this.IWVT22 = (BigDecimal) dis.readObject();
					
						this.IWVT23 = (BigDecimal) dis.readObject();
					
						this.IWVT24 = (BigDecimal) dis.readObject();
					
						this.IWVT25 = (BigDecimal) dis.readObject();
					
						this.IWVT26 = (BigDecimal) dis.readObject();
					
						this.IWVT27 = (BigDecimal) dis.readObject();
					
						this.IWVT28 = (BigDecimal) dis.readObject();
					
						this.IWVT29 = (BigDecimal) dis.readObject();
					
						this.IWVT30 = (BigDecimal) dis.readObject();
					
						this.IWVT31 = (BigDecimal) dis.readObject();
					
						this.IWVT32 = (BigDecimal) dis.readObject();
					
						this.IWVT33 = (BigDecimal) dis.readObject();
					
						this.IWVT34 = (BigDecimal) dis.readObject();
					
						this.IWVT35 = (BigDecimal) dis.readObject();
					
						this.IWVT36 = (BigDecimal) dis.readObject();
					
						this.IWVT37 = (BigDecimal) dis.readObject();
					
						this.IWVT38 = (BigDecimal) dis.readObject();
					
						this.IWVT39 = (BigDecimal) dis.readObject();
					
						this.IWVT40 = (BigDecimal) dis.readObject();
					
						this.IWVT41 = (BigDecimal) dis.readObject();
					
						this.IWVT42 = (BigDecimal) dis.readObject();
					
						this.IWVT43 = (BigDecimal) dis.readObject();
					
						this.IWVT44 = (BigDecimal) dis.readObject();
					
						this.IWVT45 = (BigDecimal) dis.readObject();
					
						this.IWVT46 = (BigDecimal) dis.readObject();
					
						this.IWVT47 = (BigDecimal) dis.readObject();
					
						this.IWVT48 = (BigDecimal) dis.readObject();
					
						this.IWVT49 = (BigDecimal) dis.readObject();
					
						this.IWVT50 = (BigDecimal) dis.readObject();
					
						this.IWVT51 = (BigDecimal) dis.readObject();
					
						this.IWVT52 = (BigDecimal) dis.readObject();
					
						this.IWVT53 = (BigDecimal) dis.readObject();
					
					this.IWOS01 = readString(dis);
					
					this.IWOS02 = readString(dis);
					
					this.IWOS03 = readString(dis);
					
					this.IWOS04 = readString(dis);
					
					this.IWOS05 = readString(dis);
					
					this.IWOS06 = readString(dis);
					
					this.IWOS07 = readString(dis);
					
					this.IWOS08 = readString(dis);
					
					this.IWOS09 = readString(dis);
					
					this.IWOS10 = readString(dis);
					
					this.IWOS11 = readString(dis);
					
					this.IWOS12 = readString(dis);
					
					this.IWOS13 = readString(dis);
					
					this.IWOS14 = readString(dis);
					
					this.IWOS15 = readString(dis);
					
					this.IWOS16 = readString(dis);
					
					this.IWOS17 = readString(dis);
					
					this.IWOS18 = readString(dis);
					
					this.IWOS19 = readString(dis);
					
					this.IWOS20 = readString(dis);
					
					this.IWOS21 = readString(dis);
					
					this.IWOS22 = readString(dis);
					
					this.IWOS23 = readString(dis);
					
					this.IWOS24 = readString(dis);
					
					this.IWOS25 = readString(dis);
					
					this.IWOS26 = readString(dis);
					
					this.IWOS27 = readString(dis);
					
					this.IWOS28 = readString(dis);
					
					this.IWOS29 = readString(dis);
					
					this.IWOS30 = readString(dis);
					
					this.IWOS31 = readString(dis);
					
					this.IWOS32 = readString(dis);
					
					this.IWOS33 = readString(dis);
					
					this.IWOS34 = readString(dis);
					
					this.IWOS35 = readString(dis);
					
					this.IWOS36 = readString(dis);
					
					this.IWOS37 = readString(dis);
					
					this.IWOS38 = readString(dis);
					
					this.IWOS39 = readString(dis);
					
					this.IWOS40 = readString(dis);
					
					this.IWOS41 = readString(dis);
					
					this.IWOS42 = readString(dis);
					
					this.IWOS43 = readString(dis);
					
					this.IWOS44 = readString(dis);
					
					this.IWOS45 = readString(dis);
					
					this.IWOS46 = readString(dis);
					
					this.IWOS47 = readString(dis);
					
					this.IWOS48 = readString(dis);
					
					this.IWOS49 = readString(dis);
					
					this.IWOS50 = readString(dis);
					
					this.IWOS51 = readString(dis);
					
					this.IWOS52 = readString(dis);
					
					this.IWOS53 = readString(dis);
					
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
				
       			    	dos.writeObject(this.IWCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWYEAR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVNDR);
					
					// String
				
						writeString(this.IWSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWHTYP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT53);
					
					// String
				
						writeString(this.IWOS01,dos);
					
					// String
				
						writeString(this.IWOS02,dos);
					
					// String
				
						writeString(this.IWOS03,dos);
					
					// String
				
						writeString(this.IWOS04,dos);
					
					// String
				
						writeString(this.IWOS05,dos);
					
					// String
				
						writeString(this.IWOS06,dos);
					
					// String
				
						writeString(this.IWOS07,dos);
					
					// String
				
						writeString(this.IWOS08,dos);
					
					// String
				
						writeString(this.IWOS09,dos);
					
					// String
				
						writeString(this.IWOS10,dos);
					
					// String
				
						writeString(this.IWOS11,dos);
					
					// String
				
						writeString(this.IWOS12,dos);
					
					// String
				
						writeString(this.IWOS13,dos);
					
					// String
				
						writeString(this.IWOS14,dos);
					
					// String
				
						writeString(this.IWOS15,dos);
					
					// String
				
						writeString(this.IWOS16,dos);
					
					// String
				
						writeString(this.IWOS17,dos);
					
					// String
				
						writeString(this.IWOS18,dos);
					
					// String
				
						writeString(this.IWOS19,dos);
					
					// String
				
						writeString(this.IWOS20,dos);
					
					// String
				
						writeString(this.IWOS21,dos);
					
					// String
				
						writeString(this.IWOS22,dos);
					
					// String
				
						writeString(this.IWOS23,dos);
					
					// String
				
						writeString(this.IWOS24,dos);
					
					// String
				
						writeString(this.IWOS25,dos);
					
					// String
				
						writeString(this.IWOS26,dos);
					
					// String
				
						writeString(this.IWOS27,dos);
					
					// String
				
						writeString(this.IWOS28,dos);
					
					// String
				
						writeString(this.IWOS29,dos);
					
					// String
				
						writeString(this.IWOS30,dos);
					
					// String
				
						writeString(this.IWOS31,dos);
					
					// String
				
						writeString(this.IWOS32,dos);
					
					// String
				
						writeString(this.IWOS33,dos);
					
					// String
				
						writeString(this.IWOS34,dos);
					
					// String
				
						writeString(this.IWOS35,dos);
					
					// String
				
						writeString(this.IWOS36,dos);
					
					// String
				
						writeString(this.IWOS37,dos);
					
					// String
				
						writeString(this.IWOS38,dos);
					
					// String
				
						writeString(this.IWOS39,dos);
					
					// String
				
						writeString(this.IWOS40,dos);
					
					// String
				
						writeString(this.IWOS41,dos);
					
					// String
				
						writeString(this.IWOS42,dos);
					
					// String
				
						writeString(this.IWOS43,dos);
					
					// String
				
						writeString(this.IWOS44,dos);
					
					// String
				
						writeString(this.IWOS45,dos);
					
					// String
				
						writeString(this.IWOS46,dos);
					
					// String
				
						writeString(this.IWOS47,dos);
					
					// String
				
						writeString(this.IWOS48,dos);
					
					// String
				
						writeString(this.IWOS49,dos);
					
					// String
				
						writeString(this.IWOS50,dos);
					
					// String
				
						writeString(this.IWOS51,dos);
					
					// String
				
						writeString(this.IWOS52,dos);
					
					// String
				
						writeString(this.IWOS53,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.IWCENT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWYEAR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVNDR);
					
					// String
				
						writeString(this.IWSTYL,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWSKU);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWSTR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWHTYP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWQT53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWRT53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWCS53);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT01);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT02);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT03);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT04);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT05);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT06);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT07);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT08);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT09);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT10);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT11);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT12);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT13);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT14);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT15);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT16);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT17);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT18);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT19);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT20);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT21);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT22);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT23);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT24);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT25);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT26);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT27);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT28);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT29);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT30);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT31);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT32);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT33);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT34);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT35);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT36);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT37);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT38);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT39);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT40);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT41);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT42);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT43);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT44);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT45);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT46);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT47);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT48);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT49);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT50);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT51);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT52);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IWVT53);
					
					// String
				
						writeString(this.IWOS01,dos);
					
					// String
				
						writeString(this.IWOS02,dos);
					
					// String
				
						writeString(this.IWOS03,dos);
					
					// String
				
						writeString(this.IWOS04,dos);
					
					// String
				
						writeString(this.IWOS05,dos);
					
					// String
				
						writeString(this.IWOS06,dos);
					
					// String
				
						writeString(this.IWOS07,dos);
					
					// String
				
						writeString(this.IWOS08,dos);
					
					// String
				
						writeString(this.IWOS09,dos);
					
					// String
				
						writeString(this.IWOS10,dos);
					
					// String
				
						writeString(this.IWOS11,dos);
					
					// String
				
						writeString(this.IWOS12,dos);
					
					// String
				
						writeString(this.IWOS13,dos);
					
					// String
				
						writeString(this.IWOS14,dos);
					
					// String
				
						writeString(this.IWOS15,dos);
					
					// String
				
						writeString(this.IWOS16,dos);
					
					// String
				
						writeString(this.IWOS17,dos);
					
					// String
				
						writeString(this.IWOS18,dos);
					
					// String
				
						writeString(this.IWOS19,dos);
					
					// String
				
						writeString(this.IWOS20,dos);
					
					// String
				
						writeString(this.IWOS21,dos);
					
					// String
				
						writeString(this.IWOS22,dos);
					
					// String
				
						writeString(this.IWOS23,dos);
					
					// String
				
						writeString(this.IWOS24,dos);
					
					// String
				
						writeString(this.IWOS25,dos);
					
					// String
				
						writeString(this.IWOS26,dos);
					
					// String
				
						writeString(this.IWOS27,dos);
					
					// String
				
						writeString(this.IWOS28,dos);
					
					// String
				
						writeString(this.IWOS29,dos);
					
					// String
				
						writeString(this.IWOS30,dos);
					
					// String
				
						writeString(this.IWOS31,dos);
					
					// String
				
						writeString(this.IWOS32,dos);
					
					// String
				
						writeString(this.IWOS33,dos);
					
					// String
				
						writeString(this.IWOS34,dos);
					
					// String
				
						writeString(this.IWOS35,dos);
					
					// String
				
						writeString(this.IWOS36,dos);
					
					// String
				
						writeString(this.IWOS37,dos);
					
					// String
				
						writeString(this.IWOS38,dos);
					
					// String
				
						writeString(this.IWOS39,dos);
					
					// String
				
						writeString(this.IWOS40,dos);
					
					// String
				
						writeString(this.IWOS41,dos);
					
					// String
				
						writeString(this.IWOS42,dos);
					
					// String
				
						writeString(this.IWOS43,dos);
					
					// String
				
						writeString(this.IWOS44,dos);
					
					// String
				
						writeString(this.IWOS45,dos);
					
					// String
				
						writeString(this.IWOS46,dos);
					
					// String
				
						writeString(this.IWOS47,dos);
					
					// String
				
						writeString(this.IWOS48,dos);
					
					// String
				
						writeString(this.IWOS49,dos);
					
					// String
				
						writeString(this.IWOS50,dos);
					
					// String
				
						writeString(this.IWOS51,dos);
					
					// String
				
						writeString(this.IWOS52,dos);
					
					// String
				
						writeString(this.IWOS53,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("IWCENT="+String.valueOf(IWCENT));
		sb.append(",IWYEAR="+String.valueOf(IWYEAR));
		sb.append(",IWVNDR="+String.valueOf(IWVNDR));
		sb.append(",IWSTYL="+IWSTYL);
		sb.append(",IWSKU="+String.valueOf(IWSKU));
		sb.append(",IWSTR="+String.valueOf(IWSTR));
		sb.append(",IWHTYP="+String.valueOf(IWHTYP));
		sb.append(",IWQT01="+String.valueOf(IWQT01));
		sb.append(",IWQT02="+String.valueOf(IWQT02));
		sb.append(",IWQT03="+String.valueOf(IWQT03));
		sb.append(",IWQT04="+String.valueOf(IWQT04));
		sb.append(",IWQT05="+String.valueOf(IWQT05));
		sb.append(",IWQT06="+String.valueOf(IWQT06));
		sb.append(",IWQT07="+String.valueOf(IWQT07));
		sb.append(",IWQT08="+String.valueOf(IWQT08));
		sb.append(",IWQT09="+String.valueOf(IWQT09));
		sb.append(",IWQT10="+String.valueOf(IWQT10));
		sb.append(",IWQT11="+String.valueOf(IWQT11));
		sb.append(",IWQT12="+String.valueOf(IWQT12));
		sb.append(",IWQT13="+String.valueOf(IWQT13));
		sb.append(",IWQT14="+String.valueOf(IWQT14));
		sb.append(",IWQT15="+String.valueOf(IWQT15));
		sb.append(",IWQT16="+String.valueOf(IWQT16));
		sb.append(",IWQT17="+String.valueOf(IWQT17));
		sb.append(",IWQT18="+String.valueOf(IWQT18));
		sb.append(",IWQT19="+String.valueOf(IWQT19));
		sb.append(",IWQT20="+String.valueOf(IWQT20));
		sb.append(",IWQT21="+String.valueOf(IWQT21));
		sb.append(",IWQT22="+String.valueOf(IWQT22));
		sb.append(",IWQT23="+String.valueOf(IWQT23));
		sb.append(",IWQT24="+String.valueOf(IWQT24));
		sb.append(",IWQT25="+String.valueOf(IWQT25));
		sb.append(",IWQT26="+String.valueOf(IWQT26));
		sb.append(",IWQT27="+String.valueOf(IWQT27));
		sb.append(",IWQT28="+String.valueOf(IWQT28));
		sb.append(",IWQT29="+String.valueOf(IWQT29));
		sb.append(",IWQT30="+String.valueOf(IWQT30));
		sb.append(",IWQT31="+String.valueOf(IWQT31));
		sb.append(",IWQT32="+String.valueOf(IWQT32));
		sb.append(",IWQT33="+String.valueOf(IWQT33));
		sb.append(",IWQT34="+String.valueOf(IWQT34));
		sb.append(",IWQT35="+String.valueOf(IWQT35));
		sb.append(",IWQT36="+String.valueOf(IWQT36));
		sb.append(",IWQT37="+String.valueOf(IWQT37));
		sb.append(",IWQT38="+String.valueOf(IWQT38));
		sb.append(",IWQT39="+String.valueOf(IWQT39));
		sb.append(",IWQT40="+String.valueOf(IWQT40));
		sb.append(",IWQT41="+String.valueOf(IWQT41));
		sb.append(",IWQT42="+String.valueOf(IWQT42));
		sb.append(",IWQT43="+String.valueOf(IWQT43));
		sb.append(",IWQT44="+String.valueOf(IWQT44));
		sb.append(",IWQT45="+String.valueOf(IWQT45));
		sb.append(",IWQT46="+String.valueOf(IWQT46));
		sb.append(",IWQT47="+String.valueOf(IWQT47));
		sb.append(",IWQT48="+String.valueOf(IWQT48));
		sb.append(",IWQT49="+String.valueOf(IWQT49));
		sb.append(",IWQT50="+String.valueOf(IWQT50));
		sb.append(",IWQT51="+String.valueOf(IWQT51));
		sb.append(",IWQT52="+String.valueOf(IWQT52));
		sb.append(",IWQT53="+String.valueOf(IWQT53));
		sb.append(",IWRT01="+String.valueOf(IWRT01));
		sb.append(",IWRT02="+String.valueOf(IWRT02));
		sb.append(",IWRT03="+String.valueOf(IWRT03));
		sb.append(",IWRT04="+String.valueOf(IWRT04));
		sb.append(",IWRT05="+String.valueOf(IWRT05));
		sb.append(",IWRT06="+String.valueOf(IWRT06));
		sb.append(",IWRT07="+String.valueOf(IWRT07));
		sb.append(",IWRT08="+String.valueOf(IWRT08));
		sb.append(",IWRT09="+String.valueOf(IWRT09));
		sb.append(",IWRT10="+String.valueOf(IWRT10));
		sb.append(",IWRT11="+String.valueOf(IWRT11));
		sb.append(",IWRT12="+String.valueOf(IWRT12));
		sb.append(",IWRT13="+String.valueOf(IWRT13));
		sb.append(",IWRT14="+String.valueOf(IWRT14));
		sb.append(",IWRT15="+String.valueOf(IWRT15));
		sb.append(",IWRT16="+String.valueOf(IWRT16));
		sb.append(",IWRT17="+String.valueOf(IWRT17));
		sb.append(",IWRT18="+String.valueOf(IWRT18));
		sb.append(",IWRT19="+String.valueOf(IWRT19));
		sb.append(",IWRT20="+String.valueOf(IWRT20));
		sb.append(",IWRT21="+String.valueOf(IWRT21));
		sb.append(",IWRT22="+String.valueOf(IWRT22));
		sb.append(",IWRT23="+String.valueOf(IWRT23));
		sb.append(",IWRT24="+String.valueOf(IWRT24));
		sb.append(",IWRT25="+String.valueOf(IWRT25));
		sb.append(",IWRT26="+String.valueOf(IWRT26));
		sb.append(",IWRT27="+String.valueOf(IWRT27));
		sb.append(",IWRT28="+String.valueOf(IWRT28));
		sb.append(",IWRT29="+String.valueOf(IWRT29));
		sb.append(",IWRT30="+String.valueOf(IWRT30));
		sb.append(",IWRT31="+String.valueOf(IWRT31));
		sb.append(",IWRT32="+String.valueOf(IWRT32));
		sb.append(",IWRT33="+String.valueOf(IWRT33));
		sb.append(",IWRT34="+String.valueOf(IWRT34));
		sb.append(",IWRT35="+String.valueOf(IWRT35));
		sb.append(",IWRT36="+String.valueOf(IWRT36));
		sb.append(",IWRT37="+String.valueOf(IWRT37));
		sb.append(",IWRT38="+String.valueOf(IWRT38));
		sb.append(",IWRT39="+String.valueOf(IWRT39));
		sb.append(",IWRT40="+String.valueOf(IWRT40));
		sb.append(",IWRT41="+String.valueOf(IWRT41));
		sb.append(",IWRT42="+String.valueOf(IWRT42));
		sb.append(",IWRT43="+String.valueOf(IWRT43));
		sb.append(",IWRT44="+String.valueOf(IWRT44));
		sb.append(",IWRT45="+String.valueOf(IWRT45));
		sb.append(",IWRT46="+String.valueOf(IWRT46));
		sb.append(",IWRT47="+String.valueOf(IWRT47));
		sb.append(",IWRT48="+String.valueOf(IWRT48));
		sb.append(",IWRT49="+String.valueOf(IWRT49));
		sb.append(",IWRT50="+String.valueOf(IWRT50));
		sb.append(",IWRT51="+String.valueOf(IWRT51));
		sb.append(",IWRT52="+String.valueOf(IWRT52));
		sb.append(",IWRT53="+String.valueOf(IWRT53));
		sb.append(",IWCS01="+String.valueOf(IWCS01));
		sb.append(",IWCS02="+String.valueOf(IWCS02));
		sb.append(",IWCS03="+String.valueOf(IWCS03));
		sb.append(",IWCS04="+String.valueOf(IWCS04));
		sb.append(",IWCS05="+String.valueOf(IWCS05));
		sb.append(",IWCS06="+String.valueOf(IWCS06));
		sb.append(",IWCS07="+String.valueOf(IWCS07));
		sb.append(",IWCS08="+String.valueOf(IWCS08));
		sb.append(",IWCS09="+String.valueOf(IWCS09));
		sb.append(",IWCS10="+String.valueOf(IWCS10));
		sb.append(",IWCS11="+String.valueOf(IWCS11));
		sb.append(",IWCS12="+String.valueOf(IWCS12));
		sb.append(",IWCS13="+String.valueOf(IWCS13));
		sb.append(",IWCS14="+String.valueOf(IWCS14));
		sb.append(",IWCS15="+String.valueOf(IWCS15));
		sb.append(",IWCS16="+String.valueOf(IWCS16));
		sb.append(",IWCS17="+String.valueOf(IWCS17));
		sb.append(",IWCS18="+String.valueOf(IWCS18));
		sb.append(",IWCS19="+String.valueOf(IWCS19));
		sb.append(",IWCS20="+String.valueOf(IWCS20));
		sb.append(",IWCS21="+String.valueOf(IWCS21));
		sb.append(",IWCS22="+String.valueOf(IWCS22));
		sb.append(",IWCS23="+String.valueOf(IWCS23));
		sb.append(",IWCS24="+String.valueOf(IWCS24));
		sb.append(",IWCS25="+String.valueOf(IWCS25));
		sb.append(",IWCS26="+String.valueOf(IWCS26));
		sb.append(",IWCS27="+String.valueOf(IWCS27));
		sb.append(",IWCS28="+String.valueOf(IWCS28));
		sb.append(",IWCS29="+String.valueOf(IWCS29));
		sb.append(",IWCS30="+String.valueOf(IWCS30));
		sb.append(",IWCS31="+String.valueOf(IWCS31));
		sb.append(",IWCS32="+String.valueOf(IWCS32));
		sb.append(",IWCS33="+String.valueOf(IWCS33));
		sb.append(",IWCS34="+String.valueOf(IWCS34));
		sb.append(",IWCS35="+String.valueOf(IWCS35));
		sb.append(",IWCS36="+String.valueOf(IWCS36));
		sb.append(",IWCS37="+String.valueOf(IWCS37));
		sb.append(",IWCS38="+String.valueOf(IWCS38));
		sb.append(",IWCS39="+String.valueOf(IWCS39));
		sb.append(",IWCS40="+String.valueOf(IWCS40));
		sb.append(",IWCS41="+String.valueOf(IWCS41));
		sb.append(",IWCS42="+String.valueOf(IWCS42));
		sb.append(",IWCS43="+String.valueOf(IWCS43));
		sb.append(",IWCS44="+String.valueOf(IWCS44));
		sb.append(",IWCS45="+String.valueOf(IWCS45));
		sb.append(",IWCS46="+String.valueOf(IWCS46));
		sb.append(",IWCS47="+String.valueOf(IWCS47));
		sb.append(",IWCS48="+String.valueOf(IWCS48));
		sb.append(",IWCS49="+String.valueOf(IWCS49));
		sb.append(",IWCS50="+String.valueOf(IWCS50));
		sb.append(",IWCS51="+String.valueOf(IWCS51));
		sb.append(",IWCS52="+String.valueOf(IWCS52));
		sb.append(",IWCS53="+String.valueOf(IWCS53));
		sb.append(",IWVT01="+String.valueOf(IWVT01));
		sb.append(",IWVT02="+String.valueOf(IWVT02));
		sb.append(",IWVT03="+String.valueOf(IWVT03));
		sb.append(",IWVT04="+String.valueOf(IWVT04));
		sb.append(",IWVT05="+String.valueOf(IWVT05));
		sb.append(",IWVT06="+String.valueOf(IWVT06));
		sb.append(",IWVT07="+String.valueOf(IWVT07));
		sb.append(",IWVT08="+String.valueOf(IWVT08));
		sb.append(",IWVT09="+String.valueOf(IWVT09));
		sb.append(",IWVT10="+String.valueOf(IWVT10));
		sb.append(",IWVT11="+String.valueOf(IWVT11));
		sb.append(",IWVT12="+String.valueOf(IWVT12));
		sb.append(",IWVT13="+String.valueOf(IWVT13));
		sb.append(",IWVT14="+String.valueOf(IWVT14));
		sb.append(",IWVT15="+String.valueOf(IWVT15));
		sb.append(",IWVT16="+String.valueOf(IWVT16));
		sb.append(",IWVT17="+String.valueOf(IWVT17));
		sb.append(",IWVT18="+String.valueOf(IWVT18));
		sb.append(",IWVT19="+String.valueOf(IWVT19));
		sb.append(",IWVT20="+String.valueOf(IWVT20));
		sb.append(",IWVT21="+String.valueOf(IWVT21));
		sb.append(",IWVT22="+String.valueOf(IWVT22));
		sb.append(",IWVT23="+String.valueOf(IWVT23));
		sb.append(",IWVT24="+String.valueOf(IWVT24));
		sb.append(",IWVT25="+String.valueOf(IWVT25));
		sb.append(",IWVT26="+String.valueOf(IWVT26));
		sb.append(",IWVT27="+String.valueOf(IWVT27));
		sb.append(",IWVT28="+String.valueOf(IWVT28));
		sb.append(",IWVT29="+String.valueOf(IWVT29));
		sb.append(",IWVT30="+String.valueOf(IWVT30));
		sb.append(",IWVT31="+String.valueOf(IWVT31));
		sb.append(",IWVT32="+String.valueOf(IWVT32));
		sb.append(",IWVT33="+String.valueOf(IWVT33));
		sb.append(",IWVT34="+String.valueOf(IWVT34));
		sb.append(",IWVT35="+String.valueOf(IWVT35));
		sb.append(",IWVT36="+String.valueOf(IWVT36));
		sb.append(",IWVT37="+String.valueOf(IWVT37));
		sb.append(",IWVT38="+String.valueOf(IWVT38));
		sb.append(",IWVT39="+String.valueOf(IWVT39));
		sb.append(",IWVT40="+String.valueOf(IWVT40));
		sb.append(",IWVT41="+String.valueOf(IWVT41));
		sb.append(",IWVT42="+String.valueOf(IWVT42));
		sb.append(",IWVT43="+String.valueOf(IWVT43));
		sb.append(",IWVT44="+String.valueOf(IWVT44));
		sb.append(",IWVT45="+String.valueOf(IWVT45));
		sb.append(",IWVT46="+String.valueOf(IWVT46));
		sb.append(",IWVT47="+String.valueOf(IWVT47));
		sb.append(",IWVT48="+String.valueOf(IWVT48));
		sb.append(",IWVT49="+String.valueOf(IWVT49));
		sb.append(",IWVT50="+String.valueOf(IWVT50));
		sb.append(",IWVT51="+String.valueOf(IWVT51));
		sb.append(",IWVT52="+String.valueOf(IWVT52));
		sb.append(",IWVT53="+String.valueOf(IWVT53));
		sb.append(",IWOS01="+IWOS01);
		sb.append(",IWOS02="+IWOS02);
		sb.append(",IWOS03="+IWOS03);
		sb.append(",IWOS04="+IWOS04);
		sb.append(",IWOS05="+IWOS05);
		sb.append(",IWOS06="+IWOS06);
		sb.append(",IWOS07="+IWOS07);
		sb.append(",IWOS08="+IWOS08);
		sb.append(",IWOS09="+IWOS09);
		sb.append(",IWOS10="+IWOS10);
		sb.append(",IWOS11="+IWOS11);
		sb.append(",IWOS12="+IWOS12);
		sb.append(",IWOS13="+IWOS13);
		sb.append(",IWOS14="+IWOS14);
		sb.append(",IWOS15="+IWOS15);
		sb.append(",IWOS16="+IWOS16);
		sb.append(",IWOS17="+IWOS17);
		sb.append(",IWOS18="+IWOS18);
		sb.append(",IWOS19="+IWOS19);
		sb.append(",IWOS20="+IWOS20);
		sb.append(",IWOS21="+IWOS21);
		sb.append(",IWOS22="+IWOS22);
		sb.append(",IWOS23="+IWOS23);
		sb.append(",IWOS24="+IWOS24);
		sb.append(",IWOS25="+IWOS25);
		sb.append(",IWOS26="+IWOS26);
		sb.append(",IWOS27="+IWOS27);
		sb.append(",IWOS28="+IWOS28);
		sb.append(",IWOS29="+IWOS29);
		sb.append(",IWOS30="+IWOS30);
		sb.append(",IWOS31="+IWOS31);
		sb.append(",IWOS32="+IWOS32);
		sb.append(",IWOS33="+IWOS33);
		sb.append(",IWOS34="+IWOS34);
		sb.append(",IWOS35="+IWOS35);
		sb.append(",IWOS36="+IWOS36);
		sb.append(",IWOS37="+IWOS37);
		sb.append(",IWOS38="+IWOS38);
		sb.append(",IWOS39="+IWOS39);
		sb.append(",IWOS40="+IWOS40);
		sb.append(",IWOS41="+IWOS41);
		sb.append(",IWOS42="+IWOS42);
		sb.append(",IWOS43="+IWOS43);
		sb.append(",IWOS44="+IWOS44);
		sb.append(",IWOS45="+IWOS45);
		sb.append(",IWOS46="+IWOS46);
		sb.append(",IWOS47="+IWOS47);
		sb.append(",IWOS48="+IWOS48);
		sb.append(",IWOS49="+IWOS49);
		sb.append(",IWOS50="+IWOS50);
		sb.append(",IWOS51="+IWOS51);
		sb.append(",IWOS52="+IWOS52);
		sb.append(",IWOS53="+IWOS53);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(IWCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCENT);
            			}
            		
        			sb.append("|");
        		
        				if(IWYEAR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWYEAR);
            			}
            		
        			sb.append("|");
        		
        				if(IWVNDR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVNDR);
            			}
            		
        			sb.append("|");
        		
        				if(IWSTYL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWSTYL);
            			}
            		
        			sb.append("|");
        		
        				if(IWSKU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWSKU);
            			}
            		
        			sb.append("|");
        		
        				if(IWSTR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWSTR);
            			}
            		
        			sb.append("|");
        		
        				if(IWHTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWHTYP);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT01);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT02);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT03);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT04);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT05);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT06);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT07);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT08);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT09);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT10);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT11 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT11);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT12 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT12);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT13);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT14 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT14);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT15 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT15);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT16 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT16);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT17 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT17);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT18 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT18);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT19 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT19);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT20 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT20);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT21 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT21);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT22 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT22);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT23 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT23);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT24 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT24);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT25 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT25);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT26 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT26);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT27 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT27);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT28 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT28);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT29 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT29);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT30 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT30);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT31 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT31);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT32 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT32);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT33 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT33);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT34 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT34);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT35 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT35);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT36 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT36);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT37 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT37);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT38 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT38);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT39 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT39);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT40 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT40);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT41 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT41);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT42 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT42);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT43 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT43);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT44 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT44);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT45 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT45);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT46 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT46);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT47 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT47);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT48 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT48);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT49 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT49);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT50 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT50);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT51 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT51);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT52 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT52);
            			}
            		
        			sb.append("|");
        		
        				if(IWQT53 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWQT53);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT01);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT02);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT03);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT04);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT05);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT06);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT07);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT08);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT09);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT10);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT11 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT11);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT12 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT12);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT13);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT14 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT14);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT15 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT15);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT16 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT16);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT17 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT17);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT18 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT18);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT19 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT19);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT20 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT20);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT21 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT21);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT22 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT22);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT23 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT23);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT24 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT24);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT25 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT25);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT26 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT26);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT27 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT27);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT28 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT28);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT29 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT29);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT30 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT30);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT31 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT31);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT32 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT32);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT33 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT33);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT34 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT34);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT35 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT35);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT36 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT36);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT37 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT37);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT38 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT38);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT39 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT39);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT40 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT40);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT41 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT41);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT42 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT42);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT43 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT43);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT44 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT44);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT45 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT45);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT46 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT46);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT47 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT47);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT48 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT48);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT49 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT49);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT50 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT50);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT51 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT51);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT52 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT52);
            			}
            		
        			sb.append("|");
        		
        				if(IWRT53 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWRT53);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS01);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS02);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS03);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS04);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS05);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS06);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS07);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS08);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS09);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS10);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS11 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS11);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS12 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS12);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS13);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS14 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS14);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS15 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS15);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS16 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS16);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS17 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS17);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS18 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS18);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS19 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS19);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS20 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS20);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS21 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS21);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS22 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS22);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS23 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS23);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS24 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS24);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS25 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS25);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS26 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS26);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS27 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS27);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS28 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS28);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS29 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS29);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS30 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS30);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS31 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS31);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS32 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS32);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS33 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS33);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS34 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS34);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS35 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS35);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS36 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS36);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS37 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS37);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS38 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS38);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS39 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS39);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS40 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS40);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS41 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS41);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS42 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS42);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS43 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS43);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS44 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS44);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS45 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS45);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS46 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS46);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS47 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS47);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS48 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS48);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS49 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS49);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS50 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS50);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS51 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS51);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS52 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS52);
            			}
            		
        			sb.append("|");
        		
        				if(IWCS53 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWCS53);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT01);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT02);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT03);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT04);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT05);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT06);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT07);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT08);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT09);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT10);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT11 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT11);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT12 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT12);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT13);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT14 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT14);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT15 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT15);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT16 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT16);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT17 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT17);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT18 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT18);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT19 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT19);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT20 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT20);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT21 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT21);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT22 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT22);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT23 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT23);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT24 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT24);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT25 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT25);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT26 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT26);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT27 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT27);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT28 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT28);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT29 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT29);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT30 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT30);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT31 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT31);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT32 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT32);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT33 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT33);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT34 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT34);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT35 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT35);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT36 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT36);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT37 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT37);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT38 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT38);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT39 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT39);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT40 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT40);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT41 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT41);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT42 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT42);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT43 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT43);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT44 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT44);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT45 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT45);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT46 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT46);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT47 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT47);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT48 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT48);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT49 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT49);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT50 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT50);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT51 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT51);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT52 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT52);
            			}
            		
        			sb.append("|");
        		
        				if(IWVT53 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWVT53);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS01 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS01);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS02 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS02);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS03 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS03);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS04 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS04);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS05 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS05);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS06 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS06);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS07 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS07);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS08 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS08);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS09 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS09);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS10 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS10);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS11 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS11);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS12 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS12);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS13 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS13);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS14 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS14);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS15 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS15);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS16 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS16);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS17 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS17);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS18 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS18);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS19 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS19);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS20 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS20);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS21 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS21);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS22 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS22);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS23 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS23);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS24 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS24);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS25 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS25);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS26 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS26);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS27 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS27);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS28 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS28);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS29 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS29);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS30 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS30);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS31 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS31);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS32 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS32);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS33 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS33);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS34 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS34);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS35 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS35);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS36 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS36);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS37 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS37);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS38 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS38);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS39 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS39);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS40 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS40);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS41 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS41);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS42 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS42);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS43 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS43);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS44 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS44);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS45 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS45);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS46 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS46);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS47 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS47);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS48 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS48);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS49 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS49);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS50 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS50);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS51 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS51);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS52 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS52);
            			}
            		
        			sb.append("|");
        		
        				if(IWOS53 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IWOS53);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row19Struct other) {

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
public void tDBInput_19Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_19_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_19");
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



		row19Struct row19 = new row19Struct();




	
	/**
	 * [tDBOutput_19 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_19", false);
		start_Hash.put("tDBOutput_19", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_19";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row19");
			
		int tos_count_tDBOutput_19 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_19", "tDBOutput_1", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_19 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_19 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_19 = (String)(restRequest_tDBOutput_19 != null ? restRequest_tDBOutput_19.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_19 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_19 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_19 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_19 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_19.createRuntimeProperties();
 		                    props_tDBOutput_19.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.TRUNCATE);
 		                    
 		                    props_tDBOutput_19.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_19.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_19.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_19.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_19.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_19_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_19_1_fisrt sst_tDBOutput_19_1_fisrt = new SchemaSettingTool_tDBOutput_19_1_fisrt();
 		                    
 		                    props_tDBOutput_19.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_19_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_19.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_19.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_19.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_19.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_19.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBOutput_19.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_19.table.setValue("tableName",
 		                    "INVENTORY_HISTORY_FILE_INVHSW");
 		                    
 		                    props_tDBOutput_19.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_19.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_19.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_19.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_19.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_2");
 		                    
 		                    props_tDBOutput_19.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_19_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBOutput_19\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"IWCENT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCENT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWYEAR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWYEAR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWYEAR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWYEAR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVNDR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVNDR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVNDR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVNDR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWSTYL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWSTYL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWSTYL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWSTYL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWSKU\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWSKU\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWSKU\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWSKU\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWSTR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWSTR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWSTR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWSTR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWHTYP\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWHTYP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWHTYP\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWHTYP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT01\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT01\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT02\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT02\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT03\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT03\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT04\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT04\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT05\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT05\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT06\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT06\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT07\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT07\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT08\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT08\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT09\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT09\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT09\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT09\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT10\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT10\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT10\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT10\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT11\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT11\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT11\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT11\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT12\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT12\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT12\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT12\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT13\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT13\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT13\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT13\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT14\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT14\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT14\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT14\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT15\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT15\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT15\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT15\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT16\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT16\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT16\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT16\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT17\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT17\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT17\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT17\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT18\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT18\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT18\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT18\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT19\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT19\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT19\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT19\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT20\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT20\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT20\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT20\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT21\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT21\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT21\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT21\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT22\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT22\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT22\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT22\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT23\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT23\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT23\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT23\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT24\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT24\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT24\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT24\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT25\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT25\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT25\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT25\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT26\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT26\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT26\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT26\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT27\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT27\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT27\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT27\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT28\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT28\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT28\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT28\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT29\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT29\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT29\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT29\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT30\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT30\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT30\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT30\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT31\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT31\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT31\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT31\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT32\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT32\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT32\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT32\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT33\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT33\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT33\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT33\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT34\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT34\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT34\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT34\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT35\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT35\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT35\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT35\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT36\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT36\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT36\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT36\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT37\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT37\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT37\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT37\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT38\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT38\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT38\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT38\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT39\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT39\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT39\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT39\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT40\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT40\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT40\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT40\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT41\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT41\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT41\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT41\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT42\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT42\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT42\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT42\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT43\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT43\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT43\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT43\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT44\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT44\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT44\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT44\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT45\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT45\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT45\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT45\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT46\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT46\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT46\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT46\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT47\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT47\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT47\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT47\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT48\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT48\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT48\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT48\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT49\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT49\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT49\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT49\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT50\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT50\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT50\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT50\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT51\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT51\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT51\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT51\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT52\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT52\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT52\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT52\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWQT53\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWQT53\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWQT53\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWQT53\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT01\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT01\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT02\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT02\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT03\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT03\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT04\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT04\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT05\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT05\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT06\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT06\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT07\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT07\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT08\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT08\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT09\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT09\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT09\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT09\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT10\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT10\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT10\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT10\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT11\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT11\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT11\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT11\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT12\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT12\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT12\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT12\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT13\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT13\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT13\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT13\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT14\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT14\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT14\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT14\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT15\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT15\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT15\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT15\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT16\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT16\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT16\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT16\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT17\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT17\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT17\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT17\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT18\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT18\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT18\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT18\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT19\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT19\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT19\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT19\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT20\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT20\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT20\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT20\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT21\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT21\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT21\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT21\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT22\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT22\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT22\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT22\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT23\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT23\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT23\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT23\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT24\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT24\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT24\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT24\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT25\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT25\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT25\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT25\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT26\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT26\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT26\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT26\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT27\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT27\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT27\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT27\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT28\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT28\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT28\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT28\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT29\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT29\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT29\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT29\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT30\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT30\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT30\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT30\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT31\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT31\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT31\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT31\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT32\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT32\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT32\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT32\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT33\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT33\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT33\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT33\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT34\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT34\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT34\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT34\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT35\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT35\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT35\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT35\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT36\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT36\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT36\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT36\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT37\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT37\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT37\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT37\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT38\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT38\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT38\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT38\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT39\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT39\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT39\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT39\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT40\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT40\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT40\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT40\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT41\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT41\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT41\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT41\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT42\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT42\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT42\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT42\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT43\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT43\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT43\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT43\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT44\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT44\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT44\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT44\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT45\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT45\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT45\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT45\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT46\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT46\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT46\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT46\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT47\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT47\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT47\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT47\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT48\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT48\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT48\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT48\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT49\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT49\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT49\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT49\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT50\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT50\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT50\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT50\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT51\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT51\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT51\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT51\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT52\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT52\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT52\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT52\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWRT53\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWRT53\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWRT53\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWRT53\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS01\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS01\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS02\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS02\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS03\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS03\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS04\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS04\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS05\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS05\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS06\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS06\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS07\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS07\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS08\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS08\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS09\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS09\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS09\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS09\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS10\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS10\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS10\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS10\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS11\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS11\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS11\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS11\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS12\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS12\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS12\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS12\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS13\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS13\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS13\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS13\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS14\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS14\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS14\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS14\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS15\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS15\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS15\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS15\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS16\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS16\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS16\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS16\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS17\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS17\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS17\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS17\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS18\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS18\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS18\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS18\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS19\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS19\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS19\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS19\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS20\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS20\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS20\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS20\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS21\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS21\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS21\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS21\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS22\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS22\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS22\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS22\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS23\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS23\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS23\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS23\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS24\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS24\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS24\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS24\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS25\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS25\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS25\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS25\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS26\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS26\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS26\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS26\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS27\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS27\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS27\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS27\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS28\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS28\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS28\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS28\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS29\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS29\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS29\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS29\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS30\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS30\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS30\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS30\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS31\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS31\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS31\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS31\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS32\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS32\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS32\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS32\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS33\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS33\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS33\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS33\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS34\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS34\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS34\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS34\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS35\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS35\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS35\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS35\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS36\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS36\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS36\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS36\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS37\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS37\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS37\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS37\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS38\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS38\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS38\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS38\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS39\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS39\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS39\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS39\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS40\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS40\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS40\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS40\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS41\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS41\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS41\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS41\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS42\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS42\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS42\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS42\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS43\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS43\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS43\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS43\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS44\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS44\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS44\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS44\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS45\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS45\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS45\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS45\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS46\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS46\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS46\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS46\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS47\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS47\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS47\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS47\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS48\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS48\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS48\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS48\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS49\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS49\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS49\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS49\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS50\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS50\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS50\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS50\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS51\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS51\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS51\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS51\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS52\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS52\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS52\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS52\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWCS53\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWCS53\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWCS53\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWCS53\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT01\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT01\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT01\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT02\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT02\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT02\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT03\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT03\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT03\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT04\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT04\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT04\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT05\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT05\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT05\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT06\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT06\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT06\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT07\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT07\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT07\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT08\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT08\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT08\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT09\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT09\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT09\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT09\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT10\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT10\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT10\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT10\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT11\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT11\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT11\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT11\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT12\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT12\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT12\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT12\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT13\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT13\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT13\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT13\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT14\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT14\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT14\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT14\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT15\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT15\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT15\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT15\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT16\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT16\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT16\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT16\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT17\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT17\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT17\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT17\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT18\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT18\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT18\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT18\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT19\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT19\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT19\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT19\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT20\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT20\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT20\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT20\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT21\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT21\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT21\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT21\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT22\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT22\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT22\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT22\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT23\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT23\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT23\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT23\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT24\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT24\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT24\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT24\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT25\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT25\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT25\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT25\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT26\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT26\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT26\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT26\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT27\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT27\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT27\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT27\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT28\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT28\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT28\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT28\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT29\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT29\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT29\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT29\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT30\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT30\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT30\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT30\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT31\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT31\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT31\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT31\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT32\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT32\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT32\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT32\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT33\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT33\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT33\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT33\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT34\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT34\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT34\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT34\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT35\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT35\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT35\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT35\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT36\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT36\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT36\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT36\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT37\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT37\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT37\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT37\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT38\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT38\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT38\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT38\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT39\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT39\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT39\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT39\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT40\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT40\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT40\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT40\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT41\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT41\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT41\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT41\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT42\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT42\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT42\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT42\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT43\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT43\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT43\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT43\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT44\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT44\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT44\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT44\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT45\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT45\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT45\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT45\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT46\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT46\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT46\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT46\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT47\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT47\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT47\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT47\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT48\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT48\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT48\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT48\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT49\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT49\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT49\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT49\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT50\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT50\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT50\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT50\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT51\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT51\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT51\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT51\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT52\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT52\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT52\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT52\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWVT53\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWVT53\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWVT53\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWVT53\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS01\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS01\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS01\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS01\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS02\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS02\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS02\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS02\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS03\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS03\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS03\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS03\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS04\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS04\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS04\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS04\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS05\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS05\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS05\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS05\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS06\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS06\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS06\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS06\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS07\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS07\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS07\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS07\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS08\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS08\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS08\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS08\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS09\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS09\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS09\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS09\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS10\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS10\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS10\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS10\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS11\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS11\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS11\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS11\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS12\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS12\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS12\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS12\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS13\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS13\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS13\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS13\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS14\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS14\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS14\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS14\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS15\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS15\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS15\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS15\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS16\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS16\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS16\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS16\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS17\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS17\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS17\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS17\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS18\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS18\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS18\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS18\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS19\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS19\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS19\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS19\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS20\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS20\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS20\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS20\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS21\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS21\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS21\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS21\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS22\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS22\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS22\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS22\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS23\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS23\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS23\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS23\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS24\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS24\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS24\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS24\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS25\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS25\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS25\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS25\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS26\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS26\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS26\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS26\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS27\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS27\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS27\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS27\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS28\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS28\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS28\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS28\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS29\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS29\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS29\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS29\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS30\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS30\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS30\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS30\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS31\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS31\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS31\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS31\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS32\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS32\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS32\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS32\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS33\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS33\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS33\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS33\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS34\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS34\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS34\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS34\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS35\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS35\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS35\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS35\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS36\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS36\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS36\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS36\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS37\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS37\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS37\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS37\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS38\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS38\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS38\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS38\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS39\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS39\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS39\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS39\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS40\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS40\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS40\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS40\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS41\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS41\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS41\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS41\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS42\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS42\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS42\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS42\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS43\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS43\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS43\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS43\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS44\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS44\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS44\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS44\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS45\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS45\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS45\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS45\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS46\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS46\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS46\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS46\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS47\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS47\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS47\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS47\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS48\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS48\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS48\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS48\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS49\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS49\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS49\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS49\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS50\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS50\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS50\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS50\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS51\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS51\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS51\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS51\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS52\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS52\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS52\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS52\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IWOS53\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IWOS53\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IWOS53\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IWOS53\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_19\",\"di.table.label\":\"tDBOutput_19\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_19_2_fisrt sst_tDBOutput_19_2_fisrt = new SchemaSettingTool_tDBOutput_19_2_fisrt();
 		                    
 		                    props_tDBOutput_19.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_19_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_19.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_19 = props_tDBOutput_19.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_19 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_19 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_19 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_19.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_19);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_19.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_19 = props_tDBOutput_19.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_19 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_19 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_19 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_19.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_19);
        }
    }
globalMap.put("tDBOutput_19_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_19);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_19= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_19_MAPPINGS_URL", mappings_url_tDBOutput_19);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_19 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_19";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_19 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_19 = null;
topology_tDBOutput_19 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_19 = def_tDBOutput_19.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_19, topology_tDBOutput_19);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_19 = def_tDBOutput_19.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_19 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_19.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_19 = componentRuntime_tDBOutput_19.initialize(container_tDBOutput_19, props_tDBOutput_19);

if (initVr_tDBOutput_19.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_19.getMessage());
}

if(componentRuntime_tDBOutput_19 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_19 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_19;
	compDriverInitialization_tDBOutput_19.runAtDriver(container_tDBOutput_19);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_19 = null;
if(componentRuntime_tDBOutput_19 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_19 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_19;
	if (doesNodeBelongToRequest_tDBOutput_19) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_19 = sourceOrSink_tDBOutput_19.validate(container_tDBOutput_19);
        if (vr_tDBOutput_19.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_19.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_19 = null;
    if (sourceOrSink_tDBOutput_19 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_19 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_19;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_19 = sink_tDBOutput_19.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_19) {
            writeOperation_tDBOutput_19.initialize(container_tDBOutput_19);
        }
        writer_tDBOutput_19 = writeOperation_tDBOutput_19.createWriter(container_tDBOutput_19);
        if (doesNodeBelongToRequest_tDBOutput_19) {
            writer_tDBOutput_19.open("tDBOutput_19");
        }

        resourceMap.put("writer_tDBOutput_19", writer_tDBOutput_19);
    } // end of "sourceOrSink_tDBOutput_19 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_19 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_19.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_19 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_19 = props_tDBOutput_19.getSchema(c_tDBOutput_19, false);
    incomingEnforcer_tDBOutput_19 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_19);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_19 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_19 = null;


 



/**
 * [tDBOutput_19 begin ] stop
 */



	
	/**
	 * [tDBInput_19 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_19", false);
		start_Hash.put("tDBInput_19", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_19";
	
	
		int tos_count_tDBInput_19 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_19 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_19{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_19 = new StringBuilder();
                    log4jParamters_tDBInput_19.append("Parameters:");
                            log4jParamters_tDBInput_19.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("HOST" + " = " + "\"wva-sql-etl\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("DRIVER" + " = " + "JTDS");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("PORT" + " = " + "\"1433\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("DB_SCHEMA" + " = " + "\"dbo\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("DBNAME" + " = " + "\"TenTenData\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("USER" + " = " + "\"talend\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:q5tvX1wTohap7DpvlIae8TaNgV4lAD/iv6Q1JYYa5pmiszQk").substring(0, 4) + "...");     
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TABLE" + " = " + "\"RetCatData\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("QUERY" + " = " + "\"select  * from INVHSW\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("PROPERTIES" + " = " + "\"\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("IWCENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWYEAR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVNDR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWSTYL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWSKU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWSTR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWHTYP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT09")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT10")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT11")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT12")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT14")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT15")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT16")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT17")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT18")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT19")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT20")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT21")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT22")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT23")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT24")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT25")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT26")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT27")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT28")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT29")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT30")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT31")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT32")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT33")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT34")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT35")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT36")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT37")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT38")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT39")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT40")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT41")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT42")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT43")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT44")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT45")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT46")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT47")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT48")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT49")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT50")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT51")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT52")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWQT53")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT09")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT10")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT11")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT12")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT14")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT15")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT16")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT17")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT18")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT19")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT20")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT21")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT22")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT23")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT24")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT25")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT26")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT27")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT28")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT29")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT30")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT31")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT32")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT33")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT34")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT35")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT36")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT37")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT38")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT39")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT40")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT41")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT42")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT43")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT44")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT45")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT46")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT47")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT48")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT49")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT50")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT51")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT52")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWRT53")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS09")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS10")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS11")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS12")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS14")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS15")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS16")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS17")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS18")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS19")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS20")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS21")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS22")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS23")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS24")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS25")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS26")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS27")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS28")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS29")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS30")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS31")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS32")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS33")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS34")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS35")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS36")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS37")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS38")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS39")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS40")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS41")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS42")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS43")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS44")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS45")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS46")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS47")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS48")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS49")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS50")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS51")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS52")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWCS53")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT09")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT10")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT11")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT12")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT14")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT15")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT16")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT17")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT18")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT19")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT20")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT21")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT22")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT23")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT24")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT25")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT26")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT27")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT28")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT29")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT30")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT31")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT32")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT33")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT34")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT35")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT36")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT37")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT38")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT39")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT40")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT41")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT42")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT43")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT44")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT45")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT46")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT47")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT48")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT49")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT50")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT51")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT52")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWVT53")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS01")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS02")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS03")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS04")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS05")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS06")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS07")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS08")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS09")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS10")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS11")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS12")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS13")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS14")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS15")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS16")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS17")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS18")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS19")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS20")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS21")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS22")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS23")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS24")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS25")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS26")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS27")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS28")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS29")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS30")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS31")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS32")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS33")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS34")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS35")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS36")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS37")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS38")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS39")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS40")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS41")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS42")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS43")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS44")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS45")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS46")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS47")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS48")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS49")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS50")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS51")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS52")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IWOS53")+"}]");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("UNIFIED_COMPONENTS" + " = " + "tMSSqlInput");
                        log4jParamters_tDBInput_19.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_19 - "  + (log4jParamters_tDBInput_19) );
                    } 
                } 
            new BytesLimit65535_tDBInput_19().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_19", "tDBInput_1", "tMSSqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tDBInput_19 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tDBInput_19 = new java.util.ArrayList();
			String[] talendToDBArray_tDBInput_19  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tDBInput_19, talendToDBArray_tDBInput_19); 
		    int nb_line_tDBInput_19 = 0;
		    java.sql.Connection conn_tDBInput_19 = null;
				String driverClass_tDBInput_19 = "net.sourceforge.jtds.jdbc.Driver";
			    java.lang.Class jdbcclazz_tDBInput_19 = java.lang.Class.forName(driverClass_tDBInput_19);
				String dbUser_tDBInput_19 = "talend";
				
				 
	final String decryptedPassword_tDBInput_19 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:VkYJaSPRd+lUQCrFn8iNgqeATzLJJFApFR74ZfhyVlJ3Xr7N");
				
				String dbPwd_tDBInput_19 = decryptedPassword_tDBInput_19;
				
		    String port_tDBInput_19 = "1433";
		    String dbname_tDBInput_19 = "TenTenData" ;
			String url_tDBInput_19 = "jdbc:jtds:sqlserver://" + "wva-sql-etl" ;
		    if (!"".equals(port_tDBInput_19)) {
		    	url_tDBInput_19 += ":" + "1433";
		    }
		    if (!"".equals(dbname_tDBInput_19)) {
				url_tDBInput_19 += "//" + "TenTenData"; 
		    }
		    url_tDBInput_19 += ";appName=" + projectName + ";" + "";
		    String dbschema_tDBInput_19 = "dbo";
				
	    		log.debug("tDBInput_19 - Driver ClassName: "+driverClass_tDBInput_19+".");
			
	    		log.debug("tDBInput_19 - Connection attempt to '" + url_tDBInput_19 + "' with the username '" + dbUser_tDBInput_19 + "'.");
			
				conn_tDBInput_19 = java.sql.DriverManager.getConnection(url_tDBInput_19,dbUser_tDBInput_19,dbPwd_tDBInput_19);
	    		log.debug("tDBInput_19 - Connection to '" + url_tDBInput_19 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_19 = conn_tDBInput_19.createStatement();

		    String dbquery_tDBInput_19 = "select  * from INVHSW";
		    
	    		log.debug("tDBInput_19 - Executing the query: '" + dbquery_tDBInput_19 + "'.");
			

            	globalMap.put("tDBInput_19_QUERY",dbquery_tDBInput_19);
		    java.sql.ResultSet rs_tDBInput_19 = null;

		    try {
		    	rs_tDBInput_19 = stmt_tDBInput_19.executeQuery(dbquery_tDBInput_19);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_19 = rs_tDBInput_19.getMetaData();
		    	int colQtyInRs_tDBInput_19 = rsmd_tDBInput_19.getColumnCount();

		    String tmpContent_tDBInput_19 = null;
		    
		    
		    	log.debug("tDBInput_19 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_19.next()) {
		        nb_line_tDBInput_19++;
		        
							if(colQtyInRs_tDBInput_19 < 1) {
								row19.IWCENT = null;
							} else {
		                          
            row19.IWCENT = rs_tDBInput_19.getBigDecimal(1);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCENT = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 2) {
								row19.IWYEAR = null;
							} else {
		                          
            row19.IWYEAR = rs_tDBInput_19.getBigDecimal(2);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWYEAR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 3) {
								row19.IWVNDR = null;
							} else {
		                          
            row19.IWVNDR = rs_tDBInput_19.getBigDecimal(3);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVNDR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 4) {
								row19.IWSTYL = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(4);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(4).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWSTYL = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWSTYL = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWSTYL = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 5) {
								row19.IWSKU = null;
							} else {
		                          
            row19.IWSKU = rs_tDBInput_19.getBigDecimal(5);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWSKU = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 6) {
								row19.IWSTR = null;
							} else {
		                          
            row19.IWSTR = rs_tDBInput_19.getBigDecimal(6);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWSTR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 7) {
								row19.IWHTYP = null;
							} else {
		                          
            row19.IWHTYP = rs_tDBInput_19.getBigDecimal(7);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWHTYP = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 8) {
								row19.IWQT01 = null;
							} else {
		                          
            row19.IWQT01 = rs_tDBInput_19.getBigDecimal(8);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 9) {
								row19.IWQT02 = null;
							} else {
		                          
            row19.IWQT02 = rs_tDBInput_19.getBigDecimal(9);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 10) {
								row19.IWQT03 = null;
							} else {
		                          
            row19.IWQT03 = rs_tDBInput_19.getBigDecimal(10);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 11) {
								row19.IWQT04 = null;
							} else {
		                          
            row19.IWQT04 = rs_tDBInput_19.getBigDecimal(11);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 12) {
								row19.IWQT05 = null;
							} else {
		                          
            row19.IWQT05 = rs_tDBInput_19.getBigDecimal(12);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 13) {
								row19.IWQT06 = null;
							} else {
		                          
            row19.IWQT06 = rs_tDBInput_19.getBigDecimal(13);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 14) {
								row19.IWQT07 = null;
							} else {
		                          
            row19.IWQT07 = rs_tDBInput_19.getBigDecimal(14);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 15) {
								row19.IWQT08 = null;
							} else {
		                          
            row19.IWQT08 = rs_tDBInput_19.getBigDecimal(15);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 16) {
								row19.IWQT09 = null;
							} else {
		                          
            row19.IWQT09 = rs_tDBInput_19.getBigDecimal(16);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT09 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 17) {
								row19.IWQT10 = null;
							} else {
		                          
            row19.IWQT10 = rs_tDBInput_19.getBigDecimal(17);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT10 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 18) {
								row19.IWQT11 = null;
							} else {
		                          
            row19.IWQT11 = rs_tDBInput_19.getBigDecimal(18);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT11 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 19) {
								row19.IWQT12 = null;
							} else {
		                          
            row19.IWQT12 = rs_tDBInput_19.getBigDecimal(19);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT12 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 20) {
								row19.IWQT13 = null;
							} else {
		                          
            row19.IWQT13 = rs_tDBInput_19.getBigDecimal(20);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT13 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 21) {
								row19.IWQT14 = null;
							} else {
		                          
            row19.IWQT14 = rs_tDBInput_19.getBigDecimal(21);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT14 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 22) {
								row19.IWQT15 = null;
							} else {
		                          
            row19.IWQT15 = rs_tDBInput_19.getBigDecimal(22);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT15 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 23) {
								row19.IWQT16 = null;
							} else {
		                          
            row19.IWQT16 = rs_tDBInput_19.getBigDecimal(23);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT16 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 24) {
								row19.IWQT17 = null;
							} else {
		                          
            row19.IWQT17 = rs_tDBInput_19.getBigDecimal(24);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT17 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 25) {
								row19.IWQT18 = null;
							} else {
		                          
            row19.IWQT18 = rs_tDBInput_19.getBigDecimal(25);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT18 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 26) {
								row19.IWQT19 = null;
							} else {
		                          
            row19.IWQT19 = rs_tDBInput_19.getBigDecimal(26);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT19 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 27) {
								row19.IWQT20 = null;
							} else {
		                          
            row19.IWQT20 = rs_tDBInput_19.getBigDecimal(27);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT20 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 28) {
								row19.IWQT21 = null;
							} else {
		                          
            row19.IWQT21 = rs_tDBInput_19.getBigDecimal(28);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT21 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 29) {
								row19.IWQT22 = null;
							} else {
		                          
            row19.IWQT22 = rs_tDBInput_19.getBigDecimal(29);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT22 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 30) {
								row19.IWQT23 = null;
							} else {
		                          
            row19.IWQT23 = rs_tDBInput_19.getBigDecimal(30);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT23 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 31) {
								row19.IWQT24 = null;
							} else {
		                          
            row19.IWQT24 = rs_tDBInput_19.getBigDecimal(31);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT24 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 32) {
								row19.IWQT25 = null;
							} else {
		                          
            row19.IWQT25 = rs_tDBInput_19.getBigDecimal(32);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT25 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 33) {
								row19.IWQT26 = null;
							} else {
		                          
            row19.IWQT26 = rs_tDBInput_19.getBigDecimal(33);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT26 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 34) {
								row19.IWQT27 = null;
							} else {
		                          
            row19.IWQT27 = rs_tDBInput_19.getBigDecimal(34);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT27 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 35) {
								row19.IWQT28 = null;
							} else {
		                          
            row19.IWQT28 = rs_tDBInput_19.getBigDecimal(35);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT28 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 36) {
								row19.IWQT29 = null;
							} else {
		                          
            row19.IWQT29 = rs_tDBInput_19.getBigDecimal(36);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT29 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 37) {
								row19.IWQT30 = null;
							} else {
		                          
            row19.IWQT30 = rs_tDBInput_19.getBigDecimal(37);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT30 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 38) {
								row19.IWQT31 = null;
							} else {
		                          
            row19.IWQT31 = rs_tDBInput_19.getBigDecimal(38);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT31 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 39) {
								row19.IWQT32 = null;
							} else {
		                          
            row19.IWQT32 = rs_tDBInput_19.getBigDecimal(39);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT32 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 40) {
								row19.IWQT33 = null;
							} else {
		                          
            row19.IWQT33 = rs_tDBInput_19.getBigDecimal(40);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT33 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 41) {
								row19.IWQT34 = null;
							} else {
		                          
            row19.IWQT34 = rs_tDBInput_19.getBigDecimal(41);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT34 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 42) {
								row19.IWQT35 = null;
							} else {
		                          
            row19.IWQT35 = rs_tDBInput_19.getBigDecimal(42);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT35 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 43) {
								row19.IWQT36 = null;
							} else {
		                          
            row19.IWQT36 = rs_tDBInput_19.getBigDecimal(43);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT36 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 44) {
								row19.IWQT37 = null;
							} else {
		                          
            row19.IWQT37 = rs_tDBInput_19.getBigDecimal(44);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT37 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 45) {
								row19.IWQT38 = null;
							} else {
		                          
            row19.IWQT38 = rs_tDBInput_19.getBigDecimal(45);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT38 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 46) {
								row19.IWQT39 = null;
							} else {
		                          
            row19.IWQT39 = rs_tDBInput_19.getBigDecimal(46);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT39 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 47) {
								row19.IWQT40 = null;
							} else {
		                          
            row19.IWQT40 = rs_tDBInput_19.getBigDecimal(47);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT40 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 48) {
								row19.IWQT41 = null;
							} else {
		                          
            row19.IWQT41 = rs_tDBInput_19.getBigDecimal(48);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT41 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 49) {
								row19.IWQT42 = null;
							} else {
		                          
            row19.IWQT42 = rs_tDBInput_19.getBigDecimal(49);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT42 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 50) {
								row19.IWQT43 = null;
							} else {
		                          
            row19.IWQT43 = rs_tDBInput_19.getBigDecimal(50);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT43 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 51) {
								row19.IWQT44 = null;
							} else {
		                          
            row19.IWQT44 = rs_tDBInput_19.getBigDecimal(51);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT44 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 52) {
								row19.IWQT45 = null;
							} else {
		                          
            row19.IWQT45 = rs_tDBInput_19.getBigDecimal(52);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT45 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 53) {
								row19.IWQT46 = null;
							} else {
		                          
            row19.IWQT46 = rs_tDBInput_19.getBigDecimal(53);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT46 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 54) {
								row19.IWQT47 = null;
							} else {
		                          
            row19.IWQT47 = rs_tDBInput_19.getBigDecimal(54);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT47 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 55) {
								row19.IWQT48 = null;
							} else {
		                          
            row19.IWQT48 = rs_tDBInput_19.getBigDecimal(55);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT48 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 56) {
								row19.IWQT49 = null;
							} else {
		                          
            row19.IWQT49 = rs_tDBInput_19.getBigDecimal(56);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT49 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 57) {
								row19.IWQT50 = null;
							} else {
		                          
            row19.IWQT50 = rs_tDBInput_19.getBigDecimal(57);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT50 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 58) {
								row19.IWQT51 = null;
							} else {
		                          
            row19.IWQT51 = rs_tDBInput_19.getBigDecimal(58);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT51 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 59) {
								row19.IWQT52 = null;
							} else {
		                          
            row19.IWQT52 = rs_tDBInput_19.getBigDecimal(59);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT52 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 60) {
								row19.IWQT53 = null;
							} else {
		                          
            row19.IWQT53 = rs_tDBInput_19.getBigDecimal(60);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWQT53 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 61) {
								row19.IWRT01 = null;
							} else {
		                          
            row19.IWRT01 = rs_tDBInput_19.getBigDecimal(61);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 62) {
								row19.IWRT02 = null;
							} else {
		                          
            row19.IWRT02 = rs_tDBInput_19.getBigDecimal(62);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 63) {
								row19.IWRT03 = null;
							} else {
		                          
            row19.IWRT03 = rs_tDBInput_19.getBigDecimal(63);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 64) {
								row19.IWRT04 = null;
							} else {
		                          
            row19.IWRT04 = rs_tDBInput_19.getBigDecimal(64);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 65) {
								row19.IWRT05 = null;
							} else {
		                          
            row19.IWRT05 = rs_tDBInput_19.getBigDecimal(65);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 66) {
								row19.IWRT06 = null;
							} else {
		                          
            row19.IWRT06 = rs_tDBInput_19.getBigDecimal(66);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 67) {
								row19.IWRT07 = null;
							} else {
		                          
            row19.IWRT07 = rs_tDBInput_19.getBigDecimal(67);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 68) {
								row19.IWRT08 = null;
							} else {
		                          
            row19.IWRT08 = rs_tDBInput_19.getBigDecimal(68);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 69) {
								row19.IWRT09 = null;
							} else {
		                          
            row19.IWRT09 = rs_tDBInput_19.getBigDecimal(69);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT09 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 70) {
								row19.IWRT10 = null;
							} else {
		                          
            row19.IWRT10 = rs_tDBInput_19.getBigDecimal(70);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT10 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 71) {
								row19.IWRT11 = null;
							} else {
		                          
            row19.IWRT11 = rs_tDBInput_19.getBigDecimal(71);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT11 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 72) {
								row19.IWRT12 = null;
							} else {
		                          
            row19.IWRT12 = rs_tDBInput_19.getBigDecimal(72);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT12 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 73) {
								row19.IWRT13 = null;
							} else {
		                          
            row19.IWRT13 = rs_tDBInput_19.getBigDecimal(73);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT13 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 74) {
								row19.IWRT14 = null;
							} else {
		                          
            row19.IWRT14 = rs_tDBInput_19.getBigDecimal(74);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT14 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 75) {
								row19.IWRT15 = null;
							} else {
		                          
            row19.IWRT15 = rs_tDBInput_19.getBigDecimal(75);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT15 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 76) {
								row19.IWRT16 = null;
							} else {
		                          
            row19.IWRT16 = rs_tDBInput_19.getBigDecimal(76);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT16 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 77) {
								row19.IWRT17 = null;
							} else {
		                          
            row19.IWRT17 = rs_tDBInput_19.getBigDecimal(77);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT17 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 78) {
								row19.IWRT18 = null;
							} else {
		                          
            row19.IWRT18 = rs_tDBInput_19.getBigDecimal(78);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT18 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 79) {
								row19.IWRT19 = null;
							} else {
		                          
            row19.IWRT19 = rs_tDBInput_19.getBigDecimal(79);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT19 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 80) {
								row19.IWRT20 = null;
							} else {
		                          
            row19.IWRT20 = rs_tDBInput_19.getBigDecimal(80);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT20 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 81) {
								row19.IWRT21 = null;
							} else {
		                          
            row19.IWRT21 = rs_tDBInput_19.getBigDecimal(81);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT21 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 82) {
								row19.IWRT22 = null;
							} else {
		                          
            row19.IWRT22 = rs_tDBInput_19.getBigDecimal(82);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT22 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 83) {
								row19.IWRT23 = null;
							} else {
		                          
            row19.IWRT23 = rs_tDBInput_19.getBigDecimal(83);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT23 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 84) {
								row19.IWRT24 = null;
							} else {
		                          
            row19.IWRT24 = rs_tDBInput_19.getBigDecimal(84);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT24 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 85) {
								row19.IWRT25 = null;
							} else {
		                          
            row19.IWRT25 = rs_tDBInput_19.getBigDecimal(85);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT25 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 86) {
								row19.IWRT26 = null;
							} else {
		                          
            row19.IWRT26 = rs_tDBInput_19.getBigDecimal(86);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT26 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 87) {
								row19.IWRT27 = null;
							} else {
		                          
            row19.IWRT27 = rs_tDBInput_19.getBigDecimal(87);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT27 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 88) {
								row19.IWRT28 = null;
							} else {
		                          
            row19.IWRT28 = rs_tDBInput_19.getBigDecimal(88);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT28 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 89) {
								row19.IWRT29 = null;
							} else {
		                          
            row19.IWRT29 = rs_tDBInput_19.getBigDecimal(89);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT29 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 90) {
								row19.IWRT30 = null;
							} else {
		                          
            row19.IWRT30 = rs_tDBInput_19.getBigDecimal(90);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT30 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 91) {
								row19.IWRT31 = null;
							} else {
		                          
            row19.IWRT31 = rs_tDBInput_19.getBigDecimal(91);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT31 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 92) {
								row19.IWRT32 = null;
							} else {
		                          
            row19.IWRT32 = rs_tDBInput_19.getBigDecimal(92);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT32 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 93) {
								row19.IWRT33 = null;
							} else {
		                          
            row19.IWRT33 = rs_tDBInput_19.getBigDecimal(93);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT33 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 94) {
								row19.IWRT34 = null;
							} else {
		                          
            row19.IWRT34 = rs_tDBInput_19.getBigDecimal(94);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT34 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 95) {
								row19.IWRT35 = null;
							} else {
		                          
            row19.IWRT35 = rs_tDBInput_19.getBigDecimal(95);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT35 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 96) {
								row19.IWRT36 = null;
							} else {
		                          
            row19.IWRT36 = rs_tDBInput_19.getBigDecimal(96);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT36 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 97) {
								row19.IWRT37 = null;
							} else {
		                          
            row19.IWRT37 = rs_tDBInput_19.getBigDecimal(97);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT37 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 98) {
								row19.IWRT38 = null;
							} else {
		                          
            row19.IWRT38 = rs_tDBInput_19.getBigDecimal(98);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT38 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 99) {
								row19.IWRT39 = null;
							} else {
		                          
            row19.IWRT39 = rs_tDBInput_19.getBigDecimal(99);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT39 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 100) {
								row19.IWRT40 = null;
							} else {
		                          
            row19.IWRT40 = rs_tDBInput_19.getBigDecimal(100);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT40 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 101) {
								row19.IWRT41 = null;
							} else {
		                          
            row19.IWRT41 = rs_tDBInput_19.getBigDecimal(101);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT41 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 102) {
								row19.IWRT42 = null;
							} else {
		                          
            row19.IWRT42 = rs_tDBInput_19.getBigDecimal(102);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT42 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 103) {
								row19.IWRT43 = null;
							} else {
		                          
            row19.IWRT43 = rs_tDBInput_19.getBigDecimal(103);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT43 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 104) {
								row19.IWRT44 = null;
							} else {
		                          
            row19.IWRT44 = rs_tDBInput_19.getBigDecimal(104);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT44 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 105) {
								row19.IWRT45 = null;
							} else {
		                          
            row19.IWRT45 = rs_tDBInput_19.getBigDecimal(105);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT45 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 106) {
								row19.IWRT46 = null;
							} else {
		                          
            row19.IWRT46 = rs_tDBInput_19.getBigDecimal(106);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT46 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 107) {
								row19.IWRT47 = null;
							} else {
		                          
            row19.IWRT47 = rs_tDBInput_19.getBigDecimal(107);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT47 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 108) {
								row19.IWRT48 = null;
							} else {
		                          
            row19.IWRT48 = rs_tDBInput_19.getBigDecimal(108);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT48 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 109) {
								row19.IWRT49 = null;
							} else {
		                          
            row19.IWRT49 = rs_tDBInput_19.getBigDecimal(109);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT49 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 110) {
								row19.IWRT50 = null;
							} else {
		                          
            row19.IWRT50 = rs_tDBInput_19.getBigDecimal(110);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT50 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 111) {
								row19.IWRT51 = null;
							} else {
		                          
            row19.IWRT51 = rs_tDBInput_19.getBigDecimal(111);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT51 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 112) {
								row19.IWRT52 = null;
							} else {
		                          
            row19.IWRT52 = rs_tDBInput_19.getBigDecimal(112);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT52 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 113) {
								row19.IWRT53 = null;
							} else {
		                          
            row19.IWRT53 = rs_tDBInput_19.getBigDecimal(113);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWRT53 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 114) {
								row19.IWCS01 = null;
							} else {
		                          
            row19.IWCS01 = rs_tDBInput_19.getBigDecimal(114);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 115) {
								row19.IWCS02 = null;
							} else {
		                          
            row19.IWCS02 = rs_tDBInput_19.getBigDecimal(115);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 116) {
								row19.IWCS03 = null;
							} else {
		                          
            row19.IWCS03 = rs_tDBInput_19.getBigDecimal(116);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 117) {
								row19.IWCS04 = null;
							} else {
		                          
            row19.IWCS04 = rs_tDBInput_19.getBigDecimal(117);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 118) {
								row19.IWCS05 = null;
							} else {
		                          
            row19.IWCS05 = rs_tDBInput_19.getBigDecimal(118);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 119) {
								row19.IWCS06 = null;
							} else {
		                          
            row19.IWCS06 = rs_tDBInput_19.getBigDecimal(119);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 120) {
								row19.IWCS07 = null;
							} else {
		                          
            row19.IWCS07 = rs_tDBInput_19.getBigDecimal(120);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 121) {
								row19.IWCS08 = null;
							} else {
		                          
            row19.IWCS08 = rs_tDBInput_19.getBigDecimal(121);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 122) {
								row19.IWCS09 = null;
							} else {
		                          
            row19.IWCS09 = rs_tDBInput_19.getBigDecimal(122);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS09 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 123) {
								row19.IWCS10 = null;
							} else {
		                          
            row19.IWCS10 = rs_tDBInput_19.getBigDecimal(123);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS10 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 124) {
								row19.IWCS11 = null;
							} else {
		                          
            row19.IWCS11 = rs_tDBInput_19.getBigDecimal(124);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS11 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 125) {
								row19.IWCS12 = null;
							} else {
		                          
            row19.IWCS12 = rs_tDBInput_19.getBigDecimal(125);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS12 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 126) {
								row19.IWCS13 = null;
							} else {
		                          
            row19.IWCS13 = rs_tDBInput_19.getBigDecimal(126);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS13 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 127) {
								row19.IWCS14 = null;
							} else {
		                          
            row19.IWCS14 = rs_tDBInput_19.getBigDecimal(127);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS14 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 128) {
								row19.IWCS15 = null;
							} else {
		                          
            row19.IWCS15 = rs_tDBInput_19.getBigDecimal(128);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS15 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 129) {
								row19.IWCS16 = null;
							} else {
		                          
            row19.IWCS16 = rs_tDBInput_19.getBigDecimal(129);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS16 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 130) {
								row19.IWCS17 = null;
							} else {
		                          
            row19.IWCS17 = rs_tDBInput_19.getBigDecimal(130);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS17 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 131) {
								row19.IWCS18 = null;
							} else {
		                          
            row19.IWCS18 = rs_tDBInput_19.getBigDecimal(131);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS18 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 132) {
								row19.IWCS19 = null;
							} else {
		                          
            row19.IWCS19 = rs_tDBInput_19.getBigDecimal(132);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS19 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 133) {
								row19.IWCS20 = null;
							} else {
		                          
            row19.IWCS20 = rs_tDBInput_19.getBigDecimal(133);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS20 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 134) {
								row19.IWCS21 = null;
							} else {
		                          
            row19.IWCS21 = rs_tDBInput_19.getBigDecimal(134);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS21 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 135) {
								row19.IWCS22 = null;
							} else {
		                          
            row19.IWCS22 = rs_tDBInput_19.getBigDecimal(135);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS22 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 136) {
								row19.IWCS23 = null;
							} else {
		                          
            row19.IWCS23 = rs_tDBInput_19.getBigDecimal(136);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS23 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 137) {
								row19.IWCS24 = null;
							} else {
		                          
            row19.IWCS24 = rs_tDBInput_19.getBigDecimal(137);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS24 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 138) {
								row19.IWCS25 = null;
							} else {
		                          
            row19.IWCS25 = rs_tDBInput_19.getBigDecimal(138);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS25 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 139) {
								row19.IWCS26 = null;
							} else {
		                          
            row19.IWCS26 = rs_tDBInput_19.getBigDecimal(139);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS26 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 140) {
								row19.IWCS27 = null;
							} else {
		                          
            row19.IWCS27 = rs_tDBInput_19.getBigDecimal(140);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS27 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 141) {
								row19.IWCS28 = null;
							} else {
		                          
            row19.IWCS28 = rs_tDBInput_19.getBigDecimal(141);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS28 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 142) {
								row19.IWCS29 = null;
							} else {
		                          
            row19.IWCS29 = rs_tDBInput_19.getBigDecimal(142);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS29 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 143) {
								row19.IWCS30 = null;
							} else {
		                          
            row19.IWCS30 = rs_tDBInput_19.getBigDecimal(143);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS30 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 144) {
								row19.IWCS31 = null;
							} else {
		                          
            row19.IWCS31 = rs_tDBInput_19.getBigDecimal(144);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS31 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 145) {
								row19.IWCS32 = null;
							} else {
		                          
            row19.IWCS32 = rs_tDBInput_19.getBigDecimal(145);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS32 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 146) {
								row19.IWCS33 = null;
							} else {
		                          
            row19.IWCS33 = rs_tDBInput_19.getBigDecimal(146);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS33 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 147) {
								row19.IWCS34 = null;
							} else {
		                          
            row19.IWCS34 = rs_tDBInput_19.getBigDecimal(147);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS34 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 148) {
								row19.IWCS35 = null;
							} else {
		                          
            row19.IWCS35 = rs_tDBInput_19.getBigDecimal(148);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS35 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 149) {
								row19.IWCS36 = null;
							} else {
		                          
            row19.IWCS36 = rs_tDBInput_19.getBigDecimal(149);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS36 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 150) {
								row19.IWCS37 = null;
							} else {
		                          
            row19.IWCS37 = rs_tDBInput_19.getBigDecimal(150);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS37 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 151) {
								row19.IWCS38 = null;
							} else {
		                          
            row19.IWCS38 = rs_tDBInput_19.getBigDecimal(151);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS38 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 152) {
								row19.IWCS39 = null;
							} else {
		                          
            row19.IWCS39 = rs_tDBInput_19.getBigDecimal(152);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS39 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 153) {
								row19.IWCS40 = null;
							} else {
		                          
            row19.IWCS40 = rs_tDBInput_19.getBigDecimal(153);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS40 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 154) {
								row19.IWCS41 = null;
							} else {
		                          
            row19.IWCS41 = rs_tDBInput_19.getBigDecimal(154);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS41 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 155) {
								row19.IWCS42 = null;
							} else {
		                          
            row19.IWCS42 = rs_tDBInput_19.getBigDecimal(155);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS42 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 156) {
								row19.IWCS43 = null;
							} else {
		                          
            row19.IWCS43 = rs_tDBInput_19.getBigDecimal(156);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS43 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 157) {
								row19.IWCS44 = null;
							} else {
		                          
            row19.IWCS44 = rs_tDBInput_19.getBigDecimal(157);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS44 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 158) {
								row19.IWCS45 = null;
							} else {
		                          
            row19.IWCS45 = rs_tDBInput_19.getBigDecimal(158);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS45 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 159) {
								row19.IWCS46 = null;
							} else {
		                          
            row19.IWCS46 = rs_tDBInput_19.getBigDecimal(159);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS46 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 160) {
								row19.IWCS47 = null;
							} else {
		                          
            row19.IWCS47 = rs_tDBInput_19.getBigDecimal(160);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS47 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 161) {
								row19.IWCS48 = null;
							} else {
		                          
            row19.IWCS48 = rs_tDBInput_19.getBigDecimal(161);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS48 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 162) {
								row19.IWCS49 = null;
							} else {
		                          
            row19.IWCS49 = rs_tDBInput_19.getBigDecimal(162);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS49 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 163) {
								row19.IWCS50 = null;
							} else {
		                          
            row19.IWCS50 = rs_tDBInput_19.getBigDecimal(163);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS50 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 164) {
								row19.IWCS51 = null;
							} else {
		                          
            row19.IWCS51 = rs_tDBInput_19.getBigDecimal(164);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS51 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 165) {
								row19.IWCS52 = null;
							} else {
		                          
            row19.IWCS52 = rs_tDBInput_19.getBigDecimal(165);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS52 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 166) {
								row19.IWCS53 = null;
							} else {
		                          
            row19.IWCS53 = rs_tDBInput_19.getBigDecimal(166);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWCS53 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 167) {
								row19.IWVT01 = null;
							} else {
		                          
            row19.IWVT01 = rs_tDBInput_19.getBigDecimal(167);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 168) {
								row19.IWVT02 = null;
							} else {
		                          
            row19.IWVT02 = rs_tDBInput_19.getBigDecimal(168);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 169) {
								row19.IWVT03 = null;
							} else {
		                          
            row19.IWVT03 = rs_tDBInput_19.getBigDecimal(169);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 170) {
								row19.IWVT04 = null;
							} else {
		                          
            row19.IWVT04 = rs_tDBInput_19.getBigDecimal(170);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 171) {
								row19.IWVT05 = null;
							} else {
		                          
            row19.IWVT05 = rs_tDBInput_19.getBigDecimal(171);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 172) {
								row19.IWVT06 = null;
							} else {
		                          
            row19.IWVT06 = rs_tDBInput_19.getBigDecimal(172);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 173) {
								row19.IWVT07 = null;
							} else {
		                          
            row19.IWVT07 = rs_tDBInput_19.getBigDecimal(173);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 174) {
								row19.IWVT08 = null;
							} else {
		                          
            row19.IWVT08 = rs_tDBInput_19.getBigDecimal(174);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 175) {
								row19.IWVT09 = null;
							} else {
		                          
            row19.IWVT09 = rs_tDBInput_19.getBigDecimal(175);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT09 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 176) {
								row19.IWVT10 = null;
							} else {
		                          
            row19.IWVT10 = rs_tDBInput_19.getBigDecimal(176);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT10 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 177) {
								row19.IWVT11 = null;
							} else {
		                          
            row19.IWVT11 = rs_tDBInput_19.getBigDecimal(177);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT11 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 178) {
								row19.IWVT12 = null;
							} else {
		                          
            row19.IWVT12 = rs_tDBInput_19.getBigDecimal(178);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT12 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 179) {
								row19.IWVT13 = null;
							} else {
		                          
            row19.IWVT13 = rs_tDBInput_19.getBigDecimal(179);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT13 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 180) {
								row19.IWVT14 = null;
							} else {
		                          
            row19.IWVT14 = rs_tDBInput_19.getBigDecimal(180);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT14 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 181) {
								row19.IWVT15 = null;
							} else {
		                          
            row19.IWVT15 = rs_tDBInput_19.getBigDecimal(181);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT15 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 182) {
								row19.IWVT16 = null;
							} else {
		                          
            row19.IWVT16 = rs_tDBInput_19.getBigDecimal(182);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT16 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 183) {
								row19.IWVT17 = null;
							} else {
		                          
            row19.IWVT17 = rs_tDBInput_19.getBigDecimal(183);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT17 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 184) {
								row19.IWVT18 = null;
							} else {
		                          
            row19.IWVT18 = rs_tDBInput_19.getBigDecimal(184);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT18 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 185) {
								row19.IWVT19 = null;
							} else {
		                          
            row19.IWVT19 = rs_tDBInput_19.getBigDecimal(185);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT19 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 186) {
								row19.IWVT20 = null;
							} else {
		                          
            row19.IWVT20 = rs_tDBInput_19.getBigDecimal(186);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT20 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 187) {
								row19.IWVT21 = null;
							} else {
		                          
            row19.IWVT21 = rs_tDBInput_19.getBigDecimal(187);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT21 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 188) {
								row19.IWVT22 = null;
							} else {
		                          
            row19.IWVT22 = rs_tDBInput_19.getBigDecimal(188);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT22 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 189) {
								row19.IWVT23 = null;
							} else {
		                          
            row19.IWVT23 = rs_tDBInput_19.getBigDecimal(189);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT23 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 190) {
								row19.IWVT24 = null;
							} else {
		                          
            row19.IWVT24 = rs_tDBInput_19.getBigDecimal(190);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT24 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 191) {
								row19.IWVT25 = null;
							} else {
		                          
            row19.IWVT25 = rs_tDBInput_19.getBigDecimal(191);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT25 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 192) {
								row19.IWVT26 = null;
							} else {
		                          
            row19.IWVT26 = rs_tDBInput_19.getBigDecimal(192);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT26 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 193) {
								row19.IWVT27 = null;
							} else {
		                          
            row19.IWVT27 = rs_tDBInput_19.getBigDecimal(193);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT27 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 194) {
								row19.IWVT28 = null;
							} else {
		                          
            row19.IWVT28 = rs_tDBInput_19.getBigDecimal(194);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT28 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 195) {
								row19.IWVT29 = null;
							} else {
		                          
            row19.IWVT29 = rs_tDBInput_19.getBigDecimal(195);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT29 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 196) {
								row19.IWVT30 = null;
							} else {
		                          
            row19.IWVT30 = rs_tDBInput_19.getBigDecimal(196);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT30 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 197) {
								row19.IWVT31 = null;
							} else {
		                          
            row19.IWVT31 = rs_tDBInput_19.getBigDecimal(197);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT31 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 198) {
								row19.IWVT32 = null;
							} else {
		                          
            row19.IWVT32 = rs_tDBInput_19.getBigDecimal(198);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT32 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 199) {
								row19.IWVT33 = null;
							} else {
		                          
            row19.IWVT33 = rs_tDBInput_19.getBigDecimal(199);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT33 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 200) {
								row19.IWVT34 = null;
							} else {
		                          
            row19.IWVT34 = rs_tDBInput_19.getBigDecimal(200);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT34 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 201) {
								row19.IWVT35 = null;
							} else {
		                          
            row19.IWVT35 = rs_tDBInput_19.getBigDecimal(201);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT35 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 202) {
								row19.IWVT36 = null;
							} else {
		                          
            row19.IWVT36 = rs_tDBInput_19.getBigDecimal(202);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT36 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 203) {
								row19.IWVT37 = null;
							} else {
		                          
            row19.IWVT37 = rs_tDBInput_19.getBigDecimal(203);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT37 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 204) {
								row19.IWVT38 = null;
							} else {
		                          
            row19.IWVT38 = rs_tDBInput_19.getBigDecimal(204);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT38 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 205) {
								row19.IWVT39 = null;
							} else {
		                          
            row19.IWVT39 = rs_tDBInput_19.getBigDecimal(205);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT39 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 206) {
								row19.IWVT40 = null;
							} else {
		                          
            row19.IWVT40 = rs_tDBInput_19.getBigDecimal(206);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT40 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 207) {
								row19.IWVT41 = null;
							} else {
		                          
            row19.IWVT41 = rs_tDBInput_19.getBigDecimal(207);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT41 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 208) {
								row19.IWVT42 = null;
							} else {
		                          
            row19.IWVT42 = rs_tDBInput_19.getBigDecimal(208);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT42 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 209) {
								row19.IWVT43 = null;
							} else {
		                          
            row19.IWVT43 = rs_tDBInput_19.getBigDecimal(209);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT43 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 210) {
								row19.IWVT44 = null;
							} else {
		                          
            row19.IWVT44 = rs_tDBInput_19.getBigDecimal(210);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT44 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 211) {
								row19.IWVT45 = null;
							} else {
		                          
            row19.IWVT45 = rs_tDBInput_19.getBigDecimal(211);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT45 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 212) {
								row19.IWVT46 = null;
							} else {
		                          
            row19.IWVT46 = rs_tDBInput_19.getBigDecimal(212);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT46 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 213) {
								row19.IWVT47 = null;
							} else {
		                          
            row19.IWVT47 = rs_tDBInput_19.getBigDecimal(213);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT47 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 214) {
								row19.IWVT48 = null;
							} else {
		                          
            row19.IWVT48 = rs_tDBInput_19.getBigDecimal(214);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT48 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 215) {
								row19.IWVT49 = null;
							} else {
		                          
            row19.IWVT49 = rs_tDBInput_19.getBigDecimal(215);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT49 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 216) {
								row19.IWVT50 = null;
							} else {
		                          
            row19.IWVT50 = rs_tDBInput_19.getBigDecimal(216);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT50 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 217) {
								row19.IWVT51 = null;
							} else {
		                          
            row19.IWVT51 = rs_tDBInput_19.getBigDecimal(217);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT51 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 218) {
								row19.IWVT52 = null;
							} else {
		                          
            row19.IWVT52 = rs_tDBInput_19.getBigDecimal(218);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT52 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 219) {
								row19.IWVT53 = null;
							} else {
		                          
            row19.IWVT53 = rs_tDBInput_19.getBigDecimal(219);
            if(rs_tDBInput_19.wasNull()){
                    row19.IWVT53 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 220) {
								row19.IWOS01 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(220);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(220).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS01 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS01 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS01 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 221) {
								row19.IWOS02 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(221);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(221).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS02 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS02 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS02 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 222) {
								row19.IWOS03 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(222);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(222).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS03 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS03 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS03 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 223) {
								row19.IWOS04 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(223);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(223).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS04 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS04 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS04 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 224) {
								row19.IWOS05 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(224);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(224).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS05 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS05 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS05 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 225) {
								row19.IWOS06 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(225);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(225).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS06 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS06 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS06 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 226) {
								row19.IWOS07 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(226);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(226).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS07 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS07 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS07 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 227) {
								row19.IWOS08 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(227);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(227).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS08 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS08 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS08 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 228) {
								row19.IWOS09 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(228);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(228).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS09 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS09 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS09 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 229) {
								row19.IWOS10 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(229);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(229).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS10 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS10 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS10 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 230) {
								row19.IWOS11 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(230);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(230).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS11 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS11 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS11 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 231) {
								row19.IWOS12 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(231);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(231).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS12 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS12 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS12 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 232) {
								row19.IWOS13 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(232);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(232).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS13 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS13 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS13 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 233) {
								row19.IWOS14 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(233);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(233).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS14 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS14 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS14 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 234) {
								row19.IWOS15 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(234);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(234).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS15 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS15 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS15 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 235) {
								row19.IWOS16 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(235);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(235).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS16 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS16 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS16 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 236) {
								row19.IWOS17 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(236);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(236).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS17 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS17 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS17 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 237) {
								row19.IWOS18 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(237);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(237).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS18 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS18 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS18 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 238) {
								row19.IWOS19 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(238);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(238).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS19 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS19 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS19 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 239) {
								row19.IWOS20 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(239);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(239).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS20 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS20 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS20 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 240) {
								row19.IWOS21 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(240);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(240).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS21 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS21 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS21 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 241) {
								row19.IWOS22 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(241);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(241).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS22 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS22 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS22 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 242) {
								row19.IWOS23 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(242);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(242).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS23 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS23 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS23 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 243) {
								row19.IWOS24 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(243);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(243).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS24 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS24 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS24 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 244) {
								row19.IWOS25 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(244);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(244).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS25 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS25 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS25 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 245) {
								row19.IWOS26 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(245);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(245).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS26 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS26 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS26 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 246) {
								row19.IWOS27 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(246);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(246).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS27 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS27 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS27 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 247) {
								row19.IWOS28 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(247);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(247).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS28 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS28 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS28 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 248) {
								row19.IWOS29 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(248);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(248).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS29 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS29 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS29 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 249) {
								row19.IWOS30 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(249);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(249).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS30 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS30 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS30 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 250) {
								row19.IWOS31 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(250);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(250).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS31 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS31 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS31 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 251) {
								row19.IWOS32 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(251);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(251).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS32 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS32 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS32 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 252) {
								row19.IWOS33 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(252);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(252).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS33 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS33 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS33 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 253) {
								row19.IWOS34 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(253);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(253).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS34 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS34 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS34 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 254) {
								row19.IWOS35 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(254);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(254).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS35 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS35 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS35 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 255) {
								row19.IWOS36 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(255);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(255).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS36 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS36 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS36 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 256) {
								row19.IWOS37 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(256);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(256).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS37 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS37 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS37 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 257) {
								row19.IWOS38 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(257);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(257).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS38 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS38 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS38 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 258) {
								row19.IWOS39 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(258);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(258).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS39 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS39 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS39 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 259) {
								row19.IWOS40 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(259);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(259).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS40 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS40 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS40 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 260) {
								row19.IWOS41 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(260);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(260).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS41 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS41 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS41 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 261) {
								row19.IWOS42 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(261);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(261).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS42 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS42 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS42 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 262) {
								row19.IWOS43 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(262);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(262).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS43 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS43 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS43 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 263) {
								row19.IWOS44 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(263);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(263).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS44 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS44 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS44 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 264) {
								row19.IWOS45 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(264);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(264).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS45 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS45 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS45 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 265) {
								row19.IWOS46 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(265);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(265).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS46 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS46 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS46 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 266) {
								row19.IWOS47 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(266);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(266).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS47 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS47 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS47 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 267) {
								row19.IWOS48 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(267);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(267).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS48 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS48 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS48 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 268) {
								row19.IWOS49 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(268);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(268).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS49 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS49 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS49 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 269) {
								row19.IWOS50 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(269);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(269).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS50 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS50 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS50 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 270) {
								row19.IWOS51 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(270);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(270).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS51 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS51 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS51 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 271) {
								row19.IWOS52 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(271);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(271).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS52 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS52 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS52 = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 272) {
								row19.IWOS53 = null;
							} else {
	                         		
           		tmpContent_tDBInput_19 = rs_tDBInput_19.getString(272);
            if(tmpContent_tDBInput_19 != null) {
            	if (talendToDBList_tDBInput_19 .contains(rsmd_tDBInput_19.getColumnTypeName(272).toUpperCase(java.util.Locale.ENGLISH))) {
            		row19.IWOS53 = FormatterUtils.formatUnwithE(tmpContent_tDBInput_19);
            	} else {
                	row19.IWOS53 = tmpContent_tDBInput_19;
                }
            } else {
                row19.IWOS53 = null;
            }
		                    }
					
						log.debug("tDBInput_19 - Retrieving the record " + nb_line_tDBInput_19 + ".");
					





 



/**
 * [tDBInput_19 begin ] stop
 */
	
	/**
	 * [tDBInput_19 main ] start
	 */

	

	
	
	currentComponent="tDBInput_19";
	
	

 


	tos_count_tDBInput_19++;

/**
 * [tDBInput_19 main ] stop
 */
	
	/**
	 * [tDBInput_19 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_19";
	
	

 



/**
 * [tDBInput_19 process_data_begin ] stop
 */

	
	/**
	 * [tDBOutput_19 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_19";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row19","tDBInput_19","tDBInput_1","tMSSqlInput","tDBOutput_19","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row19 - " + (row19==null? "": row19.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_19 != null) {
            incomingEnforcer_tDBOutput_19.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCENT") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCENT", row19.IWCENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWYEAR") != null){
                    incomingEnforcer_tDBOutput_19.put("IWYEAR", row19.IWYEAR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVNDR") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVNDR", row19.IWVNDR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWSTYL") != null){
                    incomingEnforcer_tDBOutput_19.put("IWSTYL", row19.IWSTYL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWSKU") != null){
                    incomingEnforcer_tDBOutput_19.put("IWSKU", row19.IWSKU);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWSTR") != null){
                    incomingEnforcer_tDBOutput_19.put("IWSTR", row19.IWSTR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWHTYP") != null){
                    incomingEnforcer_tDBOutput_19.put("IWHTYP", row19.IWHTYP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT01") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT01", row19.IWQT01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT02") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT02", row19.IWQT02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT03") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT03", row19.IWQT03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT04") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT04", row19.IWQT04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT05") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT05", row19.IWQT05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT06") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT06", row19.IWQT06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT07") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT07", row19.IWQT07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT08") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT08", row19.IWQT08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT09") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT09", row19.IWQT09);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT10") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT10", row19.IWQT10);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT11") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT11", row19.IWQT11);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT12") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT12", row19.IWQT12);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT13") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT13", row19.IWQT13);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT14") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT14", row19.IWQT14);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT15") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT15", row19.IWQT15);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT16") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT16", row19.IWQT16);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT17") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT17", row19.IWQT17);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT18") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT18", row19.IWQT18);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT19") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT19", row19.IWQT19);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT20") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT20", row19.IWQT20);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT21") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT21", row19.IWQT21);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT22") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT22", row19.IWQT22);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT23") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT23", row19.IWQT23);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT24") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT24", row19.IWQT24);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT25") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT25", row19.IWQT25);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT26") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT26", row19.IWQT26);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT27") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT27", row19.IWQT27);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT28") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT28", row19.IWQT28);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT29") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT29", row19.IWQT29);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT30") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT30", row19.IWQT30);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT31") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT31", row19.IWQT31);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT32") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT32", row19.IWQT32);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT33") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT33", row19.IWQT33);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT34") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT34", row19.IWQT34);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT35") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT35", row19.IWQT35);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT36") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT36", row19.IWQT36);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT37") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT37", row19.IWQT37);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT38") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT38", row19.IWQT38);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT39") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT39", row19.IWQT39);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT40") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT40", row19.IWQT40);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT41") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT41", row19.IWQT41);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT42") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT42", row19.IWQT42);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT43") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT43", row19.IWQT43);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT44") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT44", row19.IWQT44);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT45") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT45", row19.IWQT45);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT46") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT46", row19.IWQT46);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT47") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT47", row19.IWQT47);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT48") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT48", row19.IWQT48);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT49") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT49", row19.IWQT49);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT50") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT50", row19.IWQT50);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT51") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT51", row19.IWQT51);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT52") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT52", row19.IWQT52);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWQT53") != null){
                    incomingEnforcer_tDBOutput_19.put("IWQT53", row19.IWQT53);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT01") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT01", row19.IWRT01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT02") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT02", row19.IWRT02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT03") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT03", row19.IWRT03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT04") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT04", row19.IWRT04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT05") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT05", row19.IWRT05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT06") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT06", row19.IWRT06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT07") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT07", row19.IWRT07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT08") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT08", row19.IWRT08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT09") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT09", row19.IWRT09);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT10") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT10", row19.IWRT10);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT11") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT11", row19.IWRT11);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT12") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT12", row19.IWRT12);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT13") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT13", row19.IWRT13);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT14") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT14", row19.IWRT14);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT15") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT15", row19.IWRT15);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT16") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT16", row19.IWRT16);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT17") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT17", row19.IWRT17);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT18") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT18", row19.IWRT18);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT19") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT19", row19.IWRT19);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT20") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT20", row19.IWRT20);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT21") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT21", row19.IWRT21);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT22") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT22", row19.IWRT22);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT23") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT23", row19.IWRT23);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT24") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT24", row19.IWRT24);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT25") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT25", row19.IWRT25);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT26") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT26", row19.IWRT26);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT27") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT27", row19.IWRT27);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT28") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT28", row19.IWRT28);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT29") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT29", row19.IWRT29);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT30") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT30", row19.IWRT30);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT31") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT31", row19.IWRT31);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT32") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT32", row19.IWRT32);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT33") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT33", row19.IWRT33);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT34") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT34", row19.IWRT34);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT35") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT35", row19.IWRT35);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT36") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT36", row19.IWRT36);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT37") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT37", row19.IWRT37);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT38") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT38", row19.IWRT38);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT39") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT39", row19.IWRT39);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT40") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT40", row19.IWRT40);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT41") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT41", row19.IWRT41);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT42") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT42", row19.IWRT42);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT43") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT43", row19.IWRT43);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT44") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT44", row19.IWRT44);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT45") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT45", row19.IWRT45);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT46") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT46", row19.IWRT46);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT47") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT47", row19.IWRT47);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT48") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT48", row19.IWRT48);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT49") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT49", row19.IWRT49);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT50") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT50", row19.IWRT50);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT51") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT51", row19.IWRT51);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT52") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT52", row19.IWRT52);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWRT53") != null){
                    incomingEnforcer_tDBOutput_19.put("IWRT53", row19.IWRT53);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS01") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS01", row19.IWCS01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS02") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS02", row19.IWCS02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS03") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS03", row19.IWCS03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS04") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS04", row19.IWCS04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS05") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS05", row19.IWCS05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS06") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS06", row19.IWCS06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS07") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS07", row19.IWCS07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS08") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS08", row19.IWCS08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS09") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS09", row19.IWCS09);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS10") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS10", row19.IWCS10);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS11") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS11", row19.IWCS11);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS12") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS12", row19.IWCS12);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS13") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS13", row19.IWCS13);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS14") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS14", row19.IWCS14);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS15") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS15", row19.IWCS15);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS16") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS16", row19.IWCS16);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS17") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS17", row19.IWCS17);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS18") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS18", row19.IWCS18);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS19") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS19", row19.IWCS19);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS20") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS20", row19.IWCS20);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS21") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS21", row19.IWCS21);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS22") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS22", row19.IWCS22);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS23") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS23", row19.IWCS23);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS24") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS24", row19.IWCS24);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS25") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS25", row19.IWCS25);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS26") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS26", row19.IWCS26);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS27") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS27", row19.IWCS27);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS28") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS28", row19.IWCS28);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS29") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS29", row19.IWCS29);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS30") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS30", row19.IWCS30);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS31") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS31", row19.IWCS31);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS32") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS32", row19.IWCS32);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS33") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS33", row19.IWCS33);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS34") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS34", row19.IWCS34);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS35") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS35", row19.IWCS35);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS36") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS36", row19.IWCS36);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS37") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS37", row19.IWCS37);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS38") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS38", row19.IWCS38);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS39") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS39", row19.IWCS39);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS40") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS40", row19.IWCS40);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS41") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS41", row19.IWCS41);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS42") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS42", row19.IWCS42);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS43") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS43", row19.IWCS43);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS44") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS44", row19.IWCS44);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS45") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS45", row19.IWCS45);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS46") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS46", row19.IWCS46);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS47") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS47", row19.IWCS47);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS48") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS48", row19.IWCS48);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS49") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS49", row19.IWCS49);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS50") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS50", row19.IWCS50);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS51") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS51", row19.IWCS51);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS52") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS52", row19.IWCS52);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWCS53") != null){
                    incomingEnforcer_tDBOutput_19.put("IWCS53", row19.IWCS53);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT01") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT01", row19.IWVT01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT02") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT02", row19.IWVT02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT03") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT03", row19.IWVT03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT04") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT04", row19.IWVT04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT05") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT05", row19.IWVT05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT06") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT06", row19.IWVT06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT07") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT07", row19.IWVT07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT08") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT08", row19.IWVT08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT09") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT09", row19.IWVT09);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT10") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT10", row19.IWVT10);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT11") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT11", row19.IWVT11);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT12") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT12", row19.IWVT12);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT13") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT13", row19.IWVT13);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT14") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT14", row19.IWVT14);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT15") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT15", row19.IWVT15);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT16") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT16", row19.IWVT16);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT17") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT17", row19.IWVT17);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT18") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT18", row19.IWVT18);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT19") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT19", row19.IWVT19);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT20") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT20", row19.IWVT20);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT21") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT21", row19.IWVT21);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT22") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT22", row19.IWVT22);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT23") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT23", row19.IWVT23);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT24") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT24", row19.IWVT24);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT25") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT25", row19.IWVT25);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT26") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT26", row19.IWVT26);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT27") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT27", row19.IWVT27);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT28") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT28", row19.IWVT28);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT29") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT29", row19.IWVT29);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT30") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT30", row19.IWVT30);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT31") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT31", row19.IWVT31);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT32") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT32", row19.IWVT32);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT33") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT33", row19.IWVT33);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT34") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT34", row19.IWVT34);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT35") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT35", row19.IWVT35);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT36") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT36", row19.IWVT36);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT37") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT37", row19.IWVT37);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT38") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT38", row19.IWVT38);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT39") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT39", row19.IWVT39);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT40") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT40", row19.IWVT40);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT41") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT41", row19.IWVT41);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT42") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT42", row19.IWVT42);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT43") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT43", row19.IWVT43);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT44") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT44", row19.IWVT44);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT45") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT45", row19.IWVT45);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT46") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT46", row19.IWVT46);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT47") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT47", row19.IWVT47);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT48") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT48", row19.IWVT48);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT49") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT49", row19.IWVT49);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT50") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT50", row19.IWVT50);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT51") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT51", row19.IWVT51);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT52") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT52", row19.IWVT52);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWVT53") != null){
                    incomingEnforcer_tDBOutput_19.put("IWVT53", row19.IWVT53);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS01") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS01", row19.IWOS01);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS02") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS02", row19.IWOS02);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS03") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS03", row19.IWOS03);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS04") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS04", row19.IWOS04);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS05") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS05", row19.IWOS05);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS06") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS06", row19.IWOS06);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS07") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS07", row19.IWOS07);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS08") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS08", row19.IWOS08);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS09") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS09", row19.IWOS09);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS10") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS10", row19.IWOS10);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS11") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS11", row19.IWOS11);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS12") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS12", row19.IWOS12);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS13") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS13", row19.IWOS13);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS14") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS14", row19.IWOS14);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS15") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS15", row19.IWOS15);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS16") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS16", row19.IWOS16);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS17") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS17", row19.IWOS17);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS18") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS18", row19.IWOS18);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS19") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS19", row19.IWOS19);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS20") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS20", row19.IWOS20);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS21") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS21", row19.IWOS21);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS22") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS22", row19.IWOS22);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS23") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS23", row19.IWOS23);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS24") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS24", row19.IWOS24);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS25") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS25", row19.IWOS25);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS26") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS26", row19.IWOS26);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS27") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS27", row19.IWOS27);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS28") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS28", row19.IWOS28);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS29") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS29", row19.IWOS29);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS30") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS30", row19.IWOS30);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS31") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS31", row19.IWOS31);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS32") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS32", row19.IWOS32);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS33") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS33", row19.IWOS33);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS34") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS34", row19.IWOS34);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS35") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS35", row19.IWOS35);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS36") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS36", row19.IWOS36);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS37") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS37", row19.IWOS37);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS38") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS38", row19.IWOS38);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS39") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS39", row19.IWOS39);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS40") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS40", row19.IWOS40);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS41") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS41", row19.IWOS41);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS42") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS42", row19.IWOS42);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS43") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS43", row19.IWOS43);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS44") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS44", row19.IWOS44);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS45") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS45", row19.IWOS45);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS46") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS46", row19.IWOS46);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS47") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS47", row19.IWOS47);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS48") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS48", row19.IWOS48);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS49") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS49", row19.IWOS49);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS50") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS50", row19.IWOS50);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS51") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS51", row19.IWOS51);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS52") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS52", row19.IWOS52);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_19 != null && incomingEnforcer_tDBOutput_19.getRuntimeSchema().getField("IWOS53") != null){
                    incomingEnforcer_tDBOutput_19.put("IWOS53", row19.IWOS53);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_19 = null;
        if (incomingEnforcer_tDBOutput_19 != null) {
            data_tDBOutput_19 = incomingEnforcer_tDBOutput_19.getCurrentRecord();
        }
        
        if (writer_tDBOutput_19 != null && data_tDBOutput_19 != null) {
        	writer_tDBOutput_19.write(data_tDBOutput_19);
        }
        
        nb_line_tDBOutput_19++;

 


	tos_count_tDBOutput_19++;

/**
 * [tDBOutput_19 main ] stop
 */
	
	/**
	 * [tDBOutput_19 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_19";
	
	


 



/**
 * [tDBOutput_19 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_19 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_19";
	
	


 



/**
 * [tDBOutput_19 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_19 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_19";
	
	

 



/**
 * [tDBInput_19 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_19 end ] start
	 */

	

	
	
	currentComponent="tDBInput_19";
	
	

	}
}finally{
	if (rs_tDBInput_19 != null) {
		rs_tDBInput_19.close();
	}
	if (stmt_tDBInput_19 != null) {
		stmt_tDBInput_19.close();
	}
		if(conn_tDBInput_19 != null && !conn_tDBInput_19.isClosed()) {
			
	    		log.debug("tDBInput_19 - Closing the connection to the database.");
			
			conn_tDBInput_19.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_19 - Connection to the database closed.");
			
		}
}
globalMap.put("tDBInput_19_NB_LINE",nb_line_tDBInput_19);
	    		log.debug("tDBInput_19 - Retrieved records count: "+nb_line_tDBInput_19 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_19 - "  + ("Done.") );

ok_Hash.put("tDBInput_19", true);
end_Hash.put("tDBInput_19", System.currentTimeMillis());




/**
 * [tDBInput_19 end ] stop
 */

	
	/**
	 * [tDBOutput_19 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_19";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_19", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_19 = null;
    if (writer_tDBOutput_19 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_19 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_19.close();
        resultMap_tDBOutput_19 = writer_tDBOutput_19.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_19), container_tDBOutput_19);
    }
if(resultMap_tDBOutput_19!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_19 : resultMap_tDBOutput_19.entrySet()) {
		switch(entry_tDBOutput_19.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_19.setComponentData("tDBOutput_19", "ERROR_MESSAGE", entry_tDBOutput_19.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_19.setComponentData("tDBOutput_19", "NB_LINE", entry_tDBOutput_19.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_19.setComponentData("tDBOutput_19", "NB_SUCCESS", entry_tDBOutput_19.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_19.setComponentData("tDBOutput_19", "NB_REJECT", entry_tDBOutput_19.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_19 = new StringBuilder();
            for (int i_tDBOutput_19 = 0; i_tDBOutput_19 < entry_tDBOutput_19.getKey().length(); i_tDBOutput_19++) {
                char ch_tDBOutput_19 = entry_tDBOutput_19.getKey().charAt(i_tDBOutput_19);
                if(Character.isUpperCase(ch_tDBOutput_19) && i_tDBOutput_19> 0) {
                	studio_key_tDBOutput_19.append('_');
                }
                studio_key_tDBOutput_19.append(ch_tDBOutput_19);
            }
			container_tDBOutput_19.setComponentData("tDBOutput_19", studio_key_tDBOutput_19.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_19.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row19",2,0,
			 			"tDBInput_19","tDBInput_1","tMSSqlInput","tDBOutput_19","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_19", true);
end_Hash.put("tDBOutput_19", System.currentTimeMillis());




/**
 * [tDBOutput_19 end ] stop
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
	 * [tDBInput_19 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_19";
	
	

 



/**
 * [tDBInput_19 finally ] stop
 */

	
	/**
	 * [tDBOutput_19 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_19";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_19")==null){
    if(resourceMap.get("writer_tDBOutput_19")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_19")).close();
		} catch (java.io.IOException e_tDBOutput_19) {
			String errorMessage_tDBOutput_19 = "failed to release the resource in tDBOutput_19 :" + e_tDBOutput_19.getMessage();
			System.err.println(errorMessage_tDBOutput_19);
		}
	}
}
 



/**
 * [tDBOutput_19 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_19_SUBPROCESS_STATE", 1);
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
        final INVENTORY_HISTORY_FILE_INVHSW INVENTORY_HISTORY_FILE_INVHSWClass = new INVENTORY_HISTORY_FILE_INVHSW();

        int exitCode = INVENTORY_HISTORY_FILE_INVHSWClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'INVENTORY_HISTORY_FILE_INVHSW' - Done.");
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
			log.info("TalendJob: 'INVENTORY_HISTORY_FILE_INVHSW' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_xXP68BFbEeqNPtu3HqiE1A");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-21T12:57:28.938942700Z");

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
            java.io.InputStream inContext = INVENTORY_HISTORY_FILE_INVHSW.class.getClassLoader().getResourceAsStream("at_talend_jobs/inventory_history_file_invhsw_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = INVENTORY_HISTORY_FILE_INVHSW.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'INVENTORY_HISTORY_FILE_INVHSW' - Started.");
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
((java.util.Map) threadLocal.get()).put("errorCode", null);tDBInput_19Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_tDBInput_19) {
globalMap.put("tDBInput_19_SUBPROCESS_STATE", -1);

e_tDBInput_19.printStackTrace();

}catch (java.lang.Error e_tDBInput_19) {
globalMap.put("tDBInput_19_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_tDBInput_19;

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : INVENTORY_HISTORY_FILE_INVHSW");
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
        log.info("TalendJob: 'INVENTORY_HISTORY_FILE_INVHSW' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();




            connections.put("tDBConnection_2_connection", globalMap.get("tDBConnection_2_connection"));
            connections.put("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES", globalMap.get("tDBConnection_2_COMPONENT_RUNTIME_PROPERTIES"));


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
 *     803729 characters generated by Talend Cloud Data Management Platform 
 *     on the June 21, 2023 at 8:57:28 AM EDT
 ************************************************************************************************/