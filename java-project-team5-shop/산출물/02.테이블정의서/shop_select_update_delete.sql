/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where userid='guard1';
--회원정보수정(update pk)
update userinfo set password='1111',name='김변경',email='change@naver.com' where userid='guard1';
--회원탈퇴(delete pk)
delete userinfo where userid='guard4';



/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/****************cart********************/
--로그인한멤버(guard1)의 카트리스트
select * from cart where userid='guard1';
select * from cart c join product p on c.p_no=p.p_no where userid='guard1'; 

--로그인한멤버(guard1)의 카트리스트삭제
delete from cart where cart_no=2;


--로그인한멤버(guard1)의 카트1개아이템 수량변경
update cart set cart_qty = 3 where cart_no=8;

--로그인한멤버(guard1)의 카트에 존재하는 제품의수(제품존재여부판단)
select count(*) cnt from cart where userid='guard1' and p_no=1;
--로그인한멤버(guard1)의 카트에담기(수정)
update cart set cart_qty = cart_qty + 1 where userid='guard1' and p_no=1;

select * from orders o join order_item oi on o.o_no=oi.o_no  join  product p on oi.p_no=p.p_no where o.userid='guard1' and o.o_no = 4;
select * from orders where userid='guard1';

/****************order********************/
--1.멤버한사람의 주문전체목록(guard1)
select * from orders where userid='guard1';
--1.멤버한사람의 주문(주문아이템+제품)전체목록(guard1)
select * 
    from orders o 
    join order_item oi 
    on o.o_no= oi.o_no 
    join product p
    on oi.p_no=p.p_no
where userid='guard1';

--2.멤버한사람의 주문(주문아이템+제품)한개(guard1)
select * 
    from orders o 
    join order_item oi 
    on o.o_no= oi.o_no 
    join product p
    on oi.p_no=p.p_no
where userid='guard1' and o.o_no=1;

--3. 로그인한멤버(guard1)주문한개삭제
-- on delete cascade
delete from orders where o_no=1;

--4. 로그인한멤버(guard1)주문전체삭제
delete from orders where userid='guard1';



desc orders;
desc order_item;










