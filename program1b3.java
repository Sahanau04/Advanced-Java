package ArrayList2;
import java.util.*;

public class SortColors {

	    public static void main(String[] args) {
	        // Initialize the ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
	        
	        // Sort the colors using Collections.sort()
	        Collections.sort(colors);
	        
	        System.out.println("Sorted ArrayList: " + colors);
	    }
	}


