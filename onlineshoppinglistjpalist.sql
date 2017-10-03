create database shopping;
use shopping; 
create table items ( ID int NOT NULL AUTO_INCREMENT,
			STORE varchar(20) NOT NULL,
			ITEM varchar(35) NOT NULL,
			PRIMARY KEY (ID));
