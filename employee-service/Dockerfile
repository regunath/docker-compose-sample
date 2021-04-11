FROM openjdk:11

ADD ./build/libs/employee-service-0.0.1-SNAPSHOT.jar employee-service-0.0.1-SNAPSHOT.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "employee-service-0.0.1-SNAPSHOT.jar"]
