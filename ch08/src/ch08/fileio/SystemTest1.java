package ch08.fileio;

public class SystemTest1 {

	public static void main(String[] args) {
		System.out.println("한 문자를 입력하고 [Enter] 를 누르세요");
		try {
			int readByte = System.in.read();
			System.out.println(readByte);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
