create table tb_employee(
id tinyint primary key,
name nvarchar(32) not null,
salary money default 300000,
remark ntext,
recommend bit)
alter table tb_employee add age tinyint
alter table tb_employee drop column age 
alter table tb_employee alter column salary money not null
alter table tb_employee alter column recommend bit
sp_help tb_employee
select name from sys.objects where type='U'