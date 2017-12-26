--Ա����emp(empno,ename,deptno,job,sal,comm,hiredate,sex) 
--����	    ���������ģ�
--empno	    ����
--ename	    ����
--deptno	����
--job	    ְλ
--sal	    нˮ
--comm	    ����
--hiredate	�ܹ�����
--Sex	    �Ա�
CREATE table tb_emp(
empon nvarchar(16) primary key,
ename nvarchar(16),
deptno nvarchar(16),
job nvarchar(16),
sal money,
comm money,
hiredate date,
sex nvarchar(16) check(sex='man' or sex='woman'))

SELECT * FROM tb_emp 
INSERT INTO tb_emp(empon,ename,deptno,job,sal,comm,hiredate,sex) VALUES
('001','00001','10','����Ա',1000,2000,'2007','man'),
('002','00002','20','����',2000,4000,'2008','woman'),
('003','00003','30','����',3000,5000,'2009','woman'),
('004','00004','10','����',1000,2000,'2019','man'),
('005','00005','20','����',2000,4000,'2014','woman'),
('006','00006','30','����Ա',3000,5000,'2013','woman'),
('007','00002','20','����',2000,20,'2008','woman'),
('008','00002','20','����',2000,99,'2008','woman'),
('009','00002','20','����',2000,4000,'2008','woman'),
('010','00002','20','����',2000,4000,'2008','woman'),
('011','00004','10','����',1000,2000,'2012','man'),
('012','00004','10','����',1000,2000,'2015','man'),
('014','00002','20','����Ա',2000,4000,'2008','woman'),
('015','00004','10','����',1000,2000,'2012','man'),
('016','00004','10','����',1000,2000,'2015','man'),
('017','00002','20','����Ա',2000,4000,'2008','woman'),
('018','0000R','10','����Ա',1000,2000,'2007','man')
--1  ѡ����30�е�����Ա���� 
SELECT ename FROM tb_emp WHERE deptno='30'
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š� 
SELECT ename,empon,deptno FROM tb_emp WHERE job='����Ա'
--3  �ҳ��������н���Ա���� 
SELECT * FROM tb_emp WHERE comm>sal
--4  �ҳ��������н��60%��Ա���� 
SELECT * FROM tb_emp WHERE comm>sal*0.6
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ� 
SELECT * FROM tb_emp WHERE (deptno=10 or deptno=20) and job='����Ա'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ�
 SELECT * FROM tb_emp WHERE (deptno=10 AND job='����') OR (deptno=20 and job='����Ա') OR (job!='����Ա' AND job!='����') AND (sal>=2000)
--7  �ҳ��н����Ա���Ĳ�ͬ������ 
SELECT distinct(job) FROM tb_emp WHERE comm is not null
--8  �ҳ�û�н���򽱽����100��Ա����
SELECT * FROM tb_emp WHERE  comm<100
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(comm),deptno FROM tb_emp GROUP BY deptno ORDER BY avg(comm)desc
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
 SELECT * FROM tb_emp WHERE hiredate<'2012'
--11  ��ѯ��˾Ա��нˮ������ 
SELECT sum(comm) FROM tb_emp
--12  ��ʾ����Ϊ5���ַ���Ա����������
SELECT ename FROM tb_emp WHERE ename='_____'
--13  ��ʾ������'R'��Ա���������� 
SELECT ename FROM tb_emp WHERE ename!='%r%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н������� 
SELECT COUNT(ename)as ����,deptno as ������ FROM tb_emp GROUP BY deptno ORDER BY COUNT(ename)
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(ename)as ŮԱ��������,deptno as ���� FROM tb_emp WHERE sex='woman' GROUP BY deptno
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ� 
select ename as ����,hiredate as �ܹ����� from tb_emp where hiredate>'2007' and hiredate<'2017'
--17  ��ʾԱ������ϸ���ϣ����������� 
SELECT * FROM tb_emp ORDER BY ename DESC
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档 
SELECT ename,hiredate FROM tb_emp ORDER BY hiredate
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
SELECT ename,job,comm FROM tb_emp ORDER BY job DESC,comm
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ�� 
SELECT * FROM tb_emp WHERE comm>( SELECT AVG(comm) FROM tb_emp )
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
SELECT SUM(sal+comm) FROM tb_emp GROUP BY empon
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ���� 
SELECT AVG(sal),AVG(comm),deptno,job FROM tb_emp GROUP BY deptno,job order BY deptno
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT distinct(ename) FROM tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT ename FROM tb_emp GROUP BY ename HAVING COUNT(ename)<2
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
SELECT ename FROM tb_emp WHERE ename='%a%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT ename,COUNT(ename) FROM tb_emp GROUP BY ename HAVING COUNT(ename)>1
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT DISTINCT(deptno) FROM tb_emp WHERE comm>'300' OR comm<'900'
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT MIN(comm) FROM tb_emp GROUP BY job ORDER BY MIN(comm)