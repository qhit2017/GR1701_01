update tb_employee set salary=4500,dateline=GETDATE() where name='saj'

select *from tb_employee
sp_help tb_employee

create table tb_student(
sno nvarchar(16)primary key,
sname nvarchar(20) not null,
ssex nvarchar(10) check(ssex='man' or ssex='woman')default 'man',
sage smallint,
sdept nvarchar(16),
grade smallint
)

insert into tb_student values
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

--1����ѯȫ��ͬѧ��ϸ��Ϣ
select*from tb_student
--2:�鿴ȫ��ѧ��ѧ�ź�����
select sno as ѧ��,sname as ���� from tb_student
--3����ѯȫ��ѧ���������������
select sname as ����,YEAR(GETDATE())-sage as������� from tb_student
--4.��ѯ���������ѧ��רҵȫ��ѧ��������
select ����=sname from tb_student where sdept='CS'
--5.��ѯ����������20�����µ�ѧ�������������䡣
select ����=sname,�ɼ�=sage from tb_student where sage<20
--6.��ѯδ�����ѧ����������ƽ���ɼ���
select δ����ѧ������=count(sage),ƽ���ɼ�=avg(grade) from tb_student where sage<18
--7.��ѯ�ɼ��в������ѧ����ѧ�š�
select ѧ��=sno from tb_student where grade<60
--8.��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select ����=sname,רҵ=sdept,����=sage from tb_student where sage>=18 and sage<=22 order by sage
select ����=sname,רҵ=sdept,����=sage from tb_student where sage between 18 and 22 order by sage desc
--9.��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
select sname as ����,sdept as רҵ,sage as ���� from tb_student where sage<20 or sage>23 order by sage
--10.��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
select sname,ssex from tb_student where grade in('IS','MA','CS')
--11.��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
select sname,ssex from tb_student where grade not in('IS','MA','CS')
--12.��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
select *from tb_student where sno=09102040203
--13.��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
select sname,sno,ssex from tb_student where sname like'��%'
--14.��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
select sname from tb_student where sname like'��__'
--15.��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
select sname,sno from tb_student where sname like'_��%'
--16.��ѯ���в��ա��¡���ѧ��������
select sname from tb_student where sname not like'��%'
--17.��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
select sno,sname from tb_student where grade is null
--18.��ѯÿ��רҵ��ѧ����ƽ���ɼ���
select sdept,AVG(grade)as ƽ���� from tb_student group by sdept 
--19.�������гɼ���ѧ����ѧ�ź�������
select sno,sname from tb_student where grade >0
--20.��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
select*from tb_student order by sage desc,sdept asc                         
--21.��ѯѧ����������
select count(sname)as ������ from tb_student
--22.��ѯ������Ů����������
select ssex,COUNT(grade)as ���� from tb_student group by ssex
--23.��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
select sdept,AVG(grade)as ƽ���ɼ� from tb_student group by sdept order by AVG(grade) asc
--24.��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
select sdept, MAX(grade)as��� from tb_student group by sdept
--25.��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
select sdept, min(grade)as��� from tb_student group by sdept
--26.��ѯƽ���ɼ�����רҵ�����֡�

--27.��ѯ������Ů����ƽ���ɼ���
select ssex,AVG(grade)as ƽ�� from tb_student group by ssex
--28.��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���

--29.��ѯרҵѧ����������50�˵�רҵ����

--30.��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
