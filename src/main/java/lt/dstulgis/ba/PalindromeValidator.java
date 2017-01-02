package lt.dstulgis.ba;

/**
 * Validator class for checking if given text is palindrome.
 * 
 * @author dstulgis
 */
public class PalindromeValidator {

	/**
	 * Validates given text if it is a palindrome ignoring non-alphanumeric characters.
	 * 
	 * @param text to be validated
	 * @return {@code true} or {@code false} if validation passes or fails
	 */
	public boolean validate(String text) {
		String plainText = text.replaceAll("\\W", "");
		String reverseText = new StringBuilder(plainText).reverse().toString();
		return plainText.equalsIgnoreCase(reverseText);
	}
}
