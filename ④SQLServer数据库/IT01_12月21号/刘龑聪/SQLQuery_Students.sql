CREATE table tb_students (
Sno nvarchar(16) primary key,
Sname nvarchar(16) not null,
Ssex nvarchar(16) check(Ssex='man' or Ssex='woman') default 'man',
Sage smallint not null,
Sdept nvarchar(16),
Grade smallint)
INSERT INTO tb_students (Sno,Sname,Ssex,Sage,Sdept,Grade) values
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
SELECT Sno,Sname FROM tb_students
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sname,Sno,Sdept FROM tb_students
--3.	��ȫ��ѧ�����������������ݡ�
SELECT Sname as ����,YEAR(GETDATE())-Sage as ������� FROM tb_students
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT * FROM tb_students where Sdept='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,Sage from tb_students where Sage < 20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*) as δ����ѧ������,AVG(Grade) as ƽ���ɼ� FROM tb_students where Sage < 18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sno from tb_students where Grade < 60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,Sdept,Sage FROM tb_students where Sage BETWEEN 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdept,Sage FROM tb_students where Sage not BETWEEN 20 AND 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex,Sdept from tb_students where Sdept  IN ('CS','IS','MA') GROUP BY Sdept,Sname,Ssex
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex from tb_students where Sdept NOT IN ('CS','IS','MA')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_students where Sno = '09102040203'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Ssex from tb_students where Sname LIKE '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname from tb_students where Sname LIKE '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname,Sno from tb_students where Sname LIKE '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname from tb_students where Sname NOT LIKE '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno from tb_students where Grade IS null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT Sdept,AVG(Grade) as ƽ���� from tb_students GROUP BY Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno from tb_students where Grade IS not null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
SELECT * FROM tb_students ORDER BY Sdept ASC ,Sage desc
--21.	��ѯѧ����������
SELECT COUNT(*) as ѧ�������� from tb_students
--22.	��ѯ������Ů����������
SELECT COUNT(*)as ������,Ssex as �Ա� from tb_students group BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT AVG(Grade) as ƽ���ɼ�,Sdept from tb_students group BY Sdept order by AVG(Grade) desc
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Grade) as ��߷�,Sdept from tb_students group BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT min(Grade) as ��ͷ�,Sdept from tb_students group BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT TOP 1 Sdept from tb_students group BY Sdept ORDER BY AVG(Grade)
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT avg(Grade) as ƽ���ɼ�,Ssex as �Ա� from tb_students group BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Grade from tb_students where Grade>(SELECT AVG(Grade) from tb_students) 
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT Sdept from tb_students group BY Sdept HAVING COUNT(*)>50
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT Sdept,AVG(Grade) from tb_students where Sage<18 GROUP BY Sdept HAVING Sdept='cs'