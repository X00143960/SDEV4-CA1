# --- Sample dataset
 
# --- !Ups
 
delete from employee;
delete from project;

insert into project (id,name) values ( 1,'Proj 1' );
insert into project (id,name) values ( 2,'Proj 2' );
insert into project (id,name) values ( 3,'Proj 3' );

 
insert into employee (id,name,dep,address,startdate,salary) values ( 1,'John Doe',1,'Dublin 12','29/APR/2014',4000.00 );
insert into employee (id,name,dep,address,startdate,salary) values ( 2,'Jim Been',3,'Tallaght','16/MAR/2014',3500.00 );
insert into employee (id,name,dep,address,startdate,salary) values ( 3,'Jack Duffy',2,'Naas','23-JAN-2015',55.00 );


 
insert into project_employee (project_id,employee_id) values (1,1);
insert into project_employee (project_id,employee_id) values (2,2);
insert into project_employee (project_id,employee_id) values (3,3);
insert into project_employee (project_id,employee_id) values (3,2);
insert into project_employee (project_id,employee_id) values (2,1);

