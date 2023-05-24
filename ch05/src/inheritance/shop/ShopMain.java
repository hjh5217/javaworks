package inheritance.shop;

public class ShopMain {

	public static void main(String[] args) {
		// Shop1 객체 생성
		Shop1 shop1 = new Shop1();
		shop1.sellDoenjangJjigae();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();

		System.out.println("==============================");
		
		// 부모 클래스의 탕비으로 객체 생성
		// 다형성으로 연결
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangJjigae();
		shop2.sellKimchiJJige();
		shop2.sellBibimBap();
		
		// 형변환
		int iNum = 10;
		float fNum = iNum; // 자동 형변환 > 왼쪽이 크면
		System.out.println(fNum); // 10.0
		
		iNum = (int)fNum;
		System.out.println(iNum); // 10
	}

}
