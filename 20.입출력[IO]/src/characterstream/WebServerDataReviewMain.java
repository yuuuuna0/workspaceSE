package characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebServerDataReviewMain {

	public static void main(String[] args) throws Exception {
		/****************html(text)***********************/
		URL urlStr=new URL("https://file3.instiz.net/data/file3/2018/01/30/9/a/3/9a39dc7f22d66e6167ea65933619bf34.gif");
		InputStream in=urlStr.openStream();
		FileOutputStream fout=new FileOutputStream("image.gif");
		while(true) {
			int readByte=in.read();
			if(readByte==-1)break;
			fout.write(readByte);
			//System.out.print((char)readByte);
		}
		
		in.close();
		fout.close();
		
		
	}

}
