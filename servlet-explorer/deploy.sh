#! /bin/sh
mvn clean package
cp target/servlet-explorer.war ~/Downloads/apache-tomcat-6.0.35/webapps/
