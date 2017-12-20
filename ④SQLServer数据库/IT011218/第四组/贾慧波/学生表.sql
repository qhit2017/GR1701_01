create database db_jiahuibo
create table tb_Student2(
Sno char(11) primary key,
Sname char(20),
Ssex char(20) check(Ssex='man' or Ssex='woman'),
Sage smallint,
Sdept char(20) )
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201701','u','man',19,'cs')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201702','o','man',22,'is')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201703','p','woman',19,'cs')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201704','d','man',18,'ms')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201705','e','woman',19,'cs')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201706','a','woman',16,'ms')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201707','f','woman',19,'is')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201708','g','man',21,'cs')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('201709','h','woman',19,'is')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('2017010','i','man',16,'ms')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('2017011','k','woman',17,'cs')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('2017012','y','man',19,'is')
insert into tb_Student2(Sno,Sname,Ssex,Sage,Sdept)
values('2017013','t','man',19,'cs')
