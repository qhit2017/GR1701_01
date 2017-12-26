CREATE table tb_student(
sno nvarchar(32)primary key,
sname nvarchar(16) not null,
ssex nvarchar(8) check(ssex='男'or ssex ='女') default '男',
sage smallint, 
sdept nvarchar(8),
grade smallint
)
insert into tb_student VALUES
 ('001','李利利','女',18,'cs',29),
 ('002','陈雪','男',17,'ma',39),
 ('003','徐云','女',18,'cs',59),
 ('004','莫荣上天','男',18,'cs',69),
 ('005','李悦','女',18,'cs',27),
 ('006','帐篷','女',18,'cs',89),
 ('007','邱少云','女',18,'is',99),
 ('008','李单位','女',18,'cs',89),
 ('009','李加加','女',18,'ma',69),
 ('0010','李就要','女',18,'cs',59),
 ('0011','巷利利','女',18,'cs',79),
 ('0012','张利','女',18,'cs',79),
 ('0013','初语','女',18,'is',69),
 ('0014','夏天','男',18,'cs',49)
 insert into tb_student VALUES
 ('09102040201','孙敬虔','女',15,'bm',99),
 ('09102040202','王二狗','男',26,'da',78)
 insert into tb_student (sno ,sname,ssex ,sage,sdept)VALUES
  ('0015','夏夏','男',19,'cs')
  
 --1.	查询全体学生的学号与姓名。
 SELECT sname as 姓名,sno as 学号 from tb_student
 --2.	查询全体学生的姓名、学号、专业。
 SELECT sname as 姓名,sno as 学号,sdept as 专业 from tb_student
 --3.	查全体学生的姓名及其出生年份。
 SELECT sname as 姓名,YEAR(GETDATE())-sage as出生年份 from tb_student
 --4.	查询“计算机科学”专业全体学生的名单。
 SELECT sname as 姓名 from tb_student where sdept='cs'
 --5.	查询所有年龄在20岁以下的学生姓名及其年龄。
 SELECT sname as 姓名,sage as年龄  from tb_student where sage<20
 --6.	查询未成年的学生的人数和平均成绩。
 SELECT count(sage)as 未成年人数, AVG(grade)as 平均成绩 from tb_student where  sage<18
 --7.	查询成绩有不及格的学生的学号。
 SELECT sno as学号 from tb_student where grade<60
 --8.	查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
 SELECT sname as 姓名,sdept as 专业,sage as年龄  from tb_student where sage<=22 AND sage >=18
 --9.	查询年龄不在20~23岁之间的学生姓名、专业和年龄。
 SELECT sname as 姓名,sdept as 专业,sage as年龄  from tb_student where sage not BETWEEN 20 and 23
 --10.	查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
 SELECT sname as 姓名,ssex as性别 from  tb_student where sdept IN('cs','is','ma')
 --11.	查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
 SELECT sname as 姓名,ssex as性别 from  tb_student where sdept not IN('cs','is','ma')
 --12.	查询学号为09102040203的学生的详细情况。
 SELECT * FROM tb_student WHERE sno='09102040203'
 --13.	查询所有姓“张”学生的姓名、学号和性别。
  SELECT sname as 姓名,sno as 学号,ssex as性别 from tb_student WHERE sname LIKE'张%'
 --14.	查询姓“李”且全名为三个汉字的学生的姓名。
  SELECT sname as 姓名 from tb_student WHERE sname LIKE '李__'
 --15.	查询名字中第2个字为“丽”字的学生的姓名和学号。
  SELECT sname as 姓名 from tb_student WHERE sname LIKE '_丽%'
--16.	查询所有不姓“陈”的学生姓名。
  SELECT sname as 姓名 from tb_student WHERE  not sname LIKE '陈__'
--17.	查询缺少成绩的学生的学号和姓名。
  SELECT * FROM tb_student WHERE   grade IS NULL
--18.	查询每个专业内学生的平均成绩。
 SELECT sdept, AVG(grade) as  平均成绩 from tb_student  GROUP BY sdept

--19.	查所有有成绩的学生的学号和姓名。
 SELECT sno as 学号 ,sname as 姓名 from tb_student WHERE grade IS not  NULL
--20.	查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
 SELECT * from tb_student ORDER BY sdept ASC , sage DESC
--21.	查询学生总人数。
  SELECT count(sname)as 人数 from tb_student
--22.	查询男生和女生的人数。
  SELECT count(ssex)as 男生人数 from tb_student WHERE ssex ='男'
   SELECT count(ssex)as 女生人数 from tb_student WHERE ssex ='女'
--23.	查询每个专业的平均成绩，结果按照成绩降序排列。
 SELECT sdept ,   AVG(grade)as  平均成绩 from tb_student group BY sdept  ORDER BY AVG(grade) DESC
--24.	查询每个专业中成绩最好的学生成绩。
 SELECT sdept, MAX(grade) as  最好成绩 from tb_student   GROUP BY sdept

--25.	查询每个专业中成绩最差的学生成绩。
 SELECT sdept, MIN(grade) as  最差成绩 from tb_student   GROUP BY sdept
--26.	查询平均成绩最差的专业的名字。

--27.	查询男生和女生的平均成绩。
 SELECT  AVG(grade)as  男生平均成绩 from tb_student WHERE  ssex ='男'
 SELECT  AVG(grade)as  女生平均成绩 from tb_student WHERE  ssex ='女'
--28.	查询成绩高于平均成绩的学生姓名和成绩。
 SELECT sname as 姓名 ,grade as 成绩 from tb_student WHERE grade >AVG(grade)
--29.	查询专业学生人数超过50人的专业名。

--30.	查询“计算机”专业未成年学生的平均成绩和专业名。
SELECT   sdept ,COUNT(sage), AVG(grade)as 平均成绩, sdept
 from tb_student where sdept = 'cs'  GROUP BY sage,sdept
  having sage<19 
  SELECT   AVG(grade) from tb_student WHERE sage<18 and sdept = 'cs'