# tomcat-juli-log4j2

Tomcat JULI facade for Log4j2. Open Source Java project under Apache License v2.0

### Current Stable Version is [1.0.0](https://search.maven.org/#search|ga|1|g%3Aorg.javastack%20a%3Atomcat-juli-log4j2)

---

## DOC

#### Usage

If you want to configure Tomcat to use log4j2 globally:

  1. Put `tomcat-juli-log4j2.jar` into `$CATALINA_HOME/bin/`
  2. Set `CLASSPATH="$CLASSPATH:${CATALINA_HOME}/bin/tomcat-juli-log4j2.jar"` in `${CATALINA_HOME}/bin/setenv.sh`  

---

## MAVEN

    <dependency>
        <groupId>org.javastack</groupId>
        <artifactId>tomcat-juli-log4j2</artifactId>
        <version>1.0.0</version>
    </dependency>

---
Inspired in [tomcat-juli-adapters](http://tomcat.apache.org/download-70.cgi), this code is Java-minimalistic version.
