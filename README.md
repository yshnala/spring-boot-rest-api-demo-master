# Sample REST API with Spring Boot

## 安裝步驟

**1. Clone**

```bash
https://github.com/yshnala/spring-boot-rest-api-demo-master.git
```

**2. Create Mysql Database**

```bash
create database user_database
```

**3.Update mysql username and password**

+ open `src/main/resources/application.properties`

+ update`spring.datasource.username` and  `spring.datasource.password` 

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/spring-boot-rest-api-demo-0.0.1-SNAPSHOT.jar

```



The app will start running at <http://localhost:8080>.

## Rest APIs

    GET /api/v1/users
    
    POST /api/v1/users
    
    GET /api/v1/users/{userId}
    
    PUT /api/v1/users/{userId}
    
    DELETE /api/v1/users/{userId}


