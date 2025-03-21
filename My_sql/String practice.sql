use mbasic;

create table userinfo2 (
no int not null default(0),
name varchar(20) not null,
age int not null,
email varchar(20) not null);

insert into userinfo2 values (1,'aaa',11,'aaa@gmail.com');
insert into userinfo2 values (2,'bbb',22,'bbb@gmail.com');
insert into userinfo2 values (3,'ccc',33,'ccc@gmail.com');
insert into userinfo2 values (4,'ddd',44,'dddd@gmail.com');
insert into userinfo2 values (5,'abc',55,'abcgmail.com');
insert into userinfo2 values (6,'bca',66,'bca@gmail.com');

select name, length(name) from userinfo2;

select name, left(name, 1), right(name, 1) from userinfo2;

select name, replace(name, 'aaa','aaa 남바완') from userinfo2;

select concat(name ,'은 개발입니다.') as `직업` from userinfo2;

select upper(name) from userinfo2; 

select lower(name) from userinfo2;

select instr(name,'b') from userinfo2 where age>40;

select instr(name,'b') from userinfo2 where age>40 order by age desc limit 2;

select name, concat(left(name,1),REPEAT('*', CHAR_LENGTH(name) - 2), right(name,1)) as `test` from userinfo2;

create table select_userinfo2 select * from userinfo2;

SET SQL_SAFE_UPDATES = 0;
update select_userinfo2 set name='aaaa' where no=1;
update select_userinfo2 set name='bbaab' where no=2;
update select_userinfo2 set name='ccaac' where no=3;
update select_userinfo2 set name='daadd' where no=4;
update select_userinfo2 set name='abc' where no=5;
update select_userinfo2 set name='baaca' where no=6;
SET SQL_SAFE_UPDATES = 1;

select name, concat(left(name,1),REPEAT('*',LENGTH(name) - 2), right(name,1)) as `test` from select_userinfo2;

select * from userinfo2;
select * from select_userinfo2;