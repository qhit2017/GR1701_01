create database db_sunxiangli
use  db_sunxiangli

----ѧ����
create table tb_Student(
Sno char(11) primary key,
Sname char(20) not null,
Ssex char(2) check(Ssex='��' or Ssex='Ů'),
Sage  smallint not null,
Sdept char(20))
select*from tb_Student

---�γ̱�
create  table tb_Course(
Cno char(4)  primary key,
Cname char(20) not null,
Cpno  char(4) not null,
Ccredit smallint not null)

---ѧ��ѡ�α�
create  table tb_SC(
Sno char(11) primary key,
Cno char(4) not null,
Grade  smallint not null)


select * from tb_Student
select * from  tb_Course 
select * from  tb_SC 
----------------------------------------------------------------------


---��ѧ������Ӽ�¼
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215121,'����','��',20,'CS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215122,'����','Ů',19,'CS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215123,'����','Ů',18,'MA')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215124,'����','��',19,'IS')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215125,'����','��',18,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215126,'���','��',20,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215127,'����','��',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215128,'�Ŷ�','��',18,'JZ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215129,'����','��',19,'JZ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215130,'����','Ů',19,'NM')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215131,'�߱�','Ů',19,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215132,'��ͩ','Ů',18,'NM')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215133,'���','Ů',20,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215134,'ʩ��','��',18,'XQ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215135,'��','��',20,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept ) values(200215136,'����','��',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215137,'����','Ů',21,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215138,'����','Ů',18,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215139,'�','��',19,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215140,'�߽�','��',19,'GR')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215141,'�ֲ�','��',18,'JSJ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215142,'ʯ��','Ů',18,'XQ')
insert into tb_Student (Sno,Sname,Ssex ,Sage ,Sdept )values(200215143,'����','��',20,'JSJ')

select * from tb_Student

---���γ̱���Ӽ�¼
insert into tb_Course (Cno,Cname, Cpno, Ccredit) values
(1,'���ݿ�',5,4),
(2,'��ѧ',' ',2),
(3,'��Ϣϵͳ',1,4),
(4,'����ϵͳ',6,3),
(5,'���ݽṹ',7,4),
(6,'���ݴ���',' ', 2),
(7,'PASCAL����',6,4),
(8,'����',5,2),
(9,'Ӣ��',2,4),
(10,'java',9,9),
(11,'���ݿ�',7,6)

select * from  tb_Course 

---��ѧ��ѡ�α��������
insert into tb_SC (Sno,Cno,Grade ) values
 (200215121,7,59),
 (200215122,2,69),
 (200215123,4,79),
 (200215124,9,99),
 (200215125,8,29),
 (200215126,10,100),
 (201712253,1,150),
 (200215127,8,29),
 (200215128,15,94),
 (201712259,11,88),
 (200215130,7,59),
 (200215131,2,69),
 (200215132,4,79),
 (200215133,9,99),
 (200215134,8,29),
 (200215135,10,100),
 (200215136,1,15),
 (200215137,8,29),
 (200215138,15,94),
 (200215139,11,88),
 (200215140,10,10),
 (200215141,1,15),
 (200215142,8,29),
 (200215143,15,4),
 (200215144,11,88),
 (200215145,10,100),
 (200215146,1,15),
 (200215147,8,29),
 (200215148,15,94),
 (200215149,11,88)
 
 select * from  tb_SC 