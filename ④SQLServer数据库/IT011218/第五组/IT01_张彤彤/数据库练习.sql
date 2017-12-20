create database db_ZhangTongTong

create table tb_students(
sno char(11) primary key,
sname char(20),
Ssex nvarchar(2)check(Ssex='��' or Ssex='Ů') default '��',
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
values('200215121','����','��',20,'cs')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215122','����','Ů',19,'cs')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215123','����','Ů',18,'MA')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215124','����','��',19,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215125','����','��',20,'SDF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215126','����','��',19,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215127','����','��',18,'ER')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215128','a','��',16,'CCTE')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215129','b','��',29,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215130','c','��',26,'CCTV')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215131','d','��',20,'CV')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215132','e','��',21,'FG')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215133','f','��',19,'ER')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215134','g','��',19,'DF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215135','h','��',22,'ISDF')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215136','i','��',18,'er')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215137','j','��',24,'sd')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215138','k','��',23,'IS')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215139','l','��',20,'114')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215140','m','��',19,'120')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215141','n','��',22,'119')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215142','o','��',18,'110')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215143','p','��',21,'sso')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215144','q','��',22,'fbi')

insert into tb_students(sno,sname,Ssex,sage,sdept)
values('200215145','r','��',19,'sd')


select * from  tb_students




insert into tb_course(cno,CName,Cpno,Ccredit)values
('1','���ݿ�','5',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('2','��ѧ','',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('3','��Ϣϵͳ','1',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('4','����ϵͳ','6',3)

select * from tb_students
insert into tb_course(cno,CName,Cpno,Ccredit)values
('5','���ݽṹ','7',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('6','���ݴ���','',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('7','PASCAL����','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('8','JAVA����','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('9','C����','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('10','����','6',4)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('11','Ӣ��','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('12','��ʷ','6',6)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('13','����','6',7)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('14','�赸','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('15','����','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('16','��ύ��','6',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('17','����ʦ','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('18','����','6',1)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('19','�����','6',1)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('20','����','6',2)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('21','d����','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('22','��ʦ','6',6)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('23','����','6',5)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('24','��ʷ','6',3)

insert into tb_course(cno,CName,Cpno,Ccredit)values
('25','����','6',4)

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