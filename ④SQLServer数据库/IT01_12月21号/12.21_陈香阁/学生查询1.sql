create table tb_students(
Sno nvarchar(11)primary key,
Sname nvarchar(20)not null,
Ssex nvarchar(2)check(Ssex='男'or Ssex='女')default'男' not null,
Sage smallint not null,
Sdept nvarchar(20),
Grade smallint)

insert into tb_students(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(1,'李勇','男',20,'CS',54),
      (2,'刘晨','女',19,'CS',65),
      (3,'王敏','女',18,'MA',59),
      (4,'张立','男',23,'IS',49),
      (5,'李丽丽','女',19,'CS',89),
      (6,'张鹏','男',19,'CS',57),
      (09102040204,'陈四','男',19,'CS',61),
      (09102040205,'沈丽','女',18,'MA',71),
      (049710,'张林','男','','','')

--1.	查询全体学生的学号与姓名。
select Sno,Sname from tb_students 
--2.	查询全体学生的姓名、学号、专业。
select Sname as 姓名,Sno as 学号,Sdept as 专业 from tb_students
--3.	查全体学生的姓名及其出生年份。
select Sname as 姓名,  year(getdate())-Sage as 出生年份 from tb_students
--4.	查询“计算机科学”专业全体学生的名单。
select Sname from tb_students where Sdept='CS'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname,Sdept,Sage from tb_students where Sage<=20
--6.	查询未成年的学生的人数和平均成绩。
SELECT count(*) as 人数 ,avg(Grade) as 平均分 from tb_students where Sage < 18
--7.	查询成绩有不及格的学生的学号。
SELECT Sno from tb_students where Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_students where Sage BETWEEN 18 AND 22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_students where Sage not BETWEEN 20 AND 23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT Sname,Ssex from tb_students where Sdept in ('IS','MA','CS')
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT Sname,Ssex,Sdept from tb_students where Sdept not in ('IS','MA','CS')
--12.	查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_students where Sno=09102040205
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT Sname,Sno,Ssex from tb_students where Sname LIKE '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname from tb_students where Sname LIKE '李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname,Sno FROM tb_students WHERE Sname LIKE '_丽%'
--16.	查询所有不姓“陈”的学生姓名。
SELECT Sname FROM tb_students WHERE Sname not LIKE '陈%'
--17.	查询缺少成绩的学生的学号和姓名。
SELECT Sno,Sname,Grade from tb_students where Grade is null
--18.	查询每个专业内学生的平均成绩大于60分。
SELECT sdept,avg(Grade)as 平均成绩 from tb_students GROUP BY Sdept HAVING AVG(Grade) > 60
--19.	查所有有成绩的学生的学号和姓名。
SELECT Sno,Sname from tb_students where Grade>=0
--20.查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
--默认是升序
SELECT * FROM tb_students order BY Sdept,Sage DESC
--21.	查询学生总人数。
SELECT COUNT(*) as 总人数 from tb_students
--22.	查询男生和女生的人数。
select Ssex,COUNT(Ssex) from tb_students GROUP BY Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT AVG(Grade) FROM tb_students 
GROUP BY Sdept HAVING AVG(Grade) is NOT NULL
ORDER BY AVG(Grade) DESC
--24.	查询每个专业中成绩最好的学生成绩。
SELECT MAX(Grade)as 学生最高成绩 from tb_students where Sdept='CS'
--25.	查询每个专业中成绩最差的学生成绩。
SELECT Sdept, min(Grade)   FROM tb_Students GROUP BY Sdept
--26.	查询平均成绩最差的专业的名字。
SELECT top 1 percent Sdept,avg(Grade) FROM tb_students GROUP BY Sdept
HAVING AVG(Grade) < =ANY(SELECT AVG(Grade) from tb_students group BY Sdept

--27.	查询男生和女生的平均成绩。
SELECT Ssex,AVG(Grade )from tb_Students GROUP BY Ssex 
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT sname grade FROM tb_students 
WHERE Grade>(SELECT AVG(Grade) 
FROM tb_students)
--29.	查询专业学生人数超过50人的专业名。
SELECT Sdept from tb_students GROUP BY Sdept HAVING COUNT(*) >3
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT AVG(Grade)as 平均成绩 FROM tb_students where Sdept='CS'AND Sage>18