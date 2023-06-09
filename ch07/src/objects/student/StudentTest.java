package objects.student;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		
		HashMap<Student, Integer> hashMap = new HashMap<>();
		
		hashMap.put(new Student("1"), 95);
		
		int score = hashMap.get(new Student("1"));
		System.out.println(score);
	}

}
