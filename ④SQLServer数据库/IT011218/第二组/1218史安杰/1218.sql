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
--学生表

insert into tb_student(sno,sname,ssex,sage,sdept)values('200215121','李勇','m',20,'CS')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215122','刘晨','w',19,'CS')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215123','王敏','w',18,'MA')
insert into tb_student(sno,sname,ssex,sage,sdept)values('200215125','张立','m',19,'IS')

select*from tb_student
--选课表

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
--课程表

insert into tb_course(cno,cname,apno,ccredit)values(1,'数据库',5,4)
insert into tb_course(cno,cname,apno,ccredit)values(2,'数学',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(3,'信息系统',1,4)
insert into tb_course(cno,cname,apno,ccredit)values(4,'操作系统',6,3)
insert into tb_course(cno,cname,apno,ccredit)values(5,'数据结构',7,4)
insert into tb_course(cno,cname,apno,ccredit)values(6,'数据处理',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(7,'PASCAL语言',6,4)
insert into tb_course(cno,cname,apno,ccredit)values(8,'英语',0,2)
insert into tb_course(cno,cname,apno,ccredit)values(9,'语文',4,2)
insert into tb_course(cno,cname,apno,ccredit)values(10,'思修',7,4)
insert into tb_course(cno,cname,apno,ccredit)values(11,'c语言',3,2)

select*from tb_course

create table tb_employee(
id tinyint identity(1,1) primary key,
name nvarchar(16) not null,
salary money not null,
dateline datetime not null,
age tinyint
)
--增
alter table tb_employee add recommend bit
--删
alter table tb_employee drop column age
--改
alter table tb_employee alter column salary decimal
--查
sp_help tb_employee
