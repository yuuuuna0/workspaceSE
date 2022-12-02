
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account acc1=new Account();
		acc1.setAccountData(1111, "KIM", 89000, 1.5);
		//acc1 8000원 입금
		acc1.deposit(8000);
		acc1.headerPrint();
		acc1.print();
		//acc1 400원 출금
		acc1.withdraw(400);
		acc1.print();
		//acc1 이율 변경
		acc1.setIyul(3.6);
		//acc1 잔고 얻기
		//int acc1Balance=acc1.balance
		int acc1Balance=acc1.getBalance();
		System.out.println("acc1잔고: "+acc1Balance);
		System.out.println("acc1잔고: "+acc1.getBalance());
		acc1.headerPrint();
		acc1.print();
		
		
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		
		ac1.setAccountData(1000,"CHOI",89000,3.5);
		ac2.setAccountData(2000,"SIM",45000,2.5);
		ac3.setAccountData(3000,"LEE",12000,1.5);
		
		//모든 계좌 잔고 50원 증가
		ac1.deposit(50);
		ac2.deposit(50);
		ac3.deposit(50);
		/*
		 * 작동 안됨
		for(int i=0;i<=3;i++) {
			acc1.deposit(50);
		}
		*/
		ac1.headerPrint();
		ac1.print();
		ac2.print();
		ac3.print();
		/*
		 * 은행 총 잔고
		 */
		int totBalance = ac1.getBalance()+ac2.getBalance()+ac3.getBalance();
		System.out.println("은행 총 잔고: "+totBalance);
		System.out.println("은행 총 잔고: "+(ac1.getBalance()+ac2.getBalance()+ac3.getBalance()));
		
		
		
		
		
	}

}
