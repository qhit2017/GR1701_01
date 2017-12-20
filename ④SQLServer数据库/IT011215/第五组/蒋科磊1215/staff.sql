create table db_staff(
id int primary key,
name nvarchar(32)not null,
salar money default 2000,
department nvarchar(16),
dateline date,
recommend bit,
remarks ntext)

alter table db_staff add age tinyint

alter table db_staff drop column name

alter table db_staff alter column recommend int

sp_help db_staff

select name from sys.objects where type='U'