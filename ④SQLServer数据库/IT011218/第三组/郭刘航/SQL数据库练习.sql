create database db_Guoliuhang

create table tb_Student(
Sno char(11) primary key,
Sname char(20),
Ssex char(2) check(Ssex='男' or Ssex='女') default'男',
Sage smallint,
Sdept char(20) null
)

create table tb_Course(
Cno char(4) primary key,
CName char(20),
Cpno char(4),
Ccredit smallint
)

create table tb_SC(
Sno char(11) primary key,
Cno char(4),
Grade smallint)

insert into tb_Student(Sno,Sname,Ssex,Sage,Sdept)
values('200215121','李勇','男',20,'CS'),
('200215122','刘晨','女',19,'CS'),
('200215123','王欣','女',18,'MA'),
('200215124','张三','男',19,'IS'),
('200215125','贾一','女',19,'CS'),
('200215126','贾二','女',18,'MA'),
('200215127','贾三','男',19,'IS'),
('200215128','贾四','女',19,'CS'),
('200215129','贾五','女',18,'MA'),
('200215130','贾六','男',19,'IS'),
('200215131','胡一','女',19,'CS'),
('200215132','胡二','女',18,'MA'),
('200215133','胡三','男',19,'IS'),
('200215134','胡四','女',19,'CS'),
('200215135','胡五','女',18,'MA'),
('200215136','胡六','男',19,'IS'),
('200215137','胡七','男',19,'IS'),
('200215138','胡八','女',19,'CS'),
('200215139','胡九','女',18,'MA'),
('200215140','胡十','男',19,'IS'),
('200215141','王一','女',19,'CS'),
('200215142','王二','女',18,'MA'),
('200215143','王三','男',19,'IS'),
('200215144','王四','女',19,'CS'),
('200215145','王五','女',18,'MA')

select*from tb_Student


insert into tb_Course(Cno,CName,Cpno,Ccredit)
values('1','数据库',5,4),
('2','数学','',4),
('3','操作系统','1',4),
('4','语文',5,5),
('5','数学',5,5),
('6','外语',5,5),
('7','语文',5,5),
('8','数学',5,5),
('9','外语',5,5),
('10','语文',5,5),
('11','数学',5,5),
('12','外语',5,5),
('13','语文',5,5),
('14','数学',5,5),
('15','外语',5,5),
('16','语文',5,5),
('17','数学',5,5),
('18','语文',5,5),
('19','数学',5,5),
('20','外语',5,5),
('21','外语',5,5),
('22','数学',5,5),
('23','外语',5,5),
('24','语文',5,5),
('25','数学',5,5)

select*from tb_Course

insert into tb_SC(Sno,Cno,Grade) 
values
('200215121','1',92),
('200215122','2',85),
('200215123','3',88),
('200215124','2',90),
('200215125','3',80),
('200215126','1',92),
('200215127','2',85),
('200215128','3',88),
('200215129','2',90),
('200215130','3',80),
('200215131','1',92),
('200215132','2',85),
('200215133','3',88),
('200215134','2',90),
('200215135','3',80),
('200215136','1',92),
('200215137','2',85),
('200215138','3',88),
('200215139','2',90),
('200215140','3',80),
('200215141','1',92),
('200215142','2',85),
('200215143','3',88),
('200215144','2',90),
('200215145','3',80)

select*from tb_SC
