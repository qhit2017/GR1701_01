create database db_GaoZhiBin
create table tb_Student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check ( Ssex='��' or Ssex='Ů'),
Sage smallint ,
Sdept char(20), 
)
create table tb_Course(
Cno char(4) primary key,
CName char(20),
Cpmo char(4),
Ccredit smallint
)
create table tb_SC(
Sno char (11) primary key,
Cno char (4),
Grade smallint
)

insert into tb_Student (Sno,Sname,Ssex,Sage,Sdept) values
('200215121','����','��',20,'CS'),
('200215122','����','Ů',19,'CS'),
('200215123','����','Ů',19,'CS'),
('200215124','����','��',20,'CS'),
('200215125','����','Ů',18,'CS'),
('200215126','����','��',20,'IT'),
('200215127','������','��',19,'IT'),
('200215128','��÷÷','Ů',19,'IT'),
('200215129','Young','��',20,'IT'),
('200215130','LILY','Ů',18,'IT'),
('200215131','���Ӳ�','��',20,'CS'),
('200215132','����','��',19,'CS'),
('200215133','���Ʒ�','Ů',19,'CS'),
('200215134','��ٻٻ','Ů',20,'CS'),
('200215135','������','��',18,'CS'),
('200215136','����','Ů',20,'IT'),
('200215137','����','��',19,'IT'),
('200215138','�Ű���','��',19,'IT'),
('200215139','����','��',20,'IT'),
('200215140','������','Ů',18,'IT'),
('200215141','������','��',19,'IT'),
('200215142','����','��',19,'IT'),
('200215143','�ֲ�','��',20,'IT'),
('200215144','������','Ů',18,'IT'),
('200215145','������','��',20,'CS')

select Sno,Sname,Ssex,Sage,Sdept from tb_Student

insert into tb_Course (Cno,CName,Cpmo,Ccredit) values
('1','���ݿ�','5',4),
('2','��ѧ',' ',2),
('3','��Ϣϵͳ','1',4),
('4','����ϵͳ','6',3),
('5','���ݽṹ','7',4),
('6','���ݴ���','',2),
('7','PASCAL����','3',8),
('8','JAVA����','6',12),
('9','SQL����','6',6),
('10','C����','6',12)

select Cno,CName,Cpmo,Ccredit from tb_Course

insert into tb_SC
select '200215121','1',92 union
select '200215122','2',85 union
select '200215123','3',88 union
select '200215124','4',90 union
select '200215125','5',80 union
select '200215126','6',66 union
select '200215127','7',79 union
select '200215128','8',61 union
select '200215129','9',77 union
select '200215130','10',96 union
select '200215131','5',67 union
select '200215132','4',78 union
select '200215133','9',82 union
select '200215134','5',88 union
select '200215135','1',62 union
select '200215136','6',75 union
select '200215137','7',74 union
select '200215138','1',74 union
select '200215139','9',87 union
select '200215140','5',86 union
select '200215141','1',95 union
select '200215142','2',82 union
select '200215143','2',63 union
select '200215144','4',78 union
select '200215145','5',94 
select Sno,Cno,Grade from tb_SC

create database db_Employee
use db_Employee

create table tb_Employee(
id tinyint primary key,
name nvarchar(16)not null,
age tinyint check(age>18 and age <60),
dateline date,
salary money
)
select id,name,age,dateline,salary from tb_Employee

insert into tb_Employee
select '1','��ǿ',21,'2011-6-5',2500 union
select '2','����',21,'2011-6-5',2600 union
select '3','����',21,'2011-6-5',3000 union
select '4','��ǿ',21,'2011-6-5',3500 union
select '5','Ф��',21,'2011-6-5',4500 
