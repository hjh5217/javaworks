package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		// 다형성 - 부모 타입으로 객체 생성(자동 형변환)
		Animal human = new Human();
		Animal animal = new Animal();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		// static 없이 쓸때 호출
		aTest.moveAnimal(animal);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);
		
		//static 있을때 호출
//		moveAnimal(animal);
//		moveAnimal(eagle);
//		moveAnimal(human);
//		moveAnimal(tiger);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
