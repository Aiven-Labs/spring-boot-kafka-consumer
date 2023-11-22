# Spring Boot Kafka Consumer

## Instructions

### Install Aiven CLI 

Follow [those instructions](https://docs.aiven.io/docs/tools/cli) and be sure to login. 

### Create an Aiven Kafka Service

You can do it from the web console, from the CLI, from Terraform or even the Aiven Kubernetes Operator, your choice ! 

Create a topic called `spring` 

### Create Keystore&Trustore 

To have a secure connection we will be using Client certificate, the CLI has a really useful command to generate everything : 

```
avn service user-kafka-java-creds <replace-with-your-kafka-service-name>  --username avnadmin -d src/main/resources/client-certs --password safePassword123
```

Be sure to change the Kafka Service name. 

### Set bootstrap server

in your `application.yml` be sure to set the right value for `bootstrap-servers`

## Run the app 

```
mvn spring-boot:run
```

## Produce a message

From the Aiven Console, produce a message on the `spring` topic and check the Spring Boot App logs. 

