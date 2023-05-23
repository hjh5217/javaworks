package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//기본적으로 10개의 공간이 생성
		ArrayList<String> cartList = new ArrayList<>();

		//자료 저장
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("커피");
		
		System.out.println(cartList.size());
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		System.out.println("===============================");
		
		for(int i = 0; i<cartList.size(); i++) {
			//System.out.println(cartList.get(i));
			String cart = cartList.get(i);
			System.out.println(cart);
		}
		System.out.println("===============================");
		
		//요소 수정
		cartList.set(0, "라면");
		
		//요소 삭제
		cartList.remove("라면");
		
		for(String cart : cartList)
			System.out.println(cart);
	}

}
