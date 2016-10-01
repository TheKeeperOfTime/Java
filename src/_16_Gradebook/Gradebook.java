package _16_Gradebook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;





public class Gradebook {

	public static void main(String[] args) {
	  	
	    //Create variables
	    int option = 0;
	    String name = "";
	    
	    System.out.println("Welcome To The Gradebook");
	    
	    Scanner userIn = new Scanner(System.in);
	    ArrayList<Double> gradeBook = new ArrayList<Double>();
	    Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
	    
	  
	    
	   
	    
	    //Menu Loop
	    while(option != 6){
	    	
	    	//Print main menu
	    	System.out.println("Please select an option from the list below:");
	    	System.out.println("---------------------------------------------");
	    	System.out.println("1) Enter Student Name");
	    	System.out.println("2) Modify Entry");
	    	System.out.println("3) Delete Entry");
	    	System.out.println("4) View Stats");
	    	System.out.println("5) View All Entries");
	    	System.out.println("6) Exit Program");
	    	
	    	//User to select option
	    	option = userIn.nextInt();
	    	
	    	//Option 1 - Enter Values
	    	if(option == 1){
	    		System.out.println("Please enter name. Type -1 to exit:");
	    		double gradeBookEntry = 0;
	    		
	    		//While loop for entering data
	    		while(true){
	    			gradeBookEntry = userIn.nextDouble();
	    			
	    			//Exit if -1
	    			if(gradeBookEntry == -1){
	    				break;
	    			} else {
	    				gradeBook.add(gradeBookEntry);
	    			}
	    		}
	    	}
	    	
	    	
	    	//Option 2 - Modify an Entry
	    	if(option == 2){
	    		System.out.println("Which index would you like to modify?");
	    		int index = userIn.nextInt();
	    		System.out.println("Replace Index:" + index +" Value:" + gradeBook.get(index) + " with what?");
	    		gradeBook.set(index, userIn.nextDouble());
	    		System.out.println("Successfully Set");
	    	}
	    	
	    	//Option 3 - Delete 
	    	if(option == 3){
	    			System.out.println("Which index would you like to delete?");
	    		int index = userIn.nextInt();
	    		gradeBook.remove(index);
	    		System.out.println("Removed");
	    	}
	    	
	    	//option 4 - View Stats
	    	if(option == 4){
	    		//Calculate Average
	    		double total = 0;
	    		for(int i = 0; i < gradeBook.size(); i++){
	    			total += gradeBook.get(i);
	    		}
	    	
	    	//Option 5 - View Elements
	    	if(option == 5){
	    		System.out.println("|Index| Value");
	    		for(int i = 0; i < gradeBook.size(); i++){
	    			//Create Rows
	    			System.out.println("| " + i + " | " + gradeBook.get(i));
	    			
	    		}
	    	}
	    	
	    	
	    		double average = total/gradeBook.size();
	    		
	    		//Sort gradeBook
	    		ArrayList<Double> copiedGradeBook = new ArrayList<Double>();
	    		copiedGradeBook.addAll(gradeBook);
	    		Collections.sort(copiedGradeBook);
	    		
	    		//Extract max and min
	    		double max = copiedGradeBook.get(gradeBook.size() -1);
	    		double min = copiedGradeBook.get(0);
	    		
	    		double median = 0;
	    		//Find Median
	    		if(copiedGradeBook.size()%2 == 1){
	    			median = copiedGradeBook.get(copiedGradeBook.size()/2);
	    		} else {
	    			int secIndex = copiedGradeBook.size()/2;
	    			double firstMedian = copiedGradeBook.get(secIndex - 1);
	    			double secondMedian = copiedGradeBook.get(secIndex);
	    			median = (firstMedian + secondMedian) /2.0;
	    		}
	    		
	    		System.out.println("Database Stats");
	    		System.out.println("Average: " + average);
	    		System.out.println("Min:     " + min);
	    		System.out.println("Max:     " + max);
	    		System.out.println("Median:  " + median);
	    		System.out.println("Elements:" + gradeBook.size());
	    	
	    		
	    		
	    		}
	    	}
		}
	    
				    public static void printScores(String studentName, Map<String, List<Integer>> scoresMap)
					{
						
						List<Integer> scores = scoresMap.get(studentName);
						System.out.println(studentName);
						for(int score : scores)
						{
							System.out.println(score);
						}
		

	}

}
