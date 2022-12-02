import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
*/
import com.itwill.shop.member.*;
/*
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
*/
import com.itwill.shop.product.*;

/*
<< The import com.itwill.shop.admin.Product collides with another import statement >>
import com.itwill.shop.admin.Product;
패키지를 제외한 클래스이름이 동일한클래스는 둘다 import가 불가능하다
*/
public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 *<<자동 import 단축키>>
		 * ctrl+shift+O 
		 */
		ShopService shopservice = new ShopService();
		System.out.println(shopservice);
		
		Member m1= new Member();
		System.out.println(m1);
		
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("---------------con.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService--------------------");
		Product product = new Product();
		System.out.println(product);
		ProductService productService=new ProductService();
		System.out.println(productService);
		Product adminProduct=new Product();
		System.out.println(adminProduct);
		ProductService adminProductService = new ProductService();
		System.out.println(adminProductService);
	}

}
