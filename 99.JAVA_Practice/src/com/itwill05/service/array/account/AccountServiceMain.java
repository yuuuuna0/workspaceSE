package com.itwill05.service.array.account;

public class AccountServiceMain {

	public static void main(String[] args) {
		
		AccountService accountService=new AccountService();

		//<<과제아님>>
		System.out.println("0.AccountService객체야 Account 객체줄께추가해줘(배열사이즈증가)[OPTION]");
		Account newAccount1=new Account(1234,"JUNG",38900,1.9);
		accountService.addAccount(newAccount1);
		
		System.out.println("0.AccountService객체야 번호,이름,잔고,이율줄께 계좌객체추가해줘(배열사이즈증가)[OPTION]");
		accountService.addAccount(5678, "PARK", 54500, 2.2);
		
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(3333);
		accountService.findByNoPrint(7777);
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(50000);
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.findByIyulPrint(2.0);
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("KIM");
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(4444, 8200);
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(6666, 1600);
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountService.sortByBalanceAscending();;
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountService.sortByBalanceDescending();
		
		
		//<<과제아님>>
		System.out.println("10~11. AccountService객체야 번호,이름,잔고,이율 및 오름차순,내림차순 받아서 정렬해줘");
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC);
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		Account acc=new Account(5555,"JIM",12345,5.9);
		accountService.updateAccount(acc);
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		accountService.updateAccount(9999, "mIM", 52000, 8.2);
			
		
	}

}
