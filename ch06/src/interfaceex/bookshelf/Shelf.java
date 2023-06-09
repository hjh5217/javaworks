package interfaceex.bookshelf;

import java.util.ArrayList;

public class Shelf {
	//상속 클래스는 접근 가능
	protected ArrayList<String> shelf;
	
	public Shelf() { //객체 생성시 ArrayList 생성
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
}
