/*
 * 실제 업무 시 *.sql파일은 따로 만들어두는 것이 좋다
 */

--insert
insert into address values(address_no_SEQ.nextval,'일경호','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'이경우','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'삼경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'사경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'오경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'육경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'칠경미','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'팔경미','123-4567','경기도 성남시');

--update(pk update)
update address set name='김변경',phone='899-9900',address='서울시 강남구' where no=1;

--delete(pk delete)
delete address where no=1;
--select(pk select)
select no,name,phone,address from address where no=3;
--select(all select)
select no,name,phone,address from address