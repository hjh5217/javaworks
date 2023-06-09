package ch08.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
	
		Writer fw = new FileWriter("data.txt");
		
		fw.write("hello~\n");
		fw.write("안녕~\n");
		fw.write(66);
		fw.write(66+1);
		
		char[] buf = {'s','m','i','l','e'};
		fw.write(buf);
		fw.write(10);
		fw.write(buf,1,4);
		
		fw.close();
		
		System.out.println("수행 완료!");

	}

}
