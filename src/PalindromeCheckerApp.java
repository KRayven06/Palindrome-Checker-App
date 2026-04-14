import java.util.Scanner;

/**
 * ============================================================================
 * MASTER CLASS - PalindromeCheckerApp
 * ============================================================================
 * This is the single source file for all Use Cases.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        displayWelcomeMessage();

        // UC2: Capture Input
        String input = captureInput();

        System.out.println("\n----------------------------------------------");
        System.out.println("Final Output: You entered '" + input + "'");
        System.out.println("Status: Ready for Palindrome analysis.");
    }

    // UC1: Welcome Message Logic
    public static void displayWelcomeMessage() {
        System.out.println("==============================================");
        System.out.println("      === Palindrome Checker App ===          ");
        System.out.println("==============================================");
        System.out.println("Version: 2.0");
        System.out.println("----------------------------------------------");
    }

    // UC2: User Input Logic
    public static String captureInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase to check: ");
        return scanner.nextLine();
    }
}