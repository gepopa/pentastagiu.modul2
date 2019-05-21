import java.util.Scanner;

public class areaUnuiDreptunghi {

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");
        double a = input.nextDouble();
        System.out.println("Enter the breadth:");
        double b = input.nextDouble();


        double  area = a*b;
        System.out.println("Area of Rectangle is: " + area);
        double  perimeter = (a * 2)+(b * 2);
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }

}
