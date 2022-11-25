# simple-photoapp-h2-crud
A PhotoApp using Spring Boot, JPA and H2 DB

## Project Description

This app demonstrates an Api for Photo information using H2 DB and Spring Boot JPA.

## Get Started

Download App and resolve Maven Dependencies then configure H2 to run locally and run the project.

## Configuration Note

Note: if you are using h2 version (2.1.214 ) change the create table statement to below (to avoid errors):
create table if not exists photoz (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    file_name varchar(255),
    content_type varchar(255),
    data binary large object
);
