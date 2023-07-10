
package at_talend_jobs.im_analytics_load_0_1;

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
 




	//the import part of tJavaRow_1
	//import java.util.List;

	//the import part of tJavaRow_2
	//import java.util.List;

	//the import part of tJavaRow_3
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: IM_analytics_load Purpose: <br>
 * Description:  <br>
 * @author thati, akhil
 * @version 8.0.1.20230418_1502-patch
 * @status 
 */
public class IM_analytics_load implements TalendJob {
	static {System.setProperty("TalendJob.log", "IM_analytics_load.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(IM_analytics_load.class);
	

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
	private final String jobName = "IM_analytics_load";
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
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_mk_McC9nEeueRPRT0Ix2VQ", "0.1");
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
				IM_analytics_load.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(IM_analytics_load.this, new Object[] { e , currentComponent, globalMap});
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

			public void tDBRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJavaRow_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					tDBRow_5_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBRow_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_4_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_6_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSendMail_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSendMail_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tSendMail_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tLogCatcher_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBRow_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					tDie_1Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tDBRow_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError2", 0, "error");
						}
					
					errorCode = null;
					tDie_2Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tDBRow_5_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("OnSubjobError3", 0, "error");
						}
					
					errorCode = null;
					tDie_3Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tDBRow_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_4_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_6_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSendMail_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tLogCatcher_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	



public static class row2Struct implements routines.system.IPersistableRow<row2Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[0];

	
			    public Boolean SRD;

				public Boolean getSRD () {
					return this.SRD;
				}

				public Boolean SRDIsNullable(){
				    return true;
				}
				public Boolean SRDIsKey(){
				    return false;
				}
				public Integer SRDLength(){
				    return null;
				}
				public Integer SRDPrecision(){
				    return null;
				}
				public String SRDDefault(){
				
					return null;
				
				}
				public String SRDComment(){
				
				    return "";
				
				}
				public String SRDPattern(){
				
					return "";
				
				}
				public String SRDOriginalDbColumnName(){
				
					return "SRD";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SRD = null;
           				} else {
           			    	this.SRD = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SRD = null;
           				} else {
           			    	this.SRD = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Boolean
				
						if(this.SRD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.SRD);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Boolean
				
						if(this.SRD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.SRD);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SRD="+String.valueOf(SRD));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SRD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SRD);
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



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tJavaRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_1", false);
		start_Hash.put("tJavaRow_1", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_1";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row2");
			
		int tos_count_tJavaRow_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJavaRow_1", "tJavaRow_1", "tJavaRow");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tJavaRow_1 = 0;

 



/**
 * [tJavaRow_1 begin ] stop
 */



	
	/**
	 * [tDBRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_3", false);
		start_Hash.put("tDBRow_3", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_3";
	
	
		int tos_count_tDBRow_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_3", "tDBRow_1", "tSnowflakeRow");
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
 		                    "\nselect CASE WHEN max(CALENDAR_DATE) = dateadd(day, -1, substr(convert_timezone('America/New_York', current_timestamp("
+")),0,10)) THEN TRUE ELSE FALSE END\nfrom SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL;\n");
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_1\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SRD\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SRD\",\"talend.field.dbColumnName\":\"SRD\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SRD\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_1\",\"di.table.label\":\"tDBRow_1\"}",s);
     		                    						
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
     		                    						
     		                    						a("\"name\":\"SRD\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SRD\",\"talend.field.dbColumnName\":\"SRD\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SRD\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_1\",\"di.table.label\":\"tDBRow_1\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_3_2_fisrt sst_tDBRow_3_2_fisrt = new SchemaSettingTool_tDBRow_3_2_fisrt();
 		                    
 		                    props_tDBRow_3.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_3_2_fisrt.getSchemaValue()));
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_1\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SRD\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SRD\",\"talend.field.dbColumnName\":\"SRD\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SRD\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_1\",\"di.table.label\":\"tDBRow_1\"}",s);
     		                    						
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
topology_tDBRow_3 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

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

    if (sourceOrSink_tDBRow_3 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBRow_3 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBRow_3;
        reader_tDBRow_3 = source_tDBRow_3.createReader(container_tDBRow_3);
	    reader_tDBRow_3 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_3, container_tDBRow_3);

            boolean multi_output_is_allowed_tDBRow_3 = false;
            org.talend.components.api.component.Connector c_tDBRow_3 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_3.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBRow_3 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBRow_3 = true;
                }
            }
            org.apache.avro.Schema schema_tDBRow_3 = props_tDBRow_3.getSchema(c_tDBRow_3, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_3 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBRow_3, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBRow_3 = null;

        // Iterate through the incoming data.
        boolean available_tDBRow_3 = reader_tDBRow_3.start();

        resourceMap.put("reader_tDBRow_3", reader_tDBRow_3);

        for (; available_tDBRow_3; available_tDBRow_3 = reader_tDBRow_3.advance()) {
			nb_line_tDBRow_3++;

			
			if (multi_output_is_allowed_tDBRow_3) {
				
					row2 = null;
				

				
			}
			

			try {
				Object data_tDBRow_3 = reader_tDBRow_3.getCurrent();
				

					if(multi_output_is_allowed_tDBRow_3) {
						row2 = new row2Struct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBRow_3 == null) {
            factory_tDBRow_3 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBRow_3.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBRow_3.setWrapped(factory_tDBRow_3.convertToAvro(data_tDBRow_3));
                Object columnValue_0_tDBRow_3 = outgoingEnforcer_tDBRow_3.get(0);
                        row2.SRD = (Boolean) (columnValue_0_tDBRow_3);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_3) {
				java.util.Map<String,Object> info_tDBRow_3 = e_tDBRow_3.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBRow_3 = null;
					if(info_tDBRow_3.containsKey("error")){
						errorMessage_tDBRow_3 = info_tDBRow_3.get("error");
					}else if(info_tDBRow_3.containsKey("errorMessage")){
						errorMessage_tDBRow_3 = info_tDBRow_3.get("errorMessage");
					}else{
						errorMessage_tDBRow_3 = "Rejected but error message missing";
					}
					errorMessage_tDBRow_3 = "Row "+ nb_line_tDBRow_3 + ": "+errorMessage_tDBRow_3;
					System.err.println(errorMessage_tDBRow_3);
				
					// If the record is reject, the main line record should put NULL
					row2 = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBRow_3 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBRow_3 = null;


 



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
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tJavaRow_1 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row2","tDBRow_3","tDBRow_1","tSnowflakeRow","tJavaRow_1","tJavaRow_1","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		

    System.out.println("table SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL status: "+ row2.SRD); 

    nb_line_tJavaRow_1++;   

 


	tos_count_tJavaRow_1++;

/**
 * [tJavaRow_1 main ] stop
 */
	
	/**
	 * [tJavaRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tJavaRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 process_data_end ] stop
 */

} // End of branch "row2"




	
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

    } // while  
    } // end of "if (sourceOrSink_tDBRow_3 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBRow_3 = null;
    if (reader_tDBRow_3 != null) {
        reader_tDBRow_3.close();
        resultMap_tDBRow_3 = reader_tDBRow_3.getReturnValues();
    }
