From openjdk:11
copy ./target/drones-spring-0.0.1-SNAPSHOT.jar drones-spring-0.0.1-SNAPSHOT.jar
copy ./scripts/wait-for-it.sh wait-for-it.sh
ENV DB_HOST_URL=drone-mysql
ENV NAMESPACE=default
ENV DB_PORT=3306
ENV LISTENER_TIMEOUT=100
ENV JARFILE=drones-spring-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["sh", "-c", "./wait-for-it.sh -h ${DB_HOST_URL}.${NAMESPACE}.svc.cluster.local -p ${DB_PORT} -t ${LISTENER_TIMEOUT} && java -jar ${JARFILE}"]