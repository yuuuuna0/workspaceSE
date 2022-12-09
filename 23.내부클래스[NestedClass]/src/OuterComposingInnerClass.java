
public class OuterComposingInnerClass {
	public int outer_member_field;

	public void outer_member_method() {
		System.out.println("OuterComposingInnerClass.outer_member_method()");
	}

	/******************* Outer클래스에서 Inner클래스 사용 ************************/
	public void outer_inner_class_use() {
		// local
		int local_variable = 100;
		/**************************** member inner class[CASE1]************************ ParentFirstConcreteClass
		 * childFirstConcreteClass=new ParentFirstConcreteClass(); //익명클래스 Anonymous
		 * class childFirstConcreteClass.local_inner_outer_access();
		 ******************************************************************************/
		/*
		 << 특정 클래스의 메쏘드를 재정의해야할 때 >>
		 	1. local 위치에서 이름이 존재하지 않는 클래스를 정의
		 	2. local 위치(?)에서 객체를 생성
		 */
		/**************************** ananymous local inner class[CASE2]******************************/
		ParentFirstConcreteClass childConcreteClass = new ParentFirstConcreteClass() {			//자식타입이 존재하지 않음
			@Override
			public void local_inner_outer_access() {
				System.out.println(
						"ParentFirstConcreteClass를 상속받는 이름 없는 로컬 내부 클래스에서 재정의한 local_inner_outer_access()");
			}
		};
		childConcreteClass.local_inner_outer_access();
		
		ParentSecondAbstractClass childAbstractClass = new ParentSecondAbstractClass() {
			
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentSecondAbstractClass를 이름 없는 클래스에서 재정의 한 local_inner_outer_access()");
			}
		};
		
		childAbstractClass.local_inner_outer_access();
		
		ParentThirdInterface childThirdInterface=new ParentThirdInterface() {
			
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentThirdInterface를 상속받은(구현한) 이름 없는 클래스에서 재정의 한 local_inner_outer_access()");
			}
		};
		childThirdInterface.local_inner_outer_access();
		
		
		Object oc=new Object() {
			@Override
			public String toString() {
				return "난 재정의 된 toString";
			}
		};
		System.out.println(oc);
		
	}	//end method

	/******
	 * ParentFirstConcreteClass 상속받고 public void local_inner_outer_access()메쏘드를
	 * 재정의하는 Inner클래스
	 ********/
	/****************************
	 * member inner class[CASE1]************************ public class
	 * ChildFirstConcreteClass extends ParentFirstConcreteClass{
	 * 
	 * @Override public void local_inner_outer_access() {
	 *           System.out.println("ParentFirstConcreteClass를 상속받는
	 *           ChildFirsrConcreteClass에서 재정의한 local_inner_outer_access()"); } }
	 *******************************************************************************/

	public static void main(String args[]) {
		OuterComposingInnerClass outetCoposingInnerClass = new OuterComposingInnerClass();
		outetCoposingInnerClass.outer_inner_class_use();
	}

}
