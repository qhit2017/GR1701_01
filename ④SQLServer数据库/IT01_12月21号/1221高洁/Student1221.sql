CREATE table tb_Student(

Sno		  nvarchar(16) primary key not null,	
Sname     nvarchar(16) not null,	
Ssex	  nvarchar(16) check(Ssex='man'or Ssex='woman') default 'man',
Sage	  smallint,	
Sdept     nvarchar(16),	
Grade	  smallint
)
CREATE table tb_Student(
Sno nvarchar(16) primary key,
Sname nvarchar(16),
Ssex nvarchar(16) check(Ssex='man' or Ssex='woman') default 'man',
Sage smallint,
Sdept nvarchar(16),
Grade smallint)

INSERT INTO tb_student 
VALUES 
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
    SELECT Sno,Sname FROM tb_Student 
--2.	查询全体学生的姓名、学号、专业。
	SELECT Sname as '姓名',Sno as '学号',Sdept as '专业' from tb_Student 
--3.	查全体学生的姓名及其出生年份。
    SELECT Sname,YEAR(GETDATE())-Sage as '出生年份'  from tb_Student
--4.	查询“计算机科学”专业全体学生的名单。
	SELECT Sname from tb_Student where Sdept='CS'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
	SELECT Sname,Sage from tb_Student WHERE Sage<20
--6.	查询未成年的学生的人数和平均成绩。
	SELECT COUNT(*)as '人数',AVG(Grade)as '平均成绩'   from tb_Student where Sage<18
--7.	查询成绩有不及格的学生的学号。
	SELECT Sno  from tb_Student where Grade<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
	SELECT Sname,Sdept,Sage   from tb_Student where Sage  between 18 AND 22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
	SELECT Sname,Sdept,Sage  from tb_Student where Sage not between 20 and 23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
	SELECT Sname,Ssex  from tb_Student where Sdept IN('IS','MA','CS')   
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
	SELECT Sname,Ssex  from tb_Student where Sdept NOT IN('IS','MA','CS')
--12.	查询学号为09102040203的学生的详细情况。
	SELECT *  from tb_Student where Sno='09102040203'
--13.	查询所有姓“张”学生的姓名、学号和性别。
	SELECT Sname,Sno,Ssex  from tb_Student where Sname LIKE'张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
	SELECT Sname  from tb_Student where Sname LIKE'李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
	SELECT Sname,Sno  from tb_Student where Sname LIKE'_丽_'
--16.	查询所有不姓“陈”的学生姓名。
	SELECT Sname  from tb_Student where not Sname LIKE'陈%'
--17.	查询缺少成绩的学生的学号和姓名。
	SELECT Sname,Sno  from tb_Student where Grade IS NULL 
--18.	查询每个专业内学生的平均成绩。
	SELECT Sdept,AVG(Grade )   from tb_Student GROUP BY Sdept 
--19.	查所有有成绩的学生的学号和姓名。
	SELECT Sname,Sno  from tb_Student where Grade LIKE '%'
	SELECT Sname,Sno  from tb_Student where Grade IS NOT NULL 
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
	SELECT * from tb_Student ORDER BY Sdept,Sage DESC  
--21.	查询学生总人数。
	SELECT COUNT(*)  FROM tb_Student 
--22.	查询男生和女生的人数。
	SELECT Ssex,COUNT(*)   FROM tb_Student GROUP BY  Ssex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
	SELECT Sdept, AVG(Grade)    FROM tb_Student GROUP BY Sdept
--24.	查询每个专业中成绩最好的学生成绩。
	SELECT Sdept, max(Grade)   FROM tb_Student GROUP BY Sdept
--25.	查询每个专业中成绩最差的学生成绩。
	SELECT Sdept, min(Grade)   FROM tb_Student GROUP BY Sdept
--26.	查询平均成绩最差的专业的名字。
	SELECT TOP 1 Sdept   FROM tb_Student GROUP BY Sdept ORDER BY  AVG(Grade)
--27.	查询男生和女生的平均成绩。
	SELECT Ssex,AVG(Grade )from tb_Student GROUP BY Ssex 
--28.	查询成绩高于平均成绩的学生姓名和成绩。
	SELECT grade,Sname   FROM tb_Student where  Grade>(SELECT AVG(Grade )from tb_Student  ) 
--29.	查询专业学生人数超过50人的专业名。
	SELECT Sdept   FROM tb_Student GROUP BY Sdept HAVING COUNT(*)>50
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
	SELECT Sdept,AVG(Grade)  FROM tb_Student where Sage<18   GROUP BY Sdept HAVING Sdept='cs' 
	
