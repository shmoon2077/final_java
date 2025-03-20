desc emp;

alter table emp change deptno dept int;

create table select_emp select * from emp;

desc select_emp;
alter table select_emp change empno empno int not null primary key auto_increment;	

select * from select_emp where dept=30;
select * from select_emp where dept=30 and job='SALESMAN';
select * from select_emp where dept=30 or job='clerk';
select * from select_emp where sal*12=36000;
select * from select_emp where sal>=3000;
select * from select_emp where ename>='F';
select * from select_emp where ename<='FORD';
select * from select_emp where sal!=3000;
select * from select_emp where sal<>3000;
select * from select_emp where sal not in (3000);
select * from select_emp where job= 'Manager' or job= 'Salesman' or job=  'clerk';
select * from select_emp where job in ('manager','salesman','clerk');
select * from select_emp where job!='manager' and job<>'salesman' and job not in ('clerk');
select * from select_emp where job not in ('clerk','salesman','manager');
select * from select_emp where sal >=2000 and sal<=3000;
select * from select_emp where sal between 2000 and 3000;
select * from select_emp where sal not between 2000 and 3000;
select * from select_emp where not(sal >=2000 and sal<=3000);
select * from select_emp where empno=7499 and dept=30;
select * from select_emp where dept=20 or job='salesman';
select * from select_emp where sal>=2500 and job='analyst';
select * from select_emp where dept in (10,20);
select * from select_emp where dept not in (10,20);
select * from select_emp where ename like 's%';
select * from select_emp where ename like '_l%';
select * from select_emp where ename like '%am%';
select * from select_emp where ename not like '%am%';

select ename, sal, sal*12+comm 'annsal', comm from select_emp where ename like '%am%';
				    -- 숫자+null 계산 안되니 annsal은 null

select * from select_emp where comm is null;
select * from select_emp where mgr is not null;



##35
select * from select_emp where ename like '%s';
select * from select_emp where dept=30 and job='salesman';
select * from select_emp where dept in (20,30) and sal>2000;
select * from select_emp where not(sal>=2000 and sal<=3000);
select * from select_emp where dept=30 and ename like '%e%' and sal not between 1000 and 2000;
select * from select_emp where comm is null and mgr is not null and job in ('manager','clerk')
 and ename not like '_L%';
 
select * from select_emp;
