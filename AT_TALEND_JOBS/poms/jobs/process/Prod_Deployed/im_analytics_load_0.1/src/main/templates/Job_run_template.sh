#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/log4j-slf4j-impl-2.17.1.jar:$ROOT_PATH/../lib/log4j-api-2.17.1.jar:$ROOT_PATH/../lib/log4j-core-2.17.1.jar:$ROOT_PATH/../lib/activation.jar:$ROOT_PATH/../lib/pax-url-aether-2.6.12.jar:$ROOT_PATH/../lib/stax-ex-1.8.jar:$ROOT_PATH/../lib/asm-9.1.jar:$ROOT_PATH/../lib/javax.annotation-api-1.3.jar:$ROOT_PATH/../lib/maven-resolver-spi-1.8.2.jar:$ROOT_PATH/../lib/daikon-exception-7.0.5.jar:$ROOT_PATH/../lib/pax-url-aether-support-2.6.12.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/httpclient-4.5.13.jar:$ROOT_PATH/../lib/istack-commons-runtime-3.0.7.jar:$ROOT_PATH/../lib/talend-codegen-utils.jar:$ROOT_PATH/../lib/javax.inject-1.jar:$ROOT_PATH/../lib/job-audit-1.5.jar:$ROOT_PATH/../lib/jackson-mapper-asl-1.9.16-TALEND.jar:$ROOT_PATH/../lib/maven-resolver-api-1.8.2.jar:$ROOT_PATH/../lib/avro-1.8.1.jar:$ROOT_PATH/../lib/checker-qual-3.5.0.jar:$ROOT_PATH/../lib/talend_file_enhanced-1.3.jar:$ROOT_PATH/../lib/snowflake-jdbc-3.13.28.jar:$ROOT_PATH/../lib/auto-service-1.0-rc2.jar:$ROOT_PATH/../lib/auto-common-0.3.jar:$ROOT_PATH/../lib/components-common-0.37.20.jar:$ROOT_PATH/../lib/jackson-annotations-2.13.4.jar:$ROOT_PATH/../lib/commons-compress-1.21.jar:$ROOT_PATH/../lib/failureaccess-1.0.1.jar:$ROOT_PATH/../lib/jaxb-api-2.3.1.jar:$ROOT_PATH/../lib/maven-resolver-impl-1.8.2.jar:$ROOT_PATH/../lib/maven-resolver-util-1.8.2.jar:$ROOT_PATH/../lib/components-api-0.37.20.jar:$ROOT_PATH/../lib/commons-lang3-3.10.jar:$ROOT_PATH/../lib/commons-beanutils-1.9.4.jar:$ROOT_PATH/../lib/jaxb-runtime-2.3.1.jar:$ROOT_PATH/../lib/json-io-4.13.1-TALEND.jar:$ROOT_PATH/../lib/jsr305-1.3.9.jar:$ROOT_PATH/../lib/lombok-1.18.24.jar:$ROOT_PATH/../lib/components-snowflake-definition-0.37.20.jar:$ROOT_PATH/../lib/paranamer-2.7.jar:$ROOT_PATH/../lib/audit-common-1.16.1.jar:$ROOT_PATH/../lib/maven-resolver-named-locks-1.8.2.jar:$ROOT_PATH/../lib/accessors-smart-2.4.7.jar:$ROOT_PATH/../lib/javax.activation-api-1.2.0.jar:$ROOT_PATH/../lib/error_prone_annotations-2.3.4.jar:$ROOT_PATH/../lib/jackson-core-asl-1.9.16-TALEND.jar:$ROOT_PATH/../lib/talend-sql-injection-utils-1.0.jar:$ROOT_PATH/../lib/FastInfoset-1.2.15.jar:$ROOT_PATH/../lib/jboss-marshalling-2.0.12.Final.jar:$ROOT_PATH/../lib/daikon-7.0.5.jar:$ROOT_PATH/../lib/org.talend.dataquality.parser.jar:$ROOT_PATH/../lib/j2objc-annotations-1.3.jar:$ROOT_PATH/../lib/json-smart-2.4.7.jar:$ROOT_PATH/../lib/slf4j-api-1.7.34.jar:$ROOT_PATH/../lib/org.osgi.service.component.annotations-1.3.0.jar:$ROOT_PATH/../lib/jackson-core-2.13.4.jar:$ROOT_PATH/../lib/dom4j-2.1.3.jar:$ROOT_PATH/../lib/commons-codec-1.14.jar:$ROOT_PATH/../lib/components-snowflake-runtime-0.37.20.jar:$ROOT_PATH/../lib/snappy-java-1.1.1.3.jar:$ROOT_PATH/../lib/commons-configuration2-2.8.0.jar:$ROOT_PATH/../lib/commons-text-1.10.0.jar:$ROOT_PATH/../lib/antlr-runtime-3.5.2.jar:$ROOT_PATH/../lib/xz-1.5.jar:$ROOT_PATH/../lib/audit-log4j2-1.16.1.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:$ROOT_PATH/../lib/logging-event-layout-1.16.1.jar:$ROOT_PATH/../lib/joda-time-2.8.2.jar:$ROOT_PATH/../lib/crypto-utils-7.0.5.jar:$ROOT_PATH/../lib/httpcore-4.4.13.jar:$ROOT_PATH/../lib/guava-30.0-jre.jar:$ROOT_PATH/../lib/talendcsv-1.1.0.jar:$ROOT_PATH/../lib/jakarta.mail-1.6.7.jar:$ROOT_PATH/../lib/jackson-databind-2.13.4.2.jar:$ROOT_PATH/../lib/javax.servlet-api-3.1.0.jar:$ROOT_PATH/../lib/txw2-2.3.1.jar:$ROOT_PATH/im_analytics_load_0_1.jar: at_talend_jobs.im_analytics_load_0_1.IM_analytics_load --context=Default "$@"
