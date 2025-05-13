package LinkedList;
import java.util.*;
public class LinkedListInsertAtEnd {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Blue", "Green"));

	        // Insert "Pink" at the end
	        colors.offerLast("Pink");

	        System.out.println("After inserting at end: " + colors);
	    }
	}


