package testString;

public class StringOperations {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = "";
		string3 = "How are you? ".concat(string2);
		
		System.out.println("string 3: " + string3);
		System.out.println("Length : " + string1.length());
		System.out.println("Sub: " + string3.substring(0,5));
		System.out.println("Upper: " + string3.toUpperCase());
	}
}
