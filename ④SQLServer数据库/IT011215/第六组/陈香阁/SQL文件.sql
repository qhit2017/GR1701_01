create table tb_employee(
id tinyint primary key,
name nvarchar(32)not null,
salary money default 3000,
departnent nvarchar (16),
dateline date,
recommend bit,
remarks ntext)

alter table tb_employee add age tinyint

alter table tb_employee drop column deoartnent

alter table tb_employee drop column id

alter table tb_employee alter column remarks ntext not null

alter table tb_employee alter column recommend int

sp_help tb_employee

select name from sys.all_objects type= 'u'
