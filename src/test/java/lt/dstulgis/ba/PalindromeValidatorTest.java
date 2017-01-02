package lt.dstulgis.ba;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeValidatorTest {

	private PalindromeValidator palindromeValidator;
	
	@Before
	public void onSetup() {
		palindromeValidator = new PalindromeValidator();
	}
	
	@Test
	public void shouldPassValidation() {
		String number = "12321";
		String oddWord = "asdfdsa";
		String evenWord = "asddsa";
		String lettersAndNumbers = "12asa21";
		
		assertTrue("Should accept numbers as palindrome.", palindromeValidator.validate(number));
		assertTrue("Should accept letters of odd length as palindrome.", palindromeValidator.validate(oddWord));
		assertTrue("Should accept letters of even length as palindrome.", palindromeValidator.validate(evenWord));
		assertTrue("Should accept letters and numbers as palindrome.", palindromeValidator.validate(lettersAndNumbers));
	}
	
	@Test
	public void shouldFailValidation() {
		String badNumber = "12321";
		String badWord = "asdfdsa";
		String badLettersAndNumbers = "12asa21";
		String badText = "This is not palindrome. Is it?";
		
		assertFalse("Should not accept bad numbers as palindrome.", palindromeValidator.validate(badNumber));
		assertFalse("Should not accept bad letters as palindrome.", palindromeValidator.validate(badWord));
		assertFalse("Should not accept bad letters and numbers as palindrome.", palindromeValidator.validate(badLettersAndNumbers));
		assertFalse("Should not accept bad text as palindrome.", palindromeValidator.validate(badText));
	}
	
	@Test
	public void shouldIgnoreLettersCase() {
		String word = "AsDfdSa";
		
		assertTrue("Should ignore letters case.", palindromeValidator.validate(word));
	}
	
	@Test
	public void shouldIgnoreNonAlphanumericCharacters() {
		String text = "A man, a plan, a canal - Panama!";
		
		assertTrue("Should ignore non-alphanumeric characters.", palindromeValidator.validate(text));
	}
}
