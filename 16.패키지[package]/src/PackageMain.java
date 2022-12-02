
public class PackageMain {

	public static void main(String[] args) {
		com.itwill.shop.ShopService shopservice = new com.itwill.shop.ShopService();
		System.out.println(shopservice);
		
		com.itwill.shop.member.Member m1= new com.itwill.shop.member.Member();
		System.out.println(m1);
		
		com.itwill.shop.member.MemberService memberService = new com.itwill.shop.member.MemberService();
		System.out.println(memberService);
		
		System.out.println("---------------con.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService--------------------");
		com.itwill.shop.product.Product product = new com.itwill.shop.product.Product();
		System.out.println(product);
		com.itwill.shop.product.ProductService productService=new com.itwill.shop.product.ProductService();
		System.out.println(productService);
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
	}

}
