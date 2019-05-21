import java.util.Scanner;

public class areaUnuiPatrat {

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");

        double a = input.nextDouble();
        double  area = a*a;
        double  perimeter = a * 4;

        System.out.println("Area of Square is: " + area);
        System.out.println("Perimeter of Square is: " + perimeter);
    }

}
