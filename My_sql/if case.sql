-------------------------------------------
#4. if / case
-------------------------------------------
-- if (조건, 참, 거짓)
-- 다형식 
/* case
   when 조건 1 then 상태 1
   when 조건 2 then 상태 2
   else 무든 조건에 해당하지 않을 때, 생략 가능
   end
*/


create table control (no int);
insert into control values (1), (2), (3); 

select * from control;

-- 1-1
select no , if (no = 1 , '1이다' , '1이 아니다') `상태` from control;

-- 1-2
select no, if (no>1 , '1보다 크다' , '1보다 크지 않다') `상태` from control;


-- 1-3 when then    end

select no, case 
			when no=1 then '1이다'
            when no=2 then '2이다'
            when no=3 then '3이다'
            else '1,2,3이 아니다'
	       end `state`
from control;

-- 1-4 

select no, case
        when no>2 then '2보다 크다'
        when no=2 then '2이다'
        when no<2 then '2보다 작다'
        end `state`
        from control;
        
        
        
        
-----------------------------------------
#연습 문제
-----------------------------------------
create table if_userinfo (
no int not null primary key auto_increment,
name varchar(100) not null,
age int default(0),
sex char(1),
sns char(1));

insert if_userinfo (name,age,sex,sns) values ('first',11,null,'n');
insert if_userinfo (name,age,sex,sns) values ('second',122,'m','y');
insert if_userinfo (name,age,sex,sns) values ('third',33,'m','y');
insert if_userinfo (name,age,sex,sns) values ('fourth',44,'f','n');
insert if_userinfo (name,age,sex,sns) values ('fifth',55,'f','y');
insert if_userinfo (name,age,sex,sns) values ('sixth',66,'m','n');

select * from if_userinfo;

select no,name,age,sex,sns,if(sns='y', '수신유지' , '수신거부') `수신여부상태` from if_userinfo;

select no,name,age,sex,sns,if(age<19, '미성년자' , '성인') `성인여부` from if_userinfo;

select count(sns='n') `sns수신거부수` from if_userinfo;

select ename,dept, case 
when dept=10 then 'ACCOUNTING'
when dept=20 then 'RESEARCH'
when dept=30 then 'SALES'
end `부서이름` from emp;




select ename, job , case 
when job='clerk' then '판매원'
when job='salesman' then '영업사원'
else '사원' end `job2` from emp;

