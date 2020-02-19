FROM java:8
VOLUME /tmp
EXPOSE 8888
ADD trySpring-0.0.1-SNAPSHOT.jar trySpring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","trySpring-0.0.1-SNAPSHOT.jar"]
 