package generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMain {

	public static void main(String[] args) {
		/*
		 * Collections 클래스
		 * 		- Collection 객체들의 utility 메쏘드 제공
		 */
		List<Integer> intList= Arrays.asList(34,45,78,90,23,10,99,20);
		System.out.println("----sort[Integer]----");
		Collections.sort(intList);
		System.out.println(intList);
		System.out.println("----reverse[Integer]----");
		Collections.reverse(intList);
		System.out.println(intList);
		System.out.println("----shuffle[Integer]----");
		Collections.shuffle(intList);
		System.out.println(intList);
		
		System.out.println("************************************************");
		List<String> stringList=Arrays.asList("유재석","조세호","김경호","이효리","유재식");
		System.out.println("----sort[String]----");
		Collections.sort(stringList);
		System.out.println(stringList);
		System.out.println("----reverse[String]----");
		Collections.reverse(stringList);
		System.out.println(stringList);
		System.out.println("----shuffle[String]----");
		Collections.shuffle(stringList);
		System.out.println(stringList);
		
		System.out.println("************************************************");
		List<Account> accountList=Arrays.asList(new Account(4523,"BING",33000,0.5),new Account(2367,"KING",23000,0.1),new Account(1234,"KING",89000,0.2),new Account(8909,"YONG",99000,0.7),new Account(2789,"SAN",12000,0.3));
		System.out.println(accountList);
		System.out.println("----reverse[String]----");
		Collections.reverse(accountList);
		System.out.println(accountList);
		System.out.println("----shuffle[String]----");
		Collections.shuffle(accountList);
		System.out.println(accountList);
		System.out.println("--------------------sort[Comparable]-------------------");
		Collections.sort(accountList);
		System.out.println(accountList);
		System.out.println("--------------------sort[Comparator]-------------------");
		System.out.println(">>>>>balance descending");
		Collections.sort(accountList, new AccountBalanceDescComparator());
		System.out.println(accountList);
		System.out.println(">>>>>owner ascending");
		Collections.sort(accountList, new AccountOwnerAscComparator());
		System.out.println(accountList);
		
		
	}

}
