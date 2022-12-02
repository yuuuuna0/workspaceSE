
public class GajunAudio implements GajunOnOff, GajunVolume {

	@Override
	public void volumeUp() {
		System.out.println("GajunAudio.volumeUp()");
	}

	@Override
	public void volumeDown() {
		System.out.println("GajunAudio.volumeDown()");
	}

	@Override
	public void on() {
		System.out.println("GajunAudio.on()");
	}

	@Override
	public void off() {
		System.out.println("GajunAudio.off()");
	}

}
