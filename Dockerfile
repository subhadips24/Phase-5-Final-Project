From openjdk:8
EXPOSE  80805
Add target/crud-api.war crud-api.war
ENTRYPOINT [ "java","-jar","crud-api.war" ]