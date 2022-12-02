
public class IfScorePrint {

	public static void main(String[] args) {
		/*
		 * 점수의 유효성 체크
		 */
		int kor=90;
		
		if(kor>=0 && kor<=100) {
			/*
			 * 학점계산
			 */	
			char hakjum='X';
			if(kor>=90) {
				hakjum='A';
			}else if(kor>=80) {
				hakjum='B';
			}else if(kor>=70) {
				hakjum='C';
			}else if(kor>=60) {
				hakjum='D';
			}else {
				hakjum='F';
			}
			
			System.out.printf("학점은 %c입니다.\n",hakjum);
		} else {
			System.out.println(kor+"은 유효한 점수가 아닙니다.");
		}
		
		
		
		
	}

}
