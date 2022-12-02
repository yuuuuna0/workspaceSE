
public class IfNested {

	public static void main(String[] args) {
		
		/*
		 * 평점 계산 (A,B,C,D,F)
		 */
		int kor=89;
		char hakjum='F';	// 보통 초기 변수 선언 시 초기화 한 값을 입력 해 준다 (ex. boolean->flase/int->0/String->"")
		
		if (kor>=90 && kor<=100) {		//JAVA에서 조건문 시행 시 depth가 깊어지지 않도록 코딩한다.
			hakjum = 'A';
		} else {
			if (kor>=80 && kor<90) {
				hakjum = 'B';
			} else {
				if (kor>=70 && kor<80) {
					hakjum = 'C';
				} else {
					if (kor>=60 && kor<=70) {
						hakjum = 'D';
					} else {
						hakjum='F';
					}
				}
			}
		}

		System.out.printf("1. 학점은 %c 입니다.\n",hakjum);
		
		hakjum='X';
		if (kor>=90 && kor<=100) {
			hakjum='A';
		} else if(kor>=80 && kor<90) {
			hakjum='B';
		} else if(kor>=70 && kor<80) {
			hakjum='C';
		} else if(kor>=60 && kor<70) {
			hakjum='D';
		} else {
			hakjum='F';
		}
		System.out.printf("2. 학점은 %c 입니다.\n",hakjum);
		
	}

}
