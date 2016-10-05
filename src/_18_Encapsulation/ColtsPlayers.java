package _18_Encapsulation;

public class ColtsPlayers {
	
	public String name;
	private int number;
	protected int age;
	
	//Getters and setters
	
	//This is the setter
	public void setNumber(int number) {
		this.number = number;
		
	}
	
	//Now we will build the getter
	
	public Integer getNumber() {
		return this.number;
	}
	

}
