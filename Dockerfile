FROM tomcat:jre8 
MAINTAINER Anthony Dahanne <anthony.dahanne@gmail.com>

# adding the war
COPY /target/petclinic.war /usr/local/tomcat/webapps/petclinic.war
VOLUME /usr/local/tomcat/webapps
