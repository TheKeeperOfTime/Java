package _14_Contructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		
		Employee spencer = new Employee("Spencer", 100000, 1999, 2016);
		Manager e200 = new Manager("Sydney", 1000000, 1996, 2016, "Java");
		Janitor bob = new Janitor("Bob", 10000, 1970, 2014, true);
		
		System.out.println(spencer.salary);
		System.out.println(spencer.name);
		System.out.println(spencer.birthYear);
		System.out.println(spencer.startYear);
		
		System.out.println(e200.name);
		System.out.println(e200.department);
		
		System.out.println(bob.name);
		System.out.println(bob.name + " stays " + bob.mopsFloors + " to mopping floors");
		
		
		

	}

}
