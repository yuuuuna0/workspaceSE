
public class Car {
	/*
	 * count: 차량의 전체 생산 대수를 저장할 static(공용)변수
	 */
	/**
	 * 차량 전체 생산 대 수
	 */
	public static int count=0;;
	
	private int no;				//차량번호
	private String model;		//차량 모델명
	private String color;		//차량 색상
	
	public Car(int no,String model,String color) {
		this.no=no;
		this.model=model;
		this.color=color;
		Car.count++;
	}

	public static void headerPrint() {
		System.out.println("-----------------------");
		System.out.println("번호\t모델\t색상");
		System.out.println("-----------------------");
	}
	public void print() {
		System.out.println(no+"\t"+model+"\t"+color);
	}

	public int getNo() {
		return no;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
