//Write a Java program to check if a positive number is a palindrome or not


import java.util.Scanner;

public class exercise7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter string to check:");

        String string = read.nextLine();

        System.out.println(string.equals(new StringBuilder(string).reverse().toString()));

    }
}
