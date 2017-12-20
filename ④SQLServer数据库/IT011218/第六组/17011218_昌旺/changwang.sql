insert into tb_Course(Cno,CName,Cpno,Ccredit) 
values('2','数据库','5',4),
('3','数学','5',4),
('4','数据库','5',4),
('5','信息系统','5',4),
('6','操作系统','5',4),
('7','PASCAL语言','5',4),
('8','数据库','5',4),
('9','数据结构','5',4),
('10','数据处理','5',4)
create table tb_guyuan(bno char primary key,
name char(32),
age smallint,
datei date,
xinshui smallint,)

alter table tb_guyuan add ii char
alter table tb_guyuan drop column ii
alter table tb_guyuan alter column ii int
sp_help tb_guyuan
