package _12_Class_Package;

public class _01_Basic_Objects {

	public static void main(String[] args) {
	
//		Movie  pulpFiction = new Movie();
//		
//		pulpFiction.name = "Pulp Fiction";
//		pulpFiction.genre = "Thriller/Drama";
//		pulpFiction.actors = "Many people";
//		pulpFiction.actresses = "Lots of people";
//		pulpFiction.onNetflix = true;
//		pulpFiction.length = 120;
//		pulpFiction.rating = 10.0;
//		pulpFiction.moneyUsed = 10000000;
//		
//		
//		pulpFiction.getAll();
//		
//		pulpFiction.getMoneyUsed();
		
		Movie pulpFiction = new Movie("Pulp Fiction", "Drama/Thriller", "Many", "Many more");
		System.out.println("Title: " + pulpFiction.name);
		System.out.println("Genre: " + pulpFiction.genre);
		System.out.println("Actors: " + pulpFiction.actors);
		System.out.println("Actresses: " + pulpFiction.actresses);
		

	}
	
		

}
