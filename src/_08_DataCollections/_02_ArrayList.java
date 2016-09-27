package _08_DataCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList {

	public static void main(String[] args) {
		
		//Use the full word like "Integer" to do a complex list and to be able to bring up auto-complete. It's super useful!
		
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Spencer");
		names.add("Summer");
		names.add("James");
		names.addAll(Arrays.asList("Sydney", "Paul", "Karl"));
		
		System.out.println(names.get(1));
		
		//Integer array list
		//Use .addAll(Arrays.asList()) to add multiple elements to an array 
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println(numbers);
		
		ArrayList<Double> decimal = new ArrayList<Double>();
		
		decimal.add(2.11);
		decimal.addAll(Arrays.asList(2.40, 4.00, 93.94, 91.1));
		
		
		
		

	}

}
