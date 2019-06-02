//3.Sa se afiseze intervalul cu suma maxima a 2 celor mai mari nr dintr-un vector dat.


import java.util.Arrays;

public class intervalulDintreCeleMaiMari2Numere {

    public static void main(String[] args) {
        int arr[] = {10, 9808, 45, 10, 90, 324};
        int[] arr2 = new int[arr.length - 1];

        int index1 = 0;
        int index2 = 0;

        int x = 0;
        int maxVal1 = Arrays.stream(arr).max().getAsInt();


        for (int i = 0; i < arr.length; i++) {

            if (maxVal1 == arr[i]) {
                index1 = i;
                System.out.println("Index 1 = " + index1);


            }

        }


        for (int j = 0; j < arr2.length; j++) {

            if (arr[j] != maxVal1) {
                arr2[j] = (arr[j]);
            }
        }
        int maxVal2 = Arrays.stream(arr2).max().getAsInt();
        for (int k = 0; k < arr2.length; k++) {
            if (maxVal2 == arr[k]) {
                index2 = k;
                System.out.println("Index 2 = " + index2);

            }
        }

        if (index1 == index2) {

            System.out.println("Nimic de adunat");
        }
        if (index1 > index2) {

            for (int l = index1 - 1; l > index2; l--) {

                x = x + arr[l];

            }
            System.out.println(x);
        }

        if (index1 < index2) {

            for (int m = index2; m > index1; m--) {

                x = x + arr[m];

            }
            System.out.println(x);
        }
    }

}