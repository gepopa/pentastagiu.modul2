//Use a queue to find out if a string is a palindrome
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class QueExercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("String to check:");
        String string = input.nextLine();

        Stack stack = new Stack();
        Queue queue = new LinkedList();

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        for (int i = 0; i < string.length(); i++) {
            queue.add(string.charAt(i));
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }

}
