package ArrayList2;
import java.util.*;
public class RemoveColor {

	    public static void main(String[] args) {
	        // Initialize the ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
	        
	        // Remove the 2nd element (index 1)
	        colors.remove(1); // Removes "Blue"
	        
	        // Remove the color "Blue" if it still exists
	        colors.remove("Blue"); // Safe, if "Blue" is still in the list
	        
	        System.out.println("Updated ArrayList: " + colors);
	    }
	}


