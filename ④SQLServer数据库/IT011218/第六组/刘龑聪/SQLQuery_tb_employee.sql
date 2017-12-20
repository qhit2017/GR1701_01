create table tb_employee(
id tinyint identity(1,1) primary key,
name nvarchar(16) not null,
age tinyint check(age>=18 and age<120),
dateline date not null,
salary money,)

insert into tb_employee (name,age,dateline,salary) values
('tom',20,'2000-6-13',5500),
('marry',19,'1985-9-21',9500)

select * from tb_employee

select id,name from tb_employee

update tb_employee set salary=6800 where name='tom'

select * from tb_employee where name='tom'

delete from tb_employee where name='marry'

select * from tb_employee