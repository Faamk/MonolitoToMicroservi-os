# select image
FROM maven:3.5-jdk-8

EXPOSE 8081

# copy your source tree
COPY ./ ./

# build for release
RUN ["mvn", "package", "-Dmaven.test.skip=true"]

# set the startup command to run your binary
CMD ["java", "-jar", "./target/monolito.jar"]