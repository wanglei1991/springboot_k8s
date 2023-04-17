FROM openjdk:8-alpine

COPY target/springboot_k8s-0.0.1-SNAPSHOT.jar /app/springboot-k8s-demo.jar

ENTRYPOINT ["java", "-jar" , "/app/springboot-k8s-demo.jar"]
