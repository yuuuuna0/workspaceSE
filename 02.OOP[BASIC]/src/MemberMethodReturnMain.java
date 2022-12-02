
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr= new MemberMethodReturn();
		int returnData1 = mmr.method1();
		System.out.println("\tmain block --> returnData1: "+returnData1);
		
		boolean returnData2 = mmr.method2();
		System.out.println("\tmain block --> returnData2: "+returnData2);
		
		int returnData3 = mmr.add(5981,646);
		System.out.println("\tmain block --> returnData3: "+returnData3);
		System.out.println("\tmain block -->returnData4: "+mmr.add(2,10));
		
		String name="김경호";
		String returnMessage1 = mmr.hello(name);
		//returnMessage1 --> 김경호님 안녕하세요!!
		System.out.println("\tmain block --> returnMessage1: "+returnMessage1);
		System.out.println("\tmain block --> returnMessage2: "+mmr.hello("정유나"));
		
		System.out.println("***************  setter메쏘드 호출  ***************");
		mmr.setMemberField1(777777777);
		mmr.setMemberField2(888888888);
		mmr.setMemberField3(999999999);
		
		
		System.out.println("***************  getter메쏘드 호출  ***************");
		System.out.println("------main block memberField값 출력------");
		/*
		 * System.out.println(mmr.memberField1); int memberField1=mmr.memberField1;
		 * System.out.println("memberField: "+memberField1);
		 */
		int returnMemberField1 = mmr.getMemberField1();
		System.out.println("returnMemberField1: "+returnMemberField1);
		System.out.println("returnMemberField2: "+mmr.getMemberField2());
		System.out.println("returnMemberField3: "+mmr.getMemberField3());
	}
}
