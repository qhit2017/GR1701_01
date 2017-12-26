CREATE table tb_employee(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(16),
sal money,
comn money,
hiredate date,
sex nvarchar(16) check ( sex = 'man' or sex = 'woman')
)

INSERT INTO tb_employee VALUES 
(001,'00001','10','办事员',300,2000,'2007-12-21','man'),
(002,'00002','20','经理',2000,4000,'2008-10-24','woman'),
(003,'00003','30','秘书',3000,5000,'2009-03-21','woman'),
(004,'00004','10','秘书',1000,2000,'2019-05-23','man'),
(005,'00005','20','经理',2000,4000,'2014-03-24','woman'),
(006,'00006','30','办事员',3000,5000,'2013-01-16','woman'),
(007,'00002','20','经理',2000,20,'2008-06-26','woman'),
(008,'00002','20','经理',2000,99,'2008-08-30','woman'),
(009,'00002','20','经理',2000,4000,'2008-12-08','woman'),
(010,'00002','20','经理',2000,4000,'2008-04-13','woman'),
(011,'00004','10','秘书',1000,2000,'2012-09-26','man'),
(012,'00004','10','秘书',1000,2000,'2015-02-19','man'),
(014,'00002','20','办事员',2000,4000,'2008-06-16','woman'),
(015,'00004','10','经理',1000,2000,'2012-03-27','man'),
(016,'00004','10','经理',1000,2000,'2015-05-28','man'),
(017,'00002','20','办事员',2000,4000,'2008-12-03','woman'),
(018,'0000R','10','办事员',1000,2000,'2007-03-14','man')

SELECT * from  tb_employee

--1  选择部门30中的所有员工。
 select * FROM tb_employee where deptno = '30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename as 姓名,empno as 雇员编号,deptno as 部门编号 FROM tb_employee where job = '办事员'
--3  找出奖金高于薪金的员工。
 SELECT * FROM tb_employee where comn>sal
--4  找出奖金高于薪金60%的员工。
 SELECT * FROM tb_employee where comn > sal*0.6
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT * FROM tb_employee  where deptno = '10' AND job = '经理' or deptno = '20' AND job = '办事员'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
 
--7  找出有奖金的员工的不同工作。
 SELECT distinct(job) as 职位 from tb_employee
--8  找出没有奖金或奖金低于100的员工。
 SELECT ename as 姓名,comn as 奖金 from tb_employee where comn = NULL OR comn < 100 
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT AVG(sal) as 平均薪水,deptno as 部门 from tb_employee group BY deptno order BY avg(sal)DESC
--10  找出早于2012年前受雇的员工。
SELECT ename as 姓名,hiredate as 时间 from tb_employee where YEAR(hiredate) < 2012 
--11  查询公司员工薪水总数。
SELECT SUM(sal)as 薪水总数 from tb_employee 
--12  显示正好为5个字符的员工的姓名。
SELECT ename as 姓名 from tb_employee where LEN(ename) = 5  
--13  显示不带有'R'的员工的姓名。
SELECT ename from tb_employee where ename not like '%r%' 
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
SELECT COUNT(*) as 人数,deptno as 部门 from tb_employee  group BY deptno ORDER BY COUNT(*) 
--15  查询每个部门女员工的人数。
SELECT COUNT(*) as 女员工,deptno as 部门 from tb_employee where sex = 'woman'group BY deptno 
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT Ename,hiredate  from tb_employee where  hiredate LIKE  '[2007-2017]' 
--17  显示员工的详细资料，按姓名排序。
 SELECT * from tb_employee ORDER BY Ename
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
 SELECT hiredate from tb_employee  ORDER BY hiredate
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
SELECT Ename,job,sal   from tb_employee  ORDER BY job desc,sal 
--20  查询员工薪水高于平均值的员工信息。
SELECT * FROM tb_employee where sal >(SELECT AVG(sal) FROM tb_employee) 
--21  查询每个员工总收入（总收入包括奖金和薪水）。
SELECT Ename as 姓名, comn+sal as'总收入'   from  tb_employee 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
 SELECT deptno,job,avg(comn) as '平均奖金',AVG(sal)as '平均薪水'from tb_employee GROUP BY deptno,job ORDER BY deptno 
--23  查询员工姓名，重复的姓名只出现一次。
SELECT DISTINCT(Ename) from tb_employee
--24  查询员工姓名不重复的员工信息。
SELECT  * from tb_employee WHERE Ename IN (
SELECT  Ename from tb_employee  GROUP BY Ename HAVING COUNT(Ename) =1)
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT Ename FROM tb_employee WHERE Ename LIKE'%A%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT  Ename,COUNT(Ename)  from tb_employee   GROUP BY Ename HAVING COUNT(Ename)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT DISTINCT(deptno)  from tb_employee where deptno not in( 
SELECT DISTINCT(deptno)  from tb_employee where  not sal>=900 AND sal<=3000 ) 
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT job as 职位 , MIN(sal) as 最低工资 from  tb_employee  GROUP BY job  ORDER BY MIN(sal) 
