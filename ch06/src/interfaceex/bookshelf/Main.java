package interfaceex.bookshelf;

public class Main {

	public static void main(String[] args) {
		
		BookShelf shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 자바");
		shelfQueue.enQueue("스프링 부트");
		
		System.out.println(shelfQueue.getSize() + "개");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		
	}

}
