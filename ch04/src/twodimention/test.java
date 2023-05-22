package twodimention;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String jumin,test;
		int parseJumin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (- 포함): ");
		jumin = sc.next();
		
		test = jumin.substring(jumin.lastIndexOf("-")+1);
		parseJumin = Integer.parseInt(jumin.substring(jumin.lastIndexOf("-")+1));
		System.out.println(parseJumin);
		System.out.println(jumin.length());
		System.out.println(test);
		System.out.println(test.length());
		if(jumin.length() == 14 || test.length() == 7) {
			
			
			
		}
		
	} // main
	
} // class