if(resultMap_tDBRow_3!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBRow_3 : resultMap_tDBRow_3.entrySet()) {
		switch(entry_tDBRow_3.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBRow_3.setComponentData("tDBRow_3", "ERROR_MESSAGE", entry_tDBRow_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBRow_3.setComponentData("tDBRow_3", "NB_LINE", entry_tDBRow_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBRow_3.setComponentData("tDBRow_3", "NB_SUCCESS", entry_tDBRow_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBRow_3.setComponentData("tDBRow_3", "NB_REJECT", entry_tDBRow_3.getValue());
			break;
		default :
            StringBuilder studio_key_tDBRow_3 = new StringBuilder();
            for (int i_tDBRow_3 = 0; i_tDBRow_3 < entry_tDBRow_3.getKey().length(); i_tDBRow_3++) {
                char ch_tDBRow_3 = entry_tDBRow_3.getKey().charAt(i_tDBRow_3);
                if(Character.isUpperCase(ch_tDBRow_3) && i_tDBRow_3> 0) {
                	studio_key_tDBRow_3.append('_');
                }
                studio_key_tDBRow_3.append(ch_tDBRow_3);
            }
			container_tDBRow_3.setComponentData("tDBRow_3", studio_key_tDBRow_3.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBRow_3.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBRow_3", true);
end_Hash.put("tDBRow_3", System.currentTimeMillis());




/**
 * [tDBRow_3 end ] stop
 */

	
	/**
	 * [tJavaRow_1 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

globalMap.put("tJavaRow_1_NB_LINE",nb_line_tJavaRow_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row2",2,0,
			 			"tDBRow_3","tDBRow_1","tSnowflakeRow","tJavaRow_1","tJavaRow_1","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_1", true);
end_Hash.put("tJavaRow_1", System.currentTimeMillis());

   			if ( row2.SRD == true) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tDBRow_4Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}
   			if (row2.SRD == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If3", 0, "true");
					}
				tSendMail_2Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If3", 0, "false");
					}   	 
   				}
   			if (row2.SRD == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If2", 0, "true");
					}
				tDie_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If2", 0, "false");
					}   	 
   				}



/**
 * [tJavaRow_1 end ] stop
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
    if(resourceMap.get("reader_tDBRow_3")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBRow_3")).close();
		} catch (java.io.IOException e_tDBRow_3) {
			String errorMessage_tDBRow_3 = "failed to release the resource in tDBRow_3 :" + e_tDBRow_3.getMessage();
			System.err.println(errorMessage_tDBRow_3);
		}
	}
}
 



/**
 * [tDBRow_3 finally ] stop
 */

	
	/**
	 * [tJavaRow_1 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_1";
	
	

 



/**
 * [tJavaRow_1 finally ] stop
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
	


public static class row3Struct implements routines.system.IPersistableRow<row3Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[0];

	
			    public Boolean ADPT;

				public Boolean getADPT () {
					return this.ADPT;
				}

				public Boolean ADPTIsNullable(){
				    return true;
				}
				public Boolean ADPTIsKey(){
				    return false;
				}
				public Integer ADPTLength(){
				    return null;
				}
				public Integer ADPTPrecision(){
				    return null;
				}
				public String ADPTDefault(){
				
					return null;
				
				}
				public String ADPTComment(){
				
				    return "";
				
				}
				public String ADPTPattern(){
				
					return "";
				
				}
				public String ADPTOriginalDbColumnName(){
				
					return "ADPT";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ADPT = null;
           				} else {
           			    	this.ADPT = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.ADPT = null;
           				} else {
           			    	this.ADPT = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Boolean
				
						if(this.ADPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.ADPT);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Boolean
				
						if(this.ADPT == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.ADPT);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ADPT="+String.valueOf(ADPT));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ADPT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADPT);
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



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tJavaRow_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_2", false);
		start_Hash.put("tJavaRow_2", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_2";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row3");
			
		int tos_count_tJavaRow_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJavaRow_2", "tJavaRow_2", "tJavaRow");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tJavaRow_2 = 0;

 



/**
 * [tJavaRow_2 begin ] stop
 */



	
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
 		                    "\nselect CASE WHEN max(CALENDAR_DATE) = dateadd(day, -1, substr(convert_timezone('America/New_York', current_timestamp("
+")),0,10)) THEN TRUE ELSE FALSE END\nfrom SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY;\n");
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_2\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"ADPT\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ADPT\",\"talend.field.dbColumnName\":\"ADPT\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADPT\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_2\",\"di.table.label\":\"tDBRow_2\"}",s);
     		                    						
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
     		                    						
     		                    						a("\"name\":\"ADPT\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ADPT\",\"talend.field.dbColumnName\":\"ADPT\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADPT\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_2\",\"di.table.label\":\"tDBRow_2\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_4_2_fisrt sst_tDBRow_4_2_fisrt = new SchemaSettingTool_tDBRow_4_2_fisrt();
 		                    
 		                    props_tDBRow_4.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_4_2_fisrt.getSchemaValue()));
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_2\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"ADPT\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"ADPT\",\"talend.field.dbColumnName\":\"ADPT\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"ADPT\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_2\",\"di.table.label\":\"tDBRow_2\"}",s);
     		                    						
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
topology_tDBRow_4 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

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

    if (sourceOrSink_tDBRow_4 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBRow_4 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBRow_4;
        reader_tDBRow_4 = source_tDBRow_4.createReader(container_tDBRow_4);
	    reader_tDBRow_4 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_4, container_tDBRow_4);

            boolean multi_output_is_allowed_tDBRow_4 = false;
            org.talend.components.api.component.Connector c_tDBRow_4 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_4.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBRow_4 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBRow_4 = true;
                }
            }
            org.apache.avro.Schema schema_tDBRow_4 = props_tDBRow_4.getSchema(c_tDBRow_4, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_4 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBRow_4, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBRow_4 = null;

        // Iterate through the incoming data.
        boolean available_tDBRow_4 = reader_tDBRow_4.start();

        resourceMap.put("reader_tDBRow_4", reader_tDBRow_4);

        for (; available_tDBRow_4; available_tDBRow_4 = reader_tDBRow_4.advance()) {
			nb_line_tDBRow_4++;

			
			if (multi_output_is_allowed_tDBRow_4) {
				
					row3 = null;
				

				
			}
			

			try {
				Object data_tDBRow_4 = reader_tDBRow_4.getCurrent();
				

					if(multi_output_is_allowed_tDBRow_4) {
						row3 = new row3Struct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBRow_4 == null) {
            factory_tDBRow_4 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBRow_4.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBRow_4.setWrapped(factory_tDBRow_4.convertToAvro(data_tDBRow_4));
                Object columnValue_0_tDBRow_4 = outgoingEnforcer_tDBRow_4.get(0);
                        row3.ADPT = (Boolean) (columnValue_0_tDBRow_4);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_4) {
				java.util.Map<String,Object> info_tDBRow_4 = e_tDBRow_4.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBRow_4 = null;
					if(info_tDBRow_4.containsKey("error")){
						errorMessage_tDBRow_4 = info_tDBRow_4.get("error");
					}else if(info_tDBRow_4.containsKey("errorMessage")){
						errorMessage_tDBRow_4 = info_tDBRow_4.get("errorMessage");
					}else{
						errorMessage_tDBRow_4 = "Rejected but error message missing";
					}
					errorMessage_tDBRow_4 = "Row "+ nb_line_tDBRow_4 + ": "+errorMessage_tDBRow_4;
					System.err.println(errorMessage_tDBRow_4);
				
					// If the record is reject, the main line record should put NULL
					row3 = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBRow_4 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBRow_4 = null;


 



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
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tJavaRow_2 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row3","tDBRow_4","tDBRow_1","tSnowflakeRow","tJavaRow_2","tJavaRow_2","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		

    System.out.println("table SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY status: "+ row3.ADPT); 

    nb_line_tJavaRow_2++;   

 


	tos_count_tJavaRow_2++;

/**
 * [tJavaRow_2 main ] stop
 */
	
	/**
	 * [tJavaRow_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";
	
	

 



/**
 * [tJavaRow_2 process_data_begin ] stop
 */
	
	/**
	 * [tJavaRow_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";
	
	

 



/**
 * [tJavaRow_2 process_data_end ] stop
 */

} // End of branch "row3"




	
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

    } // while  
    } // end of "if (sourceOrSink_tDBRow_4 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBRow_4 = null;
    if (reader_tDBRow_4 != null) {
        reader_tDBRow_4.close();
        resultMap_tDBRow_4 = reader_tDBRow_4.getReturnValues();
    }
if(resultMap_tDBRow_4!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBRow_4 : resultMap_tDBRow_4.entrySet()) {
		switch(entry_tDBRow_4.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBRow_4.setComponentData("tDBRow_4", "ERROR_MESSAGE", entry_tDBRow_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBRow_4.setComponentData("tDBRow_4", "NB_LINE", entry_tDBRow_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBRow_4.setComponentData("tDBRow_4", "NB_SUCCESS", entry_tDBRow_4.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBRow_4.setComponentData("tDBRow_4", "NB_REJECT", entry_tDBRow_4.getValue());
			break;
		default :
            StringBuilder studio_key_tDBRow_4 = new StringBuilder();
            for (int i_tDBRow_4 = 0; i_tDBRow_4 < entry_tDBRow_4.getKey().length(); i_tDBRow_4++) {
                char ch_tDBRow_4 = entry_tDBRow_4.getKey().charAt(i_tDBRow_4);
                if(Character.isUpperCase(ch_tDBRow_4) && i_tDBRow_4> 0) {
                	studio_key_tDBRow_4.append('_');
                }
                studio_key_tDBRow_4.append(ch_tDBRow_4);
            }
			container_tDBRow_4.setComponentData("tDBRow_4", studio_key_tDBRow_4.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBRow_4.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBRow_4", true);
end_Hash.put("tDBRow_4", System.currentTimeMillis());




/**
 * [tDBRow_4 end ] stop
 */

	
	/**
	 * [tJavaRow_2 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";
	
	

globalMap.put("tJavaRow_2_NB_LINE",nb_line_tJavaRow_2);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row3",2,0,
			 			"tDBRow_4","tDBRow_1","tSnowflakeRow","tJavaRow_2","tJavaRow_2","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_2", true);
end_Hash.put("tJavaRow_2", System.currentTimeMillis());

   			if ( row3.ADPT == true) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If8", 0, "true");
					}
				tDBRow_5Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If8", 0, "false");
					}   	 
   				}
   			if ( row3.ADPT == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If5", 0, "true");
					}
				tSendMail_3Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If5", 0, "false");
					}   	 
   				}
   			if ( row3.ADPT == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If4", 0, "true");
					}
				tDie_2Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If4", 0, "false");
					}   	 
   				}



/**
 * [tJavaRow_2 end ] stop
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
    if(resourceMap.get("reader_tDBRow_4")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBRow_4")).close();
		} catch (java.io.IOException e_tDBRow_4) {
			String errorMessage_tDBRow_4 = "failed to release the resource in tDBRow_4 :" + e_tDBRow_4.getMessage();
			System.err.println(errorMessage_tDBRow_4);
		}
	}
}
 



/**
 * [tDBRow_4 finally ] stop
 */

	
	/**
	 * [tJavaRow_2 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_2";
	
	

 



/**
 * [tJavaRow_2 finally ] stop
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
	


public static class row11Struct implements routines.system.IPersistableRow<row11Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[0];

	
			    public Boolean SP_out;

				public Boolean getSP_out () {
					return this.SP_out;
				}

				public Boolean SP_outIsNullable(){
				    return true;
				}
				public Boolean SP_outIsKey(){
				    return false;
				}
				public Integer SP_outLength(){
				    return null;
				}
				public Integer SP_outPrecision(){
				    return null;
				}
				public String SP_outDefault(){
				
					return null;
				
				}
				public String SP_outComment(){
				
				    return "";
				
				}
				public String SP_outPattern(){
				
					return "";
				
				}
				public String SP_outOriginalDbColumnName(){
				
					return "SP_out";
				
				}

				



    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SP_out = null;
           				} else {
           			    	this.SP_out = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

        	try {

        		int length = 0;
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.SP_out = null;
           				} else {
           			    	this.SP_out = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Boolean
				
						if(this.SP_out == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.SP_out);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// Boolean
				
						if(this.SP_out == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.SP_out);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("SP_out="+String.valueOf(SP_out));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(SP_out == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SP_out);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row11Struct other) {

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



		row11Struct row11 = new row11Struct();




	
	/**
	 * [tJavaRow_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tJavaRow_3", false);
		start_Hash.put("tJavaRow_3", System.currentTimeMillis());
		
	
	currentComponent="tJavaRow_3";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row11");
			
		int tos_count_tJavaRow_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJavaRow_3", "tJavaRow_3", "tJavaRow");
				talendJobLogProcess(globalMap);
			}
			

int nb_line_tJavaRow_3 = 0;

 



/**
 * [tJavaRow_3 begin ] stop
 */



	
	/**
	 * [tDBRow_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBRow_5", false);
		start_Hash.put("tDBRow_5", System.currentTimeMillis());
		
	
	currentComponent="tDBRow_5";
	
	
		int tos_count_tDBRow_5 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBRow_5", "tDBRow_1", "tSnowflakeRow");
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
 		                    "\ncall SF_MSTR_PROD.SF_PROD.IM_analytics_refresh();\n");
 		                    
 		                    props_tDBRow_5.setValue("dieOnError",
 		                    false);
 		                    
 		                    props_tDBRow_5.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_5.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_5_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBRow_8\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SP_out\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SP_out\",\"talend.field.dbColumnName\":\"SP_out\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SP_out\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_8\",\"di.table.label\":\"tDBRow_8\"}",s);
     		                    						
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
     		                    						
     		                    						a("\"name\":\"SP_out\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SP_out\",\"talend.field.dbColumnName\":\"SP_out\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SP_out\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_8\",\"di.table.label\":\"tDBRow_8\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_5_2_fisrt sst_tDBRow_5_2_fisrt = new SchemaSettingTool_tDBRow_5_2_fisrt();
 		                    
 		                    props_tDBRow_5.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_5_2_fisrt.getSchemaValue()));
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_8\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SP_out\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SP_out\",\"talend.field.dbColumnName\":\"SP_out\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SP_out\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_8\",\"di.table.label\":\"tDBRow_8\"}",s);
     		                    						
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
topology_tDBRow_5 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

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

    if (sourceOrSink_tDBRow_5 instanceof org.talend.components.api.component.runtime.Source) {
        org.talend.components.api.component.runtime.Source source_tDBRow_5 =
                (org.talend.components.api.component.runtime.Source)sourceOrSink_tDBRow_5;
        reader_tDBRow_5 = source_tDBRow_5.createReader(container_tDBRow_5);
	    reader_tDBRow_5 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tDBRow_5, container_tDBRow_5);

            boolean multi_output_is_allowed_tDBRow_5 = false;
            org.talend.components.api.component.Connector c_tDBRow_5 = null;
            for (org.talend.components.api.component.Connector currentConnector : props_tDBRow_5.getAvailableConnectors(null, true)) {
                if (currentConnector.getName().equals("MAIN")) {
                    c_tDBRow_5 = currentConnector;
                }

                if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                    multi_output_is_allowed_tDBRow_5 = true;
                }
            }
            org.apache.avro.Schema schema_tDBRow_5 = props_tDBRow_5.getSchema(c_tDBRow_5, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tDBRow_5 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tDBRow_5, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tDBRow_5 = null;

        // Iterate through the incoming data.
        boolean available_tDBRow_5 = reader_tDBRow_5.start();

        resourceMap.put("reader_tDBRow_5", reader_tDBRow_5);

        for (; available_tDBRow_5; available_tDBRow_5 = reader_tDBRow_5.advance()) {
			nb_line_tDBRow_5++;

			
			if (multi_output_is_allowed_tDBRow_5) {
				
					row11 = null;
				

				
			}
			

			try {
				Object data_tDBRow_5 = reader_tDBRow_5.getCurrent();
				

					if(multi_output_is_allowed_tDBRow_5) {
						row11 = new row11Struct();
					}

					
        // Construct the factory once when the first data arrives.
        if (factory_tDBRow_5 == null) {
            factory_tDBRow_5 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tDBRow_5.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tDBRow_5.setWrapped(factory_tDBRow_5.convertToAvro(data_tDBRow_5));
                Object columnValue_0_tDBRow_5 = outgoingEnforcer_tDBRow_5.get(0);
                        row11.SP_out = (Boolean) (columnValue_0_tDBRow_5);
			} catch (org.talend.components.api.exception.DataRejectException e_tDBRow_5) {
				java.util.Map<String,Object> info_tDBRow_5 = e_tDBRow_5.getRejectInfo();
				
					//TODO use a method instead of getting method by the special key "error/errorMessage"
					Object errorMessage_tDBRow_5 = null;
					if(info_tDBRow_5.containsKey("error")){
						errorMessage_tDBRow_5 = info_tDBRow_5.get("error");
					}else if(info_tDBRow_5.containsKey("errorMessage")){
						errorMessage_tDBRow_5 = info_tDBRow_5.get("errorMessage");
					}else{
						errorMessage_tDBRow_5 = "Rejected but error message missing";
					}
					errorMessage_tDBRow_5 = "Row "+ nb_line_tDBRow_5 + ": "+errorMessage_tDBRow_5;
					System.err.println(errorMessage_tDBRow_5);
				
					// If the record is reject, the main line record should put NULL
					row11 = null;
				
			} // end of catch

                java.lang.Iterable<?> outgoingMainRecordsList_tDBRow_5 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tDBRow_5 = null;


 



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
// Start of branch "row11"
if(row11 != null) { 



	
	/**
	 * [tJavaRow_3 main ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row11","tDBRow_5","tDBRow_1","tSnowflakeRow","tJavaRow_3","tJavaRow_3","tJavaRow"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row11 - " + (row11==null? "": row11.toLogString()));
    			}
    		

    System.out.println("call SF_MSTR_PROD.SF_PROD.IM_analytics_refresh() status: "+ row11.SP_out); 

    nb_line_tJavaRow_3++;   

 


	tos_count_tJavaRow_3++;

/**
 * [tJavaRow_3 main ] stop
 */
	
	/**
	 * [tJavaRow_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 process_data_begin ] stop
 */
	
	/**
	 * [tJavaRow_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 process_data_end ] stop
 */

} // End of branch "row11"




	
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

    } // while  
    } // end of "if (sourceOrSink_tDBRow_5 instanceof ...Source)"
    java.util.Map<String, Object> resultMap_tDBRow_5 = null;
    if (reader_tDBRow_5 != null) {
        reader_tDBRow_5.close();
        resultMap_tDBRow_5 = reader_tDBRow_5.getReturnValues();
    }
if(resultMap_tDBRow_5!=null) {
	for(java.util.Map.Entry<String,Object> entry_tDBRow_5 : resultMap_tDBRow_5.entrySet()) {
		switch(entry_tDBRow_5.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tDBRow_5.setComponentData("tDBRow_5", "ERROR_MESSAGE", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_LINE", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_SUCCESS", entry_tDBRow_5.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tDBRow_5.setComponentData("tDBRow_5", "NB_REJECT", entry_tDBRow_5.getValue());
			break;
		default :
            StringBuilder studio_key_tDBRow_5 = new StringBuilder();
            for (int i_tDBRow_5 = 0; i_tDBRow_5 < entry_tDBRow_5.getKey().length(); i_tDBRow_5++) {
                char ch_tDBRow_5 = entry_tDBRow_5.getKey().charAt(i_tDBRow_5);
                if(Character.isUpperCase(ch_tDBRow_5) && i_tDBRow_5> 0) {
                	studio_key_tDBRow_5.append('_');
                }
                studio_key_tDBRow_5.append(ch_tDBRow_5);
            }
			container_tDBRow_5.setComponentData("tDBRow_5", studio_key_tDBRow_5.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tDBRow_5.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tDBRow_5", true);
end_Hash.put("tDBRow_5", System.currentTimeMillis());




/**
 * [tDBRow_5 end ] stop
 */

	
	/**
	 * [tJavaRow_3 end ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

globalMap.put("tJavaRow_3_NB_LINE",nb_line_tJavaRow_3);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row11",2,0,
			 			"tDBRow_5","tDBRow_1","tSnowflakeRow","tJavaRow_3","tJavaRow_3","tJavaRow","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tJavaRow_3", true);
end_Hash.put("tJavaRow_3", System.currentTimeMillis());

   			if (  row11.SP_out == true) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If6", 0, "true");
					}
				tDBRow_6Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If6", 0, "false");
					}   	 
   				}
   			if ( row11.SP_out == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If9", 0, "true");
					}
				tSendMail_6Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If9", 0, "false");
					}   	 
   				}
   			if ( row11.SP_out == false) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If7", 0, "true");
					}
				tDie_3Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If7", 0, "false");
					}   	 
   				}



/**
 * [tJavaRow_3 end ] stop
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
    if(resourceMap.get("reader_tDBRow_5")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tDBRow_5")).close();
		} catch (java.io.IOException e_tDBRow_5) {
			String errorMessage_tDBRow_5 = "failed to release the resource in tDBRow_5 :" + e_tDBRow_5.getMessage();
			System.err.println(errorMessage_tDBRow_5);
		}
	}
}
 



/**
 * [tDBRow_5 finally ] stop
 */

	
	/**
	 * [tJavaRow_3 finally ] start
	 */

	

	
	
	currentComponent="tJavaRow_3";
	
	

 



/**
 * [tJavaRow_3 finally ] stop
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
				talendJobLog.addCM("tDBRow_6", "tDBRow_1", "tSnowflakeRow");
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
 		                    "\nupdate SF_MSTR_PROD.SF_PROD.mstr_cube_refresh set status_datetime =  convert_timezone('America/New_York', current_tim"
+"estamp()), status_flag = 1,\nAccount  = current_user(), status_message =  'IM_analytics_daily_refresh_successful'  Where"
+" ID = 7;\n\n");
 		                    
 		                    props_tDBRow_6.setValue("dieOnError",
 		                    false);
 		                    
 		                    props_tDBRow_6.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tDBRow_6.setValue("commitCount",
 		                    10000);
 		                    
 		                    class SchemaSettingTool_tDBRow_6_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tDBRow_6\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SC\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SC\",\"talend.field.dbColumnName\":\"SC\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SC\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_6\",\"di.table.label\":\"tDBRow_6\"}",s);
     		                    						
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
     		                    						
     		                    						a("\"name\":\"SC\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SC\",\"talend.field.dbColumnName\":\"SC\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SC\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorCode\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"},{",s);
     		                    						
     		                    						a("\"name\":\"errorMessage\",\"type\":\"string\",\"talend.isLocked\":\"false\",\"talend.field.generated\":\"true\",\"talend.field.length\":\"255\"}],\"di.table.name\":\"tDBRow_6\",\"di.table.label\":\"tDBRow_6\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tDBRow_6_2_fisrt sst_tDBRow_6_2_fisrt = new SchemaSettingTool_tDBRow_6_2_fisrt();
 		                    
 		                    props_tDBRow_6.schemaReject.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tDBRow_6_2_fisrt.getSchemaValue()));
 		                    
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
     		                    						
     		                    						a("\"name\":\"tDBRow_6\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"SC\",\"type\":[\"boolean\",\"null\"],\"di.table.comment\":\"\",\"AVRO_TECHNICAL_KEY\":\"SC\",\"talend.field.dbColumnName\":\"SC\",\"di.column.talendType\":\"id_Boolean\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.table.label\":\"SC\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tDBRow_6\",\"di.table.label\":\"tDBRow_6\"}",s);
     		                    						
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

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tSendMail_4Process(globalMap);



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
	

public void tSendMail_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tSendMail_4");
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
	 * [tSendMail_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_4", false);
		start_Hash.put("tSendMail_4", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_4";
	
	
		int tos_count_tSendMail_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSendMail_4 = new StringBuilder();
                    log4jParamters_tSendMail_4.append("Parameters:");
                            log4jParamters_tSendMail_4.append("TO" + " = " + "context.To");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("FROM" + " = " + "context.From");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("NEED_PERSONAL_NAME" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("CC" + " = " + "\"\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("BCC" + " = " + "\"\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("SUBJECT" + " = " + "jobName + \" Executed Successfully\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("MESSAGE" + " = " + "jobName +  \" Executed Successfully\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("CHECK_ATTACHMENT" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("ATTACHMENTS" + " = " + "[]");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("HEADERS" + " = " + "[]");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("SMTP_PORT" + " = " + "25");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("SSL" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("STARTTLS" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("IMPORTANCE" + " = " + "Normal");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("AUTH_MODE" + " = " + "NO_AUTH");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("TEXT_SUBTYPE" + " = " + "plain");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("SET_LOCALHOST" + " = " + "false");
                        log4jParamters_tSendMail_4.append(" | ");
                            log4jParamters_tSendMail_4.append("CONFIGS" + " = " + "[]");
                        log4jParamters_tSendMail_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSendMail_4 - "  + (log4jParamters_tSendMail_4) );
                    } 
                } 
            new BytesLimit65535_tSendMail_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_4", "tSendMail_1", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_4 begin ] stop
 */
	
	/**
	 * [tSendMail_4 main ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 

	String smtpHost_tSendMail_4 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_4 = "25";
	String from_tSendMail_4 = (context.From);
    String to_tSendMail_4 = (context.To).replace(";",",");
    String cc_tSendMail_4 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_4 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_4 = (jobName + " Executed Successfully");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_4 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_4 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_4 = new java.util.ArrayList<String>();

	String message_tSendMail_4 = ((jobName +  " Executed Successfully") == null || "".equals(jobName +  " Executed Successfully")) ? "\"\"" : (jobName +  " Executed Successfully") ;
	java.util.Properties props_tSendMail_4 = System.getProperties();     
	props_tSendMail_4.put("mail.smtp.host", smtpHost_tSendMail_4);
	props_tSendMail_4.put("mail.smtp.port", smtpPort_tSendMail_4);
	
		props_tSendMail_4.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_4 - Connection attempt to '" + smtpHost_tSendMail_4 +"'.");
		
		  
			props_tSendMail_4.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_4 = javax.mail.Session.getInstance(props_tSendMail_4, null);    
		
		
			log.info("tSendMail_4 - Connection to '" + smtpHost_tSendMail_4 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_4 = new javax.mail.internet.MimeMessage(session_tSendMail_4);
		msg_tSendMail_4.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_4, null));
		msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_4, false));
		if (cc_tSendMail_4 != null) msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_4, false));
		if (bcc_tSendMail_4 != null) msg_tSendMail_4.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_4, false));
		msg_tSendMail_4.setSubject(subject_tSendMail_4);

		for (int i_tSendMail_4 = 0; i_tSendMail_4 < headers_tSendMail_4.size(); i_tSendMail_4++) {
			java.util.Map<String, String> header_tSendMail_4 = headers_tSendMail_4.get(i_tSendMail_4);
			msg_tSendMail_4.setHeader(header_tSendMail_4.get("KEY"), header_tSendMail_4.get("VALUE"));    
		}  
		msg_tSendMail_4.setSentDate(new Date());
		msg_tSendMail_4.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_4 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_4.setText(message_tSendMail_4,"ISO-8859-15", "plain");
		mp_tSendMail_4.addBodyPart(mbpText_tSendMail_4);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_4 = null;

		for (int i_tSendMail_4 = 0; i_tSendMail_4 < attachments_tSendMail_4.size(); i_tSendMail_4++){
			String filename_tSendMail_4 = attachments_tSendMail_4.get(i_tSendMail_4);
			javax.activation.FileDataSource fds_tSendMail_4 = null;
			java.io.File file_tSendMail_4 = new java.io.File(filename_tSendMail_4);
			
				if (!file_tSendMail_4.exists()){
					continue;
				}
			
    		if (file_tSendMail_4.isDirectory()){
				java.io.File[] subFiles_tSendMail_4 = file_tSendMail_4.listFiles();
				for(java.io.File subFile_tSendMail_4 : subFiles_tSendMail_4){
					if (subFile_tSendMail_4.isFile()){
						fds_tSendMail_4 = new javax.activation.FileDataSource(subFile_tSendMail_4.getAbsolutePath());
						mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_4.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4));
						mbpFile_tSendMail_4.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
						if(contentTransferEncoding_tSendMail_4.get(i_tSendMail_4).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
					}
				}
    		}else{
				mbpFile_tSendMail_4 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_4 = new javax.activation.FileDataSource(filename_tSendMail_4);
				mbpFile_tSendMail_4.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_4)); 
				mbpFile_tSendMail_4.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_4.getName()));
				if(contentTransferEncoding_tSendMail_4.get(i_tSendMail_4).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_4.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_4.addBodyPart(mbpFile_tSendMail_4);
			}
		}
		// -- set the content --
		msg_tSendMail_4.setContent(mp_tSendMail_4);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_4 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_4.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_4.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_4.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_4.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_4.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_4);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_4 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_4);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_4_ERROR_MESSAGE",e.getMessage());
  		
			
				log.error("tSendMail_4 - " + e.toString());
			
  			System.err.println(e.toString());
		
	}finally{
		props_tSendMail_4.remove("mail.smtp.host");
		props_tSendMail_4.remove("mail.smtp.port");
		
		props_tSendMail_4.remove("mail.mime.encodefilename");
		
		props_tSendMail_4.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_4++;

/**
 * [tSendMail_4 main ] stop
 */
	
	/**
	 * [tSendMail_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_4 end ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSendMail_4 - "  + ("Done.") );

ok_Hash.put("tSendMail_4", true);
end_Hash.put("tSendMail_4", System.currentTimeMillis());




/**
 * [tSendMail_4 end ] stop
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
	 * [tSendMail_4 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_4";
	
	

 



/**
 * [tSendMail_4 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_4_SUBPROCESS_STATE", 1);
	}
	

public void tSendMail_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_6_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tSendMail_6");
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
	 * [tSendMail_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_6", false);
		start_Hash.put("tSendMail_6", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_6";
	
	
		int tos_count_tSendMail_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSendMail_6 = new StringBuilder();
                    log4jParamters_tSendMail_6.append("Parameters:");
                            log4jParamters_tSendMail_6.append("TO" + " = " + "context.To");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("FROM" + " = " + "context.From");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("NEED_PERSONAL_NAME" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("CC" + " = " + "\"\"");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("BCC" + " = " + "\"\"");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("MESSAGE" + " = " + "jobName + \"  Failed!!!, this email is triggered from call SF_MSTR_PROD.SF_PROD.IM_analytics_refresh() Subjob because its missing data \" ");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("CHECK_ATTACHMENT" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("ATTACHMENTS" + " = " + "[]");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("HEADERS" + " = " + "[]");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("SMTP_PORT" + " = " + "25");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("SSL" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("STARTTLS" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("IMPORTANCE" + " = " + "Normal");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("AUTH_MODE" + " = " + "NO_AUTH");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("TEXT_SUBTYPE" + " = " + "plain");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("SET_LOCALHOST" + " = " + "false");
                        log4jParamters_tSendMail_6.append(" | ");
                            log4jParamters_tSendMail_6.append("CONFIGS" + " = " + "[]");
                        log4jParamters_tSendMail_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSendMail_6 - "  + (log4jParamters_tSendMail_6) );
                    } 
                } 
            new BytesLimit65535_tSendMail_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_6", "tSendMail_1", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_6 begin ] stop
 */
	
	/**
	 * [tSendMail_6 main ] start
	 */

	

	
	
	currentComponent="tSendMail_6";
	
	

 

	String smtpHost_tSendMail_6 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_6 = "25";
	String from_tSendMail_6 = (context.From);
    String to_tSendMail_6 = (context.To).replace(";",",");
    String cc_tSendMail_6 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_6 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_6 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_6 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_6 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_6 = new java.util.ArrayList<String>();

	String message_tSendMail_6 = ((jobName + "  Failed!!!, this email is triggered from call SF_MSTR_PROD.SF_PROD.IM_analytics_refresh() Subjob because its missing d"
+"ata " ) == null || "".equals(jobName + "  Failed!!!, this email is triggered from call SF_MSTR_PROD.SF_PROD.IM_analytics_refresh() Subjob because its missing d"
+"ata " )) ? "\"\"" : (jobName + "  Failed!!!, this email is triggered from call SF_MSTR_PROD.SF_PROD.IM_analytics_refresh() Subjob because its missing d"
+"ata " ) ;
	java.util.Properties props_tSendMail_6 = System.getProperties();     
	props_tSendMail_6.put("mail.smtp.host", smtpHost_tSendMail_6);
	props_tSendMail_6.put("mail.smtp.port", smtpPort_tSendMail_6);
	
		props_tSendMail_6.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_6 - Connection attempt to '" + smtpHost_tSendMail_6 +"'.");
		
		  
			props_tSendMail_6.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_6 = javax.mail.Session.getInstance(props_tSendMail_6, null);    
		
		
			log.info("tSendMail_6 - Connection to '" + smtpHost_tSendMail_6 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_6 = new javax.mail.internet.MimeMessage(session_tSendMail_6);
		msg_tSendMail_6.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_6, null));
		msg_tSendMail_6.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_6, false));
		if (cc_tSendMail_6 != null) msg_tSendMail_6.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_6, false));
		if (bcc_tSendMail_6 != null) msg_tSendMail_6.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_6, false));
		msg_tSendMail_6.setSubject(subject_tSendMail_6);

		for (int i_tSendMail_6 = 0; i_tSendMail_6 < headers_tSendMail_6.size(); i_tSendMail_6++) {
			java.util.Map<String, String> header_tSendMail_6 = headers_tSendMail_6.get(i_tSendMail_6);
			msg_tSendMail_6.setHeader(header_tSendMail_6.get("KEY"), header_tSendMail_6.get("VALUE"));    
		}  
		msg_tSendMail_6.setSentDate(new Date());
		msg_tSendMail_6.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_6 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_6 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_6.setText(message_tSendMail_6,"ISO-8859-15", "plain");
		mp_tSendMail_6.addBodyPart(mbpText_tSendMail_6);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_6 = null;

		for (int i_tSendMail_6 = 0; i_tSendMail_6 < attachments_tSendMail_6.size(); i_tSendMail_6++){
			String filename_tSendMail_6 = attachments_tSendMail_6.get(i_tSendMail_6);
			javax.activation.FileDataSource fds_tSendMail_6 = null;
			java.io.File file_tSendMail_6 = new java.io.File(filename_tSendMail_6);
			
				if (!file_tSendMail_6.exists()){
					continue;
				}
			
    		if (file_tSendMail_6.isDirectory()){
				java.io.File[] subFiles_tSendMail_6 = file_tSendMail_6.listFiles();
				for(java.io.File subFile_tSendMail_6 : subFiles_tSendMail_6){
					if (subFile_tSendMail_6.isFile()){
						fds_tSendMail_6 = new javax.activation.FileDataSource(subFile_tSendMail_6.getAbsolutePath());
						mbpFile_tSendMail_6 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_6.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_6));
						mbpFile_tSendMail_6.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_6.getName()));
						if(contentTransferEncoding_tSendMail_6.get(i_tSendMail_6).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_6.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_6.addBodyPart(mbpFile_tSendMail_6);
					}
				}
    		}else{
				mbpFile_tSendMail_6 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_6 = new javax.activation.FileDataSource(filename_tSendMail_6);
				mbpFile_tSendMail_6.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_6)); 
				mbpFile_tSendMail_6.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_6.getName()));
				if(contentTransferEncoding_tSendMail_6.get(i_tSendMail_6).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_6.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_6.addBodyPart(mbpFile_tSendMail_6);
			}
		}
		// -- set the content --
		msg_tSendMail_6.setContent(mp_tSendMail_6);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_6 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_6.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_6.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_6.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_6.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_6.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_6);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_6 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_6);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_6_ERROR_MESSAGE",e.getMessage());
  		
			
				log.error("tSendMail_6 - " + e.toString());
			
  			System.err.println(e.toString());
		
	}finally{
		props_tSendMail_6.remove("mail.smtp.host");
		props_tSendMail_6.remove("mail.smtp.port");
		
		props_tSendMail_6.remove("mail.mime.encodefilename");
		
		props_tSendMail_6.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_6++;

/**
 * [tSendMail_6 main ] stop
 */
	
	/**
	 * [tSendMail_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_6";
	
	

 



/**
 * [tSendMail_6 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_6";
	
	

 



/**
 * [tSendMail_6 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_6 end ] start
	 */

	

	
	
	currentComponent="tSendMail_6";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSendMail_6 - "  + ("Done.") );

ok_Hash.put("tSendMail_6", true);
end_Hash.put("tSendMail_6", System.currentTimeMillis());




/**
 * [tSendMail_6 end ] stop
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
	 * [tSendMail_6 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_6";
	
	

 



/**
 * [tSendMail_6 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_6_SUBPROCESS_STATE", 1);
	}
	

public void tDie_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDie_3");
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
	 * [tDie_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_3", false);
		start_Hash.put("tDie_3", System.currentTimeMillis());
		
	
	currentComponent="tDie_3";
	
	
		int tos_count_tDie_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_3 = new StringBuilder();
                    log4jParamters_tDie_3.append("Parameters:");
                            log4jParamters_tDie_3.append("MESSAGE" + " = " + "\"the end is near\"");
                        log4jParamters_tDie_3.append(" | ");
                            log4jParamters_tDie_3.append("CODE" + " = " + "4");
                        log4jParamters_tDie_3.append(" | ");
                            log4jParamters_tDie_3.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_3.append(" | ");
                            log4jParamters_tDie_3.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_3 - "  + (log4jParamters_tDie_3) );
                    } 
                } 
            new BytesLimit65535_tDie_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_3", "tDie_3", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_3 begin ] stop
 */
	
	/**
	 * [tDie_3 main ] start
	 */

	

	
	
	currentComponent="tDie_3";
	
	

	try {
				tLogCatcher_1.addMessage("tDie", "tDie_3", 5, "the end is near", 4);
				tLogCatcher_1Process(globalMap);
				
	globalMap.put("tDie_3_DIE_PRIORITY", 5);
	System.err.println("the end is near");
	
		log.error("tDie_3 - The die message: "+"the end is near");
	
	globalMap.put("tDie_3_DIE_MESSAGE", "the end is near");
	globalMap.put("tDie_3_DIE_MESSAGES", "the end is near");
	
	} catch (Exception | Error e_tDie_3) {
	    globalMap.put("tDie_3_ERROR_MESSAGE",e_tDie_3.getMessage());
		logIgnoredError(String.format("tDie_3 - tDie failed to log message due to internal error: %s", e_tDie_3), e_tDie_3);
	}
	
	currentComponent = "tDie_3";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_3_DIE_CODE", errorCode);        

    
	if(true){	
		TDieException e_tDie_3 = new TDieException();

		
			if(enableLogStash) {
				talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "the end is near", e_tDie_3);
				talendJobLogProcess(globalMap);
			}
		

		throw e_tDie_3;
	}

 


	tos_count_tDie_3++;

