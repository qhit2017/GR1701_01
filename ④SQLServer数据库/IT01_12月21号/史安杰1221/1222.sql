update tb_employee set salary=4500,dateline=GETDATE() where name='saj'

select *from tb_employee
sp_help tb_employee

create table tb_student(
sno nvarchar(16)primary key,
sname nvarchar(20) not null,
ssex nvarchar(10) check(ssex='man' or ssex='woman')default 'man',
sage smallint,
sdept nvarchar(16),
grade smallint
)

insert into tb_student values
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

--1：查询全体同学详细信息
select*from tb_student
--2:查看全体学生学号和姓名
select sno as 学号,sname as 姓名 from tb_student
--3：查询全体学生姓名及出生年份
select sname as 姓名,YEAR(GETDATE())-sage as出生年份 from tb_student
--4.查询“计算机科学”专业全体学生的名单
select 名单=sname from tb_student where sdept='CS'
--5.查询所有年龄在20岁以下的学生姓名及其年龄。
select 姓名=sname,成绩=sage from tb_student where sage<20
--6.查询未成年的学生的人数和平均成绩。
select 未成年学生个数=count(sage),平均成绩=avg(grade) from tb_student where sage<18
--7.查询成绩有不及格的学生的学号。
select 学号=sno from tb_student where grade<60
--8.查询年龄在18~22岁（包括18岁和22岁）之间的学生的姓名、专业和年龄。
select 姓名=sname,专业=sdept,年龄=sage from tb_student where sage>=18 and sage<=22 order by sage
select 姓名=sname,专业=sdept,年龄=sage from tb_student where sage between 18 and 22 order by sage desc
--9.查询年龄不在20~23岁之间的学生姓名、专业和年龄。
select sname as 姓名,sdept as 专业,sage as 年龄 from tb_student where sage<20 or sage>23 order by sage
--10.查询信息系（IS）、数学系（MA）和计算机科学系（CS）学生的姓名和性别。
select sname,ssex from tb_student where grade in('IS','MA','CS')
--11.查询既不是信息系、数学系，也不是计算机科学系的学生的姓名和性别。
select sname,ssex from tb_student where grade not in('IS','MA','CS')
--12.查询学号为09102040203的学生的详细情况。
select *from tb_student where sno=09102040203
--13.查询所有姓“张”学生的姓名、学号和性别。
select sname,sno,ssex from tb_student where sname like'张%'
--14.查询姓“李”且全名为三个汉字的学生的姓名。
select sname from tb_student where sname like'李__'
--15.查询名字中第2个字为“丽”字的学生的姓名和学号。
select sname,sno from tb_student where sname like'_丽%'
--16.查询所有不姓“陈”的学生姓名。
select sname from tb_student where sname not like'陈%'
--17.查询缺少成绩的学生的学号和姓名。
select sno,sname from tb_student where grade is null
--18.查询每个专业内学生的平均成绩。
select sdept,AVG(grade)as 平均分 from tb_student group by sdept 
--19.查所有有成绩的学生的学号和姓名。
select sno,sname from tb_student where grade >0
--20.查询全体学生情况，查询结果按所在系升序排列，同一系中的学生按年龄降序排列。
select*from tb_student order by sage desc,sdept asc                         
--21.查询学生总人数。
select count(sname)as 总人数 from tb_student
--22.查询男生和女生的人数。
select ssex,COUNT(grade)as 人数 from tb_student group by ssex
--23.查询每个专业的平均成绩，结果按照成绩降序排列。
select sdept,AVG(grade)as 平均成绩 from tb_student group by sdept order by AVG(grade) asc
--24.查询每个专业中成绩最好的学生成绩。
select sdept, MAX(grade)as最好 from tb_student group by sdept
--25.查询每个专业中成绩最差的学生成绩。
select sdept, min(grade)as最差 from tb_student group by sdept
--26.查询平均成绩最差的专业的名字。

--27.查询男生和女生的平均成绩。
select ssex,AVG(grade)as 平均 from tb_student group by ssex
--28.查询成绩高于平均成绩的学生姓名和成绩。

--29.查询专业学生人数超过50人的专业名。

--30.查询“计算机”专业未成年学生的平均成绩和专业名。
