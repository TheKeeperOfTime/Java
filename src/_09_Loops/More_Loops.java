package _09_Loops;

public class More_Loops {

	public static void main(String[] args) {
		
		
		
		String[] bands = {"The New Mastersounds", "Frank Turner", "Welshly arms", "King Floyd"};
			for(int i = 0; i < bands.length; i++){
				System.out.println(bands[i]);
		}
		
		String[] people = {"Galan", "Ethan", "Sydney", "James", "Summer", "Paul"};
			for(int i = 0; i < people.length; i++){
				System.out.println(people[i]);
		}
		
		String[] Bands = {"Stanton Moore", "A Tribe Called Quest", "Digable Planets"};
			for(String band : Bands){
				System.out.println(band);
		}
		
		String[] food = {"Sushi", "Hi-Chew", "Coffee", "Water", "Thai food"};
			for(String lunch : food){
				System.out.println(lunch);
		}
			
			
		int[] numbers = {12, 14, 6483, 5438, 96, 385, 83};
			for(int number : numbers){
				System.out.println(number);
		}
			
		int[] nums = {12, 34, 54};
			for(int i = 0; i < nums.length; i++){
				System.out.println(nums[i]);
		}
			
		double[] decimals = {2.00, 1.00, 3.93, 98.38};
			for(int i = 0; i < decimals.length; i++){
				System.out.println(decimals[i]);
		}
			
		String[] classes = {"Java", "Science","Math", "English", "Music"};
			for(int i = 0; i < classes.length; i++){
				System.out.println(classes[i]);
			}
			
			for (int i = 0; i <= 10; i++){
				if (i % 2 == 0){
					System.out.println("Even" + i);
				} else {
					System.out.println("Odd" + i);
				}
			}
			
			
		String[] names = {"James", "Paul", "Jenn", "Marissa", "CC"};
			for (String name : names){
				if(name.equals("Jenn")){
					System.out.println("Jenn is the boss!");
				} else {
					System.out.println(name + " is not the boss.");
				}
			}

	}

}
