create database db_guyuan

create table tb_guyuan(
id tinyint primary key,
name nvarchar(10),
age tinyint,
dateline datetime,
salary decimal(6,4)
)
--����
insert into tb_guyuan(id,name,age,dateline,salary)
values
(001,'����',19,2012-12-12,22.33),
(002,'����',19,2012-12-12,22.33),
(003,'����',19,2012-12-12,22.33)
--ɾ��
delete from tb_guyuan where id=002

--�޸�
update tb_guyuan set salary=salary+2000 where id=003

--��ѯ
select*from tb_guyuan

