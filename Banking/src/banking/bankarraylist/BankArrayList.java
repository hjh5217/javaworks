package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;

public class BankArrayList {
	// 통장 계좌를 만들 ArrayList 생성
	static ArrayList<Account> accountList = new ArrayList<>();
	
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
				deposit(); // 입금
			}else if(selectNo == 4) {
				withDraw(); // 출금
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
		boolean createAccount = true;
		while(createAccount) {
			System.out.println("-------------------------------------------");
			System.out.println("계좌를 생성합니다.");
			System.out.println("-------------------------------------------");
			System.out.println("계좌번호: ");
			String ano = scanner.nextLine();
			Account account = findAccount(ano);
			if(account != null && account.getAno().equals(ano)) {
				System.out.println("이미 존재하는 계좌번호 입니다. 다시 입력해 주세요.");
			}else {
				System.out.println("계좌주: ");
				String owner = scanner.nextLine();
				System.out.println("초기 입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				Account account2 = new Account(ano,owner,balance);
				accountList.add(account2);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}	
		}
	} // 계좌 생성 끝

	private static void getAccountList() {
		for(int i = 0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호: "+ account.getAno()+"\t");
			System.out.print("계좌주: "+ account.getOwner()+"\t");
			System.out.println("잔액: "+ account.getBalance());
			
		}
		
	}
	
	private static Account findAccount(String ano) {
		Account account = null; // 빈 계좌 선언
		
		for(int i = 0; i<accountList.size(); i++) {
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);
				break;
			}
		}
		return account;
	}
	
	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.println("계좌번호: ");
			String ano = scanner.nextLine();
			if(findAccount(ano) != null) {
				System.out.println("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				Account account = findAccount(ano);
				account.setBalance(account.getBalance() + money);
				break;
			}else {
				System.out.println("계좌번호를 확인해주세요.");
			}
		}
	}
	
	private static void withDraw() {
		boolean withDraw = true;
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		while(withDraw) {
			System.out.println("계좌번호: ");
			String ano = scanner.nextLine();
			if(findAccount(ano) != null) {
				while(true) {
					System.out.println("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					Account account = findAccount(ano);
					if(account.getBalance() > money) {
						account.setBalance(account.getBalance() - money);
						System.out.println("출금이 완료 되었습니다. 잔액: "+ account.getBalance()+"원");
						withDraw = false;
						break;
					}else {
						System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
					}
				}
			}else {
				System.out.println("계좌번호를 확인해주세요.");
			}
		}
	} // 출금 끝
}// BankMain 끝.
