import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRuntimeExceptionCatchMain2 {

	public static void main(String[] args) throws Exception /*IOException,ClassNotFoundException,SQLException*/{
		
		System.out.println("stmt1");
		try {
		//예외 발생 예상 코드(IOException)
		Socket socket = new Socket("www.daum.net",80);
		System.out.println("stmt2");

		//예외 발생 예상 코드(ClassNotFoundException)
		Class.forName("AClass");
		System.out.println("stmt3");
		
		//예외 발생 예상 코드(SQLException)
		DriverManager.getConnection("");
		System.out.println("stmt4");
		
		//예외 발생 예상 코드(ArithmeticException)
		int result = 3/0;
		System.out.println("stmt5");
		
		} catch(Exception e) {
			System.out.println("모든 예외를 한 곳에서 처리 --> msg:  "+e.getMessage());
			System.out.println("고객님 죄송합니다.");
			System.out.println("*******print stack trace**********");
			e.printStackTrace();
		}
		
		System.out.println("main end return");
		
	}

}
