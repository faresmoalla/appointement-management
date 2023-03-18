FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD target/spring-boot-spring-security-jwt-authentication*.jar spring-boot-spring-security-jwt-authentication-2.0.jar 
ENTRYPOINT ["java","-jar","/tpAchatProject-2.0.jar"]