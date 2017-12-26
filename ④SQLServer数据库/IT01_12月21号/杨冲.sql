CREATE  table tb_students(
Sno nvarchar(16) primary key,
Sname nvarchar (16),
Ssex nvarchar (16)check (Ssex='man' OR Ssex='woman')default 'man',
Sage smallint,
Sdept nvarchar(16),
)
ALTER table tB_students add Grade smallint
INSERT INTO tb_students VALUES('1','jackie','man',15,'IS',89),
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
 SELECT * from tb_students
 --1.	��ѯȫ��ѧ����ѧ����������
 select sno,sname from tb_students
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select sname as ����, sno as רҵ from tb_students

--3.	��ȫ��ѧ�����������������ݡ�
select sname, YEAR(GETDATE())-sage as �������� FROM tb_students 
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
select sname as ���� FROM tb_students where sdept='cs'

--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT sname as ���� ,sage as ���� from tb_students where Sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*) as ���� ,AVG(grade)as ƽ���� FROM tb_students where sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT sno as ѧ�� from tb_students where grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT sname as ���� ,sdept as רҵ, sage as ���� from tb_students where Sage>=18 AND Sage<=22

--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT sname as ���� ,sdept as רҵ,sage as ���� from tb_students where NOT between Sage <=23 and  Sage>=20
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select sname as ����, ssex , Sdept from tb_students where Sdept IN('IS','MA','CS')
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex FROM tb_students where Sdept!='IS' AND  Sdept!='MA' AND  Sdept!='CS'
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
 SELECT * FROM tb_students WHERE Sno='09102040203'
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�

SELECT Sname,Sno,Ssex FROM tb_students WHERE Sname LIKE '��%'
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname FROM tb_students WHERE Sname LIKE '��__'
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ��
SELECT Sname ,Sno from tb_students WHERE Sname LIKE'_��%'

--16.��ѯ���в��ա��¡���ѧ��������
SELECT Sname FROM tb_students WHERE Sname NOT
 LIKE '��%'
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_students WHERE Garde IS NULL

--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT  avg(Garde) FROM tb_students GROUP BY Sdept
--19.�������гɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname FROM tb_students WHERE Garde IS NOT NULL

--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
SELECT * FROM tb_students ORDER BY Sdept,Sage  desc
--21.��ѯѧ����������
SELECT COUNT(*)FROM tb_students
--22.��ѯ������Ů����������
SELECT COUNT(*) FROM tb_students WHERE Ssex='man' or Ssex='woman'

--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
----SELECT avg(Garde),Sdept FROM tb_students11 GROUP BY Sdept ORDER BY  avg(Garde) desc
SELECT AVG(Garde)FROM tb_students GROUP BY Sdept ORDER BY  avg(Garde) DESC 
--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Garde) FROM tb_students
--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT MIN(Garde)FROM tb_students

--26.��ѯƽ���ɼ�����רҵ�����֡�
SELECT  Sdept, AVG(Garde) FROM tb_students GROUP BY Sdept HAVING AVG(
 Garde)<= ANY(SELECT AVG(Garde) FROM tb_students GROUP BY Sdept)
--27.��ѯ������Ů����ƽ���ɼ���
SELECT Ssex, avg(Garde) FROM tb_students GROUP BY Ssex 
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Garde FROM tb_students  WHERE
Garde >(SELECT AVG(Garde)FROM tb_students
)
--29.��ѯרҵѧ����������50�˵�רҵ����
SELECT Sdept FROM tb_students group BY Sdept HAVING  count(*)>3

--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����

SELECT AVG(Garde),Sdept from tb_students WHERE Sage<18 GROUP BY Sdept HAVING Sdept='cs'

