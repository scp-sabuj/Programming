CREATE TABLE instructor (ID varchar(5),name varchar(20),dept_name varchar(20),salary int,PRIMARY KEY (ID),foreign KEY (dept_name)references department);
