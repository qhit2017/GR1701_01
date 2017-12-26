CREATE database db_students1
CREATE table tb_students11(Sno nvarchar(16) primary key,
Sname nvarchar(16),Ssex nvarchar(8),
Sage smallint,
Sdept nvarchar(16),Garde smallint)
INSERT INTO tb_students11 VALUES ('1','jackie','man',15,'IS',89),
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
--1.��ѯȫ��ѧ����ѧ����������
SELECT Sage FROM tb_students11
--2.��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sno,Sname,Sage from tb_students11
--3.��ȫ��ѧ�����������������ݡ�
SELECT Sname as ����,year(GETDATE())-Sage as �������� FROM tb_students11
--4.��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT Sname from tb_students11 WHERE Sdept='cs'
--5.��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,Sage FROM tb_students11 WHERE Sage<20
--6.��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*) as ����,AVG(Garde) as ƽ���� from tb_students11 WHERE Sage<18  
--7.��ѯ�ɼ��в������ѧ����ѧ�š�

SELECT Sno FROM tb_students11 WHERE Garde<60
--8.��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,Sdept,Sage FROM tb_students11 WHERE Sage>=18 AND Sage<=22 order by Sage
--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣

SELECT Sname,Sdept,Sage FROM tb_students11 WHERE Sage<=20 or Sage>=23
--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex FROM tb_students11 where Sdept='IS'OR Sdept='MA' OR
 Sdept='CS'
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex FROM tb_students11 where Sdept!='IS' AND  Sdept!='MA' AND  Sdept!='CS'
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
 SELECT * FROM tb_students11 WHERE Sno='09102040203'
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�

SELECT Sname,Sno,Ssex FROM tb_students11 WHERE Sname LIKE '��%'
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname FROM tb_students11 WHERE Sname LIKE '��__'
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ��
SELECT Sname ,Sno from tb_students11 WHERE Sname LIKE'_��%'

--16.��ѯ���в��ա��¡���ѧ��������
SELECT Sname FROM tb_students1 WHERE Sname NOT
 LIKE '��%'
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_students11 WHERE Garde IS NULL

--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT  avg(Garde) FROM tb_students11 GROUP BY Sdept
--19.�������гɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_students11 WHERE Garde IS NOT NULL

--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
SELECT * FROM tb_students11 GROUP by Sdept ORDER BY Sdept,Sage  desc
--21.��ѯѧ����������
SELECT COUNT(*)FROM tb_students11
--22.��ѯ������Ů����������
SELECT COUNT(*) FROM tb_students11 WHERE Ssex='man' or Ssex='woman'

--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT avg(Garde)FROM tb_students11 GROUP BY Sdept ORDER BY  Garde desc
--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Garde) FROM tb_students11
--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT MIN(Garde)FROM tb_students11

--26.��ѯƽ���ɼ�����רҵ�����֡�
SELECT MIN(avg(Garde))FROM tb_students11

--27.��ѯ������Ů����ƽ���ɼ���
SELECT avg(Garde)FROM tb_students11 WHERE Ssex='man' OR Ssex='woman'
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���

--29.��ѯרҵѧ����������50�˵�רҵ����


--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����







--SELECT * FROM tb_students11





 

SELECT Sname,Sdept,Sage FROM tb_students1 WHERE Sage BETWEEN 18 AND 22
SELECT Sname,Ssex FROM tb_students1 where Sdept IN
('IS','MA','CS')


SELECT Sdept ,avg(Garde) FROM tb_students1 GROUP BY Sdept HAVING avg(Garde) >60
