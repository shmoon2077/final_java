use mbasic;

drop table join_userinfo;
create table join_userinfo (
no int not null primary key auto_increment,
name varchar(100) not null,
age int not null);

insert into join_userinfo (no,name,age) values (1,'first',11);
insert into join_userinfo (no,name,age) values (2,'second',22);
insert into join_userinfo (no,name,age) values (3,'third',33);
insert into join_userinfo (no,name,age) values (4,'fourth',44);

desc join_userinfo;
select * from join_userinfo;


create table join_userban (
no int not null primary key auto_increment,
name varchar(20) not null,
ban varchar(20));

insert into join_userban (no,name,ban) values (1,'first','A');
insert into join_userban (no,name,ban) values (2,'second','B');
insert into join_userban (no,name,ban) values (3,'third','A');
insert into join_userban (no,name,ban) values (4,'fourth','C');
insert into join_userban (no,name,ban) values (5,'fifth','B');
insert into join_userban (no,name,ban) values (6,'sixth','C');

desc join_userban;
select * from join_userban;





# 데이타 베이스 언어 종류

# e (entity 테이블 ) r (relation 속성: pk fk
# join  
# 테이블간의 연결고리 (pk, fk)


#종류 : inner join , outer join

--  -------- inner join ----------
#1. join
select a.no, a.name, a.age, ban
from join_userinfo a,  join_userban b
where a.no = b.no;


#2. join on
select a.no, a.name, a.age, ban
from join_userinfo a join join_userban b on (a.no = b.no);

#3 join using

select a.no, a.name, a.age, b.ban
from join_userinfo a join user_userban b using(no);

#4 natural join 
select no , name,  age , ban
from join_userinfo natural join  join_userban;

select a.no , a.name, a.age, b.ban
from join_userinfo a , join_userban b
where a.no=b.no  and age between 20 and 40;




#---------- outer join --------

select a.no, a.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no=b.no;

select a.no, a.name, b.ban, a.age
from join_userinfo a left join join_userban b on a.no=b.no;

select b.no, b.name, b.ban, a.age
from join_userban b right join join_userinfo a on a.no=b.no;