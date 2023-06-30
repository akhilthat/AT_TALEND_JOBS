
package at_talend_jobs.ttt000cl1_0_1;

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
 * Job: TTT000CL1 Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class TTT000CL1 implements TalendJob {
	static {System.setProperty("TalendJob.log", "TTT000CL1.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(TTT000CL1.class);
	

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
			
			if(jda_password != null){
				
					this.setProperty("jda_password", jda_password.toString());
				
			}
			
			if(jda_user_name != null){
				
					this.setProperty("jda_user_name", jda_user_name.toString());
				
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
public java.lang.String jda_password;
public java.lang.String getJda_password(){
	return this.jda_password;
}
public String jda_user_name;
public String getJda_user_name(){
	return this.jda_user_name;
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
	}
			
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "TTT000CL1";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_33eZ4AbrEeqkGZ2htTjMeA", "0.1");
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
				TTT000CL1.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(TTT000CL1.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tParallelize_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
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
			public void tParallelize_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:edEBsOsIQUs4xXuLIN5KP+1jefOvwYaMxO0A8WH70wJEAzG+"));
 		                        
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
	

public void tParallelize_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tParallelize_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tParallelize_1");
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
	 * [tParallelize_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tParallelize_1", false);
		start_Hash.put("tParallelize_1", System.currentTimeMillis());
		
	
	currentComponent="tParallelize_1";
	
	
		int tos_count_tParallelize_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tParallelize_1", "tParallelize_1", "tParallelize");
				talendJobLogProcess(globalMap);
			}
			

// call parallelized subjobs
	java.util.Map<String, Thread> mt_tParallelize_1 = new java.util.HashMap<String, Thread>();

// clear the temporary values in the globalMap
	globalMap.remove("tDBRow_3_SUBPROCESS_STATE");
	globalMap.remove("tDBRow_1_SUBPROCESS_STATE");
	globalMap.remove("tDBRow_2_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if(globalMap instanceof java.util.HashMap){
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				}else{
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;
			
		runningThreadCount.add(1);
		String name_tDBRow_3 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBRow_3 = new Thread(new ThreadGroup(name_tDBRow_3), name_tDBRow_3){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						
							mdcInfo.forEach(org.slf4j.MDC::put);
						
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_3' starts.");
					
					tDBRow_3Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_3' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_3_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_3_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBRow_3.start();
		mt_tParallelize_1.put("tDBRow_3",thread_tDBRow_3);
		runningThreadCount.add(1);
		String name_tDBRow_1 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBRow_1 = new Thread(new ThreadGroup(name_tDBRow_1), name_tDBRow_1){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						
							mdcInfo.forEach(org.slf4j.MDC::put);
						
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_1' starts.");
					
					tDBRow_1Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_1' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_1_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_1_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBRow_1.start();
		mt_tParallelize_1.put("tDBRow_1",thread_tDBRow_1);
		runningThreadCount.add(1);
		String name_tDBRow_2 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBRow_2 = new Thread(new ThreadGroup(name_tDBRow_2), name_tDBRow_2){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						
							mdcInfo.forEach(org.slf4j.MDC::put);
						
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_2' starts.");
					
					tDBRow_2Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_2' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_2_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_2_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBRow_2.start();
		mt_tParallelize_1.put("tDBRow_2",thread_tDBRow_2);
	while(
(
		((globalMap.get("tDBRow_3_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_3_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBRow_1_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_1_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBRow_2_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_2_SUBPROCESS_STATE")==0))|| false) ) {
	Thread.sleep(100);
}


// call next subprocesses

 



/**
 * [tParallelize_1 begin ] stop
 */
	
	/**
	 * [tParallelize_1 main ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 


	tos_count_tParallelize_1++;

/**
 * [tParallelize_1 main ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 process_data_begin ] stop
 */
	
	/**
	 * [tParallelize_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 process_data_end ] stop
 */
	
	/**
	 * [tParallelize_1 end ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 

ok_Hash.put("tParallelize_1", true);
end_Hash.put("tParallelize_1", System.currentTimeMillis());




/**
 * [tParallelize_1 end ] stop
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
	 * [tParallelize_1 finally ] start
	 */

	

	
	
	currentComponent="tParallelize_1";
	
	

 



/**
 * [tParallelize_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tParallelize_1_SUBPROCESS_STATE", 1);
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
				talendJobLog.addCM("tDBRow_3", "tDBRow_2", "tSnowflakeRow");
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
 		                    "DELETE from TABLE_OF_DISTRICTS_TBLDST\nWHERE LOAD_DATE = CURRENT_DATE()");
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tDBInput_3Process(globalMap);



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
	


public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal STRDST;

				public BigDecimal getSTRDST () {
					return this.STRDST;
				}

				public Boolean STRDSTIsNullable(){
				    return false;
				}
				public Boolean STRDSTIsKey(){
				    return false;
				}
				public Integer STRDSTLength(){
				    return 3;
				}
				public Integer STRDSTPrecision(){
				    return 0;
				}
				public String STRDSTDefault(){
				
					return "";
				
				}
				public String STRDSTComment(){
				
				    return "";
				
				}
				public String STRDSTPattern(){
				
					return "";
				
				}
				public String STRDSTOriginalDbColumnName(){
				
					return "STRDST";
				
				}

				
			    public String DSTNAM;

				public String getDSTNAM () {
					return this.DSTNAM;
				}

				public Boolean DSTNAMIsNullable(){
				    return false;
				}
				public Boolean DSTNAMIsKey(){
				    return false;
				}
				public Integer DSTNAMLength(){
				    return 20;
				}
				public Integer DSTNAMPrecision(){
				    return 0;
				}
				public String DSTNAMDefault(){
				
					return null;
				
				}
				public String DSTNAMComment(){
				
				    return "";
				
				}
				public String DSTNAMPattern(){
				
					return "";
				
				}
				public String DSTNAMOriginalDbColumnName(){
				
					return "DSTNAM";
				
				}

				
			    public String DSTSHT;

				public String getDSTSHT () {
					return this.DSTSHT;
				}

				public Boolean DSTSHTIsNullable(){
				    return false;
				}
				public Boolean DSTSHTIsKey(){
				    return false;
				}
				public Integer DSTSHTLength(){
				    return 8;
				}
				public Integer DSTSHTPrecision(){
				    return 0;
				}
				public String DSTSHTDefault(){
				
					return null;
				
				}
				public String DSTSHTComment(){
				
				    return "";
				
				}
				public String DSTSHTPattern(){
				
					return "";
				
				}
				public String DSTSHTOriginalDbColumnName(){
				
					return "DSTSHT";
				
				}

				
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return false;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return 3;
				}
				public Integer REGNUMPrecision(){
				    return 0;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("STRDST="+String.valueOf(STRDST));
		sb.append(",DSTNAM="+DSTNAM);
		sb.append(",DSTSHT="+DSTSHT);
		sb.append(",REGNUM="+String.valueOf(REGNUM));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(STRDST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STRDST);
            			}
            		
        			sb.append("|");
        		
        				if(DSTNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTNAM);
            			}
            		
        			sb.append("|");
        		
        				if(DSTSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTSHT);
            			}
            		
        			sb.append("|");
        		
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
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
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBInput_3");
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
	 * [tFileOutputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_3", false);
		start_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
		int tos_count_tFileOutputDelimited_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_3 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_3.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_3.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLDST.csv\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("COMPRESS" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                            log4jParamters_tFileOutputDelimited_3.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + (log4jParamters_tFileOutputDelimited_3) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_3", "tFileOutputDelimited_2", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_3 = "";
    fileName_tFileOutputDelimited_3 = (new java.io.File("/data/talend/data_repository/TBLDST.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_3 = null;
    String extension_tFileOutputDelimited_3 = null;
    String directory_tFileOutputDelimited_3 = null;
    if((fileName_tFileOutputDelimited_3.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_3.lastIndexOf(".") < fileName_tFileOutputDelimited_3.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
            extension_tFileOutputDelimited_3 = "";
        } else {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("."));
            extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_3.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(0, fileName_tFileOutputDelimited_3.lastIndexOf("."));
            extension_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3.substring(fileName_tFileOutputDelimited_3.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_3 = fileName_tFileOutputDelimited_3;
            extension_tFileOutputDelimited_3 = "";
        }
        directory_tFileOutputDelimited_3 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_3 = true;
    java.io.File filetFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
    globalMap.put("tFileOutputDelimited_3_FILE_NAME",fileName_tFileOutputDelimited_3);
            int nb_line_tFileOutputDelimited_3 = 0;
            int splitedFileNo_tFileOutputDelimited_3 = 0;
            int currentRow_tFileOutputDelimited_3 = 0;

            final String OUT_DELIM_tFileOutputDelimited_3 = /** Start field tFileOutputDelimited_3:FIELDSEPARATOR */","/** End field tFileOutputDelimited_3:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_3 = /** Start field tFileOutputDelimited_3:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_3:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_3 != null && directory_tFileOutputDelimited_3.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_3 = new java.io.File(directory_tFileOutputDelimited_3);
                        if(!dir_tFileOutputDelimited_3.exists()) {
                                log.info("tFileOutputDelimited_3 - Creating directory '" + dir_tFileOutputDelimited_3.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_3.mkdirs();
                                log.info("tFileOutputDelimited_3 - The directory '"+ dir_tFileOutputDelimited_3.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        filetFileOutputDelimited_3 = new java.io.File(fileName_tFileOutputDelimited_3);
                        String zipName_tFileOutputDelimited_3 = fullName_tFileOutputDelimited_3 + ".zip";
                        java.io.File file_tFileOutputDelimited_3 = new java.io.File(zipName_tFileOutputDelimited_3);
                        //routines.system.Row
                        java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_3= null;
                        java.io.Writer outtFileOutputDelimited_3 = null;

                        if(file_tFileOutputDelimited_3.exists()) {
                            file_tFileOutputDelimited_3.delete();
                        }
                        zipOut_tFileOutputDelimited_3= new java.util.zip.ZipOutputStream(
                                new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_3)));
                        zipOut_tFileOutputDelimited_3.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_3.getName()));
                        outtFileOutputDelimited_3 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_3,"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_3", outtFileOutputDelimited_3);
                        synchronized (multiThreadLockWrite) {
                                    if(file_tFileOutputDelimited_3.length()==0){
                                        outtFileOutputDelimited_3.write("STRDST");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("DSTNAM");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("DSTSHT");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("REGNUM");
                                        outtFileOutputDelimited_3.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.flush();
                                    }
                        }


resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);

 



/**
 * [tFileOutputDelimited_3 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";
	
	
		int tos_count_tDBInput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_3 = new StringBuilder();
                    log4jParamters_tDBInput_3.append("Parameters:");
                            log4jParamters_tDBInput_3.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("DB_VERSION" + " = " + "jt400-9.8.jar");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("HOST" + " = " + "context.jda_host_name");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("DBNAME" + " = " + "context.jda_mm_lib");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("USER" + " = " + "context.jda_user_name");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password)).substring(0, 4) + "...");     
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"select * from MM4R5LIB.TBLDST\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("STRDST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DSTNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DSTSHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGNUM")+"}]");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
                        log4jParamters_tDBInput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + (log4jParamters_tDBInput_3) );
                    } 
                } 
            new BytesLimit65535_tDBInput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_3", "tDBInput_2", "tAS400Input");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "com.ibm.as400.access.AS400JDBCDriver";
			    java.lang.Class jdbcclazz_tDBInput_3 = java.lang.Class.forName(driverClass_tDBInput_3);
				String dbUser_tDBInput_3 = context.jda_user_name;
				
				
	final String decryptedPassword_tDBInput_3 = context.jda_password; 
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				  
				String url_tDBInput_3 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";" + "prompt=false";
				
	    		log.debug("tDBInput_3 - Driver ClassName: "+driverClass_tDBInput_3+".");
			
	    		log.debug("tDBInput_3 - Connection attempt to '" + url_tDBInput_3 + "' with the username '" + dbUser_tDBInput_3 + "'.");
			
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
	    		log.debug("tDBInput_3 - Connection to '" + url_tDBInput_3 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "select * from MM4R5LIB.TBLDST";
		    
	    		log.debug("tDBInput_3 - Executing the query: '" + dbquery_tDBInput_3 + "'.");
			

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    	log.debug("tDBInput_3 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row1.STRDST = null;
							} else {
		                          
            row1.STRDST = rs_tDBInput_3.getBigDecimal(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row1.DSTNAM = null;
							} else {
	                         		
        	row1.DSTNAM = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row1.DSTSHT = null;
							} else {
	                         		
        	row1.DSTSHT = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row1.REGNUM = null;
							} else {
		                          
            row1.REGNUM = rs_tDBInput_3.getBigDecimal(4);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					
						log.debug("tDBInput_3 - Retrieving the record " + nb_line_tDBInput_3 + ".");
					



 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tDBInput_3","tDBInput_2","tAS400Input","tFileOutputDelimited_3","tFileOutputDelimited_2","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
                            if(row1.STRDST != null) {
                        sb_tFileOutputDelimited_3.append(
                            row1.STRDST.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row1.DSTNAM != null) {
                        sb_tFileOutputDelimited_3.append(
                            row1.DSTNAM
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row1.DSTSHT != null) {
                        sb_tFileOutputDelimited_3.append(
                            row1.DSTSHT
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row1.REGNUM != null) {
                        sb_tFileOutputDelimited_3.append(
                            row1.REGNUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                    sb_tFileOutputDelimited_3.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_3);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_3++;
                    resourceMap.put("nb_line_tFileOutputDelimited_3", nb_line_tFileOutputDelimited_3);

                        outtFileOutputDelimited_3.write(sb_tFileOutputDelimited_3.toString());
                        log.debug("tFileOutputDelimited_3 - Writing the record " + nb_line_tFileOutputDelimited_3 + ".");

                    }



 


	tos_count_tFileOutputDelimited_3++;

/**
 * [tFileOutputDelimited_3 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	

 



/**
 * [tFileOutputDelimited_3 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	

 



/**
 * [tFileOutputDelimited_3 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	

	}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
		if(conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {
			
	    		log.debug("tDBInput_3 - Closing the connection to the database.");
			
			conn_tDBInput_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_3 - Connection to the database closed.");
			
		}
}
globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
	    		log.debug("tDBInput_3 - Retrieved records count: "+nb_line_tDBInput_3 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_3 - "  + ("Done.") );

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_3!=null) {
						outtFileOutputDelimited_3.flush();
						outtFileOutputDelimited_3.close();
					}
				
				globalMap.put("tFileOutputDelimited_3_NB_LINE",nb_line_tFileOutputDelimited_3);
				globalMap.put("tFileOutputDelimited_3_FILE_NAME",fileName_tFileOutputDelimited_3);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_3", true);
	
				log.debug("tFileOutputDelimited_3 - Written records count: " + nb_line_tFileOutputDelimited_3 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tDBInput_3","tDBInput_2","tAS400Input","tFileOutputDelimited_3","tFileOutputDelimited_2","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_3 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_3", true);
end_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_3 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tFileInputDelimited_3Process(globalMap); 
						



	
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";
	
	

 



/**
 * [tDBInput_3 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_3 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_3";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_3") == null){ 
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_3 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_3");
						if(outtFileOutputDelimited_3!=null) {
							outtFileOutputDelimited_3.flush();
							outtFileOutputDelimited_3.close();
						}
					
				
				}
			
			
		}
	

 



/**
 * [tFileOutputDelimited_3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class TBLDSTStruct implements routines.system.IPersistableRow<TBLDSTStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal STRDST;

				public BigDecimal getSTRDST () {
					return this.STRDST;
				}

				public Boolean STRDSTIsNullable(){
				    return true;
				}
				public Boolean STRDSTIsKey(){
				    return false;
				}
				public Integer STRDSTLength(){
				    return null;
				}
				public Integer STRDSTPrecision(){
				    return null;
				}
				public String STRDSTDefault(){
				
					return "";
				
				}
				public String STRDSTComment(){
				
				    return "";
				
				}
				public String STRDSTPattern(){
				
					return "";
				
				}
				public String STRDSTOriginalDbColumnName(){
				
					return "STRDST";
				
				}

				
			    public String DSTNAM;

				public String getDSTNAM () {
					return this.DSTNAM;
				}

				public Boolean DSTNAMIsNullable(){
				    return true;
				}
				public Boolean DSTNAMIsKey(){
				    return false;
				}
				public Integer DSTNAMLength(){
				    return null;
				}
				public Integer DSTNAMPrecision(){
				    return null;
				}
				public String DSTNAMDefault(){
				
					return null;
				
				}
				public String DSTNAMComment(){
				
				    return "";
				
				}
				public String DSTNAMPattern(){
				
					return "";
				
				}
				public String DSTNAMOriginalDbColumnName(){
				
					return "DSTNAM";
				
				}

				
			    public String DSTSHT;

				public String getDSTSHT () {
					return this.DSTSHT;
				}

				public Boolean DSTSHTIsNullable(){
				    return true;
				}
				public Boolean DSTSHTIsKey(){
				    return false;
				}
				public Integer DSTSHTLength(){
				    return null;
				}
				public Integer DSTSHTPrecision(){
				    return null;
				}
				public String DSTSHTDefault(){
				
					return null;
				
				}
				public String DSTSHTComment(){
				
				    return "";
				
				}
				public String DSTSHTPattern(){
				
					return "";
				
				}
				public String DSTSHTOriginalDbColumnName(){
				
					return "DSTSHT";
				
				}

				
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return true;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return null;
				}
				public Integer REGNUMPrecision(){
				    return null;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
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
		sb.append("STRDST="+String.valueOf(STRDST));
		sb.append(",DSTNAM="+DSTNAM);
		sb.append(",DSTSHT="+DSTSHT);
		sb.append(",REGNUM="+String.valueOf(REGNUM));
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(STRDST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STRDST);
            			}
            		
        			sb.append("|");
        		
        				if(DSTNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTNAM);
            			}
            		
        			sb.append("|");
        		
        				if(DSTSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTSHT);
            			}
            		
        			sb.append("|");
        		
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
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
    public int compareTo(TBLDSTStruct other) {

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

public static class row12Struct implements routines.system.IPersistableRow<row12Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal STRDST;

				public BigDecimal getSTRDST () {
					return this.STRDST;
				}

				public Boolean STRDSTIsNullable(){
				    return true;
				}
				public Boolean STRDSTIsKey(){
				    return false;
				}
				public Integer STRDSTLength(){
				    return null;
				}
				public Integer STRDSTPrecision(){
				    return null;
				}
				public String STRDSTDefault(){
				
					return "";
				
				}
				public String STRDSTComment(){
				
				    return "";
				
				}
				public String STRDSTPattern(){
				
					return "";
				
				}
				public String STRDSTOriginalDbColumnName(){
				
					return "STRDST";
				
				}

				
			    public String DSTNAM;

				public String getDSTNAM () {
					return this.DSTNAM;
				}

				public Boolean DSTNAMIsNullable(){
				    return true;
				}
				public Boolean DSTNAMIsKey(){
				    return false;
				}
				public Integer DSTNAMLength(){
				    return null;
				}
				public Integer DSTNAMPrecision(){
				    return null;
				}
				public String DSTNAMDefault(){
				
					return null;
				
				}
				public String DSTNAMComment(){
				
				    return "";
				
				}
				public String DSTNAMPattern(){
				
					return "";
				
				}
				public String DSTNAMOriginalDbColumnName(){
				
					return "DSTNAM";
				
				}

				
			    public String DSTSHT;

				public String getDSTSHT () {
					return this.DSTSHT;
				}

				public Boolean DSTSHTIsNullable(){
				    return true;
				}
				public Boolean DSTSHTIsKey(){
				    return false;
				}
				public Integer DSTSHTLength(){
				    return null;
				}
				public Integer DSTSHTPrecision(){
				    return null;
				}
				public String DSTSHTDefault(){
				
					return null;
				
				}
				public String DSTSHTComment(){
				
				    return "";
				
				}
				public String DSTSHTPattern(){
				
					return "";
				
				}
				public String DSTSHTOriginalDbColumnName(){
				
					return "DSTSHT";
				
				}

				
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return true;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return null;
				}
				public Integer REGNUMPrecision(){
				    return null;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.STRDST = (BigDecimal) dis.readObject();
					
					this.DSTNAM = readString(dis);
					
					this.DSTSHT = readString(dis);
					
						this.REGNUM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.STRDST);
					
					// String
				
						writeString(this.DSTNAM,dos);
					
					// String
				
						writeString(this.DSTSHT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("STRDST="+String.valueOf(STRDST));
		sb.append(",DSTNAM="+DSTNAM);
		sb.append(",DSTSHT="+DSTSHT);
		sb.append(",REGNUM="+String.valueOf(REGNUM));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(STRDST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(STRDST);
            			}
            		
        			sb.append("|");
        		
        				if(DSTNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTNAM);
            			}
            		
        			sb.append("|");
        		
        				if(DSTSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DSTSHT);
            			}
            		
        			sb.append("|");
        		
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
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
public void tFileInputDelimited_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_3");
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
TBLDSTStruct TBLDST = new TBLDSTStruct();





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"TBLDST");
			
		int tos_count_tDBOutput_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_3", "tDBOutput_2", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_3 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_3 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_3 = (String)(restRequest_tDBOutput_3 != null ? restRequest_tDBOutput_3.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_3 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_3 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_3 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_3 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_3.createRuntimeProperties();
 		                    props_tDBOutput_3.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);
 		                    
 		                    props_tDBOutput_3.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_3.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_3.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_3.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_3.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_3_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_3_1_fisrt sst_tDBOutput_3_1_fisrt = new SchemaSettingTool_tDBOutput_3_1_fisrt();
 		                    
 		                    props_tDBOutput_3.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_3_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_3.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_3.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_3.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_3.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_3.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_3.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_3.table.setValue("tableName",
 		                    "TABLE_OF_DISTRICTS_TBLDST");
 		                    
 		                    props_tDBOutput_3.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_3.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_3.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_3.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_3.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_3_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"TABLE_OF_DISTRICTS_TBLDST\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"STRDST\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"STRDST\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DSTNAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"DSTNAM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DSTSHT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"DSTSHT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REGNUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"REGNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_3_2_fisrt sst_tDBOutput_3_2_fisrt = new SchemaSettingTool_tDBOutput_3_2_fisrt();
 		                    
 		                    props_tDBOutput_3.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_3_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_3.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_3 = props_tDBOutput_3.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_3.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_3);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_3.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_3 = props_tDBOutput_3.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_3.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_3);
        }
    }
globalMap.put("tDBOutput_3_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_3);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_3= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_3_MAPPINGS_URL", mappings_url_tDBOutput_3);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_3 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_3";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_3 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_3 = null;
topology_tDBOutput_3 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_3 = def_tDBOutput_3.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_3, topology_tDBOutput_3);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_3 = def_tDBOutput_3.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_3 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_3.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_3 = componentRuntime_tDBOutput_3.initialize(container_tDBOutput_3, props_tDBOutput_3);

if (initVr_tDBOutput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_3.getMessage());
}

if(componentRuntime_tDBOutput_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_3;
	compDriverInitialization_tDBOutput_3.runAtDriver(container_tDBOutput_3);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_3 = null;
if(componentRuntime_tDBOutput_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_3 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_3;
	if (doesNodeBelongToRequest_tDBOutput_3) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_3 = sourceOrSink_tDBOutput_3.validate(container_tDBOutput_3);
        if (vr_tDBOutput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_3.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_3 = null;
    if (sourceOrSink_tDBOutput_3 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_3 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_3;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_3 = sink_tDBOutput_3.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_3) {
            writeOperation_tDBOutput_3.initialize(container_tDBOutput_3);
        }
        writer_tDBOutput_3 = writeOperation_tDBOutput_3.createWriter(container_tDBOutput_3);
        if (doesNodeBelongToRequest_tDBOutput_3) {
            writer_tDBOutput_3.open("tDBOutput_3");
        }

        resourceMap.put("writer_tDBOutput_3", writer_tDBOutput_3);
    } // end of "sourceOrSink_tDBOutput_3 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_3 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_3.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_3 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_3 = props_tDBOutput_3.getSchema(c_tDBOutput_3, false);
    incomingEnforcer_tDBOutput_3 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_3);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_3 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_3 = null;


 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row12");
			
		int tos_count_tMap_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_3 = new StringBuilder();
                    log4jParamters_tMap_3.append("Parameters:");
                            log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + (log4jParamters_tMap_3) );
                    } 
                } 
            new BytesLimit65535_tMap_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_3", "tMap_2", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row12_tMap_3 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	java.util.Date var1;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_TBLDST_tMap_3 = 0;
				
TBLDSTStruct TBLDST_tmp = new TBLDSTStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_3", false);
		start_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_3";
	
	
		int tos_count_tFileInputDelimited_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_3 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_3.append("Parameters:");
                            log4jParamters_tFileInputDelimited_3.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLDST.zip\"");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("REMOVE_EMPTY_ROW" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("UNCOMPRESS" + " = " + "true");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("STRDST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DSTNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DSTSHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGNUM")+"}]");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                            log4jParamters_tFileInputDelimited_3.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_3 - "  + (log4jParamters_tFileInputDelimited_3) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_3", "tFileInputDelimited_2", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_3 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_3 = null;
				int limit_tFileInputDelimited_3 = -1;
				try{
					
						Object filename_tFileInputDelimited_3 = "/data/talend/data_repository/TBLDST.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_3 = null;
						try {
							if(filename_tFileInputDelimited_3 instanceof java.io.InputStream){
								zis_tFileInputDelimited_3 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_3));
							}else{
								zis_tFileInputDelimited_3 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_3))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_3 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_3 = zis_tFileInputDelimited_3.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
							if(entry_tFileInputDelimited_3 == null) {
								break;
							}
							if(entry_tFileInputDelimited_3.isDirectory()){ //directory
								continue;
							}
							try {
								fid_tFileInputDelimited_3 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_3, "ISO-8859-15",",","\n",false,1,0,
								
									limit_tFileInputDelimited_3
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
					
				    
				    	log.info("tFileInputDelimited_3 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_3!=null && fid_tFileInputDelimited_3.nextRecord()) {
						rowstate_tFileInputDelimited_3.reset();
						
			    						row12 = null;			
												
									boolean whetherReject_tFileInputDelimited_3 = false;
									row12 = new row12Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_3 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_3 = 0;
					
						temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						if(temp.length() > 0) {
							
								try {
								
    								row12.STRDST = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
									rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"STRDST", "row12", temp, ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
								}
    							
						} else {						
							
								
									row12.STRDST = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_3 = 1;
					
							row12.DSTNAM = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						
				
					columnIndexWithD_tFileInputDelimited_3 = 2;
					
							row12.DSTSHT = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						
				
					columnIndexWithD_tFileInputDelimited_3 = 3;
					
						temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						if(temp.length() > 0) {
							
								try {
								
    								row12.REGNUM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
									rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"REGNUM", "row12", temp, ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
								}
    							
						} else {						
							
								
									row12.REGNUM = null;
								
							
						}
					
				
				
										
										if(rowstate_tFileInputDelimited_3.getException()!=null) {
											throw rowstate_tFileInputDelimited_3.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_3 = true;
			        					
			            					throw(e);
			            				
			    					}
								
			log.debug("tFileInputDelimited_3 - Retrieving the record " + fid_tFileInputDelimited_3.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_3 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";
	
	

 


	tos_count_tFileInputDelimited_3++;

/**
 * [tFileInputDelimited_3 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";
	
	

 



/**
 * [tFileInputDelimited_3 process_data_begin ] stop
 */
// Start of branch "row12"
if(row12 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row12","tFileInputDelimited_3","tFileInputDelimited_2","tFileInputDelimited","tMap_3","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row12 - " + (row12==null? "": row12.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_3 = false;
		boolean mainRowRejected_tMap_3 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.var1 = TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")) ;// ###############################
        // ###############################
        // # Output tables

TBLDST = null;


// # Output table : 'TBLDST'
count_TBLDST_tMap_3++;

TBLDST_tmp.STRDST = row12.STRDST;
TBLDST_tmp.DSTNAM = row12.DSTNAM;
TBLDST_tmp.DSTSHT = row12.DSTSHT;
TBLDST_tmp.REGNUM = row12.REGNUM;
TBLDST_tmp.LOAD_DATE = Var.var1 ;
TBLDST = TBLDST_tmp;
log.debug("tMap_3 - Outputting the record " + count_TBLDST_tMap_3 + " of the output table 'TBLDST'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "TBLDST"
if(TBLDST != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"TBLDST","tMap_3","tMap_2","tMap","tDBOutput_3","tDBOutput_2","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("TBLDST - " + (TBLDST==null? "": TBLDST.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_3 != null) {
            incomingEnforcer_tDBOutput_3.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("STRDST") != null){
                    incomingEnforcer_tDBOutput_3.put("STRDST", TBLDST.STRDST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("DSTNAM") != null){
                    incomingEnforcer_tDBOutput_3.put("DSTNAM", TBLDST.DSTNAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("DSTSHT") != null){
                    incomingEnforcer_tDBOutput_3.put("DSTSHT", TBLDST.DSTSHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("REGNUM") != null){
                    incomingEnforcer_tDBOutput_3.put("REGNUM", TBLDST.REGNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_3.put("LOAD_DATE", TBLDST.LOAD_DATE);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_3 = null;
        if (incomingEnforcer_tDBOutput_3 != null) {
            data_tDBOutput_3 = incomingEnforcer_tDBOutput_3.getCurrentRecord();
        }
        
        if (writer_tDBOutput_3 != null && data_tDBOutput_3 != null) {
        	writer_tDBOutput_3.write(data_tDBOutput_3);
        }
        
        nb_line_tDBOutput_3++;

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	


 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	


 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "TBLDST"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "row12"




	
	/**
	 * [tFileInputDelimited_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";
	
	

 



/**
 * [tFileInputDelimited_3 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";
	
	


				
            }
            nb_line_tFileInputDelimited_3+=fid_tFileInputDelimited_3.getRowNumber();
		}
		}finally{
            if(!((Object)("/data/talend/data_repository/TBLDST.zip") instanceof java.io.InputStream)){
            	if(fid_tFileInputDelimited_3!=null){
            		fid_tFileInputDelimited_3.close();
            	}
            }
            if(fid_tFileInputDelimited_3!=null){
            	globalMap.put("tFileInputDelimited_3_NB_LINE", nb_line_tFileInputDelimited_3);
            }
					
						log.info("tFileInputDelimited_3- Retrieved records count: "+ nb_line_tFileInputDelimited_3 + ".");
					
        }
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_3 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_3", true);
end_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());




/**
 * [tFileInputDelimited_3 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'TBLDST': " + count_TBLDST_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row12",2,0,
			 			"tFileInputDelimited_3","tFileInputDelimited_2","tFileInputDelimited","tMap_3","tMap_2","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Done.") );

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_3", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_3 = null;
    if (writer_tDBOutput_3 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_3 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_3.close();
        resultMap_tDBOutput_3 = writer_tDBOutput_3.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_3), container_tDBOutput_3);
    }
if(resultMap_tDBOutput_3!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_3 : resultMap_tDBOutput_3.entrySet()) {
		switch(entry_tDBOutput_3.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_3.setComponentData("tDBOutput_3", "ERROR_MESSAGE", entry_tDBOutput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_LINE", entry_tDBOutput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_SUCCESS", entry_tDBOutput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_3.setComponentData("tDBOutput_3", "NB_REJECT", entry_tDBOutput_3.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_3 = new StringBuilder();
            for (int i_tDBOutput_3 = 0; i_tDBOutput_3 < entry_tDBOutput_3.getKey().length(); i_tDBOutput_3++) {
                char ch_tDBOutput_3 = entry_tDBOutput_3.getKey().charAt(i_tDBOutput_3);
                if(Character.isUpperCase(ch_tDBOutput_3) && i_tDBOutput_3> 0) {
                	studio_key_tDBOutput_3.append('_');
                }
                studio_key_tDBOutput_3.append(ch_tDBOutput_3);
            }
			container_tDBOutput_3.setComponentData("tDBOutput_3", studio_key_tDBOutput_3.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_3.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"TBLDST",2,0,
			 			"tMap_3","tMap_2","tMap","tDBOutput_3","tDBOutput_2","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tFileDelete_3Process(globalMap);



/**
 * [tDBOutput_3 end ] stop
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
	 * [tFileInputDelimited_3 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";
	
	

 



/**
 * [tFileInputDelimited_3 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";
	
	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_3")==null){
    if(resourceMap.get("writer_tDBOutput_3")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_3")).close();
		} catch (java.io.IOException e_tDBOutput_3) {
			String errorMessage_tDBOutput_3 = "failed to release the resource in tDBOutput_3 :" + e_tDBOutput_3.getMessage();
			System.err.println(errorMessage_tDBOutput_3);
		}
	}
}
 



/**
 * [tDBOutput_3 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 1);
	}
	

public void tFileDelete_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileDelete_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_3");
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
	 * [tFileDelete_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileDelete_3", false);
		start_Hash.put("tFileDelete_3", System.currentTimeMillis());
		
	
	currentComponent="tFileDelete_3";
	
	
		int tos_count_tFileDelete_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileDelete_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileDelete_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileDelete_3 = new StringBuilder();
                    log4jParamters_tFileDelete_3.append("Parameters:");
                            log4jParamters_tFileDelete_3.append("PATH" + " = " + "\"/data/talend/data_repository/TBLDST.zip\"");
                        log4jParamters_tFileDelete_3.append(" | ");
                            log4jParamters_tFileDelete_3.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_3.append(" | ");
                            log4jParamters_tFileDelete_3.append("FOLDER_FILE" + " = " + "true");
                        log4jParamters_tFileDelete_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileDelete_3 - "  + (log4jParamters_tFileDelete_3) );
                    } 
                } 
            new BytesLimit65535_tFileDelete_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileDelete_3", "tFileDelete_2", "tFileDelete");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileDelete_3 begin ] stop
 */
	
	/**
	 * [tFileDelete_3 main ] start
	 */

	

	
	
	currentComponent="tFileDelete_3";
	
	

 

				final StringBuffer log4jSb_tFileDelete_3 = new StringBuffer();
			
class DeleteFoldertFileDelete_3{
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
	java.io.File path_tFileDelete_3=new java.io.File("/data/talend/data_repository/TBLDST.zip");
	if(path_tFileDelete_3.exists()){
		if(path_tFileDelete_3.isFile()){
	    	if(path_tFileDelete_3.delete()){
	    		globalMap.put("tFileDelete_3_CURRENT_STATUS", "File deleted.");
				log.info("tFileDelete_3 - File : "+ path_tFileDelete_3.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_3_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("The file " + path_tFileDelete_3.getAbsolutePath() + " can't be deleted.");
	    	}
		}else if(path_tFileDelete_3.isDirectory()){ 
	    	DeleteFoldertFileDelete_3 dftFileDelete_3 = new DeleteFoldertFileDelete_3();
	    	if(dftFileDelete_3.delete(path_tFileDelete_3)){
	    		globalMap.put("tFileDelete_3_CURRENT_STATUS", "Path deleted.");
				log.info("tFileDelete_3 - Directory : "+ path_tFileDelete_3.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_3_CURRENT_STATUS", "No path deleted.");
			throw new RuntimeException("The directory " + path_tFileDelete_3.getAbsolutePath() + " can not be deleted.");
	    	}
		}
	}else{
		globalMap.put("tFileDelete_3_CURRENT_STATUS", "File or path does not exist or is invalid.");
    		throw new RuntimeException("File or path does not exist or is invalid.");
    }
    globalMap.put("tFileDelete_3_DELETE_PATH","/data/talend/data_repository/TBLDST.zip");
 


	tos_count_tFileDelete_3++;

/**
 * [tFileDelete_3 main ] stop
 */
	
	/**
	 * [tFileDelete_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileDelete_3";
	
	

 



/**
 * [tFileDelete_3 process_data_begin ] stop
 */
	
	/**
	 * [tFileDelete_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileDelete_3";
	
	

 



/**
 * [tFileDelete_3 process_data_end ] stop
 */
	
	/**
	 * [tFileDelete_3 end ] start
	 */

	

	
	
	currentComponent="tFileDelete_3";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFileDelete_3 - "  + ("Done.") );

ok_Hash.put("tFileDelete_3", true);
end_Hash.put("tFileDelete_3", System.currentTimeMillis());




/**
 * [tFileDelete_3 end ] stop
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
	 * [tFileDelete_3 finally ] start
	 */

	

	
	
	currentComponent="tFileDelete_3";
	
	

 



/**
 * [tFileDelete_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileDelete_3_SUBPROCESS_STATE", 1);
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
 		                    "DELETE from TABLE_OF_REGIONS_TBLREG\nWHERE LOAD_DATE = CURRENT_DATE()");
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
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
	


public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return false;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return 3;
				}
				public Integer REGNUMPrecision(){
				    return 0;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
				}

				
			    public String REGNAM;

				public String getREGNAM () {
					return this.REGNAM;
				}

				public Boolean REGNAMIsNullable(){
				    return false;
				}
				public Boolean REGNAMIsKey(){
				    return false;
				}
				public Integer REGNAMLength(){
				    return 20;
				}
				public Integer REGNAMPrecision(){
				    return 0;
				}
				public String REGNAMDefault(){
				
					return null;
				
				}
				public String REGNAMComment(){
				
				    return "";
				
				}
				public String REGNAMPattern(){
				
					return "";
				
				}
				public String REGNAMOriginalDbColumnName(){
				
					return "REGNAM";
				
				}

				
			    public String REGMGR;

				public String getREGMGR () {
					return this.REGMGR;
				}

				public Boolean REGMGRIsNullable(){
				    return false;
				}
				public Boolean REGMGRIsKey(){
				    return false;
				}
				public Integer REGMGRLength(){
				    return 20;
				}
				public Integer REGMGRPrecision(){
				    return 0;
				}
				public String REGMGRDefault(){
				
					return null;
				
				}
				public String REGMGRComment(){
				
				    return "";
				
				}
				public String REGMGRPattern(){
				
					return "";
				
				}
				public String REGMGROriginalDbColumnName(){
				
					return "REGMGR";
				
				}

				
			    public String REGPHN;

				public String getREGPHN () {
					return this.REGPHN;
				}

				public Boolean REGPHNIsNullable(){
				    return false;
				}
				public Boolean REGPHNIsKey(){
				    return false;
				}
				public Integer REGPHNLength(){
				    return 18;
				}
				public Integer REGPHNPrecision(){
				    return 0;
				}
				public String REGPHNDefault(){
				
					return null;
				
				}
				public String REGPHNComment(){
				
				    return "";
				
				}
				public String REGPHNPattern(){
				
					return "";
				
				}
				public String REGPHNOriginalDbColumnName(){
				
					return "REGPHN";
				
				}

				
			    public String REGSHT;

				public String getREGSHT () {
					return this.REGSHT;
				}

				public Boolean REGSHTIsNullable(){
				    return false;
				}
				public Boolean REGSHTIsKey(){
				    return false;
				}
				public Integer REGSHTLength(){
				    return 8;
				}
				public Integer REGSHTPrecision(){
				    return 0;
				}
				public String REGSHTDefault(){
				
					return null;
				
				}
				public String REGSHTComment(){
				
				    return "";
				
				}
				public String REGSHTPattern(){
				
					return "";
				
				}
				public String REGSHTOriginalDbColumnName(){
				
					return "REGSHT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
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
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("REGNUM="+String.valueOf(REGNUM));
		sb.append(",REGNAM="+REGNAM);
		sb.append(",REGMGR="+REGMGR);
		sb.append(",REGPHN="+REGPHN);
		sb.append(",REGSHT="+REGSHT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
            			}
            		
        			sb.append("|");
        		
        				if(REGNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNAM);
            			}
            		
        			sb.append("|");
        		
        				if(REGMGR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGMGR);
            			}
            		
        			sb.append("|");
        		
        				if(REGPHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGPHN);
            			}
            		
        			sb.append("|");
        		
        				if(REGSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGSHT);
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



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
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
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLREG.csv\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\",\"");
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
    fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/TBLREG.csv")).getAbsolutePath().replace("\\","/");
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

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */","/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

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
                        synchronized (multiThreadLockWrite) {
                                    if(file_tFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("REGNUM");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("REGNAM");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("REGMGR");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("REGPHN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("REGSHT");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }
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
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.TBLREG\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("REGNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGMGR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGPHN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGSHT")+"}]");
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

		    String dbquery_tDBInput_1 = "select * from MM4R5LIB.TBLREG";
		    
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
								row2.REGNUM = null;
							} else {
		                          
            row2.REGNUM = rs_tDBInput_1.getBigDecimal(1);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row2.REGNAM = null;
							} else {
	                         		
        	row2.REGNAM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row2.REGMGR = null;
							} else {
	                         		
        	row2.REGMGR = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row2.REGPHN = null;
							} else {
	                         		
        	row2.REGPHN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row2.REGSHT = null;
							} else {
	                         		
        	row2.REGSHT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
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
				
					,"row2","tDBInput_1","tDBInput_1","tAS400Input","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(row2.REGNUM != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.REGNUM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.REGNAM != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.REGNAM
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.REGMGR != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.REGMGR
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.REGPHN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.REGPHN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row2.REGSHT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row2.REGSHT
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");

                    }



 


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
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
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
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
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
	


public static class TBLREGStruct implements routines.system.IPersistableRow<TBLREGStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return true;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return null;
				}
				public Integer REGNUMPrecision(){
				    return null;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
				}

				
			    public String REGNAM;

				public String getREGNAM () {
					return this.REGNAM;
				}

				public Boolean REGNAMIsNullable(){
				    return true;
				}
				public Boolean REGNAMIsKey(){
				    return false;
				}
				public Integer REGNAMLength(){
				    return null;
				}
				public Integer REGNAMPrecision(){
				    return null;
				}
				public String REGNAMDefault(){
				
					return null;
				
				}
				public String REGNAMComment(){
				
				    return "";
				
				}
				public String REGNAMPattern(){
				
					return "";
				
				}
				public String REGNAMOriginalDbColumnName(){
				
					return "REGNAM";
				
				}

				
			    public String REGMGR;

				public String getREGMGR () {
					return this.REGMGR;
				}

				public Boolean REGMGRIsNullable(){
				    return true;
				}
				public Boolean REGMGRIsKey(){
				    return false;
				}
				public Integer REGMGRLength(){
				    return null;
				}
				public Integer REGMGRPrecision(){
				    return null;
				}
				public String REGMGRDefault(){
				
					return null;
				
				}
				public String REGMGRComment(){
				
				    return "";
				
				}
				public String REGMGRPattern(){
				
					return "";
				
				}
				public String REGMGROriginalDbColumnName(){
				
					return "REGMGR";
				
				}

				
			    public String REGPHN;

				public String getREGPHN () {
					return this.REGPHN;
				}

				public Boolean REGPHNIsNullable(){
				    return true;
				}
				public Boolean REGPHNIsKey(){
				    return false;
				}
				public Integer REGPHNLength(){
				    return null;
				}
				public Integer REGPHNPrecision(){
				    return null;
				}
				public String REGPHNDefault(){
				
					return null;
				
				}
				public String REGPHNComment(){
				
				    return "";
				
				}
				public String REGPHNPattern(){
				
					return "";
				
				}
				public String REGPHNOriginalDbColumnName(){
				
					return "REGPHN";
				
				}

				
			    public String REGSHT;

				public String getREGSHT () {
					return this.REGSHT;
				}

				public Boolean REGSHTIsNullable(){
				    return true;
				}
				public Boolean REGSHTIsKey(){
				    return false;
				}
				public Integer REGSHTLength(){
				    return null;
				}
				public Integer REGSHTPrecision(){
				    return null;
				}
				public String REGSHTDefault(){
				
					return null;
				
				}
				public String REGSHTComment(){
				
				    return "";
				
				}
				public String REGSHTPattern(){
				
					return "";
				
				}
				public String REGSHTOriginalDbColumnName(){
				
					return "REGSHT";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
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
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
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
		sb.append("REGNUM="+String.valueOf(REGNUM));
		sb.append(",REGNAM="+REGNAM);
		sb.append(",REGMGR="+REGMGR);
		sb.append(",REGPHN="+REGPHN);
		sb.append(",REGSHT="+REGSHT);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
            			}
            		
        			sb.append("|");
        		
        				if(REGNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNAM);
            			}
            		
        			sb.append("|");
        		
        				if(REGMGR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGMGR);
            			}
            		
        			sb.append("|");
        		
        				if(REGPHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGPHN);
            			}
            		
        			sb.append("|");
        		
        				if(REGSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGSHT);
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
    public int compareTo(TBLREGStruct other) {

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

public static class row6Struct implements routines.system.IPersistableRow<row6Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public BigDecimal REGNUM;

				public BigDecimal getREGNUM () {
					return this.REGNUM;
				}

				public Boolean REGNUMIsNullable(){
				    return true;
				}
				public Boolean REGNUMIsKey(){
				    return false;
				}
				public Integer REGNUMLength(){
				    return null;
				}
				public Integer REGNUMPrecision(){
				    return null;
				}
				public String REGNUMDefault(){
				
					return "";
				
				}
				public String REGNUMComment(){
				
				    return "";
				
				}
				public String REGNUMPattern(){
				
					return "";
				
				}
				public String REGNUMOriginalDbColumnName(){
				
					return "REGNUM";
				
				}

				
			    public String REGNAM;

				public String getREGNAM () {
					return this.REGNAM;
				}

				public Boolean REGNAMIsNullable(){
				    return true;
				}
				public Boolean REGNAMIsKey(){
				    return false;
				}
				public Integer REGNAMLength(){
				    return null;
				}
				public Integer REGNAMPrecision(){
				    return null;
				}
				public String REGNAMDefault(){
				
					return null;
				
				}
				public String REGNAMComment(){
				
				    return "";
				
				}
				public String REGNAMPattern(){
				
					return "";
				
				}
				public String REGNAMOriginalDbColumnName(){
				
					return "REGNAM";
				
				}

				
			    public String REGMGR;

				public String getREGMGR () {
					return this.REGMGR;
				}

				public Boolean REGMGRIsNullable(){
				    return true;
				}
				public Boolean REGMGRIsKey(){
				    return false;
				}
				public Integer REGMGRLength(){
				    return null;
				}
				public Integer REGMGRPrecision(){
				    return null;
				}
				public String REGMGRDefault(){
				
					return null;
				
				}
				public String REGMGRComment(){
				
				    return "";
				
				}
				public String REGMGRPattern(){
				
					return "";
				
				}
				public String REGMGROriginalDbColumnName(){
				
					return "REGMGR";
				
				}

				
			    public String REGPHN;

				public String getREGPHN () {
					return this.REGPHN;
				}

				public Boolean REGPHNIsNullable(){
				    return true;
				}
				public Boolean REGPHNIsKey(){
				    return false;
				}
				public Integer REGPHNLength(){
				    return null;
				}
				public Integer REGPHNPrecision(){
				    return null;
				}
				public String REGPHNDefault(){
				
					return null;
				
				}
				public String REGPHNComment(){
				
				    return "";
				
				}
				public String REGPHNPattern(){
				
					return "";
				
				}
				public String REGPHNOriginalDbColumnName(){
				
					return "REGPHN";
				
				}

				
			    public String REGSHT;

				public String getREGSHT () {
					return this.REGSHT;
				}

				public Boolean REGSHTIsNullable(){
				    return true;
				}
				public Boolean REGSHTIsKey(){
				    return false;
				}
				public Integer REGSHTLength(){
				    return null;
				}
				public Integer REGSHTPrecision(){
				    return null;
				}
				public String REGSHTDefault(){
				
					return null;
				
				}
				public String REGSHTComment(){
				
				    return "";
				
				}
				public String REGSHTPattern(){
				
					return "";
				
				}
				public String REGSHTOriginalDbColumnName(){
				
					return "REGSHT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
						this.REGNUM = (BigDecimal) dis.readObject();
					
					this.REGNAM = readString(dis);
					
					this.REGMGR = readString(dis);
					
					this.REGPHN = readString(dis);
					
					this.REGSHT = readString(dis);
					
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
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.REGNUM);
					
					// String
				
						writeString(this.REGNAM,dos);
					
					// String
				
						writeString(this.REGMGR,dos);
					
					// String
				
						writeString(this.REGPHN,dos);
					
					// String
				
						writeString(this.REGSHT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("REGNUM="+String.valueOf(REGNUM));
		sb.append(",REGNAM="+REGNAM);
		sb.append(",REGMGR="+REGMGR);
		sb.append(",REGPHN="+REGPHN);
		sb.append(",REGSHT="+REGSHT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(REGNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNUM);
            			}
            		
        			sb.append("|");
        		
        				if(REGNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGNAM);
            			}
            		
        			sb.append("|");
        		
        				if(REGMGR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGMGR);
            			}
            		
        			sb.append("|");
        		
        				if(REGPHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGPHN);
            			}
            		
        			sb.append("|");
        		
        				if(REGSHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REGSHT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

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



		row6Struct row6 = new row6Struct();
TBLREGStruct TBLREG = new TBLREGStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"TBLREG");
			
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
 		                    "TABLE_OF_REGIONS_TBLREG");
 		                    
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
     		                    						
     		                    						a("\"name\":\"TABLE_OF_REGIONS_TBLREG\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"REGNUM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":3,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"REGNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REGNAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REGNAM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REGMGR\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REGMGR\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REGPHN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":18,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REGPHN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"REGSHT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":8,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"REGSHT\",\"talend.field.default\":\"\"},{",s);
     		                    						
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
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row6");
			
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
		int count_row6_tMap_1 = 0;
		
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
				int count_TBLREG_tMap_1 = 0;
				
TBLREGStruct TBLREG_tmp = new TBLREGStruct();
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
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLREG.zip\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\",\"");
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
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("REGNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGMGR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGPHN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REGSHT")+"}]");
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
					
						Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/TBLREG.zip";	
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
								fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_1, "ISO-8859-15",",","\n",false,1,0,
								
									limit_tFileInputDelimited_1
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row6 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row6 = new row6Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row6.REGNUM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"REGNUM", "row6", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row6.REGNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row6.REGNAM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
							row6.REGMGR = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
							row6.REGPHN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
							row6.REGSHT = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
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
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row6","tFileInputDelimited_1","tFileInputDelimited_1","tFileInputDelimited","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row6 - " + (row6==null? "": row6.toLogString()));
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
Var.var1 = TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")) ;// ###############################
        // ###############################
        // # Output tables

TBLREG = null;


// # Output table : 'TBLREG'
count_TBLREG_tMap_1++;

TBLREG_tmp.REGNUM = row6.REGNUM;
TBLREG_tmp.REGNAM = row6.REGNAM;
TBLREG_tmp.REGMGR = row6.REGMGR;
TBLREG_tmp.REGPHN = row6.REGPHN;
TBLREG_tmp.REGSHT = row6.REGSHT;
TBLREG_tmp.LOAD_DATE = Var.var1 ;
TBLREG = TBLREG_tmp;
log.debug("tMap_1 - Outputting the record " + count_TBLREG_tMap_1 + " of the output table 'TBLREG'.");

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
// Start of branch "TBLREG"
if(TBLREG != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"TBLREG","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("TBLREG - " + (TBLREG==null? "": TBLREG.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGNUM") != null){
                    incomingEnforcer_tDBOutput_1.put("REGNUM", TBLREG.REGNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGNAM") != null){
                    incomingEnforcer_tDBOutput_1.put("REGNAM", TBLREG.REGNAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGMGR") != null){
                    incomingEnforcer_tDBOutput_1.put("REGMGR", TBLREG.REGMGR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGPHN") != null){
                    incomingEnforcer_tDBOutput_1.put("REGPHN", TBLREG.REGPHN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("REGSHT") != null){
                    incomingEnforcer_tDBOutput_1.put("REGSHT", TBLREG.REGSHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("LOAD_DATE", TBLREG.LOAD_DATE);
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

} // End of branch "TBLREG"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row6"




	
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
            if(!((Object)("/data/talend/data_repository/TBLREG.zip") instanceof java.io.InputStream)){
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
				log.debug("tMap_1 - Written records count in the table 'TBLREG': " + count_TBLREG_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row6",2,0,
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"TBLREG",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tFileDelete_1Process(globalMap);



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
                            log4jParamters_tFileDelete_1.append("PATH" + " = " + "\"/data/talend/data_repository/TBLREG.zip\"");
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
	java.io.File path_tFileDelete_1=new java.io.File("/data/talend/data_repository/TBLREG.zip");
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
    globalMap.put("tFileDelete_1_DELETE_PATH","/data/talend/data_repository/TBLREG.zip");
 


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
 		                    "DELETE from PO_HEADER_HISTORY_POMHDH\nWHERE LOAD_DATE = CURRENT_DATE() - 1");
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tDBInput_2Process(globalMap);



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
	


public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public float PONUMB;

				public float getPONUMB () {
					return this.PONUMB;
				}

				public Boolean PONUMBIsNullable(){
				    return false;
				}
				public Boolean PONUMBIsKey(){
				    return false;
				}
				public Integer PONUMBLength(){
				    return 6;
				}
				public Integer PONUMBPrecision(){
				    return 0;
				}
				public String PONUMBDefault(){
				
					return "";
				
				}
				public String PONUMBComment(){
				
				    return "";
				
				}
				public String PONUMBPattern(){
				
					return "";
				
				}
				public String PONUMBOriginalDbColumnName(){
				
					return "PONUMB";
				
				}

				
			    public float POBON;

				public float getPOBON () {
					return this.POBON;
				}

				public Boolean POBONIsNullable(){
				    return false;
				}
				public Boolean POBONIsKey(){
				    return false;
				}
				public Integer POBONLength(){
				    return 2;
				}
				public Integer POBONPrecision(){
				    return 0;
				}
				public String POBONDefault(){
				
					return "";
				
				}
				public String POBONComment(){
				
				    return "";
				
				}
				public String POBONPattern(){
				
					return "";
				
				}
				public String POBONOriginalDbColumnName(){
				
					return "POBON";
				
				}

				
			    public float POVNUM;

				public float getPOVNUM () {
					return this.POVNUM;
				}

				public Boolean POVNUMIsNullable(){
				    return false;
				}
				public Boolean POVNUMIsKey(){
				    return false;
				}
				public Integer POVNUMLength(){
				    return 6;
				}
				public Integer POVNUMPrecision(){
				    return 0;
				}
				public String POVNUMDefault(){
				
					return "";
				
				}
				public String POVNUMComment(){
				
				    return "";
				
				}
				public String POVNUMPattern(){
				
					return "";
				
				}
				public String POVNUMOriginalDbColumnName(){
				
					return "POVNUM";
				
				}

				
			    public float POTRMS;

				public float getPOTRMS () {
					return this.POTRMS;
				}

				public Boolean POTRMSIsNullable(){
				    return false;
				}
				public Boolean POTRMSIsKey(){
				    return false;
				}
				public Integer POTRMSLength(){
				    return 3;
				}
				public Integer POTRMSPrecision(){
				    return 0;
				}
				public String POTRMSDefault(){
				
					return "";
				
				}
				public String POTRMSComment(){
				
				    return "";
				
				}
				public String POTRMSPattern(){
				
					return "";
				
				}
				public String POTRMSOriginalDbColumnName(){
				
					return "POTRMS";
				
				}

				
			    public String POTIND;

				public String getPOTIND () {
					return this.POTIND;
				}

				public Boolean POTINDIsNullable(){
				    return false;
				}
				public Boolean POTINDIsKey(){
				    return false;
				}
				public Integer POTINDLength(){
				    return 1;
				}
				public Integer POTINDPrecision(){
				    return 0;
				}
				public String POTINDDefault(){
				
					return null;
				
				}
				public String POTINDComment(){
				
				    return "";
				
				}
				public String POTINDPattern(){
				
					return "";
				
				}
				public String POTINDOriginalDbColumnName(){
				
					return "POTIND";
				
				}

				
			    public String POSTAT;

				public String getPOSTAT () {
					return this.POSTAT;
				}

				public Boolean POSTATIsNullable(){
				    return false;
				}
				public Boolean POSTATIsKey(){
				    return false;
				}
				public Integer POSTATLength(){
				    return 1;
				}
				public Integer POSTATPrecision(){
				    return 0;
				}
				public String POSTATDefault(){
				
					return null;
				
				}
				public String POSTATComment(){
				
				    return "";
				
				}
				public String POSTATPattern(){
				
					return "";
				
				}
				public String POSTATOriginalDbColumnName(){
				
					return "POSTAT";
				
				}

				
			    public String POTYPE;

				public String getPOTYPE () {
					return this.POTYPE;
				}

				public Boolean POTYPEIsNullable(){
				    return false;
				}
				public Boolean POTYPEIsKey(){
				    return false;
				}
				public Integer POTYPELength(){
				    return 1;
				}
				public Integer POTYPEPrecision(){
				    return 0;
				}
				public String POTYPEDefault(){
				
					return null;
				
				}
				public String POTYPEComment(){
				
				    return "";
				
				}
				public String POTYPEPattern(){
				
					return "";
				
				}
				public String POTYPEOriginalDbColumnName(){
				
					return "POTYPE";
				
				}

				
			    public String PODEST;

				public String getPODEST () {
					return this.PODEST;
				}

				public Boolean PODESTIsNullable(){
				    return false;
				}
				public Boolean PODESTIsKey(){
				    return false;
				}
				public Integer PODESTLength(){
				    return 1;
				}
				public Integer PODESTPrecision(){
				    return 0;
				}
				public String PODESTDefault(){
				
					return null;
				
				}
				public String PODESTComment(){
				
				    return "";
				
				}
				public String PODESTPattern(){
				
					return "";
				
				}
				public String PODESTOriginalDbColumnName(){
				
					return "PODEST";
				
				}

				
			    public BigDecimal POSTOR;

				public BigDecimal getPOSTOR () {
					return this.POSTOR;
				}

				public Boolean POSTORIsNullable(){
				    return false;
				}
				public Boolean POSTORIsKey(){
				    return false;
				}
				public Integer POSTORLength(){
				    return 5;
				}
				public Integer POSTORPrecision(){
				    return 0;
				}
				public String POSTORDefault(){
				
					return "";
				
				}
				public String POSTORComment(){
				
				    return "";
				
				}
				public String POSTORPattern(){
				
					return "";
				
				}
				public String POSTOROriginalDbColumnName(){
				
					return "POSTOR";
				
				}

				
			    public String POADYN;

				public String getPOADYN () {
					return this.POADYN;
				}

				public Boolean POADYNIsNullable(){
				    return false;
				}
				public Boolean POADYNIsKey(){
				    return false;
				}
				public Integer POADYNLength(){
				    return 1;
				}
				public Integer POADYNPrecision(){
				    return 0;
				}
				public String POADYNDefault(){
				
					return null;
				
				}
				public String POADYNComment(){
				
				    return "";
				
				}
				public String POADYNPattern(){
				
					return "";
				
				}
				public String POADYNOriginalDbColumnName(){
				
					return "POADYN";
				
				}

				
			    public String PODMTH;

				public String getPODMTH () {
					return this.PODMTH;
				}

				public Boolean PODMTHIsNullable(){
				    return false;
				}
				public Boolean PODMTHIsKey(){
				    return false;
				}
				public Integer PODMTHLength(){
				    return 1;
				}
				public Integer PODMTHPrecision(){
				    return 0;
				}
				public String PODMTHDefault(){
				
					return null;
				
				}
				public String PODMTHComment(){
				
				    return "";
				
				}
				public String PODMTHPattern(){
				
					return "";
				
				}
				public String PODMTHOriginalDbColumnName(){
				
					return "PODMTH";
				
				}

				
			    public String POALBO;

				public String getPOALBO () {
					return this.POALBO;
				}

				public Boolean POALBOIsNullable(){
				    return false;
				}
				public Boolean POALBOIsKey(){
				    return false;
				}
				public Integer POALBOLength(){
				    return 1;
				}
				public Integer POALBOPrecision(){
				    return 0;
				}
				public String POALBODefault(){
				
					return null;
				
				}
				public String POALBOComment(){
				
				    return "";
				
				}
				public String POALBOPattern(){
				
					return "";
				
				}
				public String POALBOOriginalDbColumnName(){
				
					return "POALBO";
				
				}

				
			    public String POCONF;

				public String getPOCONF () {
					return this.POCONF;
				}

				public Boolean POCONFIsNullable(){
				    return false;
				}
				public Boolean POCONFIsKey(){
				    return false;
				}
				public Integer POCONFLength(){
				    return 1;
				}
				public Integer POCONFPrecision(){
				    return 0;
				}
				public String POCONFDefault(){
				
					return null;
				
				}
				public String POCONFComment(){
				
				    return "";
				
				}
				public String POCONFPattern(){
				
					return "";
				
				}
				public String POCONFOriginalDbColumnName(){
				
					return "POCONF";
				
				}

				
			    public String POPHON;

				public String getPOPHON () {
					return this.POPHON;
				}

				public Boolean POPHONIsNullable(){
				    return false;
				}
				public Boolean POPHONIsKey(){
				    return false;
				}
				public Integer POPHONLength(){
				    return 1;
				}
				public Integer POPHONPrecision(){
				    return 0;
				}
				public String POPHONDefault(){
				
					return null;
				
				}
				public String POPHONComment(){
				
				    return "";
				
				}
				public String POPHONPattern(){
				
					return "";
				
				}
				public String POPHONOriginalDbColumnName(){
				
					return "POPHON";
				
				}

				
			    public String POBUYR;

				public String getPOBUYR () {
					return this.POBUYR;
				}

				public Boolean POBUYRIsNullable(){
				    return false;
				}
				public Boolean POBUYRIsKey(){
				    return false;
				}
				public Integer POBUYRLength(){
				    return 3;
				}
				public Integer POBUYRPrecision(){
				    return 0;
				}
				public String POBUYRDefault(){
				
					return null;
				
				}
				public String POBUYRComment(){
				
				    return "";
				
				}
				public String POBUYRPattern(){
				
					return "";
				
				}
				public String POBUYROriginalDbColumnName(){
				
					return "POBUYR";
				
				}

				
			    public float PODPT;

				public float getPODPT () {
					return this.PODPT;
				}

				public Boolean PODPTIsNullable(){
				    return false;
				}
				public Boolean PODPTIsKey(){
				    return false;
				}
				public Integer PODPTLength(){
				    return 3;
				}
				public Integer PODPTPrecision(){
				    return 0;
				}
				public String PODPTDefault(){
				
					return "";
				
				}
				public String PODPTComment(){
				
				    return "";
				
				}
				public String PODPTPattern(){
				
					return "";
				
				}
				public String PODPTOriginalDbColumnName(){
				
					return "PODPT";
				
				}

				
			    public float POSDPT;

				public float getPOSDPT () {
					return this.POSDPT;
				}

				public Boolean POSDPTIsNullable(){
				    return false;
				}
				public Boolean POSDPTIsKey(){
				    return false;
				}
				public Integer POSDPTLength(){
				    return 3;
				}
				public Integer POSDPTPrecision(){
				    return 0;
				}
				public String POSDPTDefault(){
				
					return "";
				
				}
				public String POSDPTComment(){
				
				    return "";
				
				}
				public String POSDPTPattern(){
				
					return "";
				
				}
				public String POSDPTOriginalDbColumnName(){
				
					return "POSDPT";
				
				}

				
			    public float POTHER;

				public float getPOTHER () {
					return this.POTHER;
				}

				public Boolean POTHERIsNullable(){
				    return false;
				}
				public Boolean POTHERIsKey(){
				    return false;
				}
				public Integer POTHERLength(){
				    return 6;
				}
				public Integer POTHERPrecision(){
				    return 0;
				}
				public String POTHERDefault(){
				
					return "";
				
				}
				public String POTHERComment(){
				
				    return "";
				
				}
				public String POTHERPattern(){
				
					return "";
				
				}
				public String POTHEROriginalDbColumnName(){
				
					return "POTHER";
				
				}

				
			    public String POFPCD;

				public String getPOFPCD () {
					return this.POFPCD;
				}

				public Boolean POFPCDIsNullable(){
				    return false;
				}
				public Boolean POFPCDIsKey(){
				    return false;
				}
				public Integer POFPCDLength(){
				    return 1;
				}
				public Integer POFPCDPrecision(){
				    return 0;
				}
				public String POFPCDDefault(){
				
					return null;
				
				}
				public String POFPCDComment(){
				
				    return "";
				
				}
				public String POFPCDPattern(){
				
					return "";
				
				}
				public String POFPCDOriginalDbColumnName(){
				
					return "POFPCD";
				
				}

				
			    public String POFOB;

				public String getPOFOB () {
					return this.POFOB;
				}

				public Boolean POFOBIsNullable(){
				    return false;
				}
				public Boolean POFOBIsKey(){
				    return false;
				}
				public Integer POFOBLength(){
				    return 20;
				}
				public Integer POFOBPrecision(){
				    return 0;
				}
				public String POFOBDefault(){
				
					return null;
				
				}
				public String POFOBComment(){
				
				    return "";
				
				}
				public String POFOBPattern(){
				
					return "";
				
				}
				public String POFOBOriginalDbColumnName(){
				
					return "POFOB";
				
				}

				
			    public String POSHP1;

				public String getPOSHP1 () {
					return this.POSHP1;
				}

				public Boolean POSHP1IsNullable(){
				    return false;
				}
				public Boolean POSHP1IsKey(){
				    return false;
				}
				public Integer POSHP1Length(){
				    return 20;
				}
				public Integer POSHP1Precision(){
				    return 0;
				}
				public String POSHP1Default(){
				
					return null;
				
				}
				public String POSHP1Comment(){
				
				    return "";
				
				}
				public String POSHP1Pattern(){
				
					return "";
				
				}
				public String POSHP1OriginalDbColumnName(){
				
					return "POSHP1";
				
				}

				
			    public String POSHP2;

				public String getPOSHP2 () {
					return this.POSHP2;
				}

				public Boolean POSHP2IsNullable(){
				    return false;
				}
				public Boolean POSHP2IsKey(){
				    return false;
				}
				public Integer POSHP2Length(){
				    return 20;
				}
				public Integer POSHP2Precision(){
				    return 0;
				}
				public String POSHP2Default(){
				
					return null;
				
				}
				public String POSHP2Comment(){
				
				    return "";
				
				}
				public String POSHP2Pattern(){
				
					return "";
				
				}
				public String POSHP2OriginalDbColumnName(){
				
					return "POSHP2";
				
				}

				
			    public String POSHPP;

				public String getPOSHPP () {
					return this.POSHPP;
				}

				public Boolean POSHPPIsNullable(){
				    return false;
				}
				public Boolean POSHPPIsKey(){
				    return false;
				}
				public Integer POSHPPLength(){
				    return 20;
				}
				public Integer POSHPPPrecision(){
				    return 0;
				}
				public String POSHPPDefault(){
				
					return null;
				
				}
				public String POSHPPComment(){
				
				    return "";
				
				}
				public String POSHPPPattern(){
				
					return "";
				
				}
				public String POSHPPOriginalDbColumnName(){
				
					return "POSHPP";
				
				}

				
			    public String POSHPC;

				public String getPOSHPC () {
					return this.POSHPC;
				}

				public Boolean POSHPCIsNullable(){
				    return false;
				}
				public Boolean POSHPCIsKey(){
				    return false;
				}
				public Integer POSHPCLength(){
				    return 20;
				}
				public Integer POSHPCPrecision(){
				    return 0;
				}
				public String POSHPCDefault(){
				
					return null;
				
				}
				public String POSHPCComment(){
				
				    return "";
				
				}
				public String POSHPCPattern(){
				
					return "";
				
				}
				public String POSHPCOriginalDbColumnName(){
				
					return "POSHPC";
				
				}

				
			    public float POEDAT;

				public float getPOEDAT () {
					return this.POEDAT;
				}

				public Boolean POEDATIsNullable(){
				    return false;
				}
				public Boolean POEDATIsKey(){
				    return false;
				}
				public Integer POEDATLength(){
				    return 6;
				}
				public Integer POEDATPrecision(){
				    return 0;
				}
				public String POEDATDefault(){
				
					return "";
				
				}
				public String POEDATComment(){
				
				    return "";
				
				}
				public String POEDATPattern(){
				
					return "";
				
				}
				public String POEDATOriginalDbColumnName(){
				
					return "POEDAT";
				
				}

				
			    public float POSDAT;

				public float getPOSDAT () {
					return this.POSDAT;
				}

				public Boolean POSDATIsNullable(){
				    return false;
				}
				public Boolean POSDATIsKey(){
				    return false;
				}
				public Integer POSDATLength(){
				    return 6;
				}
				public Integer POSDATPrecision(){
				    return 0;
				}
				public String POSDATDefault(){
				
					return "";
				
				}
				public String POSDATComment(){
				
				    return "";
				
				}
				public String POSDATPattern(){
				
					return "";
				
				}
				public String POSDATOriginalDbColumnName(){
				
					return "POSDAT";
				
				}

				
			    public float POCDAT;

				public float getPOCDAT () {
					return this.POCDAT;
				}

				public Boolean POCDATIsNullable(){
				    return false;
				}
				public Boolean POCDATIsKey(){
				    return false;
				}
				public Integer POCDATLength(){
				    return 6;
				}
				public Integer POCDATPrecision(){
				    return 0;
				}
				public String POCDATDefault(){
				
					return "";
				
				}
				public String POCDATComment(){
				
				    return "";
				
				}
				public String POCDATPattern(){
				
					return "";
				
				}
				public String POCDATOriginalDbColumnName(){
				
					return "POCDAT";
				
				}

				
			    public float PORDAT;

				public float getPORDAT () {
					return this.PORDAT;
				}

				public Boolean PORDATIsNullable(){
				    return false;
				}
				public Boolean PORDATIsKey(){
				    return false;
				}
				public Integer PORDATLength(){
				    return 6;
				}
				public Integer PORDATPrecision(){
				    return 0;
				}
				public String PORDATDefault(){
				
					return "";
				
				}
				public String PORDATComment(){
				
				    return "";
				
				}
				public String PORDATPattern(){
				
					return "";
				
				}
				public String PORDATOriginalDbColumnName(){
				
					return "PORDAT";
				
				}

				
			    public float POLCHG;

				public float getPOLCHG () {
					return this.POLCHG;
				}

				public Boolean POLCHGIsNullable(){
				    return false;
				}
				public Boolean POLCHGIsKey(){
				    return false;
				}
				public Integer POLCHGLength(){
				    return 6;
				}
				public Integer POLCHGPrecision(){
				    return 0;
				}
				public String POLCHGDefault(){
				
					return "";
				
				}
				public String POLCHGComment(){
				
				    return "";
				
				}
				public String POLCHGPattern(){
				
					return "";
				
				}
				public String POLCHGOriginalDbColumnName(){
				
					return "POLCHG";
				
				}

				
			    public float PORFRQ;

				public float getPORFRQ () {
					return this.PORFRQ;
				}

				public Boolean PORFRQIsNullable(){
				    return false;
				}
				public Boolean PORFRQIsKey(){
				    return false;
				}
				public Integer PORFRQLength(){
				    return 3;
				}
				public Integer PORFRQPrecision(){
				    return 0;
				}
				public String PORFRQDefault(){
				
					return "";
				
				}
				public String PORFRQComment(){
				
				    return "";
				
				}
				public String PORFRQPattern(){
				
					return "";
				
				}
				public String PORFRQOriginalDbColumnName(){
				
					return "PORFRQ";
				
				}

				
			    public float POLEAD;

				public float getPOLEAD () {
					return this.POLEAD;
				}

				public Boolean POLEADIsNullable(){
				    return false;
				}
				public Boolean POLEADIsKey(){
				    return false;
				}
				public Integer POLEADLength(){
				    return 3;
				}
				public Integer POLEADPrecision(){
				    return 0;
				}
				public String POLEADDefault(){
				
					return "";
				
				}
				public String POLEADComment(){
				
				    return "";
				
				}
				public String POLEADPattern(){
				
					return "";
				
				}
				public String POLEADOriginalDbColumnName(){
				
					return "POLEAD";
				
				}

				
			    public String POORIG;

				public String getPOORIG () {
					return this.POORIG;
				}

				public Boolean POORIGIsNullable(){
				    return false;
				}
				public Boolean POORIGIsKey(){
				    return false;
				}
				public Integer POORIGLength(){
				    return 20;
				}
				public Integer POORIGPrecision(){
				    return 0;
				}
				public String POORIGDefault(){
				
					return null;
				
				}
				public String POORIGComment(){
				
				    return "";
				
				}
				public String POORIGPattern(){
				
					return "";
				
				}
				public String POORIGOriginalDbColumnName(){
				
					return "POORIG";
				
				}

				
			    public String PONOT1;

				public String getPONOT1 () {
					return this.PONOT1;
				}

				public Boolean PONOT1IsNullable(){
				    return false;
				}
				public Boolean PONOT1IsKey(){
				    return false;
				}
				public Integer PONOT1Length(){
				    return 50;
				}
				public Integer PONOT1Precision(){
				    return 0;
				}
				public String PONOT1Default(){
				
					return null;
				
				}
				public String PONOT1Comment(){
				
				    return "";
				
				}
				public String PONOT1Pattern(){
				
					return "";
				
				}
				public String PONOT1OriginalDbColumnName(){
				
					return "PONOT1";
				
				}

				
			    public String PONOT2;

				public String getPONOT2 () {
					return this.PONOT2;
				}

				public Boolean PONOT2IsNullable(){
				    return false;
				}
				public Boolean PONOT2IsKey(){
				    return false;
				}
				public Integer PONOT2Length(){
				    return 50;
				}
				public Integer PONOT2Precision(){
				    return 0;
				}
				public String PONOT2Default(){
				
					return null;
				
				}
				public String PONOT2Comment(){
				
				    return "";
				
				}
				public String PONOT2Pattern(){
				
					return "";
				
				}
				public String PONOT2OriginalDbColumnName(){
				
					return "PONOT2";
				
				}

				
			    public String PONOT3;

				public String getPONOT3 () {
					return this.PONOT3;
				}

				public Boolean PONOT3IsNullable(){
				    return false;
				}
				public Boolean PONOT3IsKey(){
				    return false;
				}
				public Integer PONOT3Length(){
				    return 50;
				}
				public Integer PONOT3Precision(){
				    return 0;
				}
				public String PONOT3Default(){
				
					return null;
				
				}
				public String PONOT3Comment(){
				
				    return "";
				
				}
				public String PONOT3Pattern(){
				
					return "";
				
				}
				public String PONOT3OriginalDbColumnName(){
				
					return "PONOT3";
				
				}

				
			    public BigDecimal POCOST;

				public BigDecimal getPOCOST () {
					return this.POCOST;
				}

				public Boolean POCOSTIsNullable(){
				    return false;
				}
				public Boolean POCOSTIsKey(){
				    return false;
				}
				public Integer POCOSTLength(){
				    return 9;
				}
				public Integer POCOSTPrecision(){
				    return 2;
				}
				public String POCOSTDefault(){
				
					return "";
				
				}
				public String POCOSTComment(){
				
				    return "";
				
				}
				public String POCOSTPattern(){
				
					return "";
				
				}
				public String POCOSTOriginalDbColumnName(){
				
					return "POCOST";
				
				}

				
			    public BigDecimal POVAT;

				public BigDecimal getPOVAT () {
					return this.POVAT;
				}

				public Boolean POVATIsNullable(){
				    return false;
				}
				public Boolean POVATIsKey(){
				    return false;
				}
				public Integer POVATLength(){
				    return 9;
				}
				public Integer POVATPrecision(){
				    return 2;
				}
				public String POVATDefault(){
				
					return "";
				
				}
				public String POVATComment(){
				
				    return "";
				
				}
				public String POVATPattern(){
				
					return "";
				
				}
				public String POVATOriginalDbColumnName(){
				
					return "POVAT";
				
				}

				
			    public BigDecimal PORETL;

				public BigDecimal getPORETL () {
					return this.PORETL;
				}

				public Boolean PORETLIsNullable(){
				    return false;
				}
				public Boolean PORETLIsKey(){
				    return false;
				}
				public Integer PORETLLength(){
				    return 9;
				}
				public Integer PORETLPrecision(){
				    return 2;
				}
				public String PORETLDefault(){
				
					return "";
				
				}
				public String PORETLComment(){
				
				    return "";
				
				}
				public String PORETLPattern(){
				
					return "";
				
				}
				public String PORETLOriginalDbColumnName(){
				
					return "PORETL";
				
				}

				
			    public BigDecimal POCASE;

				public BigDecimal getPOCASE () {
					return this.POCASE;
				}

				public Boolean POCASEIsNullable(){
				    return false;
				}
				public Boolean POCASEIsKey(){
				    return false;
				}
				public Integer POCASELength(){
				    return 8;
				}
				public Integer POCASEPrecision(){
				    return 2;
				}
				public String POCASEDefault(){
				
					return "";
				
				}
				public String POCASEComment(){
				
				    return "";
				
				}
				public String POCASEPattern(){
				
					return "";
				
				}
				public String POCASEOriginalDbColumnName(){
				
					return "POCASE";
				
				}

				
			    public BigDecimal POUNTS;

				public BigDecimal getPOUNTS () {
					return this.POUNTS;
				}

				public Boolean POUNTSIsNullable(){
				    return false;
				}
				public Boolean POUNTSIsKey(){
				    return false;
				}
				public Integer POUNTSLength(){
				    return 9;
				}
				public Integer POUNTSPrecision(){
				    return 2;
				}
				public String POUNTSDefault(){
				
					return "";
				
				}
				public String POUNTSComment(){
				
				    return "";
				
				}
				public String POUNTSPattern(){
				
					return "";
				
				}
				public String POUNTSOriginalDbColumnName(){
				
					return "POUNTS";
				
				}

				
			    public BigDecimal POWGHT;

				public BigDecimal getPOWGHT () {
					return this.POWGHT;
				}

				public Boolean POWGHTIsNullable(){
				    return false;
				}
				public Boolean POWGHTIsKey(){
				    return false;
				}
				public Integer POWGHTLength(){
				    return 9;
				}
				public Integer POWGHTPrecision(){
				    return 2;
				}
				public String POWGHTDefault(){
				
					return "";
				
				}
				public String POWGHTComment(){
				
				    return "";
				
				}
				public String POWGHTPattern(){
				
					return "";
				
				}
				public String POWGHTOriginalDbColumnName(){
				
					return "POWGHT";
				
				}

				
			    public BigDecimal POTARP;

				public BigDecimal getPOTARP () {
					return this.POTARP;
				}

				public Boolean POTARPIsNullable(){
				    return false;
				}
				public Boolean POTARPIsKey(){
				    return false;
				}
				public Integer POTARPLength(){
				    return 5;
				}
				public Integer POTARPPrecision(){
				    return 2;
				}
				public String POTARPDefault(){
				
					return "";
				
				}
				public String POTARPComment(){
				
				    return "";
				
				}
				public String POTARPPattern(){
				
					return "";
				
				}
				public String POTARPOriginalDbColumnName(){
				
					return "POTARP";
				
				}

				
			    public BigDecimal POSTOP;

				public BigDecimal getPOSTOP () {
					return this.POSTOP;
				}

				public Boolean POSTOPIsNullable(){
				    return false;
				}
				public Boolean POSTOPIsKey(){
				    return false;
				}
				public Integer POSTOPLength(){
				    return 5;
				}
				public Integer POSTOPPrecision(){
				    return 2;
				}
				public String POSTOPDefault(){
				
					return "";
				
				}
				public String POSTOPComment(){
				
				    return "";
				
				}
				public String POSTOPPattern(){
				
					return "";
				
				}
				public String POSTOPOriginalDbColumnName(){
				
					return "POSTOP";
				
				}

				
			    public BigDecimal POSKID;

				public BigDecimal getPOSKID () {
					return this.POSKID;
				}

				public Boolean POSKIDIsNullable(){
				    return false;
				}
				public Boolean POSKIDIsKey(){
				    return false;
				}
				public Integer POSKIDLength(){
				    return 5;
				}
				public Integer POSKIDPrecision(){
				    return 2;
				}
				public String POSKIDDefault(){
				
					return "";
				
				}
				public String POSKIDComment(){
				
				    return "";
				
				}
				public String POSKIDPattern(){
				
					return "";
				
				}
				public String POSKIDOriginalDbColumnName(){
				
					return "POSKID";
				
				}

				
			    public BigDecimal POOTHN;

				public BigDecimal getPOOTHN () {
					return this.POOTHN;
				}

				public Boolean POOTHNIsNullable(){
				    return false;
				}
				public Boolean POOTHNIsKey(){
				    return false;
				}
				public Integer POOTHNLength(){
				    return 5;
				}
				public Integer POOTHNPrecision(){
				    return 2;
				}
				public String POOTHNDefault(){
				
					return "";
				
				}
				public String POOTHNComment(){
				
				    return "";
				
				}
				public String POOTHNPattern(){
				
					return "";
				
				}
				public String POOTHNOriginalDbColumnName(){
				
					return "POOTHN";
				
				}

				
			    public BigDecimal POOTHP;

				public BigDecimal getPOOTHP () {
					return this.POOTHP;
				}

				public Boolean POOTHPIsNullable(){
				    return false;
				}
				public Boolean POOTHPIsKey(){
				    return false;
				}
				public Integer POOTHPLength(){
				    return 5;
				}
				public Integer POOTHPPrecision(){
				    return 3;
				}
				public String POOTHPDefault(){
				
					return "";
				
				}
				public String POOTHPComment(){
				
				    return "";
				
				}
				public String POOTHPPattern(){
				
					return "";
				
				}
				public String POOTHPOriginalDbColumnName(){
				
					return "POOTHP";
				
				}

				
			    public BigDecimal POBTCH;

				public BigDecimal getPOBTCH () {
					return this.POBTCH;
				}

				public Boolean POBTCHIsNullable(){
				    return false;
				}
				public Boolean POBTCHIsKey(){
				    return false;
				}
				public Integer POBTCHLength(){
				    return 7;
				}
				public Integer POBTCHPrecision(){
				    return 0;
				}
				public String POBTCHDefault(){
				
					return "";
				
				}
				public String POBTCHComment(){
				
				    return "";
				
				}
				public String POBTCHPattern(){
				
					return "";
				
				}
				public String POBTCHOriginalDbColumnName(){
				
					return "POBTCH";
				
				}

				
			    public BigDecimal PORRET;

				public BigDecimal getPORRET () {
					return this.PORRET;
				}

				public Boolean PORRETIsNullable(){
				    return false;
				}
				public Boolean PORRETIsKey(){
				    return false;
				}
				public Integer PORRETLength(){
				    return 9;
				}
				public Integer PORRETPrecision(){
				    return 2;
				}
				public String PORRETDefault(){
				
					return "";
				
				}
				public String PORRETComment(){
				
				    return "";
				
				}
				public String PORRETPattern(){
				
					return "";
				
				}
				public String PORRETOriginalDbColumnName(){
				
					return "PORRET";
				
				}

				
			    public BigDecimal PORVAT;

				public BigDecimal getPORVAT () {
					return this.PORVAT;
				}

				public Boolean PORVATIsNullable(){
				    return false;
				}
				public Boolean PORVATIsKey(){
				    return false;
				}
				public Integer PORVATLength(){
				    return 9;
				}
				public Integer PORVATPrecision(){
				    return 2;
				}
				public String PORVATDefault(){
				
					return "";
				
				}
				public String PORVATComment(){
				
				    return "";
				
				}
				public String PORVATPattern(){
				
					return "";
				
				}
				public String PORVATOriginalDbColumnName(){
				
					return "PORVAT";
				
				}

				
			    public BigDecimal PORCST;

				public BigDecimal getPORCST () {
					return this.PORCST;
				}

				public Boolean PORCSTIsNullable(){
				    return false;
				}
				public Boolean PORCSTIsKey(){
				    return false;
				}
				public Integer PORCSTLength(){
				    return 9;
				}
				public Integer PORCSTPrecision(){
				    return 2;
				}
				public String PORCSTDefault(){
				
					return "";
				
				}
				public String PORCSTComment(){
				
				    return "";
				
				}
				public String PORCSTPattern(){
				
					return "";
				
				}
				public String PORCSTOriginalDbColumnName(){
				
					return "PORCST";
				
				}

				
			    public BigDecimal POTPLT;

				public BigDecimal getPOTPLT () {
					return this.POTPLT;
				}

				public Boolean POTPLTIsNullable(){
				    return false;
				}
				public Boolean POTPLTIsKey(){
				    return false;
				}
				public Integer POTPLTLength(){
				    return 7;
				}
				public Integer POTPLTPrecision(){
				    return 2;
				}
				public String POTPLTDefault(){
				
					return "";
				
				}
				public String POTPLTComment(){
				
				    return "";
				
				}
				public String POTPLTPattern(){
				
					return "";
				
				}
				public String POTPLTOriginalDbColumnName(){
				
					return "POTPLT";
				
				}

				
			    public BigDecimal POCUBE;

				public BigDecimal getPOCUBE () {
					return this.POCUBE;
				}

				public Boolean POCUBEIsNullable(){
				    return false;
				}
				public Boolean POCUBEIsKey(){
				    return false;
				}
				public Integer POCUBELength(){
				    return 13;
				}
				public Integer POCUBEPrecision(){
				    return 3;
				}
				public String POCUBEDefault(){
				
					return "";
				
				}
				public String POCUBEComment(){
				
				    return "";
				
				}
				public String POCUBEPattern(){
				
					return "";
				
				}
				public String POCUBEOriginalDbColumnName(){
				
					return "POCUBE";
				
				}

				
			    public float POPDWN;

				public float getPOPDWN () {
					return this.POPDWN;
				}

				public Boolean POPDWNIsNullable(){
				    return false;
				}
				public Boolean POPDWNIsKey(){
				    return false;
				}
				public Integer POPDWNLength(){
				    return 6;
				}
				public Integer POPDWNPrecision(){
				    return 0;
				}
				public String POPDWNDefault(){
				
					return "";
				
				}
				public String POPDWNComment(){
				
				    return "";
				
				}
				public String POPDWNPattern(){
				
					return "";
				
				}
				public String POPDWNOriginalDbColumnName(){
				
					return "POPDWN";
				
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

				
			    public BigDecimal POPYCN;

				public BigDecimal getPOPYCN () {
					return this.POPYCN;
				}

				public Boolean POPYCNIsNullable(){
				    return false;
				}
				public Boolean POPYCNIsKey(){
				    return false;
				}
				public Integer POPYCNLength(){
				    return 1;
				}
				public Integer POPYCNPrecision(){
				    return 0;
				}
				public String POPYCNDefault(){
				
					return "";
				
				}
				public String POPYCNComment(){
				
				    return "";
				
				}
				public String POPYCNPattern(){
				
					return "";
				
				}
				public String POPYCNOriginalDbColumnName(){
				
					return "POPYCN";
				
				}

				
			    public float POPYDT;

				public float getPOPYDT () {
					return this.POPYDT;
				}

				public Boolean POPYDTIsNullable(){
				    return false;
				}
				public Boolean POPYDTIsKey(){
				    return false;
				}
				public Integer POPYDTLength(){
				    return 6;
				}
				public Integer POPYDTPrecision(){
				    return 0;
				}
				public String POPYDTDefault(){
				
					return "";
				
				}
				public String POPYDTComment(){
				
				    return "";
				
				}
				public String POPYDTPattern(){
				
					return "";
				
				}
				public String POPYDTOriginalDbColumnName(){
				
					return "POPYDT";
				
				}

				
			    public BigDecimal POMALS;

				public BigDecimal getPOMALS () {
					return this.POMALS;
				}

				public Boolean POMALSIsNullable(){
				    return false;
				}
				public Boolean POMALSIsKey(){
				    return false;
				}
				public Integer POMALSLength(){
				    return 9;
				}
				public Integer POMALSPrecision(){
				    return 2;
				}
				public String POMALSDefault(){
				
					return "";
				
				}
				public String POMALSComment(){
				
				    return "";
				
				}
				public String POMALSPattern(){
				
					return "";
				
				}
				public String POMALSOriginalDbColumnName(){
				
					return "POMALS";
				
				}

				
			    public BigDecimal POMALV;

				public BigDecimal getPOMALV () {
					return this.POMALV;
				}

				public Boolean POMALVIsNullable(){
				    return false;
				}
				public Boolean POMALVIsKey(){
				    return false;
				}
				public Integer POMALVLength(){
				    return 9;
				}
				public Integer POMALVPrecision(){
				    return 2;
				}
				public String POMALVDefault(){
				
					return "";
				
				}
				public String POMALVComment(){
				
				    return "";
				
				}
				public String POMALVPattern(){
				
					return "";
				
				}
				public String POMALVOriginalDbColumnName(){
				
					return "POMALV";
				
				}

				
			    public float POMSPO;

				public float getPOMSPO () {
					return this.POMSPO;
				}

				public Boolean POMSPOIsNullable(){
				    return false;
				}
				public Boolean POMSPOIsKey(){
				    return false;
				}
				public Integer POMSPOLength(){
				    return 6;
				}
				public Integer POMSPOPrecision(){
				    return 0;
				}
				public String POMSPODefault(){
				
					return "";
				
				}
				public String POMSPOComment(){
				
				    return "";
				
				}
				public String POMSPOPattern(){
				
					return "";
				
				}
				public String POMSPOOriginalDbColumnName(){
				
					return "POMSPO";
				
				}

				
			    public float POMSBO;

				public float getPOMSBO () {
					return this.POMSBO;
				}

				public Boolean POMSBOIsNullable(){
				    return false;
				}
				public Boolean POMSBOIsKey(){
				    return false;
				}
				public Integer POMSBOLength(){
				    return 2;
				}
				public Integer POMSBOPrecision(){
				    return 0;
				}
				public String POMSBODefault(){
				
					return "";
				
				}
				public String POMSBOComment(){
				
				    return "";
				
				}
				public String POMSBOPattern(){
				
					return "";
				
				}
				public String POMSBOOriginalDbColumnName(){
				
					return "POMSBO";
				
				}

				
			    public float POLOAD;

				public float getPOLOAD () {
					return this.POLOAD;
				}

				public Boolean POLOADIsNullable(){
				    return false;
				}
				public Boolean POLOADIsKey(){
				    return false;
				}
				public Integer POLOADLength(){
				    return 4;
				}
				public Integer POLOADPrecision(){
				    return 0;
				}
				public String POLOADDefault(){
				
					return "";
				
				}
				public String POLOADComment(){
				
				    return "";
				
				}
				public String POLOADPattern(){
				
					return "";
				
				}
				public String POLOADOriginalDbColumnName(){
				
					return "POLOAD";
				
				}

				
			    public BigDecimal POMCRT;

				public BigDecimal getPOMCRT () {
					return this.POMCRT;
				}

				public Boolean POMCRTIsNullable(){
				    return false;
				}
				public Boolean POMCRTIsKey(){
				    return false;
				}
				public Integer POMCRTLength(){
				    return 15;
				}
				public Integer POMCRTPrecision(){
				    return 8;
				}
				public String POMCRTDefault(){
				
					return "";
				
				}
				public String POMCRTComment(){
				
				    return "";
				
				}
				public String POMCRTPattern(){
				
					return "";
				
				}
				public String POMCRTOriginalDbColumnName(){
				
					return "POMCRT";
				
				}

				
			    public BigDecimal POMCDT;

				public BigDecimal getPOMCDT () {
					return this.POMCDT;
				}

				public Boolean POMCDTIsNullable(){
				    return false;
				}
				public Boolean POMCDTIsKey(){
				    return false;
				}
				public Integer POMCDTLength(){
				    return 6;
				}
				public Integer POMCDTPrecision(){
				    return 0;
				}
				public String POMCDTDefault(){
				
					return "";
				
				}
				public String POMCDTComment(){
				
				    return "";
				
				}
				public String POMCDTPattern(){
				
					return "";
				
				}
				public String POMCDTOriginalDbColumnName(){
				
					return "POMCDT";
				
				}

				
			    public String POQCKE;

				public String getPOQCKE () {
					return this.POQCKE;
				}

				public Boolean POQCKEIsNullable(){
				    return false;
				}
				public Boolean POQCKEIsKey(){
				    return false;
				}
				public Integer POQCKELength(){
				    return 1;
				}
				public Integer POQCKEPrecision(){
				    return 0;
				}
				public String POQCKEDefault(){
				
					return null;
				
				}
				public String POQCKEComment(){
				
				    return "";
				
				}
				public String POQCKEPattern(){
				
					return "";
				
				}
				public String POQCKEOriginalDbColumnName(){
				
					return "POQCKE";
				
				}

				
			    public String POMTYP;

				public String getPOMTYP () {
					return this.POMTYP;
				}

				public Boolean POMTYPIsNullable(){
				    return false;
				}
				public Boolean POMTYPIsKey(){
				    return false;
				}
				public Integer POMTYPLength(){
				    return 1;
				}
				public Integer POMTYPPrecision(){
				    return 0;
				}
				public String POMTYPDefault(){
				
					return null;
				
				}
				public String POMTYPComment(){
				
				    return "";
				
				}
				public String POMTYPPattern(){
				
					return "";
				
				}
				public String POMTYPOriginalDbColumnName(){
				
					return "POMTYP";
				
				}

				
			    public String PO850F;

				public String getPO850F () {
					return this.PO850F;
				}

				public Boolean PO850FIsNullable(){
				    return false;
				}
				public Boolean PO850FIsKey(){
				    return false;
				}
				public Integer PO850FLength(){
				    return 1;
				}
				public Integer PO850FPrecision(){
				    return 0;
				}
				public String PO850FDefault(){
				
					return null;
				
				}
				public String PO850FComment(){
				
				    return "";
				
				}
				public String PO850FPattern(){
				
					return "";
				
				}
				public String PO850FOriginalDbColumnName(){
				
					return "PO850F";
				
				}

				
			    public String PO860F;

				public String getPO860F () {
					return this.PO860F;
				}

				public Boolean PO860FIsNullable(){
				    return false;
				}
				public Boolean PO860FIsKey(){
				    return false;
				}
				public Integer PO860FLength(){
				    return 1;
				}
				public Integer PO860FPrecision(){
				    return 0;
				}
				public String PO860FDefault(){
				
					return null;
				
				}
				public String PO860FComment(){
				
				    return "";
				
				}
				public String PO860FPattern(){
				
					return "";
				
				}
				public String PO860FOriginalDbColumnName(){
				
					return "PO860F";
				
				}

				
			    public String POTPID;

				public String getPOTPID () {
					return this.POTPID;
				}

				public Boolean POTPIDIsNullable(){
				    return false;
				}
				public Boolean POTPIDIsKey(){
				    return false;
				}
				public Integer POTPIDLength(){
				    return 1;
				}
				public Integer POTPIDPrecision(){
				    return 0;
				}
				public String POTPIDDefault(){
				
					return null;
				
				}
				public String POTPIDComment(){
				
				    return "";
				
				}
				public String POTPIDPattern(){
				
					return "";
				
				}
				public String POTPIDOriginalDbColumnName(){
				
					return "POTPID";
				
				}

				
			    public float POBSDT;

				public float getPOBSDT () {
					return this.POBSDT;
				}

				public Boolean POBSDTIsNullable(){
				    return false;
				}
				public Boolean POBSDTIsKey(){
				    return false;
				}
				public Integer POBSDTLength(){
				    return 6;
				}
				public Integer POBSDTPrecision(){
				    return 0;
				}
				public String POBSDTDefault(){
				
					return "";
				
				}
				public String POBSDTComment(){
				
				    return "";
				
				}
				public String POBSDTPattern(){
				
					return "";
				
				}
				public String POBSDTOriginalDbColumnName(){
				
					return "POBSDT";
				
				}

				
			    public float POASDT;

				public float getPOASDT () {
					return this.POASDT;
				}

				public Boolean POASDTIsNullable(){
				    return false;
				}
				public Boolean POASDTIsKey(){
				    return false;
				}
				public Integer POASDTLength(){
				    return 6;
				}
				public Integer POASDTPrecision(){
				    return 0;
				}
				public String POASDTDefault(){
				
					return "";
				
				}
				public String POASDTComment(){
				
				    return "";
				
				}
				public String POASDTPattern(){
				
					return "";
				
				}
				public String POASDTOriginalDbColumnName(){
				
					return "POASDT";
				
				}

				
			    public String POCODF;

				public String getPOCODF () {
					return this.POCODF;
				}

				public Boolean POCODFIsNullable(){
				    return false;
				}
				public Boolean POCODFIsKey(){
				    return false;
				}
				public Integer POCODFLength(){
				    return 3;
				}
				public Integer POCODFPrecision(){
				    return 0;
				}
				public String POCODFDefault(){
				
					return null;
				
				}
				public String POCODFComment(){
				
				    return "";
				
				}
				public String POCODFPattern(){
				
					return "";
				
				}
				public String POCODFOriginalDbColumnName(){
				
					return "POCODF";
				
				}

				
			    public String POCODT;

				public String getPOCODT () {
					return this.POCODT;
				}

				public Boolean POCODTIsNullable(){
				    return false;
				}
				public Boolean POCODTIsKey(){
				    return false;
				}
				public Integer POCODTLength(){
				    return 3;
				}
				public Integer POCODTPrecision(){
				    return 0;
				}
				public String POCODTDefault(){
				
					return null;
				
				}
				public String POCODTComment(){
				
				    return "";
				
				}
				public String POCODTPattern(){
				
					return "";
				
				}
				public String POCODTOriginalDbColumnName(){
				
					return "POCODT";
				
				}

				
			    public String POCVTP;

				public String getPOCVTP () {
					return this.POCVTP;
				}

				public Boolean POCVTPIsNullable(){
				    return false;
				}
				public Boolean POCVTPIsKey(){
				    return false;
				}
				public Integer POCVTPLength(){
				    return 3;
				}
				public Integer POCVTPPrecision(){
				    return 0;
				}
				public String POCVTPDefault(){
				
					return null;
				
				}
				public String POCVTPComment(){
				
				    return "";
				
				}
				public String POCVTPPattern(){
				
					return "";
				
				}
				public String POCVTPOriginalDbColumnName(){
				
					return "POCVTP";
				
				}

				
			    public String POCVMD;

				public String getPOCVMD () {
					return this.POCVMD;
				}

				public Boolean POCVMDIsNullable(){
				    return false;
				}
				public Boolean POCVMDIsKey(){
				    return false;
				}
				public Integer POCVMDLength(){
				    return 1;
				}
				public Integer POCVMDPrecision(){
				    return 0;
				}
				public String POCVMDDefault(){
				
					return null;
				
				}
				public String POCVMDComment(){
				
				    return "";
				
				}
				public String POCVMDPattern(){
				
					return "";
				
				}
				public String POCVMDOriginalDbColumnName(){
				
					return "POCVMD";
				
				}

				
			    public String POMCPY;

				public String getPOMCPY () {
					return this.POMCPY;
				}

				public Boolean POMCPYIsNullable(){
				    return false;
				}
				public Boolean POMCPYIsKey(){
				    return false;
				}
				public Integer POMCPYLength(){
				    return 1;
				}
				public Integer POMCPYPrecision(){
				    return 0;
				}
				public String POMCPYDefault(){
				
					return null;
				
				}
				public String POMCPYComment(){
				
				    return "";
				
				}
				public String POMCPYPattern(){
				
					return "";
				
				}
				public String POMCPYOriginalDbColumnName(){
				
					return "POMCPY";
				
				}

				
			    public String POUSER;

				public String getPOUSER () {
					return this.POUSER;
				}

				public Boolean POUSERIsNullable(){
				    return false;
				}
				public Boolean POUSERIsKey(){
				    return false;
				}
				public Integer POUSERLength(){
				    return 10;
				}
				public Integer POUSERPrecision(){
				    return 0;
				}
				public String POUSERDefault(){
				
					return null;
				
				}
				public String POUSERComment(){
				
				    return "";
				
				}
				public String POUSERPattern(){
				
					return "";
				
				}
				public String POUSEROriginalDbColumnName(){
				
					return "POUSER";
				
				}

				
			    public BigDecimal DATCUR;

				public BigDecimal getDATCUR () {
					return this.DATCUR;
				}

				public Boolean DATCURIsNullable(){
				    return false;
				}
				public Boolean DATCURIsKey(){
				    return false;
				}
				public Integer DATCURLength(){
				    return 6;
				}
				public Integer DATCURPrecision(){
				    return 0;
				}
				public String DATCURDefault(){
				
					return "";
				
				}
				public String DATCURComment(){
				
				    return "";
				
				}
				public String DATCURPattern(){
				
					return "";
				
				}
				public String DATCUROriginalDbColumnName(){
				
					return "DATCUR";
				
				}

				
			    public BigDecimal DATTIM;

				public BigDecimal getDATTIM () {
					return this.DATTIM;
				}

				public Boolean DATTIMIsNullable(){
				    return false;
				}
				public Boolean DATTIMIsKey(){
				    return false;
				}
				public Integer DATTIMLength(){
				    return 6;
				}
				public Integer DATTIMPrecision(){
				    return 0;
				}
				public String DATTIMDefault(){
				
					return "";
				
				}
				public String DATTIMComment(){
				
				    return "";
				
				}
				public String DATTIMPattern(){
				
					return "";
				
				}
				public String DATTIMOriginalDbColumnName(){
				
					return "DATTIM";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			        this.PONUMB = dis.readFloat();
					
			        this.POBON = dis.readFloat();
					
			        this.POVNUM = dis.readFloat();
					
			        this.POTRMS = dis.readFloat();
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
						this.POSTOR = (BigDecimal) dis.readObject();
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
			        this.PODPT = dis.readFloat();
					
			        this.POSDPT = dis.readFloat();
					
			        this.POTHER = dis.readFloat();
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			        this.POEDAT = dis.readFloat();
					
			        this.POSDAT = dis.readFloat();
					
			        this.POCDAT = dis.readFloat();
					
			        this.PORDAT = dis.readFloat();
					
			        this.POLCHG = dis.readFloat();
					
			        this.PORFRQ = dis.readFloat();
					
			        this.POLEAD = dis.readFloat();
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
						this.POCOST = (BigDecimal) dis.readObject();
					
						this.POVAT = (BigDecimal) dis.readObject();
					
						this.PORETL = (BigDecimal) dis.readObject();
					
						this.POCASE = (BigDecimal) dis.readObject();
					
						this.POUNTS = (BigDecimal) dis.readObject();
					
						this.POWGHT = (BigDecimal) dis.readObject();
					
						this.POTARP = (BigDecimal) dis.readObject();
					
						this.POSTOP = (BigDecimal) dis.readObject();
					
						this.POSKID = (BigDecimal) dis.readObject();
					
						this.POOTHN = (BigDecimal) dis.readObject();
					
						this.POOTHP = (BigDecimal) dis.readObject();
					
						this.POBTCH = (BigDecimal) dis.readObject();
					
						this.PORRET = (BigDecimal) dis.readObject();
					
						this.PORVAT = (BigDecimal) dis.readObject();
					
						this.PORCST = (BigDecimal) dis.readObject();
					
						this.POTPLT = (BigDecimal) dis.readObject();
					
						this.POCUBE = (BigDecimal) dis.readObject();
					
			        this.POPDWN = dis.readFloat();
					
			        this.SHPNUM = dis.readFloat();
					
						this.POPYCN = (BigDecimal) dis.readObject();
					
			        this.POPYDT = dis.readFloat();
					
						this.POMALS = (BigDecimal) dis.readObject();
					
						this.POMALV = (BigDecimal) dis.readObject();
					
			        this.POMSPO = dis.readFloat();
					
			        this.POMSBO = dis.readFloat();
					
			        this.POLOAD = dis.readFloat();
					
						this.POMCRT = (BigDecimal) dis.readObject();
					
						this.POMCDT = (BigDecimal) dis.readObject();
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			        this.POBSDT = dis.readFloat();
					
			        this.POASDT = dis.readFloat();
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
						this.DATCUR = (BigDecimal) dis.readObject();
					
						this.DATTIM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			        this.PONUMB = dis.readFloat();
					
			        this.POBON = dis.readFloat();
					
			        this.POVNUM = dis.readFloat();
					
			        this.POTRMS = dis.readFloat();
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
						this.POSTOR = (BigDecimal) dis.readObject();
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
			        this.PODPT = dis.readFloat();
					
			        this.POSDPT = dis.readFloat();
					
			        this.POTHER = dis.readFloat();
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			        this.POEDAT = dis.readFloat();
					
			        this.POSDAT = dis.readFloat();
					
			        this.POCDAT = dis.readFloat();
					
			        this.PORDAT = dis.readFloat();
					
			        this.POLCHG = dis.readFloat();
					
			        this.PORFRQ = dis.readFloat();
					
			        this.POLEAD = dis.readFloat();
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
						this.POCOST = (BigDecimal) dis.readObject();
					
						this.POVAT = (BigDecimal) dis.readObject();
					
						this.PORETL = (BigDecimal) dis.readObject();
					
						this.POCASE = (BigDecimal) dis.readObject();
					
						this.POUNTS = (BigDecimal) dis.readObject();
					
						this.POWGHT = (BigDecimal) dis.readObject();
					
						this.POTARP = (BigDecimal) dis.readObject();
					
						this.POSTOP = (BigDecimal) dis.readObject();
					
						this.POSKID = (BigDecimal) dis.readObject();
					
						this.POOTHN = (BigDecimal) dis.readObject();
					
						this.POOTHP = (BigDecimal) dis.readObject();
					
						this.POBTCH = (BigDecimal) dis.readObject();
					
						this.PORRET = (BigDecimal) dis.readObject();
					
						this.PORVAT = (BigDecimal) dis.readObject();
					
						this.PORCST = (BigDecimal) dis.readObject();
					
						this.POTPLT = (BigDecimal) dis.readObject();
					
						this.POCUBE = (BigDecimal) dis.readObject();
					
			        this.POPDWN = dis.readFloat();
					
			        this.SHPNUM = dis.readFloat();
					
						this.POPYCN = (BigDecimal) dis.readObject();
					
			        this.POPYDT = dis.readFloat();
					
						this.POMALS = (BigDecimal) dis.readObject();
					
						this.POMALV = (BigDecimal) dis.readObject();
					
			        this.POMSPO = dis.readFloat();
					
			        this.POMSBO = dis.readFloat();
					
			        this.POLOAD = dis.readFloat();
					
						this.POMCRT = (BigDecimal) dis.readObject();
					
						this.POMCDT = (BigDecimal) dis.readObject();
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			        this.POBSDT = dis.readFloat();
					
			        this.POASDT = dis.readFloat();
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
						this.DATCUR = (BigDecimal) dis.readObject();
					
						this.DATTIM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// float
				
		            	dos.writeFloat(this.PONUMB);
					
					// float
				
		            	dos.writeFloat(this.POBON);
					
					// float
				
		            	dos.writeFloat(this.POVNUM);
					
					// float
				
		            	dos.writeFloat(this.POTRMS);
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSTOR);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// float
				
		            	dos.writeFloat(this.PODPT);
					
					// float
				
		            	dos.writeFloat(this.POSDPT);
					
					// float
				
		            	dos.writeFloat(this.POTHER);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// float
				
		            	dos.writeFloat(this.POEDAT);
					
					// float
				
		            	dos.writeFloat(this.POSDAT);
					
					// float
				
		            	dos.writeFloat(this.POCDAT);
					
					// float
				
		            	dos.writeFloat(this.PORDAT);
					
					// float
				
		            	dos.writeFloat(this.POLCHG);
					
					// float
				
		            	dos.writeFloat(this.PORFRQ);
					
					// float
				
		            	dos.writeFloat(this.POLEAD);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCOST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORETL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCASE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POUNTS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POTARP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSTOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSKID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POOTHN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POOTHP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POBTCH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORCST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POTPLT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCUBE);
					
					// float
				
		            	dos.writeFloat(this.POPDWN);
					
					// float
				
		            	dos.writeFloat(this.SHPNUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POPYCN);
					
					// float
				
		            	dos.writeFloat(this.POPYDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMALS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMALV);
					
					// float
				
		            	dos.writeFloat(this.POMSPO);
					
					// float
				
		            	dos.writeFloat(this.POMSBO);
					
					// float
				
		            	dos.writeFloat(this.POLOAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMCRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMCDT);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// float
				
		            	dos.writeFloat(this.POBSDT);
					
					// float
				
		            	dos.writeFloat(this.POASDT);
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATCUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATTIM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// float
				
		            	dos.writeFloat(this.PONUMB);
					
					// float
				
		            	dos.writeFloat(this.POBON);
					
					// float
				
		            	dos.writeFloat(this.POVNUM);
					
					// float
				
		            	dos.writeFloat(this.POTRMS);
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSTOR);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// float
				
		            	dos.writeFloat(this.PODPT);
					
					// float
				
		            	dos.writeFloat(this.POSDPT);
					
					// float
				
		            	dos.writeFloat(this.POTHER);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// float
				
		            	dos.writeFloat(this.POEDAT);
					
					// float
				
		            	dos.writeFloat(this.POSDAT);
					
					// float
				
		            	dos.writeFloat(this.POCDAT);
					
					// float
				
		            	dos.writeFloat(this.PORDAT);
					
					// float
				
		            	dos.writeFloat(this.POLCHG);
					
					// float
				
		            	dos.writeFloat(this.PORFRQ);
					
					// float
				
		            	dos.writeFloat(this.POLEAD);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCOST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORETL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCASE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POUNTS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POWGHT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POTARP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSTOP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POSKID);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POOTHN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POOTHP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POBTCH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.PORCST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POTPLT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POCUBE);
					
					// float
				
		            	dos.writeFloat(this.POPDWN);
					
					// float
				
		            	dos.writeFloat(this.SHPNUM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POPYCN);
					
					// float
				
		            	dos.writeFloat(this.POPYDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMALS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMALV);
					
					// float
				
		            	dos.writeFloat(this.POMSPO);
					
					// float
				
		            	dos.writeFloat(this.POMSBO);
					
					// float
				
		            	dos.writeFloat(this.POLOAD);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMCRT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.POMCDT);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// float
				
		            	dos.writeFloat(this.POBSDT);
					
					// float
				
		            	dos.writeFloat(this.POASDT);
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATCUR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATTIM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("PONUMB="+String.valueOf(PONUMB));
		sb.append(",POBON="+String.valueOf(POBON));
		sb.append(",POVNUM="+String.valueOf(POVNUM));
		sb.append(",POTRMS="+String.valueOf(POTRMS));
		sb.append(",POTIND="+POTIND);
		sb.append(",POSTAT="+POSTAT);
		sb.append(",POTYPE="+POTYPE);
		sb.append(",PODEST="+PODEST);
		sb.append(",POSTOR="+String.valueOf(POSTOR));
		sb.append(",POADYN="+POADYN);
		sb.append(",PODMTH="+PODMTH);
		sb.append(",POALBO="+POALBO);
		sb.append(",POCONF="+POCONF);
		sb.append(",POPHON="+POPHON);
		sb.append(",POBUYR="+POBUYR);
		sb.append(",PODPT="+String.valueOf(PODPT));
		sb.append(",POSDPT="+String.valueOf(POSDPT));
		sb.append(",POTHER="+String.valueOf(POTHER));
		sb.append(",POFPCD="+POFPCD);
		sb.append(",POFOB="+POFOB);
		sb.append(",POSHP1="+POSHP1);
		sb.append(",POSHP2="+POSHP2);
		sb.append(",POSHPP="+POSHPP);
		sb.append(",POSHPC="+POSHPC);
		sb.append(",POEDAT="+String.valueOf(POEDAT));
		sb.append(",POSDAT="+String.valueOf(POSDAT));
		sb.append(",POCDAT="+String.valueOf(POCDAT));
		sb.append(",PORDAT="+String.valueOf(PORDAT));
		sb.append(",POLCHG="+String.valueOf(POLCHG));
		sb.append(",PORFRQ="+String.valueOf(PORFRQ));
		sb.append(",POLEAD="+String.valueOf(POLEAD));
		sb.append(",POORIG="+POORIG);
		sb.append(",PONOT1="+PONOT1);
		sb.append(",PONOT2="+PONOT2);
		sb.append(",PONOT3="+PONOT3);
		sb.append(",POCOST="+String.valueOf(POCOST));
		sb.append(",POVAT="+String.valueOf(POVAT));
		sb.append(",PORETL="+String.valueOf(PORETL));
		sb.append(",POCASE="+String.valueOf(POCASE));
		sb.append(",POUNTS="+String.valueOf(POUNTS));
		sb.append(",POWGHT="+String.valueOf(POWGHT));
		sb.append(",POTARP="+String.valueOf(POTARP));
		sb.append(",POSTOP="+String.valueOf(POSTOP));
		sb.append(",POSKID="+String.valueOf(POSKID));
		sb.append(",POOTHN="+String.valueOf(POOTHN));
		sb.append(",POOTHP="+String.valueOf(POOTHP));
		sb.append(",POBTCH="+String.valueOf(POBTCH));
		sb.append(",PORRET="+String.valueOf(PORRET));
		sb.append(",PORVAT="+String.valueOf(PORVAT));
		sb.append(",PORCST="+String.valueOf(PORCST));
		sb.append(",POTPLT="+String.valueOf(POTPLT));
		sb.append(",POCUBE="+String.valueOf(POCUBE));
		sb.append(",POPDWN="+String.valueOf(POPDWN));
		sb.append(",SHPNUM="+String.valueOf(SHPNUM));
		sb.append(",POPYCN="+String.valueOf(POPYCN));
		sb.append(",POPYDT="+String.valueOf(POPYDT));
		sb.append(",POMALS="+String.valueOf(POMALS));
		sb.append(",POMALV="+String.valueOf(POMALV));
		sb.append(",POMSPO="+String.valueOf(POMSPO));
		sb.append(",POMSBO="+String.valueOf(POMSBO));
		sb.append(",POLOAD="+String.valueOf(POLOAD));
		sb.append(",POMCRT="+String.valueOf(POMCRT));
		sb.append(",POMCDT="+String.valueOf(POMCDT));
		sb.append(",POQCKE="+POQCKE);
		sb.append(",POMTYP="+POMTYP);
		sb.append(",PO850F="+PO850F);
		sb.append(",PO860F="+PO860F);
		sb.append(",POTPID="+POTPID);
		sb.append(",POBSDT="+String.valueOf(POBSDT));
		sb.append(",POASDT="+String.valueOf(POASDT));
		sb.append(",POCODF="+POCODF);
		sb.append(",POCODT="+POCODT);
		sb.append(",POCVTP="+POCVTP);
		sb.append(",POCVMD="+POCVMD);
		sb.append(",POMCPY="+POMCPY);
		sb.append(",POUSER="+POUSER);
		sb.append(",DATCUR="+String.valueOf(DATCUR));
		sb.append(",DATTIM="+String.valueOf(DATTIM));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(PONUMB);
        			
        			sb.append("|");
        		
        				sb.append(POBON);
        			
        			sb.append("|");
        		
        				sb.append(POVNUM);
        			
        			sb.append("|");
        		
        				sb.append(POTRMS);
        			
        			sb.append("|");
        		
        				if(POTIND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTIND);
            			}
            		
        			sb.append("|");
        		
        				if(POSTAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTAT);
            			}
            		
        			sb.append("|");
        		
        				if(POTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PODEST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODEST);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOR);
            			}
            		
        			sb.append("|");
        		
        				if(POADYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POADYN);
            			}
            		
        			sb.append("|");
        		
        				if(PODMTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODMTH);
            			}
            		
        			sb.append("|");
        		
        				if(POALBO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POALBO);
            			}
            		
        			sb.append("|");
        		
        				if(POCONF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCONF);
            			}
            		
        			sb.append("|");
        		
        				if(POPHON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPHON);
            			}
            		
        			sb.append("|");
        		
        				if(POBUYR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBUYR);
            			}
            		
        			sb.append("|");
        		
        				sb.append(PODPT);
        			
        			sb.append("|");
        		
        				sb.append(POSDPT);
        			
        			sb.append("|");
        		
        				sb.append(POTHER);
        			
        			sb.append("|");
        		
        				if(POFPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFPCD);
            			}
            		
        			sb.append("|");
        		
        				if(POFOB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFOB);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP1);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP2);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPP);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPC);
            			}
            		
        			sb.append("|");
        		
        				sb.append(POEDAT);
        			
        			sb.append("|");
        		
        				sb.append(POSDAT);
        			
        			sb.append("|");
        		
        				sb.append(POCDAT);
        			
        			sb.append("|");
        		
        				sb.append(PORDAT);
        			
        			sb.append("|");
        		
        				sb.append(POLCHG);
        			
        			sb.append("|");
        		
        				sb.append(PORFRQ);
        			
        			sb.append("|");
        		
        				sb.append(POLEAD);
        			
        			sb.append("|");
        		
        				if(POORIG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POORIG);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT1);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT2);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT3);
            			}
            		
        			sb.append("|");
        		
        				if(POCOST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCOST);
            			}
            		
        			sb.append("|");
        		
        				if(POVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORETL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORETL);
            			}
            		
        			sb.append("|");
        		
        				if(POCASE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCASE);
            			}
            		
        			sb.append("|");
        		
        				if(POUNTS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUNTS);
            			}
            		
        			sb.append("|");
        		
        				if(POWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(POTARP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTARP);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOP);
            			}
            		
        			sb.append("|");
        		
        				if(POSKID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSKID);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHN);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHP);
            			}
            		
        			sb.append("|");
        		
        				if(POBTCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBTCH);
            			}
            		
        			sb.append("|");
        		
        				if(PORRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORRET);
            			}
            		
        			sb.append("|");
        		
        				if(PORVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORCST);
            			}
            		
        			sb.append("|");
        		
        				if(POTPLT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPLT);
            			}
            		
        			sb.append("|");
        		
        				if(POCUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCUBE);
            			}
            		
        			sb.append("|");
        		
        				sb.append(POPDWN);
        			
        			sb.append("|");
        		
        				sb.append(SHPNUM);
        			
        			sb.append("|");
        		
        				if(POPYCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPYCN);
            			}
            		
        			sb.append("|");
        		
        				sb.append(POPYDT);
        			
        			sb.append("|");
        		
        				if(POMALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALS);
            			}
            		
        			sb.append("|");
        		
        				if(POMALV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALV);
            			}
            		
        			sb.append("|");
        		
        				sb.append(POMSPO);
        			
        			sb.append("|");
        		
        				sb.append(POMSBO);
        			
        			sb.append("|");
        		
        				sb.append(POLOAD);
        			
        			sb.append("|");
        		
        				if(POMCRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCRT);
            			}
            		
        			sb.append("|");
        		
        				if(POMCDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCDT);
            			}
            		
        			sb.append("|");
        		
        				if(POQCKE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POQCKE);
            			}
            		
        			sb.append("|");
        		
        				if(POMTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMTYP);
            			}
            		
        			sb.append("|");
        		
        				if(PO850F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO850F);
            			}
            		
        			sb.append("|");
        		
        				if(PO860F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO860F);
            			}
            		
        			sb.append("|");
        		
        				if(POTPID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPID);
            			}
            		
        			sb.append("|");
        		
        				sb.append(POBSDT);
        			
        			sb.append("|");
        		
        				sb.append(POASDT);
        			
        			sb.append("|");
        		
        				if(POCODF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODF);
            			}
            		
        			sb.append("|");
        		
        				if(POCODT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODT);
            			}
            		
        			sb.append("|");
        		
        				if(POCVTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVTP);
            			}
            		
        			sb.append("|");
        		
        				if(POCVMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVMD);
            			}
            		
        			sb.append("|");
        		
        				if(POMCPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCPY);
            			}
            		
        			sb.append("|");
        		
        				if(POUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUSER);
            			}
            		
        			sb.append("|");
        		
        				if(DATCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATCUR);
            			}
            		
        			sb.append("|");
        		
        				if(DATTIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATTIM);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

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



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
		int tos_count_tFileOutputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_2.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_2.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILENAME" + " = " + "\"/data/talend/data_repository/POMHDH.txt\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + (log4jParamters_tFileOutputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_2", "tFileOutputDelimited_2", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_2 = "";
    fileName_tFileOutputDelimited_2 = (new java.io.File("/data/talend/data_repository/POMHDH.txt")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_2 = null;
    String extension_tFileOutputDelimited_2 = null;
    String directory_tFileOutputDelimited_2 = null;
    if((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        }
        directory_tFileOutputDelimited_2 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_2 = true;
    java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
    globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
            int nb_line_tFileOutputDelimited_2 = 0;
            int splitedFileNo_tFileOutputDelimited_2 = 0;
            int currentRow_tFileOutputDelimited_2 = 0;

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */"|"/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
                        if(!dir_tFileOutputDelimited_2.exists()) {
                                log.info("tFileOutputDelimited_2 - Creating directory '" + dir_tFileOutputDelimited_2.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_2.mkdirs();
                                log.info("tFileOutputDelimited_2 - The directory '"+ dir_tFileOutputDelimited_2.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
                        if(fileToDelete_tFileOutputDelimited_2.exists()) {
                            fileToDelete_tFileOutputDelimited_2.delete();
                        }
                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_2, false),"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
                        synchronized (multiThreadLockWrite) {
                                    if(filetFileOutputDelimited_2.length()==0){
                                        outtFileOutputDelimited_2.write("PONUMB");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POBON");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POVNUM");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTRMS");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTIND");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSTAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTYPE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PODEST");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSTOR");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POADYN");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PODMTH");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POALBO");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCONF");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POPHON");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POBUYR");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PODPT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSDPT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTHER");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POFPCD");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POFOB");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSHP1");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSHP2");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSHPP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSHPC");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POEDAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSDAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCDAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORDAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POLCHG");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORFRQ");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POLEAD");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POORIG");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PONOT1");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PONOT2");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PONOT3");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCOST");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POVAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORETL");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCASE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POUNTS");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POWGHT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTARP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSTOP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POSKID");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POOTHN");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POOTHP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POBTCH");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORRET");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORVAT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PORCST");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTPLT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCUBE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POPDWN");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("SHPNUM");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POPYCN");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POPYDT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMALS");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMALV");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMSPO");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMSBO");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POLOAD");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMCRT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMCDT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POQCKE");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMTYP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PO850F");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("PO860F");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POTPID");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POBSDT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POASDT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCODF");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCODT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCVTP");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POCVMD");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POMCPY");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("POUSER");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("DATCUR");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("DATTIM");
                                        outtFileOutputDelimited_2.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.flush();
                                    }
                        }


resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

 



/**
 * [tFileOutputDelimited_2 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";
	
	
		int tos_count_tDBInput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBInput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBInput_2 = new StringBuilder();
                    log4jParamters_tDBInput_2.append("Parameters:");
                            log4jParamters_tDBInput_2.append("USE_EXISTING_CONNECTION" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("DB_VERSION" + " = " + "jt400-9.8.jar");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("HOST" + " = " + "context.jda_host_name");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("DBNAME" + " = " + "context.jda_mm_lib");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("USER" + " = " + "context.jda_user_name");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password)).substring(0, 4) + "...");     
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"  select  PONUMB	,POBON	,POVNUM	,POTRMS	,POTIND	,POSTAT	,POTYPE	,PODEST	,POSTOR	,POADYN	,PODMTH	,POALBO	,POCONF	,POPHON	,POBUYR	,PODPT	,POSDPT	,POTHER	,POFPCD	,POFOB	,POSHP1	,POSHP2	,POSHPP	,POSHPC	,POEDAT	,POSDAT	,POCDAT	,PORDAT	,POLCHG	,PORFRQ	,POLEAD	,POORIG	,PONOT1	,PONOT2	,PONOT3	,POCOST	,POVAT	,PORETL	,POCASE	,POUNTS	,POWGHT	,POTARP	,POSTOP	,POSKID	,POOTHN	,POOTHP	,POBTCH	,PORRET	,PORVAT	,PORCST	,POTPLT	,POCUBE	,POPDWN	,SHPNUM	,POPYCN	,POPYDT	,POMALS	,POMALV	,POMSPO	,POMSBO	,POLOAD	,POMCRT	,POMCDT	,POQCKE	,POMTYP	,PO850F	,PO860F	,POTPID	,POBSDT	,POASDT	,POCODF	,POCODT	,POCVTP	,POCVMD	,POMCPY	,POUSER	,DATCUR	,DATTIM  from MM4R5LIB.POMHDH    \"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PONUMB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POVNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTRMS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTIND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODEST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POADYN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODMTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POALBO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCONF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPHON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBUYR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTHER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POFPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POFOB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHP1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHP2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHPP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHPC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POEDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLCHG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORFRQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POORIG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCOST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORETL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCASE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POUNTS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POWGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTARP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTOP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSKID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POOTHN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POOTHP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBTCH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTPLT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCUBE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPDWN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHPNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPYCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPYDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMALS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMALV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMSPO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMSBO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLOAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POQCKE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMTYP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PO850F")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PO860F")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTPID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POASDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCODF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCODT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCVTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCVMD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCPY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POUSER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATCUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATTIM")+"}]");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
                        log4jParamters_tDBInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + (log4jParamters_tDBInput_2) );
                    } 
                } 
            new BytesLimit65535_tDBInput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_2", "tDBInput_2", "tAS400Input");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "com.ibm.as400.access.AS400JDBCDriver";
			    java.lang.Class jdbcclazz_tDBInput_2 = java.lang.Class.forName(driverClass_tDBInput_2);
				String dbUser_tDBInput_2 = context.jda_user_name;
				
				
	final String decryptedPassword_tDBInput_2 = context.jda_password; 
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				  
				String url_tDBInput_2 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";" + "prompt=false";
				
	    		log.debug("tDBInput_2 - Driver ClassName: "+driverClass_tDBInput_2+".");
			
	    		log.debug("tDBInput_2 - Connection attempt to '" + url_tDBInput_2 + "' with the username '" + dbUser_tDBInput_2 + "'.");
			
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
	    		log.debug("tDBInput_2 - Connection to '" + url_tDBInput_2 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "\nselect\nPONUMB	,POBON	,POVNUM	,POTRMS	,POTIND	,POSTAT	,POTYPE	,PODEST	,POSTOR	,POADYN	,PODMTH	,POALBO	,POCONF	,POPHON"
+"	,POBUYR	,PODPT	,POSDPT	,POTHER	,POFPCD	,POFOB	,POSHP1	,POSHP2	,POSHPP	,POSHPC	,POEDAT	,POSDAT	,POCDAT	,PORDAT	,POLCHG	,"
+"PORFRQ	,POLEAD	,POORIG	,PONOT1	,PONOT2	,PONOT3	,POCOST	,POVAT	,PORETL	,POCASE	,POUNTS	,POWGHT	,POTARP	,POSTOP	,POSKID	,P"
+"OOTHN	,POOTHP	,POBTCH	,PORRET	,PORVAT	,PORCST	,POTPLT	,POCUBE	,POPDWN	,SHPNUM	,POPYCN	,POPYDT	,POMALS	,POMALV	,POMSPO	,P"
+"OMSBO	,POLOAD	,POMCRT	,POMCDT	,POQCKE	,POMTYP	,PO850F	,PO860F	,POTPID	,POBSDT	,POASDT	,POCODF	,POCODT	,POCVTP	,POCVMD	,P"
+"OMCPY	,POUSER	,DATCUR	,DATTIM\nfrom MM4R5LIB.POMHDH\n\n";
		    
	    		log.debug("tDBInput_2 - Executing the query: '" + dbquery_tDBInput_2 + "'.");
			

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    	log.debug("tDBInput_2 - Retrieving records from the database.");
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row3.PONUMB = 0;
							} else {
		                          
            row3.PONUMB = rs_tDBInput_2.getFloat(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row3.POBON = 0;
							} else {
		                          
            row3.POBON = rs_tDBInput_2.getFloat(2);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row3.POVNUM = 0;
							} else {
		                          
            row3.POVNUM = rs_tDBInput_2.getFloat(3);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row3.POTRMS = 0;
							} else {
		                          
            row3.POTRMS = rs_tDBInput_2.getFloat(4);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row3.POTIND = null;
							} else {
	                         		
        	row3.POTIND = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row3.POSTAT = null;
							} else {
	                         		
        	row3.POSTAT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 6, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row3.POTYPE = null;
							} else {
	                         		
        	row3.POTYPE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 8) {
								row3.PODEST = null;
							} else {
	                         		
        	row3.PODEST = routines.system.JDBCUtil.getString(rs_tDBInput_2, 8, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 9) {
								row3.POSTOR = null;
							} else {
		                          
            row3.POSTOR = rs_tDBInput_2.getBigDecimal(9);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 10) {
								row3.POADYN = null;
							} else {
	                         		
        	row3.POADYN = routines.system.JDBCUtil.getString(rs_tDBInput_2, 10, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 11) {
								row3.PODMTH = null;
							} else {
	                         		
        	row3.PODMTH = routines.system.JDBCUtil.getString(rs_tDBInput_2, 11, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 12) {
								row3.POALBO = null;
							} else {
	                         		
        	row3.POALBO = routines.system.JDBCUtil.getString(rs_tDBInput_2, 12, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 13) {
								row3.POCONF = null;
							} else {
	                         		
        	row3.POCONF = routines.system.JDBCUtil.getString(rs_tDBInput_2, 13, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 14) {
								row3.POPHON = null;
							} else {
	                         		
        	row3.POPHON = routines.system.JDBCUtil.getString(rs_tDBInput_2, 14, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 15) {
								row3.POBUYR = null;
							} else {
	                         		
        	row3.POBUYR = routines.system.JDBCUtil.getString(rs_tDBInput_2, 15, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 16) {
								row3.PODPT = 0;
							} else {
		                          
            row3.PODPT = rs_tDBInput_2.getFloat(16);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 17) {
								row3.POSDPT = 0;
							} else {
		                          
            row3.POSDPT = rs_tDBInput_2.getFloat(17);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 18) {
								row3.POTHER = 0;
							} else {
		                          
            row3.POTHER = rs_tDBInput_2.getFloat(18);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 19) {
								row3.POFPCD = null;
							} else {
	                         		
        	row3.POFPCD = routines.system.JDBCUtil.getString(rs_tDBInput_2, 19, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 20) {
								row3.POFOB = null;
							} else {
	                         		
        	row3.POFOB = routines.system.JDBCUtil.getString(rs_tDBInput_2, 20, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 21) {
								row3.POSHP1 = null;
							} else {
	                         		
        	row3.POSHP1 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 21, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 22) {
								row3.POSHP2 = null;
							} else {
	                         		
        	row3.POSHP2 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 22, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 23) {
								row3.POSHPP = null;
							} else {
	                         		
        	row3.POSHPP = routines.system.JDBCUtil.getString(rs_tDBInput_2, 23, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 24) {
								row3.POSHPC = null;
							} else {
	                         		
        	row3.POSHPC = routines.system.JDBCUtil.getString(rs_tDBInput_2, 24, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 25) {
								row3.POEDAT = 0;
							} else {
		                          
            row3.POEDAT = rs_tDBInput_2.getFloat(25);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 26) {
								row3.POSDAT = 0;
							} else {
		                          
            row3.POSDAT = rs_tDBInput_2.getFloat(26);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 27) {
								row3.POCDAT = 0;
							} else {
		                          
            row3.POCDAT = rs_tDBInput_2.getFloat(27);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 28) {
								row3.PORDAT = 0;
							} else {
		                          
            row3.PORDAT = rs_tDBInput_2.getFloat(28);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 29) {
								row3.POLCHG = 0;
							} else {
		                          
            row3.POLCHG = rs_tDBInput_2.getFloat(29);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 30) {
								row3.PORFRQ = 0;
							} else {
		                          
            row3.PORFRQ = rs_tDBInput_2.getFloat(30);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 31) {
								row3.POLEAD = 0;
							} else {
		                          
            row3.POLEAD = rs_tDBInput_2.getFloat(31);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 32) {
								row3.POORIG = null;
							} else {
	                         		
        	row3.POORIG = routines.system.JDBCUtil.getString(rs_tDBInput_2, 32, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 33) {
								row3.PONOT1 = null;
							} else {
	                         		
        	row3.PONOT1 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 33, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 34) {
								row3.PONOT2 = null;
							} else {
	                         		
        	row3.PONOT2 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 34, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 35) {
								row3.PONOT3 = null;
							} else {
	                         		
        	row3.PONOT3 = routines.system.JDBCUtil.getString(rs_tDBInput_2, 35, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 36) {
								row3.POCOST = null;
							} else {
		                          
            row3.POCOST = rs_tDBInput_2.getBigDecimal(36);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 37) {
								row3.POVAT = null;
							} else {
		                          
            row3.POVAT = rs_tDBInput_2.getBigDecimal(37);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 38) {
								row3.PORETL = null;
							} else {
		                          
            row3.PORETL = rs_tDBInput_2.getBigDecimal(38);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 39) {
								row3.POCASE = null;
							} else {
		                          
            row3.POCASE = rs_tDBInput_2.getBigDecimal(39);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 40) {
								row3.POUNTS = null;
							} else {
		                          
            row3.POUNTS = rs_tDBInput_2.getBigDecimal(40);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 41) {
								row3.POWGHT = null;
							} else {
		                          
            row3.POWGHT = rs_tDBInput_2.getBigDecimal(41);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 42) {
								row3.POTARP = null;
							} else {
		                          
            row3.POTARP = rs_tDBInput_2.getBigDecimal(42);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 43) {
								row3.POSTOP = null;
							} else {
		                          
            row3.POSTOP = rs_tDBInput_2.getBigDecimal(43);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 44) {
								row3.POSKID = null;
							} else {
		                          
            row3.POSKID = rs_tDBInput_2.getBigDecimal(44);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 45) {
								row3.POOTHN = null;
							} else {
		                          
            row3.POOTHN = rs_tDBInput_2.getBigDecimal(45);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 46) {
								row3.POOTHP = null;
							} else {
		                          
            row3.POOTHP = rs_tDBInput_2.getBigDecimal(46);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 47) {
								row3.POBTCH = null;
							} else {
		                          
            row3.POBTCH = rs_tDBInput_2.getBigDecimal(47);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 48) {
								row3.PORRET = null;
							} else {
		                          
            row3.PORRET = rs_tDBInput_2.getBigDecimal(48);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 49) {
								row3.PORVAT = null;
							} else {
		                          
            row3.PORVAT = rs_tDBInput_2.getBigDecimal(49);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 50) {
								row3.PORCST = null;
							} else {
		                          
            row3.PORCST = rs_tDBInput_2.getBigDecimal(50);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 51) {
								row3.POTPLT = null;
							} else {
		                          
            row3.POTPLT = rs_tDBInput_2.getBigDecimal(51);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 52) {
								row3.POCUBE = null;
							} else {
		                          
            row3.POCUBE = rs_tDBInput_2.getBigDecimal(52);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 53) {
								row3.POPDWN = 0;
							} else {
		                          
            row3.POPDWN = rs_tDBInput_2.getFloat(53);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 54) {
								row3.SHPNUM = 0;
							} else {
		                          
            row3.SHPNUM = rs_tDBInput_2.getFloat(54);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 55) {
								row3.POPYCN = null;
							} else {
		                          
            row3.POPYCN = rs_tDBInput_2.getBigDecimal(55);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 56) {
								row3.POPYDT = 0;
							} else {
		                          
            row3.POPYDT = rs_tDBInput_2.getFloat(56);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 57) {
								row3.POMALS = null;
							} else {
		                          
            row3.POMALS = rs_tDBInput_2.getBigDecimal(57);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 58) {
								row3.POMALV = null;
							} else {
		                          
            row3.POMALV = rs_tDBInput_2.getBigDecimal(58);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 59) {
								row3.POMSPO = 0;
							} else {
		                          
            row3.POMSPO = rs_tDBInput_2.getFloat(59);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 60) {
								row3.POMSBO = 0;
							} else {
		                          
            row3.POMSBO = rs_tDBInput_2.getFloat(60);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 61) {
								row3.POLOAD = 0;
							} else {
		                          
            row3.POLOAD = rs_tDBInput_2.getFloat(61);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 62) {
								row3.POMCRT = null;
							} else {
		                          
            row3.POMCRT = rs_tDBInput_2.getBigDecimal(62);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 63) {
								row3.POMCDT = null;
							} else {
		                          
            row3.POMCDT = rs_tDBInput_2.getBigDecimal(63);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 64) {
								row3.POQCKE = null;
							} else {
	                         		
        	row3.POQCKE = routines.system.JDBCUtil.getString(rs_tDBInput_2, 64, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 65) {
								row3.POMTYP = null;
							} else {
	                         		
        	row3.POMTYP = routines.system.JDBCUtil.getString(rs_tDBInput_2, 65, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 66) {
								row3.PO850F = null;
							} else {
	                         		
        	row3.PO850F = routines.system.JDBCUtil.getString(rs_tDBInput_2, 66, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 67) {
								row3.PO860F = null;
							} else {
	                         		
        	row3.PO860F = routines.system.JDBCUtil.getString(rs_tDBInput_2, 67, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 68) {
								row3.POTPID = null;
							} else {
	                         		
        	row3.POTPID = routines.system.JDBCUtil.getString(rs_tDBInput_2, 68, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 69) {
								row3.POBSDT = 0;
							} else {
		                          
            row3.POBSDT = rs_tDBInput_2.getFloat(69);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 70) {
								row3.POASDT = 0;
							} else {
		                          
            row3.POASDT = rs_tDBInput_2.getFloat(70);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 71) {
								row3.POCODF = null;
							} else {
	                         		
        	row3.POCODF = routines.system.JDBCUtil.getString(rs_tDBInput_2, 71, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 72) {
								row3.POCODT = null;
							} else {
	                         		
        	row3.POCODT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 72, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 73) {
								row3.POCVTP = null;
							} else {
	                         		
        	row3.POCVTP = routines.system.JDBCUtil.getString(rs_tDBInput_2, 73, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 74) {
								row3.POCVMD = null;
							} else {
	                         		
        	row3.POCVMD = routines.system.JDBCUtil.getString(rs_tDBInput_2, 74, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 75) {
								row3.POMCPY = null;
							} else {
	                         		
        	row3.POMCPY = routines.system.JDBCUtil.getString(rs_tDBInput_2, 75, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 76) {
								row3.POUSER = null;
							} else {
	                         		
        	row3.POUSER = routines.system.JDBCUtil.getString(rs_tDBInput_2, 76, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 77) {
								row3.DATCUR = null;
							} else {
		                          
            row3.DATCUR = rs_tDBInput_2.getBigDecimal(77);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 78) {
								row3.DATTIM = null;
							} else {
		                          
            row3.DATTIM = rs_tDBInput_2.getBigDecimal(78);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
					
						log.debug("tDBInput_2 - Retrieving the record " + nb_line_tDBInput_2 + ".");
					



 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tDBInput_2","tDBInput_2","tAS400Input","tFileOutputDelimited_2","tFileOutputDelimited_2","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                        sb_tFileOutputDelimited_2.append(
                            row3.PONUMB
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POBON
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POVNUM
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POTRMS
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POTIND != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POTIND
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSTAT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSTAT
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POTYPE != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POTYPE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PODEST != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PODEST
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSTOR != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSTOR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POADYN != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POADYN
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PODMTH != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PODMTH
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POALBO != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POALBO
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCONF != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCONF
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POPHON != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POPHON
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POBUYR != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POBUYR
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.PODPT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POSDPT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POTHER
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POFPCD != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POFPCD
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POFOB != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POFOB
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSHP1 != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSHP1
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSHP2 != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSHP2
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSHPP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSHPP
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSHPC != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSHPC
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POEDAT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POSDAT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POCDAT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.PORDAT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POLCHG
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.PORFRQ
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POLEAD
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POORIG != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POORIG
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PONOT1 != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PONOT1
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PONOT2 != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PONOT2
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PONOT3 != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PONOT3
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCOST != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCOST.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POVAT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POVAT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PORETL != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PORETL.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCASE != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCASE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POUNTS != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POUNTS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POWGHT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POWGHT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POTARP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POTARP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSTOP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSTOP.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POSKID != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POSKID.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POOTHN != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POOTHN.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POOTHP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POOTHP.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POBTCH != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POBTCH.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PORRET != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PORRET.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PORVAT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PORVAT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PORCST != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PORCST.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POTPLT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POTPLT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCUBE != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCUBE.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POPDWN
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.SHPNUM
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POPYCN != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POPYCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POPYDT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMALS != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMALS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMALV != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMALV.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POMSPO
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POMSBO
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POLOAD
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMCRT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMCRT.setScale(8, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMCDT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMCDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POQCKE != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POQCKE
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMTYP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMTYP
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PO850F != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PO850F
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.PO860F != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.PO860F
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POTPID != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POTPID
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POBSDT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                        sb_tFileOutputDelimited_2.append(
                            row3.POASDT
                        );
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCODF != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCODF
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCODT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCODT
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCVTP != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCVTP
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POCVMD != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POCVMD
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POMCPY != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POMCPY
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.POUSER != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.POUSER
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.DATCUR != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.DATCUR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row3.DATTIM != null) {
                        sb_tFileOutputDelimited_2.append(
                            row3.DATTIM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                    sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_2++;
                    resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

                        outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());
                        log.debug("tFileOutputDelimited_2 - Writing the record " + nb_line_tFileOutputDelimited_2 + ".");

                    }



 


	tos_count_tFileOutputDelimited_2++;

/**
 * [tFileOutputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	

 



/**
 * [tFileOutputDelimited_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	

 



/**
 * [tFileOutputDelimited_2 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
		if(conn_tDBInput_2 != null && !conn_tDBInput_2.isClosed()) {
			
	    		log.debug("tDBInput_2 - Closing the connection to the database.");
			
			conn_tDBInput_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBInput_2 - Connection to the database closed.");
			
		}
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
	    		log.debug("tDBInput_2 - Retrieved records count: "+nb_line_tDBInput_2 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tDBInput_2 - "  + ("Done.") );

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_2!=null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}
				
				globalMap.put("tFileOutputDelimited_2_NB_LINE",nb_line_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_2", true);
	
				log.debug("tFileOutputDelimited_2 - Written records count: " + nb_line_tFileOutputDelimited_2 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBInput_2","tDBInput_2","tAS400Input","tFileOutputDelimited_2","tFileOutputDelimited_2","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_2", true);
end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_2 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk2", 0, "ok");
								} 
							
							tFileInputDelimited_2Process(globalMap); 
						



	
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";
	
	

 



/**
 * [tDBInput_2 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_2") == null){ 
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_2");
						if(outtFileOutputDelimited_2!=null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}
					
				
				}
			
			
		}
	

 



/**
 * [tFileOutputDelimited_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class POMHDHStruct implements routines.system.IPersistableRow<POMHDHStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public Double PONUMB;

				public Double getPONUMB () {
					return this.PONUMB;
				}

				public Boolean PONUMBIsNullable(){
				    return true;
				}
				public Boolean PONUMBIsKey(){
				    return false;
				}
				public Integer PONUMBLength(){
				    return null;
				}
				public Integer PONUMBPrecision(){
				    return null;
				}
				public String PONUMBDefault(){
				
					return "";
				
				}
				public String PONUMBComment(){
				
				    return "";
				
				}
				public String PONUMBPattern(){
				
					return "";
				
				}
				public String PONUMBOriginalDbColumnName(){
				
					return "PONUMB";
				
				}

				
			    public Double POBON;

				public Double getPOBON () {
					return this.POBON;
				}

				public Boolean POBONIsNullable(){
				    return true;
				}
				public Boolean POBONIsKey(){
				    return false;
				}
				public Integer POBONLength(){
				    return null;
				}
				public Integer POBONPrecision(){
				    return null;
				}
				public String POBONDefault(){
				
					return "";
				
				}
				public String POBONComment(){
				
				    return "";
				
				}
				public String POBONPattern(){
				
					return "";
				
				}
				public String POBONOriginalDbColumnName(){
				
					return "POBON";
				
				}

				
			    public Double POVNUM;

				public Double getPOVNUM () {
					return this.POVNUM;
				}

				public Boolean POVNUMIsNullable(){
				    return true;
				}
				public Boolean POVNUMIsKey(){
				    return false;
				}
				public Integer POVNUMLength(){
				    return null;
				}
				public Integer POVNUMPrecision(){
				    return null;
				}
				public String POVNUMDefault(){
				
					return "";
				
				}
				public String POVNUMComment(){
				
				    return "";
				
				}
				public String POVNUMPattern(){
				
					return "";
				
				}
				public String POVNUMOriginalDbColumnName(){
				
					return "POVNUM";
				
				}

				
			    public Double POTRMS;

				public Double getPOTRMS () {
					return this.POTRMS;
				}

				public Boolean POTRMSIsNullable(){
				    return true;
				}
				public Boolean POTRMSIsKey(){
				    return false;
				}
				public Integer POTRMSLength(){
				    return null;
				}
				public Integer POTRMSPrecision(){
				    return null;
				}
				public String POTRMSDefault(){
				
					return "";
				
				}
				public String POTRMSComment(){
				
				    return "";
				
				}
				public String POTRMSPattern(){
				
					return "";
				
				}
				public String POTRMSOriginalDbColumnName(){
				
					return "POTRMS";
				
				}

				
			    public String POTIND;

				public String getPOTIND () {
					return this.POTIND;
				}

				public Boolean POTINDIsNullable(){
				    return true;
				}
				public Boolean POTINDIsKey(){
				    return false;
				}
				public Integer POTINDLength(){
				    return null;
				}
				public Integer POTINDPrecision(){
				    return null;
				}
				public String POTINDDefault(){
				
					return null;
				
				}
				public String POTINDComment(){
				
				    return "";
				
				}
				public String POTINDPattern(){
				
					return "";
				
				}
				public String POTINDOriginalDbColumnName(){
				
					return "POTIND";
				
				}

				
			    public String POSTAT;

				public String getPOSTAT () {
					return this.POSTAT;
				}

				public Boolean POSTATIsNullable(){
				    return true;
				}
				public Boolean POSTATIsKey(){
				    return false;
				}
				public Integer POSTATLength(){
				    return null;
				}
				public Integer POSTATPrecision(){
				    return null;
				}
				public String POSTATDefault(){
				
					return null;
				
				}
				public String POSTATComment(){
				
				    return "";
				
				}
				public String POSTATPattern(){
				
					return "";
				
				}
				public String POSTATOriginalDbColumnName(){
				
					return "POSTAT";
				
				}

				
			    public String POTYPE;

				public String getPOTYPE () {
					return this.POTYPE;
				}

				public Boolean POTYPEIsNullable(){
				    return true;
				}
				public Boolean POTYPEIsKey(){
				    return false;
				}
				public Integer POTYPELength(){
				    return null;
				}
				public Integer POTYPEPrecision(){
				    return null;
				}
				public String POTYPEDefault(){
				
					return null;
				
				}
				public String POTYPEComment(){
				
				    return "";
				
				}
				public String POTYPEPattern(){
				
					return "";
				
				}
				public String POTYPEOriginalDbColumnName(){
				
					return "POTYPE";
				
				}

				
			    public String PODEST;

				public String getPODEST () {
					return this.PODEST;
				}

				public Boolean PODESTIsNullable(){
				    return true;
				}
				public Boolean PODESTIsKey(){
				    return false;
				}
				public Integer PODESTLength(){
				    return null;
				}
				public Integer PODESTPrecision(){
				    return null;
				}
				public String PODESTDefault(){
				
					return null;
				
				}
				public String PODESTComment(){
				
				    return "";
				
				}
				public String PODESTPattern(){
				
					return "";
				
				}
				public String PODESTOriginalDbColumnName(){
				
					return "PODEST";
				
				}

				
			    public String POSTOR;

				public String getPOSTOR () {
					return this.POSTOR;
				}

				public Boolean POSTORIsNullable(){
				    return true;
				}
				public Boolean POSTORIsKey(){
				    return false;
				}
				public Integer POSTORLength(){
				    return null;
				}
				public Integer POSTORPrecision(){
				    return null;
				}
				public String POSTORDefault(){
				
					return null;
				
				}
				public String POSTORComment(){
				
				    return "";
				
				}
				public String POSTORPattern(){
				
					return "";
				
				}
				public String POSTOROriginalDbColumnName(){
				
					return "POSTOR";
				
				}

				
			    public String POADYN;

				public String getPOADYN () {
					return this.POADYN;
				}

				public Boolean POADYNIsNullable(){
				    return true;
				}
				public Boolean POADYNIsKey(){
				    return false;
				}
				public Integer POADYNLength(){
				    return null;
				}
				public Integer POADYNPrecision(){
				    return null;
				}
				public String POADYNDefault(){
				
					return null;
				
				}
				public String POADYNComment(){
				
				    return "";
				
				}
				public String POADYNPattern(){
				
					return "";
				
				}
				public String POADYNOriginalDbColumnName(){
				
					return "POADYN";
				
				}

				
			    public String PODMTH;

				public String getPODMTH () {
					return this.PODMTH;
				}

				public Boolean PODMTHIsNullable(){
				    return true;
				}
				public Boolean PODMTHIsKey(){
				    return false;
				}
				public Integer PODMTHLength(){
				    return null;
				}
				public Integer PODMTHPrecision(){
				    return null;
				}
				public String PODMTHDefault(){
				
					return null;
				
				}
				public String PODMTHComment(){
				
				    return "";
				
				}
				public String PODMTHPattern(){
				
					return "";
				
				}
				public String PODMTHOriginalDbColumnName(){
				
					return "PODMTH";
				
				}

				
			    public String POALBO;

				public String getPOALBO () {
					return this.POALBO;
				}

				public Boolean POALBOIsNullable(){
				    return true;
				}
				public Boolean POALBOIsKey(){
				    return false;
				}
				public Integer POALBOLength(){
				    return null;
				}
				public Integer POALBOPrecision(){
				    return null;
				}
				public String POALBODefault(){
				
					return null;
				
				}
				public String POALBOComment(){
				
				    return "";
				
				}
				public String POALBOPattern(){
				
					return "";
				
				}
				public String POALBOOriginalDbColumnName(){
				
					return "POALBO";
				
				}

				
			    public String POCONF;

				public String getPOCONF () {
					return this.POCONF;
				}

				public Boolean POCONFIsNullable(){
				    return true;
				}
				public Boolean POCONFIsKey(){
				    return false;
				}
				public Integer POCONFLength(){
				    return null;
				}
				public Integer POCONFPrecision(){
				    return null;
				}
				public String POCONFDefault(){
				
					return null;
				
				}
				public String POCONFComment(){
				
				    return "";
				
				}
				public String POCONFPattern(){
				
					return "";
				
				}
				public String POCONFOriginalDbColumnName(){
				
					return "POCONF";
				
				}

				
			    public String POPHON;

				public String getPOPHON () {
					return this.POPHON;
				}

				public Boolean POPHONIsNullable(){
				    return true;
				}
				public Boolean POPHONIsKey(){
				    return false;
				}
				public Integer POPHONLength(){
				    return null;
				}
				public Integer POPHONPrecision(){
				    return null;
				}
				public String POPHONDefault(){
				
					return null;
				
				}
				public String POPHONComment(){
				
				    return "";
				
				}
				public String POPHONPattern(){
				
					return "";
				
				}
				public String POPHONOriginalDbColumnName(){
				
					return "POPHON";
				
				}

				
			    public String POBUYR;

				public String getPOBUYR () {
					return this.POBUYR;
				}

				public Boolean POBUYRIsNullable(){
				    return true;
				}
				public Boolean POBUYRIsKey(){
				    return false;
				}
				public Integer POBUYRLength(){
				    return null;
				}
				public Integer POBUYRPrecision(){
				    return null;
				}
				public String POBUYRDefault(){
				
					return null;
				
				}
				public String POBUYRComment(){
				
				    return "";
				
				}
				public String POBUYRPattern(){
				
					return "";
				
				}
				public String POBUYROriginalDbColumnName(){
				
					return "POBUYR";
				
				}

				
			    public String PODPT;

				public String getPODPT () {
					return this.PODPT;
				}

				public Boolean PODPTIsNullable(){
				    return true;
				}
				public Boolean PODPTIsKey(){
				    return false;
				}
				public Integer PODPTLength(){
				    return null;
				}
				public Integer PODPTPrecision(){
				    return null;
				}
				public String PODPTDefault(){
				
					return null;
				
				}
				public String PODPTComment(){
				
				    return "";
				
				}
				public String PODPTPattern(){
				
					return "";
				
				}
				public String PODPTOriginalDbColumnName(){
				
					return "PODPT";
				
				}

				
			    public String POSDPT;

				public String getPOSDPT () {
					return this.POSDPT;
				}

				public Boolean POSDPTIsNullable(){
				    return true;
				}
				public Boolean POSDPTIsKey(){
				    return false;
				}
				public Integer POSDPTLength(){
				    return null;
				}
				public Integer POSDPTPrecision(){
				    return null;
				}
				public String POSDPTDefault(){
				
					return null;
				
				}
				public String POSDPTComment(){
				
				    return "";
				
				}
				public String POSDPTPattern(){
				
					return "";
				
				}
				public String POSDPTOriginalDbColumnName(){
				
					return "POSDPT";
				
				}

				
			    public String POTHER;

				public String getPOTHER () {
					return this.POTHER;
				}

				public Boolean POTHERIsNullable(){
				    return true;
				}
				public Boolean POTHERIsKey(){
				    return false;
				}
				public Integer POTHERLength(){
				    return null;
				}
				public Integer POTHERPrecision(){
				    return null;
				}
				public String POTHERDefault(){
				
					return null;
				
				}
				public String POTHERComment(){
				
				    return "";
				
				}
				public String POTHERPattern(){
				
					return "";
				
				}
				public String POTHEROriginalDbColumnName(){
				
					return "POTHER";
				
				}

				
			    public String POFPCD;

				public String getPOFPCD () {
					return this.POFPCD;
				}

				public Boolean POFPCDIsNullable(){
				    return true;
				}
				public Boolean POFPCDIsKey(){
				    return false;
				}
				public Integer POFPCDLength(){
				    return null;
				}
				public Integer POFPCDPrecision(){
				    return null;
				}
				public String POFPCDDefault(){
				
					return null;
				
				}
				public String POFPCDComment(){
				
				    return "";
				
				}
				public String POFPCDPattern(){
				
					return "";
				
				}
				public String POFPCDOriginalDbColumnName(){
				
					return "POFPCD";
				
				}

				
			    public String POFOB;

				public String getPOFOB () {
					return this.POFOB;
				}

				public Boolean POFOBIsNullable(){
				    return true;
				}
				public Boolean POFOBIsKey(){
				    return false;
				}
				public Integer POFOBLength(){
				    return null;
				}
				public Integer POFOBPrecision(){
				    return null;
				}
				public String POFOBDefault(){
				
					return null;
				
				}
				public String POFOBComment(){
				
				    return "";
				
				}
				public String POFOBPattern(){
				
					return "";
				
				}
				public String POFOBOriginalDbColumnName(){
				
					return "POFOB";
				
				}

				
			    public String POSHP1;

				public String getPOSHP1 () {
					return this.POSHP1;
				}

				public Boolean POSHP1IsNullable(){
				    return true;
				}
				public Boolean POSHP1IsKey(){
				    return false;
				}
				public Integer POSHP1Length(){
				    return null;
				}
				public Integer POSHP1Precision(){
				    return null;
				}
				public String POSHP1Default(){
				
					return null;
				
				}
				public String POSHP1Comment(){
				
				    return "";
				
				}
				public String POSHP1Pattern(){
				
					return "";
				
				}
				public String POSHP1OriginalDbColumnName(){
				
					return "POSHP1";
				
				}

				
			    public String POSHP2;

				public String getPOSHP2 () {
					return this.POSHP2;
				}

				public Boolean POSHP2IsNullable(){
				    return true;
				}
				public Boolean POSHP2IsKey(){
				    return false;
				}
				public Integer POSHP2Length(){
				    return null;
				}
				public Integer POSHP2Precision(){
				    return null;
				}
				public String POSHP2Default(){
				
					return null;
				
				}
				public String POSHP2Comment(){
				
				    return "";
				
				}
				public String POSHP2Pattern(){
				
					return "";
				
				}
				public String POSHP2OriginalDbColumnName(){
				
					return "POSHP2";
				
				}

				
			    public String POSHPP;

				public String getPOSHPP () {
					return this.POSHPP;
				}

				public Boolean POSHPPIsNullable(){
				    return true;
				}
				public Boolean POSHPPIsKey(){
				    return false;
				}
				public Integer POSHPPLength(){
				    return null;
				}
				public Integer POSHPPPrecision(){
				    return null;
				}
				public String POSHPPDefault(){
				
					return null;
				
				}
				public String POSHPPComment(){
				
				    return "";
				
				}
				public String POSHPPPattern(){
				
					return "";
				
				}
				public String POSHPPOriginalDbColumnName(){
				
					return "POSHPP";
				
				}

				
			    public String POSHPC;

				public String getPOSHPC () {
					return this.POSHPC;
				}

				public Boolean POSHPCIsNullable(){
				    return true;
				}
				public Boolean POSHPCIsKey(){
				    return false;
				}
				public Integer POSHPCLength(){
				    return null;
				}
				public Integer POSHPCPrecision(){
				    return null;
				}
				public String POSHPCDefault(){
				
					return null;
				
				}
				public String POSHPCComment(){
				
				    return "";
				
				}
				public String POSHPCPattern(){
				
					return "";
				
				}
				public String POSHPCOriginalDbColumnName(){
				
					return "POSHPC";
				
				}

				
			    public Double POEDAT;

				public Double getPOEDAT () {
					return this.POEDAT;
				}

				public Boolean POEDATIsNullable(){
				    return true;
				}
				public Boolean POEDATIsKey(){
				    return false;
				}
				public Integer POEDATLength(){
				    return null;
				}
				public Integer POEDATPrecision(){
				    return null;
				}
				public String POEDATDefault(){
				
					return null;
				
				}
				public String POEDATComment(){
				
				    return "";
				
				}
				public String POEDATPattern(){
				
					return "";
				
				}
				public String POEDATOriginalDbColumnName(){
				
					return "POEDAT";
				
				}

				
			    public Double POSDAT;

				public Double getPOSDAT () {
					return this.POSDAT;
				}

				public Boolean POSDATIsNullable(){
				    return true;
				}
				public Boolean POSDATIsKey(){
				    return false;
				}
				public Integer POSDATLength(){
				    return null;
				}
				public Integer POSDATPrecision(){
				    return null;
				}
				public String POSDATDefault(){
				
					return "";
				
				}
				public String POSDATComment(){
				
				    return "";
				
				}
				public String POSDATPattern(){
				
					return "";
				
				}
				public String POSDATOriginalDbColumnName(){
				
					return "POSDAT";
				
				}

				
			    public Double POCDAT;

				public Double getPOCDAT () {
					return this.POCDAT;
				}

				public Boolean POCDATIsNullable(){
				    return true;
				}
				public Boolean POCDATIsKey(){
				    return false;
				}
				public Integer POCDATLength(){
				    return null;
				}
				public Integer POCDATPrecision(){
				    return null;
				}
				public String POCDATDefault(){
				
					return null;
				
				}
				public String POCDATComment(){
				
				    return "";
				
				}
				public String POCDATPattern(){
				
					return "";
				
				}
				public String POCDATOriginalDbColumnName(){
				
					return "POCDAT";
				
				}

				
			    public Double PORDAT;

				public Double getPORDAT () {
					return this.PORDAT;
				}

				public Boolean PORDATIsNullable(){
				    return true;
				}
				public Boolean PORDATIsKey(){
				    return false;
				}
				public Integer PORDATLength(){
				    return null;
				}
				public Integer PORDATPrecision(){
				    return null;
				}
				public String PORDATDefault(){
				
					return "";
				
				}
				public String PORDATComment(){
				
				    return "";
				
				}
				public String PORDATPattern(){
				
					return "";
				
				}
				public String PORDATOriginalDbColumnName(){
				
					return "PORDAT";
				
				}

				
			    public Double POLCHG;

				public Double getPOLCHG () {
					return this.POLCHG;
				}

				public Boolean POLCHGIsNullable(){
				    return true;
				}
				public Boolean POLCHGIsKey(){
				    return false;
				}
				public Integer POLCHGLength(){
				    return null;
				}
				public Integer POLCHGPrecision(){
				    return null;
				}
				public String POLCHGDefault(){
				
					return "";
				
				}
				public String POLCHGComment(){
				
				    return "";
				
				}
				public String POLCHGPattern(){
				
					return "";
				
				}
				public String POLCHGOriginalDbColumnName(){
				
					return "POLCHG";
				
				}

				
			    public String PORFRQ;

				public String getPORFRQ () {
					return this.PORFRQ;
				}

				public Boolean PORFRQIsNullable(){
				    return true;
				}
				public Boolean PORFRQIsKey(){
				    return false;
				}
				public Integer PORFRQLength(){
				    return null;
				}
				public Integer PORFRQPrecision(){
				    return null;
				}
				public String PORFRQDefault(){
				
					return null;
				
				}
				public String PORFRQComment(){
				
				    return "";
				
				}
				public String PORFRQPattern(){
				
					return "";
				
				}
				public String PORFRQOriginalDbColumnName(){
				
					return "PORFRQ";
				
				}

				
			    public String POLEAD;

				public String getPOLEAD () {
					return this.POLEAD;
				}

				public Boolean POLEADIsNullable(){
				    return true;
				}
				public Boolean POLEADIsKey(){
				    return false;
				}
				public Integer POLEADLength(){
				    return null;
				}
				public Integer POLEADPrecision(){
				    return null;
				}
				public String POLEADDefault(){
				
					return null;
				
				}
				public String POLEADComment(){
				
				    return "";
				
				}
				public String POLEADPattern(){
				
					return "";
				
				}
				public String POLEADOriginalDbColumnName(){
				
					return "POLEAD";
				
				}

				
			    public String POORIG;

				public String getPOORIG () {
					return this.POORIG;
				}

				public Boolean POORIGIsNullable(){
				    return true;
				}
				public Boolean POORIGIsKey(){
				    return false;
				}
				public Integer POORIGLength(){
				    return null;
				}
				public Integer POORIGPrecision(){
				    return null;
				}
				public String POORIGDefault(){
				
					return null;
				
				}
				public String POORIGComment(){
				
				    return "";
				
				}
				public String POORIGPattern(){
				
					return "";
				
				}
				public String POORIGOriginalDbColumnName(){
				
					return "POORIG";
				
				}

				
			    public String PONOT1;

				public String getPONOT1 () {
					return this.PONOT1;
				}

				public Boolean PONOT1IsNullable(){
				    return true;
				}
				public Boolean PONOT1IsKey(){
				    return false;
				}
				public Integer PONOT1Length(){
				    return null;
				}
				public Integer PONOT1Precision(){
				    return null;
				}
				public String PONOT1Default(){
				
					return null;
				
				}
				public String PONOT1Comment(){
				
				    return "";
				
				}
				public String PONOT1Pattern(){
				
					return "";
				
				}
				public String PONOT1OriginalDbColumnName(){
				
					return "PONOT1";
				
				}

				
			    public String PONOT2;

				public String getPONOT2 () {
					return this.PONOT2;
				}

				public Boolean PONOT2IsNullable(){
				    return true;
				}
				public Boolean PONOT2IsKey(){
				    return false;
				}
				public Integer PONOT2Length(){
				    return null;
				}
				public Integer PONOT2Precision(){
				    return null;
				}
				public String PONOT2Default(){
				
					return null;
				
				}
				public String PONOT2Comment(){
				
				    return "";
				
				}
				public String PONOT2Pattern(){
				
					return "";
				
				}
				public String PONOT2OriginalDbColumnName(){
				
					return "PONOT2";
				
				}

				
			    public String PONOT3;

				public String getPONOT3 () {
					return this.PONOT3;
				}

				public Boolean PONOT3IsNullable(){
				    return true;
				}
				public Boolean PONOT3IsKey(){
				    return false;
				}
				public Integer PONOT3Length(){
				    return null;
				}
				public Integer PONOT3Precision(){
				    return null;
				}
				public String PONOT3Default(){
				
					return null;
				
				}
				public String PONOT3Comment(){
				
				    return "";
				
				}
				public String PONOT3Pattern(){
				
					return "";
				
				}
				public String PONOT3OriginalDbColumnName(){
				
					return "PONOT3";
				
				}

				
			    public String POCOST;

				public String getPOCOST () {
					return this.POCOST;
				}

				public Boolean POCOSTIsNullable(){
				    return true;
				}
				public Boolean POCOSTIsKey(){
				    return false;
				}
				public Integer POCOSTLength(){
				    return null;
				}
				public Integer POCOSTPrecision(){
				    return null;
				}
				public String POCOSTDefault(){
				
					return null;
				
				}
				public String POCOSTComment(){
				
				    return "";
				
				}
				public String POCOSTPattern(){
				
					return "";
				
				}
				public String POCOSTOriginalDbColumnName(){
				
					return "POCOST";
				
				}

				
			    public String POVAT;

				public String getPOVAT () {
					return this.POVAT;
				}

				public Boolean POVATIsNullable(){
				    return true;
				}
				public Boolean POVATIsKey(){
				    return false;
				}
				public Integer POVATLength(){
				    return null;
				}
				public Integer POVATPrecision(){
				    return null;
				}
				public String POVATDefault(){
				
					return null;
				
				}
				public String POVATComment(){
				
				    return "";
				
				}
				public String POVATPattern(){
				
					return "";
				
				}
				public String POVATOriginalDbColumnName(){
				
					return "POVAT";
				
				}

				
			    public String PORETL;

				public String getPORETL () {
					return this.PORETL;
				}

				public Boolean PORETLIsNullable(){
				    return true;
				}
				public Boolean PORETLIsKey(){
				    return false;
				}
				public Integer PORETLLength(){
				    return null;
				}
				public Integer PORETLPrecision(){
				    return null;
				}
				public String PORETLDefault(){
				
					return null;
				
				}
				public String PORETLComment(){
				
				    return "";
				
				}
				public String PORETLPattern(){
				
					return "";
				
				}
				public String PORETLOriginalDbColumnName(){
				
					return "PORETL";
				
				}

				
			    public String POCASE;

				public String getPOCASE () {
					return this.POCASE;
				}

				public Boolean POCASEIsNullable(){
				    return true;
				}
				public Boolean POCASEIsKey(){
				    return false;
				}
				public Integer POCASELength(){
				    return null;
				}
				public Integer POCASEPrecision(){
				    return null;
				}
				public String POCASEDefault(){
				
					return null;
				
				}
				public String POCASEComment(){
				
				    return "";
				
				}
				public String POCASEPattern(){
				
					return "";
				
				}
				public String POCASEOriginalDbColumnName(){
				
					return "POCASE";
				
				}

				
			    public String POUNTS;

				public String getPOUNTS () {
					return this.POUNTS;
				}

				public Boolean POUNTSIsNullable(){
				    return true;
				}
				public Boolean POUNTSIsKey(){
				    return false;
				}
				public Integer POUNTSLength(){
				    return null;
				}
				public Integer POUNTSPrecision(){
				    return null;
				}
				public String POUNTSDefault(){
				
					return null;
				
				}
				public String POUNTSComment(){
				
				    return "";
				
				}
				public String POUNTSPattern(){
				
					return "";
				
				}
				public String POUNTSOriginalDbColumnName(){
				
					return "POUNTS";
				
				}

				
			    public String POWGHT;

				public String getPOWGHT () {
					return this.POWGHT;
				}

				public Boolean POWGHTIsNullable(){
				    return true;
				}
				public Boolean POWGHTIsKey(){
				    return false;
				}
				public Integer POWGHTLength(){
				    return null;
				}
				public Integer POWGHTPrecision(){
				    return null;
				}
				public String POWGHTDefault(){
				
					return null;
				
				}
				public String POWGHTComment(){
				
				    return "";
				
				}
				public String POWGHTPattern(){
				
					return "";
				
				}
				public String POWGHTOriginalDbColumnName(){
				
					return "POWGHT";
				
				}

				
			    public String POTARP;

				public String getPOTARP () {
					return this.POTARP;
				}

				public Boolean POTARPIsNullable(){
				    return true;
				}
				public Boolean POTARPIsKey(){
				    return false;
				}
				public Integer POTARPLength(){
				    return null;
				}
				public Integer POTARPPrecision(){
				    return null;
				}
				public String POTARPDefault(){
				
					return null;
				
				}
				public String POTARPComment(){
				
				    return "";
				
				}
				public String POTARPPattern(){
				
					return "";
				
				}
				public String POTARPOriginalDbColumnName(){
				
					return "POTARP";
				
				}

				
			    public String POSTOP;

				public String getPOSTOP () {
					return this.POSTOP;
				}

				public Boolean POSTOPIsNullable(){
				    return true;
				}
				public Boolean POSTOPIsKey(){
				    return false;
				}
				public Integer POSTOPLength(){
				    return null;
				}
				public Integer POSTOPPrecision(){
				    return null;
				}
				public String POSTOPDefault(){
				
					return null;
				
				}
				public String POSTOPComment(){
				
				    return "";
				
				}
				public String POSTOPPattern(){
				
					return "";
				
				}
				public String POSTOPOriginalDbColumnName(){
				
					return "POSTOP";
				
				}

				
			    public String POSKID;

				public String getPOSKID () {
					return this.POSKID;
				}

				public Boolean POSKIDIsNullable(){
				    return true;
				}
				public Boolean POSKIDIsKey(){
				    return false;
				}
				public Integer POSKIDLength(){
				    return null;
				}
				public Integer POSKIDPrecision(){
				    return null;
				}
				public String POSKIDDefault(){
				
					return null;
				
				}
				public String POSKIDComment(){
				
				    return "";
				
				}
				public String POSKIDPattern(){
				
					return "";
				
				}
				public String POSKIDOriginalDbColumnName(){
				
					return "POSKID";
				
				}

				
			    public String POOTHN;

				public String getPOOTHN () {
					return this.POOTHN;
				}

				public Boolean POOTHNIsNullable(){
				    return true;
				}
				public Boolean POOTHNIsKey(){
				    return false;
				}
				public Integer POOTHNLength(){
				    return null;
				}
				public Integer POOTHNPrecision(){
				    return null;
				}
				public String POOTHNDefault(){
				
					return null;
				
				}
				public String POOTHNComment(){
				
				    return "";
				
				}
				public String POOTHNPattern(){
				
					return "";
				
				}
				public String POOTHNOriginalDbColumnName(){
				
					return "POOTHN";
				
				}

				
			    public String POOTHP;

				public String getPOOTHP () {
					return this.POOTHP;
				}

				public Boolean POOTHPIsNullable(){
				    return true;
				}
				public Boolean POOTHPIsKey(){
				    return false;
				}
				public Integer POOTHPLength(){
				    return null;
				}
				public Integer POOTHPPrecision(){
				    return null;
				}
				public String POOTHPDefault(){
				
					return null;
				
				}
				public String POOTHPComment(){
				
				    return "";
				
				}
				public String POOTHPPattern(){
				
					return "";
				
				}
				public String POOTHPOriginalDbColumnName(){
				
					return "POOTHP";
				
				}

				
			    public String POBTCH;

				public String getPOBTCH () {
					return this.POBTCH;
				}

				public Boolean POBTCHIsNullable(){
				    return true;
				}
				public Boolean POBTCHIsKey(){
				    return false;
				}
				public Integer POBTCHLength(){
				    return null;
				}
				public Integer POBTCHPrecision(){
				    return null;
				}
				public String POBTCHDefault(){
				
					return null;
				
				}
				public String POBTCHComment(){
				
				    return "";
				
				}
				public String POBTCHPattern(){
				
					return "";
				
				}
				public String POBTCHOriginalDbColumnName(){
				
					return "POBTCH";
				
				}

				
			    public String PORRET;

				public String getPORRET () {
					return this.PORRET;
				}

				public Boolean PORRETIsNullable(){
				    return true;
				}
				public Boolean PORRETIsKey(){
				    return false;
				}
				public Integer PORRETLength(){
				    return null;
				}
				public Integer PORRETPrecision(){
				    return null;
				}
				public String PORRETDefault(){
				
					return null;
				
				}
				public String PORRETComment(){
				
				    return "";
				
				}
				public String PORRETPattern(){
				
					return "";
				
				}
				public String PORRETOriginalDbColumnName(){
				
					return "PORRET";
				
				}

				
			    public String PORVAT;

				public String getPORVAT () {
					return this.PORVAT;
				}

				public Boolean PORVATIsNullable(){
				    return true;
				}
				public Boolean PORVATIsKey(){
				    return false;
				}
				public Integer PORVATLength(){
				    return null;
				}
				public Integer PORVATPrecision(){
				    return null;
				}
				public String PORVATDefault(){
				
					return null;
				
				}
				public String PORVATComment(){
				
				    return "";
				
				}
				public String PORVATPattern(){
				
					return "";
				
				}
				public String PORVATOriginalDbColumnName(){
				
					return "PORVAT";
				
				}

				
			    public String PORCST;

				public String getPORCST () {
					return this.PORCST;
				}

				public Boolean PORCSTIsNullable(){
				    return true;
				}
				public Boolean PORCSTIsKey(){
				    return false;
				}
				public Integer PORCSTLength(){
				    return null;
				}
				public Integer PORCSTPrecision(){
				    return null;
				}
				public String PORCSTDefault(){
				
					return null;
				
				}
				public String PORCSTComment(){
				
				    return "";
				
				}
				public String PORCSTPattern(){
				
					return "";
				
				}
				public String PORCSTOriginalDbColumnName(){
				
					return "PORCST";
				
				}

				
			    public String POTPLT;

				public String getPOTPLT () {
					return this.POTPLT;
				}

				public Boolean POTPLTIsNullable(){
				    return true;
				}
				public Boolean POTPLTIsKey(){
				    return false;
				}
				public Integer POTPLTLength(){
				    return null;
				}
				public Integer POTPLTPrecision(){
				    return null;
				}
				public String POTPLTDefault(){
				
					return null;
				
				}
				public String POTPLTComment(){
				
				    return "";
				
				}
				public String POTPLTPattern(){
				
					return "";
				
				}
				public String POTPLTOriginalDbColumnName(){
				
					return "POTPLT";
				
				}

				
			    public String POCUBE;

				public String getPOCUBE () {
					return this.POCUBE;
				}

				public Boolean POCUBEIsNullable(){
				    return true;
				}
				public Boolean POCUBEIsKey(){
				    return false;
				}
				public Integer POCUBELength(){
				    return null;
				}
				public Integer POCUBEPrecision(){
				    return null;
				}
				public String POCUBEDefault(){
				
					return null;
				
				}
				public String POCUBEComment(){
				
				    return "";
				
				}
				public String POCUBEPattern(){
				
					return "";
				
				}
				public String POCUBEOriginalDbColumnName(){
				
					return "POCUBE";
				
				}

				
			    public String POPDWN;

				public String getPOPDWN () {
					return this.POPDWN;
				}

				public Boolean POPDWNIsNullable(){
				    return true;
				}
				public Boolean POPDWNIsKey(){
				    return false;
				}
				public Integer POPDWNLength(){
				    return null;
				}
				public Integer POPDWNPrecision(){
				    return null;
				}
				public String POPDWNDefault(){
				
					return null;
				
				}
				public String POPDWNComment(){
				
				    return "";
				
				}
				public String POPDWNPattern(){
				
					return "";
				
				}
				public String POPDWNOriginalDbColumnName(){
				
					return "POPDWN";
				
				}

				
			    public String SHPNUM;

				public String getSHPNUM () {
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
				
					return null;
				
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

				
			    public Double POPYCN;

				public Double getPOPYCN () {
					return this.POPYCN;
				}

				public Boolean POPYCNIsNullable(){
				    return true;
				}
				public Boolean POPYCNIsKey(){
				    return false;
				}
				public Integer POPYCNLength(){
				    return null;
				}
				public Integer POPYCNPrecision(){
				    return null;
				}
				public String POPYCNDefault(){
				
					return null;
				
				}
				public String POPYCNComment(){
				
				    return "";
				
				}
				public String POPYCNPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POPYCNOriginalDbColumnName(){
				
					return "POPYCN";
				
				}

				
			    public String POPYDT;

				public String getPOPYDT () {
					return this.POPYDT;
				}

				public Boolean POPYDTIsNullable(){
				    return true;
				}
				public Boolean POPYDTIsKey(){
				    return false;
				}
				public Integer POPYDTLength(){
				    return null;
				}
				public Integer POPYDTPrecision(){
				    return null;
				}
				public String POPYDTDefault(){
				
					return null;
				
				}
				public String POPYDTComment(){
				
				    return "";
				
				}
				public String POPYDTPattern(){
				
					return "";
				
				}
				public String POPYDTOriginalDbColumnName(){
				
					return "POPYDT";
				
				}

				
			    public String POMALS;

				public String getPOMALS () {
					return this.POMALS;
				}

				public Boolean POMALSIsNullable(){
				    return true;
				}
				public Boolean POMALSIsKey(){
				    return false;
				}
				public Integer POMALSLength(){
				    return null;
				}
				public Integer POMALSPrecision(){
				    return null;
				}
				public String POMALSDefault(){
				
					return null;
				
				}
				public String POMALSComment(){
				
				    return "";
				
				}
				public String POMALSPattern(){
				
					return "";
				
				}
				public String POMALSOriginalDbColumnName(){
				
					return "POMALS";
				
				}

				
			    public String POMALV;

				public String getPOMALV () {
					return this.POMALV;
				}

				public Boolean POMALVIsNullable(){
				    return true;
				}
				public Boolean POMALVIsKey(){
				    return false;
				}
				public Integer POMALVLength(){
				    return null;
				}
				public Integer POMALVPrecision(){
				    return null;
				}
				public String POMALVDefault(){
				
					return null;
				
				}
				public String POMALVComment(){
				
				    return "";
				
				}
				public String POMALVPattern(){
				
					return "";
				
				}
				public String POMALVOriginalDbColumnName(){
				
					return "POMALV";
				
				}

				
			    public String POMSPO;

				public String getPOMSPO () {
					return this.POMSPO;
				}

				public Boolean POMSPOIsNullable(){
				    return true;
				}
				public Boolean POMSPOIsKey(){
				    return false;
				}
				public Integer POMSPOLength(){
				    return null;
				}
				public Integer POMSPOPrecision(){
				    return null;
				}
				public String POMSPODefault(){
				
					return null;
				
				}
				public String POMSPOComment(){
				
				    return "";
				
				}
				public String POMSPOPattern(){
				
					return "";
				
				}
				public String POMSPOOriginalDbColumnName(){
				
					return "POMSPO";
				
				}

				
			    public String POMSBO;

				public String getPOMSBO () {
					return this.POMSBO;
				}

				public Boolean POMSBOIsNullable(){
				    return true;
				}
				public Boolean POMSBOIsKey(){
				    return false;
				}
				public Integer POMSBOLength(){
				    return null;
				}
				public Integer POMSBOPrecision(){
				    return null;
				}
				public String POMSBODefault(){
				
					return null;
				
				}
				public String POMSBOComment(){
				
				    return "";
				
				}
				public String POMSBOPattern(){
				
					return "";
				
				}
				public String POMSBOOriginalDbColumnName(){
				
					return "POMSBO";
				
				}

				
			    public String POLOAD;

				public String getPOLOAD () {
					return this.POLOAD;
				}

				public Boolean POLOADIsNullable(){
				    return true;
				}
				public Boolean POLOADIsKey(){
				    return false;
				}
				public Integer POLOADLength(){
				    return null;
				}
				public Integer POLOADPrecision(){
				    return null;
				}
				public String POLOADDefault(){
				
					return null;
				
				}
				public String POLOADComment(){
				
				    return "";
				
				}
				public String POLOADPattern(){
				
					return "";
				
				}
				public String POLOADOriginalDbColumnName(){
				
					return "POLOAD";
				
				}

				
			    public String POMCRT;

				public String getPOMCRT () {
					return this.POMCRT;
				}

				public Boolean POMCRTIsNullable(){
				    return true;
				}
				public Boolean POMCRTIsKey(){
				    return false;
				}
				public Integer POMCRTLength(){
				    return null;
				}
				public Integer POMCRTPrecision(){
				    return null;
				}
				public String POMCRTDefault(){
				
					return null;
				
				}
				public String POMCRTComment(){
				
				    return "";
				
				}
				public String POMCRTPattern(){
				
					return "";
				
				}
				public String POMCRTOriginalDbColumnName(){
				
					return "POMCRT";
				
				}

				
			    public String POMCDT;

				public String getPOMCDT () {
					return this.POMCDT;
				}

				public Boolean POMCDTIsNullable(){
				    return true;
				}
				public Boolean POMCDTIsKey(){
				    return false;
				}
				public Integer POMCDTLength(){
				    return null;
				}
				public Integer POMCDTPrecision(){
				    return null;
				}
				public String POMCDTDefault(){
				
					return null;
				
				}
				public String POMCDTComment(){
				
				    return "";
				
				}
				public String POMCDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POMCDTOriginalDbColumnName(){
				
					return "POMCDT";
				
				}

				
			    public String POQCKE;

				public String getPOQCKE () {
					return this.POQCKE;
				}

				public Boolean POQCKEIsNullable(){
				    return true;
				}
				public Boolean POQCKEIsKey(){
				    return false;
				}
				public Integer POQCKELength(){
				    return null;
				}
				public Integer POQCKEPrecision(){
				    return null;
				}
				public String POQCKEDefault(){
				
					return null;
				
				}
				public String POQCKEComment(){
				
				    return "";
				
				}
				public String POQCKEPattern(){
				
					return "";
				
				}
				public String POQCKEOriginalDbColumnName(){
				
					return "POQCKE";
				
				}

				
			    public String POMTYP;

				public String getPOMTYP () {
					return this.POMTYP;
				}

				public Boolean POMTYPIsNullable(){
				    return true;
				}
				public Boolean POMTYPIsKey(){
				    return false;
				}
				public Integer POMTYPLength(){
				    return null;
				}
				public Integer POMTYPPrecision(){
				    return null;
				}
				public String POMTYPDefault(){
				
					return null;
				
				}
				public String POMTYPComment(){
				
				    return "";
				
				}
				public String POMTYPPattern(){
				
					return "";
				
				}
				public String POMTYPOriginalDbColumnName(){
				
					return "POMTYP";
				
				}

				
			    public String PO850F;

				public String getPO850F () {
					return this.PO850F;
				}

				public Boolean PO850FIsNullable(){
				    return true;
				}
				public Boolean PO850FIsKey(){
				    return false;
				}
				public Integer PO850FLength(){
				    return null;
				}
				public Integer PO850FPrecision(){
				    return null;
				}
				public String PO850FDefault(){
				
					return null;
				
				}
				public String PO850FComment(){
				
				    return "";
				
				}
				public String PO850FPattern(){
				
					return "";
				
				}
				public String PO850FOriginalDbColumnName(){
				
					return "PO850F";
				
				}

				
			    public String PO860F;

				public String getPO860F () {
					return this.PO860F;
				}

				public Boolean PO860FIsNullable(){
				    return true;
				}
				public Boolean PO860FIsKey(){
				    return false;
				}
				public Integer PO860FLength(){
				    return null;
				}
				public Integer PO860FPrecision(){
				    return null;
				}
				public String PO860FDefault(){
				
					return null;
				
				}
				public String PO860FComment(){
				
				    return "";
				
				}
				public String PO860FPattern(){
				
					return "";
				
				}
				public String PO860FOriginalDbColumnName(){
				
					return "PO860F";
				
				}

				
			    public String POTPID;

				public String getPOTPID () {
					return this.POTPID;
				}

				public Boolean POTPIDIsNullable(){
				    return true;
				}
				public Boolean POTPIDIsKey(){
				    return false;
				}
				public Integer POTPIDLength(){
				    return null;
				}
				public Integer POTPIDPrecision(){
				    return null;
				}
				public String POTPIDDefault(){
				
					return null;
				
				}
				public String POTPIDComment(){
				
				    return "";
				
				}
				public String POTPIDPattern(){
				
					return "";
				
				}
				public String POTPIDOriginalDbColumnName(){
				
					return "POTPID";
				
				}

				
			    public Double POBSDT;

				public Double getPOBSDT () {
					return this.POBSDT;
				}

				public Boolean POBSDTIsNullable(){
				    return true;
				}
				public Boolean POBSDTIsKey(){
				    return false;
				}
				public Integer POBSDTLength(){
				    return null;
				}
				public Integer POBSDTPrecision(){
				    return null;
				}
				public String POBSDTDefault(){
				
					return null;
				
				}
				public String POBSDTComment(){
				
				    return "";
				
				}
				public String POBSDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POBSDTOriginalDbColumnName(){
				
					return "POBSDT";
				
				}

				
			    public Double POASDT;

				public Double getPOASDT () {
					return this.POASDT;
				}

				public Boolean POASDTIsNullable(){
				    return true;
				}
				public Boolean POASDTIsKey(){
				    return false;
				}
				public Integer POASDTLength(){
				    return null;
				}
				public Integer POASDTPrecision(){
				    return null;
				}
				public String POASDTDefault(){
				
					return null;
				
				}
				public String POASDTComment(){
				
				    return "";
				
				}
				public String POASDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POASDTOriginalDbColumnName(){
				
					return "POASDT";
				
				}

				
			    public String POCODF;

				public String getPOCODF () {
					return this.POCODF;
				}

				public Boolean POCODFIsNullable(){
				    return true;
				}
				public Boolean POCODFIsKey(){
				    return false;
				}
				public Integer POCODFLength(){
				    return null;
				}
				public Integer POCODFPrecision(){
				    return null;
				}
				public String POCODFDefault(){
				
					return null;
				
				}
				public String POCODFComment(){
				
				    return "";
				
				}
				public String POCODFPattern(){
				
					return "";
				
				}
				public String POCODFOriginalDbColumnName(){
				
					return "POCODF";
				
				}

				
			    public String POCODT;

				public String getPOCODT () {
					return this.POCODT;
				}

				public Boolean POCODTIsNullable(){
				    return true;
				}
				public Boolean POCODTIsKey(){
				    return false;
				}
				public Integer POCODTLength(){
				    return null;
				}
				public Integer POCODTPrecision(){
				    return null;
				}
				public String POCODTDefault(){
				
					return null;
				
				}
				public String POCODTComment(){
				
				    return "";
				
				}
				public String POCODTPattern(){
				
					return "";
				
				}
				public String POCODTOriginalDbColumnName(){
				
					return "POCODT";
				
				}

				
			    public String POCVTP;

				public String getPOCVTP () {
					return this.POCVTP;
				}

				public Boolean POCVTPIsNullable(){
				    return true;
				}
				public Boolean POCVTPIsKey(){
				    return false;
				}
				public Integer POCVTPLength(){
				    return null;
				}
				public Integer POCVTPPrecision(){
				    return null;
				}
				public String POCVTPDefault(){
				
					return null;
				
				}
				public String POCVTPComment(){
				
				    return "";
				
				}
				public String POCVTPPattern(){
				
					return "";
				
				}
				public String POCVTPOriginalDbColumnName(){
				
					return "POCVTP";
				
				}

				
			    public String POCVMD;

				public String getPOCVMD () {
					return this.POCVMD;
				}

				public Boolean POCVMDIsNullable(){
				    return true;
				}
				public Boolean POCVMDIsKey(){
				    return false;
				}
				public Integer POCVMDLength(){
				    return null;
				}
				public Integer POCVMDPrecision(){
				    return null;
				}
				public String POCVMDDefault(){
				
					return null;
				
				}
				public String POCVMDComment(){
				
				    return "";
				
				}
				public String POCVMDPattern(){
				
					return "";
				
				}
				public String POCVMDOriginalDbColumnName(){
				
					return "POCVMD";
				
				}

				
			    public String POMCPY;

				public String getPOMCPY () {
					return this.POMCPY;
				}

				public Boolean POMCPYIsNullable(){
				    return true;
				}
				public Boolean POMCPYIsKey(){
				    return false;
				}
				public Integer POMCPYLength(){
				    return null;
				}
				public Integer POMCPYPrecision(){
				    return null;
				}
				public String POMCPYDefault(){
				
					return null;
				
				}
				public String POMCPYComment(){
				
				    return "";
				
				}
				public String POMCPYPattern(){
				
					return "";
				
				}
				public String POMCPYOriginalDbColumnName(){
				
					return "POMCPY";
				
				}

				
			    public String POUSER;

				public String getPOUSER () {
					return this.POUSER;
				}

				public Boolean POUSERIsNullable(){
				    return true;
				}
				public Boolean POUSERIsKey(){
				    return false;
				}
				public Integer POUSERLength(){
				    return null;
				}
				public Integer POUSERPrecision(){
				    return null;
				}
				public String POUSERDefault(){
				
					return null;
				
				}
				public String POUSERComment(){
				
				    return "";
				
				}
				public String POUSERPattern(){
				
					return "";
				
				}
				public String POUSEROriginalDbColumnName(){
				
					return "POUSER";
				
				}

				
			    public Double DATCUR;

				public Double getDATCUR () {
					return this.DATCUR;
				}

				public Boolean DATCURIsNullable(){
				    return true;
				}
				public Boolean DATCURIsKey(){
				    return false;
				}
				public Integer DATCURLength(){
				    return null;
				}
				public Integer DATCURPrecision(){
				    return null;
				}
				public String DATCURDefault(){
				
					return null;
				
				}
				public String DATCURComment(){
				
				    return "";
				
				}
				public String DATCURPattern(){
				
					return "";
				
				}
				public String DATCUROriginalDbColumnName(){
				
					return "DATCUR";
				
				}

				
			    public Double DATTIM;

				public Double getDATTIM () {
					return this.DATTIM;
				}

				public Boolean DATTIMIsNullable(){
				    return true;
				}
				public Boolean DATTIMIsKey(){
				    return false;
				}
				public Integer DATTIMLength(){
				    return null;
				}
				public Integer DATTIMPrecision(){
				    return null;
				}
				public String DATTIMDefault(){
				
					return null;
				
				}
				public String DATTIMComment(){
				
				    return "";
				
				}
				public String DATTIMPattern(){
				
					return "";
				
				}
				public String DATTIMOriginalDbColumnName(){
				
					return "DATTIM";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PONUMB = null;
           				} else {
           			    	this.PONUMB = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBON = null;
           				} else {
           			    	this.POBON = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POVNUM = null;
           				} else {
           			    	this.POVNUM = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POTRMS = null;
           				} else {
           			    	this.POTRMS = dis.readDouble();
           				}
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
					this.POSTOR = readString(dis);
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
					this.PODPT = readString(dis);
					
					this.POSDPT = readString(dis);
					
					this.POTHER = readString(dis);
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POEDAT = null;
           				} else {
           			    	this.POEDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POSDAT = null;
           				} else {
           			    	this.POSDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POCDAT = null;
           				} else {
           			    	this.POCDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PORDAT = null;
           				} else {
           			    	this.PORDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POLCHG = null;
           				} else {
           			    	this.POLCHG = dis.readDouble();
           				}
					
					this.PORFRQ = readString(dis);
					
					this.POLEAD = readString(dis);
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
					this.POCOST = readString(dis);
					
					this.POVAT = readString(dis);
					
					this.PORETL = readString(dis);
					
					this.POCASE = readString(dis);
					
					this.POUNTS = readString(dis);
					
					this.POWGHT = readString(dis);
					
					this.POTARP = readString(dis);
					
					this.POSTOP = readString(dis);
					
					this.POSKID = readString(dis);
					
					this.POOTHN = readString(dis);
					
					this.POOTHP = readString(dis);
					
					this.POBTCH = readString(dis);
					
					this.PORRET = readString(dis);
					
					this.PORVAT = readString(dis);
					
					this.PORCST = readString(dis);
					
					this.POTPLT = readString(dis);
					
					this.POCUBE = readString(dis);
					
					this.POPDWN = readString(dis);
					
					this.SHPNUM = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POPYCN = null;
           				} else {
           			    	this.POPYCN = dis.readDouble();
           				}
					
					this.POPYDT = readString(dis);
					
					this.POMALS = readString(dis);
					
					this.POMALV = readString(dis);
					
					this.POMSPO = readString(dis);
					
					this.POMSBO = readString(dis);
					
					this.POLOAD = readString(dis);
					
					this.POMCRT = readString(dis);
					
					this.POMCDT = readString(dis);
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBSDT = null;
           				} else {
           			    	this.POBSDT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POASDT = null;
           				} else {
           			    	this.POASDT = dis.readDouble();
           				}
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATCUR = null;
           				} else {
           			    	this.DATCUR = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATTIM = null;
           				} else {
           			    	this.DATTIM = dis.readDouble();
           				}
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PONUMB = null;
           				} else {
           			    	this.PONUMB = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBON = null;
           				} else {
           			    	this.POBON = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POVNUM = null;
           				} else {
           			    	this.POVNUM = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POTRMS = null;
           				} else {
           			    	this.POTRMS = dis.readDouble();
           				}
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
					this.POSTOR = readString(dis);
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
					this.PODPT = readString(dis);
					
					this.POSDPT = readString(dis);
					
					this.POTHER = readString(dis);
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POEDAT = null;
           				} else {
           			    	this.POEDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POSDAT = null;
           				} else {
           			    	this.POSDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POCDAT = null;
           				} else {
           			    	this.POCDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PORDAT = null;
           				} else {
           			    	this.PORDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POLCHG = null;
           				} else {
           			    	this.POLCHG = dis.readDouble();
           				}
					
					this.PORFRQ = readString(dis);
					
					this.POLEAD = readString(dis);
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
					this.POCOST = readString(dis);
					
					this.POVAT = readString(dis);
					
					this.PORETL = readString(dis);
					
					this.POCASE = readString(dis);
					
					this.POUNTS = readString(dis);
					
					this.POWGHT = readString(dis);
					
					this.POTARP = readString(dis);
					
					this.POSTOP = readString(dis);
					
					this.POSKID = readString(dis);
					
					this.POOTHN = readString(dis);
					
					this.POOTHP = readString(dis);
					
					this.POBTCH = readString(dis);
					
					this.PORRET = readString(dis);
					
					this.PORVAT = readString(dis);
					
					this.PORCST = readString(dis);
					
					this.POTPLT = readString(dis);
					
					this.POCUBE = readString(dis);
					
					this.POPDWN = readString(dis);
					
					this.SHPNUM = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POPYCN = null;
           				} else {
           			    	this.POPYCN = dis.readDouble();
           				}
					
					this.POPYDT = readString(dis);
					
					this.POMALS = readString(dis);
					
					this.POMALV = readString(dis);
					
					this.POMSPO = readString(dis);
					
					this.POMSBO = readString(dis);
					
					this.POLOAD = readString(dis);
					
					this.POMCRT = readString(dis);
					
					this.POMCDT = readString(dis);
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBSDT = null;
           				} else {
           			    	this.POBSDT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POASDT = null;
           				} else {
           			    	this.POASDT = dis.readDouble();
           				}
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATCUR = null;
           				} else {
           			    	this.DATCUR = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATTIM = null;
           				} else {
           			    	this.DATTIM = dis.readDouble();
           				}
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Double
				
						if(this.PONUMB == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PONUMB);
		            	}
					
					// Double
				
						if(this.POBON == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBON);
		            	}
					
					// Double
				
						if(this.POVNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POVNUM);
		            	}
					
					// Double
				
						if(this.POTRMS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POTRMS);
		            	}
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// String
				
						writeString(this.POSTOR,dos);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// String
				
						writeString(this.PODPT,dos);
					
					// String
				
						writeString(this.POSDPT,dos);
					
					// String
				
						writeString(this.POTHER,dos);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// Double
				
						if(this.POEDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POEDAT);
		            	}
					
					// Double
				
						if(this.POSDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POSDAT);
		            	}
					
					// Double
				
						if(this.POCDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POCDAT);
		            	}
					
					// Double
				
						if(this.PORDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PORDAT);
		            	}
					
					// Double
				
						if(this.POLCHG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POLCHG);
		            	}
					
					// String
				
						writeString(this.PORFRQ,dos);
					
					// String
				
						writeString(this.POLEAD,dos);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// String
				
						writeString(this.POCOST,dos);
					
					// String
				
						writeString(this.POVAT,dos);
					
					// String
				
						writeString(this.PORETL,dos);
					
					// String
				
						writeString(this.POCASE,dos);
					
					// String
				
						writeString(this.POUNTS,dos);
					
					// String
				
						writeString(this.POWGHT,dos);
					
					// String
				
						writeString(this.POTARP,dos);
					
					// String
				
						writeString(this.POSTOP,dos);
					
					// String
				
						writeString(this.POSKID,dos);
					
					// String
				
						writeString(this.POOTHN,dos);
					
					// String
				
						writeString(this.POOTHP,dos);
					
					// String
				
						writeString(this.POBTCH,dos);
					
					// String
				
						writeString(this.PORRET,dos);
					
					// String
				
						writeString(this.PORVAT,dos);
					
					// String
				
						writeString(this.PORCST,dos);
					
					// String
				
						writeString(this.POTPLT,dos);
					
					// String
				
						writeString(this.POCUBE,dos);
					
					// String
				
						writeString(this.POPDWN,dos);
					
					// String
				
						writeString(this.SHPNUM,dos);
					
					// Double
				
						if(this.POPYCN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POPYCN);
		            	}
					
					// String
				
						writeString(this.POPYDT,dos);
					
					// String
				
						writeString(this.POMALS,dos);
					
					// String
				
						writeString(this.POMALV,dos);
					
					// String
				
						writeString(this.POMSPO,dos);
					
					// String
				
						writeString(this.POMSBO,dos);
					
					// String
				
						writeString(this.POLOAD,dos);
					
					// String
				
						writeString(this.POMCRT,dos);
					
					// String
				
						writeString(this.POMCDT,dos);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// Double
				
						if(this.POBSDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBSDT);
		            	}
					
					// Double
				
						if(this.POASDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POASDT);
		            	}
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// Double
				
						if(this.DATCUR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATCUR);
		            	}
					
					// Double
				
						if(this.DATTIM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATTIM);
		            	}
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Double
				
						if(this.PONUMB == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PONUMB);
		            	}
					
					// Double
				
						if(this.POBON == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBON);
		            	}
					
					// Double
				
						if(this.POVNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POVNUM);
		            	}
					
					// Double
				
						if(this.POTRMS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POTRMS);
		            	}
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// String
				
						writeString(this.POSTOR,dos);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// String
				
						writeString(this.PODPT,dos);
					
					// String
				
						writeString(this.POSDPT,dos);
					
					// String
				
						writeString(this.POTHER,dos);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// Double
				
						if(this.POEDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POEDAT);
		            	}
					
					// Double
				
						if(this.POSDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POSDAT);
		            	}
					
					// Double
				
						if(this.POCDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POCDAT);
		            	}
					
					// Double
				
						if(this.PORDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PORDAT);
		            	}
					
					// Double
				
						if(this.POLCHG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POLCHG);
		            	}
					
					// String
				
						writeString(this.PORFRQ,dos);
					
					// String
				
						writeString(this.POLEAD,dos);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// String
				
						writeString(this.POCOST,dos);
					
					// String
				
						writeString(this.POVAT,dos);
					
					// String
				
						writeString(this.PORETL,dos);
					
					// String
				
						writeString(this.POCASE,dos);
					
					// String
				
						writeString(this.POUNTS,dos);
					
					// String
				
						writeString(this.POWGHT,dos);
					
					// String
				
						writeString(this.POTARP,dos);
					
					// String
				
						writeString(this.POSTOP,dos);
					
					// String
				
						writeString(this.POSKID,dos);
					
					// String
				
						writeString(this.POOTHN,dos);
					
					// String
				
						writeString(this.POOTHP,dos);
					
					// String
				
						writeString(this.POBTCH,dos);
					
					// String
				
						writeString(this.PORRET,dos);
					
					// String
				
						writeString(this.PORVAT,dos);
					
					// String
				
						writeString(this.PORCST,dos);
					
					// String
				
						writeString(this.POTPLT,dos);
					
					// String
				
						writeString(this.POCUBE,dos);
					
					// String
				
						writeString(this.POPDWN,dos);
					
					// String
				
						writeString(this.SHPNUM,dos);
					
					// Double
				
						if(this.POPYCN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POPYCN);
		            	}
					
					// String
				
						writeString(this.POPYDT,dos);
					
					// String
				
						writeString(this.POMALS,dos);
					
					// String
				
						writeString(this.POMALV,dos);
					
					// String
				
						writeString(this.POMSPO,dos);
					
					// String
				
						writeString(this.POMSBO,dos);
					
					// String
				
						writeString(this.POLOAD,dos);
					
					// String
				
						writeString(this.POMCRT,dos);
					
					// String
				
						writeString(this.POMCDT,dos);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// Double
				
						if(this.POBSDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBSDT);
		            	}
					
					// Double
				
						if(this.POASDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POASDT);
		            	}
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// Double
				
						if(this.DATCUR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATCUR);
		            	}
					
					// Double
				
						if(this.DATTIM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATTIM);
		            	}
					
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
		sb.append("PONUMB="+String.valueOf(PONUMB));
		sb.append(",POBON="+String.valueOf(POBON));
		sb.append(",POVNUM="+String.valueOf(POVNUM));
		sb.append(",POTRMS="+String.valueOf(POTRMS));
		sb.append(",POTIND="+POTIND);
		sb.append(",POSTAT="+POSTAT);
		sb.append(",POTYPE="+POTYPE);
		sb.append(",PODEST="+PODEST);
		sb.append(",POSTOR="+POSTOR);
		sb.append(",POADYN="+POADYN);
		sb.append(",PODMTH="+PODMTH);
		sb.append(",POALBO="+POALBO);
		sb.append(",POCONF="+POCONF);
		sb.append(",POPHON="+POPHON);
		sb.append(",POBUYR="+POBUYR);
		sb.append(",PODPT="+PODPT);
		sb.append(",POSDPT="+POSDPT);
		sb.append(",POTHER="+POTHER);
		sb.append(",POFPCD="+POFPCD);
		sb.append(",POFOB="+POFOB);
		sb.append(",POSHP1="+POSHP1);
		sb.append(",POSHP2="+POSHP2);
		sb.append(",POSHPP="+POSHPP);
		sb.append(",POSHPC="+POSHPC);
		sb.append(",POEDAT="+String.valueOf(POEDAT));
		sb.append(",POSDAT="+String.valueOf(POSDAT));
		sb.append(",POCDAT="+String.valueOf(POCDAT));
		sb.append(",PORDAT="+String.valueOf(PORDAT));
		sb.append(",POLCHG="+String.valueOf(POLCHG));
		sb.append(",PORFRQ="+PORFRQ);
		sb.append(",POLEAD="+POLEAD);
		sb.append(",POORIG="+POORIG);
		sb.append(",PONOT1="+PONOT1);
		sb.append(",PONOT2="+PONOT2);
		sb.append(",PONOT3="+PONOT3);
		sb.append(",POCOST="+POCOST);
		sb.append(",POVAT="+POVAT);
		sb.append(",PORETL="+PORETL);
		sb.append(",POCASE="+POCASE);
		sb.append(",POUNTS="+POUNTS);
		sb.append(",POWGHT="+POWGHT);
		sb.append(",POTARP="+POTARP);
		sb.append(",POSTOP="+POSTOP);
		sb.append(",POSKID="+POSKID);
		sb.append(",POOTHN="+POOTHN);
		sb.append(",POOTHP="+POOTHP);
		sb.append(",POBTCH="+POBTCH);
		sb.append(",PORRET="+PORRET);
		sb.append(",PORVAT="+PORVAT);
		sb.append(",PORCST="+PORCST);
		sb.append(",POTPLT="+POTPLT);
		sb.append(",POCUBE="+POCUBE);
		sb.append(",POPDWN="+POPDWN);
		sb.append(",SHPNUM="+SHPNUM);
		sb.append(",POPYCN="+String.valueOf(POPYCN));
		sb.append(",POPYDT="+POPYDT);
		sb.append(",POMALS="+POMALS);
		sb.append(",POMALV="+POMALV);
		sb.append(",POMSPO="+POMSPO);
		sb.append(",POMSBO="+POMSBO);
		sb.append(",POLOAD="+POLOAD);
		sb.append(",POMCRT="+POMCRT);
		sb.append(",POMCDT="+POMCDT);
		sb.append(",POQCKE="+POQCKE);
		sb.append(",POMTYP="+POMTYP);
		sb.append(",PO850F="+PO850F);
		sb.append(",PO860F="+PO860F);
		sb.append(",POTPID="+POTPID);
		sb.append(",POBSDT="+String.valueOf(POBSDT));
		sb.append(",POASDT="+String.valueOf(POASDT));
		sb.append(",POCODF="+POCODF);
		sb.append(",POCODT="+POCODT);
		sb.append(",POCVTP="+POCVTP);
		sb.append(",POCVMD="+POCVMD);
		sb.append(",POMCPY="+POMCPY);
		sb.append(",POUSER="+POUSER);
		sb.append(",DATCUR="+String.valueOf(DATCUR));
		sb.append(",DATTIM="+String.valueOf(DATTIM));
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(PONUMB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONUMB);
            			}
            		
        			sb.append("|");
        		
        				if(POBON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBON);
            			}
            		
        			sb.append("|");
        		
        				if(POVNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POVNUM);
            			}
            		
        			sb.append("|");
        		
        				if(POTRMS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTRMS);
            			}
            		
        			sb.append("|");
        		
        				if(POTIND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTIND);
            			}
            		
        			sb.append("|");
        		
        				if(POSTAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTAT);
            			}
            		
        			sb.append("|");
        		
        				if(POTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PODEST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODEST);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOR);
            			}
            		
        			sb.append("|");
        		
        				if(POADYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POADYN);
            			}
            		
        			sb.append("|");
        		
        				if(PODMTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODMTH);
            			}
            		
        			sb.append("|");
        		
        				if(POALBO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POALBO);
            			}
            		
        			sb.append("|");
        		
        				if(POCONF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCONF);
            			}
            		
        			sb.append("|");
        		
        				if(POPHON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPHON);
            			}
            		
        			sb.append("|");
        		
        				if(POBUYR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBUYR);
            			}
            		
        			sb.append("|");
        		
        				if(PODPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODPT);
            			}
            		
        			sb.append("|");
        		
        				if(POSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(POTHER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTHER);
            			}
            		
        			sb.append("|");
        		
        				if(POFPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFPCD);
            			}
            		
        			sb.append("|");
        		
        				if(POFOB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFOB);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP1);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP2);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPP);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPC);
            			}
            		
        			sb.append("|");
        		
        				if(POEDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POEDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POSDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POCDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCDAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POLCHG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLCHG);
            			}
            		
        			sb.append("|");
        		
        				if(PORFRQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORFRQ);
            			}
            		
        			sb.append("|");
        		
        				if(POLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(POORIG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POORIG);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT1);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT2);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT3);
            			}
            		
        			sb.append("|");
        		
        				if(POCOST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCOST);
            			}
            		
        			sb.append("|");
        		
        				if(POVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORETL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORETL);
            			}
            		
        			sb.append("|");
        		
        				if(POCASE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCASE);
            			}
            		
        			sb.append("|");
        		
        				if(POUNTS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUNTS);
            			}
            		
        			sb.append("|");
        		
        				if(POWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(POTARP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTARP);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOP);
            			}
            		
        			sb.append("|");
        		
        				if(POSKID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSKID);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHN);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHP);
            			}
            		
        			sb.append("|");
        		
        				if(POBTCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBTCH);
            			}
            		
        			sb.append("|");
        		
        				if(PORRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORRET);
            			}
            		
        			sb.append("|");
        		
        				if(PORVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORCST);
            			}
            		
        			sb.append("|");
        		
        				if(POTPLT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPLT);
            			}
            		
        			sb.append("|");
        		
        				if(POCUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCUBE);
            			}
            		
        			sb.append("|");
        		
        				if(POPDWN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPDWN);
            			}
            		
        			sb.append("|");
        		
        				if(SHPNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHPNUM);
            			}
            		
        			sb.append("|");
        		
        				if(POPYCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPYCN);
            			}
            		
        			sb.append("|");
        		
        				if(POPYDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPYDT);
            			}
            		
        			sb.append("|");
        		
        				if(POMALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALS);
            			}
            		
        			sb.append("|");
        		
        				if(POMALV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALV);
            			}
            		
        			sb.append("|");
        		
        				if(POMSPO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMSPO);
            			}
            		
        			sb.append("|");
        		
        				if(POMSBO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMSBO);
            			}
            		
        			sb.append("|");
        		
        				if(POLOAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLOAD);
            			}
            		
        			sb.append("|");
        		
        				if(POMCRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCRT);
            			}
            		
        			sb.append("|");
        		
        				if(POMCDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCDT);
            			}
            		
        			sb.append("|");
        		
        				if(POQCKE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POQCKE);
            			}
            		
        			sb.append("|");
        		
        				if(POMTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMTYP);
            			}
            		
        			sb.append("|");
        		
        				if(PO850F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO850F);
            			}
            		
        			sb.append("|");
        		
        				if(PO860F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO860F);
            			}
            		
        			sb.append("|");
        		
        				if(POTPID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPID);
            			}
            		
        			sb.append("|");
        		
        				if(POBSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBSDT);
            			}
            		
        			sb.append("|");
        		
        				if(POASDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POASDT);
            			}
            		
        			sb.append("|");
        		
        				if(POCODF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODF);
            			}
            		
        			sb.append("|");
        		
        				if(POCODT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODT);
            			}
            		
        			sb.append("|");
        		
        				if(POCVTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVTP);
            			}
            		
        			sb.append("|");
        		
        				if(POCVMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVMD);
            			}
            		
        			sb.append("|");
        		
        				if(POMCPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCPY);
            			}
            		
        			sb.append("|");
        		
        				if(POUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUSER);
            			}
            		
        			sb.append("|");
        		
        				if(DATCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATCUR);
            			}
            		
        			sb.append("|");
        		
        				if(DATTIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATTIM);
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
    public int compareTo(POMHDHStruct other) {

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

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[0];

	
			    public Double PONUMB;

				public Double getPONUMB () {
					return this.PONUMB;
				}

				public Boolean PONUMBIsNullable(){
				    return true;
				}
				public Boolean PONUMBIsKey(){
				    return false;
				}
				public Integer PONUMBLength(){
				    return null;
				}
				public Integer PONUMBPrecision(){
				    return null;
				}
				public String PONUMBDefault(){
				
					return "";
				
				}
				public String PONUMBComment(){
				
				    return "";
				
				}
				public String PONUMBPattern(){
				
					return "";
				
				}
				public String PONUMBOriginalDbColumnName(){
				
					return "PONUMB";
				
				}

				
			    public Double POBON;

				public Double getPOBON () {
					return this.POBON;
				}

				public Boolean POBONIsNullable(){
				    return true;
				}
				public Boolean POBONIsKey(){
				    return false;
				}
				public Integer POBONLength(){
				    return null;
				}
				public Integer POBONPrecision(){
				    return null;
				}
				public String POBONDefault(){
				
					return "";
				
				}
				public String POBONComment(){
				
				    return "";
				
				}
				public String POBONPattern(){
				
					return "";
				
				}
				public String POBONOriginalDbColumnName(){
				
					return "POBON";
				
				}

				
			    public Double POVNUM;

				public Double getPOVNUM () {
					return this.POVNUM;
				}

				public Boolean POVNUMIsNullable(){
				    return true;
				}
				public Boolean POVNUMIsKey(){
				    return false;
				}
				public Integer POVNUMLength(){
				    return null;
				}
				public Integer POVNUMPrecision(){
				    return null;
				}
				public String POVNUMDefault(){
				
					return "";
				
				}
				public String POVNUMComment(){
				
				    return "";
				
				}
				public String POVNUMPattern(){
				
					return "";
				
				}
				public String POVNUMOriginalDbColumnName(){
				
					return "POVNUM";
				
				}

				
			    public Double POTRMS;

				public Double getPOTRMS () {
					return this.POTRMS;
				}

				public Boolean POTRMSIsNullable(){
				    return true;
				}
				public Boolean POTRMSIsKey(){
				    return false;
				}
				public Integer POTRMSLength(){
				    return null;
				}
				public Integer POTRMSPrecision(){
				    return null;
				}
				public String POTRMSDefault(){
				
					return "";
				
				}
				public String POTRMSComment(){
				
				    return "";
				
				}
				public String POTRMSPattern(){
				
					return "";
				
				}
				public String POTRMSOriginalDbColumnName(){
				
					return "POTRMS";
				
				}

				
			    public String POTIND;

				public String getPOTIND () {
					return this.POTIND;
				}

				public Boolean POTINDIsNullable(){
				    return true;
				}
				public Boolean POTINDIsKey(){
				    return false;
				}
				public Integer POTINDLength(){
				    return null;
				}
				public Integer POTINDPrecision(){
				    return null;
				}
				public String POTINDDefault(){
				
					return null;
				
				}
				public String POTINDComment(){
				
				    return "";
				
				}
				public String POTINDPattern(){
				
					return "";
				
				}
				public String POTINDOriginalDbColumnName(){
				
					return "POTIND";
				
				}

				
			    public String POSTAT;

				public String getPOSTAT () {
					return this.POSTAT;
				}

				public Boolean POSTATIsNullable(){
				    return true;
				}
				public Boolean POSTATIsKey(){
				    return false;
				}
				public Integer POSTATLength(){
				    return null;
				}
				public Integer POSTATPrecision(){
				    return null;
				}
				public String POSTATDefault(){
				
					return null;
				
				}
				public String POSTATComment(){
				
				    return "";
				
				}
				public String POSTATPattern(){
				
					return "";
				
				}
				public String POSTATOriginalDbColumnName(){
				
					return "POSTAT";
				
				}

				
			    public String POTYPE;

				public String getPOTYPE () {
					return this.POTYPE;
				}

				public Boolean POTYPEIsNullable(){
				    return true;
				}
				public Boolean POTYPEIsKey(){
				    return false;
				}
				public Integer POTYPELength(){
				    return null;
				}
				public Integer POTYPEPrecision(){
				    return null;
				}
				public String POTYPEDefault(){
				
					return null;
				
				}
				public String POTYPEComment(){
				
				    return "";
				
				}
				public String POTYPEPattern(){
				
					return "";
				
				}
				public String POTYPEOriginalDbColumnName(){
				
					return "POTYPE";
				
				}

				
			    public String PODEST;

				public String getPODEST () {
					return this.PODEST;
				}

				public Boolean PODESTIsNullable(){
				    return true;
				}
				public Boolean PODESTIsKey(){
				    return false;
				}
				public Integer PODESTLength(){
				    return null;
				}
				public Integer PODESTPrecision(){
				    return null;
				}
				public String PODESTDefault(){
				
					return null;
				
				}
				public String PODESTComment(){
				
				    return "";
				
				}
				public String PODESTPattern(){
				
					return "";
				
				}
				public String PODESTOriginalDbColumnName(){
				
					return "PODEST";
				
				}

				
			    public String POSTOR;

				public String getPOSTOR () {
					return this.POSTOR;
				}

				public Boolean POSTORIsNullable(){
				    return true;
				}
				public Boolean POSTORIsKey(){
				    return false;
				}
				public Integer POSTORLength(){
				    return null;
				}
				public Integer POSTORPrecision(){
				    return null;
				}
				public String POSTORDefault(){
				
					return null;
				
				}
				public String POSTORComment(){
				
				    return "";
				
				}
				public String POSTORPattern(){
				
					return "";
				
				}
				public String POSTOROriginalDbColumnName(){
				
					return "POSTOR";
				
				}

				
			    public String POADYN;

				public String getPOADYN () {
					return this.POADYN;
				}

				public Boolean POADYNIsNullable(){
				    return true;
				}
				public Boolean POADYNIsKey(){
				    return false;
				}
				public Integer POADYNLength(){
				    return null;
				}
				public Integer POADYNPrecision(){
				    return null;
				}
				public String POADYNDefault(){
				
					return null;
				
				}
				public String POADYNComment(){
				
				    return "";
				
				}
				public String POADYNPattern(){
				
					return "";
				
				}
				public String POADYNOriginalDbColumnName(){
				
					return "POADYN";
				
				}

				
			    public String PODMTH;

				public String getPODMTH () {
					return this.PODMTH;
				}

				public Boolean PODMTHIsNullable(){
				    return true;
				}
				public Boolean PODMTHIsKey(){
				    return false;
				}
				public Integer PODMTHLength(){
				    return null;
				}
				public Integer PODMTHPrecision(){
				    return null;
				}
				public String PODMTHDefault(){
				
					return null;
				
				}
				public String PODMTHComment(){
				
				    return "";
				
				}
				public String PODMTHPattern(){
				
					return "";
				
				}
				public String PODMTHOriginalDbColumnName(){
				
					return "PODMTH";
				
				}

				
			    public String POALBO;

				public String getPOALBO () {
					return this.POALBO;
				}

				public Boolean POALBOIsNullable(){
				    return true;
				}
				public Boolean POALBOIsKey(){
				    return false;
				}
				public Integer POALBOLength(){
				    return null;
				}
				public Integer POALBOPrecision(){
				    return null;
				}
				public String POALBODefault(){
				
					return null;
				
				}
				public String POALBOComment(){
				
				    return "";
				
				}
				public String POALBOPattern(){
				
					return "";
				
				}
				public String POALBOOriginalDbColumnName(){
				
					return "POALBO";
				
				}

				
			    public String POCONF;

				public String getPOCONF () {
					return this.POCONF;
				}

				public Boolean POCONFIsNullable(){
				    return true;
				}
				public Boolean POCONFIsKey(){
				    return false;
				}
				public Integer POCONFLength(){
				    return null;
				}
				public Integer POCONFPrecision(){
				    return null;
				}
				public String POCONFDefault(){
				
					return null;
				
				}
				public String POCONFComment(){
				
				    return "";
				
				}
				public String POCONFPattern(){
				
					return "";
				
				}
				public String POCONFOriginalDbColumnName(){
				
					return "POCONF";
				
				}

				
			    public String POPHON;

				public String getPOPHON () {
					return this.POPHON;
				}

				public Boolean POPHONIsNullable(){
				    return true;
				}
				public Boolean POPHONIsKey(){
				    return false;
				}
				public Integer POPHONLength(){
				    return null;
				}
				public Integer POPHONPrecision(){
				    return null;
				}
				public String POPHONDefault(){
				
					return null;
				
				}
				public String POPHONComment(){
				
				    return "";
				
				}
				public String POPHONPattern(){
				
					return "";
				
				}
				public String POPHONOriginalDbColumnName(){
				
					return "POPHON";
				
				}

				
			    public String POBUYR;

				public String getPOBUYR () {
					return this.POBUYR;
				}

				public Boolean POBUYRIsNullable(){
				    return true;
				}
				public Boolean POBUYRIsKey(){
				    return false;
				}
				public Integer POBUYRLength(){
				    return null;
				}
				public Integer POBUYRPrecision(){
				    return null;
				}
				public String POBUYRDefault(){
				
					return null;
				
				}
				public String POBUYRComment(){
				
				    return "";
				
				}
				public String POBUYRPattern(){
				
					return "";
				
				}
				public String POBUYROriginalDbColumnName(){
				
					return "POBUYR";
				
				}

				
			    public String PODPT;

				public String getPODPT () {
					return this.PODPT;
				}

				public Boolean PODPTIsNullable(){
				    return true;
				}
				public Boolean PODPTIsKey(){
				    return false;
				}
				public Integer PODPTLength(){
				    return null;
				}
				public Integer PODPTPrecision(){
				    return null;
				}
				public String PODPTDefault(){
				
					return null;
				
				}
				public String PODPTComment(){
				
				    return "";
				
				}
				public String PODPTPattern(){
				
					return "";
				
				}
				public String PODPTOriginalDbColumnName(){
				
					return "PODPT";
				
				}

				
			    public String POSDPT;

				public String getPOSDPT () {
					return this.POSDPT;
				}

				public Boolean POSDPTIsNullable(){
				    return true;
				}
				public Boolean POSDPTIsKey(){
				    return false;
				}
				public Integer POSDPTLength(){
				    return null;
				}
				public Integer POSDPTPrecision(){
				    return null;
				}
				public String POSDPTDefault(){
				
					return null;
				
				}
				public String POSDPTComment(){
				
				    return "";
				
				}
				public String POSDPTPattern(){
				
					return "";
				
				}
				public String POSDPTOriginalDbColumnName(){
				
					return "POSDPT";
				
				}

				
			    public String POTHER;

				public String getPOTHER () {
					return this.POTHER;
				}

				public Boolean POTHERIsNullable(){
				    return true;
				}
				public Boolean POTHERIsKey(){
				    return false;
				}
				public Integer POTHERLength(){
				    return null;
				}
				public Integer POTHERPrecision(){
				    return null;
				}
				public String POTHERDefault(){
				
					return null;
				
				}
				public String POTHERComment(){
				
				    return "";
				
				}
				public String POTHERPattern(){
				
					return "";
				
				}
				public String POTHEROriginalDbColumnName(){
				
					return "POTHER";
				
				}

				
			    public String POFPCD;

				public String getPOFPCD () {
					return this.POFPCD;
				}

				public Boolean POFPCDIsNullable(){
				    return true;
				}
				public Boolean POFPCDIsKey(){
				    return false;
				}
				public Integer POFPCDLength(){
				    return null;
				}
				public Integer POFPCDPrecision(){
				    return null;
				}
				public String POFPCDDefault(){
				
					return null;
				
				}
				public String POFPCDComment(){
				
				    return "";
				
				}
				public String POFPCDPattern(){
				
					return "";
				
				}
				public String POFPCDOriginalDbColumnName(){
				
					return "POFPCD";
				
				}

				
			    public String POFOB;

				public String getPOFOB () {
					return this.POFOB;
				}

				public Boolean POFOBIsNullable(){
				    return true;
				}
				public Boolean POFOBIsKey(){
				    return false;
				}
				public Integer POFOBLength(){
				    return null;
				}
				public Integer POFOBPrecision(){
				    return null;
				}
				public String POFOBDefault(){
				
					return null;
				
				}
				public String POFOBComment(){
				
				    return "";
				
				}
				public String POFOBPattern(){
				
					return "";
				
				}
				public String POFOBOriginalDbColumnName(){
				
					return "POFOB";
				
				}

				
			    public String POSHP1;

				public String getPOSHP1 () {
					return this.POSHP1;
				}

				public Boolean POSHP1IsNullable(){
				    return true;
				}
				public Boolean POSHP1IsKey(){
				    return false;
				}
				public Integer POSHP1Length(){
				    return null;
				}
				public Integer POSHP1Precision(){
				    return null;
				}
				public String POSHP1Default(){
				
					return null;
				
				}
				public String POSHP1Comment(){
				
				    return "";
				
				}
				public String POSHP1Pattern(){
				
					return "";
				
				}
				public String POSHP1OriginalDbColumnName(){
				
					return "POSHP1";
				
				}

				
			    public String POSHP2;

				public String getPOSHP2 () {
					return this.POSHP2;
				}

				public Boolean POSHP2IsNullable(){
				    return true;
				}
				public Boolean POSHP2IsKey(){
				    return false;
				}
				public Integer POSHP2Length(){
				    return null;
				}
				public Integer POSHP2Precision(){
				    return null;
				}
				public String POSHP2Default(){
				
					return null;
				
				}
				public String POSHP2Comment(){
				
				    return "";
				
				}
				public String POSHP2Pattern(){
				
					return "";
				
				}
				public String POSHP2OriginalDbColumnName(){
				
					return "POSHP2";
				
				}

				
			    public String POSHPP;

				public String getPOSHPP () {
					return this.POSHPP;
				}

				public Boolean POSHPPIsNullable(){
				    return true;
				}
				public Boolean POSHPPIsKey(){
				    return false;
				}
				public Integer POSHPPLength(){
				    return null;
				}
				public Integer POSHPPPrecision(){
				    return null;
				}
				public String POSHPPDefault(){
				
					return null;
				
				}
				public String POSHPPComment(){
				
				    return "";
				
				}
				public String POSHPPPattern(){
				
					return "";
				
				}
				public String POSHPPOriginalDbColumnName(){
				
					return "POSHPP";
				
				}

				
			    public String POSHPC;

				public String getPOSHPC () {
					return this.POSHPC;
				}

				public Boolean POSHPCIsNullable(){
				    return true;
				}
				public Boolean POSHPCIsKey(){
				    return false;
				}
				public Integer POSHPCLength(){
				    return null;
				}
				public Integer POSHPCPrecision(){
				    return null;
				}
				public String POSHPCDefault(){
				
					return null;
				
				}
				public String POSHPCComment(){
				
				    return "";
				
				}
				public String POSHPCPattern(){
				
					return "";
				
				}
				public String POSHPCOriginalDbColumnName(){
				
					return "POSHPC";
				
				}

				
			    public Double POEDAT;

				public Double getPOEDAT () {
					return this.POEDAT;
				}

				public Boolean POEDATIsNullable(){
				    return true;
				}
				public Boolean POEDATIsKey(){
				    return false;
				}
				public Integer POEDATLength(){
				    return null;
				}
				public Integer POEDATPrecision(){
				    return null;
				}
				public String POEDATDefault(){
				
					return "";
				
				}
				public String POEDATComment(){
				
				    return "";
				
				}
				public String POEDATPattern(){
				
					return "";
				
				}
				public String POEDATOriginalDbColumnName(){
				
					return "POEDAT";
				
				}

				
			    public Double POSDAT;

				public Double getPOSDAT () {
					return this.POSDAT;
				}

				public Boolean POSDATIsNullable(){
				    return true;
				}
				public Boolean POSDATIsKey(){
				    return false;
				}
				public Integer POSDATLength(){
				    return null;
				}
				public Integer POSDATPrecision(){
				    return null;
				}
				public String POSDATDefault(){
				
					return "";
				
				}
				public String POSDATComment(){
				
				    return "";
				
				}
				public String POSDATPattern(){
				
					return "";
				
				}
				public String POSDATOriginalDbColumnName(){
				
					return "POSDAT";
				
				}

				
			    public Double POCDAT;

				public Double getPOCDAT () {
					return this.POCDAT;
				}

				public Boolean POCDATIsNullable(){
				    return true;
				}
				public Boolean POCDATIsKey(){
				    return false;
				}
				public Integer POCDATLength(){
				    return null;
				}
				public Integer POCDATPrecision(){
				    return null;
				}
				public String POCDATDefault(){
				
					return "";
				
				}
				public String POCDATComment(){
				
				    return "";
				
				}
				public String POCDATPattern(){
				
					return "";
				
				}
				public String POCDATOriginalDbColumnName(){
				
					return "POCDAT";
				
				}

				
			    public Double PORDAT;

				public Double getPORDAT () {
					return this.PORDAT;
				}

				public Boolean PORDATIsNullable(){
				    return true;
				}
				public Boolean PORDATIsKey(){
				    return false;
				}
				public Integer PORDATLength(){
				    return null;
				}
				public Integer PORDATPrecision(){
				    return null;
				}
				public String PORDATDefault(){
				
					return "";
				
				}
				public String PORDATComment(){
				
				    return "";
				
				}
				public String PORDATPattern(){
				
					return "";
				
				}
				public String PORDATOriginalDbColumnName(){
				
					return "PORDAT";
				
				}

				
			    public Double POLCHG;

				public Double getPOLCHG () {
					return this.POLCHG;
				}

				public Boolean POLCHGIsNullable(){
				    return true;
				}
				public Boolean POLCHGIsKey(){
				    return false;
				}
				public Integer POLCHGLength(){
				    return null;
				}
				public Integer POLCHGPrecision(){
				    return null;
				}
				public String POLCHGDefault(){
				
					return "";
				
				}
				public String POLCHGComment(){
				
				    return "";
				
				}
				public String POLCHGPattern(){
				
					return "";
				
				}
				public String POLCHGOriginalDbColumnName(){
				
					return "POLCHG";
				
				}

				
			    public String PORFRQ;

				public String getPORFRQ () {
					return this.PORFRQ;
				}

				public Boolean PORFRQIsNullable(){
				    return true;
				}
				public Boolean PORFRQIsKey(){
				    return false;
				}
				public Integer PORFRQLength(){
				    return null;
				}
				public Integer PORFRQPrecision(){
				    return null;
				}
				public String PORFRQDefault(){
				
					return null;
				
				}
				public String PORFRQComment(){
				
				    return "";
				
				}
				public String PORFRQPattern(){
				
					return "";
				
				}
				public String PORFRQOriginalDbColumnName(){
				
					return "PORFRQ";
				
				}

				
			    public String POLEAD;

				public String getPOLEAD () {
					return this.POLEAD;
				}

				public Boolean POLEADIsNullable(){
				    return true;
				}
				public Boolean POLEADIsKey(){
				    return false;
				}
				public Integer POLEADLength(){
				    return null;
				}
				public Integer POLEADPrecision(){
				    return null;
				}
				public String POLEADDefault(){
				
					return null;
				
				}
				public String POLEADComment(){
				
				    return "";
				
				}
				public String POLEADPattern(){
				
					return "";
				
				}
				public String POLEADOriginalDbColumnName(){
				
					return "POLEAD";
				
				}

				
			    public String POORIG;

				public String getPOORIG () {
					return this.POORIG;
				}

				public Boolean POORIGIsNullable(){
				    return true;
				}
				public Boolean POORIGIsKey(){
				    return false;
				}
				public Integer POORIGLength(){
				    return null;
				}
				public Integer POORIGPrecision(){
				    return null;
				}
				public String POORIGDefault(){
				
					return null;
				
				}
				public String POORIGComment(){
				
				    return "";
				
				}
				public String POORIGPattern(){
				
					return "";
				
				}
				public String POORIGOriginalDbColumnName(){
				
					return "POORIG";
				
				}

				
			    public String PONOT1;

				public String getPONOT1 () {
					return this.PONOT1;
				}

				public Boolean PONOT1IsNullable(){
				    return true;
				}
				public Boolean PONOT1IsKey(){
				    return false;
				}
				public Integer PONOT1Length(){
				    return null;
				}
				public Integer PONOT1Precision(){
				    return null;
				}
				public String PONOT1Default(){
				
					return null;
				
				}
				public String PONOT1Comment(){
				
				    return "";
				
				}
				public String PONOT1Pattern(){
				
					return "";
				
				}
				public String PONOT1OriginalDbColumnName(){
				
					return "PONOT1";
				
				}

				
			    public String PONOT2;

				public String getPONOT2 () {
					return this.PONOT2;
				}

				public Boolean PONOT2IsNullable(){
				    return true;
				}
				public Boolean PONOT2IsKey(){
				    return false;
				}
				public Integer PONOT2Length(){
				    return null;
				}
				public Integer PONOT2Precision(){
				    return null;
				}
				public String PONOT2Default(){
				
					return null;
				
				}
				public String PONOT2Comment(){
				
				    return "";
				
				}
				public String PONOT2Pattern(){
				
					return "";
				
				}
				public String PONOT2OriginalDbColumnName(){
				
					return "PONOT2";
				
				}

				
			    public String PONOT3;

				public String getPONOT3 () {
					return this.PONOT3;
				}

				public Boolean PONOT3IsNullable(){
				    return true;
				}
				public Boolean PONOT3IsKey(){
				    return false;
				}
				public Integer PONOT3Length(){
				    return null;
				}
				public Integer PONOT3Precision(){
				    return null;
				}
				public String PONOT3Default(){
				
					return null;
				
				}
				public String PONOT3Comment(){
				
				    return "";
				
				}
				public String PONOT3Pattern(){
				
					return "";
				
				}
				public String PONOT3OriginalDbColumnName(){
				
					return "PONOT3";
				
				}

				
			    public String POCOST;

				public String getPOCOST () {
					return this.POCOST;
				}

				public Boolean POCOSTIsNullable(){
				    return true;
				}
				public Boolean POCOSTIsKey(){
				    return false;
				}
				public Integer POCOSTLength(){
				    return null;
				}
				public Integer POCOSTPrecision(){
				    return null;
				}
				public String POCOSTDefault(){
				
					return null;
				
				}
				public String POCOSTComment(){
				
				    return "";
				
				}
				public String POCOSTPattern(){
				
					return "";
				
				}
				public String POCOSTOriginalDbColumnName(){
				
					return "POCOST";
				
				}

				
			    public String POVAT;

				public String getPOVAT () {
					return this.POVAT;
				}

				public Boolean POVATIsNullable(){
				    return true;
				}
				public Boolean POVATIsKey(){
				    return false;
				}
				public Integer POVATLength(){
				    return null;
				}
				public Integer POVATPrecision(){
				    return null;
				}
				public String POVATDefault(){
				
					return null;
				
				}
				public String POVATComment(){
				
				    return "";
				
				}
				public String POVATPattern(){
				
					return "";
				
				}
				public String POVATOriginalDbColumnName(){
				
					return "POVAT";
				
				}

				
			    public String PORETL;

				public String getPORETL () {
					return this.PORETL;
				}

				public Boolean PORETLIsNullable(){
				    return true;
				}
				public Boolean PORETLIsKey(){
				    return false;
				}
				public Integer PORETLLength(){
				    return null;
				}
				public Integer PORETLPrecision(){
				    return null;
				}
				public String PORETLDefault(){
				
					return null;
				
				}
				public String PORETLComment(){
				
				    return "";
				
				}
				public String PORETLPattern(){
				
					return "";
				
				}
				public String PORETLOriginalDbColumnName(){
				
					return "PORETL";
				
				}

				
			    public String POCASE;

				public String getPOCASE () {
					return this.POCASE;
				}

				public Boolean POCASEIsNullable(){
				    return true;
				}
				public Boolean POCASEIsKey(){
				    return false;
				}
				public Integer POCASELength(){
				    return null;
				}
				public Integer POCASEPrecision(){
				    return null;
				}
				public String POCASEDefault(){
				
					return null;
				
				}
				public String POCASEComment(){
				
				    return "";
				
				}
				public String POCASEPattern(){
				
					return "";
				
				}
				public String POCASEOriginalDbColumnName(){
				
					return "POCASE";
				
				}

				
			    public String POUNTS;

				public String getPOUNTS () {
					return this.POUNTS;
				}

				public Boolean POUNTSIsNullable(){
				    return true;
				}
				public Boolean POUNTSIsKey(){
				    return false;
				}
				public Integer POUNTSLength(){
				    return null;
				}
				public Integer POUNTSPrecision(){
				    return null;
				}
				public String POUNTSDefault(){
				
					return null;
				
				}
				public String POUNTSComment(){
				
				    return "";
				
				}
				public String POUNTSPattern(){
				
					return "";
				
				}
				public String POUNTSOriginalDbColumnName(){
				
					return "POUNTS";
				
				}

				
			    public String POWGHT;

				public String getPOWGHT () {
					return this.POWGHT;
				}

				public Boolean POWGHTIsNullable(){
				    return true;
				}
				public Boolean POWGHTIsKey(){
				    return false;
				}
				public Integer POWGHTLength(){
				    return null;
				}
				public Integer POWGHTPrecision(){
				    return null;
				}
				public String POWGHTDefault(){
				
					return null;
				
				}
				public String POWGHTComment(){
				
				    return "";
				
				}
				public String POWGHTPattern(){
				
					return "";
				
				}
				public String POWGHTOriginalDbColumnName(){
				
					return "POWGHT";
				
				}

				
			    public String POTARP;

				public String getPOTARP () {
					return this.POTARP;
				}

				public Boolean POTARPIsNullable(){
				    return true;
				}
				public Boolean POTARPIsKey(){
				    return false;
				}
				public Integer POTARPLength(){
				    return null;
				}
				public Integer POTARPPrecision(){
				    return null;
				}
				public String POTARPDefault(){
				
					return null;
				
				}
				public String POTARPComment(){
				
				    return "";
				
				}
				public String POTARPPattern(){
				
					return "";
				
				}
				public String POTARPOriginalDbColumnName(){
				
					return "POTARP";
				
				}

				
			    public String POSTOP;

				public String getPOSTOP () {
					return this.POSTOP;
				}

				public Boolean POSTOPIsNullable(){
				    return true;
				}
				public Boolean POSTOPIsKey(){
				    return false;
				}
				public Integer POSTOPLength(){
				    return null;
				}
				public Integer POSTOPPrecision(){
				    return null;
				}
				public String POSTOPDefault(){
				
					return null;
				
				}
				public String POSTOPComment(){
				
				    return "";
				
				}
				public String POSTOPPattern(){
				
					return "";
				
				}
				public String POSTOPOriginalDbColumnName(){
				
					return "POSTOP";
				
				}

				
			    public String POSKID;

				public String getPOSKID () {
					return this.POSKID;
				}

				public Boolean POSKIDIsNullable(){
				    return true;
				}
				public Boolean POSKIDIsKey(){
				    return false;
				}
				public Integer POSKIDLength(){
				    return null;
				}
				public Integer POSKIDPrecision(){
				    return null;
				}
				public String POSKIDDefault(){
				
					return null;
				
				}
				public String POSKIDComment(){
				
				    return "";
				
				}
				public String POSKIDPattern(){
				
					return "";
				
				}
				public String POSKIDOriginalDbColumnName(){
				
					return "POSKID";
				
				}

				
			    public String POOTHN;

				public String getPOOTHN () {
					return this.POOTHN;
				}

				public Boolean POOTHNIsNullable(){
				    return true;
				}
				public Boolean POOTHNIsKey(){
				    return false;
				}
				public Integer POOTHNLength(){
				    return null;
				}
				public Integer POOTHNPrecision(){
				    return null;
				}
				public String POOTHNDefault(){
				
					return null;
				
				}
				public String POOTHNComment(){
				
				    return "";
				
				}
				public String POOTHNPattern(){
				
					return "";
				
				}
				public String POOTHNOriginalDbColumnName(){
				
					return "POOTHN";
				
				}

				
			    public String POOTHP;

				public String getPOOTHP () {
					return this.POOTHP;
				}

				public Boolean POOTHPIsNullable(){
				    return true;
				}
				public Boolean POOTHPIsKey(){
				    return false;
				}
				public Integer POOTHPLength(){
				    return null;
				}
				public Integer POOTHPPrecision(){
				    return null;
				}
				public String POOTHPDefault(){
				
					return null;
				
				}
				public String POOTHPComment(){
				
				    return "";
				
				}
				public String POOTHPPattern(){
				
					return "";
				
				}
				public String POOTHPOriginalDbColumnName(){
				
					return "POOTHP";
				
				}

				
			    public String POBTCH;

				public String getPOBTCH () {
					return this.POBTCH;
				}

				public Boolean POBTCHIsNullable(){
				    return true;
				}
				public Boolean POBTCHIsKey(){
				    return false;
				}
				public Integer POBTCHLength(){
				    return null;
				}
				public Integer POBTCHPrecision(){
				    return null;
				}
				public String POBTCHDefault(){
				
					return null;
				
				}
				public String POBTCHComment(){
				
				    return "";
				
				}
				public String POBTCHPattern(){
				
					return "";
				
				}
				public String POBTCHOriginalDbColumnName(){
				
					return "POBTCH";
				
				}

				
			    public String PORRET;

				public String getPORRET () {
					return this.PORRET;
				}

				public Boolean PORRETIsNullable(){
				    return true;
				}
				public Boolean PORRETIsKey(){
				    return false;
				}
				public Integer PORRETLength(){
				    return null;
				}
				public Integer PORRETPrecision(){
				    return null;
				}
				public String PORRETDefault(){
				
					return null;
				
				}
				public String PORRETComment(){
				
				    return "";
				
				}
				public String PORRETPattern(){
				
					return "";
				
				}
				public String PORRETOriginalDbColumnName(){
				
					return "PORRET";
				
				}

				
			    public String PORVAT;

				public String getPORVAT () {
					return this.PORVAT;
				}

				public Boolean PORVATIsNullable(){
				    return true;
				}
				public Boolean PORVATIsKey(){
				    return false;
				}
				public Integer PORVATLength(){
				    return null;
				}
				public Integer PORVATPrecision(){
				    return null;
				}
				public String PORVATDefault(){
				
					return null;
				
				}
				public String PORVATComment(){
				
				    return "";
				
				}
				public String PORVATPattern(){
				
					return "";
				
				}
				public String PORVATOriginalDbColumnName(){
				
					return "PORVAT";
				
				}

				
			    public String PORCST;

				public String getPORCST () {
					return this.PORCST;
				}

				public Boolean PORCSTIsNullable(){
				    return true;
				}
				public Boolean PORCSTIsKey(){
				    return false;
				}
				public Integer PORCSTLength(){
				    return null;
				}
				public Integer PORCSTPrecision(){
				    return null;
				}
				public String PORCSTDefault(){
				
					return null;
				
				}
				public String PORCSTComment(){
				
				    return "";
				
				}
				public String PORCSTPattern(){
				
					return "";
				
				}
				public String PORCSTOriginalDbColumnName(){
				
					return "PORCST";
				
				}

				
			    public String POTPLT;

				public String getPOTPLT () {
					return this.POTPLT;
				}

				public Boolean POTPLTIsNullable(){
				    return true;
				}
				public Boolean POTPLTIsKey(){
				    return false;
				}
				public Integer POTPLTLength(){
				    return null;
				}
				public Integer POTPLTPrecision(){
				    return null;
				}
				public String POTPLTDefault(){
				
					return null;
				
				}
				public String POTPLTComment(){
				
				    return "";
				
				}
				public String POTPLTPattern(){
				
					return "";
				
				}
				public String POTPLTOriginalDbColumnName(){
				
					return "POTPLT";
				
				}

				
			    public String POCUBE;

				public String getPOCUBE () {
					return this.POCUBE;
				}

				public Boolean POCUBEIsNullable(){
				    return true;
				}
				public Boolean POCUBEIsKey(){
				    return false;
				}
				public Integer POCUBELength(){
				    return null;
				}
				public Integer POCUBEPrecision(){
				    return null;
				}
				public String POCUBEDefault(){
				
					return null;
				
				}
				public String POCUBEComment(){
				
				    return "";
				
				}
				public String POCUBEPattern(){
				
					return "";
				
				}
				public String POCUBEOriginalDbColumnName(){
				
					return "POCUBE";
				
				}

				
			    public String POPDWN;

				public String getPOPDWN () {
					return this.POPDWN;
				}

				public Boolean POPDWNIsNullable(){
				    return true;
				}
				public Boolean POPDWNIsKey(){
				    return false;
				}
				public Integer POPDWNLength(){
				    return null;
				}
				public Integer POPDWNPrecision(){
				    return null;
				}
				public String POPDWNDefault(){
				
					return null;
				
				}
				public String POPDWNComment(){
				
				    return "";
				
				}
				public String POPDWNPattern(){
				
					return "";
				
				}
				public String POPDWNOriginalDbColumnName(){
				
					return "POPDWN";
				
				}

				
			    public String SHPNUM;

				public String getSHPNUM () {
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
				
					return null;
				
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

				
			    public Double POPYCN;

				public Double getPOPYCN () {
					return this.POPYCN;
				}

				public Boolean POPYCNIsNullable(){
				    return true;
				}
				public Boolean POPYCNIsKey(){
				    return false;
				}
				public Integer POPYCNLength(){
				    return null;
				}
				public Integer POPYCNPrecision(){
				    return null;
				}
				public String POPYCNDefault(){
				
					return "";
				
				}
				public String POPYCNComment(){
				
				    return "";
				
				}
				public String POPYCNPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POPYCNOriginalDbColumnName(){
				
					return "POPYCN";
				
				}

				
			    public String POPYDT;

				public String getPOPYDT () {
					return this.POPYDT;
				}

				public Boolean POPYDTIsNullable(){
				    return true;
				}
				public Boolean POPYDTIsKey(){
				    return false;
				}
				public Integer POPYDTLength(){
				    return null;
				}
				public Integer POPYDTPrecision(){
				    return null;
				}
				public String POPYDTDefault(){
				
					return null;
				
				}
				public String POPYDTComment(){
				
				    return "";
				
				}
				public String POPYDTPattern(){
				
					return "";
				
				}
				public String POPYDTOriginalDbColumnName(){
				
					return "POPYDT";
				
				}

				
			    public String POMALS;

				public String getPOMALS () {
					return this.POMALS;
				}

				public Boolean POMALSIsNullable(){
				    return true;
				}
				public Boolean POMALSIsKey(){
				    return false;
				}
				public Integer POMALSLength(){
				    return null;
				}
				public Integer POMALSPrecision(){
				    return null;
				}
				public String POMALSDefault(){
				
					return null;
				
				}
				public String POMALSComment(){
				
				    return "";
				
				}
				public String POMALSPattern(){
				
					return "";
				
				}
				public String POMALSOriginalDbColumnName(){
				
					return "POMALS";
				
				}

				
			    public String POMALV;

				public String getPOMALV () {
					return this.POMALV;
				}

				public Boolean POMALVIsNullable(){
				    return true;
				}
				public Boolean POMALVIsKey(){
				    return false;
				}
				public Integer POMALVLength(){
				    return null;
				}
				public Integer POMALVPrecision(){
				    return null;
				}
				public String POMALVDefault(){
				
					return null;
				
				}
				public String POMALVComment(){
				
				    return "";
				
				}
				public String POMALVPattern(){
				
					return "";
				
				}
				public String POMALVOriginalDbColumnName(){
				
					return "POMALV";
				
				}

				
			    public String POMSPO;

				public String getPOMSPO () {
					return this.POMSPO;
				}

				public Boolean POMSPOIsNullable(){
				    return true;
				}
				public Boolean POMSPOIsKey(){
				    return false;
				}
				public Integer POMSPOLength(){
				    return null;
				}
				public Integer POMSPOPrecision(){
				    return null;
				}
				public String POMSPODefault(){
				
					return null;
				
				}
				public String POMSPOComment(){
				
				    return "";
				
				}
				public String POMSPOPattern(){
				
					return "";
				
				}
				public String POMSPOOriginalDbColumnName(){
				
					return "POMSPO";
				
				}

				
			    public String POMSBO;

				public String getPOMSBO () {
					return this.POMSBO;
				}

				public Boolean POMSBOIsNullable(){
				    return true;
				}
				public Boolean POMSBOIsKey(){
				    return false;
				}
				public Integer POMSBOLength(){
				    return null;
				}
				public Integer POMSBOPrecision(){
				    return null;
				}
				public String POMSBODefault(){
				
					return null;
				
				}
				public String POMSBOComment(){
				
				    return "";
				
				}
				public String POMSBOPattern(){
				
					return "";
				
				}
				public String POMSBOOriginalDbColumnName(){
				
					return "POMSBO";
				
				}

				
			    public String POLOAD;

				public String getPOLOAD () {
					return this.POLOAD;
				}

				public Boolean POLOADIsNullable(){
				    return true;
				}
				public Boolean POLOADIsKey(){
				    return false;
				}
				public Integer POLOADLength(){
				    return null;
				}
				public Integer POLOADPrecision(){
				    return null;
				}
				public String POLOADDefault(){
				
					return null;
				
				}
				public String POLOADComment(){
				
				    return "";
				
				}
				public String POLOADPattern(){
				
					return "";
				
				}
				public String POLOADOriginalDbColumnName(){
				
					return "POLOAD";
				
				}

				
			    public String POMCRT;

				public String getPOMCRT () {
					return this.POMCRT;
				}

				public Boolean POMCRTIsNullable(){
				    return true;
				}
				public Boolean POMCRTIsKey(){
				    return false;
				}
				public Integer POMCRTLength(){
				    return null;
				}
				public Integer POMCRTPrecision(){
				    return null;
				}
				public String POMCRTDefault(){
				
					return null;
				
				}
				public String POMCRTComment(){
				
				    return "";
				
				}
				public String POMCRTPattern(){
				
					return "";
				
				}
				public String POMCRTOriginalDbColumnName(){
				
					return "POMCRT";
				
				}

				
			    public String POMCDT;

				public String getPOMCDT () {
					return this.POMCDT;
				}

				public Boolean POMCDTIsNullable(){
				    return true;
				}
				public Boolean POMCDTIsKey(){
				    return false;
				}
				public Integer POMCDTLength(){
				    return null;
				}
				public Integer POMCDTPrecision(){
				    return null;
				}
				public String POMCDTDefault(){
				
					return null;
				
				}
				public String POMCDTComment(){
				
				    return "";
				
				}
				public String POMCDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POMCDTOriginalDbColumnName(){
				
					return "POMCDT";
				
				}

				
			    public String POQCKE;

				public String getPOQCKE () {
					return this.POQCKE;
				}

				public Boolean POQCKEIsNullable(){
				    return true;
				}
				public Boolean POQCKEIsKey(){
				    return false;
				}
				public Integer POQCKELength(){
				    return null;
				}
				public Integer POQCKEPrecision(){
				    return null;
				}
				public String POQCKEDefault(){
				
					return null;
				
				}
				public String POQCKEComment(){
				
				    return "";
				
				}
				public String POQCKEPattern(){
				
					return "";
				
				}
				public String POQCKEOriginalDbColumnName(){
				
					return "POQCKE";
				
				}

				
			    public String POMTYP;

				public String getPOMTYP () {
					return this.POMTYP;
				}

				public Boolean POMTYPIsNullable(){
				    return true;
				}
				public Boolean POMTYPIsKey(){
				    return false;
				}
				public Integer POMTYPLength(){
				    return null;
				}
				public Integer POMTYPPrecision(){
				    return null;
				}
				public String POMTYPDefault(){
				
					return null;
				
				}
				public String POMTYPComment(){
				
				    return "";
				
				}
				public String POMTYPPattern(){
				
					return "";
				
				}
				public String POMTYPOriginalDbColumnName(){
				
					return "POMTYP";
				
				}

				
			    public String PO850F;

				public String getPO850F () {
					return this.PO850F;
				}

				public Boolean PO850FIsNullable(){
				    return true;
				}
				public Boolean PO850FIsKey(){
				    return false;
				}
				public Integer PO850FLength(){
				    return null;
				}
				public Integer PO850FPrecision(){
				    return null;
				}
				public String PO850FDefault(){
				
					return null;
				
				}
				public String PO850FComment(){
				
				    return "";
				
				}
				public String PO850FPattern(){
				
					return "";
				
				}
				public String PO850FOriginalDbColumnName(){
				
					return "PO850F";
				
				}

				
			    public String PO860F;

				public String getPO860F () {
					return this.PO860F;
				}

				public Boolean PO860FIsNullable(){
				    return true;
				}
				public Boolean PO860FIsKey(){
				    return false;
				}
				public Integer PO860FLength(){
				    return null;
				}
				public Integer PO860FPrecision(){
				    return null;
				}
				public String PO860FDefault(){
				
					return null;
				
				}
				public String PO860FComment(){
				
				    return "";
				
				}
				public String PO860FPattern(){
				
					return "";
				
				}
				public String PO860FOriginalDbColumnName(){
				
					return "PO860F";
				
				}

				
			    public String POTPID;

				public String getPOTPID () {
					return this.POTPID;
				}

				public Boolean POTPIDIsNullable(){
				    return true;
				}
				public Boolean POTPIDIsKey(){
				    return false;
				}
				public Integer POTPIDLength(){
				    return null;
				}
				public Integer POTPIDPrecision(){
				    return null;
				}
				public String POTPIDDefault(){
				
					return null;
				
				}
				public String POTPIDComment(){
				
				    return "";
				
				}
				public String POTPIDPattern(){
				
					return "";
				
				}
				public String POTPIDOriginalDbColumnName(){
				
					return "POTPID";
				
				}

				
			    public Double POBSDT;

				public Double getPOBSDT () {
					return this.POBSDT;
				}

				public Boolean POBSDTIsNullable(){
				    return true;
				}
				public Boolean POBSDTIsKey(){
				    return false;
				}
				public Integer POBSDTLength(){
				    return null;
				}
				public Integer POBSDTPrecision(){
				    return null;
				}
				public String POBSDTDefault(){
				
					return "";
				
				}
				public String POBSDTComment(){
				
				    return "";
				
				}
				public String POBSDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POBSDTOriginalDbColumnName(){
				
					return "POBSDT";
				
				}

				
			    public Double POASDT;

				public Double getPOASDT () {
					return this.POASDT;
				}

				public Boolean POASDTIsNullable(){
				    return true;
				}
				public Boolean POASDTIsKey(){
				    return false;
				}
				public Integer POASDTLength(){
				    return null;
				}
				public Integer POASDTPrecision(){
				    return null;
				}
				public String POASDTDefault(){
				
					return "";
				
				}
				public String POASDTComment(){
				
				    return "";
				
				}
				public String POASDTPattern(){
				
					return "dd-MM-yyyy";
				
				}
				public String POASDTOriginalDbColumnName(){
				
					return "POASDT";
				
				}

				
			    public String POCODF;

				public String getPOCODF () {
					return this.POCODF;
				}

				public Boolean POCODFIsNullable(){
				    return true;
				}
				public Boolean POCODFIsKey(){
				    return false;
				}
				public Integer POCODFLength(){
				    return null;
				}
				public Integer POCODFPrecision(){
				    return null;
				}
				public String POCODFDefault(){
				
					return null;
				
				}
				public String POCODFComment(){
				
				    return "";
				
				}
				public String POCODFPattern(){
				
					return "";
				
				}
				public String POCODFOriginalDbColumnName(){
				
					return "POCODF";
				
				}

				
			    public String POCODT;

				public String getPOCODT () {
					return this.POCODT;
				}

				public Boolean POCODTIsNullable(){
				    return true;
				}
				public Boolean POCODTIsKey(){
				    return false;
				}
				public Integer POCODTLength(){
				    return null;
				}
				public Integer POCODTPrecision(){
				    return null;
				}
				public String POCODTDefault(){
				
					return null;
				
				}
				public String POCODTComment(){
				
				    return "";
				
				}
				public String POCODTPattern(){
				
					return "";
				
				}
				public String POCODTOriginalDbColumnName(){
				
					return "POCODT";
				
				}

				
			    public String POCVTP;

				public String getPOCVTP () {
					return this.POCVTP;
				}

				public Boolean POCVTPIsNullable(){
				    return true;
				}
				public Boolean POCVTPIsKey(){
				    return false;
				}
				public Integer POCVTPLength(){
				    return null;
				}
				public Integer POCVTPPrecision(){
				    return null;
				}
				public String POCVTPDefault(){
				
					return null;
				
				}
				public String POCVTPComment(){
				
				    return "";
				
				}
				public String POCVTPPattern(){
				
					return "";
				
				}
				public String POCVTPOriginalDbColumnName(){
				
					return "POCVTP";
				
				}

				
			    public String POCVMD;

				public String getPOCVMD () {
					return this.POCVMD;
				}

				public Boolean POCVMDIsNullable(){
				    return true;
				}
				public Boolean POCVMDIsKey(){
				    return false;
				}
				public Integer POCVMDLength(){
				    return null;
				}
				public Integer POCVMDPrecision(){
				    return null;
				}
				public String POCVMDDefault(){
				
					return null;
				
				}
				public String POCVMDComment(){
				
				    return "";
				
				}
				public String POCVMDPattern(){
				
					return "";
				
				}
				public String POCVMDOriginalDbColumnName(){
				
					return "POCVMD";
				
				}

				
			    public String POMCPY;

				public String getPOMCPY () {
					return this.POMCPY;
				}

				public Boolean POMCPYIsNullable(){
				    return true;
				}
				public Boolean POMCPYIsKey(){
				    return false;
				}
				public Integer POMCPYLength(){
				    return null;
				}
				public Integer POMCPYPrecision(){
				    return null;
				}
				public String POMCPYDefault(){
				
					return null;
				
				}
				public String POMCPYComment(){
				
				    return "";
				
				}
				public String POMCPYPattern(){
				
					return "";
				
				}
				public String POMCPYOriginalDbColumnName(){
				
					return "POMCPY";
				
				}

				
			    public String POUSER;

				public String getPOUSER () {
					return this.POUSER;
				}

				public Boolean POUSERIsNullable(){
				    return true;
				}
				public Boolean POUSERIsKey(){
				    return false;
				}
				public Integer POUSERLength(){
				    return null;
				}
				public Integer POUSERPrecision(){
				    return null;
				}
				public String POUSERDefault(){
				
					return null;
				
				}
				public String POUSERComment(){
				
				    return "";
				
				}
				public String POUSERPattern(){
				
					return "";
				
				}
				public String POUSEROriginalDbColumnName(){
				
					return "POUSER";
				
				}

				
			    public Double DATCUR;

				public Double getDATCUR () {
					return this.DATCUR;
				}

				public Boolean DATCURIsNullable(){
				    return true;
				}
				public Boolean DATCURIsKey(){
				    return false;
				}
				public Integer DATCURLength(){
				    return null;
				}
				public Integer DATCURPrecision(){
				    return null;
				}
				public String DATCURDefault(){
				
					return "";
				
				}
				public String DATCURComment(){
				
				    return "";
				
				}
				public String DATCURPattern(){
				
					return "";
				
				}
				public String DATCUROriginalDbColumnName(){
				
					return "DATCUR";
				
				}

				
			    public Double DATTIM;

				public Double getDATTIM () {
					return this.DATTIM;
				}

				public Boolean DATTIMIsNullable(){
				    return true;
				}
				public Boolean DATTIMIsKey(){
				    return false;
				}
				public Integer DATTIMLength(){
				    return null;
				}
				public Integer DATTIMPrecision(){
				    return null;
				}
				public String DATTIMDefault(){
				
					return "";
				
				}
				public String DATTIMComment(){
				
				    return "";
				
				}
				public String DATTIMPattern(){
				
					return "";
				
				}
				public String DATTIMOriginalDbColumnName(){
				
					return "DATTIM";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTT000CL1.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTT000CL1.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTT000CL1 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTT000CL1, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PONUMB = null;
           				} else {
           			    	this.PONUMB = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBON = null;
           				} else {
           			    	this.POBON = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POVNUM = null;
           				} else {
           			    	this.POVNUM = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POTRMS = null;
           				} else {
           			    	this.POTRMS = dis.readDouble();
           				}
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
					this.POSTOR = readString(dis);
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
					this.PODPT = readString(dis);
					
					this.POSDPT = readString(dis);
					
					this.POTHER = readString(dis);
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POEDAT = null;
           				} else {
           			    	this.POEDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POSDAT = null;
           				} else {
           			    	this.POSDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POCDAT = null;
           				} else {
           			    	this.POCDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PORDAT = null;
           				} else {
           			    	this.PORDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POLCHG = null;
           				} else {
           			    	this.POLCHG = dis.readDouble();
           				}
					
					this.PORFRQ = readString(dis);
					
					this.POLEAD = readString(dis);
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
					this.POCOST = readString(dis);
					
					this.POVAT = readString(dis);
					
					this.PORETL = readString(dis);
					
					this.POCASE = readString(dis);
					
					this.POUNTS = readString(dis);
					
					this.POWGHT = readString(dis);
					
					this.POTARP = readString(dis);
					
					this.POSTOP = readString(dis);
					
					this.POSKID = readString(dis);
					
					this.POOTHN = readString(dis);
					
					this.POOTHP = readString(dis);
					
					this.POBTCH = readString(dis);
					
					this.PORRET = readString(dis);
					
					this.PORVAT = readString(dis);
					
					this.PORCST = readString(dis);
					
					this.POTPLT = readString(dis);
					
					this.POCUBE = readString(dis);
					
					this.POPDWN = readString(dis);
					
					this.SHPNUM = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POPYCN = null;
           				} else {
           			    	this.POPYCN = dis.readDouble();
           				}
					
					this.POPYDT = readString(dis);
					
					this.POMALS = readString(dis);
					
					this.POMALV = readString(dis);
					
					this.POMSPO = readString(dis);
					
					this.POMSBO = readString(dis);
					
					this.POLOAD = readString(dis);
					
					this.POMCRT = readString(dis);
					
					this.POMCDT = readString(dis);
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBSDT = null;
           				} else {
           			    	this.POBSDT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POASDT = null;
           				} else {
           			    	this.POASDT = dis.readDouble();
           				}
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATCUR = null;
           				} else {
           			    	this.DATCUR = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATTIM = null;
           				} else {
           			    	this.DATTIM = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTT000CL1) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PONUMB = null;
           				} else {
           			    	this.PONUMB = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBON = null;
           				} else {
           			    	this.POBON = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POVNUM = null;
           				} else {
           			    	this.POVNUM = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POTRMS = null;
           				} else {
           			    	this.POTRMS = dis.readDouble();
           				}
					
					this.POTIND = readString(dis);
					
					this.POSTAT = readString(dis);
					
					this.POTYPE = readString(dis);
					
					this.PODEST = readString(dis);
					
					this.POSTOR = readString(dis);
					
					this.POADYN = readString(dis);
					
					this.PODMTH = readString(dis);
					
					this.POALBO = readString(dis);
					
					this.POCONF = readString(dis);
					
					this.POPHON = readString(dis);
					
					this.POBUYR = readString(dis);
					
					this.PODPT = readString(dis);
					
					this.POSDPT = readString(dis);
					
					this.POTHER = readString(dis);
					
					this.POFPCD = readString(dis);
					
					this.POFOB = readString(dis);
					
					this.POSHP1 = readString(dis);
					
					this.POSHP2 = readString(dis);
					
					this.POSHPP = readString(dis);
					
					this.POSHPC = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POEDAT = null;
           				} else {
           			    	this.POEDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POSDAT = null;
           				} else {
           			    	this.POSDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POCDAT = null;
           				} else {
           			    	this.POCDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.PORDAT = null;
           				} else {
           			    	this.PORDAT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POLCHG = null;
           				} else {
           			    	this.POLCHG = dis.readDouble();
           				}
					
					this.PORFRQ = readString(dis);
					
					this.POLEAD = readString(dis);
					
					this.POORIG = readString(dis);
					
					this.PONOT1 = readString(dis);
					
					this.PONOT2 = readString(dis);
					
					this.PONOT3 = readString(dis);
					
					this.POCOST = readString(dis);
					
					this.POVAT = readString(dis);
					
					this.PORETL = readString(dis);
					
					this.POCASE = readString(dis);
					
					this.POUNTS = readString(dis);
					
					this.POWGHT = readString(dis);
					
					this.POTARP = readString(dis);
					
					this.POSTOP = readString(dis);
					
					this.POSKID = readString(dis);
					
					this.POOTHN = readString(dis);
					
					this.POOTHP = readString(dis);
					
					this.POBTCH = readString(dis);
					
					this.PORRET = readString(dis);
					
					this.PORVAT = readString(dis);
					
					this.PORCST = readString(dis);
					
					this.POTPLT = readString(dis);
					
					this.POCUBE = readString(dis);
					
					this.POPDWN = readString(dis);
					
					this.SHPNUM = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POPYCN = null;
           				} else {
           			    	this.POPYCN = dis.readDouble();
           				}
					
					this.POPYDT = readString(dis);
					
					this.POMALS = readString(dis);
					
					this.POMALV = readString(dis);
					
					this.POMSPO = readString(dis);
					
					this.POMSBO = readString(dis);
					
					this.POLOAD = readString(dis);
					
					this.POMCRT = readString(dis);
					
					this.POMCDT = readString(dis);
					
					this.POQCKE = readString(dis);
					
					this.POMTYP = readString(dis);
					
					this.PO850F = readString(dis);
					
					this.PO860F = readString(dis);
					
					this.POTPID = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POBSDT = null;
           				} else {
           			    	this.POBSDT = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.POASDT = null;
           				} else {
           			    	this.POASDT = dis.readDouble();
           				}
					
					this.POCODF = readString(dis);
					
					this.POCODT = readString(dis);
					
					this.POCVTP = readString(dis);
					
					this.POCVMD = readString(dis);
					
					this.POMCPY = readString(dis);
					
					this.POUSER = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATCUR = null;
           				} else {
           			    	this.DATCUR = dis.readDouble();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.DATTIM = null;
           				} else {
           			    	this.DATTIM = dis.readDouble();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Double
				
						if(this.PONUMB == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PONUMB);
		            	}
					
					// Double
				
						if(this.POBON == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBON);
		            	}
					
					// Double
				
						if(this.POVNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POVNUM);
		            	}
					
					// Double
				
						if(this.POTRMS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POTRMS);
		            	}
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// String
				
						writeString(this.POSTOR,dos);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// String
				
						writeString(this.PODPT,dos);
					
					// String
				
						writeString(this.POSDPT,dos);
					
					// String
				
						writeString(this.POTHER,dos);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// Double
				
						if(this.POEDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POEDAT);
		            	}
					
					// Double
				
						if(this.POSDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POSDAT);
		            	}
					
					// Double
				
						if(this.POCDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POCDAT);
		            	}
					
					// Double
				
						if(this.PORDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PORDAT);
		            	}
					
					// Double
				
						if(this.POLCHG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POLCHG);
		            	}
					
					// String
				
						writeString(this.PORFRQ,dos);
					
					// String
				
						writeString(this.POLEAD,dos);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// String
				
						writeString(this.POCOST,dos);
					
					// String
				
						writeString(this.POVAT,dos);
					
					// String
				
						writeString(this.PORETL,dos);
					
					// String
				
						writeString(this.POCASE,dos);
					
					// String
				
						writeString(this.POUNTS,dos);
					
					// String
				
						writeString(this.POWGHT,dos);
					
					// String
				
						writeString(this.POTARP,dos);
					
					// String
				
						writeString(this.POSTOP,dos);
					
					// String
				
						writeString(this.POSKID,dos);
					
					// String
				
						writeString(this.POOTHN,dos);
					
					// String
				
						writeString(this.POOTHP,dos);
					
					// String
				
						writeString(this.POBTCH,dos);
					
					// String
				
						writeString(this.PORRET,dos);
					
					// String
				
						writeString(this.PORVAT,dos);
					
					// String
				
						writeString(this.PORCST,dos);
					
					// String
				
						writeString(this.POTPLT,dos);
					
					// String
				
						writeString(this.POCUBE,dos);
					
					// String
				
						writeString(this.POPDWN,dos);
					
					// String
				
						writeString(this.SHPNUM,dos);
					
					// Double
				
						if(this.POPYCN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POPYCN);
		            	}
					
					// String
				
						writeString(this.POPYDT,dos);
					
					// String
				
						writeString(this.POMALS,dos);
					
					// String
				
						writeString(this.POMALV,dos);
					
					// String
				
						writeString(this.POMSPO,dos);
					
					// String
				
						writeString(this.POMSBO,dos);
					
					// String
				
						writeString(this.POLOAD,dos);
					
					// String
				
						writeString(this.POMCRT,dos);
					
					// String
				
						writeString(this.POMCDT,dos);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// Double
				
						if(this.POBSDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBSDT);
		            	}
					
					// Double
				
						if(this.POASDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POASDT);
		            	}
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// Double
				
						if(this.DATCUR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATCUR);
		            	}
					
					// Double
				
						if(this.DATTIM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATTIM);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Double
				
						if(this.PONUMB == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PONUMB);
		            	}
					
					// Double
				
						if(this.POBON == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBON);
		            	}
					
					// Double
				
						if(this.POVNUM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POVNUM);
		            	}
					
					// Double
				
						if(this.POTRMS == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POTRMS);
		            	}
					
					// String
				
						writeString(this.POTIND,dos);
					
					// String
				
						writeString(this.POSTAT,dos);
					
					// String
				
						writeString(this.POTYPE,dos);
					
					// String
				
						writeString(this.PODEST,dos);
					
					// String
				
						writeString(this.POSTOR,dos);
					
					// String
				
						writeString(this.POADYN,dos);
					
					// String
				
						writeString(this.PODMTH,dos);
					
					// String
				
						writeString(this.POALBO,dos);
					
					// String
				
						writeString(this.POCONF,dos);
					
					// String
				
						writeString(this.POPHON,dos);
					
					// String
				
						writeString(this.POBUYR,dos);
					
					// String
				
						writeString(this.PODPT,dos);
					
					// String
				
						writeString(this.POSDPT,dos);
					
					// String
				
						writeString(this.POTHER,dos);
					
					// String
				
						writeString(this.POFPCD,dos);
					
					// String
				
						writeString(this.POFOB,dos);
					
					// String
				
						writeString(this.POSHP1,dos);
					
					// String
				
						writeString(this.POSHP2,dos);
					
					// String
				
						writeString(this.POSHPP,dos);
					
					// String
				
						writeString(this.POSHPC,dos);
					
					// Double
				
						if(this.POEDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POEDAT);
		            	}
					
					// Double
				
						if(this.POSDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POSDAT);
		            	}
					
					// Double
				
						if(this.POCDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POCDAT);
		            	}
					
					// Double
				
						if(this.PORDAT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.PORDAT);
		            	}
					
					// Double
				
						if(this.POLCHG == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POLCHG);
		            	}
					
					// String
				
						writeString(this.PORFRQ,dos);
					
					// String
				
						writeString(this.POLEAD,dos);
					
					// String
				
						writeString(this.POORIG,dos);
					
					// String
				
						writeString(this.PONOT1,dos);
					
					// String
				
						writeString(this.PONOT2,dos);
					
					// String
				
						writeString(this.PONOT3,dos);
					
					// String
				
						writeString(this.POCOST,dos);
					
					// String
				
						writeString(this.POVAT,dos);
					
					// String
				
						writeString(this.PORETL,dos);
					
					// String
				
						writeString(this.POCASE,dos);
					
					// String
				
						writeString(this.POUNTS,dos);
					
					// String
				
						writeString(this.POWGHT,dos);
					
					// String
				
						writeString(this.POTARP,dos);
					
					// String
				
						writeString(this.POSTOP,dos);
					
					// String
				
						writeString(this.POSKID,dos);
					
					// String
				
						writeString(this.POOTHN,dos);
					
					// String
				
						writeString(this.POOTHP,dos);
					
					// String
				
						writeString(this.POBTCH,dos);
					
					// String
				
						writeString(this.PORRET,dos);
					
					// String
				
						writeString(this.PORVAT,dos);
					
					// String
				
						writeString(this.PORCST,dos);
					
					// String
				
						writeString(this.POTPLT,dos);
					
					// String
				
						writeString(this.POCUBE,dos);
					
					// String
				
						writeString(this.POPDWN,dos);
					
					// String
				
						writeString(this.SHPNUM,dos);
					
					// Double
				
						if(this.POPYCN == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POPYCN);
		            	}
					
					// String
				
						writeString(this.POPYDT,dos);
					
					// String
				
						writeString(this.POMALS,dos);
					
					// String
				
						writeString(this.POMALV,dos);
					
					// String
				
						writeString(this.POMSPO,dos);
					
					// String
				
						writeString(this.POMSBO,dos);
					
					// String
				
						writeString(this.POLOAD,dos);
					
					// String
				
						writeString(this.POMCRT,dos);
					
					// String
				
						writeString(this.POMCDT,dos);
					
					// String
				
						writeString(this.POQCKE,dos);
					
					// String
				
						writeString(this.POMTYP,dos);
					
					// String
				
						writeString(this.PO850F,dos);
					
					// String
				
						writeString(this.PO860F,dos);
					
					// String
				
						writeString(this.POTPID,dos);
					
					// Double
				
						if(this.POBSDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POBSDT);
		            	}
					
					// Double
				
						if(this.POASDT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.POASDT);
		            	}
					
					// String
				
						writeString(this.POCODF,dos);
					
					// String
				
						writeString(this.POCODT,dos);
					
					// String
				
						writeString(this.POCVTP,dos);
					
					// String
				
						writeString(this.POCVMD,dos);
					
					// String
				
						writeString(this.POMCPY,dos);
					
					// String
				
						writeString(this.POUSER,dos);
					
					// Double
				
						if(this.DATCUR == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATCUR);
		            	}
					
					// Double
				
						if(this.DATTIM == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeDouble(this.DATTIM);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("PONUMB="+String.valueOf(PONUMB));
		sb.append(",POBON="+String.valueOf(POBON));
		sb.append(",POVNUM="+String.valueOf(POVNUM));
		sb.append(",POTRMS="+String.valueOf(POTRMS));
		sb.append(",POTIND="+POTIND);
		sb.append(",POSTAT="+POSTAT);
		sb.append(",POTYPE="+POTYPE);
		sb.append(",PODEST="+PODEST);
		sb.append(",POSTOR="+POSTOR);
		sb.append(",POADYN="+POADYN);
		sb.append(",PODMTH="+PODMTH);
		sb.append(",POALBO="+POALBO);
		sb.append(",POCONF="+POCONF);
		sb.append(",POPHON="+POPHON);
		sb.append(",POBUYR="+POBUYR);
		sb.append(",PODPT="+PODPT);
		sb.append(",POSDPT="+POSDPT);
		sb.append(",POTHER="+POTHER);
		sb.append(",POFPCD="+POFPCD);
		sb.append(",POFOB="+POFOB);
		sb.append(",POSHP1="+POSHP1);
		sb.append(",POSHP2="+POSHP2);
		sb.append(",POSHPP="+POSHPP);
		sb.append(",POSHPC="+POSHPC);
		sb.append(",POEDAT="+String.valueOf(POEDAT));
		sb.append(",POSDAT="+String.valueOf(POSDAT));
		sb.append(",POCDAT="+String.valueOf(POCDAT));
		sb.append(",PORDAT="+String.valueOf(PORDAT));
		sb.append(",POLCHG="+String.valueOf(POLCHG));
		sb.append(",PORFRQ="+PORFRQ);
		sb.append(",POLEAD="+POLEAD);
		sb.append(",POORIG="+POORIG);
		sb.append(",PONOT1="+PONOT1);
		sb.append(",PONOT2="+PONOT2);
		sb.append(",PONOT3="+PONOT3);
		sb.append(",POCOST="+POCOST);
		sb.append(",POVAT="+POVAT);
		sb.append(",PORETL="+PORETL);
		sb.append(",POCASE="+POCASE);
		sb.append(",POUNTS="+POUNTS);
		sb.append(",POWGHT="+POWGHT);
		sb.append(",POTARP="+POTARP);
		sb.append(",POSTOP="+POSTOP);
		sb.append(",POSKID="+POSKID);
		sb.append(",POOTHN="+POOTHN);
		sb.append(",POOTHP="+POOTHP);
		sb.append(",POBTCH="+POBTCH);
		sb.append(",PORRET="+PORRET);
		sb.append(",PORVAT="+PORVAT);
		sb.append(",PORCST="+PORCST);
		sb.append(",POTPLT="+POTPLT);
		sb.append(",POCUBE="+POCUBE);
		sb.append(",POPDWN="+POPDWN);
		sb.append(",SHPNUM="+SHPNUM);
		sb.append(",POPYCN="+String.valueOf(POPYCN));
		sb.append(",POPYDT="+POPYDT);
		sb.append(",POMALS="+POMALS);
		sb.append(",POMALV="+POMALV);
		sb.append(",POMSPO="+POMSPO);
		sb.append(",POMSBO="+POMSBO);
		sb.append(",POLOAD="+POLOAD);
		sb.append(",POMCRT="+POMCRT);
		sb.append(",POMCDT="+POMCDT);
		sb.append(",POQCKE="+POQCKE);
		sb.append(",POMTYP="+POMTYP);
		sb.append(",PO850F="+PO850F);
		sb.append(",PO860F="+PO860F);
		sb.append(",POTPID="+POTPID);
		sb.append(",POBSDT="+String.valueOf(POBSDT));
		sb.append(",POASDT="+String.valueOf(POASDT));
		sb.append(",POCODF="+POCODF);
		sb.append(",POCODT="+POCODT);
		sb.append(",POCVTP="+POCVTP);
		sb.append(",POCVMD="+POCVMD);
		sb.append(",POMCPY="+POMCPY);
		sb.append(",POUSER="+POUSER);
		sb.append(",DATCUR="+String.valueOf(DATCUR));
		sb.append(",DATTIM="+String.valueOf(DATTIM));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(PONUMB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONUMB);
            			}
            		
        			sb.append("|");
        		
        				if(POBON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBON);
            			}
            		
        			sb.append("|");
        		
        				if(POVNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POVNUM);
            			}
            		
        			sb.append("|");
        		
        				if(POTRMS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTRMS);
            			}
            		
        			sb.append("|");
        		
        				if(POTIND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTIND);
            			}
            		
        			sb.append("|");
        		
        				if(POSTAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTAT);
            			}
            		
        			sb.append("|");
        		
        				if(POTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PODEST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODEST);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOR);
            			}
            		
        			sb.append("|");
        		
        				if(POADYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POADYN);
            			}
            		
        			sb.append("|");
        		
        				if(PODMTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODMTH);
            			}
            		
        			sb.append("|");
        		
        				if(POALBO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POALBO);
            			}
            		
        			sb.append("|");
        		
        				if(POCONF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCONF);
            			}
            		
        			sb.append("|");
        		
        				if(POPHON == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPHON);
            			}
            		
        			sb.append("|");
        		
        				if(POBUYR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBUYR);
            			}
            		
        			sb.append("|");
        		
        				if(PODPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PODPT);
            			}
            		
        			sb.append("|");
        		
        				if(POSDPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSDPT);
            			}
            		
        			sb.append("|");
        		
        				if(POTHER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTHER);
            			}
            		
        			sb.append("|");
        		
        				if(POFPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFPCD);
            			}
            		
        			sb.append("|");
        		
        				if(POFOB == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POFOB);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP1);
            			}
            		
        			sb.append("|");
        		
        				if(POSHP2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHP2);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPP);
            			}
            		
        			sb.append("|");
        		
        				if(POSHPC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSHPC);
            			}
            		
        			sb.append("|");
        		
        				if(POEDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POEDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POSDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POCDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCDAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORDAT);
            			}
            		
        			sb.append("|");
        		
        				if(POLCHG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLCHG);
            			}
            		
        			sb.append("|");
        		
        				if(PORFRQ == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORFRQ);
            			}
            		
        			sb.append("|");
        		
        				if(POLEAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLEAD);
            			}
            		
        			sb.append("|");
        		
        				if(POORIG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POORIG);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT1 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT1);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT2 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT2);
            			}
            		
        			sb.append("|");
        		
        				if(PONOT3 == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PONOT3);
            			}
            		
        			sb.append("|");
        		
        				if(POCOST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCOST);
            			}
            		
        			sb.append("|");
        		
        				if(POVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORETL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORETL);
            			}
            		
        			sb.append("|");
        		
        				if(POCASE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCASE);
            			}
            		
        			sb.append("|");
        		
        				if(POUNTS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUNTS);
            			}
            		
        			sb.append("|");
        		
        				if(POWGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POWGHT);
            			}
            		
        			sb.append("|");
        		
        				if(POTARP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTARP);
            			}
            		
        			sb.append("|");
        		
        				if(POSTOP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSTOP);
            			}
            		
        			sb.append("|");
        		
        				if(POSKID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POSKID);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHN);
            			}
            		
        			sb.append("|");
        		
        				if(POOTHP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POOTHP);
            			}
            		
        			sb.append("|");
        		
        				if(POBTCH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBTCH);
            			}
            		
        			sb.append("|");
        		
        				if(PORRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORRET);
            			}
            		
        			sb.append("|");
        		
        				if(PORVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORVAT);
            			}
            		
        			sb.append("|");
        		
        				if(PORCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PORCST);
            			}
            		
        			sb.append("|");
        		
        				if(POTPLT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPLT);
            			}
            		
        			sb.append("|");
        		
        				if(POCUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCUBE);
            			}
            		
        			sb.append("|");
        		
        				if(POPDWN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPDWN);
            			}
            		
        			sb.append("|");
        		
        				if(SHPNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SHPNUM);
            			}
            		
        			sb.append("|");
        		
        				if(POPYCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPYCN);
            			}
            		
        			sb.append("|");
        		
        				if(POPYDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POPYDT);
            			}
            		
        			sb.append("|");
        		
        				if(POMALS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALS);
            			}
            		
        			sb.append("|");
        		
        				if(POMALV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMALV);
            			}
            		
        			sb.append("|");
        		
        				if(POMSPO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMSPO);
            			}
            		
        			sb.append("|");
        		
        				if(POMSBO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMSBO);
            			}
            		
        			sb.append("|");
        		
        				if(POLOAD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POLOAD);
            			}
            		
        			sb.append("|");
        		
        				if(POMCRT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCRT);
            			}
            		
        			sb.append("|");
        		
        				if(POMCDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCDT);
            			}
            		
        			sb.append("|");
        		
        				if(POQCKE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POQCKE);
            			}
            		
        			sb.append("|");
        		
        				if(POMTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMTYP);
            			}
            		
        			sb.append("|");
        		
        				if(PO850F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO850F);
            			}
            		
        			sb.append("|");
        		
        				if(PO860F == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PO860F);
            			}
            		
        			sb.append("|");
        		
        				if(POTPID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POTPID);
            			}
            		
        			sb.append("|");
        		
        				if(POBSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POBSDT);
            			}
            		
        			sb.append("|");
        		
        				if(POASDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POASDT);
            			}
            		
        			sb.append("|");
        		
        				if(POCODF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODF);
            			}
            		
        			sb.append("|");
        		
        				if(POCODT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCODT);
            			}
            		
        			sb.append("|");
        		
        				if(POCVTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVTP);
            			}
            		
        			sb.append("|");
        		
        				if(POCVMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POCVMD);
            			}
            		
        			sb.append("|");
        		
        				if(POMCPY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POMCPY);
            			}
            		
        			sb.append("|");
        		
        				if(POUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(POUSER);
            			}
            		
        			sb.append("|");
        		
        				if(DATCUR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATCUR);
            			}
            		
        			sb.append("|");
        		
        				if(DATTIM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATTIM);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row9Struct other) {

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
public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_2");
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



		row9Struct row9 = new row9Struct();
POMHDHStruct POMHDH = new POMHDHStruct();





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"POMHDH");
			
		int tos_count_tDBOutput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_2", "tDBOutput_2", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_2 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_2 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_2 = (String)(restRequest_tDBOutput_2 != null ? restRequest_tDBOutput_2.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_2 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_2 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_2 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_2 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_2.createRuntimeProperties();
 		                    props_tDBOutput_2.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);
 		                    
 		                    props_tDBOutput_2.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_2.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_2.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_2.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_2.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_2_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_2_1_fisrt sst_tDBOutput_2_1_fisrt = new SchemaSettingTool_tDBOutput_2_1_fisrt();
 		                    
 		                    props_tDBOutput_2.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_2_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_2.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_2.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_2.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_2.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_2.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_2.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_2.table.setValue("tableName",
 		                    "PO_HEADER_HISTORY_POMHDH");
 		                    
 		                    props_tDBOutput_2.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_2.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_2.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_2.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_2.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_2_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBOutput_2\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"PONUMB\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PONUMB\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PONUMB\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POBON\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"POBON\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POBON\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POVNUM\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"POVNUM\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POVNUM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTRMS\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"POTRMS\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTRMS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTIND\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTIND\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTIND\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSTAT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSTAT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSTAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTYPE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTYPE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTYPE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PODEST\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PODEST\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PODEST\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSTOR\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSTOR\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSTOR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POADYN\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POADYN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POADYN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PODMTH\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PODMTH\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PODMTH\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POALBO\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POALBO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POALBO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCONF\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCONF\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCONF\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POPHON\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POPHON\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POPHON\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POBUYR\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POBUYR\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POBUYR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PODPT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PODPT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PODPT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSDPT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSDPT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSDPT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTHER\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTHER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTHER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POFPCD\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POFPCD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POFPCD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POFOB\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POFOB\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POFOB\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSHP1\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSHP1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSHP1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSHP2\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSHP2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSHP2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSHPP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSHPP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSHPP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSHPC\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSHPC\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSHPC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POEDAT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POEDAT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POEDAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSDAT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"POSDAT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSDAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCDAT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCDAT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCDAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORDAT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"PORDAT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORDAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POLCHG\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"POLCHG\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POLCHG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORFRQ\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PORFRQ\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORFRQ\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POLEAD\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POLEAD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POLEAD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POORIG\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POORIG\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POORIG\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PONOT1\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PONOT1\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PONOT1\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PONOT2\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PONOT2\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PONOT2\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PONOT3\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PONOT3\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PONOT3\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCOST\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCOST\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCOST\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POVAT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POVAT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POVAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORETL\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PORETL\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORETL\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCASE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCASE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCASE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POUNTS\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POUNTS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POUNTS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POWGHT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POWGHT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POWGHT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTARP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTARP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTARP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSTOP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSTOP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSTOP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POSKID\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POSKID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POSKID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POOTHN\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POOTHN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POOTHN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POOTHP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POOTHP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POOTHP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POBTCH\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POBTCH\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POBTCH\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORRET\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PORRET\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORRET\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORVAT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PORVAT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORVAT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PORCST\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PORCST\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PORCST\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTPLT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTPLT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTPLT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCUBE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCUBE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCUBE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POPDWN\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POPDWN\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POPDWN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SHPNUM\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"SHPNUM\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SHPNUM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POPYCN\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POPYCN\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"dd-MM-yyyy\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POPYCN\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POPYDT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POPYDT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POPYDT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMALS\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMALS\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMALS\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMALV\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMALV\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMALV\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMSPO\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMSPO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMSPO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMSBO\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMSBO\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMSBO\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POLOAD\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POLOAD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POLOAD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMCRT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMCRT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMCRT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMCDT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMCDT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"dd-MM-yyyy\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMCDT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POQCKE\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POQCKE\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POQCKE\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMTYP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMTYP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMTYP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PO850F\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PO850F\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PO850F\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"PO860F\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"PO860F\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"PO860F\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POTPID\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POTPID\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POTPID\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POBSDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POBSDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"dd-MM-yyyy\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POBSDT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POASDT\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POASDT\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"dd-MM-yyyy\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POASDT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCODF\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCODF\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCODF\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCODT\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCODT\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCODT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCVTP\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCVTP\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCVTP\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POCVMD\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POCVMD\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POCVMD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POMCPY\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POMCPY\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POMCPY\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"POUSER\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"POUSER\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"POUSER\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATCUR\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"DATCUR\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DATCUR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATTIM\",\"type\":[\"double\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"DATTIM\",\"di.column.talendType\":\"id_Double\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"DATTIM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"long\",\"java-class\":\"java.util.Date\"},\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"LOAD_DATE\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOAD_DATE\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBOutput_2\",\"di.table.label\":\"tDBOutput_2\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_2_2_fisrt sst_tDBOutput_2_2_fisrt = new SchemaSettingTool_tDBOutput_2_2_fisrt();
 		                    
 		                    props_tDBOutput_2.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_2_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_2.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_2 = props_tDBOutput_2.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_2.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_2);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_2.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_2 = props_tDBOutput_2.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_2.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_2);
        }
    }
globalMap.put("tDBOutput_2_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_2= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_2_MAPPINGS_URL", mappings_url_tDBOutput_2);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_2 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_2";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_2 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_2 = null;
topology_tDBOutput_2 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_2 = def_tDBOutput_2.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_2, topology_tDBOutput_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_2 = def_tDBOutput_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_2 = componentRuntime_tDBOutput_2.initialize(container_tDBOutput_2, props_tDBOutput_2);

if (initVr_tDBOutput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_2.getMessage());
}

if(componentRuntime_tDBOutput_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_2;
	compDriverInitialization_tDBOutput_2.runAtDriver(container_tDBOutput_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_2 = null;
if(componentRuntime_tDBOutput_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_2;
	if (doesNodeBelongToRequest_tDBOutput_2) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_2 = sourceOrSink_tDBOutput_2.validate(container_tDBOutput_2);
        if (vr_tDBOutput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_2.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_2 = null;
    if (sourceOrSink_tDBOutput_2 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_2 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_2;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_2 = sink_tDBOutput_2.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_2) {
            writeOperation_tDBOutput_2.initialize(container_tDBOutput_2);
        }
        writer_tDBOutput_2 = writeOperation_tDBOutput_2.createWriter(container_tDBOutput_2);
        if (doesNodeBelongToRequest_tDBOutput_2) {
            writer_tDBOutput_2.open("tDBOutput_2");
        }

        resourceMap.put("writer_tDBOutput_2", writer_tDBOutput_2);
    } // end of "sourceOrSink_tDBOutput_2 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_2 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_2.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_2 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_2 = props_tDBOutput_2.getSchema(c_tDBOutput_2, false);
    incomingEnforcer_tDBOutput_2 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_2);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_2 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_2 = null;


 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
		int tos_count_tMap_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_2 = new StringBuilder();
                    log4jParamters_tMap_2.append("Parameters:");
                            log4jParamters_tMap_2.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + (log4jParamters_tMap_2) );
                    } 
                } 
            new BytesLimit65535_tMap_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_2", "tMap_2", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row9_tMap_2 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
	java.util.Date var1;
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_POMHDH_tMap_2 = 0;
				
POMHDHStruct POMHDH_tmp = new POMHDHStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";
	
	
		int tos_count_tFileInputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_2.append("Parameters:");
                            log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "\"/data/talend/data_repository/POMHDH.txt\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("PONUMB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POVNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTRMS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTIND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODEST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POADYN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODMTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POALBO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCONF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPHON")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBUYR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PODPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSDPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTHER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POFPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POFOB")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHP1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHP2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHPP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSHPC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POEDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLCHG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORFRQ")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLEAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POORIG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT1")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT2")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PONOT3")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCOST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORETL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCASE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POUNTS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POWGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTARP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSTOP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POSKID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POOTHN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POOTHP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBTCH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PORCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTPLT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCUBE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPDWN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SHPNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPYCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POPYDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMALS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMALV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMSPO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMSBO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POLOAD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCRT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POQCKE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMTYP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PO850F")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PO860F")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POTPID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POBSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POASDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCODF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCODT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCVTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POCVMD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POMCPY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("POUSER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATCUR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATTIM")+"}]");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + (log4jParamters_tFileInputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_2", "tFileInputDelimited_2", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				int limit_tFileInputDelimited_2 = -1;
				try{
					
						Object filename_tFileInputDelimited_2 = "/data/talend/data_repository/POMHDH.txt";
						if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0, random_value_tFileInputDelimited_2 = -1;
			if(footer_value_tFileInputDelimited_2 >0 || random_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited("/data/talend/data_repository/POMHDH.txt", "ISO-8859-15","|","\n",false,1,0,
									limit_tFileInputDelimited_2
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
					
				    
				    	log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_2!=null && fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();
						
			    						row9 = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									row9 = new row9Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.PONUMB = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"PONUMB", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.PONUMB = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 1;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POBON = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POBON", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POBON = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 2;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POVNUM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POVNUM", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POVNUM = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 3;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POTRMS = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POTRMS", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POTRMS = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 4;
					
							row9.POTIND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 5;
					
							row9.POSTAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 6;
					
							row9.POTYPE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 7;
					
							row9.PODEST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 8;
					
							row9.POSTOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 9;
					
							row9.POADYN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 10;
					
							row9.PODMTH = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 11;
					
							row9.POALBO = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 12;
					
							row9.POCONF = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 13;
					
							row9.POPHON = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 14;
					
							row9.POBUYR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 15;
					
							row9.PODPT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 16;
					
							row9.POSDPT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 17;
					
							row9.POTHER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 18;
					
							row9.POFPCD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 19;
					
							row9.POFOB = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 20;
					
							row9.POSHP1 = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 21;
					
							row9.POSHP2 = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 22;
					
							row9.POSHPP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 23;
					
							row9.POSHPC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 24;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POEDAT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POEDAT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POEDAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 25;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POSDAT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POSDAT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POSDAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 26;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POCDAT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POCDAT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POCDAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 27;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.PORDAT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"PORDAT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.PORDAT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 28;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POLCHG = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POLCHG", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POLCHG = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 29;
					
							row9.PORFRQ = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 30;
					
							row9.POLEAD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 31;
					
							row9.POORIG = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 32;
					
							row9.PONOT1 = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 33;
					
							row9.PONOT2 = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 34;
					
							row9.PONOT3 = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 35;
					
							row9.POCOST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 36;
					
							row9.POVAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 37;
					
							row9.PORETL = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 38;
					
							row9.POCASE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 39;
					
							row9.POUNTS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 40;
					
							row9.POWGHT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 41;
					
							row9.POTARP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 42;
					
							row9.POSTOP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 43;
					
							row9.POSKID = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 44;
					
							row9.POOTHN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 45;
					
							row9.POOTHP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 46;
					
							row9.POBTCH = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 47;
					
							row9.PORRET = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 48;
					
							row9.PORVAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 49;
					
							row9.PORCST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 50;
					
							row9.POTPLT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 51;
					
							row9.POCUBE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 52;
					
							row9.POPDWN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 53;
					
							row9.SHPNUM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 54;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POPYCN = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POPYCN", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POPYCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 55;
					
							row9.POPYDT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 56;
					
							row9.POMALS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 57;
					
							row9.POMALV = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 58;
					
							row9.POMSPO = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 59;
					
							row9.POMSBO = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 60;
					
							row9.POLOAD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 61;
					
							row9.POMCRT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 62;
					
							row9.POMCDT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 63;
					
							row9.POQCKE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 64;
					
							row9.POMTYP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 65;
					
							row9.PO850F = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 66;
					
							row9.PO860F = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 67;
					
							row9.POTPID = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 68;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POBSDT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POBSDT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POBSDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 69;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.POASDT = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"POASDT", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.POASDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 70;
					
							row9.POCODF = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 71;
					
							row9.POCODT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 72;
					
							row9.POCVTP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 73;
					
							row9.POCVMD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 74;
					
							row9.POMCPY = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 75;
					
							row9.POUSER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 76;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.DATCUR = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"DATCUR", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.DATCUR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 77;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row9.DATTIM = ParserUtils.parseTo_Double(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"DATTIM", "row9", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row9.DATTIM = null;
								
							
						}
					
				
				
										
										if(rowstate_tFileInputDelimited_2.getException()!=null) {
											throw rowstate_tFileInputDelimited_2.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_2 = true;
			        					
			            					throw(e);
			            				
			    					}
								
			log.debug("tFileInputDelimited_2 - Retrieving the record " + fid_tFileInputDelimited_2.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 process_data_begin ] stop
 */
