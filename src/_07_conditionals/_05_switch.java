package _07_conditionals;

public class _05_switch {


	public static void main(String[] args) {
		/*Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. A switch works with the byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).*/
//		  int month = 8;
//	        String monthString;
//	        switch (month) {
//	            case 1:  monthString = "January";
//	                     break;
//	            case 2:  monthString = "February";
//	                     break;
//	            case 3:  monthString = "March";
//	                     break;
//	            case 4:  monthString = "April";
//	                     break;
//	            case 5:  monthString = "May";
//	                     break;
//	            case 6:  monthString = "June";
//	                     break;
//	            case 7:  monthString = "July";
//	                     break;
//	            case 8:  monthString = "August";
//	                     break;
//	            case 9:  monthString = "September";
//	                     break;
//	            case 10: monthString = "October";
//	                     break;
//	            case 11: monthString = "November";
//	                     break;
//	            case 12: monthString = "December";
//	                     break;
//	            default: monthString = "Invalid month";
//	                     break;
//	        }
//	        System.out.println(monthString);
//	        
	        
	        //You always have to have breaks and a default
	        int whiteCastlesEaten = 20;
	        String response;
	        
	        switch(whiteCastlesEaten){
	        case 0 << 5:
	        	response = "That's probably smart";
	        	break;
	        case 5:
	        	response = "That's not good";
	        	break;
	        case 10:
	        	response = "Dude, you better stop";
	        	break;
	        case 15:
	        	response = "That's crazy";
	        	break;
	        case 20: 
	        	response = "I think you're going to die";
	        	break;
	        	default:
	        		response = "This is the best!";
	        	
	        }
	        
	        System.out.println(response);
	        
	    }
	}


