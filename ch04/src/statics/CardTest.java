package statics;

public class CardTest {

	public static void main(String[] args) {
		// 카드 번호 101,102,103번 생성
		Card card101 = new Card();
		System.out.println(card101.getCardNum());
		
		Card card102 = new Card();
		System.out.println(card102.getCardNum());
		
		Card card103 = new Card();
		System.out.println(card103.getCardNum());
	}

}
