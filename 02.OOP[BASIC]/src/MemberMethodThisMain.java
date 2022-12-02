
public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();	//mmt1은 로컬변수이고 주소값으로는 참조변수이다
		/*
		 * mmt1.memberField1=1;
		   mmt1.memberField2='A';
		   mmt1.memberField3=95.4;
		*/
		mmt1.setMemberField(1, 'A', 95.4);
		
		/*********case1*************
		 * MemberMethodThis 객체 내용 출력
		 System.out.println(mmt1.memberField1+"\t"+mmt1.memberField2+"\t"+mmt1.memberField3);
		*/
		
		/*********case2*************
		/*
		 * MemberMethodThis 객체 내용 출력 메쏘드 호출
		 */
		System.out.println("main block --> mmt1의 주소값: "+mmt1);
		mmt1.print();

		MemberMethodThis mmt2 = new MemberMethodThis();	//mmt1은 로컬변수이고 주소값으로는 참조변수이다
		/*
		mmt2.memberField1=2;
		mmt2.memberField2='F';
		mmt2.memberField3=56.89;
		*/
		System.out.println("main block --> mmt2의 주소값: "+mmt2);
		mmt2.setMemberField(2, 'F', 56.89);
		mmt2.print();
		
	}

}
