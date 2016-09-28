package _15_Inheritance_Polymorphism;
import java.util.Scanner;

public class Animal {
	Scanner inputInfo = new Scanner(System.in);
	
	//This is the parent class
	
	
	//Properties
	
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifeSpan;
	
	
	public boolean isWarmBlooded;
	
	public String name;
	public String habitat;
	public boolean canJump;
	
	
	//Methods
	
	public void printName(){
		System.out.println("My name is " +  name + "!");
	}
	
	public void jump(){
		if(canJump == true){
			System.out.println(name + " can jump.");
		} else {
			System.out.println(name + " can't jump.");
		}
			
		
	}
	
	public void speak(){
		System.out.println("I am an animal");
	}
	
	
	
}
