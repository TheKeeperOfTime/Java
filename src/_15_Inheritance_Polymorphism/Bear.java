package _15_Inheritance_Polymorphism;

public class Bear extends Animal{
	
	public boolean isHibernating;
	
	//Polymorphism can override things. It's actually very simple
	//Overrides the parent class
	
	@Override
	public void speak(){
		System.out.println("ROOOOOOOOAAAAAAAAAARRRRRRRRR!!!!");
	}
	
	
	
	
	
	
	
	
}
