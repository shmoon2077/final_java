------------------------------------------
#3. DATE
------------------------------------------

-- 1) 시스템의 현재 시각 조회
select now();

-- 2) 요일 (0 = mon , 1= tue.... 6=sun)

select weekday (now());
select weekday ("2025-03-21");

-- 3) 날짜 형식 date_format ( 날짜 지정 '%y-%m-%d )
select date_format("2025-03-21", '%y-%m-%d');
select date_format(now(), '%y-%m-%d %h:%i:%s');

-- 4) 100일 전/후 date_add

select date_add(now() , interval -10 day);
select date_add(now() , interval 10 day);
select date_add(now() , interval -3 day);

-- 5) datediff(날짜1 날짜2)
select datediff('2025-03-22','2025-03-21');
select timestampdiff(hour, '2025-03-22','2025-03-21');


use mbasic;
drop table date_userinfo;

create table date_userinfo (
no int not null default(0),
name varchar(100) not null,
age int not null,
date datetime not null default(now()));

desc date_userinfo;

insert into date_userinfo values (1,'aaa',11,'2022-12-30 00:00:00');
insert into date_userinfo values (2,'bbb',22,'2022-11-30 00:00:00');
insert into date_userinfo values (3,'ccc',33,'2022-10-30 00:00:00');
insert into date_userinfo values (4,'ddd',44,'2022-09-30 00:00:00');

select * from date_userinfo;

select name, date from date_userinfo where date>'2022-11-01'; 

select name , date, date_add(date, interval 30 day) 'event' from date_userinfo where date>='2022-12-01' and date<='2022-12-31'; 

select name, date_format( date, '%y년 %m월 %d일' ) from date_userinfo;