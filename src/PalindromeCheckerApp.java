/**
 * ============================================================================
 * MASTER CLASS - PalindromeCheckerApp
 * ============================================================================
 * @version 3.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        displayWelcomeMessage();

        // UC2: Check Hardcoded Palindrome
        checkHardcodedPalindrome();

        // UC3: Check Palindrome using String Reverse
        checkPalindromeWithReverse();
    }

    public static void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("      === Palindrome Checker App ===          ");
        System.out.println("==============================================");
        System.out.println("Version: 3.0");
        System.out.println("----------------------------------------------");
    }

    public static void checkHardcodedPalindrome() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println("UC2 Result: The word is a Palindrome.");
        }
    }

    /**
     * UC3: Palindrome Check Using String Reverse
     * Demonstrates reversal logic using a for-loop and string concatenation.
     */
    public static void checkPalindromeWithReverse() {
        String original = "radar";
        String reversed = "";

        // Key Concept: for-loop (Reverse Iteration)
        // Start from length - 1, end at index 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // Key Concept: String Concatenation (+)
            // Note: This creates a new String object in every iteration
            reversed += original.charAt(i);
        }

        System.out.println("\nUC3 Original String: " + original);
        System.out.println("UC3 Reversed String: " + reversed);

        // Key Concept: equals() Method
        // Always use .equals() for content, never == for Strings
        if (original.equals(reversed)) {
            System.out.println("Status: It is a Palindrome!");
        } else {
            System.out.println("Status: It is NOT a Palindrome.");
        }
    }
}