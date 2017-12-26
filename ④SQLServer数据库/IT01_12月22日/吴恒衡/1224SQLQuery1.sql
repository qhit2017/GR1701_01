create table tb_emp(
empno tinyint identity(1,1) primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate nvarchar(16),
sex nvarchar(16) check(sex='man' or sex='woman')
)

insert into tb_emp values

('jackie',10,'经理',3500,500,'2007-01-25','man'),
('tom',20,'办事员',2000,500,'2017-01-25','man'),
('mary',10,'经理',3000,500,'2017-01-25','woman'),
('lucy',30,'保洁工',900,1000,'2017-01-25','woman'),
('Lily',10,'经理',3000,500,'2007-01-25','woman'),
('Mackle',10,'办事员',300,500,'2017-01-25','man'),
('李利利',20,'办事员',3000,500,'2009-01-25','woman'),
('张鹏',10,'经理',3000,500,'2017-01-25','woman'),
('陈四火',20,'安保',1000,1500,'2012-01-25','woman'),
('李静',10,'保洁工',2000,500,'2011-01-25','woman'),
('张三和李四',30,'经理',3000,500,'2011-01-25','woman'),
('张三和李四',10,'安保',1500,500,'2011-01-25','woman'),
('韩梅梅',20,'经理',2500,500,'2017-01-25','woman')
--员工表：emp(empno,ename,deptno,job,sal,comm,hiredate,sex) 
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
SELECT * FROM tb_emp where deptno='30' 
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号
select empno,ename,deptno from tb_emp where job='办事员' 
--3  找出奖金高于薪金的员工。
select ename from tb_emp where  comm>sal 
--4  找出奖金高于薪金60%的员工。 
select ename from tb_emp where  comm>sal*0.6
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
select*from tb_emp where (deptno=10 and job='经理')or(deptno=20 and job='办事员') 
--6  找出部门10中所有经理（MANAGER），
--部门20中所有办事员（CLERK），以及所有部门
--中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
select*from tb_emp where deptno=10 and job='经理'or deptno=20 and job='办事员'or (job not in ('经理','办事员')and sal>=2000)
--7  找出有奖金的员工的不同工作。
select ename, job from tb_emp where comm is not null
--8  找出没有奖金或奖金低于100的员工。 
select ename from tb_emp where comm is  null or comm <100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select AVG(sal),deptno from tb_emp group by deptno order by avg(sal) desc
--10  找出早于2012年前受雇的员工。
select ename from tb_emp where YEAR(hiredate) <2012
--11  查询公司员工薪水总数。
select sum(sal)as 总数 from tb_emp 
--12  显示正好为5个字符的员工的姓名。 
select*from tb_emp where ename like'_____'
--13  显示不带有'R'的员工的姓名。
select ename from tb_emp where ename not like'r' 
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
select COUNT(*),deptno from tb_emp group by deptno order by COUNT(*) desc
--15  查询每个部门女员工的人数。
select deptno,COUNT(*)as 人数 from tb_emp  where sex='woman' group by deptno
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。 
select ename,hiredate from tb_emp where year(hiredate)>2007 and YEAR(hiredate)<2017
--17  显示员工的详细资料，按姓名排序。
select*from tb_emp order by ename asc
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
select ename,hiredate from tb_emp order by getdate()-year(hiredate) desc
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
select ename,job,sal from tb_emp order by job desc,sal
--20  查询员工薪水高于平均值的员工信息。
select*from tb_emp where comm>(select AVG(comm)from tb_emp) 
--21  查询每个员工总收入（总收入包括奖金和薪水）。
select ename,SUM(sal+comm)as 总收入 from tb_emp group by ename 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select AVG(comm)as 平奖,AVG(sal)as 平薪,deptno ,job from tb_emp group by deptno,job
--23  查询员工姓名，重复的姓名只出现一次。
select distinct ename from  tb_emp 
--24  查询员工姓名不重复的员工信息。
select * from tb_emp where ename in(
select ename from  tb_emp group by ename having COUNT(*)<2)
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
select*from tb_emp where ename like'%a%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
select ename ,count(1)as 重复条数 from tb_emp group by ename having COUNT(1)>=2
--27  查询所有员工工资都在900～3000之间的部门信息。
select*from tb_emp where sal>900 and sal<3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
select job,min(sal)as 最差 from tb_emp group by job order by min(sal) 


