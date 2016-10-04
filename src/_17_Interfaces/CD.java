package _17_Interfaces;

public class CD implements IFunction{

	@Override
	public void play() {
		System.out.println("Cd is now playing.");
		
	}

	@Override
	public void stop() {
		System.out.println("Cd is stopped.");
		
	}

	@Override
	public void skip() {
		System.out.println("Skip to next tune.");
		
	}

	@Override
	public void menu() {
		System.out.println("Go to menu.");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause tune.");
		
	}
	
	
	public void turnUpToEleven(int volume) {
		System.out.println("Turn it up to " + volume + "!");
	}

	@Override
	public void turnDown() {
		
		
	}

	@Override
	public void turnUp() {
	
		
	}

	@Override
	public void name(String name) {
		System.out.println("This is " + name);
		
	}
	
	
	
	

}
