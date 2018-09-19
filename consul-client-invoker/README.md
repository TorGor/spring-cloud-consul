# spring cloud config client 
## eureka+config+acutor

## project list
* eureka-client-config-client (cluster for eureka client ,config client)


> EUREKA
>> EUREKA CLIENT + CONFIG CLIENT
***
1 .**eureka-client**
* add dependency for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
  </dependency>
```
* add param in `application.properties`:
    `server.port=8080`
    `spring.application.name=eureka-call`
    `eureka.client.service-url.defaultZone=http://slave1:8761/eureka/,http://slave2:8762/eureka/`

2 .**config-client**
* `spring.application.name=` **name of properties**
* add dependency for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-config</artifactId>
  </dependency>
```
* you must creat `bootstrap.properties` for project .add param see `bootstrap.properties`
* see the actuator you must with path `/actuator` like `/actuator/info`
* if you want surport `application.properties` params like `myconfig=${value}`,
you must set `spring.profiles.active=test/dev/prod` ,the value depend you config file ,
or you will confront `Could not resolve place`

3 .**eureka with ribbon** 

4 .**eureka with feign** 

5 .**eureka with hystrix** 

6 .**eureka with zipkin** 

* add dependency for project
```ruby
  <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-sleuth-zipkin</artifactId>
  </dependency>
```




