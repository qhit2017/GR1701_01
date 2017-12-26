SELECT * FROM tb_student
--1.	查询全体学生的学号与姓名。
SELECT ID,NAME FROM tb_student
--2.	查询全体学生的姓名、学号、专业。
SELECT ID,NAME,zhuanye FROM tb_student
--3.	查全体学生的姓名及其出生年份。
SELECT NAME,YEAR(GETDATE())-AGE FROM tb_student 
--4.	查询“计算机科学”专业全体学生的名单。
SELECT NAME FROM tb_student WHERE zhuanye='CS'
--5.	查询所有年龄在20岁以下的学生姓名及其年龄。
SELECT NAME,AGE FROM tb_student WHERE age<20
--6.	查询未成年的学生的人数和平均成绩。
SELECT COUNT(AGE) AS 未成年人数, AVG(CHENGJI) as 平均成绩 FROM tb_student WHERE age<18
--7.	查询成绩有不及格的学生的学号。
SELECT id FROM tb_student WHERE chengji<60
--8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select name,zhuanye,age FROM tb_student WHERE age>18 AND age<22
--9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
select name,zhuanye,age FROM tb_student WHERE age<20 or age>23
--10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
SELECT name,sex FROM tb_student WHERE zhuanye IN('is','ma','cs')
--11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
SELECT name,sex FROM tb_student WHERE zhuanye not IN('is','ma','cs')
--12.	查询学号为09102040203的学生的详细情况。
SELECT * FROM tb_student WHERE id=09102040203
--13.	查询所有姓“张”学生的姓名、学号和性别。
SELECT name,id,sex FROM tb_student WHERE name LIKE'张%'
--14.	查询姓“李”且全名为三个汉字的学生的姓名。
SELECT name FROM tb_student WHERE name LIKE'李__'
--15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
SELECT name,id FROM tb_student WHERE name LIKE'_丽%'
--16.	查询所有不姓“陈”的学生姓名。
SELECT name FROM tb_student WHERE name not LIKE'陈%'
--17.	查询缺少成绩的学生的学号和姓名。
SELECT id,name FROM tb_student WHERE chengji IS NULL
--18.	查询每个专业内学生的平均成绩。
SELECT ZHUANYE,AVG(CHENGJI) FROM tb_student GROUP BY zhuanye
--19.	查所有有成绩的学生的学号和姓名。
SELECT ID,NAME FROM tb_student 
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
SELECT * FROM tb_student ORDER BY zhuanye,age DESC
--21.	查询学生总人数。
SELECT COUNT(*) FROM tb_student
--22.	查询男生和女生的人数。
SELECT COUNT(SEX)as 男和女 FROM tb_student GROUP BY sex
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
SELECT zhuanye,AVG(chengji)as 平均成绩 FROM tb_student GROUP BY zhuanye ORDER BY avg(chengji) DESC
--24.	查询每个专业中成绩最好的学生成绩。
SELECT zhuanye,max(chengji) FROM tb_student GROUP BY zhuanye
--25.	查询每个专业中成绩最差的学生成绩。
SELECT zhuanye,MIN(chengji) FROM tb_student GROUP BY zhuanye
--26.	查询平均成绩最差的专业的名字。
SELECT top 1 zhuanye,AVG(chengji) 
FROM tb_student GROUP BY zhuanye
HAVING AVG(chengji)<(SELECT AVG(chengji) FROM tb_student GROUP BY zhuanye )
--27.	查询男生和女生的平均成绩。
SELECT sex,AVG(chengji) as 成绩 FROM tb_student GROUP BY sex
--28.	查询成绩高于平均成绩的学生姓名和成绩。
SELECT name,chengji FROM tb_student WHERE chengji>(select AVG(chengji) FROM tb_student)
--29.	查询专业学生人数超过50人的专业名。
SELECT zhuanye,COUNT(*)as 人数  FROM tb_student GROUP BY zhuanye HAVING COUNT(*)>3 
--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT AVG(chengji),zhuanye FROM tb_student WHERE age<23 GROUP BY zhuanye HAVING zhuanye='cs'
