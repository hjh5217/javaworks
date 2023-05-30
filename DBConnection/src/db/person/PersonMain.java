package db.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		//PersonDAO 객체 생성
		PersonDAO dao = new PersonDAO();
		
		//Person 객체 생성
	//	Person p1 = new Person("test", "test1234", "tester", 30);
		
		//자료 삽입
	//	dao.insertPerson(p1);
		
		
		//자료 수정
		//수정할 사람 1명 가져오기
		Person cloud = dao.getPerson("cloud");
		cloud.setName("클라우드");
		cloud.setAge(50);
		
		//수정 실행
		dao.updatePerson(cloud);
		
		//자료 삭제
	//	dao.deletePerson("test");
		
		//자료 조회
//		ArrayList<Person> personList = dao.getList();
//		for(int i=0; i<personList.size(); i++) {
//			Person person = personList.get(i);
//			
//			String userid = person.getUserId();
//			String userpw = person.getUserPw();
//			String name = person.getName();
//			int age = person.getAge();
//			
//			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
//					userid, userpw, name, age);
//		}
	//	System.out.println("===================1명 검색===================");
		
		//1명 검색해서 출력하기
		Person person = dao.getPerson("cloud");
		
		String userid = person.getUserId();
		String userpw = person.getUserPw();
		String name = person.getName();
		int age = person.getAge();
		
		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
				userid, userpw, name, age);
	
	}

}
