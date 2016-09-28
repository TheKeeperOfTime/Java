package _13_Friends;

public class Friends {

	int timeAsFriend;
	String nameFriend;
	
	int age;
	
	boolean online;
	boolean offline;
	boolean college;
	String currCity;
	String hometown;
	String gender;
	
	
	public void getAll(){
		System.out.println("Name: " + nameFriend);
		System.out.println("Age: " + age);
		System.out.println("Length of friendship: " + timeAsFriend);
		
	}
	
	public void getOnlineStatus(){
		if (online == true){
		System.out.println(nameFriend + " is online");
		} else {
			System.out.println(nameFriend + " is offline.");
		}
	}
	
	public void cityCheck(){
		if (currCity != hometown){
			System.out.println(nameFriend + " has moved away from home");
			} else if(currCity == hometown){
			 if(gender == "Male"){
				 System.out.println(nameFriend + " is living in his hometown");
			 } else if(gender == "Female"){
				 System.out.println(nameFriend + " is living in her hometown");
			 }
		}
	}
	
}
	

	

