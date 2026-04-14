/**
 * ============================================================================
 * MASTER CLASS - PalindromeCheckerApp
 * ============================================================================
 * @version 4.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();

        // UC2: Hardcoded Check
        checkHardcodedPalindrome();

        // UC3: String Reverse
        checkPalindromeWithReverse();

        // UC4: Two-Pointer Character Array Check
        checkPalindromeWithCharArray();
    }

    public static void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("      === Palindrome Checker App ===          ");
        System.out.println("==============================================");
        System.out.println("Version: 4.0");
        System.out.println("----------------------------------------------");
    }

    public static void checkHardcodedPalindrome() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println("UC2 Result: The word is a Palindrome.");
        }
    }

    public static void checkPalindromeWithReverse() {
        String original = "radar";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("UC3 Status: " + (original.equals(reversed) ? "Palindrome" : "Not Palindrome"));
    }

    /**
     * UC4: Character Array Based Palindrome Check
     * Uses the two-pointer technique to compare characters efficiently.
     */
    public static void checkPalindromeWithCharArray() {
        String input = "level";

        // Key Concept: Character Array (char[])
        char[] charArray = input.toCharArray();

        // Key Concept: Two-Pointer Technique
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        System.out.println("\nUC4 Input: " + input);

        while (left < right) {
            // Key Concept: Array Indexing
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: '" + input + "' is a Palindrome (Efficiently Checked).");
        } else {
            System.out.println("UC4 Result: '" + input + "' is NOT a Palindrome.");
        }
    }
}