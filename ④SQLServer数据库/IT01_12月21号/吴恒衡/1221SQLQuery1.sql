create database db_Wuhengheng1
use db_Wuhengheng1

create table tb_Student0(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check(Ssex='��' or Ssex='Ů') default'��',
Sage smallint,
Sdept char(20) null,
Sgrade smallint )




insert into tb_Student0(Sno,Sname,Ssex,Sage,Sdept,Sgrade)
values('200215121','����','��',20,'CS',60),
('200215122','����','Ů',19,'CS',38),
('200215123','����','Ů',18,'MA',98),
('200215124','����','��',19,'IS',32),
('200215125','���곽','��',19,'CS',25),
('200215126','�����','��',18,'MA',18),
('200215127','�Ż���','��',19,'IS',98),
('200215128','��˼��','��',19,'CS',78),
('200215129','������','��',18,'MA',98),
('200215130','�����','��',19,'IS',25),
('200215131','����','��',19,'cf',66),
('200215132','�ֻ۲�','��',18,'MA',75),
('200215133','�̽�','��',19,'IS',69),
('200215134','���ƽ','Ů',19,'CS',32),
('200215135','���','��',18,'MA',25),
('200215136','�߽�','��',19,'IS',14),
('200215137','��ͮͮ','Ů',19,'IS',68),
('200215138','��','��',19,'CS',78),
('200215139','ʷ����','Ů',18,'MA',32),
('200215140','���Ӳ�','��',19,'IS',45),
('200215141','������','��',19,'CS',36),
('200215142','����','��',18,'MA',14),
('200215143','������','��',19,'IS',36),
('200215144','ʷ����','��',19,'CS',15),
('200215145','������','Ů',18,'MA',35)
USE db_Wuhengheng1


select name from sys.objects where type ='u'
sp_help tb_student0
insert into tb_student0(Sno,Sname,Ssex,Sage,Sdept,Sgrade)values
('200215146','����','��',16,'ma',78)


SELECT * FROM tb_Student0

UPDATE tb_Student0 SET  Ssex = 'Ů', sage=21 WHERE sname='����' 
--1
select sno,Sname,ssex,sage,sdept from tb_Student0
--2
select sno as ѧ��,Sname as ���� from tb_Student0
--3
SELECT sname as ����,year(GETDATE())-sage from tb_Student0
--4
SELECT Sname,Sdept from tb_Student0 where Sdept = 'cs'
--5
SELECT Sname,sage from tb_Student0 where Sage<20
--6
select count(*)as δ����,avg(Sgrade)as ƽ��ֵ from tb_Student0 where Sage<18 
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
Select Sno,Sname ,ssex FROM tb_student0 where Sname not LIKE '��%'
--14
Select Sno,Sname ,ssex FROM tb_student0 where Sname  LIKE '��__' 
--15
select sname sno from tb_Student0 WHERE Sname  LIKE '_��'
--16
Select Sname FROM tb_student0 where Sname not LIKE  '��%'
--17
Select Sname ,sno FROM tb_student0 where sGrade IS null

--18
Select  sdept ,AVG(sGrade)ƽ���ɼ� from tb_student0 GROUP BY Sdept

--19
Select Sname ,sno FROM tb_student0 where Sgrade IS not null

--20
Select Sname ,sno FROM tb_student0 where sgrade IS not null

--21
SELECT COUNT(*) as ѧ�������� from tb_student0

--22
SELECT COUNT(*)as ������,Ssex as �Ա� from tb_student0 group BY Ssex
--23
SELECT AVG(Sgrade) as ƽ���ɼ�,Sdept from tb_student0 group BY Sdept order by AVG(Sgrade) desc
--24
SELECT max(Sgrade) as ��߷�,Sdept from tb_student0 group BY Sdept
--25
SELECT min(Sgrade) as ��ͷ�,Sdept from tb_student0 group BY Sdept

--26
SELECT TOP 1 Sdept from tb_student0 group BY Sdept ORDER BY AVG(Sgrade)

--27
SELECT avg(Sgrade) as ƽ���ɼ�,Ssex as �Ա� from tb_student0 group BY Ssex

--28
SELECT Sname,Sgrade from tb_student0 where Sgrade>(SELECT AVG(Sgrade) ) 

--29
SELECT Sdept from tb_student0 group BY Sdept HAVING COUNT(*)>50
--30
SELECT Sdept,AVG(Sgrade) from tb_student0 where Sage<18 GROUP BY Sdept HAVING Sdept='cs'





