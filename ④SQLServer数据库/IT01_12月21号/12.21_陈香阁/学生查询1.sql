create table tb_students(
Sno nvarchar(11)primary key,
Sname nvarchar(20)not null,
Ssex nvarchar(2)check(Ssex='��'or Ssex='Ů')default'��' not null,
Sage smallint not null,
Sdept nvarchar(20),
Grade smallint)

insert into tb_students(Sno,Sname,Ssex,Sage,Sdept,Grade)
values(1,'����','��',20,'CS',54),
      (2,'����','Ů',19,'CS',65),
      (3,'����','Ů',18,'MA',59),
      (4,'����','��',23,'IS',49),
      (5,'������','Ů',19,'CS',89),
      (6,'����','��',19,'CS',57),
      (09102040204,'����','��',19,'CS',61),
      (09102040205,'����','Ů',18,'MA',71),
      (049710,'����','��','','','')

--1.	��ѯȫ��ѧ����ѧ����������
select Sno,Sname from tb_students 
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select Sname as ����,Sno as ѧ��,Sdept as רҵ from tb_students
--3.	��ȫ��ѧ�����������������ݡ�
select Sname as ����,  year(getdate())-Sage as ������� from tb_students
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
select Sname from tb_students where Sdept='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,Sdept,Sage from tb_students where Sage<=20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT count(*) as ���� ,avg(Grade) as ƽ���� from tb_students where Sage < 18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sno from tb_students where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_students where Sage BETWEEN 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_students where Sage not BETWEEN 20 AND 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex from tb_students where Sdept in ('IS','MA','CS')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex,Sdept from tb_students where Sdept not in ('IS','MA','CS')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_students where Sno=09102040205
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Ssex from tb_students where Sname LIKE '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname from tb_students where Sname LIKE '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname,Sno FROM tb_students WHERE Sname LIKE '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname FROM tb_students WHERE Sname not LIKE '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname,Grade from tb_students where Grade is null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ�����60�֡�
SELECT sdept,avg(Grade)as ƽ���ɼ� from tb_students GROUP BY Sdept HAVING AVG(Grade) > 60
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname from tb_students where Grade>=0
--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
--Ĭ��������
SELECT * FROM tb_students order BY Sdept,Sage DESC
--21.	��ѯѧ����������
SELECT COUNT(*) as ������ from tb_students
--22.	��ѯ������Ů����������
select Ssex,COUNT(Ssex) from tb_students GROUP BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT AVG(Grade) FROM tb_students 
GROUP BY Sdept HAVING AVG(Grade) is NOT NULL
ORDER BY AVG(Grade) DESC
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT MAX(Grade)as ѧ����߳ɼ� from tb_students where Sdept='CS'
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT Sdept, min(Grade)   FROM tb_Students GROUP BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT top 1 percent Sdept,avg(Grade) FROM tb_students GROUP BY Sdept
HAVING AVG(Grade) < =ANY(SELECT AVG(Grade) from tb_students group BY Sdept

--27.	��ѯ������Ů����ƽ���ɼ���
SELECT Ssex,AVG(Grade )from tb_Students GROUP BY Ssex 
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT sname grade FROM tb_students 
WHERE Grade>(SELECT AVG(Grade) 
FROM tb_students)
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT Sdept from tb_students GROUP BY Sdept HAVING COUNT(*) >3
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT AVG(Grade)as ƽ���ɼ� FROM tb_students where Sdept='CS'AND Sage>18