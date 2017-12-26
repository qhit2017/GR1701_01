CREATE table tb_students(
Sno nvarchar (16) primary key,
Sname nvarchar (16),
Ssex nvarchar (16) check (Ssex = 'man' or Ssex = 'woman')default 'man',
Sage smallint,
Sdept nvarchar(16),
)
USE db_student
ALTER table tb_students add Grade smallint
INSERT INTO tb_students VALUES 
('1','jackie','man',15,'IS',89),
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
INSERT INTO tb_students(Sno,sname)VALUES (10,'jack')
SELECT * FROM tb_students
--1.	��ѯȫ��ѧ����ѧ����������
select sno as ѧ��,sname as ���� from tb_students
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select sname as ����,sno as ѧ��,sdept as רҵ from tb_students
--3.	��ȫ��ѧ�����������������ݡ�
select sname,YEAR(GETDATE() )-Sage as �������� from tb_students
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
select sname as ���� from tb_students where Sdept = 'cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT sname as ���� ,sage as ���� from tb_students where Sage < 20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
select COUNT(*) as ���� ,AVG(Grade) as ƽ���� FROM tb_students where Sage<18 
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT sno as ѧ�� FROM tb_students where grade <60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT sname as ����,sdept as רҵ,sage as ���� FROM tb_students WHERE sage >=18 AND sage <= 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT sname as ����,sdept as רҵ,sage as ���� FROM tb_students where Sage not between 20 AND 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT sname as ����,sage as �Ա�, sdept as רҵ FROM tb_students where Sdept = 'is' OR Sdept = 'ma' or sdept ='cs'
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT sname as ����, sage as �Ա�,Sdept as רҵ FROM tb_students where NOT (Sdept = 'is' OR Sdept = 'ma' OR Sdept = 'cs')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_students where Sno = '09102040203'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT sname,sno,ssex from tb_students where sname like '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT sname from tb_students where sname LIKE '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT sname,sno from tb_students where sname like '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT sname as ���� FROM tb_students where sname not like '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT sno as ѧ��,sname as ���� from tb_students where  grade IS  null 
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select  sdept as רҵ,AVG(grade) as ƽ���� from tb_students group BY Sdept 
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT sno,sname from tb_students
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
select * FROM tb_students order BY sdept ASC ,Sage desc
--21.	��ѯѧ����������
SELECT COUNT(*) as ѧ�������� from tb_students
--22.	��ѯ������Ů����������
SELECT Ssex, COUNT(*) from tb_students group BY Ssex 
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT  avg (grade) from tb_students  group BY sdept order BY AVG(grade)  DESC 
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT sdept,MAX(grade) from tb_students group BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT sdept,min(grade) from tb_students group BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT TOP 1 sdept,AVG(grade) from tb_students group BY Sdept HAVING AVG(grade) IS NOT null 
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT ssex as �Ա�,avg(grade) as ƽ���� from tb_students group BY ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT sname as ����, grade as �ɼ� FROM tb_students where grade > (SELECT avg(grade) from tb_students )
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT sdept as רҵ,count(*) from tb_students group BY Sdept HAVING COUNT(*)>3 
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT avg(grade) as ƽ����,sdept as רҵ from tb_students where Sage < 40 GROUP BY Sdept HAVING sdept = 'cs'
