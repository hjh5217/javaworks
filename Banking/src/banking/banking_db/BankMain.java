package banking.banking_db;

import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;
import banking.banking_db.AccountDAO;

public class BankMain {
	
	
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.삭제 | 6.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			// 메뉴 선택
			try {
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				dao.createAccount(); // 계좌 생성
			}else if(selectNo == 2) {
				dao.getAccountList(); // 계좌 목록
			}else if(selectNo == 3) {
				dao.deposit(); // 입금
			}else if(selectNo == 4) {
				dao.withDraw(); // 출금
			}else if(selectNo == 5) {
				dao.deleteAccount();
			}else if(selectNo == 6) {
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

}// BankMain 끝.
