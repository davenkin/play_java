drop database if exists jdbc_tutorial; 
create database jdbc_tutorial;
grant all on jdbc_tutorial.* to 'root'@'localhost';  
use jdbc_tutorial;
CREATE TABLE COMMENTS (
		id INT NOT NULL AUTO_INCREMENT, 
		MYUSER VARCHAR(30) NOT NULL,
		EMAIL VARCHAR(30), 
		WEBPAGE VARCHAR(100) NOT NULL, 
		DATUM DATE NOT NULL, 
		SUMMERY VARCHAR(40) NOT NULL,
		COMMENTS VARCHAR(400) NOT NULL,
		PRIMARY KEY (ID)
	);

INSERT INTO COMMENTS values (default, 'davenkin', 'davenkin@163.com','http://CloudTeng.cnblogs.com', '2012-02-13 10:33:11', 'Summery','My first comment' );


