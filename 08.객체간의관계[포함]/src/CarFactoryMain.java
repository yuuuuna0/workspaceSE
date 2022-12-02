
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*
		Engine audiEngine=new Engine();
		audiEngine.type="a";
		audiEngine.cc=3000;
		
		Car audiCar=new Car();
		audiCar.no=1234;
		audiCar.model="AUDI";
		audiCar.engine=audiEngine;
		System.out.println(audiCar.no+"\t"+audiCar.model+"\t"+audiCar.engine.type+"\t"+audiCar.engine.cc);
		*/
		
		//아래의 엔진 내용 선언 작업 잘 안해줌 -> 아래와 같이 선언하기보다 다음 단락의 audiEngine이 들어가는 곳에 new Engine("A",3000)으로 선언 해줌.
		Engine audiEngine=new Engine();
		audiEngine.setType("A");
		audiEngine.setCc(3000);
		
		Car audiCar=new Car();
		audiCar.setNo(1234);
		audiCar.setModel("AUDI");
		audiCar.setEngine(audiEngine);
		
		audiCar.print();
		
		
		//main블록에서는 Engine 객체로 서술하기보단 Car 객체(최종제품)로 서술하는것이 일반적
		System.out.println("-----차량 엔진 검사-----");
		Engine returnEngine=audiCar.getEngine();
		returnEngine.print();
		System.out.println();
		
		Car benzCar=new Car(8899,"지바겐",new Engine("Y",5000));
		benzCar.print();
		System.out.println("-----차량 엔진 검사-----");
		benzCar.getEngine().print();
		
	}

}
