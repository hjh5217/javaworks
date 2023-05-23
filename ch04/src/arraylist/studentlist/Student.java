package arraylist.studentlist;

import java.util.ArrayList;

import arraylist.scorelist.Subject;

public class Student {

	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // 과목 객쳋 생성
		subject.setSubjectName(name);	// 과목 이름 입력
		subject.setScorePoint(score);	//점수 입력
		
		subjectList.add(subject); // 객체를 리스트에 저장
	}
	// 학생 정보 출력
	public void showInfo() {
		int total = 0;
		double avg = 0;
		for(int i =0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			total += subject.getScorePoint();
			System.out.printf("학생 %s의 %s 과목의 성적은 %d점 입니다.\n", 
					studentName,subject.getSubjectName(),subject.getScorePoint());
		}
		avg = (double)total / subjectList.size();
		System.out.printf("총점: %d점, 평균: %.2f점\n",total,avg);
		
	}
}
