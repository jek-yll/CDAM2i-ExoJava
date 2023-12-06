package org.example.exercices.Stationery;


import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {

    private static Integer count = 0;

    private static Integer line = 1;
    private Integer nbLine ;
    private Integer invoiceNumber;
    private Client client;
    private LocalDate date;
    private ArrayList<PurchaseLine> lines;

    public Invoice(Integer nbLine, Client client, LocalDate date) {
        this.invoiceNumber = ++count;
        this.nbLine = nbLine;
        this.client = client;
        this.date = date;
        this.lines = new ArrayList<>();
    }

    public Invoice( Client client, LocalDate date) {
        this.invoiceNumber = ++count;
        this.nbLine = 10;
        this.client = client;
        this.date = date;
        this.lines = new ArrayList<>();
    }

    public ArrayList<PurchaseLine> getLines() {
        return lines;
    }

    public void addLine(String refArticle, Integer quantity){
        PurchaseLine line = new PurchaseLine( Article.getArticleToBdd(refArticle), quantity);
        lines.add(line);
    }

    public Float getTotalPrice(){
        Float total = 0F;

        for (PurchaseLine l : lines) {
            total += l.getTotalLine();
        }

        return total;
    }

    public String displayPurchase(){
        String display = "";
        for (PurchaseLine l : lines) {
            display += '\n' + l.DisplayPurchaseLine();
        }
        return display;
    }
}
