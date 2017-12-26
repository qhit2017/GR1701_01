 CREATE table tb_emp1(empno nvarchar(16),
ename nvarchar(16),
deptno nvarchar(16),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate nvarchar(32),
sex nvarchar(8))
INSERT INTO tb_emp1 VALUES
('0701','rop','10','MANAGER',1500,96,'2005.1.13','man'),
('0702','王凯','30','MANAGER',2500,156,'2002.1.3','man'),
('0703','郝赫','10','CLERK',4500,630,'2007.1.23','man'),
('0704','何敏','30','MANAGER',4500,169,'2009.2.13','woman'),
('0705','rop','10','MANAGER',2500,445,'2006.8.13','man'),
('0706','朱珠','20','CLERK',2500,163,'2010.1.13','woman'),
('0707','爱雅','30','员工',3500,526,'2015.1.3','woman'),
('0708','章子','10','MANAGER',6500,896,'2005.1.13','man'),
('0709','洪洪','20','组长',3500,496,'2016.1.13','man'),
('07010','益阳','10','MANAGER',6500,296,'2011.2.7','man')



 
--列名	列名（中文）
--empno	工号
--ename	姓名
--deptno	部门
--job	职位
--sal	薪水
--comm	奖金
--hiredate	受雇日期
--Sex	性别
--1  选择部门30中的所有员工。
SELECT * FROM tb_emp1 WHERE deptno='30'
 
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT  ename,empno ,deptno FROM tb_emp1 WHERE job='CLERK'
--3  找出奖金高于薪金的员工。
SELECT ename FROM tb_emp1 WHERE comm>sal 
--4  找出奖金高于薪金60%的员工。
 SELECT ename FROM tb_emp1 WHERE comm>sal *0.6
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT  *  FROM tb_emp1 WHERE deptno='10' AND job='MANAGER' OR
  deptno='20' AND job='CLERK'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。 
SELECT  *  FROM tb_emp1 WHERE deptno='10' AND job='MANAGER' OR
  deptno='20' AND job='CLERK' OR job !='MANAGER' and job !='CLERK'
  
--7  找出有奖金的员工的不同工作。
SELECT job FROM tb_emp1 WHERE comm IS NOT NULL
 
--8  找出没有奖金或奖金低于100的员工。
SELECT ename FROM tb_emp1 WHERE comm IS NULL or comm<100 
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT AVG(sal),deptno FROM tb_emp1 GROUP BY deptno ORDER BY AVG(sal)

--10  找出早于2012年前受雇的员工。
SELECT ename FROM tb_emp1 WHERE year(hiredate)<2012
--11  查询公司员工薪水总数。
SELECT COUNT(sal) FROM tb_emp1
 
--12  显示正好为5个字符的员工的姓名。
SELECT ename FROM tb_emp1 WHERE ename  ='5' 
--13  显示不带有'R'的员工的姓名。
SELECT ename  FROM tb_emp1 WHERE ename not like 'r%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
SELECT COUNT(*),deptno FROM tb_emp1 GROUP BY deptno ORDER BY COUNT(*) desc  
--15  查询每个部门女员工的人数。
SELECT COUNT(*)FROM tb_emp1 WHERE sex='woman' GROUP BY deptno  
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT ename,hiredate FROM tb_emp1 WHERE year(hiredate) not between 2007 and 2017
--17  显示员工的详细资料，按姓名排序。
SELECT * FROM tb_emp1 ORDER BY ename 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT ename,hiredate FROM tb_emp1 ORDER BY hiredate 
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
SELECT ename, job,sal FROM tb_emp1  where  job='MANAGER' or job ='CLERK' ORDER BY  desc or ORDER BY job DESC 
--20  查询员工薪水高于平均值的员工信息。
SELECT * FROM tb_emp1 WHERE sal>( select AVG(sal) from tb_emp1 ) 
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
SELECT ename ,sum(sal+comm) FROM tb_emp1 GROUP BY ename
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
SELECT AVG(comm), AVG(sal) , deptno,job  FROM tb_emp1  GROUP BY deptno,job 
--23  查询员工姓名，重复的姓名只出现一次。
SELECT DISTINCT( ename) FROM tb_emp1 
--24  查询员工姓名不重复的员工信息。
SELECT* FROM tb_emp1 WHERE ename IN(SELECT* FROM tb_emp1 GROUP BY ename HAVING COUNT(*)<2 )

--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT ename FROM tb_emp1 WHERE empno LIKE 'a%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT ename,count(1)FROM tb_emp1 GROUP BY ename HAVING count(1)>=2
--27  查询所有员工工资都在900～3000之间的部门信息。
select deptno FROM tb_emp1 WHERE sal BETWEEN 900 AND 3000
 
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT MIN(sal) FROM tb_emp1 GROUP BY job ORDER BY  MIN(sal)



