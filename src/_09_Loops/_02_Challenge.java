package _09_Loops;


public class _02_Challenge {

	public static void main(String[] args) {
		
		
		
		String sent = "Spencer Laurien Haggard";     
	    int length = sent.length();
	    char frequentChar = ' ';
	    int maxLength = 0;
	    for (int i = 0; i < length; i++) {
	        char currentChar = sent.charAt(0);
	        sent = sent.replaceAll(currentChar + "", "");
	        if (maxLength < (length - sent.length())) {
	            frequentChar=currentChar;
	            maxLength = length - sent.length();
	        }
	        System.out.println("Char : " + currentChar + " Occurance " + (length - sent.length()));
	        length = sent.length();
	    }
	    System.out.println("Max Occurance : " + maxLength);
	    
	    
	    
	    
	    

	}

}
