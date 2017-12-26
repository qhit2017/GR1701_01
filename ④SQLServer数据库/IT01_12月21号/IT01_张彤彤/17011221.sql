CREATE table tb_students(
Sno nvarchar (16) primary key,
Sname nvarchar (16),
Ssex nvarchar (16) check (Ssex = 'man' or Ssex = 'woman')default 'man',
Sage smallint,
Sdept nvarchar(16),
)
USE db_student
ALTER table tb_students add Grade smallint
INSERT INTO tb_students VALUES 
('1','jackie','man',15,'IS',89),
('2','tom','man',18,'IS',69),
('3','mary','woman',22,'CS',39),
('4','lucy','woman',22,'MA',69),
('5','Lily','woman',21,'CS',49),
('6','Mackle','man',17,'MA',88),
('7','李利利','woman',22,'CS',69),
('8','张鹏','woman',30,'MA',18),
('9','陈四火','woman',22,'MA',69),
('09102040203','李静','woman',22,'MA',69),
('09102040204','沈丽','woman',22,'MA',69)
INSERT INTO tb_students(Sno,sname)VALUES (10,'jack')
SELECT * FROM tb_students
--1.	查询全体学生的学号与姓名。
select sno as 学号,sname as 姓名 from tb_students
--2.	查询全体学生的姓名、学号、专业。
select sname as 姓名,sno as 学号,sdept as 专业 from tb_students
--3.	查全体学生的姓名及其出生年份。
select sname,YEAR(GETDATE() )-Sage as 出生年月 from tb_students
--4.	查询“计算机科学”专业全体学生的名单。
select sname as 姓名 from tb_students where Sdept = 'cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT sname as 姓名 ,sage as 年龄 from tb_students where Sage < 20
--6.	查询未成年的学生的人数和平均成绩。
select COUNT(*) as 人数 ,AVG(Grade) as 平均分 FROM tb_students where Sage<18 
--7.	查询成绩有不及格的学生的学号。
SELECT sno as 学号 FROM tb_students where grade <60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT sname as 姓名,sdept as 专业,sage as 年龄 FROM tb_students WHERE sage >=18 AND sage <= 22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT sname as 姓名,sdept as 专业,sage as 年龄 FROM tb_students where Sage not between 20 AND 23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT sname as 姓名,sage as 性别, sdept as 专业 FROM tb_students where Sdept = 'is' OR Sdept = 'ma' or sdept ='cs'
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT sname as 姓名, sage as 性别,Sdept as 专业 FROM tb_students where NOT (Sdept = 'is' OR Sdept = 'ma' OR Sdept = 'cs')
--12.	查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_students where Sno = '09102040203'
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT sname,sno,ssex from tb_students where sname like '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT sname from tb_students where sname LIKE '李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT sname,sno from tb_students where sname like '_丽%'
--16.	查询所有不姓“陈”的学生姓名。
SELECT sname as 姓名 FROM tb_students where sname not like '陈%'
--17.	查询缺少成绩的学生的学号和姓名。
SELECT sno as 学号,sname as 姓名 from tb_students where  grade IS  null 
--18.	查询每个专业内学生的平均成绩。
select  sdept as 专业,AVG(grade) as 平均分 from tb_students group BY Sdept 
--19.	查所有有成绩的学生的学号和姓名。
SELECT sno,sname from tb_students
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
select * FROM tb_students order BY sdept ASC ,Sage desc
--21.	查询学生总人数。
SELECT COUNT(*) as 学生总人数 from tb_students
--22.	查询男生和女生的人数。
SELECT Ssex, COUNT(*) from tb_students group BY Ssex 
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT  avg (grade) from tb_students  group BY sdept order BY AVG(grade)  DESC 
--24.	查询每个专业中成绩最好的学生成绩。
SELECT sdept,MAX(grade) from tb_students group BY Sdept
--25.	查询每个专业中成绩最差的学生成绩。
SELECT sdept,min(grade) from tb_students group BY Sdept
--26.	查询平均成绩最差的专业的名字。
SELECT TOP 1 sdept,AVG(grade) from tb_students group BY Sdept HAVING AVG(grade) IS NOT null 
--27.	查询男生和女生的平均成绩。
SELECT ssex as 性别,avg(grade) as 平均分 from tb_students group BY ssex
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT sname as 姓名, grade as 成绩 FROM tb_students where grade > (SELECT avg(grade) from tb_students )
--29.	查询专业学生人数超过50人的专业名。
SELECT sdept as 专业,count(*) from tb_students group BY Sdept HAVING COUNT(*)>3 
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT avg(grade) as 平均分,sdept as 专业 from tb_students where Sage < 40 GROUP BY Sdept HAVING sdept = 'cs'
