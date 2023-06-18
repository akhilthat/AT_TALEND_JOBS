
package at_talend_jobs.yfs_order_line_h_0_1;

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
 * Job: YFS_ORDER_LINE_H Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class YFS_ORDER_LINE_H implements TalendJob {
	static {System.setProperty("TalendJob.log", "YFS_ORDER_LINE_H.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(YFS_ORDER_LINE_H.class);
	

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
	private final String jobName = "YFS_ORDER_LINE_H";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_A7v-MOv8Eeui_7U8UwU2ug", "0.1");
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
				YFS_ORDER_LINE_H.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(YFS_ORDER_LINE_H.this, new Object[] { e , currentComponent, globalMap});
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:5/hWCGngd7CKZCHHQC8u+RB2w5CFkuuFSdQGYyBT/kHOGFyJ"));
 		                        
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
                            log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:1zO2y6pwG94CdgsHoXJD08ZRi1EXJ4w828B0Y/Aqwvp5vVenb3A=").substring(0, 4) + "...");     
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
	
	
		 
	final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:UPbhOWaNN5FEcyB7QJnctCy4BTOE9Jgf9EFltma2SMaZvkSglwQ=");
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
 		                    "\nDelete from YFS_ORDER_LINE_H\nwhere MODIFYTS >= cast(substr(convert_timezone('America/New_York', DATEADD(DAY, -7, cur"
+"rent_timestamp())),0,10) as TIMESTAMPNTZ);\n\n");
 		                    
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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[0];

	
			    public String ORDER_LINE_KEY;

				public String getORDER_LINE_KEY () {
					return this.ORDER_LINE_KEY;
				}

				public Boolean ORDER_LINE_KEYIsNullable(){
				    return false;
				}
				public Boolean ORDER_LINE_KEYIsKey(){
				    return false;
				}
				public Integer ORDER_LINE_KEYLength(){
				    return null;
				}
				public Integer ORDER_LINE_KEYPrecision(){
				    return null;
				}
				public String ORDER_LINE_KEYDefault(){
				
					return null;
				
				}
				public String ORDER_LINE_KEYComment(){
				
				    return "";
				
				}
				public String ORDER_LINE_KEYPattern(){
				
					return "";
				
				}
				public String ORDER_LINE_KEYOriginalDbColumnName(){
				
					return "ORDER_LINE_KEY";
				
				}

				
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

				
			    public BigDecimal PRIME_LINE_NO;

				public BigDecimal getPRIME_LINE_NO () {
					return this.PRIME_LINE_NO;
				}

				public Boolean PRIME_LINE_NOIsNullable(){
				    return false;
				}
				public Boolean PRIME_LINE_NOIsKey(){
				    return false;
				}
				public Integer PRIME_LINE_NOLength(){
				    return null;
				}
				public Integer PRIME_LINE_NOPrecision(){
				    return null;
				}
				public String PRIME_LINE_NODefault(){
				
					return "";
				
				}
				public String PRIME_LINE_NOComment(){
				
				    return "";
				
				}
				public String PRIME_LINE_NOPattern(){
				
					return "";
				
				}
				public String PRIME_LINE_NOOriginalDbColumnName(){
				
					return "PRIME_LINE_NO";
				
				}

				
			    public BigDecimal SUB_LINE_NO;

				public BigDecimal getSUB_LINE_NO () {
					return this.SUB_LINE_NO;
				}

				public Boolean SUB_LINE_NOIsNullable(){
				    return false;
				}
				public Boolean SUB_LINE_NOIsKey(){
				    return false;
				}
				public Integer SUB_LINE_NOLength(){
				    return null;
				}
				public Integer SUB_LINE_NOPrecision(){
				    return null;
				}
				public String SUB_LINE_NODefault(){
				
					return "";
				
				}
				public String SUB_LINE_NOComment(){
				
				    return "";
				
				}
				public String SUB_LINE_NOPattern(){
				
					return "";
				
				}
				public String SUB_LINE_NOOriginalDbColumnName(){
				
					return "SUB_LINE_NO";
				
				}

				
			    public String LINE_TYPE;

				public String getLINE_TYPE () {
					return this.LINE_TYPE;
				}

				public Boolean LINE_TYPEIsNullable(){
				    return false;
				}
				public Boolean LINE_TYPEIsKey(){
				    return false;
				}
				public Integer LINE_TYPELength(){
				    return null;
				}
				public Integer LINE_TYPEPrecision(){
				    return null;
				}
				public String LINE_TYPEDefault(){
				
					return null;
				
				}
				public String LINE_TYPEComment(){
				
				    return "";
				
				}
				public String LINE_TYPEPattern(){
				
					return "";
				
				}
				public String LINE_TYPEOriginalDbColumnName(){
				
					return "LINE_TYPE";
				
				}

				
			    public String ORDER_CLASS;

				public String getORDER_CLASS () {
					return this.ORDER_CLASS;
				}

				public Boolean ORDER_CLASSIsNullable(){
				    return false;
				}
				public Boolean ORDER_CLASSIsKey(){
				    return false;
				}
				public Integer ORDER_CLASSLength(){
				    return null;
				}
				public Integer ORDER_CLASSPrecision(){
				    return null;
				}
				public String ORDER_CLASSDefault(){
				
					return null;
				
				}
				public String ORDER_CLASSComment(){
				
				    return "";
				
				}
				public String ORDER_CLASSPattern(){
				
					return "";
				
				}
				public String ORDER_CLASSOriginalDbColumnName(){
				
					return "ORDER_CLASS";
				
				}

				
			    public String ITEM_ID;

				public String getITEM_ID () {
					return this.ITEM_ID;
				}

				public Boolean ITEM_IDIsNullable(){
				    return false;
				}
				public Boolean ITEM_IDIsKey(){
				    return false;
				}
				public Integer ITEM_IDLength(){
				    return null;
				}
				public Integer ITEM_IDPrecision(){
				    return null;
				}
				public String ITEM_IDDefault(){
				
					return null;
				
				}
				public String ITEM_IDComment(){
				
				    return "";
				
				}
				public String ITEM_IDPattern(){
				
					return "";
				
				}
				public String ITEM_IDOriginalDbColumnName(){
				
					return "ITEM_ID";
				
				}

				
			    public String ALTERNATE_ITEM_ID;

				public String getALTERNATE_ITEM_ID () {
					return this.ALTERNATE_ITEM_ID;
				}

				public Boolean ALTERNATE_ITEM_IDIsNullable(){
				    return true;
				}
				public Boolean ALTERNATE_ITEM_IDIsKey(){
				    return false;
				}
				public Integer ALTERNATE_ITEM_IDLength(){
				    return null;
				}
				public Integer ALTERNATE_ITEM_IDPrecision(){
				    return null;
				}
				public String ALTERNATE_ITEM_IDDefault(){
				
					return null;
				
				}
				public String ALTERNATE_ITEM_IDComment(){
				
				    return "";
				
				}
				public String ALTERNATE_ITEM_IDPattern(){
				
					return "";
				
				}
				public String ALTERNATE_ITEM_IDOriginalDbColumnName(){
				
					return "ALTERNATE_ITEM_ID";
				
				}

				
			    public String UOM;

				public String getUOM () {
					return this.UOM;
				}

				public Boolean UOMIsNullable(){
				    return false;
				}
				public Boolean UOMIsKey(){
				    return false;
				}
				public Integer UOMLength(){
				    return null;
				}
				public Integer UOMPrecision(){
				    return null;
				}
				public String UOMDefault(){
				
					return null;
				
				}
				public String UOMComment(){
				
				    return "";
				
				}
				public String UOMPattern(){
				
					return "";
				
				}
				public String UOMOriginalDbColumnName(){
				
					return "UOM";
				
				}

				
			    public String PRODUCT_CLASS;

				public String getPRODUCT_CLASS () {
					return this.PRODUCT_CLASS;
				}

				public Boolean PRODUCT_CLASSIsNullable(){
				    return false;
				}
				public Boolean PRODUCT_CLASSIsKey(){
				    return false;
				}
				public Integer PRODUCT_CLASSLength(){
				    return null;
				}
				public Integer PRODUCT_CLASSPrecision(){
				    return null;
				}
				public String PRODUCT_CLASSDefault(){
				
					return null;
				
				}
				public String PRODUCT_CLASSComment(){
				
				    return "";
				
				}
				public String PRODUCT_CLASSPattern(){
				
					return "";
				
				}
				public String PRODUCT_CLASSOriginalDbColumnName(){
				
					return "PRODUCT_CLASS";
				
				}

				
			    public BigDecimal UNIT_PRICE;

				public BigDecimal getUNIT_PRICE () {
					return this.UNIT_PRICE;
				}

				public Boolean UNIT_PRICEIsNullable(){
				    return false;
				}
				public Boolean UNIT_PRICEIsKey(){
				    return false;
				}
				public Integer UNIT_PRICELength(){
				    return null;
				}
				public Integer UNIT_PRICEPrecision(){
				    return null;
				}
				public String UNIT_PRICEDefault(){
				
					return "";
				
				}
				public String UNIT_PRICEComment(){
				
				    return "";
				
				}
				public String UNIT_PRICEPattern(){
				
					return "";
				
				}
				public String UNIT_PRICEOriginalDbColumnName(){
				
					return "UNIT_PRICE";
				
				}

				
			    public String COST_CURRENCY;

				public String getCOST_CURRENCY () {
					return this.COST_CURRENCY;
				}

				public Boolean COST_CURRENCYIsNullable(){
				    return false;
				}
				public Boolean COST_CURRENCYIsKey(){
				    return false;
				}
				public Integer COST_CURRENCYLength(){
				    return null;
				}
				public Integer COST_CURRENCYPrecision(){
				    return null;
				}
				public String COST_CURRENCYDefault(){
				
					return null;
				
				}
				public String COST_CURRENCYComment(){
				
				    return "";
				
				}
				public String COST_CURRENCYPattern(){
				
					return "";
				
				}
				public String COST_CURRENCYOriginalDbColumnName(){
				
					return "COST_CURRENCY";
				
				}

				
			    public BigDecimal ORDERED_QTY;

				public BigDecimal getORDERED_QTY () {
					return this.ORDERED_QTY;
				}

				public Boolean ORDERED_QTYIsNullable(){
				    return false;
				}
				public Boolean ORDERED_QTYIsKey(){
				    return false;
				}
				public Integer ORDERED_QTYLength(){
				    return null;
				}
				public Integer ORDERED_QTYPrecision(){
				    return null;
				}
				public String ORDERED_QTYDefault(){
				
					return "";
				
				}
				public String ORDERED_QTYComment(){
				
				    return "";
				
				}
				public String ORDERED_QTYPattern(){
				
					return "";
				
				}
				public String ORDERED_QTYOriginalDbColumnName(){
				
					return "ORDERED_QTY";
				
				}

				
			    public BigDecimal BASIC_CAPACITY_REQUIRED;

				public BigDecimal getBASIC_CAPACITY_REQUIRED () {
					return this.BASIC_CAPACITY_REQUIRED;
				}

				public Boolean BASIC_CAPACITY_REQUIREDIsNullable(){
				    return false;
				}
				public Boolean BASIC_CAPACITY_REQUIREDIsKey(){
				    return false;
				}
				public Integer BASIC_CAPACITY_REQUIREDLength(){
				    return null;
				}
				public Integer BASIC_CAPACITY_REQUIREDPrecision(){
				    return null;
				}
				public String BASIC_CAPACITY_REQUIREDDefault(){
				
					return "";
				
				}
				public String BASIC_CAPACITY_REQUIREDComment(){
				
				    return "";
				
				}
				public String BASIC_CAPACITY_REQUIREDPattern(){
				
					return "";
				
				}
				public String BASIC_CAPACITY_REQUIREDOriginalDbColumnName(){
				
					return "BASIC_CAPACITY_REQUIRED";
				
				}

				
			    public BigDecimal OPTION_CAPACITY_REQUIRED;

				public BigDecimal getOPTION_CAPACITY_REQUIRED () {
					return this.OPTION_CAPACITY_REQUIRED;
				}

				public Boolean OPTION_CAPACITY_REQUIREDIsNullable(){
				    return false;
				}
				public Boolean OPTION_CAPACITY_REQUIREDIsKey(){
				    return false;
				}
				public Integer OPTION_CAPACITY_REQUIREDLength(){
				    return null;
				}
				public Integer OPTION_CAPACITY_REQUIREDPrecision(){
				    return null;
				}
				public String OPTION_CAPACITY_REQUIREDDefault(){
				
					return "";
				
				}
				public String OPTION_CAPACITY_REQUIREDComment(){
				
				    return "";
				
				}
				public String OPTION_CAPACITY_REQUIREDPattern(){
				
					return "";
				
				}
				public String OPTION_CAPACITY_REQUIREDOriginalDbColumnName(){
				
					return "OPTION_CAPACITY_REQUIRED";
				
				}

				
			    public String DEPENDENT_ON_LINE_KEY;

				public String getDEPENDENT_ON_LINE_KEY () {
					return this.DEPENDENT_ON_LINE_KEY;
				}

				public Boolean DEPENDENT_ON_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean DEPENDENT_ON_LINE_KEYIsKey(){
				    return false;
				}
				public Integer DEPENDENT_ON_LINE_KEYLength(){
				    return null;
				}
				public Integer DEPENDENT_ON_LINE_KEYPrecision(){
				    return null;
				}
				public String DEPENDENT_ON_LINE_KEYDefault(){
				
					return null;
				
				}
				public String DEPENDENT_ON_LINE_KEYComment(){
				
				    return "";
				
				}
				public String DEPENDENT_ON_LINE_KEYPattern(){
				
					return "";
				
				}
				public String DEPENDENT_ON_LINE_KEYOriginalDbColumnName(){
				
					return "DEPENDENT_ON_LINE_KEY";
				
				}

				
			    public String CURRENT_WORK_ORDER_KEY;

				public String getCURRENT_WORK_ORDER_KEY () {
					return this.CURRENT_WORK_ORDER_KEY;
				}

				public Boolean CURRENT_WORK_ORDER_KEYIsNullable(){
				    return true;
				}
				public Boolean CURRENT_WORK_ORDER_KEYIsKey(){
				    return false;
				}
				public Integer CURRENT_WORK_ORDER_KEYLength(){
				    return null;
				}
				public Integer CURRENT_WORK_ORDER_KEYPrecision(){
				    return null;
				}
				public String CURRENT_WORK_ORDER_KEYDefault(){
				
					return null;
				
				}
				public String CURRENT_WORK_ORDER_KEYComment(){
				
				    return "";
				
				}
				public String CURRENT_WORK_ORDER_KEYPattern(){
				
					return "";
				
				}
				public String CURRENT_WORK_ORDER_KEYOriginalDbColumnName(){
				
					return "CURRENT_WORK_ORDER_KEY";
				
				}

				
			    public String DEPENDENCY_SHIPPING_RULE;

				public String getDEPENDENCY_SHIPPING_RULE () {
					return this.DEPENDENCY_SHIPPING_RULE;
				}

				public Boolean DEPENDENCY_SHIPPING_RULEIsNullable(){
				    return true;
				}
				public Boolean DEPENDENCY_SHIPPING_RULEIsKey(){
				    return false;
				}
				public Integer DEPENDENCY_SHIPPING_RULELength(){
				    return null;
				}
				public Integer DEPENDENCY_SHIPPING_RULEPrecision(){
				    return null;
				}
				public String DEPENDENCY_SHIPPING_RULEDefault(){
				
					return null;
				
				}
				public String DEPENDENCY_SHIPPING_RULEComment(){
				
				    return "";
				
				}
				public String DEPENDENCY_SHIPPING_RULEPattern(){
				
					return "";
				
				}
				public String DEPENDENCY_SHIPPING_RULEOriginalDbColumnName(){
				
					return "DEPENDENCY_SHIPPING_RULE";
				
				}

				
			    public BigDecimal FILL_QUANTITY;

				public BigDecimal getFILL_QUANTITY () {
					return this.FILL_QUANTITY;
				}

				public Boolean FILL_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean FILL_QUANTITYIsKey(){
				    return false;
				}
				public Integer FILL_QUANTITYLength(){
				    return null;
				}
				public Integer FILL_QUANTITYPrecision(){
				    return null;
				}
				public String FILL_QUANTITYDefault(){
				
					return "";
				
				}
				public String FILL_QUANTITYComment(){
				
				    return "";
				
				}
				public String FILL_QUANTITYPattern(){
				
					return "";
				
				}
				public String FILL_QUANTITYOriginalDbColumnName(){
				
					return "FILL_QUANTITY";
				
				}

				
			    public BigDecimal COMMITTED_QUANTITY;

				public BigDecimal getCOMMITTED_QUANTITY () {
					return this.COMMITTED_QUANTITY;
				}

				public Boolean COMMITTED_QUANTITYIsNullable(){
				    return true;
				}
				public Boolean COMMITTED_QUANTITYIsKey(){
				    return false;
				}
				public Integer COMMITTED_QUANTITYLength(){
				    return null;
				}
				public Integer COMMITTED_QUANTITYPrecision(){
				    return null;
				}
				public String COMMITTED_QUANTITYDefault(){
				
					return "";
				
				}
				public String COMMITTED_QUANTITYComment(){
				
				    return "";
				
				}
				public String COMMITTED_QUANTITYPattern(){
				
					return "";
				
				}
				public String COMMITTED_QUANTITYOriginalDbColumnName(){
				
					return "COMMITTED_QUANTITY";
				
				}

				
			    public BigDecimal DEPENDENCY_RATIO;

				public BigDecimal getDEPENDENCY_RATIO () {
					return this.DEPENDENCY_RATIO;
				}

				public Boolean DEPENDENCY_RATIOIsNullable(){
				    return false;
				}
				public Boolean DEPENDENCY_RATIOIsKey(){
				    return false;
				}
				public Integer DEPENDENCY_RATIOLength(){
				    return null;
				}
				public Integer DEPENDENCY_RATIOPrecision(){
				    return null;
				}
				public String DEPENDENCY_RATIODefault(){
				
					return "";
				
				}
				public String DEPENDENCY_RATIOComment(){
				
				    return "";
				
				}
				public String DEPENDENCY_RATIOPattern(){
				
					return "";
				
				}
				public String DEPENDENCY_RATIOOriginalDbColumnName(){
				
					return "DEPENDENCY_RATIO";
				
				}

				
			    public String MAINTAIN_RATIO;

				public String getMAINTAIN_RATIO () {
					return this.MAINTAIN_RATIO;
				}

				public Boolean MAINTAIN_RATIOIsNullable(){
				    return false;
				}
				public Boolean MAINTAIN_RATIOIsKey(){
				    return false;
				}
				public Integer MAINTAIN_RATIOLength(){
				    return null;
				}
				public Integer MAINTAIN_RATIOPrecision(){
				    return null;
				}
				public String MAINTAIN_RATIODefault(){
				
					return null;
				
				}
				public String MAINTAIN_RATIOComment(){
				
				    return "";
				
				}
				public String MAINTAIN_RATIOPattern(){
				
					return "";
				
				}
				public String MAINTAIN_RATIOOriginalDbColumnName(){
				
					return "MAINTAIN_RATIO";
				
				}

				
			    public String MERGE_NODE;

				public String getMERGE_NODE () {
					return this.MERGE_NODE;
				}

				public Boolean MERGE_NODEIsNullable(){
				    return true;
				}
				public Boolean MERGE_NODEIsKey(){
				    return false;
				}
				public Integer MERGE_NODELength(){
				    return null;
				}
				public Integer MERGE_NODEPrecision(){
				    return null;
				}
				public String MERGE_NODEDefault(){
				
					return null;
				
				}
				public String MERGE_NODEComment(){
				
				    return "";
				
				}
				public String MERGE_NODEPattern(){
				
					return "";
				
				}
				public String MERGE_NODEOriginalDbColumnName(){
				
					return "MERGE_NODE";
				
				}

				
			    public String PARENT_OF_DEPENDENT_GROUP;

				public String getPARENT_OF_DEPENDENT_GROUP () {
					return this.PARENT_OF_DEPENDENT_GROUP;
				}

				public Boolean PARENT_OF_DEPENDENT_GROUPIsNullable(){
				    return false;
				}
				public Boolean PARENT_OF_DEPENDENT_GROUPIsKey(){
				    return false;
				}
				public Integer PARENT_OF_DEPENDENT_GROUPLength(){
				    return null;
				}
				public Integer PARENT_OF_DEPENDENT_GROUPPrecision(){
				    return null;
				}
				public String PARENT_OF_DEPENDENT_GROUPDefault(){
				
					return null;
				
				}
				public String PARENT_OF_DEPENDENT_GROUPComment(){
				
				    return "";
				
				}
				public String PARENT_OF_DEPENDENT_GROUPPattern(){
				
					return "";
				
				}
				public String PARENT_OF_DEPENDENT_GROUPOriginalDbColumnName(){
				
					return "PARENT_OF_DEPENDENT_GROUP";
				
				}

				
			    public String SOURCE_FROM_ORGANIZATION;

				public String getSOURCE_FROM_ORGANIZATION () {
					return this.SOURCE_FROM_ORGANIZATION;
				}

				public Boolean SOURCE_FROM_ORGANIZATIONIsNullable(){
				    return true;
				}
				public Boolean SOURCE_FROM_ORGANIZATIONIsKey(){
				    return false;
				}
				public Integer SOURCE_FROM_ORGANIZATIONLength(){
				    return null;
				}
				public Integer SOURCE_FROM_ORGANIZATIONPrecision(){
				    return null;
				}
				public String SOURCE_FROM_ORGANIZATIONDefault(){
				
					return null;
				
				}
				public String SOURCE_FROM_ORGANIZATIONComment(){
				
				    return "";
				
				}
				public String SOURCE_FROM_ORGANIZATIONPattern(){
				
					return "";
				
				}
				public String SOURCE_FROM_ORGANIZATIONOriginalDbColumnName(){
				
					return "SOURCE_FROM_ORGANIZATION";
				
				}

				
			    public String CHAINED_FROM_ORDER_LINE_KEY;

				public String getCHAINED_FROM_ORDER_LINE_KEY () {
					return this.CHAINED_FROM_ORDER_LINE_KEY;
				}

				public Boolean CHAINED_FROM_ORDER_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean CHAINED_FROM_ORDER_LINE_KEYIsKey(){
				    return false;
				}
				public Integer CHAINED_FROM_ORDER_LINE_KEYLength(){
				    return null;
				}
				public Integer CHAINED_FROM_ORDER_LINE_KEYPrecision(){
				    return null;
				}
				public String CHAINED_FROM_ORDER_LINE_KEYDefault(){
				
					return null;
				
				}
				public String CHAINED_FROM_ORDER_LINE_KEYComment(){
				
				    return "";
				
				}
				public String CHAINED_FROM_ORDER_LINE_KEYPattern(){
				
					return "";
				
				}
				public String CHAINED_FROM_ORDER_LINE_KEYOriginalDbColumnName(){
				
					return "CHAINED_FROM_ORDER_LINE_KEY";
				
				}

				
			    public String CHAINED_FROM_ORDER_HEADER_KEY;

				public String getCHAINED_FROM_ORDER_HEADER_KEY () {
					return this.CHAINED_FROM_ORDER_HEADER_KEY;
				}

				public Boolean CHAINED_FROM_ORDER_HEADER_KEYIsNullable(){
				    return true;
				}
				public Boolean CHAINED_FROM_ORDER_HEADER_KEYIsKey(){
				    return false;
				}
				public Integer CHAINED_FROM_ORDER_HEADER_KEYLength(){
				    return null;
				}
				public Integer CHAINED_FROM_ORDER_HEADER_KEYPrecision(){
				    return null;
				}
				public String CHAINED_FROM_ORDER_HEADER_KEYDefault(){
				
					return null;
				
				}
				public String CHAINED_FROM_ORDER_HEADER_KEYComment(){
				
				    return "";
				
				}
				public String CHAINED_FROM_ORDER_HEADER_KEYPattern(){
				
					return "";
				
				}
				public String CHAINED_FROM_ORDER_HEADER_KEYOriginalDbColumnName(){
				
					return "CHAINED_FROM_ORDER_HEADER_KEY";
				
				}

				
			    public String DERIVED_FROM_ORDER_LINE_KEY;

				public String getDERIVED_FROM_ORDER_LINE_KEY () {
					return this.DERIVED_FROM_ORDER_LINE_KEY;
				}

				public Boolean DERIVED_FROM_ORDER_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean DERIVED_FROM_ORDER_LINE_KEYIsKey(){
				    return false;
				}
				public Integer DERIVED_FROM_ORDER_LINE_KEYLength(){
				    return null;
				}
				public Integer DERIVED_FROM_ORDER_LINE_KEYPrecision(){
				    return null;
				}
				public String DERIVED_FROM_ORDER_LINE_KEYDefault(){
				
					return null;
				
				}
				public String DERIVED_FROM_ORDER_LINE_KEYComment(){
				
				    return "";
				
				}
				public String DERIVED_FROM_ORDER_LINE_KEYPattern(){
				
					return "";
				
				}
				public String DERIVED_FROM_ORDER_LINE_KEYOriginalDbColumnName(){
				
					return "DERIVED_FROM_ORDER_LINE_KEY";
				
				}

				
			    public String DERIVED_FROM_ORDER_HEADER_KEY;

				public String getDERIVED_FROM_ORDER_HEADER_KEY () {
					return this.DERIVED_FROM_ORDER_HEADER_KEY;
				}

				public Boolean DERIVED_FROM_ORDER_HEADER_KEYIsNullable(){
				    return true;
				}
				public Boolean DERIVED_FROM_ORDER_HEADER_KEYIsKey(){
				    return false;
				}
				public Integer DERIVED_FROM_ORDER_HEADER_KEYLength(){
				    return null;
				}
				public Integer DERIVED_FROM_ORDER_HEADER_KEYPrecision(){
				    return null;
				}
				public String DERIVED_FROM_ORDER_HEADER_KEYDefault(){
				
					return null;
				
				}
				public String DERIVED_FROM_ORDER_HEADER_KEYComment(){
				
				    return "";
				
				}
				public String DERIVED_FROM_ORDER_HEADER_KEYPattern(){
				
					return "";
				
				}
				public String DERIVED_FROM_ORDER_HEADER_KEYOriginalDbColumnName(){
				
					return "DERIVED_FROM_ORDER_HEADER_KEY";
				
				}

				
			    public String DERIVED_FROM_ORDER_RELEASE_KEY;

				public String getDERIVED_FROM_ORDER_RELEASE_KEY () {
					return this.DERIVED_FROM_ORDER_RELEASE_KEY;
				}

				public Boolean DERIVED_FROM_ORDER_RELEASE_KEYIsNullable(){
				    return true;
				}
				public Boolean DERIVED_FROM_ORDER_RELEASE_KEYIsKey(){
				    return false;
				}
				public Integer DERIVED_FROM_ORDER_RELEASE_KEYLength(){
				    return null;
				}
				public Integer DERIVED_FROM_ORDER_RELEASE_KEYPrecision(){
				    return null;
				}
				public String DERIVED_FROM_ORDER_RELEASE_KEYDefault(){
				
					return null;
				
				}
				public String DERIVED_FROM_ORDER_RELEASE_KEYComment(){
				
				    return "";
				
				}
				public String DERIVED_FROM_ORDER_RELEASE_KEYPattern(){
				
					return "";
				
				}
				public String DERIVED_FROM_ORDER_RELEASE_KEYOriginalDbColumnName(){
				
					return "DERIVED_FROM_ORDER_RELEASE_KEY";
				
				}

				
			    public String DISTRIBUTION_RULE_ID;

				public String getDISTRIBUTION_RULE_ID () {
					return this.DISTRIBUTION_RULE_ID;
				}

				public Boolean DISTRIBUTION_RULE_IDIsNullable(){
				    return true;
				}
				public Boolean DISTRIBUTION_RULE_IDIsKey(){
				    return false;
				}
				public Integer DISTRIBUTION_RULE_IDLength(){
				    return null;
				}
				public Integer DISTRIBUTION_RULE_IDPrecision(){
				    return null;
				}
				public String DISTRIBUTION_RULE_IDDefault(){
				
					return null;
				
				}
				public String DISTRIBUTION_RULE_IDComment(){
				
				    return "";
				
				}
				public String DISTRIBUTION_RULE_IDPattern(){
				
					return "";
				
				}
				public String DISTRIBUTION_RULE_IDOriginalDbColumnName(){
				
					return "DISTRIBUTION_RULE_ID";
				
				}

				
			    public BigDecimal INVOICED_QUANTITY;

				public BigDecimal getINVOICED_QUANTITY () {
					return this.INVOICED_QUANTITY;
				}

				public Boolean INVOICED_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean INVOICED_QUANTITYIsKey(){
				    return false;
				}
				public Integer INVOICED_QUANTITYLength(){
				    return null;
				}
				public Integer INVOICED_QUANTITYPrecision(){
				    return null;
				}
				public String INVOICED_QUANTITYDefault(){
				
					return "";
				
				}
				public String INVOICED_QUANTITYComment(){
				
				    return "";
				
				}
				public String INVOICED_QUANTITYPattern(){
				
					return "";
				
				}
				public String INVOICED_QUANTITYOriginalDbColumnName(){
				
					return "INVOICED_QUANTITY";
				
				}

				
			    public BigDecimal OVER_RECEIPT_QUANTITY;

				public BigDecimal getOVER_RECEIPT_QUANTITY () {
					return this.OVER_RECEIPT_QUANTITY;
				}

				public Boolean OVER_RECEIPT_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean OVER_RECEIPT_QUANTITYIsKey(){
				    return false;
				}
				public Integer OVER_RECEIPT_QUANTITYLength(){
				    return null;
				}
				public Integer OVER_RECEIPT_QUANTITYPrecision(){
				    return null;
				}
				public String OVER_RECEIPT_QUANTITYDefault(){
				
					return "";
				
				}
				public String OVER_RECEIPT_QUANTITYComment(){
				
				    return "";
				
				}
				public String OVER_RECEIPT_QUANTITYPattern(){
				
					return "";
				
				}
				public String OVER_RECEIPT_QUANTITYOriginalDbColumnName(){
				
					return "OVER_RECEIPT_QUANTITY";
				
				}

				
			    public String RETURN_REASON;

				public String getRETURN_REASON () {
					return this.RETURN_REASON;
				}

				public Boolean RETURN_REASONIsNullable(){
				    return false;
				}
				public Boolean RETURN_REASONIsKey(){
				    return false;
				}
				public Integer RETURN_REASONLength(){
				    return null;
				}
				public Integer RETURN_REASONPrecision(){
				    return null;
				}
				public String RETURN_REASONDefault(){
				
					return null;
				
				}
				public String RETURN_REASONComment(){
				
				    return "";
				
				}
				public String RETURN_REASONPattern(){
				
					return "";
				
				}
				public String RETURN_REASONOriginalDbColumnName(){
				
					return "RETURN_REASON";
				
				}

				
			    public String SHIPNODE_KEY;

				public String getSHIPNODE_KEY () {
					return this.SHIPNODE_KEY;
				}

				public Boolean SHIPNODE_KEYIsNullable(){
				    return true;
				}
				public Boolean SHIPNODE_KEYIsKey(){
				    return false;
				}
				public Integer SHIPNODE_KEYLength(){
				    return null;
				}
				public Integer SHIPNODE_KEYPrecision(){
				    return null;
				}
				public String SHIPNODE_KEYDefault(){
				
					return null;
				
				}
				public String SHIPNODE_KEYComment(){
				
				    return "";
				
				}
				public String SHIPNODE_KEYPattern(){
				
					return "";
				
				}
				public String SHIPNODE_KEYOriginalDbColumnName(){
				
					return "SHIPNODE_KEY";
				
				}

				
			    public String PROCURE_FROM_NODE;

				public String getPROCURE_FROM_NODE () {
					return this.PROCURE_FROM_NODE;
				}

				public Boolean PROCURE_FROM_NODEIsNullable(){
				    return true;
				}
				public Boolean PROCURE_FROM_NODEIsKey(){
				    return false;
				}
				public Integer PROCURE_FROM_NODELength(){
				    return null;
				}
				public Integer PROCURE_FROM_NODEPrecision(){
				    return null;
				}
				public String PROCURE_FROM_NODEDefault(){
				
					return null;
				
				}
				public String PROCURE_FROM_NODEComment(){
				
				    return "";
				
				}
				public String PROCURE_FROM_NODEPattern(){
				
					return "";
				
				}
				public String PROCURE_FROM_NODEOriginalDbColumnName(){
				
					return "PROCURE_FROM_NODE";
				
				}

				
			    public String SHIP_TO_KEY;

				public String getSHIP_TO_KEY () {
					return this.SHIP_TO_KEY;
				}

				public Boolean SHIP_TO_KEYIsNullable(){
				    return true;
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
				
					return null;
				
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
				
					return null;
				
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

				
			    public String CARRIER_ACCOUNT_NO;

				public String getCARRIER_ACCOUNT_NO () {
					return this.CARRIER_ACCOUNT_NO;
				}

				public Boolean CARRIER_ACCOUNT_NOIsNullable(){
				    return false;
				}
				public Boolean CARRIER_ACCOUNT_NOIsKey(){
				    return false;
				}
				public Integer CARRIER_ACCOUNT_NOLength(){
				    return null;
				}
				public Integer CARRIER_ACCOUNT_NOPrecision(){
				    return null;
				}
				public String CARRIER_ACCOUNT_NODefault(){
				
					return null;
				
				}
				public String CARRIER_ACCOUNT_NOComment(){
				
				    return "";
				
				}
				public String CARRIER_ACCOUNT_NOPattern(){
				
					return "";
				
				}
				public String CARRIER_ACCOUNT_NOOriginalDbColumnName(){
				
					return "CARRIER_ACCOUNT_NO";
				
				}

				
			    public String PICKABLE_FLAG;

				public String getPICKABLE_FLAG () {
					return this.PICKABLE_FLAG;
				}

				public Boolean PICKABLE_FLAGIsNullable(){
				    return false;
				}
				public Boolean PICKABLE_FLAGIsKey(){
				    return false;
				}
				public Integer PICKABLE_FLAGLength(){
				    return null;
				}
				public Integer PICKABLE_FLAGPrecision(){
				    return null;
				}
				public String PICKABLE_FLAGDefault(){
				
					return null;
				
				}
				public String PICKABLE_FLAGComment(){
				
				    return "";
				
				}
				public String PICKABLE_FLAGPattern(){
				
					return "";
				
				}
				public String PICKABLE_FLAGOriginalDbColumnName(){
				
					return "PICKABLE_FLAG";
				
				}

				
			    public String SHIP_TOGETHER_NO;

				public String getSHIP_TOGETHER_NO () {
					return this.SHIP_TOGETHER_NO;
				}

				public Boolean SHIP_TOGETHER_NOIsNullable(){
				    return false;
				}
				public Boolean SHIP_TOGETHER_NOIsKey(){
				    return false;
				}
				public Integer SHIP_TOGETHER_NOLength(){
				    return null;
				}
				public Integer SHIP_TOGETHER_NOPrecision(){
				    return null;
				}
				public String SHIP_TOGETHER_NODefault(){
				
					return null;
				
				}
				public String SHIP_TOGETHER_NOComment(){
				
				    return "";
				
				}
				public String SHIP_TOGETHER_NOPattern(){
				
					return "";
				
				}
				public String SHIP_TOGETHER_NOOriginalDbColumnName(){
				
					return "SHIP_TOGETHER_NO";
				
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
				
					return null;
				
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

				
			    public String KIT_CODE;

				public String getKIT_CODE () {
					return this.KIT_CODE;
				}

				public Boolean KIT_CODEIsNullable(){
				    return false;
				}
				public Boolean KIT_CODEIsKey(){
				    return false;
				}
				public Integer KIT_CODELength(){
				    return null;
				}
				public Integer KIT_CODEPrecision(){
				    return null;
				}
				public String KIT_CODEDefault(){
				
					return null;
				
				}
				public String KIT_CODEComment(){
				
				    return "";
				
				}
				public String KIT_CODEPattern(){
				
					return "";
				
				}
				public String KIT_CODEOriginalDbColumnName(){
				
					return "KIT_CODE";
				
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
				
					return null;
				
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

				
			    public BigDecimal LINE_TOTAL;

				public BigDecimal getLINE_TOTAL () {
					return this.LINE_TOTAL;
				}

				public Boolean LINE_TOTALIsNullable(){
				    return false;
				}
				public Boolean LINE_TOTALIsKey(){
				    return false;
				}
				public Integer LINE_TOTALLength(){
				    return null;
				}
				public Integer LINE_TOTALPrecision(){
				    return null;
				}
				public String LINE_TOTALDefault(){
				
					return "";
				
				}
				public String LINE_TOTALComment(){
				
				    return "";
				
				}
				public String LINE_TOTALPattern(){
				
					return "";
				
				}
				public String LINE_TOTALOriginalDbColumnName(){
				
					return "LINE_TOTAL";
				
				}

				
			    public BigDecimal INVOICED_LINE_TOTAL;

				public BigDecimal getINVOICED_LINE_TOTAL () {
					return this.INVOICED_LINE_TOTAL;
				}

				public Boolean INVOICED_LINE_TOTALIsNullable(){
				    return false;
				}
				public Boolean INVOICED_LINE_TOTALIsKey(){
				    return false;
				}
				public Integer INVOICED_LINE_TOTALLength(){
				    return null;
				}
				public Integer INVOICED_LINE_TOTALPrecision(){
				    return null;
				}
				public String INVOICED_LINE_TOTALDefault(){
				
					return "";
				
				}
				public String INVOICED_LINE_TOTALComment(){
				
				    return "";
				
				}
				public String INVOICED_LINE_TOTALPattern(){
				
					return "";
				
				}
				public String INVOICED_LINE_TOTALOriginalDbColumnName(){
				
					return "INVOICED_LINE_TOTAL";
				
				}

				
			    public BigDecimal INVOICED_EXTENDED_PRICE;

				public BigDecimal getINVOICED_EXTENDED_PRICE () {
					return this.INVOICED_EXTENDED_PRICE;
				}

				public Boolean INVOICED_EXTENDED_PRICEIsNullable(){
				    return false;
				}
				public Boolean INVOICED_EXTENDED_PRICEIsKey(){
				    return false;
				}
				public Integer INVOICED_EXTENDED_PRICELength(){
				    return null;
				}
				public Integer INVOICED_EXTENDED_PRICEPrecision(){
				    return null;
				}
				public String INVOICED_EXTENDED_PRICEDefault(){
				
					return "";
				
				}
				public String INVOICED_EXTENDED_PRICEComment(){
				
				    return "";
				
				}
				public String INVOICED_EXTENDED_PRICEPattern(){
				
					return "";
				
				}
				public String INVOICED_EXTENDED_PRICEOriginalDbColumnName(){
				
					return "INVOICED_EXTENDED_PRICE";
				
				}

				
			    public BigDecimal SETTLED_QUANTITY;

				public BigDecimal getSETTLED_QUANTITY () {
					return this.SETTLED_QUANTITY;
				}

				public Boolean SETTLED_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean SETTLED_QUANTITYIsKey(){
				    return false;
				}
				public Integer SETTLED_QUANTITYLength(){
				    return null;
				}
				public Integer SETTLED_QUANTITYPrecision(){
				    return null;
				}
				public String SETTLED_QUANTITYDefault(){
				
					return "";
				
				}
				public String SETTLED_QUANTITYComment(){
				
				    return "";
				
				}
				public String SETTLED_QUANTITYPattern(){
				
					return "";
				
				}
				public String SETTLED_QUANTITYOriginalDbColumnName(){
				
					return "SETTLED_QUANTITY";
				
				}

				
			    public BigDecimal SETTLED_AMOUNT;

				public BigDecimal getSETTLED_AMOUNT () {
					return this.SETTLED_AMOUNT;
				}

				public Boolean SETTLED_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean SETTLED_AMOUNTIsKey(){
				    return false;
				}
				public Integer SETTLED_AMOUNTLength(){
				    return null;
				}
				public Integer SETTLED_AMOUNTPrecision(){
				    return null;
				}
				public String SETTLED_AMOUNTDefault(){
				
					return "";
				
				}
				public String SETTLED_AMOUNTComment(){
				
				    return "";
				
				}
				public String SETTLED_AMOUNTPattern(){
				
					return "";
				
				}
				public String SETTLED_AMOUNTOriginalDbColumnName(){
				
					return "SETTLED_AMOUNT";
				
				}

				
			    public String TAXABLE_FLAG;

				public String getTAXABLE_FLAG () {
					return this.TAXABLE_FLAG;
				}

				public Boolean TAXABLE_FLAGIsNullable(){
				    return false;
				}
				public Boolean TAXABLE_FLAGIsKey(){
				    return false;
				}
				public Integer TAXABLE_FLAGLength(){
				    return null;
				}
				public Integer TAXABLE_FLAGPrecision(){
				    return null;
				}
				public String TAXABLE_FLAGDefault(){
				
					return null;
				
				}
				public String TAXABLE_FLAGComment(){
				
				    return "";
				
				}
				public String TAXABLE_FLAGPattern(){
				
					return "";
				
				}
				public String TAXABLE_FLAGOriginalDbColumnName(){
				
					return "TAXABLE_FLAG";
				
				}

				
			    public String TAX_EXEMPTION_CERTIFICATE;

				public String getTAX_EXEMPTION_CERTIFICATE () {
					return this.TAX_EXEMPTION_CERTIFICATE;
				}

				public Boolean TAX_EXEMPTION_CERTIFICATEIsNullable(){
				    return true;
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
				
					return null;
				
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

				
			    public String DISCOUNT_TYPE;

				public String getDISCOUNT_TYPE () {
					return this.DISCOUNT_TYPE;
				}

				public Boolean DISCOUNT_TYPEIsNullable(){
				    return false;
				}
				public Boolean DISCOUNT_TYPEIsKey(){
				    return false;
				}
				public Integer DISCOUNT_TYPELength(){
				    return null;
				}
				public Integer DISCOUNT_TYPEPrecision(){
				    return null;
				}
				public String DISCOUNT_TYPEDefault(){
				
					return null;
				
				}
				public String DISCOUNT_TYPEComment(){
				
				    return "";
				
				}
				public String DISCOUNT_TYPEPattern(){
				
					return "";
				
				}
				public String DISCOUNT_TYPEOriginalDbColumnName(){
				
					return "DISCOUNT_TYPE";
				
				}

				
			    public String DISCOUNT_REFERENCE;

				public String getDISCOUNT_REFERENCE () {
					return this.DISCOUNT_REFERENCE;
				}

				public Boolean DISCOUNT_REFERENCEIsNullable(){
				    return false;
				}
				public Boolean DISCOUNT_REFERENCEIsKey(){
				    return false;
				}
				public Integer DISCOUNT_REFERENCELength(){
				    return null;
				}
				public Integer DISCOUNT_REFERENCEPrecision(){
				    return null;
				}
				public String DISCOUNT_REFERENCEDefault(){
				
					return null;
				
				}
				public String DISCOUNT_REFERENCEComment(){
				
				    return "";
				
				}
				public String DISCOUNT_REFERENCEPattern(){
				
					return "";
				
				}
				public String DISCOUNT_REFERENCEOriginalDbColumnName(){
				
					return "DISCOUNT_REFERENCE";
				
				}

				
			    public String GIFT_FLAG;

				public String getGIFT_FLAG () {
					return this.GIFT_FLAG;
				}

				public Boolean GIFT_FLAGIsNullable(){
				    return false;
				}
				public Boolean GIFT_FLAGIsKey(){
				    return false;
				}
				public Integer GIFT_FLAGLength(){
				    return null;
				}
				public Integer GIFT_FLAGPrecision(){
				    return null;
				}
				public String GIFT_FLAGDefault(){
				
					return null;
				
				}
				public String GIFT_FLAGComment(){
				
				    return "";
				
				}
				public String GIFT_FLAGPattern(){
				
					return "";
				
				}
				public String GIFT_FLAGOriginalDbColumnName(){
				
					return "GIFT_FLAG";
				
				}

				
			    public String PERSONALIZE_FLAG;

				public String getPERSONALIZE_FLAG () {
					return this.PERSONALIZE_FLAG;
				}

				public Boolean PERSONALIZE_FLAGIsNullable(){
				    return false;
				}
				public Boolean PERSONALIZE_FLAGIsKey(){
				    return false;
				}
				public Integer PERSONALIZE_FLAGLength(){
				    return null;
				}
				public Integer PERSONALIZE_FLAGPrecision(){
				    return null;
				}
				public String PERSONALIZE_FLAGDefault(){
				
					return null;
				
				}
				public String PERSONALIZE_FLAGComment(){
				
				    return "";
				
				}
				public String PERSONALIZE_FLAGPattern(){
				
					return "";
				
				}
				public String PERSONALIZE_FLAGOriginalDbColumnName(){
				
					return "PERSONALIZE_FLAG";
				
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
				
					return null;
				
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

				
			    public String DEPARTMENT_CODE;

				public String getDEPARTMENT_CODE () {
					return this.DEPARTMENT_CODE;
				}

				public Boolean DEPARTMENT_CODEIsNullable(){
				    return false;
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
				
					return null;
				
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

				
			    public String CUSTOMER_ITEM;

				public String getCUSTOMER_ITEM () {
					return this.CUSTOMER_ITEM;
				}

				public Boolean CUSTOMER_ITEMIsNullable(){
				    return false;
				}
				public Boolean CUSTOMER_ITEMIsKey(){
				    return false;
				}
				public Integer CUSTOMER_ITEMLength(){
				    return null;
				}
				public Integer CUSTOMER_ITEMPrecision(){
				    return null;
				}
				public String CUSTOMER_ITEMDefault(){
				
					return "";
				
				}
				public String CUSTOMER_ITEMComment(){
				
				    return "";
				
				}
				public String CUSTOMER_ITEMPattern(){
				
					return "";
				
				}
				public String CUSTOMER_ITEMOriginalDbColumnName(){
				
					return "CUSTOMER_ITEM";
				
				}

				
			    public String CUSTOMER_ITEM_DESCRIPTION;

				public String getCUSTOMER_ITEM_DESCRIPTION () {
					return this.CUSTOMER_ITEM_DESCRIPTION;
				}

				public Boolean CUSTOMER_ITEM_DESCRIPTIONIsNullable(){
				    return false;
				}
				public Boolean CUSTOMER_ITEM_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer CUSTOMER_ITEM_DESCRIPTIONLength(){
				    return null;
				}
				public Integer CUSTOMER_ITEM_DESCRIPTIONPrecision(){
				    return null;
				}
				public String CUSTOMER_ITEM_DESCRIPTIONDefault(){
				
					return "";
				
				}
				public String CUSTOMER_ITEM_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String CUSTOMER_ITEM_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String CUSTOMER_ITEM_DESCRIPTIONOriginalDbColumnName(){
				
					return "CUSTOMER_ITEM_DESCRIPTION";
				
				}

				
			    public BigDecimal ITEM_WEIGHT;

				public BigDecimal getITEM_WEIGHT () {
					return this.ITEM_WEIGHT;
				}

				public Boolean ITEM_WEIGHTIsNullable(){
				    return false;
				}
				public Boolean ITEM_WEIGHTIsKey(){
				    return false;
				}
				public Integer ITEM_WEIGHTLength(){
				    return null;
				}
				public Integer ITEM_WEIGHTPrecision(){
				    return null;
				}
				public String ITEM_WEIGHTDefault(){
				
					return "";
				
				}
				public String ITEM_WEIGHTComment(){
				
				    return "";
				
				}
				public String ITEM_WEIGHTPattern(){
				
					return "";
				
				}
				public String ITEM_WEIGHTOriginalDbColumnName(){
				
					return "ITEM_WEIGHT";
				
				}

				
			    public String ITEM_WEIGHT_UOM;

				public String getITEM_WEIGHT_UOM () {
					return this.ITEM_WEIGHT_UOM;
				}

				public Boolean ITEM_WEIGHT_UOMIsNullable(){
				    return false;
				}
				public Boolean ITEM_WEIGHT_UOMIsKey(){
				    return false;
				}
				public Integer ITEM_WEIGHT_UOMLength(){
				    return null;
				}
				public Integer ITEM_WEIGHT_UOMPrecision(){
				    return null;
				}
				public String ITEM_WEIGHT_UOMDefault(){
				
					return "";
				
				}
				public String ITEM_WEIGHT_UOMComment(){
				
				    return "";
				
				}
				public String ITEM_WEIGHT_UOMPattern(){
				
					return "";
				
				}
				public String ITEM_WEIGHT_UOMOriginalDbColumnName(){
				
					return "ITEM_WEIGHT_UOM";
				
				}

				
			    public String ITEM_DESCRIPTION;

				public String getITEM_DESCRIPTION () {
					return this.ITEM_DESCRIPTION;
				}

				public Boolean ITEM_DESCRIPTIONIsNullable(){
				    return false;
				}
				public Boolean ITEM_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer ITEM_DESCRIPTIONLength(){
				    return null;
				}
				public Integer ITEM_DESCRIPTIONPrecision(){
				    return null;
				}
				public String ITEM_DESCRIPTIONDefault(){
				
					return "";
				
				}
				public String ITEM_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String ITEM_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String ITEM_DESCRIPTIONOriginalDbColumnName(){
				
					return "ITEM_DESCRIPTION";
				
				}

				
			    public String ITEM_SHORT_DESCRIPTION;

				public String getITEM_SHORT_DESCRIPTION () {
					return this.ITEM_SHORT_DESCRIPTION;
				}

				public Boolean ITEM_SHORT_DESCRIPTIONIsNullable(){
				    return false;
				}
				public Boolean ITEM_SHORT_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer ITEM_SHORT_DESCRIPTIONLength(){
				    return null;
				}
				public Integer ITEM_SHORT_DESCRIPTIONPrecision(){
				    return null;
				}
				public String ITEM_SHORT_DESCRIPTIONDefault(){
				
					return "";
				
				}
				public String ITEM_SHORT_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String ITEM_SHORT_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String ITEM_SHORT_DESCRIPTIONOriginalDbColumnName(){
				
					return "ITEM_SHORT_DESCRIPTION";
				
				}

				
			    public String RESERVATION_ID;

				public String getRESERVATION_ID () {
					return this.RESERVATION_ID;
				}

				public Boolean RESERVATION_IDIsNullable(){
				    return false;
				}
				public Boolean RESERVATION_IDIsKey(){
				    return false;
				}
				public Integer RESERVATION_IDLength(){
				    return null;
				}
				public Integer RESERVATION_IDPrecision(){
				    return null;
				}
				public String RESERVATION_IDDefault(){
				
					return "";
				
				}
				public String RESERVATION_IDComment(){
				
				    return "";
				
				}
				public String RESERVATION_IDPattern(){
				
					return "";
				
				}
				public String RESERVATION_IDOriginalDbColumnName(){
				
					return "RESERVATION_ID";
				
				}

				
			    public String RESERVATION_POOL;

				public String getRESERVATION_POOL () {
					return this.RESERVATION_POOL;
				}

				public Boolean RESERVATION_POOLIsNullable(){
				    return false;
				}
				public Boolean RESERVATION_POOLIsKey(){
				    return false;
				}
				public Integer RESERVATION_POOLLength(){
				    return null;
				}
				public Integer RESERVATION_POOLPrecision(){
				    return null;
				}
				public String RESERVATION_POOLDefault(){
				
					return "";
				
				}
				public String RESERVATION_POOLComment(){
				
				    return "";
				
				}
				public String RESERVATION_POOLPattern(){
				
					return "";
				
				}
				public String RESERVATION_POOLOriginalDbColumnName(){
				
					return "RESERVATION_POOL";
				
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

				
			    public String CUSTOMER_PO_LINE_NO;

				public String getCUSTOMER_PO_LINE_NO () {
					return this.CUSTOMER_PO_LINE_NO;
				}

				public Boolean CUSTOMER_PO_LINE_NOIsNullable(){
				    return false;
				}
				public Boolean CUSTOMER_PO_LINE_NOIsKey(){
				    return false;
				}
				public Integer CUSTOMER_PO_LINE_NOLength(){
				    return null;
				}
				public Integer CUSTOMER_PO_LINE_NOPrecision(){
				    return null;
				}
				public String CUSTOMER_PO_LINE_NODefault(){
				
					return "";
				
				}
				public String CUSTOMER_PO_LINE_NOComment(){
				
				    return "";
				
				}
				public String CUSTOMER_PO_LINE_NOPattern(){
				
					return "";
				
				}
				public String CUSTOMER_PO_LINE_NOOriginalDbColumnName(){
				
					return "CUSTOMER_PO_LINE_NO";
				
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

				
			    public BigDecimal ORIGINAL_ORDERED_QTY;

				public BigDecimal getORIGINAL_ORDERED_QTY () {
					return this.ORIGINAL_ORDERED_QTY;
				}

				public Boolean ORIGINAL_ORDERED_QTYIsNullable(){
				    return false;
				}
				public Boolean ORIGINAL_ORDERED_QTYIsKey(){
				    return false;
				}
				public Integer ORIGINAL_ORDERED_QTYLength(){
				    return null;
				}
				public Integer ORIGINAL_ORDERED_QTYPrecision(){
				    return null;
				}
				public String ORIGINAL_ORDERED_QTYDefault(){
				
					return "";
				
				}
				public String ORIGINAL_ORDERED_QTYComment(){
				
				    return "";
				
				}
				public String ORIGINAL_ORDERED_QTYPattern(){
				
					return "";
				
				}
				public String ORIGINAL_ORDERED_QTYOriginalDbColumnName(){
				
					return "ORIGINAL_ORDERED_QTY";
				
				}

				
			    public BigDecimal LIST_PRICE;

				public BigDecimal getLIST_PRICE () {
					return this.LIST_PRICE;
				}

				public Boolean LIST_PRICEIsNullable(){
				    return false;
				}
				public Boolean LIST_PRICEIsKey(){
				    return false;
				}
				public Integer LIST_PRICELength(){
				    return null;
				}
				public Integer LIST_PRICEPrecision(){
				    return null;
				}
				public String LIST_PRICEDefault(){
				
					return "";
				
				}
				public String LIST_PRICEComment(){
				
				    return "";
				
				}
				public String LIST_PRICEPattern(){
				
					return "";
				
				}
				public String LIST_PRICEOriginalDbColumnName(){
				
					return "LIST_PRICE";
				
				}

				
			    public BigDecimal RETAIL_PRICE;

				public BigDecimal getRETAIL_PRICE () {
					return this.RETAIL_PRICE;
				}

				public Boolean RETAIL_PRICEIsNullable(){
				    return false;
				}
				public Boolean RETAIL_PRICEIsKey(){
				    return false;
				}
				public Integer RETAIL_PRICELength(){
				    return null;
				}
				public Integer RETAIL_PRICEPrecision(){
				    return null;
				}
				public String RETAIL_PRICEDefault(){
				
					return "";
				
				}
				public String RETAIL_PRICEComment(){
				
				    return "";
				
				}
				public String RETAIL_PRICEPattern(){
				
					return "";
				
				}
				public String RETAIL_PRICEOriginalDbColumnName(){
				
					return "RETAIL_PRICE";
				
				}

				
			    public BigDecimal DISCOUNT_PERCENTAGE;

				public BigDecimal getDISCOUNT_PERCENTAGE () {
					return this.DISCOUNT_PERCENTAGE;
				}

				public Boolean DISCOUNT_PERCENTAGEIsNullable(){
				    return false;
				}
				public Boolean DISCOUNT_PERCENTAGEIsKey(){
				    return false;
				}
				public Integer DISCOUNT_PERCENTAGELength(){
				    return null;
				}
				public Integer DISCOUNT_PERCENTAGEPrecision(){
				    return null;
				}
				public String DISCOUNT_PERCENTAGEDefault(){
				
					return "";
				
				}
				public String DISCOUNT_PERCENTAGEComment(){
				
				    return "";
				
				}
				public String DISCOUNT_PERCENTAGEPattern(){
				
					return "";
				
				}
				public String DISCOUNT_PERCENTAGEOriginalDbColumnName(){
				
					return "DISCOUNT_PERCENTAGE";
				
				}

				
			    public String PACKLIST_TYPE;

				public String getPACKLIST_TYPE () {
					return this.PACKLIST_TYPE;
				}

				public Boolean PACKLIST_TYPEIsNullable(){
				    return false;
				}
				public Boolean PACKLIST_TYPEIsKey(){
				    return false;
				}
				public Integer PACKLIST_TYPELength(){
				    return null;
				}
				public Integer PACKLIST_TYPEPrecision(){
				    return null;
				}
				public String PACKLIST_TYPEDefault(){
				
					return "";
				
				}
				public String PACKLIST_TYPEComment(){
				
				    return "";
				
				}
				public String PACKLIST_TYPEPattern(){
				
					return "";
				
				}
				public String PACKLIST_TYPEOriginalDbColumnName(){
				
					return "PACKLIST_TYPE";
				
				}

				
			    public String SUPPLIER_ITEM;

				public String getSUPPLIER_ITEM () {
					return this.SUPPLIER_ITEM;
				}

				public Boolean SUPPLIER_ITEMIsNullable(){
				    return false;
				}
				public Boolean SUPPLIER_ITEMIsKey(){
				    return false;
				}
				public Integer SUPPLIER_ITEMLength(){
				    return null;
				}
				public Integer SUPPLIER_ITEMPrecision(){
				    return null;
				}
				public String SUPPLIER_ITEMDefault(){
				
					return null;
				
				}
				public String SUPPLIER_ITEMComment(){
				
				    return "";
				
				}
				public String SUPPLIER_ITEMPattern(){
				
					return "";
				
				}
				public String SUPPLIER_ITEMOriginalDbColumnName(){
				
					return "SUPPLIER_ITEM";
				
				}

				
			    public String SUPPLIER_ITEM_DESCRIPTION;

				public String getSUPPLIER_ITEM_DESCRIPTION () {
					return this.SUPPLIER_ITEM_DESCRIPTION;
				}

				public Boolean SUPPLIER_ITEM_DESCRIPTIONIsNullable(){
				    return false;
				}
				public Boolean SUPPLIER_ITEM_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer SUPPLIER_ITEM_DESCRIPTIONLength(){
				    return null;
				}
				public Integer SUPPLIER_ITEM_DESCRIPTIONPrecision(){
				    return null;
				}
				public String SUPPLIER_ITEM_DESCRIPTIONDefault(){
				
					return null;
				
				}
				public String SUPPLIER_ITEM_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String SUPPLIER_ITEM_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String SUPPLIER_ITEM_DESCRIPTIONOriginalDbColumnName(){
				
					return "SUPPLIER_ITEM_DESCRIPTION";
				
				}

				
			    public BigDecimal UNIT_COST;

				public BigDecimal getUNIT_COST () {
					return this.UNIT_COST;
				}

				public Boolean UNIT_COSTIsNullable(){
				    return false;
				}
				public Boolean UNIT_COSTIsKey(){
				    return false;
				}
				public Integer UNIT_COSTLength(){
				    return null;
				}
				public Integer UNIT_COSTPrecision(){
				    return null;
				}
				public String UNIT_COSTDefault(){
				
					return "";
				
				}
				public String UNIT_COSTComment(){
				
				    return "";
				
				}
				public String UNIT_COSTPattern(){
				
					return "";
				
				}
				public String UNIT_COSTOriginalDbColumnName(){
				
					return "UNIT_COST";
				
				}

				
			    public String UPC_CODE;

				public String getUPC_CODE () {
					return this.UPC_CODE;
				}

				public Boolean UPC_CODEIsNullable(){
				    return false;
				}
				public Boolean UPC_CODEIsKey(){
				    return false;
				}
				public Integer UPC_CODELength(){
				    return null;
				}
				public Integer UPC_CODEPrecision(){
				    return null;
				}
				public String UPC_CODEDefault(){
				
					return null;
				
				}
				public String UPC_CODEComment(){
				
				    return "";
				
				}
				public String UPC_CODEPattern(){
				
					return "";
				
				}
				public String UPC_CODEOriginalDbColumnName(){
				
					return "UPC_CODE";
				
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
				
					return null;
				
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

				
			    public String MANUFACTURER_NAME;

				public String getMANUFACTURER_NAME () {
					return this.MANUFACTURER_NAME;
				}

				public Boolean MANUFACTURER_NAMEIsNullable(){
				    return false;
				}
				public Boolean MANUFACTURER_NAMEIsKey(){
				    return false;
				}
				public Integer MANUFACTURER_NAMELength(){
				    return null;
				}
				public Integer MANUFACTURER_NAMEPrecision(){
				    return null;
				}
				public String MANUFACTURER_NAMEDefault(){
				
					return null;
				
				}
				public String MANUFACTURER_NAMEComment(){
				
				    return "";
				
				}
				public String MANUFACTURER_NAMEPattern(){
				
					return "";
				
				}
				public String MANUFACTURER_NAMEOriginalDbColumnName(){
				
					return "MANUFACTURER_NAME";
				
				}

				
			    public String MANUFACTURER_ITEM;

				public String getMANUFACTURER_ITEM () {
					return this.MANUFACTURER_ITEM;
				}

				public Boolean MANUFACTURER_ITEMIsNullable(){
				    return false;
				}
				public Boolean MANUFACTURER_ITEMIsKey(){
				    return false;
				}
				public Integer MANUFACTURER_ITEMLength(){
				    return null;
				}
				public Integer MANUFACTURER_ITEMPrecision(){
				    return null;
				}
				public String MANUFACTURER_ITEMDefault(){
				
					return null;
				
				}
				public String MANUFACTURER_ITEMComment(){
				
				    return "";
				
				}
				public String MANUFACTURER_ITEMPattern(){
				
					return "";
				
				}
				public String MANUFACTURER_ITEMOriginalDbColumnName(){
				
					return "MANUFACTURER_ITEM";
				
				}

				
			    public String MANUFACTURER_ITEM_DESC;

				public String getMANUFACTURER_ITEM_DESC () {
					return this.MANUFACTURER_ITEM_DESC;
				}

				public Boolean MANUFACTURER_ITEM_DESCIsNullable(){
				    return false;
				}
				public Boolean MANUFACTURER_ITEM_DESCIsKey(){
				    return false;
				}
				public Integer MANUFACTURER_ITEM_DESCLength(){
				    return null;
				}
				public Integer MANUFACTURER_ITEM_DESCPrecision(){
				    return null;
				}
				public String MANUFACTURER_ITEM_DESCDefault(){
				
					return null;
				
				}
				public String MANUFACTURER_ITEM_DESCComment(){
				
				    return "";
				
				}
				public String MANUFACTURER_ITEM_DESCPattern(){
				
					return "";
				
				}
				public String MANUFACTURER_ITEM_DESCOriginalDbColumnName(){
				
					return "MANUFACTURER_ITEM_DESC";
				
				}

				
			    public String COUNTRY_OF_ORIGIN;

				public String getCOUNTRY_OF_ORIGIN () {
					return this.COUNTRY_OF_ORIGIN;
				}

				public Boolean COUNTRY_OF_ORIGINIsNullable(){
				    return false;
				}
				public Boolean COUNTRY_OF_ORIGINIsKey(){
				    return false;
				}
				public Integer COUNTRY_OF_ORIGINLength(){
				    return null;
				}
				public Integer COUNTRY_OF_ORIGINPrecision(){
				    return null;
				}
				public String COUNTRY_OF_ORIGINDefault(){
				
					return null;
				
				}
				public String COUNTRY_OF_ORIGINComment(){
				
				    return "";
				
				}
				public String COUNTRY_OF_ORIGINPattern(){
				
					return "";
				
				}
				public String COUNTRY_OF_ORIGINOriginalDbColumnName(){
				
					return "COUNTRY_OF_ORIGIN";
				
				}

				
			    public String ISBN;

				public String getISBN () {
					return this.ISBN;
				}

				public Boolean ISBNIsNullable(){
				    return false;
				}
				public Boolean ISBNIsKey(){
				    return false;
				}
				public Integer ISBNLength(){
				    return null;
				}
				public Integer ISBNPrecision(){
				    return null;
				}
				public String ISBNDefault(){
				
					return null;
				
				}
				public String ISBNComment(){
				
				    return "";
				
				}
				public String ISBNPattern(){
				
					return "";
				
				}
				public String ISBNOriginalDbColumnName(){
				
					return "ISBN";
				
				}

				
			    public String HARMONIZED_CODE;

				public String getHARMONIZED_CODE () {
					return this.HARMONIZED_CODE;
				}

				public Boolean HARMONIZED_CODEIsNullable(){
				    return false;
				}
				public Boolean HARMONIZED_CODEIsKey(){
				    return false;
				}
				public Integer HARMONIZED_CODELength(){
				    return null;
				}
				public Integer HARMONIZED_CODEPrecision(){
				    return null;
				}
				public String HARMONIZED_CODEDefault(){
				
					return null;
				
				}
				public String HARMONIZED_CODEComment(){
				
				    return "";
				
				}
				public String HARMONIZED_CODEPattern(){
				
					return "";
				
				}
				public String HARMONIZED_CODEOriginalDbColumnName(){
				
					return "HARMONIZED_CODE";
				
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

				
			    public String PRODUCT_LINE;

				public String getPRODUCT_LINE () {
					return this.PRODUCT_LINE;
				}

				public Boolean PRODUCT_LINEIsNullable(){
				    return false;
				}
				public Boolean PRODUCT_LINEIsKey(){
				    return false;
				}
				public Integer PRODUCT_LINELength(){
				    return null;
				}
				public Integer PRODUCT_LINEPrecision(){
				    return null;
				}
				public String PRODUCT_LINEDefault(){
				
					return null;
				
				}
				public String PRODUCT_LINEComment(){
				
				    return "";
				
				}
				public String PRODUCT_LINEPattern(){
				
					return "";
				
				}
				public String PRODUCT_LINEOriginalDbColumnName(){
				
					return "PRODUCT_LINE";
				
				}

				
			    public String NMFC_CODE;

				public String getNMFC_CODE () {
					return this.NMFC_CODE;
				}

				public Boolean NMFC_CODEIsNullable(){
				    return false;
				}
				public Boolean NMFC_CODEIsKey(){
				    return false;
				}
				public Integer NMFC_CODELength(){
				    return null;
				}
				public Integer NMFC_CODEPrecision(){
				    return null;
				}
				public String NMFC_CODEDefault(){
				
					return null;
				
				}
				public String NMFC_CODEComment(){
				
				    return "";
				
				}
				public String NMFC_CODEPattern(){
				
					return "";
				
				}
				public String NMFC_CODEOriginalDbColumnName(){
				
					return "NMFC_CODE";
				
				}

				
			    public String NMFC_CLASS;

				public String getNMFC_CLASS () {
					return this.NMFC_CLASS;
				}

				public Boolean NMFC_CLASSIsNullable(){
				    return false;
				}
				public Boolean NMFC_CLASSIsKey(){
				    return false;
				}
				public Integer NMFC_CLASSLength(){
				    return null;
				}
				public Integer NMFC_CLASSPrecision(){
				    return null;
				}
				public String NMFC_CLASSDefault(){
				
					return null;
				
				}
				public String NMFC_CLASSComment(){
				
				    return "";
				
				}
				public String NMFC_CLASSPattern(){
				
					return "";
				
				}
				public String NMFC_CLASSOriginalDbColumnName(){
				
					return "NMFC_CLASS";
				
				}

				
			    public String NMFC_DESCRIPTION;

				public String getNMFC_DESCRIPTION () {
					return this.NMFC_DESCRIPTION;
				}

				public Boolean NMFC_DESCRIPTIONIsNullable(){
				    return false;
				}
				public Boolean NMFC_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer NMFC_DESCRIPTIONLength(){
				    return null;
				}
				public Integer NMFC_DESCRIPTIONPrecision(){
				    return null;
				}
				public String NMFC_DESCRIPTIONDefault(){
				
					return null;
				
				}
				public String NMFC_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String NMFC_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String NMFC_DESCRIPTIONOriginalDbColumnName(){
				
					return "NMFC_DESCRIPTION";
				
				}

				
			    public String TAX_PRODUCT_CODE;

				public String getTAX_PRODUCT_CODE () {
					return this.TAX_PRODUCT_CODE;
				}

				public Boolean TAX_PRODUCT_CODEIsNullable(){
				    return false;
				}
				public Boolean TAX_PRODUCT_CODEIsKey(){
				    return false;
				}
				public Integer TAX_PRODUCT_CODELength(){
				    return null;
				}
				public Integer TAX_PRODUCT_CODEPrecision(){
				    return null;
				}
				public String TAX_PRODUCT_CODEDefault(){
				
					return null;
				
				}
				public String TAX_PRODUCT_CODEComment(){
				
				    return "";
				
				}
				public String TAX_PRODUCT_CODEPattern(){
				
					return "";
				
				}
				public String TAX_PRODUCT_CODEOriginalDbColumnName(){
				
					return "TAX_PRODUCT_CODE";
				
				}

				
			    public String IMPORT_LICENSE_NO;

				public String getIMPORT_LICENSE_NO () {
					return this.IMPORT_LICENSE_NO;
				}

				public Boolean IMPORT_LICENSE_NOIsNullable(){
				    return false;
				}
				public Boolean IMPORT_LICENSE_NOIsKey(){
				    return false;
				}
				public Integer IMPORT_LICENSE_NOLength(){
				    return null;
				}
				public Integer IMPORT_LICENSE_NOPrecision(){
				    return null;
				}
				public String IMPORT_LICENSE_NODefault(){
				
					return null;
				
				}
				public String IMPORT_LICENSE_NOComment(){
				
				    return "";
				
				}
				public String IMPORT_LICENSE_NOPattern(){
				
					return "";
				
				}
				public String IMPORT_LICENSE_NOOriginalDbColumnName(){
				
					return "IMPORT_LICENSE_NO";
				
				}

				
			    public java.util.Date IMPORT_LICENSE_EXP_DATE;

				public java.util.Date getIMPORT_LICENSE_EXP_DATE () {
					return this.IMPORT_LICENSE_EXP_DATE;
				}

				public Boolean IMPORT_LICENSE_EXP_DATEIsNullable(){
				    return false;
				}
				public Boolean IMPORT_LICENSE_EXP_DATEIsKey(){
				    return false;
				}
				public Integer IMPORT_LICENSE_EXP_DATELength(){
				    return null;
				}
				public Integer IMPORT_LICENSE_EXP_DATEPrecision(){
				    return null;
				}
				public String IMPORT_LICENSE_EXP_DATEDefault(){
				
					return null;
				
				}
				public String IMPORT_LICENSE_EXP_DATEComment(){
				
				    return "";
				
				}
				public String IMPORT_LICENSE_EXP_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String IMPORT_LICENSE_EXP_DATEOriginalDbColumnName(){
				
					return "IMPORT_LICENSE_EXP_DATE";
				
				}

				
			    public String ECCN_NO;

				public String getECCN_NO () {
					return this.ECCN_NO;
				}

				public Boolean ECCN_NOIsNullable(){
				    return false;
				}
				public Boolean ECCN_NOIsKey(){
				    return false;
				}
				public Integer ECCN_NOLength(){
				    return null;
				}
				public Integer ECCN_NOPrecision(){
				    return null;
				}
				public String ECCN_NODefault(){
				
					return null;
				
				}
				public String ECCN_NOComment(){
				
				    return "";
				
				}
				public String ECCN_NOPattern(){
				
					return "";
				
				}
				public String ECCN_NOOriginalDbColumnName(){
				
					return "ECCN_NO";
				
				}

				
			    public String SCHEDULE_B_CODE;

				public String getSCHEDULE_B_CODE () {
					return this.SCHEDULE_B_CODE;
				}

				public Boolean SCHEDULE_B_CODEIsNullable(){
				    return false;
				}
				public Boolean SCHEDULE_B_CODEIsKey(){
				    return false;
				}
				public Integer SCHEDULE_B_CODELength(){
				    return null;
				}
				public Integer SCHEDULE_B_CODEPrecision(){
				    return null;
				}
				public String SCHEDULE_B_CODEDefault(){
				
					return null;
				
				}
				public String SCHEDULE_B_CODEComment(){
				
				    return "";
				
				}
				public String SCHEDULE_B_CODEPattern(){
				
					return "";
				
				}
				public String SCHEDULE_B_CODEOriginalDbColumnName(){
				
					return "SCHEDULE_B_CODE";
				
				}

				
			    public String SUPPLIER_CODE;

				public String getSUPPLIER_CODE () {
					return this.SUPPLIER_CODE;
				}

				public Boolean SUPPLIER_CODEIsNullable(){
				    return true;
				}
				public Boolean SUPPLIER_CODEIsKey(){
				    return false;
				}
				public Integer SUPPLIER_CODELength(){
				    return null;
				}
				public Integer SUPPLIER_CODEPrecision(){
				    return null;
				}
				public String SUPPLIER_CODEDefault(){
				
					return null;
				
				}
				public String SUPPLIER_CODEComment(){
				
				    return "";
				
				}
				public String SUPPLIER_CODEPattern(){
				
					return "";
				
				}
				public String SUPPLIER_CODEOriginalDbColumnName(){
				
					return "SUPPLIER_CODE";
				
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
				
					return null;
				
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

				
			    public String SHIPMENT_CONSOL_GROUP_ID;

				public String getSHIPMENT_CONSOL_GROUP_ID () {
					return this.SHIPMENT_CONSOL_GROUP_ID;
				}

				public Boolean SHIPMENT_CONSOL_GROUP_IDIsNullable(){
				    return true;
				}
				public Boolean SHIPMENT_CONSOL_GROUP_IDIsKey(){
				    return false;
				}
				public Integer SHIPMENT_CONSOL_GROUP_IDLength(){
				    return null;
				}
				public Integer SHIPMENT_CONSOL_GROUP_IDPrecision(){
				    return null;
				}
				public String SHIPMENT_CONSOL_GROUP_IDDefault(){
				
					return null;
				
				}
				public String SHIPMENT_CONSOL_GROUP_IDComment(){
				
				    return "";
				
				}
				public String SHIPMENT_CONSOL_GROUP_IDPattern(){
				
					return "";
				
				}
				public String SHIPMENT_CONSOL_GROUP_IDOriginalDbColumnName(){
				
					return "SHIPMENT_CONSOL_GROUP_ID";
				
				}

				
			    public String ORIG_ORDER_LINE_KEY;

				public String getORIG_ORDER_LINE_KEY () {
					return this.ORIG_ORDER_LINE_KEY;
				}

				public Boolean ORIG_ORDER_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean ORIG_ORDER_LINE_KEYIsKey(){
				    return false;
				}
				public Integer ORIG_ORDER_LINE_KEYLength(){
				    return null;
				}
				public Integer ORIG_ORDER_LINE_KEYPrecision(){
				    return null;
				}
				public String ORIG_ORDER_LINE_KEYDefault(){
				
					return null;
				
				}
				public String ORIG_ORDER_LINE_KEYComment(){
				
				    return "";
				
				}
				public String ORIG_ORDER_LINE_KEYPattern(){
				
					return "";
				
				}
				public String ORIG_ORDER_LINE_KEYOriginalDbColumnName(){
				
					return "ORIG_ORDER_LINE_KEY";
				
				}

				
			    public String LINE_SEQ_NO;

				public String getLINE_SEQ_NO () {
					return this.LINE_SEQ_NO;
				}

				public Boolean LINE_SEQ_NOIsNullable(){
				    return false;
				}
				public Boolean LINE_SEQ_NOIsKey(){
				    return false;
				}
				public Integer LINE_SEQ_NOLength(){
				    return null;
				}
				public Integer LINE_SEQ_NOPrecision(){
				    return null;
				}
				public String LINE_SEQ_NODefault(){
				
					return null;
				
				}
				public String LINE_SEQ_NOComment(){
				
				    return "";
				
				}
				public String LINE_SEQ_NOPattern(){
				
					return "";
				
				}
				public String LINE_SEQ_NOOriginalDbColumnName(){
				
					return "LINE_SEQ_NO";
				
				}

				
			    public BigDecimal SPLIT_QTY;

				public BigDecimal getSPLIT_QTY () {
					return this.SPLIT_QTY;
				}

				public Boolean SPLIT_QTYIsNullable(){
				    return false;
				}
				public Boolean SPLIT_QTYIsKey(){
				    return false;
				}
				public Integer SPLIT_QTYLength(){
				    return null;
				}
				public Integer SPLIT_QTYPrecision(){
				    return null;
				}
				public String SPLIT_QTYDefault(){
				
					return "";
				
				}
				public String SPLIT_QTYComment(){
				
				    return "";
				
				}
				public String SPLIT_QTYPattern(){
				
					return "";
				
				}
				public String SPLIT_QTYOriginalDbColumnName(){
				
					return "SPLIT_QTY";
				
				}

				
			    public java.util.Date PRICING_DATE;

				public java.util.Date getPRICING_DATE () {
					return this.PRICING_DATE;
				}

				public Boolean PRICING_DATEIsNullable(){
				    return false;
				}
				public Boolean PRICING_DATEIsKey(){
				    return false;
				}
				public Integer PRICING_DATELength(){
				    return null;
				}
				public Integer PRICING_DATEPrecision(){
				    return null;
				}
				public String PRICING_DATEDefault(){
				
					return null;
				
				}
				public String PRICING_DATEComment(){
				
				    return "";
				
				}
				public String PRICING_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String PRICING_DATEOriginalDbColumnName(){
				
					return "PRICING_DATE";
				
				}

				
			    public String PIPELINE_KEY;

				public String getPIPELINE_KEY () {
					return this.PIPELINE_KEY;
				}

				public Boolean PIPELINE_KEYIsNullable(){
				    return false;
				}
				public Boolean PIPELINE_KEYIsKey(){
				    return false;
				}
				public Integer PIPELINE_KEYLength(){
				    return null;
				}
				public Integer PIPELINE_KEYPrecision(){
				    return null;
				}
				public String PIPELINE_KEYDefault(){
				
					return null;
				
				}
				public String PIPELINE_KEYComment(){
				
				    return "";
				
				}
				public String PIPELINE_KEYPattern(){
				
					return "";
				
				}
				public String PIPELINE_KEYOriginalDbColumnName(){
				
					return "PIPELINE_KEY";
				
				}

				
			    public String CONDITION_VARIABLE_1;

				public String getCONDITION_VARIABLE_1 () {
					return this.CONDITION_VARIABLE_1;
				}

				public Boolean CONDITION_VARIABLE_1IsNullable(){
				    return false;
				}
				public Boolean CONDITION_VARIABLE_1IsKey(){
				    return false;
				}
				public Integer CONDITION_VARIABLE_1Length(){
				    return null;
				}
				public Integer CONDITION_VARIABLE_1Precision(){
				    return null;
				}
				public String CONDITION_VARIABLE_1Default(){
				
					return null;
				
				}
				public String CONDITION_VARIABLE_1Comment(){
				
				    return "";
				
				}
				public String CONDITION_VARIABLE_1Pattern(){
				
					return "";
				
				}
				public String CONDITION_VARIABLE_1OriginalDbColumnName(){
				
					return "CONDITION_VARIABLE_1";
				
				}

				
			    public String CONDITION_VARIABLE_2;

				public String getCONDITION_VARIABLE_2 () {
					return this.CONDITION_VARIABLE_2;
				}

				public Boolean CONDITION_VARIABLE_2IsNullable(){
				    return false;
				}
				public Boolean CONDITION_VARIABLE_2IsKey(){
				    return false;
				}
				public Integer CONDITION_VARIABLE_2Length(){
				    return null;
				}
				public Integer CONDITION_VARIABLE_2Precision(){
				    return null;
				}
				public String CONDITION_VARIABLE_2Default(){
				
					return null;
				
				}
				public String CONDITION_VARIABLE_2Comment(){
				
				    return "";
				
				}
				public String CONDITION_VARIABLE_2Pattern(){
				
					return "";
				
				}
				public String CONDITION_VARIABLE_2OriginalDbColumnName(){
				
					return "CONDITION_VARIABLE_2";
				
				}

				
			    public String IS_PRICE_LOCKED;

				public String getIS_PRICE_LOCKED () {
					return this.IS_PRICE_LOCKED;
				}

				public Boolean IS_PRICE_LOCKEDIsNullable(){
				    return false;
				}
				public Boolean IS_PRICE_LOCKEDIsKey(){
				    return false;
				}
				public Integer IS_PRICE_LOCKEDLength(){
				    return null;
				}
				public Integer IS_PRICE_LOCKEDPrecision(){
				    return null;
				}
				public String IS_PRICE_LOCKEDDefault(){
				
					return null;
				
				}
				public String IS_PRICE_LOCKEDComment(){
				
				    return "";
				
				}
				public String IS_PRICE_LOCKEDPattern(){
				
					return "";
				
				}
				public String IS_PRICE_LOCKEDOriginalDbColumnName(){
				
					return "IS_PRICE_LOCKED";
				
				}

				
			    public String IS_COST_OVERRIDDEN;

				public String getIS_COST_OVERRIDDEN () {
					return this.IS_COST_OVERRIDDEN;
				}

				public Boolean IS_COST_OVERRIDDENIsNullable(){
				    return false;
				}
				public Boolean IS_COST_OVERRIDDENIsKey(){
				    return false;
				}
				public Integer IS_COST_OVERRIDDENLength(){
				    return null;
				}
				public Integer IS_COST_OVERRIDDENPrecision(){
				    return null;
				}
				public String IS_COST_OVERRIDDENDefault(){
				
					return null;
				
				}
				public String IS_COST_OVERRIDDENComment(){
				
				    return "";
				
				}
				public String IS_COST_OVERRIDDENPattern(){
				
					return "";
				
				}
				public String IS_COST_OVERRIDDENOriginalDbColumnName(){
				
					return "IS_COST_OVERRIDDEN";
				
				}

				
			    public String IS_CAPACITY_OVERRIDDEN;

				public String getIS_CAPACITY_OVERRIDDEN () {
					return this.IS_CAPACITY_OVERRIDDEN;
				}

				public Boolean IS_CAPACITY_OVERRIDDENIsNullable(){
				    return false;
				}
				public Boolean IS_CAPACITY_OVERRIDDENIsKey(){
				    return false;
				}
				public Integer IS_CAPACITY_OVERRIDDENLength(){
				    return null;
				}
				public Integer IS_CAPACITY_OVERRIDDENPrecision(){
				    return null;
				}
				public String IS_CAPACITY_OVERRIDDENDefault(){
				
					return null;
				
				}
				public String IS_CAPACITY_OVERRIDDENComment(){
				
				    return "";
				
				}
				public String IS_CAPACITY_OVERRIDDENPattern(){
				
					return "";
				
				}
				public String IS_CAPACITY_OVERRIDDENOriginalDbColumnName(){
				
					return "IS_CAPACITY_OVERRIDDEN";
				
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
				
					return null;
				
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

				
			    public String DELIVERY_METHOD;

				public String getDELIVERY_METHOD () {
					return this.DELIVERY_METHOD;
				}

				public Boolean DELIVERY_METHODIsNullable(){
				    return false;
				}
				public Boolean DELIVERY_METHODIsKey(){
				    return false;
				}
				public Integer DELIVERY_METHODLength(){
				    return null;
				}
				public Integer DELIVERY_METHODPrecision(){
				    return null;
				}
				public String DELIVERY_METHODDefault(){
				
					return null;
				
				}
				public String DELIVERY_METHODComment(){
				
				    return "";
				
				}
				public String DELIVERY_METHODPattern(){
				
					return "";
				
				}
				public String DELIVERY_METHODOriginalDbColumnName(){
				
					return "DELIVERY_METHOD";
				
				}

				
			    public String ITEM_GROUP_CODE;

				public String getITEM_GROUP_CODE () {
					return this.ITEM_GROUP_CODE;
				}

				public Boolean ITEM_GROUP_CODEIsNullable(){
				    return false;
				}
				public Boolean ITEM_GROUP_CODEIsKey(){
				    return false;
				}
				public Integer ITEM_GROUP_CODELength(){
				    return null;
				}
				public Integer ITEM_GROUP_CODEPrecision(){
				    return null;
				}
				public String ITEM_GROUP_CODEDefault(){
				
					return null;
				
				}
				public String ITEM_GROUP_CODEComment(){
				
				    return "";
				
				}
				public String ITEM_GROUP_CODEPattern(){
				
					return "";
				
				}
				public String ITEM_GROUP_CODEOriginalDbColumnName(){
				
					return "ITEM_GROUP_CODE";
				
				}

				
			    public java.util.Date CANNOT_COMPLETE_BEFORE_DATE;

				public java.util.Date getCANNOT_COMPLETE_BEFORE_DATE () {
					return this.CANNOT_COMPLETE_BEFORE_DATE;
				}

				public Boolean CANNOT_COMPLETE_BEFORE_DATEIsNullable(){
				    return true;
				}
				public Boolean CANNOT_COMPLETE_BEFORE_DATEIsKey(){
				    return false;
				}
				public Integer CANNOT_COMPLETE_BEFORE_DATELength(){
				    return null;
				}
				public Integer CANNOT_COMPLETE_BEFORE_DATEPrecision(){
				    return null;
				}
				public String CANNOT_COMPLETE_BEFORE_DATEDefault(){
				
					return null;
				
				}
				public String CANNOT_COMPLETE_BEFORE_DATEComment(){
				
				    return "";
				
				}
				public String CANNOT_COMPLETE_BEFORE_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String CANNOT_COMPLETE_BEFORE_DATEOriginalDbColumnName(){
				
					return "CANNOT_COMPLETE_BEFORE_DATE";
				
				}

				
			    public java.util.Date CANNOT_COMPLETE_AFTER_DATE;

				public java.util.Date getCANNOT_COMPLETE_AFTER_DATE () {
					return this.CANNOT_COMPLETE_AFTER_DATE;
				}

				public Boolean CANNOT_COMPLETE_AFTER_DATEIsNullable(){
				    return true;
				}
				public Boolean CANNOT_COMPLETE_AFTER_DATEIsKey(){
				    return false;
				}
				public Integer CANNOT_COMPLETE_AFTER_DATELength(){
				    return null;
				}
				public Integer CANNOT_COMPLETE_AFTER_DATEPrecision(){
				    return null;
				}
				public String CANNOT_COMPLETE_AFTER_DATEDefault(){
				
					return null;
				
				}
				public String CANNOT_COMPLETE_AFTER_DATEComment(){
				
				    return "";
				
				}
				public String CANNOT_COMPLETE_AFTER_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String CANNOT_COMPLETE_AFTER_DATEOriginalDbColumnName(){
				
					return "CANNOT_COMPLETE_AFTER_DATE";
				
				}

				
			    public String APPT_STATUS;

				public String getAPPT_STATUS () {
					return this.APPT_STATUS;
				}

				public Boolean APPT_STATUSIsNullable(){
				    return false;
				}
				public Boolean APPT_STATUSIsKey(){
				    return false;
				}
				public Integer APPT_STATUSLength(){
				    return null;
				}
				public Integer APPT_STATUSPrecision(){
				    return null;
				}
				public String APPT_STATUSDefault(){
				
					return null;
				
				}
				public String APPT_STATUSComment(){
				
				    return "";
				
				}
				public String APPT_STATUSPattern(){
				
					return "";
				
				}
				public String APPT_STATUSOriginalDbColumnName(){
				
					return "APPT_STATUS";
				
				}

				
			    public String CAN_ADD_SERVICE_LINES;

				public String getCAN_ADD_SERVICE_LINES () {
					return this.CAN_ADD_SERVICE_LINES;
				}

				public Boolean CAN_ADD_SERVICE_LINESIsNullable(){
				    return false;
				}
				public Boolean CAN_ADD_SERVICE_LINESIsKey(){
				    return false;
				}
				public Integer CAN_ADD_SERVICE_LINESLength(){
				    return null;
				}
				public Integer CAN_ADD_SERVICE_LINESPrecision(){
				    return null;
				}
				public String CAN_ADD_SERVICE_LINESDefault(){
				
					return null;
				
				}
				public String CAN_ADD_SERVICE_LINESComment(){
				
				    return "";
				
				}
				public String CAN_ADD_SERVICE_LINESPattern(){
				
					return "";
				
				}
				public String CAN_ADD_SERVICE_LINESOriginalDbColumnName(){
				
					return "CAN_ADD_SERVICE_LINES";
				
				}

				
			    public String PRICING_UOM;

				public String getPRICING_UOM () {
					return this.PRICING_UOM;
				}

				public Boolean PRICING_UOMIsNullable(){
				    return false;
				}
				public Boolean PRICING_UOMIsKey(){
				    return false;
				}
				public Integer PRICING_UOMLength(){
				    return null;
				}
				public Integer PRICING_UOMPrecision(){
				    return null;
				}
				public String PRICING_UOMDefault(){
				
					return null;
				
				}
				public String PRICING_UOMComment(){
				
				    return "";
				
				}
				public String PRICING_UOMPattern(){
				
					return "";
				
				}
				public String PRICING_UOMOriginalDbColumnName(){
				
					return "PRICING_UOM";
				
				}

				
			    public String CAPACITY_UOM;

				public String getCAPACITY_UOM () {
					return this.CAPACITY_UOM;
				}

				public Boolean CAPACITY_UOMIsNullable(){
				    return false;
				}
				public Boolean CAPACITY_UOMIsKey(){
				    return false;
				}
				public Integer CAPACITY_UOMLength(){
				    return null;
				}
				public Integer CAPACITY_UOMPrecision(){
				    return null;
				}
				public String CAPACITY_UOMDefault(){
				
					return null;
				
				}
				public String CAPACITY_UOMComment(){
				
				    return "";
				
				}
				public String CAPACITY_UOMPattern(){
				
					return "";
				
				}
				public String CAPACITY_UOMOriginalDbColumnName(){
				
					return "CAPACITY_UOM";
				
				}

				
			    public BigDecimal PRICING_QUANTITY;

				public BigDecimal getPRICING_QUANTITY () {
					return this.PRICING_QUANTITY;
				}

				public Boolean PRICING_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean PRICING_QUANTITYIsKey(){
				    return false;
				}
				public Integer PRICING_QUANTITYLength(){
				    return null;
				}
				public Integer PRICING_QUANTITYPrecision(){
				    return null;
				}
				public String PRICING_QUANTITYDefault(){
				
					return "";
				
				}
				public String PRICING_QUANTITYComment(){
				
				    return "";
				
				}
				public String PRICING_QUANTITYPattern(){
				
					return "";
				
				}
				public String PRICING_QUANTITYOriginalDbColumnName(){
				
					return "PRICING_QUANTITY";
				
				}

				
			    public BigDecimal SHIPPED_QUANTITY;

				public BigDecimal getSHIPPED_QUANTITY () {
					return this.SHIPPED_QUANTITY;
				}

				public Boolean SHIPPED_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean SHIPPED_QUANTITYIsKey(){
				    return false;
				}
				public Integer SHIPPED_QUANTITYLength(){
				    return null;
				}
				public Integer SHIPPED_QUANTITYPrecision(){
				    return null;
				}
				public String SHIPPED_QUANTITYDefault(){
				
					return "";
				
				}
				public String SHIPPED_QUANTITYComment(){
				
				    return "";
				
				}
				public String SHIPPED_QUANTITYPattern(){
				
					return "";
				
				}
				public String SHIPPED_QUANTITYOriginalDbColumnName(){
				
					return "SHIPPED_QUANTITY";
				
				}

				
			    public BigDecimal FIXED_CAPACITY_QTY_PER_LINE;

				public BigDecimal getFIXED_CAPACITY_QTY_PER_LINE () {
					return this.FIXED_CAPACITY_QTY_PER_LINE;
				}

				public Boolean FIXED_CAPACITY_QTY_PER_LINEIsNullable(){
				    return false;
				}
				public Boolean FIXED_CAPACITY_QTY_PER_LINEIsKey(){
				    return false;
				}
				public Integer FIXED_CAPACITY_QTY_PER_LINELength(){
				    return null;
				}
				public Integer FIXED_CAPACITY_QTY_PER_LINEPrecision(){
				    return null;
				}
				public String FIXED_CAPACITY_QTY_PER_LINEDefault(){
				
					return "";
				
				}
				public String FIXED_CAPACITY_QTY_PER_LINEComment(){
				
				    return "";
				
				}
				public String FIXED_CAPACITY_QTY_PER_LINEPattern(){
				
					return "";
				
				}
				public String FIXED_CAPACITY_QTY_PER_LINEOriginalDbColumnName(){
				
					return "FIXED_CAPACITY_QTY_PER_LINE";
				
				}

				
			    public BigDecimal FIXED_PRICING_QTY_PER_LINE;

				public BigDecimal getFIXED_PRICING_QTY_PER_LINE () {
					return this.FIXED_PRICING_QTY_PER_LINE;
				}

				public Boolean FIXED_PRICING_QTY_PER_LINEIsNullable(){
				    return false;
				}
				public Boolean FIXED_PRICING_QTY_PER_LINEIsKey(){
				    return false;
				}
				public Integer FIXED_PRICING_QTY_PER_LINELength(){
				    return null;
				}
				public Integer FIXED_PRICING_QTY_PER_LINEPrecision(){
				    return null;
				}
				public String FIXED_PRICING_QTY_PER_LINEDefault(){
				
					return "";
				
				}
				public String FIXED_PRICING_QTY_PER_LINEComment(){
				
				    return "";
				
				}
				public String FIXED_PRICING_QTY_PER_LINEPattern(){
				
					return "";
				
				}
				public String FIXED_PRICING_QTY_PER_LINEOriginalDbColumnName(){
				
					return "FIXED_PRICING_QTY_PER_LINE";
				
				}

				
			    public String WAIT_FOR_SEQ_LINE;

				public String getWAIT_FOR_SEQ_LINE () {
					return this.WAIT_FOR_SEQ_LINE;
				}

				public Boolean WAIT_FOR_SEQ_LINEIsNullable(){
				    return false;
				}
				public Boolean WAIT_FOR_SEQ_LINEIsKey(){
				    return false;
				}
				public Integer WAIT_FOR_SEQ_LINELength(){
				    return null;
				}
				public Integer WAIT_FOR_SEQ_LINEPrecision(){
				    return null;
				}
				public String WAIT_FOR_SEQ_LINEDefault(){
				
					return null;
				
				}
				public String WAIT_FOR_SEQ_LINEComment(){
				
				    return "";
				
				}
				public String WAIT_FOR_SEQ_LINEPattern(){
				
					return "";
				
				}
				public String WAIT_FOR_SEQ_LINEOriginalDbColumnName(){
				
					return "WAIT_FOR_SEQ_LINE";
				
				}

				
			    public String SCHED_FAILURE_REASON_CODE;

				public String getSCHED_FAILURE_REASON_CODE () {
					return this.SCHED_FAILURE_REASON_CODE;
				}

				public Boolean SCHED_FAILURE_REASON_CODEIsNullable(){
				    return false;
				}
				public Boolean SCHED_FAILURE_REASON_CODEIsKey(){
				    return false;
				}
				public Integer SCHED_FAILURE_REASON_CODELength(){
				    return null;
				}
				public Integer SCHED_FAILURE_REASON_CODEPrecision(){
				    return null;
				}
				public String SCHED_FAILURE_REASON_CODEDefault(){
				
					return null;
				
				}
				public String SCHED_FAILURE_REASON_CODEComment(){
				
				    return "";
				
				}
				public String SCHED_FAILURE_REASON_CODEPattern(){
				
					return "";
				
				}
				public String SCHED_FAILURE_REASON_CODEOriginalDbColumnName(){
				
					return "SCHED_FAILURE_REASON_CODE";
				
				}

				
			    public java.util.Date EARLIEST_SHIP_DATE;

				public java.util.Date getEARLIEST_SHIP_DATE () {
					return this.EARLIEST_SHIP_DATE;
				}

				public Boolean EARLIEST_SHIP_DATEIsNullable(){
				    return false;
				}
				public Boolean EARLIEST_SHIP_DATEIsKey(){
				    return false;
				}
				public Integer EARLIEST_SHIP_DATELength(){
				    return null;
				}
				public Integer EARLIEST_SHIP_DATEPrecision(){
				    return null;
				}
				public String EARLIEST_SHIP_DATEDefault(){
				
					return null;
				
				}
				public String EARLIEST_SHIP_DATEComment(){
				
				    return "";
				
				}
				public String EARLIEST_SHIP_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EARLIEST_SHIP_DATEOriginalDbColumnName(){
				
					return "EARLIEST_SHIP_DATE";
				
				}

				
			    public java.util.Date EARLIEST_DELIVERY_DATE;

				public java.util.Date getEARLIEST_DELIVERY_DATE () {
					return this.EARLIEST_DELIVERY_DATE;
				}

				public Boolean EARLIEST_DELIVERY_DATEIsNullable(){
				    return false;
				}
				public Boolean EARLIEST_DELIVERY_DATEIsKey(){
				    return false;
				}
				public Integer EARLIEST_DELIVERY_DATELength(){
				    return null;
				}
				public Integer EARLIEST_DELIVERY_DATEPrecision(){
				    return null;
				}
				public String EARLIEST_DELIVERY_DATEDefault(){
				
					return null;
				
				}
				public String EARLIEST_DELIVERY_DATEComment(){
				
				    return "";
				
				}
				public String EARLIEST_DELIVERY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EARLIEST_DELIVERY_DATEOriginalDbColumnName(){
				
					return "EARLIEST_DELIVERY_DATE";
				
				}

				
			    public String CANNOT_MEET_APPT;

				public String getCANNOT_MEET_APPT () {
					return this.CANNOT_MEET_APPT;
				}

				public Boolean CANNOT_MEET_APPTIsNullable(){
				    return false;
				}
				public Boolean CANNOT_MEET_APPTIsKey(){
				    return false;
				}
				public Integer CANNOT_MEET_APPTLength(){
				    return null;
				}
				public Integer CANNOT_MEET_APPTPrecision(){
				    return null;
				}
				public String CANNOT_MEET_APPTDefault(){
				
					return null;
				
				}
				public String CANNOT_MEET_APPTComment(){
				
				    return "";
				
				}
				public String CANNOT_MEET_APPTPattern(){
				
					return "";
				
				}
				public String CANNOT_MEET_APPTOriginalDbColumnName(){
				
					return "CANNOT_MEET_APPT";
				
				}

				
			    public java.util.Date PROMISED_APPT_START_DATE;

				public java.util.Date getPROMISED_APPT_START_DATE () {
					return this.PROMISED_APPT_START_DATE;
				}

				public Boolean PROMISED_APPT_START_DATEIsNullable(){
				    return true;
				}
				public Boolean PROMISED_APPT_START_DATEIsKey(){
				    return false;
				}
				public Integer PROMISED_APPT_START_DATELength(){
				    return null;
				}
				public Integer PROMISED_APPT_START_DATEPrecision(){
				    return null;
				}
				public String PROMISED_APPT_START_DATEDefault(){
				
					return null;
				
				}
				public String PROMISED_APPT_START_DATEComment(){
				
				    return "";
				
				}
				public String PROMISED_APPT_START_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String PROMISED_APPT_START_DATEOriginalDbColumnName(){
				
					return "PROMISED_APPT_START_DATE";
				
				}

				
			    public java.util.Date PROMISED_APPT_END_DATE;

				public java.util.Date getPROMISED_APPT_END_DATE () {
					return this.PROMISED_APPT_END_DATE;
				}

				public Boolean PROMISED_APPT_END_DATEIsNullable(){
				    return true;
				}
				public Boolean PROMISED_APPT_END_DATEIsKey(){
				    return false;
				}
				public Integer PROMISED_APPT_END_DATELength(){
				    return null;
				}
				public Integer PROMISED_APPT_END_DATEPrecision(){
				    return null;
				}
				public String PROMISED_APPT_END_DATEDefault(){
				
					return null;
				
				}
				public String PROMISED_APPT_END_DATEComment(){
				
				    return "";
				
				}
				public String PROMISED_APPT_END_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String PROMISED_APPT_END_DATEOriginalDbColumnName(){
				
					return "PROMISED_APPT_END_DATE";
				
				}

				
			    public String SEGMENT;

				public String getSEGMENT () {
					return this.SEGMENT;
				}

				public Boolean SEGMENTIsNullable(){
				    return false;
				}
				public Boolean SEGMENTIsKey(){
				    return false;
				}
				public Integer SEGMENTLength(){
				    return null;
				}
				public Integer SEGMENTPrecision(){
				    return null;
				}
				public String SEGMENTDefault(){
				
					return null;
				
				}
				public String SEGMENTComment(){
				
				    return "";
				
				}
				public String SEGMENTPattern(){
				
					return "";
				
				}
				public String SEGMENTOriginalDbColumnName(){
				
					return "SEGMENT";
				
				}

				
			    public String SEGMENT_TYPE;

				public String getSEGMENT_TYPE () {
					return this.SEGMENT_TYPE;
				}

				public Boolean SEGMENT_TYPEIsNullable(){
				    return false;
				}
				public Boolean SEGMENT_TYPEIsKey(){
				    return false;
				}
				public Integer SEGMENT_TYPELength(){
				    return null;
				}
				public Integer SEGMENT_TYPEPrecision(){
				    return null;
				}
				public String SEGMENT_TYPEDefault(){
				
					return "";
				
				}
				public String SEGMENT_TYPEComment(){
				
				    return "";
				
				}
				public String SEGMENT_TYPEPattern(){
				
					return "";
				
				}
				public String SEGMENT_TYPEOriginalDbColumnName(){
				
					return "SEGMENT_TYPE";
				
				}

				
			    public java.util.Date EARLIEST_SCHEDULE_DATE;

				public java.util.Date getEARLIEST_SCHEDULE_DATE () {
					return this.EARLIEST_SCHEDULE_DATE;
				}

				public Boolean EARLIEST_SCHEDULE_DATEIsNullable(){
				    return true;
				}
				public Boolean EARLIEST_SCHEDULE_DATEIsKey(){
				    return false;
				}
				public Integer EARLIEST_SCHEDULE_DATELength(){
				    return null;
				}
				public Integer EARLIEST_SCHEDULE_DATEPrecision(){
				    return null;
				}
				public String EARLIEST_SCHEDULE_DATEDefault(){
				
					return "";
				
				}
				public String EARLIEST_SCHEDULE_DATEComment(){
				
				    return "";
				
				}
				public String EARLIEST_SCHEDULE_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EARLIEST_SCHEDULE_DATEOriginalDbColumnName(){
				
					return "EARLIEST_SCHEDULE_DATE";
				
				}

				
			    public String TIMEZONE;

				public String getTIMEZONE () {
					return this.TIMEZONE;
				}

				public Boolean TIMEZONEIsNullable(){
				    return false;
				}
				public Boolean TIMEZONEIsKey(){
				    return false;
				}
				public Integer TIMEZONELength(){
				    return null;
				}
				public Integer TIMEZONEPrecision(){
				    return null;
				}
				public String TIMEZONEDefault(){
				
					return "";
				
				}
				public String TIMEZONEComment(){
				
				    return "";
				
				}
				public String TIMEZONEPattern(){
				
					return "";
				
				}
				public String TIMEZONEOriginalDbColumnName(){
				
					return "TIMEZONE";
				
				}

				
			    public String IS_FORWARDING_ALLOWED;

				public String getIS_FORWARDING_ALLOWED () {
					return this.IS_FORWARDING_ALLOWED;
				}

				public Boolean IS_FORWARDING_ALLOWEDIsNullable(){
				    return true;
				}
				public Boolean IS_FORWARDING_ALLOWEDIsKey(){
				    return false;
				}
				public Integer IS_FORWARDING_ALLOWEDLength(){
				    return null;
				}
				public Integer IS_FORWARDING_ALLOWEDPrecision(){
				    return null;
				}
				public String IS_FORWARDING_ALLOWEDDefault(){
				
					return "";
				
				}
				public String IS_FORWARDING_ALLOWEDComment(){
				
				    return "";
				
				}
				public String IS_FORWARDING_ALLOWEDPattern(){
				
					return "";
				
				}
				public String IS_FORWARDING_ALLOWEDOriginalDbColumnName(){
				
					return "IS_FORWARDING_ALLOWED";
				
				}

				
			    public String IS_PROCUREMENT_ALLOWED;

				public String getIS_PROCUREMENT_ALLOWED () {
					return this.IS_PROCUREMENT_ALLOWED;
				}

				public Boolean IS_PROCUREMENT_ALLOWEDIsNullable(){
				    return true;
				}
				public Boolean IS_PROCUREMENT_ALLOWEDIsKey(){
				    return false;
				}
				public Integer IS_PROCUREMENT_ALLOWEDLength(){
				    return null;
				}
				public Integer IS_PROCUREMENT_ALLOWEDPrecision(){
				    return null;
				}
				public String IS_PROCUREMENT_ALLOWEDDefault(){
				
					return "";
				
				}
				public String IS_PROCUREMENT_ALLOWEDComment(){
				
				    return "";
				
				}
				public String IS_PROCUREMENT_ALLOWEDPattern(){
				
					return "";
				
				}
				public String IS_PROCUREMENT_ALLOWEDOriginalDbColumnName(){
				
					return "IS_PROCUREMENT_ALLOWED";
				
				}

				
			    public String RESHIP_PARENT_LINE_KEY;

				public String getRESHIP_PARENT_LINE_KEY () {
					return this.RESHIP_PARENT_LINE_KEY;
				}

				public Boolean RESHIP_PARENT_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean RESHIP_PARENT_LINE_KEYIsKey(){
				    return false;
				}
				public Integer RESHIP_PARENT_LINE_KEYLength(){
				    return null;
				}
				public Integer RESHIP_PARENT_LINE_KEYPrecision(){
				    return null;
				}
				public String RESHIP_PARENT_LINE_KEYDefault(){
				
					return "";
				
				}
				public String RESHIP_PARENT_LINE_KEYComment(){
				
				    return "";
				
				}
				public String RESHIP_PARENT_LINE_KEYPattern(){
				
					return "";
				
				}
				public String RESHIP_PARENT_LINE_KEYOriginalDbColumnName(){
				
					return "RESHIP_PARENT_LINE_KEY";
				
				}

				
			    public String BUNDLE_PARENT_ORDER_LINE_KEY;

				public String getBUNDLE_PARENT_ORDER_LINE_KEY () {
					return this.BUNDLE_PARENT_ORDER_LINE_KEY;
				}

				public Boolean BUNDLE_PARENT_ORDER_LINE_KEYIsNullable(){
				    return true;
				}
				public Boolean BUNDLE_PARENT_ORDER_LINE_KEYIsKey(){
				    return false;
				}
				public Integer BUNDLE_PARENT_ORDER_LINE_KEYLength(){
				    return null;
				}
				public Integer BUNDLE_PARENT_ORDER_LINE_KEYPrecision(){
				    return null;
				}
				public String BUNDLE_PARENT_ORDER_LINE_KEYDefault(){
				
					return "";
				
				}
				public String BUNDLE_PARENT_ORDER_LINE_KEYComment(){
				
				    return "";
				
				}
				public String BUNDLE_PARENT_ORDER_LINE_KEYPattern(){
				
					return "";
				
				}
				public String BUNDLE_PARENT_ORDER_LINE_KEYOriginalDbColumnName(){
				
					return "BUNDLE_PARENT_ORDER_LINE_KEY";
				
				}

				
			    public String IS_PRICE_INFO_ONLY;

				public String getIS_PRICE_INFO_ONLY () {
					return this.IS_PRICE_INFO_ONLY;
				}

				public Boolean IS_PRICE_INFO_ONLYIsNullable(){
				    return true;
				}
				public Boolean IS_PRICE_INFO_ONLYIsKey(){
				    return false;
				}
				public Integer IS_PRICE_INFO_ONLYLength(){
				    return null;
				}
				public Integer IS_PRICE_INFO_ONLYPrecision(){
				    return null;
				}
				public String IS_PRICE_INFO_ONLYDefault(){
				
					return "";
				
				}
				public String IS_PRICE_INFO_ONLYComment(){
				
				    return "";
				
				}
				public String IS_PRICE_INFO_ONLYPattern(){
				
					return "";
				
				}
				public String IS_PRICE_INFO_ONLYOriginalDbColumnName(){
				
					return "IS_PRICE_INFO_ONLY";
				
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

				
			    public BigDecimal FIRST_ITER_SEQ_NO;

				public BigDecimal getFIRST_ITER_SEQ_NO () {
					return this.FIRST_ITER_SEQ_NO;
				}

				public Boolean FIRST_ITER_SEQ_NOIsNullable(){
				    return true;
				}
				public Boolean FIRST_ITER_SEQ_NOIsKey(){
				    return false;
				}
				public Integer FIRST_ITER_SEQ_NOLength(){
				    return null;
				}
				public Integer FIRST_ITER_SEQ_NOPrecision(){
				    return null;
				}
				public String FIRST_ITER_SEQ_NODefault(){
				
					return "";
				
				}
				public String FIRST_ITER_SEQ_NOComment(){
				
				    return "";
				
				}
				public String FIRST_ITER_SEQ_NOPattern(){
				
					return "";
				
				}
				public String FIRST_ITER_SEQ_NOOriginalDbColumnName(){
				
					return "FIRST_ITER_SEQ_NO";
				
				}

				
			    public BigDecimal LAST_ITER_SEQ_NO;

				public BigDecimal getLAST_ITER_SEQ_NO () {
					return this.LAST_ITER_SEQ_NO;
				}

				public Boolean LAST_ITER_SEQ_NOIsNullable(){
				    return true;
				}
				public Boolean LAST_ITER_SEQ_NOIsKey(){
				    return false;
				}
				public Integer LAST_ITER_SEQ_NOLength(){
				    return null;
				}
				public Integer LAST_ITER_SEQ_NOPrecision(){
				    return null;
				}
				public String LAST_ITER_SEQ_NODefault(){
				
					return "";
				
				}
				public String LAST_ITER_SEQ_NOComment(){
				
				    return "";
				
				}
				public String LAST_ITER_SEQ_NOPattern(){
				
					return "";
				
				}
				public String LAST_ITER_SEQ_NOOriginalDbColumnName(){
				
					return "LAST_ITER_SEQ_NO";
				
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

				
			    public String ORDERING_UOM;

				public String getORDERING_UOM () {
					return this.ORDERING_UOM;
				}

				public Boolean ORDERING_UOMIsNullable(){
				    return false;
				}
				public Boolean ORDERING_UOMIsKey(){
				    return false;
				}
				public Integer ORDERING_UOMLength(){
				    return null;
				}
				public Integer ORDERING_UOMPrecision(){
				    return null;
				}
				public String ORDERING_UOMDefault(){
				
					return "";
				
				}
				public String ORDERING_UOMComment(){
				
				    return "";
				
				}
				public String ORDERING_UOMPattern(){
				
					return "";
				
				}
				public String ORDERING_UOMOriginalDbColumnName(){
				
					return "ORDERING_UOM";
				
				}

				
			    public BigDecimal PRICING_QUANTITY_CONV_FACTOR;

				public BigDecimal getPRICING_QUANTITY_CONV_FACTOR () {
					return this.PRICING_QUANTITY_CONV_FACTOR;
				}

				public Boolean PRICING_QUANTITY_CONV_FACTORIsNullable(){
				    return false;
				}
				public Boolean PRICING_QUANTITY_CONV_FACTORIsKey(){
				    return false;
				}
				public Integer PRICING_QUANTITY_CONV_FACTORLength(){
				    return null;
				}
				public Integer PRICING_QUANTITY_CONV_FACTORPrecision(){
				    return null;
				}
				public String PRICING_QUANTITY_CONV_FACTORDefault(){
				
					return "";
				
				}
				public String PRICING_QUANTITY_CONV_FACTORComment(){
				
				    return "";
				
				}
				public String PRICING_QUANTITY_CONV_FACTORPattern(){
				
					return "";
				
				}
				public String PRICING_QUANTITY_CONV_FACTOROriginalDbColumnName(){
				
					return "PRICING_QUANTITY_CONV_FACTOR";
				
				}

				
			    public String PRICING_QUANTITY_STRATEGY;

				public String getPRICING_QUANTITY_STRATEGY () {
					return this.PRICING_QUANTITY_STRATEGY;
				}

				public Boolean PRICING_QUANTITY_STRATEGYIsNullable(){
				    return false;
				}
				public Boolean PRICING_QUANTITY_STRATEGYIsKey(){
				    return false;
				}
				public Integer PRICING_QUANTITY_STRATEGYLength(){
				    return null;
				}
				public Integer PRICING_QUANTITY_STRATEGYPrecision(){
				    return null;
				}
				public String PRICING_QUANTITY_STRATEGYDefault(){
				
					return "";
				
				}
				public String PRICING_QUANTITY_STRATEGYComment(){
				
				    return "";
				
				}
				public String PRICING_QUANTITY_STRATEGYPattern(){
				
					return "";
				
				}
				public String PRICING_QUANTITY_STRATEGYOriginalDbColumnName(){
				
					return "PRICING_QUANTITY_STRATEGY";
				
				}

				
			    public BigDecimal INVOICED_PRICING_QUANTITY;

				public BigDecimal getINVOICED_PRICING_QUANTITY () {
					return this.INVOICED_PRICING_QUANTITY;
				}

				public Boolean INVOICED_PRICING_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean INVOICED_PRICING_QUANTITYIsKey(){
				    return false;
				}
				public Integer INVOICED_PRICING_QUANTITYLength(){
				    return null;
				}
				public Integer INVOICED_PRICING_QUANTITYPrecision(){
				    return null;
				}
				public String INVOICED_PRICING_QUANTITYDefault(){
				
					return "";
				
				}
				public String INVOICED_PRICING_QUANTITYComment(){
				
				    return "";
				
				}
				public String INVOICED_PRICING_QUANTITYPattern(){
				
					return "";
				
				}
				public String INVOICED_PRICING_QUANTITYOriginalDbColumnName(){
				
					return "INVOICED_PRICING_QUANTITY";
				
				}

				
			    public String IS_STANDALONE_SERVICE;

				public String getIS_STANDALONE_SERVICE () {
					return this.IS_STANDALONE_SERVICE;
				}

				public Boolean IS_STANDALONE_SERVICEIsNullable(){
				    return false;
				}
				public Boolean IS_STANDALONE_SERVICEIsKey(){
				    return false;
				}
				public Integer IS_STANDALONE_SERVICELength(){
				    return null;
				}
				public Integer IS_STANDALONE_SERVICEPrecision(){
				    return null;
				}
				public String IS_STANDALONE_SERVICEDefault(){
				
					return "";
				
				}
				public String IS_STANDALONE_SERVICEComment(){
				
				    return "";
				
				}
				public String IS_STANDALONE_SERVICEPattern(){
				
					return "";
				
				}
				public String IS_STANDALONE_SERVICEOriginalDbColumnName(){
				
					return "IS_STANDALONE_SERVICE";
				
				}

				
			    public BigDecimal TRAN_DISCREPANCY_QTY;

				public BigDecimal getTRAN_DISCREPANCY_QTY () {
					return this.TRAN_DISCREPANCY_QTY;
				}

				public Boolean TRAN_DISCREPANCY_QTYIsNullable(){
				    return false;
				}
				public Boolean TRAN_DISCREPANCY_QTYIsKey(){
				    return false;
				}
				public Integer TRAN_DISCREPANCY_QTYLength(){
				    return null;
				}
				public Integer TRAN_DISCREPANCY_QTYPrecision(){
				    return null;
				}
				public String TRAN_DISCREPANCY_QTYDefault(){
				
					return "";
				
				}
				public String TRAN_DISCREPANCY_QTYComment(){
				
				    return "";
				
				}
				public String TRAN_DISCREPANCY_QTYPattern(){
				
					return "";
				
				}
				public String TRAN_DISCREPANCY_QTYOriginalDbColumnName(){
				
					return "TRAN_DISCREPANCY_QTY";
				
				}

				
			    public BigDecimal RECEIVED_QUANTITY;

				public BigDecimal getRECEIVED_QUANTITY () {
					return this.RECEIVED_QUANTITY;
				}

				public Boolean RECEIVED_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean RECEIVED_QUANTITYIsKey(){
				    return false;
				}
				public Integer RECEIVED_QUANTITYLength(){
				    return null;
				}
				public Integer RECEIVED_QUANTITYPrecision(){
				    return null;
				}
				public String RECEIVED_QUANTITYDefault(){
				
					return "";
				
				}
				public String RECEIVED_QUANTITYComment(){
				
				    return "";
				
				}
				public String RECEIVED_QUANTITYPattern(){
				
					return "";
				
				}
				public String RECEIVED_QUANTITYOriginalDbColumnName(){
				
					return "RECEIVED_QUANTITY";
				
				}

				
			    public String INVOICE_BASED_ON_ACTUALS;

				public String getINVOICE_BASED_ON_ACTUALS () {
					return this.INVOICE_BASED_ON_ACTUALS;
				}

				public Boolean INVOICE_BASED_ON_ACTUALSIsNullable(){
				    return false;
				}
				public Boolean INVOICE_BASED_ON_ACTUALSIsKey(){
				    return false;
				}
				public Integer INVOICE_BASED_ON_ACTUALSLength(){
				    return null;
				}
				public Integer INVOICE_BASED_ON_ACTUALSPrecision(){
				    return null;
				}
				public String INVOICE_BASED_ON_ACTUALSDefault(){
				
					return "";
				
				}
				public String INVOICE_BASED_ON_ACTUALSComment(){
				
				    return "";
				
				}
				public String INVOICE_BASED_ON_ACTUALSPattern(){
				
					return "";
				
				}
				public String INVOICE_BASED_ON_ACTUALSOriginalDbColumnName(){
				
					return "INVOICE_BASED_ON_ACTUALS";
				
				}

				
			    public BigDecimal ACTUAL_PRICING_QUANTITY;

				public BigDecimal getACTUAL_PRICING_QUANTITY () {
					return this.ACTUAL_PRICING_QUANTITY;
				}

				public Boolean ACTUAL_PRICING_QUANTITYIsNullable(){
				    return false;
				}
				public Boolean ACTUAL_PRICING_QUANTITYIsKey(){
				    return false;
				}
				public Integer ACTUAL_PRICING_QUANTITYLength(){
				    return null;
				}
				public Integer ACTUAL_PRICING_QUANTITYPrecision(){
				    return null;
				}
				public String ACTUAL_PRICING_QUANTITYDefault(){
				
					return "";
				
				}
				public String ACTUAL_PRICING_QUANTITYComment(){
				
				    return "";
				
				}
				public String ACTUAL_PRICING_QUANTITYPattern(){
				
					return "";
				
				}
				public String ACTUAL_PRICING_QUANTITYOriginalDbColumnName(){
				
					return "ACTUAL_PRICING_QUANTITY";
				
				}

				
			    public String FULFILLMENT_TYPE;

				public String getFULFILLMENT_TYPE () {
					return this.FULFILLMENT_TYPE;
				}

				public Boolean FULFILLMENT_TYPEIsNullable(){
				    return false;
				}
				public Boolean FULFILLMENT_TYPEIsKey(){
				    return false;
				}
				public Integer FULFILLMENT_TYPELength(){
				    return null;
				}
				public Integer FULFILLMENT_TYPEPrecision(){
				    return null;
				}
				public String FULFILLMENT_TYPEDefault(){
				
					return "";
				
				}
				public String FULFILLMENT_TYPEComment(){
				
				    return "";
				
				}
				public String FULFILLMENT_TYPEPattern(){
				
					return "";
				
				}
				public String FULFILLMENT_TYPEOriginalDbColumnName(){
				
					return "FULFILLMENT_TYPE";
				
				}

				
			    public String SERIAL_NO;

				public String getSERIAL_NO () {
					return this.SERIAL_NO;
				}

				public Boolean SERIAL_NOIsNullable(){
				    return false;
				}
				public Boolean SERIAL_NOIsKey(){
				    return false;
				}
				public Integer SERIAL_NOLength(){
				    return null;
				}
				public Integer SERIAL_NOPrecision(){
				    return null;
				}
				public String SERIAL_NODefault(){
				
					return null;
				
				}
				public String SERIAL_NOComment(){
				
				    return "";
				
				}
				public String SERIAL_NOPattern(){
				
					return "";
				
				}
				public String SERIAL_NOOriginalDbColumnName(){
				
					return "SERIAL_NO";
				
				}

				
			    public String RESERVATION_MANDATORY;

				public String getRESERVATION_MANDATORY () {
					return this.RESERVATION_MANDATORY;
				}

				public Boolean RESERVATION_MANDATORYIsNullable(){
				    return false;
				}
				public Boolean RESERVATION_MANDATORYIsKey(){
				    return false;
				}
				public Integer RESERVATION_MANDATORYLength(){
				    return null;
				}
				public Integer RESERVATION_MANDATORYPrecision(){
				    return null;
				}
				public String RESERVATION_MANDATORYDefault(){
				
					return null;
				
				}
				public String RESERVATION_MANDATORYComment(){
				
				    return "";
				
				}
				public String RESERVATION_MANDATORYPattern(){
				
					return "";
				
				}
				public String RESERVATION_MANDATORYOriginalDbColumnName(){
				
					return "RESERVATION_MANDATORY";
				
				}

				
			    public String IS_FIRM_PREDEFINED_NODE;

				public String getIS_FIRM_PREDEFINED_NODE () {
					return this.IS_FIRM_PREDEFINED_NODE;
				}

				public Boolean IS_FIRM_PREDEFINED_NODEIsNullable(){
				    return false;
				}
				public Boolean IS_FIRM_PREDEFINED_NODEIsKey(){
				    return false;
				}
				public Integer IS_FIRM_PREDEFINED_NODELength(){
				    return null;
				}
				public Integer IS_FIRM_PREDEFINED_NODEPrecision(){
				    return null;
				}
				public String IS_FIRM_PREDEFINED_NODEDefault(){
				
					return null;
				
				}
				public String IS_FIRM_PREDEFINED_NODEComment(){
				
				    return "";
				
				}
				public String IS_FIRM_PREDEFINED_NODEPattern(){
				
					return "";
				
				}
				public String IS_FIRM_PREDEFINED_NODEOriginalDbColumnName(){
				
					return "IS_FIRM_PREDEFINED_NODE";
				
				}

				
			    public String INTENTIONAL_BACKORDER;

				public String getINTENTIONAL_BACKORDER () {
					return this.INTENTIONAL_BACKORDER;
				}

				public Boolean INTENTIONAL_BACKORDERIsNullable(){
				    return false;
				}
				public Boolean INTENTIONAL_BACKORDERIsKey(){
				    return false;
				}
				public Integer INTENTIONAL_BACKORDERLength(){
				    return null;
				}
				public Integer INTENTIONAL_BACKORDERPrecision(){
				    return null;
				}
				public String INTENTIONAL_BACKORDERDefault(){
				
					return null;
				
				}
				public String INTENTIONAL_BACKORDERComment(){
				
				    return "";
				
				}
				public String INTENTIONAL_BACKORDERPattern(){
				
					return "";
				
				}
				public String INTENTIONAL_BACKORDEROriginalDbColumnName(){
				
					return "INTENTIONAL_BACKORDER";
				
				}

				
			    public java.util.Date FUTURE_AVAIL_DATE;

				public java.util.Date getFUTURE_AVAIL_DATE () {
					return this.FUTURE_AVAIL_DATE;
				}

				public Boolean FUTURE_AVAIL_DATEIsNullable(){
				    return true;
				}
				public Boolean FUTURE_AVAIL_DATEIsKey(){
				    return false;
				}
				public Integer FUTURE_AVAIL_DATELength(){
				    return null;
				}
				public Integer FUTURE_AVAIL_DATEPrecision(){
				    return null;
				}
				public String FUTURE_AVAIL_DATEDefault(){
				
					return null;
				
				}
				public String FUTURE_AVAIL_DATEComment(){
				
				    return "";
				
				}
				public String FUTURE_AVAIL_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String FUTURE_AVAIL_DATEOriginalDbColumnName(){
				
					return "FUTURE_AVAIL_DATE";
				
				}

				
			    public BigDecimal REPRICING_QUANTITY;

				public BigDecimal getREPRICING_QUANTITY () {
					return this.REPRICING_QUANTITY;
				}

				public Boolean REPRICING_QUANTITYIsNullable(){
				    return true;
				}
				public Boolean REPRICING_QUANTITYIsKey(){
				    return false;
				}
				public Integer REPRICING_QUANTITYLength(){
				    return null;
				}
				public Integer REPRICING_QUANTITYPrecision(){
				    return null;
				}
				public String REPRICING_QUANTITYDefault(){
				
					return "";
				
				}
				public String REPRICING_QUANTITYComment(){
				
				    return "";
				
				}
				public String REPRICING_QUANTITYPattern(){
				
					return "";
				
				}
				public String REPRICING_QUANTITYOriginalDbColumnName(){
				
					return "REPRICING_QUANTITY";
				
				}

				
			    public java.util.Date MIN_SHIP_BY_DATE;

				public java.util.Date getMIN_SHIP_BY_DATE () {
					return this.MIN_SHIP_BY_DATE;
				}

				public Boolean MIN_SHIP_BY_DATEIsNullable(){
				    return true;
				}
				public Boolean MIN_SHIP_BY_DATEIsKey(){
				    return false;
				}
				public Integer MIN_SHIP_BY_DATELength(){
				    return null;
				}
				public Integer MIN_SHIP_BY_DATEPrecision(){
				    return null;
				}
				public String MIN_SHIP_BY_DATEDefault(){
				
					return null;
				
				}
				public String MIN_SHIP_BY_DATEComment(){
				
				    return "";
				
				}
				public String MIN_SHIP_BY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String MIN_SHIP_BY_DATEOriginalDbColumnName(){
				
					return "MIN_SHIP_BY_DATE";
				
				}

				
			    public BigDecimal KIT_QTY;

				public BigDecimal getKIT_QTY () {
					return this.KIT_QTY;
				}

				public Boolean KIT_QTYIsNullable(){
				    return true;
				}
				public Boolean KIT_QTYIsKey(){
				    return false;
				}
				public Integer KIT_QTYLength(){
				    return null;
				}
				public Integer KIT_QTYPrecision(){
				    return null;
				}
				public String KIT_QTYDefault(){
				
					return "";
				
				}
				public String KIT_QTYComment(){
				
				    return "";
				
				}
				public String KIT_QTYPattern(){
				
					return "";
				
				}
				public String KIT_QTYOriginalDbColumnName(){
				
					return "KIT_QTY";
				
				}

				
			    public String BOM_CONFIG_KEY;

				public String getBOM_CONFIG_KEY () {
					return this.BOM_CONFIG_KEY;
				}

				public Boolean BOM_CONFIG_KEYIsNullable(){
				    return true;
				}
				public Boolean BOM_CONFIG_KEYIsKey(){
				    return false;
				}
				public Integer BOM_CONFIG_KEYLength(){
				    return null;
				}
				public Integer BOM_CONFIG_KEYPrecision(){
				    return null;
				}
				public String BOM_CONFIG_KEYDefault(){
				
					return null;
				
				}
				public String BOM_CONFIG_KEYComment(){
				
				    return "";
				
				}
				public String BOM_CONFIG_KEYPattern(){
				
					return "";
				
				}
				public String BOM_CONFIG_KEYOriginalDbColumnName(){
				
					return "BOM_CONFIG_KEY";
				
				}

				
			    public String BUNDLE_FULFILLMENT_MODE;

				public String getBUNDLE_FULFILLMENT_MODE () {
					return this.BUNDLE_FULFILLMENT_MODE;
				}

				public Boolean BUNDLE_FULFILLMENT_MODEIsNullable(){
				    return true;
				}
				public Boolean BUNDLE_FULFILLMENT_MODEIsKey(){
				    return false;
				}
				public Integer BUNDLE_FULFILLMENT_MODELength(){
				    return null;
				}
				public Integer BUNDLE_FULFILLMENT_MODEPrecision(){
				    return null;
				}
				public String BUNDLE_FULFILLMENT_MODEDefault(){
				
					return null;
				
				}
				public String BUNDLE_FULFILLMENT_MODEComment(){
				
				    return "";
				
				}
				public String BUNDLE_FULFILLMENT_MODEPattern(){
				
					return "";
				
				}
				public String BUNDLE_FULFILLMENT_MODEOriginalDbColumnName(){
				
					return "BUNDLE_FULFILLMENT_MODE";
				
				}

				
			    public String IS_GIFT_WRAP;

				public String getIS_GIFT_WRAP () {
					return this.IS_GIFT_WRAP;
				}

				public Boolean IS_GIFT_WRAPIsNullable(){
				    return true;
				}
				public Boolean IS_GIFT_WRAPIsKey(){
				    return false;
				}
				public Integer IS_GIFT_WRAPLength(){
				    return null;
				}
				public Integer IS_GIFT_WRAPPrecision(){
				    return null;
				}
				public String IS_GIFT_WRAPDefault(){
				
					return null;
				
				}
				public String IS_GIFT_WRAPComment(){
				
				    return "";
				
				}
				public String IS_GIFT_WRAPPattern(){
				
					return "";
				
				}
				public String IS_GIFT_WRAPOriginalDbColumnName(){
				
					return "IS_GIFT_WRAP";
				
				}

				
			    public BigDecimal GROUP_SEQUENCE_NUM;

				public BigDecimal getGROUP_SEQUENCE_NUM () {
					return this.GROUP_SEQUENCE_NUM;
				}

				public Boolean GROUP_SEQUENCE_NUMIsNullable(){
				    return true;
				}
				public Boolean GROUP_SEQUENCE_NUMIsKey(){
				    return false;
				}
				public Integer GROUP_SEQUENCE_NUMLength(){
				    return null;
				}
				public Integer GROUP_SEQUENCE_NUMPrecision(){
				    return null;
				}
				public String GROUP_SEQUENCE_NUMDefault(){
				
					return "";
				
				}
				public String GROUP_SEQUENCE_NUMComment(){
				
				    return "";
				
				}
				public String GROUP_SEQUENCE_NUMPattern(){
				
					return "";
				
				}
				public String GROUP_SEQUENCE_NUMOriginalDbColumnName(){
				
					return "GROUP_SEQUENCE_NUM";
				
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
				
					return null;
				
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

				
			    public String ITEM_NOT_EXIST;

				public String getITEM_NOT_EXIST () {
					return this.ITEM_NOT_EXIST;
				}

				public Boolean ITEM_NOT_EXISTIsNullable(){
				    return true;
				}
				public Boolean ITEM_NOT_EXISTIsKey(){
				    return false;
				}
				public Integer ITEM_NOT_EXISTLength(){
				    return null;
				}
				public Integer ITEM_NOT_EXISTPrecision(){
				    return null;
				}
				public String ITEM_NOT_EXISTDefault(){
				
					return null;
				
				}
				public String ITEM_NOT_EXISTComment(){
				
				    return "";
				
				}
				public String ITEM_NOT_EXISTPattern(){
				
					return "";
				
				}
				public String ITEM_NOT_EXISTOriginalDbColumnName(){
				
					return "ITEM_NOT_EXIST";
				
				}

				
			    public BigDecimal BACKORDER_NOTIFICATION_QTY;

				public BigDecimal getBACKORDER_NOTIFICATION_QTY () {
					return this.BACKORDER_NOTIFICATION_QTY;
				}

				public Boolean BACKORDER_NOTIFICATION_QTYIsNullable(){
				    return true;
				}
				public Boolean BACKORDER_NOTIFICATION_QTYIsKey(){
				    return false;
				}
				public Integer BACKORDER_NOTIFICATION_QTYLength(){
				    return null;
				}
				public Integer BACKORDER_NOTIFICATION_QTYPrecision(){
				    return null;
				}
				public String BACKORDER_NOTIFICATION_QTYDefault(){
				
					return "";
				
				}
				public String BACKORDER_NOTIFICATION_QTYComment(){
				
				    return "";
				
				}
				public String BACKORDER_NOTIFICATION_QTYPattern(){
				
					return "";
				
				}
				public String BACKORDER_NOTIFICATION_QTYOriginalDbColumnName(){
				
					return "BACKORDER_NOTIFICATION_QTY";
				
				}

				
			    public String IS_PRICE_MATCHED;

				public String getIS_PRICE_MATCHED () {
					return this.IS_PRICE_MATCHED;
				}

				public Boolean IS_PRICE_MATCHEDIsNullable(){
				    return true;
				}
				public Boolean IS_PRICE_MATCHEDIsKey(){
				    return false;
				}
				public Integer IS_PRICE_MATCHEDLength(){
				    return null;
				}
				public Integer IS_PRICE_MATCHEDPrecision(){
				    return null;
				}
				public String IS_PRICE_MATCHEDDefault(){
				
					return null;
				
				}
				public String IS_PRICE_MATCHEDComment(){
				
				    return "";
				
				}
				public String IS_PRICE_MATCHEDPattern(){
				
					return "";
				
				}
				public String IS_PRICE_MATCHEDOriginalDbColumnName(){
				
					return "IS_PRICE_MATCHED";
				
				}

				
			    public String IS_PICK_UP_NOW;

				public String getIS_PICK_UP_NOW () {
					return this.IS_PICK_UP_NOW;
				}

				public Boolean IS_PICK_UP_NOWIsNullable(){
				    return true;
				}
				public Boolean IS_PICK_UP_NOWIsKey(){
				    return false;
				}
				public Integer IS_PICK_UP_NOWLength(){
				    return null;
				}
				public Integer IS_PICK_UP_NOWPrecision(){
				    return null;
				}
				public String IS_PICK_UP_NOWDefault(){
				
					return null;
				
				}
				public String IS_PICK_UP_NOWComment(){
				
				    return "";
				
				}
				public String IS_PICK_UP_NOWPattern(){
				
					return "";
				
				}
				public String IS_PICK_UP_NOWOriginalDbColumnName(){
				
					return "IS_PICK_UP_NOW";
				
				}

				
			    public String ITEM_IS_IN_HAND;

				public String getITEM_IS_IN_HAND () {
					return this.ITEM_IS_IN_HAND;
				}

				public Boolean ITEM_IS_IN_HANDIsNullable(){
				    return true;
				}
				public Boolean ITEM_IS_IN_HANDIsKey(){
				    return false;
				}
				public Integer ITEM_IS_IN_HANDLength(){
				    return null;
				}
				public Integer ITEM_IS_IN_HANDPrecision(){
				    return null;
				}
				public String ITEM_IS_IN_HANDDefault(){
				
					return null;
				
				}
				public String ITEM_IS_IN_HANDComment(){
				
				    return "";
				
				}
				public String ITEM_IS_IN_HANDPattern(){
				
					return "";
				
				}
				public String ITEM_IS_IN_HANDOriginalDbColumnName(){
				
					return "ITEM_IS_IN_HAND";
				
				}

				
			    public String DISPOSITION_CODE;

				public String getDISPOSITION_CODE () {
					return this.DISPOSITION_CODE;
				}

				public Boolean DISPOSITION_CODEIsNullable(){
				    return true;
				}
				public Boolean DISPOSITION_CODEIsKey(){
				    return false;
				}
				public Integer DISPOSITION_CODELength(){
				    return null;
				}
				public Integer DISPOSITION_CODEPrecision(){
				    return null;
				}
				public String DISPOSITION_CODEDefault(){
				
					return null;
				
				}
				public String DISPOSITION_CODEComment(){
				
				    return "";
				
				}
				public String DISPOSITION_CODEPattern(){
				
					return "";
				
				}
				public String DISPOSITION_CODEOriginalDbColumnName(){
				
					return "DISPOSITION_CODE";
				
				}

				
			    public String EXTN_PUBLISHED;

				public String getEXTN_PUBLISHED () {
					return this.EXTN_PUBLISHED;
				}

				public Boolean EXTN_PUBLISHEDIsNullable(){
				    return true;
				}
				public Boolean EXTN_PUBLISHEDIsKey(){
				    return false;
				}
				public Integer EXTN_PUBLISHEDLength(){
				    return null;
				}
				public Integer EXTN_PUBLISHEDPrecision(){
				    return null;
				}
				public String EXTN_PUBLISHEDDefault(){
				
					return null;
				
				}
				public String EXTN_PUBLISHEDComment(){
				
				    return "";
				
				}
				public String EXTN_PUBLISHEDPattern(){
				
					return "";
				
				}
				public String EXTN_PUBLISHEDOriginalDbColumnName(){
				
					return "EXTN_PUBLISHED";
				
				}

				
			    public String EXTN_LINE_TOTAL;

				public String getEXTN_LINE_TOTAL () {
					return this.EXTN_LINE_TOTAL;
				}

				public Boolean EXTN_LINE_TOTALIsNullable(){
				    return true;
				}
				public Boolean EXTN_LINE_TOTALIsKey(){
				    return false;
				}
				public Integer EXTN_LINE_TOTALLength(){
				    return null;
				}
				public Integer EXTN_LINE_TOTALPrecision(){
				    return null;
				}
				public String EXTN_LINE_TOTALDefault(){
				
					return null;
				
				}
				public String EXTN_LINE_TOTALComment(){
				
				    return "";
				
				}
				public String EXTN_LINE_TOTALPattern(){
				
					return "";
				
				}
				public String EXTN_LINE_TOTALOriginalDbColumnName(){
				
					return "EXTN_LINE_TOTAL";
				
				}

				
			    public String EXTN_ORDERED_QTY;

				public String getEXTN_ORDERED_QTY () {
					return this.EXTN_ORDERED_QTY;
				}

				public Boolean EXTN_ORDERED_QTYIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORDERED_QTYIsKey(){
				    return false;
				}
				public Integer EXTN_ORDERED_QTYLength(){
				    return null;
				}
				public Integer EXTN_ORDERED_QTYPrecision(){
				    return null;
				}
				public String EXTN_ORDERED_QTYDefault(){
				
					return null;
				
				}
				public String EXTN_ORDERED_QTYComment(){
				
				    return "";
				
				}
				public String EXTN_ORDERED_QTYPattern(){
				
					return "";
				
				}
				public String EXTN_ORDERED_QTYOriginalDbColumnName(){
				
					return "EXTN_ORDERED_QTY";
				
				}

				
			    public String EXTN_SHIP_METHOD;

				public String getEXTN_SHIP_METHOD () {
					return this.EXTN_SHIP_METHOD;
				}

				public Boolean EXTN_SHIP_METHODIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIP_METHODIsKey(){
				    return false;
				}
				public Integer EXTN_SHIP_METHODLength(){
				    return null;
				}
				public Integer EXTN_SHIP_METHODPrecision(){
				    return null;
				}
				public String EXTN_SHIP_METHODDefault(){
				
					return null;
				
				}
				public String EXTN_SHIP_METHODComment(){
				
				    return "";
				
				}
				public String EXTN_SHIP_METHODPattern(){
				
					return "";
				
				}
				public String EXTN_SHIP_METHODOriginalDbColumnName(){
				
					return "EXTN_SHIP_METHOD";
				
				}

				
			    public String EXTN_PRICE_MOD;

				public String getEXTN_PRICE_MOD () {
					return this.EXTN_PRICE_MOD;
				}

				public Boolean EXTN_PRICE_MODIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MODIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MODLength(){
				    return null;
				}
				public Integer EXTN_PRICE_MODPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MODDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MODComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MODPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MODOriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD";
				
				}

				
			    public String EXTN_PRICE_MOD_DESC;

				public String getEXTN_PRICE_MOD_DESC () {
					return this.EXTN_PRICE_MOD_DESC;
				}

				public Boolean EXTN_PRICE_MOD_DESCIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MOD_DESCIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MOD_DESCLength(){
				    return null;
				}
				public Integer EXTN_PRICE_MOD_DESCPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MOD_DESCDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MOD_DESCComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MOD_DESCPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MOD_DESCOriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD_DESC";
				
				}

				
			    public String EXTN_PRICE_MOD_TYPE;

				public String getEXTN_PRICE_MOD_TYPE () {
					return this.EXTN_PRICE_MOD_TYPE;
				}

				public Boolean EXTN_PRICE_MOD_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MOD_TYPEIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MOD_TYPELength(){
				    return null;
				}
				public Integer EXTN_PRICE_MOD_TYPEPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MOD_TYPEDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MOD_TYPEComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MOD_TYPEPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MOD_TYPEOriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD_TYPE";
				
				}

				
			    public String EXTN_PRICE_MOD_CODE;

				public String getEXTN_PRICE_MOD_CODE () {
					return this.EXTN_PRICE_MOD_CODE;
				}

				public Boolean EXTN_PRICE_MOD_CODEIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MOD_CODEIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MOD_CODELength(){
				    return null;
				}
				public Integer EXTN_PRICE_MOD_CODEPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MOD_CODEDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MOD_CODEComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MOD_CODEPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MOD_CODEOriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD_CODE";
				
				}

				
			    public String EXTN_PRICE_MOD_DIV;

				public String getEXTN_PRICE_MOD_DIV () {
					return this.EXTN_PRICE_MOD_DIV;
				}

				public Boolean EXTN_PRICE_MOD_DIVIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MOD_DIVIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MOD_DIVLength(){
				    return null;
				}
				public Integer EXTN_PRICE_MOD_DIVPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MOD_DIVDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MOD_DIVComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MOD_DIVPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MOD_DIVOriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD_DIV";
				
				}

				
			    public String EXTN_PRICE_MOD_CODE_STR;

				public String getEXTN_PRICE_MOD_CODE_STR () {
					return this.EXTN_PRICE_MOD_CODE_STR;
				}

				public Boolean EXTN_PRICE_MOD_CODE_STRIsNullable(){
				    return true;
				}
				public Boolean EXTN_PRICE_MOD_CODE_STRIsKey(){
				    return false;
				}
				public Integer EXTN_PRICE_MOD_CODE_STRLength(){
				    return null;
				}
				public Integer EXTN_PRICE_MOD_CODE_STRPrecision(){
				    return null;
				}
				public String EXTN_PRICE_MOD_CODE_STRDefault(){
				
					return null;
				
				}
				public String EXTN_PRICE_MOD_CODE_STRComment(){
				
				    return "";
				
				}
				public String EXTN_PRICE_MOD_CODE_STRPattern(){
				
					return "";
				
				}
				public String EXTN_PRICE_MOD_CODE_STROriginalDbColumnName(){
				
					return "EXTN_PRICE_MOD_CODE_STR";
				
				}

				
			    public BigDecimal EXTN_ORIG_UNITPRICE;

				public BigDecimal getEXTN_ORIG_UNITPRICE () {
					return this.EXTN_ORIG_UNITPRICE;
				}

				public Boolean EXTN_ORIG_UNITPRICEIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORIG_UNITPRICEIsKey(){
				    return false;
				}
				public Integer EXTN_ORIG_UNITPRICELength(){
				    return null;
				}
				public Integer EXTN_ORIG_UNITPRICEPrecision(){
				    return null;
				}
				public String EXTN_ORIG_UNITPRICEDefault(){
				
					return "";
				
				}
				public String EXTN_ORIG_UNITPRICEComment(){
				
				    return "";
				
				}
				public String EXTN_ORIG_UNITPRICEPattern(){
				
					return "";
				
				}
				public String EXTN_ORIG_UNITPRICEOriginalDbColumnName(){
				
					return "EXTN_ORIG_UNITPRICE";
				
				}

				
			    public String EXTN_REVIEW;

				public String getEXTN_REVIEW () {
					return this.EXTN_REVIEW;
				}

				public Boolean EXTN_REVIEWIsNullable(){
				    return true;
				}
				public Boolean EXTN_REVIEWIsKey(){
				    return false;
				}
				public Integer EXTN_REVIEWLength(){
				    return null;
				}
				public Integer EXTN_REVIEWPrecision(){
				    return null;
				}
				public String EXTN_REVIEWDefault(){
				
					return null;
				
				}
				public String EXTN_REVIEWComment(){
				
				    return "";
				
				}
				public String EXTN_REVIEWPattern(){
				
					return "";
				
				}
				public String EXTN_REVIEWOriginalDbColumnName(){
				
					return "EXTN_REVIEW";
				
				}

				
			    public String EXTN_LAST_PICK_DATE;

				public String getEXTN_LAST_PICK_DATE () {
					return this.EXTN_LAST_PICK_DATE;
				}

				public Boolean EXTN_LAST_PICK_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_LAST_PICK_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_LAST_PICK_DATELength(){
				    return null;
				}
				public Integer EXTN_LAST_PICK_DATEPrecision(){
				    return null;
				}
				public String EXTN_LAST_PICK_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_LAST_PICK_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_LAST_PICK_DATEPattern(){
				
					return "";
				
				}
				public String EXTN_LAST_PICK_DATEOriginalDbColumnName(){
				
					return "EXTN_LAST_PICK_DATE";
				
				}

				
			    public String EXTN_PICK_DATE;

				public String getEXTN_PICK_DATE () {
					return this.EXTN_PICK_DATE;
				}

				public Boolean EXTN_PICK_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_PICK_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_PICK_DATELength(){
				    return null;
				}
				public Integer EXTN_PICK_DATEPrecision(){
				    return null;
				}
				public String EXTN_PICK_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_PICK_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_PICK_DATEPattern(){
				
					return "";
				
				}
				public String EXTN_PICK_DATEOriginalDbColumnName(){
				
					return "EXTN_PICK_DATE";
				
				}

				
			    public String EXTN_RELEASE_ID;

				public String getEXTN_RELEASE_ID () {
					return this.EXTN_RELEASE_ID;
				}

				public Boolean EXTN_RELEASE_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_RELEASE_IDIsKey(){
				    return false;
				}
				public Integer EXTN_RELEASE_IDLength(){
				    return null;
				}
				public Integer EXTN_RELEASE_IDPrecision(){
				    return null;
				}
				public String EXTN_RELEASE_IDDefault(){
				
					return null;
				
				}
				public String EXTN_RELEASE_IDComment(){
				
				    return "";
				
				}
				public String EXTN_RELEASE_IDPattern(){
				
					return "";
				
				}
				public String EXTN_RELEASE_IDOriginalDbColumnName(){
				
					return "EXTN_RELEASE_ID";
				
				}

				
			    public String EXTN_AVG_RATING;

				public String getEXTN_AVG_RATING () {
					return this.EXTN_AVG_RATING;
				}

				public Boolean EXTN_AVG_RATINGIsNullable(){
				    return true;
				}
				public Boolean EXTN_AVG_RATINGIsKey(){
				    return false;
				}
				public Integer EXTN_AVG_RATINGLength(){
				    return null;
				}
				public Integer EXTN_AVG_RATINGPrecision(){
				    return null;
				}
				public String EXTN_AVG_RATINGDefault(){
				
					return null;
				
				}
				public String EXTN_AVG_RATINGComment(){
				
				    return "";
				
				}
				public String EXTN_AVG_RATINGPattern(){
				
					return "";
				
				}
				public String EXTN_AVG_RATINGOriginalDbColumnName(){
				
					return "EXTN_AVG_RATING";
				
				}

				
			    public String EXTN_DESCRIPTION;

				public String getEXTN_DESCRIPTION () {
					return this.EXTN_DESCRIPTION;
				}

				public Boolean EXTN_DESCRIPTIONIsNullable(){
				    return true;
				}
				public Boolean EXTN_DESCRIPTIONIsKey(){
				    return false;
				}
				public Integer EXTN_DESCRIPTIONLength(){
				    return null;
				}
				public Integer EXTN_DESCRIPTIONPrecision(){
				    return null;
				}
				public String EXTN_DESCRIPTIONDefault(){
				
					return null;
				
				}
				public String EXTN_DESCRIPTIONComment(){
				
				    return "";
				
				}
				public String EXTN_DESCRIPTIONPattern(){
				
					return "";
				
				}
				public String EXTN_DESCRIPTIONOriginalDbColumnName(){
				
					return "EXTN_DESCRIPTION";
				
				}

				
			    public String EXTN_ACT_ITEM_ID;

				public String getEXTN_ACT_ITEM_ID () {
					return this.EXTN_ACT_ITEM_ID;
				}

				public Boolean EXTN_ACT_ITEM_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_ACT_ITEM_IDIsKey(){
				    return false;
				}
				public Integer EXTN_ACT_ITEM_IDLength(){
				    return null;
				}
				public Integer EXTN_ACT_ITEM_IDPrecision(){
				    return null;
				}
				public String EXTN_ACT_ITEM_IDDefault(){
				
					return null;
				
				}
				public String EXTN_ACT_ITEM_IDComment(){
				
				    return "";
				
				}
				public String EXTN_ACT_ITEM_IDPattern(){
				
					return "";
				
				}
				public String EXTN_ACT_ITEM_IDOriginalDbColumnName(){
				
					return "EXTN_ACT_ITEM_ID";
				
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
				
					return null;
				
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

				
			    public String DERIVED_FROM_EXT_ORD;

				public String getDERIVED_FROM_EXT_ORD () {
					return this.DERIVED_FROM_EXT_ORD;
				}

				public Boolean DERIVED_FROM_EXT_ORDIsNullable(){
				    return true;
				}
				public Boolean DERIVED_FROM_EXT_ORDIsKey(){
				    return false;
				}
				public Integer DERIVED_FROM_EXT_ORDLength(){
				    return null;
				}
				public Integer DERIVED_FROM_EXT_ORDPrecision(){
				    return null;
				}
				public String DERIVED_FROM_EXT_ORDDefault(){
				
					return null;
				
				}
				public String DERIVED_FROM_EXT_ORDComment(){
				
				    return "";
				
				}
				public String DERIVED_FROM_EXT_ORDPattern(){
				
					return "";
				
				}
				public String DERIVED_FROM_EXT_ORDOriginalDbColumnName(){
				
					return "DERIVED_FROM_EXT_ORD";
				
				}

				
			    public String IS_ELIGIBLE_FOR_SHIP_DISC;

				public String getIS_ELIGIBLE_FOR_SHIP_DISC () {
					return this.IS_ELIGIBLE_FOR_SHIP_DISC;
				}

				public Boolean IS_ELIGIBLE_FOR_SHIP_DISCIsNullable(){
				    return true;
				}
				public Boolean IS_ELIGIBLE_FOR_SHIP_DISCIsKey(){
				    return false;
				}
				public Integer IS_ELIGIBLE_FOR_SHIP_DISCLength(){
				    return null;
				}
				public Integer IS_ELIGIBLE_FOR_SHIP_DISCPrecision(){
				    return null;
				}
				public String IS_ELIGIBLE_FOR_SHIP_DISCDefault(){
				
					return null;
				
				}
				public String IS_ELIGIBLE_FOR_SHIP_DISCComment(){
				
				    return "";
				
				}
				public String IS_ELIGIBLE_FOR_SHIP_DISCPattern(){
				
					return "";
				
				}
				public String IS_ELIGIBLE_FOR_SHIP_DISCOriginalDbColumnName(){
				
					return "IS_ELIGIBLE_FOR_SHIP_DISC";
				
				}

				
			    public String EXTN_SIGN_TYPE;

				public String getEXTN_SIGN_TYPE () {
					return this.EXTN_SIGN_TYPE;
				}

				public Boolean EXTN_SIGN_TYPEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SIGN_TYPEIsKey(){
				    return false;
				}
				public Integer EXTN_SIGN_TYPELength(){
				    return null;
				}
				public Integer EXTN_SIGN_TYPEPrecision(){
				    return null;
				}
				public String EXTN_SIGN_TYPEDefault(){
				
					return null;
				
				}
				public String EXTN_SIGN_TYPEComment(){
				
				    return "";
				
				}
				public String EXTN_SIGN_TYPEPattern(){
				
					return "";
				
				}
				public String EXTN_SIGN_TYPEOriginalDbColumnName(){
				
					return "EXTN_SIGN_TYPE";
				
				}

				
			    public BigDecimal EXTN_MKTPLACE_SHIP_AMT;

				public BigDecimal getEXTN_MKTPLACE_SHIP_AMT () {
					return this.EXTN_MKTPLACE_SHIP_AMT;
				}

				public Boolean EXTN_MKTPLACE_SHIP_AMTIsNullable(){
				    return true;
				}
				public Boolean EXTN_MKTPLACE_SHIP_AMTIsKey(){
				    return false;
				}
				public Integer EXTN_MKTPLACE_SHIP_AMTLength(){
				    return null;
				}
				public Integer EXTN_MKTPLACE_SHIP_AMTPrecision(){
				    return null;
				}
				public String EXTN_MKTPLACE_SHIP_AMTDefault(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_AMTComment(){
				
				    return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_AMTPattern(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_AMTOriginalDbColumnName(){
				
					return "EXTN_MKTPLACE_SHIP_AMT";
				
				}

				
			    public BigDecimal EXTN_MKTPLACE_SHIP_DISC;

				public BigDecimal getEXTN_MKTPLACE_SHIP_DISC () {
					return this.EXTN_MKTPLACE_SHIP_DISC;
				}

				public Boolean EXTN_MKTPLACE_SHIP_DISCIsNullable(){
				    return true;
				}
				public Boolean EXTN_MKTPLACE_SHIP_DISCIsKey(){
				    return false;
				}
				public Integer EXTN_MKTPLACE_SHIP_DISCLength(){
				    return null;
				}
				public Integer EXTN_MKTPLACE_SHIP_DISCPrecision(){
				    return null;
				}
				public String EXTN_MKTPLACE_SHIP_DISCDefault(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_DISCComment(){
				
				    return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_DISCPattern(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_DISCOriginalDbColumnName(){
				
					return "EXTN_MKTPLACE_SHIP_DISC";
				
				}

				
			    public BigDecimal EXTN_MKTPLACE_SHIP_TAX;

				public BigDecimal getEXTN_MKTPLACE_SHIP_TAX () {
					return this.EXTN_MKTPLACE_SHIP_TAX;
				}

				public Boolean EXTN_MKTPLACE_SHIP_TAXIsNullable(){
				    return true;
				}
				public Boolean EXTN_MKTPLACE_SHIP_TAXIsKey(){
				    return false;
				}
				public Integer EXTN_MKTPLACE_SHIP_TAXLength(){
				    return null;
				}
				public Integer EXTN_MKTPLACE_SHIP_TAXPrecision(){
				    return null;
				}
				public String EXTN_MKTPLACE_SHIP_TAXDefault(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_TAXComment(){
				
				    return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_TAXPattern(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_SHIP_TAXOriginalDbColumnName(){
				
					return "EXTN_MKTPLACE_SHIP_TAX";
				
				}

				
			    public BigDecimal EXTN_MKTPLACE_COMMISSION;

				public BigDecimal getEXTN_MKTPLACE_COMMISSION () {
					return this.EXTN_MKTPLACE_COMMISSION;
				}

				public Boolean EXTN_MKTPLACE_COMMISSIONIsNullable(){
				    return true;
				}
				public Boolean EXTN_MKTPLACE_COMMISSIONIsKey(){
				    return false;
				}
				public Integer EXTN_MKTPLACE_COMMISSIONLength(){
				    return null;
				}
				public Integer EXTN_MKTPLACE_COMMISSIONPrecision(){
				    return null;
				}
				public String EXTN_MKTPLACE_COMMISSIONDefault(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_COMMISSIONComment(){
				
				    return "";
				
				}
				public String EXTN_MKTPLACE_COMMISSIONPattern(){
				
					return "";
				
				}
				public String EXTN_MKTPLACE_COMMISSIONOriginalDbColumnName(){
				
					return "EXTN_MKTPLACE_COMMISSION";
				
				}

				
			    public String EXTN_IS_GWP;

				public String getEXTN_IS_GWP () {
					return this.EXTN_IS_GWP;
				}

				public Boolean EXTN_IS_GWPIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_GWPIsKey(){
				    return false;
				}
				public Integer EXTN_IS_GWPLength(){
				    return null;
				}
				public Integer EXTN_IS_GWPPrecision(){
				    return null;
				}
				public String EXTN_IS_GWPDefault(){
				
					return null;
				
				}
				public String EXTN_IS_GWPComment(){
				
				    return "";
				
				}
				public String EXTN_IS_GWPPattern(){
				
					return "";
				
				}
				public String EXTN_IS_GWPOriginalDbColumnName(){
				
					return "EXTN_IS_GWP";
				
				}

				
			    public String EXTN_CHANNEL_ITEM_ID;

				public String getEXTN_CHANNEL_ITEM_ID () {
					return this.EXTN_CHANNEL_ITEM_ID;
				}

				public Boolean EXTN_CHANNEL_ITEM_IDIsNullable(){
				    return true;
				}
				public Boolean EXTN_CHANNEL_ITEM_IDIsKey(){
				    return false;
				}
				public Integer EXTN_CHANNEL_ITEM_IDLength(){
				    return null;
				}
				public Integer EXTN_CHANNEL_ITEM_IDPrecision(){
				    return null;
				}
				public String EXTN_CHANNEL_ITEM_IDDefault(){
				
					return null;
				
				}
				public String EXTN_CHANNEL_ITEM_IDComment(){
				
				    return "";
				
				}
				public String EXTN_CHANNEL_ITEM_IDPattern(){
				
					return "";
				
				}
				public String EXTN_CHANNEL_ITEM_IDOriginalDbColumnName(){
				
					return "EXTN_CHANNEL_ITEM_ID";
				
				}

				
			    public String EXTN_ORIGINAL_TRACKING_NO;

				public String getEXTN_ORIGINAL_TRACKING_NO () {
					return this.EXTN_ORIGINAL_TRACKING_NO;
				}

				public Boolean EXTN_ORIGINAL_TRACKING_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_ORIGINAL_TRACKING_NOIsKey(){
				    return false;
				}
				public Integer EXTN_ORIGINAL_TRACKING_NOLength(){
				    return null;
				}
				public Integer EXTN_ORIGINAL_TRACKING_NOPrecision(){
				    return null;
				}
				public String EXTN_ORIGINAL_TRACKING_NODefault(){
				
					return null;
				
				}
				public String EXTN_ORIGINAL_TRACKING_NOComment(){
				
				    return "";
				
				}
				public String EXTN_ORIGINAL_TRACKING_NOPattern(){
				
					return "";
				
				}
				public String EXTN_ORIGINAL_TRACKING_NOOriginalDbColumnName(){
				
					return "EXTN_ORIGINAL_TRACKING_NO";
				
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
				
					return null;
				
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

				
			    public String EXTN_SDK_LINE;

				public String getEXTN_SDK_LINE () {
					return this.EXTN_SDK_LINE;
				}

				public Boolean EXTN_SDK_LINEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SDK_LINEIsKey(){
				    return false;
				}
				public Integer EXTN_SDK_LINELength(){
				    return null;
				}
				public Integer EXTN_SDK_LINEPrecision(){
				    return null;
				}
				public String EXTN_SDK_LINEDefault(){
				
					return null;
				
				}
				public String EXTN_SDK_LINEComment(){
				
				    return "";
				
				}
				public String EXTN_SDK_LINEPattern(){
				
					return "";
				
				}
				public String EXTN_SDK_LINEOriginalDbColumnName(){
				
					return "EXTN_SDK_LINE";
				
				}

				
			    public String EXTN_TOTAL_DISCOUNT;

				public String getEXTN_TOTAL_DISCOUNT () {
					return this.EXTN_TOTAL_DISCOUNT;
				}

				public Boolean EXTN_TOTAL_DISCOUNTIsNullable(){
				    return true;
				}
				public Boolean EXTN_TOTAL_DISCOUNTIsKey(){
				    return false;
				}
				public Integer EXTN_TOTAL_DISCOUNTLength(){
				    return null;
				}
				public Integer EXTN_TOTAL_DISCOUNTPrecision(){
				    return null;
				}
				public String EXTN_TOTAL_DISCOUNTDefault(){
				
					return null;
				
				}
				public String EXTN_TOTAL_DISCOUNTComment(){
				
				    return "";
				
				}
				public String EXTN_TOTAL_DISCOUNTPattern(){
				
					return "";
				
				}
				public String EXTN_TOTAL_DISCOUNTOriginalDbColumnName(){
				
					return "EXTN_TOTAL_DISCOUNT";
				
				}

				
			    public String EXTN_TOTAL_TAX;

				public String getEXTN_TOTAL_TAX () {
					return this.EXTN_TOTAL_TAX;
				}

				public Boolean EXTN_TOTAL_TAXIsNullable(){
				    return true;
				}
				public Boolean EXTN_TOTAL_TAXIsKey(){
				    return false;
				}
				public Integer EXTN_TOTAL_TAXLength(){
				    return null;
				}
				public Integer EXTN_TOTAL_TAXPrecision(){
				    return null;
				}
				public String EXTN_TOTAL_TAXDefault(){
				
					return null;
				
				}
				public String EXTN_TOTAL_TAXComment(){
				
				    return "";
				
				}
				public String EXTN_TOTAL_TAXPattern(){
				
					return "";
				
				}
				public String EXTN_TOTAL_TAXOriginalDbColumnName(){
				
					return "EXTN_TOTAL_TAX";
				
				}

				
			    public BigDecimal EXTN_SHIP_ALONE_SKU_NO;

				public BigDecimal getEXTN_SHIP_ALONE_SKU_NO () {
					return this.EXTN_SHIP_ALONE_SKU_NO;
				}

				public Boolean EXTN_SHIP_ALONE_SKU_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIP_ALONE_SKU_NOIsKey(){
				    return false;
				}
				public Integer EXTN_SHIP_ALONE_SKU_NOLength(){
				    return null;
				}
				public Integer EXTN_SHIP_ALONE_SKU_NOPrecision(){
				    return null;
				}
				public String EXTN_SHIP_ALONE_SKU_NODefault(){
				
					return "";
				
				}
				public String EXTN_SHIP_ALONE_SKU_NOComment(){
				
				    return "";
				
				}
				public String EXTN_SHIP_ALONE_SKU_NOPattern(){
				
					return "";
				
				}
				public String EXTN_SHIP_ALONE_SKU_NOOriginalDbColumnName(){
				
					return "EXTN_SHIP_ALONE_SKU_NO";
				
				}

				
			    public java.util.Date EXTN_REQ_SHIP_DATE;

				public java.util.Date getEXTN_REQ_SHIP_DATE () {
					return this.EXTN_REQ_SHIP_DATE;
				}

				public Boolean EXTN_REQ_SHIP_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_REQ_SHIP_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_REQ_SHIP_DATELength(){
				    return null;
				}
				public Integer EXTN_REQ_SHIP_DATEPrecision(){
				    return null;
				}
				public String EXTN_REQ_SHIP_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_REQ_SHIP_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_REQ_SHIP_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_REQ_SHIP_DATEOriginalDbColumnName(){
				
					return "EXTN_REQ_SHIP_DATE";
				
				}

				
			    public java.util.Date EXTN_REQ_DELIVERY_DATE;

				public java.util.Date getEXTN_REQ_DELIVERY_DATE () {
					return this.EXTN_REQ_DELIVERY_DATE;
				}

				public Boolean EXTN_REQ_DELIVERY_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_REQ_DELIVERY_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_REQ_DELIVERY_DATELength(){
				    return null;
				}
				public Integer EXTN_REQ_DELIVERY_DATEPrecision(){
				    return null;
				}
				public String EXTN_REQ_DELIVERY_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_REQ_DELIVERY_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_REQ_DELIVERY_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_REQ_DELIVERY_DATEOriginalDbColumnName(){
				
					return "EXTN_REQ_DELIVERY_DATE";
				
				}

				
			    public java.util.Date EXTN_SHIP_NOT_BEFORE_DATE;

				public java.util.Date getEXTN_SHIP_NOT_BEFORE_DATE () {
					return this.EXTN_SHIP_NOT_BEFORE_DATE;
				}

				public Boolean EXTN_SHIP_NOT_BEFORE_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIP_NOT_BEFORE_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_SHIP_NOT_BEFORE_DATELength(){
				    return null;
				}
				public Integer EXTN_SHIP_NOT_BEFORE_DATEPrecision(){
				    return null;
				}
				public String EXTN_SHIP_NOT_BEFORE_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_SHIP_NOT_BEFORE_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_SHIP_NOT_BEFORE_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_SHIP_NOT_BEFORE_DATEOriginalDbColumnName(){
				
					return "EXTN_SHIP_NOT_BEFORE_DATE";
				
				}

				
			    public java.util.Date EXTN_SHIP_NOT_AFTER_DATE;

				public java.util.Date getEXTN_SHIP_NOT_AFTER_DATE () {
					return this.EXTN_SHIP_NOT_AFTER_DATE;
				}

				public Boolean EXTN_SHIP_NOT_AFTER_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIP_NOT_AFTER_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_SHIP_NOT_AFTER_DATELength(){
				    return null;
				}
				public Integer EXTN_SHIP_NOT_AFTER_DATEPrecision(){
				    return null;
				}
				public String EXTN_SHIP_NOT_AFTER_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_SHIP_NOT_AFTER_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_SHIP_NOT_AFTER_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_SHIP_NOT_AFTER_DATEOriginalDbColumnName(){
				
					return "EXTN_SHIP_NOT_AFTER_DATE";
				
				}

				
			    public java.util.Date EXTN_DELIVER_NOT_BEFORE_DT;

				public java.util.Date getEXTN_DELIVER_NOT_BEFORE_DT () {
					return this.EXTN_DELIVER_NOT_BEFORE_DT;
				}

				public Boolean EXTN_DELIVER_NOT_BEFORE_DTIsNullable(){
				    return true;
				}
				public Boolean EXTN_DELIVER_NOT_BEFORE_DTIsKey(){
				    return false;
				}
				public Integer EXTN_DELIVER_NOT_BEFORE_DTLength(){
				    return null;
				}
				public Integer EXTN_DELIVER_NOT_BEFORE_DTPrecision(){
				    return null;
				}
				public String EXTN_DELIVER_NOT_BEFORE_DTDefault(){
				
					return null;
				
				}
				public String EXTN_DELIVER_NOT_BEFORE_DTComment(){
				
				    return "";
				
				}
				public String EXTN_DELIVER_NOT_BEFORE_DTPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_DELIVER_NOT_BEFORE_DTOriginalDbColumnName(){
				
					return "EXTN_DELIVER_NOT_BEFORE_DT";
				
				}

				
			    public java.util.Date EXTN_DELIVER_NOT_AFTER_DT;

				public java.util.Date getEXTN_DELIVER_NOT_AFTER_DT () {
					return this.EXTN_DELIVER_NOT_AFTER_DT;
				}

				public Boolean EXTN_DELIVER_NOT_AFTER_DTIsNullable(){
				    return true;
				}
				public Boolean EXTN_DELIVER_NOT_AFTER_DTIsKey(){
				    return false;
				}
				public Integer EXTN_DELIVER_NOT_AFTER_DTLength(){
				    return null;
				}
				public Integer EXTN_DELIVER_NOT_AFTER_DTPrecision(){
				    return null;
				}
				public String EXTN_DELIVER_NOT_AFTER_DTDefault(){
				
					return null;
				
				}
				public String EXTN_DELIVER_NOT_AFTER_DTComment(){
				
				    return "";
				
				}
				public String EXTN_DELIVER_NOT_AFTER_DTPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_DELIVER_NOT_AFTER_DTOriginalDbColumnName(){
				
					return "EXTN_DELIVER_NOT_AFTER_DT";
				
				}

				
			    public String EXTN_MARK_FOR_STORE_NO;

				public String getEXTN_MARK_FOR_STORE_NO () {
					return this.EXTN_MARK_FOR_STORE_NO;
				}

				public Boolean EXTN_MARK_FOR_STORE_NOIsNullable(){
				    return true;
				}
				public Boolean EXTN_MARK_FOR_STORE_NOIsKey(){
				    return false;
				}
				public Integer EXTN_MARK_FOR_STORE_NOLength(){
				    return null;
				}
				public Integer EXTN_MARK_FOR_STORE_NOPrecision(){
				    return null;
				}
				public String EXTN_MARK_FOR_STORE_NODefault(){
				
					return null;
				
				}
				public String EXTN_MARK_FOR_STORE_NOComment(){
				
				    return "";
				
				}
				public String EXTN_MARK_FOR_STORE_NOPattern(){
				
					return "";
				
				}
				public String EXTN_MARK_FOR_STORE_NOOriginalDbColumnName(){
				
					return "EXTN_MARK_FOR_STORE_NO";
				
				}

				
			    public String EXTN_IS_BACKORDERED;

				public String getEXTN_IS_BACKORDERED () {
					return this.EXTN_IS_BACKORDERED;
				}

				public Boolean EXTN_IS_BACKORDEREDIsNullable(){
				    return true;
				}
				public Boolean EXTN_IS_BACKORDEREDIsKey(){
				    return false;
				}
				public Integer EXTN_IS_BACKORDEREDLength(){
				    return null;
				}
				public Integer EXTN_IS_BACKORDEREDPrecision(){
				    return null;
				}
				public String EXTN_IS_BACKORDEREDDefault(){
				
					return null;
				
				}
				public String EXTN_IS_BACKORDEREDComment(){
				
				    return "";
				
				}
				public String EXTN_IS_BACKORDEREDPattern(){
				
					return "";
				
				}
				public String EXTN_IS_BACKORDEREDOriginalDbColumnName(){
				
					return "EXTN_IS_BACKORDERED";
				
				}

				
			    public String EXTN_LAST_PICK_DATE_FOR_CANCEL;

				public String getEXTN_LAST_PICK_DATE_FOR_CANCEL () {
					return this.EXTN_LAST_PICK_DATE_FOR_CANCEL;
				}

				public Boolean EXTN_LAST_PICK_DATE_FOR_CANCELIsNullable(){
				    return true;
				}
				public Boolean EXTN_LAST_PICK_DATE_FOR_CANCELIsKey(){
				    return false;
				}
				public Integer EXTN_LAST_PICK_DATE_FOR_CANCELLength(){
				    return null;
				}
				public Integer EXTN_LAST_PICK_DATE_FOR_CANCELPrecision(){
				    return null;
				}
				public String EXTN_LAST_PICK_DATE_FOR_CANCELDefault(){
				
					return null;
				
				}
				public String EXTN_LAST_PICK_DATE_FOR_CANCELComment(){
				
				    return "";
				
				}
				public String EXTN_LAST_PICK_DATE_FOR_CANCELPattern(){
				
					return "";
				
				}
				public String EXTN_LAST_PICK_DATE_FOR_CANCELOriginalDbColumnName(){
				
					return "EXTN_LAST_PICK_DATE_FOR_CANCEL";
				
				}

				
			    public String EXTN_PICKUP_EMAIL_FLAG;

				public String getEXTN_PICKUP_EMAIL_FLAG () {
					return this.EXTN_PICKUP_EMAIL_FLAG;
				}

				public Boolean EXTN_PICKUP_EMAIL_FLAGIsNullable(){
				    return true;
				}
				public Boolean EXTN_PICKUP_EMAIL_FLAGIsKey(){
				    return false;
				}
				public Integer EXTN_PICKUP_EMAIL_FLAGLength(){
				    return null;
				}
				public Integer EXTN_PICKUP_EMAIL_FLAGPrecision(){
				    return null;
				}
				public String EXTN_PICKUP_EMAIL_FLAGDefault(){
				
					return null;
				
				}
				public String EXTN_PICKUP_EMAIL_FLAGComment(){
				
				    return "";
				
				}
				public String EXTN_PICKUP_EMAIL_FLAGPattern(){
				
					return "";
				
				}
				public String EXTN_PICKUP_EMAIL_FLAGOriginalDbColumnName(){
				
					return "EXTN_PICKUP_EMAIL_FLAG";
				
				}

				
			    public String EXTN_SHIP_COMPLETE;

				public String getEXTN_SHIP_COMPLETE () {
					return this.EXTN_SHIP_COMPLETE;
				}

				public Boolean EXTN_SHIP_COMPLETEIsNullable(){
				    return true;
				}
				public Boolean EXTN_SHIP_COMPLETEIsKey(){
				    return false;
				}
				public Integer EXTN_SHIP_COMPLETELength(){
				    return null;
				}
				public Integer EXTN_SHIP_COMPLETEPrecision(){
				    return null;
				}
				public String EXTN_SHIP_COMPLETEDefault(){
				
					return null;
				
				}
				public String EXTN_SHIP_COMPLETEComment(){
				
				    return "";
				
				}
				public String EXTN_SHIP_COMPLETEPattern(){
				
					return "";
				
				}
				public String EXTN_SHIP_COMPLETEOriginalDbColumnName(){
				
					return "EXTN_SHIP_COMPLETE";
				
				}

				
			    public String EXTN_SINGLE_CARTON;

				public String getEXTN_SINGLE_CARTON () {
					return this.EXTN_SINGLE_CARTON;
				}

				public Boolean EXTN_SINGLE_CARTONIsNullable(){
				    return true;
				}
				public Boolean EXTN_SINGLE_CARTONIsKey(){
				    return false;
				}
				public Integer EXTN_SINGLE_CARTONLength(){
				    return null;
				}
				public Integer EXTN_SINGLE_CARTONPrecision(){
				    return null;
				}
				public String EXTN_SINGLE_CARTONDefault(){
				
					return null;
				
				}
				public String EXTN_SINGLE_CARTONComment(){
				
				    return "";
				
				}
				public String EXTN_SINGLE_CARTONPattern(){
				
					return "";
				
				}
				public String EXTN_SINGLE_CARTONOriginalDbColumnName(){
				
					return "EXTN_SINGLE_CARTON";
				
				}

				
			    public java.util.Date EXTN_REQ_CANCEL_DATE;

				public java.util.Date getEXTN_REQ_CANCEL_DATE () {
					return this.EXTN_REQ_CANCEL_DATE;
				}

				public Boolean EXTN_REQ_CANCEL_DATEIsNullable(){
				    return true;
				}
				public Boolean EXTN_REQ_CANCEL_DATEIsKey(){
				    return false;
				}
				public Integer EXTN_REQ_CANCEL_DATELength(){
				    return null;
				}
				public Integer EXTN_REQ_CANCEL_DATEPrecision(){
				    return null;
				}
				public String EXTN_REQ_CANCEL_DATEDefault(){
				
					return null;
				
				}
				public String EXTN_REQ_CANCEL_DATEComment(){
				
				    return "";
				
				}
				public String EXTN_REQ_CANCEL_DATEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String EXTN_REQ_CANCEL_DATEOriginalDbColumnName(){
				
					return "EXTN_REQ_CANCEL_DATE";
				
				}

				
			    public String EXTN_VENDOR_SKU;

				public String getEXTN_VENDOR_SKU () {
					return this.EXTN_VENDOR_SKU;
				}

				public Boolean EXTN_VENDOR_SKUIsNullable(){
				    return true;
				}
				public Boolean EXTN_VENDOR_SKUIsKey(){
				    return false;
				}
				public Integer EXTN_VENDOR_SKULength(){
				    return null;
				}
				public Integer EXTN_VENDOR_SKUPrecision(){
				    return null;
				}
				public String EXTN_VENDOR_SKUDefault(){
				
					return null;
				
				}
				public String EXTN_VENDOR_SKUComment(){
				
				    return "";
				
				}
				public String EXTN_VENDOR_SKUPattern(){
				
					return "";
				
				}
				public String EXTN_VENDOR_SKUOriginalDbColumnName(){
				
					return "EXTN_VENDOR_SKU";
				
				}

				
			    public String EXTN_RESHIPPED_FLAG;

				public String getEXTN_RESHIPPED_FLAG () {
					return this.EXTN_RESHIPPED_FLAG;
				}

				public Boolean EXTN_RESHIPPED_FLAGIsNullable(){
				    return true;
				}
				public Boolean EXTN_RESHIPPED_FLAGIsKey(){
				    return false;
				}
				public Integer EXTN_RESHIPPED_FLAGLength(){
				    return null;
				}
				public Integer EXTN_RESHIPPED_FLAGPrecision(){
				    return null;
				}
				public String EXTN_RESHIPPED_FLAGDefault(){
				
					return null;
				
				}
				public String EXTN_RESHIPPED_FLAGComment(){
				
				    return "";
				
				}
				public String EXTN_RESHIPPED_FLAGPattern(){
				
					return "";
				
				}
				public String EXTN_RESHIPPED_FLAGOriginalDbColumnName(){
				
					return "EXTN_RESHIPPED_FLAG";
				
				}

				
			    public String EXTN_RETURNED_FLAG;

				public String getEXTN_RETURNED_FLAG () {
					return this.EXTN_RETURNED_FLAG;
				}

				public Boolean EXTN_RETURNED_FLAGIsNullable(){
				    return true;
				}
				public Boolean EXTN_RETURNED_FLAGIsKey(){
				    return false;
				}
				public Integer EXTN_RETURNED_FLAGLength(){
				    return null;
				}
				public Integer EXTN_RETURNED_FLAGPrecision(){
				    return null;
				}
				public String EXTN_RETURNED_FLAGDefault(){
				
					return null;
				
				}
				public String EXTN_RETURNED_FLAGComment(){
				
				    return "";
				
				}
				public String EXTN_RETURNED_FLAGPattern(){
				
					return "";
				
				}
				public String EXTN_RETURNED_FLAGOriginalDbColumnName(){
				
					return "EXTN_RETURNED_FLAG";
				
				}

				
			    public String EXTN_RESHIPPED_QTY;

				public String getEXTN_RESHIPPED_QTY () {
					return this.EXTN_RESHIPPED_QTY;
				}

				public Boolean EXTN_RESHIPPED_QTYIsNullable(){
				    return true;
				}
				public Boolean EXTN_RESHIPPED_QTYIsKey(){
				    return false;
				}
				public Integer EXTN_RESHIPPED_QTYLength(){
				    return null;
				}
				public Integer EXTN_RESHIPPED_QTYPrecision(){
				    return null;
				}
				public String EXTN_RESHIPPED_QTYDefault(){
				
					return null;
				
				}
				public String EXTN_RESHIPPED_QTYComment(){
				
				    return "";
				
				}
				public String EXTN_RESHIPPED_QTYPattern(){
				
					return "";
				
				}
				public String EXTN_RESHIPPED_QTYOriginalDbColumnName(){
				
					return "EXTN_RESHIPPED_QTY";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_ORDER_LINE_H, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_LINE_H) {

        	try {

        		int length = 0;
		
					this.ORDER_LINE_KEY = readString(dis);
					
					this.ORDER_HEADER_KEY = readString(dis);
					
						this.PRIME_LINE_NO = (BigDecimal) dis.readObject();
					
						this.SUB_LINE_NO = (BigDecimal) dis.readObject();
					
					this.LINE_TYPE = readString(dis);
					
					this.ORDER_CLASS = readString(dis);
					
					this.ITEM_ID = readString(dis);
					
					this.ALTERNATE_ITEM_ID = readString(dis);
					
					this.UOM = readString(dis);
					
					this.PRODUCT_CLASS = readString(dis);
					
						this.UNIT_PRICE = (BigDecimal) dis.readObject();
					
					this.COST_CURRENCY = readString(dis);
					
						this.ORDERED_QTY = (BigDecimal) dis.readObject();
					
						this.BASIC_CAPACITY_REQUIRED = (BigDecimal) dis.readObject();
					
						this.OPTION_CAPACITY_REQUIRED = (BigDecimal) dis.readObject();
					
					this.DEPENDENT_ON_LINE_KEY = readString(dis);
					
					this.CURRENT_WORK_ORDER_KEY = readString(dis);
					
					this.DEPENDENCY_SHIPPING_RULE = readString(dis);
					
						this.FILL_QUANTITY = (BigDecimal) dis.readObject();
					
						this.COMMITTED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.DEPENDENCY_RATIO = (BigDecimal) dis.readObject();
					
					this.MAINTAIN_RATIO = readString(dis);
					
					this.MERGE_NODE = readString(dis);
					
					this.PARENT_OF_DEPENDENT_GROUP = readString(dis);
					
					this.SOURCE_FROM_ORGANIZATION = readString(dis);
					
					this.CHAINED_FROM_ORDER_LINE_KEY = readString(dis);
					
					this.CHAINED_FROM_ORDER_HEADER_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_LINE_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_HEADER_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_RELEASE_KEY = readString(dis);
					
					this.DISTRIBUTION_RULE_ID = readString(dis);
					
						this.INVOICED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.OVER_RECEIPT_QUANTITY = (BigDecimal) dis.readObject();
					
					this.RETURN_REASON = readString(dis);
					
					this.SHIPNODE_KEY = readString(dis);
					
					this.PROCURE_FROM_NODE = readString(dis);
					
					this.SHIP_TO_KEY = readString(dis);
					
					this.MARK_FOR_KEY = readString(dis);
					
					this.BUYER_MARK_FOR_NODE_ID = readString(dis);
					
					this.REQ_DELIVERY_DATE = readDate(dis);
					
					this.REQ_CANCEL_DATE = readDate(dis);
					
					this.REQ_SHIP_DATE = readDate(dis);
					
					this.SCAC = readString(dis);
					
					this.CARRIER_SERVICE_CODE = readString(dis);
					
					this.CARRIER_ACCOUNT_NO = readString(dis);
					
					this.PICKABLE_FLAG = readString(dis);
					
					this.SHIP_TOGETHER_NO = readString(dis);
					
					this.HOLD_FLAG = readString(dis);
					
					this.KIT_CODE = readString(dis);
					
					this.HOLD_REASON_CODE = readString(dis);
					
						this.OTHER_CHARGES = (BigDecimal) dis.readObject();
					
						this.LINE_TOTAL = (BigDecimal) dis.readObject();
					
						this.INVOICED_LINE_TOTAL = (BigDecimal) dis.readObject();
					
						this.INVOICED_EXTENDED_PRICE = (BigDecimal) dis.readObject();
					
						this.SETTLED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.SETTLED_AMOUNT = (BigDecimal) dis.readObject();
					
					this.TAXABLE_FLAG = readString(dis);
					
					this.TAX_EXEMPTION_CERTIFICATE = readString(dis);
					
					this.DISCOUNT_TYPE = readString(dis);
					
					this.DISCOUNT_REFERENCE = readString(dis);
					
					this.GIFT_FLAG = readString(dis);
					
					this.PERSONALIZE_FLAG = readString(dis);
					
					this.PERSONALIZE_CODE = readString(dis);
					
					this.DEPARTMENT_CODE = readString(dis);
					
					this.CUSTOMER_ITEM = readString(dis);
					
					this.CUSTOMER_ITEM_DESCRIPTION = readString(dis);
					
						this.ITEM_WEIGHT = (BigDecimal) dis.readObject();
					
					this.ITEM_WEIGHT_UOM = readString(dis);
					
					this.ITEM_DESCRIPTION = readString(dis);
					
					this.ITEM_SHORT_DESCRIPTION = readString(dis);
					
					this.RESERVATION_ID = readString(dis);
					
					this.RESERVATION_POOL = readString(dis);
					
					this.CUSTOMER_PO_NO = readString(dis);
					
					this.CUSTOMER_PO_LINE_NO = readString(dis);
					
						this.TAX = (BigDecimal) dis.readObject();
					
					this.DELIVERY_CODE = readString(dis);
					
						this.ORIGINAL_ORDERED_QTY = (BigDecimal) dis.readObject();
					
						this.LIST_PRICE = (BigDecimal) dis.readObject();
					
						this.RETAIL_PRICE = (BigDecimal) dis.readObject();
					
						this.DISCOUNT_PERCENTAGE = (BigDecimal) dis.readObject();
					
					this.PACKLIST_TYPE = readString(dis);
					
					this.SUPPLIER_ITEM = readString(dis);
					
					this.SUPPLIER_ITEM_DESCRIPTION = readString(dis);
					
						this.UNIT_COST = (BigDecimal) dis.readObject();
					
					this.UPC_CODE = readString(dis);
					
					this.FOB = readString(dis);
					
					this.MANUFACTURER_NAME = readString(dis);
					
					this.MANUFACTURER_ITEM = readString(dis);
					
					this.MANUFACTURER_ITEM_DESC = readString(dis);
					
					this.COUNTRY_OF_ORIGIN = readString(dis);
					
					this.ISBN = readString(dis);
					
					this.HARMONIZED_CODE = readString(dis);
					
					this.SHIP_TO_ID = readString(dis);
					
					this.PRODUCT_LINE = readString(dis);
					
					this.NMFC_CODE = readString(dis);
					
					this.NMFC_CLASS = readString(dis);
					
					this.NMFC_DESCRIPTION = readString(dis);
					
					this.TAX_PRODUCT_CODE = readString(dis);
					
					this.IMPORT_LICENSE_NO = readString(dis);
					
					this.IMPORT_LICENSE_EXP_DATE = readDate(dis);
					
					this.ECCN_NO = readString(dis);
					
					this.SCHEDULE_B_CODE = readString(dis);
					
					this.SUPPLIER_CODE = readString(dis);
					
					this.PURPOSE = readString(dis);
					
					this.RECEIVING_NODE = readString(dis);
					
					this.BUYER_RECEIVING_NODE_ID = readString(dis);
					
					this.SHIPMENT_CONSOL_GROUP_ID = readString(dis);
					
					this.ORIG_ORDER_LINE_KEY = readString(dis);
					
					this.LINE_SEQ_NO = readString(dis);
					
						this.SPLIT_QTY = (BigDecimal) dis.readObject();
					
					this.PRICING_DATE = readDate(dis);
					
					this.PIPELINE_KEY = readString(dis);
					
					this.CONDITION_VARIABLE_1 = readString(dis);
					
					this.CONDITION_VARIABLE_2 = readString(dis);
					
					this.IS_PRICE_LOCKED = readString(dis);
					
					this.IS_COST_OVERRIDDEN = readString(dis);
					
					this.IS_CAPACITY_OVERRIDDEN = readString(dis);
					
					this.INVOICE_COMPLETE = readString(dis);
					
					this.DELIVERY_METHOD = readString(dis);
					
					this.ITEM_GROUP_CODE = readString(dis);
					
					this.CANNOT_COMPLETE_BEFORE_DATE = readDate(dis);
					
					this.CANNOT_COMPLETE_AFTER_DATE = readDate(dis);
					
					this.APPT_STATUS = readString(dis);
					
					this.CAN_ADD_SERVICE_LINES = readString(dis);
					
					this.PRICING_UOM = readString(dis);
					
					this.CAPACITY_UOM = readString(dis);
					
						this.PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
						this.SHIPPED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.FIXED_CAPACITY_QTY_PER_LINE = (BigDecimal) dis.readObject();
					
						this.FIXED_PRICING_QTY_PER_LINE = (BigDecimal) dis.readObject();
					
					this.WAIT_FOR_SEQ_LINE = readString(dis);
					
					this.SCHED_FAILURE_REASON_CODE = readString(dis);
					
					this.EARLIEST_SHIP_DATE = readDate(dis);
					
					this.EARLIEST_DELIVERY_DATE = readDate(dis);
					
					this.CANNOT_MEET_APPT = readString(dis);
					
					this.PROMISED_APPT_START_DATE = readDate(dis);
					
					this.PROMISED_APPT_END_DATE = readDate(dis);
					
					this.SEGMENT = readString(dis);
					
					this.SEGMENT_TYPE = readString(dis);
					
					this.EARLIEST_SCHEDULE_DATE = readDate(dis);
					
					this.TIMEZONE = readString(dis);
					
					this.IS_FORWARDING_ALLOWED = readString(dis);
					
					this.IS_PROCUREMENT_ALLOWED = readString(dis);
					
					this.RESHIP_PARENT_LINE_KEY = readString(dis);
					
					this.BUNDLE_PARENT_ORDER_LINE_KEY = readString(dis);
					
					this.IS_PRICE_INFO_ONLY = readString(dis);
					
					this.LEVEL_OF_SERVICE = readString(dis);
					
						this.FIRST_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
						this.LAST_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
					this.ORDERING_UOM = readString(dis);
					
						this.PRICING_QUANTITY_CONV_FACTOR = (BigDecimal) dis.readObject();
					
					this.PRICING_QUANTITY_STRATEGY = readString(dis);
					
						this.INVOICED_PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.IS_STANDALONE_SERVICE = readString(dis);
					
						this.TRAN_DISCREPANCY_QTY = (BigDecimal) dis.readObject();
					
						this.RECEIVED_QUANTITY = (BigDecimal) dis.readObject();
					
					this.INVOICE_BASED_ON_ACTUALS = readString(dis);
					
						this.ACTUAL_PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.FULFILLMENT_TYPE = readString(dis);
					
					this.SERIAL_NO = readString(dis);
					
					this.RESERVATION_MANDATORY = readString(dis);
					
					this.IS_FIRM_PREDEFINED_NODE = readString(dis);
					
					this.INTENTIONAL_BACKORDER = readString(dis);
					
					this.FUTURE_AVAIL_DATE = readDate(dis);
					
						this.REPRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.MIN_SHIP_BY_DATE = readDate(dis);
					
						this.KIT_QTY = (BigDecimal) dis.readObject();
					
					this.BOM_CONFIG_KEY = readString(dis);
					
					this.BUNDLE_FULFILLMENT_MODE = readString(dis);
					
					this.IS_GIFT_WRAP = readString(dis);
					
						this.GROUP_SEQUENCE_NUM = (BigDecimal) dis.readObject();
					
					this.IN_STORE_PAYMENT_REQUIRED = readString(dis);
					
					this.ITEM_NOT_EXIST = readString(dis);
					
						this.BACKORDER_NOTIFICATION_QTY = (BigDecimal) dis.readObject();
					
					this.IS_PRICE_MATCHED = readString(dis);
					
					this.IS_PICK_UP_NOW = readString(dis);
					
					this.ITEM_IS_IN_HAND = readString(dis);
					
					this.DISPOSITION_CODE = readString(dis);
					
					this.EXTN_PUBLISHED = readString(dis);
					
					this.EXTN_LINE_TOTAL = readString(dis);
					
					this.EXTN_ORDERED_QTY = readString(dis);
					
					this.EXTN_SHIP_METHOD = readString(dis);
					
					this.EXTN_PRICE_MOD = readString(dis);
					
					this.EXTN_PRICE_MOD_DESC = readString(dis);
					
					this.EXTN_PRICE_MOD_TYPE = readString(dis);
					
					this.EXTN_PRICE_MOD_CODE = readString(dis);
					
					this.EXTN_PRICE_MOD_DIV = readString(dis);
					
					this.EXTN_PRICE_MOD_CODE_STR = readString(dis);
					
						this.EXTN_ORIG_UNITPRICE = (BigDecimal) dis.readObject();
					
					this.EXTN_REVIEW = readString(dis);
					
					this.EXTN_LAST_PICK_DATE = readString(dis);
					
					this.EXTN_PICK_DATE = readString(dis);
					
					this.EXTN_RELEASE_ID = readString(dis);
					
					this.EXTN_AVG_RATING = readString(dis);
					
					this.EXTN_DESCRIPTION = readString(dis);
					
					this.EXTN_ACT_ITEM_ID = readString(dis);
					
					this.EXTN_VERTEX_ENGINE = readString(dis);
					
					this.DERIVED_FROM_EXT_ORD = readString(dis);
					
					this.IS_ELIGIBLE_FOR_SHIP_DISC = readString(dis);
					
					this.EXTN_SIGN_TYPE = readString(dis);
					
						this.EXTN_MKTPLACE_SHIP_AMT = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_SHIP_DISC = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_SHIP_TAX = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_COMMISSION = (BigDecimal) dis.readObject();
					
					this.EXTN_IS_GWP = readString(dis);
					
					this.EXTN_CHANNEL_ITEM_ID = readString(dis);
					
					this.EXTN_ORIGINAL_TRACKING_NO = readString(dis);
					
					this.EXTN_IS_MIGRATED = readString(dis);
					
					this.EXTN_SDK_LINE = readString(dis);
					
					this.EXTN_TOTAL_DISCOUNT = readString(dis);
					
					this.EXTN_TOTAL_TAX = readString(dis);
					
						this.EXTN_SHIP_ALONE_SKU_NO = (BigDecimal) dis.readObject();
					
					this.EXTN_REQ_SHIP_DATE = readDate(dis);
					
					this.EXTN_REQ_DELIVERY_DATE = readDate(dis);
					
					this.EXTN_SHIP_NOT_BEFORE_DATE = readDate(dis);
					
					this.EXTN_SHIP_NOT_AFTER_DATE = readDate(dis);
					
					this.EXTN_DELIVER_NOT_BEFORE_DT = readDate(dis);
					
					this.EXTN_DELIVER_NOT_AFTER_DT = readDate(dis);
					
					this.EXTN_MARK_FOR_STORE_NO = readString(dis);
					
					this.EXTN_IS_BACKORDERED = readString(dis);
					
					this.EXTN_LAST_PICK_DATE_FOR_CANCEL = readString(dis);
					
					this.EXTN_PICKUP_EMAIL_FLAG = readString(dis);
					
					this.EXTN_SHIP_COMPLETE = readString(dis);
					
					this.EXTN_SINGLE_CARTON = readString(dis);
					
					this.EXTN_REQ_CANCEL_DATE = readDate(dis);
					
					this.EXTN_VENDOR_SKU = readString(dis);
					
					this.EXTN_RESHIPPED_FLAG = readString(dis);
					
					this.EXTN_RETURNED_FLAG = readString(dis);
					
					this.EXTN_RESHIPPED_QTY = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_ORDER_LINE_H) {

        	try {

        		int length = 0;
		
					this.ORDER_LINE_KEY = readString(dis);
					
					this.ORDER_HEADER_KEY = readString(dis);
					
						this.PRIME_LINE_NO = (BigDecimal) dis.readObject();
					
						this.SUB_LINE_NO = (BigDecimal) dis.readObject();
					
					this.LINE_TYPE = readString(dis);
					
					this.ORDER_CLASS = readString(dis);
					
					this.ITEM_ID = readString(dis);
					
					this.ALTERNATE_ITEM_ID = readString(dis);
					
					this.UOM = readString(dis);
					
					this.PRODUCT_CLASS = readString(dis);
					
						this.UNIT_PRICE = (BigDecimal) dis.readObject();
					
					this.COST_CURRENCY = readString(dis);
					
						this.ORDERED_QTY = (BigDecimal) dis.readObject();
					
						this.BASIC_CAPACITY_REQUIRED = (BigDecimal) dis.readObject();
					
						this.OPTION_CAPACITY_REQUIRED = (BigDecimal) dis.readObject();
					
					this.DEPENDENT_ON_LINE_KEY = readString(dis);
					
					this.CURRENT_WORK_ORDER_KEY = readString(dis);
					
					this.DEPENDENCY_SHIPPING_RULE = readString(dis);
					
						this.FILL_QUANTITY = (BigDecimal) dis.readObject();
					
						this.COMMITTED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.DEPENDENCY_RATIO = (BigDecimal) dis.readObject();
					
					this.MAINTAIN_RATIO = readString(dis);
					
					this.MERGE_NODE = readString(dis);
					
					this.PARENT_OF_DEPENDENT_GROUP = readString(dis);
					
					this.SOURCE_FROM_ORGANIZATION = readString(dis);
					
					this.CHAINED_FROM_ORDER_LINE_KEY = readString(dis);
					
					this.CHAINED_FROM_ORDER_HEADER_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_LINE_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_HEADER_KEY = readString(dis);
					
					this.DERIVED_FROM_ORDER_RELEASE_KEY = readString(dis);
					
					this.DISTRIBUTION_RULE_ID = readString(dis);
					
						this.INVOICED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.OVER_RECEIPT_QUANTITY = (BigDecimal) dis.readObject();
					
					this.RETURN_REASON = readString(dis);
					
					this.SHIPNODE_KEY = readString(dis);
					
					this.PROCURE_FROM_NODE = readString(dis);
					
					this.SHIP_TO_KEY = readString(dis);
					
					this.MARK_FOR_KEY = readString(dis);
					
					this.BUYER_MARK_FOR_NODE_ID = readString(dis);
					
					this.REQ_DELIVERY_DATE = readDate(dis);
					
					this.REQ_CANCEL_DATE = readDate(dis);
					
					this.REQ_SHIP_DATE = readDate(dis);
					
					this.SCAC = readString(dis);
					
					this.CARRIER_SERVICE_CODE = readString(dis);
					
					this.CARRIER_ACCOUNT_NO = readString(dis);
					
					this.PICKABLE_FLAG = readString(dis);
					
					this.SHIP_TOGETHER_NO = readString(dis);
					
					this.HOLD_FLAG = readString(dis);
					
					this.KIT_CODE = readString(dis);
					
					this.HOLD_REASON_CODE = readString(dis);
					
						this.OTHER_CHARGES = (BigDecimal) dis.readObject();
					
						this.LINE_TOTAL = (BigDecimal) dis.readObject();
					
						this.INVOICED_LINE_TOTAL = (BigDecimal) dis.readObject();
					
						this.INVOICED_EXTENDED_PRICE = (BigDecimal) dis.readObject();
					
						this.SETTLED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.SETTLED_AMOUNT = (BigDecimal) dis.readObject();
					
					this.TAXABLE_FLAG = readString(dis);
					
					this.TAX_EXEMPTION_CERTIFICATE = readString(dis);
					
					this.DISCOUNT_TYPE = readString(dis);
					
					this.DISCOUNT_REFERENCE = readString(dis);
					
					this.GIFT_FLAG = readString(dis);
					
					this.PERSONALIZE_FLAG = readString(dis);
					
					this.PERSONALIZE_CODE = readString(dis);
					
					this.DEPARTMENT_CODE = readString(dis);
					
					this.CUSTOMER_ITEM = readString(dis);
					
					this.CUSTOMER_ITEM_DESCRIPTION = readString(dis);
					
						this.ITEM_WEIGHT = (BigDecimal) dis.readObject();
					
					this.ITEM_WEIGHT_UOM = readString(dis);
					
					this.ITEM_DESCRIPTION = readString(dis);
					
					this.ITEM_SHORT_DESCRIPTION = readString(dis);
					
					this.RESERVATION_ID = readString(dis);
					
					this.RESERVATION_POOL = readString(dis);
					
					this.CUSTOMER_PO_NO = readString(dis);
					
					this.CUSTOMER_PO_LINE_NO = readString(dis);
					
						this.TAX = (BigDecimal) dis.readObject();
					
					this.DELIVERY_CODE = readString(dis);
					
						this.ORIGINAL_ORDERED_QTY = (BigDecimal) dis.readObject();
					
						this.LIST_PRICE = (BigDecimal) dis.readObject();
					
						this.RETAIL_PRICE = (BigDecimal) dis.readObject();
					
						this.DISCOUNT_PERCENTAGE = (BigDecimal) dis.readObject();
					
					this.PACKLIST_TYPE = readString(dis);
					
					this.SUPPLIER_ITEM = readString(dis);
					
					this.SUPPLIER_ITEM_DESCRIPTION = readString(dis);
					
						this.UNIT_COST = (BigDecimal) dis.readObject();
					
					this.UPC_CODE = readString(dis);
					
					this.FOB = readString(dis);
					
					this.MANUFACTURER_NAME = readString(dis);
					
					this.MANUFACTURER_ITEM = readString(dis);
					
					this.MANUFACTURER_ITEM_DESC = readString(dis);
					
					this.COUNTRY_OF_ORIGIN = readString(dis);
					
					this.ISBN = readString(dis);
					
					this.HARMONIZED_CODE = readString(dis);
					
					this.SHIP_TO_ID = readString(dis);
					
					this.PRODUCT_LINE = readString(dis);
					
					this.NMFC_CODE = readString(dis);
					
					this.NMFC_CLASS = readString(dis);
					
					this.NMFC_DESCRIPTION = readString(dis);
					
					this.TAX_PRODUCT_CODE = readString(dis);
					
					this.IMPORT_LICENSE_NO = readString(dis);
					
					this.IMPORT_LICENSE_EXP_DATE = readDate(dis);
					
					this.ECCN_NO = readString(dis);
					
					this.SCHEDULE_B_CODE = readString(dis);
					
					this.SUPPLIER_CODE = readString(dis);
					
					this.PURPOSE = readString(dis);
					
					this.RECEIVING_NODE = readString(dis);
					
					this.BUYER_RECEIVING_NODE_ID = readString(dis);
					
					this.SHIPMENT_CONSOL_GROUP_ID = readString(dis);
					
					this.ORIG_ORDER_LINE_KEY = readString(dis);
					
					this.LINE_SEQ_NO = readString(dis);
					
						this.SPLIT_QTY = (BigDecimal) dis.readObject();
					
					this.PRICING_DATE = readDate(dis);
					
					this.PIPELINE_KEY = readString(dis);
					
					this.CONDITION_VARIABLE_1 = readString(dis);
					
					this.CONDITION_VARIABLE_2 = readString(dis);
					
					this.IS_PRICE_LOCKED = readString(dis);
					
					this.IS_COST_OVERRIDDEN = readString(dis);
					
					this.IS_CAPACITY_OVERRIDDEN = readString(dis);
					
					this.INVOICE_COMPLETE = readString(dis);
					
					this.DELIVERY_METHOD = readString(dis);
					
					this.ITEM_GROUP_CODE = readString(dis);
					
					this.CANNOT_COMPLETE_BEFORE_DATE = readDate(dis);
					
					this.CANNOT_COMPLETE_AFTER_DATE = readDate(dis);
					
					this.APPT_STATUS = readString(dis);
					
					this.CAN_ADD_SERVICE_LINES = readString(dis);
					
					this.PRICING_UOM = readString(dis);
					
					this.CAPACITY_UOM = readString(dis);
					
						this.PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
						this.SHIPPED_QUANTITY = (BigDecimal) dis.readObject();
					
						this.FIXED_CAPACITY_QTY_PER_LINE = (BigDecimal) dis.readObject();
					
						this.FIXED_PRICING_QTY_PER_LINE = (BigDecimal) dis.readObject();
					
					this.WAIT_FOR_SEQ_LINE = readString(dis);
					
					this.SCHED_FAILURE_REASON_CODE = readString(dis);
					
					this.EARLIEST_SHIP_DATE = readDate(dis);
					
					this.EARLIEST_DELIVERY_DATE = readDate(dis);
					
					this.CANNOT_MEET_APPT = readString(dis);
					
					this.PROMISED_APPT_START_DATE = readDate(dis);
					
					this.PROMISED_APPT_END_DATE = readDate(dis);
					
					this.SEGMENT = readString(dis);
					
					this.SEGMENT_TYPE = readString(dis);
					
					this.EARLIEST_SCHEDULE_DATE = readDate(dis);
					
					this.TIMEZONE = readString(dis);
					
					this.IS_FORWARDING_ALLOWED = readString(dis);
					
					this.IS_PROCUREMENT_ALLOWED = readString(dis);
					
					this.RESHIP_PARENT_LINE_KEY = readString(dis);
					
					this.BUNDLE_PARENT_ORDER_LINE_KEY = readString(dis);
					
					this.IS_PRICE_INFO_ONLY = readString(dis);
					
					this.LEVEL_OF_SERVICE = readString(dis);
					
						this.FIRST_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
						this.LAST_ITER_SEQ_NO = (BigDecimal) dis.readObject();
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
					this.ORDERING_UOM = readString(dis);
					
						this.PRICING_QUANTITY_CONV_FACTOR = (BigDecimal) dis.readObject();
					
					this.PRICING_QUANTITY_STRATEGY = readString(dis);
					
						this.INVOICED_PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.IS_STANDALONE_SERVICE = readString(dis);
					
						this.TRAN_DISCREPANCY_QTY = (BigDecimal) dis.readObject();
					
						this.RECEIVED_QUANTITY = (BigDecimal) dis.readObject();
					
					this.INVOICE_BASED_ON_ACTUALS = readString(dis);
					
						this.ACTUAL_PRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.FULFILLMENT_TYPE = readString(dis);
					
					this.SERIAL_NO = readString(dis);
					
					this.RESERVATION_MANDATORY = readString(dis);
					
					this.IS_FIRM_PREDEFINED_NODE = readString(dis);
					
					this.INTENTIONAL_BACKORDER = readString(dis);
					
					this.FUTURE_AVAIL_DATE = readDate(dis);
					
						this.REPRICING_QUANTITY = (BigDecimal) dis.readObject();
					
					this.MIN_SHIP_BY_DATE = readDate(dis);
					
						this.KIT_QTY = (BigDecimal) dis.readObject();
					
					this.BOM_CONFIG_KEY = readString(dis);
					
					this.BUNDLE_FULFILLMENT_MODE = readString(dis);
					
					this.IS_GIFT_WRAP = readString(dis);
					
						this.GROUP_SEQUENCE_NUM = (BigDecimal) dis.readObject();
					
					this.IN_STORE_PAYMENT_REQUIRED = readString(dis);
					
					this.ITEM_NOT_EXIST = readString(dis);
					
						this.BACKORDER_NOTIFICATION_QTY = (BigDecimal) dis.readObject();
					
					this.IS_PRICE_MATCHED = readString(dis);
					
					this.IS_PICK_UP_NOW = readString(dis);
					
					this.ITEM_IS_IN_HAND = readString(dis);
					
					this.DISPOSITION_CODE = readString(dis);
					
					this.EXTN_PUBLISHED = readString(dis);
					
					this.EXTN_LINE_TOTAL = readString(dis);
					
					this.EXTN_ORDERED_QTY = readString(dis);
					
					this.EXTN_SHIP_METHOD = readString(dis);
					
					this.EXTN_PRICE_MOD = readString(dis);
					
					this.EXTN_PRICE_MOD_DESC = readString(dis);
					
					this.EXTN_PRICE_MOD_TYPE = readString(dis);
					
					this.EXTN_PRICE_MOD_CODE = readString(dis);
					
					this.EXTN_PRICE_MOD_DIV = readString(dis);
					
					this.EXTN_PRICE_MOD_CODE_STR = readString(dis);
					
						this.EXTN_ORIG_UNITPRICE = (BigDecimal) dis.readObject();
					
					this.EXTN_REVIEW = readString(dis);
					
					this.EXTN_LAST_PICK_DATE = readString(dis);
					
					this.EXTN_PICK_DATE = readString(dis);
					
					this.EXTN_RELEASE_ID = readString(dis);
					
					this.EXTN_AVG_RATING = readString(dis);
					
					this.EXTN_DESCRIPTION = readString(dis);
					
					this.EXTN_ACT_ITEM_ID = readString(dis);
					
					this.EXTN_VERTEX_ENGINE = readString(dis);
					
					this.DERIVED_FROM_EXT_ORD = readString(dis);
					
					this.IS_ELIGIBLE_FOR_SHIP_DISC = readString(dis);
					
					this.EXTN_SIGN_TYPE = readString(dis);
					
						this.EXTN_MKTPLACE_SHIP_AMT = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_SHIP_DISC = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_SHIP_TAX = (BigDecimal) dis.readObject();
					
						this.EXTN_MKTPLACE_COMMISSION = (BigDecimal) dis.readObject();
					
					this.EXTN_IS_GWP = readString(dis);
					
					this.EXTN_CHANNEL_ITEM_ID = readString(dis);
					
					this.EXTN_ORIGINAL_TRACKING_NO = readString(dis);
					
					this.EXTN_IS_MIGRATED = readString(dis);
					
					this.EXTN_SDK_LINE = readString(dis);
					
					this.EXTN_TOTAL_DISCOUNT = readString(dis);
					
					this.EXTN_TOTAL_TAX = readString(dis);
					
						this.EXTN_SHIP_ALONE_SKU_NO = (BigDecimal) dis.readObject();
					
					this.EXTN_REQ_SHIP_DATE = readDate(dis);
					
					this.EXTN_REQ_DELIVERY_DATE = readDate(dis);
					
					this.EXTN_SHIP_NOT_BEFORE_DATE = readDate(dis);
					
					this.EXTN_SHIP_NOT_AFTER_DATE = readDate(dis);
					
					this.EXTN_DELIVER_NOT_BEFORE_DT = readDate(dis);
					
					this.EXTN_DELIVER_NOT_AFTER_DT = readDate(dis);
					
					this.EXTN_MARK_FOR_STORE_NO = readString(dis);
					
					this.EXTN_IS_BACKORDERED = readString(dis);
					
					this.EXTN_LAST_PICK_DATE_FOR_CANCEL = readString(dis);
					
					this.EXTN_PICKUP_EMAIL_FLAG = readString(dis);
					
					this.EXTN_SHIP_COMPLETE = readString(dis);
					
					this.EXTN_SINGLE_CARTON = readString(dis);
					
					this.EXTN_REQ_CANCEL_DATE = readDate(dis);
					
					this.EXTN_VENDOR_SKU = readString(dis);
					
					this.EXTN_RESHIPPED_FLAG = readString(dis);
					
					this.EXTN_RETURNED_FLAG = readString(dis);
					
					this.EXTN_RESHIPPED_QTY = readString(dis);
					
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
				
						writeString(this.ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.ORDER_HEADER_KEY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIME_LINE_NO);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SUB_LINE_NO);
					
					// String
				
						writeString(this.LINE_TYPE,dos);
					
					// String
				
						writeString(this.ORDER_CLASS,dos);
					
					// String
				
						writeString(this.ITEM_ID,dos);
					
					// String
				
						writeString(this.ALTERNATE_ITEM_ID,dos);
					
					// String
				
						writeString(this.UOM,dos);
					
					// String
				
						writeString(this.PRODUCT_CLASS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.UNIT_PRICE);
					
					// String
				
						writeString(this.COST_CURRENCY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORDERED_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.BASIC_CAPACITY_REQUIRED);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OPTION_CAPACITY_REQUIRED);
					
					// String
				
						writeString(this.DEPENDENT_ON_LINE_KEY,dos);
					
					// String
				
						writeString(this.CURRENT_WORK_ORDER_KEY,dos);
					
					// String
				
						writeString(this.DEPENDENCY_SHIPPING_RULE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FILL_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.COMMITTED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEPENDENCY_RATIO);
					
					// String
				
						writeString(this.MAINTAIN_RATIO,dos);
					
					// String
				
						writeString(this.MERGE_NODE,dos);
					
					// String
				
						writeString(this.PARENT_OF_DEPENDENT_GROUP,dos);
					
					// String
				
						writeString(this.SOURCE_FROM_ORGANIZATION,dos);
					
					// String
				
						writeString(this.CHAINED_FROM_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.CHAINED_FROM_ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_RELEASE_KEY,dos);
					
					// String
				
						writeString(this.DISTRIBUTION_RULE_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OVER_RECEIPT_QUANTITY);
					
					// String
				
						writeString(this.RETURN_REASON,dos);
					
					// String
				
						writeString(this.SHIPNODE_KEY,dos);
					
					// String
				
						writeString(this.PROCURE_FROM_NODE,dos);
					
					// String
				
						writeString(this.SHIP_TO_KEY,dos);
					
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
				
						writeString(this.SCAC,dos);
					
					// String
				
						writeString(this.CARRIER_SERVICE_CODE,dos);
					
					// String
				
						writeString(this.CARRIER_ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.PICKABLE_FLAG,dos);
					
					// String
				
						writeString(this.SHIP_TOGETHER_NO,dos);
					
					// String
				
						writeString(this.HOLD_FLAG,dos);
					
					// String
				
						writeString(this.KIT_CODE,dos);
					
					// String
				
						writeString(this.HOLD_REASON_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OTHER_CHARGES);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LINE_TOTAL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_LINE_TOTAL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_EXTENDED_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SETTLED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SETTLED_AMOUNT);
					
					// String
				
						writeString(this.TAXABLE_FLAG,dos);
					
					// String
				
						writeString(this.TAX_EXEMPTION_CERTIFICATE,dos);
					
					// String
				
						writeString(this.DISCOUNT_TYPE,dos);
					
					// String
				
						writeString(this.DISCOUNT_REFERENCE,dos);
					
					// String
				
						writeString(this.GIFT_FLAG,dos);
					
					// String
				
						writeString(this.PERSONALIZE_FLAG,dos);
					
					// String
				
						writeString(this.PERSONALIZE_CODE,dos);
					
					// String
				
						writeString(this.DEPARTMENT_CODE,dos);
					
					// String
				
						writeString(this.CUSTOMER_ITEM,dos);
					
					// String
				
						writeString(this.CUSTOMER_ITEM_DESCRIPTION,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_WEIGHT);
					
					// String
				
						writeString(this.ITEM_WEIGHT_UOM,dos);
					
					// String
				
						writeString(this.ITEM_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_SHORT_DESCRIPTION,dos);
					
					// String
				
						writeString(this.RESERVATION_ID,dos);
					
					// String
				
						writeString(this.RESERVATION_POOL,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_LINE_NO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAX);
					
					// String
				
						writeString(this.DELIVERY_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_ORDERED_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LIST_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RETAIL_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DISCOUNT_PERCENTAGE);
					
					// String
				
						writeString(this.PACKLIST_TYPE,dos);
					
					// String
				
						writeString(this.SUPPLIER_ITEM,dos);
					
					// String
				
						writeString(this.SUPPLIER_ITEM_DESCRIPTION,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.UNIT_COST);
					
					// String
				
						writeString(this.UPC_CODE,dos);
					
					// String
				
						writeString(this.FOB,dos);
					
					// String
				
						writeString(this.MANUFACTURER_NAME,dos);
					
					// String
				
						writeString(this.MANUFACTURER_ITEM,dos);
					
					// String
				
						writeString(this.MANUFACTURER_ITEM_DESC,dos);
					
					// String
				
						writeString(this.COUNTRY_OF_ORIGIN,dos);
					
					// String
				
						writeString(this.ISBN,dos);
					
					// String
				
						writeString(this.HARMONIZED_CODE,dos);
					
					// String
				
						writeString(this.SHIP_TO_ID,dos);
					
					// String
				
						writeString(this.PRODUCT_LINE,dos);
					
					// String
				
						writeString(this.NMFC_CODE,dos);
					
					// String
				
						writeString(this.NMFC_CLASS,dos);
					
					// String
				
						writeString(this.NMFC_DESCRIPTION,dos);
					
					// String
				
						writeString(this.TAX_PRODUCT_CODE,dos);
					
					// String
				
						writeString(this.IMPORT_LICENSE_NO,dos);
					
					// java.util.Date
				
						writeDate(this.IMPORT_LICENSE_EXP_DATE,dos);
					
					// String
				
						writeString(this.ECCN_NO,dos);
					
					// String
				
						writeString(this.SCHEDULE_B_CODE,dos);
					
					// String
				
						writeString(this.SUPPLIER_CODE,dos);
					
					// String
				
						writeString(this.PURPOSE,dos);
					
					// String
				
						writeString(this.RECEIVING_NODE,dos);
					
					// String
				
						writeString(this.BUYER_RECEIVING_NODE_ID,dos);
					
					// String
				
						writeString(this.SHIPMENT_CONSOL_GROUP_ID,dos);
					
					// String
				
						writeString(this.ORIG_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.LINE_SEQ_NO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SPLIT_QTY);
					
					// java.util.Date
				
						writeDate(this.PRICING_DATE,dos);
					
					// String
				
						writeString(this.PIPELINE_KEY,dos);
					
					// String
				
						writeString(this.CONDITION_VARIABLE_1,dos);
					
					// String
				
						writeString(this.CONDITION_VARIABLE_2,dos);
					
					// String
				
						writeString(this.IS_PRICE_LOCKED,dos);
					
					// String
				
						writeString(this.IS_COST_OVERRIDDEN,dos);
					
					// String
				
						writeString(this.IS_CAPACITY_OVERRIDDEN,dos);
					
					// String
				
						writeString(this.INVOICE_COMPLETE,dos);
					
					// String
				
						writeString(this.DELIVERY_METHOD,dos);
					
					// String
				
						writeString(this.ITEM_GROUP_CODE,dos);
					
					// java.util.Date
				
						writeDate(this.CANNOT_COMPLETE_BEFORE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.CANNOT_COMPLETE_AFTER_DATE,dos);
					
					// String
				
						writeString(this.APPT_STATUS,dos);
					
					// String
				
						writeString(this.CAN_ADD_SERVICE_LINES,dos);
					
					// String
				
						writeString(this.PRICING_UOM,dos);
					
					// String
				
						writeString(this.CAPACITY_UOM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SHIPPED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIXED_CAPACITY_QTY_PER_LINE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIXED_PRICING_QTY_PER_LINE);
					
					// String
				
						writeString(this.WAIT_FOR_SEQ_LINE,dos);
					
					// String
				
						writeString(this.SCHED_FAILURE_REASON_CODE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_DELIVERY_DATE,dos);
					
					// String
				
						writeString(this.CANNOT_MEET_APPT,dos);
					
					// java.util.Date
				
						writeDate(this.PROMISED_APPT_START_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.PROMISED_APPT_END_DATE,dos);
					
					// String
				
						writeString(this.SEGMENT,dos);
					
					// String
				
						writeString(this.SEGMENT_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_SCHEDULE_DATE,dos);
					
					// String
				
						writeString(this.TIMEZONE,dos);
					
					// String
				
						writeString(this.IS_FORWARDING_ALLOWED,dos);
					
					// String
				
						writeString(this.IS_PROCUREMENT_ALLOWED,dos);
					
					// String
				
						writeString(this.RESHIP_PARENT_LINE_KEY,dos);
					
					// String
				
						writeString(this.BUNDLE_PARENT_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.IS_PRICE_INFO_ONLY,dos);
					
					// String
				
						writeString(this.LEVEL_OF_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIRST_ITER_SEQ_NO);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LAST_ITER_SEQ_NO);
					
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
				
						writeString(this.ORDERING_UOM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_QUANTITY_CONV_FACTOR);
					
					// String
				
						writeString(this.PRICING_QUANTITY_STRATEGY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_PRICING_QUANTITY);
					
					// String
				
						writeString(this.IS_STANDALONE_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TRAN_DISCREPANCY_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RECEIVED_QUANTITY);
					
					// String
				
						writeString(this.INVOICE_BASED_ON_ACTUALS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ACTUAL_PRICING_QUANTITY);
					
					// String
				
						writeString(this.FULFILLMENT_TYPE,dos);
					
					// String
				
						writeString(this.SERIAL_NO,dos);
					
					// String
				
						writeString(this.RESERVATION_MANDATORY,dos);
					
					// String
				
						writeString(this.IS_FIRM_PREDEFINED_NODE,dos);
					
					// String
				
						writeString(this.INTENTIONAL_BACKORDER,dos);
					
					// java.util.Date
				
						writeDate(this.FUTURE_AVAIL_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPRICING_QUANTITY);
					
					// java.util.Date
				
						writeDate(this.MIN_SHIP_BY_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.KIT_QTY);
					
					// String
				
						writeString(this.BOM_CONFIG_KEY,dos);
					
					// String
				
						writeString(this.BUNDLE_FULFILLMENT_MODE,dos);
					
					// String
				
						writeString(this.IS_GIFT_WRAP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.GROUP_SEQUENCE_NUM);
					
					// String
				
						writeString(this.IN_STORE_PAYMENT_REQUIRED,dos);
					
					// String
				
						writeString(this.ITEM_NOT_EXIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.BACKORDER_NOTIFICATION_QTY);
					
					// String
				
						writeString(this.IS_PRICE_MATCHED,dos);
					
					// String
				
						writeString(this.IS_PICK_UP_NOW,dos);
					
					// String
				
						writeString(this.ITEM_IS_IN_HAND,dos);
					
					// String
				
						writeString(this.DISPOSITION_CODE,dos);
					
					// String
				
						writeString(this.EXTN_PUBLISHED,dos);
					
					// String
				
						writeString(this.EXTN_LINE_TOTAL,dos);
					
					// String
				
						writeString(this.EXTN_ORDERED_QTY,dos);
					
					// String
				
						writeString(this.EXTN_SHIP_METHOD,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_DESC,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_CODE,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_DIV,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_CODE_STR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_ORIG_UNITPRICE);
					
					// String
				
						writeString(this.EXTN_REVIEW,dos);
					
					// String
				
						writeString(this.EXTN_LAST_PICK_DATE,dos);
					
					// String
				
						writeString(this.EXTN_PICK_DATE,dos);
					
					// String
				
						writeString(this.EXTN_RELEASE_ID,dos);
					
					// String
				
						writeString(this.EXTN_AVG_RATING,dos);
					
					// String
				
						writeString(this.EXTN_DESCRIPTION,dos);
					
					// String
				
						writeString(this.EXTN_ACT_ITEM_ID,dos);
					
					// String
				
						writeString(this.EXTN_VERTEX_ENGINE,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_EXT_ORD,dos);
					
					// String
				
						writeString(this.IS_ELIGIBLE_FOR_SHIP_DISC,dos);
					
					// String
				
						writeString(this.EXTN_SIGN_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_AMT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_DISC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_TAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_COMMISSION);
					
					// String
				
						writeString(this.EXTN_IS_GWP,dos);
					
					// String
				
						writeString(this.EXTN_CHANNEL_ITEM_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORIGINAL_TRACKING_NO,dos);
					
					// String
				
						writeString(this.EXTN_IS_MIGRATED,dos);
					
					// String
				
						writeString(this.EXTN_SDK_LINE,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_TAX,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_SHIP_ALONE_SKU_NO);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_DELIVERY_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_SHIP_NOT_BEFORE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_SHIP_NOT_AFTER_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVER_NOT_BEFORE_DT,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVER_NOT_AFTER_DT,dos);
					
					// String
				
						writeString(this.EXTN_MARK_FOR_STORE_NO,dos);
					
					// String
				
						writeString(this.EXTN_IS_BACKORDERED,dos);
					
					// String
				
						writeString(this.EXTN_LAST_PICK_DATE_FOR_CANCEL,dos);
					
					// String
				
						writeString(this.EXTN_PICKUP_EMAIL_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.EXTN_SINGLE_CARTON,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_CANCEL_DATE,dos);
					
					// String
				
						writeString(this.EXTN_VENDOR_SKU,dos);
					
					// String
				
						writeString(this.EXTN_RESHIPPED_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_RETURNED_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_RESHIPPED_QTY,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.ORDER_HEADER_KEY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRIME_LINE_NO);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SUB_LINE_NO);
					
					// String
				
						writeString(this.LINE_TYPE,dos);
					
					// String
				
						writeString(this.ORDER_CLASS,dos);
					
					// String
				
						writeString(this.ITEM_ID,dos);
					
					// String
				
						writeString(this.ALTERNATE_ITEM_ID,dos);
					
					// String
				
						writeString(this.UOM,dos);
					
					// String
				
						writeString(this.PRODUCT_CLASS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.UNIT_PRICE);
					
					// String
				
						writeString(this.COST_CURRENCY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORDERED_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.BASIC_CAPACITY_REQUIRED);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OPTION_CAPACITY_REQUIRED);
					
					// String
				
						writeString(this.DEPENDENT_ON_LINE_KEY,dos);
					
					// String
				
						writeString(this.CURRENT_WORK_ORDER_KEY,dos);
					
					// String
				
						writeString(this.DEPENDENCY_SHIPPING_RULE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FILL_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.COMMITTED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DEPENDENCY_RATIO);
					
					// String
				
						writeString(this.MAINTAIN_RATIO,dos);
					
					// String
				
						writeString(this.MERGE_NODE,dos);
					
					// String
				
						writeString(this.PARENT_OF_DEPENDENT_GROUP,dos);
					
					// String
				
						writeString(this.SOURCE_FROM_ORGANIZATION,dos);
					
					// String
				
						writeString(this.CHAINED_FROM_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.CHAINED_FROM_ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_HEADER_KEY,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_ORDER_RELEASE_KEY,dos);
					
					// String
				
						writeString(this.DISTRIBUTION_RULE_ID,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OVER_RECEIPT_QUANTITY);
					
					// String
				
						writeString(this.RETURN_REASON,dos);
					
					// String
				
						writeString(this.SHIPNODE_KEY,dos);
					
					// String
				
						writeString(this.PROCURE_FROM_NODE,dos);
					
					// String
				
						writeString(this.SHIP_TO_KEY,dos);
					
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
				
						writeString(this.SCAC,dos);
					
					// String
				
						writeString(this.CARRIER_SERVICE_CODE,dos);
					
					// String
				
						writeString(this.CARRIER_ACCOUNT_NO,dos);
					
					// String
				
						writeString(this.PICKABLE_FLAG,dos);
					
					// String
				
						writeString(this.SHIP_TOGETHER_NO,dos);
					
					// String
				
						writeString(this.HOLD_FLAG,dos);
					
					// String
				
						writeString(this.KIT_CODE,dos);
					
					// String
				
						writeString(this.HOLD_REASON_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.OTHER_CHARGES);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LINE_TOTAL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_LINE_TOTAL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_EXTENDED_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SETTLED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SETTLED_AMOUNT);
					
					// String
				
						writeString(this.TAXABLE_FLAG,dos);
					
					// String
				
						writeString(this.TAX_EXEMPTION_CERTIFICATE,dos);
					
					// String
				
						writeString(this.DISCOUNT_TYPE,dos);
					
					// String
				
						writeString(this.DISCOUNT_REFERENCE,dos);
					
					// String
				
						writeString(this.GIFT_FLAG,dos);
					
					// String
				
						writeString(this.PERSONALIZE_FLAG,dos);
					
					// String
				
						writeString(this.PERSONALIZE_CODE,dos);
					
					// String
				
						writeString(this.DEPARTMENT_CODE,dos);
					
					// String
				
						writeString(this.CUSTOMER_ITEM,dos);
					
					// String
				
						writeString(this.CUSTOMER_ITEM_DESCRIPTION,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_WEIGHT);
					
					// String
				
						writeString(this.ITEM_WEIGHT_UOM,dos);
					
					// String
				
						writeString(this.ITEM_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_SHORT_DESCRIPTION,dos);
					
					// String
				
						writeString(this.RESERVATION_ID,dos);
					
					// String
				
						writeString(this.RESERVATION_POOL,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_NO,dos);
					
					// String
				
						writeString(this.CUSTOMER_PO_LINE_NO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TAX);
					
					// String
				
						writeString(this.DELIVERY_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ORIGINAL_ORDERED_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LIST_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RETAIL_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DISCOUNT_PERCENTAGE);
					
					// String
				
						writeString(this.PACKLIST_TYPE,dos);
					
					// String
				
						writeString(this.SUPPLIER_ITEM,dos);
					
					// String
				
						writeString(this.SUPPLIER_ITEM_DESCRIPTION,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.UNIT_COST);
					
					// String
				
						writeString(this.UPC_CODE,dos);
					
					// String
				
						writeString(this.FOB,dos);
					
					// String
				
						writeString(this.MANUFACTURER_NAME,dos);
					
					// String
				
						writeString(this.MANUFACTURER_ITEM,dos);
					
					// String
				
						writeString(this.MANUFACTURER_ITEM_DESC,dos);
					
					// String
				
						writeString(this.COUNTRY_OF_ORIGIN,dos);
					
					// String
				
						writeString(this.ISBN,dos);
					
					// String
				
						writeString(this.HARMONIZED_CODE,dos);
					
					// String
				
						writeString(this.SHIP_TO_ID,dos);
					
					// String
				
						writeString(this.PRODUCT_LINE,dos);
					
					// String
				
						writeString(this.NMFC_CODE,dos);
					
					// String
				
						writeString(this.NMFC_CLASS,dos);
					
					// String
				
						writeString(this.NMFC_DESCRIPTION,dos);
					
					// String
				
						writeString(this.TAX_PRODUCT_CODE,dos);
					
					// String
				
						writeString(this.IMPORT_LICENSE_NO,dos);
					
					// java.util.Date
				
						writeDate(this.IMPORT_LICENSE_EXP_DATE,dos);
					
					// String
				
						writeString(this.ECCN_NO,dos);
					
					// String
				
						writeString(this.SCHEDULE_B_CODE,dos);
					
					// String
				
						writeString(this.SUPPLIER_CODE,dos);
					
					// String
				
						writeString(this.PURPOSE,dos);
					
					// String
				
						writeString(this.RECEIVING_NODE,dos);
					
					// String
				
						writeString(this.BUYER_RECEIVING_NODE_ID,dos);
					
					// String
				
						writeString(this.SHIPMENT_CONSOL_GROUP_ID,dos);
					
					// String
				
						writeString(this.ORIG_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.LINE_SEQ_NO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SPLIT_QTY);
					
					// java.util.Date
				
						writeDate(this.PRICING_DATE,dos);
					
					// String
				
						writeString(this.PIPELINE_KEY,dos);
					
					// String
				
						writeString(this.CONDITION_VARIABLE_1,dos);
					
					// String
				
						writeString(this.CONDITION_VARIABLE_2,dos);
					
					// String
				
						writeString(this.IS_PRICE_LOCKED,dos);
					
					// String
				
						writeString(this.IS_COST_OVERRIDDEN,dos);
					
					// String
				
						writeString(this.IS_CAPACITY_OVERRIDDEN,dos);
					
					// String
				
						writeString(this.INVOICE_COMPLETE,dos);
					
					// String
				
						writeString(this.DELIVERY_METHOD,dos);
					
					// String
				
						writeString(this.ITEM_GROUP_CODE,dos);
					
					// java.util.Date
				
						writeDate(this.CANNOT_COMPLETE_BEFORE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.CANNOT_COMPLETE_AFTER_DATE,dos);
					
					// String
				
						writeString(this.APPT_STATUS,dos);
					
					// String
				
						writeString(this.CAN_ADD_SERVICE_LINES,dos);
					
					// String
				
						writeString(this.PRICING_UOM,dos);
					
					// String
				
						writeString(this.CAPACITY_UOM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SHIPPED_QUANTITY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIXED_CAPACITY_QTY_PER_LINE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIXED_PRICING_QTY_PER_LINE);
					
					// String
				
						writeString(this.WAIT_FOR_SEQ_LINE,dos);
					
					// String
				
						writeString(this.SCHED_FAILURE_REASON_CODE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_DELIVERY_DATE,dos);
					
					// String
				
						writeString(this.CANNOT_MEET_APPT,dos);
					
					// java.util.Date
				
						writeDate(this.PROMISED_APPT_START_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.PROMISED_APPT_END_DATE,dos);
					
					// String
				
						writeString(this.SEGMENT,dos);
					
					// String
				
						writeString(this.SEGMENT_TYPE,dos);
					
					// java.util.Date
				
						writeDate(this.EARLIEST_SCHEDULE_DATE,dos);
					
					// String
				
						writeString(this.TIMEZONE,dos);
					
					// String
				
						writeString(this.IS_FORWARDING_ALLOWED,dos);
					
					// String
				
						writeString(this.IS_PROCUREMENT_ALLOWED,dos);
					
					// String
				
						writeString(this.RESHIP_PARENT_LINE_KEY,dos);
					
					// String
				
						writeString(this.BUNDLE_PARENT_ORDER_LINE_KEY,dos);
					
					// String
				
						writeString(this.IS_PRICE_INFO_ONLY,dos);
					
					// String
				
						writeString(this.LEVEL_OF_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FIRST_ITER_SEQ_NO);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LAST_ITER_SEQ_NO);
					
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
				
						writeString(this.ORDERING_UOM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PRICING_QUANTITY_CONV_FACTOR);
					
					// String
				
						writeString(this.PRICING_QUANTITY_STRATEGY,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INVOICED_PRICING_QUANTITY);
					
					// String
				
						writeString(this.IS_STANDALONE_SERVICE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TRAN_DISCREPANCY_QTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.RECEIVED_QUANTITY);
					
					// String
				
						writeString(this.INVOICE_BASED_ON_ACTUALS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ACTUAL_PRICING_QUANTITY);
					
					// String
				
						writeString(this.FULFILLMENT_TYPE,dos);
					
					// String
				
						writeString(this.SERIAL_NO,dos);
					
					// String
				
						writeString(this.RESERVATION_MANDATORY,dos);
					
					// String
				
						writeString(this.IS_FIRM_PREDEFINED_NODE,dos);
					
					// String
				
						writeString(this.INTENTIONAL_BACKORDER,dos);
					
					// java.util.Date
				
						writeDate(this.FUTURE_AVAIL_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPRICING_QUANTITY);
					
					// java.util.Date
				
						writeDate(this.MIN_SHIP_BY_DATE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.KIT_QTY);
					
					// String
				
						writeString(this.BOM_CONFIG_KEY,dos);
					
					// String
				
						writeString(this.BUNDLE_FULFILLMENT_MODE,dos);
					
					// String
				
						writeString(this.IS_GIFT_WRAP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.GROUP_SEQUENCE_NUM);
					
					// String
				
						writeString(this.IN_STORE_PAYMENT_REQUIRED,dos);
					
					// String
				
						writeString(this.ITEM_NOT_EXIST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.BACKORDER_NOTIFICATION_QTY);
					
					// String
				
						writeString(this.IS_PRICE_MATCHED,dos);
					
					// String
				
						writeString(this.IS_PICK_UP_NOW,dos);
					
					// String
				
						writeString(this.ITEM_IS_IN_HAND,dos);
					
					// String
				
						writeString(this.DISPOSITION_CODE,dos);
					
					// String
				
						writeString(this.EXTN_PUBLISHED,dos);
					
					// String
				
						writeString(this.EXTN_LINE_TOTAL,dos);
					
					// String
				
						writeString(this.EXTN_ORDERED_QTY,dos);
					
					// String
				
						writeString(this.EXTN_SHIP_METHOD,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_DESC,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_TYPE,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_CODE,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_DIV,dos);
					
					// String
				
						writeString(this.EXTN_PRICE_MOD_CODE_STR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_ORIG_UNITPRICE);
					
					// String
				
						writeString(this.EXTN_REVIEW,dos);
					
					// String
				
						writeString(this.EXTN_LAST_PICK_DATE,dos);
					
					// String
				
						writeString(this.EXTN_PICK_DATE,dos);
					
					// String
				
						writeString(this.EXTN_RELEASE_ID,dos);
					
					// String
				
						writeString(this.EXTN_AVG_RATING,dos);
					
					// String
				
						writeString(this.EXTN_DESCRIPTION,dos);
					
					// String
				
						writeString(this.EXTN_ACT_ITEM_ID,dos);
					
					// String
				
						writeString(this.EXTN_VERTEX_ENGINE,dos);
					
					// String
				
						writeString(this.DERIVED_FROM_EXT_ORD,dos);
					
					// String
				
						writeString(this.IS_ELIGIBLE_FOR_SHIP_DISC,dos);
					
					// String
				
						writeString(this.EXTN_SIGN_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_AMT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_DISC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_SHIP_TAX);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_MKTPLACE_COMMISSION);
					
					// String
				
						writeString(this.EXTN_IS_GWP,dos);
					
					// String
				
						writeString(this.EXTN_CHANNEL_ITEM_ID,dos);
					
					// String
				
						writeString(this.EXTN_ORIGINAL_TRACKING_NO,dos);
					
					// String
				
						writeString(this.EXTN_IS_MIGRATED,dos);
					
					// String
				
						writeString(this.EXTN_SDK_LINE,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_DISCOUNT,dos);
					
					// String
				
						writeString(this.EXTN_TOTAL_TAX,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.EXTN_SHIP_ALONE_SKU_NO);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_SHIP_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_DELIVERY_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_SHIP_NOT_BEFORE_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_SHIP_NOT_AFTER_DATE,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVER_NOT_BEFORE_DT,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_DELIVER_NOT_AFTER_DT,dos);
					
					// String
				
						writeString(this.EXTN_MARK_FOR_STORE_NO,dos);
					
					// String
				
						writeString(this.EXTN_IS_BACKORDERED,dos);
					
					// String
				
						writeString(this.EXTN_LAST_PICK_DATE_FOR_CANCEL,dos);
					
					// String
				
						writeString(this.EXTN_PICKUP_EMAIL_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_SHIP_COMPLETE,dos);
					
					// String
				
						writeString(this.EXTN_SINGLE_CARTON,dos);
					
					// java.util.Date
				
						writeDate(this.EXTN_REQ_CANCEL_DATE,dos);
					
					// String
				
						writeString(this.EXTN_VENDOR_SKU,dos);
					
					// String
				
						writeString(this.EXTN_RESHIPPED_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_RETURNED_FLAG,dos);
					
					// String
				
						writeString(this.EXTN_RESHIPPED_QTY,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ORDER_LINE_KEY="+ORDER_LINE_KEY);
		sb.append(",ORDER_HEADER_KEY="+ORDER_HEADER_KEY);
		sb.append(",PRIME_LINE_NO="+String.valueOf(PRIME_LINE_NO));
		sb.append(",SUB_LINE_NO="+String.valueOf(SUB_LINE_NO));
		sb.append(",LINE_TYPE="+LINE_TYPE);
		sb.append(",ORDER_CLASS="+ORDER_CLASS);
		sb.append(",ITEM_ID="+ITEM_ID);
		sb.append(",ALTERNATE_ITEM_ID="+ALTERNATE_ITEM_ID);
		sb.append(",UOM="+UOM);
		sb.append(",PRODUCT_CLASS="+PRODUCT_CLASS);
		sb.append(",UNIT_PRICE="+String.valueOf(UNIT_PRICE));
		sb.append(",COST_CURRENCY="+COST_CURRENCY);
		sb.append(",ORDERED_QTY="+String.valueOf(ORDERED_QTY));
		sb.append(",BASIC_CAPACITY_REQUIRED="+String.valueOf(BASIC_CAPACITY_REQUIRED));
		sb.append(",OPTION_CAPACITY_REQUIRED="+String.valueOf(OPTION_CAPACITY_REQUIRED));
		sb.append(",DEPENDENT_ON_LINE_KEY="+DEPENDENT_ON_LINE_KEY);
		sb.append(",CURRENT_WORK_ORDER_KEY="+CURRENT_WORK_ORDER_KEY);
		sb.append(",DEPENDENCY_SHIPPING_RULE="+DEPENDENCY_SHIPPING_RULE);
		sb.append(",FILL_QUANTITY="+String.valueOf(FILL_QUANTITY));
		sb.append(",COMMITTED_QUANTITY="+String.valueOf(COMMITTED_QUANTITY));
		sb.append(",DEPENDENCY_RATIO="+String.valueOf(DEPENDENCY_RATIO));
		sb.append(",MAINTAIN_RATIO="+MAINTAIN_RATIO);
		sb.append(",MERGE_NODE="+MERGE_NODE);
		sb.append(",PARENT_OF_DEPENDENT_GROUP="+PARENT_OF_DEPENDENT_GROUP);
		sb.append(",SOURCE_FROM_ORGANIZATION="+SOURCE_FROM_ORGANIZATION);
		sb.append(",CHAINED_FROM_ORDER_LINE_KEY="+CHAINED_FROM_ORDER_LINE_KEY);
		sb.append(",CHAINED_FROM_ORDER_HEADER_KEY="+CHAINED_FROM_ORDER_HEADER_KEY);
		sb.append(",DERIVED_FROM_ORDER_LINE_KEY="+DERIVED_FROM_ORDER_LINE_KEY);
		sb.append(",DERIVED_FROM_ORDER_HEADER_KEY="+DERIVED_FROM_ORDER_HEADER_KEY);
		sb.append(",DERIVED_FROM_ORDER_RELEASE_KEY="+DERIVED_FROM_ORDER_RELEASE_KEY);
		sb.append(",DISTRIBUTION_RULE_ID="+DISTRIBUTION_RULE_ID);
		sb.append(",INVOICED_QUANTITY="+String.valueOf(INVOICED_QUANTITY));
		sb.append(",OVER_RECEIPT_QUANTITY="+String.valueOf(OVER_RECEIPT_QUANTITY));
		sb.append(",RETURN_REASON="+RETURN_REASON);
		sb.append(",SHIPNODE_KEY="+SHIPNODE_KEY);
		sb.append(",PROCURE_FROM_NODE="+PROCURE_FROM_NODE);
		sb.append(",SHIP_TO_KEY="+SHIP_TO_KEY);
		sb.append(",MARK_FOR_KEY="+MARK_FOR_KEY);
		sb.append(",BUYER_MARK_FOR_NODE_ID="+BUYER_MARK_FOR_NODE_ID);
		sb.append(",REQ_DELIVERY_DATE="+String.valueOf(REQ_DELIVERY_DATE));
		sb.append(",REQ_CANCEL_DATE="+String.valueOf(REQ_CANCEL_DATE));
		sb.append(",REQ_SHIP_DATE="+String.valueOf(REQ_SHIP_DATE));
		sb.append(",SCAC="+SCAC);
		sb.append(",CARRIER_SERVICE_CODE="+CARRIER_SERVICE_CODE);
		sb.append(",CARRIER_ACCOUNT_NO="+CARRIER_ACCOUNT_NO);
		sb.append(",PICKABLE_FLAG="+PICKABLE_FLAG);
		sb.append(",SHIP_TOGETHER_NO="+SHIP_TOGETHER_NO);
		sb.append(",HOLD_FLAG="+HOLD_FLAG);
		sb.append(",KIT_CODE="+KIT_CODE);
		sb.append(",HOLD_REASON_CODE="+HOLD_REASON_CODE);
		sb.append(",OTHER_CHARGES="+String.valueOf(OTHER_CHARGES));
		sb.append(",LINE_TOTAL="+String.valueOf(LINE_TOTAL));
		sb.append(",INVOICED_LINE_TOTAL="+String.valueOf(INVOICED_LINE_TOTAL));
		sb.append(",INVOICED_EXTENDED_PRICE="+String.valueOf(INVOICED_EXTENDED_PRICE));
		sb.append(",SETTLED_QUANTITY="+String.valueOf(SETTLED_QUANTITY));
		sb.append(",SETTLED_AMOUNT="+String.valueOf(SETTLED_AMOUNT));
		sb.append(",TAXABLE_FLAG="+TAXABLE_FLAG);
		sb.append(",TAX_EXEMPTION_CERTIFICATE="+TAX_EXEMPTION_CERTIFICATE);
		sb.append(",DISCOUNT_TYPE="+DISCOUNT_TYPE);
		sb.append(",DISCOUNT_REFERENCE="+DISCOUNT_REFERENCE);
		sb.append(",GIFT_FLAG="+GIFT_FLAG);
		sb.append(",PERSONALIZE_FLAG="+PERSONALIZE_FLAG);
		sb.append(",PERSONALIZE_CODE="+PERSONALIZE_CODE);
		sb.append(",DEPARTMENT_CODE="+DEPARTMENT_CODE);
		sb.append(",CUSTOMER_ITEM="+CUSTOMER_ITEM);
		sb.append(",CUSTOMER_ITEM_DESCRIPTION="+CUSTOMER_ITEM_DESCRIPTION);
		sb.append(",ITEM_WEIGHT="+String.valueOf(ITEM_WEIGHT));
		sb.append(",ITEM_WEIGHT_UOM="+ITEM_WEIGHT_UOM);
		sb.append(",ITEM_DESCRIPTION="+ITEM_DESCRIPTION);
		sb.append(",ITEM_SHORT_DESCRIPTION="+ITEM_SHORT_DESCRIPTION);
		sb.append(",RESERVATION_ID="+RESERVATION_ID);
		sb.append(",RESERVATION_POOL="+RESERVATION_POOL);
		sb.append(",CUSTOMER_PO_NO="+CUSTOMER_PO_NO);
		sb.append(",CUSTOMER_PO_LINE_NO="+CUSTOMER_PO_LINE_NO);
		sb.append(",TAX="+String.valueOf(TAX));
		sb.append(",DELIVERY_CODE="+DELIVERY_CODE);
		sb.append(",ORIGINAL_ORDERED_QTY="+String.valueOf(ORIGINAL_ORDERED_QTY));
		sb.append(",LIST_PRICE="+String.valueOf(LIST_PRICE));
		sb.append(",RETAIL_PRICE="+String.valueOf(RETAIL_PRICE));
		sb.append(",DISCOUNT_PERCENTAGE="+String.valueOf(DISCOUNT_PERCENTAGE));
		sb.append(",PACKLIST_TYPE="+PACKLIST_TYPE);
		sb.append(",SUPPLIER_ITEM="+SUPPLIER_ITEM);
		sb.append(",SUPPLIER_ITEM_DESCRIPTION="+SUPPLIER_ITEM_DESCRIPTION);
		sb.append(",UNIT_COST="+String.valueOf(UNIT_COST));
		sb.append(",UPC_CODE="+UPC_CODE);
		sb.append(",FOB="+FOB);
		sb.append(",MANUFACTURER_NAME="+MANUFACTURER_NAME);
		sb.append(",MANUFACTURER_ITEM="+MANUFACTURER_ITEM);
		sb.append(",MANUFACTURER_ITEM_DESC="+MANUFACTURER_ITEM_DESC);
		sb.append(",COUNTRY_OF_ORIGIN="+COUNTRY_OF_ORIGIN);
		sb.append(",ISBN="+ISBN);
		sb.append(",HARMONIZED_CODE="+HARMONIZED_CODE);
		sb.append(",SHIP_TO_ID="+SHIP_TO_ID);
		sb.append(",PRODUCT_LINE="+PRODUCT_LINE);
		sb.append(",NMFC_CODE="+NMFC_CODE);
		sb.append(",NMFC_CLASS="+NMFC_CLASS);
		sb.append(",NMFC_DESCRIPTION="+NMFC_DESCRIPTION);
		sb.append(",TAX_PRODUCT_CODE="+TAX_PRODUCT_CODE);
		sb.append(",IMPORT_LICENSE_NO="+IMPORT_LICENSE_NO);
		sb.append(",IMPORT_LICENSE_EXP_DATE="+String.valueOf(IMPORT_LICENSE_EXP_DATE));
		sb.append(",ECCN_NO="+ECCN_NO);
		sb.append(",SCHEDULE_B_CODE="+SCHEDULE_B_CODE);
		sb.append(",SUPPLIER_CODE="+SUPPLIER_CODE);
		sb.append(",PURPOSE="+PURPOSE);
		sb.append(",RECEIVING_NODE="+RECEIVING_NODE);
		sb.append(",BUYER_RECEIVING_NODE_ID="+BUYER_RECEIVING_NODE_ID);
		sb.append(",SHIPMENT_CONSOL_GROUP_ID="+SHIPMENT_CONSOL_GROUP_ID);
		sb.append(",ORIG_ORDER_LINE_KEY="+ORIG_ORDER_LINE_KEY);
		sb.append(",LINE_SEQ_NO="+LINE_SEQ_NO);
		sb.append(",SPLIT_QTY="+String.valueOf(SPLIT_QTY));
		sb.append(",PRICING_DATE="+String.valueOf(PRICING_DATE));
		sb.append(",PIPELINE_KEY="+PIPELINE_KEY);
		sb.append(",CONDITION_VARIABLE_1="+CONDITION_VARIABLE_1);
		sb.append(",CONDITION_VARIABLE_2="+CONDITION_VARIABLE_2);
		sb.append(",IS_PRICE_LOCKED="+IS_PRICE_LOCKED);
		sb.append(",IS_COST_OVERRIDDEN="+IS_COST_OVERRIDDEN);
		sb.append(",IS_CAPACITY_OVERRIDDEN="+IS_CAPACITY_OVERRIDDEN);
		sb.append(",INVOICE_COMPLETE="+INVOICE_COMPLETE);
		sb.append(",DELIVERY_METHOD="+DELIVERY_METHOD);
		sb.append(",ITEM_GROUP_CODE="+ITEM_GROUP_CODE);
		sb.append(",CANNOT_COMPLETE_BEFORE_DATE="+String.valueOf(CANNOT_COMPLETE_BEFORE_DATE));
		sb.append(",CANNOT_COMPLETE_AFTER_DATE="+String.valueOf(CANNOT_COMPLETE_AFTER_DATE));
		sb.append(",APPT_STATUS="+APPT_STATUS);
		sb.append(",CAN_ADD_SERVICE_LINES="+CAN_ADD_SERVICE_LINES);
		sb.append(",PRICING_UOM="+PRICING_UOM);
		sb.append(",CAPACITY_UOM="+CAPACITY_UOM);
		sb.append(",PRICING_QUANTITY="+String.valueOf(PRICING_QUANTITY));
		sb.append(",SHIPPED_QUANTITY="+String.valueOf(SHIPPED_QUANTITY));
		sb.append(",FIXED_CAPACITY_QTY_PER_LINE="+String.valueOf(FIXED_CAPACITY_QTY_PER_LINE));
		sb.append(",FIXED_PRICING_QTY_PER_LINE="+String.valueOf(FIXED_PRICING_QTY_PER_LINE));
		sb.append(",WAIT_FOR_SEQ_LINE="+WAIT_FOR_SEQ_LINE);
		sb.append(",SCHED_FAILURE_REASON_CODE="+SCHED_FAILURE_REASON_CODE);
		sb.append(",EARLIEST_SHIP_DATE="+String.valueOf(EARLIEST_SHIP_DATE));
		sb.append(",EARLIEST_DELIVERY_DATE="+String.valueOf(EARLIEST_DELIVERY_DATE));
		sb.append(",CANNOT_MEET_APPT="+CANNOT_MEET_APPT);
		sb.append(",PROMISED_APPT_START_DATE="+String.valueOf(PROMISED_APPT_START_DATE));
		sb.append(",PROMISED_APPT_END_DATE="+String.valueOf(PROMISED_APPT_END_DATE));
		sb.append(",SEGMENT="+SEGMENT);
		sb.append(",SEGMENT_TYPE="+SEGMENT_TYPE);
		sb.append(",EARLIEST_SCHEDULE_DATE="+String.valueOf(EARLIEST_SCHEDULE_DATE));
		sb.append(",TIMEZONE="+TIMEZONE);
		sb.append(",IS_FORWARDING_ALLOWED="+IS_FORWARDING_ALLOWED);
		sb.append(",IS_PROCUREMENT_ALLOWED="+IS_PROCUREMENT_ALLOWED);
		sb.append(",RESHIP_PARENT_LINE_KEY="+RESHIP_PARENT_LINE_KEY);
		sb.append(",BUNDLE_PARENT_ORDER_LINE_KEY="+BUNDLE_PARENT_ORDER_LINE_KEY);
		sb.append(",IS_PRICE_INFO_ONLY="+IS_PRICE_INFO_ONLY);
		sb.append(",LEVEL_OF_SERVICE="+LEVEL_OF_SERVICE);
		sb.append(",FIRST_ITER_SEQ_NO="+String.valueOf(FIRST_ITER_SEQ_NO));
		sb.append(",LAST_ITER_SEQ_NO="+String.valueOf(LAST_ITER_SEQ_NO));
		sb.append(",CREATETS="+String.valueOf(CREATETS));
		sb.append(",MODIFYTS="+String.valueOf(MODIFYTS));
		sb.append(",CREATEUSERID="+CREATEUSERID);
		sb.append(",MODIFYUSERID="+MODIFYUSERID);
		sb.append(",CREATEPROGID="+CREATEPROGID);
		sb.append(",MODIFYPROGID="+MODIFYPROGID);
		sb.append(",LOCKID="+String.valueOf(LOCKID));
		sb.append(",ORDERING_UOM="+ORDERING_UOM);
		sb.append(",PRICING_QUANTITY_CONV_FACTOR="+String.valueOf(PRICING_QUANTITY_CONV_FACTOR));
		sb.append(",PRICING_QUANTITY_STRATEGY="+PRICING_QUANTITY_STRATEGY);
		sb.append(",INVOICED_PRICING_QUANTITY="+String.valueOf(INVOICED_PRICING_QUANTITY));
		sb.append(",IS_STANDALONE_SERVICE="+IS_STANDALONE_SERVICE);
		sb.append(",TRAN_DISCREPANCY_QTY="+String.valueOf(TRAN_DISCREPANCY_QTY));
		sb.append(",RECEIVED_QUANTITY="+String.valueOf(RECEIVED_QUANTITY));
		sb.append(",INVOICE_BASED_ON_ACTUALS="+INVOICE_BASED_ON_ACTUALS);
		sb.append(",ACTUAL_PRICING_QUANTITY="+String.valueOf(ACTUAL_PRICING_QUANTITY));
		sb.append(",FULFILLMENT_TYPE="+FULFILLMENT_TYPE);
		sb.append(",SERIAL_NO="+SERIAL_NO);
		sb.append(",RESERVATION_MANDATORY="+RESERVATION_MANDATORY);
		sb.append(",IS_FIRM_PREDEFINED_NODE="+IS_FIRM_PREDEFINED_NODE);
		sb.append(",INTENTIONAL_BACKORDER="+INTENTIONAL_BACKORDER);
		sb.append(",FUTURE_AVAIL_DATE="+String.valueOf(FUTURE_AVAIL_DATE));
		sb.append(",REPRICING_QUANTITY="+String.valueOf(REPRICING_QUANTITY));
		sb.append(",MIN_SHIP_BY_DATE="+String.valueOf(MIN_SHIP_BY_DATE));
		sb.append(",KIT_QTY="+String.valueOf(KIT_QTY));
		sb.append(",BOM_CONFIG_KEY="+BOM_CONFIG_KEY);
		sb.append(",BUNDLE_FULFILLMENT_MODE="+BUNDLE_FULFILLMENT_MODE);
		sb.append(",IS_GIFT_WRAP="+IS_GIFT_WRAP);
		sb.append(",GROUP_SEQUENCE_NUM="+String.valueOf(GROUP_SEQUENCE_NUM));
		sb.append(",IN_STORE_PAYMENT_REQUIRED="+IN_STORE_PAYMENT_REQUIRED);
		sb.append(",ITEM_NOT_EXIST="+ITEM_NOT_EXIST);
		sb.append(",BACKORDER_NOTIFICATION_QTY="+String.valueOf(BACKORDER_NOTIFICATION_QTY));
		sb.append(",IS_PRICE_MATCHED="+IS_PRICE_MATCHED);
		sb.append(",IS_PICK_UP_NOW="+IS_PICK_UP_NOW);
		sb.append(",ITEM_IS_IN_HAND="+ITEM_IS_IN_HAND);
		sb.append(",DISPOSITION_CODE="+DISPOSITION_CODE);
		sb.append(",EXTN_PUBLISHED="+EXTN_PUBLISHED);
		sb.append(",EXTN_LINE_TOTAL="+EXTN_LINE_TOTAL);
		sb.append(",EXTN_ORDERED_QTY="+EXTN_ORDERED_QTY);
		sb.append(",EXTN_SHIP_METHOD="+EXTN_SHIP_METHOD);
		sb.append(",EXTN_PRICE_MOD="+EXTN_PRICE_MOD);
		sb.append(",EXTN_PRICE_MOD_DESC="+EXTN_PRICE_MOD_DESC);
		sb.append(",EXTN_PRICE_MOD_TYPE="+EXTN_PRICE_MOD_TYPE);
		sb.append(",EXTN_PRICE_MOD_CODE="+EXTN_PRICE_MOD_CODE);
		sb.append(",EXTN_PRICE_MOD_DIV="+EXTN_PRICE_MOD_DIV);
		sb.append(",EXTN_PRICE_MOD_CODE_STR="+EXTN_PRICE_MOD_CODE_STR);
		sb.append(",EXTN_ORIG_UNITPRICE="+String.valueOf(EXTN_ORIG_UNITPRICE));
		sb.append(",EXTN_REVIEW="+EXTN_REVIEW);
		sb.append(",EXTN_LAST_PICK_DATE="+EXTN_LAST_PICK_DATE);
		sb.append(",EXTN_PICK_DATE="+EXTN_PICK_DATE);
		sb.append(",EXTN_RELEASE_ID="+EXTN_RELEASE_ID);
		sb.append(",EXTN_AVG_RATING="+EXTN_AVG_RATING);
		sb.append(",EXTN_DESCRIPTION="+EXTN_DESCRIPTION);
		sb.append(",EXTN_ACT_ITEM_ID="+EXTN_ACT_ITEM_ID);
		sb.append(",EXTN_VERTEX_ENGINE="+EXTN_VERTEX_ENGINE);
		sb.append(",DERIVED_FROM_EXT_ORD="+DERIVED_FROM_EXT_ORD);
		sb.append(",IS_ELIGIBLE_FOR_SHIP_DISC="+IS_ELIGIBLE_FOR_SHIP_DISC);
		sb.append(",EXTN_SIGN_TYPE="+EXTN_SIGN_TYPE);
		sb.append(",EXTN_MKTPLACE_SHIP_AMT="+String.valueOf(EXTN_MKTPLACE_SHIP_AMT));
		sb.append(",EXTN_MKTPLACE_SHIP_DISC="+String.valueOf(EXTN_MKTPLACE_SHIP_DISC));
		sb.append(",EXTN_MKTPLACE_SHIP_TAX="+String.valueOf(EXTN_MKTPLACE_SHIP_TAX));
		sb.append(",EXTN_MKTPLACE_COMMISSION="+String.valueOf(EXTN_MKTPLACE_COMMISSION));
		sb.append(",EXTN_IS_GWP="+EXTN_IS_GWP);
		sb.append(",EXTN_CHANNEL_ITEM_ID="+EXTN_CHANNEL_ITEM_ID);
		sb.append(",EXTN_ORIGINAL_TRACKING_NO="+EXTN_ORIGINAL_TRACKING_NO);
		sb.append(",EXTN_IS_MIGRATED="+EXTN_IS_MIGRATED);
		sb.append(",EXTN_SDK_LINE="+EXTN_SDK_LINE);
		sb.append(",EXTN_TOTAL_DISCOUNT="+EXTN_TOTAL_DISCOUNT);
		sb.append(",EXTN_TOTAL_TAX="+EXTN_TOTAL_TAX);
		sb.append(",EXTN_SHIP_ALONE_SKU_NO="+String.valueOf(EXTN_SHIP_ALONE_SKU_NO));
		sb.append(",EXTN_REQ_SHIP_DATE="+String.valueOf(EXTN_REQ_SHIP_DATE));
		sb.append(",EXTN_REQ_DELIVERY_DATE="+String.valueOf(EXTN_REQ_DELIVERY_DATE));
		sb.append(",EXTN_SHIP_NOT_BEFORE_DATE="+String.valueOf(EXTN_SHIP_NOT_BEFORE_DATE));
		sb.append(",EXTN_SHIP_NOT_AFTER_DATE="+String.valueOf(EXTN_SHIP_NOT_AFTER_DATE));
		sb.append(",EXTN_DELIVER_NOT_BEFORE_DT="+String.valueOf(EXTN_DELIVER_NOT_BEFORE_DT));
		sb.append(",EXTN_DELIVER_NOT_AFTER_DT="+String.valueOf(EXTN_DELIVER_NOT_AFTER_DT));
		sb.append(",EXTN_MARK_FOR_STORE_NO="+EXTN_MARK_FOR_STORE_NO);
		sb.append(",EXTN_IS_BACKORDERED="+EXTN_IS_BACKORDERED);
		sb.append(",EXTN_LAST_PICK_DATE_FOR_CANCEL="+EXTN_LAST_PICK_DATE_FOR_CANCEL);
		sb.append(",EXTN_PICKUP_EMAIL_FLAG="+EXTN_PICKUP_EMAIL_FLAG);
		sb.append(",EXTN_SHIP_COMPLETE="+EXTN_SHIP_COMPLETE);
		sb.append(",EXTN_SINGLE_CARTON="+EXTN_SINGLE_CARTON);
		sb.append(",EXTN_REQ_CANCEL_DATE="+String.valueOf(EXTN_REQ_CANCEL_DATE));
		sb.append(",EXTN_VENDOR_SKU="+EXTN_VENDOR_SKU);
		sb.append(",EXTN_RESHIPPED_FLAG="+EXTN_RESHIPPED_FLAG);
		sb.append(",EXTN_RETURNED_FLAG="+EXTN_RETURNED_FLAG);
		sb.append(",EXTN_RESHIPPED_QTY="+EXTN_RESHIPPED_QTY);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ORDER_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_HEADER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_HEADER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(PRIME_LINE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRIME_LINE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(SUB_LINE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUB_LINE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(LINE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LINE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ORDER_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDER_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ALTERNATE_ITEM_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALTERNATE_ITEM_ID);
            			}
            		
        			sb.append("|");
        		
        				if(UOM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UOM);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(UNIT_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNIT_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(COST_CURRENCY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COST_CURRENCY);
            			}
            		
        			sb.append("|");
        		
        				if(ORDERED_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDERED_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BASIC_CAPACITY_REQUIRED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BASIC_CAPACITY_REQUIRED);
            			}
            		
        			sb.append("|");
        		
        				if(OPTION_CAPACITY_REQUIRED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OPTION_CAPACITY_REQUIRED);
            			}
            		
        			sb.append("|");
        		
        				if(DEPENDENT_ON_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPENDENT_ON_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(CURRENT_WORK_ORDER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CURRENT_WORK_ORDER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(DEPENDENCY_SHIPPING_RULE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPENDENCY_SHIPPING_RULE);
            			}
            		
        			sb.append("|");
        		
        				if(FILL_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FILL_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(COMMITTED_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COMMITTED_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(DEPENDENCY_RATIO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPENDENCY_RATIO);
            			}
            		
        			sb.append("|");
        		
        				if(MAINTAIN_RATIO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MAINTAIN_RATIO);
            			}
            		
        			sb.append("|");
        		
        				if(MERGE_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MERGE_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(PARENT_OF_DEPENDENT_GROUP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PARENT_OF_DEPENDENT_GROUP);
            			}
            		
        			sb.append("|");
        		
        				if(SOURCE_FROM_ORGANIZATION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOURCE_FROM_ORGANIZATION);
            			}
            		
        			sb.append("|");
        		
        				if(CHAINED_FROM_ORDER_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CHAINED_FROM_ORDER_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(CHAINED_FROM_ORDER_HEADER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CHAINED_FROM_ORDER_HEADER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(DERIVED_FROM_ORDER_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DERIVED_FROM_ORDER_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(DERIVED_FROM_ORDER_HEADER_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DERIVED_FROM_ORDER_HEADER_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(DERIVED_FROM_ORDER_RELEASE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DERIVED_FROM_ORDER_RELEASE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(DISTRIBUTION_RULE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISTRIBUTION_RULE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICED_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICED_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(OVER_RECEIPT_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OVER_RECEIPT_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(RETURN_REASON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETURN_REASON);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPNODE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPNODE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(PROCURE_FROM_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROCURE_FROM_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_TO_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_TO_KEY);
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
        		
        				if(CARRIER_ACCOUNT_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CARRIER_ACCOUNT_NO);
            			}
            		
        			sb.append("|");
        		
        				if(PICKABLE_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PICKABLE_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_TOGETHER_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_TOGETHER_NO);
            			}
            		
        			sb.append("|");
        		
        				if(HOLD_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HOLD_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(KIT_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(KIT_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(HOLD_REASON_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HOLD_REASON_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(OTHER_CHARGES == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OTHER_CHARGES);
            			}
            		
        			sb.append("|");
        		
        				if(LINE_TOTAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LINE_TOTAL);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICED_LINE_TOTAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICED_LINE_TOTAL);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICED_EXTENDED_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICED_EXTENDED_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(SETTLED_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SETTLED_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(SETTLED_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SETTLED_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(TAXABLE_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAXABLE_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(TAX_EXEMPTION_CERTIFICATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX_EXEMPTION_CERTIFICATE);
            			}
            		
        			sb.append("|");
        		
        				if(DISCOUNT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISCOUNT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(DISCOUNT_REFERENCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISCOUNT_REFERENCE);
            			}
            		
        			sb.append("|");
        		
        				if(GIFT_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GIFT_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(PERSONALIZE_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERSONALIZE_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(PERSONALIZE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PERSONALIZE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(DEPARTMENT_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DEPARTMENT_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_WEIGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_WEIGHT);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_WEIGHT_UOM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_WEIGHT_UOM);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SHORT_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SHORT_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(RESERVATION_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RESERVATION_ID);
            			}
            		
        			sb.append("|");
        		
        				if(RESERVATION_POOL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RESERVATION_POOL);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_PO_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_PO_NO);
            			}
            		
        			sb.append("|");
        		
        				if(CUSTOMER_PO_LINE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CUSTOMER_PO_LINE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX);
            			}
            		
        			sb.append("|");
        		
        				if(DELIVERY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DELIVERY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ORIGINAL_ORDERED_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORIGINAL_ORDERED_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(LIST_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LIST_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(RETAIL_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETAIL_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(DISCOUNT_PERCENTAGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISCOUNT_PERCENTAGE);
            			}
            		
        			sb.append("|");
        		
        				if(PACKLIST_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PACKLIST_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SUPPLIER_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUPPLIER_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(SUPPLIER_ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUPPLIER_ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(UNIT_COST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNIT_COST);
            			}
            		
        			sb.append("|");
        		
        				if(UPC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UPC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(FOB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FOB);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_ITEM_DESC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_ITEM_DESC);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTRY_OF_ORIGIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTRY_OF_ORIGIN);
            			}
            		
        			sb.append("|");
        		
        				if(ISBN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISBN);
            			}
            		
        			sb.append("|");
        		
        				if(HARMONIZED_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HARMONIZED_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(SHIP_TO_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIP_TO_ID);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_LINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_LINE);
            			}
            		
        			sb.append("|");
        		
        				if(NMFC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NMFC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(NMFC_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NMFC_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(NMFC_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(NMFC_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(TAX_PRODUCT_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TAX_PRODUCT_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(IMPORT_LICENSE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMPORT_LICENSE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(IMPORT_LICENSE_EXP_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IMPORT_LICENSE_EXP_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ECCN_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ECCN_NO);
            			}
            		
        			sb.append("|");
        		
        				if(SCHEDULE_B_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCHEDULE_B_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(SUPPLIER_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUPPLIER_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(PURPOSE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PURPOSE);
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
        		
        				if(SHIPMENT_CONSOL_GROUP_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPMENT_CONSOL_GROUP_ID);
            			}
            		
        			sb.append("|");
        		
        				if(ORIG_ORDER_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORIG_ORDER_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(LINE_SEQ_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LINE_SEQ_NO);
            			}
            		
        			sb.append("|");
        		
        				if(SPLIT_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPLIT_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(PIPELINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PIPELINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(CONDITION_VARIABLE_1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONDITION_VARIABLE_1);
            			}
            		
        			sb.append("|");
        		
        				if(CONDITION_VARIABLE_2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONDITION_VARIABLE_2);
            			}
            		
        			sb.append("|");
        		
        				if(IS_PRICE_LOCKED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_PRICE_LOCKED);
            			}
            		
        			sb.append("|");
        		
        				if(IS_COST_OVERRIDDEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_COST_OVERRIDDEN);
            			}
            		
        			sb.append("|");
        		
        				if(IS_CAPACITY_OVERRIDDEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_CAPACITY_OVERRIDDEN);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_COMPLETE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_COMPLETE);
            			}
            		
        			sb.append("|");
        		
        				if(DELIVERY_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DELIVERY_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_GROUP_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_GROUP_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(CANNOT_COMPLETE_BEFORE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CANNOT_COMPLETE_BEFORE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(CANNOT_COMPLETE_AFTER_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CANNOT_COMPLETE_AFTER_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(APPT_STATUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(APPT_STATUS);
            			}
            		
        			sb.append("|");
        		
        				if(CAN_ADD_SERVICE_LINES == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CAN_ADD_SERVICE_LINES);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_UOM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_UOM);
            			}
            		
        			sb.append("|");
        		
        				if(CAPACITY_UOM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CAPACITY_UOM);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(SHIPPED_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHIPPED_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(FIXED_CAPACITY_QTY_PER_LINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIXED_CAPACITY_QTY_PER_LINE);
            			}
            		
        			sb.append("|");
        		
        				if(FIXED_PRICING_QTY_PER_LINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIXED_PRICING_QTY_PER_LINE);
            			}
            		
        			sb.append("|");
        		
        				if(WAIT_FOR_SEQ_LINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WAIT_FOR_SEQ_LINE);
            			}
            		
        			sb.append("|");
        		
        				if(SCHED_FAILURE_REASON_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCHED_FAILURE_REASON_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(EARLIEST_SHIP_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EARLIEST_SHIP_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EARLIEST_DELIVERY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EARLIEST_DELIVERY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(CANNOT_MEET_APPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CANNOT_MEET_APPT);
            			}
            		
        			sb.append("|");
        		
        				if(PROMISED_APPT_START_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROMISED_APPT_START_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(PROMISED_APPT_END_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROMISED_APPT_END_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(SEGMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEGMENT);
            			}
            		
        			sb.append("|");
        		
        				if(SEGMENT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SEGMENT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EARLIEST_SCHEDULE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EARLIEST_SCHEDULE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(TIMEZONE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TIMEZONE);
            			}
            		
        			sb.append("|");
        		
        				if(IS_FORWARDING_ALLOWED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_FORWARDING_ALLOWED);
            			}
            		
        			sb.append("|");
        		
        				if(IS_PROCUREMENT_ALLOWED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_PROCUREMENT_ALLOWED);
            			}
            		
        			sb.append("|");
        		
        				if(RESHIP_PARENT_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RESHIP_PARENT_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(BUNDLE_PARENT_ORDER_LINE_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUNDLE_PARENT_ORDER_LINE_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(IS_PRICE_INFO_ONLY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_PRICE_INFO_ONLY);
            			}
            		
        			sb.append("|");
        		
        				if(LEVEL_OF_SERVICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LEVEL_OF_SERVICE);
            			}
            		
        			sb.append("|");
        		
        				if(FIRST_ITER_SEQ_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FIRST_ITER_SEQ_NO);
            			}
            		
        			sb.append("|");
        		
        				if(LAST_ITER_SEQ_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LAST_ITER_SEQ_NO);
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
        		
        				if(ORDERING_UOM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORDERING_UOM);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_QUANTITY_CONV_FACTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_QUANTITY_CONV_FACTOR);
            			}
            		
        			sb.append("|");
        		
        				if(PRICING_QUANTITY_STRATEGY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICING_QUANTITY_STRATEGY);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICED_PRICING_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICED_PRICING_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(IS_STANDALONE_SERVICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_STANDALONE_SERVICE);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_DISCREPANCY_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_DISCREPANCY_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(RECEIVED_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RECEIVED_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(INVOICE_BASED_ON_ACTUALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INVOICE_BASED_ON_ACTUALS);
            			}
            		
        			sb.append("|");
        		
        				if(ACTUAL_PRICING_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ACTUAL_PRICING_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(FULFILLMENT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FULFILLMENT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SERIAL_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SERIAL_NO);
            			}
            		
        			sb.append("|");
        		
        				if(RESERVATION_MANDATORY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RESERVATION_MANDATORY);
            			}
            		
        			sb.append("|");
        		
        				if(IS_FIRM_PREDEFINED_NODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_FIRM_PREDEFINED_NODE);
            			}
            		
        			sb.append("|");
        		
        				if(INTENTIONAL_BACKORDER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTENTIONAL_BACKORDER);
            			}
            		
        			sb.append("|");
        		
        				if(FUTURE_AVAIL_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FUTURE_AVAIL_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REPRICING_QUANTITY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPRICING_QUANTITY);
            			}
            		
        			sb.append("|");
        		
        				if(MIN_SHIP_BY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MIN_SHIP_BY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(KIT_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(KIT_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(BOM_CONFIG_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BOM_CONFIG_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(BUNDLE_FULFILLMENT_MODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BUNDLE_FULFILLMENT_MODE);
            			}
            		
        			sb.append("|");
        		
        				if(IS_GIFT_WRAP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_GIFT_WRAP);
            			}
            		
        			sb.append("|");
        		
        				if(GROUP_SEQUENCE_NUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GROUP_SEQUENCE_NUM);
            			}
            		
        			sb.append("|");
        		
        				if(IN_STORE_PAYMENT_REQUIRED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IN_STORE_PAYMENT_REQUIRED);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_NOT_EXIST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NOT_EXIST);
            			}
            		
        			sb.append("|");
        		
        				if(BACKORDER_NOTIFICATION_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BACKORDER_NOTIFICATION_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(IS_PRICE_MATCHED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_PRICE_MATCHED);
            			}
            		
        			sb.append("|");
        		
        				if(IS_PICK_UP_NOW == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_PICK_UP_NOW);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_IS_IN_HAND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_IS_IN_HAND);
            			}
            		
        			sb.append("|");
        		
        				if(DISPOSITION_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DISPOSITION_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PUBLISHED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PUBLISHED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_LINE_TOTAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_LINE_TOTAL);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORDERED_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORDERED_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIP_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIP_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD_DESC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD_DESC);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD_DIV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD_DIV);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PRICE_MOD_CODE_STR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PRICE_MOD_CODE_STR);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORIG_UNITPRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORIG_UNITPRICE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_REVIEW == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_REVIEW);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_LAST_PICK_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_LAST_PICK_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PICK_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PICK_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RELEASE_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RELEASE_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_AVG_RATING == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_AVG_RATING);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ACT_ITEM_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ACT_ITEM_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_VERTEX_ENGINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_VERTEX_ENGINE);
            			}
            		
        			sb.append("|");
        		
        				if(DERIVED_FROM_EXT_ORD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DERIVED_FROM_EXT_ORD);
            			}
            		
        			sb.append("|");
        		
        				if(IS_ELIGIBLE_FOR_SHIP_DISC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IS_ELIGIBLE_FOR_SHIP_DISC);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SIGN_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SIGN_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MKTPLACE_SHIP_AMT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MKTPLACE_SHIP_AMT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MKTPLACE_SHIP_DISC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MKTPLACE_SHIP_DISC);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MKTPLACE_SHIP_TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MKTPLACE_SHIP_TAX);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MKTPLACE_COMMISSION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MKTPLACE_COMMISSION);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_GWP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_GWP);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_CHANNEL_ITEM_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_CHANNEL_ITEM_ID);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_ORIGINAL_TRACKING_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_ORIGINAL_TRACKING_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_MIGRATED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_MIGRATED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SDK_LINE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SDK_LINE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_TOTAL_DISCOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_TOTAL_DISCOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_TOTAL_TAX == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_TOTAL_TAX);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIP_ALONE_SKU_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIP_ALONE_SKU_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_REQ_SHIP_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_REQ_SHIP_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_REQ_DELIVERY_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_REQ_DELIVERY_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIP_NOT_BEFORE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIP_NOT_BEFORE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIP_NOT_AFTER_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIP_NOT_AFTER_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DELIVER_NOT_BEFORE_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DELIVER_NOT_BEFORE_DT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_DELIVER_NOT_AFTER_DT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_DELIVER_NOT_AFTER_DT);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_MARK_FOR_STORE_NO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_MARK_FOR_STORE_NO);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_IS_BACKORDERED == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_IS_BACKORDERED);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_LAST_PICK_DATE_FOR_CANCEL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_LAST_PICK_DATE_FOR_CANCEL);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_PICKUP_EMAIL_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_PICKUP_EMAIL_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SHIP_COMPLETE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SHIP_COMPLETE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_SINGLE_CARTON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_SINGLE_CARTON);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_REQ_CANCEL_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_REQ_CANCEL_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_VENDOR_SKU == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_VENDOR_SKU);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RESHIPPED_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RESHIPPED_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RETURNED_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RETURNED_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(EXTN_RESHIPPED_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXTN_RESHIPPED_QTY);
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
 		                    "YFS_ORDER_LINE_H");
 		                    
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
     		                    						
     		                    						a("\"name\":\"ORDER_LINE_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_HEADER_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_HEADER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_HEADER_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_HEADER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRIME_LINE_NO\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRIME_LINE_NO\",\"talend.field.dbColumnName\":\"PRIME_LINE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRIME_LINE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SUB_LINE_NO\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SUB_LINE_NO\",\"talend.field.dbColumnName\":\"SUB_LINE_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SUB_LINE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LINE_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LINE_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LINE_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LINE_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDER_CLASS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDER_CLASS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDER_CLASS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDER_CLASS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_ID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ALTERNATE_ITEM_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ALTERNATE_ITEM_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ALTERNATE_ITEM_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ALTERNATE_ITEM_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"UOM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UOM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"UOM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UOM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRODUCT_CLASS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRODUCT_CLASS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRODUCT_CLASS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRODUCT_CLASS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"UNIT_PRICE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UNIT_PRICE\",\"talend.field.dbColumnName\":\"UNIT_PRICE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UNIT_PRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"COST_CURRENCY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COST_CURRENCY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COST_CURRENCY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COST_CURRENCY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDERED_QTY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDERED_QTY\",\"talend.field.dbColumnName\":\"ORDERED_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDERED_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BASIC_CAPACITY_REQUIRED\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BASIC_CAPACITY_REQUIRED\",\"talend.field.dbColumnName\":\"BASIC_CAPACITY_REQUIRED\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BASIC_CAPACITY_REQUIRED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OPTION_CAPACITY_REQUIRED\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OPTION_CAPACITY_REQUIRED\",\"talend.field.dbColumnName\":\"OPTION_CAPACITY_REQUIRED\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OPTION_CAPACITY_REQUIRED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEPENDENT_ON_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEPENDENT_ON_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEPENDENT_ON_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEPENDENT_ON_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CURRENT_WORK_ORDER_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CURRENT_WORK_ORDER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CURRENT_WORK_ORDER_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CURRENT_WORK_ORDER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEPENDENCY_SHIPPING_RULE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEPENDENCY_SHIPPING_RULE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEPENDENCY_SHIPPING_RULE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEPENDENCY_SHIPPING_RULE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FILL_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FILL_QUANTITY\",\"talend.field.dbColumnName\":\"FILL_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FILL_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"COMMITTED_QUANTITY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COMMITTED_QUANTITY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COMMITTED_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COMMITTED_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEPENDENCY_RATIO\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEPENDENCY_RATIO\",\"talend.field.dbColumnName\":\"DEPENDENCY_RATIO\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEPENDENCY_RATIO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MAINTAIN_RATIO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MAINTAIN_RATIO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MAINTAIN_RATIO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MAINTAIN_RATIO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MERGE_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MERGE_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MERGE_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MERGE_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PARENT_OF_DEPENDENT_GROUP\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PARENT_OF_DEPENDENT_GROUP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PARENT_OF_DEPENDENT_GROUP\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PARENT_OF_DEPENDENT_GROUP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOURCE_FROM_ORGANIZATION\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOURCE_FROM_ORGANIZATION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOURCE_FROM_ORGANIZATION\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOURCE_FROM_ORGANIZATION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CHAINED_FROM_ORDER_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHAINED_FROM_ORDER_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHAINED_FROM_ORDER_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHAINED_FROM_ORDER_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CHAINED_FROM_ORDER_HEADER_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CHAINED_FROM_ORDER_HEADER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CHAINED_FROM_ORDER_HEADER_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHAINED_FROM_ORDER_HEADER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DERIVED_FROM_ORDER_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DERIVED_FROM_ORDER_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DERIVED_FROM_ORDER_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DERIVED_FROM_ORDER_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DERIVED_FROM_ORDER_HEADER_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DERIVED_FROM_ORDER_HEADER_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DERIVED_FROM_ORDER_HEADER_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DERIVED_FROM_ORDER_HEADER_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DERIVED_FROM_ORDER_RELEASE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DERIVED_FROM_ORDER_RELEASE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DERIVED_FROM_ORDER_RELEASE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DERIVED_FROM_ORDER_RELEASE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISTRIBUTION_RULE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISTRIBUTION_RULE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DISTRIBUTION_RULE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISTRIBUTION_RULE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICED_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICED_QUANTITY\",\"talend.field.dbColumnName\":\"INVOICED_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICED_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OVER_RECEIPT_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OVER_RECEIPT_QUANTITY\",\"talend.field.dbColumnName\":\"OVER_RECEIPT_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OVER_RECEIPT_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RETURN_REASON\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RETURN_REASON\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RETURN_REASON\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RETURN_REASON\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPNODE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIPNODE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIPNODE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIPNODE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PROCURE_FROM_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PROCURE_FROM_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PROCURE_FROM_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PROCURE_FROM_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_TO_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_TO_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_TO_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_TO_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MARK_FOR_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MARK_FOR_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MARK_FOR_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MARK_FOR_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_MARK_FOR_NODE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_MARK_FOR_NODE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_MARK_FOR_NODE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_MARK_FOR_NODE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_DELIVERY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_DELIVERY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_DELIVERY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_DELIVERY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_CANCEL_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_CANCEL_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_CANCEL_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_CANCEL_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQ_SHIP_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REQ_SHIP_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REQ_SHIP_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"REQ_SHIP_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SCAC\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCAC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCAC\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCAC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CARRIER_SERVICE_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CARRIER_SERVICE_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CARRIER_SERVICE_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CARRIER_SERVICE_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CARRIER_ACCOUNT_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CARRIER_ACCOUNT_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CARRIER_ACCOUNT_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CARRIER_ACCOUNT_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PICKABLE_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PICKABLE_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PICKABLE_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PICKABLE_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_TOGETHER_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_TOGETHER_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_TOGETHER_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_TOGETHER_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HOLD_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HOLD_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HOLD_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HOLD_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"KIT_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"KIT_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"KIT_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"KIT_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HOLD_REASON_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HOLD_REASON_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HOLD_REASON_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HOLD_REASON_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"OTHER_CHARGES\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"OTHER_CHARGES\",\"talend.field.dbColumnName\":\"OTHER_CHARGES\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"OTHER_CHARGES\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LINE_TOTAL\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LINE_TOTAL\",\"talend.field.dbColumnName\":\"LINE_TOTAL\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LINE_TOTAL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICED_LINE_TOTAL\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICED_LINE_TOTAL\",\"talend.field.dbColumnName\":\"INVOICED_LINE_TOTAL\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICED_LINE_TOTAL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICED_EXTENDED_PRICE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICED_EXTENDED_PRICE\",\"talend.field.dbColumnName\":\"INVOICED_EXTENDED_PRICE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICED_EXTENDED_PRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SETTLED_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SETTLED_QUANTITY\",\"talend.field.dbColumnName\":\"SETTLED_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SETTLED_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SETTLED_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SETTLED_AMOUNT\",\"talend.field.dbColumnName\":\"SETTLED_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SETTLED_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAXABLE_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAXABLE_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAXABLE_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAXABLE_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX_EXEMPTION_CERTIFICATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX_EXEMPTION_CERTIFICATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAX_EXEMPTION_CERTIFICATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_EXEMPTION_CERTIFICATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISCOUNT_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISCOUNT_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DISCOUNT_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISCOUNT_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISCOUNT_REFERENCE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISCOUNT_REFERENCE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DISCOUNT_REFERENCE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISCOUNT_REFERENCE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"GIFT_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"GIFT_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"GIFT_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"GIFT_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERSONALIZE_FLAG\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PERSONALIZE_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PERSONALIZE_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PERSONALIZE_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PERSONALIZE_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PERSONALIZE_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PERSONALIZE_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PERSONALIZE_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DEPARTMENT_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DEPARTMENT_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DEPARTMENT_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DEPARTMENT_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_ITEM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_ITEM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_ITEM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_ITEM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_ITEM_DESCRIPTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_ITEM_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_ITEM_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_ITEM_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_WEIGHT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_WEIGHT\",\"talend.field.dbColumnName\":\"ITEM_WEIGHT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_WEIGHT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_WEIGHT_UOM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_WEIGHT_UOM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_WEIGHT_UOM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_WEIGHT_UOM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_DESCRIPTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_SHORT_DESCRIPTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_SHORT_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_SHORT_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_SHORT_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RESERVATION_ID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESERVATION_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESERVATION_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESERVATION_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RESERVATION_POOL\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESERVATION_POOL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESERVATION_POOL\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESERVATION_POOL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_PO_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_PO_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_PO_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_PO_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CUSTOMER_PO_LINE_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CUSTOMER_PO_LINE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CUSTOMER_PO_LINE_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CUSTOMER_PO_LINE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX\",\"talend.field.dbColumnName\":\"TAX\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DELIVERY_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DELIVERY_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DELIVERY_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DELIVERY_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORIGINAL_ORDERED_QTY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIGINAL_ORDERED_QTY\",\"talend.field.dbColumnName\":\"ORIGINAL_ORDERED_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIGINAL_ORDERED_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LIST_PRICE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LIST_PRICE\",\"talend.field.dbColumnName\":\"LIST_PRICE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LIST_PRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RETAIL_PRICE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RETAIL_PRICE\",\"talend.field.dbColumnName\":\"RETAIL_PRICE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RETAIL_PRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISCOUNT_PERCENTAGE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISCOUNT_PERCENTAGE\",\"talend.field.dbColumnName\":\"DISCOUNT_PERCENTAGE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISCOUNT_PERCENTAGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PACKLIST_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PACKLIST_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PACKLIST_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PACKLIST_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SUPPLIER_ITEM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SUPPLIER_ITEM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SUPPLIER_ITEM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SUPPLIER_ITEM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SUPPLIER_ITEM_DESCRIPTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SUPPLIER_ITEM_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SUPPLIER_ITEM_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SUPPLIER_ITEM_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"UNIT_COST\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UNIT_COST\",\"talend.field.dbColumnName\":\"UNIT_COST\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UNIT_COST\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"UPC_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"UPC_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"UPC_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"UPC_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FOB\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FOB\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FOB\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FOB\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MANUFACTURER_NAME\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MANUFACTURER_NAME\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MANUFACTURER_NAME\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MANUFACTURER_NAME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MANUFACTURER_ITEM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MANUFACTURER_ITEM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MANUFACTURER_ITEM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MANUFACTURER_ITEM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MANUFACTURER_ITEM_DESC\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MANUFACTURER_ITEM_DESC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MANUFACTURER_ITEM_DESC\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MANUFACTURER_ITEM_DESC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"COUNTRY_OF_ORIGIN\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"COUNTRY_OF_ORIGIN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"COUNTRY_OF_ORIGIN\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"COUNTRY_OF_ORIGIN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISBN\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ISBN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ISBN\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ISBN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"HARMONIZED_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"HARMONIZED_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"HARMONIZED_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"HARMONIZED_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIP_TO_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIP_TO_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIP_TO_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIP_TO_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRODUCT_LINE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRODUCT_LINE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRODUCT_LINE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRODUCT_LINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NMFC_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NMFC_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NMFC_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NMFC_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NMFC_CLASS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NMFC_CLASS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NMFC_CLASS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NMFC_CLASS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"NMFC_DESCRIPTION\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"NMFC_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"NMFC_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"NMFC_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TAX_PRODUCT_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TAX_PRODUCT_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TAX_PRODUCT_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TAX_PRODUCT_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMPORT_LICENSE_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IMPORT_LICENSE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IMPORT_LICENSE_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IMPORT_LICENSE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IMPORT_LICENSE_EXP_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IMPORT_LICENSE_EXP_DATE\",\"talend.field.dbColumnName\":\"IMPORT_LICENSE_EXP_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"IMPORT_LICENSE_EXP_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ECCN_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ECCN_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ECCN_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ECCN_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SCHEDULE_B_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCHEDULE_B_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCHEDULE_B_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCHEDULE_B_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SUPPLIER_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SUPPLIER_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SUPPLIER_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SUPPLIER_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PURPOSE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PURPOSE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PURPOSE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PURPOSE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVING_NODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECEIVING_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RECEIVING_NODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RECEIVING_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUYER_RECEIVING_NODE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUYER_RECEIVING_NODE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUYER_RECEIVING_NODE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUYER_RECEIVING_NODE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPMENT_CONSOL_GROUP_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIPMENT_CONSOL_GROUP_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SHIPMENT_CONSOL_GROUP_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIPMENT_CONSOL_GROUP_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORIG_ORDER_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORIG_ORDER_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORIG_ORDER_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORIG_ORDER_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LINE_SEQ_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LINE_SEQ_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LINE_SEQ_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LINE_SEQ_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SPLIT_QTY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SPLIT_QTY\",\"talend.field.dbColumnName\":\"SPLIT_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SPLIT_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_DATE\",\"talend.field.dbColumnName\":\"PRICING_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"PRICING_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PIPELINE_KEY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PIPELINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PIPELINE_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PIPELINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONDITION_VARIABLE_1\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CONDITION_VARIABLE_1\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CONDITION_VARIABLE_1\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CONDITION_VARIABLE_1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CONDITION_VARIABLE_2\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CONDITION_VARIABLE_2\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CONDITION_VARIABLE_2\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CONDITION_VARIABLE_2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_PRICE_LOCKED\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_PRICE_LOCKED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_PRICE_LOCKED\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_PRICE_LOCKED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_COST_OVERRIDDEN\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_COST_OVERRIDDEN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_COST_OVERRIDDEN\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_COST_OVERRIDDEN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_CAPACITY_OVERRIDDEN\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_CAPACITY_OVERRIDDEN\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_CAPACITY_OVERRIDDEN\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_CAPACITY_OVERRIDDEN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_COMPLETE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICE_COMPLETE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INVOICE_COMPLETE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICE_COMPLETE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DELIVERY_METHOD\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DELIVERY_METHOD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DELIVERY_METHOD\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DELIVERY_METHOD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_GROUP_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_GROUP_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_GROUP_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_GROUP_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CANNOT_COMPLETE_BEFORE_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CANNOT_COMPLETE_BEFORE_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CANNOT_COMPLETE_BEFORE_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CANNOT_COMPLETE_BEFORE_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CANNOT_COMPLETE_AFTER_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CANNOT_COMPLETE_AFTER_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CANNOT_COMPLETE_AFTER_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CANNOT_COMPLETE_AFTER_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"APPT_STATUS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"APPT_STATUS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"APPT_STATUS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"APPT_STATUS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CAN_ADD_SERVICE_LINES\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CAN_ADD_SERVICE_LINES\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CAN_ADD_SERVICE_LINES\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CAN_ADD_SERVICE_LINES\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_UOM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_UOM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRICING_UOM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICING_UOM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CAPACITY_UOM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CAPACITY_UOM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CAPACITY_UOM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CAPACITY_UOM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_QUANTITY\",\"talend.field.dbColumnName\":\"PRICING_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICING_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHIPPED_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SHIPPED_QUANTITY\",\"talend.field.dbColumnName\":\"SHIPPED_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHIPPED_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FIXED_CAPACITY_QTY_PER_LINE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FIXED_CAPACITY_QTY_PER_LINE\",\"talend.field.dbColumnName\":\"FIXED_CAPACITY_QTY_PER_LINE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FIXED_CAPACITY_QTY_PER_LINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FIXED_PRICING_QTY_PER_LINE\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FIXED_PRICING_QTY_PER_LINE\",\"talend.field.dbColumnName\":\"FIXED_PRICING_QTY_PER_LINE\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FIXED_PRICING_QTY_PER_LINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"WAIT_FOR_SEQ_LINE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"WAIT_FOR_SEQ_LINE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"WAIT_FOR_SEQ_LINE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"WAIT_FOR_SEQ_LINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SCHED_FAILURE_REASON_CODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SCHED_FAILURE_REASON_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SCHED_FAILURE_REASON_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SCHED_FAILURE_REASON_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EARLIEST_SHIP_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EARLIEST_SHIP_DATE\",\"talend.field.dbColumnName\":\"EARLIEST_SHIP_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EARLIEST_SHIP_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EARLIEST_DELIVERY_DATE\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EARLIEST_DELIVERY_DATE\",\"talend.field.dbColumnName\":\"EARLIEST_DELIVERY_DATE\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EARLIEST_DELIVERY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CANNOT_MEET_APPT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CANNOT_MEET_APPT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CANNOT_MEET_APPT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CANNOT_MEET_APPT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PROMISED_APPT_START_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PROMISED_APPT_START_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PROMISED_APPT_START_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"PROMISED_APPT_START_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PROMISED_APPT_END_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PROMISED_APPT_END_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PROMISED_APPT_END_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"PROMISED_APPT_END_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SEGMENT\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SEGMENT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SEGMENT\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SEGMENT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SEGMENT_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SEGMENT_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SEGMENT_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SEGMENT_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EARLIEST_SCHEDULE_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EARLIEST_SCHEDULE_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EARLIEST_SCHEDULE_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EARLIEST_SCHEDULE_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TIMEZONE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TIMEZONE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TIMEZONE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TIMEZONE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_FORWARDING_ALLOWED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_FORWARDING_ALLOWED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_FORWARDING_ALLOWED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_FORWARDING_ALLOWED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_PROCUREMENT_ALLOWED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_PROCUREMENT_ALLOWED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_PROCUREMENT_ALLOWED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_PROCUREMENT_ALLOWED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RESHIP_PARENT_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESHIP_PARENT_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESHIP_PARENT_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESHIP_PARENT_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUNDLE_PARENT_ORDER_LINE_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUNDLE_PARENT_ORDER_LINE_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUNDLE_PARENT_ORDER_LINE_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUNDLE_PARENT_ORDER_LINE_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_PRICE_INFO_ONLY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_PRICE_INFO_ONLY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_PRICE_INFO_ONLY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_PRICE_INFO_ONLY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LEVEL_OF_SERVICE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LEVEL_OF_SERVICE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LEVEL_OF_SERVICE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LEVEL_OF_SERVICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FIRST_ITER_SEQ_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FIRST_ITER_SEQ_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FIRST_ITER_SEQ_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FIRST_ITER_SEQ_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LAST_ITER_SEQ_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LAST_ITER_SEQ_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LAST_ITER_SEQ_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LAST_ITER_SEQ_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATETS\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATETS\",\"talend.field.dbColumnName\":\"CREATETS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"CREATETS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYTS\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYTS\",\"talend.field.dbColumnName\":\"MODIFYTS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"MODIFYTS\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEUSERID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATEUSERID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATEUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYUSERID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYUSERID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MODIFYUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEPROGID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"CREATEPROGID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"CREATEPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYPROGID\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MODIFYPROGID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MODIFYPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOCKID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOCKID\",\"talend.field.dbColumnName\":\"LOCKID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCKID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ORDERING_UOM\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ORDERING_UOM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ORDERING_UOM\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ORDERING_UOM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_QUANTITY_CONV_FACTOR\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_QUANTITY_CONV_FACTOR\",\"talend.field.dbColumnName\":\"PRICING_QUANTITY_CONV_FACTOR\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICING_QUANTITY_CONV_FACTOR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PRICING_QUANTITY_STRATEGY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"PRICING_QUANTITY_STRATEGY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PRICING_QUANTITY_STRATEGY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PRICING_QUANTITY_STRATEGY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICED_PRICING_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICED_PRICING_QUANTITY\",\"talend.field.dbColumnName\":\"INVOICED_PRICING_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICED_PRICING_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_STANDALONE_SERVICE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_STANDALONE_SERVICE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_STANDALONE_SERVICE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_STANDALONE_SERVICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_DISCREPANCY_QTY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"TRAN_DISCREPANCY_QTY\",\"talend.field.dbColumnName\":\"TRAN_DISCREPANCY_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_DISCREPANCY_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RECEIVED_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RECEIVED_QUANTITY\",\"talend.field.dbColumnName\":\"RECEIVED_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RECEIVED_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INVOICE_BASED_ON_ACTUALS\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INVOICE_BASED_ON_ACTUALS\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INVOICE_BASED_ON_ACTUALS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INVOICE_BASED_ON_ACTUALS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ACTUAL_PRICING_QUANTITY\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ACTUAL_PRICING_QUANTITY\",\"talend.field.dbColumnName\":\"ACTUAL_PRICING_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ACTUAL_PRICING_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FULFILLMENT_TYPE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FULFILLMENT_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FULFILLMENT_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"FULFILLMENT_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SERIAL_NO\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SERIAL_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SERIAL_NO\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SERIAL_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"RESERVATION_MANDATORY\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"RESERVATION_MANDATORY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"RESERVATION_MANDATORY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"RESERVATION_MANDATORY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_FIRM_PREDEFINED_NODE\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_FIRM_PREDEFINED_NODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_FIRM_PREDEFINED_NODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_FIRM_PREDEFINED_NODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INTENTIONAL_BACKORDER\",\"type\":\"string\",\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INTENTIONAL_BACKORDER\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INTENTIONAL_BACKORDER\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INTENTIONAL_BACKORDER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"FUTURE_AVAIL_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"FUTURE_AVAIL_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"FUTURE_AVAIL_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"FUTURE_AVAIL_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REPRICING_QUANTITY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"REPRICING_QUANTITY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"REPRICING_QUANTITY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REPRICING_QUANTITY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MIN_SHIP_BY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"MIN_SHIP_BY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"MIN_SHIP_BY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"MIN_SHIP_BY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"KIT_QTY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"KIT_QTY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"KIT_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"KIT_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BOM_CONFIG_KEY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BOM_CONFIG_KEY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BOM_CONFIG_KEY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BOM_CONFIG_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BUNDLE_FULFILLMENT_MODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BUNDLE_FULFILLMENT_MODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BUNDLE_FULFILLMENT_MODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BUNDLE_FULFILLMENT_MODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_GIFT_WRAP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_GIFT_WRAP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_GIFT_WRAP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_GIFT_WRAP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"GROUP_SEQUENCE_NUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"GROUP_SEQUENCE_NUM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"GROUP_SEQUENCE_NUM\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"GROUP_SEQUENCE_NUM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IN_STORE_PAYMENT_REQUIRED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IN_STORE_PAYMENT_REQUIRED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IN_STORE_PAYMENT_REQUIRED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IN_STORE_PAYMENT_REQUIRED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_NOT_EXIST\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_NOT_EXIST\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_NOT_EXIST\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_NOT_EXIST\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"BACKORDER_NOTIFICATION_QTY\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"BACKORDER_NOTIFICATION_QTY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"BACKORDER_NOTIFICATION_QTY\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"BACKORDER_NOTIFICATION_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_PRICE_MATCHED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_PRICE_MATCHED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_PRICE_MATCHED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_PRICE_MATCHED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_PICK_UP_NOW\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_PICK_UP_NOW\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_PICK_UP_NOW\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_PICK_UP_NOW\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITEM_IS_IN_HAND\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ITEM_IS_IN_HAND\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"ITEM_IS_IN_HAND\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ITEM_IS_IN_HAND\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DISPOSITION_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DISPOSITION_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DISPOSITION_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DISPOSITION_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PUBLISHED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PUBLISHED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PUBLISHED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PUBLISHED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_LINE_TOTAL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_LINE_TOTAL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_LINE_TOTAL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_LINE_TOTAL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORDERED_QTY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORDERED_QTY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORDERED_QTY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORDERED_QTY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIP_METHOD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIP_METHOD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIP_METHOD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SHIP_METHOD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD_DESC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD_DESC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD_DESC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD_DESC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD_CODE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD_CODE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD_CODE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD_DIV\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD_DIV\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD_DIV\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD_DIV\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PRICE_MOD_CODE_STR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PRICE_MOD_CODE_STR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PRICE_MOD_CODE_STR\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PRICE_MOD_CODE_STR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORIG_UNITPRICE\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORIG_UNITPRICE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORIG_UNITPRICE\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORIG_UNITPRICE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_REVIEW\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_REVIEW\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_REVIEW\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_REVIEW\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_LAST_PICK_DATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_LAST_PICK_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_LAST_PICK_DATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_LAST_PICK_DATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PICK_DATE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PICK_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PICK_DATE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PICK_DATE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RELEASE_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RELEASE_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RELEASE_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RELEASE_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_AVG_RATING\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_AVG_RATING\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_AVG_RATING\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_AVG_RATING\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DESCRIPTION\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DESCRIPTION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DESCRIPTION\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_DESCRIPTION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ACT_ITEM_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ACT_ITEM_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ACT_ITEM_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ACT_ITEM_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_VERTEX_ENGINE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_VERTEX_ENGINE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_VERTEX_ENGINE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_VERTEX_ENGINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DERIVED_FROM_EXT_ORD\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"DERIVED_FROM_EXT_ORD\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"DERIVED_FROM_EXT_ORD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DERIVED_FROM_EXT_ORD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IS_ELIGIBLE_FOR_SHIP_DISC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"IS_ELIGIBLE_FOR_SHIP_DISC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"IS_ELIGIBLE_FOR_SHIP_DISC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"IS_ELIGIBLE_FOR_SHIP_DISC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SIGN_TYPE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SIGN_TYPE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SIGN_TYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SIGN_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MKTPLACE_SHIP_AMT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MKTPLACE_SHIP_AMT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MKTPLACE_SHIP_AMT\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MKTPLACE_SHIP_AMT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MKTPLACE_SHIP_DISC\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MKTPLACE_SHIP_DISC\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MKTPLACE_SHIP_DISC\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MKTPLACE_SHIP_DISC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MKTPLACE_SHIP_TAX\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MKTPLACE_SHIP_TAX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MKTPLACE_SHIP_TAX\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MKTPLACE_SHIP_TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MKTPLACE_COMMISSION\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MKTPLACE_COMMISSION\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MKTPLACE_COMMISSION\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MKTPLACE_COMMISSION\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_GWP\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_GWP\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_GWP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_GWP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_CHANNEL_ITEM_ID\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_CHANNEL_ITEM_ID\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_CHANNEL_ITEM_ID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_CHANNEL_ITEM_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_ORIGINAL_TRACKING_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_ORIGINAL_TRACKING_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_ORIGINAL_TRACKING_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_ORIGINAL_TRACKING_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_MIGRATED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_MIGRATED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_MIGRATED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_MIGRATED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SDK_LINE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SDK_LINE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SDK_LINE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SDK_LINE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_TOTAL_DISCOUNT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_TOTAL_DISCOUNT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_TOTAL_DISCOUNT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_TOTAL_DISCOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_TOTAL_TAX\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_TOTAL_TAX\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_TOTAL_TAX\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_TOTAL_TAX\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIP_ALONE_SKU_NO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIP_ALONE_SKU_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIP_ALONE_SKU_NO\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SHIP_ALONE_SKU_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_REQ_SHIP_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_REQ_SHIP_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_REQ_SHIP_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_REQ_SHIP_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_REQ_DELIVERY_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_REQ_DELIVERY_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_REQ_DELIVERY_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_REQ_DELIVERY_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIP_NOT_BEFORE_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIP_NOT_BEFORE_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIP_NOT_BEFORE_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_SHIP_NOT_BEFORE_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIP_NOT_AFTER_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIP_NOT_AFTER_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIP_NOT_AFTER_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_SHIP_NOT_AFTER_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DELIVER_NOT_BEFORE_DT\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DELIVER_NOT_BEFORE_DT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DELIVER_NOT_BEFORE_DT\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_DELIVER_NOT_BEFORE_DT\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_DELIVER_NOT_AFTER_DT\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_DELIVER_NOT_AFTER_DT\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_DELIVER_NOT_AFTER_DT\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_DELIVER_NOT_AFTER_DT\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_MARK_FOR_STORE_NO\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_MARK_FOR_STORE_NO\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_MARK_FOR_STORE_NO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_MARK_FOR_STORE_NO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_IS_BACKORDERED\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_IS_BACKORDERED\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_IS_BACKORDERED\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_IS_BACKORDERED\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_LAST_PICK_DATE_FOR_CANCEL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_LAST_PICK_DATE_FOR_CANCEL\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_LAST_PICK_DATE_FOR_CANCEL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_LAST_PICK_DATE_FOR_CANCEL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_PICKUP_EMAIL_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_PICKUP_EMAIL_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_PICKUP_EMAIL_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_PICKUP_EMAIL_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SHIP_COMPLETE\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SHIP_COMPLETE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SHIP_COMPLETE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SHIP_COMPLETE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_SINGLE_CARTON\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_SINGLE_CARTON\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_SINGLE_CARTON\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_SINGLE_CARTON\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_REQ_CANCEL_DATE\",\"type\":[{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_REQ_CANCEL_DATE\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_REQ_CANCEL_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"timestamp-millis\",\"di.table.label\":\"EXTN_REQ_CANCEL_DATE\",\"di.prop.di.date.timestamp\":\"true\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_VENDOR_SKU\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_VENDOR_SKU\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_VENDOR_SKU\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_VENDOR_SKU\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RESHIPPED_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RESHIPPED_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RESHIPPED_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RESHIPPED_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RETURNED_FLAG\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RETURNED_FLAG\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RETURNED_FLAG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RETURNED_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"EXTN_RESHIPPED_QTY\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"EXTN_RESHIPPED_QTY\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"EXTN_RESHIPPED_QTY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"EXTN_RESHIPPED_QTY\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",s);
     		                    						
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
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"  select * from STERLING.YFS_ORDER_LINE_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysdate - 7), 'YYYY-MM-DD HH:MI:SS')    \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_HEADER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRIME_LINE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SUB_LINE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LINE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDER_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ALTERNATE_ITEM_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UOM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRODUCT_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UNIT_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("COST_CURRENCY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDERED_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BASIC_CAPACITY_REQUIRED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OPTION_CAPACITY_REQUIRED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPENDENT_ON_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CURRENT_WORK_ORDER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPENDENCY_SHIPPING_RULE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FILL_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("COMMITTED_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPENDENCY_RATIO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MAINTAIN_RATIO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MERGE_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PARENT_OF_DEPENDENT_GROUP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOURCE_FROM_ORGANIZATION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CHAINED_FROM_ORDER_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CHAINED_FROM_ORDER_HEADER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DERIVED_FROM_ORDER_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DERIVED_FROM_ORDER_HEADER_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DERIVED_FROM_ORDER_RELEASE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DISTRIBUTION_RULE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICED_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OVER_RECEIPT_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RETURN_REASON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIPNODE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROCURE_FROM_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_TO_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MARK_FOR_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_MARK_FOR_NODE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_DELIVERY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_CANCEL_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQ_SHIP_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SCAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CARRIER_SERVICE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CARRIER_ACCOUNT_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PICKABLE_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_TOGETHER_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HOLD_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("KIT_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HOLD_REASON_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("OTHER_CHARGES")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LINE_TOTAL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICED_LINE_TOTAL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICED_EXTENDED_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SETTLED_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SETTLED_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAXABLE_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX_EXEMPTION_CERTIFICATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DISCOUNT_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DISCOUNT_REFERENCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("GIFT_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PERSONALIZE_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PERSONALIZE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DEPARTMENT_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_ITEM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_ITEM_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_WEIGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_WEIGHT_UOM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_SHORT_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RESERVATION_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RESERVATION_POOL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_PO_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CUSTOMER_PO_LINE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DELIVERY_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORIGINAL_ORDERED_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LIST_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RETAIL_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DISCOUNT_PERCENTAGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PACKLIST_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SUPPLIER_ITEM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SUPPLIER_ITEM_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UNIT_COST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UPC_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FOB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MANUFACTURER_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MANUFACTURER_ITEM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MANUFACTURER_ITEM_DESC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("COUNTRY_OF_ORIGIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISBN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HARMONIZED_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIP_TO_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRODUCT_LINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NMFC_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NMFC_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("NMFC_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TAX_PRODUCT_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMPORT_LICENSE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IMPORT_LICENSE_EXP_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ECCN_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SCHEDULE_B_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SUPPLIER_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PURPOSE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RECEIVING_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUYER_RECEIVING_NODE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIPMENT_CONSOL_GROUP_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORIG_ORDER_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LINE_SEQ_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SPLIT_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PIPELINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONDITION_VARIABLE_1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONDITION_VARIABLE_2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_PRICE_LOCKED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_COST_OVERRIDDEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_CAPACITY_OVERRIDDEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICE_COMPLETE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DELIVERY_METHOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_GROUP_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CANNOT_COMPLETE_BEFORE_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CANNOT_COMPLETE_AFTER_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("APPT_STATUS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CAN_ADD_SERVICE_LINES")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_UOM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CAPACITY_UOM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHIPPED_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FIXED_CAPACITY_QTY_PER_LINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FIXED_PRICING_QTY_PER_LINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("WAIT_FOR_SEQ_LINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SCHED_FAILURE_REASON_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EARLIEST_SHIP_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EARLIEST_DELIVERY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CANNOT_MEET_APPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROMISED_APPT_START_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROMISED_APPT_END_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SEGMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SEGMENT_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EARLIEST_SCHEDULE_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TIMEZONE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_FORWARDING_ALLOWED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_PROCUREMENT_ALLOWED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RESHIP_PARENT_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUNDLE_PARENT_ORDER_LINE_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_PRICE_INFO_ONLY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LEVEL_OF_SERVICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FIRST_ITER_SEQ_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LAST_ITER_SEQ_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYTS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCKID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORDERING_UOM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_QUANTITY_CONV_FACTOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICING_QUANTITY_STRATEGY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICED_PRICING_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_STANDALONE_SERVICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_DISCREPANCY_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RECEIVED_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INVOICE_BASED_ON_ACTUALS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ACTUAL_PRICING_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FULFILLMENT_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SERIAL_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RESERVATION_MANDATORY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_FIRM_PREDEFINED_NODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INTENTIONAL_BACKORDER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FUTURE_AVAIL_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPRICING_QUANTITY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MIN_SHIP_BY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("KIT_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BOM_CONFIG_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BUNDLE_FULFILLMENT_MODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_GIFT_WRAP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("GROUP_SEQUENCE_NUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IN_STORE_PAYMENT_REQUIRED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_NOT_EXIST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BACKORDER_NOTIFICATION_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_PRICE_MATCHED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_PICK_UP_NOW")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_IS_IN_HAND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DISPOSITION_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PUBLISHED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_LINE_TOTAL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORDERED_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIP_METHOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD_DESC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD_DIV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PRICE_MOD_CODE_STR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORIG_UNITPRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_REVIEW")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_LAST_PICK_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PICK_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RELEASE_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_AVG_RATING")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ACT_ITEM_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_VERTEX_ENGINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DERIVED_FROM_EXT_ORD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IS_ELIGIBLE_FOR_SHIP_DISC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SIGN_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MKTPLACE_SHIP_AMT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MKTPLACE_SHIP_DISC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MKTPLACE_SHIP_TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MKTPLACE_COMMISSION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_GWP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_CHANNEL_ITEM_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_ORIGINAL_TRACKING_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_MIGRATED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SDK_LINE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_TOTAL_DISCOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_TOTAL_TAX")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIP_ALONE_SKU_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_REQ_SHIP_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_REQ_DELIVERY_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIP_NOT_BEFORE_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIP_NOT_AFTER_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DELIVER_NOT_BEFORE_DT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_DELIVER_NOT_AFTER_DT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_MARK_FOR_STORE_NO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_IS_BACKORDERED")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_LAST_PICK_DATE_FOR_CANCEL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_PICKUP_EMAIL_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SHIP_COMPLETE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_SINGLE_CARTON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_REQ_CANCEL_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_VENDOR_SKU")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RESHIPPED_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RETURNED_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXTN_RESHIPPED_QTY")+"}]");
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

		    String dbquery_tDBInput_1 = "\nselect * from STERLING.YFS_ORDER_LINE_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysdate - 7), 'YYY"
+"Y-MM-DD HH:MI:SS')\n\n";
		    
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
								row1.ORDER_LINE_KEY = null;
							} else {
	                         		
        	row1.ORDER_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.ORDER_HEADER_KEY = null;
							} else {
	                         		
        	row1.ORDER_HEADER_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.PRIME_LINE_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(3) != null) {
						row1.PRIME_LINE_NO = rs_tDBInput_1.getBigDecimal(3);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.SUB_LINE_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.SUB_LINE_NO = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.LINE_TYPE = null;
							} else {
	                         		
        	row1.LINE_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.ORDER_CLASS = null;
							} else {
	                         		
        	row1.ORDER_CLASS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.ITEM_ID = null;
							} else {
	                         		
        	row1.ITEM_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.ALTERNATE_ITEM_ID = null;
							} else {
	                         		
        	row1.ALTERNATE_ITEM_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.UOM = null;
							} else {
	                         		
        	row1.UOM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.PRODUCT_CLASS = null;
							} else {
	                         		
        	row1.PRODUCT_CLASS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.UNIT_PRICE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(11) != null) {
						row1.UNIT_PRICE = rs_tDBInput_1.getBigDecimal(11);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.COST_CURRENCY = null;
							} else {
	                         		
        	row1.COST_CURRENCY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 12, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.ORDERED_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(13) != null) {
						row1.ORDERED_QTY = rs_tDBInput_1.getBigDecimal(13);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.BASIC_CAPACITY_REQUIRED = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(14) != null) {
						row1.BASIC_CAPACITY_REQUIRED = rs_tDBInput_1.getBigDecimal(14);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.OPTION_CAPACITY_REQUIRED = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(15) != null) {
						row1.OPTION_CAPACITY_REQUIRED = rs_tDBInput_1.getBigDecimal(15);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.DEPENDENT_ON_LINE_KEY = null;
							} else {
	                         		
        	row1.DEPENDENT_ON_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.CURRENT_WORK_ORDER_KEY = null;
							} else {
	                         		
        	row1.CURRENT_WORK_ORDER_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.DEPENDENCY_SHIPPING_RULE = null;
							} else {
	                         		
        	row1.DEPENDENCY_SHIPPING_RULE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.FILL_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(19) != null) {
						row1.FILL_QUANTITY = rs_tDBInput_1.getBigDecimal(19);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.COMMITTED_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(20) != null) {
						row1.COMMITTED_QUANTITY = rs_tDBInput_1.getBigDecimal(20);
					} else {
				
						row1.COMMITTED_QUANTITY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.DEPENDENCY_RATIO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(21) != null) {
						row1.DEPENDENCY_RATIO = rs_tDBInput_1.getBigDecimal(21);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.MAINTAIN_RATIO = null;
							} else {
	                         		
        	row1.MAINTAIN_RATIO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row1.MERGE_NODE = null;
							} else {
	                         		
        	row1.MERGE_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row1.PARENT_OF_DEPENDENT_GROUP = null;
							} else {
	                         		
        	row1.PARENT_OF_DEPENDENT_GROUP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 24, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row1.SOURCE_FROM_ORGANIZATION = null;
							} else {
	                         		
        	row1.SOURCE_FROM_ORGANIZATION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 25, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row1.CHAINED_FROM_ORDER_LINE_KEY = null;
							} else {
	                         		
        	row1.CHAINED_FROM_ORDER_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 26, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row1.CHAINED_FROM_ORDER_HEADER_KEY = null;
							} else {
	                         		
        	row1.CHAINED_FROM_ORDER_HEADER_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row1.DERIVED_FROM_ORDER_LINE_KEY = null;
							} else {
	                         		
        	row1.DERIVED_FROM_ORDER_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row1.DERIVED_FROM_ORDER_HEADER_KEY = null;
							} else {
	                         		
        	row1.DERIVED_FROM_ORDER_HEADER_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row1.DERIVED_FROM_ORDER_RELEASE_KEY = null;
							} else {
	                         		
        	row1.DERIVED_FROM_ORDER_RELEASE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 30, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row1.DISTRIBUTION_RULE_ID = null;
							} else {
	                         		
        	row1.DISTRIBUTION_RULE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 31, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row1.INVOICED_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(32) != null) {
						row1.INVOICED_QUANTITY = rs_tDBInput_1.getBigDecimal(32);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 33) {
								row1.OVER_RECEIPT_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(33) != null) {
						row1.OVER_RECEIPT_QUANTITY = rs_tDBInput_1.getBigDecimal(33);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 34) {
								row1.RETURN_REASON = null;
							} else {
	                         		
        	row1.RETURN_REASON = routines.system.JDBCUtil.getString(rs_tDBInput_1, 34, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 35) {
								row1.SHIPNODE_KEY = null;
							} else {
	                         		
        	row1.SHIPNODE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 35, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 36) {
								row1.PROCURE_FROM_NODE = null;
							} else {
	                         		
        	row1.PROCURE_FROM_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 36, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 37) {
								row1.SHIP_TO_KEY = null;
							} else {
	                         		
        	row1.SHIP_TO_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 37, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 38) {
								row1.MARK_FOR_KEY = null;
							} else {
	                         		
        	row1.MARK_FOR_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 38, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 39) {
								row1.BUYER_MARK_FOR_NODE_ID = null;
							} else {
	                         		
        	row1.BUYER_MARK_FOR_NODE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 39, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 40) {
								row1.REQ_DELIVERY_DATE = null;
							} else {
										
			row1.REQ_DELIVERY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 40);
		                    }
							if(colQtyInRs_tDBInput_1 < 41) {
								row1.REQ_CANCEL_DATE = null;
							} else {
										
			row1.REQ_CANCEL_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 41);
		                    }
							if(colQtyInRs_tDBInput_1 < 42) {
								row1.REQ_SHIP_DATE = null;
							} else {
										
			row1.REQ_SHIP_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 42);
		                    }
							if(colQtyInRs_tDBInput_1 < 43) {
								row1.SCAC = null;
							} else {
	                         		
        	row1.SCAC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 43, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 44) {
								row1.CARRIER_SERVICE_CODE = null;
							} else {
	                         		
        	row1.CARRIER_SERVICE_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 44, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 45) {
								row1.CARRIER_ACCOUNT_NO = null;
							} else {
	                         		
        	row1.CARRIER_ACCOUNT_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 45, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 46) {
								row1.PICKABLE_FLAG = null;
							} else {
	                         		
        	row1.PICKABLE_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 46, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 47) {
								row1.SHIP_TOGETHER_NO = null;
							} else {
	                         		
        	row1.SHIP_TOGETHER_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 47, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 48) {
								row1.HOLD_FLAG = null;
							} else {
	                         		
        	row1.HOLD_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 48, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 49) {
								row1.KIT_CODE = null;
							} else {
	                         		
        	row1.KIT_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 49, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 50) {
								row1.HOLD_REASON_CODE = null;
							} else {
	                         		
        	row1.HOLD_REASON_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 50, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 51) {
								row1.OTHER_CHARGES = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(51) != null) {
						row1.OTHER_CHARGES = rs_tDBInput_1.getBigDecimal(51);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 52) {
								row1.LINE_TOTAL = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(52) != null) {
						row1.LINE_TOTAL = rs_tDBInput_1.getBigDecimal(52);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 53) {
								row1.INVOICED_LINE_TOTAL = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(53) != null) {
						row1.INVOICED_LINE_TOTAL = rs_tDBInput_1.getBigDecimal(53);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 54) {
								row1.INVOICED_EXTENDED_PRICE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(54) != null) {
						row1.INVOICED_EXTENDED_PRICE = rs_tDBInput_1.getBigDecimal(54);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 55) {
								row1.SETTLED_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(55) != null) {
						row1.SETTLED_QUANTITY = rs_tDBInput_1.getBigDecimal(55);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 56) {
								row1.SETTLED_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(56) != null) {
						row1.SETTLED_AMOUNT = rs_tDBInput_1.getBigDecimal(56);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 57) {
								row1.TAXABLE_FLAG = null;
							} else {
	                         		
        	row1.TAXABLE_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 57, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 58) {
								row1.TAX_EXEMPTION_CERTIFICATE = null;
							} else {
	                         		
        	row1.TAX_EXEMPTION_CERTIFICATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 58, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 59) {
								row1.DISCOUNT_TYPE = null;
							} else {
	                         		
        	row1.DISCOUNT_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 59, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 60) {
								row1.DISCOUNT_REFERENCE = null;
							} else {
	                         		
        	row1.DISCOUNT_REFERENCE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 60, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 61) {
								row1.GIFT_FLAG = null;
							} else {
	                         		
        	row1.GIFT_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 61, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 62) {
								row1.PERSONALIZE_FLAG = null;
							} else {
	                         		
        	row1.PERSONALIZE_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 62, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 63) {
								row1.PERSONALIZE_CODE = null;
							} else {
	                         		
        	row1.PERSONALIZE_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 63, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 64) {
								row1.DEPARTMENT_CODE = null;
							} else {
	                         		
        	row1.DEPARTMENT_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 64, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 65) {
								row1.CUSTOMER_ITEM = null;
							} else {
	                         		
        	row1.CUSTOMER_ITEM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 65, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 66) {
								row1.CUSTOMER_ITEM_DESCRIPTION = null;
							} else {
	                         		
        	row1.CUSTOMER_ITEM_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 66, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 67) {
								row1.ITEM_WEIGHT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(67) != null) {
						row1.ITEM_WEIGHT = rs_tDBInput_1.getBigDecimal(67);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 68) {
								row1.ITEM_WEIGHT_UOM = null;
							} else {
	                         		
        	row1.ITEM_WEIGHT_UOM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 68, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 69) {
								row1.ITEM_DESCRIPTION = null;
							} else {
	                         		
        	row1.ITEM_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 69, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 70) {
								row1.ITEM_SHORT_DESCRIPTION = null;
							} else {
	                         		
        	row1.ITEM_SHORT_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 70, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 71) {
								row1.RESERVATION_ID = null;
							} else {
	                         		
        	row1.RESERVATION_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 71, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 72) {
								row1.RESERVATION_POOL = null;
							} else {
	                         		
        	row1.RESERVATION_POOL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 72, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 73) {
								row1.CUSTOMER_PO_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_PO_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 73, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 74) {
								row1.CUSTOMER_PO_LINE_NO = null;
							} else {
	                         		
        	row1.CUSTOMER_PO_LINE_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 74, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 75) {
								row1.TAX = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(75) != null) {
						row1.TAX = rs_tDBInput_1.getBigDecimal(75);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 76) {
								row1.DELIVERY_CODE = null;
							} else {
	                         		
        	row1.DELIVERY_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 76, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 77) {
								row1.ORIGINAL_ORDERED_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(77) != null) {
						row1.ORIGINAL_ORDERED_QTY = rs_tDBInput_1.getBigDecimal(77);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 78) {
								row1.LIST_PRICE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(78) != null) {
						row1.LIST_PRICE = rs_tDBInput_1.getBigDecimal(78);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 79) {
								row1.RETAIL_PRICE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(79) != null) {
						row1.RETAIL_PRICE = rs_tDBInput_1.getBigDecimal(79);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 80) {
								row1.DISCOUNT_PERCENTAGE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(80) != null) {
						row1.DISCOUNT_PERCENTAGE = rs_tDBInput_1.getBigDecimal(80);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 81) {
								row1.PACKLIST_TYPE = null;
							} else {
	                         		
        	row1.PACKLIST_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 81, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 82) {
								row1.SUPPLIER_ITEM = null;
							} else {
	                         		
        	row1.SUPPLIER_ITEM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 82, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 83) {
								row1.SUPPLIER_ITEM_DESCRIPTION = null;
							} else {
	                         		
        	row1.SUPPLIER_ITEM_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 83, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 84) {
								row1.UNIT_COST = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(84) != null) {
						row1.UNIT_COST = rs_tDBInput_1.getBigDecimal(84);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 85) {
								row1.UPC_CODE = null;
							} else {
	                         		
        	row1.UPC_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 85, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 86) {
								row1.FOB = null;
							} else {
	                         		
        	row1.FOB = routines.system.JDBCUtil.getString(rs_tDBInput_1, 86, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 87) {
								row1.MANUFACTURER_NAME = null;
							} else {
	                         		
        	row1.MANUFACTURER_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 87, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 88) {
								row1.MANUFACTURER_ITEM = null;
							} else {
	                         		
        	row1.MANUFACTURER_ITEM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 88, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 89) {
								row1.MANUFACTURER_ITEM_DESC = null;
							} else {
	                         		
        	row1.MANUFACTURER_ITEM_DESC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 89, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 90) {
								row1.COUNTRY_OF_ORIGIN = null;
							} else {
	                         		
        	row1.COUNTRY_OF_ORIGIN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 90, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 91) {
								row1.ISBN = null;
							} else {
	                         		
        	row1.ISBN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 91, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 92) {
								row1.HARMONIZED_CODE = null;
							} else {
	                         		
        	row1.HARMONIZED_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 92, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 93) {
								row1.SHIP_TO_ID = null;
							} else {
	                         		
        	row1.SHIP_TO_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 93, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 94) {
								row1.PRODUCT_LINE = null;
							} else {
	                         		
        	row1.PRODUCT_LINE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 94, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 95) {
								row1.NMFC_CODE = null;
							} else {
	                         		
        	row1.NMFC_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 95, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 96) {
								row1.NMFC_CLASS = null;
							} else {
	                         		
        	row1.NMFC_CLASS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 96, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 97) {
								row1.NMFC_DESCRIPTION = null;
							} else {
	                         		
        	row1.NMFC_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 97, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 98) {
								row1.TAX_PRODUCT_CODE = null;
							} else {
	                         		
        	row1.TAX_PRODUCT_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 98, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 99) {
								row1.IMPORT_LICENSE_NO = null;
							} else {
	                         		
        	row1.IMPORT_LICENSE_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 99, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 100) {
								row1.IMPORT_LICENSE_EXP_DATE = null;
							} else {
										
			row1.IMPORT_LICENSE_EXP_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 100);
		                    }
							if(colQtyInRs_tDBInput_1 < 101) {
								row1.ECCN_NO = null;
							} else {
	                         		
        	row1.ECCN_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 101, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 102) {
								row1.SCHEDULE_B_CODE = null;
							} else {
	                         		
        	row1.SCHEDULE_B_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 102, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 103) {
								row1.SUPPLIER_CODE = null;
							} else {
	                         		
        	row1.SUPPLIER_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 103, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 104) {
								row1.PURPOSE = null;
							} else {
	                         		
        	row1.PURPOSE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 104, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 105) {
								row1.RECEIVING_NODE = null;
							} else {
	                         		
        	row1.RECEIVING_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 105, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 106) {
								row1.BUYER_RECEIVING_NODE_ID = null;
							} else {
	                         		
        	row1.BUYER_RECEIVING_NODE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 106, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 107) {
								row1.SHIPMENT_CONSOL_GROUP_ID = null;
							} else {
	                         		
        	row1.SHIPMENT_CONSOL_GROUP_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 107, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 108) {
								row1.ORIG_ORDER_LINE_KEY = null;
							} else {
	                         		
        	row1.ORIG_ORDER_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 108, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 109) {
								row1.LINE_SEQ_NO = null;
							} else {
	                         		
        	row1.LINE_SEQ_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 109, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 110) {
								row1.SPLIT_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(110) != null) {
						row1.SPLIT_QTY = rs_tDBInput_1.getBigDecimal(110);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 111) {
								row1.PRICING_DATE = null;
							} else {
										
			row1.PRICING_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 111);
		                    }
							if(colQtyInRs_tDBInput_1 < 112) {
								row1.PIPELINE_KEY = null;
							} else {
	                         		
        	row1.PIPELINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 112, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 113) {
								row1.CONDITION_VARIABLE_1 = null;
							} else {
	                         		
        	row1.CONDITION_VARIABLE_1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 113, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 114) {
								row1.CONDITION_VARIABLE_2 = null;
							} else {
	                         		
        	row1.CONDITION_VARIABLE_2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 114, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 115) {
								row1.IS_PRICE_LOCKED = null;
							} else {
	                         		
        	row1.IS_PRICE_LOCKED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 115, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 116) {
								row1.IS_COST_OVERRIDDEN = null;
							} else {
	                         		
        	row1.IS_COST_OVERRIDDEN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 116, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 117) {
								row1.IS_CAPACITY_OVERRIDDEN = null;
							} else {
	                         		
        	row1.IS_CAPACITY_OVERRIDDEN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 117, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 118) {
								row1.INVOICE_COMPLETE = null;
							} else {
	                         		
        	row1.INVOICE_COMPLETE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 118, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 119) {
								row1.DELIVERY_METHOD = null;
							} else {
	                         		
        	row1.DELIVERY_METHOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 119, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 120) {
								row1.ITEM_GROUP_CODE = null;
							} else {
	                         		
        	row1.ITEM_GROUP_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 120, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 121) {
								row1.CANNOT_COMPLETE_BEFORE_DATE = null;
							} else {
										
			row1.CANNOT_COMPLETE_BEFORE_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 121);
		                    }
							if(colQtyInRs_tDBInput_1 < 122) {
								row1.CANNOT_COMPLETE_AFTER_DATE = null;
							} else {
										
			row1.CANNOT_COMPLETE_AFTER_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 122);
		                    }
							if(colQtyInRs_tDBInput_1 < 123) {
								row1.APPT_STATUS = null;
							} else {
	                         		
        	row1.APPT_STATUS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 123, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 124) {
								row1.CAN_ADD_SERVICE_LINES = null;
							} else {
	                         		
        	row1.CAN_ADD_SERVICE_LINES = routines.system.JDBCUtil.getString(rs_tDBInput_1, 124, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 125) {
								row1.PRICING_UOM = null;
							} else {
	                         		
        	row1.PRICING_UOM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 125, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 126) {
								row1.CAPACITY_UOM = null;
							} else {
	                         		
        	row1.CAPACITY_UOM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 126, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 127) {
								row1.PRICING_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(127) != null) {
						row1.PRICING_QUANTITY = rs_tDBInput_1.getBigDecimal(127);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 128) {
								row1.SHIPPED_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(128) != null) {
						row1.SHIPPED_QUANTITY = rs_tDBInput_1.getBigDecimal(128);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 129) {
								row1.FIXED_CAPACITY_QTY_PER_LINE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(129) != null) {
						row1.FIXED_CAPACITY_QTY_PER_LINE = rs_tDBInput_1.getBigDecimal(129);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 130) {
								row1.FIXED_PRICING_QTY_PER_LINE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(130) != null) {
						row1.FIXED_PRICING_QTY_PER_LINE = rs_tDBInput_1.getBigDecimal(130);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 131) {
								row1.WAIT_FOR_SEQ_LINE = null;
							} else {
	                         		
        	row1.WAIT_FOR_SEQ_LINE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 131, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 132) {
								row1.SCHED_FAILURE_REASON_CODE = null;
							} else {
	                         		
        	row1.SCHED_FAILURE_REASON_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 132, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 133) {
								row1.EARLIEST_SHIP_DATE = null;
							} else {
										
			row1.EARLIEST_SHIP_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 133);
		                    }
							if(colQtyInRs_tDBInput_1 < 134) {
								row1.EARLIEST_DELIVERY_DATE = null;
							} else {
										
			row1.EARLIEST_DELIVERY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 134);
		                    }
							if(colQtyInRs_tDBInput_1 < 135) {
								row1.CANNOT_MEET_APPT = null;
							} else {
	                         		
        	row1.CANNOT_MEET_APPT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 135, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 136) {
								row1.PROMISED_APPT_START_DATE = null;
							} else {
										
			row1.PROMISED_APPT_START_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 136);
		                    }
							if(colQtyInRs_tDBInput_1 < 137) {
								row1.PROMISED_APPT_END_DATE = null;
							} else {
										
			row1.PROMISED_APPT_END_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 137);
		                    }
							if(colQtyInRs_tDBInput_1 < 138) {
								row1.SEGMENT = null;
							} else {
	                         		
        	row1.SEGMENT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 138, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 139) {
								row1.SEGMENT_TYPE = null;
							} else {
	                         		
        	row1.SEGMENT_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 139, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 140) {
								row1.EARLIEST_SCHEDULE_DATE = null;
							} else {
										
			row1.EARLIEST_SCHEDULE_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 140);
		                    }
							if(colQtyInRs_tDBInput_1 < 141) {
								row1.TIMEZONE = null;
							} else {
	                         		
        	row1.TIMEZONE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 141, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 142) {
								row1.IS_FORWARDING_ALLOWED = null;
							} else {
	                         		
        	row1.IS_FORWARDING_ALLOWED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 142, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 143) {
								row1.IS_PROCUREMENT_ALLOWED = null;
							} else {
	                         		
        	row1.IS_PROCUREMENT_ALLOWED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 143, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 144) {
								row1.RESHIP_PARENT_LINE_KEY = null;
							} else {
	                         		
        	row1.RESHIP_PARENT_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 144, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 145) {
								row1.BUNDLE_PARENT_ORDER_LINE_KEY = null;
							} else {
	                         		
        	row1.BUNDLE_PARENT_ORDER_LINE_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 145, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 146) {
								row1.IS_PRICE_INFO_ONLY = null;
							} else {
	                         		
        	row1.IS_PRICE_INFO_ONLY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 146, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 147) {
								row1.LEVEL_OF_SERVICE = null;
							} else {
	                         		
        	row1.LEVEL_OF_SERVICE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 147, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 148) {
								row1.FIRST_ITER_SEQ_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(148) != null) {
						row1.FIRST_ITER_SEQ_NO = rs_tDBInput_1.getBigDecimal(148);
					} else {
				
						row1.FIRST_ITER_SEQ_NO = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 149) {
								row1.LAST_ITER_SEQ_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(149) != null) {
						row1.LAST_ITER_SEQ_NO = rs_tDBInput_1.getBigDecimal(149);
					} else {
				
						row1.LAST_ITER_SEQ_NO = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 150) {
								row1.CREATETS = null;
							} else {
										
			row1.CREATETS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 150);
		                    }
							if(colQtyInRs_tDBInput_1 < 151) {
								row1.MODIFYTS = null;
							} else {
										
			row1.MODIFYTS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 151);
		                    }
							if(colQtyInRs_tDBInput_1 < 152) {
								row1.CREATEUSERID = null;
							} else {
	                         		
        	row1.CREATEUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 152, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 153) {
								row1.MODIFYUSERID = null;
							} else {
	                         		
        	row1.MODIFYUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 153, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 154) {
								row1.CREATEPROGID = null;
							} else {
	                         		
        	row1.CREATEPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 154, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 155) {
								row1.MODIFYPROGID = null;
							} else {
	                         		
        	row1.MODIFYPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 155, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 156) {
								row1.LOCKID = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(156) != null) {
						row1.LOCKID = rs_tDBInput_1.getBigDecimal(156);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 157) {
								row1.ORDERING_UOM = null;
							} else {
	                         		
        	row1.ORDERING_UOM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 157, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 158) {
								row1.PRICING_QUANTITY_CONV_FACTOR = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(158) != null) {
						row1.PRICING_QUANTITY_CONV_FACTOR = rs_tDBInput_1.getBigDecimal(158);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 159) {
								row1.PRICING_QUANTITY_STRATEGY = null;
							} else {
	                         		
        	row1.PRICING_QUANTITY_STRATEGY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 159, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 160) {
								row1.INVOICED_PRICING_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(160) != null) {
						row1.INVOICED_PRICING_QUANTITY = rs_tDBInput_1.getBigDecimal(160);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 161) {
								row1.IS_STANDALONE_SERVICE = null;
							} else {
	                         		
        	row1.IS_STANDALONE_SERVICE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 161, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 162) {
								row1.TRAN_DISCREPANCY_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(162) != null) {
						row1.TRAN_DISCREPANCY_QTY = rs_tDBInput_1.getBigDecimal(162);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 163) {
								row1.RECEIVED_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(163) != null) {
						row1.RECEIVED_QUANTITY = rs_tDBInput_1.getBigDecimal(163);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 164) {
								row1.INVOICE_BASED_ON_ACTUALS = null;
							} else {
	                         		
        	row1.INVOICE_BASED_ON_ACTUALS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 164, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 165) {
								row1.ACTUAL_PRICING_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(165) != null) {
						row1.ACTUAL_PRICING_QUANTITY = rs_tDBInput_1.getBigDecimal(165);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 166) {
								row1.FULFILLMENT_TYPE = null;
							} else {
	                         		
        	row1.FULFILLMENT_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 166, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 167) {
								row1.SERIAL_NO = null;
							} else {
	                         		
        	row1.SERIAL_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 167, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 168) {
								row1.RESERVATION_MANDATORY = null;
							} else {
	                         		
        	row1.RESERVATION_MANDATORY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 168, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 169) {
								row1.IS_FIRM_PREDEFINED_NODE = null;
							} else {
	                         		
        	row1.IS_FIRM_PREDEFINED_NODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 169, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 170) {
								row1.INTENTIONAL_BACKORDER = null;
							} else {
	                         		
        	row1.INTENTIONAL_BACKORDER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 170, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 171) {
								row1.FUTURE_AVAIL_DATE = null;
							} else {
										
			row1.FUTURE_AVAIL_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 171);
		                    }
							if(colQtyInRs_tDBInput_1 < 172) {
								row1.REPRICING_QUANTITY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(172) != null) {
						row1.REPRICING_QUANTITY = rs_tDBInput_1.getBigDecimal(172);
					} else {
				
						row1.REPRICING_QUANTITY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 173) {
								row1.MIN_SHIP_BY_DATE = null;
							} else {
										
			row1.MIN_SHIP_BY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 173);
		                    }
							if(colQtyInRs_tDBInput_1 < 174) {
								row1.KIT_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(174) != null) {
						row1.KIT_QTY = rs_tDBInput_1.getBigDecimal(174);
					} else {
				
						row1.KIT_QTY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 175) {
								row1.BOM_CONFIG_KEY = null;
							} else {
	                         		
        	row1.BOM_CONFIG_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 175, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 176) {
								row1.BUNDLE_FULFILLMENT_MODE = null;
							} else {
	                         		
        	row1.BUNDLE_FULFILLMENT_MODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 176, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 177) {
								row1.IS_GIFT_WRAP = null;
							} else {
	                         		
        	row1.IS_GIFT_WRAP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 177, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 178) {
								row1.GROUP_SEQUENCE_NUM = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(178) != null) {
						row1.GROUP_SEQUENCE_NUM = rs_tDBInput_1.getBigDecimal(178);
					} else {
				
						row1.GROUP_SEQUENCE_NUM = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 179) {
								row1.IN_STORE_PAYMENT_REQUIRED = null;
							} else {
	                         		
        	row1.IN_STORE_PAYMENT_REQUIRED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 179, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 180) {
								row1.ITEM_NOT_EXIST = null;
							} else {
	                         		
        	row1.ITEM_NOT_EXIST = routines.system.JDBCUtil.getString(rs_tDBInput_1, 180, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 181) {
								row1.BACKORDER_NOTIFICATION_QTY = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(181) != null) {
						row1.BACKORDER_NOTIFICATION_QTY = rs_tDBInput_1.getBigDecimal(181);
					} else {
				
						row1.BACKORDER_NOTIFICATION_QTY = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 182) {
								row1.IS_PRICE_MATCHED = null;
							} else {
	                         		
        	row1.IS_PRICE_MATCHED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 182, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 183) {
								row1.IS_PICK_UP_NOW = null;
							} else {
	                         		
        	row1.IS_PICK_UP_NOW = routines.system.JDBCUtil.getString(rs_tDBInput_1, 183, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 184) {
								row1.ITEM_IS_IN_HAND = null;
							} else {
	                         		
        	row1.ITEM_IS_IN_HAND = routines.system.JDBCUtil.getString(rs_tDBInput_1, 184, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 185) {
								row1.DISPOSITION_CODE = null;
							} else {
	                         		
        	row1.DISPOSITION_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 185, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 186) {
								row1.EXTN_PUBLISHED = null;
							} else {
	                         		
        	row1.EXTN_PUBLISHED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 186, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 187) {
								row1.EXTN_LINE_TOTAL = null;
							} else {
	                         		
        	row1.EXTN_LINE_TOTAL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 187, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 188) {
								row1.EXTN_ORDERED_QTY = null;
							} else {
	                         		
        	row1.EXTN_ORDERED_QTY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 188, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 189) {
								row1.EXTN_SHIP_METHOD = null;
							} else {
	                         		
        	row1.EXTN_SHIP_METHOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 189, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 190) {
								row1.EXTN_PRICE_MOD = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 190, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 191) {
								row1.EXTN_PRICE_MOD_DESC = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD_DESC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 191, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 192) {
								row1.EXTN_PRICE_MOD_TYPE = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 192, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 193) {
								row1.EXTN_PRICE_MOD_CODE = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 193, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 194) {
								row1.EXTN_PRICE_MOD_DIV = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD_DIV = routines.system.JDBCUtil.getString(rs_tDBInput_1, 194, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 195) {
								row1.EXTN_PRICE_MOD_CODE_STR = null;
							} else {
	                         		
        	row1.EXTN_PRICE_MOD_CODE_STR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 195, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 196) {
								row1.EXTN_ORIG_UNITPRICE = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(196) != null) {
						row1.EXTN_ORIG_UNITPRICE = rs_tDBInput_1.getBigDecimal(196);
					} else {
				
						row1.EXTN_ORIG_UNITPRICE = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 197) {
								row1.EXTN_REVIEW = null;
							} else {
	                         		
        	row1.EXTN_REVIEW = routines.system.JDBCUtil.getString(rs_tDBInput_1, 197, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 198) {
								row1.EXTN_LAST_PICK_DATE = null;
							} else {
	                         		
        	row1.EXTN_LAST_PICK_DATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 198, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 199) {
								row1.EXTN_PICK_DATE = null;
							} else {
	                         		
        	row1.EXTN_PICK_DATE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 199, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 200) {
								row1.EXTN_RELEASE_ID = null;
							} else {
	                         		
        	row1.EXTN_RELEASE_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 200, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 201) {
								row1.EXTN_AVG_RATING = null;
							} else {
	                         		
        	row1.EXTN_AVG_RATING = routines.system.JDBCUtil.getString(rs_tDBInput_1, 201, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 202) {
								row1.EXTN_DESCRIPTION = null;
							} else {
	                         		
        	row1.EXTN_DESCRIPTION = routines.system.JDBCUtil.getString(rs_tDBInput_1, 202, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 203) {
								row1.EXTN_ACT_ITEM_ID = null;
							} else {
	                         		
        	row1.EXTN_ACT_ITEM_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 203, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 204) {
								row1.EXTN_VERTEX_ENGINE = null;
							} else {
	                         		
        	row1.EXTN_VERTEX_ENGINE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 204, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 205) {
								row1.DERIVED_FROM_EXT_ORD = null;
							} else {
	                         		
        	row1.DERIVED_FROM_EXT_ORD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 205, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 206) {
								row1.IS_ELIGIBLE_FOR_SHIP_DISC = null;
							} else {
	                         		
        	row1.IS_ELIGIBLE_FOR_SHIP_DISC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 206, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 207) {
								row1.EXTN_SIGN_TYPE = null;
							} else {
	                         		
        	row1.EXTN_SIGN_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 207, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 208) {
								row1.EXTN_MKTPLACE_SHIP_AMT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(208) != null) {
						row1.EXTN_MKTPLACE_SHIP_AMT = rs_tDBInput_1.getBigDecimal(208);
					} else {
				
						row1.EXTN_MKTPLACE_SHIP_AMT = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 209) {
								row1.EXTN_MKTPLACE_SHIP_DISC = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(209) != null) {
						row1.EXTN_MKTPLACE_SHIP_DISC = rs_tDBInput_1.getBigDecimal(209);
					} else {
				
						row1.EXTN_MKTPLACE_SHIP_DISC = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 210) {
								row1.EXTN_MKTPLACE_SHIP_TAX = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(210) != null) {
						row1.EXTN_MKTPLACE_SHIP_TAX = rs_tDBInput_1.getBigDecimal(210);
					} else {
				
						row1.EXTN_MKTPLACE_SHIP_TAX = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 211) {
								row1.EXTN_MKTPLACE_COMMISSION = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(211) != null) {
						row1.EXTN_MKTPLACE_COMMISSION = rs_tDBInput_1.getBigDecimal(211);
					} else {
				
						row1.EXTN_MKTPLACE_COMMISSION = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 212) {
								row1.EXTN_IS_GWP = null;
							} else {
	                         		
        	row1.EXTN_IS_GWP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 212, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 213) {
								row1.EXTN_CHANNEL_ITEM_ID = null;
							} else {
	                         		
        	row1.EXTN_CHANNEL_ITEM_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 213, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 214) {
								row1.EXTN_ORIGINAL_TRACKING_NO = null;
							} else {
	                         		
        	row1.EXTN_ORIGINAL_TRACKING_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 214, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 215) {
								row1.EXTN_IS_MIGRATED = null;
							} else {
	                         		
        	row1.EXTN_IS_MIGRATED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 215, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 216) {
								row1.EXTN_SDK_LINE = null;
							} else {
	                         		
        	row1.EXTN_SDK_LINE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 216, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 217) {
								row1.EXTN_TOTAL_DISCOUNT = null;
							} else {
	                         		
        	row1.EXTN_TOTAL_DISCOUNT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 217, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 218) {
								row1.EXTN_TOTAL_TAX = null;
							} else {
	                         		
        	row1.EXTN_TOTAL_TAX = routines.system.JDBCUtil.getString(rs_tDBInput_1, 218, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 219) {
								row1.EXTN_SHIP_ALONE_SKU_NO = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(219) != null) {
						row1.EXTN_SHIP_ALONE_SKU_NO = rs_tDBInput_1.getBigDecimal(219);
					} else {
				
						row1.EXTN_SHIP_ALONE_SKU_NO = null;
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 220) {
								row1.EXTN_REQ_SHIP_DATE = null;
							} else {
										
			row1.EXTN_REQ_SHIP_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 220);
		                    }
							if(colQtyInRs_tDBInput_1 < 221) {
								row1.EXTN_REQ_DELIVERY_DATE = null;
							} else {
										
			row1.EXTN_REQ_DELIVERY_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 221);
		                    }
							if(colQtyInRs_tDBInput_1 < 222) {
								row1.EXTN_SHIP_NOT_BEFORE_DATE = null;
							} else {
										
			row1.EXTN_SHIP_NOT_BEFORE_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 222);
		                    }
							if(colQtyInRs_tDBInput_1 < 223) {
								row1.EXTN_SHIP_NOT_AFTER_DATE = null;
							} else {
										
			row1.EXTN_SHIP_NOT_AFTER_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 223);
		                    }
							if(colQtyInRs_tDBInput_1 < 224) {
								row1.EXTN_DELIVER_NOT_BEFORE_DT = null;
							} else {
										
			row1.EXTN_DELIVER_NOT_BEFORE_DT = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 224);
		                    }
							if(colQtyInRs_tDBInput_1 < 225) {
								row1.EXTN_DELIVER_NOT_AFTER_DT = null;
							} else {
										
			row1.EXTN_DELIVER_NOT_AFTER_DT = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 225);
		                    }
							if(colQtyInRs_tDBInput_1 < 226) {
								row1.EXTN_MARK_FOR_STORE_NO = null;
							} else {
	                         		
        	row1.EXTN_MARK_FOR_STORE_NO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 226, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 227) {
								row1.EXTN_IS_BACKORDERED = null;
							} else {
	                         		
        	row1.EXTN_IS_BACKORDERED = routines.system.JDBCUtil.getString(rs_tDBInput_1, 227, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 228) {
								row1.EXTN_LAST_PICK_DATE_FOR_CANCEL = null;
							} else {
	                         		
        	row1.EXTN_LAST_PICK_DATE_FOR_CANCEL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 228, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 229) {
								row1.EXTN_PICKUP_EMAIL_FLAG = null;
							} else {
	                         		
        	row1.EXTN_PICKUP_EMAIL_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 229, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 230) {
								row1.EXTN_SHIP_COMPLETE = null;
							} else {
	                         		
        	row1.EXTN_SHIP_COMPLETE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 230, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 231) {
								row1.EXTN_SINGLE_CARTON = null;
							} else {
	                         		
        	row1.EXTN_SINGLE_CARTON = routines.system.JDBCUtil.getString(rs_tDBInput_1, 231, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 232) {
								row1.EXTN_REQ_CANCEL_DATE = null;
							} else {
										
			row1.EXTN_REQ_CANCEL_DATE = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 232);
		                    }
							if(colQtyInRs_tDBInput_1 < 233) {
								row1.EXTN_VENDOR_SKU = null;
							} else {
	                         		
        	row1.EXTN_VENDOR_SKU = routines.system.JDBCUtil.getString(rs_tDBInput_1, 233, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 234) {
								row1.EXTN_RESHIPPED_FLAG = null;
							} else {
	                         		
        	row1.EXTN_RESHIPPED_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 234, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 235) {
								row1.EXTN_RETURNED_FLAG = null;
							} else {
	                         		
        	row1.EXTN_RETURNED_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 235, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 236) {
								row1.EXTN_RESHIPPED_QTY = null;
							} else {
	                         		
        	row1.EXTN_RESHIPPED_QTY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 236, false);
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
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_LINE_KEY", row1.ORDER_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_HEADER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_HEADER_KEY", row1.ORDER_HEADER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRIME_LINE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("PRIME_LINE_NO", row1.PRIME_LINE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SUB_LINE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("SUB_LINE_NO", row1.SUB_LINE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LINE_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("LINE_TYPE", row1.LINE_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDER_CLASS") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDER_CLASS", row1.ORDER_CLASS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_ID", row1.ITEM_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ALTERNATE_ITEM_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("ALTERNATE_ITEM_ID", row1.ALTERNATE_ITEM_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UOM") != null){
                    incomingEnforcer_tDBOutput_1.put("UOM", row1.UOM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRODUCT_CLASS") != null){
                    incomingEnforcer_tDBOutput_1.put("PRODUCT_CLASS", row1.PRODUCT_CLASS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UNIT_PRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("UNIT_PRICE", row1.UNIT_PRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COST_CURRENCY") != null){
                    incomingEnforcer_tDBOutput_1.put("COST_CURRENCY", row1.COST_CURRENCY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDERED_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDERED_QTY", row1.ORDERED_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BASIC_CAPACITY_REQUIRED") != null){
                    incomingEnforcer_tDBOutput_1.put("BASIC_CAPACITY_REQUIRED", row1.BASIC_CAPACITY_REQUIRED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OPTION_CAPACITY_REQUIRED") != null){
                    incomingEnforcer_tDBOutput_1.put("OPTION_CAPACITY_REQUIRED", row1.OPTION_CAPACITY_REQUIRED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEPENDENT_ON_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("DEPENDENT_ON_LINE_KEY", row1.DEPENDENT_ON_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CURRENT_WORK_ORDER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CURRENT_WORK_ORDER_KEY", row1.CURRENT_WORK_ORDER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEPENDENCY_SHIPPING_RULE") != null){
                    incomingEnforcer_tDBOutput_1.put("DEPENDENCY_SHIPPING_RULE", row1.DEPENDENCY_SHIPPING_RULE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FILL_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("FILL_QUANTITY", row1.FILL_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COMMITTED_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("COMMITTED_QUANTITY", row1.COMMITTED_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEPENDENCY_RATIO") != null){
                    incomingEnforcer_tDBOutput_1.put("DEPENDENCY_RATIO", row1.DEPENDENCY_RATIO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MAINTAIN_RATIO") != null){
                    incomingEnforcer_tDBOutput_1.put("MAINTAIN_RATIO", row1.MAINTAIN_RATIO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MERGE_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("MERGE_NODE", row1.MERGE_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PARENT_OF_DEPENDENT_GROUP") != null){
                    incomingEnforcer_tDBOutput_1.put("PARENT_OF_DEPENDENT_GROUP", row1.PARENT_OF_DEPENDENT_GROUP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SOURCE_FROM_ORGANIZATION") != null){
                    incomingEnforcer_tDBOutput_1.put("SOURCE_FROM_ORGANIZATION", row1.SOURCE_FROM_ORGANIZATION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHAINED_FROM_ORDER_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CHAINED_FROM_ORDER_LINE_KEY", row1.CHAINED_FROM_ORDER_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHAINED_FROM_ORDER_HEADER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CHAINED_FROM_ORDER_HEADER_KEY", row1.CHAINED_FROM_ORDER_HEADER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DERIVED_FROM_ORDER_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("DERIVED_FROM_ORDER_LINE_KEY", row1.DERIVED_FROM_ORDER_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DERIVED_FROM_ORDER_HEADER_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("DERIVED_FROM_ORDER_HEADER_KEY", row1.DERIVED_FROM_ORDER_HEADER_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DERIVED_FROM_ORDER_RELEASE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("DERIVED_FROM_ORDER_RELEASE_KEY", row1.DERIVED_FROM_ORDER_RELEASE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISTRIBUTION_RULE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("DISTRIBUTION_RULE_ID", row1.DISTRIBUTION_RULE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICED_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICED_QUANTITY", row1.INVOICED_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OVER_RECEIPT_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("OVER_RECEIPT_QUANTITY", row1.OVER_RECEIPT_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RETURN_REASON") != null){
                    incomingEnforcer_tDBOutput_1.put("RETURN_REASON", row1.RETURN_REASON);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPNODE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPNODE_KEY", row1.SHIPNODE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PROCURE_FROM_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("PROCURE_FROM_NODE", row1.PROCURE_FROM_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_TO_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_TO_KEY", row1.SHIP_TO_KEY);
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
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCAC") != null){
                    incomingEnforcer_tDBOutput_1.put("SCAC", row1.SCAC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CARRIER_SERVICE_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("CARRIER_SERVICE_CODE", row1.CARRIER_SERVICE_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CARRIER_ACCOUNT_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CARRIER_ACCOUNT_NO", row1.CARRIER_ACCOUNT_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PICKABLE_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("PICKABLE_FLAG", row1.PICKABLE_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_TOGETHER_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_TOGETHER_NO", row1.SHIP_TOGETHER_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HOLD_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("HOLD_FLAG", row1.HOLD_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("KIT_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("KIT_CODE", row1.KIT_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HOLD_REASON_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("HOLD_REASON_CODE", row1.HOLD_REASON_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("OTHER_CHARGES") != null){
                    incomingEnforcer_tDBOutput_1.put("OTHER_CHARGES", row1.OTHER_CHARGES);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LINE_TOTAL") != null){
                    incomingEnforcer_tDBOutput_1.put("LINE_TOTAL", row1.LINE_TOTAL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICED_LINE_TOTAL") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICED_LINE_TOTAL", row1.INVOICED_LINE_TOTAL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICED_EXTENDED_PRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICED_EXTENDED_PRICE", row1.INVOICED_EXTENDED_PRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SETTLED_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("SETTLED_QUANTITY", row1.SETTLED_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SETTLED_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("SETTLED_AMOUNT", row1.SETTLED_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAXABLE_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("TAXABLE_FLAG", row1.TAXABLE_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_EXEMPTION_CERTIFICATE") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX_EXEMPTION_CERTIFICATE", row1.TAX_EXEMPTION_CERTIFICATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISCOUNT_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("DISCOUNT_TYPE", row1.DISCOUNT_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISCOUNT_REFERENCE") != null){
                    incomingEnforcer_tDBOutput_1.put("DISCOUNT_REFERENCE", row1.DISCOUNT_REFERENCE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("GIFT_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("GIFT_FLAG", row1.GIFT_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PERSONALIZE_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("PERSONALIZE_FLAG", row1.PERSONALIZE_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PERSONALIZE_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("PERSONALIZE_CODE", row1.PERSONALIZE_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DEPARTMENT_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("DEPARTMENT_CODE", row1.DEPARTMENT_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_ITEM") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_ITEM", row1.CUSTOMER_ITEM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_ITEM_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_ITEM_DESCRIPTION", row1.CUSTOMER_ITEM_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_WEIGHT") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_WEIGHT", row1.ITEM_WEIGHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_WEIGHT_UOM") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_WEIGHT_UOM", row1.ITEM_WEIGHT_UOM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_DESCRIPTION", row1.ITEM_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_SHORT_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_SHORT_DESCRIPTION", row1.ITEM_SHORT_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RESERVATION_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("RESERVATION_ID", row1.RESERVATION_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RESERVATION_POOL") != null){
                    incomingEnforcer_tDBOutput_1.put("RESERVATION_POOL", row1.RESERVATION_POOL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_PO_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_PO_NO", row1.CUSTOMER_PO_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CUSTOMER_PO_LINE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("CUSTOMER_PO_LINE_NO", row1.CUSTOMER_PO_LINE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX", row1.TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DELIVERY_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("DELIVERY_CODE", row1.DELIVERY_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORIGINAL_ORDERED_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORIGINAL_ORDERED_QTY", row1.ORIGINAL_ORDERED_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LIST_PRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("LIST_PRICE", row1.LIST_PRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RETAIL_PRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("RETAIL_PRICE", row1.RETAIL_PRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISCOUNT_PERCENTAGE") != null){
                    incomingEnforcer_tDBOutput_1.put("DISCOUNT_PERCENTAGE", row1.DISCOUNT_PERCENTAGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PACKLIST_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("PACKLIST_TYPE", row1.PACKLIST_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SUPPLIER_ITEM") != null){
                    incomingEnforcer_tDBOutput_1.put("SUPPLIER_ITEM", row1.SUPPLIER_ITEM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SUPPLIER_ITEM_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("SUPPLIER_ITEM_DESCRIPTION", row1.SUPPLIER_ITEM_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UNIT_COST") != null){
                    incomingEnforcer_tDBOutput_1.put("UNIT_COST", row1.UNIT_COST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("UPC_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("UPC_CODE", row1.UPC_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FOB") != null){
                    incomingEnforcer_tDBOutput_1.put("FOB", row1.FOB);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MANUFACTURER_NAME") != null){
                    incomingEnforcer_tDBOutput_1.put("MANUFACTURER_NAME", row1.MANUFACTURER_NAME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MANUFACTURER_ITEM") != null){
                    incomingEnforcer_tDBOutput_1.put("MANUFACTURER_ITEM", row1.MANUFACTURER_ITEM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MANUFACTURER_ITEM_DESC") != null){
                    incomingEnforcer_tDBOutput_1.put("MANUFACTURER_ITEM_DESC", row1.MANUFACTURER_ITEM_DESC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("COUNTRY_OF_ORIGIN") != null){
                    incomingEnforcer_tDBOutput_1.put("COUNTRY_OF_ORIGIN", row1.COUNTRY_OF_ORIGIN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ISBN") != null){
                    incomingEnforcer_tDBOutput_1.put("ISBN", row1.ISBN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("HARMONIZED_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("HARMONIZED_CODE", row1.HARMONIZED_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIP_TO_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIP_TO_ID", row1.SHIP_TO_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRODUCT_LINE") != null){
                    incomingEnforcer_tDBOutput_1.put("PRODUCT_LINE", row1.PRODUCT_LINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NMFC_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("NMFC_CODE", row1.NMFC_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NMFC_CLASS") != null){
                    incomingEnforcer_tDBOutput_1.put("NMFC_CLASS", row1.NMFC_CLASS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("NMFC_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("NMFC_DESCRIPTION", row1.NMFC_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TAX_PRODUCT_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("TAX_PRODUCT_CODE", row1.TAX_PRODUCT_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMPORT_LICENSE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("IMPORT_LICENSE_NO", row1.IMPORT_LICENSE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IMPORT_LICENSE_EXP_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("IMPORT_LICENSE_EXP_DATE", row1.IMPORT_LICENSE_EXP_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ECCN_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("ECCN_NO", row1.ECCN_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCHEDULE_B_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SCHEDULE_B_CODE", row1.SCHEDULE_B_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SUPPLIER_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SUPPLIER_CODE", row1.SUPPLIER_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PURPOSE") != null){
                    incomingEnforcer_tDBOutput_1.put("PURPOSE", row1.PURPOSE);
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
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPMENT_CONSOL_GROUP_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPMENT_CONSOL_GROUP_ID", row1.SHIPMENT_CONSOL_GROUP_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORIG_ORDER_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("ORIG_ORDER_LINE_KEY", row1.ORIG_ORDER_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LINE_SEQ_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("LINE_SEQ_NO", row1.LINE_SEQ_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SPLIT_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("SPLIT_QTY", row1.SPLIT_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_DATE", row1.PRICING_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PIPELINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("PIPELINE_KEY", row1.PIPELINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CONDITION_VARIABLE_1") != null){
                    incomingEnforcer_tDBOutput_1.put("CONDITION_VARIABLE_1", row1.CONDITION_VARIABLE_1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CONDITION_VARIABLE_2") != null){
                    incomingEnforcer_tDBOutput_1.put("CONDITION_VARIABLE_2", row1.CONDITION_VARIABLE_2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_PRICE_LOCKED") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_PRICE_LOCKED", row1.IS_PRICE_LOCKED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_COST_OVERRIDDEN") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_COST_OVERRIDDEN", row1.IS_COST_OVERRIDDEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_CAPACITY_OVERRIDDEN") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_CAPACITY_OVERRIDDEN", row1.IS_CAPACITY_OVERRIDDEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_COMPLETE") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_COMPLETE", row1.INVOICE_COMPLETE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DELIVERY_METHOD") != null){
                    incomingEnforcer_tDBOutput_1.put("DELIVERY_METHOD", row1.DELIVERY_METHOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_GROUP_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_GROUP_CODE", row1.ITEM_GROUP_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CANNOT_COMPLETE_BEFORE_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("CANNOT_COMPLETE_BEFORE_DATE", row1.CANNOT_COMPLETE_BEFORE_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CANNOT_COMPLETE_AFTER_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("CANNOT_COMPLETE_AFTER_DATE", row1.CANNOT_COMPLETE_AFTER_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("APPT_STATUS") != null){
                    incomingEnforcer_tDBOutput_1.put("APPT_STATUS", row1.APPT_STATUS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CAN_ADD_SERVICE_LINES") != null){
                    incomingEnforcer_tDBOutput_1.put("CAN_ADD_SERVICE_LINES", row1.CAN_ADD_SERVICE_LINES);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_UOM") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_UOM", row1.PRICING_UOM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CAPACITY_UOM") != null){
                    incomingEnforcer_tDBOutput_1.put("CAPACITY_UOM", row1.CAPACITY_UOM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_QUANTITY", row1.PRICING_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SHIPPED_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("SHIPPED_QUANTITY", row1.SHIPPED_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FIXED_CAPACITY_QTY_PER_LINE") != null){
                    incomingEnforcer_tDBOutput_1.put("FIXED_CAPACITY_QTY_PER_LINE", row1.FIXED_CAPACITY_QTY_PER_LINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FIXED_PRICING_QTY_PER_LINE") != null){
                    incomingEnforcer_tDBOutput_1.put("FIXED_PRICING_QTY_PER_LINE", row1.FIXED_PRICING_QTY_PER_LINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("WAIT_FOR_SEQ_LINE") != null){
                    incomingEnforcer_tDBOutput_1.put("WAIT_FOR_SEQ_LINE", row1.WAIT_FOR_SEQ_LINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SCHED_FAILURE_REASON_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("SCHED_FAILURE_REASON_CODE", row1.SCHED_FAILURE_REASON_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EARLIEST_SHIP_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EARLIEST_SHIP_DATE", row1.EARLIEST_SHIP_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EARLIEST_DELIVERY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EARLIEST_DELIVERY_DATE", row1.EARLIEST_DELIVERY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CANNOT_MEET_APPT") != null){
                    incomingEnforcer_tDBOutput_1.put("CANNOT_MEET_APPT", row1.CANNOT_MEET_APPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PROMISED_APPT_START_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("PROMISED_APPT_START_DATE", row1.PROMISED_APPT_START_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PROMISED_APPT_END_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("PROMISED_APPT_END_DATE", row1.PROMISED_APPT_END_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SEGMENT") != null){
                    incomingEnforcer_tDBOutput_1.put("SEGMENT", row1.SEGMENT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SEGMENT_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("SEGMENT_TYPE", row1.SEGMENT_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EARLIEST_SCHEDULE_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EARLIEST_SCHEDULE_DATE", row1.EARLIEST_SCHEDULE_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TIMEZONE") != null){
                    incomingEnforcer_tDBOutput_1.put("TIMEZONE", row1.TIMEZONE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_FORWARDING_ALLOWED") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_FORWARDING_ALLOWED", row1.IS_FORWARDING_ALLOWED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_PROCUREMENT_ALLOWED") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_PROCUREMENT_ALLOWED", row1.IS_PROCUREMENT_ALLOWED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RESHIP_PARENT_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("RESHIP_PARENT_LINE_KEY", row1.RESHIP_PARENT_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUNDLE_PARENT_ORDER_LINE_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("BUNDLE_PARENT_ORDER_LINE_KEY", row1.BUNDLE_PARENT_ORDER_LINE_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_PRICE_INFO_ONLY") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_PRICE_INFO_ONLY", row1.IS_PRICE_INFO_ONLY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LEVEL_OF_SERVICE") != null){
                    incomingEnforcer_tDBOutput_1.put("LEVEL_OF_SERVICE", row1.LEVEL_OF_SERVICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FIRST_ITER_SEQ_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("FIRST_ITER_SEQ_NO", row1.FIRST_ITER_SEQ_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LAST_ITER_SEQ_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("LAST_ITER_SEQ_NO", row1.LAST_ITER_SEQ_NO);
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
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ORDERING_UOM") != null){
                    incomingEnforcer_tDBOutput_1.put("ORDERING_UOM", row1.ORDERING_UOM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_QUANTITY_CONV_FACTOR") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_QUANTITY_CONV_FACTOR", row1.PRICING_QUANTITY_CONV_FACTOR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PRICING_QUANTITY_STRATEGY") != null){
                    incomingEnforcer_tDBOutput_1.put("PRICING_QUANTITY_STRATEGY", row1.PRICING_QUANTITY_STRATEGY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICED_PRICING_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICED_PRICING_QUANTITY", row1.INVOICED_PRICING_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_STANDALONE_SERVICE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_STANDALONE_SERVICE", row1.IS_STANDALONE_SERVICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_DISCREPANCY_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_DISCREPANCY_QTY", row1.TRAN_DISCREPANCY_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RECEIVED_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("RECEIVED_QUANTITY", row1.RECEIVED_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INVOICE_BASED_ON_ACTUALS") != null){
                    incomingEnforcer_tDBOutput_1.put("INVOICE_BASED_ON_ACTUALS", row1.INVOICE_BASED_ON_ACTUALS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ACTUAL_PRICING_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("ACTUAL_PRICING_QUANTITY", row1.ACTUAL_PRICING_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FULFILLMENT_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("FULFILLMENT_TYPE", row1.FULFILLMENT_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("SERIAL_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("SERIAL_NO", row1.SERIAL_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("RESERVATION_MANDATORY") != null){
                    incomingEnforcer_tDBOutput_1.put("RESERVATION_MANDATORY", row1.RESERVATION_MANDATORY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_FIRM_PREDEFINED_NODE") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_FIRM_PREDEFINED_NODE", row1.IS_FIRM_PREDEFINED_NODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INTENTIONAL_BACKORDER") != null){
                    incomingEnforcer_tDBOutput_1.put("INTENTIONAL_BACKORDER", row1.INTENTIONAL_BACKORDER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("FUTURE_AVAIL_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("FUTURE_AVAIL_DATE", row1.FUTURE_AVAIL_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REPRICING_QUANTITY") != null){
                    incomingEnforcer_tDBOutput_1.put("REPRICING_QUANTITY", row1.REPRICING_QUANTITY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("MIN_SHIP_BY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("MIN_SHIP_BY_DATE", row1.MIN_SHIP_BY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("KIT_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("KIT_QTY", row1.KIT_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BOM_CONFIG_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("BOM_CONFIG_KEY", row1.BOM_CONFIG_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BUNDLE_FULFILLMENT_MODE") != null){
                    incomingEnforcer_tDBOutput_1.put("BUNDLE_FULFILLMENT_MODE", row1.BUNDLE_FULFILLMENT_MODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_GIFT_WRAP") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_GIFT_WRAP", row1.IS_GIFT_WRAP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("GROUP_SEQUENCE_NUM") != null){
                    incomingEnforcer_tDBOutput_1.put("GROUP_SEQUENCE_NUM", row1.GROUP_SEQUENCE_NUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IN_STORE_PAYMENT_REQUIRED") != null){
                    incomingEnforcer_tDBOutput_1.put("IN_STORE_PAYMENT_REQUIRED", row1.IN_STORE_PAYMENT_REQUIRED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_NOT_EXIST") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_NOT_EXIST", row1.ITEM_NOT_EXIST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("BACKORDER_NOTIFICATION_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("BACKORDER_NOTIFICATION_QTY", row1.BACKORDER_NOTIFICATION_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_PRICE_MATCHED") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_PRICE_MATCHED", row1.IS_PRICE_MATCHED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_PICK_UP_NOW") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_PICK_UP_NOW", row1.IS_PICK_UP_NOW);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("ITEM_IS_IN_HAND") != null){
                    incomingEnforcer_tDBOutput_1.put("ITEM_IS_IN_HAND", row1.ITEM_IS_IN_HAND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DISPOSITION_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("DISPOSITION_CODE", row1.DISPOSITION_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PUBLISHED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PUBLISHED", row1.EXTN_PUBLISHED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_LINE_TOTAL") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_LINE_TOTAL", row1.EXTN_LINE_TOTAL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORDERED_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORDERED_QTY", row1.EXTN_ORDERED_QTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIP_METHOD") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIP_METHOD", row1.EXTN_SHIP_METHOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD", row1.EXTN_PRICE_MOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD_DESC") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD_DESC", row1.EXTN_PRICE_MOD_DESC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD_TYPE", row1.EXTN_PRICE_MOD_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD_CODE", row1.EXTN_PRICE_MOD_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD_DIV") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD_DIV", row1.EXTN_PRICE_MOD_DIV);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PRICE_MOD_CODE_STR") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PRICE_MOD_CODE_STR", row1.EXTN_PRICE_MOD_CODE_STR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORIG_UNITPRICE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORIG_UNITPRICE", row1.EXTN_ORIG_UNITPRICE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_REVIEW") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_REVIEW", row1.EXTN_REVIEW);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_LAST_PICK_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_LAST_PICK_DATE", row1.EXTN_LAST_PICK_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PICK_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PICK_DATE", row1.EXTN_PICK_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RELEASE_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RELEASE_ID", row1.EXTN_RELEASE_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_AVG_RATING") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_AVG_RATING", row1.EXTN_AVG_RATING);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DESCRIPTION") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DESCRIPTION", row1.EXTN_DESCRIPTION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ACT_ITEM_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ACT_ITEM_ID", row1.EXTN_ACT_ITEM_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_VERTEX_ENGINE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_VERTEX_ENGINE", row1.EXTN_VERTEX_ENGINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("DERIVED_FROM_EXT_ORD") != null){
                    incomingEnforcer_tDBOutput_1.put("DERIVED_FROM_EXT_ORD", row1.DERIVED_FROM_EXT_ORD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("IS_ELIGIBLE_FOR_SHIP_DISC") != null){
                    incomingEnforcer_tDBOutput_1.put("IS_ELIGIBLE_FOR_SHIP_DISC", row1.IS_ELIGIBLE_FOR_SHIP_DISC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SIGN_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SIGN_TYPE", row1.EXTN_SIGN_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MKTPLACE_SHIP_AMT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MKTPLACE_SHIP_AMT", row1.EXTN_MKTPLACE_SHIP_AMT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MKTPLACE_SHIP_DISC") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MKTPLACE_SHIP_DISC", row1.EXTN_MKTPLACE_SHIP_DISC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MKTPLACE_SHIP_TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MKTPLACE_SHIP_TAX", row1.EXTN_MKTPLACE_SHIP_TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MKTPLACE_COMMISSION") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MKTPLACE_COMMISSION", row1.EXTN_MKTPLACE_COMMISSION);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_GWP") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_GWP", row1.EXTN_IS_GWP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_CHANNEL_ITEM_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_CHANNEL_ITEM_ID", row1.EXTN_CHANNEL_ITEM_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_ORIGINAL_TRACKING_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_ORIGINAL_TRACKING_NO", row1.EXTN_ORIGINAL_TRACKING_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_MIGRATED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_MIGRATED", row1.EXTN_IS_MIGRATED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SDK_LINE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SDK_LINE", row1.EXTN_SDK_LINE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_TOTAL_DISCOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_TOTAL_DISCOUNT", row1.EXTN_TOTAL_DISCOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_TOTAL_TAX") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_TOTAL_TAX", row1.EXTN_TOTAL_TAX);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIP_ALONE_SKU_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIP_ALONE_SKU_NO", row1.EXTN_SHIP_ALONE_SKU_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_REQ_SHIP_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_REQ_SHIP_DATE", row1.EXTN_REQ_SHIP_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_REQ_DELIVERY_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_REQ_DELIVERY_DATE", row1.EXTN_REQ_DELIVERY_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIP_NOT_BEFORE_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIP_NOT_BEFORE_DATE", row1.EXTN_SHIP_NOT_BEFORE_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIP_NOT_AFTER_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIP_NOT_AFTER_DATE", row1.EXTN_SHIP_NOT_AFTER_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DELIVER_NOT_BEFORE_DT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DELIVER_NOT_BEFORE_DT", row1.EXTN_DELIVER_NOT_BEFORE_DT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_DELIVER_NOT_AFTER_DT") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_DELIVER_NOT_AFTER_DT", row1.EXTN_DELIVER_NOT_AFTER_DT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_MARK_FOR_STORE_NO") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_MARK_FOR_STORE_NO", row1.EXTN_MARK_FOR_STORE_NO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_IS_BACKORDERED") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_IS_BACKORDERED", row1.EXTN_IS_BACKORDERED);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_LAST_PICK_DATE_FOR_CANCEL") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_LAST_PICK_DATE_FOR_CANCEL", row1.EXTN_LAST_PICK_DATE_FOR_CANCEL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_PICKUP_EMAIL_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_PICKUP_EMAIL_FLAG", row1.EXTN_PICKUP_EMAIL_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SHIP_COMPLETE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SHIP_COMPLETE", row1.EXTN_SHIP_COMPLETE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_SINGLE_CARTON") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_SINGLE_CARTON", row1.EXTN_SINGLE_CARTON);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_REQ_CANCEL_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_REQ_CANCEL_DATE", row1.EXTN_REQ_CANCEL_DATE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_VENDOR_SKU") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_VENDOR_SKU", row1.EXTN_VENDOR_SKU);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RESHIPPED_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RESHIPPED_FLAG", row1.EXTN_RESHIPPED_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RETURNED_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RETURNED_FLAG", row1.EXTN_RETURNED_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("EXTN_RESHIPPED_QTY") != null){
                    incomingEnforcer_tDBOutput_1.put("EXTN_RESHIPPED_QTY", row1.EXTN_RESHIPPED_QTY);
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
        final YFS_ORDER_LINE_H YFS_ORDER_LINE_HClass = new YFS_ORDER_LINE_H();

        int exitCode = YFS_ORDER_LINE_HClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'YFS_ORDER_LINE_H' - Done.");
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
			log.info("TalendJob: 'YFS_ORDER_LINE_H' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_A7v-MOv8Eeui_7U8UwU2ug");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-18T03:31:30.194516300Z");

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
            java.io.InputStream inContext = YFS_ORDER_LINE_H.class.getClassLoader().getResourceAsStream("at_talend_jobs/yfs_order_line_h_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = YFS_ORDER_LINE_H.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'YFS_ORDER_LINE_H' - Started.");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : YFS_ORDER_LINE_H");
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
        log.info("TalendJob: 'YFS_ORDER_LINE_H' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     762910 characters generated by Talend Cloud Data Management Platform 
 *     on the June 17, 2023 at 11:31:30 PM EDT
 ************************************************************************************************/