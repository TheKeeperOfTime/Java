package _13_Friends;

public class _01_Objects {

	public static void main(String[] args) {
		
		
		Friends Galen = new Friends();
		Galen.nameFriend = "Galen Morris";
		Galen.age = 17;
		Galen.timeAsFriend = 10;
		Galen.online = true;
		Galen.gender = "Male";
		Galen.currCity = "Martinsville";
		Galen.hometown = "Martinsville";
		
		
		
		Galen.getAll();
		
		Galen.getOnlineStatus();
		
		Galen.cityCheck();

	}

}
