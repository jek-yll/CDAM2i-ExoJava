package org.example.exercices.Stationery;

import java.time.LocalDate;

public class Demo {

    public static void main(String[] args) {
        Paper paper1 = new Paper( "pap01","ramettes de 50", 5.50F, 80F);
        Paper paper2 = new Paper("pap02","ramettes de 100", 7.50F, 120F);
        Paper paper3 = new Paper("pap03", "ramettes de 250", 10F, 125F);

        Pen pen1 = new Pen("sty01","Stylo vert", 2.50F, "rouge");
        Pen pen2 = new Pen("sty02","Stylo rouge", 2.50F, "vert");

        Batch batch1 = new Batch("lotpap1",paper1,20,25F);
        System.out.println();

        Client client = new Client("Jean");

        System.out.println("Affichage d'un article");
        System.out.println(Article.getArticleToBdd("lotpap1"));

        Invoice invoice1 = new Invoice(client, LocalDate.now());
        invoice1.addLine("pap01", 3);
        invoice1.addLine("sty02", 2);
        invoice1.addLine("lotpap1", 1);

        System.out.println(invoice1.displayPurchase());
        System.out.println(invoice1.getTotalPrice());
    }

}
