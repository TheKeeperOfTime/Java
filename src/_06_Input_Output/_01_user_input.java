package _06_Input_Output;
import java.util.Scanner;

public class _01_user_input {

	public static void main(String[] args) {
		
		//Bronze: Create 2-3 questions you might see on a website
		
		/*String name;
		String birthCity;
		int h;
		
		Scanner inputInfo = new Scanner(System.in);
		System.out.println("Enter your name below.");
		name = inputInfo.next();
		
		System.out.println("What city are you from?");
		birthCity = inputInfo.next();
		
		System.out.println("What year were you born?");
		h = inputInfo.nextInt();*/
		
		
		
	
	//SILVER:
		//Create a story using the Scanner. 
		//Do your best to add everything you've learned so far in the story. 
		//Include Strings, booleans, integers, operators, etc. 
		
	
		
		
	//GOLD:
		//Make a choose your own adventure program that uses the Scanner. 
		//Here is what you should use for the first question:
		//You see a wide open door ahead. Do you go through it?
		//Enter yes or no: 
		
		//TODO Scanner story
		
		String yes;
		String no;
		boolean Yes = true;
		boolean No = false;
		
		Scanner inputInfo = new Scanner(System.in);
		System.out.println("Enter Yes or No for every question... You see an open door ahead. Do you go through it?");
		yes = inputInfo.next();
		no = inputInfo.next();
		if (Yes == true){
			System.out.println("You go through the door and find a chest. Do you open it?");
		} else if (No == false){
			System.out.println("Instead of opening the door, you turn around and see a long hallway.");
		} else {
			System.out.println("Not a valid response.");
		}
		
		
		
		




		
		
	
		
		
		
		
		
		
		
		
	

	}

}
