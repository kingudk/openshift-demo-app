
cd /tmp/src

mvn clean package

cp -rp /tmp/src/target/web-demo-*.war $TOMCAT_APPS/web-demo.war
cp /tmp/src/deployment-descriptor.xml $TOMCAT_APPS/web-demo.xml

export WAR_FILE=$(readlink -f $TOMCAT_APPS/web-demo.war)
