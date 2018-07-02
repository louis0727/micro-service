FROM payara/micro

#COPY ./target/micro-service-0.0.1-SNAPSHOT.war $DEPLOY_DIR

COPY ./target/micro-service.war ${PAYARA_PATH}/
RUN "java -jar payara-micro.jar -deploy=${PAYARA_PATH}/micro-service.war"
