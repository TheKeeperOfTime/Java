package _16_Gradebook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class NewGradebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create variables
		int option = 0;
		String tempName = "";
		
		System.out.println("Welcome to The Gradebook");
		Scanner userIn = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> gradeBook = new ArrayList<Double>();
		List<Double> tempScores = new ArrayList<Double>();
		
		Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();
		
		while(option!=6){
			
			//print main menu
			System.out.println("---------------------------------------------");
	    	System.out.println("Please select an option from the list below: ");
	    	System.out.println("1) Enter Name & Scores");
	    	System.out.println("2) Modify Entry ");
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	
	    	System.out.println("Enter Grade Values. Enter -1 to Finish.");
	    	while (true) {
	    		gradeBookEntry = userIn.nextDouble();
	    		
	    		if(gradeBookEntry == -1) {
	    			testScores.put(tempName, tempScores);
	    			break;
	    		} else {
	    			tempScores.add(gradeBookEntry);
	    			} 
	    		}
	    	}	
	    		printScores(tempName, testScores);
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

