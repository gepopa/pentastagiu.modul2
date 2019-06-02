//1.Se cere afisarea primele K matrici ale unui Latin Square pentru un N dat.
// Def: Un Latin Square este o matrice NxN, sau un array cu 2 dimensiuni NxN.
// Fiecare camp al matricei este un element dintr-un set de simboluri indeplinind conditia
// ca nu se intalneste acelasi element pe acelasi rand sau aceasi coloana.
// Ex: A B C / B C A / C A B.

public class latinSquare {

    public static void main(String[] args) {
        int n = 33;
        int k = n + 1;

        for (int z = 0; n <= k; z++) {

            for (int i = 0; i <= n; i++) {
                // System.out.print(i);

                int v = k;

                while (v <= n) {
                    System.out.print(v + " ");
                    v++;
                }

                for (int j = 0; j < k; j++)
                    System.out.print(j + " ");
                k--;
                System.out.println();
            }

        }
    }
}
