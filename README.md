 Cloud Academy Backend Sample App 

## Local Excute

```
mvn spring-boot:run
```

## MySql Connection Setting
### change mysql uri

- src/main/resource/application.properties
```
spring.datasource.url=jdbc:mysql://{{MYSQL_CONNECTION}}/test?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false
spring.datasource.username={{USERNAME}}
spring.datasource.password={{PASSWORD}}
```

## Jenskin Deployment Setting
### change files 

- kubernetes/JenkinsFile
- kubernetes/deployment.yaml
- kubernetes/service.yaml
- kubernetes/pipeline.properties
