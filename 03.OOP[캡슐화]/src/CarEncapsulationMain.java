
public class CarEncapsulationMain {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.setIpchaData("1234", 12);
				
		car1.setOutTime(16);
		car1.calculateFee();
		car1.print();
		
		/*
		 * car1객체의 주차요금
		 */
		System.out.println("car1의 주차요금: "+car1.getFee());
		/*
		 * car1객체의 주차요금 대입
		 */
		car1.setFee(0);
		car1.print();
	}

}
