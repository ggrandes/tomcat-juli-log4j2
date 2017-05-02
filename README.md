# tomcat-juli-log4j2

Tomcat JULI facade for Log4j2. Open Source Java project under Apache License v2.0

### Current Stable Version is [1.0.0](https://search.maven.org/#search|ga|1|g%3Aorg.javastack%20a%3Atomcat-juli-log4j2)

---

## DOC

#### Usage

If you want to configure Tomcat to use log4j2 globally:

  1. Put `tomcat-juli-log4j2-1.x.x.jar, log4j-api-2.x.x.jar, log4j-core-2.x.x.jar` into `${CATALINA_HOME}/bin/`
  2. Set `CLASSPATH="$CLASSPATH:${CATALINA_HOME}/bin/tomcat-juli-log4j2-1.x.x.jar:${CATALINA_HOME}/bin/log4j-api-2.x.x.jar:${CATALINA_HOME}/bin/log4j-core-2.x.x.jar::${CATALINA_HOME}/bin/log4j-web-2.x.x.jar"`
  3. Set `JAVA_OPTS="$JAVA_OPTS -Dlog4j.configurationFile=${CATALINA_BASE}/conf/log4j2.properties"
  4. Put `log4j2.properties` into `${CATALINA_BASE}/conf/`
  
This is a sample log4j2.properties

```properties
# https://logging.apache.org/log4j/2.x/manual/configuration.html
monitorInterval = 30
status = warn
name = PropertiesConfig
# Console Text
appender.console.type = Console
appender.console.name = console
appender.console.layout.type = PatternLayout
appender.console.layout.pattern = %d{ISO8601} [%t] %p %c %MDC %replace{%NDC}{^null$}{[]} %m%n
# Default
rootLogger.level = info
rootLogger.appenderRef.root.ref = console
```

* This has been tested in Tomcat 8.5 and Log4j 2.8

---

## MAVEN

    <dependency>
        <groupId>org.javastack</groupId>
        <artifactId>tomcat-juli-log4j2</artifactId>
        <version>1.0.0</version>
    </dependency>

---
Inspired in [tomcat-juli-adapters](http://tomcat.apache.org/download-70.cgi), this code is Java-minimalistic version.