/**
 * [tDie_3 main ] stop
 */
	
	/**
	 * [tDie_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_3";
	
	

 



/**
 * [tDie_3 process_data_begin ] stop
 */
	
	/**
	 * [tDie_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_3";
	
	

 



/**
 * [tDie_3 process_data_end ] stop
 */
	
	/**
	 * [tDie_3 end ] start
	 */

	

	
	
	currentComponent="tDie_3";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_3 - "  + ("Done.") );

ok_Hash.put("tDie_3", true);
end_Hash.put("tDie_3", System.currentTimeMillis());




/**
 * [tDie_3 end ] stop
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
	 * [tDie_3 finally ] start
	 */

	

	
	
	currentComponent="tDie_3";
	
	

 



/**
 * [tDie_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_3_SUBPROCESS_STATE", 1);
	}
	

public void tSendMail_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSendMail_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tSendMail_3");
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
	 * [tSendMail_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_3", false);
		start_Hash.put("tSendMail_3", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_3";
	
	
		int tos_count_tSendMail_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSendMail_3 = new StringBuilder();
                    log4jParamters_tSendMail_3.append("Parameters:");
                            log4jParamters_tSendMail_3.append("TO" + " = " + "context.To");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("FROM" + " = " + "context.From");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("NEED_PERSONAL_NAME" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("CC" + " = " + "\"\"");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("BCC" + " = " + "\"\"");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("MESSAGE" + " = " + "jobName + \"  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY Subjob because its missing data \" ");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("CHECK_ATTACHMENT" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("ATTACHMENTS" + " = " + "[]");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("HEADERS" + " = " + "[]");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("SMTP_PORT" + " = " + "25");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("SSL" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("STARTTLS" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("IMPORTANCE" + " = " + "Normal");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("AUTH_MODE" + " = " + "NO_AUTH");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("TEXT_SUBTYPE" + " = " + "plain");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("SET_LOCALHOST" + " = " + "false");
                        log4jParamters_tSendMail_3.append(" | ");
                            log4jParamters_tSendMail_3.append("CONFIGS" + " = " + "[]");
                        log4jParamters_tSendMail_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSendMail_3 - "  + (log4jParamters_tSendMail_3) );
                    } 
                } 
            new BytesLimit65535_tSendMail_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_3", "tSendMail_1", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_3 begin ] stop
 */
	
	/**
	 * [tSendMail_3 main ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 

	String smtpHost_tSendMail_3 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_3 = "25";
	String from_tSendMail_3 = (context.From);
    String to_tSendMail_3 = (context.To).replace(";",",");
    String cc_tSendMail_3 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_3 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_3 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_3 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_3 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_3 = new java.util.ArrayList<String>();

	String message_tSendMail_3 = ((jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY Subjob because its missing data " ) == null || "".equals(jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY Subjob because its missing data " )) ? "\"\"" : (jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_STORE_POG_DAILY Subjob because its missing data " ) ;
	java.util.Properties props_tSendMail_3 = System.getProperties();     
	props_tSendMail_3.put("mail.smtp.host", smtpHost_tSendMail_3);
	props_tSendMail_3.put("mail.smtp.port", smtpPort_tSendMail_3);
	
		props_tSendMail_3.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_3 - Connection attempt to '" + smtpHost_tSendMail_3 +"'.");
		
		  
			props_tSendMail_3.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_3 = javax.mail.Session.getInstance(props_tSendMail_3, null);    
		
		
			log.info("tSendMail_3 - Connection to '" + smtpHost_tSendMail_3 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_3 = new javax.mail.internet.MimeMessage(session_tSendMail_3);
		msg_tSendMail_3.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_3, null));
		msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_3, false));
		if (cc_tSendMail_3 != null) msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_3, false));
		if (bcc_tSendMail_3 != null) msg_tSendMail_3.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_3, false));
		msg_tSendMail_3.setSubject(subject_tSendMail_3);

		for (int i_tSendMail_3 = 0; i_tSendMail_3 < headers_tSendMail_3.size(); i_tSendMail_3++) {
			java.util.Map<String, String> header_tSendMail_3 = headers_tSendMail_3.get(i_tSendMail_3);
			msg_tSendMail_3.setHeader(header_tSendMail_3.get("KEY"), header_tSendMail_3.get("VALUE"));    
		}  
		msg_tSendMail_3.setSentDate(new Date());
		msg_tSendMail_3.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_3 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_3.setText(message_tSendMail_3,"ISO-8859-15", "plain");
		mp_tSendMail_3.addBodyPart(mbpText_tSendMail_3);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_3 = null;

		for (int i_tSendMail_3 = 0; i_tSendMail_3 < attachments_tSendMail_3.size(); i_tSendMail_3++){
			String filename_tSendMail_3 = attachments_tSendMail_3.get(i_tSendMail_3);
			javax.activation.FileDataSource fds_tSendMail_3 = null;
			java.io.File file_tSendMail_3 = new java.io.File(filename_tSendMail_3);
			
				if (!file_tSendMail_3.exists()){
					continue;
				}
			
    		if (file_tSendMail_3.isDirectory()){
				java.io.File[] subFiles_tSendMail_3 = file_tSendMail_3.listFiles();
				for(java.io.File subFile_tSendMail_3 : subFiles_tSendMail_3){
					if (subFile_tSendMail_3.isFile()){
						fds_tSendMail_3 = new javax.activation.FileDataSource(subFile_tSendMail_3.getAbsolutePath());
						mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_3.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_3));
						mbpFile_tSendMail_3.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_3.getName()));
						if(contentTransferEncoding_tSendMail_3.get(i_tSendMail_3).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_3.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_3.addBodyPart(mbpFile_tSendMail_3);
					}
				}
    		}else{
				mbpFile_tSendMail_3 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_3 = new javax.activation.FileDataSource(filename_tSendMail_3);
				mbpFile_tSendMail_3.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_3)); 
				mbpFile_tSendMail_3.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_3.getName()));
				if(contentTransferEncoding_tSendMail_3.get(i_tSendMail_3).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_3.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_3.addBodyPart(mbpFile_tSendMail_3);
			}
		}
		// -- set the content --
		msg_tSendMail_3.setContent(mp_tSendMail_3);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_3 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_3.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_3.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_3.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_3.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_3.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_3);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_3 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_3);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_3_ERROR_MESSAGE",e.getMessage());
  		
			
				log.error("tSendMail_3 - " + e.toString());
			
  			System.err.println(e.toString());
		
	}finally{
		props_tSendMail_3.remove("mail.smtp.host");
		props_tSendMail_3.remove("mail.smtp.port");
		
		props_tSendMail_3.remove("mail.mime.encodefilename");
		
		props_tSendMail_3.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_3++;

/**
 * [tSendMail_3 main ] stop
 */
	
	/**
	 * [tSendMail_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 process_data_end ] stop
 */
	
	/**
	 * [tSendMail_3 end ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tSendMail_3 - "  + ("Done.") );

ok_Hash.put("tSendMail_3", true);
end_Hash.put("tSendMail_3", System.currentTimeMillis());




/**
 * [tSendMail_3 end ] stop
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
	 * [tSendMail_3 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_3";
	
	

 



/**
 * [tSendMail_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSendMail_3_SUBPROCESS_STATE", 1);
	}
	

public void tDie_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDie_2");
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
	 * [tDie_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_2", false);
		start_Hash.put("tDie_2", System.currentTimeMillis());
		
	
	currentComponent="tDie_2";
	
	
		int tos_count_tDie_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_2 = new StringBuilder();
                    log4jParamters_tDie_2.append("Parameters:");
                            log4jParamters_tDie_2.append("MESSAGE" + " = " + "\"the end is near\"");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("CODE" + " = " + "4");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_2.append(" | ");
                            log4jParamters_tDie_2.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + (log4jParamters_tDie_2) );
                    } 
                } 
            new BytesLimit65535_tDie_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_2", "tDie_2", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_2 begin ] stop
 */
	
	/**
	 * [tDie_2 main ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

	try {
				tLogCatcher_1.addMessage("tDie", "tDie_2", 5, "the end is near", 4);
				tLogCatcher_1Process(globalMap);
				
	globalMap.put("tDie_2_DIE_PRIORITY", 5);
	System.err.println("the end is near");
	
		log.error("tDie_2 - The die message: "+"the end is near");
	
	globalMap.put("tDie_2_DIE_MESSAGE", "the end is near");
	globalMap.put("tDie_2_DIE_MESSAGES", "the end is near");
	
	} catch (Exception | Error e_tDie_2) {
	    globalMap.put("tDie_2_ERROR_MESSAGE",e_tDie_2.getMessage());
		logIgnoredError(String.format("tDie_2 - tDie failed to log message due to internal error: %s", e_tDie_2), e_tDie_2);
	}
	
	currentComponent = "tDie_2";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_2_DIE_CODE", errorCode);        

    
	if(true){	
		TDieException e_tDie_2 = new TDieException();

		
			if(enableLogStash) {
				talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "the end is near", e_tDie_2);
				talendJobLogProcess(globalMap);
			}
		

		throw e_tDie_2;
	}

 


	tos_count_tDie_2++;

/**
 * [tDie_2 main ] stop
 */
	
	/**
	 * [tDie_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 process_data_begin ] stop
 */
	
	/**
	 * [tDie_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 process_data_end ] stop
 */
	
	/**
	 * [tDie_2 end ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_2 - "  + ("Done.") );

ok_Hash.put("tDie_2", true);
end_Hash.put("tDie_2", System.currentTimeMillis());




/**
 * [tDie_2 end ] stop
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
	 * [tDie_2 finally ] start
	 */

	

	
	
	currentComponent="tDie_2";
	
	

 



