CREATE table tb_student (
Sno nvarchar (16) primary key,
Sname nvarchar(16) not null ,
Ssex nvarchar (8) check(Ssex='man' or Ssex='woman'),
Sage smallint not null,
Sdept nvarchar(32) null,
Grade smallint 
)
INSERT INTO tb_student VALUES
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

--1����ѯȫ��ѧ����ѧ����������
SELECT Sno , Sname FROM tb_student
--2����ѯȫ��ѧ����������ѧ�š�����ϵ��
SELECT Sno , Sname, sdept FROM tb_student

--3����ȫ��ѧ�����������������ݡ�
SELECT year(GETDATE())-sage as �������, Sname FROM tb_student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT  Sname  FROM tb_student WHERE Sdept='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT  Sname, Sage FROM tb_student where Sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
Select COUNT(*)as ����,AVG(Grade)as ƽ���ɼ� FROM tb_student where Sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
Select sno ,grade FROM tb_student where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
Select Sname , Sage, sdept  FROM tb_student where Sage>18 OR sage<22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
Select Sname , Sage, sdept  FROM tb_student where not Sage>20 OR sage>23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT sname, ssex,Sdept FROM tb_student where Sdept IN ('is' ,'ma' ,'cs')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT sname, ssex,Sdept FROM tb_student where Sdept not IN ('is' ,'ma' ,'cs')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT *FROM tb_student where Sno=09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
Select Sno,Sname ,ssex FROM tb_student where Sname not LIKE '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������  
Select Sno,Sname ,ssex FROM tb_student where Sname  LIKE '��__' 
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
Select Sname ,sno FROM tb_student where Sname  LIKE '_��_'
--16.	��ѯ���в��ա��¡���ѧ��������
Select Sname FROM tb_student where Sname not LIKE  '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
Select Sname ,sno FROM tb_student where Grade IS null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
Select  sdept ,AVG(Grade)ƽ���ɼ� from tb_student GROUP BY Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
Select Sname ,sno FROM tb_student where Grade IS not null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
Select Sname ,sno FROM tb_student where Grade IS not null
--21.	��ѯѧ����������
SELECT COUNT(*) as ѧ�������� from tb_student
--22.	��ѯ������Ů����������
SELECT COUNT(*)as ������,Ssex as �Ա� from tb_student group BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT AVG(Grade) as ƽ���ɼ�,Sdept from tb_student group BY Sdept order by AVG(Grade) desc
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Grade) as ��߷�,Sdept from tb_student group BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT min(Grade) as ��ͷ�,Sdept from tb_student group BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT TOP 1 Sdept from tb_student group BY Sdept ORDER BY AVG(Grade)
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT avg(Grade) as ƽ���ɼ�,Ssex as �Ա� from tb_student group BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Grade from tb_student where Grade>(SELECT AVG(Grade) from tb_students) 
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT Sdept from tb_student group BY Sdept HAVING COUNT(*)>50
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT Sdept,AVG(Grade) from tb_student where Sage<18 GROUP BY Sdept HAVING Sdept='cs'

















