
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	int memberField1;
	char memberField2;
	double memberField3;
	/*
	 * 멤버메쏘드[기능]
	 */
	//1. 객체의 멤버필드에 데이터를 대입
	void setMemberField(int memberfield1,char memberfield2,double memberfield3) {
		this.memberField1=memberfield1;		//멤버필드와 로컬변수 명명을 동일하게 한다.(관례)
		this.memberField2=memberfield2;
		this.memberField3=memberfield3;
	}
	
	//2. 객체의 멤버필드의 내용을 출력하는 메쏘드
	void print() {
		/*
		 * this: 
		 * 		- self 참조변수
		 * 		- void print()메쏘드를 가지고 있는 객체의 주소값
		 * 		- this는 생략이 가능
		 */
		System.out.println("출력");
		System.out.println("mmt.print()메쏘드 안에서 this: "+this);
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3);
	}
	
	
}
