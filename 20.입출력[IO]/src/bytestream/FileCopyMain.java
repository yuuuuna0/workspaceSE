package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{
		String fileName="kakaoTalk_Setup.exe";
		String copiedFileName= fileName.replace(".", "_copy.");
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(copiedFileName);
		
		int byteCount=0;
		int starCount=0;
		while(true) {
			int readByte=fis.read();
			if(readByte==-1)break;
			byteCount++;
			if(byteCount%(1024)==0) {
				System.out.print("★");
				starCount++;
				if(starCount%20==0) {
					System.out.println();
				}
			}
			fos.write(readByte);

		}
		System.out.println("FileCopy: "+byteCount+"bytes copy");
		fis.close();
		fos.close();
		
	}

}
