
package at_talend_jobs.ttaallcl3_0_1;

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
 * Job: TTAALLCL3 Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class TTAALLCL3 implements TalendJob {
	static {System.setProperty("TalendJob.log", "TTAALLCL3.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(TTAALLCL3.class);
	

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
	private final String jobName = "TTAALLCL3";
	private final String projectName = "AT_TALEND_JOBS";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Object>());
		
	
		private final java.util.Map<String, Long> start_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Long> end_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Long>());
		private final java.util.Map<String, Boolean> ok_Hash = java.util.Collections.synchronizedMap(new java.util.HashMap<String, Boolean>());
		public  final java.util.List<String[]> globalBuffer = java.util.Collections.synchronizedList(new java.util.ArrayList<String[]>());
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_9CERwAVyEeqgh6rCafRRhA", "0.1");
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
				TTAALLCL3.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(TTAALLCL3.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tParallelize_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tParallelize_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_19_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_19_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_13_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBInput_19_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_14_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_8_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tFileDelete_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tDBRow_7_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileInputDelimited_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				((java.util.Map)threadLocal.get()).put("status", "failure");
				
					tFileDelete_4_onSubJobError(exception, errorComponent, globalMap);
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
			public void tParallelize_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_19_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_8_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
			public void tFileDelete_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBRow_7_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:jbN9+FZjKqtPfeDwuHD2yFhpCXKPZLIcQCqmXZ0FV0yvS7KR"));
 		                        
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
	globalMap.remove("tDBRow_4_SUBPROCESS_STATE");
	globalMap.remove("tDBRow_1_SUBPROCESS_STATE");
	globalMap.remove("tDBRow_2_SUBPROCESS_STATE");
	globalMap.remove("tDBRow_7_SUBPROCESS_STATE");

				java.util.Map concurrentMap_temp_tParallelize_1;
				if(globalMap instanceof java.util.HashMap){
					concurrentMap_temp_tParallelize_1 = java.util.Collections.synchronizedMap(globalMap);
				}else{
					concurrentMap_temp_tParallelize_1 = globalMap;
				}
				final java.util.Map concurrentMap_tParallelize_1 = concurrentMap_temp_tParallelize_1;
			
		runningThreadCount.add(1);
		String name_tDBRow_4 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBRow_4 = new Thread(new ThreadGroup(name_tDBRow_4), name_tDBRow_4){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						
							mdcInfo.forEach(org.slf4j.MDC::put);
						
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_4' starts.");
					
					tDBRow_4Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_4' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_4_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_4_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBRow_4.start();
		mt_tParallelize_1.put("tDBRow_4",thread_tDBRow_4);
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
		runningThreadCount.add(1);
		String name_tDBRow_7 = "tParallelize_1_" + java.util.UUID.randomUUID().toString();
		Thread thread_tDBRow_7 = new Thread(new ThreadGroup(name_tDBRow_7), name_tDBRow_7){
	    	public void run() {
				java.util.Map threadRunResultMap = new java.util.HashMap();
				threadRunResultMap.put("errorCode", null);
				threadRunResultMap.put("status", "");
				threadLocal.set(threadRunResultMap);

                try {
					
						
							mdcInfo.forEach(org.slf4j.MDC::put);
						
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_7' starts.");
					
					tDBRow_7Process(concurrentMap_tParallelize_1);
					
						log.debug("tParallelize_1 - The subjob starting with the component 'tDBRow_7' is done.");
					
				} catch (TalendException e) {
					
						log.error("tParallelize_1 - " + e.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_7_SUBPROCESS_STATE", -1);
					e.printStackTrace();
				} catch (java.lang.Error error) {
					
						log.error("tParallelize_1 - " + error.getMessage());
					
					concurrentMap_tParallelize_1.put("tDBRow_7_SUBPROCESS_STATE", -1);
					error.printStackTrace();
				}finally {
                	runningThreadCount.add(-1);
                }
	    	}
		};
		thread_tDBRow_7.start();
		mt_tParallelize_1.put("tDBRow_7",thread_tDBRow_7);
	while(
(
		((globalMap.get("tDBRow_4_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_4_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBRow_1_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_1_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBRow_2_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_2_SUBPROCESS_STATE")==0))||
		((globalMap.get("tDBRow_7_SUBPROCESS_STATE")==null)?true:((Integer)globalMap.get("tDBRow_7_SUBPROCESS_STATE")==0))|| false) ) {
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
				talendJobLog.addCM("tDBRow_4", "tDBRow_1", "tSnowflakeRow");
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
 		                    "DELETE from INVENTORY_SET_FILE_SETHDR\nWHERE LOAD_DATE = CURRENT_DATE()");
 		                    
 		                    props_tDBRow_4.setValue("dieOnError",
 		                    false);
 		                    
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




/**
 * [tDBRow_4 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_4:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk25", 0, "ok");
								} 
							
							tDBInput_19Process(globalMap); 
						



	
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
	


public static class row26Struct implements routines.system.IPersistableRow<row26Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public BigDecimal ISETNO;

				public BigDecimal getISETNO () {
					return this.ISETNO;
				}

				public Boolean ISETNOIsNullable(){
				    return true;
				}
				public Boolean ISETNOIsKey(){
				    return false;
				}
				public Integer ISETNOLength(){
				    return 9;
				}
				public Integer ISETNOPrecision(){
				    return 0;
				}
				public String ISETNODefault(){
				
					return "";
				
				}
				public String ISETNOComment(){
				
				    return "";
				
				}
				public String ISETNOPattern(){
				
					return "";
				
				}
				public String ISETNOOriginalDbColumnName(){
				
					return "ISETNO";
				
				}

				
			    public String IPKGYN;

				public String getIPKGYN () {
					return this.IPKGYN;
				}

				public Boolean IPKGYNIsNullable(){
				    return true;
				}
				public Boolean IPKGYNIsKey(){
				    return false;
				}
				public Integer IPKGYNLength(){
				    return 1;
				}
				public Integer IPKGYNPrecision(){
				    return 0;
				}
				public String IPKGYNDefault(){
				
					return null;
				
				}
				public String IPKGYNComment(){
				
				    return "";
				
				}
				public String IPKGYNPattern(){
				
					return "";
				
				}
				public String IPKGYNOriginalDbColumnName(){
				
					return "IPKGYN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
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
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ISETNO="+String.valueOf(ISETNO));
		sb.append(",IPKGYN="+IPKGYN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ISETNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISETNO);
            			}
            		
        			sb.append("|");
        		
        				if(IPKGYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPKGYN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row26Struct other) {

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



		row26Struct row26 = new row26Struct();




	
	/**
	 * [tFileOutputDelimited_13 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_13", false);
		start_Hash.put("tFileOutputDelimited_13", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_13";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row26");
			
		int tos_count_tFileOutputDelimited_13 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_13 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_13{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_13 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_13.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_13.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("FILENAME" + " = " + "\"/data/talend/data_repository/SETHDR.csv\"");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("COMPRESS" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                            log4jParamters_tFileOutputDelimited_13.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_13.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_13 - "  + (log4jParamters_tFileOutputDelimited_13) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_13().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_13", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_13 = "";
    fileName_tFileOutputDelimited_13 = (new java.io.File("/data/talend/data_repository/SETHDR.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_13 = null;
    String extension_tFileOutputDelimited_13 = null;
    String directory_tFileOutputDelimited_13 = null;
    if((fileName_tFileOutputDelimited_13.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_13.lastIndexOf(".") < fileName_tFileOutputDelimited_13.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13;
            extension_tFileOutputDelimited_13 = "";
        } else {
            fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13.substring(0, fileName_tFileOutputDelimited_13.lastIndexOf("."));
            extension_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13.substring(fileName_tFileOutputDelimited_13.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13.substring(0, fileName_tFileOutputDelimited_13.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_13.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13.substring(0, fileName_tFileOutputDelimited_13.lastIndexOf("."));
            extension_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13.substring(fileName_tFileOutputDelimited_13.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_13 = fileName_tFileOutputDelimited_13;
            extension_tFileOutputDelimited_13 = "";
        }
        directory_tFileOutputDelimited_13 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_13 = true;
    java.io.File filetFileOutputDelimited_13 = new java.io.File(fileName_tFileOutputDelimited_13);
    globalMap.put("tFileOutputDelimited_13_FILE_NAME",fileName_tFileOutputDelimited_13);
            int nb_line_tFileOutputDelimited_13 = 0;
            int splitedFileNo_tFileOutputDelimited_13 = 0;
            int currentRow_tFileOutputDelimited_13 = 0;

            final String OUT_DELIM_tFileOutputDelimited_13 = /** Start field tFileOutputDelimited_13:FIELDSEPARATOR */","/** End field tFileOutputDelimited_13:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_13 = /** Start field tFileOutputDelimited_13:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_13:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_13 != null && directory_tFileOutputDelimited_13.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_13 = new java.io.File(directory_tFileOutputDelimited_13);
                        if(!dir_tFileOutputDelimited_13.exists()) {
                                log.info("tFileOutputDelimited_13 - Creating directory '" + dir_tFileOutputDelimited_13.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_13.mkdirs();
                                log.info("tFileOutputDelimited_13 - The directory '"+ dir_tFileOutputDelimited_13.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        filetFileOutputDelimited_13 = new java.io.File(fileName_tFileOutputDelimited_13);
                        String zipName_tFileOutputDelimited_13 = fullName_tFileOutputDelimited_13 + ".zip";
                        java.io.File file_tFileOutputDelimited_13 = new java.io.File(zipName_tFileOutputDelimited_13);
                        //routines.system.Row
                        java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_13= null;
                        java.io.Writer outtFileOutputDelimited_13 = null;

                        if(file_tFileOutputDelimited_13.exists()) {
                            file_tFileOutputDelimited_13.delete();
                        }
                        zipOut_tFileOutputDelimited_13= new java.util.zip.ZipOutputStream(
                                new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_13)));
                        zipOut_tFileOutputDelimited_13.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_13.getName()));
                        outtFileOutputDelimited_13 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_13,"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_13", outtFileOutputDelimited_13);
                        synchronized (multiThreadLockWrite) {
                                    if(file_tFileOutputDelimited_13.length()==0){
                                        outtFileOutputDelimited_13.write("ISETNO");
                                            outtFileOutputDelimited_13.write(OUT_DELIM_tFileOutputDelimited_13);
                                        outtFileOutputDelimited_13.write("IPKGYN");
                                        outtFileOutputDelimited_13.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_13);
                                        outtFileOutputDelimited_13.flush();
                                    }
                        }


resourceMap.put("nb_line_tFileOutputDelimited_13", nb_line_tFileOutputDelimited_13);

 



/**
 * [tFileOutputDelimited_13 begin ] stop
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
                            log4jParamters_tDBInput_19.append("DB_VERSION" + " = " + "jt400-9.8.jar");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("HOST" + " = " + "context.jda_host_name");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("DBNAME" + " = " + "context.jda_mm_lib");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("USER" + " = " + "context.jda_user_name");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.jda_password)).substring(0, 4) + "...");     
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("QUERY" + " = " + "\"select * from MM4R5LIB.SETHDR\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ISETNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPKGYN")+"}]");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBInput_19.append(" | ");
                            log4jParamters_tDBInput_19.append("UNIFIED_COMPONENTS" + " = " + "tAS400Input");
                        log4jParamters_tDBInput_19.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBInput_19 - "  + (log4jParamters_tDBInput_19) );
                    } 
                } 
            new BytesLimit65535_tDBInput_19().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBInput_19", "tDBInput_1", "tAS400Input");
				talendJobLogProcess(globalMap);
			}
			
	
    
	
		    int nb_line_tDBInput_19 = 0;
		    java.sql.Connection conn_tDBInput_19 = null;
				String driverClass_tDBInput_19 = "com.ibm.as400.access.AS400JDBCDriver";
			    java.lang.Class jdbcclazz_tDBInput_19 = java.lang.Class.forName(driverClass_tDBInput_19);
				String dbUser_tDBInput_19 = context.jda_user_name;
				
				
	final String decryptedPassword_tDBInput_19 = context.jda_password; 
				
				String dbPwd_tDBInput_19 = decryptedPassword_tDBInput_19;
				  
				String url_tDBInput_19 = "jdbc:as400://" + context.jda_host_name + "/" + context.jda_mm_lib + ";" + "prompt=false";
				
	    		log.debug("tDBInput_19 - Driver ClassName: "+driverClass_tDBInput_19+".");
			
	    		log.debug("tDBInput_19 - Connection attempt to '" + url_tDBInput_19 + "' with the username '" + dbUser_tDBInput_19 + "'.");
			
				conn_tDBInput_19 = java.sql.DriverManager.getConnection(url_tDBInput_19,dbUser_tDBInput_19,dbPwd_tDBInput_19);
	    		log.debug("tDBInput_19 - Connection to '" + url_tDBInput_19 + "' has succeeded.");
			
		        
		    
			java.sql.Statement stmt_tDBInput_19 = conn_tDBInput_19.createStatement();

		    String dbquery_tDBInput_19 = "select * from MM4R5LIB.SETHDR";
		    
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
								row26.ISETNO = null;
							} else {
		                          
            row26.ISETNO = rs_tDBInput_19.getBigDecimal(1);
            if(rs_tDBInput_19.wasNull()){
                    row26.ISETNO = null;
            }
		                    }
							if(colQtyInRs_tDBInput_19 < 2) {
								row26.IPKGYN = null;
							} else {
	                         		
        	row26.IPKGYN = routines.system.JDBCUtil.getString(rs_tDBInput_19, 2, false);
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
	 * [tFileOutputDelimited_13 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_13";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row26","tDBInput_19","tDBInput_1","tAS400Input","tFileOutputDelimited_13","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row26 - " + (row26==null? "": row26.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_13 = new StringBuilder();
                            if(row26.ISETNO != null) {
                        sb_tFileOutputDelimited_13.append(
                            row26.ISETNO.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_13.append(OUT_DELIM_tFileOutputDelimited_13);
                            if(row26.IPKGYN != null) {
                        sb_tFileOutputDelimited_13.append(
                            row26.IPKGYN
                        );
                            }
                    sb_tFileOutputDelimited_13.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_13);


                    synchronized (multiThreadLockWrite) {
                    nb_line_tFileOutputDelimited_13++;
                    resourceMap.put("nb_line_tFileOutputDelimited_13", nb_line_tFileOutputDelimited_13);

                        outtFileOutputDelimited_13.write(sb_tFileOutputDelimited_13.toString());
                        log.debug("tFileOutputDelimited_13 - Writing the record " + nb_line_tFileOutputDelimited_13 + ".");

                    }



 


	tos_count_tFileOutputDelimited_13++;

/**
 * [tFileOutputDelimited_13 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_13 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_13";
	
	

 



/**
 * [tFileOutputDelimited_13 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_13 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_13";
	
	

 



/**
 * [tFileOutputDelimited_13 process_data_end ] stop
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
	 * [tFileOutputDelimited_13 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_13";
	
	



		
	   		synchronized (multiThreadLockWrite) {
		
			
					if(outtFileOutputDelimited_13!=null) {
						outtFileOutputDelimited_13.flush();
						outtFileOutputDelimited_13.close();
					}
				
				globalMap.put("tFileOutputDelimited_13_NB_LINE",nb_line_tFileOutputDelimited_13);
				globalMap.put("tFileOutputDelimited_13_FILE_NAME",fileName_tFileOutputDelimited_13);
			
		
			}
		
		
		resourceMap.put("finish_tFileOutputDelimited_13", true);
	
				log.debug("tFileOutputDelimited_13 - Written records count: " + nb_line_tFileOutputDelimited_13 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row26",2,0,
			 			"tDBInput_19","tDBInput_1","tAS400Input","tFileOutputDelimited_13","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_13 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_13", true);
end_Hash.put("tFileOutputDelimited_13", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_13 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBInput_19:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tFileInputDelimited_8Process(globalMap); 
						



	
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
	 * [tFileOutputDelimited_13 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_13";
	
	


		if(resourceMap.get("finish_tFileOutputDelimited_13") == null){ 
			
		   		synchronized (multiThreadLockWrite) {
			
				
						java.io.Writer outtFileOutputDelimited_13 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_13");
						if(outtFileOutputDelimited_13!=null) {
							outtFileOutputDelimited_13.flush();
							outtFileOutputDelimited_13.close();
						}
					
				
				}
			
			
		}
	

 



/**
 * [tFileOutputDelimited_13 finally ] stop
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
	


public static class SETHDRStruct implements routines.system.IPersistableRow<SETHDRStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public BigDecimal ISETNO;

				public BigDecimal getISETNO () {
					return this.ISETNO;
				}

				public Boolean ISETNOIsNullable(){
				    return true;
				}
				public Boolean ISETNOIsKey(){
				    return false;
				}
				public Integer ISETNOLength(){
				    return null;
				}
				public Integer ISETNOPrecision(){
				    return null;
				}
				public String ISETNODefault(){
				
					return "";
				
				}
				public String ISETNOComment(){
				
				    return "";
				
				}
				public String ISETNOPattern(){
				
					return "";
				
				}
				public String ISETNOOriginalDbColumnName(){
				
					return "ISETNO";
				
				}

				
			    public String IPKGYN;

				public String getIPKGYN () {
					return this.IPKGYN;
				}

				public Boolean IPKGYNIsNullable(){
				    return true;
				}
				public Boolean IPKGYNIsKey(){
				    return false;
				}
				public Integer IPKGYNLength(){
				    return null;
				}
				public Integer IPKGYNPrecision(){
				    return null;
				}
				public String IPKGYNDefault(){
				
					return null;
				
				}
				public String IPKGYNComment(){
				
				    return "";
				
				}
				public String IPKGYNPattern(){
				
					return "";
				
				}
				public String IPKGYNOriginalDbColumnName(){
				
					return "IPKGYN";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
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
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
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
		sb.append("ISETNO="+String.valueOf(ISETNO));
		sb.append(",IPKGYN="+IPKGYN);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ISETNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISETNO);
            			}
            		
        			sb.append("|");
        		
        				if(IPKGYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPKGYN);
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
    public int compareTo(SETHDRStruct other) {

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

public static class row8Struct implements routines.system.IPersistableRow<row8Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public BigDecimal ISETNO;

				public BigDecimal getISETNO () {
					return this.ISETNO;
				}

				public Boolean ISETNOIsNullable(){
				    return true;
				}
				public Boolean ISETNOIsKey(){
				    return false;
				}
				public Integer ISETNOLength(){
				    return null;
				}
				public Integer ISETNOPrecision(){
				    return null;
				}
				public String ISETNODefault(){
				
					return "";
				
				}
				public String ISETNOComment(){
				
				    return "";
				
				}
				public String ISETNOPattern(){
				
					return "";
				
				}
				public String ISETNOOriginalDbColumnName(){
				
					return "ISETNO";
				
				}

				
			    public String IPKGYN;

				public String getIPKGYN () {
					return this.IPKGYN;
				}

				public Boolean IPKGYNIsNullable(){
				    return true;
				}
				public Boolean IPKGYNIsKey(){
				    return false;
				}
				public Integer IPKGYNLength(){
				    return null;
				}
				public Integer IPKGYNPrecision(){
				    return null;
				}
				public String IPKGYNDefault(){
				
					return null;
				
				}
				public String IPKGYNComment(){
				
				    return "";
				
				}
				public String IPKGYNPattern(){
				
					return "";
				
				}
				public String IPKGYNOriginalDbColumnName(){
				
					return "IPKGYN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.ISETNO = (BigDecimal) dis.readObject();
					
					this.IPKGYN = readString(dis);
					
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
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.ISETNO);
					
					// String
				
						writeString(this.IPKGYN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ISETNO="+String.valueOf(ISETNO));
		sb.append(",IPKGYN="+IPKGYN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ISETNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISETNO);
            			}
            		
        			sb.append("|");
        		
        				if(IPKGYN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(IPKGYN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

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
public void tFileInputDelimited_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_8_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileInputDelimited_8");
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



		row8Struct row8 = new row8Struct();
SETHDRStruct SETHDR = new SETHDRStruct();





	
	/**
	 * [tDBOutput_14 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_14", false);
		start_Hash.put("tDBOutput_14", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_14";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"SETHDR");
			
		int tos_count_tDBOutput_14 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_14", "tDBOutput_1", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_14 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_14 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_14 = (String)(restRequest_tDBOutput_14 != null ? restRequest_tDBOutput_14.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_14 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_14 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_14 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_14 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_14.createRuntimeProperties();
 		                    props_tDBOutput_14.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);
 		                    
 		                    props_tDBOutput_14.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_14.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_14.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_14.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_14.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_14_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_14_1_fisrt sst_tDBOutput_14_1_fisrt = new SchemaSettingTool_tDBOutput_14_1_fisrt();
 		                    
 		                    props_tDBOutput_14.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_14_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_14.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_14.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_14.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_14.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_14.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_14.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_14.table.setValue("tableName",
 		                    "INVENTORY_SET_FILE_SETHDR");
 		                    
 		                    props_tDBOutput_14.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_14.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_14.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_14.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_14.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_14.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_14_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"INVENTORY_SET_FILE_SETHDR\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"ISETNO\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":9,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"ISETNO\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"IPKGYN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IPKGYN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOAD_DATE\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"default\":\"\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"talend.field.dbType\":91,\"talend.field.dbColumnName\":\"LOAD_DATE\",\"talend.field.default\":\"\"}]}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_14_2_fisrt sst_tDBOutput_14_2_fisrt = new SchemaSettingTool_tDBOutput_14_2_fisrt();
 		                    
 		                    props_tDBOutput_14.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_14_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_14.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_14 = props_tDBOutput_14.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_14 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_14 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_14 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_14.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_14);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_14.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_14 = props_tDBOutput_14.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_14 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_14 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_14 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_14.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_14);
        }
    }
globalMap.put("tDBOutput_14_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_14);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_14= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_14_MAPPINGS_URL", mappings_url_tDBOutput_14);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_14 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_14";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_14 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_14 = null;
topology_tDBOutput_14 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_14 = def_tDBOutput_14.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_14, topology_tDBOutput_14);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_14 = def_tDBOutput_14.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_14 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_14.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_14 = componentRuntime_tDBOutput_14.initialize(container_tDBOutput_14, props_tDBOutput_14);

if (initVr_tDBOutput_14.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_14.getMessage());
}

if(componentRuntime_tDBOutput_14 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_14 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_14;
	compDriverInitialization_tDBOutput_14.runAtDriver(container_tDBOutput_14);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_14 = null;
if(componentRuntime_tDBOutput_14 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_14 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_14;
	if (doesNodeBelongToRequest_tDBOutput_14) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_14 = sourceOrSink_tDBOutput_14.validate(container_tDBOutput_14);
        if (vr_tDBOutput_14.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_14.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_14 = null;
    if (sourceOrSink_tDBOutput_14 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_14 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_14;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_14 = sink_tDBOutput_14.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_14) {
            writeOperation_tDBOutput_14.initialize(container_tDBOutput_14);
        }
        writer_tDBOutput_14 = writeOperation_tDBOutput_14.createWriter(container_tDBOutput_14);
        if (doesNodeBelongToRequest_tDBOutput_14) {
            writer_tDBOutput_14.open("tDBOutput_14");
        }

        resourceMap.put("writer_tDBOutput_14", writer_tDBOutput_14);
    } // end of "sourceOrSink_tDBOutput_14 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_14 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_14.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_14 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_14 = props_tDBOutput_14.getSchema(c_tDBOutput_14, false);
    incomingEnforcer_tDBOutput_14 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_14);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_14 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_14 = null;


 



/**
 * [tDBOutput_14 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row8");
			
		int tos_count_tMap_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_5 = new StringBuilder();
                    log4jParamters_tMap_5.append("Parameters:");
                            log4jParamters_tMap_5.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_5.append(" | ");
                            log4jParamters_tMap_5.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + (log4jParamters_tMap_5) );
                    } 
                } 
            new BytesLimit65535_tMap_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_5", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row8_tMap_5 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
	java.util.Date var1;
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_SETHDR_tMap_5 = 0;
				
SETHDRStruct SETHDR_tmp = new SETHDRStruct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_8", false);
		start_Hash.put("tFileInputDelimited_8", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_8";
	
	
		int tos_count_tFileInputDelimited_8 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_8 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_8{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_8 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_8.append("Parameters:");
                            log4jParamters_tFileInputDelimited_8.append("FILENAME" + " = " + "\"/data/talend/data_repository/SETHDR.zip\"");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("REMOVE_EMPTY_ROW" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("UNCOMPRESS" + " = " + "true");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ISETNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IPKGYN")+"}]");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                            log4jParamters_tFileInputDelimited_8.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_8.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_8 - "  + (log4jParamters_tFileInputDelimited_8) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_8().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_8", "tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_8 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_8 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_8 = null;
				int limit_tFileInputDelimited_8 = -1;
				try{
					
						Object filename_tFileInputDelimited_8 = "/data/talend/data_repository/SETHDR.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_8 = null;
						try {
							if(filename_tFileInputDelimited_8 instanceof java.io.InputStream){
								zis_tFileInputDelimited_8 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_8));
							}else{
								zis_tFileInputDelimited_8 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_8))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_8_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_8 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_8 = zis_tFileInputDelimited_8.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_8_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
							if(entry_tFileInputDelimited_8 == null) {
								break;
							}
							if(entry_tFileInputDelimited_8.isDirectory()){ //directory
								continue;
							}
							try {
								fid_tFileInputDelimited_8 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_8, "ISO-8859-15",",","\n",false,1,0,
								
									limit_tFileInputDelimited_8
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_8_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
					
				    
				    	log.info("tFileInputDelimited_8 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_8!=null && fid_tFileInputDelimited_8.nextRecord()) {
						rowstate_tFileInputDelimited_8.reset();
						
			    						row8 = null;			
												
									boolean whetherReject_tFileInputDelimited_8 = false;
									row8 = new row8Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_8 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_8 = 0;
					
						temp = fid_tFileInputDelimited_8.get(columnIndexWithD_tFileInputDelimited_8);
						if(temp.length() > 0) {
							
								try {
								
    								row8.ISETNO = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_8) {
globalMap.put("tFileInputDelimited_8_ERROR_MESSAGE",ex_tFileInputDelimited_8.getMessage());
									rowstate_tFileInputDelimited_8.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ISETNO", "row8", temp, ex_tFileInputDelimited_8), ex_tFileInputDelimited_8));
								}
    							
						} else {						
							
								
									row8.ISETNO = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_8 = 1;
					
							row8.IPKGYN = fid_tFileInputDelimited_8.get(columnIndexWithD_tFileInputDelimited_8);
						
				
				
										
										if(rowstate_tFileInputDelimited_8.getException()!=null) {
											throw rowstate_tFileInputDelimited_8.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_8_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_8 = true;
			        					
			            					throw(e);
			            				
			    					}
								
			log.debug("tFileInputDelimited_8 - Retrieving the record " + fid_tFileInputDelimited_8.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_8 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_8 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_8";
	
	

 


	tos_count_tFileInputDelimited_8++;

/**
 * [tFileInputDelimited_8 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_8";
	
	

 



/**
 * [tFileInputDelimited_8 process_data_begin ] stop
 */
// Start of branch "row8"
if(row8 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row8","tFileInputDelimited_8","tFileInputDelimited_1","tFileInputDelimited","tMap_5","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row8 - " + (row8==null? "": row8.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_5 = false;
		boolean mainRowRejected_tMap_5 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_5__Struct Var = Var__tMap_5;
Var.var1 = TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")) ;// ###############################
        // ###############################
        // # Output tables

SETHDR = null;


// # Output table : 'SETHDR'
count_SETHDR_tMap_5++;

SETHDR_tmp.ISETNO = row8.ISETNO;
SETHDR_tmp.IPKGYN = row8.IPKGYN;
SETHDR_tmp.LOAD_DATE = Var.var1 ;
SETHDR = SETHDR_tmp;
log.debug("tMap_5 - Outputting the record " + count_SETHDR_tMap_5 + " of the output table 'SETHDR'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "SETHDR"
if(SETHDR != null) { 



	
	/**
	 * [tDBOutput_14 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_14";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"SETHDR","tMap_5","tMap_1","tMap","tDBOutput_14","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("SETHDR - " + (SETHDR==null? "": SETHDR.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_14 != null) {
            incomingEnforcer_tDBOutput_14.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("ISETNO") != null){
                    incomingEnforcer_tDBOutput_14.put("ISETNO", SETHDR.ISETNO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("IPKGYN") != null){
                    incomingEnforcer_tDBOutput_14.put("IPKGYN", SETHDR.IPKGYN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_14 != null && incomingEnforcer_tDBOutput_14.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_14.put("LOAD_DATE", SETHDR.LOAD_DATE);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_14 = null;
        if (incomingEnforcer_tDBOutput_14 != null) {
            data_tDBOutput_14 = incomingEnforcer_tDBOutput_14.getCurrentRecord();
        }
        
        if (writer_tDBOutput_14 != null && data_tDBOutput_14 != null) {
        	writer_tDBOutput_14.write(data_tDBOutput_14);
        }
        
        nb_line_tDBOutput_14++;

 


	tos_count_tDBOutput_14++;

/**
 * [tDBOutput_14 main ] stop
 */
	
	/**
	 * [tDBOutput_14 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_14";
	
	


 



/**
 * [tDBOutput_14 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_14 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_14";
	
	


 



/**
 * [tDBOutput_14 process_data_end ] stop
 */

} // End of branch "SETHDR"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "row8"




	
	/**
	 * [tFileInputDelimited_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_8";
	
	

 



/**
 * [tFileInputDelimited_8 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_8 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_8";
	
	


				
            }
            nb_line_tFileInputDelimited_8+=fid_tFileInputDelimited_8.getRowNumber();
		}
		}finally{
            if(!((Object)("/data/talend/data_repository/SETHDR.zip") instanceof java.io.InputStream)){
            	if(fid_tFileInputDelimited_8!=null){
            		fid_tFileInputDelimited_8.close();
            	}
            }
            if(fid_tFileInputDelimited_8!=null){
            	globalMap.put("tFileInputDelimited_8_NB_LINE", nb_line_tFileInputDelimited_8);
            }
					
						log.info("tFileInputDelimited_8- Retrieved records count: "+ nb_line_tFileInputDelimited_8 + ".");
					
        }
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_8 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_8", true);
end_Hash.put("tFileInputDelimited_8", System.currentTimeMillis());




/**
 * [tFileInputDelimited_8 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_5 - Written records count in the table 'SETHDR': " + count_SETHDR_tMap_5 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row8",2,0,
			 			"tFileInputDelimited_8","tFileInputDelimited_1","tFileInputDelimited","tMap_5","tMap_1","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_5 - "  + ("Done.") );

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tDBOutput_14 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_14";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_14", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_14 = null;
    if (writer_tDBOutput_14 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_14 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_14.close();
        resultMap_tDBOutput_14 = writer_tDBOutput_14.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_14), container_tDBOutput_14);
    }
if(resultMap_tDBOutput_14!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_14 : resultMap_tDBOutput_14.entrySet()) {
		switch(entry_tDBOutput_14.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_14.setComponentData("tDBOutput_14", "ERROR_MESSAGE", entry_tDBOutput_14.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_LINE", entry_tDBOutput_14.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_SUCCESS", entry_tDBOutput_14.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_14.setComponentData("tDBOutput_14", "NB_REJECT", entry_tDBOutput_14.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_14 = new StringBuilder();
            for (int i_tDBOutput_14 = 0; i_tDBOutput_14 < entry_tDBOutput_14.getKey().length(); i_tDBOutput_14++) {
                char ch_tDBOutput_14 = entry_tDBOutput_14.getKey().charAt(i_tDBOutput_14);
                if(Character.isUpperCase(ch_tDBOutput_14) && i_tDBOutput_14> 0) {
                	studio_key_tDBOutput_14.append('_');
                }
                studio_key_tDBOutput_14.append(ch_tDBOutput_14);
            }
			container_tDBOutput_14.setComponentData("tDBOutput_14", studio_key_tDBOutput_14.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_14.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"SETHDR",2,0,
			 			"tMap_5","tMap_1","tMap","tDBOutput_14","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_14", true);
end_Hash.put("tDBOutput_14", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tFileDelete_1Process(globalMap);



/**
 * [tDBOutput_14 end ] stop
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
	 * [tFileInputDelimited_8 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_8";
	
	

 



/**
 * [tFileInputDelimited_8 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";
	
	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tDBOutput_14 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_14";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_14")==null){
    if(resourceMap.get("writer_tDBOutput_14")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_14")).close();
		} catch (java.io.IOException e_tDBOutput_14) {
			String errorMessage_tDBOutput_14 = "failed to release the resource in tDBOutput_14 :" + e_tDBOutput_14.getMessage();
			System.err.println(errorMessage_tDBOutput_14);
		}
	}
}
 



/**
 * [tDBOutput_14 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_8_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tFileDelete_1.append("PATH" + " = " + "\"/data/talend/data_repository/SETHDR.zip\"");
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
	java.io.File path_tFileDelete_1=new java.io.File("/data/talend/data_repository/SETHDR.zip");
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
    globalMap.put("tFileDelete_1_DELETE_PATH","/data/talend/data_repository/SETHDR.zip");
 


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
 		                    "DELETE from TABLE_FIELDS_FILE_TBLFLD\nWHERE LOAD_DATE = CURRENT_DATE()");
 		                    
 		                    props_tDBRow_1.setValue("dieOnError",
 		                    false);
 		                    
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




/**
 * [tDBRow_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk3", 0, "ok");
								} 
							
							tDBInput_1Process(globalMap); 
						



	
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
	


public static class row42Struct implements routines.system.IPersistableRow<row42Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public String TBLNAM;

				public String getTBLNAM () {
					return this.TBLNAM;
				}

				public Boolean TBLNAMIsNullable(){
				    return true;
				}
				public Boolean TBLNAMIsKey(){
				    return false;
				}
				public Integer TBLNAMLength(){
				    return 6;
				}
				public Integer TBLNAMPrecision(){
				    return 0;
				}
				public String TBLNAMDefault(){
				
					return null;
				
				}
				public String TBLNAMComment(){
				
				    return "";
				
				}
				public String TBLNAMPattern(){
				
					return "";
				
				}
				public String TBLNAMOriginalDbColumnName(){
				
					return "TBLNAM";
				
				}

				
			    public String TBLVAL;

				public String getTBLVAL () {
					return this.TBLVAL;
				}

				public Boolean TBLVALIsNullable(){
				    return true;
				}
				public Boolean TBLVALIsKey(){
				    return false;
				}
				public Integer TBLVALLength(){
				    return 6;
				}
				public Integer TBLVALPrecision(){
				    return 0;
				}
				public String TBLVALDefault(){
				
					return null;
				
				}
				public String TBLVALComment(){
				
				    return "";
				
				}
				public String TBLVALPattern(){
				
					return "";
				
				}
				public String TBLVALOriginalDbColumnName(){
				
					return "TBLVAL";
				
				}

				
			    public String TBLDSC;

				public String getTBLDSC () {
					return this.TBLDSC;
				}

				public Boolean TBLDSCIsNullable(){
				    return true;
				}
				public Boolean TBLDSCIsKey(){
				    return false;
				}
				public Integer TBLDSCLength(){
				    return 35;
				}
				public Integer TBLDSCPrecision(){
				    return 0;
				}
				public String TBLDSCDefault(){
				
					return null;
				
				}
				public String TBLDSCComment(){
				
				    return "";
				
				}
				public String TBLDSCPattern(){
				
					return "";
				
				}
				public String TBLDSCOriginalDbColumnName(){
				
					return "TBLDSC";
				
				}

				
			    public String TBLDEF;

				public String getTBLDEF () {
					return this.TBLDEF;
				}

				public Boolean TBLDEFIsNullable(){
				    return true;
				}
				public Boolean TBLDEFIsKey(){
				    return false;
				}
				public Integer TBLDEFLength(){
				    return 1;
				}
				public Integer TBLDEFPrecision(){
				    return 0;
				}
				public String TBLDEFDefault(){
				
					return null;
				
				}
				public String TBLDEFComment(){
				
				    return "";
				
				}
				public String TBLDEFPattern(){
				
					return "";
				
				}
				public String TBLDEFOriginalDbColumnName(){
				
					return "TBLDEF";
				
				}

				
			    public String TBLLAN;

				public String getTBLLAN () {
					return this.TBLLAN;
				}

				public Boolean TBLLANIsNullable(){
				    return true;
				}
				public Boolean TBLLANIsKey(){
				    return false;
				}
				public Integer TBLLANLength(){
				    return 3;
				}
				public Integer TBLLANPrecision(){
				    return 0;
				}
				public String TBLLANDefault(){
				
					return null;
				
				}
				public String TBLLANComment(){
				
				    return "";
				
				}
				public String TBLLANPattern(){
				
					return "";
				
				}
				public String TBLLANOriginalDbColumnName(){
				
					return "TBLLAN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("TBLNAM="+TBLNAM);
		sb.append(",TBLVAL="+TBLVAL);
		sb.append(",TBLDSC="+TBLDSC);
		sb.append(",TBLDEF="+TBLDEF);
		sb.append(",TBLLAN="+TBLLAN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(TBLNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLNAM);
            			}
            		
        			sb.append("|");
        		
        				if(TBLVAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLVAL);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDSC);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDEF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDEF);
            			}
            		
        			sb.append("|");
        		
        				if(TBLLAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLLAN);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row42Struct other) {

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



		row42Struct row42 = new row42Struct();




	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row42");
			
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
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLFLD.csv\"");
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
    fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/TBLFLD.csv")).getAbsolutePath().replace("\\","/");
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
                                        outtFileOutputDelimited_1.write("TBLNAM");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TBLVAL");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TBLDSC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TBLDEF");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TBLLAN");
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
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"select * from MM4R5LIB.TBLFLD\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("TBLNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLVAL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLDSC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLDEF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLLAN")+"}]");
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

		    String dbquery_tDBInput_1 = "select * from MM4R5LIB.TBLFLD";
		    
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
								row42.TBLNAM = null;
							} else {
	                         		
        	row42.TBLNAM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row42.TBLVAL = null;
							} else {
	                         		
        	row42.TBLVAL = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row42.TBLDSC = null;
							} else {
	                         		
        	row42.TBLDSC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row42.TBLDEF = null;
							} else {
	                         		
        	row42.TBLDEF = routines.system.JDBCUtil.getString(rs_tDBInput_1, 4, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row42.TBLLAN = null;
							} else {
	                         		
        	row42.TBLLAN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 5, false);
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
				
					,"row42","tDBInput_1","tDBInput_1","tAS400Input","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row42 - " + (row42==null? "": row42.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(row42.TBLNAM != null) {
                        sb_tFileOutputDelimited_1.append(
                            row42.TBLNAM
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row42.TBLVAL != null) {
                        sb_tFileOutputDelimited_1.append(
                            row42.TBLVAL
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row42.TBLDSC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row42.TBLDSC
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row42.TBLDEF != null) {
                        sb_tFileOutputDelimited_1.append(
                            row42.TBLDEF
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row42.TBLLAN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row42.TBLLAN
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
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row42",2,0,
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
									runStat.updateStatOnConnection("OnSubjobOk4", 0, "ok");
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
	


public static class TBLFLDStruct implements routines.system.IPersistableRow<TBLFLDStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public String TBLNAM;

				public String getTBLNAM () {
					return this.TBLNAM;
				}

				public Boolean TBLNAMIsNullable(){
				    return true;
				}
				public Boolean TBLNAMIsKey(){
				    return false;
				}
				public Integer TBLNAMLength(){
				    return null;
				}
				public Integer TBLNAMPrecision(){
				    return null;
				}
				public String TBLNAMDefault(){
				
					return null;
				
				}
				public String TBLNAMComment(){
				
				    return "";
				
				}
				public String TBLNAMPattern(){
				
					return "";
				
				}
				public String TBLNAMOriginalDbColumnName(){
				
					return "TBLNAM";
				
				}

				
			    public String TBLVAL;

				public String getTBLVAL () {
					return this.TBLVAL;
				}

				public Boolean TBLVALIsNullable(){
				    return true;
				}
				public Boolean TBLVALIsKey(){
				    return false;
				}
				public Integer TBLVALLength(){
				    return null;
				}
				public Integer TBLVALPrecision(){
				    return null;
				}
				public String TBLVALDefault(){
				
					return null;
				
				}
				public String TBLVALComment(){
				
				    return "";
				
				}
				public String TBLVALPattern(){
				
					return "";
				
				}
				public String TBLVALOriginalDbColumnName(){
				
					return "TBLVAL";
				
				}

				
			    public String TBLDSC;

				public String getTBLDSC () {
					return this.TBLDSC;
				}

				public Boolean TBLDSCIsNullable(){
				    return true;
				}
				public Boolean TBLDSCIsKey(){
				    return false;
				}
				public Integer TBLDSCLength(){
				    return null;
				}
				public Integer TBLDSCPrecision(){
				    return null;
				}
				public String TBLDSCDefault(){
				
					return null;
				
				}
				public String TBLDSCComment(){
				
				    return "";
				
				}
				public String TBLDSCPattern(){
				
					return "";
				
				}
				public String TBLDSCOriginalDbColumnName(){
				
					return "TBLDSC";
				
				}

				
			    public String TBLDEF;

				public String getTBLDEF () {
					return this.TBLDEF;
				}

				public Boolean TBLDEFIsNullable(){
				    return true;
				}
				public Boolean TBLDEFIsKey(){
				    return false;
				}
				public Integer TBLDEFLength(){
				    return null;
				}
				public Integer TBLDEFPrecision(){
				    return null;
				}
				public String TBLDEFDefault(){
				
					return null;
				
				}
				public String TBLDEFComment(){
				
				    return "";
				
				}
				public String TBLDEFPattern(){
				
					return "";
				
				}
				public String TBLDEFOriginalDbColumnName(){
				
					return "TBLDEF";
				
				}

				
			    public String TBLLAN;

				public String getTBLLAN () {
					return this.TBLLAN;
				}

				public Boolean TBLLANIsNullable(){
				    return true;
				}
				public Boolean TBLLANIsKey(){
				    return false;
				}
				public Integer TBLLANLength(){
				    return null;
				}
				public Integer TBLLANPrecision(){
				    return null;
				}
				public String TBLLANDefault(){
				
					return null;
				
				}
				public String TBLLANComment(){
				
				    return "";
				
				}
				public String TBLLANPattern(){
				
					return "";
				
				}
				public String TBLLANOriginalDbColumnName(){
				
					return "TBLLAN";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
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
		sb.append("TBLNAM="+TBLNAM);
		sb.append(",TBLVAL="+TBLVAL);
		sb.append(",TBLDSC="+TBLDSC);
		sb.append(",TBLDEF="+TBLDEF);
		sb.append(",TBLLAN="+TBLLAN);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(TBLNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLNAM);
            			}
            		
        			sb.append("|");
        		
        				if(TBLVAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLVAL);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDSC);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDEF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDEF);
            			}
            		
        			sb.append("|");
        		
        				if(TBLLAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLLAN);
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
    public int compareTo(TBLFLDStruct other) {

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

public static class row19Struct implements routines.system.IPersistableRow<row19Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
			    public String TBLNAM;

				public String getTBLNAM () {
					return this.TBLNAM;
				}

				public Boolean TBLNAMIsNullable(){
				    return true;
				}
				public Boolean TBLNAMIsKey(){
				    return false;
				}
				public Integer TBLNAMLength(){
				    return null;
				}
				public Integer TBLNAMPrecision(){
				    return null;
				}
				public String TBLNAMDefault(){
				
					return null;
				
				}
				public String TBLNAMComment(){
				
				    return "";
				
				}
				public String TBLNAMPattern(){
				
					return "";
				
				}
				public String TBLNAMOriginalDbColumnName(){
				
					return "TBLNAM";
				
				}

				
			    public String TBLVAL;

				public String getTBLVAL () {
					return this.TBLVAL;
				}

				public Boolean TBLVALIsNullable(){
				    return true;
				}
				public Boolean TBLVALIsKey(){
				    return false;
				}
				public Integer TBLVALLength(){
				    return null;
				}
				public Integer TBLVALPrecision(){
				    return null;
				}
				public String TBLVALDefault(){
				
					return null;
				
				}
				public String TBLVALComment(){
				
				    return "";
				
				}
				public String TBLVALPattern(){
				
					return "";
				
				}
				public String TBLVALOriginalDbColumnName(){
				
					return "TBLVAL";
				
				}

				
			    public String TBLDSC;

				public String getTBLDSC () {
					return this.TBLDSC;
				}

				public Boolean TBLDSCIsNullable(){
				    return true;
				}
				public Boolean TBLDSCIsKey(){
				    return false;
				}
				public Integer TBLDSCLength(){
				    return null;
				}
				public Integer TBLDSCPrecision(){
				    return null;
				}
				public String TBLDSCDefault(){
				
					return null;
				
				}
				public String TBLDSCComment(){
				
				    return "";
				
				}
				public String TBLDSCPattern(){
				
					return "";
				
				}
				public String TBLDSCOriginalDbColumnName(){
				
					return "TBLDSC";
				
				}

				
			    public String TBLDEF;

				public String getTBLDEF () {
					return this.TBLDEF;
				}

				public Boolean TBLDEFIsNullable(){
				    return true;
				}
				public Boolean TBLDEFIsKey(){
				    return false;
				}
				public Integer TBLDEFLength(){
				    return null;
				}
				public Integer TBLDEFPrecision(){
				    return null;
				}
				public String TBLDEFDefault(){
				
					return null;
				
				}
				public String TBLDEFComment(){
				
				    return "";
				
				}
				public String TBLDEFPattern(){
				
					return "";
				
				}
				public String TBLDEFOriginalDbColumnName(){
				
					return "TBLDEF";
				
				}

				
			    public String TBLLAN;

				public String getTBLLAN () {
					return this.TBLLAN;
				}

				public Boolean TBLLANIsNullable(){
				    return true;
				}
				public Boolean TBLLANIsKey(){
				    return false;
				}
				public Integer TBLLANLength(){
				    return null;
				}
				public Integer TBLLANPrecision(){
				    return null;
				}
				public String TBLLANDefault(){
				
					return null;
				
				}
				public String TBLLANComment(){
				
				    return "";
				
				}
				public String TBLLANPattern(){
				
					return "";
				
				}
				public String TBLLANOriginalDbColumnName(){
				
					return "TBLLAN";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.TBLNAM = readString(dis);
					
					this.TBLVAL = readString(dis);
					
					this.TBLDSC = readString(dis);
					
					this.TBLDEF = readString(dis);
					
					this.TBLLAN = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.TBLNAM,dos);
					
					// String
				
						writeString(this.TBLVAL,dos);
					
					// String
				
						writeString(this.TBLDSC,dos);
					
					// String
				
						writeString(this.TBLDEF,dos);
					
					// String
				
						writeString(this.TBLLAN,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("TBLNAM="+TBLNAM);
		sb.append(",TBLVAL="+TBLVAL);
		sb.append(",TBLDSC="+TBLDSC);
		sb.append(",TBLDEF="+TBLDEF);
		sb.append(",TBLLAN="+TBLLAN);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(TBLNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLNAM);
            			}
            		
        			sb.append("|");
        		
        				if(TBLVAL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLVAL);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDSC);
            			}
            		
        			sb.append("|");
        		
        				if(TBLDEF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLDEF);
            			}
            		
        			sb.append("|");
        		
        				if(TBLLAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TBLLAN);
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



		row19Struct row19 = new row19Struct();
TBLFLDStruct TBLFLD = new TBLFLDStruct();





	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"TBLFLD");
			
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
 		                    "TABLE_FIELDS_FILE_TBLFLD");
 		                    
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
     		                    						
     		                    						a("\"name\":\"TABLE_FIELDS_FILE_TBLFLD\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"TBLNAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TBLNAM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TBLVAL\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":6,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TBLVAL\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TBLDSC\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":35,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TBLDSC\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TBLDEF\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":1,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TBLDEF\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"TBLLAN\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"TBLLAN\",\"talend.field.default\":\"\"},{",s);
     		                    						
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
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row19");
			
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
		int count_row19_tMap_1 = 0;
		
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
				int count_TBLFLD_tMap_1 = 0;
				
TBLFLDStruct TBLFLD_tmp = new TBLFLDStruct();
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
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLFLD.zip\"");
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
                            log4jParamters_tFileInputDelimited_1.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("TBLNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLVAL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLDSC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLDEF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TBLLAN")+"}]");
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
					
						Object filename_tFileInputDelimited_1 = "/data/talend/data_repository/TBLFLD.zip";	
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
						
			    						row19 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row19 = new row19Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row19.TBLNAM = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row19.TBLVAL = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
							row19.TBLDSC = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
							row19.TBLDEF = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
							row19.TBLLAN = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
				
										
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
// Start of branch "row19"
if(row19 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row19","tFileInputDelimited_1","tFileInputDelimited_1","tFileInputDelimited","tMap_1","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row19 - " + (row19==null? "": row19.toLogString()));
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

TBLFLD = null;


// # Output table : 'TBLFLD'
count_TBLFLD_tMap_1++;

TBLFLD_tmp.TBLNAM = row19.TBLNAM;
TBLFLD_tmp.TBLVAL = row19.TBLVAL;
TBLFLD_tmp.TBLDSC = row19.TBLDSC;
TBLFLD_tmp.TBLDEF = row19.TBLDEF;
TBLFLD_tmp.TBLLAN = row19.TBLLAN;
TBLFLD_tmp.LOAD_DATE = Var.var1 ;
TBLFLD = TBLFLD_tmp;
log.debug("tMap_1 - Outputting the record " + count_TBLFLD_tMap_1 + " of the output table 'TBLFLD'.");

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
// Start of branch "TBLFLD"
if(TBLFLD != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"TBLFLD","tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("TBLFLD - " + (TBLFLD==null? "": TBLFLD.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_1 != null) {
            incomingEnforcer_tDBOutput_1.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TBLNAM") != null){
                    incomingEnforcer_tDBOutput_1.put("TBLNAM", TBLFLD.TBLNAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TBLVAL") != null){
                    incomingEnforcer_tDBOutput_1.put("TBLVAL", TBLFLD.TBLVAL);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TBLDSC") != null){
                    incomingEnforcer_tDBOutput_1.put("TBLDSC", TBLFLD.TBLDSC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TBLDEF") != null){
                    incomingEnforcer_tDBOutput_1.put("TBLDEF", TBLFLD.TBLDEF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("TBLLAN") != null){
                    incomingEnforcer_tDBOutput_1.put("TBLLAN", TBLFLD.TBLLAN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_1 != null && incomingEnforcer_tDBOutput_1.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_1.put("LOAD_DATE", TBLFLD.LOAD_DATE);
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

} // End of branch "TBLFLD"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";
	
	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row19"




	
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
            if(!((Object)("/data/talend/data_repository/TBLFLD.zip") instanceof java.io.InputStream)){
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
				log.debug("tMap_1 - Written records count in the table 'TBLFLD': " + count_TBLFLD_tMap_1 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row19",2,0,
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"TBLFLD",2,0,
			 			"tMap_1","tMap_1","tMap","tDBOutput_1","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
				}
				tFileDelete_2Process(globalMap);



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
                            log4jParamters_tFileDelete_2.append("PATH" + " = " + "\"/data/talend/data_repository/TBLFLD.zip\"");
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
	java.io.File path_tFileDelete_2=new java.io.File("/data/talend/data_repository/TBLFLD.zip");
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
    globalMap.put("tFileDelete_2_DELETE_PATH","/data/talend/data_repository/TBLFLD.zip");
 


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
 		                    "DELETE from TABLE_OF_MERCHANDISERS_TBLMCH\nWHERE LOAD_DATE = CURRENT_DATE()");
 		                    
 		                    props_tDBRow_2.setValue("dieOnError",
 		                    false);
 		                    
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
				tDBRow_3Process(globalMap);



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
 		                    "\n create or replace TABLE TBLMCH (\n	MCHNUM VARCHAR(3),\n	MCHNAM VARCHAR(20),\n	MCHSCN NUMBER(1,0),\n	MCHSDT NUMBER(6,"
+"0),\n	MCHEXT VARCHAR(4),\n	LOAD_DATE DATE\n);\n\n");
 		                    
 		                    props_tDBRow_3.setValue("dieOnError",
 		                    false);
 		                    
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
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBInput_2Process(globalMap);



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
	


public static class row44Struct implements routines.system.IPersistableRow<row44Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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
				
					return null;
				
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

				
			    public String MCHNAM;

				public String getMCHNAM () {
					return this.MCHNAM;
				}

				public Boolean MCHNAMIsNullable(){
				    return false;
				}
				public Boolean MCHNAMIsKey(){
				    return false;
				}
				public Integer MCHNAMLength(){
				    return 20;
				}
				public Integer MCHNAMPrecision(){
				    return 0;
				}
				public String MCHNAMDefault(){
				
					return null;
				
				}
				public String MCHNAMComment(){
				
				    return "";
				
				}
				public String MCHNAMPattern(){
				
					return "";
				
				}
				public String MCHNAMOriginalDbColumnName(){
				
					return "MCHNAM";
				
				}

				
			    public BigDecimal MCHSCN;

				public BigDecimal getMCHSCN () {
					return this.MCHSCN;
				}

				public Boolean MCHSCNIsNullable(){
				    return false;
				}
				public Boolean MCHSCNIsKey(){
				    return false;
				}
				public Integer MCHSCNLength(){
				    return 1;
				}
				public Integer MCHSCNPrecision(){
				    return 0;
				}
				public String MCHSCNDefault(){
				
					return "";
				
				}
				public String MCHSCNComment(){
				
				    return "";
				
				}
				public String MCHSCNPattern(){
				
					return "";
				
				}
				public String MCHSCNOriginalDbColumnName(){
				
					return "MCHSCN";
				
				}

				
			    public BigDecimal MCHSDT;

				public BigDecimal getMCHSDT () {
					return this.MCHSDT;
				}

				public Boolean MCHSDTIsNullable(){
				    return false;
				}
				public Boolean MCHSDTIsKey(){
				    return false;
				}
				public Integer MCHSDTLength(){
				    return 6;
				}
				public Integer MCHSDTPrecision(){
				    return 0;
				}
				public String MCHSDTDefault(){
				
					return "";
				
				}
				public String MCHSDTComment(){
				
				    return "";
				
				}
				public String MCHSDTPattern(){
				
					return "";
				
				}
				public String MCHSDTOriginalDbColumnName(){
				
					return "MCHSDT";
				
				}

				
			    public String MCHEXT;

				public String getMCHEXT () {
					return this.MCHEXT;
				}

				public Boolean MCHEXTIsNullable(){
				    return false;
				}
				public Boolean MCHEXTIsKey(){
				    return false;
				}
				public Integer MCHEXTLength(){
				    return 4;
				}
				public Integer MCHEXTPrecision(){
				    return 0;
				}
				public String MCHEXTDefault(){
				
					return null;
				
				}
				public String MCHEXTComment(){
				
				    return "";
				
				}
				public String MCHEXTPattern(){
				
					return "";
				
				}
				public String MCHEXTOriginalDbColumnName(){
				
					return "MCHEXT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
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
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MCHNUM="+MCHNUM);
		sb.append(",MCHNAM="+MCHNAM);
		sb.append(",MCHSCN="+String.valueOf(MCHSCN));
		sb.append(",MCHSDT="+String.valueOf(MCHSDT));
		sb.append(",MCHEXT="+MCHEXT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNAM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSCN);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSDT);
            			}
            		
        			sb.append("|");
        		
        				if(MCHEXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHEXT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row44Struct other) {

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



		row44Struct row44 = new row44Struct();




	
	/**
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row44");
			
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
                            log4jParamters_tFileOutputDelimited_2.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLMCH.csv\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_2.append(" | ");
                            log4jParamters_tFileOutputDelimited_2.append("COMPRESS" + " = " + "true");
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
    fileName_tFileOutputDelimited_2 = (new java.io.File("/data/talend/data_repository/TBLMCH.csv")).getAbsolutePath().replace("\\","/");
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

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */","/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

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

                        filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
                        String zipName_tFileOutputDelimited_2 = fullName_tFileOutputDelimited_2 + ".zip";
                        java.io.File file_tFileOutputDelimited_2 = new java.io.File(zipName_tFileOutputDelimited_2);
                        //routines.system.Row
                        java.util.zip.ZipOutputStream zipOut_tFileOutputDelimited_2= null;
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        if(file_tFileOutputDelimited_2.exists()) {
                            file_tFileOutputDelimited_2.delete();
                        }
                        zipOut_tFileOutputDelimited_2= new java.util.zip.ZipOutputStream(
                                new java.io.BufferedOutputStream(new java.io.FileOutputStream(zipName_tFileOutputDelimited_2)));
                        zipOut_tFileOutputDelimited_2.putNextEntry(new java.util.zip.ZipEntry(filetFileOutputDelimited_2.getName()));
                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(zipOut_tFileOutputDelimited_2,"ISO-8859-15"));
                resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
                        synchronized (multiThreadLockWrite) {
                                    if(file_tFileOutputDelimited_2.length()==0){
                                        outtFileOutputDelimited_2.write("MCHNUM");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("MCHNAM");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("MCHSCN");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("MCHSDT");
                                            outtFileOutputDelimited_2.write(OUT_DELIM_tFileOutputDelimited_2);
                                        outtFileOutputDelimited_2.write("MCHEXT");
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
                            log4jParamters_tDBInput_2.append("QUERY" + " = " + "\"select * from MM4R5LIB.TBLMCH\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_2.append(" | ");
                            log4jParamters_tDBInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHSCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHEXT")+"}]");
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

		    String dbquery_tDBInput_2 = "select * from MM4R5LIB.TBLMCH";
		    
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
								row44.MCHNUM = null;
							} else {
	                         		
        	row44.MCHNUM = routines.system.JDBCUtil.getString(rs_tDBInput_2, 1, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row44.MCHNAM = null;
							} else {
	                         		
        	row44.MCHNAM = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row44.MCHSCN = null;
							} else {
		                          
            row44.MCHSCN = rs_tDBInput_2.getBigDecimal(3);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row44.MCHSDT = null;
							} else {
		                          
            row44.MCHSDT = rs_tDBInput_2.getBigDecimal(4);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row44.MCHEXT = null;
							} else {
	                         		
        	row44.MCHEXT = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
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
				
					,"row44","tDBInput_2","tDBInput_2","tAS400Input","tFileOutputDelimited_2","tFileOutputDelimited_2","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row44 - " + (row44==null? "": row44.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                            if(row44.MCHNUM != null) {
                        sb_tFileOutputDelimited_2.append(
                            row44.MCHNUM
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row44.MCHNAM != null) {
                        sb_tFileOutputDelimited_2.append(
                            row44.MCHNAM
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row44.MCHSCN != null) {
                        sb_tFileOutputDelimited_2.append(
                            row44.MCHSCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row44.MCHSDT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row44.MCHSDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_2.append(OUT_DELIM_tFileOutputDelimited_2);
                            if(row44.MCHEXT != null) {
                        sb_tFileOutputDelimited_2.append(
                            row44.MCHEXT
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
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row44",2,0,
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
									runStat.updateStatOnConnection("OnSubjobOk5", 0, "ok");
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
	


public static class TBLMCH_2Struct implements routines.system.IPersistableRow<TBLMCH_2Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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
				
					return null;
				
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

				
			    public String MCHNAM;

				public String getMCHNAM () {
					return this.MCHNAM;
				}

				public Boolean MCHNAMIsNullable(){
				    return true;
				}
				public Boolean MCHNAMIsKey(){
				    return false;
				}
				public Integer MCHNAMLength(){
				    return null;
				}
				public Integer MCHNAMPrecision(){
				    return null;
				}
				public String MCHNAMDefault(){
				
					return null;
				
				}
				public String MCHNAMComment(){
				
				    return "";
				
				}
				public String MCHNAMPattern(){
				
					return "";
				
				}
				public String MCHNAMOriginalDbColumnName(){
				
					return "MCHNAM";
				
				}

				
			    public BigDecimal MCHSCN;

				public BigDecimal getMCHSCN () {
					return this.MCHSCN;
				}

				public Boolean MCHSCNIsNullable(){
				    return true;
				}
				public Boolean MCHSCNIsKey(){
				    return false;
				}
				public Integer MCHSCNLength(){
				    return null;
				}
				public Integer MCHSCNPrecision(){
				    return null;
				}
				public String MCHSCNDefault(){
				
					return "";
				
				}
				public String MCHSCNComment(){
				
				    return "";
				
				}
				public String MCHSCNPattern(){
				
					return "";
				
				}
				public String MCHSCNOriginalDbColumnName(){
				
					return "MCHSCN";
				
				}

				
			    public BigDecimal MCHSDT;

				public BigDecimal getMCHSDT () {
					return this.MCHSDT;
				}

				public Boolean MCHSDTIsNullable(){
				    return true;
				}
				public Boolean MCHSDTIsKey(){
				    return false;
				}
				public Integer MCHSDTLength(){
				    return null;
				}
				public Integer MCHSDTPrecision(){
				    return null;
				}
				public String MCHSDTDefault(){
				
					return "";
				
				}
				public String MCHSDTComment(){
				
				    return "";
				
				}
				public String MCHSDTPattern(){
				
					return "";
				
				}
				public String MCHSDTOriginalDbColumnName(){
				
					return "MCHSDT";
				
				}

				
			    public String MCHEXT;

				public String getMCHEXT () {
					return this.MCHEXT;
				}

				public Boolean MCHEXTIsNullable(){
				    return true;
				}
				public Boolean MCHEXTIsKey(){
				    return false;
				}
				public Integer MCHEXTLength(){
				    return null;
				}
				public Integer MCHEXTPrecision(){
				    return null;
				}
				public String MCHEXTDefault(){
				
					return null;
				
				}
				public String MCHEXTComment(){
				
				    return "";
				
				}
				public String MCHEXTPattern(){
				
					return "";
				
				}
				public String MCHEXTOriginalDbColumnName(){
				
					return "MCHEXT";
				
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
					this.LOAD_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
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

		
					// String
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
					// java.util.Date
				
						writeDate(this.LOAD_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
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
		sb.append("MCHNUM="+MCHNUM);
		sb.append(",MCHNAM="+MCHNAM);
		sb.append(",MCHSCN="+String.valueOf(MCHSCN));
		sb.append(",MCHSDT="+String.valueOf(MCHSDT));
		sb.append(",MCHEXT="+MCHEXT);
		sb.append(",LOAD_DATE="+String.valueOf(LOAD_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNAM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSCN);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSDT);
            			}
            		
        			sb.append("|");
        		
        				if(MCHEXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHEXT);
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
    public int compareTo(TBLMCH_2Struct other) {

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

public static class row21Struct implements routines.system.IPersistableRow<row21Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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
				
					return null;
				
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

				
			    public String MCHNAM;

				public String getMCHNAM () {
					return this.MCHNAM;
				}

				public Boolean MCHNAMIsNullable(){
				    return true;
				}
				public Boolean MCHNAMIsKey(){
				    return false;
				}
				public Integer MCHNAMLength(){
				    return null;
				}
				public Integer MCHNAMPrecision(){
				    return null;
				}
				public String MCHNAMDefault(){
				
					return null;
				
				}
				public String MCHNAMComment(){
				
				    return "";
				
				}
				public String MCHNAMPattern(){
				
					return "";
				
				}
				public String MCHNAMOriginalDbColumnName(){
				
					return "MCHNAM";
				
				}

				
			    public BigDecimal MCHSCN;

				public BigDecimal getMCHSCN () {
					return this.MCHSCN;
				}

				public Boolean MCHSCNIsNullable(){
				    return true;
				}
				public Boolean MCHSCNIsKey(){
				    return false;
				}
				public Integer MCHSCNLength(){
				    return null;
				}
				public Integer MCHSCNPrecision(){
				    return null;
				}
				public String MCHSCNDefault(){
				
					return "";
				
				}
				public String MCHSCNComment(){
				
				    return "";
				
				}
				public String MCHSCNPattern(){
				
					return "";
				
				}
				public String MCHSCNOriginalDbColumnName(){
				
					return "MCHSCN";
				
				}

				
			    public BigDecimal MCHSDT;

				public BigDecimal getMCHSDT () {
					return this.MCHSDT;
				}

				public Boolean MCHSDTIsNullable(){
				    return true;
				}
				public Boolean MCHSDTIsKey(){
				    return false;
				}
				public Integer MCHSDTLength(){
				    return null;
				}
				public Integer MCHSDTPrecision(){
				    return null;
				}
				public String MCHSDTDefault(){
				
					return null;
				
				}
				public String MCHSDTComment(){
				
				    return "";
				
				}
				public String MCHSDTPattern(){
				
					return "yyyy-MM-dd";
				
				}
				public String MCHSDTOriginalDbColumnName(){
				
					return "MCHSDT";
				
				}

				
			    public String MCHEXT;

				public String getMCHEXT () {
					return this.MCHEXT;
				}

				public Boolean MCHEXTIsNullable(){
				    return true;
				}
				public Boolean MCHEXTIsKey(){
				    return false;
				}
				public Integer MCHEXTLength(){
				    return null;
				}
				public Integer MCHEXTPrecision(){
				    return null;
				}
				public String MCHEXTDefault(){
				
					return null;
				
				}
				public String MCHEXTComment(){
				
				    return "";
				
				}
				public String MCHEXTPattern(){
				
					return "";
				
				}
				public String MCHEXTOriginalDbColumnName(){
				
					return "MCHEXT";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_TTAALLCL3.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_TTAALLCL3, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
					this.MCHNUM = readString(dis);
					
					this.MCHNAM = readString(dis);
					
						this.MCHSCN = (BigDecimal) dis.readObject();
					
						this.MCHSDT = (BigDecimal) dis.readObject();
					
					this.MCHEXT = readString(dis);
					
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
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.MCHNUM,dos);
					
					// String
				
						writeString(this.MCHNAM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MCHSDT);
					
					// String
				
						writeString(this.MCHEXT,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("MCHNUM="+MCHNUM);
		sb.append(",MCHNAM="+MCHNAM);
		sb.append(",MCHSCN="+String.valueOf(MCHSCN));
		sb.append(",MCHSDT="+String.valueOf(MCHSDT));
		sb.append(",MCHEXT="+MCHEXT);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(MCHNUM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNUM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHNAM);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSCN);
            			}
            		
        			sb.append("|");
        		
        				if(MCHSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHSDT);
            			}
            		
        			sb.append("|");
        		
        				if(MCHEXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MCHEXT);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row21Struct other) {

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



		row21Struct row21 = new row21Struct();
TBLMCH_2Struct TBLMCH_2 = new TBLMCH_2Struct();





	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"TBLMCH_2");
			
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
 		                    "TBLMCH");
 		                    
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
     		                    						
     		                    						a("\"name\":\"TBLMCH\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"MCHNUM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":3,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MCHNUM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MCHNAM\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":20,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MCHNAM\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MCHSCN\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":1,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"MCHSCN\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MCHSDT\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"talend.field.precision\":6,\"talend.field.scale\":0,\"talend.field.dbType\":-5,\"talend.field.dbColumnName\":\"MCHSDT\",\"talend.field.default\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"MCHEXT\",\"type\":[\"string\",\"null\"],\"default\":\"\",\"talend.field.length\":4,\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"MCHEXT\",\"talend.field.default\":\"\"},{",s);
     		                    						
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
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row21");
			
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
		int count_row21_tMap_2 = 0;
		
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
				int count_TBLMCH_2_tMap_2 = 0;
				
TBLMCH_2Struct TBLMCH_2_tmp = new TBLMCH_2Struct();
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
                            log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "\"/data/talend/data_repository/TBLMCH.zip\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\",\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "true");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNUM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHSCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MCHEXT")+"}]");
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
					
						Object filename_tFileInputDelimited_2 = "/data/talend/data_repository/TBLMCH.zip";	
						java.util.zip.ZipInputStream zis_tFileInputDelimited_2 = null;
						try {
							if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
								zis_tFileInputDelimited_2 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream((java.io.InputStream)filename_tFileInputDelimited_2));
							}else{
								zis_tFileInputDelimited_2 = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(String.valueOf(filename_tFileInputDelimited_2))));
							}
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
						java.util.zip.ZipEntry entry_tFileInputDelimited_2 = null;
		
						while (true) {
							try {
								entry_tFileInputDelimited_2 = zis_tFileInputDelimited_2.getNextEntry();
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
							if(entry_tFileInputDelimited_2 == null) {
								break;
							}
							if(entry_tFileInputDelimited_2.isDirectory()){ //directory
								continue;
							}
							try {
								fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited(zis_tFileInputDelimited_2, "ISO-8859-15",",","\n",false,1,0,
								
									limit_tFileInputDelimited_2
								,-1, false);
							} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
								
									throw e;
								
							}
					
				    
				    	log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_2!=null && fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();
						
			    						row21 = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									row21 = new row21Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
							row21.MCHNUM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 1;
					
							row21.MCHNAM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 2;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row21.MCHSCN = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"MCHSCN", "row21", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row21.MCHSCN = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 3;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row21.MCHSDT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"MCHSDT", "row21", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row21.MCHSDT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 4;
					
							row21.MCHEXT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
				
										
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
// Start of branch "row21"
if(row21 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row21","tFileInputDelimited_2","tFileInputDelimited_2","tFileInputDelimited","tMap_2","tMap_2","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row21 - " + (row21==null? "": row21.toLogString()));
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
Var.var1 = TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")) ;// ###############################
        // ###############################
        // # Output tables

TBLMCH_2 = null;


// # Output table : 'TBLMCH_2'
count_TBLMCH_2_tMap_2++;

TBLMCH_2_tmp.MCHNUM = row21.MCHNUM;
TBLMCH_2_tmp.MCHNAM = row21.MCHNAM;
TBLMCH_2_tmp.MCHSCN = row21.MCHSCN;
TBLMCH_2_tmp.MCHSDT = row21.MCHSDT;
TBLMCH_2_tmp.MCHEXT = row21.MCHEXT;
TBLMCH_2_tmp.LOAD_DATE = Var.var1 ;
TBLMCH_2 = TBLMCH_2_tmp;
log.debug("tMap_2 - Outputting the record " + count_TBLMCH_2_tMap_2 + " of the output table 'TBLMCH_2'.");

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
// Start of branch "TBLMCH_2"
if(TBLMCH_2 != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"TBLMCH_2","tMap_2","tMap_2","tMap","tDBOutput_3","tDBOutput_2","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("TBLMCH_2 - " + (TBLMCH_2==null? "": TBLMCH_2.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_3 != null) {
            incomingEnforcer_tDBOutput_3.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("MCHNUM") != null){
                    incomingEnforcer_tDBOutput_3.put("MCHNUM", TBLMCH_2.MCHNUM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("MCHNAM") != null){
                    incomingEnforcer_tDBOutput_3.put("MCHNAM", TBLMCH_2.MCHNAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("MCHSCN") != null){
                    incomingEnforcer_tDBOutput_3.put("MCHSCN", TBLMCH_2.MCHSCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("MCHSDT") != null){
                    incomingEnforcer_tDBOutput_3.put("MCHSDT", TBLMCH_2.MCHSDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("MCHEXT") != null){
                    incomingEnforcer_tDBOutput_3.put("MCHEXT", TBLMCH_2.MCHEXT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_3 != null && incomingEnforcer_tDBOutput_3.getRuntimeSchema().getField("LOAD_DATE") != null){
                    incomingEnforcer_tDBOutput_3.put("LOAD_DATE", TBLMCH_2.LOAD_DATE);
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

} // End of branch "TBLMCH_2"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row21"




	
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
            nb_line_tFileInputDelimited_2+=fid_tFileInputDelimited_2.getRowNumber();
		}
		}finally{
            if(!((Object)("/data/talend/data_repository/TBLMCH.zip") instanceof java.io.InputStream)){
            	if(fid_tFileInputDelimited_2!=null){
            		fid_tFileInputDelimited_2.close();
            	}
            }
            if(fid_tFileInputDelimited_2!=null){
            	globalMap.put("tFileInputDelimited_2_NB_LINE", nb_line_tFileInputDelimited_2);
            }
					
						log.info("tFileInputDelimited_2- Retrieved records count: "+ nb_line_tFileInputDelimited_2 + ".");
					
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
				log.debug("tMap_2 - Written records count in the table 'TBLMCH_2': " + count_TBLMCH_2_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row21",2,0,
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"TBLMCH_2",2,0,
			 			"tMap_2","tMap_2","tMap","tDBOutput_3","tDBOutput_2","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tFileDelete_3Process(globalMap);



/**
 * [tDBOutput_3 end ] stop
 */






				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk6", 0, "ok");
								} 
							
							tDBRow_5Process(globalMap); 
						



	
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
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tFileDelete_3.append("PATH" + " = " + "\"/data/talend/data_repository/TBLMCH.zip\"");
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
				talendJobLog.addCM("tFileDelete_3", "tFileDelete_3", "tFileDelete");
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
	java.io.File path_tFileDelete_3=new java.io.File("/data/talend/data_repository/TBLMCH.zip");
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
    globalMap.put("tFileDelete_3_DELETE_PATH","/data/talend/data_repository/TBLMCH.zip");
 


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



		


	
	/**
	 * [tDBRow_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_5", false);
		start_Hash.put("tDBRow_5", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_5";
	
	
		int tos_count_tDBRow_5 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_5", "tDBRow_5", "tSnowflakeRow");
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
 		                    "\ninsert into TABLE_OF_MERCHANDISERS_TBLMCH\nselect\nMCHNUM,\nMCHNAM,\nMCHSCN,\n    case\n        when LENGTH(MCHSDT)= "
+"5 then TO_DATE(CONCAT( '200', TO_VARCHAR(MCHSDT)),'yyyymmdd')\n        else TO_DATE(CONCAT( '20', MCHSDT), 'yyyymmdd')\n"
+"    end as MCHSDT,\nMCHEXT,\nLOAD_DATE\nfrom TBLMCH\n\n\n");
 		                    
 		                    props_tDBRow_5.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_5.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_5.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_5_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_5_1_fisrt sst_tDBRow_5_1_fisrt = new SchemaSettingTool_tDBRow_5_1_fisrt();
 		                    
 		                    props_tDBRow_5.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_5_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_5_2_fisrt sst_tDBRow_5_2_fisrt = new SchemaSettingTool_tDBRow_5_2_fisrt();
 		                    
 		                    props_tDBRow_5.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_5.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
 		                    
 		                    props_tDBRow_5.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
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
     		                    						
     		                    						a("\"name\":\"EmptyRecord\",\"fields\":[]}",s);
     		                    						
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
topology_tDBRow_5 = org.talend.components.api.component.ConnectorTopology.NONE;

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

 

ok_Hash.put("tDBRow_5", true);
end_Hash.put("tDBRow_5", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tDBRow_6Process(globalMap);



/**
 * [tDBRow_5 end ] stop
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
}
 



/**
 * [tDBRow_5 finally ] stop
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
	

public void tDBRow_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_6");
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
	 * [tDBRow_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_6", false);
		start_Hash.put("tDBRow_6", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_6";
	
	
		int tos_count_tDBRow_6 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_6", "tDBRow_6", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_6 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_6 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_6 = (String)(restRequest_tDBRow_6 != null ? restRequest_tDBRow_6.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_6 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_6 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_6 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_6 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_6.createRuntimeProperties();
 		                    props_tDBRow_6.setValue("query",
 		                    "\nDrop table TBLMCH\n\n");
 		                    
 		                    props_tDBRow_6.setValue("dieOnError",
 		                    true);
 		                    
 		                    props_tDBRow_6.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_6.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_6_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_6_1_fisrt sst_tDBRow_6_1_fisrt = new SchemaSettingTool_tDBRow_6_1_fisrt();
 		                    
 		                    props_tDBRow_6.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_6_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_6_2_fisrt sst_tDBRow_6_2_fisrt = new SchemaSettingTool_tDBRow_6_2_fisrt();
 		                    
 		                    props_tDBRow_6.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_6.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_6.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_6.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_6.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_6.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_6.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_6.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_6.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_6.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_6.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_6.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_6.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_6.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_6_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_6_3_fisrt sst_tDBRow_6_3_fisrt = new SchemaSettingTool_tDBRow_6_3_fisrt();
 		                    
 		                    props_tDBRow_6.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_6.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_6 = props_tDBRow_6.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_6.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_6);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_6.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_6 = props_tDBRow_6.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_6 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_6 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_6 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_6.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_6);
        }
    }
globalMap.put("tDBRow_6_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_6);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_6= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBRow_6_MAPPINGS_URL", mappings_url_tDBRow_6);

org.talend.components.api.container.RuntimeContainer container_tDBRow_6 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBRow_6";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBRow_6 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBRow_6 = null;
topology_tDBRow_6 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_6 = def_tDBRow_6.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_6, topology_tDBRow_6);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_6 = def_tDBRow_6.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_6 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_6.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_6 = componentRuntime_tDBRow_6.initialize(container_tDBRow_6, props_tDBRow_6);

if (initVr_tDBRow_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_6.getMessage());
}

if(componentRuntime_tDBRow_6 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_6 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_6;
	compDriverInitialization_tDBRow_6.runAtDriver(container_tDBRow_6);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_6 = null;
if(componentRuntime_tDBRow_6 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_6 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_6;
	if (doesNodeBelongToRequest_tDBRow_6) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_6 = sourceOrSink_tDBRow_6.validate(container_tDBRow_6);
        if (vr_tDBRow_6.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBRow_6.getMessage());
        }
	}
}

 



/**
 * [tDBRow_6 begin ] stop
 */
	
	/**
	 * [tDBRow_6 main ] start
	 */

	

	
	
	currentComponent="tDBRow_6";
	
	


 


	tos_count_tDBRow_6++;

/**
 * [tDBRow_6 main ] stop
 */
	
	/**
	 * [tDBRow_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_6";
	
	


 



/**
 * [tDBRow_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_6";
	
	


 



/**
 * [tDBRow_6 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_6 end ] start
	 */

	

	
	
	currentComponent="tDBRow_6";
	
	
// end of generic


resourceMap.put("finish_tDBRow_6", Boolean.TRUE);

 

ok_Hash.put("tDBRow_6", true);
end_Hash.put("tDBRow_6", System.currentTimeMillis());




/**
 * [tDBRow_6 end ] stop
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
	 * [tDBRow_6 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_6";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_6")==null){
}
 



/**
 * [tDBRow_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_6_SUBPROCESS_STATE", 1);
	}
	

public void tDBRow_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBRow_7_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDBRow_7");
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
	 * [tDBRow_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_7", false);
		start_Hash.put("tDBRow_7", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_7";
	
	
		int tos_count_tDBRow_7 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_7", "tDBRow_7", "tSnowflakeRow");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBRow_7 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBRow_7 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBRow_7 = (String)(restRequest_tDBRow_7 != null ? restRequest_tDBRow_7.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBRow_7 =
        new org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBRow_7 = null;
org.talend.components.api.component.runtime.Reader reader_tDBRow_7 = null;


org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties props_tDBRow_7 =
        (org.talend.components.snowflake.tsnowflakerow.TSnowflakeRowProperties) def_tDBRow_7.createRuntimeProperties();
 		                    props_tDBRow_7.setValue("query",
 		                    "DELETE from INVBAL_EXTENSION_INVBAL2\nWHERE DATELOADED = CURRENT_DATE()");
 		                    
 		                    props_tDBRow_7.setValue("dieOnError",
 		                    false);
 		                    
 		                    props_tDBRow_7.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_7.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_7_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_7_1_fisrt sst_tDBRow_7_1_fisrt = new SchemaSettingTool_tDBRow_7_1_fisrt();
 		                    
 		                    props_tDBRow_7.schemaFlow.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_1_fisrt.getSchemaValue()));
 		                    
 		                    class SchemaSettingTool_tDBRow_7_2_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_7_2_fisrt sst_tDBRow_7_2_fisrt = new SchemaSettingTool_tDBRow_7_2_fisrt();
 		                    
 		                    props_tDBRow_7.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_2_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBRow_7.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_7.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_7.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_7.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_7.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_7.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBRow_7.table.setValue("tableName",
 		                    "");
 		                    
 		                    props_tDBRow_7.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBRow_7.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBRow_7.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBRow_7.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBRow_7.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBRow_7.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBRow_7_3_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBRow_7_3_fisrt sst_tDBRow_7_3_fisrt = new SchemaSettingTool_tDBRow_7_3_fisrt();
 		                    
 		                    props_tDBRow_7.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_7_3_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_7.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_7 = props_tDBRow_7.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_7 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_7 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_7 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_7.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_7);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBRow_7.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBRow_7 = props_tDBRow_7.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBRow_7 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBRow_7 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBRow_7 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBRow_7.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBRow_7);
        }
    }
globalMap.put("tDBRow_7_COMPONENT_RUNTIME_PROPERTIES", props_tDBRow_7);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBRow_7= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBRow_7_MAPPINGS_URL", mappings_url_tDBRow_7);

org.talend.components.api.container.RuntimeContainer container_tDBRow_7 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBRow_7";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBRow_7 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBRow_7 = null;
topology_tDBRow_7 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBRow_7 = def_tDBRow_7.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBRow_7, topology_tDBRow_7);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBRow_7 = def_tDBRow_7.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBRow_7 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBRow_7.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBRow_7 = componentRuntime_tDBRow_7.initialize(container_tDBRow_7, props_tDBRow_7);

if (initVr_tDBRow_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBRow_7.getMessage());
}

if(componentRuntime_tDBRow_7 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBRow_7 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBRow_7;
	compDriverInitialization_tDBRow_7.runAtDriver(container_tDBRow_7);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBRow_7 = null;
if(componentRuntime_tDBRow_7 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBRow_7 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBRow_7;
	if (doesNodeBelongToRequest_tDBRow_7) {
        org.talend.daikon.properties.ValidationResult vr_tDBRow_7 = sourceOrSink_tDBRow_7.validate(container_tDBRow_7);
        if (vr_tDBRow_7.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBRow_7.getMessage());
        }
	}
}

 



/**
 * [tDBRow_7 begin ] stop
 */
	
	/**
	 * [tDBRow_7 main ] start
	 */

	

	
	
	currentComponent="tDBRow_7";
	
	


 


	tos_count_tDBRow_7++;

/**
 * [tDBRow_7 main ] stop
 */
	
	/**
	 * [tDBRow_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBRow_7";
	
	


 



/**
 * [tDBRow_7 process_data_begin ] stop
 */
	
	/**
	 * [tDBRow_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBRow_7";
	
	


 



/**
 * [tDBRow_7 process_data_end ] stop
 */
	
	/**
	 * [tDBRow_7 end ] start
	 */

	

	
	
	currentComponent="tDBRow_7";
	
	
// end of generic


resourceMap.put("finish_tDBRow_7", Boolean.TRUE);

 

ok_Hash.put("tDBRow_7", true);
end_Hash.put("tDBRow_7", System.currentTimeMillis());




/**
 * [tDBRow_7 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tDBRow_7:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk7", 0, "ok");
								} 
							
							tDBInput_3Process(globalMap); 
						



	
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
	 * [tDBRow_7 finally ] start
	 */

	

	
	
	currentComponent="tDBRow_7";
	
	
// finally of generic


if(resourceMap.get("finish_tDBRow_7")==null){
}
 



/**
 * [tDBRow_7 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBRow_7_SUBPROCESS_STATE", 1);
	}
	


public static class row38Struct implements routines.system.IPersistableRow<row38Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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

				
			    public BigDecimal LOCNBR;

				public BigDecimal getLOCNBR () {
					return this.LOCNBR;
				}

				public Boolean LOCNBRIsNullable(){
				    return true;
				}
				public Boolean LOCNBRIsKey(){
				    return false;
				}
				public Integer LOCNBRLength(){
				    return 5;
				}
				public Integer LOCNBRPrecision(){
				    return 0;
				}
				public String LOCNBRDefault(){
				
					return "";
				
				}
				public String LOCNBRComment(){
				
				    return "";
				
				}
				public String LOCNBRPattern(){
				
					return "";
				
				}
				public String LOCNBROriginalDbColumnName(){
				
					return "LOCNBR";
				
				}

				
			    public BigDecimal SOFTCM;

				public BigDecimal getSOFTCM () {
					return this.SOFTCM;
				}

				public Boolean SOFTCMIsNullable(){
				    return true;
				}
				public Boolean SOFTCMIsKey(){
				    return false;
				}
				public Integer SOFTCMLength(){
				    return 7;
				}
				public Integer SOFTCMPrecision(){
				    return 0;
				}
				public String SOFTCMDefault(){
				
					return "";
				
				}
				public String SOFTCMComment(){
				
				    return "";
				
				}
				public String SOFTCMPattern(){
				
					return "";
				
				}
				public String SOFTCMOriginalDbColumnName(){
				
					return "SOFTCM";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",LOCNBR="+String.valueOf(LOCNBR));
		sb.append(",SOFTCM="+String.valueOf(SOFTCM));
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
        		
        				if(LOCNBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOCNBR);
            			}
            		
        			sb.append("|");
        		
        				if(SOFTCM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOFTCM);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row38Struct other) {

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



		row38Struct row38 = new row38Struct();




	
	/**
	 * [tFileOutputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_3", false);
		start_Hash.put("tFileOutputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row38");
			
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
                            log4jParamters_tFileOutputDelimited_3.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVBAL2.zip\"");
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
				talendJobLog.addCM("tFileOutputDelimited_3", "tFileOutputDelimited_3", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_3 = "";
    fileName_tFileOutputDelimited_3 = (new java.io.File("/data/talend/data_repository/INVBAL2.zip")).getAbsolutePath().replace("\\","/");
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
                                        outtFileOutputDelimited_3.write("INUMBR");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("LOCNBR");
                                            outtFileOutputDelimited_3.write(OUT_DELIM_tFileOutputDelimited_3);
                                        outtFileOutputDelimited_3.write("SOFTCM");
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
                            log4jParamters_tDBInput_3.append("QUERY" + " = " + "\"select * from MM4R5LIB.INVBAL2\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_3.append(" | ");
                            log4jParamters_tDBInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCNBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOFTCM")+"}]");
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
				talendJobLog.addCM("tDBInput_3", "tDBInput_3", "tAS400Input");
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

		    String dbquery_tDBInput_3 = "select * from MM4R5LIB.INVBAL2";
		    
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
								row38.INUMBR = null;
							} else {
		                          
            row38.INUMBR = rs_tDBInput_3.getBigDecimal(1);
            if(rs_tDBInput_3.wasNull()){
                    row38.INUMBR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row38.LOCNBR = null;
							} else {
		                          
            row38.LOCNBR = rs_tDBInput_3.getBigDecimal(2);
            if(rs_tDBInput_3.wasNull()){
                    row38.LOCNBR = null;
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row38.SOFTCM = null;
							} else {
		                          
            row38.SOFTCM = rs_tDBInput_3.getBigDecimal(3);
            if(rs_tDBInput_3.wasNull()){
                    row38.SOFTCM = null;
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
				
					,"row38","tDBInput_3","tDBInput_3","tAS400Input","tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row38 - " + (row38==null? "": row38.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_3 = new StringBuilder();
                            if(row38.INUMBR != null) {
                        sb_tFileOutputDelimited_3.append(
                            row38.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row38.LOCNBR != null) {
                        sb_tFileOutputDelimited_3.append(
                            row38.LOCNBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_3.append(OUT_DELIM_tFileOutputDelimited_3);
                            if(row38.SOFTCM != null) {
                        sb_tFileOutputDelimited_3.append(
                            row38.SOFTCM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
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
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row38",2,0,
			 			"tDBInput_3","tDBInput_3","tAS400Input","tFileOutputDelimited_3","tFileOutputDelimited_3","tFileOutputDelimited","output")) {
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
									runStat.updateStatOnConnection("OnSubjobOk8", 0, "ok");
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
	


public static class INVBAL2Struct implements routines.system.IPersistableRow<INVBAL2Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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

				
			    public BigDecimal LOCNBR;

				public BigDecimal getLOCNBR () {
					return this.LOCNBR;
				}

				public Boolean LOCNBRIsNullable(){
				    return true;
				}
				public Boolean LOCNBRIsKey(){
				    return false;
				}
				public Integer LOCNBRLength(){
				    return null;
				}
				public Integer LOCNBRPrecision(){
				    return null;
				}
				public String LOCNBRDefault(){
				
					return "";
				
				}
				public String LOCNBRComment(){
				
				    return "";
				
				}
				public String LOCNBRPattern(){
				
					return "";
				
				}
				public String LOCNBROriginalDbColumnName(){
				
					return "LOCNBR";
				
				}

				
			    public BigDecimal SOFTCM;

				public BigDecimal getSOFTCM () {
					return this.SOFTCM;
				}

				public Boolean SOFTCMIsNullable(){
				    return true;
				}
				public Boolean SOFTCMIsKey(){
				    return false;
				}
				public Integer SOFTCMLength(){
				    return null;
				}
				public Integer SOFTCMPrecision(){
				    return null;
				}
				public String SOFTCMDefault(){
				
					return "";
				
				}
				public String SOFTCMComment(){
				
				    return "";
				
				}
				public String SOFTCMPattern(){
				
					return "";
				
				}
				public String SOFTCMOriginalDbColumnName(){
				
					return "SOFTCM";
				
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
					this.DATELOADED = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
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
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
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
		sb.append(",LOCNBR="+String.valueOf(LOCNBR));
		sb.append(",SOFTCM="+String.valueOf(SOFTCM));
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
        		
        				if(LOCNBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOCNBR);
            			}
            		
        			sb.append("|");
        		
        				if(SOFTCM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOFTCM);
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
    public int compareTo(INVBAL2Struct other) {

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

public static class row16Struct implements routines.system.IPersistableRow<row16Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_TTAALLCL3 = new byte[0];

	
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

				
			    public BigDecimal LOCNBR;

				public BigDecimal getLOCNBR () {
					return this.LOCNBR;
				}

				public Boolean LOCNBRIsNullable(){
				    return true;
				}
				public Boolean LOCNBRIsKey(){
				    return false;
				}
				public Integer LOCNBRLength(){
				    return null;
				}
				public Integer LOCNBRPrecision(){
				    return null;
				}
				public String LOCNBRDefault(){
				
					return "";
				
				}
				public String LOCNBRComment(){
				
				    return "";
				
				}
				public String LOCNBRPattern(){
				
					return "";
				
				}
				public String LOCNBROriginalDbColumnName(){
				
					return "LOCNBR";
				
				}

				
			    public BigDecimal SOFTCM;

				public BigDecimal getSOFTCM () {
					return this.SOFTCM;
				}

				public Boolean SOFTCMIsNullable(){
				    return true;
				}
				public Boolean SOFTCMIsKey(){
				    return false;
				}
				public Integer SOFTCMLength(){
				    return null;
				}
				public Integer SOFTCMPrecision(){
				    return null;
				}
				public String SOFTCMDefault(){
				
					return "";
				
				}
				public String SOFTCMComment(){
				
				    return "";
				
				}
				public String SOFTCMPattern(){
				
					return "";
				
				}
				public String SOFTCMOriginalDbColumnName(){
				
					return "SOFTCM";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_TTAALLCL3) {

        	try {

        		int length = 0;
		
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.LOCNBR = (BigDecimal) dis.readObject();
					
						this.SOFTCM = (BigDecimal) dis.readObject();
					
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
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.LOCNBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SOFTCM);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("INUMBR="+String.valueOf(INUMBR));
		sb.append(",LOCNBR="+String.valueOf(LOCNBR));
		sb.append(",SOFTCM="+String.valueOf(SOFTCM));
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
        		
        				if(LOCNBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOCNBR);
            			}
            		
        			sb.append("|");
        		
        				if(SOFTCM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SOFTCM);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row16Struct other) {

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



		row16Struct row16 = new row16Struct();
INVBAL2Struct INVBAL2 = new INVBAL2Struct();





	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"INVBAL2");
			
		int tos_count_tDBOutput_4 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_4", "tDBOutput_2", "tSnowflakeOutput");
				talendJobLogProcess(globalMap);
			}
			

boolean doesNodeBelongToRequest_tDBOutput_4 = 0 == 0;
@SuppressWarnings("unchecked")
java.util.Map<String, Object> restRequest_tDBOutput_4 = (java.util.Map<String, Object>)globalMap.get("restRequest");
String currentTRestRequestOperation_tDBOutput_4 = (String)(restRequest_tDBOutput_4 != null ? restRequest_tDBOutput_4.get("OPERATION") : null);

org.talend.components.api.component.ComponentDefinition def_tDBOutput_4 =
        new org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputDefinition();

org.talend.components.api.component.runtime.Writer writer_tDBOutput_4 = null;
org.talend.components.api.component.runtime.Reader reader_tDBOutput_4 = null;


org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties props_tDBOutput_4 =
        (org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties) def_tDBOutput_4.createRuntimeProperties();
 		                    props_tDBOutput_4.setValue("tableAction",
 		                        org.talend.components.common.tableaction.TableAction.TableActionEnum.NONE);
 		                    
 		                    props_tDBOutput_4.setValue("outputAction",
 		                        org.talend.components.snowflake.tsnowflakeoutput.TSnowflakeOutputProperties.OutputAction.INSERT);
 		                    
 		                    props_tDBOutput_4.setValue("convertColumnsAndTableToUppercase",
 		                    true);
 		                    
 		                    props_tDBOutput_4.setValue("convertEmptyStringsToNull",
 		                    false);
 		                    
 		                    props_tDBOutput_4.setValue("useSchemaDatePattern",
 		                    false);
 		                    
 		                    props_tDBOutput_4.setValue("dieOnError",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tDBOutput_4_1_fisrt {
 		                    		
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
 		                    
 		                    SchemaSettingTool_tDBOutput_4_1_fisrt sst_tDBOutput_4_1_fisrt = new SchemaSettingTool_tDBOutput_4_1_fisrt();
 		                    
 		                    props_tDBOutput_4.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_4_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tDBOutput_4.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_4.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_4.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_4.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_4.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_4.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    props_tDBOutput_4.table.setValue("tableName",
 		                    "INVBAL_EXTENSION_INVBAL2");
 		                    
 		                    props_tDBOutput_4.table.connection.setValue("region",
 		                        org.talend.components.snowflake.SnowflakeRegion.AWS_US_EAST_1);
 		                    
 		                    props_tDBOutput_4.table.connection.setValue("useCustomRegion",
 		                    false);
 		                    
 		                    props_tDBOutput_4.table.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tDBOutput_4.table.connection.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tDBOutput_4.table.connection.referencedComponent.setValue("componentInstanceId",
 		                    "tDBConnection_1");
 		                    
 		                    props_tDBOutput_4.table.connection.referencedComponent.setValue("referenceDefinitionName",
 		                    "tSnowflakeConnection");
 		                    
 		                    class SchemaSettingTool_tDBOutput_4_2_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"INVBAL2\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"INUMBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"INUMBR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"INUMBR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"INUMBR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"LOCNBR\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOCNBR\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"LOCNBR\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"LOCNBR\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"SOFTCM\",\"type\":[{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"},\"null\"],\"default\":\"\",\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SOFTCM\",\"talend.field.default\":\"\",\"talend.field.dbColumnName\":\"SOFTCM\",\"di.column.talendType\":\"id_BigDecimal\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SOFTCM\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"DATELOADED\",\"type\":[{\"type\":\"int\",\"logicalType\":\"date\"},\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"LOAD_DATE\",\"talend.field.dbColumnName\":\"DATELOADED\",\"di.prop.di.date.date\":\"true\",\"di.column.talendType\":\"id_Date\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"yyyy-MM-dd\",\"di.column.relationshipType\":\"\",\"di.prop.di.column.logicalType\":\"date\",\"di.table.label\":\"DATELOADED\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"INVBAL2\",\"di.table.label\":\"INVBAL2\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBOutput_4_2_fisrt sst_tDBOutput_4_2_fisrt = new SchemaSettingTool_tDBOutput_4_2_fisrt();
 		                    
 		                    props_tDBOutput_4.table.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBOutput_4_2_fisrt.getSchemaValue()));
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_4.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_4 = props_tDBOutput_4.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_4.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_4);
        }
    }
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tDBOutput_4.table.connection.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tDBOutput_4 = props_tDBOutput_4.table.connection.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tDBOutput_4 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tDBOutput_4 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tDBOutput_4 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tDBOutput_4.table.connection.referencedComponent.setReference(referencedComponentProperties_tDBOutput_4);
        }
    }
globalMap.put("tDBOutput_4_COMPONENT_RUNTIME_PROPERTIES", props_tDBOutput_4);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "8.0");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.37.20");
java.net.URL mappings_url_tDBOutput_4= this.getClass().getResource("/xmlMappings");
globalMap.put("tDBOutput_4_MAPPINGS_URL", mappings_url_tDBOutput_4);

org.talend.components.api.container.RuntimeContainer container_tDBOutput_4 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tDBOutput_4";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tDBOutput_4 = 0;

org.talend.components.api.component.ConnectorTopology topology_tDBOutput_4 = null;
topology_tDBOutput_4 = org.talend.components.api.component.ConnectorTopology.INCOMING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tDBOutput_4 = def_tDBOutput_4.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tDBOutput_4, topology_tDBOutput_4);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tDBOutput_4 = def_tDBOutput_4.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tDBOutput_4 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tDBOutput_4.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tDBOutput_4 = componentRuntime_tDBOutput_4.initialize(container_tDBOutput_4, props_tDBOutput_4);

if (initVr_tDBOutput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tDBOutput_4.getMessage());
}

if(componentRuntime_tDBOutput_4 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tDBOutput_4 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tDBOutput_4;
	compDriverInitialization_tDBOutput_4.runAtDriver(container_tDBOutput_4);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tDBOutput_4 = null;
if(componentRuntime_tDBOutput_4 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tDBOutput_4 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tDBOutput_4;
	if (doesNodeBelongToRequest_tDBOutput_4) {
        org.talend.daikon.properties.ValidationResult vr_tDBOutput_4 = sourceOrSink_tDBOutput_4.validate(container_tDBOutput_4);
        if (vr_tDBOutput_4.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
            throw new RuntimeException(vr_tDBOutput_4.getMessage());
        }
	}
}

    org.talend.codegen.enforcer.IncomingSchemaEnforcer incomingEnforcer_tDBOutput_4 = null;
    if (sourceOrSink_tDBOutput_4 instanceof org.talend.components.api.component.runtime.Sink) {
    	org.talend.components.api.component.runtime.Sink sink_tDBOutput_4 =
            	(org.talend.components.api.component.runtime.Sink)sourceOrSink_tDBOutput_4;
        org.talend.components.api.component.runtime.WriteOperation writeOperation_tDBOutput_4 = sink_tDBOutput_4.createWriteOperation();
        if (doesNodeBelongToRequest_tDBOutput_4) {
            writeOperation_tDBOutput_4.initialize(container_tDBOutput_4);
        }
        writer_tDBOutput_4 = writeOperation_tDBOutput_4.createWriter(container_tDBOutput_4);
        if (doesNodeBelongToRequest_tDBOutput_4) {
            writer_tDBOutput_4.open("tDBOutput_4");
        }

        resourceMap.put("writer_tDBOutput_4", writer_tDBOutput_4);
    } // end of "sourceOrSink_tDBOutput_4 instanceof ...Sink"
    org.talend.components.api.component.Connector c_tDBOutput_4 = null;
    for (org.talend.components.api.component.Connector currentConnector : props_tDBOutput_4.getAvailableConnectors(null, false)) {
        if (currentConnector.getName().equals("MAIN")) {
            c_tDBOutput_4 = currentConnector;
            break;
        }
    }
    org.apache.avro.Schema designSchema_tDBOutput_4 = props_tDBOutput_4.getSchema(c_tDBOutput_4, false);
    incomingEnforcer_tDBOutput_4 = new org.talend.codegen.enforcer.IncomingSchemaEnforcer(designSchema_tDBOutput_4);

                java.lang.Iterable<?> outgoingMainRecordsList_tDBOutput_4 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBOutput_4 = null;


 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row16");
			
		int tos_count_tMap_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_4 = new StringBuilder();
                    log4jParamters_tMap_4.append("Parameters:");
                            log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                        log4jParamters_tMap_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + (log4jParamters_tMap_4) );
                    } 
                } 
            new BytesLimit65535_tMap_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_4", "tMap_3", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row16_tMap_4 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
	java.util.Date var1;
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_INVBAL2_tMap_4 = 0;
				
INVBAL2Struct INVBAL2_tmp = new INVBAL2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
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
                            log4jParamters_tFileInputDelimited_3.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVBAL2.zip\"");
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
                            log4jParamters_tFileInputDelimited_3.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOCNBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SOFTCM")+"}]");
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
				talendJobLog.addCM("tFileInputDelimited_3", "tFileInputDelimited_3", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_3 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_3 = null;
				int limit_tFileInputDelimited_3 = -1;
				try{
					
						Object filename_tFileInputDelimited_3 = "/data/talend/data_repository/INVBAL2.zip";	
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
						
			    						row16 = null;			
												
									boolean whetherReject_tFileInputDelimited_3 = false;
									row16 = new row16Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_3 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_3 = 0;
					
						temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						if(temp.length() > 0) {
							
								try {
								
    								row16.INUMBR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
									rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"INUMBR", "row16", temp, ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
								}
    							
						} else {						
							
								
									row16.INUMBR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_3 = 1;
					
						temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						if(temp.length() > 0) {
							
								try {
								
    								row16.LOCNBR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
									rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"LOCNBR", "row16", temp, ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
								}
    							
						} else {						
							
								
									row16.LOCNBR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_3 = 2;
					
						temp = fid_tFileInputDelimited_3.get(columnIndexWithD_tFileInputDelimited_3);
						if(temp.length() > 0) {
							
								try {
								
    								row16.SOFTCM = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
									rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"SOFTCM", "row16", temp, ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
								}
    							
						} else {						
							
								
									row16.SOFTCM = null;
								
							
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
// Start of branch "row16"
if(row16 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row16","tFileInputDelimited_3","tFileInputDelimited_3","tFileInputDelimited","tMap_4","tMap_3","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row16 - " + (row16==null? "": row16.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		
		// ###############################
		// # Input tables (lookups)
		
		boolean rejectedInnerJoin_tMap_4 = false;
		boolean mainRowRejected_tMap_4 = false;
		// ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;
Var.var1 = TalendDate.parseDate("yyyy-MM-dd",TalendDate.getDate("CCYY-MM-DD")) ;// ###############################
        // ###############################
        // # Output tables

INVBAL2 = null;


// # Output table : 'INVBAL2'
count_INVBAL2_tMap_4++;

INVBAL2_tmp.INUMBR = row16.INUMBR;
INVBAL2_tmp.LOCNBR = row16.LOCNBR;
INVBAL2_tmp.SOFTCM = row16.SOFTCM;
INVBAL2_tmp.DATELOADED = Var.var1 ;
INVBAL2 = INVBAL2_tmp;
log.debug("tMap_4 - Outputting the record " + count_INVBAL2_tMap_4 + " of the output table 'INVBAL2'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "INVBAL2"
if(INVBAL2 != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"INVBAL2","tMap_4","tMap_3","tMap","tDBOutput_4","tDBOutput_2","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("INVBAL2 - " + (INVBAL2==null? "": INVBAL2.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_4 != null) {
            incomingEnforcer_tDBOutput_4.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4.getRuntimeSchema().getField("INUMBR") != null){
                    incomingEnforcer_tDBOutput_4.put("INUMBR", INVBAL2.INUMBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4.getRuntimeSchema().getField("LOCNBR") != null){
                    incomingEnforcer_tDBOutput_4.put("LOCNBR", INVBAL2.LOCNBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4.getRuntimeSchema().getField("SOFTCM") != null){
                    incomingEnforcer_tDBOutput_4.put("SOFTCM", INVBAL2.SOFTCM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_4 != null && incomingEnforcer_tDBOutput_4.getRuntimeSchema().getField("DATELOADED") != null){
                    incomingEnforcer_tDBOutput_4.put("DATELOADED", INVBAL2.DATELOADED);
                }
        
        org.apache.avro.generic.IndexedRecord data_tDBOutput_4 = null;
        if (incomingEnforcer_tDBOutput_4 != null) {
            data_tDBOutput_4 = incomingEnforcer_tDBOutput_4.getCurrentRecord();
        }
        
        if (writer_tDBOutput_4 != null && data_tDBOutput_4 != null) {
        	writer_tDBOutput_4.write(data_tDBOutput_4);
        }
        
        nb_line_tDBOutput_4++;

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	


 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	


 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "INVBAL2"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "row16"




	
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
            if(!((Object)("/data/talend/data_repository/INVBAL2.zip") instanceof java.io.InputStream)){
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
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	


// ###############################
// # Lookup hashes releasing
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'INVBAL2': " + count_INVBAL2_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row16",2,0,
			 			"tFileInputDelimited_3","tFileInputDelimited_3","tFileInputDelimited","tMap_4","tMap_3","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Done.") );

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
// end of generic


resourceMap.put("finish_tDBOutput_4", Boolean.TRUE);

    java.util.Map<String, Object> resultMap_tDBOutput_4 = null;
    if (writer_tDBOutput_4 != null) {
        org.talend.components.api.component.runtime.Result resultObject_tDBOutput_4 = (org.talend.components.api.component.runtime.Result)writer_tDBOutput_4.close();
        resultMap_tDBOutput_4 = writer_tDBOutput_4.getWriteOperation().finalize(java.util.Arrays.<org.talend.components.api.component.runtime.Result>asList(resultObject_tDBOutput_4), container_tDBOutput_4);
    }
if(resultMap_tDBOutput_4!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBOutput_4 : resultMap_tDBOutput_4.entrySet()) {
		switch(entry_tDBOutput_4.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBOutput_4.setComponentData("tDBOutput_4", "ERROR_MESSAGE", entry_tDBOutput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_LINE", entry_tDBOutput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_SUCCESS", entry_tDBOutput_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBOutput_4.setComponentData("tDBOutput_4", "NB_REJECT", entry_tDBOutput_4.getValue());
			break;
		default :
            StringBuilder studio_key_tDBOutput_4 = new StringBuilder();
            for (int i_tDBOutput_4 = 0; i_tDBOutput_4 < entry_tDBOutput_4.getKey().length(); i_tDBOutput_4++) {
                char ch_tDBOutput_4 = entry_tDBOutput_4.getKey().charAt(i_tDBOutput_4);
                if(Character.isUpperCase(ch_tDBOutput_4) && i_tDBOutput_4> 0) {
                	studio_key_tDBOutput_4.append('_');
                }
                studio_key_tDBOutput_4.append(ch_tDBOutput_4);
            }
			container_tDBOutput_4.setComponentData("tDBOutput_4", studio_key_tDBOutput_4.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBOutput_4.getValue());
			break;
		}
	}
}

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"INVBAL2",2,0,
			 			"tMap_4","tMap_3","tMap","tDBOutput_4","tDBOutput_2","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tFileDelete_4Process(globalMap);



/**
 * [tDBOutput_4 end ] stop
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
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";
	
	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";
	
	
// finally of generic


if(resourceMap.get("finish_tDBOutput_4")==null){
    if(resourceMap.get("writer_tDBOutput_4")!=null){
		try {
			((org.talend.components.api.component.runtime.Writer)resourceMap.get("writer_tDBOutput_4")).close();
		} catch (java.io.IOException e_tDBOutput_4) {
			String errorMessage_tDBOutput_4 = "failed to release the resource in tDBOutput_4 :" + e_tDBOutput_4.getMessage();
			System.err.println(errorMessage_tDBOutput_4);
		}
	}
}
 



/**
 * [tDBOutput_4 finally ] stop
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
	

public void tFileDelete_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileDelete_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tFileDelete_4");
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
	 * [tFileDelete_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileDelete_4", false);
		start_Hash.put("tFileDelete_4", System.currentTimeMillis());
		
	
	currentComponent="tFileDelete_4";
	
	
		int tos_count_tFileDelete_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileDelete_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileDelete_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileDelete_4 = new StringBuilder();
                    log4jParamters_tFileDelete_4.append("Parameters:");
                            log4jParamters_tFileDelete_4.append("PATH" + " = " + "\"/data/talend/data_repository/INVBAL2.zip\"");
                        log4jParamters_tFileDelete_4.append(" | ");
                            log4jParamters_tFileDelete_4.append("FAILON" + " = " + "true");
                        log4jParamters_tFileDelete_4.append(" | ");
                            log4jParamters_tFileDelete_4.append("FOLDER_FILE" + " = " + "true");
                        log4jParamters_tFileDelete_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileDelete_4 - "  + (log4jParamters_tFileDelete_4) );
                    } 
                } 
            new BytesLimit65535_tFileDelete_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileDelete_4", "tFileDelete_4", "tFileDelete");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tFileDelete_4 begin ] stop
 */
	
	/**
	 * [tFileDelete_4 main ] start
	 */

	

	
	
	currentComponent="tFileDelete_4";
	
	

 

				final StringBuffer log4jSb_tFileDelete_4 = new StringBuffer();
			
class DeleteFoldertFileDelete_4{
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
	java.io.File path_tFileDelete_4=new java.io.File("/data/talend/data_repository/INVBAL2.zip");
	if(path_tFileDelete_4.exists()){
		if(path_tFileDelete_4.isFile()){
	    	if(path_tFileDelete_4.delete()){
	    		globalMap.put("tFileDelete_4_CURRENT_STATUS", "File deleted.");
				log.info("tFileDelete_4 - File : "+ path_tFileDelete_4.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_4_CURRENT_STATUS", "No file deleted.");
				throw new RuntimeException("The file " + path_tFileDelete_4.getAbsolutePath() + " can't be deleted.");
	    	}
		}else if(path_tFileDelete_4.isDirectory()){ 
	    	DeleteFoldertFileDelete_4 dftFileDelete_4 = new DeleteFoldertFileDelete_4();
	    	if(dftFileDelete_4.delete(path_tFileDelete_4)){
	    		globalMap.put("tFileDelete_4_CURRENT_STATUS", "Path deleted.");
				log.info("tFileDelete_4 - Directory : "+ path_tFileDelete_4.getAbsolutePath() + " is deleted.");
	    	}else{
	    		globalMap.put("tFileDelete_4_CURRENT_STATUS", "No path deleted.");
			throw new RuntimeException("The directory " + path_tFileDelete_4.getAbsolutePath() + " can not be deleted.");
	    	}
		}
	}else{
		globalMap.put("tFileDelete_4_CURRENT_STATUS", "File or path does not exist or is invalid.");
    		throw new RuntimeException("File or path does not exist or is invalid.");
    }
    globalMap.put("tFileDelete_4_DELETE_PATH","/data/talend/data_repository/INVBAL2.zip");
 


	tos_count_tFileDelete_4++;

/**
 * [tFileDelete_4 main ] stop
 */
	
	/**
	 * [tFileDelete_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileDelete_4";
	
	

 



/**
 * [tFileDelete_4 process_data_begin ] stop
 */
	
	/**
	 * [tFileDelete_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileDelete_4";
	
	

 



/**
 * [tFileDelete_4 process_data_end ] stop
 */
	
	/**
	 * [tFileDelete_4 end ] start
	 */

	

	
	
	currentComponent="tFileDelete_4";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tFileDelete_4 - "  + ("Done.") );

ok_Hash.put("tFileDelete_4", true);
end_Hash.put("tFileDelete_4", System.currentTimeMillis());




/**
 * [tFileDelete_4 end ] stop
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
	 * [tFileDelete_4 finally ] start
	 */

	

	
	
	currentComponent="tFileDelete_4";
	
	

 



/**
 * [tFileDelete_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileDelete_4_SUBPROCESS_STATE", 1);
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
        final TTAALLCL3 TTAALLCL3Class = new TTAALLCL3();

        int exitCode = TTAALLCL3Class.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'TTAALLCL3' - Done.");
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
			log.info("TalendJob: 'TTAALLCL3' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_9CERwAVyEeqgh6rCafRRhA");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-29T15:11:59.821509900Z");

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
            java.io.InputStream inContext = TTAALLCL3.class.getClassLoader().getResourceAsStream("at_talend_jobs/ttaallcl3_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = TTAALLCL3.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'TTAALLCL3' - Started.");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : TTAALLCL3");
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
        log.info("TalendJob: 'TTAALLCL3' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     640010 characters generated by Talend Cloud Data Management Platform 
 *     on the June 29, 2023 at 11:11:59 AM EDT
 ************************************************************************************************/