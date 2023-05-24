package sales_statement;

public class Main {

	public static void main(String[] args) {
		// Drink 객체 생성
		System.out.println("============================");
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		Drink.printTitle();
		coffee.printData();
		tea.printData();

		System.out.println("============================");
		
		Alcohol soju = new Alcohol("소주", 4000 , 5, 15.5f);
		
		Alcohol.printTitle();
		soju.printData();
		
		//총 판매금액
		int total = coffee.getTotalPrice() + tea.getTotalPrice() + soju.getTotalPrice();
		
		System.out.print("\n============================");
		System.out.printf("\n*** 합계 금액 : %d원 ***", total);
		System.out.print("\n============================");
		
	}

}
