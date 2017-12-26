CREATE table tb_student(
Sno nvarchar(16) primary key,
Sname nvarchar(16),
Ssex nvarchar(16) check(Ssex='man' or Ssex='woman') default 'man',
Sage smallint,
Sdept nvarchar(16),
Grade smallint)
INSERT INTO tb_student(Sno,Sname,Ssex,Sage,Sdept,Grade) VALUES 
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

SELECT * FROM tb_student
--1.	��ѯȫ��ѧ����ѧ����������
SELECT Sname,Sno from tb_student
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sname,Sno,Sdept FROM tb_student
--3.	��ȫ��ѧ�����������������ݡ�
SELECT Sname,YEAR(GETDATE()) as ������� from tb_student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT Sname from tb_student where Sdept='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname from tb_student WHERE Sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*)as ����,AVG(Grade)as ƽ���ɼ� FROM tb_student WHERE Sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sno FROM tb_student WHERE Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ������
SELECT Sname,Sdept,Sage from tb_student where Sage BETWEEN 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_student where Sage not BETWEEN 20 AND 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex FROM tb_student WHERE Sdept IN ('is','ma','cs')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
INSERT INTO tb_student(Sno,Sname,Sdept) VALUES ('12','�Ź�ǿ','ph')
SELECT Sname,Ssex FROM tb_student WHERE Sdept not IN ('is','ma','cs')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_student WHERE Sno=09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Ssex FROM tb_student WHERE Sname LIKE '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname FROM tb_student WHERE Sname LIKE '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname,Sno FROM tb_student WHERE Sname LIKE '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname FROM tb_student WHERE Sname not LIKE '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno FROM tb_student where Grade IS null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT Sdept FROM tb_student GROUP BY Sdept 
SELECT Sdept,AVG(Grade)AS ƽ���ɼ� FROM tb_student GROUP BY Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
select Sname,Sno,Grade from tb_student WHERE Grade is NOT null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
SELECT * from tb_student order by Sdept,Sage DESC
--21.	��ѯѧ����������
SELECT COUNT(*) AS ������ from tb_student
--22.	��ѯ������Ů����������
SELECT Ssex,COUNT(*) FROM tb_student GROUP BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT Sdept,AVG(Grade)AS ƽ���ɼ� FROM tb_student group BY Sdept ORDER BY AVG(Grade) DESC
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
select Sdept,MAX(Grade)AS ��óɼ� FROM tb_student GROUP BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
select Sdept,MIN(Grade)AS ���ɼ� FROM tb_student GROUP BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT Sdept as רҵ,MIN(AVG(Grade)) FROM tb_student group BY Sdept
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT Ssex as �Ա�, Grade as ƽ���� FROM tb_student GROUP BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname as ����,Grade AS �ɼ� from tb_student where Grade>AVG(Grade)
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT sdept as רҵ,COUNT(Sdept)as רҵ���� from tb_student group BY Sdept HAVING count(Sdept)>1
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT AVG(Grade) as ƽ���ɼ�, Sdept as רҵ FROM tb_student GROUP BY Sdept
