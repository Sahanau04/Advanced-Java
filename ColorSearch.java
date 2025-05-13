package ArrayList2;
import java.util.*;
public class ColorSearch {
	    public static void main(String[] args) {
	        // Initialize the ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
	        
	        // Search for the color "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available in the list.");
	        } else {
	            System.out.println("Color 'Red' is not available in the list.");
	        }
	    }
}
