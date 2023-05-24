package inheritance.car;

public class Car {
	// 필드
	String brand;
	int cc; // 배기량
	
	// 생성자
	public Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
	public String carInfo() {
		return "브랜드: " + brand + ", 배기량: " + cc;
	}
}
