create database db_employee

create table tb_employee(
id tinyint primary key,
name nvarchar(10),
nianling tinyint,
riqi datetime,
xingsui decimal(8,3)
)
--����
insert into tb_employee(id,name,nianling,riqi,xingsui)
values
(001,'��һ',19,2012-12-12,5555.55),
(002,'�Ŷ�',19,2012-12-12,5555.55),
(003,'����',19,2012-12-12,5555.55)
--ɾ��
delete from tb_employee where id=002

--�޸�
update tb_employee set xingsui=xingsui+2000 where id=003

--��ѯ
select*from tb_employee




