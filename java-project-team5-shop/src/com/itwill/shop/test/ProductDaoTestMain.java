package com.itwill.shop.test;

import com.itwill.shop.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao=new ProductDao();
		System.out.println("findByPrimaryKey >>"+productDao.findByPrimaryKey(2));
		System.out.println("findAll >>"+productDao.findAll());
		
	}
}
