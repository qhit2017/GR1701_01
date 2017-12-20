create table tb_student(
sno char(11) primary key,
sname char(20)not null,
ssex char(2) check(ssex='m' or ssex='w')not null,
sage smallint not null,
sdept char(20)
)

create table tb_course(
cno char(4) primary key,
cname char(20) not null,
apno char(4) not null,
ccredit smallint not null
)

create table tb_sc(
sno char(11) primary key,
cno char(4)not null,
grade smallint not null
)
--ѧ����

insert into tb_student(sno,sname,ssex,sage,sdept)values('200215121','����','m',20,'CS')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215122','����','w',19,'CS')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215123','����','w',18,'MA')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215125','����','m',19,'IS')

select*from tb_student
--ѡ�α�

insert into tb_sc(sno,cno,grade)values('200215121',1,92)
insert into tb_sc(sno,cno,grade)values('200215121',2,85)
insert into tb_sc(sno,cno,grade)values('200215121',3,88)
insert into tb_sc(sno,cno,grade)values('200215122',2,90)
insert into tb_sc(sno,cno,grade)values('200215122',3,80)
insert into tb_sc(sno,cno,grade)values('200215123',1,92)
insert into tb_sc(sno,cno,grade)values('200215124',2,85)
insert into tb_sc(sno,cno,grade)values('200215125',3,88)
insert into tb_sc(sno,cno,grade)values('200215126',2,90)
insert into tb_sc(sno,cno,grade)values('200215127',3,80)
insert into tb_sc(sno,cno,grade)values('200215128',1,92)
insert into tb_sc(sno,cno,grade)values('200215129',2,85)
insert into tb_sc(sno,cno,grade)values('2002151210',3,88)
insert into tb_sc(sno,cno,grade)values('2002151212',2,90)
insert into tb_sc(sno,cno,grade)values('2002151213',3,80)

select*from tb_sc






select*from tb_sc
--�γ̱�

insert into tb_course(cno,cname,apno,ccredit)values(1,'���ݿ�',5,4)
insert into tb_course(cno,cname,apno,ccredit)values(2,'��ѧ',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(3,'��Ϣϵͳ',1,4)
insert into tb_course(cno,cname,apno,ccredit)values(4,'����ϵͳ',6,3)
insert into tb_course(cno,cname,apno,ccredit)values(5,'���ݽṹ',7,4)
insert into tb_course(cno,cname,apno,ccredit)values(6,'���ݴ���',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(7,'PASCAL����',6,4)
insert into tb_course(cno,cname,apno,ccredit)values(8,'Ӣ��',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(9,'����',4,2)
insert into tb_course(cno,cname,apno,ccredit)values(10,'˼��',7,4)
insert into tb_course(cno,cname,apno,ccredit)values(11,'c����',3,2)

select*from tb_course

create table tb_employee(
id tinyint identity(1,1) primary key,
name nvarchar(16) not null,
salary money not null,
dateline datetime not null,
age tinyint
)
--��
alter table tb_employee add recommend bit
--ɾ
alter table tb_employee drop column age
--��
alter table tb_employee alter column salary decimal
--��
sp_help tb_employee
