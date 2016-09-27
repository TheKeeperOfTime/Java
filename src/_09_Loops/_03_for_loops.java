package _09_Loops;

import java.util.Scanner;

public class _03_for_loops {

	public static void main(String[] args) {
		
			//		  for(int i = 0; i <= 100; i += 5){
//	        	System.out.println(i);
//	        }
		  	
		
//		int sum = 0;
//		  	for (int i = 0; i <= 10; i++){
//		  	sum = sum + i;
//	        	
//	        }
//		  	System.out.println(sum);
//		  	
//		  	//Simple interest over time
//		  	//Short-handing things helps
//		  	double balance = 5000;
//		  	double rate = 1.02;
//		  	
//		  	for (int i = 0; i < 10; i++){
//		  		balance *= rate;
//		  		
//		  	}
//		  	System.out.println(balance);
		  	
		  	//' ' this pulls in just a character
			//TODO Practice all of this!
			//This is how you count the characters in a string
		
			Scanner inputInfo = new Scanner(System.in);
			System.out.println("Type a sentence");
			
			
		
		
		  	
		  	String character = "Spencer Laurien Haggard";
		  	int numChar = 0;
		  	for (int i = 0; i < character.length(); i++){
		  		if (character.charAt(i) != 'e') {
		  			continue;
		  		} else {
		  			numChar++;
		  		}
		  	 }	
		  	
		  	System.out.println("Number of E's: " + numChar);
		  	
		  	
		  	
		  	
		

	}

}
