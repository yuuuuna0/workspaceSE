package generic;

public class MyArrayListMain {
	public static void main(String[] args) {
	
	MyArrayList<Account> myArrayList=new MyArrayList<Account>();
	myArrayList.add(new Account(1,"KIM",1000,0.1));
	myArrayList.add(new Account(2,"LEE",2000,0.2));
	myArrayList.add(new Account(3,"PARK",3000,0.3));
	myArrayList.add(new Account(4,"CHOI",4000,0.4));
	System.out.println("----------add------------");
	System.out.println("#list size: "+myArrayList.size());
	Account account=myArrayList.get(0);
	System.out.println(account);
	System.out.println("----------remove------------");
	Account removeAccount=myArrayList.remove(0);
	removeAccount.print();
	System.out.println("#list size: "+myArrayList.size());
	
	
	
	}
}
