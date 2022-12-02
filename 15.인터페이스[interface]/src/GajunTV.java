
public class GajunTV implements GajunOnOff, GajunVolume{
	public void operation1() {
		System.out.println("TV.operation1()");
	}
	public void operation2() {
		System.out.println("TV.operation2()");
	}
	@Override
	public void volumeUp() {
		System.out.println("TV.volumeUp()");
	}
	@Override
	public void volumeDown() {
		System.out.println("TV.volumeDown");
	}
	@Override
	public void on() {
		System.out.println("TV.on()");
	}
	@Override
	public void off() {
		System.out.println("TV.off");
	}
	
}
