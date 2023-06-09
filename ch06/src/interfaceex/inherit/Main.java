package interfaceex.inherit;

public class Main {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}

}
