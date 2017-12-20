create database db_GaoZhiBin
create table tb_Student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check ( Ssex='男' or Ssex='女'),
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
('200215121','李勇','男',20,'CS'),
('200215122','刘晨','女',19,'CS'),
('200215123','王敏','女',19,'CS'),
('200215124','张力','男',20,'CS'),
('200215125','李丽','女',18,'CS'),
('200215126','李洋','男',20,'IT'),
('200215127','刘晨城','男',19,'IT'),
('200215128','王梅梅','女',19,'IT'),
('200215129','Young','男',20,'IT'),
('200215130','LILY','女',18,'IT'),
('200215131','崔子博','男',20,'CS'),
('200215132','张腾','男',19,'CS'),
('200215133','王菲菲','女',19,'CS'),
('200215134','张倩倩','女',20,'CS'),
('200215135','王阿阳','男',18,'CS'),
('200215136','李楠楠','女',20,'IT'),
('200215137','刘冬','男',19,'IT'),
('200215138','张阿奇','男',19,'IT'),
('200215139','王奇','男',20,'IT'),
('200215140','齐秦清','女',18,'IT'),
('200215141','王吉吉','男',19,'IT'),
('200215142','张扬','男',19,'IT'),
('200215143','贾波','男',20,'IT'),
('200215144','秦喵喵','女',18,'IT'),
('200215145','高勇奇','男',20,'CS')

select Sno,Sname,Ssex,Sage,Sdept from tb_Student

insert into tb_Course (Cno,CName,Cpmo,Ccredit) values
('1','数据库','5',4),
('2','数学',' ',2),
('3','信息系统','1',4),
('4','操作系统','6',3),
('5','数据结构','7',4),
('6','数据处理','',2),
('7','PASCAL语言','3',8),
('8','JAVA语言','6',12),
('9','SQL语言','6',6),
('10','C语言','6',12)

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
select '1','王强',21,'2011-6-5',2500 union
select '2','张三',21,'2011-6-5',2600 union
select '3','王万',21,'2011-6-5',3000 union
select '4','李强',21,'2011-6-5',3500 union
select '5','肖克',21,'2011-6-5',4500 
