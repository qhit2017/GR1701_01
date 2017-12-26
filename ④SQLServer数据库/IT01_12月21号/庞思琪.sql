CREATE  database db_student
USE db_student
--ѧ����Student(Sno,Sname,Ssex,Sage,Sdept,Grade) 
--����	���������ģ�	��������	��ע
--Sno	ѧ��	char	��Ϊ�ؼ���
--Sname	����	char	
--Ssex	�Ա�	char	��ֵֻ��Ϊ���С���Ů����Ĭ��ֵΪ���С�
--Sage	����	smallint	
--Sdept	רҵ��	Student
CREATE table tb_student(
Sno nvarchar(16) primary key,
Sname nvarchar(16) not null,
Ssex nvarchar(8) check(Ssex='man' or Ssex ='woman') default 'man ',
Sage smallint,
Sdept nvarchar(16),
Grade  smallint)

INSERT INTO tb_student values
('10','jackie','man',15,'cS',89),
('2','tom','man',18,'IS',69),
('3','mary','woman',22,'CS',39),
('4','lucy','woman',22,'MA',69),
('5','Lily','woman',21,'CS',49),
('6','Mackle','man',17,'MA',88),
('7','������','woman',22,'CS',69),
('8','����','woman',30,'MA',18),
('9','���Ļ�','woman',22,'MA',69),
('09102040203','�','woman',22,'MA',69),
('09102040204','����','woman',22,'MA',69)
  
--��SQL���������е����ѯ��
--1.	��ѯȫ��ѧ����ѧ����������
SELECT Sno ,Sname from tb_student 
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sno ,Sname,Sdept from tb_student 
--3.	��ȫ��ѧ�����������������ݡ�
SELECT Sname,year(getdate())-Sage as ������� from tb_student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT Sname as ���� from tb_student where  Sdept ='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sno,Sname,Sage from tb_student where Sage < 20

--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*) as ����, avg(Grade) as ƽ���ɼ�  from tb_student where Sage <18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sno from tb_student where Sage < 60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_student where Sage BETWEEN 18 AND 23
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_student where Sage NOT  BETWEEN 18 AND 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select Sname,Ssex FROM tb_student where Sdept in('IS','MA','SC')

--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Sname,Ssex FROM tb_student where Sdept NOT  in('IS','MA','SC')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
select * FROM tb_student where Sno = 09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select Sname,Sno,Ssex FROM tb_student where Sname LIKE '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
select Sname FROM tb_student where Sname LIKE '��__'
select Sname FROM tb_student where Sname LIKE '��%' AND len(Sname)=2
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select Sname,Sno FROM tb_student where Sname like '_��%'

--16.	��ѯ���в��ա��¡���ѧ��������
select Sname FROM tb_student where Sname like '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
select Sname ,Sno FROM tb_student  where Grade is null
SELECT *FROM tb_student
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select Sdept ,avg(Grade) as ƽ���ɼ� 
FROM tb_student group BY Sdept 
HAVING avg(Grade)>60
--19.	�������гɼ���ѧ����ѧ�ź�������
select Sname,Sno FROM tb_student where Grade IS NOT null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
select * FROM tb_student order BY Sdept ASC,Sage DESC

--21.	��ѯѧ����������
select COUNT(*)as ѧ�������� FROM tb_student
--22.	��ѯ������Ů����������
select Ssex ,COUNT(Ssex)as ��Ů�������� FROM tb_student group by Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT Sdept ,AVG(Grade) as �ɼ� from  tb_student 
group BY Sdept 
ORDER BY AVG(Grade) DESC
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT Sdept,max(Grade) as ��óɼ�  from  tb_student 
group BY Sdept 
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT Sdept,min(Grade) as ��óɼ�  from  tb_student 
group BY Sdept 

--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT top 40 percent Sdept from  tb_student 
group  BY Sdept 
HAVING avg(Grade) <= any (SELECT AVG(Grade) 
 from  tb_student group BY Sdept) 
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT AVG(Grade)as ƽ���ɼ� , Ssex  from tb_student GROUP BY Ssex          
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Grade from tb_student 
where Grade>(SELECT avg (Grade)from tb_student)
--29.	��ѯרҵѧ����������2�˵�רҵ����
SELECT Sdept,COUNT(*)as רҵ���� from tb_student  
group BY Sdept 
HAVING COUNT(*) >2
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT Sage,avg(Grade)AS ƽ���ɼ�,Sdept from tb_student 
where Sdept = 'CS'
GROUP BY Sage,Sdept
HAVING Sage < 18

--------------------------------------------------------------------------------------------
3,