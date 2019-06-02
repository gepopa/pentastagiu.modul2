//suma a 2 cele mai mari numere din vector

import java.util.Arrays;


public class sumaA2NumereDintrunVector {


    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808};
        int[] arr2 = new int[arr.length - 1];

        int maxVal1 = Arrays.stream(arr).max().getAsInt();


        for (int i = 0; i < arr2.length; i++)

            if (arr[i] != maxVal1) {
                arr2[i] = (arr[i]);
            }

        int maxVal2 = Arrays.stream(arr2).max().getAsInt();
        System.out.println("Primul cel mai mare numar din vector este: " + maxVal1);
        System.out.println("Al doilea cel mai mare numar din vector este: " + maxVal2);


        System.out.println(maxVal1 + " + " + maxVal2 + " = " + (maxVal1 + maxVal2));
    }


}
