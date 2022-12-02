public class AcademyGangsa extends AcademyMember {
	private String subject;		//과목
	private AcademyGangsa() {
		super();
	}
	public AcademyGangsa(int no, String name, String subject) {
		super(no,name);
		this.subject=subject;
	}
	public void gangsaPrint() {
		this.print();
		System.out.println(this.subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
