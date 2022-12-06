package bytestream.filterStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 자바의 기본 데이터를 출력스트림에 쉽게 쓸 수 있도록 하는 필터스트림클래스 
		 */
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("dataOut.dat"));
		int intData=214748647;
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(true);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바 입출력을 공부합니다.");
		dos.close();
		System.out.println("DataOutputStream.writeXXX() --> dataout.dat");
		/*
		 * 자바의 기본 데이터를 입력스트림으로부터 쉽게 읽을 수 있도록 하는 필터스트림클래스
		 */
		DataInputStream dis=new DataInputStream(new FileInputStream("dataOut.dat"));
		int readInt=dis.readInt();
		System.out.println("int: "+readInt);
		System.out.println("byte: "+dis.readByte());
		System.out.println("boolean: "+dis.readBoolean());
		System.out.println("char: "+dis.readChar());
		System.out.println("String: "+dis.readUTF());
		dis.close();
		
	}

}
