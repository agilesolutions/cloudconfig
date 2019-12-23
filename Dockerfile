FROM openjdk:8
ADD target/configserver.jar /usr/src/myapp.jar
WORKDIR  /usr/src
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8888
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar myapp.jar" ]