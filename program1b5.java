package ArrayList2;
import java.util.*;
public class RemoveNthElement {
	    public static void main(String[] args) {
	        // Initialize the ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));
	        
	        // Index of the element to remove (e.g., removing the 3rd element, which is index 2)
	        int indexToRemove = 2; // This corresponds to the color "Green"
	        
	        // Remove the element by index
	        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
	            colors.remove(indexToRemove);
	            System.out.println("Updated ArrayList after removing the " + (indexToRemove + 1) + "th element: " + colors);
	        } else {
	            System.out.println("Index out of bounds.");
	        }
	    }
	}


