FROM payara/micro

COPY ./target/micro-service-0.0.1-SNAPSHOT.war $DEPLOY_DIR

