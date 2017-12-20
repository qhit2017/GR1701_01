create database db_guyuanguanli

create table tb_guyuan(
id tinyint primary key,
name nvarchar(10),
nianling tinyint,
riqi datetime,
xingsui decimal(8,3)
)
--增加
insert into tb_guyuan(id,name,nianling,riqi,xingsui)
values
(001,'张一',19,2012-12-12,5555.55),
(002,'张二',19,2012-12-12,5555.55),
(003,'张三',19,2012-12-12,5555.55)
--删除
delete from tb_guyuan where id=002

--修改
update tb_guyuan set xingsui=xingsui+2000 where id=003

--查询
select*from tb_guyuan




