FROM openjdk:11
EXPOSE 8081
ADD target/billing-manager_group2-0.0.1-SNAPSHOT.jar  billing-manager_group2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar" , "billing-manager_group2-0.0.1-SNAPSHOT.jar"]