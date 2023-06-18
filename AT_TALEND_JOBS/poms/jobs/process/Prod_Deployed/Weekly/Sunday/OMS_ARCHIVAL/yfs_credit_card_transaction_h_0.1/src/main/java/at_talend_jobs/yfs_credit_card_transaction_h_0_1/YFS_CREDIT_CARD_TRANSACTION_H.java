
package at_talend_jobs.yfs_credit_card_transaction_h_0_1;

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
 * Job: YFS_CREDIT_CARD_TRANSACTION_H Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class YFS_CREDIT_CARD_TRANSACTION_H implements TalendJob {
	static {System.setProperty("TalendJob.log", "YFS_CREDIT_CARD_TRANSACTION_H.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(YFS_CREDIT_CARD_TRANSACTION_H.class);
	

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
	private final String jobName = "YFS_CREDIT_CARD_TRANSACTION_H";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_wDDvgOmaEeu_j5YptPMFjw", "0.1");
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
				YFS_CREDIT_CARD_TRANSACTION_H.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(YFS_CREDIT_CARD_TRANSACTION_H.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
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
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
 		                    context.SF_oms_warehouse);
 		                    
 		                    props_tDBConnection_2.setValue("db",
 		                    context.SF_oms_database);
 		                    
 		                    props_tDBConnection_2.setValue("schemaName",
 		                    context.SF_oms_schema);
 		                    
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:rqs9SpUOLY1o4sQBJbho7Sjti9/rAmD+0dxztk1lpIeduFxZ"));
 		                        
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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBConnection_3Process(globalMap);



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
                            log4jParamters_tDBConnection_3.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:Lknq4Ihz3seK/9lmBiZ/rmsMLN58dz3lBeWgDMw6CZkzTxCz18s=").substring(0, 4) + "...");     
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
	
	
		 
	final String decryptedPassword_tDBConnection_3 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:jVesdTGjwcztswphvtT9TWKvl4cg4cLw42n8eXrKPOhsoe0vSmE=");
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
 		                    "\nDelete from YFS_CREDIT_CARD_TRANSACTION_H\nwhere MODIFYTS >= cast(substr(convert_timezone('America/New_York', DATEADD"
+"(DAY, -7, current_timestamp())),0,10) as TIMESTAMPNTZ);\n\n");
 		                    
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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[0];

	
			    public String CREDIT_CARD_TRANSACTION_KEY;

				public String getCREDIT_CARD_TRANSACTION_KEY () {
					return this.CREDIT_CARD_TRANSACTION_KEY;
				}

				public Boolean CREDIT_CARD_TRANSACTION_KEYIsNullable(){
				    return false;
				}
				public Boolean CREDIT_CARD_TRANSACTION_KEYIsKey(){
				    return false;
				}
				public Integer CREDIT_CARD_TRANSACTION_KEYLength(){
				    return null;
				}
				public Integer CREDIT_CARD_TRANSACTION_KEYPrecision(){
				    return null;
				}
				public String CREDIT_CARD_TRANSACTION_KEYDefault(){
				
					return null;
				
				}
				public String CREDIT_CARD_TRANSACTION_KEYComment(){
				
				    return "";
				
				}
				public String CREDIT_CARD_TRANSACTION_KEYPattern(){
				
					return "";
				
				}
				public String CREDIT_CARD_TRANSACTION_KEYOriginalDbColumnName(){
				
					return "CREDIT_CARD_TRANSACTION_KEY";
				
				}

				
			    public String CHARGE_TRANSACTION_KEY;

				public String getCHARGE_TRANSACTION_KEY () {
					return this.CHARGE_TRANSACTION_KEY;
				}

				public Boolean CHARGE_TRANSACTION_KEYIsNullable(){
				    return false;
				}
				public Boolean CHARGE_TRANSACTION_KEYIsKey(){
				    return false;
				}
				public Integer CHARGE_TRANSACTION_KEYLength(){
				    return null;
				}
				public Integer CHARGE_TRANSACTION_KEYPrecision(){
				    return null;
				}
				public String CHARGE_TRANSACTION_KEYDefault(){
				
					return null;
				
				}
				public String CHARGE_TRANSACTION_KEYComment(){
				
				    return "";
				
				}
				public String CHARGE_TRANSACTION_KEYPattern(){
				
					return "";
				
				}
				public String CHARGE_TRANSACTION_KEYOriginalDbColumnName(){
				
					return "CHARGE_TRANSACTION_KEY";
				
				}

				
			    public String TRAN_TYPE;

				public String getTRAN_TYPE () {
					return this.TRAN_TYPE;
				}

				public Boolean TRAN_TYPEIsNullable(){
				    return false;
				}
				public Boolean TRAN_TYPEIsKey(){
				    return false;
				}
				public Integer TRAN_TYPELength(){
				    return null;
				}
				public Integer TRAN_TYPEPrecision(){
				    return null;
				}
				public String TRAN_TYPEDefault(){
				
					return null;
				
				}
				public String TRAN_TYPEComment(){
				
				    return "";
				
				}
				public String TRAN_TYPEPattern(){
				
					return "";
				
				}
				public String TRAN_TYPEOriginalDbColumnName(){
				
					return "TRAN_TYPE";
				
				}

				
			    public BigDecimal TRAN_AMOUNT;

				public BigDecimal getTRAN_AMOUNT () {
					return this.TRAN_AMOUNT;
				}

				public Boolean TRAN_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean TRAN_AMOUNTIsKey(){
				    return false;
				}
				public Integer TRAN_AMOUNTLength(){
				    return null;
				}
				public Integer TRAN_AMOUNTPrecision(){
				    return null;
				}
				public String TRAN_AMOUNTDefault(){
				
					return "";
				
				}
				public String TRAN_AMOUNTComment(){
				
				    return "";
				
				}
				public String TRAN_AMOUNTPattern(){
				
					return "";
				
				}
				public String TRAN_AMOUNTOriginalDbColumnName(){
				
					return "TRAN_AMOUNT";
				
				}

				
			    public java.util.Date TRAN_REQUEST_TIME;

				public java.util.Date getTRAN_REQUEST_TIME () {
					return this.TRAN_REQUEST_TIME;
				}

				public Boolean TRAN_REQUEST_TIMEIsNullable(){
				    return false;
				}
				public Boolean TRAN_REQUEST_TIMEIsKey(){
				    return false;
				}
				public Integer TRAN_REQUEST_TIMELength(){
				    return null;
				}
				public Integer TRAN_REQUEST_TIMEPrecision(){
				    return null;
				}
				public String TRAN_REQUEST_TIMEDefault(){
				
					return null;
				
				}
				public String TRAN_REQUEST_TIMEComment(){
				
				    return "";
				
				}
				public String TRAN_REQUEST_TIMEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String TRAN_REQUEST_TIMEOriginalDbColumnName(){
				
					return "TRAN_REQUEST_TIME";
				
				}

				
			    public String TRAN_RETURN_CODE;

				public String getTRAN_RETURN_CODE () {
					return this.TRAN_RETURN_CODE;
				}

				public Boolean TRAN_RETURN_CODEIsNullable(){
				    return false;
				}
				public Boolean TRAN_RETURN_CODEIsKey(){
				    return false;
				}
				public Integer TRAN_RETURN_CODELength(){
				    return null;
				}
				public Integer TRAN_RETURN_CODEPrecision(){
				    return null;
				}
				public String TRAN_RETURN_CODEDefault(){
				
					return null;
				
				}
				public String TRAN_RETURN_CODEComment(){
				
				    return "";
				
				}
				public String TRAN_RETURN_CODEPattern(){
				
					return "";
				
				}
				public String TRAN_RETURN_CODEOriginalDbColumnName(){
				
					return "TRAN_RETURN_CODE";
				
				}

				
			    public String TRAN_RETURN_MESSAGE;

				public String getTRAN_RETURN_MESSAGE () {
					return this.TRAN_RETURN_MESSAGE;
				}

				public Boolean TRAN_RETURN_MESSAGEIsNullable(){
				    return false;
				}
				public Boolean TRAN_RETURN_MESSAGEIsKey(){
				    return false;
				}
				public Integer TRAN_RETURN_MESSAGELength(){
				    return null;
				}
				public Integer TRAN_RETURN_MESSAGEPrecision(){
				    return null;
				}
				public String TRAN_RETURN_MESSAGEDefault(){
				
					return null;
				
				}
				public String TRAN_RETURN_MESSAGEComment(){
				
				    return "";
				
				}
				public String TRAN_RETURN_MESSAGEPattern(){
				
					return "";
				
				}
				public String TRAN_RETURN_MESSAGEOriginalDbColumnName(){
				
					return "TRAN_RETURN_MESSAGE";
				
				}

				
			    public String TRAN_RETURN_FLAG;

				public String getTRAN_RETURN_FLAG () {
					return this.TRAN_RETURN_FLAG;
				}

				public Boolean TRAN_RETURN_FLAGIsNullable(){
				    return false;
				}
				public Boolean TRAN_RETURN_FLAGIsKey(){
				    return false;
				}
				public Integer TRAN_RETURN_FLAGLength(){
				    return null;
				}
				public Integer TRAN_RETURN_FLAGPrecision(){
				    return null;
				}
				public String TRAN_RETURN_FLAGDefault(){
				
					return null;
				
				}
				public String TRAN_RETURN_FLAGComment(){
				
				    return "";
				
				}
				public String TRAN_RETURN_FLAGPattern(){
				
					return "";
				
				}
				public String TRAN_RETURN_FLAGOriginalDbColumnName(){
				
					return "TRAN_RETURN_FLAG";
				
				}

				
			    public String REQUEST_ID;

				public String getREQUEST_ID () {
					return this.REQUEST_ID;
				}

				public Boolean REQUEST_IDIsNullable(){
				    return false;
				}
				public Boolean REQUEST_IDIsKey(){
				    return false;
				}
				public Integer REQUEST_IDLength(){
				    return null;
				}
				public Integer REQUEST_IDPrecision(){
				    return null;
				}
				public String REQUEST_IDDefault(){
				
					return null;
				
				}
				public String REQUEST_IDComment(){
				
				    return "";
				
				}
				public String REQUEST_IDPattern(){
				
					return "";
				
				}
				public String REQUEST_IDOriginalDbColumnName(){
				
					return "REQUEST_ID";
				
				}

				
			    public String INTERNAL_RETURN_CODE;

				public String getINTERNAL_RETURN_CODE () {
					return this.INTERNAL_RETURN_CODE;
				}

				public Boolean INTERNAL_RETURN_CODEIsNullable(){
				    return false;
				}
				public Boolean INTERNAL_RETURN_CODEIsKey(){
				    return false;
				}
				public Integer INTERNAL_RETURN_CODELength(){
				    return null;
				}
				public Integer INTERNAL_RETURN_CODEPrecision(){
				    return null;
				}
				public String INTERNAL_RETURN_CODEDefault(){
				
					return null;
				
				}
				public String INTERNAL_RETURN_CODEComment(){
				
				    return "";
				
				}
				public String INTERNAL_RETURN_CODEPattern(){
				
					return "";
				
				}
				public String INTERNAL_RETURN_CODEOriginalDbColumnName(){
				
					return "INTERNAL_RETURN_CODE";
				
				}

				
			    public String INTERNAL_RETURN_FLAG;

				public String getINTERNAL_RETURN_FLAG () {
					return this.INTERNAL_RETURN_FLAG;
				}

				public Boolean INTERNAL_RETURN_FLAGIsNullable(){
				    return false;
				}
				public Boolean INTERNAL_RETURN_FLAGIsKey(){
				    return false;
				}
				public Integer INTERNAL_RETURN_FLAGLength(){
				    return null;
				}
				public Integer INTERNAL_RETURN_FLAGPrecision(){
				    return null;
				}
				public String INTERNAL_RETURN_FLAGDefault(){
				
					return null;
				
				}
				public String INTERNAL_RETURN_FLAGComment(){
				
				    return "";
				
				}
				public String INTERNAL_RETURN_FLAGPattern(){
				
					return "";
				
				}
				public String INTERNAL_RETURN_FLAGOriginalDbColumnName(){
				
					return "INTERNAL_RETURN_FLAG";
				
				}

				
			    public String INTERNAL_RETURN_MESSAGE;

				public String getINTERNAL_RETURN_MESSAGE () {
					return this.INTERNAL_RETURN_MESSAGE;
				}

				public Boolean INTERNAL_RETURN_MESSAGEIsNullable(){
				    return false;
				}
				public Boolean INTERNAL_RETURN_MESSAGEIsKey(){
				    return false;
				}
				public Integer INTERNAL_RETURN_MESSAGELength(){
				    return null;
				}
				public Integer INTERNAL_RETURN_MESSAGEPrecision(){
				    return null;
				}
				public String INTERNAL_RETURN_MESSAGEDefault(){
				
					return null;
				
				}
				public String INTERNAL_RETURN_MESSAGEComment(){
				
				    return "";
				
				}
				public String INTERNAL_RETURN_MESSAGEPattern(){
				
					return "";
				
				}
				public String INTERNAL_RETURN_MESSAGEOriginalDbColumnName(){
				
					return "INTERNAL_RETURN_MESSAGE";
				
				}

				
			    public BigDecimal AUTH_AMOUNT;

				public BigDecimal getAUTH_AMOUNT () {
					return this.AUTH_AMOUNT;
				}

				public Boolean AUTH_AMOUNTIsNullable(){
				    return false;
				}
				public Boolean AUTH_AMOUNTIsKey(){
				    return false;
				}
				public Integer AUTH_AMOUNTLength(){
				    return null;
				}
				public Integer AUTH_AMOUNTPrecision(){
				    return null;
				}
				public String AUTH_AMOUNTDefault(){
				
					return "";
				
				}
				public String AUTH_AMOUNTComment(){
				
				    return "";
				
				}
				public String AUTH_AMOUNTPattern(){
				
					return "";
				
				}
				public String AUTH_AMOUNTOriginalDbColumnName(){
				
					return "AUTH_AMOUNT";
				
				}

				
			    public String AUTH_CODE;

				public String getAUTH_CODE () {
					return this.AUTH_CODE;
				}

				public Boolean AUTH_CODEIsNullable(){
				    return false;
				}
				public Boolean AUTH_CODEIsKey(){
				    return false;
				}
				public Integer AUTH_CODELength(){
				    return null;
				}
				public Integer AUTH_CODEPrecision(){
				    return null;
				}
				public String AUTH_CODEDefault(){
				
					return null;
				
				}
				public String AUTH_CODEComment(){
				
				    return "";
				
				}
				public String AUTH_CODEPattern(){
				
					return "";
				
				}
				public String AUTH_CODEOriginalDbColumnName(){
				
					return "AUTH_CODE";
				
				}

				
			    public String AUTH_AVS;

				public String getAUTH_AVS () {
					return this.AUTH_AVS;
				}

				public Boolean AUTH_AVSIsNullable(){
				    return false;
				}
				public Boolean AUTH_AVSIsKey(){
				    return false;
				}
				public Integer AUTH_AVSLength(){
				    return null;
				}
				public Integer AUTH_AVSPrecision(){
				    return null;
				}
				public String AUTH_AVSDefault(){
				
					return null;
				
				}
				public String AUTH_AVSComment(){
				
				    return "";
				
				}
				public String AUTH_AVSPattern(){
				
					return "";
				
				}
				public String AUTH_AVSOriginalDbColumnName(){
				
					return "AUTH_AVS";
				
				}

				
			    public String AUTH_RETURN_CODE;

				public String getAUTH_RETURN_CODE () {
					return this.AUTH_RETURN_CODE;
				}

				public Boolean AUTH_RETURN_CODEIsNullable(){
				    return false;
				}
				public Boolean AUTH_RETURN_CODEIsKey(){
				    return false;
				}
				public Integer AUTH_RETURN_CODELength(){
				    return null;
				}
				public Integer AUTH_RETURN_CODEPrecision(){
				    return null;
				}
				public String AUTH_RETURN_CODEDefault(){
				
					return null;
				
				}
				public String AUTH_RETURN_CODEComment(){
				
				    return "";
				
				}
				public String AUTH_RETURN_CODEPattern(){
				
					return "";
				
				}
				public String AUTH_RETURN_CODEOriginalDbColumnName(){
				
					return "AUTH_RETURN_CODE";
				
				}

				
			    public String AUTH_RETURN_FLAG;

				public String getAUTH_RETURN_FLAG () {
					return this.AUTH_RETURN_FLAG;
				}

				public Boolean AUTH_RETURN_FLAGIsNullable(){
				    return false;
				}
				public Boolean AUTH_RETURN_FLAGIsKey(){
				    return false;
				}
				public Integer AUTH_RETURN_FLAGLength(){
				    return null;
				}
				public Integer AUTH_RETURN_FLAGPrecision(){
				    return null;
				}
				public String AUTH_RETURN_FLAGDefault(){
				
					return null;
				
				}
				public String AUTH_RETURN_FLAGComment(){
				
				    return "";
				
				}
				public String AUTH_RETURN_FLAGPattern(){
				
					return "";
				
				}
				public String AUTH_RETURN_FLAGOriginalDbColumnName(){
				
					return "AUTH_RETURN_FLAG";
				
				}

				
			    public String AUTH_RETURN_MESSAGE;

				public String getAUTH_RETURN_MESSAGE () {
					return this.AUTH_RETURN_MESSAGE;
				}

				public Boolean AUTH_RETURN_MESSAGEIsNullable(){
				    return false;
				}
				public Boolean AUTH_RETURN_MESSAGEIsKey(){
				    return false;
				}
				public Integer AUTH_RETURN_MESSAGELength(){
				    return null;
				}
				public Integer AUTH_RETURN_MESSAGEPrecision(){
				    return null;
				}
				public String AUTH_RETURN_MESSAGEDefault(){
				
					return null;
				
				}
				public String AUTH_RETURN_MESSAGEComment(){
				
				    return "";
				
				}
				public String AUTH_RETURN_MESSAGEPattern(){
				
					return "";
				
				}
				public String AUTH_RETURN_MESSAGEOriginalDbColumnName(){
				
					return "AUTH_RETURN_MESSAGE";
				
				}

				
			    public java.util.Date AUTH_TIME;

				public java.util.Date getAUTH_TIME () {
					return this.AUTH_TIME;
				}

				public Boolean AUTH_TIMEIsNullable(){
				    return false;
				}
				public Boolean AUTH_TIMEIsKey(){
				    return false;
				}
				public Integer AUTH_TIMELength(){
				    return null;
				}
				public Integer AUTH_TIMEPrecision(){
				    return null;
				}
				public String AUTH_TIMEDefault(){
				
					return null;
				
				}
				public String AUTH_TIMEComment(){
				
				    return "";
				
				}
				public String AUTH_TIMEPattern(){
				
					return "yyyy-MM-dd'T'HH:mm:ss";
				
				}
				public String AUTH_TIMEOriginalDbColumnName(){
				
					return "AUTH_TIME";
				
				}

				
			    public String PARENT_KEY;

				public String getPARENT_KEY () {
					return this.PARENT_KEY;
				}

				public Boolean PARENT_KEYIsNullable(){
				    return false;
				}
				public Boolean PARENT_KEYIsKey(){
				    return false;
				}
				public Integer PARENT_KEYLength(){
				    return null;
				}
				public Integer PARENT_KEYPrecision(){
				    return null;
				}
				public String PARENT_KEYDefault(){
				
					return null;
				
				}
				public String PARENT_KEYComment(){
				
				    return "";
				
				}
				public String PARENT_KEYPattern(){
				
					return "";
				
				}
				public String PARENT_KEYOriginalDbColumnName(){
				
					return "PARENT_KEY";
				
				}

				
			    public String REFERENCE1;

				public String getREFERENCE1 () {
					return this.REFERENCE1;
				}

				public Boolean REFERENCE1IsNullable(){
				    return false;
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
				    return false;
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

				
			    public String CVV_AUTH_CODE;

				public String getCVV_AUTH_CODE () {
					return this.CVV_AUTH_CODE;
				}

				public Boolean CVV_AUTH_CODEIsNullable(){
				    return false;
				}
				public Boolean CVV_AUTH_CODEIsKey(){
				    return false;
				}
				public Integer CVV_AUTH_CODELength(){
				    return null;
				}
				public Integer CVV_AUTH_CODEPrecision(){
				    return null;
				}
				public String CVV_AUTH_CODEDefault(){
				
					return null;
				
				}
				public String CVV_AUTH_CODEComment(){
				
				    return "";
				
				}
				public String CVV_AUTH_CODEPattern(){
				
					return "";
				
				}
				public String CVV_AUTH_CODEOriginalDbColumnName(){
				
					return "CVV_AUTH_CODE";
				
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
				
					return null;
				
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
				
					return null;
				
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
				
					return null;
				
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
				
					return null;
				
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
				
					return null;
				
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
				
					return null;
				
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

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H) {

        	try {

        		int length = 0;
		
					this.CREDIT_CARD_TRANSACTION_KEY = readString(dis);
					
					this.CHARGE_TRANSACTION_KEY = readString(dis);
					
					this.TRAN_TYPE = readString(dis);
					
						this.TRAN_AMOUNT = (BigDecimal) dis.readObject();
					
					this.TRAN_REQUEST_TIME = readDate(dis);
					
					this.TRAN_RETURN_CODE = readString(dis);
					
					this.TRAN_RETURN_MESSAGE = readString(dis);
					
					this.TRAN_RETURN_FLAG = readString(dis);
					
					this.REQUEST_ID = readString(dis);
					
					this.INTERNAL_RETURN_CODE = readString(dis);
					
					this.INTERNAL_RETURN_FLAG = readString(dis);
					
					this.INTERNAL_RETURN_MESSAGE = readString(dis);
					
						this.AUTH_AMOUNT = (BigDecimal) dis.readObject();
					
					this.AUTH_CODE = readString(dis);
					
					this.AUTH_AVS = readString(dis);
					
					this.AUTH_RETURN_CODE = readString(dis);
					
					this.AUTH_RETURN_FLAG = readString(dis);
					
					this.AUTH_RETURN_MESSAGE = readString(dis);
					
					this.AUTH_TIME = readDate(dis);
					
					this.PARENT_KEY = readString(dis);
					
					this.REFERENCE1 = readString(dis);
					
					this.REFERENCE2 = readString(dis);
					
					this.CVV_AUTH_CODE = readString(dis);
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_YFS_CREDIT_CARD_TRANSACTION_H) {

        	try {

        		int length = 0;
		
					this.CREDIT_CARD_TRANSACTION_KEY = readString(dis);
					
					this.CHARGE_TRANSACTION_KEY = readString(dis);
					
					this.TRAN_TYPE = readString(dis);
					
						this.TRAN_AMOUNT = (BigDecimal) dis.readObject();
					
					this.TRAN_REQUEST_TIME = readDate(dis);
					
					this.TRAN_RETURN_CODE = readString(dis);
					
					this.TRAN_RETURN_MESSAGE = readString(dis);
					
					this.TRAN_RETURN_FLAG = readString(dis);
					
					this.REQUEST_ID = readString(dis);
					
					this.INTERNAL_RETURN_CODE = readString(dis);
					
					this.INTERNAL_RETURN_FLAG = readString(dis);
					
					this.INTERNAL_RETURN_MESSAGE = readString(dis);
					
						this.AUTH_AMOUNT = (BigDecimal) dis.readObject();
					
					this.AUTH_CODE = readString(dis);
					
					this.AUTH_AVS = readString(dis);
					
					this.AUTH_RETURN_CODE = readString(dis);
					
					this.AUTH_RETURN_FLAG = readString(dis);
					
					this.AUTH_RETURN_MESSAGE = readString(dis);
					
					this.AUTH_TIME = readDate(dis);
					
					this.PARENT_KEY = readString(dis);
					
					this.REFERENCE1 = readString(dis);
					
					this.REFERENCE2 = readString(dis);
					
					this.CVV_AUTH_CODE = readString(dis);
					
					this.CREATETS = readDate(dis);
					
					this.MODIFYTS = readDate(dis);
					
					this.CREATEUSERID = readString(dis);
					
					this.MODIFYUSERID = readString(dis);
					
					this.CREATEPROGID = readString(dis);
					
					this.MODIFYPROGID = readString(dis);
					
						this.LOCKID = (BigDecimal) dis.readObject();
					
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
				
						writeString(this.CREDIT_CARD_TRANSACTION_KEY,dos);
					
					// String
				
						writeString(this.CHARGE_TRANSACTION_KEY,dos);
					
					// String
				
						writeString(this.TRAN_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TRAN_AMOUNT);
					
					// java.util.Date
				
						writeDate(this.TRAN_REQUEST_TIME,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_CODE,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_MESSAGE,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.REQUEST_ID,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_CODE,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_MESSAGE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.AUTH_AMOUNT);
					
					// String
				
						writeString(this.AUTH_CODE,dos);
					
					// String
				
						writeString(this.AUTH_AVS,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_CODE,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_MESSAGE,dos);
					
					// java.util.Date
				
						writeDate(this.AUTH_TIME,dos);
					
					// String
				
						writeString(this.PARENT_KEY,dos);
					
					// String
				
						writeString(this.REFERENCE1,dos);
					
					// String
				
						writeString(this.REFERENCE2,dos);
					
					// String
				
						writeString(this.CVV_AUTH_CODE,dos);
					
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
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CREDIT_CARD_TRANSACTION_KEY,dos);
					
					// String
				
						writeString(this.CHARGE_TRANSACTION_KEY,dos);
					
					// String
				
						writeString(this.TRAN_TYPE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TRAN_AMOUNT);
					
					// java.util.Date
				
						writeDate(this.TRAN_REQUEST_TIME,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_CODE,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_MESSAGE,dos);
					
					// String
				
						writeString(this.TRAN_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.REQUEST_ID,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_CODE,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.INTERNAL_RETURN_MESSAGE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.AUTH_AMOUNT);
					
					// String
				
						writeString(this.AUTH_CODE,dos);
					
					// String
				
						writeString(this.AUTH_AVS,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_CODE,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_FLAG,dos);
					
					// String
				
						writeString(this.AUTH_RETURN_MESSAGE,dos);
					
					// java.util.Date
				
						writeDate(this.AUTH_TIME,dos);
					
					// String
				
						writeString(this.PARENT_KEY,dos);
					
					// String
				
						writeString(this.REFERENCE1,dos);
					
					// String
				
						writeString(this.REFERENCE2,dos);
					
					// String
				
						writeString(this.CVV_AUTH_CODE,dos);
					
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
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CREDIT_CARD_TRANSACTION_KEY="+CREDIT_CARD_TRANSACTION_KEY);
		sb.append(",CHARGE_TRANSACTION_KEY="+CHARGE_TRANSACTION_KEY);
		sb.append(",TRAN_TYPE="+TRAN_TYPE);
		sb.append(",TRAN_AMOUNT="+String.valueOf(TRAN_AMOUNT));
		sb.append(",TRAN_REQUEST_TIME="+String.valueOf(TRAN_REQUEST_TIME));
		sb.append(",TRAN_RETURN_CODE="+TRAN_RETURN_CODE);
		sb.append(",TRAN_RETURN_MESSAGE="+TRAN_RETURN_MESSAGE);
		sb.append(",TRAN_RETURN_FLAG="+TRAN_RETURN_FLAG);
		sb.append(",REQUEST_ID="+REQUEST_ID);
		sb.append(",INTERNAL_RETURN_CODE="+INTERNAL_RETURN_CODE);
		sb.append(",INTERNAL_RETURN_FLAG="+INTERNAL_RETURN_FLAG);
		sb.append(",INTERNAL_RETURN_MESSAGE="+INTERNAL_RETURN_MESSAGE);
		sb.append(",AUTH_AMOUNT="+String.valueOf(AUTH_AMOUNT));
		sb.append(",AUTH_CODE="+AUTH_CODE);
		sb.append(",AUTH_AVS="+AUTH_AVS);
		sb.append(",AUTH_RETURN_CODE="+AUTH_RETURN_CODE);
		sb.append(",AUTH_RETURN_FLAG="+AUTH_RETURN_FLAG);
		sb.append(",AUTH_RETURN_MESSAGE="+AUTH_RETURN_MESSAGE);
		sb.append(",AUTH_TIME="+String.valueOf(AUTH_TIME));
		sb.append(",PARENT_KEY="+PARENT_KEY);
		sb.append(",REFERENCE1="+REFERENCE1);
		sb.append(",REFERENCE2="+REFERENCE2);
		sb.append(",CVV_AUTH_CODE="+CVV_AUTH_CODE);
		sb.append(",CREATETS="+String.valueOf(CREATETS));
		sb.append(",MODIFYTS="+String.valueOf(MODIFYTS));
		sb.append(",CREATEUSERID="+CREATEUSERID);
		sb.append(",MODIFYUSERID="+MODIFYUSERID);
		sb.append(",CREATEPROGID="+CREATEPROGID);
		sb.append(",MODIFYPROGID="+MODIFYPROGID);
		sb.append(",LOCKID="+String.valueOf(LOCKID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(CREDIT_CARD_TRANSACTION_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREDIT_CARD_TRANSACTION_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(CHARGE_TRANSACTION_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CHARGE_TRANSACTION_KEY);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_REQUEST_TIME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_REQUEST_TIME);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_RETURN_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_RETURN_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_RETURN_MESSAGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_RETURN_MESSAGE);
            			}
            		
        			sb.append("|");
        		
        				if(TRAN_RETURN_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRAN_RETURN_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(REQUEST_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REQUEST_ID);
            			}
            		
        			sb.append("|");
        		
        				if(INTERNAL_RETURN_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERNAL_RETURN_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(INTERNAL_RETURN_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERNAL_RETURN_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(INTERNAL_RETURN_MESSAGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INTERNAL_RETURN_MESSAGE);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_AMOUNT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_AMOUNT);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_AVS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_AVS);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_RETURN_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_RETURN_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_RETURN_FLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_RETURN_FLAG);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_RETURN_MESSAGE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_RETURN_MESSAGE);
            			}
            		
        			sb.append("|");
        		
        				if(AUTH_TIME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AUTH_TIME);
            			}
            		
        			sb.append("|");
        		
        				if(PARENT_KEY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PARENT_KEY);
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
        		
        				if(CVV_AUTH_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CVV_AUTH_CODE);
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
 		                    "YFS_CREDIT_CARD_TRANSACTION_H");
 		                    
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
     		                    						
     		                    						a("\"name\":\"CREDIT_CARD_TRANSACTION_KEY\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"CREDIT_CARD_TRANSACTION_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREDIT_CARD_TRANSACTION_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CHARGE_TRANSACTION_KEY\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"CHARGE_TRANSACTION_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CHARGE_TRANSACTION_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_TYPE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"TRAN_TYPE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_TYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"TRAN_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_REQUEST_TIME\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"TRAN_REQUEST_TIME\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_REQUEST_TIME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_RETURN_CODE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"TRAN_RETURN_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_RETURN_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_RETURN_MESSAGE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"TRAN_RETURN_MESSAGE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_RETURN_MESSAGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TRAN_RETURN_FLAG\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"TRAN_RETURN_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"TRAN_RETURN_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REQUEST_ID\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"REQUEST_ID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REQUEST_ID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INTERNAL_RETURN_CODE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"INTERNAL_RETURN_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INTERNAL_RETURN_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INTERNAL_RETURN_FLAG\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"INTERNAL_RETURN_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INTERNAL_RETURN_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"INTERNAL_RETURN_MESSAGE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"INTERNAL_RETURN_MESSAGE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INTERNAL_RETURN_MESSAGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_AMOUNT\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"AUTH_AMOUNT\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_AMOUNT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_CODE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"AUTH_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_AVS\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"AUTH_AVS\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_AVS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_RETURN_CODE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"AUTH_RETURN_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_RETURN_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_RETURN_FLAG\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"AUTH_RETURN_FLAG\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_RETURN_FLAG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_RETURN_MESSAGE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"AUTH_RETURN_MESSAGE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_RETURN_MESSAGE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"AUTH_TIME\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"AUTH_TIME\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"AUTH_TIME\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PARENT_KEY\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PARENT_KEY\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PARENT_KEY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE1\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"REFERENCE1\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REFERENCE1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REFERENCE2\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"REFERENCE2\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"REFERENCE2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CVV_AUTH_CODE\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"CVV_AUTH_CODE\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CVV_AUTH_CODE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATETS\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"CREATETS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATETS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYTS\",\"type\":{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"di.table.comment\":\"\",\"talend.field.dbType\":\"TIMESTAMP\",\"talend.field.dbColumnName\":\"MODIFYTS\",\"di.column.talendType\":\"id_Date\",\"talend.field.pattern\":\"yyyy-MM-dd'T'HH:mm:ss\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYTS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEUSERID\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"CREATEUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYUSERID\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"MODIFYUSERID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYUSERID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"CREATEPROGID\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"CREATEPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"CREATEPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MODIFYPROGID\",\"type\":\"string\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"MODIFYPROGID\",\"di.column.talendType\":\"id_String\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"MODIFYPROGID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOCKID\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"default\":\"\",\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOCKID\",\"di.column.talendType\":\"id_BigDecimal\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCKID\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_1\",\"di.table.label\":\"tDBOutput_1\"}",s);
     		                    						
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
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"  select * from STERLING.YFS_CREDIT_CARD_TRANSACTION_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysdate - 7), 'YYYY-MM-DD HH:MI:SS')    \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("IS_CONVERT_XMLTYPE" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("USE_CURSOR" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("CREDIT_CARD_TRANSACTION_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CHARGE_TRANSACTION_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_REQUEST_TIME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_RETURN_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_RETURN_MESSAGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRAN_RETURN_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REQUEST_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INTERNAL_RETURN_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INTERNAL_RETURN_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INTERNAL_RETURN_MESSAGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_AMOUNT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_AVS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_RETURN_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_RETURN_FLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_RETURN_MESSAGE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AUTH_TIME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PARENT_KEY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REFERENCE1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REFERENCE2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CVV_AUTH_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATETS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYTS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYUSERID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CREATEPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MODIFYPROGID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCKID")+"}]");
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

		    String dbquery_tDBInput_1 = "\nselect * from STERLING.YFS_CREDIT_CARD_TRANSACTION_H where TO_CHAR(MODIFYTS, 'YYYY-MM-DD HH:MI:SS') >= TO_CHAR((sysda"
