package arraylist;

import java.util.ArrayList;
import objectarray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 책을 저장할 ArrayList의 공간 새엇ㅇ
		ArrayList<Book> bookList = new ArrayList<>();

		// 책 객체 생성해서
		Book book1 = new Book("반응형 웹사이트", "김은아");
		Book book2 = new Book("Tiny Python Project", "켄 유엔스-클락");
		Book book3 = new Book("혼자 공부하는 자바", "신용권");
		
		
		
		// bookList에 저장
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//book1의 정보 출력
		book1.bookInfo();
		book2.bookInfo();
		System.out.println("================================");
		// book1의 정보(인덱싱)
		bookList.get(0).bookInfo();
		
		System.out.println(bookList.size() + "개");
		System.out.println("================================");
		// 전체 요소 출력
		for(int i = 0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.bookInfo();
		}
		//book2 삭제
		if(bookList.contains(book2)) {
			bookList.remove(book2);
		}
		System.out.println("================================");
		//향상 for 문
		for(Book book : bookList)
			book.bookInfo();
	}

}
