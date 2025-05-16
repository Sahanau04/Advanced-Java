package A3;
import java.util.Arrays;
public class StringOperations {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = new String("World");
	        System.out.println("String 1: " + s1);
	        System.out.println("String 2: " + s2);

	        // 2. Length and Character Access
	        System.out.println("Length of s1: " + s1.length());
	        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

	        // 3. String Comparison
	        String s3 = "hello";
	        System.out.println("s1 equals s3? " + s1.equals(s3));
	        System.out.println("s1 equalsIgnoreCase s3? " + s1.equalsIgnoreCase(s3));
	        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

	        // 4. String Searching
	        String text = "Java is powerful. Java is popular.";
	        System.out.println("Index of 'Java': " + text.indexOf("Java"));
	        System.out.println("Last index of 'Java': " + text.lastIndexOf("Java"));
	        System.out.println("Contains 'powerful'? " + text.contains("powerful"));

	        // 5. Substring Operations
	        System.out.println("Substring of s1 (0 to 3): " + s1.substring(0, 3));

	        // 6. String Modification
	        String modified = text.replace("Java", "Python");
	        System.out.println("Modified text: " + modified);
	        System.out.println("Uppercase: " + s1.toUpperCase());
	        System.out.println("Lowercase: " + s2.toLowerCase());

	        // 7. Whitespace Handling
	        String messy = "   Trim me   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String joined = s1.concat(" ").concat(s2);
	        System.out.println("Concatenated string: " + joined);

	        // 9. String Splitting
	        String fruits = "apple,banana,grapes";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("Split fruits: " + Arrays.toString(fruitArray));

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("AIET");
	        sb.append(" is an Engineering College");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Sahana";
	        int age = 21;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        String email = "student@aiet.edu";
	        boolean isValidEmail = email.contains("@") && email.contains(".") &&
	                               email.startsWith("student") && email.endsWith(".edu");

	        System.out.println("Email: " + email);
	        System.out.println("Is email valid? " + isValidEmail);
	    }
	}


