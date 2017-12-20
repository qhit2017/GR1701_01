create database db_ZhangTongTong

create table tb_students(
sno char(11) primary key,
sname char(20),
Ssex nvarchar(2)check(Ssex='男' or Ssex='女') default '男',
sage smallint,
sdept char (20)
)

create table tb_course(
cno char(4) primary key,
CName char(20),
Cpno char(4),
Ccredit smallint
)

create table tb_SC(
Sno char(11)primary key,
Cno char(4),
Grate smallint
)

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215121','李勇','男',20,'cs')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215122','刘晨','女',19,'cs')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215123','王敏','女',18,'MA')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215124','张立','男',19,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215125','张三','男',20,'SDF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215126','李四','男',19,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215127','王二','男',18,'ER')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215128','a','男',16,'CCTE')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215129','b','男',29,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215130','c','男',26,'CCTV')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215131','d','男',20,'CV')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215132','e','男',21,'FG')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215133','f','男',19,'ER')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215134','g','男',19,'DF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215135','h','男',22,'ISDF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215136','i','男',18,'er')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215137','j','男',24,'sd')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215138','k','男',23,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215139','l','男',20,'114')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215140','m','男',19,'120')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215141','n','男',22,'119')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215142','o','男',18,'110')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215143','p','男',21,'sso')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215144','q','男',22,'fbi')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215145','r','男',19,'sd')


select * from  tb_students




insert into tb_course(cno,CName,Cpno,Ccredit)values
('1','数据库','5',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('2','数学','',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('3','信息系统','1',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('4','操作系统','6',3)

select * from tb_students
insert into tb_course(cno,CName,Cpno,Ccredit)values
('5','数据结构','7',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('6','数据处理','',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('7','PASCAL语言','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('8','JAVA语言','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('9','C语言','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('10','语文','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('11','英语','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('12','历史','6',6)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('13','政治','6',7)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('14','舞蹈','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('15','街舞','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('16','社会交际','6',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('17','体验师','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('18','金融','6',1)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('19','计算机','6',1)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('20','画画','6',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('21','d语言','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('22','幼师','6',6)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('23','体育','6',5)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('24','历史','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('25','政治','6',4)

select * from tb_course

insert into tb_SC(Sno,Cno,Grate)values
('200215121','1',92)
insert into tb_SC(Sno,Cno,Grate)values
('200215122','2',85)
insert into tb_SC(Sno,Cno,Grate)values
('200215123','3',88)
insert into tb_SC(Sno,Cno,Grate)values
('200215124','2',90)
insert into tb_SC(Sno,Cno,Grate)values
('200215125','3',80)

select * from tb_SC