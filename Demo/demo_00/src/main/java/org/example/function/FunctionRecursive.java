package org.example.function;

public class FunctionRecursive {

    public static int multiplication(int a, int b){

        if (b==0){
            return 0;
        }
        int produit = a + multiplication(a, b-1);
        System.out.println(produit);
        return produit;
    }

    public static void display(){
        System.out.println(multiplication(3, 10));
    }
}
