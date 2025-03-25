use mbasic;

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


select * from emp, dept order by empno;



drop table dept;

create table dept (
    empno    int   not null  auto_increment primary key,
    ename     varchar(20) not null ,
    job       varchar(20) ,
    mgr       int,
    hiredate  date,
    sal       int,
    comm      int,
    deptno      int,
    dname varchar(20) not null,
    loc varchar(20) not null
);
insert into dept  values (7369 , 'SMITH' , 'CLERK'    , 7902 , '1980-12-17' , 800 , null, 20,'RESEARCH', 'DALLAS');
insert into dept  values (7499 , 'ALLEN' , 'SALESMAN' , 7698 , '1981-02-20' , 1600 , 300, 3030 ,'SALES', 'CHICAGO');
insert into dept values (  7521 , 'WARD' ,  'SALESMAN',     7698, '1981-02-22',       1250   ,     500 , 3030 ,'SALES', 'CHICAGO');
insert into dept values (  7566 , 'JONES','MANAGER',         7839 ,'1981-04-02',              2975,    null,20,'RESEARCH', 'DALLAS');
insert into dept values (  7654 , 'MARTIN','SALESMAN',        7698 ,'1981-09-28',              1250,    1400,3030 ,'SALES', 'CHICAGO');
insert into dept values (  7698  , 'BLAKE','MANAGER',         7839 ,'1981-05-01',              2850,    null,3030 ,'SALES', 'CHICAGO');
insert into dept values (  7782  , 'CLARK','MANAGER',         7839 ,'1981-06-09',              2450,    null,10,'ACCOUNTING', 'NEW YORK');
insert into dept values (  7788  , 'SCOTT','ANALYST',         7566 ,'1987-04-19',              3000,    null,20,'RESEARCH', 'DALLAS');
insert into dept values (  7839  , 'KING','PRESIDENT',       null ,'1981-11-17',              5000,    null,10,'ACCOUNTING', 'NEW YORK');
insert into dept values (  7844  , 'TURNER','SALESMAN',        7698 ,'1981-09-08',              1500,       0, 3030 ,'SALES', 'CHICAGO');
insert into dept values (  7876  , 'ADAMS','CLERK',           7788 ,'1987-05-23',              1100,    null, 20,'RESEARCH', 'DALLAS');
insert into dept values (  7900  , 'JAMES','CLERK',           7698 ,'1981-12-03',               950,    null, 3030 ,'SALES', 'CHICAGO');
insert into dept values (  7902  , 'FORD','ANALYST',         7566 ,'1981-12-03',              3000,    null, 20,'RESEARCH', 'DALLAS');
insert into dept values (  7934  , 'MILLER','CLERK',           7782 ,'1982-01-23',              1300,    null, 10,'ACCOUNTING', 'NEW YORK');


select e.empno,e.ename,e.job,e.mgr,e.hiredate,e.sal,e.comm,d.dname,d.loc
from emp e join dept d on e.deptno=d.deptno;

select e.empno, e.ename, d.deptno, d.dname, d.loc      #ambiguous;
from emp e, dept d
where e.deptno=d.deptno;


select e.empno, e.ename, e.sal, d.deptno , d.dname, d.loc
from emp e join dept d on e.deptno=d.deptno
where e.sal>=3000;

select empno, ename, sal, deptno , dname, loc
from emp e natural join dept d 
where sal>=3000;

create table salgrade ( grade int not null  auto_increment primary key, losal int, hisal int);

INSERT INTO salgrade VALUES (1,700,1200);
INSERT INTO salgrade VALUES (2,1201,1400);
INSERT INTO salgrade VALUES (3,1401,2000);
INSERT INTO salgrade VALUES (4,2001,3000);
INSERT INTO salgrade VALUES (5,3001,9999);

select * from salgrade;

select *
from emp e, salgrade s 
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;


select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME` 
from emp e1, emp e2, salgrade s
where e1.mgr=e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc; 


select e1.empno, e1.ename, e1.mgr, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME` 
from emp e1 left join emp e2 on e1.mgr=e2.empno order by e1.empno asc; 

select empno , ename, job , mgr, hiredate, sal, comm, deptno, dname, loc
from emp e natural join dept d order by deptno asc;


select empno , ename, job , mgr, hiredate, sal, comm, deptno, dname, loc
from emp join dept using (deptno)
where sal>=3000 order by deptno asc;

select empno , ename, job , mgr, hiredate, sal, comm, d.deptno, dname, loc
from emp e join dept d on e.deptno=d.deptno where sal<=3000 order by deptno asc;

select d.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno=d.deptno and sal>2000;

select deptno, dname, empno, ename, sal
from emp natural join dept where sal>2000;


-- 16
select d.deptno , d.dname, avg(sal) as `AVG_SAL`, max(sal) as `MAX_SAL` , min(sal) as `MIN_SAL` , count(*) as `CNT`
from emp e , dept d
where e.deptno = d.deptno
group by d.deptno, dname
order by d.deptno, d.dname;

select d.deptno , d.dname, avg(sal) as `AVG_SAL`, max(sal) as `MAX_SAL` , min(sal) as `MIN_SAL` , count(*) as `CNT`
from emp e join dept d using (deptno)
group by d.deptno, dname
order by d.deptno, d.dname;

select d.deptno, dname, e.empno, e.ename, e.mgr , e.sal, e.deptno, s.losal, s.hisal, s.grade, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME`
from emp e right join dept d on(e.deptno=d.deptno)
           left join  salgrade s on (e.sal between s.losal and s.hisal)
		   left join  emp e2 on (e.mgr=e2.empno)
           order by d.deptno;

