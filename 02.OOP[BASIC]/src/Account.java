/*
 * 계좌객체를 생성하기위한 클래스(틀,타입)
 */
public class Account {
	/*
	 * 1. 속성[멤버필드(변수)]
	 */
	int no;			//계좌번호
	String owner;	//계좌주이름
	int balance;	//계좌 잔고
	double iyul;	//이율
	
	/*
	 * 2. 기능[멤버메쏘드]-계좌객체가 가지고 있는 기능
	 */
	//2-1.계좌 데이터를 초기값으로 대입하는 메쏘드
	void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//2-2 a. 입금
	void deposit(int money) {
		this.balance+=money;
	}
	//2-2 b. 출금
	void withdraw(int money) {
		this.balance-=money;
	}
	//2-4.계좌 헤더 출력
	void headerPrint() {
		System.out.println("---------------------------------");
		System.out.printf("%s\t  %s\t  %s\t  %s\t \n","번호","이름","잔고","이율");
		System.out.println("---------------------------------");
	}
	//2-3.계좌 객체 정보 출력
	void print() {
		System.out.printf("%d\t  %s\t  %d\t %5.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
}
