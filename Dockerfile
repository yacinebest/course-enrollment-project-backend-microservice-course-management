#docker image build -t microservice-course-management-spring .
FROM openjdk:15
EXPOSE 8001
ADD build/libs/microservice-course-management-0.0.1-SNAPSHOT.jar microservice-course-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","/microservice-course-management-0.0.1-SNAPSHOT.jar"]