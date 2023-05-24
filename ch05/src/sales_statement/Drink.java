package sales_statement;

public class Drink {
	// 필드 , 상속관계 private 못씀
	protected String name;
	protected int price;
	protected int count;
	// 생성자
	public Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	// 판매 금액을 가져오는 메서드
	public int getTotalPrice() {
		// 금액 = 가격 x 수량;
		return price * count;
	}
	
	// 제목 출력 
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	// 내용 데이터 출력
	public void printData() {
		System.out.println(name+ "\t" + price + "\t" + count
				+ "\t" + getTotalPrice());
	}
	
}
