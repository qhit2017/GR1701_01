create database db_lyc

create table tb_emp
(empno nvarchar(16) primary key,							--empno		工号
ename nvarchar(16) not null,								--ename		姓名
deptno nvarchar(16) not null,								--deptno	部门
job nvarchar(16) not null,									--job		职位
sal money not null,											--sal		薪水
comm money not null,										--comm		奖金
hiredate date not null,										--hiredate	受雇日期
sex nvarchar(5) check(sex='man' or sex='woman') not null)	--Sex		性别

--insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex) values

--1  选择部门30中的所有员工。 
select Ename from tb_emp where deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。 
select Ename,Empno,deptno from tb_emp where job='CLERK'
--3  找出奖金高于薪金的员工。 
select Ename from tb_emp where comm>sal
--4  找出奖金高于薪金60%的员工。 
select Ename from tb_emp where comm>(sal*0.6)
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。 
select * from tb_emp where (deptno='10' and job='manager') or (deptno='20' and job='clerk')
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。
select * from tb_emp where (deptno='10' and job='manager') or (deptno='20' and job='clerk') or (job!='manager' and job!='clerk' and sal>=2000)
--7  找出有奖金的员工的不同工作。
select job from tb_emp where comm>0 group by job
--8  找出没有奖金或奖金低于100的员工。 
select Ename from tb_emp where comm<100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select deptno,avg(sal) as 平均薪水 from tb_emp group by deptno order by avg(sal) desc
--10  找出早于2012年前受雇的员工。
select Ename from tb_emp where year(hiredate)>2012
--11  查询公司员工薪水总数。 
select count(sal) as 薪水总数 from tb_emp
--12  显示正好为5个字符的员工的姓名。 
select Ename from tb_emp where ename like '_____'
select Ename from tb_emp where len(ename)=5
--13  显示不带有'R'的员工的姓名。 
select Ename from tb_emp where ename not like '%r%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
 select deptno,count(*) as 人数 from tb_emp group by deptno order by count(*) desc
--15  查询每个部门女员工的人数。
select deptno,count(*) as 人数 from tb_emp where sex='woman' group by deptno
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
select Ename,hiredate from tb_emp where year(hiredate)>=2007 and year(hiredate)<2017
--17  显示员工的详细资料，按姓名排序。 
select * from tb_emp order by Ename
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。 
select Ename,hiredate from tb_emp order by hiredate
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
select Ename,job,sal from tb_emp order by job desc , sal
--20  查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal>(select avg(sal) from tb_emp) 
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
select ename,(sal+comm) as 总收入 from tb_emp
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
select deptno,job,avg(comm) as 平均奖金,avg(sal) as 平均薪水 from tb_emp group by deptno ,job
--23  查询员工姓名，重复的姓名只出现一次。
select distinct(Ename) from tb_emp
--24  查询员工姓名不重复的员工信息。
select Ename from tb_emp group by Ename having count(*)=1
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。 
select Ename from tb_emp where ename like '%a%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
select Ename,count(*) from tb_emp group by Ename having count(*)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
select deptno from tb_emp group by deptno having deptno not in (select deptno from tb_emp where sal<900 or sal>3000)
--28  查询每个职位的最低工资，并按照工资进行升学排序。
select job,min(sal) as 最低工资 from tb_emp group by job order by 最低工资