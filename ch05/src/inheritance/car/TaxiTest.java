package inheritance.car;

class Taxi extends Car{
	int passengerCount; // 승객 수
	
	public Taxi(String brand, int cc, int passengerCount){
		super(brand, cc); // 부모 필드 상속
		this.passengerCount = passengerCount;
	}
	@Override
	public String carInfo() {	
		return super.carInfo() + ", 승객 수: " + passengerCount;
	}
}

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("Ionic 5",3000,1);
		System.out.println(taxi.carInfo());

	}

}
