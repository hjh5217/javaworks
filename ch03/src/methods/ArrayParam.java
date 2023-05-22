package methods;

public class ArrayParam {
	
	public static int add(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int result = add(numbers);
		double avg = (double)result / numbers.length;
		
		System.out.println("합계 : " + result);
		System.out.println("평균 : " + avg);
	}

}
