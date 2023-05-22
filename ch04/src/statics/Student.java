package statics;

public class Student {
	private static int serialNum = 1000;
	private int studentId;
	private String name;
	
	Student(){
		serialNum++;
		studentId = serialNum;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getStudentID() {
		return studentId;
	}
	void setStudentId(int studentid) {
		this.studentId = studentid;
	}
}
