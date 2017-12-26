 CREATE table tb_emp1(empno nvarchar(16),
ename nvarchar(16),
deptno nvarchar(16),
job nvarchar(16),
sal smallint,
comm smallint,
hiredate nvarchar(32),
sex nvarchar(8))
INSERT INTO tb_emp1 VALUES
('0701','rop','10','MANAGER',1500,96,'2005.1.13','man'),
('0702','����','30','MANAGER',2500,156,'2002.1.3','man'),
('0703','�º�','10','CLERK',4500,630,'2007.1.23','man'),
('0704','����','30','MANAGER',4500,169,'2009.2.13','woman'),
('0705','rop','10','MANAGER',2500,445,'2006.8.13','man'),
('0706','����','20','CLERK',2500,163,'2010.1.13','woman'),
('0707','����','30','Ա��',3500,526,'2015.1.3','woman'),
('0708','����','10','MANAGER',6500,896,'2005.1.13','man'),
('0709','���','20','�鳤',3500,496,'2016.1.13','man'),
('07010','����','10','MANAGER',6500,296,'2011.2.7','man')



 
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
SELECT * FROM tb_emp1 WHERE deptno='30'
 
--2  �г����а���Ա��CLERK������������Ա��źͲ��ű�š�
SELECT  ename,empno ,deptno FROM tb_emp1 WHERE job='CLERK'
--3  �ҳ��������н���Ա����
SELECT ename FROM tb_emp1 WHERE comm>sal 
--4  �ҳ��������н��60%��Ա����
 SELECT ename FROM tb_emp1 WHERE comm>sal *0.6
--5  �ҳ�����10�����о���MANAGER���Ͳ���20�����а���Ա��CLERK������ϸ���ϡ�
SELECT  *  FROM tb_emp1 WHERE deptno='10' AND job='MANAGER' OR
  deptno='20' AND job='CLERK'
--6  �ҳ�����10�����о���MANAGER��������20�����а���Ա��CLERK�����Լ����в����м����Ǿ����ֲ��ǰ���Ա��н����ڻ����2000������Ա������ϸ���ϡ� 
SELECT  *  FROM tb_emp1 WHERE deptno='10' AND job='MANAGER' OR
  deptno='20' AND job='CLERK' OR job !='MANAGER' and job !='CLERK'
  
--7  �ҳ��н����Ա���Ĳ�ͬ������
SELECT job FROM tb_emp1 WHERE comm IS NOT NULL
 
--8  �ҳ�û�н���򽱽����100��Ա����
SELECT ename FROM tb_emp1 WHERE comm IS NULL or comm<100 
--9  ��ѯÿ�����ŵ�ƽ��нˮ�Ͳ�������������нˮ�ɸߵ��׽�������
SELECT AVG(sal),deptno FROM tb_emp1 GROUP BY deptno ORDER BY AVG(sal)

--10  �ҳ�����2012��ǰ�ܹ͵�Ա����
SELECT ename FROM tb_emp1 WHERE year(hiredate)<2012
--11  ��ѯ��˾Ա��нˮ������
SELECT COUNT(sal) FROM tb_emp1
 
--12  ��ʾ����Ϊ5���ַ���Ա����������
SELECT ename FROM tb_emp1 WHERE ename  ='5' 
--13  ��ʾ������'R'��Ա����������
SELECT ename  FROM tb_emp1 WHERE ename not like 'r%'
--14  ��ѯÿ������Ա�������Ͳ�������������Ա���������н�������
SELECT COUNT(*),deptno FROM tb_emp1 GROUP BY deptno ORDER BY COUNT(*) desc  
--15  ��ѯÿ������ŮԱ����������
SELECT COUNT(*)FROM tb_emp1 WHERE sex='woman' GROUP BY deptno  
--16  ��ʾ2007�굽2017��֮ǰ��ְ��Ա�����������ܹ����ڡ�
SELECT ename,hiredate FROM tb_emp1 WHERE year(hiredate) not between 2007 and 2017
--17  ��ʾԱ������ϸ���ϣ�����������
SELECT * FROM tb_emp1 ORDER BY ename 
--18  ��ʾԱ�����������ܹ����ڣ�������������ޣ������ϵ�Ա��������ǰ�档
SELECT ename,hiredate FROM tb_emp1 ORDER BY hiredate 
--19  ��ʾ����Ա����������������н�𣬰������Ľ���������������ͬ��н������
SELECT ename, job,sal FROM tb_emp1  where  job='MANAGER' or job ='CLERK' ORDER BY  desc or ORDER BY job DESC 
--20  ��ѯԱ��нˮ����ƽ��ֵ��Ա����Ϣ��
SELECT * FROM tb_emp1 WHERE sal>( select AVG(sal) from tb_emp1 ) 
--21  ��ѯÿ��Ա�������루��������������нˮ���� 
SELECT ename ,sum(sal+comm) FROM tb_emp1 GROUP BY ename
--22  ��ѯÿ�����Ų�ְͬλ��ƽ������ƽ��нˮ�����ź�ְλ����
SELECT AVG(comm), AVG(sal) , deptno,job  FROM tb_emp1  GROUP BY deptno,job 
--23  ��ѯԱ���������ظ�������ֻ����һ�Ρ�
SELECT DISTINCT( ename) FROM tb_emp1 
--24  ��ѯԱ���������ظ���Ա����Ϣ��
SELECT* FROM tb_emp1 WHERE ename IN(SELECT* FROM tb_emp1 GROUP BY ename HAVING COUNT(*)<2 )

--25  ��ʾ�����ֶε��κ�λ�ð���'A'������Ա����������
SELECT ename FROM tb_emp1 WHERE empno LIKE 'a%' 
--26  ��ѯԱ�������ظ���Ա������ʾ��Ա�������ظ�������
SELECT ename,count(1)FROM tb_emp1 GROUP BY ename HAVING count(1)>=2
--27  ��ѯ����Ա�����ʶ���900��3000֮��Ĳ�����Ϣ��
select deptno FROM tb_emp1 WHERE sal BETWEEN 900 AND 3000
 
--28  ��ѯÿ��ְλ����͹��ʣ������չ��ʽ�����ѧ����
SELECT MIN(sal) FROM tb_emp1 GROUP BY job ORDER BY  MIN(sal)



