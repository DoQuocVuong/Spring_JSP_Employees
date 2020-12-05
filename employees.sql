CREATE DATABASE 'employees';
USE employees;

create table users (
	id  int(3) NOT NULL AUTO_INCREMENT,
	name varchar(120) NOT NULL,
	wage int(10) NOT NULL,
	PRIMARY KEY (id)
);

