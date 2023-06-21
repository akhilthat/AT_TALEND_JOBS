
package at_talend_jobs.invaud_weekly_0_1;

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
 * Job: INVAUD_Weekly Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class INVAUD_Weekly implements TalendJob {
	static {System.setProperty("TalendJob.log", "INVAUD_Weekly.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(INVAUD_Weekly.class);
	

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
	private final String jobName = "INVAUD_Weekly";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_vc7L4P3kEeyXoJA9zC8K9Q", "0.1");
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
				INVAUD_Weekly.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(INVAUD_Weekly.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileDelete_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileDelete_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tDBConnection_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_2_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileDelete_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

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
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

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
				talendJobLog.addCM("tDBRow_2", "tDBRow_1", "tSnowflakeRow");
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
 		                    "\nDelete from PROD_DATA.INVENTORY.INVENTORY_TRANS_AUDIT_TRAIL_INVAUD_HISTORY\nwhere ITRDAT between CAST(TO_VARCHAR((CUR"
+"RENT_DATE() - 14)::DATE, 'YYMMDD') as number) and CAST(TO_VARCHAR((CURRENT_DATE() - 1)::DATE, 'YYMMDD') as number);\n");
 		                    
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
	


public static class row44Struct implements routines.system.IPersistableRow<row44Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];

	
			    public String ITFLAG;

				public String getITFLAG () {
					return this.ITFLAG;
				}

				public Boolean ITFLAGIsNullable(){
				    return false;
				}
				public Boolean ITFLAGIsKey(){
				    return false;
				}
				public Integer ITFLAGLength(){
				    return 1;
				}
				public Integer ITFLAGPrecision(){
				    return 0;
				}
				public String ITFLAGDefault(){
				
					return null;
				
				}
				public String ITFLAGComment(){
				
				    return "";
				
				}
				public String ITFLAGPattern(){
				
					return "";
				
				}
				public String ITFLAGOriginalDbColumnName(){
				
					return "ITFLAG";
				
				}

				
			    public String ITHCOD;

				public String getITHCOD () {
					return this.ITHCOD;
				}

				public Boolean ITHCODIsNullable(){
				    return false;
				}
				public Boolean ITHCODIsKey(){
				    return false;
				}
				public Integer ITHCODLength(){
				    return 3;
				}
				public Integer ITHCODPrecision(){
				    return 0;
				}
				public String ITHCODDefault(){
				
					return null;
				
				}
				public String ITHCODComment(){
				
				    return "";
				
				}
				public String ITHCODPattern(){
				
					return "";
				
				}
				public String ITHCODOriginalDbColumnName(){
				
					return "ITHCOD";
				
				}

				
			    public String ITRLTP;

				public String getITRLTP () {
					return this.ITRLTP;
				}

				public Boolean ITRLTPIsNullable(){
				    return false;
				}
				public Boolean ITRLTPIsKey(){
				    return false;
				}
				public Integer ITRLTPLength(){
				    return 1;
				}
				public Integer ITRLTPPrecision(){
				    return 0;
				}
				public String ITRLTPDefault(){
				
					return null;
				
				}
				public String ITRLTPComment(){
				
				    return "";
				
				}
				public String ITRLTPPattern(){
				
					return "";
				
				}
				public String ITRLTPOriginalDbColumnName(){
				
					return "ITRLTP";
				
				}

				
			    public BigDecimal ITRLOC;

				public BigDecimal getITRLOC () {
					return this.ITRLOC;
				}

				public Boolean ITRLOCIsNullable(){
				    return false;
				}
				public Boolean ITRLOCIsKey(){
				    return false;
				}
				public Integer ITRLOCLength(){
				    return 5;
				}
				public Integer ITRLOCPrecision(){
				    return 0;
				}
				public String ITRLOCDefault(){
				
					return "";
				
				}
				public String ITRLOCComment(){
				
				    return "";
				
				}
				public String ITRLOCPattern(){
				
					return "";
				
				}
				public String ITRLOCOriginalDbColumnName(){
				
					return "ITRLOC";
				
				}

				
			    public BigDecimal ITRCEN;

				public BigDecimal getITRCEN () {
					return this.ITRCEN;
				}

				public Boolean ITRCENIsNullable(){
				    return false;
				}
				public Boolean ITRCENIsKey(){
				    return false;
				}
				public Integer ITRCENLength(){
				    return 1;
				}
				public Integer ITRCENPrecision(){
				    return 0;
				}
				public String ITRCENDefault(){
				
					return "";
				
				}
				public String ITRCENComment(){
				
				    return "";
				
				}
				public String ITRCENPattern(){
				
					return "";
				
				}
				public String ITRCENOriginalDbColumnName(){
				
					return "ITRCEN";
				
				}

				
			    public BigDecimal ITRDAT;

				public BigDecimal getITRDAT () {
					return this.ITRDAT;
				}

				public Boolean ITRDATIsNullable(){
				    return false;
				}
				public Boolean ITRDATIsKey(){
				    return false;
				}
				public Integer ITRDATLength(){
				    return 6;
				}
				public Integer ITRDATPrecision(){
				    return 0;
				}
				public String ITRDATDefault(){
				
					return "";
				
				}
				public String ITRDATComment(){
				
				    return "";
				
				}
				public String ITRDATPattern(){
				
					return "";
				
				}
				public String ITRDATOriginalDbColumnName(){
				
					return "ITRDAT";
				
				}

				
			    public BigDecimal ITRTYP;

				public BigDecimal getITRTYP () {
					return this.ITRTYP;
				}

				public Boolean ITRTYPIsNullable(){
				    return false;
				}
				public Boolean ITRTYPIsKey(){
				    return false;
				}
				public Integer ITRTYPLength(){
				    return 3;
				}
				public Integer ITRTYPPrecision(){
				    return 0;
				}
				public String ITRTYPDefault(){
				
					return "";
				
				}
				public String ITRTYPComment(){
				
				    return "";
				
				}
				public String ITRTYPPattern(){
				
					return "";
				
				}
				public String ITRTYPOriginalDbColumnName(){
				
					return "ITRTYP";
				
				}

				
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

				
			    public BigDecimal ITRQTY;

				public BigDecimal getITRQTY () {
					return this.ITRQTY;
				}

				public Boolean ITRQTYIsNullable(){
				    return false;
				}
				public Boolean ITRQTYIsKey(){
				    return false;
				}
				public Integer ITRQTYLength(){
				    return 10;
				}
				public Integer ITRQTYPrecision(){
				    return 3;
				}
				public String ITRQTYDefault(){
				
					return "";
				
				}
				public String ITRQTYComment(){
				
				    return "";
				
				}
				public String ITRQTYPattern(){
				
					return "";
				
				}
				public String ITRQTYOriginalDbColumnName(){
				
					return "ITRQTY";
				
				}

				
			    public BigDecimal ITRRET;

				public BigDecimal getITRRET () {
					return this.ITRRET;
				}

				public Boolean ITRRETIsNullable(){
				    return false;
				}
				public Boolean ITRRETIsKey(){
				    return false;
				}
				public Integer ITRRETLength(){
				    return 9;
				}
				public Integer ITRRETPrecision(){
				    return 2;
				}
				public String ITRRETDefault(){
				
					return "";
				
				}
				public String ITRRETComment(){
				
				    return "";
				
				}
				public String ITRRETPattern(){
				
					return "";
				
				}
				public String ITRRETOriginalDbColumnName(){
				
					return "ITRRET";
				
				}

				
			    public BigDecimal ITRCST;

				public BigDecimal getITRCST () {
					return this.ITRCST;
				}

				public Boolean ITRCSTIsNullable(){
				    return false;
				}
				public Boolean ITRCSTIsKey(){
				    return false;
				}
				public Integer ITRCSTLength(){
				    return 11;
				}
				public Integer ITRCSTPrecision(){
				    return 4;
				}
				public String ITRCSTDefault(){
				
					return "";
				
				}
				public String ITRCSTComment(){
				
				    return "";
				
				}
				public String ITRCSTPattern(){
				
					return "";
				
				}
				public String ITRCSTOriginalDbColumnName(){
				
					return "ITRCST";
				
				}

				
			    public String ITREXT;

				public String getITREXT () {
					return this.ITREXT;
				}

				public Boolean ITREXTIsNullable(){
				    return false;
				}
				public Boolean ITREXTIsKey(){
				    return false;
				}
				public Integer ITREXTLength(){
				    return 1;
				}
				public Integer ITREXTPrecision(){
				    return 0;
				}
				public String ITREXTDefault(){
				
					return "";
				
				}
				public String ITREXTComment(){
				
				    return "";
				
				}
				public String ITREXTPattern(){
				
					return "";
				
				}
				public String ITREXTOriginalDbColumnName(){
				
					return "ITREXT";
				
				}

				
			    public BigDecimal ITRVAT;

				public BigDecimal getITRVAT () {
					return this.ITRVAT;
				}

				public Boolean ITRVATIsNullable(){
				    return false;
				}
				public Boolean ITRVATIsKey(){
				    return false;
				}
				public Integer ITRVATLength(){
				    return 9;
				}
				public Integer ITRVATPrecision(){
				    return 2;
				}
				public String ITRVATDefault(){
				
					return "";
				
				}
				public String ITRVATComment(){
				
				    return "";
				
				}
				public String ITRVATPattern(){
				
					return "";
				
				}
				public String ITRVATOriginalDbColumnName(){
				
					return "ITRVAT";
				
				}

				
			    public BigDecimal ITCVAT;

				public BigDecimal getITCVAT () {
					return this.ITCVAT;
				}

				public Boolean ITCVATIsNullable(){
				    return false;
				}
				public Boolean ITCVATIsKey(){
				    return false;
				}
				public Integer ITCVATLength(){
				    return 9;
				}
				public Integer ITCVATPrecision(){
				    return 2;
				}
				public String ITCVATDefault(){
				
					return "";
				
				}
				public String ITCVATComment(){
				
				    return "";
				
				}
				public String ITCVATPattern(){
				
					return "";
				
				}
				public String ITCVATOriginalDbColumnName(){
				
					return "ITCVAT";
				
				}

				
			    public String ITVCLC;

				public String getITVCLC () {
					return this.ITVCLC;
				}

				public Boolean ITVCLCIsNullable(){
				    return false;
				}
				public Boolean ITVCLCIsKey(){
				    return false;
				}
				public Integer ITVCLCLength(){
				    return 1;
				}
				public Integer ITVCLCPrecision(){
				    return 0;
				}
				public String ITVCLCDefault(){
				
					return "";
				
				}
				public String ITVCLCComment(){
				
				    return "";
				
				}
				public String ITVCLCPattern(){
				
					return "";
				
				}
				public String ITVCLCOriginalDbColumnName(){
				
					return "ITVCLC";
				
				}

				
			    public String ITRCUS;

				public String getITRCUS () {
					return this.ITRCUS;
				}

				public Boolean ITRCUSIsNullable(){
				    return false;
				}
				public Boolean ITRCUSIsKey(){
				    return false;
				}
				public Integer ITRCUSLength(){
				    return 10;
				}
				public Integer ITRCUSPrecision(){
				    return 0;
				}
				public String ITRCUSDefault(){
				
					return "";
				
				}
				public String ITRCUSComment(){
				
				    return "";
				
				}
				public String ITRCUSPattern(){
				
					return "";
				
				}
				public String ITRCUSOriginalDbColumnName(){
				
					return "ITRCUS";
				
				}

				
			    public String ITTPTP;

				public String getITTPTP () {
					return this.ITTPTP;
				}

				public Boolean ITTPTPIsNullable(){
				    return false;
				}
				public Boolean ITTPTPIsKey(){
				    return false;
				}
				public Integer ITTPTPLength(){
				    return 3;
				}
				public Integer ITTPTPPrecision(){
				    return 0;
				}
				public String ITTPTPDefault(){
				
					return "";
				
				}
				public String ITTPTPComment(){
				
				    return "";
				
				}
				public String ITTPTPPattern(){
				
					return "";
				
				}
				public String ITTPTPOriginalDbColumnName(){
				
					return "ITTPTP";
				
				}

				
			    public BigDecimal ITRREG;

				public BigDecimal getITRREG () {
					return this.ITRREG;
				}

				public Boolean ITRREGIsNullable(){
				    return false;
				}
				public Boolean ITRREGIsKey(){
				    return false;
				}
				public Integer ITRREGLength(){
				    return 9;
				}
				public Integer ITRREGPrecision(){
				    return 2;
				}
				public String ITRREGDefault(){
				
					return "";
				
				}
				public String ITRREGComment(){
				
				    return "";
				
				}
				public String ITRREGPattern(){
				
					return "";
				
				}
				public String ITRREGOriginalDbColumnName(){
				
					return "ITRREG";
				
				}

				
			    public BigDecimal ITRPOS;

				public BigDecimal getITRPOS () {
					return this.ITRPOS;
				}

				public Boolean ITRPOSIsNullable(){
				    return false;
				}
				public Boolean ITRPOSIsKey(){
				    return false;
				}
				public Integer ITRPOSLength(){
				    return 9;
				}
				public Integer ITRPOSPrecision(){
				    return 2;
				}
				public String ITRPOSDefault(){
				
					return "";
				
				}
				public String ITRPOSComment(){
				
				    return "";
				
				}
				public String ITRPOSPattern(){
				
					return "";
				
				}
				public String ITRPOSOriginalDbColumnName(){
				
					return "ITRPOS";
				
				}

				
			    public BigDecimal ITREVT;

				public BigDecimal getITREVT () {
					return this.ITREVT;
				}

				public Boolean ITREVTIsNullable(){
				    return false;
				}
				public Boolean ITREVTIsKey(){
				    return false;
				}
				public Integer ITREVTLength(){
				    return 6;
				}
				public Integer ITREVTPrecision(){
				    return 0;
				}
				public String ITREVTDefault(){
				
					return "";
				
				}
				public String ITREVTComment(){
				
				    return "";
				
				}
				public String ITREVTPattern(){
				
					return "";
				
				}
				public String ITREVTOriginalDbColumnName(){
				
					return "ITREVT";
				
				}

				
			    public BigDecimal ITRPRE;

				public BigDecimal getITRPRE () {
					return this.ITRPRE;
				}

				public Boolean ITRPREIsNullable(){
				    return false;
				}
				public Boolean ITRPREIsKey(){
				    return false;
				}
				public Integer ITRPRELength(){
				    return 2;
				}
				public Integer ITRPREPrecision(){
				    return 0;
				}
				public String ITRPREDefault(){
				
					return "";
				
				}
				public String ITRPREComment(){
				
				    return "";
				
				}
				public String ITRPREPattern(){
				
					return "";
				
				}
				public String ITRPREOriginalDbColumnName(){
				
					return "ITRPRE";
				
				}

				
			    public String ITRACF;

				public String getITRACF () {
					return this.ITRACF;
				}

				public Boolean ITRACFIsNullable(){
				    return false;
				}
				public Boolean ITRACFIsKey(){
				    return false;
				}
				public Integer ITRACFLength(){
				    return 1;
				}
				public Integer ITRACFPrecision(){
				    return 0;
				}
				public String ITRACFDefault(){
				
					return "";
				
				}
				public String ITRACFComment(){
				
				    return "";
				
				}
				public String ITRACFPattern(){
				
					return "";
				
				}
				public String ITRACFOriginalDbColumnName(){
				
					return "ITRACF";
				
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

				
			    public BigDecimal ITRPOV;

				public BigDecimal getITRPOV () {
					return this.ITRPOV;
				}

				public Boolean ITRPOVIsNullable(){
				    return false;
				}
				public Boolean ITRPOVIsKey(){
				    return false;
				}
				public Integer ITRPOVLength(){
				    return 6;
				}
				public Integer ITRPOVPrecision(){
				    return 0;
				}
				public String ITRPOVDefault(){
				
					return "";
				
				}
				public String ITRPOVComment(){
				
				    return "";
				
				}
				public String ITRPOVPattern(){
				
					return "";
				
				}
				public String ITRPOVOriginalDbColumnName(){
				
					return "ITRPOV";
				
				}

				
			    public float ITRVND;

				public float getITRVND () {
					return this.ITRVND;
				}

				public Boolean ITRVNDIsNullable(){
				    return false;
				}
				public Boolean ITRVNDIsKey(){
				    return false;
				}
				public Integer ITRVNDLength(){
				    return 6;
				}
				public Integer ITRVNDPrecision(){
				    return 0;
				}
				public String ITRVNDDefault(){
				
					return "";
				
				}
				public String ITRVNDComment(){
				
				    return "";
				
				}
				public String ITRVNDPattern(){
				
					return "";
				
				}
				public String ITRVNDOriginalDbColumnName(){
				
					return "ITRVND";
				
				}

				
			    public String ITRSTY;

				public String getITRSTY () {
					return this.ITRSTY;
				}

				public Boolean ITRSTYIsNullable(){
				    return false;
				}
				public Boolean ITRSTYIsKey(){
				    return false;
				}
				public Integer ITRSTYLength(){
				    return 15;
				}
				public Integer ITRSTYPrecision(){
				    return 0;
				}
				public String ITRSTYDefault(){
				
					return "";
				
				}
				public String ITRSTYComment(){
				
				    return "";
				
				}
				public String ITRSTYPattern(){
				
					return "";
				
				}
				public String ITRSTYOriginalDbColumnName(){
				
					return "ITRSTY";
				
				}

				
			    public String ITRSEA;

				public String getITRSEA () {
					return this.ITRSEA;
				}

				public Boolean ITRSEAIsNullable(){
				    return false;
				}
				public Boolean ITRSEAIsKey(){
				    return false;
				}
				public Integer ITRSEALength(){
				    return 3;
				}
				public Integer ITRSEAPrecision(){
				    return 0;
				}
				public String ITRSEADefault(){
				
					return "";
				
				}
				public String ITRSEAComment(){
				
				    return "";
				
				}
				public String ITRSEAPattern(){
				
					return "";
				
				}
				public String ITRSEAOriginalDbColumnName(){
				
					return "ITRSEA";
				
				}

				
			    public BigDecimal ITRSET;

				public BigDecimal getITRSET () {
					return this.ITRSET;
				}

				public Boolean ITRSETIsNullable(){
				    return false;
				}
				public Boolean ITRSETIsKey(){
				    return false;
				}
				public Integer ITRSETLength(){
				    return 9;
				}
				public Integer ITRSETPrecision(){
				    return 0;
				}
				public String ITRSETDefault(){
				
					return "";
				
				}
				public String ITRSETComment(){
				
				    return "";
				
				}
				public String ITRSETPattern(){
				
					return "";
				
				}
				public String ITRSETOriginalDbColumnName(){
				
					return "ITRSET";
				
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

				
			    public String ITRPST;

				public String getITRPST () {
					return this.ITRPST;
				}

				public Boolean ITRPSTIsNullable(){
				    return false;
				}
				public Boolean ITRPSTIsKey(){
				    return false;
				}
				public Integer ITRPSTLength(){
				    return 1;
				}
				public Integer ITRPSTPrecision(){
				    return 0;
				}
				public String ITRPSTDefault(){
				
					return "";
				
				}
				public String ITRPSTComment(){
				
				    return "";
				
				}
				public String ITRPSTPattern(){
				
					return "";
				
				}
				public String ITRPSTOriginalDbColumnName(){
				
					return "ITRPST";
				
				}

				
			    public String ITRHOT;

				public String getITRHOT () {
					return this.ITRHOT;
				}

				public Boolean ITRHOTIsNullable(){
				    return false;
				}
				public Boolean ITRHOTIsKey(){
				    return false;
				}
				public Integer ITRHOTLength(){
				    return 1;
				}
				public Integer ITRHOTPrecision(){
				    return 0;
				}
				public String ITRHOTDefault(){
				
					return "";
				
				}
				public String ITRHOTComment(){
				
				    return "";
				
				}
				public String ITRHOTPattern(){
				
					return "";
				
				}
				public String ITRHOTOriginalDbColumnName(){
				
					return "ITRHOT";
				
				}

				
			    public BigDecimal ITTRET;

				public BigDecimal getITTRET () {
					return this.ITTRET;
				}

				public Boolean ITTRETIsNullable(){
				    return false;
				}
				public Boolean ITTRETIsKey(){
				    return false;
				}
				public Integer ITTRETLength(){
				    return 9;
				}
				public Integer ITTRETPrecision(){
				    return 2;
				}
				public String ITTRETDefault(){
				
					return "";
				
				}
				public String ITTRETComment(){
				
				    return "";
				
				}
				public String ITTRETPattern(){
				
					return "";
				
				}
				public String ITTRETOriginalDbColumnName(){
				
					return "ITTRET";
				
				}

				
			    public BigDecimal ITTCST;

				public BigDecimal getITTCST () {
					return this.ITTCST;
				}

				public Boolean ITTCSTIsNullable(){
				    return false;
				}
				public Boolean ITTCSTIsKey(){
				    return false;
				}
				public Integer ITTCSTLength(){
				    return 11;
				}
				public Integer ITTCSTPrecision(){
				    return 4;
				}
				public String ITTCSTDefault(){
				
					return "";
				
				}
				public String ITTCSTComment(){
				
				    return "";
				
				}
				public String ITTCSTPattern(){
				
					return "";
				
				}
				public String ITTCSTOriginalDbColumnName(){
				
					return "ITTCST";
				
				}

				
			    public BigDecimal ITTREG;

				public BigDecimal getITTREG () {
					return this.ITTREG;
				}

				public Boolean ITTREGIsNullable(){
				    return false;
				}
				public Boolean ITTREGIsKey(){
				    return false;
				}
				public Integer ITTREGLength(){
				    return 9;
				}
				public Integer ITTREGPrecision(){
				    return 2;
				}
				public String ITTREGDefault(){
				
					return "";
				
				}
				public String ITTREGComment(){
				
				    return "";
				
				}
				public String ITTREGPattern(){
				
					return "";
				
				}
				public String ITTREGOriginalDbColumnName(){
				
					return "ITTREG";
				
				}

				
			    public BigDecimal ITTPOS;

				public BigDecimal getITTPOS () {
					return this.ITTPOS;
				}

				public Boolean ITTPOSIsNullable(){
				    return false;
				}
				public Boolean ITTPOSIsKey(){
				    return false;
				}
				public Integer ITTPOSLength(){
				    return 9;
				}
				public Integer ITTPOSPrecision(){
				    return 2;
				}
				public String ITTPOSDefault(){
				
					return "";
				
				}
				public String ITTPOSComment(){
				
				    return "";
				
				}
				public String ITTPOSPattern(){
				
					return "";
				
				}
				public String ITTPOSOriginalDbColumnName(){
				
					return "ITTPOS";
				
				}

				
			    public String ITTCOD;

				public String getITTCOD () {
					return this.ITTCOD;
				}

				public Boolean ITTCODIsNullable(){
				    return false;
				}
				public Boolean ITTCODIsKey(){
				    return false;
				}
				public Integer ITTCODLength(){
				    return 3;
				}
				public Integer ITTCODPrecision(){
				    return 0;
				}
				public String ITTCODDefault(){
				
					return "";
				
				}
				public String ITTCODComment(){
				
				    return "";
				
				}
				public String ITTCODPattern(){
				
					return "";
				
				}
				public String ITTCODOriginalDbColumnName(){
				
					return "ITTCOD";
				
				}

				
			    public BigDecimal ITTRAT;

				public BigDecimal getITTRAT () {
					return this.ITTRAT;
				}

				public Boolean ITTRATIsNullable(){
				    return false;
				}
				public Boolean ITTRATIsKey(){
				    return false;
				}
				public Integer ITTRATLength(){
				    return 15;
				}
				public Integer ITTRATPrecision(){
				    return 8;
				}
				public String ITTRATDefault(){
				
					return "";
				
				}
				public String ITTRATComment(){
				
				    return "";
				
				}
				public String ITTRATPattern(){
				
					return "";
				
				}
				public String ITTRATOriginalDbColumnName(){
				
					return "ITTRAT";
				
				}

				
			    public BigDecimal ITTVAT;

				public BigDecimal getITTVAT () {
					return this.ITTVAT;
				}

				public Boolean ITTVATIsNullable(){
				    return false;
				}
				public Boolean ITTVATIsKey(){
				    return false;
				}
				public Integer ITTVATLength(){
				    return 9;
				}
				public Integer ITTVATPrecision(){
				    return 2;
				}
				public String ITTVATDefault(){
				
					return "";
				
				}
				public String ITTVATComment(){
				
				    return "";
				
				}
				public String ITTVATPattern(){
				
					return "";
				
				}
				public String ITTVATOriginalDbColumnName(){
				
					return "ITTVAT";
				
				}

				
			    public BigDecimal ITTCVT;

				public BigDecimal getITTCVT () {
					return this.ITTCVT;
				}

				public Boolean ITTCVTIsNullable(){
				    return false;
				}
				public Boolean ITTCVTIsKey(){
				    return false;
				}
				public Integer ITTCVTLength(){
				    return 9;
				}
				public Integer ITTCVTPrecision(){
				    return 2;
				}
				public String ITTCVTDefault(){
				
					return "";
				
				}
				public String ITTCVTComment(){
				
				    return "";
				
				}
				public String ITTCVTPattern(){
				
					return "";
				
				}
				public String ITTCVTOriginalDbColumnName(){
				
					return "ITTCVT";
				
				}

				
			    public String ITTMD;

				public String getITTMD () {
					return this.ITTMD;
				}

				public Boolean ITTMDIsNullable(){
				    return false;
				}
				public Boolean ITTMDIsKey(){
				    return false;
				}
				public Integer ITTMDLength(){
				    return 1;
				}
				public Integer ITTMDPrecision(){
				    return 0;
				}
				public String ITTMDDefault(){
				
					return "";
				
				}
				public String ITTMDComment(){
				
				    return "";
				
				}
				public String ITTMDPattern(){
				
					return "";
				
				}
				public String ITTMDOriginalDbColumnName(){
				
					return "ITTMD";
				
				}

				
			    public BigDecimal ITTID;

				public BigDecimal getITTID () {
					return this.ITTID;
				}

				public Boolean ITTIDIsNullable(){
				    return false;
				}
				public Boolean ITTIDIsKey(){
				    return false;
				}
				public Integer ITTIDLength(){
				    return 11;
				}
				public Integer ITTIDPrecision(){
				    return 0;
				}
				public String ITTIDDefault(){
				
					return "";
				
				}
				public String ITTIDComment(){
				
				    return "";
				
				}
				public String ITTIDPattern(){
				
					return "";
				
				}
				public String ITTIDOriginalDbColumnName(){
				
					return "ITTID";
				
				}

				
			    public String ITTPRO;

				public String getITTPRO () {
					return this.ITTPRO;
				}

				public Boolean ITTPROIsNullable(){
				    return false;
				}
				public Boolean ITTPROIsKey(){
				    return false;
				}
				public Integer ITTPROLength(){
				    return 1;
				}
				public Integer ITTPROPrecision(){
				    return 0;
				}
				public String ITTPRODefault(){
				
					return "";
				
				}
				public String ITTPROComment(){
				
				    return "";
				
				}
				public String ITTPROPattern(){
				
					return "";
				
				}
				public String ITTPROOriginalDbColumnName(){
				
					return "ITTPRO";
				
				}

				
			    public BigDecimal ITRACN;

				public BigDecimal getITRACN () {
					return this.ITRACN;
				}

				public Boolean ITRACNIsNullable(){
				    return false;
				}
				public Boolean ITRACNIsKey(){
				    return false;
				}
				public Integer ITRACNLength(){
				    return 1;
				}
				public Integer ITRACNPrecision(){
				    return 0;
				}
				public String ITRACNDefault(){
				
					return "";
				
				}
				public String ITRACNComment(){
				
				    return "";
				
				}
				public String ITRACNPattern(){
				
					return "";
				
				}
				public String ITRACNOriginalDbColumnName(){
				
					return "ITRACN";
				
				}

				
			    public BigDecimal ITRADT;

				public BigDecimal getITRADT () {
					return this.ITRADT;
				}

				public Boolean ITRADTIsNullable(){
				    return false;
				}
				public Boolean ITRADTIsKey(){
				    return false;
				}
				public Integer ITRADTLength(){
				    return 6;
				}
				public Integer ITRADTPrecision(){
				    return 0;
				}
				public String ITRADTDefault(){
				
					return "";
				
				}
				public String ITRADTComment(){
				
				    return "";
				
				}
				public String ITRADTPattern(){
				
					return "";
				
				}
				public String ITRADTOriginalDbColumnName(){
				
					return "ITRADT";
				
				}

				
			    public String ITRREF;

				public String getITRREF () {
					return this.ITRREF;
				}

				public Boolean ITRREFIsNullable(){
				    return false;
				}
				public Boolean ITRREFIsKey(){
				    return false;
				}
				public Integer ITRREFLength(){
				    return 12;
				}
				public Integer ITRREFPrecision(){
				    return 0;
				}
				public String ITRREFDefault(){
				
					return "";
				
				}
				public String ITRREFComment(){
				
				    return "";
				
				}
				public String ITRREFPattern(){
				
					return "";
				
				}
				public String ITRREFOriginalDbColumnName(){
				
					return "ITRREF";
				
				}

				
			    public String PGMNAM;

				public String getPGMNAM () {
					return this.PGMNAM;
				}

				public Boolean PGMNAMIsNullable(){
				    return false;
				}
				public Boolean PGMNAMIsKey(){
				    return false;
				}
				public Integer PGMNAMLength(){
				    return 10;
				}
				public Integer PGMNAMPrecision(){
				    return 0;
				}
				public String PGMNAMDefault(){
				
					return "";
				
				}
				public String PGMNAMComment(){
				
				    return "";
				
				}
				public String PGMNAMPattern(){
				
					return "";
				
				}
				public String PGMNAMOriginalDbColumnName(){
				
					return "PGMNAM";
				
				}

				
			    public String LGUSER;

				public String getLGUSER () {
					return this.LGUSER;
				}

				public Boolean LGUSERIsNullable(){
				    return false;
				}
				public Boolean LGUSERIsKey(){
				    return false;
				}
				public Integer LGUSERLength(){
				    return 10;
				}
				public Integer LGUSERPrecision(){
				    return 0;
				}
				public String LGUSERDefault(){
				
					return "";
				
				}
				public String LGUSERComment(){
				
				    return "";
				
				}
				public String LGUSERPattern(){
				
					return "";
				
				}
				public String LGUSEROriginalDbColumnName(){
				
					return "LGUSER";
				
				}

				
			    public BigDecimal CSCSH;

				public BigDecimal getCSCSH () {
					return this.CSCSH;
				}

				public Boolean CSCSHIsNullable(){
				    return false;
				}
				public Boolean CSCSHIsKey(){
				    return false;
				}
				public Integer CSCSHLength(){
				    return 5;
				}
				public Integer CSCSHPrecision(){
				    return 0;
				}
				public String CSCSHDefault(){
				
					return "";
				
				}
				public String CSCSHComment(){
				
				    return "";
				
				}
				public String CSCSHPattern(){
				
					return "";
				
				}
				public String CSCSHOriginalDbColumnName(){
				
					return "CSCSH";
				
				}

				
			    public String CSRSTP;

				public String getCSRSTP () {
					return this.CSRSTP;
				}

				public Boolean CSRSTPIsNullable(){
				    return false;
				}
				public Boolean CSRSTPIsKey(){
				    return false;
				}
				public Integer CSRSTPLength(){
				    return 4;
				}
				public Integer CSRSTPPrecision(){
				    return 0;
				}
				public String CSRSTPDefault(){
				
					return "";
				
				}
				public String CSRSTPComment(){
				
				    return "";
				
				}
				public String CSRSTPPattern(){
				
					return "";
				
				}
				public String CSRSTPOriginalDbColumnName(){
				
					return "CSRSTP";
				
				}

				
			    public String CSDRSN;

				public String getCSDRSN () {
					return this.CSDRSN;
				}

				public Boolean CSDRSNIsNullable(){
				    return false;
				}
				public Boolean CSDRSNIsKey(){
				    return false;
				}
				public Integer CSDRSNLength(){
				    return 4;
				}
				public Integer CSDRSNPrecision(){
				    return 0;
				}
				public String CSDRSNDefault(){
				
					return "";
				
				}
				public String CSDRSNComment(){
				
				    return "";
				
				}
				public String CSDRSNPattern(){
				
					return "";
				
				}
				public String CSDRSNOriginalDbColumnName(){
				
					return "CSDRSN";
				
				}

				
			    public String ITGLBN;

				public String getITGLBN () {
					return this.ITGLBN;
				}

				public Boolean ITGLBNIsNullable(){
				    return false;
				}
				public Boolean ITGLBNIsKey(){
				    return false;
				}
				public Integer ITGLBNLength(){
				    return 8;
				}
				public Integer ITGLBNPrecision(){
				    return 0;
				}
				public String ITGLBNDefault(){
				
					return "";
				
				}
				public String ITGLBNComment(){
				
				    return "";
				
				}
				public String ITGLBNPattern(){
				
					return "";
				
				}
				public String ITGLBNOriginalDbColumnName(){
				
					return "ITGLBN";
				
				}

				
			    public BigDecimal ITPCEN;

				public BigDecimal getITPCEN () {
					return this.ITPCEN;
				}

				public Boolean ITPCENIsNullable(){
				    return false;
				}
				public Boolean ITPCENIsKey(){
				    return false;
				}
				public Integer ITPCENLength(){
				    return 1;
				}
				public Integer ITPCENPrecision(){
				    return 0;
				}
				public String ITPCENDefault(){
				
					return "";
				
				}
				public String ITPCENComment(){
				
				    return "";
				
				}
				public String ITPCENPattern(){
				
					return "";
				
				}
				public String ITPCENOriginalDbColumnName(){
				
					return "ITPCEN";
				
				}

				
			    public BigDecimal ITPDTE;

				public BigDecimal getITPDTE () {
					return this.ITPDTE;
				}

				public Boolean ITPDTEIsNullable(){
				    return false;
				}
				public Boolean ITPDTEIsKey(){
				    return false;
				}
				public Integer ITPDTELength(){
				    return 6;
				}
				public Integer ITPDTEPrecision(){
				    return 0;
				}
				public String ITPDTEDefault(){
				
					return "";
				
				}
				public String ITPDTEComment(){
				
				    return "";
				
				}
				public String ITPDTEPattern(){
				
					return "";
				
				}
				public String ITPDTEOriginalDbColumnName(){
				
					return "ITPDTE";
				
				}

				
			    public BigDecimal ITRSCN;

				public BigDecimal getITRSCN () {
					return this.ITRSCN;
				}

				public Boolean ITRSCNIsNullable(){
				    return false;
				}
				public Boolean ITRSCNIsKey(){
				    return false;
				}
				public Integer ITRSCNLength(){
				    return 1;
				}
				public Integer ITRSCNPrecision(){
				    return 0;
				}
				public String ITRSCNDefault(){
				
					return "";
				
				}
				public String ITRSCNComment(){
				
				    return "";
				
				}
				public String ITRSCNPattern(){
				
					return "";
				
				}
				public String ITRSCNOriginalDbColumnName(){
				
					return "ITRSCN";
				
				}

				
			    public BigDecimal ITRSDT;

				public BigDecimal getITRSDT () {
					return this.ITRSDT;
				}

				public Boolean ITRSDTIsNullable(){
				    return false;
				}
				public Boolean ITRSDTIsKey(){
				    return false;
				}
				public Integer ITRSDTLength(){
				    return 6;
				}
				public Integer ITRSDTPrecision(){
				    return 0;
				}
				public String ITRSDTDefault(){
				
					return "";
				
				}
				public String ITRSDTComment(){
				
				    return "";
				
				}
				public String ITRSDTPattern(){
				
					return "";
				
				}
				public String ITRSDTOriginalDbColumnName(){
				
					return "ITRSDT";
				
				}

				
			    public BigDecimal ITRSTM;

				public BigDecimal getITRSTM () {
					return this.ITRSTM;
				}

				public Boolean ITRSTMIsNullable(){
				    return false;
				}
				public Boolean ITRSTMIsKey(){
				    return false;
				}
				public Integer ITRSTMLength(){
				    return 6;
				}
				public Integer ITRSTMPrecision(){
				    return 0;
				}
				public String ITRSTMDefault(){
				
					return "";
				
				}
				public String ITRSTMComment(){
				
				    return "";
				
				}
				public String ITRSTMPattern(){
				
					return "";
				
				}
				public String ITRSTMOriginalDbColumnName(){
				
					return "ITRSTM";
				
				}

				
			    public BigDecimal ITRLOH;

				public BigDecimal getITRLOH () {
					return this.ITRLOH;
				}

				public Boolean ITRLOHIsNullable(){
				    return false;
				}
				public Boolean ITRLOHIsKey(){
				    return false;
				}
				public Integer ITRLOHLength(){
				    return 7;
				}
				public Integer ITRLOHPrecision(){
				    return 0;
				}
				public String ITRLOHDefault(){
				
					return "";
				
				}
				public String ITRLOHComment(){
				
				    return "";
				
				}
				public String ITRLOHPattern(){
				
					return "";
				
				}
				public String ITRLOHOriginalDbColumnName(){
				
					return "ITRLOH";
				
				}

				
			    public BigDecimal ITRLAC;

				public BigDecimal getITRLAC () {
					return this.ITRLAC;
				}

				public Boolean ITRLACIsNullable(){
				    return false;
				}
				public Boolean ITRLACIsKey(){
				    return false;
				}
				public Integer ITRLACLength(){
				    return 15;
				}
				public Integer ITRLACPrecision(){
				    return 4;
				}
				public String ITRLACDefault(){
				
					return "";
				
				}
				public String ITRLACComment(){
				
				    return "";
				
				}
				public String ITRLACPattern(){
				
					return "";
				
				}
				public String ITRLACOriginalDbColumnName(){
				
					return "ITRLAC";
				
				}

				
			    public BigDecimal ITRLLC;

				public BigDecimal getITRLLC () {
					return this.ITRLLC;
				}

				public Boolean ITRLLCIsNullable(){
				    return false;
				}
				public Boolean ITRLLCIsKey(){
				    return false;
				}
				public Integer ITRLLCLength(){
				    return 15;
				}
				public Integer ITRLLCPrecision(){
				    return 4;
				}
				public String ITRLLCDefault(){
				
					return "";
				
				}
				public String ITRLLCComment(){
				
				    return "";
				
				}
				public String ITRLLCPattern(){
				
					return "";
				
				}
				public String ITRLLCOriginalDbColumnName(){
				
					return "ITRLLC";
				
				}

				
			    public BigDecimal ITRCOH;

				public BigDecimal getITRCOH () {
					return this.ITRCOH;
				}

				public Boolean ITRCOHIsNullable(){
				    return false;
				}
				public Boolean ITRCOHIsKey(){
				    return false;
				}
				public Integer ITRCOHLength(){
				    return 7;
				}
				public Integer ITRCOHPrecision(){
				    return 0;
				}
				public String ITRCOHDefault(){
				
					return "";
				
				}
				public String ITRCOHComment(){
				
				    return "";
				
				}
				public String ITRCOHPattern(){
				
					return "";
				
				}
				public String ITRCOHOriginalDbColumnName(){
				
					return "ITRCOH";
				
				}

				
			    public BigDecimal ITRCAC;

				public BigDecimal getITRCAC () {
					return this.ITRCAC;
				}

				public Boolean ITRCACIsNullable(){
				    return false;
				}
				public Boolean ITRCACIsKey(){
				    return false;
				}
				public Integer ITRCACLength(){
				    return 15;
				}
				public Integer ITRCACPrecision(){
				    return 4;
				}
				public String ITRCACDefault(){
				
					return "";
				
				}
				public String ITRCACComment(){
				
				    return "";
				
				}
				public String ITRCACPattern(){
				
					return "";
				
				}
				public String ITRCACOriginalDbColumnName(){
				
					return "ITRCAC";
				
				}

				
			    public BigDecimal ITRCLC;

				public BigDecimal getITRCLC () {
					return this.ITRCLC;
				}

				public Boolean ITRCLCIsNullable(){
				    return false;
				}
				public Boolean ITRCLCIsKey(){
				    return false;
				}
				public Integer ITRCLCLength(){
				    return 15;
				}
				public Integer ITRCLCPrecision(){
				    return 4;
				}
				public String ITRCLCDefault(){
				
					return "";
				
				}
				public String ITRCLCComment(){
				
				    return "";
				
				}
				public String ITRCLCPattern(){
				
					return "";
				
				}
				public String ITRCLCOriginalDbColumnName(){
				
					return "ITRCLC";
				
				}

				
			    public String ITRDSC;

				public String getITRDSC () {
					return this.ITRDSC;
				}

				public Boolean ITRDSCIsNullable(){
				    return false;
				}
				public Boolean ITRDSCIsKey(){
				    return false;
				}
				public Integer ITRDSCLength(){
				    return 25;
				}
				public Integer ITRDSCPrecision(){
				    return 0;
				}
				public String ITRDSCDefault(){
				
					return "";
				
				}
				public String ITRDSCComment(){
				
				    return "";
				
				}
				public String ITRDSCPattern(){
				
					return "";
				
				}
				public String ITRDSCOriginalDbColumnName(){
				
					return "ITRDSC";
				
				}

				
			    public String ITCHAN;

				public String getITCHAN () {
					return this.ITCHAN;
				}

				public Boolean ITCHANIsNullable(){
				    return false;
				}
				public Boolean ITCHANIsKey(){
				    return false;
				}
				public Integer ITCHANLength(){
				    return 1;
				}
				public Integer ITCHANPrecision(){
				    return 0;
				}
				public String ITCHANDefault(){
				
					return "";
				
				}
				public String ITCHANComment(){
				
				    return "";
				
				}
				public String ITCHANPattern(){
				
					return "";
				
				}
				public String ITCHANOriginalDbColumnName(){
				
					return "ITCHAN";
				
				}

				
			    public String ITSLRC;

				public String getITSLRC () {
					return this.ITSLRC;
				}

				public Boolean ITSLRCIsNullable(){
				    return false;
				}
				public Boolean ITSLRCIsKey(){
				    return false;
				}
				public Integer ITSLRCLength(){
				    return 2;
				}
				public Integer ITSLRCPrecision(){
				    return 0;
				}
				public String ITSLRCDefault(){
				
					return "";
				
				}
				public String ITSLRCComment(){
				
				    return "";
				
				}
				public String ITSLRCPattern(){
				
					return "";
				
				}
				public String ITSLRCOriginalDbColumnName(){
				
					return "ITSLRC";
				
				}

				
			    public BigDecimal ITOHNO;

				public BigDecimal getITOHNO () {
					return this.ITOHNO;
				}

				public Boolean ITOHNOIsNullable(){
				    return false;
				}
				public Boolean ITOHNOIsKey(){
				    return false;
				}
				public Integer ITOHNOLength(){
				    return 8;
				}
				public Integer ITOHNOPrecision(){
				    return 0;
				}
				public String ITOHNODefault(){
				
					return "";
				
				}
				public String ITOHNOComment(){
				
				    return "";
				
				}
				public String ITOHNOPattern(){
				
					return "";
				
				}
				public String ITOHNOOriginalDbColumnName(){
				
					return "ITOHNO";
				
				}

				
			    public String ITTPCD;

				public String getITTPCD () {
					return this.ITTPCD;
				}

				public Boolean ITTPCDIsNullable(){
				    return false;
				}
				public Boolean ITTPCDIsKey(){
				    return false;
				}
				public Integer ITTPCDLength(){
				    return 2;
				}
				public Integer ITTPCDPrecision(){
				    return 0;
				}
				public String ITTPCDDefault(){
				
					return "";
				
				}
				public String ITTPCDComment(){
				
				    return "";
				
				}
				public String ITTPCDPattern(){
				
					return "";
				
				}
				public String ITTPCDOriginalDbColumnName(){
				
					return "ITTPCD";
				
				}

				
			    public String ITDPMT;

				public String getITDPMT () {
					return this.ITDPMT;
				}

				public Boolean ITDPMTIsNullable(){
				    return false;
				}
				public Boolean ITDPMTIsKey(){
				    return false;
				}
				public Integer ITDPMTLength(){
				    return 1;
				}
				public Integer ITDPMTPrecision(){
				    return 0;
				}
				public String ITDPMTDefault(){
				
					return "";
				
				}
				public String ITDPMTComment(){
				
				    return "";
				
				}
				public String ITDPMTPattern(){
				
					return "";
				
				}
				public String ITDPMTOriginalDbColumnName(){
				
					return "ITDPMT";
				
				}

				
			    public String ITCATN;

				public String getITCATN () {
					return this.ITCATN;
				}

				public Boolean ITCATNIsNullable(){
				    return false;
				}
				public Boolean ITCATNIsKey(){
				    return false;
				}
				public Integer ITCATNLength(){
				    return 10;
				}
				public Integer ITCATNPrecision(){
				    return 0;
				}
				public String ITCATNDefault(){
				
					return "";
				
				}
				public String ITCATNComment(){
				
				    return "";
				
				}
				public String ITCATNPattern(){
				
					return "";
				
				}
				public String ITCATNOriginalDbColumnName(){
				
					return "ITCATN";
				
				}

				
			    public String ITCATS;

				public String getITCATS () {
					return this.ITCATS;
				}

				public Boolean ITCATSIsNullable(){
				    return false;
				}
				public Boolean ITCATSIsKey(){
				    return false;
				}
				public Integer ITCATSLength(){
				    return 10;
				}
				public Integer ITCATSPrecision(){
				    return 0;
				}
				public String ITCATSDefault(){
				
					return "";
				
				}
				public String ITCATSComment(){
				
				    return "";
				
				}
				public String ITCATSPattern(){
				
					return "";
				
				}
				public String ITCATSOriginalDbColumnName(){
				
					return "ITCATS";
				
				}

				
			    public String ITSPDI;

				public String getITSPDI () {
					return this.ITSPDI;
				}

				public Boolean ITSPDIIsNullable(){
				    return false;
				}
				public Boolean ITSPDIIsKey(){
				    return false;
				}
				public Integer ITSPDILength(){
				    return 9;
				}
				public Integer ITSPDIPrecision(){
				    return 0;
				}
				public String ITSPDIDefault(){
				
					return "";
				
				}
				public String ITSPDIComment(){
				
				    return "";
				
				}
				public String ITSPDIPattern(){
				
					return "";
				
				}
				public String ITSPDIOriginalDbColumnName(){
				
					return "ITSPDI";
				
				}

				
			    public BigDecimal ITCATP;

				public BigDecimal getITCATP () {
					return this.ITCATP;
				}

				public Boolean ITCATPIsNullable(){
				    return false;
				}
				public Boolean ITCATPIsKey(){
				    return false;
				}
				public Integer ITCATPLength(){
				    return 4;
				}
				public Integer ITCATPPrecision(){
				    return 0;
				}
				public String ITCATPDefault(){
				
					return "";
				
				}
				public String ITCATPComment(){
				
				    return "";
				
				}
				public String ITCATPPattern(){
				
					return "";
				
				}
				public String ITCATPOriginalDbColumnName(){
				
					return "ITCATP";
				
				}

				
			    public String ITUSID;

				public String getITUSID () {
					return this.ITUSID;
				}

				public Boolean ITUSIDIsNullable(){
				    return false;
				}
				public Boolean ITUSIDIsKey(){
				    return false;
				}
				public Integer ITUSIDLength(){
				    return 10;
				}
				public Integer ITUSIDPrecision(){
				    return 0;
				}
				public String ITUSIDDefault(){
				
					return "";
				
				}
				public String ITUSIDComment(){
				
				    return "";
				
				}
				public String ITUSIDPattern(){
				
					return "";
				
				}
				public String ITUSIDOriginalDbColumnName(){
				
					return "ITUSID";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
						this.ITRLOC = (BigDecimal) dis.readObject();
					
						this.ITRCEN = (BigDecimal) dis.readObject();
					
						this.ITRDAT = (BigDecimal) dis.readObject();
					
						this.ITRTYP = (BigDecimal) dis.readObject();
					
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ITRQTY = (BigDecimal) dis.readObject();
					
						this.ITRRET = (BigDecimal) dis.readObject();
					
						this.ITRCST = (BigDecimal) dis.readObject();
					
					this.ITREXT = readString(dis);
					
						this.ITRVAT = (BigDecimal) dis.readObject();
					
						this.ITCVAT = (BigDecimal) dis.readObject();
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
						this.ITRREG = (BigDecimal) dis.readObject();
					
						this.ITRPOS = (BigDecimal) dis.readObject();
					
						this.ITREVT = (BigDecimal) dis.readObject();
					
						this.ITRPRE = (BigDecimal) dis.readObject();
					
					this.ITRACF = readString(dis);
					
			        this.IDEPT = dis.readFloat();
					
			        this.ISDEPT = dis.readFloat();
					
			        this.ICLAS = dis.readFloat();
					
			        this.ISCLAS = dis.readFloat();
					
						this.ITRPOV = (BigDecimal) dis.readObject();
					
			        this.ITRVND = dis.readFloat();
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
						this.ITRSET = (BigDecimal) dis.readObject();
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
						this.ITTRET = (BigDecimal) dis.readObject();
					
						this.ITTCST = (BigDecimal) dis.readObject();
					
						this.ITTREG = (BigDecimal) dis.readObject();
					
						this.ITTPOS = (BigDecimal) dis.readObject();
					
					this.ITTCOD = readString(dis);
					
						this.ITTRAT = (BigDecimal) dis.readObject();
					
						this.ITTVAT = (BigDecimal) dis.readObject();
					
						this.ITTCVT = (BigDecimal) dis.readObject();
					
					this.ITTMD = readString(dis);
					
						this.ITTID = (BigDecimal) dis.readObject();
					
					this.ITTPRO = readString(dis);
					
						this.ITRACN = (BigDecimal) dis.readObject();
					
						this.ITRADT = (BigDecimal) dis.readObject();
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
						this.CSCSH = (BigDecimal) dis.readObject();
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
						this.ITPCEN = (BigDecimal) dis.readObject();
					
						this.ITPDTE = (BigDecimal) dis.readObject();
					
						this.ITRSCN = (BigDecimal) dis.readObject();
					
						this.ITRSDT = (BigDecimal) dis.readObject();
					
						this.ITRSTM = (BigDecimal) dis.readObject();
					
						this.ITRLOH = (BigDecimal) dis.readObject();
					
						this.ITRLAC = (BigDecimal) dis.readObject();
					
						this.ITRLLC = (BigDecimal) dis.readObject();
					
						this.ITRCOH = (BigDecimal) dis.readObject();
					
						this.ITRCAC = (BigDecimal) dis.readObject();
					
						this.ITRCLC = (BigDecimal) dis.readObject();
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
						this.ITOHNO = (BigDecimal) dis.readObject();
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
						this.ITCATP = (BigDecimal) dis.readObject();
					
					this.ITUSID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
						this.ITRLOC = (BigDecimal) dis.readObject();
					
						this.ITRCEN = (BigDecimal) dis.readObject();
					
						this.ITRDAT = (BigDecimal) dis.readObject();
					
						this.ITRTYP = (BigDecimal) dis.readObject();
					
						this.INUMBR = (BigDecimal) dis.readObject();
					
						this.ITRQTY = (BigDecimal) dis.readObject();
					
						this.ITRRET = (BigDecimal) dis.readObject();
					
						this.ITRCST = (BigDecimal) dis.readObject();
					
					this.ITREXT = readString(dis);
					
						this.ITRVAT = (BigDecimal) dis.readObject();
					
						this.ITCVAT = (BigDecimal) dis.readObject();
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
						this.ITRREG = (BigDecimal) dis.readObject();
					
						this.ITRPOS = (BigDecimal) dis.readObject();
					
						this.ITREVT = (BigDecimal) dis.readObject();
					
						this.ITRPRE = (BigDecimal) dis.readObject();
					
					this.ITRACF = readString(dis);
					
			        this.IDEPT = dis.readFloat();
					
			        this.ISDEPT = dis.readFloat();
					
			        this.ICLAS = dis.readFloat();
					
			        this.ISCLAS = dis.readFloat();
					
						this.ITRPOV = (BigDecimal) dis.readObject();
					
			        this.ITRVND = dis.readFloat();
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
						this.ITRSET = (BigDecimal) dis.readObject();
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
						this.ITTRET = (BigDecimal) dis.readObject();
					
						this.ITTCST = (BigDecimal) dis.readObject();
					
						this.ITTREG = (BigDecimal) dis.readObject();
					
						this.ITTPOS = (BigDecimal) dis.readObject();
					
					this.ITTCOD = readString(dis);
					
						this.ITTRAT = (BigDecimal) dis.readObject();
					
						this.ITTVAT = (BigDecimal) dis.readObject();
					
						this.ITTCVT = (BigDecimal) dis.readObject();
					
					this.ITTMD = readString(dis);
					
						this.ITTID = (BigDecimal) dis.readObject();
					
					this.ITTPRO = readString(dis);
					
						this.ITRACN = (BigDecimal) dis.readObject();
					
						this.ITRADT = (BigDecimal) dis.readObject();
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
						this.CSCSH = (BigDecimal) dis.readObject();
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
						this.ITPCEN = (BigDecimal) dis.readObject();
					
						this.ITPDTE = (BigDecimal) dis.readObject();
					
						this.ITRSCN = (BigDecimal) dis.readObject();
					
						this.ITRSDT = (BigDecimal) dis.readObject();
					
						this.ITRSTM = (BigDecimal) dis.readObject();
					
						this.ITRLOH = (BigDecimal) dis.readObject();
					
						this.ITRLAC = (BigDecimal) dis.readObject();
					
						this.ITRLLC = (BigDecimal) dis.readObject();
					
						this.ITRCOH = (BigDecimal) dis.readObject();
					
						this.ITRCAC = (BigDecimal) dis.readObject();
					
						this.ITRCLC = (BigDecimal) dis.readObject();
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
						this.ITOHNO = (BigDecimal) dis.readObject();
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
						this.ITCATP = (BigDecimal) dis.readObject();
					
					this.ITUSID = readString(dis);
					
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
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLOC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCEN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRDAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRTYP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCST);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITCVAT);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRREG);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPOS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITREVT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPRE);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// float
				
		            	dos.writeFloat(this.IDEPT);
					
					// float
				
		            	dos.writeFloat(this.ISDEPT);
					
					// float
				
		            	dos.writeFloat(this.ICLAS);
					
					// float
				
		            	dos.writeFloat(this.ISCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPOV);
					
					// float
				
		            	dos.writeFloat(this.ITRVND);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSET);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTCST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTREG);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTPOS);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTCVT);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTID);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRACN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRADT);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CSCSH);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITPCEN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITPDTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSTM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLAC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLLC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCAC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCLC);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITOHNO);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITCATP);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLOC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCEN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRDAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRTYP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.INUMBR);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRQTY);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCST);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITCVAT);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRREG);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPOS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITREVT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPRE);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// float
				
		            	dos.writeFloat(this.IDEPT);
					
					// float
				
		            	dos.writeFloat(this.ISDEPT);
					
					// float
				
		            	dos.writeFloat(this.ICLAS);
					
					// float
				
		            	dos.writeFloat(this.ISCLAS);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRPOV);
					
					// float
				
		            	dos.writeFloat(this.ITRVND);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSET);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTRET);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTCST);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTREG);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTPOS);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTRAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTVAT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTCVT);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITTID);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRACN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRADT);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CSCSH);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITPCEN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITPDTE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSCN);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSDT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRSTM);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLAC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRLLC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCOH);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCAC);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITRCLC);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITOHNO);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITCATP);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITFLAG="+ITFLAG);
		sb.append(",ITHCOD="+ITHCOD);
		sb.append(",ITRLTP="+ITRLTP);
		sb.append(",ITRLOC="+String.valueOf(ITRLOC));
		sb.append(",ITRCEN="+String.valueOf(ITRCEN));
		sb.append(",ITRDAT="+String.valueOf(ITRDAT));
		sb.append(",ITRTYP="+String.valueOf(ITRTYP));
		sb.append(",INUMBR="+String.valueOf(INUMBR));
		sb.append(",ITRQTY="+String.valueOf(ITRQTY));
		sb.append(",ITRRET="+String.valueOf(ITRRET));
		sb.append(",ITRCST="+String.valueOf(ITRCST));
		sb.append(",ITREXT="+ITREXT);
		sb.append(",ITRVAT="+String.valueOf(ITRVAT));
		sb.append(",ITCVAT="+String.valueOf(ITCVAT));
		sb.append(",ITVCLC="+ITVCLC);
		sb.append(",ITRCUS="+ITRCUS);
		sb.append(",ITTPTP="+ITTPTP);
		sb.append(",ITRREG="+String.valueOf(ITRREG));
		sb.append(",ITRPOS="+String.valueOf(ITRPOS));
		sb.append(",ITREVT="+String.valueOf(ITREVT));
		sb.append(",ITRPRE="+String.valueOf(ITRPRE));
		sb.append(",ITRACF="+ITRACF);
		sb.append(",IDEPT="+String.valueOf(IDEPT));
		sb.append(",ISDEPT="+String.valueOf(ISDEPT));
		sb.append(",ICLAS="+String.valueOf(ICLAS));
		sb.append(",ISCLAS="+String.valueOf(ISCLAS));
		sb.append(",ITRPOV="+String.valueOf(ITRPOV));
		sb.append(",ITRVND="+String.valueOf(ITRVND));
		sb.append(",ITRSTY="+ITRSTY);
		sb.append(",ITRSEA="+ITRSEA);
		sb.append(",ITRSET="+String.valueOf(ITRSET));
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ITRPST="+ITRPST);
		sb.append(",ITRHOT="+ITRHOT);
		sb.append(",ITTRET="+String.valueOf(ITTRET));
		sb.append(",ITTCST="+String.valueOf(ITTCST));
		sb.append(",ITTREG="+String.valueOf(ITTREG));
		sb.append(",ITTPOS="+String.valueOf(ITTPOS));
		sb.append(",ITTCOD="+ITTCOD);
		sb.append(",ITTRAT="+String.valueOf(ITTRAT));
		sb.append(",ITTVAT="+String.valueOf(ITTVAT));
		sb.append(",ITTCVT="+String.valueOf(ITTCVT));
		sb.append(",ITTMD="+ITTMD);
		sb.append(",ITTID="+String.valueOf(ITTID));
		sb.append(",ITTPRO="+ITTPRO);
		sb.append(",ITRACN="+String.valueOf(ITRACN));
		sb.append(",ITRADT="+String.valueOf(ITRADT));
		sb.append(",ITRREF="+ITRREF);
		sb.append(",PGMNAM="+PGMNAM);
		sb.append(",LGUSER="+LGUSER);
		sb.append(",CSCSH="+String.valueOf(CSCSH));
		sb.append(",CSRSTP="+CSRSTP);
		sb.append(",CSDRSN="+CSDRSN);
		sb.append(",ITGLBN="+ITGLBN);
		sb.append(",ITPCEN="+String.valueOf(ITPCEN));
		sb.append(",ITPDTE="+String.valueOf(ITPDTE));
		sb.append(",ITRSCN="+String.valueOf(ITRSCN));
		sb.append(",ITRSDT="+String.valueOf(ITRSDT));
		sb.append(",ITRSTM="+String.valueOf(ITRSTM));
		sb.append(",ITRLOH="+String.valueOf(ITRLOH));
		sb.append(",ITRLAC="+String.valueOf(ITRLAC));
		sb.append(",ITRLLC="+String.valueOf(ITRLLC));
		sb.append(",ITRCOH="+String.valueOf(ITRCOH));
		sb.append(",ITRCAC="+String.valueOf(ITRCAC));
		sb.append(",ITRCLC="+String.valueOf(ITRCLC));
		sb.append(",ITRDSC="+ITRDSC);
		sb.append(",ITCHAN="+ITCHAN);
		sb.append(",ITSLRC="+ITSLRC);
		sb.append(",ITOHNO="+String.valueOf(ITOHNO));
		sb.append(",ITTPCD="+ITTPCD);
		sb.append(",ITDPMT="+ITDPMT);
		sb.append(",ITCATN="+ITCATN);
		sb.append(",ITCATS="+ITCATS);
		sb.append(",ITSPDI="+ITSPDI);
		sb.append(",ITCATP="+String.valueOf(ITCATP));
		sb.append(",ITUSID="+ITUSID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITFLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITFLAG);
            			}
            		
        			sb.append("|");
        		
        				if(ITHCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITHCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRTYP);
            			}
            		
        			sb.append("|");
        		
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				if(ITRQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRQTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITREXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREXT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITVCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITVCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCUS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITREVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPRE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPRE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACF);
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
        		
        				if(ITRPOV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOV);
            			}
            		
        			sb.append("|");
        		
        				sb.append(ITRVND);
        			
        			sb.append("|");
        		
        				if(ITRSTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSEA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSEA);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSET);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPST);
            			}
            		
        			sb.append("|");
        		
        				if(ITRHOT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRHOT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITTREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTMD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTID);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPRO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPRO);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRADT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRADT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREF);
            			}
            		
        			sb.append("|");
        		
        				if(PGMNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PGMNAM);
            			}
            		
        			sb.append("|");
        		
        				if(LGUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LGUSER);
            			}
            		
        			sb.append("|");
        		
        				if(CSCSH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSCSH);
            			}
            		
        			sb.append("|");
        		
        				if(CSRSTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSRSTP);
            			}
            		
        			sb.append("|");
        		
        				if(CSDRSN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSDRSN);
            			}
            		
        			sb.append("|");
        		
        				if(ITGLBN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITGLBN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPDTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPDTE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSCN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSDT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTM);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDSC);
            			}
            		
        			sb.append("|");
        		
        				if(ITCHAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCHAN);
            			}
            		
        			sb.append("|");
        		
        				if(ITSLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSLRC);
            			}
            		
        			sb.append("|");
        		
        				if(ITOHNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITOHNO);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPCD);
            			}
            		
        			sb.append("|");
        		
        				if(ITDPMT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITDPMT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATN);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATS);
            			}
            		
        			sb.append("|");
        		
        				if(ITSPDI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSPDI);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATP);
            			}
            		
        			sb.append("|");
        		
        				if(ITUSID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITUSID);
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



		row44Struct row44 = new row44Struct();




	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row44");
			
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
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVAUD.csv\"");
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
    fileName_tFileOutputDelimited_1 = (new java.io.File("/data/talend/data_repository/INVAUD.csv")).getAbsolutePath().replace("\\","/");
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
                                    if(file_tFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("ITFLAG");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITHCOD");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRLTP");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRLOC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCEN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRDAT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRTYP");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("INUMBR");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRQTY");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRRET");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCST");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITREXT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRVAT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITCVAT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITVCLC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCUS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTPTP");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRREG");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRPOS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITREVT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRPRE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRACF");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("IDEPT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ISDEPT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ICLAS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ISCLAS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRPOV");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRVND");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSTY");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSEA");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSET");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ISTYPE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRPST");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRHOT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTRET");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTCST");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTREG");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTPOS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTCOD");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTRAT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTVAT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTCVT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTMD");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTPRO");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRACN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRADT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRREF");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PGMNAM");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("LGUSER");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CSCSH");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CSRSTP");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CSDRSN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITGLBN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITPCEN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITPDTE");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSCN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSDT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRSTM");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRLOH");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRLAC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRLLC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCOH");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCAC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRCLC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITRDSC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITCHAN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITSLRC");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITOHNO");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITTPCD");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITDPMT");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITCATN");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITCATS");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITSPDI");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITCATP");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ITUSID");
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
                            log4jParamters_tDBInput_1.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TABLE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("QUERY" + " = " + "\"  select * from MM4R5LIB.INVAUD  where ITRDAT between VARCHAR_FORMAT( CURRENT DATE - 14 DAYS , 'YYMMDD') and VARCHAR_FORMAT( CURRENT DATE - 1 DAYS , 'YYMMDD')  \"");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tDBInput_1.append(" | ");
                            log4jParamters_tDBInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ITFLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITHCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLOC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRTYP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRQTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITREXT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITVCLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCUS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRREG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPOS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITREVT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPRE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRACF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPOV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRVND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSEA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRHOT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTREG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPOS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCVT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTMD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPRO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRACN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRADT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRREF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PGMNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LGUSER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSCSH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSRSTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSDRSN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITGLBN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITPCEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITPDTE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSTM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRDSC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCHAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITSLRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITOHNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITDPMT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITSPDI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITUSID")+"}]");
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
				conn_tDBInput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
				
				if(conn_tDBInput_1 != null) {
					if(conn_tDBInput_1.getMetaData() != null) {
						
							log.debug("tDBInput_1 - Uses an existing connection with username '" + conn_tDBInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tDBInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "\nselect * from MM4R5LIB.INVAUD\nwhere ITRDAT between VARCHAR_FORMAT( CURRENT DATE - 14 DAYS , 'YYMMDD') and VARCHAR_FO"
+"RMAT( CURRENT DATE - 1 DAYS , 'YYMMDD')\n";
		    
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
								row44.ITFLAG = null;
							} else {
	                         		
        	row44.ITFLAG = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row44.ITHCOD = null;
							} else {
	                         		
        	row44.ITHCOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 2, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row44.ITRLTP = null;
							} else {
	                         		
        	row44.ITRLTP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 3, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row44.ITRLOC = null;
							} else {
		                          
            row44.ITRLOC = rs_tDBInput_1.getBigDecimal(4);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row44.ITRCEN = null;
							} else {
		                          
            row44.ITRCEN = rs_tDBInput_1.getBigDecimal(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row44.ITRDAT = null;
							} else {
		                          
            row44.ITRDAT = rs_tDBInput_1.getBigDecimal(6);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row44.ITRTYP = null;
							} else {
		                          
            row44.ITRTYP = rs_tDBInput_1.getBigDecimal(7);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row44.INUMBR = null;
							} else {
		                          
            row44.INUMBR = rs_tDBInput_1.getBigDecimal(8);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row44.ITRQTY = null;
							} else {
		                          
            row44.ITRQTY = rs_tDBInput_1.getBigDecimal(9);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row44.ITRRET = null;
							} else {
		                          
            row44.ITRRET = rs_tDBInput_1.getBigDecimal(10);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row44.ITRCST = null;
							} else {
		                          
            row44.ITRCST = rs_tDBInput_1.getBigDecimal(11);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row44.ITREXT = null;
							} else {
	                         		
        	row44.ITREXT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 12, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row44.ITRVAT = null;
							} else {
		                          
            row44.ITRVAT = rs_tDBInput_1.getBigDecimal(13);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row44.ITCVAT = null;
							} else {
		                          
            row44.ITCVAT = rs_tDBInput_1.getBigDecimal(14);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row44.ITVCLC = null;
							} else {
	                         		
        	row44.ITVCLC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 15, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row44.ITRCUS = null;
							} else {
	                         		
        	row44.ITRCUS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row44.ITTPTP = null;
							} else {
	                         		
        	row44.ITTPTP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 17, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row44.ITRREG = null;
							} else {
		                          
            row44.ITRREG = rs_tDBInput_1.getBigDecimal(18);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 19) {
								row44.ITRPOS = null;
							} else {
		                          
            row44.ITRPOS = rs_tDBInput_1.getBigDecimal(19);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 20) {
								row44.ITREVT = null;
							} else {
		                          
            row44.ITREVT = rs_tDBInput_1.getBigDecimal(20);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 21) {
								row44.ITRPRE = null;
							} else {
		                          
            row44.ITRPRE = rs_tDBInput_1.getBigDecimal(21);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 22) {
								row44.ITRACF = null;
							} else {
	                         		
        	row44.ITRACF = routines.system.JDBCUtil.getString(rs_tDBInput_1, 22, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 23) {
								row44.IDEPT = 0;
							} else {
		                          
            row44.IDEPT = rs_tDBInput_1.getFloat(23);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 24) {
								row44.ISDEPT = 0;
							} else {
		                          
            row44.ISDEPT = rs_tDBInput_1.getFloat(24);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 25) {
								row44.ICLAS = 0;
							} else {
		                          
            row44.ICLAS = rs_tDBInput_1.getFloat(25);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 26) {
								row44.ISCLAS = 0;
							} else {
		                          
            row44.ISCLAS = rs_tDBInput_1.getFloat(26);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 27) {
								row44.ITRPOV = null;
							} else {
		                          
            row44.ITRPOV = rs_tDBInput_1.getBigDecimal(27);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 28) {
								row44.ITRVND = 0;
							} else {
		                          
            row44.ITRVND = rs_tDBInput_1.getFloat(28);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 29) {
								row44.ITRSTY = null;
							} else {
	                         		
        	row44.ITRSTY = routines.system.JDBCUtil.getString(rs_tDBInput_1, 29, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 30) {
								row44.ITRSEA = null;
							} else {
	                         		
        	row44.ITRSEA = routines.system.JDBCUtil.getString(rs_tDBInput_1, 30, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 31) {
								row44.ITRSET = null;
							} else {
		                          
            row44.ITRSET = rs_tDBInput_1.getBigDecimal(31);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 32) {
								row44.ISTYPE = null;
							} else {
	                         		
        	row44.ISTYPE = routines.system.JDBCUtil.getString(rs_tDBInput_1, 32, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 33) {
								row44.ITRPST = null;
							} else {
	                         		
        	row44.ITRPST = routines.system.JDBCUtil.getString(rs_tDBInput_1, 33, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 34) {
								row44.ITRHOT = null;
							} else {
	                         		
        	row44.ITRHOT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 34, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 35) {
								row44.ITTRET = null;
							} else {
		                          
            row44.ITTRET = rs_tDBInput_1.getBigDecimal(35);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 36) {
								row44.ITTCST = null;
							} else {
		                          
            row44.ITTCST = rs_tDBInput_1.getBigDecimal(36);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 37) {
								row44.ITTREG = null;
							} else {
		                          
            row44.ITTREG = rs_tDBInput_1.getBigDecimal(37);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 38) {
								row44.ITTPOS = null;
							} else {
		                          
            row44.ITTPOS = rs_tDBInput_1.getBigDecimal(38);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 39) {
								row44.ITTCOD = null;
							} else {
	                         		
        	row44.ITTCOD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 39, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 40) {
								row44.ITTRAT = null;
							} else {
		                          
            row44.ITTRAT = rs_tDBInput_1.getBigDecimal(40);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 41) {
								row44.ITTVAT = null;
							} else {
		                          
            row44.ITTVAT = rs_tDBInput_1.getBigDecimal(41);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 42) {
								row44.ITTCVT = null;
							} else {
		                          
            row44.ITTCVT = rs_tDBInput_1.getBigDecimal(42);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 43) {
								row44.ITTMD = null;
							} else {
	                         		
        	row44.ITTMD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 43, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 44) {
								row44.ITTID = null;
							} else {
		                          
            row44.ITTID = rs_tDBInput_1.getBigDecimal(44);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 45) {
								row44.ITTPRO = null;
							} else {
	                         		
        	row44.ITTPRO = routines.system.JDBCUtil.getString(rs_tDBInput_1, 45, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 46) {
								row44.ITRACN = null;
							} else {
		                          
            row44.ITRACN = rs_tDBInput_1.getBigDecimal(46);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 47) {
								row44.ITRADT = null;
							} else {
		                          
            row44.ITRADT = rs_tDBInput_1.getBigDecimal(47);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 48) {
								row44.ITRREF = null;
							} else {
	                         		
        	row44.ITRREF = routines.system.JDBCUtil.getString(rs_tDBInput_1, 48, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 49) {
								row44.PGMNAM = null;
							} else {
	                         		
        	row44.PGMNAM = routines.system.JDBCUtil.getString(rs_tDBInput_1, 49, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 50) {
								row44.LGUSER = null;
							} else {
	                         		
        	row44.LGUSER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 50, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 51) {
								row44.CSCSH = null;
							} else {
		                          
            row44.CSCSH = rs_tDBInput_1.getBigDecimal(51);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 52) {
								row44.CSRSTP = null;
							} else {
	                         		
        	row44.CSRSTP = routines.system.JDBCUtil.getString(rs_tDBInput_1, 52, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 53) {
								row44.CSDRSN = null;
							} else {
	                         		
        	row44.CSDRSN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 53, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 54) {
								row44.ITGLBN = null;
							} else {
	                         		
        	row44.ITGLBN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 54, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 55) {
								row44.ITPCEN = null;
							} else {
		                          
            row44.ITPCEN = rs_tDBInput_1.getBigDecimal(55);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 56) {
								row44.ITPDTE = null;
							} else {
		                          
            row44.ITPDTE = rs_tDBInput_1.getBigDecimal(56);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 57) {
								row44.ITRSCN = null;
							} else {
		                          
            row44.ITRSCN = rs_tDBInput_1.getBigDecimal(57);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 58) {
								row44.ITRSDT = null;
							} else {
		                          
            row44.ITRSDT = rs_tDBInput_1.getBigDecimal(58);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 59) {
								row44.ITRSTM = null;
							} else {
		                          
            row44.ITRSTM = rs_tDBInput_1.getBigDecimal(59);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 60) {
								row44.ITRLOH = null;
							} else {
		                          
            row44.ITRLOH = rs_tDBInput_1.getBigDecimal(60);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 61) {
								row44.ITRLAC = null;
							} else {
		                          
            row44.ITRLAC = rs_tDBInput_1.getBigDecimal(61);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 62) {
								row44.ITRLLC = null;
							} else {
		                          
            row44.ITRLLC = rs_tDBInput_1.getBigDecimal(62);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 63) {
								row44.ITRCOH = null;
							} else {
		                          
            row44.ITRCOH = rs_tDBInput_1.getBigDecimal(63);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 64) {
								row44.ITRCAC = null;
							} else {
		                          
            row44.ITRCAC = rs_tDBInput_1.getBigDecimal(64);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 65) {
								row44.ITRCLC = null;
							} else {
		                          
            row44.ITRCLC = rs_tDBInput_1.getBigDecimal(65);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 66) {
								row44.ITRDSC = null;
							} else {
	                         		
        	row44.ITRDSC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 66, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 67) {
								row44.ITCHAN = null;
							} else {
	                         		
        	row44.ITCHAN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 67, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 68) {
								row44.ITSLRC = null;
							} else {
	                         		
        	row44.ITSLRC = routines.system.JDBCUtil.getString(rs_tDBInput_1, 68, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 69) {
								row44.ITOHNO = null;
							} else {
		                          
            row44.ITOHNO = rs_tDBInput_1.getBigDecimal(69);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 70) {
								row44.ITTPCD = null;
							} else {
	                         		
        	row44.ITTPCD = routines.system.JDBCUtil.getString(rs_tDBInput_1, 70, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 71) {
								row44.ITDPMT = null;
							} else {
	                         		
        	row44.ITDPMT = routines.system.JDBCUtil.getString(rs_tDBInput_1, 71, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 72) {
								row44.ITCATN = null;
							} else {
	                         		
        	row44.ITCATN = routines.system.JDBCUtil.getString(rs_tDBInput_1, 72, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 73) {
								row44.ITCATS = null;
							} else {
	                         		
        	row44.ITCATS = routines.system.JDBCUtil.getString(rs_tDBInput_1, 73, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 74) {
								row44.ITSPDI = null;
							} else {
	                         		
        	row44.ITSPDI = routines.system.JDBCUtil.getString(rs_tDBInput_1, 74, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 75) {
								row44.ITCATP = null;
							} else {
		                          
            row44.ITCATP = rs_tDBInput_1.getBigDecimal(75);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 76) {
								row44.ITUSID = null;
							} else {
	                         		
        	row44.ITUSID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 76, false);
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
				
					,"row44","tDBInput_1","tDBInput_1","tAS400Input","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row44 - " + (row44==null? "": row44.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(row44.ITFLAG != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITFLAG
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITHCOD != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITHCOD
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRLTP != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRLTP
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRLOC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRLOC.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCEN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCEN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRDAT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRDAT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRTYP != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRTYP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.INUMBR != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.INUMBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRQTY != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRQTY.setScale(3, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRRET != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRRET.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCST != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCST.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITREXT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITREXT
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRVAT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRVAT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITCVAT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITCVAT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITVCLC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITVCLC
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCUS != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCUS
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTPTP != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTPTP
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRREG != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRREG.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRPOS != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRPOS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITREVT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITREVT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRPRE != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRPRE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRACF != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRACF
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                        sb_tFileOutputDelimited_1.append(
                            row44.IDEPT
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                        sb_tFileOutputDelimited_1.append(
                            row44.ISDEPT
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                        sb_tFileOutputDelimited_1.append(
                            row44.ICLAS
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                        sb_tFileOutputDelimited_1.append(
                            row44.ISCLAS
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRPOV != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRPOV.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRVND
                        );
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSTY != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSTY
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSEA != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSEA
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSET != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSET.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ISTYPE != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ISTYPE
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRPST != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRPST
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRHOT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRHOT
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTRET != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTRET.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTCST != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTCST.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTREG != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTREG.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTPOS != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTPOS.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTCOD != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTCOD
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTRAT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTRAT.setScale(8, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTVAT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTVAT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTCVT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTCVT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTMD != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTMD
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTID != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTID.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTPRO != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTPRO
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRACN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRACN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRADT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRADT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRREF != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRREF
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.PGMNAM != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.PGMNAM
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.LGUSER != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.LGUSER
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.CSCSH != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.CSCSH.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.CSRSTP != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.CSRSTP
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.CSDRSN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.CSDRSN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITGLBN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITGLBN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITPCEN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITPCEN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITPDTE != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITPDTE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSCN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSCN.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSDT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSDT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRSTM != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRSTM.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRLOH != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRLOH.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRLAC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRLAC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRLLC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRLLC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCOH != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCOH.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCAC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCAC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRCLC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRCLC.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITRDSC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITRDSC
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITCHAN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITCHAN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITSLRC != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITSLRC
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITOHNO != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITOHNO.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITTPCD != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITTPCD
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITDPMT != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITDPMT
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITCATN != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITCATN
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITCATS != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITCATS
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITSPDI != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITSPDI
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITCATP != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITCATP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(row44.ITUSID != null) {
                        sb_tFileOutputDelimited_1.append(
                            row44.ITUSID
                        );
                            }
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
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row44",2,0,
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
	


public static class tmap_inaudStruct implements routines.system.IPersistableRow<tmap_inaudStruct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];

	
			    public String ITFLAG;

				public String getITFLAG () {
					return this.ITFLAG;
				}

				public Boolean ITFLAGIsNullable(){
				    return true;
				}
				public Boolean ITFLAGIsKey(){
				    return false;
				}
				public Integer ITFLAGLength(){
				    return 16777216;
				}
				public Integer ITFLAGPrecision(){
				    return null;
				}
				public String ITFLAGDefault(){
				
					return null;
				
				}
				public String ITFLAGComment(){
				
				    return "";
				
				}
				public String ITFLAGPattern(){
				
					return "";
				
				}
				public String ITFLAGOriginalDbColumnName(){
				
					return "ITFLAG";
				
				}

				
			    public String ITHCOD;

				public String getITHCOD () {
					return this.ITHCOD;
				}

				public Boolean ITHCODIsNullable(){
				    return true;
				}
				public Boolean ITHCODIsKey(){
				    return false;
				}
				public Integer ITHCODLength(){
				    return 16777216;
				}
				public Integer ITHCODPrecision(){
				    return null;
				}
				public String ITHCODDefault(){
				
					return null;
				
				}
				public String ITHCODComment(){
				
				    return "";
				
				}
				public String ITHCODPattern(){
				
					return "";
				
				}
				public String ITHCODOriginalDbColumnName(){
				
					return "ITHCOD";
				
				}

				
			    public String ITRLTP;

				public String getITRLTP () {
					return this.ITRLTP;
				}

				public Boolean ITRLTPIsNullable(){
				    return true;
				}
				public Boolean ITRLTPIsKey(){
				    return false;
				}
				public Integer ITRLTPLength(){
				    return 16777216;
				}
				public Integer ITRLTPPrecision(){
				    return null;
				}
				public String ITRLTPDefault(){
				
					return null;
				
				}
				public String ITRLTPComment(){
				
				    return "";
				
				}
				public String ITRLTPPattern(){
				
					return "";
				
				}
				public String ITRLTPOriginalDbColumnName(){
				
					return "ITRLTP";
				
				}

				
			    public String ITRLOC;

				public String getITRLOC () {
					return this.ITRLOC;
				}

				public Boolean ITRLOCIsNullable(){
				    return true;
				}
				public Boolean ITRLOCIsKey(){
				    return false;
				}
				public Integer ITRLOCLength(){
				    return 16777216;
				}
				public Integer ITRLOCPrecision(){
				    return null;
				}
				public String ITRLOCDefault(){
				
					return null;
				
				}
				public String ITRLOCComment(){
				
				    return "";
				
				}
				public String ITRLOCPattern(){
				
					return "";
				
				}
				public String ITRLOCOriginalDbColumnName(){
				
					return "ITRLOC";
				
				}

				
			    public String ITRCEN;

				public String getITRCEN () {
					return this.ITRCEN;
				}

				public Boolean ITRCENIsNullable(){
				    return true;
				}
				public Boolean ITRCENIsKey(){
				    return false;
				}
				public Integer ITRCENLength(){
				    return 16777216;
				}
				public Integer ITRCENPrecision(){
				    return null;
				}
				public String ITRCENDefault(){
				
					return null;
				
				}
				public String ITRCENComment(){
				
				    return "";
				
				}
				public String ITRCENPattern(){
				
					return "";
				
				}
				public String ITRCENOriginalDbColumnName(){
				
					return "ITRCEN";
				
				}

				
			    public String ITRDAT;

				public String getITRDAT () {
					return this.ITRDAT;
				}

				public Boolean ITRDATIsNullable(){
				    return true;
				}
				public Boolean ITRDATIsKey(){
				    return false;
				}
				public Integer ITRDATLength(){
				    return 16777216;
				}
				public Integer ITRDATPrecision(){
				    return null;
				}
				public String ITRDATDefault(){
				
					return null;
				
				}
				public String ITRDATComment(){
				
				    return "";
				
				}
				public String ITRDATPattern(){
				
					return "";
				
				}
				public String ITRDATOriginalDbColumnName(){
				
					return "ITRDAT";
				
				}

				
			    public String ITRTYP;

				public String getITRTYP () {
					return this.ITRTYP;
				}

				public Boolean ITRTYPIsNullable(){
				    return true;
				}
				public Boolean ITRTYPIsKey(){
				    return false;
				}
				public Integer ITRTYPLength(){
				    return 16777216;
				}
				public Integer ITRTYPPrecision(){
				    return null;
				}
				public String ITRTYPDefault(){
				
					return null;
				
				}
				public String ITRTYPComment(){
				
				    return "";
				
				}
				public String ITRTYPPattern(){
				
					return "";
				
				}
				public String ITRTYPOriginalDbColumnName(){
				
					return "ITRTYP";
				
				}

				
			    public String INUMBR;

				public String getINUMBR () {
					return this.INUMBR;
				}

				public Boolean INUMBRIsNullable(){
				    return true;
				}
				public Boolean INUMBRIsKey(){
				    return false;
				}
				public Integer INUMBRLength(){
				    return 16777216;
				}
				public Integer INUMBRPrecision(){
				    return null;
				}
				public String INUMBRDefault(){
				
					return null;
				
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

				
			    public String ITRQTY;

				public String getITRQTY () {
					return this.ITRQTY;
				}

				public Boolean ITRQTYIsNullable(){
				    return true;
				}
				public Boolean ITRQTYIsKey(){
				    return false;
				}
				public Integer ITRQTYLength(){
				    return 16777216;
				}
				public Integer ITRQTYPrecision(){
				    return null;
				}
				public String ITRQTYDefault(){
				
					return null;
				
				}
				public String ITRQTYComment(){
				
				    return "";
				
				}
				public String ITRQTYPattern(){
				
					return "";
				
				}
				public String ITRQTYOriginalDbColumnName(){
				
					return "ITRQTY";
				
				}

				
			    public String ITRRET;

				public String getITRRET () {
					return this.ITRRET;
				}

				public Boolean ITRRETIsNullable(){
				    return true;
				}
				public Boolean ITRRETIsKey(){
				    return false;
				}
				public Integer ITRRETLength(){
				    return 16777216;
				}
				public Integer ITRRETPrecision(){
				    return null;
				}
				public String ITRRETDefault(){
				
					return null;
				
				}
				public String ITRRETComment(){
				
				    return "";
				
				}
				public String ITRRETPattern(){
				
					return "";
				
				}
				public String ITRRETOriginalDbColumnName(){
				
					return "ITRRET";
				
				}

				
			    public String ITRCST;

				public String getITRCST () {
					return this.ITRCST;
				}

				public Boolean ITRCSTIsNullable(){
				    return true;
				}
				public Boolean ITRCSTIsKey(){
				    return false;
				}
				public Integer ITRCSTLength(){
				    return 16777216;
				}
				public Integer ITRCSTPrecision(){
				    return null;
				}
				public String ITRCSTDefault(){
				
					return null;
				
				}
				public String ITRCSTComment(){
				
				    return "";
				
				}
				public String ITRCSTPattern(){
				
					return "";
				
				}
				public String ITRCSTOriginalDbColumnName(){
				
					return "ITRCST";
				
				}

				
			    public String ITREXT;

				public String getITREXT () {
					return this.ITREXT;
				}

				public Boolean ITREXTIsNullable(){
				    return true;
				}
				public Boolean ITREXTIsKey(){
				    return false;
				}
				public Integer ITREXTLength(){
				    return 16777216;
				}
				public Integer ITREXTPrecision(){
				    return null;
				}
				public String ITREXTDefault(){
				
					return null;
				
				}
				public String ITREXTComment(){
				
				    return "";
				
				}
				public String ITREXTPattern(){
				
					return "";
				
				}
				public String ITREXTOriginalDbColumnName(){
				
					return "ITREXT";
				
				}

				
			    public String ITRVAT;

				public String getITRVAT () {
					return this.ITRVAT;
				}

				public Boolean ITRVATIsNullable(){
				    return true;
				}
				public Boolean ITRVATIsKey(){
				    return false;
				}
				public Integer ITRVATLength(){
				    return 16777216;
				}
				public Integer ITRVATPrecision(){
				    return null;
				}
				public String ITRVATDefault(){
				
					return null;
				
				}
				public String ITRVATComment(){
				
				    return "";
				
				}
				public String ITRVATPattern(){
				
					return "";
				
				}
				public String ITRVATOriginalDbColumnName(){
				
					return "ITRVAT";
				
				}

				
			    public String ITCVAT;

				public String getITCVAT () {
					return this.ITCVAT;
				}

				public Boolean ITCVATIsNullable(){
				    return true;
				}
				public Boolean ITCVATIsKey(){
				    return false;
				}
				public Integer ITCVATLength(){
				    return 16777216;
				}
				public Integer ITCVATPrecision(){
				    return null;
				}
				public String ITCVATDefault(){
				
					return null;
				
				}
				public String ITCVATComment(){
				
				    return "";
				
				}
				public String ITCVATPattern(){
				
					return "";
				
				}
				public String ITCVATOriginalDbColumnName(){
				
					return "ITCVAT";
				
				}

				
			    public String ITVCLC;

				public String getITVCLC () {
					return this.ITVCLC;
				}

				public Boolean ITVCLCIsNullable(){
				    return true;
				}
				public Boolean ITVCLCIsKey(){
				    return false;
				}
				public Integer ITVCLCLength(){
				    return 16777216;
				}
				public Integer ITVCLCPrecision(){
				    return null;
				}
				public String ITVCLCDefault(){
				
					return null;
				
				}
				public String ITVCLCComment(){
				
				    return "";
				
				}
				public String ITVCLCPattern(){
				
					return "";
				
				}
				public String ITVCLCOriginalDbColumnName(){
				
					return "ITVCLC";
				
				}

				
			    public String ITRCUS;

				public String getITRCUS () {
					return this.ITRCUS;
				}

				public Boolean ITRCUSIsNullable(){
				    return true;
				}
				public Boolean ITRCUSIsKey(){
				    return false;
				}
				public Integer ITRCUSLength(){
				    return 16777216;
				}
				public Integer ITRCUSPrecision(){
				    return null;
				}
				public String ITRCUSDefault(){
				
					return null;
				
				}
				public String ITRCUSComment(){
				
				    return "";
				
				}
				public String ITRCUSPattern(){
				
					return "";
				
				}
				public String ITRCUSOriginalDbColumnName(){
				
					return "ITRCUS";
				
				}

				
			    public String ITTPTP;

				public String getITTPTP () {
					return this.ITTPTP;
				}

				public Boolean ITTPTPIsNullable(){
				    return true;
				}
				public Boolean ITTPTPIsKey(){
				    return false;
				}
				public Integer ITTPTPLength(){
				    return 16777216;
				}
				public Integer ITTPTPPrecision(){
				    return null;
				}
				public String ITTPTPDefault(){
				
					return null;
				
				}
				public String ITTPTPComment(){
				
				    return "";
				
				}
				public String ITTPTPPattern(){
				
					return "";
				
				}
				public String ITTPTPOriginalDbColumnName(){
				
					return "ITTPTP";
				
				}

				
			    public String ITRREG;

				public String getITRREG () {
					return this.ITRREG;
				}

				public Boolean ITRREGIsNullable(){
				    return true;
				}
				public Boolean ITRREGIsKey(){
				    return false;
				}
				public Integer ITRREGLength(){
				    return 16777216;
				}
				public Integer ITRREGPrecision(){
				    return null;
				}
				public String ITRREGDefault(){
				
					return null;
				
				}
				public String ITRREGComment(){
				
				    return "";
				
				}
				public String ITRREGPattern(){
				
					return "";
				
				}
				public String ITRREGOriginalDbColumnName(){
				
					return "ITRREG";
				
				}

				
			    public String ITRPOS;

				public String getITRPOS () {
					return this.ITRPOS;
				}

				public Boolean ITRPOSIsNullable(){
				    return true;
				}
				public Boolean ITRPOSIsKey(){
				    return false;
				}
				public Integer ITRPOSLength(){
				    return 16777216;
				}
				public Integer ITRPOSPrecision(){
				    return null;
				}
				public String ITRPOSDefault(){
				
					return null;
				
				}
				public String ITRPOSComment(){
				
				    return "";
				
				}
				public String ITRPOSPattern(){
				
					return "";
				
				}
				public String ITRPOSOriginalDbColumnName(){
				
					return "ITRPOS";
				
				}

				
			    public String ITREVT;

				public String getITREVT () {
					return this.ITREVT;
				}

				public Boolean ITREVTIsNullable(){
				    return true;
				}
				public Boolean ITREVTIsKey(){
				    return false;
				}
				public Integer ITREVTLength(){
				    return 16777216;
				}
				public Integer ITREVTPrecision(){
				    return null;
				}
				public String ITREVTDefault(){
				
					return null;
				
				}
				public String ITREVTComment(){
				
				    return "";
				
				}
				public String ITREVTPattern(){
				
					return "";
				
				}
				public String ITREVTOriginalDbColumnName(){
				
					return "ITREVT";
				
				}

				
			    public String ITRPRE;

				public String getITRPRE () {
					return this.ITRPRE;
				}

				public Boolean ITRPREIsNullable(){
				    return true;
				}
				public Boolean ITRPREIsKey(){
				    return false;
				}
				public Integer ITRPRELength(){
				    return 16777216;
				}
				public Integer ITRPREPrecision(){
				    return null;
				}
				public String ITRPREDefault(){
				
					return null;
				
				}
				public String ITRPREComment(){
				
				    return "";
				
				}
				public String ITRPREPattern(){
				
					return "";
				
				}
				public String ITRPREOriginalDbColumnName(){
				
					return "ITRPRE";
				
				}

				
			    public String ITRACF;

				public String getITRACF () {
					return this.ITRACF;
				}

				public Boolean ITRACFIsNullable(){
				    return true;
				}
				public Boolean ITRACFIsKey(){
				    return false;
				}
				public Integer ITRACFLength(){
				    return 16777216;
				}
				public Integer ITRACFPrecision(){
				    return null;
				}
				public String ITRACFDefault(){
				
					return null;
				
				}
				public String ITRACFComment(){
				
				    return "";
				
				}
				public String ITRACFPattern(){
				
					return "";
				
				}
				public String ITRACFOriginalDbColumnName(){
				
					return "ITRACF";
				
				}

				
			    public String IDEPT;

				public String getIDEPT () {
					return this.IDEPT;
				}

				public Boolean IDEPTIsNullable(){
				    return true;
				}
				public Boolean IDEPTIsKey(){
				    return false;
				}
				public Integer IDEPTLength(){
				    return 16777216;
				}
				public Integer IDEPTPrecision(){
				    return null;
				}
				public String IDEPTDefault(){
				
					return null;
				
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

				
			    public String ISDEPT;

				public String getISDEPT () {
					return this.ISDEPT;
				}

				public Boolean ISDEPTIsNullable(){
				    return true;
				}
				public Boolean ISDEPTIsKey(){
				    return false;
				}
				public Integer ISDEPTLength(){
				    return 16777216;
				}
				public Integer ISDEPTPrecision(){
				    return null;
				}
				public String ISDEPTDefault(){
				
					return null;
				
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

				
			    public String ICLAS;

				public String getICLAS () {
					return this.ICLAS;
				}

				public Boolean ICLASIsNullable(){
				    return true;
				}
				public Boolean ICLASIsKey(){
				    return false;
				}
				public Integer ICLASLength(){
				    return 16777216;
				}
				public Integer ICLASPrecision(){
				    return null;
				}
				public String ICLASDefault(){
				
					return null;
				
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

				
			    public String ISCLAS;

				public String getISCLAS () {
					return this.ISCLAS;
				}

				public Boolean ISCLASIsNullable(){
				    return true;
				}
				public Boolean ISCLASIsKey(){
				    return false;
				}
				public Integer ISCLASLength(){
				    return 16777216;
				}
				public Integer ISCLASPrecision(){
				    return null;
				}
				public String ISCLASDefault(){
				
					return null;
				
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

				
			    public String ITRPOV;

				public String getITRPOV () {
					return this.ITRPOV;
				}

				public Boolean ITRPOVIsNullable(){
				    return true;
				}
				public Boolean ITRPOVIsKey(){
				    return false;
				}
				public Integer ITRPOVLength(){
				    return 16777216;
				}
				public Integer ITRPOVPrecision(){
				    return null;
				}
				public String ITRPOVDefault(){
				
					return null;
				
				}
				public String ITRPOVComment(){
				
				    return "";
				
				}
				public String ITRPOVPattern(){
				
					return "";
				
				}
				public String ITRPOVOriginalDbColumnName(){
				
					return "ITRPOV";
				
				}

				
			    public String ITRVND;

				public String getITRVND () {
					return this.ITRVND;
				}

				public Boolean ITRVNDIsNullable(){
				    return true;
				}
				public Boolean ITRVNDIsKey(){
				    return false;
				}
				public Integer ITRVNDLength(){
				    return 16777216;
				}
				public Integer ITRVNDPrecision(){
				    return null;
				}
				public String ITRVNDDefault(){
				
					return null;
				
				}
				public String ITRVNDComment(){
				
				    return "";
				
				}
				public String ITRVNDPattern(){
				
					return "";
				
				}
				public String ITRVNDOriginalDbColumnName(){
				
					return "ITRVND";
				
				}

				
			    public String ITRSTY;

				public String getITRSTY () {
					return this.ITRSTY;
				}

				public Boolean ITRSTYIsNullable(){
				    return true;
				}
				public Boolean ITRSTYIsKey(){
				    return false;
				}
				public Integer ITRSTYLength(){
				    return 16777216;
				}
				public Integer ITRSTYPrecision(){
				    return null;
				}
				public String ITRSTYDefault(){
				
					return null;
				
				}
				public String ITRSTYComment(){
				
				    return "";
				
				}
				public String ITRSTYPattern(){
				
					return "";
				
				}
				public String ITRSTYOriginalDbColumnName(){
				
					return "ITRSTY";
				
				}

				
			    public String ITRSEA;

				public String getITRSEA () {
					return this.ITRSEA;
				}

				public Boolean ITRSEAIsNullable(){
				    return true;
				}
				public Boolean ITRSEAIsKey(){
				    return false;
				}
				public Integer ITRSEALength(){
				    return 16777216;
				}
				public Integer ITRSEAPrecision(){
				    return null;
				}
				public String ITRSEADefault(){
				
					return null;
				
				}
				public String ITRSEAComment(){
				
				    return "";
				
				}
				public String ITRSEAPattern(){
				
					return "";
				
				}
				public String ITRSEAOriginalDbColumnName(){
				
					return "ITRSEA";
				
				}

				
			    public String ITRSET;

				public String getITRSET () {
					return this.ITRSET;
				}

				public Boolean ITRSETIsNullable(){
				    return true;
				}
				public Boolean ITRSETIsKey(){
				    return false;
				}
				public Integer ITRSETLength(){
				    return 16777216;
				}
				public Integer ITRSETPrecision(){
				    return null;
				}
				public String ITRSETDefault(){
				
					return null;
				
				}
				public String ITRSETComment(){
				
				    return "";
				
				}
				public String ITRSETPattern(){
				
					return "";
				
				}
				public String ITRSETOriginalDbColumnName(){
				
					return "ITRSET";
				
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
				    return 16777216;
				}
				public Integer ISTYPEPrecision(){
				    return null;
				}
				public String ISTYPEDefault(){
				
					return null;
				
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

				
			    public String ITRPST;

				public String getITRPST () {
					return this.ITRPST;
				}

				public Boolean ITRPSTIsNullable(){
				    return true;
				}
				public Boolean ITRPSTIsKey(){
				    return false;
				}
				public Integer ITRPSTLength(){
				    return 16777216;
				}
				public Integer ITRPSTPrecision(){
				    return null;
				}
				public String ITRPSTDefault(){
				
					return null;
				
				}
				public String ITRPSTComment(){
				
				    return "";
				
				}
				public String ITRPSTPattern(){
				
					return "";
				
				}
				public String ITRPSTOriginalDbColumnName(){
				
					return "ITRPST";
				
				}

				
			    public String ITRHOT;

				public String getITRHOT () {
					return this.ITRHOT;
				}

				public Boolean ITRHOTIsNullable(){
				    return true;
				}
				public Boolean ITRHOTIsKey(){
				    return false;
				}
				public Integer ITRHOTLength(){
				    return 16777216;
				}
				public Integer ITRHOTPrecision(){
				    return null;
				}
				public String ITRHOTDefault(){
				
					return null;
				
				}
				public String ITRHOTComment(){
				
				    return "";
				
				}
				public String ITRHOTPattern(){
				
					return "";
				
				}
				public String ITRHOTOriginalDbColumnName(){
				
					return "ITRHOT";
				
				}

				
			    public String ITTRET;

				public String getITTRET () {
					return this.ITTRET;
				}

				public Boolean ITTRETIsNullable(){
				    return true;
				}
				public Boolean ITTRETIsKey(){
				    return false;
				}
				public Integer ITTRETLength(){
				    return 16777216;
				}
				public Integer ITTRETPrecision(){
				    return null;
				}
				public String ITTRETDefault(){
				
					return null;
				
				}
				public String ITTRETComment(){
				
				    return "";
				
				}
				public String ITTRETPattern(){
				
					return "";
				
				}
				public String ITTRETOriginalDbColumnName(){
				
					return "ITTRET";
				
				}

				
			    public String ITTCST;

				public String getITTCST () {
					return this.ITTCST;
				}

				public Boolean ITTCSTIsNullable(){
				    return true;
				}
				public Boolean ITTCSTIsKey(){
				    return false;
				}
				public Integer ITTCSTLength(){
				    return 16777216;
				}
				public Integer ITTCSTPrecision(){
				    return null;
				}
				public String ITTCSTDefault(){
				
					return null;
				
				}
				public String ITTCSTComment(){
				
				    return "";
				
				}
				public String ITTCSTPattern(){
				
					return "";
				
				}
				public String ITTCSTOriginalDbColumnName(){
				
					return "ITTCST";
				
				}

				
			    public String ITTREG;

				public String getITTREG () {
					return this.ITTREG;
				}

				public Boolean ITTREGIsNullable(){
				    return true;
				}
				public Boolean ITTREGIsKey(){
				    return false;
				}
				public Integer ITTREGLength(){
				    return 16777216;
				}
				public Integer ITTREGPrecision(){
				    return null;
				}
				public String ITTREGDefault(){
				
					return null;
				
				}
				public String ITTREGComment(){
				
				    return "";
				
				}
				public String ITTREGPattern(){
				
					return "";
				
				}
				public String ITTREGOriginalDbColumnName(){
				
					return "ITTREG";
				
				}

				
			    public String ITTPOS;

				public String getITTPOS () {
					return this.ITTPOS;
				}

				public Boolean ITTPOSIsNullable(){
				    return true;
				}
				public Boolean ITTPOSIsKey(){
				    return false;
				}
				public Integer ITTPOSLength(){
				    return 16777216;
				}
				public Integer ITTPOSPrecision(){
				    return null;
				}
				public String ITTPOSDefault(){
				
					return null;
				
				}
				public String ITTPOSComment(){
				
				    return "";
				
				}
				public String ITTPOSPattern(){
				
					return "";
				
				}
				public String ITTPOSOriginalDbColumnName(){
				
					return "ITTPOS";
				
				}

				
			    public String ITTCOD;

				public String getITTCOD () {
					return this.ITTCOD;
				}

				public Boolean ITTCODIsNullable(){
				    return true;
				}
				public Boolean ITTCODIsKey(){
				    return false;
				}
				public Integer ITTCODLength(){
				    return 16777216;
				}
				public Integer ITTCODPrecision(){
				    return null;
				}
				public String ITTCODDefault(){
				
					return null;
				
				}
				public String ITTCODComment(){
				
				    return "";
				
				}
				public String ITTCODPattern(){
				
					return "";
				
				}
				public String ITTCODOriginalDbColumnName(){
				
					return "ITTCOD";
				
				}

				
			    public String ITTRAT;

				public String getITTRAT () {
					return this.ITTRAT;
				}

				public Boolean ITTRATIsNullable(){
				    return true;
				}
				public Boolean ITTRATIsKey(){
				    return false;
				}
				public Integer ITTRATLength(){
				    return 16777216;
				}
				public Integer ITTRATPrecision(){
				    return null;
				}
				public String ITTRATDefault(){
				
					return null;
				
				}
				public String ITTRATComment(){
				
				    return "";
				
				}
				public String ITTRATPattern(){
				
					return "";
				
				}
				public String ITTRATOriginalDbColumnName(){
				
					return "ITTRAT";
				
				}

				
			    public String ITTVAT;

				public String getITTVAT () {
					return this.ITTVAT;
				}

				public Boolean ITTVATIsNullable(){
				    return true;
				}
				public Boolean ITTVATIsKey(){
				    return false;
				}
				public Integer ITTVATLength(){
				    return 16777216;
				}
				public Integer ITTVATPrecision(){
				    return null;
				}
				public String ITTVATDefault(){
				
					return null;
				
				}
				public String ITTVATComment(){
				
				    return "";
				
				}
				public String ITTVATPattern(){
				
					return "";
				
				}
				public String ITTVATOriginalDbColumnName(){
				
					return "ITTVAT";
				
				}

				
			    public String ITTCVT;

				public String getITTCVT () {
					return this.ITTCVT;
				}

				public Boolean ITTCVTIsNullable(){
				    return true;
				}
				public Boolean ITTCVTIsKey(){
				    return false;
				}
				public Integer ITTCVTLength(){
				    return 16777216;
				}
				public Integer ITTCVTPrecision(){
				    return null;
				}
				public String ITTCVTDefault(){
				
					return null;
				
				}
				public String ITTCVTComment(){
				
				    return "";
				
				}
				public String ITTCVTPattern(){
				
					return "";
				
				}
				public String ITTCVTOriginalDbColumnName(){
				
					return "ITTCVT";
				
				}

				
			    public String ITTMD;

				public String getITTMD () {
					return this.ITTMD;
				}

				public Boolean ITTMDIsNullable(){
				    return true;
				}
				public Boolean ITTMDIsKey(){
				    return false;
				}
				public Integer ITTMDLength(){
				    return 16777216;
				}
				public Integer ITTMDPrecision(){
				    return null;
				}
				public String ITTMDDefault(){
				
					return null;
				
				}
				public String ITTMDComment(){
				
				    return "";
				
				}
				public String ITTMDPattern(){
				
					return "";
				
				}
				public String ITTMDOriginalDbColumnName(){
				
					return "ITTMD";
				
				}

				
			    public String ITTID;

				public String getITTID () {
					return this.ITTID;
				}

				public Boolean ITTIDIsNullable(){
				    return true;
				}
				public Boolean ITTIDIsKey(){
				    return false;
				}
				public Integer ITTIDLength(){
				    return 16777216;
				}
				public Integer ITTIDPrecision(){
				    return null;
				}
				public String ITTIDDefault(){
				
					return null;
				
				}
				public String ITTIDComment(){
				
				    return "";
				
				}
				public String ITTIDPattern(){
				
					return "";
				
				}
				public String ITTIDOriginalDbColumnName(){
				
					return "ITTID";
				
				}

				
			    public String ITTPRO;

				public String getITTPRO () {
					return this.ITTPRO;
				}

				public Boolean ITTPROIsNullable(){
				    return true;
				}
				public Boolean ITTPROIsKey(){
				    return false;
				}
				public Integer ITTPROLength(){
				    return 16777216;
				}
				public Integer ITTPROPrecision(){
				    return null;
				}
				public String ITTPRODefault(){
				
					return null;
				
				}
				public String ITTPROComment(){
				
				    return "";
				
				}
				public String ITTPROPattern(){
				
					return "";
				
				}
				public String ITTPROOriginalDbColumnName(){
				
					return "ITTPRO";
				
				}

				
			    public String ITRACN;

				public String getITRACN () {
					return this.ITRACN;
				}

				public Boolean ITRACNIsNullable(){
				    return true;
				}
				public Boolean ITRACNIsKey(){
				    return false;
				}
				public Integer ITRACNLength(){
				    return 16777216;
				}
				public Integer ITRACNPrecision(){
				    return null;
				}
				public String ITRACNDefault(){
				
					return null;
				
				}
				public String ITRACNComment(){
				
				    return "";
				
				}
				public String ITRACNPattern(){
				
					return "";
				
				}
				public String ITRACNOriginalDbColumnName(){
				
					return "ITRACN";
				
				}

				
			    public String ITRADT;

				public String getITRADT () {
					return this.ITRADT;
				}

				public Boolean ITRADTIsNullable(){
				    return true;
				}
				public Boolean ITRADTIsKey(){
				    return false;
				}
				public Integer ITRADTLength(){
				    return 16777216;
				}
				public Integer ITRADTPrecision(){
				    return null;
				}
				public String ITRADTDefault(){
				
					return null;
				
				}
				public String ITRADTComment(){
				
				    return "";
				
				}
				public String ITRADTPattern(){
				
					return "";
				
				}
				public String ITRADTOriginalDbColumnName(){
				
					return "ITRADT";
				
				}

				
			    public String ITRREF;

				public String getITRREF () {
					return this.ITRREF;
				}

				public Boolean ITRREFIsNullable(){
				    return true;
				}
				public Boolean ITRREFIsKey(){
				    return false;
				}
				public Integer ITRREFLength(){
				    return 16777216;
				}
				public Integer ITRREFPrecision(){
				    return null;
				}
				public String ITRREFDefault(){
				
					return null;
				
				}
				public String ITRREFComment(){
				
				    return "";
				
				}
				public String ITRREFPattern(){
				
					return "";
				
				}
				public String ITRREFOriginalDbColumnName(){
				
					return "ITRREF";
				
				}

				
			    public String PGMNAM;

				public String getPGMNAM () {
					return this.PGMNAM;
				}

				public Boolean PGMNAMIsNullable(){
				    return true;
				}
				public Boolean PGMNAMIsKey(){
				    return false;
				}
				public Integer PGMNAMLength(){
				    return 16777216;
				}
				public Integer PGMNAMPrecision(){
				    return null;
				}
				public String PGMNAMDefault(){
				
					return null;
				
				}
				public String PGMNAMComment(){
				
				    return "";
				
				}
				public String PGMNAMPattern(){
				
					return "";
				
				}
				public String PGMNAMOriginalDbColumnName(){
				
					return "PGMNAM";
				
				}

				
			    public String LGUSER;

				public String getLGUSER () {
					return this.LGUSER;
				}

				public Boolean LGUSERIsNullable(){
				    return true;
				}
				public Boolean LGUSERIsKey(){
				    return false;
				}
				public Integer LGUSERLength(){
				    return 16777216;
				}
				public Integer LGUSERPrecision(){
				    return null;
				}
				public String LGUSERDefault(){
				
					return null;
				
				}
				public String LGUSERComment(){
				
				    return "";
				
				}
				public String LGUSERPattern(){
				
					return "";
				
				}
				public String LGUSEROriginalDbColumnName(){
				
					return "LGUSER";
				
				}

				
			    public String CSCSH;

				public String getCSCSH () {
					return this.CSCSH;
				}

				public Boolean CSCSHIsNullable(){
				    return true;
				}
				public Boolean CSCSHIsKey(){
				    return false;
				}
				public Integer CSCSHLength(){
				    return 16777216;
				}
				public Integer CSCSHPrecision(){
				    return null;
				}
				public String CSCSHDefault(){
				
					return null;
				
				}
				public String CSCSHComment(){
				
				    return "";
				
				}
				public String CSCSHPattern(){
				
					return "";
				
				}
				public String CSCSHOriginalDbColumnName(){
				
					return "CSCSH";
				
				}

				
			    public String CSRSTP;

				public String getCSRSTP () {
					return this.CSRSTP;
				}

				public Boolean CSRSTPIsNullable(){
				    return true;
				}
				public Boolean CSRSTPIsKey(){
				    return false;
				}
				public Integer CSRSTPLength(){
				    return 16777216;
				}
				public Integer CSRSTPPrecision(){
				    return null;
				}
				public String CSRSTPDefault(){
				
					return null;
				
				}
				public String CSRSTPComment(){
				
				    return "";
				
				}
				public String CSRSTPPattern(){
				
					return "";
				
				}
				public String CSRSTPOriginalDbColumnName(){
				
					return "CSRSTP";
				
				}

				
			    public String CSDRSN;

				public String getCSDRSN () {
					return this.CSDRSN;
				}

				public Boolean CSDRSNIsNullable(){
				    return true;
				}
				public Boolean CSDRSNIsKey(){
				    return false;
				}
				public Integer CSDRSNLength(){
				    return 16777216;
				}
				public Integer CSDRSNPrecision(){
				    return null;
				}
				public String CSDRSNDefault(){
				
					return null;
				
				}
				public String CSDRSNComment(){
				
				    return "";
				
				}
				public String CSDRSNPattern(){
				
					return "";
				
				}
				public String CSDRSNOriginalDbColumnName(){
				
					return "CSDRSN";
				
				}

				
			    public String ITGLBN;

				public String getITGLBN () {
					return this.ITGLBN;
				}

				public Boolean ITGLBNIsNullable(){
				    return true;
				}
				public Boolean ITGLBNIsKey(){
				    return false;
				}
				public Integer ITGLBNLength(){
				    return 16777216;
				}
				public Integer ITGLBNPrecision(){
				    return null;
				}
				public String ITGLBNDefault(){
				
					return null;
				
				}
				public String ITGLBNComment(){
				
				    return "";
				
				}
				public String ITGLBNPattern(){
				
					return "";
				
				}
				public String ITGLBNOriginalDbColumnName(){
				
					return "ITGLBN";
				
				}

				
			    public String ITPCEN;

				public String getITPCEN () {
					return this.ITPCEN;
				}

				public Boolean ITPCENIsNullable(){
				    return true;
				}
				public Boolean ITPCENIsKey(){
				    return false;
				}
				public Integer ITPCENLength(){
				    return 16777216;
				}
				public Integer ITPCENPrecision(){
				    return null;
				}
				public String ITPCENDefault(){
				
					return null;
				
				}
				public String ITPCENComment(){
				
				    return "";
				
				}
				public String ITPCENPattern(){
				
					return "";
				
				}
				public String ITPCENOriginalDbColumnName(){
				
					return "ITPCEN";
				
				}

				
			    public String ITPDTE;

				public String getITPDTE () {
					return this.ITPDTE;
				}

				public Boolean ITPDTEIsNullable(){
				    return true;
				}
				public Boolean ITPDTEIsKey(){
				    return false;
				}
				public Integer ITPDTELength(){
				    return 16777216;
				}
				public Integer ITPDTEPrecision(){
				    return null;
				}
				public String ITPDTEDefault(){
				
					return null;
				
				}
				public String ITPDTEComment(){
				
				    return "";
				
				}
				public String ITPDTEPattern(){
				
					return "";
				
				}
				public String ITPDTEOriginalDbColumnName(){
				
					return "ITPDTE";
				
				}

				
			    public String ITRSCN;

				public String getITRSCN () {
					return this.ITRSCN;
				}

				public Boolean ITRSCNIsNullable(){
				    return true;
				}
				public Boolean ITRSCNIsKey(){
				    return false;
				}
				public Integer ITRSCNLength(){
				    return 16777216;
				}
				public Integer ITRSCNPrecision(){
				    return null;
				}
				public String ITRSCNDefault(){
				
					return null;
				
				}
				public String ITRSCNComment(){
				
				    return "";
				
				}
				public String ITRSCNPattern(){
				
					return "";
				
				}
				public String ITRSCNOriginalDbColumnName(){
				
					return "ITRSCN";
				
				}

				
			    public String ITRSDT;

				public String getITRSDT () {
					return this.ITRSDT;
				}

				public Boolean ITRSDTIsNullable(){
				    return true;
				}
				public Boolean ITRSDTIsKey(){
				    return false;
				}
				public Integer ITRSDTLength(){
				    return 16777216;
				}
				public Integer ITRSDTPrecision(){
				    return null;
				}
				public String ITRSDTDefault(){
				
					return null;
				
				}
				public String ITRSDTComment(){
				
				    return "";
				
				}
				public String ITRSDTPattern(){
				
					return "";
				
				}
				public String ITRSDTOriginalDbColumnName(){
				
					return "ITRSDT";
				
				}

				
			    public String ITRSTM;

				public String getITRSTM () {
					return this.ITRSTM;
				}

				public Boolean ITRSTMIsNullable(){
				    return true;
				}
				public Boolean ITRSTMIsKey(){
				    return false;
				}
				public Integer ITRSTMLength(){
				    return 16777216;
				}
				public Integer ITRSTMPrecision(){
				    return null;
				}
				public String ITRSTMDefault(){
				
					return null;
				
				}
				public String ITRSTMComment(){
				
				    return "";
				
				}
				public String ITRSTMPattern(){
				
					return "";
				
				}
				public String ITRSTMOriginalDbColumnName(){
				
					return "ITRSTM";
				
				}

				
			    public String ITRLOH;

				public String getITRLOH () {
					return this.ITRLOH;
				}

				public Boolean ITRLOHIsNullable(){
				    return true;
				}
				public Boolean ITRLOHIsKey(){
				    return false;
				}
				public Integer ITRLOHLength(){
				    return 16777216;
				}
				public Integer ITRLOHPrecision(){
				    return null;
				}
				public String ITRLOHDefault(){
				
					return null;
				
				}
				public String ITRLOHComment(){
				
				    return "";
				
				}
				public String ITRLOHPattern(){
				
					return "";
				
				}
				public String ITRLOHOriginalDbColumnName(){
				
					return "ITRLOH";
				
				}

				
			    public String ITRLAC;

				public String getITRLAC () {
					return this.ITRLAC;
				}

				public Boolean ITRLACIsNullable(){
				    return true;
				}
				public Boolean ITRLACIsKey(){
				    return false;
				}
				public Integer ITRLACLength(){
				    return 16777216;
				}
				public Integer ITRLACPrecision(){
				    return null;
				}
				public String ITRLACDefault(){
				
					return null;
				
				}
				public String ITRLACComment(){
				
				    return "";
				
				}
				public String ITRLACPattern(){
				
					return "";
				
				}
				public String ITRLACOriginalDbColumnName(){
				
					return "ITRLAC";
				
				}

				
			    public String ITRLLC;

				public String getITRLLC () {
					return this.ITRLLC;
				}

				public Boolean ITRLLCIsNullable(){
				    return true;
				}
				public Boolean ITRLLCIsKey(){
				    return false;
				}
				public Integer ITRLLCLength(){
				    return 16777216;
				}
				public Integer ITRLLCPrecision(){
				    return null;
				}
				public String ITRLLCDefault(){
				
					return null;
				
				}
				public String ITRLLCComment(){
				
				    return "";
				
				}
				public String ITRLLCPattern(){
				
					return "";
				
				}
				public String ITRLLCOriginalDbColumnName(){
				
					return "ITRLLC";
				
				}

				
			    public String ITRCOH;

				public String getITRCOH () {
					return this.ITRCOH;
				}

				public Boolean ITRCOHIsNullable(){
				    return true;
				}
				public Boolean ITRCOHIsKey(){
				    return false;
				}
				public Integer ITRCOHLength(){
				    return 16777216;
				}
				public Integer ITRCOHPrecision(){
				    return null;
				}
				public String ITRCOHDefault(){
				
					return null;
				
				}
				public String ITRCOHComment(){
				
				    return "";
				
				}
				public String ITRCOHPattern(){
				
					return "";
				
				}
				public String ITRCOHOriginalDbColumnName(){
				
					return "ITRCOH";
				
				}

				
			    public String ITRCAC;

				public String getITRCAC () {
					return this.ITRCAC;
				}

				public Boolean ITRCACIsNullable(){
				    return true;
				}
				public Boolean ITRCACIsKey(){
				    return false;
				}
				public Integer ITRCACLength(){
				    return 16777216;
				}
				public Integer ITRCACPrecision(){
				    return null;
				}
				public String ITRCACDefault(){
				
					return null;
				
				}
				public String ITRCACComment(){
				
				    return "";
				
				}
				public String ITRCACPattern(){
				
					return "";
				
				}
				public String ITRCACOriginalDbColumnName(){
				
					return "ITRCAC";
				
				}

				
			    public String ITRCLC;

				public String getITRCLC () {
					return this.ITRCLC;
				}

				public Boolean ITRCLCIsNullable(){
				    return true;
				}
				public Boolean ITRCLCIsKey(){
				    return false;
				}
				public Integer ITRCLCLength(){
				    return 16777216;
				}
				public Integer ITRCLCPrecision(){
				    return null;
				}
				public String ITRCLCDefault(){
				
					return null;
				
				}
				public String ITRCLCComment(){
				
				    return "";
				
				}
				public String ITRCLCPattern(){
				
					return "";
				
				}
				public String ITRCLCOriginalDbColumnName(){
				
					return "ITRCLC";
				
				}

				
			    public String ITRDSC;

				public String getITRDSC () {
					return this.ITRDSC;
				}

				public Boolean ITRDSCIsNullable(){
				    return true;
				}
				public Boolean ITRDSCIsKey(){
				    return false;
				}
				public Integer ITRDSCLength(){
				    return 16777216;
				}
				public Integer ITRDSCPrecision(){
				    return null;
				}
				public String ITRDSCDefault(){
				
					return null;
				
				}
				public String ITRDSCComment(){
				
				    return "";
				
				}
				public String ITRDSCPattern(){
				
					return "";
				
				}
				public String ITRDSCOriginalDbColumnName(){
				
					return "ITRDSC";
				
				}

				
			    public String ITCHAN;

				public String getITCHAN () {
					return this.ITCHAN;
				}

				public Boolean ITCHANIsNullable(){
				    return true;
				}
				public Boolean ITCHANIsKey(){
				    return false;
				}
				public Integer ITCHANLength(){
				    return 16777216;
				}
				public Integer ITCHANPrecision(){
				    return null;
				}
				public String ITCHANDefault(){
				
					return null;
				
				}
				public String ITCHANComment(){
				
				    return "";
				
				}
				public String ITCHANPattern(){
				
					return "";
				
				}
				public String ITCHANOriginalDbColumnName(){
				
					return "ITCHAN";
				
				}

				
			    public String ITSLRC;

				public String getITSLRC () {
					return this.ITSLRC;
				}

				public Boolean ITSLRCIsNullable(){
				    return true;
				}
				public Boolean ITSLRCIsKey(){
				    return false;
				}
				public Integer ITSLRCLength(){
				    return 16777216;
				}
				public Integer ITSLRCPrecision(){
				    return null;
				}
				public String ITSLRCDefault(){
				
					return null;
				
				}
				public String ITSLRCComment(){
				
				    return "";
				
				}
				public String ITSLRCPattern(){
				
					return "";
				
				}
				public String ITSLRCOriginalDbColumnName(){
				
					return "ITSLRC";
				
				}

				
			    public String ITOHNO;

				public String getITOHNO () {
					return this.ITOHNO;
				}

				public Boolean ITOHNOIsNullable(){
				    return true;
				}
				public Boolean ITOHNOIsKey(){
				    return false;
				}
				public Integer ITOHNOLength(){
				    return 16777216;
				}
				public Integer ITOHNOPrecision(){
				    return null;
				}
				public String ITOHNODefault(){
				
					return null;
				
				}
				public String ITOHNOComment(){
				
				    return "";
				
				}
				public String ITOHNOPattern(){
				
					return "";
				
				}
				public String ITOHNOOriginalDbColumnName(){
				
					return "ITOHNO";
				
				}

				
			    public String ITTPCD;

				public String getITTPCD () {
					return this.ITTPCD;
				}

				public Boolean ITTPCDIsNullable(){
				    return true;
				}
				public Boolean ITTPCDIsKey(){
				    return false;
				}
				public Integer ITTPCDLength(){
				    return 16777216;
				}
				public Integer ITTPCDPrecision(){
				    return null;
				}
				public String ITTPCDDefault(){
				
					return null;
				
				}
				public String ITTPCDComment(){
				
				    return "";
				
				}
				public String ITTPCDPattern(){
				
					return "";
				
				}
				public String ITTPCDOriginalDbColumnName(){
				
					return "ITTPCD";
				
				}

				
			    public String ITDPMT;

				public String getITDPMT () {
					return this.ITDPMT;
				}

				public Boolean ITDPMTIsNullable(){
				    return true;
				}
				public Boolean ITDPMTIsKey(){
				    return false;
				}
				public Integer ITDPMTLength(){
				    return 16777216;
				}
				public Integer ITDPMTPrecision(){
				    return null;
				}
				public String ITDPMTDefault(){
				
					return null;
				
				}
				public String ITDPMTComment(){
				
				    return "";
				
				}
				public String ITDPMTPattern(){
				
					return "";
				
				}
				public String ITDPMTOriginalDbColumnName(){
				
					return "ITDPMT";
				
				}

				
			    public String ITCATN;

				public String getITCATN () {
					return this.ITCATN;
				}

				public Boolean ITCATNIsNullable(){
				    return true;
				}
				public Boolean ITCATNIsKey(){
				    return false;
				}
				public Integer ITCATNLength(){
				    return 16777216;
				}
				public Integer ITCATNPrecision(){
				    return null;
				}
				public String ITCATNDefault(){
				
					return null;
				
				}
				public String ITCATNComment(){
				
				    return "";
				
				}
				public String ITCATNPattern(){
				
					return "";
				
				}
				public String ITCATNOriginalDbColumnName(){
				
					return "ITCATN";
				
				}

				
			    public String ITCATS;

				public String getITCATS () {
					return this.ITCATS;
				}

				public Boolean ITCATSIsNullable(){
				    return true;
				}
				public Boolean ITCATSIsKey(){
				    return false;
				}
				public Integer ITCATSLength(){
				    return 16777216;
				}
				public Integer ITCATSPrecision(){
				    return null;
				}
				public String ITCATSDefault(){
				
					return null;
				
				}
				public String ITCATSComment(){
				
				    return "";
				
				}
				public String ITCATSPattern(){
				
					return "";
				
				}
				public String ITCATSOriginalDbColumnName(){
				
					return "ITCATS";
				
				}

				
			    public String ITSPDI;

				public String getITSPDI () {
					return this.ITSPDI;
				}

				public Boolean ITSPDIIsNullable(){
				    return true;
				}
				public Boolean ITSPDIIsKey(){
				    return false;
				}
				public Integer ITSPDILength(){
				    return 16777216;
				}
				public Integer ITSPDIPrecision(){
				    return null;
				}
				public String ITSPDIDefault(){
				
					return null;
				
				}
				public String ITSPDIComment(){
				
				    return "";
				
				}
				public String ITSPDIPattern(){
				
					return "";
				
				}
				public String ITSPDIOriginalDbColumnName(){
				
					return "ITSPDI";
				
				}

				
			    public String ITCATP;

				public String getITCATP () {
					return this.ITCATP;
				}

				public Boolean ITCATPIsNullable(){
				    return true;
				}
				public Boolean ITCATPIsKey(){
				    return false;
				}
				public Integer ITCATPLength(){
				    return 16777216;
				}
				public Integer ITCATPPrecision(){
				    return null;
				}
				public String ITCATPDefault(){
				
					return null;
				
				}
				public String ITCATPComment(){
				
				    return "";
				
				}
				public String ITCATPPattern(){
				
					return "";
				
				}
				public String ITCATPOriginalDbColumnName(){
				
					return "ITCATP";
				
				}

				
			    public String ITUSID;

				public String getITUSID () {
					return this.ITUSID;
				}

				public Boolean ITUSIDIsNullable(){
				    return true;
				}
				public Boolean ITUSIDIsKey(){
				    return false;
				}
				public Integer ITUSIDLength(){
				    return 16777216;
				}
				public Integer ITUSIDPrecision(){
				    return null;
				}
				public String ITUSIDDefault(){
				
					return null;
				
				}
				public String ITUSIDComment(){
				
				    return "";
				
				}
				public String ITUSIDPattern(){
				
					return "";
				
				}
				public String ITUSIDOriginalDbColumnName(){
				
					return "ITUSID";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
					this.ITRLOC = readString(dis);
					
					this.ITRCEN = readString(dis);
					
					this.ITRDAT = readString(dis);
					
					this.ITRTYP = readString(dis);
					
					this.INUMBR = readString(dis);
					
					this.ITRQTY = readString(dis);
					
					this.ITRRET = readString(dis);
					
					this.ITRCST = readString(dis);
					
					this.ITREXT = readString(dis);
					
					this.ITRVAT = readString(dis);
					
					this.ITCVAT = readString(dis);
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
					this.ITRREG = readString(dis);
					
					this.ITRPOS = readString(dis);
					
					this.ITREVT = readString(dis);
					
					this.ITRPRE = readString(dis);
					
					this.ITRACF = readString(dis);
					
					this.IDEPT = readString(dis);
					
					this.ISDEPT = readString(dis);
					
					this.ICLAS = readString(dis);
					
					this.ISCLAS = readString(dis);
					
					this.ITRPOV = readString(dis);
					
					this.ITRVND = readString(dis);
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
					this.ITRSET = readString(dis);
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
					this.ITTRET = readString(dis);
					
					this.ITTCST = readString(dis);
					
					this.ITTREG = readString(dis);
					
					this.ITTPOS = readString(dis);
					
					this.ITTCOD = readString(dis);
					
					this.ITTRAT = readString(dis);
					
					this.ITTVAT = readString(dis);
					
					this.ITTCVT = readString(dis);
					
					this.ITTMD = readString(dis);
					
					this.ITTID = readString(dis);
					
					this.ITTPRO = readString(dis);
					
					this.ITRACN = readString(dis);
					
					this.ITRADT = readString(dis);
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
					this.CSCSH = readString(dis);
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
					this.ITPCEN = readString(dis);
					
					this.ITPDTE = readString(dis);
					
					this.ITRSCN = readString(dis);
					
					this.ITRSDT = readString(dis);
					
					this.ITRSTM = readString(dis);
					
					this.ITRLOH = readString(dis);
					
					this.ITRLAC = readString(dis);
					
					this.ITRLLC = readString(dis);
					
					this.ITRCOH = readString(dis);
					
					this.ITRCAC = readString(dis);
					
					this.ITRCLC = readString(dis);
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
					this.ITOHNO = readString(dis);
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
					this.ITCATP = readString(dis);
					
					this.ITUSID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
					this.ITRLOC = readString(dis);
					
					this.ITRCEN = readString(dis);
					
					this.ITRDAT = readString(dis);
					
					this.ITRTYP = readString(dis);
					
					this.INUMBR = readString(dis);
					
					this.ITRQTY = readString(dis);
					
					this.ITRRET = readString(dis);
					
					this.ITRCST = readString(dis);
					
					this.ITREXT = readString(dis);
					
					this.ITRVAT = readString(dis);
					
					this.ITCVAT = readString(dis);
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
					this.ITRREG = readString(dis);
					
					this.ITRPOS = readString(dis);
					
					this.ITREVT = readString(dis);
					
					this.ITRPRE = readString(dis);
					
					this.ITRACF = readString(dis);
					
					this.IDEPT = readString(dis);
					
					this.ISDEPT = readString(dis);
					
					this.ICLAS = readString(dis);
					
					this.ISCLAS = readString(dis);
					
					this.ITRPOV = readString(dis);
					
					this.ITRVND = readString(dis);
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
					this.ITRSET = readString(dis);
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
					this.ITTRET = readString(dis);
					
					this.ITTCST = readString(dis);
					
					this.ITTREG = readString(dis);
					
					this.ITTPOS = readString(dis);
					
					this.ITTCOD = readString(dis);
					
					this.ITTRAT = readString(dis);
					
					this.ITTVAT = readString(dis);
					
					this.ITTCVT = readString(dis);
					
					this.ITTMD = readString(dis);
					
					this.ITTID = readString(dis);
					
					this.ITTPRO = readString(dis);
					
					this.ITRACN = readString(dis);
					
					this.ITRADT = readString(dis);
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
					this.CSCSH = readString(dis);
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
					this.ITPCEN = readString(dis);
					
					this.ITPDTE = readString(dis);
					
					this.ITRSCN = readString(dis);
					
					this.ITRSDT = readString(dis);
					
					this.ITRSTM = readString(dis);
					
					this.ITRLOH = readString(dis);
					
					this.ITRLAC = readString(dis);
					
					this.ITRLLC = readString(dis);
					
					this.ITRCOH = readString(dis);
					
					this.ITRCAC = readString(dis);
					
					this.ITRCLC = readString(dis);
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
					this.ITOHNO = readString(dis);
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
					this.ITCATP = readString(dis);
					
					this.ITUSID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// String
				
						writeString(this.ITRLOC,dos);
					
					// String
				
						writeString(this.ITRCEN,dos);
					
					// String
				
						writeString(this.ITRDAT,dos);
					
					// String
				
						writeString(this.ITRTYP,dos);
					
					// String
				
						writeString(this.INUMBR,dos);
					
					// String
				
						writeString(this.ITRQTY,dos);
					
					// String
				
						writeString(this.ITRRET,dos);
					
					// String
				
						writeString(this.ITRCST,dos);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// String
				
						writeString(this.ITRVAT,dos);
					
					// String
				
						writeString(this.ITCVAT,dos);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// String
				
						writeString(this.ITRREG,dos);
					
					// String
				
						writeString(this.ITRPOS,dos);
					
					// String
				
						writeString(this.ITREVT,dos);
					
					// String
				
						writeString(this.ITRPRE,dos);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// String
				
						writeString(this.IDEPT,dos);
					
					// String
				
						writeString(this.ISDEPT,dos);
					
					// String
				
						writeString(this.ICLAS,dos);
					
					// String
				
						writeString(this.ISCLAS,dos);
					
					// String
				
						writeString(this.ITRPOV,dos);
					
					// String
				
						writeString(this.ITRVND,dos);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// String
				
						writeString(this.ITRSET,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// String
				
						writeString(this.ITTRET,dos);
					
					// String
				
						writeString(this.ITTCST,dos);
					
					// String
				
						writeString(this.ITTREG,dos);
					
					// String
				
						writeString(this.ITTPOS,dos);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// String
				
						writeString(this.ITTRAT,dos);
					
					// String
				
						writeString(this.ITTVAT,dos);
					
					// String
				
						writeString(this.ITTCVT,dos);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// String
				
						writeString(this.ITTID,dos);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// String
				
						writeString(this.ITRACN,dos);
					
					// String
				
						writeString(this.ITRADT,dos);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// String
				
						writeString(this.CSCSH,dos);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// String
				
						writeString(this.ITPCEN,dos);
					
					// String
				
						writeString(this.ITPDTE,dos);
					
					// String
				
						writeString(this.ITRSCN,dos);
					
					// String
				
						writeString(this.ITRSDT,dos);
					
					// String
				
						writeString(this.ITRSTM,dos);
					
					// String
				
						writeString(this.ITRLOH,dos);
					
					// String
				
						writeString(this.ITRLAC,dos);
					
					// String
				
						writeString(this.ITRLLC,dos);
					
					// String
				
						writeString(this.ITRCOH,dos);
					
					// String
				
						writeString(this.ITRCAC,dos);
					
					// String
				
						writeString(this.ITRCLC,dos);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// String
				
						writeString(this.ITOHNO,dos);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// String
				
						writeString(this.ITCATP,dos);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// String
				
						writeString(this.ITRLOC,dos);
					
					// String
				
						writeString(this.ITRCEN,dos);
					
					// String
				
						writeString(this.ITRDAT,dos);
					
					// String
				
						writeString(this.ITRTYP,dos);
					
					// String
				
						writeString(this.INUMBR,dos);
					
					// String
				
						writeString(this.ITRQTY,dos);
					
					// String
				
						writeString(this.ITRRET,dos);
					
					// String
				
						writeString(this.ITRCST,dos);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// String
				
						writeString(this.ITRVAT,dos);
					
					// String
				
						writeString(this.ITCVAT,dos);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// String
				
						writeString(this.ITRREG,dos);
					
					// String
				
						writeString(this.ITRPOS,dos);
					
					// String
				
						writeString(this.ITREVT,dos);
					
					// String
				
						writeString(this.ITRPRE,dos);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// String
				
						writeString(this.IDEPT,dos);
					
					// String
				
						writeString(this.ISDEPT,dos);
					
					// String
				
						writeString(this.ICLAS,dos);
					
					// String
				
						writeString(this.ISCLAS,dos);
					
					// String
				
						writeString(this.ITRPOV,dos);
					
					// String
				
						writeString(this.ITRVND,dos);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// String
				
						writeString(this.ITRSET,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// String
				
						writeString(this.ITTRET,dos);
					
					// String
				
						writeString(this.ITTCST,dos);
					
					// String
				
						writeString(this.ITTREG,dos);
					
					// String
				
						writeString(this.ITTPOS,dos);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// String
				
						writeString(this.ITTRAT,dos);
					
					// String
				
						writeString(this.ITTVAT,dos);
					
					// String
				
						writeString(this.ITTCVT,dos);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// String
				
						writeString(this.ITTID,dos);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// String
				
						writeString(this.ITRACN,dos);
					
					// String
				
						writeString(this.ITRADT,dos);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// String
				
						writeString(this.CSCSH,dos);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// String
				
						writeString(this.ITPCEN,dos);
					
					// String
				
						writeString(this.ITPDTE,dos);
					
					// String
				
						writeString(this.ITRSCN,dos);
					
					// String
				
						writeString(this.ITRSDT,dos);
					
					// String
				
						writeString(this.ITRSTM,dos);
					
					// String
				
						writeString(this.ITRLOH,dos);
					
					// String
				
						writeString(this.ITRLAC,dos);
					
					// String
				
						writeString(this.ITRLLC,dos);
					
					// String
				
						writeString(this.ITRCOH,dos);
					
					// String
				
						writeString(this.ITRCAC,dos);
					
					// String
				
						writeString(this.ITRCLC,dos);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// String
				
						writeString(this.ITOHNO,dos);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// String
				
						writeString(this.ITCATP,dos);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITFLAG="+ITFLAG);
		sb.append(",ITHCOD="+ITHCOD);
		sb.append(",ITRLTP="+ITRLTP);
		sb.append(",ITRLOC="+ITRLOC);
		sb.append(",ITRCEN="+ITRCEN);
		sb.append(",ITRDAT="+ITRDAT);
		sb.append(",ITRTYP="+ITRTYP);
		sb.append(",INUMBR="+INUMBR);
		sb.append(",ITRQTY="+ITRQTY);
		sb.append(",ITRRET="+ITRRET);
		sb.append(",ITRCST="+ITRCST);
		sb.append(",ITREXT="+ITREXT);
		sb.append(",ITRVAT="+ITRVAT);
		sb.append(",ITCVAT="+ITCVAT);
		sb.append(",ITVCLC="+ITVCLC);
		sb.append(",ITRCUS="+ITRCUS);
		sb.append(",ITTPTP="+ITTPTP);
		sb.append(",ITRREG="+ITRREG);
		sb.append(",ITRPOS="+ITRPOS);
		sb.append(",ITREVT="+ITREVT);
		sb.append(",ITRPRE="+ITRPRE);
		sb.append(",ITRACF="+ITRACF);
		sb.append(",IDEPT="+IDEPT);
		sb.append(",ISDEPT="+ISDEPT);
		sb.append(",ICLAS="+ICLAS);
		sb.append(",ISCLAS="+ISCLAS);
		sb.append(",ITRPOV="+ITRPOV);
		sb.append(",ITRVND="+ITRVND);
		sb.append(",ITRSTY="+ITRSTY);
		sb.append(",ITRSEA="+ITRSEA);
		sb.append(",ITRSET="+ITRSET);
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ITRPST="+ITRPST);
		sb.append(",ITRHOT="+ITRHOT);
		sb.append(",ITTRET="+ITTRET);
		sb.append(",ITTCST="+ITTCST);
		sb.append(",ITTREG="+ITTREG);
		sb.append(",ITTPOS="+ITTPOS);
		sb.append(",ITTCOD="+ITTCOD);
		sb.append(",ITTRAT="+ITTRAT);
		sb.append(",ITTVAT="+ITTVAT);
		sb.append(",ITTCVT="+ITTCVT);
		sb.append(",ITTMD="+ITTMD);
		sb.append(",ITTID="+ITTID);
		sb.append(",ITTPRO="+ITTPRO);
		sb.append(",ITRACN="+ITRACN);
		sb.append(",ITRADT="+ITRADT);
		sb.append(",ITRREF="+ITRREF);
		sb.append(",PGMNAM="+PGMNAM);
		sb.append(",LGUSER="+LGUSER);
		sb.append(",CSCSH="+CSCSH);
		sb.append(",CSRSTP="+CSRSTP);
		sb.append(",CSDRSN="+CSDRSN);
		sb.append(",ITGLBN="+ITGLBN);
		sb.append(",ITPCEN="+ITPCEN);
		sb.append(",ITPDTE="+ITPDTE);
		sb.append(",ITRSCN="+ITRSCN);
		sb.append(",ITRSDT="+ITRSDT);
		sb.append(",ITRSTM="+ITRSTM);
		sb.append(",ITRLOH="+ITRLOH);
		sb.append(",ITRLAC="+ITRLAC);
		sb.append(",ITRLLC="+ITRLLC);
		sb.append(",ITRCOH="+ITRCOH);
		sb.append(",ITRCAC="+ITRCAC);
		sb.append(",ITRCLC="+ITRCLC);
		sb.append(",ITRDSC="+ITRDSC);
		sb.append(",ITCHAN="+ITCHAN);
		sb.append(",ITSLRC="+ITSLRC);
		sb.append(",ITOHNO="+ITOHNO);
		sb.append(",ITTPCD="+ITTPCD);
		sb.append(",ITDPMT="+ITDPMT);
		sb.append(",ITCATN="+ITCATN);
		sb.append(",ITCATS="+ITCATS);
		sb.append(",ITSPDI="+ITSPDI);
		sb.append(",ITCATP="+ITCATP);
		sb.append(",ITUSID="+ITUSID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITFLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITFLAG);
            			}
            		
        			sb.append("|");
        		
        				if(ITHCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITHCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRTYP);
            			}
            		
        			sb.append("|");
        		
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				if(ITRQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRQTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITREXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREXT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITVCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITVCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCUS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITREVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPRE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPRE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACF);
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
        		
        				if(ITRPOV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOV);
            			}
            		
        			sb.append("|");
        		
        				if(ITRVND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRVND);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSEA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSEA);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSET);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPST);
            			}
            		
        			sb.append("|");
        		
        				if(ITRHOT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRHOT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITTREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTMD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTID);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPRO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPRO);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRADT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRADT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREF);
            			}
            		
        			sb.append("|");
        		
        				if(PGMNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PGMNAM);
            			}
            		
        			sb.append("|");
        		
        				if(LGUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LGUSER);
            			}
            		
        			sb.append("|");
        		
        				if(CSCSH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSCSH);
            			}
            		
        			sb.append("|");
        		
        				if(CSRSTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSRSTP);
            			}
            		
        			sb.append("|");
        		
        				if(CSDRSN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSDRSN);
            			}
            		
        			sb.append("|");
        		
        				if(ITGLBN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITGLBN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPDTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPDTE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSCN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSDT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTM);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDSC);
            			}
            		
        			sb.append("|");
        		
        				if(ITCHAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCHAN);
            			}
            		
        			sb.append("|");
        		
        				if(ITSLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSLRC);
            			}
            		
        			sb.append("|");
        		
        				if(ITOHNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITOHNO);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPCD);
            			}
            		
        			sb.append("|");
        		
        				if(ITDPMT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITDPMT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATN);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATS);
            			}
            		
        			sb.append("|");
        		
        				if(ITSPDI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSPDI);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATP);
            			}
            		
        			sb.append("|");
        		
        				if(ITUSID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITUSID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(tmap_inaudStruct other) {

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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];

	
			    public String ITFLAG;

				public String getITFLAG () {
					return this.ITFLAG;
				}

				public Boolean ITFLAGIsNullable(){
				    return true;
				}
				public Boolean ITFLAGIsKey(){
				    return false;
				}
				public Integer ITFLAGLength(){
				    return 16777216;
				}
				public Integer ITFLAGPrecision(){
				    return null;
				}
				public String ITFLAGDefault(){
				
					return null;
				
				}
				public String ITFLAGComment(){
				
				    return "";
				
				}
				public String ITFLAGPattern(){
				
					return "";
				
				}
				public String ITFLAGOriginalDbColumnName(){
				
					return "ITFLAG";
				
				}

				
			    public String ITHCOD;

				public String getITHCOD () {
					return this.ITHCOD;
				}

				public Boolean ITHCODIsNullable(){
				    return true;
				}
				public Boolean ITHCODIsKey(){
				    return false;
				}
				public Integer ITHCODLength(){
				    return 16777216;
				}
				public Integer ITHCODPrecision(){
				    return null;
				}
				public String ITHCODDefault(){
				
					return null;
				
				}
				public String ITHCODComment(){
				
				    return "";
				
				}
				public String ITHCODPattern(){
				
					return "";
				
				}
				public String ITHCODOriginalDbColumnName(){
				
					return "ITHCOD";
				
				}

				
			    public String ITRLTP;

				public String getITRLTP () {
					return this.ITRLTP;
				}

				public Boolean ITRLTPIsNullable(){
				    return true;
				}
				public Boolean ITRLTPIsKey(){
				    return false;
				}
				public Integer ITRLTPLength(){
				    return 16777216;
				}
				public Integer ITRLTPPrecision(){
				    return null;
				}
				public String ITRLTPDefault(){
				
					return null;
				
				}
				public String ITRLTPComment(){
				
				    return "";
				
				}
				public String ITRLTPPattern(){
				
					return "";
				
				}
				public String ITRLTPOriginalDbColumnName(){
				
					return "ITRLTP";
				
				}

				
			    public String ITRLOC;

				public String getITRLOC () {
					return this.ITRLOC;
				}

				public Boolean ITRLOCIsNullable(){
				    return true;
				}
				public Boolean ITRLOCIsKey(){
				    return false;
				}
				public Integer ITRLOCLength(){
				    return 16777216;
				}
				public Integer ITRLOCPrecision(){
				    return null;
				}
				public String ITRLOCDefault(){
				
					return null;
				
				}
				public String ITRLOCComment(){
				
				    return "";
				
				}
				public String ITRLOCPattern(){
				
					return "";
				
				}
				public String ITRLOCOriginalDbColumnName(){
				
					return "ITRLOC";
				
				}

				
			    public String ITRCEN;

				public String getITRCEN () {
					return this.ITRCEN;
				}

				public Boolean ITRCENIsNullable(){
				    return true;
				}
				public Boolean ITRCENIsKey(){
				    return false;
				}
				public Integer ITRCENLength(){
				    return 16777216;
				}
				public Integer ITRCENPrecision(){
				    return null;
				}
				public String ITRCENDefault(){
				
					return null;
				
				}
				public String ITRCENComment(){
				
				    return "";
				
				}
				public String ITRCENPattern(){
				
					return "";
				
				}
				public String ITRCENOriginalDbColumnName(){
				
					return "ITRCEN";
				
				}

				
			    public String ITRDAT;

				public String getITRDAT () {
					return this.ITRDAT;
				}

				public Boolean ITRDATIsNullable(){
				    return true;
				}
				public Boolean ITRDATIsKey(){
				    return false;
				}
				public Integer ITRDATLength(){
				    return 16777216;
				}
				public Integer ITRDATPrecision(){
				    return null;
				}
				public String ITRDATDefault(){
				
					return null;
				
				}
				public String ITRDATComment(){
				
				    return "";
				
				}
				public String ITRDATPattern(){
				
					return "";
				
				}
				public String ITRDATOriginalDbColumnName(){
				
					return "ITRDAT";
				
				}

				
			    public String ITRTYP;

				public String getITRTYP () {
					return this.ITRTYP;
				}

				public Boolean ITRTYPIsNullable(){
				    return true;
				}
				public Boolean ITRTYPIsKey(){
				    return false;
				}
				public Integer ITRTYPLength(){
				    return 16777216;
				}
				public Integer ITRTYPPrecision(){
				    return null;
				}
				public String ITRTYPDefault(){
				
					return null;
				
				}
				public String ITRTYPComment(){
				
				    return "";
				
				}
				public String ITRTYPPattern(){
				
					return "";
				
				}
				public String ITRTYPOriginalDbColumnName(){
				
					return "ITRTYP";
				
				}

				
			    public String INUMBR;

				public String getINUMBR () {
					return this.INUMBR;
				}

				public Boolean INUMBRIsNullable(){
				    return true;
				}
				public Boolean INUMBRIsKey(){
				    return false;
				}
				public Integer INUMBRLength(){
				    return 16777216;
				}
				public Integer INUMBRPrecision(){
				    return null;
				}
				public String INUMBRDefault(){
				
					return null;
				
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

				
			    public String ITRQTY;

				public String getITRQTY () {
					return this.ITRQTY;
				}

				public Boolean ITRQTYIsNullable(){
				    return true;
				}
				public Boolean ITRQTYIsKey(){
				    return false;
				}
				public Integer ITRQTYLength(){
				    return 16777216;
				}
				public Integer ITRQTYPrecision(){
				    return null;
				}
				public String ITRQTYDefault(){
				
					return null;
				
				}
				public String ITRQTYComment(){
				
				    return "";
				
				}
				public String ITRQTYPattern(){
				
					return "";
				
				}
				public String ITRQTYOriginalDbColumnName(){
				
					return "ITRQTY";
				
				}

				
			    public String ITRRET;

				public String getITRRET () {
					return this.ITRRET;
				}

				public Boolean ITRRETIsNullable(){
				    return true;
				}
				public Boolean ITRRETIsKey(){
				    return false;
				}
				public Integer ITRRETLength(){
				    return 16777216;
				}
				public Integer ITRRETPrecision(){
				    return null;
				}
				public String ITRRETDefault(){
				
					return null;
				
				}
				public String ITRRETComment(){
				
				    return "";
				
				}
				public String ITRRETPattern(){
				
					return "";
				
				}
				public String ITRRETOriginalDbColumnName(){
				
					return "ITRRET";
				
				}

				
			    public String ITRCST;

				public String getITRCST () {
					return this.ITRCST;
				}

				public Boolean ITRCSTIsNullable(){
				    return true;
				}
				public Boolean ITRCSTIsKey(){
				    return false;
				}
				public Integer ITRCSTLength(){
				    return 16777216;
				}
				public Integer ITRCSTPrecision(){
				    return null;
				}
				public String ITRCSTDefault(){
				
					return null;
				
				}
				public String ITRCSTComment(){
				
				    return "";
				
				}
				public String ITRCSTPattern(){
				
					return "";
				
				}
				public String ITRCSTOriginalDbColumnName(){
				
					return "ITRCST";
				
				}

				
			    public String ITREXT;

				public String getITREXT () {
					return this.ITREXT;
				}

				public Boolean ITREXTIsNullable(){
				    return true;
				}
				public Boolean ITREXTIsKey(){
				    return false;
				}
				public Integer ITREXTLength(){
				    return 16777216;
				}
				public Integer ITREXTPrecision(){
				    return null;
				}
				public String ITREXTDefault(){
				
					return null;
				
				}
				public String ITREXTComment(){
				
				    return "";
				
				}
				public String ITREXTPattern(){
				
					return "";
				
				}
				public String ITREXTOriginalDbColumnName(){
				
					return "ITREXT";
				
				}

				
			    public String ITRVAT;

				public String getITRVAT () {
					return this.ITRVAT;
				}

				public Boolean ITRVATIsNullable(){
				    return true;
				}
				public Boolean ITRVATIsKey(){
				    return false;
				}
				public Integer ITRVATLength(){
				    return 16777216;
				}
				public Integer ITRVATPrecision(){
				    return null;
				}
				public String ITRVATDefault(){
				
					return null;
				
				}
				public String ITRVATComment(){
				
				    return "";
				
				}
				public String ITRVATPattern(){
				
					return "";
				
				}
				public String ITRVATOriginalDbColumnName(){
				
					return "ITRVAT";
				
				}

				
			    public String ITCVAT;

				public String getITCVAT () {
					return this.ITCVAT;
				}

				public Boolean ITCVATIsNullable(){
				    return true;
				}
				public Boolean ITCVATIsKey(){
				    return false;
				}
				public Integer ITCVATLength(){
				    return 16777216;
				}
				public Integer ITCVATPrecision(){
				    return null;
				}
				public String ITCVATDefault(){
				
					return null;
				
				}
				public String ITCVATComment(){
				
				    return "";
				
				}
				public String ITCVATPattern(){
				
					return "";
				
				}
				public String ITCVATOriginalDbColumnName(){
				
					return "ITCVAT";
				
				}

				
			    public String ITVCLC;

				public String getITVCLC () {
					return this.ITVCLC;
				}

				public Boolean ITVCLCIsNullable(){
				    return true;
				}
				public Boolean ITVCLCIsKey(){
				    return false;
				}
				public Integer ITVCLCLength(){
				    return 16777216;
				}
				public Integer ITVCLCPrecision(){
				    return null;
				}
				public String ITVCLCDefault(){
				
					return null;
				
				}
				public String ITVCLCComment(){
				
				    return "";
				
				}
				public String ITVCLCPattern(){
				
					return "";
				
				}
				public String ITVCLCOriginalDbColumnName(){
				
					return "ITVCLC";
				
				}

				
			    public String ITRCUS;

				public String getITRCUS () {
					return this.ITRCUS;
				}

				public Boolean ITRCUSIsNullable(){
				    return true;
				}
				public Boolean ITRCUSIsKey(){
				    return false;
				}
				public Integer ITRCUSLength(){
				    return 16777216;
				}
				public Integer ITRCUSPrecision(){
				    return null;
				}
				public String ITRCUSDefault(){
				
					return null;
				
				}
				public String ITRCUSComment(){
				
				    return "";
				
				}
				public String ITRCUSPattern(){
				
					return "";
				
				}
				public String ITRCUSOriginalDbColumnName(){
				
					return "ITRCUS";
				
				}

				
			    public String ITTPTP;

				public String getITTPTP () {
					return this.ITTPTP;
				}

				public Boolean ITTPTPIsNullable(){
				    return true;
				}
				public Boolean ITTPTPIsKey(){
				    return false;
				}
				public Integer ITTPTPLength(){
				    return 16777216;
				}
				public Integer ITTPTPPrecision(){
				    return null;
				}
				public String ITTPTPDefault(){
				
					return null;
				
				}
				public String ITTPTPComment(){
				
				    return "";
				
				}
				public String ITTPTPPattern(){
				
					return "";
				
				}
				public String ITTPTPOriginalDbColumnName(){
				
					return "ITTPTP";
				
				}

				
			    public String ITRREG;

				public String getITRREG () {
					return this.ITRREG;
				}

				public Boolean ITRREGIsNullable(){
				    return true;
				}
				public Boolean ITRREGIsKey(){
				    return false;
				}
				public Integer ITRREGLength(){
				    return 16777216;
				}
				public Integer ITRREGPrecision(){
				    return null;
				}
				public String ITRREGDefault(){
				
					return null;
				
				}
				public String ITRREGComment(){
				
				    return "";
				
				}
				public String ITRREGPattern(){
				
					return "";
				
				}
				public String ITRREGOriginalDbColumnName(){
				
					return "ITRREG";
				
				}

				
			    public String ITRPOS;

				public String getITRPOS () {
					return this.ITRPOS;
				}

				public Boolean ITRPOSIsNullable(){
				    return true;
				}
				public Boolean ITRPOSIsKey(){
				    return false;
				}
				public Integer ITRPOSLength(){
				    return 16777216;
				}
				public Integer ITRPOSPrecision(){
				    return null;
				}
				public String ITRPOSDefault(){
				
					return null;
				
				}
				public String ITRPOSComment(){
				
				    return "";
				
				}
				public String ITRPOSPattern(){
				
					return "";
				
				}
				public String ITRPOSOriginalDbColumnName(){
				
					return "ITRPOS";
				
				}

				
			    public String ITREVT;

				public String getITREVT () {
					return this.ITREVT;
				}

				public Boolean ITREVTIsNullable(){
				    return true;
				}
				public Boolean ITREVTIsKey(){
				    return false;
				}
				public Integer ITREVTLength(){
				    return 16777216;
				}
				public Integer ITREVTPrecision(){
				    return null;
				}
				public String ITREVTDefault(){
				
					return null;
				
				}
				public String ITREVTComment(){
				
				    return "";
				
				}
				public String ITREVTPattern(){
				
					return "";
				
				}
				public String ITREVTOriginalDbColumnName(){
				
					return "ITREVT";
				
				}

				
			    public String ITRPRE;

				public String getITRPRE () {
					return this.ITRPRE;
				}

				public Boolean ITRPREIsNullable(){
				    return true;
				}
				public Boolean ITRPREIsKey(){
				    return false;
				}
				public Integer ITRPRELength(){
				    return 16777216;
				}
				public Integer ITRPREPrecision(){
				    return null;
				}
				public String ITRPREDefault(){
				
					return null;
				
				}
				public String ITRPREComment(){
				
				    return "";
				
				}
				public String ITRPREPattern(){
				
					return "";
				
				}
				public String ITRPREOriginalDbColumnName(){
				
					return "ITRPRE";
				
				}

				
			    public String ITRACF;

				public String getITRACF () {
					return this.ITRACF;
				}

				public Boolean ITRACFIsNullable(){
				    return true;
				}
				public Boolean ITRACFIsKey(){
				    return false;
				}
				public Integer ITRACFLength(){
				    return 16777216;
				}
				public Integer ITRACFPrecision(){
				    return null;
				}
				public String ITRACFDefault(){
				
					return null;
				
				}
				public String ITRACFComment(){
				
				    return "";
				
				}
				public String ITRACFPattern(){
				
					return "";
				
				}
				public String ITRACFOriginalDbColumnName(){
				
					return "ITRACF";
				
				}

				
			    public String IDEPT;

				public String getIDEPT () {
					return this.IDEPT;
				}

				public Boolean IDEPTIsNullable(){
				    return true;
				}
				public Boolean IDEPTIsKey(){
				    return false;
				}
				public Integer IDEPTLength(){
				    return 16777216;
				}
				public Integer IDEPTPrecision(){
				    return null;
				}
				public String IDEPTDefault(){
				
					return null;
				
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

				
			    public String ISDEPT;

				public String getISDEPT () {
					return this.ISDEPT;
				}

				public Boolean ISDEPTIsNullable(){
				    return true;
				}
				public Boolean ISDEPTIsKey(){
				    return false;
				}
				public Integer ISDEPTLength(){
				    return 16777216;
				}
				public Integer ISDEPTPrecision(){
				    return null;
				}
				public String ISDEPTDefault(){
				
					return null;
				
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

				
			    public String ICLAS;

				public String getICLAS () {
					return this.ICLAS;
				}

				public Boolean ICLASIsNullable(){
				    return true;
				}
				public Boolean ICLASIsKey(){
				    return false;
				}
				public Integer ICLASLength(){
				    return 16777216;
				}
				public Integer ICLASPrecision(){
				    return null;
				}
				public String ICLASDefault(){
				
					return null;
				
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

				
			    public String ISCLAS;

				public String getISCLAS () {
					return this.ISCLAS;
				}

				public Boolean ISCLASIsNullable(){
				    return true;
				}
				public Boolean ISCLASIsKey(){
				    return false;
				}
				public Integer ISCLASLength(){
				    return 16777216;
				}
				public Integer ISCLASPrecision(){
				    return null;
				}
				public String ISCLASDefault(){
				
					return null;
				
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

				
			    public String ITRPOV;

				public String getITRPOV () {
					return this.ITRPOV;
				}

				public Boolean ITRPOVIsNullable(){
				    return true;
				}
				public Boolean ITRPOVIsKey(){
				    return false;
				}
				public Integer ITRPOVLength(){
				    return 16777216;
				}
				public Integer ITRPOVPrecision(){
				    return null;
				}
				public String ITRPOVDefault(){
				
					return null;
				
				}
				public String ITRPOVComment(){
				
				    return "";
				
				}
				public String ITRPOVPattern(){
				
					return "";
				
				}
				public String ITRPOVOriginalDbColumnName(){
				
					return "ITRPOV";
				
				}

				
			    public String ITRVND;

				public String getITRVND () {
					return this.ITRVND;
				}

				public Boolean ITRVNDIsNullable(){
				    return true;
				}
				public Boolean ITRVNDIsKey(){
				    return false;
				}
				public Integer ITRVNDLength(){
				    return 16777216;
				}
				public Integer ITRVNDPrecision(){
				    return null;
				}
				public String ITRVNDDefault(){
				
					return null;
				
				}
				public String ITRVNDComment(){
				
				    return "";
				
				}
				public String ITRVNDPattern(){
				
					return "";
				
				}
				public String ITRVNDOriginalDbColumnName(){
				
					return "ITRVND";
				
				}

				
			    public String ITRSTY;

				public String getITRSTY () {
					return this.ITRSTY;
				}

				public Boolean ITRSTYIsNullable(){
				    return true;
				}
				public Boolean ITRSTYIsKey(){
				    return false;
				}
				public Integer ITRSTYLength(){
				    return 16777216;
				}
				public Integer ITRSTYPrecision(){
				    return null;
				}
				public String ITRSTYDefault(){
				
					return null;
				
				}
				public String ITRSTYComment(){
				
				    return "";
				
				}
				public String ITRSTYPattern(){
				
					return "";
				
				}
				public String ITRSTYOriginalDbColumnName(){
				
					return "ITRSTY";
				
				}

				
			    public String ITRSEA;

				public String getITRSEA () {
					return this.ITRSEA;
				}

				public Boolean ITRSEAIsNullable(){
				    return true;
				}
				public Boolean ITRSEAIsKey(){
				    return false;
				}
				public Integer ITRSEALength(){
				    return 16777216;
				}
				public Integer ITRSEAPrecision(){
				    return null;
				}
				public String ITRSEADefault(){
				
					return null;
				
				}
				public String ITRSEAComment(){
				
				    return "";
				
				}
				public String ITRSEAPattern(){
				
					return "";
				
				}
				public String ITRSEAOriginalDbColumnName(){
				
					return "ITRSEA";
				
				}

				
			    public String ITRSET;

				public String getITRSET () {
					return this.ITRSET;
				}

				public Boolean ITRSETIsNullable(){
				    return true;
				}
				public Boolean ITRSETIsKey(){
				    return false;
				}
				public Integer ITRSETLength(){
				    return 16777216;
				}
				public Integer ITRSETPrecision(){
				    return null;
				}
				public String ITRSETDefault(){
				
					return null;
				
				}
				public String ITRSETComment(){
				
				    return "";
				
				}
				public String ITRSETPattern(){
				
					return "";
				
				}
				public String ITRSETOriginalDbColumnName(){
				
					return "ITRSET";
				
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
				    return 16777216;
				}
				public Integer ISTYPEPrecision(){
				    return null;
				}
				public String ISTYPEDefault(){
				
					return null;
				
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

				
			    public String ITRPST;

				public String getITRPST () {
					return this.ITRPST;
				}

				public Boolean ITRPSTIsNullable(){
				    return true;
				}
				public Boolean ITRPSTIsKey(){
				    return false;
				}
				public Integer ITRPSTLength(){
				    return 16777216;
				}
				public Integer ITRPSTPrecision(){
				    return null;
				}
				public String ITRPSTDefault(){
				
					return null;
				
				}
				public String ITRPSTComment(){
				
				    return "";
				
				}
				public String ITRPSTPattern(){
				
					return "";
				
				}
				public String ITRPSTOriginalDbColumnName(){
				
					return "ITRPST";
				
				}

				
			    public String ITRHOT;

				public String getITRHOT () {
					return this.ITRHOT;
				}

				public Boolean ITRHOTIsNullable(){
				    return true;
				}
				public Boolean ITRHOTIsKey(){
				    return false;
				}
				public Integer ITRHOTLength(){
				    return 16777216;
				}
				public Integer ITRHOTPrecision(){
				    return null;
				}
				public String ITRHOTDefault(){
				
					return null;
				
				}
				public String ITRHOTComment(){
				
				    return "";
				
				}
				public String ITRHOTPattern(){
				
					return "";
				
				}
				public String ITRHOTOriginalDbColumnName(){
				
					return "ITRHOT";
				
				}

				
			    public String ITTRET;

				public String getITTRET () {
					return this.ITTRET;
				}

				public Boolean ITTRETIsNullable(){
				    return true;
				}
				public Boolean ITTRETIsKey(){
				    return false;
				}
				public Integer ITTRETLength(){
				    return 16777216;
				}
				public Integer ITTRETPrecision(){
				    return null;
				}
				public String ITTRETDefault(){
				
					return null;
				
				}
				public String ITTRETComment(){
				
				    return "";
				
				}
				public String ITTRETPattern(){
				
					return "";
				
				}
				public String ITTRETOriginalDbColumnName(){
				
					return "ITTRET";
				
				}

				
			    public String ITTCST;

				public String getITTCST () {
					return this.ITTCST;
				}

				public Boolean ITTCSTIsNullable(){
				    return true;
				}
				public Boolean ITTCSTIsKey(){
				    return false;
				}
				public Integer ITTCSTLength(){
				    return 16777216;
				}
				public Integer ITTCSTPrecision(){
				    return null;
				}
				public String ITTCSTDefault(){
				
					return null;
				
				}
				public String ITTCSTComment(){
				
				    return "";
				
				}
				public String ITTCSTPattern(){
				
					return "";
				
				}
				public String ITTCSTOriginalDbColumnName(){
				
					return "ITTCST";
				
				}

				
			    public String ITTREG;

				public String getITTREG () {
					return this.ITTREG;
				}

				public Boolean ITTREGIsNullable(){
				    return true;
				}
				public Boolean ITTREGIsKey(){
				    return false;
				}
				public Integer ITTREGLength(){
				    return 16777216;
				}
				public Integer ITTREGPrecision(){
				    return null;
				}
				public String ITTREGDefault(){
				
					return null;
				
				}
				public String ITTREGComment(){
				
				    return "";
				
				}
				public String ITTREGPattern(){
				
					return "";
				
				}
				public String ITTREGOriginalDbColumnName(){
				
					return "ITTREG";
				
				}

				
			    public String ITTPOS;

				public String getITTPOS () {
					return this.ITTPOS;
				}

				public Boolean ITTPOSIsNullable(){
				    return true;
				}
				public Boolean ITTPOSIsKey(){
				    return false;
				}
				public Integer ITTPOSLength(){
				    return 16777216;
				}
				public Integer ITTPOSPrecision(){
				    return null;
				}
				public String ITTPOSDefault(){
				
					return null;
				
				}
				public String ITTPOSComment(){
				
				    return "";
				
				}
				public String ITTPOSPattern(){
				
					return "";
				
				}
				public String ITTPOSOriginalDbColumnName(){
				
					return "ITTPOS";
				
				}

				
			    public String ITTCOD;

				public String getITTCOD () {
					return this.ITTCOD;
				}

				public Boolean ITTCODIsNullable(){
				    return true;
				}
				public Boolean ITTCODIsKey(){
				    return false;
				}
				public Integer ITTCODLength(){
				    return 16777216;
				}
				public Integer ITTCODPrecision(){
				    return null;
				}
				public String ITTCODDefault(){
				
					return null;
				
				}
				public String ITTCODComment(){
				
				    return "";
				
				}
				public String ITTCODPattern(){
				
					return "";
				
				}
				public String ITTCODOriginalDbColumnName(){
				
					return "ITTCOD";
				
				}

				
			    public String ITTRAT;

				public String getITTRAT () {
					return this.ITTRAT;
				}

				public Boolean ITTRATIsNullable(){
				    return true;
				}
				public Boolean ITTRATIsKey(){
				    return false;
				}
				public Integer ITTRATLength(){
				    return 16777216;
				}
				public Integer ITTRATPrecision(){
				    return null;
				}
				public String ITTRATDefault(){
				
					return null;
				
				}
				public String ITTRATComment(){
				
				    return "";
				
				}
				public String ITTRATPattern(){
				
					return "";
				
				}
				public String ITTRATOriginalDbColumnName(){
				
					return "ITTRAT";
				
				}

				
			    public String ITTVAT;

				public String getITTVAT () {
					return this.ITTVAT;
				}

				public Boolean ITTVATIsNullable(){
				    return true;
				}
				public Boolean ITTVATIsKey(){
				    return false;
				}
				public Integer ITTVATLength(){
				    return 16777216;
				}
				public Integer ITTVATPrecision(){
				    return null;
				}
				public String ITTVATDefault(){
				
					return null;
				
				}
				public String ITTVATComment(){
				
				    return "";
				
				}
				public String ITTVATPattern(){
				
					return "";
				
				}
				public String ITTVATOriginalDbColumnName(){
				
					return "ITTVAT";
				
				}

				
			    public String ITTCVT;

				public String getITTCVT () {
					return this.ITTCVT;
				}

				public Boolean ITTCVTIsNullable(){
				    return true;
				}
				public Boolean ITTCVTIsKey(){
				    return false;
				}
				public Integer ITTCVTLength(){
				    return 16777216;
				}
				public Integer ITTCVTPrecision(){
				    return null;
				}
				public String ITTCVTDefault(){
				
					return null;
				
				}
				public String ITTCVTComment(){
				
				    return "";
				
				}
				public String ITTCVTPattern(){
				
					return "";
				
				}
				public String ITTCVTOriginalDbColumnName(){
				
					return "ITTCVT";
				
				}

				
			    public String ITTMD;

				public String getITTMD () {
					return this.ITTMD;
				}

				public Boolean ITTMDIsNullable(){
				    return true;
				}
				public Boolean ITTMDIsKey(){
				    return false;
				}
				public Integer ITTMDLength(){
				    return 16777216;
				}
				public Integer ITTMDPrecision(){
				    return null;
				}
				public String ITTMDDefault(){
				
					return null;
				
				}
				public String ITTMDComment(){
				
				    return "";
				
				}
				public String ITTMDPattern(){
				
					return "";
				
				}
				public String ITTMDOriginalDbColumnName(){
				
					return "ITTMD";
				
				}

				
			    public String ITTID;

				public String getITTID () {
					return this.ITTID;
				}

				public Boolean ITTIDIsNullable(){
				    return true;
				}
				public Boolean ITTIDIsKey(){
				    return false;
				}
				public Integer ITTIDLength(){
				    return 16777216;
				}
				public Integer ITTIDPrecision(){
				    return null;
				}
				public String ITTIDDefault(){
				
					return null;
				
				}
				public String ITTIDComment(){
				
				    return "";
				
				}
				public String ITTIDPattern(){
				
					return "";
				
				}
				public String ITTIDOriginalDbColumnName(){
				
					return "ITTID";
				
				}

				
			    public String ITTPRO;

				public String getITTPRO () {
					return this.ITTPRO;
				}

				public Boolean ITTPROIsNullable(){
				    return true;
				}
				public Boolean ITTPROIsKey(){
				    return false;
				}
				public Integer ITTPROLength(){
				    return 16777216;
				}
				public Integer ITTPROPrecision(){
				    return null;
				}
				public String ITTPRODefault(){
				
					return null;
				
				}
				public String ITTPROComment(){
				
				    return "";
				
				}
				public String ITTPROPattern(){
				
					return "";
				
				}
				public String ITTPROOriginalDbColumnName(){
				
					return "ITTPRO";
				
				}

				
			    public String ITRACN;

				public String getITRACN () {
					return this.ITRACN;
				}

				public Boolean ITRACNIsNullable(){
				    return true;
				}
				public Boolean ITRACNIsKey(){
				    return false;
				}
				public Integer ITRACNLength(){
				    return 16777216;
				}
				public Integer ITRACNPrecision(){
				    return null;
				}
				public String ITRACNDefault(){
				
					return null;
				
				}
				public String ITRACNComment(){
				
				    return "";
				
				}
				public String ITRACNPattern(){
				
					return "";
				
				}
				public String ITRACNOriginalDbColumnName(){
				
					return "ITRACN";
				
				}

				
			    public String ITRADT;

				public String getITRADT () {
					return this.ITRADT;
				}

				public Boolean ITRADTIsNullable(){
				    return true;
				}
				public Boolean ITRADTIsKey(){
				    return false;
				}
				public Integer ITRADTLength(){
				    return 16777216;
				}
				public Integer ITRADTPrecision(){
				    return null;
				}
				public String ITRADTDefault(){
				
					return null;
				
				}
				public String ITRADTComment(){
				
				    return "";
				
				}
				public String ITRADTPattern(){
				
					return "";
				
				}
				public String ITRADTOriginalDbColumnName(){
				
					return "ITRADT";
				
				}

				
			    public String ITRREF;

				public String getITRREF () {
					return this.ITRREF;
				}

				public Boolean ITRREFIsNullable(){
				    return true;
				}
				public Boolean ITRREFIsKey(){
				    return false;
				}
				public Integer ITRREFLength(){
				    return 16777216;
				}
				public Integer ITRREFPrecision(){
				    return null;
				}
				public String ITRREFDefault(){
				
					return null;
				
				}
				public String ITRREFComment(){
				
				    return "";
				
				}
				public String ITRREFPattern(){
				
					return "";
				
				}
				public String ITRREFOriginalDbColumnName(){
				
					return "ITRREF";
				
				}

				
			    public String PGMNAM;

				public String getPGMNAM () {
					return this.PGMNAM;
				}

				public Boolean PGMNAMIsNullable(){
				    return true;
				}
				public Boolean PGMNAMIsKey(){
				    return false;
				}
				public Integer PGMNAMLength(){
				    return 16777216;
				}
				public Integer PGMNAMPrecision(){
				    return null;
				}
				public String PGMNAMDefault(){
				
					return null;
				
				}
				public String PGMNAMComment(){
				
				    return "";
				
				}
				public String PGMNAMPattern(){
				
					return "";
				
				}
				public String PGMNAMOriginalDbColumnName(){
				
					return "PGMNAM";
				
				}

				
			    public String LGUSER;

				public String getLGUSER () {
					return this.LGUSER;
				}

				public Boolean LGUSERIsNullable(){
				    return true;
				}
				public Boolean LGUSERIsKey(){
				    return false;
				}
				public Integer LGUSERLength(){
				    return 16777216;
				}
				public Integer LGUSERPrecision(){
				    return null;
				}
				public String LGUSERDefault(){
				
					return null;
				
				}
				public String LGUSERComment(){
				
				    return "";
				
				}
				public String LGUSERPattern(){
				
					return "";
				
				}
				public String LGUSEROriginalDbColumnName(){
				
					return "LGUSER";
				
				}

				
			    public String CSCSH;

				public String getCSCSH () {
					return this.CSCSH;
				}

				public Boolean CSCSHIsNullable(){
				    return true;
				}
				public Boolean CSCSHIsKey(){
				    return false;
				}
				public Integer CSCSHLength(){
				    return 16777216;
				}
				public Integer CSCSHPrecision(){
				    return null;
				}
				public String CSCSHDefault(){
				
					return null;
				
				}
				public String CSCSHComment(){
				
				    return "";
				
				}
				public String CSCSHPattern(){
				
					return "";
				
				}
				public String CSCSHOriginalDbColumnName(){
				
					return "CSCSH";
				
				}

				
			    public String CSRSTP;

				public String getCSRSTP () {
					return this.CSRSTP;
				}

				public Boolean CSRSTPIsNullable(){
				    return true;
				}
				public Boolean CSRSTPIsKey(){
				    return false;
				}
				public Integer CSRSTPLength(){
				    return 16777216;
				}
				public Integer CSRSTPPrecision(){
				    return null;
				}
				public String CSRSTPDefault(){
				
					return null;
				
				}
				public String CSRSTPComment(){
				
				    return "";
				
				}
				public String CSRSTPPattern(){
				
					return "";
				
				}
				public String CSRSTPOriginalDbColumnName(){
				
					return "CSRSTP";
				
				}

				
			    public String CSDRSN;

				public String getCSDRSN () {
					return this.CSDRSN;
				}

				public Boolean CSDRSNIsNullable(){
				    return true;
				}
				public Boolean CSDRSNIsKey(){
				    return false;
				}
				public Integer CSDRSNLength(){
				    return 16777216;
				}
				public Integer CSDRSNPrecision(){
				    return null;
				}
				public String CSDRSNDefault(){
				
					return null;
				
				}
				public String CSDRSNComment(){
				
				    return "";
				
				}
				public String CSDRSNPattern(){
				
					return "";
				
				}
				public String CSDRSNOriginalDbColumnName(){
				
					return "CSDRSN";
				
				}

				
			    public String ITGLBN;

				public String getITGLBN () {
					return this.ITGLBN;
				}

				public Boolean ITGLBNIsNullable(){
				    return true;
				}
				public Boolean ITGLBNIsKey(){
				    return false;
				}
				public Integer ITGLBNLength(){
				    return 16777216;
				}
				public Integer ITGLBNPrecision(){
				    return null;
				}
				public String ITGLBNDefault(){
				
					return null;
				
				}
				public String ITGLBNComment(){
				
				    return "";
				
				}
				public String ITGLBNPattern(){
				
					return "";
				
				}
				public String ITGLBNOriginalDbColumnName(){
				
					return "ITGLBN";
				
				}

				
			    public String ITPCEN;

				public String getITPCEN () {
					return this.ITPCEN;
				}

				public Boolean ITPCENIsNullable(){
				    return true;
				}
				public Boolean ITPCENIsKey(){
				    return false;
				}
				public Integer ITPCENLength(){
				    return 16777216;
				}
				public Integer ITPCENPrecision(){
				    return null;
				}
				public String ITPCENDefault(){
				
					return null;
				
				}
				public String ITPCENComment(){
				
				    return "";
				
				}
				public String ITPCENPattern(){
				
					return "";
				
				}
				public String ITPCENOriginalDbColumnName(){
				
					return "ITPCEN";
				
				}

				
			    public String ITPDTE;

				public String getITPDTE () {
					return this.ITPDTE;
				}

				public Boolean ITPDTEIsNullable(){
				    return true;
				}
				public Boolean ITPDTEIsKey(){
				    return false;
				}
				public Integer ITPDTELength(){
				    return 16777216;
				}
				public Integer ITPDTEPrecision(){
				    return null;
				}
				public String ITPDTEDefault(){
				
					return null;
				
				}
				public String ITPDTEComment(){
				
				    return "";
				
				}
				public String ITPDTEPattern(){
				
					return "";
				
				}
				public String ITPDTEOriginalDbColumnName(){
				
					return "ITPDTE";
				
				}

				
			    public String ITRSCN;

				public String getITRSCN () {
					return this.ITRSCN;
				}

				public Boolean ITRSCNIsNullable(){
				    return true;
				}
				public Boolean ITRSCNIsKey(){
				    return false;
				}
				public Integer ITRSCNLength(){
				    return 16777216;
				}
				public Integer ITRSCNPrecision(){
				    return null;
				}
				public String ITRSCNDefault(){
				
					return null;
				
				}
				public String ITRSCNComment(){
				
				    return "";
				
				}
				public String ITRSCNPattern(){
				
					return "";
				
				}
				public String ITRSCNOriginalDbColumnName(){
				
					return "ITRSCN";
				
				}

				
			    public String ITRSDT;

				public String getITRSDT () {
					return this.ITRSDT;
				}

				public Boolean ITRSDTIsNullable(){
				    return true;
				}
				public Boolean ITRSDTIsKey(){
				    return false;
				}
				public Integer ITRSDTLength(){
				    return 16777216;
				}
				public Integer ITRSDTPrecision(){
				    return null;
				}
				public String ITRSDTDefault(){
				
					return null;
				
				}
				public String ITRSDTComment(){
				
				    return "";
				
				}
				public String ITRSDTPattern(){
				
					return "";
				
				}
				public String ITRSDTOriginalDbColumnName(){
				
					return "ITRSDT";
				
				}

				
			    public String ITRSTM;

				public String getITRSTM () {
					return this.ITRSTM;
				}

				public Boolean ITRSTMIsNullable(){
				    return true;
				}
				public Boolean ITRSTMIsKey(){
				    return false;
				}
				public Integer ITRSTMLength(){
				    return 16777216;
				}
				public Integer ITRSTMPrecision(){
				    return null;
				}
				public String ITRSTMDefault(){
				
					return null;
				
				}
				public String ITRSTMComment(){
				
				    return "";
				
				}
				public String ITRSTMPattern(){
				
					return "";
				
				}
				public String ITRSTMOriginalDbColumnName(){
				
					return "ITRSTM";
				
				}

				
			    public String ITRLOH;

				public String getITRLOH () {
					return this.ITRLOH;
				}

				public Boolean ITRLOHIsNullable(){
				    return true;
				}
				public Boolean ITRLOHIsKey(){
				    return false;
				}
				public Integer ITRLOHLength(){
				    return 16777216;
				}
				public Integer ITRLOHPrecision(){
				    return null;
				}
				public String ITRLOHDefault(){
				
					return null;
				
				}
				public String ITRLOHComment(){
				
				    return "";
				
				}
				public String ITRLOHPattern(){
				
					return "";
				
				}
				public String ITRLOHOriginalDbColumnName(){
				
					return "ITRLOH";
				
				}

				
			    public String ITRLAC;

				public String getITRLAC () {
					return this.ITRLAC;
				}

				public Boolean ITRLACIsNullable(){
				    return true;
				}
				public Boolean ITRLACIsKey(){
				    return false;
				}
				public Integer ITRLACLength(){
				    return 16777216;
				}
				public Integer ITRLACPrecision(){
				    return null;
				}
				public String ITRLACDefault(){
				
					return null;
				
				}
				public String ITRLACComment(){
				
				    return "";
				
				}
				public String ITRLACPattern(){
				
					return "";
				
				}
				public String ITRLACOriginalDbColumnName(){
				
					return "ITRLAC";
				
				}

				
			    public String ITRLLC;

				public String getITRLLC () {
					return this.ITRLLC;
				}

				public Boolean ITRLLCIsNullable(){
				    return true;
				}
				public Boolean ITRLLCIsKey(){
				    return false;
				}
				public Integer ITRLLCLength(){
				    return 16777216;
				}
				public Integer ITRLLCPrecision(){
				    return null;
				}
				public String ITRLLCDefault(){
				
					return null;
				
				}
				public String ITRLLCComment(){
				
				    return "";
				
				}
				public String ITRLLCPattern(){
				
					return "";
				
				}
				public String ITRLLCOriginalDbColumnName(){
				
					return "ITRLLC";
				
				}

				
			    public String ITRCOH;

				public String getITRCOH () {
					return this.ITRCOH;
				}

				public Boolean ITRCOHIsNullable(){
				    return true;
				}
				public Boolean ITRCOHIsKey(){
				    return false;
				}
				public Integer ITRCOHLength(){
				    return 16777216;
				}
				public Integer ITRCOHPrecision(){
				    return null;
				}
				public String ITRCOHDefault(){
				
					return null;
				
				}
				public String ITRCOHComment(){
				
				    return "";
				
				}
				public String ITRCOHPattern(){
				
					return "";
				
				}
				public String ITRCOHOriginalDbColumnName(){
				
					return "ITRCOH";
				
				}

				
			    public String ITRCAC;

				public String getITRCAC () {
					return this.ITRCAC;
				}

				public Boolean ITRCACIsNullable(){
				    return true;
				}
				public Boolean ITRCACIsKey(){
				    return false;
				}
				public Integer ITRCACLength(){
				    return 16777216;
				}
				public Integer ITRCACPrecision(){
				    return null;
				}
				public String ITRCACDefault(){
				
					return null;
				
				}
				public String ITRCACComment(){
				
				    return "";
				
				}
				public String ITRCACPattern(){
				
					return "";
				
				}
				public String ITRCACOriginalDbColumnName(){
				
					return "ITRCAC";
				
				}

				
			    public String ITRCLC;

				public String getITRCLC () {
					return this.ITRCLC;
				}

				public Boolean ITRCLCIsNullable(){
				    return true;
				}
				public Boolean ITRCLCIsKey(){
				    return false;
				}
				public Integer ITRCLCLength(){
				    return 16777216;
				}
				public Integer ITRCLCPrecision(){
				    return null;
				}
				public String ITRCLCDefault(){
				
					return null;
				
				}
				public String ITRCLCComment(){
				
				    return "";
				
				}
				public String ITRCLCPattern(){
				
					return "";
				
				}
				public String ITRCLCOriginalDbColumnName(){
				
					return "ITRCLC";
				
				}

				
			    public String ITRDSC;

				public String getITRDSC () {
					return this.ITRDSC;
				}

				public Boolean ITRDSCIsNullable(){
				    return true;
				}
				public Boolean ITRDSCIsKey(){
				    return false;
				}
				public Integer ITRDSCLength(){
				    return 16777216;
				}
				public Integer ITRDSCPrecision(){
				    return null;
				}
				public String ITRDSCDefault(){
				
					return null;
				
				}
				public String ITRDSCComment(){
				
				    return "";
				
				}
				public String ITRDSCPattern(){
				
					return "";
				
				}
				public String ITRDSCOriginalDbColumnName(){
				
					return "ITRDSC";
				
				}

				
			    public String ITCHAN;

				public String getITCHAN () {
					return this.ITCHAN;
				}

				public Boolean ITCHANIsNullable(){
				    return true;
				}
				public Boolean ITCHANIsKey(){
				    return false;
				}
				public Integer ITCHANLength(){
				    return 16777216;
				}
				public Integer ITCHANPrecision(){
				    return null;
				}
				public String ITCHANDefault(){
				
					return null;
				
				}
				public String ITCHANComment(){
				
				    return "";
				
				}
				public String ITCHANPattern(){
				
					return "";
				
				}
				public String ITCHANOriginalDbColumnName(){
				
					return "ITCHAN";
				
				}

				
			    public String ITSLRC;

				public String getITSLRC () {
					return this.ITSLRC;
				}

				public Boolean ITSLRCIsNullable(){
				    return true;
				}
				public Boolean ITSLRCIsKey(){
				    return false;
				}
				public Integer ITSLRCLength(){
				    return 16777216;
				}
				public Integer ITSLRCPrecision(){
				    return null;
				}
				public String ITSLRCDefault(){
				
					return null;
				
				}
				public String ITSLRCComment(){
				
				    return "";
				
				}
				public String ITSLRCPattern(){
				
					return "";
				
				}
				public String ITSLRCOriginalDbColumnName(){
				
					return "ITSLRC";
				
				}

				
			    public String ITOHNO;

				public String getITOHNO () {
					return this.ITOHNO;
				}

				public Boolean ITOHNOIsNullable(){
				    return true;
				}
				public Boolean ITOHNOIsKey(){
				    return false;
				}
				public Integer ITOHNOLength(){
				    return 16777216;
				}
				public Integer ITOHNOPrecision(){
				    return null;
				}
				public String ITOHNODefault(){
				
					return null;
				
				}
				public String ITOHNOComment(){
				
				    return "";
				
				}
				public String ITOHNOPattern(){
				
					return "";
				
				}
				public String ITOHNOOriginalDbColumnName(){
				
					return "ITOHNO";
				
				}

				
			    public String ITTPCD;

				public String getITTPCD () {
					return this.ITTPCD;
				}

				public Boolean ITTPCDIsNullable(){
				    return true;
				}
				public Boolean ITTPCDIsKey(){
				    return false;
				}
				public Integer ITTPCDLength(){
				    return 16777216;
				}
				public Integer ITTPCDPrecision(){
				    return null;
				}
				public String ITTPCDDefault(){
				
					return null;
				
				}
				public String ITTPCDComment(){
				
				    return "";
				
				}
				public String ITTPCDPattern(){
				
					return "";
				
				}
				public String ITTPCDOriginalDbColumnName(){
				
					return "ITTPCD";
				
				}

				
			    public String ITDPMT;

				public String getITDPMT () {
					return this.ITDPMT;
				}

				public Boolean ITDPMTIsNullable(){
				    return true;
				}
				public Boolean ITDPMTIsKey(){
				    return false;
				}
				public Integer ITDPMTLength(){
				    return 16777216;
				}
				public Integer ITDPMTPrecision(){
				    return null;
				}
				public String ITDPMTDefault(){
				
					return null;
				
				}
				public String ITDPMTComment(){
				
				    return "";
				
				}
				public String ITDPMTPattern(){
				
					return "";
				
				}
				public String ITDPMTOriginalDbColumnName(){
				
					return "ITDPMT";
				
				}

				
			    public String ITCATN;

				public String getITCATN () {
					return this.ITCATN;
				}

				public Boolean ITCATNIsNullable(){
				    return true;
				}
				public Boolean ITCATNIsKey(){
				    return false;
				}
				public Integer ITCATNLength(){
				    return 16777216;
				}
				public Integer ITCATNPrecision(){
				    return null;
				}
				public String ITCATNDefault(){
				
					return null;
				
				}
				public String ITCATNComment(){
				
				    return "";
				
				}
				public String ITCATNPattern(){
				
					return "";
				
				}
				public String ITCATNOriginalDbColumnName(){
				
					return "ITCATN";
				
				}

				
			    public String ITCATS;

				public String getITCATS () {
					return this.ITCATS;
				}

				public Boolean ITCATSIsNullable(){
				    return true;
				}
				public Boolean ITCATSIsKey(){
				    return false;
				}
				public Integer ITCATSLength(){
				    return 16777216;
				}
				public Integer ITCATSPrecision(){
				    return null;
				}
				public String ITCATSDefault(){
				
					return null;
				
				}
				public String ITCATSComment(){
				
				    return "";
				
				}
				public String ITCATSPattern(){
				
					return "";
				
				}
				public String ITCATSOriginalDbColumnName(){
				
					return "ITCATS";
				
				}

				
			    public String ITSPDI;

				public String getITSPDI () {
					return this.ITSPDI;
				}

				public Boolean ITSPDIIsNullable(){
				    return true;
				}
				public Boolean ITSPDIIsKey(){
				    return false;
				}
				public Integer ITSPDILength(){
				    return 16777216;
				}
				public Integer ITSPDIPrecision(){
				    return null;
				}
				public String ITSPDIDefault(){
				
					return null;
				
				}
				public String ITSPDIComment(){
				
				    return "";
				
				}
				public String ITSPDIPattern(){
				
					return "";
				
				}
				public String ITSPDIOriginalDbColumnName(){
				
					return "ITSPDI";
				
				}

				
			    public String ITCATP;

				public String getITCATP () {
					return this.ITCATP;
				}

				public Boolean ITCATPIsNullable(){
				    return true;
				}
				public Boolean ITCATPIsKey(){
				    return false;
				}
				public Integer ITCATPLength(){
				    return 16777216;
				}
				public Integer ITCATPPrecision(){
				    return null;
				}
				public String ITCATPDefault(){
				
					return null;
				
				}
				public String ITCATPComment(){
				
				    return "";
				
				}
				public String ITCATPPattern(){
				
					return "";
				
				}
				public String ITCATPOriginalDbColumnName(){
				
					return "ITCATP";
				
				}

				
			    public String ITUSID;

				public String getITUSID () {
					return this.ITUSID;
				}

				public Boolean ITUSIDIsNullable(){
				    return true;
				}
				public Boolean ITUSIDIsKey(){
				    return false;
				}
				public Integer ITUSIDLength(){
				    return 16777216;
				}
				public Integer ITUSIDPrecision(){
				    return null;
				}
				public String ITUSIDDefault(){
				
					return null;
				
				}
				public String ITUSIDComment(){
				
				    return "";
				
				}
				public String ITUSIDPattern(){
				
					return "";
				
				}
				public String ITUSIDOriginalDbColumnName(){
				
					return "ITUSID";
				
				}

				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
					this.ITRLOC = readString(dis);
					
					this.ITRCEN = readString(dis);
					
					this.ITRDAT = readString(dis);
					
					this.ITRTYP = readString(dis);
					
					this.INUMBR = readString(dis);
					
					this.ITRQTY = readString(dis);
					
					this.ITRRET = readString(dis);
					
					this.ITRCST = readString(dis);
					
					this.ITREXT = readString(dis);
					
					this.ITRVAT = readString(dis);
					
					this.ITCVAT = readString(dis);
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
					this.ITRREG = readString(dis);
					
					this.ITRPOS = readString(dis);
					
					this.ITREVT = readString(dis);
					
					this.ITRPRE = readString(dis);
					
					this.ITRACF = readString(dis);
					
					this.IDEPT = readString(dis);
					
					this.ISDEPT = readString(dis);
					
					this.ICLAS = readString(dis);
					
					this.ISCLAS = readString(dis);
					
					this.ITRPOV = readString(dis);
					
					this.ITRVND = readString(dis);
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
					this.ITRSET = readString(dis);
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
					this.ITTRET = readString(dis);
					
					this.ITTCST = readString(dis);
					
					this.ITTREG = readString(dis);
					
					this.ITTPOS = readString(dis);
					
					this.ITTCOD = readString(dis);
					
					this.ITTRAT = readString(dis);
					
					this.ITTVAT = readString(dis);
					
					this.ITTCVT = readString(dis);
					
					this.ITTMD = readString(dis);
					
					this.ITTID = readString(dis);
					
					this.ITTPRO = readString(dis);
					
					this.ITRACN = readString(dis);
					
					this.ITRADT = readString(dis);
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
					this.CSCSH = readString(dis);
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
					this.ITPCEN = readString(dis);
					
					this.ITPDTE = readString(dis);
					
					this.ITRSCN = readString(dis);
					
					this.ITRSDT = readString(dis);
					
					this.ITRSTM = readString(dis);
					
					this.ITRLOH = readString(dis);
					
					this.ITRLAC = readString(dis);
					
					this.ITRLLC = readString(dis);
					
					this.ITRCOH = readString(dis);
					
					this.ITRCAC = readString(dis);
					
					this.ITRCLC = readString(dis);
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
					this.ITOHNO = readString(dis);
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
					this.ITCATP = readString(dis);
					
					this.ITUSID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

        	try {

        		int length = 0;
		
					this.ITFLAG = readString(dis);
					
					this.ITHCOD = readString(dis);
					
					this.ITRLTP = readString(dis);
					
					this.ITRLOC = readString(dis);
					
					this.ITRCEN = readString(dis);
					
					this.ITRDAT = readString(dis);
					
					this.ITRTYP = readString(dis);
					
					this.INUMBR = readString(dis);
					
					this.ITRQTY = readString(dis);
					
					this.ITRRET = readString(dis);
					
					this.ITRCST = readString(dis);
					
					this.ITREXT = readString(dis);
					
					this.ITRVAT = readString(dis);
					
					this.ITCVAT = readString(dis);
					
					this.ITVCLC = readString(dis);
					
					this.ITRCUS = readString(dis);
					
					this.ITTPTP = readString(dis);
					
					this.ITRREG = readString(dis);
					
					this.ITRPOS = readString(dis);
					
					this.ITREVT = readString(dis);
					
					this.ITRPRE = readString(dis);
					
					this.ITRACF = readString(dis);
					
					this.IDEPT = readString(dis);
					
					this.ISDEPT = readString(dis);
					
					this.ICLAS = readString(dis);
					
					this.ISCLAS = readString(dis);
					
					this.ITRPOV = readString(dis);
					
					this.ITRVND = readString(dis);
					
					this.ITRSTY = readString(dis);
					
					this.ITRSEA = readString(dis);
					
					this.ITRSET = readString(dis);
					
					this.ISTYPE = readString(dis);
					
					this.ITRPST = readString(dis);
					
					this.ITRHOT = readString(dis);
					
					this.ITTRET = readString(dis);
					
					this.ITTCST = readString(dis);
					
					this.ITTREG = readString(dis);
					
					this.ITTPOS = readString(dis);
					
					this.ITTCOD = readString(dis);
					
					this.ITTRAT = readString(dis);
					
					this.ITTVAT = readString(dis);
					
					this.ITTCVT = readString(dis);
					
					this.ITTMD = readString(dis);
					
					this.ITTID = readString(dis);
					
					this.ITTPRO = readString(dis);
					
					this.ITRACN = readString(dis);
					
					this.ITRADT = readString(dis);
					
					this.ITRREF = readString(dis);
					
					this.PGMNAM = readString(dis);
					
					this.LGUSER = readString(dis);
					
					this.CSCSH = readString(dis);
					
					this.CSRSTP = readString(dis);
					
					this.CSDRSN = readString(dis);
					
					this.ITGLBN = readString(dis);
					
					this.ITPCEN = readString(dis);
					
					this.ITPDTE = readString(dis);
					
					this.ITRSCN = readString(dis);
					
					this.ITRSDT = readString(dis);
					
					this.ITRSTM = readString(dis);
					
					this.ITRLOH = readString(dis);
					
					this.ITRLAC = readString(dis);
					
					this.ITRLLC = readString(dis);
					
					this.ITRCOH = readString(dis);
					
					this.ITRCAC = readString(dis);
					
					this.ITRCLC = readString(dis);
					
					this.ITRDSC = readString(dis);
					
					this.ITCHAN = readString(dis);
					
					this.ITSLRC = readString(dis);
					
					this.ITOHNO = readString(dis);
					
					this.ITTPCD = readString(dis);
					
					this.ITDPMT = readString(dis);
					
					this.ITCATN = readString(dis);
					
					this.ITCATS = readString(dis);
					
					this.ITSPDI = readString(dis);
					
					this.ITCATP = readString(dis);
					
					this.ITUSID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// String
				
						writeString(this.ITRLOC,dos);
					
					// String
				
						writeString(this.ITRCEN,dos);
					
					// String
				
						writeString(this.ITRDAT,dos);
					
					// String
				
						writeString(this.ITRTYP,dos);
					
					// String
				
						writeString(this.INUMBR,dos);
					
					// String
				
						writeString(this.ITRQTY,dos);
					
					// String
				
						writeString(this.ITRRET,dos);
					
					// String
				
						writeString(this.ITRCST,dos);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// String
				
						writeString(this.ITRVAT,dos);
					
					// String
				
						writeString(this.ITCVAT,dos);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// String
				
						writeString(this.ITRREG,dos);
					
					// String
				
						writeString(this.ITRPOS,dos);
					
					// String
				
						writeString(this.ITREVT,dos);
					
					// String
				
						writeString(this.ITRPRE,dos);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// String
				
						writeString(this.IDEPT,dos);
					
					// String
				
						writeString(this.ISDEPT,dos);
					
					// String
				
						writeString(this.ICLAS,dos);
					
					// String
				
						writeString(this.ISCLAS,dos);
					
					// String
				
						writeString(this.ITRPOV,dos);
					
					// String
				
						writeString(this.ITRVND,dos);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// String
				
						writeString(this.ITRSET,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// String
				
						writeString(this.ITTRET,dos);
					
					// String
				
						writeString(this.ITTCST,dos);
					
					// String
				
						writeString(this.ITTREG,dos);
					
					// String
				
						writeString(this.ITTPOS,dos);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// String
				
						writeString(this.ITTRAT,dos);
					
					// String
				
						writeString(this.ITTVAT,dos);
					
					// String
				
						writeString(this.ITTCVT,dos);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// String
				
						writeString(this.ITTID,dos);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// String
				
						writeString(this.ITRACN,dos);
					
					// String
				
						writeString(this.ITRADT,dos);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// String
				
						writeString(this.CSCSH,dos);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// String
				
						writeString(this.ITPCEN,dos);
					
					// String
				
						writeString(this.ITPDTE,dos);
					
					// String
				
						writeString(this.ITRSCN,dos);
					
					// String
				
						writeString(this.ITRSDT,dos);
					
					// String
				
						writeString(this.ITRSTM,dos);
					
					// String
				
						writeString(this.ITRLOH,dos);
					
					// String
				
						writeString(this.ITRLAC,dos);
					
					// String
				
						writeString(this.ITRLLC,dos);
					
					// String
				
						writeString(this.ITRCOH,dos);
					
					// String
				
						writeString(this.ITRCAC,dos);
					
					// String
				
						writeString(this.ITRCLC,dos);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// String
				
						writeString(this.ITOHNO,dos);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// String
				
						writeString(this.ITCATP,dos);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ITFLAG,dos);
					
					// String
				
						writeString(this.ITHCOD,dos);
					
					// String
				
						writeString(this.ITRLTP,dos);
					
					// String
				
						writeString(this.ITRLOC,dos);
					
					// String
				
						writeString(this.ITRCEN,dos);
					
					// String
				
						writeString(this.ITRDAT,dos);
					
					// String
				
						writeString(this.ITRTYP,dos);
					
					// String
				
						writeString(this.INUMBR,dos);
					
					// String
				
						writeString(this.ITRQTY,dos);
					
					// String
				
						writeString(this.ITRRET,dos);
					
					// String
				
						writeString(this.ITRCST,dos);
					
					// String
				
						writeString(this.ITREXT,dos);
					
					// String
				
						writeString(this.ITRVAT,dos);
					
					// String
				
						writeString(this.ITCVAT,dos);
					
					// String
				
						writeString(this.ITVCLC,dos);
					
					// String
				
						writeString(this.ITRCUS,dos);
					
					// String
				
						writeString(this.ITTPTP,dos);
					
					// String
				
						writeString(this.ITRREG,dos);
					
					// String
				
						writeString(this.ITRPOS,dos);
					
					// String
				
						writeString(this.ITREVT,dos);
					
					// String
				
						writeString(this.ITRPRE,dos);
					
					// String
				
						writeString(this.ITRACF,dos);
					
					// String
				
						writeString(this.IDEPT,dos);
					
					// String
				
						writeString(this.ISDEPT,dos);
					
					// String
				
						writeString(this.ICLAS,dos);
					
					// String
				
						writeString(this.ISCLAS,dos);
					
					// String
				
						writeString(this.ITRPOV,dos);
					
					// String
				
						writeString(this.ITRVND,dos);
					
					// String
				
						writeString(this.ITRSTY,dos);
					
					// String
				
						writeString(this.ITRSEA,dos);
					
					// String
				
						writeString(this.ITRSET,dos);
					
					// String
				
						writeString(this.ISTYPE,dos);
					
					// String
				
						writeString(this.ITRPST,dos);
					
					// String
				
						writeString(this.ITRHOT,dos);
					
					// String
				
						writeString(this.ITTRET,dos);
					
					// String
				
						writeString(this.ITTCST,dos);
					
					// String
				
						writeString(this.ITTREG,dos);
					
					// String
				
						writeString(this.ITTPOS,dos);
					
					// String
				
						writeString(this.ITTCOD,dos);
					
					// String
				
						writeString(this.ITTRAT,dos);
					
					// String
				
						writeString(this.ITTVAT,dos);
					
					// String
				
						writeString(this.ITTCVT,dos);
					
					// String
				
						writeString(this.ITTMD,dos);
					
					// String
				
						writeString(this.ITTID,dos);
					
					// String
				
						writeString(this.ITTPRO,dos);
					
					// String
				
						writeString(this.ITRACN,dos);
					
					// String
				
						writeString(this.ITRADT,dos);
					
					// String
				
						writeString(this.ITRREF,dos);
					
					// String
				
						writeString(this.PGMNAM,dos);
					
					// String
				
						writeString(this.LGUSER,dos);
					
					// String
				
						writeString(this.CSCSH,dos);
					
					// String
				
						writeString(this.CSRSTP,dos);
					
					// String
				
						writeString(this.CSDRSN,dos);
					
					// String
				
						writeString(this.ITGLBN,dos);
					
					// String
				
						writeString(this.ITPCEN,dos);
					
					// String
				
						writeString(this.ITPDTE,dos);
					
					// String
				
						writeString(this.ITRSCN,dos);
					
					// String
				
						writeString(this.ITRSDT,dos);
					
					// String
				
						writeString(this.ITRSTM,dos);
					
					// String
				
						writeString(this.ITRLOH,dos);
					
					// String
				
						writeString(this.ITRLAC,dos);
					
					// String
				
						writeString(this.ITRLLC,dos);
					
					// String
				
						writeString(this.ITRCOH,dos);
					
					// String
				
						writeString(this.ITRCAC,dos);
					
					// String
				
						writeString(this.ITRCLC,dos);
					
					// String
				
						writeString(this.ITRDSC,dos);
					
					// String
				
						writeString(this.ITCHAN,dos);
					
					// String
				
						writeString(this.ITSLRC,dos);
					
					// String
				
						writeString(this.ITOHNO,dos);
					
					// String
				
						writeString(this.ITTPCD,dos);
					
					// String
				
						writeString(this.ITDPMT,dos);
					
					// String
				
						writeString(this.ITCATN,dos);
					
					// String
				
						writeString(this.ITCATS,dos);
					
					// String
				
						writeString(this.ITSPDI,dos);
					
					// String
				
						writeString(this.ITCATP,dos);
					
					// String
				
						writeString(this.ITUSID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITFLAG="+ITFLAG);
		sb.append(",ITHCOD="+ITHCOD);
		sb.append(",ITRLTP="+ITRLTP);
		sb.append(",ITRLOC="+ITRLOC);
		sb.append(",ITRCEN="+ITRCEN);
		sb.append(",ITRDAT="+ITRDAT);
		sb.append(",ITRTYP="+ITRTYP);
		sb.append(",INUMBR="+INUMBR);
		sb.append(",ITRQTY="+ITRQTY);
		sb.append(",ITRRET="+ITRRET);
		sb.append(",ITRCST="+ITRCST);
		sb.append(",ITREXT="+ITREXT);
		sb.append(",ITRVAT="+ITRVAT);
		sb.append(",ITCVAT="+ITCVAT);
		sb.append(",ITVCLC="+ITVCLC);
		sb.append(",ITRCUS="+ITRCUS);
		sb.append(",ITTPTP="+ITTPTP);
		sb.append(",ITRREG="+ITRREG);
		sb.append(",ITRPOS="+ITRPOS);
		sb.append(",ITREVT="+ITREVT);
		sb.append(",ITRPRE="+ITRPRE);
		sb.append(",ITRACF="+ITRACF);
		sb.append(",IDEPT="+IDEPT);
		sb.append(",ISDEPT="+ISDEPT);
		sb.append(",ICLAS="+ICLAS);
		sb.append(",ISCLAS="+ISCLAS);
		sb.append(",ITRPOV="+ITRPOV);
		sb.append(",ITRVND="+ITRVND);
		sb.append(",ITRSTY="+ITRSTY);
		sb.append(",ITRSEA="+ITRSEA);
		sb.append(",ITRSET="+ITRSET);
		sb.append(",ISTYPE="+ISTYPE);
		sb.append(",ITRPST="+ITRPST);
		sb.append(",ITRHOT="+ITRHOT);
		sb.append(",ITTRET="+ITTRET);
		sb.append(",ITTCST="+ITTCST);
		sb.append(",ITTREG="+ITTREG);
		sb.append(",ITTPOS="+ITTPOS);
		sb.append(",ITTCOD="+ITTCOD);
		sb.append(",ITTRAT="+ITTRAT);
		sb.append(",ITTVAT="+ITTVAT);
		sb.append(",ITTCVT="+ITTCVT);
		sb.append(",ITTMD="+ITTMD);
		sb.append(",ITTID="+ITTID);
		sb.append(",ITTPRO="+ITTPRO);
		sb.append(",ITRACN="+ITRACN);
		sb.append(",ITRADT="+ITRADT);
		sb.append(",ITRREF="+ITRREF);
		sb.append(",PGMNAM="+PGMNAM);
		sb.append(",LGUSER="+LGUSER);
		sb.append(",CSCSH="+CSCSH);
		sb.append(",CSRSTP="+CSRSTP);
		sb.append(",CSDRSN="+CSDRSN);
		sb.append(",ITGLBN="+ITGLBN);
		sb.append(",ITPCEN="+ITPCEN);
		sb.append(",ITPDTE="+ITPDTE);
		sb.append(",ITRSCN="+ITRSCN);
		sb.append(",ITRSDT="+ITRSDT);
		sb.append(",ITRSTM="+ITRSTM);
		sb.append(",ITRLOH="+ITRLOH);
		sb.append(",ITRLAC="+ITRLAC);
		sb.append(",ITRLLC="+ITRLLC);
		sb.append(",ITRCOH="+ITRCOH);
		sb.append(",ITRCAC="+ITRCAC);
		sb.append(",ITRCLC="+ITRCLC);
		sb.append(",ITRDSC="+ITRDSC);
		sb.append(",ITCHAN="+ITCHAN);
		sb.append(",ITSLRC="+ITSLRC);
		sb.append(",ITOHNO="+ITOHNO);
		sb.append(",ITTPCD="+ITTPCD);
		sb.append(",ITDPMT="+ITDPMT);
		sb.append(",ITCATN="+ITCATN);
		sb.append(",ITCATS="+ITCATS);
		sb.append(",ITSPDI="+ITSPDI);
		sb.append(",ITCATP="+ITCATP);
		sb.append(",ITUSID="+ITUSID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITFLAG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITFLAG);
            			}
            		
        			sb.append("|");
        		
        				if(ITHCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITHCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRTYP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRTYP);
            			}
            		
        			sb.append("|");
        		
        				if(INUMBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(INUMBR);
            			}
            		
        			sb.append("|");
        		
        				if(ITRQTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRQTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITREXT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREXT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITVCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITVCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCUS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCUS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPTP);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITREVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITREVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPRE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPRE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACF);
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
        		
        				if(ITRPOV == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPOV);
            			}
            		
        			sb.append("|");
        		
        				if(ITRVND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRVND);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTY);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSEA == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSEA);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSET);
            			}
            		
        			sb.append("|");
        		
        				if(ISTYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISTYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRPST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRPST);
            			}
            		
        			sb.append("|");
        		
        				if(ITRHOT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRHOT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRET == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRET);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCST == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCST);
            			}
            		
        			sb.append("|");
        		
        				if(ITTREG == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTREG);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPOS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPOS);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTRAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTRAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTVAT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTVAT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTCVT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTCVT);
            			}
            		
        			sb.append("|");
        		
        				if(ITTMD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTMD);
            			}
            		
        			sb.append("|");
        		
        				if(ITTID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTID);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPRO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPRO);
            			}
            		
        			sb.append("|");
        		
        				if(ITRACN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRACN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRADT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRADT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRREF == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRREF);
            			}
            		
        			sb.append("|");
        		
        				if(PGMNAM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PGMNAM);
            			}
            		
        			sb.append("|");
        		
        				if(LGUSER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LGUSER);
            			}
            		
        			sb.append("|");
        		
        				if(CSCSH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSCSH);
            			}
            		
        			sb.append("|");
        		
        				if(CSRSTP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSRSTP);
            			}
            		
        			sb.append("|");
        		
        				if(CSDRSN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CSDRSN);
            			}
            		
        			sb.append("|");
        		
        				if(ITGLBN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITGLBN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPCEN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPCEN);
            			}
            		
        			sb.append("|");
        		
        				if(ITPDTE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITPDTE);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSCN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSCN);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSDT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSDT);
            			}
            		
        			sb.append("|");
        		
        				if(ITRSTM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRSTM);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRLLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRLLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCOH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCOH);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCAC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCAC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRCLC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRCLC);
            			}
            		
        			sb.append("|");
        		
        				if(ITRDSC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITRDSC);
            			}
            		
        			sb.append("|");
        		
        				if(ITCHAN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCHAN);
            			}
            		
        			sb.append("|");
        		
        				if(ITSLRC == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSLRC);
            			}
            		
        			sb.append("|");
        		
        				if(ITOHNO == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITOHNO);
            			}
            		
        			sb.append("|");
        		
        				if(ITTPCD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITTPCD);
            			}
            		
        			sb.append("|");
        		
        				if(ITDPMT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITDPMT);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATN);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATS);
            			}
            		
        			sb.append("|");
        		
        				if(ITSPDI == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITSPDI);
            			}
            		
        			sb.append("|");
        		
        				if(ITCATP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITCATP);
            			}
            		
        			sb.append("|");
        		
        				if(ITUSID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITUSID);
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



		row1Struct row1 = new row1Struct();
