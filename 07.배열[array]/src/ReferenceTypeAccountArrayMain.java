
public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		System.out.println("---------------값 목록으로 배열 생성(Curly brace를 이용한 배열 생성)---------------");
		Account acc1=new Account(1111, "LEE", 38000, 0.9);
		Account[] accounts= {
				acc1, 
				new Account(2222,"LIM",58900,1.3),
				new Account(3333,"KIM",83200,1.7),
				new Account(4444,"PARK",72000,2.3),
				new Account(5555,"JUNG",12600,0.8),
				new Account(6666,"JUN",38200,5.2),
				new Account(7777,"CHOI",98900,3.3),
				new Account(8888,"HONG",12300,2.2),
				new Account(9999,"KWEON",85200,5.5)
		}; 
		
		System.out.println("1. 은행 총 계좌 수:"+accounts.length);
		System.out.println("2. 은행 계좌 전체 출력");
		Account.headerPrint();
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		System.out.println("3. 은행 계좌들 총 잔고");
		int totalBalance=0;
		for(int i=0;i<accounts.length;i++) {
			totalBalance+=accounts[i].getBalance();
		}
		System.out.println(">> "+totalBalance);
		System.out.println("4. 은행 계좌들 중에서 계좌번호 3333번 계좌 한 개 찾아서 출력(계좌번호는 중복되지 않는다.)");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5. 은행 계좌들 중에서 계좌잔고 50000원 이상인 VIP 계좌 여러개 찾아서 출력(enhanced for문 사용)");
		//enhanced for문
		for(Account tempAccount:accounts) {
			if(tempAccount.getBalance()>=50000) {
				tempAccount.print();
			}
		}
		System.out.println("5Q. 은행 계좌들 중에서  계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		for(Account account:accounts) {
			if(account.getIyul()>=2.0) {
				account.print();
			}
		}
		//System.out.println("6. 은행 계좌들 중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String 객체 배우고 난 후에]");
		System.out.println("7. 6666번 계좌에 3000원 입금");
		for(Account tempAccount:accounts) {
			if(tempAccount.getNo()==6666) {
				System.out.println(">> 입금 전");
				tempAccount.print();
				System.out.println(">> 입금 후");
				tempAccount.deposit(3000);
				tempAccount.print();
				break;
			}
		}
		System.out.println("7Q. 9999번 계좌에 3000원 출금[Quiz]");
		for(Account account:accounts) {
			if(account.getNo()==9999) {
				System.out.println(">>입금 전");
				account.print();
				System.out.println(">>입금 후");
				account.withdraw(3000);
				account.print();
			}
		}
		System.out.println("8. 계좌 잔고 순으로 오름차순 정렬 ");
		Account.headerPrint();
		
		
		System.out.println("####################정렬 전######################");
		for(Account tempAccount:accounts) {
			tempAccount.print();
		}
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				if(accounts[j].getBalance()>accounts[j+1].getBalance()) {
					Account tempAccount=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		System.out.println("####################정렬 후######################");
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		
		System.out.println("8Q.계좌 잔고 순으로 내림차순 정렬[Quiz]");
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				if(accounts[j].getBalance()<accounts[j+1].getBalance()) {
					Account tempAccount=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		System.out.println("8Q.계좌 번호 순으로 내림차순 정렬[Quiz]");
		for(int i=0;i<accounts.length-1;i++) {
			for(int j=0;j<accounts.length-1;j++) {
				if(accounts[j].getNo()<accounts[j+1].getNo()) {
					Account tempAccount=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		//System.out.println("8Q.계좌 이름 순으로 내림차순 정렬[String 클래스 배운 후에 추가]");
		System.out.println("9.5555번 계좌 한개 이율을 3.6으로 변경");
		for(Account account:accounts) {
			if(account.getNo()==5555) {
				account.print();
				account.setIyul(3.6);
				account.print();
				break;
			}
		}
		
		System.out.println("10. VIP계좌(잔고 50000원 이상) 여러개 잔고 50원 증가");		
		for(Account account:accounts) {
			if(account.getBalance()>=50000) {
				account.deposit(50);
				account.print();
			}
		}
		
		System.out.println("---------Account에 재정의 된 toString 메쏘드------------");
		for(Account account: accounts) {
			System.out.println(account);
		}
		
		System.out.println(accounts);
		System.out.println(accounts[accounts.length-1]);
		
		
		
		
		
		
		/********************OPTION***********************
		  1. accounts배열 객체에 새로생성한계좌객체 추가 
		  		A. accounts.length+1 개짜리 임시배열생성
		 		B. accounts의 모든계좌객체 임시배열로 이동
				C. 임시배열에 새로운  Account객체추가
		 		D. accounts에 임시배열주소대입
		 
		  2. accounts배열 객체에서 계좌번호 4444번계좌객체삭제
		  	 	A. accounts 에서 8888계좌찾아서 null대입
			 	B. accounts.length-1 개짜리 임시배열생성
			 	C. accounts null이아닌 모든계좌 임시배열로이동
			  	D. accounts 에 임시배열대입 
		****************************************************/	  	
		System.out.println("----------------------------Account객체추가----------------------------");
		Account[] addAccount = new Account[accounts.length+1];
		for(int i=0;i<accounts.length;i++) {
			addAccount[i]=accounts[i];
		}
		addAccount[addAccount.length-1]=new Account(1010, "JUNG", 72000, 1.1);
		for(int i=0;i<accounts.length;i++) {
			Account[] tempAccount=accounts;
			accounts=addAccount;
			accounts[i].print();
		}
		System.out.println("----------------------------Account객체삭제----------------------------");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getNo()==8888) {
				accounts[i]=null;
				break;
			}
		}
		Account[] delAccount=new Account[accounts.length-1];
		for(int i=0;i<delAccount.length;i++) {
			if(accounts!=null) {
				delAccount[i]=accounts[i];
			}
		}
		
		
	}

}
