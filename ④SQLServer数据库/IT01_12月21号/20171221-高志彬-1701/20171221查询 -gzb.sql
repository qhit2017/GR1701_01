USE db_GZB
SELECT  * FROM  tb_students
sp_help  tb_students
CREATE  table tb_students(
Sno  nvarchar(16)  primary key,
Sname  nvarchar(16)  ,
Ssex  nvarchar(8) check (Ssex ='man'  or  Ssex='woman')  default 'man',
Sage  smallint,
Sdept  nvarchar(16),
Grade smallint
)
INSERT  INTO  tb_students (Sno,Sname,Ssex,Sage,Sdept,Grade) VALUES 
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
SELECT  * FROM tb_students
sp_help tb_students
---1.	��ѯȫ��ѧ����ѧ����������
SELECT  Sno,Sname  from tb_students
---2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT Sname as ����,Sno as ѧ��,Sdept as רҵ FROM tb_students 
---3.	��ȫ��ѧ�����������������ݡ�
select  Sname AS ����, year(getdate())-Sage AS ������� from tb_students
---4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT  Sname from tb_students where Sdept='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname AS ����,Sage AS ���� FROM tb_students 
---6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(*)  ,avg(Grade) FROM  tb_students WHERE Sage<18
----7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT Sno as ������ѧ��ѧ�� from tb_students WHERE Grade<60 
---8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_students WHERE Sage BETWEEN 18 AND 22
---9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname,Sdept,Sage from tb_students WHERE Sage NOT BETWEEN 20 AND 23
---10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex from tb_students where Sdept IN('IS','MA','CS')
---11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT Sname,Ssex from tb_students where Sdept not IN('IS','MA','CS')
---12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_students where Sno =09102040203
---13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname,Sno,Sage from tb_students where Sname LIKE '��%' 
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname FROM tb_students where Sname LIKE  '��__'
SELECT Sname FROM tb_students where Sname LIKE  '��%' AND LEN(Sname)=3
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname FROM tb_students where Sname LIKE  '_��%' 
SELECT Sname FROM tb_students where Sname LIKE  '__[a-z]y'
SELECT Sname FROM tb_students where Sname LIKE  '__[^d-z]y' 

INSERT INTO tb_students (Sno,Sname,Ssex,Sage,Sdept,Grade)VALUES
('0921451242','�','woman',22,'MA',69)





--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname FROM tb_students where Sname NOT LIKE  '��%' 
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname from tb_students WHERE Grade IS  NULL
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT  Sdept, AVG(Grade) as ƽ���ɼ� from tb_students group BY Sdept 
SELECT  Sdept, AVG(Grade) as ƽ���ɼ� 
from tb_students group BY Sdept  HAVING AVG(Grade)>60
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname,Grade FROM tb_students WHERE Grade IS NOT NULL
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�
--ͬһϵ�е�ѧ�������併�����С�
SELECT * FROM tb_students ORDER BY Sdept ,Sage DESC
--21.	��ѯѧ����������
SELECT COUNT(*)as ѧ�������� FROM tb_students
--22.	��ѯ������Ů����������
SELECT Ssex,COUNT(*) FROM tb_students GROUP BY Ssex 
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�

SELECT Sdept as רҵ,AVG(Grade) as רҵ��ƽ���ɼ� FROM tb_students 
GROUP BY Sdept 
having avg(Grade) is not null 
ORDER BY AVG(Grade) 

--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Grade) FROM  tb_students group BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT MIN(Grade) FROM  tb_students group BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�

SELECT  top 1 Sdept ,AVG(Grade) from tb_students
GROUP BY Sdept 
HAVING AVG(Grade) IS NOT NULL 

SELECT  top 1 Sdept AS רҵ,AVG(Grade) AS ƽ���ɼ� from tb_students
GROUP BY Sdept 
HAVING AVG(Grade) < ANY (SELECT AVG(Grade) from tb_students GROUP BY Sdept) 
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT Ssex,AVG(Grade) FROM tb_students GROUP BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���

SELECT Sname AS ѧ������ , Grade AS �ɼ� FROM tb_students  
WHERE Grade >(SELECT AVG(Grade) from tb_students  )

--29.	��ѯרҵѧ����������50�˵�רҵ����

SELECT Sdept as רҵ,COUNT(Sdept) as רҵ���� 
FROM tb_students GROUP BY Sdept HAVING COUNT(Sdept)>3

--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT Sdept as רҵ��,AVG(Grade) as ƽ���ɼ� FROM tb_students 
WHERE Sage <18
GROUP BY Sdept HAVING Sdept='IS'