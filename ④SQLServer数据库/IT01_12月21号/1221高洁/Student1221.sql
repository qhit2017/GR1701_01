CREATE table tb_Student(

Sno		  nvarchar(16) primary key not null,	
Sname     nvarchar(16) not null,	
Ssex	  nvarchar(16) check(Ssex='man'or Ssex='woman') default 'man',
Sage	  smallint,	
Sdept     nvarchar(16),	
Grade	  smallint
)
CREATE table tb_Student(
Sno nvarchar(16) primary key,
Sname nvarchar(16),
Ssex nvarchar(16) check(Ssex='man' or Ssex='woman') default 'man',
Sage smallint,
Sdept nvarchar(16),
Grade smallint)

INSERT INTO tb_student 
VALUES 
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

--1.	��ѯȫ��ѧ����ѧ����������
    SELECT Sno,Sname FROM tb_Student 
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
	SELECT Sname as '����',Sno as 'ѧ��',Sdept as 'רҵ' from tb_Student 
--3.	��ȫ��ѧ�����������������ݡ�
    SELECT Sname,YEAR(GETDATE())-Sage as '�������'  from tb_Student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
	SELECT Sname from tb_Student where Sdept='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
	SELECT Sname,Sage from tb_Student WHERE Sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
	SELECT COUNT(*)as '����',AVG(Grade)as 'ƽ���ɼ�'   from tb_Student where Sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
	SELECT Sno  from tb_Student where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
	SELECT Sname,Sdept,Sage   from tb_Student where Sage  between 18 AND 22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
	SELECT Sname,Sdept,Sage  from tb_Student where Sage not between 20 and 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
	SELECT Sname,Ssex  from tb_Student where Sdept IN('IS','MA','CS')   
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
	SELECT Sname,Ssex  from tb_Student where Sdept NOT IN('IS','MA','CS')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
	SELECT *  from tb_Student where Sno='09102040203'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
	SELECT Sname,Sno,Ssex  from tb_Student where Sname LIKE'��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
	SELECT Sname  from tb_Student where Sname LIKE'��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
	SELECT Sname,Sno  from tb_Student where Sname LIKE'_��_'
--16.	��ѯ���в��ա��¡���ѧ��������
	SELECT Sname  from tb_Student where not Sname LIKE'��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
	SELECT Sname,Sno  from tb_Student where Grade IS NULL 
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
	SELECT Sdept,AVG(Grade )   from tb_Student GROUP BY Sdept 
--19.	�������гɼ���ѧ����ѧ�ź�������
	SELECT Sname,Sno  from tb_Student where Grade LIKE '%'
	SELECT Sname,Sno  from tb_Student where Grade IS NOT NULL 
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
	SELECT * from tb_Student ORDER BY Sdept,Sage DESC  
--21.	��ѯѧ����������
	SELECT COUNT(*)  FROM tb_Student 
--22.	��ѯ������Ů����������
	SELECT Ssex,COUNT(*)   FROM tb_Student GROUP BY  Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
	SELECT Sdept, AVG(Grade)    FROM tb_Student GROUP BY Sdept
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
	SELECT Sdept, max(Grade)   FROM tb_Student GROUP BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
	SELECT Sdept, min(Grade)   FROM tb_Student GROUP BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
	SELECT TOP 1 Sdept   FROM tb_Student GROUP BY Sdept ORDER BY  AVG(Grade)
--27.	��ѯ������Ů����ƽ���ɼ���
	SELECT Ssex,AVG(Grade )from tb_Student GROUP BY Ssex 
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
	SELECT grade,Sname   FROM tb_Student where  Grade>(SELECT AVG(Grade )from tb_Student  ) 
--29.	��ѯרҵѧ����������50�˵�רҵ����
	SELECT Sdept   FROM tb_Student GROUP BY Sdept HAVING COUNT(*)>50
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
	SELECT Sdept,AVG(Grade)  FROM tb_Student where Sage<18   GROUP BY Sdept HAVING Sdept='cs' 
	
