CREATE database db_students
CREATE table tb_students(
Sno nvarchar(16)primary key,
 Sname nvarchar(32)not null,
 Ssex  nvarchar(8)check (Ssex='man'or Ssex='woman')default 'man',
 Sage  smallint ,
Sdept nvarchar(8),
Grade smallint)
USE db_students
sp_help tb_students
INSERT into tb_students values
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
SELECT * FROM tb_students
--用SQL语句完成下列单表查询：
--1.	查询全体学生的学号与姓名。
select sno,sname from tb_students
--2.	查询全体学生的姓名、学号、专业。
select Sname,sno ,sdept from tb_students
--3.	查全体学生的姓名及其出生年份。
select sname as 姓名 ,YEAR(GETDATE())-SAGE as 出生年份 FROM tb_students
--4.	查询“计算机科学”专业全体学生的名单。
select 名单=sname from tb_students where sdept ='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname,sage from tb_students where Sage <20
--6.	查询未成年的学生的人数和平均成绩。
SELECT COUNT(*) as人数, avg(Grade)as 平均分 FROM tb_students where Sage <18
--7.	查询成绩有不及格的学生的学号。
SELECT sno from tb_students where Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT Sage,Sname,Sdept FROM tb_students WHERE Sage  between 18 AND 22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sage,Sname,Sdept FROM tb_students WHERE Sage<20 or Sage>23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
select Ssex,Sname FROM tb_students where Sdept = 'MA' or Sdept = 'IS' or Sdept = 'CS'
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Ssex,Sname FROM tb_students where Sdept = 'MA' or Sdept = 'IS' or Sdept = 'CS'
--12.	查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_students where Sno='09102040203'
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT Sname,Sno,Ssex from tb_students where Sname like '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname from tb_students where Sname LIKE '李__' 
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname from tb_students where Sname LIKE '_丽%' 
--16.	查询所有不姓“陈”的学生姓名。
SELECT Sname from tb_students where Sname  not LIKE '陈' 
--17.	查询缺少成绩的学生的学号和姓名。
SELECT Sname,Sno from tb_students WHERE Grade IS null
--18.	查询每个专业内学生的平均成绩。
SELECT sdept 专业,AVG(grade)as 平均分 from tb_students GROUP BY Sdept
--19.	查所有有成绩的学生的学号和姓名。
SELECT Sname,Sno FROM tb_students WHERE Grade is not null
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
--21.	查询学生总人数。
SELECT COUNT(*) FROM tb_students 
--22.	查询男生和女生的人数。
SELECT COUNT(Ssex) FROM tb_students group BY Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT AVG(Grade)
FROM tb_students 
GROUP BY sdept having AVG(Grade)IS not NULL
ORDER BY AVG(Grade) DESC 
--24.	查询每个专业中成绩最好的学生成绩。
SELECT max(Grade)as成绩,sdept 
from tb_students GROUP BY Sdept
--25.	查询每个专业中成绩最差的学生成绩。
SELECT min(Grade)as成绩,sdept 
from tb_students GROUP BY Sdept
--26.	查询平均成绩最差的专业的名字。
SELECT Top 1 Sdept,AVG(Grade)as 平均成绩 
from tb_students 
GROUP BY sdept HAVING AVG(Grade) IS NOT null 
ORDER BY AVG(Grade) asc
--27.	查询男生和女生的平均成绩。
SELECT Ssex,AVG(Grade)from tb_students GROUP BY Ssex
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT Sname,Grade FROM tb_students where 
Grade>(SELECT AVG(Grade)from tb_students)
--29.	查询专业学生人数超过50人的专业名。
SELECT sdept from tb_students GROUP by sdept having COUNT(*)> 3
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT AVG(Grade),sdept 
from tb_students
WHERE Sage <22 GROUP BY Sdept
having Sdept ='cs'