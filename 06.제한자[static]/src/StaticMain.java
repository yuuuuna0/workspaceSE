
public class StaticMain {

	public static void main(String[] args) {
		System.out.println("-------static member access---------");
		/*
		 * 정적멤버 접근
		 * 		-클래스이름.정적멤버이름
		 * 
		 */
		System.out.println(Static.static_field);
		Static.static_field=77;
		System.out.println(Static.static_field);
		Static.static_method();
		
		System.out.println("--------instance member access--------");
		Static static1=new Static();
		System.out.println(">>>>>static1객체 주소: "+static1);
		static1.instance_field=1111;
		System.out.println(static1.instance_field);
		static1.instance_method();
		
		Static static2=new Static();
		System.out.println(">>>>>static2객체 주소: "+static2);
		static2.instance_field=2222;
		System.out.println(static2.instance_field);
		static2.instance_method();
		
		/*
		System.out.println("--객체주소를 통해서 static member access--");
		//The static field Static.static_field should be accessed in a static way
		System.out.println(static1.static_field);
		System.out.println(static2.static_field);
		static1.static_method();
		static2.static_method();
		*/
		
		System.out.println("---static memeber access---");
		Static.static_field=999;
		System.out.println(Static.static_field);
		Static.static_method();
		
		
	}

}
