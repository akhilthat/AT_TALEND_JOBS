$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Dtalend.component.manager.m2.repository=%cd%/../lib' '-Xmx4096M' '-Xmx4096M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/ant-1.10.1.jar;../lib/log4j-slf4j-impl-2.17.1.jar;../lib/log4j-api-2.17.1.jar;../lib/log4j-core-2.17.1.jar;../lib/accessors-smart-2.4.7.jar;../lib/talend-proxy-1.0.2.jar;../lib/asm-9.1.jar;../lib/audit-log4j2-1.16.1.jar;../lib/jboss-marshalling-2.0.12.Final.jar;../lib/oro-2.0.8.jar;../lib/logging-event-layout-1.16.1.jar;../lib/crypto-utils-7.0.5.jar;../lib/jsch-0.2.1.jar;../lib/json-smart-2.4.7.jar;../lib/commons-lang3-3.10.jar;../lib/slf4j-api-1.7.34.jar;../lib/job-audit-1.5.jar;../lib/talend_file_enhanced-1.3.jar;../lib/dom4j-2.1.3.jar;../lib/audit-common-1.16.1.jar;koerber_data_into_snowflake_0_1.jar;' at_talend_jobs.koerber_data_into_snowflake_0_1.koerber_data_into_snowflake $args
