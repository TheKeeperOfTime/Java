package _14_Contructor_Employee;

public class Janitor extends Employee{
	
	public boolean mopsFloors;

	Janitor(String name, double salary, int birthYear, int startYear, boolean mopsFloors) {
		super(name, salary, birthYear, startYear);
		this.mopsFloors = mopsFloors;
	}

}
