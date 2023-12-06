package org.example.exercices.Stationery;

public class UnitArticle extends Article{

    private String label;
    private Float unitPrice;

    public UnitArticle(String reference, String label, Float unitPrice) {
        super(reference);
        this.label = label;
        this.unitPrice = unitPrice;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "UnitArticle{" +
                "label='" + label + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
