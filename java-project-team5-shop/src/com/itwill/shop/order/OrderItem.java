package com.itwill.shop.order;

import com.itwill.shop.product.Product;

/*
이름     널?       유형         
------ -------- ---------- 
OI_NO  NOT NULL NUMBER(10) 
OI_QTY          NUMBER(10) 
O_NO            NUMBER(10) 
P_NO            NUMBER(10) 
 */
public class OrderItem {
	private int oi_no;
	private int oi_qty;
	private int o_no;
	private Product product;
}
