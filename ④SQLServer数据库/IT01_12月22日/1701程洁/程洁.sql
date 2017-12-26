CREATE database db_students
CREATE table tb_students(
Sno nvarchar(16)primary key,
 Sname nvarchar(32)not null,
 Ssex  nvarchar(8)check (Ssex='man'or Ssex='woman')default 'man',
 Sage  smallint ,
Sdept nvarchar(8),
Grade smallint)
USE db_students
sp_help tb_students
INSERT into tb_students values
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
SELECT * FROM tb_students
--��SQL���������е����ѯ��
--1.	��ѯȫ��ѧ����ѧ����������
select sno,sname from tb_students
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select Sname,sno ,sdept from tb_students
--3.	��ȫ��ѧ�����������������ݡ�
select sname as ���� ,YEAR(GETDATE())-SAGE as ������� FROM tb_students
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
select ����=sname from tb_students where sdept ='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,sage from tb_students where Sage <20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*) as����, avg(Grade)as ƽ���� FROM tb_students where Sage <18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT sno from tb_students where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sage,Sname,Sdept FROM tb_students WHERE Sage  between 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sage,Sname,Sdept FROM tb_students WHERE Sage<20 or Sage>23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select Ssex,Sname FROM tb_students where Sdept = 'MA' or Sdept = 'IS' or Sdept = 'CS'
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Ssex,Sname FROM tb_students where Sdept = 'MA' or Sdept = 'IS' or Sdept = 'CS'
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_students where Sno='09102040203'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Ssex from tb_students where Sname like '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname from tb_students where Sname LIKE '��__' 
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname from tb_students where Sname LIKE '_��%' 
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname from tb_students where Sname  not LIKE '��' 
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno from tb_students WHERE Grade IS null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT sdept רҵ,AVG(grade)as ƽ���� from tb_students GROUP BY Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno FROM tb_students WHERE Grade is not null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
--21.	��ѯѧ����������
SELECT COUNT(*) FROM tb_students 
--22.	��ѯ������Ů����������
SELECT COUNT(Ssex) FROM tb_students group BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT AVG(Grade)
FROM tb_students 
GROUP BY sdept having AVG(Grade)IS not NULL
ORDER BY AVG(Grade) DESC 
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Grade)as�ɼ�,sdept 
from tb_students GROUP BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT min(Grade)as�ɼ�,sdept 
from tb_students GROUP BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT Top 1 Sdept,AVG(Grade)as ƽ���ɼ� 
from tb_students 
GROUP BY sdept HAVING AVG(Grade) IS NOT null 
ORDER BY AVG(Grade) asc
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT Ssex,AVG(Grade)from tb_students GROUP BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Grade FROM tb_students where 
Grade>(SELECT AVG(Grade)from tb_students)
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT sdept from tb_students GROUP by sdept having COUNT(*)> 3
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT AVG(Grade),sdept 
from tb_students
WHERE Sage <22 GROUP BY Sdept
having Sdept ='cs'