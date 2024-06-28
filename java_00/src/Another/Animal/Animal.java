package Another.Animal;

public class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	// (Animal: 클래스 animal: 할당할 인자)
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
