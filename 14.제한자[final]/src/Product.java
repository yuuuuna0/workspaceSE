
public class Product {
	private int no;		//제품번호
	private String name;//제품이름
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + "]";
	}
	
}
