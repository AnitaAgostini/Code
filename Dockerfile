# Create image based on the Skaffolder Java-Potgres image
FROM skaffolder/java-postgres-base

# Change directory so that our commands run inside this new directory
WORKDIR /app

# Link current folder to container
RUN rm -Rf /app/*
ADD . /app/

WORKDIR /app/script
RUN mvn install:install-file -Dfile=ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.2.0.1 -Dpackaging=jar

WORKDIR /app
# Serve the app
RUN mvn install

# Serve the app
CMD ["mvn", "spring-boot:run"]
