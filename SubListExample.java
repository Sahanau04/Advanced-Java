package ArrayList2;
import java.util.*;
public class SubListExample {
	    public static void main(String[] args) {
	        // Initialize the ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
	        
	        // Extract 1st and 2nd elements (index 0 and 1) using SubList
	        List<String> subList = colors.subList(0, 2); // Sublist from index 0 to 2 (exclusive)
	        
	        System.out.println("Sublist (1st and 2nd elements): " + subList);
	    }
	}


