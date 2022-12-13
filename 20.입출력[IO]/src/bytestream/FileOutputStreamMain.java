package bytestream;

import java.io.File;
import java.io.FileOutputStream;

/*
 * <<출력스트림(OutputStream)사용방법>>
 * 1. 데이타 목적지(target,destination) 선정(파일)
 * 2. 출력스트림(OutputStream)객체생성(FileOutputStream)
 * 3. 출력스트림(OutputStream)에 한바이트씩 쓴다(write)
 * 4. 출력스트림(OutputStream)닫는다.(close) 
 */
public class FileOutputStreamMain {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream(new File("src/bytestream/fileOut.dat"),true);
		/*
		 * public abstract void write(int b)throws IOException; 
		 * 		- Writes the specified byte to this output stream. 
		 * 		- The general contract for write is that one byte is written to the output stream. 
		 * 		- The byte to be written is the eight low-order bits of the argument 
		 * 			b. The 24 high-order bits of b are ignored
		 */
		/*
		 * 65 		-->00000000000000000000000001000001 
		 * 66 		-->00000000000000000000000001000010
		 * 67 		-->00000000000000000000000001000011 
		 * 21483649 -->1111111111111111111111111111111
		 */
		fos.write(65);
		fos.write(67);
		fos.write(0b00000000000000000000000001000011);
		fos.write(0b01111111111111111111111111111111);

		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}

		fos.close();
		System.out.println("FileOutputStream.write()-->fileOut.dat");

	}

}
