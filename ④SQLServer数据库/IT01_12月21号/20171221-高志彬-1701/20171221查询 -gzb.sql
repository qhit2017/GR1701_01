USE db_GZB
SELECT  * FROM  tb_students
sp_help  tb_students
CREATE  table tb_students(
Sno  nvarchar(16)  primary key,
Sname  nvarchar(16)  ,
Ssex  nvarchar(8) check (Ssex ='man'  or  Ssex='woman')  default 'man',
Sage  smallint,
Sdept  nvarchar(16),
Grade smallint
)
INSERT  INTO  tb_students (Sno,Sname,Ssex,Sage,Sdept,Grade) VALUES 
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
SELECT  * FROM tb_students
sp_help tb_students
---1.	查询全体学生的学号与姓名。
SELECT  Sno,Sname  from tb_students
---2.	查询全体学生的姓名、学号、专业。
SELECT Sname as 姓名,Sno as 学号,Sdept as 专业 FROM tb_students 
---3.	查全体学生的姓名及其出生年份。
select  Sname AS 姓名, year(getdate())-Sage AS 出生年份 from tb_students
---4.	查询“计算机科学”专业全体学生的名单。
SELECT  Sname from tb_students where Sdept='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname AS 姓名,Sage AS 年龄 FROM tb_students 
---6.	查询未成年的学生的人数和平均成绩。
SELECT COUNT(*)  ,avg(Grade) FROM  tb_students WHERE Sage<18
----7.	查询成绩有不及格的学生的学号。
SELECT Sno as 不及格学生学号 from tb_students WHERE Grade<60 
---8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_students WHERE Sage BETWEEN 18 AND 22
---9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_students WHERE Sage NOT BETWEEN 20 AND 23
---10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT Sname,Ssex from tb_students where Sdept IN('IS','MA','CS')
---11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT Sname,Ssex from tb_students where Sdept not IN('IS','MA','CS')
---12.	查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_students where Sno =09102040203
---13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT Sname,Sno,Sage from tb_students where Sname LIKE '张%' 
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname FROM tb_students where Sname LIKE  '李__'
SELECT Sname FROM tb_students where Sname LIKE  '李%' AND LEN(Sname)=3
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname FROM tb_students where Sname LIKE  '_丽%' 
SELECT Sname FROM tb_students where Sname LIKE  '__[a-z]y'
SELECT Sname FROM tb_students where Sname LIKE  '__[^d-z]y' 

INSERT INTO tb_students (Sno,Sname,Ssex,Sage,Sdept,Grade)VALUES
('0921451242','李静','woman',22,'MA',69)





--16.	查询所有不姓“陈”的学生姓名。
SELECT Sname FROM tb_students where Sname NOT LIKE  '陈%' 
--17.	查询缺少成绩的学生的学号和姓名。
SELECT Sno,Sname from tb_students WHERE Grade IS  NULL
--18.	查询每个专业内学生的平均成绩。
SELECT  Sdept, AVG(Grade) as 平均成绩 from tb_students group BY Sdept 
SELECT  Sdept, AVG(Grade) as 平均成绩 
from tb_students group BY Sdept  HAVING AVG(Grade)>60
--19.	查所有有成绩的学生的学号和姓名。
SELECT Sno,Sname,Grade FROM tb_students WHERE Grade IS NOT NULL
--20.	查询全体学生情况，查询结果按所在系升序排列，
--同一系中的学生按年龄降序排列。
SELECT * FROM tb_students ORDER BY Sdept ,Sage DESC
--21.	查询学生总人数。
SELECT COUNT(*)as 学生总人数 FROM tb_students
--22.	查询男生和女生的人数。
SELECT Ssex,COUNT(*) FROM tb_students GROUP BY Ssex 
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。

SELECT Sdept as 专业,AVG(Grade) as 专业的平均成绩 FROM tb_students 
GROUP BY Sdept 
having avg(Grade) is not null 
ORDER BY AVG(Grade) 

--24.	查询每个专业中成绩最好的学生成绩。
SELECT max(Grade) FROM  tb_students group BY Sdept
--25.	查询每个专业中成绩最差的学生成绩。
SELECT MIN(Grade) FROM  tb_students group BY Sdept
--26.	查询平均成绩最差的专业的名字。

SELECT  top 1 Sdept ,AVG(Grade) from tb_students
GROUP BY Sdept 
HAVING AVG(Grade) IS NOT NULL 

SELECT  top 1 Sdept AS 专业,AVG(Grade) AS 平均成绩 from tb_students
GROUP BY Sdept 
HAVING AVG(Grade) < ANY (SELECT AVG(Grade) from tb_students GROUP BY Sdept) 
--27.	查询男生和女生的平均成绩。
SELECT Ssex,AVG(Grade) FROM tb_students GROUP BY Ssex
--28.	查询成绩高于平均成绩的学生姓名和成绩。

SELECT Sname AS 学生姓名 , Grade AS 成绩 FROM tb_students  
WHERE Grade >(SELECT AVG(Grade) from tb_students  )

--29.	查询专业学生人数超过50人的专业名。

SELECT Sdept as 专业,COUNT(Sdept) as 专业人数 
FROM tb_students GROUP BY Sdept HAVING COUNT(Sdept)>3

--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT Sdept as 专业名,AVG(Grade) as 平均成绩 FROM tb_students 
WHERE Sage <18
GROUP BY Sdept HAVING Sdept='IS'