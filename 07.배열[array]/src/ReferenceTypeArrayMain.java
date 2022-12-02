
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a=345;
		Account acc=new Account(8989, "SIM", 56000, 3.2);
		int[] ia=new int[5];
		ia[0]=23;
		*/
		Account[] accArray=new Account[5];
		accArray[0]=new Account(11111, "KIM", 50000, 2.3);
		accArray[1]=new Account(22222, "LIM", 87000, 1.8);
		accArray[2]=new Account(33333, "JUNG", 69200, 0.9);
		accArray[3]=new Account(44444, "PARK", 25900, 1.8);
		accArray[4]=new Account(55555, "CHOI", 42300, 3.5);
		
		Account.headerPrint();
		for(int i=0;i<accArray.length;i++) {
			accArray[i].print();
		}
	}

}
