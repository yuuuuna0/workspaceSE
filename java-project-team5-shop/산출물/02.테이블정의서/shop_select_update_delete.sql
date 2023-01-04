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
