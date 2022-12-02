
public class IfScorePrintReturn {

	public static void main(String[] args) {
		
		int kor=-90;
		/*
		 * 점수 유효성 체크
		 */
		if(kor<0 || kor>100) {
			System.out.println(kor+"은 유효하지 않은 점수입니다.");
			return;
		}
		/*
		 * 평점 계산
		 */
		char hakjum='X';
		
		System.out.println("학점은 "+hakjum+" 입니다.");
		return;
	}

}
