
package at_talend_jobs.yfs_order_header_h_0_1;

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
 * Job: YFS_ORDER_HEADER_H Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class YFS_ORDER_HEADER_H implements TalendJob {
	static {System.setProperty("TalendJob.log", "YFS_ORDER_HEADER_H.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(YFS_ORDER_HEADER_H.class);
	

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
			
			if(oms_reader_db != null){
				
					this.setProperty("oms_reader_db", oms_reader_db.toString());
				
			}
			
			if(oms_reader_host != null){
				
					this.setProperty("oms_reader_host", oms_reader_host.toString());
				
			}
			
			if(oms_reader_port != null){
				
					this.setProperty("oms_reader_port", oms_reader_port.toString());
				
			}
			
			if(oms_reader_pwd != null){
				
					this.setProperty("oms_reader_pwd", oms_reader_pwd.toString());
				
			}
			
			if(oms_reader_serviceid != null){
				
					this.setProperty("oms_reader_serviceid", oms_reader_serviceid.toString());
				
			}
			
			if(oms_reader_user_id != null){
				
					this.setProperty("oms_reader_user_id", oms_reader_user_id.toString());
				
			}
			
			if(SF_account != null){
				
					this.setProperty("SF_account", SF_account.toString());
				
			}
			
			if(SF_prod_database != null){
				
					this.setProperty("SF_prod_database", SF_prod_database.toString());
				
			}
			
			if(SF_oms_database != null){
				
					this.setProperty("SF_oms_database", SF_oms_database.toString());
				
			}
			
			if(SF_oms_schema != null){
				
					this.setProperty("SF_oms_schema", SF_oms_schema.toString());
				
			}
			
			if(SF_oms_warehouse != null){
				
					this.setProperty("SF_oms_warehouse", SF_oms_warehouse.toString());
				
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
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String oms_reader_db;
public String getOms_reader_db(){
	return this.oms_reader_db;
}
public String oms_reader_host;
public String getOms_reader_host(){
	return this.oms_reader_host;
}
public String oms_reader_port;
public String getOms_reader_port(){
	return this.oms_reader_port;
}
public java.lang.String oms_reader_pwd;
public java.lang.String getOms_reader_pwd(){
	return this.oms_reader_pwd;
}
public String oms_reader_serviceid;
public String getOms_reader_serviceid(){
	return this.oms_reader_serviceid;
}
public String oms_reader_user_id;
public String getOms_reader_user_id(){
	return this.oms_reader_user_id;
}
public String SF_account;
public String getSF_account(){
	return this.SF_account;
}
public String SF_prod_database;
public String getSF_prod_database(){
	return this.SF_prod_database;
}
public String SF_oms_database;
public String getSF_oms_database(){
	return this.SF_oms_database;
}
public String SF_oms_schema;
public String getSF_oms_schema(){
	return this.SF_oms_schema;
}
public String SF_oms_warehouse;
public String getSF_oms_warehouse(){
	return this.SF_oms_warehouse;
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
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "YFS_ORDER_HEADER_H";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_iN60YOv6Eeui_7U8UwU2ug", "0.1");
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
				YFS_ORDER_HEADER_H.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(YFS_ORDER_HEADER_H.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBConnection_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_3_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBClose_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBClose_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
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
			public void tDBConnection_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
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
 		                    context.SF_oms_warehouse);
 		                    
 		                    props_tDBConnection_1.setValue("db",
 		                    context.SF_oms_database);
 		                    
 		                    props_tDBConnection_1.setValue("schemaName",
 		                    context.SF_oms_schema);
 		                    
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:0if0BE3ISNwJe4ZHh8efbk4POQ7OMZv9gcjgZQX/MRwhILKV"));
 		                        
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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
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
                            log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:tyZrNLSkNt2OA5YUJ6R7YHL9NMS6NeEx3AlzOdKUinYfJoM5cFs=").substring(0, 4) + "...");     
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
                if(log.isDebugEnabled())
            log.debug("tDBConnection_3 - "  + (log4jParamters_tDBConnection_3) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_3", "tDBConnection_1", "tOracleConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
        String url_tDBConnection_3 = "jdbc:oracle:thin:@" + "lin-vsi-omspdb3" + ":" + "1881" + ":" + "OMSPROD";
    	globalMap.put("connectionType_" + "tDBConnection_3", "ORACLE_SID");
	String dbUser_tDBConnection_3 = "sterling_reader01";
	
	
		 
	final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:21t5jVtGXeUte4mxgCwjKerjmJ+PiAxkBS2Pk6Vp5ZN7q1NfpE0=");
		String dbPwd_tDBConnection_3 = decryptedPassword_tDBConnection_3;
	
	
	java.sql.Connection conn_tDBConnection_3 = null;
	
		
			String driverClass_tDBConnection_3 = "oracle.jdbc.OracleDriver";
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
        globalMap.put("host_" + "tDBConnection_3","lin-vsi-omspdb3");
        globalMap.put("port_" + "tDBConnection_3","1881");
        globalMap.put("dbname_" + "tDBConnection_3","OMSPROD");

	globalMap.put("dbschema_" + "tDBConnection_3", "STERLING");
	globalMap.put("username_" + "tDBConnection_3","sterling_reader01");
	globalMap.put("password_" + "tDBConnection_3",dbPwd_tDBConnection_3);

 



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
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBClose_2Process(globalMap);



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
		
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBClose_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBClose_2 = new StringBuilder();
                    log4jParamters_tDBClose_2.append("Parameters:");
                            log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_3");
                        log4jParamters_tDBClose_2.append(" | ");
                            log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tOracleClose");
                        log4jParamters_tDBClose_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + (log4jParamters_tDBClose_2) );
                    } 
                } 
            new BytesLimit65535_tDBClose_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tOracleClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_2 begin ] stop
 */
	
	/**
	 * [tDBClose_2 main ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	

	java.sql.Connection conn_tDBClose_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_3");
	
	if(conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed())
	{
		
	    		log.debug("tDBClose_2 - Closing the connection 'tDBConnection_3' to the database.");
			
			conn_tDBClose_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_3"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
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
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Done.") );

ok_Hash.put("tDBClose_2", true);
end_Hash.put("tDBClose_2", System.currentTimeMillis());




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
 		                    "\nDelete from YFS_ORDER_HEADER_H\nwhere MODIFYTS >= cast(substr(convert_timezone('America/New_York', DATEADD(DAY, -7, c"
+"urrent_timestamp())),0,10) as TIMESTAMPNTZ);\n\n");
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBInput_1Process(globalMap);



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
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[0];

	
			    public String ORDER_HEADER_KEY;

				public String getORDER_HEADER_KEY () {
					return this.ORDER_HEADER_KEY;
				}

				public Boolean ORDER_HEADER_KEYIsNullable(){
				    return false;
				}
				public Boolean ORDER_HEADER_KEYIsKey(){
				    return false;
				}
				public Integer ORDER_HEADER_KEYLength(){
				    return null;
				}
				public Integer ORDER_HEADER_KEYPrecision(){
				    return null;
				}
				public String ORDER_HEADER_KEYDefault(){
				
					return null;
				
				}
				public String ORDER_HEADER_KEYComment(){
				
				    return "";
				
				}
				public String ORDER_HEADER_KEYPattern(){
				
					return "";
				
				}
				public String ORDER_HEADER_KEYOriginalDbColumnName(){
				
					return "ORDER_HEADER_KEY";
				
				}

				
			    public String ENTERPRISE_KEY;

				public String getENTERPRISE_KEY () {
					return this.ENTERPRISE_KEY;
				}

				public Boolean ENTERPRISE_KEYIsNullable(){
				    return false;
				}
				public Boolean ENTERPRISE_KEYIsKey(){
				    return false;
				}
				public Integer ENTERPRISE_KEYLength(){
				    return null;
				}
				public Integer ENTERPRISE_KEYPrecision(){
				    return null;
				}
				public String ENTERPRISE_KEYDefault(){
				
					return null;
				
				}
				public String ENTERPRISE_KEYComment(){
				
				    return "";
				
				}
				public String ENTERPRISE_KEYPattern(){
				
					return "";
				
				}
				public String ENTERPRISE_KEYOriginalDbColumnName(){
				
					return "ENTERPRISE_KEY";
				
				}

				
			    public String ORDER_NO;

				public String getORDER_NO () {
					return this.ORDER_NO;
				}

				public Boolean ORDER_NOIsNullable(){
				    return false;
				}
				public Boolean ORDER_NOIsKey(){
				    return false;
				}
				public Integer ORDER_NOLength(){
				    return null;
				}
				public Integer ORDER_NOPrecision(){
				    return null;
				}
				public String ORDER_NODefault(){
				
					return null;
				
				}
				public String ORDER_NOComment(){
				
				    return "";
				
				}
				public String ORDER_NOPattern(){
				
					return "";
				
				}
				public String ORDER_NOOriginalDbColumnName(){
				
					return "ORDER_NO";
				
				}

				
			    public String SOURCING_CLASSIFICATION;

				public String getSOURCING_CLASSIFICATION () {
					return this.SOURCING_CLASSIFICATION;
				}

				public Boolean SOURCING_CLASSIFICATIONIsNullable(){
				    return true;
				}
				public Boolean SOURCING_CLASSIFICATIONIsKey(){
				    return false;
				}
				public Integer SOURCING_CLASSIFICATIONLength(){
				    return null;
				}
				public Integer SOURCING_CLASSIFICATIONPrecision(){
				    return null;
				}
				public String SOURCING_CLASSIFICATIONDefault(){
				
					return null;
				
				}
				public String SOURCING_CLASSIFICATIONComment(){
				
				    return "";
				
				}
				public String SOURCING_CLASSIFICATIONPattern(){
				
					return "";
				
				}
				public String SOURCING_CLASSIFICATIONOriginalDbColumnName(){
				
					return "SOURCING_CLASSIFICATION";
				
				}

				
			    public String BUYER_ORGANIZATION_CODE;

				public String getBUYER_ORGANIZATION_CODE () {
					return this.BUYER_ORGANIZATION_CODE;
				}

				public Boolean BUYER_ORGANIZATION_CODEIsNullable(){
				    return true;
				}
				public Boolean BUYER_ORGANIZATION_CODEIsKey(){
				    return false;
				}
				public Integer BUYER_ORGANIZATION_CODELength(){
				    return null;
				}
				public Integer BUYER_ORGANIZATION_CODEPrecision(){
				    return null;
				}
				public String BUYER_ORGANIZATION_CODEDefault(){
				
					return null;
				
				}
				public String BUYER_ORGANIZATION_CODEComment(){
				
				    return "";
				
				}
				public String BUYER_ORGANIZATION_CODEPattern(){
				
					return "";
				
				}
				public String BUYER_ORGANIZATION_CODEOriginalDbColumnName(){
				
					return "BUYER_ORGANIZATION_CODE";
				
				}

				
			    public String SELLER_ORGANIZATION_CODE;

				public String getSELLER_ORGANIZATION_CODE () {
					return this.SELLER_ORGANIZATION_CODE;
				}

				public Boolean SELLER_ORGANIZATION_CODEIsNullable(){
				    return false;
				}
				public Boolean SELLER_ORGANIZATION_CODEIsKey(){
				    return false;
				}
				public Integer SELLER_ORGANIZATION_CODELength(){
				    return null;
				}
				public Integer SELLER_ORGANIZATION_CODEPrecision(){
				    return null;
				}
				public String SELLER_ORGANIZATION_CODEDefault(){
				
					return null;
				
				}
				public String SELLER_ORGANIZATION_CODEComment(){
				
				    return "";
				
				}
				public String SELLER_ORGANIZATION_CODEPattern(){
				
					return "";
				
				}
				public String SELLER_ORGANIZATION_CODEOriginalDbColumnName(){
				
					return "SELLER_ORGANIZATION_CODE";
				
				}

				
			    public String DOCUMENT_TYPE;

				public String getDOCUMENT_TYPE () {
					return this.DOCUMENT_TYPE;
				}

				public Boolean DOCUMENT_TYPEIsNullable(){
				    return false;
				}
				public Boolean DOCUMENT_TYPEIsKey(){
				    return false;
				}
				public Integer DOCUMENT_TYPELength(){
				    return null;
				}
				public Integer DOCUMENT_TYPEPrecision(){
				    return null;
				}
				public String DOCUMENT_TYPEDefault(){
				
					return null;
				
				}
				public String DOCUMENT_TYPEComment(){
				
				    return "";
				
				}
				public String DOCUMENT_TYPEPattern(){
				
					return "";
				
				}
				public String DOCUMENT_TYPEOriginalDbColumnName(){
				
					return "DOCUMENT_TYPE";
				
				}

				
			    public String BILL_TO_KEY;

				public String getBILL_TO_KEY () {
					return this.BILL_TO_KEY;
				}

				public Boolean BILL_TO_KEYIsNullable(){
				    return false;
				}
				public Boolean BILL_TO_KEYIsKey(){
				    return false;
				}
				public Integer BILL_TO_KEYLength(){
				    return null;
				}
				public Integer BILL_TO_KEYPrecision(){
				    return null;
				}
				public String BILL_TO_KEYDefault(){
				
					return null;
				
				}
				public String BILL_TO_KEYComment(){
				
				    return "";
				
				}
				public String BILL_TO_KEYPattern(){
				
					return "";
				
				}
				public String BILL_TO_KEYOriginalDbColumnName(){
				
					return "BILL_TO_KEY";
				
				}

				
			    public String BILL_TO_ID;

				public String getBILL_TO_ID () {
					return this.BILL_TO_ID;
				}

				public Boolean BILL_TO_IDIsNullable(){
				    return true;
				}
				public Boolean BILL_TO_IDIsKey(){
				    return false;
				}
				public Integer BILL_TO_IDLength(){
				    return null;
				}
				public Integer BILL_TO_IDPrecision(){
				    return null;
				}
				public String BILL_TO_IDDefault(){
				
					return null;
				
				}
				public String BILL_TO_IDComment(){
				
				    return "";
				
				}
				public String BILL_TO_IDPattern(){
				
					return "";
				
				}
				public String BILL_TO_IDOriginalDbColumnName(){
				
					return "BILL_TO_ID";
				
				}

				
			    public String CUSTOMER_REWARDS_NO;

				public String getCUSTOMER_REWARDS_NO () {
					return this.CUSTOMER_REWARDS_NO;
				}

				public Boolean CUSTOMER_REWARDS_NOIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_REWARDS_NOIsKey(){
				    return false;
				}
				public Integer CUSTOMER_REWARDS_NOLength(){
				    return null;
				}
				public Integer CUSTOMER_REWARDS_NOPrecision(){
				    return null;
				}
				public String CUSTOMER_REWARDS_NODefault(){
				
					return null;
				
				}
				public String CUSTOMER_REWARDS_NOComment(){
				
				    return "";
				
				}
				public String CUSTOMER_REWARDS_NOPattern(){
				
					return "";
				
				}
				public String CUSTOMER_REWARDS_NOOriginalDbColumnName(){
				
					return "CUSTOMER_REWARDS_NO";
				
				}

				
			    public String VENDOR_ID;

				public String getVENDOR_ID () {
					return this.VENDOR_ID;
				}

				public Boolean VENDOR_IDIsNullable(){
				    return true;
				}
				public Boolean VENDOR_IDIsKey(){
				    return false;
				}
				public Integer VENDOR_IDLength(){
				    return null;
				}
				public Integer VENDOR_IDPrecision(){
				    return null;
				}
				public String VENDOR_IDDefault(){
				
					return null;
				
				}
				public String VENDOR_IDComment(){
				
				    return "";
				
				}
				public String VENDOR_IDPattern(){
				
					return "";
				
				}
				public String VENDOR_IDOriginalDbColumnName(){
				
					return "VENDOR_ID";
				
				}

				
			    public String SHIP_TO_KEY;

				public String getSHIP_TO_KEY () {
					return this.SHIP_TO_KEY;
				}

				public Boolean SHIP_TO_KEYIsNullable(){
				    return false;
				}
				public Boolean SHIP_TO_KEYIsKey(){
				    return false;
				}
				public Integer SHIP_TO_KEYLength(){
				    return null;
				}
				public Integer SHIP_TO_KEYPrecision(){
				    return null;
				}
				public String SHIP_TO_KEYDefault(){
				
					return null;
				
				}
				public String SHIP_TO_KEYComment(){
				
				    return "";
				
				}
				public String SHIP_TO_KEYPattern(){
				
					return "";
				
				}
				public String SHIP_TO_KEYOriginalDbColumnName(){
				
					return "SHIP_TO_KEY";
				
				}

				
			    public String SHIP_TO_ID;

				public String getSHIP_TO_ID () {
					return this.SHIP_TO_ID;
				}

				public Boolean SHIP_TO_IDIsNullable(){
				    return true;
				}
				public Boolean SHIP_TO_IDIsKey(){
				    return false;
				}
				public Integer SHIP_TO_IDLength(){
				    return null;
				}
				public Integer SHIP_TO_IDPrecision(){
				    return null;
				}
				public String SHIP_TO_IDDefault(){
				
					return null;
				
				}
				public String SHIP_TO_IDComment(){
				
				    return "";
				
				}
				public String SHIP_TO_IDPattern(){
				
					return "";
				
				}
				public String SHIP_TO_IDOriginalDbColumnName(){
				
					return "SHIP_TO_ID";
				
				}

				
			    public String SHIP_NODE;

				public String getSHIP_NODE () {
					return this.SHIP_NODE;
				}

				public Boolean SHIP_NODEIsNullable(){
				    return true;
				}
				public Boolean SHIP_NODEIsKey(){
				    return false;
				}
				public Integer SHIP_NODELength(){
				    return null;
				}
				public Integer SHIP_NODEPrecision(){
				    return null;
				}
				public String SHIP_NODEDefault(){
				
					return null;
				
				}
				public String SHIP_NODEComment(){
				
				    return "";
				
				}
				public String SHIP_NODEPattern(){
				
					return "";
				
				}
				public String SHIP_NODEOriginalDbColumnName(){
				
					return "SHIP_NODE";
				
				}

				
			    public String RECEIVING_NODE;

				public String getRECEIVING_NODE () {
					return this.RECEIVING_NODE;
				}

				public Boolean RECEIVING_NODEIsNullable(){
				    return true;
				}
				public Boolean RECEIVING_NODEIsKey(){
				    return false;
				}
				public Integer RECEIVING_NODELength(){
				    return null;
				}
				public Integer RECEIVING_NODEPrecision(){
				    return null;
				}
				public String RECEIVING_NODEDefault(){
				
					return null;
				
				}
				public String RECEIVING_NODEComment(){
				
				    return "";
				
				}
				public String RECEIVING_NODEPattern(){
				
					return "";
				
				}
				public String RECEIVING_NODEOriginalDbColumnName(){
				
					return "RECEIVING_NODE";
				
				}

				
			    public String BUYER_RECEIVING_NODE_ID;

				public String getBUYER_RECEIVING_NODE_ID () {
					return this.BUYER_RECEIVING_NODE_ID;
				}

				public Boolean BUYER_RECEIVING_NODE_IDIsNullable(){
				    return true;
				}
				public Boolean BUYER_RECEIVING_NODE_IDIsKey(){
				    return false;
				}
				public Integer BUYER_RECEIVING_NODE_IDLength(){
				    return null;
				}
				public Integer BUYER_RECEIVING_NODE_IDPrecision(){
				    return null;
				}
				public String BUYER_RECEIVING_NODE_IDDefault(){
				
					return null;
				
				}
				public String BUYER_RECEIVING_NODE_IDComment(){
				
				    return "";
				
				}
				public String BUYER_RECEIVING_NODE_IDPattern(){
				
					return "";
				
				}
				public String BUYER_RECEIVING_NODE_IDOriginalDbColumnName(){
				
					return "BUYER_RECEIVING_NODE_ID";
				
				}

				
			    public String MARK_FOR_KEY;

				public String getMARK_FOR_KEY () {
					return this.MARK_FOR_KEY;
				}

				public Boolean MARK_FOR_KEYIsNullable(){
				    return true;
				}
				public Boolean MARK_FOR_KEYIsKey(){
				    return false;
				}
				public Integer MARK_FOR_KEYLength(){
				    return null;
				}
				public Integer MARK_FOR_KEYPrecision(){
				    return null;
				}
				public String MARK_FOR_KEYDefault(){
				
					return null;
				
				}
				public String MARK_FOR_KEYComment(){
				
				    return "";
				
				}
				public String MARK_FOR_KEYPattern(){
				
					return "";
				
				}
				public String MARK_FOR_KEYOriginalDbColumnName(){
				
					return "MARK_FOR_KEY";
				
				}

				
			    public String BUYER_MARK_FOR_NODE_ID;

				public String getBUYER_MARK_FOR_NODE_ID () {
					return this.BUYER_MARK_FOR_NODE_ID;
				}

				public Boolean BUYER_MARK_FOR_NODE_IDIsNullable(){
				    return true;
				}
				public Boolean BUYER_MARK_FOR_NODE_IDIsKey(){
				    return false;
				}
				public Integer BUYER_MARK_FOR_NODE_IDLength(){
				    return null;
				}
				public Integer BUYER_MARK_FOR_NODE_IDPrecision(){
				    return null;
				}
				public String BUYER_MARK_FOR_NODE_IDDefault(){
				
					return null;
				
				}
				public String BUYER_MARK_FOR_NODE_IDComment(){
				
				    return "";
				
				}
				public String BUYER_MARK_FOR_NODE_IDPattern(){
				
					return "";
				
				}
				public String BUYER_MARK_FOR_NODE_IDOriginalDbColumnName(){
				
					return "BUYER_MARK_FOR_NODE_ID";
				
				}

				
			    public java.util.Date REQ_DELIVERY_DATE;

				public java.util.Date getREQ_DELIVERY_DATE () {
					return this.REQ_DELIVERY_DATE;
				}

				public Boolean REQ_DELIVERY_DATEIsNullable(){
				    return true;
				}
				public Boolean REQ_DELIVERY_DATEIsKey(){
				    return false;
				}
				public Integer REQ_DELIVERY_DATELength(){
				    return null;
				}
				public Integer REQ_DELIVERY_DATEPrecision(){
				    return null;
				}
				public String REQ_DELIVERY_DATEDefault(){
				
					return null;
				
				}
				public String REQ_DELIVERY_DATEComment(){
				
				    return "";
				
				}
				public String REQ_DELIVERY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String REQ_DELIVERY_DATEOriginalDbColumnName(){
				
					return "REQ_DELIVERY_DATE";
				
				}

				
			    public java.util.Date REQ_CANCEL_DATE;

				public java.util.Date getREQ_CANCEL_DATE () {
					return this.REQ_CANCEL_DATE;
				}

				public Boolean REQ_CANCEL_DATEIsNullable(){
				    return true;
				}
				public Boolean REQ_CANCEL_DATEIsKey(){
				    return false;
				}
				public Integer REQ_CANCEL_DATELength(){
				    return null;
				}
				public Integer REQ_CANCEL_DATEPrecision(){
				    return null;
				}
				public String REQ_CANCEL_DATEDefault(){
				
					return null;
				
				}
				public String REQ_CANCEL_DATEComment(){
				
				    return "";
				
				}
				public String REQ_CANCEL_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String REQ_CANCEL_DATEOriginalDbColumnName(){
				
					return "REQ_CANCEL_DATE";
				
				}

				
			    public java.util.Date REQ_SHIP_DATE;

				public java.util.Date getREQ_SHIP_DATE () {
					return this.REQ_SHIP_DATE;
				}

				public Boolean REQ_SHIP_DATEIsNullable(){
				    return true;
				}
				public Boolean REQ_SHIP_DATEIsKey(){
				    return false;
				}
				public Integer REQ_SHIP_DATELength(){
				    return null;
				}
				public Integer REQ_SHIP_DATEPrecision(){
				    return null;
				}
				public String REQ_SHIP_DATEDefault(){
				
					return null;
				
				}
				public String REQ_SHIP_DATEComment(){
				
				    return "";
				
				}
				public String REQ_SHIP_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String REQ_SHIP_DATEOriginalDbColumnName(){
				
					return "REQ_SHIP_DATE";
				
				}

				
			    public String DEFAULT_TEMPLATE;

				public String getDEFAULT_TEMPLATE () {
					return this.DEFAULT_TEMPLATE;
				}

				public Boolean DEFAULT_TEMPLATEIsNullable(){
				    return true;
				}
				public Boolean DEFAULT_TEMPLATEIsKey(){
				    return false;
				}
				public Integer DEFAULT_TEMPLATELength(){
				    return null;
				}
				public Integer DEFAULT_TEMPLATEPrecision(){
				    return null;
				}
				public String DEFAULT_TEMPLATEDefault(){
				
					return null;
				
				}
				public String DEFAULT_TEMPLATEComment(){
				
				    return "";
				
				}
				public String DEFAULT_TEMPLATEPattern(){
				
					return "";
				
				}
				public String DEFAULT_TEMPLATEOriginalDbColumnName(){
				
					return "DEFAULT_TEMPLATE";
				
				}

				
			    public String DIVISION;

				public String getDIVISION () {
					return this.DIVISION;
				}

				public Boolean DIVISIONIsNullable(){
				    return false;
				}
				public Boolean DIVISIONIsKey(){
				    return false;
				}
				public Integer DIVISIONLength(){
				    return null;
				}
				public Integer DIVISIONPrecision(){
				    return null;
				}
				public String DIVISIONDefault(){
				
					return null;
				
				}
				public String DIVISIONComment(){
				
				    return "";
				
				}
				public String DIVISIONPattern(){
				
					return "";
				
				}
				public String DIVISIONOriginalDbColumnName(){
				
					return "DIVISION";
				
				}

				
			    public java.util.Date ORDER_DATE;

				public java.util.Date getORDER_DATE () {
					return this.ORDER_DATE;
				}

				public Boolean ORDER_DATEIsNullable(){
				    return false;
				}
				public Boolean ORDER_DATEIsKey(){
				    return false;
				}
				public Integer ORDER_DATELength(){
				    return null;
				}
				public Integer ORDER_DATEPrecision(){
				    return null;
				}
				public String ORDER_DATEDefault(){
				
					return null;
				
				}
				public String ORDER_DATEComment(){
				
				    return "";
				
				}
				public String ORDER_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String ORDER_DATEOriginalDbColumnName(){
				
					return "ORDER_DATE";
				
				}

				
			    public String ORDER_TYPE;

				public String getORDER_TYPE () {
					return this.ORDER_TYPE;
				}

				public Boolean ORDER_TYPEIsNullable(){
				    return false;
				}
				public Boolean ORDER_TYPEIsKey(){
				    return false;
				}
				public Integer ORDER_TYPELength(){
				    return null;
				}
				public Integer ORDER_TYPEPrecision(){
				    return null;
				}
				public String ORDER_TYPEDefault(){
				
					return null;
				
				}
				public String ORDER_TYPEComment(){
				
				    return "";
				
				}
				public String ORDER_TYPEPattern(){
				
					return "";
				
				}
				public String ORDER_TYPEOriginalDbColumnName(){
				
					return "ORDER_TYPE";
				
				}

				
			    public String DRAFT_ORDER_FLAG;

				public String getDRAFT_ORDER_FLAG () {
					return this.DRAFT_ORDER_FLAG;
				}

				public Boolean DRAFT_ORDER_FLAGIsNullable(){
				    return false;
				}
				public Boolean DRAFT_ORDER_FLAGIsKey(){
				    return false;
				}
				public Integer DRAFT_ORDER_FLAGLength(){
				    return null;
				}
				public Integer DRAFT_ORDER_FLAGPrecision(){
				    return null;
				}
				public String DRAFT_ORDER_FLAGDefault(){
				
					return null;
				
				}
				public String DRAFT_ORDER_FLAGComment(){
				
				    return "";
				
				}
				public String DRAFT_ORDER_FLAGPattern(){
				
					return "";
				
				}
				public String DRAFT_ORDER_FLAGOriginalDbColumnName(){
				
					return "DRAFT_ORDER_FLAG";
				
				}

				
			    public String ORDER_PURPOSE;

				public String getORDER_PURPOSE () {
					return this.ORDER_PURPOSE;
				}

				public Boolean ORDER_PURPOSEIsNullable(){
				    return true;
				}
				public Boolean ORDER_PURPOSEIsKey(){
				    return false;
				}
				public Integer ORDER_PURPOSELength(){
				    return null;
				}
				public Integer ORDER_PURPOSEPrecision(){
				    return null;
				}
				public String ORDER_PURPOSEDefault(){
				
					return null;
				
				}
				public String ORDER_PURPOSEComment(){
				
				    return "";
				
				}
				public String ORDER_PURPOSEPattern(){
				
					return "";
				
				}
				public String ORDER_PURPOSEOriginalDbColumnName(){
				
					return "ORDER_PURPOSE";
				
				}

				
			    public String RETURN_OH_KEY_FOR_EXCHANGE;

				public String getRETURN_OH_KEY_FOR_EXCHANGE () {
					return this.RETURN_OH_KEY_FOR_EXCHANGE;
				}

				public Boolean RETURN_OH_KEY_FOR_EXCHANGEIsNullable(){
				    return true;
				}
				public Boolean RETURN_OH_KEY_FOR_EXCHANGEIsKey(){
				    return false;
				}
				public Integer RETURN_OH_KEY_FOR_EXCHANGELength(){
				    return null;
				}
				public Integer RETURN_OH_KEY_FOR_EXCHANGEPrecision(){
				    return null;
				}
				public String RETURN_OH_KEY_FOR_EXCHANGEDefault(){
				
					return null;
				
				}
				public String RETURN_OH_KEY_FOR_EXCHANGEComment(){
				
				    return "";
				
				}
				public String RETURN_OH_KEY_FOR_EXCHANGEPattern(){
				
					return "";
				
				}
				public String RETURN_OH_KEY_FOR_EXCHANGEOriginalDbColumnName(){
				
					return "RETURN_OH_KEY_FOR_EXCHANGE";
				
				}

				
			    public String EXCHANGE_TYPE;

				public String getEXCHANGE_TYPE () {
					return this.EXCHANGE_TYPE;
				}

				public Boolean EXCHANGE_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXCHANGE_TYPEIsKey(){
				    return false;
				}
				public Integer EXCHANGE_TYPELength(){
				    return null;
				}
				public Integer EXCHANGE_TYPEPrecision(){
				    return null;
				}
				public String EXCHANGE_TYPEDefault(){
				
					return null;
				
				}
				public String EXCHANGE_TYPEComment(){
				
				    return "";
				
				}
				public String EXCHANGE_TYPEPattern(){
				
					return "";
				
				}
				public String EXCHANGE_TYPEOriginalDbColumnName(){
				
					return "EXCHANGE_TYPE";
				
				}

				
			    public BigDecimal PENDING_TRANSFER_IN;

				public BigDecimal getPENDING_TRANSFER_IN () {
					return this.PENDING_TRANSFER_IN;
				}

				public Boolean PENDING_TRANSFER_INIsNullable(){
				    return false;
				}
				public Boolean PENDING_TRANSFER_INIsKey(){
				    return false;
				}
				public Integer PENDING_TRANSFER_INLength(){
				    return null;
				}
				public Integer PENDING_TRANSFER_INPrecision(){
				    return null;
				}
				public String PENDING_TRANSFER_INDefault(){
				
					return "";
				
				}
				public String PENDING_TRANSFER_INComment(){
				
				    return "";
				
				}
				public String PENDING_TRANSFER_INPattern(){
				
					return "";
				
				}
				public String PENDING_TRANSFER_INOriginalDbColumnName(){
				
					return "PENDING_TRANSFER_IN";
				
				}

				
			    public String RETURN_BY_GIFT_RECIPIENT;

				public String getRETURN_BY_GIFT_RECIPIENT () {
					return this.RETURN_BY_GIFT_RECIPIENT;
				}

				public Boolean RETURN_BY_GIFT_RECIPIENTIsNullable(){
				    return false;
				}
				public Boolean RETURN_BY_GIFT_RECIPIENTIsKey(){
				    return false;
				}
				public Integer RETURN_BY_GIFT_RECIPIENTLength(){
				    return null;
				}
				public Integer RETURN_BY_GIFT_RECIPIENTPrecision(){
				    return null;
				}
				public String RETURN_BY_GIFT_RECIPIENTDefault(){
				
					return null;
				
				}
				public String RETURN_BY_GIFT_RECIPIENTComment(){
				
				    return "";
				
				}
				public String RETURN_BY_GIFT_RECIPIENTPattern(){
				
					return "";
				
				}
				public String RETURN_BY_GIFT_RECIPIENTOriginalDbColumnName(){
				
					return "RETURN_BY_GIFT_RECIPIENT";
				
				}

				
			    public String ALLOCATION_RULE_ID;

				public String getALLOCATION_RULE_ID () {
					return this.ALLOCATION_RULE_ID;
				}

				public Boolean ALLOCATION_RULE_IDIsNullable(){
				    return true;
				}
				public Boolean ALLOCATION_RULE_IDIsKey(){
				    return false;
				}
				public Integer ALLOCATION_RULE_IDLength(){
				    return null;
				}
				public Integer ALLOCATION_RULE_IDPrecision(){
				    return null;
				}
				public String ALLOCATION_RULE_IDDefault(){
				
					return null;
				
				}
				public String ALLOCATION_RULE_IDComment(){
				
				    return "";
				
				}
				public String ALLOCATION_RULE_IDPattern(){
				
					return "";
				
				}
				public String ALLOCATION_RULE_IDOriginalDbColumnName(){
				
					return "ALLOCATION_RULE_ID";
				
				}

				
			    public String PRIORITY_CODE;

				public String getPRIORITY_CODE () {
					return this.PRIORITY_CODE;
				}

				public Boolean PRIORITY_CODEIsNullable(){
				    return false;
				}
				public Boolean PRIORITY_CODEIsKey(){
				    return false;
				}
				public Integer PRIORITY_CODELength(){
				    return null;
				}
				public Integer PRIORITY_CODEPrecision(){
				    return null;
				}
				public String PRIORITY_CODEDefault(){
				
					return null;
				
				}
				public String PRIORITY_CODEComment(){
				
				    return "";
				
				}
				public String PRIORITY_CODEPattern(){
				
					return "";
				
				}
				public String PRIORITY_CODEOriginalDbColumnName(){
				
					return "PRIORITY_CODE";
				
				}

				
			    public BigDecimal PRIORITY_NUMBER;

				public BigDecimal getPRIORITY_NUMBER () {
					return this.PRIORITY_NUMBER;
				}

				public Boolean PRIORITY_NUMBERIsNullable(){
				    return false;
				}
				public Boolean PRIORITY_NUMBERIsKey(){
				    return false;
				}
				public Integer PRIORITY_NUMBERLength(){
				    return null;
				}
				public Integer PRIORITY_NUMBERPrecision(){
				    return null;
				}
				public String PRIORITY_NUMBERDefault(){
				
					return "";
				
				}
				public String PRIORITY_NUMBERComment(){
				
				    return "";
				
				}
				public String PRIORITY_NUMBERPattern(){
				
					return "";
				
				}
				public String PRIORITY_NUMBEROriginalDbColumnName(){
				
					return "PRIORITY_NUMBER";
				
				}

				
			    public String CONTACT_KEY;

				public String getCONTACT_KEY () {
					return this.CONTACT_KEY;
				}

				public Boolean CONTACT_KEYIsNullable(){
				    return true;
				}
				public Boolean CONTACT_KEYIsKey(){
				    return false;
				}
				public Integer CONTACT_KEYLength(){
				    return null;
				}
				public Integer CONTACT_KEYPrecision(){
				    return null;
				}
				public String CONTACT_KEYDefault(){
				
					return "";
				
				}
				public String CONTACT_KEYComment(){
				
				    return "";
				
				}
				public String CONTACT_KEYPattern(){
				
					return "";
				
				}
				public String CONTACT_KEYOriginalDbColumnName(){
				
					return "CONTACT_KEY";
				
				}

				
			    public String SCAC;

				public String getSCAC () {
					return this.SCAC;
				}

				public Boolean SCACIsNullable(){
				    return false;
				}
				public Boolean SCACIsKey(){
				    return false;
				}
				public Integer SCACLength(){
				    return null;
				}
				public Integer SCACPrecision(){
				    return null;
				}
				public String SCACDefault(){
				
					return "";
				
				}
				public String SCACComment(){
				
				    return "";
				
				}
				public String SCACPattern(){
				
					return "";
				
				}
				public String SCACOriginalDbColumnName(){
				
					return "SCAC";
				
				}

				
			    public String CARRIER_SERVICE_CODE;

				public String getCARRIER_SERVICE_CODE () {
					return this.CARRIER_SERVICE_CODE;
				}

				public Boolean CARRIER_SERVICE_CODEIsNullable(){
				    return false;
				}
				public Boolean CARRIER_SERVICE_CODEIsKey(){
				    return false;
				}
				public Integer CARRIER_SERVICE_CODELength(){
				    return null;
				}
				public Integer CARRIER_SERVICE_CODEPrecision(){
				    return null;
				}
				public String CARRIER_SERVICE_CODEDefault(){
				
					return "";
				
				}
				public String CARRIER_SERVICE_CODEComment(){
				
				    return "";
				
				}
				public String CARRIER_SERVICE_CODEPattern(){
				
					return "";
				
				}
				public String CARRIER_SERVICE_CODEOriginalDbColumnName(){
				
					return "CARRIER_SERVICE_CODE";
				
				}

				
			    public String CUSTCARRIER_ACCOUNT_NO;

				public String getCUSTCARRIER_ACCOUNT_NO () {
					return this.CUSTCARRIER_ACCOUNT_NO;
				}

				public Boolean CUSTCARRIER_ACCOUNT_NOIsNullable(){
				    return false;
				}
				public Boolean CUSTCARRIER_ACCOUNT_NOIsKey(){
				    return false;
				}
				public Integer CUSTCARRIER_ACCOUNT_NOLength(){
				    return null;
				}
				public Integer CUSTCARRIER_ACCOUNT_NOPrecision(){
				    return null;
				}
				public String CUSTCARRIER_ACCOUNT_NODefault(){
				
					return "";
				
				}
				public String CUSTCARRIER_ACCOUNT_NOComment(){
				
				    return "";
				
				}
				public String CUSTCARRIER_ACCOUNT_NOPattern(){
				
					return "";
				
				}
				public String CUSTCARRIER_ACCOUNT_NOOriginalDbColumnName(){
				
					return "CUSTCARRIER_ACCOUNT_NO";
				
				}

				
			    public String NOTIFY_AFTER_SHIPMENT_FLAG;

				public String getNOTIFY_AFTER_SHIPMENT_FLAG () {
					return this.NOTIFY_AFTER_SHIPMENT_FLAG;
				}

				public Boolean NOTIFY_AFTER_SHIPMENT_FLAGIsNullable(){
				    return false;
				}
				public Boolean NOTIFY_AFTER_SHIPMENT_FLAGIsKey(){
				    return false;
				}
				public Integer NOTIFY_AFTER_SHIPMENT_FLAGLength(){
				    return null;
				}
				public Integer NOTIFY_AFTER_SHIPMENT_FLAGPrecision(){
				    return null;
				}
				public String NOTIFY_AFTER_SHIPMENT_FLAGDefault(){
				
					return "";
				
				}
				public String NOTIFY_AFTER_SHIPMENT_FLAGComment(){
				
				    return "";
				
				}
				public String NOTIFY_AFTER_SHIPMENT_FLAGPattern(){
				
					return "";
				
				}
				public String NOTIFY_AFTER_SHIPMENT_FLAGOriginalDbColumnName(){
				
					return "NOTIFY_AFTER_SHIPMENT_FLAG";
				
				}

				
			    public String CREATED_AT_NODE;

				public String getCREATED_AT_NODE () {
					return this.CREATED_AT_NODE;
				}

				public Boolean CREATED_AT_NODEIsNullable(){
				    return false;
				}
				public Boolean CREATED_AT_NODEIsKey(){
				    return false;
				}
				public Integer CREATED_AT_NODELength(){
				    return null;
				}
				public Integer CREATED_AT_NODEPrecision(){
				    return null;
				}
				public String CREATED_AT_NODEDefault(){
				
					return "";
				
				}
				public String CREATED_AT_NODEComment(){
				
				    return "";
				
				}
				public String CREATED_AT_NODEPattern(){
				
					return "";
				
				}
				public String CREATED_AT_NODEOriginalDbColumnName(){
				
					return "CREATED_AT_NODE";
				
				}

				
			    public String HAS_DERIVED_CHILD;

				public String getHAS_DERIVED_CHILD () {
					return this.HAS_DERIVED_CHILD;
				}

				public Boolean HAS_DERIVED_CHILDIsNullable(){
				    return false;
				}
				public Boolean HAS_DERIVED_CHILDIsKey(){
				    return false;
				}
				public Integer HAS_DERIVED_CHILDLength(){
				    return null;
				}
				public Integer HAS_DERIVED_CHILDPrecision(){
				    return null;
				}
				public String HAS_DERIVED_CHILDDefault(){
				
					return "";
				
				}
				public String HAS_DERIVED_CHILDComment(){
				
				    return "";
				
				}
				public String HAS_DERIVED_CHILDPattern(){
				
					return "";
				
				}
				public String HAS_DERIVED_CHILDOriginalDbColumnName(){
				
					return "HAS_DERIVED_CHILD";
				
				}

				
			    public String HAS_DERIVED_PARENT;

				public String getHAS_DERIVED_PARENT () {
					return this.HAS_DERIVED_PARENT;
				}

				public Boolean HAS_DERIVED_PARENTIsNullable(){
				    return false;
				}
				public Boolean HAS_DERIVED_PARENTIsKey(){
				    return false;
				}
				public Integer HAS_DERIVED_PARENTLength(){
				    return null;
				}
				public Integer HAS_DERIVED_PARENTPrecision(){
				    return null;
				}
				public String HAS_DERIVED_PARENTDefault(){
				
					return "";
				
				}
				public String HAS_DERIVED_PARENTComment(){
				
				    return "";
				
				}
				public String HAS_DERIVED_PARENTPattern(){
				
					return "";
				
				}
				public String HAS_DERIVED_PARENTOriginalDbColumnName(){
				
					return "HAS_DERIVED_PARENT";
				
				}

				
			    public String NOTIFICATION_TYPE;

				public String getNOTIFICATION_TYPE () {
					return this.NOTIFICATION_TYPE;
				}

				public Boolean NOTIFICATION_TYPEIsNullable(){
				    return true;
				}
				public Boolean NOTIFICATION_TYPEIsKey(){
				    return false;
				}
				public Integer NOTIFICATION_TYPELength(){
				    return null;
				}
				public Integer NOTIFICATION_TYPEPrecision(){
				    return null;
				}
				public String NOTIFICATION_TYPEDefault(){
				
					return "";
				
				}
				public String NOTIFICATION_TYPEComment(){
				
				    return "";
				
				}
				public String NOTIFICATION_TYPEPattern(){
				
					return "";
				
				}
				public String NOTIFICATION_TYPEOriginalDbColumnName(){
				
					return "NOTIFICATION_TYPE";
				
				}

				
			    public String NOTIFICATION_REFERENCE;

				public String getNOTIFICATION_REFERENCE () {
					return this.NOTIFICATION_REFERENCE;
				}

				public Boolean NOTIFICATION_REFERENCEIsNullable(){
				    return true;
				}
				public Boolean NOTIFICATION_REFERENCEIsKey(){
				    return false;
				}
				public Integer NOTIFICATION_REFERENCELength(){
				    return null;
				}
				public Integer NOTIFICATION_REFERENCEPrecision(){
				    return null;
				}
				public String NOTIFICATION_REFERENCEDefault(){
				
					return "";
				
				}
				public String NOTIFICATION_REFERENCEComment(){
				
				    return "";
				
				}
				public String NOTIFICATION_REFERENCEPattern(){
				
					return "";
				
				}
				public String NOTIFICATION_REFERENCEOriginalDbColumnName(){
				
					return "NOTIFICATION_REFERENCE";
				
				}

				
			    public String ENTRY_TYPE;

				public String getENTRY_TYPE () {
					return this.ENTRY_TYPE;
				}

				public Boolean ENTRY_TYPEIsNullable(){
				    return false;
				}
				public Boolean ENTRY_TYPEIsKey(){
				    return false;
				}
				public Integer ENTRY_TYPELength(){
				    return null;
				}
				public Integer ENTRY_TYPEPrecision(){
				    return null;
				}
				public String ENTRY_TYPEDefault(){
				
					return "";
				
				}
				public String ENTRY_TYPEComment(){
				
				    return "";
				
				}
				public String ENTRY_TYPEPattern(){
				
					return "";
				
				}
				public String ENTRY_TYPEOriginalDbColumnName(){
				
					return "ENTRY_TYPE";
				
				}

				
			    public String AUTHORIZED_CLIENT;

				public String getAUTHORIZED_CLIENT () {
					return this.AUTHORIZED_CLIENT;
				}

				public Boolean AUTHORIZED_CLIENTIsNullable(){
				    return true;
				}
				public Boolean AUTHORIZED_CLIENTIsKey(){
				    return false;
				}
				public Integer AUTHORIZED_CLIENTLength(){
				    return null;
				}
				public Integer AUTHORIZED_CLIENTPrecision(){
				    return null;
				}
				public String AUTHORIZED_CLIENTDefault(){
				
					return "";
				
				}
				public String AUTHORIZED_CLIENTComment(){
				
				    return "";
				
				}
				public String AUTHORIZED_CLIENTPattern(){
				
					return "";
				
				}
				public String AUTHORIZED_CLIENTOriginalDbColumnName(){
				
					return "AUTHORIZED_CLIENT";
				
				}

				
			    public String ENTERED_BY;

				public String getENTERED_BY () {
					return this.ENTERED_BY;
				}

				public Boolean ENTERED_BYIsNullable(){
				    return true;
				}
				public Boolean ENTERED_BYIsKey(){
				    return false;
				}
				public Integer ENTERED_BYLength(){
				    return null;
				}
				public Integer ENTERED_BYPrecision(){
				    return null;
				}
				public String ENTERED_BYDefault(){
				
					return "";
				
				}
				public String ENTERED_BYComment(){
				
				    return "";
				
				}
				public String ENTERED_BYPattern(){
				
					return "";
				
				}
				public String ENTERED_BYOriginalDbColumnName(){
				
					return "ENTERED_BY";
				
				}

				
			    public String PERSONALIZE_CODE;

				public String getPERSONALIZE_CODE () {
					return this.PERSONALIZE_CODE;
				}

				public Boolean PERSONALIZE_CODEIsNullable(){
				    return false;
				}
				public Boolean PERSONALIZE_CODEIsKey(){
				    return false;
				}
				public Integer PERSONALIZE_CODELength(){
				    return null;
				}
				public Integer PERSONALIZE_CODEPrecision(){
				    return null;
				}
				public String PERSONALIZE_CODEDefault(){
				
					return "";
				
				}
				public String PERSONALIZE_CODEComment(){
				
				    return "";
				
				}
				public String PERSONALIZE_CODEPattern(){
				
					return "";
				
				}
				public String PERSONALIZE_CODEOriginalDbColumnName(){
				
					return "PERSONALIZE_CODE";
				
				}

				
			    public String HOLD_FLAG;

				public String getHOLD_FLAG () {
					return this.HOLD_FLAG;
				}

				public Boolean HOLD_FLAGIsNullable(){
				    return false;
				}
				public Boolean HOLD_FLAGIsKey(){
				    return false;
				}
				public Integer HOLD_FLAGLength(){
				    return null;
				}
				public Integer HOLD_FLAGPrecision(){
				    return null;
				}
				public String HOLD_FLAGDefault(){
				
					return "";
				
				}
				public String HOLD_FLAGComment(){
				
				    return "";
				
				}
				public String HOLD_FLAGPattern(){
				
					return "";
				
				}
				public String HOLD_FLAGOriginalDbColumnName(){
				
					return "HOLD_FLAG";
				
				}

				
			    public String HOLD_REASON_CODE;

				public String getHOLD_REASON_CODE () {
					return this.HOLD_REASON_CODE;
				}

				public Boolean HOLD_REASON_CODEIsNullable(){
				    return false;
				}
				public Boolean HOLD_REASON_CODEIsKey(){
				    return false;
				}
				public Integer HOLD_REASON_CODELength(){
				    return null;
				}
				public Integer HOLD_REASON_CODEPrecision(){
				    return null;
				}
				public String HOLD_REASON_CODEDefault(){
				
					return "";
				
				}
				public String HOLD_REASON_CODEComment(){
				
				    return "";
				
				}
				public String HOLD_REASON_CODEPattern(){
				
					return "";
				
				}
				public String HOLD_REASON_CODEOriginalDbColumnName(){
				
					return "HOLD_REASON_CODE";
				
				}

				
			    public String CUSTOMER_PO_NO;

				public String getCUSTOMER_PO_NO () {
					return this.CUSTOMER_PO_NO;
				}

				public Boolean CUSTOMER_PO_NOIsNullable(){
				    return false;
				}
				public Boolean CUSTOMER_PO_NOIsKey(){
				    return false;
				}
				public Integer CUSTOMER_PO_NOLength(){
				    return null;
				}
				public Integer CUSTOMER_PO_NOPrecision(){
				    return null;
				}
				public String CUSTOMER_PO_NODefault(){
				
					return "";
				
				}
				public String CUSTOMER_PO_NOComment(){
				
				    return "";
				
				}
				public String CUSTOMER_PO_NOPattern(){
				
					return "";
				
				}
				public String CUSTOMER_PO_NOOriginalDbColumnName(){
				
					return "CUSTOMER_PO_NO";
				
				}

				
			    public String CUSTOMER_CUSTOMER_PO_NO;

				public String getCUSTOMER_CUSTOMER_PO_NO () {
					return this.CUSTOMER_CUSTOMER_PO_NO;
				}

				public Boolean CUSTOMER_CUSTOMER_PO_NOIsNullable(){
				    return false;
				}
				public Boolean CUSTOMER_CUSTOMER_PO_NOIsKey(){
				    return false;
				}
				public Integer CUSTOMER_CUSTOMER_PO_NOLength(){
				    return null;
				}
				public Integer CUSTOMER_CUSTOMER_PO_NOPrecision(){
				    return null;
				}
				public String CUSTOMER_CUSTOMER_PO_NODefault(){
				
					return "";
				
				}
				public String CUSTOMER_CUSTOMER_PO_NOComment(){
				
				    return "";
				
				}
				public String CUSTOMER_CUSTOMER_PO_NOPattern(){
				
					return "";
				
				}
				public String CUSTOMER_CUSTOMER_PO_NOOriginalDbColumnName(){
				
					return "CUSTOMER_CUSTOMER_PO_NO";
				
				}

				
			    public String ORDER_NAME;

				public String getORDER_NAME () {
					return this.ORDER_NAME;
				}

				public Boolean ORDER_NAMEIsNullable(){
				    return false;
				}
				public Boolean ORDER_NAMEIsKey(){
				    return false;
				}
				public Integer ORDER_NAMELength(){
				    return null;
				}
				public Integer ORDER_NAMEPrecision(){
				    return null;
				}
				public String ORDER_NAMEDefault(){
				
					return "";
				
				}
				public String ORDER_NAMEComment(){
				
				    return "";
				
				}
				public String ORDER_NAMEPattern(){
				
					return "";
				
				}
				public String ORDER_NAMEOriginalDbColumnName(){
				
					return "ORDER_NAME";
				
				}

				
			    public String PAYMENT_RULE_ID;

				public String getPAYMENT_RULE_ID () {
					return this.PAYMENT_RULE_ID;
				}

				public Boolean PAYMENT_RULE_IDIsNullable(){
				    return true;
				}
				public Boolean PAYMENT_RULE_IDIsKey(){
				    return false;
				}
				public Integer PAYMENT_RULE_IDLength(){
				    return null;
				}
				public Integer PAYMENT_RULE_IDPrecision(){
				    return null;
				}
				public String PAYMENT_RULE_IDDefault(){
				
					return "";
				
				}
				public String PAYMENT_RULE_IDComment(){
				
				    return "";
				
				}
				public String PAYMENT_RULE_IDPattern(){
				
					return "";
				
				}
				public String PAYMENT_RULE_IDOriginalDbColumnName(){
				
					return "PAYMENT_RULE_ID";
				
				}

				
			    public String TERMS_CODE;

				public String getTERMS_CODE () {
					return this.TERMS_CODE;
				}

				public Boolean TERMS_CODEIsNullable(){
				    return false;
				}
				public Boolean TERMS_CODEIsKey(){
				    return false;
				}
				public Integer TERMS_CODELength(){
				    return null;
				}
				public Integer TERMS_CODEPrecision(){
				    return null;
				}
				public String TERMS_CODEDefault(){
				
					return "";
				
				}
				public String TERMS_CODEComment(){
				
				    return "";
				
				}
				public String TERMS_CODEPattern(){
				
					return "";
				
				}
				public String TERMS_CODEOriginalDbColumnName(){
				
					return "TERMS_CODE";
				
				}

				
			    public String DELIVERY_CODE;

				public String getDELIVERY_CODE () {
					return this.DELIVERY_CODE;
				}

				public Boolean DELIVERY_CODEIsNullable(){
				    return false;
				}
				public Boolean DELIVERY_CODEIsKey(){
				    return false;
				}
				public Integer DELIVERY_CODELength(){
				    return null;
				}
				public Integer DELIVERY_CODEPrecision(){
				    return null;
				}
				public String DELIVERY_CODEDefault(){
				
					return "";
				
				}
				public String DELIVERY_CODEComment(){
				
				    return "";
				
				}
				public String DELIVERY_CODEPattern(){
				
					return "";
				
				}
				public String DELIVERY_CODEOriginalDbColumnName(){
				
					return "DELIVERY_CODE";
				
				}

				
			    public String CHARGE_ACTUAL_FREIGHT;

				public String getCHARGE_ACTUAL_FREIGHT () {
					return this.CHARGE_ACTUAL_FREIGHT;
				}

				public Boolean CHARGE_ACTUAL_FREIGHTIsNullable(){
				    return false;
				}
				public Boolean CHARGE_ACTUAL_FREIGHTIsKey(){
				    return false;
				}
				public Integer CHARGE_ACTUAL_FREIGHTLength(){
				    return null;
				}
				public Integer CHARGE_ACTUAL_FREIGHTPrecision(){
				    return null;
				}
				public String CHARGE_ACTUAL_FREIGHTDefault(){
				
					return "";
				
				}
				public String CHARGE_ACTUAL_FREIGHTComment(){
				
				    return "";
				
				}
				public String CHARGE_ACTUAL_FREIGHTPattern(){
				
					return "";
				
				}
				public String CHARGE_ACTUAL_FREIGHTOriginalDbColumnName(){
				
					return "CHARGE_ACTUAL_FREIGHT";
				
				}

				
			    public BigDecimal TAX;

				public BigDecimal getTAX () {
					return this.TAX;
				}

				public Boolean TAXIsNullable(){
				    return false;
				}
				public Boolean TAXIsKey(){
				    return false;
				}
				public Integer TAXLength(){
				    return null;
				}
				public Integer TAXPrecision(){
				    return null;
				}
				public String TAXDefault(){
				
					return "";
				
				}
				public String TAXComment(){
				
				    return "";
				
				}
				public String TAXPattern(){
				
					return "";
				
				}
				public String TAXOriginalDbColumnName(){
				
					return "TAX";
				
				}

				
			    public BigDecimal TOTAL_AMOUNT;

				public BigDecimal getTOTAL_AMOUNT () {
					return this.TOTAL_AMOUNT;
				}

				public Boolean TOTAL_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean TOTAL_AMOUNTIsKey(){
				    return false;
				}
				public Integer TOTAL_AMOUNTLength(){
				    return null;
				}
				public Integer TOTAL_AMOUNTPrecision(){
				    return null;
				}
				public String TOTAL_AMOUNTDefault(){
				
					return "";
				
				}
				public String TOTAL_AMOUNTComment(){
				
				    return "";
				
				}
				public String TOTAL_AMOUNTPattern(){
				
					return "";
				
				}
				public String TOTAL_AMOUNTOriginalDbColumnName(){
				
					return "TOTAL_AMOUNT";
				
				}

				
			    public BigDecimal ORIGINAL_TOTAL_AMOUNT;

				public BigDecimal getORIGINAL_TOTAL_AMOUNT () {
					return this.ORIGINAL_TOTAL_AMOUNT;
				}

				public Boolean ORIGINAL_TOTAL_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean ORIGINAL_TOTAL_AMOUNTIsKey(){
				    return false;
				}
				public Integer ORIGINAL_TOTAL_AMOUNTLength(){
				    return null;
				}
				public Integer ORIGINAL_TOTAL_AMOUNTPrecision(){
				    return null;
				}
				public String ORIGINAL_TOTAL_AMOUNTDefault(){
				
					return "";
				
				}
				public String ORIGINAL_TOTAL_AMOUNTComment(){
				
				    return "";
				
				}
				public String ORIGINAL_TOTAL_AMOUNTPattern(){
				
					return "";
				
				}
				public String ORIGINAL_TOTAL_AMOUNTOriginalDbColumnName(){
				
					return "ORIGINAL_TOTAL_AMOUNT";
				
				}

				
			    public BigDecimal ORIGINAL_TAX;

				public BigDecimal getORIGINAL_TAX () {
					return this.ORIGINAL_TAX;
				}

				public Boolean ORIGINAL_TAXIsNullable(){
				    return false;
				}
				public Boolean ORIGINAL_TAXIsKey(){
				    return false;
				}
				public Integer ORIGINAL_TAXLength(){
				    return null;
				}
				public Integer ORIGINAL_TAXPrecision(){
				    return null;
				}
				public String ORIGINAL_TAXDefault(){
				
					return "";
				
				}
				public String ORIGINAL_TAXComment(){
				
				    return "";
				
				}
				public String ORIGINAL_TAXPattern(){
				
					return "";
				
				}
				public String ORIGINAL_TAXOriginalDbColumnName(){
				
					return "ORIGINAL_TAX";
				
				}

				
			    public String CURRENCY;

				public String getCURRENCY () {
					return this.CURRENCY;
				}

				public Boolean CURRENCYIsNullable(){
				    return false;
				}
				public Boolean CURRENCYIsKey(){
				    return false;
				}
				public Integer CURRENCYLength(){
				    return null;
				}
				public Integer CURRENCYPrecision(){
				    return null;
				}
				public String CURRENCYDefault(){
				
					return "";
				
				}
				public String CURRENCYComment(){
				
				    return "";
				
				}
				public String CURRENCYPattern(){
				
					return "";
				
				}
				public String CURRENCYOriginalDbColumnName(){
				
					return "CURRENCY";
				
				}

				
			    public String ENTERPRISE_CURRENCY;

				public String getENTERPRISE_CURRENCY () {
					return this.ENTERPRISE_CURRENCY;
				}

				public Boolean ENTERPRISE_CURRENCYIsNullable(){
				    return false;
				}
				public Boolean ENTERPRISE_CURRENCYIsKey(){
				    return false;
				}
				public Integer ENTERPRISE_CURRENCYLength(){
				    return null;
				}
				public Integer ENTERPRISE_CURRENCYPrecision(){
				    return null;
				}
				public String ENTERPRISE_CURRENCYDefault(){
				
					return "";
				
				}
				public String ENTERPRISE_CURRENCYComment(){
				
				    return "";
				
				}
				public String ENTERPRISE_CURRENCYPattern(){
				
					return "";
				
				}
				public String ENTERPRISE_CURRENCYOriginalDbColumnName(){
				
					return "ENTERPRISE_CURRENCY";
				
				}

				
			    public BigDecimal REPORTING_CONVERSION_RATE;

				public BigDecimal getREPORTING_CONVERSION_RATE () {
					return this.REPORTING_CONVERSION_RATE;
				}

				public Boolean REPORTING_CONVERSION_RATEIsNullable(){
				    return false;
				}
				public Boolean REPORTING_CONVERSION_RATEIsKey(){
				    return false;
				}
				public Integer REPORTING_CONVERSION_RATELength(){
				    return null;
				}
				public Integer REPORTING_CONVERSION_RATEPrecision(){
				    return null;
				}
				public String REPORTING_CONVERSION_RATEDefault(){
				
					return "";
				
				}
				public String REPORTING_CONVERSION_RATEComment(){
				
				    return "";
				
				}
				public String REPORTING_CONVERSION_RATEPattern(){
				
					return "";
				
				}
				public String REPORTING_CONVERSION_RATEOriginalDbColumnName(){
				
					return "REPORTING_CONVERSION_RATE";
				
				}

				
			    public java.util.Date REPORTING_CONVERSION_DATE;

				public java.util.Date getREPORTING_CONVERSION_DATE () {
					return this.REPORTING_CONVERSION_DATE;
				}

				public Boolean REPORTING_CONVERSION_DATEIsNullable(){
				    return false;
				}
				public Boolean REPORTING_CONVERSION_DATEIsKey(){
				    return false;
				}
				public Integer REPORTING_CONVERSION_DATELength(){
				    return null;
				}
				public Integer REPORTING_CONVERSION_DATEPrecision(){
				    return null;
				}
				public String REPORTING_CONVERSION_DATEDefault(){
				
					return "";
				
				}
				public String REPORTING_CONVERSION_DATEComment(){
				
				    return "";
				
				}
				public String REPORTING_CONVERSION_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String REPORTING_CONVERSION_DATEOriginalDbColumnName(){
				
					return "REPORTING_CONVERSION_DATE";
				
				}

				
			    public String PAYMENT_STATUS;

				public String getPAYMENT_STATUS () {
					return this.PAYMENT_STATUS;
				}

				public Boolean PAYMENT_STATUSIsNullable(){
				    return false;
				}
				public Boolean PAYMENT_STATUSIsKey(){
				    return false;
				}
				public Integer PAYMENT_STATUSLength(){
				    return null;
				}
				public Integer PAYMENT_STATUSPrecision(){
				    return null;
				}
				public String PAYMENT_STATUSDefault(){
				
					return "";
				
				}
				public String PAYMENT_STATUSComment(){
				
				    return "";
				
				}
				public String PAYMENT_STATUSPattern(){
				
					return "";
				
				}
				public String PAYMENT_STATUSOriginalDbColumnName(){
				
					return "PAYMENT_STATUS";
				
				}

				
			    public java.util.Date AUTHORIZATION_EXPIRATION_DATE;

				public java.util.Date getAUTHORIZATION_EXPIRATION_DATE () {
					return this.AUTHORIZATION_EXPIRATION_DATE;
				}

				public Boolean AUTHORIZATION_EXPIRATION_DATEIsNullable(){
				    return false;
				}
				public Boolean AUTHORIZATION_EXPIRATION_DATEIsKey(){
				    return false;
				}
				public Integer AUTHORIZATION_EXPIRATION_DATELength(){
				    return null;
				}
				public Integer AUTHORIZATION_EXPIRATION_DATEPrecision(){
				    return null;
				}
				public String AUTHORIZATION_EXPIRATION_DATEDefault(){
				
					return "";
				
				}
				public String AUTHORIZATION_EXPIRATION_DATEComment(){
				
				    return "";
				
				}
				public String AUTHORIZATION_EXPIRATION_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String AUTHORIZATION_EXPIRATION_DATEOriginalDbColumnName(){
				
					return "AUTHORIZATION_EXPIRATION_DATE";
				
				}

				
			    public String SEARCH_CRITERIA_1;

				public String getSEARCH_CRITERIA_1 () {
					return this.SEARCH_CRITERIA_1;
				}

				public Boolean SEARCH_CRITERIA_1IsNullable(){
				    return false;
				}
				public Boolean SEARCH_CRITERIA_1IsKey(){
				    return false;
				}
				public Integer SEARCH_CRITERIA_1Length(){
				    return null;
				}
				public Integer SEARCH_CRITERIA_1Precision(){
				    return null;
				}
				public String SEARCH_CRITERIA_1Default(){
				
					return "";
				
				}
				public String SEARCH_CRITERIA_1Comment(){
				
				    return "";
				
				}
				public String SEARCH_CRITERIA_1Pattern(){
				
					return "";
				
				}
				public String SEARCH_CRITERIA_1OriginalDbColumnName(){
				
					return "SEARCH_CRITERIA_1";
				
				}

				
			    public String SEARCH_CRITERIA_2;

				public String getSEARCH_CRITERIA_2 () {
					return this.SEARCH_CRITERIA_2;
				}

				public Boolean SEARCH_CRITERIA_2IsNullable(){
				    return false;
				}
				public Boolean SEARCH_CRITERIA_2IsKey(){
				    return false;
				}
				public Integer SEARCH_CRITERIA_2Length(){
				    return null;
				}
				public Integer SEARCH_CRITERIA_2Precision(){
				    return null;
				}
				public String SEARCH_CRITERIA_2Default(){
				
					return "";
				
				}
				public String SEARCH_CRITERIA_2Comment(){
				
				    return "";
				
				}
				public String SEARCH_CRITERIA_2Pattern(){
				
					return "";
				
				}
				public String SEARCH_CRITERIA_2OriginalDbColumnName(){
				
					return "SEARCH_CRITERIA_2";
				
				}

				
			    public String CUSTOMER_EMAILID;

				public String getCUSTOMER_EMAILID () {
					return this.CUSTOMER_EMAILID;
				}

				public Boolean CUSTOMER_EMAILIDIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_EMAILIDIsKey(){
				    return false;
				}
				public Integer CUSTOMER_EMAILIDLength(){
				    return null;
				}
				public Integer CUSTOMER_EMAILIDPrecision(){
				    return null;
				}
				public String CUSTOMER_EMAILIDDefault(){
				
					return "";
				
				}
				public String CUSTOMER_EMAILIDComment(){
				
				    return "";
				
				}
				public String CUSTOMER_EMAILIDPattern(){
				
					return "";
				
				}
				public String CUSTOMER_EMAILIDOriginalDbColumnName(){
				
					return "CUSTOMER_EMAILID";
				
				}

				
			    public String FOB;

				public String getFOB () {
					return this.FOB;
				}

				public Boolean FOBIsNullable(){
				    return false;
				}
				public Boolean FOBIsKey(){
				    return false;
				}
				public Integer FOBLength(){
				    return null;
				}
				public Integer FOBPrecision(){
				    return null;
				}
				public String FOBDefault(){
				
					return "";
				
				}
				public String FOBComment(){
				
				    return "";
				
				}
				public String FOBPattern(){
				
					return "";
				
				}
				public String FOBOriginalDbColumnName(){
				
					return "FOB";
				
				}

				
			    public BigDecimal TOTAL_ADJUSTMENT_AMOUNT;

				public BigDecimal getTOTAL_ADJUSTMENT_AMOUNT () {
					return this.TOTAL_ADJUSTMENT_AMOUNT;
				}

				public Boolean TOTAL_ADJUSTMENT_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean TOTAL_ADJUSTMENT_AMOUNTIsKey(){
				    return false;
				}
				public Integer TOTAL_ADJUSTMENT_AMOUNTLength(){
				    return null;
				}
				public Integer TOTAL_ADJUSTMENT_AMOUNTPrecision(){
				    return null;
				}
				public String TOTAL_ADJUSTMENT_AMOUNTDefault(){
				
					return "";
				
				}
				public String TOTAL_ADJUSTMENT_AMOUNTComment(){
				
				    return "";
				
				}
				public String TOTAL_ADJUSTMENT_AMOUNTPattern(){
				
					return "";
				
				}
				public String TOTAL_ADJUSTMENT_AMOUNTOriginalDbColumnName(){
				
					return "TOTAL_ADJUSTMENT_AMOUNT";
				
				}

				
			    public BigDecimal OTHER_CHARGES;

				public BigDecimal getOTHER_CHARGES () {
					return this.OTHER_CHARGES;
				}

				public Boolean OTHER_CHARGESIsNullable(){
				    return false;
				}
				public Boolean OTHER_CHARGESIsKey(){
				    return false;
				}
				public Integer OTHER_CHARGESLength(){
				    return null;
				}
				public Integer OTHER_CHARGESPrecision(){
				    return null;
				}
				public String OTHER_CHARGESDefault(){
				
					return "";
				
				}
				public String OTHER_CHARGESComment(){
				
				    return "";
				
				}
				public String OTHER_CHARGESPattern(){
				
					return "";
				
				}
				public String OTHER_CHARGESOriginalDbColumnName(){
				
					return "OTHER_CHARGES";
				
				}

				
			    public String PRICE_PROGRAM_KEY;

				public String getPRICE_PROGRAM_KEY () {
					return this.PRICE_PROGRAM_KEY;
				}

				public Boolean PRICE_PROGRAM_KEYIsNullable(){
				    return true;
				}
				public Boolean PRICE_PROGRAM_KEYIsKey(){
				    return false;
				}
				public Integer PRICE_PROGRAM_KEYLength(){
				    return null;
				}
				public Integer PRICE_PROGRAM_KEYPrecision(){
				    return null;
				}
				public String PRICE_PROGRAM_KEYDefault(){
				
					return "";
				
				}
				public String PRICE_PROGRAM_KEYComment(){
				
				    return "";
				
				}
				public String PRICE_PROGRAM_KEYPattern(){
				
					return "";
				
				}
				public String PRICE_PROGRAM_KEYOriginalDbColumnName(){
				
					return "PRICE_PROGRAM_KEY";
				
				}

				
			    public String TAXPAYER_ID;

				public String getTAXPAYER_ID () {
					return this.TAXPAYER_ID;
				}

				public Boolean TAXPAYER_IDIsNullable(){
				    return false;
				}
				public Boolean TAXPAYER_IDIsKey(){
				    return false;
				}
				public Integer TAXPAYER_IDLength(){
				    return null;
				}
				public Integer TAXPAYER_IDPrecision(){
				    return null;
				}
				public String TAXPAYER_IDDefault(){
				
					return "";
				
				}
				public String TAXPAYER_IDComment(){
				
				    return "";
				
				}
				public String TAXPAYER_IDPattern(){
				
					return "";
				
				}
				public String TAXPAYER_IDOriginalDbColumnName(){
				
					return "TAXPAYER_ID";
				
				}

				
			    public String TAX_JURISDICTION;

				public String getTAX_JURISDICTION () {
					return this.TAX_JURISDICTION;
				}

				public Boolean TAX_JURISDICTIONIsNullable(){
				    return false;
				}
				public Boolean TAX_JURISDICTIONIsKey(){
				    return false;
				}
				public Integer TAX_JURISDICTIONLength(){
				    return null;
				}
				public Integer TAX_JURISDICTIONPrecision(){
				    return null;
				}
				public String TAX_JURISDICTIONDefault(){
				
					return "";
				
				}
				public String TAX_JURISDICTIONComment(){
				
				    return "";
				
				}
				public String TAX_JURISDICTIONPattern(){
				
					return "";
				
				}
				public String TAX_JURISDICTIONOriginalDbColumnName(){
				
					return "TAX_JURISDICTION";
				
				}

				
			    public String TAX_EXEMPT_FLAG;

				public String getTAX_EXEMPT_FLAG () {
					return this.TAX_EXEMPT_FLAG;
				}

				public Boolean TAX_EXEMPT_FLAGIsNullable(){
				    return false;
				}
				public Boolean TAX_EXEMPT_FLAGIsKey(){
				    return false;
				}
				public Integer TAX_EXEMPT_FLAGLength(){
				    return null;
				}
				public Integer TAX_EXEMPT_FLAGPrecision(){
				    return null;
				}
				public String TAX_EXEMPT_FLAGDefault(){
				
					return "";
				
				}
				public String TAX_EXEMPT_FLAGComment(){
				
				    return "";
				
				}
				public String TAX_EXEMPT_FLAGPattern(){
				
					return "";
				
				}
				public String TAX_EXEMPT_FLAGOriginalDbColumnName(){
				
					return "TAX_EXEMPT_FLAG";
				
				}

				
			    public String TAX_EXEMPTION_CERTIFICATE;

				public String getTAX_EXEMPTION_CERTIFICATE () {
					return this.TAX_EXEMPTION_CERTIFICATE;
				}

				public Boolean TAX_EXEMPTION_CERTIFICATEIsNullable(){
				    return false;
				}
				public Boolean TAX_EXEMPTION_CERTIFICATEIsKey(){
				    return false;
				}
				public Integer TAX_EXEMPTION_CERTIFICATELength(){
				    return null;
				}
				public Integer TAX_EXEMPTION_CERTIFICATEPrecision(){
				    return null;
				}
				public String TAX_EXEMPTION_CERTIFICATEDefault(){
				
					return "";
				
				}
				public String TAX_EXEMPTION_CERTIFICATEComment(){
				
				    return "";
				
				}
				public String TAX_EXEMPTION_CERTIFICATEPattern(){
				
					return "";
				
				}
				public String TAX_EXEMPTION_CERTIFICATEOriginalDbColumnName(){
				
					return "TAX_EXEMPTION_CERTIFICATE";
				
				}

				
			    public String PURPOSE;

				public String getPURPOSE () {
					return this.PURPOSE;
				}

				public Boolean PURPOSEIsNullable(){
				    return false;
				}
				public Boolean PURPOSEIsKey(){
				    return false;
				}
				public Integer PURPOSELength(){
				    return null;
				}
				public Integer PURPOSEPrecision(){
				    return null;
				}
				public String PURPOSEDefault(){
				
					return "";
				
				}
				public String PURPOSEComment(){
				
				    return "";
				
				}
				public String PURPOSEPattern(){
				
					return "";
				
				}
				public String PURPOSEOriginalDbColumnName(){
				
					return "PURPOSE";
				
				}

				
			    public String INVOICE_COMPLETE;

				public String getINVOICE_COMPLETE () {
					return this.INVOICE_COMPLETE;
				}

				public Boolean INVOICE_COMPLETEIsNullable(){
				    return false;
				}
				public Boolean INVOICE_COMPLETEIsKey(){
				    return false;
				}
				public Integer INVOICE_COMPLETELength(){
				    return null;
				}
				public Integer INVOICE_COMPLETEPrecision(){
				    return null;
				}
				public String INVOICE_COMPLETEDefault(){
				
					return "";
				
				}
				public String INVOICE_COMPLETEComment(){
				
				    return "";
				
				}
				public String INVOICE_COMPLETEPattern(){
				
					return "";
				
				}
				public String INVOICE_COMPLETEOriginalDbColumnName(){
				
					return "INVOICE_COMPLETE";
				
				}

				
			    public String ORDER_CLOSED;

				public String getORDER_CLOSED () {
					return this.ORDER_CLOSED;
				}

				public Boolean ORDER_CLOSEDIsNullable(){
				    return false;
				}
				public Boolean ORDER_CLOSEDIsKey(){
				    return false;
				}
				public Integer ORDER_CLOSEDLength(){
				    return null;
				}
				public Integer ORDER_CLOSEDPrecision(){
				    return null;
				}
				public String ORDER_CLOSEDDefault(){
				
					return "";
				
				}
				public String ORDER_CLOSEDComment(){
				
				    return "";
				
				}
				public String ORDER_CLOSEDPattern(){
				
					return "";
				
				}
				public String ORDER_CLOSEDOriginalDbColumnName(){
				
					return "ORDER_CLOSED";
				
				}

				
			    public java.util.Date NEXT_ALERT_TS;

				public java.util.Date getNEXT_ALERT_TS () {
					return this.NEXT_ALERT_TS;
				}

				public Boolean NEXT_ALERT_TSIsNullable(){
				    return false;
				}
				public Boolean NEXT_ALERT_TSIsKey(){
				    return false;
				}
				public Integer NEXT_ALERT_TSLength(){
				    return null;
				}
				public Integer NEXT_ALERT_TSPrecision(){
				    return null;
				}
				public String NEXT_ALERT_TSDefault(){
				
					return "";
				
				}
				public String NEXT_ALERT_TSComment(){
				
				    return "";
				
				}
				public String NEXT_ALERT_TSPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String NEXT_ALERT_TSOriginalDbColumnName(){
				
					return "NEXT_ALERT_TS";
				
				}

				
			    public String DO_NOT_CONSOLIDATE;

				public String getDO_NOT_CONSOLIDATE () {
					return this.DO_NOT_CONSOLIDATE;
				}

				public Boolean DO_NOT_CONSOLIDATEIsNullable(){
				    return false;
				}
				public Boolean DO_NOT_CONSOLIDATEIsKey(){
				    return false;
				}
				public Integer DO_NOT_CONSOLIDATELength(){
				    return null;
				}
				public Integer DO_NOT_CONSOLIDATEPrecision(){
				    return null;
				}
				public String DO_NOT_CONSOLIDATEDefault(){
				
					return "";
				
				}
				public String DO_NOT_CONSOLIDATEComment(){
				
				    return "";
				
				}
				public String DO_NOT_CONSOLIDATEPattern(){
				
					return "";
				
				}
				public String DO_NOT_CONSOLIDATEOriginalDbColumnName(){
				
					return "DO_NOT_CONSOLIDATE";
				
				}

				
			    public String CHAIN_TYPE;

				public String getCHAIN_TYPE () {
					return this.CHAIN_TYPE;
				}

				public Boolean CHAIN_TYPEIsNullable(){
				    return false;
				}
				public Boolean CHAIN_TYPEIsKey(){
				    return false;
				}
				public Integer CHAIN_TYPELength(){
				    return null;
				}
				public Integer CHAIN_TYPEPrecision(){
				    return null;
				}
				public String CHAIN_TYPEDefault(){
				
					return "";
				
				}
				public String CHAIN_TYPEComment(){
				
				    return "";
				
				}
				public String CHAIN_TYPEPattern(){
				
					return "";
				
				}
				public String CHAIN_TYPEOriginalDbColumnName(){
				
					return "CHAIN_TYPE";
				
				}

				
			    public String ADJUSTMENT_INVOICE_PENDING;

				public String getADJUSTMENT_INVOICE_PENDING () {
					return this.ADJUSTMENT_INVOICE_PENDING;
				}

				public Boolean ADJUSTMENT_INVOICE_PENDINGIsNullable(){
				    return false;
				}
				public Boolean ADJUSTMENT_INVOICE_PENDINGIsKey(){
				    return false;
				}
				public Integer ADJUSTMENT_INVOICE_PENDINGLength(){
				    return null;
				}
				public Integer ADJUSTMENT_INVOICE_PENDINGPrecision(){
				    return null;
				}
				public String ADJUSTMENT_INVOICE_PENDINGDefault(){
				
					return "";
				
				}
				public String ADJUSTMENT_INVOICE_PENDINGComment(){
				
				    return "";
				
				}
				public String ADJUSTMENT_INVOICE_PENDINGPattern(){
				
					return "";
				
				}
				public String ADJUSTMENT_INVOICE_PENDINGOriginalDbColumnName(){
				
					return "ADJUSTMENT_INVOICE_PENDING";
				
				}

				
			    public java.util.Date AUTO_CANCEL_DATE;

				public java.util.Date getAUTO_CANCEL_DATE () {
					return this.AUTO_CANCEL_DATE;
				}

				public Boolean AUTO_CANCEL_DATEIsNullable(){
				    return true;
				}
				public Boolean AUTO_CANCEL_DATEIsKey(){
				    return false;
				}
				public Integer AUTO_CANCEL_DATELength(){
				    return null;
				}
				public Integer AUTO_CANCEL_DATEPrecision(){
				    return null;
				}
				public String AUTO_CANCEL_DATEDefault(){
				
					return "";
				
				}
				public String AUTO_CANCEL_DATEComment(){
				
				    return "";
				
				}
				public String AUTO_CANCEL_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String AUTO_CANCEL_DATEOriginalDbColumnName(){
				
					return "AUTO_CANCEL_DATE";
				
				}

				
			    public String SALE_VOIDED;

				public String getSALE_VOIDED () {
					return this.SALE_VOIDED;
				}

				public Boolean SALE_VOIDEDIsNullable(){
				    return false;
				}
				public Boolean SALE_VOIDEDIsKey(){
				    return false;
				}
				public Integer SALE_VOIDEDLength(){
				    return null;
				}
				public Integer SALE_VOIDEDPrecision(){
				    return null;
				}
				public String SALE_VOIDEDDefault(){
				
					return "";
				
				}
				public String SALE_VOIDEDComment(){
				
				    return "";
				
				}
				public String SALE_VOIDEDPattern(){
				
					return "";
				
				}
				public String SALE_VOIDEDOriginalDbColumnName(){
				
					return "SALE_VOIDED";
				
				}

				
			    public String IS_SHIP_COMPLETE;

				public String getIS_SHIP_COMPLETE () {
					return this.IS_SHIP_COMPLETE;
				}

				public Boolean IS_SHIP_COMPLETEIsNullable(){
				    return true;
				}
				public Boolean IS_SHIP_COMPLETEIsKey(){
				    return false;
				}
				public Integer IS_SHIP_COMPLETELength(){
				    return null;
				}
				public Integer IS_SHIP_COMPLETEPrecision(){
				    return null;
				}
				public String IS_SHIP_COMPLETEDefault(){
				
					return "";
				
				}
				public String IS_SHIP_COMPLETEComment(){
				
				    return "";
				
				}
				public String IS_SHIP_COMPLETEPattern(){
				
					return "";
				
				}
				public String IS_SHIP_COMPLETEOriginalDbColumnName(){
				
					return "IS_SHIP_COMPLETE";
				
				}

				
			    public String IS_LINE_SHIP_COMPLETE;

				public String getIS_LINE_SHIP_COMPLETE () {
					return this.IS_LINE_SHIP_COMPLETE;
				}

				public Boolean IS_LINE_SHIP_COMPLETEIsNullable(){
				    return true;
				}
				public Boolean IS_LINE_SHIP_COMPLETEIsKey(){
				    return false;
				}
				public Integer IS_LINE_SHIP_COMPLETELength(){
				    return null;
				}
				public Integer IS_LINE_SHIP_COMPLETEPrecision(){
				    return null;
				}
				public String IS_LINE_SHIP_COMPLETEDefault(){
				
					return "";
				
				}
				public String IS_LINE_SHIP_COMPLETEComment(){
				
				    return "";
				
				}
				public String IS_LINE_SHIP_COMPLETEPattern(){
				
					return "";
				
				}
				public String IS_LINE_SHIP_COMPLETEOriginalDbColumnName(){
				
					return "IS_LINE_SHIP_COMPLETE";
				
				}

				
			    public String IS_SHIP_SINGLE_NODE;

				public String getIS_SHIP_SINGLE_NODE () {
					return this.IS_SHIP_SINGLE_NODE;
				}

				public Boolean IS_SHIP_SINGLE_NODEIsNullable(){
				    return true;
				}
				public Boolean IS_SHIP_SINGLE_NODEIsKey(){
				    return false;
				}
				public Integer IS_SHIP_SINGLE_NODELength(){
				    return null;
				}
				public Integer IS_SHIP_SINGLE_NODEPrecision(){
				    return null;
				}
				public String IS_SHIP_SINGLE_NODEDefault(){
				
					return "";
				
				}
				public String IS_SHIP_SINGLE_NODEComment(){
				
				    return "";
				
				}
				public String IS_SHIP_SINGLE_NODEPattern(){
				
					return "";
				
				}
				public String IS_SHIP_SINGLE_NODEOriginalDbColumnName(){
				
					return "IS_SHIP_SINGLE_NODE";
				
				}

				
			    public String IS_LINE_SHIP_SINGLE_NODE;

				public String getIS_LINE_SHIP_SINGLE_NODE () {
					return this.IS_LINE_SHIP_SINGLE_NODE;
				}

				public Boolean IS_LINE_SHIP_SINGLE_NODEIsNullable(){
				    return true;
				}
				public Boolean IS_LINE_SHIP_SINGLE_NODEIsKey(){
				    return false;
				}
				public Integer IS_LINE_SHIP_SINGLE_NODELength(){
				    return null;
				}
				public Integer IS_LINE_SHIP_SINGLE_NODEPrecision(){
				    return null;
				}
				public String IS_LINE_SHIP_SINGLE_NODEDefault(){
				
					return "";
				
				}
				public String IS_LINE_SHIP_SINGLE_NODEComment(){
				
				    return "";
				
				}
				public String IS_LINE_SHIP_SINGLE_NODEPattern(){
				
					return "";
				
				}
				public String IS_LINE_SHIP_SINGLE_NODEOriginalDbColumnName(){
				
					return "IS_LINE_SHIP_SINGLE_NODE";
				
				}

				
			    public String CANCEL_ORDER_ON_EXCP_FLAG;

				public String getCANCEL_ORDER_ON_EXCP_FLAG () {
					return this.CANCEL_ORDER_ON_EXCP_FLAG;
				}

				public Boolean CANCEL_ORDER_ON_EXCP_FLAGIsNullable(){
				    return true;
				}
				public Boolean CANCEL_ORDER_ON_EXCP_FLAGIsKey(){
				    return false;
				}
				public Integer CANCEL_ORDER_ON_EXCP_FLAGLength(){
				    return null;
				}
				public Integer CANCEL_ORDER_ON_EXCP_FLAGPrecision(){
				    return null;
				}
				public String CANCEL_ORDER_ON_EXCP_FLAGDefault(){
				
					return "";
				
				}
				public String CANCEL_ORDER_ON_EXCP_FLAGComment(){
				
				    return "";
				
				}
				public String CANCEL_ORDER_ON_EXCP_FLAGPattern(){
				
					return "";
				
				}
				public String CANCEL_ORDER_ON_EXCP_FLAGOriginalDbColumnName(){
				
					return "CANCEL_ORDER_ON_EXCP_FLAG";
				
				}

				
			    public String OPTIMIZATION_TYPE;

				public String getOPTIMIZATION_TYPE () {
					return this.OPTIMIZATION_TYPE;
				}

				public Boolean OPTIMIZATION_TYPEIsNullable(){
				    return true;
				}
				public Boolean OPTIMIZATION_TYPEIsKey(){
				    return false;
				}
				public Integer OPTIMIZATION_TYPELength(){
				    return null;
				}
				public Integer OPTIMIZATION_TYPEPrecision(){
				    return null;
				}
				public String OPTIMIZATION_TYPEDefault(){
				
					return "";
				
				}
				public String OPTIMIZATION_TYPEComment(){
				
				    return "";
				
				}
				public String OPTIMIZATION_TYPEPattern(){
				
					return "";
				
				}
				public String OPTIMIZATION_TYPEOriginalDbColumnName(){
				
					return "OPTIMIZATION_TYPE";
				
				}

				
			    public java.util.Date PURGE_HISTORY_DATE;

				public java.util.Date getPURGE_HISTORY_DATE () {
					return this.PURGE_HISTORY_DATE;
				}

				public Boolean PURGE_HISTORY_DATEIsNullable(){
				    return true;
				}
				public Boolean PURGE_HISTORY_DATEIsKey(){
				    return false;
				}
				public Integer PURGE_HISTORY_DATELength(){
				    return null;
				}
				public Integer PURGE_HISTORY_DATEPrecision(){
				    return null;
				}
				public String PURGE_HISTORY_DATEDefault(){
				
					return "";
				
				}
				public String PURGE_HISTORY_DATEComment(){
				
				    return "";
				
				}
				public String PURGE_HISTORY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String PURGE_HISTORY_DATEOriginalDbColumnName(){
				
					return "PURGE_HISTORY_DATE";
				
				}

				
			    public BigDecimal PRICING_CLASSIFICATION_CODE;

				public BigDecimal getPRICING_CLASSIFICATION_CODE () {
					return this.PRICING_CLASSIFICATION_CODE;
				}

				public Boolean PRICING_CLASSIFICATION_CODEIsNullable(){
				    return true;
				}
				public Boolean PRICING_CLASSIFICATION_CODEIsKey(){
				    return false;
				}
				public Integer PRICING_CLASSIFICATION_CODELength(){
				    return null;
				}
				public Integer PRICING_CLASSIFICATION_CODEPrecision(){
				    return null;
				}
				public String PRICING_CLASSIFICATION_CODEDefault(){
				
					return "";
				
				}
				public String PRICING_CLASSIFICATION_CODEComment(){
				
				    return "";
				
				}
				public String PRICING_CLASSIFICATION_CODEPattern(){
				
					return "";
				
				}
				public String PRICING_CLASSIFICATION_CODEOriginalDbColumnName(){
				
					return "PRICING_CLASSIFICATION_CODE";
				
				}

				
			    public String SOURCE_TYPE;

				public String getSOURCE_TYPE () {
					return this.SOURCE_TYPE;
				}

				public Boolean SOURCE_TYPEIsNullable(){
				    return true;
				}
				public Boolean SOURCE_TYPEIsKey(){
				    return false;
				}
				public Integer SOURCE_TYPELength(){
				    return null;
				}
				public Integer SOURCE_TYPEPrecision(){
				    return null;
				}
				public String SOURCE_TYPEDefault(){
				
					return "";
				
				}
				public String SOURCE_TYPEComment(){
				
				    return "";
				
				}
				public String SOURCE_TYPEPattern(){
				
					return "";
				
				}
				public String SOURCE_TYPEOriginalDbColumnName(){
				
					return "SOURCE_TYPE";
				
				}

				
			    public BigDecimal SOURCE_KEY;

				public BigDecimal getSOURCE_KEY () {
					return this.SOURCE_KEY;
				}

				public Boolean SOURCE_KEYIsNullable(){
				    return true;
				}
				public Boolean SOURCE_KEYIsKey(){
				    return false;
				}
				public Integer SOURCE_KEYLength(){
				    return null;
				}
				public Integer SOURCE_KEYPrecision(){
				    return null;
				}
				public String SOURCE_KEYDefault(){
				
					return "";
				
				}
				public String SOURCE_KEYComment(){
				
				    return "";
				
				}
				public String SOURCE_KEYPattern(){
				
					return "";
				
				}
				public String SOURCE_KEYOriginalDbColumnName(){
				
					return "SOURCE_KEY";
				
				}

				
			    public String LINKED_SOURCE_KEY;

				public String getLINKED_SOURCE_KEY () {
					return this.LINKED_SOURCE_KEY;
				}

				public Boolean LINKED_SOURCE_KEYIsNullable(){
				    return true;
				}
				public Boolean LINKED_SOURCE_KEYIsKey(){
				    return false;
				}
				public Integer LINKED_SOURCE_KEYLength(){
				    return null;
				}
				public Integer LINKED_SOURCE_KEYPrecision(){
				    return null;
				}
				public String LINKED_SOURCE_KEYDefault(){
				
					return "";
				
				}
				public String LINKED_SOURCE_KEYComment(){
				
				    return "";
				
				}
				public String LINKED_SOURCE_KEYPattern(){
				
					return "";
				
				}
				public String LINKED_SOURCE_KEYOriginalDbColumnName(){
				
					return "LINKED_SOURCE_KEY";
				
				}

				
			    public BigDecimal ORIGINAL_CONTAINER_KEY;

				public BigDecimal getORIGINAL_CONTAINER_KEY () {
					return this.ORIGINAL_CONTAINER_KEY;
				}

				public Boolean ORIGINAL_CONTAINER_KEYIsNullable(){
				    return true;
				}
				public Boolean ORIGINAL_CONTAINER_KEYIsKey(){
				    return false;
				}
				public Integer ORIGINAL_CONTAINER_KEYLength(){
				    return null;
				}
				public Integer ORIGINAL_CONTAINER_KEYPrecision(){
				    return null;
				}
				public String ORIGINAL_CONTAINER_KEYDefault(){
				
					return "";
				
				}
				public String ORIGINAL_CONTAINER_KEYComment(){
				
				    return "";
				
				}
				public String ORIGINAL_CONTAINER_KEYPattern(){
				
					return "";
				
				}
				public String ORIGINAL_CONTAINER_KEYOriginalDbColumnName(){
				
					return "ORIGINAL_CONTAINER_KEY";
				
				}

				
			    public String SOLD_TO_KEY;

				public String getSOLD_TO_KEY () {
					return this.SOLD_TO_KEY;
				}

				public Boolean SOLD_TO_KEYIsNullable(){
				    return true;
				}
				public Boolean SOLD_TO_KEYIsKey(){
				    return false;
				}
				public Integer SOLD_TO_KEYLength(){
				    return null;
				}
				public Integer SOLD_TO_KEYPrecision(){
				    return null;
				}
				public String SOLD_TO_KEYDefault(){
				
					return "";
				
				}
				public String SOLD_TO_KEYComment(){
				
				    return "";
				
				}
				public String SOLD_TO_KEYPattern(){
				
					return "";
				
				}
				public String SOLD_TO_KEYOriginalDbColumnName(){
				
					return "SOLD_TO_KEY";
				
				}

				
			    public String TEAM_CODE;

				public String getTEAM_CODE () {
					return this.TEAM_CODE;
				}

				public Boolean TEAM_CODEIsNullable(){
				    return true;
				}
				public Boolean TEAM_CODEIsKey(){
				    return false;
				}
				public Integer TEAM_CODELength(){
				    return null;
				}
				public Integer TEAM_CODEPrecision(){
				    return null;
				}
				public String TEAM_CODEDefault(){
				
					return "";
				
				}
				public String TEAM_CODEComment(){
				
				    return "";
				
				}
				public String TEAM_CODEPattern(){
				
					return "";
				
				}
				public String TEAM_CODEOriginalDbColumnName(){
				
					return "TEAM_CODE";
				
				}

				
			    public String LEVEL_OF_SERVICE;

				public String getLEVEL_OF_SERVICE () {
					return this.LEVEL_OF_SERVICE;
				}

				public Boolean LEVEL_OF_SERVICEIsNullable(){
				    return true;
				}
				public Boolean LEVEL_OF_SERVICEIsKey(){
				    return false;
				}
				public Integer LEVEL_OF_SERVICELength(){
				    return null;
				}
				public Integer LEVEL_OF_SERVICEPrecision(){
				    return null;
				}
				public String LEVEL_OF_SERVICEDefault(){
				
					return "";
				
				}
				public String LEVEL_OF_SERVICEComment(){
				
				    return "";
				
				}
				public String LEVEL_OF_SERVICEPattern(){
				
					return "";
				
				}
				public String LEVEL_OF_SERVICEOriginalDbColumnName(){
				
					return "LEVEL_OF_SERVICE";
				
				}

				
			    public BigDecimal NEXT_ITER_SEQ_NO;

				public BigDecimal getNEXT_ITER_SEQ_NO () {
					return this.NEXT_ITER_SEQ_NO;
				}

				public Boolean NEXT_ITER_SEQ_NOIsNullable(){
				    return true;
				}
				public Boolean NEXT_ITER_SEQ_NOIsKey(){
				    return false;
				}
				public Integer NEXT_ITER_SEQ_NOLength(){
				    return null;
				}
				public Integer NEXT_ITER_SEQ_NOPrecision(){
				    return null;
				}
				public String NEXT_ITER_SEQ_NODefault(){
				
					return "";
				
				}
				public String NEXT_ITER_SEQ_NOComment(){
				
				    return "";
				
				}
				public String NEXT_ITER_SEQ_NOPattern(){
				
					return "";
				
				}
				public String NEXT_ITER_SEQ_NOOriginalDbColumnName(){
				
					return "NEXT_ITER_SEQ_NO";
				
				}

				
			    public java.util.Date NEXT_ITER_DATE;

				public java.util.Date getNEXT_ITER_DATE () {
					return this.NEXT_ITER_DATE;
				}

				public Boolean NEXT_ITER_DATEIsNullable(){
				    return true;
				}
				public Boolean NEXT_ITER_DATEIsKey(){
				    return false;
				}
				public Integer NEXT_ITER_DATELength(){
				    return null;
				}
				public Integer NEXT_ITER_DATEPrecision(){
				    return null;
				}
				public String NEXT_ITER_DATEDefault(){
				
					return "";
				
				}
				public String NEXT_ITER_DATEComment(){
				
				    return "";
				
				}
				public String NEXT_ITER_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String NEXT_ITER_DATEOriginalDbColumnName(){
				
					return "NEXT_ITER_DATE";
				
				}

				
			    public BigDecimal HRS_BEFORE_NEXT_ITER;

				public BigDecimal getHRS_BEFORE_NEXT_ITER () {
					return this.HRS_BEFORE_NEXT_ITER;
				}

				public Boolean HRS_BEFORE_NEXT_ITERIsNullable(){
				    return true;
				}
				public Boolean HRS_BEFORE_NEXT_ITERIsKey(){
				    return false;
				}
				public Integer HRS_BEFORE_NEXT_ITERLength(){
				    return null;
				}
				public Integer HRS_BEFORE_NEXT_ITERPrecision(){
				    return null;
				}
				public String HRS_BEFORE_NEXT_ITERDefault(){
				
					return "";
				
				}
				public String HRS_BEFORE_NEXT_ITERComment(){
				
				    return "";
				
				}
				public String HRS_BEFORE_NEXT_ITERPattern(){
				
					return "";
				
				}
				public String HRS_BEFORE_NEXT_ITEROriginalDbColumnName(){
				
					return "HRS_BEFORE_NEXT_ITER";
				
				}

				
			    public java.util.Date CREATETS;

				public java.util.Date getCREATETS () {
					return this.CREATETS;
				}

				public Boolean CREATETSIsNullable(){
				    return false;
				}
				public Boolean CREATETSIsKey(){
				    return false;
				}
				public Integer CREATETSLength(){
				    return null;
				}
				public Integer CREATETSPrecision(){
				    return null;
				}
				public String CREATETSDefault(){
				
					return "";
				
				}
				public String CREATETSComment(){
				
				    return "";
				
				}
				public String CREATETSPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String CREATETSOriginalDbColumnName(){
				
					return "CREATETS";
				
				}

				
			    public java.util.Date MODIFYTS;

				public java.util.Date getMODIFYTS () {
					return this.MODIFYTS;
				}

				public Boolean MODIFYTSIsNullable(){
				    return false;
				}
				public Boolean MODIFYTSIsKey(){
				    return false;
				}
				public Integer MODIFYTSLength(){
				    return null;
				}
				public Integer MODIFYTSPrecision(){
				    return null;
				}
				public String MODIFYTSDefault(){
				
					return "";
				
				}
				public String MODIFYTSComment(){
				
				    return "";
				
				}
				public String MODIFYTSPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String MODIFYTSOriginalDbColumnName(){
				
					return "MODIFYTS";
				
				}

				
			    public String CREATEUSERID;

				public String getCREATEUSERID () {
					return this.CREATEUSERID;
				}

				public Boolean CREATEUSERIDIsNullable(){
				    return false;
				}
				public Boolean CREATEUSERIDIsKey(){
				    return false;
				}
				public Integer CREATEUSERIDLength(){
				    return null;
				}
				public Integer CREATEUSERIDPrecision(){
				    return null;
				}
				public String CREATEUSERIDDefault(){
				
					return "";
				
				}
				public String CREATEUSERIDComment(){
				
				    return "";
				
				}
				public String CREATEUSERIDPattern(){
				
					return "";
				
				}
				public String CREATEUSERIDOriginalDbColumnName(){
				
					return "CREATEUSERID";
				
				}

				
			    public String MODIFYUSERID;

				public String getMODIFYUSERID () {
					return this.MODIFYUSERID;
				}

				public Boolean MODIFYUSERIDIsNullable(){
				    return false;
				}
				public Boolean MODIFYUSERIDIsKey(){
				    return false;
				}
				public Integer MODIFYUSERIDLength(){
				    return null;
				}
				public Integer MODIFYUSERIDPrecision(){
				    return null;
				}
				public String MODIFYUSERIDDefault(){
				
					return "";
				
				}
				public String MODIFYUSERIDComment(){
				
				    return "";
				
				}
				public String MODIFYUSERIDPattern(){
				
					return "";
				
				}
				public String MODIFYUSERIDOriginalDbColumnName(){
				
					return "MODIFYUSERID";
				
				}

				
			    public String CREATEPROGID;

				public String getCREATEPROGID () {
					return this.CREATEPROGID;
				}

				public Boolean CREATEPROGIDIsNullable(){
				    return false;
				}
				public Boolean CREATEPROGIDIsKey(){
				    return false;
				}
				public Integer CREATEPROGIDLength(){
				    return null;
				}
				public Integer CREATEPROGIDPrecision(){
				    return null;
				}
				public String CREATEPROGIDDefault(){
				
					return "";
				
				}
				public String CREATEPROGIDComment(){
				
				    return "";
				
				}
				public String CREATEPROGIDPattern(){
				
					return "";
				
				}
				public String CREATEPROGIDOriginalDbColumnName(){
				
					return "CREATEPROGID";
				
				}

				
			    public String MODIFYPROGID;

				public String getMODIFYPROGID () {
					return this.MODIFYPROGID;
				}

				public Boolean MODIFYPROGIDIsNullable(){
				    return false;
				}
				public Boolean MODIFYPROGIDIsKey(){
				    return false;
				}
				public Integer MODIFYPROGIDLength(){
				    return null;
				}
				public Integer MODIFYPROGIDPrecision(){
				    return null;
				}
				public String MODIFYPROGIDDefault(){
				
					return "";
				
				}
				public String MODIFYPROGIDComment(){
				
				    return "";
				
				}
				public String MODIFYPROGIDPattern(){
				
					return "";
				
				}
				public String MODIFYPROGIDOriginalDbColumnName(){
				
					return "MODIFYPROGID";
				
				}

				
			    public BigDecimal LOCKID;

				public BigDecimal getLOCKID () {
					return this.LOCKID;
				}

				public Boolean LOCKIDIsNullable(){
				    return false;
				}
				public Boolean LOCKIDIsKey(){
				    return false;
				}
				public Integer LOCKIDLength(){
				    return null;
				}
				public Integer LOCKIDPrecision(){
				    return null;
				}
				public String LOCKIDDefault(){
				
					return "";
				
				}
				public String LOCKIDComment(){
				
				    return "";
				
				}
				public String LOCKIDPattern(){
				
					return "";
				
				}
				public String LOCKIDOriginalDbColumnName(){
				
					return "LOCKID";
				
				}

				
			    public String DEPARTMENT_CODE;

				public String getDEPARTMENT_CODE () {
					return this.DEPARTMENT_CODE;
				}

				public Boolean DEPARTMENT_CODEIsNullable(){
				    return true;
				}
				public Boolean DEPARTMENT_CODEIsKey(){
				    return false;
				}
				public Integer DEPARTMENT_CODELength(){
				    return null;
				}
				public Integer DEPARTMENT_CODEPrecision(){
				    return null;
				}
				public String DEPARTMENT_CODEDefault(){
				
					return "";
				
				}
				public String DEPARTMENT_CODEComment(){
				
				    return "";
				
				}
				public String DEPARTMENT_CODEPattern(){
				
					return "";
				
				}
				public String DEPARTMENT_CODEOriginalDbColumnName(){
				
					return "DEPARTMENT_CODE";
				
				}

				
			    public String BUYER_USER_ID;

				public String getBUYER_USER_ID () {
					return this.BUYER_USER_ID;
				}

				public Boolean BUYER_USER_IDIsNullable(){
				    return true;
				}
				public Boolean BUYER_USER_IDIsKey(){
				    return false;
				}
				public Integer BUYER_USER_IDLength(){
				    return null;
				}
				public Integer BUYER_USER_IDPrecision(){
				    return null;
				}
				public String BUYER_USER_IDDefault(){
				
					return "";
				
				}
				public String BUYER_USER_IDComment(){
				
				    return "";
				
				}
				public String BUYER_USER_IDPattern(){
				
					return "";
				
				}
				public String BUYER_USER_IDOriginalDbColumnName(){
				
					return "BUYER_USER_ID";
				
				}

				
			    public String RECREATE_AUTHORIZATIONS;

				public String getRECREATE_AUTHORIZATIONS () {
					return this.RECREATE_AUTHORIZATIONS;
				}

				public Boolean RECREATE_AUTHORIZATIONSIsNullable(){
				    return true;
				}
				public Boolean RECREATE_AUTHORIZATIONSIsKey(){
				    return false;
				}
				public Integer RECREATE_AUTHORIZATIONSLength(){
				    return null;
				}
				public Integer RECREATE_AUTHORIZATIONSPrecision(){
				    return null;
				}
				public String RECREATE_AUTHORIZATIONSDefault(){
				
					return "";
				
				}
				public String RECREATE_AUTHORIZATIONSComment(){
				
				    return "";
				
				}
				public String RECREATE_AUTHORIZATIONSPattern(){
				
					return "";
				
				}
				public String RECREATE_AUTHORIZATIONSOriginalDbColumnName(){
				
					return "RECREATE_AUTHORIZATIONS";
				
				}

				
			    public String CUSTOMER_CONTACT_ID;

				public String getCUSTOMER_CONTACT_ID () {
					return this.CUSTOMER_CONTACT_ID;
				}

				public Boolean CUSTOMER_CONTACT_IDIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_CONTACT_IDIsKey(){
				    return false;
				}
				public Integer CUSTOMER_CONTACT_IDLength(){
				    return null;
				}
				public Integer CUSTOMER_CONTACT_IDPrecision(){
				    return null;
				}
				public String CUSTOMER_CONTACT_IDDefault(){
				
					return "";
				
				}
				public String CUSTOMER_CONTACT_IDComment(){
				
				    return "";
				
				}
				public String CUSTOMER_CONTACT_IDPattern(){
				
					return "";
				
				}
				public String CUSTOMER_CONTACT_IDOriginalDbColumnName(){
				
					return "CUSTOMER_CONTACT_ID";
				
				}

				
			    public String OPPORTUNITY_KEY;

				public String getOPPORTUNITY_KEY () {
					return this.OPPORTUNITY_KEY;
				}

				public Boolean OPPORTUNITY_KEYIsNullable(){
				    return true;
				}
				public Boolean OPPORTUNITY_KEYIsKey(){
				    return false;
				}
				public Integer OPPORTUNITY_KEYLength(){
				    return null;
				}
				public Integer OPPORTUNITY_KEYPrecision(){
				    return null;
				}
				public String OPPORTUNITY_KEYDefault(){
				
					return "";
				
				}
				public String OPPORTUNITY_KEYComment(){
				
				    return "";
				
				}
				public String OPPORTUNITY_KEYPattern(){
				
					return "";
				
				}
				public String OPPORTUNITY_KEYOriginalDbColumnName(){
				
					return "OPPORTUNITY_KEY";
				
				}

				
			    public String IS_EXPIRATION_DATE_OVERRIDDEN;

				public String getIS_EXPIRATION_DATE_OVERRIDDEN () {
					return this.IS_EXPIRATION_DATE_OVERRIDDEN;
				}

				public Boolean IS_EXPIRATION_DATE_OVERRIDDENIsNullable(){
				    return true;
				}
				public Boolean IS_EXPIRATION_DATE_OVERRIDDENIsKey(){
				    return false;
				}
				public Integer IS_EXPIRATION_DATE_OVERRIDDENLength(){
				    return null;
				}
				public Integer IS_EXPIRATION_DATE_OVERRIDDENPrecision(){
				    return null;
				}
				public String IS_EXPIRATION_DATE_OVERRIDDENDefault(){
				
					return "";
				
				}
				public String IS_EXPIRATION_DATE_OVERRIDDENComment(){
				
				    return "";
				
				}
				public String IS_EXPIRATION_DATE_OVERRIDDENPattern(){
				
					return "";
				
				}
				public String IS_EXPIRATION_DATE_OVERRIDDENOriginalDbColumnName(){
				
					return "IS_EXPIRATION_DATE_OVERRIDDEN";
				
				}

				
			    public java.util.Date EXPIRATION_DATE;

				public java.util.Date getEXPIRATION_DATE () {
					return this.EXPIRATION_DATE;
				}

				public Boolean EXPIRATION_DATEIsNullable(){
				    return true;
				}
				public Boolean EXPIRATION_DATEIsKey(){
				    return false;
				}
				public Integer EXPIRATION_DATELength(){
				    return null;
				}
				public Integer EXPIRATION_DATEPrecision(){
				    return null;
				}
				public String EXPIRATION_DATEDefault(){
				
					return "";
				
				}
				public String EXPIRATION_DATEComment(){
				
				    return "";
				
				}
				public String EXPIRATION_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXPIRATION_DATEOriginalDbColumnName(){
				
					return "EXPIRATION_DATE";
				
				}

				
			    public String APPROVAL_CYCLE;

				public String getAPPROVAL_CYCLE () {
					return this.APPROVAL_CYCLE;
				}

				public Boolean APPROVAL_CYCLEIsNullable(){
				    return true;
				}
				public Boolean APPROVAL_CYCLEIsKey(){
				    return false;
				}
				public Integer APPROVAL_CYCLELength(){
				    return null;
				}
				public Integer APPROVAL_CYCLEPrecision(){
				    return null;
				}
				public String APPROVAL_CYCLEDefault(){
				
					return "";
				
				}
				public String APPROVAL_CYCLEComment(){
				
				    return "";
				
				}
				public String APPROVAL_CYCLEPattern(){
				
					return "";
				
				}
				public String APPROVAL_CYCLEOriginalDbColumnName(){
				
					return "APPROVAL_CYCLE";
				
				}

				
			    public String IN_STORE_PAYMENT_REQUIRED;

				public String getIN_STORE_PAYMENT_REQUIRED () {
					return this.IN_STORE_PAYMENT_REQUIRED;
				}

				public Boolean IN_STORE_PAYMENT_REQUIREDIsNullable(){
				    return true;
				}
				public Boolean IN_STORE_PAYMENT_REQUIREDIsKey(){
				    return false;
				}
				public Integer IN_STORE_PAYMENT_REQUIREDLength(){
				    return null;
				}
				public Integer IN_STORE_PAYMENT_REQUIREDPrecision(){
				    return null;
				}
				public String IN_STORE_PAYMENT_REQUIREDDefault(){
				
					return "";
				
				}
				public String IN_STORE_PAYMENT_REQUIREDComment(){
				
				    return "";
				
				}
				public String IN_STORE_PAYMENT_REQUIREDPattern(){
				
					return "";
				
				}
				public String IN_STORE_PAYMENT_REQUIREDOriginalDbColumnName(){
				
					return "IN_STORE_PAYMENT_REQUIRED";
				
				}

				
			    public BigDecimal IMMEDIATE_SETTLEMENT_VALUE;

				public BigDecimal getIMMEDIATE_SETTLEMENT_VALUE () {
					return this.IMMEDIATE_SETTLEMENT_VALUE;
				}

				public Boolean IMMEDIATE_SETTLEMENT_VALUEIsNullable(){
				    return true;
				}
				public Boolean IMMEDIATE_SETTLEMENT_VALUEIsKey(){
				    return false;
				}
				public Integer IMMEDIATE_SETTLEMENT_VALUELength(){
				    return null;
				}
				public Integer IMMEDIATE_SETTLEMENT_VALUEPrecision(){
				    return null;
				}
				public String IMMEDIATE_SETTLEMENT_VALUEDefault(){
				
					return "";
				
				}
				public String IMMEDIATE_SETTLEMENT_VALUEComment(){
				
				    return "";
				
				}
				public String IMMEDIATE_SETTLEMENT_VALUEPattern(){
				
					return "";
				
				}
				public String IMMEDIATE_SETTLEMENT_VALUEOriginalDbColumnName(){
				
					return "IMMEDIATE_SETTLEMENT_VALUE";
				
				}

				
			    public BigDecimal CUSTOMER_AGE;

				public BigDecimal getCUSTOMER_AGE () {
					return this.CUSTOMER_AGE;
				}

				public Boolean CUSTOMER_AGEIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_AGEIsKey(){
				    return false;
				}
				public Integer CUSTOMER_AGELength(){
				    return null;
				}
				public Integer CUSTOMER_AGEPrecision(){
				    return null;
				}
				public String CUSTOMER_AGEDefault(){
				
					return "";
				
				}
				public String CUSTOMER_AGEComment(){
				
				    return "";
				
				}
				public String CUSTOMER_AGEPattern(){
				
					return "";
				
				}
				public String CUSTOMER_AGEOriginalDbColumnName(){
				
					return "CUSTOMER_AGE";
				
				}

				
			    public String ALL_ADDRESSES_VERIFIED;

				public String getALL_ADDRESSES_VERIFIED () {
					return this.ALL_ADDRESSES_VERIFIED;
				}

				public Boolean ALL_ADDRESSES_VERIFIEDIsNullable(){
				    return true;
				}
				public Boolean ALL_ADDRESSES_VERIFIEDIsKey(){
				    return false;
				}
				public Integer ALL_ADDRESSES_VERIFIEDLength(){
				    return null;
				}
				public Integer ALL_ADDRESSES_VERIFIEDPrecision(){
				    return null;
				}
				public String ALL_ADDRESSES_VERIFIEDDefault(){
				
					return "";
				
				}
				public String ALL_ADDRESSES_VERIFIEDComment(){
				
				    return "";
				
				}
				public String ALL_ADDRESSES_VERIFIEDPattern(){
				
					return "";
				
				}
				public String ALL_ADDRESSES_VERIFIEDOriginalDbColumnName(){
				
					return "ALL_ADDRESSES_VERIFIED";
				
				}

				
			    public BigDecimal COMPL_GIFT_BOX_QTY;

				public BigDecimal getCOMPL_GIFT_BOX_QTY () {
					return this.COMPL_GIFT_BOX_QTY;
				}

				public Boolean COMPL_GIFT_BOX_QTYIsNullable(){
				    return true;
				}
				public Boolean COMPL_GIFT_BOX_QTYIsKey(){
				    return false;
				}
				public Integer COMPL_GIFT_BOX_QTYLength(){
				    return null;
				}
				public Integer COMPL_GIFT_BOX_QTYPrecision(){
				    return null;
				}
				public String COMPL_GIFT_BOX_QTYDefault(){
				
					return "";
				
				}
				public String COMPL_GIFT_BOX_QTYComment(){
				
				    return "";
				
				}
				public String COMPL_GIFT_BOX_QTYPattern(){
				
					return "";
				
				}
				public String COMPL_GIFT_BOX_QTYOriginalDbColumnName(){
				
					return "COMPL_GIFT_BOX_QTY";
				
				}

				
			    public BigDecimal NO_OF_AUTH_STRIKES;

				public BigDecimal getNO_OF_AUTH_STRIKES () {
					return this.NO_OF_AUTH_STRIKES;
				}

				public Boolean NO_OF_AUTH_STRIKESIsNullable(){
				    return true;
				}
				public Boolean NO_OF_AUTH_STRIKESIsKey(){
				    return false;
				}
				public Integer NO_OF_AUTH_STRIKESLength(){
				    return null;
				}
				public Integer NO_OF_AUTH_STRIKESPrecision(){
				    return null;
				}
				public String NO_OF_AUTH_STRIKESDefault(){
				
					return "";
				
				}
				public String NO_OF_AUTH_STRIKESComment(){
				
				    return "";
				
				}
				public String NO_OF_AUTH_STRIKESPattern(){
				
					return "";
				
				}
				public String NO_OF_AUTH_STRIKESOriginalDbColumnName(){
				
					return "NO_OF_AUTH_STRIKES";
				
				}

				
			    public String SOURCE_IP_ADDRESS;

				public String getSOURCE_IP_ADDRESS () {
					return this.SOURCE_IP_ADDRESS;
				}

				public Boolean SOURCE_IP_ADDRESSIsNullable(){
				    return true;
				}
				public Boolean SOURCE_IP_ADDRESSIsKey(){
				    return false;
				}
				public Integer SOURCE_IP_ADDRESSLength(){
				    return null;
				}
				public Integer SOURCE_IP_ADDRESSPrecision(){
				    return null;
				}
				public String SOURCE_IP_ADDRESSDefault(){
				
					return "";
				
				}
				public String SOURCE_IP_ADDRESSComment(){
				
				    return "";
				
				}
				public String SOURCE_IP_ADDRESSPattern(){
				
					return "";
				
				}
				public String SOURCE_IP_ADDRESSOriginalDbColumnName(){
				
					return "SOURCE_IP_ADDRESS";
				
				}

				
			    public String CUSTOMER_FIRST_NAME;

				public String getCUSTOMER_FIRST_NAME () {
					return this.CUSTOMER_FIRST_NAME;
				}

				public Boolean CUSTOMER_FIRST_NAMEIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_FIRST_NAMEIsKey(){
				    return false;
				}
				public Integer CUSTOMER_FIRST_NAMELength(){
				    return null;
				}
				public Integer CUSTOMER_FIRST_NAMEPrecision(){
				    return null;
				}
				public String CUSTOMER_FIRST_NAMEDefault(){
				
					return "";
				
				}
				public String CUSTOMER_FIRST_NAMEComment(){
				
				    return "";
				
				}
				public String CUSTOMER_FIRST_NAMEPattern(){
				
					return "";
				
				}
				public String CUSTOMER_FIRST_NAMEOriginalDbColumnName(){
				
					return "CUSTOMER_FIRST_NAME";
				
				}

				
			    public String CUSTOMER_LAST_NAME;

				public String getCUSTOMER_LAST_NAME () {
					return this.CUSTOMER_LAST_NAME;
				}

				public Boolean CUSTOMER_LAST_NAMEIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_LAST_NAMEIsKey(){
				    return false;
				}
				public Integer CUSTOMER_LAST_NAMELength(){
				    return null;
				}
				public Integer CUSTOMER_LAST_NAMEPrecision(){
				    return null;
				}
				public String CUSTOMER_LAST_NAMEDefault(){
				
					return "";
				
				}
				public String CUSTOMER_LAST_NAMEComment(){
				
				    return "";
				
				}
				public String CUSTOMER_LAST_NAMEPattern(){
				
					return "";
				
				}
				public String CUSTOMER_LAST_NAMEOriginalDbColumnName(){
				
					return "CUSTOMER_LAST_NAME";
				
				}

				
			    public String CUSTOMER_PHONE_NO;

				public String getCUSTOMER_PHONE_NO () {
					return this.CUSTOMER_PHONE_NO;
				}

				public Boolean CUSTOMER_PHONE_NOIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_PHONE_NOIsKey(){
				    return false;
				}
				public Integer CUSTOMER_PHONE_NOLength(){
				    return null;
				}
				public Integer CUSTOMER_PHONE_NOPrecision(){
				    return null;
				}
				public String CUSTOMER_PHONE_NODefault(){
				
					return "";
				
				}
				public String CUSTOMER_PHONE_NOComment(){
				
				    return "";
				
				}
				public String CUSTOMER_PHONE_NOPattern(){
				
					return "";
				
				}
				public String CUSTOMER_PHONE_NOOriginalDbColumnName(){
				
					return "CUSTOMER_PHONE_NO";
				
				}

				
			    public String CUSTOMER_ZIP_CODE;

				public String getCUSTOMER_ZIP_CODE () {
					return this.CUSTOMER_ZIP_CODE;
				}

				public Boolean CUSTOMER_ZIP_CODEIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_ZIP_CODEIsKey(){
				    return false;
				}
				public Integer CUSTOMER_ZIP_CODELength(){
				    return null;
				}
				public Integer CUSTOMER_ZIP_CODEPrecision(){
				    return null;
				}
				public String CUSTOMER_ZIP_CODEDefault(){
				
					return "";
				
				}
				public String CUSTOMER_ZIP_CODEComment(){
				
				    return "";
				
				}
				public String CUSTOMER_ZIP_CODEPattern(){
				
					return "";
				
				}
				public String CUSTOMER_ZIP_CODEOriginalDbColumnName(){
				
					return "CUSTOMER_ZIP_CODE";
				
				}

				
			    public BigDecimal INDEX_VERSION;

				public BigDecimal getINDEX_VERSION () {
					return this.INDEX_VERSION;
				}

				public Boolean INDEX_VERSIONIsNullable(){
				    return true;
				}
				public Boolean INDEX_VERSIONIsKey(){
				    return false;
				}
				public Integer INDEX_VERSIONLength(){
				    return null;
				}
				public Integer INDEX_VERSIONPrecision(){
				    return null;
				}
				public String INDEX_VERSIONDefault(){
				
					return "";
				
				}
				public String INDEX_VERSIONComment(){
				
				    return "";
				
				}
				public String INDEX_VERSIONPattern(){
				
					return "";
				
				}
				public String INDEX_VERSIONOriginalDbColumnName(){
				
					return "INDEX_VERSION";
				
				}

				
			    public String EXTN_TOTAL_PRICE;

				public String getEXTN_TOTAL_PRICE () {
					return this.EXTN_TOTAL_PRICE;
				}

				public Boolean EXTN_TOTAL_PRICEIsNullable(){
				    return true;
				}
				public Boolean EXTN_TOTAL_PRICEIsKey(){
				    return false;
				}
				public Integer EXTN_TOTAL_PRICELength(){
				    return null;
				}
				public Integer EXTN_TOTAL_PRICEPrecision(){
				    return null;
				}
				public String EXTN_TOTAL_PRICEDefault(){
				
					return "";
				
				}
				public String EXTN_TOTAL_PRICEComment(){
				
				    return "";
				
				}
				public String EXTN_TOTAL_PRICEPattern(){
				
					return "";
				
				}
				public String EXTN_TOTAL_PRICEOriginalDbColumnName(){
				
					return "EXTN_TOTAL_PRICE";
				
				}

				
			    public String CUSTOMER_EMAILID_LC;

				public String getCUSTOMER_EMAILID_LC () {
					return this.CUSTOMER_EMAILID_LC;
				}

				public Boolean CUSTOMER_EMAILID_LCIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_EMAILID_LCIsKey(){
				    return false;
				}
				public Integer CUSTOMER_EMAILID_LCLength(){
				    return null;
				}
				public Integer CUSTOMER_EMAILID_LCPrecision(){
				    return null;
				}
				public String CUSTOMER_EMAILID_LCDefault(){
				
					return "";
				
				}
				public String CUSTOMER_EMAILID_LCComment(){
				
				    return "";
				
				}
				public String CUSTOMER_EMAILID_LCPattern(){
				
					return "";
				
				}
				public String CUSTOMER_EMAILID_LCOriginalDbColumnName(){
				
					return "CUSTOMER_EMAILID_LC";
				
				}

				
			    public String CUSTOMER_FIRST_NAME_LC;

				public String getCUSTOMER_FIRST_NAME_LC () {
					return this.CUSTOMER_FIRST_NAME_LC;
				}

				public Boolean CUSTOMER_FIRST_NAME_LCIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_FIRST_NAME_LCIsKey(){
				    return false;
				}
				public Integer CUSTOMER_FIRST_NAME_LCLength(){
				    return null;
				}
				public Integer CUSTOMER_FIRST_NAME_LCPrecision(){
				    return null;
				}
				public String CUSTOMER_FIRST_NAME_LCDefault(){
				
					return "";
				
				}
				public String CUSTOMER_FIRST_NAME_LCComment(){
				
				    return "";
				
				}
				public String CUSTOMER_FIRST_NAME_LCPattern(){
				
					return "";
				
				}
				public String CUSTOMER_FIRST_NAME_LCOriginalDbColumnName(){
				
					return "CUSTOMER_FIRST_NAME_LC";
				
				}

				
			    public String CUSTOMER_LAST_NAME_LC;

				public String getCUSTOMER_LAST_NAME_LC () {
					return this.CUSTOMER_LAST_NAME_LC;
				}

				public Boolean CUSTOMER_LAST_NAME_LCIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_LAST_NAME_LCIsKey(){
				    return false;
				}
				public Integer CUSTOMER_LAST_NAME_LCLength(){
				    return null;
				}
				public Integer CUSTOMER_LAST_NAME_LCPrecision(){
				    return null;
				}
				public String CUSTOMER_LAST_NAME_LCDefault(){
				
					return "";
				
				}
				public String CUSTOMER_LAST_NAME_LCComment(){
				
				    return "";
				
				}
				public String CUSTOMER_LAST_NAME_LCPattern(){
				
					return "";
				
				}
				public String CUSTOMER_LAST_NAME_LCOriginalDbColumnName(){
				
					return "CUSTOMER_LAST_NAME_LC";
				
				}

				
			    public String CUSTOMER_ZIP_CODE_LC;

				public String getCUSTOMER_ZIP_CODE_LC () {
					return this.CUSTOMER_ZIP_CODE_LC;
				}

				public Boolean CUSTOMER_ZIP_CODE_LCIsNullable(){
				    return true;
				}
				public Boolean CUSTOMER_ZIP_CODE_LCIsKey(){
				    return false;
				}
				public Integer CUSTOMER_ZIP_CODE_LCLength(){
				    return null;
				}
				public Integer CUSTOMER_ZIP_CODE_LCPrecision(){
				    return null;
				}
				public String CUSTOMER_ZIP_CODE_LCDefault(){
				
					return "";
				
				}
				public String CUSTOMER_ZIP_CODE_LCComment(){
				
				    return "";
				
				}
				public String CUSTOMER_ZIP_CODE_LCPattern(){
				
					return "";
				
				}
				public String CUSTOMER_ZIP_CODE_LCOriginalDbColumnName(){
				
					return "CUSTOMER_ZIP_CODE_LC";
				
				}

				
			    public String ORDER_NAME_LC;

				public String getORDER_NAME_LC () {
					return this.ORDER_NAME_LC;
				}

				public Boolean ORDER_NAME_LCIsNullable(){
				    return true;
				}
				public Boolean ORDER_NAME_LCIsKey(){
				    return false;
				}
				public Integer ORDER_NAME_LCLength(){
				    return null;
				}
				public Integer ORDER_NAME_LCPrecision(){
				    return null;
				}
				public String ORDER_NAME_LCDefault(){
				
					return "";
				
				}
				public String ORDER_NAME_LCComment(){
				
				    return "";
				
				}
				public String ORDER_NAME_LCPattern(){
				
					return "";
				
				}
				public String ORDER_NAME_LCOriginalDbColumnName(){
				
					return "ORDER_NAME_LC";
				
				}

				
			    public String EXTN_POINTS_EARNED;

				public String getEXTN_POINTS_EARNED () {
					return this.EXTN_POINTS_EARNED;
				}

				public Boolean EXTN_POINTS_EARNEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_POINTS_EARNEDIsKey(){
				    return false;
				}
				public Integer EXTN_POINTS_EARNEDLength(){
				    return null;
				}
				public Integer EXTN_POINTS_EARNEDPrecision(){
				    return null;
				}
				public String EXTN_POINTS_EARNEDDefault(){
				
					return "";
				
				}
				public String EXTN_POINTS_EARNEDComment(){
				
				    return "";
				
				}
				public String EXTN_POINTS_EARNEDPattern(){
				
					return "";
				
				}
				public String EXTN_POINTS_EARNEDOriginalDbColumnName(){
				
					return "EXTN_POINTS_EARNED";
				
				}

				
			    public String EXTN_TOTAL_POINTS_EARNED;

				public String getEXTN_TOTAL_POINTS_EARNED () {
					return this.EXTN_TOTAL_POINTS_EARNED;
				}

				public Boolean EXTN_TOTAL_POINTS_EARNEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_TOTAL_POINTS_EARNEDIsKey(){
				    return false;
				}
				public Integer EXTN_TOTAL_POINTS_EARNEDLength(){
				    return null;
				}
				public Integer EXTN_TOTAL_POINTS_EARNEDPrecision(){
				    return null;
				}
				public String EXTN_TOTAL_POINTS_EARNEDDefault(){
				
					return "";
				
				}
				public String EXTN_TOTAL_POINTS_EARNEDComment(){
				
				    return "";
				
				}
				public String EXTN_TOTAL_POINTS_EARNEDPattern(){
				
					return "";
				
				}
				public String EXTN_TOTAL_POINTS_EARNEDOriginalDbColumnName(){
				
					return "EXTN_TOTAL_POINTS_EARNED";
				
				}

				
			    public String EXTN_IS_TAX_CALCULATED;

				public String getEXTN_IS_TAX_CALCULATED () {
					return this.EXTN_IS_TAX_CALCULATED;
				}

				public Boolean EXTN_IS_TAX_CALCULATEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_TAX_CALCULATEDIsKey(){
				    return false;
				}
				public Integer EXTN_IS_TAX_CALCULATEDLength(){
				    return null;
				}
				public Integer EXTN_IS_TAX_CALCULATEDPrecision(){
				    return null;
				}
				public String EXTN_IS_TAX_CALCULATEDDefault(){
				
					return "";
				
				}
				public String EXTN_IS_TAX_CALCULATEDComment(){
				
				    return "";
				
				}
				public String EXTN_IS_TAX_CALCULATEDPattern(){
				
					return "";
				
				}
				public String EXTN_IS_TAX_CALCULATEDOriginalDbColumnName(){
				
					return "EXTN_IS_TAX_CALCULATED";
				
				}

				
			    public String EXTN_VERTEX_ENGINE;

				public String getEXTN_VERTEX_ENGINE () {
					return this.EXTN_VERTEX_ENGINE;
				}

				public Boolean EXTN_VERTEX_ENGINEIsNullable(){
				    return true;
				}
				public Boolean EXTN_VERTEX_ENGINEIsKey(){
				    return false;
				}
				public Integer EXTN_VERTEX_ENGINELength(){
				    return null;
				}
				public Integer EXTN_VERTEX_ENGINEPrecision(){
				    return null;
				}
				public String EXTN_VERTEX_ENGINEDefault(){
				
					return "";
				
				}
				public String EXTN_VERTEX_ENGINEComment(){
				
				    return "";
				
				}
				public String EXTN_VERTEX_ENGINEPattern(){
				
					return "";
				
				}
				public String EXTN_VERTEX_ENGINEOriginalDbColumnName(){
				
					return "EXTN_VERTEX_ENGINE";
				
				}

				
			    public String EXTN_EVENT_TIME_STAMP;

				public String getEXTN_EVENT_TIME_STAMP () {
					return this.EXTN_EVENT_TIME_STAMP;
				}

				public Boolean EXTN_EVENT_TIME_STAMPIsNullable(){
				    return true;
				}
				public Boolean EXTN_EVENT_TIME_STAMPIsKey(){
				    return false;
				}
				public Integer EXTN_EVENT_TIME_STAMPLength(){
				    return null;
				}
				public Integer EXTN_EVENT_TIME_STAMPPrecision(){
				    return null;
				}
				public String EXTN_EVENT_TIME_STAMPDefault(){
				
					return "";
				
				}
				public String EXTN_EVENT_TIME_STAMPComment(){
				
				    return "";
				
				}
				public String EXTN_EVENT_TIME_STAMPPattern(){
				
					return "";
				
				}
				public String EXTN_EVENT_TIME_STAMPOriginalDbColumnName(){
				
					return "EXTN_EVENT_TIME_STAMP";
				
				}

				
			    public String EXTN_FULFILLMENT_ID;

				public String getEXTN_FULFILLMENT_ID () {
					return this.EXTN_FULFILLMENT_ID;
				}

				public Boolean EXTN_FULFILLMENT_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_FULFILLMENT_IDIsKey(){
				    return false;
				}
				public Integer EXTN_FULFILLMENT_IDLength(){
				    return null;
				}
				public Integer EXTN_FULFILLMENT_IDPrecision(){
				    return null;
				}
				public String EXTN_FULFILLMENT_IDDefault(){
				
					return "";
				
				}
				public String EXTN_FULFILLMENT_IDComment(){
				
				    return "";
				
				}
				public String EXTN_FULFILLMENT_IDPattern(){
				
					return "";
				
				}
				public String EXTN_FULFILLMENT_IDOriginalDbColumnName(){
				
					return "EXTN_FULFILLMENT_ID";
				
				}

				
			    public String EXTN_ORDER_TYPE;

				public String getEXTN_ORDER_TYPE () {
					return this.EXTN_ORDER_TYPE;
				}

				public Boolean EXTN_ORDER_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDER_TYPEIsKey(){
				    return false;
				}
				public Integer EXTN_ORDER_TYPELength(){
				    return null;
				}
				public Integer EXTN_ORDER_TYPEPrecision(){
				    return null;
				}
				public String EXTN_ORDER_TYPEDefault(){
				
					return "";
				
				}
				public String EXTN_ORDER_TYPEComment(){
				
				    return "";
				
				}
				public String EXTN_ORDER_TYPEPattern(){
				
					return "";
				
				}
				public String EXTN_ORDER_TYPEOriginalDbColumnName(){
				
					return "EXTN_ORDER_TYPE";
				
				}

				
			    public String EXTN_FIRST_NAME;

				public String getEXTN_FIRST_NAME () {
					return this.EXTN_FIRST_NAME;
				}

				public Boolean EXTN_FIRST_NAMEIsNullable(){
				    return true;
				}
				public Boolean EXTN_FIRST_NAMEIsKey(){
				    return false;
				}
				public Integer EXTN_FIRST_NAMELength(){
				    return null;
				}
				public Integer EXTN_FIRST_NAMEPrecision(){
				    return null;
				}
				public String EXTN_FIRST_NAMEDefault(){
				
					return "";
				
				}
				public String EXTN_FIRST_NAMEComment(){
				
				    return "";
				
				}
				public String EXTN_FIRST_NAMEPattern(){
				
					return "";
				
				}
				public String EXTN_FIRST_NAMEOriginalDbColumnName(){
				
					return "EXTN_FIRST_NAME";
				
				}

				
			    public String EXTN_EMP_LAST_NAME1;

				public String getEXTN_EMP_LAST_NAME1 () {
					return this.EXTN_EMP_LAST_NAME1;
				}

				public Boolean EXTN_EMP_LAST_NAME1IsNullable(){
				    return true;
				}
				public Boolean EXTN_EMP_LAST_NAME1IsKey(){
				    return false;
				}
				public Integer EXTN_EMP_LAST_NAME1Length(){
				    return null;
				}
				public Integer EXTN_EMP_LAST_NAME1Precision(){
				    return null;
				}
				public String EXTN_EMP_LAST_NAME1Default(){
				
					return "";
				
				}
				public String EXTN_EMP_LAST_NAME1Comment(){
				
				    return "";
				
				}
				public String EXTN_EMP_LAST_NAME1Pattern(){
				
					return "";
				
				}
				public String EXTN_EMP_LAST_NAME1OriginalDbColumnName(){
				
					return "EXTN_EMP_LAST_NAME1";
				
				}

				
			    public String EXTN_EMP_LAST_NAME2;

				public String getEXTN_EMP_LAST_NAME2 () {
					return this.EXTN_EMP_LAST_NAME2;
				}

				public Boolean EXTN_EMP_LAST_NAME2IsNullable(){
				    return true;
				}
				public Boolean EXTN_EMP_LAST_NAME2IsKey(){
				    return false;
				}
				public Integer EXTN_EMP_LAST_NAME2Length(){
				    return null;
				}
				public Integer EXTN_EMP_LAST_NAME2Precision(){
				    return null;
				}
				public String EXTN_EMP_LAST_NAME2Default(){
				
					return "";
				
				}
				public String EXTN_EMP_LAST_NAME2Comment(){
				
				    return "";
				
				}
				public String EXTN_EMP_LAST_NAME2Pattern(){
				
					return "";
				
				}
				public String EXTN_EMP_LAST_NAME2OriginalDbColumnName(){
				
					return "EXTN_EMP_LAST_NAME2";
				
				}

				
			    public String EXTN_EMP_DISC_LEVEL;

				public String getEXTN_EMP_DISC_LEVEL () {
					return this.EXTN_EMP_DISC_LEVEL;
				}

				public Boolean EXTN_EMP_DISC_LEVELIsNullable(){
				    return true;
				}
				public Boolean EXTN_EMP_DISC_LEVELIsKey(){
				    return false;
				}
				public Integer EXTN_EMP_DISC_LEVELLength(){
				    return null;
				}
				public Integer EXTN_EMP_DISC_LEVELPrecision(){
				    return null;
				}
				public String EXTN_EMP_DISC_LEVELDefault(){
				
					return "";
				
				}
				public String EXTN_EMP_DISC_LEVELComment(){
				
				    return "";
				
				}
				public String EXTN_EMP_DISC_LEVELPattern(){
				
					return "";
				
				}
				public String EXTN_EMP_DISC_LEVELOriginalDbColumnName(){
				
					return "EXTN_EMP_DISC_LEVEL";
				
				}

				
			    public String EXTN_EMPLOYEE_ID;

				public String getEXTN_EMPLOYEE_ID () {
					return this.EXTN_EMPLOYEE_ID;
				}

				public Boolean EXTN_EMPLOYEE_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_EMPLOYEE_IDIsKey(){
				    return false;
				}
				public Integer EXTN_EMPLOYEE_IDLength(){
				    return null;
				}
				public Integer EXTN_EMPLOYEE_IDPrecision(){
				    return null;
				}
				public String EXTN_EMPLOYEE_IDDefault(){
				
					return "";
				
				}
				public String EXTN_EMPLOYEE_IDComment(){
				
				    return "";
				
				}
				public String EXTN_EMPLOYEE_IDPattern(){
				
					return "";
				
				}
				public String EXTN_EMPLOYEE_IDOriginalDbColumnName(){
				
					return "EXTN_EMPLOYEE_ID";
				
				}

				
			    public BigDecimal EXTN_ATTR_SEQ;

				public BigDecimal getEXTN_ATTR_SEQ () {
					return this.EXTN_ATTR_SEQ;
				}

				public Boolean EXTN_ATTR_SEQIsNullable(){
				    return true;
				}
				public Boolean EXTN_ATTR_SEQIsKey(){
				    return false;
				}
				public Integer EXTN_ATTR_SEQLength(){
				    return null;
				}
				public Integer EXTN_ATTR_SEQPrecision(){
				    return null;
				}
				public String EXTN_ATTR_SEQDefault(){
				
					return "";
				
				}
				public String EXTN_ATTR_SEQComment(){
				
				    return "";
				
				}
				public String EXTN_ATTR_SEQPattern(){
				
					return "";
				
				}
				public String EXTN_ATTR_SEQOriginalDbColumnName(){
				
					return "EXTN_ATTR_SEQ";
				
				}

				
			    public String ORDER_NO_LC;

				public String getORDER_NO_LC () {
					return this.ORDER_NO_LC;
				}

				public Boolean ORDER_NO_LCIsNullable(){
				    return true;
				}
				public Boolean ORDER_NO_LCIsKey(){
				    return false;
				}
				public Integer ORDER_NO_LCLength(){
				    return null;
				}
				public Integer ORDER_NO_LCPrecision(){
				    return null;
				}
				public String ORDER_NO_LCDefault(){
				
					return "";
				
				}
				public String ORDER_NO_LCComment(){
				
				    return "";
				
				}
				public String ORDER_NO_LCPattern(){
				
					return "";
				
				}
				public String ORDER_NO_LCOriginalDbColumnName(){
				
					return "ORDER_NO_LC";
				
				}

				
			    public String EXTN_PAYPAL_AUTH_ID;

				public String getEXTN_PAYPAL_AUTH_ID () {
					return this.EXTN_PAYPAL_AUTH_ID;
				}

				public Boolean EXTN_PAYPAL_AUTH_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_PAYPAL_AUTH_IDIsKey(){
				    return false;
				}
				public Integer EXTN_PAYPAL_AUTH_IDLength(){
				    return null;
				}
				public Integer EXTN_PAYPAL_AUTH_IDPrecision(){
				    return null;
				}
				public String EXTN_PAYPAL_AUTH_IDDefault(){
				
					return "";
				
				}
				public String EXTN_PAYPAL_AUTH_IDComment(){
				
				    return "";
				
				}
				public String EXTN_PAYPAL_AUTH_IDPattern(){
				
					return "";
				
				}
				public String EXTN_PAYPAL_AUTH_IDOriginalDbColumnName(){
				
					return "EXTN_PAYPAL_AUTH_ID";
				
				}

				
			    public String EXTN_ORDER_DATE;

				public String getEXTN_ORDER_DATE () {
					return this.EXTN_ORDER_DATE;
				}

				public Boolean EXTN_ORDER_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDER_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_ORDER_DATELength(){
				    return null;
				}
				public Integer EXTN_ORDER_DATEPrecision(){
				    return null;
				}
				public String EXTN_ORDER_DATEDefault(){
				
					return "";
				
				}
				public String EXTN_ORDER_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_ORDER_DATEPattern(){
				
					return "";
				
				}
				public String EXTN_ORDER_DATEOriginalDbColumnName(){
				
					return "EXTN_ORDER_DATE";
				
				}

				
			    public String EXTN_DTC_ORDER;

				public String getEXTN_DTC_ORDER () {
					return this.EXTN_DTC_ORDER;
				}

				public Boolean EXTN_DTC_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_DTC_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_DTC_ORDERLength(){
				    return null;
				}
				public Integer EXTN_DTC_ORDERPrecision(){
				    return null;
				}
				public String EXTN_DTC_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_DTC_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_DTC_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_DTC_ORDEROriginalDbColumnName(){
				
					return "EXTN_DTC_ORDER";
				
				}

				
			    public String EXTN_SOURCE;

				public String getEXTN_SOURCE () {
					return this.EXTN_SOURCE;
				}

				public Boolean EXTN_SOURCEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SOURCEIsKey(){
				    return false;
				}
				public Integer EXTN_SOURCELength(){
				    return null;
				}
				public Integer EXTN_SOURCEPrecision(){
				    return null;
				}
				public String EXTN_SOURCEDefault(){
				
					return "";
				
				}
				public String EXTN_SOURCEComment(){
				
				    return "";
				
				}
				public String EXTN_SOURCEPattern(){
				
					return "";
				
				}
				public String EXTN_SOURCEOriginalDbColumnName(){
				
					return "EXTN_SOURCE";
				
				}

				
			    public String EXTN_ATG_CARRIER_CODE;

				public String getEXTN_ATG_CARRIER_CODE () {
					return this.EXTN_ATG_CARRIER_CODE;
				}

				public Boolean EXTN_ATG_CARRIER_CODEIsNullable(){
				    return true;
				}
				public Boolean EXTN_ATG_CARRIER_CODEIsKey(){
				    return false;
				}
				public Integer EXTN_ATG_CARRIER_CODELength(){
				    return null;
				}
				public Integer EXTN_ATG_CARRIER_CODEPrecision(){
				    return null;
				}
				public String EXTN_ATG_CARRIER_CODEDefault(){
				
					return "";
				
				}
				public String EXTN_ATG_CARRIER_CODEComment(){
				
				    return "";
				
				}
				public String EXTN_ATG_CARRIER_CODEPattern(){
				
					return "";
				
				}
				public String EXTN_ATG_CARRIER_CODEOriginalDbColumnName(){
				
					return "EXTN_ATG_CARRIER_CODE";
				
				}

				
			    public String EXTN_VOUCHER_AMT;

				public String getEXTN_VOUCHER_AMT () {
					return this.EXTN_VOUCHER_AMT;
				}

				public Boolean EXTN_VOUCHER_AMTIsNullable(){
				    return true;
				}
				public Boolean EXTN_VOUCHER_AMTIsKey(){
				    return false;
				}
				public Integer EXTN_VOUCHER_AMTLength(){
				    return null;
				}
				public Integer EXTN_VOUCHER_AMTPrecision(){
				    return null;
				}
				public String EXTN_VOUCHER_AMTDefault(){
				
					return "";
				
				}
				public String EXTN_VOUCHER_AMTComment(){
				
				    return "";
				
				}
				public String EXTN_VOUCHER_AMTPattern(){
				
					return "";
				
				}
				public String EXTN_VOUCHER_AMTOriginalDbColumnName(){
				
					return "EXTN_VOUCHER_AMT";
				
				}

				
			    public String EXTN_CUSTOMER_ALT_KEY;

				public String getEXTN_CUSTOMER_ALT_KEY () {
					return this.EXTN_CUSTOMER_ALT_KEY;
				}

				public Boolean EXTN_CUSTOMER_ALT_KEYIsNullable(){
				    return true;
				}
				public Boolean EXTN_CUSTOMER_ALT_KEYIsKey(){
				    return false;
				}
				public Integer EXTN_CUSTOMER_ALT_KEYLength(){
				    return null;
				}
				public Integer EXTN_CUSTOMER_ALT_KEYPrecision(){
				    return null;
				}
				public String EXTN_CUSTOMER_ALT_KEYDefault(){
				
					return "";
				
				}
				public String EXTN_CUSTOMER_ALT_KEYComment(){
				
				    return "";
				
				}
				public String EXTN_CUSTOMER_ALT_KEYPattern(){
				
					return "";
				
				}
				public String EXTN_CUSTOMER_ALT_KEYOriginalDbColumnName(){
				
					return "EXTN_CUSTOMER_ALT_KEY";
				
				}

				
			    public String EXTN_IS_GUEST_CHECKOUT;

				public String getEXTN_IS_GUEST_CHECKOUT () {
					return this.EXTN_IS_GUEST_CHECKOUT;
				}

				public Boolean EXTN_IS_GUEST_CHECKOUTIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_GUEST_CHECKOUTIsKey(){
				    return false;
				}
				public Integer EXTN_IS_GUEST_CHECKOUTLength(){
				    return null;
				}
				public Integer EXTN_IS_GUEST_CHECKOUTPrecision(){
				    return null;
				}
				public String EXTN_IS_GUEST_CHECKOUTDefault(){
				
					return "";
				
				}
				public String EXTN_IS_GUEST_CHECKOUTComment(){
				
				    return "";
				
				}
				public String EXTN_IS_GUEST_CHECKOUTPattern(){
				
					return "";
				
				}
				public String EXTN_IS_GUEST_CHECKOUTOriginalDbColumnName(){
				
					return "EXTN_IS_GUEST_CHECKOUT";
				
				}

				
			    public String EXTN_ATG_ORDER_NO;

				public String getEXTN_ATG_ORDER_NO () {
					return this.EXTN_ATG_ORDER_NO;
				}

				public Boolean EXTN_ATG_ORDER_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_ATG_ORDER_NOIsKey(){
				    return false;
				}
				public Integer EXTN_ATG_ORDER_NOLength(){
				    return null;
				}
				public Integer EXTN_ATG_ORDER_NOPrecision(){
				    return null;
				}
				public String EXTN_ATG_ORDER_NODefault(){
				
					return "";
				
				}
				public String EXTN_ATG_ORDER_NOComment(){
				
				    return "";
				
				}
				public String EXTN_ATG_ORDER_NOPattern(){
				
					return "";
				
				}
				public String EXTN_ATG_ORDER_NOOriginalDbColumnName(){
				
					return "EXTN_ATG_ORDER_NO";
				
				}

				
			    public String EXTN_PREFIX;

				public String getEXTN_PREFIX () {
					return this.EXTN_PREFIX;
				}

				public Boolean EXTN_PREFIXIsNullable(){
				    return true;
				}
				public Boolean EXTN_PREFIXIsKey(){
				    return false;
				}
				public Integer EXTN_PREFIXLength(){
				    return null;
				}
				public Integer EXTN_PREFIXPrecision(){
				    return null;
				}
				public String EXTN_PREFIXDefault(){
				
					return "";
				
				}
				public String EXTN_PREFIXComment(){
				
				    return "";
				
				}
				public String EXTN_PREFIXPattern(){
				
					return "";
				
				}
				public String EXTN_PREFIXOriginalDbColumnName(){
				
					return "EXTN_PREFIX";
				
				}

				
			    public String EXTN_STORE_NO;

				public String getEXTN_STORE_NO () {
					return this.EXTN_STORE_NO;
				}

				public Boolean EXTN_STORE_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_STORE_NOIsKey(){
				    return false;
				}
				public Integer EXTN_STORE_NOLength(){
				    return null;
				}
				public Integer EXTN_STORE_NOPrecision(){
				    return null;
				}
				public String EXTN_STORE_NODefault(){
				
					return "";
				
				}
				public String EXTN_STORE_NOComment(){
				
				    return "";
				
				}
				public String EXTN_STORE_NOPattern(){
				
					return "";
				
				}
				public String EXTN_STORE_NOOriginalDbColumnName(){
				
					return "EXTN_STORE_NO";
				
				}

				
			    public String EXTN_ORDER_TAX_AREA_ID;

				public String getEXTN_ORDER_TAX_AREA_ID () {
					return this.EXTN_ORDER_TAX_AREA_ID;
				}

				public Boolean EXTN_ORDER_TAX_AREA_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDER_TAX_AREA_IDIsKey(){
				    return false;
				}
				public Integer EXTN_ORDER_TAX_AREA_IDLength(){
				    return null;
				}
				public Integer EXTN_ORDER_TAX_AREA_IDPrecision(){
				    return null;
				}
				public String EXTN_ORDER_TAX_AREA_IDDefault(){
				
					return "";
				
				}
				public String EXTN_ORDER_TAX_AREA_IDComment(){
				
				    return "";
				
				}
				public String EXTN_ORDER_TAX_AREA_IDPattern(){
				
					return "";
				
				}
				public String EXTN_ORDER_TAX_AREA_IDOriginalDbColumnName(){
				
					return "EXTN_ORDER_TAX_AREA_ID";
				
				}

				
			    public String CART_ID;

				public String getCART_ID () {
					return this.CART_ID;
				}

				public Boolean CART_IDIsNullable(){
				    return true;
				}
				public Boolean CART_IDIsKey(){
				    return false;
				}
				public Integer CART_IDLength(){
				    return null;
				}
				public Integer CART_IDPrecision(){
				    return null;
				}
				public String CART_IDDefault(){
				
					return "";
				
				}
				public String CART_IDComment(){
				
				    return "";
				
				}
				public String CART_IDPattern(){
				
					return "";
				
				}
				public String CART_IDOriginalDbColumnName(){
				
					return "CART_ID";
				
				}

				
			    public BigDecimal ROLLOUT_VERSION;

				public BigDecimal getROLLOUT_VERSION () {
					return this.ROLLOUT_VERSION;
				}

				public Boolean ROLLOUT_VERSIONIsNullable(){
				    return true;
				}
				public Boolean ROLLOUT_VERSIONIsKey(){
				    return false;
				}
				public Integer ROLLOUT_VERSIONLength(){
				    return null;
				}
				public Integer ROLLOUT_VERSIONPrecision(){
				    return null;
				}
				public String ROLLOUT_VERSIONDefault(){
				
					return "";
				
				}
				public String ROLLOUT_VERSIONComment(){
				
				    return "";
				
				}
				public String ROLLOUT_VERSIONPattern(){
				
					return "";
				
				}
				public String ROLLOUT_VERSIONOriginalDbColumnName(){
				
					return "ROLLOUT_VERSION";
				
				}

				
			    public String EXTN_IS_MIGRATED;

				public String getEXTN_IS_MIGRATED () {
					return this.EXTN_IS_MIGRATED;
				}

				public Boolean EXTN_IS_MIGRATEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_MIGRATEDIsKey(){
				    return false;
				}
				public Integer EXTN_IS_MIGRATEDLength(){
				    return null;
				}
				public Integer EXTN_IS_MIGRATEDPrecision(){
				    return null;
				}
				public String EXTN_IS_MIGRATEDDefault(){
				
					return "";
				
				}
				public String EXTN_IS_MIGRATEDComment(){
				
				    return "";
				
				}
				public String EXTN_IS_MIGRATEDPattern(){
				
					return "";
				
				}
				public String EXTN_IS_MIGRATEDOriginalDbColumnName(){
				
					return "EXTN_IS_MIGRATED";
				
				}

				
			    public String EXTN_GENERATE_CALL_TAGALERT;

				public String getEXTN_GENERATE_CALL_TAGALERT () {
					return this.EXTN_GENERATE_CALL_TAGALERT;
				}

				public Boolean EXTN_GENERATE_CALL_TAGALERTIsNullable(){
				    return false;
				}
				public Boolean EXTN_GENERATE_CALL_TAGALERTIsKey(){
				    return false;
				}
				public Integer EXTN_GENERATE_CALL_TAGALERTLength(){
				    return null;
				}
				public Integer EXTN_GENERATE_CALL_TAGALERTPrecision(){
				    return null;
				}
				public String EXTN_GENERATE_CALL_TAGALERTDefault(){
				
					return "";
				
				}
				public String EXTN_GENERATE_CALL_TAGALERTComment(){
				
				    return "";
				
				}
				public String EXTN_GENERATE_CALL_TAGALERTPattern(){
				
					return "";
				
				}
				public String EXTN_GENERATE_CALL_TAGALERTOriginalDbColumnName(){
				
					return "EXTN_GENERATE_CALL_TAGALERT";
				
				}

				
			    public String EXTN_SUBSCRIPTION_ORDER;

				public String getEXTN_SUBSCRIPTION_ORDER () {
					return this.EXTN_SUBSCRIPTION_ORDER;
				}

				public Boolean EXTN_SUBSCRIPTION_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_SUBSCRIPTION_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_SUBSCRIPTION_ORDERLength(){
				    return null;
				}
				public Integer EXTN_SUBSCRIPTION_ORDERPrecision(){
				    return null;
				}
				public String EXTN_SUBSCRIPTION_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_SUBSCRIPTION_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_SUBSCRIPTION_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_SUBSCRIPTION_ORDEROriginalDbColumnName(){
				
					return "EXTN_SUBSCRIPTION_ORDER";
				
				}

				
			    public String EXTN_CRM_CUSTOMER;

				public String getEXTN_CRM_CUSTOMER () {
					return this.EXTN_CRM_CUSTOMER;
				}

				public Boolean EXTN_CRM_CUSTOMERIsNullable(){
				    return true;
				}
				public Boolean EXTN_CRM_CUSTOMERIsKey(){
				    return false;
				}
				public Integer EXTN_CRM_CUSTOMERLength(){
				    return null;
				}
				public Integer EXTN_CRM_CUSTOMERPrecision(){
				    return null;
				}
				public String EXTN_CRM_CUSTOMERDefault(){
				
					return "'Y'";
				
				}
				public String EXTN_CRM_CUSTOMERComment(){
				
				    return "";
				
				}
				public String EXTN_CRM_CUSTOMERPattern(){
				
					return "";
				
				}
				public String EXTN_CRM_CUSTOMEROriginalDbColumnName(){
				
					return "EXTN_CRM_CUSTOMER";
				
				}

				
			    public java.util.Date EXTN_PRICING_DATE;

				public java.util.Date getEXTN_PRICING_DATE () {
					return this.EXTN_PRICING_DATE;
				}

				public Boolean EXTN_PRICING_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICING_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_PRICING_DATELength(){
				    return null;
				}
				public Integer EXTN_PRICING_DATEPrecision(){
				    return null;
				}
				public String EXTN_PRICING_DATEDefault(){
				
					return "";
				
				}
				public String EXTN_PRICING_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_PRICING_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_PRICING_DATEOriginalDbColumnName(){
				
					return "EXTN_PRICING_DATE";
				
				}

				
			    public String EXTN_ORIGINAL_ADP_ORDER;

				public String getEXTN_ORIGINAL_ADP_ORDER () {
					return this.EXTN_ORIGINAL_ADP_ORDER;
				}

				public Boolean EXTN_ORIGINAL_ADP_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORIGINAL_ADP_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_ORIGINAL_ADP_ORDERLength(){
				    return null;
				}
				public Integer EXTN_ORIGINAL_ADP_ORDERPrecision(){
				    return null;
				}
				public String EXTN_ORIGINAL_ADP_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_ORIGINAL_ADP_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_ORIGINAL_ADP_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_ORIGINAL_ADP_ORDEROriginalDbColumnName(){
				
					return "EXTN_ORIGINAL_ADP_ORDER";
				
				}

				
			    public String EXTN_MCL_ORDER_SHIPMENT_ID;

				public String getEXTN_MCL_ORDER_SHIPMENT_ID () {
					return this.EXTN_MCL_ORDER_SHIPMENT_ID;
				}

				public Boolean EXTN_MCL_ORDER_SHIPMENT_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_MCL_ORDER_SHIPMENT_IDIsKey(){
				    return false;
				}
				public Integer EXTN_MCL_ORDER_SHIPMENT_IDLength(){
				    return null;
				}
				public Integer EXTN_MCL_ORDER_SHIPMENT_IDPrecision(){
				    return null;
				}
				public String EXTN_MCL_ORDER_SHIPMENT_IDDefault(){
				
					return "";
				
				}
				public String EXTN_MCL_ORDER_SHIPMENT_IDComment(){
				
				    return "";
				
				}
				public String EXTN_MCL_ORDER_SHIPMENT_IDPattern(){
				
					return "";
				
				}
				public String EXTN_MCL_ORDER_SHIPMENT_IDOriginalDbColumnName(){
				
					return "EXTN_MCL_ORDER_SHIPMENT_ID";
				
				}

				
			    public String EXTN_MCL_CHANNEL;

				public String getEXTN_MCL_CHANNEL () {
					return this.EXTN_MCL_CHANNEL;
				}

				public Boolean EXTN_MCL_CHANNELIsNullable(){
				    return true;
				}
				public Boolean EXTN_MCL_CHANNELIsKey(){
				    return false;
				}
				public Integer EXTN_MCL_CHANNELLength(){
				    return null;
				}
				public Integer EXTN_MCL_CHANNELPrecision(){
				    return null;
				}
				public String EXTN_MCL_CHANNELDefault(){
				
					return "";
				
				}
				public String EXTN_MCL_CHANNELComment(){
				
				    return "";
				
				}
				public String EXTN_MCL_CHANNELPattern(){
				
					return "";
				
				}
				public String EXTN_MCL_CHANNELOriginalDbColumnName(){
				
					return "EXTN_MCL_CHANNEL";
				
				}

				
			    public String EXTN_DM_BATCH_NO;

				public String getEXTN_DM_BATCH_NO () {
					return this.EXTN_DM_BATCH_NO;
				}

				public Boolean EXTN_DM_BATCH_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_DM_BATCH_NOIsKey(){
				    return false;
				}
				public Integer EXTN_DM_BATCH_NOLength(){
				    return null;
				}
				public Integer EXTN_DM_BATCH_NOPrecision(){
				    return null;
				}
				public String EXTN_DM_BATCH_NODefault(){
				
					return "";
				
				}
				public String EXTN_DM_BATCH_NOComment(){
				
				    return "";
				
				}
				public String EXTN_DM_BATCH_NOPattern(){
				
					return "";
				
				}
				public String EXTN_DM_BATCH_NOOriginalDbColumnName(){
				
					return "EXTN_DM_BATCH_NO";
				
				}

				
			    public String EXTN_KOUNT_SESSION_ID;

				public String getEXTN_KOUNT_SESSION_ID () {
					return this.EXTN_KOUNT_SESSION_ID;
				}

				public Boolean EXTN_KOUNT_SESSION_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_KOUNT_SESSION_IDIsKey(){
				    return false;
				}
				public Integer EXTN_KOUNT_SESSION_IDLength(){
				    return null;
				}
				public Integer EXTN_KOUNT_SESSION_IDPrecision(){
				    return null;
				}
				public String EXTN_KOUNT_SESSION_IDDefault(){
				
					return "";
				
				}
				public String EXTN_KOUNT_SESSION_IDComment(){
				
				    return "";
				
				}
				public String EXTN_KOUNT_SESSION_IDPattern(){
				
					return "";
				
				}
				public String EXTN_KOUNT_SESSION_IDOriginalDbColumnName(){
				
					return "EXTN_KOUNT_SESSION_ID";
				
				}

				
			    public String EXTN_SHIPMENT_CHARGE;

				public String getEXTN_SHIPMENT_CHARGE () {
					return this.EXTN_SHIPMENT_CHARGE;
				}

				public Boolean EXTN_SHIPMENT_CHARGEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIPMENT_CHARGEIsKey(){
				    return false;
				}
				public Integer EXTN_SHIPMENT_CHARGELength(){
				    return null;
				}
				public Integer EXTN_SHIPMENT_CHARGEPrecision(){
				    return null;
				}
				public String EXTN_SHIPMENT_CHARGEDefault(){
				
					return "";
				
				}
				public String EXTN_SHIPMENT_CHARGEComment(){
				
				    return "";
				
				}
				public String EXTN_SHIPMENT_CHARGEPattern(){
				
					return "";
				
				}
				public String EXTN_SHIPMENT_CHARGEOriginalDbColumnName(){
				
					return "EXTN_SHIPMENT_CHARGE";
				
				}

				
			    public String EXTN_SHIPMENT_DISCOUNT;

				public String getEXTN_SHIPMENT_DISCOUNT () {
					return this.EXTN_SHIPMENT_DISCOUNT;
				}

				public Boolean EXTN_SHIPMENT_DISCOUNTIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIPMENT_DISCOUNTIsKey(){
				    return false;
				}
				public Integer EXTN_SHIPMENT_DISCOUNTLength(){
				    return null;
				}
				public Integer EXTN_SHIPMENT_DISCOUNTPrecision(){
				    return null;
				}
				public String EXTN_SHIPMENT_DISCOUNTDefault(){
				
					return "";
				
				}
				public String EXTN_SHIPMENT_DISCOUNTComment(){
				
				    return "";
				
				}
				public String EXTN_SHIPMENT_DISCOUNTPattern(){
				
					return "";
				
				}
				public String EXTN_SHIPMENT_DISCOUNTOriginalDbColumnName(){
				
					return "EXTN_SHIPMENT_DISCOUNT";
				
				}

				
			    public String EXTN_ORDER_DISCOUNT;

				public String getEXTN_ORDER_DISCOUNT () {
					return this.EXTN_ORDER_DISCOUNT;
				}

				public Boolean EXTN_ORDER_DISCOUNTIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDER_DISCOUNTIsKey(){
				    return false;
				}
				public Integer EXTN_ORDER_DISCOUNTLength(){
				    return null;
				}
				public Integer EXTN_ORDER_DISCOUNTPrecision(){
				    return null;
				}
				public String EXTN_ORDER_DISCOUNTDefault(){
				
					return "";
				
				}
				public String EXTN_ORDER_DISCOUNTComment(){
				
				    return "";
				
				}
				public String EXTN_ORDER_DISCOUNTPattern(){
				
					return "";
				
				}
				public String EXTN_ORDER_DISCOUNTOriginalDbColumnName(){
				
					return "EXTN_ORDER_DISCOUNT";
				
				}

				
			    public String EXTN_ORDER_TAX;

				public String getEXTN_ORDER_TAX () {
					return this.EXTN_ORDER_TAX;
				}

				public Boolean EXTN_ORDER_TAXIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDER_TAXIsKey(){
				    return false;
				}
				public Integer EXTN_ORDER_TAXLength(){
				    return null;
				}
				public Integer EXTN_ORDER_TAXPrecision(){
				    return null;
				}
				public String EXTN_ORDER_TAXDefault(){
				
					return "";
				
				}
				public String EXTN_ORDER_TAXComment(){
				
				    return "";
				
				}
				public String EXTN_ORDER_TAXPattern(){
				
					return "";
				
				}
				public String EXTN_ORDER_TAXOriginalDbColumnName(){
				
					return "EXTN_ORDER_TAX";
				
				}

				
			    public String EXTN_RE_ORDER;

				public String getEXTN_RE_ORDER () {
					return this.EXTN_RE_ORDER;
				}

				public Boolean EXTN_RE_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_RE_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_RE_ORDERLength(){
				    return null;
				}
				public Integer EXTN_RE_ORDERPrecision(){
				    return null;
				}
				public String EXTN_RE_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_RE_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_RE_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_RE_ORDEROriginalDbColumnName(){
				
					return "EXTN_RE_ORDER";
				
				}

				
			    public String EXTN_MOBILE_ORDER;

				public String getEXTN_MOBILE_ORDER () {
					return this.EXTN_MOBILE_ORDER;
				}

				public Boolean EXTN_MOBILE_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_MOBILE_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_MOBILE_ORDERLength(){
				    return null;
				}
				public Integer EXTN_MOBILE_ORDERPrecision(){
				    return null;
				}
				public String EXTN_MOBILE_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_MOBILE_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_MOBILE_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_MOBILE_ORDEROriginalDbColumnName(){
				
					return "EXTN_MOBILE_ORDER";
				
				}

				
			    public String EXTN_MOBILE_ORDER_TYPE;

				public String getEXTN_MOBILE_ORDER_TYPE () {
					return this.EXTN_MOBILE_ORDER_TYPE;
				}

				public Boolean EXTN_MOBILE_ORDER_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXTN_MOBILE_ORDER_TYPEIsKey(){
				    return false;
				}
				public Integer EXTN_MOBILE_ORDER_TYPELength(){
				    return null;
				}
				public Integer EXTN_MOBILE_ORDER_TYPEPrecision(){
				    return null;
				}
				public String EXTN_MOBILE_ORDER_TYPEDefault(){
				
					return "";
				
				}
				public String EXTN_MOBILE_ORDER_TYPEComment(){
				
				    return "";
				
				}
				public String EXTN_MOBILE_ORDER_TYPEPattern(){
				
					return "";
				
				}
				public String EXTN_MOBILE_ORDER_TYPEOriginalDbColumnName(){
				
					return "EXTN_MOBILE_ORDER_TYPE";
				
				}

				
			    public String EXTN_NEW_ORDER;

				public String getEXTN_NEW_ORDER () {
					return this.EXTN_NEW_ORDER;
				}

				public Boolean EXTN_NEW_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_NEW_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_NEW_ORDERLength(){
				    return null;
				}
				public Integer EXTN_NEW_ORDERPrecision(){
				    return null;
				}
				public String EXTN_NEW_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_NEW_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_NEW_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_NEW_ORDEROriginalDbColumnName(){
				
					return "EXTN_NEW_ORDER";
				
				}

				
			    public String EXTN_VENDOR_ID;

				public String getEXTN_VENDOR_ID () {
					return this.EXTN_VENDOR_ID;
				}

				public Boolean EXTN_VENDOR_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_VENDOR_IDIsKey(){
				    return false;
				}
				public Integer EXTN_VENDOR_IDLength(){
				    return null;
				}
				public Integer EXTN_VENDOR_IDPrecision(){
				    return null;
				}
				public String EXTN_VENDOR_IDDefault(){
				
					return "";
				
				}
				public String EXTN_VENDOR_IDComment(){
				
				    return "";
				
				}
				public String EXTN_VENDOR_IDPattern(){
				
					return "";
				
				}
				public String EXTN_VENDOR_IDOriginalDbColumnName(){
				
					return "EXTN_VENDOR_ID";
				
				}

				
			    public String EXTN_DEPT_ID;

				public String getEXTN_DEPT_ID () {
					return this.EXTN_DEPT_ID;
				}

				public Boolean EXTN_DEPT_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_DEPT_IDIsKey(){
				    return false;
				}
				public Integer EXTN_DEPT_IDLength(){
				    return null;
				}
				public Integer EXTN_DEPT_IDPrecision(){
				    return null;
				}
				public String EXTN_DEPT_IDDefault(){
				
					return "";
				
				}
				public String EXTN_DEPT_IDComment(){
				
				    return "";
				
				}
				public String EXTN_DEPT_IDPattern(){
				
					return "";
				
				}
				public String EXTN_DEPT_IDOriginalDbColumnName(){
				
					return "EXTN_DEPT_ID";
				
				}

				
			    public String EXTN_COST_CENTER;

				public String getEXTN_COST_CENTER () {
					return this.EXTN_COST_CENTER;
				}

				public Boolean EXTN_COST_CENTERIsNullable(){
				    return true;
				}
				public Boolean EXTN_COST_CENTERIsKey(){
				    return false;
				}
				public Integer EXTN_COST_CENTERLength(){
				    return null;
				}
				public Integer EXTN_COST_CENTERPrecision(){
				    return null;
				}
				public String EXTN_COST_CENTERDefault(){
				
					return "";
				
				}
				public String EXTN_COST_CENTERComment(){
				
				    return "";
				
				}
				public String EXTN_COST_CENTERPattern(){
				
					return "";
				
				}
				public String EXTN_COST_CENTEROriginalDbColumnName(){
				
					return "EXTN_COST_CENTER";
				
				}

				
			    public String EXTN_TNS_AUTHORIZED;

				public String getEXTN_TNS_AUTHORIZED () {
					return this.EXTN_TNS_AUTHORIZED;
				}

				public Boolean EXTN_TNS_AUTHORIZEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_TNS_AUTHORIZEDIsKey(){
				    return false;
				}
				public Integer EXTN_TNS_AUTHORIZEDLength(){
				    return null;
				}
				public Integer EXTN_TNS_AUTHORIZEDPrecision(){
				    return null;
				}
				public String EXTN_TNS_AUTHORIZEDDefault(){
				
					return "";
				
				}
				public String EXTN_TNS_AUTHORIZEDComment(){
				
				    return "";
				
				}
				public String EXTN_TNS_AUTHORIZEDPattern(){
				
					return "";
				
				}
				public String EXTN_TNS_AUTHORIZEDOriginalDbColumnName(){
				
					return "EXTN_TNS_AUTHORIZED";
				
				}

				
			    public String EXTN_BROWSER_IP;

				public String getEXTN_BROWSER_IP () {
					return this.EXTN_BROWSER_IP;
				}

				public Boolean EXTN_BROWSER_IPIsNullable(){
				    return true;
				}
				public Boolean EXTN_BROWSER_IPIsKey(){
				    return false;
				}
				public Integer EXTN_BROWSER_IPLength(){
				    return null;
				}
				public Integer EXTN_BROWSER_IPPrecision(){
				    return null;
				}
				public String EXTN_BROWSER_IPDefault(){
				
					return "";
				
				}
				public String EXTN_BROWSER_IPComment(){
				
				    return "";
				
				}
				public String EXTN_BROWSER_IPPattern(){
				
					return "";
				
				}
				public String EXTN_BROWSER_IPOriginalDbColumnName(){
				
					return "EXTN_BROWSER_IP";
				
				}

				
			    public java.util.Date EXTN_CUSTOMER_CREATETS;

				public java.util.Date getEXTN_CUSTOMER_CREATETS () {
					return this.EXTN_CUSTOMER_CREATETS;
				}

				public Boolean EXTN_CUSTOMER_CREATETSIsNullable(){
				    return true;
				}
				public Boolean EXTN_CUSTOMER_CREATETSIsKey(){
				    return false;
				}
				public Integer EXTN_CUSTOMER_CREATETSLength(){
				    return null;
				}
				public Integer EXTN_CUSTOMER_CREATETSPrecision(){
				    return null;
				}
				public String EXTN_CUSTOMER_CREATETSDefault(){
				
					return "";
				
				}
				public String EXTN_CUSTOMER_CREATETSComment(){
				
				    return "";
				
				}
				public String EXTN_CUSTOMER_CREATETSPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_CUSTOMER_CREATETSOriginalDbColumnName(){
				
					return "EXTN_CUSTOMER_CREATETS";
				
				}

				
			    public String EXTN_USER_AGENT;

				public String getEXTN_USER_AGENT () {
					return this.EXTN_USER_AGENT;
				}

				public Boolean EXTN_USER_AGENTIsNullable(){
				    return true;
				}
				public Boolean EXTN_USER_AGENTIsKey(){
				    return false;
				}
				public Integer EXTN_USER_AGENTLength(){
				    return null;
				}
				public Integer EXTN_USER_AGENTPrecision(){
				    return null;
				}
				public String EXTN_USER_AGENTDefault(){
				
					return "";
				
				}
				public String EXTN_USER_AGENTComment(){
				
				    return "";
				
				}
				public String EXTN_USER_AGENTPattern(){
				
					return "";
				
				}
				public String EXTN_USER_AGENTOriginalDbColumnName(){
				
					return "EXTN_USER_AGENT";
				
				}

				
			    public String EXTN_ACCEPT_LANG;

				public String getEXTN_ACCEPT_LANG () {
					return this.EXTN_ACCEPT_LANG;
				}

				public Boolean EXTN_ACCEPT_LANGIsNullable(){
				    return true;
				}
				public Boolean EXTN_ACCEPT_LANGIsKey(){
				    return false;
				}
				public Integer EXTN_ACCEPT_LANGLength(){
				    return null;
				}
				public Integer EXTN_ACCEPT_LANGPrecision(){
				    return null;
				}
				public String EXTN_ACCEPT_LANGDefault(){
				
					return "";
				
				}
				public String EXTN_ACCEPT_LANGComment(){
				
				    return "";
				
				}
				public String EXTN_ACCEPT_LANGPattern(){
				
					return "";
				
				}
				public String EXTN_ACCEPT_LANGOriginalDbColumnName(){
				
					return "EXTN_ACCEPT_LANG";
				
				}

				
			    public String EXTN_ATG_ORDERID;

				public String getEXTN_ATG_ORDERID () {
					return this.EXTN_ATG_ORDERID;
				}

				public Boolean EXTN_ATG_ORDERIDIsNullable(){
				    return true;
				}
				public Boolean EXTN_ATG_ORDERIDIsKey(){
				    return false;
				}
				public Integer EXTN_ATG_ORDERIDLength(){
				    return null;
				}
				public Integer EXTN_ATG_ORDERIDPrecision(){
				    return null;
				}
				public String EXTN_ATG_ORDERIDDefault(){
				
					return "";
				
				}
				public String EXTN_ATG_ORDERIDComment(){
				
				    return "";
				
				}
				public String EXTN_ATG_ORDERIDPattern(){
				
					return "";
				
				}
				public String EXTN_ATG_ORDERIDOriginalDbColumnName(){
				
					return "EXTN_ATG_ORDERID";
				
				}

				
			    public String EXTN_RISKIFIED_SESSION;

				public String getEXTN_RISKIFIED_SESSION () {
					return this.EXTN_RISKIFIED_SESSION;
				}

				public Boolean EXTN_RISKIFIED_SESSIONIsNullable(){
				    return true;
				}
				public Boolean EXTN_RISKIFIED_SESSIONIsKey(){
				    return false;
				}
				public Integer EXTN_RISKIFIED_SESSIONLength(){
				    return null;
				}
				public Integer EXTN_RISKIFIED_SESSIONPrecision(){
				    return null;
				}
				public String EXTN_RISKIFIED_SESSIONDefault(){
				
					return "";
				
				}
				public String EXTN_RISKIFIED_SESSIONComment(){
				
				    return "";
				
				}
				public String EXTN_RISKIFIED_SESSIONPattern(){
				
					return "";
				
				}
				public String EXTN_RISKIFIED_SESSIONOriginalDbColumnName(){
				
					return "EXTN_RISKIFIED_SESSION";
				
				}

				
			    public String EXTN_CUSTOMER_TIER;

				public String getEXTN_CUSTOMER_TIER () {
					return this.EXTN_CUSTOMER_TIER;
				}

				public Boolean EXTN_CUSTOMER_TIERIsNullable(){
				    return true;
				}
				public Boolean EXTN_CUSTOMER_TIERIsKey(){
				    return false;
				}
				public Integer EXTN_CUSTOMER_TIERLength(){
				    return null;
				}
				public Integer EXTN_CUSTOMER_TIERPrecision(){
				    return null;
				}
				public String EXTN_CUSTOMER_TIERDefault(){
				
					return "";
				
				}
				public String EXTN_CUSTOMER_TIERComment(){
				
				    return "";
				
				}
				public String EXTN_CUSTOMER_TIERPattern(){
				
					return "";
				
				}
				public String EXTN_CUSTOMER_TIEROriginalDbColumnName(){
				
					return "EXTN_CUSTOMER_TIER";
				
				}

				
			    public String EXTN_AURUS_TOKEN;

				public String getEXTN_AURUS_TOKEN () {
					return this.EXTN_AURUS_TOKEN;
				}

				public Boolean EXTN_AURUS_TOKENIsNullable(){
				    return true;
				}
				public Boolean EXTN_AURUS_TOKENIsKey(){
				    return false;
				}
				public Integer EXTN_AURUS_TOKENLength(){
				    return null;
				}
				public Integer EXTN_AURUS_TOKENPrecision(){
				    return null;
				}
				public String EXTN_AURUS_TOKENDefault(){
				
					return "";
				
				}
				public String EXTN_AURUS_TOKENComment(){
				
				    return "";
				
				}
				public String EXTN_AURUS_TOKENPattern(){
				
					return "";
				
				}
				public String EXTN_AURUS_TOKENOriginalDbColumnName(){
				
					return "EXTN_AURUS_TOKEN";
				
				}

				
			    public String EXTN_RISKIFIED_COUNT;

				public String getEXTN_RISKIFIED_COUNT () {
					return this.EXTN_RISKIFIED_COUNT;
				}

				public Boolean EXTN_RISKIFIED_COUNTIsNullable(){
				    return true;
				}
				public Boolean EXTN_RISKIFIED_COUNTIsKey(){
				    return false;
				}
				public Integer EXTN_RISKIFIED_COUNTLength(){
				    return null;
				}
				public Integer EXTN_RISKIFIED_COUNTPrecision(){
				    return null;
				}
				public String EXTN_RISKIFIED_COUNTDefault(){
				
					return "";
				
				}
				public String EXTN_RISKIFIED_COUNTComment(){
				
				    return "";
				
				}
				public String EXTN_RISKIFIED_COUNTPattern(){
				
					return "";
				
				}
				public String EXTN_RISKIFIED_COUNTOriginalDbColumnName(){
				
					return "EXTN_RISKIFIED_COUNT";
				
				}

				
			    public String EXTN_IS_MIXED_CART_ORDER;

				public String getEXTN_IS_MIXED_CART_ORDER () {
					return this.EXTN_IS_MIXED_CART_ORDER;
				}

				public Boolean EXTN_IS_MIXED_CART_ORDERIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_MIXED_CART_ORDERIsKey(){
				    return false;
				}
				public Integer EXTN_IS_MIXED_CART_ORDERLength(){
				    return null;
				}
				public Integer EXTN_IS_MIXED_CART_ORDERPrecision(){
				    return null;
				}
				public String EXTN_IS_MIXED_CART_ORDERDefault(){
				
					return "";
				
				}
				public String EXTN_IS_MIXED_CART_ORDERComment(){
				
				    return "";
				
				}
				public String EXTN_IS_MIXED_CART_ORDERPattern(){
				
					return "";
				
				}
				public String EXTN_IS_MIXED_CART_ORDEROriginalDbColumnName(){
				
					return "EXTN_IS_MIXED_CART_ORDER";
				
				}

				
			    public String EXTN_BOL_NO;

				public String getEXTN_BOL_NO () {
					return this.EXTN_BOL_NO;
				}

				public Boolean EXTN_BOL_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_BOL_NOIsKey(){
				    return false;
				}
				public Integer EXTN_BOL_NOLength(){
				    return null;
				}
				public Integer EXTN_BOL_NOPrecision(){
				    return null;
				}
				public String EXTN_BOL_NODefault(){
				
					return "";
				
				}
				public String EXTN_BOL_NOComment(){
				
				    return "";
				
				}
				public String EXTN_BOL_NOPattern(){
				
					return "";
				
				}
				public String EXTN_BOL_NOOriginalDbColumnName(){
				
					return "EXTN_BOL_NO";
				
				}

				
			    public java.util.Date EXTN_DELIVERY_DATE;

				public java.util.Date getEXTN_DELIVERY_DATE () {
					return this.EXTN_DELIVERY_DATE;
				}

				public Boolean EXTN_DELIVERY_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_DELIVERY_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_DELIVERY_DATELength(){
				    return null;
				}
				public Integer EXTN_DELIVERY_DATEPrecision(){
				    return null;
				}
				public String EXTN_DELIVERY_DATEDefault(){
				
					return "";
				
				}
				public String EXTN_DELIVERY_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_DELIVERY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_DELIVERY_DATEOriginalDbColumnName(){
				
					return "EXTN_DELIVERY_DATE";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_HEADER_H, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_HEADER_H) {

        	try {

        		int length = 0;
		
					this.ORDER_HEADER_KEY = readString(dis);
					
					this.ENTERPRISE_KEY = readString(dis);
					
					this.ORDER_NO = readString(dis);
					
					this.SOURCING_CLASSIFICATION = readString(dis);
					
					this.BUYER_ORGANIZATION_CODE = readString(dis);
					
					this.SELLER_ORGANIZATION_CODE = readString(dis);
					
					this.DOCUMENT_TYPE = readString(dis);
					
					this.BILL_TO_KEY = readString(dis);
					
					this.BILL_TO_ID = readString(dis);
					
					this.CUSTOMER_REWARDS_NO = readString(dis);
					
					this.VENDOR_ID = readString(dis);
					
					this.SHIP_TO_KEY = readString(dis);
					
					this.SHIP_TO_ID = readString(dis);
					
					this.SHIP_NODE = readString(dis);
					
					this.RECEIVING_NODE = readString(dis);
					
					this.BUYER_RECEIVING_NODE_ID = readString(dis);
					
					this.MARK_FOR_KEY = readString(dis);
					
					this.BUYER_MARK_FOR_NODE_ID = readString(dis);
					
					this.REQ_DELIVERY_DATE = readDate(dis);
					
					this.REQ_CANCEL_DATE = readDate(dis);
					
					this.REQ_SHIP_DATE = readDate(dis);
					
					this.DEFAULT_TEMPLATE = readString(dis);
					
					this.DIVISION = readString(dis);
					
					this.ORDER_DATE = readDate(dis);
					
					this.ORDER_TYPE = readString(dis);
					
					this.DRAFT_ORDER_FLAG = readString(dis);
					
					this.ORDER_PURPOSE = readString(dis);
					
					this.RETURN_OH_KEY_FOR_EXCHANGE = readString(dis);
					
					this.EXCHANGE_TYPE = readString(dis);
					
						this.PENDING_TRANSFER_IN = (BigDecimal) dis.readObject();
					
					this.RETURN_BY_GIFT_RECIPIENT = readString(dis);
					
					this.ALLOCATION_RULE_ID = readString(dis);
					
					this.PRIORITY_CODE = readString(dis);
					
						this.PRIORITY_NUMBER = (BigDecimal) dis.readObject();
					
					this.CONTACT_KEY = readString(dis);
					
					this.SCAC = readString(dis);
					
					this.CARRIER_SERVICE_CODE = readString(dis);
					
					this.CUSTCARRIER_ACCOUNT_NO = readString(dis);
					
					this.NOTIFY_AFTER_SHIPMENT_FLAG = readString(dis);
					
					this.CREATED_AT_NODE = readString(dis);
					
					this.HAS_DERIVED_CHILD = readString(dis);
					
					this.HAS_DERIVED_PARENT = readString(dis);
					
					this.NOTIFICATION_TYPE = readString(dis);
					
					this.NOTIFICATION_REFERENCE = readString(dis);
					
					this.ENTRY_TYPE = readString(dis);
					
					this.AUTHORIZED_CLIENT = readString(dis);
					
					this.ENTERED_BY = readString(dis);
					
					this.PERSONALIZE_CODE = readString(dis);
					
					this.HOLD_FLAG = readString(dis);
					
					this.HOLD_REASON_CODE = readString(dis);
					
					this.CUSTOMER_PO_NO = readString(dis);
					
					this.CUSTOMER_CUSTOMER_PO_NO = readString(dis);
					
					this.ORDER_NAME = readString(dis);
					
					this.PAYMENT_RULE_ID = readString(dis);
					
					this.TERMS_CODE = readString(dis);
					
					this.DELIVERY_CODE = readString(dis);
					
					this.CHARGE_ACTUAL_FREIGHT = readString(dis);
					
						this.TAX = (BigDecimal) dis.readObject();
					
						this.TOTAL_AMOUNT = (BigDecimal) dis.readObject();
					
						this.ORIGINAL_TOTAL_AMOUNT = (BigDecimal) dis.readObject();
					
						this.ORIGINAL_TAX = (BigDecimal) dis.readObject();
					
					this.CURRENCY = readString(dis);
					
					this.ENTERPRISE_CURRENCY = readString(dis);
					
						this.REPORTING_CONVERSION_RATE = (BigDecimal) dis.readObject();
					
					this.REPORTING_CONVERSION_DATE = readDate(dis);
					
					this.PAYMENT_STATUS = readString(dis);
					
					this.AUTHORIZATION_EXPIRATION_DATE = readDate(dis);
					
					this.SEARCH_CRITERIA_1 = readString(dis);
					
					this.SEARCH_CRITERIA_2 = readString(dis);
					
					this.CUSTOMER_EMAILID = readString(dis);
					
					this.FOB = readString(dis);
					
						this.TOTAL_ADJUSTMENT_AMOUNT = (BigDecimal) dis.readObject();
					
						this.OTHER_CHARGES = (BigDecimal) dis.readObject();
					
					this.PRICE_PROGRAM_KEY = readString(dis);
					
					this.TAXPAYER_ID = readString(dis);
					
					this.TAX_JURISDICTION = readString(dis);
					
					this.TAX_EXEMPT_FLAG = readString(dis);
					
					this.TAX_EXEMPTION_CERTIFICATE = readString(dis);
					
					this.PURPOSE = readString(dis);
					
					this.INVOICE_COMPLETE = readString(dis);
					
					this.ORDER_CLOSED = readString(dis);
					
					this.NEXT_ALERT_TS = readDate(dis);
					
					this.DO_NOT_CONSOLIDATE = readString(dis);
					
					this.CHAIN_TYPE = readString(dis);
					
					this.ADJUSTMENT_INVOICE_PENDING = readString(dis);
					
					this.AUTO_CANCEL_DATE = readDate(dis);
					
					this.SALE_VOIDED = readString(dis);
					
					this.IS_SHIP_COMPLETE = readString(dis);
					
					this.IS_LINE_SHIP_COMPLETE = readString(dis);
					
					this.IS_SHIP_SINGLE_NODE = readString(dis);
					
					this.IS_LINE_SHIP_SINGLE_NODE = readString(dis);
					
					this.CANCEL_ORDER_ON_EXCP_FLAG = readString(dis);
					
					this.OPTIMIZATION_TYPE = readString(dis);
					
					this.PURGE_HISTORY_DATE = readDate(dis);
					
						this.PRICING_CLASSIFICATION_CODE = (BigDecimal) dis.readObject();
					
					this.SOURCE_TYPE = readString(dis);
					
						this.SOURCE_KEY = (BigDecimal) dis.readObject();
					
					this.LINKED_SOURCE_KEY = readString(dis);
					
						this.ORIGINAL_CONTAINER_KEY = (BigDecimal) dis.readObject();
					
					this.SOLD_TO_KEY = readString(dis);
					
					this.TEAM_CODE = readString(dis);
					
					this.LEVEL_OF_SERVICE = readString(dis);
					
						this.NEXT_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
					this.NEXT_ITER_DATE = readDate(dis);
					
						this.HRS_BEFORE_NEXT_ITER = (BigDecimal) dis.readObject();
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
					this.DEPARTMENT_CODE = readString(dis);
					
					this.BUYER_USER_ID = readString(dis);
					
					this.RECREATE_AUTHORIZATIONS = readString(dis);
					
					this.CUSTOMER_CONTACT_ID = readString(dis);
					
					this.OPPORTUNITY_KEY = readString(dis);
					
					this.IS_EXPIRATION_DATE_OVERRIDDEN = readString(dis);
					
					this.EXPIRATION_DATE = readDate(dis);
					
					this.APPROVAL_CYCLE = readString(dis);
					
					this.IN_STORE_PAYMENT_REQUIRED = readString(dis);
					
						this.IMMEDIATE_SETTLEMENT_VALUE = (BigDecimal) dis.readObject();
					
						this.CUSTOMER_AGE = (BigDecimal) dis.readObject();
					
					this.ALL_ADDRESSES_VERIFIED = readString(dis);
					
						this.COMPL_GIFT_BOX_QTY = (BigDecimal) dis.readObject();
					
						this.NO_OF_AUTH_STRIKES = (BigDecimal) dis.readObject();
					
					this.SOURCE_IP_ADDRESS = readString(dis);
					
					this.CUSTOMER_FIRST_NAME = readString(dis);
					
					this.CUSTOMER_LAST_NAME = readString(dis);
					
					this.CUSTOMER_PHONE_NO = readString(dis);
					
					this.CUSTOMER_ZIP_CODE = readString(dis);
					
						this.INDEX_VERSION = (BigDecimal) dis.readObject();
					
					this.EXTN_TOTAL_PRICE = readString(dis);
					
					this.CUSTOMER_EMAILID_LC = readString(dis);
					
					this.CUSTOMER_FIRST_NAME_LC = readString(dis);
					
					this.CUSTOMER_LAST_NAME_LC = readString(dis);
					
					this.CUSTOMER_ZIP_CODE_LC = readString(dis);
					
					this.ORDER_NAME_LC = readString(dis);
					
					this.EXTN_POINTS_EARNED = readString(dis);
					
					this.EXTN_TOTAL_POINTS_EARNED = readString(dis);
					
					this.EXTN_IS_TAX_CALCULATED = readString(dis);
					
					this.EXTN_VERTEX_ENGINE = readString(dis);
					
					this.EXTN_EVENT_TIME_STAMP = readString(dis);
					
					this.EXTN_FULFILLMENT_ID = readString(dis);
					
					this.EXTN_ORDER_TYPE = readString(dis);
					
					this.EXTN_FIRST_NAME = readString(dis);
					
					this.EXTN_EMP_LAST_NAME1 = readString(dis);
					
					this.EXTN_EMP_LAST_NAME2 = readString(dis);
					
					this.EXTN_EMP_DISC_LEVEL = readString(dis);
					
					this.EXTN_EMPLOYEE_ID = readString(dis);
					
						this.EXTN_ATTR_SEQ = (BigDecimal) dis.readObject();
					
					this.ORDER_NO_LC = readString(dis);
					
					this.EXTN_PAYPAL_AUTH_ID = readString(dis);
					
					this.EXTN_ORDER_DATE = readString(dis);
					
					this.EXTN_DTC_ORDER = readString(dis);
					
					this.EXTN_SOURCE = readString(dis);
					
					this.EXTN_ATG_CARRIER_CODE = readString(dis);
					
					this.EXTN_VOUCHER_AMT = readString(dis);
					
					this.EXTN_CUSTOMER_ALT_KEY = readString(dis);
					
					this.EXTN_IS_GUEST_CHECKOUT = readString(dis);
					
					this.EXTN_ATG_ORDER_NO = readString(dis);
					
					this.EXTN_PREFIX = readString(dis);
					
					this.EXTN_STORE_NO = readString(dis);
					
					this.EXTN_ORDER_TAX_AREA_ID = readString(dis);
					
					this.CART_ID = readString(dis);
					
						this.ROLLOUT_VERSION = (BigDecimal) dis.readObject();
					
					this.EXTN_IS_MIGRATED = readString(dis);
					
					this.EXTN_GENERATE_CALL_TAGALERT = readString(dis);
					
					this.EXTN_SUBSCRIPTION_ORDER = readString(dis);
					
					this.EXTN_CRM_CUSTOMER = readString(dis);
					
					this.EXTN_PRICING_DATE = readDate(dis);
					
					this.EXTN_ORIGINAL_ADP_ORDER = readString(dis);
					
					this.EXTN_MCL_ORDER_SHIPMENT_ID = readString(dis);
					
					this.EXTN_MCL_CHANNEL = readString(dis);
					
					this.EXTN_DM_BATCH_NO = readString(dis);
					
					this.EXTN_KOUNT_SESSION_ID = readString(dis);
					
					this.EXTN_SHIPMENT_CHARGE = readString(dis);
					
					this.EXTN_SHIPMENT_DISCOUNT = readString(dis);
					
					this.EXTN_ORDER_DISCOUNT = readString(dis);
					
					this.EXTN_ORDER_TAX = readString(dis);
					
					this.EXTN_RE_ORDER = readString(dis);
					
					this.EXTN_MOBILE_ORDER = readString(dis);
					
					this.EXTN_MOBILE_ORDER_TYPE = readString(dis);
					
					this.EXTN_NEW_ORDER = readString(dis);
					
					this.EXTN_VENDOR_ID = readString(dis);
					
					this.EXTN_DEPT_ID = readString(dis);
					
					this.EXTN_COST_CENTER = readString(dis);
					
					this.EXTN_TNS_AUTHORIZED = readString(dis);
					
					this.EXTN_BROWSER_IP = readString(dis);
					
					this.EXTN_CUSTOMER_CREATETS = readDate(dis);
					
					this.EXTN_USER_AGENT = readString(dis);
					
					this.EXTN_ACCEPT_LANG = readString(dis);
					
					this.EXTN_ATG_ORDERID = readString(dis);
					
					this.EXTN_RISKIFIED_SESSION = readString(dis);
					
					this.EXTN_CUSTOMER_TIER = readString(dis);
					
					this.EXTN_AURUS_TOKEN = readString(dis);
					
					this.EXTN_RISKIFIED_COUNT = readString(dis);
					
					this.EXTN_IS_MIXED_CART_ORDER = readString(dis);
					
					this.EXTN_BOL_NO = readString(dis);
					
					this.EXTN_DELIVERY_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_HEADER_H) {

        	try {

        		int length = 0;
		
					this.ORDER_HEADER_KEY = readString(dis);
					
					this.ENTERPRISE_KEY = readString(dis);
					
					this.ORDER_NO = readString(dis);
					
					this.SOURCING_CLASSIFICATION = readString(dis);
					
					this.BUYER_ORGANIZATION_CODE = readString(dis);
					
					this.SELLER_ORGANIZATION_CODE = readString(dis);
					
					this.DOCUMENT_TYPE = readString(dis);
					
					this.BILL_TO_KEY = readString(dis);
					
					this.BILL_TO_ID = readString(dis);
					
					this.CUSTOMER_REWARDS_NO = readString(dis);
					
					this.VENDOR_ID = readString(dis);
					
					this.SHIP_TO_KEY = readString(dis);
					
					this.SHIP_TO_ID = readString(dis);
					
					this.SHIP_NODE = readString(dis);
					
					this.RECEIVING_NODE = readString(dis);
					
					this.BUYER_RECEIVING_NODE_ID = readString(dis);
					
					this.MARK_FOR_KEY = readString(dis);
					
					this.BUYER_MARK_FOR_NODE_ID = readString(dis);
					
					this.REQ_DELIVERY_DATE = readDate(dis);
					
					this.REQ_CANCEL_DATE = readDate(dis);
					
					this.REQ_SHIP_DATE = readDate(dis);
					
					this.DEFAULT_TEMPLATE = readString(dis);
					
					this.DIVISION = readString(dis);
					
					this.ORDER_DATE = readDate(dis);
					
					this.ORDER_TYPE = readString(dis);
					
					this.DRAFT_ORDER_FLAG = readString(dis);
					
					this.ORDER_PURPOSE = readString(dis);
					
					this.RETURN_OH_KEY_FOR_EXCHANGE = readString(dis);
					
					this.EXCHANGE_TYPE = readString(dis);
					
						this.PENDING_TRANSFER_IN = (BigDecimal) dis.readObject();
					
					this.RETURN_BY_GIFT_RECIPIENT = readString(dis);
					
					this.ALLOCATION_RULE_ID = readString(dis);
					
					this.PRIORITY_CODE = readString(dis);
					
						this.PRIORITY_NUMBER = (BigDecimal) dis.readObject();
					
					this.CONTACT_KEY = readString(dis);
					
					this.SCAC = readString(dis);
					
					this.CARRIER_SERVICE_CODE = readString(dis);
					
					this.CUSTCARRIER_ACCOUNT_NO = readString(dis);
					
					this.NOTIFY_AFTER_SHIPMENT_FLAG = readString(dis);
					
					this.CREATED_AT_NODE = readString(dis);
					
					this.HAS_DERIVED_CHILD = readString(dis);
					
					this.HAS_DERIVED_PARENT = readString(dis);
					
					this.NOTIFICATION_TYPE = readString(dis);
					
					this.NOTIFICATION_REFERENCE = readString(dis);
					
					this.ENTRY_TYPE = readString(dis);
					
					this.AUTHORIZED_CLIENT = readString(dis);
					
					this.ENTERED_BY = readString(dis);
					
					this.PERSONALIZE_CODE = readString(dis);
					
					this.HOLD_FLAG = readString(dis);
					
					this.HOLD_REASON_CODE = readString(dis);
					
					this.CUSTOMER_PO_NO = readString(dis);
					
					this.CUSTOMER_CUSTOMER_PO_NO = readString(dis);
					
					this.ORDER_NAME = readString(dis);
					
					this.PAYMENT_RULE_ID = readString(dis);
					
					this.TERMS_CODE = readString(dis);
					
					this.DELIVERY_CODE = readString(dis);
					
					this.CHARGE_ACTUAL_FREIGHT = readString(dis);
					
						this.TAX = (BigDecimal) dis.readObject();
					
						this.TOTAL_AMOUNT = (BigDecimal) dis.readObject();
					
						this.ORIGINAL_TOTAL_AMOUNT = (BigDecimal) dis.readObject();
					
						this.ORIGINAL_TAX = (BigDecimal) dis.readObject();
					
					this.CURRENCY = readString(dis);
					
					this.ENTERPRISE_CURRENCY = readString(dis);
					
						this.REPORTING_CONVERSION_RATE = (BigDecimal) dis.readObject();
					
					this.REPORTING_CONVERSION_DATE = readDate(dis);
					
					this.PAYMENT_STATUS = readString(dis);
					
					this.AUTHORIZATION_EXPIRATION_DATE = readDate(dis);
					
					this.SEARCH_CRITERIA_1 = readString(dis);
					
					this.SEARCH_CRITERIA_2 = readString(dis);
					
					this.CUSTOMER_EMAILID = readString(dis);
					
					this.FOB = readString(dis);
					
						this.TOTAL_ADJUSTMENT_AMOUNT = (BigDecimal) dis.readObject();
					
						this.OTHER_CHARGES = (BigDecimal) dis.readObject();
					
					this.PRICE_PROGRAM_KEY = readString(dis);
					
					this.TAXPAYER_ID = readString(dis);
					
					this.TAX_JURISDICTION = readString(dis);
					
					this.TAX_EXEMPT_FLAG = readString(dis);
					
					this.TAX_EXEMPTION_CERTIFICATE = readString(dis);
					
					this.PURPOSE = readString(dis);
					
					this.INVOICE_COMPLETE = readString(dis);
					
					this.ORDER_CLOSED = readString(dis);
					
					this.NEXT_ALERT_TS = readDate(dis);
					
					this.DO_NOT_CONSOLIDATE = readString(dis);
					
					this.CHAIN_TYPE = readString(dis);
					
					this.ADJUSTMENT_INVOICE_PENDING = readString(dis);
					
					this.AUTO_CANCEL_DATE = readDate(dis);
					
					this.SALE_VOIDED = readString(dis);
					
					this.IS_SHIP_COMPLETE = readString(dis);
					
					this.IS_LINE_SHIP_COMPLETE = readString(dis);
					
					this.IS_SHIP_SINGLE_NODE = readString(dis);
					
					this.IS_LINE_SHIP_SINGLE_NODE = readString(dis);
					
					this.CANCEL_ORDER_ON_EXCP_FLAG = readString(dis);
					
					this.OPTIMIZATION_TYPE = readString(dis);
					
					this.PURGE_HISTORY_DATE = readDate(dis);
					
						this.PRICING_CLASSIFICATION_CODE = (BigDecimal) dis.readObject();
					
					this.SOURCE_TYPE = readString(dis);
					
						this.SOURCE_KEY = (BigDecimal) dis.readObject();
					
					this.LINKED_SOURCE_KEY = readString(dis);
					
						this.ORIGINAL_CONTAINER_KEY = (BigDecimal) dis.readObject();
					
					this.SOLD_TO_KEY = readString(dis);
					
					this.TEAM_CODE = readString(dis);
					
					this.LEVEL_OF_SERVICE = readString(dis);
					
						this.NEXT_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
					this.NEXT_ITER_DATE = readDate(dis);
					
						this.HRS_BEFORE_NEXT_ITER = (BigDecimal) dis.readObject();
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
					this.DEPARTMENT_CODE = readString(dis);
					
					this.BUYER_USER_ID = readString(dis);
					
					this.RECREATE_AUTHORIZATIONS = readString(dis);
					
					this.CUSTOMER_CONTACT_ID = readString(dis);
					
					this.OPPORTUNITY_KEY = readString(dis);
					
					this.IS_EXPIRATION_DATE_OVERRIDDEN = readString(dis);
					
					this.EXPIRATION_DATE = readDate(dis);
					
					this.APPROVAL_CYCLE = readString(dis);
					
					this.IN_STORE_PAYMENT_REQUIRED = readString(dis);
					
						this.IMMEDIATE_SETTLEMENT_VALUE = (BigDecimal) dis.readObject();
					
						this.CUSTOMER_AGE = (BigDecimal) dis.readObject();
					
					this.ALL_ADDRESSES_VERIFIED = readString(dis);
					
						this.COMPL_GIFT_BOX_QTY = (BigDecimal) dis.readObject();
					
						this.NO_OF_AUTH_STRIKES = (BigDecimal) dis.readObject();
					
					this.SOURCE_IP_ADDRESS = readString(dis);
					
					this.CUSTOMER_FIRST_NAME = readString(dis);
					
					this.CUSTOMER_LAST_NAME = readString(dis);
					
					this.CUSTOMER_PHONE_NO = readString(dis);
					
					this.CUSTOMER_ZIP_CODE = readString(dis);
					
						this.INDEX_VERSION = (BigDecimal) dis.readObject();
					
					this.EXTN_TOTAL_PRICE = readString(dis);
					
					this.CUSTOMER_EMAILID_LC = readString(dis);
					
					this.CUSTOMER_FIRST_NAME_LC = readString(dis);
					
					this.CUSTOMER_LAST_NAME_LC = readString(dis);
					
					this.CUSTOMER_ZIP_CODE_LC = readString(dis);
					
					this.ORDER_NAME_LC = readString(dis);
					
					this.EXTN_POINTS_EARNED = readString(dis);
					
					this.EXTN_TOTAL_POINTS_EARNED = readString(dis);
					
					this.EXTN_IS_TAX_CALCULATED = readString(dis);
					
					this.EXTN_VERTEX_ENGINE = readString(dis);
					
					this.EXTN_EVENT_TIME_STAMP = readString(dis);
					
					this.EXTN_FULFILLMENT_ID = readString(dis);
					
					this.EXTN_ORDER_TYPE = readString(dis);
					
					this.EXTN_FIRST_NAME = readString(dis);
					
					this.EXTN_EMP_LAST_NAME1 = readString(dis);
					
					this.EXTN_EMP_LAST_NAME2 = readString(dis);
					
					this.EXTN_EMP_DISC_LEVEL = readString(dis);
					
					this.EXTN_EMPLOYEE_ID = readString(dis);
					
						this.EXTN_ATTR_SEQ = (BigDecimal) dis.readObject();
					
					this.ORDER_NO_LC = readString(dis);
					
					this.EXTN_PAYPAL_AUTH_ID = readString(dis);
					
					this.EXTN_ORDER_DATE = readString(dis);
					
					this.EXTN_DTC_ORDER = readString(dis);
					
					this.EXTN_SOURCE = readString(dis);
					
					this.EXTN_ATG_CARRIER_CODE = readString(dis);
					
					this.EXTN_VOUCHER_AMT = readString(dis);
					
					this.EXTN_CUSTOMER_ALT_KEY = readString(dis);
					
					this.EXTN_IS_GUEST_CHECKOUT = readString(dis);
					
					this.EXTN_ATG_ORDER_NO = readString(dis);
					
					this.EXTN_PREFIX = readString(dis);
					
					this.EXTN_STORE_NO = readString(dis);
					
					this.EXTN_ORDER_TAX_AREA_ID = readString(dis);
					
					this.CART_ID = readString(dis);
					
						this.ROLLOUT_VERSION = (BigDecimal) dis.readObject();
					
					this.EXTN_IS_MIGRATED = readString(dis);
					
					this.EXTN_GENERATE_CALL_TAGALERT = readString(dis);
					
					this.EXTN_SUBSCRIPTION_ORDER = readString(dis);
					
					this.EXTN_CRM_CUSTOMER = readString(dis);
					
					this.EXTN_PRICING_DATE = readDate(dis);
					
					this.EXTN_ORIGINAL_ADP_ORDER = readString(dis);
					
					this.EXTN_MCL_ORDER_SHIPMENT_ID = readString(dis);
					
					this.EXTN_MCL_CHANNEL = readString(dis);
					
					this.EXTN_DM_BATCH_NO = readString(dis);
					
					this.EXTN_KOUNT_SESSION_ID = readString(dis);
					
					this.EXTN_SHIPMENT_CHARGE = readString(dis);
					
					this.EXTN_SHIPMENT_DISCOUNT = readString(dis);
					
					this.EXTN_ORDER_DISCOUNT = readString(dis);
					
					this.EXTN_ORDER_TAX = readString(dis);
					
					this.EXTN_RE_ORDER = readString(dis);
					
					this.EXTN_MOBILE_ORDER = readString(dis);
					
					this.EXTN_MOBILE_ORDER_TYPE = readString(dis);
					
					this.EXTN_NEW_ORDER = readString(dis);
					
					this.EXTN_VENDOR_ID = readString(dis);
					
					this.EXTN_DEPT_ID = readString(dis);
					
					this.EXTN_COST_CENTER = readString(dis);
					
					this.EXTN_TNS_AUTHORIZED = readString(dis);
					
					this.EXTN_BROWSER_IP = readString(dis);
					
					this.EXTN_CUSTOMER_CREATETS = readDate(dis);
					
					this.EXTN_USER_AGENT = readString(dis);
					
					this.EXTN_ACCEPT_LANG = readString(dis);
					
					this.EXTN_ATG_ORDERID = readString(dis);
					
					this.EXTN_RISKIFIED_SESSION = readString(dis);
					
					this.EXTN_CUSTOMER_TIER = readString(dis);
					
					this.EXTN_AURUS_TOKEN = readString(dis);
					
					this.EXTN_RISKIFIED_COUNT = readString(dis);
					
					this.EXTN_IS_MIXED_CART_ORDER = readString(dis);
					
					this.EXTN_BOL_NO = readString(dis);
					
					this.EXTN_DELIVERY_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.ENTERPRISE_KEY,dos);
					
					// String
				
						writeString(this.ORDER_NO,dos);
					
					// String
				
						writeString(this.SOURCING_CLASSIFICATION,dos);
					
					// String
				
						writeString(this.BUYER_ORGANIZATION_CODE,dos);
					
					// String
				
						writeString(this.SELLER_ORGANIZATION_CODE,dos);
					
					// String
				
						writeString(this.DOCUMENT_TYPE,dos);
					
					// String
				
						writeString(this.BILL_TO_KEY,dos);
					
					// String
				
						writeString(this.BILL_TO_ID,dos);
					
					// String
				
						writeString(this.CUSTOMER_REWARDS_NO,dos);
					
					// String
				
						writeString(this.VENDOR_ID,dos);
					
					// String
				
						writeString(this.SHIP_TO_KEY,dos);
					
					// String
				
						writeString(this.SHIP_TO_ID,dos);
					
					// String
				
						writeString(this.SHIP_NODE,dos);
					
					// String
				
						writeString(this.RECEIVING_NODE,dos);
					
					// String
				
						writeString(this.BUYER_RECEIVING_NODE_ID,dos);
					
					// String
				
						writeString(this.MARK_FOR_KEY,dos);
					
					// String
				
						writeString(this.BUYER_MARK_FOR_NODE_ID,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_DELIVERY_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_CANCEL_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_SHIP_DATE,dos);
					
					// String
				
						writeString(this.DEFAULT_TEMPLATE,dos);
					
					// String
				
						writeString(this.DIVISION,dos);
					
					// java.util.Date
				
						writeDate(this.ORDER_DATE,dos);
					
					// String
				
						writeString(this.ORDER_TYPE,dos);
					
					// String
				
						writeString(this.DRAFT_ORDER_FLAG,dos);
					
					// String
				
						writeString(this.ORDER_PURPOSE,dos);
					
					// String
				
						writeString(this.RETURN_OH_KEY_FOR_EXCHANGE,dos);
					
					// String
				
						writeString(this.EXCHANGE_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PENDING_TRANSFER_IN);
					
					// String
				
						writeString(this.RETURN_BY_GIFT_RECIPIENT,dos);
					
					// String
				
						writeString(this.ALLOCATION_RULE_ID,dos);
					
					// String
				
						writeString(this.PRIORITY_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIORITY_NUMBER);
					
					// String
				
						writeString(this.CONTACT_KEY,dos);
					
					// String
				
						writeString(this.SCAC,dos);
					
					// String
				
						writeString(this.CARRIER_SERVICE_CODE,dos);
					
					// String
				
						writeString(this.CUSTCARRIER_ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.NOTIFY_AFTER_SHIPMENT_FLAG,dos);
					
					// String
				
						writeString(this.CREATED_AT_NODE,dos);
					
					// String
				
						writeString(this.HAS_DERIVED_CHILD,dos);
					
					// String
				
						writeString(this.HAS_DERIVED_PARENT,dos);
					
					// String
				
						writeString(this.NOTIFICATION_TYPE,dos);
					
					// String
				
						writeString(this.NOTIFICATION_REFERENCE,dos);
					
					// String
				
						writeString(this.ENTRY_TYPE,dos);
					
					// String
				
						writeString(this.AUTHORIZED_CLIENT,dos);
					
					// String
				
						writeString(this.ENTERED_BY,dos);
					
					// String
				
						writeString(this.PERSONALIZE_CODE,dos);
					
					// String
				
						writeString(this.HOLD_FLAG,dos);
					
					// String
				
						writeString(this.HOLD_REASON_CODE,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.ORDER_NAME,dos);
					
					// String
				
						writeString(this.PAYMENT_RULE_ID,dos);
					
					// String
				
						writeString(this.TERMS_CODE,dos);
					
					// String
				
						writeString(this.DELIVERY_CODE,dos);
					
					// String
				
						writeString(this.CHARGE_ACTUAL_FREIGHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TOTAL_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_TOTAL_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_TAX);
					
					// String
				
						writeString(this.CURRENCY,dos);
					
					// String
				
						writeString(this.ENTERPRISE_CURRENCY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPORTING_CONVERSION_RATE);
					
					// java.util.Date
				
						writeDate(this.REPORTING_CONVERSION_DATE,dos);
					
					// String
				
						writeString(this.PAYMENT_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.AUTHORIZATION_EXPIRATION_DATE,dos);
					
					// String
				
						writeString(this.SEARCH_CRITERIA_1,dos);
					
					// String
				
						writeString(this.SEARCH_CRITERIA_2,dos);
					
					// String
				
						writeString(this.CUSTOMER_EMAILID,dos);
					
					// String
				
						writeString(this.FOB,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TOTAL_ADJUSTMENT_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OTHER_CHARGES);
					
					// String
				
						writeString(this.PRICE_PROGRAM_KEY,dos);
					
					// String
				
						writeString(this.TAXPAYER_ID,dos);
					
					// String
				
						writeString(this.TAX_JURISDICTION,dos);
					
					// String
				
						writeString(this.TAX_EXEMPT_FLAG,dos);
					
					// String
				
						writeString(this.TAX_EXEMPTION_CERTIFICATE,dos);
					
					// String
				
						writeString(this.PURPOSE,dos);
					
					// String
				
						writeString(this.INVOICE_COMPLETE,dos);
					
					// String
				
						writeString(this.ORDER_CLOSED,dos);
					
					// java.util.Date
				
						writeDate(this.NEXT_ALERT_TS,dos);
					
					// String
				
						writeString(this.DO_NOT_CONSOLIDATE,dos);
					
					// String
				
						writeString(this.CHAIN_TYPE,dos);
					
					// String
				
						writeString(this.ADJUSTMENT_INVOICE_PENDING,dos);
					
					// java.util.Date
				
						writeDate(this.AUTO_CANCEL_DATE,dos);
					
					// String
				
						writeString(this.SALE_VOIDED,dos);
					
					// String
				
						writeString(this.IS_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.IS_LINE_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.IS_SHIP_SINGLE_NODE,dos);
					
					// String
				
						writeString(this.IS_LINE_SHIP_SINGLE_NODE,dos);
					
					// String
				
						writeString(this.CANCEL_ORDER_ON_EXCP_FLAG,dos);
					
					// String
				
						writeString(this.OPTIMIZATION_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.PURGE_HISTORY_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_CLASSIFICATION_CODE);
					
					// String
				
						writeString(this.SOURCE_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOURCE_KEY);
					
					// String
				
						writeString(this.LINKED_SOURCE_KEY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_CONTAINER_KEY);
					
					// String
				
						writeString(this.SOLD_TO_KEY,dos);
					
					// String
				
						writeString(this.TEAM_CODE,dos);
					
					// String
				
						writeString(this.LEVEL_OF_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NEXT_ITER_SEQ_NO);
					
					// java.util.Date
				
						writeDate(this.NEXT_ITER_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.HRS_BEFORE_NEXT_ITER);
					
					// java.util.Date
				
						writeDate(this.CREATETS,dos);
					
					// java.util.Date
				
						writeDate(this.MODIFYTS,dos);
					
					// String
				
						writeString(this.CREATEUSERID,dos);
					
					// String
				
						writeString(this.MODIFYUSERID,dos);
					
					// String
				
						writeString(this.CREATEPROGID,dos);
					
					// String
				
						writeString(this.MODIFYPROGID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LOCKID);
					
					// String
				
						writeString(this.DEPARTMENT_CODE,dos);
					
					// String
				
						writeString(this.BUYER_USER_ID,dos);
					
					// String
				
						writeString(this.RECREATE_AUTHORIZATIONS,dos);
					
					// String
				
						writeString(this.CUSTOMER_CONTACT_ID,dos);
					
					// String
				
						writeString(this.OPPORTUNITY_KEY,dos);
					
					// String
				
						writeString(this.IS_EXPIRATION_DATE_OVERRIDDEN,dos);
					
					// java.util.Date
				
						writeDate(this.EXPIRATION_DATE,dos);
					
					// String
				
						writeString(this.APPROVAL_CYCLE,dos);
					
					// String
				
						writeString(this.IN_STORE_PAYMENT_REQUIRED,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMMEDIATE_SETTLEMENT_VALUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CUSTOMER_AGE);
					
					// String
				
						writeString(this.ALL_ADDRESSES_VERIFIED,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.COMPL_GIFT_BOX_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NO_OF_AUTH_STRIKES);
					
					// String
				
						writeString(this.SOURCE_IP_ADDRESS,dos);
					
					// String
				
						writeString(this.CUSTOMER_FIRST_NAME,dos);
					
					// String
				
						writeString(this.CUSTOMER_LAST_NAME,dos);
					
					// String
				
						writeString(this.CUSTOMER_PHONE_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_ZIP_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INDEX_VERSION);
					
					// String
				
						writeString(this.EXTN_TOTAL_PRICE,dos);
					
					// String
				
						writeString(this.CUSTOMER_EMAILID_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_FIRST_NAME_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_LAST_NAME_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_ZIP_CODE_LC,dos);
					
					// String
				
						writeString(this.ORDER_NAME_LC,dos);
					
					// String
				
						writeString(this.EXTN_POINTS_EARNED,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_POINTS_EARNED,dos);
					
					// String
				
						writeString(this.EXTN_IS_TAX_CALCULATED,dos);
					
					// String
				
						writeString(this.EXTN_VERTEX_ENGINE,dos);
					
					// String
				
						writeString(this.EXTN_EVENT_TIME_STAMP,dos);
					
					// String
				
						writeString(this.EXTN_FULFILLMENT_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_FIRST_NAME,dos);
					
					// String
				
						writeString(this.EXTN_EMP_LAST_NAME1,dos);
					
					// String
				
						writeString(this.EXTN_EMP_LAST_NAME2,dos);
					
					// String
				
						writeString(this.EXTN_EMP_DISC_LEVEL,dos);
					
					// String
				
						writeString(this.EXTN_EMPLOYEE_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_ATTR_SEQ);
					
					// String
				
						writeString(this.ORDER_NO_LC,dos);
					
					// String
				
						writeString(this.EXTN_PAYPAL_AUTH_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_DATE,dos);
					
					// String
				
						writeString(this.EXTN_DTC_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_SOURCE,dos);
					
					// String
				
						writeString(this.EXTN_ATG_CARRIER_CODE,dos);
					
					// String
				
						writeString(this.EXTN_VOUCHER_AMT,dos);
					
					// String
				
						writeString(this.EXTN_CUSTOMER_ALT_KEY,dos);
					
					// String
				
						writeString(this.EXTN_IS_GUEST_CHECKOUT,dos);
					
					// String
				
						writeString(this.EXTN_ATG_ORDER_NO,dos);
					
					// String
				
						writeString(this.EXTN_PREFIX,dos);
					
					// String
				
						writeString(this.EXTN_STORE_NO,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TAX_AREA_ID,dos);
					
					// String
				
						writeString(this.CART_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ROLLOUT_VERSION);
					
					// String
				
						writeString(this.EXTN_IS_MIGRATED,dos);
					
					// String
				
						writeString(this.EXTN_GENERATE_CALL_TAGALERT,dos);
					
					// String
				
						writeString(this.EXTN_SUBSCRIPTION_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_CRM_CUSTOMER,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_PRICING_DATE,dos);
					
					// String
				
						writeString(this.EXTN_ORIGINAL_ADP_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MCL_ORDER_SHIPMENT_ID,dos);
					
					// String
				
						writeString(this.EXTN_MCL_CHANNEL,dos);
					
					// String
				
						writeString(this.EXTN_DM_BATCH_NO,dos);
					
					// String
				
						writeString(this.EXTN_KOUNT_SESSION_ID,dos);
					
					// String
				
						writeString(this.EXTN_SHIPMENT_CHARGE,dos);
					
					// String
				
						writeString(this.EXTN_SHIPMENT_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TAX,dos);
					
					// String
				
						writeString(this.EXTN_RE_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MOBILE_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MOBILE_ORDER_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_NEW_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_VENDOR_ID,dos);
					
					// String
				
						writeString(this.EXTN_DEPT_ID,dos);
					
					// String
				
						writeString(this.EXTN_COST_CENTER,dos);
					
					// String
				
						writeString(this.EXTN_TNS_AUTHORIZED,dos);
					
					// String
				
						writeString(this.EXTN_BROWSER_IP,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_CUSTOMER_CREATETS,dos);
					
					// String
				
						writeString(this.EXTN_USER_AGENT,dos);
					
					// String
				
						writeString(this.EXTN_ACCEPT_LANG,dos);
					
					// String
				
						writeString(this.EXTN_ATG_ORDERID,dos);
					
					// String
				
						writeString(this.EXTN_RISKIFIED_SESSION,dos);
					
					// String
				
						writeString(this.EXTN_CUSTOMER_TIER,dos);
					
					// String
				
						writeString(this.EXTN_AURUS_TOKEN,dos);
					
					// String
				
						writeString(this.EXTN_RISKIFIED_COUNT,dos);
					
					// String
				
						writeString(this.EXTN_IS_MIXED_CART_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_BOL_NO,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVERY_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.ENTERPRISE_KEY,dos);
					
					// String
				
						writeString(this.ORDER_NO,dos);
					
					// String
				
						writeString(this.SOURCING_CLASSIFICATION,dos);
					
					// String
				
						writeString(this.BUYER_ORGANIZATION_CODE,dos);
					
					// String
				
						writeString(this.SELLER_ORGANIZATION_CODE,dos);
					
					// String
				
						writeString(this.DOCUMENT_TYPE,dos);
					
					// String
				
						writeString(this.BILL_TO_KEY,dos);
					
					// String
				
						writeString(this.BILL_TO_ID,dos);
					
					// String
				
						writeString(this.CUSTOMER_REWARDS_NO,dos);
					
					// String
				
						writeString(this.VENDOR_ID,dos);
					
					// String
				
						writeString(this.SHIP_TO_KEY,dos);
					
					// String
				
						writeString(this.SHIP_TO_ID,dos);
					
					// String
				
						writeString(this.SHIP_NODE,dos);
					
					// String
				
						writeString(this.RECEIVING_NODE,dos);
					
					// String
				
						writeString(this.BUYER_RECEIVING_NODE_ID,dos);
					
					// String
				
						writeString(this.MARK_FOR_KEY,dos);
					
					// String
				
						writeString(this.BUYER_MARK_FOR_NODE_ID,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_DELIVERY_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_CANCEL_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.REQ_SHIP_DATE,dos);
					
					// String
				
						writeString(this.DEFAULT_TEMPLATE,dos);
					
					// String
				
						writeString(this.DIVISION,dos);
					
					// java.util.Date
				
						writeDate(this.ORDER_DATE,dos);
					
					// String
				
						writeString(this.ORDER_TYPE,dos);
					
					// String
				
						writeString(this.DRAFT_ORDER_FLAG,dos);
					
					// String
				
						writeString(this.ORDER_PURPOSE,dos);
					
					// String
				
						writeString(this.RETURN_OH_KEY_FOR_EXCHANGE,dos);
					
					// String
				
						writeString(this.EXCHANGE_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PENDING_TRANSFER_IN);
					
					// String
				
						writeString(this.RETURN_BY_GIFT_RECIPIENT,dos);
					
					// String
				
						writeString(this.ALLOCATION_RULE_ID,dos);
					
					// String
				
						writeString(this.PRIORITY_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIORITY_NUMBER);
					
					// String
				
						writeString(this.CONTACT_KEY,dos);
					
					// String
				
						writeString(this.SCAC,dos);
					
					// String
				
						writeString(this.CARRIER_SERVICE_CODE,dos);
					
					// String
				
						writeString(this.CUSTCARRIER_ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.NOTIFY_AFTER_SHIPMENT_FLAG,dos);
					
					// String
				
						writeString(this.CREATED_AT_NODE,dos);
					
					// String
				
						writeString(this.HAS_DERIVED_CHILD,dos);
					
					// String
				
						writeString(this.HAS_DERIVED_PARENT,dos);
					
					// String
				
						writeString(this.NOTIFICATION_TYPE,dos);
					
					// String
				
						writeString(this.NOTIFICATION_REFERENCE,dos);
					
					// String
				
						writeString(this.ENTRY_TYPE,dos);
					
					// String
				
						writeString(this.AUTHORIZED_CLIENT,dos);
					
					// String
				
						writeString(this.ENTERED_BY,dos);
					
					// String
				
						writeString(this.PERSONALIZE_CODE,dos);
					
					// String
				
						writeString(this.HOLD_FLAG,dos);
					
					// String
				
						writeString(this.HOLD_REASON_CODE,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.ORDER_NAME,dos);
					
					// String
				
						writeString(this.PAYMENT_RULE_ID,dos);
					
					// String
				
						writeString(this.TERMS_CODE,dos);
					
					// String
				
						writeString(this.DELIVERY_CODE,dos);
					
					// String
				
						writeString(this.CHARGE_ACTUAL_FREIGHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TOTAL_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_TOTAL_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_TAX);
					
					// String
				
						writeString(this.CURRENCY,dos);
					
					// String
				
						writeString(this.ENTERPRISE_CURRENCY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPORTING_CONVERSION_RATE);
					
					// java.util.Date
				
						writeDate(this.REPORTING_CONVERSION_DATE,dos);
					
					// String
				
						writeString(this.PAYMENT_STATUS,dos);
					
					// java.util.Date
				
						writeDate(this.AUTHORIZATION_EXPIRATION_DATE,dos);
					
					// String
				
						writeString(this.SEARCH_CRITERIA_1,dos);
					
					// String
				
						writeString(this.SEARCH_CRITERIA_2,dos);
					
					// String
				
						writeString(this.CUSTOMER_EMAILID,dos);
					
					// String
				
						writeString(this.FOB,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TOTAL_ADJUSTMENT_AMOUNT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OTHER_CHARGES);
					
					// String
				
						writeString(this.PRICE_PROGRAM_KEY,dos);
					
					// String
				
						writeString(this.TAXPAYER_ID,dos);
					
					// String
				
						writeString(this.TAX_JURISDICTION,dos);
					
					// String
				
						writeString(this.TAX_EXEMPT_FLAG,dos);
					
					// String
				
						writeString(this.TAX_EXEMPTION_CERTIFICATE,dos);
					
					// String
				
						writeString(this.PURPOSE,dos);
					
					// String
				
						writeString(this.INVOICE_COMPLETE,dos);
					
					// String
				
						writeString(this.ORDER_CLOSED,dos);
					
					// java.util.Date
				
						writeDate(this.NEXT_ALERT_TS,dos);
					
					// String
				
						writeString(this.DO_NOT_CONSOLIDATE,dos);
					
					// String
				
						writeString(this.CHAIN_TYPE,dos);
					
					// String
				
						writeString(this.ADJUSTMENT_INVOICE_PENDING,dos);
					
					// java.util.Date
				
						writeDate(this.AUTO_CANCEL_DATE,dos);
					
					// String
				
						writeString(this.SALE_VOIDED,dos);
					
					// String
				
						writeString(this.IS_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.IS_LINE_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.IS_SHIP_SINGLE_NODE,dos);
					
					// String
				
						writeString(this.IS_LINE_SHIP_SINGLE_NODE,dos);
					
					// String
				
						writeString(this.CANCEL_ORDER_ON_EXCP_FLAG,dos);
					
					// String
				
						writeString(this.OPTIMIZATION_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.PURGE_HISTORY_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_CLASSIFICATION_CODE);
					
					// String
				
						writeString(this.SOURCE_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOURCE_KEY);
					
					// String
				
						writeString(this.LINKED_SOURCE_KEY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_CONTAINER_KEY);
					
					// String
				
						writeString(this.SOLD_TO_KEY,dos);
					
					// String
				
						writeString(this.TEAM_CODE,dos);
					
					// String
				
						writeString(this.LEVEL_OF_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NEXT_ITER_SEQ_NO);
					
					// java.util.Date
				
						writeDate(this.NEXT_ITER_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.HRS_BEFORE_NEXT_ITER);
					
					// java.util.Date
				
						writeDate(this.CREATETS,dos);
					
					// java.util.Date
				
						writeDate(this.MODIFYTS,dos);
					
					// String
				
						writeString(this.CREATEUSERID,dos);
					
					// String
				
						writeString(this.MODIFYUSERID,dos);
					
					// String
				
						writeString(this.CREATEPROGID,dos);
					
					// String
				
						writeString(this.MODIFYPROGID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LOCKID);
					
					// String
				
						writeString(this.DEPARTMENT_CODE,dos);
					
					// String
				
						writeString(this.BUYER_USER_ID,dos);
					
					// String
				
						writeString(this.RECREATE_AUTHORIZATIONS,dos);
					
					// String
				
						writeString(this.CUSTOMER_CONTACT_ID,dos);
					
					// String
				
						writeString(this.OPPORTUNITY_KEY,dos);
					
					// String
				
						writeString(this.IS_EXPIRATION_DATE_OVERRIDDEN,dos);
					
					// java.util.Date
				
						writeDate(this.EXPIRATION_DATE,dos);
					
					// String
				
						writeString(this.APPROVAL_CYCLE,dos);
					
					// String
				
						writeString(this.IN_STORE_PAYMENT_REQUIRED,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.IMMEDIATE_SETTLEMENT_VALUE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CUSTOMER_AGE);
					
					// String
				
						writeString(this.ALL_ADDRESSES_VERIFIED,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.COMPL_GIFT_BOX_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.NO_OF_AUTH_STRIKES);
					
					// String
				
						writeString(this.SOURCE_IP_ADDRESS,dos);
					
					// String
				
						writeString(this.CUSTOMER_FIRST_NAME,dos);
					
					// String
				
						writeString(this.CUSTOMER_LAST_NAME,dos);
					
					// String
				
						writeString(this.CUSTOMER_PHONE_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_ZIP_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INDEX_VERSION);
					
					// String
				
						writeString(this.EXTN_TOTAL_PRICE,dos);
					
					// String
				
						writeString(this.CUSTOMER_EMAILID_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_FIRST_NAME_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_LAST_NAME_LC,dos);
					
					// String
				
						writeString(this.CUSTOMER_ZIP_CODE_LC,dos);
					
					// String
				
						writeString(this.ORDER_NAME_LC,dos);
					
					// String
				
						writeString(this.EXTN_POINTS_EARNED,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_POINTS_EARNED,dos);
					
					// String
				
						writeString(this.EXTN_IS_TAX_CALCULATED,dos);
					
					// String
				
						writeString(this.EXTN_VERTEX_ENGINE,dos);
					
					// String
				
						writeString(this.EXTN_EVENT_TIME_STAMP,dos);
					
					// String
				
						writeString(this.EXTN_FULFILLMENT_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_FIRST_NAME,dos);
					
					// String
				
						writeString(this.EXTN_EMP_LAST_NAME1,dos);
					
					// String
				
						writeString(this.EXTN_EMP_LAST_NAME2,dos);
					
					// String
				
						writeString(this.EXTN_EMP_DISC_LEVEL,dos);
					
					// String
				
						writeString(this.EXTN_EMPLOYEE_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_ATTR_SEQ);
					
					// String
				
						writeString(this.ORDER_NO_LC,dos);
					
					// String
				
						writeString(this.EXTN_PAYPAL_AUTH_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_DATE,dos);
					
					// String
				
						writeString(this.EXTN_DTC_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_SOURCE,dos);
					
					// String
				
						writeString(this.EXTN_ATG_CARRIER_CODE,dos);
					
					// String
				
						writeString(this.EXTN_VOUCHER_AMT,dos);
					
					// String
				
						writeString(this.EXTN_CUSTOMER_ALT_KEY,dos);
					
					// String
				
						writeString(this.EXTN_IS_GUEST_CHECKOUT,dos);
					
					// String
				
						writeString(this.EXTN_ATG_ORDER_NO,dos);
					
					// String
				
						writeString(this.EXTN_PREFIX,dos);
					
					// String
				
						writeString(this.EXTN_STORE_NO,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TAX_AREA_ID,dos);
					
					// String
				
						writeString(this.CART_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ROLLOUT_VERSION);
					
					// String
				
						writeString(this.EXTN_IS_MIGRATED,dos);
					
					// String
				
						writeString(this.EXTN_GENERATE_CALL_TAGALERT,dos);
					
					// String
				
						writeString(this.EXTN_SUBSCRIPTION_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_CRM_CUSTOMER,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_PRICING_DATE,dos);
					
					// String
				
						writeString(this.EXTN_ORIGINAL_ADP_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MCL_ORDER_SHIPMENT_ID,dos);
					
					// String
				
						writeString(this.EXTN_MCL_CHANNEL,dos);
					
					// String
				
						writeString(this.EXTN_DM_BATCH_NO,dos);
					
					// String
				
						writeString(this.EXTN_KOUNT_SESSION_ID,dos);
					
					// String
				
						writeString(this.EXTN_SHIPMENT_CHARGE,dos);
					
					// String
				
						writeString(this.EXTN_SHIPMENT_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_ORDER_TAX,dos);
					
					// String
				
						writeString(this.EXTN_RE_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MOBILE_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_MOBILE_ORDER_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_NEW_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_VENDOR_ID,dos);
					
					// String
				
						writeString(this.EXTN_DEPT_ID,dos);
					
					// String
				
						writeString(this.EXTN_COST_CENTER,dos);
					
					// String
				
						writeString(this.EXTN_TNS_AUTHORIZED,dos);
					
					// String
				
						writeString(this.EXTN_BROWSER_IP,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_CUSTOMER_CREATETS,dos);
					
					// String
				
						writeString(this.EXTN_USER_AGENT,dos);
					
					// String
				
						writeString(this.EXTN_ACCEPT_LANG,dos);
					
					// String
				
						writeString(this.EXTN_ATG_ORDERID,dos);
					
					// String
				
						writeString(this.EXTN_RISKIFIED_SESSION,dos);
					
					// String
				
						writeString(this.EXTN_CUSTOMER_TIER,dos);
					
					// String
				
						writeString(this.EXTN_AURUS_TOKEN,dos);
					
					// String
				
						writeString(this.EXTN_RISKIFIED_COUNT,dos);
					
					// String
				
						writeString(this.EXTN_IS_MIXED_CART_ORDER,dos);
					
					// String
				
						writeString(this.EXTN_BOL_NO,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVERY_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ORDER_HEADER_KEY="+ORDER_HEADER_KEY);
		sb.append(",ENTERPRISE_KEY="+ENTERPRISE_KEY);
		sb.append(",ORDER_NO="+ORDER_NO);
		sb.append(",SOURCING_CLASSIFICATION="+SOURCING_CLASSIFICATION);
		sb.append(",BUYER_ORGANIZATION_CODE="+BUYER_ORGANIZATION_CODE);
		sb.append(",SELLER_ORGANIZATION_CODE="+SELLER_ORGANIZATION_CODE);
		sb.append(",DOCUMENT_TYPE="+DOCUMENT_TYPE);
		sb.append(",BILL_TO_KEY="+BILL_TO_KEY);
		sb.append(",BILL_TO_ID="+BILL_TO_ID);
		sb.append(",CUSTOMER_REWARDS_NO="+CUSTOMER_REWARDS_NO);
		sb.append(",VENDOR_ID="+VENDOR_ID);
		sb.append(",SHIP_TO_KEY="+SHIP_TO_KEY);
		sb.append(",SHIP_TO_ID="+SHIP_TO_ID);
		sb.append(",SHIP_NODE="+SHIP_NODE);
		sb.append(",RECEIVING_NODE="+RECEIVING_NODE);
		sb.append(",BUYER_RECEIVING_NODE_ID="+BUYER_RECEIVING_NODE_ID);
		sb.append(",MARK_FOR_KEY="+MARK_FOR_KEY);
		sb.append(",BUYER_MARK_FOR_NODE_ID="+BUYER_MARK_FOR_NODE_ID);
		sb.append(",REQ_DELIVERY_DATE="+String.valueOf(REQ_DELIVERY_DATE));
		sb.append(",REQ_CANCEL_DATE="+String.valueOf(REQ_CANCEL_DATE));
		sb.append(",REQ_SHIP_DATE="+String.valueOf(REQ_SHIP_DATE));
		sb.append(",DEFAULT_TEMPLATE="+DEFAULT_TEMPLATE);
		sb.append(",DIVISION="+DIVISION);
		sb.append(",ORDER_DATE="+String.valueOf(ORDER_DATE));
		sb.append(",ORDER_TYPE="+ORDER_TYPE);
		sb.append(",DRAFT_ORDER_FLAG="+DRAFT_ORDER_FLAG);
		sb.append(",ORDER_PURPOSE="+ORDER_PURPOSE);
		sb.append(",RETURN_OH_KEY_FOR_EXCHANGE="+RETURN_OH_KEY_FOR_EXCHANGE);
		sb.append(",EXCHANGE_TYPE="+EXCHANGE_TYPE);
		sb.append(",PENDING_TRANSFER_IN="+String.valueOf(PENDING_TRANSFER_IN));
		sb.append(",RETURN_BY_GIFT_RECIPIENT="+RETURN_BY_GIFT_RECIPIENT);
		sb.append(",ALLOCATION_RULE_ID="+ALLOCATION_RULE_ID);
		sb.append(",PRIORITY_CODE="+PRIORITY_CODE);
		sb.append(",PRIORITY_NUMBER="+String.valueOf(PRIORITY_NUMBER));
		sb.append(",CONTACT_KEY="+CONTACT_KEY);
		sb.append(",SCAC="+SCAC);
		sb.append(",CARRIER_SERVICE_CODE="+CARRIER_SERVICE_CODE);
		sb.append(",CUSTCARRIER_ACCOUNT_NO="+CUSTCARRIER_ACCOUNT_NO);
		sb.append(",NOTIFY_AFTER_SHIPMENT_FLAG="+NOTIFY_AFTER_SHIPMENT_FLAG);
		sb.append(",CREATED_AT_NODE="+CREATED_AT_NODE);
		sb.append(",HAS_DERIVED_CHILD="+HAS_DERIVED_CHILD);
		sb.append(",HAS_DERIVED_PARENT="+HAS_DERIVED_PARENT);
		sb.append(",NOTIFICATION_TYPE="+NOTIFICATION_TYPE);
		sb.append(",NOTIFICATION_REFERENCE="+NOTIFICATION_REFERENCE);
		sb.append(",ENTRY_TYPE="+ENTRY_TYPE);
		sb.append(",AUTHORIZED_CLIENT="+AUTHORIZED_CLIENT);
		sb.append(",ENTERED_BY="+ENTERED_BY);
		sb.append(",PERSONALIZE_CODE="+PERSONALIZE_CODE);
		sb.append(",HOLD_FLAG="+HOLD_FLAG);
		sb.append(",HOLD_REASON_CODE="+HOLD_REASON_CODE);
		sb.append(",CUSTOMER_PO_NO="+CUSTOMER_PO_NO);
		sb.append(",CUSTOMER_CUSTOMER_PO_NO="+CUSTOMER_CUSTOMER_PO_NO);
		sb.append(",ORDER_NAME="+ORDER_NAME);
		sb.append(",PAYMENT_RULE_ID="+PAYMENT_RULE_ID);
		sb.append(",TERMS_CODE="+TERMS_CODE);
		sb.append(",DELIVERY_CODE="+DELIVERY_CODE);
		sb.append(",CHARGE_ACTUAL_FREIGHT="+CHARGE_ACTUAL_FREIGHT);
		sb.append(",TAX="+String.valueOf(TAX));
		sb.append(",TOTAL_AMOUNT="+String.valueOf(TOTAL_AMOUNT));
		sb.append(",ORIGINAL_TOTAL_AMOUNT="+String.valueOf(ORIGINAL_TOTAL_AMOUNT));
		sb.append(",ORIGINAL_TAX="+String.valueOf(ORIGINAL_TAX));
		sb.append(",CURRENCY="+CURRENCY);
		sb.append(",ENTERPRISE_CURRENCY="+ENTERPRISE_CURRENCY);
		sb.append(",REPORTING_CONVERSION_RATE="+String.valueOf(REPORTING_CONVERSION_RATE));
		sb.append(",REPORTING_CONVERSION_DATE="+String.valueOf(REPORTING_CONVERSION_DATE));
		sb.append(",PAYMENT_STATUS="+PAYMENT_STATUS);
		sb.append(",AUTHORIZATION_EXPIRATION_DATE="+String.valueOf(AUTHORIZATION_EXPIRATION_DATE));
		sb.append(",SEARCH_CRITERIA_1="+SEARCH_CRITERIA_1);
		sb.append(",SEARCH_CRITERIA_2="+SEARCH_CRITERIA_2);
		sb.append(",CUSTOMER_EMAILID="+CUSTOMER_EMAILID);
		sb.append(",FOB="+FOB);
		sb.append(",TOTAL_ADJUSTMENT_AMOUNT="+String.valueOf(TOTAL_ADJUSTMENT_AMOUNT));
		sb.append(",OTHER_CHARGES="+String.valueOf(OTHER_CHARGES));
		sb.append(",PRICE_PROGRAM_KEY="+PRICE_PROGRAM_KEY);
		sb.append(",TAXPAYER_ID="+TAXPAYER_ID);
		sb.append(",TAX_JURISDICTION="+TAX_JURISDICTION);
		sb.append(",TAX_EXEMPT_FLAG="+TAX_EXEMPT_FLAG);
		sb.append(",TAX_EXEMPTION_CERTIFICATE="+TAX_EXEMPTION_CERTIFICATE);
		sb.append(",PURPOSE="+PURPOSE);
		sb.append(",INVOICE_COMPLETE="+INVOICE_COMPLETE);
		sb.append(",ORDER_CLOSED="+ORDER_CLOSED);
		sb.append(",NEXT_ALERT_TS="+String.valueOf(NEXT_ALERT_TS));
		sb.append(",DO_NOT_CONSOLIDATE="+DO_NOT_CONSOLIDATE);
		sb.append(",CHAIN_TYPE="+CHAIN_TYPE);
		sb.append(",ADJUSTMENT_INVOICE_PENDING="+ADJUSTMENT_INVOICE_PENDING);
		sb.append(",AUTO_CANCEL_DATE="+String.valueOf(AUTO_CANCEL_DATE));
		sb.append(",SALE_VOIDED="+SALE_VOIDED);
		sb.append(",IS_SHIP_COMPLETE="+IS_SHIP_COMPLETE);
		sb.append(",IS_LINE_SHIP_COMPLETE="+IS_LINE_SHIP_COMPLETE);
		sb.append(",IS_SHIP_SINGLE_NODE="+IS_SHIP_SINGLE_NODE);
		sb.append(",IS_LINE_SHIP_SINGLE_NODE="+IS_LINE_SHIP_SINGLE_NODE);
		sb.append(",CANCEL_ORDER_ON_EXCP_FLAG="+CANCEL_ORDER_ON_EXCP_FLAG);
		sb.append(",OPTIMIZATION_TYPE="+OPTIMIZATION_TYPE);
		sb.append(",PURGE_HISTORY_DATE="+String.valueOf(PURGE_HISTORY_DATE));
		sb.append(",PRICING_CLASSIFICATION_CODE="+String.valueOf(PRICING_CLASSIFICATION_CODE));
		sb.append(",SOURCE_TYPE="+SOURCE_TYPE);
		sb.append(",SOURCE_KEY="+String.valueOf(SOURCE_KEY));
		sb.append(",LINKED_SOURCE_KEY="+LINKED_SOURCE_KEY);
		sb.append(",ORIGINAL_CONTAINER_KEY="+String.valueOf(ORIGINAL_CONTAINER_KEY));
		sb.append(",SOLD_TO_KEY="+SOLD_TO_KEY);
		sb.append(",TEAM_CODE="+TEAM_CODE);
		sb.append(",LEVEL_OF_SERVICE="+LEVEL_OF_SERVICE);
		sb.append(",NEXT_ITER_SEQ_NO="+String.valueOf(NEXT_ITER_SEQ_NO));
		sb.append(",NEXT_ITER_DATE="+String.valueOf(NEXT_ITER_DATE));
		sb.append(",HRS_BEFORE_NEXT_ITER="+String.valueOf(HRS_BEFORE_NEXT_ITER));
		sb.append(",CREATETS="+String.valueOf(CREATETS));
		sb.append(",MODIFYTS="+String.valueOf(MODIFYTS));
		sb.append(",CREATEUSERID="+CREATEUSERID);
		sb.append(",MODIFYUSERID="+MODIFYUSERID);
		sb.append(",CREATEPROGID="+CREATEPROGID);
		sb.append(",MODIFYPROGID="+MODIFYPROGID);
		sb.append(",LOCKID="+String.valueOf(LOCKID));
		sb.append(",DEPARTMENT_CODE="+DEPARTMENT_CODE);
		sb.append(",BUYER_USER_ID="+BUYER_USER_ID);
		sb.append(",RECREATE_AUTHORIZATIONS="+RECREATE_AUTHORIZATIONS);
		sb.append(",CUSTOMER_CONTACT_ID="+CUSTOMER_CONTACT_ID);
		sb.append(",OPPORTUNITY_KEY="+OPPORTUNITY_KEY);
		sb.append(",IS_EXPIRATION_DATE_OVERRIDDEN="+IS_EXPIRATION_DATE_OVERRIDDEN);
		sb.append(",EXPIRATION_DATE="+String.valueOf(EXPIRATION_DATE));
		sb.append(",APPROVAL_CYCLE="+APPROVAL_CYCLE);
		sb.append(",IN_STORE_PAYMENT_REQUIRED="+IN_STORE_PAYMENT_REQUIRED);
		sb.append(",IMMEDIATE_SETTLEMENT_VALUE="+String.valueOf(IMMEDIATE_SETTLEMENT_VALUE));
		sb.append(",CUSTOMER_AGE="+String.valueOf(CUSTOMER_AGE));
		sb.append(",ALL_ADDRESSES_VERIFIED="+ALL_ADDRESSES_VERIFIED);
		sb.append(",COMPL_GIFT_BOX_QTY="+String.valueOf(COMPL_GIFT_BOX_QTY));
		sb.append(",NO_OF_AUTH_STRIKES="+String.valueOf(NO_OF_AUTH_STRIKES));
		sb.append(",SOURCE_IP_ADDRESS="+SOURCE_IP_ADDRESS);
		sb.append(",CUSTOMER_FIRST_NAME="+CUSTOMER_FIRST_NAME);
		sb.append(",CUSTOMER_LAST_NAME="+CUSTOMER_LAST_NAME);
		sb.append(",CUSTOMER_PHONE_NO="+CUSTOMER_PHONE_NO);
		sb.append(",CUSTOMER_ZIP_CODE="+CUSTOMER_ZIP_CODE);
		sb.append(",INDEX_VERSION="+String.valueOf(INDEX_VERSION));
		sb.append(",EXTN_TOTAL_PRICE="+EXTN_TOTAL_PRICE);
		sb.append(",CUSTOMER_EMAILID_LC="+CUSTOMER_EMAILID_LC);
		sb.append(",CUSTOMER_FIRST_NAME_LC="+CUSTOMER_FIRST_NAME_LC);
		sb.append(",CUSTOMER_LAST_NAME_LC="+CUSTOMER_LAST_NAME_LC);
		sb.append(",CUSTOMER_ZIP_CODE_LC="+CUSTOMER_ZIP_CODE_LC);
		sb.append(",ORDER_NAME_LC="+ORDER_NAME_LC);
		sb.append(",EXTN_POINTS_EARNED="+EXTN_POINTS_EARNED);
		sb.append(",EXTN_TOTAL_POINTS_EARNED="+EXTN_TOTAL_POINTS_EARNED);
		sb.append(",EXTN_IS_TAX_CALCULATED="+EXTN_IS_TAX_CALCULATED);
		sb.append(",EXTN_VERTEX_ENGINE="+EXTN_VERTEX_ENGINE);
		sb.append(",EXTN_EVENT_TIME_STAMP="+EXTN_EVENT_TIME_STAMP);
		sb.append(",EXTN_FULFILLMENT_ID="+EXTN_FULFILLMENT_ID);
		sb.append(",EXTN_ORDER_TYPE="+EXTN_ORDER_TYPE);
		sb.append(",EXTN_FIRST_NAME="+EXTN_FIRST_NAME);
		sb.append(",EXTN_EMP_LAST_NAME1="+EXTN_EMP_LAST_NAME1);
		sb.append(",EXTN_EMP_LAST_NAME2="+EXTN_EMP_LAST_NAME2);
		sb.append(",EXTN_EMP_DISC_LEVEL="+EXTN_EMP_DISC_LEVEL);
		sb.append(",EXTN_EMPLOYEE_ID="+EXTN_EMPLOYEE_ID);
		sb.append(",EXTN_ATTR_SEQ="+String.valueOf(EXTN_ATTR_SEQ));
		sb.append(",ORDER_NO_LC="+ORDER_NO_LC);
		sb.append(",EXTN_PAYPAL_AUTH_ID="+EXTN_PAYPAL_AUTH_ID);
		sb.append(",EXTN_ORDER_DATE="+EXTN_ORDER_DATE);
		sb.append(",EXTN_DTC_ORDER="+EXTN_DTC_ORDER);
		sb.append(",EXTN_SOURCE="+EXTN_SOURCE);
		sb.append(",EXTN_ATG_CARRIER_CODE="+EXTN_ATG_CARRIER_CODE);
		sb.append(",EXTN_VOUCHER_AMT="+EXTN_VOUCHER_AMT);
		sb.append(",EXTN_CUSTOMER_ALT_KEY="+EXTN_CUSTOMER_ALT_KEY);
		sb.append(",EXTN_IS_GUEST_CHECKOUT="+EXTN_IS_GUEST_CHECKOUT);
		sb.append(",EXTN_ATG_ORDER_NO="+EXTN_ATG_ORDER_NO);
		sb.append(",EXTN_PREFIX="+EXTN_PREFIX);
		sb.append(",EXTN_STORE_NO="+EXTN_STORE_NO);
		sb.append(",EXTN_ORDER_TAX_AREA_ID="+EXTN_ORDER_TAX_AREA_ID);
		sb.append(",CART_ID="+CART_ID);
		sb.append(",ROLLOUT_VERSION="+String.valueOf(ROLLOUT_VERSION));
		sb.append(",EXTN_IS_MIGRATED="+EXTN_IS_MIGRATED);
		sb.append(",EXTN_GENERATE_CALL_TAGALERT="+EXTN_GENERATE_CALL_TAGALERT);
		sb.append(",EXTN_SUBSCRIPTION_ORDER="+EXTN_SUBSCRIPTION_ORDER);
		sb.append(",EXTN_CRM_CUSTOMER="+EXTN_CRM_CUSTOMER);
		sb.append(",EXTN_PRICING_DATE="+String.valueOf(EXTN_PRICING_DATE));
		sb.append(",EXTN_ORIGINAL_ADP_ORDER="+EXTN_ORIGINAL_ADP_ORDER);
		sb.append(",EXTN_MCL_ORDER_SHIPMENT_ID="+EXTN_MCL_ORDER_SHIPMENT_ID);
		sb.append(",EXTN_MCL_CHANNEL="+EXTN_MCL_CHANNEL);
		sb.append(",EXTN_DM_BATCH_NO="+EXTN_DM_BATCH_NO);
		sb.append(",EXTN_KOUNT_SESSION_ID="+EXTN_KOUNT_SESSION_ID);
		sb.append(",EXTN_SHIPMENT_CHARGE="+EXTN_SHIPMENT_CHARGE);
		sb.append(",EXTN_SHIPMENT_DISCOUNT="+EXTN_SHIPMENT_DISCOUNT);
		sb.append(",EXTN_ORDER_DISCOUNT="+EXTN_ORDER_DISCOUNT);
		sb.append(",EXTN_ORDER_TAX="+EXTN_ORDER_TAX);
		sb.append(",EXTN_RE_ORDER="+EXTN_RE_ORDER);
		sb.append(",EXTN_MOBILE_ORDER="+EXTN_MOBILE_ORDER);
		sb.append(",EXTN_MOBILE_ORDER_TYPE="+EXTN_MOBILE_ORDER_TYPE);
		sb.append(",EXTN_NEW_ORDER="+EXTN_NEW_ORDER);
		sb.append(",EXTN_VENDOR_ID="+EXTN_VENDOR_ID);
		sb.append(",EXTN_DEPT_ID="+EXTN_DEPT_ID);
		sb.append(",EXTN_COST_CENTER="+EXTN_COST_CENTER);
		sb.append(",EXTN_TNS_AUTHORIZED="+EXTN_TNS_AUTHORIZED);
		sb.append(",EXTN_BROWSER_IP="+EXTN_BROWSER_IP);
		sb.append(",EXTN_CUSTOMER_CREATETS="+String.valueOf(EXTN_CUSTOMER_CREATETS));
		sb.append(",EXTN_USER_AGENT="+EXTN_USER_AGENT);
		sb.append(",EXTN_ACCEPT_LANG="+EXTN_ACCEPT_LANG);
		sb.append(",EXTN_ATG_ORDERID="+EXTN_ATG_ORDERID);
		sb.append(",EXTN_RISKIFIED_SESSION="+EXTN_RISKIFIED_SESSION);
		sb.append(",EXTN_CUSTOMER_TIER="+EXTN_CUSTOMER_TIER);
		sb.append(",EXTN_AURUS_TOKEN="+EXTN_AURUS_TOKEN);
		sb.append(",EXTN_RISKIFIED_COUNT="+EXTN_RISKIFIED_COUNT);
		sb.append(",EXTN_IS_MIXED_CART_ORDER="+EXTN_IS_MIXED_CART_ORDER);
		sb.append(",EXTN_BOL_NO="+EXTN_BOL_NO);
		sb.append(",EXTN_DELIVERY_DATE="+String.valueOf(EXTN_DELIVERY_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ORDER_HEADER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_HEADER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(ENTERPRISE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ENTERPRISE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_NO);
            			}
            		
        			sb.append("|");
        		
        				if(SOURCING_CLASSIFICATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOURCING_CLASSIFICATION);
            			}
            		
        			sb.append("|");
        		
        				if(BUYER_ORGANIZATION_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUYER_ORGANIZATION_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(SELLER_ORGANIZATION_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SELLER_ORGANIZATION_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(DOCUMENT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DOCUMENT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(BILL_TO_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BILL_TO_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(BILL_TO_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BILL_TO_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_REWARDS_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_REWARDS_NO);
            			}
            		
        			sb.append("|");
        		
        				if(VENDOR_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(VENDOR_ID);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_TO_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_TO_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_TO_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_TO_ID);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVING_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVING_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(BUYER_RECEIVING_NODE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUYER_RECEIVING_NODE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(MARK_FOR_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MARK_FOR_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(BUYER_MARK_FOR_NODE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUYER_MARK_FOR_NODE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(REQ_DELIVERY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REQ_DELIVERY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REQ_CANCEL_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REQ_CANCEL_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REQ_SHIP_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REQ_SHIP_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(DEFAULT_TEMPLATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEFAULT_TEMPLATE);
            			}
            		
        			sb.append("|");
        		
        				if(DIVISION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DIVISION);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(DRAFT_ORDER_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DRAFT_ORDER_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_PURPOSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_PURPOSE);
            			}
            		
        			sb.append("|");
        		
        				if(RETURN_OH_KEY_FOR_EXCHANGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETURN_OH_KEY_FOR_EXCHANGE);
            			}
            		
        			sb.append("|");
        		
        				if(EXCHANGE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXCHANGE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PENDING_TRANSFER_IN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PENDING_TRANSFER_IN);
            			}
            		
        			sb.append("|");
        		
        				if(RETURN_BY_GIFT_RECIPIENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETURN_BY_GIFT_RECIPIENT);
            			}
            		
        			sb.append("|");
        		
        				if(ALLOCATION_RULE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALLOCATION_RULE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(PRIORITY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIORITY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(PRIORITY_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIORITY_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(CONTACT_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTACT_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(SCAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCAC);
            			}
            		
        			sb.append("|");
        		
        				if(CARRIER_SERVICE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CARRIER_SERVICE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTCARRIER_ACCOUNT_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTCARRIER_ACCOUNT_NO);
            			}
            		
        			sb.append("|");
        		
        				if(NOTIFY_AFTER_SHIPMENT_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOTIFY_AFTER_SHIPMENT_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(CREATED_AT_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATED_AT_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(HAS_DERIVED_CHILD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HAS_DERIVED_CHILD);
            			}
            		
        			sb.append("|");
        		
        				if(HAS_DERIVED_PARENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HAS_DERIVED_PARENT);
            			}
            		
        			sb.append("|");
        		
        				if(NOTIFICATION_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOTIFICATION_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(NOTIFICATION_REFERENCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NOTIFICATION_REFERENCE);
            			}
            		
        			sb.append("|");
        		
        				if(ENTRY_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ENTRY_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(AUTHORIZED_CLIENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTHORIZED_CLIENT);
            			}
            		
        			sb.append("|");
        		
        				if(ENTERED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ENTERED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(PERSONALIZE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERSONALIZE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(HOLD_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HOLD_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(HOLD_REASON_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HOLD_REASON_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_PO_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_PO_NO);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_CUSTOMER_PO_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_CUSTOMER_PO_NO);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PAYMENT_RULE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PAYMENT_RULE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(TERMS_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TERMS_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(DELIVERY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DELIVERY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(CHARGE_ACTUAL_FREIGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CHARGE_ACTUAL_FREIGHT);
            			}
            		
        			sb.append("|");
        		
        				if(TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX);
            			}
            		
        			sb.append("|");
        		
        				if(TOTAL_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOTAL_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(ORIGINAL_TOTAL_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORIGINAL_TOTAL_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(ORIGINAL_TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORIGINAL_TAX);
            			}
            		
        			sb.append("|");
        		
        				if(CURRENCY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CURRENCY);
            			}
            		
        			sb.append("|");
        		
        				if(ENTERPRISE_CURRENCY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ENTERPRISE_CURRENCY);
            			}
            		
        			sb.append("|");
        		
        				if(REPORTING_CONVERSION_RATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPORTING_CONVERSION_RATE);
            			}
            		
        			sb.append("|");
        		
        				if(REPORTING_CONVERSION_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPORTING_CONVERSION_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(PAYMENT_STATUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PAYMENT_STATUS);
            			}
            		
        			sb.append("|");
        		
        				if(AUTHORIZATION_EXPIRATION_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTHORIZATION_EXPIRATION_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(SEARCH_CRITERIA_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEARCH_CRITERIA_1);
            			}
            		
        			sb.append("|");
        		
        				if(SEARCH_CRITERIA_2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEARCH_CRITERIA_2);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_EMAILID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_EMAILID);
            			}
            		
        			sb.append("|");
        		
        				if(FOB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOB);
            			}
            		
        			sb.append("|");
        		
        				if(TOTAL_ADJUSTMENT_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOTAL_ADJUSTMENT_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(OTHER_CHARGES == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OTHER_CHARGES);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_PROGRAM_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_PROGRAM_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(TAXPAYER_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAXPAYER_ID);
            			}
            		
        			sb.append("|");
        		
        				if(TAX_JURISDICTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX_JURISDICTION);
            			}
            		
        			sb.append("|");
        		
        				if(TAX_EXEMPT_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX_EXEMPT_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(TAX_EXEMPTION_CERTIFICATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX_EXEMPTION_CERTIFICATE);
            			}
            		
        			sb.append("|");
        		
        				if(PURPOSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PURPOSE);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_COMPLETE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_COMPLETE);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_CLOSED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_CLOSED);
            			}
            		
        			sb.append("|");
        		
        				if(NEXT_ALERT_TS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NEXT_ALERT_TS);
            			}
            		
        			sb.append("|");
        		
        				if(DO_NOT_CONSOLIDATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DO_NOT_CONSOLIDATE);
            			}
            		
        			sb.append("|");
        		
        				if(CHAIN_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CHAIN_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ADJUSTMENT_INVOICE_PENDING == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADJUSTMENT_INVOICE_PENDING);
            			}
            		
        			sb.append("|");
        		
        				if(AUTO_CANCEL_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTO_CANCEL_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(SALE_VOIDED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALE_VOIDED);
            			}
            		
        			sb.append("|");
        		
        				if(IS_SHIP_COMPLETE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_SHIP_COMPLETE);
            			}
            		
        			sb.append("|");
        		
        				if(IS_LINE_SHIP_COMPLETE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_LINE_SHIP_COMPLETE);
            			}
            		
        			sb.append("|");
        		
        				if(IS_SHIP_SINGLE_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_SHIP_SINGLE_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(IS_LINE_SHIP_SINGLE_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_LINE_SHIP_SINGLE_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(CANCEL_ORDER_ON_EXCP_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CANCEL_ORDER_ON_EXCP_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(OPTIMIZATION_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OPTIMIZATION_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PURGE_HISTORY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PURGE_HISTORY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_CLASSIFICATION_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_CLASSIFICATION_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(SOURCE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOURCE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SOURCE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOURCE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(LINKED_SOURCE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LINKED_SOURCE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(ORIGINAL_CONTAINER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORIGINAL_CONTAINER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(SOLD_TO_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOLD_TO_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(TEAM_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TEAM_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL_OF_SERVICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL_OF_SERVICE);
            			}
            		
        			sb.append("|");
        		
        				if(NEXT_ITER_SEQ_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NEXT_ITER_SEQ_NO);
            			}
            		
        			sb.append("|");
        		
        				if(NEXT_ITER_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NEXT_ITER_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(HRS_BEFORE_NEXT_ITER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HRS_BEFORE_NEXT_ITER);
            			}
            		
        			sb.append("|");
        		
        				if(CREATETS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATETS);
            			}
            		
        			sb.append("|");
        		
        				if(MODIFYTS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODIFYTS);
            			}
            		
        			sb.append("|");
        		
        				if(CREATEUSERID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATEUSERID);
            			}
            		
        			sb.append("|");
        		
        				if(MODIFYUSERID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODIFYUSERID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATEPROGID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATEPROGID);
            			}
            		
        			sb.append("|");
        		
        				if(MODIFYPROGID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MODIFYPROGID);
            			}
            		
        			sb.append("|");
        		
        				if(LOCKID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOCKID);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTMENT_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTMENT_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(BUYER_USER_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUYER_USER_ID);
            			}
            		
        			sb.append("|");
        		
        				if(RECREATE_AUTHORIZATIONS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECREATE_AUTHORIZATIONS);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_CONTACT_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_CONTACT_ID);
            			}
            		
        			sb.append("|");
        		
        				if(OPPORTUNITY_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OPPORTUNITY_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(IS_EXPIRATION_DATE_OVERRIDDEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_EXPIRATION_DATE_OVERRIDDEN);
            			}
            		
        			sb.append("|");
        		
        				if(EXPIRATION_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPIRATION_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(APPROVAL_CYCLE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(APPROVAL_CYCLE);
            			}
            		
        			sb.append("|");
        		
        				if(IN_STORE_PAYMENT_REQUIRED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IN_STORE_PAYMENT_REQUIRED);
            			}
            		
        			sb.append("|");
        		
        				if(IMMEDIATE_SETTLEMENT_VALUE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMMEDIATE_SETTLEMENT_VALUE);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_AGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_AGE);
            			}
            		
        			sb.append("|");
        		
        				if(ALL_ADDRESSES_VERIFIED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALL_ADDRESSES_VERIFIED);
            			}
            		
        			sb.append("|");
        		
        				if(COMPL_GIFT_BOX_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COMPL_GIFT_BOX_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(NO_OF_AUTH_STRIKES == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NO_OF_AUTH_STRIKES);
            			}
            		
        			sb.append("|");
        		
        				if(SOURCE_IP_ADDRESS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOURCE_IP_ADDRESS);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_FIRST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_FIRST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_LAST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_LAST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_PHONE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_PHONE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_ZIP_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_ZIP_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(INDEX_VERSION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INDEX_VERSION);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_TOTAL_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_TOTAL_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_EMAILID_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_EMAILID_LC);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_FIRST_NAME_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_FIRST_NAME_LC);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_LAST_NAME_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_LAST_NAME_LC);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_ZIP_CODE_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_ZIP_CODE_LC);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_NAME_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_NAME_LC);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_POINTS_EARNED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_POINTS_EARNED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_TOTAL_POINTS_EARNED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_TOTAL_POINTS_EARNED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_TAX_CALCULATED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_TAX_CALCULATED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_VERTEX_ENGINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_VERTEX_ENGINE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_EVENT_TIME_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_EVENT_TIME_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_FULFILLMENT_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_FULFILLMENT_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDER_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDER_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_FIRST_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_FIRST_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_EMP_LAST_NAME1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_EMP_LAST_NAME1);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_EMP_LAST_NAME2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_EMP_LAST_NAME2);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_EMP_DISC_LEVEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_EMP_DISC_LEVEL);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_EMPLOYEE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_EMPLOYEE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ATTR_SEQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ATTR_SEQ);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_NO_LC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_NO_LC);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PAYPAL_AUTH_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PAYPAL_AUTH_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDER_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDER_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DTC_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DTC_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ATG_CARRIER_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ATG_CARRIER_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_VOUCHER_AMT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_VOUCHER_AMT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_CUSTOMER_ALT_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_CUSTOMER_ALT_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_GUEST_CHECKOUT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_GUEST_CHECKOUT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ATG_ORDER_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ATG_ORDER_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PREFIX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PREFIX);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_STORE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_STORE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDER_TAX_AREA_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDER_TAX_AREA_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CART_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CART_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ROLLOUT_VERSION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ROLLOUT_VERSION);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_MIGRATED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_MIGRATED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_GENERATE_CALL_TAGALERT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_GENERATE_CALL_TAGALERT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SUBSCRIPTION_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SUBSCRIPTION_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_CRM_CUSTOMER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_CRM_CUSTOMER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICING_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICING_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORIGINAL_ADP_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORIGINAL_ADP_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MCL_ORDER_SHIPMENT_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MCL_ORDER_SHIPMENT_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MCL_CHANNEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MCL_CHANNEL);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DM_BATCH_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DM_BATCH_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_KOUNT_SESSION_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_KOUNT_SESSION_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIPMENT_CHARGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIPMENT_CHARGE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIPMENT_DISCOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIPMENT_DISCOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDER_DISCOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDER_DISCOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDER_TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDER_TAX);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RE_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RE_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MOBILE_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MOBILE_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MOBILE_ORDER_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MOBILE_ORDER_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_NEW_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_NEW_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_VENDOR_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_VENDOR_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DEPT_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DEPT_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_COST_CENTER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_COST_CENTER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_TNS_AUTHORIZED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_TNS_AUTHORIZED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_BROWSER_IP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_BROWSER_IP);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_CUSTOMER_CREATETS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_CUSTOMER_CREATETS);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_USER_AGENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_USER_AGENT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ACCEPT_LANG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ACCEPT_LANG);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ATG_ORDERID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ATG_ORDERID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RISKIFIED_SESSION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RISKIFIED_SESSION);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_CUSTOMER_TIER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_CUSTOMER_TIER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_AURUS_TOKEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_AURUS_TOKEN);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RISKIFIED_COUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RISKIFIED_COUNT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_MIXED_CART_ORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_MIXED_CART_ORDER);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_BOL_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_BOL_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DELIVERY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DELIVERY_DATE);
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




	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
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
 		                    
 		                    props_tDBOutput_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_1.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_1.table.setValue("tableName",
 		                    "YFS_ORDER_HEADER_H");
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBOutput_1\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_HEADER_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_HEADER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_HEADER_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_HEADER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ENTERPRISE_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ENTERPRISE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ENTERPRISE_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ENTERPRISE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOURCING_CLASSIFICATION\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOURCING_CLASSIFICATION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOURCING_CLASSIFICATION\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOURCING_CLASSIFICATION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_ORGANIZATION_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_ORGANIZATION_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_ORGANIZATION_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_ORGANIZATION_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SELLER_ORGANIZATION_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SELLER_ORGANIZATION_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SELLER_ORGANIZATION_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SELLER_ORGANIZATION_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DOCUMENT_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DOCUMENT_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DOCUMENT_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DOCUMENT_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BILL_TO_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BILL_TO_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BILL_TO_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BILL_TO_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BILL_TO_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BILL_TO_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BILL_TO_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BILL_TO_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_REWARDS_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_REWARDS_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_REWARDS_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_REWARDS_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"VENDOR_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"VENDOR_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"VENDOR_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"VENDOR_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_TO_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_TO_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_TO_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_TO_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_TO_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_TO_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_TO_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_TO_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVING_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECEIVING_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RECEIVING_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RECEIVING_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_RECEIVING_NODE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_RECEIVING_NODE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_RECEIVING_NODE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_RECEIVING_NODE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MARK_FOR_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MARK_FOR_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MARK_FOR_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MARK_FOR_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_MARK_FOR_NODE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_MARK_FOR_NODE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_MARK_FOR_NODE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_MARK_FOR_NODE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_DELIVERY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_DELIVERY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_DELIVERY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_DELIVERY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_CANCEL_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_CANCEL_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_CANCEL_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_CANCEL_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_SHIP_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_SHIP_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_SHIP_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_SHIP_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEFAULT_TEMPLATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEFAULT_TEMPLATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEFAULT_TEMPLATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEFAULT_TEMPLATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DIVISION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DIVISION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DIVISION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DIVISION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_DATE\",\"talend.field.dbColumnName\":\"ORDER_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"ORDER_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DRAFT_ORDER_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DRAFT_ORDER_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DRAFT_ORDER_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DRAFT_ORDER_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_PURPOSE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_PURPOSE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_PURPOSE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_PURPOSE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RETURN_OH_KEY_FOR_EXCHANGE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RETURN_OH_KEY_FOR_EXCHANGE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RETURN_OH_KEY_FOR_EXCHANGE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RETURN_OH_KEY_FOR_EXCHANGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXCHANGE_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXCHANGE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXCHANGE_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXCHANGE_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PENDING_TRANSFER_IN\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PENDING_TRANSFER_IN\",\"talend.field.dbColumnName\":\"PENDING_TRANSFER_IN\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PENDING_TRANSFER_IN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RETURN_BY_GIFT_RECIPIENT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RETURN_BY_GIFT_RECIPIENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RETURN_BY_GIFT_RECIPIENT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RETURN_BY_GIFT_RECIPIENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ALLOCATION_RULE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ALLOCATION_RULE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ALLOCATION_RULE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ALLOCATION_RULE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRIORITY_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRIORITY_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRIORITY_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRIORITY_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRIORITY_NUMBER\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRIORITY_NUMBER\",\"talend.field.dbColumnName\":\"PRIORITY_NUMBER\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRIORITY_NUMBER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONTACT_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CONTACT_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CONTACT_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CONTACT_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SCAC\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCAC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCAC\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCAC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CARRIER_SERVICE_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CARRIER_SERVICE_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CARRIER_SERVICE_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CARRIER_SERVICE_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTCARRIER_ACCOUNT_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTCARRIER_ACCOUNT_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTCARRIER_ACCOUNT_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTCARRIER_ACCOUNT_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NOTIFY_AFTER_SHIPMENT_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NOTIFY_AFTER_SHIPMENT_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NOTIFY_AFTER_SHIPMENT_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NOTIFY_AFTER_SHIPMENT_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATED_AT_NODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATED_AT_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATED_AT_NODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATED_AT_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HAS_DERIVED_CHILD\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HAS_DERIVED_CHILD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HAS_DERIVED_CHILD\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HAS_DERIVED_CHILD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HAS_DERIVED_PARENT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HAS_DERIVED_PARENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HAS_DERIVED_PARENT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HAS_DERIVED_PARENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NOTIFICATION_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NOTIFICATION_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NOTIFICATION_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NOTIFICATION_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NOTIFICATION_REFERENCE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NOTIFICATION_REFERENCE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NOTIFICATION_REFERENCE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NOTIFICATION_REFERENCE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ENTRY_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ENTRY_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ENTRY_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ENTRY_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTHORIZED_CLIENT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"AUTHORIZED_CLIENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"AUTHORIZED_CLIENT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTHORIZED_CLIENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ENTERED_BY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ENTERED_BY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ENTERED_BY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ENTERED_BY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERSONALIZE_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PERSONALIZE_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PERSONALIZE_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PERSONALIZE_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HOLD_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HOLD_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HOLD_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HOLD_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HOLD_REASON_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HOLD_REASON_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HOLD_REASON_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HOLD_REASON_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_PO_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_PO_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_PO_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_PO_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_CUSTOMER_PO_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_CUSTOMER_PO_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_CUSTOMER_PO_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_CUSTOMER_PO_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_NAME\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_NAME\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PAYMENT_RULE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PAYMENT_RULE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PAYMENT_RULE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PAYMENT_RULE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TERMS_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TERMS_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TERMS_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TERMS_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DELIVERY_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DELIVERY_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DELIVERY_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DELIVERY_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CHARGE_ACTUAL_FREIGHT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHARGE_ACTUAL_FREIGHT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHARGE_ACTUAL_FREIGHT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHARGE_ACTUAL_FREIGHT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX\",\"talend.field.dbColumnName\":\"TAX\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TOTAL_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TOTAL_AMOUNT\",\"talend.field.dbColumnName\":\"TOTAL_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TOTAL_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORIGINAL_TOTAL_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIGINAL_TOTAL_AMOUNT\",\"talend.field.dbColumnName\":\"ORIGINAL_TOTAL_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIGINAL_TOTAL_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORIGINAL_TAX\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIGINAL_TAX\",\"talend.field.dbColumnName\":\"ORIGINAL_TAX\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIGINAL_TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CURRENCY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CURRENCY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CURRENCY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CURRENCY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ENTERPRISE_CURRENCY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ENTERPRISE_CURRENCY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ENTERPRISE_CURRENCY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ENTERPRISE_CURRENCY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REPORTING_CONVERSION_RATE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REPORTING_CONVERSION_RATE\",\"talend.field.dbColumnName\":\"REPORTING_CONVERSION_RATE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REPORTING_CONVERSION_RATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REPORTING_CONVERSION_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REPORTING_CONVERSION_DATE\",\"talend.field.dbColumnName\":\"REPORTING_CONVERSION_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REPORTING_CONVERSION_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PAYMENT_STATUS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PAYMENT_STATUS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PAYMENT_STATUS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PAYMENT_STATUS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTHORIZATION_EXPIRATION_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"AUTHORIZATION_EXPIRATION_DATE\",\"talend.field.dbColumnName\":\"AUTHORIZATION_EXPIRATION_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"AUTHORIZATION_EXPIRATION_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SEARCH_CRITERIA_1\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SEARCH_CRITERIA_1\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SEARCH_CRITERIA_1\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SEARCH_CRITERIA_1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SEARCH_CRITERIA_2\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SEARCH_CRITERIA_2\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SEARCH_CRITERIA_2\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SEARCH_CRITERIA_2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_EMAILID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_EMAILID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_EMAILID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_EMAILID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FOB\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FOB\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FOB\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FOB\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TOTAL_ADJUSTMENT_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TOTAL_ADJUSTMENT_AMOUNT\",\"talend.field.dbColumnName\":\"TOTAL_ADJUSTMENT_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TOTAL_ADJUSTMENT_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OTHER_CHARGES\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OTHER_CHARGES\",\"talend.field.dbColumnName\":\"OTHER_CHARGES\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OTHER_CHARGES\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICE_PROGRAM_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICE_PROGRAM_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRICE_PROGRAM_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICE_PROGRAM_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAXPAYER_ID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAXPAYER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAXPAYER_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAXPAYER_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX_JURISDICTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX_JURISDICTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAX_JURISDICTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_JURISDICTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX_EXEMPT_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX_EXEMPT_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAX_EXEMPT_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_EXEMPT_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX_EXEMPTION_CERTIFICATE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX_EXEMPTION_CERTIFICATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAX_EXEMPTION_CERTIFICATE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_EXEMPTION_CERTIFICATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PURPOSE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PURPOSE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PURPOSE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PURPOSE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_COMPLETE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICE_COMPLETE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INVOICE_COMPLETE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICE_COMPLETE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_CLOSED\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_CLOSED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_CLOSED\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_CLOSED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NEXT_ALERT_TS\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NEXT_ALERT_TS\",\"talend.field.dbColumnName\":\"NEXT_ALERT_TS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"NEXT_ALERT_TS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DO_NOT_CONSOLIDATE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DO_NOT_CONSOLIDATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DO_NOT_CONSOLIDATE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DO_NOT_CONSOLIDATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CHAIN_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHAIN_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHAIN_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHAIN_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ADJUSTMENT_INVOICE_PENDING\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ADJUSTMENT_INVOICE_PENDING\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ADJUSTMENT_INVOICE_PENDING\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADJUSTMENT_INVOICE_PENDING\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTO_CANCEL_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"AUTO_CANCEL_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"AUTO_CANCEL_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"AUTO_CANCEL_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SALE_VOIDED\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SALE_VOIDED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SALE_VOIDED\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SALE_VOIDED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_SHIP_COMPLETE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_SHIP_COMPLETE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_SHIP_COMPLETE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_SHIP_COMPLETE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_LINE_SHIP_COMPLETE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_LINE_SHIP_COMPLETE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_LINE_SHIP_COMPLETE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_LINE_SHIP_COMPLETE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_SHIP_SINGLE_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_SHIP_SINGLE_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_SHIP_SINGLE_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_SHIP_SINGLE_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_LINE_SHIP_SINGLE_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_LINE_SHIP_SINGLE_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_LINE_SHIP_SINGLE_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_LINE_SHIP_SINGLE_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CANCEL_ORDER_ON_EXCP_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CANCEL_ORDER_ON_EXCP_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CANCEL_ORDER_ON_EXCP_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CANCEL_ORDER_ON_EXCP_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OPTIMIZATION_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OPTIMIZATION_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"OPTIMIZATION_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OPTIMIZATION_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PURGE_HISTORY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PURGE_HISTORY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PURGE_HISTORY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"PURGE_HISTORY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_CLASSIFICATION_CODE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_CLASSIFICATION_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRICING_CLASSIFICATION_CODE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICING_CLASSIFICATION_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOURCE_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOURCE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOURCE_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOURCE_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOURCE_KEY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOURCE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOURCE_KEY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOURCE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LINKED_SOURCE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LINKED_SOURCE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LINKED_SOURCE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LINKED_SOURCE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORIGINAL_CONTAINER_KEY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIGINAL_CONTAINER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORIGINAL_CONTAINER_KEY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIGINAL_CONTAINER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOLD_TO_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOLD_TO_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOLD_TO_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOLD_TO_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TEAM_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TEAM_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TEAM_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TEAM_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LEVEL_OF_SERVICE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LEVEL_OF_SERVICE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LEVEL_OF_SERVICE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LEVEL_OF_SERVICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NEXT_ITER_SEQ_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NEXT_ITER_SEQ_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NEXT_ITER_SEQ_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NEXT_ITER_SEQ_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NEXT_ITER_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NEXT_ITER_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NEXT_ITER_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"NEXT_ITER_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HRS_BEFORE_NEXT_ITER\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HRS_BEFORE_NEXT_ITER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HRS_BEFORE_NEXT_ITER\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HRS_BEFORE_NEXT_ITER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATETS\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATETS\",\"talend.field.dbColumnName\":\"CREATETS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CREATETS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYTS\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYTS\",\"talend.field.dbColumnName\":\"MODIFYTS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"MODIFYTS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEUSERID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATEUSERID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATEUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYUSERID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYUSERID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MODIFYUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEPROGID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATEPROGID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATEPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYPROGID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYPROGID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MODIFYPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOCKID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOCKID\",\"talend.field.dbColumnName\":\"LOCKID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCKID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEPARTMENT_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEPARTMENT_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEPARTMENT_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEPARTMENT_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_USER_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_USER_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_USER_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_USER_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECREATE_AUTHORIZATIONS\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECREATE_AUTHORIZATIONS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RECREATE_AUTHORIZATIONS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RECREATE_AUTHORIZATIONS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_CONTACT_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_CONTACT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_CONTACT_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_CONTACT_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OPPORTUNITY_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OPPORTUNITY_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"OPPORTUNITY_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OPPORTUNITY_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_EXPIRATION_DATE_OVERRIDDEN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_EXPIRATION_DATE_OVERRIDDEN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_EXPIRATION_DATE_OVERRIDDEN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_EXPIRATION_DATE_OVERRIDDEN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXPIRATION_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXPIRATION_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXPIRATION_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXPIRATION_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"APPROVAL_CYCLE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPROVAL_CYCLE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPROVAL_CYCLE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPROVAL_CYCLE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IN_STORE_PAYMENT_REQUIRED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IN_STORE_PAYMENT_REQUIRED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IN_STORE_PAYMENT_REQUIRED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IN_STORE_PAYMENT_REQUIRED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMMEDIATE_SETTLEMENT_VALUE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IMMEDIATE_SETTLEMENT_VALUE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IMMEDIATE_SETTLEMENT_VALUE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IMMEDIATE_SETTLEMENT_VALUE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_AGE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_AGE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_AGE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_AGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ALL_ADDRESSES_VERIFIED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ALL_ADDRESSES_VERIFIED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ALL_ADDRESSES_VERIFIED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ALL_ADDRESSES_VERIFIED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"COMPL_GIFT_BOX_QTY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COMPL_GIFT_BOX_QTY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMPL_GIFT_BOX_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMPL_GIFT_BOX_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NO_OF_AUTH_STRIKES\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NO_OF_AUTH_STRIKES\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NO_OF_AUTH_STRIKES\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NO_OF_AUTH_STRIKES\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOURCE_IP_ADDRESS\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOURCE_IP_ADDRESS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOURCE_IP_ADDRESS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOURCE_IP_ADDRESS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_FIRST_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_FIRST_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_FIRST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_FIRST_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_LAST_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_LAST_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_LAST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_LAST_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_PHONE_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_PHONE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_PHONE_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_PHONE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_ZIP_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_ZIP_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_ZIP_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_ZIP_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INDEX_VERSION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INDEX_VERSION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INDEX_VERSION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INDEX_VERSION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_TOTAL_PRICE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_TOTAL_PRICE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_TOTAL_PRICE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_TOTAL_PRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_EMAILID_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_EMAILID_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_EMAILID_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_EMAILID_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_FIRST_NAME_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_FIRST_NAME_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_FIRST_NAME_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_FIRST_NAME_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_LAST_NAME_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_LAST_NAME_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_LAST_NAME_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_LAST_NAME_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_ZIP_CODE_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_ZIP_CODE_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_ZIP_CODE_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_ZIP_CODE_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_NAME_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_NAME_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_NAME_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_NAME_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_POINTS_EARNED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_POINTS_EARNED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_POINTS_EARNED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_POINTS_EARNED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_TOTAL_POINTS_EARNED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_TOTAL_POINTS_EARNED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_TOTAL_POINTS_EARNED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_TOTAL_POINTS_EARNED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_TAX_CALCULATED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_TAX_CALCULATED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_TAX_CALCULATED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_TAX_CALCULATED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_VERTEX_ENGINE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_VERTEX_ENGINE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_VERTEX_ENGINE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_VERTEX_ENGINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_EVENT_TIME_STAMP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_EVENT_TIME_STAMP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_EVENT_TIME_STAMP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_EVENT_TIME_STAMP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_FULFILLMENT_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_FULFILLMENT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_FULFILLMENT_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_FULFILLMENT_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDER_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDER_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDER_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDER_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_FIRST_NAME\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_FIRST_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_FIRST_NAME\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_FIRST_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_EMP_LAST_NAME1\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_EMP_LAST_NAME1\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_EMP_LAST_NAME1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_EMP_LAST_NAME1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_EMP_LAST_NAME2\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_EMP_LAST_NAME2\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_EMP_LAST_NAME2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_EMP_LAST_NAME2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_EMP_DISC_LEVEL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_EMP_DISC_LEVEL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_EMP_DISC_LEVEL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_EMP_DISC_LEVEL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_EMPLOYEE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_EMPLOYEE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_EMPLOYEE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_EMPLOYEE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ATTR_SEQ\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ATTR_SEQ\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ATTR_SEQ\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ATTR_SEQ\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_NO_LC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_NO_LC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_NO_LC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_NO_LC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PAYPAL_AUTH_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PAYPAL_AUTH_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PAYPAL_AUTH_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PAYPAL_AUTH_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDER_DATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDER_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDER_DATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDER_DATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DTC_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DTC_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DTC_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_DTC_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SOURCE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SOURCE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SOURCE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SOURCE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ATG_CARRIER_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ATG_CARRIER_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ATG_CARRIER_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ATG_CARRIER_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_VOUCHER_AMT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_VOUCHER_AMT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_VOUCHER_AMT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_VOUCHER_AMT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_CUSTOMER_ALT_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_CUSTOMER_ALT_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_CUSTOMER_ALT_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_CUSTOMER_ALT_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_GUEST_CHECKOUT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_GUEST_CHECKOUT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_GUEST_CHECKOUT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_GUEST_CHECKOUT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ATG_ORDER_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ATG_ORDER_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ATG_ORDER_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ATG_ORDER_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PREFIX\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PREFIX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PREFIX\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PREFIX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_STORE_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_STORE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_STORE_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_STORE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDER_TAX_AREA_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDER_TAX_AREA_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDER_TAX_AREA_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDER_TAX_AREA_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CART_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CART_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CART_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CART_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ROLLOUT_VERSION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ROLLOUT_VERSION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ROLLOUT_VERSION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ROLLOUT_VERSION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_MIGRATED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_MIGRATED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_MIGRATED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_MIGRATED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_GENERATE_CALL_TAGALERT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_GENERATE_CALL_TAGALERT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_GENERATE_CALL_TAGALERT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_GENERATE_CALL_TAGALERT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SUBSCRIPTION_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SUBSCRIPTION_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SUBSCRIPTION_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SUBSCRIPTION_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_CRM_CUSTOMER\",\"type\":[\"string\",\"null\"],\"default\":\"'Y'\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_CRM_CUSTOMER\",\"talend.field.default\":\"'Y'\",\"talend.field.dbColumnName\":\"EXTN_CRM_CUSTOMER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_CRM_CUSTOMER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICING_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICING_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICING_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_PRICING_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORIGINAL_ADP_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORIGINAL_ADP_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORIGINAL_ADP_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORIGINAL_ADP_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MCL_ORDER_SHIPMENT_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MCL_ORDER_SHIPMENT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MCL_ORDER_SHIPMENT_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MCL_ORDER_SHIPMENT_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MCL_CHANNEL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MCL_CHANNEL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MCL_CHANNEL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MCL_CHANNEL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DM_BATCH_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DM_BATCH_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DM_BATCH_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_DM_BATCH_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_KOUNT_SESSION_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_KOUNT_SESSION_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_KOUNT_SESSION_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_KOUNT_SESSION_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIPMENT_CHARGE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIPMENT_CHARGE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIPMENT_CHARGE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SHIPMENT_CHARGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIPMENT_DISCOUNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIPMENT_DISCOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIPMENT_DISCOUNT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SHIPMENT_DISCOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDER_DISCOUNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDER_DISCOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDER_DISCOUNT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDER_DISCOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDER_TAX\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDER_TAX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDER_TAX\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDER_TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RE_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RE_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RE_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RE_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MOBILE_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MOBILE_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MOBILE_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MOBILE_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MOBILE_ORDER_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MOBILE_ORDER_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MOBILE_ORDER_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MOBILE_ORDER_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_NEW_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_NEW_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_NEW_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_NEW_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_VENDOR_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_VENDOR_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_VENDOR_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_VENDOR_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DEPT_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DEPT_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DEPT_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_DEPT_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_COST_CENTER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_COST_CENTER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_COST_CENTER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_COST_CENTER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_TNS_AUTHORIZED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_TNS_AUTHORIZED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_TNS_AUTHORIZED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_TNS_AUTHORIZED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_BROWSER_IP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_BROWSER_IP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_BROWSER_IP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_BROWSER_IP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_CUSTOMER_CREATETS\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_CUSTOMER_CREATETS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_CUSTOMER_CREATETS\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_CUSTOMER_CREATETS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_USER_AGENT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_USER_AGENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_USER_AGENT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_USER_AGENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ACCEPT_LANG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ACCEPT_LANG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ACCEPT_LANG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ACCEPT_LANG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ATG_ORDERID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ATG_ORDERID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ATG_ORDERID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ATG_ORDERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RISKIFIED_SESSION\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RISKIFIED_SESSION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RISKIFIED_SESSION\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RISKIFIED_SESSION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_CUSTOMER_TIER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_CUSTOMER_TIER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_CUSTOMER_TIER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_CUSTOMER_TIER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_AURUS_TOKEN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_AURUS_TOKEN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_AURUS_TOKEN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_AURUS_TOKEN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RISKIFIED_COUNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RISKIFIED_COUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RISKIFIED_COUNT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RISKIFIED_COUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_MIXED_CART_ORDER\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_MIXED_CART_ORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_MIXED_CART_ORDER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_MIXED_CART_ORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_BOL_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_BOL_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_BOL_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_BOL_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DELIVERY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DELIVERY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DELIVERY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_DELIVERY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",s);
     		                    						
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
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"YFS_INVOICE_COLLECTION_H\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"  select * from STERLING.YFS_ORDER_HEADER_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysdate - 7), 'YYYY-MM-DD HH:MI:SS')    \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_HEADER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ENTERPRISE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOURCING_CLASSIFICATION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_ORGANIZATION_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SELLER_ORGANIZATION_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DOCUMENT_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BILL_TO_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BILL_TO_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_REWARDS_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("VENDOR_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_TO_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_TO_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RECEIVING_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_RECEIVING_NODE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MARK_FOR_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_MARK_FOR_NODE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_DELIVERY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_CANCEL_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_SHIP_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEFAULT_TEMPLATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DIVISION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DRAFT_ORDER_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_PURPOSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RETURN_OH_KEY_FOR_EXCHANGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXCHANGE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PENDING_TRANSFER_IN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RETURN_BY_GIFT_RECIPIENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ALLOCATION_RULE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRIORITY_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRIORITY_NUMBER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONTACT_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SCAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CARRIER_SERVICE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTCARRIER_ACCOUNT_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NOTIFY_AFTER_SHIPMENT_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATED_AT_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HAS_DERIVED_CHILD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HAS_DERIVED_PARENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NOTIFICATION_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NOTIFICATION_REFERENCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ENTRY_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTHORIZED_CLIENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ENTERED_BY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PERSONALIZE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HOLD_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HOLD_REASON_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_PO_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_CUSTOMER_PO_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PAYMENT_RULE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TERMS_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DELIVERY_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CHARGE_ACTUAL_FREIGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TOTAL_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORIGINAL_TOTAL_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORIGINAL_TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CURRENCY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ENTERPRISE_CURRENCY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPORTING_CONVERSION_RATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPORTING_CONVERSION_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PAYMENT_STATUS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTHORIZATION_EXPIRATION_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SEARCH_CRITERIA_1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SEARCH_CRITERIA_2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_EMAILID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TOTAL_ADJUSTMENT_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OTHER_CHARGES")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICE_PROGRAM_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAXPAYER_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX_JURISDICTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX_EXEMPT_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX_EXEMPTION_CERTIFICATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PURPOSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICE_COMPLETE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_CLOSED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NEXT_ALERT_TS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DO_NOT_CONSOLIDATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CHAIN_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ADJUSTMENT_INVOICE_PENDING")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTO_CANCEL_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SALE_VOIDED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_SHIP_COMPLETE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_LINE_SHIP_COMPLETE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_SHIP_SINGLE_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_LINE_SHIP_SINGLE_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CANCEL_ORDER_ON_EXCP_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OPTIMIZATION_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PURGE_HISTORY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_CLASSIFICATION_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOURCE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOURCE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LINKED_SOURCE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORIGINAL_CONTAINER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOLD_TO_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TEAM_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL_OF_SERVICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NEXT_ITER_SEQ_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NEXT_ITER_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HRS_BEFORE_NEXT_ITER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYTS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCKID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPARTMENT_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_USER_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RECREATE_AUTHORIZATIONS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_CONTACT_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OPPORTUNITY_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_EXPIRATION_DATE_OVERRIDDEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXPIRATION_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("APPROVAL_CYCLE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IN_STORE_PAYMENT_REQUIRED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMMEDIATE_SETTLEMENT_VALUE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_AGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ALL_ADDRESSES_VERIFIED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("COMPL_GIFT_BOX_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NO_OF_AUTH_STRIKES")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOURCE_IP_ADDRESS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_FIRST_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_LAST_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_PHONE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_ZIP_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INDEX_VERSION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_TOTAL_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_EMAILID_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_FIRST_NAME_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_LAST_NAME_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_ZIP_CODE_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_NAME_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_POINTS_EARNED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_TOTAL_POINTS_EARNED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_TAX_CALCULATED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_VERTEX_ENGINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_EVENT_TIME_STAMP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_FULFILLMENT_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDER_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_FIRST_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_EMP_LAST_NAME1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_EMP_LAST_NAME2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_EMP_DISC_LEVEL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_EMPLOYEE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ATTR_SEQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_NO_LC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PAYPAL_AUTH_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDER_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DTC_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SOURCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ATG_CARRIER_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_VOUCHER_AMT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_CUSTOMER_ALT_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_GUEST_CHECKOUT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ATG_ORDER_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PREFIX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_STORE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDER_TAX_AREA_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CART_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ROLLOUT_VERSION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_MIGRATED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_GENERATE_CALL_TAGALERT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SUBSCRIPTION_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_CRM_CUSTOMER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICING_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORIGINAL_ADP_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MCL_ORDER_SHIPMENT_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MCL_CHANNEL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DM_BATCH_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_KOUNT_SESSION_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIPMENT_CHARGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIPMENT_DISCOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDER_DISCOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDER_TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RE_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MOBILE_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MOBILE_ORDER_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_NEW_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_VENDOR_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DEPT_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_COST_CENTER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_TNS_AUTHORIZED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_BROWSER_IP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_CUSTOMER_CREATETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_USER_AGENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ACCEPT_LANG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ATG_ORDERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RISKIFIED_SESSION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_CUSTOMER_TIER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_AURUS_TOKEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RISKIFIED_COUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_MIXED_CART_ORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_BOL_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DELIVERY_DATE")+"}]");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("NO_NULL_VALUES" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("UNIFIED_COMPONENTS" + " = " + "tOracleInput");
                        log4jParamters_tDBInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_1 - "  + (log4jParamters_tDBInput_1) );
                    } 
                } 
            new BytesLimit65535_tDBInput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_1", "tDBInput_1", "tOracleInput");
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
			
                boolean isTimeZoneNull_tDBInput_1 = false;
				boolean isConnectionWrapped_tDBInput_1 = !(conn_tDBInput_1 instanceof oracle.jdbc.OracleConnection) && conn_tDBInput_1.isWrapperFor(oracle.jdbc.OracleConnection.class);
				oracle.jdbc.OracleConnection unwrappedOraConn_tDBInput_1 = null;
                if (isConnectionWrapped_tDBInput_1) {
					unwrappedOraConn_tDBInput_1 = conn_tDBInput_1.unwrap(oracle.jdbc.OracleConnection.class);
                    if (unwrappedOraConn_tDBInput_1 != null) {
                        isTimeZoneNull_tDBInput_1 = (unwrappedOraConn_tDBInput_1.getSessionTimeZone() == null);
                    }
                } else {
                    isTimeZoneNull_tDBInput_1 = (((oracle.jdbc.OracleConnection)conn_tDBInput_1).getSessionTimeZone() == null);
                }

				if(isTimeZoneNull_tDBInput_1) {
					java.sql.Statement stmtGetTZ_tDBInput_1 = conn_tDBInput_1.createStatement();
					java.sql.ResultSet rsGetTZ_tDBInput_1 = stmtGetTZ_tDBInput_1.executeQuery("select sessiontimezone from dual");
					String sessionTimezone_tDBInput_1 = java.util.TimeZone.getDefault().getID();
					while (rsGetTZ_tDBInput_1.next()) {
						sessionTimezone_tDBInput_1 = rsGetTZ_tDBInput_1.getString(1);
					}
					if (isConnectionWrapped_tDBInput_1 && unwrappedOraConn_tDBInput_1 != null) {
                        unwrappedOraConn_tDBInput_1.setSessionTimeZone(sessionTimezone_tDBInput_1);
                    } else {
                        ((oracle.jdbc.OracleConnection)conn_tDBInput_1).setSessionTimeZone(sessionTimezone_tDBInput_1);
                    }
				}
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "\nselect * from STERLING.YFS_ORDER_HEADER_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysdate - 7), 'Y"
+"YYY-MM-DD HH:MI:SS')\n\n";
		    
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
								row1.ORDER_HEADER_KEY = null;
							} else {
	                         		
        	row1.ORDER_HEADER_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.ENTERPRISE_KEY = null;
							} else {
	                         		
        	row1.ENTERPRISE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.ORDER_NO = null;
							} else {
	                         		
        	row1.ORDER_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.SOURCING_CLASSIFICATION = null;
							} else {
	                         		
        	row1.SOURCING_CLASSIFICATION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.BUYER_ORGANIZATION_CODE = null;
							} else {
	                         		
        	row1.BUYER_ORGANIZATION_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.SELLER_ORGANIZATION_CODE = null;
							} else {
	                         		
        	row1.SELLER_ORGANIZATION_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.DOCUMENT_TYPE = null;
							} else {
	                         		
        	row1.DOCUMENT_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.BILL_TO_KEY = null;
							} else {
	                         		
        	row1.BILL_TO_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.BILL_TO_ID = null;
							} else {
	                         		
        	row1.BILL_TO_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.CUSTOMER_REWARDS_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_REWARDS_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.VENDOR_ID = null;
							} else {
	                         		
        	row1.VENDOR_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 11, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.SHIP_TO_KEY = null;
							} else {
	                         		
        	row1.SHIP_TO_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 12, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.SHIP_TO_ID = null;
							} else {
	                         		
        	row1.SHIP_TO_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 13, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.SHIP_NODE = null;
							} else {
	                         		
        	row1.SHIP_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.RECEIVING_NODE = null;
							} else {
	                         		
        	row1.RECEIVING_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.BUYER_RECEIVING_NODE_ID = null;
							} else {
	                         		
        	row1.BUYER_RECEIVING_NODE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.MARK_FOR_KEY = null;
							} else {
	                         		
        	row1.MARK_FOR_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.BUYER_MARK_FOR_NODE_ID = null;
							} else {
	                         		
        	row1.BUYER_MARK_FOR_NODE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.REQ_DELIVERY_DATE = null;
							} else {
										
			row1.REQ_DELIVERY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 19);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.REQ_CANCEL_DATE = null;
							} else {
										
			row1.REQ_CANCEL_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 20);
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.REQ_SHIP_DATE = null;
							} else {
										
			row1.REQ_SHIP_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 21);
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.DEFAULT_TEMPLATE = null;
							} else {
	                         		
        	row1.DEFAULT_TEMPLATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row1.DIVISION = null;
							} else {
	                         		
        	row1.DIVISION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row1.ORDER_DATE = null;
							} else {
										
			row1.ORDER_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 24);
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row1.ORDER_TYPE = null;
							} else {
	                         		
        	row1.ORDER_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 25, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row1.DRAFT_ORDER_FLAG = null;
							} else {
	                         		
        	row1.DRAFT_ORDER_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 26, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row1.ORDER_PURPOSE = null;
							} else {
	                         		
        	row1.ORDER_PURPOSE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row1.RETURN_OH_KEY_FOR_EXCHANGE = null;
							} else {
	                         		
        	row1.RETURN_OH_KEY_FOR_EXCHANGE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row1.EXCHANGE_TYPE = null;
							} else {
	                         		
        	row1.EXCHANGE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row1.PENDING_TRANSFER_IN = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(30) != null) {
						row1.PENDING_TRANSFER_IN = rs_tDBInput_1.getBigDecimal(30);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row1.RETURN_BY_GIFT_RECIPIENT = null;
							} else {
	                         		
        	row1.RETURN_BY_GIFT_RECIPIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 31, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row1.ALLOCATION_RULE_ID = null;
							} else {
	                         		
        	row1.ALLOCATION_RULE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 32, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 33) {
								row1.PRIORITY_CODE = null;
							} else {
	                         		
        	row1.PRIORITY_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 33, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 34) {
								row1.PRIORITY_NUMBER = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(34) != null) {
						row1.PRIORITY_NUMBER = rs_tDBInput_1.getBigDecimal(34);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 35) {
								row1.CONTACT_KEY = null;
							} else {
	                         		
        	row1.CONTACT_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 35, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 36) {
								row1.SCAC = null;
							} else {
	                         		
        	row1.SCAC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 36, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 37) {
								row1.CARRIER_SERVICE_CODE = null;
							} else {
	                         		
        	row1.CARRIER_SERVICE_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 37, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 38) {
								row1.CUSTCARRIER_ACCOUNT_NO = null;
							} else {
	                         		
        	row1.CUSTCARRIER_ACCOUNT_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 38, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 39) {
								row1.NOTIFY_AFTER_SHIPMENT_FLAG = null;
							} else {
	                         		
        	row1.NOTIFY_AFTER_SHIPMENT_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 39, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 40) {
								row1.CREATED_AT_NODE = null;
							} else {
	                         		
        	row1.CREATED_AT_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 40, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 41) {
								row1.HAS_DERIVED_CHILD = null;
							} else {
	                         		
        	row1.HAS_DERIVED_CHILD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 41, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 42) {
								row1.HAS_DERIVED_PARENT = null;
							} else {
	                         		
        	row1.HAS_DERIVED_PARENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 42, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 43) {
								row1.NOTIFICATION_TYPE = null;
							} else {
	                         		
        	row1.NOTIFICATION_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 43, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 44) {
								row1.NOTIFICATION_REFERENCE = null;
							} else {
	                         		
        	row1.NOTIFICATION_REFERENCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 44, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 45) {
								row1.ENTRY_TYPE = null;
							} else {
	                         		
        	row1.ENTRY_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 45, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 46) {
								row1.AUTHORIZED_CLIENT = null;
							} else {
	                         		
        	row1.AUTHORIZED_CLIENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 46, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 47) {
								row1.ENTERED_BY = null;
							} else {
	                         		
        	row1.ENTERED_BY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 47, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 48) {
								row1.PERSONALIZE_CODE = null;
							} else {
	                         		
        	row1.PERSONALIZE_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 48, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 49) {
								row1.HOLD_FLAG = null;
							} else {
	                         		
        	row1.HOLD_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 49, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 50) {
								row1.HOLD_REASON_CODE = null;
							} else {
	                         		
        	row1.HOLD_REASON_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 50, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 51) {
								row1.CUSTOMER_PO_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_PO_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 51, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 52) {
								row1.CUSTOMER_CUSTOMER_PO_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_CUSTOMER_PO_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 52, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 53) {
								row1.ORDER_NAME = null;
							} else {
	                         		
        	row1.ORDER_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 53, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 54) {
								row1.PAYMENT_RULE_ID = null;
							} else {
	                         		
        	row1.PAYMENT_RULE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 54, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 55) {
								row1.TERMS_CODE = null;
							} else {
	                         		
        	row1.TERMS_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 55, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 56) {
								row1.DELIVERY_CODE = null;
							} else {
	                         		
        	row1.DELIVERY_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 56, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 57) {
								row1.CHARGE_ACTUAL_FREIGHT = null;
							} else {
	                         		
        	row1.CHARGE_ACTUAL_FREIGHT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 57, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 58) {
								row1.TAX = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(58) != null) {
						row1.TAX = rs_tDBInput_1.getBigDecimal(58);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 59) {
								row1.TOTAL_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(59) != null) {
						row1.TOTAL_AMOUNT = rs_tDBInput_1.getBigDecimal(59);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 60) {
								row1.ORIGINAL_TOTAL_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(60) != null) {
						row1.ORIGINAL_TOTAL_AMOUNT = rs_tDBInput_1.getBigDecimal(60);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 61) {
								row1.ORIGINAL_TAX = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(61) != null) {
						row1.ORIGINAL_TAX = rs_tDBInput_1.getBigDecimal(61);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 62) {
								row1.CURRENCY = null;
							} else {
	                         		
        	row1.CURRENCY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 62, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 63) {
								row1.ENTERPRISE_CURRENCY = null;
							} else {
	                         		
        	row1.ENTERPRISE_CURRENCY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 63, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 64) {
								row1.REPORTING_CONVERSION_RATE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(64) != null) {
						row1.REPORTING_CONVERSION_RATE = rs_tDBInput_1.getBigDecimal(64);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 65) {
								row1.REPORTING_CONVERSION_DATE = null;
							} else {
										
			row1.REPORTING_CONVERSION_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 65);
		                    }
							if(colQtyInRs_tDBInput_1 < 66) {
								row1.PAYMENT_STATUS = null;
							} else {
	                         		
        	row1.PAYMENT_STATUS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 66, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 67) {
								row1.AUTHORIZATION_EXPIRATION_DATE = null;
							} else {
										
			row1.AUTHORIZATION_EXPIRATION_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 67);
		                    }
							if(colQtyInRs_tDBInput_1 < 68) {
								row1.SEARCH_CRITERIA_1 = null;
							} else {
	                         		
        	row1.SEARCH_CRITERIA_1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 68, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 69) {
								row1.SEARCH_CRITERIA_2 = null;
							} else {
	                         		
        	row1.SEARCH_CRITERIA_2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 69, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 70) {
								row1.CUSTOMER_EMAILID = null;
							} else {
	                         		
        	row1.CUSTOMER_EMAILID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 70, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 71) {
								row1.FOB = null;
							} else {
	                         		
        	row1.FOB = routines.system.JDBCUtil.getString(rs_tDBInput_1, 71, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 72) {
								row1.TOTAL_ADJUSTMENT_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(72) != null) {
						row1.TOTAL_ADJUSTMENT_AMOUNT = rs_tDBInput_1.getBigDecimal(72);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 73) {
								row1.OTHER_CHARGES = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(73) != null) {
						row1.OTHER_CHARGES = rs_tDBInput_1.getBigDecimal(73);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 74) {
								row1.PRICE_PROGRAM_KEY = null;
							} else {
	                         		
        	row1.PRICE_PROGRAM_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 74, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 75) {
								row1.TAXPAYER_ID = null;
							} else {
	                         		
        	row1.TAXPAYER_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 75, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 76) {
								row1.TAX_JURISDICTION = null;
							} else {
	                         		
        	row1.TAX_JURISDICTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 76, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 77) {
								row1.TAX_EXEMPT_FLAG = null;
							} else {
	                         		
        	row1.TAX_EXEMPT_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 77, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 78) {
								row1.TAX_EXEMPTION_CERTIFICATE = null;
							} else {
	                         		
        	row1.TAX_EXEMPTION_CERTIFICATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 78, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 79) {
								row1.PURPOSE = null;
							} else {
	                         		
        	row1.PURPOSE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 79, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 80) {
								row1.INVOICE_COMPLETE = null;
							} else {
	                         		
        	row1.INVOICE_COMPLETE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 80, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 81) {
								row1.ORDER_CLOSED = null;
							} else {
	                         		
        	row1.ORDER_CLOSED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 81, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 82) {
								row1.NEXT_ALERT_TS = null;
							} else {
										
			row1.NEXT_ALERT_TS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 82);
		                    }
							if(colQtyInRs_tDBInput_1 < 83) {
								row1.DO_NOT_CONSOLIDATE = null;
							} else {
	                         		
        	row1.DO_NOT_CONSOLIDATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 83, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 84) {
								row1.CHAIN_TYPE = null;
							} else {
	                         		
        	row1.CHAIN_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 84, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 85) {
								row1.ADJUSTMENT_INVOICE_PENDING = null;
							} else {
	                         		
        	row1.ADJUSTMENT_INVOICE_PENDING = routines.system.JDBCUtil.getString(rs_tDBInput_1, 85, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 86) {
								row1.AUTO_CANCEL_DATE = null;
							} else {
										
			row1.AUTO_CANCEL_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 86);
		                    }
							if(colQtyInRs_tDBInput_1 < 87) {
								row1.SALE_VOIDED = null;
							} else {
	                         		
        	row1.SALE_VOIDED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 87, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 88) {
								row1.IS_SHIP_COMPLETE = null;
							} else {
	                         		
        	row1.IS_SHIP_COMPLETE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 88, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 89) {
								row1.IS_LINE_SHIP_COMPLETE = null;
							} else {
	                         		
        	row1.IS_LINE_SHIP_COMPLETE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 89, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 90) {
								row1.IS_SHIP_SINGLE_NODE = null;
							} else {
	                         		
        	row1.IS_SHIP_SINGLE_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 90, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 91) {
								row1.IS_LINE_SHIP_SINGLE_NODE = null;
							} else {
	                         		
        	row1.IS_LINE_SHIP_SINGLE_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 91, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 92) {
								row1.CANCEL_ORDER_ON_EXCP_FLAG = null;
							} else {
	                         		
        	row1.CANCEL_ORDER_ON_EXCP_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 92, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 93) {
								row1.OPTIMIZATION_TYPE = null;
							} else {
	                         		
        	row1.OPTIMIZATION_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 93, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 94) {
								row1.PURGE_HISTORY_DATE = null;
							} else {
										
			row1.PURGE_HISTORY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 94);
		                    }
							if(colQtyInRs_tDBInput_1 < 95) {
								row1.PRICING_CLASSIFICATION_CODE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(95) != null) {
						row1.PRICING_CLASSIFICATION_CODE = rs_tDBInput_1.getBigDecimal(95);
					} else {
				
						row1.PRICING_CLASSIFICATION_CODE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 96) {
								row1.SOURCE_TYPE = null;
							} else {
	                         		
        	row1.SOURCE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 96, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 97) {
								row1.SOURCE_KEY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(97) != null) {
						row1.SOURCE_KEY = rs_tDBInput_1.getBigDecimal(97);
					} else {
				
						row1.SOURCE_KEY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 98) {
								row1.LINKED_SOURCE_KEY = null;
							} else {
	                         		
        	row1.LINKED_SOURCE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 98, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 99) {
								row1.ORIGINAL_CONTAINER_KEY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(99) != null) {
						row1.ORIGINAL_CONTAINER_KEY = rs_tDBInput_1.getBigDecimal(99);
					} else {
				
						row1.ORIGINAL_CONTAINER_KEY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 100) {
								row1.SOLD_TO_KEY = null;
							} else {
	                         		
        	row1.SOLD_TO_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 100, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 101) {
								row1.TEAM_CODE = null;
							} else {
	                         		
        	row1.TEAM_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 101, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 102) {
								row1.LEVEL_OF_SERVICE = null;
							} else {
	                         		
        	row1.LEVEL_OF_SERVICE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 102, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 103) {
								row1.NEXT_ITER_SEQ_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(103) != null) {
						row1.NEXT_ITER_SEQ_NO = rs_tDBInput_1.getBigDecimal(103);
					} else {
				
						row1.NEXT_ITER_SEQ_NO = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 104) {
								row1.NEXT_ITER_DATE = null;
							} else {
										
			row1.NEXT_ITER_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 104);
		                    }
							if(colQtyInRs_tDBInput_1 < 105) {
								row1.HRS_BEFORE_NEXT_ITER = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(105) != null) {
						row1.HRS_BEFORE_NEXT_ITER = rs_tDBInput_1.getBigDecimal(105);
					} else {
				
						row1.HRS_BEFORE_NEXT_ITER = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 106) {
								row1.CREATETS = null;
							} else {
										
			row1.CREATETS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 106);
		                    }
							if(colQtyInRs_tDBInput_1 < 107) {
								row1.MODIFYTS = null;
							} else {
										
			row1.MODIFYTS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 107);
		                    }
							if(colQtyInRs_tDBInput_1 < 108) {
								row1.CREATEUSERID = null;
							} else {
	                         		
        	row1.CREATEUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 108, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 109) {
								row1.MODIFYUSERID = null;
							} else {
	                         		
        	row1.MODIFYUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 109, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 110) {
								row1.CREATEPROGID = null;
							} else {
	                         		
        	row1.CREATEPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 110, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 111) {
								row1.MODIFYPROGID = null;
							} else {
	                         		
        	row1.MODIFYPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 111, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 112) {
								row1.LOCKID = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(112) != null) {
						row1.LOCKID = rs_tDBInput_1.getBigDecimal(112);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 113) {
								row1.DEPARTMENT_CODE = null;
							} else {
	                         		
        	row1.DEPARTMENT_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 113, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 114) {
								row1.BUYER_USER_ID = null;
							} else {
	                         		
        	row1.BUYER_USER_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 114, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 115) {
								row1.RECREATE_AUTHORIZATIONS = null;
							} else {
	                         		
        	row1.RECREATE_AUTHORIZATIONS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 115, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 116) {
								row1.CUSTOMER_CONTACT_ID = null;
							} else {
	                         		
        	row1.CUSTOMER_CONTACT_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 116, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 117) {
								row1.OPPORTUNITY_KEY = null;
							} else {
	                         		
        	row1.OPPORTUNITY_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 117, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 118) {
								row1.IS_EXPIRATION_DATE_OVERRIDDEN = null;
							} else {
	                         		
        	row1.IS_EXPIRATION_DATE_OVERRIDDEN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 118, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 119) {
								row1.EXPIRATION_DATE = null;
							} else {
										
			row1.EXPIRATION_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 119);
		                    }
							if(colQtyInRs_tDBInput_1 < 120) {
								row1.APPROVAL_CYCLE = null;
							} else {
	                         		
        	row1.APPROVAL_CYCLE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 120, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 121) {
								row1.IN_STORE_PAYMENT_REQUIRED = null;
							} else {
	                         		
        	row1.IN_STORE_PAYMENT_REQUIRED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 121, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 122) {
								row1.IMMEDIATE_SETTLEMENT_VALUE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(122) != null) {
						row1.IMMEDIATE_SETTLEMENT_VALUE = rs_tDBInput_1.getBigDecimal(122);
					} else {
				
						row1.IMMEDIATE_SETTLEMENT_VALUE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 123) {
								row1.CUSTOMER_AGE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(123) != null) {
						row1.CUSTOMER_AGE = rs_tDBInput_1.getBigDecimal(123);
					} else {
				
						row1.CUSTOMER_AGE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 124) {
								row1.ALL_ADDRESSES_VERIFIED = null;
							} else {
	                         		
        	row1.ALL_ADDRESSES_VERIFIED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 124, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 125) {
								row1.COMPL_GIFT_BOX_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(125) != null) {
						row1.COMPL_GIFT_BOX_QTY = rs_tDBInput_1.getBigDecimal(125);
					} else {
				
						row1.COMPL_GIFT_BOX_QTY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 126) {
								row1.NO_OF_AUTH_STRIKES = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(126) != null) {
						row1.NO_OF_AUTH_STRIKES = rs_tDBInput_1.getBigDecimal(126);
					} else {
				
						row1.NO_OF_AUTH_STRIKES = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 127) {
								row1.SOURCE_IP_ADDRESS = null;
							} else {
	                         		
        	row1.SOURCE_IP_ADDRESS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 127, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 128) {
								row1.CUSTOMER_FIRST_NAME = null;
							} else {
	                         		
        	row1.CUSTOMER_FIRST_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 128, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 129) {
								row1.CUSTOMER_LAST_NAME = null;
							} else {
	                         		
        	row1.CUSTOMER_LAST_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 129, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 130) {
								row1.CUSTOMER_PHONE_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_PHONE_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 130, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 131) {
								row1.CUSTOMER_ZIP_CODE = null;
							} else {
	                         		
        	row1.CUSTOMER_ZIP_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 131, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 132) {
								row1.INDEX_VERSION = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(132) != null) {
						row1.INDEX_VERSION = rs_tDBInput_1.getBigDecimal(132);
					} else {
				
						row1.INDEX_VERSION = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 133) {
								row1.EXTN_TOTAL_PRICE = null;
							} else {
	                         		
        	row1.EXTN_TOTAL_PRICE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 133, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 134) {
								row1.CUSTOMER_EMAILID_LC = null;
							} else {
	                         		
        	row1.CUSTOMER_EMAILID_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 134, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 135) {
								row1.CUSTOMER_FIRST_NAME_LC = null;
							} else {
	                         		
        	row1.CUSTOMER_FIRST_NAME_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 135, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 136) {
								row1.CUSTOMER_LAST_NAME_LC = null;
							} else {
	                         		
        	row1.CUSTOMER_LAST_NAME_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 136, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 137) {
								row1.CUSTOMER_ZIP_CODE_LC = null;
							} else {
	                         		
        	row1.CUSTOMER_ZIP_CODE_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 137, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 138) {
								row1.ORDER_NAME_LC = null;
							} else {
	                         		
        	row1.ORDER_NAME_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 138, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 139) {
								row1.EXTN_POINTS_EARNED = null;
							} else {
	                         		
        	row1.EXTN_POINTS_EARNED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 139, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 140) {
								row1.EXTN_TOTAL_POINTS_EARNED = null;
							} else {
	                         		
        	row1.EXTN_TOTAL_POINTS_EARNED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 140, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 141) {
								row1.EXTN_IS_TAX_CALCULATED = null;
							} else {
	                         		
        	row1.EXTN_IS_TAX_CALCULATED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 141, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 142) {
								row1.EXTN_VERTEX_ENGINE = null;
							} else {
	                         		
        	row1.EXTN_VERTEX_ENGINE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 142, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 143) {
								row1.EXTN_EVENT_TIME_STAMP = null;
							} else {
	                         		
        	row1.EXTN_EVENT_TIME_STAMP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 143, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 144) {
								row1.EXTN_FULFILLMENT_ID = null;
							} else {
	                         		
        	row1.EXTN_FULFILLMENT_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 144, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 145) {
								row1.EXTN_ORDER_TYPE = null;
							} else {
	                         		
        	row1.EXTN_ORDER_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 145, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 146) {
								row1.EXTN_FIRST_NAME = null;
							} else {
	                         		
        	row1.EXTN_FIRST_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 146, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 147) {
								row1.EXTN_EMP_LAST_NAME1 = null;
							} else {
	                         		
        	row1.EXTN_EMP_LAST_NAME1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 147, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 148) {
								row1.EXTN_EMP_LAST_NAME2 = null;
							} else {
	                         		
        	row1.EXTN_EMP_LAST_NAME2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 148, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 149) {
								row1.EXTN_EMP_DISC_LEVEL = null;
							} else {
	                         		
        	row1.EXTN_EMP_DISC_LEVEL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 149, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 150) {
								row1.EXTN_EMPLOYEE_ID = null;
							} else {
	                         		
        	row1.EXTN_EMPLOYEE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 150, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 151) {
								row1.EXTN_ATTR_SEQ = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(151) != null) {
						row1.EXTN_ATTR_SEQ = rs_tDBInput_1.getBigDecimal(151);
					} else {
				
						row1.EXTN_ATTR_SEQ = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 152) {
								row1.ORDER_NO_LC = null;
							} else {
	                         		
        	row1.ORDER_NO_LC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 152, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 153) {
								row1.EXTN_PAYPAL_AUTH_ID = null;
							} else {
	                         		
        	row1.EXTN_PAYPAL_AUTH_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 153, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 154) {
								row1.EXTN_ORDER_DATE = null;
							} else {
	                         		
        	row1.EXTN_ORDER_DATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 154, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 155) {
								row1.EXTN_DTC_ORDER = null;
							} else {
	                         		
        	row1.EXTN_DTC_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 155, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 156) {
								row1.EXTN_SOURCE = null;
							} else {
	                         		
        	row1.EXTN_SOURCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 156, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 157) {
								row1.EXTN_ATG_CARRIER_CODE = null;
							} else {
	                         		
        	row1.EXTN_ATG_CARRIER_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 157, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 158) {
								row1.EXTN_VOUCHER_AMT = null;
							} else {
	                         		
        	row1.EXTN_VOUCHER_AMT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 158, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 159) {
								row1.EXTN_CUSTOMER_ALT_KEY = null;
							} else {
	                         		
        	row1.EXTN_CUSTOMER_ALT_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 159, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 160) {
								row1.EXTN_IS_GUEST_CHECKOUT = null;
							} else {
	                         		
        	row1.EXTN_IS_GUEST_CHECKOUT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 160, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 161) {
								row1.EXTN_ATG_ORDER_NO = null;
							} else {
	                         		
        	row1.EXTN_ATG_ORDER_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 161, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 162) {
								row1.EXTN_PREFIX = null;
							} else {
	                         		
        	row1.EXTN_PREFIX = routines.system.JDBCUtil.getString(rs_tDBInput_1, 162, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 163) {
								row1.EXTN_STORE_NO = null;
							} else {
	                         		
        	row1.EXTN_STORE_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 163, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 164) {
								row1.EXTN_ORDER_TAX_AREA_ID = null;
							} else {
	                         		
        	row1.EXTN_ORDER_TAX_AREA_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 164, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 165) {
								row1.CART_ID = null;
							} else {
	                         		
        	row1.CART_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 165, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 166) {
								row1.ROLLOUT_VERSION = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(166) != null) {
						row1.ROLLOUT_VERSION = rs_tDBInput_1.getBigDecimal(166);
					} else {
				
						row1.ROLLOUT_VERSION = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 167) {
								row1.EXTN_IS_MIGRATED = null;
							} else {
	                         		
        	row1.EXTN_IS_MIGRATED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 167, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 168) {
								row1.EXTN_GENERATE_CALL_TAGALERT = null;
							} else {
	                         		
        	row1.EXTN_GENERATE_CALL_TAGALERT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 168, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 169) {
								row1.EXTN_SUBSCRIPTION_ORDER = null;
							} else {
	                         		
        	row1.EXTN_SUBSCRIPTION_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 169, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 170) {
								row1.EXTN_CRM_CUSTOMER = null;
							} else {
	                         		
        	row1.EXTN_CRM_CUSTOMER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 170, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 171) {
								row1.EXTN_PRICING_DATE = null;
							} else {
										
			row1.EXTN_PRICING_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 171);
		                    }
							if(colQtyInRs_tDBInput_1 < 172) {
								row1.EXTN_ORIGINAL_ADP_ORDER = null;
							} else {
	                         		
        	row1.EXTN_ORIGINAL_ADP_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 172, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 173) {
								row1.EXTN_MCL_ORDER_SHIPMENT_ID = null;
							} else {
	                         		
        	row1.EXTN_MCL_ORDER_SHIPMENT_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 173, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 174) {
								row1.EXTN_MCL_CHANNEL = null;
							} else {
	                         		
        	row1.EXTN_MCL_CHANNEL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 174, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 175) {
								row1.EXTN_DM_BATCH_NO = null;
							} else {
	                         		
        	row1.EXTN_DM_BATCH_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 175, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 176) {
								row1.EXTN_KOUNT_SESSION_ID = null;
							} else {
	                         		
        	row1.EXTN_KOUNT_SESSION_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 176, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 177) {
								row1.EXTN_SHIPMENT_CHARGE = null;
							} else {
	                         		
        	row1.EXTN_SHIPMENT_CHARGE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 177, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 178) {
								row1.EXTN_SHIPMENT_DISCOUNT = null;
							} else {
	                         		
        	row1.EXTN_SHIPMENT_DISCOUNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 178, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 179) {
								row1.EXTN_ORDER_DISCOUNT = null;
							} else {
	                         		
        	row1.EXTN_ORDER_DISCOUNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 179, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 180) {
								row1.EXTN_ORDER_TAX = null;
							} else {
	                         		
        	row1.EXTN_ORDER_TAX = routines.system.JDBCUtil.getString(rs_tDBInput_1, 180, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 181) {
								row1.EXTN_RE_ORDER = null;
							} else {
	                         		
        	row1.EXTN_RE_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 181, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 182) {
								row1.EXTN_MOBILE_ORDER = null;
							} else {
	                         		
        	row1.EXTN_MOBILE_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 182, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 183) {
								row1.EXTN_MOBILE_ORDER_TYPE = null;
							} else {
	                         		
        	row1.EXTN_MOBILE_ORDER_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 183, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 184) {
								row1.EXTN_NEW_ORDER = null;
							} else {
	                         		
        	row1.EXTN_NEW_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 184, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 185) {
								row1.EXTN_VENDOR_ID = null;
							} else {
	                         		
        	row1.EXTN_VENDOR_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 185, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 186) {
								row1.EXTN_DEPT_ID = null;
							} else {
	                         		
        	row1.EXTN_DEPT_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 186, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 187) {
								row1.EXTN_COST_CENTER = null;
							} else {
	                         		
        	row1.EXTN_COST_CENTER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 187, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 188) {
								row1.EXTN_TNS_AUTHORIZED = null;
							} else {
	                         		
        	row1.EXTN_TNS_AUTHORIZED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 188, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 189) {
								row1.EXTN_BROWSER_IP = null;
							} else {
	                         		
        	row1.EXTN_BROWSER_IP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 189, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 190) {
								row1.EXTN_CUSTOMER_CREATETS = null;
							} else {
										
			row1.EXTN_CUSTOMER_CREATETS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 190);
		                    }
							if(colQtyInRs_tDBInput_1 < 191) {
								row1.EXTN_USER_AGENT = null;
							} else {
	                         		
        	row1.EXTN_USER_AGENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 191, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 192) {
								row1.EXTN_ACCEPT_LANG = null;
							} else {
	                         		
        	row1.EXTN_ACCEPT_LANG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 192, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 193) {
								row1.EXTN_ATG_ORDERID = null;
							} else {
	                         		
        	row1.EXTN_ATG_ORDERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 193, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 194) {
								row1.EXTN_RISKIFIED_SESSION = null;
							} else {
	                         		
        	row1.EXTN_RISKIFIED_SESSION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 194, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 195) {
								row1.EXTN_CUSTOMER_TIER = null;
							} else {
	                         		
        	row1.EXTN_CUSTOMER_TIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 195, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 196) {
								row1.EXTN_AURUS_TOKEN = null;
							} else {
	                         		
        	row1.EXTN_AURUS_TOKEN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 196, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 197) {
								row1.EXTN_RISKIFIED_COUNT = null;
							} else {
	                         		
        	row1.EXTN_RISKIFIED_COUNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 197, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 198) {
								row1.EXTN_IS_MIXED_CART_ORDER = null;
							} else {
	                         		
        	row1.EXTN_IS_MIXED_CART_ORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 198, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 199) {
								row1.EXTN_BOL_NO = null;
							} else {
	                         		
        	row1.EXTN_BOL_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 199, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 200) {
								row1.EXTN_DELIVERY_DATE = null;
							} else {
										
			row1.EXTN_DELIVERY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 200);
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
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_1","tDBInput_1","tOracleInput","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_HEADER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_HEADER_KEY", row1.ORDER_HEADER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ENTERPRISE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ENTERPRISE_KEY", row1.ENTERPRISE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_NO", row1.ORDER_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOURCING_CLASSIFICATION") != null){
                    incomingEnforcer_tDBOutput_1.put("SOURCING_CLASSIFICATION", row1.SOURCING_CLASSIFICATION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUYER_ORGANIZATION_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("BUYER_ORGANIZATION_CODE", row1.BUYER_ORGANIZATION_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SELLER_ORGANIZATION_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SELLER_ORGANIZATION_CODE", row1.SELLER_ORGANIZATION_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DOCUMENT_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("DOCUMENT_TYPE", row1.DOCUMENT_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BILL_TO_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("BILL_TO_KEY", row1.BILL_TO_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BILL_TO_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("BILL_TO_ID", row1.BILL_TO_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_REWARDS_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_REWARDS_NO", row1.CUSTOMER_REWARDS_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("VENDOR_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("VENDOR_ID", row1.VENDOR_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_TO_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_TO_KEY", row1.SHIP_TO_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_TO_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_TO_ID", row1.SHIP_TO_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_NODE", row1.SHIP_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVING_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVING_NODE", row1.RECEIVING_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUYER_RECEIVING_NODE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("BUYER_RECEIVING_NODE_ID", row1.BUYER_RECEIVING_NODE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MARK_FOR_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("MARK_FOR_KEY", row1.MARK_FOR_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUYER_MARK_FOR_NODE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("BUYER_MARK_FOR_NODE_ID", row1.BUYER_MARK_FOR_NODE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REQ_DELIVERY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("REQ_DELIVERY_DATE", row1.REQ_DELIVERY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REQ_CANCEL_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("REQ_CANCEL_DATE", row1.REQ_CANCEL_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REQ_SHIP_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("REQ_SHIP_DATE", row1.REQ_SHIP_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEFAULT_TEMPLATE") != null){
                    incomingEnforcer_tDBOutput_1.put("DEFAULT_TEMPLATE", row1.DEFAULT_TEMPLATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DIVISION") != null){
                    incomingEnforcer_tDBOutput_1.put("DIVISION", row1.DIVISION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_DATE", row1.ORDER_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_TYPE", row1.ORDER_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DRAFT_ORDER_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("DRAFT_ORDER_FLAG", row1.DRAFT_ORDER_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_PURPOSE") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_PURPOSE", row1.ORDER_PURPOSE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RETURN_OH_KEY_FOR_EXCHANGE") != null){
                    incomingEnforcer_tDBOutput_1.put("RETURN_OH_KEY_FOR_EXCHANGE", row1.RETURN_OH_KEY_FOR_EXCHANGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXCHANGE_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXCHANGE_TYPE", row1.EXCHANGE_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PENDING_TRANSFER_IN") != null){
                    incomingEnforcer_tDBOutput_1.put("PENDING_TRANSFER_IN", row1.PENDING_TRANSFER_IN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RETURN_BY_GIFT_RECIPIENT") != null){
                    incomingEnforcer_tDBOutput_1.put("RETURN_BY_GIFT_RECIPIENT", row1.RETURN_BY_GIFT_RECIPIENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ALLOCATION_RULE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("ALLOCATION_RULE_ID", row1.ALLOCATION_RULE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRIORITY_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("PRIORITY_CODE", row1.PRIORITY_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRIORITY_NUMBER") != null){
                    incomingEnforcer_tDBOutput_1.put("PRIORITY_NUMBER", row1.PRIORITY_NUMBER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CONTACT_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CONTACT_KEY", row1.CONTACT_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCAC") != null){
                    incomingEnforcer_tDBOutput_1.put("SCAC", row1.SCAC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CARRIER_SERVICE_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("CARRIER_SERVICE_CODE", row1.CARRIER_SERVICE_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTCARRIER_ACCOUNT_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTCARRIER_ACCOUNT_NO", row1.CUSTCARRIER_ACCOUNT_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NOTIFY_AFTER_SHIPMENT_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("NOTIFY_AFTER_SHIPMENT_FLAG", row1.NOTIFY_AFTER_SHIPMENT_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATED_AT_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("CREATED_AT_NODE", row1.CREATED_AT_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HAS_DERIVED_CHILD") != null){
                    incomingEnforcer_tDBOutput_1.put("HAS_DERIVED_CHILD", row1.HAS_DERIVED_CHILD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HAS_DERIVED_PARENT") != null){
                    incomingEnforcer_tDBOutput_1.put("HAS_DERIVED_PARENT", row1.HAS_DERIVED_PARENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NOTIFICATION_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("NOTIFICATION_TYPE", row1.NOTIFICATION_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NOTIFICATION_REFERENCE") != null){
                    incomingEnforcer_tDBOutput_1.put("NOTIFICATION_REFERENCE", row1.NOTIFICATION_REFERENCE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ENTRY_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("ENTRY_TYPE", row1.ENTRY_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTHORIZED_CLIENT") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTHORIZED_CLIENT", row1.AUTHORIZED_CLIENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ENTERED_BY") != null){
                    incomingEnforcer_tDBOutput_1.put("ENTERED_BY", row1.ENTERED_BY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PERSONALIZE_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("PERSONALIZE_CODE", row1.PERSONALIZE_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HOLD_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("HOLD_FLAG", row1.HOLD_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HOLD_REASON_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("HOLD_REASON_CODE", row1.HOLD_REASON_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_PO_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_PO_NO", row1.CUSTOMER_PO_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_CUSTOMER_PO_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_CUSTOMER_PO_NO", row1.CUSTOMER_CUSTOMER_PO_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_NAME", row1.ORDER_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PAYMENT_RULE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("PAYMENT_RULE_ID", row1.PAYMENT_RULE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TERMS_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("TERMS_CODE", row1.TERMS_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DELIVERY_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("DELIVERY_CODE", row1.DELIVERY_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHARGE_ACTUAL_FREIGHT") != null){
                    incomingEnforcer_tDBOutput_1.put("CHARGE_ACTUAL_FREIGHT", row1.CHARGE_ACTUAL_FREIGHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX", row1.TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TOTAL_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("TOTAL_AMOUNT", row1.TOTAL_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORIGINAL_TOTAL_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("ORIGINAL_TOTAL_AMOUNT", row1.ORIGINAL_TOTAL_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORIGINAL_TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("ORIGINAL_TAX", row1.ORIGINAL_TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CURRENCY") != null){
                    incomingEnforcer_tDBOutput_1.put("CURRENCY", row1.CURRENCY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ENTERPRISE_CURRENCY") != null){
                    incomingEnforcer_tDBOutput_1.put("ENTERPRISE_CURRENCY", row1.ENTERPRISE_CURRENCY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REPORTING_CONVERSION_RATE") != null){
                    incomingEnforcer_tDBOutput_1.put("REPORTING_CONVERSION_RATE", row1.REPORTING_CONVERSION_RATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REPORTING_CONVERSION_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("REPORTING_CONVERSION_DATE", row1.REPORTING_CONVERSION_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PAYMENT_STATUS") != null){
                    incomingEnforcer_tDBOutput_1.put("PAYMENT_STATUS", row1.PAYMENT_STATUS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTHORIZATION_EXPIRATION_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTHORIZATION_EXPIRATION_DATE", row1.AUTHORIZATION_EXPIRATION_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SEARCH_CRITERIA_1") != null){
                    incomingEnforcer_tDBOutput_1.put("SEARCH_CRITERIA_1", row1.SEARCH_CRITERIA_1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SEARCH_CRITERIA_2") != null){
                    incomingEnforcer_tDBOutput_1.put("SEARCH_CRITERIA_2", row1.SEARCH_CRITERIA_2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_EMAILID") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_EMAILID", row1.CUSTOMER_EMAILID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FOB") != null){
                    incomingEnforcer_tDBOutput_1.put("FOB", row1.FOB);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TOTAL_ADJUSTMENT_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("TOTAL_ADJUSTMENT_AMOUNT", row1.TOTAL_ADJUSTMENT_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OTHER_CHARGES") != null){
                    incomingEnforcer_tDBOutput_1.put("OTHER_CHARGES", row1.OTHER_CHARGES);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICE_PROGRAM_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICE_PROGRAM_KEY", row1.PRICE_PROGRAM_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAXPAYER_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("TAXPAYER_ID", row1.TAXPAYER_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_JURISDICTION") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX_JURISDICTION", row1.TAX_JURISDICTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_EXEMPT_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX_EXEMPT_FLAG", row1.TAX_EXEMPT_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_EXEMPTION_CERTIFICATE") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX_EXEMPTION_CERTIFICATE", row1.TAX_EXEMPTION_CERTIFICATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PURPOSE") != null){
                    incomingEnforcer_tDBOutput_1.put("PURPOSE", row1.PURPOSE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_COMPLETE") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_COMPLETE", row1.INVOICE_COMPLETE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_CLOSED") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_CLOSED", row1.ORDER_CLOSED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NEXT_ALERT_TS") != null){
                    incomingEnforcer_tDBOutput_1.put("NEXT_ALERT_TS", row1.NEXT_ALERT_TS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DO_NOT_CONSOLIDATE") != null){
                    incomingEnforcer_tDBOutput_1.put("DO_NOT_CONSOLIDATE", row1.DO_NOT_CONSOLIDATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHAIN_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("CHAIN_TYPE", row1.CHAIN_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ADJUSTMENT_INVOICE_PENDING") != null){
                    incomingEnforcer_tDBOutput_1.put("ADJUSTMENT_INVOICE_PENDING", row1.ADJUSTMENT_INVOICE_PENDING);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTO_CANCEL_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTO_CANCEL_DATE", row1.AUTO_CANCEL_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SALE_VOIDED") != null){
                    incomingEnforcer_tDBOutput_1.put("SALE_VOIDED", row1.SALE_VOIDED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_SHIP_COMPLETE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_SHIP_COMPLETE", row1.IS_SHIP_COMPLETE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_LINE_SHIP_COMPLETE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_LINE_SHIP_COMPLETE", row1.IS_LINE_SHIP_COMPLETE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_SHIP_SINGLE_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_SHIP_SINGLE_NODE", row1.IS_SHIP_SINGLE_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_LINE_SHIP_SINGLE_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_LINE_SHIP_SINGLE_NODE", row1.IS_LINE_SHIP_SINGLE_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CANCEL_ORDER_ON_EXCP_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("CANCEL_ORDER_ON_EXCP_FLAG", row1.CANCEL_ORDER_ON_EXCP_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OPTIMIZATION_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("OPTIMIZATION_TYPE", row1.OPTIMIZATION_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PURGE_HISTORY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("PURGE_HISTORY_DATE", row1.PURGE_HISTORY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_CLASSIFICATION_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_CLASSIFICATION_CODE", row1.PRICING_CLASSIFICATION_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOURCE_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("SOURCE_TYPE", row1.SOURCE_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOURCE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("SOURCE_KEY", row1.SOURCE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LINKED_SOURCE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("LINKED_SOURCE_KEY", row1.LINKED_SOURCE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORIGINAL_CONTAINER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORIGINAL_CONTAINER_KEY", row1.ORIGINAL_CONTAINER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOLD_TO_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("SOLD_TO_KEY", row1.SOLD_TO_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TEAM_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("TEAM_CODE", row1.TEAM_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LEVEL_OF_SERVICE") != null){
                    incomingEnforcer_tDBOutput_1.put("LEVEL_OF_SERVICE", row1.LEVEL_OF_SERVICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NEXT_ITER_SEQ_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("NEXT_ITER_SEQ_NO", row1.NEXT_ITER_SEQ_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NEXT_ITER_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("NEXT_ITER_DATE", row1.NEXT_ITER_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HRS_BEFORE_NEXT_ITER") != null){
                    incomingEnforcer_tDBOutput_1.put("HRS_BEFORE_NEXT_ITER", row1.HRS_BEFORE_NEXT_ITER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATETS") != null){
                    incomingEnforcer_tDBOutput_1.put("CREATETS", row1.CREATETS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MODIFYTS") != null){
                    incomingEnforcer_tDBOutput_1.put("MODIFYTS", row1.MODIFYTS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATEUSERID") != null){
                    incomingEnforcer_tDBOutput_1.put("CREATEUSERID", row1.CREATEUSERID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MODIFYUSERID") != null){
                    incomingEnforcer_tDBOutput_1.put("MODIFYUSERID", row1.MODIFYUSERID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREATEPROGID") != null){
                    incomingEnforcer_tDBOutput_1.put("CREATEPROGID", row1.CREATEPROGID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MODIFYPROGID") != null){
                    incomingEnforcer_tDBOutput_1.put("MODIFYPROGID", row1.MODIFYPROGID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOCKID") != null){
                    incomingEnforcer_tDBOutput_1.put("LOCKID", row1.LOCKID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEPARTMENT_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("DEPARTMENT_CODE", row1.DEPARTMENT_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUYER_USER_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("BUYER_USER_ID", row1.BUYER_USER_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECREATE_AUTHORIZATIONS") != null){
                    incomingEnforcer_tDBOutput_1.put("RECREATE_AUTHORIZATIONS", row1.RECREATE_AUTHORIZATIONS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_CONTACT_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_CONTACT_ID", row1.CUSTOMER_CONTACT_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OPPORTUNITY_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("OPPORTUNITY_KEY", row1.OPPORTUNITY_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_EXPIRATION_DATE_OVERRIDDEN") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_EXPIRATION_DATE_OVERRIDDEN", row1.IS_EXPIRATION_DATE_OVERRIDDEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXPIRATION_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXPIRATION_DATE", row1.EXPIRATION_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("APPROVAL_CYCLE") != null){
                    incomingEnforcer_tDBOutput_1.put("APPROVAL_CYCLE", row1.APPROVAL_CYCLE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IN_STORE_PAYMENT_REQUIRED") != null){
                    incomingEnforcer_tDBOutput_1.put("IN_STORE_PAYMENT_REQUIRED", row1.IN_STORE_PAYMENT_REQUIRED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMMEDIATE_SETTLEMENT_VALUE") != null){
                    incomingEnforcer_tDBOutput_1.put("IMMEDIATE_SETTLEMENT_VALUE", row1.IMMEDIATE_SETTLEMENT_VALUE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_AGE") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_AGE", row1.CUSTOMER_AGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ALL_ADDRESSES_VERIFIED") != null){
                    incomingEnforcer_tDBOutput_1.put("ALL_ADDRESSES_VERIFIED", row1.ALL_ADDRESSES_VERIFIED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COMPL_GIFT_BOX_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("COMPL_GIFT_BOX_QTY", row1.COMPL_GIFT_BOX_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NO_OF_AUTH_STRIKES") != null){
                    incomingEnforcer_tDBOutput_1.put("NO_OF_AUTH_STRIKES", row1.NO_OF_AUTH_STRIKES);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOURCE_IP_ADDRESS") != null){
                    incomingEnforcer_tDBOutput_1.put("SOURCE_IP_ADDRESS", row1.SOURCE_IP_ADDRESS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_FIRST_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_FIRST_NAME", row1.CUSTOMER_FIRST_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_LAST_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_LAST_NAME", row1.CUSTOMER_LAST_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_PHONE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_PHONE_NO", row1.CUSTOMER_PHONE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_ZIP_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_ZIP_CODE", row1.CUSTOMER_ZIP_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INDEX_VERSION") != null){
                    incomingEnforcer_tDBOutput_1.put("INDEX_VERSION", row1.INDEX_VERSION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_TOTAL_PRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_TOTAL_PRICE", row1.EXTN_TOTAL_PRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_EMAILID_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_EMAILID_LC", row1.CUSTOMER_EMAILID_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_FIRST_NAME_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_FIRST_NAME_LC", row1.CUSTOMER_FIRST_NAME_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_LAST_NAME_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_LAST_NAME_LC", row1.CUSTOMER_LAST_NAME_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_ZIP_CODE_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_ZIP_CODE_LC", row1.CUSTOMER_ZIP_CODE_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_NAME_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_NAME_LC", row1.ORDER_NAME_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_POINTS_EARNED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_POINTS_EARNED", row1.EXTN_POINTS_EARNED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_TOTAL_POINTS_EARNED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_TOTAL_POINTS_EARNED", row1.EXTN_TOTAL_POINTS_EARNED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_TAX_CALCULATED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_TAX_CALCULATED", row1.EXTN_IS_TAX_CALCULATED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_VERTEX_ENGINE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_VERTEX_ENGINE", row1.EXTN_VERTEX_ENGINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_EVENT_TIME_STAMP") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_EVENT_TIME_STAMP", row1.EXTN_EVENT_TIME_STAMP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_FULFILLMENT_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_FULFILLMENT_ID", row1.EXTN_FULFILLMENT_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDER_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDER_TYPE", row1.EXTN_ORDER_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_FIRST_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_FIRST_NAME", row1.EXTN_FIRST_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_EMP_LAST_NAME1") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_EMP_LAST_NAME1", row1.EXTN_EMP_LAST_NAME1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_EMP_LAST_NAME2") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_EMP_LAST_NAME2", row1.EXTN_EMP_LAST_NAME2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_EMP_DISC_LEVEL") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_EMP_DISC_LEVEL", row1.EXTN_EMP_DISC_LEVEL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_EMPLOYEE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_EMPLOYEE_ID", row1.EXTN_EMPLOYEE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ATTR_SEQ") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ATTR_SEQ", row1.EXTN_ATTR_SEQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_NO_LC") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_NO_LC", row1.ORDER_NO_LC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PAYPAL_AUTH_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PAYPAL_AUTH_ID", row1.EXTN_PAYPAL_AUTH_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDER_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDER_DATE", row1.EXTN_ORDER_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DTC_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DTC_ORDER", row1.EXTN_DTC_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SOURCE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SOURCE", row1.EXTN_SOURCE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ATG_CARRIER_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ATG_CARRIER_CODE", row1.EXTN_ATG_CARRIER_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_VOUCHER_AMT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_VOUCHER_AMT", row1.EXTN_VOUCHER_AMT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_CUSTOMER_ALT_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_CUSTOMER_ALT_KEY", row1.EXTN_CUSTOMER_ALT_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_GUEST_CHECKOUT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_GUEST_CHECKOUT", row1.EXTN_IS_GUEST_CHECKOUT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ATG_ORDER_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ATG_ORDER_NO", row1.EXTN_ATG_ORDER_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PREFIX") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PREFIX", row1.EXTN_PREFIX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_STORE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_STORE_NO", row1.EXTN_STORE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDER_TAX_AREA_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDER_TAX_AREA_ID", row1.EXTN_ORDER_TAX_AREA_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CART_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("CART_ID", row1.CART_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ROLLOUT_VERSION") != null){
                    incomingEnforcer_tDBOutput_1.put("ROLLOUT_VERSION", row1.ROLLOUT_VERSION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_MIGRATED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_MIGRATED", row1.EXTN_IS_MIGRATED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_GENERATE_CALL_TAGALERT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_GENERATE_CALL_TAGALERT", row1.EXTN_GENERATE_CALL_TAGALERT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SUBSCRIPTION_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SUBSCRIPTION_ORDER", row1.EXTN_SUBSCRIPTION_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_CRM_CUSTOMER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_CRM_CUSTOMER", row1.EXTN_CRM_CUSTOMER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICING_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICING_DATE", row1.EXTN_PRICING_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORIGINAL_ADP_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORIGINAL_ADP_ORDER", row1.EXTN_ORIGINAL_ADP_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MCL_ORDER_SHIPMENT_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MCL_ORDER_SHIPMENT_ID", row1.EXTN_MCL_ORDER_SHIPMENT_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MCL_CHANNEL") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MCL_CHANNEL", row1.EXTN_MCL_CHANNEL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DM_BATCH_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DM_BATCH_NO", row1.EXTN_DM_BATCH_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_KOUNT_SESSION_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_KOUNT_SESSION_ID", row1.EXTN_KOUNT_SESSION_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIPMENT_CHARGE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIPMENT_CHARGE", row1.EXTN_SHIPMENT_CHARGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIPMENT_DISCOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIPMENT_DISCOUNT", row1.EXTN_SHIPMENT_DISCOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDER_DISCOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDER_DISCOUNT", row1.EXTN_ORDER_DISCOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDER_TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDER_TAX", row1.EXTN_ORDER_TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RE_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RE_ORDER", row1.EXTN_RE_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MOBILE_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MOBILE_ORDER", row1.EXTN_MOBILE_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MOBILE_ORDER_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MOBILE_ORDER_TYPE", row1.EXTN_MOBILE_ORDER_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_NEW_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_NEW_ORDER", row1.EXTN_NEW_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_VENDOR_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_VENDOR_ID", row1.EXTN_VENDOR_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DEPT_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DEPT_ID", row1.EXTN_DEPT_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_COST_CENTER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_COST_CENTER", row1.EXTN_COST_CENTER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_TNS_AUTHORIZED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_TNS_AUTHORIZED", row1.EXTN_TNS_AUTHORIZED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_BROWSER_IP") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_BROWSER_IP", row1.EXTN_BROWSER_IP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_CUSTOMER_CREATETS") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_CUSTOMER_CREATETS", row1.EXTN_CUSTOMER_CREATETS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_USER_AGENT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_USER_AGENT", row1.EXTN_USER_AGENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ACCEPT_LANG") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ACCEPT_LANG", row1.EXTN_ACCEPT_LANG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ATG_ORDERID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ATG_ORDERID", row1.EXTN_ATG_ORDERID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RISKIFIED_SESSION") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RISKIFIED_SESSION", row1.EXTN_RISKIFIED_SESSION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_CUSTOMER_TIER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_CUSTOMER_TIER", row1.EXTN_CUSTOMER_TIER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_AURUS_TOKEN") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_AURUS_TOKEN", row1.EXTN_AURUS_TOKEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RISKIFIED_COUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RISKIFIED_COUNT", row1.EXTN_RISKIFIED_COUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_MIXED_CART_ORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_MIXED_CART_ORDER", row1.EXTN_IS_MIXED_CART_ORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_BOL_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_BOL_NO", row1.EXTN_BOL_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DELIVERY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DELIVERY_DATE", row1.EXTN_DELIVERY_DATE);
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_1","tDBInput_1","tOracleInput","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
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
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";
	
	

 



/**
 * [tDBInput_1 finally ] stop
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
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
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
        final YFS_ORDER_HEADER_H YFS_ORDER_HEADER_HClass = new YFS_ORDER_HEADER_H();

        int exitCode = YFS_ORDER_HEADER_HClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'YFS_ORDER_HEADER_H' - Done.");
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
			log.info("TalendJob: 'YFS_ORDER_HEADER_H' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_iN60YOv6Eeui_7U8UwU2ug");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-18T03:37:06.372002100Z");

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
            java.io.InputStream inContext = YFS_ORDER_HEADER_H.class.getClassLoader().getResourceAsStream("at_talend_jobs/yfs_order_header_h_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = YFS_ORDER_HEADER_H.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("oms_reader_db", "id_String");
                        if(context.getStringValue("oms_reader_db") == null) {
                            context.oms_reader_db = null;
                        } else {
                            context.oms_reader_db=(String) context.getProperty("oms_reader_db");
                        }
                        context.setContextType("oms_reader_host", "id_String");
                        if(context.getStringValue("oms_reader_host") == null) {
                            context.oms_reader_host = null;
                        } else {
                            context.oms_reader_host=(String) context.getProperty("oms_reader_host");
                        }
                        context.setContextType("oms_reader_port", "id_String");
                        if(context.getStringValue("oms_reader_port") == null) {
                            context.oms_reader_port = null;
                        } else {
                            context.oms_reader_port=(String) context.getProperty("oms_reader_port");
                        }
                        context.setContextType("oms_reader_pwd", "id_Password");
                        if(context.getStringValue("oms_reader_pwd") == null) {
                            context.oms_reader_pwd = null;
                        } else {
                            String pwd_oms_reader_pwd_value = context.getProperty("oms_reader_pwd");
                            context.oms_reader_pwd = null;
                            if(pwd_oms_reader_pwd_value!=null) {
                                if(context_param.containsKey("oms_reader_pwd")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.oms_reader_pwd = pwd_oms_reader_pwd_value;
                                } else if (!pwd_oms_reader_pwd_value.isEmpty()) {
                                    try {
                                        context.oms_reader_pwd = routines.system.PasswordEncryptUtil.decryptPassword(pwd_oms_reader_pwd_value);
                                        context.put("oms_reader_pwd",context.oms_reader_pwd);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("oms_reader_serviceid", "id_String");
                        if(context.getStringValue("oms_reader_serviceid") == null) {
                            context.oms_reader_serviceid = null;
                        } else {
                            context.oms_reader_serviceid=(String) context.getProperty("oms_reader_serviceid");
                        }
                        context.setContextType("oms_reader_user_id", "id_String");
                        if(context.getStringValue("oms_reader_user_id") == null) {
                            context.oms_reader_user_id = null;
                        } else {
                            context.oms_reader_user_id=(String) context.getProperty("oms_reader_user_id");
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
                        context.setContextType("SF_oms_database", "id_String");
                        if(context.getStringValue("SF_oms_database") == null) {
                            context.SF_oms_database = null;
                        } else {
                            context.SF_oms_database=(String) context.getProperty("SF_oms_database");
                        }
                        context.setContextType("SF_oms_schema", "id_String");
                        if(context.getStringValue("SF_oms_schema") == null) {
                            context.SF_oms_schema = null;
                        } else {
                            context.SF_oms_schema=(String) context.getProperty("SF_oms_schema");
                        }
                        context.setContextType("SF_oms_warehouse", "id_String");
                        if(context.getStringValue("SF_oms_warehouse") == null) {
                            context.SF_oms_warehouse = null;
                        } else {
                            context.SF_oms_warehouse=(String) context.getProperty("SF_oms_warehouse");
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
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("oms_reader_db")) {
                context.oms_reader_db = (String) parentContextMap.get("oms_reader_db");
            }if (parentContextMap.containsKey("oms_reader_host")) {
                context.oms_reader_host = (String) parentContextMap.get("oms_reader_host");
            }if (parentContextMap.containsKey("oms_reader_port")) {
                context.oms_reader_port = (String) parentContextMap.get("oms_reader_port");
            }if (parentContextMap.containsKey("oms_reader_pwd")) {
                context.oms_reader_pwd = (java.lang.String) parentContextMap.get("oms_reader_pwd");
            }if (parentContextMap.containsKey("oms_reader_serviceid")) {
                context.oms_reader_serviceid = (String) parentContextMap.get("oms_reader_serviceid");
            }if (parentContextMap.containsKey("oms_reader_user_id")) {
                context.oms_reader_user_id = (String) parentContextMap.get("oms_reader_user_id");
            }if (parentContextMap.containsKey("SF_account")) {
                context.SF_account = (String) parentContextMap.get("SF_account");
            }if (parentContextMap.containsKey("SF_prod_database")) {
                context.SF_prod_database = (String) parentContextMap.get("SF_prod_database");
            }if (parentContextMap.containsKey("SF_oms_database")) {
                context.SF_oms_database = (String) parentContextMap.get("SF_oms_database");
            }if (parentContextMap.containsKey("SF_oms_schema")) {
                context.SF_oms_schema = (String) parentContextMap.get("SF_oms_schema");
            }if (parentContextMap.containsKey("SF_oms_warehouse")) {
                context.SF_oms_warehouse = (String) parentContextMap.get("SF_oms_warehouse");
            }if (parentContextMap.containsKey("SF_password")) {
                context.SF_password = (java.lang.String) parentContextMap.get("SF_password");
            }if (parentContextMap.containsKey("SF_fin_schema")) {
                context.SF_fin_schema = (String) parentContextMap.get("SF_fin_schema");
            }if (parentContextMap.containsKey("SF_user_id")) {
                context.SF_user_id = (String) parentContextMap.get("SF_user_id");
            }if (parentContextMap.containsKey("SF_warehouse")) {
                context.SF_warehouse = (String) parentContextMap.get("SF_warehouse");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("oms_reader_pwd");
			parametersToEncrypt.add("SF_password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'YFS_ORDER_HEADER_H' - Started.");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : YFS_ORDER_HEADER_H");
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
        log.info("TalendJob: 'YFS_ORDER_HEADER_H' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     664018 characters generated by Talend Cloud Data Management Platform 
 *     on the June 17, 2023 at 11:37:06 PM EDT
 ************************************************************************************************/