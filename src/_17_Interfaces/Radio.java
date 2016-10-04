package _17_Interfaces;

public class Radio implements IFunction{

	@Override
	public void play() {
		
	}

	@Override
	public void stop() {
		System.out.println("Stoping radio.");
	}

	@Override
	public void skip() {
		System.out.println("Next radio.");
	}

	@Override
	public void menu() {
		System.out.println("Viewing radio list.");
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void turnUp() {
		System.out.println("Turn it up!");
	}
	
	
	public void changeStation(){
		System.out.println("Changing station");
	}

	@Override
	public void turnDown() {
		System.out.println("Turning down volume.");
		
	}

	@Override
	public void name(String name) {
		System.out.println("You are listening to " + name);
		
	}

	
	
	

}
