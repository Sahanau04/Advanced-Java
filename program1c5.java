package LinkedList;
import java.util.*;

public class LinkedListSwapElements {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

	        // Swap first (index 0) and third (index 2)
	        Collections.swap(colors, 0, 2);

	        System.out.println("After swapping first and third elements: " + colors);
	    }
	}


