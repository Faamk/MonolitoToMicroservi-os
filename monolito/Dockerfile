# select image
FROM maven:3.5-jdk-8

EXPOSE 8081

COPY pom.xml /tmp/
COPY src /tmp/src/

WORKDIR /tmp/

# build for release
RUN ["mvn", "package", "-Dmaven.test.skip=true"]

# set the startup command to run your binary
CMD ["java", "-jar", "/tmp/target/monolito.jar"]