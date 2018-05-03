create table MOVIE
(
   id integer auto_increment not null,
   title varchar(255) not null,
   genre varchar(100) not null,
   production varchar(40),
   premiereDate varchar(30),
   director varchar(100) not null,
   description varchar(255),
   primary key(id)

);