insert into tb_Course(Cno,CName,Cpno,Ccredit) 
values('2','���ݿ�','5',4),
('3','��ѧ','5',4),
('4','���ݿ�','5',4),
('5','��Ϣϵͳ','5',4),
('6','����ϵͳ','5',4),
('7','PASCAL����','5',4),
('8','���ݿ�','5',4),
('9','���ݽṹ','5',4),
('10','���ݴ���','5',4)
create table tb_guyuan(bno char primary key,
name char(32),
age smallint,
datei date,
xinshui smallint,)

alter table tb_guyuan add ii char
alter table tb_guyuan drop column ii
alter table tb_guyuan alter column ii int
sp_help tb_guyuan
