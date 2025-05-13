package LinkedList;
import java.util.*;
public class LinkedListDisplayWithPositions {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + ": " + colors.get(i));
	        }
	    }
	}


