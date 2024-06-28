package Another.Animal;

public class ExMain {

	public static void main(String[] args) {

		// Animal 가져온 클래스 animal 새로운 객체 (인스턴스)변수  = new Animal(); 출력할 값
		Animal animal = new Animal();
		
		// Animal 클래스의 animal메서드 호출
		animal.move();		
		
		// animal.moveAnimal(new Human : animal에서 가져온 객체 ());
		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagle());

	}

}
