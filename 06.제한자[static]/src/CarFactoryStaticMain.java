
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car c1=new Car(1,"K3","RED");
		Car c2=new Car(12,"K5","GREEN");
		Car c3=new Car(13,"K7","BLUE");
		
		System.out.println("차량 총 생산 대수: "+Car.count);
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
	}

}
