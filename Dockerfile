FROM gcr.io/google-appengine/openjdk:21
RUN wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.25/bin/apache-tomcat-10.1.25.tar.gz
RUN tar -xvf apache-tomcat-10.1.25.tar.gz
RUN mv apache-tomcat-10.1.25 /tomcat

COPY ./ /tomcat/webapps/ROOT/
CMD ["/tomcat/bin/catalina.sh", "run"]