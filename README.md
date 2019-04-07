MicroService Design for IBM Hackathon SKill Management using Spring Boot, Zuul and Eureka 
------------------------------------------------------------------------------------------------------------
This example demonstrates the main features of the Zuul API gateway integrated into spring cloud :
•	Service auto registration via eureka
•	Service registration by address
•	Service registration by service ID
•	Filters (logging, authentication)
•	Serving static content
•	Service response Aggregation through Zuul
Technology Used
•	Spring boot 1.5.3.RELEASE
•	Eureka Service Discovery Client
•	Zuul API Gateway

Please review the attached project which contains two micro service (skillservice and ratingservice) , Service Discovery (eureka-server),  Api Gateway (zuul-server).

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Running Attached Project :

1.	Extract and you can find four maven projects 
2.	Run all the project with <b>mvn clean install –Dmaven.test.skip=true spring-boot:run</b>

3. After running all four maven spring-boot project :
Access Eureka Service Discovery through the URL - <b>http://localhost:8761/</b> . There you can find Zull Api Gateway service and other two micro service has register them selfs.
4. So end point to access two micro service will be the zuul end point i.e <b>http://localhost:9090 </b>. So zuul is going to route to the respective micro service based on the URL.

So to access the skillservice API : <b> http://localhost:9090/api/skill-service/<actual skill service api endpoint></b>

So to access the ratingservice API : <b>http://localhost:9090/api/rating-service/<actual rating service api endpoint></b>

<b>API List skill service (Running on port http://localhost:9092):</b>

    <b>Access Skill Categories :</b> http://localhost:9090/api/skill-service/skill/skillcategory

    <b>Access Skills based Category ID :</b> http://localhost:9090/api/skill-service/skill/2






