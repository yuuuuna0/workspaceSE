
/*
		형변환--> 숫자형데이타간에만 가능 (char까지 포함)
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
 */
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환
		 */
		int i1 = 56;
		long l1 = i1;
		double d1 = l1;
		System.out.println(d1);
		/*
		 * 강제형변환
		 */
		double avgd = 89.6;
		int avgi = (int)avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		
		char c = '힣';
		int ci = c;
		System.out.println(ci);
		char c1 = (char)ci; 
		System.out.println(c1);
		
		/*
		 * 연산시의 형변환
		 * 		-연산항들 중에 가장 큰 타입으로 모든 항이 형변환된다.
		 */
		int ii=100;
		long ll=432156;
		double dd=0.12;
		double result = ii+ll+dd;
		System.out.println(result);
		
		
	}

}
