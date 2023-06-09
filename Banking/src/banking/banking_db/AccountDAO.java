package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;
import banking.banking_db.common.JDBCUtil;

public class AccountDAO {
	//전역변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
			
	Scanner scanner = new Scanner(System.in);

	// 계좌 생성
	
	public void createAccount() {
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
				
				conn = JDBCUtil.getConnection();
				String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate();
					System.out.println("결과 : 계좌가 생성되었습니다.");
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					JDBCUtil.close(conn, pstmt);
				}				
				break;
			}	
		}
	} // 계좌 생성 끝 

	public void getAccountList() {
		ArrayList<Account> accountList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { // 자료가 있으면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			//화면 출력
			for(int i = 0; i<accountList.size(); i++) {
				Account account = accountList.get(i);
				System.out.print("계좌번호: "+ account.getAno()+"\t");
				System.out.print("계좌주: "+ account.getOwner()+"\t");
				System.out.println("잔액: "+ account.getBalance());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
	}
	
	// 계좌 검색(계좌 1개 가져오기)
	public Account findAccount(String ano) {
		Account account = null; // 빈 계좌 선언
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
	
	public void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		while(true) {
			System.out.println("메뉴로 돌아가려면 2를 입력해 주세요.");
			System.out.println("계좌번호: ");
			String ano = scanner.nextLine();
			if(ano.equals("2")) {
				System.out.println("메뉴로 돌아갑니다.");
				break;
			}else {
				if(findAccount(ano) != null) {
					System.out.println("입금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					Account account = findAccount(ano);
					String owner = account.getOwner();
					int banlance = account.getBalance() + money;
					
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";				
					try {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, owner);
						pstmt.setInt(2, banlance);
						pstmt.setString(3, ano);
						pstmt.executeUpdate();
						System.out.printf("결과 : %d원 정상 입금 되었습니다.\n", money);															
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						JDBCUtil.close(conn, pstmt);
					}
					break;
				}else {
					System.out.println("계좌번호를 확인해주세요.");
				}
			}
			
		}
	}
	
	public void withDraw() {
		boolean withDraw = true;
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		while(withDraw) {
			System.out.println("메뉴로 돌아가려면 2를 입력해 주세요.");
			System.out.println("계좌번호: ");
			String ano = scanner.nextLine();
			if(ano.equals("2")) {
				System.out.println("메뉴로 돌아갑니다.");
				withDraw = false;
			}else {
				if(findAccount(ano) != null) {
					while(true) {
						System.out.println("출금액: ");
						int money = Integer.parseInt(scanner.nextLine());
						Account account = findAccount(ano); // 입력한 계좌 가져옴
						String owner = account.getOwner();
						int balance = account.getBalance() - money;
						
						if(account.getBalance() > money) {
							conn = JDBCUtil.getConnection();
							String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";	
							try {
								pstmt = conn.prepareStatement(sql);
								pstmt.setString(1, owner);
								pstmt.setInt(2, balance);
								pstmt.setString(3, ano);
								pstmt.executeUpdate();
								System.out.println("결과 : 정상 처리 되었습니다.");	
								System.out.println("출금이 완료 되었습니다. 잔액: "+ balance +"원");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							
							
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
			
		}
	} // 출금 끝 
	
	public void deleteAccount() {
		boolean deleteAccount = true;
		while(deleteAccount) {
			System.out.println("-------------------------------------------");
			System.out.println("계좌를 삭제합니다.");
			System.out.println("-------------------------------------------");
			System.out.println("메뉴로 돌아가려면 2를 입력해 주세요.");
			System.out.println("계좌번호: ");			
			String ano = scanner.nextLine();
			if(ano.equals("2")) {
				System.out.println("메뉴로 돌아갑니다.");
				deleteAccount = false;
			}else {
				Account account = findAccount(ano);
				if(account != null && account.getAno().equals(ano)) {
					conn = JDBCUtil.getConnection();
					String sql = "DELETE FROM account WHERE ano = ?";
					try {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						pstmt.executeUpdate();
						System.out.println("결과 : 계좌가 삭제되었습니다.");
					}catch(SQLException e) {
						e.printStackTrace();
					}finally {
						JDBCUtil.close(conn, pstmt);
					}				
					break;
				}else {							
					System.out.println("존재하지 않는 계좌번호 입니다. 다시 입력해 주세요.");
				}	
			}			
		}
	}
	
}//DAO 끝
