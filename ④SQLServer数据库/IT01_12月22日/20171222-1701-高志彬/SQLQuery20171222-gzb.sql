USE db_GZB
--����	���������ģ�
--empno	����
--ename	����
--deptno	����
--job	ְλ
--sal	нˮ
--comm	����
--hiredate	�ܹ�����
--Sex	�Ա�
CREATE table tb_emp(
empno    nvarchar(16) primary key ,
ename    nvarchar(32) not null    ,
deptno   nvarchar(32)             ,
job      nvarchar(32)             ,
sal      money default 2000       ,
comm     money                    ,
hiredate date                     ,
sex      nvarchar(16) check(sex='��' or sex='Ů')
)
SELECT *FROM tb_emp
sp_help tb_emp
---	���� ���� ���� ְλ нˮ ���� �ܹ����� �Ա�
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('001','Riky','10','MANAGER',4500,2000,'2014-5-8','Ů')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('002','Haskins','10','CLERK',3000,1500,'2012-9-1','��'),
('003','Harlan','10','CLERK',3000,1000,'2011-9-1','Ů'),
('004','Noble','10','CLERK',3000,2000,'2010-9-1','��'),
('005','Eric','10','CLERK',3000,1500,'2002-9-1','��'),
('006','Haskins','20','CLERK',3000,1500,'2013-9-1','��'),
('007','Gerry','20','MANAGER',4500,5000,'2008-9-1','��'),
('008','Angela','20','CLERK',3000,500,'2017-9-1','Ů'),
('009','Tina','30','CLERK',3000,1000,'2005-9-1','Ů'),
('010','������','30','CLERK',3000,1500,'2009-9-1','Ů'),
('011','Sunny','30','CLERK',3000,1500,'2011-9-1','Ů'),
('012','leo','10','CLERK',3000,1500,'2016-9-1','��'),
('013','JIELIY','30','CLERK',3000,1500,'2011-9-1','��'),
('014','LULU','30','CLERK',3000,1500,'2011-9-1','��'),
('015','Naicy','30','CLERK',3000,1500,'2011-9-1','��'),
('016','Maky','30','CLERK',3000,1500,'2011-9-1','��'),
('017','Jeecky','30','CLERK',3000,1500,'2011-9-1','��'),
('018','Jake','30','CLERK',3000,1500,'2011-9-1','��'),
('019','Hbit','20','CLERK',3000,1500,'2013-9-1','��'),
('020','Gairy','20','MANAGER',4500,5000,'2008-9-1','��'),
('021','Mia','20','CLERK',3000,500,'2017-9-1','Ů'),
('022','MUHAMMAD','20','CLERK',3000,1500,'2013-9-1','��'),
('023','Moah','20','MANAGER',4500,5000,'2008-9-1','��'),
('024','Lily','20','CLERK',800,2000,'2017-9-1','Ů'),
('025','JOSHUA','10','CLERK',3000,1500,'2012-9-1','��'),
('026','Isla','10','CLERK',1000,800,'2017-9-1','Ů'),
('027','OLIVIA','10','CLERK',3000,2000,'2010-9-1','Ů'),
('028','KATE','10','CLERK',3000,1500,'2002-9-1','��'),
('029','Lily','20','CLERK',800,2000,'2017-9-1','Ů'),
('030','JOSHUA','10','CLERK',3000,1500,'2012-9-1','��'),
('031','Isla','10','CLERK',1000,800,'2017-9-1','Ů'),
('032','OLIVIA','10','CLERK',3000,2000,'2010-9-1','Ů'),
('033','KATE','10','CLERK',3000,1500,'2002-9-1','��')



INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('034','����','15','���ڲ�',3000,1500,'2012-9-1','��'),
('035','�ܿ���','15','���ڲ�',3000,1000,'2011-9-1','Ů'),
('036','��ŬŬ','18','��ಿ',3000,2000,'2010-9-1','��'),
('037','����ѿ','18','��ಿ',3000,1500,'2002-9-1','��'),
('038','��Ⱦ��','12','������',3000,1500,'2013-9-1','��'),
('039','��ܽ�','12','������',4500,5000,'2008-9-1','��'),
('040','������','12','������',3000,1500,'2013-9-1','��')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,comm,hiredate,sex)VALUES 
('041','����','15','���ڲ�',1500,500,'2017-9-1','��'),
('042','������','15','���ڲ�',1600,500,'2017-9-1','Ů')
INSERT INTO tb_emp(empno,ename,deptno,job,sal,hiredate,sex)VALUES 
('041','����','15','���ڲ�',80,'2017-9-1','��'),
('042','������','15','���ڲ�',90,'2017-9-1','Ů')
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

