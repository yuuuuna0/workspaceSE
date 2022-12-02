
public class DuoMember {
	private int no;			//회원번호
	private String name;	//회원이름
	
	public DuoMember() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 생성자 생성 단축키: alt+shift+s -> o
	 */
	public DuoMember(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(no+"\t"+name);
	}
	
	
	
	/*
	 * getter,setter 생성 단축키: alt+shift+s -> r
	 */
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
	
	
	
	
}
