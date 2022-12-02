
public class GajunGumsa {
	/*
	 * private GajunTV gajuns1[];
	 * private GajunAudio gajuns2[];
	 * private GajunSmartPhone gajuns3[];
	 */
	private GajunOnOff[] gajuns;
	public GajunGumsa() {
	}
	public GajunGumsa(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gumsa() {
		for (GajunOnOff tempGajun : gajuns) {
			tempGajun.on();
			GajunVolume tempGajun2=(GajunVolume)tempGajun;
			tempGajun2.volumeUp();
			tempGajun2.volumeUp();
			tempGajun.off();
			System.out.println("----검사 종료 출고----");
		}
	}
}