/**
 * [tDie_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_2_SUBPROCESS_STATE", 1);
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
                            log4jParamters_tSendMail_2.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
                        log4jParamters_tSendMail_2.append(" | ");
                            log4jParamters_tSendMail_2.append("MESSAGE" + " = " + "jobName + \"  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL Subjob because its missing data \" ");
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
				talendJobLog.addCM("tSendMail_2", "tSendMail_1", "tSendMail");
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
    String subject_tSendMail_2 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_2 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_2 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_2 = new java.util.ArrayList<String>();

	String message_tSendMail_2 = ((jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL Sub"
+"job because its missing data " ) == null || "".equals(jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL Sub"
+"job because its missing data " )) ? "\"\"" : (jobName + "  Failed!!!, this email is triggered from SF_MSTR_PROD.SF_PROD.SF_INVENTORY_MANAGEMENT_DASHBOARD_ITEM_SERVICE_LEVEL Sub"
+"job because its missing data " ) ;
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
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tDie_1");
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
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";
	
	
		int tos_count_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDie_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDie_1 = new StringBuilder();
                    log4jParamters_tDie_1.append("Parameters:");
                            log4jParamters_tDie_1.append("MESSAGE" + " = " + "\"the end is near\"");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("CODE" + " = " + "4");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("PRIORITY" + " = " + "5");
                        log4jParamters_tDie_1.append(" | ");
                            log4jParamters_tDie_1.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + (log4jParamters_tDie_1) );
                    } 
                } 
            new BytesLimit65535_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDie_1", "tDie_1", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

	try {
				tLogCatcher_1.addMessage("tDie", "tDie_1", 5, "the end is near", 4);
				tLogCatcher_1Process(globalMap);
				
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("the end is near");
	
		log.error("tDie_1 - The die message: "+"the end is near");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "the end is near");
	globalMap.put("tDie_1_DIE_MESSAGES", "the end is near");
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        

    
	if(true){	
		TDieException e_tDie_1 = new TDieException();

		
			if(enableLogStash) {
				talendJobLog.addJobExceptionMessage(currentComponent, cLabel, "the end is near", e_tDie_1);
				talendJobLogProcess(globalMap);
			}
		

		throw e_tDie_1;
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 
                if(log.isDebugEnabled())
            log.debug("tDie_1 - "  + ("Done.") );

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
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
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";
	
	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
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
	


public static class row10Struct implements routines.system.IPersistableRow<row10Struct> {
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[0];

	
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
			if(length > commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

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
    final static byte[] commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load = new byte[0];
    static byte[] commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[0];

	
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
			if(length > commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length, utf8Charset);
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
			if(length > commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length) {
				if(length < 1024 && commonByteArray_AT_TALEND_JOBS_IM_analytics_load.length == 0) {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[1024];
				} else {
   					commonByteArray_AT_TALEND_JOBS_IM_analytics_load = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length);
			strReturn = new String(commonByteArray_AT_TALEND_JOBS_IM_analytics_load, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

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

		synchronized(commonByteArrayLock_AT_TALEND_JOBS_IM_analytics_load) {

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
	 * [tSendMail_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tSendMail_5", false);
		start_Hash.put("tSendMail_5", System.currentTimeMillis());
		
	
	currentComponent="tSendMail_5";
	
	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row10");
			
		int tos_count_tSendMail_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tSendMail_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tSendMail_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tSendMail_5 = new StringBuilder();
                    log4jParamters_tSendMail_5.append("Parameters:");
                            log4jParamters_tSendMail_5.append("TO" + " = " + "context.To");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("FROM" + " = " + "context.From");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("NEED_PERSONAL_NAME" + " = " + "false");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("CC" + " = " + "\"\"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("BCC" + " = " + "\"\"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("SUBJECT" + " = " + "jobName + \" job Failed !!!!\"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("MESSAGE" + " = " + "jobName + \" job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. \"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("CHECK_ATTACHMENT" + " = " + "false");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("ATTACHMENTS" + " = " + "[]");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("HEADERS" + " = " + "[]");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("SMTP_HOST" + " = " + "\"Mail13.vsi-nj.vitshoppe.com\"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("SMTP_PORT" + " = " + "25");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("SSL" + " = " + "false");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("STARTTLS" + " = " + "false");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("IMPORTANCE" + " = " + "Normal");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("AUTH_MODE" + " = " + "NO_AUTH");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("DIE_ON_ERROR" + " = " + "true");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("TEXT_SUBTYPE" + " = " + "plain");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("SET_LOCALHOST" + " = " + "false");
                        log4jParamters_tSendMail_5.append(" | ");
                            log4jParamters_tSendMail_5.append("CONFIGS" + " = " + "[]");
                        log4jParamters_tSendMail_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tSendMail_5 - "  + (log4jParamters_tSendMail_5) );
                    } 
                } 
            new BytesLimit65535_tSendMail_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tSendMail_5", "tSendMail_1", "tSendMail");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tSendMail_5 begin ] stop
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
	 * [tSendMail_5 main ] start
	 */

	

	
	
	currentComponent="tSendMail_5";
	
	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row10","tLogRow_1","tLogRow_1","tLogRow","tSendMail_5","tSendMail_1","tSendMail"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row10 - " + (row10==null? "": row10.toLogString()));
    			}
    		

 

	String smtpHost_tSendMail_5 = "Mail13.vsi-nj.vitshoppe.com";
        String smtpPort_tSendMail_5 = "25";
	String from_tSendMail_5 = (context.From);
    String to_tSendMail_5 = (context.To).replace(";",",");
    String cc_tSendMail_5 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String bcc_tSendMail_5 = (("")==null || "".equals(""))?null:("").replace(";",",");
    String subject_tSendMail_5 = (jobName + " job Failed !!!!");
    
	java.util.List<java.util.Map<String, String>> headers_tSendMail_5 = new java.util.ArrayList<java.util.Map<String,String>>();
	java.util.List<String> attachments_tSendMail_5 = new java.util.ArrayList<String>();
	java.util.List<String> contentTransferEncoding_tSendMail_5 = new java.util.ArrayList<String>();

	String message_tSendMail_5 = ((jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ") == null || "".equals(jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ")) ? "\"\"" : (jobName + " job Failed !!!! Please check the logs in VSI_LINUX_WRKSPC on talend for more information. ") ;
	java.util.Properties props_tSendMail_5 = System.getProperties();     
	props_tSendMail_5.put("mail.smtp.host", smtpHost_tSendMail_5);
	props_tSendMail_5.put("mail.smtp.port", smtpPort_tSendMail_5);
	
		props_tSendMail_5.put("mail.mime.encodefilename", "true");     
	try {
		
			log.info("tSendMail_5 - Connection attempt to '" + smtpHost_tSendMail_5 +"'.");
		
		  
			props_tSendMail_5.put("mail.smtp.auth", "false");
			javax.mail.Session session_tSendMail_5 = javax.mail.Session.getInstance(props_tSendMail_5, null);    
		
		
			log.info("tSendMail_5 - Connection to '" + smtpHost_tSendMail_5 + "' has succeeded.");
		
		javax.mail.Message msg_tSendMail_5 = new javax.mail.internet.MimeMessage(session_tSendMail_5);
		msg_tSendMail_5.setFrom(new javax.mail.internet.InternetAddress(from_tSendMail_5, null));
		msg_tSendMail_5.setRecipients(javax.mail.Message.RecipientType.TO,javax.mail.internet.InternetAddress.parse(to_tSendMail_5, false));
		if (cc_tSendMail_5 != null) msg_tSendMail_5.setRecipients(javax.mail.Message.RecipientType.CC, javax.mail.internet.InternetAddress.parse(cc_tSendMail_5, false));
		if (bcc_tSendMail_5 != null) msg_tSendMail_5.setRecipients(javax.mail.Message.RecipientType.BCC, javax.mail.internet.InternetAddress.parse(bcc_tSendMail_5, false));
		msg_tSendMail_5.setSubject(subject_tSendMail_5);

		for (int i_tSendMail_5 = 0; i_tSendMail_5 < headers_tSendMail_5.size(); i_tSendMail_5++) {
			java.util.Map<String, String> header_tSendMail_5 = headers_tSendMail_5.get(i_tSendMail_5);
			msg_tSendMail_5.setHeader(header_tSendMail_5.get("KEY"), header_tSendMail_5.get("VALUE"));    
		}  
		msg_tSendMail_5.setSentDate(new Date());
		msg_tSendMail_5.setHeader("X-Priority", "3"); //High->1 Normal->3 Low->5
		javax.mail.Multipart mp_tSendMail_5 = new javax.mail.internet.MimeMultipart();
		javax.mail.internet.MimeBodyPart mbpText_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
		mbpText_tSendMail_5.setText(message_tSendMail_5,"ISO-8859-15", "plain");
		mp_tSendMail_5.addBodyPart(mbpText_tSendMail_5);
  
		javax.mail.internet.MimeBodyPart mbpFile_tSendMail_5 = null;

		for (int i_tSendMail_5 = 0; i_tSendMail_5 < attachments_tSendMail_5.size(); i_tSendMail_5++){
			String filename_tSendMail_5 = attachments_tSendMail_5.get(i_tSendMail_5);
			javax.activation.FileDataSource fds_tSendMail_5 = null;
			java.io.File file_tSendMail_5 = new java.io.File(filename_tSendMail_5);
			
				if (!file_tSendMail_5.exists()){
					continue;
				}
			
    		if (file_tSendMail_5.isDirectory()){
				java.io.File[] subFiles_tSendMail_5 = file_tSendMail_5.listFiles();
				for(java.io.File subFile_tSendMail_5 : subFiles_tSendMail_5){
					if (subFile_tSendMail_5.isFile()){
						fds_tSendMail_5 = new javax.activation.FileDataSource(subFile_tSendMail_5.getAbsolutePath());
						mbpFile_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
						mbpFile_tSendMail_5.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_5));
						mbpFile_tSendMail_5.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_5.getName()));
						if(contentTransferEncoding_tSendMail_5.get(i_tSendMail_5).equalsIgnoreCase("base64")){
							mbpFile_tSendMail_5.setHeader("Content-Transfer-Encoding", "base64");
						}
						mp_tSendMail_5.addBodyPart(mbpFile_tSendMail_5);
					}
				}
    		}else{
				mbpFile_tSendMail_5 = new javax.mail.internet.MimeBodyPart();
				fds_tSendMail_5 = new javax.activation.FileDataSource(filename_tSendMail_5);
				mbpFile_tSendMail_5.setDataHandler(new javax.activation.DataHandler(fds_tSendMail_5)); 
				mbpFile_tSendMail_5.setFileName(javax.mail.internet.MimeUtility.encodeText(fds_tSendMail_5.getName()));
				if(contentTransferEncoding_tSendMail_5.get(i_tSendMail_5).equalsIgnoreCase("base64")){
					mbpFile_tSendMail_5.setHeader("Content-Transfer-Encoding", "base64");
				}
				mp_tSendMail_5.addBodyPart(mbpFile_tSendMail_5);
			}
		}
		// -- set the content --
		msg_tSendMail_5.setContent(mp_tSendMail_5);
		// add handlers for main MIME types
		javax.activation.MailcapCommandMap mc_tSendMail_5 = ( javax.activation.MailcapCommandMap)javax.activation.CommandMap.getDefaultCommandMap();
		mc_tSendMail_5.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
		mc_tSendMail_5.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
		mc_tSendMail_5.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
		mc_tSendMail_5.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
		mc_tSendMail_5.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
		javax.activation.CommandMap.setDefaultCommandMap(mc_tSendMail_5);
		// add com.sun.mail.handlers to job imports / depenencies (TESB-27110)
		com.sun.mail.handlers.text_plain text_plain_h_tSendMail_5 = null;
		// -- Send the message --
		javax.mail.Transport.send(msg_tSendMail_5);
	} catch(java.lang.Exception e){
globalMap.put("tSendMail_5_ERROR_MESSAGE",e.getMessage());
  		
			throw(e);
		
	}finally{
		props_tSendMail_5.remove("mail.smtp.host");
		props_tSendMail_5.remove("mail.smtp.port");
		
		props_tSendMail_5.remove("mail.mime.encodefilename");
		
		props_tSendMail_5.remove("mail.smtp.auth");     
	}

 


	tos_count_tSendMail_5++;

