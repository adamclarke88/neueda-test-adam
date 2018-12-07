import java.util.ArrayList;
import java.util.Arrays;

public class WhaleWatcher {
	
	static ArrayList<Whale> whales = new ArrayList<Whale>();

	public static void main(String[] args) {
		
		createWhales();		// calling the createWhales method
	}
		
	private static void createWhales() {
		
		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale humpback = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		ArrayList<Whale> whales = new ArrayList<Whale>(); // Use an array to store the four Whale objects
		
		whales.add(right);
		whales.add(blue);
		whales.add(sperm);
		whales.add(humpback);	
		
		for(Whale whale:whales) { 			// for loop to show each whale in the whales arraylist
		whale.outputWhaleDetails();  	// calling the outputWhaleDetails method from the whale class
			
		whale.outputAtlanticWhales();
		}
	
		}
		
		public static void atlanticWhales() {
			
			for(Whale whale:whales) {

				whale.outputAtlanticWhales();

	        }
		

	}

}
