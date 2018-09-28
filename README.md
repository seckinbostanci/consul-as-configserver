# Consul Servis Regisrty as a Consul Config Server
## with demo-service

add to 
>Key/Values > config > demo-service > application-yml

this value:
<pre>
spring:
    datasource:
        password: toor
        url: jdbc:mysql://localhost:3306/demo-service-db
        username: root
    jpa:
        hibernate:
            ddl-auto: update
</pre>