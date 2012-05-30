#! /bin/sh


javac -cp ".:$JBOSS_HOME/common/lib/servlet-api.jar:$JBOSS_HOME/client/jboss-system-client.jar:$JBOSS_HOME/client/jboss-common-client.jar:$JBOSS_HOME/client/jboss-client.jar:$JBOSS_HOME/client/jbosssx-client.jar:$JBOSS_HOME/client/jboss-j2ee.jar:$JBOSS_HOME/client/jnp-client.jar:$JBOSS_HOME/client/log4j.jar" *.java


jar cvf greet.jar *.class META-INF/*.xml

cp greet.jar $JBOSS_HOME/server/default/deploy
