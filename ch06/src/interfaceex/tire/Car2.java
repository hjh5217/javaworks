package interfaceex.tire;

public class Car2 {
	
	Tire[] tires = {
		new HanTire(),
		new HanTire(),
		new KumTire(),
		new KumTire()
	};
	
	public void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
