package _07_conditionals;
import java.util.Scanner;
import java.util.Random; 

public class _01_if_else_else_if {

	public static void main(String[] args) {
		
		
		/*BRONZE: 
			 Write 3-5 basic if/else statements as practice.*/
		
		
		double money = 200;
		
		if (money > 200){
			System.out.println("Someone put money in my accout!");
		} else {
			System.out.println("Nothing has changed...");
		} 
		
		String food = "Tacos";
		
		if (food == "Tacos"){
			System.out.println("Yes!");
		} else {
			System.out.println("Oh damn, we're not having tacos");
		}
		
		
		/*SILVER:
    		Write an if/else that checks if a password is correct. Use the scanner to accept the password from a user.*/
		
		
        System.out.println("THIS PROGRAM IS 100% CAPS/SLANG SENSITIVE!");
       

        Scanner input = new Scanner(System.in); 

         String answer1;
         String answer2;

        System.out.print("Hello User, please enter your name: ");
        answer1 = input.nextLine();
        System.out.print("Hello " + answer1 + ". How are you today?: ");
        answer2 = input.nextLine();

        if(answer2.equals("Good")){
            System.out.println("Good to hear.");
        }else if(answer2.equals("Okay")){
            System.out.println("Better than some.");
        }else{
            System.out.println("I'm sorry but I don't really care...");
        }
		
		
		
		
		

	}

}
