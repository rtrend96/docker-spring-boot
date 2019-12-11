# Docker with Spring Boot and Mysql example
## Running a MySql docker instance in detach mode from the official repository on docker hub
##### docker run --detach --name=pet-mysql --env="MYSQL_ROOT_PASSWORD=mypassword" --env="MYSQL_DATABASE=db_pet"  mysql
I have put an alias pet-mysql for this mysql container, also I have put some environmental variables for root password and initialized a new database named db_pet.
Check logs if the mysql instance is up and running
#### docker logs pet-mysql
## Running the spring-boot application and linking it with Mysql
#### docker run -t --link pet-mysql:mysql --name=pet-spring -p 8081:8080 -d endrizylali/docker-spring-boot
The --link argument links the pet-spring container with the pet-mysql container also -p exposes the internal port 8080 to the external port 8081
The image endrizylali/docker-spring-boot is pulled from my docker account repository, to build it yourself follow the instruction below.
You can now check if it is working by going to
#### localhost:8081/persons
You will see a blank page because the database need to be populated, if you see an 404 error than the application is not running
# How to run and build the spring-boot application?
You need a mysql database also you need an initialized database named db_pet if you want to change it, you can change on the application.properties the configurations
You can run it from maven with the spring-boot plugin and the goal run command
#### mvn spring-boot:run
If you want to create an image docker for this application you can do it with the jib library
Note the command should be run as root on Linux because of docker
### For Ubuntu, remove sudo if you are as root
#### sudo mvn com.google.cloud.tools:jib-maven-plugin:dockerBuild -Dimage=endrizylali/docker-spring-boot:latest
With this command you can run it directly without referencing it on the pom.xml
The goal dockerBuild will just build it locally you can also run the goal build to push it directly on your docker hub account repository
In the argument -Dimage you can put a name of your preference
Now you can see your image listed on docker
#### docker images



