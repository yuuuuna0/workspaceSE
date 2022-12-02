
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */
		int no1 = 51;
		
		if (no1%2==0) {
			System.out.printf("%d 는 %s입니다.\n",no1,"짝수");	//%d(decimal)에 선언한 int가 들어가고 %s(string)에 선언한 문자열이 들어감
		} else {
			System.out.printf("%d 는 %s입니다.\n",no1,"홀수");	//%d_int, %s_string, %c_char, %f_double
		}

		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if (no2%2 == 0) {
			System.out.printf("%d는 4의 배수\n",no2);	// \n은 줄바꿈
		} else {
			System.out.printf("%d는 4의 배수 아님\n",no2);
		}
		
		/*
		 * 정수의 유효성 체크
		 */
		int kor = -90;
		if (kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한 점수입니다.\n",kor);
		} else {
			System.out.printf("%d는 유효한 점수가 아닙니다.\n",kor);
		}
		
		/*
		 * 윤년 여부 출력
		 */
		int year = 2022;
		String msg = " ";	//char는 '' 안 문자 기술해야 하지만 String은 "" 안 문자열 기술하지 않아도 된다.
		if ((year%4==0&&year%100!=0)||year%400==0) {
			msg = "윤년";
		}else {
			msg = "평년";
		}
		System.out.printf("%d는 %s 입니다.\n",year,msg);
		
		/*
		 * 공배수
		 */
		int no3 = 45;
		if(no3%3==0 && no3%4==0) {
			System.out.printf("%-10d는 3과 4의\t공배수입니다.\n",no3);	//\t는 탭만큼 띄어쓰기, %*d에서 *는 해당 수 만큼 자릿수(빈칸)을 가짐(플마 가능), %.2f는 소수점 이하 둘째자리까지 나옴
		}else {
			System.out.printf("%10d는 3과 4의\t공배수가 아닙니다.\n",no3);
		}
		
		/*
		 * 문자 판단
		 */
		char c = 'X';
		if(c>='A' && c<='Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n",c);
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.printf("%c는 숫자 형태의 문자입니다.\n",c);
		}
		
		/*
		  Quiz:
		 	다음문자는 아이디의 첫글자입니다. 
		 	이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   		- 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter = '*';
		if((idFirstLetter>='A'&& idFirstLetter<='Z') || (idFirstLetter>='a'&& idFirstLetter<='z')) {
			System.out.printf("%c는 첫 글자로 유효한 문자입니다.\n",idFirstLetter);
		}else {
			System.out.printf("%c는 첫 글자로 유효하지 않은 문자입니다.\n",idFirstLetter);
		}
		
	}

}
