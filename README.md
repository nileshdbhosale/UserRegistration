update application.properties with your gmail Id and password

pring.mail.username = user@gmail.com
spring.mail.password = password

To run project please run
mvn clean install

To build docker image from project root dir
docker build -t UserRegistration .

Access application at
http://localhost:8001/register

Access H2 console at
http://localhost:8001/console
JDBC URL jdbc:h2:mem:testdb
username sa
password 
