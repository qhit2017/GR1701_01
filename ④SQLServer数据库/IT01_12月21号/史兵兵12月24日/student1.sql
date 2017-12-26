USE db_Students
CREATE table tb_student1(
Sno nvarchar (32) primary key,
Sname nvarchar (32) not null,
Ssex nvarchar (8) check(Ssex='man' or Ssex='woman'),
Sage smallint  ,
Sdept nvarchar (16),
Grade smallint 
)
INSERT INTO tb_student1
VALUES ('1','jackie','man',15,'IS',89),
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
SELECT  Sname,Sno from tb_student1
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select  Sname,Sno,Sdept from tb_student1
--3.	��ȫ��ѧ�����������������ݡ�

select Sname,YEAR(GETDATE() )-Sage from tb_student1???
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT		Sname from tb_student1 where Sdept='cs'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT Sname,Sage from tb_student1 where Sage<20

--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT count(*),AVG(Grade) from tb_student1 where sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ��
SELECT Sno from tb_student1 where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ������
 SELECT Sname, Sdept,Sage from tb_student1 where Sage>=18 AND Sage<=22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
SELECT Sname, Sage,Sdept from tb_student1 where Sage<18 or Sage >23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT Sname,Ssex from tb_student1 where Sdept='IS' or Sdept ='MA' or Sdept ='CS'
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Sname,Ssex from tb_student1 where Sdept ='IS' or Sdept ='MA' or Sdept ='CS'

--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * from tb_student1 where  Sno='09102040203'
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT Sname ,Sno,Ssex FROM tb_student1   where Sname like '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT Sname from tb_student1  where Sname like '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT Sname,Sno from tb_student1  where Sname like '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT Sname from tb_student1 where Sname not  like '��%' 
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT Sno,Sname from tb_student1  where Grade is null 
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT avg(Grade) from tb_student1 GROUP BY Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT Sname,Sno from tb_student1 where Grade  not is null 
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
???????
--21.	��ѯѧ����������
SELECT COUNT(*)from tb_student1
--22.	��ѯ������Ů����������
SELECT COUNT(*) from tb_student1 GROUP BY Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT avg(Grade) from tb_student1 GROUP BY Sdept order by avg (Grade ) desc 
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT max(Grade) from tb_student1 GROUP BY Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT min(Grade) from tb_student1 GROUP BY Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT sdept,AVG(Grade) from tb_student1 
group BY Sdept
HAVING AVG(Grade)<=ANY(SELECT AVG(Grade) from tb_student1 group BY sdept)?????
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT avg(Grade) from tb_student1 GROUP BY Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT Sname,Grade from tb_student1 where Grade>(select avg(Grade) from tb_student1)
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT Sdept from tb_student1 GROUP BY Sdept having COUNT(*)>3
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
select  AVG(Grade),sdept
from tb_student1
where Sage<40
GROUP BY Sdept
HAVING Sdept='cs'


SELECT * FROM  tb_student1

