package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 * 	1. 생성자 호출 (명시적 생성)
		 * 	2. ""로 생성 (암시적 생성)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		String name3="KIM";
		String name4="KIM";
		
		
		if(name1!=name3) {
			System.out.println("name1!=name3");
		}
		
		System.out.println("-----------String 객체 내용 비교는 equals method를 사용해야 합니다.-----------------");
		/*
		 * << public boolean equals(String otherString) >>
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열은 동일하다.");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열은 동일하다.");
		}
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열은 동일하다.");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과 \"KIM\"객체의 문자열은 동일하다.");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과 \"KIM\"객체의 문자열은 동일하다.");
		}
		
		
		int uniCodeGap="aaa".compareTo("aaa");
		System.out.println(uniCodeGap);
		uniCodeGap="aaa".compareTo("aab");
		System.out.println(uniCodeGap);
		uniCodeGap="aab".compareTo("aaa");
		System.out.println(uniCodeGap);
		
		if("aaa".compareTo("aab")>0) {
			System.out.println("aaa,aab 교환[오름차순]");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
