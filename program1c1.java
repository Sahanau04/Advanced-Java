package LinkedList;
import java.util.*;
public class LinkedListStartAtPosition {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));

	        // Start iterator from index 1 (2nd position)
	        ListIterator<String> iterator = colors.listIterator(1);
	        System.out.println("Iterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


