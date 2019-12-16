create table emp (id int ,name varchar(10),sal int)
select * from emp 
insert into emp values(4,'dd',400)
insert into emp(id,name) values (5,'ee')
update emp set sal=500 where id=5
delete from emp where id=5