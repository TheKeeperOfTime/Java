package _08_DataCollections;

public class _01_Arrays {
	//TODO Arrays

	public static void main(String[] args) {
		 double[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	     
	      
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is: " + total);
	      
	      
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is: " + max); 
	      
	      
	      
	      
	      String[] names = {"Sydney", "Summer", "Jon", "Karl", "Shane", "Ethan"};
	      
	      System.out.println(names[1]);
	      
	      int[] agePeople = {17, 18, 60, 24, 20, 19, 30};
	      
	      System.out.println(agePeople[1]);
	      
	      
	      
	      
	     
	      
	      
	      
	      
	      
	      
	      
	      
	}
}
	


