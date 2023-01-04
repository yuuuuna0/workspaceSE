DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE userInfo CASCADE CONSTRAINTS;

CREATE TABLE userInfo(
		userId                        		VARCHAR2(50)		 NULL ,
		password                      		VARCHAR2(50)		 NOT NULL,
		name                          		VARCHAR2(50)		 NULL ,
		email                         		VARCHAR2(50)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		p_image                       		VARCHAR2(100)		 DEFAULT 'default.jpg'		 NULL ,
		p_desc                        		VARCHAR2(200)		 NULL ,
		p_click_count                 		NUMBER(10)		 DEFAULT 0		 NULL 
);


CREATE TABLE cart(
		cart_no                       		NUMBER(10)		 NULL ,
		cart_qty                      		NUMBER(10)		 DEFAULT 0		 NULL ,
		userId                        		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE cart_cart_no_SEQ;

CREATE SEQUENCE cart_cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER cart_cart_no_TRG
BEFORE INSERT ON cart
FOR EACH ROW
BEGIN
IF :NEW.cart_no IS NOT NULL THEN
  SELECT cart_cart_no_SEQ.NEXTVAL INTO :NEW.cart_no FROM DUAL;
END IF;
END;



ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (userId);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (userId) REFERENCES userInfo (userId);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

