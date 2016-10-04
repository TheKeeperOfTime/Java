package _17_Interfaces;

public class Main {

	public static void main(String[] args) {
		
		CD mastersounds = new CD();
		mastersounds.name("The New Mastersounds");
		mastersounds.play();
		mastersounds.pause();
		mastersounds.skip();
		mastersounds.stop();
		mastersounds.turnUpToEleven(11);
		
		DVD movie = new DVD();
		movie.name("Pulp Fiction");
		movie.play();
		movie.pause();
		movie.stop();
		movie.turnUp();
		
		Radio One = new Radio();
		One.name("Radio One");
		One.changeStation();
		One.stop();
		One.turnUp();
		One.turnDown();
		One.skip();
		One.menu();
		
	
	}
}

