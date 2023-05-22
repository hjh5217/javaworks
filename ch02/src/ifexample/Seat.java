package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입장객 수 입력: ");
		int customer = sc.nextInt();
		
		System.out.println("좌석 열 수 입력: ");
		int colNum = sc.nextInt();
		int rowNum;
		
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		}else {
			rowNum = (int)(customer / colNum) + 1;
		}
		System.out.println(rowNum);
	}

}
