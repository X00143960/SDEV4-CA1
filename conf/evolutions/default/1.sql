# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  code                          varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  dep                           integer not null,
  address                       varchar(255),
  startdate                     varchar(255),
  salary                        double not null,
  constraint pk_employee primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_project primary key (id)
);

create table project_employee (
  project_id                    bigint not null,
  employee_id                   bigint not null,
  constraint pk_project_employee primary key (project_id,employee_id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table project_employee add constraint fk_project_employee_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_employee_project on project_employee (project_id);

alter table project_employee add constraint fk_project_employee_employee foreign key (employee_id) references employee (id) on delete restrict on update restrict;
create index ix_project_employee_employee on project_employee (employee_id);


# --- !Downs

alter table project_employee drop constraint if exists fk_project_employee_project;
drop index if exists ix_project_employee_project;

alter table project_employee drop constraint if exists fk_project_employee_employee;
drop index if exists ix_project_employee_employee;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

drop table if exists project_employee;

drop table if exists user;

