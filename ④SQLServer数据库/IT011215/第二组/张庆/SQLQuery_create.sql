create table tb_employee(
id int primary key,
name nvarchar(32) not null,
salary money default 3000,
dateline date,
recommend bit,
department nvarchar(16),
remarks ntext)  


alter table tb_employee alter column  recommend bit
sp_help tb_employee
select name from sys.all_objects where type='u'
