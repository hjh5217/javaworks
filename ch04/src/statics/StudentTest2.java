package statics;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학번 자동 부여
		Student kim = new Student();
		System.out.println(kim.getStudentID());
		
		Student han = new Student();
		System.out.println(han.getStudentID());
		
		Student kang = new Student();
		System.out.println(kang.getStudentID());

	}

}
