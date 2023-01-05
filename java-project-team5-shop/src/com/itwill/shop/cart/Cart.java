package com.itwill.shop.cart;
/*
 * 카트 안에 있는 한 개의 데이터
 */
/*
 * 이름       널? 유형           
-------- -- ------------ 
CART_NO     NUMBER(10)   
CART_QTY    NUMBER(10)   
USERID      VARCHAR2(50) 
P_NO        NUMBER(10)   
 */

import com.itwill.shop.product.Product;

public class Cart {
	private int cart_no;
	private int cart_qty;
	private String userid;	//FK
	//private int p_no;
	private Product product;	//객체지향적이게 멤버선언하기
	
	public Cart() {
	}

	public Cart(int cart_no, int cart_qty, String userid, Product product) {
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.userid = userid;
		this.product = product;
	}

	public int getCart_no() {
		return cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public String getUserid() {
		return userid;
	}

	public Product getProduct() {
		return product;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", userid=" + userid + ", product=" + product
				+ "]\n";
	}
	
	
	
}
