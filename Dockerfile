FROM openjdk:21-bookworm AS builder

WORKDIR /src

COPY src src
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .

#Compile Java app
RUN ./mvnw package -Dmvn.test.skip=true

FROM openjdk:21-bookworm

COPY --from=builder /src/target/newsapi-0.0.1-SNAPSHOT.jar

