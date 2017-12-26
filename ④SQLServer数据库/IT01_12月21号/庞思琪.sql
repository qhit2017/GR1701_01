CREATE  database db_student
USE db_student
--学生表：Student(Sno,Sname,Ssex,Sage,Sdept,Grade) 
--列名	列名（中文）	数据类型	备注
--Sno	学号	char	设为关键字
--Sname	姓名	char	
--Ssex	性别	char	其值只能为“男”或“女”，默认值为“男”
--Sage	年龄	smallint	
--Sdept	专业名	Student
CREATE table tb_student(
Sno nvarchar(16) primary key,
Sname nvarchar(16) not null,
Ssex nvarchar(8) check(Ssex='man' or Ssex ='woman') default 'man ',
Sage smallint,
Sdept nvarchar(16),
Grade  smallint)

INSERT INTO tb_student values
('10','jackie','man',15,'cS',89),
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
  
--用SQL语句完成下列单表查询：
--1.	查询全体学生的学号与姓名。
SELECT Sno ,Sname from tb_student 
--2.	查询全体学生的姓名、学号、专业。
SELECT Sno ,Sname,Sdept from tb_student 
--3.	查全体学生的姓名及其出生年份。
SELECT Sname,year(getdate())-Sage as 出生年份 from tb_student
--4.	查询“计算机科学”专业全体学生的名单。
SELECT Sname as 姓名 from tb_student where  Sdept ='CS'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT Sno,Sname,Sage from tb_student where Sage < 20

--6.	查询未成年的学生的人数和平均成绩。
SELECT COUNT(*) as 人数, avg(Grade) as 平均成绩  from tb_student where Sage <18
--7.	查询成绩有不及格的学生的学号。
SELECT Sno from tb_student where Sage < 60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_student where Sage BETWEEN 18 AND 23
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
SELECT Sname,Sdept,Sage from tb_student where Sage NOT  BETWEEN 18 AND 23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
select Sname,Ssex FROM tb_student where Sdept in('IS','MA','SC')

--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select Sname,Ssex FROM tb_student where Sdept NOT  in('IS','MA','SC')
--12.	查询学号为09102040203的学生的详细情况。
select * FROM tb_student where Sno = 09102040203
--13.	查询所有姓“张”学生的姓名、学号和性别。
select Sname,Sno,Ssex FROM tb_student where Sname LIKE '张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
select Sname FROM tb_student where Sname LIKE '李__'
select Sname FROM tb_student where Sname LIKE '李%' AND len(Sname)=2
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
select Sname,Sno FROM tb_student where Sname like '_丽%'

--16.	查询所有不姓“陈”的学生姓名。
select Sname FROM tb_student where Sname like '陈%'
--17.	查询缺少成绩的学生的学号和姓名。
select Sname ,Sno FROM tb_student  where Grade is null
SELECT *FROM tb_student
--18.	查询每个专业内学生的平均成绩。
select Sdept ,avg(Grade) as 平均成绩 
FROM tb_student group BY Sdept 
HAVING avg(Grade)>60
--19.	查所有有成绩的学生的学号和姓名。
select Sname,Sno FROM tb_student where Grade IS NOT null
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
select * FROM tb_student order BY Sdept ASC,Sage DESC

--21.	查询学生总人数。
select COUNT(*)as 学生总人数 FROM tb_student
--22.	查询男生和女生的人数。
select Ssex ,COUNT(Ssex)as 男女分组人数 FROM tb_student group by Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT Sdept ,AVG(Grade) as 成绩 from  tb_student 
group BY Sdept 
ORDER BY AVG(Grade) DESC
--24.	查询每个专业中成绩最好的学生成绩。
SELECT Sdept,max(Grade) as 最好成绩  from  tb_student 
group BY Sdept 
--25.	查询每个专业中成绩最差的学生成绩。
SELECT Sdept,min(Grade) as 最好成绩  from  tb_student 
group BY Sdept 

--26.	查询平均成绩最差的专业的名字。
SELECT top 40 percent Sdept from  tb_student 
group  BY Sdept 
HAVING avg(Grade) <= any (SELECT AVG(Grade) 
 from  tb_student group BY Sdept) 
--27.	查询男生和女生的平均成绩。
SELECT AVG(Grade)as 平均成绩 , Ssex  from tb_student GROUP BY Ssex          
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT Sname,Grade from tb_student 
where Grade>(SELECT avg (Grade)from tb_student)
--29.	查询专业学生人数超过2人的专业名。
SELECT Sdept,COUNT(*)as 专业人数 from tb_student  
group BY Sdept 
HAVING COUNT(*) >2
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT Sage,avg(Grade)AS 平均成绩,Sdept from tb_student 
where Sdept = 'CS'
GROUP BY Sage,Sdept
HAVING Sage < 18

--------------------------------------------------------------------------------------------
3,