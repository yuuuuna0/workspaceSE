package generic;
/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀) -> 객체 생성 가능
 * 2. Car 객체의 주소를 저장할 수 있는 타입 -> 선언 가능
 */
/**
 * 주차장에서 차 객체를 생성할 클래스(틀)
 * @author JEONG
 * @version 1.0
 */
public class Car {
	/*
	 * (암기하기)
	 * 클래스의 구성요소
	 *  1. 멤버필드(변수)[속성]	: 차 객체의 속성 데이터를 저장할 변수
	 *  2. 멤버메쏘드[기능]		: 차 객체가 외부에 제공하는 기능
	 */
	
	/*
	 * 멤버필드[속성]
	 */
	private String no;		//차량번호
	private int inTime;		//입차시간
	private int outTime;	//출차시간
	private int fee;		//주차요금

	/*
	 * 생성자메쏘드[초기화]
	 */
	//1-1.초기 멤버필드 값이 기본값인 차 객체 생성
	/**
	 * 초기값을 가진 차 객체 생성
	 */
	public Car() {
		
	}
	//1-2. 차량번호, 입차시간을 인자로 받은 값이 초기 멤버필드 값인 객체 생성
	/**
	 * 입차데이터 값으로 초기화 된 멤버필드를 가진 차 객체 생성
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
	public Car(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	//1-3. 차량의 모든 멤버데이터를 인자로 받은 값이 초기 멤버피드 값인 객체 생성
	/**
	 * 매개변수로 초기화된 차 객체 생성
	 * @param no 차량번호
	 * @param inTime 입차시간
	 * @param outTime 출차시간
	 * @param fee 주차요금
	 */
	public Car(String no,int inTime, int outTime, int fee) {
		this.no=no;
		this.inTime=inTime;
		this.outTime=outTime;
		this.fee=fee;
	}
	
	
	/*
	 * 멤버메쏘드[기능]
	 */
	//1.차량 입차 -> 번호, 시간 대입
	/**
	 * 입차 시 입차 데이터 대입메쏘드
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
	public void setIpchaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	//2-1.차량 출차 
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	//2-2 주차요금 계산
	/**
	 * 주차요금 계산
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	//2-3. 헤더정보 출력
	public static void headerPrint() {
		System.out.println("----------------------------------------");
		System.out.printf("%s  %s  %s  %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("----------------------------------------");
	}
	//2-4. 차량정보 출력
	public void print() {
		System.out.printf("%6s  %7d  %8d  %9d\n",this.no,this.inTime,this.outTime,this.fee);
	}
	
	/*
	 * setter,getter 메쏘드 자동 생성 단축키
	 * alt+shift+a -> r
	 */
	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	/**
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Car [no=" + no + ", inTime=" + inTime + ", outTime=" + outTime + ", fee=" + fee + "]";
	}
	
	
}
