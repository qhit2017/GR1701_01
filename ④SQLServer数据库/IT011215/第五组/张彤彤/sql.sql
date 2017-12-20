--编号 姓名 薪水 部门 入职时间 是否内推 备注
create table tb_emplyee(

id tinyint primary key,
name nvarchar(16)not null,
xinsui money default 3000,
)
alter table tb_emplyee add bumeng varchar,
shijian date,
 neitui bit,
 beizhu text,
 age tinyint
 
 
 alter table tb_emplyee drop column age,
 beizhu,neitui
 
 alter table tb_emplyee alter column shijian datetime
 
  
 sp_help tb_emplyee 
 
 