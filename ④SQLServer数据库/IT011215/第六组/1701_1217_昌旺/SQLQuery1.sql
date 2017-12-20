--create database db_work
--use db_work
create table tb_guyuan(
id int primary key,
salary money default 3000,
name nvarchar (32) not null,
age int default 18,
dateline date,
recommend bit,
department nvarchar(16),
remarks ntext)