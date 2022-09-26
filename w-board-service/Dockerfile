#Start with a base image containing Java runtime
FROM openjdk:18-slim as build
WORKDIR application
# Add Maintainer info
LABEL maintainer="rachel ryu <dev.rachelxx@gmail.com>"

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

#unpackage jar file
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)
#RUN java -Djarmode=layertools -jar application.jar extract


#FROM openjdk:18-slim
#WORKDIR application

#COPY --from=build application/dependencies/ ./
#COPY --from=build application/spring-boot-loader/ ./
#COPY --from=build application/snapshot-dependencies/ ./
#COPY --from=build application/application/ ./

#VOLUME /tmp
#ADD /target/w-board-service-0.0.1-SNAPSHOT.jar w-board-service.jar

# execute the application
ENTRYPOINT ["java","-jar","/app.jar","org.springframework.boot.loader.JarLauncher"]