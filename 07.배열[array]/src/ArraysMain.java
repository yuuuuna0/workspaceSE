import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		String[] strArray1= {"one","two","three"};
		String[] strArray2= {"one","two","three"};
		
		System.out.println("1. 배열 내용 비교");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame=Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		System.out.println("2. 배열 원소 채우기(fill)");
		Arrays.fill(intArray1, 1);
		for(int e:intArray1) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("3. 배열 복사(기본형)");
		int[] intArray3=Arrays.copyOf(intArray2, intArray2.length+1);
		for(int e:intArray3) {
			System.out.print(e+" ");
		}
		System.out.println();
	
		Account[] accountArray= {
				new Account(1111, "LEE", 38000, 0.9), 
				new Account(2222,"LIM",58900,1.3),
				new Account(3333,"KIM",83200,1.7),
				new Account(4444,"PARK",72000,2.3),
				new Account(5555,"JUNG",12600,0.8),
				new Account(6666,"JUN",38200,5.2),
				new Account(7777,"CHOI",98900,3.3),
				new Account(8888,"HONG",12300,2.2),
				new Account(9999,"KWEON",85200,5.5)
		}; 
		System.out.println("3. 배열 복사(참조형)");
		Account[] newAccountArray=Arrays.copyOf(accountArray, accountArray.length+1);
		for (Account account : newAccountArray) {
			System.out.println(account);
		}
		
		Account[] descAccounts=new Account[accountArray.length+1];
		/*
		 * void java.lang.System.arraycopy(Object src(옮길 객체), int srcPos(옮길 객체의 시작 지점), Object dest(옮겨질 객체), int destPos(옮겨질 객체의 시작지점), int length(길이))
		 */
		System.arraycopy(accountArray, 0, descAccounts, 0, accountArray.length);
		
		for(Account account:descAccounts) {
			System.out.println(account);
		}
		
		System.out.println("4. sort[기본타입]");
		int[] scoreArray= {90,67,88,23,56,12,34};
		String[] nameArray= {"공경호","홍경호","JAMES","김경호","김경호"};
		/*
		Account[] accountArray= {
				new Account(1111, "LEE", 38000, 0.9), 
				new Account(2222,"LIM",58900,1.3),
				new Account(3333,"KIM",83200,1.7),
				new Account(4444,"PARK",72000,2.3),
				new Account(5555,"JUNG",12600,0.8),
				new Account(6666,"JUN",38200,5.2),
				new Account(7777,"CHOI",98900,3.3),
				new Account(8888,"HONG",12300,2.2),
				new Account(9999,"KWEON",85200,5.5)
		};
		*/
		Arrays.sort(scoreArray);
		for(int score:scoreArray) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.print(name+" ");
		}
		System.out.println();
		
		System.out.println("5. sort[일반 객체(Account)]");
		Arrays.sort(accountArray);
		/*
		 << Arrays.sort(accountArray) >>
		    - Account[] 안에있는 element(Account) 는 
		      반드시 Comparable interface를 구현해야한다.(안 하면 에러 발생)
		    
		    - Arrays.sort(accountArray)메쏘드 정렬메카니즘
		        A. 첫번째 객체와 두번째 객체를 Comparable 인터페이스타입으로 형변환한다.
			    B. 첫번째Account객체의 정렬기준필드(번호)의값과 
			       두번째Account객체의 정렬기준필드(번호)의값과 비교한다. 
			     		Account firstAccount=accountList.get(0);
			     		Account secondAccount=accountList.get(1);
			        	int result=firstAccount.getNo()-secondAccount.getNo();
			    C. 비교의 결과값 정수가 양수이면 첫번째와 두번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 첫번째와 두번째를 교환 안한다. 
			   
			    A. 두번째Account객체와 세번째Account객체를 비교한다. 
			     	Account secondAccount=accountList.get(1);
			    	Account thirdAccount=accountList.get(2);
			        int result=firstAccount.getNo()-secondAccount.getNo();
			    B. 비교의 결과값 정수가 양수이면 두번째와 세번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 두번째와 세번째를 교환 안한다. 
		 */
		
		Account.headerPrint();
		for (Account account : accountArray) {
			account.print();
		}
		
		System.out.println("5. sort[Account] - Comparator");
		System.out.println("------AccountBalanceDescComparator------");
		Arrays.sort(accountArray,new AccountBalanceDescComparator());
		for (Account account : accountArray) {
			account.print();
		}
		System.out.println("------AccountOwnerAscComparator------");
		Arrays.sort(accountArray,new AccountOwnerAscComparator());
		for (Account account : accountArray) {
			account.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
