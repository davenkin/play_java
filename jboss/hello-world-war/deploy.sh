#! /bin/sh
export JBOSS_HOME=/Users/twer/software/jboss-5.0.1.GA
export PATH=$JBOSS_HOME/bin:$PATH
jar -cvf hello-world.war *.jsp WEB-INF
open http://localhost:8080/hello-world/hello.jsp
