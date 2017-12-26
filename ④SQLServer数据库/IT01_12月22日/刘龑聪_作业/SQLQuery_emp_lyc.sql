create database db_lyc

create table tb_emp
(empno nvarchar(16) primary key,							--empno		����
ename nvarchar(16) not null,								--ename		����
deptno nvarchar(16) not null,								--deptno	����
job nvarchar(16) not null,									--job		ְλ
sal money not null,											--sal		нˮ
comm money not null,										--comm		����
hiredate date not null,										--hiredate	�ܹ�����
sex nvarchar(5) check(sex='man' or sex='woman') not null)	--Sex		�Ա�

--insert into tb_emp (empno,ename,deptno,job,sal,comm,hiredate,Sex) values

--1  ѡ����30�е�����Ա���� 
select Ename from tb_emp where deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š� 
select Ename,Empno,deptno from tb_emp where job='CLERK'
--3  �ҳ��������н���Ա���� 
select Ename from tb_emp where comm>sal
--4  �ҳ��������н��60%��Ա���� 
select Ename from tb_emp where comm>(sal*0.6)
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ� 
select * from tb_emp where (deptno='10' and job='manager') or (deptno='20' and job='clerk')
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
select * from tb_emp where (deptno='10' and job='manager') or (deptno='20' and job='clerk') or (job!='manager' and job!='clerk' and sal>=2000)
--7  �ҳ��н����Ա���Ĳ�ͬ������
select job from tb_emp where comm>0 group by job
--8  �ҳ�û�н���򽱽����100��Ա���� 
select Ename from tb_emp where comm<100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select deptno,avg(sal) as ƽ��нˮ from tb_emp group by deptno order by avg(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
select Ename from tb_emp where year(hiredate)>2012
--11  ��ѯ��˾Ա��нˮ������ 
select count(sal) as нˮ���� from tb_emp
--12  ��ʾ����Ϊ5���ַ���Ա���������� 
select Ename from tb_emp where ename like '_____'
select Ename from tb_emp where len(ename)=5
--13  ��ʾ������'R'��Ա���������� 
select Ename from tb_emp where ename not like '%r%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
 select deptno,count(*) as ���� from tb_emp group by deptno order by count(*) desc
--15  ��ѯÿ������ŮԱ����������
select deptno,count(*) as ���� from tb_emp where sex='woman' group by deptno
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
select Ename,hiredate from tb_emp where year(hiredate)>=2007 and year(hiredate)<2017
--17  ��ʾԱ������ϸ���ϣ����������� 
select * from tb_emp order by Ename
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档 
select Ename,hiredate from tb_emp order by hiredate
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
select Ename,job,sal from tb_emp order by job desc , sal
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal>(select avg(sal) from tb_emp) 
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
select ename,(sal+comm) as ������ from tb_emp
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
select deptno,job,avg(comm) as ƽ������,avg(sal) as ƽ��нˮ from tb_emp group by deptno ,job
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct(Ename) from tb_emp
--24  ��ѯԱ���������ظ���Ա����Ϣ��
select Ename from tb_emp group by Ename having count(*)=1
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
select Ename from tb_emp where ename like '%a%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
select Ename,count(*) from tb_emp group by Ename having count(*)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select deptno from tb_emp group by deptno having deptno not in (select deptno from tb_emp where sal<900 or sal>3000)
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select job,min(sal) as ��͹��� from tb_emp group by job order by ��͹���