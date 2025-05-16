package B3;

public class StringExerciseQ10 {
	    public static int countWords(String input) {
	        if (input == null || input.trim().isEmpty()) return 0;
	        return input.trim().split("\\s+").length;
	    }
	    public static void main(String[] args) {
	        String sentence = "AIET is located in Moodbidri";
	        System.out.println("Word count: " + countWords(sentence)); // 5
	    }
	}


