package org.example.exercices.Stationery;

public class Pen extends UnitArticle{

    private String color;

    public Pen(String reference, String label, Float unitPrice, String color) {
        super(reference, label, unitPrice);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                '}';
    }
}
