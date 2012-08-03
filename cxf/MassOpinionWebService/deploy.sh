#! /bin/sh
mvn clean package
cp target/MassOpinionWebService.war ~/Downloads/apache-tomcat-6.0.35/webapps/
