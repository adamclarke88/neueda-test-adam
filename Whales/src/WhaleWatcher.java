import java.util.ArrayList;
import java.util.Arrays;

public class WhaleWatcher {

	public static void main(String[] args) {
		
		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale humpback = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		// Use an array to store the four Whale objects
		
		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		whales.add(right);
		whales.add(blue);
		whales.add(sperm);
		whales.add(humpback);
		
		for(Whale whale:whales) { // for loop to show each whale in the whales arraylist
			System.out.println(whale.getName() + " " + whale.getMainOcean() + " " + whale.getWeight() + " " + whale.getMaxSpeed() + " " + whale.getLength());
		}
		

	}

}
