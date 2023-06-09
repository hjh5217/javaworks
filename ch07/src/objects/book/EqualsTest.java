package objects.book;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("김기용");
		String name2 = new String("김기용");
		
		System.out.println(name1);
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println("=========================");
		
		Book book1 = new Book(1, "혼공 자바");
		Book book2 = new Book(1, "혼공 자바");
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		System.out.println("=========================");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		
		
	}

}
