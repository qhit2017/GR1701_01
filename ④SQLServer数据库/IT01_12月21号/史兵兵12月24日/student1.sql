USE db_Students
CREATE table tb_student1(
Sno nvarchar (32) primary key,
Sname nvarchar (32) not null,
Ssex nvarchar (8) check(Ssex='man' or Ssex='woman'),
Sage smallint  ,
Sdept nvarchar (16),
Grade smallint 
)
INSERT INTO tb_student1
VALUES ('1','jackie','man',15,'IS',89),
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
--1.	查询全体学生的学号与姓名。
SELECT  Sname,Sno from tb_student1
--2.	查询全体学生的姓名、学号、专业。
select  Sname,Sno,Sdept from tb_student1
--3.	查全体学生的姓名及其出生年份。

select Sname,YEAR(GETDATE() )-Sage from tb_student1???
--4.	查询“计算机科学”专业全体学生的名单。
SELECT		Sname from tb_student1 where Sdept='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sname,Sage from tb_student1 where Sage<20

--6.	查询未成年的学生的人数和平均成绩。
SELECT count(*),AVG(Grade) from tb_student1 where sage<18
--7.	查询成绩有不及格的学生的学号
SELECT Sno from tb_student1 where Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄
 SELECT Sname, Sdept,Sage from tb_student1 where Sage>=18 AND Sage<=22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sname, Sage,Sdept from tb_student1 where Sage<18 or Sage >23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT Sname,Ssex from tb_student1 where Sdept='IS' or Sdept ='MA' or Sdept ='CS'
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Sname,Ssex from tb_student1 where Sdept ='IS' or Sdept ='MA' or Sdept ='CS'

--12.	查询学号为09102040203的学生的详细情况。
SELECT * from tb_student1 where  Sno='09102040203'
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT Sname ,Sno,Ssex FROM tb_student1   where Sname like '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT Sname from tb_student1  where Sname like '李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT Sname,Sno from tb_student1  where Sname like '_丽%'
--16.	查询所有不姓“陈”的学生姓名。
SELECT Sname from tb_student1 where Sname not  like '陈%' 
--17.	查询缺少成绩的学生的学号和姓名。
SELECT Sno,Sname from tb_student1  where Grade is null 
--18.	查询每个专业内学生的平均成绩。
SELECT avg(Grade) from tb_student1 GROUP BY Sdept
--19.	查所有有成绩的学生的学号和姓名。
SELECT Sname,Sno from tb_student1 where Grade  not is null 
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
???????
--21.	查询学生总人数。
SELECT COUNT(*)from tb_student1
--22.	查询男生和女生的人数。
SELECT COUNT(*) from tb_student1 GROUP BY Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT avg(Grade) from tb_student1 GROUP BY Sdept order by avg (Grade ) desc 
--24.	查询每个专业中成绩最好的学生成绩。
SELECT max(Grade) from tb_student1 GROUP BY Sdept
--25.	查询每个专业中成绩最差的学生成绩。
SELECT min(Grade) from tb_student1 GROUP BY Sdept
--26.	查询平均成绩最差的专业的名字。
SELECT sdept,AVG(Grade) from tb_student1 
group BY Sdept
HAVING AVG(Grade)<=ANY(SELECT AVG(Grade) from tb_student1 group BY sdept)?????
--27.	查询男生和女生的平均成绩。
SELECT avg(Grade) from tb_student1 GROUP BY Ssex
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT Sname,Grade from tb_student1 where Grade>(select avg(Grade) from tb_student1)
--29.	查询专业学生人数超过50人的专业名。
SELECT Sdept from tb_student1 GROUP BY Sdept having COUNT(*)>3
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
select  AVG(Grade),sdept
from tb_student1
where Sage<40
GROUP BY Sdept
HAVING Sdept='cs'


SELECT * FROM  tb_student1

