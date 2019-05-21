import java.util.Scanner;

public class reverseString {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter string to reverse:");

        String string = read.nextLine();

        StringBuilder stringBuilder = new StringBuilder(string);

        System.out.println("Reversed string is:");
        System.out.println(stringBuilder.reverse().toString());
    }
}
