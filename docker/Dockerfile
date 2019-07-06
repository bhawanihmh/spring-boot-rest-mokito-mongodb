FROM openjdk:10-jre-slim
ENV LOG_LOCATION /var/log/applogs
ENV MAX_HEAP_SIZE "-Xmx1024m"
CMD mkdir /var/log/applogs
CMD chmod +777 /var/log/applogs
COPY spring-boot-rest-mokito-mongodb-0.0.1-SNAPSHOT.jar /etc/spring-boot-rest-mokito-mongodb/
CMD java "$MAX_HEAP_SIZE" -Dlogfile.location="$LOG_LOCATION" -Dapplication_properties_path="$APPLICATION_PROPERTIES_PATH" -Dservice_properties_path="$SERVICE_PROPERTIES_PATH" -jar /etc/spring-boot-rest-mokito-mongodb/spring-boot-rest-mokito-mongodb-0.0.1-SNAPSHOT.jar
