import java.util.Scanner;
import java.util.Stack;

public class StackExerciseFinal {

    public static void main(String[] args) {

        Stack stack = new Stack();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string to check:");

        String string = input.nextLine();

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                counter++;
        }

        System.out.println("The string has " + counter + " letters.");

        for (int i = 0; i <= (counter - 1) ; i++) {
            char c = string.charAt(i);
            stack.push(c);

        }

        System.out.print(stack + "\n");

        for (int i = -1; i < (counter - 2) ; i++) {
            stack.pop();
            System.out.print(stack.peek());

        }

    }
}
