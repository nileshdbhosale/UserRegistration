FROM java:8
WORKDIR /
Add target/user-0.0.1-SNAPSHOT.jar UserRegistration.jar
EXPOSE 8080
CMD java -jar UserRegistration.jar