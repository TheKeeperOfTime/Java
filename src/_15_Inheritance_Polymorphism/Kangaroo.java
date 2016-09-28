package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{
	
	
	public boolean canBox;
	
	@Override
	public void speak(){
		System.out.println("Let's box!");
	}

}
