package org.example.array;

public class Array {

    public static void getArray() {
        int[] tab = {2,5,6};
        int tab2[];
        tab2 = new int[10];

        String[] tab3 = new String[5];

        int[][] matrice = {{1,5,9},{2,3,7},{4,89,1}};

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+5;
            System.out.println("Valeur dans mon tableau : " + tab[i] + " a la position : " + i );
        }
    }
}
