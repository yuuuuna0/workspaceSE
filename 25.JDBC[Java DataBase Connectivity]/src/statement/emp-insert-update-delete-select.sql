--emp crud
--select
select empno,ename,job,sal,hiredate from emp order by sal desc;
select * from emp where sal>=1000 and sal<=4000 and job='SALESMAN' or job='CLERK';



--insert
insert into emp values(9001,'JUNG','MANAGER',7369,sysdate,3000.34,30,40);
insert into emp values(9002,'HONG','CLERK',7369,sysdate,5000.56,0,40);
insert into emp values(9003,'DIM','SALESMAN',7369,to_date('1995/08/12','YYYY/MM/DD'),8520.12,50,30);
insert into emp values(9004,null,null,null,null,null,null,null);


rollback;

--update
update emp set sal=sal*1.3  where empno>=7369 and empno<=7600;

--delete 
delete from emp where empno =9001;
delete from emp where empno =9002;
delete from emp where empno =9003;
delete from emp where empno =9004;
commit;