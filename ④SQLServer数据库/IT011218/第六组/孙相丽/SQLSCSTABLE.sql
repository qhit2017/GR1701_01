create database db_sunxiangli
use  db_sunxiangli

----学生表
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='男' or Ssex='女'),
Sage  smallint not null,
Sdept char(20))
select*from tb_Student

---课程表
create  table tb_Course(
Cno char(4)  primary key,
Cname char(20) not null,
Cpno  char(4) not null,
Ccredit smallint not null)

---学生选课表
create  table tb_SC(
Sno char(11) primary key,
Cno char(4) not null,
Grade  smallint not null)


select * from tb_Student
select * from  tb_Course 
select * from  tb_SC 
----------------------------------------------------------------------


---给学生表添加记录
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215121,'李勇','男',20,'CS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215122,'刘晨','女',19,'CS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215123,'王敏','女',18,'MA')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215124,'张立','男',19,'IS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215125,'赵云','男',18,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215126,'李继','男',20,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215127,'夏雨','男',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215128,'张东','男',18,'JZ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215129,'张晓','男',19,'JZ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215130,'华宇','女',19,'NM')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215131,'高斌','女',19,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215132,'张桐','女',18,'NM')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215133,'朱娣','女',20,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215134,'施斌','男',18,'XQ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215135,'马超','男',20,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215136,'昌旺','男',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215137,'李新','女',21,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215138,'王艳','女',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215139,'杨春','男',19,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215140,'高杰','男',19,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215141,'贾波','男',18,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215142,'石杰','女',18,'XQ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215143,'蒋科','男',20,'JSJ')

select * from tb_Student

---给课程表添加记录
insert into tb_Course (Cno,Cname, Cpno, Ccredit) values
(1,'数据库',5,4),
(2,'数学',' ',2),
(3,'信息系统',1,4),
(4,'操作系统',6,3),
(5,'数据结构',7,4),
(6,'数据处理',' ', 2),
(7,'PASCAL语言',6,4),
(8,'语文',5,2),
(9,'英语',2,4),
(10,'java',9,9),
(11,'数据库',7,6)

select * from  tb_Course 

---给学生选课表添加数据
insert into tb_SC (Sno,Cno,Grade ) values
 (200215121,7,59),
 (200215122,2,69),
 (200215123,4,79),
 (200215124,9,99),
 (200215125,8,29),
 (200215126,10,100),
 (201712253,1,150),
 (200215127,8,29),
 (200215128,15,94),
 (201712259,11,88),
 (200215130,7,59),
 (200215131,2,69),
 (200215132,4,79),
 (200215133,9,99),
 (200215134,8,29),
 (200215135,10,100),
 (200215136,1,15),
 (200215137,8,29),
 (200215138,15,94),
 (200215139,11,88),
 (200215140,10,10),
 (200215141,1,15),
 (200215142,8,29),
 (200215143,15,4),
 (200215144,11,88),
 (200215145,10,100),
 (200215146,1,15),
 (200215147,8,29),
 (200215148,15,94),
 (200215149,11,88)
 
 select * from  tb_SC 