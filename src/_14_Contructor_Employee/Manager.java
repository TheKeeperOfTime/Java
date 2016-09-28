package _14_Contructor_Employee;

public class Manager extends Employee{

	//Super is used to alter properties. Override is for methods.
		
	public String department;
	
	Manager(String name, double salary, int birthYear, int startYear, String department) {
		super(name, salary, birthYear, startYear);
		this.department = department;
	}

}
