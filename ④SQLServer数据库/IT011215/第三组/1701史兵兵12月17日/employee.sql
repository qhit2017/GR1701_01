create table tb_employee111(id int primary key,
name nvarchar(32) not null,
salary money default 3000,
department nvarchar(16),
dateline date,
recomment bit,

remarks ntext )

sp_help tb_employee111
