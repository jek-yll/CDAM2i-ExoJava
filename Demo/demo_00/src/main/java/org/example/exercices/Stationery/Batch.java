package org.example.exercices.Stationery;

public class Batch extends Article{

    private Article article;
    private Integer quantity;
    private Float discount;

    public Batch( String reference, UnitArticle article, Integer quantity, Float discount) {
        super(reference);
        this.article = article;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getTotalPriceBatch(){
        return quantity * article.getUnitPrice();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Batch{" +
                "article=" + article +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
