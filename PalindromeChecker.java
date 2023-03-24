import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inputString = scanner.nextLine();

        // Create a stack to store the characters of the string
        Stack<Character> charStack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }

        // Reconstruct the string in reverse order by popping characters from the stack
        StringBuilder reversedString = new StringBuilder();
        while (!charStack.empty()) {
            reversedString.append(charStack.pop());
        }

        // Check if the original string and the reversed string are the same
        if (inputString.equalsIgnoreCase(reversedString.toString())) {
            System.out.println("THAT IS A PALINDROME!");
        } else {
            System.out.println("NOT A PALINDROME!");
        }
    }
}