package _03_Number;

public class _04_challenge_story {

	public static void main(String[] args) {
		
		double totalBalence = 5000.00;
		
		//This is the stuff I bought
		
		double dinner = 37.49;
		double iceCream = 10.12;
		double computer = 2000.00;
		double tv = 765.35;
		
		//Total spent
		
		double totalSpent = dinner + iceCream + computer + tv;
		System.out.println("Bill: " + totalSpent);
		
		double afterBalence = totalBalence - totalSpent;
		System.out.println("Bank balence: " + afterBalence);
		
		//Payday!
		totalBalence = afterBalence;
		
		totalBalence = totalBalence + 8000; 
		totalBalence += 800;
		
		System.out.println(totalBalence);
		
		//Now you have this much money, but you want to buy.
		
		double shoes = 5 * 100.59;
		double shirts = 10 * 37.22;
		double xbox = 399.99;
		double secondPc = 1130.99;
		double moreSpent = shoes + shirts + xbox + secondPc;
		
		System.out.println("Bill " + moreSpent);
		
		double newBalence = totalBalence - moreSpent;
		System.out.println("Current Balence: " + newBalence);
		
		//Sadly, you go bankrupt. You loose all your money. 
		
		double bankrupt = newBalence - 8580.91;
		System.out.println("Current Balence: " + "$" + bankrupt);
		
		
		
		

	}

}
