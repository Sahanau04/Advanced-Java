package A33;

public class StringExerciseQ5 {
	    public static String removeWhitespace(String input) {
	        return input.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String messy = " A I E T   College ";
	        String cleaned = removeWhitespace(messy);
	        System.out.println("After removing whitespace: '" + cleaned + "'"); // 'AIETCollege'
	    }
	}


