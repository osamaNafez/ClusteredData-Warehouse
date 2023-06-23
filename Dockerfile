FROM openjdk:11-jre-slim
COPY target/clustereddata-warehouse-0.0.1-SNAPSHOT.jar /clustereddata-warehouse.jar
CMD ["java", "-jar", "/clustereddata-warehouse.jar"]