/**
 * [tSendMail_5 main ] stop
 */
	
	/**
	 * [tSendMail_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSendMail_5";
	
	

 



/**
 * [tSendMail_5 process_data_begin ] stop
 */
	
	/**
	 * [tSendMail_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tSendMail_5";
	
	

 



/**
 * [tSendMail_5 process_data_end ] stop
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
	 * [tSendMail_5 end ] start
	 */

	

	
	
	currentComponent="tSendMail_5";
	
	

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row10",2,0,
			 			"tLogRow_1","tLogRow_1","tLogRow","tSendMail_5","tSendMail_1","tSendMail","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tSendMail_5 - "  + ("Done.") );

ok_Hash.put("tSendMail_5", true);
end_Hash.put("tSendMail_5", System.currentTimeMillis());




/**
 * [tSendMail_5 end ] stop
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
	 * [tSendMail_5 finally ] start
	 */

	

	
	
	currentComponent="tSendMail_5";
	
	

 



/**
 * [tSendMail_5 finally ] stop
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
	

public void tPrejob_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		mdcInfo.forEach(org.slf4j.MDC::put);
		org.slf4j.MDC.put("_subJobName", "tPrejob_2");
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
	 * [tPrejob_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_2", false);
		start_Hash.put("tPrejob_2", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_2";
	
	
		int tos_count_tPrejob_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_2", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_2 begin ] stop
 */
	
	/**
	 * [tPrejob_2 main ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 


	tos_count_tPrejob_2++;

/**
 * [tPrejob_2 main ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_2 end ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 

ok_Hash.put("tPrejob_2", true);
end_Hash.put("tPrejob_2", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tPrejob_2 end ] stop
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
	 * [tPrejob_2 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_2";
	
	

 



/**
 * [tPrejob_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_2_SUBPROCESS_STATE", 1);
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
	
	
			cLabel="SF_MSTR_PROD";
		
		int tos_count_tDBConnection_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "SF_MSTR_PROD", "tSnowflakeConnection");
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
 		                    "SF_MSTR_PROD");
 		                    
 		                    props_tDBConnection_1.setValue("schemaName",
 		                    "SF_PROD");
 		                    
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
 		                        routines.system.PasswordEncryptUtil.decryptPassword("enc:routine.encryption.key.v1:cff0ALrArV355VUV+TSGz/6fo+ADeqlL/4K9RPrAYIuwR8+J"));
 		                        
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
	
	
			cLabel="SF_MSTR_PROD";
		


 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="SF_MSTR_PROD";
		


 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="SF_MSTR_PROD";
		


 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";
	
	
			cLabel="SF_MSTR_PROD";
		
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
	
	
			cLabel="SF_MSTR_PROD";
		
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
        final IM_analytics_load IM_analytics_loadClass = new IM_analytics_load();

        int exitCode = IM_analytics_loadClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'IM_analytics_load' - Done.");
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
			log.info("TalendJob: 'IM_analytics_load' - Start.");
		

                java.util.Set<Object> jobInfoKeys = jobInfo.keySet();
                for(Object jobInfoKey: jobInfoKeys) {
                    org.slf4j.MDC.put("_" + jobInfoKey.toString(), jobInfo.get(jobInfoKey).toString());
                }
                org.slf4j.MDC.put("_pid", pid);
                org.slf4j.MDC.put("_rootPid", rootPid);
                org.slf4j.MDC.put("_fatherPid", fatherPid);
                org.slf4j.MDC.put("_projectName", projectName);
                org.slf4j.MDC.put("_startTimestamp",java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC ).format( java.time.format.DateTimeFormatter.ISO_INSTANT ));
                org.slf4j.MDC.put("_jobRepositoryId","_mk_McC9nEeueRPRT0Ix2VQ");
                org.slf4j.MDC.put("_compiledAtTimestamp","2023-07-10T13:20:41.420131500Z");

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
            java.io.InputStream inContext = IM_analytics_load.class.getClassLoader().getResourceAsStream("at_talend_jobs/im_analytics_load_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = IM_analytics_load.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            log.info("TalendJob: 'IM_analytics_load' - Started.");
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
errorCode = null;tPrejob_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_2) {
globalMap.put("tPrejob_2_SUBPROCESS_STATE", -1);

e_tPrejob_2.printStackTrace();

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
errorCode = null;tDBRow_3Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tDBRow_3) {
globalMap.put("tDBRow_3_SUBPROCESS_STATE", -1);

e_tDBRow_3.printStackTrace();

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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : IM_analytics_load");
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
        log.info("TalendJob: 'IM_analytics_load' - Finished - status: " + status + " returnCode: " + returnCode );

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
 *     330003 characters generated by Talend Cloud Data Management Platform 
 *     on the July 10, 2023 at 9:20:41 AM EDT
 ************************************************************************************************/