// Start of branch "row9"
if(row9 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row9","tFileInputDelimited_2","tFileInputDelimited_2","tFileInputDelimited","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_2 = false;
		boolean mainRowRejected_tMap_2 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;
Var.var1 = TalendDate.addDate(TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")), -1 ,"DD") ;// ###############################
        // ###############################
        // # Output tables

POMHDH = null;


// # Output table : 'POMHDH'
count_POMHDH_tMap_2++;

POMHDH_tmp.PONUMB = row9.PONUMB;
POMHDH_tmp.POBON = row9.POBON;
POMHDH_tmp.POVNUM = row9.POVNUM;
POMHDH_tmp.POTRMS = row9.POTRMS;
POMHDH_tmp.POTIND = row9.POTIND;
POMHDH_tmp.POSTAT = row9.POSTAT;
POMHDH_tmp.POTYPE = row9.POTYPE;
POMHDH_tmp.PODEST = row9.PODEST;
POMHDH_tmp.POSTOR = row9.POSTOR;
POMHDH_tmp.POADYN = row9.POADYN;
POMHDH_tmp.PODMTH = row9.PODMTH;
POMHDH_tmp.POALBO = row9.POALBO;
POMHDH_tmp.POCONF = row9.POCONF;
POMHDH_tmp.POPHON = row9.POPHON;
POMHDH_tmp.POBUYR = row9.POBUYR;
POMHDH_tmp.PODPT = row9.PODPT;
POMHDH_tmp.POSDPT = row9.POSDPT;
POMHDH_tmp.POTHER = row9.POTHER;
POMHDH_tmp.POFPCD = row9.POFPCD;
POMHDH_tmp.POFOB = row9.POFOB;
POMHDH_tmp.POSHP1 = row9.POSHP1;
POMHDH_tmp.POSHP2 = row9.POSHP2;
POMHDH_tmp.POSHPP = row9.POSHPP;
POMHDH_tmp.POSHPC = row9.POSHPC;
POMHDH_tmp.POEDAT = row9.POEDAT;
POMHDH_tmp.POSDAT = row9.POSDAT;
POMHDH_tmp.POCDAT = row9.POCDAT;
POMHDH_tmp.PORDAT = row9.PORDAT;
POMHDH_tmp.POLCHG = row9.POLCHG;
POMHDH_tmp.PORFRQ = row9.PORFRQ;
POMHDH_tmp.POLEAD = row9.POLEAD;
POMHDH_tmp.POORIG = row9.POORIG;
POMHDH_tmp.PONOT1 = row9.PONOT1;
POMHDH_tmp.PONOT2 = row9.PONOT2;
POMHDH_tmp.PONOT3 = row9.PONOT3;
POMHDH_tmp.POCOST = row9.POCOST;
POMHDH_tmp.POVAT = row9.POVAT;
POMHDH_tmp.PORETL = row9.PORETL;
POMHDH_tmp.POCASE = row9.POCASE;
POMHDH_tmp.POUNTS = row9.POUNTS;
POMHDH_tmp.POWGHT = row9.POWGHT;
POMHDH_tmp.POTARP = row9.POTARP;
POMHDH_tmp.POSTOP = row9.POSTOP;
POMHDH_tmp.POSKID = row9.POSKID;
POMHDH_tmp.POOTHN = row9.POOTHN;
POMHDH_tmp.POOTHP = row9.POOTHP;
POMHDH_tmp.POBTCH = row9.POBTCH;
POMHDH_tmp.PORRET = row9.PORRET;
POMHDH_tmp.PORVAT = row9.PORVAT;
POMHDH_tmp.PORCST = row9.PORCST;
POMHDH_tmp.POTPLT = row9.POTPLT;
POMHDH_tmp.POCUBE = row9.POCUBE;
POMHDH_tmp.POPDWN = row9.POPDWN;
POMHDH_tmp.SHPNUM = row9.SHPNUM;
POMHDH_tmp.POPYCN = row9.POPYCN;
POMHDH_tmp.POPYDT = row9.POPYDT;
POMHDH_tmp.POMALS = row9.POMALS;
POMHDH_tmp.POMALV = row9.POMALV;
POMHDH_tmp.POMSPO = row9.POMSPO;
POMHDH_tmp.POMSBO = row9.POMSBO;
POMHDH_tmp.POLOAD = row9.POLOAD;
POMHDH_tmp.POMCRT = row9.POMCRT;
POMHDH_tmp.POMCDT = row9.POMCDT;
POMHDH_tmp.POQCKE = row9.POQCKE;
POMHDH_tmp.POMTYP = row9.POMTYP;
POMHDH_tmp.PO850F = row9.PO850F;
POMHDH_tmp.PO860F = row9.PO860F;
POMHDH_tmp.POTPID = row9.POTPID;
POMHDH_tmp.POBSDT = row9.POBSDT;
POMHDH_tmp.POASDT = row9.POASDT;
POMHDH_tmp.POCODF = row9.POCODF;
POMHDH_tmp.POCODT = row9.POCODT;
POMHDH_tmp.POCVTP = row9.POCVTP;
POMHDH_tmp.POCVMD = row9.POCVMD;
POMHDH_tmp.POMCPY = row9.POMCPY;
POMHDH_tmp.POUSER = row9.POUSER;
POMHDH_tmp.DATCUR = row9.DATCUR;
POMHDH_tmp.DATTIM = row9.DATTIM;
POMHDH_tmp.LOAD_DATE = Var.var1 ;
POMHDH = POMHDH_tmp;
log.debug("tMap_2 - Outputting the record " + count_POMHDH_tMap_2 + " of the output table 'POMHDH'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "POMHDH"
if(POMHDH != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"POMHDH","tMap_2","tMap_2","tMap","tDBOutput_2","tDBOutput_2","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("POMHDH - " + (POMHDH==null? "": POMHDH.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_2 != null) {
            incomingEnforcer_tDBOutput_2.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PONUMB") != null){
                    incomingEnforcer_tDBOutput_2.put("PONUMB", POMHDH.PONUMB);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POBON") != null){
                    incomingEnforcer_tDBOutput_2.put("POBON", POMHDH.POBON);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POVNUM") != null){
                    incomingEnforcer_tDBOutput_2.put("POVNUM", POMHDH.POVNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTRMS") != null){
                    incomingEnforcer_tDBOutput_2.put("POTRMS", POMHDH.POTRMS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTIND") != null){
                    incomingEnforcer_tDBOutput_2.put("POTIND", POMHDH.POTIND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSTAT") != null){
                    incomingEnforcer_tDBOutput_2.put("POSTAT", POMHDH.POSTAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTYPE") != null){
                    incomingEnforcer_tDBOutput_2.put("POTYPE", POMHDH.POTYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PODEST") != null){
                    incomingEnforcer_tDBOutput_2.put("PODEST", POMHDH.PODEST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSTOR") != null){
                    incomingEnforcer_tDBOutput_2.put("POSTOR", POMHDH.POSTOR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POADYN") != null){
                    incomingEnforcer_tDBOutput_2.put("POADYN", POMHDH.POADYN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PODMTH") != null){
                    incomingEnforcer_tDBOutput_2.put("PODMTH", POMHDH.PODMTH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POALBO") != null){
                    incomingEnforcer_tDBOutput_2.put("POALBO", POMHDH.POALBO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCONF") != null){
                    incomingEnforcer_tDBOutput_2.put("POCONF", POMHDH.POCONF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POPHON") != null){
                    incomingEnforcer_tDBOutput_2.put("POPHON", POMHDH.POPHON);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POBUYR") != null){
                    incomingEnforcer_tDBOutput_2.put("POBUYR", POMHDH.POBUYR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PODPT") != null){
                    incomingEnforcer_tDBOutput_2.put("PODPT", POMHDH.PODPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSDPT") != null){
                    incomingEnforcer_tDBOutput_2.put("POSDPT", POMHDH.POSDPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTHER") != null){
                    incomingEnforcer_tDBOutput_2.put("POTHER", POMHDH.POTHER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POFPCD") != null){
                    incomingEnforcer_tDBOutput_2.put("POFPCD", POMHDH.POFPCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POFOB") != null){
                    incomingEnforcer_tDBOutput_2.put("POFOB", POMHDH.POFOB);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSHP1") != null){
                    incomingEnforcer_tDBOutput_2.put("POSHP1", POMHDH.POSHP1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSHP2") != null){
                    incomingEnforcer_tDBOutput_2.put("POSHP2", POMHDH.POSHP2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSHPP") != null){
                    incomingEnforcer_tDBOutput_2.put("POSHPP", POMHDH.POSHPP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSHPC") != null){
                    incomingEnforcer_tDBOutput_2.put("POSHPC", POMHDH.POSHPC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POEDAT") != null){
                    incomingEnforcer_tDBOutput_2.put("POEDAT", POMHDH.POEDAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSDAT") != null){
                    incomingEnforcer_tDBOutput_2.put("POSDAT", POMHDH.POSDAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCDAT") != null){
                    incomingEnforcer_tDBOutput_2.put("POCDAT", POMHDH.POCDAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORDAT") != null){
                    incomingEnforcer_tDBOutput_2.put("PORDAT", POMHDH.PORDAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POLCHG") != null){
                    incomingEnforcer_tDBOutput_2.put("POLCHG", POMHDH.POLCHG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORFRQ") != null){
                    incomingEnforcer_tDBOutput_2.put("PORFRQ", POMHDH.PORFRQ);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POLEAD") != null){
                    incomingEnforcer_tDBOutput_2.put("POLEAD", POMHDH.POLEAD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POORIG") != null){
                    incomingEnforcer_tDBOutput_2.put("POORIG", POMHDH.POORIG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PONOT1") != null){
                    incomingEnforcer_tDBOutput_2.put("PONOT1", POMHDH.PONOT1);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PONOT2") != null){
                    incomingEnforcer_tDBOutput_2.put("PONOT2", POMHDH.PONOT2);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PONOT3") != null){
                    incomingEnforcer_tDBOutput_2.put("PONOT3", POMHDH.PONOT3);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCOST") != null){
                    incomingEnforcer_tDBOutput_2.put("POCOST", POMHDH.POCOST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POVAT") != null){
                    incomingEnforcer_tDBOutput_2.put("POVAT", POMHDH.POVAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORETL") != null){
                    incomingEnforcer_tDBOutput_2.put("PORETL", POMHDH.PORETL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCASE") != null){
                    incomingEnforcer_tDBOutput_2.put("POCASE", POMHDH.POCASE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POUNTS") != null){
                    incomingEnforcer_tDBOutput_2.put("POUNTS", POMHDH.POUNTS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POWGHT") != null){
                    incomingEnforcer_tDBOutput_2.put("POWGHT", POMHDH.POWGHT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTARP") != null){
                    incomingEnforcer_tDBOutput_2.put("POTARP", POMHDH.POTARP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSTOP") != null){
                    incomingEnforcer_tDBOutput_2.put("POSTOP", POMHDH.POSTOP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POSKID") != null){
                    incomingEnforcer_tDBOutput_2.put("POSKID", POMHDH.POSKID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POOTHN") != null){
                    incomingEnforcer_tDBOutput_2.put("POOTHN", POMHDH.POOTHN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POOTHP") != null){
                    incomingEnforcer_tDBOutput_2.put("POOTHP", POMHDH.POOTHP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POBTCH") != null){
                    incomingEnforcer_tDBOutput_2.put("POBTCH", POMHDH.POBTCH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORRET") != null){
                    incomingEnforcer_tDBOutput_2.put("PORRET", POMHDH.PORRET);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORVAT") != null){
                    incomingEnforcer_tDBOutput_2.put("PORVAT", POMHDH.PORVAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PORCST") != null){
                    incomingEnforcer_tDBOutput_2.put("PORCST", POMHDH.PORCST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTPLT") != null){
                    incomingEnforcer_tDBOutput_2.put("POTPLT", POMHDH.POTPLT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCUBE") != null){
                    incomingEnforcer_tDBOutput_2.put("POCUBE", POMHDH.POCUBE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POPDWN") != null){
                    incomingEnforcer_tDBOutput_2.put("POPDWN", POMHDH.POPDWN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("SHPNUM") != null){
                    incomingEnforcer_tDBOutput_2.put("SHPNUM", POMHDH.SHPNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POPYCN") != null){
                    incomingEnforcer_tDBOutput_2.put("POPYCN", POMHDH.POPYCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POPYDT") != null){
                    incomingEnforcer_tDBOutput_2.put("POPYDT", POMHDH.POPYDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMALS") != null){
                    incomingEnforcer_tDBOutput_2.put("POMALS", POMHDH.POMALS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMALV") != null){
                    incomingEnforcer_tDBOutput_2.put("POMALV", POMHDH.POMALV);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMSPO") != null){
                    incomingEnforcer_tDBOutput_2.put("POMSPO", POMHDH.POMSPO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMSBO") != null){
                    incomingEnforcer_tDBOutput_2.put("POMSBO", POMHDH.POMSBO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POLOAD") != null){
                    incomingEnforcer_tDBOutput_2.put("POLOAD", POMHDH.POLOAD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMCRT") != null){
                    incomingEnforcer_tDBOutput_2.put("POMCRT", POMHDH.POMCRT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMCDT") != null){
                    incomingEnforcer_tDBOutput_2.put("POMCDT", POMHDH.POMCDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POQCKE") != null){
                    incomingEnforcer_tDBOutput_2.put("POQCKE", POMHDH.POQCKE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMTYP") != null){
                    incomingEnforcer_tDBOutput_2.put("POMTYP", POMHDH.POMTYP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PO850F") != null){
                    incomingEnforcer_tDBOutput_2.put("PO850F", POMHDH.PO850F);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PO860F") != null){
                    incomingEnforcer_tDBOutput_2.put("PO860F", POMHDH.PO860F);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POTPID") != null){
                    incomingEnforcer_tDBOutput_2.put("POTPID", POMHDH.POTPID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POBSDT") != null){
                    incomingEnforcer_tDBOutput_2.put("POBSDT", POMHDH.POBSDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POASDT") != null){
                    incomingEnforcer_tDBOutput_2.put("POASDT", POMHDH.POASDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCODF") != null){
                    incomingEnforcer_tDBOutput_2.put("POCODF", POMHDH.POCODF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCODT") != null){
                    incomingEnforcer_tDBOutput_2.put("POCODT", POMHDH.POCODT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCVTP") != null){
                    incomingEnforcer_tDBOutput_2.put("POCVTP", POMHDH.POCVTP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POCVMD") != null){
                    incomingEnforcer_tDBOutput_2.put("POCVMD", POMHDH.POCVMD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POMCPY") != null){
                    incomingEnforcer_tDBOutput_2.put("POMCPY", POMHDH.POMCPY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("POUSER") != null){
                    incomingEnforcer_tDBOutput_2.put("POUSER", POMHDH.POUSER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("DATCUR") != null){
                    incomingEnforcer_tDBOutput_2.put("DATCUR", POMHDH.DATCUR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("DATTIM") != null){
                    incomingEnforcer_tDBOutput_2.put("DATTIM", POMHDH.DATTIM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_2.put("LOAD_DATE", POMHDH.LOAD_DATE);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_2 = null;
        if (incomingEnforcer_tDBOutput_2 != null) {
            data_tDBOutput_2 = incomingEnforcer_tDBOutput_2.getCurrentRecord();
        }
        
        if (writer_tDBOutput_2 != null && data_tDBOutput_2 != null) {
        	writer_tDBOutput_2.write(data_tDBOutput_2);
        }
        
        nb_line_tDBOutput_2++;

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	


 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	


 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "POMHDH"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row9"




	
	/**
	 * [tFileInputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	



            }
            }finally{
                if(!((Object)("/data/talend/data_repository/POMHDH.txt") instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_2!=null){
                		fid_tFileInputDelimited_2.close();
                	}
                }
                if(fid_tFileInputDelimited_2!=null){
                	globalMap.put("tFileInputDelimited_2_NB_LINE", fid_tFileInputDelimited_2.getRowNumber());
					
						log.info("tFileInputDelimited_2 - Retrieved records count: "+ fid_tFileInputDelimited_2.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'POMHDH': " + count_POMHDH_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
			 			"tFileInputDelimited_2","tFileInputDelimited_2","tFileInputDelimited","tMap_2","tMap_2","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Done.") );

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_2", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_2 = null;
    if (writer_tDBOutput_2 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_2 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_2.close();
        resultMap_tDBOutput_2 = writer_tDBOutput_2.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_2), container_tDBOutput_2);
    }
if(resultMap_tDBOutput_2!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_2 : resultMap_tDBOutput_2.entrySet()) {
		switch(entry_tDBOutput_2.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_2.setComponentData("tDBOutput_2", "ERROR_MESSAGE", entry_tDBOutput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_LINE", entry_tDBOutput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_SUCCESS", entry_tDBOutput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_2.setComponentData("tDBOutput_2", "NB_REJECT", entry_tDBOutput_2.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_2 = new StringBuilder();
            for (int i_tDBOutput_2 = 0; i_tDBOutput_2 < entry_tDBOutput_2.getKey().length(); i_tDBOutput_2++) {
                char ch_tDBOutput_2 = entry_tDBOutput_2.getKey().charAt(i_tDBOutput_2);
                if(Character.isUpperCase(ch_tDBOutput_2) && i_tDBOutput_2> 0) {
                	studio_key_tDBOutput_2.append('_');
                }
                studio_key_tDBOutput_2.append(ch_tDBOutput_2);
            }
			container_tDBOutput_2.setComponentData("tDBOutput_2", studio_key_tDBOutput_2.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_2.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"POMHDH",2,0,
			 			"tMap_2","tMap_2","tMap","tDBOutput_2","tDBOutput_2","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tFileDelete_2Process(globalMap);



/**
 * [tDBOutput_2 end ] stop
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
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";
	
	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_2")==null){
    if(resourceMap.get("writer_tDBOutput_2")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_2")).close();
		} catch (java.io.IOException e_tDBOutput_2) {
			String errorMessage_tDBOutput_2 = "failed to release the resource in tDBOutput_2 :" + e_tDBOutput_2.getMessage();
			System.err.println(errorMessage_tDBOutput_2);
		}
	}
}
 



/**
 * [tDBOutput_2 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tFileDelete_2.append("PATH" + " = " + "\"/data/talend/data_repository/POMHDH.txt\"");
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
				talendJobLog.addCM("tFileDelete_2", "tFileDelete_2", "tFileDelete");
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
	java.io.File path_tFileDelete_2=new java.io.File("/data/talend/data_repository/POMHDH.txt");
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
    globalMap.put("tFileDelete_2_DELETE_PATH","/data/talend/data_repository/POMHDH.txt");
 


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
        final TTT000CL1 TTT000CL1Class = new TTT000CL1();

        int exitCode = TTT000CL1Class.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'TTT000CL1' - Done.");
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
			log.info("TalendJob: 'TTT000CL1' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_33eZ4AbrEeqkGZ2htTjMeA");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-30T13:24:04.079873300Z");

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
            java.io.InputStream inContext = TTT000CL1.class.getClassLoader().getResourceAsStream("at_talend_jobs/ttt000cl1_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = TTT000CL1.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
                        context.setContextType("jda_user_name", "id_String");
                        if(context.getStringValue("jda_user_name") == null) {
                            context.jda_user_name = null;
                        } else {
                            context.jda_user_name=(String) context.getProperty("jda_user_name");
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
            }if (parentContextMap.containsKey("jda_password")) {
                context.jda_password = (java.lang.String) parentContextMap.get("jda_password");
            }if (parentContextMap.containsKey("jda_user_name")) {
                context.jda_user_name = (String) parentContextMap.get("jda_user_name");
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
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("jda_password");
			parametersToEncrypt.add("SF_password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,ContextProperties.class,parametersToEncrypt));

            org.slf4j.MDC.put("_context", contextStr);
            log.info("TalendJob: 'TTT000CL1' - Started.");
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
((java.util.Map) threadLocal.get()).put("errorCode", null);tParallelize_1Process(globalMap);
if ( !"failure".equals(((java.util.Map)threadLocal.get()).get("status")) ) {
((java.util.Map) threadLocal.get()).put("status", "end");
}
}catch (TalendException e_tParallelize_1) {
globalMap.put("tParallelize_1_SUBPROCESS_STATE", -1);

e_tParallelize_1.printStackTrace();

}catch (java.lang.Error e_tParallelize_1) {
globalMap.put("tParallelize_1_SUBPROCESS_STATE", -1);
((java.util.Map) threadLocal.get()).put("status", "failure");throw e_tParallelize_1;

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TTT000CL1");
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
        log.info("TalendJob: 'TTT000CL1' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     890722 characters generated by Talend Cloud Data Management Platform 
 *     on the June 30, 2023 at 9:24:04 AM EDT
 ************************************************************************************************/