import java.util.Stack;

public class StackExerciseV2 {


    public static void main(String[] args) {

        Stack stack = new Stack();
        String string = "Incomprehensibilities";



        for (int i = 0; i <= 20 ; i++) {
            char c = string.charAt(i);
            stack.push(c);

        }

        System.out.print(stack + "\n");

        for (int i = -1; i < 19 ; i++) {
            stack.pop();
            System.out.print(stack.peek());

        }

    }
}

