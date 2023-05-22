package input;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.print("당신의 나이는 몇 세입니까? ");
		int age = scanner.nextInt();
		System.out.println(age);
		
		scanner.close();
		
		
	}

}
