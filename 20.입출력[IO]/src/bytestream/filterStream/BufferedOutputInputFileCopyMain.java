package bytestream.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputFileCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("kakaoTalk_Setup.exe"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("kakaoTalk_Setup_copy2.exe"));
		
		int byteCount=0;
		int starCount=0;
		while(true) {
			int readByte=bis.read();
			if(readByte==-1)break;
			byteCount++;
			if(byteCount%1024==0) {
				System.out.print("★");
				starCount++;
				if(starCount%20==0) {
					
					System.out.println();
				}
			}
			bos.write(readByte);
			}
		bis.close();
		bos.close();
		System.out.println();System.out.println("BufferedOutputInputFileCopy"+byteCount+"byte copy!!");
		
		
	}

}
