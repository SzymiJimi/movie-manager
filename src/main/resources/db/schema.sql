create table MOVIE
(
   id integer not null,
   title varchar(255) not null,
   genre varchar(100) not null,
   production varchar(40),
   premiere_date varchar(30),
   director varchar(100) not null,
   description varchar(255),
   primary key(id)

);
create table DIRECTOR
(
   id integer not null,
   name varchar(255) not null,
   surname varchar(255) not null,
   primary key(id)

);
create table GENRE
(
   id integer not null,
   name varchar(255) not null,
   primary key(id)

);