tmap_inaudStruct tmap_inaud = new tmap_inaudStruct();





	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"tmap_inaud");
			
		int tos_count_tDBOutput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_2", "tDBOutput_1", "tSnowflakeOutput");
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
 		                    "INVENTORY_TRANS_AUDIT_TRAIL_INVAUD_HISTORY");
 		                    
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
     		                    						
     		                    						a("\"name\":\"INVENTORY_TRANS_AUDIT_TRAIL_INVAUD_HISTORY\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"ITFLAG\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITFLAG\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITHCOD\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITHCOD\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRLTP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRLTP\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRLOC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRLOC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCEN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCEN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRDAT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRDAT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRTYP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRTYP\"},{",s);
     		                    						
     		                    						a("\"name\":\"INUMBR\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"INUMBR\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRQTY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRQTY\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRRET\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRRET\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCST\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCST\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITREXT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITREXT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRVAT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRVAT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITCVAT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITCVAT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITVCLC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITVCLC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCUS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCUS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTPTP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTPTP\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRREG\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRREG\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRPOS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRPOS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITREVT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITREVT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRPRE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRPRE\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRACF\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRACF\"},{",s);
     		                    						
     		                    						a("\"name\":\"IDEPT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"IDEPT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISDEPT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISDEPT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ICLAS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ICLAS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISCLAS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISCLAS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRPOV\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRPOV\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRVND\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRVND\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSTY\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSTY\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSEA\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSEA\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSET\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSET\"},{",s);
     		                    						
     		                    						a("\"name\":\"ISTYPE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ISTYPE\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRPST\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRPST\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRHOT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRHOT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTRET\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTRET\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTCST\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTCST\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTREG\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTREG\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTPOS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTPOS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTCOD\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTCOD\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTRAT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTRAT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTVAT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTVAT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTCVT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTCVT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTMD\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTMD\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTID\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTID\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTPRO\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTPRO\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRACN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRACN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRADT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRADT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRREF\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRREF\"},{",s);
     		                    						
     		                    						a("\"name\":\"PGMNAM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"PGMNAM\"},{",s);
     		                    						
     		                    						a("\"name\":\"LGUSER\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"LGUSER\"},{",s);
     		                    						
     		                    						a("\"name\":\"CSCSH\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CSCSH\"},{",s);
     		                    						
     		                    						a("\"name\":\"CSRSTP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CSRSTP\"},{",s);
     		                    						
     		                    						a("\"name\":\"CSDRSN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"CSDRSN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITGLBN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITGLBN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITPCEN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITPCEN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITPDTE\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITPDTE\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSCN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSCN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSDT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSDT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRSTM\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRSTM\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRLOH\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRLOH\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRLAC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRLAC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRLLC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRLLC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCOH\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCOH\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCAC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCAC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRCLC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRCLC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITRDSC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITRDSC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITCHAN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITCHAN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITSLRC\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITSLRC\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITOHNO\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITOHNO\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITTPCD\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITTPCD\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITDPMT\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITDPMT\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITCATN\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITCATN\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITCATS\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITCATS\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITSPDI\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITSPDI\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITCATP\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITCATP\"},{",s);
     		                    						
     		                    						a("\"name\":\"ITUSID\",\"type\":[\"string\",\"null\"],\"talend.field.length\":\"16777216\",\"talend.field.dbType\":12,\"talend.field.dbColumnName\":\"ITUSID\"}]}",s);
     		                    						
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
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row1");
			
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
				talendJobLog.addCM("tMap_2", "tMap_1", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_row1_tMap_2 = 0;
		
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_tmap_inaud_tMap_2 = 0;
				
tmap_inaudStruct tmap_inaud_tmp = new tmap_inaudStruct();
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
                            log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "\"/data/talend/data_repository/INVAUD.zip\"");
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
                            log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ITFLAG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITHCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLOC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRDAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRTYP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("INUMBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRQTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITREXT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITVCLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCUS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRREG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPOS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITREVT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPRE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRACF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("IDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISDEPT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ICLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISCLAS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPOV")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRVND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSEA")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISTYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRPST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRHOT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTRET")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCST")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTREG")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPOS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTRAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTVAT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTCVT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTMD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPRO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRACN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRADT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRREF")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PGMNAM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LGUSER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSCSH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSRSTP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CSDRSN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITGLBN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITPCEN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITPDTE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSCN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSDT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRSTM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRLLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCOH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCAC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRCLC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITRDSC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCHAN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITSLRC")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITOHNO")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITTPCD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITDPMT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITSPDI")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITCATP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITUSID")+"}]");
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
				talendJobLog.addCM("tFileInputDelimited_2", "tFileInputDelimited_1", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				int limit_tFileInputDelimited_2 = -1;
				try{
					
						Object filename_tFileInputDelimited_2 = "/data/talend/data_repository/INVAUD.zip";	
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
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
							row1.ITFLAG = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 1;
					
							row1.ITHCOD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 2;
					
							row1.ITRLTP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 3;
					
							row1.ITRLOC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 4;
					
							row1.ITRCEN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 5;
					
							row1.ITRDAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 6;
					
							row1.ITRTYP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 7;
					
							row1.INUMBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 8;
					
							row1.ITRQTY = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 9;
					
							row1.ITRRET = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 10;
					
							row1.ITRCST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 11;
					
							row1.ITREXT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 12;
					
							row1.ITRVAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 13;
					
							row1.ITCVAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 14;
					
							row1.ITVCLC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 15;
					
							row1.ITRCUS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 16;
					
							row1.ITTPTP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 17;
					
							row1.ITRREG = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 18;
					
							row1.ITRPOS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 19;
					
							row1.ITREVT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 20;
					
							row1.ITRPRE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 21;
					
							row1.ITRACF = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 22;
					
							row1.IDEPT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 23;
					
							row1.ISDEPT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 24;
					
							row1.ICLAS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 25;
					
							row1.ISCLAS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 26;
					
							row1.ITRPOV = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 27;
					
							row1.ITRVND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 28;
					
							row1.ITRSTY = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 29;
					
							row1.ITRSEA = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 30;
					
							row1.ITRSET = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 31;
					
							row1.ISTYPE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 32;
					
							row1.ITRPST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 33;
					
							row1.ITRHOT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 34;
					
							row1.ITTRET = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 35;
					
							row1.ITTCST = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 36;
					
							row1.ITTREG = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 37;
					
							row1.ITTPOS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 38;
					
							row1.ITTCOD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 39;
					
							row1.ITTRAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 40;
					
							row1.ITTVAT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 41;
					
							row1.ITTCVT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 42;
					
							row1.ITTMD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 43;
					
							row1.ITTID = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 44;
					
							row1.ITTPRO = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 45;
					
							row1.ITRACN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 46;
					
							row1.ITRADT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 47;
					
							row1.ITRREF = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 48;
					
							row1.PGMNAM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 49;
					
							row1.LGUSER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 50;
					
							row1.CSCSH = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 51;
					
							row1.CSRSTP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 52;
					
							row1.CSDRSN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 53;
					
							row1.ITGLBN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 54;
					
							row1.ITPCEN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 55;
					
							row1.ITPDTE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 56;
					
							row1.ITRSCN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 57;
					
							row1.ITRSDT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 58;
					
							row1.ITRSTM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 59;
					
							row1.ITRLOH = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 60;
					
							row1.ITRLAC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 61;
					
							row1.ITRLLC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 62;
					
							row1.ITRCOH = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 63;
					
							row1.ITRCAC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 64;
					
							row1.ITRCLC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 65;
					
							row1.ITRDSC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 66;
					
							row1.ITCHAN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 67;
					
							row1.ITSLRC = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 68;
					
							row1.ITOHNO = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 69;
					
							row1.ITTPCD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 70;
					
							row1.ITDPMT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 71;
					
							row1.ITCATN = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 72;
					
							row1.ITCATS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 73;
					
							row1.ITSPDI = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 74;
					
							row1.ITCATP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 75;
					
							row1.ITUSID = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
				
										
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
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row1","tFileInputDelimited_2","tFileInputDelimited_1","tFileInputDelimited","tMap_2","tMap_1","tMap"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
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
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

tmap_inaud = null;


// # Output table : 'tmap_inaud'
count_tmap_inaud_tMap_2++;

tmap_inaud_tmp.ITFLAG = row1.ITFLAG;
tmap_inaud_tmp.ITHCOD = row1.ITHCOD;
tmap_inaud_tmp.ITRLTP = row1.ITRLTP;
tmap_inaud_tmp.ITRLOC = row1.ITRLOC;
tmap_inaud_tmp.ITRCEN = row1.ITRCEN;
tmap_inaud_tmp.ITRDAT = row1.ITRDAT;
tmap_inaud_tmp.ITRTYP = row1.ITRTYP;
tmap_inaud_tmp.INUMBR = row1.INUMBR;
tmap_inaud_tmp.ITRQTY = row1.ITRQTY;
tmap_inaud_tmp.ITRRET = row1.ITRRET;
tmap_inaud_tmp.ITRCST = row1.ITRCST;
tmap_inaud_tmp.ITREXT = row1.ITREXT;
tmap_inaud_tmp.ITRVAT = row1.ITRVAT;
tmap_inaud_tmp.ITCVAT = row1.ITCVAT;
tmap_inaud_tmp.ITVCLC = row1.ITVCLC;
tmap_inaud_tmp.ITRCUS = row1.ITRCUS;
tmap_inaud_tmp.ITTPTP = row1.ITTPTP;
tmap_inaud_tmp.ITRREG = row1.ITRREG;
tmap_inaud_tmp.ITRPOS = row1.ITRPOS;
tmap_inaud_tmp.ITREVT = row1.ITREVT;
tmap_inaud_tmp.ITRPRE = row1.ITRPRE;
tmap_inaud_tmp.ITRACF = row1.ITRACF;
tmap_inaud_tmp.IDEPT = row1.IDEPT;
tmap_inaud_tmp.ISDEPT = row1.ISDEPT;
tmap_inaud_tmp.ICLAS = row1.ICLAS;
tmap_inaud_tmp.ISCLAS = row1.ISCLAS;
tmap_inaud_tmp.ITRPOV = row1.ITRPOV;
tmap_inaud_tmp.ITRVND = row1.ITRVND;
tmap_inaud_tmp.ITRSTY = row1.ITRSTY;
tmap_inaud_tmp.ITRSEA = row1.ITRSEA;
tmap_inaud_tmp.ITRSET = row1.ITRSET;
tmap_inaud_tmp.ISTYPE = row1.ISTYPE;
tmap_inaud_tmp.ITRPST = row1.ITRPST;
tmap_inaud_tmp.ITRHOT = row1.ITRHOT;
tmap_inaud_tmp.ITTRET = row1.ITTRET;
tmap_inaud_tmp.ITTCST = row1.ITTCST;
tmap_inaud_tmp.ITTREG = row1.ITTREG;
tmap_inaud_tmp.ITTPOS = row1.ITTPOS;
tmap_inaud_tmp.ITTCOD = row1.ITTCOD;
tmap_inaud_tmp.ITTRAT = row1.ITTRAT;
tmap_inaud_tmp.ITTVAT = row1.ITTVAT;
tmap_inaud_tmp.ITTCVT = row1.ITTCVT;
tmap_inaud_tmp.ITTMD = row1.ITTMD;
tmap_inaud_tmp.ITTID = row1.ITTID;
tmap_inaud_tmp.ITTPRO = row1.ITTPRO;
tmap_inaud_tmp.ITRACN = row1.ITRACN;
tmap_inaud_tmp.ITRADT = row1.ITRADT;
tmap_inaud_tmp.ITRREF = row1.ITRREF;
tmap_inaud_tmp.PGMNAM = row1.PGMNAM;
tmap_inaud_tmp.LGUSER = row1.LGUSER;
tmap_inaud_tmp.CSCSH = row1.CSCSH;
tmap_inaud_tmp.CSRSTP = row1.CSRSTP;
tmap_inaud_tmp.CSDRSN = row1.CSDRSN;
tmap_inaud_tmp.ITGLBN = row1.ITGLBN;
tmap_inaud_tmp.ITPCEN = row1.ITPCEN;
tmap_inaud_tmp.ITPDTE = row1.ITPDTE;
tmap_inaud_tmp.ITRSCN = row1.ITRSCN;
tmap_inaud_tmp.ITRSDT = row1.ITRSDT;
tmap_inaud_tmp.ITRSTM = row1.ITRSTM;
tmap_inaud_tmp.ITRLOH = row1.ITRLOH;
tmap_inaud_tmp.ITRLAC = row1.ITRLAC;
tmap_inaud_tmp.ITRLLC = row1.ITRLLC;
tmap_inaud_tmp.ITRCOH = row1.ITRCOH;
tmap_inaud_tmp.ITRCAC = row1.ITRCAC;
tmap_inaud_tmp.ITRCLC = row1.ITRCLC;
tmap_inaud_tmp.ITRDSC = row1.ITRDSC;
tmap_inaud_tmp.ITCHAN = row1.ITCHAN;
tmap_inaud_tmp.ITSLRC = row1.ITSLRC;
tmap_inaud_tmp.ITOHNO = row1.ITOHNO;
tmap_inaud_tmp.ITTPCD = row1.ITTPCD;
tmap_inaud_tmp.ITDPMT = row1.ITDPMT;
tmap_inaud_tmp.ITCATN = row1.ITCATN;
tmap_inaud_tmp.ITCATS = row1.ITCATS;
tmap_inaud_tmp.ITSPDI = row1.ITSPDI;
tmap_inaud_tmp.ITCATP = row1.ITCATP;
tmap_inaud_tmp.ITUSID = row1.ITUSID;
tmap_inaud = tmap_inaud_tmp;
log.debug("tMap_2 - Outputting the record " + count_tmap_inaud_tMap_2 + " of the output table 'tmap_inaud'.");

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
// Start of branch "tmap_inaud"
if(tmap_inaud != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"tmap_inaud","tMap_2","tMap_1","tMap","tDBOutput_2","tDBOutput_1","tSnowflakeOutput"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("tmap_inaud - " + (tmap_inaud==null? "": tmap_inaud.toLogString()));
    			}
    		

        if (incomingEnforcer_tDBOutput_2 != null) {
            incomingEnforcer_tDBOutput_2.createNewRecord();
        }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITFLAG") != null){
                    incomingEnforcer_tDBOutput_2.put("ITFLAG", tmap_inaud.ITFLAG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITHCOD") != null){
                    incomingEnforcer_tDBOutput_2.put("ITHCOD", tmap_inaud.ITHCOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRLTP") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRLTP", tmap_inaud.ITRLTP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRLOC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRLOC", tmap_inaud.ITRLOC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCEN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCEN", tmap_inaud.ITRCEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRDAT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRDAT", tmap_inaud.ITRDAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRTYP") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRTYP", tmap_inaud.ITRTYP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("INUMBR") != null){
                    incomingEnforcer_tDBOutput_2.put("INUMBR", tmap_inaud.INUMBR);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRQTY") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRQTY", tmap_inaud.ITRQTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRRET") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRRET", tmap_inaud.ITRRET);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCST") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCST", tmap_inaud.ITRCST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITREXT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITREXT", tmap_inaud.ITREXT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRVAT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRVAT", tmap_inaud.ITRVAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITCVAT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITCVAT", tmap_inaud.ITCVAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITVCLC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITVCLC", tmap_inaud.ITVCLC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCUS") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCUS", tmap_inaud.ITRCUS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTPTP") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTPTP", tmap_inaud.ITTPTP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRREG") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRREG", tmap_inaud.ITRREG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRPOS") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRPOS", tmap_inaud.ITRPOS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITREVT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITREVT", tmap_inaud.ITREVT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRPRE") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRPRE", tmap_inaud.ITRPRE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRACF") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRACF", tmap_inaud.ITRACF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("IDEPT") != null){
                    incomingEnforcer_tDBOutput_2.put("IDEPT", tmap_inaud.IDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ISDEPT") != null){
                    incomingEnforcer_tDBOutput_2.put("ISDEPT", tmap_inaud.ISDEPT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ICLAS") != null){
                    incomingEnforcer_tDBOutput_2.put("ICLAS", tmap_inaud.ICLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ISCLAS") != null){
                    incomingEnforcer_tDBOutput_2.put("ISCLAS", tmap_inaud.ISCLAS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRPOV") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRPOV", tmap_inaud.ITRPOV);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRVND") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRVND", tmap_inaud.ITRVND);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSTY") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSTY", tmap_inaud.ITRSTY);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSEA") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSEA", tmap_inaud.ITRSEA);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSET") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSET", tmap_inaud.ITRSET);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ISTYPE") != null){
                    incomingEnforcer_tDBOutput_2.put("ISTYPE", tmap_inaud.ISTYPE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRPST") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRPST", tmap_inaud.ITRPST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRHOT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRHOT", tmap_inaud.ITRHOT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTRET") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTRET", tmap_inaud.ITTRET);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTCST") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTCST", tmap_inaud.ITTCST);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTREG") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTREG", tmap_inaud.ITTREG);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTPOS") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTPOS", tmap_inaud.ITTPOS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTCOD") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTCOD", tmap_inaud.ITTCOD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTRAT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTRAT", tmap_inaud.ITTRAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTVAT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTVAT", tmap_inaud.ITTVAT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTCVT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTCVT", tmap_inaud.ITTCVT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTMD") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTMD", tmap_inaud.ITTMD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTID") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTID", tmap_inaud.ITTID);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTPRO") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTPRO", tmap_inaud.ITTPRO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRACN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRACN", tmap_inaud.ITRACN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRADT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRADT", tmap_inaud.ITRADT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRREF") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRREF", tmap_inaud.ITRREF);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("PGMNAM") != null){
                    incomingEnforcer_tDBOutput_2.put("PGMNAM", tmap_inaud.PGMNAM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("LGUSER") != null){
                    incomingEnforcer_tDBOutput_2.put("LGUSER", tmap_inaud.LGUSER);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("CSCSH") != null){
                    incomingEnforcer_tDBOutput_2.put("CSCSH", tmap_inaud.CSCSH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("CSRSTP") != null){
                    incomingEnforcer_tDBOutput_2.put("CSRSTP", tmap_inaud.CSRSTP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("CSDRSN") != null){
                    incomingEnforcer_tDBOutput_2.put("CSDRSN", tmap_inaud.CSDRSN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITGLBN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITGLBN", tmap_inaud.ITGLBN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITPCEN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITPCEN", tmap_inaud.ITPCEN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITPDTE") != null){
                    incomingEnforcer_tDBOutput_2.put("ITPDTE", tmap_inaud.ITPDTE);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSCN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSCN", tmap_inaud.ITRSCN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSDT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSDT", tmap_inaud.ITRSDT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRSTM") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRSTM", tmap_inaud.ITRSTM);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRLOH") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRLOH", tmap_inaud.ITRLOH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRLAC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRLAC", tmap_inaud.ITRLAC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRLLC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRLLC", tmap_inaud.ITRLLC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCOH") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCOH", tmap_inaud.ITRCOH);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCAC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCAC", tmap_inaud.ITRCAC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRCLC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRCLC", tmap_inaud.ITRCLC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITRDSC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITRDSC", tmap_inaud.ITRDSC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITCHAN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITCHAN", tmap_inaud.ITCHAN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITSLRC") != null){
                    incomingEnforcer_tDBOutput_2.put("ITSLRC", tmap_inaud.ITSLRC);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITOHNO") != null){
                    incomingEnforcer_tDBOutput_2.put("ITOHNO", tmap_inaud.ITOHNO);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITTPCD") != null){
                    incomingEnforcer_tDBOutput_2.put("ITTPCD", tmap_inaud.ITTPCD);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITDPMT") != null){
                    incomingEnforcer_tDBOutput_2.put("ITDPMT", tmap_inaud.ITDPMT);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITCATN") != null){
                    incomingEnforcer_tDBOutput_2.put("ITCATN", tmap_inaud.ITCATN);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITCATS") != null){
                    incomingEnforcer_tDBOutput_2.put("ITCATS", tmap_inaud.ITCATS);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITSPDI") != null){
                    incomingEnforcer_tDBOutput_2.put("ITSPDI", tmap_inaud.ITSPDI);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITCATP") != null){
                    incomingEnforcer_tDBOutput_2.put("ITCATP", tmap_inaud.ITCATP);
                }
                //skip the put action if the input column doesn't appear in component runtime schema
                if (incomingEnforcer_tDBOutput_2 != null && incomingEnforcer_tDBOutput_2.getRuntimeSchema().getField("ITUSID") != null){
                    incomingEnforcer_tDBOutput_2.put("ITUSID", tmap_inaud.ITUSID);
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

} // End of branch "tmap_inaud"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";
	
	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "row1"




	
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
            if(!((Object)("/data/talend/data_repository/INVAUD.zip") instanceof java.io.InputStream)){
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
				log.debug("tMap_2 - Written records count in the table 'tmap_inaud': " + count_tmap_inaud_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row1",2,0,
			 			"tFileInputDelimited_2","tFileInputDelimited_1","tFileInputDelimited","tMap_2","tMap_1","tMap","output")) {
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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"tmap_inaud",2,0,
			 			"tMap_2","tMap_1","tMap","tDBOutput_2","tDBOutput_1","tSnowflakeOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk11", 0, "ok");
				}
				tFileDelete_1Process(globalMap);



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
                            log4jParamters_tFileDelete_1.append("PATH" + " = " + "\"/data/talend/data_repository/INVAUD.zip\"");
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
	java.io.File path_tFileDelete_1=new java.io.File("/data/talend/data_repository/INVAUD.zip");
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
    globalMap.put("tFileDelete_1_DELETE_PATH","/data/talend/data_repository/INVAUD.zip");
 


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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk10", 0, "ok");
				}
				tSendMail_2Process(globalMap);



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
                            log4jParamters_tSendMail_2.append("SUBJECT" + " = " + "jobName + \" Executed Successfully\"");
                        log4jParamters_tSendMail_2.append(" | ");
                            log4jParamters_tSendMail_2.append("MESSAGE" + " = " + "jobName +  \" Executed Successfully\"");
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
    String subject_tSendMail_2 = (jobName + " Executed Successfully");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

	String message_tSendMail_2 = ((jobName +  " Executed Successfully") == null || "".equals(jobName +  " Executed Successfully")) ? "\"\"" : (jobName +  " Executed Successfully") ;
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
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:XhAVpDu6/ZlZlai4JedVaR7u/o2kSzTQ7sFGCLKWPV43O9Zh"));
 		                        
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
   	 				runStat.updateStatOnConnection("OnComponentOk8", 0, "ok");
				}
				tDBConnection_2Process(globalMap);



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
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_2 = new StringBuilder();
                    log4jParamters_tDBConnection_2.append("Parameters:");
                            log4jParamters_tDBConnection_2.append("DB_VERSION" + " = " + "jt400_V6R1.jar");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("HOST" + " = " + "\"10.3.2.140\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("DBNAME" + " = " + "\"MM4R5LIB\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("USER" + " = " + "\"sqletl\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("PASS" + " = " + String.valueOf("enc:routine.encryption.key.v1:glO4f3Zp3TcvqKDKmhnpgY75iD+OR1jvAReuaJFDzIFXww==").substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("PROPERTIES" + " = " + "\"prompt=false\"");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_2.append(" | ");
                            log4jParamters_tDBConnection_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Connection");
                        log4jParamters_tDBConnection_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + (log4jParamters_tDBConnection_2) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_2", "tDBConnection_1", "tAS400Connection");
				talendJobLogProcess(globalMap);
			}
			
	

	 
    	String url_tDBConnection_2 = "jdbc:as400://" + "10.3.2.140" + "/" + "MM4R5LIB" + ";" + "prompt=false";
	String dbUser_tDBConnection_2 = "sqletl";
	
	
		 
	final String decryptedPassword_tDBConnection_2 = routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:fKrl41+Aao11GVG+a/koE+BVEVUmEkBbxvPnctU04YbAKw==");
		String dbPwd_tDBConnection_2 = decryptedPassword_tDBConnection_2;
	
	
	java.sql.Connection conn_tDBConnection_2 = null;
	
		
			String driverClass_tDBConnection_2 = "com.ibm.as400.access.AS400JDBCDriver";
			java.lang.Class jdbcclazz_tDBConnection_2 = java.lang.Class.forName(driverClass_tDBConnection_2);
			globalMap.put("driverClass_tDBConnection_2", driverClass_tDBConnection_2);
		
	    		log.debug("tDBConnection_2 - Driver ClassName: "+driverClass_tDBConnection_2+".");
			
	    		log.debug("tDBConnection_2 - Connection attempt to '" + url_tDBConnection_2 + "' with the username '" + dbUser_tDBConnection_2 + "'.");
			
			conn_tDBConnection_2 = java.sql.DriverManager.getConnection(url_tDBConnection_2,dbUser_tDBConnection_2,dbPwd_tDBConnection_2);
	    		log.debug("tDBConnection_2 - Connection to '" + url_tDBConnection_2 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_2", conn_tDBConnection_2);
	if (null != conn_tDBConnection_2) {
		
			log.debug("tDBConnection_2 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_2.setAutoCommit(false);
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
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_2 - "  + ("Done.") );

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
	


public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];

	
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

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

public static class row9Struct implements routines.system.IPersistableRow<row9Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[0];

	
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_INVAUD_Weekly, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_INVAUD_Weekly) {

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



		row9Struct row9 = new row9Struct();
row9Struct row10 = row9;





	
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
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row9");
			
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
		row9.type = lcm.getType();
		row9.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row9.priority = lcm.getPriority();
		row9.message = lcm.getMessage();
		row9.code = lcm.getCode();
		
		row9.moment = java.util.Calendar.getInstance().getTime();
	
    	row9.pid = pid;
		row9.root_pid = rootPid;
		row9.father_pid = fatherPid;
	
    	row9.project = projectName;
    	row9.job = jobName;
    	row9.context = contextStr;
    		
 



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
				
					,"row9","tLogCatcher_1","tLogCatcher_1","tLogCatcher","tLogRow_1","tLogRow_1","tLogRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row9 - " + (row9==null? "": row9.toLogString()));
    			}
    		
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




   				
	    		if(row9.moment != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.format_Date(row9.moment, "yyyy-MM-dd HH:mm:ss")				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.root_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.root_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.father_pid != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.father_pid)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.project != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.project)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.job != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.job)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.context != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.context)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.priority != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.priority)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.type != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.type)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.origin != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.origin)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.message != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.message)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(row9.code != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(row9.code)							
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

 
     row10 = row9;


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

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row9",2,0,
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
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
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
   	 				runStat.updateStatOnConnection("OnComponentOk9", 0, "ok");
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
                            log4jParamters_tDBClose_2.append("CONNECTION" + " = " + "tDBConnection_2");
                        log4jParamters_tDBClose_2.append(" | ");
                            log4jParamters_tDBClose_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Close");
                        log4jParamters_tDBClose_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + (log4jParamters_tDBClose_2) );
                    } 
                } 
            new BytesLimit65535_tDBClose_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBClose_2", "tDBClose_2", "tAS400Close");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBClose_2 begin ] stop
 */
	
	/**
	 * [tDBClose_2 main ] start
	 */

	

	
	
	currentComponent="tDBClose_2";
	
	



	java.sql.Connection conn_tDBClose_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_2");
	if(conn_tDBClose_2 != null && !conn_tDBClose_2.isClosed())
	{
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Closing the connection ")  + ("conn_tDBConnection_2")  + (" to the database.") );
        conn_tDBClose_2.close();
                if(log.isDebugEnabled())
            log.debug("tDBClose_2 - "  + ("Connection ")  + ("conn_tDBConnection_2")  + (" to the database has closed.") );
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
        final INVAUD_Weekly INVAUD_WeeklyClass = new INVAUD_Weekly();

        int exitCode = INVAUD_WeeklyClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'INVAUD_Weekly' - Done.");
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
			log.info("TalendJob: 'INVAUD_Weekly' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_vc7L4P3kEeyXoJA9zC8K9Q");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-06-21T12:49:15.565894200Z");

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
            java.io.InputStream inContext = INVAUD_Weekly.class.getClassLoader().getResourceAsStream("at_talend_jobs/invaud_weekly_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = INVAUD_Weekly.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'INVAUD_Weekly' - Started.");
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
errorCode = null;tDBRow_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBRow_2) {
globalMap.put("tDBRow_2_SUBPROCESS_STATE", -1);

e_tDBRow_2.printStackTrace();

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : INVAUD_Weekly");
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
        log.info("TalendJob: 'INVAUD_Weekly' - Finished - status: " + status + " returnCode: " + returnCode );

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_2");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_2", globalMap.get("conn_tDBConnection_2"));




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
 *     659353 characters generated by Talend Cloud Data Management Platform 
 *     on the June 21, 2023 at 8:49:15 AM EDT
 ************************************************************************************************/