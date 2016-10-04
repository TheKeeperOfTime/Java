package _17_Interfaces;

public class DVD implements IFunction{

	@Override
	public void play() {
		System.out.println("Play DVD.");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop DVD.");
		
	}

	@Override
	public void skip() {
		System.out.println("Skip to next scene.");
		
	}

	@Override
	public void menu() {
		System.out.println("Go to menu.");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause DVD.");
		
	}
	
	@Override
	public void turnUp() {
		System.out.println("Turn it up!");
	}

	@Override
	public void turnDown() {
		
	}

	@Override
	public void name(String name) {
		System.out.println("You are watching " + name);
		
	}


	

	
	

}
