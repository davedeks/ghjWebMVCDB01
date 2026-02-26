FROM eclipse-temurin:17-jre-focal
ADD target/webmvcdb03-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8055
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
