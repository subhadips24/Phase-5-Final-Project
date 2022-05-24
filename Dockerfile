From openjdk:8
EXPOSE  80805
Add target/crud-api-web-1-0.0.1-SNAPSHOT.war crud-api-web-1-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","crud-api-web-1-0.0.1-SNAPSHOT.war" ]