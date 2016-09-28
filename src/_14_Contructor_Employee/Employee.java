package _14_Contructor_Employee;

public class Employee {
	
	
	//Properties
    public String name;
	protected double salary;
	public int startYear;
	public int birthYear;
	
	//Constructor
	//A constructor is a method that has the same name as the Class itself = it builds
	//our instances or objects of that class type
	
	
	Employee(String name, double salary, int birthYear, int startYear){
		this.name = name;
		this.salary = salary;
		this.birthYear = birthYear;
		this.startYear = startYear;
	}
	
	

}
