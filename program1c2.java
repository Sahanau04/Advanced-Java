package LinkedList;
import java.util.*;
public class LinkedListReverseIteration {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Pink"));

	        Iterator<String> reverseIterator = colors.descendingIterator();
	        System.out.println("Iterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


