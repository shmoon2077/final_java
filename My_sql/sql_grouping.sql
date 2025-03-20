/*  
select   필드1, 필드2
from     테이블명
where    조건식 
group by 그뤂핑
having 조건식 
order by 기준필드  [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
limit    몇개

직계함수 (group by , having이랑 같이)
avg() max() min () sum() count()

*/



use mbasic
drop table group_userinfo;
create table group_userinfo (
no int not null primary key auto_increment,
name varchar(20) not null,
age int not null,
sex char(2),
kor int,
eng int,
math int,
ban char(2),
sns char(2) default 'y');

desc group_userinfo;

insert into group_userinfo values (1,'first',11,null,100,100,99,'A','n');
insert into group_userinfo values (2,'second',22,'m',89,92,78,'B','y');
insert into group_userinfo values (3,'third',33,'m',90,92,97,'A','y');
insert into group_userinfo values (4,'fourth',44,'f',40,42,67,'C','n');
insert into group_userinfo values (5,'fifth',55,'f',89,86,99,'B','y');
insert into group_userinfo values (6,'sixth',66,'m',10,20,44,'C','n');

select * from group_userinfo;

select  @@sql_mode;
set  SESSION  sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select * from group_userinfo group by ban;

-- 나이 평균

select avg(age) from group_userinfo;

select ban,avg(kor),avg(eng),avg(math) from group_userinfo group by ban;

select ban,sum(age), avg(age) from group_userinfo group by ban;

select ban,avg(kor),avg(eng),avg(math) from group_userinfo group by ban having avg(kor)>=89;  

select ban,sum(age), avg(age) from group_userinfo group by ban having avg(age)>=35;

select ban,sum(age), avg(age) from group_userinfo group by ban having avg(age)>=35 order by avg(age) desc;
