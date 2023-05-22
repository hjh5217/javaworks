package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성(lee- 힙 메모리 영역 위치)
		Student lee = new Student();
		// 다른 클래스에서 private 이 붙은 변수는 접근할수 없다.
		lee.setName("이대한");
		lee.setStudentId(1001);
		System.out.println("이름: "+ lee.getName());
		System.out.println("학번: "+ lee.getStudentID());
	}

}
