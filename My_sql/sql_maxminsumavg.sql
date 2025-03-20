use mbasic;
select * from emp;
desc emp;

select sum(sal) from emp;
select sum(comm) from emp;
select sum(distinct sal), sum(all sal), sum(sal) from emp;

select count(*) as '데이터갯수' from emp;

select count(*) as '부서30 직원수' from emp where dept=30;
select count(distinct sal) as 'count(distinct sal)', count(all sal) as 'count(all sal)', count(sal) as 'count sal' 
from emp;

select count(*) as '추가 수당 받는 사원 수' from emp where comm is not null;
select max(sal) as '부서 10의 최대 급여' from emp where dept=10;  
select min(sal) as '부서 10의 최대 급여' from emp where dept=10;  
select max(hiredate) as '부서 20최근 입사일' from emp where dept=20;
select min(hiredate) as '부서 20최근 입사일' from emp where dept=20;
select avg(sal) as '부서 30 평균 급여' from emp where dept=30;
select avg(distinct sal) as '부서 30 평균 급여' from emp where dept=30;
select dept as 'deptno', avg(sal) as '평균 급여' from emp group by dept;
select dept , job , avg(sal) as '평균 급여' from emp group by dept,job order by dept, avg(sal); 

select dept , job , avg(sal) as '평균 급여' from emp where sal<=3000 group by dept, job having avg(sal)>=2000;

select dept, job, count(*), max(sal), sum(sal), avg(sal) from emp group by dept, job; 


select dept, job , avg(sal) from emp where avg(sal) >=2000 group by dept, job order by dept, job;
-- where avg(sal) >=2000 where가 아니라 having

select dept , job , avg(sal) as '평균 급여' from emp group by dept, job having avg(sal)>=2000