use mbasic;
drop table member;
create table member (
no int not null primary key auto_increment,
name varchar(100) not null,
pass varchar(50) not null);

insert into member values (1,'first',11);
insert into member values (2,'sencond',22);
insert into member values (3,'third',33);
insert into member values (4,'fourth',44);


select * from member;


create table board (
bno int not null primary key auto_increment,
btitle varchar(1000) not null,
bcontent text not null,
bname varchar(100) not null,
bhit int not null default 0, 
bdate timestamp not null default current_timestamp,
bip varchar(100) not null);

select * from board;
desc board;
