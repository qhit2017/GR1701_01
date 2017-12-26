
--Sno	学号	char	设为关键字
--Sname	姓名	char	
--Ssex	性别	char	其值只能为“男”或“女”，默认值为“男”
--Sage	年龄	smallint	
--Sdept	专业名	char	允许为空
--Grade	成绩	smallint	允许为空



CREATE  table tb_student(
sno nvarchar (16) primary key,
sname nvarchar (20) not null,
ssex nvarchar (8) check (ssex='man'or ssex='woman')default 'man',
sage smallint,
sdept nvarchar(16),
grade smallint
)
 INSERT INTO tb_student VALUES
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
 
 
--1.	查询全体学生的学号与姓名。
SELECT sno ,sname from tb_student
 
--2.	查询全体学生的姓名、学号、专业。

select sname as 姓名,sno as 学号,sdept as 专业 from tb_student 
--3.	查全体学生的姓名及其出生年份。


select sname as 姓名,YEAR(GETDATE())-sage as 出生年份 from tb_student
--4.	查询“计算机科学”专业全体学生的名单。


select  sname from tb_student where sdept='cs'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。


SELECT sname,sage from tb_student where sage<20
--6.	查询未成年的学生的人数和平均成绩。



select count(*)as 人数,avg(grade)as 平均数 FROM  tb_student where sage<18
--7.	查询成绩有不及格的学生的学号。



SELECT sno from tb_student where grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。



select sname, sdept, sage from tb_student where sage>=18 AND sage <=22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。



SELECT Sname ,sdept, sage from tb_student where sage NOT between 20 and 23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。



SELECT sname,ssex from tb_student where grade IN ('is','ma','cs')
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。




--12.	查询学号为09102040203的学生的详细情况。



SELECT  * FROM tb_student where sno =09102040203
--13.	查询所有姓“张”学生的姓名、学号和性别。



SELECT  sname,sno,ssex from tb_student where sname like '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。



SELECT sname from tb_student where sname LIKE '李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。



SELECT SNAME, SNO from tb_student where sname LIKE '_丽%'
--16.	查询所有不姓“陈”的学生姓名。



SELECT sname from tb_student where sname not LIKE '陈' 
--17.	查询缺少成绩的学生的学号和姓名。



SELECT sno sname FROM  tb_student where grade IS null
--18.	查询每个专业内学生的平均成绩。



select AVG(grade)as 成绩 ,Sdept from tb_student group BY sdept
--19.	查所有有成绩的学生的学号和姓名。



SELECT  sno, sname from tb_student where grade IS NOT NULL 
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。


SELECT * FROM tb_student order BY sdept ASC ,sage DESC 
--21.	查询学生总人数。

SELECT COUNT(*)as 总人数 FROM tb_student 
--22.	查询男生和女生的人数。



select ssex ,count(ssex) from tb_student group BY ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。



select AVG(grade) as 平均成绩,sdept from tb_student group BY sdept ORDER BY avg(grade) desc 
--24.	查询每个专业中成绩最好的学生成绩。



SELECT 
--25.	查询每个专业中成绩最差的学生成绩。
--26.	查询平均成绩最差的专业的名字。
--27.	查询男生和女生的平均成绩。
--28.	查询成绩高于平均成绩的学生姓名和成绩。
--29.	查询专业学生人数超过50人的专业名。
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。

 
 
 