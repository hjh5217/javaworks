package objectarray;

public class DogMain {

	public static void main(String[] args) {
		// 강아지 3마리 생성하기
		Dog[] dogArray = new Dog[3];
		
		dogArray[0] = new Dog();
		dogArray[0].setDogName("백구");
		dogArray[0].setType("진돗개");
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getType());

	}

}
