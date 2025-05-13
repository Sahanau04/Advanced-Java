package Stringhandlingfunction;
import java.util.Arrays;

public class StringOperationsDemo {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "Hello";
	        System.out.println("str1 equals str3? " + str1.equals(str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
	        System.out.println("str1 equalsIgnoreCase(\"hello\")? " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String sentence = "Java is powerful and Java is fun.";
	        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
	        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));
	        System.out.println("Contains 'powerful'? " + sentence.contains("powerful"));

	        // 5. Substring Operations
	        System.out.println("Substring (0 to 4) from str1: " + str1.substring(0, 4));

	        // 6. String Modification
	        String replaced = sentence.replace("Java", "Python");
	        System.out.println("After replace: " + replaced);
	        System.out.println("To Uppercase: " + str1.toUpperCase());
	        System.out.println("To Lowercase: " + str2.toLowerCase());

	        // 7. Whitespace Handling
	        String messy = "   Trim me   ";
	        System.out.println("Before trim: '" + messy + "'");
	        System.out.println("After trim: '" + messy.trim() + "'");

	        // 8. String Concatenation
	        String concatenated = str1 + " " + str2;
	        System.out.println("Concatenated String: " + concatenated);

	        // 9. String Splitting
	        String csv = "apple,banana,orange";
	        String[] fruits = csv.split(",");
	        System.out.println("Split fruits: " + Arrays.toString(fruits));

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Start");
	        sb.append(" Middle");
	        sb.append(" End");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "John";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "user@example.com";
	        boolean isValid = email.contains("@") &&
	                          email.contains(".") &&
	                          email.startsWith("user") &&
	                          email.endsWith(".com");
	        System.out.println("Is email valid? " + isValid);
	    }
	}

