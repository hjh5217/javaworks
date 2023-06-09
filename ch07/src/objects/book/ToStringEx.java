package objects.book;

public class ToStringEx {

	public static void main(String[] args) {
		
		String name = "김기용";
		
		System.out.println(name.toString());
		
		Book book = new Book(100, "개미");
		
		System.out.println(book.toString());
	}

}
