# ■ 복습문제 (집계함수)

/*
Q1.  emp 테이블에서  급여가 3000이하인 직원에서  
-- [각 부서의 직책별] 평균급여가 2000이상인 그룹을 조회하시오.
+--------+---------+-----------+
| deptno | job     | 평균급여  |
+--------+---------+-----------+
|     10 | MANAGER | 2450.0000 |
|     20 | ANALYST | 3000.0000 |
|     20 | MANAGER | 2975.0000 |
|     30 | MANAGER | 2850.0000 |
+--------+---------+-----------+
4 rows in set (0.00 sec)
*/
use mbasic;
select * from emp;

select  deptno, job, avg(sal) `평균급여` 
from    emp
where   sal <= 3000
group   by  deptno, job
having  avg(sal)  >=2000
order by  deptno asc, job;



/* 
Q2. emp 테이블에서 GROUP BY절만  사용하여  
-- 각부서의 직책별 사원수, 가장높은 급여, 급여합, 평균급여를  다음과 같이  사원데이터를  조회하시오.
+--------+-----------+--------+----------+--------+-----------+
| deptno | job       | 사원수   | 최고급여   | 급여합   | 평균급여   |
+--------+-----------+--------+----------+--------+-----------+
|     10 | CLERK     |      1 |     1300 |   1300 | 1300.0000 |
|     10 | MANAGER   |      1 |     2450 |   2450 | 2450.0000 |
|     10 | PRESIDENT |      1 |     5000 |   5000 | 5000.0000 |
|     20 | ANALYST   |      2 |     3000 |   6000 | 3000.0000 |
|     20 | CLERK     |      2 |     1100 |   1900 |  950.0000 |
|     20 | MANAGER   |      1 |     2975 |   2975 | 2975.0000 |
|     30 | CLERK     |      1 |      950 |    950 |  950.0000 |
|     30 | MANAGER   |      1 |     2850 |   2850 | 2850.0000 |
|     30 | SALESMAN  |      4 |     1600 |   5600 | 1400.0000 |
+--------+-----------+--------+----------+--------+-----------+
9 rows in set (0.00 sec) 
*/

select  @@sql_mode;
set    SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

select  deptno , job 
	    , count(*) `사원수` , max(sal)  `최고급여` , sum(sal) `급여합`, avg(sal) `평균급여`
from    emp
group   by    deptno , job 
order   by    deptno , job  ;   


# ■ 진도 - function
#1. Number
#2. String
#3. Date
#4. if / case


#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지)
--             2               1           2
select   ceil(1.1) `올림`, floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;
# https://www.w3schools.com/sql/func_mysql_round.asp
/*
1-2 CRUD (SELECT Function-Number 연습문제)
EX1    123.4578을 ROUND를 이용하여 다음과 같이 출력하시오.
+----------+--------+--------+--------+--------+
| 123.4578 | ROUND1 | ROUND2 | ROUND3 | ROUND4 |
+----------+--------+--------+--------+--------+
| 123.4578 |    123 |    120 |  123.5 | 123.46 |
+----------+--------+--------+--------+--------+
1 row in set (0.00 sec)
*/
select  round(123.4567 , 0);
select  round(123.4567 , 2);
select  round(123.4567 , -1);
/*
EX2
+----------+------+-------+
| 123.4578 | CEIL | FLOOR |
+----------+------+-------+
| 123.4578 |  124 |   123 |
+----------+------+-------+
1 row in set (0.00 sec)
*/

select 123.4578, round(123.4578,0) , round (123.4578, -1), round (123.4578, 1), round (123.4578, 2);


---------------------------------------------------------------------------------------
#2. String
---------------------------------------------------------------------------------------

-- 2-1. basic
-- 1) length (문자열) 갯수

select length('abc');

-- 2) upper/lower
select 'abc' , upper('abc'), lower('abc');


-- 3) instr 위치  (1부터 인덱스 시, 없는 경우 0 반환)

select instr('abvc','b') `b의 위치`, instr('abc','ab') `ab의 위치` , instr('abc','ac') `ac의 위치`; 


-- 4) left , right , substr 문자열 일부를 추출

select left('abc' , 1), left('abc',2), right('abc',1), right('abc',2);

select substr('abcde',2,2), substr('abcde',2,3);


-- 5) 문자열 연결 (1,2 2개만 됨)

select concat ('mysql','hello');

-- 6 공백 trim (가운데는 제거 못하고 좌우 끝 공백만 제거)

select trim(' a b c ');


select concat('#',trim(' a b c ') , '#');
select concat('#',ltrim(' a b c ') , '#');
select concat('#',rtrim(' a b c ') , '#');



-- 7. replace ( 문자열 , 찾아서 , 바꾸기 );

select replace("hello sally", 'sally' , 'alpha');


-- 8. repeat 
select repeat('*',5);

-- 9. 빈칸 채우기

select lpad('abc', 10, '$');
select rpad('abc', 10, '$');









