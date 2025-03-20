# 1. rdb : 관계형데이터베이스  - 테이블(Entity)들의 관계(Relationship) 외래키(Attribute)
# 2. 데이터베이스 언어 
#   정의어  DDL - create, alter, drop - cad
#   조작어  DML - insert, select, update, delete  -   crud 
#   제어어  DCL - grant, revoke

#실습1) insert
use mbasic;
show tables;
desc userinfo;

#1-1 구조와 순서를 알고 있을때 
/*
mysql> desc userinfo;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| no    | int          | NO   | PRI | NULL    | auto_increment |
| name  | varchar(100) | NO   |     | NULL    |                |
| age   | int          | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
dml : insert ,select, update, delete
*/
insert into  userinfo  values (1, 'first', 11);
insert into  userinfo  values ('second' , 22, 2); # 필드 순서 안맞음!
# Error Code: 1366. Incorrect integer value: 'second' for column 'no' at row 1	0.000 sec
select   * from userinfo;

#1-2 원하는 필드만 데이터 입력
insert into userinfo  (name, age)  values ( 'second' , 22);
# 1 row(s) affected

insert into userinfo  (age,name)  values ( 33 , 'third');
select * from userinfo;
insert into userinfo (name,age) values ( 'forth', 44);


set sql_safe_updates=0;
update userinfo set age=0;

update userinfo set age=11 where no=1;
update userinfo set age=11, name='two' where no=2;
update userinfo set name='second' where no=2 and age=22;


update userinfo set name='third',age=44 where no=3 and age=10;
update userinfo set name='forth', age=44 where no=4 and name='first';

# update 시 조건이 안맞으면 반영이 되지 않는다! ! ! 

#연습문제1)
/*
[001] 다음과 같이 데이터를 삽입하시오
mysql> select * from emp;
+-------+--------+-----------+------+------------+------+------+------+
| empno | ename  | job       | mgr  | hiredate   | sal  | comm | dept |
+-------+--------+-----------+------+------------+------+------+------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800 | NULL |   20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600 |  300 |   30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250 |  500 |   30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975 | NULL |   20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250 | 1400 |   30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850 | NULL |   30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450 | NULL |   10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1987-04-19 | 3000 | NULL |   20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000 | NULL |   10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500 |    0 |   30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1987-05-23 | 1100 | NULL |   20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950 | NULL |   30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000 | NULL |   20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300 | NULL |   10 |
+-------+--------+-----------+------+------------+------+------+------+
14 rows in set (0.00 sec)

mysql>
*/
drop table emp;
create table emp  (
	empno    int   not null  auto_increment primary key,
 	ename     varchar(20) not null ,
 	job       varchar(20) ,
 	mgr       int,
 	hiredate  date,
	sal       int,
	comm      int,
	deptno      int
);
insert into emp  values (7369 , 'SMITH' , 'CLERK'    , 7902 , '1980-12-17' , 800 , null, 20);
insert into emp  values (7499 , 'ALLEN' , 'SALESMAN' , 7698 , '1981-02-20' , 1600 , 300, 30);
insert into emp values (  7521 , 'WARD' ,  'SALESMAN',     7698, '1981-02-22',       1250   ,     500 , 30);
insert into emp values (  7566 , 'JONES','MANAGER',         7839 ,'1981-04-02',              2975,    null,20);
insert into emp values (  7654 , 'MARTIN','SALESMAN',        7698 ,'1981-09-28',              1250,    1400,30);
insert into emp values (  7698  , 'BLAKE','MANAGER',         7839 ,'1981-05-01',              2850,    null,30);
insert into emp values (  7782  , 'CLARK','MANAGER',         7839 ,'1981-06-09',              2450,    null,10);
insert into emp values (  7788  , 'SCOTT','ANALYST',         7566 ,'1987-04-19',              3000,    null,20);
insert into emp values (  7839  , 'KING','PRESIDENT',       null ,'1981-11-17',              5000,    null,10);
insert into emp values (  7844  , 'TURNER','SALESMAN',        7698 ,'1981-09-08',              1500,       0, 30);
insert into emp values (  7876  , 'ADAMS','CLERK',           7788 ,'1987-05-23',              1100,    null, 20);
insert into emp values (  7900  , 'JAMES','CLERK',           7698 ,'1981-12-03',               950,    null, 30);
insert into emp values (  7902  , 'FORD','ANALYST',         7566 ,'1981-12-03',              3000,    null, 20);
insert into emp values (  7934  , 'MILLER','CLERK',           7782 ,'1982-01-23',              1300,    null, 10);
select * from emp;

/*
[002] 다음과 같이 데이터를 삽입하시오
mysql> select * from dept;
+--------+------------+----------+
| deptno | dname      | loc      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.00 sec)

mysql>
*/
drop table dept;
create table dept (
	deptno int not null  auto_increment primary key,
	dname varchar(20) not null,
	loc varchar(20) not null
    );

insert into dept values (10 , 'ACCOUNTING' , 'NEW YORK');
insert into dept values (20 , 'RESEARCH' , 'DALLAS');
insert into dept values (30 , 'SALES' , 'CHICAGO');
insert into dept values (40 , 'OPERATIONS' , 'BOSTON');
select * from dept;
/*
[003] 다음과 같이 데이터를 삽입하시오
mysql>
mysql> select * from salgrade;
+-------+-------+-------+
| grade | losal | hisal |
+-------+-------+-------+
|     1 |   700 |  1200 |
|     2 |  1201 |  1400 |
|     3 |  1401 |  2000 |
|     4 |  2001 |  3000 |
|     5 |  3001 |  9999 |
+-------+-------+-------+
5 rows in set (0.00 sec)
*/

create table salgrade ( grade int not null  auto_increment primary key, losal int, hisal int);

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);

select * from salgrade;

drop table score;

create table score  (
	sno    int   not null  auto_increment primary key,
 	sname     varchar(20) not null ,
 	sjava      int ,
 	sjsp       int,
 	sspring  int,
	sproject	int,
	sstotal      int,
	ssavg      double,
	semail varchar(100));

INSERT INTO score VALUES (1,'aaa',100,100,100,100,null,null,null);
INSERT INTO score VALUES (2,'bbb',90,98,88,100,null,null,null);
INSERT INTO score VALUES (3,'ccc',70,20,78,80,null,null,null);
INSERT INTO score VALUES (4,'ddd',78,89,68,98,null,null,null);
INSERT INTO score VALUES (5,'abc',89,98,69,77,null,null,null);

select * from score;



set sql_safe_updates=0;
update score set sjava=90, sjsp=90, sspring=90 where sname='ccc';
update score set semail='admina@gmail.com';
update score set sstotal=(sjava+sjsp+sspring+sproject);
update score set ssavg = sstotal/4;



-- 준비

create table userinfo_delete select * from userinfo;
alter table userinfo_delete add primary key(no);
alter table userinfo_delete modify no int not null auto_increment;

desc userinfo_delete;

select * from userinfo_delete;

#실습3) delete
/* 
delete from 테이블명 where 조건식
*/

delete from userinfo_delete where age=11;
select * from userinfo_delete;

delete from userinfo_delete where name='second' and age=22;

delete from userinfo_delete;

use mbasic;
drop table emp_delete;
create table emp_delete select * from emp;


select * from emp_delete;