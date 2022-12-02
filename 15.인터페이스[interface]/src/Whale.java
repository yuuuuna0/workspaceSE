
public class Whale implements Mammalia{

	@Override
	public void operation1() {
		
	}

	@Override
	public void operation2() {
		
	}

	@Override
	public void operation3() {
		
	}
	public static void main(String[] args) {
		Whale whale=new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Mammalia mammalia=whale;
		mammalia.operation1();
		mammalia.operation2();
		mammalia.operation3();
		
	}

}
