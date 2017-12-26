USE db_GZB
--列名	列名（中文）
--empno	工号
--ename	姓名
--deptno	部门
--job	职位
--sal	薪水
--comm	奖金
--hiredate	受雇日期
--Sex	性别
CREATE table tb_emp(
empno    nvarchar(16) primary key ,
ename    nvarchar(32) not null    ,
deptno   nvarchar(32)             ,
job      nvarchar(32)             ,
sal      money default 2000       ,
comm     money                    ,
hiredate date                     ,
sex      nvarchar(16) check(sex='男' or sex='女')
)
SELECT *FROM tb_emp
sp_help tb_emp
---	工号 姓名 部门 职位 薪水 奖金 受雇日期 性别
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('001','Riky','10','MANAGER',4500,2000,'2014-5-8','女')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('002','Haskins','10','CLERK',3000,1500,'2012-9-1','男'),
('003','Harlan','10','CLERK',3000,1000,'2011-9-1','女'),
('004','Noble','10','CLERK',3000,2000,'2010-9-1','男'),
('005','Eric','10','CLERK',3000,1500,'2002-9-1','男'),
('006','Haskins','20','CLERK',3000,1500,'2013-9-1','男'),
('007','Gerry','20','MANAGER',4500,5000,'2008-9-1','男'),
('008','Angela','20','CLERK',3000,500,'2017-9-1','女'),
('009','Tina','30','CLERK',3000,1000,'2005-9-1','女'),
('010','李麦莉','30','CLERK',3000,1500,'2009-9-1','女'),
('011','Sunny','30','CLERK',3000,1500,'2011-9-1','女'),
('012','leo','10','CLERK',3000,1500,'2016-9-1','男'),
('013','JIELIY','30','CLERK',3000,1500,'2011-9-1','男'),
('014','LULU','30','CLERK',3000,1500,'2011-9-1','男'),
('015','Naicy','30','CLERK',3000,1500,'2011-9-1','男'),
('016','Maky','30','CLERK',3000,1500,'2011-9-1','男'),
('017','Jeecky','30','CLERK',3000,1500,'2011-9-1','男'),
('018','Jake','30','CLERK',3000,1500,'2011-9-1','男'),
('019','Hbit','20','CLERK',3000,1500,'2013-9-1','男'),
('020','Gairy','20','MANAGER',4500,5000,'2008-9-1','男'),
('021','Mia','20','CLERK',3000,500,'2017-9-1','女'),
('022','MUHAMMAD','20','CLERK',3000,1500,'2013-9-1','男'),
('023','Moah','20','MANAGER',4500,5000,'2008-9-1','男'),
('024','Lily','20','CLERK',800,2000,'2017-9-1','女'),
('025','JOSHUA','10','CLERK',3000,1500,'2012-9-1','男'),
('026','Isla','10','CLERK',1000,800,'2017-9-1','女'),
('027','OLIVIA','10','CLERK',3000,2000,'2010-9-1','女'),
('028','KATE','10','CLERK',3000,1500,'2002-9-1','男'),
('029','Lily','20','CLERK',800,2000,'2017-9-1','女'),
('030','JOSHUA','10','CLERK',3000,1500,'2012-9-1','男'),
('031','Isla','10','CLERK',1000,800,'2017-9-1','女'),
('032','OLIVIA','10','CLERK',3000,2000,'2010-9-1','女'),
('033','KATE','10','CLERK',3000,1500,'2002-9-1','男')



INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('034','玛丽','15','后勤部',3000,1500,'2012-9-1','男'),
('035','杰克李','15','后勤部',3000,1000,'2011-9-1','女'),
('036','张努努','18','清洁部',3000,2000,'2010-9-1','男'),
('037','朱珠芽','18','清洁部',3000,1500,'2002-9-1','男'),
('038','刘染奇','12','保安部',3000,1500,'2013-9-1','男'),
('039','李杰杰','12','保安部',4500,5000,'2008-9-1','男'),
('040','杨闹闹','12','保安部',3000,1500,'2013-9-1','男')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('041','杨清','15','后勤部',1500,500,'2017-9-1','男'),
('042','王丽瑞','15','后勤部',1600,500,'2017-9-1','女')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,hiredate,sex)VALUES 
('041','杨清','15','后勤部',80,'2017-9-1','男'),
('042','王丽瑞','15','后勤部',90,'2017-9-1','女')
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

