create database db_Guoliuhang

create table tb_employee(
id tinyint primary key,
name nvarchar(16),
nianling tinyint,
riqi datetime,
xingsui decimal(6,4)
)
--增加
insert into tb_empoyee(id,name,nianling,riqi,xingsui)
values
(001,'张一',19,2012-12-12,5555.55),
(002,'张二',19,2012-12-12,5555.55),
(003,'张三',19,2012-12-12,5555.55)
--删除
delete from tb_employee where id=002

--修改
update tb_employee set xingsui=xingsui+2000 where id=003

--查询
select*from tb_employee




