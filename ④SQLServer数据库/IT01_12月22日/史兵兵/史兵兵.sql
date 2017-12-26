select * from tb_emp
sp_help
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('1','a','10','经理','200','100','2017-10-17','man')

insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('2','ab','10','大厨','30','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('3','小丽','30','服务员','3000','100','2000-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('4','小王','10','案板','20','10','2016-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('5','凹凸曼','30','保安','66','100','2000-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('6','葫芦娃','10','服务员','22','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('7','组长','10','组长','6000','1000','2017-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('8','掏粪','30','','30','100','2010-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('9','古力娜扎','10','总裁','30000','100','2007-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('10','marry','30','助理','300','100','2016-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('11','lili','10','秘书','6666','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('12','史安杰','10','保镖','6','10','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('13','张彤彤','30','董事长','','','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('14','R','30','工程师','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('15','火箭队','10','办事员','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('16','李莉莉','30','办事员','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('17','李魏','10','经理','20','100','2015-10-17','woman')





--1  选择部门30中的所有员工。 
select * from tb_emp WHERE deptno='30'
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT ename ,empno,deptno from tb_emp
--3  找出奖金高于薪金的员工。
select *from tb_emp where comm> sal
--4  找出奖金高于薪金60%的员工。 
select top 60 percent ename from tb_emp where comm >sal
--5  找出部门10中所有经理（MANAGER）和部门30中所有办事员（CLERK）的详细资料。
 select *from tb_emp where (deptno=10 and jod = '经理') or (deptno=30 and jod = '办事员')
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。 
select * from tb_emp where deptno=10 and jod = '经理' or deptno=30 and jod = '办事员' or (jod not In ('经理','办事员') and sal >=2000)
--7  找出有奖金的员工的不同工作。
select jod from tb_emp where comm is not null 
--8  找出没有奖金或奖金低于100的员工。
select * from tb_emp where  comm is null or comm <100
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
select AVG(sal),deptno from tb_emp group by deptno order by AVG(sal) desc
--10  找出早于2012年前受雇的员工。 
select ename from tb_emp where YEAR(hiredate)<2012
--11  查询公司员工薪水总数。
SELECT SUM (sal)FROM tb_emp 
--12  显示正好为5个字符的员工的姓名。
select ename from tb_emp where ename like'_____' 
--13  显示不带有'R'的员工的姓名。
SELECT  ename FROM tb_emp WHERE ename NOT LIKE 'R'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
select COUNT(*)as 人数,deptno from tb_emp group by deptno order by COUNT(*) desc
--15  查询每个部门女员工的人数。
select COUNT (*)from tb_emp where sex='woman'
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
 select ename ,hiredate from tb_emp where YEAR (hiredate)>2007 and YEAR (hiredate)<2017
--17  显示员工的详细资料，按姓名排序。
select * from tb_emp  order by ename
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
 select ename , hiredate from tb_emp where YEAR (hiredate)-YEAR (hiredate)<2017
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
select ename,jod ,sal from tb_emp order by jod desc  ,sal
--20  查询员工薪水高于平均值的员工信息。
select * from tb_emp where sal>(select AVG(sal)from tb_emp)
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
select ename ,SUM(sal+comm)as 总收入 from tb_emp group by ename
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。 
sELECT AVG(comm),AVG(sal),deptno,jod from tb_emp 
--23  查询员工姓名，重复的姓名只出现一次。
select distinct ename from tb_emp 
--24  查询员工姓名不重复的员工信息。
select * from tb_emp where ename in (select ename from tb_emp group by ename having COUNT(*)<2)
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT ENAME FROM tb_emp WHERE ename LIKE 'A%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
select ename , COUNT (1)as 重复条数 from tb_emp  group by ename having  COUNT (1)>=2
--27  查询所有员工工资都在900～3000之间的部门信息。
select *from tb_emp where sal >900 and sal <3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
select jod , MIN (sal)as 最差 from tb_emp group by jod order by MIN (sal)
