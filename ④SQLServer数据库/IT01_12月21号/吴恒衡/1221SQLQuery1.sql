create database db_Wuhengheng1
use db_Wuhengheng1

create table tb_Student0(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check(Ssex='男' or Ssex='女') default'男',
Sage smallint,
Sdept char(20) null,
Sgrade smallint )




insert into tb_Student0(Sno,Sname,Ssex,Sage,Sdept,Sgrade)
values('200215121','李勇','男',20,'CS',60),
('200215122','刘晨','女',19,'CS',38),
('200215123','王敏','女',18,'MA',98),
('200215124','张立','男',19,'IS',32),
('200215125','夏雨辰','男',19,'CS',25),
('200215126','王金辉','男',18,'MA',18),
('200215127','杜会友','男',19,'IS',98),
('200215128','庞思齐','男',19,'CS',78),
('200215129','王深良','男',18,'MA',98),
('200215130','巨天赐','男',19,'IS',25),
('200215131','张庆','男',19,'cf',66),
('200215132','贾慧波','男',18,'MA',75),
('200215133','程洁','男',19,'IS',69),
('200215134','朱迪平','女',19,'CS',32),
('200215135','杨冲','男',18,'MA',25),
('200215136','高洁','男',19,'IS',14),
('200215137','张彤彤','女',19,'IS',68),
('200215138','马超','男',19,'CS',78),
('200215139','史安杰','女',18,'MA',32),
('200215140','崔子波','男',19,'IS',45),
('200215141','蒋科磊','男',19,'CS',36),
('200215142','王浩','男',18,'MA',14),
('200215143','郭刘航','男',19,'IS',36),
('200215144','史兵兵','男',19,'CS',15),
('200215145','孙相丽','女',18,'MA',35)
USE db_Wuhengheng1


select name from sys.objects where type ='u'
sp_help tb_student0
insert into tb_student0(Sno,Sname,Ssex,Sage,Sdept,Sgrade)values
('200215146','张三','男',16,'ma',78)


SELECT * FROM tb_Student0

UPDATE tb_Student0 SET  Ssex = '女', sage=21 WHERE sname='李勇' 
--1
select sno,Sname,ssex,sage,sdept from tb_Student0
--2
select sno as 学号,Sname as 姓名 from tb_Student0
--3
SELECT sname as 姓名,year(GETDATE())-sage from tb_Student0
--4
SELECT Sname,Sdept from tb_Student0 where Sdept = 'cs'
--5
SELECT Sname,sage from tb_Student0 where Sage<20
--6
select count(*)as 未成年,avg(Sgrade)as 平均值 from tb_Student0 where Sage<18 
--7
SELECT Sno from tb_Student0 where Sgrade<60
--8
SELECT Sname,Sdept,Sage from tb_Student0 where sage  between '18' and '22'
--9  
SELECT Sname,Sdept,Sage from tb_Student0 where sage not between '18' and '22'

--10
SELECT sname, ssex,Sdept FROM tb_student0 where Sdept IN ('is' ,'ma' ,'cs')
--11
SELECT sname, ssex,Sdept FROM tb_student0 where Sdept not IN ('is' ,'ma' ,'cs')
--12
SELECT *FROM tb_student0 where Sno=200215145

--13
Select Sno,Sname ,ssex FROM tb_student0 where Sname not LIKE '张%'
--14
Select Sno,Sname ,ssex FROM tb_student0 where Sname  LIKE '李__' 
--15
select sname sno from tb_Student0 WHERE Sname  LIKE '_丽'
--16
Select Sname FROM tb_student0 where Sname not LIKE  '陈%'
--17
Select Sname ,sno FROM tb_student0 where sGrade IS null

--18
Select  sdept ,AVG(sGrade)平均成绩 from tb_student0 GROUP BY Sdept

--19
Select Sname ,sno FROM tb_student0 where Sgrade IS not null

--20
Select Sname ,sno FROM tb_student0 where sgrade IS not null

--21
SELECT COUNT(*) as 学生总人数 from tb_student0

--22
SELECT COUNT(*)as 总人数,Ssex as 性别 from tb_student0 group BY Ssex
--23
SELECT AVG(Sgrade) as 平均成绩,Sdept from tb_student0 group BY Sdept order by AVG(Sgrade) desc
--24
SELECT max(Sgrade) as 最高分,Sdept from tb_student0 group BY Sdept
--25
SELECT min(Sgrade) as 最低分,Sdept from tb_student0 group BY Sdept

--26
SELECT TOP 1 Sdept from tb_student0 group BY Sdept ORDER BY AVG(Sgrade)

--27
SELECT avg(Sgrade) as 平均成绩,Ssex as 性别 from tb_student0 group BY Ssex

--28
SELECT Sname,Sgrade from tb_student0 where Sgrade>(SELECT AVG(Sgrade) ) 

--29
SELECT Sdept from tb_student0 group BY Sdept HAVING COUNT(*)>50
--30
SELECT Sdept,AVG(Sgrade) from tb_student0 where Sage<18 GROUP BY Sdept HAVING Sdept='cs'





