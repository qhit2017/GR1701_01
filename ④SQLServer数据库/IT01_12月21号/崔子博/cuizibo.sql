
--Sno	ѧ��	char	��Ϊ�ؼ���
--Sname	����	char	
--Ssex	�Ա�	char	��ֵֻ��Ϊ���С���Ů����Ĭ��ֵΪ���С�
--Sage	����	smallint	
--Sdept	רҵ��	char	����Ϊ��
--Grade	�ɼ�	smallint	����Ϊ��



CREATE  table tb_student(
sno nvarchar (16) primary key,
sname nvarchar (20) not null,
ssex nvarchar (8) check (ssex='man'or ssex='woman')default 'man',
sage smallint,
sdept nvarchar(16),
grade smallint
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
 
 
--1.	��ѯȫ��ѧ����ѧ����������
SELECT sno ,sname from tb_student
 
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��

select sname as ����,sno as ѧ��,sdept as רҵ from tb_student 
--3.	��ȫ��ѧ�����������������ݡ�


select sname as ����,YEAR(GETDATE())-sage as ������� from tb_student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������


select  sname from tb_student where sdept='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣


SELECT sname,sage from tb_student where sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���



select count(*)as ����,avg(grade)as ƽ���� FROM  tb_student where sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�



SELECT sno from tb_student where grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣



select sname, sdept, sage from tb_student where sage>=18 AND sage <=22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣



SELECT Sname ,sdept, sage from tb_student where sage NOT between 20 and 23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�



SELECT sname,ssex from tb_student where grade IN ('is','ma','cs')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�




--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����



SELECT  * FROM tb_student where sno =09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�



SELECT  sname,sno,ssex from tb_student where sname like '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������



SELECT sname from tb_student where sname LIKE '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�



SELECT SNAME, SNO from tb_student where sname LIKE '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������



SELECT sname from tb_student where sname not LIKE '��' 
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������



SELECT sno sname FROM  tb_student where grade IS null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���



select AVG(grade)as �ɼ� ,Sdept from tb_student group BY sdept
--19.	�������гɼ���ѧ����ѧ�ź�������



SELECT  sno, sname from tb_student where grade IS NOT NULL 
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�


SELECT * FROM tb_student order BY sdept ASC ,sage DESC 
--21.	��ѯѧ����������

SELECT COUNT(*)as ������ FROM tb_student 
--22.	��ѯ������Ů����������



select ssex ,count(ssex) from tb_student group BY ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�



select AVG(grade) as ƽ���ɼ�,sdept from tb_student group BY sdept ORDER BY avg(grade) desc 
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���



SELECT 
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
--26.	��ѯƽ���ɼ�����רҵ�����֡�
--27.	��ѯ������Ů����ƽ���ɼ���
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
--29.	��ѯרҵѧ����������50�˵�רҵ����
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����

 
 
 