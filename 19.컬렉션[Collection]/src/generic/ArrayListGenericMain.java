package generic;

import java.util.ArrayList;
import java.util.Iterator;

import nogeneric.Account;

public class ArrayListGenericMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		System.out.println("------------1.add(element)-------------");
		System.out.println("# list size: "+accountList.size());
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# list size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("------------2.add(index,element)-------------");
		accountList.add(2, new Account(3332,"KIM",99999,9.9));
		System.out.println("# list size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("------------3.set(index,element)-------------");
		accountList.set(0, new Account(1000,"NEW",52000,1.1));
		System.out.println("# list size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("------------4.get(index)-------------");
		Account getAccount=accountList.get(0);
		getAccount.print();
		System.out.println("# list size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("------------5.remove(index)-------------");
		Account removeAccount=accountList.remove(0);
		removeAccount.print();
		System.out.println("# list size: "+accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%       업무실행     %%%%%%%%%%%%%");
		System.out.println("*************1. 계좌 전체 출력*************");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		System.out.println();
		Account.headerPrint();
		for (Account account : accountList) {
			account.print();
		}
		
		System.out.println("*************2. 계좌번호 3333번 계좌 한 개 찾기*************");
		for (Account account : accountList) {
			if(account.getNo()==3333) {
				account.print();
				break;
			}
		}
		
		System.out.println("*************3. 계좌주이름 KING 계좌 여러개 찾기*************");
		for (Account account : accountList) {
			if(account.getOwner().equals("KING")) {
				account.print();
			}
		}
		
		System.out.println("*************4. 계좌번호 4444번 계좌 한 개 삭제*************");
		/***************enhanced for문 사용시 뭔가 좀 이상함 -> 더 찾아보기
		for (Account account : accountList) {
			if(account.getNo()==4444) {
				accountList.remove(account);
				
			}
			account.print();
		}
		*************************/
		Iterator<Account> accountIterator=accountList.iterator();
		while(accountIterator.hasNext()) {
			Account account=accountIterator.next();
			if(account.getNo()==4444) {
				accountList.remove(account);
				
			}
		}
		System.out.println(accountList);
		
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		
		System.out.println("*************5. 계좌이름 KING 계좌 여러개 삭제*************");
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getOwner().equals("KING")) {
				accountList.remove(i).print();
				i--;
			}
		}		
		
	}

}
