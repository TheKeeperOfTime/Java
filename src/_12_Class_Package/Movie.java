package _12_Class_Package;

public class Movie {

	
	
	public String name;
	public String genre;
	public String actors;
	public String actresses;
	
	int length;
	int moneyUsed;
	
	double rating;

	boolean onNetflix;
	
	
	//Methods
	
	public void getAll(){
		System.out.println("Title: " + name);
		System.out.println("Genre: " + genre);
		System.out.println("Actors: " + actors);
		System.out.println("Actresses: " + actresses);
		System.out.println("Netflix: " + onNetflix);
		System.out.println("Rating: " + rating);
	
	}
	
	
	public void getMoneyUsed(){
		System.out.println("Money spent on movie: " + moneyUsed);
	}
	
	Movie(String name, String genre, String actors, String actresses){
		this.name = name;
		this.genre = genre;
		this.actors = actors;
		this.actresses = actresses;
	}
	
	
	
	
}
