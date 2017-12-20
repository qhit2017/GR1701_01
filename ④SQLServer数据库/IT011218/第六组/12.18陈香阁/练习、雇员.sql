create database db_guyuan

create table tb_guyuan(
id tinyint primary key,
name nvarchar(10),
age tinyint,
dateline datetime,
salary decimal(6,4)
)
--增加
insert into tb_guyuan(id,name,age,dateline,salary)
values
(001,'张三',19,2012-12-12,22.33),
(002,'王二',19,2012-12-12,22.33),
(003,'李五',19,2012-12-12,22.33)
--删除
delete from tb_guyuan where id=002

--修改
update tb_guyuan set salary=salary+2000 where id=003

--查询
select*from tb_guyuan

