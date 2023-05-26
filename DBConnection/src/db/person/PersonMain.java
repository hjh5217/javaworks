package db.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		//PersonDAO 객체 생성
		PersonDAO dao = new PersonDAO();
		
		//Person 객체 생성
		Person p1 = new Person("sky", "ksy1234", "강하늘", 30);
		
		//자료 삽입
		//dao.insertPerson(p1);
		
		//자료 수정
		//수정할 사람 1명 가져오기
		Person tester = dao.getPerson("test");
		tester.setName("테스터");
		tester.setAge(100);
		
		//수정 실행
		dao.updatePerson(tester);
		
		//자료 삭제
		dao.deletePerson("test");
		
		//자료 조회
		ArrayList<Person> personList = dao.getList();
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			
			String userid = person.getUserId();
			String userpw = person.getUserPw();
			String name = person.getName();
			int age = person.getAge();
			
			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
					userid, userpw, name, age);
		}
		System.out.println("====================================================");
		
		//1명 검색해서 출력하기
		Person person = dao.getPerson("today");
		
		String userid = person.getUserId();
		String userpw = person.getUserPw();
		String name = person.getName();
		int age = person.getAge();
		
		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
				userid, userpw, name, age);
	
	}

}
