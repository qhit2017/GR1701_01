create table db_employee(
id int primary key,
name nvarchar not null,
gender tinyint default not null,
year money not null,
worktime datetime not null,
branch nchar not null)