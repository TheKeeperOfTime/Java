package _16_Gradebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class NewGradebook {

	public static void main(String[] args) {
		

		//create variables
		int option = 0;
		String tempName = "";
		
		System.out.println("Welcome to The Gradebook");
		Scanner userIn = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> gradeBook = new ArrayList<String>();
		
		List<Double> tempScores = new ArrayList<Double>();
		
		Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();
			
		
		while(option!=6){
			
			
			//print main menu
			System.out.println("---------------------------------------------");
	    	System.out.println("Please select an option from the list below: ");
	    	System.out.println("1) Enter Name & Scores");
	    	System.out.println("2) Modify Scores");
	    	System.out.println("3) Delete Entry");
	    	System.out.println("4) View Stats ");
	    	System.out.println("5) View All Entries");
	    	System.out.println("6) Exit Program");
	    	
	    	//allow user to choose their option #
	    	option = userIn.nextInt();
	    	
	    	//option one: enter names and values
	    	if (option == 1) {
	    		double gradeBookEntry = 0;
	    		System.out.println("Enter Student Name");
	    		try {
					tempName = reader.readLine();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	    	
	    	System.out.println("Enter Grade Values. Enter -1 to Finish.");
	    	while (true) {
	    		gradeBookEntry = userIn.nextDouble();
	    		
	    		if(gradeBookEntry != -1) {
	    			testScores.put(tempName, tempScores);
	    			break;
	    		} else {
	    			tempScores.add(gradeBookEntry);
	    			} 
	    		}
	    	}	
	    		printScores(tempName, testScores);
	    		
	    		//Option 2
		    	if(option == 2){
		    		System.out.println("Which index would you like to modify?");
		    		int index = userIn.nextInt();
		    		System.out.println("Replace Index:" + index +" Value:" + tempScores.get(index) + " with what?");
		    		tempScores.set(index, userIn.nextDouble());
		    		System.out.println("Successfully Set");
		    	}
		    	
		    	//Option 3 - Delete 
		    	if(option == 3){
		    			System.out.println("Which index would you like to delete?");
		    		int index = userIn.nextInt();
		    		tempScores.remove(index);
		    		System.out.println("Removed");
		    	}
		    	
		    	//option 4 - View Stats
		    	if(option == 4){
		    		//Calculate Average
		    		double total = 0;
		    		for(int i = 0; i < tempScores.size(); i++){
		    			total += tempScores.get(i);
		    			
		    			double average = total/tempScores.size();
			    		
			    		//Sort gradeBook
			    		ArrayList<Double> copiedtempScores = new ArrayList<Double>();
			    		copiedtempScores.addAll(tempScores);
			    		Collections.sort(copiedtempScores);
			    		
			    		//Extract max and min
			    		double max = copiedtempScores.get(tempScores.size() -1);
			    		double min = copiedtempScores.get(0);
			    		
			    		double median = 0;
			    		//Find Median
			    		if(copiedtempScores.size()%2 == 1){
			    			median = copiedtempScores.get(copiedtempScores.size()/2);
			    		} else {
			    			int secIndex = copiedtempScores.size()/2;
			    			double firstMedian = copiedtempScores.get(secIndex - 1);
			    			double secondMedian = copiedtempScores.get(secIndex);
			    			median = (firstMedian + secondMedian) /2.0;
			    		}
			    		
			    		System.out.println("Database Stats");
			    		System.out.println("Average: " + average);
			    		System.out.println("Min:     " + min);
			    		System.out.println("Max:     " + max);
			    		System.out.println("Median:  " + median);
			    		System.out.println("Elements:" + tempScores.size());
		    		}
		    		
		    		//Option 5 - View Elements
			    	if(option == 5){
			    		System.out.println("|Index| Value");
			    		for(int i = 0; i < tempScores.size(); i++){
			    			//Create Rows
			    			System.out.println("| " + i + " | " + tempScores.get(i));
			    			
			    		}
			    	}
			    	
		    	
		    	}
	    	}	
		}
		public static void printScores(String studentName, Map<String, List<Double>> scoresMap)
		
		{
			List<Double> scores = scoresMap.get(studentName);
			System.out.println(studentName);
			for(double score : scores)
			{
				System.out.println(score);
			}
			
	}
}

