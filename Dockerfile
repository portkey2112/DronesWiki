From openjdk:11
copy ./target/drones-spring-0.0.1-SNAPSHOT.jar drones-spring-0.0.1-SNAPSHOT.jar
copy ./scripts/wait-for-it.sh wait-for-it.sh
#Another way to pass env variables to the app container
#ENV DB_HOST "mysqldb"
#CMD ["sh", "-c", "./wait-for-it.sh -h mysql -p 3306 -t 30 && java -jar drones-spring-0.0.1-SNAPSHOT.jar"]
CMD ["sh", "-c", "java -jar drones-spring-0.0.1-SNAPSHOT.jar"]
#CMD ["sh", "-c", "./wait-for-it.sh -h drone-mysql.default.svc.cluster.local -p 3306 -t 30 && java -jar drones-spring-0.0.1-SNAPSHOT.jar"]
