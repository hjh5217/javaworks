package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			// 메뉴 선택
			try {
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount(); // 계좌 생성
			}else if(selectNo == 2) {
				getAccountList(); // 계좌 목록
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
			}catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} // while끝

	} // main끝

	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------------------------------------");
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();
		System.out.println("초기 입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = new Account(ano,owner,balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
			
	}

	private static void getAccountList() {
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.print("계좌번호: "+ accountArray[i].getAno()+"\t");
				System.out.print("계좌주: "+ accountArray[i].getOwner()+"\t");
				System.out.println("잔액: "+ accountArray[i].getBalance());
			}
		}
		
	}
	
}// BankMain 끝.
