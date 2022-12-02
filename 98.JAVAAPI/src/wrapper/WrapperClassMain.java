package wrapper;

/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
 */
public class WrapperClassMain {

	public static void main(String[] args) {

		System.out.println("-------------------Boxing, UnBoxing------------------------");
		/*
		 * Boxing[기본형-->Wrapper객체]
		 */
		Character wc = new Character('김');
		Integer wi = new Integer(1231);
		Double wd = new Double(3.141592);
		Boolean wb = new Boolean(true);
		/*
		 * UnBoxing[Wrapper객체-->기본형]
		 */
		char c1 = wc.charValue();
		int i1 = wi.intValue();
		double d1 = wd.doubleValue();
		boolean b1 = wb.booleanValue();
		System.out.println("-------------------AutoBoxing, AutoUnBoxing------------------------");
		/*
		 * AutoBoxing[기본형-->Wrapper객체]
		 */
		Character wc2 = '김';
		Integer wi2 = 1231;
		Double wd2 = 3.141592;
		Boolean wb2 = true;
		/*
		 * AutoUnBoxing[Wrapper객체-->기본형]		//자동으로 charValue()같은 method 호출됨
		 */
		char c2=wc2;
		int i2=wi2;
		double d2=wd2;
		boolean b2=wb2;
		
		System.out.println("**************AUTO BOXING*****************");
		int a=89;
		int b=45;
		int c=78;
		int d=90;
		int e=99;
		
		Integer ia=new Integer(a);
		Integer ib=b;
		Integer ic=c;
		Integer id=d;
		Integer ie=e;
	
		System.out.println("**************자동형변환*****************");
		Object oa=ia;
		Object ob=ib;
		Object oc=ic;
		Object od=id;
		Object oe=ie;
		
		System.out.println("**************AUTO BOXING,자동형변환*****************");
		Object ooa=89;		//89리터럴을 가진 Integer 객체의 주소갑을 ooa가 가지는 것
		Object oob=45;
		Object ooc=78;
		Object ood=90;
		Object ooe=99;
		
		System.out.println("*************Object[]*****************");
		Object[] scoreArray=new Object[5];
		scoreArray[0]=89;		//scoreArray[0]에는 Integer객체가 들어있다.
		scoreArray[1]=45;
		scoreArray[2]=78;
		scoreArray[3]=90;
		scoreArray[4]=99;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempScore=(Integer)scoreArray[i];
			int score=tempScore.intValue();
			System.out.print(score+" ");
			*/
			int score=(Integer)scoreArray[i];
			System.out.print(score+" ");
		}
		
		/*************Wrapper를 비교하는 행위는 사용하면 안됨, 반드시 Unboxing 해서 사용하는 것이 좋음, 주소값을 쓸 때도 있고 값을 비교할 때도 있어서 일관성이 없음*********************
		Integer wi11=new Integer(123);
		Integer wi22=new Integer(123);
		
		System.out.println();
		System.out.println(wi11==wi22);
		System.out.println(wi11.equals(wi22));
		System.out.println(wi11>=wi22);
		System.out.println(wi11<=wi22);
		System.out.println(wi11==wi22);
		**************************************************************************************************************************************************************************/
		
		

	}

}
