
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홍수 판별
		 */
		int number=23;
		switch (number%2) {
		case 0:
			System.out.println(number+" : 짝수");
			break;
		case 1:
			System.out.println(number+" : 홀수");
			break;
		}
		
		char direction='S';
		switch (direction) {
		case 'A':
		case 'a':
			System.out.println("move left~");
			break;
		case 'D':
		case 'd':
			System.out.println("move right~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~");
			break;
		case 'X':
		case 'x':
			System.out.println("move down~");
			break;
		case 'S':
		case 's':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move");
			break;
		}
		
		/*
		 * Quiz: 대소문자 구분 없이 X,x 실행하도록 해보세요
		 */
		
	}

}
