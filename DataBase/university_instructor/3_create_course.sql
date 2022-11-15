CREATE TABLE course(course_id varchar(8),title varchar(50),dept_name varchar(20),credits float NOT NULL,PRIMARY KEY (course_id),foreign KEY (dept_name) references department);
