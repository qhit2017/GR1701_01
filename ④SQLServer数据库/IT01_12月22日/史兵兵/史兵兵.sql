select * from tb_emp
sp_help
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('1','a','10','����','200','100','2017-10-17','man')

insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('2','ab','10','���','30','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('3','С��','30','����Ա','3000','100','2000-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('4','С��','10','����','20','10','2016-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('5','��͹��','30','����','66','100','2000-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('6','��«��','10','����Ա','22','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('7','�鳤','10','�鳤','6000','1000','2017-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('8','�ͷ�','30','','30','100','2010-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('9','��������','10','�ܲ�','30000','100','2007-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('10','marry','30','����','300','100','2016-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('11','lili','10','����','6666','100','2015-10-17','man')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('12','ʷ����','10','����','6','10','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('13','��ͮͮ','30','���³�','','','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('14','R','30','����ʦ','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('15','�����','10','����Ա','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('16','������','30','����Ա','20','100','2015-10-17','woman')
insert into tb_emp (empno,ename,deptno,jod,sal,comm,hiredate,Sex)values
('17','��κ','10','����','20','100','2015-10-17','woman')





--1  ѡ����30�е�����Ա���� 
select * from tb_emp WHERE deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename ,empno,deptno from tb_emp
--3  �ҳ��������н���Ա����
select *from tb_emp where comm> sal
--4  �ҳ��������н��60%��Ա���� 
select top 60 percent ename from tb_emp where comm >sal
--5  �ҳ�����10�����о���MANAGER���Ͳ���30�����а���Ա��CLERK������ϸ���ϡ�
 select *from tb_emp where (deptno=10 and jod = '����') or (deptno=30 and jod = '����Ա')
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ� 
select * from tb_emp where deptno=10 and jod = '����' or deptno=30 and jod = '����Ա' or (jod not In ('����','����Ա') and sal >=2000)
--7  �ҳ��н����Ա���Ĳ�ͬ������
select jod from tb_emp where comm is not null 
--8  �ҳ�û�н���򽱽����100��Ա����
select * from tb_emp where  comm is null or comm <100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
select AVG(sal),deptno from tb_emp group by deptno order by AVG(sal) desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա���� 
select ename from tb_emp where YEAR(hiredate)<2012
--11  ��ѯ��˾Ա��нˮ������
SELECT SUM (sal)FROM tb_emp 
--12  ��ʾ����Ϊ5���ַ���Ա����������
select ename from tb_emp where ename like'_____' 
--13  ��ʾ������'R'��Ա����������
SELECT  ename FROM tb_emp WHERE ename NOT LIKE 'R'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
select COUNT(*)as ����,deptno from tb_emp group by deptno order by COUNT(*) desc
--15  ��ѯÿ������ŮԱ����������
select COUNT (*)from tb_emp where sex='woman'
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
 select ename ,hiredate from tb_emp where YEAR (hiredate)>2007 and YEAR (hiredate)<2017
--17  ��ʾԱ������ϸ���ϣ�����������
select * from tb_emp  order by ename
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
 select ename , hiredate from tb_emp where YEAR (hiredate)-YEAR (hiredate)<2017
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
select ename,jod ,sal from tb_emp order by jod desc  ,sal
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
select * from tb_emp where sal>(select AVG(sal)from tb_emp)
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
select ename ,SUM(sal+comm)as ������ from tb_emp group by ename
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ���� 
sELECT AVG(comm),AVG(sal),deptno,jod from tb_emp 
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
select distinct ename from tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
select * from tb_emp where ename in (select ename from tb_emp group by ename having COUNT(*)<2)
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT ENAME FROM tb_emp WHERE ename LIKE 'A%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
select ename , COUNT (1)as �ظ����� from tb_emp  group by ename having  COUNT (1)>=2
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select *from tb_emp where sal >900 and sal <3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
select jod , MIN (sal)as ��� from tb_emp group by jod order by MIN (sal)
