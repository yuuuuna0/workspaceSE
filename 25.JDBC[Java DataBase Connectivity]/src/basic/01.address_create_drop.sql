//ddl이나 sql이나 확장자 바꿔도 영향 X

DROP TABLE address CASCADE CONSTRAINTS;

CREATE TABLE address(
		no                            		NUMBER(4)		 NULL ,
		name                          		VARCHAR2(50)		 NOT NULL,
		phone                         		VARCHAR2(50)		 NULL ,
		address                       		VARCHAR2(100)		 NULL 
);

DROP SEQUENCE address_no_SEQ;

CREATE SEQUENCE address_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

ALTER TABLE address ADD CONSTRAINT IDX_address_PK PRIMARY KEY (no);

