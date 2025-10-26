FROM maven:3.8.5-openjdk-17 AS builder
ADD target/RoomMate.jar RoomMate.jar
ENTRYPOINT [ "java","-jar","/RoomMate.jar"]
