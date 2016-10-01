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


public class James {
	public static void main(String[] args) 
	{
				
		//HASHMAP - Makes String & Integers paired - Key value pair.
		//example of combining collections
		
		String tempName = "";
		List<Double> tempScores = new ArrayList<Double>();
		Scanner userInput = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Map<String, List<Double>> testScores = new HashMap<String, List<Double>>();
				
		List<Double> fredScores = new ArrayList<Double>();
		fredScores.add(80.00);
		fredScores.add(60.00);
		testScores.put("Fred", fredScores);
		System.out.println("Press 1 to enter Name and Grades");
		int option = userInput.nextInt();
		
		//Option 1 Enter Values
		if(option == 1){
			double gradeBookEntry = 0;
			System.out.println("Enter Student Name:");
			try {
				tempName = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter values. Type -1 to exit.");
			//while loop for entering data
			while(true){
				gradeBookEntry = userInput.nextDouble();
				
				//Exit if -1
				if(gradeBookEntry == -1){
					testScores.put(tempName, tempScores);
					break;
				}else{
					tempScores.add(gradeBookEntry);
					
				}
			}
		}
		//James hardcoded this into the gradebook. If you type "James" It will let you enter in and save the values
		printScores("James", testScores);
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