--create database db_Student
--ɾ�����ݿ���drop�����ã�
--drop database db_worker
--�л����ݿ���use
--use db_worksb
--sp_helpdb db_worker
--use db_student
--create table tb_if(
--id int primary key,
--name nvarchar (32) not null,
--age int default 18)
create table db_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 300,
deteline date,
recommend bit,
department nvarchar(16),
remarks ntext,
)