---	工号 姓名   部门  职位 薪水 奖金 受雇日期  性别
---empno ename deptno job  sal comm hiredate sex
---1  选择部门30中的所有员工。 
SELECT * FROM tb_emp WHERE deptno='30'
---2  列出所有办事员（CLERK）的姓名，雇员编号和部门编号。
SELECT  ename AS 姓名,empno as 雇员编号,deptno as 部门编号 
FROM tb_emp where job='CLERK'
---3  找出奖金高于薪金的员工
SELECT  * FROM tb_emp WHERE comm > sal 
---4  找出奖金高于薪金60%的员工。 
SELECT TOP 60 PERCENT ename from tb_emp WHERE comm > sal
---5  找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料。
SELECT  * FROM tb_emp
WHERE (deptno='10'and job='MANAGER')
and (deptno='20'and job='CLERK')
---6  找出部门10中所有经理（MANAGER），
----部门20中所有办事员（CLERK），
----以及所有部门中即不是经理又不是办事员
----但薪金大于或等于2000的所有员工的详细资料。
SELECT  * FROM tb_emp
WHERE (deptno='10'and job='MANAGER')OR(deptno='20'and job='CLERK')
 OR (job NOT IN ('CLERK','MANAGER') AND sal >=2000)
---7  找出有奖金的员工的不同工作。
SELECT job FROM tb_emp where comm IS NOT NULL  
---8  找出没有奖金或奖金低于100的员工。 
SELECT ename from tb_emp where comm IS NOT NULL OR  comm <100
---9  查询每个部门的平均薪水和部门名，并按照薪水由高到底进行排序。
SELECT AVG(sal) ,deptno FROM tb_emp GROUP BY deptno ORDER BY AVG(sal) DESC   
--10  找出早于2012年前受雇的员工。
SELECT ename FROM tb_emp WHERE YEAR(hiredate)<2012 
--11  查询公司员工薪水总数。
SELECT SUM(sal) as 总数 FROM tb_emp   
--12  显示正好为5个字符的员工的姓名。
SELECT *FROM tb_emp WHERE ename LIKE '_____' 
--13  显示不带有'R'的员工的姓名。
SELECT *FROM tb_emp WHERE ename NOT  LIKE 'R' 
--14  查询每个部门员工人数和部门名，并按照员工人数进行降序排序。
SELECT COUNT(deptno) as 部门人数,deptno FROM tb_emp GROUP BY deptno ORDER BY COUNT(deptno) DESC 
--15  查询每个部门女员工的人数。
SELECT COUNT(*) ,deptno FROM tb_emp where sex='女' GROUP BY deptno   
--16  显示2007年到2017年之前入职的员工的姓名和受雇日期。
SELECT  ename,hiredate FROM tb_emp where YEAR(hiredate)>2007 AND YEAR(hiredate)<2017  
--17  显示员工的详细资料，按姓名排序。
SELECT * FROM tb_emp order BY ename ASC  
--18  显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面。
SELECT  ename,hiredate FROM tb_emp ORDER BY GETDATE()-YEAR(hiredate)DESC   
--19  显示所有员工的姓名、工作和薪金，按工作的降序排序，若工作相同则按薪金排序。 
SELECT ename,job,sal from tb_emp ORDER BY job DESC ,sal
--20  查询员工薪水高于平均值的员工信息。
SELECT * FROM tb_emp WHERE sal >(SELECT AVG(sal) FROM tb_emp  )
--21  查询每个员工总收入（总收入包括奖金和薪水）。
SELECT ename,SUM(sal+comm)AS 总收入 FROM tb_emp GROUP BY ename    
--22  查询每个部门不同职位的平均奖金，平均薪水，部门和职位名。
 SELECT AVG(sal),AVG(comm),deptno,job FROM tb_emp GROUP BY deptno ,job   
--23  查询员工姓名，重复的姓名只出现一次。
SELECT DISTINCT ename  FROM tb_emp 
--24  查询员工姓名不重复的员工信息。
SELECT *FROM tb_emp where ename IN (
SELECT ename from tb_emp GROUP BY ename HAVING COUNT(*)<2)
--25  显示姓名字段的任何位置包含'A'的所有员工的姓名。 
SELECT ename FROM tb_emp where ename LIKE '%A%'
--26  查询员工姓名重复的员工，显示人员姓名、重复条数。
SELECT ename,COUNT(*) from tb_emp GROUP BY ename HAVING COUNT(*)>=2  
--27  查询所有员工工资都在900～3000之间的部门信息。
SELECT * FROM tb_emp WHERE sal >900 AND sal <3000
--28  查询每个职位的最低工资，并按照工资进行升学排序。
SELECT job,MIN(sal) FROM tb_emp GROUP BY job ORDER BY MIN(sal)  
