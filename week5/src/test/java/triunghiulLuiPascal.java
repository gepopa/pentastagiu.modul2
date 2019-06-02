//2.Triunghiul lui Pascal
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//1 6 15 20 15 6 1
//...
//Sa se scrie regula de formare a numerelor
import java.util.Scanner;

public class triunghiulLuiPascal {


        public static void print(int n) {
            int[] previousRow;
            int[] currentRow = {1};
            printArray(currentRow);
            previousRow = currentRow;
            for (int i = 2; i <= n; i++) {
                currentRow = new int[i];
                currentRow[0] = 1;
                currentRow[i - 1] = 1;
                for (int j = 0; j <= i - 3; j++) {
                    currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
                }
                printArray(currentRow);
                previousRow = currentRow;
            }
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the row size: ");
            int row = scanner.nextInt();
            print(row);
        }

}
