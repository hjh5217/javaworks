package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// 인터페이스는 객체 생성 안됨
		
		int x = 10, y= 0;
		MyCalulator calc = new MyCalulator();
		System.out.println(calc.add(x, y));
		System.out.println(calc.subtract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.divide(x, y));
	}

}
