package objectarray;

public class Book {
	String bookName;
	String author;
	
	public Book() {}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public void bookInfo() {
		System.out.print(bookName+", ");
		System.out.println(author);
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
}
