package arraylist.scorelist;

public class Student {

	int studentId;
	String studentName;
	Subject korean = new Subject();
	Subject math = new Subject();
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	//국어 성적 입력 메서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	//수학 성적 입력 메서드
		public void mathSubject(String name, int score) {
			math.setSubjectName(name);
			math.setScorePoint(score);
		}
	//학생 정보 출력
	public void showInfo() {
		System.out.printf("학생 %s의 국어 성적은 %d점이고, 수학 성적은 %d점 입니다.\n",
				studentName, korean.getScorePoint(), math.getScorePoint());
		
	}
}	
