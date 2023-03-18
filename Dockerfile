FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD target/spring-boot-spring-security-jwt-authentication*.jar spring-boot-security-jwt-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/spring-boot-security-jwt-0.0.1-SNAPSHOT.jar"]