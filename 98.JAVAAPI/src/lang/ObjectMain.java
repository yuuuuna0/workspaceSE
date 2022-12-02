package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 * <<Object>>
		 */
		Object o1=new Object();
		Object o2=new Object();
		Object o3=01;
		/*
		 * <<Object>>
		 * public String toString();
		   Return: a string representation of the object.
		 */
		String str1=o1.toString();
		System.out.println(str1);
		System.out.println(o2);
		
		/*
		 * <<Object>>
		 * public boolean equals(Object obj)
		 * 	- Indicates whether some other object is "equal to" this one.
		 * Parameter:
		 * 	obj: the reference object with which to compare.
		 * Return: true if this object is the same as the obj argument; false otherwise.
		 */
		if(o1.equals(o2)) {
			System.out.println("o1과 o1의 주소가 동일하다.");
		} else {
			System.out.println("o1과 o2의 주소가 동일하지 않다.");
		}
		
		if(o1.equals(o3)) {
			System.out.println("o1과 o3의 주소가 동일하다.");
		} else {
			System.out.println("o1과 o3의 주소가 동일하지 않다.");
		}
		
		System.out.println("-------------ObjectChild----------------");
		ObjectChild oc1=new ObjectChild();
		ObjectChild oc2=new ObjectChild();
		ObjectChild oc3=oc1;
		System.out.println("--- 상속 받은 Object.equals ---");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3의 주소가 동일하다.");
		}
		System.out.println("--- 상속받은 Object.toString==>재정의 ---");
		System.out.println(oc1.toString());
		System.out.println(oc2);
		System.out.println(oc3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