---	���� ����   ����  ְλ нˮ ���� �ܹ�����  �Ա�
---empno ename deptno job  sal comm hiredate sex
---1  ѡ����30�е�����Ա���� 
SELECT * FROM tb_emp WHERE deptno='30'
---2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT  ename AS ����,empno as ��Ա���,deptno as ���ű�� 
FROM tb_emp where job='CLERK'
---3  �ҳ��������н���Ա��
SELECT  * FROM tb_emp WHERE comm > sal 
---4  �ҳ��������н��60%��Ա���� 
SELECT TOP 60 PERCENT ename from tb_emp WHERE comm > sal
---5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT  * FROM tb_emp
WHERE (deptno='10'and job='MANAGER')
and (deptno='20'and job='CLERK')
---6  �ҳ�����10�����о���MANAGER����
----����20�����а���Ա��CLERK����
----�Լ����в����м����Ǿ����ֲ��ǰ���Ա
----��н����ڻ����2000������Ա������ϸ���ϡ�
SELECT  * FROM tb_emp
WHERE (deptno='10'and job='MANAGER')OR(deptno='20'and job='CLERK')
 OR (job NOT IN ('CLERK','MANAGER') AND sal >=2000)
---7  �ҳ��н����Ա���Ĳ�ͬ������
SELECT job FROM tb_emp where comm IS NOT NULL  
---8  �ҳ�û�н���򽱽����100��Ա���� 
SELECT ename from tb_emp where comm IS NOT NULL OR  comm <100
---9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(sal) ,deptno FROM tb_emp GROUP BY deptno ORDER BY AVG(sal) DESC   
--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename FROM tb_emp WHERE YEAR(hiredate)<2012 
--11  ��ѯ��˾Ա��нˮ������
SELECT SUM(sal) as ���� FROM tb_emp   
--12  ��ʾ����Ϊ5���ַ���Ա����������
SELECT *FROM tb_emp WHERE ename LIKE '_____' 
--13  ��ʾ������'R'��Ա����������
SELECT *FROM tb_emp WHERE ename NOT  LIKE 'R' 
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT COUNT(deptno) as ��������,deptno FROM tb_emp GROUP BY deptno ORDER BY COUNT(deptno) DESC 
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(*) ,deptno FROM tb_emp where sex='Ů' GROUP BY deptno   
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT  ename,hiredate FROM tb_emp where YEAR(hiredate)>2007 AND YEAR(hiredate)<2017  
--17  ��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp order BY ename ASC  
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT  ename,hiredate FROM tb_emp ORDER BY GETDATE()-YEAR(hiredate)DESC   
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������ 
SELECT ename,job,sal from tb_emp ORDER BY job DESC ,sal
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
SELECT * FROM tb_emp WHERE sal >(SELECT AVG(sal) FROM tb_emp  )
--21  ��ѯÿ��Ա�������루��������������нˮ����
SELECT ename,SUM(sal+comm)AS ������ FROM tb_emp GROUP BY ename    
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
 SELECT AVG(sal),AVG(comm),deptno,job FROM tb_emp GROUP BY deptno ,job   
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT DISTINCT ename  FROM tb_emp 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT *FROM tb_emp where ename IN (
SELECT ename from tb_emp GROUP BY ename HAVING COUNT(*)<2)
--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա���������� 
SELECT ename FROM tb_emp where ename LIKE '%A%'
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT ename,COUNT(*) from tb_emp GROUP BY ename HAVING COUNT(*)>=2  
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
SELECT * FROM tb_emp WHERE sal >900 AND sal <3000
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT job,MIN(sal) FROM tb_emp GROUP BY job ORDER BY MIN(sal)  
