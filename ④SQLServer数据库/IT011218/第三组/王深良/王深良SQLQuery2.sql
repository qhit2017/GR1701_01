create database db_guyuan0

create table tb_guyuan0(
id tinyint primary key,
name nvarchar(10),
nianling tinyint,
riqi datetime,
xingsui decimal(8,3)
)
--����
insert into tb_guyuan0(id,name,nianling,riqi,xingsui)
values
(001,'��һ',19,2012-1-2,5555.55),
(002,'����',19,2013-2-2,5555.55),
(003,'����',19,2014-3-2,5555.55)
--ɾ��
delete from tb_guyuan0 where id=002

--�޸�
update tb_guyuan0 set xingsui=xingsui+2000 where id=003

--��ѯ
select*from tb_guyuan0
