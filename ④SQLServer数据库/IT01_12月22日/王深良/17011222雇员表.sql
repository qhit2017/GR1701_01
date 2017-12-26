CREATE table tb_Emp(
--列名	列名（中文）
--empno	工号
--ename	姓名
--deptno	部门
--job	职位
--sal	薪水
--comm	奖金
--hiredate	受雇日期
--Sex	性别

Eid int primary key  ,
Ename nvarchar(16) ,
Ebumen nvarchar(16) ,
Ezhiwei nvarchar(16) ,
Exinshui decimal(16,4),
Ejiangjin decimal(16,4),
Eshijian datetime,
ESex nvarchar(16) 
)
INSERT INTO tb_Emp 
--工号 
--姓名 五个字符
--部门 30 10 20
--职位 办事员 经理 
--薪水
--奖金
--时间 2007 2017
--性别
VALUES 
(001,'00001','10','办事员',300,2000,2007,'男'),
(002,'00002','20','经理',2000,4000,2008,'女'),
(003,'00003','30','秘书',3000,5000,2009,'女'),
(004,'00004','10','秘书',1000,2000,2019,'男'),
(005,'00005','20','经理',2000,4000,2014,'女'),
(006,'00006','30','办事员',3000,5000,2013,'女'),
(007,'00002','20','经理',2000,20,2008,'女'),
(008,'00002','20','经理',2000,99,2008,'女'),
(009,'00002','20','经理',2000,4000,2008,'女'),
(010,'00002','20','经理',2000,4000,2008,'女'),
(011,'00004','10','秘书',1000,2000,2012,'男'),
(012,'00004','10','秘书',1000,2000,2015,'男'),
(014,'00002','20','办事员',2000,4000,2008,'女'),
(015,'00004','10','经理',1000,2000,2012,'男'),
(016,'00004','10','经理',1000,2000,2015,'男'),
(017,'00002','20','办事员',2000,4000,2008,'女'),
(018,'0000R','10','办事员',1000,2000,2007,'男')
SELECT *FROM tb_Emp 
sp_help tb_Emp
--1  选择部门30中的所有员工。 
SELECT Ename  from tb_Emp where Ebumen ='30' 
--2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。 
SELECT Ename,Eid,Ebumen    from  tb_Emp   where Ezhiwei ='办事员'
--3  找出奖金高于薪金的员工。 
SELECT Ename  from tb_Emp where Ejiangjin>Exinshui  
--4  找出奖金高于薪金60%的员工。 
SELECT Ename  from tb_Emp where Ejiangjin>Exinshui+Exinshui*0.6
--5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。 
SELECT *FROM tb_Emp 
where    Ebumen=10 AND Ezhiwei='经理' or Ebumen=20 AND Ezhiwei='办事员'
--6  找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），
--以及所有部门中即不是经理又不是办事员但薪金大于或等于2000的所有员工的详细资料。 
SELECT *FROM tb_Emp 
where  Ebumen=10 AND Ezhiwei='经理' or Ebumen=20 AND Ezhiwei='办事员'
or Ezhiwei NOT IN ('经理','办事员') AND Exinshui>=2000 
--7  找出有奖金的员工的不同工作。 
SELECT DISTINCT(Ezhiwei)  from  tb_Emp 
--8  找出没有奖金或奖金低于100的员工。 
SELECT * FROM tb_Emp WHERE Ejiangjin=null or Ejiangjin<100  
--9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT Ebumen,AVG(Exinshui) 
from tb_Emp 
GROUP BY Ebumen  
ORDER BY AVG(Exinshui) desc
--10  找出早于2012年前受雇的员工。 
SELECT Ename  from  tb_Emp WHERE Eshijian<2012 
--11  查询公司员工薪水总数。 
SELECT sum(Exinshui) from tb_Emp 
--12  显示正好为5个字符的员工的姓名。 
SELECT Ename  from tb_Emp WHERE LEN(Ename)=5 
--13  显示不带有'R'的员工的姓名。 
SELECT Ename  FROM tb_Emp WHERE Ename not like'%R%'
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。 
SELECT Ebumen,COUNT(Eid)  from tb_Emp GROUP BY Ebumen ORDER BY COUNT(Eid)
--15  查询每个部门女员工的人数。
SELECT Ebumen,COUNT(Ename)  from tb_Emp WHERE ESex ='女' GROUP BY Ebumen  
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。 
SELECT Ename,Eshijian   from tb_Emp where  Eshijian LIKE  '[2007-2017]' 
--17  显示员工的详细资料，按姓名排序。
SELECT * from tb_Emp ORDER BY Ename 
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT Eshijian  from tb_Emp  ORDER BY Eshijian 
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。
SELECT Ename,Ezhiwei,Exinshui   from tb_Emp  ORDER BY Ezhiwei desc,Exinshui 
--20  查询员工薪水高于平均值的员工信息。 
SELECT * FROM tb_Emp where Exinshui>(SELECT AVG(Exinshui) FROM tb_Emp )  
--21  查询每个员工总收入（总收入包括奖金和薪水）。 
SELECT Ename , Ejiangjin+Exinshui as'总收入'   from  tb_Emp 
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
SELECT Ebumen,Ezhiwei,avg(Ejiangjin) as '平均奖金',AVG(Exinshui)as '平均薪水' 
from  tb_Emp  
GROUP BY Ebumen,Ezhiwei 
ORDER BY Ebumen   
--23  查询员工姓名，重复的姓名只出现一次。
SELECT DISTINCT(Ename)   from tb_Emp 
--24  查询员工姓名不重复的员工信息。
SELECT  * from tb_Emp WHERE Ename IN (
SELECT  Ename from tb_Emp  GROUP BY Ename HAVING COUNT(Ename) =1)
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。
SELECT Ename FROM tb_Emp WHERE Ename LIKE'%A%' 
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT  Ename,COUNT(Ename)  from tb_Emp  GROUP BY Ename HAVING COUNT(Ename)>1
--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT DISTINCT(Ebumen)  from tb_Emp where Ebumen not in( 
SELECT DISTINCT(Ebumen)  from tb_Emp where  not Exinshui>=900 AND Exinshui<=3000 ) 

--28  查询每个职位的最低工资，并按照工资进行升学排序。

SELECT Ezhiwei , MIN(Exinshui )  from  tb_Emp  GROUP BY Ezhiwei  ORDER BY MIN(Exinshui ) 

