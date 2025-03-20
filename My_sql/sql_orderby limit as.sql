use mbasic;
select * from select_userinfo; 
desc userinfo;

select * from select_userinfo order by age desc;  -- 내림차순 
select * from select_userinfo order by age asc; -- 오름차순

delete from select_userinfo where no=11;

-- 나이 많은 3명
select * from select_userinfo order by age desc limit 3;


-- no가 높은 순으로 4명
select * from select_userinfo order by no desc limit 4;

-- no가 2번째로 높은 순으로 2명 limit 어디서부터~~ 몇개 가능
select * from select_userinfo order by no desc limit 0 , 2;
select * from select_userinfo order by no desc limit 1 , 2;


select * from select_emp;

select * from select_emp where job='salesman';

select ename, mgr, sal from select_emp;

select ename, mgr, sal from select_emp where job='salesman';

select * from select_emp order by sal desc;

select * from select_emp order by job asc ,sal desc;

select ename, sal, empno from select_emp where sal >= 2000 order by empno desc;

select distinct job from select_emp;

select  empno as `사원번호` , ename as `이름`, job as `담당 업무` from select_emp;


select * from userinfo;

select * from select_userinfo;