package bytestream.filterStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception{
		PrintStream consolePrintOut=System.out;
		
		PrintStream filePrintOut = new PrintStream(new FileOutputStream("printStream.txt"));
		String str="프린트스트림을 공부합니다.";
		double d=3.141592;
		char c='힣';
		Object o=new Object();
		boolean isMarried=true;
		
		
		
		consolePrintOut.println(str);		//System.out.println(str);과 동일
		filePrintOut.println(str);
		consolePrintOut.println(d);
		filePrintOut.println(d);
		consolePrintOut.println(c);
		filePrintOut.println(c);
		System.out.println(o);
		filePrintOut.println(o);
		System.out.println(isMarried);
		filePrintOut.println(isMarried);
		System.out.println("---------PrintStream.println()-->console.printStream.txt");
		filePrintOut.println("---------PrintStream.println()-->console.printStream.txt");
		
		
		
	}

}
