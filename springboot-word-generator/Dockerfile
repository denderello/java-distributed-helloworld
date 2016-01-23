FROM java:8-jre

COPY target/springboot-word-generator.jar /opt/denderello/springboot-word-generator.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/denderello/springboot-word-generator.jar"]