SELECT * FROM tb_student
--1.	��ѯȫ��ѧ����ѧ����������
SELECT ID,NAME FROM tb_student
--2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
SELECT ID,NAME,zhuanye FROM tb_student
--3.	��ȫ��ѧ�����������������ݡ�
SELECT NAME,YEAR(GETDATE())-AGE FROM tb_student 
--4.	��ѯ���������ѧ��רҵȫ��ѧ����������
SELECT NAME FROM tb_student WHERE zhuanye='CS'
--5.	��ѯ����������20�����µ�ѧ�������������䡣
SELECT NAME,AGE FROM tb_student WHERE age<20
--6.	��ѯδ�����ѧ����������ƽ���ɼ���
SELECT COUNT(AGE) AS δ��������, AVG(CHENGJI) as ƽ���ɼ� FROM tb_student WHERE age<18
--7.	��ѯ�ɼ��в������ѧ����ѧ�š�
SELECT id FROM tb_student WHERE chengji<60
--8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
select name,zhuanye,age FROM tb_student WHERE age>18 AND age<22
--9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
select name,zhuanye,age FROM tb_student WHERE age<20 or age>23
--10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
SELECT name,sex FROM tb_student WHERE zhuanye IN('is','ma','cs')
--11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
SELECT name,sex FROM tb_student WHERE zhuanye not IN('is','ma','cs')
--12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
SELECT * FROM tb_student WHERE id=09102040203
--13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
SELECT name,id,sex FROM tb_student WHERE name LIKE'��%'
--14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
SELECT name FROM tb_student WHERE name LIKE'��__'
--15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
SELECT name,id FROM tb_student WHERE name LIKE'_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
SELECT name FROM tb_student WHERE name not LIKE'��%'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
SELECT id,name FROM tb_student WHERE chengji IS NULL
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
SELECT ZHUANYE,AVG(CHENGJI) FROM tb_student GROUP BY zhuanye
--19.	�������гɼ���ѧ����ѧ�ź�������
SELECT ID,NAME FROM tb_student 
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
SELECT * FROM tb_student ORDER BY zhuanye,age DESC
--21.	��ѯѧ����������
SELECT COUNT(*) FROM tb_student
--22.	��ѯ������Ů����������
SELECT COUNT(SEX)as �к�Ů FROM tb_student GROUP BY sex
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
SELECT zhuanye,AVG(chengji)as ƽ���ɼ� FROM tb_student GROUP BY zhuanye ORDER BY avg(chengji) DESC
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
SELECT zhuanye,max(chengji) FROM tb_student GROUP BY zhuanye
--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
SELECT zhuanye,MIN(chengji) FROM tb_student GROUP BY zhuanye
--26.	��ѯƽ���ɼ�����רҵ�����֡�
SELECT top 1 zhuanye,AVG(chengji) 
FROM tb_student GROUP BY zhuanye
HAVING AVG(chengji)<(SELECT AVG(chengji) FROM tb_student GROUP BY zhuanye )
--27.	��ѯ������Ů����ƽ���ɼ���
SELECT sex,AVG(chengji) as �ɼ� FROM tb_student GROUP BY sex
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
SELECT name,chengji FROM tb_student WHERE chengji>(select AVG(chengji) FROM tb_student)
--29.	��ѯרҵѧ����������50�˵�רҵ����
SELECT zhuanye,COUNT(*)as ����  FROM tb_student GROUP BY zhuanye HAVING COUNT(*)>3 
--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT AVG(chengji),zhuanye FROM tb_student WHERE age<23 GROUP BY zhuanye HAVING zhuanye='cs'
