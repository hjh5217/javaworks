package interfaceex.tire;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
		System.out.println("======================");
		
		//앞바퀴 교체
		car.frontLeftTire = new KumTire();
		car.frontRightTire = new KumTire();
		
		car.run();

	}

}
