create database db_employee
use db_employee
create table tb_employee(
id tinyint  identity(1,1)  primary key,
name nvarchar(8) not null,
age smallint check(age>17 and age<60),
sex char(2) check(sex='��' or sex='Ů' ),
dateline  date,
salary money)
---��
INSERT INTO tb_employee(name,age,sex,dateline,salary) VALUES
('sun',18,'Ů','2017-9-6',99999),
('hong',20,'��','2017-10-6',9999),
('jia',19,'Ů','2017-10-6',8888)
---��
select * FROM tb_employee 
