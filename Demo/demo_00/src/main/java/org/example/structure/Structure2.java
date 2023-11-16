package org.example.structure;

public class Structure2 {

    public static void getBoucleFor(){

        int[] tab = {1,5,6};
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            System.out.println(" i = " + i + " , valeur tab " + tab[i]);
        }

        for (int i = 0, j = 10 ; i < j ; i++, j--) {
            System.out.println(" i : " + i + "; j : " + j);
        }

        for (int num : tab) {
            sum += num;
        }
        System.out.println("somme du tableau : " + sum );
    }

    public static void getWhile() {

        int i = 1;
        while (i<=5){
            System.out.println(" i : " + i);
            i++;
        }
    }

    public static void getBreakAndContinue() {
        System.out.println(" ---------- Continue ------------- ");
        for (int i = 0; i < 5; i++) {
            if(i%2==0){
                System.out.println("ça continue");
                continue;
            }
            System.out.println("counter " + i);
        }

        System.out.println("\n---------- Break -------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3){
                    break;
                }
                System.out.println("j : " + j);
            }
            System.out.println("i : " + i +"\n");
        }
    }
}
