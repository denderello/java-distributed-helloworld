FROM java:8-jre

COPY target/springboot-char-generator.jar /opt/denderello/springboot-char-generator.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "/opt/denderello/springboot-char-generator.jar"]