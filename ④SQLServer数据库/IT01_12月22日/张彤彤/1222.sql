CREATE table tb_employee(
empno nvarchar(32) primary key,
ename nvarchar(16) not null,
deptno nvarchar(16),
job nvarchar(16),
sal money,
comn money,
hiredate date,
sex nvarchar(16) check ( sex = 'man' or sex = 'woman')
)

INSERT INTO tb_employee VALUES 
(001,'00001','10','����Ա',300,2000,'2007-12-21','man'),
(002,'00002','20','����',2000,4000,'2008-10-24','woman'),
(003,'00003','30','����',3000,5000,'2009-03-21','woman'),
(004,'00004','10','����',1000,2000,'2019-05-23','man'),
(005,'00005','20','����',2000,4000,'2014-03-24','woman'),
(006,'00006','30','����Ա',3000,5000,'2013-01-16','woman'),
(007,'00002','20','����',2000,20,'2008-06-26','woman'),
(008,'00002','20','����',2000,99,'2008-08-30','woman'),
(009,'00002','20','����',2000,4000,'2008-12-08','woman'),
(010,'00002','20','����',2000,4000,'2008-04-13','woman'),
(011,'00004','10','����',1000,2000,'2012-09-26','man'),
(012,'00004','10','����',1000,2000,'2015-02-19','man'),
(014,'00002','20','����Ա',2000,4000,'2008-06-16','woman'),
(015,'00004','10','����',1000,2000,'2012-03-27','man'),
(016,'00004','10','����',1000,2000,'2015-05-28','man'),
(017,'00002','20','����Ա',2000,4000,'2008-12-03','woman'),
(018,'0000R','10','����Ա',1000,2000,'2007-03-14','man')

SELECT * from  tb_employee

--1  ѡ����30�е�����Ա����
 select * FROM tb_employee where deptno = '30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT ename as ����,empno as ��Ա���,deptno as ���ű�� FROM tb_employee where job = '����Ա'
--3  �ҳ��������н���Ա����
 SELECT * FROM tb_employee where comn>sal
--4  �ҳ��������н��60%��Ա����
 SELECT * FROM tb_employee where comn > sal*0.6
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT * FROM tb_employee  where deptno = '10' AND job = '����' or deptno = '20' AND job = '����Ա'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK����
--�Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
 
--7  �ҳ��н����Ա���Ĳ�ͬ������
 SELECT distinct(job) as ְλ from tb_employee
--8  �ҳ�û�н���򽱽����100��Ա����
 SELECT ename as ����,comn as ���� from tb_employee where comn = NULL OR comn < 100 
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(sal) as ƽ��нˮ,deptno as ���� from tb_employee group BY deptno order BY avg(sal)DESC
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename as ����,hiredate as ʱ�� from tb_employee where YEAR(hiredate) < 2012 
--11  ��ѯ��˾Ա��нˮ������
SELECT SUM(sal)as нˮ���� from tb_employee 
--12  ��ʾ����Ϊ5���ַ���Ա����������
SELECT ename as ���� from tb_employee where LEN(ename) = 5  
--13  ��ʾ������'R'��Ա����������
SELECT ename from tb_employee where ename not like '%r%' 
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT COUNT(*) as ����,deptno as ���� from tb_employee  group BY deptno ORDER BY COUNT(*) 
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(*) as ŮԱ��,deptno as ���� from tb_employee where sex = 'woman'group BY deptno 
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT Ename,hiredate  from tb_employee where  hiredate LIKE  '[2007-2017]' 
--17  ��ʾԱ������ϸ���ϣ�����������
 SELECT * from tb_employee ORDER BY Ename
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
 SELECT hiredate from tb_employee  ORDER BY hiredate
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
SELECT Ename,job,sal   from tb_employee  ORDER BY job desc,sal 
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
SELECT * FROM tb_employee where sal >(SELECT AVG(sal) FROM tb_employee) 
--21  ��ѯÿ��Ա�������루��������������нˮ����
SELECT Ename as ����, comn+sal as'������'   from  tb_employee 
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 SELECT deptno,job,avg(comn) as 'ƽ������',AVG(sal)as 'ƽ��нˮ'from tb_employee GROUP BY deptno,job ORDER BY deptno 
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT DISTINCT(Ename) from tb_employee
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT  * from tb_employee WHERE Ename IN (
SELECT  Ename from tb_employee  GROUP BY Ename HAVING COUNT(Ename) =1)
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT Ename FROM tb_employee WHERE Ename LIKE'%A%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT  Ename,COUNT(Ename)  from tb_employee   GROUP BY Ename HAVING COUNT(Ename)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT DISTINCT(deptno)  from tb_employee where deptno not in( 
SELECT DISTINCT(deptno)  from tb_employee where  not sal>=900 AND sal<=3000 ) 
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job as ְλ , MIN(sal) as ��͹��� from  tb_employee  GROUP BY job  ORDER BY MIN(sal) 
