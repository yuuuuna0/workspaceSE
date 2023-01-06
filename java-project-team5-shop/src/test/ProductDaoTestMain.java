package test;

import com.itwill.shop.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao=new ProductDao();
		System.out.println("findByPrimaryKey >>"+productDao.findByPrimaryKey(1));
		System.out.println("findAll >>"+productDao.findAll());

	}

}
