CREATE table tb_student(
sno nvarchar(32)primary key,
sname nvarchar(16) not null,
ssex nvarchar(8) check(ssex='��'or ssex ='Ů') default '��',
sage smallint, 
sdept nvarchar(8),
grade smallint
)
insert into tb_student VALUES
 ('001','������','Ů',18,'cs',29),
 ('002','��ѩ','��',17,'ma',39),
 ('003','����','Ů',18,'cs',59),
 ('004','Ī������','��',18,'cs',69),
 ('005','����','Ů',18,'cs',27),
 ('006','����','Ů',18,'cs',89),
 ('007','������','Ů',18,'is',99),
 ('008','�λ','Ů',18,'cs',89),
 ('009','��Ӽ�','Ů',18,'ma',69),
 ('0010','���Ҫ','Ů',18,'cs',59),
 ('0011','������','Ů',18,'cs',79),
 ('0012','����','Ů',18,'cs',79),
 ('0013','����','Ů',18,'is',69),
 ('0014','����','��',18,'cs',49)
 insert into tb_student VALUES
 ('09102040201','�ﾴ�','Ů',15,'bm',99),
 ('09102040202','������','��',26,'da',78)
 insert into tb_student (sno ,sname,ssex ,sage,sdept)VALUES
  ('0015','����','��',19,'cs')
  
 --1.	��ѯȫ��ѧ����ѧ����������
 SELECT sname as ����,sno as ѧ�� from tb_student
 --2.	��ѯȫ��ѧ����������ѧ�š�רҵ��
 SELECT sname as ����,sno as ѧ��,sdept as רҵ from tb_student
 --3.	��ȫ��ѧ�����������������ݡ�
 SELECT sname as ����,YEAR(GETDATE())-sage as������� from tb_student
 --4.	��ѯ���������ѧ��רҵȫ��ѧ����������
 SELECT sname as ���� from tb_student where sdept='cs'
 --5.	��ѯ����������20�����µ�ѧ�������������䡣
 SELECT sname as ����,sage as����  from tb_student where sage<20
 --6.	��ѯδ�����ѧ����������ƽ���ɼ���
 SELECT count(sage)as δ��������, AVG(grade)as ƽ���ɼ� from tb_student where  sage<18
 --7.	��ѯ�ɼ��в������ѧ����ѧ�š�
 SELECT sno asѧ�� from tb_student where grade<60
 --8.	��ѯ������18~22�꣨����18���22�֮꣩���ѧ����������רҵ�����䡣
 SELECT sname as ����,sdept as רҵ,sage as����  from tb_student where sage<=22 AND sage >=18
 --9.	��ѯ���䲻��20~23��֮���ѧ��������רҵ�����䡣
 SELECT sname as ����,sdept as רҵ,sage as����  from tb_student where sage not BETWEEN 20 and 23
 --10.	��ѯ��Ϣϵ��IS������ѧϵ��MA���ͼ������ѧϵ��CS��ѧ�����������Ա�
 SELECT sname as ����,ssex as�Ա� from  tb_student where sdept IN('cs','is','ma')
 --11.	��ѯ�Ȳ�����Ϣϵ����ѧϵ��Ҳ���Ǽ������ѧϵ��ѧ�����������Ա�
 SELECT sname as ����,ssex as�Ա� from  tb_student where sdept not IN('cs','is','ma')
 --12.	��ѯѧ��Ϊ09102040203��ѧ������ϸ�����
 SELECT * FROM tb_student WHERE sno='09102040203'
 --13.	��ѯ�����ա��š�ѧ����������ѧ�ź��Ա�
  SELECT sname as ����,sno as ѧ��,ssex as�Ա� from tb_student WHERE sname LIKE'��%'
 --14.	��ѯ�ա����ȫ��Ϊ�������ֵ�ѧ����������
  SELECT sname as ���� from tb_student WHERE sname LIKE '��__'
 --15.	��ѯ�����е�2����Ϊ�������ֵ�ѧ����������ѧ�š�
  SELECT sname as ���� from tb_student WHERE sname LIKE '_��%'
--16.	��ѯ���в��ա��¡���ѧ��������
  SELECT sname as ���� from tb_student WHERE  not sname LIKE '��__'
--17.	��ѯȱ�ٳɼ���ѧ����ѧ�ź�������
  SELECT * FROM tb_student WHERE   grade IS NULL
--18.	��ѯÿ��רҵ��ѧ����ƽ���ɼ���
 SELECT sdept, AVG(grade) as  ƽ���ɼ� from tb_student  GROUP BY sdept

--19.	�������гɼ���ѧ����ѧ�ź�������
 SELECT sno as ѧ�� ,sname as ���� from tb_student WHERE grade IS not  NULL
--20.	��ѯȫ��ѧ���������ѯ���������ϵ�������У�ͬһϵ�е�ѧ�������併�����С�
 SELECT * from tb_student ORDER BY sdept ASC , sage DESC
--21.	��ѯѧ����������
  SELECT count(sname)as ���� from tb_student
--22.	��ѯ������Ů����������
  SELECT count(ssex)as �������� from tb_student WHERE ssex ='��'
   SELECT count(ssex)as Ů������ from tb_student WHERE ssex ='Ů'
--23.	��ѯÿ��רҵ��ƽ���ɼ���������ճɼ��������С�
 SELECT sdept ,   AVG(grade)as  ƽ���ɼ� from tb_student group BY sdept  ORDER BY AVG(grade) DESC
--24.	��ѯÿ��רҵ�гɼ���õ�ѧ���ɼ���
 SELECT sdept, MAX(grade) as  ��óɼ� from tb_student   GROUP BY sdept

--25.	��ѯÿ��רҵ�гɼ�����ѧ���ɼ���
 SELECT sdept, MIN(grade) as  ���ɼ� from tb_student   GROUP BY sdept
--26.	��ѯƽ���ɼ�����רҵ�����֡�

--27.	��ѯ������Ů����ƽ���ɼ���
 SELECT  AVG(grade)as  ����ƽ���ɼ� from tb_student WHERE  ssex ='��'
 SELECT  AVG(grade)as  Ů��ƽ���ɼ� from tb_student WHERE  ssex ='Ů'
--28.	��ѯ�ɼ�����ƽ���ɼ���ѧ�������ͳɼ���
 SELECT sname as ���� ,grade as �ɼ� from tb_student WHERE grade >AVG(grade)
--29.	��ѯרҵѧ����������50�˵�רҵ����

--30.	��ѯ���������רҵδ����ѧ����ƽ���ɼ���רҵ����
SELECT   sdept ,COUNT(sage), AVG(grade)as ƽ���ɼ�, sdept
 from tb_student where sdept = 'cs'  GROUP BY sage,sdept
  having sage<19 
  SELECT   AVG(grade) from tb_student WHERE sage<18 and sdept = 'cs'