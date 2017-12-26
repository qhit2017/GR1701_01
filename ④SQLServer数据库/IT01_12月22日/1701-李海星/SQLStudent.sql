create database db_Student
create table tb_Student(
Sno char(20) primary key,
Sname char(11) not null,
Ssex char(4) check(Ssex='男' or Ssex='女') default '男' not null,
Sage smallint ,
Sdept char(20),
Grade smallint
)
select*from tb_Student
insert into tb_Student values (
1,'join','男',18,'CS',68),
(2,'tom','男',17,'IS',89),
(3,'jike','男',20,'MA',53),
(4,'rose','女',24,'IS',97),
(5,'沈丽','女',17,'MA',78),
(6,'陈达','女',18,'IS',54),
(7,'李利利','女',18,'IS',54),
(8,'张看','男',25,'IS',54),
(09102040203,'lucy','女',23,'IS',65),
(09102040204,'ken','男',23,'CS',78)

--1.	查询全体学生的学号与姓名。
select Sno,Sname from tb_Student
--2.	查询全体学生的姓名、学号、专业。
select Sname,Sno,Sdept from tb_Student
--3.	查全体学生的姓名及其出生年份。
select 姓名=Sname,year(GETDATE())-Sage as 出生年份 from tb_Student
--4.	查询“计算机科学”专业全体学生的名单。
select Sname,Sdept from tb_Student where Sdept='CS'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
select Sname,Sage from tb_Student where Sage<20
--6.	查询未成年的学生的人数和平均成绩。
select count(Sage) as 人数,avg(Grade) as 平均成绩 from tb_Student where Sage<18
--7.	查询成绩有不及格的学生的学号。
Select Grade from tb_Student where Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select Sname,Sdept,Sage from tb_Student where Sage>=18 and Sage<=22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
select Sname,Sdept,Sage from tb_Student where not Sage<20 or Sage>23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
insert into tb_Student (Sno,Sname,Sdept) values (11,'于','sports')
select Sname,Ssex from tb_Student where Sdept='IS' or Sdept='MA' or Sdept='CS'
select Sname,Ssex from tb_Student where Sdept in ('IS','MA','CS')
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Sname,Ssex from tb_Student where not (Sdept='IS' or Sdept='MA' or Sdept='CS')
--12.	查询学号为09102040203的学生的详细情况。
select * from tb_Student where Sno=09102040203
--13.	查询所有姓“张”学生的姓名、学号和性别。
select Sname,Sno,Sage from tb_Student where Sname like '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
select Sname from tb_Student where Sname like '李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
select Sname,Sno from tb_Student where Sname like '_丽'
--16.	查询所有不姓“陈”的学生姓名。
select Sname from tb_Student where not Sname like '陈%'
--17.	查询缺少成绩的学生的学号和姓名。
select Sno,Sname from tb_Student where Grade is null
--18.	查询每个专业内学生的平均成绩。
select Sdept,AVG(Grade) from tb_Student group by Sdept
--19.	查所有有成绩的学生的学号和姓名。
select Sno,Sname from tb_Student where not Grade is null
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
select * from tb_Student order by Sdept asc , Sage desc
--21.	查询学生总人数。
select count(Sname) as 总人数 from tb_Student
--22.	查询男生和女生的人数。
select '性别'=Ssex,count(Ssex)as 人数 from tb_Student GROUP by Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
select Sdept,AVG(Grade) as 平均成绩 from tb_Student group by Sdept order by 平均成绩 desc
--24.	查询每个专业中成绩最好的学生成绩。
select Sdept,MAX(Grade) from tb_Student group by Sdept
--25.	查询每个专业中成绩最差的学生成绩。
select Sdept,min(Grade) from tb_Student group by Sdept
--26.	查询平均成绩最差的专业的名字。
--27.	查询男生和女生的平均成绩。
select Ssex,AVG(Grade) from tb_Student group by Ssex
--28.	查询成绩高于平均成绩的学生姓名和成绩。
--29.	查询专业学生人数超过5人的专业名。
select Sdept,COUNT(Sdept) as 共有人数 from tb_Student group by Sdept having COUNT(Sdept)>5
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。