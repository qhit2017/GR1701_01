create database db_employee

sp_helpdb db_employee

use db_employee

create table tb_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money not null,
linedata date not null,
isrecommend bit default 'false',
remarks ntext)

create table tb_salary(
id tinyint primary key,
salary money not null)

sp_help tb_employee

sp_help tb_salary

select name from sys.objects where type = 'u'

alter table tb_employee add age tinyint not null

alter table tb_employee add dapartment nvarchar(16) not null

alter table tb_employee drop column salary

alter table tb_employee alter column remarks ntext not null

alter table tb_salary add name nvarchar(32) not null

insert into tb_salary  values (1,2500,'tom')
insert into tb_salary  values (2,5000,'jarry')

select * from tb_salary

select id from tb_salary
select id,name from tb_salary