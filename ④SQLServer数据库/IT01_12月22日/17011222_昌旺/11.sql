--员工表：emp(empno,ename,deptno,job,sal,comm,hiredate,sex) 
--列名	    列名（中文）
--empno	    工号
--ename	    姓名
--deptno	部门
--job	    职位
--sal	    薪水
--comm	    奖金
--hiredate	受雇日期
--Sex	    性别
CREATE table tb_emp(
empon nvarchar(16) primary key,
ename nvarchar(16),
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate date,
sex nvarchar(16) check(sex='man' or sex='woman'))

SELECT * FROM tb_emp 
INSERT INTO tb_emp(empon,ename,deptno,job,sal,comm,hiredate,sex) VALUES
('001','00001','10','办事员',1000,2000,'2007','man'),
('002','00002','20','经理',2000,4000,'2008','woman'),
('003','00003','30','秘书',3000,5000,'2009','woman'),
('004','00004','10','秘书',1000,2000,'2019','man'),
('005','00005','20','经理',2000,4000,'2014','woman'),
('006','00006','30','办事员',3000,5000,'2013','woman'),
('007','00002','20','经理',2000,20,'2008','woman'),
('008','00002','20','经理',2000,99,'2008','woman'),
('009','00002','20','经理',2000,4000,'2008','woman'),
('010','00002','20','经理',2000,4000,'2008','woman'),
('011','00004','10','秘书',1000,2000,'2012','man'),
('012','00004','10','秘书',1000,2000,'2015','man'),
('014','00002','20','办事员',2000,4000,'2008','woman'),
('015','00004','10','经理',1000,2000,'2012','man'),
('016','00004','10','经理',1000,2000,'2015','man'),
('017','00002','20','办事员',2000,4000,'2008','woman'),
('018','0000R','10','办事员',1000,2000,'2007','man')
--1  选择部门30中的所有员工。 
SELECT ename FROM tb_emp WHERE deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。 
SELECT ename,empon,deptno FROM tb_emp WHERE job='办事员'
--3  找出奖金高于薪金的员工。 
SELECT * FROM tb_emp WHERE comm>sal
--4  找出奖金高于薪金60%的员工。 
SELECT * FROM tb_emp WHERE comm>sal*0.6
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。 
SELECT * FROM tb_emp WHERE (deptno=10 or deptno=20) and job='办事员'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
 SELECT * FROM tb_emp WHERE (deptno=10 AND job='经理') OR (deptno=20 and job='办事员') OR (job!='办事员' AND job!='经理') AND (sal>=2000)
--7  找出有奖金的员工的不同工作。 
SELECT distinct(job) FROM tb_emp WHERE comm is not null
--8  找出没有奖金或奖金低于100的员工。
SELECT * FROM tb_emp WHERE  comm<100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT AVG(comm),deptno FROM tb_emp GROUP BY deptno ORDER BY avg(comm)desc
--10  找出早于2012年前受雇的员工。
 SELECT * FROM tb_emp WHERE hiredate<'2012'
--11  查询公司员工薪水总数。 
SELECT sum(comm) FROM tb_emp
--12  显示正好为5个字符的员工的姓名。
SELECT ename FROM tb_emp WHERE ename='_____'
--13  显示不带有'R'的员工的姓名。 
SELECT ename FROM tb_emp WHERE ename!='%r%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT COUNT(ename)as 人数,deptno as 部门名 FROM tb_emp GROUP BY deptno ORDER BY COUNT(ename)
--15  查询每个部门女员工的人数。
SELECT COUNT(ename)as 女员工的人数,deptno as 部门 FROM tb_emp WHERE sex='woman' GROUP BY deptno
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。 
select ename as 姓名,hiredate as 受雇日期 from tb_emp where hiredate>'2007' and hiredate<'2017'
--17  显示员工的详细资料，按姓名排序。 
SELECT * FROM tb_emp ORDER BY ename DESC
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。 
SELECT ename,hiredate FROM tb_emp ORDER BY hiredate
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
SELECT ename,job,comm FROM tb_emp ORDER BY job DESC,comm
--20  查询员工薪水高于平均值的员工信息。 
SELECT * FROM tb_emp WHERE comm>( SELECT AVG(comm) FROM tb_emp )
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
SELECT SUM(sal+comm) FROM tb_emp GROUP BY empon
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。 
SELECT AVG(sal),AVG(comm),deptno,job FROM tb_emp GROUP BY deptno,job order BY deptno
--23  查询员工姓名，重复的姓名只出现一次。
SELECT distinct(ename) FROM tb_emp 
--24  查询员工姓名不重复的员工信息。
SELECT ename FROM tb_emp GROUP BY ename HAVING COUNT(ename)<2
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。 
SELECT ename FROM tb_emp WHERE ename='%a%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT ename,COUNT(ename) FROM tb_emp GROUP BY ename HAVING COUNT(ename)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT DISTINCT(deptno) FROM tb_emp WHERE comm>'300' OR comm<'900'
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT MIN(comm) FROM tb_emp GROUP BY job ORDER BY MIN(comm)