+"te - 7), 'YYYY-MM-DD HH:MI:SS')\n\n";
		    
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
								row1.CREDIT_CARD_TRANSACTION_KEY = null;
							} else {
	                         		
        	row1.CREDIT_CARD_TRANSACTION_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row1.CHARGE_TRANSACTION_KEY = null;
							} else {
	                         		
        	row1.CHARGE_TRANSACTION_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row1.TRAN_TYPE = null;
							} else {
	                         		
        	row1.TRAN_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row1.TRAN_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(4) != null) {
						row1.TRAN_AMOUNT = rs_tDBInput_1.getBigDecimal(4);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row1.TRAN_REQUEST_TIME = null;
							} else {
										
			row1.TRAN_REQUEST_TIME = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 5);
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row1.TRAN_RETURN_CODE = null;
							} else {
	                         		
        	row1.TRAN_RETURN_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 6, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row1.TRAN_RETURN_MESSAGE = null;
							} else {
	                         		
        	row1.TRAN_RETURN_MESSAGE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 7, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row1.TRAN_RETURN_FLAG = null;
							} else {
	                         		
        	row1.TRAN_RETURN_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 8, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row1.REQUEST_ID = null;
							} else {
	                         		
        	row1.REQUEST_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 9, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row1.INTERNAL_RETURN_CODE = null;
							} else {
	                         		
        	row1.INTERNAL_RETURN_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 10, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row1.INTERNAL_RETURN_FLAG = null;
							} else {
	                         		
        	row1.INTERNAL_RETURN_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 11, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row1.INTERNAL_RETURN_MESSAGE = null;
							} else {
	                         		
        	row1.INTERNAL_RETURN_MESSAGE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 12, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row1.AUTH_AMOUNT = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(13) != null) {
						row1.AUTH_AMOUNT = rs_tDBInput_1.getBigDecimal(13);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row1.AUTH_CODE = null;
							} else {
	                         		
        	row1.AUTH_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 14, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row1.AUTH_AVS = null;
							} else {
	                         		
        	row1.AUTH_AVS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row1.AUTH_RETURN_CODE = null;
							} else {
	                         		
        	row1.AUTH_RETURN_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row1.AUTH_RETURN_FLAG = null;
							} else {
	                         		
        	row1.AUTH_RETURN_FLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row1.AUTH_RETURN_MESSAGE = null;
							} else {
	                         		
        	row1.AUTH_RETURN_MESSAGE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row1.AUTH_TIME = null;
							} else {
										
			row1.AUTH_TIME = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 19);
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row1.PARENT_KEY = null;
							} else {
	                         		
        	row1.PARENT_KEY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 20, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row1.REFERENCE1 = null;
							} else {
	                         		
        	row1.REFERENCE1 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 21, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row1.REFERENCE2 = null;
							} else {
	                         		
        	row1.REFERENCE2 = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row1.CVV_AUTH_CODE = null;
							} else {
	                         		
        	row1.CVV_AUTH_CODE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 23, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row1.CREATETS = null;
							} else {
										
			row1.CREATETS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 24);
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row1.MODIFYTS = null;
							} else {
										
			row1.MODIFYTS = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 25);
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row1.CREATEUSERID = null;
							} else {
	                         		
        	row1.CREATEUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 26, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row1.MODIFYUSERID = null;
							} else {
	                         		
        	row1.MODIFYUSERID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 27, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row1.CREATEPROGID = null;
							} else {
	                         		
        	row1.CREATEPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 28, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row1.MODIFYPROGID = null;
							} else {
	                         		
        	row1.MODIFYPROGID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row1.LOCKID = null;
							} else {
		                          
					if(rs_tDBInput_1.getObject(30) != null) {
						row1.LOCKID = rs_tDBInput_1.getBigDecimal(30);
					} else {
				
 	                	throw new RuntimeException("Null value in non-Nullable column");
					}
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
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CREDIT_CARD_TRANSACTION_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CREDIT_CARD_TRANSACTION_KEY", row1.CREDIT_CARD_TRANSACTION_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CHARGE_TRANSACTION_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("CHARGE_TRANSACTION_KEY", row1.CHARGE_TRANSACTION_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_TYPE") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_TYPE", row1.TRAN_TYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_AMOUNT", row1.TRAN_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_REQUEST_TIME") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_REQUEST_TIME", row1.TRAN_REQUEST_TIME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_RETURN_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_RETURN_CODE", row1.TRAN_RETURN_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_RETURN_MESSAGE") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_RETURN_MESSAGE", row1.TRAN_RETURN_MESSAGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TRAN_RETURN_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("TRAN_RETURN_FLAG", row1.TRAN_RETURN_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REQUEST_ID") != null){
                    incomingEnforcer_tDBOutput_1.put("REQUEST_ID", row1.REQUEST_ID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INTERNAL_RETURN_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("INTERNAL_RETURN_CODE", row1.INTERNAL_RETURN_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INTERNAL_RETURN_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("INTERNAL_RETURN_FLAG", row1.INTERNAL_RETURN_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("INTERNAL_RETURN_MESSAGE") != null){
                    incomingEnforcer_tDBOutput_1.put("INTERNAL_RETURN_MESSAGE", row1.INTERNAL_RETURN_MESSAGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_AMOUNT") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_AMOUNT", row1.AUTH_AMOUNT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_CODE", row1.AUTH_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_AVS") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_AVS", row1.AUTH_AVS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_RETURN_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_RETURN_CODE", row1.AUTH_RETURN_CODE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_RETURN_FLAG") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_RETURN_FLAG", row1.AUTH_RETURN_FLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_RETURN_MESSAGE") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_RETURN_MESSAGE", row1.AUTH_RETURN_MESSAGE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("AUTH_TIME") != null){
                    incomingEnforcer_tDBOutput_1.put("AUTH_TIME", row1.AUTH_TIME);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("PARENT_KEY") != null){
                    incomingEnforcer_tDBOutput_1.put("PARENT_KEY", row1.PARENT_KEY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE1") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE1", row1.REFERENCE1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REFERENCE2") != null){
                    incomingEnforcer_tDBOutput_1.put("REFERENCE2", row1.REFERENCE2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("CVV_AUTH_CODE") != null){
                    incomingEnforcer_tDBOutput_1.put("CVV_AUTH_CODE", row1.CVV_AUTH_CODE);
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
        final YFS_CREDIT_CARD_TRANSACTION_H YFS_CREDIT_CARD_TRANSACTION_HClass = new YFS_CREDIT_CARD_TRANSACTION_H();

        int exitCode = YFS_CREDIT_CARD_TRANSACTION_HClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'YFS_CREDIT_CARD_TRANSACTION_H' - Done.");
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
			log.info("TalendJob: 'YFS_CREDIT_CARD_TRANSACTION_H' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_wDDvgOmaEeu_j5YptPMFjw");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-18T03:45:32.391930500Z");

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
            java.io.InputStream inContext = YFS_CREDIT_CARD_TRANSACTION_H.class.getClassLoader().getResourceAsStream("at_talend_jobs/yfs_credit_card_transaction_h_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = YFS_CREDIT_CARD_TRANSACTION_H.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'YFS_CREDIT_CARD_TRANSACTION_H' - Started.");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : YFS_CREDIT_CARD_TRANSACTION_H");
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
        log.info("TalendJob: 'YFS_CREDIT_CARD_TRANSACTION_H' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     222103 characters generated by Talend Cloud Data Management Platform 
 *     on the June 17, 2023 at 11:45:32 PM EDT
 ************************************************************************************************/