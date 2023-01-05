package com.itwill.shop.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(100) 
O_DATE           DATE          
O_PRICE          NYMBER(10) 
USERID           VARCHAR2(50)  
*/
public class Order {
	private int o_no;
	private String o_desc;
	private Date o_date;
	private int o_price;
	//FK
	private String userId;
	//List<OrderItem>
	private List<OrderItem> orderItemList;
	public Order() {
		orderItemList=new ArrayList<OrderItem>();
	}
	public Order(int o_no, String o_desc, Date o_date, int o_price, String userId) {
		this.o_no = o_no;
		this.o_desc = o_desc;
		this.o_date = o_date;
		this.o_price = o_price;
		this.userId = userId;
		this.orderItemList = new ArrayList<OrderItem>();
	}
	public int getO_no() {
		return o_no;
	}
	public String getO_desc() {
		return o_desc;
	}
	public Date getO_date() {
		return o_date;
	}
	public int getO_price() {
		return o_price;
	}
	public String getUserId() {
		return userId;
	}
	public List<OrderItem> getOrderList() {
		return orderItemList;
	}
	public void setO_no(int o_no) {
		this.o_no = o_no;
	}
	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public void setO_price(int o_price) {
		this.o_price = o_price;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setOrderList(List<OrderItem> orderList) {
		this.orderItemList = orderList;
	}
	@Override
	public String toString() {
		return "Order [o_no=" + o_no + ", o_desc=" + o_desc + ", o_date=" + o_date + ", o_price=" + o_price
				+ ", userId=" + userId + ", orderList=" + orderItemList + "]\n";
	}
	
}
