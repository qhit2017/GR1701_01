create table tb_emp(
empno tinyint identity(1,1) primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate nvarchar(16),
sex nvarchar(16) check(sex='man' or sex='woman')
)

insert into tb_emp values

('jackie',10,'����',3500,500,'2007-01-25','man'),
('tom',20,'����Ա',2000,500,'2017-01-25','man'),
('mary',10,'����',3000,500,'2017-01-25','woman'),
('lucy',30,'���๤',900,1000,'2017-01-25','woman'),
('Lily',10,'����',3000,500,'2007-01-25','woman'),
('Mackle',10,'����Ա',300,500,'2017-01-25','man'),
('������',20,'����Ա',3000,500,'2009-01-25','woman'),
('����',10,'����',3000,500,'2017-01-25','woman'),
('���Ļ�',20,'����',1000,1500,'2012-01-25','woman'),
('�',10,'���๤',2000,500,'2011-01-25','woman'),
('����������',30,'����',3000,500,'2011-01-25','woman'),
('����������',10,'����',1500,500,'2011-01-25','woman'),
('��÷÷',20,'����',2500,500,'2017-01-25','woman')
--Ա����emp(empno,ename,deptno,job,sal,comm,hiredate,sex) 
--����	���������ģ�
--empno	����
--ename	����
--deptno	����
--job	ְλ
--sal	нˮ
--comm	����
--hiredate	�ܹ�����
--Sex	�Ա�


--1  ѡ����30�е�����Ա����
SELECT * FROM tb_emp where deptno='30' 
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű��
select empno,ename,deptno from tb_emp where job='����Ա' 
--3  �ҳ��������н���Ա����
select ename from tb_emp where  comm>sal 
--4  �ҳ��������н��60%��Ա���� 
select ename from tb_emp where  comm>sal*0.6
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
select*from tb_emp where (deptno=10 and job='����')or(deptno=20 and job='����Ա') 
--6  �ҳ�����10�����о���MANAGER����
--����20�����а���Ա��CLERK�����Լ����в���
--�м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select*from tb_emp where deptno=10 and job='����'or deptno=20 and job='����Ա'or (job not in ('����','����Ա')and sal>=2000)
--7  �ҳ��н����Ա���Ĳ�ͬ������
select ename, job from tb_emp where comm is not null
--8  �ҳ�û�н���򽱽����100��Ա���� 
select ename from tb_emp where comm is  null or comm <100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select AVG(sal),deptno from tb_emp group by deptno order by avg(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select ename from tb_emp where YEAR(hiredate) <2012
--11  ��ѯ��˾Ա��нˮ������
select sum(sal)as ���� from tb_emp 
--12  ��ʾ����Ϊ5���ַ���Ա���������� 
select*from tb_emp where ename like'_____'
--13  ��ʾ������'R'��Ա����������
select ename from tb_emp where ename not like'r' 
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
select COUNT(*),deptno from tb_emp group by deptno order by COUNT(*) desc
--15  ��ѯÿ������ŮԱ����������
select deptno,COUNT(*)as ���� from tb_emp  where sex='woman' group by deptno
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
select ename,hiredate from tb_emp where year(hiredate)>2007 and YEAR(hiredate)<2017
--17  ��ʾԱ������ϸ���ϣ�����������
select*from tb_emp order by ename asc
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
select ename,hiredate from tb_emp order by getdate()-year(hiredate) desc
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
select ename,job,sal from tb_emp order by job desc,sal
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select*from tb_emp where comm>(select AVG(comm)from tb_emp) 
--21  ��ѯÿ��Ա�������루��������������нˮ����
select ename,SUM(sal+comm)as ������ from tb_emp group by ename 
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select AVG(comm)as ƽ��,AVG(sal)as ƽн,deptno ,job from tb_emp group by deptno,job
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct ename from  tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
select * from tb_emp where ename in(
select ename from  tb_emp group by ename having COUNT(*)<2)
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
select*from tb_emp where ename like'%a%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
select ename ,count(1)as �ظ����� from tb_emp group by ename having COUNT(1)>=2
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select*from tb_emp where sal>900 and sal<3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select job,min(sal)as ��� from tb_emp group by job order by min(sal) 


