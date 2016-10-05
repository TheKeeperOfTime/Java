package _02_Hello_World;

import _18_Encapsulation.ColtsPlayers;

public class HelloWorld 
{
	public static void main(String[] args) {
		
		
		
		ColtsPlayers aLuck = new ColtsPlayers();
		
		aLuck.name = "Andrew Luck";
		aLuck.setNumber(74); 
		System.out.println(aLuck.getNumber());
		
	}
	
}
