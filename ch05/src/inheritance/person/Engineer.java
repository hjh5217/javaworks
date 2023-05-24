package inheritance.person;

public class Engineer extends Person{
	int companyId;

	
	public static void main(String[] args) {
		Engineer eng = new Engineer();
		eng.age = 27;
		eng.name = "봉구"; // 부모 필드에 접근
		eng.companyId = 256;
	}
}
