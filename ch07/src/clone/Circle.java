package clone;

//clone()을 사용하려면 Cloneable을 구현해야함.
public class Circle implements Cloneable{
	Point center;
	int radius;
	
	Circle(int x, int y, int radius){
		center = new Point(x,y);
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "중심점은"+center+"이고, 반지름은"+radius+"입니다.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
