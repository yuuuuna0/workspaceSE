
public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/**************case1**************/
		Account acc1 = new Account();
		acc1.headerPrint();
		/*
		 * - 1111번호 계좌 8000 입금 
		 */
		//1-1. 계좌 객체 생성
		//1-2. 계좌 데이터 대입
		System.out.println("\t---입금전---");
		acc1.setAccountData(1111, "KIM", 70000, 3.4);
		/*
		 * 2. 1111계좌 정보 출력
		 */
		acc1.print();
		
		//1-3. 계좌잔고 8000원 증가
		
		acc1.deposit(8000);
		System.out.println("\t---입금후---");
		acc1.print();
		//1-4. 계좌전고 300원 감소
		
		acc1.withdraw(300);
		System.out.println("\t---출금후---");
		acc1.print();
		
		
		
		/**************case2**************/
		/*
		 * - 은행 모든 계좌에 잔고 50원 증가
		 */
		/*
		 * 1-1. 전체계좌생성
		 * 1-2. 계좌데이터 대입
		 */
		Account a1= new Account();
		a1.setAccountData(1000, "Jeong", 15672, 1.1);
		Account a2= new Account();
		a2.setAccountData(2000, "Hwang", 14158, 2.2);
		Account a3= new Account();
		a3.setAccountData(3000, "Park", 44465, 3.3);		
		/*
		 * 1-3. 모든 계좌 잔고 50원 증가
		 */
		a1.deposit(50);
		a2.deposit(50);
		a3.deposit(50);
		/*
		 * 2. 은행 계좌 전체 정보 출력
		 */
		a1.headerPrint();
		a1.print();
		a2.print();
		a3.print();
		
	}

}
