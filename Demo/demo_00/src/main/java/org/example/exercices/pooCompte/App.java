package org.example.exercices.pooCompte;

public class App {

    public static void main(String[] args) {
//        CompteSimple c1 = new CompteSimple(1000, -100);
//        System.out.println(c1);
//        System.out.println("après retrait de 150");
//        c1.retrait(150);
//        System.out.println(c1);
//        System.out.println("apres retrait de 500");
//        c1.retrait(500);
//        System.out.println(c1);
//        System.out.println("apres versement de 350");
//        c1.retrait(350);
//        System.out.println(c1);
//        System.out.println("apres retrait de 50");
//        c1.retrait(50);
//        System.out.println(c1);
//
//        c1.versement(500);
//        System.out.println(c1);
//
//        c1.retrait(510);
//        System.out.println(c1);
//
//        c1.retrait(40);
//        System.out.println(c1);
//
//        c1.retrait(39);
//        System.out.println(c1);


//        CompteEpargne c2 = new CompteEpargne(1000, 0.075f);
//        System.out.println(c2);
//        System.out.println("c2 après 1 an");
//        c2.setSoldeAfterOneYear();
//        System.out.println(c2);

        ComptePayants c3 = new ComptePayants(1000);
        System.out.println(c3);
        System.out.println("c3 apres versement de 10€");
        c3.versement(10);
        System.out.println(c3);
        System.out.println("c3 apres retrait de 100€");
        c3.retrait(100);
        System.out.println(c3);


    }




}
