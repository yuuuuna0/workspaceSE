
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("******************car1*******************");
		Car car1=new Car();
		car1.setIpchaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();
		System.out.println("******************car2*******************");
		Car car2=new Car("3456",15);
		car2.setOutTime(17);
		car2.calculateFee();
		car2.print();
		System.out.println("********금일 주차장 이용 차량 출력*******");
		Car c1=new Car("1212",1,12,1000);
		Car c2=new Car("3434",12,17,5000);
		Car c3=new Car("5656",6,9,3000);
		c1.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
		
		
		
	}

}
