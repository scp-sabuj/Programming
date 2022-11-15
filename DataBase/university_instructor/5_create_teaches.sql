CREATE TABLE teaches(ID varchar(5),id_section_table int,PRIMARY KEY (ID,id_section_table),foreign KEY(ID)references instructor,foreign KEY (id_section_table)references section);
