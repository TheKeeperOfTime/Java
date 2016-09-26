package _04_Strings;

public class _01_Strings {

	public static void main(String[] args) {
		
		
		//Bronze challenge: Make three strings, one for your first name, middle name, and last name. Then combine
        //them into your full name with spaces between each.
		
		String firstName = "Spencer";
		String lastName = "Haggard";
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		
		
		
		
		/*Silver challenge: Make a String containing the phrase "Soda Can". Then, do a search for subString method
        and use it to split the phrase into separate words and store them in strings. Print the two strings.
        The console should read: 
        				Soda 
        				Can*/
		
		String phrase = "Soda can";
		System.out.println(phrase.substring(0,5));
		System.out.println(phrase.substring(5, 8));
		
		
		/*GOLD:
            Create a string containing the phrase "sally sells seashells", and using a loop(Will learn later
            so you might have to come back) count how many times the letter 's' appears in the phrase.*/
		
			String s = "sally sells seashells";
			int counter = 0;
			for( int i=0; i<s.length(); i++ ) {
			    if( s.charAt(i) == 's' ) {
			        counter++;    
			    } 
			}
			
			System.out.println(counter);
		
		

			//TODO Char
			
			
			
			
			
			
			
			
			
			//TODO string inserts

	/*		\t	Inserts a tab in the text at this point.
			\b	Inserts a backspace in the text at this point.
			\n	Inserts a newline in the text at this point.
			\r	Inserts a carriage return in the text at this point.
			\f	Inserts a form feed in the text at this point.
			\'	Inserts a single quote character in the text at this point.
			\"	Inserts a double quote character in the text at this point.
			\\	Inserts a backslash character in the text at this point.
	*/	
			
	}

}
