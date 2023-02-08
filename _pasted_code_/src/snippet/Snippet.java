package snippet;

public class Snippet {
	MYSQL:
	
	server:
	  port: 8081
	
	spring:
	  application:
	    name: user-service
	  datasource:
	    url: jdbc:mysql://${DB_HOST:localhost}:3306/user_microservice_db?createDatabaseIfNotExist=true
	    username: root
	    password: root
	    driver-class-name: com.mysql.jdbc.Driver
	  jpa:
	    database-platform: org.hibernate.dialect.MySQL57Dialect
	    properties:
	      hibernate:
	        format_sql: 'true'
	    show-sql: 'true'
	    hibernate:
	      ddl-auto: update
	
}

