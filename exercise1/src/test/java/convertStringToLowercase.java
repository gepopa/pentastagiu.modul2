
import java.util.Scanner;

public class convertStringToLowercase {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert a capital string:");
        String string = input.nextLine();

        System.out.print("Same string lowercase: \n");
        System.out.println(string.toLowerCase());
    }
}
