#! /bin/sh

cp ../ejb/*.class .

javac -cp ".:$JBOSS_HOME/client/servlet-api.jar:$JBOSS_HOME/client/jboss-system-client.jar:$JBOSS_HOME/client/jboss-common-client.jar:$JBOSS_HOME/client/jboss-client.jar:$JBOSS_HOME/client/jbosssx-client.jar:$JBOSS_HOME/client/jboss-j2ee.jar:$JBOSS_HOME/client/jnp-client.jar:$JBOSS_HOME/client/log4j.jar" greetServlet.java

cp greetServlet.class greeterapp/WEB-INF/classes/

cp ../ejb/greet.jar greeterapp/WEB-INF/lib/

cd greeterapp 

jar cvf greeterapp.war *

cp greeterapp.war $JBOSS_HOME/server/default/deploy
