package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal george = new Animal();
		george.name = "George";
		george.canJump = false;
		george.printName();
		george.jump();
		george.speak();
		
	
		
		Bear barney = new Bear();
		barney.name = "Barney";
		barney.isHibernating = true;
		barney.canJump = false;
		barney.printName();
		barney.jump();
		barney.speak();
		
		
		
		Kangaroo jack = new Kangaroo();
		jack.name = "Jack";
		jack.canJump = true;
		jack.canBox = true;
		jack.habitat = "The Land Down Under";
		jack.printName();
		jack.jump();
		jack.speak();
		
		Mouse larry = new Mouse();
		larry.name = "Larry";
		larry.canJump = false;
		larry.numFeet = 4;
		larry.habitat = "House";
		larry.printName();
		larry.speak();
		larry.jump();
		
		
		
		
		
		

	}

}
