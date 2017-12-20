create database db_employee
use db_employee
create table tb_employee(
id tinyint  identity(1,1)  primary key,
name nvarchar(8) not null,
age smallint check(age>17 and age<60),
sex char(2) check(sex='男' or sex='女' ),
dateline  date,
salary money)
---增
INSERT INTO tb_employee(name,age,sex,dateline,salary) VALUES
('sun',18,'女','2017-9-6',99999),
('hong',20,'男','2017-10-6',9999),
('jia',19,'女','2017-10-6',8888)
---查
select * FROM tb_employee 
