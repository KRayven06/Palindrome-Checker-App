/**
 * ============================================================================
 * MASTER CLASS - PalindromeCheckerApp
 * ============================================================================
 * @version 2.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        displayWelcomeMessage();

        // UC2: Check Hardcoded Palindrome
        checkHardcodedPalindrome();
    }

    /**
     * UC1: Application Entry & Welcome Message
     */
    public static void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("      === Palindrome Checker App ===          ");
        System.out.println("==============================================");
        System.out.println("Version: 2.0");
        System.out.println("----------------------------------------------");
    }

    /**
     * UC2: Print a Hardcoded Palindrome Result
     * Uses a String literal and conditional logic to verify a palindrome.
     */
    public static void checkHardcodedPalindrome() {
        // Key Concept: String Literal
        String word = "madam";

        System.out.println("Hardcoded String: " + word);

        // Key Concept: Simple logic for UC2 (Hardcoded evaluation)
        // In this case, we know 'madam' is a palindrome.
        if (word.equals("madam")) {
            System.out.println("Result: The word is a Palindrome.");
        } else {
            System.out.println("Result: The word is NOT a Palindrome.");
        }
    }
}