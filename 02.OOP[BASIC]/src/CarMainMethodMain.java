

public class CarMainMethodMain {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램 시작
		 */
		Car car1;			//차 객체의 주소값을 저장할 Car타입 참조(주소)변수 선언
		car1 = new Car();	//Car클래스를 사용해서 차객체를 힙메모리에 생성 후 차 객체의 주소값이 car1참조(주소)변수 대입
		
		/*
		 * 1. 차량번호 1234 차량 12시 입차
		 */
		car1.setIpchaData("1234", 12);
		
		/*
		 * 2. car1차량 16시 출차
		 */
		//2-1. 출차시간 대입 \
		car1.setOutTime(16);
		//2-2. 주차요금 계산
		car1.calculateFee();
		//2-3. 주차요금영수증출력 
		car1.print();
		
	}

}
