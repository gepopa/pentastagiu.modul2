
import java.util.Scanner;
public class areaUnuiHexagon {



    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");

        double a = input.nextDouble();
        double  area = (((3*Math.sqrt(3))/2)*a*a);
        double  perimeter = a * 6;

        System.out.println("Area of Hexagon is: " + area);
        System.out.println("Perimeter of Hexagon is: " + perimeter);
    }

}
