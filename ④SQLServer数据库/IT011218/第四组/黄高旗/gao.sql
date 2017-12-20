--create database db_huanggaoqi
create table tb_Student1(
Sno char(11) primary key,
Sname char(20),
Ssex char(20) check(Ssex='man' or Ssex='woman'),
Sage smallint,
Sdept char(20) )
insert into tb_Student1(Sno,Sname,Ssex,Sage,Sdept)
values('201701','a','man',19,'cs'),
('201702','b','man',19,'is'),
('201703','c','woman',19,'cs'),
('201704','d','man',19,'ms'),
('201705','e','woman',19,'cs'),
('201706','a','woman',19,'ms'),
('201707','f','woman',19,'is'),
('201708','g','man',19,'cs'),
('201709','h','woman',19,'is'),
('2017010','i','man',19,'ms'),
('2017011','k','woman',19,'cs'),
('2017012','l','man',19,'is'),
('2017013','m','man',19,'cs')
