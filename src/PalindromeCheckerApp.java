import java.util.Stack;

/**
 * ============================================================================
 * MASTER CLASS - PalindromeCheckerApp
 * ============================================================================
 * @version 5.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeWithReverse();

        // UC4
        checkPalindromeWithCharArray();

        // UC5
        checkPalindromeWithStack();
    }

    public static void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("      === Palindrome Checker App ===          ");
        System.out.println("==============================================");
        System.out.println("Version: 5.0");
        System.out.println("----------------------------------------------");
    }

    // --- UC2: Hardcoded Logic ---
    public static void checkHardcodedPalindrome() {
        String word = "madam";
        if (word.equals("madam")) {
            System.out.println("UC2 Result: 'madam' is a Palindrome.");
        }
    }

    // --- UC3: String Reversal Logic ---
    public static void checkPalindromeWithReverse() {
        String original = "radar";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("UC3 Status: " + (original.equals(reversed) ? "Palindrome" : "Not Palindrome"));
    }

    // --- UC4: Two-Pointer Char Array Logic ---
    public static void checkPalindromeWithCharArray() {
        String input = "level";
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("UC4 Status: " + (isPalindrome ? "Palindrome" : "Not Palindrome"));
    }

    // --- UC5: Stack-Based Logic ---
    public static void checkPalindromeWithStack() {
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("UC5 Status: " + (input.equals(reversed) ? "Palindrome" : "Not Palindrome"));
    }
}