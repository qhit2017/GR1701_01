create database db_Student
create table tb_Student(
Sno char(20) primary key,
Sname char(11) not null,
Ssex char(4) check(Ssex='��' or Ssex='Ů') default '��' not null,
Sage smallint ,
Sdept char(20),
Grade smallint
)
select*from tb_Student
insert into tb_Student values (
1,'join','��',18,'CS',68),
(2,'tom','��',17,'IS',89),
(3,'jike','��',20,'MA',53),
(4,'rose','Ů',24,'IS',97),
(5,'����','Ů',17,'MA',78),
(6,'�´�','Ů',18,'IS',54),
(7,'������','Ů',18,'IS',54),
(8,'�ſ�','��',25,'IS',54),
(09102040203,'lucy','Ů',23,'IS',65),
(09102040204,'ken','��',23,'CS',78)

--1.	��ѯȫ��ѧ����ѧ����������
select Sno,Sname from tb_Student
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
select Sname,Sno,Sdept from tb_Student
--3.	��ȫ��ѧ�����������������ݡ�
select ����=Sname,year(GETDATE())-Sage as ������� from tb_Student
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
select Sname,Sdept from tb_Student where Sdept='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
select Sname,Sage from tb_Student where Sage<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
select count(Sage) as ����,avg(Grade) as ƽ���ɼ� from tb_Student where Sage<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
Select Grade from tb_Student where Grade<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select Sname,Sdept,Sage from tb_Student where Sage>=18 and Sage<=22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
select Sname,Sdept,Sage from tb_Student where not Sage<20 or Sage>23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
insert into tb_Student (Sno,Sname,Sdept) values (11,'��','sports')
select Sname,Ssex from tb_Student where Sdept='IS' or Sdept='MA' or Sdept='CS'
select Sname,Ssex from tb_Student where Sdept in ('IS','MA','CS')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select Sname,Ssex from tb_Student where not (Sdept='IS' or Sdept='MA' or Sdept='CS')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
select * from tb_Student where Sno=09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select Sname,Sno,Sage from tb_Student where Sname like '��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
select Sname from tb_Student where Sname like '��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select Sname,Sno from tb_Student where Sname like '_��'
--16.	��ѯ���в��ա��¡���ѧ��������
select Sname from tb_Student where not Sname like '��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
select Sno,Sname from tb_Student where Grade is null
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select Sdept,AVG(Grade) from tb_Student group by Sdept
--19.	�������гɼ���ѧ����ѧ�ź�������
select Sno,Sname from tb_Student where not Grade is null
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
select * from tb_Student order by Sdept asc , Sage desc
--21.	��ѯѧ����������
select count(Sname) as ������ from tb_Student
--22.	��ѯ������Ů����������
select '�Ա�'=Ssex,count(Ssex)as ���� from tb_Student GROUP by Ssex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
select Sdept,AVG(Grade) as ƽ���ɼ� from tb_Student group by Sdept order by ƽ���ɼ� desc
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
select Sdept,MAX(Grade) from tb_Student group by Sdept
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
select Sdept,min(Grade) from tb_Student group by Sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�
--27.	��ѯ������Ů����ƽ���ɼ���
select Ssex,AVG(Grade) from tb_Student group by Ssex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
--29.	��ѯרҵѧ����������5�˵�רҵ����
select Sdept,COUNT(Sdept) as �������� from tb_Student group by Sdept having COUNT(Sdept)>5
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����