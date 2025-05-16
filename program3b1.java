package A33;
public class StringExerciseQ1 {
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	    public static void main(String[] args) {
	        String test1 = null;
	        String test2 = "    ";
	        String test3 = "AIET";

	        System.out.println("Test1: " + isNullOrEmpty(test1)); 
	        System.out.println("Test2: " + isNullOrEmpty(test2)); 
	        System.out.println("Test3: " + isNullOrEmpty(test3)); 
	    }
	}


