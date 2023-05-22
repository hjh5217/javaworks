package methods;

public class OneUp2 {

	static int x = 0;
	
	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		System.out.println(x);
	}

}
