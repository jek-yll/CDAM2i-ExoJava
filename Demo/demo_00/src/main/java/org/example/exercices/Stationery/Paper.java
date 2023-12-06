package org.example.exercices.Stationery;

public class Paper extends UnitArticle{

    private Float weight;
    public Paper(String reference, String label, Float unitPrice, Float weight) {
        super(reference, label, unitPrice);
        this.weight = weight;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Paper{" +
                "weight=" + weight +
                '}';
    }
}
